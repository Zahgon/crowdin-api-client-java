package com.crowdin.client.webhooks.model;

import com.crowdin.client.core.model.EnumConverter;

public enum RequestType implements EnumConverter<RequestType> {

    POST, GET;

    public static RequestType from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(RequestType v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
