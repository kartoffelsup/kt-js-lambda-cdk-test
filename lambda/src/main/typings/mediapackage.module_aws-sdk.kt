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
import MediaPackage.Channel
import MediaPackage.HarvestJob
import MediaPackage.HlsManifest
import MediaPackage.HlsManifestCreateOrUpdateParameters
import MediaPackage.IngestEndpoint
import MediaPackage.OriginEndpoint
import MediaPackage.CreateChannelRequest
import MediaPackage.CreateChannelResponse
import MediaPackage.CreateHarvestJobRequest
import MediaPackage.CreateHarvestJobResponse
import MediaPackage.CreateOriginEndpointRequest
import MediaPackage.CreateOriginEndpointResponse
import MediaPackage.DeleteChannelRequest
import MediaPackage.DeleteChannelResponse
import MediaPackage.DeleteOriginEndpointRequest
import MediaPackage.DeleteOriginEndpointResponse
import MediaPackage.DescribeChannelRequest
import MediaPackage.DescribeChannelResponse
import MediaPackage.DescribeHarvestJobRequest
import MediaPackage.DescribeHarvestJobResponse
import MediaPackage.DescribeOriginEndpointRequest
import MediaPackage.DescribeOriginEndpointResponse
import MediaPackage.ListChannelsRequest
import MediaPackage.ListChannelsResponse
import MediaPackage.ListHarvestJobsRequest
import MediaPackage.ListHarvestJobsResponse
import MediaPackage.ListOriginEndpointsRequest
import MediaPackage.ListOriginEndpointsResponse
import MediaPackage.ListTagsForResourceRequest
import MediaPackage.ListTagsForResourceResponse
import MediaPackage.RotateChannelCredentialsRequest
import MediaPackage.RotateChannelCredentialsResponse
import MediaPackage.RotateIngestEndpointCredentialsRequest
import MediaPackage.RotateIngestEndpointCredentialsResponse
import MediaPackage.TagResourceRequest
import MediaPackage.UntagResourceRequest
import MediaPackage.UpdateChannelRequest
import MediaPackage.UpdateChannelResponse
import MediaPackage.UpdateOriginEndpointRequest
import MediaPackage.UpdateOriginEndpointResponse
import MediaPackage.HlsIngest
import MediaPackage.Tags
import MediaPackage.SpekeKeyProvider
import MediaPackage.CmafEncryption
import MediaPackage.StreamSelection
import MediaPackage.S3Destination
import MediaPackage.Authorization
import MediaPackage.CmafPackageCreateOrUpdateParameters
import MediaPackage.DashPackage
import MediaPackage.HlsPackage
import MediaPackage.MssPackage
import MediaPackage.CmafPackage
import MediaPackage.DashEncryption
import MediaPackage.HlsEncryption
import MediaPackage.__mapOf__string
import MediaPackage.MssEncryption

typealias AdTriggers = Array<String /* "SPLICE_INSERT" | "BREAK" | "PROVIDER_ADVERTISEMENT" | "DISTRIBUTOR_ADVERTISEMENT" | "PROVIDER_PLACEMENT_OPPORTUNITY" | "DISTRIBUTOR_PLACEMENT_OPPORTUNITY" | "PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY" | "DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY" | String */>

typealias MaxResults = Number

typealias __boolean = Boolean

typealias __integer = Number

typealias __listOfChannel = Array<Channel>

typealias __listOfHarvestJob = Array<HarvestJob>

typealias __listOfHlsManifest = Array<HlsManifest>

typealias __listOfHlsManifestCreateOrUpdateParameters = Array<HlsManifestCreateOrUpdateParameters>

typealias __listOfIngestEndpoint = Array<IngestEndpoint>

typealias __listOfOriginEndpoint = Array<OriginEndpoint>

typealias __listOf__PeriodTriggersElement = Array<String /* "ADS" | String */>

typealias __listOf__string = Array<__string>

typealias __string = String

