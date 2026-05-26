package com.crowdin.client.sourcefiles.model;

import com.crowdin.client.core.model.EnumConverter;

public enum UpdateOption implements EnumConverter<UpdateOption> {

    CLEAR_TRANSLATIONS_AND_APPROVALS, KEEP_TRANSLATIONS, KEEP_TRANSLATIONS_AND_APPROVALS;

    public static UpdateOption from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(UpdateOption v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
