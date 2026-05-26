package com.crowdin.client.issues.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Type implements EnumConverter<Type> {

    ALL, GENERAL_QUESTION, TRANSLATION_MISTAKE, CONTEXT_REQUEST, SOURCE_MISTAKE;

    public static Type from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(Type v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
