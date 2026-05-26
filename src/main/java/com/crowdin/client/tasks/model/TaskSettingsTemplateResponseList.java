package com.crowdin.client.tasks.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class TaskSettingsTemplateResponseList {

    private List<TaskSettingsTemplateResponseObject> data;

    private Pagination pagination;

    public static ResponseList<TaskSettingsTemplate> to(TaskSettingsTemplateResponseList responseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
