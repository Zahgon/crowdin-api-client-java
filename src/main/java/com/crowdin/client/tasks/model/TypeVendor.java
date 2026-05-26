package com.crowdin.client.tasks.model;

import com.crowdin.client.core.model.EnumConverter;

public enum TypeVendor implements EnumConverter<TypeVendor> {

    TRANSLATE_BY_VENDOR(2), PROOFREAD_BY_VENDOR(3);

    private final int val;

    TypeVendor(int val) {
        this.val = val;
    }

    public static TypeVendor from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Integer to(TypeVendor v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
