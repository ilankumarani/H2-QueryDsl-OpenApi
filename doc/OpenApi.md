#### JWT Authentication for all API's in the Application, then create below bean as such

```java
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
```

#### We can enable JWT Authentication for Group of API inside the java package 

```java
String[] ownerPackagesToScan = {"com.ilan.h2.controller.owner"};

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
```

#### NO JWT Authentication for all API's in the Application, then create below bean as such

```java
@Bean
public OpenAPI myOpenAPI() {
    return new OpenAPI()
            .info(getInfo())
            .servers(getServers());
}
```

