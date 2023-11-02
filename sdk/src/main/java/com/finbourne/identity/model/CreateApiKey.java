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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Create an API key
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateApiKey {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DEACTIVATION_DATE = "deactivationDate";
  @SerializedName(SERIALIZED_NAME_DEACTIVATION_DATE)
  private OffsetDateTime deactivationDate;

  public CreateApiKey() {
  }

  public CreateApiKey displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name for the API key
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CreateApiKey deactivationDate(OffsetDateTime deactivationDate) {
    
    this.deactivationDate = deactivationDate;
    return this;
  }

   /**
   * The optional date at which the key should deactivate
   * @return deactivationDate
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getDeactivationDate() {
    return deactivationDate;
  }


  public void setDeactivationDate(OffsetDateTime deactivationDate) {
    this.deactivationDate = deactivationDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApiKey createApiKey = (CreateApiKey) o;
    return Objects.equals(this.displayName, createApiKey.displayName) &&
        Objects.equals(this.deactivationDate, createApiKey.deactivationDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, deactivationDate);
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
    sb.append("class CreateApiKey {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    deactivationDate: ").append(toIndentedString(deactivationDate)).append("\n");
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
    openapiFields.add("displayName");
    openapiFields.add("deactivationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("displayName");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateApiKey
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateApiKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateApiKey is not found in the empty JSON string", CreateApiKey.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateApiKey.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateApiKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateApiKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateApiKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateApiKey.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateApiKey>() {
           @Override
           public void write(JsonWriter out, CreateApiKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateApiKey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateApiKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateApiKey
  * @throws IOException if the JSON string is invalid with respect to CreateApiKey
  */
  public static CreateApiKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateApiKey.class);
  }

 /**
  * Convert an instance of CreateApiKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}