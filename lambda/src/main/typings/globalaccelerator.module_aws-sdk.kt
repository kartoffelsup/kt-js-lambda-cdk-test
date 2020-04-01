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
import GlobalAccelerator.Accelerator
import GlobalAccelerator.ByoipCidr
import GlobalAccelerator.EndpointConfiguration
import GlobalAccelerator.EndpointDescription
import GlobalAccelerator.EndpointGroup
import GlobalAccelerator.IpSet
import GlobalAccelerator.Listener
import GlobalAccelerator.PortRange
import GlobalAccelerator.Tag
import GlobalAccelerator.AdvertiseByoipCidrRequest
import GlobalAccelerator.AdvertiseByoipCidrResponse
import GlobalAccelerator.CreateAcceleratorRequest
import GlobalAccelerator.CreateAcceleratorResponse
import GlobalAccelerator.CreateEndpointGroupRequest
import GlobalAccelerator.CreateEndpointGroupResponse
import GlobalAccelerator.CreateListenerRequest
import GlobalAccelerator.CreateListenerResponse
import GlobalAccelerator.DeleteAcceleratorRequest
import GlobalAccelerator.DeleteEndpointGroupRequest
import GlobalAccelerator.DeleteListenerRequest
import GlobalAccelerator.DeprovisionByoipCidrRequest
import GlobalAccelerator.DeprovisionByoipCidrResponse
import GlobalAccelerator.DescribeAcceleratorRequest
import GlobalAccelerator.DescribeAcceleratorResponse
import GlobalAccelerator.DescribeAcceleratorAttributesRequest
import GlobalAccelerator.DescribeAcceleratorAttributesResponse
import GlobalAccelerator.DescribeEndpointGroupRequest
import GlobalAccelerator.DescribeEndpointGroupResponse
import GlobalAccelerator.DescribeListenerRequest
import GlobalAccelerator.DescribeListenerResponse
import GlobalAccelerator.ListAcceleratorsRequest
import GlobalAccelerator.ListAcceleratorsResponse
import GlobalAccelerator.ListByoipCidrsRequest
import GlobalAccelerator.ListByoipCidrsResponse
import GlobalAccelerator.ListEndpointGroupsRequest
import GlobalAccelerator.ListEndpointGroupsResponse
import GlobalAccelerator.ListListenersRequest
import GlobalAccelerator.ListListenersResponse
import GlobalAccelerator.ListTagsForResourceRequest
import GlobalAccelerator.ListTagsForResourceResponse
import GlobalAccelerator.ProvisionByoipCidrRequest
import GlobalAccelerator.ProvisionByoipCidrResponse
import GlobalAccelerator.TagResourceRequest
import GlobalAccelerator.TagResourceResponse
import GlobalAccelerator.UntagResourceRequest
import GlobalAccelerator.UntagResourceResponse
import GlobalAccelerator.UpdateAcceleratorRequest
import GlobalAccelerator.UpdateAcceleratorResponse
import GlobalAccelerator.UpdateAcceleratorAttributesRequest
import GlobalAccelerator.UpdateAcceleratorAttributesResponse
import GlobalAccelerator.UpdateEndpointGroupRequest
import GlobalAccelerator.UpdateEndpointGroupResponse
import GlobalAccelerator.UpdateListenerRequest
import GlobalAccelerator.UpdateListenerResponse
import GlobalAccelerator.WithdrawByoipCidrRequest
import GlobalAccelerator.WithdrawByoipCidrResponse
import GlobalAccelerator.AcceleratorAttributes
import GlobalAccelerator.CidrAuthorizationContext

typealias Accelerators = Array<Accelerator>

typealias ByoipCidrs = Array<ByoipCidr>

typealias EndpointConfigurations = Array<EndpointConfiguration>

typealias EndpointDescriptions = Array<EndpointDescription>

typealias EndpointGroups = Array<EndpointGroup>

typealias EndpointWeight = Number

typealias GenericBoolean = Boolean

typealias GenericString = String

