package com.crowdin.client.core.model;

import lombok.Data;
import java.util.List;

@Data
public class ResponseList<T> {

    private List<ResponseObject<T>> data;

    private Pagination pagination;

    public static <T> ResponseList<T> of(List<ResponseObject<T>> data, Pagination pagination) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
