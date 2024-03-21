# NotificationsApi

All URIs are relative to *http://api.ote-godaddy.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acknowledgeDomainNotification**](NotificationsApi.md#acknowledgeDomainNotification) | **POST** /v2/customers/{customerId}/domains/notifications/{notificationId}/acknowledge | Acknowledge a domain notification |
| [**getNextDomain**](NotificationsApi.md#getNextDomain) | **GET** /v2/customers/{customerId}/domains/notifications | Retrieve the next domain notification |
| [**getSchema**](NotificationsApi.md#getSchema) | **GET** /v2/customers/{customerId}/domains/notifications/schemas/{type} | Retrieve the schema for the notification data for the specified notification type |
| [**listOptedInTypes**](NotificationsApi.md#listOptedInTypes) | **GET** /v2/customers/{customerId}/domains/notifications/optIn | Retrieve a list of notification types that are opted in |
| [**optInNotifications**](NotificationsApi.md#optInNotifications) | **PUT** /v2/customers/{customerId}/domains/notifications/optIn | Opt in to recieve notifications for the submitted notification types |


<a name="acknowledgeDomainNotification"></a>
# **acknowledgeDomainNotification**
> acknowledgeDomainNotification(customerId, notificationId).xRequestId(xRequestId).execute();

Acknowledge a domain notification

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
    String notificationId = "notificationId_example"; // The notification ID to acknowledge
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .notifications
              .acknowledgeDomainNotification(customerId, notificationId)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#acknowledgeDomainNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .notifications
              .acknowledgeDomainNotification(customerId, notificationId)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#acknowledgeDomainNotification");
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
| **notificationId** | **String**| The notification ID to acknowledge | |
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
| **204** | Message acknowledged |  -  |

<a name="getNextDomain"></a>
# **getNextDomain**
> DomainNotification getNextDomain(customerId).xRequestId(xRequestId).execute();

Retrieve the next domain notification

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      DomainNotification result = client
              .notifications
              .getNextDomain(customerId)
              .xRequestId(xRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddedAt());
      System.out.println(result.getMetadata());
      System.out.println(result.getNotificationId());
      System.out.println(result.getRequestId());
      System.out.println(result.getResource());
      System.out.println(result.getResourceType());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getNextDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainNotification> response = client
              .notifications
              .getNextDomain(customerId)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getNextDomain");
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
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

[**DomainNotification**](DomainNotification.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="getSchema"></a>
# **getSchema**
> JsonSchema getSchema(customerId, type).xRequestId(xRequestId).execute();

Retrieve the schema for the notification data for the specified notification type

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
    String type = "AUTO_RENEWAL"; // The notification type whose schema should be retrieved
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      JsonSchema result = client
              .notifications
              .getSchema(customerId, type)
              .xRequestId(xRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getModels());
      System.out.println(result.getProperties());
      System.out.println(result.getRequired());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JsonSchema> response = client
              .notifications
              .getSchema(customerId, type)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getSchema");
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
| **type** | **String**| The notification type whose schema should be retrieved | [enum: AUTO_RENEWAL, BACKORDER, BACKORDER_PURCHASE, EXPIRY, PREMIUM, PRIVACY_PURCHASE, REDEEM, REGISTER, RENEW, TRADE, TRANSFER] |
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

<a name="listOptedInTypes"></a>
# **listOptedInTypes**
> List&lt;DomainNotification&gt; listOptedInTypes(customerId).xRequestId(xRequestId).execute();

Retrieve a list of notification types that are opted in

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      List<DomainNotification> result = client
              .notifications
              .listOptedInTypes(customerId)
              .xRequestId(xRequestId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#listOptedInTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<DomainNotification>> response = client
              .notifications
              .listOptedInTypes(customerId)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#listOptedInTypes");
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
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

[**List&lt;DomainNotification&gt;**](DomainNotification.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="optInNotifications"></a>
# **optInNotifications**
> optInNotifications(customerId, types).xRequestId(xRequestId).execute();

Opt in to recieve notifications for the submitted notification types

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
    List<String> types = Arrays.asList(); // The notification types that should be opted in
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .notifications
              .optInNotifications(customerId, types)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#optInNotifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .notifications
              .optInNotifications(customerId, types)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#optInNotifications");
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
| **types** | [**List&lt;String&gt;**](String.md)| The notification types that should be opted in | [enum: AUTH_CODE_PURCHASE, AUTH_CODE_REGENERATE, AUTO_RENEWAL, BACKORDER, BACKORDER_PURCHASE, BACKORDER_DELETE, BACKORDER_UPDATE, CONTACT_CREATE, CONTACT_DELETE, CONTACT_UPDATE, DNS_VERIFICATION, DNSSEC_CREATE, DNSSEC_DELETE, DOMAIN_DELETE, DOMAIN_UPDATE, DOMAIN_UPDATE_CONTACTS, DOMAIN_UPDATE_NAME_SERVERS, EXPIRY, HOST_CREATE, HOST_DELETE, ICANN_VERIFICATION, MIGRATE, MIGRATE_IN, PREMIUM, PRIVACY_PURCHASE, PRIVACY_DELETE, REDEEM, REGISTER, RENEW, RENEW_UNDO, TRADE, TRADE_CANCEL, TRADE_PURCHASE, TRADE_PURCHASE_AUTH_TEXT_MESSAGE, TRADE_RESEND_AUTH_EMAIL, TRANSFER, TRANSFER_IN, TRANSFER_IN_ACCEPT, TRANSFER_IN_CANCEL, TRANSFER_IN_RESTART, TRANSFER_IN_RETRY, TRANSFER_OUT, TRANSFER_OUT_ACCEPT, TRANSFER_OUT_REJECT, TRANSFER_OUT_REQUESTED, TRANSIT] |
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
| **204** | Command successful |  -  |

