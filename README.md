# H2 Configuration
## Allow Spring to create the table us

```yaml
spring:
  jpa:
    defer-datasource-initialization: false
    hibernate:
      ddl-auto: create-drop
```

## Disable the spring to create table and we do it manually

```yaml
spring:
  jpa:
    defer-datasource-initialization: true
    hibernate:
      ddl-auto: none
  sql:
    init:
      mode: always
      schema-locations: classpath:h2/schema.sql, classpath*:h2/ddl.sql
      data-locations: classpath*:h2/data*.sql
```

# Open API configuration