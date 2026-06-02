# CellManagementApi

All URIs are relative to *https://fbn-prd.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptCellAttachment**](CellManagementApi.md#acceptCellAttachment) | **POST** /api/cellmanagement/acceptattachment | [EARLY ACCESS] AcceptCellAttachment: Accept (or retry) a cell attachment |
| [**detachParentCell**](CellManagementApi.md#detachParentCell) | **PUT** /api/cellmanagement/detach | [EARLY ACCESS] DetachParentCell: Detach this cell from its parent |
| [**getCellParentStatus**](CellManagementApi.md#getCellParentStatus) | **GET** /api/cellmanagement/parentcell | [EARLY ACCESS] GetCellParentStatus: Get cell parent status |
| [**refuseCellAttachment**](CellManagementApi.md#refuseCellAttachment) | **POST** /api/cellmanagement/refuseattachment | [EARLY ACCESS] RefuseCellAttachment: Refuse a Proposed cell attachment |
| [**removePrimaryDomain**](CellManagementApi.md#removePrimaryDomain) | **DELETE** /api/cellmanagement/primarydomain | [EARLY ACCESS] RemovePrimaryDomain: Remove primary domain |
| [**rotateAttachingKey**](CellManagementApi.md#rotateAttachingKey) | **PUT** /api/cellmanagement/attachingkey/rotate | [EARLY ACCESS] RotateAttachingKey: Rotate the stored Attaching Key on an Attached cell |
| [**rotateDomainKeys**](CellManagementApi.md#rotateDomainKeys) | **POST** /api/cellmanagement/rotatedomainkeys | [EARLY ACCESS] RotateDomainKeys: Force a sweep-rotation of every parent-cell service-user PAT on this cell |
| [**setAttachingKey**](CellManagementApi.md#setAttachingKey) | **PUT** /api/cellmanagement/attachingkey | [EARLY ACCESS] SetAttachingKey: Store the Attaching Key pasted from the parent admin portal |
| [**setParentCell**](CellManagementApi.md#setParentCell) | **PUT** /api/cellmanagement/parentcell | [EARLY ACCESS] SetParentCell: Set parent cell |
| [**setPrimaryDomain**](CellManagementApi.md#setPrimaryDomain) | **PUT** /api/cellmanagement/primarydomain | [EARLY ACCESS] SetPrimaryDomain: Set primary domain |



## acceptCellAttachment

> CellParentStatusResponse acceptCellAttachment()

[EARLY ACCESS] AcceptCellAttachment: Accept (or retry) a cell attachment

Confirms a Proposed attachment, or retries one that previously failed: transitions the cell to Attaching and runs the shared registration service to provision the parent-cell service user, mint a PAT, and push it to the parent admin domain. Accepted starting states are &#x60;Proposed&#x60; (the normal first confirm — anti-circumvention is enforced by requiring a prior &#x60;SetAttachingKey&#x60;) and &#x60;Failed&#x60; (recovery from a previous failed attempt). The registration service is idempotent and resumes from the persisted &#x60;RegistrationStep&#x60; checkpoint, so this is safe to call any number of times after a failure. To abandon a failed attempt instead of retrying, call &#x60;Detach&#x60;. Only the designated primary domain may call this. Requires JWT authentication.

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.CellManagementApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CellManagementApiExample {

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
        // CellManagementApi apiInstance = apiFactory.build(CellManagementApi.class);

        CellManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CellManagementApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // CellParentStatusResponse result = apiInstance.acceptCellAttachment().execute(opts);

            CellParentStatusResponse result = apiInstance.acceptCellAttachment().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CellManagementApi#acceptCellAttachment");
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

[**CellParentStatusResponse**](CellParentStatusResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated cell parent status |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## detachParentCell

> CellParentStatusResponse detachParentCell(detachParentCellRequest)

[EARLY ACCESS] DetachParentCell: Detach this cell from its parent

Double-invoke pattern. First call with &#x60;Confirm&#x3D;false&#x60; transitions the cell into Detaching; second call with &#x60;Confirm&#x3D;true&#x60; executes: deactivates the parent-cell service user, deletes the Attaching Key from ParameterStore, and best-effort notifies the parent admin domain. Accepts &#x60;Attached&#x60;, &#x60;Attaching&#x60;, &#x60;Failed&#x60;, and &#x60;Detaching&#x60; as valid starting states (call &#x60;AcceptAttachment&#x60; instead if you&#39;d rather retry a Failed cell than abandon it). Only the designated primary domain may call this. Requires JWT authentication.

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.CellManagementApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CellManagementApiExample {

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
        // CellManagementApi apiInstance = apiFactory.build(CellManagementApi.class);

        CellManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CellManagementApi.class);
        DetachParentCellRequest detachParentCellRequest = new DetachParentCellRequest(); // DetachParentCellRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // CellParentStatusResponse result = apiInstance.detachParentCell(detachParentCellRequest).execute(opts);

            CellParentStatusResponse result = apiInstance.detachParentCell(detachParentCellRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CellManagementApi#detachParentCell");
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
| **detachParentCellRequest** | [**DetachParentCellRequest**](DetachParentCellRequest.md)|  | |

### Return type

[**CellParentStatusResponse**](CellParentStatusResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated cell parent status |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getCellParentStatus

> CellParentStatusResponse getCellParentStatus()

[EARLY ACCESS] GetCellParentStatus: Get cell parent status

Returns the current cell parent relationship status including primary domain, admin domain name, and attachment status.

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.CellManagementApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CellManagementApiExample {

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
        // CellManagementApi apiInstance = apiFactory.build(CellManagementApi.class);

        CellManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CellManagementApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // CellParentStatusResponse result = apiInstance.getCellParentStatus().execute(opts);

            CellParentStatusResponse result = apiInstance.getCellParentStatus().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CellManagementApi#getCellParentStatus");
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

[**CellParentStatusResponse**](CellParentStatusResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The cell parent status |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## refuseCellAttachment

> CellParentStatusResponse refuseCellAttachment()

[EARLY ACCESS] RefuseCellAttachment: Refuse a Proposed cell attachment

Rejects a Proposed attachment, deletes the Attaching Key from ParameterStore, and returns the cell to Standalone. Only the designated primary domain may call this. Requires JWT authentication.

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.CellManagementApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CellManagementApiExample {

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
        // CellManagementApi apiInstance = apiFactory.build(CellManagementApi.class);

        CellManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CellManagementApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // CellParentStatusResponse result = apiInstance.refuseCellAttachment().execute(opts);

            CellParentStatusResponse result = apiInstance.refuseCellAttachment().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CellManagementApi#refuseCellAttachment");
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

[**CellParentStatusResponse**](CellParentStatusResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated cell parent status |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## removePrimaryDomain

> CellParentStatusResponse removePrimaryDomain()

[EARLY ACCESS] RemovePrimaryDomain: Remove primary domain

Removes the primary domain designation for this cell. Only the current primary domain or FINBOURNE staff can perform this. Requires JWT authentication (PAT tokens are rejected).

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.CellManagementApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CellManagementApiExample {

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
        // CellManagementApi apiInstance = apiFactory.build(CellManagementApi.class);

        CellManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CellManagementApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // CellParentStatusResponse result = apiInstance.removePrimaryDomain().execute(opts);

            CellParentStatusResponse result = apiInstance.removePrimaryDomain().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CellManagementApi#removePrimaryDomain");
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

[**CellParentStatusResponse**](CellParentStatusResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated cell parent status |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## rotateAttachingKey

> CellParentStatusResponse rotateAttachingKey(rotateAttachingKeyRequest)

[EARLY ACCESS] RotateAttachingKey: Rotate the stored Attaching Key on an Attached cell

Upserts a new Attaching Key PAT into the cell&#39;s ParameterStore / Azure Key Vault at the canonical per-cell path (&#x60;Lydia/CellManagement/{primaryDomain}/AttachingKey&#x60;) and re-stamps the path on the &#x60;cell_status&#x60; row. Does not require a prior key to exist in the secret store, and does not change the cell&#39;s attachment status or the recorded parent identity. Intended for two callers: the parent admin portal pushing a freshly-rotated PAT, and manual operator use (e.g. to migrate an existing cell onto the per-primary-domain path layout). Requires the cell to be currently &#x60;Attached&#x60; to a parent admin domain. Only the designated primary domain may call this. Requires JWT authentication (PAT tokens are rejected).

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.CellManagementApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CellManagementApiExample {

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
        // CellManagementApi apiInstance = apiFactory.build(CellManagementApi.class);

        CellManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CellManagementApi.class);
        RotateAttachingKeyRequest rotateAttachingKeyRequest = new RotateAttachingKeyRequest(); // RotateAttachingKeyRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // CellParentStatusResponse result = apiInstance.rotateAttachingKey(rotateAttachingKeyRequest).execute(opts);

            CellParentStatusResponse result = apiInstance.rotateAttachingKey(rotateAttachingKeyRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CellManagementApi#rotateAttachingKey");
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
| **rotateAttachingKeyRequest** | [**RotateAttachingKeyRequest**](RotateAttachingKeyRequest.md)|  | |

### Return type

[**CellParentStatusResponse**](CellParentStatusResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated cell parent status |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## rotateDomainKeys

> CellParentStatusResponse rotateDomainKeys()

[EARLY ACCESS] RotateDomainKeys: Force a sweep-rotation of every parent-cell service-user PAT on this cell

Stamps the per-cell rotation cutoff to \&quot;now\&quot;. On its next tick (and any subsequent tick until every provisioned PAT has been refreshed past the cutoff), the steady-state AdminCellSync job force-rotates any provisioned parent-cell PAT whose &#x60;CreatedDate&#x60; is strictly before the cutoff, regardless of the normal expiry-based window. Used to rapidly invalidate suspected-compromised PATs and to recover a cell whose recent rotations failed to be pushed to the parent admin portal. The cutoff is sticky: re-calling moves it forward, and new PATs naturally have &#x60;CreatedDate &gt; cutoff&#x60; so subsequent ticks pass the check without further intervention. Only the designated primary domain may call this. Requires JWT authentication (PAT tokens are rejected). Cell must currently be &#x60;Attached&#x60;.

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.CellManagementApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CellManagementApiExample {

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
        // CellManagementApi apiInstance = apiFactory.build(CellManagementApi.class);

        CellManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CellManagementApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // CellParentStatusResponse result = apiInstance.rotateDomainKeys().execute(opts);

            CellParentStatusResponse result = apiInstance.rotateDomainKeys().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CellManagementApi#rotateDomainKeys");
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

[**CellParentStatusResponse**](CellParentStatusResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The cell parent status after stamping the cutoff |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setAttachingKey

> CellParentStatusResponse setAttachingKey(setAttachingKeyRequest)

[EARLY ACCESS] SetAttachingKey: Store the Attaching Key pasted from the parent admin portal

Persists the Attaching Key PAT to the cell&#39;s ParameterStore / Azure Key Vault and records a Proposed attachment against the provided parent admin domain. Only the designated primary domain may call this. Requires JWT authentication (PAT tokens are rejected).

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.CellManagementApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CellManagementApiExample {

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
        // CellManagementApi apiInstance = apiFactory.build(CellManagementApi.class);

        CellManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CellManagementApi.class);
        SetAttachingKeyRequest setAttachingKeyRequest = new SetAttachingKeyRequest(); // SetAttachingKeyRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // CellParentStatusResponse result = apiInstance.setAttachingKey(setAttachingKeyRequest).execute(opts);

            CellParentStatusResponse result = apiInstance.setAttachingKey(setAttachingKeyRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CellManagementApi#setAttachingKey");
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
| **setAttachingKeyRequest** | [**SetAttachingKeyRequest**](SetAttachingKeyRequest.md)|  | |

### Return type

[**CellParentStatusResponse**](CellParentStatusResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated cell parent status |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setParentCell

> CellParentStatusResponse setParentCell(setParentCellRequest)

[EARLY ACCESS] SetParentCell: Set parent cell

Sets the parent cell for this cell. Uses a double-invoke pattern: first call (confirm&#x3D;false) sets status to Proposed, second call (confirm&#x3D;true) transitions to Attaching. Only the designated primary domain can call this. Requires JWT authentication (PAT tokens are rejected).

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.CellManagementApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CellManagementApiExample {

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
        // CellManagementApi apiInstance = apiFactory.build(CellManagementApi.class);

        CellManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CellManagementApi.class);
        SetParentCellRequest setParentCellRequest = new SetParentCellRequest(); // SetParentCellRequest | 
        try {
            // uncomment the below to set overrides at the request level
            // CellParentStatusResponse result = apiInstance.setParentCell(setParentCellRequest).execute(opts);

            CellParentStatusResponse result = apiInstance.setParentCell(setParentCellRequest).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CellManagementApi#setParentCell");
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
| **setParentCellRequest** | [**SetParentCellRequest**](SetParentCellRequest.md)|  | |

### Return type

[**CellParentStatusResponse**](CellParentStatusResponse.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated cell parent status |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## setPrimaryDomain

> CellParentStatusResponse setPrimaryDomain()

[EARLY ACCESS] SetPrimaryDomain: Set primary domain

Designates the calling domain as the primary domain for this cell. Requires JWT authentication (PAT tokens are rejected).

### Example

```java
import com.finbourne.identity.model.*;
import com.finbourne.identity.api.CellManagementApi;
import com.finbourne.identity.extensions.ApiConfigurationException;
import com.finbourne.identity.extensions.ApiFactoryBuilder;
import com.finbourne.identity.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CellManagementApiExample {

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
        // CellManagementApi apiInstance = apiFactory.build(CellManagementApi.class);

        CellManagementApi apiInstance = ApiFactoryBuilder.build(fileName).build(CellManagementApi.class);
        try {
            // uncomment the below to set overrides at the request level
            // CellParentStatusResponse result = apiInstance.setPrimaryDomain().execute(opts);

            CellParentStatusResponse result = apiInstance.setPrimaryDomain().execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling CellManagementApi#setPrimaryDomain");
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

[**CellParentStatusResponse**](CellParentStatusResponse.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated cell parent status |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

