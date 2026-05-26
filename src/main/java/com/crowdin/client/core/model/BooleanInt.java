package com.crowdin.client.core.model;

public enum BooleanInt implements EnumConverter<BooleanInt> {

    TRUE(1), FALSE(0);

    private final int val;

    BooleanInt(int val) {
        this.val = val;
    }

    public static BooleanInt from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static BooleanInt fromInt(Integer value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Integer to(BooleanInt v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
