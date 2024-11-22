package com.querydsl.sql.information_schema;

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
 * SRoutines is a Querydsl query type for SRoutines
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SRoutines extends com.querydsl.sql.RelationalPathBase<SRoutines> {

    private static final long serialVersionUID = 1448829716;

    public static final SRoutines routines = new SRoutines("ROUTINES");

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

    public final StringPath externalLanguage = createString("externalLanguage");

    public final StringPath externalName = createString("externalName");

    public final NumberPath<Integer> geometrySrid = createNumber("geometrySrid", Integer.class);

    public final StringPath geometryType = createString("geometryType");

    public final NumberPath<Integer> intervalPrecision = createNumber("intervalPrecision", Integer.class);

    public final StringPath intervalType = createString("intervalType");

    public final StringPath isDeterministic = createString("isDeterministic");

    public final NumberPath<Integer> maximumCardinality = createNumber("maximumCardinality", Integer.class);

    public final NumberPath<Integer> numericPrecision = createNumber("numericPrecision", Integer.class);

    public final NumberPath<Integer> numericPrecisionRadix = createNumber("numericPrecisionRadix", Integer.class);

    public final NumberPath<Integer> numericScale = createNumber("numericScale", Integer.class);

    public final StringPath parameterStyle = createString("parameterStyle");

    public final StringPath remarks = createString("remarks");

    public final StringPath routineBody = createString("routineBody");

    public final StringPath routineCatalog = createString("routineCatalog");

    public final StringPath routineDefinition = createString("routineDefinition");

    public final StringPath routineName = createString("routineName");

    public final StringPath routineSchema = createString("routineSchema");

    public final StringPath routineType = createString("routineType");

    public final StringPath specificCatalog = createString("specificCatalog");

    public final StringPath specificName = createString("specificName");

    public final StringPath specificSchema = createString("specificSchema");

    public SRoutines(String variable) {
        super(SRoutines.class, forVariable(variable), "INFORMATION_SCHEMA", "ROUTINES");
        addMetadata();
    }

    public SRoutines(String variable, String schema, String table) {
        super(SRoutines.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SRoutines(String variable, String schema) {
        super(SRoutines.class, forVariable(variable), schema, "ROUTINES");
        addMetadata();
    }

    public SRoutines(Path<? extends SRoutines> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "ROUTINES");
        addMetadata();
    }

    public SRoutines(PathMetadata metadata) {
        super(SRoutines.class, metadata, "INFORMATION_SCHEMA", "ROUTINES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(characterMaximumLength, ColumnMetadata.named("CHARACTER_MAXIMUM_LENGTH").withIndex(9).ofType(Types.BIGINT).withSize(64));
        addMetadata(characterOctetLength, ColumnMetadata.named("CHARACTER_OCTET_LENGTH").withIndex(10).ofType(Types.BIGINT).withSize(64));
        addMetadata(characterSetCatalog, ColumnMetadata.named("CHARACTER_SET_CATALOG").withIndex(11).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterSetName, ColumnMetadata.named("CHARACTER_SET_NAME").withIndex(13).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterSetSchema, ColumnMetadata.named("CHARACTER_SET_SCHEMA").withIndex(12).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationCatalog, ColumnMetadata.named("COLLATION_CATALOG").withIndex(14).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationName, ColumnMetadata.named("COLLATION_NAME").withIndex(16).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationSchema, ColumnMetadata.named("COLLATION_SCHEMA").withIndex(15).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(dataType, ColumnMetadata.named("DATA_TYPE").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(datetimePrecision, ColumnMetadata.named("DATETIME_PRECISION").withIndex(20).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredDataType, ColumnMetadata.named("DECLARED_DATA_TYPE").withIndex(31).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(declaredNumericPrecision, ColumnMetadata.named("DECLARED_NUMERIC_PRECISION").withIndex(32).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredNumericScale, ColumnMetadata.named("DECLARED_NUMERIC_SCALE").withIndex(33).ofType(Types.INTEGER).withSize(32));
        addMetadata(dtdIdentifier, ColumnMetadata.named("DTD_IDENTIFIER").withIndex(24).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(externalLanguage, ColumnMetadata.named("EXTERNAL_LANGUAGE").withIndex(28).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(externalName, ColumnMetadata.named("EXTERNAL_NAME").withIndex(27).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(geometrySrid, ColumnMetadata.named("GEOMETRY_SRID").withIndex(35).ofType(Types.INTEGER).withSize(32));
        addMetadata(geometryType, ColumnMetadata.named("GEOMETRY_TYPE").withIndex(34).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(intervalPrecision, ColumnMetadata.named("INTERVAL_PRECISION").withIndex(22).ofType(Types.INTEGER).withSize(32));
        addMetadata(intervalType, ColumnMetadata.named("INTERVAL_TYPE").withIndex(21).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isDeterministic, ColumnMetadata.named("IS_DETERMINISTIC").withIndex(30).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(maximumCardinality, ColumnMetadata.named("MAXIMUM_CARDINALITY").withIndex(23).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecision, ColumnMetadata.named("NUMERIC_PRECISION").withIndex(17).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecisionRadix, ColumnMetadata.named("NUMERIC_PRECISION_RADIX").withIndex(18).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericScale, ColumnMetadata.named("NUMERIC_SCALE").withIndex(19).ofType(Types.INTEGER).withSize(32));
        addMetadata(parameterStyle, ColumnMetadata.named("PARAMETER_STYLE").withIndex(29).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(36).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(routineBody, ColumnMetadata.named("ROUTINE_BODY").withIndex(25).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(routineCatalog, ColumnMetadata.named("ROUTINE_CATALOG").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(routineDefinition, ColumnMetadata.named("ROUTINE_DEFINITION").withIndex(26).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(routineName, ColumnMetadata.named("ROUTINE_NAME").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(routineSchema, ColumnMetadata.named("ROUTINE_SCHEMA").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(routineType, ColumnMetadata.named("ROUTINE_TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(specificCatalog, ColumnMetadata.named("SPECIFIC_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(specificName, ColumnMetadata.named("SPECIFIC_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(specificSchema, ColumnMetadata.named("SPECIFIC_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

