package com.crowdin.client.core.model;

public enum JsonFileType implements EnumConverter<JsonFileType> {

    I18NEXT_JSON("i18next_json"), NESTJS_I18N("nestjs_i18n");

    private String value;

    JsonFileType(String value) {
        this.value = value;
    }

    public static JsonFileType from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(JsonFileType v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
