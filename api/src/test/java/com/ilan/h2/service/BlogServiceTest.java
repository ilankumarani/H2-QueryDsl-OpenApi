package com.ilan.h2.service;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.entity.Owner;
import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.ALWAYS
        , webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
        , properties = "server.port=9090")
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class BlogServiceTest {

    private final OwnerRepository ownerRepository;
    private final BlogRepository blogRepository;
    private final BlogRepositoryService blogRepositoryService;

    @Test
    public void test() {

        Owner owner = Owner.builder()
                .email("ilankumaran.i@gmail.com")
                .name("Ilankumaran Ilangovan")
                .build();

        Blog blog = Blog.builder()
                .title("Too much Snow")
                .category("Weather")
                .owner(owner)
                .content("SNOW").build();

        Blog blog1 = Blog.builder()
                .title("Too much Rain")
                .category("Weather")
                .owner(owner)
                .content("RAIN").build();
        owner.setBlogList(Arrays.asList(blog, blog1));
        Owner ownerSaved = ownerRepository.save(owner);
        Blog blogSaved = blogRepository.save(blog);
        Blog blogSaved1 = blogRepository.save(blog1);

        List<Blog> f1 = blogRepositoryService.findBlogByTitle(blogSaved.getTitle());
        List<Blog> f2 = blogRepositoryService.findBlogByTitleJdbcTemplate(blogSaved.getTitle());
        List<Blog> f3 = blogRepositoryService.findBlogByTitleNamedParameterJdbcTemplate(blogSaved.getTitle());


        verify(f1, blogSaved);
        verify(f2, blogSaved);
        verify(f3, blogSaved);
    }

    private void verify(List<Blog> blogs, Blog blogSaved){
        blogs.stream()
                .filter(e->e.getId() ==blogSaved.getId())
                .findFirst()
                .ifPresent(e->{
                    assertEquals(e.getCategory(), blogSaved.getCategory());
                    assertEquals(e.getTitle(), blogSaved.getTitle());
                    assertEquals(e.getContent(), blogSaved.getContent());
                });
    }
}
