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
import IoTEvents.Action
import IoTEvents.Attribute
import IoTEvents.DetectorDebugOption
import IoTEvents.DetectorModelSummary
import IoTEvents.DetectorModelVersionSummary
import IoTEvents.Event
import IoTEvents.InputSummary
import IoTEvents.State
import IoTEvents.Tag
import IoTEvents.TransitionEvent
import IoTEvents.CreateDetectorModelRequest
import IoTEvents.CreateDetectorModelResponse
import IoTEvents.CreateInputRequest
import IoTEvents.CreateInputResponse
import IoTEvents.DeleteDetectorModelRequest
import IoTEvents.DeleteDetectorModelResponse
import IoTEvents.DeleteInputRequest
import IoTEvents.DeleteInputResponse
import IoTEvents.DescribeDetectorModelRequest
import IoTEvents.DescribeDetectorModelResponse
import IoTEvents.DescribeInputRequest
import IoTEvents.DescribeInputResponse
import IoTEvents.DescribeLoggingOptionsRequest
import IoTEvents.DescribeLoggingOptionsResponse
import IoTEvents.ListDetectorModelVersionsRequest
import IoTEvents.ListDetectorModelVersionsResponse
import IoTEvents.ListDetectorModelsRequest
import IoTEvents.ListDetectorModelsResponse
import IoTEvents.ListInputsRequest
import IoTEvents.ListInputsResponse
import IoTEvents.ListTagsForResourceRequest
import IoTEvents.ListTagsForResourceResponse
import IoTEvents.PutLoggingOptionsRequest
import IoTEvents.TagResourceRequest
import IoTEvents.TagResourceResponse
import IoTEvents.UntagResourceRequest
import IoTEvents.UntagResourceResponse
import IoTEvents.UpdateDetectorModelRequest
import IoTEvents.UpdateDetectorModelResponse
import IoTEvents.UpdateInputRequest
import IoTEvents.UpdateInputResponse
import IoTEvents.SetVariableAction
import IoTEvents.SNSTopicPublishAction
import IoTEvents.IotTopicPublishAction
import IoTEvents.SetTimerAction
import IoTEvents.ClearTimerAction
import IoTEvents.ResetTimerAction
import IoTEvents.LambdaAction
import IoTEvents.IotEventsAction
import IoTEvents.SqsAction
import IoTEvents.FirehoseAction
import IoTEvents.DetectorModelDefinition
import IoTEvents.DetectorModelConfiguration
import IoTEvents.InputDefinition
import IoTEvents.InputConfiguration
import IoTEvents.DetectorModel
import IoTEvents.Input
import IoTEvents.LoggingOptions
import IoTEvents.OnInputLifecycle
import IoTEvents.OnEnterLifecycle
import IoTEvents.OnExitLifecycle

typealias Actions = Array<Action>

typealias AmazonResourceName = String

typealias AttributeJsonPath = String

typealias Attributes = Array<Attribute>

typealias Condition = String

typealias DeliveryStreamName = String

typealias DetectorDebugOptions = Array<DetectorDebugOption>

typealias DetectorModelArn = String

typealias DetectorModelDescription = String

typealias DetectorModelName = String

typealias DetectorModelSummaries = Array<DetectorModelSummary>

typealias DetectorModelVersion = String

typealias DetectorModelVersionSummaries = Array<DetectorModelVersionSummary>

typealias EventName = String

typealias Events = Array<Event>

typealias FirehoseSeparator = String

typealias InputArn = String

typealias InputDescription = String

typealias InputName = String

typealias InputSummaries = Array<InputSummary>

typealias KeyValue = String

typealias LoggingEnabled = Boolean

typealias MQTTTopic = String

typealias MaxResults = Number

typealias NextToken = String

typealias QueueUrl = String

typealias Seconds = Number

typealias StateName = String

typealias States = Array<State>

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TimerName = String

typealias Timestamp = Date

typealias TransitionEvents = Array<TransitionEvent>

typealias UseBase64 = Boolean

typealias VariableName = String

typealias VariableValue = String

