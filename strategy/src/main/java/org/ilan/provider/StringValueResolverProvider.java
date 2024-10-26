package org.ilan.provider;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringValueResolver;

@Configuration(value = StringValueResolverProvider.BEAN_NAME)
public class StringValueResolverProvider implements EmbeddedValueResolverAware {

    public static final String BEAN_NAME = "stringValueResolverProvider";

    private static StringValueResolver stringValueResolver;

    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        StringValueResolverProvider.stringValueResolver = stringValueResolver;
    }

    public static StringValueResolver getStringValueResolver(){
        return StringValueResolverProvider.stringValueResolver;
    }
}
