package org.ilan.config;


import lombok.NoArgsConstructor;
import org.ilan.provider.StringValueResolverProvider;
import org.ilan.namingStrategy.CustomPhysicalNamingStrategy;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactoryBuilderCustomizer;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Description;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;

import java.util.HashMap;
import java.util.Map;

import static org.hibernate.cfg.AvailableSettings.PHYSICAL_NAMING_STRATEGY;

@NoArgsConstructor
@Configuration
@DependsOn(StringValueResolverProvider.BEAN_NAME)
@ConditionalOnProperty(name = "physical_naming_strategy.enabled", havingValue = "true", matchIfMissing = true)
@Description("Class for resolving jpa naming strategy when user supplies their own instance of entity manager")
public class HibernatePropertiesRegister {

    /*
        the below builder code is copied from org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration.
        Refer the same If you wanted to enhance anything in the future.
     */
    @Bean
    public EntityManagerFactoryBuilder entityManagerFactoryBuilder(JpaVendorAdapter jpaVendorAdapter,
                                                                   ObjectProvider<PersistenceUnitManager>persistenceUnitManager, ObjectProvider<EntityManagerFactoryBuilderCustomizer> customizers, JpaProperties jpaProperties) {
        Map properties = new HashMap<>();
        properties.put(PHYSICAL_NAMING_STRATEGY, CustomPhysicalNamingStrategy.CLASS_NAME);
        properties.putAll(jpaProperties.getProperties());
        EntityManagerFactoryBuilder builder = new EntityManagerFactoryBuilder(jpaVendorAdapter, properties, persistenceUnitManager.getIfAvailable());
        customizers.orderedStream().forEach((customizer) -> {
            customizer.customize(builder);
        });
        return builder;

    }

}