@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.Construct
import core.IResource
import core.Resource
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

external interface ILogGroup : IResource {
    var logGroupArn: String
    var logGroupName: String
    fun addStream(id: String, props: StreamOptions = definedExternally): LogStream
    fun addSubscriptionFilter(id: String, props: SubscriptionFilterOptions): SubscriptionFilter
    fun addMetricFilter(id: String, props: MetricFilterOptions): MetricFilter
    fun grantWrite(grantee: IGrantable): Grant
    fun grant(grantee: IGrantable, vararg actions: String): Grant
}

external abstract class LogGroupBase : Resource, ILogGroup {
    override var logGroupArn: String
    override var logGroupName: String
    override fun addStream(id: String, props: StreamOptions): LogStream
    override fun addSubscriptionFilter(id: String, props: SubscriptionFilterOptions): SubscriptionFilter
    override fun grantWrite(grantee: IGrantable): Grant
    override fun grant(grantee: IGrantable, vararg actions: String): Grant
}

external enum class RetentionDays {
    ONE_DAY /* = 1 */,
    THREE_DAYS /* = 3 */,
    FIVE_DAYS /* = 5 */,
    ONE_WEEK /* = 7 */,
    TWO_WEEKS /* = 14 */,
    ONE_MONTH /* = 30 */,
    TWO_MONTHS /* = 60 */,
    THREE_MONTHS /* = 90 */,
    FOUR_MONTHS /* = 120 */,
    FIVE_MONTHS /* = 150 */,
    SIX_MONTHS /* = 180 */,
    ONE_YEAR /* = 365 */,
    THIRTEEN_MONTHS /* = 400 */,
    EIGHTEEN_MONTHS /* = 545 */,
    TWO_YEARS /* = 731 */,
    FIVE_YEARS /* = 1827 */,
    TEN_YEARS /* = 3653 */,
    INFINITE /* = 9999 */
}

external interface LogGroupProps {
    var logGroupName: String?
        get() = definedExternally
        set(value) = definedExternally
    var retention: RetentionDays?
        get() = definedExternally
        set(value) = definedExternally
    var removalPolicy: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external abstract class LogGroup(scope: Construct, id: String, props: LogGroupProps = definedExternally) : LogGroupBase {
    override var logGroupArn: String
    override var logGroupName: String

    companion object {
        fun fromLogGroupArn(scope: Construct, id: String, logGroupArn: String): ILogGroup
        fun fromLogGroupName(scope: Construct, id: String, logGroupName: String): ILogGroup
    }
}

external interface StreamOptions {
    var logStreamName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SubscriptionFilterOptions {
    var destination: ILogSubscriptionDestination
    var filterPattern: IFilterPattern
}

external interface MetricFilterOptions {
    var filterPattern: IFilterPattern
    var metricNamespace: String
    var metricName: String
    var metricValue: String?
        get() = definedExternally
        set(value) = definedExternally
    var defaultValue: Number?
        get() = definedExternally
        set(value) = definedExternally
}