package org.ilan.config;


import lombok.extern.slf4j.Slf4j;
import org.ilan.namingStrategy.CustomPhysicalNamingStrategy;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Description;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.Objects;
import java.util.Properties;

import static org.ilan.constant.NamingStrategyConstant.PHYSICAL_NAMING_STRATEGY_ENABLED;
import static org.ilan.constant.NamingStrategyConstant.SPRING_PHYSICAL_NAMING_STRATEGY;

@Slf4j
@Description("Class for resolving jpa naming strategy when spring creates entity manager and datasource (3) ")
public class SpringHibernatePropertiesRegister implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {


    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        log.info("CustomPhysicalNamingStrategy is set to Spring Environment");
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
            final String NAMING_STRATEGY_PROPERTY = "physicalNamingProperty";
            environment.getPropertySources().addFirst(new PropertiesPropertySource(NAMING_STRATEGY_PROPERTY, props));
        }
    }
}