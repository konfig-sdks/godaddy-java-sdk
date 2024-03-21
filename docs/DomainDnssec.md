

# DomainDnssec


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**algorithm** | [**AlgorithmEnum**](#AlgorithmEnum) | This identifies the cryptographic algorithm used to generate the signature&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RSAMD5&lt;/strong&gt; - [01] DRSA/MD5 &lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DSA&lt;/strong&gt; - [03] DSA/SHA1&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RSASHA1&lt;/strong&gt; - [05] RSA/SHA-1&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;DSA_NSEC3_SHA1&lt;/strong&gt; - [06] DSA-NSEC3-SHA1&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RSASHA1_NSEC3_SHA1&lt;/strong&gt; - [07] RSASHA1-NSEC3-SHA1&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RSASHA256&lt;/strong&gt; - [08] RSA/SHA-256&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;RSASHA512&lt;/strong&gt; - [10] RSA/SHA-512&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ECC_GOST&lt;/strong&gt; - [12] GOST R 34.10-2001&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ECDSAP256SHA256&lt;/strong&gt; - [13] ECDSA Curve P-256 with SHA-256&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ECDSAP384SHA384&lt;/strong&gt; - [14] ECDSA Curve P-384 with SHA-384&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ED25519&lt;/strong&gt; - [15] Ed25519&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ED448&lt;/strong&gt; - [16] Ed448&lt;/li&gt;&lt;/ul&gt; |  |
|**digest** | **String** | The digest is an alpha-numeric value |  [optional] |
|**digestType** | [**DigestTypeEnum**](#DigestTypeEnum) | This identifies the algorithm used to construct the digest&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SHA1&lt;/strong&gt; - [01] SHA-1&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SHA256&lt;/strong&gt; - [02] SHA-256&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;GOST&lt;/strong&gt; - [03] GOST R 34.11-94&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;SHA384&lt;/strong&gt; - [04] SHA-384&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**flags** | [**FlagsEnum**](#FlagsEnum) | This identifies the key type; either a Zone-Signing Key or a Key-Signing Key&lt;br/&gt;&lt;ul&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;ZSK&lt;/strong&gt; - [256] Zone-Signing Key&lt;/li&gt;&lt;li&gt;&lt;strong style&#x3D;&#39;margin-left: 12px;&#39;&gt;KSK&lt;/strong&gt; - [257] Key-Signing Key&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**keyTag** | **Integer** | This is an integer value less than 65536 used to identify the DNSSEC record for the domain name. |  [optional] |
|**maxSignatureLife** | **Integer** | This specifies the validity period for the signature. The value is expressed in seconds. You can use any integer value larger than zero |  [optional] |
|**publicKey** | **String** | Registries use this value to encrypt DS records. Decryption requires a matching public key |  [optional] |



## Enum: AlgorithmEnum

| Name | Value |
|---- | -----|
| RSAMD5 | &quot;RSAMD5&quot; |
| DH | &quot;DH&quot; |
| DSA | &quot;DSA&quot; |
| RSASHA1 | &quot;RSASHA1&quot; |
| DSA_NSEC3_SHA1 | &quot;DSA_NSEC3_SHA1&quot; |
| RSASHA1_NSEC3_SHA1 | &quot;RSASHA1_NSEC3_SHA1&quot; |
| RSASHA256 | &quot;RSASHA256&quot; |
| RSASHA512 | &quot;RSASHA512&quot; |
| ECC_GOST | &quot;ECC_GOST&quot; |
| ECDSAP256SHA256 | &quot;ECDSAP256SHA256&quot; |
| ECDSAP384SHA384 | &quot;ECDSAP384SHA384&quot; |
| ED25519 | &quot;ED25519&quot; |
| ED448 | &quot;ED448&quot; |
| PRIVATEDNS | &quot;PRIVATEDNS&quot; |
| PRIVATEOID | &quot;PRIVATEOID&quot; |



## Enum: DigestTypeEnum

| Name | Value |
|---- | -----|
| SHA1 | &quot;SHA1&quot; |
| SHA256 | &quot;SHA256&quot; |
| GOST | &quot;GOST&quot; |
| SHA384 | &quot;SHA384&quot; |



## Enum: FlagsEnum

| Name | Value |
|---- | -----|
| ZSK | &quot;ZSK&quot; |
| KSK | &quot;KSK&quot; |



