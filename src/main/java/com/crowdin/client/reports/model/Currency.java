package com.crowdin.client.reports.model;

import com.crowdin.client.core.model.EnumConverter;

public enum Currency implements EnumConverter<Currency> {

    USD,
    EUR,
    JPY,
    GBP,
    AUD,
    CAD,
    CHF,
    CNY,
    SEK,
    NZD,
    MXN,
    SGD,
    HKD,
    NOK,
    KRW,
    TRY,
    RUB,
    INR,
    BRL,
    ZAR,
    GEL,
    UAH;

    public static Currency from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(Currency v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
