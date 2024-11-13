package com.myproject.mydomain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * SSessionState is a Querydsl query type for SSessionState
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SSessionState extends com.querydsl.sql.RelationalPathBase<SSessionState> {

    private static final long serialVersionUID = 1444986238;

    public static final SSessionState sessionState = new SSessionState("SESSION_STATE");

    public final StringPath stateCommand = createString("stateCommand");

    public final StringPath stateKey = createString("stateKey");

    public SSessionState(String variable) {
        super(SSessionState.class, forVariable(variable), "INFORMATION_SCHEMA", "SESSION_STATE");
        addMetadata();
    }

    public SSessionState(String variable, String schema, String table) {
        super(SSessionState.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SSessionState(String variable, String schema) {
        super(SSessionState.class, forVariable(variable), schema, "SESSION_STATE");
        addMetadata();
    }

    public SSessionState(Path<? extends SSessionState> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "SESSION_STATE");
        addMetadata();
    }

    public SSessionState(PathMetadata metadata) {
        super(SSessionState.class, metadata, "INFORMATION_SCHEMA", "SESSION_STATE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(stateCommand, ColumnMetadata.named("STATE_COMMAND").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(stateKey, ColumnMetadata.named("STATE_KEY").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

