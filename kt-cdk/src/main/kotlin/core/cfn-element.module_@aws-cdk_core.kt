@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external open class CfnElement(scope: Construct, id: String) :
    Construct {
    open var logicalId: String
    open var stack: Stack
    open var _logicalIdOverride: Any
    open fun overrideLogicalId(newLogicalId: String)
    open var synthesizeLogicalId: Any

    companion object {
        fun isCfnElement(x: Any): Boolean
    }
}

external open class CfnRefElement : CfnElement