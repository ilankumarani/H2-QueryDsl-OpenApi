#### Generating Qclass for entity

```xml
<plugin>
    <groupId>com.mysema.maven</groupId>
    <artifactId>apt-maven-plugin</artifactId>
    <version>${apt-maven-plugin.version}</version>
    <executions>

        <!-- For Entities that are in src/main/java folder-->
        <execution>
            <id>Qgenerate-source-entities</id>
            <phase>generate-sources</phase>
            <goals>
                <goal>process</goal>
            </goals>
            <configuration>
                <outputDirectory>${project.build.directory}/generated-sources</outputDirectory>
                <processor>com.querydsl.apt.jpa.JPAAnnotationProcessor</processor>
            </configuration>
        </execution>
        
        <!-- For Entities that are in src/test/java folder-->
        <execution>
            <id>Qgenerate-test-entities</id>
            <phase>generate-test-sources</phase>
            <goals>
                <goal>test-process</goal>
            </goals>
            <configuration>
                <outputDirectory>${project.build.directory}/generated-test-sources</outputDirectory>
                <processor>com.querydsl.apt.jpa.JPAAnnotationProcessor</processor>
            </configuration>
        </execution>
    </executions>
    <dependencies>
        <dependency>
            <groupId>io.github.openfeign.querydsl</groupId>
            <artifactId>querydsl-core</artifactId>
            <version>${openfeign.querydsl.version}</version>
        </dependency>
        <dependency>
            <groupId>io.github.openfeign.querydsl</groupId>
            <artifactId>querydsl-jpa</artifactId>
            <version>${openfeign.querydsl.version}</version>
        </dependency>
        <dependency>
            <groupId>io.github.openfeign.querydsl</groupId>
            <artifactId>querydsl-apt</artifactId>
            <version>${openfeign.querydsl.version}</version>
        </dependency>
    </dependencies>
</plugin>
```