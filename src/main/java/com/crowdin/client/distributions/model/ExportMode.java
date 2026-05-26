package com.crowdin.client.distributions.model;

import com.crowdin.client.core.model.EnumConverter;

public enum ExportMode implements EnumConverter<ExportMode> {

    DEFAULT, BUNDLE;

    public static ExportMode from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(ExportMode v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
