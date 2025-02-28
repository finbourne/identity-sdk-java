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
import com.finbourne.identity.model.LogIpChainEntry;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Represents a LogRequest resource in the Okta API
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogRequest {
  public static final String SERIALIZED_NAME_IP_CHAIN = "ipChain";
  @SerializedName(SERIALIZED_NAME_IP_CHAIN)
  private List<LogIpChainEntry> ipChain;

  public LogRequest() {
  }

  public LogRequest ipChain(List<LogIpChainEntry> ipChain) {
    
    this.ipChain = ipChain;
    return this;
  }

  public LogRequest addIpChainItem(LogIpChainEntry ipChainItem) {
    if (this.ipChain == null) {
      this.ipChain = new ArrayList<>();
    }
    this.ipChain.add(ipChainItem);
    return this;
  }

   /**
   * Get ipChain
   * @return ipChain
  **/
  @jakarta.annotation.Nullable
  public List<LogIpChainEntry> getIpChain() {
    return ipChain;
  }


  public void setIpChain(List<LogIpChainEntry> ipChain) {
    this.ipChain = ipChain;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogRequest logRequest = (LogRequest) o;
    return Objects.equals(this.ipChain, logRequest.ipChain);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipChain);
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
    sb.append("class LogRequest {\n");
    sb.append("    ipChain: ").append(toIndentedString(ipChain)).append("\n");
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
    openapiFields.add("ipChain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LogRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LogRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogRequest is not found in the empty JSON string", LogRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("ipChain") != null && !jsonObj.get("ipChain").isJsonNull()) {
        JsonArray jsonArrayipChain = jsonObj.getAsJsonArray("ipChain");
        if (jsonArrayipChain != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ipChain").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ipChain` to be an array in the JSON string but got `%s`", jsonObj.get("ipChain").toString()));
          }

          // validate the optional field `ipChain` (array)
          for (int i = 0; i < jsonArrayipChain.size(); i++) {
            LogIpChainEntry.validateJsonElement(jsonArrayipChain.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LogRequest>() {
           @Override
           public void write(JsonWriter out, LogRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LogRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LogRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogRequest
  * @throws IOException if the JSON string is invalid with respect to LogRequest
  */
  public static LogRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogRequest.class);
  }

 /**
  * Convert an instance of LogRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
