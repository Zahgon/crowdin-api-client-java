package com.crowdin.client.reports.model;

import com.crowdin.client.core.model.EnumConverter;

public enum LabelIncludeType implements EnumConverter<LabelIncludeType> {

    STRINGS_WITH_LABEL, STRINGS_WITHOUT_LABEL;

    public static LabelIncludeType from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(LabelIncludeType v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
