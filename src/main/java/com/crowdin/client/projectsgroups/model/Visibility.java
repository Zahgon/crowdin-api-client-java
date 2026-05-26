package com.crowdin.client.projectsgroups.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Visibility implements EnumConverter<Visibility> {

    OPEN, PRIVATE;

    public static Visibility from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(Visibility v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
