#### Syntax of Driver name and dialect 

```yaml
spring:
  datasource:
    # Driver class name will be always H2 Driver
    driverClassName: org.h2.Driver
  jpa:
    # Dialect will change with respective to Database
    database-platform: org.hibernate.dialect.OracleDialect
```

#### 1.1 Run Oracle syntax queries in H2

```yaml
spring:
  datasource:
    driverClassName: org.h2.Driver
    username: sa
    password: password
    url: jdbc:h2:mem:testdb;MODE=Oracle;INIT=RUNSCRIPT FROM 'classpath:h2/schema.sql'
  jpa:
    database-platform: org.hibernate.dialect.OracleDialect
```

#### 1.2 Run MySql syntax queries in H2

```yaml
spring:
  datasource:
    driverClassName: org.h2.Driver
    username: sa
    password: password
    url: jdbc:h2:mem:testdb;MODE=MySQL;INIT=RUNSCRIPT FROM 'classpath:h2/schema.sql'
  jpa:
    database-platform: org.hibernate.dialect.MySQLDialect
```

