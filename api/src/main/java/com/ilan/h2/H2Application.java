package com.ilan.h2;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.entity.Owner;
import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;
import com.ilan.h2.service.BlogRepositoryService;
import com.ilan.h2.service.DataLoad;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class H2Application {

    private final BlogRepository blogRepository;
    private final OwnerRepository ownerRepository;
    private final BlogRepositoryService blogRepositoryService;

    public static void main(String[] args) {

        SpringApplication.run(H2Application.class, args);
    }


    @Bean
    public CommandLineRunner startup() {
        return args -> {
            DataLoad.insertData(ownerRepository, blogRepository);
        };
    }


}
