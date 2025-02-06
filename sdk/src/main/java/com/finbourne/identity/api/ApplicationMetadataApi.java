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


import com.finbourne.identity.model.LusidProblemDetails;
import com.finbourne.identity.model.ResourceListOfAccessControlledResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationMetadataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApplicationMetadataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationMetadataApi(ApiClient apiClient) {
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

    private okhttp3.Call listAccessControlledResourcesCall(final ApiCallback _callback) throws ApiException {
        return listAccessControlledResourcesCall( _callback, new ConfigurationOptions());
    }

    private okhttp3.Call listAccessControlledResourcesCall(final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
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
        String localVarPath = "/api/metadata/access/resources";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
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
    private okhttp3.Call listAccessControlledResourcesValidateBeforeCall(final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        return listAccessControlledResourcesCall(_callback, opts);

    }


    private ApiResponse<ResourceListOfAccessControlledResource> listAccessControlledResourcesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listAccessControlledResourcesValidateBeforeCall(null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ResourceListOfAccessControlledResource>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<ResourceListOfAccessControlledResource> listAccessControlledResourcesWithHttpInfo(ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = listAccessControlledResourcesValidateBeforeCall(null, opts);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessControlledResource>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAccessControlledResourcesAsync(final ApiCallback<ResourceListOfAccessControlledResource> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAccessControlledResourcesValidateBeforeCall(_callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<ResourceListOfAccessControlledResource>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call listAccessControlledResourcesAsync(final ApiCallback<ResourceListOfAccessControlledResource> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = listAccessControlledResourcesValidateBeforeCall(_callback, opts);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessControlledResource>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistAccessControlledResourcesRequest {

        private APIlistAccessControlledResourcesRequest() {
        }

        /**
         * Build call for listAccessControlledResources
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAccessControlledResourcesCall(_callback);
        }

        /**
         * Execute listAccessControlledResources request
         * @return ResourceListOfAccessControlledResource
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ResourceListOfAccessControlledResource execute() throws ApiException {
            ApiResponse<ResourceListOfAccessControlledResource> localVarResp = listAccessControlledResourcesWithHttpInfo();
            return localVarResp.getData();
        }

        /**
         * Execute listAccessControlledResources request. Use any specified configuration options to override any other configuration for this request only.
         * @return ResourceListOfAccessControlledResource
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ResourceListOfAccessControlledResource execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<ResourceListOfAccessControlledResource> localVarResp = listAccessControlledResourcesWithHttpInfo(opts);
            return localVarResp.getData();
        }

        /**
         * Execute listAccessControlledResources request with HTTP info returned
         * @return ApiResponse&lt;ResourceListOfAccessControlledResource&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResourceListOfAccessControlledResource> executeWithHttpInfo() throws ApiException {
            return listAccessControlledResourcesWithHttpInfo();
        }

        /**
         * Execute listAccessControlledResources request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;ResourceListOfAccessControlledResource&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ResourceListOfAccessControlledResource> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return listAccessControlledResourcesWithHttpInfo(opts);
        }

        /**
         * Execute listAccessControlledResources request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResourceListOfAccessControlledResource> _callback) throws ApiException {
            return listAccessControlledResourcesAsync(_callback);
        }

        /**
         * Execute listAccessControlledResources request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ResourceListOfAccessControlledResource> _callback, ConfigurationOptions opts) throws ApiException {
            return listAccessControlledResourcesAsync(_callback, opts);
        }
    }

    /**
     * ListAccessControlledResources: Get resources available for access control
     * Get the comprehensive set of resources that are available for access control
     * @return APIlistAccessControlledResourcesRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIlistAccessControlledResourcesRequest listAccessControlledResources() {
        return new APIlistAccessControlledResourcesRequest();
    }
}
