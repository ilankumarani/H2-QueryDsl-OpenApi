package org.ilan.config;

import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@TestConfiguration
@RequiredArgsConstructor
@EnableJpaRepositories(
        entityManagerFactoryRef = DbConfig.ENTITY_MANAGER,
        transactionManagerRef = DbConfig.TRANSACTION_MANAGER,
        basePackages = "org.ilan.repository"
)
@ConditionalOnProperty(name = "withEntityManager.enabled", havingValue = "true", matchIfMissing = false)
public class DbConfig {

    public static final String ENTITY_MANAGER = "entityManagerFactory";
    public static final String TRANSACTION_MANAGER = "transactionManager";

    @Bean(name = ENTITY_MANAGER)
    @ConditionalOnBean(name = ENTITY_MANAGER)
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder entityManagerFactoryBuilder, DataSource dataSource){
        String entitiesToScan [] = {"org.ilan.entity"};
        return entityManagerFactoryBuilder
                .dataSource(dataSource)
                .packages(entitiesToScan)
                .build();
    }

    @Bean(name = TRANSACTION_MANAGER)
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        PlatformTransactionManager transactionManager = new JpaTransactionManager(entityManagerFactory);
        return transactionManager;
    }
}
