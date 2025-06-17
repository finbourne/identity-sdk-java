# ExternalTokenIssuersApi

All URIs are relative to *https://fbn-prd.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExternalTokenIssuer**](ExternalTokenIssuersApi.md#createExternalTokenIssuer) | **POST** /api/externaltokenissuers | [EARLY ACCESS] CreateExternalTokenIssuer: Create an External Token Issuer |
| [**deleteExternalTokenIssuer**](ExternalTokenIssuersApi.md#deleteExternalTokenIssuer) | **DELETE** /api/externaltokenissuers/{code} | [EARLY ACCESS] DeleteExternalTokenIssuer: Deletes an External Token Issuer by code |
| [**getExternalTokenIssuer**](ExternalTokenIssuersApi.md#getExternalTokenIssuer) | **GET** /api/externaltokenissuers/{code} | [EARLY ACCESS] GetExternalTokenIssuer: Gets an External Token Issuer with code |
| [**listExternalTokenIssuers**](ExternalTokenIssuersApi.md#listExternalTokenIssuers) | **GET** /api/externaltokenissuers | [EARLY ACCESS] ListExternalTokenIssuers: Lists all External Token Issuers for a domain |
| [**updateExternalTokenIssuer**](ExternalTokenIssuersApi.md#updateExternalTokenIssuer) | **PUT** /api/externaltokenissuers/{code} | [EARLY ACCESS] UpdateExternalTokenIssuer: Updates an existing External Token Issuer |



## createExternalTokenIssuer

> ExternalTokenIssuerResponse createExternalTokenIssuer(createExternalTokenIssuerRequest)

[EARLY ACCESS] CreateExternalTokenIssuer: Create an External Token Issuer

Creates an External Token Issuer

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.ExternalTokenIssuersApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ExternalTokenIssuersApiExample {

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
        // ExternalTokenIssuersApi apiInstance = apiFactory.build(ExternalTokenIssuersApi.class);

        ExternalTokenIssuersApi apiInstance = ApiFactoryBuilder.build(fileName).build(ExternalTokenIssuersApi.class);
        CreateExternalTokenIssuerRequest createExternalTokenIssuerRequest = new CreateExternalTokenIssuerRequest(); // CreateExternalTokenIssuerRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // ExternalTokenIssuerResponse result = apiInstance.createExternalTokenIssuer(createExternalTokenIssuerRequest).execute(opts);

            ExternalTokenIssuerResponse result = apiInstance.createExternalTokenIssuer(createExternalTokenIssuerRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTokenIssuersApi#createExternalTokenIssuer");
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
| **createExternalTokenIssuerRequest** | [**CreateExternalTokenIssuerRequest**](CreateExternalTokenIssuerRequest.md)|  | |

### Return type

[**ExternalTokenIssuerResponse**](ExternalTokenIssuerResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create External Token Issuer |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteExternalTokenIssuer

> deleteExternalTokenIssuer(code)

[EARLY ACCESS] DeleteExternalTokenIssuer: Deletes an External Token Issuer by code

Deletes an External Token Issuer

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.ExternalTokenIssuersApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ExternalTokenIssuersApiExample {

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
        // ExternalTokenIssuersApi apiInstance = apiFactory.build(ExternalTokenIssuersApi.class);

        ExternalTokenIssuersApi apiInstance = ApiFactoryBuilder.build(fileName).build(ExternalTokenIssuersApi.class);
        String code = "code_example"; // String | Identifier of the External Token Issuer to delete
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deleteExternalTokenIssuer(code).execute(opts);

            apiInstance.deleteExternalTokenIssuer(code).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTokenIssuersApi#deleteExternalTokenIssuer");
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
| **code** | **String**| Identifier of the External Token Issuer to delete | |

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getExternalTokenIssuer

> ExternalTokenIssuerResponse getExternalTokenIssuer(code)

[EARLY ACCESS] GetExternalTokenIssuer: Gets an External Token Issuer with code

Gets an External Token Issuer

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.ExternalTokenIssuersApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ExternalTokenIssuersApiExample {

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
        // ExternalTokenIssuersApi apiInstance = apiFactory.build(ExternalTokenIssuersApi.class);

        ExternalTokenIssuersApi apiInstance = ApiFactoryBuilder.build(fileName).build(ExternalTokenIssuersApi.class);
        String code = "code_example"; // String | Identifier of the External Token Issuer
        try {
            // uncomment the below to set overrides at the request level
            // ExternalTokenIssuerResponse result = apiInstance.getExternalTokenIssuer(code).execute(opts);

            ExternalTokenIssuerResponse result = apiInstance.getExternalTokenIssuer(code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTokenIssuersApi#getExternalTokenIssuer");
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
| **code** | **String**| Identifier of the External Token Issuer | |

### Return type

[**ExternalTokenIssuerResponse**](ExternalTokenIssuerResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get External Token Issuer |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listExternalTokenIssuers

> List&lt;ExternalTokenIssuerResponse&gt; listExternalTokenIssuers()

[EARLY ACCESS] ListExternalTokenIssuers: Lists all External Token Issuers for a domain

Lists all External Token Issuers

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.ExternalTokenIssuersApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ExternalTokenIssuersApiExample {

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
        // ExternalTokenIssuersApi apiInstance = apiFactory.build(ExternalTokenIssuersApi.class);

        ExternalTokenIssuersApi apiInstance = ApiFactoryBuilder.build(fileName).build(ExternalTokenIssuersApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // List<ExternalTokenIssuerResponse> result = apiInstance.listExternalTokenIssuers().execute(opts);

            List<ExternalTokenIssuerResponse> result = apiInstance.listExternalTokenIssuers().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTokenIssuersApi#listExternalTokenIssuers");
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

[**List&lt;ExternalTokenIssuerResponse&gt;**](ExternalTokenIssuerResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List External Token Issuers |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateExternalTokenIssuer

> ExternalTokenIssuerResponse updateExternalTokenIssuer(code, updateExternalTokenIssuerRequest)

[EARLY ACCESS] UpdateExternalTokenIssuer: Updates an existing External Token Issuer

Updates an External Token Issuer

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.ExternalTokenIssuersApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ExternalTokenIssuersApiExample {

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
        // ExternalTokenIssuersApi apiInstance = apiFactory.build(ExternalTokenIssuersApi.class);

        ExternalTokenIssuersApi apiInstance = ApiFactoryBuilder.build(fileName).build(ExternalTokenIssuersApi.class);
        String code = "code_example"; // String | Identifier of the External Token Issuer to update
        UpdateExternalTokenIssuerRequest updateExternalTokenIssuerRequest = new UpdateExternalTokenIssuerRequest(); // UpdateExternalTokenIssuerRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // ExternalTokenIssuerResponse result = apiInstance.updateExternalTokenIssuer(code, updateExternalTokenIssuerRequest).execute(opts);

            ExternalTokenIssuerResponse result = apiInstance.updateExternalTokenIssuer(code, updateExternalTokenIssuerRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExternalTokenIssuersApi#updateExternalTokenIssuer");
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
| **code** | **String**| Identifier of the External Token Issuer to update | |
| **updateExternalTokenIssuerRequest** | [**UpdateExternalTokenIssuerRequest**](UpdateExternalTokenIssuerRequest.md)|  | |

### Return type

[**ExternalTokenIssuerResponse**](ExternalTokenIssuerResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update External Token Issuer |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

