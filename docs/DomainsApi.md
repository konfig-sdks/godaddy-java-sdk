# DomainsApi

All URIs are relative to *http://api.ote-godaddy.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptTransferIn**](DomainsApi.md#acceptTransferIn) | **POST** /v2/customers/{customerId}/domains/{domain}/transferInAccept | Accepts the transfer in |
| [**acceptTransferOut**](DomainsApi.md#acceptTransferOut) | **POST** /v2/customers/{customerId}/domains/{domain}/transferOutAccept | Accept transfer out |
| [**cancelForwardingRequest**](DomainsApi.md#cancelForwardingRequest) | **DELETE** /v2/customers/{customerId}/domains/forwards/{fqdn} | Submit a forwarding cancellation request for the given fqdn |
| [**cancelTransferIn**](DomainsApi.md#cancelTransferIn) | **POST** /v2/customers/{customerId}/domains/{domain}/transferInCancel | Cancels the transfer in |
| [**createForwardingConfiguration**](DomainsApi.md#createForwardingConfiguration) | **POST** /v2/customers/{customerId}/domains/forwards/{fqdn} | Create a new forwarding configuration for the given FQDN |
| [**getDetails**](DomainsApi.md#getDetails) | **GET** /v2/customers/{customerId}/domains/{domain} | Retrieve details for the specified Domain |
| [**getForwardingInfo**](DomainsApi.md#getForwardingInfo) | **GET** /v2/customers/{customerId}/domains/forwards/{fqdn} | Retrieve the forwarding information for the given fqdn |
| [**getRegisterSchema**](DomainsApi.md#getRegisterSchema) | **GET** /v2/customers/{customerId}/domains/register/schema/{tld} | Retrieve the schema to be submitted when registering a Domain for the specified TLD |
| [**getUpcomingMaintenanceDetails**](DomainsApi.md#getUpcomingMaintenanceDetails) | **GET** /v2/domains/maintenances/{maintenanceId} | Retrieve the details for an upcoming system Maintenances |
| [**getUpcomingMaintenancesList**](DomainsApi.md#getUpcomingMaintenancesList) | **GET** /v2/domains/maintenances | Retrieve a list of upcoming system Maintenances |
| [**initiateTransferOut**](DomainsApi.md#initiateTransferOut) | **POST** /v2/customers/{customerId}/domains/{domain}/transferOut | Initiate transfer out to another registrar for a .uk domain. |
| [**modifyForwardingInfo**](DomainsApi.md#modifyForwardingInfo) | **PUT** /v2/customers/{customerId}/domains/forwards/{fqdn} | Modify the forwarding information for the given fqdn |
| [**purchaseRegisterDomain**](DomainsApi.md#purchaseRegisterDomain) | **POST** /v2/customers/{customerId}/domains/register | Purchase and register the specified Domain |
| [**purchaseTransferProcess**](DomainsApi.md#purchaseTransferProcess) | **POST** /v2/customers/{customerId}/domains/{domain}/transfer | Purchase and start or restart transfer process |
| [**redeemDomainRestore**](DomainsApi.md#redeemDomainRestore) | **POST** /v2/customers/{customerId}/domains/{domain}/redeem | Purchase a restore for the given domain to bring it out of redemption |
| [**rejectTransferOut**](DomainsApi.md#rejectTransferOut) | **POST** /v2/customers/{customerId}/domains/{domain}/transferOutReject | Reject transfer out |
| [**renewDomain**](DomainsApi.md#renewDomain) | **POST** /v2/customers/{customerId}/domains/{domain}/renew | Renew the specified Domain |
| [**restartTransferIn**](DomainsApi.md#restartTransferIn) | **POST** /v2/customers/{customerId}/domains/{domain}/transferInRestart | Restarts transfer in request from the beginning |
| [**retryTransferInProcess**](DomainsApi.md#retryTransferInProcess) | **POST** /v2/customers/{customerId}/domains/{domain}/transferInRetry | Retries the current transfer in request with supplied Authorization code |
| [**validateDomainRegistration**](DomainsApi.md#validateDomainRegistration) | **POST** /v2/customers/{customerId}/domains/register/validate | Validate the request body using the Domain Registration Schema for the specified TLD |


<a name="acceptTransferIn"></a>
# **acceptTransferIn**
> acceptTransferIn(customerId, domain, domainTransferAuthCode).xRequestId(xRequestId).execute();

Accepts the transfer in

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String authCode = "authCode_example"; // Authorization code for transferring the Domain
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain to accept the transfer in for
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .acceptTransferIn(authCode, customerId, domain)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#acceptTransferIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .acceptTransferIn(authCode, customerId, domain)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#acceptTransferIn");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain to accept the transfer in for | |
| **domainTransferAuthCode** | [**DomainTransferAuthCode**](DomainTransferAuthCode.md)| An Authorization code for transferring the Domain | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/TRANSFER_IN_ACCEPT to poll status |  -  |

<a name="acceptTransferOut"></a>
# **acceptTransferOut**
> acceptTransferOut(customerId, domain).xRequestId(xRequestId).execute();

Accept transfer out

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain to accept the transfer out for
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .acceptTransferOut(customerId, domain)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#acceptTransferOut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .acceptTransferOut(customerId, domain)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#acceptTransferOut");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain to accept the transfer out for | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/TRANSFER_OUT_ACCEPT to poll status |  -  |

<a name="cancelForwardingRequest"></a>
# **cancelForwardingRequest**
> cancelForwardingRequest(customerId, fqdn).execute();

Submit a forwarding cancellation request for the given fqdn

&lt;strong&gt;Notes:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;**shopperId** is **not the same** as **customerId**.  **shopperId** is a number of max length 10 digits (*ex:* 1234567890) whereas **customerId** is a UUIDv4 (*ex:* 295e3bc3-b3b9-4d95-aae5-ede41a994d13)&lt;/li&gt;&lt;/ul&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String fqdn = "fqdn_example"; // The fully qualified domain name whose forwarding details are to be deleted.
    try {
      client
              .domains
              .cancelForwardingRequest(customerId, fqdn)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#cancelForwardingRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .cancelForwardingRequest(customerId, fqdn)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#cancelForwardingRequest");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **fqdn** | **String**| The fully qualified domain name whose forwarding details are to be deleted. | |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request was successful |  -  |

<a name="cancelTransferIn"></a>
# **cancelTransferIn**
> cancelTransferIn(customerId, domain).xRequestId(xRequestId).execute();

Cancels the transfer in

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain to cancel the transfer in for
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .cancelTransferIn(customerId, domain)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#cancelTransferIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .cancelTransferIn(customerId, domain)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#cancelTransferIn");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain to cancel the transfer in for | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/TRANSFER_IN_CANCEL to poll status |  -  |

<a name="createForwardingConfiguration"></a>
# **createForwardingConfiguration**
> createForwardingConfiguration(customerId, fqdn, domainForwardingCreate).execute();

Create a new forwarding configuration for the given FQDN

&lt;strong&gt;Notes:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;**shopperId** is **not the same** as **customerId**.  **shopperId** is a number of max length 10 digits (*ex:* 1234567890) whereas **customerId** is a UUIDv4 (*ex:* 295e3bc3-b3b9-4d95-aae5-ede41a994d13)&lt;/li&gt;&lt;/ul&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String type = "MASKED"; // The type of fowarding to implement<br/><ul><li><strong style='margin-left: 12px;'>MASKED</strong> - Prevents the forwarded domain or subdomain URL from displaying in the browser's address bar.</li><li><strong style='margin-left: 12px;'>REDIRECT_PERMANENT*</strong> - Redirects to the url you specified in the forwardTo field using a `301 Moved Permanently` HTTP response. The HTTP 301 response code tells user-agents (including search engines) that the location has permanently moved.</li><li><strong style='margin-left: 12px;'>REDIRECT_TEMPORARY</strong> - Redirects to the url you specified in the forwardTo field using a `302 Found` HTTP response. The HTTP 302 response code tells user-agents (including search engines) that the location has temporarily moved.</li></ul>
    String url = "url_example"; // Forwards http(s) traffic to this destination url (ex. http://www.somedomain.com/)
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your own customer id.
    String fqdn = "fqdn_example"; // The fully qualified domain name whose forwarding details are to be modified.
    DomainForwardingMask mask = new DomainForwardingMask();
    try {
      client
              .domains
              .createForwardingConfiguration(type, url, customerId, fqdn)
              .mask(mask)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#createForwardingConfiguration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .createForwardingConfiguration(type, url, customerId, fqdn)
              .mask(mask)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#createForwardingConfiguration");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your own customer id. | |
| **fqdn** | **String**| The fully qualified domain name whose forwarding details are to be modified. | |
| **domainForwardingCreate** | [**DomainForwardingCreate**](DomainForwardingCreate.md)| Domain forwarding rule to create for the specified fqdn | |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request was successful |  -  |

<a name="getDetails"></a>
# **getDetails**
> DomainDetailV2 getDetails(customerId, domain).xRequestId(xRequestId).includes(includes).execute();

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
import com.konfigthis.client.api.DomainsApi;
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
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain name whose details are to be retrieved
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    List<String> includes = Arrays.asList(); // Optional details to be included in the response
    try {
      DomainDetailV2 result = client
              .domains
              .getDetails(customerId, domain)
              .xRequestId(xRequestId)
              .includes(includes)
              .execute();
      System.out.println(result);
      System.out.println(result.getActions());
      System.out.println(result.getAuthCode());
      System.out.println(result.getContacts());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getDnssecRecords());
      System.out.println(result.getDomain());
      System.out.println(result.getDomainId());
      System.out.println(result.getExpirationProtected());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getHoldRegistrar());
      System.out.println(result.getHostnames());
      System.out.println(result.getLocked());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getNameServers());
      System.out.println(result.getPrivacy());
      System.out.println(result.getRegistrarCreatedAt());
      System.out.println(result.getRegistryStatusCodes());
      System.out.println(result.getRenewAuto());
      System.out.println(result.getRenewDeadline());
      System.out.println(result.getRenewal());
      System.out.println(result.getStatus());
      System.out.println(result.getSubaccountId());
      System.out.println(result.getTransferAwayEligibleAt());
      System.out.println(result.getTransferProtected());
      System.out.println(result.getVerifications());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainDetailV2> response = client
              .domains
              .getDetails(customerId, domain)
              .xRequestId(xRequestId)
              .includes(includes)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getDetails");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain name whose details are to be retrieved | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |
| **includes** | [**List&lt;String&gt;**](String.md)| Optional details to be included in the response | [optional] [enum: actions, contacts, dnssecRecords, registryStatusCodes] |

### Return type

[**DomainDetailV2**](DomainDetailV2.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |
| **203** | Request was partially successful, but actions, contacts, and/or verifications may not be included. |  -  |

<a name="getForwardingInfo"></a>
# **getForwardingInfo**
> List&lt;DomainForwarding&gt; getForwardingInfo(customerId, fqdn).includeSubs(includeSubs).execute();

Retrieve the forwarding information for the given fqdn

&lt;strong&gt;Notes:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;**shopperId** is **not the same** as **customerId**.  **shopperId** is a number of max length 10 digits (*ex:* 1234567890) whereas **customerId** is a UUIDv4 (*ex:* 295e3bc3-b3b9-4d95-aae5-ede41a994d13)&lt;/li&gt;&lt;/ul&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String fqdn = "fqdn_example"; // The fully qualified domain name whose forwarding details are to be retrieved.
    Boolean includeSubs = true; // Optionally include all sub domains if the fqdn specified is a domain and not a sub domain.
    try {
      List<DomainForwarding> result = client
              .domains
              .getForwardingInfo(customerId, fqdn)
              .includeSubs(includeSubs)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getForwardingInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DomainForwarding>> response = client
              .domains
              .getForwardingInfo(customerId, fqdn)
              .includeSubs(includeSubs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getForwardingInfo");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **fqdn** | **String**| The fully qualified domain name whose forwarding details are to be retrieved. | |
| **includeSubs** | **Boolean**| Optionally include all sub domains if the fqdn specified is a domain and not a sub domain. | [optional] |

### Return type

[**List&lt;DomainForwarding&gt;**](DomainForwarding.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="getRegisterSchema"></a>
# **getRegisterSchema**
> JsonSchema getRegisterSchema(customerId, tld).xRequestId(xRequestId).execute();

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
import com.konfigthis.client.api.DomainsApi;
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
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String tld = "tld_example"; // The Top-Level Domain whose schema should be retrieved
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      JsonSchema result = client
              .domains
              .getRegisterSchema(customerId, tld)
              .xRequestId(xRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getModels());
      System.out.println(result.getProperties());
      System.out.println(result.getRequired());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getRegisterSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonSchema> response = client
              .domains
              .getRegisterSchema(customerId, tld)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getRegisterSchema");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **tld** | **String**| The Top-Level Domain whose schema should be retrieved | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

[**JsonSchema**](JsonSchema.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="getUpcomingMaintenanceDetails"></a>
# **getUpcomingMaintenanceDetails**
> MaintenanceDetail getUpcomingMaintenanceDetails(maintenanceId).xRequestId(xRequestId).execute();

Retrieve the details for an upcoming system Maintenances

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String maintenanceId = "maintenanceId_example"; // The identifier for the system maintenance
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      MaintenanceDetail result = client
              .domains
              .getUpcomingMaintenanceDetails(maintenanceId)
              .xRequestId(xRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSummary());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getEndsAt());
      System.out.println(result.getEnvironment());
      System.out.println(result.getMaintenanceId());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getReason());
      System.out.println(result.getStartsAt());
      System.out.println(result.getStatus());
      System.out.println(result.getSystems());
      System.out.println(result.getTlds());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getUpcomingMaintenanceDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MaintenanceDetail> response = client
              .domains
              .getUpcomingMaintenanceDetails(maintenanceId)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getUpcomingMaintenanceDetails");
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
| **maintenanceId** | **String**| The identifier for the system maintenance | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

[**MaintenanceDetail**](MaintenanceDetail.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="getUpcomingMaintenancesList"></a>
# **getUpcomingMaintenancesList**
> Maintenance getUpcomingMaintenancesList().xRequestId(xRequestId).status(status).modifiedAtAfter(modifiedAtAfter).startsAtAfter(startsAtAfter).limit(limit).execute();

Retrieve a list of upcoming system Maintenances

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    String status = "ACTIVE"; // Only include results with the selected `status` value.  Returns all results if omitted<br/><ul><li><strong style='margin-left: 12px;'>ACTIVE</strong> - The upcoming maintenance is active.</li><li><strong style='margin-left: 12px;'>CANCELLED</strong> - The upcoming maintenance has been cancelled.</li></ul>
    String modifiedAtAfter = "modifiedAtAfter_example"; // Only include results with `modifiedAt` after the supplied date
    String startsAtAfter = "startsAtAfter_example"; // Only include results with `startsAt` after the supplied date
    Integer limit = 100; // Maximum number of results to return
    try {
      Maintenance result = client
              .domains
              .getUpcomingMaintenancesList()
              .xRequestId(xRequestId)
              .status(status)
              .modifiedAtAfter(modifiedAtAfter)
              .startsAtAfter(startsAtAfter)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getSummary());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getEndsAt());
      System.out.println(result.getEnvironment());
      System.out.println(result.getMaintenanceId());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getReason());
      System.out.println(result.getStartsAt());
      System.out.println(result.getStatus());
      System.out.println(result.getTlds());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getUpcomingMaintenancesList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Maintenance> response = client
              .domains
              .getUpcomingMaintenancesList()
              .xRequestId(xRequestId)
              .status(status)
              .modifiedAtAfter(modifiedAtAfter)
              .startsAtAfter(startsAtAfter)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#getUpcomingMaintenancesList");
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
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |
| **status** | **String**| Only include results with the selected &#x60;status&#x60; value.  Returns all results if omitted&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ACTIVE&lt;/strong&gt; - The upcoming maintenance is active.&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;CANCELLED&lt;/strong&gt; - The upcoming maintenance has been cancelled.&lt;/li&gt;&lt;/ul&gt; | [optional] [enum: ACTIVE, CANCELLED] |
| **modifiedAtAfter** | **String**| Only include results with &#x60;modifiedAt&#x60; after the supplied date | [optional] |
| **startsAtAfter** | **String**| Only include results with &#x60;startsAt&#x60; after the supplied date | [optional] |
| **limit** | **Integer**| Maximum number of results to return | [optional] [default to 100] |

### Return type

[**Maintenance**](Maintenance.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="initiateTransferOut"></a>
# **initiateTransferOut**
> initiateTransferOut(customerId, domain, registrar).xRequestId(xRequestId).execute();

Initiate transfer out to another registrar for a .uk domain.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain to initiate the transfer out for
    String registrar = "registrar_example"; // Registrar tag to push transfer to
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .initiateTransferOut(customerId, domain, registrar)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#initiateTransferOut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .initiateTransferOut(customerId, domain, registrar)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#initiateTransferOut");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain to initiate the transfer out for | |
| **registrar** | **String**| Registrar tag to push transfer to | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/TRANSFER_OUT_REQUESTED to poll status |  -  |

<a name="modifyForwardingInfo"></a>
# **modifyForwardingInfo**
> modifyForwardingInfo(customerId, fqdn, domainForwardingCreate).execute();

Modify the forwarding information for the given fqdn

&lt;strong&gt;Notes:&lt;/strong&gt;&lt;ul&gt;&lt;li&gt;**shopperId** is **not the same** as **customerId**.  **shopperId** is a number of max length 10 digits (*ex:* 1234567890) whereas **customerId** is a UUIDv4 (*ex:* 295e3bc3-b3b9-4d95-aae5-ede41a994d13)&lt;/li&gt;&lt;/ul&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String type = "MASKED"; // The type of fowarding to implement<br/><ul><li><strong style='margin-left: 12px;'>MASKED</strong> - Prevents the forwarded domain or subdomain URL from displaying in the browser's address bar.</li><li><strong style='margin-left: 12px;'>REDIRECT_PERMANENT*</strong> - Redirects to the url you specified in the forwardTo field using a `301 Moved Permanently` HTTP response. The HTTP 301 response code tells user-agents (including search engines) that the location has permanently moved.</li><li><strong style='margin-left: 12px;'>REDIRECT_TEMPORARY</strong> - Redirects to the url you specified in the forwardTo field using a `302 Found` HTTP response. The HTTP 302 response code tells user-agents (including search engines) that the location has temporarily moved.</li></ul>
    String url = "url_example"; // Forwards http(s) traffic to this destination url (ex. http://www.somedomain.com/)
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String fqdn = "fqdn_example"; // The fully qualified domain name whose forwarding details are to be modified.
    DomainForwardingMask mask = new DomainForwardingMask();
    try {
      client
              .domains
              .modifyForwardingInfo(type, url, customerId, fqdn)
              .mask(mask)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#modifyForwardingInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .modifyForwardingInfo(type, url, customerId, fqdn)
              .mask(mask)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#modifyForwardingInfo");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **fqdn** | **String**| The fully qualified domain name whose forwarding details are to be modified. | |
| **domainForwardingCreate** | [**DomainForwardingCreate**](DomainForwardingCreate.md)| Domain forwarding rule to create or replace on the fqdn | |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request was successful |  -  |

<a name="purchaseRegisterDomain"></a>
# **purchaseRegisterDomain**
> purchaseRegisterDomain(customerId, domainPurchaseV2).xRequestId(xRequestId).execute();

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
import com.konfigthis.client.api.DomainsApi;
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
    ConsentV2 consent = new ConsentV2();
    String domain = "domain_example"; // For internationalized domain names with non-ascii characters, the domain name is converted to punycode before format and pattern validation rules are checked
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    DomainContactsCreateV2 contacts = new DomainContactsCreateV2();
    Object metadata = null; // The domain eligibility data fields as specified by GET /v2/customers/{customerId}/domains/register/schema/{tld}
    List<String> nameServers = Arrays.asList();
    Integer period = 1;
    Boolean privacy = false;
    Boolean renewAuto = true;
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .purchaseRegisterDomain(consent, domain, customerId)
              .contacts(contacts)
              .metadata(metadata)
              .nameServers(nameServers)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#purchaseRegisterDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .purchaseRegisterDomain(consent, domain, customerId)
              .contacts(contacts)
              .metadata(metadata)
              .nameServers(nameServers)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#purchaseRegisterDomain");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domainPurchaseV2** | [**DomainPurchaseV2**](DomainPurchaseV2.md)| An instance document expected to match the JSON schema returned by &#x60;./schema/{tld}&#x60; | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/REGISTER to poll status |  -  |

<a name="purchaseTransferProcess"></a>
# **purchaseTransferProcess**
> purchaseTransferProcess(customerId, domain, domainTransferInV2).xRequestId(xRequestId).execute();

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
import com.konfigthis.client.api.DomainsApi;
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
    ConsentV2 consent = new ConsentV2();
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain to transfer in
    DomainContactsCreateV2 contacts = new DomainContactsCreateV2();
    String identityDocumentId = "identityDocumentId_example"; // Unique identifier of the identify document that the user wants to associate with the domain being transferred in. This is required only if the gaining registry has a requirement for an approved identity document
    Object metadata = null; // The domain eligibility data fields as specified by GET /v2/customers/{customerId}/domains/register/schema/{tld}
    Integer period = 1; // Can be more than 1 but no more than 10 years total including current registration length
    Boolean privacy = false; // Whether or not privacy has been requested
    Boolean renewAuto = true; // Whether or not the domain should be configured to automatically renew
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .purchaseTransferProcess(authCode, consent, customerId, domain)
              .contacts(contacts)
              .identityDocumentId(identityDocumentId)
              .metadata(metadata)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#purchaseTransferProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .purchaseTransferProcess(authCode, consent, customerId, domain)
              .contacts(contacts)
              .identityDocumentId(identityDocumentId)
              .metadata(metadata)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#purchaseTransferProcess");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain to transfer in | |
| **domainTransferInV2** | [**DomainTransferInV2**](DomainTransferInV2.md)| Details for domain transfer purchase | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/TRANSFER to poll status |  -  |

<a name="redeemDomainRestore"></a>
# **redeemDomainRestore**
> redeemDomainRestore(customerId, domain).xRequestId(xRequestId).domainRedeemV2(domainRedeemV2).execute();

Purchase a restore for the given domain to bring it out of redemption

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    ConsentRedemption consent = new ConsentRedemption();
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain to request redeem for
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .redeemDomainRestore(consent, customerId, domain)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#redeemDomainRestore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .redeemDomainRestore(consent, customerId, domain)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#redeemDomainRestore");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain to request redeem for | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |
| **domainRedeemV2** | [**DomainRedeemV2**](DomainRedeemV2.md)| Options for redeeming existing Domain | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/REDEEM to poll status |  -  |

<a name="rejectTransferOut"></a>
# **rejectTransferOut**
> rejectTransferOut(customerId, domain).xRequestId(xRequestId).reason(reason).execute();

Reject transfer out

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain to reject the transfer out for
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    String reason = "EVIDENCE_OF_FRAUD"; // Transfer out reject reason
    try {
      client
              .domains
              .rejectTransferOut(customerId, domain)
              .xRequestId(xRequestId)
              .reason(reason)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#rejectTransferOut");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .rejectTransferOut(customerId, domain)
              .xRequestId(xRequestId)
              .reason(reason)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#rejectTransferOut");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain to reject the transfer out for | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |
| **reason** | **String**| Transfer out reject reason | [optional] [enum: EVIDENCE_OF_FRAUD, URDP_ACTION, COURT_ORDER, DISPUTE_OVER_IDENTITY, NO_PAYMENT_FOR_PREVIOUS_REGISTRATION_PERIOD, WRITTEN_OBJECTION, TRANSFERRED_WITHIN_SIXTY_DAYS] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/TRANSFER_OUT_REJECT to poll status |  -  |

<a name="renewDomain"></a>
# **renewDomain**
> renewDomain(customerId, domain, domainRenewV2).xRequestId(xRequestId).execute();

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
import com.konfigthis.client.api.DomainsApi;
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
    ConsentRenew consent = new ConsentRenew();
    String expires = "expires_example"; // Current date when this domain will expire
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain to be renewed
    Integer period = 56; // Number of years to extend the Domain. Must not exceed maximum for TLD. When omitted, defaults to `period` specified during original purchase
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .renewDomain(consent, expires, customerId, domain)
              .period(period)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#renewDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .renewDomain(consent, expires, customerId, domain)
              .period(period)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#renewDomain");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain to be renewed | |
| **domainRenewV2** | [**DomainRenewV2**](DomainRenewV2.md)| Options for renewing existing Domain | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/RENEW to poll status |  -  |

<a name="restartTransferIn"></a>
# **restartTransferIn**
> restartTransferIn(customerId, domain).xRequestId(xRequestId).execute();

Restarts transfer in request from the beginning

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain to restart the transfer in
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .restartTransferIn(customerId, domain)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#restartTransferIn");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .restartTransferIn(customerId, domain)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#restartTransferIn");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain to restart the transfer in | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/TRANSFER_IN_RESTART to poll status |  -  |

<a name="retryTransferInProcess"></a>
# **retryTransferInProcess**
> retryTransferInProcess(customerId, domain, domainTransferAuthCode).xRequestId(xRequestId).execute();

Retries the current transfer in request with supplied Authorization code

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    String authCode = "authCode_example"; // Authorization code for transferring the Domain
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    String domain = "domain_example"; // Domain to retry the transfer in
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .retryTransferInProcess(authCode, customerId, domain)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#retryTransferInProcess");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .retryTransferInProcess(authCode, customerId, domain)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#retryTransferInProcess");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domain** | **String**| Domain to retry the transfer in | |
| **domainTransferAuthCode** | [**DomainTransferAuthCode**](DomainTransferAuthCode.md)| An Authorization code for transferring the Domain | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Accepted. You may use GET /v2/customers/{customerId}/domains/{domain}/actions/TRANSFER_IN_RETRY to poll status |  -  |

<a name="validateDomainRegistration"></a>
# **validateDomainRegistration**
> validateDomainRegistration(customerId, domainPurchaseV2).xRequestId(xRequestId).execute();

Validate the request body using the Domain Registration Schema for the specified TLD

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DomainsApi;
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
    ConsentV2 consent = new ConsentV2();
    String domain = "domain_example"; // For internationalized domain names with non-ascii characters, the domain name is converted to punycode before format and pattern validation rules are checked
    String customerId = "customerId_example"; // The Customer identifier<br/> Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you're operating on behalf of; otherwise use your shopper id.
    DomainContactsCreateV2 contacts = new DomainContactsCreateV2();
    Object metadata = null; // The domain eligibility data fields as specified by GET /v2/customers/{customerId}/domains/register/schema/{tld}
    List<String> nameServers = Arrays.asList();
    Integer period = 1;
    Boolean privacy = false;
    Boolean renewAuto = true;
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .domains
              .validateDomainRegistration(consent, domain, customerId)
              .contacts(contacts)
              .metadata(metadata)
              .nameServers(nameServers)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#validateDomainRegistration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .domains
              .validateDomainRegistration(consent, domain, customerId)
              .contacts(contacts)
              .metadata(metadata)
              .nameServers(nameServers)
              .period(period)
              .privacy(privacy)
              .renewAuto(renewAuto)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainsApi#validateDomainRegistration");
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
| **customerId** | **String**| The Customer identifier&lt;br/&gt; Note: For API Resellers, performing actions on behalf of your customers, you need to specify the Subaccount you&#39;re operating on behalf of; otherwise use your shopper id. | |
| **domainPurchaseV2** | [**DomainPurchaseV2**](DomainPurchaseV2.md)| An instance document expected to match the JSON schema returned by &#x60;./schema/{tld}&#x60; | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Request was successful |  -  |

