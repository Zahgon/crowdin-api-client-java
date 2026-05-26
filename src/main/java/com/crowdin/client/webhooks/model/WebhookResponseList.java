package com.crowdin.client.webhooks.model;

import com.crowdin.client.core.model.Pagination;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class WebhookResponseList {

    private List<WebhookResponseObject> data;

    private Pagination pagination;

    public static ResponseList<Webhook> to(WebhookResponseList webhookResponseList) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
