# com.finbourne.identity.model.LogGeographicalContext
Represents a LogGeographicalContext resource in the Okta API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **String** |  | [optional] [default to String]
**state** | **String** |  | [optional] [default to String]
**country** | **String** |  | [optional] [default to String]
**postalCode** | **String** |  | [optional] [default to String]
**geolocation** | [**LogGeolocation**](LogGeolocation.md) |  | [optional] [default to LogGeolocation]

```java
import com.finbourne.identity.model.LogGeographicalContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String City = "example City";
@jakarta.annotation.Nullable String State = "example State";
@jakarta.annotation.Nullable String Country = "example Country";
@jakarta.annotation.Nullable String PostalCode = "example PostalCode";
LogGeolocation Geolocation = new LogGeolocation();


LogGeographicalContext logGeographicalContextInstance = new LogGeographicalContext()
    .City(City)
    .State(State)
    .Country(Country)
    .PostalCode(PostalCode)
    .Geolocation(Geolocation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
