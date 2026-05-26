package com.crowdin.client.fields.model.enums;

import com.crowdin.client.core.model.EnumConverter;

public enum EntityType implements EnumConverter<EntityType> {

    PROJECT,
    USER,
    TASK,
    FILE,
    TRANSLATION,
    STRING;

    public static EntityType from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(EntityType v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
