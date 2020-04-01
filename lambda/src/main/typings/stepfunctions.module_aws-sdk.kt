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
import StepFunctions.ActivityListItem
import StepFunctions.ExecutionListItem
import StepFunctions.HistoryEvent
import StepFunctions.LogDestination
import StepFunctions.StateMachineListItem
import StepFunctions.Tag
import StepFunctions.CreateActivityInput
import StepFunctions.CreateActivityOutput
import StepFunctions.CreateStateMachineInput
import StepFunctions.CreateStateMachineOutput
import StepFunctions.DeleteActivityInput
import StepFunctions.DeleteActivityOutput
import StepFunctions.DeleteStateMachineInput
import StepFunctions.DeleteStateMachineOutput
import StepFunctions.DescribeActivityInput
import StepFunctions.DescribeActivityOutput
import StepFunctions.DescribeExecutionInput
import StepFunctions.DescribeExecutionOutput
import StepFunctions.DescribeStateMachineInput
import StepFunctions.DescribeStateMachineOutput
import StepFunctions.DescribeStateMachineForExecutionInput
import StepFunctions.DescribeStateMachineForExecutionOutput
import StepFunctions.GetActivityTaskInput
import StepFunctions.GetActivityTaskOutput
import StepFunctions.GetExecutionHistoryInput
import StepFunctions.GetExecutionHistoryOutput
import StepFunctions.ListActivitiesInput
import StepFunctions.ListActivitiesOutput
import StepFunctions.ListExecutionsInput
import StepFunctions.ListExecutionsOutput
import StepFunctions.ListStateMachinesInput
import StepFunctions.ListStateMachinesOutput
import StepFunctions.ListTagsForResourceInput
import StepFunctions.ListTagsForResourceOutput
import StepFunctions.SendTaskFailureInput
import StepFunctions.SendTaskFailureOutput
import StepFunctions.SendTaskHeartbeatInput
import StepFunctions.SendTaskHeartbeatOutput
import StepFunctions.SendTaskSuccessInput
import StepFunctions.SendTaskSuccessOutput
import StepFunctions.StartExecutionInput
import StepFunctions.StartExecutionOutput
import StepFunctions.StopExecutionInput
import StepFunctions.StopExecutionOutput
import StepFunctions.TagResourceInput
import StepFunctions.TagResourceOutput
import StepFunctions.UntagResourceInput
import StepFunctions.UntagResourceOutput
import StepFunctions.UpdateStateMachineInput
import StepFunctions.UpdateStateMachineOutput
import StepFunctions.LoggingConfiguration
import StepFunctions.ActivityFailedEventDetails
import StepFunctions.ActivityScheduleFailedEventDetails
import StepFunctions.ActivityScheduledEventDetails
import StepFunctions.ActivityStartedEventDetails
import StepFunctions.ActivitySucceededEventDetails
import StepFunctions.ActivityTimedOutEventDetails
import StepFunctions.TaskFailedEventDetails
import StepFunctions.TaskScheduledEventDetails
import StepFunctions.TaskStartFailedEventDetails
import StepFunctions.TaskStartedEventDetails
import StepFunctions.TaskSubmitFailedEventDetails
import StepFunctions.TaskSubmittedEventDetails
import StepFunctions.TaskSucceededEventDetails
import StepFunctions.TaskTimedOutEventDetails
import StepFunctions.ExecutionFailedEventDetails
import StepFunctions.ExecutionStartedEventDetails
import StepFunctions.ExecutionSucceededEventDetails
import StepFunctions.ExecutionAbortedEventDetails
import StepFunctions.ExecutionTimedOutEventDetails
import StepFunctions.MapStateStartedEventDetails
import StepFunctions.MapIterationEventDetails
import StepFunctions.LambdaFunctionFailedEventDetails
import StepFunctions.LambdaFunctionScheduleFailedEventDetails
import StepFunctions.LambdaFunctionScheduledEventDetails
import StepFunctions.LambdaFunctionStartFailedEventDetails
import StepFunctions.LambdaFunctionSucceededEventDetails
import StepFunctions.LambdaFunctionTimedOutEventDetails
import StepFunctions.StateEnteredEventDetails
import StepFunctions.StateExitedEventDetails
import StepFunctions.CloudWatchLogsLogGroup

