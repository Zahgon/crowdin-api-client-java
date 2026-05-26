package com.crowdin.client.stringcomments.model;

import com.crowdin.client.core.model.EnumConverter;

public enum IssueStatus implements EnumConverter<IssueStatus> {

    RESOLVED, UNRESOLVED;

    public static IssueStatus from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(IssueStatus v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
