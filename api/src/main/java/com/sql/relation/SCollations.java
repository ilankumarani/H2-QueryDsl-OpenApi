package com.sql.relation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SCollations is a Querydsl query type for SCollations
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SCollations extends com.querydsl.sql.RelationalPathBase<SCollations> {

    private static final long serialVersionUID = 1940020664;

    public static final SCollations collations = new SCollations("COLLATIONS");

    public final StringPath collationCatalog = createString("collationCatalog");

    public final StringPath collationName = createString("collationName");

    public final StringPath collationSchema = createString("collationSchema");

    public final StringPath languageTag = createString("languageTag");

    public final StringPath padAttribute = createString("padAttribute");

    public SCollations(String variable) {
        super(SCollations.class, forVariable(variable), "INFORMATION_SCHEMA", "COLLATIONS");
        addMetadata();
    }

    public SCollations(String variable, String schema, String table) {
        super(SCollations.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SCollations(String variable, String schema) {
        super(SCollations.class, forVariable(variable), schema, "COLLATIONS");
        addMetadata();
    }

    public SCollations(Path<? extends SCollations> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "COLLATIONS");
        addMetadata();
    }

    public SCollations(PathMetadata metadata) {
        super(SCollations.class, metadata, "INFORMATION_SCHEMA", "COLLATIONS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(collationCatalog, ColumnMetadata.named("COLLATION_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationName, ColumnMetadata.named("COLLATION_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationSchema, ColumnMetadata.named("COLLATION_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(languageTag, ColumnMetadata.named("LANGUAGE_TAG").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(padAttribute, ColumnMetadata.named("PAD_ATTRIBUTE").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

