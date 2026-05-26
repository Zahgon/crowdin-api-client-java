package com.crowdin.client.glossaries.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class TermResponseList {

    private List<TermResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Term> to(TermResponseList termResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
