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
import EC2InstanceConnect.SendSSHPublicKeyRequest
import EC2InstanceConnect.SendSSHPublicKeyResponse

typealias AvailabilityZone = String

typealias InstanceId = String

typealias InstanceOSUser = String

typealias RequestId = String

typealias SSHPublicKey = String

typealias Success = Boolean

@JsModule("aws-sdk")
external open class EC2InstanceConnect(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & EC2InstanceConnect.Types.ClientConfiguration */
    open fun sendSSHPublicKey(params: SendSSHPublicKeyRequest, callback: (err: AWSError, data: SendSSHPublicKeyResponse) -> Unit = definedExternally): Request<SendSSHPublicKeyResponse, AWSError>
    open fun sendSSHPublicKey(callback: (err: AWSError, data: SendSSHPublicKeyResponse) -> Unit = definedExternally): Request<SendSSHPublicKeyResponse, AWSError>
    interface SendSSHPublicKeyRequest {
        var InstanceId: InstanceId
        var InstanceOSUser: InstanceOSUser
        var SSHPublicKey: SSHPublicKey
        var AvailabilityZone: AvailabilityZone
    }
    interface SendSSHPublicKeyResponse {
        var RequestId: RequestId?
            get() = definedExternally
            set(value) = definedExternally
        var Success: Success?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-04-02" | "latest" | String */
    }
}