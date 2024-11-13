package com.sql.relation;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SQueryStatistics is a Querydsl query type for SQueryStatistics
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SQueryStatistics extends com.querydsl.sql.RelationalPathBase<SQueryStatistics> {

    private static final long serialVersionUID = -1483997923;

    public static final SQueryStatistics queryStatistics = new SQueryStatistics("QUERY_STATISTICS");

    public final NumberPath<Double> averageExecutionTime = createNumber("averageExecutionTime", Double.class);

    public final NumberPath<Double> averageRowCount = createNumber("averageRowCount", Double.class);

    public final NumberPath<Double> cumulativeExecutionTime = createNumber("cumulativeExecutionTime", Double.class);

    public final NumberPath<Long> cumulativeRowCount = createNumber("cumulativeRowCount", Long.class);

    public final NumberPath<Integer> executionCount = createNumber("executionCount", Integer.class);

    public final NumberPath<Double> maxExecutionTime = createNumber("maxExecutionTime", Double.class);

    public final NumberPath<Long> maxRowCount = createNumber("maxRowCount", Long.class);

    public final NumberPath<Double> minExecutionTime = createNumber("minExecutionTime", Double.class);

    public final NumberPath<Long> minRowCount = createNumber("minRowCount", Long.class);

    public final StringPath sqlStatement = createString("sqlStatement");

    public final NumberPath<Double> stdDevExecutionTime = createNumber("stdDevExecutionTime", Double.class);

    public final NumberPath<Double> stdDevRowCount = createNumber("stdDevRowCount", Double.class);

    public SQueryStatistics(String variable) {
        super(SQueryStatistics.class, forVariable(variable), "INFORMATION_SCHEMA", "QUERY_STATISTICS");
        addMetadata();
    }

    public SQueryStatistics(String variable, String schema, String table) {
        super(SQueryStatistics.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SQueryStatistics(String variable, String schema) {
        super(SQueryStatistics.class, forVariable(variable), schema, "QUERY_STATISTICS");
        addMetadata();
    }

    public SQueryStatistics(Path<? extends SQueryStatistics> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "QUERY_STATISTICS");
        addMetadata();
    }

    public SQueryStatistics(PathMetadata metadata) {
        super(SQueryStatistics.class, metadata, "INFORMATION_SCHEMA", "QUERY_STATISTICS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(averageExecutionTime, ColumnMetadata.named("AVERAGE_EXECUTION_TIME").withIndex(6).ofType(Types.DOUBLE).withSize(53));
        addMetadata(averageRowCount, ColumnMetadata.named("AVERAGE_ROW_COUNT").withIndex(11).ofType(Types.DOUBLE).withSize(53));
        addMetadata(cumulativeExecutionTime, ColumnMetadata.named("CUMULATIVE_EXECUTION_TIME").withIndex(5).ofType(Types.DOUBLE).withSize(53));
        addMetadata(cumulativeRowCount, ColumnMetadata.named("CUMULATIVE_ROW_COUNT").withIndex(10).ofType(Types.BIGINT).withSize(64));
        addMetadata(executionCount, ColumnMetadata.named("EXECUTION_COUNT").withIndex(2).ofType(Types.INTEGER).withSize(32));
        addMetadata(maxExecutionTime, ColumnMetadata.named("MAX_EXECUTION_TIME").withIndex(4).ofType(Types.DOUBLE).withSize(53));
        addMetadata(maxRowCount, ColumnMetadata.named("MAX_ROW_COUNT").withIndex(9).ofType(Types.BIGINT).withSize(64));
        addMetadata(minExecutionTime, ColumnMetadata.named("MIN_EXECUTION_TIME").withIndex(3).ofType(Types.DOUBLE).withSize(53));
        addMetadata(minRowCount, ColumnMetadata.named("MIN_ROW_COUNT").withIndex(8).ofType(Types.BIGINT).withSize(64));
        addMetadata(sqlStatement, ColumnMetadata.named("SQL_STATEMENT").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(stdDevExecutionTime, ColumnMetadata.named("STD_DEV_EXECUTION_TIME").withIndex(7).ofType(Types.DOUBLE).withSize(53));
        addMetadata(stdDevRowCount, ColumnMetadata.named("STD_DEV_ROW_COUNT").withIndex(12).ofType(Types.DOUBLE).withSize(53));
    }

}

