@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external open class Reference(value: Any, target: IConstruct, displayName: String = definedExternally) :
    Intrinsic {
    open var target: IConstruct
    open var displayName: String

    companion object {
        fun isReference(x: Any): Boolean
    }
}