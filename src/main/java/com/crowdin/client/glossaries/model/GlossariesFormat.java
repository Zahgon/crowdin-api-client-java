package com.crowdin.client.glossaries.model;

import com.crowdin.client.core.model.EnumConverter;

public enum GlossariesFormat implements EnumConverter<GlossariesFormat> {

    TBX, TBX_V3, CSV, XLSX;

    public static GlossariesFormat from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(GlossariesFormat v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
