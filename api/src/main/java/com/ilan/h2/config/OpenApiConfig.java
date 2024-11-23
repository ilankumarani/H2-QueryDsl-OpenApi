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

@Configuration
@RequiredArgsConstructor
public class OpenApiConfig extends OpenApiBase{

    private final SpringDocUrl springDocUrl;

    String[] blogPackagesToScan = {"com.ilan.h2.controller.blog"};
    String[] ownerPackagesToScan = {"com.ilan.h2.controller.owner"};

    @Bean
    public GroupedOpenApi blogApis() {
        return GroupedOpenApi.builder()
                .group("BLOG")
                //.pathsToExclude("/api/v1/**", "/v1/**")
                .packagesToScan(blogPackagesToScan)
                .pathsToMatch(ALL_PATTERN)
                .build();
    }


    //Here we are authenticating API's for OWNER group
    @Bean
    public GroupedOpenApi ownerApis() {
        return GroupedOpenApi.builder()
                .group("OWNER")
                .addOpenApiCustomizer(openApiCustomizer)
                .packagesToScan(ownerPackagesToScan)
                .pathsToMatch(ALL_PATTERN)
                .build();
    }


    //Here we are authenticating API's for OWNER group
    OpenApiCustomizer openApiCustomizer = openAPI -> {
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


    public List<Server> getServers() {
        return springDocUrl
                .getBaseUrl()
                .entrySet()
                .stream()
                .map(entrySet -> {
                    Server server = new Server();
                    server.setUrl(entrySet.getValue());
                    server.setDescription(String.format("%s environment Base URL", entrySet.getKey()));
                    return server;
                }).collect(Collectors.toList());
    }


}


@Configuration
@ConfigurationProperties("springdoc")
@Data
class SpringDocUrl {
    private final Map<String, String> baseUrl = new HashMap<>();
}