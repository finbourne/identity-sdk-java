# SystemLogsApi

All URIs are relative to *https://fbn-prd.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listLogs**](SystemLogsApi.md#listLogs) | **GET** /api/logs | [BETA] ListLogs: Lists system logs for a domain |



## listLogs

> ResourceListOfSystemLog listLogs(since, until, after, filter, query, limit, sortOrder)

[BETA] ListLogs: Lists system logs for a domain

Lists system logs for a domain

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.SystemLogsApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SystemLogsApiExample {

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
        // SystemLogsApi apiInstance = apiFactory.build(SystemLogsApi.class);

        SystemLogsApi apiInstance = ApiFactoryBuilder.build(fileName).build(SystemLogsApi.class);
        OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Lower bound of log events published property
        OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Upper bound of log events published property
        String after = "after_example"; // String | Page token
        String filter = "filter_example"; // String | Okta filter expression
        String query = "query_example"; // String | Filters log events results by one or more case insensitive keywords
        Integer limit = 56; // Integer | Max number of results returned
        String sortOrder = "sortOrder_example"; // String | Order of events by published property. Either ASCENDING or DESCENDING
        try {
            // uncomment the below to set overrides at the request level
            // ResourceListOfSystemLog result = apiInstance.listLogs(since, until, after, filter, query, limit, sortOrder).execute(opts);

            ResourceListOfSystemLog result = apiInstance.listLogs(since, until, after, filter, query, limit, sortOrder).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemLogsApi#listLogs");
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
| **since** | **OffsetDateTime**| Lower bound of log events published property | [optional] |
| **until** | **OffsetDateTime**| Upper bound of log events published property | [optional] |
| **after** | **String**| Page token | [optional] |
| **filter** | **String**| Okta filter expression | [optional] |
| **query** | **String**| Filters log events results by one or more case insensitive keywords | [optional] |
| **limit** | **Integer**| Max number of results returned | [optional] |
| **sortOrder** | **String**| Order of events by published property. Either ASCENDING or DESCENDING | [optional] |

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

