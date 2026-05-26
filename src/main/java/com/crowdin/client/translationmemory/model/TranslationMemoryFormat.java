package com.crowdin.client.translationmemory.model;

import com.crowdin.client.core.model.EnumConverter;

public enum TranslationMemoryFormat implements EnumConverter<TranslationMemoryFormat> {

    TMX, CSV, XLSX;

    public static TranslationMemoryFormat from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(TranslationMemoryFormat v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
