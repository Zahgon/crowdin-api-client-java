package com.crowdin.client.applications.installations.model;

import com.crowdin.client.core.model.EnumConverter;

public enum UserPermissions implements EnumConverter<UserPermissions> {

    OWNER, MANAGERS, ALL, GUESTS, RESTRICTED;

    public static UserPermissions from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(UserPermissions value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
