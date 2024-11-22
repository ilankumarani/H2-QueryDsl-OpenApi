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
 * SSettings is a Querydsl query type for SSettings
 */
@SuppressWarnings("this-escape")
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class SSettings extends com.querydsl.sql.RelationalPathBase<SSettings> {

    private static final long serialVersionUID = -1417058552;

    public static final SSettings settings = new SSettings("SETTINGS");

    public final StringPath settingName = createString("settingName");

    public final StringPath settingValue = createString("settingValue");

    public SSettings(String variable) {
        super(SSettings.class, forVariable(variable), "INFORMATION_SCHEMA", "SETTINGS");
        addMetadata();
    }

    public SSettings(String variable, String schema, String table) {
        super(SSettings.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public SSettings(String variable, String schema) {
        super(SSettings.class, forVariable(variable), schema, "SETTINGS");
        addMetadata();
    }

    public SSettings(Path<? extends SSettings> path) {
        super(path.getType(), path.getMetadata(), "INFORMATION_SCHEMA", "SETTINGS");
        addMetadata();
    }

    public SSettings(PathMetadata metadata) {
        super(SSettings.class, metadata, "INFORMATION_SCHEMA", "SETTINGS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(settingName, ColumnMetadata.named("SETTING_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(1000000000));
        addMetadata(settingValue, ColumnMetadata.named("SETTING_VALUE").withIndex(2).ofType(Types.VARCHAR).withSize(1000000000));
    }

}

