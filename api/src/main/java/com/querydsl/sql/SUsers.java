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
 * SUsers is a Querydsl query type for SUsers
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SUsers extends RelationalPathBase<SUsers> {

    private static final long serialVersionUID = -728881855;

    public static final SUsers users = new SUsers("USERS");

    public final BooleanPath isAdmin = createBoolean("isAdmin");

    public final StringPath remarks = createString("remarks");

    public final StringPath userName = createString("userName");

    public SUsers(String variable) {
        super(SUsers.class, forVariable(variable), "INFORMATION_SCHEMA", "USERS");
        addMetadata();
    }

    public SUsers(String variable, String schema, String table) {
        super(SUsers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SUsers(String variable, String schema) {
        super(SUsers.class, forVariable(variable), schema, "USERS");
        addMetadata();
    }

    public SUsers(Path<? extends SUsers> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "USERS");
        addMetadata();
    }

    public SUsers(PathMetadata metadata) {
        super(SUsers.class, metadata, "INFORMATION_SCHEMA", "USERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(isAdmin, ColumnMetadata.named("IS_ADMIN").withIndex(2).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(userName, ColumnMetadata.named("USER_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

