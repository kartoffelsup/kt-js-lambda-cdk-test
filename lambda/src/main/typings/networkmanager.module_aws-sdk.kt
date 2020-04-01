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
import NetworkManager.CustomerGatewayAssociation
import NetworkManager.Device
import NetworkManager.GlobalNetwork
import NetworkManager.LinkAssociation
import NetworkManager.Link
import NetworkManager.Site
import NetworkManager.Tag
import NetworkManager.TransitGatewayRegistration
import NetworkManager.AssociateCustomerGatewayRequest
import NetworkManager.AssociateCustomerGatewayResponse
import NetworkManager.AssociateLinkRequest
import NetworkManager.AssociateLinkResponse
import NetworkManager.CreateDeviceRequest
import NetworkManager.CreateDeviceResponse
import NetworkManager.CreateGlobalNetworkRequest
import NetworkManager.CreateGlobalNetworkResponse
import NetworkManager.CreateLinkRequest
import NetworkManager.CreateLinkResponse
import NetworkManager.CreateSiteRequest
import NetworkManager.CreateSiteResponse
import NetworkManager.DeleteDeviceRequest
import NetworkManager.DeleteDeviceResponse
import NetworkManager.DeleteGlobalNetworkRequest
import NetworkManager.DeleteGlobalNetworkResponse
import NetworkManager.DeleteLinkRequest
import NetworkManager.DeleteLinkResponse
import NetworkManager.DeleteSiteRequest
import NetworkManager.DeleteSiteResponse
import NetworkManager.DeregisterTransitGatewayRequest
import NetworkManager.DeregisterTransitGatewayResponse
import NetworkManager.DescribeGlobalNetworksRequest
import NetworkManager.DescribeGlobalNetworksResponse
import NetworkManager.DisassociateCustomerGatewayRequest
import NetworkManager.DisassociateCustomerGatewayResponse
import NetworkManager.DisassociateLinkRequest
import NetworkManager.DisassociateLinkResponse
import NetworkManager.GetCustomerGatewayAssociationsRequest
import NetworkManager.GetCustomerGatewayAssociationsResponse
import NetworkManager.GetDevicesRequest
import NetworkManager.GetDevicesResponse
import NetworkManager.GetLinkAssociationsRequest
import NetworkManager.GetLinkAssociationsResponse
import NetworkManager.GetLinksRequest
import NetworkManager.GetLinksResponse
import NetworkManager.GetSitesRequest
import NetworkManager.GetSitesResponse
import NetworkManager.GetTransitGatewayRegistrationsRequest
import NetworkManager.GetTransitGatewayRegistrationsResponse
import NetworkManager.ListTagsForResourceRequest
import NetworkManager.ListTagsForResourceResponse
import NetworkManager.RegisterTransitGatewayRequest
import NetworkManager.RegisterTransitGatewayResponse
import NetworkManager.TagResourceRequest
import NetworkManager.TagResourceResponse
import NetworkManager.UntagResourceRequest
import NetworkManager.UntagResourceResponse
import NetworkManager.UpdateDeviceRequest
import NetworkManager.UpdateDeviceResponse
import NetworkManager.UpdateGlobalNetworkRequest
import NetworkManager.UpdateGlobalNetworkResponse
import NetworkManager.UpdateLinkRequest
import NetworkManager.UpdateLinkResponse
import NetworkManager.UpdateSiteRequest
import NetworkManager.UpdateSiteResponse
import NetworkManager.Location
import NetworkManager.Bandwidth
import NetworkManager.TransitGatewayRegistrationStateReason

typealias CustomerGatewayAssociationList = Array<CustomerGatewayAssociation>

typealias DateTime = Date

typealias DeviceList = Array<Device>

typealias GlobalNetworkList = Array<GlobalNetwork>

typealias Integer = Number

typealias LinkAssociationList = Array<LinkAssociation>

typealias LinkList = Array<Link>

typealias MaxResults = Number

typealias ResourceARN = String

typealias SiteList = Array<Site>

typealias String = String

typealias StringList = Array<String>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TransitGatewayRegistrationList = Array<TransitGatewayRegistration>

