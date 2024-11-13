package com.ilan.h2;

import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;
import com.ilan.h2.service.DataLoad;
import com.ilan.h2.service.QueryDslSqlService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class H2Application {

    private final BlogRepository blogRepository;
    private final OwnerRepository ownerRepository;
    private final QueryDslSqlService queryDslSqlService;

    public static void main(String[] args) {

        SpringApplication.run(H2Application.class, args);
    }


    @Bean
    public CommandLineRunner dataLoad() {
        return args -> {
            DataLoad.insertData(ownerRepository, blogRepository);

            queryDslSqlService.getNames().stream().forEach(e->{
                log.info("QueryDsl SQL Name ::: {}", e.toString());
            });

        };
    }




}
