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
import MediaConnect.AddOutputRequest
import MediaConnect.Entitlement
import MediaConnect.GrantEntitlementRequest
import MediaConnect.ListedEntitlement
import MediaConnect.ListedFlow
import MediaConnect.Output
import MediaConnect.SetSourceRequest
import MediaConnect.Source
import MediaConnect.AddFlowOutputsRequest
import MediaConnect.AddFlowOutputsResponse
import MediaConnect.AddFlowSourcesRequest
import MediaConnect.AddFlowSourcesResponse
import MediaConnect.CreateFlowRequest
import MediaConnect.CreateFlowResponse
import MediaConnect.DeleteFlowRequest
import MediaConnect.DeleteFlowResponse
import MediaConnect.DescribeFlowRequest
import MediaConnect.DescribeFlowResponse
import MediaConnect.GrantFlowEntitlementsRequest
import MediaConnect.GrantFlowEntitlementsResponse
import MediaConnect.ListEntitlementsRequest
import MediaConnect.ListEntitlementsResponse
import MediaConnect.ListFlowsRequest
import MediaConnect.ListFlowsResponse
import MediaConnect.ListTagsForResourceRequest
import MediaConnect.ListTagsForResourceResponse
import MediaConnect.RemoveFlowOutputRequest
import MediaConnect.RemoveFlowOutputResponse
import MediaConnect.RemoveFlowSourceRequest
import MediaConnect.RemoveFlowSourceResponse
import MediaConnect.RevokeFlowEntitlementRequest
import MediaConnect.RevokeFlowEntitlementResponse
import MediaConnect.StartFlowRequest
import MediaConnect.StartFlowResponse
import MediaConnect.StopFlowRequest
import MediaConnect.StopFlowResponse
import MediaConnect.TagResourceRequest
import MediaConnect.UntagResourceRequest
import MediaConnect.UpdateFlowRequest
import MediaConnect.UpdateFlowResponse
import MediaConnect.UpdateFlowEntitlementRequest
import MediaConnect.UpdateFlowEntitlementResponse
import MediaConnect.UpdateFlowOutputRequest
import MediaConnect.UpdateFlowOutputResponse
import MediaConnect.UpdateFlowSourceRequest
import MediaConnect.UpdateFlowSourceResponse
import MediaConnect.Encryption
import MediaConnect.FailoverConfig
import MediaConnect.Flow
import MediaConnect.Messages
import MediaConnect.__mapOf__string
import MediaConnect.Transport
import MediaConnect.UpdateEncryption
import MediaConnect.UpdateFailoverConfig

typealias MaxResults = Number

typealias __integer = Number

typealias __listOfAddOutputRequest = Array<AddOutputRequest>

typealias __listOfEntitlement = Array<Entitlement>

typealias __listOfGrantEntitlementRequest = Array<GrantEntitlementRequest>

typealias __listOfListedEntitlement = Array<ListedEntitlement>

typealias __listOfListedFlow = Array<ListedFlow>

typealias __listOfOutput = Array<Output>

typealias __listOfSetSourceRequest = Array<SetSourceRequest>

typealias __listOfSource = Array<Source>

typealias __listOf__string = Array<__string>

typealias __string = String

