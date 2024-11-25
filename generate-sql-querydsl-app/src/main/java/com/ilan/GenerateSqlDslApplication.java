package com.ilan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GenerateSqlDslApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GenerateSqlDslApplication.class);
        app.setBannerMode(Banner.Mode.LOG);
        app.run(args);
        log.info("########## COMPLETED ##########");
    }
}