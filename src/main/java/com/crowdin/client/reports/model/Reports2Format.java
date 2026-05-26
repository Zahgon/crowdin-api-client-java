package com.crowdin.client.reports.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Reports2Format implements EnumConverter<Reports2Format> {

    XLSX, CSV;

    public static Reports2Format from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Reports2Format v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
