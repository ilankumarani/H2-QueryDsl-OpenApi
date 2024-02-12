package com.ilan.h2.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static org.springdoc.core.utils.Constants.ALL_PATTERN;

@Configuration
public class OpenApiConfig {

    @Value("${bezkoder.openapi.dev-url}")
    private String devUrl;

    @Value("${bezkoder.openapi.prod-url}")
    private String prodUrl;

    String[] blogPackagesToScan = {"com.ilan.h2.controller.blog"};

    @Bean
    public GroupedOpenApi blogApis() {
        return GroupedOpenApi.builder()
                .group("BLOG")
                //.pathsToExclude("/api/v1/**", "/v1/**")
                .addOpenApiCustomizer(openApiCustomizer)
                .packagesToScan(blogPackagesToScan)
                .pathsToMatch(ALL_PATTERN)
                .build();
    }

    String[] ownerPackagesToScan = {"com.ilan.h2.controller.owner"};
    @Bean
    public GroupedOpenApi ownerApis() {
        return GroupedOpenApi.builder()
                .group("OWNER")
                .packagesToScan(ownerPackagesToScan)
                .pathsToMatch(ALL_PATTERN)
                .build();
    }


    OpenApiCustomizer openApiCustomizer = openAPI ->{
        final String securitySchemeName = "bearerAuth";
        openAPI
                .servers(getServers())
                .addSecurityItem(new SecurityRequirement()
                        .addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                                .name(securitySchemeName)
                                .in(SecurityScheme.In.HEADER)
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")))
                .info(getInfo());

    };


    @ConditionalOnProperty(prefix = "springdoc", name = "security.enabled", havingValue= "true", matchIfMissing = false)
    @Bean
    public OpenAPI customizeOpenAPI() {
        final String securitySchemeName = "bearerAuth";
        return new OpenAPI()
                .servers(getServers())
                .addSecurityItem(new SecurityRequirement()
                        .addList(securitySchemeName))
                .components(new Components()
                        .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                                .name(securitySchemeName)
                                .in(SecurityScheme.In.HEADER)
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));
    }


    @ConditionalOnProperty(prefix = "springdoc", name = "security.enabled", havingValue= "false", matchIfMissing = false)
    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(this.getInfo())
                .servers(getServers());
    }

    private Info getInfo() {
        return new Info()
                .title("Tutorial Management API")
                .version("1.0")
                .contact(this.getContact())
                .description("This API exposes endpoints to manage tutorials.")
                .termsOfService("https://www.bezkoder.com/terms")
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

    public List<Server> getServers(){
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Development environment");

        Server prodServer = new Server();
        prodServer.setUrl(prodUrl);
        prodServer.setDescription("Server URL in Production environment");

        return List.of(devServer, prodServer);
    }
}