@JsModule("aws-sdk")
external open class MediaConnect(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MediaConnect.Types.ClientConfiguration */
    open fun addFlowOutputs(params: AddFlowOutputsRequest, callback: (err: AWSError, data: AddFlowOutputsResponse) -> Unit = definedExternally): Request<AddFlowOutputsResponse, AWSError>
    open fun addFlowOutputs(callback: (err: AWSError, data: AddFlowOutputsResponse) -> Unit = definedExternally): Request<AddFlowOutputsResponse, AWSError>
    open fun addFlowSources(params: AddFlowSourcesRequest, callback: (err: AWSError, data: AddFlowSourcesResponse) -> Unit = definedExternally): Request<AddFlowSourcesResponse, AWSError>
    open fun addFlowSources(callback: (err: AWSError, data: AddFlowSourcesResponse) -> Unit = definedExternally): Request<AddFlowSourcesResponse, AWSError>
    open fun createFlow(params: CreateFlowRequest, callback: (err: AWSError, data: CreateFlowResponse) -> Unit = definedExternally): Request<CreateFlowResponse, AWSError>
    open fun createFlow(callback: (err: AWSError, data: CreateFlowResponse) -> Unit = definedExternally): Request<CreateFlowResponse, AWSError>
    open fun deleteFlow(params: DeleteFlowRequest, callback: (err: AWSError, data: DeleteFlowResponse) -> Unit = definedExternally): Request<DeleteFlowResponse, AWSError>
    open fun deleteFlow(callback: (err: AWSError, data: DeleteFlowResponse) -> Unit = definedExternally): Request<DeleteFlowResponse, AWSError>
    open fun describeFlow(params: DescribeFlowRequest, callback: (err: AWSError, data: DescribeFlowResponse) -> Unit = definedExternally): Request<DescribeFlowResponse, AWSError>
    open fun describeFlow(callback: (err: AWSError, data: DescribeFlowResponse) -> Unit = definedExternally): Request<DescribeFlowResponse, AWSError>
    open fun grantFlowEntitlements(params: GrantFlowEntitlementsRequest, callback: (err: AWSError, data: GrantFlowEntitlementsResponse) -> Unit = definedExternally): Request<GrantFlowEntitlementsResponse, AWSError>
    open fun grantFlowEntitlements(callback: (err: AWSError, data: GrantFlowEntitlementsResponse) -> Unit = definedExternally): Request<GrantFlowEntitlementsResponse, AWSError>
    open fun listEntitlements(params: ListEntitlementsRequest, callback: (err: AWSError, data: ListEntitlementsResponse) -> Unit = definedExternally): Request<ListEntitlementsResponse, AWSError>
    open fun listEntitlements(callback: (err: AWSError, data: ListEntitlementsResponse) -> Unit = definedExternally): Request<ListEntitlementsResponse, AWSError>
    open fun listFlows(params: ListFlowsRequest, callback: (err: AWSError, data: ListFlowsResponse) -> Unit = definedExternally): Request<ListFlowsResponse, AWSError>
    open fun listFlows(callback: (err: AWSError, data: ListFlowsResponse) -> Unit = definedExternally): Request<ListFlowsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun removeFlowOutput(params: RemoveFlowOutputRequest, callback: (err: AWSError, data: RemoveFlowOutputResponse) -> Unit = definedExternally): Request<RemoveFlowOutputResponse, AWSError>
    open fun removeFlowOutput(callback: (err: AWSError, data: RemoveFlowOutputResponse) -> Unit = definedExternally): Request<RemoveFlowOutputResponse, AWSError>
    open fun removeFlowSource(params: RemoveFlowSourceRequest, callback: (err: AWSError, data: RemoveFlowSourceResponse) -> Unit = definedExternally): Request<RemoveFlowSourceResponse, AWSError>
    open fun removeFlowSource(callback: (err: AWSError, data: RemoveFlowSourceResponse) -> Unit = definedExternally): Request<RemoveFlowSourceResponse, AWSError>
    open fun revokeFlowEntitlement(params: RevokeFlowEntitlementRequest, callback: (err: AWSError, data: RevokeFlowEntitlementResponse) -> Unit = definedExternally): Request<RevokeFlowEntitlementResponse, AWSError>
    open fun revokeFlowEntitlement(callback: (err: AWSError, data: RevokeFlowEntitlementResponse) -> Unit = definedExternally): Request<RevokeFlowEntitlementResponse, AWSError>
    open fun startFlow(params: StartFlowRequest, callback: (err: AWSError, data: StartFlowResponse) -> Unit = definedExternally): Request<StartFlowResponse, AWSError>
    open fun startFlow(callback: (err: AWSError, data: StartFlowResponse) -> Unit = definedExternally): Request<StartFlowResponse, AWSError>
    open fun stopFlow(params: StopFlowRequest, callback: (err: AWSError, data: StopFlowResponse) -> Unit = definedExternally): Request<StopFlowResponse, AWSError>
    open fun stopFlow(callback: (err: AWSError, data: StopFlowResponse) -> Unit = definedExternally): Request<StopFlowResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateFlow(params: UpdateFlowRequest, callback: (err: AWSError, data: UpdateFlowResponse) -> Unit = definedExternally): Request<UpdateFlowResponse, AWSError>
    open fun updateFlow(callback: (err: AWSError, data: UpdateFlowResponse) -> Unit = definedExternally): Request<UpdateFlowResponse, AWSError>
    open fun updateFlowEntitlement(params: UpdateFlowEntitlementRequest, callback: (err: AWSError, data: UpdateFlowEntitlementResponse) -> Unit = definedExternally): Request<UpdateFlowEntitlementResponse, AWSError>
    open fun updateFlowEntitlement(callback: (err: AWSError, data: UpdateFlowEntitlementResponse) -> Unit = definedExternally): Request<UpdateFlowEntitlementResponse, AWSError>
    open fun updateFlowOutput(params: UpdateFlowOutputRequest, callback: (err: AWSError, data: UpdateFlowOutputResponse) -> Unit = definedExternally): Request<UpdateFlowOutputResponse, AWSError>
    open fun updateFlowOutput(callback: (err: AWSError, data: UpdateFlowOutputResponse) -> Unit = definedExternally): Request<UpdateFlowOutputResponse, AWSError>
    open fun updateFlowSource(params: UpdateFlowSourceRequest, callback: (err: AWSError, data: UpdateFlowSourceResponse) -> Unit = definedExternally): Request<UpdateFlowSourceResponse, AWSError>
    open fun updateFlowSource(callback: (err: AWSError, data: UpdateFlowSourceResponse) -> Unit = definedExternally): Request<UpdateFlowSourceResponse, AWSError>
    interface AddFlowOutputsRequest {
        var FlowArn: __string
        var Outputs: __listOfAddOutputRequest
    }
    interface AddFlowOutputsResponse {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Outputs: __listOfOutput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddFlowSourcesRequest {
        var FlowArn: __string
        var Sources: __listOfSetSourceRequest
    }
    interface AddFlowSourcesResponse {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: __listOfSource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddOutputRequest {
        var CidrAllowList: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Destination: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
        var MaxLatency: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Port: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "zixi-push" | "rtp-fec" | "rtp" | "zixi-pull" | "rist" | String */
        var RemoteId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SmoothingLatency: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var StreamId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFlowRequest {
        var AvailabilityZone: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Entitlements: __listOfGrantEntitlementRequest?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var Outputs: __listOfAddOutputRequest?
            get() = definedExternally
            set(value) = definedExternally
        var Source: SetSourceRequest?
            get() = definedExternally
            set(value) = definedExternally
        var SourceFailoverConfig: FailoverConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: __listOfSetSourceRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFlowResponse {
        var Flow: Flow?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFlowRequest {
        var FlowArn: __string
    }
    interface DeleteFlowResponse {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "STANDBY" | "ACTIVE" | "UPDATING" | "DELETING" | "STARTING" | "STOPPING" | "ERROR" | String */
    }
    interface DescribeFlowRequest {
        var FlowArn: __string
    }
    interface DescribeFlowResponse {
        var Flow: Flow?
            get() = definedExternally
            set(value) = definedExternally
        var Messages: Messages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Encryption {
        var Algorithm: String /* "aes128" | "aes192" | "aes256" | String */
        var ConstantInitializationVector: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var KeyType: String /* "speke" | "static-key" | String */
        var Region: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string
        var SecretArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Entitlement {
        var DataTransferSubscriberFeePercent: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
        var EntitlementArn: __string
        var Name: __string
        var Subscribers: __listOf__string
    }
    interface FailoverConfig {
        var RecoveryWindow: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | String */
    }
    interface Flow {
        var AvailabilityZone: __string
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EgressIp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Entitlements: __listOfEntitlement
        var FlowArn: __string
        var Name: __string
        var Outputs: __listOfOutput
        var Source: Source
        var SourceFailoverConfig: FailoverConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Sources: __listOfSource?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "STANDBY" | "ACTIVE" | "UPDATING" | "DELETING" | "STARTING" | "STOPPING" | "ERROR" | String */
    }
    interface GrantEntitlementRequest {
        var DataTransferSubscriberFeePercent: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Subscribers: __listOf__string
    }
    interface GrantFlowEntitlementsRequest {
        var Entitlements: __listOfGrantEntitlementRequest
        var FlowArn: __string
    }
    interface GrantFlowEntitlementsResponse {
        var Entitlements: __listOfEntitlement?
            get() = definedExternally
            set(value) = definedExternally
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntitlementsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntitlementsResponse {
        var Entitlements: __listOfListedEntitlement?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFlowsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFlowsResponse {
        var Flows: __listOfListedFlow?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: __string
    }
    interface ListTagsForResourceResponse {
        var Tags: __mapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListedEntitlement {
        var DataTransferSubscriberFeePercent: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var EntitlementArn: __string
        var EntitlementName: __string
    }
    interface ListedFlow {
        var AvailabilityZone: __string
        var Description: __string
        var FlowArn: __string
        var Name: __string
        var SourceType: String /* "OWNED" | "ENTITLED" | String */
        var Status: String /* "STANDBY" | "ACTIVE" | "UPDATING" | "DELETING" | "STARTING" | "STOPPING" | "ERROR" | String */
    }
    interface Messages {
        var Errors: __listOf__string
    }
    interface Output {
        var DataTransferSubscriberFeePercent: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Destination: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
        var EntitlementArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MediaLiveInputArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var OutputArn: __string
        var Port: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Transport: Transport?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveFlowOutputRequest {
        var FlowArn: __string
        var OutputArn: __string
    }
    interface RemoveFlowOutputResponse {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OutputArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveFlowSourceRequest {
        var FlowArn: __string
        var SourceArn: __string
    }
    interface RemoveFlowSourceResponse {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokeFlowEntitlementRequest {
        var EntitlementArn: __string
        var FlowArn: __string
    }
    interface RevokeFlowEntitlementResponse {
        var EntitlementArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetSourceRequest {
        var Decryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EntitlementArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IngestPort: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MaxBitrate: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MaxLatency: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "zixi-push" | "rtp-fec" | "rtp" | "zixi-pull" | "rist" | String */
        var StreamId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var WhitelistCidr: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Source {
        var DataTransferSubscriberFeePercent: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Decryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EntitlementArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IngestIp: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IngestPort: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Name: __string
        var SourceArn: __string
        var Transport: Transport?
            get() = definedExternally
            set(value) = definedExternally
        var WhitelistCidr: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartFlowRequest {
        var FlowArn: __string
    }
    interface StartFlowResponse {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "STANDBY" | "ACTIVE" | "UPDATING" | "DELETING" | "STARTING" | "STOPPING" | "ERROR" | String */
    }
    interface StopFlowRequest {
        var FlowArn: __string
    }
    interface StopFlowResponse {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "STANDBY" | "ACTIVE" | "UPDATING" | "DELETING" | "STARTING" | "STOPPING" | "ERROR" | String */
    }
    interface TagResourceRequest {
        var ResourceArn: __string
        var Tags: __mapOf__string
    }
    interface Transport {
        var CidrAllowList: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxBitrate: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MaxLatency: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "zixi-push" | "rtp-fec" | "rtp" | "zixi-pull" | "rist" | String */
        var RemoteId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SmoothingLatency: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var StreamId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: __string
        var TagKeys: __listOf__string
    }
    interface UpdateEncryption {
        var Algorithm: String /* "aes128" | "aes192" | "aes256" | String */
        var ConstantInitializationVector: __string?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var KeyType: String /* "speke" | "static-key" | String */
        var Region: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SecretArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFailoverConfig {
        var RecoveryWindow: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | String */
    }
    interface UpdateFlowEntitlementRequest {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: UpdateEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var EntitlementArn: __string
        var FlowArn: __string
        var Subscribers: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFlowEntitlementResponse {
        var Entitlement: Entitlement?
            get() = definedExternally
            set(value) = definedExternally
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFlowOutputRequest {
        var CidrAllowList: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Destination: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: UpdateEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var FlowArn: __string
        var MaxLatency: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var OutputArn: __string
        var Port: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "zixi-push" | "rtp-fec" | "rtp" | "zixi-pull" | "rist" | String */
        var RemoteId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SmoothingLatency: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var StreamId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFlowOutputResponse {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Output: Output?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFlowRequest {
        var FlowArn: __string
        var SourceFailoverConfig: UpdateFailoverConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFlowResponse {
        var Flow: Flow?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFlowSourceRequest {
        var Decryption: UpdateEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EntitlementArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var FlowArn: __string
        var IngestPort: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MaxBitrate: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MaxLatency: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "zixi-push" | "rtp-fec" | "rtp" | "zixi-pull" | "rist" | String */
        var SourceArn: __string
        var StreamId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var WhitelistCidr: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFlowSourceResponse {
        var FlowArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Source: Source?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface __mapOf__string {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-11-14" | "latest" | String */
    }
}