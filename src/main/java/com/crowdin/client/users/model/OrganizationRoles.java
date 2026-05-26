package com.crowdin.client.users.model;

import com.crowdin.client.core.model.EnumConverter;

public enum OrganizationRoles implements EnumConverter<OrganizationRoles> {

    ADMIN, MANAGER, VENDOR, CLIENT;

    public static OrganizationRoles from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(OrganizationRoles v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
