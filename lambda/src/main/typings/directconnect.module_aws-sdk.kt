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
import DirectConnect.BGPPeer
import DirectConnect.Connection
import DirectConnect.DirectConnectGatewayAssociation
import DirectConnect.DirectConnectGatewayAssociationProposal
import DirectConnect.DirectConnectGatewayAttachment
import DirectConnect.DirectConnectGateway
import DirectConnect.Interconnect
import DirectConnect.Lag
import DirectConnect.Location
import DirectConnect.ResourceTag
import DirectConnect.RouteFilterPrefix
import DirectConnect.Tag
import DirectConnect.VirtualGateway
import DirectConnect.VirtualInterface
import DirectConnect.AcceptDirectConnectGatewayAssociationProposalRequest
import DirectConnect.AcceptDirectConnectGatewayAssociationProposalResult
import DirectConnect.AllocateConnectionOnInterconnectRequest
import DirectConnect.AllocateHostedConnectionRequest
import DirectConnect.AllocatePrivateVirtualInterfaceRequest
import DirectConnect.AllocatePublicVirtualInterfaceRequest
import DirectConnect.AllocateTransitVirtualInterfaceRequest
import DirectConnect.AllocateTransitVirtualInterfaceResult
import DirectConnect.AssociateConnectionWithLagRequest
import DirectConnect.AssociateHostedConnectionRequest
import DirectConnect.AssociateVirtualInterfaceRequest
import DirectConnect.ConfirmConnectionRequest
import DirectConnect.ConfirmConnectionResponse
import DirectConnect.ConfirmPrivateVirtualInterfaceRequest
import DirectConnect.ConfirmPrivateVirtualInterfaceResponse
import DirectConnect.ConfirmPublicVirtualInterfaceRequest
import DirectConnect.ConfirmPublicVirtualInterfaceResponse
import DirectConnect.ConfirmTransitVirtualInterfaceRequest
import DirectConnect.ConfirmTransitVirtualInterfaceResponse
import DirectConnect.CreateBGPPeerRequest
import DirectConnect.CreateBGPPeerResponse
import DirectConnect.CreateConnectionRequest
import DirectConnect.CreateDirectConnectGatewayRequest
import DirectConnect.CreateDirectConnectGatewayResult
import DirectConnect.CreateDirectConnectGatewayAssociationRequest
import DirectConnect.CreateDirectConnectGatewayAssociationResult
import DirectConnect.CreateDirectConnectGatewayAssociationProposalRequest
import DirectConnect.CreateDirectConnectGatewayAssociationProposalResult
import DirectConnect.CreateInterconnectRequest
import DirectConnect.CreateLagRequest
import DirectConnect.CreatePrivateVirtualInterfaceRequest
import DirectConnect.CreatePublicVirtualInterfaceRequest
import DirectConnect.CreateTransitVirtualInterfaceRequest
import DirectConnect.CreateTransitVirtualInterfaceResult
import DirectConnect.DeleteBGPPeerRequest
import DirectConnect.DeleteBGPPeerResponse
import DirectConnect.DeleteConnectionRequest
import DirectConnect.DeleteDirectConnectGatewayRequest
import DirectConnect.DeleteDirectConnectGatewayResult
import DirectConnect.DeleteDirectConnectGatewayAssociationRequest
import DirectConnect.DeleteDirectConnectGatewayAssociationResult
import DirectConnect.DeleteDirectConnectGatewayAssociationProposalRequest
import DirectConnect.DeleteDirectConnectGatewayAssociationProposalResult
import DirectConnect.DeleteInterconnectRequest
import DirectConnect.DeleteInterconnectResponse
import DirectConnect.DeleteLagRequest
import DirectConnect.DeleteVirtualInterfaceRequest
import DirectConnect.DeleteVirtualInterfaceResponse
import DirectConnect.DescribeConnectionLoaRequest
import DirectConnect.DescribeConnectionLoaResponse
import DirectConnect.DescribeConnectionsRequest
import DirectConnect.Connections
import DirectConnect.DescribeConnectionsOnInterconnectRequest
import DirectConnect.DescribeDirectConnectGatewayAssociationProposalsRequest
import DirectConnect.DescribeDirectConnectGatewayAssociationProposalsResult
import DirectConnect.DescribeDirectConnectGatewayAssociationsRequest
import DirectConnect.DescribeDirectConnectGatewayAssociationsResult
import DirectConnect.DescribeDirectConnectGatewayAttachmentsRequest
import DirectConnect.DescribeDirectConnectGatewayAttachmentsResult
import DirectConnect.DescribeDirectConnectGatewaysRequest
import DirectConnect.DescribeDirectConnectGatewaysResult
import DirectConnect.DescribeHostedConnectionsRequest
import DirectConnect.DescribeInterconnectLoaRequest
import DirectConnect.DescribeInterconnectLoaResponse
import DirectConnect.DescribeInterconnectsRequest
import DirectConnect.Interconnects
import DirectConnect.DescribeLagsRequest
import DirectConnect.Lags
import DirectConnect.DescribeLoaRequest
import DirectConnect.Loa
import DirectConnect.Locations
import DirectConnect.DescribeTagsRequest
import DirectConnect.DescribeTagsResponse
import DirectConnect.VirtualGateways
import DirectConnect.DescribeVirtualInterfacesRequest
import DirectConnect.VirtualInterfaces
import DirectConnect.DisassociateConnectionFromLagRequest
import DirectConnect.TagResourceRequest
import DirectConnect.TagResourceResponse
import DirectConnect.UntagResourceRequest
import DirectConnect.UntagResourceResponse
import DirectConnect.UpdateDirectConnectGatewayAssociationRequest
import DirectConnect.UpdateDirectConnectGatewayAssociationResult
import DirectConnect.UpdateLagRequest
import DirectConnect.UpdateVirtualInterfaceAttributesRequest
import DirectConnect.NewPrivateVirtualInterfaceAllocation
import DirectConnect.NewPublicVirtualInterfaceAllocation
import DirectConnect.NewTransitVirtualInterfaceAllocation
import DirectConnect.NewBGPPeer
import DirectConnect.NewPrivateVirtualInterface
import DirectConnect.NewPublicVirtualInterface
import DirectConnect.NewTransitVirtualInterface
import DirectConnect.AssociatedGateway

typealias ASN = Number

typealias AmazonAddress = String

typealias AssociatedGatewayId = String

typealias AvailablePortSpeeds = Array<PortSpeed>

typealias AwsDevice = String

typealias AwsDeviceV2 = String

