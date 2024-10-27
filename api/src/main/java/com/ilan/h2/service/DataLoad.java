package com.ilan.h2.service;


import com.ilan.h2.entity.Blog;
import com.ilan.h2.entity.Owner;
import com.ilan.h2.repository.BlogRepository;
import com.ilan.h2.repository.OwnerRepository;

import java.util.Arrays;

public class DataLoad {

    public static void insertData(OwnerRepository ownerRepository, BlogRepository blogRepository){
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
    }
}
