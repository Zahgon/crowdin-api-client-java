package com.crowdin.client.translationmemory;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.translationmemory.model.AddTranslationMemoryRequest;
import com.crowdin.client.translationmemory.model.CreateTmSegmentRequest;
import com.crowdin.client.translationmemory.model.SearchConcordance;
import com.crowdin.client.translationmemory.model.SearchConcordanceRequest;
import com.crowdin.client.translationmemory.model.SearchConcordanceResponse;
import com.crowdin.client.translationmemory.model.SearchConcordanceResponseList;
import com.crowdin.client.translationmemory.model.TmSegment;
import com.crowdin.client.translationmemory.model.TmSegmentResponseList;
import com.crowdin.client.translationmemory.model.TmSegmentResponseObject;
import com.crowdin.client.translationmemory.model.TranslationMemory;
import com.crowdin.client.translationmemory.model.TranslationMemoryExportRequest;
import com.crowdin.client.translationmemory.model.TranslationMemoryExportStatus;
import com.crowdin.client.translationmemory.model.TranslationMemoryExportStatusResponseObject;
import com.crowdin.client.translationmemory.model.TranslationMemoryImportRequest;
import com.crowdin.client.translationmemory.model.TranslationMemoryImportStatus;
import com.crowdin.client.translationmemory.model.TranslationMemoryImportStatusResponseObject;
import com.crowdin.client.translationmemory.model.TranslationMemoryResponseList;
import com.crowdin.client.translationmemory.model.TranslationMemoryResponseObject;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TranslationMemoryApi extends CrowdinApi {

    public TranslationMemoryApi(Credentials credentials) {
        super(credentials);
    }

    public TranslationMemoryApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param projectId  project identifier
     * @param request    request object
     * @return list of search results
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.tms.concordance.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.tms.concordance.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<SearchConcordance> searchConcordance(Long projectId, SearchConcordanceRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId group identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param userId filter by user identifier
     * @return list of translation memories
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<TranslationMemory> listTms(Long groupId, Integer limit, Integer offset, Integer userId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId group identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param userId filter by user identifier
     * @param orderBy list of OrderByField
     * @return list of translation memories
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<TranslationMemory> listTms(Long groupId, Integer limit, Integer offset, Integer userId, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request request object
     * @return newly created translation memory
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TranslationMemory> addTm(AddTranslationMemoryRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @return translation memory
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TranslationMemory> getTm(Long tmId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteTm(Long tmId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param request request object
     * @return updated translation memory
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TranslationMemory> editTm(Long tmId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.segments.clear" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.segments.clear" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void clearTm(Long tmId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param request request object
     * @return export status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.exports.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.exports.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TranslationMemoryExportStatus> exportTm(Long tmId, TranslationMemoryExportRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param exportId export identifier
     * @return export status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.exports.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.exports.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TranslationMemoryExportStatus> checkTmExportStatus(Long tmId, String exportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param exportId export identifier
     * @return download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.exports.download.download" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.exports.download.download" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> downloadTm(Long tmId, String exportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param request request object
     * @return import status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.imports.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.imports.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TranslationMemoryImportStatus> importTm(Long tmId, TranslationMemoryImportRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param importId import identifier
     * @return import status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.imports.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.imports.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TranslationMemoryImportStatus> checkTmImportStatus(Long tmId, String importId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //<editor-fold desc="Segments">
    /**
     * @param tmId translation memory identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of translation memory segments
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.segments.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.segments.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<TmSegment> listTmSegments(Long tmId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByField
     * @return list of translation memory segments
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.segments.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.segments.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<TmSegment> listTmSegments(Long tmId, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param request request object
     * @return newly created translation memory segment
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.segments.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.segments.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TmSegment> createTmSegment(Long tmId, CreateTmSegmentRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param segmentId segment identifier
     * @return translation memory segment
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.segments.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.segments.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TmSegment> getTmSegment(Long tmId, Long segmentId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param segmentId segment identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.segments.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.segments.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteTmSegment(Long tmId, Long segmentId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param tmId translation memory identifier
     * @param segmentId segment identifier
     * @param request request object
     * @return updated translation memory segment
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.tms.segments.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.tms.segments.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<TmSegment> editTmSegment(Long tmId, Long segmentId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //<editor-fold desc="Helper methods">
    private String formUrl_tmSegments(Long tmId) {
        return this.url + "/tms/" + tmId + "/segments";
    }

    private String formUrl_tmSegmentId(Long tmId, Long segmentId) {
        return this.url + "/tms/" + tmId + "/segments/" + segmentId;
    }
    //</editor-fold>
    //</editor-fold>
}
