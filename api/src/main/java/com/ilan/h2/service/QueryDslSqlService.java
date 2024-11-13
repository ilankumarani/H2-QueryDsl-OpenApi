package com.ilan.h2.service;

import com.querydsl.sql.SQLQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.sql.relation.SOwnerDetails.ownerDetails;


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
