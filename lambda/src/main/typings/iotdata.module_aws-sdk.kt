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
import IotData.DeleteThingShadowRequest
import IotData.DeleteThingShadowResponse
import IotData.GetThingShadowRequest
import IotData.GetThingShadowResponse
import IotData.PublishRequest
import IotData.UpdateThingShadowRequest
import IotData.UpdateThingShadowResponse

typealias Qos = Number

typealias ThingName = String

typealias Topic = String

@JsModule("aws-sdk")
external open class IotData(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & IotData.Types.ClientConfiguration */
    open fun deleteThingShadow(params: DeleteThingShadowRequest, callback: (err: AWSError, data: DeleteThingShadowResponse) -> Unit = definedExternally): Request<DeleteThingShadowResponse, AWSError>
    open fun deleteThingShadow(callback: (err: AWSError, data: DeleteThingShadowResponse) -> Unit = definedExternally): Request<DeleteThingShadowResponse, AWSError>
    open fun getThingShadow(params: GetThingShadowRequest, callback: (err: AWSError, data: GetThingShadowResponse) -> Unit = definedExternally): Request<GetThingShadowResponse, AWSError>
    open fun getThingShadow(callback: (err: AWSError, data: GetThingShadowResponse) -> Unit = definedExternally): Request<GetThingShadowResponse, AWSError>
    open fun publish(params: PublishRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun publish(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateThingShadow(params: UpdateThingShadowRequest, callback: (err: AWSError, data: UpdateThingShadowResponse) -> Unit = definedExternally): Request<UpdateThingShadowResponse, AWSError>
    open fun updateThingShadow(callback: (err: AWSError, data: UpdateThingShadowResponse) -> Unit = definedExternally): Request<UpdateThingShadowResponse, AWSError>
    interface DeleteThingShadowRequest {
        var thingName: ThingName
    }
    interface DeleteThingShadowResponse {
        var payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetThingShadowRequest {
        var thingName: ThingName
    }
    interface GetThingShadowResponse {
        var payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublishRequest {
        var topic: Topic
        var qos: Qos?
            get() = definedExternally
            set(value) = definedExternally
        var payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateThingShadowRequest {
        var thingName: ThingName
        var payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateThingShadowResponse {
        var payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-05-28" | "latest" | String */
    }
}