package com.crowdin.client.core.model;

public enum SortOrder implements EnumConverter<SortOrder> {

    ASC, DESC;

    public static SortOrder from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(SortOrder v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
