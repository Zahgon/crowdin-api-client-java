package com.crowdin.client.core.model;

import com.crowdin.client.core.http.impl.util.RequestEncoder;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class OrderByField {

    private String fieldName;

    private SortOrder orderBy;

    public static String generateSortParam(List<OrderByField> fields) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