typealias BGPAuthKey = String

typealias BGPPeerId = String

typealias BGPPeerList = Array<BGPPeer>

typealias Bandwidth = String

typealias BooleanFlag = Boolean

typealias CIDR = String

typealias ConnectionId = String

typealias ConnectionList = Array<Connection>

typealias ConnectionName = String

typealias Count = Number

typealias CustomerAddress = String

typealias DirectConnectGatewayAssociationId = String

typealias DirectConnectGatewayAssociationList = Array<DirectConnectGatewayAssociation>

typealias DirectConnectGatewayAssociationProposalId = String

typealias DirectConnectGatewayAssociationProposalList = Array<DirectConnectGatewayAssociationProposal>

typealias DirectConnectGatewayAttachmentList = Array<DirectConnectGatewayAttachment>

typealias DirectConnectGatewayId = String

typealias DirectConnectGatewayList = Array<DirectConnectGateway>

typealias DirectConnectGatewayName = String

typealias GatewayIdToAssociate = String

typealias GatewayIdentifier = String

typealias InterconnectId = String

typealias InterconnectList = Array<Interconnect>

typealias InterconnectName = String

typealias JumboFrameCapable = Boolean

typealias LagId = String

typealias LagList = Array<Lag>

typealias LagName = String

typealias LoaIssueTime = Date

typealias LocationCode = String

typealias LocationList = Array<Location>

typealias LocationName = String

typealias LongAsn = Number

typealias MTU = Number

typealias MaxResultSetSize = Number

typealias OwnerAccount = String

typealias PaginationToken = String

typealias PartnerName = String

typealias PortSpeed = String

typealias ProviderList = Array<ProviderName>

typealias ProviderName = String

typealias Region = String

typealias ResourceArn = String

typealias ResourceArnList = Array<ResourceArn>

typealias ResourceTagList = Array<ResourceTag>

typealias RouteFilterPrefixList = Array<RouteFilterPrefix>

typealias RouterConfig = String

typealias StateChangeError = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias VLAN = Number

typealias VirtualGatewayId = String

typealias VirtualGatewayList = Array<VirtualGateway>

typealias VirtualGatewayRegion = String

typealias VirtualGatewayState = String

typealias VirtualInterfaceId = String

typealias VirtualInterfaceList = Array<VirtualInterface>

typealias VirtualInterfaceName = String

typealias VirtualInterfaceRegion = String

typealias VirtualInterfaceType = String

