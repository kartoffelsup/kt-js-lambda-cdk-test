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
import ConnectParticipant.Item
import ConnectParticipant.CreateParticipantConnectionRequest
import ConnectParticipant.CreateParticipantConnectionResponse
import ConnectParticipant.DisconnectParticipantRequest
import ConnectParticipant.DisconnectParticipantResponse
import ConnectParticipant.GetTranscriptRequest
import ConnectParticipant.GetTranscriptResponse
import ConnectParticipant.SendEventRequest
import ConnectParticipant.SendEventResponse
import ConnectParticipant.SendMessageRequest
import ConnectParticipant.SendMessageResponse
import ConnectParticipant.Websocket
import ConnectParticipant.ConnectionCredentials
import ConnectParticipant.StartPosition

typealias ChatContent = String

typealias ChatContentType = String

typealias ChatItemId = String

typealias ClientToken = String

typealias ConnectionTypeList = Array<String /* "WEBSOCKET" | "CONNECTION_CREDENTIALS" | String */>

typealias ContactId = String

typealias DisplayName = String

typealias ISO8601Datetime = String

typealias Instant = String

typealias MaxResults = Number

typealias MostRecent = Number

typealias NextToken = String

typealias ParticipantId = String

typealias ParticipantToken = String

typealias PreSignedConnectionUrl = String

typealias Transcript = Array<Item>

@JsModule("aws-sdk")
external open class ConnectParticipant(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ConnectParticipant.Types.ClientConfiguration */
    open fun createParticipantConnection(params: CreateParticipantConnectionRequest, callback: (err: AWSError, data: CreateParticipantConnectionResponse) -> Unit = definedExternally): Request<CreateParticipantConnectionResponse, AWSError>
    open fun createParticipantConnection(callback: (err: AWSError, data: CreateParticipantConnectionResponse) -> Unit = definedExternally): Request<CreateParticipantConnectionResponse, AWSError>
    open fun disconnectParticipant(params: DisconnectParticipantRequest, callback: (err: AWSError, data: DisconnectParticipantResponse) -> Unit = definedExternally): Request<DisconnectParticipantResponse, AWSError>
    open fun disconnectParticipant(callback: (err: AWSError, data: DisconnectParticipantResponse) -> Unit = definedExternally): Request<DisconnectParticipantResponse, AWSError>
    open fun getTranscript(params: GetTranscriptRequest, callback: (err: AWSError, data: GetTranscriptResponse) -> Unit = definedExternally): Request<GetTranscriptResponse, AWSError>
    open fun getTranscript(callback: (err: AWSError, data: GetTranscriptResponse) -> Unit = definedExternally): Request<GetTranscriptResponse, AWSError>
    open fun sendEvent(params: SendEventRequest, callback: (err: AWSError, data: SendEventResponse) -> Unit = definedExternally): Request<SendEventResponse, AWSError>
    open fun sendEvent(callback: (err: AWSError, data: SendEventResponse) -> Unit = definedExternally): Request<SendEventResponse, AWSError>
    open fun sendMessage(params: SendMessageRequest, callback: (err: AWSError, data: SendMessageResponse) -> Unit = definedExternally): Request<SendMessageResponse, AWSError>
    open fun sendMessage(callback: (err: AWSError, data: SendMessageResponse) -> Unit = definedExternally): Request<SendMessageResponse, AWSError>
    interface ConnectionCredentials {
        var ConnectionToken: ParticipantToken?
            get() = definedExternally
            set(value) = definedExternally
        var Expiry: ISO8601Datetime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateParticipantConnectionRequest {
        var Type: ConnectionTypeList
        var ParticipantToken: ParticipantToken
    }
    interface CreateParticipantConnectionResponse {
        var Websocket: Websocket?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionCredentials: ConnectionCredentials?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisconnectParticipantRequest {
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionToken: ParticipantToken
    }
    interface DisconnectParticipantResponse
    interface GetTranscriptRequest {
        var ContactId: ContactId?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ScanDirection: String /* "FORWARD" | "BACKWARD" | String */
        var SortOrder: String /* "DESCENDING" | "ASCENDING" | String */
        var StartPosition: StartPosition?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionToken: ParticipantToken
    }
    interface GetTranscriptResponse {
        var InitialContactId: ContactId?
            get() = definedExternally
            set(value) = definedExternally
        var Transcript: Transcript?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Item {
        var AbsoluteTime: Instant?
            get() = definedExternally
            set(value) = definedExternally
        var Content: ChatContent?
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: ChatContentType?
            get() = definedExternally
            set(value) = definedExternally
        var Id: ChatItemId?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "MESSAGE" | "EVENT" | "CONNECTION_ACK" | String */
        var ParticipantId: ParticipantId?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: DisplayName?
            get() = definedExternally
            set(value) = definedExternally
        var ParticipantRole: String /* "AGENT" | "CUSTOMER" | "SYSTEM" | String */
    }
    interface SendEventRequest {
        var ContentType: ChatContentType
        var Content: ChatContent?
            get() = definedExternally
            set(value) = definedExternally
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionToken: ParticipantToken
    }
    interface SendEventResponse {
        var Id: ChatItemId?
            get() = definedExternally
            set(value) = definedExternally
        var AbsoluteTime: Instant?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendMessageRequest {
        var ContentType: ChatContentType
        var Content: ChatContent
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionToken: ParticipantToken
    }
    interface SendMessageResponse {
        var Id: ChatItemId?
            get() = definedExternally
            set(value) = definedExternally
        var AbsoluteTime: Instant?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartPosition {
        var Id: ChatItemId?
            get() = definedExternally
            set(value) = definedExternally
        var AbsoluteTime: Instant?
            get() = definedExternally
            set(value) = definedExternally
        var MostRecent: MostRecent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Websocket {
        var Url: PreSignedConnectionUrl?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionExpiry: ISO8601Datetime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-09-07" | "latest" | String */
    }
}