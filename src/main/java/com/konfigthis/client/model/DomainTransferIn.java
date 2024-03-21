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
import com.konfigthis.client.model.Consent;
import com.konfigthis.client.model.Contact;
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
 * DomainTransferIn
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DomainTransferIn {
  public static final String SERIALIZED_NAME_AUTH_CODE = "authCode";
  @SerializedName(SERIALIZED_NAME_AUTH_CODE)
  private String authCode;

  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private Consent consent;

  public static final String SERIALIZED_NAME_CONTACT_ADMIN = "contactAdmin";
  @SerializedName(SERIALIZED_NAME_CONTACT_ADMIN)
  private Contact contactAdmin;

  public static final String SERIALIZED_NAME_CONTACT_BILLING = "contactBilling";
  @SerializedName(SERIALIZED_NAME_CONTACT_BILLING)
  private Contact contactBilling;

  public static final String SERIALIZED_NAME_CONTACT_REGISTRANT = "contactRegistrant";
  @SerializedName(SERIALIZED_NAME_CONTACT_REGISTRANT)
  private Contact contactRegistrant;

  public static final String SERIALIZED_NAME_CONTACT_TECH = "contactTech";
  @SerializedName(SERIALIZED_NAME_CONTACT_TECH)
  private Contact contactTech;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private Integer period = 1;

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private Boolean privacy = false;

  public static final String SERIALIZED_NAME_RENEW_AUTO = "renewAuto";
  @SerializedName(SERIALIZED_NAME_RENEW_AUTO)
  private Boolean renewAuto = true;

  public DomainTransferIn() {
  }

  public DomainTransferIn authCode(String authCode) {
    
    
    
    
    this.authCode = authCode;
    return this;
  }

   /**
   * Authorization code from registrar for transferring a domain
   * @return authCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Authorization code from registrar for transferring a domain")

  public String getAuthCode() {
    return authCode;
  }


  public void setAuthCode(String authCode) {
    
    
    
    this.authCode = authCode;
  }


  public DomainTransferIn consent(Consent consent) {
    
    
    
    
    this.consent = consent;
    return this;
  }

   /**
   * Get consent
   * @return consent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Consent getConsent() {
    return consent;
  }


  public void setConsent(Consent consent) {
    
    
    
    this.consent = consent;
  }


  public DomainTransferIn contactAdmin(Contact contactAdmin) {
    
    
    
    
    this.contactAdmin = contactAdmin;
    return this;
  }

   /**
   * Get contactAdmin
   * @return contactAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Contact getContactAdmin() {
    return contactAdmin;
  }


  public void setContactAdmin(Contact contactAdmin) {
    
    
    
    this.contactAdmin = contactAdmin;
  }


  public DomainTransferIn contactBilling(Contact contactBilling) {
    
    
    
    
    this.contactBilling = contactBilling;
    return this;
  }

   /**
   * Get contactBilling
   * @return contactBilling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Contact getContactBilling() {
    return contactBilling;
  }


  public void setContactBilling(Contact contactBilling) {
    
    
    
    this.contactBilling = contactBilling;
  }


  public DomainTransferIn contactRegistrant(Contact contactRegistrant) {
    
    
    
    
    this.contactRegistrant = contactRegistrant;
    return this;
  }

   /**
   * Get contactRegistrant
   * @return contactRegistrant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Contact getContactRegistrant() {
    return contactRegistrant;
  }


  public void setContactRegistrant(Contact contactRegistrant) {
    
    
    
    this.contactRegistrant = contactRegistrant;
  }


  public DomainTransferIn contactTech(Contact contactTech) {
    
    
    
    
    this.contactTech = contactTech;
    return this;
  }

   /**
   * Get contactTech
   * @return contactTech
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Contact getContactTech() {
    return contactTech;
  }


  public void setContactTech(Contact contactTech) {
    
    
    
    this.contactTech = contactTech;
  }


  public DomainTransferIn period(Integer period) {
    if (period != null && period < 1) {
      throw new IllegalArgumentException("Invalid value for period. Must be greater than or equal to 1.");
    }
    if (period != null && period > 10) {
      throw new IllegalArgumentException("Invalid value for period. Must be less than or equal to 10.");
    }
    
    
    this.period = period;
    return this;
  }

   /**
   * Can be more than 1 but no more than 10 years total including current registration length
   * minimum: 1
   * maximum: 10
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Can be more than 1 but no more than 10 years total including current registration length")

  public Integer getPeriod() {
    return period;
  }


  public void setPeriod(Integer period) {
    if (period != null && period < 1) {
      throw new IllegalArgumentException("Invalid value for period. Must be greater than or equal to 1.");
    }
    if (period != null && period > 10) {
      throw new IllegalArgumentException("Invalid value for period. Must be less than or equal to 10.");
    }
    
    this.period = period;
  }


  public DomainTransferIn privacy(Boolean privacy) {
    
    
    
    
    this.privacy = privacy;
    return this;
  }

   /**
   * Whether or not privacy has been requested
   * @return privacy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not privacy has been requested")

  public Boolean getPrivacy() {
    return privacy;
  }


  public void setPrivacy(Boolean privacy) {
    
    
    
    this.privacy = privacy;
  }


  public DomainTransferIn renewAuto(Boolean renewAuto) {
    
    
    
    
    this.renewAuto = renewAuto;
    return this;
  }

   /**
   * Whether or not the domain should be configured to automatically renew
   * @return renewAuto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether or not the domain should be configured to automatically renew")

  public Boolean getRenewAuto() {
    return renewAuto;
  }


  public void setRenewAuto(Boolean renewAuto) {
    
    
    
    this.renewAuto = renewAuto;
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
   * @return the DomainTransferIn instance itself
   */
  public DomainTransferIn putAdditionalProperty(String key, Object value) {
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
    DomainTransferIn domainTransferIn = (DomainTransferIn) o;
    return Objects.equals(this.authCode, domainTransferIn.authCode) &&
        Objects.equals(this.consent, domainTransferIn.consent) &&
        Objects.equals(this.contactAdmin, domainTransferIn.contactAdmin) &&
        Objects.equals(this.contactBilling, domainTransferIn.contactBilling) &&
        Objects.equals(this.contactRegistrant, domainTransferIn.contactRegistrant) &&
        Objects.equals(this.contactTech, domainTransferIn.contactTech) &&
        Objects.equals(this.period, domainTransferIn.period) &&
        Objects.equals(this.privacy, domainTransferIn.privacy) &&
        Objects.equals(this.renewAuto, domainTransferIn.renewAuto)&&
        Objects.equals(this.additionalProperties, domainTransferIn.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authCode, consent, contactAdmin, contactBilling, contactRegistrant, contactTech, period, privacy, renewAuto, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainTransferIn {\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    contactAdmin: ").append(toIndentedString(contactAdmin)).append("\n");
    sb.append("    contactBilling: ").append(toIndentedString(contactBilling)).append("\n");
    sb.append("    contactRegistrant: ").append(toIndentedString(contactRegistrant)).append("\n");
    sb.append("    contactTech: ").append(toIndentedString(contactTech)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    renewAuto: ").append(toIndentedString(renewAuto)).append("\n");
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
    openapiFields.add("authCode");
    openapiFields.add("consent");
    openapiFields.add("contactAdmin");
    openapiFields.add("contactBilling");
    openapiFields.add("contactRegistrant");
    openapiFields.add("contactTech");
    openapiFields.add("period");
    openapiFields.add("privacy");
    openapiFields.add("renewAuto");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("authCode");
    openapiRequiredFields.add("consent");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DomainTransferIn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DomainTransferIn.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DomainTransferIn is not found in the empty JSON string", DomainTransferIn.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DomainTransferIn.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("authCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authCode").toString()));
      }
      // validate the required field `consent`
      Consent.validateJsonObject(jsonObj.getAsJsonObject("consent"));
      // validate the optional field `contactAdmin`
      if (jsonObj.get("contactAdmin") != null && !jsonObj.get("contactAdmin").isJsonNull()) {
        Contact.validateJsonObject(jsonObj.getAsJsonObject("contactAdmin"));
      }
      // validate the optional field `contactBilling`
      if (jsonObj.get("contactBilling") != null && !jsonObj.get("contactBilling").isJsonNull()) {
        Contact.validateJsonObject(jsonObj.getAsJsonObject("contactBilling"));
      }
      // validate the optional field `contactRegistrant`
      if (jsonObj.get("contactRegistrant") != null && !jsonObj.get("contactRegistrant").isJsonNull()) {
        Contact.validateJsonObject(jsonObj.getAsJsonObject("contactRegistrant"));
      }
      // validate the optional field `contactTech`
      if (jsonObj.get("contactTech") != null && !jsonObj.get("contactTech").isJsonNull()) {
        Contact.validateJsonObject(jsonObj.getAsJsonObject("contactTech"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainTransferIn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainTransferIn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainTransferIn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainTransferIn.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainTransferIn>() {
           @Override
           public void write(JsonWriter out, DomainTransferIn value) throws IOException {
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
           public DomainTransferIn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DomainTransferIn instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DomainTransferIn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DomainTransferIn
  * @throws IOException if the JSON string is invalid with respect to DomainTransferIn
  */
  public static DomainTransferIn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainTransferIn.class);
  }

 /**
  * Convert an instance of DomainTransferIn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

