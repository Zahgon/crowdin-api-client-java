package com.crowdin.client.sourcefiles.model;

import com.crowdin.client.core.model.EnumConverter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ExportQuotes implements EnumConverter<ExportQuotes> {

    SINGLE, DOUBLE;

    @JsonCreator
    public static ExportQuotes from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @JsonValue
    @Override
    public String to(ExportQuotes v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
