package com.crowdin.client.reports.model;

import com.crowdin.client.core.model.EnumConverter;

public enum GroupingParameter implements EnumConverter<GroupingParameter> {

    USER, LANGUAGE;

    public static GroupingParameter from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(GroupingParameter v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
