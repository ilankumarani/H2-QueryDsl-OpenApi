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
 * SCheckConstraints is a Querydsl query type for SCheckConstraints
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SCheckConstraints extends com.querydsl.sql.RelationalPathBase<SCheckConstraints> {

    private static final long serialVersionUID = -978264078;

    public static final SCheckConstraints checkConstraints = new SCheckConstraints("CHECK_CONSTRAINTS");

    public final StringPath checkClause = createString("checkClause");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public SCheckConstraints(String variable) {
        super(SCheckConstraints.class, forVariable(variable), "INFORMATION_SCHEMA", "CHECK_CONSTRAINTS");
        addMetadata();
    }

    public SCheckConstraints(String variable, String schema, String table) {
        super(SCheckConstraints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SCheckConstraints(String variable, String schema) {
        super(SCheckConstraints.class, forVariable(variable), schema, "CHECK_CONSTRAINTS");
        addMetadata();
    }

    public SCheckConstraints(Path<? extends SCheckConstraints> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "CHECK_CONSTRAINTS");
        addMetadata();
    }

    public SCheckConstraints(PathMetadata metadata) {
        super(SCheckConstraints.class, metadata, "INFORMATION_SCHEMA", "CHECK_CONSTRAINTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(checkClause, ColumnMetadata.named("CHECK_CLAUSE").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

