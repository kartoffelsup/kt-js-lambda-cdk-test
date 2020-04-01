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
import Route53Domains.BillingRecord
import Route53Domains.DomainSuggestion
import Route53Domains.DomainSummary
import Route53Domains.ExtraParam
import Route53Domains.Nameserver
import Route53Domains.OperationSummary
import Route53Domains.Tag
import Route53Domains.CheckDomainAvailabilityRequest
import Route53Domains.CheckDomainAvailabilityResponse
import Route53Domains.CheckDomainTransferabilityRequest
import Route53Domains.CheckDomainTransferabilityResponse
import Route53Domains.DeleteTagsForDomainRequest
import Route53Domains.DeleteTagsForDomainResponse
import Route53Domains.DisableDomainAutoRenewRequest
import Route53Domains.DisableDomainAutoRenewResponse
import Route53Domains.DisableDomainTransferLockRequest
import Route53Domains.DisableDomainTransferLockResponse
import Route53Domains.EnableDomainAutoRenewRequest
import Route53Domains.EnableDomainAutoRenewResponse
import Route53Domains.EnableDomainTransferLockRequest
import Route53Domains.EnableDomainTransferLockResponse
import Route53Domains.GetContactReachabilityStatusRequest
import Route53Domains.GetContactReachabilityStatusResponse
import Route53Domains.GetDomainDetailRequest
import Route53Domains.GetDomainDetailResponse
import Route53Domains.GetDomainSuggestionsRequest
import Route53Domains.GetDomainSuggestionsResponse
import Route53Domains.GetOperationDetailRequest
import Route53Domains.GetOperationDetailResponse
import Route53Domains.ListDomainsRequest
import Route53Domains.ListDomainsResponse
import Route53Domains.ListOperationsRequest
import Route53Domains.ListOperationsResponse
import Route53Domains.ListTagsForDomainRequest
import Route53Domains.ListTagsForDomainResponse
import Route53Domains.RegisterDomainRequest
import Route53Domains.RegisterDomainResponse
import Route53Domains.RenewDomainRequest
import Route53Domains.RenewDomainResponse
import Route53Domains.ResendContactReachabilityEmailRequest
import Route53Domains.ResendContactReachabilityEmailResponse
import Route53Domains.RetrieveDomainAuthCodeRequest
import Route53Domains.RetrieveDomainAuthCodeResponse
import Route53Domains.TransferDomainRequest
import Route53Domains.TransferDomainResponse
import Route53Domains.UpdateDomainContactRequest
import Route53Domains.UpdateDomainContactResponse
import Route53Domains.UpdateDomainContactPrivacyRequest
import Route53Domains.UpdateDomainContactPrivacyResponse
import Route53Domains.UpdateDomainNameserversRequest
import Route53Domains.UpdateDomainNameserversResponse
import Route53Domains.UpdateTagsForDomainRequest
import Route53Domains.UpdateTagsForDomainResponse
import Route53Domains.ViewBillingRequest
import Route53Domains.ViewBillingResponse
import Route53Domains.DomainTransferability
import Route53Domains.ContactDetail

typealias AddressLine = String

typealias BillingRecords = Array<BillingRecord>

typealias Boolean = Boolean

typealias City = String

typealias ContactName = String

typealias ContactNumber = String

typealias CurrentExpiryYear = Number

typealias DNSSec = String

typealias DomainAuthCode = String

typealias DomainName = String

typealias DomainStatus = String

typealias DomainStatusList = Array<DomainStatus>

typealias DomainSuggestionsList = Array<DomainSuggestion>

typealias DomainSummaryList = Array<DomainSummary>

typealias DurationInYears = Number

typealias Email = String

typealias ErrorMessage = String

typealias ExtraParamList = Array<ExtraParam>

typealias ExtraParamValue = String

typealias FIAuthKey = String

typealias GlueIp = String

typealias GlueIpList = Array<GlueIp>

typealias HostName = String

typealias Integer = Number

typealias InvoiceId = String

typealias LangCode = String

typealias NameserverList = Array<Nameserver>

typealias OperationId = String

typealias OperationSummaryList = Array<OperationSummary>

typealias PageMarker = String

typealias PageMaxItems = Number

