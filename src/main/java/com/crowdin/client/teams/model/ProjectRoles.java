package com.crowdin.client.teams.model;

import com.crowdin.client.core.model.EnumConverter;

public enum ProjectRoles implements EnumConverter<ProjectRoles> {

    MANAGER,
    DEVELOPER,
    TRANSLATOR,
    PROOFREADER,
    LANGUAGE_COORDINATOR,
    MEMBER;

    public static ProjectRoles from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(ProjectRoles v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
