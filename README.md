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

## Logging to Bind sql parameter for query

```yaml
logging:
  level:
    org:
      hibernate:
        SQL: DEBUG
        stat: debug
        SQL_SLOW: info
        orm.jdbc.bind: TRACE #For prepared statements for JPA 6
        orm.jdbc.extract: TRACE #For prepared statements for JPA 6
        type.descriptor.sql.BasicBinder: TRACE #For prepared statements for JPA 5
      # Logging SQL Statements with JdbcTemplate
      springframework:
        jdbc:
          core:
            JdbcTemplate: DEBUG
            StatementCreatorUtils: TRACE
```


# Open API configuration