typealias HealthCheckIntervalSeconds = Number

typealias HealthCheckPort = Number

typealias IdempotencyToken = String

typealias IpAddress = String

typealias IpAddresses = Array<IpAddress>

typealias IpSets = Array<IpSet>

typealias Listeners = Array<Listener>

typealias MaxResults = Number

typealias PortNumber = Number

typealias PortRanges = Array<PortRange>

typealias ResourceArn = String

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias ThresholdCount = Number

typealias Timestamp = Date

typealias TrafficDialPercentage = Number

@JsModule("aws-sdk")
external open class GlobalAccelerator(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & GlobalAccelerator.Types.ClientConfiguration */
    open fun advertiseByoipCidr(params: AdvertiseByoipCidrRequest, callback: (err: AWSError, data: AdvertiseByoipCidrResponse) -> Unit = definedExternally): Request<AdvertiseByoipCidrResponse, AWSError>
    open fun advertiseByoipCidr(callback: (err: AWSError, data: AdvertiseByoipCidrResponse) -> Unit = definedExternally): Request<AdvertiseByoipCidrResponse, AWSError>
    open fun createAccelerator(params: CreateAcceleratorRequest, callback: (err: AWSError, data: CreateAcceleratorResponse) -> Unit = definedExternally): Request<CreateAcceleratorResponse, AWSError>
    open fun createAccelerator(callback: (err: AWSError, data: CreateAcceleratorResponse) -> Unit = definedExternally): Request<CreateAcceleratorResponse, AWSError>
    open fun createEndpointGroup(params: CreateEndpointGroupRequest, callback: (err: AWSError, data: CreateEndpointGroupResponse) -> Unit = definedExternally): Request<CreateEndpointGroupResponse, AWSError>
    open fun createEndpointGroup(callback: (err: AWSError, data: CreateEndpointGroupResponse) -> Unit = definedExternally): Request<CreateEndpointGroupResponse, AWSError>
    open fun createListener(params: CreateListenerRequest, callback: (err: AWSError, data: CreateListenerResponse) -> Unit = definedExternally): Request<CreateListenerResponse, AWSError>
    open fun createListener(callback: (err: AWSError, data: CreateListenerResponse) -> Unit = definedExternally): Request<CreateListenerResponse, AWSError>
    open fun deleteAccelerator(params: DeleteAcceleratorRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccelerator(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEndpointGroup(params: DeleteEndpointGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEndpointGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteListener(params: DeleteListenerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteListener(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deprovisionByoipCidr(params: DeprovisionByoipCidrRequest, callback: (err: AWSError, data: DeprovisionByoipCidrResponse) -> Unit = definedExternally): Request<DeprovisionByoipCidrResponse, AWSError>
    open fun deprovisionByoipCidr(callback: (err: AWSError, data: DeprovisionByoipCidrResponse) -> Unit = definedExternally): Request<DeprovisionByoipCidrResponse, AWSError>
    open fun describeAccelerator(params: DescribeAcceleratorRequest, callback: (err: AWSError, data: DescribeAcceleratorResponse) -> Unit = definedExternally): Request<DescribeAcceleratorResponse, AWSError>
    open fun describeAccelerator(callback: (err: AWSError, data: DescribeAcceleratorResponse) -> Unit = definedExternally): Request<DescribeAcceleratorResponse, AWSError>
    open fun describeAcceleratorAttributes(params: DescribeAcceleratorAttributesRequest, callback: (err: AWSError, data: DescribeAcceleratorAttributesResponse) -> Unit = definedExternally): Request<DescribeAcceleratorAttributesResponse, AWSError>
    open fun describeAcceleratorAttributes(callback: (err: AWSError, data: DescribeAcceleratorAttributesResponse) -> Unit = definedExternally): Request<DescribeAcceleratorAttributesResponse, AWSError>
    open fun describeEndpointGroup(params: DescribeEndpointGroupRequest, callback: (err: AWSError, data: DescribeEndpointGroupResponse) -> Unit = definedExternally): Request<DescribeEndpointGroupResponse, AWSError>
    open fun describeEndpointGroup(callback: (err: AWSError, data: DescribeEndpointGroupResponse) -> Unit = definedExternally): Request<DescribeEndpointGroupResponse, AWSError>
    open fun describeListener(params: DescribeListenerRequest, callback: (err: AWSError, data: DescribeListenerResponse) -> Unit = definedExternally): Request<DescribeListenerResponse, AWSError>
    open fun describeListener(callback: (err: AWSError, data: DescribeListenerResponse) -> Unit = definedExternally): Request<DescribeListenerResponse, AWSError>
    open fun listAccelerators(params: ListAcceleratorsRequest, callback: (err: AWSError, data: ListAcceleratorsResponse) -> Unit = definedExternally): Request<ListAcceleratorsResponse, AWSError>
    open fun listAccelerators(callback: (err: AWSError, data: ListAcceleratorsResponse) -> Unit = definedExternally): Request<ListAcceleratorsResponse, AWSError>
    open fun listByoipCidrs(params: ListByoipCidrsRequest, callback: (err: AWSError, data: ListByoipCidrsResponse) -> Unit = definedExternally): Request<ListByoipCidrsResponse, AWSError>
    open fun listByoipCidrs(callback: (err: AWSError, data: ListByoipCidrsResponse) -> Unit = definedExternally): Request<ListByoipCidrsResponse, AWSError>
    open fun listEndpointGroups(params: ListEndpointGroupsRequest, callback: (err: AWSError, data: ListEndpointGroupsResponse) -> Unit = definedExternally): Request<ListEndpointGroupsResponse, AWSError>
    open fun listEndpointGroups(callback: (err: AWSError, data: ListEndpointGroupsResponse) -> Unit = definedExternally): Request<ListEndpointGroupsResponse, AWSError>
    open fun listListeners(params: ListListenersRequest, callback: (err: AWSError, data: ListListenersResponse) -> Unit = definedExternally): Request<ListListenersResponse, AWSError>
    open fun listListeners(callback: (err: AWSError, data: ListListenersResponse) -> Unit = definedExternally): Request<ListListenersResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun provisionByoipCidr(params: ProvisionByoipCidrRequest, callback: (err: AWSError, data: ProvisionByoipCidrResponse) -> Unit = definedExternally): Request<ProvisionByoipCidrResponse, AWSError>
    open fun provisionByoipCidr(callback: (err: AWSError, data: ProvisionByoipCidrResponse) -> Unit = definedExternally): Request<ProvisionByoipCidrResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateAccelerator(params: UpdateAcceleratorRequest, callback: (err: AWSError, data: UpdateAcceleratorResponse) -> Unit = definedExternally): Request<UpdateAcceleratorResponse, AWSError>
    open fun updateAccelerator(callback: (err: AWSError, data: UpdateAcceleratorResponse) -> Unit = definedExternally): Request<UpdateAcceleratorResponse, AWSError>
    open fun updateAcceleratorAttributes(params: UpdateAcceleratorAttributesRequest, callback: (err: AWSError, data: UpdateAcceleratorAttributesResponse) -> Unit = definedExternally): Request<UpdateAcceleratorAttributesResponse, AWSError>
    open fun updateAcceleratorAttributes(callback: (err: AWSError, data: UpdateAcceleratorAttributesResponse) -> Unit = definedExternally): Request<UpdateAcceleratorAttributesResponse, AWSError>
    open fun updateEndpointGroup(params: UpdateEndpointGroupRequest, callback: (err: AWSError, data: UpdateEndpointGroupResponse) -> Unit = definedExternally): Request<UpdateEndpointGroupResponse, AWSError>
    open fun updateEndpointGroup(callback: (err: AWSError, data: UpdateEndpointGroupResponse) -> Unit = definedExternally): Request<UpdateEndpointGroupResponse, AWSError>
    open fun updateListener(params: UpdateListenerRequest, callback: (err: AWSError, data: UpdateListenerResponse) -> Unit = definedExternally): Request<UpdateListenerResponse, AWSError>
    open fun updateListener(callback: (err: AWSError, data: UpdateListenerResponse) -> Unit = definedExternally): Request<UpdateListenerResponse, AWSError>
    open fun withdrawByoipCidr(params: WithdrawByoipCidrRequest, callback: (err: AWSError, data: WithdrawByoipCidrResponse) -> Unit = definedExternally): Request<WithdrawByoipCidrResponse, AWSError>
    open fun withdrawByoipCidr(callback: (err: AWSError, data: WithdrawByoipCidrResponse) -> Unit = definedExternally): Request<WithdrawByoipCidrResponse, AWSError>
    interface Accelerator {
        var AcceleratorArn: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddressType: String /* "IPV4" | String */
        var Enabled: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IpSets: IpSets?
            get() = definedExternally
            set(value) = definedExternally
        var DnsName: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "DEPLOYED" | "IN_PROGRESS" | String */
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AcceleratorAttributes {
        var FlowLogsEnabled: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var FlowLogsS3Bucket: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var FlowLogsS3Prefix: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdvertiseByoipCidrRequest {
        var Cidr: GenericString
    }
    interface AdvertiseByoipCidrResponse {
        var ByoipCidr: ByoipCidr?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ByoipCidr {
        var Cidr: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING_PROVISIONING" | "READY" | "PENDING_ADVERTISING" | "ADVERTISING" | "PENDING_WITHDRAWING" | "PENDING_DEPROVISIONING" | "DEPROVISIONED" | "FAILED_PROVISION" | "FAILED_ADVERTISING" | "FAILED_WITHDRAW" | "FAILED_DEPROVISION" | String */
    }
    interface CidrAuthorizationContext {
        var Message: GenericString
        var Signature: GenericString
    }
    interface CreateAcceleratorRequest {
        var Name: GenericString
        var IpAddressType: String /* "IPV4" | String */
        var IpAddresses: IpAddresses?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdempotencyToken
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAcceleratorResponse {
        var Accelerator: Accelerator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEndpointGroupRequest {
        var ListenerArn: GenericString
        var EndpointGroupRegion: GenericString
        var EndpointConfigurations: EndpointConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficDialPercentage: TrafficDialPercentage?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckPort: HealthCheckPort?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckProtocol: String /* "TCP" | "HTTP" | "HTTPS" | String */
        var HealthCheckPath: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckIntervalSeconds: HealthCheckIntervalSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var ThresholdCount: ThresholdCount?
            get() = definedExternally
            set(value) = definedExternally
        var IdempotencyToken: IdempotencyToken
    }
    interface CreateEndpointGroupResponse {
        var EndpointGroup: EndpointGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateListenerRequest {
        var AcceleratorArn: GenericString
        var PortRanges: PortRanges
        var Protocol: String /* "TCP" | "UDP" | String */
        var ClientAffinity: String /* "NONE" | "SOURCE_IP" | String */
        var IdempotencyToken: IdempotencyToken
    }
    interface CreateListenerResponse {
        var Listener: Listener?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAcceleratorRequest {
        var AcceleratorArn: GenericString
    }
    interface DeleteEndpointGroupRequest {
        var EndpointGroupArn: GenericString
    }
    interface DeleteListenerRequest {
        var ListenerArn: GenericString
    }
    interface DeprovisionByoipCidrRequest {
        var Cidr: GenericString
    }
    interface DeprovisionByoipCidrResponse {
        var ByoipCidr: ByoipCidr?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAcceleratorAttributesRequest {
        var AcceleratorArn: GenericString
    }
    interface DescribeAcceleratorAttributesResponse {
        var AcceleratorAttributes: AcceleratorAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAcceleratorRequest {
        var AcceleratorArn: GenericString
    }
    interface DescribeAcceleratorResponse {
        var Accelerator: Accelerator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEndpointGroupRequest {
        var EndpointGroupArn: GenericString
    }
    interface DescribeEndpointGroupResponse {
        var EndpointGroup: EndpointGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeListenerRequest {
        var ListenerArn: GenericString
    }
    interface DescribeListenerResponse {
        var Listener: Listener?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointConfiguration {
        var EndpointId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Weight: EndpointWeight?
            get() = definedExternally
            set(value) = definedExternally
        var ClientIPPreservationEnabled: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointDescription {
        var EndpointId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Weight: EndpointWeight?
            get() = definedExternally
            set(value) = definedExternally
        var HealthState: String /* "INITIAL" | "HEALTHY" | "UNHEALTHY" | String */
        var HealthReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ClientIPPreservationEnabled: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointGroup {
        var EndpointGroupArn: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointGroupRegion: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointDescriptions: EndpointDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficDialPercentage: TrafficDialPercentage?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckPort: HealthCheckPort?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckProtocol: String /* "TCP" | "HTTP" | "HTTPS" | String */
        var HealthCheckPath: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckIntervalSeconds: HealthCheckIntervalSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var ThresholdCount: ThresholdCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IpSet {
        var IpFamily: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddresses: IpAddresses?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAcceleratorsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAcceleratorsResponse {
        var Accelerators: Accelerators?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListByoipCidrsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListByoipCidrsResponse {
        var ByoipCidrs: ByoipCidrs?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEndpointGroupsRequest {
        var ListenerArn: GenericString
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEndpointGroupsResponse {
        var EndpointGroups: EndpointGroups?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListListenersRequest {
        var AcceleratorArn: GenericString
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListListenersResponse {
        var Listeners: Listeners?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: ResourceArn
    }
    interface ListTagsForResourceResponse {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Listener {
        var ListenerArn: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var PortRanges: PortRanges?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "TCP" | "UDP" | String */
        var ClientAffinity: String /* "NONE" | "SOURCE_IP" | String */
    }
    interface PortRange {
        var FromPort: PortNumber?
            get() = definedExternally
            set(value) = definedExternally
        var ToPort: PortNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisionByoipCidrRequest {
        var Cidr: GenericString
        var CidrAuthorizationContext: CidrAuthorizationContext
    }
    interface ProvisionByoipCidrResponse {
        var ByoipCidr: ByoipCidr?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceArn: ResourceArn
        var Tags: Tags
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var ResourceArn: ResourceArn
        var TagKeys: TagKeys
    }
    interface UntagResourceResponse
    interface UpdateAcceleratorAttributesRequest {
        var AcceleratorArn: GenericString
        var FlowLogsEnabled: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var FlowLogsS3Bucket: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var FlowLogsS3Prefix: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAcceleratorAttributesResponse {
        var AcceleratorAttributes: AcceleratorAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAcceleratorRequest {
        var AcceleratorArn: GenericString
        var Name: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddressType: String /* "IPV4" | String */
        var Enabled: GenericBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAcceleratorResponse {
        var Accelerator: Accelerator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEndpointGroupRequest {
        var EndpointGroupArn: GenericString
        var EndpointConfigurations: EndpointConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var TrafficDialPercentage: TrafficDialPercentage?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckPort: HealthCheckPort?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckProtocol: String /* "TCP" | "HTTP" | "HTTPS" | String */
        var HealthCheckPath: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var HealthCheckIntervalSeconds: HealthCheckIntervalSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var ThresholdCount: ThresholdCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEndpointGroupResponse {
        var EndpointGroup: EndpointGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateListenerRequest {
        var ListenerArn: GenericString
        var PortRanges: PortRanges?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "TCP" | "UDP" | String */
        var ClientAffinity: String /* "NONE" | "SOURCE_IP" | String */
    }
    interface UpdateListenerResponse {
        var Listener: Listener?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WithdrawByoipCidrRequest {
        var Cidr: GenericString
    }
    interface WithdrawByoipCidrResponse {
        var ByoipCidr: ByoipCidr?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-08-08" | "latest" | String */
    }
}