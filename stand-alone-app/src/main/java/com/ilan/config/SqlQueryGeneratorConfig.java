package com.ilan.config;

import com.querydsl.sql.codegen.MetaDataExporter;
import com.querydsl.sql.codegen.MetadataExporterConfigImpl;
import lombok.SneakyThrows;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.sql.DataSource;
import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Path;
import java.nio.file.Paths;

@DependsOn("dbConfig")
@Configuration
public class SqlQueryGeneratorConfig {

    @Bean
    public CommandLineRunner sqlQueryDslGenerator(DataSource dataSource) {
        return args -> {
            java.sql.Connection conn = dataSource.getConnection();
            MetadataExporterConfigImpl metadataExporterConfig = getMetadataExporterConfig();
            MetaDataExporter exporter = new MetaDataExporter(metadataExporterConfig);
            //exporter.export(conn.getMetaData());
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

    @SneakyThrows
    public static Path getSrcMainPath() {
        URL resourceUrl = SqlQueryGeneratorConfig.class.getResource("");
        Path resourcePath = Paths.get(resourceUrl.toURI());
        Path absolutePath = resourcePath.toAbsolutePath();
        String pathWithOutTarget = absolutePath.toString().replaceFirst("target\\.*", "");

        System.out.println("absolutePath >>>>"+absolutePath.toString());


        Path srcMain = Paths.get(pathWithOutTarget.toString(), "src", "main", "java");
        System.out.println(srcMain.toString());
        return srcMain;
    }
}
