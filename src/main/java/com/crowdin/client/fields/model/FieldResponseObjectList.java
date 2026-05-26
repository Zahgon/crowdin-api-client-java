package com.crowdin.client.fields.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class FieldResponseObjectList {

    private List<FieldResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Field> to(FieldResponseObjectList reportSettingsTemplateList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
