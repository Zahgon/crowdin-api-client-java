package com.crowdin.client.dictionaries.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class DictionaryResponseList {

    private List<DictionaryResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Dictionary> to(DictionaryResponseList dictionaryResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
