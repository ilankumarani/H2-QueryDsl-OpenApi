package com.ilan.test;

import com.ilan.GenerateSqlDslApplication;
import com.ilan.config.DbConfig;
import io.ilan.entity.Blog;
import io.ilan.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.WHEN_AVAILABLE, classes = {GenerateSqlDslApplication.class})
@Import({DbConfig.class})
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
@ActiveProfiles("packages")
@DisplayName("Multiple packages-scan for entities")
public class GenerateSqlQueryDslPackagesTest {

    //private final BlogRepository blogRepository;

    @DisplayName("Generate SQL QueryDsl")
    @Test
    public void test() {
        /*Blog saved = blogRepository.save(Blog.builder()
                        .id(1L)
                .category("Climate")
                .content("SNOW")
                .title("Too Much SNOW")
                .build());

        Optional<Blog> optionalFetch = blogRepository.findById(1L);
        assertTrue(optionalFetch.isPresent());
        assertEquals(saved, optionalFetch.get());*/
    }
}
