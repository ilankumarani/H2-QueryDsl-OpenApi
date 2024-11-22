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
 * STables is a Querydsl query type for STables
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class STables extends RelationalPathBase<STables> {

    private static final long serialVersionUID = -1165849012;

    public static final STables tables = new STables("TABLES");

    public final StringPath commitAction = createString("commitAction");

    public final StringPath isInsertableInto = createString("isInsertableInto");

    public final NumberPath<Long> lastModification = createNumber("lastModification", Long.class);

    public final StringPath remarks = createString("remarks");

    public final NumberPath<Long> rowCountEstimate = createNumber("rowCountEstimate", Long.class);

    public final StringPath storageType = createString("storageType");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableClass = createString("tableClass");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public final StringPath tableType = createString("tableType");

    public STables(String variable) {
        super(STables.class, forVariable(variable), "INFORMATION_SCHEMA", "TABLES");
        addMetadata();
    }

    public STables(String variable, String schema, String table) {
        super(STables.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public STables(String variable, String schema) {
        super(STables.class, forVariable(variable), schema, "TABLES");
        addMetadata();
    }

    public STables(Path<? extends STables> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "TABLES");
        addMetadata();
    }

    public STables(PathMetadata metadata) {
        super(STables.class, metadata, "INFORMATION_SCHEMA", "TABLES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(commitAction, ColumnMetadata.named("COMMIT_ACTION").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isInsertableInto, ColumnMetadata.named("IS_INSERTABLE_INTO").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(lastModification, ColumnMetadata.named("LAST_MODIFICATION").withIndex(9).ofType(Types.BIGINT).withSize(64));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(rowCountEstimate, ColumnMetadata.named("ROW_COUNT_ESTIMATE").withIndex(11).ofType(Types.BIGINT).withSize(64));
        addMetadata(storageType, ColumnMetadata.named("STORAGE_TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableClass, ColumnMetadata.named("TABLE_CLASS").withIndex(10).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableType, ColumnMetadata.named("TABLE_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

