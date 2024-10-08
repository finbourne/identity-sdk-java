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
import com.finbourne.identity.model.UserSchemaProperty;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * UpdateUserSchemaRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateUserSchemaRequest {
  public static final String SERIALIZED_NAME_ALTERNATIVE_USER_IDS = "alternativeUserIds";
  @SerializedName(SERIALIZED_NAME_ALTERNATIVE_USER_IDS)
  private List<UserSchemaProperty> alternativeUserIds = new ArrayList<>();

  public UpdateUserSchemaRequest() {
  }

  public UpdateUserSchemaRequest alternativeUserIds(List<UserSchemaProperty> alternativeUserIds) {
    
    this.alternativeUserIds = alternativeUserIds;
    return this;
  }

  public UpdateUserSchemaRequest addAlternativeUserIdsItem(UserSchemaProperty alternativeUserIdsItem) {
    if (this.alternativeUserIds == null) {
      this.alternativeUserIds = new ArrayList<>();
    }
    this.alternativeUserIds.add(alternativeUserIdsItem);
    return this;
  }

   /**
   * Get alternativeUserIds
   * @return alternativeUserIds
  **/
  @jakarta.annotation.Nonnull
  public List<UserSchemaProperty> getAlternativeUserIds() {
    return alternativeUserIds;
  }


  public void setAlternativeUserIds(List<UserSchemaProperty> alternativeUserIds) {
    this.alternativeUserIds = alternativeUserIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserSchemaRequest updateUserSchemaRequest = (UpdateUserSchemaRequest) o;
    return Objects.equals(this.alternativeUserIds, updateUserSchemaRequest.alternativeUserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternativeUserIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserSchemaRequest {\n");
    sb.append("    alternativeUserIds: ").append(toIndentedString(alternativeUserIds)).append("\n");
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
    openapiFields.add("alternativeUserIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("alternativeUserIds");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateUserSchemaRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateUserSchemaRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateUserSchemaRequest is not found in the empty JSON string", UpdateUserSchemaRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateUserSchemaRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("alternativeUserIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `alternativeUserIds` to be an array in the JSON string but got `%s`", jsonObj.get("alternativeUserIds").toString()));
      }

      JsonArray jsonArrayalternativeUserIds = jsonObj.getAsJsonArray("alternativeUserIds");
      // validate the required field `alternativeUserIds` (array)
      for (int i = 0; i < jsonArrayalternativeUserIds.size(); i++) {
        UserSchemaProperty.validateJsonElement(jsonArrayalternativeUserIds.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateUserSchemaRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateUserSchemaRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateUserSchemaRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateUserSchemaRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateUserSchemaRequest>() {
           @Override
           public void write(JsonWriter out, UpdateUserSchemaRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateUserSchemaRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateUserSchemaRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateUserSchemaRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateUserSchemaRequest
  */
  public static UpdateUserSchemaRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateUserSchemaRequest.class);
  }

 /**
  * Convert an instance of UpdateUserSchemaRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
