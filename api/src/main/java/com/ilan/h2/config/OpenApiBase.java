package com.ilan.h2.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.springdoc.core.utils.Constants.ALL_PATTERN;


public abstract class OpenApiBase {

    // Creating this bean as below we are authenticating all API's
    @ConditionalOnProperty(prefix = "springdoc", name = "security.enabled", havingValue = "true", matchIfMissing = true)
    @Bean
    public OpenAPI customizeOpenAPI() {
        final String securitySchemeName = "bearerAuth";
        return new OpenAPI()
                .info(getInfo())
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


    // Creating this bean as below we are NOT authenticating all API's
    @ConditionalOnProperty(prefix = "springdoc", name = "security.enabled", havingValue = "false", matchIfMissing = true)
    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(getInfo())
                .servers(getServers());
    }

    protected Info getInfo() {
        return new Info()
                .title("H2 and Query DSL")
                .version("1.0")
                .contact(this.getContact())
                .description("This API exposes endpoints to manage tutorials.")
                .termsOfService("https://www.google.com/terms")
                .license(this.getLicense());
    }

    private Contact getContact() {
        return new Contact()
                .email("ilankumaran@gmail.com")
                .name("ILANKUMARAN ILANGOVAN")
                .url("https://www.google.com");
    }

    private License getLicense() {
        return new License()
                .name("ILAN License")
                .url("https://choosealicense.com/licenses/mit/");
    }


    protected abstract List<Server> getServers();
}