package com.ilan.h2.repository;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.entity.Owner;
import com.ilan.h2.entity.QBlog;
import com.ilan.h2.entity.QOwner;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Blog> findBlogByTitle(String title) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        QBlog qBlog = QBlog.blog;
        return queryFactory.selectFrom(qBlog)
                .where(qBlog.title.eq(title))
                .fetch();
    }
}
