@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.CfnResource
import core.Construct
import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface EventSourceMappingOptions {
    var eventSourceArn: String
    var batchSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bisectBatchOnError: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onFailure: IEventSourceDlq?
        get() = definedExternally
        set(value) = definedExternally
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var startingPosition: StartingPosition?
        get() = definedExternally
        set(value) = definedExternally
    var maxBatchingWindow: Any?
        get() = definedExternally
        set(value) = definedExternally
    var maxRecordAge: Any?
        get() = definedExternally
        set(value) = definedExternally
    var retryAttempts: Number?
        get() = definedExternally
        set(value) = definedExternally
    var parallelizationFactor: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EventSourceMappingProps : EventSourceMappingOptions {
    var target: IFunction
}

external interface IEventSourceMapping : CfnResource {
    var eventSourceMappingId: String
}

external open class EventSourceMapping(scope: Construct, id: String, props: EventSourceMappingProps) : CfnResource, IEventSourceMapping {
    override var eventSourceMappingId: String

    companion object {
        fun fromEventSourceMappingId(scope: Construct, id: String, eventSourceMappingId: String): IEventSourceMapping
    }
}

external enum class StartingPosition {
    TRIM_HORIZON /* = "TRIM_HORIZON" */,
    LATEST /* = "LATEST" */
}