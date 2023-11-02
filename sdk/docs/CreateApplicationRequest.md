

# CreateApplicationRequest

A request to create an application for authenticating the source of token requests

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**displayName** | **String** | The Display Name of the application |  |
|**clientId** | **String** | The OpenID Connect ClientId of the application |  |
|**type** | **String** | The Type of the application. This must be either Native or Web |  |
|**redirectUris** | **List&lt;String&gt;** | A web application&#39;s acceptable list of post-login redirect URIs |  [optional] |
|**postLogoutRedirectUris** | **List&lt;String&gt;** | A web application&#39;s acceptable list of post-logout redirect URIs |  [optional] |



