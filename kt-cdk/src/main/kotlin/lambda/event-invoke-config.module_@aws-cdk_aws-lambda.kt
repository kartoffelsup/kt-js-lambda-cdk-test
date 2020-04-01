@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.Construct
import core.Resource
import kotlin.js.*

external interface EventInvokeConfigOptions {
    var onFailure: IDestination?
        get() = definedExternally
        set(value) = definedExternally
    var onSuccess: IDestination?
        get() = definedExternally
        set(value) = definedExternally
    var maxEventAge: Any?
        get() = definedExternally
        set(value) = definedExternally
    var retryAttempts: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EventInvokeConfigProps : EventInvokeConfigOptions {
    var function: IFunction
    var qualifier: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class EventInvokeConfig(scope: Construct, id: String, props: EventInvokeConfigProps) : Resource