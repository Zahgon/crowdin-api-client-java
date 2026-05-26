package com.crowdin.client.reports;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.reports.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ReportsApi extends CrowdinApi {

    public ReportsApi(Credentials credentials) {
        super(credentials);
    }

    public ReportsApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param groupId group identifier
     * @param request request object
     * @return group report status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.reports.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GroupReportStatus> generateGroupReport(Long groupId, GenerateGroupReportRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId  group identifier
     * @param reportId report identifier
     * @return group report status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.reports.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GroupReportStatus> checkGroupReportGenerationStatus(Long groupId, String reportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId  group identifier
     * @param reportId report identifier
     * @return report download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.groups.reports.download.download" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> downloadGroupReport(Long groupId, String reportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request request object
     * @return organization report status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.reports.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GroupReportStatus> generateOrganizationReport(GenerateGroupReportRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param reportId report identifier
     * @return organization report status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.reports.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GroupReportStatus> checkOrganizationReportGenerationStatus(String reportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param reportId report identifier
     * @return report download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.reports.download.download" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> downloadOrganizationReport(String reportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return list of report settings template
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/#tag/Reports/operation/api.reports.settings-templates.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<ReportSettingsTemplate.OrganizationReportSettingsTemplate> listOrganizationReportSettingsTemplates(ListOrganizationReportSettingsParams params) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request   request object
     * @return report settings template
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/#tag/Reports/operation/api.reports.settings-templates.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportSettingsTemplate.OrganizationReportSettingsTemplate> addOrganizationReportSettingsTemplate(ReportSettingsTemplate.OrganizationReportSettingsTemplate request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param reportSettingsTemplateId report settings template identifier
     * @return report settings template
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/#tag/Reports/operation/api.reports.settings-templates.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportSettingsTemplate.OrganizationReportSettingsTemplate> getOrganizationReportSettingsTemplate(Long reportSettingsTemplateId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param reportSettingsTemplateId report settings template identifier
     * @param request                  request object
     * @return report settings template
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/#tag/Reports/operation/api.reports.settings-templates.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportSettingsTemplate.OrganizationReportSettingsTemplate> editOrganizationReportSettingsTemplate(Long reportSettingsTemplateId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param reportSettingsTemplateId report settings template identifier
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/#tag/Reports/operation/api.reports.settings-templates.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteOrganizationReportSettingsTemplate(Long reportSettingsTemplateId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request   request object
     * @return report status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.reports.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.reports.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportStatus> generateReport(Long projectId, GenerateReportRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param reportId  report identifier
     * @return report status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.reports.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.reports.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportStatus> checkReportGenerationStatus(Long projectId, String reportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param reportId  report identifier
     * @return download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.reports.download.download" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.reports.download.download" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> downloadReport(Long projectId, String reportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param limit     maximum number of items to retrieve (default 25)
     * @param offset    starting offset in the collection (default 0)
     * @return list of report settings template
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.reports.settings-templates.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.reports.settings-templates.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<ReportSettingsTemplate> listReportSettingsTemplate(Long projectId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request   request object
     * @return report settings template
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.reports.settings-templates.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.reports.settings-templates.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportSettingsTemplate> addReportSettingsTemplate(Long projectId, ReportSettingsTemplate request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId                project identifier
     * @param reportSettingsTemplateId report settings template identifier
     * @return report settings template
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.reports.settings-templates.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.reports.settings-templates.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportSettingsTemplate> getReportSettingsTemplate(Long projectId, Long reportSettingsTemplateId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId                project identifier
     * @param reportSettingsTemplateId report settings template identifier
     * @param request                  request object
     * @return report settings template
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.reports.settings-templates.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.reports.settings-templates.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportSettingsTemplate> editReportSettingsTemplate(Long projectId, Long reportSettingsTemplateId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId                project identifier
     * @param reportSettingsTemplateId report settings template identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.settings-templates.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.settings-templates.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteReportSettingsTemplate(Long projectId, Long reportSettingsTemplateId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // -- USER REPORTS -- //
    /**
     * @param userId user identifier
     * @param limit (default 25)
     * @param offset (default 0)
     * @return list of user report settings template
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.users.reports.settings-templates.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.reports.settings-templates.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<ReportSettingsTemplate> listUserReportSettingsTemplate(Long userId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId user identifier
     * @param request request object
     * @return user report settings template
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.users.reports.settings-templates.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.reports.settings-templates.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportSettingsTemplate> addUserReportSettingsTemplate(Long userId, ReportSettingsTemplate request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId user identifier
     * @param reportSettingsTemplateId report settings template identifier
     * @return user report settings template
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.users.reports.settings-templates.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.reports.settings-templates.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportSettingsTemplate> getUserReportSettingsTemplate(Long userId, Long reportSettingsTemplateId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId user identifier
     * @param reportSettingsTemplateId report settings template identifier
     * @param request request object
     * @return user report settings template
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.users.reports.settings-templates.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.reports.settings-templates.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportSettingsTemplate> editUserReportSettingsTemplate(Long userId, Long reportSettingsTemplateId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId user identifier
     * @param reportSettingsTemplateId report settings template identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.users.reports.settings-templates.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.users.reports.settings-templates.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteUserReportSettingsTemplate(Long userId, Long reportSettingsTemplateId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // -- REPORT ARCHIVES -- //
    /**
     * @param userId    user identifier
     * @param scopeType Filter only project report archives (scopeType=project)
     * @param scopeId   Filter archives by spicific scope id (default 25)
     * @param limit     maximum number of items to retrieve (default 25)
     * @param offset    starting offset in the collection (default 0)
     * @return list of report settings template
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.reports.archives.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.reports.archives.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<ReportArchive> listReportArchives(Long userId, String scopeType, Long scopeId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId    user identifier
     * @param archiveId archive identifier
     * @return download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.users.reports.archives.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.reports.archives.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ReportArchive> getReportArchive(Long userId, Long archiveId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId    user identifier
     * @param archiveId archive identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.users.reports.archives.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.reports.archives.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteReportArchive(Long userId, Long archiveId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId    user identifier
     * @param archiveId archive identifier
     * @param request   request object
     * @return report settings template
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.reports.archives.exports.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.reports.archives.exports.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GroupReportStatus> exportReportArchive(Long userId, Long archiveId, ExportReportRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param archiveId archive identifier
     * @param exportId  export identifier
     * @return export report status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.reports.archives.exports.get" target="_blank"><b> API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.reports.archives.exports.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GroupReportStatus> checkReportArchiveExportStatus(Long userId, Long archiveId, String exportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param userId    user identifier
     * @param archiveId archive identifier
     * @param exportId  export identifier
     * @return report archive download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.users.reports.archives.exports.download.get" target="_blank"><b> API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.reports.archives.exports.download.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> downloadReportArchive(Long userId, Long archiveId, String exportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build an url with or without userId prefix
     *
     * @param userId user identifier (for crowdin.com only)
     * @param path   sub-path of the url
     * @return url with userId prefix if exist
     */
    private String getReportArchivesPath(Long userId, String path) {
        return userId != null ? String.format("%s/users/%d/%s", this.url, userId, path) : String.format("%s/%s", this.url, path);
    }
}
