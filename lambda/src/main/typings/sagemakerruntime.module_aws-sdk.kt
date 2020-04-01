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
import SageMakerRuntime.InvokeEndpointInput
import SageMakerRuntime.InvokeEndpointOutput

typealias CustomAttributesHeader = String

typealias EndpointName = String

typealias Header = String

typealias TargetModelHeader = String

@JsModule("aws-sdk")
external open class SageMakerRuntime(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SageMakerRuntime.Types.ClientConfiguration */
    open fun invokeEndpoint(params: InvokeEndpointInput, callback: (err: AWSError, data: InvokeEndpointOutput) -> Unit = definedExternally): Request<InvokeEndpointOutput, AWSError>
    open fun invokeEndpoint(callback: (err: AWSError, data: InvokeEndpointOutput) -> Unit = definedExternally): Request<InvokeEndpointOutput, AWSError>
    interface InvokeEndpointInput {
        var EndpointName: EndpointName
        var Body: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: Header?
            get() = definedExternally
            set(value) = definedExternally
        var Accept: Header?
            get() = definedExternally
            set(value) = definedExternally
        var CustomAttributes: CustomAttributesHeader?
            get() = definedExternally
            set(value) = definedExternally
        var TargetModel: TargetModelHeader?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InvokeEndpointOutput {
        var Body: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: Header?
            get() = definedExternally
            set(value) = definedExternally
        var InvokedProductionVariant: Header?
            get() = definedExternally
            set(value) = definedExternally
        var CustomAttributes: CustomAttributesHeader?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-05-13" | "latest" | String */
    }
}