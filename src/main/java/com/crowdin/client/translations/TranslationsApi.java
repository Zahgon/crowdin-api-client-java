package com.crowdin.client.translations;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.translations.model.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TranslationsApi extends CrowdinApi {

    public TranslationsApi(Credentials credentials) {
        super(credentials);
    }

    public TranslationsApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param projectId project identifier
     * @param request request body
     * @return pre-translation status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.pre-translations.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.pre-translations.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<PreTranslationStatus> applyPreTranslation(Long projectId, ApplyPreTranslationRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseObject<PreTranslationStatus> applyPreTranslationStringsBased(Long projectId, ApplyPreTranslationStringsBasedRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param preTranslationId pre-translation identifier
     * @return pre-translation status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.pre-translations.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.pre-translations.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<PreTranslationStatus> preTranslationStatus(Long projectId, String preTranslationId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param directoryId directory identifier
     * @param request request body
     * @return download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.builds.directories.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.builds.directories.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> buildProjectDirectoryTranslation(Long projectId, Long directoryId, BuildProjectDirectoryTranslationRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param fileId file identifier
     * @param etag Etag identifier
     * @param request request body
     * @return download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.builds.files.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.builds.files.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> buildProjectFileTranslation(Long projectId, Long fileId, String etag, BuildProjectFileTranslationRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param branchId filter by branchId
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of project builds
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.builds.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.builds.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<ProjectBuild> listProjectBuilds(Long projectId, Long branchId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request body
     * @return project build status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.builds.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.builds.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ProjectBuild> buildProjectTranslation(Long projectId, BuildProjectTranslationRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @deprecated
     *
     * @param projectId project identifier
     * @param languageId language identifier
     * @param request request body
     * @return upload translations response
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.postOnLanguage" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.postOnLanguage" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<UploadTranslationsResponse> uploadTranslations(Long projectId, String languageId, UploadTranslationsRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @deprecated
     */
    public ResponseObject<UploadTranslationsStringsResponse> uploadTranslationStringsBased(Long projectId, String languageId, UploadTranslationsStringsRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param buildId build identifier
     * @return download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.builds.download.download" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.builds.download.download" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> downloadProjectTranslations(Long projectId, Long buildId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param buildId build identifier
     * @return project build status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.builds.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.builds.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ProjectBuild> checkBuildStatus(Long projectId, Long buildId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param buildId build identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.builds.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.builds.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void cancelBuild(Long projectId, Long buildId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Export Project Translation
     *
     * @param projectId project identifier
     * @param request request body
     * @return download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.exports.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.exports.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> exportProjectTranslation(Long projectId, ExportProjectTranslationRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * List Pre-Translations
     *
     * @param projectId project identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.pre-translations.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.pre-translations.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<PreTranslation> listPreTranslations(Long projectId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<PreTranslation> listPreTranslations(Long projectId, Pagination options) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Pre-Translation Batch Operations
     *
     * @param projectId project identifier
     * @param request list of patch operations
     * @return list of updated pre-translations
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#tag/Translations/operation/api.projects.pre-translations.patchBatch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#tag/Translations/operation/api.projects.pre-translations.patchBatch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<PreTranslation> batchEditPreTranslations(Long projectId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Edit Pre-Translation
     *
     * @param projectId project identifier
     * @param preTranslationId pre-translation identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.pre-translations.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.pre-translations.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<PreTranslation> editPreTranslation(Long projectId, String preTranslationId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Pre-Translation Report
     *
     * @param projectId project identifier
     * @param preTranslationId pre-translation identifier
     * @return pre-translation report data
     * @see <ul>
     *     <li><a href="https://developer.crowdin.com/api/v2/#tag/Translations/operation/api.projects.pre-translations.report.getReport" target="_blank"><b>API Documentation</b></a></li>
     *     <li><a href="https://developer.crowdin.com/enterprise/api/v2/#tag/Translations/operation/api.projects.pre-translations.report.getReport" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<PreTranslationReportResponse> getPreTranslationReport(Long projectId, String preTranslationId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request body
     * @return import translations
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/api/v2/#tag/Translations/operation/api.projects.translations.imports" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/#tag/Translations/operation/api.projects.translations.enterprise.imports" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ImportTranslationsStatus> importTranslations(Long projectId, ImportTranslationsRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request body
     * @return import translations
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/api/v2/string-based/#tag/Translations/operation/api.projects.translations.imports" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/string-based/#tag/Translations/operation/api.projects.translations.enterprise.imports" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ImportTranslationsStringsBasedStatus> importTranslations(Long projectId, ImportTranslationsStringsBasedRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param importId import identifier
     * @return import translations
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/api/v2/#tag/Translations/operation/api.projects.translations.imports.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/#tag/Translations/operation/api.projects.translations.enterprise.imports.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ImportTranslationsStatus> importTranslationsStatus(Long projectId, String importId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param importId import identifier
     * @return import translations
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/api/v2/string-based/#tag/Translations/operation/api.projects.translations.imports.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/string-based/#tag/Translations/operation/api.projects.translations.enterprise.imports.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ImportTranslationsStringsBasedStatus> importTranslationsStringsBasedStatus(Long projectId, String importId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param importId import identifier
     * @return import translations
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/api/v2/#tag/Translations/operation/api.projects.translations.imports.report.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/#tag/Translations/operation/api.projects.translations.imports.report.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ImportTranslationsReportResponse> importTranslationsReport(Long projectId, String importId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param importId import identifier
     * @return import translations
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/api/v2/string-based/#tag/Translations/operation/api.projects.translations.imports.report.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/string-based/#tag/Translations/operation/api.projects.translations.imports.report.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<ImportTranslationsStringsBasedReportResponse> importTranslationsStringsBasedReport(Long projectId, String importId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
