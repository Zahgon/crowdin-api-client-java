package com.crowdin.client.glossaries.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class SearchConcordanceResponseList {

    private List<SearchConcordanceResponseObject> data;

    private Pagination pagination;

    public static ResponseList<SearchConcordance> of(SearchConcordanceResponseList searchConcordanceResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
