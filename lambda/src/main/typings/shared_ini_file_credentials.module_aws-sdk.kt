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

external open class SharedIniFileCredentials(options: SharedIniFileCredentialsOptions = definedExternally) : Credentials

external interface SharedIniFileCredentialsOptions {
    var profile: String?
        get() = definedExternally
        set(value) = definedExternally
    var filename: String?
        get() = definedExternally
        set(value) = definedExternally
    var disableAssumeRole: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tokenCodeFn: ((mfaSerial: String, callback: (err: Error, token: String) -> Unit) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var httpOptions: HTTPOptions?
        get() = definedExternally
        set(value) = definedExternally
    var callback: ((err: Error) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}