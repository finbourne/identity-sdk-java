/*
 * FINBOURNE Identity Service API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.identity.model;

import java.util.Objects;
import com.finbourne.identity.model.ClaimMappings;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.identity.JSON;

/**
 * Client input for creating an external token issuer.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateExternalTokenIssuerRequest {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CLAIM_MAPPINGS = "claimMappings";
  @SerializedName(SERIALIZED_NAME_CLAIM_MAPPINGS)
  private ClaimMappings claimMappings;

  public static final String SERIALIZED_NAME_LOGOUT_URL = "logoutUrl";
  @SerializedName(SERIALIZED_NAME_LOGOUT_URL)
  private URI logoutUrl;

  public CreateExternalTokenIssuerRequest() {
  }

  public CreateExternalTokenIssuerRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @jakarta.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CreateExternalTokenIssuerRequest issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @jakarta.annotation.Nonnull
  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public CreateExternalTokenIssuerRequest audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @jakarta.annotation.Nonnull
  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public CreateExternalTokenIssuerRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateExternalTokenIssuerRequest claimMappings(ClaimMappings claimMappings) {
    
    this.claimMappings = claimMappings;
    return this;
  }

   /**
   * Get claimMappings
   * @return claimMappings
  **/
  @jakarta.annotation.Nullable
  public ClaimMappings getClaimMappings() {
    return claimMappings;
  }


  public void setClaimMappings(ClaimMappings claimMappings) {
    this.claimMappings = claimMappings;
  }


  public CreateExternalTokenIssuerRequest logoutUrl(URI logoutUrl) {
    
    this.logoutUrl = logoutUrl;
    return this;
  }

   /**
   * Get logoutUrl
   * @return logoutUrl
  **/
  @jakarta.annotation.Nonnull
  public URI getLogoutUrl() {
    return logoutUrl;
  }


  public void setLogoutUrl(URI logoutUrl) {
    this.logoutUrl = logoutUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateExternalTokenIssuerRequest createExternalTokenIssuerRequest = (CreateExternalTokenIssuerRequest) o;
    return Objects.equals(this.code, createExternalTokenIssuerRequest.code) &&
        Objects.equals(this.issuer, createExternalTokenIssuerRequest.issuer) &&
        Objects.equals(this.audience, createExternalTokenIssuerRequest.audience) &&
        Objects.equals(this.description, createExternalTokenIssuerRequest.description) &&
        Objects.equals(this.claimMappings, createExternalTokenIssuerRequest.claimMappings) &&
        Objects.equals(this.logoutUrl, createExternalTokenIssuerRequest.logoutUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issuer, audience, description, claimMappings, logoutUrl);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExternalTokenIssuerRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    claimMappings: ").append(toIndentedString(claimMappings)).append("\n");
    sb.append("    logoutUrl: ").append(toIndentedString(logoutUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("code");
    openapiFields.add("issuer");
    openapiFields.add("audience");
    openapiFields.add("description");
    openapiFields.add("claimMappings");
    openapiFields.add("logoutUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("issuer");
    openapiRequiredFields.add("audience");
    openapiRequiredFields.add("logoutUrl");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateExternalTokenIssuerRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateExternalTokenIssuerRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateExternalTokenIssuerRequest is not found in the empty JSON string", CreateExternalTokenIssuerRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateExternalTokenIssuerRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      if (!jsonObj.get("audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audience").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `claimMappings`
      if (jsonObj.get("claimMappings") != null && !jsonObj.get("claimMappings").isJsonNull()) {
        ClaimMappings.validateJsonElement(jsonObj.get("claimMappings"));
      }
      if (!jsonObj.get("logoutUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logoutUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logoutUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateExternalTokenIssuerRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateExternalTokenIssuerRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateExternalTokenIssuerRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateExternalTokenIssuerRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateExternalTokenIssuerRequest>() {
           @Override
           public void write(JsonWriter out, CreateExternalTokenIssuerRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateExternalTokenIssuerRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateExternalTokenIssuerRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateExternalTokenIssuerRequest
  * @throws IOException if the JSON string is invalid with respect to CreateExternalTokenIssuerRequest
  */
  public static CreateExternalTokenIssuerRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateExternalTokenIssuerRequest.class);
  }

 /**
  * Convert an instance of CreateExternalTokenIssuerRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
