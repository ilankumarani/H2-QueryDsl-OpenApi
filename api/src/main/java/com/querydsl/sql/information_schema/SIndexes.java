package com.querydsl.sql.information_schema;

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
 * SIndexes is a Querydsl query type for SIndexes
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SIndexes extends com.querydsl.sql.RelationalPathBase<SIndexes> {

    private static final long serialVersionUID = 881470843;

    public static final SIndexes indexes = new SIndexes("INDEXES");

    public final StringPath indexCatalog = createString("indexCatalog");

    public final StringPath indexClass = createString("indexClass");

    public final StringPath indexName = createString("indexName");

    public final StringPath indexSchema = createString("indexSchema");

    public final StringPath indexTypeName = createString("indexTypeName");

    public final BooleanPath isGenerated = createBoolean("isGenerated");

    public final StringPath nullsDistinct = createString("nullsDistinct");

    public final StringPath remarks = createString("remarks");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public SIndexes(String variable) {
        super(SIndexes.class, forVariable(variable), "INFORMATION_SCHEMA", "INDEXES");
        addMetadata();
    }

    public SIndexes(String variable, String schema, String table) {
        super(SIndexes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SIndexes(String variable, String schema) {
        super(SIndexes.class, forVariable(variable), schema, "INDEXES");
        addMetadata();
    }

    public SIndexes(Path<? extends SIndexes> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "INDEXES");
        addMetadata();
    }

    public SIndexes(PathMetadata metadata) {
        super(SIndexes.class, metadata, "INFORMATION_SCHEMA", "INDEXES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(indexCatalog, ColumnMetadata.named("INDEX_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(indexClass, ColumnMetadata.named("INDEX_CLASS").withIndex(11).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(indexName, ColumnMetadata.named("INDEX_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(indexSchema, ColumnMetadata.named("INDEX_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(indexTypeName, ColumnMetadata.named("INDEX_TYPE_NAME").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isGenerated, ColumnMetadata.named("IS_GENERATED").withIndex(9).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(nullsDistinct, ColumnMetadata.named("NULLS_DISTINCT").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(10).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

