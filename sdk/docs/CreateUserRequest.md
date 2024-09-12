

# CreateUserRequest

Details necessary for creating a new user

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name of the user |  |
|**lastName** | **String** | The last name of the user |  |
|**emailAddress** | **String** | The user&#39;s email address - to which the account validation email will be sent. For user accounts  this should exactly match the Login. |  |
|**secondEmailAddress** | **String** | The user&#39;s second email address. Only allowed for Service users |  [optional] |
|**login** | **String** | The user&#39;s login username, in the form of an email address, which must be unique within the system.  For user accounts this should exactly match the user&#39;s email address. |  |
|**alternativeUserIds** | **Map&lt;String, String&gt;** |  |  [optional] |
|**roles** | [**List&lt;RoleId&gt;**](RoleId.md) | Optional. Any known roles the user should be created with. |  [optional] |
|**type** | **String** | The type of user (e.g. Personal or Service) |  |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


