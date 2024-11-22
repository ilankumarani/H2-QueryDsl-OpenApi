package com.querydsl.sql;

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
 * SReferentialConstraints is a Querydsl query type for SReferentialConstraints
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SReferentialConstraints extends RelationalPathBase<SReferentialConstraints> {

    private static final long serialVersionUID = 1119326804;

    public static final SReferentialConstraints referentialConstraints = new SReferentialConstraints("REFERENTIAL_CONSTRAINTS");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final StringPath deleteRule = createString("deleteRule");

    public final StringPath matchOption = createString("matchOption");

    public final StringPath uniqueConstraintCatalog = createString("uniqueConstraintCatalog");

    public final StringPath uniqueConstraintName = createString("uniqueConstraintName");

    public final StringPath uniqueConstraintSchema = createString("uniqueConstraintSchema");

    public final StringPath updateRule = createString("updateRule");

    public SReferentialConstraints(String variable) {
        super(SReferentialConstraints.class, forVariable(variable), "INFORMATION_SCHEMA", "REFERENTIAL_CONSTRAINTS");
        addMetadata();
    }

    public SReferentialConstraints(String variable, String schema, String table) {
        super(SReferentialConstraints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SReferentialConstraints(String variable, String schema) {
        super(SReferentialConstraints.class, forVariable(variable), schema, "REFERENTIAL_CONSTRAINTS");
        addMetadata();
    }

    public SReferentialConstraints(Path<? extends SReferentialConstraints> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "REFERENTIAL_CONSTRAINTS");
        addMetadata();
    }

    public SReferentialConstraints(PathMetadata metadata) {
        super(SReferentialConstraints.class, metadata, "INFORMATION_SCHEMA", "REFERENTIAL_CONSTRAINTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(deleteRule, ColumnMetadata.named("DELETE_RULE").withIndex(9).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(matchOption, ColumnMetadata.named("MATCH_OPTION").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(uniqueConstraintCatalog, ColumnMetadata.named("UNIQUE_CONSTRAINT_CATALOG").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(uniqueConstraintName, ColumnMetadata.named("UNIQUE_CONSTRAINT_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(uniqueConstraintSchema, ColumnMetadata.named("UNIQUE_CONSTRAINT_SCHEMA").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(updateRule, ColumnMetadata.named("UPDATE_RULE").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

