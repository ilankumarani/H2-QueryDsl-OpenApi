package com.myproject.mydomain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SSequences is a Querydsl query type for SSequences
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SSequences extends com.querydsl.sql.RelationalPathBase<SSequences> {

    private static final long serialVersionUID = 1164559823;

    public static final SSequences sequences = new SSequences("SEQUENCES");

    public final NumberPath<Long> baseValue = createNumber("baseValue", Long.class);

    public final NumberPath<Long> cache = createNumber("cache", Long.class);

    public final StringPath cycleOption = createString("cycleOption");

    public final StringPath dataType = createString("dataType");

    public final StringPath declaredDataType = createString("declaredDataType");

    public final NumberPath<Integer> declaredNumericPrecision = createNumber("declaredNumericPrecision", Integer.class);

    public final NumberPath<Integer> declaredNumericScale = createNumber("declaredNumericScale", Integer.class);

    public final NumberPath<Long> increment = createNumber("increment", Long.class);

    public final NumberPath<Long> maximumValue = createNumber("maximumValue", Long.class);

    public final NumberPath<Long> minimumValue = createNumber("minimumValue", Long.class);

    public final NumberPath<Integer> numericPrecision = createNumber("numericPrecision", Integer.class);

    public final NumberPath<Integer> numericPrecisionRadix = createNumber("numericPrecisionRadix", Integer.class);

    public final NumberPath<Integer> numericScale = createNumber("numericScale", Integer.class);

    public final StringPath remarks = createString("remarks");

    public final StringPath sequenceCatalog = createString("sequenceCatalog");

    public final StringPath sequenceName = createString("sequenceName");

    public final StringPath sequenceSchema = createString("sequenceSchema");

    public final NumberPath<Long> startValue = createNumber("startValue", Long.class);

    public SSequences(String variable) {
        super(SSequences.class, forVariable(variable), "INFORMATION_SCHEMA", "SEQUENCES");
        addMetadata();
    }

    public SSequences(String variable, String schema, String table) {
        super(SSequences.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SSequences(String variable, String schema) {
        super(SSequences.class, forVariable(variable), schema, "SEQUENCES");
        addMetadata();
    }

    public SSequences(Path<? extends SSequences> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "SEQUENCES");
        addMetadata();
    }

    public SSequences(PathMetadata metadata) {
        super(SSequences.class, metadata, "INFORMATION_SCHEMA", "SEQUENCES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(baseValue, ColumnMetadata.named("BASE_VALUE").withIndex(16).ofType(Types.BIGINT).withSize(64));
        addMetadata(cache, ColumnMetadata.named("CACHE").withIndex(17).ofType(Types.BIGINT).withSize(64));
        addMetadata(cycleOption, ColumnMetadata.named("CYCLE_OPTION").withIndex(12).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(dataType, ColumnMetadata.named("DATA_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(declaredDataType, ColumnMetadata.named("DECLARED_DATA_TYPE").withIndex(13).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(declaredNumericPrecision, ColumnMetadata.named("DECLARED_NUMERIC_PRECISION").withIndex(14).ofType(Types.INTEGER).withSize(32));
        addMetadata(declaredNumericScale, ColumnMetadata.named("DECLARED_NUMERIC_SCALE").withIndex(15).ofType(Types.INTEGER).withSize(32));
        addMetadata(increment, ColumnMetadata.named("INCREMENT").withIndex(11).ofType(Types.BIGINT).withSize(64));
        addMetadata(maximumValue, ColumnMetadata.named("MAXIMUM_VALUE").withIndex(10).ofType(Types.BIGINT).withSize(64));
        addMetadata(minimumValue, ColumnMetadata.named("MINIMUM_VALUE").withIndex(9).ofType(Types.BIGINT).withSize(64));
        addMetadata(numericPrecision, ColumnMetadata.named("NUMERIC_PRECISION").withIndex(5).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericPrecisionRadix, ColumnMetadata.named("NUMERIC_PRECISION_RADIX").withIndex(6).ofType(Types.INTEGER).withSize(32));
        addMetadata(numericScale, ColumnMetadata.named("NUMERIC_SCALE").withIndex(7).ofType(Types.INTEGER).withSize(32));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(18).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(sequenceCatalog, ColumnMetadata.named("SEQUENCE_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(sequenceName, ColumnMetadata.named("SEQUENCE_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(sequenceSchema, ColumnMetadata.named("SEQUENCE_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(startValue, ColumnMetadata.named("START_VALUE").withIndex(8).ofType(Types.BIGINT).withSize(64));
    }

}

