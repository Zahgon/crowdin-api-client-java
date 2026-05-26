package com.crowdin.client.projectsgroups.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class ProjectResponseList {

    private List<ProjectResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Project> to(ProjectResponseList projectResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
