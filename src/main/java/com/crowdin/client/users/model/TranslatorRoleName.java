package com.crowdin.client.users.model;

import com.crowdin.client.core.model.EnumConverter;

public enum TranslatorRoleName implements EnumConverter<TranslatorRoleName> {

    TRANSLATOR, PROOFREADER, OWNER;

    public static TranslatorRoleName from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(TranslatorRoleName v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
