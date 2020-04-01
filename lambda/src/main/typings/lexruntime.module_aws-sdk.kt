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
import LexRuntime.IntentSummary
import LexRuntime.GenericAttachment
import LexRuntime.Button
import LexRuntime.DeleteSessionRequest
import LexRuntime.DeleteSessionResponse
import LexRuntime.GetSessionRequest
import LexRuntime.GetSessionResponse
import LexRuntime.PostContentRequest
import LexRuntime.PostContentResponse
import LexRuntime.PostTextRequest
import LexRuntime.PostTextResponse
import LexRuntime.PutSessionRequest
import LexRuntime.PutSessionResponse
import LexRuntime.StringMap
import LexRuntime.DialogAction
import LexRuntime.SentimentResponse
import LexRuntime.ResponseCard

typealias Accept = String

typealias AttributesString = String

typealias BotAlias = String

typealias BotName = String

typealias ButtonTextStringWithLength = String

typealias ButtonValueStringWithLength = String

typealias HttpContentType = String

typealias IntentName = String

typealias IntentSummaryCheckpointLabel = String

typealias IntentSummaryList = Array<IntentSummary>

typealias SentimentLabel = String

typealias SentimentScore = String

typealias String = String

typealias StringUrlWithLength = String

typealias StringWithLength = String

typealias Text = String

typealias UserId = String

typealias genericAttachmentList = Array<GenericAttachment>

typealias listOfButtons = Array<Button>

