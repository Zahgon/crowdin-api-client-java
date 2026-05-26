package com.crowdin.client.core.model;

public enum EscapeQuotesMode implements EnumConverter<EscapeQuotesMode> {

    DO_NOT_ESCAPE_SINGLE_QUOTE(0), ESCAPE_SINGLE_QUOTE_BY_ANOTHER_SINGLE_QUOTE(1), ESCAPE_SINGLE_QUOTE_BY_BACK_SLASH(2), ESCAPE_SINGLE_QUOTE_BY_ANOTHER_SINGLE_QUOTE_ONLY_IF_VARIABLES(3);

    private final int value;

    EscapeQuotesMode(int value) {
        this.value = value;
    }

    public static EscapeQuotesMode from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Integer to(EscapeQuotesMode v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
