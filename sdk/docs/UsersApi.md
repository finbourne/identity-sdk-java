# UsersApi

All URIs are relative to *https://fbn-prd.lusid.com/identity*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UsersApi.md#createUser) | **POST** /api/users | CreateUser: Create User |
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /api/users/{id} | DeleteUser: Delete User |
| [**expirePassword**](UsersApi.md#expirePassword) | **POST** /api/users/{id}/lifecycle/$expirepassword | ExpirePassword: Reset the user&#39;s password to a temporary one |
| [**findUsersById**](UsersApi.md#findUsersById) | **GET** /api/directory | FindUsersById: Find users by id endpoint |
| [**getUser**](UsersApi.md#getUser) | **GET** /api/users/{id} | GetUser: Get User |
| [**listRunnableUsers**](UsersApi.md#listRunnableUsers) | **GET** /api/users/$runnable | [EARLY ACCESS] ListRunnableUsers: List Runable Users |
| [**listUsers**](UsersApi.md#listUsers) | **GET** /api/users | ListUsers: List Users |
| [**resetFactors**](UsersApi.md#resetFactors) | **POST** /api/users/{id}/lifecycle/$resetfactors | ResetFactors: Reset MFA factors |
| [**resetPassword**](UsersApi.md#resetPassword) | **POST** /api/users/{id}/lifecycle/$resetpassword | ResetPassword: Reset Password |
| [**sendActivationEmail**](UsersApi.md#sendActivationEmail) | **POST** /api/users/{id}/lifecycle/$activate | SendActivationEmail: Sends an activation email to the User |
| [**unlockUser**](UsersApi.md#unlockUser) | **POST** /api/users/{id}/lifecycle/$unlock | UnlockUser: Unlock User |
| [**unsuspendUser**](UsersApi.md#unsuspendUser) | **POST** /api/users/{id}/lifecycle/$unsuspend | [EXPERIMENTAL] UnsuspendUser: Unsuspend user |
| [**updateUser**](UsersApi.md#updateUser) | **PUT** /api/users/{id} | UpdateUser: Update User |


<a id="createUser"></a>
# **createUser**
> UserResponse createUser(createUserRequest).waitForReindex(waitForReindex).execute();

CreateUser: Create User

Create a new User

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | Details of the User to be created
    Boolean waitForReindex = false; // Boolean | Should the request wait until the newly created User is indexed (available in List) before returning
    try {
      UserResponse result = apiInstance.createUser(createUserRequest)
            .waitForReindex(waitForReindex)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUser");
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
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)| Details of the User to be created | |
| **waitForReindex** | **Boolean**| Should the request wait until the newly created User is indexed (available in List) before returning | [optional] [default to false] |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create a new user |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(id).purge(purge).execute();

DeleteUser: Delete User

By default the user will be de-provisioned and inactive, however their record will remain in the identity  provider for audit purposes. If this is not desirable and removal of all trace of the user is required,  the purge parameter can be specified to indicate the details should be purged completely.

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the user
    Boolean purge = true; // Boolean | Whether to purge any trace of the user from the identity provider (will affect audit)
    try {
      apiInstance.deleteUser(id)
            .purge(purge)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteUser");
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
| **id** | **String**| The unique identifier for the user | |
| **purge** | **Boolean**| Whether to purge any trace of the user from the identity provider (will affect audit) | [optional] |

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

<a id="expirePassword"></a>
# **expirePassword**
> TemporaryPassword expirePassword(id).execute();

ExpirePassword: Reset the user&#39;s password to a temporary one

Resets the user&#39;s password to a temporary one which is then expired

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the User having its password reset
    try {
      TemporaryPassword result = apiInstance.expirePassword(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#expirePassword");
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
| **id** | **String**| The unique identifier for the User having its password reset | |

### Return type

[**TemporaryPassword**](TemporaryPassword.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reset the user&#39;s password |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="findUsersById"></a>
# **findUsersById**
> ListUsersResponse findUsersById(id).execute();

FindUsersById: Find users by id endpoint

Finds a maximum of 50 users by ID

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    List<String> id = Arrays.asList(); // List<String> | A list of unique identifiers for the users
    try {
      ListUsersResponse result = apiInstance.findUsersById(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#findUsersById");
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
| **id** | [**List&lt;String&gt;**](String.md)| A list of unique identifiers for the users | |

### Return type

[**ListUsersResponse**](ListUsersResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="getUser"></a>
# **getUser**
> UserResponse getUser(id).includeRoles(includeRoles).execute();

GetUser: Get User

Get the specified User

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the User
    Boolean includeRoles = true; // Boolean | Flag indicating that the users roles should be included in the response
    try {
      UserResponse result = apiInstance.getUser(id)
            .includeRoles(includeRoles)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUser");
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
| **id** | **String**| The unique identifier for the User | |
| **includeRoles** | **Boolean**| Flag indicating that the users roles should be included in the response | [optional] |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the specified user |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="listRunnableUsers"></a>
# **listRunnableUsers**
> List&lt;UserResponse&gt; listRunnableUsers().execute();

[EARLY ACCESS] ListRunnableUsers: List Runable Users

List the available runnable Users

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      List<UserResponse> result = apiInstance.listRunnableUsers()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listRunnableUsers");
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

[**List&lt;UserResponse&gt;**](UserResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List the available runnable users |  -  |
| **0** | Error response |  -  |

<a id="listUsers"></a>
# **listUsers**
> List&lt;UserResponse&gt; listUsers().includeRoles(includeRoles).includeDeactivated(includeDeactivated).execute();

ListUsers: List Users

List the available Users

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Boolean includeRoles = false; // Boolean | Flag indicating that the users roles should be included in the response
    Boolean includeDeactivated = false; // Boolean | Include previously deleted (not purged) users
    try {
      List<UserResponse> result = apiInstance.listUsers()
            .includeRoles(includeRoles)
            .includeDeactivated(includeDeactivated)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listUsers");
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
| **includeRoles** | **Boolean**| Flag indicating that the users roles should be included in the response | [optional] [default to false] |
| **includeDeactivated** | **Boolean**| Include previously deleted (not purged) users | [optional] [default to false] |

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
| **200** | List the available users |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

<a id="resetFactors"></a>
# **resetFactors**
> resetFactors(id).execute();

ResetFactors: Reset MFA factors

Resets the MFA factors of the specified User

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the User having their MFA factors reset
    try {
      apiInstance.resetFactors(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#resetFactors");
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
| **id** | **String**| The unique identifier for the User having their MFA factors reset | |

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

<a id="resetPassword"></a>
# **resetPassword**
> resetPassword(id).execute();

ResetPassword: Reset Password

Resets the password of the specified User

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the User having their password reset
    try {
      apiInstance.resetPassword(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#resetPassword");
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
| **id** | **String**| The unique identifier for the User having their password reset | |

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

<a id="sendActivationEmail"></a>
# **sendActivationEmail**
> sendActivationEmail(id).execute();

SendActivationEmail: Sends an activation email to the User

Sends an activation email to the specified User

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the User to be activated
    try {
      apiInstance.sendActivationEmail(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#sendActivationEmail");
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
| **id** | **String**| The unique identifier for the User to be activated | |

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

<a id="unlockUser"></a>
# **unlockUser**
> unlockUser(id).execute();

UnlockUser: Unlock User

Unlocks the specified User

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the User to be unlocked
    try {
      apiInstance.unlockUser(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unlockUser");
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
| **id** | **String**| The unique identifier for the User to be unlocked | |

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

<a id="unsuspendUser"></a>
# **unsuspendUser**
> unsuspendUser(id).execute();

[EXPERIMENTAL] UnsuspendUser: Unsuspend user

Unsuspend the user

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the User to Unsuspend
    try {
      apiInstance.unsuspendUser(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#unsuspendUser");
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
| **id** | **String**| The unique identifier for the User to Unsuspend | |

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

<a id="updateUser"></a>
# **updateUser**
> UserResponse updateUser(id, updateUserRequest).execute();

UpdateUser: Update User

Updates the specified User

### Example
```java
// Import classes:
import com.finbourne.identity.ApiClient;
import com.finbourne.identity.ApiException;
import com.finbourne.identity.Configuration;
import com.finbourne.identity.auth.*;
import com.finbourne.identity.models.*;
import com.finbourne.identity.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/identity");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | The unique identifier for the User to be updated
    UpdateUserRequest updateUserRequest = new UpdateUserRequest(); // UpdateUserRequest | The new definition of the User
    try {
      UserResponse result = apiInstance.updateUser(id, updateUserRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUser");
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
| **id** | **String**| The unique identifier for the User to be updated | |
| **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)| The new definition of the User | |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a user |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

