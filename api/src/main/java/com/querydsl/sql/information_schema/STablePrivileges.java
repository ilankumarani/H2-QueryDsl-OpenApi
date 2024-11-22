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
 * STablePrivileges is a Querydsl query type for STablePrivileges
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class STablePrivileges extends com.querydsl.sql.RelationalPathBase<STablePrivileges> {

    private static final long serialVersionUID = 393430987;

    public static final STablePrivileges tablePrivileges = new STablePrivileges("TABLE_PRIVILEGES");

    public final StringPath grantee = createString("grantee");

    public final StringPath grantor = createString("grantor");

    public final StringPath isGrantable = createString("isGrantable");

    public final StringPath privilegeType = createString("privilegeType");

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public final StringPath withHierarchy = createString("withHierarchy");

    public STablePrivileges(String variable) {
        super(STablePrivileges.class, forVariable(variable), "INFORMATION_SCHEMA", "TABLE_PRIVILEGES");
        addMetadata();
    }

    public STablePrivileges(String variable, String schema, String table) {
        super(STablePrivileges.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public STablePrivileges(String variable, String schema) {
        super(STablePrivileges.class, forVariable(variable), schema, "TABLE_PRIVILEGES");
        addMetadata();
    }

    public STablePrivileges(Path<? extends STablePrivileges> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "TABLE_PRIVILEGES");
        addMetadata();
    }

    public STablePrivileges(PathMetadata metadata) {
        super(STablePrivileges.class, metadata, "INFORMATION_SCHEMA", "TABLE_PRIVILEGES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(grantee, ColumnMetadata.named("GRANTEE").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(grantor, ColumnMetadata.named("GRANTOR").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isGrantable, ColumnMetadata.named("IS_GRANTABLE").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(privilegeType, ColumnMetadata.named("PRIVILEGE_TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(withHierarchy, ColumnMetadata.named("WITH_HIERARCHY").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

