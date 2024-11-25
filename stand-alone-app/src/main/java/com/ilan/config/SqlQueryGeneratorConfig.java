package com.ilan.config;

import com.querydsl.sql.codegen.MetaDataExporter;
import com.querydsl.sql.codegen.MetadataExporterConfigImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.sql.DataSource;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

@DependsOn("dbConfig")
@Configuration
public class SqlQueryGeneratorConfig {

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
