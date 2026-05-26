package com.crowdin.client.fields;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.ClientConfig;
import com.crowdin.client.core.model.Credentials;
import com.crowdin.client.core.model.PatchRequest;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import com.crowdin.client.fields.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FieldsApi extends CrowdinApi {

    public FieldsApi(Credentials credentials) {
        super(credentials);
    }

    public FieldsApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param entity Filter fields by entity {@link com.crowdin.client.fields.model.enums.EntityType}
     * @param search Search fields by slug or name
     * @param limit  maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of distributions
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.fields.getMany" target="_blank"><b>API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Field> listFields(String entity, String search, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<Field> listFields(ListFieldsParams params) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request object {@link com.crowdin.client.fields.model.FieldRequest}
     * @return Field object
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.fields.post" target="_blank"><b>API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Field> addField(FieldRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param fieldId field identifier
     * @return field object according to id
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.fields.get" target="_blank"><b>API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Field> getField(Long fieldId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param fieldId field identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.fields.delete" target="_blank"><b>API Documentation</b></a></li>
     * </ul>
     */
    public void deleteField(Long fieldId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param fieldId field identifier
     * @param request object
     * @return field object
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.fields.patch" target="_blank"><b>API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Field> editField(Long fieldId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
