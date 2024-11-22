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
 * SRights is a Querydsl query type for SRights
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SRights extends com.querydsl.sql.RelationalPathBase<SRights> {

    private static final long serialVersionUID = 697213436;

    public static final SRights rights1 = new SRights("RIGHTS");

    public final StringPath grantedrole = createString("grantedrole");

    public final StringPath grantee = createString("grantee");

    public final StringPath granteetype = createString("granteetype");

    public final StringPath rights = createString("rights");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public SRights(String variable) {
        super(SRights.class, forVariable(variable), "INFORMATION_SCHEMA", "RIGHTS");
        addMetadata();
    }

    public SRights(String variable, String schema, String table) {
        super(SRights.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SRights(String variable, String schema) {
        super(SRights.class, forVariable(variable), schema, "RIGHTS");
        addMetadata();
    }

    public SRights(Path<? extends SRights> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "RIGHTS");
        addMetadata();
    }

    public SRights(PathMetadata metadata) {
        super(SRights.class, metadata, "INFORMATION_SCHEMA", "RIGHTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(grantedrole, ColumnMetadata.named("GRANTEDROLE").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(grantee, ColumnMetadata.named("GRANTEE").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(granteetype, ColumnMetadata.named("GRANTEETYPE").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(rights, ColumnMetadata.named("RIGHTS").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

