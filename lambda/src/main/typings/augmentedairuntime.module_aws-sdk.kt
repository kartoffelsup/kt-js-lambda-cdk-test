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
import AugmentedAIRuntime.HumanLoopSummary
import AugmentedAIRuntime.DeleteHumanLoopRequest
import AugmentedAIRuntime.DeleteHumanLoopResponse
import AugmentedAIRuntime.DescribeHumanLoopRequest
import AugmentedAIRuntime.DescribeHumanLoopResponse
import AugmentedAIRuntime.ListHumanLoopsRequest
import AugmentedAIRuntime.ListHumanLoopsResponse
import AugmentedAIRuntime.StartHumanLoopRequest
import AugmentedAIRuntime.StartHumanLoopResponse
import AugmentedAIRuntime.StopHumanLoopRequest
import AugmentedAIRuntime.StopHumanLoopResponse
import AugmentedAIRuntime.HumanLoopOutput
import AugmentedAIRuntime.HumanLoopInput
import AugmentedAIRuntime.HumanLoopDataAttributes

typealias ContentClassifiers = Array<String /* "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent" | String */>

typealias FailureReason = String

typealias FlowDefinitionArn = String

typealias HumanLoopArn = String

typealias HumanLoopName = String

typealias HumanLoopSummaries = Array<HumanLoopSummary>

typealias InputContent = String

typealias MaxResults = Number

typealias NextToken = String

typealias String = String

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class AugmentedAIRuntime(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & AugmentedAIRuntime.Types.ClientConfiguration */
    open fun deleteHumanLoop(params: DeleteHumanLoopRequest, callback: (err: AWSError, data: DeleteHumanLoopResponse) -> Unit = definedExternally): Request<DeleteHumanLoopResponse, AWSError>
    open fun deleteHumanLoop(callback: (err: AWSError, data: DeleteHumanLoopResponse) -> Unit = definedExternally): Request<DeleteHumanLoopResponse, AWSError>
    open fun describeHumanLoop(params: DescribeHumanLoopRequest, callback: (err: AWSError, data: DescribeHumanLoopResponse) -> Unit = definedExternally): Request<DescribeHumanLoopResponse, AWSError>
    open fun describeHumanLoop(callback: (err: AWSError, data: DescribeHumanLoopResponse) -> Unit = definedExternally): Request<DescribeHumanLoopResponse, AWSError>
    open fun listHumanLoops(params: ListHumanLoopsRequest, callback: (err: AWSError, data: ListHumanLoopsResponse) -> Unit = definedExternally): Request<ListHumanLoopsResponse, AWSError>
    open fun listHumanLoops(callback: (err: AWSError, data: ListHumanLoopsResponse) -> Unit = definedExternally): Request<ListHumanLoopsResponse, AWSError>
    open fun startHumanLoop(params: StartHumanLoopRequest, callback: (err: AWSError, data: StartHumanLoopResponse) -> Unit = definedExternally): Request<StartHumanLoopResponse, AWSError>
    open fun startHumanLoop(callback: (err: AWSError, data: StartHumanLoopResponse) -> Unit = definedExternally): Request<StartHumanLoopResponse, AWSError>
    open fun stopHumanLoop(params: StopHumanLoopRequest, callback: (err: AWSError, data: StopHumanLoopResponse) -> Unit = definedExternally): Request<StopHumanLoopResponse, AWSError>
    open fun stopHumanLoop(callback: (err: AWSError, data: StopHumanLoopResponse) -> Unit = definedExternally): Request<StopHumanLoopResponse, AWSError>
    interface DeleteHumanLoopRequest {
        var HumanLoopName: HumanLoopName
    }
    interface DeleteHumanLoopResponse
    interface DescribeHumanLoopRequest {
        var HumanLoopName: HumanLoopName
    }
    interface DescribeHumanLoopResponse {
        var CreationTime: Timestamp
        var FailureReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailureCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopStatus: String /* "InProgress" | "Failed" | "Completed" | "Stopped" | "Stopping" | String */
        var HumanLoopName: HumanLoopName
        var HumanLoopArn: HumanLoopArn
        var FlowDefinitionArn: FlowDefinitionArn
        var HumanLoopOutput: HumanLoopOutput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HumanLoopDataAttributes {
        var ContentClassifiers: ContentClassifiers
    }
    interface HumanLoopInput {
        var InputContent: InputContent
    }
    interface HumanLoopOutput {
        var OutputS3Uri: String
    }
    interface HumanLoopSummary {
        var HumanLoopName: HumanLoopName?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopStatus: String /* "InProgress" | "Failed" | "Completed" | "Stopped" | "Stopping" | String */
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var FlowDefinitionArn: FlowDefinitionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHumanLoopsRequest {
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var FlowDefinitionArn: FlowDefinitionArn
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHumanLoopsResponse {
        var HumanLoopSummaries: HumanLoopSummaries
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartHumanLoopRequest {
        var HumanLoopName: HumanLoopName
        var FlowDefinitionArn: FlowDefinitionArn
        var HumanLoopInput: HumanLoopInput
        var DataAttributes: HumanLoopDataAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartHumanLoopResponse {
        var HumanLoopArn: HumanLoopArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopHumanLoopRequest {
        var HumanLoopName: HumanLoopName
    }
    interface StopHumanLoopResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2019-11-07" | "latest" | String */
    }
}