typealias Price = Number

typealias RegistrarName = String

typealias RegistrarUrl = String

typealias RegistrarWhoIsServer = String

typealias RegistryDomainId = String

typealias Reseller = String

typealias State = String

typealias String = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Timestamp = Date

typealias ZipCode = String

@JsModule("aws-sdk")
external open class Route53Domains(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Route53Domains.Types.ClientConfiguration */
    open fun checkDomainAvailability(params: CheckDomainAvailabilityRequest, callback: (err: AWSError, data: CheckDomainAvailabilityResponse) -> Unit = definedExternally): Request<CheckDomainAvailabilityResponse, AWSError>
    open fun checkDomainAvailability(callback: (err: AWSError, data: CheckDomainAvailabilityResponse) -> Unit = definedExternally): Request<CheckDomainAvailabilityResponse, AWSError>
    open fun checkDomainTransferability(params: CheckDomainTransferabilityRequest, callback: (err: AWSError, data: CheckDomainTransferabilityResponse) -> Unit = definedExternally): Request<CheckDomainTransferabilityResponse, AWSError>
    open fun checkDomainTransferability(callback: (err: AWSError, data: CheckDomainTransferabilityResponse) -> Unit = definedExternally): Request<CheckDomainTransferabilityResponse, AWSError>
    open fun deleteTagsForDomain(params: DeleteTagsForDomainRequest, callback: (err: AWSError, data: DeleteTagsForDomainResponse) -> Unit = definedExternally): Request<DeleteTagsForDomainResponse, AWSError>
    open fun deleteTagsForDomain(callback: (err: AWSError, data: DeleteTagsForDomainResponse) -> Unit = definedExternally): Request<DeleteTagsForDomainResponse, AWSError>
    open fun disableDomainAutoRenew(params: DisableDomainAutoRenewRequest, callback: (err: AWSError, data: DisableDomainAutoRenewResponse) -> Unit = definedExternally): Request<DisableDomainAutoRenewResponse, AWSError>
    open fun disableDomainAutoRenew(callback: (err: AWSError, data: DisableDomainAutoRenewResponse) -> Unit = definedExternally): Request<DisableDomainAutoRenewResponse, AWSError>
    open fun disableDomainTransferLock(params: DisableDomainTransferLockRequest, callback: (err: AWSError, data: DisableDomainTransferLockResponse) -> Unit = definedExternally): Request<DisableDomainTransferLockResponse, AWSError>
    open fun disableDomainTransferLock(callback: (err: AWSError, data: DisableDomainTransferLockResponse) -> Unit = definedExternally): Request<DisableDomainTransferLockResponse, AWSError>
    open fun enableDomainAutoRenew(params: EnableDomainAutoRenewRequest, callback: (err: AWSError, data: EnableDomainAutoRenewResponse) -> Unit = definedExternally): Request<EnableDomainAutoRenewResponse, AWSError>
    open fun enableDomainAutoRenew(callback: (err: AWSError, data: EnableDomainAutoRenewResponse) -> Unit = definedExternally): Request<EnableDomainAutoRenewResponse, AWSError>
    open fun enableDomainTransferLock(params: EnableDomainTransferLockRequest, callback: (err: AWSError, data: EnableDomainTransferLockResponse) -> Unit = definedExternally): Request<EnableDomainTransferLockResponse, AWSError>
    open fun enableDomainTransferLock(callback: (err: AWSError, data: EnableDomainTransferLockResponse) -> Unit = definedExternally): Request<EnableDomainTransferLockResponse, AWSError>
    open fun getContactReachabilityStatus(params: GetContactReachabilityStatusRequest, callback: (err: AWSError, data: GetContactReachabilityStatusResponse) -> Unit = definedExternally): Request<GetContactReachabilityStatusResponse, AWSError>
    open fun getContactReachabilityStatus(callback: (err: AWSError, data: GetContactReachabilityStatusResponse) -> Unit = definedExternally): Request<GetContactReachabilityStatusResponse, AWSError>
    open fun getDomainDetail(params: GetDomainDetailRequest, callback: (err: AWSError, data: GetDomainDetailResponse) -> Unit = definedExternally): Request<GetDomainDetailResponse, AWSError>
    open fun getDomainDetail(callback: (err: AWSError, data: GetDomainDetailResponse) -> Unit = definedExternally): Request<GetDomainDetailResponse, AWSError>
    open fun getDomainSuggestions(params: GetDomainSuggestionsRequest, callback: (err: AWSError, data: GetDomainSuggestionsResponse) -> Unit = definedExternally): Request<GetDomainSuggestionsResponse, AWSError>
    open fun getDomainSuggestions(callback: (err: AWSError, data: GetDomainSuggestionsResponse) -> Unit = definedExternally): Request<GetDomainSuggestionsResponse, AWSError>
    open fun getOperationDetail(params: GetOperationDetailRequest, callback: (err: AWSError, data: GetOperationDetailResponse) -> Unit = definedExternally): Request<GetOperationDetailResponse, AWSError>
    open fun getOperationDetail(callback: (err: AWSError, data: GetOperationDetailResponse) -> Unit = definedExternally): Request<GetOperationDetailResponse, AWSError>
    open fun listDomains(params: ListDomainsRequest, callback: (err: AWSError, data: ListDomainsResponse) -> Unit = definedExternally): Request<ListDomainsResponse, AWSError>
    open fun listDomains(callback: (err: AWSError, data: ListDomainsResponse) -> Unit = definedExternally): Request<ListDomainsResponse, AWSError>
    open fun listOperations(params: ListOperationsRequest, callback: (err: AWSError, data: ListOperationsResponse) -> Unit = definedExternally): Request<ListOperationsResponse, AWSError>
    open fun listOperations(callback: (err: AWSError, data: ListOperationsResponse) -> Unit = definedExternally): Request<ListOperationsResponse, AWSError>
    open fun listTagsForDomain(params: ListTagsForDomainRequest, callback: (err: AWSError, data: ListTagsForDomainResponse) -> Unit = definedExternally): Request<ListTagsForDomainResponse, AWSError>
    open fun listTagsForDomain(callback: (err: AWSError, data: ListTagsForDomainResponse) -> Unit = definedExternally): Request<ListTagsForDomainResponse, AWSError>
    open fun registerDomain(params: RegisterDomainRequest, callback: (err: AWSError, data: RegisterDomainResponse) -> Unit = definedExternally): Request<RegisterDomainResponse, AWSError>
    open fun registerDomain(callback: (err: AWSError, data: RegisterDomainResponse) -> Unit = definedExternally): Request<RegisterDomainResponse, AWSError>
    open fun renewDomain(params: RenewDomainRequest, callback: (err: AWSError, data: RenewDomainResponse) -> Unit = definedExternally): Request<RenewDomainResponse, AWSError>
    open fun renewDomain(callback: (err: AWSError, data: RenewDomainResponse) -> Unit = definedExternally): Request<RenewDomainResponse, AWSError>
    open fun resendContactReachabilityEmail(params: ResendContactReachabilityEmailRequest, callback: (err: AWSError, data: ResendContactReachabilityEmailResponse) -> Unit = definedExternally): Request<ResendContactReachabilityEmailResponse, AWSError>
    open fun resendContactReachabilityEmail(callback: (err: AWSError, data: ResendContactReachabilityEmailResponse) -> Unit = definedExternally): Request<ResendContactReachabilityEmailResponse, AWSError>
    open fun retrieveDomainAuthCode(params: RetrieveDomainAuthCodeRequest, callback: (err: AWSError, data: RetrieveDomainAuthCodeResponse) -> Unit = definedExternally): Request<RetrieveDomainAuthCodeResponse, AWSError>
    open fun retrieveDomainAuthCode(callback: (err: AWSError, data: RetrieveDomainAuthCodeResponse) -> Unit = definedExternally): Request<RetrieveDomainAuthCodeResponse, AWSError>
    open fun transferDomain(params: TransferDomainRequest, callback: (err: AWSError, data: TransferDomainResponse) -> Unit = definedExternally): Request<TransferDomainResponse, AWSError>
    open fun transferDomain(callback: (err: AWSError, data: TransferDomainResponse) -> Unit = definedExternally): Request<TransferDomainResponse, AWSError>
    open fun updateDomainContact(params: UpdateDomainContactRequest, callback: (err: AWSError, data: UpdateDomainContactResponse) -> Unit = definedExternally): Request<UpdateDomainContactResponse, AWSError>
    open fun updateDomainContact(callback: (err: AWSError, data: UpdateDomainContactResponse) -> Unit = definedExternally): Request<UpdateDomainContactResponse, AWSError>
    open fun updateDomainContactPrivacy(params: UpdateDomainContactPrivacyRequest, callback: (err: AWSError, data: UpdateDomainContactPrivacyResponse) -> Unit = definedExternally): Request<UpdateDomainContactPrivacyResponse, AWSError>
    open fun updateDomainContactPrivacy(callback: (err: AWSError, data: UpdateDomainContactPrivacyResponse) -> Unit = definedExternally): Request<UpdateDomainContactPrivacyResponse, AWSError>
    open fun updateDomainNameservers(params: UpdateDomainNameserversRequest, callback: (err: AWSError, data: UpdateDomainNameserversResponse) -> Unit = definedExternally): Request<UpdateDomainNameserversResponse, AWSError>
    open fun updateDomainNameservers(callback: (err: AWSError, data: UpdateDomainNameserversResponse) -> Unit = definedExternally): Request<UpdateDomainNameserversResponse, AWSError>
    open fun updateTagsForDomain(params: UpdateTagsForDomainRequest, callback: (err: AWSError, data: UpdateTagsForDomainResponse) -> Unit = definedExternally): Request<UpdateTagsForDomainResponse, AWSError>
    open fun updateTagsForDomain(callback: (err: AWSError, data: UpdateTagsForDomainResponse) -> Unit = definedExternally): Request<UpdateTagsForDomainResponse, AWSError>
    open fun viewBilling(params: ViewBillingRequest, callback: (err: AWSError, data: ViewBillingResponse) -> Unit = definedExternally): Request<ViewBillingResponse, AWSError>
    open fun viewBilling(callback: (err: AWSError, data: ViewBillingResponse) -> Unit = definedExternally): Request<ViewBillingResponse, AWSError>
    interface BillingRecord {
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var Operation: String /* "REGISTER_DOMAIN" | "DELETE_DOMAIN" | "TRANSFER_IN_DOMAIN" | "UPDATE_DOMAIN_CONTACT" | "UPDATE_NAMESERVER" | "CHANGE_PRIVACY_PROTECTION" | "DOMAIN_LOCK" | "ENABLE_AUTORENEW" | "DISABLE_AUTORENEW" | "ADD_DNSSEC" | "REMOVE_DNSSEC" | "EXPIRE_DOMAIN" | "TRANSFER_OUT_DOMAIN" | "CHANGE_DOMAIN_OWNER" | "RENEW_DOMAIN" | "PUSH_DOMAIN" | String */
        var InvoiceId: InvoiceId?
            get() = definedExternally
            set(value) = definedExternally
        var BillDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Price: Price?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CheckDomainAvailabilityRequest {
        var DomainName: DomainName
        var IdnLangCode: LangCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CheckDomainAvailabilityResponse {
        var Availability: String /* "AVAILABLE" | "AVAILABLE_RESERVED" | "AVAILABLE_PREORDER" | "UNAVAILABLE" | "UNAVAILABLE_PREMIUM" | "UNAVAILABLE_RESTRICTED" | "RESERVED" | "DONT_KNOW" | String */
    }
    interface CheckDomainTransferabilityRequest {
        var DomainName: DomainName
        var AuthCode: DomainAuthCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CheckDomainTransferabilityResponse {
        var Transferability: DomainTransferability
    }
    interface ContactDetail {
        var FirstName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var LastName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var ContactType: String /* "PERSON" | "COMPANY" | "ASSOCIATION" | "PUBLIC_BODY" | "RESELLER" | String */
        var OrganizationName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var AddressLine1: AddressLine?
            get() = definedExternally
            set(value) = definedExternally
        var AddressLine2: AddressLine?
            get() = definedExternally
            set(value) = definedExternally
        var City: City?
            get() = definedExternally
            set(value) = definedExternally
        var State: State?
            get() = definedExternally
            set(value) = definedExternally
        var CountryCode: String /* "AD" | "AE" | "AF" | "AG" | "AI" | "AL" | "AM" | "AN" | "AO" | "AQ" | "AR" | "AS" | "AT" | "AU" | "AW" | "AZ" | "BA" | "BB" | "BD" | "BE" | "BF" | "BG" | "BH" | "BI" | "BJ" | "BL" | "BM" | "BN" | "BO" | "BR" | "BS" | "BT" | "BW" | "BY" | "BZ" | "CA" | "CC" | "CD" | "CF" | "CG" | "CH" | "CI" | "CK" | "CL" | "CM" | "CN" | "CO" | "CR" | "CU" | "CV" | "CX" | "CY" | "CZ" | "DE" | "DJ" | "DK" | "DM" | "DO" | "DZ" | "EC" | "EE" | "EG" | "ER" | "ES" | "ET" | "FI" | "FJ" | "FK" | "FM" | "FO" | "FR" | "GA" | "GB" | "GD" | "GE" | "GH" | "GI" | "GL" | "GM" | "GN" | "GQ" | "GR" | "GT" | "GU" | "GW" | "GY" | "HK" | "HN" | "HR" | "HT" | "HU" | "ID" | "IE" | "IL" | "IM" | "IN" | "IQ" | "IR" | "IS" | "IT" | "JM" | "JO" | "JP" | "KE" | "KG" | "KH" | "KI" | "KM" | "KN" | "KP" | "KR" | "KW" | "KY" | "KZ" | "LA" | "LB" | "LC" | "LI" | "LK" | "LR" | "LS" | "LT" | "LU" | "LV" | "LY" | "MA" | "MC" | "MD" | "ME" | "MF" | "MG" | "MH" | "MK" | "ML" | "MM" | "MN" | "MO" | "MP" | "MR" | "MS" | "MT" | "MU" | "MV" | "MW" | "MX" | "MY" | "MZ" | "NA" | "NC" | "NE" | "NG" | "NI" | "NL" | "NO" | "NP" | "NR" | "NU" | "NZ" | "OM" | "PA" | "PE" | "PF" | "PG" | "PH" | "PK" | "PL" | "PM" | "PN" | "PR" | "PT" | "PW" | "PY" | "QA" | "RO" | "RS" | "RU" | "RW" | "SA" | "SB" | "SC" | "SD" | "SE" | "SG" | "SH" | "SI" | "SK" | "SL" | "SM" | "SN" | "SO" | "SR" | "ST" | "SV" | "SY" | "SZ" | "TC" | "TD" | "TG" | "TH" | "TJ" | "TK" | "TL" | "TM" | "TN" | "TO" | "TR" | "TT" | "TV" | "TW" | "TZ" | "UA" | "UG" | "US" | "UY" | "UZ" | "VA" | "VC" | "VE" | "VG" | "VI" | "VN" | "VU" | "WF" | "WS" | "YE" | "YT" | "ZA" | "ZM" | "ZW" | String */
        var ZipCode: ZipCode?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumber: ContactNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var Fax: ContactNumber?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraParams: ExtraParamList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTagsForDomainRequest {
        var DomainName: DomainName
        var TagsToDelete: TagKeyList
    }
    interface DeleteTagsForDomainResponse
    interface DisableDomainAutoRenewRequest {
        var DomainName: DomainName
    }
    interface DisableDomainAutoRenewResponse
    interface DisableDomainTransferLockRequest {
        var DomainName: DomainName
    }
    interface DisableDomainTransferLockResponse {
        var OperationId: OperationId
    }
    interface DomainSuggestion {
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var Availability: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainSummary {
        var DomainName: DomainName
        var AutoRenew: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TransferLock: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Expiry: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainTransferability {
        var Transferable: String /* "TRANSFERABLE" | "UNTRANSFERABLE" | "DONT_KNOW" | String */
    }
    interface EnableDomainAutoRenewRequest {
        var DomainName: DomainName
    }
    interface EnableDomainAutoRenewResponse
    interface EnableDomainTransferLockRequest {
        var DomainName: DomainName
    }
    interface EnableDomainTransferLockResponse {
        var OperationId: OperationId
    }
    interface ExtraParam {
        var Name: String /* "DUNS_NUMBER" | "BRAND_NUMBER" | "BIRTH_DEPARTMENT" | "BIRTH_DATE_IN_YYYY_MM_DD" | "BIRTH_COUNTRY" | "BIRTH_CITY" | "DOCUMENT_NUMBER" | "AU_ID_NUMBER" | "AU_ID_TYPE" | "CA_LEGAL_TYPE" | "CA_BUSINESS_ENTITY_TYPE" | "ES_IDENTIFICATION" | "ES_IDENTIFICATION_TYPE" | "ES_LEGAL_FORM" | "FI_BUSINESS_NUMBER" | "FI_ID_NUMBER" | "FI_NATIONALITY" | "FI_ORGANIZATION_TYPE" | "IT_PIN" | "IT_REGISTRANT_ENTITY_TYPE" | "RU_PASSPORT_DATA" | "SE_ID_NUMBER" | "SG_ID_NUMBER" | "VAT_NUMBER" | "UK_CONTACT_TYPE" | "UK_COMPANY_NUMBER" | String */
        var Value: ExtraParamValue
    }
    interface GetContactReachabilityStatusRequest {
        var domainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetContactReachabilityStatusResponse {
        var domainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "PENDING" | "DONE" | "EXPIRED" | String */
    }
    interface GetDomainDetailRequest {
        var DomainName: DomainName
    }
    interface GetDomainDetailResponse {
        var DomainName: DomainName
        var Nameservers: NameserverList
        var AutoRenew: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AdminContact: ContactDetail
        var RegistrantContact: ContactDetail
        var TechContact: ContactDetail
        var AdminPrivacy: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RegistrantPrivacy: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TechPrivacy: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RegistrarName: RegistrarName?
            get() = definedExternally
            set(value) = definedExternally
        var WhoIsServer: RegistrarWhoIsServer?
            get() = definedExternally
            set(value) = definedExternally
        var RegistrarUrl: RegistrarUrl?
            get() = definedExternally
            set(value) = definedExternally
        var AbuseContactEmail: Email?
            get() = definedExternally
            set(value) = definedExternally
        var AbuseContactPhone: ContactNumber?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryDomainId: RegistryDomainId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Reseller: Reseller?
            get() = definedExternally
            set(value) = definedExternally
        var DnsSec: DNSSec?
            get() = definedExternally
            set(value) = definedExternally
        var StatusList: DomainStatusList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDomainSuggestionsRequest {
        var DomainName: DomainName
        var SuggestionCount: Integer
        var OnlyAvailable: Boolean
    }
    interface GetDomainSuggestionsResponse {
        var SuggestionsList: DomainSuggestionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOperationDetailRequest {
        var OperationId: OperationId
    }
    interface GetOperationDetailResponse {
        var OperationId: OperationId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "SUBMITTED" | "IN_PROGRESS" | "ERROR" | "SUCCESSFUL" | "FAILED" | String */
        var Message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "REGISTER_DOMAIN" | "DELETE_DOMAIN" | "TRANSFER_IN_DOMAIN" | "UPDATE_DOMAIN_CONTACT" | "UPDATE_NAMESERVER" | "CHANGE_PRIVACY_PROTECTION" | "DOMAIN_LOCK" | "ENABLE_AUTORENEW" | "DISABLE_AUTORENEW" | "ADD_DNSSEC" | "REMOVE_DNSSEC" | "EXPIRE_DOMAIN" | "TRANSFER_OUT_DOMAIN" | "CHANGE_DOMAIN_OWNER" | "RENEW_DOMAIN" | "PUSH_DOMAIN" | String */
        var SubmittedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainsRequest {
        var Marker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainsResponse {
        var Domains: DomainSummaryList
        var NextPageMarker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOperationsRequest {
        var SubmittedSince: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOperationsResponse {
        var Operations: OperationSummaryList
        var NextPageMarker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForDomainRequest {
        var DomainName: DomainName
    }
    interface ListTagsForDomainResponse {
        var TagList: TagList
    }
    interface Nameserver {
        var Name: HostName
        var GlueIps: GlueIpList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OperationSummary {
        var OperationId: OperationId
        var Status: String /* "SUBMITTED" | "IN_PROGRESS" | "ERROR" | "SUCCESSFUL" | "FAILED" | String */
        var Type: String /* "REGISTER_DOMAIN" | "DELETE_DOMAIN" | "TRANSFER_IN_DOMAIN" | "UPDATE_DOMAIN_CONTACT" | "UPDATE_NAMESERVER" | "CHANGE_PRIVACY_PROTECTION" | "DOMAIN_LOCK" | "ENABLE_AUTORENEW" | "DISABLE_AUTORENEW" | "ADD_DNSSEC" | "REMOVE_DNSSEC" | "EXPIRE_DOMAIN" | "TRANSFER_OUT_DOMAIN" | "CHANGE_DOMAIN_OWNER" | "RENEW_DOMAIN" | "PUSH_DOMAIN" | String */
        var SubmittedDate: Timestamp
    }
    interface RegisterDomainRequest {
        var DomainName: DomainName
        var IdnLangCode: LangCode?
            get() = definedExternally
            set(value) = definedExternally
        var DurationInYears: DurationInYears
        var AutoRenew: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AdminContact: ContactDetail
        var RegistrantContact: ContactDetail
        var TechContact: ContactDetail
        var PrivacyProtectAdminContact: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PrivacyProtectRegistrantContact: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PrivacyProtectTechContact: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterDomainResponse {
        var OperationId: OperationId
    }
    interface RenewDomainRequest {
        var DomainName: DomainName
        var DurationInYears: DurationInYears?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentExpiryYear: CurrentExpiryYear
    }
    interface RenewDomainResponse {
        var OperationId: OperationId
    }
    interface ResendContactReachabilityEmailRequest {
        var domainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResendContactReachabilityEmailResponse {
        var domainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var emailAddress: Email?
            get() = definedExternally
            set(value) = definedExternally
        var isAlreadyVerified: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RetrieveDomainAuthCodeRequest {
        var DomainName: DomainName
    }
    interface RetrieveDomainAuthCodeResponse {
        var AuthCode: DomainAuthCode
    }
    interface Tag {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransferDomainRequest {
        var DomainName: DomainName
        var IdnLangCode: LangCode?
            get() = definedExternally
            set(value) = definedExternally
        var DurationInYears: DurationInYears
        var Nameservers: NameserverList?
            get() = definedExternally
            set(value) = definedExternally
        var AuthCode: DomainAuthCode?
            get() = definedExternally
            set(value) = definedExternally
        var AutoRenew: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AdminContact: ContactDetail
        var RegistrantContact: ContactDetail
        var TechContact: ContactDetail
        var PrivacyProtectAdminContact: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PrivacyProtectRegistrantContact: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PrivacyProtectTechContact: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransferDomainResponse {
        var OperationId: OperationId
    }
    interface UpdateDomainContactPrivacyRequest {
        var DomainName: DomainName
        var AdminPrivacy: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RegistrantPrivacy: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TechPrivacy: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDomainContactPrivacyResponse {
        var OperationId: OperationId
    }
    interface UpdateDomainContactRequest {
        var DomainName: DomainName
        var AdminContact: ContactDetail?
            get() = definedExternally
            set(value) = definedExternally
        var RegistrantContact: ContactDetail?
            get() = definedExternally
            set(value) = definedExternally
        var TechContact: ContactDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDomainContactResponse {
        var OperationId: OperationId
    }
    interface UpdateDomainNameserversRequest {
        var DomainName: DomainName
        var FIAuthKey: FIAuthKey?
            get() = definedExternally
            set(value) = definedExternally
        var Nameservers: NameserverList
    }
    interface UpdateDomainNameserversResponse {
        var OperationId: OperationId
    }
    interface UpdateTagsForDomainRequest {
        var DomainName: DomainName
        var TagsToUpdate: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTagsForDomainResponse
    interface ViewBillingRequest {
        var Start: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var End: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: PageMaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ViewBillingResponse {
        var NextPageMarker: PageMarker?
            get() = definedExternally
            set(value) = definedExternally
        var BillingRecords: BillingRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-05-15" | "latest" | String */
    }
}