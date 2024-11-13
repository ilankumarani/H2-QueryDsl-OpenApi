package com.myproject.mydomain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SBlogDetails is a Querydsl query type for SBlogDetails
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SBlogDetails extends com.querydsl.sql.RelationalPathBase<SBlogDetails> {

    private static final long serialVersionUID = -1511204355;

    public static final SBlogDetails blogDetails = new SBlogDetails("BLOG_DETAILS");

    public final StringPath category = createString("category");

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> ownerId = createNumber("ownerId", Long.class);

    public final StringPath title = createString("title");

    public final com.querydsl.sql.PrimaryKey<SBlogDetails> constraintC = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<SOwnerDetails> fklyfudlsb9wjcxpyhe7am95d4v = createForeignKey(ownerId, "ID");

    public SBlogDetails(String variable) {
        super(SBlogDetails.class, forVariable(variable), "BLOG_SCHEMA", "BLOG_DETAILS");
        addMetadata();
    }

    public SBlogDetails(String variable, String schema, String table) {
        super(SBlogDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SBlogDetails(String variable, String schema) {
        super(SBlogDetails.class, forVariable(variable), schema, "BLOG_DETAILS");
        addMetadata();
    }

    public SBlogDetails(Path<? extends SBlogDetails> path) {
        super(path.getType(), path.getMetadata(), "BLOG_SCHEMA", "BLOG_DETAILS");
        addMetadata();
    }

    public SBlogDetails(PathMetadata metadata) {
        super(SBlogDetails.class, metadata, "BLOG_SCHEMA", "BLOG_DETAILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(category, ColumnMetadata.named("CATEGORY").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(content, ColumnMetadata.named("CONTENT").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).withSize(64).notNull());
        addMetadata(ownerId, ColumnMetadata.named("OWNER_ID").withIndex(2).ofType(Types.BIGINT).withSize(64));
        addMetadata(title, ColumnMetadata.named("TITLE").withIndex(5).ofType(Types.VARCHAR).withSize(255));
    }

}

