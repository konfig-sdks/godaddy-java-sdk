# ActionsApi

All URIs are relative to *http://api.ote-godaddy.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRecentAction**](ActionsApi.md#cancelRecentAction) | **DELETE** /v2/customers/{customerId}/domains/{domain}/actions/{type} | Cancel the most recent user action for the specified domain |
| [**getRecentAction**](ActionsApi.md#getRecentAction) | **GET** /v2/customers/{customerId}/domains/{domain}/actions/{type} | Retrieves the most recent action for the specified domain |
| [**getRecentList**](ActionsApi.md#getRecentList) | **GET** /v2/customers/{customerId}/domains/{domain}/actions | Retrieves a list of the most recent actions for the specified domain |


<a name="cancelRecentAction"></a>
# **cancelRecentAction**
> cancelRecentAction(customerId, domain, type).xRequestId(xRequestId).execute();

Cancel the most recent user action for the specified domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActionsApi;
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
    String domain = "domain_example"; // Domain whose action is to be cancelled
    String type = "AUTH_CODE_PURCHASE"; // The type of action to cancel
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      client
              .actions
              .cancelRecentAction(customerId, domain, type)
              .xRequestId(xRequestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#cancelRecentAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .actions
              .cancelRecentAction(customerId, domain, type)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#cancelRecentAction");
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
| **domain** | **String**| Domain whose action is to be cancelled | |
| **type** | **String**| The type of action to cancel | [enum: AUTH_CODE_PURCHASE, AUTH_CODE_REGENERATE, BACKORDER_PURCHASE, BACKORDER_DELETE, BACKORDER_UPDATE, DNSSEC_CREATE, DNSSEC_DELETE, DOMAIN_DELETE, DOMAIN_UPDATE, DOMAIN_UPDATE_CONTACTS, DOMAIN_UPDATE_NAME_SERVERS, MIGRATE, PRIVACY_PURCHASE, PRIVACY_DELETE, REDEEM, REGISTER, RENEW, RENEW_UNDO, TRADE, TRADE_CANCEL, TRADE_PURCHASE, TRADE_PURCHASE_AUTH_TEXT_MESSAGE, TRADE_RESEND_AUTH_EMAIL, TRANSFER, TRANSFER_IN_ACCEPT, TRANSFER_IN_CANCEL, TRANSFER_IN_RESTART, TRANSFER_IN_RETRY, TRANSFER_OUT_ACCEPT, TRANSFER_OUT_REJECT, TRANSFER_OUT_REQUESTED, TRANSIT] |
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
| **204** | Request was successful |  -  |

<a name="getRecentAction"></a>
# **getRecentAction**
> Action getRecentAction(customerId, domain, type).xRequestId(xRequestId).execute();

Retrieves the most recent action for the specified domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActionsApi;
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
    String domain = "domain_example"; // Domain whose action is to be retrieved
    String type = "AUTH_CODE_PURCHASE"; // The type of action to retrieve
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      Action result = client
              .actions
              .getRecentAction(customerId, domain, type)
              .xRequestId(xRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompletedAt());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getModifiedAt());
      System.out.println(result.getOrigination());
      System.out.println(result.getReason());
      System.out.println(result.getRequestId());
      System.out.println(result.getStartedAt());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#getRecentAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Action> response = client
              .actions
              .getRecentAction(customerId, domain, type)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#getRecentAction");
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
| **domain** | **String**| Domain whose action is to be retrieved | |
| **type** | **String**| The type of action to retrieve | [enum: AUTH_CODE_PURCHASE, AUTH_CODE_REGENERATE, AUTO_RENEWAL, BACKORDER_PURCHASE, BACKORDER_DELETE, BACKORDER_UPDATE, DNS_VERIFICATION, DNSSEC_CREATE, DNSSEC_DELETE, DOMAIN_DELETE, DOMAIN_UPDATE, DOMAIN_UPDATE_CONTACTS, DOMAIN_UPDATE_NAME_SERVERS, EXPIRY, ICANN_VERIFICATION, MIGRATE, MIGRATE_IN, PREMIUM, PRIVACY_PURCHASE, PRIVACY_DELETE, REDEEM, REGISTER, RENEW, RENEW_UNDO, TRADE, TRADE_CANCEL, TRADE_PURCHASE, TRADE_PURCHASE_AUTH_TEXT_MESSAGE, TRADE_RESEND_AUTH_EMAIL, TRANSFER, TRANSFER_IN, TRANSFER_IN_ACCEPT, TRANSFER_IN_CANCEL, TRANSFER_IN_RESTART, TRANSFER_IN_RETRY, TRANSFER_OUT, TRANSFER_OUT_ACCEPT, TRANSFER_OUT_REJECT, TRANSFER_OUT_REQUESTED, TRANSIT] |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

[**Action**](Action.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

<a name="getRecentList"></a>
# **getRecentList**
> List&lt;Action&gt; getRecentList(customerId, domain).xRequestId(xRequestId).execute();

Retrieves a list of the most recent actions for the specified domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GoDaddy;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActionsApi;
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
    String domain = "domain_example"; // Domain whose actions are to be retrieved
    String xRequestId = "xRequestId_example"; // A client provided identifier for tracking this request.
    try {
      List<Action> result = client
              .actions
              .getRecentList(customerId, domain)
              .xRequestId(xRequestId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#getRecentList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Action>> response = client
              .actions
              .getRecentList(customerId, domain)
              .xRequestId(xRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsApi#getRecentList");
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
| **domain** | **String**| Domain whose actions are to be retrieved | |
| **xRequestId** | **String**| A client provided identifier for tracking this request. | [optional] |

### Return type

[**List&lt;Action&gt;**](Action.md)

### Authorization

[apiKey](../README.md#apiKey), [apiSecret](../README.md#apiSecret)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request was successful |  -  |

