/*
 * FINBOURNE Identity Service API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.identity.api;

import com.finbourne.identity.ApiCallback;
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.ApiResponse;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.Pair;
import com.finbourne.identity.ProgressRequestBody;
import com.finbourne.identity.ProgressResponseBody;
import com.finbourne.identity.extensions.ConfigurationOptions;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.identity.model.ApiKey;
import com.finbourne.identity.model.CreateApiKey;
import com.finbourne.identity.model.CreatedApiKey;
import com.finbourne.identity.model.LusidProblemDetails;
import com.finbourne.identity.model.LusidValidationProblemDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalAuthenticationTokensApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PersonalAuthenticationTokensApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PersonalAuthenticationTokensApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createApiKeyCall(CreateApiKey createApiKey, final ApiCallback _callback) throws ApiException {
        return createApiKeyCall(createApiKey,  _callback, new ConfigurationOptions());
    }

    private okhttp3.Call createApiKeyCall(CreateApiKey createApiKey, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createApiKey;

        // create path and map variables
        String localVarPath = "/api/keys";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, opts);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createApiKeyValidateBeforeCall(CreateApiKey createApiKey, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        // verify the required parameter 'createApiKey' is set
        if (createApiKey == null) {
            throw new ApiException("Missing the required parameter 'createApiKey' when calling createApiKey(Async)");
        }

        return createApiKeyCall(createApiKey, _callback, opts);

    }


    private ApiResponse<CreatedApiKey> createApiKeyWithHttpInfo(CreateApiKey createApiKey) throws ApiException {
        okhttp3.Call localVarCall = createApiKeyValidateBeforeCall(createApiKey, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<CreatedApiKey>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<CreatedApiKey> createApiKeyWithHttpInfo(CreateApiKey createApiKey, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = createApiKeyValidateBeforeCall(createApiKey, null, opts);
        Type localVarReturnType = new TypeToken<CreatedApiKey>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createApiKeyAsync(CreateApiKey createApiKey, final ApiCallback<CreatedApiKey> _callback) throws ApiException {

        okhttp3.Call localVarCall = createApiKeyValidateBeforeCall(createApiKey, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<CreatedApiKey>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call createApiKeyAsync(CreateApiKey createApiKey, final ApiCallback<CreatedApiKey> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = createApiKeyValidateBeforeCall(createApiKey, _callback, opts);
        Type localVarReturnType = new TypeToken<CreatedApiKey>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateApiKeyRequest {
        private final CreateApiKey createApiKey;

        private APIcreateApiKeyRequest(CreateApiKey createApiKey) {
            this.createApiKey = createApiKey;
        }

        /**
         * Build call for createApiKey
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The Personal Access Token and associated meta data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createApiKeyCall(createApiKey, _callback);
        }

        /**
         * Execute createApiKey request
         * @return CreatedApiKey
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The Personal Access Token and associated meta data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public CreatedApiKey execute() throws ApiException {
            ApiResponse<CreatedApiKey> localVarResp = createApiKeyWithHttpInfo(createApiKey);
            return localVarResp.getData();
        }

        /**
         * Execute createApiKey request. Use any specified configuration options to override any other configuration for this request only.
         * @return CreatedApiKey
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The Personal Access Token and associated meta data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public CreatedApiKey execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<CreatedApiKey> localVarResp = createApiKeyWithHttpInfo(createApiKey, opts);
            return localVarResp.getData();
        }

        /**
         * Execute createApiKey request with HTTP info returned
         * @return ApiResponse&lt;CreatedApiKey&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The Personal Access Token and associated meta data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CreatedApiKey> executeWithHttpInfo() throws ApiException {
            return createApiKeyWithHttpInfo(createApiKey);
        }

        /**
         * Execute createApiKey request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;CreatedApiKey&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The Personal Access Token and associated meta data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CreatedApiKey> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return createApiKeyWithHttpInfo(createApiKey, opts);
        }

        /**
         * Execute createApiKey request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The Personal Access Token and associated meta data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CreatedApiKey> _callback) throws ApiException {
            return createApiKeyAsync(createApiKey, _callback);
        }

        /**
         * Execute createApiKey request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The Personal Access Token and associated meta data. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CreatedApiKey> _callback, ConfigurationOptions opts) throws ApiException {
            return createApiKeyAsync(createApiKey, _callback, opts);
        }
    }

    /**
     * CreateApiKey: Create a Personal Access Token
     * Generates a Personal Access Token and returns the new key and its associated metadata.
     * @param createApiKey The request to create a new Personal Access Token (required)
     * @return APIcreateApiKeyRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Personal Access Token and associated meta data. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateApiKeyRequest createApiKey(CreateApiKey createApiKey) {
        return new APIcreateApiKeyRequest(createApiKey);
    }
    private okhttp3.Call deleteApiKeyCall(String id, final ApiCallback _callback) throws ApiException {
        return deleteApiKeyCall(id,  _callback, new ConfigurationOptions());
    }

    private okhttp3.Call deleteApiKeyCall(String id, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/keys/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, opts);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteApiKeyValidateBeforeCall(String id, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteApiKey(Async)");
        }

        return deleteApiKeyCall(id, _callback, opts);

    }


    private ApiResponse<ApiKey> deleteApiKeyWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = deleteApiKeyValidateBeforeCall(id, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ApiKey>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<ApiKey> deleteApiKeyWithHttpInfo(String id, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = deleteApiKeyValidateBeforeCall(id, null, opts);
        Type localVarReturnType = new TypeToken<ApiKey>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteApiKeyAsync(String id, final ApiCallback<ApiKey> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteApiKeyValidateBeforeCall(id, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ApiKey>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call deleteApiKeyAsync(String id, final ApiCallback<ApiKey> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = deleteApiKeyValidateBeforeCall(id, _callback, opts);
        Type localVarReturnType = new TypeToken<ApiKey>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteApiKeyRequest {
        private final String id;

        private APIdeleteApiKeyRequest(String id) {
            this.id = id;
        }

        /**
         * Build call for deleteApiKey
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Invalidates a Personal Access Token </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteApiKeyCall(id, _callback);
        }

        /**
         * Execute deleteApiKey request
         * @return ApiKey
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Invalidates a Personal Access Token </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiKey execute() throws ApiException {
            ApiResponse<ApiKey> localVarResp = deleteApiKeyWithHttpInfo(id);
            return localVarResp.getData();
        }

        /**
         * Execute deleteApiKey request. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiKey
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Invalidates a Personal Access Token </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiKey execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<ApiKey> localVarResp = deleteApiKeyWithHttpInfo(id, opts);
            return localVarResp.getData();
        }

        /**
         * Execute deleteApiKey request with HTTP info returned
         * @return ApiResponse&lt;ApiKey&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Invalidates a Personal Access Token </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ApiKey> executeWithHttpInfo() throws ApiException {
            return deleteApiKeyWithHttpInfo(id);
        }

        /**
         * Execute deleteApiKey request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;ApiKey&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Invalidates a Personal Access Token </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ApiKey> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return deleteApiKeyWithHttpInfo(id, opts);
        }

        /**
         * Execute deleteApiKey request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Invalidates a Personal Access Token </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ApiKey> _callback) throws ApiException {
            return deleteApiKeyAsync(id, _callback);
        }

        /**
         * Execute deleteApiKey request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Invalidates a Personal Access Token </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ApiKey> _callback, ConfigurationOptions opts) throws ApiException {
            return deleteApiKeyAsync(id, _callback, opts);
        }
    }

    /**
     * DeleteApiKey: Invalidate a Personal Access Token
     * Immediately invalidates the specified Personal Access Token
     * @param id The id of the Personal Access Token to delete (required)
     * @return APIdeleteApiKeyRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Invalidates a Personal Access Token </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteApiKeyRequest deleteApiKey(String id) {
        return new APIdeleteApiKeyRequest(id);
    }
    private okhttp3.Call listOwnApiKeysCall(final ApiCallback _callback) throws ApiException {
        return listOwnApiKeysCall( _callback, new ConfigurationOptions());
    }

    private okhttp3.Call listOwnApiKeysCall(final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/keys";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, opts);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listOwnApiKeysValidateBeforeCall(final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        return listOwnApiKeysCall(_callback, opts);

    }


    private ApiResponse<List<ApiKey>> listOwnApiKeysWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listOwnApiKeysValidateBeforeCall(null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<List<ApiKey>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<List<ApiKey>> listOwnApiKeysWithHttpInfo(ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = listOwnApiKeysValidateBeforeCall(null, opts);
        Type localVarReturnType = new TypeToken<List<ApiKey>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listOwnApiKeysAsync(final ApiCallback<List<ApiKey>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listOwnApiKeysValidateBeforeCall(_callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<List<ApiKey>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call listOwnApiKeysAsync(final ApiCallback<List<ApiKey>> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = listOwnApiKeysValidateBeforeCall(_callback, opts);
        Type localVarReturnType = new TypeToken<List<ApiKey>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistOwnApiKeysRequest {

        private APIlistOwnApiKeysRequest() {
        }

        /**
         * Build call for listOwnApiKeys
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of user&#39;s existing Personal Access Tokens </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listOwnApiKeysCall(_callback);
        }

        /**
         * Execute listOwnApiKeys request
         * @return List&lt;ApiKey&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of user&#39;s existing Personal Access Tokens </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public List<ApiKey> execute() throws ApiException {
            ApiResponse<List<ApiKey>> localVarResp = listOwnApiKeysWithHttpInfo();
            return localVarResp.getData();
        }

        /**
         * Execute listOwnApiKeys request. Use any specified configuration options to override any other configuration for this request only.
         * @return List&lt;ApiKey&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of user&#39;s existing Personal Access Tokens </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public List<ApiKey> execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<List<ApiKey>> localVarResp = listOwnApiKeysWithHttpInfo(opts);
            return localVarResp.getData();
        }

        /**
         * Execute listOwnApiKeys request with HTTP info returned
         * @return ApiResponse&lt;List&lt;ApiKey&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of user&#39;s existing Personal Access Tokens </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<ApiKey>> executeWithHttpInfo() throws ApiException {
            return listOwnApiKeysWithHttpInfo();
        }

        /**
         * Execute listOwnApiKeys request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;List&lt;ApiKey&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of user&#39;s existing Personal Access Tokens </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<ApiKey>> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return listOwnApiKeysWithHttpInfo(opts);
        }

        /**
         * Execute listOwnApiKeys request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of user&#39;s existing Personal Access Tokens </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<ApiKey>> _callback) throws ApiException {
            return listOwnApiKeysAsync(_callback);
        }

        /**
         * Execute listOwnApiKeys request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> List of user&#39;s existing Personal Access Tokens </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<ApiKey>> _callback, ConfigurationOptions opts) throws ApiException {
            return listOwnApiKeysAsync(_callback, opts);
        }
    }

    /**
     * ListOwnApiKeys: Gets the meta data for all of the user&#39;s existing Personal Access Tokens.
     * Gets the meta data for all of the user&#39;s Personal Access Tokens that have not been deleted. They may be  invalid due to the deactivation date having passed.
     * @return APIlistOwnApiKeysRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of user&#39;s existing Personal Access Tokens </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIlistOwnApiKeysRequest listOwnApiKeys() {
        return new APIlistOwnApiKeysRequest();
    }
}
