package com.crowdin.client.clients.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Status implements EnumConverter<Status> {

    PENDING, CONFIRMED, REJECTED;

    public static Status from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Status v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
