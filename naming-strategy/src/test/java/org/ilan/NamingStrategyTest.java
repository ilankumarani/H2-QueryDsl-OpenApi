package org.ilan;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.ilan.entity.Employee;
import org.ilan.namingStrategy.CustomPhysicalNamingStrategy;
import org.ilan.provider.StringValueResolverProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.EmbeddedValueResolver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.util.StringValueResolver;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import static org.hibernate.cfg.AvailableSettings.PHYSICAL_NAMING_STRATEGY;

public class NamingStrategyTest {

    private Session session;

    @BeforeEach
    public void init() {
        StringValueResolverProvider stringValueResolverProvider = new StringValueResolverProvider();
        stringValueResolverProvider.setEmbeddedValueResolver(getValueResolver());
        Configuration configuration = new Configuration();
        configuration.setProperties(getProperties());
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
                .build();
        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        metadataSources.addAnnotatedClass(Employee.class);
        SessionFactory factory = metadataSources.buildMetadata()
                .buildSessionFactory();
        session = factory.openSession();
    }

    @Test
    public void testNamingStrategy() {
        Employee employee = Employee.builder().id(1L).email("ilankumaran.i@gmail.com").name("Ilankumaran").build();
        session.beginTransaction();
        session.save(employee);
        session.flush();
        session.clear();


    }

    private EmbeddedValueResolver getValueResolver() {
        String catalogProperty = "catalogName.employee";
        String schemaProperty = "schemaName.employee";
        String tableProperty = "tableName.employee";
        String columnProperty = "column.employee.name";


        Properties properties = getProperties();
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setProperties(properties);
        beanFactory.registerSingleton(PropertySourcesPlaceholderConfigurer.class.getSimpleName(), propertySourcesPlaceholderConfigurer);
        beanFactory.addEmbeddedValueResolver(new StringValueResolver() {
            @Override
            public String resolveStringValue(String identifierText) {
                String value = null;
                Enumeration e = properties.propertyNames();
                while (e.hasMoreElements()) {
                    String key = e.nextElement().toString();
                    if (identifierText.contains(key) && identifierText.startsWith("${") && identifierText.endsWith("}")) {
                        System.out.println(key + "  " + identifierText.contains(key) + "  " + properties.get(key).toString());
                        value = identifierText.contains(key) ? properties.get(key).toString() : null;
                    }
                }
                return value;
            }
        });
        EmbeddedValueResolver embeddedValueResolver = new EmbeddedValueResolver(beanFactory);
        return embeddedValueResolver;
    }

    private Properties getProperties() {
        Properties properties = new Properties();
        try {
            properties.load(Thread.currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream("application-strategy.properties"));
            properties.put(PHYSICAL_NAMING_STRATEGY, CustomPhysicalNamingStrategy.CLASS_NAME);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}