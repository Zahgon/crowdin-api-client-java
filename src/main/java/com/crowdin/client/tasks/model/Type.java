package com.crowdin.client.tasks.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Type implements EnumConverter<Type> {

    PROOFREAD(1), TRANSLATE(0);

    private final int val;

    Type(int val) {
        this.val = val;
    }

    public static Type from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Integer to(Type v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
