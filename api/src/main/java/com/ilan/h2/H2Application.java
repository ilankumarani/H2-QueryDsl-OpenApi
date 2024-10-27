package com.ilan.h2;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;
import com.ilan.h2.service.BlogRepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
            Blog saved = blogRepository.save(Blog.builder()
                    .title("ALPHA")
                    .category("Weather")
                    .content("SNOW").build());

            List<Blog> f1 =  blogRepositoryService.findBlogByTitle(saved.getTitle());
            List<Blog> f2 =  blogRepositoryService.findBlogByTitleJdbcTemplate(saved.getTitle());
            List<Blog> f3 =  blogRepositoryService.findBlogByTitleNamedParameterJdbcTemplate(saved.getTitle());

            System.out.println(f1.contains(saved));
            System.out.println(f2.contains(saved));
            System.out.println(f3.contains(saved));


        };
    }
}
