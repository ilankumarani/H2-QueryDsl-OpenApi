

#### Generating Class_ for entities

```xml
<plugin>
    <groupId>org.bsc.maven</groupId>
    <artifactId>maven-processor-plugin</artifactId>
    <version>${maven-processor-plugin.version}</version>
    <executions>

        <!-- For Entities that are in src/main/java folder-->
        <execution>
            <id>_Qgenerate-source-entities</id>
            <goals>
                <goal>process</goal>
            </goals>
            <phase>generate-sources</phase>
            <configuration>
                <!-- source output directory -->
                <outputDirectory>${project.build.directory}/generated-sources</outputDirectory>
                <processors>
                    <processor>lombok.launch.AnnotationProcessorHider$AnnotationProcessor</processor>
                    <!--<processor>org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor</processor>-->
                    <processor>org.hibernate.processor.HibernateProcessor</processor>
                </processors>
                <additionalSourceDirectories>
                    <additionalSourceDirectory>
                        ${project.build.directory}/generated-sources
                    </additionalSourceDirectory>
                </additionalSourceDirectories>
            </configuration>
        </execution>

        <!-- For Entities that are in src/test/java folder-->
        <execution>
            <id>_Qgenerate-test-entities</id>
            <goals>
                <goal>process-test</goal>
            </goals>
            <phase>generate-test-sources</phase>
            <configuration>
                <!-- source output directory -->
                <outputDirectory>${project.build.directory}/generated-test-sources
                </outputDirectory>
                <processors>
                    <processor>lombok.launch.AnnotationProcessorHider$AnnotationProcessor</processor>
                    <!-- Below Annotation processor is deprecated -->
                    <!--<processor>org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor</processor>-->
                    <processor>org.hibernate.processor.HibernateProcessor</processor>
                </processors>
                <additionalSourceDirectories>
                    <additionalSourceDirectory>
                        ${project.build.directory}/generated-sources
                    </additionalSourceDirectory>
                </additionalSourceDirectories>
            </configuration>
        </execution>
    </executions>
    <dependencies>
        <!-- Below hibernate-jpamodelgen moved to hibernate-processor -->
        <!--<dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-processor</artifactId>
            <version>${hibernate-proccesor.version}</version>
        </dependency>-->
        <dependency>
            <groupId>org.hibernate.orm</groupId>
            <artifactId>hibernate-jpamodelgen</artifactId>
            <version>${hibernate.version}</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>${lombok.version}</version>
        </dependency>
    </dependencies>
</plugin>
```