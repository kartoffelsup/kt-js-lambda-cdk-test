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

external interface `T$7` {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}

external interface `T$8` {
    var method: String?
        get() = definedExternally
        set(value) = definedExternally
    var headers: `T$7`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$9` {
    var timeout: Number
}

external open class MetadataService(options: MetadataServiceOptions = definedExternally) {
    open fun request(path: String, callback: (err: AWSError, data: String) -> Unit)
    open fun request(path: String, options: `T$8`, callback: (err: AWSError, data: String) -> Unit)
    open var httpOptions: `T$9`

    companion object {
        var host: String
    }
}

external interface MetadataServiceOptions {
    var host: String?
        get() = definedExternally
        set(value) = definedExternally
    var httpOptions: `T$6`?
        get() = definedExternally
        set(value) = definedExternally
    var maxRetries: Number?
        get() = definedExternally
        set(value) = definedExternally
    var retryDelayOptions: Any?
        get() = definedExternally
        set(value) = definedExternally
}