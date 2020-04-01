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
import WorkLink.DeviceSummary
import WorkLink.DomainSummary
import WorkLink.FleetSummary
import WorkLink.WebsiteAuthorizationProviderSummary
import WorkLink.WebsiteCaSummary
import WorkLink.AssociateDomainRequest
import WorkLink.AssociateDomainResponse
import WorkLink.AssociateWebsiteAuthorizationProviderRequest
import WorkLink.AssociateWebsiteAuthorizationProviderResponse
import WorkLink.AssociateWebsiteCertificateAuthorityRequest
import WorkLink.AssociateWebsiteCertificateAuthorityResponse
import WorkLink.CreateFleetRequest
import WorkLink.CreateFleetResponse
import WorkLink.DeleteFleetRequest
import WorkLink.DeleteFleetResponse
import WorkLink.DescribeAuditStreamConfigurationRequest
import WorkLink.DescribeAuditStreamConfigurationResponse
import WorkLink.DescribeCompanyNetworkConfigurationRequest
import WorkLink.DescribeCompanyNetworkConfigurationResponse
import WorkLink.DescribeDeviceRequest
import WorkLink.DescribeDeviceResponse
import WorkLink.DescribeDevicePolicyConfigurationRequest
import WorkLink.DescribeDevicePolicyConfigurationResponse
import WorkLink.DescribeDomainRequest
import WorkLink.DescribeDomainResponse
import WorkLink.DescribeFleetMetadataRequest
import WorkLink.DescribeFleetMetadataResponse
import WorkLink.DescribeIdentityProviderConfigurationRequest
import WorkLink.DescribeIdentityProviderConfigurationResponse
import WorkLink.DescribeWebsiteCertificateAuthorityRequest
import WorkLink.DescribeWebsiteCertificateAuthorityResponse
import WorkLink.DisassociateDomainRequest
import WorkLink.DisassociateDomainResponse
import WorkLink.DisassociateWebsiteAuthorizationProviderRequest
import WorkLink.DisassociateWebsiteAuthorizationProviderResponse
import WorkLink.DisassociateWebsiteCertificateAuthorityRequest
import WorkLink.DisassociateWebsiteCertificateAuthorityResponse
import WorkLink.ListDevicesRequest
import WorkLink.ListDevicesResponse
import WorkLink.ListDomainsRequest
import WorkLink.ListDomainsResponse
import WorkLink.ListFleetsRequest
import WorkLink.ListFleetsResponse
import WorkLink.ListWebsiteAuthorizationProvidersRequest
import WorkLink.ListWebsiteAuthorizationProvidersResponse
import WorkLink.ListWebsiteCertificateAuthoritiesRequest
import WorkLink.ListWebsiteCertificateAuthoritiesResponse
import WorkLink.RestoreDomainAccessRequest
import WorkLink.RestoreDomainAccessResponse
import WorkLink.RevokeDomainAccessRequest
import WorkLink.RevokeDomainAccessResponse
import WorkLink.SignOutUserRequest
import WorkLink.SignOutUserResponse
import WorkLink.UpdateAuditStreamConfigurationRequest
import WorkLink.UpdateAuditStreamConfigurationResponse
import WorkLink.UpdateCompanyNetworkConfigurationRequest
import WorkLink.UpdateCompanyNetworkConfigurationResponse
import WorkLink.UpdateDevicePolicyConfigurationRequest
import WorkLink.UpdateDevicePolicyConfigurationResponse
import WorkLink.UpdateDomainMetadataRequest
import WorkLink.UpdateDomainMetadataResponse
import WorkLink.UpdateFleetMetadataRequest
import WorkLink.UpdateFleetMetadataResponse
import WorkLink.UpdateIdentityProviderConfigurationRequest
import WorkLink.UpdateIdentityProviderConfigurationResponse

typealias AcmCertificateArn = String

typealias AuditStreamArn = String

typealias Boolean = Boolean

typealias Certificate = String

typealias CertificateChain = String

typealias CompanyCode = String

typealias DateTime = Date

typealias DeviceManufacturer = String

typealias DeviceModel = String

typealias DeviceOperatingSystemName = String

typealias DeviceOperatingSystemVersion = String

typealias DevicePatchLevel = String

typealias DeviceSummaryList = Array<DeviceSummary>

typealias DisplayName = String

typealias DomainName = String

typealias DomainSummaryList = Array<DomainSummary>

typealias FleetArn = String

typealias FleetName = String

