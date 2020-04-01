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
import ApiGatewayManagementApi.DeleteConnectionRequest
import ApiGatewayManagementApi.GetConnectionRequest
import ApiGatewayManagementApi.GetConnectionResponse
import ApiGatewayManagementApi.PostToConnectionRequest
import ApiGatewayManagementApi.Identity

typealias __string = String

typealias __timestampIso8601 = Date

@JsModule("aws-sdk")
external open class ApiGatewayManagementApi(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ApiGatewayManagementApi.Types.ClientConfiguration */
    open fun deleteConnection(params: DeleteConnectionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConnection(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getConnection(params: GetConnectionRequest, callback: (err: AWSError, data: GetConnectionResponse) -> Unit = definedExternally): Request<GetConnectionResponse, AWSError>
    open fun getConnection(callback: (err: AWSError, data: GetConnectionResponse) -> Unit = definedExternally): Request<GetConnectionResponse, AWSError>
    open fun postToConnection(params: PostToConnectionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun postToConnection(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface DeleteConnectionRequest {
        var ConnectionId: __string
    }
    interface GetConnectionRequest {
        var ConnectionId: __string
    }
    interface GetConnectionResponse {
        var ConnectedAt: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
        var Identity: Identity?
            get() = definedExternally
            set(value) = definedExternally
        var LastActiveAt: __timestampIso8601?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Identity {
        var SourceIp: __string
        var UserAgent: __string
    }
    interface PostToConnectionRequest {
        var Data: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionId: __string
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-11-29" | "latest" | String */
    }
}