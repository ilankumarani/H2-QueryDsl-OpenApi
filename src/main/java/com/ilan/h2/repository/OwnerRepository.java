package com.ilan.h2.repository;

import com.ilan.h2.entity.Owner;
import com.ilan.h2.entity.QBlog;
import com.ilan.h2.entity.QOwner;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Owner> findOwnerByName(String name) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        QOwner qOwner = QOwner.owner;
        return queryFactory.selectFrom(qOwner)
                .where(qOwner.name.eq(name))
                .fetch();
    }

    public List<Owner> findOwnerByNameAndTitle(String name, String title) {
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
        QOwner qOwner = QOwner.owner;
        QBlog qBlog = QBlog.blog;
        return queryFactory.selectFrom(qOwner)
                .innerJoin(qBlog)
                .where(qOwner.name.eq(name))
                .where(qBlog.title.eq(title))
                .fetch();
    }
}
