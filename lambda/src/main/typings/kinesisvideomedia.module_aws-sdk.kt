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
import KinesisVideoMedia.GetMediaInput
import KinesisVideoMedia.GetMediaOutput
import KinesisVideoMedia.StartSelector

typealias ContentType = String

typealias ContinuationToken = String

typealias FragmentNumberString = String

typealias ResourceARN = String

typealias StreamName = String

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class KinesisVideoMedia(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & KinesisVideoMedia.Types.ClientConfiguration */
    open fun getMedia(params: GetMediaInput, callback: (err: AWSError, data: GetMediaOutput) -> Unit = definedExternally): Request<GetMediaOutput, AWSError>
    open fun getMedia(callback: (err: AWSError, data: GetMediaOutput) -> Unit = definedExternally): Request<GetMediaOutput, AWSError>
    interface GetMediaInput {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var StartSelector: StartSelector
    }
    interface GetMediaOutput {
        var ContentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
        var Payload: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSelector {
        var StartSelectorType: String /* "FRAGMENT_NUMBER" | "SERVER_TIMESTAMP" | "PRODUCER_TIMESTAMP" | "NOW" | "EARLIEST" | "CONTINUATION_TOKEN" | String */
        var AfterFragmentNumber: FragmentNumberString?
            get() = definedExternally
            set(value) = definedExternally
        var StartTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ContinuationToken: ContinuationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-09-30" | "latest" | String */
    }
}