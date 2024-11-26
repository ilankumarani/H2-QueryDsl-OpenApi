package com.ilan.h2.service;

import com.ilan.h2.entity.Blog;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.sql.SQLQueryFactory;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Description;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

import static com.ilan.h2.entity.QBlog.blog;
//import static com.querydsl.sql.generated.blog_schema.SBlogDetails.blogDetails;

@Service
@RequiredArgsConstructor
public class BlogRepositoryService {

    @PersistenceContext
    private EntityManager entityManager;

    private final SQLQueryFactory sqlQueryFactory;

    private final DataSource dataSource;

    private JPAQueryFactory queryFactory;

    @PostConstruct
    public void afterBeanInit() {
        queryFactory = new JPAQueryFactory(entityManager);
    }


    @Description("QueryDSL example")
    public List<Blog> findBlogByTitle(String title) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        BooleanExpression booleanExpression = blog.title.eq(title);
        return queryFactory.selectFrom(blog)
                .where(booleanExpression)
                .fetch();
    }



    /*@Transactional
    @Description("Sql QueryDSL example")
    public List<Blog> sqlFindBlogByTitle(String title) {
        BooleanExpression booleanExpression = blogDetails.title.eq(title);
        return sqlQueryFactory.select(Projections.bean(Blog.class, blogDetails.id
                        , blogDetails.title
                        , blogDetails.category
                        , blogDetails.content
                        , blogDetails.ownerId))
                .from(blogDetails)
                .where(booleanExpression)
                .fetch();
    }*/

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