@JsModule("aws-sdk")
external open class LexRuntime(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & LexRuntime.Types.ClientConfiguration */
    open fun deleteSession(params: DeleteSessionRequest, callback: (err: AWSError, data: DeleteSessionResponse) -> Unit = definedExternally): Request<DeleteSessionResponse, AWSError>
    open fun deleteSession(callback: (err: AWSError, data: DeleteSessionResponse) -> Unit = definedExternally): Request<DeleteSessionResponse, AWSError>
    open fun getSession(params: GetSessionRequest, callback: (err: AWSError, data: GetSessionResponse) -> Unit = definedExternally): Request<GetSessionResponse, AWSError>
    open fun getSession(callback: (err: AWSError, data: GetSessionResponse) -> Unit = definedExternally): Request<GetSessionResponse, AWSError>
    open fun postContent(params: PostContentRequest, callback: (err: AWSError, data: PostContentResponse) -> Unit = definedExternally): Request<PostContentResponse, AWSError>
    open fun postContent(callback: (err: AWSError, data: PostContentResponse) -> Unit = definedExternally): Request<PostContentResponse, AWSError>
    open fun postText(params: PostTextRequest, callback: (err: AWSError, data: PostTextResponse) -> Unit = definedExternally): Request<PostTextResponse, AWSError>
    open fun postText(callback: (err: AWSError, data: PostTextResponse) -> Unit = definedExternally): Request<PostTextResponse, AWSError>
    open fun putSession(params: PutSessionRequest, callback: (err: AWSError, data: PutSessionResponse) -> Unit = definedExternally): Request<PutSessionResponse, AWSError>
    open fun putSession(callback: (err: AWSError, data: PutSessionResponse) -> Unit = definedExternally): Request<PutSessionResponse, AWSError>
    interface Button {
        var text: ButtonTextStringWithLength
        var value: ButtonValueStringWithLength
    }
    interface DeleteSessionRequest {
        var botName: BotName
        var botAlias: BotAlias
        var userId: UserId
    }
    interface DeleteSessionResponse {
        var botName: BotName?
            get() = definedExternally
            set(value) = definedExternally
        var botAlias: BotAlias?
            get() = definedExternally
            set(value) = definedExternally
        var userId: UserId?
            get() = definedExternally
            set(value) = definedExternally
        var sessionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DialogAction {
        var type: String /* "ElicitIntent" | "ConfirmIntent" | "ElicitSlot" | "Close" | "Delegate" | String */
        var intentName: IntentName?
            get() = definedExternally
            set(value) = definedExternally
        var slots: StringMap?
            get() = definedExternally
            set(value) = definedExternally
        var slotToElicit: String?
            get() = definedExternally
            set(value) = definedExternally
        var fulfillmentState: String /* "Fulfilled" | "Failed" | "ReadyForFulfillment" | String */
        var message: Text?
            get() = definedExternally
            set(value) = definedExternally
        var messageFormat: String /* "PlainText" | "CustomPayload" | "SSML" | "Composite" | String */
    }
    interface GenericAttachment {
        var title: StringWithLength?
            get() = definedExternally
            set(value) = definedExternally
        var subTitle: StringWithLength?
            get() = definedExternally
            set(value) = definedExternally
        var attachmentLinkUrl: StringUrlWithLength?
            get() = definedExternally
            set(value) = definedExternally
        var imageUrl: StringUrlWithLength?
            get() = definedExternally
            set(value) = definedExternally
        var buttons: listOfButtons?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSessionRequest {
        var botName: BotName
        var botAlias: BotAlias
        var userId: UserId
        var checkpointLabelFilter: IntentSummaryCheckpointLabel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSessionResponse {
        var recentIntentSummaryView: IntentSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var sessionAttributes: StringMap?
            get() = definedExternally
            set(value) = definedExternally
        var sessionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var dialogAction: DialogAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IntentSummary {
        var intentName: IntentName?
            get() = definedExternally
            set(value) = definedExternally
        var checkpointLabel: IntentSummaryCheckpointLabel?
            get() = definedExternally
            set(value) = definedExternally
        var slots: StringMap?
            get() = definedExternally
            set(value) = definedExternally
        var confirmationStatus: String /* "None" | "Confirmed" | "Denied" | String */
        var dialogActionType: String /* "ElicitIntent" | "ConfirmIntent" | "ElicitSlot" | "Close" | "Delegate" | String */
        var fulfillmentState: String /* "Fulfilled" | "Failed" | "ReadyForFulfillment" | String */
        var slotToElicit: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PostContentRequest {
        var botName: BotName
        var botAlias: BotAlias
        var userId: UserId
        var sessionAttributes: AttributesString?
            get() = definedExternally
            set(value) = definedExternally
        var requestAttributes: AttributesString?
            get() = definedExternally
            set(value) = definedExternally
        var contentType: HttpContentType
        var accept: Accept?
            get() = definedExternally
            set(value) = definedExternally
        var inputStream: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PostContentResponse {
        var contentType: HttpContentType?
            get() = definedExternally
            set(value) = definedExternally
        var intentName: IntentName?
            get() = definedExternally
            set(value) = definedExternally
        var slots: String?
            get() = definedExternally
            set(value) = definedExternally
        var sessionAttributes: String?
            get() = definedExternally
            set(value) = definedExternally
        var sentimentResponse: String?
            get() = definedExternally
            set(value) = definedExternally
        var message: Text?
            get() = definedExternally
            set(value) = definedExternally
        var messageFormat: String /* "PlainText" | "CustomPayload" | "SSML" | "Composite" | String */
        var dialogState: String /* "ElicitIntent" | "ConfirmIntent" | "ElicitSlot" | "Fulfilled" | "ReadyForFulfillment" | "Failed" | String */
        var slotToElicit: String?
            get() = definedExternally
            set(value) = definedExternally
        var inputTranscript: String?
            get() = definedExternally
            set(value) = definedExternally
        var audioStream: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
        var sessionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PostTextRequest {
        var botName: BotName
        var botAlias: BotAlias
        var userId: UserId
        var sessionAttributes: StringMap?
            get() = definedExternally
            set(value) = definedExternally
        var requestAttributes: StringMap?
            get() = definedExternally
            set(value) = definedExternally
        var inputText: Text
    }
    interface PostTextResponse {
        var intentName: IntentName?
            get() = definedExternally
            set(value) = definedExternally
        var slots: StringMap?
            get() = definedExternally
            set(value) = definedExternally
        var sessionAttributes: StringMap?
            get() = definedExternally
            set(value) = definedExternally
        var message: Text?
            get() = definedExternally
            set(value) = definedExternally
        var sentimentResponse: SentimentResponse?
            get() = definedExternally
            set(value) = definedExternally
        var messageFormat: String /* "PlainText" | "CustomPayload" | "SSML" | "Composite" | String */
        var dialogState: String /* "ElicitIntent" | "ConfirmIntent" | "ElicitSlot" | "Fulfilled" | "ReadyForFulfillment" | "Failed" | String */
        var slotToElicit: String?
            get() = definedExternally
            set(value) = definedExternally
        var responseCard: ResponseCard?
            get() = definedExternally
            set(value) = definedExternally
        var sessionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutSessionRequest {
        var botName: BotName
        var botAlias: BotAlias
        var userId: UserId
        var sessionAttributes: StringMap?
            get() = definedExternally
            set(value) = definedExternally
        var dialogAction: DialogAction?
            get() = definedExternally
            set(value) = definedExternally
        var recentIntentSummaryView: IntentSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var accept: Accept?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutSessionResponse {
        var contentType: HttpContentType?
            get() = definedExternally
            set(value) = definedExternally
        var intentName: IntentName?
            get() = definedExternally
            set(value) = definedExternally
        var slots: String?
            get() = definedExternally
            set(value) = definedExternally
        var sessionAttributes: String?
            get() = definedExternally
            set(value) = definedExternally
        var message: Text?
            get() = definedExternally
            set(value) = definedExternally
        var messageFormat: String /* "PlainText" | "CustomPayload" | "SSML" | "Composite" | String */
        var dialogState: String /* "ElicitIntent" | "ConfirmIntent" | "ElicitSlot" | "Fulfilled" | "ReadyForFulfillment" | "Failed" | String */
        var slotToElicit: String?
            get() = definedExternally
            set(value) = definedExternally
        var audioStream: dynamic /* Buffer | Uint8Array | Blob | String | Readable */
            get() = definedExternally
            set(value) = definedExternally
        var sessionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResponseCard {
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var contentType: String /* "application/vnd.amazonaws.card.generic" | String */
        var genericAttachments: genericAttachmentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SentimentResponse {
        var sentimentLabel: SentimentLabel?
            get() = definedExternally
            set(value) = definedExternally
        var sentimentScore: SentimentScore?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StringMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-11-28" | "latest" | String */
    }
}