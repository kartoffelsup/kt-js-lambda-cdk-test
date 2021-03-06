@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external enum class RemovalPolicy {
    DESTROY /* = "destroy" */,
    RETAIN /* = "retain" */
}

external interface RemovalPolicyOptions {
    var default: RemovalPolicy?
        get() = definedExternally
        set(value) = definedExternally
    var applyToUpdateReplacePolicy: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}