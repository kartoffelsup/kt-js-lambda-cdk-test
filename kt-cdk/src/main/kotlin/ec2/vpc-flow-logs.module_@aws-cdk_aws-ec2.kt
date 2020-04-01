@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import core.Construct
import core.IResource
import core.Resource

external interface IFlowLog : IResource {
    var flowLogId: String
}

external enum class FlowLogTrafficType {
    ACCEPT /* = "ACCEPT" */,
    ALL /* = "ALL" */,
    REJECT /* = "REJECT" */
}

external enum class FlowLogDestinationType {
    CLOUD_WATCH_LOGS /* = "cloud-watch-logs" */,
    S3 /* = "s3" */
}

external open class FlowLogResourceType {
    open var resourceType: String
    open var resourceId: String

    companion object {
        fun fromSubnet(subnet: ISubnet): FlowLogResourceType
        fun fromVpc(vpc: IVpc): FlowLogResourceType
        fun fromNetworkInterfaceId(id: String): FlowLogResourceType
    }
}

external open class FlowLogDestination {
    open fun bind(scope: Construct, flowLog: FlowLog): FlowLogDestinationConfig

    companion object {
        fun toCloudWatchLogs(logGroup: ILogGroup = definedExternally, iamRole: IRole = definedExternally): FlowLogDestination
        fun toS3(bucket: IBucket = definedExternally): FlowLogDestination
    }
}

external interface FlowLogDestinationConfig {
    var logDestinationType: FlowLogDestinationType
    var iamRole: Any?
        get() = definedExternally
        set(value) = definedExternally
    var logGroup: Any?
        get() = definedExternally
        set(value) = definedExternally
    var s3Bucket: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FlowLogOptions {
    var trafficType: FlowLogTrafficType?
        get() = definedExternally
        set(value) = definedExternally
    var destination: FlowLogDestination?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FlowLogProps : FlowLogOptions {
    var flowLogName: String?
        get() = definedExternally
        set(value) = definedExternally
    var resourceType: FlowLogResourceType
}

external open class FlowLogBase : Resource, IFlowLog {
    override var flowLogId: String
}

external open class FlowLog(scope: Construct, id: String, props: FlowLogProps) : FlowLogBase {
    override var flowLogId: String
    open var bucket: Any
    open var iamRole: Any
    open var logGroup: Any

    companion object {
        fun fromFlowLogId(scope: Construct, id: String, flowLogId: String): IFlowLog
    }
}