# NetworkZonesApi

All URIs are relative to *https://fbn-prd.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNetworkZone**](NetworkZonesApi.md#createNetworkZone) | **POST** /api/networkzones | [EARLY ACCESS] CreateNetworkZone: Creates a network zone |
| [**deleteNetworkZone**](NetworkZonesApi.md#deleteNetworkZone) | **DELETE** /api/networkzones/{code} | [EARLY ACCESS] DeleteNetworkZone: Deletes a network zone |
| [**getNetworkZone**](NetworkZonesApi.md#getNetworkZone) | **GET** /api/networkzones/{code} | [EARLY ACCESS] GetNetworkZone: Retrieve a Network Zone |
| [**listNetworkZones**](NetworkZonesApi.md#listNetworkZones) | **GET** /api/networkzones | [EARLY ACCESS] ListNetworkZones: Lists all network zones for a domain |
| [**updateNetworkZone**](NetworkZonesApi.md#updateNetworkZone) | **PUT** /api/networkzones/{code} | [EARLY ACCESS] UpdateNetworkZone: Updates an existing network zone |



## createNetworkZone

> NetworkZoneDefinitionResponse createNetworkZone(createNetworkZoneRequest)

[EARLY ACCESS] CreateNetworkZone: Creates a network zone

By default, the network zone will have its hierarchy set to last on creation.

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.NetworkZonesApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class NetworkZonesApiExample {

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
        // NetworkZonesApi apiInstance = apiFactory.build(NetworkZonesApi.class);

        NetworkZonesApi apiInstance = ApiFactoryBuilder.build(fileName).build(NetworkZonesApi.class);
        CreateNetworkZoneRequest createNetworkZoneRequest = new CreateNetworkZoneRequest(); // CreateNetworkZoneRequest | The details of the network zone to define
        try {
            // uncomment the below to set overrides at the request level
            // NetworkZoneDefinitionResponse result = apiInstance.createNetworkZone(createNetworkZoneRequest).execute(opts);

            NetworkZoneDefinitionResponse result = apiInstance.createNetworkZone(createNetworkZoneRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#createNetworkZone");
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
| **createNetworkZoneRequest** | [**CreateNetworkZoneRequest**](CreateNetworkZoneRequest.md)| The details of the network zone to define | |

### Return type

[**NetworkZoneDefinitionResponse**](NetworkZoneDefinitionResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create Network Zone |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteNetworkZone

> deleteNetworkZone(code)

[EARLY ACCESS] DeleteNetworkZone: Deletes a network zone

Will return a success if network zone already deleted

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.NetworkZonesApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class NetworkZonesApiExample {

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
        // NetworkZonesApi apiInstance = apiFactory.build(NetworkZonesApi.class);

        NetworkZonesApi apiInstance = ApiFactoryBuilder.build(fileName).build(NetworkZonesApi.class);
        String code = "code_example"; // String | The unique identifier of the network zone to delete
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deleteNetworkZone(code).execute(opts);

            apiInstance.deleteNetworkZone(code).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#deleteNetworkZone");
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
| **code** | **String**| The unique identifier of the network zone to delete | |

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


## getNetworkZone

> NetworkZoneDefinitionResponse getNetworkZone(code)

[EARLY ACCESS] GetNetworkZone: Retrieve a Network Zone

Retrieves a Network Zone

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.NetworkZonesApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class NetworkZonesApiExample {

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
        // NetworkZonesApi apiInstance = apiFactory.build(NetworkZonesApi.class);

        NetworkZonesApi apiInstance = ApiFactoryBuilder.build(fileName).build(NetworkZonesApi.class);
        String code = "code_example"; // String | The unique identifier of the network zone
        try {
            // uncomment the below to set overrides at the request level
            // NetworkZoneDefinitionResponse result = apiInstance.getNetworkZone(code).execute(opts);

            NetworkZoneDefinitionResponse result = apiInstance.getNetworkZone(code).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#getNetworkZone");
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
| **code** | **String**| The unique identifier of the network zone | |

### Return type

[**NetworkZoneDefinitionResponse**](NetworkZoneDefinitionResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Network Zone |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listNetworkZones

> List&lt;NetworkZoneDefinitionResponse&gt; listNetworkZones()

[EARLY ACCESS] ListNetworkZones: Lists all network zones for a domain

Lists all network zones for a domain

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.NetworkZonesApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class NetworkZonesApiExample {

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
        // NetworkZonesApi apiInstance = apiFactory.build(NetworkZonesApi.class);

        NetworkZonesApi apiInstance = ApiFactoryBuilder.build(fileName).build(NetworkZonesApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // List<NetworkZoneDefinitionResponse> result = apiInstance.listNetworkZones().execute(opts);

            List<NetworkZoneDefinitionResponse> result = apiInstance.listNetworkZones().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#listNetworkZones");
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

[**List&lt;NetworkZoneDefinitionResponse&gt;**](NetworkZoneDefinitionResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Network Zones |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateNetworkZone

> NetworkZoneDefinitionResponse updateNetworkZone(code, updateNetworkZoneRequest)

[EARLY ACCESS] UpdateNetworkZone: Updates an existing network zone

Updates an existing network zone

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.NetworkZonesApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class NetworkZonesApiExample {

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
        // NetworkZonesApi apiInstance = apiFactory.build(NetworkZonesApi.class);

        NetworkZonesApi apiInstance = ApiFactoryBuilder.build(fileName).build(NetworkZonesApi.class);
        String code = "code_example"; // String | The unique identifier of the network zone
        UpdateNetworkZoneRequest updateNetworkZoneRequest = new UpdateNetworkZoneRequest(); // UpdateNetworkZoneRequest | The updated definition of the network zone
        try {
            // uncomment the below to set overrides at the request level
            // NetworkZoneDefinitionResponse result = apiInstance.updateNetworkZone(code, updateNetworkZoneRequest).execute(opts);

            NetworkZoneDefinitionResponse result = apiInstance.updateNetworkZone(code, updateNetworkZoneRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkZonesApi#updateNetworkZone");
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
| **code** | **String**| The unique identifier of the network zone | |
| **updateNetworkZoneRequest** | [**UpdateNetworkZoneRequest**](UpdateNetworkZoneRequest.md)| The updated definition of the network zone | |

### Return type

[**NetworkZoneDefinitionResponse**](NetworkZoneDefinitionResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Network Zone |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

