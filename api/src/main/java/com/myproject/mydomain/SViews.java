package com.myproject.mydomain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SViews is a Querydsl query type for SViews
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SViews extends com.querydsl.sql.RelationalPathBase<SViews> {

    private static final long serialVersionUID = -2110298645;

    public static final SViews views = new SViews("VIEWS");

    public final StringPath checkOption = createString("checkOption");

    public final StringPath insertableInto = createString("insertableInto");

    public final StringPath isTriggerDeletable = createString("isTriggerDeletable");

    public final StringPath isTriggerInsertableInto = createString("isTriggerInsertableInto");

    public final StringPath isTriggerUpdatable = createString("isTriggerUpdatable");

    public final StringPath isUpdatable = createString("isUpdatable");

    public final StringPath remarks = createString("remarks");

    public final StringPath status = createString("status");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public final StringPath viewDefinition = createString("viewDefinition");

    public SViews(String variable) {
        super(SViews.class, forVariable(variable), "INFORMATION_SCHEMA", "VIEWS");
        addMetadata();
    }

    public SViews(String variable, String schema, String table) {
        super(SViews.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SViews(String variable, String schema) {
        super(SViews.class, forVariable(variable), schema, "VIEWS");
        addMetadata();
    }

    public SViews(Path<? extends SViews> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "VIEWS");
        addMetadata();
    }

    public SViews(PathMetadata metadata) {
        super(SViews.class, metadata, "INFORMATION_SCHEMA", "VIEWS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(checkOption, ColumnMetadata.named("CHECK_OPTION").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(insertableInto, ColumnMetadata.named("INSERTABLE_INTO").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isTriggerDeletable, ColumnMetadata.named("IS_TRIGGER_DELETABLE").withIndex(9).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isTriggerInsertableInto, ColumnMetadata.named("IS_TRIGGER_INSERTABLE_INTO").withIndex(10).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isTriggerUpdatable, ColumnMetadata.named("IS_TRIGGER_UPDATABLE").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isUpdatable, ColumnMetadata.named("IS_UPDATABLE").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(12).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(status, ColumnMetadata.named("STATUS").withIndex(11).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(viewDefinition, ColumnMetadata.named("VIEW_DEFINITION").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

