package com.crowdin.client.storage.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class StorageResponseList {

    private List<StorageResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Storage> to(StorageResponseList storageResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
