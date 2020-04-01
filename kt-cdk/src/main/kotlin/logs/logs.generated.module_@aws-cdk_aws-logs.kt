@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.CfnResource
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

external interface CfnDestinationProps {
    var destinationName: String
    var destinationPolicy: String
    var roleArn: String
    var targetArn: String
}

external open class CfnDestination(scope: CfnResource, id: String, props: CfnDestinationProps) : CfnResource {
    open var attrArn: String
    open var destinationName: String
    open var destinationPolicy: String
    open var roleArn: String
    open var targetArn: String
    open fun inspect(inspector: CfnResource)

    companion object {
        var CFN_RESOURCE_TYPE_NAME: Any
    }
}

external interface CfnLogGroupProps {
    var logGroupName: String?
        get() = definedExternally
        set(value) = definedExternally
    var retentionInDays: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CfnLogGroup(scope: CfnResource, id: String, props: CfnLogGroupProps = definedExternally) : CfnResource {
    open var attrArn: String
    open var logGroupName: String?
    open var retentionInDays: Number?
    open fun inspect(inspector: CfnResource)

    companion object {
        var CFN_RESOURCE_TYPE_NAME: Any
    }
}

external interface CfnLogStreamProps {
    var logGroupName: String
    var logStreamName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CfnLogStream(scope: CfnResource, id: String, props: CfnLogStreamProps) : CfnResource {
    open var logGroupName: String
    open var logStreamName: String?
    open fun inspect(inspector: CfnResource)

    companion object {
        var CFN_RESOURCE_TYPE_NAME: Any
    }
}

external interface CfnMetricFilterProps {
    var filterPattern: String
    var logGroupName: String
    var metricTransformations: dynamic /* Array<dynamic /* CfnMetricFilter.MetricTransformationProperty | cdk.IResolvable */> | cdk.IResolvable */
        get() = definedExternally
        set(value) = definedExternally
}

external open class CfnMetricFilter(scope: CfnResource, id: String, props: CfnMetricFilterProps) : CfnResource {
    open var filterPattern: String
    open var logGroupName: String
    open var metricTransformations: dynamic /* Array<dynamic /* CfnMetricFilter.MetricTransformationProperty | cdk.IResolvable */> | cdk.IResolvable */
    open fun inspect(inspector: CfnResource)
    interface MetricTransformationProperty {
        var defaultValue: Number?
            get() = definedExternally
            set(value) = definedExternally
        var metricName: String
        var metricNamespace: String
        var metricValue: String
    }

    companion object {
        var CFN_RESOURCE_TYPE_NAME: Any
    }
}

external interface CfnSubscriptionFilterProps {
    var destinationArn: String
    var filterPattern: String
    var logGroupName: String
    var roleArn: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CfnSubscriptionFilter(scope: CfnResource, id: String, props: CfnSubscriptionFilterProps) : CfnResource {
    open var destinationArn: String
    open var filterPattern: String
    open var logGroupName: String
    open var roleArn: String?
    open fun inspect(inspector: CfnResource)

    companion object {
        var CFN_RESOURCE_TYPE_NAME: Any
    }
}