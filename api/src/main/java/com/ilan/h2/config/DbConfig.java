package com.ilan.h2.config;

import com.querydsl.sql.H2Templates;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.codegen.MetaDataExporter;
import com.querydsl.sql.spring.SpringConnectionProvider;
import com.querydsl.sql.spring.SpringExceptionTranslator;
import com.querydsl.sql.types.DateTimeType;
import com.querydsl.sql.types.LocalDateType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.inject.Provider;
import javax.sql.DataSource;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;

@Configuration
public class DbConfig {


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
        configuration.setUseLiterals(Boolean.TRUE);
        return configuration;
    }


    @Bean
    public SQLQueryFactory queryFactory (DataSource dataSource, com.querydsl.sql.Configuration configuration) {
        SpringConnectionProvider provider = new SpringConnectionProvider(dataSource);
        SQLQueryFactory sqlQueryFactory = new SQLQueryFactory(configuration, provider);
        //SQLQueryFactory sqlQueryFactory = new SQLQueryFactory(configuration, dataSource);
        return sqlQueryFactory;
    }


    @ConditionalOnProperty(prefix = "sqlQueryDsl", name = "generate", havingValue = "true")
    @Bean
    public CommandLineRunner sqlQueryDslGenerator(DataSource dataSource) {
        return args -> {
            ClassLoader classLoader = this.getClass().getClassLoader();
            System.out.println(classLoader.getDefinedPackages());
            java.sql.Connection conn = dataSource.getConnection();
            MetaDataExporter exporter = new MetaDataExporter();
            exporter.setPackageName("com.sql.relation");
            exporter.setNamePrefix("S");
            exporter.setExportAll(Boolean.FALSE);
            exporter.setExportTables(Boolean.TRUE);
            exporter.setTargetFolder(new File(getSrcMainPath().toUri()));
            exporter.export(conn.getMetaData());
        };
    }

    public static Path getSrcMainPath() {
        String userDir = System.getProperty("user.dir");
        Path srcMain = Paths.get(userDir, "api", "src", "main", "java");
        return srcMain;
    }
}
