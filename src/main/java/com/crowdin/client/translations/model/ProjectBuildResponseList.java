package com.crowdin.client.translations.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class ProjectBuildResponseList {

    private List<ProjectBuildResponseObject> data;

    private Pagination pagination;

    public static ResponseList<ProjectBuild> to(ProjectBuildResponseList projectBuildResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
