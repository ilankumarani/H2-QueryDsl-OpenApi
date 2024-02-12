package com.ilan.h2.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

import java.util.List;

import static org.springdoc.core.utils.Constants.ALL_PATTERN;

@Configuration
public class OpenApiConfig {

    @Value("${bezkoder.openapi.dev-url}")
    private String devUrl;

    @Value("${bezkoder.openapi.prod-url}")
    private String prodUrl;

    String[] packagesToScan = {"com.ilan.h2.controller"};
    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                .group("OWNER")
                //.pathsToExclude("/api/v1/**", "/v1/**")
                .packagesToScan(packagesToScan)
                .pathsToMatch(ALL_PATTERN)
                .build();
    }


    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Development environment");

        Server prodServer = new Server();
        prodServer.setUrl(prodUrl);
        prodServer.setDescription("Server URL in Production environment");

        return new OpenAPI()
                .info(this.getInfo())
                .servers(List.of(devServer, prodServer));
    }

    private Info getInfo() {

        return new Info()
                .title("Tutorial Management API")
                .version("1.0")
                .contact(this.getContact())
                .description("This API exposes endpoints to manage tutorials.").termsOfService("https://www.bezkoder.com/terms")
                .license(this.getLicense());
    }

    private Contact getContact() {
        return new Contact()
                .email("bezkoder@gmail.com")
                .name("BezKoder")
                .url("https://www.bezkoder.com");
    }

    private License getLicense() {
        return new License()
                .name("MIT License")
                .url("https://choosealicense.com/licenses/mit/");
    }
}
