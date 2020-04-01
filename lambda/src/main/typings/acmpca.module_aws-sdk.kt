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
import ACMPCA.CertificateAuthority
import ACMPCA.Permission
import ACMPCA.Tag
import ACMPCA.CreateCertificateAuthorityRequest
import ACMPCA.CreateCertificateAuthorityResponse
import ACMPCA.CreateCertificateAuthorityAuditReportRequest
import ACMPCA.CreateCertificateAuthorityAuditReportResponse
import ACMPCA.CreatePermissionRequest
import ACMPCA.DeleteCertificateAuthorityRequest
import ACMPCA.DeletePermissionRequest
import ACMPCA.DescribeCertificateAuthorityRequest
import ACMPCA.DescribeCertificateAuthorityResponse
import ACMPCA.DescribeCertificateAuthorityAuditReportRequest
import ACMPCA.DescribeCertificateAuthorityAuditReportResponse
import ACMPCA.GetCertificateRequest
import ACMPCA.GetCertificateResponse
import ACMPCA.GetCertificateAuthorityCertificateRequest
import ACMPCA.GetCertificateAuthorityCertificateResponse
import ACMPCA.GetCertificateAuthorityCsrRequest
import ACMPCA.GetCertificateAuthorityCsrResponse
import ACMPCA.ImportCertificateAuthorityCertificateRequest
import ACMPCA.IssueCertificateRequest
import ACMPCA.IssueCertificateResponse
import ACMPCA.ListCertificateAuthoritiesRequest
import ACMPCA.ListCertificateAuthoritiesResponse
import ACMPCA.ListPermissionsRequest
import ACMPCA.ListPermissionsResponse
import ACMPCA.ListTagsRequest
import ACMPCA.ListTagsResponse
import ACMPCA.RestoreCertificateAuthorityRequest
import ACMPCA.RevokeCertificateRequest
import ACMPCA.TagCertificateAuthorityRequest
import ACMPCA.UntagCertificateAuthorityRequest
import ACMPCA.UpdateCertificateAuthorityRequest
import ACMPCA.CertificateAuthorityConfiguration
import ACMPCA.RevocationConfiguration
import ACMPCA.ASN1Subject
import ACMPCA.Validity
import ACMPCA.CrlConfiguration

typealias AccountId = String

typealias ActionList = Array<String /* "IssueCertificate" | "GetCertificate" | "ListPermissions" | String */>

typealias Arn = String

typealias AuditReportId = String

typealias Boolean = Boolean

typealias CertificateAuthorities = Array<CertificateAuthority>

typealias CertificateBody = String

typealias CertificateChain = String

typealias CountryCodeString = String

typealias CsrBody = String

typealias DistinguishedNameQualifierString = String

typealias IdempotencyToken = String

typealias Integer1To5000 = Number

typealias MaxResults = Number

typealias NextToken = String

typealias PermanentDeletionTimeInDays = Number

typealias PermissionList = Array<Permission>

typealias PositiveLong = Number

typealias Principal = String

typealias String = String

typealias String128 = String

typealias String16 = String

typealias String253 = String

typealias String3 = String

typealias String3To255 = String

typealias String40 = String

typealias String5 = String

typealias String64 = String

typealias TStamp = Date

typealias TagKey = String

typealias TagList = Array<Tag>

typealias TagValue = String

