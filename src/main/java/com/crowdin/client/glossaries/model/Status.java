package com.crowdin.client.glossaries.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Status implements EnumConverter<Status> {

    PREFERRED, ADMITTED, NOT_RECOMMENDED, OBSOLETE;

    public static Status from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Status v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
