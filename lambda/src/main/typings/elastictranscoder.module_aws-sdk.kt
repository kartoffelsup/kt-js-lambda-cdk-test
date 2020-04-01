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
import ElasticTranscoder.Artwork
import ElasticTranscoder.CaptionFormat
import ElasticTranscoder.CaptionSource
import ElasticTranscoder.Clip
import ElasticTranscoder.CreateJobOutput
import ElasticTranscoder.CreateJobPlaylist
import ElasticTranscoder.JobInput
import ElasticTranscoder.JobOutput
import ElasticTranscoder.JobWatermark
import ElasticTranscoder.Job
import ElasticTranscoder.Permission
import ElasticTranscoder.Pipeline
import ElasticTranscoder.Playlist
import ElasticTranscoder.PresetWatermark
import ElasticTranscoder.Preset
import ElasticTranscoder.Warning
import ElasticTranscoder.CancelJobRequest
import ElasticTranscoder.CancelJobResponse
import ElasticTranscoder.CreateJobRequest
import ElasticTranscoder.CreateJobResponse
import ElasticTranscoder.CreatePipelineRequest
import ElasticTranscoder.CreatePipelineResponse
import ElasticTranscoder.CreatePresetRequest
import ElasticTranscoder.CreatePresetResponse
import ElasticTranscoder.DeletePipelineRequest
import ElasticTranscoder.DeletePipelineResponse
import ElasticTranscoder.DeletePresetRequest
import ElasticTranscoder.DeletePresetResponse
import ElasticTranscoder.ListJobsByPipelineRequest
import ElasticTranscoder.ListJobsByPipelineResponse
import ElasticTranscoder.ListJobsByStatusRequest
import ElasticTranscoder.ListJobsByStatusResponse
import ElasticTranscoder.ListPipelinesRequest
import ElasticTranscoder.ListPipelinesResponse
import ElasticTranscoder.ListPresetsRequest
import ElasticTranscoder.ListPresetsResponse
import ElasticTranscoder.ReadJobRequest
import ElasticTranscoder.ReadJobResponse
import ElasticTranscoder.ReadPipelineRequest
import ElasticTranscoder.ReadPipelineResponse
import ElasticTranscoder.ReadPresetRequest
import ElasticTranscoder.ReadPresetResponse
import ElasticTranscoder.TestRoleRequest
import ElasticTranscoder.TestRoleResponse
import ElasticTranscoder.UpdatePipelineRequest
import ElasticTranscoder.UpdatePipelineResponse
import ElasticTranscoder.UpdatePipelineNotificationsRequest
import ElasticTranscoder.UpdatePipelineNotificationsResponse
import ElasticTranscoder.UpdatePipelineStatusRequest
import ElasticTranscoder.UpdatePipelineStatusResponse
import ElasticTranscoder.Encryption
import ElasticTranscoder.AudioCodecOptions
import ElasticTranscoder.TimeSpan
import ElasticTranscoder.JobAlbumArt
import ElasticTranscoder.Captions
import ElasticTranscoder.HlsContentProtection
import ElasticTranscoder.PlayReadyDrm
import ElasticTranscoder.UserMetadata
import ElasticTranscoder.Notifications
import ElasticTranscoder.PipelineOutputConfig
import ElasticTranscoder.VideoParameters
import ElasticTranscoder.AudioParameters
import ElasticTranscoder.Thumbnails
import ElasticTranscoder.Timing
import ElasticTranscoder.InputCaptions
import ElasticTranscoder.DetectedProperties
import ElasticTranscoder.CodecOptions

typealias AccessControl = String

typealias AccessControls = Array<AccessControl>

typealias Artworks = Array<Artwork>

typealias Ascending = String

typealias AspectRatio = String

typealias AudioBitDepth = String

typealias AudioBitOrder = String

typealias AudioBitRate = String

typealias AudioChannels = String

typealias AudioCodec = String

typealias AudioCodecProfile = String

typealias AudioPackingMode = String

typealias AudioSampleRate = String

typealias AudioSigned = String

typealias Base64EncodedString = String

typealias BucketName = String

typealias CaptionFormatFormat = String

typealias CaptionFormatPattern = String

typealias CaptionFormats = Array<CaptionFormat>

typealias CaptionMergePolicy = String

typealias CaptionSources = Array<CaptionSource>

typealias CodecOption = String

typealias Composition = Array<Clip>

