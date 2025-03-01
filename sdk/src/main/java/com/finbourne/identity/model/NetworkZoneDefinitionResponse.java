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
import java.time.OffsetDateTime;
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
 * The Client facing representation of a NetworkZone
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetworkZoneDefinitionResponse {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_HIERARCHY = "hierarchy";
  @SerializedName(SERIALIZED_NAME_HIERARCHY)
  private Integer hierarchy;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_NETWORK_ZONE_I_PS = "networkZoneIPs";
  @SerializedName(SERIALIZED_NAME_NETWORK_ZONE_I_PS)
  private List<IpAddressDefinition> networkZoneIPs;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_APPLY_RULES = "applyRules";
  @SerializedName(SERIALIZED_NAME_APPLY_RULES)
  private NetworkZonesApplyRules applyRules;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updatedBy";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private String updatedBy;

  public NetworkZoneDefinitionResponse() {
  }

  public NetworkZoneDefinitionResponse code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The Network Zone Code
   * @return code
  **/
  @jakarta.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public NetworkZoneDefinitionResponse hierarchy(Integer hierarchy) {
    
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Hierarchy of the Network Zone
   * @return hierarchy
  **/
  @jakarta.annotation.Nullable
  public Integer getHierarchy() {
    return hierarchy;
  }


  public void setHierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
  }


  public NetworkZoneDefinitionResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The Description of the Network Zone
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NetworkZoneDefinitionResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Network Zone Creation timestamp
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public NetworkZoneDefinitionResponse updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp of the last update
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public NetworkZoneDefinitionResponse networkZoneIPs(List<IpAddressDefinition> networkZoneIPs) {
    
    this.networkZoneIPs = networkZoneIPs;
    return this;
  }

  public NetworkZoneDefinitionResponse addNetworkZoneIPsItem(IpAddressDefinition networkZoneIPsItem) {
    if (this.networkZoneIPs == null) {
      this.networkZoneIPs = new ArrayList<>();
    }
    this.networkZoneIPs.add(networkZoneIPsItem);
    return this;
  }

   /**
   * Network zone IP information (IPs and CIDR ranges)
   * @return networkZoneIPs
  **/
  @jakarta.annotation.Nullable
  public List<IpAddressDefinition> getNetworkZoneIPs() {
    return networkZoneIPs;
  }


  public void setNetworkZoneIPs(List<IpAddressDefinition> networkZoneIPs) {
    this.networkZoneIPs = networkZoneIPs;
  }


  public NetworkZoneDefinitionResponse action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Kind of action to apply when a request matches this Network Zone (Block/Allow/NoOp)
   * @return action
  **/
  @jakarta.annotation.Nullable
  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public NetworkZoneDefinitionResponse applyRules(NetworkZonesApplyRules applyRules) {
    
    this.applyRules = applyRules;
    return this;
  }

   /**
   * Get applyRules
   * @return applyRules
  **/
  @jakarta.annotation.Nullable
  public NetworkZonesApplyRules getApplyRules() {
    return applyRules;
  }


  public void setApplyRules(NetworkZonesApplyRules applyRules) {
    this.applyRules = applyRules;
  }


  public NetworkZoneDefinitionResponse createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * User Id that created the Network Zone
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public NetworkZoneDefinitionResponse updatedBy(String updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * User Id of the last update on the Network Zone
   * @return updatedBy
  **/
  @jakarta.annotation.Nullable
  public String getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkZoneDefinitionResponse networkZoneDefinitionResponse = (NetworkZoneDefinitionResponse) o;
    return Objects.equals(this.code, networkZoneDefinitionResponse.code) &&
        Objects.equals(this.hierarchy, networkZoneDefinitionResponse.hierarchy) &&
        Objects.equals(this.description, networkZoneDefinitionResponse.description) &&
        Objects.equals(this.createdAt, networkZoneDefinitionResponse.createdAt) &&
        Objects.equals(this.updatedAt, networkZoneDefinitionResponse.updatedAt) &&
        Objects.equals(this.networkZoneIPs, networkZoneDefinitionResponse.networkZoneIPs) &&
        Objects.equals(this.action, networkZoneDefinitionResponse.action) &&
        Objects.equals(this.applyRules, networkZoneDefinitionResponse.applyRules) &&
        Objects.equals(this.createdBy, networkZoneDefinitionResponse.createdBy) &&
        Objects.equals(this.updatedBy, networkZoneDefinitionResponse.updatedBy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, hierarchy, description, createdAt, updatedAt, networkZoneIPs, action, applyRules, createdBy, updatedBy);
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
    sb.append("class NetworkZoneDefinitionResponse {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    networkZoneIPs: ").append(toIndentedString(networkZoneIPs)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    applyRules: ").append(toIndentedString(applyRules)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
    openapiFields.add("hierarchy");
    openapiFields.add("description");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("networkZoneIPs");
    openapiFields.add("action");
    openapiFields.add("applyRules");
    openapiFields.add("createdBy");
    openapiFields.add("updatedBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NetworkZoneDefinitionResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetworkZoneDefinitionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkZoneDefinitionResponse is not found in the empty JSON string", NetworkZoneDefinitionResponse.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("networkZoneIPs") != null && !jsonObj.get("networkZoneIPs").isJsonNull()) {
        JsonArray jsonArraynetworkZoneIPs = jsonObj.getAsJsonArray("networkZoneIPs");
        if (jsonArraynetworkZoneIPs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("networkZoneIPs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `networkZoneIPs` to be an array in the JSON string but got `%s`", jsonObj.get("networkZoneIPs").toString()));
          }

          // validate the optional field `networkZoneIPs` (array)
          for (int i = 0; i < jsonArraynetworkZoneIPs.size(); i++) {
            IpAddressDefinition.validateJsonElement(jsonArraynetworkZoneIPs.get(i));
          };
        }
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the optional field `applyRules`
      if (jsonObj.get("applyRules") != null && !jsonObj.get("applyRules").isJsonNull()) {
        NetworkZonesApplyRules.validateJsonElement(jsonObj.get("applyRules"));
      }
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("updatedBy") != null && !jsonObj.get("updatedBy").isJsonNull()) && !jsonObj.get("updatedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkZoneDefinitionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkZoneDefinitionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkZoneDefinitionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkZoneDefinitionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkZoneDefinitionResponse>() {
           @Override
           public void write(JsonWriter out, NetworkZoneDefinitionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkZoneDefinitionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NetworkZoneDefinitionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NetworkZoneDefinitionResponse
  * @throws IOException if the JSON string is invalid with respect to NetworkZoneDefinitionResponse
  */
  public static NetworkZoneDefinitionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkZoneDefinitionResponse.class);
  }

 /**
  * Convert an instance of NetworkZoneDefinitionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
