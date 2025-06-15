package com.ilan.h2.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class NotCreateOrOracleProfileCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        return !(env.acceptsProfiles(Profiles.of("create"))
                || env.acceptsProfiles(Profiles.of("oracle"))
                || env.acceptsProfiles(Profiles.of("mysql"))
        );
    }
}

