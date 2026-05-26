package com.crowdin.client.webhooks;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.ClientConfig;
import com.crowdin.client.core.model.Credentials;
import com.crowdin.client.core.model.PatchRequest;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import com.crowdin.client.webhooks.model.AddOrganizationWebhookRequest;
import com.crowdin.client.webhooks.model.OrganizationWebhookResponseList;
import com.crowdin.client.webhooks.model.OrganizationWebhookResponseObject;
import com.crowdin.client.webhooks.model.OrganizationWebhook;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OrganizationWebhooksApi extends CrowdinApi {

    public OrganizationWebhooksApi(Credentials credentials) {
        super(credentials);
    }

    public OrganizationWebhooksApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    private final String baseUrl = "/webhooks";

    /**
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of organization webhooks
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.webhooks.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.webhooks.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<OrganizationWebhook> listWebhooks(Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request request object
     * @return newly created organization webhook
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.webhooks.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.webhooks.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<OrganizationWebhook> addWebhook(AddOrganizationWebhookRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param organizationWebhookId organization webhook identifier
     * @return organization webhook
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.webhooks.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.webhooks.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<OrganizationWebhook> getWebhook(Long organizationWebhookId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param organizationWebhookId organization webhook identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.webhooks.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.webhooks.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteWebhook(Long organizationWebhookId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param organizationWebhookId organization webhook identifier
     * @param request request object
     * @return updated organization webhook
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.webhooks.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.webhooks.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<OrganizationWebhook> editWebhook(Long organizationWebhookId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String formUrl_webhookId(Long organizationWebhookId) {
        return this.url + "/webhooks/" + organizationWebhookId;
    }
}
