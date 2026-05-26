package com.crowdin.client.glossaries.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Type implements EnumConverter<Type> {

    FULL_FORM,
    ACRONYM,
    ABBREVIATION,
    SHORT_FORM,
    PHRASE,
    VARIANT;

    public static Type from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Type v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
