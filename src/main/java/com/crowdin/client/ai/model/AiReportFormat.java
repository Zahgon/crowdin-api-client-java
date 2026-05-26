package com.crowdin.client.ai.model;

import com.crowdin.client.core.model.EnumConverter;

public enum AiReportFormat implements EnumConverter<AiReportFormat> {

    JSON, CSV;

    public static AiReportFormat from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(AiReportFormat v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
