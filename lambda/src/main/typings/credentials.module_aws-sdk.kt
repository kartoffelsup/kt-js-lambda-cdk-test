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

external open class Credentials(options: CredentialsOptions) {
    constructor(accessKeyId: String, secretAccessKey: String, sessionToken: String)
    open fun get(callback: (err: AWSError) -> Unit)
    open fun getPromise(): Promise<Unit>
    open fun needsRefresh(): Boolean
    open fun refresh(callback: (err: AWSError) -> Unit)
    open fun refreshPromise(): Promise<Unit>
    open var accessKeyId: String
    open var expired: Boolean
    open var expireTime: Date
    open var secretAccessKey: String
    open var sessionToken: String

    companion object {
        var expiryWindow: Number
    }
}

external interface CredentialsOptions {
    var accessKeyId: String
    var secretAccessKey: String
    var sessionToken: String?
        get() = definedExternally
        set(value) = definedExternally
}