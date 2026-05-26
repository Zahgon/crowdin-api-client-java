package com.crowdin.client.reports.model;

import com.crowdin.client.core.model.EnumConverter;

public enum MatchType implements EnumConverter<MatchType> {

    PERFECT("perfect"),
    OPTION_100("100"),
    OPTION_99_82("99-82"),
    OPTION_99_95("99-95"),
    OPTION_94_90("94-90"),
    OPTION_89_80("89-80"),
    OPTION_81_60("81-60"),
    TM_MATCH("tm_match"),
    APPROVAL("approval"),
    NO_MATCH("no_match");

    private String value;

    MatchType(String value) {
        this.value = value;
    }

    public static MatchType from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object to(MatchType v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
