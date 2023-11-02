# IdentityProviderApi

All URIs are relative to *https://fbn-ci.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addScim**](IdentityProviderApi.md#addScim) | **PUT** /api/identityprovider/scim | [EARLY ACCESS] AddScim: Add SCIM |
| [**removeScim**](IdentityProviderApi.md#removeScim) | **DELETE** /api/identityprovider/scim | [EARLY ACCESS] RemoveScim: Remove SCIM |


<a id="addScim"></a>
# **addScim**
> AddScimResponse addScim().apiTokenAction(apiTokenAction).oldApiTokenDeactivation(oldApiTokenDeactivation).execute();

[EARLY ACCESS] AddScim: Add SCIM

Generates an API token to be used for SCIM

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.IdentityProviderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    IdentityProviderApi apiInstance = new IdentityProviderApi(defaultClient);
    String apiTokenAction = "apiTokenAction_example"; // String | The action to take. For the API token. Defaults to \"ensure\"
    OffsetDateTime oldApiTokenDeactivation = OffsetDateTime.now(); // OffsetDateTime | Optional deactivation date for the old API token. Only used if apiTokenAction is \"regenerate\"
    try {
      AddScimResponse result = apiInstance.addScim()
            .apiTokenAction(apiTokenAction)
            .oldApiTokenDeactivation(oldApiTokenDeactivation)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#addScim");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiTokenAction** | **String**| The action to take. For the API token. Defaults to \&quot;ensure\&quot; | [optional] |
| **oldApiTokenDeactivation** | **OffsetDateTime**| Optional deactivation date for the old API token. Only used if apiTokenAction is \&quot;regenerate\&quot; | [optional] |

### Return type

[**AddScimResponse**](AddScimResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The base URL and API token to be used |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="removeScim"></a>
# **removeScim**
> removeScim().execute();

[EARLY ACCESS] RemoveScim: Remove SCIM

Deactivates any existing SCIM API token

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.IdentityProviderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-ci.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    IdentityProviderApi apiInstance = new IdentityProviderApi(defaultClient);
    try {
      apiInstance.removeScim()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityProviderApi#removeScim");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **0** | Error response |  -  |

