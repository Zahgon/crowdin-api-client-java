package com.crowdin.client.projectsgroups.model;

import com.crowdin.client.core.model.EnumConverter;
import java.util.stream.Stream;

public enum TmContextType implements EnumConverter<TmContextType> {

    SEGMENT_CONTEXT("segmentContext"), AUTO("auto"), PREV_AND_NEXT_SEGMENT("prevAndNextSegment");

    private final String val;

    TmContextType(String val) {
        this.val = val;
    }

    public static TmContextType from(String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String to(TmContextType v) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
