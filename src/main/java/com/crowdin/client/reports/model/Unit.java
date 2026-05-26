package com.crowdin.client.reports.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Unit implements EnumConverter<Unit> {

    WORDS, STRINGS, CHARS, CHARS_WITH_SPACES;

    public static Unit from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Unit v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
