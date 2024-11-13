package com.myproject.mydomain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SIndexColumns is a Querydsl query type for SIndexColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SIndexColumns extends com.querydsl.sql.RelationalPathBase<SIndexColumns> {

    private static final long serialVersionUID = -622586738;

    public static final SIndexColumns indexColumns = new SIndexColumns("INDEX_COLUMNS");

    public final StringPath columnName = createString("columnName");

    public final StringPath indexCatalog = createString("indexCatalog");

    public final StringPath indexName = createString("indexName");

    public final StringPath indexSchema = createString("indexSchema");

    public final BooleanPath isUnique = createBoolean("isUnique");

    public final StringPath nullOrdering = createString("nullOrdering");

    public final StringPath orderingSpecification = createString("orderingSpecification");

    public final NumberPath<Integer> ordinalPosition = createNumber("ordinalPosition", Integer.class);

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public SIndexColumns(String variable) {
        super(SIndexColumns.class, forVariable(variable), "INFORMATION_SCHEMA", "INDEX_COLUMNS");
        addMetadata();
    }

    public SIndexColumns(String variable, String schema, String table) {
        super(SIndexColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SIndexColumns(String variable, String schema) {
        super(SIndexColumns.class, forVariable(variable), schema, "INDEX_COLUMNS");
        addMetadata();
    }

    public SIndexColumns(Path<? extends SIndexColumns> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "INDEX_COLUMNS");
        addMetadata();
    }

    public SIndexColumns(PathMetadata metadata) {
        super(SIndexColumns.class, metadata, "INFORMATION_SCHEMA", "INDEX_COLUMNS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnName, ColumnMetadata.named("COLUMN_NAME").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(indexCatalog, ColumnMetadata.named("INDEX_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(indexName, ColumnMetadata.named("INDEX_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(indexSchema, ColumnMetadata.named("INDEX_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isUnique, ColumnMetadata.named("IS_UNIQUE").withIndex(11).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(nullOrdering, ColumnMetadata.named("NULL_ORDERING").withIndex(10).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(orderingSpecification, ColumnMetadata.named("ORDERING_SPECIFICATION").withIndex(9).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(ordinalPosition, ColumnMetadata.named("ORDINAL_POSITION").withIndex(8).ofType(Types.INTEGER).withSize(32));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

