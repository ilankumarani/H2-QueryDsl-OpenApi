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
 * SColumnPrivileges is a Querydsl query type for SColumnPrivileges
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SColumnPrivileges extends RelationalPathBase<SColumnPrivileges> {

    private static final long serialVersionUID = -1662077185;

    public static final SColumnPrivileges columnPrivileges = new SColumnPrivileges("COLUMN_PRIVILEGES");

    public final StringPath columnName = createString("columnName");

    public final StringPath grantee = createString("grantee");

    public final StringPath grantor = createString("grantor");

    public final StringPath isGrantable = createString("isGrantable");

    public final StringPath privilegeType = createString("privilegeType");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public SColumnPrivileges(String variable) {
        super(SColumnPrivileges.class, forVariable(variable), "INFORMATION_SCHEMA", "COLUMN_PRIVILEGES");
        addMetadata();
    }

    public SColumnPrivileges(String variable, String schema, String table) {
        super(SColumnPrivileges.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SColumnPrivileges(String variable, String schema) {
        super(SColumnPrivileges.class, forVariable(variable), schema, "COLUMN_PRIVILEGES");
        addMetadata();
    }

    public SColumnPrivileges(Path<? extends SColumnPrivileges> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "COLUMN_PRIVILEGES");
        addMetadata();
    }

    public SColumnPrivileges(PathMetadata metadata) {
        super(SColumnPrivileges.class, metadata, "INFORMATION_SCHEMA", "COLUMN_PRIVILEGES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnName, ColumnMetadata.named("COLUMN_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(grantee, ColumnMetadata.named("GRANTEE").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(grantor, ColumnMetadata.named("GRANTOR").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isGrantable, ColumnMetadata.named("IS_GRANTABLE").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(privilegeType, ColumnMetadata.named("PRIVILEGE_TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

