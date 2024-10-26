package org.ilan;

import org.ilan.namingStrategy.CustomPhysicalNamingStrategy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.EmbeddedValueResolver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.util.StringValueResolver;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import static org.hibernate.cfg.MappingSettings.PHYSICAL_NAMING_STRATEGY;

public class NamingStrategyBase {
    protected EmbeddedValueResolver getValueResolver() {
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

    protected Properties getProperties() {
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
