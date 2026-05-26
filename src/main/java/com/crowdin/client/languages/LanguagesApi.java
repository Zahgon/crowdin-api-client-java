package com.crowdin.client.languages;

import com.crowdin.client.core.CrowdinApi;
import com.crowdin.client.core.http.HttpRequestConfig;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.core.model.ClientConfig;
import com.crowdin.client.core.model.Credentials;
import com.crowdin.client.core.model.PatchRequest;
import com.crowdin.client.core.model.ResponseList;
import com.crowdin.client.core.model.ResponseObject;
import com.crowdin.client.languages.model.AddCustomLanguageRequest;
import com.crowdin.client.languages.model.Language;
import com.crowdin.client.languages.model.LanguageResponseList;
import com.crowdin.client.languages.model.LanguageResponseObject;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class LanguagesApi extends CrowdinApi {

    public LanguagesApi(Credentials credentials) {
        super(credentials);
    }

    public LanguagesApi(Credentials credentials, ClientConfig clientConfig) {
        super(credentials, clientConfig);
    }

    /**
     * @param limit maximum number of items to retrieve (default 25)
     * @param offset starting offset in the collection (default 0)
     * @return list of languages
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.languages.getMany" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.languages.getMany" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseList<Language> listSupportedLanguages(Integer limit, Integer offset) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param request request object
     * @return newly created language
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.languages.post" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.languages.post" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Language> addCustomLanguage(AddCustomLanguageRequest request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param languageId language identifier
     * @return language
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.languages.get" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.languages.get" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Language> getLanguage(String languageId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param languageId project identifier
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.languages.delete" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.languages.delete" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public void deleteLanguage(String languageId) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param languageId language identifier
     * @param request request object
     * @return updated language
     * @see <ul>
     * <li><a href="https://developer.crowdin.com/api/v2/#operation/api.languages.patch" target="_blank"><b>API Documentation</b></a></li>
     * <li><a href="https://developer.crowdin.com/enterprise/api/v2/#operation/api.languages.patch" target="_blank"><b>Enterprise API Documentation</b></a></li>
     * </ul>
     */
    public ResponseObject<Language> editLanguage(String languageId, List<PatchRequest> request) throws HttpException, HttpBadRequestException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
