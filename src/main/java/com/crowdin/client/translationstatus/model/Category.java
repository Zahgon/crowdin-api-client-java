package com.crowdin.client.translationstatus.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Category implements EnumConverter<Category> {

    EMPTY,
    VARIABLES,
    TAGS,
    PUNCTUATION,
    SYMBOL_REGISTER,
    SPACES,
    SIZE,
    SPECIAL_SYMBOLS,
    WRONG_TRANSLATION,
    SPELLCHECK,
    ICU,
    NUMBERS,
    AI,
    OUTDATED,
    DUPLICATE,
    TERMS;

    public static Category from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Category v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
