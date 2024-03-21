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
import java.util.ArrayList;
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
 * Consent
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Consent {
  public static final String SERIALIZED_NAME_AGREED_AT = "agreedAt";
  @SerializedName(SERIALIZED_NAME_AGREED_AT)
  private String agreedAt;

  public static final String SERIALIZED_NAME_AGREED_BY = "agreedBy";
  @SerializedName(SERIALIZED_NAME_AGREED_BY)
  private String agreedBy;

  public static final String SERIALIZED_NAME_AGREEMENT_KEYS = "agreementKeys";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_KEYS)
  private List<String> agreementKeys = new ArrayList<>();

  public Consent() {
  }

  public Consent agreedAt(String agreedAt) {
    
    
    
    
    this.agreedAt = agreedAt;
    return this;
  }

   /**
   * Timestamp indicating when the end-user consented to these legal agreements
   * @return agreedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Timestamp indicating when the end-user consented to these legal agreements")

  public String getAgreedAt() {
    return agreedAt;
  }


  public void setAgreedAt(String agreedAt) {
    
    
    
    this.agreedAt = agreedAt;
  }


  public Consent agreedBy(String agreedBy) {
    
    
    
    
    this.agreedBy = agreedBy;
    return this;
  }

   /**
   * Originating client IP address of the end-user&#39;s computer when they consented to these legal agreements
   * @return agreedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Originating client IP address of the end-user's computer when they consented to these legal agreements")

  public String getAgreedBy() {
    return agreedBy;
  }


  public void setAgreedBy(String agreedBy) {
    
    
    
    this.agreedBy = agreedBy;
  }


  public Consent agreementKeys(List<String> agreementKeys) {
    
    
    
    
    this.agreementKeys = agreementKeys;
    return this;
  }

  public Consent addAgreementKeysItem(String agreementKeysItem) {
    this.agreementKeys.add(agreementKeysItem);
    return this;
  }

   /**
   * Unique identifiers of the legal agreements to which the end-user has agreed, as returned from the/domains/agreements endpoint
   * @return agreementKeys
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifiers of the legal agreements to which the end-user has agreed, as returned from the/domains/agreements endpoint")

  public List<String> getAgreementKeys() {
    return agreementKeys;
  }


  public void setAgreementKeys(List<String> agreementKeys) {
    
    
    
    this.agreementKeys = agreementKeys;
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
   * @return the Consent instance itself
   */
  public Consent putAdditionalProperty(String key, Object value) {
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
    Consent consent = (Consent) o;
    return Objects.equals(this.agreedAt, consent.agreedAt) &&
        Objects.equals(this.agreedBy, consent.agreedBy) &&
        Objects.equals(this.agreementKeys, consent.agreementKeys)&&
        Objects.equals(this.additionalProperties, consent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreedAt, agreedBy, agreementKeys, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consent {\n");
    sb.append("    agreedAt: ").append(toIndentedString(agreedAt)).append("\n");
    sb.append("    agreedBy: ").append(toIndentedString(agreedBy)).append("\n");
    sb.append("    agreementKeys: ").append(toIndentedString(agreementKeys)).append("\n");
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
    openapiFields.add("agreedAt");
    openapiFields.add("agreedBy");
    openapiFields.add("agreementKeys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("agreedAt");
    openapiRequiredFields.add("agreedBy");
    openapiRequiredFields.add("agreementKeys");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Consent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Consent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Consent is not found in the empty JSON string", Consent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Consent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("agreedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreedAt").toString()));
      }
      if (!jsonObj.get("agreedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreedBy").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("agreementKeys") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("agreementKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreementKeys` to be an array in the JSON string but got `%s`", jsonObj.get("agreementKeys").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Consent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Consent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Consent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Consent.class));

       return (TypeAdapter<T>) new TypeAdapter<Consent>() {
           @Override
           public void write(JsonWriter out, Consent value) throws IOException {
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
           public Consent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Consent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Consent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Consent
  * @throws IOException if the JSON string is invalid with respect to Consent
  */
  public static Consent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Consent.class);
  }

 /**
  * Convert an instance of Consent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