@JsModule("aws-sdk")
external open class IoTEvents(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & IoTEvents.Types.ClientConfiguration */
    open fun createDetectorModel(params: CreateDetectorModelRequest, callback: (err: AWSError, data: CreateDetectorModelResponse) -> Unit = definedExternally): Request<CreateDetectorModelResponse, AWSError>
    open fun createDetectorModel(callback: (err: AWSError, data: CreateDetectorModelResponse) -> Unit = definedExternally): Request<CreateDetectorModelResponse, AWSError>
    open fun createInput(params: CreateInputRequest, callback: (err: AWSError, data: CreateInputResponse) -> Unit = definedExternally): Request<CreateInputResponse, AWSError>
    open fun createInput(callback: (err: AWSError, data: CreateInputResponse) -> Unit = definedExternally): Request<CreateInputResponse, AWSError>
    open fun deleteDetectorModel(params: DeleteDetectorModelRequest, callback: (err: AWSError, data: DeleteDetectorModelResponse) -> Unit = definedExternally): Request<DeleteDetectorModelResponse, AWSError>
    open fun deleteDetectorModel(callback: (err: AWSError, data: DeleteDetectorModelResponse) -> Unit = definedExternally): Request<DeleteDetectorModelResponse, AWSError>
    open fun deleteInput(params: DeleteInputRequest, callback: (err: AWSError, data: DeleteInputResponse) -> Unit = definedExternally): Request<DeleteInputResponse, AWSError>
    open fun deleteInput(callback: (err: AWSError, data: DeleteInputResponse) -> Unit = definedExternally): Request<DeleteInputResponse, AWSError>
    open fun describeDetectorModel(params: DescribeDetectorModelRequest, callback: (err: AWSError, data: DescribeDetectorModelResponse) -> Unit = definedExternally): Request<DescribeDetectorModelResponse, AWSError>
    open fun describeDetectorModel(callback: (err: AWSError, data: DescribeDetectorModelResponse) -> Unit = definedExternally): Request<DescribeDetectorModelResponse, AWSError>
    open fun describeInput(params: DescribeInputRequest, callback: (err: AWSError, data: DescribeInputResponse) -> Unit = definedExternally): Request<DescribeInputResponse, AWSError>
    open fun describeInput(callback: (err: AWSError, data: DescribeInputResponse) -> Unit = definedExternally): Request<DescribeInputResponse, AWSError>
    open fun describeLoggingOptions(params: DescribeLoggingOptionsRequest, callback: (err: AWSError, data: DescribeLoggingOptionsResponse) -> Unit = definedExternally): Request<DescribeLoggingOptionsResponse, AWSError>
    open fun describeLoggingOptions(callback: (err: AWSError, data: DescribeLoggingOptionsResponse) -> Unit = definedExternally): Request<DescribeLoggingOptionsResponse, AWSError>
    open fun listDetectorModelVersions(params: ListDetectorModelVersionsRequest, callback: (err: AWSError, data: ListDetectorModelVersionsResponse) -> Unit = definedExternally): Request<ListDetectorModelVersionsResponse, AWSError>
    open fun listDetectorModelVersions(callback: (err: AWSError, data: ListDetectorModelVersionsResponse) -> Unit = definedExternally): Request<ListDetectorModelVersionsResponse, AWSError>
    open fun listDetectorModels(params: ListDetectorModelsRequest, callback: (err: AWSError, data: ListDetectorModelsResponse) -> Unit = definedExternally): Request<ListDetectorModelsResponse, AWSError>
    open fun listDetectorModels(callback: (err: AWSError, data: ListDetectorModelsResponse) -> Unit = definedExternally): Request<ListDetectorModelsResponse, AWSError>
    open fun listInputs(params: ListInputsRequest, callback: (err: AWSError, data: ListInputsResponse) -> Unit = definedExternally): Request<ListInputsResponse, AWSError>
    open fun listInputs(callback: (err: AWSError, data: ListInputsResponse) -> Unit = definedExternally): Request<ListInputsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putLoggingOptions(params: PutLoggingOptionsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putLoggingOptions(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateDetectorModel(params: UpdateDetectorModelRequest, callback: (err: AWSError, data: UpdateDetectorModelResponse) -> Unit = definedExternally): Request<UpdateDetectorModelResponse, AWSError>
    open fun updateDetectorModel(callback: (err: AWSError, data: UpdateDetectorModelResponse) -> Unit = definedExternally): Request<UpdateDetectorModelResponse, AWSError>
    open fun updateInput(params: UpdateInputRequest, callback: (err: AWSError, data: UpdateInputResponse) -> Unit = definedExternally): Request<UpdateInputResponse, AWSError>
    open fun updateInput(callback: (err: AWSError, data: UpdateInputResponse) -> Unit = definedExternally): Request<UpdateInputResponse, AWSError>
    interface Action {
        var setVariable: SetVariableAction?
            get() = definedExternally
            set(value) = definedExternally
        var sns: SNSTopicPublishAction?
            get() = definedExternally
            set(value) = definedExternally
        var iotTopicPublish: IotTopicPublishAction?
            get() = definedExternally
            set(value) = definedExternally
        var setTimer: SetTimerAction?
            get() = definedExternally
            set(value) = definedExternally
        var clearTimer: ClearTimerAction?
            get() = definedExternally
            set(value) = definedExternally
        var resetTimer: ResetTimerAction?
            get() = definedExternally
            set(value) = definedExternally
        var lambda: LambdaAction?
            get() = definedExternally
            set(value) = definedExternally
        var iotEvents: IotEventsAction?
            get() = definedExternally
            set(value) = definedExternally
        var sqs: SqsAction?
            get() = definedExternally
            set(value) = definedExternally
        var firehose: FirehoseAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Attribute {
        var jsonPath: AttributeJsonPath
    }
    interface ClearTimerAction {
        var timerName: TimerName
    }
    interface CreateDetectorModelRequest {
        var detectorModelName: DetectorModelName
        var detectorModelDefinition: DetectorModelDefinition
        var detectorModelDescription: DetectorModelDescription?
            get() = definedExternally
            set(value) = definedExternally
        var key: AttributeJsonPath?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: AmazonResourceName
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var evaluationMethod: String /* "BATCH" | "SERIAL" | String */
    }
    interface CreateDetectorModelResponse {
        var detectorModelConfiguration: DetectorModelConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInputRequest {
        var inputName: InputName
        var inputDescription: InputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var inputDefinition: InputDefinition
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInputResponse {
        var inputConfiguration: InputConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDetectorModelRequest {
        var detectorModelName: DetectorModelName
    }
    interface DeleteDetectorModelResponse
    interface DeleteInputRequest {
        var inputName: InputName
    }
    interface DeleteInputResponse
    interface DescribeDetectorModelRequest {
        var detectorModelName: DetectorModelName
        var detectorModelVersion: DetectorModelVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDetectorModelResponse {
        var detectorModel: DetectorModel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInputRequest {
        var inputName: InputName
    }
    interface DescribeInputResponse {
        var input: Input?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoggingOptionsRequest
    interface DescribeLoggingOptionsResponse {
        var loggingOptions: LoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectorDebugOption {
        var detectorModelName: DetectorModelName
        var keyValue: KeyValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectorModel {
        var detectorModelDefinition: DetectorModelDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var detectorModelConfiguration: DetectorModelConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectorModelConfiguration {
        var detectorModelName: DetectorModelName?
            get() = definedExternally
            set(value) = definedExternally
        var detectorModelVersion: DetectorModelVersion?
            get() = definedExternally
            set(value) = definedExternally
        var detectorModelDescription: DetectorModelDescription?
            get() = definedExternally
            set(value) = definedExternally
        var detectorModelArn: DetectorModelArn?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "ACTIVATING" | "INACTIVE" | "DEPRECATED" | "DRAFT" | "PAUSED" | "FAILED" | String */
        var key: AttributeJsonPath?
            get() = definedExternally
            set(value) = definedExternally
        var evaluationMethod: String /* "BATCH" | "SERIAL" | String */
    }
    interface DetectorModelDefinition {
        var states: States
        var initialStateName: StateName
    }
    interface DetectorModelSummary {
        var detectorModelName: DetectorModelName?
            get() = definedExternally
            set(value) = definedExternally
        var detectorModelDescription: DetectorModelDescription?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectorModelVersionSummary {
        var detectorModelName: DetectorModelName?
            get() = definedExternally
            set(value) = definedExternally
        var detectorModelVersion: DetectorModelVersion?
            get() = definedExternally
            set(value) = definedExternally
        var detectorModelArn: DetectorModelArn?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "ACTIVATING" | "INACTIVE" | "DEPRECATED" | "DRAFT" | "PAUSED" | "FAILED" | String */
        var evaluationMethod: String /* "BATCH" | "SERIAL" | String */
    }
    interface Event {
        var eventName: EventName
        var condition: Condition?
            get() = definedExternally
            set(value) = definedExternally
        var actions: Actions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FirehoseAction {
        var deliveryStreamName: DeliveryStreamName
        var separator: FirehoseSeparator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Input {
        var inputConfiguration: InputConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var inputDefinition: InputDefinition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputConfiguration {
        var inputName: InputName
        var inputDescription: InputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var inputArn: InputArn
        var creationTime: Timestamp
        var lastUpdateTime: Timestamp
        var status: String /* "CREATING" | "UPDATING" | "ACTIVE" | "DELETING" | String */
    }
    interface InputDefinition {
        var attributes: Attributes
    }
    interface InputSummary {
        var inputName: InputName?
            get() = definedExternally
            set(value) = definedExternally
        var inputDescription: InputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var inputArn: InputArn?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "UPDATING" | "ACTIVE" | "DELETING" | String */
    }
    interface IotEventsAction {
        var inputName: InputName
    }
    interface IotTopicPublishAction {
        var mqttTopic: MQTTTopic
    }
    interface LambdaAction {
        var functionArn: AmazonResourceName
    }
    interface ListDetectorModelVersionsRequest {
        var detectorModelName: DetectorModelName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDetectorModelVersionsResponse {
        var detectorModelVersionSummaries: DetectorModelVersionSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDetectorModelsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDetectorModelsResponse {
        var detectorModelSummaries: DetectorModelSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInputsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInputsResponse {
        var inputSummaries: InputSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: AmazonResourceName
    }
    interface ListTagsForResourceResponse {
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoggingOptions {
        var roleArn: AmazonResourceName
        var level: String /* "ERROR" | "INFO" | "DEBUG" | String */
        var enabled: LoggingEnabled
        var detectorDebugOptions: DetectorDebugOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OnEnterLifecycle {
        var events: Events?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OnExitLifecycle {
        var events: Events?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OnInputLifecycle {
        var events: Events?
            get() = definedExternally
            set(value) = definedExternally
        var transitionEvents: TransitionEvents?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutLoggingOptionsRequest {
        var loggingOptions: LoggingOptions
    }
    interface ResetTimerAction {
        var timerName: TimerName
    }
    interface SNSTopicPublishAction {
        var targetArn: AmazonResourceName
    }
    interface SetTimerAction {
        var timerName: TimerName
        var seconds: Seconds?
            get() = definedExternally
            set(value) = definedExternally
        var durationExpression: VariableValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetVariableAction {
        var variableName: VariableName
        var value: VariableValue
    }
    interface SqsAction {
        var queueUrl: QueueUrl
        var useBase64: UseBase64?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface State {
        var stateName: StateName
        var onInput: OnInputLifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var onEnter: OnEnterLifecycle?
            get() = definedExternally
            set(value) = definedExternally
        var onExit: OnExitLifecycle?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey
        var value: TagValue
    }
    interface TagResourceRequest {
        var resourceArn: AmazonResourceName
        var tags: Tags
    }
    interface TagResourceResponse
    interface TransitionEvent {
        var eventName: EventName
        var condition: Condition
        var actions: Actions?
            get() = definedExternally
            set(value) = definedExternally
        var nextState: StateName
    }
    interface UntagResourceRequest {
        var resourceArn: AmazonResourceName
        var tagKeys: TagKeys
    }
    interface UntagResourceResponse
    interface UpdateDetectorModelRequest {
        var detectorModelName: DetectorModelName
        var detectorModelDefinition: DetectorModelDefinition
        var detectorModelDescription: DetectorModelDescription?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: AmazonResourceName
        var evaluationMethod: String /* "BATCH" | "SERIAL" | String */
    }
    interface UpdateDetectorModelResponse {
        var detectorModelConfiguration: DetectorModelConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInputRequest {
        var inputName: InputName
        var inputDescription: InputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var inputDefinition: InputDefinition
    }
    interface UpdateInputResponse {
        var inputConfiguration: InputConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-07-27" | "latest" | String */
    }
}