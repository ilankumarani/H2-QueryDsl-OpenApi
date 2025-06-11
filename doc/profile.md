> **_NOTE:_**  Reference link.
> 
> https://docs.spring.io/spring-boot/reference/features/profiles.html
> 

#### 1.1 Auto append group of profiles when I use profile **local**

```yaml
spring:
  profiles:
    group:
      local:
        - aws
        - eks
```

#### 1.2 Append profile with Existing profiles

```yaml
spring:
  profiles:
    include: aws,eks
```

#### 1.3 Separate properties base on profile in application-dev.yml

```yaml
---

# Common configuration goes here

---

spring:
  config:
    activate:
      on-profile: mysql

# configuration related to mySql goes here

---

spring:
  config:
    activate:
      on-profile: oracle

# configuration related to Oracle goes here      

```