package com.crowdin.client.bundles.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class BundleResponseList {

    private List<BundleResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Bundle> to(BundleResponseList bundleResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
