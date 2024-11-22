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
 * STriggers is a Querydsl query type for STriggers
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class STriggers extends RelationalPathBase<STriggers> {

    private static final long serialVersionUID = -1290906654;

    public static final STriggers triggers = new STriggers("TRIGGERS");

    public final StringPath actionOrientation = createString("actionOrientation");

    public final StringPath actionTiming = createString("actionTiming");

    public final StringPath eventManipulation = createString("eventManipulation");

    public final StringPath eventObjectCatalog = createString("eventObjectCatalog");

    public final StringPath eventObjectSchema = createString("eventObjectSchema");

    public final StringPath eventObjectTable = createString("eventObjectTable");

    public final BooleanPath isRollback = createBoolean("isRollback");

    public final StringPath javaClass = createString("javaClass");

    public final BooleanPath noWait = createBoolean("noWait");

    public final NumberPath<Integer> queueSize = createNumber("queueSize", Integer.class);

    public final StringPath remarks = createString("remarks");

    public final StringPath triggerCatalog = createString("triggerCatalog");

    public final StringPath triggerName = createString("triggerName");

    public final StringPath triggerSchema = createString("triggerSchema");

    public STriggers(String variable) {
        super(STriggers.class, forVariable(variable), "INFORMATION_SCHEMA", "TRIGGERS");
        addMetadata();
    }

    public STriggers(String variable, String schema, String table) {
        super(STriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public STriggers(String variable, String schema) {
        super(STriggers.class, forVariable(variable), schema, "TRIGGERS");
        addMetadata();
    }

    public STriggers(Path<? extends STriggers> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "TRIGGERS");
        addMetadata();
    }

    public STriggers(PathMetadata metadata) {
        super(STriggers.class, metadata, "INFORMATION_SCHEMA", "TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionOrientation, ColumnMetadata.named("ACTION_ORIENTATION").withIndex(8).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(actionTiming, ColumnMetadata.named("ACTION_TIMING").withIndex(9).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(eventManipulation, ColumnMetadata.named("EVENT_MANIPULATION").withIndex(4).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(eventObjectCatalog, ColumnMetadata.named("EVENT_OBJECT_CATALOG").withIndex(5).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(eventObjectSchema, ColumnMetadata.named("EVENT_OBJECT_SCHEMA").withIndex(6).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(eventObjectTable, ColumnMetadata.named("EVENT_OBJECT_TABLE").withIndex(7).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(isRollback, ColumnMetadata.named("IS_ROLLBACK").withIndex(10).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(javaClass, ColumnMetadata.named("JAVA_CLASS").withIndex(11).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(noWait, ColumnMetadata.named("NO_WAIT").withIndex(13).ofType(Types.BOOLEAN).withSize(1));
        addMetadata(queueSize, ColumnMetadata.named("QUEUE_SIZE").withIndex(12).ofType(Types.INTEGER).withSize(32));
        addMetadata(remarks, ColumnMetadata.named("REMARKS").withIndex(14).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(triggerCatalog, ColumnMetadata.named("TRIGGER_CATALOG").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(triggerSchema, ColumnMetadata.named("TRIGGER_SCHEMA").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

