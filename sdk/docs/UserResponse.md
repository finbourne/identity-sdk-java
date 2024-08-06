

# UserResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The user&#39;s system supplied unique identifier |  |
|**emailAddress** | **String** | The user&#39;s emailAddress address, which must be unique within the system |  |
|**secondEmailAddress** | **String** | The user&#39;s second email address. Only allowed for service users. |  [optional] |
|**login** | **String** |  |  |
|**firstName** | **String** | The user&#39;s first name |  |
|**lastName** | **String** | The user&#39;s last name |  |
|**roles** | [**List&lt;RoleResponse&gt;**](RoleResponse.md) | The roles that the user has. |  [optional] |
|**type** | **String** | The type of user (e.g. Personal or Service) |  |
|**status** | **String** | The status of the user |  |
|**external** | **Boolean** | Whether or not the user originates from an external identity system |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


