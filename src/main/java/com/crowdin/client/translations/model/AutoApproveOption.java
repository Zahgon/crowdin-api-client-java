package com.crowdin.client.translations.model;

import com.crowdin.client.core.model.EnumConverter;

public enum AutoApproveOption implements EnumConverter<AutoApproveOption> {

    NONE("none"), ALL("all"), EXCEPT_AUTO_SUBSTITUTED("exceptAutoSubstituted"), PERFECT_MATCH_ONLY("perfectMatchOnly");

    private final String value;

    AutoApproveOption(String value) {
        this.value = value;
    }

    public static AutoApproveOption from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(AutoApproveOption v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
