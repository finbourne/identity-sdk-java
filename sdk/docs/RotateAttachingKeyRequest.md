# com.finbourne.identity.model.RotateAttachingKeyRequest
Request body for rotating the Attaching Key on a cell that is already Attached to a parent admin domain. Carries only the new PAT value — the parent identity is already pinned on the cell from the original `SetAttachingKey` handshake and the source of truth for all later operations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pat** | **String** | New Attaching Key PAT to persist. Same length / content constraints as the original Finbourne.Lydia.WebApi.Dtos.CellManagement.SetAttachingKeyRequest.Pat: a &#x60;StringSecurityCheck&#x60; catch-all plus a strict opaque-token character set so the request body cannot smuggle in HTML / SQL / script content. | [default to String]

```java
import com.finbourne.identity.model.RotateAttachingKeyRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Pat = "example Pat";


RotateAttachingKeyRequest rotateAttachingKeyRequestInstance = new RotateAttachingKeyRequest()
    .Pat(Pat);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
