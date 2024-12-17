package com.ilan.h2.service;

import com.ilan.h2.entity.Blog;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.stereotype.Service;

@Service
public class JpaEntityInformationService {

    @PersistenceContext
    private EntityManager entityManager;

    private JpaEntityInformation entityInformation(){
        return JpaEntityInformationSupport.getEntityInformation(Blog.class, entityManager);
    }

    public String entityName(){
        return entityInformation().getEntityName();
    }
}
