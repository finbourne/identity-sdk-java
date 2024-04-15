# RolesApi

All URIs are relative to *https://fbn-prd.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUserToRole**](RolesApi.md#addUserToRole) | **PUT** /api/roles/{id}/users/{userId} | AddUserToRole: Add User to Role |
| [**createRole**](RolesApi.md#createRole) | **POST** /api/roles | CreateRole: Create Role |
| [**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /api/roles/{id} | DeleteRole: Delete Role |
| [**getRole**](RolesApi.md#getRole) | **GET** /api/roles/{id} | GetRole: Get Role |
| [**listRoles**](RolesApi.md#listRoles) | **GET** /api/roles | ListRoles: List Roles |
| [**listUsersInRole**](RolesApi.md#listUsersInRole) | **GET** /api/roles/{id}/users | ListUsersInRole: Get the users in the specified role. |
| [**removeUserFromRole**](RolesApi.md#removeUserFromRole) | **DELETE** /api/roles/{id}/users/{userId} | RemoveUserFromRole: Remove User from Role |
| [**updateRole**](RolesApi.md#updateRole) | **PUT** /api/roles/{id} | UpdateRole: Update Role |


<a id="addUserToRole"></a>
# **addUserToRole**
> addUserToRole(id, userId).execute();

AddUserToRole: Add User to Role

Adds the User to the specified Role

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the Role
    String userId = "userId_example"; // String | The unique identifier for the User
    try {
      apiInstance.addUserToRole(id, userId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#addUserToRole");
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
| **id** | **String**| The unique identifier for the Role | |
| **userId** | **String**| The unique identifier for the User | |

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
| **404** | Not Found |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="createRole"></a>
# **createRole**
> RoleResponse createRole(createRoleRequest).execute();

CreateRole: Create Role

Creates a new Role

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    CreateRoleRequest createRoleRequest = new CreateRoleRequest(); // CreateRoleRequest | Details of the role to be created
    try {
      RoleResponse result = apiInstance.createRole(createRoleRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#createRole");
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
| **createRoleRequest** | [**CreateRoleRequest**](CreateRoleRequest.md)| Details of the role to be created | |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create a new role |  -  |
| **409** | A role with the same Name already exists. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteRole"></a>
# **deleteRole**
> deleteRole(id).execute();

DeleteRole: Delete Role

Delete the specified role

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the role
    try {
      apiInstance.deleteRole(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#deleteRole");
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
| **id** | **String**| The unique identifier for the role | |

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
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getRole"></a>
# **getRole**
> RoleResponse getRole(id).execute();

GetRole: Get Role

Get the specified role

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the role
    try {
      RoleResponse result = apiInstance.getRole(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#getRole");
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
| **id** | **String**| The unique identifier for the role | |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the specified role |  -  |
| **404** | Not Found |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listRoles"></a>
# **listRoles**
> List&lt;RoleResponse&gt; listRoles().execute();

ListRoles: List Roles

List the available Roles

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    try {
      List<RoleResponse> result = apiInstance.listRoles()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#listRoles");
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

[**List&lt;RoleResponse&gt;**](RoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List the available roles |  -  |
| **0** | Error response |  -  |

<a id="listUsersInRole"></a>
# **listUsersInRole**
> List&lt;UserResponse&gt; listUsersInRole(id).execute();

ListUsersInRole: Get the users in the specified role.

List all Users in the specified Role

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the Role
    try {
      List<UserResponse> result = apiInstance.listUsersInRole(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#listUsersInRole");
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
| **id** | **String**| The unique identifier for the Role | |

### Return type

[**List&lt;UserResponse&gt;**](UserResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The users in the role |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="removeUserFromRole"></a>
# **removeUserFromRole**
> removeUserFromRole(id, userId).execute();

RemoveUserFromRole: Remove User from Role

Removes the User from the specified Role

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the Role
    String userId = "userId_example"; // String | The unique identifier for the User
    try {
      apiInstance.removeUserFromRole(id, userId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#removeUserFromRole");
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
| **id** | **String**| The unique identifier for the Role | |
| **userId** | **String**| The unique identifier for the User | |

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
| **404** | Not Found |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="updateRole"></a>
# **updateRole**
> RoleResponse updateRole(id).updateRoleRequest(updateRoleRequest).execute();

UpdateRole: Update Role

Update the specified Role

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.RolesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    RolesApi apiInstance = new RolesApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the role to be updated
    UpdateRoleRequest updateRoleRequest = new UpdateRoleRequest(); // UpdateRoleRequest | The new definition of the role
    try {
      RoleResponse result = apiInstance.updateRole(id)
            .updateRoleRequest(updateRoleRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RolesApi#updateRole");
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
| **id** | **String**| The unique identifier for the role to be updated | |
| **updateRoleRequest** | [**UpdateRoleRequest**](UpdateRoleRequest.md)| The new definition of the role | [optional] |

### Return type

[**RoleResponse**](RoleResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a role |  -  |
| **404** | Not Found |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

