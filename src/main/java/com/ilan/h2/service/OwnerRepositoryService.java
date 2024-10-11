package com.ilan.h2.service;

import com.ilan.h2.entity.Owner;
import com.ilan.h2.entity.QBlog;
import com.ilan.h2.entity.QOwner;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.ilan.h2.entity.QBlog.blog;
import static com.ilan.h2.entity.QOwner.owner;

@Service
public class OwnerRepositoryService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Owner> findOwnerByName(String name) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        return queryFactory.selectFrom(owner)
                .where(owner.name.eq(name))
                .fetch();
    }

    public List<Owner> findOwnerByNameAndTitle(String name, String title) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        return queryFactory.selectFrom(owner)
                .innerJoin(blog)
                .where(owner.name.eq(name))
                .where(blog.title.eq(title))
                .fetch();
    }
}