@JsModule("aws-sdk")
external open class MediaPackage(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MediaPackage.Types.ClientConfiguration */
    open fun createChannel(params: CreateChannelRequest, callback: (err: AWSError, data: CreateChannelResponse) -> Unit = definedExternally): Request<CreateChannelResponse, AWSError>
    open fun createChannel(callback: (err: AWSError, data: CreateChannelResponse) -> Unit = definedExternally): Request<CreateChannelResponse, AWSError>
    open fun createHarvestJob(params: CreateHarvestJobRequest, callback: (err: AWSError, data: CreateHarvestJobResponse) -> Unit = definedExternally): Request<CreateHarvestJobResponse, AWSError>
    open fun createHarvestJob(callback: (err: AWSError, data: CreateHarvestJobResponse) -> Unit = definedExternally): Request<CreateHarvestJobResponse, AWSError>
    open fun createOriginEndpoint(params: CreateOriginEndpointRequest, callback: (err: AWSError, data: CreateOriginEndpointResponse) -> Unit = definedExternally): Request<CreateOriginEndpointResponse, AWSError>
    open fun createOriginEndpoint(callback: (err: AWSError, data: CreateOriginEndpointResponse) -> Unit = definedExternally): Request<CreateOriginEndpointResponse, AWSError>
    open fun deleteChannel(params: DeleteChannelRequest, callback: (err: AWSError, data: DeleteChannelResponse) -> Unit = definedExternally): Request<DeleteChannelResponse, AWSError>
    open fun deleteChannel(callback: (err: AWSError, data: DeleteChannelResponse) -> Unit = definedExternally): Request<DeleteChannelResponse, AWSError>
    open fun deleteOriginEndpoint(params: DeleteOriginEndpointRequest, callback: (err: AWSError, data: DeleteOriginEndpointResponse) -> Unit = definedExternally): Request<DeleteOriginEndpointResponse, AWSError>
    open fun deleteOriginEndpoint(callback: (err: AWSError, data: DeleteOriginEndpointResponse) -> Unit = definedExternally): Request<DeleteOriginEndpointResponse, AWSError>
    open fun describeChannel(params: DescribeChannelRequest, callback: (err: AWSError, data: DescribeChannelResponse) -> Unit = definedExternally): Request<DescribeChannelResponse, AWSError>
    open fun describeChannel(callback: (err: AWSError, data: DescribeChannelResponse) -> Unit = definedExternally): Request<DescribeChannelResponse, AWSError>
    open fun describeHarvestJob(params: DescribeHarvestJobRequest, callback: (err: AWSError, data: DescribeHarvestJobResponse) -> Unit = definedExternally): Request<DescribeHarvestJobResponse, AWSError>
    open fun describeHarvestJob(callback: (err: AWSError, data: DescribeHarvestJobResponse) -> Unit = definedExternally): Request<DescribeHarvestJobResponse, AWSError>
    open fun describeOriginEndpoint(params: DescribeOriginEndpointRequest, callback: (err: AWSError, data: DescribeOriginEndpointResponse) -> Unit = definedExternally): Request<DescribeOriginEndpointResponse, AWSError>
    open fun describeOriginEndpoint(callback: (err: AWSError, data: DescribeOriginEndpointResponse) -> Unit = definedExternally): Request<DescribeOriginEndpointResponse, AWSError>
    open fun listChannels(params: ListChannelsRequest, callback: (err: AWSError, data: ListChannelsResponse) -> Unit = definedExternally): Request<ListChannelsResponse, AWSError>
    open fun listChannels(callback: (err: AWSError, data: ListChannelsResponse) -> Unit = definedExternally): Request<ListChannelsResponse, AWSError>
    open fun listHarvestJobs(params: ListHarvestJobsRequest, callback: (err: AWSError, data: ListHarvestJobsResponse) -> Unit = definedExternally): Request<ListHarvestJobsResponse, AWSError>
    open fun listHarvestJobs(callback: (err: AWSError, data: ListHarvestJobsResponse) -> Unit = definedExternally): Request<ListHarvestJobsResponse, AWSError>
    open fun listOriginEndpoints(params: ListOriginEndpointsRequest, callback: (err: AWSError, data: ListOriginEndpointsResponse) -> Unit = definedExternally): Request<ListOriginEndpointsResponse, AWSError>
    open fun listOriginEndpoints(callback: (err: AWSError, data: ListOriginEndpointsResponse) -> Unit = definedExternally): Request<ListOriginEndpointsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun rotateChannelCredentials(params: RotateChannelCredentialsRequest, callback: (err: AWSError, data: RotateChannelCredentialsResponse) -> Unit = definedExternally): Request<RotateChannelCredentialsResponse, AWSError>
    open fun rotateChannelCredentials(callback: (err: AWSError, data: RotateChannelCredentialsResponse) -> Unit = definedExternally): Request<RotateChannelCredentialsResponse, AWSError>
    open fun rotateIngestEndpointCredentials(params: RotateIngestEndpointCredentialsRequest, callback: (err: AWSError, data: RotateIngestEndpointCredentialsResponse) -> Unit = definedExternally): Request<RotateIngestEndpointCredentialsResponse, AWSError>
    open fun rotateIngestEndpointCredentials(callback: (err: AWSError, data: RotateIngestEndpointCredentialsResponse) -> Unit = definedExternally): Request<RotateIngestEndpointCredentialsResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateChannel(params: UpdateChannelRequest, callback: (err: AWSError, data: UpdateChannelResponse) -> Unit = definedExternally): Request<UpdateChannelResponse, AWSError>
    open fun updateChannel(callback: (err: AWSError, data: UpdateChannelResponse) -> Unit = definedExternally): Request<UpdateChannelResponse, AWSError>
    open fun updateOriginEndpoint(params: UpdateOriginEndpointRequest, callback: (err: AWSError, data: UpdateOriginEndpointResponse) -> Unit = definedExternally): Request<UpdateOriginEndpointResponse, AWSError>
    open fun updateOriginEndpoint(callback: (err: AWSError, data: UpdateOriginEndpointResponse) -> Unit = definedExternally): Request<UpdateOriginEndpointResponse, AWSError>
    interface Authorization {
        var CdnIdentifierSecret: __string
        var SecretsRoleArn: __string
    }
    interface Channel {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsIngest: HlsIngest?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CmafEncryption {
        var KeyRotationIntervalSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var SpekeKeyProvider: SpekeKeyProvider
    }
    interface CmafPackage {
        var Encryption: CmafEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var HlsManifests: __listOfHlsManifest?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentDurationSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StreamSelection: StreamSelection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CmafPackageCreateOrUpdateParameters {
        var Encryption: CmafEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var HlsManifests: __listOfHlsManifestCreateOrUpdateParameters?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentDurationSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentPrefix: __string?
            get() = definedExternally
            set(value) = definedExternally
        var StreamSelection: StreamSelection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateChannelRequest {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateChannelResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsIngest: HlsIngest?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHarvestJobRequest {
        var EndTime: __string
        var Id: __string
        var OriginEndpointId: __string
        var S3Destination: S3Destination
        var StartTime: __string
    }
    interface CreateHarvestJobResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OriginEndpointId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var S3Destination: S3Destination?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
    }
    interface CreateOriginEndpointRequest {
        var Authorization: Authorization?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelId: __string
        var CmafPackage: CmafPackageCreateOrUpdateParameters?
            get() = definedExternally
            set(value) = definedExternally
        var DashPackage: DashPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsPackage: HlsPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MssPackage: MssPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Origination: String /* "ALLOW" | "DENY" | String */
        var StartoverWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var TimeDelaySeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Whitelist: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOriginEndpointResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Authorization: Authorization?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CmafPackage: CmafPackage?
            get() = definedExternally
            set(value) = definedExternally
        var DashPackage: DashPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsPackage: HlsPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MssPackage: MssPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Origination: String /* "ALLOW" | "DENY" | String */
        var StartoverWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var TimeDelaySeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Whitelist: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DashEncryption {
        var KeyRotationIntervalSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var SpekeKeyProvider: SpekeKeyProvider
    }
    interface DashPackage {
        var AdTriggers: AdTriggers?
            get() = definedExternally
            set(value) = definedExternally
        var AdsOnDeliveryRestrictions: String /* "NONE" | "RESTRICTED" | "UNRESTRICTED" | "BOTH" | String */
        var Encryption: DashEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestLayout: String /* "FULL" | "COMPACT" | String */
        var ManifestWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MinBufferTimeSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MinUpdatePeriodSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var PeriodTriggers: __listOf__PeriodTriggersElement?
            get() = definedExternally
            set(value) = definedExternally
        var Profile: String /* "NONE" | "HBBTV_1_5" | String */
        var SegmentDurationSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentTemplateFormat: String /* "NUMBER_WITH_TIMELINE" | "TIME_WITH_TIMELINE" | "NUMBER_WITH_DURATION" | String */
        var StreamSelection: StreamSelection?
            get() = definedExternally
            set(value) = definedExternally
        var SuggestedPresentationDelaySeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteChannelRequest {
        var Id: __string
    }
    interface DeleteChannelResponse
    interface DeleteOriginEndpointRequest {
        var Id: __string
    }
    interface DeleteOriginEndpointResponse
    interface DescribeChannelRequest {
        var Id: __string
    }
    interface DescribeChannelResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsIngest: HlsIngest?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHarvestJobRequest {
        var Id: __string
    }
    interface DescribeHarvestJobResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OriginEndpointId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var S3Destination: S3Destination?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
    }
    interface DescribeOriginEndpointRequest {
        var Id: __string
    }
    interface DescribeOriginEndpointResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Authorization: Authorization?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CmafPackage: CmafPackage?
            get() = definedExternally
            set(value) = definedExternally
        var DashPackage: DashPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsPackage: HlsPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MssPackage: MssPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Origination: String /* "ALLOW" | "DENY" | String */
        var StartoverWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var TimeDelaySeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Whitelist: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HarvestJob {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OriginEndpointId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var S3Destination: S3Destination?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
    }
    interface HlsEncryption {
        var ConstantInitializationVector: __string?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionMethod: String /* "AES_128" | "SAMPLE_AES" | String */
        var KeyRotationIntervalSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var RepeatExtXKey: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SpekeKeyProvider: SpekeKeyProvider
    }
    interface HlsIngest {
        var IngestEndpoints: __listOfIngestEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsManifest {
        var AdMarkers: String /* "NONE" | "SCTE35_ENHANCED" | "PASSTHROUGH" | String */
        var Id: __string
        var IncludeIframeOnlyStream: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PlaylistType: String /* "NONE" | "EVENT" | "VOD" | String */
        var PlaylistWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramDateTimeIntervalSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsManifestCreateOrUpdateParameters {
        var AdMarkers: String /* "NONE" | "SCTE35_ENHANCED" | "PASSTHROUGH" | String */
        var AdTriggers: AdTriggers?
            get() = definedExternally
            set(value) = definedExternally
        var AdsOnDeliveryRestrictions: String /* "NONE" | "RESTRICTED" | "UNRESTRICTED" | "BOTH" | String */
        var Id: __string
        var IncludeIframeOnlyStream: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var PlaylistType: String /* "NONE" | "EVENT" | "VOD" | String */
        var PlaylistWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramDateTimeIntervalSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsPackage {
        var AdMarkers: String /* "NONE" | "SCTE35_ENHANCED" | "PASSTHROUGH" | String */
        var AdTriggers: AdTriggers?
            get() = definedExternally
            set(value) = definedExternally
        var AdsOnDeliveryRestrictions: String /* "NONE" | "RESTRICTED" | "UNRESTRICTED" | "BOTH" | String */
        var Encryption: HlsEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeIframeOnlyStream: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PlaylistType: String /* "NONE" | "EVENT" | "VOD" | String */
        var PlaylistWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var ProgramDateTimeIntervalSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentDurationSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var StreamSelection: StreamSelection?
            get() = definedExternally
            set(value) = definedExternally
        var UseAudioRenditionGroup: __boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IngestEndpoint {
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Password: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Username: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChannelsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChannelsResponse {
        var Channels: __listOfChannel?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHarvestJobsRequest {
        var IncludeChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeStatus: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHarvestJobsResponse {
        var HarvestJobs: __listOfHarvestJob?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOriginEndpointsRequest {
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOriginEndpointsResponse {
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var OriginEndpoints: __listOfOriginEndpoint?
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
    interface MssEncryption {
        var SpekeKeyProvider: SpekeKeyProvider
    }
    interface MssPackage {
        var Encryption: MssEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentDurationSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var StreamSelection: StreamSelection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OriginEndpoint {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Authorization: Authorization?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CmafPackage: CmafPackage?
            get() = definedExternally
            set(value) = definedExternally
        var DashPackage: DashPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsPackage: HlsPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MssPackage: MssPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Origination: String /* "ALLOW" | "DENY" | String */
        var StartoverWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var TimeDelaySeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Whitelist: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RotateChannelCredentialsRequest {
        var Id: __string
    }
    interface RotateChannelCredentialsResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsIngest: HlsIngest?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RotateIngestEndpointCredentialsRequest {
        var Id: __string
        var IngestEndpointId: __string
    }
    interface RotateIngestEndpointCredentialsResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsIngest: HlsIngest?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Destination {
        var BucketName: __string
        var ManifestKey: __string
        var RoleArn: __string
    }
    interface SpekeKeyProvider {
        var CertificateArn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: __string
        var RoleArn: __string
        var SystemIds: __listOf__string
        var Url: __string
    }
    interface StreamSelection {
        var MaxVideoBitsPerSecond: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var MinVideoBitsPerSecond: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var StreamOrder: String /* "ORIGINAL" | "VIDEO_BITRATE_ASCENDING" | "VIDEO_BITRATE_DESCENDING" | String */
    }
    interface TagResourceRequest {
        var ResourceArn: __string
        var Tags: __mapOf__string
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface UntagResourceRequest {
        var ResourceArn: __string
        var TagKeys: __listOf__string
    }
    interface UpdateChannelRequest {
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
    }
    interface UpdateChannelResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsIngest: HlsIngest?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateOriginEndpointRequest {
        var Authorization: Authorization?
            get() = definedExternally
            set(value) = definedExternally
        var CmafPackage: CmafPackageCreateOrUpdateParameters?
            get() = definedExternally
            set(value) = definedExternally
        var DashPackage: DashPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsPackage: HlsPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MssPackage: MssPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Origination: String /* "ALLOW" | "DENY" | String */
        var StartoverWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var TimeDelaySeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Whitelist: __listOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateOriginEndpointResponse {
        var Arn: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Authorization: Authorization?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var CmafPackage: CmafPackage?
            get() = definedExternally
            set(value) = definedExternally
        var DashPackage: DashPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Description: __string?
            get() = definedExternally
            set(value) = definedExternally
        var HlsPackage: HlsPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Id: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestName: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MssPackage: MssPackage?
            get() = definedExternally
            set(value) = definedExternally
        var Origination: String /* "ALLOW" | "DENY" | String */
        var StartoverWindowSeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var TimeDelaySeconds: __integer?
            get() = definedExternally
            set(value) = definedExternally
        var Url: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Whitelist: __listOf__string?
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
        var apiVersion: String /* "2017-10-12" | "latest" | String */
    }
}