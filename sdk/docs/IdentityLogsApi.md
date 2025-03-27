# IdentityLogsApi

All URIs are relative to *https://fbn-prd.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listLogs**](IdentityLogsApi.md#listLogs) | **GET** /api/logs | [BETA] ListLogs: Lists system logs for a domain |
| [**listUserLogs**](IdentityLogsApi.md#listUserLogs) | **GET** /api/logs/me | [BETA] ListUserLogs: Lists user logs |



## listLogs

> ResourceListOfSystemLog listLogs(oktaSince, oktaUntil, oktaFilter, oktaQuery, oktaLimit, oktaSortOrder, oktaAfter)

[BETA] ListLogs: Lists system logs for a domain

Lists system logs for a domain

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.IdentityLogsApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentityLogsApiExample {

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
        // IdentityLogsApi apiInstance = apiFactory.build(IdentityLogsApi.class);

        IdentityLogsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IdentityLogsApi.class);
        OffsetDateTime oktaSince = OffsetDateTime.now(); // OffsetDateTime | Lower bound of log events published property
        OffsetDateTime oktaUntil = OffsetDateTime.now(); // OffsetDateTime | Upper bound of log events published property
        String oktaFilter = "oktaFilter_example"; // String | Okta filter expression
        String oktaQuery = "oktaQuery_example"; // String | Filters log events results by one or more case insensitive keywords
        Integer oktaLimit = 56; // Integer | Max number of results returned
        String oktaSortOrder = "oktaSortOrder_example"; // String | Order of events by published property. Either ASCENDING or DESCENDING
        String oktaAfter = "oktaAfter_example"; // String | Okta Page token
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfSystemLog result = apiInstance.listLogs(oktaSince, oktaUntil, oktaFilter, oktaQuery, oktaLimit, oktaSortOrder, oktaAfter).execute(opts);

            ResourceListOfSystemLog result = apiInstance.listLogs(oktaSince, oktaUntil, oktaFilter, oktaQuery, oktaLimit, oktaSortOrder, oktaAfter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityLogsApi#listLogs");
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
| **oktaSince** | **OffsetDateTime**| Lower bound of log events published property | [optional] |
| **oktaUntil** | **OffsetDateTime**| Upper bound of log events published property | [optional] |
| **oktaFilter** | **String**| Okta filter expression | [optional] |
| **oktaQuery** | **String**| Filters log events results by one or more case insensitive keywords | [optional] |
| **oktaLimit** | **Integer**| Max number of results returned | [optional] |
| **oktaSortOrder** | **String**| Order of events by published property. Either ASCENDING or DESCENDING | [optional] |
| **oktaAfter** | **String**| Okta Page token | [optional] |

### Return type

[**ResourceListOfSystemLog**](ResourceListOfSystemLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Logs |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listUserLogs

> ResourceListOfSystemLog listUserLogs(oktaSince, oktaUntil, oktaLimit, oktaSortOrder, oktaAfter)

[BETA] ListUserLogs: Lists user logs

Lists account related system logs for the calling user

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.IdentityLogsApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IdentityLogsApiExample {

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
        // IdentityLogsApi apiInstance = apiFactory.build(IdentityLogsApi.class);

        IdentityLogsApi apiInstance = ApiFactoryBuilder.build(fileName).build(IdentityLogsApi.class);
        OffsetDateTime oktaSince = OffsetDateTime.now(); // OffsetDateTime | Lower bound of log events published property
        OffsetDateTime oktaUntil = OffsetDateTime.now(); // OffsetDateTime | Upper bound of log events published property
        Integer oktaLimit = 56; // Integer | Max number of results returned
        String oktaSortOrder = "oktaSortOrder_example"; // String | Order of events by published property. Either ASCENDING or DESCENDING
        String oktaAfter = "oktaAfter_example"; // String | Okta Page token
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfSystemLog result = apiInstance.listUserLogs(oktaSince, oktaUntil, oktaLimit, oktaSortOrder, oktaAfter).execute(opts);

            ResourceListOfSystemLog result = apiInstance.listUserLogs(oktaSince, oktaUntil, oktaLimit, oktaSortOrder, oktaAfter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityLogsApi#listUserLogs");
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
| **oktaSince** | **OffsetDateTime**| Lower bound of log events published property | [optional] |
| **oktaUntil** | **OffsetDateTime**| Upper bound of log events published property | [optional] |
| **oktaLimit** | **Integer**| Max number of results returned | [optional] |
| **oktaSortOrder** | **String**| Order of events by published property. Either ASCENDING or DESCENDING | [optional] |
| **oktaAfter** | **String**| Okta Page token | [optional] |

### Return type

[**ResourceListOfSystemLog**](ResourceListOfSystemLog.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List User Logs |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

