# V1Api

All URIs are relative to *http://api.ote-godaddy.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDnsRecordsToDomain**](V1Api.md#addDnsRecordsToDomain) | **PATCH** /v1/domains/{domain}/records | Add the specified DNS Records to the specified Domain |
| [**cancelDomainPurchase**](V1Api.md#cancelDomainPurchase) | **DELETE** /v1/domains/{domain} | Cancel a purchased domain |
| [**cancelPrivacyRequest**](V1Api.md#cancelPrivacyRequest) | **DELETE** /v1/domains/{domain}/privacy | Submit a privacy cancellation request for the given domain |
| [**checkDomainAvailability**](V1Api.md#checkDomainAvailability) | **GET** /v1/domains/available | Determine whether or not the specified domain is available for purchase |
| [**checkDomainAvailabilityPost**](V1Api.md#checkDomainAvailabilityPost) | **POST** /v1/domains/available | Determine whether or not the specified domains are available for purchase |
| [**createDomainPurchase**](V1Api.md#createDomainPurchase) | **POST** /v1/domains/purchase | Purchase and register the specified Domain |
| [**deleteAllDnsRecords**](V1Api.md#deleteAllDnsRecords) | **DELETE** /v1/domains/{domain}/records/{type}/{name} | Delete all DNS Records for the specified Domain with the specified Type and Name |
| [**getDnsRecords**](V1Api.md#getDnsRecords) | **GET** /v1/domains/{domain}/records/{type}/{name} | Retrieve DNS Records for the specified Domain, optionally with the specified Type and/or Name |
| [**getDomainDetails**](V1Api.md#getDomainDetails) | **GET** /v1/domains/{domain} | Retrieve details for the specified Domain |
| [**getDomainSchema**](V1Api.md#getDomainSchema) | **GET** /v1/domains/purchase/schema/{tld} | Retrieve the schema to be submitted when registering a Domain for the specified TLD |
| [**getDomainsList**](V1Api.md#getDomainsList) | **GET** /v1/domains | Retrieve a list of Domains for the specified Shopper |
| [**getLegalAgreements**](V1Api.md#getLegalAgreements) | **GET** /v1/domains/agreements | Retrieve the legal agreement(s) required to purchase the specified TLD and add-ons |
| [**getTldsList**](V1Api.md#getTldsList) | **GET** /v1/domains/tlds | Retrieves a list of TLDs supported and enabled for sale |
| [**purchasePrivacyForDomain**](V1Api.md#purchasePrivacyForDomain) | **POST** /v1/domains/{domain}/privacy/purchase | Purchase privacy for a specified domain |
| [**purchaseTransferProcess**](V1Api.md#purchaseTransferProcess) | **POST** /v1/domains/{domain}/transfer | Purchase and start or restart transfer process |
| [**renewDomain**](V1Api.md#renewDomain) | **POST** /v1/domains/{domain}/renew | Renew the specified Domain |
| [**replaceDnsRecords**](V1Api.md#replaceDnsRecords) | **PUT** /v1/domains/{domain}/records | Replace all DNS Records for the specified Domain |
| [**replaceDnsRecordsType**](V1Api.md#replaceDnsRecordsType) | **PUT** /v1/domains/{domain}/records/{type} | Replace all DNS Records for the specified Domain with the specified Type |
| [**replaceDnsRecordsType_0**](V1Api.md#replaceDnsRecordsType_0) | **PUT** /v1/domains/{domain}/records/{type}/{name} | Replace all DNS Records for the specified Domain with the specified Type and Name |
| [**resendContactEmailVerification**](V1Api.md#resendContactEmailVerification) | **POST** /v1/domains/{domain}/verifyRegistrantEmail | Re-send Contact E-mail Verification for specified Domain |
| [**suggestAlternateDomains**](V1Api.md#suggestAlternateDomains) | **GET** /v1/domains/suggest | Suggest alternate Domain names based on a seed Domain, a set of keywords, or the shopper&#39;s purchase history |
| [**updateDomainContacts**](V1Api.md#updateDomainContacts) | **PATCH** /v1/domains/{domain}/contacts | Update domain |
| [**updateDomainDetails**](V1Api.md#updateDomainDetails) | **PATCH** /v1/domains/{domain} | Update details for the specified Domain |
| [**validateDomainContacts**](V1Api.md#validateDomainContacts) | **POST** /v1/domains/contacts/validate | Validate the request body using the Domain Contact Validation Schema for specified domains. |
| [**validateDomainPurchase**](V1Api.md#validateDomainPurchase) | **POST** /v1/domains/purchase/validate | Validate the request body using the Domain Purchase Schema for the specified TLD |


<a name="addDnsRecordsToDomain"></a>
# **addDnsRecordsToDomain**
> addDnsRecordsToDomain(domain, dnSRecord).xShopperId(xShopperId).execute();

Add the specified DNS Records to the specified Domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain whose DNS Records are to be augmented
    String xShopperId = "xShopperId_example"; // Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you're a Reseller, but purchased a Domain via http://www.godaddy.com
    try {
      client
              .v1
              .addDnsRecordsToDomain(domain)
              .xShopperId(xShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#addDnsRecordsToDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .addDnsRecordsToDomain(domain)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#addDnsRecordsToDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain whose DNS Records are to be augmented | |
| **dnSRecord** | [**List&lt;DNSRecord&gt;**](DNSRecord.md)| DNS Records to add to whatever currently exists | |
| **xShopperId** | **String**| Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="cancelDomainPurchase"></a>
# **cancelDomainPurchase**
> cancelDomainPurchase(domain).execute();

Cancel a purchased domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain to cancel
    try {
      client
              .v1
              .cancelDomainPurchase(domain)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#cancelDomainPurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .cancelDomainPurchase(domain)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#cancelDomainPurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain to cancel | |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="cancelPrivacyRequest"></a>
# **cancelPrivacyRequest**
> cancelPrivacyRequest(domain).xShopperId(xShopperId).execute();

Submit a privacy cancellation request for the given domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain whose privacy is to be cancelled
    String xShopperId = "xShopperId_example"; // Shopper ID of the owner of the domain
    try {
      client
              .v1
              .cancelPrivacyRequest(domain)
              .xShopperId(xShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#cancelPrivacyRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .cancelPrivacyRequest(domain)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#cancelPrivacyRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain whose privacy is to be cancelled | |
| **xShopperId** | **String**| Shopper ID of the owner of the domain | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="checkDomainAvailability"></a>
# **checkDomainAvailability**
> DomainAvailableResponse checkDomainAvailability(domain).checkType(checkType).forTransfer(forTransfer).execute();

Determine whether or not the specified domain is available for purchase

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain name whose availability is to be checked
    String checkType = "FAST"; // Optimize for time ('FAST') or accuracy ('FULL')
    Boolean forTransfer = false; // Whether or not to include domains available for transfer. If set to True, checkType is ignored
    try {
      DomainAvailableResponse result = client
              .v1
              .checkDomainAvailability(domain)
              .checkType(checkType)
              .forTransfer(forTransfer)
              .execute();
      System.out.println(result);
      System.out.println(result.getAvailable());
      System.out.println(result.getCurrency());
      System.out.println(result.getDefinitive());
      System.out.println(result.getDomain());
      System.out.println(result.getPeriod());
      System.out.println(result.getPrice());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#checkDomainAvailability");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainAvailableResponse> response = client
              .v1
              .checkDomainAvailability(domain)
              .checkType(checkType)
              .forTransfer(forTransfer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#checkDomainAvailability");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain name whose availability is to be checked | |
| **checkType** | **String**| Optimize for time (&#39;FAST&#39;) or accuracy (&#39;FULL&#39;) | [optional] [default to FAST] [enum: FAST, FULL, fast, full] |
| **forTransfer** | **Boolean**| Whether or not to include domains available for transfer. If set to True, checkType is ignored | [optional] [default to false] |

### Return type

[**DomainAvailableResponse**](DomainAvailableResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="checkDomainAvailabilityPost"></a>
# **checkDomainAvailabilityPost**
> DomainAvailableBulk checkDomainAvailabilityPost(requestBody).checkType(checkType).execute();

Determine whether or not the specified domains are available for purchase

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String checkType = "FAST"; // Optimize for time ('FAST') or accuracy ('FULL')
    try {
      DomainAvailableBulk result = client
              .v1
              .checkDomainAvailabilityPost()
              .checkType(checkType)
              .execute();
      System.out.println(result);
      System.out.println(result.getDomains());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#checkDomainAvailabilityPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainAvailableBulk> response = client
              .v1
              .checkDomainAvailabilityPost()
              .checkType(checkType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#checkDomainAvailabilityPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**List&lt;String&gt;**](String.md)| Domain names for which to check availability | |
| **checkType** | **String**| Optimize for time (&#39;FAST&#39;) or accuracy (&#39;FULL&#39;) | [optional] [default to FAST] [enum: FAST, FULL, fast, full] |

### Return type

[**DomainAvailableBulk**](DomainAvailableBulk.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |
| **203** | Request was partially successful |  -  |

<a name="createDomainPurchase"></a>
# **createDomainPurchase**
> DomainPurchaseResponse createDomainPurchase(domainPurchase).xShopperId(xShopperId).execute();

Purchase and register the specified Domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    Consent consent = new Consent();
    String domain = "domain_example"; // For internationalized domain names with non-ascii characters, the domain name is converted to punycode before format and pattern validation rules are checked
    Contact contactAdmin = new Contact();
    Contact contactBilling = new Contact();
    Contact contactRegistrant = new Contact();
    Contact contactTech = new Contact();
    List<String> nameServers = Arrays.asList();
    Integer period = 1;
    Boolean privacy = false;
    Boolean renewAuto = true;
    String xShopperId = "xShopperId_example"; // The Shopper for whom the domain should be purchased
    try {
      DomainPurchaseResponse result = client
              .v1
              .createDomainPurchase(consent, domain)
              .contactAdmin(contactAdmin)
              .contactBilling(contactBilling)
              .contactRegistrant(contactRegistrant)
              .contactTech(contactTech)
              .nameServers(nameServers)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .xShopperId(xShopperId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrency());
      System.out.println(result.getItemCount());
      System.out.println(result.getOrderId());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#createDomainPurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainPurchaseResponse> response = client
              .v1
              .createDomainPurchase(consent, domain)
              .contactAdmin(contactAdmin)
              .contactBilling(contactBilling)
              .contactRegistrant(contactRegistrant)
              .contactTech(contactTech)
              .nameServers(nameServers)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#createDomainPurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainPurchase** | [**DomainPurchase**](DomainPurchase.md)| An instance document expected to match the JSON schema returned by &#x60;./schema/{tld}&#x60; | |
| **xShopperId** | **String**| The Shopper for whom the domain should be purchased | [optional] |

### Return type

[**DomainPurchaseResponse**](DomainPurchaseResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="deleteAllDnsRecords"></a>
# **deleteAllDnsRecords**
> deleteAllDnsRecords(domain, type, name).xShopperId(xShopperId).execute();

Delete all DNS Records for the specified Domain with the specified Type and Name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain whose DNS Records are to be deleted
    String type = "A"; // DNS Record Type for which DNS Records are to be deleted
    String name = "name_example"; // DNS Record Name for which DNS Records are to be deleted
    String xShopperId = "xShopperId_example"; // Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you're a Reseller, but purchased a Domain via http://www.godaddy.com
    try {
      client
              .v1
              .deleteAllDnsRecords(domain, type, name)
              .xShopperId(xShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#deleteAllDnsRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .deleteAllDnsRecords(domain, type, name)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#deleteAllDnsRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain whose DNS Records are to be deleted | |
| **type** | **String**| DNS Record Type for which DNS Records are to be deleted | [enum: A, AAAA, CNAME, MX, SRV, TXT] |
| **name** | **String**| DNS Record Name for which DNS Records are to be deleted | |
| **xShopperId** | **String**| Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request was successful |  -  |

<a name="getDnsRecords"></a>
# **getDnsRecords**
> List&lt;DNSRecord&gt; getDnsRecords(domain, type, name).xShopperId(xShopperId).offset(offset).limit(limit).execute();

Retrieve DNS Records for the specified Domain, optionally with the specified Type and/or Name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain whose DNS Records are to be retrieved
    String type = "A"; // DNS Record Type for which DNS Records are to be retrieved
    String name = "name_example"; // DNS Record Name for which DNS Records are to be retrieved
    String xShopperId = "xShopperId_example"; // Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you're a Reseller, but purchased a Domain via http://www.godaddy.com
    Integer offset = 56; // Number of results to skip for pagination
    Integer limit = 56; // Maximum number of items to return
    try {
      List<DNSRecord> result = client
              .v1
              .getDnsRecords(domain, type, name)
              .xShopperId(xShopperId)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getDnsRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DNSRecord>> response = client
              .v1
              .getDnsRecords(domain, type, name)
              .xShopperId(xShopperId)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getDnsRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain whose DNS Records are to be retrieved | |
| **type** | **String**| DNS Record Type for which DNS Records are to be retrieved | [enum: A, AAAA, CNAME, MX, NS, SOA, SRV, TXT] |
| **name** | **String**| DNS Record Name for which DNS Records are to be retrieved | |
| **xShopperId** | **String**| Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com | [optional] |
| **offset** | **Integer**| Number of results to skip for pagination | [optional] |
| **limit** | **Integer**| Maximum number of items to return | [optional] |

### Return type

[**List&lt;DNSRecord&gt;**](DNSRecord.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="getDomainDetails"></a>
# **getDomainDetails**
> DomainDetail getDomainDetails(domain).xShopperId(xShopperId).execute();

Retrieve details for the specified Domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain name whose details are to be retrieved
    String xShopperId = "xShopperId_example"; // Shopper ID expected to own the specified domain
    try {
      DomainDetail result = client
              .v1
              .getDomainDetails(domain)
              .xShopperId(xShopperId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthCode());
      System.out.println(result.getContactAdmin());
      System.out.println(result.getContactBilling());
      System.out.println(result.getContactRegistrant());
      System.out.println(result.getContactTech());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainId());
      System.out.println(result.getExpirationProtected());
      System.out.println(result.getExpires());
      System.out.println(result.getExposeWhois());
      System.out.println(result.getHoldRegistrar());
      System.out.println(result.getLocked());
      System.out.println(result.getNameServers());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRegistrarCreatedAt());
      System.out.println(result.getRenewAuto());
      System.out.println(result.getRenewDeadline());
      System.out.println(result.getStatus());
      System.out.println(result.getSubaccountId());
      System.out.println(result.getTransferAwayEligibleAt());
      System.out.println(result.getTransferProtected());
      System.out.println(result.getVerifications());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getDomainDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainDetail> response = client
              .v1
              .getDomainDetails(domain)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getDomainDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain name whose details are to be retrieved | |
| **xShopperId** | **String**| Shopper ID expected to own the specified domain | [optional] |

### Return type

[**DomainDetail**](DomainDetail.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |
| **203** | Request was partially successful, see verifications.status for further detail |  -  |

<a name="getDomainSchema"></a>
# **getDomainSchema**
> JsonSchema getDomainSchema(tld).execute();

Retrieve the schema to be submitted when registering a Domain for the specified TLD

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String tld = "tld_example"; // The Top-Level Domain whose schema should be retrieved
    try {
      JsonSchema result = client
              .v1
              .getDomainSchema(tld)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getModels());
      System.out.println(result.getProperties());
      System.out.println(result.getRequired());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getDomainSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonSchema> response = client
              .v1
              .getDomainSchema(tld)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getDomainSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tld** | **String**| The Top-Level Domain whose schema should be retrieved | |

### Return type

[**JsonSchema**](JsonSchema.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="getDomainsList"></a>
# **getDomainsList**
> List&lt;DomainSummary&gt; getDomainsList().xShopperId(xShopperId).statuses(statuses).statusGroups(statusGroups).limit(limit).marker(marker).includes(includes).modifiedDate(modifiedDate).execute();

Retrieve a list of Domains for the specified Shopper

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String xShopperId = "xShopperId_example"; // Shopper ID whose domains are to be retrieved
    List<String> statuses = Arrays.asList(); // Only include results with `status` value in the specified set
    List<String> statusGroups = Arrays.asList(); // Only include results with `status` value in any of the specified groups
    Integer limit = 56; // Maximum number of domains to return
    String marker = "marker_example"; // Marker Domain to use as the offset in results
    List<String> includes = Arrays.asList(); // Optional details to be included in the response
    String modifiedDate = "modifiedDate_example"; // Only include results that have been modified since the specified date
    try {
      List<DomainSummary> result = client
              .v1
              .getDomainsList()
              .xShopperId(xShopperId)
              .statuses(statuses)
              .statusGroups(statusGroups)
              .limit(limit)
              .marker(marker)
              .includes(includes)
              .modifiedDate(modifiedDate)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getDomainsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DomainSummary>> response = client
              .v1
              .getDomainsList()
              .xShopperId(xShopperId)
              .statuses(statuses)
              .statusGroups(statusGroups)
              .limit(limit)
              .marker(marker)
              .includes(includes)
              .modifiedDate(modifiedDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getDomainsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xShopperId** | **String**| Shopper ID whose domains are to be retrieved | [optional] |
| **statuses** | [**List&lt;String&gt;**](String.md)| Only include results with &#x60;status&#x60; value in the specified set | [optional] [enum: ACTIVE, AWAITING_CLAIM_ACK, AWAITING_DOCUMENT_AFTER_TRANSFER, AWAITING_DOCUMENT_AFTER_UPDATE_ACCOUNT, AWAITING_DOCUMENT_UPLOAD, AWAITING_FAILED_TRANSFER_WHOIS_PRIVACY, AWAITING_PAYMENT, AWAITING_RENEWAL_TRANSFER_IN_COMPLETE, AWAITING_TRANSFER_IN_ACK, AWAITING_TRANSFER_IN_AUTH, AWAITING_TRANSFER_IN_AUTO, AWAITING_TRANSFER_IN_WHOIS, AWAITING_TRANSFER_IN_WHOIS_FIX, AWAITING_VERIFICATION_ICANN, AWAITING_VERIFICATION_ICANN_MANUAL, CANCELLED, CANCELLED_HELD, CANCELLED_REDEEMABLE, CANCELLED_TRANSFER, CONFISCATED, DISABLED_SPECIAL, EXCLUDED_INVALID_CLAIM_FIREHOSE, EXPIRED_REASSIGNED, FAILED_BACKORDER_CAPTURE, FAILED_DROP_IMMEDIATE_THEN_ADD, FAILED_PRE_REGISTRATION, FAILED_REDEMPTION, FAILED_REDEMPTION_REPORT, FAILED_REGISTRATION, FAILED_REGISTRATION_FIREHOSE, FAILED_RESTORATION_REDEMPTION_MOCK, FAILED_SETUP, FAILED_TRANSFER_IN, FAILED_TRANSFER_IN_BAD_STATUS, FAILED_TRANSFER_IN_REGISTRY, HELD_COURT_ORDERED, HELD_DISPUTED, HELD_EXPIRATION_PROTECTION, HELD_EXPIRED_REDEMPTION_MOCK, HELD_REGISTRAR_ADD, HELD_REGISTRAR_REMOVE, HELD_SHOPPER, HELD_TEMPORARY, LOCKED_ABUSE, LOCKED_COPYRIGHT, LOCKED_REGISTRY, LOCKED_SUPER, PARKED_AND_HELD, PARKED_EXPIRED, PARKED_VERIFICATION_ICANN, PENDING_ABORT_CANCEL_SETUP, PENDING_AGREEMENT_PRE_REGISTRATION, PENDING_APPLY_RENEWAL_CREDITS, PENDING_BACKORDER_CAPTURE, PENDING_BLOCKED_REGISTRY, PENDING_CANCEL_REGISTRANT_PROFILE, PENDING_COMPLETE_REDEMPTION_WITHOUT_RECEIPT, PENDING_COMPLETE_REGISTRANT_PROFILE, PENDING_COO, PENDING_COO_COMPLETE, PENDING_DNS, PENDING_DNS_ACTIVE, PENDING_DNS_INACTIVE, PENDING_DOCUMENT_VALIDATION, PENDING_DOCUMENT_VERIFICATION, PENDING_DROP_IMMEDIATE, PENDING_DROP_IMMEDIATE_THEN_ADD, PENDING_EPP_CREATE, PENDING_EPP_DELETE, PENDING_EPP_UPDATE, PENDING_ESCALATION_REGISTRY, PENDING_EXPIRATION, PENDING_EXPIRATION_RESPONSE, PENDING_EXPIRATION_SYNC, PENDING_EXPIRED_REASSIGNMENT, PENDING_EXPIRE_AUTO_ADD, PENDING_EXTEND_REGISTRANT_PROFILE, PENDING_FAILED_COO, PENDING_FAILED_EPP_CREATE, PENDING_FAILED_HELD, PENDING_FAILED_PURCHASE_PREMIUM, PENDING_FAILED_RECONCILE_FIREHOSE, PENDING_FAILED_REDEMPTION_WITHOUT_RECEIPT, PENDING_FAILED_RELEASE_PREMIUM, PENDING_FAILED_RENEW_EXPIRATION_PROTECTION, PENDING_FAILED_RESERVE_PREMIUM, PENDING_FAILED_SUBMIT_FIREHOSE, PENDING_FAILED_TRANSFER_ACK_PREMIUM, PENDING_FAILED_TRANSFER_IN_ACK_PREMIUM, PENDING_FAILED_TRANSFER_IN_PREMIUM, PENDING_FAILED_TRANSFER_PREMIUM, PENDING_FAILED_TRANSFER_SUBMIT_PREMIUM, PENDING_FAILED_UNLOCK_PREMIUM, PENDING_FAILED_UPDATE_API, PENDING_FRAUD_VERIFICATION, PENDING_FRAUD_VERIFIED, PENDING_GET_CONTACTS, PENDING_GET_HOSTS, PENDING_GET_NAME_SERVERS, PENDING_GET_STATUS, PENDING_HOLD_ESCROW, PENDING_HOLD_REDEMPTION, PENDING_LOCK_CLIENT_REMOVE, PENDING_LOCK_DATA_QUALITY, PENDING_LOCK_THEN_HOLD_REDEMPTION, PENDING_PARKING_DETERMINATION, PENDING_PARK_INVALID_WHOIS, PENDING_PARK_INVALID_WHOIS_REMOVAL, PENDING_PURCHASE_PREMIUM, PENDING_RECONCILE, PENDING_RECONCILE_FIREHOSE, PENDING_REDEMPTION, PENDING_REDEMPTION_REPORT, PENDING_REDEMPTION_REPORT_COMPLETE, PENDING_REDEMPTION_REPORT_SUBMITTED, PENDING_REDEMPTION_WITHOUT_RECEIPT, PENDING_REDEMPTION_WITHOUT_RECEIPT_MOCK, PENDING_RELEASE_PREMIUM, PENDING_REMOVAL, PENDING_REMOVAL_HELD, PENDING_REMOVAL_PARKED, PENDING_REMOVAL_UNPARK, PENDING_RENEWAL, PENDING_RENEW_EXPIRATION_PROTECTION, PENDING_RENEW_INFINITE, PENDING_RENEW_LOCKED, PENDING_RENEW_WITHOUT_RECEIPT, PENDING_REPORT_REDEMPTION_WITHOUT_RECEIPT, PENDING_RESERVE_PREMIUM, PENDING_RESET_VERIFICATION_ICANN, PENDING_RESPONSE_FIREHOSE, PENDING_RESTORATION, PENDING_RESTORATION_INACTIVE, PENDING_RESTORATION_REDEMPTION_MOCK, PENDING_RETRY_EPP_CREATE, PENDING_RETRY_HELD, PENDING_SEND_AUTH_CODE, PENDING_SETUP, PENDING_SETUP_ABANDON, PENDING_SETUP_AGREEMENT_LANDRUSH, PENDING_SETUP_AGREEMENT_SUNRISE2_A, PENDING_SETUP_AGREEMENT_SUNRISE2_B, PENDING_SETUP_AGREEMENT_SUNRISE2_C, PENDING_SETUP_AUTH, PENDING_SETUP_DNS, PENDING_SETUP_FAILED, PENDING_SETUP_REVIEW, PENDING_SETUP_SUNRISE, PENDING_SETUP_SUNRISE_PRE, PENDING_SETUP_SUNRISE_RESPONSE, PENDING_SUBMIT_FAILURE, PENDING_SUBMIT_FIREHOSE, PENDING_SUBMIT_HOLD_FIREHOSE, PENDING_SUBMIT_HOLD_LANDRUSH, PENDING_SUBMIT_HOLD_SUNRISE, PENDING_SUBMIT_LANDRUSH, PENDING_SUBMIT_RESPONSE_FIREHOSE, PENDING_SUBMIT_RESPONSE_LANDRUSH, PENDING_SUBMIT_RESPONSE_SUNRISE, PENDING_SUBMIT_SUCCESS_FIREHOSE, PENDING_SUBMIT_SUCCESS_LANDRUSH, PENDING_SUBMIT_SUCCESS_SUNRISE, PENDING_SUBMIT_SUNRISE, PENDING_SUBMIT_WAITING_LANDRUSH, PENDING_SUCCESS_PRE_REGISTRATION, PENDING_SUSPENDED_DATA_QUALITY, PENDING_TRANSFER_ACK_PREMIUM, PENDING_TRANSFER_IN, PENDING_TRANSFER_IN_ACK, PENDING_TRANSFER_IN_ACK_PREMIUM, PENDING_TRANSFER_IN_BAD_REGISTRANT, PENDING_TRANSFER_IN_CANCEL, PENDING_TRANSFER_IN_CANCEL_REGISTRY, PENDING_TRANSFER_IN_COMPLETE_ACK, PENDING_TRANSFER_IN_DELETE, PENDING_TRANSFER_IN_LOCK, PENDING_TRANSFER_IN_NACK, PENDING_TRANSFER_IN_NOTIFICATION, PENDING_TRANSFER_IN_PREMIUM, PENDING_TRANSFER_IN_RELEASE, PENDING_TRANSFER_IN_RESPONSE, PENDING_TRANSFER_IN_UNDERAGE, PENDING_TRANSFER_OUT, PENDING_TRANSFER_OUT_ACK, PENDING_TRANSFER_OUT_NACK, PENDING_TRANSFER_OUT_PREMIUM, PENDING_TRANSFER_OUT_UNDERAGE, PENDING_TRANSFER_OUT_VALIDATION, PENDING_TRANSFER_PREMIUM, PENDING_TRANSFER_PREMUIM, PENDING_TRANSFER_SUBMIT_PREMIUM, PENDING_UNLOCK_DATA_QUALITY, PENDING_UNLOCK_PREMIUM, PENDING_UPDATE, PENDING_UPDATED_REGISTRANT_DATA_QUALITY, PENDING_UPDATE_ACCOUNT, PENDING_UPDATE_API, PENDING_UPDATE_API_RESPONSE, PENDING_UPDATE_AUTH, PENDING_UPDATE_CONTACTS, PENDING_UPDATE_CONTACTS_PRIVACY, PENDING_UPDATE_DNS, PENDING_UPDATE_DNS_SECURITY, PENDING_UPDATE_ELIGIBILITY, PENDING_UPDATE_EPP_CONTACTS, PENDING_UPDATE_MEMBERSHIP, PENDING_UPDATE_OWNERSHIP, PENDING_UPDATE_OWNERSHIP_AUTH_AUCTION, PENDING_UPDATE_OWNERSHIP_HELD, PENDING_UPDATE_REGISTRANT, PENDING_UPDATE_REPO, PENDING_VALIDATION_DATA_QUALITY, PENDING_VERIFICATION_FRAUD, PENDING_VERIFICATION_STATUS, PENDING_VERIFY_REGISTRANT_DATA_QUALITY, RESERVED, RESERVED_PREMIUM, REVERTED, SUSPENDED_VERIFICATION_ICANN, TRANSFERRED_OUT, UNLOCKED_ABUSE, UNLOCKED_SUPER, UNPARKED_AND_UNHELD, UPDATED_OWNERSHIP, UPDATED_OWNERSHIP_HELD] |
| **statusGroups** | [**List&lt;String&gt;**](String.md)| Only include results with &#x60;status&#x60; value in any of the specified groups | [optional] [enum: INACTIVE, PRE_REGISTRATION, REDEMPTION, RENEWABLE, VERIFICATION_ICANN, VISIBLE] |
| **limit** | **Integer**| Maximum number of domains to return | [optional] |
| **marker** | **String**| Marker Domain to use as the offset in results | [optional] |
| **includes** | [**List&lt;String&gt;**](String.md)| Optional details to be included in the response | [optional] [enum: authCode, contacts, nameServers] |
| **modifiedDate** | **String**| Only include results that have been modified since the specified date | [optional] |

### Return type

[**List&lt;DomainSummary&gt;**](DomainSummary.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="getLegalAgreements"></a>
# **getLegalAgreements**
> List&lt;LegalAgreement&gt; getLegalAgreements(tlds, privacy).xMarketId(xMarketId).forTransfer(forTransfer).execute();

Retrieve the legal agreement(s) required to purchase the specified TLD and add-ons

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    List<String> tlds = Arrays.asList(); // list of TLDs whose legal agreements are to be retrieved
    Boolean privacy = true; // Whether or not privacy has been requested
    String xMarketId = "en-US"; // Unique identifier of the Market used to retrieve/translate Legal Agreements
    Boolean forTransfer = true; // Whether or not domain tranfer has been requested
    try {
      List<LegalAgreement> result = client
              .v1
              .getLegalAgreements(tlds, privacy)
              .xMarketId(xMarketId)
              .forTransfer(forTransfer)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getLegalAgreements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LegalAgreement>> response = client
              .v1
              .getLegalAgreements(tlds, privacy)
              .xMarketId(xMarketId)
              .forTransfer(forTransfer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getLegalAgreements");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tlds** | [**List&lt;String&gt;**](String.md)| list of TLDs whose legal agreements are to be retrieved | |
| **privacy** | **Boolean**| Whether or not privacy has been requested | |
| **xMarketId** | **String**| Unique identifier of the Market used to retrieve/translate Legal Agreements | [optional] [default to en-US] |
| **forTransfer** | **Boolean**| Whether or not domain tranfer has been requested | [optional] |

### Return type

[**List&lt;LegalAgreement&gt;**](LegalAgreement.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="getTldsList"></a>
# **getTldsList**
> List&lt;TldSummary&gt; getTldsList().execute();

Retrieves a list of TLDs supported and enabled for sale

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    try {
      List<TldSummary> result = client
              .v1
              .getTldsList()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getTldsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TldSummary>> response = client
              .v1
              .getTldsList()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#getTldsList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TldSummary&gt;**](TldSummary.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="purchasePrivacyForDomain"></a>
# **purchasePrivacyForDomain**
> DomainPurchaseResponse purchasePrivacyForDomain(domain, privacyPurchase).xShopperId(xShopperId).execute();

Purchase privacy for a specified domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    Consent consent = new Consent();
    String domain = "domain_example"; // Domain for which to purchase privacy
    String xShopperId = "xShopperId_example"; // Shopper ID of the owner of the domain
    try {
      DomainPurchaseResponse result = client
              .v1
              .purchasePrivacyForDomain(consent, domain)
              .xShopperId(xShopperId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrency());
      System.out.println(result.getItemCount());
      System.out.println(result.getOrderId());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#purchasePrivacyForDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainPurchaseResponse> response = client
              .v1
              .purchasePrivacyForDomain(consent, domain)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#purchasePrivacyForDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain for which to purchase privacy | |
| **privacyPurchase** | [**PrivacyPurchase**](PrivacyPurchase.md)| Options for purchasing privacy | |
| **xShopperId** | **String**| Shopper ID of the owner of the domain | [optional] |

### Return type

[**DomainPurchaseResponse**](DomainPurchaseResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="purchaseTransferProcess"></a>
# **purchaseTransferProcess**
> DomainPurchaseResponse purchaseTransferProcess(domain, domainTransferIn).xShopperId(xShopperId).execute();

Purchase and start or restart transfer process

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String authCode = "authCode_example"; // Authorization code from registrar for transferring a domain
    Consent consent = new Consent();
    String domain = "domain_example"; // Domain to transfer in
    Contact contactAdmin = new Contact();
    Contact contactBilling = new Contact();
    Contact contactRegistrant = new Contact();
    Contact contactTech = new Contact();
    Integer period = 1; // Can be more than 1 but no more than 10 years total including current registration length
    Boolean privacy = false; // Whether or not privacy has been requested
    Boolean renewAuto = true; // Whether or not the domain should be configured to automatically renew
    String xShopperId = "xShopperId_example"; // The Shopper to whom the domain should be transfered
    try {
      DomainPurchaseResponse result = client
              .v1
              .purchaseTransferProcess(authCode, consent, domain)
              .contactAdmin(contactAdmin)
              .contactBilling(contactBilling)
              .contactRegistrant(contactRegistrant)
              .contactTech(contactTech)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .xShopperId(xShopperId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrency());
      System.out.println(result.getItemCount());
      System.out.println(result.getOrderId());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#purchaseTransferProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainPurchaseResponse> response = client
              .v1
              .purchaseTransferProcess(authCode, consent, domain)
              .contactAdmin(contactAdmin)
              .contactBilling(contactBilling)
              .contactRegistrant(contactRegistrant)
              .contactTech(contactTech)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#purchaseTransferProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain to transfer in | |
| **domainTransferIn** | [**DomainTransferIn**](DomainTransferIn.md)| Details for domain transfer purchase | |
| **xShopperId** | **String**| The Shopper to whom the domain should be transfered | [optional] |

### Return type

[**DomainPurchaseResponse**](DomainPurchaseResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="renewDomain"></a>
# **renewDomain**
> DomainPurchaseResponse renewDomain(domain).xShopperId(xShopperId).domainRenew(domainRenew).execute();

Renew the specified Domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain to renew
    Integer period = 56; // Number of years to extend the Domain. Must not exceed maximum for TLD. When omitted, defaults to `period` specified during original purchase
    String xShopperId = "xShopperId_example"; // Shopper for whom Domain is to be renewed. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you're a Reseller, but purchased a Domain via http://www.godaddy.com
    try {
      DomainPurchaseResponse result = client
              .v1
              .renewDomain(domain)
              .period(period)
              .xShopperId(xShopperId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrency());
      System.out.println(result.getItemCount());
      System.out.println(result.getOrderId());
      System.out.println(result.getTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#renewDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainPurchaseResponse> response = client
              .v1
              .renewDomain(domain)
              .period(period)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#renewDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain to renew | |
| **xShopperId** | **String**| Shopper for whom Domain is to be renewed. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com | [optional] |
| **domainRenew** | [**DomainRenew**](DomainRenew.md)| Options for renewing existing Domain | [optional] |

### Return type

[**DomainPurchaseResponse**](DomainPurchaseResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="replaceDnsRecords"></a>
# **replaceDnsRecords**
> replaceDnsRecords(domain, dnSRecord).xShopperId(xShopperId).execute();

Replace all DNS Records for the specified Domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain whose DNS Records are to be replaced
    String xShopperId = "xShopperId_example"; // Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you're a Reseller, but purchased a Domain via http://www.godaddy.com
    try {
      client
              .v1
              .replaceDnsRecords(domain)
              .xShopperId(xShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#replaceDnsRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .replaceDnsRecords(domain)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#replaceDnsRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain whose DNS Records are to be replaced | |
| **dnSRecord** | [**List&lt;DNSRecord&gt;**](DNSRecord.md)| DNS Records to replace whatever currently exists | |
| **xShopperId** | **String**| Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="replaceDnsRecordsType"></a>
# **replaceDnsRecordsType**
> replaceDnsRecordsType(domain, type, dnSRecordCreateType).xShopperId(xShopperId).execute();

Replace all DNS Records for the specified Domain with the specified Type

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain whose DNS Records are to be replaced
    String type = "A"; // DNS Record Type for which DNS Records are to be replaced
    String xShopperId = "xShopperId_example"; // Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you're a Reseller, but purchased a Domain via http://www.godaddy.com
    try {
      client
              .v1
              .replaceDnsRecordsType(domain, type)
              .xShopperId(xShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#replaceDnsRecordsType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .replaceDnsRecordsType(domain, type)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#replaceDnsRecordsType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain whose DNS Records are to be replaced | |
| **type** | **String**| DNS Record Type for which DNS Records are to be replaced | [enum: A, AAAA, CNAME, MX, NS, SOA, SRV, TXT] |
| **dnSRecordCreateType** | [**List&lt;DNSRecordCreateType&gt;**](DNSRecordCreateType.md)| DNS Records to replace whatever currently exists | |
| **xShopperId** | **String**| Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="replaceDnsRecordsType_0"></a>
# **replaceDnsRecordsType_0**
> replaceDnsRecordsType_0(domain, type, name, dnSRecordCreateTypeName).xShopperId(xShopperId).execute();

Replace all DNS Records for the specified Domain with the specified Type and Name

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain whose DNS Records are to be replaced
    String type = "A"; // DNS Record Type for which DNS Records are to be replaced
    String name = "name_example"; // DNS Record Name for which DNS Records are to be replaced
    String xShopperId = "xShopperId_example"; // Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you're a Reseller, but purchased a Domain via http://www.godaddy.com
    try {
      client
              .v1
              .replaceDnsRecordsType_0(domain, type, name)
              .xShopperId(xShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#replaceDnsRecordsType_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .replaceDnsRecordsType_0(domain, type, name)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#replaceDnsRecordsType_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain whose DNS Records are to be replaced | |
| **type** | **String**| DNS Record Type for which DNS Records are to be replaced | [enum: A, AAAA, CNAME, MX, NS, SOA, SRV, TXT] |
| **name** | **String**| DNS Record Name for which DNS Records are to be replaced | |
| **dnSRecordCreateTypeName** | [**List&lt;DNSRecordCreateTypeName&gt;**](DNSRecordCreateTypeName.md)| DNS Records to replace whatever currently exists | |
| **xShopperId** | **String**| Shopper ID which owns the domain. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="resendContactEmailVerification"></a>
# **resendContactEmailVerification**
> resendContactEmailVerification(domain).xShopperId(xShopperId).execute();

Re-send Contact E-mail Verification for specified Domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain whose Contact E-mail should be verified.
    String xShopperId = "xShopperId_example"; // Shopper for whom domain contact e-mail should be verified. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you're a Reseller, but purchased a Domain via http://www.godaddy.com
    try {
      client
              .v1
              .resendContactEmailVerification(domain)
              .xShopperId(xShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#resendContactEmailVerification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .resendContactEmailVerification(domain)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#resendContactEmailVerification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain whose Contact E-mail should be verified. | |
| **xShopperId** | **String**| Shopper for whom domain contact e-mail should be verified. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="suggestAlternateDomains"></a>
# **suggestAlternateDomains**
> List&lt;DomainSuggestion&gt; suggestAlternateDomains().xShopperId(xShopperId).query(query).country(country).city(city).sources(sources).tlds(tlds).lengthMax(lengthMax).lengthMin(lengthMin).limit(limit).waitMs(waitMs).execute();

Suggest alternate Domain names based on a seed Domain, a set of keywords, or the shopper&#39;s purchase history

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String xShopperId = "xShopperId_example"; // Shopper ID for which the suggestions are being generated
    String query = "query_example"; // Domain name or set of keywords for which alternative domain names will be suggested
    String country = "AC"; // Two-letter ISO country code to be used as a hint for target region<br/><br/> NOTE: These are sample values, there are many <a href=\"http://www.iso.org/iso/country_codes.htm\">more</a>
    String city = "city_example"; // Name of city to be used as a hint for target region
    List<String> sources = Arrays.asList(); // Sources to be queried<br/><br/><ul> <li><strong>CC_TLD</strong> - Varies the TLD using Country Codes</li> <li><strong>EXTENSION</strong> - Varies the TLD</li> <li><strong>KEYWORD_SPIN</strong> - Identifies keywords and then rotates each one</li> <li><strong>PREMIUM</strong> - Includes variations with premium prices</li></ul>
    List<String> tlds = Arrays.asList(); // Top-level domains to be included in suggestions<br/><br/> NOTE: These are sample values, there are many <a href=\"http://www.godaddy.com/tlds/gtld.aspx#domain_search_form\">more</a>
    Integer lengthMax = 56; // Maximum length of second-level domain
    Integer lengthMin = 56; // Minimum length of second-level domain
    Integer limit = 56; // Maximum number of suggestions to return
    Integer waitMs = 1000; // Maximum amount of time, in milliseconds, to wait for responses If elapses, return the results compiled up to that point
    try {
      List<DomainSuggestion> result = client
              .v1
              .suggestAlternateDomains()
              .xShopperId(xShopperId)
              .query(query)
              .country(country)
              .city(city)
              .sources(sources)
              .tlds(tlds)
              .lengthMax(lengthMax)
              .lengthMin(lengthMin)
              .limit(limit)
              .waitMs(waitMs)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#suggestAlternateDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DomainSuggestion>> response = client
              .v1
              .suggestAlternateDomains()
              .xShopperId(xShopperId)
              .query(query)
              .country(country)
              .city(city)
              .sources(sources)
              .tlds(tlds)
              .lengthMax(lengthMax)
              .lengthMin(lengthMin)
              .limit(limit)
              .waitMs(waitMs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#suggestAlternateDomains");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xShopperId** | **String**| Shopper ID for which the suggestions are being generated | [optional] |
| **query** | **String**| Domain name or set of keywords for which alternative domain names will be suggested | [optional] |
| **country** | **String**| Two-letter ISO country code to be used as a hint for target region&lt;br/&gt;&lt;br/&gt; NOTE: These are sample values, there are many &lt;a href&#x3D;\&quot;http://www.iso.org/iso/country_codes.htm\&quot;&gt;more&lt;/a&gt; | [optional] [enum: AC, AD, AE, AF, AG, AI, AL, AM, AO, AQ, AR, AS, AT, AU, AW, AX, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BM, BN, BO, BQ, BR, BS, BT, BV, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CV, CW, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, EH, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GF, GG, GH, GI, GL, GM, GN, GP, GQ, GR, GS, GT, GU, GW, GY, HK, HM, HN, HR, HT, HU, ID, IE, IL, IM, IN, IO, IQ, IS, IT, JE, JM, JO, JP, KE, KG, KH, KI, KM, KN, KR, KV, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MG, MH, MK, ML, MM, MN, MO, MP, MQ, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NF, NG, NI, NL, false, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PS, PT, PW, PY, QA, RE, RO, RS, RU, RW, SA, SB, SC, SE, SG, SH, SI, SJ, SK, SL, SM, SN, SO, SR, ST, SV, SX, SZ, TC, TD, TF, TG, TH, TJ, TK, TL, TM, TN, TO, TP, TR, TT, TV, TW, TZ, UA, UG, UM, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW] |
| **city** | **String**| Name of city to be used as a hint for target region | [optional] |
| **sources** | [**List&lt;String&gt;**](String.md)| Sources to be queried&lt;br/&gt;&lt;br/&gt;&lt;ul&gt; &lt;li&gt;&lt;strong&gt;CC_TLD&lt;/strong&gt; - Varies the TLD using Country Codes&lt;/li&gt; &lt;li&gt;&lt;strong&gt;EXTENSION&lt;/strong&gt; - Varies the TLD&lt;/li&gt; &lt;li&gt;&lt;strong&gt;KEYWORD_SPIN&lt;/strong&gt; - Identifies keywords and then rotates each one&lt;/li&gt; &lt;li&gt;&lt;strong&gt;PREMIUM&lt;/strong&gt; - Includes variations with premium prices&lt;/li&gt;&lt;/ul&gt; | [optional] [enum: CC_TLD, EXTENSION, KEYWORD_SPIN, PREMIUM, cctld, extension, keywordspin, premium] |
| **tlds** | [**List&lt;String&gt;**](String.md)| Top-level domains to be included in suggestions&lt;br/&gt;&lt;br/&gt; NOTE: These are sample values, there are many &lt;a href&#x3D;\&quot;http://www.godaddy.com/tlds/gtld.aspx#domain_search_form\&quot;&gt;more&lt;/a&gt; | [optional] |
| **lengthMax** | **Integer**| Maximum length of second-level domain | [optional] |
| **lengthMin** | **Integer**| Minimum length of second-level domain | [optional] |
| **limit** | **Integer**| Maximum number of suggestions to return | [optional] |
| **waitMs** | **Integer**| Maximum amount of time, in milliseconds, to wait for responses If elapses, return the results compiled up to that point | [optional] [default to 1000] |

### Return type

[**List&lt;DomainSuggestion&gt;**](DomainSuggestion.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="updateDomainContacts"></a>
# **updateDomainContacts**
> updateDomainContacts(domain, domainContacts).xShopperId(xShopperId).execute();

Update domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    Contact contactRegistrant = new Contact();
    String domain = "domain_example"; // Domain whose Contacts are to be updated.
    Contact contactAdmin = new Contact();
    Contact contactBilling = new Contact();
    Contact contactTech = new Contact();
    String xShopperId = "xShopperId_example"; // Shopper for whom domain contacts are to be updated. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you're a Reseller, but purchased a Domain via http://www.godaddy.com
    try {
      client
              .v1
              .updateDomainContacts(contactRegistrant, domain)
              .contactAdmin(contactAdmin)
              .contactBilling(contactBilling)
              .contactTech(contactTech)
              .xShopperId(xShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#updateDomainContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .updateDomainContacts(contactRegistrant, domain)
              .contactAdmin(contactAdmin)
              .contactBilling(contactBilling)
              .contactTech(contactTech)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#updateDomainContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain whose Contacts are to be updated. | |
| **domainContacts** | [**DomainContacts**](DomainContacts.md)| Changes to apply to existing Contacts | |
| **xShopperId** | **String**| Shopper for whom domain contacts are to be updated. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | No response was specified |  -  |
| **204** | Request was successful |  -  |

<a name="updateDomainDetails"></a>
# **updateDomainDetails**
> updateDomainDetails(domain, domainUpdate).xShopperId(xShopperId).execute();

Update details for the specified Domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    String domain = "domain_example"; // Domain whose details are to be updated
    ConsentDomainUpdate consent = new ConsentDomainUpdate();
    Boolean exposeWhois = true; // Whether or not the domain contact details should be shown in the WHOIS
    Boolean locked = true; // Whether or not the domain should be locked to prevent transfers
    List<Object> nameServers = Arrays.asList(null); // Fully-qualified domain names for Name Servers to associate with the domain
    Boolean renewAuto = true; // Whether or not the domain should be configured to automatically renew
    String subaccountId = "subaccountId_example"; // Reseller subaccount shopperid who can manage the domain
    String xShopperId = "xShopperId_example"; // Shopper for whom Domain is to be updated. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you're a Reseller, but purchased a Domain via http://www.godaddy.com
    try {
      client
              .v1
              .updateDomainDetails(domain)
              .consent(consent)
              .exposeWhois(exposeWhois)
              .locked(locked)
              .nameServers(nameServers)
              .renewAuto(renewAuto)
              .subaccountId(subaccountId)
              .xShopperId(xShopperId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#updateDomainDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .updateDomainDetails(domain)
              .consent(consent)
              .exposeWhois(exposeWhois)
              .locked(locked)
              .nameServers(nameServers)
              .renewAuto(renewAuto)
              .subaccountId(subaccountId)
              .xShopperId(xShopperId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#updateDomainDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domain** | **String**| Domain whose details are to be updated | |
| **domainUpdate** | [**DomainUpdate**](DomainUpdate.md)| Changes to apply to existing Domain | |
| **xShopperId** | **String**| Shopper for whom Domain is to be updated. NOTE: This is only required if you are a Reseller managing a domain purchased outside the scope of your reseller account. For instance, if you&#39;re a Reseller, but purchased a Domain via http://www.godaddy.com | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="validateDomainContacts"></a>
# **validateDomainContacts**
> validateDomainContacts(domainsContactsBulk).xPrivateLabelId(xPrivateLabelId).marketId(marketId).execute();

Validate the request body using the Domain Contact Validation Schema for specified domains.

All contacts specified in request will be validated against all domains specifed in \&quot;domains\&quot;. As an alternative, you can also pass in tlds, with the exception of &#x60;uk&#x60;, which requires full domain names

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    List<String> domains = Arrays.asList(); // An array of domain names to be validated against. Alternatively, you can specify the extracted tlds. However, full domain names are required if the tld is `uk`
    Contact contactAdmin = new Contact();
    Contact contactBilling = new Contact();
    Contact contactPresence = new Contact();
    Contact contactRegistrant = new Contact();
    Contact contactTech = new Contact();
    String entityType = "ABORIGINAL"; // Canadian Presence Requirement (CA)
    Integer xPrivateLabelId = 1; // PrivateLabelId to operate as, if different from JWT
    String marketId = "en-US"; // MarketId in which the request is being made, and for which responses should be localized
    try {
      client
              .v1
              .validateDomainContacts(domains)
              .contactAdmin(contactAdmin)
              .contactBilling(contactBilling)
              .contactPresence(contactPresence)
              .contactRegistrant(contactRegistrant)
              .contactTech(contactTech)
              .entityType(entityType)
              .xPrivateLabelId(xPrivateLabelId)
              .marketId(marketId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#validateDomainContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .validateDomainContacts(domains)
              .contactAdmin(contactAdmin)
              .contactBilling(contactBilling)
              .contactPresence(contactPresence)
              .contactRegistrant(contactRegistrant)
              .contactTech(contactTech)
              .entityType(entityType)
              .xPrivateLabelId(xPrivateLabelId)
              .marketId(marketId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#validateDomainContacts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainsContactsBulk** | [**DomainsContactsBulk**](DomainsContactsBulk.md)| An instance document expected for domains contacts validation | |
| **xPrivateLabelId** | **Integer**| PrivateLabelId to operate as, if different from JWT | [optional] [default to 1] |
| **marketId** | **String**| MarketId in which the request is being made, and for which responses should be localized | [optional] [default to en-US] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | No response was specified |  -  |
| **204** | Request was successful |  -  |

<a name="validateDomainPurchase"></a>
# **validateDomainPurchase**
> validateDomainPurchase(domainPurchase).execute();

Validate the request body using the Domain Purchase Schema for the specified TLD

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.V1Api;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://api.ote-godaddy.com";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiSecret  = "YOUR API KEY";
    GoDaddy client = new GoDaddy(configuration);
    Consent consent = new Consent();
    String domain = "domain_example"; // For internationalized domain names with non-ascii characters, the domain name is converted to punycode before format and pattern validation rules are checked
    Contact contactAdmin = new Contact();
    Contact contactBilling = new Contact();
    Contact contactRegistrant = new Contact();
    Contact contactTech = new Contact();
    List<String> nameServers = Arrays.asList();
    Integer period = 1;
    Boolean privacy = false;
    Boolean renewAuto = true;
    try {
      client
              .v1
              .validateDomainPurchase(consent, domain)
              .contactAdmin(contactAdmin)
              .contactBilling(contactBilling)
              .contactRegistrant(contactRegistrant)
              .contactTech(contactTech)
              .nameServers(nameServers)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#validateDomainPurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .v1
              .validateDomainPurchase(consent, domain)
              .contactAdmin(contactAdmin)
              .contactBilling(contactBilling)
              .contactRegistrant(contactRegistrant)
              .contactTech(contactTech)
              .nameServers(nameServers)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling V1Api#validateDomainPurchase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **domainPurchase** | [**DomainPurchase**](DomainPurchase.md)| An instance document expected to match the JSON schema returned by &#x60;./schema/{tld}&#x60; | |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json, application/xml, text/xml
 - **Accept**: application/json, application/javascript, application/xml, text/javascript, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

