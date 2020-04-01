@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
@file:JsModule("@aws-cdk/core")

package core

import kotlin.js.*

external interface CfnParameterProps {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var default: Any?
        get() = definedExternally
        set(value) = definedExternally
    var allowedPattern: String?
        get() = definedExternally
        set(value) = definedExternally
    var allowedValues: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var constraintDescription: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var noEcho: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CfnParameter(scope: Construct, id: String, props: CfnParameterProps = definedExternally) :
    CfnElement {
    open var props: Any
    open var type: Any
    open fun resolve(_context: IResolveContext): Any
}