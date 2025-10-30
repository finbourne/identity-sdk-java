# AuthenticationApi

All URIs are relative to *https://fbn-prd.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuthenticationInformation**](AuthenticationApi.md#getAuthenticationInformation) | **GET** /api/authentication/information | GetAuthenticationInformation: Gets AuthenticationInformation |
| [**getPasswordPolicy**](AuthenticationApi.md#getPasswordPolicy) | **GET** /api/authentication/password-policy/{userType} | GetPasswordPolicy: Gets password policy for a user type |
| [**getSupportAccessHistory**](AuthenticationApi.md#getSupportAccessHistory) | **GET** /api/authentication/support | GetSupportAccessHistory: Get the history of all support access granted and any information pertaining to their termination |
| [**getSupportRoles**](AuthenticationApi.md#getSupportRoles) | **GET** /api/authentication/support-roles | GetSupportRoles: Get mapping of support roles, the internal representation to a human friendly representation |
| [**grantSupportAccess**](AuthenticationApi.md#grantSupportAccess) | **POST** /api/authentication/support | GrantSupportAccess: Grants FINBOURNE support access to your account |
| [**invalidateSupportAccess**](AuthenticationApi.md#invalidateSupportAccess) | **DELETE** /api/authentication/support | InvalidateSupportAccess: Revoke any FINBOURNE support access to your account |
| [**updatePasswordPolicy**](AuthenticationApi.md#updatePasswordPolicy) | **PUT** /api/authentication/password-policy/{userType} | UpdatePasswordPolicy: Updates password policy for a user type |



## getAuthenticationInformation

> AuthenticationInformation getAuthenticationInformation()

GetAuthenticationInformation: Gets AuthenticationInformation

Get the AuthenticationInformation associated with the current domain. This includes all the necessary information to login to this domain.

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.AuthenticationApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AuthenticationApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // AuthenticationApi apiInstance = apiFactory.build(AuthenticationApi.class);

        AuthenticationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AuthenticationApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // AuthenticationInformation result = apiInstance.getAuthenticationInformation().execute(opts);

            AuthenticationInformation result = apiInstance.getAuthenticationInformation().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#getAuthenticationInformation");
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

[**AuthenticationInformation**](AuthenticationInformation.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get authentication information |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getPasswordPolicy

> PasswordPolicyResponse getPasswordPolicy(userType)

GetPasswordPolicy: Gets password policy for a user type

Get the password policy for a given user type

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.AuthenticationApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AuthenticationApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // AuthenticationApi apiInstance = apiFactory.build(AuthenticationApi.class);

        AuthenticationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AuthenticationApi.class);
        String userType = "userType_example"; // String | The type of user (should only be personal or service)
        try {
            // uncomment the below to set overrides at the request level
            // PasswordPolicyResponse result = apiInstance.getPasswordPolicy(userType).execute(opts);

            PasswordPolicyResponse result = apiInstance.getPasswordPolicy(userType).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#getPasswordPolicy");
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
| **userType** | **String**| The type of user (should only be personal or service) | |

### Return type

[**PasswordPolicyResponse**](PasswordPolicyResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get password policy |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSupportAccessHistory

> List&lt;SupportAccessResponse&gt; getSupportAccessHistory(start, end)

GetSupportAccessHistory: Get the history of all support access granted and any information pertaining to their termination

The active and inactive support requests will be returned, inactive support requests will have information pertaining to their termination including obfuscated userIds of those who created and terminated the request

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.AuthenticationApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AuthenticationApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // AuthenticationApi apiInstance = apiFactory.build(AuthenticationApi.class);

        AuthenticationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AuthenticationApi.class);
        OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | The start expiry date to query support access requests from
        OffsetDateTime end = OffsetDateTime.now(); // OffsetDateTime | The end expiry date to query support access requests to
        try {
            // uncomment the below to set overrides at the request level
            // List<SupportAccessResponse> result = apiInstance.getSupportAccessHistory(start, end).execute(opts);

            List<SupportAccessResponse> result = apiInstance.getSupportAccessHistory(start, end).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#getSupportAccessHistory");
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
| **start** | **OffsetDateTime**| The start expiry date to query support access requests from | [optional] |
| **end** | **OffsetDateTime**| The end expiry date to query support access requests to | [optional] |

### Return type

[**List&lt;SupportAccessResponse&gt;**](SupportAccessResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get support access history |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSupportRoles

> SupportRolesResponse getSupportRoles()

GetSupportRoles: Get mapping of support roles, the internal representation to a human friendly representation

Get mapping of support roles, the internal representation to a human friendly representation

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.AuthenticationApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AuthenticationApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // AuthenticationApi apiInstance = apiFactory.build(AuthenticationApi.class);

        AuthenticationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AuthenticationApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // SupportRolesResponse result = apiInstance.getSupportRoles().execute(opts);

            SupportRolesResponse result = apiInstance.getSupportRoles().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#getSupportRoles");
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

[**SupportRolesResponse**](SupportRolesResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get support roles |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## grantSupportAccess

> SupportAccessResponse grantSupportAccess(supportAccessRequest)

GrantSupportAccess: Grants FINBOURNE support access to your account

Granting support access will allow FINBOURNE employees full access to your data with the express intent to investigate support issues You can revoke this (and all) access at any time using the InvalidateSupportAccess endpoint.

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.AuthenticationApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AuthenticationApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // AuthenticationApi apiInstance = apiFactory.build(AuthenticationApi.class);

        AuthenticationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AuthenticationApi.class);
        SupportAccessRequest supportAccessRequest = new SupportAccessRequest(); // SupportAccessRequest | Request detailing the duration and reasons for supplying support access
        try {
            // uncomment the below to set overrides at the request level
            // SupportAccessResponse result = apiInstance.grantSupportAccess(supportAccessRequest).execute(opts);

            SupportAccessResponse result = apiInstance.grantSupportAccess(supportAccessRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#grantSupportAccess");
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
| **supportAccessRequest** | [**SupportAccessRequest**](SupportAccessRequest.md)| Request detailing the duration and reasons for supplying support access | |

### Return type

[**SupportAccessResponse**](SupportAccessResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Grant Support Access |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## invalidateSupportAccess

> List&lt;SupportAccessResponse&gt; invalidateSupportAccess()

InvalidateSupportAccess: Revoke any FINBOURNE support access to your account

This will result in a loss of access to your data for all FINBOURNE support agents

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.AuthenticationApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AuthenticationApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // AuthenticationApi apiInstance = apiFactory.build(AuthenticationApi.class);

        AuthenticationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AuthenticationApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // List<SupportAccessResponse> result = apiInstance.invalidateSupportAccess().execute(opts);

            List<SupportAccessResponse> result = apiInstance.invalidateSupportAccess().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#invalidateSupportAccess");
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

[**List&lt;SupportAccessResponse&gt;**](SupportAccessResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invalidate all currently active support requests |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updatePasswordPolicy

> PasswordPolicyResponse updatePasswordPolicy(userType, updatePasswordPolicyRequest)

UpdatePasswordPolicy: Updates password policy for a user type

Update the password policy for a given user type

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.AuthenticationApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AuthenticationApiExample {

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

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // AuthenticationApi apiInstance = apiFactory.build(AuthenticationApi.class);

        AuthenticationApi apiInstance = ApiFactoryBuilder.build(fileName).build(AuthenticationApi.class);
        String userType = "userType_example"; // String | The type of user (should only be personal or service)
        UpdatePasswordPolicyRequest updatePasswordPolicyRequest = new UpdatePasswordPolicyRequest(); // UpdatePasswordPolicyRequest | The password policy for the given user type
        try {
            // uncomment the below to set overrides at the request level
            // PasswordPolicyResponse result = apiInstance.updatePasswordPolicy(userType, updatePasswordPolicyRequest).execute(opts);

            PasswordPolicyResponse result = apiInstance.updatePasswordPolicy(userType, updatePasswordPolicyRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#updatePasswordPolicy");
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
| **userType** | **String**| The type of user (should only be personal or service) | |
| **updatePasswordPolicyRequest** | [**UpdatePasswordPolicyRequest**](UpdatePasswordPolicyRequest.md)| The password policy for the given user type | [optional] |

### Return type

[**PasswordPolicyResponse**](PasswordPolicyResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update password policy |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

