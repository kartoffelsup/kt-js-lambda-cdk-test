@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

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

external fun allMetricsGraphJson(left: Array<IMetric>, right: Array<IMetric>): Array<Any>

external interface MetricEntry<A> {
    var metric: IMetric
    var tag: A?
        get() = definedExternally
        set(value) = definedExternally
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class MetricSet<A> {
    open var metrics: Any
    open var metricById: Any
    open var metricByKey: Any
    open fun addTopLevel(tag: A, vararg metrics: IMetric)
    open var addOne: Any
}