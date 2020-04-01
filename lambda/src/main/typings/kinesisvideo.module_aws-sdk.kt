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
import KinesisVideo.ChannelInfo
import KinesisVideo.ResourceEndpointListItem
import KinesisVideo.StreamInfo
import KinesisVideo.Tag
import KinesisVideo.CreateSignalingChannelInput
import KinesisVideo.CreateSignalingChannelOutput
import KinesisVideo.CreateStreamInput
import KinesisVideo.CreateStreamOutput
import KinesisVideo.DeleteSignalingChannelInput
import KinesisVideo.DeleteSignalingChannelOutput
import KinesisVideo.DeleteStreamInput
import KinesisVideo.DeleteStreamOutput
import KinesisVideo.DescribeSignalingChannelInput
import KinesisVideo.DescribeSignalingChannelOutput
import KinesisVideo.DescribeStreamInput
import KinesisVideo.DescribeStreamOutput
import KinesisVideo.GetDataEndpointInput
import KinesisVideo.GetDataEndpointOutput
import KinesisVideo.GetSignalingChannelEndpointInput
import KinesisVideo.GetSignalingChannelEndpointOutput
import KinesisVideo.ListSignalingChannelsInput
import KinesisVideo.ListSignalingChannelsOutput
import KinesisVideo.ListStreamsInput
import KinesisVideo.ListStreamsOutput
import KinesisVideo.ListTagsForResourceInput
import KinesisVideo.ListTagsForResourceOutput
import KinesisVideo.ListTagsForStreamInput
import KinesisVideo.ListTagsForStreamOutput
import KinesisVideo.TagResourceInput
import KinesisVideo.TagResourceOutput
import KinesisVideo.TagStreamInput
import KinesisVideo.TagStreamOutput
import KinesisVideo.UntagResourceInput
import KinesisVideo.UntagResourceOutput
import KinesisVideo.UntagStreamInput
import KinesisVideo.UntagStreamOutput
import KinesisVideo.UpdateDataRetentionInput
import KinesisVideo.UpdateDataRetentionOutput
import KinesisVideo.UpdateSignalingChannelInput
import KinesisVideo.UpdateSignalingChannelOutput
import KinesisVideo.UpdateStreamInput
import KinesisVideo.UpdateStreamOutput
import KinesisVideo.SingleMasterConfiguration
import KinesisVideo.ResourceTags
import KinesisVideo.SingleMasterChannelEndpointConfiguration
import KinesisVideo.ChannelNameCondition
import KinesisVideo.StreamNameCondition

typealias ChannelInfoList = Array<ChannelInfo>

typealias ChannelName = String

typealias DataEndpoint = String

typealias DataRetentionChangeInHours = Number

typealias DataRetentionInHours = Number

typealias DeviceName = String

typealias KmsKeyId = String

typealias ListOfProtocols = Array<String /* "WSS" | "HTTPS" | String */>

typealias ListStreamsInputLimit = Number

typealias MediaType = String

typealias MessageTtlSeconds = Number

typealias NextToken = String

typealias ResourceARN = String

typealias ResourceEndpoint = String

typealias ResourceEndpointList = Array<ResourceEndpointListItem>

typealias StreamInfoList = Array<StreamInfo>

typealias StreamName = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagOnCreateList = Array<Tag>

typealias TagValue = String

typealias Timestamp = Date

typealias Version = String

