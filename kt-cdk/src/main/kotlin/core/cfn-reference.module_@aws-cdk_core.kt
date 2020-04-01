@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external open class CfnReference(value: Any, displayName: String, target: IConstruct) :
    Reference {
    open var replacementTokens: Any
    override fun resolve(context: IResolveContext): Any
    open fun hasValueForStack(stack: Stack): Boolean
    open fun assignValueForStack(stack: Stack, value: IResolvable)
    override fun toString(): String

    companion object {
        fun isCfnReference(x: IResolvable): Boolean
        fun `for`(target: CfnElement, attribute: String): CfnReference
        fun forPseudo(pseudoName: String, scope: Construct): CfnReference
        var referenceTable: Any
        var singletonReference: Any
    }
}