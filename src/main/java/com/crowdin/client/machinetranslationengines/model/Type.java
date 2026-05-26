package com.crowdin.client.machinetranslationengines.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Type implements EnumConverter<Type> {

    GOOGLE,
    GOOGLE_AUTOML,
    MICROSOFT,
    DEEPL,
    AMAZON,
    MODERNMT,
    CROWDIN,
    CUSTOM_MT;

    public static Type from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Type v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
