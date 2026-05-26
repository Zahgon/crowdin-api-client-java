package com.crowdin.client.stringtranslations.model;

import com.crowdin.client.core.model.EnumConverter;

public enum PluralCategoryName implements EnumConverter<PluralCategoryName> {

    ZERO,
    ONE,
    TWO,
    FEW,
    MANY,
    OTHER;

    public static PluralCategoryName from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(PluralCategoryName v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
