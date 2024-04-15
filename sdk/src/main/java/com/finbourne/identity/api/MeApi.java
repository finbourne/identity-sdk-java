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

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.identity.model.CurrentUserResponse;
import com.finbourne.identity.model.LusidProblemDetails;
import com.finbourne.identity.model.LusidValidationProblemDetails;
import com.finbourne.identity.model.SetPassword;
import com.finbourne.identity.model.SetPasswordResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MeApi(ApiClient apiClient) {
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

    private okhttp3.Call getUserInfoCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/me";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserInfoValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getUserInfoCall(_callback);

    }


    private ApiResponse<CurrentUserResponse> getUserInfoWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getUserInfoValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<CurrentUserResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getUserInfoAsync(final ApiCallback<CurrentUserResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserInfoValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<CurrentUserResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetUserInfoRequest {

        private APIgetUserInfoRequest() {
        }

        /**
         * Build call for getUserInfo
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get the specified user&#39;s info </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getUserInfoCall(_callback);
        }

        /**
         * Execute getUserInfo request
         * @return CurrentUserResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get the specified user&#39;s info </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public CurrentUserResponse execute() throws ApiException {
            ApiResponse<CurrentUserResponse> localVarResp = getUserInfoWithHttpInfo();
            return localVarResp.getData();
        }

        /**
         * Execute getUserInfo request with HTTP info returned
         * @return ApiResponse&lt;CurrentUserResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get the specified user&#39;s info </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CurrentUserResponse> executeWithHttpInfo() throws ApiException {
            return getUserInfoWithHttpInfo();
        }

        /**
         * Execute getUserInfo request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get the specified user&#39;s info </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CurrentUserResponse> _callback) throws ApiException {
            return getUserInfoAsync(_callback);
        }
    }

    /**
     * GetUserInfo: Get User Info
     * Get the requesting user&#39;s basic info
     * @return APIgetUserInfoRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get the specified user&#39;s info </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIgetUserInfoRequest getUserInfo() {
        return new APIgetUserInfoRequest();
    }
    private okhttp3.Call setPasswordCall(SetPassword setPassword, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = setPassword;

        // create path and map variables
        String localVarPath = "/api/me/password";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setPasswordValidateBeforeCall(SetPassword setPassword, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'setPassword' is set
        if (setPassword == null) {
            throw new ApiException("Missing the required parameter 'setPassword' when calling setPassword(Async)");
        }

        return setPasswordCall(setPassword, _callback);

    }


    private ApiResponse<SetPasswordResponse> setPasswordWithHttpInfo(SetPassword setPassword) throws ApiException {
        okhttp3.Call localVarCall = setPasswordValidateBeforeCall(setPassword, null);
        Type localVarReturnType = new TypeToken<SetPasswordResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call setPasswordAsync(SetPassword setPassword, final ApiCallback<SetPasswordResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = setPasswordValidateBeforeCall(setPassword, _callback);
        Type localVarReturnType = new TypeToken<SetPasswordResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIsetPasswordRequest {
        private final SetPassword setPassword;

        private APIsetPasswordRequest(SetPassword setPassword) {
            this.setPassword = setPassword;
        }

        /**
         * Build call for setPassword
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Set the current user&#39;s password </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return setPasswordCall(setPassword, _callback);
        }

        /**
         * Execute setPassword request
         * @return SetPasswordResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Set the current user&#39;s password </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public SetPasswordResponse execute() throws ApiException {
            ApiResponse<SetPasswordResponse> localVarResp = setPasswordWithHttpInfo(setPassword);
            return localVarResp.getData();
        }

        /**
         * Execute setPassword request with HTTP info returned
         * @return ApiResponse&lt;SetPasswordResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Set the current user&#39;s password </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SetPasswordResponse> executeWithHttpInfo() throws ApiException {
            return setPasswordWithHttpInfo(setPassword);
        }

        /**
         * Execute setPassword request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Set the current user&#39;s password </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SetPasswordResponse> _callback) throws ApiException {
            return setPasswordAsync(setPassword, _callback);
        }
    }

    /**
     * SetPassword: Set password of current user
     * Set the password of the current user to the specified value.     Note this is feature is only available to Service users authenticated using OpenID. For further information  relating to usage of this feature please consult the documentation.
     * @param setPassword The request containing the new password value (required)
     * @return APIsetPasswordRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Set the current user&#39;s password </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIsetPasswordRequest setPassword(SetPassword setPassword) {
        return new APIsetPasswordRequest(setPassword);
    }
}
