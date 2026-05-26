package com.crowdin.client.styleguide;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.styleguide.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StyleGuidesApi extends CrowdinApi {

    public StyleGuidesApi(Credentials credentials) {
        super(credentials);
    }

    public StyleGuidesApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param styleGuideId style guide identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.style-guides.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.style-guides.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteStyleGuide(Long styleGuideId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param styleGuideId style guide identifier
     * @param request request object
     * @return updated style guide
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.style-guides.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.style-guides.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<StyleGuide> editStyleGuide(Long styleGuideId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param styleGuideId style guide identifier
     * @return style guide
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.style-guides.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.style-guides.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<StyleGuide> getStyleGuide(Long styleGuideId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request request object
     * @return newly created style guide
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.style-guides.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.style-guides.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<StyleGuide> addStyleGuide(AddStyleGuideRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId user identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of style guides
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.style-guides.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.style-guides.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<StyleGuide> listStyleGuides(Long userId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId user identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByField
     * @return list of style guides
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.style-guides.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.style-guides.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<StyleGuide> listStyleGuides(Long userId, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<StyleGuide> listStyleGuides(ListStyleGuidesParams params) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
