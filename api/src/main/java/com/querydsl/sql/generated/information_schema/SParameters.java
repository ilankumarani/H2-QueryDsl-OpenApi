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
 * SParameters is a Querydsl query type for SParameters
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SParameters extends com.querydsl.sql.RelationalPathBase<SParameters> {

    private static final long serialVersionUID = 248703182;

    public static final SParameters parameters = new SParameters("PARAMETERS");

    public final StringPath asLocator = createString("asLocator");

    public final NumberPath<Long> characterMaximumLength = createNumber("characterMaximumLength", Long.class);

    public final NumberPath<Long> characterOctetLength = createNumber("characterOctetLength", Long.class);

    public final StringPath characterSetCatalog = createString("characterSetCatalog");

    public final StringPath characterSetName = createString("characterSetName");

    public final StringPath characterSetSchema = createString("characterSetSchema");

    public final StringPath collationCatalog = createString("collationCatalog");

    public final StringPath collationName = createString("collationName");

    public final StringPath collationSchema = createString("collationSchema");

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

    public final StringPath isResult = createString("isResult");

    public final NumberPath<Integer> maximumCardinality = createNumber("maximumCardinality", Integer.class);

    public final NumberPath<Integer> numericPrecision = createNumber("numericPrecision", Integer.class);

    public final NumberPath<Integer> numericPrecisionRadix = createNumber("numericPrecisionRadix", Integer.class);

    public final NumberPath<Integer> numericScale = createNumber("numericScale", Integer.class);

    public final NumberPath<Integer> ordinalPosition = createNumber("ordinalPosition", Integer.class);

    public final StringPath parameterDefault = createString("parameterDefault");

    public final StringPath parameterMode = createString("parameterMode");

    public final StringPath parameterName = createString("parameterName");

    public final StringPath specificCatalog = createString("specificCatalog");

    public final StringPath specificName = createString("specificName");

    public final StringPath specificSchema = createString("specificSchema");

    public SParameters(String variable) {
        super(SParameters.class, forVariable(variable), "INFORMATION_SCHEMA", "PARAMETERS");
        addMetadata();
    }

    public SParameters(String variable, String schema, String table) {
        super(SParameters.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SParameters(String variable, String schema) {
        super(SParameters.class, forVariable(variable), schema, "PARAMETERS");
        addMetadata();
    }

    public SParameters(Path<? extends SParameters> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "PARAMETERS");
        addMetadata();
    }

    public SParameters(PathMetadata metadata) {
        super(SParameters.class, metadata, "INFORMATION_SCHEMA", "PARAMETERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(asLocator, ColumnMetadata.named("AS_LOCATOR").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterMaximumLength, ColumnMetadata.named("CHARACTER_MAXIMUM_LENGTH").withIndex(10).ofType(Types.BIGINT).withSize(64));
        addMetadata(characterOctetLength, ColumnMetadata.named("CHARACTER_OCTET_LENGTH").withIndex(11).ofType(Types.BIGINT).withSize(64));
        addMetadata(characterSetCatalog, ColumnMetadata.named("CHARACTER_SET_CATALOG").withIndex(12).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterSetName, ColumnMetadata.named("CHARACTER_SET_NAME").withIndex(14).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterSetSchema, ColumnMetadata.named("CHARACTER_SET_SCHEMA").withIndex(13).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationCatalog, ColumnMetadata.named("COLLATION_CATALOG").withIndex(15).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationName, ColumnMetadata.named("COLLATION_NAME").withIndex(17).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationSchema, ColumnMetadata.named("COLLATION_SCHEMA").withIndex(16).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(dataType, ColumnMetadata.named("DATA_TYPE").withIndex(9).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(datetimePrecision, ColumnMetadata.named("DATETIME_PRECISION").withIndex(21).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredDataType, ColumnMetadata.named("DECLARED_DATA_TYPE").withIndex(26).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(declaredNumericPrecision, ColumnMetadata.named("DECLARED_NUMERIC_PRECISION").withIndex(27).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredNumericScale, ColumnMetadata.named("DECLARED_NUMERIC_SCALE").withIndex(28).ofType(Types.INTEGER).withSize(32));
        addMetadata(dtdIdentifier, ColumnMetadata.named("DTD_IDENTIFIER").withIndex(25).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(geometrySrid, ColumnMetadata.named("GEOMETRY_SRID").withIndex(31).ofType(Types.INTEGER).withSize(32));
        addMetadata(geometryType, ColumnMetadata.named("GEOMETRY_TYPE").withIndex(30).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(intervalPrecision, ColumnMetadata.named("INTERVAL_PRECISION").withIndex(23).ofType(Types.INTEGER).withSize(32));
        addMetadata(intervalType, ColumnMetadata.named("INTERVAL_TYPE").withIndex(22).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isResult, ColumnMetadata.named("IS_RESULT").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(maximumCardinality, ColumnMetadata.named("MAXIMUM_CARDINALITY").withIndex(24).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecision, ColumnMetadata.named("NUMERIC_PRECISION").withIndex(18).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecisionRadix, ColumnMetadata.named("NUMERIC_PRECISION_RADIX").withIndex(19).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericScale, ColumnMetadata.named("NUMERIC_SCALE").withIndex(20).ofType(Types.INTEGER).withSize(32));
        addMetadata(ordinalPosition, ColumnMetadata.named("ORDINAL_POSITION").withIndex(4).ofType(Types.INTEGER).withSize(32));
        addMetadata(parameterDefault, ColumnMetadata.named("PARAMETER_DEFAULT").withIndex(29).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(parameterMode, ColumnMetadata.named("PARAMETER_MODE").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(parameterName, ColumnMetadata.named("PARAMETER_NAME").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(specificCatalog, ColumnMetadata.named("SPECIFIC_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(specificName, ColumnMetadata.named("SPECIFIC_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(specificSchema, ColumnMetadata.named("SPECIFIC_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

