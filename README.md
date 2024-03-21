<div align="left">

[![Visit Godaddy](./header.png)](https://developer.godaddy.com)

# [Godaddy](https://developer.godaddy.com)

All the help and tools you need to grow online: Websites, Domains, Digital and Social Marketing - plus GoDaddy Guides with you every step of the way.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=GoDaddy&serviceName=Domains&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>godaddy-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:godaddy-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/godaddy-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://api.ote-godaddy.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActionsApi* | [**cancelRecentAction**](docs/ActionsApi.md#cancelRecentAction) | **DELETE** /v2/customers/{customerId}/domains/{domain}/actions/{type} | Cancel the most recent user action for the specified domain
*ActionsApi* | [**getRecentAction**](docs/ActionsApi.md#getRecentAction) | **GET** /v2/customers/{customerId}/domains/{domain}/actions/{type} | Retrieves the most recent action for the specified domain
*ActionsApi* | [**getRecentList**](docs/ActionsApi.md#getRecentList) | **GET** /v2/customers/{customerId}/domains/{domain}/actions | Retrieves a list of the most recent actions for the specified domain
*DomainsApi* | [**acceptTransferIn**](docs/DomainsApi.md#acceptTransferIn) | **POST** /v2/customers/{customerId}/domains/{domain}/transferInAccept | Accepts the transfer in
*DomainsApi* | [**acceptTransferOut**](docs/DomainsApi.md#acceptTransferOut) | **POST** /v2/customers/{customerId}/domains/{domain}/transferOutAccept | Accept transfer out
*DomainsApi* | [**cancelForwardingRequest**](docs/DomainsApi.md#cancelForwardingRequest) | **DELETE** /v2/customers/{customerId}/domains/forwards/{fqdn} | Submit a forwarding cancellation request for the given fqdn
*DomainsApi* | [**cancelTransferIn**](docs/DomainsApi.md#cancelTransferIn) | **POST** /v2/customers/{customerId}/domains/{domain}/transferInCancel | Cancels the transfer in
*DomainsApi* | [**createForwardingConfiguration**](docs/DomainsApi.md#createForwardingConfiguration) | **POST** /v2/customers/{customerId}/domains/forwards/{fqdn} | Create a new forwarding configuration for the given FQDN
*DomainsApi* | [**getDetails**](docs/DomainsApi.md#getDetails) | **GET** /v2/customers/{customerId}/domains/{domain} | Retrieve details for the specified Domain
*DomainsApi* | [**getForwardingInfo**](docs/DomainsApi.md#getForwardingInfo) | **GET** /v2/customers/{customerId}/domains/forwards/{fqdn} | Retrieve the forwarding information for the given fqdn
*DomainsApi* | [**getRegisterSchema**](docs/DomainsApi.md#getRegisterSchema) | **GET** /v2/customers/{customerId}/domains/register/schema/{tld} | Retrieve the schema to be submitted when registering a Domain for the specified TLD
*DomainsApi* | [**getUpcomingMaintenanceDetails**](docs/DomainsApi.md#getUpcomingMaintenanceDetails) | **GET** /v2/domains/maintenances/{maintenanceId} | Retrieve the details for an upcoming system Maintenances
*DomainsApi* | [**getUpcomingMaintenancesList**](docs/DomainsApi.md#getUpcomingMaintenancesList) | **GET** /v2/domains/maintenances | Retrieve a list of upcoming system Maintenances
*DomainsApi* | [**initiateTransferOut**](docs/DomainsApi.md#initiateTransferOut) | **POST** /v2/customers/{customerId}/domains/{domain}/transferOut | Initiate transfer out to another registrar for a .uk domain.
*DomainsApi* | [**modifyForwardingInfo**](docs/DomainsApi.md#modifyForwardingInfo) | **PUT** /v2/customers/{customerId}/domains/forwards/{fqdn} | Modify the forwarding information for the given fqdn
*DomainsApi* | [**purchaseRegisterDomain**](docs/DomainsApi.md#purchaseRegisterDomain) | **POST** /v2/customers/{customerId}/domains/register | Purchase and register the specified Domain
*DomainsApi* | [**purchaseTransferProcess**](docs/DomainsApi.md#purchaseTransferProcess) | **POST** /v2/customers/{customerId}/domains/{domain}/transfer | Purchase and start or restart transfer process
*DomainsApi* | [**redeemDomainRestore**](docs/DomainsApi.md#redeemDomainRestore) | **POST** /v2/customers/{customerId}/domains/{domain}/redeem | Purchase a restore for the given domain to bring it out of redemption
*DomainsApi* | [**rejectTransferOut**](docs/DomainsApi.md#rejectTransferOut) | **POST** /v2/customers/{customerId}/domains/{domain}/transferOutReject | Reject transfer out
*DomainsApi* | [**renewDomain**](docs/DomainsApi.md#renewDomain) | **POST** /v2/customers/{customerId}/domains/{domain}/renew | Renew the specified Domain
*DomainsApi* | [**restartTransferIn**](docs/DomainsApi.md#restartTransferIn) | **POST** /v2/customers/{customerId}/domains/{domain}/transferInRestart | Restarts transfer in request from the beginning
*DomainsApi* | [**retryTransferInProcess**](docs/DomainsApi.md#retryTransferInProcess) | **POST** /v2/customers/{customerId}/domains/{domain}/transferInRetry | Retries the current transfer in request with supplied Authorization code
*DomainsApi* | [**validateDomainRegistration**](docs/DomainsApi.md#validateDomainRegistration) | **POST** /v2/customers/{customerId}/domains/register/validate | Validate the request body using the Domain Registration Schema for the specified TLD
*NotificationsApi* | [**acknowledgeDomainNotification**](docs/NotificationsApi.md#acknowledgeDomainNotification) | **POST** /v2/customers/{customerId}/domains/notifications/{notificationId}/acknowledge | Acknowledge a domain notification
*NotificationsApi* | [**getNextDomain**](docs/NotificationsApi.md#getNextDomain) | **GET** /v2/customers/{customerId}/domains/notifications | Retrieve the next domain notification
*NotificationsApi* | [**getSchema**](docs/NotificationsApi.md#getSchema) | **GET** /v2/customers/{customerId}/domains/notifications/schemas/{type} | Retrieve the schema for the notification data for the specified notification type
*NotificationsApi* | [**listOptedInTypes**](docs/NotificationsApi.md#listOptedInTypes) | **GET** /v2/customers/{customerId}/domains/notifications/optIn | Retrieve a list of notification types that are opted in
*NotificationsApi* | [**optInNotifications**](docs/NotificationsApi.md#optInNotifications) | **PUT** /v2/customers/{customerId}/domains/notifications/optIn | Opt in to recieve notifications for the submitted notification types
*V1Api* | [**addDnsRecordsToDomain**](docs/V1Api.md#addDnsRecordsToDomain) | **PATCH** /v1/domains/{domain}/records | Add the specified DNS Records to the specified Domain
*V1Api* | [**cancelDomainPurchase**](docs/V1Api.md#cancelDomainPurchase) | **DELETE** /v1/domains/{domain} | Cancel a purchased domain
*V1Api* | [**cancelPrivacyRequest**](docs/V1Api.md#cancelPrivacyRequest) | **DELETE** /v1/domains/{domain}/privacy | Submit a privacy cancellation request for the given domain
*V1Api* | [**checkDomainAvailability**](docs/V1Api.md#checkDomainAvailability) | **GET** /v1/domains/available | Determine whether or not the specified domain is available for purchase
*V1Api* | [**checkDomainAvailabilityPost**](docs/V1Api.md#checkDomainAvailabilityPost) | **POST** /v1/domains/available | Determine whether or not the specified domains are available for purchase
*V1Api* | [**createDomainPurchase**](docs/V1Api.md#createDomainPurchase) | **POST** /v1/domains/purchase | Purchase and register the specified Domain
*V1Api* | [**deleteAllDnsRecords**](docs/V1Api.md#deleteAllDnsRecords) | **DELETE** /v1/domains/{domain}/records/{type}/{name} | Delete all DNS Records for the specified Domain with the specified Type and Name
*V1Api* | [**getDnsRecords**](docs/V1Api.md#getDnsRecords) | **GET** /v1/domains/{domain}/records/{type}/{name} | Retrieve DNS Records for the specified Domain, optionally with the specified Type and/or Name
*V1Api* | [**getDomainDetails**](docs/V1Api.md#getDomainDetails) | **GET** /v1/domains/{domain} | Retrieve details for the specified Domain
*V1Api* | [**getDomainSchema**](docs/V1Api.md#getDomainSchema) | **GET** /v1/domains/purchase/schema/{tld} | Retrieve the schema to be submitted when registering a Domain for the specified TLD
*V1Api* | [**getDomainsList**](docs/V1Api.md#getDomainsList) | **GET** /v1/domains | Retrieve a list of Domains for the specified Shopper
*V1Api* | [**getLegalAgreements**](docs/V1Api.md#getLegalAgreements) | **GET** /v1/domains/agreements | Retrieve the legal agreement(s) required to purchase the specified TLD and add-ons
*V1Api* | [**getTldsList**](docs/V1Api.md#getTldsList) | **GET** /v1/domains/tlds | Retrieves a list of TLDs supported and enabled for sale
*V1Api* | [**purchasePrivacyForDomain**](docs/V1Api.md#purchasePrivacyForDomain) | **POST** /v1/domains/{domain}/privacy/purchase | Purchase privacy for a specified domain
*V1Api* | [**purchaseTransferProcess**](docs/V1Api.md#purchaseTransferProcess) | **POST** /v1/domains/{domain}/transfer | Purchase and start or restart transfer process
*V1Api* | [**renewDomain**](docs/V1Api.md#renewDomain) | **POST** /v1/domains/{domain}/renew | Renew the specified Domain
*V1Api* | [**replaceDnsRecords**](docs/V1Api.md#replaceDnsRecords) | **PUT** /v1/domains/{domain}/records | Replace all DNS Records for the specified Domain
*V1Api* | [**replaceDnsRecordsType**](docs/V1Api.md#replaceDnsRecordsType) | **PUT** /v1/domains/{domain}/records/{type} | Replace all DNS Records for the specified Domain with the specified Type
*V1Api* | [**replaceDnsRecordsType_0**](docs/V1Api.md#replaceDnsRecordsType_0) | **PUT** /v1/domains/{domain}/records/{type}/{name} | Replace all DNS Records for the specified Domain with the specified Type and Name
*V1Api* | [**resendContactEmailVerification**](docs/V1Api.md#resendContactEmailVerification) | **POST** /v1/domains/{domain}/verifyRegistrantEmail | Re-send Contact E-mail Verification for specified Domain
*V1Api* | [**suggestAlternateDomains**](docs/V1Api.md#suggestAlternateDomains) | **GET** /v1/domains/suggest | Suggest alternate Domain names based on a seed Domain, a set of keywords, or the shopper&#39;s purchase history
*V1Api* | [**updateDomainContacts**](docs/V1Api.md#updateDomainContacts) | **PATCH** /v1/domains/{domain}/contacts | Update domain
*V1Api* | [**updateDomainDetails**](docs/V1Api.md#updateDomainDetails) | **PATCH** /v1/domains/{domain} | Update details for the specified Domain
*V1Api* | [**validateDomainContacts**](docs/V1Api.md#validateDomainContacts) | **POST** /v1/domains/contacts/validate | Validate the request body using the Domain Contact Validation Schema for specified domains.
*V1Api* | [**validateDomainPurchase**](docs/V1Api.md#validateDomainPurchase) | **POST** /v1/domains/purchase/validate | Validate the request body using the Domain Purchase Schema for the specified TLD


## Documentation for Models

 - [Action](docs/Action.md)
 - [ActionReason](docs/ActionReason.md)
 - [Address](docs/Address.md)
 - [Consent](docs/Consent.md)
 - [ConsentDomainUpdate](docs/ConsentDomainUpdate.md)
 - [ConsentRedemption](docs/ConsentRedemption.md)
 - [ConsentRenew](docs/ConsentRenew.md)
 - [ConsentV2](docs/ConsentV2.md)
 - [Contact](docs/Contact.md)
 - [ContactDomain](docs/ContactDomain.md)
 - [ContactDomainCreate](docs/ContactDomainCreate.md)
 - [DNSRecord](docs/DNSRecord.md)
 - [DNSRecordCreateType](docs/DNSRecordCreateType.md)
 - [DNSRecordCreateTypeName](docs/DNSRecordCreateTypeName.md)
 - [Domain](docs/Domain.md)
 - [DomainAvailableBulk](docs/DomainAvailableBulk.md)
 - [DomainAvailableBulkMixed](docs/DomainAvailableBulkMixed.md)
 - [DomainAvailableError](docs/DomainAvailableError.md)
 - [DomainAvailableResponse](docs/DomainAvailableResponse.md)
 - [DomainContacts](docs/DomainContacts.md)
 - [DomainContactsCreateV2](docs/DomainContactsCreateV2.md)
 - [DomainContactsV2](docs/DomainContactsV2.md)
 - [DomainDetail](docs/DomainDetail.md)
 - [DomainDetailV2](docs/DomainDetailV2.md)
 - [DomainDnssec](docs/DomainDnssec.md)
 - [DomainForwarding](docs/DomainForwarding.md)
 - [DomainForwardingCreate](docs/DomainForwardingCreate.md)
 - [DomainForwardingMask](docs/DomainForwardingMask.md)
 - [DomainNotification](docs/DomainNotification.md)
 - [DomainNotificationType](docs/DomainNotificationType.md)
 - [DomainPurchase](docs/DomainPurchase.md)
 - [DomainPurchaseResponse](docs/DomainPurchaseResponse.md)
 - [DomainPurchaseV2](docs/DomainPurchaseV2.md)
 - [DomainRedeemV2](docs/DomainRedeemV2.md)
 - [DomainRenew](docs/DomainRenew.md)
 - [DomainRenewV2](docs/DomainRenewV2.md)
 - [DomainSuggestion](docs/DomainSuggestion.md)
 - [DomainSummary](docs/DomainSummary.md)
 - [DomainTransferAuthCode](docs/DomainTransferAuthCode.md)
 - [DomainTransferIn](docs/DomainTransferIn.md)
 - [DomainTransferInV2](docs/DomainTransferInV2.md)
 - [DomainUpdate](docs/DomainUpdate.md)
 - [DomainsContactsBulk](docs/DomainsContactsBulk.md)
 - [Error](docs/Error.md)
 - [ErrorDomainContactsValidate](docs/ErrorDomainContactsValidate.md)
 - [ErrorField](docs/ErrorField.md)
 - [ErrorFieldDomainContactsValidate](docs/ErrorFieldDomainContactsValidate.md)
 - [ErrorLimit](docs/ErrorLimit.md)
 - [JsonDataType](docs/JsonDataType.md)
 - [JsonProperty](docs/JsonProperty.md)
 - [JsonSchema](docs/JsonSchema.md)
 - [LegalAgreement](docs/LegalAgreement.md)
 - [Maintenance](docs/Maintenance.md)
 - [MaintenanceDetail](docs/MaintenanceDetail.md)
 - [MaintenanceSystem](docs/MaintenanceSystem.md)
 - [PrivacyPurchase](docs/PrivacyPurchase.md)
 - [RealNameValidation](docs/RealNameValidation.md)
 - [RenewalDetails](docs/RenewalDetails.md)
 - [TldSummary](docs/TldSummary.md)
 - [VerificationDomainName](docs/VerificationDomainName.md)
 - [VerificationRealName](docs/VerificationRealName.md)
 - [VerificationsDomain](docs/VerificationsDomain.md)
 - [VerificationsDomainV2](docs/VerificationsDomainV2.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
