package com.crowdin.client.translationmemory.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class TmSegmentResponseList {

    private List<TmSegmentResponseObject> data;

    private Pagination pagination;

    public static ResponseList<TmSegment> to(TmSegmentResponseList responseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
