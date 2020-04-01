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
import AppMesh.GrpcRouteMetadata
import AppMesh.VirtualServiceRef
import AppMesh.VirtualRouterListener
import AppMesh.MeshRef
import AppMesh.TagRef
import AppMesh.Listener
import AppMesh.Backend
import AppMesh.AwsCloudMapInstanceAttribute
import AppMesh.VirtualRouterRef
import AppMesh.VirtualNodeRef
import AppMesh.RouteRef
import AppMesh.WeightedTarget
import AppMesh.HttpRouteHeader
import AppMesh.CreateMeshInput
import AppMesh.CreateMeshOutput
import AppMesh.CreateRouteInput
import AppMesh.CreateRouteOutput
import AppMesh.CreateVirtualNodeInput
import AppMesh.CreateVirtualNodeOutput
import AppMesh.CreateVirtualRouterInput
import AppMesh.CreateVirtualRouterOutput
import AppMesh.CreateVirtualServiceInput
import AppMesh.CreateVirtualServiceOutput
import AppMesh.DeleteMeshInput
import AppMesh.DeleteMeshOutput
import AppMesh.DeleteRouteInput
import AppMesh.DeleteRouteOutput
import AppMesh.DeleteVirtualNodeInput
import AppMesh.DeleteVirtualNodeOutput
import AppMesh.DeleteVirtualRouterInput
import AppMesh.DeleteVirtualRouterOutput
import AppMesh.DeleteVirtualServiceInput
import AppMesh.DeleteVirtualServiceOutput
import AppMesh.DescribeMeshInput
import AppMesh.DescribeMeshOutput
import AppMesh.DescribeRouteInput
import AppMesh.DescribeRouteOutput
import AppMesh.DescribeVirtualNodeInput
import AppMesh.DescribeVirtualNodeOutput
import AppMesh.DescribeVirtualRouterInput
import AppMesh.DescribeVirtualRouterOutput
import AppMesh.DescribeVirtualServiceInput
import AppMesh.DescribeVirtualServiceOutput
import AppMesh.ListMeshesInput
import AppMesh.ListMeshesOutput
import AppMesh.ListRoutesInput
import AppMesh.ListRoutesOutput
import AppMesh.ListTagsForResourceInput
import AppMesh.ListTagsForResourceOutput
import AppMesh.ListVirtualNodesInput
import AppMesh.ListVirtualNodesOutput
import AppMesh.ListVirtualRoutersInput
import AppMesh.ListVirtualRoutersOutput
import AppMesh.ListVirtualServicesInput
import AppMesh.ListVirtualServicesOutput
import AppMesh.TagResourceInput
import AppMesh.TagResourceOutput
import AppMesh.UntagResourceInput
import AppMesh.UntagResourceOutput
import AppMesh.UpdateMeshInput
import AppMesh.UpdateMeshOutput
import AppMesh.UpdateRouteInput
import AppMesh.UpdateRouteOutput
import AppMesh.UpdateVirtualNodeInput
import AppMesh.UpdateVirtualNodeOutput
import AppMesh.UpdateVirtualRouterInput
import AppMesh.UpdateVirtualRouterOutput
import AppMesh.UpdateVirtualServiceInput
import AppMesh.UpdateVirtualServiceOutput
import AppMesh.PortMapping
import AppMesh.Duration
import AppMesh.VirtualNodeData
import AppMesh.AccessLog
import AppMesh.VirtualRouterData
import AppMesh.ClientPolicy
import AppMesh.ClientPolicyTls
import AppMesh.VirtualServiceData
import AppMesh.RouteData
import AppMesh.ResourceMetadata
import AppMesh.VirtualNodeSpec
import AppMesh.VirtualNodeStatus
import AppMesh.VirtualServiceBackend
import AppMesh.VirtualRouterSpec
import AppMesh.VirtualRouterStatus
import AppMesh.MeshSpec
import AppMesh.MeshData
import AppMesh.ListenerTlsAcmCertificate
import AppMesh.ListenerTlsFileCertificate
import AppMesh.BackendDefaults
import AppMesh.Logging
import AppMesh.ServiceDiscovery
import AppMesh.TlsValidationContextAcmTrust
import AppMesh.TlsValidationContextFileTrust
import AppMesh.RouteSpec
import AppMesh.RouteStatus
import AppMesh.MatchRange
import AppMesh.VirtualNodeServiceProvider
import AppMesh.VirtualRouterServiceProvider
import AppMesh.GrpcRoute
import AppMesh.HttpRoute
import AppMesh.TcpRoute
import AppMesh.TlsValidationContextTrust
import AppMesh.ListenerTlsCertificate
import AppMesh.VirtualServiceSpec
import AppMesh.VirtualServiceStatus
import AppMesh.HeaderMatchMethod
import AppMesh.VirtualServiceProvider
import AppMesh.TcpRouteAction
import AppMesh.FileAccessLog
import AppMesh.MeshStatus
import AppMesh.HealthCheckPolicy
import AppMesh.ListenerTls
import AppMesh.GrpcRouteAction
import AppMesh.GrpcRouteMatch
import AppMesh.GrpcRetryPolicy
import AppMesh.TlsValidationContext
import AppMesh.GrpcRouteMetadataMatchMethod
import AppMesh.HttpRouteAction
import AppMesh.HttpRouteMatch
import AppMesh.HttpRetryPolicy
import AppMesh.EgressFilter
import AppMesh.AwsCloudMapServiceDiscovery
import AppMesh.DnsServiceDiscovery

