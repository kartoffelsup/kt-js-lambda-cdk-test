@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external open class Intrinsic(value: Any) : IResolvable {
    open var value: Any
    override fun resolve(_context: IResolveContext): Any
    override fun toString(): String
    open fun toJSON(): Any
    open fun newError(message: String): Any
}