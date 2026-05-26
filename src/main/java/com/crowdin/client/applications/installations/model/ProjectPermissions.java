package com.crowdin.client.applications.installations.model;

import com.crowdin.client.core.model.EnumConverter;

public enum ProjectPermissions implements EnumConverter<ProjectPermissions> {

    OWN, RESTRICTED;

    public static ProjectPermissions from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(ProjectPermissions value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
