<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://fbn-prd.lusid.com/identity*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationMetadataApi* | [**listAccessControlledResources**](docs/ApplicationMetadataApi.md#listaccesscontrolledresources) | **GET** /api/metadata/access/resources | ListAccessControlledResources: Get resources available for access control
*ApplicationsApi* | [**createApplication**](docs/ApplicationsApi.md#createapplication) | **POST** /api/applications | [EARLY ACCESS] CreateApplication: Create Application
*ApplicationsApi* | [**deleteApplication**](docs/ApplicationsApi.md#deleteapplication) | **DELETE** /api/applications/{id} | [EARLY ACCESS] DeleteApplication: Delete Application
*ApplicationsApi* | [**getApplication**](docs/ApplicationsApi.md#getapplication) | **GET** /api/applications/{id} | GetApplication: Get Application
*ApplicationsApi* | [**listApplications**](docs/ApplicationsApi.md#listapplications) | **GET** /api/applications | ListApplications: List Applications
*ApplicationsApi* | [**rotateApplicationSecrets**](docs/ApplicationsApi.md#rotateapplicationsecrets) | **POST** /api/applications/{id}/lifecycle/$newsecret | [EARLY ACCESS] RotateApplicationSecrets: Rotate Application Secrets
*AuthenticationApi* | [**getAuthenticationInformation**](docs/AuthenticationApi.md#getauthenticationinformation) | **GET** /api/authentication/information | GetAuthenticationInformation: Gets AuthenticationInformation
*AuthenticationApi* | [**getPasswordPolicy**](docs/AuthenticationApi.md#getpasswordpolicy) | **GET** /api/authentication/password-policy/{userType} | GetPasswordPolicy: Gets password policy for a user type
*AuthenticationApi* | [**getSupportAccessHistory**](docs/AuthenticationApi.md#getsupportaccesshistory) | **GET** /api/authentication/support | GetSupportAccessHistory: Get the history of all support access granted and any information pertaining to their termination
*AuthenticationApi* | [**getSupportRoles**](docs/AuthenticationApi.md#getsupportroles) | **GET** /api/authentication/support-roles | GetSupportRoles: Get mapping of support roles, the internal representation to a human friendly representation
*AuthenticationApi* | [**grantSupportAccess**](docs/AuthenticationApi.md#grantsupportaccess) | **POST** /api/authentication/support | GrantSupportAccess: Grants FINBOURNE support access to your account
*AuthenticationApi* | [**invalidateSupportAccess**](docs/AuthenticationApi.md#invalidatesupportaccess) | **DELETE** /api/authentication/support | InvalidateSupportAccess: Revoke any FINBOURNE support access to your account
*AuthenticationApi* | [**updatePasswordPolicy**](docs/AuthenticationApi.md#updatepasswordpolicy) | **PUT** /api/authentication/password-policy/{userType} | UpdatePasswordPolicy: Updates password policy for a user type
*ExternalTokenIssuersApi* | [**createExternalTokenIssuer**](docs/ExternalTokenIssuersApi.md#createexternaltokenissuer) | **POST** /api/externaltokenissuers | [EARLY ACCESS] CreateExternalTokenIssuer: Create an External Token Issuer
*ExternalTokenIssuersApi* | [**deleteExternalTokenIssuer**](docs/ExternalTokenIssuersApi.md#deleteexternaltokenissuer) | **DELETE** /api/externaltokenissuers/{code} | [EARLY ACCESS] DeleteExternalTokenIssuer: Deletes an External Token Issuer by code
*ExternalTokenIssuersApi* | [**getExternalTokenIssuer**](docs/ExternalTokenIssuersApi.md#getexternaltokenissuer) | **GET** /api/externaltokenissuers/{code} | [EARLY ACCESS] GetExternalTokenIssuer: Gets an External Token Issuer with code
*ExternalTokenIssuersApi* | [**listExternalTokenIssuers**](docs/ExternalTokenIssuersApi.md#listexternaltokenissuers) | **GET** /api/externaltokenissuers | [EARLY ACCESS] ListExternalTokenIssuers: Lists all External Token Issuers for a domain
*ExternalTokenIssuersApi* | [**updateExternalTokenIssuer**](docs/ExternalTokenIssuersApi.md#updateexternaltokenissuer) | **PUT** /api/externaltokenissuers/{code} | [EARLY ACCESS] UpdateExternalTokenIssuer: Updates an existing External Token Issuer
*IdentityLogsApi* | [**listLogs**](docs/IdentityLogsApi.md#listlogs) | **GET** /api/logs | [BETA] ListLogs: Lists system logs for a domain
*IdentityLogsApi* | [**listUserLogs**](docs/IdentityLogsApi.md#listuserlogs) | **GET** /api/logs/me | ListUserLogs: Lists user logs
*IdentityProviderApi* | [**addScim**](docs/IdentityProviderApi.md#addscim) | **PUT** /api/identityprovider/scim | AddScim: Add SCIM
*IdentityProviderApi* | [**removeScim**](docs/IdentityProviderApi.md#removescim) | **DELETE** /api/identityprovider/scim | RemoveScim: Remove SCIM
*McpToolsApi* | [**createMcpTool**](docs/McpToolsApi.md#createmcptool) | **POST** /api/mcptools/{scope}/{code} | [EARLY ACCESS] CreateMcpTool: Create an MCP Tool
*McpToolsApi* | [**deleteMcpTool**](docs/McpToolsApi.md#deletemcptool) | **DELETE** /api/mcptools/{scope}/{code} | [EARLY ACCESS] DeleteMcpTool: Delete an MCP Tool
*McpToolsApi* | [**getMcpTool**](docs/McpToolsApi.md#getmcptool) | **GET** /api/mcptools/{scope}/{code} | [EARLY ACCESS] GetMcpTool: Get an MCP Tool
*McpToolsApi* | [**listMcpTools**](docs/McpToolsApi.md#listmcptools) | **GET** /api/mcptools | [EARLY ACCESS] ListMcpTools: List all MCP Tools
*McpToolsApi* | [**updateMcpTool**](docs/McpToolsApi.md#updatemcptool) | **PUT** /api/mcptools/{scope}/{code} | [EARLY ACCESS] UpdateMcpTool: Update an MCP Tool
*MeApi* | [**getUserInfo**](docs/MeApi.md#getuserinfo) | **GET** /api/me | GetUserInfo: Get User Info
*MeApi* | [**setPassword**](docs/MeApi.md#setpassword) | **PUT** /api/me/password | SetPassword: Set password of current user
*NetworkZonesApi* | [**createNetworkZone**](docs/NetworkZonesApi.md#createnetworkzone) | **POST** /api/networkzones | [EARLY ACCESS] CreateNetworkZone: Creates a network zone
*NetworkZonesApi* | [**deleteNetworkZone**](docs/NetworkZonesApi.md#deletenetworkzone) | **DELETE** /api/networkzones/{code} | [EARLY ACCESS] DeleteNetworkZone: Deletes a network zone
*NetworkZonesApi* | [**getNetworkZone**](docs/NetworkZonesApi.md#getnetworkzone) | **GET** /api/networkzones/{code} | [EARLY ACCESS] GetNetworkZone: Retrieve a Network Zone
*NetworkZonesApi* | [**listNetworkZones**](docs/NetworkZonesApi.md#listnetworkzones) | **GET** /api/networkzones | [EARLY ACCESS] ListNetworkZones: Lists all network zones for a domain
*NetworkZonesApi* | [**updateNetworkZone**](docs/NetworkZonesApi.md#updatenetworkzone) | **PUT** /api/networkzones/{code} | [EARLY ACCESS] UpdateNetworkZone: Updates an existing network zone
*PersonalAuthenticationTokensApi* | [**createApiKey**](docs/PersonalAuthenticationTokensApi.md#createapikey) | **POST** /api/keys | CreateApiKey: Create a Personal Access Token
*PersonalAuthenticationTokensApi* | [**deleteApiKey**](docs/PersonalAuthenticationTokensApi.md#deleteapikey) | **DELETE** /api/keys/{id} | DeleteApiKey: Invalidate a Personal Access Token
*PersonalAuthenticationTokensApi* | [**listOwnApiKeys**](docs/PersonalAuthenticationTokensApi.md#listownapikeys) | **GET** /api/keys | ListOwnApiKeys: Gets the meta data for all of the user's existing Personal Access Tokens.
*RolesApi* | [**addUserToRole**](docs/RolesApi.md#addusertorole) | **PUT** /api/roles/{id}/users/{userId} | AddUserToRole: Add User to Role
*RolesApi* | [**createRole**](docs/RolesApi.md#createrole) | **POST** /api/roles | CreateRole: Create Role
*RolesApi* | [**deleteRole**](docs/RolesApi.md#deleterole) | **DELETE** /api/roles/{id} | DeleteRole: Delete Role
*RolesApi* | [**getRole**](docs/RolesApi.md#getrole) | **GET** /api/roles/{id} | GetRole: Get Role
*RolesApi* | [**listRoles**](docs/RolesApi.md#listroles) | **GET** /api/roles | ListRoles: List Roles
*RolesApi* | [**listUsersInRole**](docs/RolesApi.md#listusersinrole) | **GET** /api/roles/{id}/users | ListUsersInRole: Get the users in the specified role.
*RolesApi* | [**removeUserFromRole**](docs/RolesApi.md#removeuserfromrole) | **DELETE** /api/roles/{id}/users/{userId} | RemoveUserFromRole: Remove User from Role
*RolesApi* | [**updateRole**](docs/RolesApi.md#updaterole) | **PUT** /api/roles/{id} | UpdateRole: Update Role
*TokensApi* | [**invalidateToken**](docs/TokensApi.md#invalidatetoken) | **DELETE** /api/tokens | InvalidateToken: Invalidate current JWT token (sign out)
*UsersApi* | [**createUser**](docs/UsersApi.md#createuser) | **POST** /api/users | CreateUser: Create User
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteuser) | **DELETE** /api/users/{id} | DeleteUser: Delete User
*UsersApi* | [**expirePassword**](docs/UsersApi.md#expirepassword) | **POST** /api/users/{id}/lifecycle/$expirepassword | ExpirePassword: Reset the user's password to a temporary one
*UsersApi* | [**findUsersById**](docs/UsersApi.md#findusersbyid) | **GET** /api/directory | FindUsersById: Find users by id endpoint
*UsersApi* | [**getUser**](docs/UsersApi.md#getuser) | **GET** /api/users/{id} | GetUser: Get User
*UsersApi* | [**getUserSchema**](docs/UsersApi.md#getuserschema) | **GET** /api/users/schema | [EARLY ACCESS] GetUserSchema: Get User Schema
*UsersApi* | [**listRunnableUsers**](docs/UsersApi.md#listrunnableusers) | **GET** /api/users/$runnable | [EARLY ACCESS] ListRunnableUsers: List Runable Users
*UsersApi* | [**listUsers**](docs/UsersApi.md#listusers) | **GET** /api/users | ListUsers: List Users
*UsersApi* | [**resetFactors**](docs/UsersApi.md#resetfactors) | **POST** /api/users/{id}/lifecycle/$resetfactors | ResetFactors: Reset MFA factors
*UsersApi* | [**resetPassword**](docs/UsersApi.md#resetpassword) | **POST** /api/users/{id}/lifecycle/$resetpassword | ResetPassword: Reset Password
*UsersApi* | [**sendActivationEmail**](docs/UsersApi.md#sendactivationemail) | **POST** /api/users/{id}/lifecycle/$activate | SendActivationEmail: Sends an activation email to the User
*UsersApi* | [**unlockUser**](docs/UsersApi.md#unlockuser) | **POST** /api/users/{id}/lifecycle/$unlock | UnlockUser: Unlock User
*UsersApi* | [**unsuspendUser**](docs/UsersApi.md#unsuspenduser) | **POST** /api/users/{id}/lifecycle/$unsuspend | [EXPERIMENTAL] UnsuspendUser: Unsuspend user
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateuser) | **PUT** /api/users/{id} | UpdateUser: Update User
*UsersApi* | [**updateUserSchema**](docs/UsersApi.md#updateuserschema) | **PUT** /api/users/schema | [EARLY ACCESS] UpdateUserSchema: Update User Schema


<a id="documentation-for-models"></a>
## Documentation for Models

 - [AccessControlledAction](docs/AccessControlledAction.md)
 - [AccessControlledResource](docs/AccessControlledResource.md)
 - [ActionId](docs/ActionId.md)
 - [AddScimResponse](docs/AddScimResponse.md)
 - [ApiKey](docs/ApiKey.md)
 - [AuthenticationInformation](docs/AuthenticationInformation.md)
 - [ClaimMappings](docs/ClaimMappings.md)
 - [CreateApiKey](docs/CreateApiKey.md)
 - [CreateApplicationRequest](docs/CreateApplicationRequest.md)
 - [CreateExternalTokenIssuerRequest](docs/CreateExternalTokenIssuerRequest.md)
 - [CreateNetworkZoneRequest](docs/CreateNetworkZoneRequest.md)
 - [CreateRoleRequest](docs/CreateRoleRequest.md)
 - [CreateUserRequest](docs/CreateUserRequest.md)
 - [CreatedApiKey](docs/CreatedApiKey.md)
 - [CurrentUserResponse](docs/CurrentUserResponse.md)
 - [ErrorDetail](docs/ErrorDetail.md)
 - [ExternalTokenIssuerResponse](docs/ExternalTokenIssuerResponse.md)
 - [IdSelectorDefinition](docs/IdSelectorDefinition.md)
 - [IdentifierPartSchema](docs/IdentifierPartSchema.md)
 - [IpAddressDefinition](docs/IpAddressDefinition.md)
 - [Link](docs/Link.md)
 - [ListUsersResponse](docs/ListUsersResponse.md)
 - [LogActor](docs/LogActor.md)
 - [LogAuthenticationContext](docs/LogAuthenticationContext.md)
 - [LogClientInfo](docs/LogClientInfo.md)
 - [LogDebugContext](docs/LogDebugContext.md)
 - [LogGeographicalContext](docs/LogGeographicalContext.md)
 - [LogGeolocation](docs/LogGeolocation.md)
 - [LogIpChainEntry](docs/LogIpChainEntry.md)
 - [LogIssuer](docs/LogIssuer.md)
 - [LogOutcome](docs/LogOutcome.md)
 - [LogRequest](docs/LogRequest.md)
 - [LogSecurityContext](docs/LogSecurityContext.md)
 - [LogSeverity](docs/LogSeverity.md)
 - [LogTarget](docs/LogTarget.md)
 - [LogTransaction](docs/LogTransaction.md)
 - [LogUserAgent](docs/LogUserAgent.md)
 - [LusidProblemDetails](docs/LusidProblemDetails.md)
 - [LusidValidationProblemDetails](docs/LusidValidationProblemDetails.md)
 - [McpToolLuminescePayload](docs/McpToolLuminescePayload.md)
 - [McpToolParameter](docs/McpToolParameter.md)
 - [McpToolResponse](docs/McpToolResponse.md)
 - [McpToolSchedulerNotification](docs/McpToolSchedulerNotification.md)
 - [McpToolSchedulerPayload](docs/McpToolSchedulerPayload.md)
 - [NetworkZoneDefinitionResponse](docs/NetworkZoneDefinitionResponse.md)
 - [NetworkZonesApplyRules](docs/NetworkZonesApplyRules.md)
 - [OAuthApplication](docs/OAuthApplication.md)
 - [PasswordPolicyResponse](docs/PasswordPolicyResponse.md)
 - [PasswordPolicyResponseAge](docs/PasswordPolicyResponseAge.md)
 - [PasswordPolicyResponseComplexity](docs/PasswordPolicyResponseComplexity.md)
 - [PasswordPolicyResponseConditions](docs/PasswordPolicyResponseConditions.md)
 - [PasswordPolicyResponseLockout](docs/PasswordPolicyResponseLockout.md)
 - [ResourceListOfAccessControlledResource](docs/ResourceListOfAccessControlledResource.md)
 - [ResourceListOfSystemLog](docs/ResourceListOfSystemLog.md)
 - [RoleId](docs/RoleId.md)
 - [RoleResponse](docs/RoleResponse.md)
 - [SetPassword](docs/SetPassword.md)
 - [SetPasswordResponse](docs/SetPasswordResponse.md)
 - [SupportAccessExpiry](docs/SupportAccessExpiry.md)
 - [SupportAccessExpiryWithRole](docs/SupportAccessExpiryWithRole.md)
 - [SupportAccessRequest](docs/SupportAccessRequest.md)
 - [SupportAccessResponse](docs/SupportAccessResponse.md)
 - [SupportRole](docs/SupportRole.md)
 - [SupportRolesResponse](docs/SupportRolesResponse.md)
 - [SystemLog](docs/SystemLog.md)
 - [TemporaryPassword](docs/TemporaryPassword.md)
 - [UpdateExternalTokenIssuerRequest](docs/UpdateExternalTokenIssuerRequest.md)
 - [UpdateNetworkZoneRequest](docs/UpdateNetworkZoneRequest.md)
 - [UpdatePasswordPolicyRequest](docs/UpdatePasswordPolicyRequest.md)
 - [UpdatePasswordPolicyRequestAge](docs/UpdatePasswordPolicyRequestAge.md)
 - [UpdatePasswordPolicyRequestComplexity](docs/UpdatePasswordPolicyRequestComplexity.md)
 - [UpdatePasswordPolicyRequestConditions](docs/UpdatePasswordPolicyRequestConditions.md)
 - [UpdatePasswordPolicyRequestLockout](docs/UpdatePasswordPolicyRequestLockout.md)
 - [UpdateRoleRequest](docs/UpdateRoleRequest.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [UpdateUserSchemaRequest](docs/UpdateUserSchemaRequest.md)
 - [UpsertMcpToolRequest](docs/UpsertMcpToolRequest.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserSchemaProperty](docs/UserSchemaProperty.md)
 - [UserSchemaResponse](docs/UserSchemaResponse.md)
 - [UserSummary](docs/UserSummary.md)

