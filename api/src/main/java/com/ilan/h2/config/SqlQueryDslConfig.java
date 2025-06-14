package com.ilan.h2.config;

import com.querydsl.sql.H2Templates;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.codegen.MetaDataExporter;
import com.querydsl.sql.codegen.MetadataExporterConfigImpl;
import com.querydsl.sql.spring.SpringConnectionProvider;
import com.querydsl.sql.spring.SpringExceptionTranslator;
import com.querydsl.sql.types.LocalDateTimeType;
import com.querydsl.sql.types.LocalDateType;
import io.github.openfeign.querydsl.sql.json.types.JSONType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class SqlQueryDslConfig {


    @Bean
    public com.querydsl.sql.Configuration querydslConfiguration() {
        SQLTemplates templates = H2Templates.builder()
                .printSchema() // to include the schema in the output
                //.quote()       // to quote names
                .newLineToSingleSpace() // to replace new lines with single space in the output
                //.escape(ch)    // to set the escape char
                .build();
        com.querydsl.sql.Configuration configuration = new com.querydsl.sql.Configuration (templates);
        configuration.setExceptionTranslator (new SpringExceptionTranslator());
        configuration.register(new LocalDateTimeType());
        configuration.register(new LocalDateType());
        configuration.register(new JSONType());
        configuration.setUseLiterals(Boolean.TRUE);
        return configuration;
    }


    @Bean
    public SQLQueryFactory sqlQueryFactory(DataSource dataSource, com.querydsl.sql.Configuration configuration) {
        SpringConnectionProvider provider = new SpringConnectionProvider(dataSource);
        //return new SQLQueryFactory(configuration, provider);
        return new SQLQueryFactory(configuration, new TransactionAwareDataSourceProxy(dataSource));
    }


    @ConditionalOnProperty(prefix = "sqlQueryDsl", name = "generate", havingValue = "true")
    @Bean
    public CommandLineRunner sqlQueryDslGenerator(DataSource dataSource) {
        return args -> {
            ClassLoader classLoader = this.getClass().getClassLoader();
            System.out.println(classLoader.getDefinedPackages());
            java.sql.Connection conn = dataSource.getConnection();
            MetadataExporterConfigImpl metadataExporterConfig = getMetadataExporterConfig();
            MetaDataExporter exporter = new MetaDataExporter(metadataExporterConfig);
            exporter.export(conn.getMetaData());
        };
    }

    private static MetadataExporterConfigImpl getMetadataExporterConfig() {
        MetadataExporterConfigImpl metadataExporterConfig = new MetadataExporterConfigImpl();
        metadataExporterConfig.setPackageName("com.querydsl.sql.generated");
        metadataExporterConfig.setNamePrefix("S");
        metadataExporterConfig.setExportAll(Boolean.FALSE);
        metadataExporterConfig.setExportTables(Boolean.TRUE);
        metadataExporterConfig.setSchemaToPackage(Boolean.TRUE);
        metadataExporterConfig.setTargetFolder(new File(getSrcMainPath().toUri()));
        return metadataExporterConfig;
    }

    public static Path getSrcMainPath() {
        String userDir = System.getProperty("user.dir");
        Path srcMain = Paths.get(userDir, "api", "src", "main", "java");
        return srcMain;
    }
}
