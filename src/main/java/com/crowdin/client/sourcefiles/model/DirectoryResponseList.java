package com.crowdin.client.sourcefiles.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class DirectoryResponseList {

    private List<DirectoryResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Directory> to(DirectoryResponseList directoryResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
