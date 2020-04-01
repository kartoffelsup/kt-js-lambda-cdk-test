@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external fun generatePhysicalName(resource: IResource): String

external open class GeneratedWhenNeededMarker : IResolvable {
    override fun resolve(_ctx: IResolveContext): Any
    override fun toString(): String
}

external fun isGeneratedWhenNeededMarker(param_val: String): Boolean