@JsModule("aws-sdk")
external open class NetworkManager(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & NetworkManager.Types.ClientConfiguration */
    open fun associateCustomerGateway(params: AssociateCustomerGatewayRequest, callback: (err: AWSError, data: AssociateCustomerGatewayResponse) -> Unit = definedExternally): Request<AssociateCustomerGatewayResponse, AWSError>
    open fun associateCustomerGateway(callback: (err: AWSError, data: AssociateCustomerGatewayResponse) -> Unit = definedExternally): Request<AssociateCustomerGatewayResponse, AWSError>
    open fun associateLink(params: AssociateLinkRequest, callback: (err: AWSError, data: AssociateLinkResponse) -> Unit = definedExternally): Request<AssociateLinkResponse, AWSError>
    open fun associateLink(callback: (err: AWSError, data: AssociateLinkResponse) -> Unit = definedExternally): Request<AssociateLinkResponse, AWSError>
    open fun createDevice(params: CreateDeviceRequest, callback: (err: AWSError, data: CreateDeviceResponse) -> Unit = definedExternally): Request<CreateDeviceResponse, AWSError>
    open fun createDevice(callback: (err: AWSError, data: CreateDeviceResponse) -> Unit = definedExternally): Request<CreateDeviceResponse, AWSError>
    open fun createGlobalNetwork(params: CreateGlobalNetworkRequest, callback: (err: AWSError, data: CreateGlobalNetworkResponse) -> Unit = definedExternally): Request<CreateGlobalNetworkResponse, AWSError>
    open fun createGlobalNetwork(callback: (err: AWSError, data: CreateGlobalNetworkResponse) -> Unit = definedExternally): Request<CreateGlobalNetworkResponse, AWSError>
    open fun createLink(params: CreateLinkRequest, callback: (err: AWSError, data: CreateLinkResponse) -> Unit = definedExternally): Request<CreateLinkResponse, AWSError>
    open fun createLink(callback: (err: AWSError, data: CreateLinkResponse) -> Unit = definedExternally): Request<CreateLinkResponse, AWSError>
    open fun createSite(params: CreateSiteRequest, callback: (err: AWSError, data: CreateSiteResponse) -> Unit = definedExternally): Request<CreateSiteResponse, AWSError>
    open fun createSite(callback: (err: AWSError, data: CreateSiteResponse) -> Unit = definedExternally): Request<CreateSiteResponse, AWSError>
    open fun deleteDevice(params: DeleteDeviceRequest, callback: (err: AWSError, data: DeleteDeviceResponse) -> Unit = definedExternally): Request<DeleteDeviceResponse, AWSError>
    open fun deleteDevice(callback: (err: AWSError, data: DeleteDeviceResponse) -> Unit = definedExternally): Request<DeleteDeviceResponse, AWSError>
    open fun deleteGlobalNetwork(params: DeleteGlobalNetworkRequest, callback: (err: AWSError, data: DeleteGlobalNetworkResponse) -> Unit = definedExternally): Request<DeleteGlobalNetworkResponse, AWSError>
    open fun deleteGlobalNetwork(callback: (err: AWSError, data: DeleteGlobalNetworkResponse) -> Unit = definedExternally): Request<DeleteGlobalNetworkResponse, AWSError>
    open fun deleteLink(params: DeleteLinkRequest, callback: (err: AWSError, data: DeleteLinkResponse) -> Unit = definedExternally): Request<DeleteLinkResponse, AWSError>
    open fun deleteLink(callback: (err: AWSError, data: DeleteLinkResponse) -> Unit = definedExternally): Request<DeleteLinkResponse, AWSError>
    open fun deleteSite(params: DeleteSiteRequest, callback: (err: AWSError, data: DeleteSiteResponse) -> Unit = definedExternally): Request<DeleteSiteResponse, AWSError>
    open fun deleteSite(callback: (err: AWSError, data: DeleteSiteResponse) -> Unit = definedExternally): Request<DeleteSiteResponse, AWSError>
    open fun deregisterTransitGateway(params: DeregisterTransitGatewayRequest, callback: (err: AWSError, data: DeregisterTransitGatewayResponse) -> Unit = definedExternally): Request<DeregisterTransitGatewayResponse, AWSError>
    open fun deregisterTransitGateway(callback: (err: AWSError, data: DeregisterTransitGatewayResponse) -> Unit = definedExternally): Request<DeregisterTransitGatewayResponse, AWSError>
    open fun describeGlobalNetworks(params: DescribeGlobalNetworksRequest, callback: (err: AWSError, data: DescribeGlobalNetworksResponse) -> Unit = definedExternally): Request<DescribeGlobalNetworksResponse, AWSError>
    open fun describeGlobalNetworks(callback: (err: AWSError, data: DescribeGlobalNetworksResponse) -> Unit = definedExternally): Request<DescribeGlobalNetworksResponse, AWSError>
    open fun disassociateCustomerGateway(params: DisassociateCustomerGatewayRequest, callback: (err: AWSError, data: DisassociateCustomerGatewayResponse) -> Unit = definedExternally): Request<DisassociateCustomerGatewayResponse, AWSError>
    open fun disassociateCustomerGateway(callback: (err: AWSError, data: DisassociateCustomerGatewayResponse) -> Unit = definedExternally): Request<DisassociateCustomerGatewayResponse, AWSError>
    open fun disassociateLink(params: DisassociateLinkRequest, callback: (err: AWSError, data: DisassociateLinkResponse) -> Unit = definedExternally): Request<DisassociateLinkResponse, AWSError>
    open fun disassociateLink(callback: (err: AWSError, data: DisassociateLinkResponse) -> Unit = definedExternally): Request<DisassociateLinkResponse, AWSError>
    open fun getCustomerGatewayAssociations(params: GetCustomerGatewayAssociationsRequest, callback: (err: AWSError, data: GetCustomerGatewayAssociationsResponse) -> Unit = definedExternally): Request<GetCustomerGatewayAssociationsResponse, AWSError>
    open fun getCustomerGatewayAssociations(callback: (err: AWSError, data: GetCustomerGatewayAssociationsResponse) -> Unit = definedExternally): Request<GetCustomerGatewayAssociationsResponse, AWSError>
    open fun getDevices(params: GetDevicesRequest, callback: (err: AWSError, data: GetDevicesResponse) -> Unit = definedExternally): Request<GetDevicesResponse, AWSError>
    open fun getDevices(callback: (err: AWSError, data: GetDevicesResponse) -> Unit = definedExternally): Request<GetDevicesResponse, AWSError>
    open fun getLinkAssociations(params: GetLinkAssociationsRequest, callback: (err: AWSError, data: GetLinkAssociationsResponse) -> Unit = definedExternally): Request<GetLinkAssociationsResponse, AWSError>
    open fun getLinkAssociations(callback: (err: AWSError, data: GetLinkAssociationsResponse) -> Unit = definedExternally): Request<GetLinkAssociationsResponse, AWSError>
    open fun getLinks(params: GetLinksRequest, callback: (err: AWSError, data: GetLinksResponse) -> Unit = definedExternally): Request<GetLinksResponse, AWSError>
    open fun getLinks(callback: (err: AWSError, data: GetLinksResponse) -> Unit = definedExternally): Request<GetLinksResponse, AWSError>
    open fun getSites(params: GetSitesRequest, callback: (err: AWSError, data: GetSitesResponse) -> Unit = definedExternally): Request<GetSitesResponse, AWSError>
    open fun getSites(callback: (err: AWSError, data: GetSitesResponse) -> Unit = definedExternally): Request<GetSitesResponse, AWSError>
    open fun getTransitGatewayRegistrations(params: GetTransitGatewayRegistrationsRequest, callback: (err: AWSError, data: GetTransitGatewayRegistrationsResponse) -> Unit = definedExternally): Request<GetTransitGatewayRegistrationsResponse, AWSError>
    open fun getTransitGatewayRegistrations(callback: (err: AWSError, data: GetTransitGatewayRegistrationsResponse) -> Unit = definedExternally): Request<GetTransitGatewayRegistrationsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun registerTransitGateway(params: RegisterTransitGatewayRequest, callback: (err: AWSError, data: RegisterTransitGatewayResponse) -> Unit = definedExternally): Request<RegisterTransitGatewayResponse, AWSError>
    open fun registerTransitGateway(callback: (err: AWSError, data: RegisterTransitGatewayResponse) -> Unit = definedExternally): Request<RegisterTransitGatewayResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateDevice(params: UpdateDeviceRequest, callback: (err: AWSError, data: UpdateDeviceResponse) -> Unit = definedExternally): Request<UpdateDeviceResponse, AWSError>
    open fun updateDevice(callback: (err: AWSError, data: UpdateDeviceResponse) -> Unit = definedExternally): Request<UpdateDeviceResponse, AWSError>
    open fun updateGlobalNetwork(params: UpdateGlobalNetworkRequest, callback: (err: AWSError, data: UpdateGlobalNetworkResponse) -> Unit = definedExternally): Request<UpdateGlobalNetworkResponse, AWSError>
    open fun updateGlobalNetwork(callback: (err: AWSError, data: UpdateGlobalNetworkResponse) -> Unit = definedExternally): Request<UpdateGlobalNetworkResponse, AWSError>
    open fun updateLink(params: UpdateLinkRequest, callback: (err: AWSError, data: UpdateLinkResponse) -> Unit = definedExternally): Request<UpdateLinkResponse, AWSError>
    open fun updateLink(callback: (err: AWSError, data: UpdateLinkResponse) -> Unit = definedExternally): Request<UpdateLinkResponse, AWSError>
    open fun updateSite(params: UpdateSiteRequest, callback: (err: AWSError, data: UpdateSiteResponse) -> Unit = definedExternally): Request<UpdateSiteResponse, AWSError>
    open fun updateSite(callback: (err: AWSError, data: UpdateSiteResponse) -> Unit = definedExternally): Request<UpdateSiteResponse, AWSError>
    interface AssociateCustomerGatewayRequest {
        var CustomerGatewayArn: String
        var GlobalNetworkId: String
        var DeviceId: String
        var LinkId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateCustomerGatewayResponse {
        var CustomerGatewayAssociation: CustomerGatewayAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateLinkRequest {
        var GlobalNetworkId: String
        var DeviceId: String
        var LinkId: String
    }
    interface AssociateLinkResponse {
        var LinkAssociation: LinkAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Bandwidth {
        var UploadSpeed: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DownloadSpeed: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeviceRequest {
        var GlobalNetworkId: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Vendor: String?
            get() = definedExternally
            set(value) = definedExternally
        var Model: String?
            get() = definedExternally
            set(value) = definedExternally
        var SerialNumber: String?
            get() = definedExternally
            set(value) = definedExternally
        var Location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var SiteId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeviceResponse {
        var Device: Device?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGlobalNetworkRequest {
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGlobalNetworkResponse {
        var GlobalNetwork: GlobalNetwork?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLinkRequest {
        var GlobalNetworkId: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Bandwidth: Bandwidth
        var Provider: String?
            get() = definedExternally
            set(value) = definedExternally
        var SiteId: String
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLinkResponse {
        var Link: Link?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSiteRequest {
        var GlobalNetworkId: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSiteResponse {
        var Site: Site?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomerGatewayAssociation {
        var CustomerGatewayArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalNetworkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LinkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "AVAILABLE" | "DELETING" | "DELETED" | String */
    }
    interface DeleteDeviceRequest {
        var GlobalNetworkId: String
        var DeviceId: String
    }
    interface DeleteDeviceResponse {
        var Device: Device?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGlobalNetworkRequest {
        var GlobalNetworkId: String
    }
    interface DeleteGlobalNetworkResponse {
        var GlobalNetwork: GlobalNetwork?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLinkRequest {
        var GlobalNetworkId: String
        var LinkId: String
    }
    interface DeleteLinkResponse {
        var Link: Link?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSiteRequest {
        var GlobalNetworkId: String
        var SiteId: String
    }
    interface DeleteSiteResponse {
        var Site: Site?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterTransitGatewayRequest {
        var GlobalNetworkId: String
        var TransitGatewayArn: String
    }
    interface DeregisterTransitGatewayResponse {
        var TransitGatewayRegistration: TransitGatewayRegistration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGlobalNetworksRequest {
        var GlobalNetworkIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeGlobalNetworksResponse {
        var GlobalNetworks: GlobalNetworkList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Device {
        var DeviceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalNetworkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Vendor: String?
            get() = definedExternally
            set(value) = definedExternally
        var Model: String?
            get() = definedExternally
            set(value) = definedExternally
        var SerialNumber: String?
            get() = definedExternally
            set(value) = definedExternally
        var Location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var SiteId: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING" | String */
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateCustomerGatewayRequest {
        var GlobalNetworkId: String
        var CustomerGatewayArn: String
    }
    interface DisassociateCustomerGatewayResponse {
        var CustomerGatewayAssociation: CustomerGatewayAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateLinkRequest {
        var GlobalNetworkId: String
        var DeviceId: String
        var LinkId: String
    }
    interface DisassociateLinkResponse {
        var LinkAssociation: LinkAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCustomerGatewayAssociationsRequest {
        var GlobalNetworkId: String
        var CustomerGatewayArns: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCustomerGatewayAssociationsResponse {
        var CustomerGatewayAssociations: CustomerGatewayAssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDevicesRequest {
        var GlobalNetworkId: String
        var DeviceIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var SiteId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDevicesResponse {
        var Devices: DeviceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLinkAssociationsRequest {
        var GlobalNetworkId: String
        var DeviceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LinkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLinkAssociationsResponse {
        var LinkAssociations: LinkAssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLinksRequest {
        var GlobalNetworkId: String
        var LinkIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var SiteId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Provider: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLinksResponse {
        var Links: LinkList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSitesRequest {
        var GlobalNetworkId: String
        var SiteIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSitesResponse {
        var Sites: SiteList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTransitGatewayRegistrationsRequest {
        var GlobalNetworkId: String
        var TransitGatewayArns: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTransitGatewayRegistrationsResponse {
        var TransitGatewayRegistrations: TransitGatewayRegistrationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalNetwork {
        var GlobalNetworkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalNetworkArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING" | String */
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Link {
        var LinkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LinkArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalNetworkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SiteId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Bandwidth: Bandwidth?
            get() = definedExternally
            set(value) = definedExternally
        var Provider: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING" | String */
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LinkAssociation {
        var GlobalNetworkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LinkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LinkAssociationState: String /* "PENDING" | "AVAILABLE" | "DELETING" | "DELETED" | String */
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: ResourceARN
    }
    interface ListTagsForResourceResponse {
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Location {
        var Address: String?
            get() = definedExternally
            set(value) = definedExternally
        var Latitude: String?
            get() = definedExternally
            set(value) = definedExternally
        var Longitude: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterTransitGatewayRequest {
        var GlobalNetworkId: String
        var TransitGatewayArn: String
    }
    interface RegisterTransitGatewayResponse {
        var TransitGatewayRegistration: TransitGatewayRegistration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Site {
        var SiteId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SiteArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var GlobalNetworkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "AVAILABLE" | "DELETING" | "UPDATING" | String */
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: ResourceARN
        var Tags: TagList
    }
    interface TagResourceResponse
    interface TransitGatewayRegistration {
        var GlobalNetworkId: String?
            get() = definedExternally
            set(value) = definedExternally
        var TransitGatewayArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: TransitGatewayRegistrationStateReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransitGatewayRegistrationStateReason {
        var Code: String /* "PENDING" | "AVAILABLE" | "DELETING" | "DELETED" | "FAILED" | String */
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: ResourceARN
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateDeviceRequest {
        var GlobalNetworkId: String
        var DeviceId: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Vendor: String?
            get() = definedExternally
            set(value) = definedExternally
        var Model: String?
            get() = definedExternally
            set(value) = definedExternally
        var SerialNumber: String?
            get() = definedExternally
            set(value) = definedExternally
        var Location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var SiteId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeviceResponse {
        var Device: Device?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGlobalNetworkRequest {
        var GlobalNetworkId: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGlobalNetworkResponse {
        var GlobalNetwork: GlobalNetwork?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLinkRequest {
        var GlobalNetworkId: String
        var LinkId: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Bandwidth: Bandwidth?
            get() = definedExternally
            set(value) = definedExternally
        var Provider: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLinkResponse {
        var Link: Link?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSiteRequest {
        var GlobalNetworkId: String
        var SiteId: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Location: Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSiteResponse {
        var Site: Site?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-07-05" | "latest" | String */
    }
}