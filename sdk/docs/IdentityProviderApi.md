# IdentityProviderApi

All URIs are relative to *https://fbn-prd.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addScim**](IdentityProviderApi.md#addScim) | **PUT** /api/identityprovider/scim | AddScim: Add SCIM |
| [**removeScim**](IdentityProviderApi.md#removeScim) | **DELETE** /api/identityprovider/scim | RemoveScim: Remove SCIM |



## addScim

> AddScimResponse addScim(apiTokenAction, oldApiTokenDeactivation)

AddScim: Add SCIM

Generates an API token to be used for SCIM

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.IdentityProviderApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentityProviderApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"identityUrl\": \"https://<your-domain>.lusid.com/identity\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        IdentityProviderApi apiInstance = ApiFactoryBuilder.build(fileName).build(IdentityProviderApi.class);
        String apiTokenAction = "apiTokenAction_example"; // String | The action to take. For the API token. Defaults to \"ensure\"
        OffsetDateTime oldApiTokenDeactivation = OffsetDateTime.now(); // OffsetDateTime | Optional deactivation date for the old API token. Only used if apiTokenAction is \"regenerate\"
        try {
            AddScimResponse result = apiInstance.addScim(apiTokenAction, oldApiTokenDeactivation).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityProviderApi#addScim");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
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

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The base URL and API token to be used |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## removeScim

> removeScim()

RemoveScim: Remove SCIM

Deactivates any existing SCIM API token

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.IdentityProviderApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentityProviderApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"identityUrl\": \"https://<your-domain>.lusid.com/identity\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        IdentityProviderApi apiInstance = ApiFactoryBuilder.build(fileName).build(IdentityProviderApi.class);
        try {
            apiInstance.removeScim().execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityProviderApi#removeScim");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

