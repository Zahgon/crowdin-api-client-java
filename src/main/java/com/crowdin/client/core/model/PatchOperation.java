package com.crowdin.client.core.model;

public enum PatchOperation implements EnumConverter<PatchOperation> {

    ADD,
    REMOVE,
    REPLACE,
    MOVE,
    COPY,
    TEST;

    public static PatchOperation from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(PatchOperation value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
