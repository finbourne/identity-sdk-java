

# SupportAccessResponse

Timestamped successful response to grant access to your account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ID of the support access request |  |
|**duration** | **String** | The duration for which access is requested (in any ISO-8601 format) |  |
|**description** | **String** | The description of why the support access has been granted (i.e. support ticket numbers) |  [optional] |
|**createdAt** | **OffsetDateTime** | DateTimeOffset at which the access was granted |  |
|**expiry** | **OffsetDateTime** | DateTimeOffset at which the access will be revoked |  |
|**createdBy** | **String** | Obfuscated UserId of the user who granted the support access |  |
|**terminated** | **Boolean** | Whether or not that access has been invalidated |  [optional] |
|**terminatedAt** | **OffsetDateTime** | DateTimeOffset at which the access was invalidated |  [optional] |
|**terminatedBy** | **String** | Obfuscated UserId of the user who revoked the access |  [optional] |
|**permittedRoles** | **List&lt;String&gt;** | A list of permitted roles, valid for support staff to assume, for the duration of the access request |  [optional] |