@JsModule("aws-sdk")
external open class DirectConnect(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DirectConnect.Types.ClientConfiguration */
    open fun acceptDirectConnectGatewayAssociationProposal(params: AcceptDirectConnectGatewayAssociationProposalRequest, callback: (err: AWSError, data: AcceptDirectConnectGatewayAssociationProposalResult) -> Unit = definedExternally): Request<AcceptDirectConnectGatewayAssociationProposalResult, AWSError>
    open fun acceptDirectConnectGatewayAssociationProposal(callback: (err: AWSError, data: AcceptDirectConnectGatewayAssociationProposalResult) -> Unit = definedExternally): Request<AcceptDirectConnectGatewayAssociationProposalResult, AWSError>
    open fun allocateConnectionOnInterconnect(params: AllocateConnectionOnInterconnectRequest, callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun allocateConnectionOnInterconnect(callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun allocateHostedConnection(params: AllocateHostedConnectionRequest, callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun allocateHostedConnection(callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun allocatePrivateVirtualInterface(params: AllocatePrivateVirtualInterfaceRequest, callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun allocatePrivateVirtualInterface(callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun allocatePublicVirtualInterface(params: AllocatePublicVirtualInterfaceRequest, callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun allocatePublicVirtualInterface(callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun allocateTransitVirtualInterface(params: AllocateTransitVirtualInterfaceRequest, callback: (err: AWSError, data: AllocateTransitVirtualInterfaceResult) -> Unit = definedExternally): Request<AllocateTransitVirtualInterfaceResult, AWSError>
    open fun allocateTransitVirtualInterface(callback: (err: AWSError, data: AllocateTransitVirtualInterfaceResult) -> Unit = definedExternally): Request<AllocateTransitVirtualInterfaceResult, AWSError>
    open fun associateConnectionWithLag(params: AssociateConnectionWithLagRequest, callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun associateConnectionWithLag(callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun associateHostedConnection(params: AssociateHostedConnectionRequest, callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun associateHostedConnection(callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun associateVirtualInterface(params: AssociateVirtualInterfaceRequest, callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun associateVirtualInterface(callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun confirmConnection(params: ConfirmConnectionRequest, callback: (err: AWSError, data: ConfirmConnectionResponse) -> Unit = definedExternally): Request<ConfirmConnectionResponse, AWSError>
    open fun confirmConnection(callback: (err: AWSError, data: ConfirmConnectionResponse) -> Unit = definedExternally): Request<ConfirmConnectionResponse, AWSError>
    open fun confirmPrivateVirtualInterface(params: ConfirmPrivateVirtualInterfaceRequest, callback: (err: AWSError, data: ConfirmPrivateVirtualInterfaceResponse) -> Unit = definedExternally): Request<ConfirmPrivateVirtualInterfaceResponse, AWSError>
    open fun confirmPrivateVirtualInterface(callback: (err: AWSError, data: ConfirmPrivateVirtualInterfaceResponse) -> Unit = definedExternally): Request<ConfirmPrivateVirtualInterfaceResponse, AWSError>
    open fun confirmPublicVirtualInterface(params: ConfirmPublicVirtualInterfaceRequest, callback: (err: AWSError, data: ConfirmPublicVirtualInterfaceResponse) -> Unit = definedExternally): Request<ConfirmPublicVirtualInterfaceResponse, AWSError>
    open fun confirmPublicVirtualInterface(callback: (err: AWSError, data: ConfirmPublicVirtualInterfaceResponse) -> Unit = definedExternally): Request<ConfirmPublicVirtualInterfaceResponse, AWSError>
    open fun confirmTransitVirtualInterface(params: ConfirmTransitVirtualInterfaceRequest, callback: (err: AWSError, data: ConfirmTransitVirtualInterfaceResponse) -> Unit = definedExternally): Request<ConfirmTransitVirtualInterfaceResponse, AWSError>
    open fun confirmTransitVirtualInterface(callback: (err: AWSError, data: ConfirmTransitVirtualInterfaceResponse) -> Unit = definedExternally): Request<ConfirmTransitVirtualInterfaceResponse, AWSError>
    open fun createBGPPeer(params: CreateBGPPeerRequest, callback: (err: AWSError, data: CreateBGPPeerResponse) -> Unit = definedExternally): Request<CreateBGPPeerResponse, AWSError>
    open fun createBGPPeer(callback: (err: AWSError, data: CreateBGPPeerResponse) -> Unit = definedExternally): Request<CreateBGPPeerResponse, AWSError>
    open fun createConnection(params: CreateConnectionRequest, callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun createConnection(callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun createDirectConnectGateway(params: CreateDirectConnectGatewayRequest, callback: (err: AWSError, data: CreateDirectConnectGatewayResult) -> Unit = definedExternally): Request<CreateDirectConnectGatewayResult, AWSError>
    open fun createDirectConnectGateway(callback: (err: AWSError, data: CreateDirectConnectGatewayResult) -> Unit = definedExternally): Request<CreateDirectConnectGatewayResult, AWSError>
    open fun createDirectConnectGatewayAssociation(params: CreateDirectConnectGatewayAssociationRequest, callback: (err: AWSError, data: CreateDirectConnectGatewayAssociationResult) -> Unit = definedExternally): Request<CreateDirectConnectGatewayAssociationResult, AWSError>
    open fun createDirectConnectGatewayAssociation(callback: (err: AWSError, data: CreateDirectConnectGatewayAssociationResult) -> Unit = definedExternally): Request<CreateDirectConnectGatewayAssociationResult, AWSError>
    open fun createDirectConnectGatewayAssociationProposal(params: CreateDirectConnectGatewayAssociationProposalRequest, callback: (err: AWSError, data: CreateDirectConnectGatewayAssociationProposalResult) -> Unit = definedExternally): Request<CreateDirectConnectGatewayAssociationProposalResult, AWSError>
    open fun createDirectConnectGatewayAssociationProposal(callback: (err: AWSError, data: CreateDirectConnectGatewayAssociationProposalResult) -> Unit = definedExternally): Request<CreateDirectConnectGatewayAssociationProposalResult, AWSError>
    open fun createInterconnect(params: CreateInterconnectRequest, callback: (err: AWSError, data: Interconnect) -> Unit = definedExternally): Request<Interconnect, AWSError>
    open fun createInterconnect(callback: (err: AWSError, data: Interconnect) -> Unit = definedExternally): Request<Interconnect, AWSError>
    open fun createLag(params: CreateLagRequest, callback: (err: AWSError, data: Lag) -> Unit = definedExternally): Request<Lag, AWSError>
    open fun createLag(callback: (err: AWSError, data: Lag) -> Unit = definedExternally): Request<Lag, AWSError>
    open fun createPrivateVirtualInterface(params: CreatePrivateVirtualInterfaceRequest, callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun createPrivateVirtualInterface(callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun createPublicVirtualInterface(params: CreatePublicVirtualInterfaceRequest, callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun createPublicVirtualInterface(callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun createTransitVirtualInterface(params: CreateTransitVirtualInterfaceRequest, callback: (err: AWSError, data: CreateTransitVirtualInterfaceResult) -> Unit = definedExternally): Request<CreateTransitVirtualInterfaceResult, AWSError>
    open fun createTransitVirtualInterface(callback: (err: AWSError, data: CreateTransitVirtualInterfaceResult) -> Unit = definedExternally): Request<CreateTransitVirtualInterfaceResult, AWSError>
    open fun deleteBGPPeer(params: DeleteBGPPeerRequest, callback: (err: AWSError, data: DeleteBGPPeerResponse) -> Unit = definedExternally): Request<DeleteBGPPeerResponse, AWSError>
    open fun deleteBGPPeer(callback: (err: AWSError, data: DeleteBGPPeerResponse) -> Unit = definedExternally): Request<DeleteBGPPeerResponse, AWSError>
    open fun deleteConnection(params: DeleteConnectionRequest, callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun deleteConnection(callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun deleteDirectConnectGateway(params: DeleteDirectConnectGatewayRequest, callback: (err: AWSError, data: DeleteDirectConnectGatewayResult) -> Unit = definedExternally): Request<DeleteDirectConnectGatewayResult, AWSError>
    open fun deleteDirectConnectGateway(callback: (err: AWSError, data: DeleteDirectConnectGatewayResult) -> Unit = definedExternally): Request<DeleteDirectConnectGatewayResult, AWSError>
    open fun deleteDirectConnectGatewayAssociation(params: DeleteDirectConnectGatewayAssociationRequest, callback: (err: AWSError, data: DeleteDirectConnectGatewayAssociationResult) -> Unit = definedExternally): Request<DeleteDirectConnectGatewayAssociationResult, AWSError>
    open fun deleteDirectConnectGatewayAssociation(callback: (err: AWSError, data: DeleteDirectConnectGatewayAssociationResult) -> Unit = definedExternally): Request<DeleteDirectConnectGatewayAssociationResult, AWSError>
    open fun deleteDirectConnectGatewayAssociationProposal(params: DeleteDirectConnectGatewayAssociationProposalRequest, callback: (err: AWSError, data: DeleteDirectConnectGatewayAssociationProposalResult) -> Unit = definedExternally): Request<DeleteDirectConnectGatewayAssociationProposalResult, AWSError>
    open fun deleteDirectConnectGatewayAssociationProposal(callback: (err: AWSError, data: DeleteDirectConnectGatewayAssociationProposalResult) -> Unit = definedExternally): Request<DeleteDirectConnectGatewayAssociationProposalResult, AWSError>
    open fun deleteInterconnect(params: DeleteInterconnectRequest, callback: (err: AWSError, data: DeleteInterconnectResponse) -> Unit = definedExternally): Request<DeleteInterconnectResponse, AWSError>
    open fun deleteInterconnect(callback: (err: AWSError, data: DeleteInterconnectResponse) -> Unit = definedExternally): Request<DeleteInterconnectResponse, AWSError>
    open fun deleteLag(params: DeleteLagRequest, callback: (err: AWSError, data: Lag) -> Unit = definedExternally): Request<Lag, AWSError>
    open fun deleteLag(callback: (err: AWSError, data: Lag) -> Unit = definedExternally): Request<Lag, AWSError>
    open fun deleteVirtualInterface(params: DeleteVirtualInterfaceRequest, callback: (err: AWSError, data: DeleteVirtualInterfaceResponse) -> Unit = definedExternally): Request<DeleteVirtualInterfaceResponse, AWSError>
    open fun deleteVirtualInterface(callback: (err: AWSError, data: DeleteVirtualInterfaceResponse) -> Unit = definedExternally): Request<DeleteVirtualInterfaceResponse, AWSError>
    open fun describeConnectionLoa(params: DescribeConnectionLoaRequest, callback: (err: AWSError, data: DescribeConnectionLoaResponse) -> Unit = definedExternally): Request<DescribeConnectionLoaResponse, AWSError>
    open fun describeConnectionLoa(callback: (err: AWSError, data: DescribeConnectionLoaResponse) -> Unit = definedExternally): Request<DescribeConnectionLoaResponse, AWSError>
    open fun describeConnections(params: DescribeConnectionsRequest, callback: (err: AWSError, data: Connections) -> Unit = definedExternally): Request<Connections, AWSError>
    open fun describeConnections(callback: (err: AWSError, data: Connections) -> Unit = definedExternally): Request<Connections, AWSError>
    open fun describeConnectionsOnInterconnect(params: DescribeConnectionsOnInterconnectRequest, callback: (err: AWSError, data: Connections) -> Unit = definedExternally): Request<Connections, AWSError>
    open fun describeConnectionsOnInterconnect(callback: (err: AWSError, data: Connections) -> Unit = definedExternally): Request<Connections, AWSError>
    open fun describeDirectConnectGatewayAssociationProposals(params: DescribeDirectConnectGatewayAssociationProposalsRequest, callback: (err: AWSError, data: DescribeDirectConnectGatewayAssociationProposalsResult) -> Unit = definedExternally): Request<DescribeDirectConnectGatewayAssociationProposalsResult, AWSError>
    open fun describeDirectConnectGatewayAssociationProposals(callback: (err: AWSError, data: DescribeDirectConnectGatewayAssociationProposalsResult) -> Unit = definedExternally): Request<DescribeDirectConnectGatewayAssociationProposalsResult, AWSError>
    open fun describeDirectConnectGatewayAssociations(params: DescribeDirectConnectGatewayAssociationsRequest, callback: (err: AWSError, data: DescribeDirectConnectGatewayAssociationsResult) -> Unit = definedExternally): Request<DescribeDirectConnectGatewayAssociationsResult, AWSError>
    open fun describeDirectConnectGatewayAssociations(callback: (err: AWSError, data: DescribeDirectConnectGatewayAssociationsResult) -> Unit = definedExternally): Request<DescribeDirectConnectGatewayAssociationsResult, AWSError>
    open fun describeDirectConnectGatewayAttachments(params: DescribeDirectConnectGatewayAttachmentsRequest, callback: (err: AWSError, data: DescribeDirectConnectGatewayAttachmentsResult) -> Unit = definedExternally): Request<DescribeDirectConnectGatewayAttachmentsResult, AWSError>
    open fun describeDirectConnectGatewayAttachments(callback: (err: AWSError, data: DescribeDirectConnectGatewayAttachmentsResult) -> Unit = definedExternally): Request<DescribeDirectConnectGatewayAttachmentsResult, AWSError>
    open fun describeDirectConnectGateways(params: DescribeDirectConnectGatewaysRequest, callback: (err: AWSError, data: DescribeDirectConnectGatewaysResult) -> Unit = definedExternally): Request<DescribeDirectConnectGatewaysResult, AWSError>
    open fun describeDirectConnectGateways(callback: (err: AWSError, data: DescribeDirectConnectGatewaysResult) -> Unit = definedExternally): Request<DescribeDirectConnectGatewaysResult, AWSError>
    open fun describeHostedConnections(params: DescribeHostedConnectionsRequest, callback: (err: AWSError, data: Connections) -> Unit = definedExternally): Request<Connections, AWSError>
    open fun describeHostedConnections(callback: (err: AWSError, data: Connections) -> Unit = definedExternally): Request<Connections, AWSError>
    open fun describeInterconnectLoa(params: DescribeInterconnectLoaRequest, callback: (err: AWSError, data: DescribeInterconnectLoaResponse) -> Unit = definedExternally): Request<DescribeInterconnectLoaResponse, AWSError>
    open fun describeInterconnectLoa(callback: (err: AWSError, data: DescribeInterconnectLoaResponse) -> Unit = definedExternally): Request<DescribeInterconnectLoaResponse, AWSError>
    open fun describeInterconnects(params: DescribeInterconnectsRequest, callback: (err: AWSError, data: Interconnects) -> Unit = definedExternally): Request<Interconnects, AWSError>
    open fun describeInterconnects(callback: (err: AWSError, data: Interconnects) -> Unit = definedExternally): Request<Interconnects, AWSError>
    open fun describeLags(params: DescribeLagsRequest, callback: (err: AWSError, data: Lags) -> Unit = definedExternally): Request<Lags, AWSError>
    open fun describeLags(callback: (err: AWSError, data: Lags) -> Unit = definedExternally): Request<Lags, AWSError>
    open fun describeLoa(params: DescribeLoaRequest, callback: (err: AWSError, data: Loa) -> Unit = definedExternally): Request<Loa, AWSError>
    open fun describeLoa(callback: (err: AWSError, data: Loa) -> Unit = definedExternally): Request<Loa, AWSError>
    open fun describeLocations(callback: (err: AWSError, data: Locations) -> Unit = definedExternally): Request<Locations, AWSError>
    open fun describeTags(params: DescribeTagsRequest, callback: (err: AWSError, data: DescribeTagsResponse) -> Unit = definedExternally): Request<DescribeTagsResponse, AWSError>
    open fun describeTags(callback: (err: AWSError, data: DescribeTagsResponse) -> Unit = definedExternally): Request<DescribeTagsResponse, AWSError>
    open fun describeVirtualGateways(callback: (err: AWSError, data: VirtualGateways) -> Unit = definedExternally): Request<VirtualGateways, AWSError>
    open fun describeVirtualInterfaces(params: DescribeVirtualInterfacesRequest, callback: (err: AWSError, data: VirtualInterfaces) -> Unit = definedExternally): Request<VirtualInterfaces, AWSError>
    open fun describeVirtualInterfaces(callback: (err: AWSError, data: VirtualInterfaces) -> Unit = definedExternally): Request<VirtualInterfaces, AWSError>
    open fun disassociateConnectionFromLag(params: DisassociateConnectionFromLagRequest, callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun disassociateConnectionFromLag(callback: (err: AWSError, data: Connection) -> Unit = definedExternally): Request<Connection, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateDirectConnectGatewayAssociation(params: UpdateDirectConnectGatewayAssociationRequest, callback: (err: AWSError, data: UpdateDirectConnectGatewayAssociationResult) -> Unit = definedExternally): Request<UpdateDirectConnectGatewayAssociationResult, AWSError>
    open fun updateDirectConnectGatewayAssociation(callback: (err: AWSError, data: UpdateDirectConnectGatewayAssociationResult) -> Unit = definedExternally): Request<UpdateDirectConnectGatewayAssociationResult, AWSError>
    open fun updateLag(params: UpdateLagRequest, callback: (err: AWSError, data: Lag) -> Unit = definedExternally): Request<Lag, AWSError>
    open fun updateLag(callback: (err: AWSError, data: Lag) -> Unit = definedExternally): Request<Lag, AWSError>
    open fun updateVirtualInterfaceAttributes(params: UpdateVirtualInterfaceAttributesRequest, callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    open fun updateVirtualInterfaceAttributes(callback: (err: AWSError, data: VirtualInterface) -> Unit = definedExternally): Request<VirtualInterface, AWSError>
    interface AcceptDirectConnectGatewayAssociationProposalRequest {
        var directConnectGatewayId: DirectConnectGatewayId
        var proposalId: DirectConnectGatewayAssociationProposalId
        var associatedGatewayOwnerAccount: OwnerAccount
        var overrideAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AcceptDirectConnectGatewayAssociationProposalResult {
        var directConnectGatewayAssociation: DirectConnectGatewayAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AllocateConnectionOnInterconnectRequest {
        var bandwidth: Bandwidth
        var connectionName: ConnectionName
        var ownerAccount: OwnerAccount
        var interconnectId: InterconnectId
        var vlan: VLAN
    }
    interface AllocateHostedConnectionRequest {
        var connectionId: ConnectionId
        var ownerAccount: OwnerAccount
        var bandwidth: Bandwidth
        var connectionName: ConnectionName
        var vlan: VLAN
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AllocatePrivateVirtualInterfaceRequest {
        var connectionId: ConnectionId
        var ownerAccount: OwnerAccount
        var newPrivateVirtualInterfaceAllocation: NewPrivateVirtualInterfaceAllocation
    }
    interface AllocatePublicVirtualInterfaceRequest {
        var connectionId: ConnectionId
        var ownerAccount: OwnerAccount
        var newPublicVirtualInterfaceAllocation: NewPublicVirtualInterfaceAllocation
    }
    interface AllocateTransitVirtualInterfaceRequest {
        var connectionId: ConnectionId
        var ownerAccount: OwnerAccount
        var newTransitVirtualInterfaceAllocation: NewTransitVirtualInterfaceAllocation
    }
    interface AllocateTransitVirtualInterfaceResult {
        var virtualInterface: VirtualInterface?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateConnectionWithLagRequest {
        var connectionId: ConnectionId
        var lagId: LagId
    }
    interface AssociateHostedConnectionRequest {
        var connectionId: ConnectionId
        var parentConnectionId: ConnectionId
    }
    interface AssociateVirtualInterfaceRequest {
        var virtualInterfaceId: VirtualInterfaceId
        var connectionId: ConnectionId
    }
    interface AssociatedGateway {
        var id: GatewayIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "virtualPrivateGateway" | "transitGateway" | String */
        var ownerAccount: OwnerAccount?
            get() = definedExternally
            set(value) = definedExternally
        var region: Region?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BGPPeer {
        var bgpPeerId: BGPPeerId?
            get() = definedExternally
            set(value) = definedExternally
        var asn: ASN?
            get() = definedExternally
            set(value) = definedExternally
        var authKey: BGPAuthKey?
            get() = definedExternally
            set(value) = definedExternally
        var addressFamily: String /* "ipv4" | "ipv6" | String */
        var amazonAddress: AmazonAddress?
            get() = definedExternally
            set(value) = definedExternally
        var customerAddress: CustomerAddress?
            get() = definedExternally
            set(value) = definedExternally
        var bgpPeerState: String /* "verifying" | "pending" | "available" | "deleting" | "deleted" | String */
        var bgpStatus: String /* "up" | "down" | "unknown" | String */
        var awsDeviceV2: AwsDeviceV2?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfirmConnectionRequest {
        var connectionId: ConnectionId
    }
    interface ConfirmConnectionResponse {
        var connectionState: String /* "ordering" | "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown" | String */
    }
    interface ConfirmPrivateVirtualInterfaceRequest {
        var virtualInterfaceId: VirtualInterfaceId
        var virtualGatewayId: VirtualGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfirmPrivateVirtualInterfaceResponse {
        var virtualInterfaceState: String /* "confirming" | "verifying" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown" | String */
    }
    interface ConfirmPublicVirtualInterfaceRequest {
        var virtualInterfaceId: VirtualInterfaceId
    }
    interface ConfirmPublicVirtualInterfaceResponse {
        var virtualInterfaceState: String /* "confirming" | "verifying" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown" | String */
    }
    interface ConfirmTransitVirtualInterfaceRequest {
        var virtualInterfaceId: VirtualInterfaceId
        var directConnectGatewayId: DirectConnectGatewayId
    }
    interface ConfirmTransitVirtualInterfaceResponse {
        var virtualInterfaceState: String /* "confirming" | "verifying" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown" | String */
    }
    interface Connection {
        var ownerAccount: OwnerAccount?
            get() = definedExternally
            set(value) = definedExternally
        var connectionId: ConnectionId?
            get() = definedExternally
            set(value) = definedExternally
        var connectionName: ConnectionName?
            get() = definedExternally
            set(value) = definedExternally
        var connectionState: String /* "ordering" | "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown" | String */
        var region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var location: LocationCode?
            get() = definedExternally
            set(value) = definedExternally
        var bandwidth: Bandwidth?
            get() = definedExternally
            set(value) = definedExternally
        var vlan: VLAN?
            get() = definedExternally
            set(value) = definedExternally
        var partnerName: PartnerName?
            get() = definedExternally
            set(value) = definedExternally
        var loaIssueTime: LoaIssueTime?
            get() = definedExternally
            set(value) = definedExternally
        var lagId: LagId?
            get() = definedExternally
            set(value) = definedExternally
        var awsDevice: AwsDevice?
            get() = definedExternally
            set(value) = definedExternally
        var jumboFrameCapable: JumboFrameCapable?
            get() = definedExternally
            set(value) = definedExternally
        var awsDeviceV2: AwsDeviceV2?
            get() = definedExternally
            set(value) = definedExternally
        var hasLogicalRedundancy: String /* "unknown" | "yes" | "no" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var providerName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Connections {
        var connections: ConnectionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBGPPeerRequest {
        var virtualInterfaceId: VirtualInterfaceId?
            get() = definedExternally
            set(value) = definedExternally
        var newBGPPeer: NewBGPPeer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBGPPeerResponse {
        var virtualInterface: VirtualInterface?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConnectionRequest {
        var location: LocationCode
        var bandwidth: Bandwidth
        var connectionName: ConnectionName
        var lagId: LagId?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var providerName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDirectConnectGatewayAssociationProposalRequest {
        var directConnectGatewayId: DirectConnectGatewayId
        var directConnectGatewayOwnerAccount: OwnerAccount
        var gatewayId: GatewayIdToAssociate
        var addAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
        var removeAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDirectConnectGatewayAssociationProposalResult {
        var directConnectGatewayAssociationProposal: DirectConnectGatewayAssociationProposal?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDirectConnectGatewayAssociationRequest {
        var directConnectGatewayId: DirectConnectGatewayId
        var gatewayId: GatewayIdToAssociate?
            get() = definedExternally
            set(value) = definedExternally
        var addAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
        var virtualGatewayId: VirtualGatewayId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDirectConnectGatewayAssociationResult {
        var directConnectGatewayAssociation: DirectConnectGatewayAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDirectConnectGatewayRequest {
        var directConnectGatewayName: DirectConnectGatewayName
        var amazonSideAsn: LongAsn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDirectConnectGatewayResult {
        var directConnectGateway: DirectConnectGateway?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInterconnectRequest {
        var interconnectName: InterconnectName
        var bandwidth: Bandwidth
        var location: LocationCode
        var lagId: LagId?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var providerName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLagRequest {
        var numberOfConnections: Count
        var location: LocationCode
        var connectionsBandwidth: Bandwidth
        var lagName: LagName
        var connectionId: ConnectionId?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var childConnectionTags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var providerName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePrivateVirtualInterfaceRequest {
        var connectionId: ConnectionId
        var newPrivateVirtualInterface: NewPrivateVirtualInterface
    }
    interface CreatePublicVirtualInterfaceRequest {
        var connectionId: ConnectionId
        var newPublicVirtualInterface: NewPublicVirtualInterface
    }
    interface CreateTransitVirtualInterfaceRequest {
        var connectionId: ConnectionId
        var newTransitVirtualInterface: NewTransitVirtualInterface
    }
    interface CreateTransitVirtualInterfaceResult {
        var virtualInterface: VirtualInterface?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBGPPeerRequest {
        var virtualInterfaceId: VirtualInterfaceId?
            get() = definedExternally
            set(value) = definedExternally
        var asn: ASN?
            get() = definedExternally
            set(value) = definedExternally
        var customerAddress: CustomerAddress?
            get() = definedExternally
            set(value) = definedExternally
        var bgpPeerId: BGPPeerId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBGPPeerResponse {
        var virtualInterface: VirtualInterface?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteConnectionRequest {
        var connectionId: ConnectionId
    }
    interface DeleteDirectConnectGatewayAssociationProposalRequest {
        var proposalId: DirectConnectGatewayAssociationProposalId
    }
    interface DeleteDirectConnectGatewayAssociationProposalResult {
        var directConnectGatewayAssociationProposal: DirectConnectGatewayAssociationProposal?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDirectConnectGatewayAssociationRequest {
        var associationId: DirectConnectGatewayAssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualGatewayId: VirtualGatewayId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDirectConnectGatewayAssociationResult {
        var directConnectGatewayAssociation: DirectConnectGatewayAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDirectConnectGatewayRequest {
        var directConnectGatewayId: DirectConnectGatewayId
    }
    interface DeleteDirectConnectGatewayResult {
        var directConnectGateway: DirectConnectGateway?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteInterconnectRequest {
        var interconnectId: InterconnectId
    }
    interface DeleteInterconnectResponse {
        var interconnectState: String /* "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "unknown" | String */
    }
    interface DeleteLagRequest {
        var lagId: LagId
    }
    interface DeleteVirtualInterfaceRequest {
        var virtualInterfaceId: VirtualInterfaceId
    }
    interface DeleteVirtualInterfaceResponse {
        var virtualInterfaceState: String /* "confirming" | "verifying" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown" | String */
    }
    interface DescribeConnectionLoaRequest {
        var connectionId: ConnectionId
        var providerName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
        var loaContentType: String /* "application/pdf" | String */
    }
    interface DescribeConnectionLoaResponse {
        var loa: Loa?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConnectionsOnInterconnectRequest {
        var interconnectId: InterconnectId
    }
    interface DescribeConnectionsRequest {
        var connectionId: ConnectionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectConnectGatewayAssociationProposalsRequest {
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var proposalId: DirectConnectGatewayAssociationProposalId?
            get() = definedExternally
            set(value) = definedExternally
        var associatedGatewayId: AssociatedGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResultSetSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectConnectGatewayAssociationProposalsResult {
        var directConnectGatewayAssociationProposals: DirectConnectGatewayAssociationProposalList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectConnectGatewayAssociationsRequest {
        var associationId: DirectConnectGatewayAssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var associatedGatewayId: AssociatedGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResultSetSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var virtualGatewayId: VirtualGatewayId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectConnectGatewayAssociationsResult {
        var directConnectGatewayAssociations: DirectConnectGatewayAssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectConnectGatewayAttachmentsRequest {
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualInterfaceId: VirtualInterfaceId?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResultSetSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectConnectGatewayAttachmentsResult {
        var directConnectGatewayAttachments: DirectConnectGatewayAttachmentList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectConnectGatewaysRequest {
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResultSetSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDirectConnectGatewaysResult {
        var directConnectGateways: DirectConnectGatewayList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHostedConnectionsRequest {
        var connectionId: ConnectionId
    }
    interface DescribeInterconnectLoaRequest {
        var interconnectId: InterconnectId
        var providerName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
        var loaContentType: String /* "application/pdf" | String */
    }
    interface DescribeInterconnectLoaResponse {
        var loa: Loa?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInterconnectsRequest {
        var interconnectId: InterconnectId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLagsRequest {
        var lagId: LagId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoaRequest {
        var connectionId: ConnectionId
        var providerName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
        var loaContentType: String /* "application/pdf" | String */
    }
    interface DescribeTagsRequest {
        var resourceArns: ResourceArnList
    }
    interface DescribeTagsResponse {
        var resourceTags: ResourceTagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVirtualInterfacesRequest {
        var connectionId: ConnectionId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualInterfaceId: VirtualInterfaceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DirectConnectGateway {
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var directConnectGatewayName: DirectConnectGatewayName?
            get() = definedExternally
            set(value) = definedExternally
        var amazonSideAsn: LongAsn?
            get() = definedExternally
            set(value) = definedExternally
        var ownerAccount: OwnerAccount?
            get() = definedExternally
            set(value) = definedExternally
        var directConnectGatewayState: String /* "pending" | "available" | "deleting" | "deleted" | String */
        var stateChangeError: StateChangeError?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DirectConnectGatewayAssociation {
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var directConnectGatewayOwnerAccount: OwnerAccount?
            get() = definedExternally
            set(value) = definedExternally
        var associationState: String /* "associating" | "associated" | "disassociating" | "disassociated" | "updating" | String */
        var stateChangeError: StateChangeError?
            get() = definedExternally
            set(value) = definedExternally
        var associatedGateway: AssociatedGateway?
            get() = definedExternally
            set(value) = definedExternally
        var associationId: DirectConnectGatewayAssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var allowedPrefixesToDirectConnectGateway: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
        var virtualGatewayId: VirtualGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualGatewayRegion: VirtualGatewayRegion?
            get() = definedExternally
            set(value) = definedExternally
        var virtualGatewayOwnerAccount: OwnerAccount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DirectConnectGatewayAssociationProposal {
        var proposalId: DirectConnectGatewayAssociationProposalId?
            get() = definedExternally
            set(value) = definedExternally
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var directConnectGatewayOwnerAccount: OwnerAccount?
            get() = definedExternally
            set(value) = definedExternally
        var proposalState: String /* "requested" | "accepted" | "deleted" | String */
        var associatedGateway: AssociatedGateway?
            get() = definedExternally
            set(value) = definedExternally
        var existingAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
        var requestedAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DirectConnectGatewayAttachment {
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualInterfaceId: VirtualInterfaceId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualInterfaceRegion: VirtualInterfaceRegion?
            get() = definedExternally
            set(value) = definedExternally
        var virtualInterfaceOwnerAccount: OwnerAccount?
            get() = definedExternally
            set(value) = definedExternally
        var attachmentState: String /* "attaching" | "attached" | "detaching" | "detached" | String */
        var attachmentType: String /* "TransitVirtualInterface" | "PrivateVirtualInterface" | String */
        var stateChangeError: StateChangeError?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateConnectionFromLagRequest {
        var connectionId: ConnectionId
        var lagId: LagId
    }
    interface Interconnect {
        var interconnectId: InterconnectId?
            get() = definedExternally
            set(value) = definedExternally
        var interconnectName: InterconnectName?
            get() = definedExternally
            set(value) = definedExternally
        var interconnectState: String /* "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "unknown" | String */
        var region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var location: LocationCode?
            get() = definedExternally
            set(value) = definedExternally
        var bandwidth: Bandwidth?
            get() = definedExternally
            set(value) = definedExternally
        var loaIssueTime: LoaIssueTime?
            get() = definedExternally
            set(value) = definedExternally
        var lagId: LagId?
            get() = definedExternally
            set(value) = definedExternally
        var awsDevice: AwsDevice?
            get() = definedExternally
            set(value) = definedExternally
        var jumboFrameCapable: JumboFrameCapable?
            get() = definedExternally
            set(value) = definedExternally
        var awsDeviceV2: AwsDeviceV2?
            get() = definedExternally
            set(value) = definedExternally
        var hasLogicalRedundancy: String /* "unknown" | "yes" | "no" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var providerName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Interconnects {
        var interconnects: InterconnectList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Lag {
        var connectionsBandwidth: Bandwidth?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfConnections: Count?
            get() = definedExternally
            set(value) = definedExternally
        var lagId: LagId?
            get() = definedExternally
            set(value) = definedExternally
        var ownerAccount: OwnerAccount?
            get() = definedExternally
            set(value) = definedExternally
        var lagName: LagName?
            get() = definedExternally
            set(value) = definedExternally
        var lagState: String /* "requested" | "pending" | "available" | "down" | "deleting" | "deleted" | "unknown" | String */
        var location: LocationCode?
            get() = definedExternally
            set(value) = definedExternally
        var region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var minimumLinks: Count?
            get() = definedExternally
            set(value) = definedExternally
        var awsDevice: AwsDevice?
            get() = definedExternally
            set(value) = definedExternally
        var awsDeviceV2: AwsDeviceV2?
            get() = definedExternally
            set(value) = definedExternally
        var connections: ConnectionList?
            get() = definedExternally
            set(value) = definedExternally
        var allowsHostedConnections: BooleanFlag?
            get() = definedExternally
            set(value) = definedExternally
        var jumboFrameCapable: JumboFrameCapable?
            get() = definedExternally
            set(value) = definedExternally
        var hasLogicalRedundancy: String /* "unknown" | "yes" | "no" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var providerName: ProviderName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Lags {
        var lags: LagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Loa {
        var loaContent: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var loaContentType: String /* "application/pdf" | String */
    }
    interface Location {
        var locationCode: LocationCode?
            get() = definedExternally
            set(value) = definedExternally
        var locationName: LocationName?
            get() = definedExternally
            set(value) = definedExternally
        var region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var availablePortSpeeds: AvailablePortSpeeds?
            get() = definedExternally
            set(value) = definedExternally
        var availableProviders: ProviderList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Locations {
        var locations: LocationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NewBGPPeer {
        var asn: ASN?
            get() = definedExternally
            set(value) = definedExternally
        var authKey: BGPAuthKey?
            get() = definedExternally
            set(value) = definedExternally
        var addressFamily: String /* "ipv4" | "ipv6" | String */
        var amazonAddress: AmazonAddress?
            get() = definedExternally
            set(value) = definedExternally
        var customerAddress: CustomerAddress?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NewPrivateVirtualInterface {
        var virtualInterfaceName: VirtualInterfaceName
        var vlan: VLAN
        var asn: ASN
        var mtu: MTU?
            get() = definedExternally
            set(value) = definedExternally
        var authKey: BGPAuthKey?
            get() = definedExternally
            set(value) = definedExternally
        var amazonAddress: AmazonAddress?
            get() = definedExternally
            set(value) = definedExternally
        var customerAddress: CustomerAddress?
            get() = definedExternally
            set(value) = definedExternally
        var addressFamily: String /* "ipv4" | "ipv6" | String */
        var virtualGatewayId: VirtualGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NewPrivateVirtualInterfaceAllocation {
        var virtualInterfaceName: VirtualInterfaceName
        var vlan: VLAN
        var asn: ASN
        var mtu: MTU?
            get() = definedExternally
            set(value) = definedExternally
        var authKey: BGPAuthKey?
            get() = definedExternally
            set(value) = definedExternally
        var amazonAddress: AmazonAddress?
            get() = definedExternally
            set(value) = definedExternally
        var addressFamily: String /* "ipv4" | "ipv6" | String */
        var customerAddress: CustomerAddress?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NewPublicVirtualInterface {
        var virtualInterfaceName: VirtualInterfaceName
        var vlan: VLAN
        var asn: ASN
        var authKey: BGPAuthKey?
            get() = definedExternally
            set(value) = definedExternally
        var amazonAddress: AmazonAddress?
            get() = definedExternally
            set(value) = definedExternally
        var customerAddress: CustomerAddress?
            get() = definedExternally
            set(value) = definedExternally
        var addressFamily: String /* "ipv4" | "ipv6" | String */
        var routeFilterPrefixes: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NewPublicVirtualInterfaceAllocation {
        var virtualInterfaceName: VirtualInterfaceName
        var vlan: VLAN
        var asn: ASN
        var authKey: BGPAuthKey?
            get() = definedExternally
            set(value) = definedExternally
        var amazonAddress: AmazonAddress?
            get() = definedExternally
            set(value) = definedExternally
        var customerAddress: CustomerAddress?
            get() = definedExternally
            set(value) = definedExternally
        var addressFamily: String /* "ipv4" | "ipv6" | String */
        var routeFilterPrefixes: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NewTransitVirtualInterface {
        var virtualInterfaceName: VirtualInterfaceName?
            get() = definedExternally
            set(value) = definedExternally
        var vlan: VLAN?
            get() = definedExternally
            set(value) = definedExternally
        var asn: ASN?
            get() = definedExternally
            set(value) = definedExternally
        var mtu: MTU?
            get() = definedExternally
            set(value) = definedExternally
        var authKey: BGPAuthKey?
            get() = definedExternally
            set(value) = definedExternally
        var amazonAddress: AmazonAddress?
            get() = definedExternally
            set(value) = definedExternally
        var customerAddress: CustomerAddress?
            get() = definedExternally
            set(value) = definedExternally
        var addressFamily: String /* "ipv4" | "ipv6" | String */
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NewTransitVirtualInterfaceAllocation {
        var virtualInterfaceName: VirtualInterfaceName?
            get() = definedExternally
            set(value) = definedExternally
        var vlan: VLAN?
            get() = definedExternally
            set(value) = definedExternally
        var asn: ASN?
            get() = definedExternally
            set(value) = definedExternally
        var mtu: MTU?
            get() = definedExternally
            set(value) = definedExternally
        var authKey: BGPAuthKey?
            get() = definedExternally
            set(value) = definedExternally
        var amazonAddress: AmazonAddress?
            get() = definedExternally
            set(value) = definedExternally
        var customerAddress: CustomerAddress?
            get() = definedExternally
            set(value) = definedExternally
        var addressFamily: String /* "ipv4" | "ipv6" | String */
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTag {
        var resourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RouteFilterPrefix {
        var cidr: CIDR?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey
        var value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var resourceArn: ResourceArn
        var tags: TagList
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var resourceArn: ResourceArn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateDirectConnectGatewayAssociationRequest {
        var associationId: DirectConnectGatewayAssociationId?
            get() = definedExternally
            set(value) = definedExternally
        var addAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
        var removeAllowedPrefixesToDirectConnectGateway: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDirectConnectGatewayAssociationResult {
        var directConnectGatewayAssociation: DirectConnectGatewayAssociation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLagRequest {
        var lagId: LagId
        var lagName: LagName?
            get() = definedExternally
            set(value) = definedExternally
        var minimumLinks: Count?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVirtualInterfaceAttributesRequest {
        var virtualInterfaceId: VirtualInterfaceId
        var mtu: MTU?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VirtualGateway {
        var virtualGatewayId: VirtualGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualGatewayState: VirtualGatewayState?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VirtualGateways {
        var virtualGateways: VirtualGatewayList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VirtualInterface {
        var ownerAccount: OwnerAccount?
            get() = definedExternally
            set(value) = definedExternally
        var virtualInterfaceId: VirtualInterfaceId?
            get() = definedExternally
            set(value) = definedExternally
        var location: LocationCode?
            get() = definedExternally
            set(value) = definedExternally
        var connectionId: ConnectionId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualInterfaceType: VirtualInterfaceType?
            get() = definedExternally
            set(value) = definedExternally
        var virtualInterfaceName: VirtualInterfaceName?
            get() = definedExternally
            set(value) = definedExternally
        var vlan: VLAN?
            get() = definedExternally
            set(value) = definedExternally
        var asn: ASN?
            get() = definedExternally
            set(value) = definedExternally
        var amazonSideAsn: LongAsn?
            get() = definedExternally
            set(value) = definedExternally
        var authKey: BGPAuthKey?
            get() = definedExternally
            set(value) = definedExternally
        var amazonAddress: AmazonAddress?
            get() = definedExternally
            set(value) = definedExternally
        var customerAddress: CustomerAddress?
            get() = definedExternally
            set(value) = definedExternally
        var addressFamily: String /* "ipv4" | "ipv6" | String */
        var virtualInterfaceState: String /* "confirming" | "verifying" | "pending" | "available" | "down" | "deleting" | "deleted" | "rejected" | "unknown" | String */
        var customerRouterConfig: RouterConfig?
            get() = definedExternally
            set(value) = definedExternally
        var mtu: MTU?
            get() = definedExternally
            set(value) = definedExternally
        var jumboFrameCapable: JumboFrameCapable?
            get() = definedExternally
            set(value) = definedExternally
        var virtualGatewayId: VirtualGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var directConnectGatewayId: DirectConnectGatewayId?
            get() = definedExternally
            set(value) = definedExternally
        var routeFilterPrefixes: RouteFilterPrefixList?
            get() = definedExternally
            set(value) = definedExternally
        var bgpPeers: BGPPeerList?
            get() = definedExternally
            set(value) = definedExternally
        var region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var awsDeviceV2: AwsDeviceV2?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VirtualInterfaces {
        var virtualInterfaces: VirtualInterfaceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2012-10-25" | "latest" | String */
    }
}