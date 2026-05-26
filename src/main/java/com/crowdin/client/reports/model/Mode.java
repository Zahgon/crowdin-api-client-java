package com.crowdin.client.reports.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Mode implements EnumConverter<Mode> {

    NO_MATCH("no_match"),
    PERFECT("perfect"),
    OPTION_100("100"),
    OPTION_99_95("99-95"),
    OPTION_94_90("94-90"),
    OPTION_89_80("89-80");

    private final String val;

    Mode(String val) {
        this.val = val;
    }

    public static Mode from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Mode v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
