package com.ilan;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainConsoleApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MainConsoleApplication.class);
        app.setBannerMode(Banner.Mode.LOG);
        app.run(args);
    }
}