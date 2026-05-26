package com.crowdin.client.tasks.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class TaskResponseList {

    private List<TaskResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Task> to(TaskResponseList taskResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
