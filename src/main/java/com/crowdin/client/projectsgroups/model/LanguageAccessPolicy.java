package com.crowdin.client.projectsgroups.model;

import com.crowdin.client.core.model.EnumConverter;

public enum LanguageAccessPolicy implements EnumConverter<LanguageAccessPolicy> {

    OPEN, MODERATE;

    public static LanguageAccessPolicy from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(LanguageAccessPolicy v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
