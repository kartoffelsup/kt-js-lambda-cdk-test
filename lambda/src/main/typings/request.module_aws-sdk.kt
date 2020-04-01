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

external interface `T$1` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}

external open class Request<D, E>(service: Service, operation: String, params: Any = definedExternally) {
    open fun abort()
    open fun createReadStream(): stream.Readable
    open fun eachPage(callback: (err: E, data: D, doneCallback: () -> Unit) -> Boolean)
    open fun isPageable(): Boolean
    open fun send(callback: (err: E, data: D) -> Unit = definedExternally)
    open fun on(event: String, listener: () -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun on(event: String, listener: (request: Request<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun on(event: String, listener: (response: Response<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun on(event: String /* "error" */, listener: (err: AWSError, response: Response<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun on(event: String /* "httpHeaders" */, listener: (statusCode: Number, headers: `T$1`, response: Response<D, E>, statusMessage: String) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun on(event: String /* "httpData" */, listener: (chunk: dynamic /* Buffer | Uint8Array */, response: Response<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun on(event: String, listener: (progress: Progress, response: Response<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun on(event: String /* "httpError" */, listener: (err: Error, response: Response<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun onAsync(event: String, listener: () -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun onAsync(event: String, listener: (request: Request<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun onAsync(event: String, listener: (response: Response<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun onAsync(event: String /* "error" */, listener: (err: AWSError, response: Response<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun onAsync(event: String /* "httpHeaders" */, listener: (statusCode: Number, headers: `T$1`, response: Response<D, E>, statusMessage: String) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun onAsync(event: String /* "httpData" */, listener: (chunk: dynamic /* Buffer | Uint8Array */, response: Response<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun onAsync(event: String, listener: (progress: Progress, response: Response<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun onAsync(event: String /* "httpError" */, listener: (err: Error, response: Response<D, E>) -> Unit, prepend: Boolean = definedExternally): Request<D, E>
    open fun promise(): Promise<D /* D & `T$2` */>
    open var startTime: Date
    open var httpRequest: HttpRequest
}

external interface Progress {
    var loaded: Number
    var total: Number
}