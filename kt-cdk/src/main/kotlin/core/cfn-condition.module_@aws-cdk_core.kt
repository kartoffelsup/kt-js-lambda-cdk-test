@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface CfnConditionProps {
    var expression: ICfnConditionExpression?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CfnCondition(scope: Construct, id: String, props: CfnConditionProps = definedExternally) : CfnElement,
    ICfnConditionExpression, IResolvable {
    open var expression: ICfnConditionExpression
    override fun resolve(_context: IResolveContext): Any
}

external interface ICfnConditionExpression : IResolvable