package com.myproject.mydomain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SColumns is a Querydsl query type for SColumns
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SColumns extends com.querydsl.sql.RelationalPathBase<SColumns> {

    private static final long serialVersionUID = -276957158;

    public static final SColumns columns = new SColumns("COLUMNS");

    public final NumberPath<Long> characterMaximumLength = createNumber("characterMaximumLength", Long.class);

    public final NumberPath<Long> characterOctetLength = createNumber("characterOctetLength", Long.class);

    public final StringPath characterSetCatalog = createString("characterSetCatalog");

    public final StringPath characterSetName = createString("characterSetName");

    public final StringPath characterSetSchema = createString("characterSetSchema");

    public final StringPath collationCatalog = createString("collationCatalog");

    public final StringPath collationName = createString("collationName");

    public final StringPath collationSchema = createString("collationSchema");

    public final StringPath columnDefault = createString("columnDefault");

    public final StringPath columnName = createString("columnName");

    public final StringPath columnOnUpdate = createString("columnOnUpdate");

    public final StringPath dataType = createString("dataType");

    public final NumberPath<Integer> datetimePrecision = createNumber("datetimePrecision", Integer.class);

    public final StringPath declaredDataType = createString("declaredDataType");

    public final NumberPath<Integer> declaredNumericPrecision = createNumber("declaredNumericPrecision", Integer.class);

    public final NumberPath<Integer> declaredNumericScale = createNumber("declaredNumericScale", Integer.class);

    public final BooleanPath defaultOnNull = createBoolean("defaultOnNull");

    public final StringPath domainCatalog = createString("domainCatalog");

    public final StringPath domainName = createString("domainName");

    public final StringPath domainSchema = createString("domainSchema");

    public final StringPath dtdIdentifier = createString("dtdIdentifier");

    public final StringPath generationExpression = createString("generationExpression");

    public final NumberPath<Integer> geometrySrid = createNumber("geometrySrid", Integer.class);

    public final StringPath geometryType = createString("geometryType");

    public final NumberPath<Long> identityBase = createNumber("identityBase", Long.class);

    public final NumberPath<Long> identityCache = createNumber("identityCache", Long.class);

    public final StringPath identityCycle = createString("identityCycle");

    public final StringPath identityGeneration = createString("identityGeneration");

    public final NumberPath<Long> identityIncrement = createNumber("identityIncrement", Long.class);

    public final NumberPath<Long> identityMaximum = createNumber("identityMaximum", Long.class);

    public final NumberPath<Long> identityMinimum = createNumber("identityMinimum", Long.class);

    public final NumberPath<Long> identityStart = createNumber("identityStart", Long.class);

    public final NumberPath<Integer> intervalPrecision = createNumber("intervalPrecision", Integer.class);

    public final StringPath intervalType = createString("intervalType");

    public final StringPath isGenerated = createString("isGenerated");

    public final StringPath isIdentity = createString("isIdentity");

    public final StringPath isNullable = createString("isNullable");

    public final BooleanPath isVisible = createBoolean("isVisible");

    public final NumberPath<Integer> maximumCardinality = createNumber("maximumCardinality", Integer.class);

    public final NumberPath<Integer> numericPrecision = createNumber("numericPrecision", Integer.class);

    public final NumberPath<Integer> numericPrecisionRadix = createNumber("numericPrecisionRadix", Integer.class);

    public final NumberPath<Integer> numericScale = createNumber("numericScale", Integer.class);

    public final NumberPath<Integer> ordinalPosition = createNumber("ordinalPosition", Integer.class);

    public final StringPath remarks = createString("remarks");

    public final NumberPath<Integer> selectivity = createNumber("selectivity", Integer.class);

    public final StringPath tableCatalog = createString("tableCatalog");

    public final StringPath tableName = createString("tableName");

    public final StringPath tableSchema = createString("tableSchema");

    public SColumns(String variable) {
        super(SColumns.class, forVariable(variable), "INFORMATION_SCHEMA", "COLUMNS");
        addMetadata();
    }

    public SColumns(String variable, String schema, String table) {
        super(SColumns.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SColumns(String variable, String schema) {
        super(SColumns.class, forVariable(variable), schema, "COLUMNS");
        addMetadata();
    }

    public SColumns(Path<? extends SColumns> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "COLUMNS");
        addMetadata();
    }

    public SColumns(PathMetadata metadata) {
        super(SColumns.class, metadata, "INFORMATION_SCHEMA", "COLUMNS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(characterMaximumLength, ColumnMetadata.named("CHARACTER_MAXIMUM_LENGTH").withIndex(9).ofType(Types.BIGINT).withSize(64));
        addMetadata(characterOctetLength, ColumnMetadata.named("CHARACTER_OCTET_LENGTH").withIndex(10).ofType(Types.BIGINT).withSize(64));
        addMetadata(characterSetCatalog, ColumnMetadata.named("CHARACTER_SET_CATALOG").withIndex(17).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterSetName, ColumnMetadata.named("CHARACTER_SET_NAME").withIndex(19).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(characterSetSchema, ColumnMetadata.named("CHARACTER_SET_SCHEMA").withIndex(18).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationCatalog, ColumnMetadata.named("COLLATION_CATALOG").withIndex(20).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationName, ColumnMetadata.named("COLLATION_NAME").withIndex(22).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(collationSchema, ColumnMetadata.named("COLLATION_SCHEMA").withIndex(21).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(columnDefault, ColumnMetadata.named("COLUMN_DEFAULT").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(columnName, ColumnMetadata.named("COLUMN_NAME").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(columnOnUpdate, ColumnMetadata.named("COLUMN_ON_UPDATE").withIndex(44).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(dataType, ColumnMetadata.named("DATA_TYPE").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(datetimePrecision, ColumnMetadata.named("DATETIME_PRECISION").withIndex(14).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredDataType, ColumnMetadata.named("DECLARED_DATA_TYPE").withIndex(37).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(declaredNumericPrecision, ColumnMetadata.named("DECLARED_NUMERIC_PRECISION").withIndex(38).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredNumericScale, ColumnMetadata.named("DECLARED_NUMERIC_SCALE").withIndex(39).ofType(Types.INTEGER).withSize(32));
        addMetadata(defaultOnNull, ColumnMetadata.named("DEFAULT_ON_NULL").withIndex(46).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(domainCatalog, ColumnMetadata.named("DOMAIN_CATALOG").withIndex(23).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(domainName, ColumnMetadata.named("DOMAIN_NAME").withIndex(25).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(domainSchema, ColumnMetadata.named("DOMAIN_SCHEMA").withIndex(24).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(dtdIdentifier, ColumnMetadata.named("DTD_IDENTIFIER").withIndex(27).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(generationExpression, ColumnMetadata.named("GENERATION_EXPRESSION").withIndex(36).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(geometrySrid, ColumnMetadata.named("GEOMETRY_SRID").withIndex(41).ofType(Types.INTEGER).withSize(32));
        addMetadata(geometryType, ColumnMetadata.named("GEOMETRY_TYPE").withIndex(40).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(identityBase, ColumnMetadata.named("IDENTITY_BASE").withIndex(42).ofType(Types.BIGINT).withSize(64));
        addMetadata(identityCache, ColumnMetadata.named("IDENTITY_CACHE").withIndex(43).ofType(Types.BIGINT).withSize(64));
        addMetadata(identityCycle, ColumnMetadata.named("IDENTITY_CYCLE").withIndex(34).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(identityGeneration, ColumnMetadata.named("IDENTITY_GENERATION").withIndex(29).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(identityIncrement, ColumnMetadata.named("IDENTITY_INCREMENT").withIndex(31).ofType(Types.BIGINT).withSize(64));
        addMetadata(identityMaximum, ColumnMetadata.named("IDENTITY_MAXIMUM").withIndex(32).ofType(Types.BIGINT).withSize(64));
        addMetadata(identityMinimum, ColumnMetadata.named("IDENTITY_MINIMUM").withIndex(33).ofType(Types.BIGINT).withSize(64));
        addMetadata(identityStart, ColumnMetadata.named("IDENTITY_START").withIndex(30).ofType(Types.BIGINT).withSize(64));
        addMetadata(intervalPrecision, ColumnMetadata.named("INTERVAL_PRECISION").withIndex(16).ofType(Types.INTEGER).withSize(32));
        addMetadata(intervalType, ColumnMetadata.named("INTERVAL_TYPE").withIndex(15).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isGenerated, ColumnMetadata.named("IS_GENERATED").withIndex(35).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isIdentity, ColumnMetadata.named("IS_IDENTITY").withIndex(28).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isNullable, ColumnMetadata.named("IS_NULLABLE").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isVisible, ColumnMetadata.named("IS_VISIBLE").withIndex(45).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(maximumCardinality, ColumnMetadata.named("MAXIMUM_CARDINALITY").withIndex(26).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecision, ColumnMetadata.named("NUMERIC_PRECISION").withIndex(11).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecisionRadix, ColumnMetadata.named("NUMERIC_PRECISION_RADIX").withIndex(12).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericScale, ColumnMetadata.named("NUMERIC_SCALE").withIndex(13).ofType(Types.INTEGER).withSize(32));
        addMetadata(ordinalPosition, ColumnMetadata.named("ORDINAL_POSITION").withIndex(5).ofType(Types.INTEGER).withSize(32));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(48).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(selectivity, ColumnMetadata.named("SELECTIVITY").withIndex(47).ofType(Types.INTEGER).withSize(32));
        addMetadata(tableCatalog, ColumnMetadata.named("TABLE_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableName, ColumnMetadata.named("TABLE_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(tableSchema, ColumnMetadata.named("TABLE_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