typealias TagKeyList = Array<TagKey>

typealias Long = Number

typealias GrpcRouteMetadataList = Array<GrpcRouteMetadata>

typealias VirtualServiceList = Array<VirtualServiceRef>

typealias Boolean = Boolean

typealias HttpRetryPolicyEvent = String

typealias CertificateAuthorityArns = Array<Arn>

typealias AwsCloudMapName = String

typealias HttpRetryPolicyEvents = Array<HttpRetryPolicyEvent>

typealias ListMeshesLimit = Number

typealias AwsCloudMapInstanceAttributeKey = String

typealias VirtualRouterListeners = Array<VirtualRouterListener>

typealias PortSet = Array<PortNumber>

typealias MeshList = Array<MeshRef>

typealias MaxRetries = Number

typealias AwsCloudMapInstanceAttributeValue = String

typealias HeaderName = String

typealias TagList = Array<TagRef>

typealias DurationValue = Number

typealias Hostname = String

typealias TagsLimit = Number

typealias TcpRetryPolicyEvents = Array<String /* "connection-error" | String */>

typealias GrpcRetryPolicyEvents = Array<String /* "cancelled" | "deadline-exceeded" | "internal" | "resource-exhausted" | "unavailable" | String */>

typealias Listeners = Array<Listener>

typealias Backends = Array<Backend>

typealias ServiceName = String

typealias HealthCheckThreshold = Number

typealias PercentInt = Number

typealias MethodName = String

typealias TagValue = String

typealias FilePath = String

typealias AwsCloudMapInstanceAttributes = Array<AwsCloudMapInstanceAttribute>

typealias ListVirtualServicesLimit = Number

typealias ListVirtualRoutersLimit = Number

typealias HealthCheckIntervalMillis = Number

typealias VirtualRouterList = Array<VirtualRouterRef>

typealias Arn = String

typealias VirtualNodeList = Array<VirtualNodeRef>

typealias RoutePriority = Number

typealias ListVirtualNodesLimit = Number

typealias HealthCheckTimeoutMillis = Number

typealias ResourceName = String

typealias Timestamp = Date

typealias HeaderMatch = String

typealias AccountId = String

typealias ListRoutesLimit = Number

typealias RouteList = Array<RouteRef>

typealias PortNumber = Number

typealias WeightedTargets = Array<WeightedTarget>

typealias HttpRouteHeaders = Array<HttpRouteHeader>

typealias String = String

typealias TagKey = String

