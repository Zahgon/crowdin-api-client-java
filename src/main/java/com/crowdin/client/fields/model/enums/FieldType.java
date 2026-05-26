package com.crowdin.client.fields.model.enums;

import com.crowdin.client.core.model.EnumConverter;

public enum FieldType implements EnumConverter<FieldType> {

    CHECKBOX,
    RADIOBUTTONS,
    DATE,
    DATETIME,
    NUMBER,
    LABELS,
    SELECT,
    MULTISELECT,
    TEXT,
    TEXTAREA,
    URL;

    public static FieldType from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(FieldType v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