typealias CreateJobOutputs = Array<CreateJobOutput>

typealias CreateJobPlaylists = Array<CreateJobPlaylist>

typealias Description = String

typealias Digits = String

typealias DigitsOrAuto = String

typealias EncryptionMode = String

typealias ExceptionMessages = Array<String>

typealias Filename = String

typealias FixedGOP = String

typealias FloatString = String

typealias FrameRate = String

typealias Grantee = String

typealias GranteeType = String

typealias HlsContentProtectionMethod = String

typealias HorizontalAlign = String

typealias Id = String

typealias Interlaced = String

typealias JobContainer = String

typealias JobInputs = Array<JobInput>

typealias JobOutputs = Array<JobOutput>

typealias JobStatus = String

typealias JobWatermarks = Array<JobWatermark>

typealias Jobs = Array<Job>

typealias JpgOrPng = String

typealias Key = String

typealias KeyArn = String

typealias KeyIdGuid = String

typealias KeyStoragePolicy = String

typealias KeyframesMaxDist = String

typealias LongKey = String

typealias MaxFrameRate = String

typealias MergePolicy = String

typealias Name = String

typealias NonEmptyBase64EncodedString = String

typealias NullableInteger = Number

typealias NullableLong = Number

typealias OneTo512String = String

typealias Opacity = String

typealias OutputKeys = Array<Key>

typealias PaddingPolicy = String

typealias Permissions = Array<Permission>

typealias PipelineStatus = String

typealias Pipelines = Array<Pipeline>

typealias PixelsOrPercent = String

typealias PlayReadyDrmFormatString = String

typealias PlaylistFormat = String

typealias Playlists = Array<Playlist>

typealias PresetContainer = String

typealias PresetType = String

typealias PresetWatermarkId = String

typealias PresetWatermarks = Array<PresetWatermark>

typealias Presets = Array<Preset>

typealias Resolution = String

typealias Role = String

typealias Rotate = String

typealias SizingPolicy = String

typealias SnsTopic = String

typealias SnsTopics = Array<SnsTopic>

typealias StorageClass = String

typealias String = String

typealias Success = String

typealias Target = String

typealias ThumbnailPattern = String

typealias ThumbnailResolution = String

typealias Time = String

typealias TimeOffset = String

typealias VerticalAlign = String

typealias VideoBitRate = String

typealias VideoCodec = String

typealias Warnings = Array<Warning>

typealias WatermarkKey = String

typealias WatermarkSizingPolicy = String

typealias ZeroTo255String = String

typealias ZeroTo512String = String

