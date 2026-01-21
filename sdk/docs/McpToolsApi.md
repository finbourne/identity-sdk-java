# McpToolsApi

All URIs are relative to *https://fbn-prd.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMcpTool**](McpToolsApi.md#createMcpTool) | **POST** /api/mcptools/{scope}/{code} | [EARLY ACCESS] CreateMcpTool: Create an MCP Tool |
| [**deleteMcpTool**](McpToolsApi.md#deleteMcpTool) | **DELETE** /api/mcptools/{scope}/{code} | [EARLY ACCESS] DeleteMcpTool: Delete an MCP Tool |
| [**getMcpTool**](McpToolsApi.md#getMcpTool) | **GET** /api/mcptools/{scope}/{code} | [EARLY ACCESS] GetMcpTool: Get an MCP Tool |
| [**listMcpTools**](McpToolsApi.md#listMcpTools) | **GET** /api/mcptools | [EARLY ACCESS] ListMcpTools: List all MCP Tools |
| [**updateMcpTool**](McpToolsApi.md#updateMcpTool) | **PUT** /api/mcptools/{scope}/{code} | [EARLY ACCESS] UpdateMcpTool: Update an MCP Tool |



## createMcpTool

> McpToolResponse createMcpTool(scope, code, upsertMcpToolRequest)

[EARLY ACCESS] CreateMcpTool: Create an MCP Tool

Creates a new MCP tool definition

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.McpToolsApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class McpToolsApiExample {

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
        // McpToolsApi apiInstance = apiFactory.build(McpToolsApi.class);

        McpToolsApi apiInstance = ApiFactoryBuilder.build(fileName).build(McpToolsApi.class);
        String scope = "scope_example"; // String | The scope of the MCP tool
        String code = "code_example"; // String | The code of the MCP tool
        UpsertMcpToolRequest upsertMcpToolRequest = new UpsertMcpToolRequest(); // UpsertMcpToolRequest | The MCP tool definition
        try {
            // uncomment the below to set overrides at the request level
            // McpToolResponse result = apiInstance.createMcpTool(scope, code, upsertMcpToolRequest).execute(opts);

            McpToolResponse result = apiInstance.createMcpTool(scope, code, upsertMcpToolRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling McpToolsApi#createMcpTool");
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
| **scope** | **String**| The scope of the MCP tool | |
| **code** | **String**| The code of the MCP tool | |
| **upsertMcpToolRequest** | [**UpsertMcpToolRequest**](UpsertMcpToolRequest.md)| The MCP tool definition | |

### Return type

[**McpToolResponse**](McpToolResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create MCP Tool |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteMcpTool

> deleteMcpTool(scope, code)

[EARLY ACCESS] DeleteMcpTool: Delete an MCP Tool

Deletes an MCP tool (soft delete - closes the current version)

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.McpToolsApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class McpToolsApiExample {

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
        // McpToolsApi apiInstance = apiFactory.build(McpToolsApi.class);

        McpToolsApi apiInstance = ApiFactoryBuilder.build(fileName).build(McpToolsApi.class);
        String scope = "scope_example"; // String | The scope of the MCP tool
        String code = "code_example"; // String | The code of the MCP tool
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deleteMcpTool(scope, code).execute(opts);

            apiInstance.deleteMcpTool(scope, code).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling McpToolsApi#deleteMcpTool");
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
| **scope** | **String**| The scope of the MCP tool | |
| **code** | **String**| The code of the MCP tool | |

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


## getMcpTool

> McpToolResponse getMcpTool(scope, code, version)

[EARLY ACCESS] GetMcpTool: Get an MCP Tool

Retrieves an MCP tool. If version is specified, retrieves that specific version for audit purposes. Otherwise, retrieves the current version.

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.McpToolsApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class McpToolsApiExample {

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
        // McpToolsApi apiInstance = apiFactory.build(McpToolsApi.class);

        McpToolsApi apiInstance = ApiFactoryBuilder.build(fileName).build(McpToolsApi.class);
        String scope = "scope_example"; // String | The scope of the MCP tool
        String code = "code_example"; // String | The code of the MCP tool
        Integer version = 56; // Integer | Optional version number to retrieve. If not specified, returns the current version.
        try {
            // uncomment the below to set overrides at the request level
            // McpToolResponse result = apiInstance.getMcpTool(scope, code, version).execute(opts);

            McpToolResponse result = apiInstance.getMcpTool(scope, code, version).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling McpToolsApi#getMcpTool");
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
| **scope** | **String**| The scope of the MCP tool | |
| **code** | **String**| The code of the MCP tool | |
| **version** | **Integer**| Optional version number to retrieve. If not specified, returns the current version. | [optional] |

### Return type

[**McpToolResponse**](McpToolResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get MCP Tool |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listMcpTools

> List&lt;McpToolResponse&gt; listMcpTools()

[EARLY ACCESS] ListMcpTools: List all MCP Tools

Lists all current MCP tools for the domain

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.McpToolsApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class McpToolsApiExample {

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
        // McpToolsApi apiInstance = apiFactory.build(McpToolsApi.class);

        McpToolsApi apiInstance = ApiFactoryBuilder.build(fileName).build(McpToolsApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // List<McpToolResponse> result = apiInstance.listMcpTools().execute(opts);

            List<McpToolResponse> result = apiInstance.listMcpTools().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling McpToolsApi#listMcpTools");
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

[**List&lt;McpToolResponse&gt;**](McpToolResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List MCP Tools |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateMcpTool

> McpToolResponse updateMcpTool(scope, code, upsertMcpToolRequest)

[EARLY ACCESS] UpdateMcpTool: Update an MCP Tool

Updates an existing MCP tool, creating a new version

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.McpToolsApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class McpToolsApiExample {

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
        // McpToolsApi apiInstance = apiFactory.build(McpToolsApi.class);

        McpToolsApi apiInstance = ApiFactoryBuilder.build(fileName).build(McpToolsApi.class);
        String scope = "scope_example"; // String | The scope of the MCP tool
        String code = "code_example"; // String | The code of the MCP tool
        UpsertMcpToolRequest upsertMcpToolRequest = new UpsertMcpToolRequest(); // UpsertMcpToolRequest | The updated MCP tool definition
        try {
            // uncomment the below to set overrides at the request level
            // McpToolResponse result = apiInstance.updateMcpTool(scope, code, upsertMcpToolRequest).execute(opts);

            McpToolResponse result = apiInstance.updateMcpTool(scope, code, upsertMcpToolRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling McpToolsApi#updateMcpTool");
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
| **scope** | **String**| The scope of the MCP tool | |
| **code** | **String**| The code of the MCP tool | |
| **upsertMcpToolRequest** | [**UpsertMcpToolRequest**](UpsertMcpToolRequest.md)| The updated MCP tool definition | |

### Return type

[**McpToolResponse**](McpToolResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update MCP Tool |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

