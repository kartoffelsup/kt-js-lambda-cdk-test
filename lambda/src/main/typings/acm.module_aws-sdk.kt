@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import ACM.CertificateSummary
import ACM.DomainValidation
import ACM.DomainValidationOption
import ACM.ExtendedKeyUsage
import ACM.KeyUsage
import ACM.Tag
import ACM.AddTagsToCertificateRequest
import ACM.DeleteCertificateRequest
import ACM.DescribeCertificateRequest
import ACM.DescribeCertificateResponse
import ACM.ExportCertificateRequest
import ACM.ExportCertificateResponse
import ACM.GetCertificateRequest
import ACM.GetCertificateResponse
import ACM.ImportCertificateRequest
import ACM.ImportCertificateResponse
import ACM.ListCertificatesRequest
import ACM.ListCertificatesResponse
import ACM.ListTagsForCertificateRequest
import ACM.ListTagsForCertificateResponse
import ACM.RemoveTagsFromCertificateRequest
import ACM.RenewCertificateRequest
import ACM.RequestCertificateRequest
import ACM.RequestCertificateResponse
import ACM.ResendValidationEmailRequest
import ACM.UpdateCertificateOptionsRequest
import ACM.RenewalSummary
import ACM.CertificateOptions
import ACM.CertificateDetail
import ACM.ResourceRecord
import ACM.Filters

typealias Arn = String

typealias CertificateBody = String

typealias CertificateChain = String

typealias CertificateStatuses = Array<String /* "PENDING_VALIDATION" | "ISSUED" | "INACTIVE" | "EXPIRED" | "VALIDATION_TIMED_OUT" | "REVOKED" | "FAILED" | String */>

typealias CertificateSummaryList = Array<CertificateSummary>

typealias DomainList = Array<DomainNameString>

typealias DomainNameString = String

typealias DomainValidationList = Array<DomainValidation>

typealias DomainValidationOptionList = Array<DomainValidationOption>

typealias ExtendedKeyUsageFilterList = Array<String /* "TLS_WEB_SERVER_AUTHENTICATION" | "TLS_WEB_CLIENT_AUTHENTICATION" | "CODE_SIGNING" | "EMAIL_PROTECTION" | "TIME_STAMPING" | "OCSP_SIGNING" | "IPSEC_END_SYSTEM" | "IPSEC_TUNNEL" | "IPSEC_USER" | "ANY" | "NONE" | "CUSTOM" | String */>

typealias ExtendedKeyUsageList = Array<ExtendedKeyUsage>

typealias IdempotencyToken = String

typealias InUseList = Array<String>

typealias KeyAlgorithmList = Array<String /* "RSA_2048" | "RSA_1024" | "RSA_4096" | "EC_prime256v1" | "EC_secp384r1" | "EC_secp521r1" | String */>

typealias KeyUsageFilterList = Array<String /* "DIGITAL_SIGNATURE" | "NON_REPUDIATION" | "KEY_ENCIPHERMENT" | "DATA_ENCIPHERMENT" | "KEY_AGREEMENT" | "CERTIFICATE_SIGNING" | "CRL_SIGNING" | "ENCIPHER_ONLY" | "DECIPHER_ONLY" | "ANY" | "CUSTOM" | String */>

typealias KeyUsageList = Array<KeyUsage>

typealias MaxItems = Number

typealias NextToken = String

typealias PrivateKey = String

typealias String = String

typealias TStamp = Date

typealias TagKey = String

typealias TagList = Array<Tag>

typealias TagValue = String

typealias ValidationEmailList = Array<String>

external interface Blob

