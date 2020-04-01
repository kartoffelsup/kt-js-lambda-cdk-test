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
import KinesisVideoArchivedMedia.Fragment
import KinesisVideoArchivedMedia.GetDASHStreamingSessionURLInput
import KinesisVideoArchivedMedia.GetDASHStreamingSessionURLOutput
import KinesisVideoArchivedMedia.GetHLSStreamingSessionURLInput
import KinesisVideoArchivedMedia.GetHLSStreamingSessionURLOutput
import KinesisVideoArchivedMedia.GetMediaForFragmentListInput
import KinesisVideoArchivedMedia.GetMediaForFragmentListOutput
import KinesisVideoArchivedMedia.ListFragmentsInput
import KinesisVideoArchivedMedia.ListFragmentsOutput
import KinesisVideoArchivedMedia.DASHTimestampRange
import KinesisVideoArchivedMedia.TimestampRange
import KinesisVideoArchivedMedia.DASHFragmentSelector
import KinesisVideoArchivedMedia.HLSFragmentSelector
import KinesisVideoArchivedMedia.HLSTimestampRange
import KinesisVideoArchivedMedia.FragmentSelector

typealias ContentType = String

typealias DASHStreamingSessionURL = String

typealias Expires = Number

typealias FragmentList = Array<Fragment>

typealias FragmentNumberList = Array<FragmentNumberString>

typealias FragmentNumberString = String

typealias HLSStreamingSessionURL = String

typealias Long = Number

typealias PageLimit = Number

typealias ResourceARN = String

typealias StreamName = String

typealias String = String

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class KinesisVideoArchivedMedia(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & KinesisVideoArchivedMedia.Types.ClientConfiguration */
    open fun getDASHStreamingSessionURL(params: GetDASHStreamingSessionURLInput, callback: (err: AWSError, data: GetDASHStreamingSessionURLOutput) -> Unit = definedExternally): Request<GetDASHStreamingSessionURLOutput, AWSError>
    open fun getDASHStreamingSessionURL(callback: (err: AWSError, data: GetDASHStreamingSessionURLOutput) -> Unit = definedExternally): Request<GetDASHStreamingSessionURLOutput, AWSError>
    open fun getHLSStreamingSessionURL(params: GetHLSStreamingSessionURLInput, callback: (err: AWSError, data: GetHLSStreamingSessionURLOutput) -> Unit = definedExternally): Request<GetHLSStreamingSessionURLOutput, AWSError>
    open fun getHLSStreamingSessionURL(callback: (err: AWSError, data: GetHLSStreamingSessionURLOutput) -> Unit = definedExternally): Request<GetHLSStreamingSessionURLOutput, AWSError>
    open fun getMediaForFragmentList(params: GetMediaForFragmentListInput, callback: (err: AWSError, data: GetMediaForFragmentListOutput) -> Unit = definedExternally): Request<GetMediaForFragmentListOutput, AWSError>
    open fun getMediaForFragmentList(callback: (err: AWSError, data: GetMediaForFragmentListOutput) -> Unit = definedExternally): Request<GetMediaForFragmentListOutput, AWSError>
    open fun listFragments(params: ListFragmentsInput, callback: (err: AWSError, data: ListFragmentsOutput) -> Unit = definedExternally): Request<ListFragmentsOutput, AWSError>
    open fun listFragments(callback: (err: AWSError, data: ListFragmentsOutput) -> Unit = definedExternally): Request<ListFragmentsOutput, AWSError>
    interface DASHFragmentSelector {
        var FragmentSelectorType: String /* "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP" | String */
        var TimestampRange: DASHTimestampRange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DASHTimestampRange {
        var StartTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Fragment {
        var FragmentNumber: String?
            get() = definedExternally
            set(value) = definedExternally
        var FragmentSizeInBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ProducerTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ServerTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var FragmentLengthInMilliseconds: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FragmentSelector {
        var FragmentSelectorType: String /* "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP" | String */
        var TimestampRange: TimestampRange
    }
    interface GetDASHStreamingSessionURLInput {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var PlaybackMode: String /* "LIVE" | "LIVE_REPLAY" | "ON_DEMAND" | String */
        var DisplayFragmentTimestamp: String /* "ALWAYS" | "NEVER" | String */
        var DisplayFragmentNumber: String /* "ALWAYS" | "NEVER" | String */
        var DASHFragmentSelector: DASHFragmentSelector?
            get() = definedExternally
            set(value) = definedExternally
        var Expires: Expires?
            get() = definedExternally
            set(value) = definedExternally
        var MaxManifestFragmentResults: PageLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDASHStreamingSessionURLOutput {
        var DASHStreamingSessionURL: DASHStreamingSessionURL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetHLSStreamingSessionURLInput {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var PlaybackMode: String /* "LIVE" | "LIVE_REPLAY" | "ON_DEMAND" | String */
        var HLSFragmentSelector: HLSFragmentSelector?
            get() = definedExternally
            set(value) = definedExternally
        var ContainerFormat: String /* "FRAGMENTED_MP4" | "MPEG_TS" | String */
        var DiscontinuityMode: String /* "ALWAYS" | "NEVER" | "ON_DISCONTINUITY" | String */
        var DisplayFragmentTimestamp: String /* "ALWAYS" | "NEVER" | String */
        var Expires: Expires?
            get() = definedExternally
            set(value) = definedExternally
        var MaxMediaPlaylistFragmentResults: PageLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetHLSStreamingSessionURLOutput {
        var HLSStreamingSessionURL: HLSStreamingSessionURL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMediaForFragmentListInput {
        var StreamName: StreamName
        var Fragments: FragmentNumberList
    }
    interface GetMediaForFragmentListOutput {
        var ContentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
        var Payload: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HLSFragmentSelector {
        var FragmentSelectorType: String /* "PRODUCER_TIMESTAMP" | "SERVER_TIMESTAMP" | String */
        var TimestampRange: HLSTimestampRange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HLSTimestampRange {
        var StartTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFragmentsInput {
        var StreamName: StreamName
        var MaxResults: PageLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var FragmentSelector: FragmentSelector?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFragmentsOutput {
        var Fragments: FragmentList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimestampRange {
        var StartTimestamp: Timestamp
        var EndTimestamp: Timestamp
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-09-30" | "latest" | String */
    }
}