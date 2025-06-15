package com.ilan.h2;

import com.ilan.h2.config.NotCreateOrOracleProfileCondition;
import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;
import com.ilan.h2.service.DataLoad;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class H2Application {

    @Value("${ilan.key:}")
    private String key;

    private final BlogRepository blogRepository;
    private final OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }

    //https://www.baeldung.com/yaml-multi-line
    @Bean
    public CommandLineRunner multiLineString() {
        return args -> {
            log.info("Multi line String in application.yml {}", key);
        };
    }


    @ConditionalOnExpression("!('${spring.profiles.active:}'.contains('create')) && !('${spring.profiles.active:}'.contains('oracle')) && !('${spring.profiles.active:}'.contains('mysql'))")
    @Conditional(NotCreateOrOracleProfileCondition.class)
    @Bean
    public CommandLineRunner dataLoad() {
        return args -> {
            log.info("Data load insertion to table using code");
            DataLoad.insertData(ownerRepository, blogRepository);
        };
    }

}
