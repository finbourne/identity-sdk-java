# com.finbourne.identity.model.CellParentStatusResponse
Response containing the current cell parent status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | The current attachment status of the cell. | [optional] [default to String]
**adminDomainName** | **String** | The name of the admin domain in the parent cell, if any. | [optional] [default to String]
**primaryDomainName** | **String** | The domain designated as the primary domain for this cell, if any. | [optional] [default to String]
**registrationStep** | **String** | The most recently reached registration checkpoint, or null if no registration has started. One of &#x60;UserEnsured&#x60;, &#x60;PATGenerated&#x60;, &#x60;PATPushed&#x60;. | [optional] [default to String]
**registrationError** | **String** | Operator-readable message describing the most recent registration failure, or null on success. | [optional] [default to String]

```java
import com.finbourne.identity.model.CellParentStatusResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String AdminDomainName = "example AdminDomainName";
@jakarta.annotation.Nullable String PrimaryDomainName = "example PrimaryDomainName";
@jakarta.annotation.Nullable String RegistrationStep = "example RegistrationStep";
@jakarta.annotation.Nullable String RegistrationError = "example RegistrationError";


CellParentStatusResponse cellParentStatusResponseInstance = new CellParentStatusResponse()
    .Status(Status)
    .AdminDomainName(AdminDomainName)
    .PrimaryDomainName(PrimaryDomainName)
    .RegistrationStep(RegistrationStep)
    .RegistrationError(RegistrationError);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
