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
 * STableConstraints is a Querydsl query type for STableConstraints
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class STableConstraints extends com.querydsl.sql.RelationalPathBase<STableConstraints> {

    private static final long serialVersionUID = -633818772;

    public static final STableConstraints tableConstraints = new STableConstraints("TABLE_CONSTRAINTS");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final StringPath constraintType = createString("constraintType");

    public final StringPath enforced = createString("enforced");

    public final StringPath indexCatalog = createString("indexCatalog");

    public final StringPath indexName = createString("indexName");

    public final StringPath indexSchema = createString("indexSchema");

    public final StringPath initiallyDeferred = createString("initiallyDeferred");

    public final StringPath isDeferrable = createString("isDeferrable");

    public final StringPath nullsDistinct = createString("nullsDistinct");

    public final StringPath remarks = createString("remarks");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public STableConstraints(String variable) {
        super(STableConstraints.class, forVariable(variable), "INFORMATION_SCHEMA", "TABLE_CONSTRAINTS");
        addMetadata();
    }

    public STableConstraints(String variable, String schema, String table) {
        super(STableConstraints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public STableConstraints(String variable, String schema) {
        super(STableConstraints.class, forVariable(variable), schema, "TABLE_CONSTRAINTS");
        addMetadata();
    }

    public STableConstraints(Path<? extends STableConstraints> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "TABLE_CONSTRAINTS");
        addMetadata();
    }

    public STableConstraints(PathMetadata metadata) {
        super(STableConstraints.class, metadata, "INFORMATION_SCHEMA", "TABLE_CONSTRAINTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintType, ColumnMetadata.named("CONSTRAINT_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(enforced, ColumnMetadata.named("ENFORCED").withIndex(10).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(indexCatalog, ColumnMetadata.named("INDEX_CATALOG").withIndex(12).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(indexName, ColumnMetadata.named("INDEX_NAME").withIndex(14).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(indexSchema, ColumnMetadata.named("INDEX_SCHEMA").withIndex(13).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(initiallyDeferred, ColumnMetadata.named("INITIALLY_DEFERRED").withIndex(9).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isDeferrable, ColumnMetadata.named("IS_DEFERRABLE").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(nullsDistinct, ColumnMetadata.named("NULLS_DISTINCT").withIndex(11).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(15).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

