package com.crowdin.client.users.model;

import com.crowdin.client.core.model.EnumConverter;

public enum TwoFactor implements EnumConverter<TwoFactor> {

    ENABLED, DISABLED;

    public static TwoFactor from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(TwoFactor v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
