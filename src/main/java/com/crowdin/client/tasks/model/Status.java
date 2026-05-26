package com.crowdin.client.tasks.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Status implements EnumConverter<Status> {

    TODO, IN_PROGRESS, DONE, CLOSED;

    public static Status from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Status v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
