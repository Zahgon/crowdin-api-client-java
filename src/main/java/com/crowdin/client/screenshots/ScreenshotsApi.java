package com.crowdin.client.screenshots;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.screenshots.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ScreenshotsApi extends CrowdinApi {

    public ScreenshotsApi(Credentials credentials) {
        super(credentials);
    }

    public ScreenshotsApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param projectId project identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of screenshots
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    @Deprecated
    public ResponseList<Screenshot> listScreenshots(Long projectId, Long stringId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        ListScreenshotsParams screenshotsParams = new ListScreenshotsParams();
        screenshotsParams.setStringIds(Optional.ofNullable(stringId).map(Object::toString).orElse(null));
        screenshotsParams.setLimit(limit);
        screenshotsParams.setOffset(offset);
        return this.listScreenshots(projectId, screenshotsParams);
    }

    /**
     * @param projectId project identifier
     * @param stringIds string identifiers
     * @param labelIds label identifiers
     * @param excludeLabelIds exclude label identifiers
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of screenshots
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Screenshot> listScreenshots(Long projectId, List<String> stringIds, List<String> labelIds, List<String> excludeLabelIds, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param stringIds string identifiers
     * @param labelIds label identifiers
     * @param excludeLabelIds exclude label identifiers
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByField
     * @return list of screenshots
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Screenshot> listScreenshots(Long projectId, List<String> stringIds, List<String> labelIds, List<String> excludeLabelIds, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param params query params
     * @return list of screenshots
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Screenshot> listScreenshots(Long projectId, ListScreenshotsParams params) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request object
     * @return newly created screenshot
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Screenshot> addScreenshot(Long projectId, AddScreenshotRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @return screenshot
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Screenshot> getScreenshot(Long projectId, Long screenshotId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @param request request object
     * @return updated screenshot
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.put" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.put" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Screenshot> updateScreenshot(Long projectId, Long screenshotId, UpdateScreenshotRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteScreenshot(Long projectId, Long screenshotId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @param request request object
     * @return updated screenshot
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Screenshot> editScreenshot(Long projectId, Long screenshotId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of tags
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.tags.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.tags.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Tag> listTags(Long projectId, Long screenshotId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @param request request object
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.tags.putMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.tags.putMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void replaceTags(Long projectId, Long screenshotId, ReplaceTagsRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @param request request object
     * @return newly created tags
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.tags.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.tags.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<List<Tag>> addTag(Long projectId, Long screenshotId, List<AddTagRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.tags.deleteMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.tags.deleteMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void clearTags(Long projectId, Long screenshotId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @param tagId tag identifier
     * @return tag
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.tags.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.tags.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Tag> getTag(Long projectId, Long screenshotId, Long tagId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @param tagId tag identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.tags.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.tags.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteTag(Long projectId, Long screenshotId, Long tagId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param screenshotId screenshot identifier
     * @param tagId tag identifier
     * @param request request object
     * @return updated screenshot
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.screenshots.tags.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.screenshots.tags.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Tag> editTag(Long projectId, Long screenshotId, Long tagId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
