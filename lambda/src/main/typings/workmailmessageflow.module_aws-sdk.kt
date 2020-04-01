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
import WorkMailMessageFlow.GetRawMessageContentRequest
import WorkMailMessageFlow.GetRawMessageContentResponse

typealias messageIdType = String

@JsModule("aws-sdk")
external open class WorkMailMessageFlow(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & WorkMailMessageFlow.Types.ClientConfiguration */
    open fun getRawMessageContent(params: GetRawMessageContentRequest, callback: (err: AWSError, data: GetRawMessageContentResponse) -> Unit = definedExternally): Request<GetRawMessageContentResponse, AWSError>
    open fun getRawMessageContent(callback: (err: AWSError, data: GetRawMessageContentResponse) -> Unit = definedExternally): Request<GetRawMessageContentResponse, AWSError>
    interface GetRawMessageContentRequest {
        var messageId: messageIdType
    }
    interface GetRawMessageContentResponse {
        var messageContent: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-05-01" | "latest" | String */
    }
}