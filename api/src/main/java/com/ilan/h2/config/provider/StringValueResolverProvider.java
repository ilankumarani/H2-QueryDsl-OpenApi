package com.ilan.h2.config.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringValueResolver;

/**
 * Spring StringValueResolver to resolve the table name spel expression
 * @author Ilankumaran Ilangovan
 */
@Slf4j
@Configuration(value = StringValueResolverProvider.BEAN_NAME)
public class StringValueResolverProvider implements EmbeddedValueResolverAware {

    /**
     * Bean name for this class
     */
    public static final String BEAN_NAME = "stringValueResolverProvider";

    private static StringValueResolver stringValueResolver;

    /**
     * Spring will use it for creating the bean in IOC container
     */
    public StringValueResolverProvider(){

    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        log.info("StringValueResolverProvider is loaded");
        StringValueResolverProvider.stringValueResolver = stringValueResolver;
    }

    /**
     * Get StringValueResolver to resolve the table name spel expression
     * @return the StringValueResolverProvider from Spring
     */
    public static StringValueResolver getStringValueResolver(){
        return StringValueResolverProvider.stringValueResolver;
    }
}
