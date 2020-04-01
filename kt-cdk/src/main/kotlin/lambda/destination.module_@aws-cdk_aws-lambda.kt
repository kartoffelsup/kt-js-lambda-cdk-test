@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.Construct
import kotlin.js.*

external interface DestinationConfig {
    var destination: String
}

external enum class DestinationType {
    FAILURE /* = "Failure" */,
    SUCCESS /* = "Success" */
}

external interface DestinationOptions {
    var type: DestinationType
}

external interface IDestination {
    fun bind(scope: Construct, fn: IFunction, options: DestinationOptions = definedExternally): DestinationConfig
}