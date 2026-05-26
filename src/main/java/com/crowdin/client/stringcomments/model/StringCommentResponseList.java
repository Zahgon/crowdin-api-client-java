package com.crowdin.client.stringcomments.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class StringCommentResponseList {

    private List<StringCommentResponseObject> data;

    private Pagination pagination;

    public static ResponseList<StringComment> to(StringCommentResponseList stringCommentResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
