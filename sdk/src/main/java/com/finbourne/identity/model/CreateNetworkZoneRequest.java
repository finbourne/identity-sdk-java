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
import com.finbourne.identity.model.IpAddressDefinition;
import com.finbourne.identity.model.NetworkZonesApplyRules;
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
 * The Create Network Zone Request information
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateNetworkZoneRequest {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NETWORK_ZONE_I_PS = "networkZoneIPs";
  @SerializedName(SERIALIZED_NAME_NETWORK_ZONE_I_PS)
  private List<IpAddressDefinition> networkZoneIPs = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_APPLY_RULES = "applyRules";
  @SerializedName(SERIALIZED_NAME_APPLY_RULES)
  private NetworkZonesApplyRules applyRules;

  public CreateNetworkZoneRequest() {
  }

  public CreateNetworkZoneRequest code(String code) {
    
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


  public CreateNetworkZoneRequest description(String description) {
    
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


  public CreateNetworkZoneRequest networkZoneIPs(List<IpAddressDefinition> networkZoneIPs) {
    
    this.networkZoneIPs = networkZoneIPs;
    return this;
  }

  public CreateNetworkZoneRequest addNetworkZoneIPsItem(IpAddressDefinition networkZoneIPsItem) {
    if (this.networkZoneIPs == null) {
      this.networkZoneIPs = new ArrayList<>();
    }
    this.networkZoneIPs.add(networkZoneIPsItem);
    return this;
  }

   /**
   * Get networkZoneIPs
   * @return networkZoneIPs
  **/
  @jakarta.annotation.Nonnull
  public List<IpAddressDefinition> getNetworkZoneIPs() {
    return networkZoneIPs;
  }


  public void setNetworkZoneIPs(List<IpAddressDefinition> networkZoneIPs) {
    this.networkZoneIPs = networkZoneIPs;
  }


  public CreateNetworkZoneRequest action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @jakarta.annotation.Nullable
  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public CreateNetworkZoneRequest applyRules(NetworkZonesApplyRules applyRules) {
    
    this.applyRules = applyRules;
    return this;
  }

   /**
   * Get applyRules
   * @return applyRules
  **/
  @jakarta.annotation.Nonnull
  public NetworkZonesApplyRules getApplyRules() {
    return applyRules;
  }


  public void setApplyRules(NetworkZonesApplyRules applyRules) {
    this.applyRules = applyRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNetworkZoneRequest createNetworkZoneRequest = (CreateNetworkZoneRequest) o;
    return Objects.equals(this.code, createNetworkZoneRequest.code) &&
        Objects.equals(this.description, createNetworkZoneRequest.description) &&
        Objects.equals(this.networkZoneIPs, createNetworkZoneRequest.networkZoneIPs) &&
        Objects.equals(this.action, createNetworkZoneRequest.action) &&
        Objects.equals(this.applyRules, createNetworkZoneRequest.applyRules);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, networkZoneIPs, action, applyRules);
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
    sb.append("class CreateNetworkZoneRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    networkZoneIPs: ").append(toIndentedString(networkZoneIPs)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    applyRules: ").append(toIndentedString(applyRules)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("networkZoneIPs");
    openapiFields.add("action");
    openapiFields.add("applyRules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("networkZoneIPs");
    openapiRequiredFields.add("applyRules");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateNetworkZoneRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateNetworkZoneRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateNetworkZoneRequest is not found in the empty JSON string", CreateNetworkZoneRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateNetworkZoneRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("networkZoneIPs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkZoneIPs` to be an array in the JSON string but got `%s`", jsonObj.get("networkZoneIPs").toString()));
      }

      JsonArray jsonArraynetworkZoneIPs = jsonObj.getAsJsonArray("networkZoneIPs");
      // validate the required field `networkZoneIPs` (array)
      for (int i = 0; i < jsonArraynetworkZoneIPs.size(); i++) {
        IpAddressDefinition.validateJsonElement(jsonArraynetworkZoneIPs.get(i));
      };
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the required field `applyRules`
      NetworkZonesApplyRules.validateJsonElement(jsonObj.get("applyRules"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateNetworkZoneRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateNetworkZoneRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateNetworkZoneRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateNetworkZoneRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateNetworkZoneRequest>() {
           @Override
           public void write(JsonWriter out, CreateNetworkZoneRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateNetworkZoneRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateNetworkZoneRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateNetworkZoneRequest
  * @throws IOException if the JSON string is invalid with respect to CreateNetworkZoneRequest
  */
  public static CreateNetworkZoneRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateNetworkZoneRequest.class);
  }

 /**
  * Convert an instance of CreateNetworkZoneRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
