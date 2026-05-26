package com.crowdin.client.reports.model;

import com.crowdin.client.core.model.EnumConverter;

public enum ReportsFormat implements EnumConverter<ReportsFormat> {

    XLSX, CSV, JSON;

    public static ReportsFormat from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(ReportsFormat v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
