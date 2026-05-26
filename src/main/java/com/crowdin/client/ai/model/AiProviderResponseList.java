package com.crowdin.client.ai.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class AiProviderResponseList {

    private List<AiProviderResponseObject> data;

    private Pagination pagination;

    public static ResponseList<AiProvider> to(AiProviderResponseList responseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
