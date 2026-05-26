package com.crowdin.client.webhooks.model;

import com.crowdin.client.core.model.EnumConverter;

public enum ContentType implements EnumConverter<ContentType> {

    MULTIPART_FORM_DATA("multipart/form-data"), APPLICATION_JSON("application/json"), APPLICATION_X_WWW_FORM_URLENCODED("application/x-www-form-urlencoded");

    private final String val;

    ContentType(String val) {
        this.val = val;
    }

    public static ContentType from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(ContentType v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
