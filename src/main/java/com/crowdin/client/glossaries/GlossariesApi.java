package com.crowdin.client.glossaries;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.glossaries.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class GlossariesApi extends CrowdinApi {

    public GlossariesApi(Credentials credentials) {
        super(credentials);
    }

    public GlossariesApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param projectId  project identifier
     * @param request    request object
     * @return list of search results
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.glossaries.concordance.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.glossaries.concordance.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<SearchConcordance> searchConcordance(Long projectId, SearchConcordanceRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of concepts
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.concepts.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.concepts.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Concept> listConcepts(Long glossaryId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByFields
     * @return list of concepts
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.concepts.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.concepts.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Concept> listConcepts(Long glossaryId, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<Concept> listConcepts(Long glossaryId, ListConceptsParams params) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param conceptId concept identifier
     * @return concept
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.concepts.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.concepts.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Concept> getConcept(Long glossaryId, Long conceptId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param conceptId concept identifier
     * @param request request object
     * @return updated concept
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.concepts.put" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.concepts.put" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Concept> updateConcept(Long glossaryId, Long conceptId, Concept request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param conceptId concept identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.concepts.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.concepts.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteConcept(Long glossaryId, Long conceptId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId group identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of glossaries
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Glossary> listGlossaries(Long groupId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param groupId group identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByField
     * @return list of glossaries
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Glossary> listGlossaries(Long groupId, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<Glossary> listGlossaries(ListGlossariesParams params) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request request object
     * @return newly created glossary
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Glossary> addGlossary(AddGlossaryRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @return glossary
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Glossary> getGlossary(Long glossaryId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteGlossary(Long glossaryId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param request request object
     * @return updated glossary
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Glossary> editGlossary(Long glossaryId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param request request object
     * @return export status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.exports.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.exports.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GlossaryExportStatus> exportGlossary(Long glossaryId, ExportGlossaryRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param exportId export identifier
     * @return export status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.exports.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.exports.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GlossaryExportStatus> checkGlossaryExportStatus(Long glossaryId, String exportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param exportId export identifier
     * @return download link
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.exports.download.download" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.exports.download.download" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<DownloadLink> downloadGlossary(Long glossaryId, String exportId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param request request object
     * @return import status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.imports.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.imports.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GlossaryImportStatus> importGlossary(Long glossaryId, ImportGlossaryRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param importId import identifier
     * @return import status
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.imports.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.imports.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<GlossaryImportStatus> checkGlossaryImportStatus(Long glossaryId, String importId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param userId user identifier
     * @param languageId language identifier
     * @param conceptId concept identifier
     * @param translationOfTermId term identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of terms
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.terms.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.terms.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Term> listTerms(Long glossaryId, Long userId, String languageId, Long conceptId, @Deprecated Long translationOfTermId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param userId user identifier
     * @param languageId language identifier
     * @param conceptId concept identifier
     * @param translationOfTermId term identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByField
     * @return list of terms
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.terms.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.terms.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Term> listTerms(Long glossaryId, Long userId, String languageId, Long conceptId, @Deprecated Long translationOfTermId, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<Term> listTerms(Long glossaryId, ListTermsParams params) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param request request object
     * @return newly created term
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.terms.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.terms.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Term> addTerm(Long glossaryId, AddTermRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param languageId language identifier
     * @param conceptId concept identifier
     * @param translationOfTermId translationOfTerm identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.terms.deleteMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.terms.deleteMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void clearGlossary(Long glossaryId, String languageId, Long conceptId, @Deprecated Long translationOfTermId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param termId term identifier
     * @return term
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.terms.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.terms.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Term> getTerm(Long glossaryId, Long termId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param termId term identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.terms.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.terms.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteTerm(Long glossaryId, Long termId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param glossaryId glossary identifier
     * @param termId term identifier
     * @param request request object
     * @return updated term
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.glossaries.terms.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.glossaries.terms.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Term> editTerm(Long glossaryId, Long termId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
