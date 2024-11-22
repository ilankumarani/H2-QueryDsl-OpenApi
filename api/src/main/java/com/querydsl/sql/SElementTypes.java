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
 * SElementTypes is a Querydsl query type for SElementTypes
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SElementTypes extends RelationalPathBase<SElementTypes> {

    private static final long serialVersionUID = -535769724;

    public static final SElementTypes elementTypes = new SElementTypes("ELEMENT_TYPES");

    public final NumberPath<Long> characterMaximumLength = createNumber("characterMaximumLength", Long.class);

    public final NumberPath<Long> characterOctetLength = createNumber("characterOctetLength", Long.class);

    public final StringPath characterSetCatalog = createString("characterSetCatalog");

    public final StringPath characterSetName = createString("characterSetName");

    public final StringPath characterSetSchema = createString("characterSetSchema");

    public final StringPath collationCatalog = createString("collationCatalog");

    public final StringPath collationName = createString("collationName");

    public final StringPath collationSchema = createString("collationSchema");

    public final StringPath collectionTypeIdentifier = createString("collectionTypeIdentifier");

    public final StringPath dataType = createString("dataType");

    public final NumberPath<Integer> datetimePrecision = createNumber("datetimePrecision", Integer.class);

    public final StringPath declaredDataType = createString("declaredDataType");

    public final NumberPath<Integer> declaredNumericPrecision = createNumber("declaredNumericPrecision", Integer.class);

    public final NumberPath<Integer> declaredNumericScale = createNumber("declaredNumericScale", Integer.class);

    public final StringPath dtdIdentifier = createString("dtdIdentifier");

    public final NumberPath<Integer> geometrySrid = createNumber("geometrySrid", Integer.class);

    public final StringPath geometryType = createString("geometryType");

    public final NumberPath<Integer> intervalPrecision = createNumber("intervalPrecision", Integer.class);

    public final StringPath intervalType = createString("intervalType");

    public final NumberPath<Integer> maximumCardinality = createNumber("maximumCardinality", Integer.class);

    public final NumberPath<Integer> numericPrecision = createNumber("numericPrecision", Integer.class);

    public final NumberPath<Integer> numericPrecisionRadix = createNumber("numericPrecisionRadix", Integer.class);

    public final NumberPath<Integer> numericScale = createNumber("numericScale", Integer.class);

    public final StringPath objectCatalog = createString("objectCatalog");

    public final StringPath objectName = createString("objectName");

    public final StringPath objectSchema = createString("objectSchema");

    public final StringPath objectType = createString("objectType");

    public SElementTypes(String variable) {
        super(SElementTypes.class, forVariable(variable), "INFORMATION_SCHEMA", "ELEMENT_TYPES");
        addMetadata();
    }

    public SElementTypes(String variable, String schema, String table) {
        super(SElementTypes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SElementTypes(String variable, String schema) {
        super(SElementTypes.class, forVariable(variable), schema, "ELEMENT_TYPES");
        addMetadata();
    }

    public SElementTypes(Path<? extends SElementTypes> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "ELEMENT_TYPES");
        addMetadata();
    }

    public SElementTypes(PathMetadata metadata) {
        super(SElementTypes.class, metadata, "INFORMATION_SCHEMA", "ELEMENT_TYPES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(characterMaximumLength, ColumnMetadata.named("CHARACTER_MAXIMUM_LENGTH").withIndex(7).ofType(Types.BIGINT).withSize(64));
        addMetadata(characterOctetLength, ColumnMetadata.named("CHARACTER_OCTET_LENGTH").withIndex(8).ofType(Types.BIGINT).withSize(64));
        addMetadata(characterSetCatalog, ColumnMetadata.named("CHARACTER_SET_CATALOG").withIndex(9).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterSetName, ColumnMetadata.named("CHARACTER_SET_NAME").withIndex(11).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterSetSchema, ColumnMetadata.named("CHARACTER_SET_SCHEMA").withIndex(10).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationCatalog, ColumnMetadata.named("COLLATION_CATALOG").withIndex(12).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationName, ColumnMetadata.named("COLLATION_NAME").withIndex(14).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationSchema, ColumnMetadata.named("COLLATION_SCHEMA").withIndex(13).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collectionTypeIdentifier, ColumnMetadata.named("COLLECTION_TYPE_IDENTIFIER").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(dataType, ColumnMetadata.named("DATA_TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(datetimePrecision, ColumnMetadata.named("DATETIME_PRECISION").withIndex(18).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredDataType, ColumnMetadata.named("DECLARED_DATA_TYPE").withIndex(23).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(declaredNumericPrecision, ColumnMetadata.named("DECLARED_NUMERIC_PRECISION").withIndex(24).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredNumericScale, ColumnMetadata.named("DECLARED_NUMERIC_SCALE").withIndex(25).ofType(Types.INTEGER).withSize(32));
        addMetadata(dtdIdentifier, ColumnMetadata.named("DTD_IDENTIFIER").withIndex(22).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(geometrySrid, ColumnMetadata.named("GEOMETRY_SRID").withIndex(27).ofType(Types.INTEGER).withSize(32));
        addMetadata(geometryType, ColumnMetadata.named("GEOMETRY_TYPE").withIndex(26).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(intervalPrecision, ColumnMetadata.named("INTERVAL_PRECISION").withIndex(20).ofType(Types.INTEGER).withSize(32));
        addMetadata(intervalType, ColumnMetadata.named("INTERVAL_TYPE").withIndex(19).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(maximumCardinality, ColumnMetadata.named("MAXIMUM_CARDINALITY").withIndex(21).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecision, ColumnMetadata.named("NUMERIC_PRECISION").withIndex(15).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecisionRadix, ColumnMetadata.named("NUMERIC_PRECISION_RADIX").withIndex(16).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericScale, ColumnMetadata.named("NUMERIC_SCALE").withIndex(17).ofType(Types.INTEGER).withSize(32));
        addMetadata(objectCatalog, ColumnMetadata.named("OBJECT_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectName, ColumnMetadata.named("OBJECT_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectSchema, ColumnMetadata.named("OBJECT_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(objectType, ColumnMetadata.named("OBJECT_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

