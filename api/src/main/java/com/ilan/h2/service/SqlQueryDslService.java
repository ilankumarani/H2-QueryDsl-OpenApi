package com.ilan.h2.service;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.entity.Owner;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.generated.blog_schema.SBlogDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.querydsl.sql.generated.blog_schema.SBlogDetails.blogDetails;
import static com.querydsl.sql.generated.owner_schema.SOwnerDetails.ownerDetails;


@Transactional
@Service
@RequiredArgsConstructor
public class SqlQueryDslService {

    private final SQLQueryFactory sqlQueryFactory;

    @Description("Sql QueryDSL example")
    public List<Blog> findBlogByTitle(String title) {
        BooleanExpression booleanExpression = blogDetails.title.eq(title);
        return sqlQueryFactory.select(Projections.bean(Blog.class, blogDetails.id
                        , blogDetails.title
                        , blogDetails.category
                        , blogDetails.content
                        , blogDetails.ownerId))
                .from(blogDetails)
                .where(booleanExpression)
                .fetch();
    }
}
