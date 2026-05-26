package com.crowdin.client.languages.model;

import com.crowdin.client.core.model.EnumConverter;

public enum TextDirection implements EnumConverter<TextDirection> {

    LTR, RTL;

    public static TextDirection from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(TextDirection v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
