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
 * SConstraintColumnUsage is a Querydsl query type for SConstraintColumnUsage
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SConstraintColumnUsage extends RelationalPathBase<SConstraintColumnUsage> {

    private static final long serialVersionUID = 481073927;

    public static final SConstraintColumnUsage constraintColumnUsage = new SConstraintColumnUsage("CONSTRAINT_COLUMN_USAGE");

    public final StringPath columnName = createString("columnName");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public SConstraintColumnUsage(String variable) {
        super(SConstraintColumnUsage.class, forVariable(variable), "INFORMATION_SCHEMA", "CONSTRAINT_COLUMN_USAGE");
        addMetadata();
    }

    public SConstraintColumnUsage(String variable, String schema, String table) {
        super(SConstraintColumnUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SConstraintColumnUsage(String variable, String schema) {
        super(SConstraintColumnUsage.class, forVariable(variable), schema, "CONSTRAINT_COLUMN_USAGE");
        addMetadata();
    }

    public SConstraintColumnUsage(Path<? extends SConstraintColumnUsage> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "CONSTRAINT_COLUMN_USAGE");
        addMetadata();
    }

    public SConstraintColumnUsage(PathMetadata metadata) {
        super(SConstraintColumnUsage.class, metadata, "INFORMATION_SCHEMA", "CONSTRAINT_COLUMN_USAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnName, ColumnMetadata.named("COLUMN_NAME").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

