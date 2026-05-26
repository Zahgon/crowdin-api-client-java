package com.crowdin.client.distributions;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.distributions.model.AddDistributionRequest;
import com.crowdin.client.distributions.model.AddDistributionStringsBasedRequest;
import com.crowdin.client.distributions.model.Distribution;
import com.crowdin.client.distributions.model.DistributionRelease;
import com.crowdin.client.distributions.model.DistributionReleaseResponseObject;
import com.crowdin.client.distributions.model.DistributionResponseList;
import com.crowdin.client.distributions.model.DistributionResponseObject;
import com.crowdin.client.distributions.model.DistributionStringsBasedRelease;
import com.crowdin.client.distributions.model.DistributionStringsBasedReleaseResponseObject;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DistributionsApi extends CrowdinApi {

    public DistributionsApi(Credentials credentials) {
        super(credentials);
    }

    public DistributionsApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param projectId project identifier
     * @param limit     maximum number of items to retrieve (default 25)
     * @param offset    starting offset in the collection (default 0)
     * @return list of distributions
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.distributions.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.distributions.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Distribution> listDistributions(Long projectId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<Distribution> listDistributions(Long projectId, Pagination options) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request   request object
     * @return newly created distribution
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.distributions.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.distributions.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Distribution> addDistribution(Long projectId, AddDistributionRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseObject<Distribution> addDistributionStringsBased(Long projectId, AddDistributionStringsBasedRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param hash      hash
     * @return distribution
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.distributions.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.distributions.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Distribution> getDistribution(Long projectId, String hash) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param hash      hash
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.distributions.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.distributions.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteDistribution(Long projectId, String hash) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param hash      hash
     * @param request   request object
     * @return updated distribution
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.distributions.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.distributions.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Distribution> editDistribution(Long projectId, String hash, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param hash      hash
     * @return distribution release
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.distributions.release.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.distributions.release.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DistributionRelease> getDistributionRelease(Long projectId, String hash) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseObject<DistributionStringsBasedRelease> getDistributionStringsBasedRelease(Long projectId, String hash) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param hash      hash
     * @return distribution release
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.distributions.release.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.distributions.release.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DistributionRelease> createDistributionRelease(Long projectId, String hash) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseObject<DistributionStringsBasedRelease> createDistributionStringsBasedRelease(Long projectId, String hash) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
