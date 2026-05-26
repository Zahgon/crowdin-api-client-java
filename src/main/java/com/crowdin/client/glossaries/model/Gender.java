package com.crowdin.client.glossaries.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Gender implements EnumConverter<Gender> {

    MASCULINE, FEMININE, NEUTER, OTHER;

    public static Gender from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Gender v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
