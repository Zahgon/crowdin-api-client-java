package com.crowdin.client.translationstatus.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class QaCheckResponseList {

    private List<QaCheckResponseObject> data;

    private Pagination pagination;

    public static ResponseList<QaCheck> to(QaCheckResponseList qaCheckResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
