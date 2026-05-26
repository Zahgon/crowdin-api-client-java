package com.crowdin.client.sourcestrings;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.sourcestrings.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SourceStringsApi extends CrowdinApi {

    public SourceStringsApi(Credentials credentials) {
        super(credentials);
    }

    public SourceStringsApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param projectId project identifier
     * @param uploadId upload identifier
     */
    public ResponseObject<UploadStringsProgress> uploadStringsStatus(Long projectId, String uploadId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseObject<UploadStringsProgress> uploadStrings(Long projectId, UploadStringsRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param fileId file identifier
     * @param denormalizePlaceholders [0, 1]. Enable denormalize placeholders
     * @param branchId project identifier
     * @param labelIds filter strings by labels
     * @param croql filter strings by croql
     * @param filter Filter strings
     * @param scope ["identifier", "text", "context"]. Specify field to be the target of filtering. It can be one scope or a list of comma-separated scopes
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of source strings
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    @Deprecated
    public ResponseList<SourceString> listSourceStrings(Long projectId, Long fileId, Integer denormalizePlaceholders, Long branchId, String labelIds, String croql, String filter, String scope, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        ListSourceStringsParams params = ListSourceStringsParams.builder().fileId(fileId).denormalizePlaceholders(denormalizePlaceholders).branchId(branchId).labelIds(labelIds).croql(croql).filter(filter).scope(scope).limit(limit).offset(offset).build();
        return listSourceStrings(projectId, params);
    }

    /**
     * @param projectId project identifier
     * @param params Query params
     * @return list of source strings
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<SourceString> listSourceStrings(Long projectId, ListSourceStringsParams params) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request object
     * @return newly created source string
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<SourceString> addSourceString(Long projectId, AddSourceStringRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseObject<SourceString> addSourcePluralString(Long projectId, AddSourcePluralStringRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseObject<SourceString> addSourceStringStringsBased(Long projectId, AddSourceStringStringsBasedRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseObject<SourceString> addSourcePluralStringStringsBased(Long projectId, AddSourcePluralStringStringsBasedRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param stringId string identifier
     * @return source string
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<SourceString> getSourceString(Long projectId, Long stringId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param stringId string identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteSourceString(Long projectId, Long stringId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param stringId string identifier
     * @param request request object
     * @return updated source string
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<SourceString> editSourceString(Long projectId, Long stringId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request object
     * @return updated source string
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings.batchPatch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings.batchPatch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<SourceString> stringBatchOperations(Long projectId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
