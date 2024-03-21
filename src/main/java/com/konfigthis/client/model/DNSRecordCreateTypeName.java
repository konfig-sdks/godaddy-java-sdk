/*
 * 
 * All the help and tools you need to grow online: Websites, Domains, Digital and Social Marketing - plus GoDaddy Guides with you every step of the way.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * DNSRecordCreateTypeName
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DNSRecordCreateTypeName {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private Integer ttl;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;

  public DNSRecordCreateTypeName() {
  }

  public DNSRecordCreateTypeName data(String data) {
    
    
    
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    
    
    
    this.data = data;
  }


  public DNSRecordCreateTypeName port(Integer port) {
    if (port != null && port < 1) {
      throw new IllegalArgumentException("Invalid value for port. Must be greater than or equal to 1.");
    }
    if (port != null && port > 65535) {
      throw new IllegalArgumentException("Invalid value for port. Must be less than or equal to 65535.");
    }
    
    
    this.port = port;
    return this;
  }

   /**
   * Service port (SRV only)
   * minimum: 1
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Service port (SRV only)")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    if (port != null && port < 1) {
      throw new IllegalArgumentException("Invalid value for port. Must be greater than or equal to 1.");
    }
    if (port != null && port > 65535) {
      throw new IllegalArgumentException("Invalid value for port. Must be less than or equal to 65535.");
    }
    
    this.port = port;
  }


  public DNSRecordCreateTypeName priority(Integer priority) {
    
    
    
    
    this.priority = priority;
    return this;
  }

   /**
   * Record priority (MX and SRV only)
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Record priority (MX and SRV only)")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    
    
    
    this.priority = priority;
  }


  public DNSRecordCreateTypeName protocol(String protocol) {
    
    
    
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Service protocol (SRV only)
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Service protocol (SRV only)")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    
    
    
    this.protocol = protocol;
  }


  public DNSRecordCreateTypeName service(String service) {
    
    
    
    
    this.service = service;
    return this;
  }

   /**
   * Service type (SRV only)
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Service type (SRV only)")

  public String getService() {
    return service;
  }


  public void setService(String service) {
    
    
    
    this.service = service;
  }


  public DNSRecordCreateTypeName ttl(Integer ttl) {
    
    
    
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTtl() {
    return ttl;
  }


  public void setTtl(Integer ttl) {
    
    
    
    this.ttl = ttl;
  }


  public DNSRecordCreateTypeName weight(Integer weight) {
    
    
    
    
    this.weight = weight;
    return this;
  }

   /**
   * Record weight (SRV only)
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Record weight (SRV only)")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    
    
    
    this.weight = weight;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the DNSRecordCreateTypeName instance itself
   */
  public DNSRecordCreateTypeName putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSRecordCreateTypeName dnSRecordCreateTypeName = (DNSRecordCreateTypeName) o;
    return Objects.equals(this.data, dnSRecordCreateTypeName.data) &&
        Objects.equals(this.port, dnSRecordCreateTypeName.port) &&
        Objects.equals(this.priority, dnSRecordCreateTypeName.priority) &&
        Objects.equals(this.protocol, dnSRecordCreateTypeName.protocol) &&
        Objects.equals(this.service, dnSRecordCreateTypeName.service) &&
        Objects.equals(this.ttl, dnSRecordCreateTypeName.ttl) &&
        Objects.equals(this.weight, dnSRecordCreateTypeName.weight)&&
        Objects.equals(this.additionalProperties, dnSRecordCreateTypeName.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, port, priority, protocol, service, ttl, weight, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSRecordCreateTypeName {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("port");
    openapiFields.add("priority");
    openapiFields.add("protocol");
    openapiFields.add("service");
    openapiFields.add("ttl");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DNSRecordCreateTypeName
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DNSRecordCreateTypeName.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DNSRecordCreateTypeName is not found in the empty JSON string", DNSRecordCreateTypeName.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DNSRecordCreateTypeName.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
      if ((jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonNull()) && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
      if ((jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) && !jsonObj.get("service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DNSRecordCreateTypeName.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DNSRecordCreateTypeName' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DNSRecordCreateTypeName> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DNSRecordCreateTypeName.class));

       return (TypeAdapter<T>) new TypeAdapter<DNSRecordCreateTypeName>() {
           @Override
           public void write(JsonWriter out, DNSRecordCreateTypeName value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public DNSRecordCreateTypeName read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DNSRecordCreateTypeName instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DNSRecordCreateTypeName given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DNSRecordCreateTypeName
  * @throws IOException if the JSON string is invalid with respect to DNSRecordCreateTypeName
  */
  public static DNSRecordCreateTypeName fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DNSRecordCreateTypeName.class);
  }

 /**
  * Convert an instance of DNSRecordCreateTypeName to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

