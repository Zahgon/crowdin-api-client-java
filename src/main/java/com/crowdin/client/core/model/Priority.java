package com.crowdin.client.core.model;

public enum Priority implements EnumConverter<Priority> {

    LOW, NORMAL, HIGH;

    public static Priority from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Priority v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
