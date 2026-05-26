package com.crowdin.client.vendors.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class VendorResponseList {

    private List<VendorResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Vendor> to(VendorResponseList vendorResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
