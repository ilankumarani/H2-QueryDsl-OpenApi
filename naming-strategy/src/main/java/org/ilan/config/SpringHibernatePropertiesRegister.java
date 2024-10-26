package org.ilan.config;


import org.ilan.strategy.CustomPhysicalNamingStrategy;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Description;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.Objects;
import java.util.Properties;

@Description("Class for resolving jpa naming strategy when spring creates entity manager and datasource (3) ")
public class SpringHibernatePropertiesRegister implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    private final String SPRING_PHYSICAL_NAMING_STRATEGY = "spring.jpa.hibernate.naming.physical-strategy";
    private final String NAMING_STRATEGY_PROPERTY = "physicalNamingProperty";
    private final String PHYSICAL_NAMING_STRATEGY_ENABLED = "physical_naming_strategy.enabled";

    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        ConfigurableEnvironment environment = event.getEnvironment();
        String isEnabled = environment.getProperty(PHYSICAL_NAMING_STRATEGY_ENABLED);

        //No flag provided
        //Flag provide but empty value
        //Flag provide but value with space
        //Flag provide and the value is TRUE
        if (Objects.isNull(isEnabled) || isEnabled.isEmpty()
                || (Objects.nonNull(isEnabled) && isEnabled.trim().isEmpty())
                || (Objects.nonNull(isEnabled) && !isEnabled.trim().isEmpty()
                && Boolean.valueOf(isEnabled.trim()) == Boolean.TRUE)) {
            Properties props = new Properties();
            props.put(SPRING_PHYSICAL_NAMING_STRATEGY, CustomPhysicalNamingStrategy.CLASS_NAME);
            environment.getPropertySources().addFirst(new PropertiesPropertySource(NAMING_STRATEGY_PROPERTY, props));
        }
    }
}