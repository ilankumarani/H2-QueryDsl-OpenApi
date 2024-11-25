package com.ilan.config;

import com.querydsl.sql.codegen.MetaDataExporter;
import com.querydsl.sql.codegen.MetadataExporterConfigImpl;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
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
@Slf4j
public class SqlQueryGeneratorConfig {


    @Value("${sql.queryDsl.generate.directory}")
    private String generateDirectory;

    @Value("${sql.queryDsl.package.directory}")
    private String packageDirectory;

    @Bean
    public CommandLineRunner sqlQueryDslGenerator(DataSource dataSource) {
        return args -> {
            java.sql.Connection conn = dataSource.getConnection();
            MetadataExporterConfigImpl metadataExporterConfig = getMetadataExporterConfig();
            MetaDataExporter exporter = new MetaDataExporter(metadataExporterConfig);
            exporter.export(conn.getMetaData());
        };
    }

    private MetadataExporterConfigImpl getMetadataExporterConfig() {
        MetadataExporterConfigImpl metadataExporterConfig = new MetadataExporterConfigImpl();
        metadataExporterConfig.setPackageName(packageDirectory);
        metadataExporterConfig.setNamePrefix("S");
        metadataExporterConfig.setExportAll(Boolean.FALSE);
        metadataExporterConfig.setExportTables(Boolean.TRUE);
        metadataExporterConfig.setSchemaToPackage(Boolean.TRUE);
        metadataExporterConfig.setTargetFolder(new File(getSrcMainPath().toUri()));
        return metadataExporterConfig;
    }

    @SneakyThrows
    public Path getSrcMainPath() {
        URL resourceUrl = this.getClass().getResource("");
        Path resourcePath = Paths.get(resourceUrl.toURI());
        Path absolutePath = resourcePath.toAbsolutePath();
        String pathWithOutTarget = absolutePath.toString();

        if (pathWithOutTarget.contains("target")) {
            pathWithOutTarget = pathWithOutTarget.substring(0, pathWithOutTarget.indexOf("target") + 6);
        }

        Path srcMain = Paths.get(pathWithOutTarget.toString(), generateDirectory);
        log.info("Target Folder path :: {}", srcMain.toString());
        return srcMain;
    }
}
