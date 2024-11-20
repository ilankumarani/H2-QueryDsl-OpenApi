package com.ilan.h2.service;

import com.ilan.h2.entity.Blog;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

import static com.ilan.h2.entity.QBlog.blog;

@Service
@RequiredArgsConstructor
public class BlogRepositoryService {

    @PersistenceContext
    private EntityManager entityManager;


    private final DataSource dataSource;

    public List<Blog> findBlogByTitle(String title) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        BooleanExpression booleanExpression = blog.title.eq(title);
        return queryFactory.selectFrom(blog)
                .where(booleanExpression)
                .fetch();
    }

    public List<Blog> findBlogByTitleJdbcTemplate(String title) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.query("SELECT * FROM BLOG_SCHEMA.BLOG_DETAILS WHERE TITLE = ?", new Object[]{title},  new BeanPropertyRowMapper(Blog.class));
    }

    public List<Blog> findBlogByTitleNamedParameterJdbcTemplate(String title) {
        NamedParameterJdbcTemplate jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        MapSqlParameterSource parameters = new MapSqlParameterSource();
        parameters.addValue("title", title);
        return jdbcTemplate.query("SELECT * FROM BLOG_SCHEMA.BLOG_DETAILS WHERE TITLE = :title", parameters, new BeanPropertyRowMapper(Blog.class));
    }

}