@JsModule("aws-sdk")
external open class ACMPCA(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ACMPCA.Types.ClientConfiguration */
    open fun createCertificateAuthority(params: CreateCertificateAuthorityRequest, callback: (err: AWSError, data: CreateCertificateAuthorityResponse) -> Unit = definedExternally): Request<CreateCertificateAuthorityResponse, AWSError>
    open fun createCertificateAuthority(callback: (err: AWSError, data: CreateCertificateAuthorityResponse) -> Unit = definedExternally): Request<CreateCertificateAuthorityResponse, AWSError>
    open fun createCertificateAuthorityAuditReport(params: CreateCertificateAuthorityAuditReportRequest, callback: (err: AWSError, data: CreateCertificateAuthorityAuditReportResponse) -> Unit = definedExternally): Request<CreateCertificateAuthorityAuditReportResponse, AWSError>
    open fun createCertificateAuthorityAuditReport(callback: (err: AWSError, data: CreateCertificateAuthorityAuditReportResponse) -> Unit = definedExternally): Request<CreateCertificateAuthorityAuditReportResponse, AWSError>
    open fun createPermission(params: CreatePermissionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createPermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCertificateAuthority(params: DeleteCertificateAuthorityRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCertificateAuthority(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePermission(params: DeletePermissionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeCertificateAuthority(params: DescribeCertificateAuthorityRequest, callback: (err: AWSError, data: DescribeCertificateAuthorityResponse) -> Unit = definedExternally): Request<DescribeCertificateAuthorityResponse, AWSError>
    open fun describeCertificateAuthority(callback: (err: AWSError, data: DescribeCertificateAuthorityResponse) -> Unit = definedExternally): Request<DescribeCertificateAuthorityResponse, AWSError>
    open fun describeCertificateAuthorityAuditReport(params: DescribeCertificateAuthorityAuditReportRequest, callback: (err: AWSError, data: DescribeCertificateAuthorityAuditReportResponse) -> Unit = definedExternally): Request<DescribeCertificateAuthorityAuditReportResponse, AWSError>
    open fun describeCertificateAuthorityAuditReport(callback: (err: AWSError, data: DescribeCertificateAuthorityAuditReportResponse) -> Unit = definedExternally): Request<DescribeCertificateAuthorityAuditReportResponse, AWSError>
    open fun getCertificate(params: GetCertificateRequest, callback: (err: AWSError, data: GetCertificateResponse) -> Unit = definedExternally): Request<GetCertificateResponse, AWSError>
    open fun getCertificate(callback: (err: AWSError, data: GetCertificateResponse) -> Unit = definedExternally): Request<GetCertificateResponse, AWSError>
    open fun getCertificateAuthorityCertificate(params: GetCertificateAuthorityCertificateRequest, callback: (err: AWSError, data: GetCertificateAuthorityCertificateResponse) -> Unit = definedExternally): Request<GetCertificateAuthorityCertificateResponse, AWSError>
    open fun getCertificateAuthorityCertificate(callback: (err: AWSError, data: GetCertificateAuthorityCertificateResponse) -> Unit = definedExternally): Request<GetCertificateAuthorityCertificateResponse, AWSError>
    open fun getCertificateAuthorityCsr(params: GetCertificateAuthorityCsrRequest, callback: (err: AWSError, data: GetCertificateAuthorityCsrResponse) -> Unit = definedExternally): Request<GetCertificateAuthorityCsrResponse, AWSError>
    open fun getCertificateAuthorityCsr(callback: (err: AWSError, data: GetCertificateAuthorityCsrResponse) -> Unit = definedExternally): Request<GetCertificateAuthorityCsrResponse, AWSError>
    open fun importCertificateAuthorityCertificate(params: ImportCertificateAuthorityCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun importCertificateAuthorityCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun issueCertificate(params: IssueCertificateRequest, callback: (err: AWSError, data: IssueCertificateResponse) -> Unit = definedExternally): Request<IssueCertificateResponse, AWSError>
    open fun issueCertificate(callback: (err: AWSError, data: IssueCertificateResponse) -> Unit = definedExternally): Request<IssueCertificateResponse, AWSError>
    open fun listCertificateAuthorities(params: ListCertificateAuthoritiesRequest, callback: (err: AWSError, data: ListCertificateAuthoritiesResponse) -> Unit = definedExternally): Request<ListCertificateAuthoritiesResponse, AWSError>
    open fun listCertificateAuthorities(callback: (err: AWSError, data: ListCertificateAuthoritiesResponse) -> Unit = definedExternally): Request<ListCertificateAuthoritiesResponse, AWSError>
    open fun listPermissions(params: ListPermissionsRequest, callback: (err: AWSError, data: ListPermissionsResponse) -> Unit = definedExternally): Request<ListPermissionsResponse, AWSError>
    open fun listPermissions(callback: (err: AWSError, data: ListPermissionsResponse) -> Unit = definedExternally): Request<ListPermissionsResponse, AWSError>
    open fun listTags(params: ListTagsRequest, callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun restoreCertificateAuthority(params: RestoreCertificateAuthorityRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun restoreCertificateAuthority(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun revokeCertificate(params: RevokeCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun revokeCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagCertificateAuthority(params: TagCertificateAuthorityRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagCertificateAuthority(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagCertificateAuthority(params: UntagCertificateAuthorityRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagCertificateAuthority(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateCertificateAuthority(params: UpdateCertificateAuthorityRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateCertificateAuthority(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun waitFor(state: String /* "certificateAuthorityCSRCreated" */, params: GetCertificateAuthorityCsrRequest /* ACMPCA.Types.GetCertificateAuthorityCsrRequest & `T$0` */, callback: (err: AWSError, data: GetCertificateAuthorityCsrResponse) -> Unit = definedExternally): Request<GetCertificateAuthorityCsrResponse, AWSError>
    open fun waitFor(state: String /* "certificateAuthorityCSRCreated" */, callback: (err: AWSError, data: GetCertificateAuthorityCsrResponse) -> Unit = definedExternally): Request<GetCertificateAuthorityCsrResponse, AWSError>
    open fun waitFor(state: String /* "certificateIssued" */, params: GetCertificateRequest /* ACMPCA.Types.GetCertificateRequest & `T$0` */, callback: (err: AWSError, data: GetCertificateResponse) -> Unit = definedExternally): Request<GetCertificateResponse, AWSError>
    open fun waitFor(state: String /* "certificateIssued" */, callback: (err: AWSError, data: GetCertificateResponse) -> Unit = definedExternally): Request<GetCertificateResponse, AWSError>
    open fun waitFor(state: String /* "auditReportCreated" */, params: DescribeCertificateAuthorityAuditReportRequest /* ACMPCA.Types.DescribeCertificateAuthorityAuditReportRequest & `T$0` */, callback: (err: AWSError, data: DescribeCertificateAuthorityAuditReportResponse) -> Unit = definedExternally): Request<DescribeCertificateAuthorityAuditReportResponse, AWSError>
    open fun waitFor(state: String /* "auditReportCreated" */, callback: (err: AWSError, data: DescribeCertificateAuthorityAuditReportResponse) -> Unit = definedExternally): Request<DescribeCertificateAuthorityAuditReportResponse, AWSError>
    interface ASN1Subject {
        var Country: CountryCodeString?
            get() = definedExternally
            set(value) = definedExternally
        var Organization: String64?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationalUnit: String64?
            get() = definedExternally
            set(value) = definedExternally
        var DistinguishedNameQualifier: DistinguishedNameQualifierString?
            get() = definedExternally
            set(value) = definedExternally
        var State: String128?
            get() = definedExternally
            set(value) = definedExternally
        var CommonName: String64?
            get() = definedExternally
            set(value) = definedExternally
        var SerialNumber: String64?
            get() = definedExternally
            set(value) = definedExternally
        var Locality: String128?
            get() = definedExternally
            set(value) = definedExternally
        var Title: String64?
            get() = definedExternally
            set(value) = definedExternally
        var Surname: String40?
            get() = definedExternally
            set(value) = definedExternally
        var GivenName: String16?
            get() = definedExternally
            set(value) = definedExternally
        var Initials: String5?
            get() = definedExternally
            set(value) = definedExternally
        var Pseudonym: String128?
            get() = definedExternally
            set(value) = definedExternally
        var GenerationQualifier: String3?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CertificateAuthority {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastStateChangeAt: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "ROOT" | "SUBORDINATE" | String */
        var Serial: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "PENDING_CERTIFICATE" | "ACTIVE" | "DELETED" | "DISABLED" | "EXPIRED" | "FAILED" | String */
        var NotBefore: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NotAfter: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: String /* "REQUEST_TIMED_OUT" | "UNSUPPORTED_ALGORITHM" | "OTHER" | String */
        var CertificateAuthorityConfiguration: CertificateAuthorityConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var RevocationConfiguration: RevocationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var RestorableUntil: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CertificateAuthorityConfiguration {
        var KeyAlgorithm: String /* "RSA_2048" | "RSA_4096" | "EC_prime256v1" | "EC_secp384r1" | String */
        var SigningAlgorithm: String /* "SHA256WITHECDSA" | "SHA384WITHECDSA" | "SHA512WITHECDSA" | "SHA256WITHRSA" | "SHA384WITHRSA" | "SHA512WITHRSA" | String */
        var Subject: ASN1Subject
    }
    interface CreateCertificateAuthorityAuditReportRequest {
        var CertificateAuthorityArn: Arn
        var S3BucketName: String
        var AuditReportResponseFormat: String /* "JSON" | "CSV" | String */
    }
    interface CreateCertificateAuthorityAuditReportResponse {
        var AuditReportId: AuditReportId?
            get() = definedExternally
            set(value) = definedExternally
        var S3Key: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCertificateAuthorityRequest {
        var CertificateAuthorityConfiguration: CertificateAuthorityConfiguration
        var RevocationConfiguration: RevocationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateAuthorityType: String /* "ROOT" | "SUBORDINATE" | String */
        var IdempotencyToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCertificateAuthorityResponse {
        var CertificateAuthorityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePermissionRequest {
        var CertificateAuthorityArn: Arn
        var Principal: Principal
        var SourceAccount: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: ActionList
    }
    interface CrlConfiguration {
        var Enabled: Boolean
        var ExpirationInDays: Integer1To5000?
            get() = definedExternally
            set(value) = definedExternally
        var CustomCname: String253?
            get() = definedExternally
            set(value) = definedExternally
        var S3BucketName: String3To255?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCertificateAuthorityRequest {
        var CertificateAuthorityArn: Arn
        var PermanentDeletionTimeInDays: PermanentDeletionTimeInDays?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeletePermissionRequest {
        var CertificateAuthorityArn: Arn
        var Principal: Principal
        var SourceAccount: AccountId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCertificateAuthorityAuditReportRequest {
        var CertificateAuthorityArn: Arn
        var AuditReportId: AuditReportId
    }
    interface DescribeCertificateAuthorityAuditReportResponse {
        var AuditReportStatus: String /* "CREATING" | "SUCCESS" | "FAILED" | String */
        var S3BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3Key: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: TStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCertificateAuthorityRequest {
        var CertificateAuthorityArn: Arn
    }
    interface DescribeCertificateAuthorityResponse {
        var CertificateAuthority: CertificateAuthority?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCertificateAuthorityCertificateRequest {
        var CertificateAuthorityArn: Arn
    }
    interface GetCertificateAuthorityCertificateResponse {
        var Certificate: CertificateBody?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateChain: CertificateChain?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCertificateAuthorityCsrRequest {
        var CertificateAuthorityArn: Arn
    }
    interface GetCertificateAuthorityCsrResponse {
        var Csr: CsrBody?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCertificateRequest {
        var CertificateAuthorityArn: Arn
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
    interface ImportCertificateAuthorityCertificateRequest {
        var CertificateAuthorityArn: Arn
        var Certificate: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var CertificateChain: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IssueCertificateRequest {
        var CertificateAuthorityArn: Arn
        var Csr: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var SigningAlgorithm: String /* "SHA256WITHECDSA" | "SHA384WITHECDSA" | "SHA512WITHECDSA" | "SHA256WITHRSA" | "SHA384WITHRSA" | "SHA512WITHRSA" | String */
        var TemplateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Validity: Validity
        var IdempotencyToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IssueCertificateResponse {
        var CertificateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCertificateAuthoritiesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCertificateAuthoritiesResponse {
        var CertificateAuthorities: CertificateAuthorities?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPermissionsRequest {
        var CertificateAuthorityArn: Arn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPermissionsResponse {
        var Permissions: PermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsRequest {
        var CertificateAuthorityArn: Arn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Permission {
        var CertificateAuthorityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: TStamp?
            get() = definedExternally
            set(value) = definedExternally
        var Principal: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceAccount: String?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: ActionList?
            get() = definedExternally
            set(value) = definedExternally
        var Policy: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreCertificateAuthorityRequest {
        var CertificateAuthorityArn: Arn
    }
    interface RevocationConfiguration {
        var CrlConfiguration: CrlConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokeCertificateRequest {
        var CertificateAuthorityArn: Arn
        var CertificateSerial: String128
        var RevocationReason: String /* "UNSPECIFIED" | "KEY_COMPROMISE" | "CERTIFICATE_AUTHORITY_COMPROMISE" | "AFFILIATION_CHANGED" | "SUPERSEDED" | "CESSATION_OF_OPERATION" | "PRIVILEGE_WITHDRAWN" | "A_A_COMPROMISE" | String */
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagCertificateAuthorityRequest {
        var CertificateAuthorityArn: Arn
        var Tags: TagList
    }
    interface UntagCertificateAuthorityRequest {
        var CertificateAuthorityArn: Arn
        var Tags: TagList
    }
    interface UpdateCertificateAuthorityRequest {
        var CertificateAuthorityArn: Arn
        var RevocationConfiguration: RevocationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "PENDING_CERTIFICATE" | "ACTIVE" | "DELETED" | "DISABLED" | "EXPIRED" | "FAILED" | String */
    }
    interface Validity {
        var Value: PositiveLong
        var Type: String /* "END_DATE" | "ABSOLUTE" | "DAYS" | "MONTHS" | "YEARS" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-08-22" | "latest" | String */
    }
}