typealias ActivityList = Array<ActivityListItem>

typealias Arn = String

typealias ConnectorParameters = String

typealias Definition = String

typealias EventId = Number

typealias ExecutionList = Array<ExecutionListItem>

typealias HistoryEventList = Array<HistoryEvent>

typealias Identity = String

typealias IncludeExecutionData = Boolean

typealias ListExecutionsPageToken = String

typealias LogDestinationList = Array<LogDestination>

typealias Name = String

typealias PageSize = Number

typealias PageToken = String

typealias ReverseOrder = Boolean

typealias SensitiveCause = String

typealias SensitiveData = String

typealias SensitiveDataJobInput = String

typealias SensitiveError = String

typealias StateMachineList = Array<StateMachineListItem>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TaskToken = String

typealias TimeoutInSeconds = Number

typealias Timestamp = Date

typealias UnsignedInteger = Number

@JsModule("aws-sdk")
external open class StepFunctions(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & StepFunctions.Types.ClientConfiguration */
    open fun createActivity(params: CreateActivityInput, callback: (err: AWSError, data: CreateActivityOutput) -> Unit = definedExternally): Request<CreateActivityOutput, AWSError>
    open fun createActivity(callback: (err: AWSError, data: CreateActivityOutput) -> Unit = definedExternally): Request<CreateActivityOutput, AWSError>
    open fun createStateMachine(params: CreateStateMachineInput, callback: (err: AWSError, data: CreateStateMachineOutput) -> Unit = definedExternally): Request<CreateStateMachineOutput, AWSError>
    open fun createStateMachine(callback: (err: AWSError, data: CreateStateMachineOutput) -> Unit = definedExternally): Request<CreateStateMachineOutput, AWSError>
    open fun deleteActivity(params: DeleteActivityInput, callback: (err: AWSError, data: DeleteActivityOutput) -> Unit = definedExternally): Request<DeleteActivityOutput, AWSError>
    open fun deleteActivity(callback: (err: AWSError, data: DeleteActivityOutput) -> Unit = definedExternally): Request<DeleteActivityOutput, AWSError>
    open fun deleteStateMachine(params: DeleteStateMachineInput, callback: (err: AWSError, data: DeleteStateMachineOutput) -> Unit = definedExternally): Request<DeleteStateMachineOutput, AWSError>
    open fun deleteStateMachine(callback: (err: AWSError, data: DeleteStateMachineOutput) -> Unit = definedExternally): Request<DeleteStateMachineOutput, AWSError>
    open fun describeActivity(params: DescribeActivityInput, callback: (err: AWSError, data: DescribeActivityOutput) -> Unit = definedExternally): Request<DescribeActivityOutput, AWSError>
    open fun describeActivity(callback: (err: AWSError, data: DescribeActivityOutput) -> Unit = definedExternally): Request<DescribeActivityOutput, AWSError>
    open fun describeExecution(params: DescribeExecutionInput, callback: (err: AWSError, data: DescribeExecutionOutput) -> Unit = definedExternally): Request<DescribeExecutionOutput, AWSError>
    open fun describeExecution(callback: (err: AWSError, data: DescribeExecutionOutput) -> Unit = definedExternally): Request<DescribeExecutionOutput, AWSError>
    open fun describeStateMachine(params: DescribeStateMachineInput, callback: (err: AWSError, data: DescribeStateMachineOutput) -> Unit = definedExternally): Request<DescribeStateMachineOutput, AWSError>
    open fun describeStateMachine(callback: (err: AWSError, data: DescribeStateMachineOutput) -> Unit = definedExternally): Request<DescribeStateMachineOutput, AWSError>
    open fun describeStateMachineForExecution(params: DescribeStateMachineForExecutionInput, callback: (err: AWSError, data: DescribeStateMachineForExecutionOutput) -> Unit = definedExternally): Request<DescribeStateMachineForExecutionOutput, AWSError>
    open fun describeStateMachineForExecution(callback: (err: AWSError, data: DescribeStateMachineForExecutionOutput) -> Unit = definedExternally): Request<DescribeStateMachineForExecutionOutput, AWSError>
    open fun getActivityTask(params: GetActivityTaskInput, callback: (err: AWSError, data: GetActivityTaskOutput) -> Unit = definedExternally): Request<GetActivityTaskOutput, AWSError>
    open fun getActivityTask(callback: (err: AWSError, data: GetActivityTaskOutput) -> Unit = definedExternally): Request<GetActivityTaskOutput, AWSError>
    open fun getExecutionHistory(params: GetExecutionHistoryInput, callback: (err: AWSError, data: GetExecutionHistoryOutput) -> Unit = definedExternally): Request<GetExecutionHistoryOutput, AWSError>
    open fun getExecutionHistory(callback: (err: AWSError, data: GetExecutionHistoryOutput) -> Unit = definedExternally): Request<GetExecutionHistoryOutput, AWSError>
    open fun listActivities(params: ListActivitiesInput, callback: (err: AWSError, data: ListActivitiesOutput) -> Unit = definedExternally): Request<ListActivitiesOutput, AWSError>
    open fun listActivities(callback: (err: AWSError, data: ListActivitiesOutput) -> Unit = definedExternally): Request<ListActivitiesOutput, AWSError>
    open fun listExecutions(params: ListExecutionsInput, callback: (err: AWSError, data: ListExecutionsOutput) -> Unit = definedExternally): Request<ListExecutionsOutput, AWSError>
    open fun listExecutions(callback: (err: AWSError, data: ListExecutionsOutput) -> Unit = definedExternally): Request<ListExecutionsOutput, AWSError>
    open fun listStateMachines(params: ListStateMachinesInput, callback: (err: AWSError, data: ListStateMachinesOutput) -> Unit = definedExternally): Request<ListStateMachinesOutput, AWSError>
    open fun listStateMachines(callback: (err: AWSError, data: ListStateMachinesOutput) -> Unit = definedExternally): Request<ListStateMachinesOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun sendTaskFailure(params: SendTaskFailureInput, callback: (err: AWSError, data: SendTaskFailureOutput) -> Unit = definedExternally): Request<SendTaskFailureOutput, AWSError>
    open fun sendTaskFailure(callback: (err: AWSError, data: SendTaskFailureOutput) -> Unit = definedExternally): Request<SendTaskFailureOutput, AWSError>
    open fun sendTaskHeartbeat(params: SendTaskHeartbeatInput, callback: (err: AWSError, data: SendTaskHeartbeatOutput) -> Unit = definedExternally): Request<SendTaskHeartbeatOutput, AWSError>
    open fun sendTaskHeartbeat(callback: (err: AWSError, data: SendTaskHeartbeatOutput) -> Unit = definedExternally): Request<SendTaskHeartbeatOutput, AWSError>
    open fun sendTaskSuccess(params: SendTaskSuccessInput, callback: (err: AWSError, data: SendTaskSuccessOutput) -> Unit = definedExternally): Request<SendTaskSuccessOutput, AWSError>
    open fun sendTaskSuccess(callback: (err: AWSError, data: SendTaskSuccessOutput) -> Unit = definedExternally): Request<SendTaskSuccessOutput, AWSError>
    open fun startExecution(params: StartExecutionInput, callback: (err: AWSError, data: StartExecutionOutput) -> Unit = definedExternally): Request<StartExecutionOutput, AWSError>
    open fun startExecution(callback: (err: AWSError, data: StartExecutionOutput) -> Unit = definedExternally): Request<StartExecutionOutput, AWSError>
    open fun stopExecution(params: StopExecutionInput, callback: (err: AWSError, data: StopExecutionOutput) -> Unit = definedExternally): Request<StopExecutionOutput, AWSError>
    open fun stopExecution(callback: (err: AWSError, data: StopExecutionOutput) -> Unit = definedExternally): Request<StopExecutionOutput, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun updateStateMachine(params: UpdateStateMachineInput, callback: (err: AWSError, data: UpdateStateMachineOutput) -> Unit = definedExternally): Request<UpdateStateMachineOutput, AWSError>
    open fun updateStateMachine(callback: (err: AWSError, data: UpdateStateMachineOutput) -> Unit = definedExternally): Request<UpdateStateMachineOutput, AWSError>
    interface ActivityFailedEventDetails {
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityListItem {
        var activityArn: Arn
        var name: Name
        var creationDate: Timestamp
    }
    interface ActivityScheduleFailedEventDetails {
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityScheduledEventDetails {
        var resource: Arn
        var input: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutInSeconds: TimeoutInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var heartbeatInSeconds: TimeoutInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityStartedEventDetails {
        var workerName: Identity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivitySucceededEventDetails {
        var output: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityTimedOutEventDetails {
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchLogsLogGroup {
        var logGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateActivityInput {
        var name: Name
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateActivityOutput {
        var activityArn: Arn
        var creationDate: Timestamp
    }
    interface CreateStateMachineInput {
        var name: Name
        var definition: Definition
        var roleArn: Arn
        var type: String /* "STANDARD" | "EXPRESS" | String */
        var loggingConfiguration: LoggingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStateMachineOutput {
        var stateMachineArn: Arn
        var creationDate: Timestamp
    }
    interface DeleteActivityInput {
        var activityArn: Arn
    }
    interface DeleteActivityOutput
    interface DeleteStateMachineInput {
        var stateMachineArn: Arn
    }
    interface DeleteStateMachineOutput
    interface DescribeActivityInput {
        var activityArn: Arn
    }
    interface DescribeActivityOutput {
        var activityArn: Arn
        var name: Name
        var creationDate: Timestamp
    }
    interface DescribeExecutionInput {
        var executionArn: Arn
    }
    interface DescribeExecutionOutput {
        var executionArn: Arn
        var stateMachineArn: Arn
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "RUNNING" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "ABORTED" | String */
        var startDate: Timestamp
        var stopDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var input: SensitiveData
        var output: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStateMachineForExecutionInput {
        var executionArn: Arn
    }
    interface DescribeStateMachineForExecutionOutput {
        var stateMachineArn: Arn
        var name: Name
        var definition: Definition
        var roleArn: Arn
        var updateDate: Timestamp
        var loggingConfiguration: LoggingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStateMachineInput {
        var stateMachineArn: Arn
    }
    interface DescribeStateMachineOutput {
        var stateMachineArn: Arn
        var name: Name
        var status: String /* "ACTIVE" | "DELETING" | String */
        var definition: Definition
        var roleArn: Arn
        var type: String /* "STANDARD" | "EXPRESS" | String */
        var creationDate: Timestamp
        var loggingConfiguration: LoggingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionAbortedEventDetails {
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionFailedEventDetails {
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionListItem {
        var executionArn: Arn
        var stateMachineArn: Arn
        var name: Name
        var status: String /* "RUNNING" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "ABORTED" | String */
        var startDate: Timestamp
        var stopDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionStartedEventDetails {
        var input: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionSucceededEventDetails {
        var output: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionTimedOutEventDetails {
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetActivityTaskInput {
        var activityArn: Arn
        var workerName: Name?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetActivityTaskOutput {
        var taskToken: TaskToken?
            get() = definedExternally
            set(value) = definedExternally
        var input: SensitiveDataJobInput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetExecutionHistoryInput {
        var executionArn: Arn
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var reverseOrder: ReverseOrder?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetExecutionHistoryOutput {
        var events: HistoryEventList
        var nextToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HistoryEvent {
        var timestamp: Timestamp
        var type: String /* "ActivityFailed" | "ActivityScheduled" | "ActivityScheduleFailed" | "ActivityStarted" | "ActivitySucceeded" | "ActivityTimedOut" | "ChoiceStateEntered" | "ChoiceStateExited" | "ExecutionAborted" | "ExecutionFailed" | "ExecutionStarted" | "ExecutionSucceeded" | "ExecutionTimedOut" | "FailStateEntered" | "LambdaFunctionFailed" | "LambdaFunctionScheduled" | "LambdaFunctionScheduleFailed" | "LambdaFunctionStarted" | "LambdaFunctionStartFailed" | "LambdaFunctionSucceeded" | "LambdaFunctionTimedOut" | "MapIterationAborted" | "MapIterationFailed" | "MapIterationStarted" | "MapIterationSucceeded" | "MapStateAborted" | "MapStateEntered" | "MapStateExited" | "MapStateFailed" | "MapStateStarted" | "MapStateSucceeded" | "ParallelStateAborted" | "ParallelStateEntered" | "ParallelStateExited" | "ParallelStateFailed" | "ParallelStateStarted" | "ParallelStateSucceeded" | "PassStateEntered" | "PassStateExited" | "SucceedStateEntered" | "SucceedStateExited" | "TaskFailed" | "TaskScheduled" | "TaskStarted" | "TaskStartFailed" | "TaskStateAborted" | "TaskStateEntered" | "TaskStateExited" | "TaskSubmitFailed" | "TaskSubmitted" | "TaskSucceeded" | "TaskTimedOut" | "WaitStateAborted" | "WaitStateEntered" | "WaitStateExited" | String */
        var id: EventId
        var previousEventId: EventId?
            get() = definedExternally
            set(value) = definedExternally
        var activityFailedEventDetails: ActivityFailedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var activityScheduleFailedEventDetails: ActivityScheduleFailedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var activityScheduledEventDetails: ActivityScheduledEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var activityStartedEventDetails: ActivityStartedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var activitySucceededEventDetails: ActivitySucceededEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var activityTimedOutEventDetails: ActivityTimedOutEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var taskFailedEventDetails: TaskFailedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var taskScheduledEventDetails: TaskScheduledEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var taskStartFailedEventDetails: TaskStartFailedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var taskStartedEventDetails: TaskStartedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var taskSubmitFailedEventDetails: TaskSubmitFailedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var taskSubmittedEventDetails: TaskSubmittedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var taskSucceededEventDetails: TaskSucceededEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var taskTimedOutEventDetails: TaskTimedOutEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var executionFailedEventDetails: ExecutionFailedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var executionStartedEventDetails: ExecutionStartedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var executionSucceededEventDetails: ExecutionSucceededEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var executionAbortedEventDetails: ExecutionAbortedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var executionTimedOutEventDetails: ExecutionTimedOutEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var mapStateStartedEventDetails: MapStateStartedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var mapIterationStartedEventDetails: MapIterationEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var mapIterationSucceededEventDetails: MapIterationEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var mapIterationFailedEventDetails: MapIterationEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var mapIterationAbortedEventDetails: MapIterationEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionFailedEventDetails: LambdaFunctionFailedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionScheduleFailedEventDetails: LambdaFunctionScheduleFailedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionScheduledEventDetails: LambdaFunctionScheduledEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionStartFailedEventDetails: LambdaFunctionStartFailedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionSucceededEventDetails: LambdaFunctionSucceededEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionTimedOutEventDetails: LambdaFunctionTimedOutEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var stateEnteredEventDetails: StateEnteredEventDetails?
            get() = definedExternally
            set(value) = definedExternally
        var stateExitedEventDetails: StateExitedEventDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaFunctionFailedEventDetails {
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaFunctionScheduleFailedEventDetails {
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaFunctionScheduledEventDetails {
        var resource: Arn
        var input: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutInSeconds: TimeoutInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaFunctionStartFailedEventDetails {
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaFunctionSucceededEventDetails {
        var output: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaFunctionTimedOutEventDetails {
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListActivitiesInput {
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListActivitiesOutput {
        var activities: ActivityList
        var nextToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListExecutionsInput {
        var stateMachineArn: Arn
        var statusFilter: String /* "RUNNING" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "ABORTED" | String */
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: ListExecutionsPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListExecutionsOutput {
        var executions: ExecutionList
        var nextToken: ListExecutionsPageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStateMachinesInput {
        var maxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStateMachinesOutput {
        var stateMachines: StateMachineList
        var nextToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var resourceArn: Arn
    }
    interface ListTagsForResourceOutput {
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogDestination {
        var cloudWatchLogsLogGroup: CloudWatchLogsLogGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoggingConfiguration {
        var level: String /* "ALL" | "ERROR" | "FATAL" | "OFF" | String */
        var includeExecutionData: IncludeExecutionData?
            get() = definedExternally
            set(value) = definedExternally
        var destinations: LogDestinationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MapIterationEventDetails {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var index: UnsignedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MapStateStartedEventDetails {
        var length: UnsignedInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendTaskFailureInput {
        var taskToken: TaskToken
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendTaskFailureOutput
    interface SendTaskHeartbeatInput {
        var taskToken: TaskToken
    }
    interface SendTaskHeartbeatOutput
    interface SendTaskSuccessInput {
        var taskToken: TaskToken
        var output: SensitiveData
    }
    interface SendTaskSuccessOutput
    interface StartExecutionInput {
        var stateMachineArn: Arn
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var input: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartExecutionOutput {
        var executionArn: Arn
        var startDate: Timestamp
    }
    interface StateEnteredEventDetails {
        var name: Name
        var input: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StateExitedEventDetails {
        var name: Name
        var output: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StateMachineListItem {
        var stateMachineArn: Arn
        var name: Name
        var type: String /* "STANDARD" | "EXPRESS" | String */
        var creationDate: Timestamp
    }
    interface StopExecutionInput {
        var executionArn: Arn
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopExecutionOutput {
        var stopDate: Timestamp
    }
    interface Tag {
        var key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceInput {
        var resourceArn: Arn
        var tags: TagList
    }
    interface TagResourceOutput
    interface TaskFailedEventDetails {
        var resourceType: Name
        var resource: Name
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskScheduledEventDetails {
        var resourceType: Name
        var resource: Name
        var region: Name
        var parameters: ConnectorParameters
        var timeoutInSeconds: TimeoutInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskStartFailedEventDetails {
        var resourceType: Name
        var resource: Name
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskStartedEventDetails {
        var resourceType: Name
        var resource: Name
    }
    interface TaskSubmitFailedEventDetails {
        var resourceType: Name
        var resource: Name
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskSubmittedEventDetails {
        var resourceType: Name
        var resource: Name
        var output: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskSucceededEventDetails {
        var resourceType: Name
        var resource: Name
        var output: SensitiveData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskTimedOutEventDetails {
        var resourceType: Name
        var resource: Name
        var error: SensitiveError?
            get() = definedExternally
            set(value) = definedExternally
        var cause: SensitiveCause?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceInput {
        var resourceArn: Arn
        var tagKeys: TagKeyList
    }
    interface UntagResourceOutput
    interface UpdateStateMachineInput {
        var stateMachineArn: Arn
        var definition: Definition?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var loggingConfiguration: LoggingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStateMachineOutput {
        var updateDate: Timestamp
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-11-23" | "latest" | String */
    }
}