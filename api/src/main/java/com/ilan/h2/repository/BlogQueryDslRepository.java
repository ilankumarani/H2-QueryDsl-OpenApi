package com.ilan.h2.repository;

import com.ilan.h2.entity.Blog;
import com.ilan.h2.entity.QBlog;
import io.github.openfeign.querydsl.jpa.spring.repository.QuerydslJpaRepository;

import static com.querydsl.jpa.JPAExpressions.selectFrom;


public interface BlogQueryDslRepository extends QuerydslJpaRepository<Blog, Long> {

  default Blog findOneBy(String title) {
    return selectFrom(QBlog.blog).where(QBlog.blog.title.eq(title)).fetchOne();
  }
}
