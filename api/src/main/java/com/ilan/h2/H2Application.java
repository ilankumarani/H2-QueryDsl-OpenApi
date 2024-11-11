package com.ilan.h2;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;
import com.ilan.h2.service.BlogRepositoryService;
import com.ilan.h2.service.DataLoad;
import com.querydsl.codegen.GenericExporter;
import com.querydsl.codegen.Keywords;
import com.querydsl.sql.codegen.MetaDataExporter;
import com.querydsl.sql.SQLTemplatesRegistry;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Transient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
@RequiredArgsConstructor
public class H2Application {

    private final DataSource dataSource;
    private final BlogRepository blogRepository;
    private final OwnerRepository ownerRepository;
    private final BlogRepositoryService blogRepositoryService;

    public static void main(String[] args) {

        SpringApplication.run(H2Application.class, args);
    }


    @Bean
    public CommandLineRunner dataLoad() {
        return args -> {
            DataLoad.insertData(ownerRepository, blogRepository);
        };
    }


    @Bean
    public CommandLineRunner sqlQueryDsl() {
        return args -> {
            ClassLoader classLoader = this.getClass().getClassLoader();
            System.out.println(classLoader.getDefinedPackages());
            java.sql.Connection conn = dataSource.getConnection();
            MetaDataExporter exporter = new MetaDataExporter();
            exporter.setPackageName("com.myproject.mydomain");
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
