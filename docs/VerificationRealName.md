

# VerificationRealName


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Status of the real name verification&lt;br/&gt;&lt;ul&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;APPROVED&lt;/strong&gt; - All is well&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;PENDING&lt;/strong&gt; - Real name verification is working its way through the workflow&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_DOCUMENT_OUTDATED&lt;/strong&gt; - Local government verification shows there is a newer version of your document.  Upload the latest version of the document and retry real name verification&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_EXPIRED_BUSINESS_LICENSE&lt;/strong&gt; - Business license is expired&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_EXPIRED_ORGANIZATION_CODE&lt;/strong&gt; - Organization code certificate number has expired&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_ILLEGIBLE_DOCUMENT_NAME&lt;/strong&gt; - There isn’t a clear name on your uploaded document, please upload a different document to retry real name verification&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_ILLEGIBLE_IDENTIFICATION&lt;/strong&gt; - Registrant identification is not clear.  Upload a better image to retry&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_INCOMPLETE_IDENTIFICATION&lt;/strong&gt; - Registrant identification is incomplete&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_INCOMPLETE_REGISTRATION_LETTER&lt;/strong&gt; - Registration letter is incomplete&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_INCONSISTENT_IDENTITY_CARD&lt;/strong&gt; - Provided identity card is inconsistent with the identity card on record&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_INCONSISTENT_ORGANIZATION_CODE&lt;/strong&gt; - Provided organization information is inconsistent with the results obtained using the submitted organization code&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_INCONSISTENT_REGISTRANT_NAME&lt;/strong&gt; - Name on the registrant identification does not match the name in the system&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_INVALID_BUSINESS_LICENSE_OR_ORGANIZATION_CODE&lt;/strong&gt; - Your document contains an invalid business license or organization code certificate number&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_INVALID_DOCUMENT&lt;/strong&gt; - Document is invalid.  Please upload another document to retry real name verification&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_MISMATCH_BUSINESS_ID&lt;/strong&gt; - Business id does not match the business id in the document&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_MISMATCH_BUSINESS_NAME&lt;/strong&gt; - Business name does not match the business name in the document&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_MISMATCH_DOCUMENT_ID&lt;/strong&gt; - Document id does not match the id in the document&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_MISMATCH_DOCUMENT_NAME&lt;/strong&gt; - Document name does not match the name in the document&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_MISMATCH_DOCUMENT_TYPE&lt;/strong&gt; - Document type does not match the document&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_MISMATCH_REGISTRANT_INFO&lt;/strong&gt; - The information provided for the registrant does not match the document&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_MISMATCH_REGISTRANT_LOCALITY&lt;/strong&gt; - Registrant region is overseas, but a local identity document was provided&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_MISMATCH_REGISTRANT_NAME&lt;/strong&gt; - Registrant name has been changed, so the request must be resubmitted&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_UNABLE_TO_OPEN&lt;/strong&gt; - Registrant identification could not be opened.  Please upload the document again to retry real name verification&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_UNABLE_TO_VERIFY&lt;/strong&gt; - Unable to initiate verification.  Please upload the document again to retry real name verification&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;REJECTED_UNKNOWN_ERROR&lt;/strong&gt; - Document was rejected due to an unknown error. For more information, contact customer support&lt;/li&gt; &lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;UNABLE_TO_RETRIEVE_STATUS&lt;/strong&gt; - Unable to retrieve status for the real name verification process.  Retry, if this status persists, contact customer support&lt;/li&gt; &lt;/ul&gt; |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| PENDING | &quot;PENDING&quot; |
| REJECTED_DOCUMENT_OUTDATED | &quot;REJECTED_DOCUMENT_OUTDATED&quot; |
| REJECTED_EXPIRED_BUSINESS_LICENSE | &quot;REJECTED_EXPIRED_BUSINESS_LICENSE&quot; |
| REJECTED_EXPIRED_ORGANIZATION_CODE | &quot;REJECTED_EXPIRED_ORGANIZATION_CODE&quot; |
| REJECTED_ILLEGIBLE_DOCUMENT_NAME | &quot;REJECTED_ILLEGIBLE_DOCUMENT_NAME&quot; |
| REJECTED_ILLEGIBLE_IDENTIFICATION | &quot;REJECTED_ILLEGIBLE_IDENTIFICATION&quot; |
| REJECTED_INCOMPLETE_IDENTIFICATION | &quot;REJECTED_INCOMPLETE_IDENTIFICATION&quot; |
| REJECTED_INCOMPLETE_REGISTRATION_LETTER | &quot;REJECTED_INCOMPLETE_REGISTRATION_LETTER&quot; |
| REJECTED_INCONSISTENT_IDENTITY_CARD | &quot;REJECTED_INCONSISTENT_IDENTITY_CARD&quot; |
| REJECTED_INCONSISTENT_ORGANIZATION_CODE | &quot;REJECTED_INCONSISTENT_ORGANIZATION_CODE&quot; |
| REJECTED_INCONSISTENT_REGISTRANT_NAME | &quot;REJECTED_INCONSISTENT_REGISTRANT_NAME&quot; |
| REJECTED_INVALID_BUSINESS_LICENSE_OR_ORGANIZATION_CODE | &quot;REJECTED_INVALID_BUSINESS_LICENSE_OR_ORGANIZATION_CODE&quot; |
| REJECTED_INVALID_DOCUMENT | &quot;REJECTED_INVALID_DOCUMENT&quot; |
| REJECTED_MISMATCH_BUSINESS_ID | &quot;REJECTED_MISMATCH_BUSINESS_ID&quot; |
| REJECTED_MISMATCH_BUSINESS_NAME | &quot;REJECTED_MISMATCH_BUSINESS_NAME&quot; |
| REJECTED_MISMATCH_DOCUMENT_ID | &quot;REJECTED_MISMATCH_DOCUMENT_ID&quot; |
| REJECTED_MISMATCH_DOCUMENT_NAME | &quot;REJECTED_MISMATCH_DOCUMENT_NAME&quot; |
| REJECTED_MISMATCH_DOCUMENT_TYPE | &quot;REJECTED_MISMATCH_DOCUMENT_TYPE&quot; |
| REJECTED_MISMATCH_REGISTRANT_INFO | &quot;REJECTED_MISMATCH_REGISTRANT_INFO&quot; |
| REJECTED_MISMATCH_REGISTRANT_LOCALITY | &quot;REJECTED_MISMATCH_REGISTRANT_LOCALITY&quot; |
| REJECTED_MISMATCH_REGISTRANT_NAME | &quot;REJECTED_MISMATCH_REGISTRANT_NAME&quot; |
| REJECTED_UNABLE_TO_OPEN | &quot;REJECTED_UNABLE_TO_OPEN&quot; |
| REJECTED_UNABLE_TO_VERIFY | &quot;REJECTED_UNABLE_TO_VERIFY&quot; |
| REJECTED_UNKNOWN_ERROR | &quot;REJECTED_UNKNOWN_ERROR&quot; |
| UNABLE_TO_RETRIEVE_STATUS | &quot;UNABLE_TO_RETRIEVE_STATUS&quot; |



