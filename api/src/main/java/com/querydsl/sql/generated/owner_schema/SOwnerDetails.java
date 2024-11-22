package com.querydsl.sql.generated.owner_schema;

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
 * SOwnerDetails is a Querydsl query type for SOwnerDetails
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SOwnerDetails extends com.querydsl.sql.RelationalPathBase<SOwnerDetails> {

    private static final long serialVersionUID = 1699419916;

    public static final SOwnerDetails ownerDetails = new SOwnerDetails("OWNER_DETAILS");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<SOwnerDetails> constraintF = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<com.querydsl.sql.generated.blog_schema.SBlogDetails> _fklyfudlsb9wjcxpyhe7am95d4v = createInvForeignKey(id, "OWNER_ID");

    public SOwnerDetails(String variable) {
        super(SOwnerDetails.class, forVariable(variable), "OWNER_SCHEMA", "OWNER_DETAILS");
        addMetadata();
    }

    public SOwnerDetails(String variable, String schema, String table) {
        super(SOwnerDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SOwnerDetails(String variable, String schema) {
        super(SOwnerDetails.class, forVariable(variable), schema, "OWNER_DETAILS");
        addMetadata();
    }

    public SOwnerDetails(Path<? extends SOwnerDetails> path) {
        super(path.getType(), path.getMetadata(), "OWNER_SCHEMA", "OWNER_DETAILS");
        addMetadata();
    }

    public SOwnerDetails(PathMetadata metadata) {
        super(SOwnerDetails.class, metadata, "OWNER_SCHEMA", "OWNER_DETAILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(email, ColumnMetadata.named("EMAIL").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(64).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(3).ofType(Types.VARCHAR).withSize(255));
    }

}