@JsModule("aws-sdk")
external open class AppMesh(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & AppMesh.Types.ClientConfiguration */
    open fun createMesh(params: CreateMeshInput, callback: (err: AWSError, data: CreateMeshOutput) -> Unit = definedExternally): Request<CreateMeshOutput, AWSError>
    open fun createMesh(callback: (err: AWSError, data: CreateMeshOutput) -> Unit = definedExternally): Request<CreateMeshOutput, AWSError>
    open fun createRoute(params: CreateRouteInput, callback: (err: AWSError, data: CreateRouteOutput) -> Unit = definedExternally): Request<CreateRouteOutput, AWSError>
    open fun createRoute(callback: (err: AWSError, data: CreateRouteOutput) -> Unit = definedExternally): Request<CreateRouteOutput, AWSError>
    open fun createVirtualNode(params: CreateVirtualNodeInput, callback: (err: AWSError, data: CreateVirtualNodeOutput) -> Unit = definedExternally): Request<CreateVirtualNodeOutput, AWSError>
    open fun createVirtualNode(callback: (err: AWSError, data: CreateVirtualNodeOutput) -> Unit = definedExternally): Request<CreateVirtualNodeOutput, AWSError>
    open fun createVirtualRouter(params: CreateVirtualRouterInput, callback: (err: AWSError, data: CreateVirtualRouterOutput) -> Unit = definedExternally): Request<CreateVirtualRouterOutput, AWSError>
    open fun createVirtualRouter(callback: (err: AWSError, data: CreateVirtualRouterOutput) -> Unit = definedExternally): Request<CreateVirtualRouterOutput, AWSError>
    open fun createVirtualService(params: CreateVirtualServiceInput, callback: (err: AWSError, data: CreateVirtualServiceOutput) -> Unit = definedExternally): Request<CreateVirtualServiceOutput, AWSError>
    open fun createVirtualService(callback: (err: AWSError, data: CreateVirtualServiceOutput) -> Unit = definedExternally): Request<CreateVirtualServiceOutput, AWSError>
    open fun deleteMesh(params: DeleteMeshInput, callback: (err: AWSError, data: DeleteMeshOutput) -> Unit = definedExternally): Request<DeleteMeshOutput, AWSError>
    open fun deleteMesh(callback: (err: AWSError, data: DeleteMeshOutput) -> Unit = definedExternally): Request<DeleteMeshOutput, AWSError>
    open fun deleteRoute(params: DeleteRouteInput, callback: (err: AWSError, data: DeleteRouteOutput) -> Unit = definedExternally): Request<DeleteRouteOutput, AWSError>
    open fun deleteRoute(callback: (err: AWSError, data: DeleteRouteOutput) -> Unit = definedExternally): Request<DeleteRouteOutput, AWSError>
    open fun deleteVirtualNode(params: DeleteVirtualNodeInput, callback: (err: AWSError, data: DeleteVirtualNodeOutput) -> Unit = definedExternally): Request<DeleteVirtualNodeOutput, AWSError>
    open fun deleteVirtualNode(callback: (err: AWSError, data: DeleteVirtualNodeOutput) -> Unit = definedExternally): Request<DeleteVirtualNodeOutput, AWSError>
    open fun deleteVirtualRouter(params: DeleteVirtualRouterInput, callback: (err: AWSError, data: DeleteVirtualRouterOutput) -> Unit = definedExternally): Request<DeleteVirtualRouterOutput, AWSError>
    open fun deleteVirtualRouter(callback: (err: AWSError, data: DeleteVirtualRouterOutput) -> Unit = definedExternally): Request<DeleteVirtualRouterOutput, AWSError>
    open fun deleteVirtualService(params: DeleteVirtualServiceInput, callback: (err: AWSError, data: DeleteVirtualServiceOutput) -> Unit = definedExternally): Request<DeleteVirtualServiceOutput, AWSError>
    open fun deleteVirtualService(callback: (err: AWSError, data: DeleteVirtualServiceOutput) -> Unit = definedExternally): Request<DeleteVirtualServiceOutput, AWSError>
    open fun describeMesh(params: DescribeMeshInput, callback: (err: AWSError, data: DescribeMeshOutput) -> Unit = definedExternally): Request<DescribeMeshOutput, AWSError>
    open fun describeMesh(callback: (err: AWSError, data: DescribeMeshOutput) -> Unit = definedExternally): Request<DescribeMeshOutput, AWSError>
    open fun describeRoute(params: DescribeRouteInput, callback: (err: AWSError, data: DescribeRouteOutput) -> Unit = definedExternally): Request<DescribeRouteOutput, AWSError>
    open fun describeRoute(callback: (err: AWSError, data: DescribeRouteOutput) -> Unit = definedExternally): Request<DescribeRouteOutput, AWSError>
    open fun describeVirtualNode(params: DescribeVirtualNodeInput, callback: (err: AWSError, data: DescribeVirtualNodeOutput) -> Unit = definedExternally): Request<DescribeVirtualNodeOutput, AWSError>
    open fun describeVirtualNode(callback: (err: AWSError, data: DescribeVirtualNodeOutput) -> Unit = definedExternally): Request<DescribeVirtualNodeOutput, AWSError>
    open fun describeVirtualRouter(params: DescribeVirtualRouterInput, callback: (err: AWSError, data: DescribeVirtualRouterOutput) -> Unit = definedExternally): Request<DescribeVirtualRouterOutput, AWSError>
    open fun describeVirtualRouter(callback: (err: AWSError, data: DescribeVirtualRouterOutput) -> Unit = definedExternally): Request<DescribeVirtualRouterOutput, AWSError>
    open fun describeVirtualService(params: DescribeVirtualServiceInput, callback: (err: AWSError, data: DescribeVirtualServiceOutput) -> Unit = definedExternally): Request<DescribeVirtualServiceOutput, AWSError>
    open fun describeVirtualService(callback: (err: AWSError, data: DescribeVirtualServiceOutput) -> Unit = definedExternally): Request<DescribeVirtualServiceOutput, AWSError>
    open fun listMeshes(params: ListMeshesInput, callback: (err: AWSError, data: ListMeshesOutput) -> Unit = definedExternally): Request<ListMeshesOutput, AWSError>
    open fun listMeshes(callback: (err: AWSError, data: ListMeshesOutput) -> Unit = definedExternally): Request<ListMeshesOutput, AWSError>
    open fun listRoutes(params: ListRoutesInput, callback: (err: AWSError, data: ListRoutesOutput) -> Unit = definedExternally): Request<ListRoutesOutput, AWSError>
    open fun listRoutes(callback: (err: AWSError, data: ListRoutesOutput) -> Unit = definedExternally): Request<ListRoutesOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listVirtualNodes(params: ListVirtualNodesInput, callback: (err: AWSError, data: ListVirtualNodesOutput) -> Unit = definedExternally): Request<ListVirtualNodesOutput, AWSError>
    open fun listVirtualNodes(callback: (err: AWSError, data: ListVirtualNodesOutput) -> Unit = definedExternally): Request<ListVirtualNodesOutput, AWSError>
    open fun listVirtualRouters(params: ListVirtualRoutersInput, callback: (err: AWSError, data: ListVirtualRoutersOutput) -> Unit = definedExternally): Request<ListVirtualRoutersOutput, AWSError>
    open fun listVirtualRouters(callback: (err: AWSError, data: ListVirtualRoutersOutput) -> Unit = definedExternally): Request<ListVirtualRoutersOutput, AWSError>
    open fun listVirtualServices(params: ListVirtualServicesInput, callback: (err: AWSError, data: ListVirtualServicesOutput) -> Unit = definedExternally): Request<ListVirtualServicesOutput, AWSError>
    open fun listVirtualServices(callback: (err: AWSError, data: ListVirtualServicesOutput) -> Unit = definedExternally): Request<ListVirtualServicesOutput, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun updateMesh(params: UpdateMeshInput, callback: (err: AWSError, data: UpdateMeshOutput) -> Unit = definedExternally): Request<UpdateMeshOutput, AWSError>
    open fun updateMesh(callback: (err: AWSError, data: UpdateMeshOutput) -> Unit = definedExternally): Request<UpdateMeshOutput, AWSError>
    open fun updateRoute(params: UpdateRouteInput, callback: (err: AWSError, data: UpdateRouteOutput) -> Unit = definedExternally): Request<UpdateRouteOutput, AWSError>
    open fun updateRoute(callback: (err: AWSError, data: UpdateRouteOutput) -> Unit = definedExternally): Request<UpdateRouteOutput, AWSError>
    open fun updateVirtualNode(params: UpdateVirtualNodeInput, callback: (err: AWSError, data: UpdateVirtualNodeOutput) -> Unit = definedExternally): Request<UpdateVirtualNodeOutput, AWSError>
    open fun updateVirtualNode(callback: (err: AWSError, data: UpdateVirtualNodeOutput) -> Unit = definedExternally): Request<UpdateVirtualNodeOutput, AWSError>
    open fun updateVirtualRouter(params: UpdateVirtualRouterInput, callback: (err: AWSError, data: UpdateVirtualRouterOutput) -> Unit = definedExternally): Request<UpdateVirtualRouterOutput, AWSError>
    open fun updateVirtualRouter(callback: (err: AWSError, data: UpdateVirtualRouterOutput) -> Unit = definedExternally): Request<UpdateVirtualRouterOutput, AWSError>
    open fun updateVirtualService(params: UpdateVirtualServiceInput, callback: (err: AWSError, data: UpdateVirtualServiceOutput) -> Unit = definedExternally): Request<UpdateVirtualServiceOutput, AWSError>
    open fun updateVirtualService(callback: (err: AWSError, data: UpdateVirtualServiceOutput) -> Unit = definedExternally): Request<UpdateVirtualServiceOutput, AWSError>
    interface VirtualRouterListener {
        var portMapping: PortMapping
    }
    interface GrpcRetryPolicy {
        var grpcRetryEvents: GrpcRetryPolicyEvents?
            get() = definedExternally
            set(value) = definedExternally
        var httpRetryEvents: HttpRetryPolicyEvents?
            get() = definedExternally
            set(value) = definedExternally
        var maxRetries: MaxRetries
        var perRetryTimeout: Duration
        var tcpRetryEvents: TcpRetryPolicyEvents?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVirtualNodeOutput {
        var virtualNode: VirtualNodeData
    }
    interface Logging {
        var accessLog: AccessLog?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVirtualRouterOutput {
        var virtualRouter: VirtualRouterData
    }
    interface ListVirtualRoutersOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var virtualRouters: VirtualRouterList
    }
    interface ResourceMetadata {
        var arn: Arn
        var createdAt: Timestamp
        var lastUpdatedAt: Timestamp
        var meshOwner: AccountId
        var resourceOwner: AccountId
        var uid: String
        var version: Long
    }
    interface UpdateVirtualNodeOutput {
        var virtualNode: VirtualNodeData
    }
    interface ListRoutesOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var routes: RouteList
    }
    interface VirtualServiceBackend {
        var clientPolicy: ClientPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var virtualServiceName: ServiceName
    }
    interface HealthCheckPolicy {
        var healthyThreshold: HealthCheckThreshold
        var intervalMillis: HealthCheckIntervalMillis
        var path: String?
            get() = definedExternally
            set(value) = definedExternally
        var port: PortNumber?
            get() = definedExternally
            set(value) = definedExternally
        var protocol: String /* "grpc" | "http" | "http2" | "tcp" | String */
        var timeoutMillis: HealthCheckTimeoutMillis
        var unhealthyThreshold: HealthCheckThreshold
    }
    interface EgressFilter {
        var type: String /* "ALLOW_ALL" | "DROP_ALL" | String */
    }
    interface ClientPolicy {
        var tls: ClientPolicyTls?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVirtualServiceOutput {
        var virtualService: VirtualServiceData
    }
    interface DescribeVirtualNodeOutput {
        var virtualNode: VirtualNodeData
    }
    interface CreateRouteOutput {
        var route: RouteData
    }
    interface DnsServiceDiscovery {
        var hostname: Hostname
    }
    interface DeleteRouteInput {
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var routeName: ResourceName
        var virtualRouterName: ResourceName
    }
    interface VirtualNodeData {
        var meshName: ResourceName
        var metadata: ResourceMetadata
        var spec: VirtualNodeSpec
        var status: VirtualNodeStatus
        var virtualNodeName: ResourceName
    }
    interface UntagResourceOutput
    interface Backend {
        var virtualService: VirtualServiceBackend?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMeshesInput {
        var limit: ListMeshesLimit?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VirtualRouterData {
        var meshName: ResourceName
        var metadata: ResourceMetadata
        var spec: VirtualRouterSpec
        var status: VirtualRouterStatus
        var virtualRouterName: ResourceName
    }
    interface UpdateMeshInput {
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var spec: MeshSpec?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVirtualRouterInput {
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var spec: VirtualRouterSpec
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var virtualRouterName: ResourceName
    }
    interface DescribeVirtualRouterOutput {
        var virtualRouter: VirtualRouterData
    }
    interface CreateMeshOutput {
        var mesh: MeshData
    }
    interface CreateVirtualRouterOutput {
        var virtualRouter: VirtualRouterData
    }
    interface VirtualServiceStatus {
        var status: String /* "ACTIVE" | "DELETED" | "INACTIVE" | String */
    }
    interface ListenerTlsCertificate {
        var acm: ListenerTlsAcmCertificate?
            get() = definedExternally
            set(value) = definedExternally
        var file: ListenerTlsFileCertificate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VirtualRouterSpec {
        var listeners: VirtualRouterListeners?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VirtualNodeSpec {
        var backendDefaults: BackendDefaults?
            get() = definedExternally
            set(value) = definedExternally
        var backends: Backends?
            get() = definedExternally
            set(value) = definedExternally
        var listeners: Listeners?
            get() = definedExternally
            set(value) = definedExternally
        var logging: Logging?
            get() = definedExternally
            set(value) = definedExternally
        var serviceDiscovery: ServiceDiscovery?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMeshesOutput {
        var meshes: MeshList
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TlsValidationContextTrust {
        var acm: TlsValidationContextAcmTrust?
            get() = definedExternally
            set(value) = definedExternally
        var file: TlsValidationContextFileTrust?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PortMapping {
        var port: PortNumber
        var protocol: String /* "grpc" | "http" | "http2" | "tcp" | String */
    }
    interface ListVirtualServicesOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var virtualServices: VirtualServiceList
    }
    interface WeightedTarget {
        var virtualNode: ResourceName
        var weight: PercentInt
    }
    interface RouteRef {
        var arn: Arn
        var meshName: ResourceName
        var meshOwner: AccountId
        var resourceOwner: AccountId
        var routeName: ResourceName
        var virtualRouterName: ResourceName
    }
    interface DeleteVirtualNodeInput {
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualNodeName: ResourceName
    }
    interface RouteData {
        var meshName: ResourceName
        var metadata: ResourceMetadata
        var routeName: ResourceName
        var spec: RouteSpec
        var status: RouteStatus
        var virtualRouterName: ResourceName
    }
    interface TlsValidationContextAcmTrust {
        var certificateAuthorityArns: CertificateAuthorityArns
    }
    interface HeaderMatchMethod {
        var exact: HeaderMatch?
            get() = definedExternally
            set(value) = definedExternally
        var prefix: HeaderMatch?
            get() = definedExternally
            set(value) = definedExternally
        var range: MatchRange?
            get() = definedExternally
            set(value) = definedExternally
        var regex: HeaderMatch?
            get() = definedExternally
            set(value) = definedExternally
        var suffix: HeaderMatch?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteMeshOutput {
        var mesh: MeshData
    }
    interface TagResourceInput {
        var resourceArn: Arn
        var tags: TagList
    }
    interface VirtualServiceProvider {
        var virtualNode: VirtualNodeServiceProvider?
            get() = definedExternally
            set(value) = definedExternally
        var virtualRouter: VirtualRouterServiceProvider?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GrpcRouteMatch {
        var metadata: GrpcRouteMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var methodName: MethodName?
            get() = definedExternally
            set(value) = definedExternally
        var serviceName: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCloudMapServiceDiscovery {
        var attributes: AwsCloudMapInstanceAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var namespaceName: AwsCloudMapName
        var serviceName: AwsCloudMapName
    }
    interface UpdateVirtualServiceOutput {
        var virtualService: VirtualServiceData
    }
    interface MeshStatus {
        var status: String /* "ACTIVE" | "DELETED" | "INACTIVE" | String */
    }
    interface CreateVirtualNodeInput {
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var spec: VirtualNodeSpec
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var virtualNodeName: ResourceName
    }
    interface RouteSpec {
        var grpcRoute: GrpcRoute?
            get() = definedExternally
            set(value) = definedExternally
        var http2Route: HttpRoute?
            get() = definedExternally
            set(value) = definedExternally
        var httpRoute: HttpRoute?
            get() = definedExternally
            set(value) = definedExternally
        var priority: RoutePriority?
            get() = definedExternally
            set(value) = definedExternally
        var tcpRoute: TcpRoute?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVirtualServiceOutput {
        var virtualService: VirtualServiceData
    }
    interface FileAccessLog {
        var path: FilePath
    }
    interface VirtualRouterServiceProvider {
        var virtualRouterName: ResourceName
    }
    interface DeleteVirtualServiceInput {
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualServiceName: ServiceName
    }
    interface TlsValidationContext {
        var trust: TlsValidationContextTrust
    }
    interface DeleteVirtualRouterOutput {
        var virtualRouter: VirtualRouterData
    }
    interface DeleteVirtualNodeOutput {
        var virtualNode: VirtualNodeData
    }
    interface UpdateVirtualNodeInput {
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var spec: VirtualNodeSpec
        var virtualNodeName: ResourceName
    }
    interface ListenerTls {
        var certificate: ListenerTlsCertificate
        var mode: String /* "DISABLED" | "PERMISSIVE" | "STRICT" | String */
    }
    interface DeleteMeshInput {
        var meshName: ResourceName
    }
    interface CreateVirtualServiceInput {
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var spec: VirtualServiceSpec
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var virtualServiceName: ServiceName
    }
    interface UpdateVirtualRouterInput {
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var spec: VirtualRouterSpec
        var virtualRouterName: ResourceName
    }
    interface ListTagsForResourceInput {
        var limit: TagsLimit?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArn: Arn
    }
    interface DescribeMeshOutput {
        var mesh: MeshData
    }
    interface DeleteVirtualRouterInput {
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualRouterName: ResourceName
    }
    interface DescribeRouteInput {
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var routeName: ResourceName
        var virtualRouterName: ResourceName
    }
    interface DeleteRouteOutput {
        var route: RouteData
    }
    interface UpdateVirtualServiceInput {
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var spec: VirtualServiceSpec
        var virtualServiceName: ServiceName
    }
    interface UpdateRouteOutput {
        var route: RouteData
    }
    interface HttpRouteAction {
        var weightedTargets: WeightedTargets
    }
    interface ListRoutesInput {
        var limit: ListRoutesLimit?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var virtualRouterName: ResourceName
    }
    interface VirtualServiceRef {
        var arn: Arn
        var meshName: ResourceName
        var meshOwner: AccountId
        var resourceOwner: AccountId
        var virtualServiceName: ServiceName
    }
    interface VirtualNodeStatus {
        var status: String /* "ACTIVE" | "DELETED" | "INACTIVE" | String */
    }
    interface VirtualRouterRef {
        var arn: Arn
        var meshName: ResourceName
        var meshOwner: AccountId
        var resourceOwner: AccountId
        var virtualRouterName: ResourceName
    }
    interface VirtualServiceData {
        var meshName: ResourceName
        var metadata: ResourceMetadata
        var spec: VirtualServiceSpec
        var status: VirtualServiceStatus
        var virtualServiceName: ServiceName
    }
    interface HttpRouteHeader {
        var invert: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var match: HeaderMatchMethod?
            get() = definedExternally
            set(value) = definedExternally
        var name: HeaderName
    }
    interface VirtualNodeRef {
        var arn: Arn
        var meshName: ResourceName
        var meshOwner: AccountId
        var resourceOwner: AccountId
        var virtualNodeName: ResourceName
    }
    interface CreateMeshInput {
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var spec: MeshSpec?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GrpcRouteAction {
        var weightedTargets: WeightedTargets
    }
    interface UpdateMeshOutput {
        var mesh: MeshData
    }
    interface GrpcRouteMetadataMatchMethod {
        var exact: HeaderMatch?
            get() = definedExternally
            set(value) = definedExternally
        var prefix: HeaderMatch?
            get() = definedExternally
            set(value) = definedExternally
        var range: MatchRange?
            get() = definedExternally
            set(value) = definedExternally
        var regex: HeaderMatch?
            get() = definedExternally
            set(value) = definedExternally
        var suffix: HeaderMatch?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVirtualServiceInput {
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualServiceName: ServiceName
    }
    interface AwsCloudMapInstanceAttribute {
        var key: AwsCloudMapInstanceAttributeKey
        var value: AwsCloudMapInstanceAttributeValue
    }
    interface VirtualServiceSpec {
        var provider: VirtualServiceProvider?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MatchRange {
        var end: Long
        var start: Long
    }
    interface TcpRoute {
        var action: TcpRouteAction
    }
    interface ListVirtualRoutersInput {
        var limit: ListVirtualRoutersLimit?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVirtualServicesInput {
        var limit: ListVirtualServicesLimit?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccessLog {
        var file: FileAccessLog?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVirtualNodesInput {
        var limit: ListVirtualNodesLimit?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Duration {
        var unit: String /* "ms" | "s" | String */
        var value: DurationValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRouteOutput {
        var route: RouteData
    }
    interface HttpRouteMatch {
        var headers: HttpRouteHeaders?
            get() = definedExternally
            set(value) = definedExternally
        var method: String /* "CONNECT" | "DELETE" | "GET" | "HEAD" | "OPTIONS" | "PATCH" | "POST" | "PUT" | "TRACE" | String */
        var prefix: String
        var scheme: String /* "http" | "https" | String */
    }
    interface TagRef {
        var key: TagKey
        var value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MeshRef {
        var arn: Arn
        var meshName: ResourceName
        var meshOwner: AccountId
        var resourceOwner: AccountId
    }
    interface MeshData {
        var meshName: ResourceName
        var metadata: ResourceMetadata
        var spec: MeshSpec
        var status: MeshStatus
    }
    interface VirtualRouterStatus {
        var status: String /* "ACTIVE" | "DELETED" | "INACTIVE" | String */
    }
    interface TcpRouteAction {
        var weightedTargets: WeightedTargets
    }
    interface DescribeVirtualNodeInput {
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualNodeName: ResourceName
    }
    interface RouteStatus {
        var status: String /* "ACTIVE" | "DELETED" | "INACTIVE" | String */
    }
    interface Listener {
        var healthCheck: HealthCheckPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var portMapping: PortMapping
        var tls: ListenerTls?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GrpcRoute {
        var action: GrpcRouteAction
        var match: GrpcRouteMatch
        var retryPolicy: GrpcRetryPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientPolicyTls {
        var enforce: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ports: PortSet?
            get() = definedExternally
            set(value) = definedExternally
        var validation: TlsValidationContext
    }
    interface DeleteVirtualServiceOutput {
        var virtualService: VirtualServiceData
    }
    interface VirtualNodeServiceProvider {
        var virtualNodeName: ResourceName
    }
    interface BackendDefaults {
        var clientPolicy: ClientPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListenerTlsFileCertificate {
        var certificateChain: FilePath
        var privateKey: FilePath
    }
    interface HttpRetryPolicy {
        var httpRetryEvents: HttpRetryPolicyEvents?
            get() = definedExternally
            set(value) = definedExternally
        var maxRetries: MaxRetries
        var perRetryTimeout: Duration
        var tcpRetryEvents: TcpRetryPolicyEvents?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeVirtualRouterInput {
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var virtualRouterName: ResourceName
    }
    interface TagResourceOutput
    interface TlsValidationContextFileTrust {
        var certificateChain: FilePath
    }
    interface GrpcRouteMetadata {
        var invert: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var match: GrpcRouteMetadataMatchMethod?
            get() = definedExternally
            set(value) = definedExternally
        var name: HeaderName
    }
    interface CreateRouteInput {
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var routeName: ResourceName
        var spec: RouteSpec
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var virtualRouterName: ResourceName
    }
    interface UpdateRouteInput {
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var routeName: ResourceName
        var spec: RouteSpec
        var virtualRouterName: ResourceName
    }
    interface HttpRoute {
        var action: HttpRouteAction
        var match: HttpRouteMatch
        var retryPolicy: HttpRetryPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMeshInput {
        var meshName: ResourceName
        var meshOwner: AccountId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MeshSpec {
        var egressFilter: EgressFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList
    }
    interface ServiceDiscovery {
        var awsCloudMap: AwsCloudMapServiceDiscovery?
            get() = definedExternally
            set(value) = definedExternally
        var dns: DnsServiceDiscovery?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVirtualNodesOutput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var virtualNodes: VirtualNodeList
    }
    interface UntagResourceInput {
        var resourceArn: Arn
        var tagKeys: TagKeyList
    }
    interface ListenerTlsAcmCertificate {
        var certificateArn: Arn
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-10-01" | "2019-01-25" | "latest" | String */
    }
}