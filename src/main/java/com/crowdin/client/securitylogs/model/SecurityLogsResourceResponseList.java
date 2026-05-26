package com.crowdin.client.securitylogs.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class SecurityLogsResourceResponseList {

    private List<SecurityLogResourceObject> data;

    private Pagination pagination;

    public static ResponseList<SecurityLogResource> to(SecurityLogsResourceResponseList securityLogsResourceResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
