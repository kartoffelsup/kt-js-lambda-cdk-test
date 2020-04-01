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

external interface LifecycleRule {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var abortIncompleteMultipartUploadAfter: Any?
        get() = definedExternally
        set(value) = definedExternally
    var expirationDate: Date?
        get() = definedExternally
        set(value) = definedExternally
    var expiration: Any?
        get() = definedExternally
        set(value) = definedExternally
    var noncurrentVersionExpiration: Any?
        get() = definedExternally
        set(value) = definedExternally
    var noncurrentVersionTransitions: Array<NoncurrentVersionTransition>?
        get() = definedExternally
        set(value) = definedExternally
    var transitions: Array<Transition>?
        get() = definedExternally
        set(value) = definedExternally
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var tagFilters: Json?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Transition {
    var storageClass: StorageClass
    var transitionDate: Date?
        get() = definedExternally
        set(value) = definedExternally
    var transitionAfter: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NoncurrentVersionTransition {
    var storageClass: StorageClass
    var transitionAfter: Any
}

external open class StorageClass(value: String) {
    open var value: String
    override fun toString(): String

    companion object {
        var INFREQUENT_ACCESS: StorageClass
        var ONE_ZONE_INFREQUENT_ACCESS: StorageClass
        var GLACIER: StorageClass
        var DEEP_ARCHIVE: StorageClass
        var INTELLIGENT_TIERING: StorageClass
    }
}