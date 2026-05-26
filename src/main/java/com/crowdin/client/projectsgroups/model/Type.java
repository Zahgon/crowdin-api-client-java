package com.crowdin.client.projectsgroups.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Type implements EnumConverter<Type> {

    FILES_BASED(0), STRINGS_BASED(1);

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
