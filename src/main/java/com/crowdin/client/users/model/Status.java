package com.crowdin.client.users.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Status implements EnumConverter<Status> {

    ACTIVE, PENDING, BLOCKED;

    public static Status from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(Status v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
