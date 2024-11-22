package com.ilan.h2.service;

import com.querydsl.sql.SQLQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.querydsl.sql.SOwnerDetails.ownerDetails;


@Transactional
@Service
@RequiredArgsConstructor
public class QueryDslSqlService {

    private final SQLQueryFactory queryFactory;

    public List<String> getNames() {
        List<String> names = queryFactory.select(ownerDetails.name).from(ownerDetails)
                .where(ownerDetails.name.eq("Ilankumaran"))
                .fetch();
        return names;
    }
}
