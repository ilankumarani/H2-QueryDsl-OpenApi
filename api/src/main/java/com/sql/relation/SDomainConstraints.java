package com.sql.relation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SDomainConstraints is a Querydsl query type for SDomainConstraints
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SDomainConstraints extends com.querydsl.sql.RelationalPathBase<SDomainConstraints> {

    private static final long serialVersionUID = -341816476;

    public static final SDomainConstraints domainConstraints = new SDomainConstraints("DOMAIN_CONSTRAINTS");

    public final StringPath constraintCatalog = createString("constraintCatalog");

    public final StringPath constraintName = createString("constraintName");

    public final StringPath constraintSchema = createString("constraintSchema");

    public final StringPath domainCatalog = createString("domainCatalog");

    public final StringPath domainName = createString("domainName");

    public final StringPath domainSchema = createString("domainSchema");

    public final StringPath initiallyDeferred = createString("initiallyDeferred");

    public final StringPath isDeferrable = createString("isDeferrable");

    public final StringPath remarks = createString("remarks");

    public SDomainConstraints(String variable) {
        super(SDomainConstraints.class, forVariable(variable), "INFORMATION_SCHEMA", "DOMAIN_CONSTRAINTS");
        addMetadata();
    }

    public SDomainConstraints(String variable, String schema, String table) {
        super(SDomainConstraints.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SDomainConstraints(String variable, String schema) {
        super(SDomainConstraints.class, forVariable(variable), schema, "DOMAIN_CONSTRAINTS");
        addMetadata();
    }

    public SDomainConstraints(Path<? extends SDomainConstraints> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "DOMAIN_CONSTRAINTS");
        addMetadata();
    }

    public SDomainConstraints(PathMetadata metadata) {
        super(SDomainConstraints.class, metadata, "INFORMATION_SCHEMA", "DOMAIN_CONSTRAINTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(constraintCatalog, ColumnMetadata.named("CONSTRAINT_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintName, ColumnMetadata.named("CONSTRAINT_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constraintSchema, ColumnMetadata.named("CONSTRAINT_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(domainCatalog, ColumnMetadata.named("DOMAIN_CATALOG").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(domainName, ColumnMetadata.named("DOMAIN_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(domainSchema, ColumnMetadata.named("DOMAIN_SCHEMA").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(initiallyDeferred, ColumnMetadata.named("INITIALLY_DEFERRED").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isDeferrable, ColumnMetadata.named("IS_DEFERRABLE").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(9).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

