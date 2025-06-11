package com.ilan.h2;


import com.ilan.h2.entity.QBlog;
import com.ilan.h2.entity.QOwner;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ActiveProfiles({"create"})
@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.ALWAYS, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class CreateLoadDataTest {

    private final ApplicationContext applicationContext;
    private final EntityManager entityManager;
    private final QBlog qBlog = QBlog.blog;
    private final QOwner qOwner = QOwner.owner;

    @Test
    public void context() {
        assertNotNull(applicationContext);
    }

    @Test
    public void isDataLoaded() {
        JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(entityManager);

        assertEquals(4, jpaQueryFactory.selectFrom(qBlog).fetch().size());
        assertEquals(2, jpaQueryFactory.selectFrom(qOwner).fetch().size());
    }

}
