#### 1.1 Allow Spring to create the table for us

```yaml
spring:
  jpa:
    defer-datasource-initialization: false
    hibernate:
      ddl-auto: create-drop
```

#### 1.2 Disable the spring to create table and we do it manually

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

#### 1.3 Logging to Bind sql parameter for query

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

#### 1.4 Show static of query execution time

```yaml
spring:
  jpa:
    properties:
      hibernate:
        generate_statistics: true
```

#### 1.4 Show slow running queries slow < 25 milliSec

```yaml
spring:
  jpa:
    properties:
      hibernate:
        session:
          events:
            log:
              LOG_QUERIES_SLOWER_THAN_MS: 25
```

#### 1.5 Select fetch size of JPA and Batch

```yaml
spring:
  jpa:
    properties:
      hibernate:
        jdbc:
          fetch_size: 10000
          batch_size: 10000
```

