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

external interface IMetric {
    fun toMetricConfig(): MetricConfig
    fun toAlarmConfig(): MetricAlarmConfig
    fun toGraphConfig(): MetricGraphConfig
}

external interface Dimension {
    var name: String
    var value: Any
}

external enum class Statistic {
    SAMPLE_COUNT /* = "SampleCount" */,
    AVERAGE /* = "Average" */,
    SUM /* = "Sum" */,
    MINIMUM /* = "Minimum" */,
    MAXIMUM /* = "Maximum" */
}

external enum class Unit {
    SECONDS /* = "Seconds" */,
    MICROSECONDS /* = "Microseconds" */,
    MILLISECONDS /* = "Milliseconds" */,
    BYTES /* = "Bytes" */,
    KILOBYTES /* = "Kilobytes" */,
    MEGABYTES /* = "Megabytes" */,
    GIGABYTES /* = "Gigabytes" */,
    TERABYTES /* = "Terabytes" */,
    BITS /* = "Bits" */,
    KILOBITS /* = "Kilobits" */,
    MEGABITS /* = "Megabits" */,
    GIGABITS /* = "Gigabits" */,
    TERABITS /* = "Terabits" */,
    PERCENT /* = "Percent" */,
    COUNT /* = "Count" */,
    BYTES_PER_SECOND /* = "Bytes/Second" */,
    KILOBYTES_PER_SECOND /* = "Kilobytes/Second" */,
    MEGABYTES_PER_SECOND /* = "Megabytes/Second" */,
    GIGABYTES_PER_SECOND /* = "Gigabytes/Second" */,
    TERABYTES_PER_SECOND /* = "Terabytes/Second" */,
    BITS_PER_SECOND /* = "Bits/Second" */,
    KILOBITS_PER_SECOND /* = "Kilobits/Second" */,
    MEGABITS_PER_SECOND /* = "Megabits/Second" */,
    GIGABITS_PER_SECOND /* = "Gigabits/Second" */,
    TERABITS_PER_SECOND /* = "Terabits/Second" */,
    COUNT_PER_SECOND /* = "Count/Second" */,
    NONE /* = "None" */
}

external interface MetricConfig {
    var metricStat: MetricStatConfig?
        get() = definedExternally
        set(value) = definedExternally
    var mathExpression: MetricExpressionConfig?
        get() = definedExternally
        set(value) = definedExternally
    var renderingProperties: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MetricStatConfig {
    var dimensions: Array<Dimension>?
        get() = definedExternally
        set(value) = definedExternally
    var namespace: String
    var metricName: String
    var period: Any
    var statistic: String
    var unitFilter: Unit?
        get() = definedExternally
        set(value) = definedExternally
    var region: String?
        get() = definedExternally
        set(value) = definedExternally
    var account: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MetricExpressionConfig {
    var expression: String
    var usingMetrics: Any
}

external interface MetricAlarmConfig {
    var dimensions: Array<Dimension>?
        get() = definedExternally
        set(value) = definedExternally
    var namespace: String
    var metricName: String
    var period: Number
    var statistic: Statistic?
        get() = definedExternally
        set(value) = definedExternally
    var extendedStatistic: String?
        get() = definedExternally
        set(value) = definedExternally
    var unit: Unit?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MetricGraphConfig {
    var dimensions: Array<Dimension>?
        get() = definedExternally
        set(value) = definedExternally
    var namespace: String
    var metricName: String
    var renderingProperties: MetricRenderingProperties
    var period: Number
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var statistic: String?
        get() = definedExternally
        set(value) = definedExternally
    var unit: Unit?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MetricRenderingProperties {
    var period: Number
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var stat: String?
        get() = definedExternally
        set(value) = definedExternally
}