@JsModule("aws-sdk")
external open class KinesisVideo(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & KinesisVideo.Types.ClientConfiguration */
    open fun createSignalingChannel(params: CreateSignalingChannelInput, callback: (err: AWSError, data: CreateSignalingChannelOutput) -> Unit = definedExternally): Request<CreateSignalingChannelOutput, AWSError>
    open fun createSignalingChannel(callback: (err: AWSError, data: CreateSignalingChannelOutput) -> Unit = definedExternally): Request<CreateSignalingChannelOutput, AWSError>
    open fun createStream(params: CreateStreamInput, callback: (err: AWSError, data: CreateStreamOutput) -> Unit = definedExternally): Request<CreateStreamOutput, AWSError>
    open fun createStream(callback: (err: AWSError, data: CreateStreamOutput) -> Unit = definedExternally): Request<CreateStreamOutput, AWSError>
    open fun deleteSignalingChannel(params: DeleteSignalingChannelInput, callback: (err: AWSError, data: DeleteSignalingChannelOutput) -> Unit = definedExternally): Request<DeleteSignalingChannelOutput, AWSError>
    open fun deleteSignalingChannel(callback: (err: AWSError, data: DeleteSignalingChannelOutput) -> Unit = definedExternally): Request<DeleteSignalingChannelOutput, AWSError>
    open fun deleteStream(params: DeleteStreamInput, callback: (err: AWSError, data: DeleteStreamOutput) -> Unit = definedExternally): Request<DeleteStreamOutput, AWSError>
    open fun deleteStream(callback: (err: AWSError, data: DeleteStreamOutput) -> Unit = definedExternally): Request<DeleteStreamOutput, AWSError>
    open fun describeSignalingChannel(params: DescribeSignalingChannelInput, callback: (err: AWSError, data: DescribeSignalingChannelOutput) -> Unit = definedExternally): Request<DescribeSignalingChannelOutput, AWSError>
    open fun describeSignalingChannel(callback: (err: AWSError, data: DescribeSignalingChannelOutput) -> Unit = definedExternally): Request<DescribeSignalingChannelOutput, AWSError>
    open fun describeStream(params: DescribeStreamInput, callback: (err: AWSError, data: DescribeStreamOutput) -> Unit = definedExternally): Request<DescribeStreamOutput, AWSError>
    open fun describeStream(callback: (err: AWSError, data: DescribeStreamOutput) -> Unit = definedExternally): Request<DescribeStreamOutput, AWSError>
    open fun getDataEndpoint(params: GetDataEndpointInput, callback: (err: AWSError, data: GetDataEndpointOutput) -> Unit = definedExternally): Request<GetDataEndpointOutput, AWSError>
    open fun getDataEndpoint(callback: (err: AWSError, data: GetDataEndpointOutput) -> Unit = definedExternally): Request<GetDataEndpointOutput, AWSError>
    open fun getSignalingChannelEndpoint(params: GetSignalingChannelEndpointInput, callback: (err: AWSError, data: GetSignalingChannelEndpointOutput) -> Unit = definedExternally): Request<GetSignalingChannelEndpointOutput, AWSError>
    open fun getSignalingChannelEndpoint(callback: (err: AWSError, data: GetSignalingChannelEndpointOutput) -> Unit = definedExternally): Request<GetSignalingChannelEndpointOutput, AWSError>
    open fun listSignalingChannels(params: ListSignalingChannelsInput, callback: (err: AWSError, data: ListSignalingChannelsOutput) -> Unit = definedExternally): Request<ListSignalingChannelsOutput, AWSError>
    open fun listSignalingChannels(callback: (err: AWSError, data: ListSignalingChannelsOutput) -> Unit = definedExternally): Request<ListSignalingChannelsOutput, AWSError>
    open fun listStreams(params: ListStreamsInput, callback: (err: AWSError, data: ListStreamsOutput) -> Unit = definedExternally): Request<ListStreamsOutput, AWSError>
    open fun listStreams(callback: (err: AWSError, data: ListStreamsOutput) -> Unit = definedExternally): Request<ListStreamsOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForStream(params: ListTagsForStreamInput, callback: (err: AWSError, data: ListTagsForStreamOutput) -> Unit = definedExternally): Request<ListTagsForStreamOutput, AWSError>
    open fun listTagsForStream(callback: (err: AWSError, data: ListTagsForStreamOutput) -> Unit = definedExternally): Request<ListTagsForStreamOutput, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun tagStream(params: TagStreamInput, callback: (err: AWSError, data: TagStreamOutput) -> Unit = definedExternally): Request<TagStreamOutput, AWSError>
    open fun tagStream(callback: (err: AWSError, data: TagStreamOutput) -> Unit = definedExternally): Request<TagStreamOutput, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun untagStream(params: UntagStreamInput, callback: (err: AWSError, data: UntagStreamOutput) -> Unit = definedExternally): Request<UntagStreamOutput, AWSError>
    open fun untagStream(callback: (err: AWSError, data: UntagStreamOutput) -> Unit = definedExternally): Request<UntagStreamOutput, AWSError>
    open fun updateDataRetention(params: UpdateDataRetentionInput, callback: (err: AWSError, data: UpdateDataRetentionOutput) -> Unit = definedExternally): Request<UpdateDataRetentionOutput, AWSError>
    open fun updateDataRetention(callback: (err: AWSError, data: UpdateDataRetentionOutput) -> Unit = definedExternally): Request<UpdateDataRetentionOutput, AWSError>
    open fun updateSignalingChannel(params: UpdateSignalingChannelInput, callback: (err: AWSError, data: UpdateSignalingChannelOutput) -> Unit = definedExternally): Request<UpdateSignalingChannelOutput, AWSError>
    open fun updateSignalingChannel(callback: (err: AWSError, data: UpdateSignalingChannelOutput) -> Unit = definedExternally): Request<UpdateSignalingChannelOutput, AWSError>
    open fun updateStream(params: UpdateStreamInput, callback: (err: AWSError, data: UpdateStreamOutput) -> Unit = definedExternally): Request<UpdateStreamOutput, AWSError>
    open fun updateStream(callback: (err: AWSError, data: UpdateStreamOutput) -> Unit = definedExternally): Request<UpdateStreamOutput, AWSError>
    interface ChannelInfo {
        var ChannelName: ChannelName?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelType: String /* "SINGLE_MASTER" | String */
        var ChannelStatus: String /* "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | String */
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SingleMasterConfiguration: SingleMasterConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Version: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelNameCondition {
        var ComparisonOperator: String /* "BEGINS_WITH" | String */
        var ComparisonValue: ChannelName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSignalingChannelInput {
        var ChannelName: ChannelName
        var ChannelType: String /* "SINGLE_MASTER" | String */
        var SingleMasterConfiguration: SingleMasterConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagOnCreateList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSignalingChannelOutput {
        var ChannelARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStreamInput {
        var DeviceName: DeviceName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamName: StreamName
        var MediaType: MediaType?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var DataRetentionInHours: DataRetentionInHours?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: ResourceTags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStreamOutput {
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSignalingChannelInput {
        var ChannelARN: ResourceARN
        var CurrentVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSignalingChannelOutput
    interface DeleteStreamInput {
        var StreamARN: ResourceARN
        var CurrentVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteStreamOutput
    interface DescribeSignalingChannelInput {
        var ChannelName: ChannelName?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSignalingChannelOutput {
        var ChannelInfo: ChannelInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStreamInput {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStreamOutput {
        var StreamInfo: StreamInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataEndpointInput {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var APIName: String /* "PUT_MEDIA" | "GET_MEDIA" | "LIST_FRAGMENTS" | "GET_MEDIA_FOR_FRAGMENT_LIST" | "GET_HLS_STREAMING_SESSION_URL" | "GET_DASH_STREAMING_SESSION_URL" | String */
    }
    interface GetDataEndpointOutput {
        var DataEndpoint: DataEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSignalingChannelEndpointInput {
        var ChannelARN: ResourceARN
        var SingleMasterChannelEndpointConfiguration: SingleMasterChannelEndpointConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSignalingChannelEndpointOutput {
        var ResourceEndpointList: ResourceEndpointList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSignalingChannelsInput {
        var MaxResults: ListStreamsInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ChannelNameCondition: ChannelNameCondition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSignalingChannelsOutput {
        var ChannelInfoList: ChannelInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamsInput {
        var MaxResults: ListStreamsInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var StreamNameCondition: StreamNameCondition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamsOutput {
        var StreamInfoList: StreamInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceARN: ResourceARN
    }
    interface ListTagsForResourceOutput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: ResourceTags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForStreamInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForStreamOutput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: ResourceTags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceEndpointListItem {
        var Protocol: String /* "WSS" | "HTTPS" | String */
        var ResourceEndpoint: ResourceEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTags {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface SingleMasterChannelEndpointConfiguration {
        var Protocols: ListOfProtocols?
            get() = definedExternally
            set(value) = definedExternally
        var Role: String /* "MASTER" | "VIEWER" | String */
    }
    interface SingleMasterConfiguration {
        var MessageTtlSeconds: MessageTtlSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamInfo {
        var DeviceName: DeviceName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var MediaType: MediaType?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var Version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | String */
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DataRetentionInHours: DataRetentionInHours?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamNameCondition {
        var ComparisonOperator: String /* "BEGINS_WITH" | String */
        var ComparisonValue: StreamName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceInput {
        var ResourceARN: ResourceARN
        var Tags: TagList
    }
    interface TagResourceOutput
    interface TagStreamInput {
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: ResourceTags
    }
    interface TagStreamOutput
    interface UntagResourceInput {
        var ResourceARN: ResourceARN
        var TagKeyList: TagKeyList
    }
    interface UntagResourceOutput
    interface UntagStreamInput {
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeyList: TagKeyList
    }
    interface UntagStreamOutput
    interface UpdateDataRetentionInput {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentVersion: Version
        var Operation: String /* "INCREASE_DATA_RETENTION" | "DECREASE_DATA_RETENTION" | String */
        var DataRetentionChangeInHours: DataRetentionChangeInHours
    }
    interface UpdateDataRetentionOutput
    interface UpdateSignalingChannelInput {
        var ChannelARN: ResourceARN
        var CurrentVersion: Version
        var SingleMasterConfiguration: SingleMasterConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSignalingChannelOutput
    interface UpdateStreamInput {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentVersion: Version
        var DeviceName: DeviceName?
            get() = definedExternally
            set(value) = definedExternally
        var MediaType: MediaType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStreamOutput
    interface ClientApiVersions {
        var apiVersion: String /* "2017-09-30" | "latest" | String */
    }
}