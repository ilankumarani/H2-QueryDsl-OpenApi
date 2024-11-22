package com.querydsl.sql.generated.information_schema;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;

import io.github.openfeign.querydsl.sql.json.types.*;
import io.github.openfeign.querydsl.sql.json.*;



/**
 * SInDoubt is a Querydsl query type for SInDoubt
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SInDoubt extends com.querydsl.sql.RelationalPathBase<SInDoubt> {

    private static final long serialVersionUID = 76725395;

    public static final SInDoubt inDoubt = new SInDoubt("IN_DOUBT");

    public final StringPath transactionName = createString("transactionName");

    public final StringPath transactionState = createString("transactionState");

    public SInDoubt(String variable) {
        super(SInDoubt.class, forVariable(variable), "INFORMATION_SCHEMA", "IN_DOUBT");
        addMetadata();
    }

    public SInDoubt(String variable, String schema, String table) {
        super(SInDoubt.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SInDoubt(String variable, String schema) {
        super(SInDoubt.class, forVariable(variable), schema, "IN_DOUBT");
        addMetadata();
    }

    public SInDoubt(Path<? extends SInDoubt> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "IN_DOUBT");
        addMetadata();
    }

    public SInDoubt(PathMetadata metadata) {
        super(SInDoubt.class, metadata, "INFORMATION_SCHEMA", "IN_DOUBT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(transactionName, ColumnMetadata.named("TRANSACTION_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(transactionState, ColumnMetadata.named("TRANSACTION_STATE").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

