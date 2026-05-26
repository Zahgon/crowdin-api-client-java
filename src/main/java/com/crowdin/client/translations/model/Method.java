package com.crowdin.client.translations.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Method implements EnumConverter<Method> {

    TM, MT, AI;

    public static Method from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Method v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
