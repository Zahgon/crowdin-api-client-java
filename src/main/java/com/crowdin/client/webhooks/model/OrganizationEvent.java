package com.crowdin.client.webhooks.model;

import com.crowdin.client.core.model.EnumConverter;

public enum OrganizationEvent implements EnumConverter<OrganizationEvent> {

    GROUP_CREATED, GROUP_DELETED, PROJECT_CREATED, PROJECT_DELETED;

    public static OrganizationEvent from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(OrganizationEvent v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
