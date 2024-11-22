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
 * SSessions is a Querydsl query type for SSessions
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SSessions extends RelationalPathBase<SSessions> {

    private static final long serialVersionUID = -1388920124;

    public static final SSessions sessions = new SSessions("SESSIONS");

    public final NumberPath<Integer> blockerId = createNumber("blockerId", Integer.class);

    public final StringPath clientAddr = createString("clientAddr");

    public final StringPath clientInfo = createString("clientInfo");

    public final BooleanPath containsUncommitted = createBoolean("containsUncommitted");

    public final StringPath executingStatement = createString("executingStatement");

    public final DateTimePath<java.sql.Timestamp> executingStatementStart = createDateTime("executingStatementStart", java.sql.Timestamp.class);

    public final StringPath isolationLevel = createString("isolationLevel");

    public final StringPath server = createString("server");

    public final NumberPath<Integer> sessionId = createNumber("sessionId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> sessionStart = createDateTime("sessionStart", java.sql.Timestamp.class);

    public final StringPath sessionState = createString("sessionState");

    public final DateTimePath<java.sql.Timestamp> sleepSince = createDateTime("sleepSince", java.sql.Timestamp.class);

    public final StringPath userName = createString("userName");

    public SSessions(String variable) {
        super(SSessions.class, forVariable(variable), "INFORMATION_SCHEMA", "SESSIONS");
        addMetadata();
    }

    public SSessions(String variable, String schema, String table) {
        super(SSessions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SSessions(String variable, String schema) {
        super(SSessions.class, forVariable(variable), schema, "SESSIONS");
        addMetadata();
    }

    public SSessions(Path<? extends SSessions> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "SESSIONS");
        addMetadata();
    }

    public SSessions(PathMetadata metadata) {
        super(SSessions.class, metadata, "INFORMATION_SCHEMA", "SESSIONS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(blockerId, ColumnMetadata.named("BLOCKER_ID").withIndex(12).ofType(Types.INTEGER).withSize(32));
        addMetadata(clientAddr, ColumnMetadata.named("CLIENT_ADDR").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(clientInfo, ColumnMetadata.named("CLIENT_INFO").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(containsUncommitted, ColumnMetadata.named("CONTAINS_UNCOMMITTED").withIndex(10).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(executingStatement, ColumnMetadata.named("EXECUTING_STATEMENT").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(executingStatementStart, ColumnMetadata.named("EXECUTING_STATEMENT_START").withIndex(9).ofType(Types.TIMESTAMP_WITH_TIMEZONE).withSize(35).withDigits(9));
        addMetadata(isolationLevel, ColumnMetadata.named("ISOLATION_LEVEL").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(server, ColumnMetadata.named("SERVER").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(sessionId, ColumnMetadata.named("SESSION_ID").withIndex(1).ofType(Types.INTEGER).withSize(32));
        addMetadata(sessionStart, ColumnMetadata.named("SESSION_START").withIndex(6).ofType(Types.TIMESTAMP_WITH_TIMEZONE).withSize(35).withDigits(9));
        addMetadata(sessionState, ColumnMetadata.named("SESSION_STATE").withIndex(11).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(sleepSince, ColumnMetadata.named("SLEEP_SINCE").withIndex(13).ofType(Types.TIMESTAMP_WITH_TIMEZONE).withSize(35).withDigits(9));
        addMetadata(userName, ColumnMetadata.named("USER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

