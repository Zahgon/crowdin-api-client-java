package com.crowdin.client.issues.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Status implements EnumConverter<Status> {

    ALL, RESOLVED, UNRESOLVED;

    public static Status from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(Status v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
