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
import IoTSecureTunneling.Tag
import IoTSecureTunneling.TunnelSummary
import IoTSecureTunneling.CloseTunnelRequest
import IoTSecureTunneling.CloseTunnelResponse
import IoTSecureTunneling.DescribeTunnelRequest
import IoTSecureTunneling.DescribeTunnelResponse
import IoTSecureTunneling.ListTagsForResourceRequest
import IoTSecureTunneling.ListTagsForResourceResponse
import IoTSecureTunneling.ListTunnelsRequest
import IoTSecureTunneling.ListTunnelsResponse
import IoTSecureTunneling.OpenTunnelRequest
import IoTSecureTunneling.OpenTunnelResponse
import IoTSecureTunneling.TagResourceRequest
import IoTSecureTunneling.TagResourceResponse
import IoTSecureTunneling.UntagResourceRequest
import IoTSecureTunneling.UntagResourceResponse
import IoTSecureTunneling.Tunnel
import IoTSecureTunneling.DestinationConfig
import IoTSecureTunneling.TimeoutConfig
import IoTSecureTunneling.ConnectionState

typealias AmazonResourceName = String

typealias ClientAccessToken = String

typealias DateType = Date

typealias DeleteFlag = Boolean

typealias Description = String

typealias MaxResults = Number

typealias NextToken = String

typealias Service = String

typealias ServiceList = Array<Service>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias ThingName = String

typealias TimeoutInMin = Number

typealias TunnelArn = String

typealias TunnelId = String

typealias TunnelSummaryList = Array<TunnelSummary>

@JsModule("aws-sdk")
external open class IoTSecureTunneling(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & IoTSecureTunneling.Types.ClientConfiguration */
    open fun closeTunnel(params: CloseTunnelRequest, callback: (err: AWSError, data: CloseTunnelResponse) -> Unit = definedExternally): Request<CloseTunnelResponse, AWSError>
    open fun closeTunnel(callback: (err: AWSError, data: CloseTunnelResponse) -> Unit = definedExternally): Request<CloseTunnelResponse, AWSError>
    open fun describeTunnel(params: DescribeTunnelRequest, callback: (err: AWSError, data: DescribeTunnelResponse) -> Unit = definedExternally): Request<DescribeTunnelResponse, AWSError>
    open fun describeTunnel(callback: (err: AWSError, data: DescribeTunnelResponse) -> Unit = definedExternally): Request<DescribeTunnelResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTunnels(params: ListTunnelsRequest, callback: (err: AWSError, data: ListTunnelsResponse) -> Unit = definedExternally): Request<ListTunnelsResponse, AWSError>
    open fun listTunnels(callback: (err: AWSError, data: ListTunnelsResponse) -> Unit = definedExternally): Request<ListTunnelsResponse, AWSError>
    open fun openTunnel(params: OpenTunnelRequest, callback: (err: AWSError, data: OpenTunnelResponse) -> Unit = definedExternally): Request<OpenTunnelResponse, AWSError>
    open fun openTunnel(callback: (err: AWSError, data: OpenTunnelResponse) -> Unit = definedExternally): Request<OpenTunnelResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    interface CloseTunnelRequest {
        var tunnelId: TunnelId
        var delete: DeleteFlag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloseTunnelResponse
    interface ConnectionState {
        var status: String /* "CONNECTED" | "DISCONNECTED" | String */
        var lastUpdatedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTunnelRequest {
        var tunnelId: TunnelId
    }
    interface DescribeTunnelResponse {
        var tunnel: Tunnel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DestinationConfig {
        var thingName: ThingName
        var services: ServiceList
    }
    interface ListTagsForResourceRequest {
        var resourceArn: AmazonResourceName
    }
    interface ListTagsForResourceResponse {
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTunnelsRequest {
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTunnelsResponse {
        var tunnelSummaries: TunnelSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OpenTunnelRequest {
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var destinationConfig: DestinationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutConfig: TimeoutConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OpenTunnelResponse {
        var tunnelId: TunnelId?
            get() = definedExternally
            set(value) = definedExternally
        var tunnelArn: TunnelArn?
            get() = definedExternally
            set(value) = definedExternally
        var sourceAccessToken: ClientAccessToken?
            get() = definedExternally
            set(value) = definedExternally
        var destinationAccessToken: ClientAccessToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey
        var value: TagValue
    }
    interface TagResourceRequest {
        var resourceArn: AmazonResourceName
        var tags: TagList
    }
    interface TagResourceResponse
    interface TimeoutConfig {
        var maxLifetimeTimeoutMinutes: TimeoutInMin?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tunnel {
        var tunnelId: TunnelId?
            get() = definedExternally
            set(value) = definedExternally
        var tunnelArn: TunnelArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "OPEN" | "CLOSED" | String */
        var sourceConnectionState: ConnectionState?
            get() = definedExternally
            set(value) = definedExternally
        var destinationConnectionState: ConnectionState?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var destinationConfig: DestinationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutConfig: TimeoutConfig?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TunnelSummary {
        var tunnelId: TunnelId?
            get() = definedExternally
            set(value) = definedExternally
        var tunnelArn: TunnelArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "OPEN" | "CLOSED" | String */
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var resourceArn: AmazonResourceName
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2018-10-05" | "latest" | String */
    }
}