typealias FleetSummaryList = Array<FleetSummary>

typealias Id = String

typealias MaxResults = Number

typealias NextToken = String

typealias SamlMetadata = String

typealias SecurityGroupId = String

typealias SecurityGroupIds = Array<SecurityGroupId>

typealias SubnetId = String

typealias SubnetIds = Array<SubnetId>

typealias Username = String

typealias VpcId = String

typealias WebsiteAuthorizationProvidersSummaryList = Array<WebsiteAuthorizationProviderSummary>

typealias WebsiteCaSummaryList = Array<WebsiteCaSummary>

@JsModule("aws-sdk")
external open class WorkLink(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & WorkLink.Types.ClientConfiguration */
    open fun associateDomain(params: AssociateDomainRequest, callback: (err: AWSError, data: AssociateDomainResponse) -> Unit = definedExternally): Request<AssociateDomainResponse, AWSError>
    open fun associateDomain(callback: (err: AWSError, data: AssociateDomainResponse) -> Unit = definedExternally): Request<AssociateDomainResponse, AWSError>
    open fun associateWebsiteAuthorizationProvider(params: AssociateWebsiteAuthorizationProviderRequest, callback: (err: AWSError, data: AssociateWebsiteAuthorizationProviderResponse) -> Unit = definedExternally): Request<AssociateWebsiteAuthorizationProviderResponse, AWSError>
    open fun associateWebsiteAuthorizationProvider(callback: (err: AWSError, data: AssociateWebsiteAuthorizationProviderResponse) -> Unit = definedExternally): Request<AssociateWebsiteAuthorizationProviderResponse, AWSError>
    open fun associateWebsiteCertificateAuthority(params: AssociateWebsiteCertificateAuthorityRequest, callback: (err: AWSError, data: AssociateWebsiteCertificateAuthorityResponse) -> Unit = definedExternally): Request<AssociateWebsiteCertificateAuthorityResponse, AWSError>
    open fun associateWebsiteCertificateAuthority(callback: (err: AWSError, data: AssociateWebsiteCertificateAuthorityResponse) -> Unit = definedExternally): Request<AssociateWebsiteCertificateAuthorityResponse, AWSError>
    open fun createFleet(params: CreateFleetRequest, callback: (err: AWSError, data: CreateFleetResponse) -> Unit = definedExternally): Request<CreateFleetResponse, AWSError>
    open fun createFleet(callback: (err: AWSError, data: CreateFleetResponse) -> Unit = definedExternally): Request<CreateFleetResponse, AWSError>
    open fun deleteFleet(params: DeleteFleetRequest, callback: (err: AWSError, data: DeleteFleetResponse) -> Unit = definedExternally): Request<DeleteFleetResponse, AWSError>
    open fun deleteFleet(callback: (err: AWSError, data: DeleteFleetResponse) -> Unit = definedExternally): Request<DeleteFleetResponse, AWSError>
    open fun describeAuditStreamConfiguration(params: DescribeAuditStreamConfigurationRequest, callback: (err: AWSError, data: DescribeAuditStreamConfigurationResponse) -> Unit = definedExternally): Request<DescribeAuditStreamConfigurationResponse, AWSError>
    open fun describeAuditStreamConfiguration(callback: (err: AWSError, data: DescribeAuditStreamConfigurationResponse) -> Unit = definedExternally): Request<DescribeAuditStreamConfigurationResponse, AWSError>
    open fun describeCompanyNetworkConfiguration(params: DescribeCompanyNetworkConfigurationRequest, callback: (err: AWSError, data: DescribeCompanyNetworkConfigurationResponse) -> Unit = definedExternally): Request<DescribeCompanyNetworkConfigurationResponse, AWSError>
    open fun describeCompanyNetworkConfiguration(callback: (err: AWSError, data: DescribeCompanyNetworkConfigurationResponse) -> Unit = definedExternally): Request<DescribeCompanyNetworkConfigurationResponse, AWSError>
    open fun describeDevice(params: DescribeDeviceRequest, callback: (err: AWSError, data: DescribeDeviceResponse) -> Unit = definedExternally): Request<DescribeDeviceResponse, AWSError>
    open fun describeDevice(callback: (err: AWSError, data: DescribeDeviceResponse) -> Unit = definedExternally): Request<DescribeDeviceResponse, AWSError>
    open fun describeDevicePolicyConfiguration(params: DescribeDevicePolicyConfigurationRequest, callback: (err: AWSError, data: DescribeDevicePolicyConfigurationResponse) -> Unit = definedExternally): Request<DescribeDevicePolicyConfigurationResponse, AWSError>
    open fun describeDevicePolicyConfiguration(callback: (err: AWSError, data: DescribeDevicePolicyConfigurationResponse) -> Unit = definedExternally): Request<DescribeDevicePolicyConfigurationResponse, AWSError>
    open fun describeDomain(params: DescribeDomainRequest, callback: (err: AWSError, data: DescribeDomainResponse) -> Unit = definedExternally): Request<DescribeDomainResponse, AWSError>
    open fun describeDomain(callback: (err: AWSError, data: DescribeDomainResponse) -> Unit = definedExternally): Request<DescribeDomainResponse, AWSError>
    open fun describeFleetMetadata(params: DescribeFleetMetadataRequest, callback: (err: AWSError, data: DescribeFleetMetadataResponse) -> Unit = definedExternally): Request<DescribeFleetMetadataResponse, AWSError>
    open fun describeFleetMetadata(callback: (err: AWSError, data: DescribeFleetMetadataResponse) -> Unit = definedExternally): Request<DescribeFleetMetadataResponse, AWSError>
    open fun describeIdentityProviderConfiguration(params: DescribeIdentityProviderConfigurationRequest, callback: (err: AWSError, data: DescribeIdentityProviderConfigurationResponse) -> Unit = definedExternally): Request<DescribeIdentityProviderConfigurationResponse, AWSError>
    open fun describeIdentityProviderConfiguration(callback: (err: AWSError, data: DescribeIdentityProviderConfigurationResponse) -> Unit = definedExternally): Request<DescribeIdentityProviderConfigurationResponse, AWSError>
    open fun describeWebsiteCertificateAuthority(params: DescribeWebsiteCertificateAuthorityRequest, callback: (err: AWSError, data: DescribeWebsiteCertificateAuthorityResponse) -> Unit = definedExternally): Request<DescribeWebsiteCertificateAuthorityResponse, AWSError>
    open fun describeWebsiteCertificateAuthority(callback: (err: AWSError, data: DescribeWebsiteCertificateAuthorityResponse) -> Unit = definedExternally): Request<DescribeWebsiteCertificateAuthorityResponse, AWSError>
    open fun disassociateDomain(params: DisassociateDomainRequest, callback: (err: AWSError, data: DisassociateDomainResponse) -> Unit = definedExternally): Request<DisassociateDomainResponse, AWSError>
    open fun disassociateDomain(callback: (err: AWSError, data: DisassociateDomainResponse) -> Unit = definedExternally): Request<DisassociateDomainResponse, AWSError>
    open fun disassociateWebsiteAuthorizationProvider(params: DisassociateWebsiteAuthorizationProviderRequest, callback: (err: AWSError, data: DisassociateWebsiteAuthorizationProviderResponse) -> Unit = definedExternally): Request<DisassociateWebsiteAuthorizationProviderResponse, AWSError>
    open fun disassociateWebsiteAuthorizationProvider(callback: (err: AWSError, data: DisassociateWebsiteAuthorizationProviderResponse) -> Unit = definedExternally): Request<DisassociateWebsiteAuthorizationProviderResponse, AWSError>
    open fun disassociateWebsiteCertificateAuthority(params: DisassociateWebsiteCertificateAuthorityRequest, callback: (err: AWSError, data: DisassociateWebsiteCertificateAuthorityResponse) -> Unit = definedExternally): Request<DisassociateWebsiteCertificateAuthorityResponse, AWSError>
    open fun disassociateWebsiteCertificateAuthority(callback: (err: AWSError, data: DisassociateWebsiteCertificateAuthorityResponse) -> Unit = definedExternally): Request<DisassociateWebsiteCertificateAuthorityResponse, AWSError>
    open fun listDevices(params: ListDevicesRequest, callback: (err: AWSError, data: ListDevicesResponse) -> Unit = definedExternally): Request<ListDevicesResponse, AWSError>
    open fun listDevices(callback: (err: AWSError, data: ListDevicesResponse) -> Unit = definedExternally): Request<ListDevicesResponse, AWSError>
    open fun listDomains(params: ListDomainsRequest, callback: (err: AWSError, data: ListDomainsResponse) -> Unit = definedExternally): Request<ListDomainsResponse, AWSError>
    open fun listDomains(callback: (err: AWSError, data: ListDomainsResponse) -> Unit = definedExternally): Request<ListDomainsResponse, AWSError>
    open fun listFleets(params: ListFleetsRequest, callback: (err: AWSError, data: ListFleetsResponse) -> Unit = definedExternally): Request<ListFleetsResponse, AWSError>
    open fun listFleets(callback: (err: AWSError, data: ListFleetsResponse) -> Unit = definedExternally): Request<ListFleetsResponse, AWSError>
    open fun listWebsiteAuthorizationProviders(params: ListWebsiteAuthorizationProvidersRequest, callback: (err: AWSError, data: ListWebsiteAuthorizationProvidersResponse) -> Unit = definedExternally): Request<ListWebsiteAuthorizationProvidersResponse, AWSError>
    open fun listWebsiteAuthorizationProviders(callback: (err: AWSError, data: ListWebsiteAuthorizationProvidersResponse) -> Unit = definedExternally): Request<ListWebsiteAuthorizationProvidersResponse, AWSError>
    open fun listWebsiteCertificateAuthorities(params: ListWebsiteCertificateAuthoritiesRequest, callback: (err: AWSError, data: ListWebsiteCertificateAuthoritiesResponse) -> Unit = definedExternally): Request<ListWebsiteCertificateAuthoritiesResponse, AWSError>
    open fun listWebsiteCertificateAuthorities(callback: (err: AWSError, data: ListWebsiteCertificateAuthoritiesResponse) -> Unit = definedExternally): Request<ListWebsiteCertificateAuthoritiesResponse, AWSError>
    open fun restoreDomainAccess(params: RestoreDomainAccessRequest, callback: (err: AWSError, data: RestoreDomainAccessResponse) -> Unit = definedExternally): Request<RestoreDomainAccessResponse, AWSError>
    open fun restoreDomainAccess(callback: (err: AWSError, data: RestoreDomainAccessResponse) -> Unit = definedExternally): Request<RestoreDomainAccessResponse, AWSError>
    open fun revokeDomainAccess(params: RevokeDomainAccessRequest, callback: (err: AWSError, data: RevokeDomainAccessResponse) -> Unit = definedExternally): Request<RevokeDomainAccessResponse, AWSError>
    open fun revokeDomainAccess(callback: (err: AWSError, data: RevokeDomainAccessResponse) -> Unit = definedExternally): Request<RevokeDomainAccessResponse, AWSError>
    open fun signOutUser(params: SignOutUserRequest, callback: (err: AWSError, data: SignOutUserResponse) -> Unit = definedExternally): Request<SignOutUserResponse, AWSError>
    open fun signOutUser(callback: (err: AWSError, data: SignOutUserResponse) -> Unit = definedExternally): Request<SignOutUserResponse, AWSError>
    open fun updateAuditStreamConfiguration(params: UpdateAuditStreamConfigurationRequest, callback: (err: AWSError, data: UpdateAuditStreamConfigurationResponse) -> Unit = definedExternally): Request<UpdateAuditStreamConfigurationResponse, AWSError>
    open fun updateAuditStreamConfiguration(callback: (err: AWSError, data: UpdateAuditStreamConfigurationResponse) -> Unit = definedExternally): Request<UpdateAuditStreamConfigurationResponse, AWSError>
    open fun updateCompanyNetworkConfiguration(params: UpdateCompanyNetworkConfigurationRequest, callback: (err: AWSError, data: UpdateCompanyNetworkConfigurationResponse) -> Unit = definedExternally): Request<UpdateCompanyNetworkConfigurationResponse, AWSError>
    open fun updateCompanyNetworkConfiguration(callback: (err: AWSError, data: UpdateCompanyNetworkConfigurationResponse) -> Unit = definedExternally): Request<UpdateCompanyNetworkConfigurationResponse, AWSError>
    open fun updateDevicePolicyConfiguration(params: UpdateDevicePolicyConfigurationRequest, callback: (err: AWSError, data: UpdateDevicePolicyConfigurationResponse) -> Unit = definedExternally): Request<UpdateDevicePolicyConfigurationResponse, AWSError>
    open fun updateDevicePolicyConfiguration(callback: (err: AWSError, data: UpdateDevicePolicyConfigurationResponse) -> Unit = definedExternally): Request<UpdateDevicePolicyConfigurationResponse, AWSError>
    open fun updateDomainMetadata(params: UpdateDomainMetadataRequest, callback: (err: AWSError, data: UpdateDomainMetadataResponse) -> Unit = definedExternally): Request<UpdateDomainMetadataResponse, AWSError>
    open fun updateDomainMetadata(callback: (err: AWSError, data: UpdateDomainMetadataResponse) -> Unit = definedExternally): Request<UpdateDomainMetadataResponse, AWSError>
    open fun updateFleetMetadata(params: UpdateFleetMetadataRequest, callback: (err: AWSError, data: UpdateFleetMetadataResponse) -> Unit = definedExternally): Request<UpdateFleetMetadataResponse, AWSError>
    open fun updateFleetMetadata(callback: (err: AWSError, data: UpdateFleetMetadataResponse) -> Unit = definedExternally): Request<UpdateFleetMetadataResponse, AWSError>
    open fun updateIdentityProviderConfiguration(params: UpdateIdentityProviderConfigurationRequest, callback: (err: AWSError, data: UpdateIdentityProviderConfigurationResponse) -> Unit = definedExternally): Request<UpdateIdentityProviderConfigurationResponse, AWSError>
    open fun updateIdentityProviderConfiguration(callback: (err: AWSError, data: UpdateIdentityProviderConfigurationResponse) -> Unit = definedExternally): Request<UpdateIdentityProviderConfigurationResponse, AWSError>
    interface AssociateDomainRequest {
        var FleetArn: FleetArn
        var DomainName: DomainName
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var AcmCertificateArn: AcmCertificateArn
    }
    interface AssociateDomainResponse
    interface AssociateWebsiteAuthorizationProviderRequest {
        var FleetArn: FleetArn
        var AuthorizationProviderType: String /* "SAML" | String */
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateWebsiteAuthorizationProviderResponse {
        var AuthorizationProviderId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateWebsiteCertificateAuthorityRequest {
        var FleetArn: FleetArn
        var Certificate: Certificate
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateWebsiteCertificateAuthorityResponse {
        var WebsiteCaId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFleetRequest {
        var FleetName: FleetName
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var OptimizeForEndUserLocation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFleetResponse {
        var FleetArn: FleetArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFleetRequest {
        var FleetArn: FleetArn
    }
    interface DeleteFleetResponse
    interface DescribeAuditStreamConfigurationRequest {
        var FleetArn: FleetArn
    }
    interface DescribeAuditStreamConfigurationResponse {
        var AuditStreamArn: AuditStreamArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCompanyNetworkConfigurationRequest {
        var FleetArn: FleetArn
    }
    interface DescribeCompanyNetworkConfigurationResponse {
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIds?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDevicePolicyConfigurationRequest {
        var FleetArn: FleetArn
    }
    interface DescribeDevicePolicyConfigurationResponse {
        var DeviceCaCertificate: Certificate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDeviceRequest {
        var FleetArn: FleetArn
        var DeviceId: Id
    }
    interface DescribeDeviceResponse {
        var Status: String /* "ACTIVE" | "SIGNED_OUT" | String */
        var Model: DeviceModel?
            get() = definedExternally
            set(value) = definedExternally
        var Manufacturer: DeviceManufacturer?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystem: DeviceOperatingSystemName?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystemVersion: DeviceOperatingSystemVersion?
            get() = definedExternally
            set(value) = definedExternally
        var PatchLevel: DevicePatchLevel?
            get() = definedExternally
            set(value) = definedExternally
        var FirstAccessedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastAccessedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var Username: Username?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDomainRequest {
        var FleetArn: FleetArn
        var DomainName: DomainName
    }
    interface DescribeDomainResponse {
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var DomainStatus: String /* "PENDING_VALIDATION" | "ASSOCIATING" | "ACTIVE" | "INACTIVE" | "DISASSOCIATING" | "DISASSOCIATED" | "FAILED_TO_ASSOCIATE" | "FAILED_TO_DISASSOCIATE" | String */
        var AcmCertificateArn: AcmCertificateArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetMetadataRequest {
        var FleetArn: FleetArn
    }
    interface DescribeFleetMetadataResponse {
        var CreatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var FleetName: FleetName?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var OptimizeForEndUserLocation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CompanyCode: CompanyCode?
            get() = definedExternally
            set(value) = definedExternally
        var FleetStatus: String /* "CREATING" | "ACTIVE" | "DELETING" | "DELETED" | "FAILED_TO_CREATE" | "FAILED_TO_DELETE" | String */
    }
    interface DescribeIdentityProviderConfigurationRequest {
        var FleetArn: FleetArn
    }
    interface DescribeIdentityProviderConfigurationResponse {
        var IdentityProviderType: String /* "SAML" | String */
        var ServiceProviderSamlMetadata: SamlMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityProviderSamlMetadata: SamlMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWebsiteCertificateAuthorityRequest {
        var FleetArn: FleetArn
        var WebsiteCaId: Id
    }
    interface DescribeWebsiteCertificateAuthorityResponse {
        var Certificate: Certificate?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceSummary {
        var DeviceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceStatus: String /* "ACTIVE" | "SIGNED_OUT" | String */
    }
    interface DisassociateDomainRequest {
        var FleetArn: FleetArn
        var DomainName: DomainName
    }
    interface DisassociateDomainResponse
    interface DisassociateWebsiteAuthorizationProviderRequest {
        var FleetArn: FleetArn
        var AuthorizationProviderId: Id
    }
    interface DisassociateWebsiteAuthorizationProviderResponse
    interface DisassociateWebsiteCertificateAuthorityRequest {
        var FleetArn: FleetArn
        var WebsiteCaId: Id
    }
    interface DisassociateWebsiteCertificateAuthorityResponse
    interface DomainSummary {
        var DomainName: DomainName
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: DateTime
        var DomainStatus: String /* "PENDING_VALIDATION" | "ASSOCIATING" | "ACTIVE" | "INACTIVE" | "DISASSOCIATING" | "DISASSOCIATED" | "FAILED_TO_ASSOCIATE" | "FAILED_TO_DISASSOCIATE" | String */
    }
    interface FleetSummary {
        var FleetArn: FleetArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var FleetName: FleetName?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var CompanyCode: CompanyCode?
            get() = definedExternally
            set(value) = definedExternally
        var FleetStatus: String /* "CREATING" | "ACTIVE" | "DELETING" | "DELETED" | "FAILED_TO_CREATE" | "FAILED_TO_DELETE" | String */
    }
    interface ListDevicesRequest {
        var FleetArn: FleetArn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevicesResponse {
        var Devices: DeviceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainsRequest {
        var FleetArn: FleetArn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainsResponse {
        var Domains: DomainSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFleetsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFleetsResponse {
        var FleetSummaryList: FleetSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebsiteAuthorizationProvidersRequest {
        var FleetArn: FleetArn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebsiteAuthorizationProvidersResponse {
        var WebsiteAuthorizationProviders: WebsiteAuthorizationProvidersSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebsiteCertificateAuthoritiesRequest {
        var FleetArn: FleetArn
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebsiteCertificateAuthoritiesResponse {
        var WebsiteCertificateAuthorities: WebsiteCaSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreDomainAccessRequest {
        var FleetArn: FleetArn
        var DomainName: DomainName
    }
    interface RestoreDomainAccessResponse
    interface RevokeDomainAccessRequest {
        var FleetArn: FleetArn
        var DomainName: DomainName
    }
    interface RevokeDomainAccessResponse
    interface SignOutUserRequest {
        var FleetArn: FleetArn
        var Username: Username
    }
    interface SignOutUserResponse
    interface UpdateAuditStreamConfigurationRequest {
        var FleetArn: FleetArn
        var AuditStreamArn: AuditStreamArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAuditStreamConfigurationResponse
    interface UpdateCompanyNetworkConfigurationRequest {
        var FleetArn: FleetArn
        var VpcId: VpcId
        var SubnetIds: SubnetIds
        var SecurityGroupIds: SecurityGroupIds
    }
    interface UpdateCompanyNetworkConfigurationResponse
    interface UpdateDevicePolicyConfigurationRequest {
        var FleetArn: FleetArn
        var DeviceCaCertificate: CertificateChain?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDevicePolicyConfigurationResponse
    interface UpdateDomainMetadataRequest {
        var FleetArn: FleetArn
        var DomainName: DomainName
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDomainMetadataResponse
    interface UpdateFleetMetadataRequest {
        var FleetArn: FleetArn
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var OptimizeForEndUserLocation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFleetMetadataResponse
    interface UpdateIdentityProviderConfigurationRequest {
        var FleetArn: FleetArn
        var IdentityProviderType: String /* "SAML" | String */
        var IdentityProviderSamlMetadata: SamlMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIdentityProviderConfigurationResponse
    interface WebsiteAuthorizationProviderSummary {
        var AuthorizationProviderId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizationProviderType: String /* "SAML" | String */
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WebsiteCaSummary {
        var WebsiteCaId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-09-25" | "latest" | String */
    }
}