package com.ilan.h2;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class H2Application {

    private final BlogRepository blogRepository;
    private final OwnerRepository ownerRepository;

    public static void main(String[] args) {

        SpringApplication.run(H2Application.class, args);
    }


    @Bean
    public CommandLineRunner startup() {
        return args -> {
            blogRepository.save(Blog.builder().title("ALPHA").category("Weather")
                    .category("SNOW").build());
        };
    }
}
