package com.crowdin.client.glossaries.model;

import com.crowdin.client.core.model.EnumConverter;

public enum PartOfSpeech implements EnumConverter<PartOfSpeech> {

    ADJECTIVE,
    ADPOSITION,
    ADVERB,
    AUXILIARY,
    COORDINATING_CONJUNCTION,
    DETERMINER,
    INTERJECTION,
    NOUN,
    NUMERAL,
    PARTICLE,
    PRONOUN,
    PROPER_NOUN,
    SUBORDINATING_CONJUNCTION,
    VERB,
    OTHER;

    public static PartOfSpeech from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(PartOfSpeech v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
