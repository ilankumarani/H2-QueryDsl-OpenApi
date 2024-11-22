package com.ilan.h2.service;

import com.querydsl.sql.SQLQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.querydsl.sql.generated.owner_schema.SOwnerDetails.ownerDetails;


@Transactional
@Service
@RequiredArgsConstructor
public class QueryDslSqlService {

    private final SQLQueryFactory sqlQueryFactory;

    public List<String> getNames() {
        List<String> names = sqlQueryFactory.select(ownerDetails.name).from(ownerDetails)
                .where(ownerDetails.name.eq("Ilankumaran"))
                .fetch();
        return names;
    }
}
