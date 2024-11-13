package com.sql.relation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SSynonyms is a Querydsl query type for SSynonyms
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SSynonyms extends com.querydsl.sql.RelationalPathBase<SSynonyms> {

    private static final long serialVersionUID = -898186490;

    public static final SSynonyms synonyms = new SSynonyms("SYNONYMS");

    public final StringPath remarks = createString("remarks");

    public final StringPath status = createString("status");

    public final StringPath synonymCatalog = createString("synonymCatalog");

    public final StringPath synonymFor = createString("synonymFor");

    public final StringPath synonymForSchema = createString("synonymForSchema");

    public final StringPath synonymName = createString("synonymName");

    public final StringPath synonymSchema = createString("synonymSchema");

    public final StringPath typeName = createString("typeName");

    public SSynonyms(String variable) {
        super(SSynonyms.class, forVariable(variable), "INFORMATION_SCHEMA", "SYNONYMS");
        addMetadata();
    }

    public SSynonyms(String variable, String schema, String table) {
        super(SSynonyms.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SSynonyms(String variable, String schema) {
        super(SSynonyms.class, forVariable(variable), schema, "SYNONYMS");
        addMetadata();
    }

    public SSynonyms(Path<? extends SSynonyms> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "SYNONYMS");
        addMetadata();
    }

    public SSynonyms(PathMetadata metadata) {
        super(SSynonyms.class, metadata, "INFORMATION_SCHEMA", "SYNONYMS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(status, ColumnMetadata.named("STATUS").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(synonymCatalog, ColumnMetadata.named("SYNONYM_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(synonymFor, ColumnMetadata.named("SYNONYM_FOR").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(synonymForSchema, ColumnMetadata.named("SYNONYM_FOR_SCHEMA").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(synonymName, ColumnMetadata.named("SYNONYM_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(synonymSchema, ColumnMetadata.named("SYNONYM_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(typeName, ColumnMetadata.named("TYPE_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