@JsModule("aws-sdk")
external open class ElasticTranscoder(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ElasticTranscoder.Types.ClientConfiguration */
    open fun cancelJob(params: CancelJobRequest, callback: (err: AWSError, data: CancelJobResponse) -> Unit = definedExternally): Request<CancelJobResponse, AWSError>
    open fun cancelJob(callback: (err: AWSError, data: CancelJobResponse) -> Unit = definedExternally): Request<CancelJobResponse, AWSError>
    open fun createJob(params: CreateJobRequest, callback: (err: AWSError, data: CreateJobResponse) -> Unit = definedExternally): Request<CreateJobResponse, AWSError>
    open fun createJob(callback: (err: AWSError, data: CreateJobResponse) -> Unit = definedExternally): Request<CreateJobResponse, AWSError>
    open fun createPipeline(params: CreatePipelineRequest, callback: (err: AWSError, data: CreatePipelineResponse) -> Unit = definedExternally): Request<CreatePipelineResponse, AWSError>
    open fun createPipeline(callback: (err: AWSError, data: CreatePipelineResponse) -> Unit = definedExternally): Request<CreatePipelineResponse, AWSError>
    open fun createPreset(params: CreatePresetRequest, callback: (err: AWSError, data: CreatePresetResponse) -> Unit = definedExternally): Request<CreatePresetResponse, AWSError>
    open fun createPreset(callback: (err: AWSError, data: CreatePresetResponse) -> Unit = definedExternally): Request<CreatePresetResponse, AWSError>
    open fun deletePipeline(params: DeletePipelineRequest, callback: (err: AWSError, data: DeletePipelineResponse) -> Unit = definedExternally): Request<DeletePipelineResponse, AWSError>
    open fun deletePipeline(callback: (err: AWSError, data: DeletePipelineResponse) -> Unit = definedExternally): Request<DeletePipelineResponse, AWSError>
    open fun deletePreset(params: DeletePresetRequest, callback: (err: AWSError, data: DeletePresetResponse) -> Unit = definedExternally): Request<DeletePresetResponse, AWSError>
    open fun deletePreset(callback: (err: AWSError, data: DeletePresetResponse) -> Unit = definedExternally): Request<DeletePresetResponse, AWSError>
    open fun listJobsByPipeline(params: ListJobsByPipelineRequest, callback: (err: AWSError, data: ListJobsByPipelineResponse) -> Unit = definedExternally): Request<ListJobsByPipelineResponse, AWSError>
    open fun listJobsByPipeline(callback: (err: AWSError, data: ListJobsByPipelineResponse) -> Unit = definedExternally): Request<ListJobsByPipelineResponse, AWSError>
    open fun listJobsByStatus(params: ListJobsByStatusRequest, callback: (err: AWSError, data: ListJobsByStatusResponse) -> Unit = definedExternally): Request<ListJobsByStatusResponse, AWSError>
    open fun listJobsByStatus(callback: (err: AWSError, data: ListJobsByStatusResponse) -> Unit = definedExternally): Request<ListJobsByStatusResponse, AWSError>
    open fun listPipelines(params: ListPipelinesRequest, callback: (err: AWSError, data: ListPipelinesResponse) -> Unit = definedExternally): Request<ListPipelinesResponse, AWSError>
    open fun listPipelines(callback: (err: AWSError, data: ListPipelinesResponse) -> Unit = definedExternally): Request<ListPipelinesResponse, AWSError>
    open fun listPresets(params: ListPresetsRequest, callback: (err: AWSError, data: ListPresetsResponse) -> Unit = definedExternally): Request<ListPresetsResponse, AWSError>
    open fun listPresets(callback: (err: AWSError, data: ListPresetsResponse) -> Unit = definedExternally): Request<ListPresetsResponse, AWSError>
    open fun readJob(params: ReadJobRequest, callback: (err: AWSError, data: ReadJobResponse) -> Unit = definedExternally): Request<ReadJobResponse, AWSError>
    open fun readJob(callback: (err: AWSError, data: ReadJobResponse) -> Unit = definedExternally): Request<ReadJobResponse, AWSError>
    open fun readPipeline(params: ReadPipelineRequest, callback: (err: AWSError, data: ReadPipelineResponse) -> Unit = definedExternally): Request<ReadPipelineResponse, AWSError>
    open fun readPipeline(callback: (err: AWSError, data: ReadPipelineResponse) -> Unit = definedExternally): Request<ReadPipelineResponse, AWSError>
    open fun readPreset(params: ReadPresetRequest, callback: (err: AWSError, data: ReadPresetResponse) -> Unit = definedExternally): Request<ReadPresetResponse, AWSError>
    open fun readPreset(callback: (err: AWSError, data: ReadPresetResponse) -> Unit = definedExternally): Request<ReadPresetResponse, AWSError>
    open fun testRole(params: TestRoleRequest, callback: (err: AWSError, data: TestRoleResponse) -> Unit = definedExternally): Request<TestRoleResponse, AWSError>
    open fun testRole(callback: (err: AWSError, data: TestRoleResponse) -> Unit = definedExternally): Request<TestRoleResponse, AWSError>
    open fun updatePipeline(params: UpdatePipelineRequest, callback: (err: AWSError, data: UpdatePipelineResponse) -> Unit = definedExternally): Request<UpdatePipelineResponse, AWSError>
    open fun updatePipeline(callback: (err: AWSError, data: UpdatePipelineResponse) -> Unit = definedExternally): Request<UpdatePipelineResponse, AWSError>
    open fun updatePipelineNotifications(params: UpdatePipelineNotificationsRequest, callback: (err: AWSError, data: UpdatePipelineNotificationsResponse) -> Unit = definedExternally): Request<UpdatePipelineNotificationsResponse, AWSError>
    open fun updatePipelineNotifications(callback: (err: AWSError, data: UpdatePipelineNotificationsResponse) -> Unit = definedExternally): Request<UpdatePipelineNotificationsResponse, AWSError>
    open fun updatePipelineStatus(params: UpdatePipelineStatusRequest, callback: (err: AWSError, data: UpdatePipelineStatusResponse) -> Unit = definedExternally): Request<UpdatePipelineStatusResponse, AWSError>
    open fun updatePipelineStatus(callback: (err: AWSError, data: UpdatePipelineStatusResponse) -> Unit = definedExternally): Request<UpdatePipelineStatusResponse, AWSError>
    open fun waitFor(state: String /* "jobComplete" */, params: ReadJobRequest /* ElasticTranscoder.Types.ReadJobRequest & `T$0` */, callback: (err: AWSError, data: ReadJobResponse) -> Unit = definedExternally): Request<ReadJobResponse, AWSError>
    open fun waitFor(state: String /* "jobComplete" */, callback: (err: AWSError, data: ReadJobResponse) -> Unit = definedExternally): Request<ReadJobResponse, AWSError>
    interface Artwork {
        var InputKey: WatermarkKey?
            get() = definedExternally
            set(value) = definedExternally
        var MaxWidth: DigitsOrAuto?
            get() = definedExternally
            set(value) = definedExternally
        var MaxHeight: DigitsOrAuto?
            get() = definedExternally
            set(value) = definedExternally
        var SizingPolicy: SizingPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var PaddingPolicy: PaddingPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var AlbumArtFormat: JpgOrPng?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AudioCodecOptions {
        var Profile: AudioCodecProfile?
            get() = definedExternally
            set(value) = definedExternally
        var BitDepth: AudioBitDepth?
            get() = definedExternally
            set(value) = definedExternally
        var BitOrder: AudioBitOrder?
            get() = definedExternally
            set(value) = definedExternally
        var Signed: AudioSigned?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AudioParameters {
        var Codec: AudioCodec?
            get() = definedExternally
            set(value) = definedExternally
        var SampleRate: AudioSampleRate?
            get() = definedExternally
            set(value) = definedExternally
        var BitRate: AudioBitRate?
            get() = definedExternally
            set(value) = definedExternally
        var Channels: AudioChannels?
            get() = definedExternally
            set(value) = definedExternally
        var AudioPackingMode: AudioPackingMode?
            get() = definedExternally
            set(value) = definedExternally
        var CodecOptions: AudioCodecOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelJobRequest {
        var Id: Id
    }
    interface CancelJobResponse
    interface CaptionFormat {
        var Format: CaptionFormatFormat?
            get() = definedExternally
            set(value) = definedExternally
        var Pattern: CaptionFormatPattern?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaptionSource {
        var Key: LongKey?
            get() = definedExternally
            set(value) = definedExternally
        var Language: Key?
            get() = definedExternally
            set(value) = definedExternally
        var TimeOffset: TimeOffset?
            get() = definedExternally
            set(value) = definedExternally
        var Label: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Captions {
        var MergePolicy: CaptionMergePolicy?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionSources: CaptionSources?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionFormats: CaptionFormats?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Clip {
        var TimeSpan: TimeSpan?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodecOptions {
        @nativeGetter
        operator fun get(key: String): CodecOption?
        @nativeSetter
        operator fun set(key: String, value: CodecOption)
    }
    interface CreateJobOutput {
        var Key: Key?
            get() = definedExternally
            set(value) = definedExternally
        var ThumbnailPattern: ThumbnailPattern?
            get() = definedExternally
            set(value) = definedExternally
        var ThumbnailEncryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
        var Rotate: Rotate?
            get() = definedExternally
            set(value) = definedExternally
        var PresetId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentDuration: FloatString?
            get() = definedExternally
            set(value) = definedExternally
        var Watermarks: JobWatermarks?
            get() = definedExternally
            set(value) = definedExternally
        var AlbumArt: JobAlbumArt?
            get() = definedExternally
            set(value) = definedExternally
        var Composition: Composition?
            get() = definedExternally
            set(value) = definedExternally
        var Captions: Captions?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobPlaylist {
        var Name: Filename?
            get() = definedExternally
            set(value) = definedExternally
        var Format: PlaylistFormat?
            get() = definedExternally
            set(value) = definedExternally
        var OutputKeys: OutputKeys?
            get() = definedExternally
            set(value) = definedExternally
        var HlsContentProtection: HlsContentProtection?
            get() = definedExternally
            set(value) = definedExternally
        var PlayReadyDrm: PlayReadyDrm?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobRequest {
        var PipelineId: Id
        var Input: JobInput?
            get() = definedExternally
            set(value) = definedExternally
        var Inputs: JobInputs?
            get() = definedExternally
            set(value) = definedExternally
        var Output: CreateJobOutput?
            get() = definedExternally
            set(value) = definedExternally
        var Outputs: CreateJobOutputs?
            get() = definedExternally
            set(value) = definedExternally
        var OutputKeyPrefix: Key?
            get() = definedExternally
            set(value) = definedExternally
        var Playlists: CreateJobPlaylists?
            get() = definedExternally
            set(value) = definedExternally
        var UserMetadata: UserMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobResponse {
        var Job: Job?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePipelineRequest {
        var Name: Name
        var InputBucket: BucketName
        var OutputBucket: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role
        var AwsKmsKeyArn: KeyArn?
            get() = definedExternally
            set(value) = definedExternally
        var Notifications: Notifications?
            get() = definedExternally
            set(value) = definedExternally
        var ContentConfig: PipelineOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ThumbnailConfig: PipelineOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePipelineResponse {
        var Pipeline: Pipeline?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: Warnings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePresetRequest {
        var Name: Name
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Container: PresetContainer
        var Video: VideoParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Audio: AudioParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Thumbnails: Thumbnails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePresetResponse {
        var Preset: Preset?
            get() = definedExternally
            set(value) = definedExternally
        var Warning: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeletePipelineRequest {
        var Id: Id
    }
    interface DeletePipelineResponse
    interface DeletePresetRequest {
        var Id: Id
    }
    interface DeletePresetResponse
    interface DetectedProperties {
        var Width: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Height: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var FrameRate: FloatString?
            get() = definedExternally
            set(value) = definedExternally
        var FileSize: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var DurationMillis: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Encryption {
        var Mode: EncryptionMode?
            get() = definedExternally
            set(value) = definedExternally
        var Key: Base64EncodedString?
            get() = definedExternally
            set(value) = definedExternally
        var KeyMd5: Base64EncodedString?
            get() = definedExternally
            set(value) = definedExternally
        var InitializationVector: ZeroTo255String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HlsContentProtection {
        var Method: HlsContentProtectionMethod?
            get() = definedExternally
            set(value) = definedExternally
        var Key: Base64EncodedString?
            get() = definedExternally
            set(value) = definedExternally
        var KeyMd5: Base64EncodedString?
            get() = definedExternally
            set(value) = definedExternally
        var InitializationVector: ZeroTo255String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseAcquisitionUrl: ZeroTo512String?
            get() = definedExternally
            set(value) = definedExternally
        var KeyStoragePolicy: KeyStoragePolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputCaptions {
        var MergePolicy: CaptionMergePolicy?
            get() = definedExternally
            set(value) = definedExternally
        var CaptionSources: CaptionSources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Job {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var PipelineId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Input: JobInput?
            get() = definedExternally
            set(value) = definedExternally
        var Inputs: JobInputs?
            get() = definedExternally
            set(value) = definedExternally
        var Output: JobOutput?
            get() = definedExternally
            set(value) = definedExternally
        var Outputs: JobOutputs?
            get() = definedExternally
            set(value) = definedExternally
        var OutputKeyPrefix: Key?
            get() = definedExternally
            set(value) = definedExternally
        var Playlists: Playlists?
            get() = definedExternally
            set(value) = definedExternally
        var Status: JobStatus?
            get() = definedExternally
            set(value) = definedExternally
        var UserMetadata: UserMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var Timing: Timing?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobAlbumArt {
        var MergePolicy: MergePolicy?
            get() = definedExternally
            set(value) = definedExternally
        var Artwork: Artworks?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobInput {
        var Key: LongKey?
            get() = definedExternally
            set(value) = definedExternally
        var FrameRate: FrameRate?
            get() = definedExternally
            set(value) = definedExternally
        var Resolution: Resolution?
            get() = definedExternally
            set(value) = definedExternally
        var AspectRatio: AspectRatio?
            get() = definedExternally
            set(value) = definedExternally
        var Interlaced: Interlaced?
            get() = definedExternally
            set(value) = definedExternally
        var Container: JobContainer?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
        var TimeSpan: TimeSpan?
            get() = definedExternally
            set(value) = definedExternally
        var InputCaptions: InputCaptions?
            get() = definedExternally
            set(value) = definedExternally
        var DetectedProperties: DetectedProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobOutput {
        var Id: String?
            get() = definedExternally
            set(value) = definedExternally
        var Key: Key?
            get() = definedExternally
            set(value) = definedExternally
        var ThumbnailPattern: ThumbnailPattern?
            get() = definedExternally
            set(value) = definedExternally
        var ThumbnailEncryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
        var Rotate: Rotate?
            get() = definedExternally
            set(value) = definedExternally
        var PresetId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var SegmentDuration: FloatString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: JobStatus?
            get() = definedExternally
            set(value) = definedExternally
        var StatusDetail: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var Width: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Height: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var FrameRate: FloatString?
            get() = definedExternally
            set(value) = definedExternally
        var FileSize: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var DurationMillis: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var Watermarks: JobWatermarks?
            get() = definedExternally
            set(value) = definedExternally
        var AlbumArt: JobAlbumArt?
            get() = definedExternally
            set(value) = definedExternally
        var Composition: Composition?
            get() = definedExternally
            set(value) = definedExternally
        var Captions: Captions?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
        var AppliedColorSpaceConversion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobWatermark {
        var PresetWatermarkId: PresetWatermarkId?
            get() = definedExternally
            set(value) = definedExternally
        var InputKey: WatermarkKey?
            get() = definedExternally
            set(value) = definedExternally
        var Encryption: Encryption?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsByPipelineRequest {
        var PipelineId: Id
        var Ascending: Ascending?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsByPipelineResponse {
        var Jobs: Jobs?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsByStatusRequest {
        var Status: JobStatus
        var Ascending: Ascending?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsByStatusResponse {
        var Jobs: Jobs?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPipelinesRequest {
        var Ascending: Ascending?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPipelinesResponse {
        var Pipelines: Pipelines?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPresetsRequest {
        var Ascending: Ascending?
            get() = definedExternally
            set(value) = definedExternally
        var PageToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPresetsResponse {
        var Presets: Presets?
            get() = definedExternally
            set(value) = definedExternally
        var NextPageToken: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Notifications {
        var Progressing: SnsTopic?
            get() = definedExternally
            set(value) = definedExternally
        var Completed: SnsTopic?
            get() = definedExternally
            set(value) = definedExternally
        var Warning: SnsTopic?
            get() = definedExternally
            set(value) = definedExternally
        var Error: SnsTopic?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Permission {
        var GranteeType: GranteeType?
            get() = definedExternally
            set(value) = definedExternally
        var Grantee: Grantee?
            get() = definedExternally
            set(value) = definedExternally
        var Access: AccessControls?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Pipeline {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Status: PipelineStatus?
            get() = definedExternally
            set(value) = definedExternally
        var InputBucket: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var OutputBucket: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
        var AwsKmsKeyArn: KeyArn?
            get() = definedExternally
            set(value) = definedExternally
        var Notifications: Notifications?
            get() = definedExternally
            set(value) = definedExternally
        var ContentConfig: PipelineOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ThumbnailConfig: PipelineOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineOutputConfig {
        var Bucket: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var StorageClass: StorageClass?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: Permissions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlayReadyDrm {
        var Format: PlayReadyDrmFormatString?
            get() = definedExternally
            set(value) = definedExternally
        var Key: NonEmptyBase64EncodedString?
            get() = definedExternally
            set(value) = definedExternally
        var KeyMd5: NonEmptyBase64EncodedString?
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdGuid?
            get() = definedExternally
            set(value) = definedExternally
        var InitializationVector: ZeroTo255String?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseAcquisitionUrl: OneTo512String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Playlist {
        var Name: Filename?
            get() = definedExternally
            set(value) = definedExternally
        var Format: PlaylistFormat?
            get() = definedExternally
            set(value) = definedExternally
        var OutputKeys: OutputKeys?
            get() = definedExternally
            set(value) = definedExternally
        var HlsContentProtection: HlsContentProtection?
            get() = definedExternally
            set(value) = definedExternally
        var PlayReadyDrm: PlayReadyDrm?
            get() = definedExternally
            set(value) = definedExternally
        var Status: JobStatus?
            get() = definedExternally
            set(value) = definedExternally
        var StatusDetail: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Preset {
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Container: PresetContainer?
            get() = definedExternally
            set(value) = definedExternally
        var Audio: AudioParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Video: VideoParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Thumbnails: Thumbnails?
            get() = definedExternally
            set(value) = definedExternally
        var Type: PresetType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PresetWatermark {
        var Id: PresetWatermarkId?
            get() = definedExternally
            set(value) = definedExternally
        var MaxWidth: PixelsOrPercent?
            get() = definedExternally
            set(value) = definedExternally
        var MaxHeight: PixelsOrPercent?
            get() = definedExternally
            set(value) = definedExternally
        var SizingPolicy: WatermarkSizingPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var HorizontalAlign: HorizontalAlign?
            get() = definedExternally
            set(value) = definedExternally
        var HorizontalOffset: PixelsOrPercent?
            get() = definedExternally
            set(value) = definedExternally
        var VerticalAlign: VerticalAlign?
            get() = definedExternally
            set(value) = definedExternally
        var VerticalOffset: PixelsOrPercent?
            get() = definedExternally
            set(value) = definedExternally
        var Opacity: Opacity?
            get() = definedExternally
            set(value) = definedExternally
        var Target: Target?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReadJobRequest {
        var Id: Id
    }
    interface ReadJobResponse {
        var Job: Job?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReadPipelineRequest {
        var Id: Id
    }
    interface ReadPipelineResponse {
        var Pipeline: Pipeline?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: Warnings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReadPresetRequest {
        var Id: Id
    }
    interface ReadPresetResponse {
        var Preset: Preset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestRoleRequest {
        var Role: Role
        var InputBucket: BucketName
        var OutputBucket: BucketName
        var Topics: SnsTopics
    }
    interface TestRoleResponse {
        var Success: Success?
            get() = definedExternally
            set(value) = definedExternally
        var Messages: ExceptionMessages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Thumbnails {
        var Format: JpgOrPng?
            get() = definedExternally
            set(value) = definedExternally
        var Interval: Digits?
            get() = definedExternally
            set(value) = definedExternally
        var Resolution: ThumbnailResolution?
            get() = definedExternally
            set(value) = definedExternally
        var AspectRatio: AspectRatio?
            get() = definedExternally
            set(value) = definedExternally
        var MaxWidth: DigitsOrAuto?
            get() = definedExternally
            set(value) = definedExternally
        var MaxHeight: DigitsOrAuto?
            get() = definedExternally
            set(value) = definedExternally
        var SizingPolicy: SizingPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var PaddingPolicy: PaddingPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeSpan {
        var StartTime: Time?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: Time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Timing {
        var SubmitTimeMillis: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var StartTimeMillis: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var FinishTimeMillis: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePipelineNotificationsRequest {
        var Id: Id
        var Notifications: Notifications
    }
    interface UpdatePipelineNotificationsResponse {
        var Pipeline: Pipeline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePipelineRequest {
        var Id: Id
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var InputBucket: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
        var AwsKmsKeyArn: KeyArn?
            get() = definedExternally
            set(value) = definedExternally
        var Notifications: Notifications?
            get() = definedExternally
            set(value) = definedExternally
        var ContentConfig: PipelineOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ThumbnailConfig: PipelineOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePipelineResponse {
        var Pipeline: Pipeline?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: Warnings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePipelineStatusRequest {
        var Id: Id
        var Status: PipelineStatus
    }
    interface UpdatePipelineStatusResponse {
        var Pipeline: Pipeline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserMetadata {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface VideoParameters {
        var Codec: VideoCodec?
            get() = definedExternally
            set(value) = definedExternally
        var CodecOptions: CodecOptions?
            get() = definedExternally
            set(value) = definedExternally
        var KeyframesMaxDist: KeyframesMaxDist?
            get() = definedExternally
            set(value) = definedExternally
        var FixedGOP: FixedGOP?
            get() = definedExternally
            set(value) = definedExternally
        var BitRate: VideoBitRate?
            get() = definedExternally
            set(value) = definedExternally
        var FrameRate: FrameRate?
            get() = definedExternally
            set(value) = definedExternally
        var MaxFrameRate: MaxFrameRate?
            get() = definedExternally
            set(value) = definedExternally
        var Resolution: Resolution?
            get() = definedExternally
            set(value) = definedExternally
        var AspectRatio: AspectRatio?
            get() = definedExternally
            set(value) = definedExternally
        var MaxWidth: DigitsOrAuto?
            get() = definedExternally
            set(value) = definedExternally
        var MaxHeight: DigitsOrAuto?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayAspectRatio: AspectRatio?
            get() = definedExternally
            set(value) = definedExternally
        var SizingPolicy: SizingPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var PaddingPolicy: PaddingPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var Watermarks: PresetWatermarks?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Warning {
        var Code: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2012-09-25" | "latest" | String */
    }
}