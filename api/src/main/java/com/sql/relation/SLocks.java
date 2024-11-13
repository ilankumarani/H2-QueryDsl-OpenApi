package com.sql.relation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SLocks is a Querydsl query type for SLocks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SLocks extends com.querydsl.sql.RelationalPathBase<SLocks> {

    private static final long serialVersionUID = 210460730;

    public static final SLocks locks = new SLocks("LOCKS");

    public final StringPath lockType = createString("lockType");

    public final NumberPath<Integer> sessionId = createNumber("sessionId", Integer.class);

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public SLocks(String variable) {
        super(SLocks.class, forVariable(variable), "INFORMATION_SCHEMA", "LOCKS");
        addMetadata();
    }

    public SLocks(String variable, String schema, String table) {
        super(SLocks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SLocks(String variable, String schema) {
        super(SLocks.class, forVariable(variable), schema, "LOCKS");
        addMetadata();
    }

    public SLocks(Path<? extends SLocks> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "LOCKS");
        addMetadata();
    }

    public SLocks(PathMetadata metadata) {
        super(SLocks.class, metadata, "INFORMATION_SCHEMA", "LOCKS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lockType, ColumnMetadata.named("LOCK_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(sessionId, ColumnMetadata.named("SESSION_ID").withIndex(3).ofType(Types.INTEGER).withSize(32));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

