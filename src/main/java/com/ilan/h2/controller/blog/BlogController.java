package com.ilan.h2.controller.blog;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.repository.BlogRepository;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlogController {

    private final BlogRepository blogRepository;

    @GetMapping(value = "/findBlogByTitle/{title}")
    public List<Blog> findBlogByTitle(@Parameter(description = "titleName", required = true, example="ALPHA") @PathVariable(value = "title") String title) {
        return blogRepository.findBlogByTitle(title);
    }
}