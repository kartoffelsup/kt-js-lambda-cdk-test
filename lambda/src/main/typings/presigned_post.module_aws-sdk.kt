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
import PresignedPost.Fields

external open class PresignedPost {
    open var url: String
    open var fields: Fields
    interface Params {
        var Bucket: String?
            get() = definedExternally
            set(value) = definedExternally
        var Conditions: Array<dynamic /* Json | dynamic */>?
            get() = definedExternally
            set(value) = definedExternally
        var Expires: Number?
            get() = definedExternally
            set(value) = definedExternally
        var Fields: Json?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Fields {
        operator fun get(key: String): String
        operator fun set(key: String, value: String)
        var Policy: String
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
}