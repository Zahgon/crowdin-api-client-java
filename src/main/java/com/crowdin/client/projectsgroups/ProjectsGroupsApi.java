package com.crowdin.client.projectsgroups;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.projectsgroups.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ProjectsGroupsApi extends CrowdinApi {

    public ProjectsGroupsApi(Credentials credentials) {
        super(credentials);
    }

    public ProjectsGroupsApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param parentId parent group identifier. Get via List Groups
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of groups
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Group> listGroups(Long parentId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<Group> listGroups(ListGroupOptions options) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request request object
     * @return newly created group
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Group> addGroup(AddGroupRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId group identifier
     * @return group
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Group> getGroup(Long groupId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId group identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteGroup(Long groupId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId group identifier
     * @param request request object
     * @return updated group
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Group> editGroup(Long groupId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId group identifier (optional)
     * @param hasManagerAccess projects with manager access (default 0)
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of projects
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<? extends Project> listProjects(Long groupId, Integer hasManagerAccess, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId group identifier (optional)
     * @param hasManagerAccess projects with manager access (default 0)
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByField
     * @return list of projects
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<? extends Project> listProjects(Long groupId, Integer hasManagerAccess, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<? extends Project> listProjects(ListProjectOptions options) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request request object
     * @return newly created project
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<? extends Project> addProject(AddProjectRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @return project
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<? extends Project> getProject(Long projectId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteProject(Long projectId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request object
     * @return updated project
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<? extends Project> editProject(Long projectId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //<editor-fold desc="File Format Settings">
    /**
     * @param projectId project identifier
     * @param fileFormatSettingsId file format settings identifier
     * @return download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.file-format-settings.custom-segmentations.get"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.file-format-settings.custom-segmentations.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> downloadProjectFileFormatSettingsCustomSegmentation(Long projectId, Long fileFormatSettingsId) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param fileFormatSettingsId file format settings identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.file-format-settings.custom-segmentations.delete"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.file-format-settings.custom-segmentations.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void resetProjectFileFormatSettingsCustomSegmentation(Long projectId, Long fileFormatSettingsId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.file-format-settings.getMany"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.file-format-settings.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<FileFormatSettingsResource> listProjectFileFormatSettings(Long projectId) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request request object
     * @return newly created project
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.file-format-settings.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.file-format-settings.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<FileFormatSettingsResource> addProjectFileFormatSettings(Long projectId, AddProjectFileFormatSettingsRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param fileFormatSettingsId file format settings identifier
     * @return project
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.file-format-settings.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.file-format-settings.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<FileFormatSettingsResource> getProjectFileFormatSettings(Long projectId, Long fileFormatSettingsId) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param fileFormatSettingsId file format settings identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.file-format-settings.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.file-format-settings.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteProjectFileFormatSettings(Long projectId, Long fileFormatSettingsId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param fileFormatSettingsId file format settings identifier
     * @param request request object
     * @return updated file format settings
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.file-format-settings.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.file-format-settings.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<FileFormatSettingsResource> editProjectFileFormatSettings(Long projectId, Long fileFormatSettingsId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //<editor-fold desc="Helper methods">
    private String formUrl_projectFileFormatSettings(Long projectId) {
        return this.url + "/projects/" + projectId + "/file-format-settings";
    }

    private String formUrl_projectFileFormatSettingsId(Long projectId, Long fileFormatSettingsId) {
        return this.url + "/projects/" + projectId + "/file-format-settings/" + fileFormatSettingsId;
    }

    private String formUrl_projectFileFormatSettingsId_customSegmentations(Long projectId, Long fileFormatSettingsId) {
        return this.url + "/projects/" + projectId + "/file-format-settings/" + fileFormatSettingsId + "/custom-segmentations";
    }

    //</editor-fold>
    //</editor-fold>
    //<editor-fold desc="Strings Exporter Settings">
    /**
     * @param projectId project identifier
     * @return list of strings exporter settings resources
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings-exporter-settings.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings-exporter-settings.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<StringsExporterSettingsResource> listProjectStringsExporterSettings(Long projectId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param data strings exporter settings
     * @return strings exporter settings resource
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings-exporter-settings.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings-exporter-settings.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<StringsExporterSettingsResource> addProjectStringsExporterSettings(Long projectId, StringsExporterSettingsRequest data) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param systemStringsExporterSettingsId strings exporter settings identifier
     * @return strings exporter settings resource
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings-exporter-settings.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings-exporter-settings.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<StringsExporterSettingsResource> getProjectStringsExporterSettings(Long projectId, Long systemStringsExporterSettingsId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param systemStringsExporterSettingsId strings exporter settings identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings-exporter-settings.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings-exporter-settings.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteProjectStringsExporterSettings(Long projectId, Long systemStringsExporterSettingsId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param systemStringsExporterSettingsId strings exporter settings identifier
     * @return updated strings exporter settings resource
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.strings-exporter-settings.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.strings-exporter-settings.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<StringsExporterSettingsResource> editProjectStringsExporterSettings(Long projectId, Long systemStringsExporterSettingsId, StringsExporterSettingsRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //<editor-fold desc="Helper methods">
    private String formUrl_projectStringsExporterSettings(Long projectId) {
        return this.url + "/projects/" + projectId + "/strings-exporter-settings";
    }

    private String formUrl_projectStringsExporterSettingsId(Long projectId, Long systemStringsExporterSettingsId) {
        return this.url + "/projects/" + projectId + "/strings-exporter-settings/" + systemStringsExporterSettingsId;
    }
    //</editor-fold>
    //</editor-fold>
}
