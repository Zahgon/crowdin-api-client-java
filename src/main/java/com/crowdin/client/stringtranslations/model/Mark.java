package com.crowdin.client.stringtranslations.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Mark implements EnumConverter<Mark> {

    UP, DOWN;

    public static Mark from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Mark v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
