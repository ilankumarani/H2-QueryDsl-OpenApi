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
      schema-locations: classpath:scripts/schema.sql, classpath*:scripts/ddl.sql
      data-locations: classpath*:scripts/data*.sql
```

# Open API configuration