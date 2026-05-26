package com.crowdin.client.stringcomments.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Type implements EnumConverter<Type> {

    COMMENT, ISSUE;

    public static Type from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(Type v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
