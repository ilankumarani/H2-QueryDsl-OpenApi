package com.ilan.h2.controller.blog;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.service.BlogRepositoryService;
import com.ilan.h2.service.SqlQueryDslService;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BlogController {

    private final BlogRepositoryService blogRepository;
    private final SqlQueryDslService sqlQueryDslService;

    @GetMapping(value = "/queryDsl/findBlogByTitle/{title}")
    public List<Blog> findBlogByTitle(@Parameter(description = "titleName", required = true, example="Snow") @PathVariable(value = "title") String title) {
        return blogRepository.findBlogByTitle(title);
    }

    @GetMapping(value = "/sql/queryDsl/findBlogByTitle/{title}")
    public List<Blog> sqlFindBlogByTitle(@Parameter(description = "titleName", required = true, example="Snow") @PathVariable(value = "title") String title) {
        return sqlQueryDslService.findBlogByTitle(title);
    }

    @GetMapping(value = "/jdbcTemplate/findBlogByTitle/{title}")
    public List<Blog> jdbcTemplate(@Parameter(description = "titleName", required = true, example="Snow") @PathVariable(value = "title") String title) {
        return blogRepository.findBlogByTitleJdbcTemplate(title);
    }

    @GetMapping(value = "/namedJdbcTemplate/findBlogByTitle/{title}")
    public List<Blog> namedJdbcTemplate(@Parameter(description = "titleName", required = true, example="Snow") @PathVariable(value = "title") String title) {
        return blogRepository.findBlogByTitleNamedParameterJdbcTemplate(title);
    }
}