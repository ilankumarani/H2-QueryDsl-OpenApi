package com.querydsl.sql.generated.information_schema;

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
 * SConstants is a Querydsl query type for SConstants
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SConstants extends com.querydsl.sql.RelationalPathBase<SConstants> {

    private static final long serialVersionUID = -844694037;

    public static final SConstants constants = new SConstants("CONSTANTS");

    public final NumberPath<Long> characterMaximumLength = createNumber("characterMaximumLength", Long.class);

    public final NumberPath<Long> characterOctetLength = createNumber("characterOctetLength", Long.class);

    public final StringPath characterSetCatalog = createString("characterSetCatalog");

    public final StringPath characterSetName = createString("characterSetName");

    public final StringPath characterSetSchema = createString("characterSetSchema");

    public final StringPath collationCatalog = createString("collationCatalog");

    public final StringPath collationName = createString("collationName");

    public final StringPath collationSchema = createString("collationSchema");

    public final StringPath constantCatalog = createString("constantCatalog");

    public final StringPath constantName = createString("constantName");

    public final StringPath constantSchema = createString("constantSchema");

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

    public final StringPath remarks = createString("remarks");

    public final StringPath valueDefinition = createString("valueDefinition");

    public SConstants(String variable) {
        super(SConstants.class, forVariable(variable), "INFORMATION_SCHEMA", "CONSTANTS");
        addMetadata();
    }

    public SConstants(String variable, String schema, String table) {
        super(SConstants.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SConstants(String variable, String schema) {
        super(SConstants.class, forVariable(variable), schema, "CONSTANTS");
        addMetadata();
    }

    public SConstants(Path<? extends SConstants> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "CONSTANTS");
        addMetadata();
    }

    public SConstants(PathMetadata metadata) {
        super(SConstants.class, metadata, "INFORMATION_SCHEMA", "CONSTANTS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(characterMaximumLength, ColumnMetadata.named("CHARACTER_MAXIMUM_LENGTH").withIndex(6).ofType(Types.BIGINT).withSize(64));
        addMetadata(characterOctetLength, ColumnMetadata.named("CHARACTER_OCTET_LENGTH").withIndex(7).ofType(Types.BIGINT).withSize(64));
        addMetadata(characterSetCatalog, ColumnMetadata.named("CHARACTER_SET_CATALOG").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterSetName, ColumnMetadata.named("CHARACTER_SET_NAME").withIndex(10).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterSetSchema, ColumnMetadata.named("CHARACTER_SET_SCHEMA").withIndex(9).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationCatalog, ColumnMetadata.named("COLLATION_CATALOG").withIndex(11).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationName, ColumnMetadata.named("COLLATION_NAME").withIndex(13).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationSchema, ColumnMetadata.named("COLLATION_SCHEMA").withIndex(12).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constantCatalog, ColumnMetadata.named("CONSTANT_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constantName, ColumnMetadata.named("CONSTANT_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(constantSchema, ColumnMetadata.named("CONSTANT_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(dataType, ColumnMetadata.named("DATA_TYPE").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(datetimePrecision, ColumnMetadata.named("DATETIME_PRECISION").withIndex(17).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredDataType, ColumnMetadata.named("DECLARED_DATA_TYPE").withIndex(22).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(declaredNumericPrecision, ColumnMetadata.named("DECLARED_NUMERIC_PRECISION").withIndex(23).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredNumericScale, ColumnMetadata.named("DECLARED_NUMERIC_SCALE").withIndex(24).ofType(Types.INTEGER).withSize(32));
        addMetadata(dtdIdentifier, ColumnMetadata.named("DTD_IDENTIFIER").withIndex(21).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(geometrySrid, ColumnMetadata.named("GEOMETRY_SRID").withIndex(26).ofType(Types.INTEGER).withSize(32));
        addMetadata(geometryType, ColumnMetadata.named("GEOMETRY_TYPE").withIndex(25).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(intervalPrecision, ColumnMetadata.named("INTERVAL_PRECISION").withIndex(19).ofType(Types.INTEGER).withSize(32));
        addMetadata(intervalType, ColumnMetadata.named("INTERVAL_TYPE").withIndex(18).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(maximumCardinality, ColumnMetadata.named("MAXIMUM_CARDINALITY").withIndex(20).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecision, ColumnMetadata.named("NUMERIC_PRECISION").withIndex(14).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecisionRadix, ColumnMetadata.named("NUMERIC_PRECISION_RADIX").withIndex(15).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericScale, ColumnMetadata.named("NUMERIC_SCALE").withIndex(16).ofType(Types.INTEGER).withSize(32));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(27).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(valueDefinition, ColumnMetadata.named("VALUE_DEFINITION").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

