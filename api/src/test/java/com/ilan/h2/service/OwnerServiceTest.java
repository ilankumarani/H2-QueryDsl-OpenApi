package com.ilan.h2.service;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.entity.Owner;
import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ActiveProfiles({"test"})
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


        verify(ownerSaved, ownerRepositoryService.findOwnerByName(ownerSaved.getName()).stream().findFirst().get());
        verify(ownerSaved, ownerRepositoryService.findOwnerByName(ownerSaved.getName()).stream().findFirst().get());
        verify(ownerSaved, ownerRepositoryService.findOwnerByNameAndTitle(ownerSaved.getName(), blog.getTitle()).stream().findFirst().get());
    }

    private void verify(Owner ownerSaved, Owner owner) {
        assertEquals(ownerSaved.getId(), owner.getId());
        assertEquals(ownerSaved.getName(), owner.getName());
        assertEquals(ownerSaved.getEmail(), owner.getEmail());
    }
}
