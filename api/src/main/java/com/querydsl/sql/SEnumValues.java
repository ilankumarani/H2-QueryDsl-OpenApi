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
 * SEnumValues is a Querydsl query type for SEnumValues
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SEnumValues extends RelationalPathBase<SEnumValues> {

    private static final long serialVersionUID = -2044748310;

    public static final SEnumValues enumValues = new SEnumValues("ENUM_VALUES");

    public final StringPath enumIdentifier = createString("enumIdentifier");

    public final StringPath objectCatalog = createString("objectCatalog");

    public final StringPath objectName = createString("objectName");

    public final StringPath objectSchema = createString("objectSchema");

    public final StringPath objectType = createString("objectType");

    public final StringPath valueName = createString("valueName");

    public final StringPath valueOrdinal = createString("valueOrdinal");

    public SEnumValues(String variable) {
        super(SEnumValues.class, forVariable(variable), "INFORMATION_SCHEMA", "ENUM_VALUES");
        addMetadata();
    }

    public SEnumValues(String variable, String schema, String table) {
        super(SEnumValues.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SEnumValues(String variable, String schema) {
        super(SEnumValues.class, forVariable(variable), schema, "ENUM_VALUES");
        addMetadata();
    }

    public SEnumValues(Path<? extends SEnumValues> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "ENUM_VALUES");
        addMetadata();
    }

    public SEnumValues(PathMetadata metadata) {
        super(SEnumValues.class, metadata, "INFORMATION_SCHEMA", "ENUM_VALUES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(enumIdentifier, ColumnMetadata.named("ENUM_IDENTIFIER").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectCatalog, ColumnMetadata.named("OBJECT_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectName, ColumnMetadata.named("OBJECT_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectSchema, ColumnMetadata.named("OBJECT_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectType, ColumnMetadata.named("OBJECT_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(valueName, ColumnMetadata.named("VALUE_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(valueOrdinal, ColumnMetadata.named("VALUE_ORDINAL").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