@JsModule("aws-sdk")
external open class ACM(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ACM.Types.ClientConfiguration */
    open fun addTagsToCertificate(params: AddTagsToCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addTagsToCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCertificate(params: DeleteCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeCertificate(params: DescribeCertificateRequest, callback: (err: AWSError, data: DescribeCertificateResponse) -> Unit = definedExternally): Request<DescribeCertificateResponse, AWSError>
    open fun describeCertificate(callback: (err: AWSError, data: DescribeCertificateResponse) -> Unit = definedExternally): Request<DescribeCertificateResponse, AWSError>
    open fun exportCertificate(params: ExportCertificateRequest, callback: (err: AWSError, data: ExportCertificateResponse) -> Unit = definedExternally): Request<ExportCertificateResponse, AWSError>
    open fun exportCertificate(callback: (err: AWSError, data: ExportCertificateResponse) -> Unit = definedExternally): Request<ExportCertificateResponse, AWSError>
    open fun getCertificate(params: GetCertificateRequest, callback: (err: AWSError, data: GetCertificateResponse) -> Unit = definedExternally): Request<GetCertificateResponse, AWSError>
    open fun getCertificate(callback: (err: AWSError, data: GetCertificateResponse) -> Unit = definedExternally): Request<GetCertificateResponse, AWSError>
    open fun importCertificate(params: ImportCertificateRequest, callback: (err: AWSError, data: ImportCertificateResponse) -> Unit = definedExternally): Request<ImportCertificateResponse, AWSError>
    open fun importCertificate(callback: (err: AWSError, data: ImportCertificateResponse) -> Unit = definedExternally): Request<ImportCertificateResponse, AWSError>
    open fun listCertificates(params: ListCertificatesRequest, callback: (err: AWSError, data: ListCertificatesResponse) -> Unit = definedExternally): Request<ListCertificatesResponse, AWSError>
    open fun listCertificates(callback: (err: AWSError, data: ListCertificatesResponse) -> Unit = definedExternally): Request<ListCertificatesResponse, AWSError>
    open fun listTagsForCertificate(params: ListTagsForCertificateRequest, callback: (err: AWSError, data: ListTagsForCertificateResponse) -> Unit = definedExternally): Request<ListTagsForCertificateResponse, AWSError>
    open fun listTagsForCertificate(callback: (err: AWSError, data: ListTagsForCertificateResponse) -> Unit = definedExternally): Request<ListTagsForCertificateResponse, AWSError>
    open fun removeTagsFromCertificate(params: RemoveTagsFromCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeTagsFromCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun renewCertificate(params: RenewCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun renewCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun requestCertificate(params: RequestCertificateRequest, callback: (err: AWSError, data: RequestCertificateResponse) -> Unit = definedExternally): Request<RequestCertificateResponse, AWSError>
    open fun requestCertificate(callback: (err: AWSError, data: RequestCertificateResponse) -> Unit = definedExternally): Request<RequestCertificateResponse, AWSError>
    open fun resendValidationEmail(params: ResendValidationEmailRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun resendValidationEmail(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateCertificateOptions(params: UpdateCertificateOptionsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateCertificateOptions(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun waitFor(state: String /* "certificateValidated" */, params: DescribeCertificateRequest /* ACM.Types.DescribeCertificateRequest & `T$0` */, callback: (err: AWSError, data: DescribeCertificateResponse) -> Unit = definedExternally): Request<DescribeCertificateResponse, AWSError>
    open fun waitFor(state: String /* "certificateValidated" */, callback: (err: AWSError, data: DescribeCertificateResponse) -> Unit = definedExternally): Request<DescribeCertificateResponse, AWSError>
    interface AddTagsToCertificateRequest {
        var CertificateArn: Arn
        var Tags: TagList
    }
    interface CertificateDetail {
        var CertificateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: DomainNameString?
            get() = definedExternally
            set(value) = definedExternally
        var SubjectAlternativeNames: DomainList?
            get() = definedExternally
            set(value) = definedExternally
        var DomainValidationOptions: DomainValidationList?
            get() = definedExternally
            set(value) = definedExternally
        var Serial: String?
            get() = definedExternally
            set(value) = definedExternally
        var Subject: String?
            get() = definedExternally
            set(value) = definedExternally
        var Issuer: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var IssuedAt: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var ImportedAt: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING_VALIDATION" | "ISSUED" | "INACTIVE" | "EXPIRED" | "VALIDATION_TIMED_OUT" | "REVOKED" | "FAILED" | String */
        var RevokedAt: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var RevocationReason: String /* "UNSPECIFIED" | "KEY_COMPROMISE" | "CA_COMPROMISE" | "AFFILIATION_CHANGED" | "SUPERCEDED" | "CESSATION_OF_OPERATION" | "CERTIFICATE_HOLD" | "REMOVE_FROM_CRL" | "PRIVILEGE_WITHDRAWN" | "A_A_COMPROMISE" | String */
        var NotBefore: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NotAfter: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var KeyAlgorithm: String /* "RSA_2048" | "RSA_1024" | "RSA_4096" | "EC_prime256v1" | "EC_secp384r1" | "EC_secp521r1" | String */
        var SignatureAlgorithm: String?
            get() = definedExternally
            set(value) = definedExternally
        var InUseBy: InUseList?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: String /* "NO_AVAILABLE_CONTACTS" | "ADDITIONAL_VERIFICATION_REQUIRED" | "DOMAIN_NOT_ALLOWED" | "INVALID_PUBLIC_DOMAIN" | "DOMAIN_VALIDATION_DENIED" | "CAA_ERROR" | "PCA_LIMIT_EXCEEDED" | "PCA_INVALID_ARN" | "PCA_INVALID_STATE" | "PCA_REQUEST_FAILED" | "PCA_NAME_CONSTRAINTS_VALIDATION" | "PCA_RESOURCE_NOT_FOUND" | "PCA_INVALID_ARGS" | "PCA_INVALID_DURATION" | "PCA_ACCESS_DENIED" | "OTHER" | String */
        var Type: String /* "IMPORTED" | "AMAZON_ISSUED" | "PRIVATE" | String */
        var RenewalSummary: RenewalSummary?
            get() = definedExternally
            set(value) = definedExternally
        var KeyUsages: KeyUsageList?
            get() = definedExternally
            set(value) = definedExternally
        var ExtendedKeyUsages: ExtendedKeyUsageList?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateAuthorityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var RenewalEligibility: String /* "ELIGIBLE" | "INELIGIBLE" | String */
        var Options: CertificateOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CertificateOptions {
        var CertificateTransparencyLoggingPreference: String /* "ENABLED" | "DISABLED" | String */
    }
    interface CertificateSummary {
        var CertificateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: DomainNameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCertificateRequest {
        var CertificateArn: Arn
    }
    interface DescribeCertificateRequest {
        var CertificateArn: Arn
    }
    interface DescribeCertificateResponse {
        var Certificate: CertificateDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainValidation {
        var DomainName: DomainNameString
        var ValidationEmails: ValidationEmailList?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationDomain: DomainNameString?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationStatus: String /* "PENDING_VALIDATION" | "SUCCESS" | "FAILED" | String */
        var ResourceRecord: ResourceRecord?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationMethod: String /* "EMAIL" | "DNS" | String */
    }
    interface DomainValidationOption {
        var DomainName: DomainNameString
        var ValidationDomain: DomainNameString
    }
    interface ExportCertificateRequest {
        var CertificateArn: Arn
        var Passphrase: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportCertificateResponse {
        var Certificate: CertificateBody?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateChain: CertificateChain?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateKey: PrivateKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExtendedKeyUsage {
        var Name: String /* "TLS_WEB_SERVER_AUTHENTICATION" | "TLS_WEB_CLIENT_AUTHENTICATION" | "CODE_SIGNING" | "EMAIL_PROTECTION" | "TIME_STAMPING" | "OCSP_SIGNING" | "IPSEC_END_SYSTEM" | "IPSEC_TUNNEL" | "IPSEC_USER" | "ANY" | "NONE" | "CUSTOM" | String */
        var OID: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filters {
        var extendedKeyUsage: ExtendedKeyUsageFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var keyUsage: KeyUsageFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var keyTypes: KeyAlgorithmList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCertificateRequest {
        var CertificateArn: Arn
    }
    interface GetCertificateResponse {
        var Certificate: CertificateBody?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateChain: CertificateChain?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportCertificateRequest {
        var CertificateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Certificate: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var PrivateKey: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var CertificateChain: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportCertificateResponse {
        var CertificateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyUsage {
        var Name: String /* "DIGITAL_SIGNATURE" | "NON_REPUDIATION" | "KEY_ENCIPHERMENT" | "DATA_ENCIPHERMENT" | "KEY_AGREEMENT" | "CERTIFICATE_SIGNING" | "CRL_SIGNING" | "ENCIPHER_ONLY" | "DECIPHER_ONLY" | "ANY" | "CUSTOM" | String */
    }
    interface ListCertificatesRequest {
        var CertificateStatuses: CertificateStatuses?
            get() = definedExternally
            set(value) = definedExternally
        var Includes: Filters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCertificatesResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateSummaryList: CertificateSummaryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForCertificateRequest {
        var CertificateArn: Arn
    }
    interface ListTagsForCertificateResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsFromCertificateRequest {
        var CertificateArn: Arn
        var Tags: TagList
    }
    interface RenewCertificateRequest {
        var CertificateArn: Arn
    }
    interface RenewalSummary {
        var RenewalStatus: String /* "PENDING_AUTO_RENEWAL" | "PENDING_VALIDATION" | "SUCCESS" | "FAILED" | String */
        var DomainValidationOptions: DomainValidationList
        var RenewalStatusReason: String /* "NO_AVAILABLE_CONTACTS" | "ADDITIONAL_VERIFICATION_REQUIRED" | "DOMAIN_NOT_ALLOWED" | "INVALID_PUBLIC_DOMAIN" | "DOMAIN_VALIDATION_DENIED" | "CAA_ERROR" | "PCA_LIMIT_EXCEEDED" | "PCA_INVALID_ARN" | "PCA_INVALID_STATE" | "PCA_REQUEST_FAILED" | "PCA_NAME_CONSTRAINTS_VALIDATION" | "PCA_RESOURCE_NOT_FOUND" | "PCA_INVALID_ARGS" | "PCA_INVALID_DURATION" | "PCA_ACCESS_DENIED" | "OTHER" | String */
        var UpdatedAt: TStamp
    }
    interface RequestCertificateRequest {
        var DomainName: DomainNameString
        var ValidationMethod: String /* "EMAIL" | "DNS" | String */
        var SubjectAlternativeNames: DomainList?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
        var DomainValidationOptions: DomainValidationOptionList?
            get() = definedExternally
            set(value) = definedExternally
        var Options: CertificateOptions?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateAuthorityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RequestCertificateResponse {
        var CertificateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResendValidationEmailRequest {
        var CertificateArn: Arn
        var Domain: DomainNameString
        var ValidationDomain: DomainNameString
    }
    interface ResourceRecord {
        var Name: String
        var Type: String /* "CNAME" | String */
        var Value: String
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCertificateOptionsRequest {
        var CertificateArn: Arn
        var Options: CertificateOptions
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-12-08" | "latest" | String */
    }
}