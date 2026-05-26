package com.crowdin.client.clients.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class ClientResponseList {

    private List<ClientResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Client> to(ClientResponseList vendorResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
