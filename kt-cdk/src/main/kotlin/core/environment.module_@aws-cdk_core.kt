@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface Environment {
    var account: String?
        get() = definedExternally
        set(value) = definedExternally
    var region: String?
        get() = definedExternally
        set(value) = definedExternally
}