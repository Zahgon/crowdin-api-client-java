package com.crowdin.client.ai.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class AiSupportedModelResponseList {

    private List<AiSupportedModelResponseObject> data;

    private Pagination pagination;

    public static ResponseList<AiSupportedModel> to(AiSupportedModelResponseList responseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
