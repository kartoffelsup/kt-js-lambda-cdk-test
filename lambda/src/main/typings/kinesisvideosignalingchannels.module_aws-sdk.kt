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
import KinesisVideoSignalingChannels.IceServer
import KinesisVideoSignalingChannels.GetIceServerConfigRequest
import KinesisVideoSignalingChannels.GetIceServerConfigResponse
import KinesisVideoSignalingChannels.SendAlexaOfferToMasterRequest
import KinesisVideoSignalingChannels.SendAlexaOfferToMasterResponse

typealias Answer = String

typealias ClientId = String

typealias IceServerList = Array<IceServer>

typealias MessagePayload = String

typealias Password = String

typealias ResourceARN = String

typealias Ttl = Number

typealias Uri = String

typealias Uris = Array<Uri>

typealias Username = String

@JsModule("aws-sdk")
external open class KinesisVideoSignalingChannels(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & KinesisVideoSignalingChannels.Types.ClientConfiguration */
    open fun getIceServerConfig(params: GetIceServerConfigRequest, callback: (err: AWSError, data: GetIceServerConfigResponse) -> Unit = definedExternally): Request<GetIceServerConfigResponse, AWSError>
    open fun getIceServerConfig(callback: (err: AWSError, data: GetIceServerConfigResponse) -> Unit = definedExternally): Request<GetIceServerConfigResponse, AWSError>
    open fun sendAlexaOfferToMaster(params: SendAlexaOfferToMasterRequest, callback: (err: AWSError, data: SendAlexaOfferToMasterResponse) -> Unit = definedExternally): Request<SendAlexaOfferToMasterResponse, AWSError>
    open fun sendAlexaOfferToMaster(callback: (err: AWSError, data: SendAlexaOfferToMasterResponse) -> Unit = definedExternally): Request<SendAlexaOfferToMasterResponse, AWSError>
    interface GetIceServerConfigRequest {
        var ChannelARN: ResourceARN
        var ClientId: ClientId?
            get() = definedExternally
            set(value) = definedExternally
        var Service: String /* "TURN" | String */
        var Username: Username?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIceServerConfigResponse {
        var IceServerList: IceServerList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IceServer {
        var Uris: Uris?
            get() = definedExternally
            set(value) = definedExternally
        var Username: Username?
            get() = definedExternally
            set(value) = definedExternally
        var Password: Password?
            get() = definedExternally
            set(value) = definedExternally
        var Ttl: Ttl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendAlexaOfferToMasterRequest {
        var ChannelARN: ResourceARN
        var SenderClientId: ClientId
        var MessagePayload: MessagePayload
    }
    interface SendAlexaOfferToMasterResponse {
        var Answer: Answer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-12-04" | "latest" | String */
    }
}