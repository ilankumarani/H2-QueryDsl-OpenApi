package com.sql.relation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SRoles is a Querydsl query type for SRoles
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SRoles extends com.querydsl.sql.RelationalPathBase<SRoles> {

    private static final long serialVersionUID = 216010319;

    public static final SRoles roles = new SRoles("ROLES");

    public final StringPath remarks = createString("remarks");

    public final StringPath roleName = createString("roleName");

    public SRoles(String variable) {
        super(SRoles.class, forVariable(variable), "INFORMATION_SCHEMA", "ROLES");
        addMetadata();
    }

    public SRoles(String variable, String schema, String table) {
        super(SRoles.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SRoles(String variable, String schema) {
        super(SRoles.class, forVariable(variable), schema, "ROLES");
        addMetadata();
    }

    public SRoles(Path<? extends SRoles> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "ROLES");
        addMetadata();
    }

    public SRoles(PathMetadata metadata) {
        super(SRoles.class, metadata, "INFORMATION_SCHEMA", "ROLES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(roleName, ColumnMetadata.named("ROLE_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

