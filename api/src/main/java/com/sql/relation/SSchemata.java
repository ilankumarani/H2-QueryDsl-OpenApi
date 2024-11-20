package com.sql.relation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SSchemata is a Querydsl query type for SSchemata
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SSchemata extends com.querydsl.sql.RelationalPathBase<SSchemata> {

    private static final long serialVersionUID = 870506236;

    public static final SSchemata schemata = new SSchemata("SCHEMATA");

    public final StringPath catalogName = createString("catalogName");

    public final StringPath defaultCharacterSetCatalog = createString("defaultCharacterSetCatalog");

    public final StringPath defaultCharacterSetName = createString("defaultCharacterSetName");

    public final StringPath defaultCharacterSetSchema = createString("defaultCharacterSetSchema");

    public final StringPath defaultCollationName = createString("defaultCollationName");

    public final StringPath remarks = createString("remarks");

    public final StringPath schemaName = createString("schemaName");

    public final StringPath schemaOwner = createString("schemaOwner");

    public final StringPath sqlPath = createString("sqlPath");

    public SSchemata(String variable) {
        super(SSchemata.class, forVariable(variable), "INFORMATION_SCHEMA", "SCHEMATA");
        addMetadata();
    }

    public SSchemata(String variable, String schema, String table) {
        super(SSchemata.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SSchemata(String variable, String schema) {
        super(SSchemata.class, forVariable(variable), schema, "SCHEMATA");
        addMetadata();
    }

    public SSchemata(Path<? extends SSchemata> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "SCHEMATA");
        addMetadata();
    }

    public SSchemata(PathMetadata metadata) {
        super(SSchemata.class, metadata, "INFORMATION_SCHEMA", "SCHEMATA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(catalogName, ColumnMetadata.named("CATALOG_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(defaultCharacterSetCatalog, ColumnMetadata.named("DEFAULT_CHARACTER_SET_CATALOG").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(defaultCharacterSetName, ColumnMetadata.named("DEFAULT_CHARACTER_SET_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(defaultCharacterSetSchema, ColumnMetadata.named("DEFAULT_CHARACTER_SET_SCHEMA").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(defaultCollationName, ColumnMetadata.named("DEFAULT_COLLATION_NAME").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(9).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(schemaName, ColumnMetadata.named("SCHEMA_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(schemaOwner, ColumnMetadata.named("SCHEMA_OWNER").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(sqlPath, ColumnMetadata.named("SQL_PATH").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

