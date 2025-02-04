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
import com.konfigthis.client.model.ConsentDomainUpdate;
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
 * DomainUpdate
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DomainUpdate {
  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private ConsentDomainUpdate consent;

  public static final String SERIALIZED_NAME_EXPOSE_WHOIS = "exposeWhois";
  @SerializedName(SERIALIZED_NAME_EXPOSE_WHOIS)
  private Boolean exposeWhois;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Boolean locked;

  public static final String SERIALIZED_NAME_NAME_SERVERS = "nameServers";
  @SerializedName(SERIALIZED_NAME_NAME_SERVERS)
  private List<Object> nameServers = null;

  public static final String SERIALIZED_NAME_RENEW_AUTO = "renewAuto";
  @SerializedName(SERIALIZED_NAME_RENEW_AUTO)
  private Boolean renewAuto;

  public static final String SERIALIZED_NAME_SUBACCOUNT_ID = "subaccountId";
  @SerializedName(SERIALIZED_NAME_SUBACCOUNT_ID)
  private String subaccountId;

  public DomainUpdate() {
  }

  public DomainUpdate consent(ConsentDomainUpdate consent) {
    
    
    
    
    this.consent = consent;
    return this;
  }

   /**
   * Get consent
   * @return consent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsentDomainUpdate getConsent() {
    return consent;
  }


  public void setConsent(ConsentDomainUpdate consent) {
    
    
    
    this.consent = consent;
  }


  public DomainUpdate exposeWhois(Boolean exposeWhois) {
    
    
    
    
    this.exposeWhois = exposeWhois;
    return this;
  }

   /**
   * Whether or not the domain contact details should be shown in the WHOIS
   * @return exposeWhois
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the domain contact details should be shown in the WHOIS")

  public Boolean getExposeWhois() {
    return exposeWhois;
  }


  public void setExposeWhois(Boolean exposeWhois) {
    
    
    
    this.exposeWhois = exposeWhois;
  }


  public DomainUpdate locked(Boolean locked) {
    
    
    
    
    this.locked = locked;
    return this;
  }

   /**
   * Whether or not the domain should be locked to prevent transfers
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the domain should be locked to prevent transfers")

  public Boolean getLocked() {
    return locked;
  }


  public void setLocked(Boolean locked) {
    
    
    
    this.locked = locked;
  }


  public DomainUpdate nameServers(List<Object> nameServers) {
    
    
    
    
    this.nameServers = nameServers;
    return this;
  }

  public DomainUpdate addNameServersItem(Object nameServersItem) {
    if (this.nameServers == null) {
      this.nameServers = new ArrayList<>();
    }
    this.nameServers.add(nameServersItem);
    return this;
  }

   /**
   * Fully-qualified domain names for Name Servers to associate with the domain
   * @return nameServers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fully-qualified domain names for Name Servers to associate with the domain")

  public List<Object> getNameServers() {
    return nameServers;
  }


  public void setNameServers(List<Object> nameServers) {
    
    
    
    this.nameServers = nameServers;
  }


  public DomainUpdate renewAuto(Boolean renewAuto) {
    
    
    
    
    this.renewAuto = renewAuto;
    return this;
  }

   /**
   * Whether or not the domain should be configured to automatically renew
   * @return renewAuto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the domain should be configured to automatically renew")

  public Boolean getRenewAuto() {
    return renewAuto;
  }


  public void setRenewAuto(Boolean renewAuto) {
    
    
    
    this.renewAuto = renewAuto;
  }


  public DomainUpdate subaccountId(String subaccountId) {
    
    
    
    
    this.subaccountId = subaccountId;
    return this;
  }

   /**
   * Reseller subaccount shopperid who can manage the domain
   * @return subaccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reseller subaccount shopperid who can manage the domain")

  public String getSubaccountId() {
    return subaccountId;
  }


  public void setSubaccountId(String subaccountId) {
    
    
    
    this.subaccountId = subaccountId;
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
   * @return the DomainUpdate instance itself
   */
  public DomainUpdate putAdditionalProperty(String key, Object value) {
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
    DomainUpdate domainUpdate = (DomainUpdate) o;
    return Objects.equals(this.consent, domainUpdate.consent) &&
        Objects.equals(this.exposeWhois, domainUpdate.exposeWhois) &&
        Objects.equals(this.locked, domainUpdate.locked) &&
        Objects.equals(this.nameServers, domainUpdate.nameServers) &&
        Objects.equals(this.renewAuto, domainUpdate.renewAuto) &&
        Objects.equals(this.subaccountId, domainUpdate.subaccountId)&&
        Objects.equals(this.additionalProperties, domainUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consent, exposeWhois, locked, nameServers, renewAuto, subaccountId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainUpdate {\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    exposeWhois: ").append(toIndentedString(exposeWhois)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    nameServers: ").append(toIndentedString(nameServers)).append("\n");
    sb.append("    renewAuto: ").append(toIndentedString(renewAuto)).append("\n");
    sb.append("    subaccountId: ").append(toIndentedString(subaccountId)).append("\n");
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
    openapiFields.add("consent");
    openapiFields.add("exposeWhois");
    openapiFields.add("locked");
    openapiFields.add("nameServers");
    openapiFields.add("renewAuto");
    openapiFields.add("subaccountId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DomainUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DomainUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DomainUpdate is not found in the empty JSON string", DomainUpdate.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `consent`
      if (jsonObj.get("consent") != null && !jsonObj.get("consent").isJsonNull()) {
        ConsentDomainUpdate.validateJsonObject(jsonObj.getAsJsonObject("consent"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("nameServers") != null && !jsonObj.get("nameServers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameServers` to be an array in the JSON string but got `%s`", jsonObj.get("nameServers").toString()));
      }
      if ((jsonObj.get("subaccountId") != null && !jsonObj.get("subaccountId").isJsonNull()) && !jsonObj.get("subaccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subaccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subaccountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainUpdate>() {
           @Override
           public void write(JsonWriter out, DomainUpdate value) throws IOException {
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
           public DomainUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DomainUpdate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DomainUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DomainUpdate
  * @throws IOException if the JSON string is invalid with respect to DomainUpdate
  */
  public static DomainUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainUpdate.class);
  }

 /**
  * Convert an instance of DomainUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

