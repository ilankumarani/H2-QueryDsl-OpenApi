package com.ilan.h2.service;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.entity.Owner;
import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.ALWAYS
        , webEnvironment = SpringBootTest.WebEnvironment.NONE)
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class OwnerServiceTest {

    private final OwnerRepository ownerRepository;
    private final BlogRepository blogRepository;
    private final OwnerRepositoryService ownerRepositoryService;

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

        //assertEquals(ownerSaved, ownerRepositoryService.findOwnerByName(ownerSaved.getName()).stream().findFirst().get(), "Record found for JpaRepository");
        //assertEquals(ownerSaved, ownerRepositoryService.findOwnerByNameAndTitle(ownerSaved.getName(), blog.getTitle()).stream().findFirst().get(), "Record found for JpaRepository");
    }
}
