package com.crowdin.client.stringtranslations;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.*;
import com.crowdin.client.stringtranslations.model.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StringTranslationsApi extends CrowdinApi {

    public StringTranslationsApi(Credentials credentials) {
        super(credentials);
    }

    public StringTranslationsApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param projectId project identifier
     * @param request request body
     * @return align-translation response
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.alignment.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.alignment.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public AlignTranslationResponse alignTranslation(Long projectId, AlignTranslationRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param fileId file identifier
     * @param stringId string identifier
     * @param languageId language identifier
     * @param translationId translation identifier
     * @param labelIds filter approvals by labelIds
     * @param excludeLabelIds exclude approvals by labelIds
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of approvals
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.approvals.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.approvals.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Approval> listTranslationApprovals(Long projectId, Long fileId, Long stringId, String languageId, Long translationId, String labelIds, String excludeLabelIds, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param fileId file identifier
     * @param stringId string identifier
     * @param languageId language identifier
     * @param translationId translation identifier
     * @param labelIds filter approvals by labelIds
     * @param excludeLabelIds exclude approvals by labelIds
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByField
     * @return list of approvals
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.approvals.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.approvals.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Approval> listTranslationApprovals(Long projectId, Long fileId, Long stringId, String languageId, Long translationId, String labelIds, String excludeLabelIds, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<Approval> listTranslationApprovals(Long projectId, ListTranslationApprovalsOptions options) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request body
     * @return newly created approval
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.approvals.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.approvals.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Approval> addApproval(Long projectId, AddApprovalRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param approvalId approval identifier
     * @return approval
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.approvals.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.approvals.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Approval> getApproval(Long projectId, Long approvalId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param stringId string identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.approvals.deleteMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.approvals.deleteMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void removeStringApprovals(Long projectId, Long stringId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param approvalId approval identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.approvals.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.approvals.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void removeApproval(Long projectId, Long approvalId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/api/v2/#tag/String-Translations/operation/api.projects.approvals.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/#tag/String-Translations/operation/api.projects.approvals.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Approval> approvalBatchOperations(Long projectId, List<PatchRequest> request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @see <ul>
     * <li><a href="https://support.crowdin.com/developer/api/v2/#tag/String-Translations/operation/api.projects.translations.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://support.crowdin.com/developer/enterprise/api/v2/#tag/String-Translations/operation/api.projects.translations.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<StringTranslation> translationBatchOperations(Long projectId, List<PatchRequest> request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param languageId language identifier
     * @param stringIds filter translations by stringIds
     * @param labelIds filter translations by labelIds
     * @param fileId filter translations by file identifier
     * @param branchId filter translations by branchId
     * @param directoryId filter translations by directoryId
     * @param croql filter translations by croql
     * @param denormalizePlaceholders enable denormalize placeholders
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of language translations
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.languages.translations.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.languages.translations.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<LanguageTranslations> listLanguageTranslations(Long projectId, String languageId, String stringIds, String labelIds, Long fileId, Long branchId, Long directoryId, String croql, Integer denormalizePlaceholders, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param languageId language identifier
     * @param stringIds filter translations by stringIds
     * @param labelIds filter translations by labelIds
     * @param fileId filter translations by file identifier
     * @param branchId filter translations by branchId
     * @param directoryId filter translations by directoryId
     * @param croql filter translations by croql
     * @param denormalizePlaceholders enable denormalize placeholders
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderByField
     * @return list of language translations
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.languages.translations.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.languages.translations.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<LanguageTranslations> listLanguageTranslations(Long projectId, String languageId, String stringIds, String labelIds, Long fileId, Long branchId, Long directoryId, String croql, Integer denormalizePlaceholders, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<LanguageTranslations> listLanguageTranslations(Long projectId, String languageId, ListLanguageTranslationsOptions options) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param stringId string identifier
     * @param languageId language identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of string translations
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<StringTranslation> listStringTranslations(Long projectId, Long stringId, String languageId, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param stringId string identifier
     * @param languageId language identifier
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @param orderBy list of OrderBy field
     * @return list of string translations
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<StringTranslation> listStringTranslations(Long projectId, Long stringId, String languageId, Integer limit, Integer offset, List<OrderByField> orderBy) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<StringTranslation> listStringTranslations(Long projectId, ListStringTranslationsOptions options) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request body
     * @return newly created translation
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<StringTranslation> addTranslation(Long projectId, AddStringTranslationRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param stringId string identifier
     * @param languageId language identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.deleteMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.deleteMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteStringTranslations(Long projectId, Long stringId, String languageId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param translationId translation identifier
     * @return string translation
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<StringTranslation> getStringTranslation(Long projectId, Long translationId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param translationId translation identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteStringTranslation(Long projectId, Long translationId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param translationId translation identifier
     * @return string translation
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.translations.put" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.translations.put" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<StringTranslation> restoreStringTranslation(Long projectId, Long translationId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param stringId string identifier
     * @param languageId language identifier
     * @param translationId translation identifier
     * @param labelIds filter votes by labelIds
     * @param excludeLabelIds exclude votes by labelIds
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of votes
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.votes.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.votes.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Vote> listTranslationVotes(Long projectId, Long stringId, String languageId, Long translationId, String labelIds, String excludeLabelIds, Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResponseList<Vote> listTranslationVotes(Long projectId, ListTranslationVotesOptions options) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param request request body
     * @return newly created vote
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.votes.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.votes.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Vote> addVote(Long projectId, AddVoteRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param voteId vote identifier
     * @return vote
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.votes.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.votes.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Vote> getVote(Long projectId, Long voteId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param projectId project identifier
     * @param voteId vote identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.projects.votes.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.projects.votes.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void cancelVote(Long projectId, Long voteId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
