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

external interface WaiterConfiguration {
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxAttempts: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$3` {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
    var `$waiter`: WaiterConfiguration?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Service(config: ServiceConfigurationOptions = definedExternally) {
    open fun defineService(serviceIdentifier: String, versions: Array<String>, features: Any = definedExternally): Any
    open fun makeRequest(operation: String, params: Json = definedExternally, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun makeUnauthenticatedRequest(operation: String, params: Json = definedExternally, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setupRequestListeners(request: Request<Any, AWSError>)
    open fun waitFor(state: String, params: `T$3` = definedExternally, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open var apiVersions: Array<String>
    open var config: ConfigBase /* ConfigBase & ServiceConfigurationOptions */
    open var endpoint: Endpoint
}

external interface ServiceConfigurationOptions : ConfigurationOptions {
    var endpoint: String?
        get() = definedExternally
        set(value) = definedExternally
    var params: Json?
        get() = definedExternally
        set(value) = definedExternally
}