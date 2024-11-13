package com.myproject.mydomain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SKeyColumnUsage is a Querydsl query type for SKeyColumnUsage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SKeyColumnUsage extends com.querydsl.sql.RelationalPathBase<SKeyColumnUsage> {

    private static final long serialVersionUID = -1378854609;

    public static final SKeyColumnUsage keyColumnUsage = new SKeyColumnUsage("KEY_COLUMN_USAGE");

    public final StringPath columnName = createString("columnName");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final NumberPath<Integer> ordinalPosition = createNumber("ordinalPosition", Integer.class);

    public final NumberPath<Integer> positionInUniqueConstraint = createNumber("positionInUniqueConstraint", Integer.class);

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public SKeyColumnUsage(String variable) {
        super(SKeyColumnUsage.class, forVariable(variable), "INFORMATION_SCHEMA", "KEY_COLUMN_USAGE");
        addMetadata();
    }

    public SKeyColumnUsage(String variable, String schema, String table) {
        super(SKeyColumnUsage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SKeyColumnUsage(String variable, String schema) {
        super(SKeyColumnUsage.class, forVariable(variable), schema, "KEY_COLUMN_USAGE");
        addMetadata();
    }

    public SKeyColumnUsage(Path<? extends SKeyColumnUsage> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "KEY_COLUMN_USAGE");
        addMetadata();
    }

    public SKeyColumnUsage(PathMetadata metadata) {
        super(SKeyColumnUsage.class, metadata, "INFORMATION_SCHEMA", "KEY_COLUMN_USAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnName, ColumnMetadata.named("COLUMN_NAME").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(ordinalPosition, ColumnMetadata.named("ORDINAL_POSITION").withIndex(8).ofType(Types.INTEGER).withSize(32));
        addMetadata(positionInUniqueConstraint, ColumnMetadata.named("POSITION_IN_UNIQUE_CONSTRAINT").withIndex(9).ofType(Types.INTEGER).withSize(32));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

