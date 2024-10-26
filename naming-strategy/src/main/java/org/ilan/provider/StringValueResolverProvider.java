package org.ilan.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringValueResolver;

@Slf4j
@Configuration(value = StringValueResolverProvider.BEAN_NAME)
public class StringValueResolverProvider implements EmbeddedValueResolverAware {

    public static final String BEAN_NAME = "stringValueResolverProvider";

    private static StringValueResolver stringValueResolver;

    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        log.info("StringValueResolverProvider is loaded");
        StringValueResolverProvider.stringValueResolver = stringValueResolver;
    }

    public static StringValueResolver getStringValueResolver(){
        return StringValueResolverProvider.stringValueResolver;
    }
}
