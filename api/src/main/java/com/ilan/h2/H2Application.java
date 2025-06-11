package com.ilan.h2;

import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;
import com.ilan.h2.service.DataLoad;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class H2Application {

    private final BlogRepository blogRepository;
    private final OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }


    @Profile({"!db"})
    @Bean
    public CommandLineRunner dataLoad() {
        return args -> {
            DataLoad.insertData(ownerRepository, blogRepository);
        };
    }

}
