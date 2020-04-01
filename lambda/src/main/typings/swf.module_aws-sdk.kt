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
import SWF.ActivityTypeInfo
import SWF.Decision
import SWF.DomainInfo
import SWF.HistoryEvent
import SWF.ResourceTag
import SWF.WorkflowExecutionInfo
import SWF.WorkflowTypeInfo
import SWF.CountClosedWorkflowExecutionsInput
import SWF.WorkflowExecutionCount
import SWF.CountOpenWorkflowExecutionsInput
import SWF.CountPendingActivityTasksInput
import SWF.PendingTaskCount
import SWF.CountPendingDecisionTasksInput
import SWF.DeprecateActivityTypeInput
import SWF.DeprecateDomainInput
import SWF.DeprecateWorkflowTypeInput
import SWF.DescribeActivityTypeInput
import SWF.ActivityTypeDetail
import SWF.DescribeDomainInput
import SWF.DomainDetail
import SWF.DescribeWorkflowExecutionInput
import SWF.WorkflowExecutionDetail
import SWF.DescribeWorkflowTypeInput
import SWF.WorkflowTypeDetail
import SWF.GetWorkflowExecutionHistoryInput
import SWF.History
import SWF.ListActivityTypesInput
import SWF.ActivityTypeInfos
import SWF.ListClosedWorkflowExecutionsInput
import SWF.WorkflowExecutionInfos
import SWF.ListDomainsInput
import SWF.DomainInfos
import SWF.ListOpenWorkflowExecutionsInput
import SWF.ListTagsForResourceInput
import SWF.ListTagsForResourceOutput
import SWF.ListWorkflowTypesInput
import SWF.WorkflowTypeInfos
import SWF.PollForActivityTaskInput
import SWF.ActivityTask
import SWF.PollForDecisionTaskInput
import SWF.DecisionTask
import SWF.RecordActivityTaskHeartbeatInput
import SWF.ActivityTaskStatus
import SWF.RegisterActivityTypeInput
import SWF.RegisterDomainInput
import SWF.RegisterWorkflowTypeInput
import SWF.RequestCancelWorkflowExecutionInput
import SWF.RespondActivityTaskCanceledInput
import SWF.RespondActivityTaskCompletedInput
import SWF.RespondActivityTaskFailedInput
import SWF.RespondDecisionTaskCompletedInput
import SWF.SignalWorkflowExecutionInput
import SWF.StartWorkflowExecutionInput
import SWF.Run
import SWF.TagResourceInput
import SWF.TerminateWorkflowExecutionInput
import SWF.UndeprecateActivityTypeInput
import SWF.UndeprecateDomainInput
import SWF.UndeprecateWorkflowTypeInput
import SWF.UntagResourceInput
import SWF.WorkflowExecution
import SWF.ActivityType
import SWF.TaskList
import SWF.ActivityTypeConfiguration
import SWF.WorkflowType
import SWF.ExecutionTimeFilter
import SWF.WorkflowExecutionFilter
import SWF.WorkflowTypeFilter
import SWF.TagFilter
import SWF.CloseStatusFilter
import SWF.ScheduleActivityTaskDecisionAttributes
import SWF.RequestCancelActivityTaskDecisionAttributes
import SWF.CompleteWorkflowExecutionDecisionAttributes
import SWF.FailWorkflowExecutionDecisionAttributes
import SWF.CancelWorkflowExecutionDecisionAttributes
import SWF.ContinueAsNewWorkflowExecutionDecisionAttributes
import SWF.RecordMarkerDecisionAttributes
import SWF.StartTimerDecisionAttributes
import SWF.CancelTimerDecisionAttributes
import SWF.SignalExternalWorkflowExecutionDecisionAttributes
import SWF.RequestCancelExternalWorkflowExecutionDecisionAttributes
import SWF.StartChildWorkflowExecutionDecisionAttributes
import SWF.ScheduleLambdaFunctionDecisionAttributes
import SWF.DomainConfiguration
import SWF.WorkflowExecutionStartedEventAttributes
import SWF.WorkflowExecutionCompletedEventAttributes
import SWF.CompleteWorkflowExecutionFailedEventAttributes
import SWF.WorkflowExecutionFailedEventAttributes
import SWF.FailWorkflowExecutionFailedEventAttributes
import SWF.WorkflowExecutionTimedOutEventAttributes
import SWF.WorkflowExecutionCanceledEventAttributes
import SWF.CancelWorkflowExecutionFailedEventAttributes
import SWF.WorkflowExecutionContinuedAsNewEventAttributes
import SWF.ContinueAsNewWorkflowExecutionFailedEventAttributes
import SWF.WorkflowExecutionTerminatedEventAttributes
import SWF.WorkflowExecutionCancelRequestedEventAttributes
import SWF.DecisionTaskScheduledEventAttributes
import SWF.DecisionTaskStartedEventAttributes
import SWF.DecisionTaskCompletedEventAttributes
import SWF.DecisionTaskTimedOutEventAttributes
import SWF.ActivityTaskScheduledEventAttributes
import SWF.ActivityTaskStartedEventAttributes
import SWF.ActivityTaskCompletedEventAttributes
import SWF.ActivityTaskFailedEventAttributes
import SWF.ActivityTaskTimedOutEventAttributes
import SWF.ActivityTaskCanceledEventAttributes
import SWF.ActivityTaskCancelRequestedEventAttributes
import SWF.WorkflowExecutionSignaledEventAttributes
import SWF.MarkerRecordedEventAttributes
import SWF.RecordMarkerFailedEventAttributes
import SWF.TimerStartedEventAttributes
import SWF.TimerFiredEventAttributes
import SWF.TimerCanceledEventAttributes
import SWF.StartChildWorkflowExecutionInitiatedEventAttributes
import SWF.ChildWorkflowExecutionStartedEventAttributes
import SWF.ChildWorkflowExecutionCompletedEventAttributes
import SWF.ChildWorkflowExecutionFailedEventAttributes
import SWF.ChildWorkflowExecutionTimedOutEventAttributes
import SWF.ChildWorkflowExecutionCanceledEventAttributes
import SWF.ChildWorkflowExecutionTerminatedEventAttributes
import SWF.SignalExternalWorkflowExecutionInitiatedEventAttributes
import SWF.ExternalWorkflowExecutionSignaledEventAttributes
import SWF.SignalExternalWorkflowExecutionFailedEventAttributes
import SWF.ExternalWorkflowExecutionCancelRequestedEventAttributes
import SWF.RequestCancelExternalWorkflowExecutionInitiatedEventAttributes
import SWF.RequestCancelExternalWorkflowExecutionFailedEventAttributes
import SWF.ScheduleActivityTaskFailedEventAttributes
import SWF.RequestCancelActivityTaskFailedEventAttributes
import SWF.StartTimerFailedEventAttributes
import SWF.CancelTimerFailedEventAttributes
import SWF.StartChildWorkflowExecutionFailedEventAttributes
import SWF.LambdaFunctionScheduledEventAttributes
import SWF.LambdaFunctionStartedEventAttributes
import SWF.LambdaFunctionCompletedEventAttributes
import SWF.LambdaFunctionFailedEventAttributes
import SWF.LambdaFunctionTimedOutEventAttributes
import SWF.ScheduleLambdaFunctionFailedEventAttributes
import SWF.StartLambdaFunctionFailedEventAttributes
import SWF.WorkflowExecutionConfiguration
import SWF.WorkflowExecutionOpenCounts
import SWF.WorkflowTypeConfiguration

typealias ActivityId = String

typealias ActivityTypeInfoList = Array<ActivityTypeInfo>

typealias Arn = String

typealias Canceled = Boolean

typealias CauseMessage = String

typealias Count = Number

typealias Data = String

typealias DecisionList = Array<Decision>

typealias Description = String

typealias DomainInfoList = Array<DomainInfo>

typealias DomainName = String

typealias DurationInDays = String

typealias DurationInSeconds = String

typealias DurationInSecondsOptional = String

typealias EventId = Number

typealias FailureReason = String

typealias FunctionId = String

typealias FunctionInput = String

typealias FunctionName = String

typealias HistoryEventList = Array<HistoryEvent>

typealias Identity = String

typealias LimitedData = String

typealias MarkerName = String

typealias Name = String

typealias OpenDecisionTasksCount = Number

typealias PageSize = Number

typealias PageToken = String

typealias ResourceTagKey = String

typealias ResourceTagKeyList = Array<ResourceTagKey>

typealias ResourceTagList = Array<ResourceTag>

typealias ResourceTagValue = String

typealias ReverseOrder = Boolean

typealias SignalName = String

typealias Tag = String

typealias TagList = Array<Tag>

typealias TaskPriority = String

typealias TaskToken = String

typealias TerminateReason = String

typealias TimerId = String

typealias Timestamp = Date

typealias Truncated = Boolean

typealias Version = String

typealias VersionOptional = String

typealias WorkflowExecutionInfoList = Array<WorkflowExecutionInfo>

typealias WorkflowId = String

typealias WorkflowRunId = String

typealias WorkflowRunIdOptional = String

typealias WorkflowTypeInfoList = Array<WorkflowTypeInfo>

@JsModule("aws-sdk")
external open class SWF(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SWF.Types.ClientConfiguration */
    open fun countClosedWorkflowExecutions(params: CountClosedWorkflowExecutionsInput, callback: (err: AWSError, data: WorkflowExecutionCount) -> Unit = definedExternally): Request<WorkflowExecutionCount, AWSError>
    open fun countClosedWorkflowExecutions(callback: (err: AWSError, data: WorkflowExecutionCount) -> Unit = definedExternally): Request<WorkflowExecutionCount, AWSError>
    open fun countOpenWorkflowExecutions(params: CountOpenWorkflowExecutionsInput, callback: (err: AWSError, data: WorkflowExecutionCount) -> Unit = definedExternally): Request<WorkflowExecutionCount, AWSError>
    open fun countOpenWorkflowExecutions(callback: (err: AWSError, data: WorkflowExecutionCount) -> Unit = definedExternally): Request<WorkflowExecutionCount, AWSError>
    open fun countPendingActivityTasks(params: CountPendingActivityTasksInput, callback: (err: AWSError, data: PendingTaskCount) -> Unit = definedExternally): Request<PendingTaskCount, AWSError>
    open fun countPendingActivityTasks(callback: (err: AWSError, data: PendingTaskCount) -> Unit = definedExternally): Request<PendingTaskCount, AWSError>
    open fun countPendingDecisionTasks(params: CountPendingDecisionTasksInput, callback: (err: AWSError, data: PendingTaskCount) -> Unit = definedExternally): Request<PendingTaskCount, AWSError>
    open fun countPendingDecisionTasks(callback: (err: AWSError, data: PendingTaskCount) -> Unit = definedExternally): Request<PendingTaskCount, AWSError>
    open fun deprecateActivityType(params: DeprecateActivityTypeInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deprecateActivityType(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deprecateDomain(params: DeprecateDomainInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deprecateDomain(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deprecateWorkflowType(params: DeprecateWorkflowTypeInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deprecateWorkflowType(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeActivityType(params: DescribeActivityTypeInput, callback: (err: AWSError, data: ActivityTypeDetail) -> Unit = definedExternally): Request<ActivityTypeDetail, AWSError>
    open fun describeActivityType(callback: (err: AWSError, data: ActivityTypeDetail) -> Unit = definedExternally): Request<ActivityTypeDetail, AWSError>
    open fun describeDomain(params: DescribeDomainInput, callback: (err: AWSError, data: DomainDetail) -> Unit = definedExternally): Request<DomainDetail, AWSError>
    open fun describeDomain(callback: (err: AWSError, data: DomainDetail) -> Unit = definedExternally): Request<DomainDetail, AWSError>
    open fun describeWorkflowExecution(params: DescribeWorkflowExecutionInput, callback: (err: AWSError, data: WorkflowExecutionDetail) -> Unit = definedExternally): Request<WorkflowExecutionDetail, AWSError>
    open fun describeWorkflowExecution(callback: (err: AWSError, data: WorkflowExecutionDetail) -> Unit = definedExternally): Request<WorkflowExecutionDetail, AWSError>
    open fun describeWorkflowType(params: DescribeWorkflowTypeInput, callback: (err: AWSError, data: WorkflowTypeDetail) -> Unit = definedExternally): Request<WorkflowTypeDetail, AWSError>
    open fun describeWorkflowType(callback: (err: AWSError, data: WorkflowTypeDetail) -> Unit = definedExternally): Request<WorkflowTypeDetail, AWSError>
    open fun getWorkflowExecutionHistory(params: GetWorkflowExecutionHistoryInput, callback: (err: AWSError, data: History) -> Unit = definedExternally): Request<History, AWSError>
    open fun getWorkflowExecutionHistory(callback: (err: AWSError, data: History) -> Unit = definedExternally): Request<History, AWSError>
    open fun listActivityTypes(params: ListActivityTypesInput, callback: (err: AWSError, data: ActivityTypeInfos) -> Unit = definedExternally): Request<ActivityTypeInfos, AWSError>
    open fun listActivityTypes(callback: (err: AWSError, data: ActivityTypeInfos) -> Unit = definedExternally): Request<ActivityTypeInfos, AWSError>
    open fun listClosedWorkflowExecutions(params: ListClosedWorkflowExecutionsInput, callback: (err: AWSError, data: WorkflowExecutionInfos) -> Unit = definedExternally): Request<WorkflowExecutionInfos, AWSError>
    open fun listClosedWorkflowExecutions(callback: (err: AWSError, data: WorkflowExecutionInfos) -> Unit = definedExternally): Request<WorkflowExecutionInfos, AWSError>
    open fun listDomains(params: ListDomainsInput, callback: (err: AWSError, data: DomainInfos) -> Unit = definedExternally): Request<DomainInfos, AWSError>
    open fun listDomains(callback: (err: AWSError, data: DomainInfos) -> Unit = definedExternally): Request<DomainInfos, AWSError>
    open fun listOpenWorkflowExecutions(params: ListOpenWorkflowExecutionsInput, callback: (err: AWSError, data: WorkflowExecutionInfos) -> Unit = definedExternally): Request<WorkflowExecutionInfos, AWSError>
    open fun listOpenWorkflowExecutions(callback: (err: AWSError, data: WorkflowExecutionInfos) -> Unit = definedExternally): Request<WorkflowExecutionInfos, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listWorkflowTypes(params: ListWorkflowTypesInput, callback: (err: AWSError, data: WorkflowTypeInfos) -> Unit = definedExternally): Request<WorkflowTypeInfos, AWSError>
    open fun listWorkflowTypes(callback: (err: AWSError, data: WorkflowTypeInfos) -> Unit = definedExternally): Request<WorkflowTypeInfos, AWSError>
    open fun pollForActivityTask(params: PollForActivityTaskInput, callback: (err: AWSError, data: ActivityTask) -> Unit = definedExternally): Request<ActivityTask, AWSError>
    open fun pollForActivityTask(callback: (err: AWSError, data: ActivityTask) -> Unit = definedExternally): Request<ActivityTask, AWSError>
    open fun pollForDecisionTask(params: PollForDecisionTaskInput, callback: (err: AWSError, data: DecisionTask) -> Unit = definedExternally): Request<DecisionTask, AWSError>
    open fun pollForDecisionTask(callback: (err: AWSError, data: DecisionTask) -> Unit = definedExternally): Request<DecisionTask, AWSError>
    open fun recordActivityTaskHeartbeat(params: RecordActivityTaskHeartbeatInput, callback: (err: AWSError, data: ActivityTaskStatus) -> Unit = definedExternally): Request<ActivityTaskStatus, AWSError>
    open fun recordActivityTaskHeartbeat(callback: (err: AWSError, data: ActivityTaskStatus) -> Unit = definedExternally): Request<ActivityTaskStatus, AWSError>
    open fun registerActivityType(params: RegisterActivityTypeInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerActivityType(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerDomain(params: RegisterDomainInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerDomain(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerWorkflowType(params: RegisterWorkflowTypeInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerWorkflowType(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun requestCancelWorkflowExecution(params: RequestCancelWorkflowExecutionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun requestCancelWorkflowExecution(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun respondActivityTaskCanceled(params: RespondActivityTaskCanceledInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun respondActivityTaskCanceled(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun respondActivityTaskCompleted(params: RespondActivityTaskCompletedInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun respondActivityTaskCompleted(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun respondActivityTaskFailed(params: RespondActivityTaskFailedInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun respondActivityTaskFailed(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun respondDecisionTaskCompleted(params: RespondDecisionTaskCompletedInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun respondDecisionTaskCompleted(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun signalWorkflowExecution(params: SignalWorkflowExecutionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun signalWorkflowExecution(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startWorkflowExecution(params: StartWorkflowExecutionInput, callback: (err: AWSError, data: Run) -> Unit = definedExternally): Request<Run, AWSError>
    open fun startWorkflowExecution(callback: (err: AWSError, data: Run) -> Unit = definedExternally): Request<Run, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun terminateWorkflowExecution(params: TerminateWorkflowExecutionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun terminateWorkflowExecution(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun undeprecateActivityType(params: UndeprecateActivityTypeInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun undeprecateActivityType(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun undeprecateDomain(params: UndeprecateDomainInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun undeprecateDomain(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun undeprecateWorkflowType(params: UndeprecateWorkflowTypeInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun undeprecateWorkflowType(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface ActivityTask {
        var taskToken: TaskToken
        var activityId: ActivityId
        var startedEventId: EventId
        var workflowExecution: WorkflowExecution
        var activityType: ActivityType
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityTaskCancelRequestedEventAttributes {
        var decisionTaskCompletedEventId: EventId
        var activityId: ActivityId
    }
    interface ActivityTaskCanceledEventAttributes {
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledEventId: EventId
        var startedEventId: EventId
        var latestCancelRequestedEventId: EventId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityTaskCompletedEventAttributes {
        var result: Data?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledEventId: EventId
        var startedEventId: EventId
    }
    interface ActivityTaskFailedEventAttributes {
        var reason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledEventId: EventId
        var startedEventId: EventId
    }
    interface ActivityTaskScheduledEventAttributes {
        var activityType: ActivityType
        var activityId: ActivityId
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
        var scheduleToStartTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var scheduleToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var startToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var taskList: TaskList
        var taskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventId: EventId
        var heartbeatTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityTaskStartedEventAttributes {
        var identity: Identity?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledEventId: EventId
    }
    interface ActivityTaskStatus {
        var cancelRequested: Canceled
    }
    interface ActivityTaskTimedOutEventAttributes {
        var timeoutType: String /* "START_TO_CLOSE" | "SCHEDULE_TO_START" | "SCHEDULE_TO_CLOSE" | "HEARTBEAT" | String */
        var scheduledEventId: EventId
        var startedEventId: EventId
        var details: LimitedData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityType {
        var name: Name
        var version: Version
    }
    interface ActivityTypeConfiguration {
        var defaultTaskStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskHeartbeatTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskList: TaskList?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskScheduleToStartTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskScheduleToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityTypeDetail {
        var typeInfo: ActivityTypeInfo
        var configuration: ActivityTypeConfiguration
    }
    interface ActivityTypeInfo {
        var activityType: ActivityType
        var status: String /* "REGISTERED" | "DEPRECATED" | String */
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: Timestamp
        var deprecationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivityTypeInfos {
        var typeInfos: ActivityTypeInfoList
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelTimerDecisionAttributes {
        var timerId: TimerId
    }
    interface CancelTimerFailedEventAttributes {
        var timerId: TimerId
        var cause: String /* "TIMER_ID_UNKNOWN" | "OPERATION_NOT_PERMITTED" | String */
        var decisionTaskCompletedEventId: EventId
    }
    interface CancelWorkflowExecutionDecisionAttributes {
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelWorkflowExecutionFailedEventAttributes {
        var cause: String /* "UNHANDLED_DECISION" | "OPERATION_NOT_PERMITTED" | String */
        var decisionTaskCompletedEventId: EventId
    }
    interface ChildWorkflowExecutionCanceledEventAttributes {
        var workflowExecution: WorkflowExecution
        var workflowType: WorkflowType
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
        var initiatedEventId: EventId
        var startedEventId: EventId
    }
    interface ChildWorkflowExecutionCompletedEventAttributes {
        var workflowExecution: WorkflowExecution
        var workflowType: WorkflowType
        var result: Data?
            get() = definedExternally
            set(value) = definedExternally
        var initiatedEventId: EventId
        var startedEventId: EventId
    }
    interface ChildWorkflowExecutionFailedEventAttributes {
        var workflowExecution: WorkflowExecution
        var workflowType: WorkflowType
        var reason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
        var initiatedEventId: EventId
        var startedEventId: EventId
    }
    interface ChildWorkflowExecutionStartedEventAttributes {
        var workflowExecution: WorkflowExecution
        var workflowType: WorkflowType
        var initiatedEventId: EventId
    }
    interface ChildWorkflowExecutionTerminatedEventAttributes {
        var workflowExecution: WorkflowExecution
        var workflowType: WorkflowType
        var initiatedEventId: EventId
        var startedEventId: EventId
    }
    interface ChildWorkflowExecutionTimedOutEventAttributes {
        var workflowExecution: WorkflowExecution
        var workflowType: WorkflowType
        var timeoutType: String /* "START_TO_CLOSE" | String */
        var initiatedEventId: EventId
        var startedEventId: EventId
    }
    interface CloseStatusFilter {
        var status: String /* "COMPLETED" | "FAILED" | "CANCELED" | "TERMINATED" | "CONTINUED_AS_NEW" | "TIMED_OUT" | String */
    }
    interface CompleteWorkflowExecutionDecisionAttributes {
        var result: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompleteWorkflowExecutionFailedEventAttributes {
        var cause: String /* "UNHANDLED_DECISION" | "OPERATION_NOT_PERMITTED" | String */
        var decisionTaskCompletedEventId: EventId
    }
    interface ContinueAsNewWorkflowExecutionDecisionAttributes {
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var executionStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var taskList: TaskList?
            get() = definedExternally
            set(value) = definedExternally
        var taskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var taskStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var childPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
        var tagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var workflowTypeVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaRole: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContinueAsNewWorkflowExecutionFailedEventAttributes {
        var cause: String /* "UNHANDLED_DECISION" | "WORKFLOW_TYPE_DEPRECATED" | "WORKFLOW_TYPE_DOES_NOT_EXIST" | "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_LIST_UNDEFINED" | "DEFAULT_CHILD_POLICY_UNDEFINED" | "CONTINUE_AS_NEW_WORKFLOW_EXECUTION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED" | String */
        var decisionTaskCompletedEventId: EventId
    }
    interface CountClosedWorkflowExecutionsInput {
        var domain: DomainName
        var startTimeFilter: ExecutionTimeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var closeTimeFilter: ExecutionTimeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var executionFilter: WorkflowExecutionFilter?
            get() = definedExternally
            set(value) = definedExternally
        var typeFilter: WorkflowTypeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var tagFilter: TagFilter?
            get() = definedExternally
            set(value) = definedExternally
        var closeStatusFilter: CloseStatusFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CountOpenWorkflowExecutionsInput {
        var domain: DomainName
        var startTimeFilter: ExecutionTimeFilter
        var typeFilter: WorkflowTypeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var tagFilter: TagFilter?
            get() = definedExternally
            set(value) = definedExternally
        var executionFilter: WorkflowExecutionFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CountPendingActivityTasksInput {
        var domain: DomainName
        var taskList: TaskList
    }
    interface CountPendingDecisionTasksInput {
        var domain: DomainName
        var taskList: TaskList
    }
    interface Decision {
        var decisionType: String /* "ScheduleActivityTask" | "RequestCancelActivityTask" | "CompleteWorkflowExecution" | "FailWorkflowExecution" | "CancelWorkflowExecution" | "ContinueAsNewWorkflowExecution" | "RecordMarker" | "StartTimer" | "CancelTimer" | "SignalExternalWorkflowExecution" | "RequestCancelExternalWorkflowExecution" | "StartChildWorkflowExecution" | "ScheduleLambdaFunction" | String */
        var scheduleActivityTaskDecisionAttributes: ScheduleActivityTaskDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var requestCancelActivityTaskDecisionAttributes: RequestCancelActivityTaskDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var completeWorkflowExecutionDecisionAttributes: CompleteWorkflowExecutionDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var failWorkflowExecutionDecisionAttributes: FailWorkflowExecutionDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var cancelWorkflowExecutionDecisionAttributes: CancelWorkflowExecutionDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var continueAsNewWorkflowExecutionDecisionAttributes: ContinueAsNewWorkflowExecutionDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var recordMarkerDecisionAttributes: RecordMarkerDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var startTimerDecisionAttributes: StartTimerDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var cancelTimerDecisionAttributes: CancelTimerDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var signalExternalWorkflowExecutionDecisionAttributes: SignalExternalWorkflowExecutionDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var requestCancelExternalWorkflowExecutionDecisionAttributes: RequestCancelExternalWorkflowExecutionDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var startChildWorkflowExecutionDecisionAttributes: StartChildWorkflowExecutionDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var scheduleLambdaFunctionDecisionAttributes: ScheduleLambdaFunctionDecisionAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DecisionTask {
        var taskToken: TaskToken
        var startedEventId: EventId
        var workflowExecution: WorkflowExecution
        var workflowType: WorkflowType
        var events: HistoryEventList
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var previousStartedEventId: EventId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DecisionTaskCompletedEventAttributes {
        var executionContext: Data?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledEventId: EventId
        var startedEventId: EventId
    }
    interface DecisionTaskScheduledEventAttributes {
        var taskList: TaskList
        var taskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var startToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DecisionTaskStartedEventAttributes {
        var identity: Identity?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledEventId: EventId
    }
    interface DecisionTaskTimedOutEventAttributes {
        var timeoutType: String /* "START_TO_CLOSE" | String */
        var scheduledEventId: EventId
        var startedEventId: EventId
    }
    interface DeprecateActivityTypeInput {
        var domain: DomainName
        var activityType: ActivityType
    }
    interface DeprecateDomainInput {
        var name: DomainName
    }
    interface DeprecateWorkflowTypeInput {
        var domain: DomainName
        var workflowType: WorkflowType
    }
    interface DescribeActivityTypeInput {
        var domain: DomainName
        var activityType: ActivityType
    }
    interface DescribeDomainInput {
        var name: DomainName
    }
    interface DescribeWorkflowExecutionInput {
        var domain: DomainName
        var execution: WorkflowExecution
    }
    interface DescribeWorkflowTypeInput {
        var domain: DomainName
        var workflowType: WorkflowType
    }
    interface DomainConfiguration {
        var workflowExecutionRetentionPeriodInDays: DurationInDays
    }
    interface DomainDetail {
        var domainInfo: DomainInfo
        var configuration: DomainConfiguration
    }
    interface DomainInfo {
        var name: DomainName
        var status: String /* "REGISTERED" | "DEPRECATED" | String */
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainInfos {
        var domainInfos: DomainInfoList
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionTimeFilter {
        var oldestDate: Timestamp
        var latestDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExternalWorkflowExecutionCancelRequestedEventAttributes {
        var workflowExecution: WorkflowExecution
        var initiatedEventId: EventId
    }
    interface ExternalWorkflowExecutionSignaledEventAttributes {
        var workflowExecution: WorkflowExecution
        var initiatedEventId: EventId
    }
    interface FailWorkflowExecutionDecisionAttributes {
        var reason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailWorkflowExecutionFailedEventAttributes {
        var cause: String /* "UNHANDLED_DECISION" | "OPERATION_NOT_PERMITTED" | String */
        var decisionTaskCompletedEventId: EventId
    }
    interface GetWorkflowExecutionHistoryInput {
        var domain: DomainName
        var execution: WorkflowExecution
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var maximumPageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var reverseOrder: ReverseOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface History {
        var events: HistoryEventList
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HistoryEvent {
        var eventTimestamp: Timestamp
        var eventType: String /* "WorkflowExecutionStarted" | "WorkflowExecutionCancelRequested" | "WorkflowExecutionCompleted" | "CompleteWorkflowExecutionFailed" | "WorkflowExecutionFailed" | "FailWorkflowExecutionFailed" | "WorkflowExecutionTimedOut" | "WorkflowExecutionCanceled" | "CancelWorkflowExecutionFailed" | "WorkflowExecutionContinuedAsNew" | "ContinueAsNewWorkflowExecutionFailed" | "WorkflowExecutionTerminated" | "DecisionTaskScheduled" | "DecisionTaskStarted" | "DecisionTaskCompleted" | "DecisionTaskTimedOut" | "ActivityTaskScheduled" | "ScheduleActivityTaskFailed" | "ActivityTaskStarted" | "ActivityTaskCompleted" | "ActivityTaskFailed" | "ActivityTaskTimedOut" | "ActivityTaskCanceled" | "ActivityTaskCancelRequested" | "RequestCancelActivityTaskFailed" | "WorkflowExecutionSignaled" | "MarkerRecorded" | "RecordMarkerFailed" | "TimerStarted" | "StartTimerFailed" | "TimerFired" | "TimerCanceled" | "CancelTimerFailed" | "StartChildWorkflowExecutionInitiated" | "StartChildWorkflowExecutionFailed" | "ChildWorkflowExecutionStarted" | "ChildWorkflowExecutionCompleted" | "ChildWorkflowExecutionFailed" | "ChildWorkflowExecutionTimedOut" | "ChildWorkflowExecutionCanceled" | "ChildWorkflowExecutionTerminated" | "SignalExternalWorkflowExecutionInitiated" | "SignalExternalWorkflowExecutionFailed" | "ExternalWorkflowExecutionSignaled" | "RequestCancelExternalWorkflowExecutionInitiated" | "RequestCancelExternalWorkflowExecutionFailed" | "ExternalWorkflowExecutionCancelRequested" | "LambdaFunctionScheduled" | "LambdaFunctionStarted" | "LambdaFunctionCompleted" | "LambdaFunctionFailed" | "LambdaFunctionTimedOut" | "ScheduleLambdaFunctionFailed" | "StartLambdaFunctionFailed" | String */
        var eventId: EventId
        var workflowExecutionStartedEventAttributes: WorkflowExecutionStartedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var workflowExecutionCompletedEventAttributes: WorkflowExecutionCompletedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var completeWorkflowExecutionFailedEventAttributes: CompleteWorkflowExecutionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var workflowExecutionFailedEventAttributes: WorkflowExecutionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var failWorkflowExecutionFailedEventAttributes: FailWorkflowExecutionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var workflowExecutionTimedOutEventAttributes: WorkflowExecutionTimedOutEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var workflowExecutionCanceledEventAttributes: WorkflowExecutionCanceledEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var cancelWorkflowExecutionFailedEventAttributes: CancelWorkflowExecutionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var workflowExecutionContinuedAsNewEventAttributes: WorkflowExecutionContinuedAsNewEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var continueAsNewWorkflowExecutionFailedEventAttributes: ContinueAsNewWorkflowExecutionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var workflowExecutionTerminatedEventAttributes: WorkflowExecutionTerminatedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var workflowExecutionCancelRequestedEventAttributes: WorkflowExecutionCancelRequestedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskScheduledEventAttributes: DecisionTaskScheduledEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskStartedEventAttributes: DecisionTaskStartedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventAttributes: DecisionTaskCompletedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskTimedOutEventAttributes: DecisionTaskTimedOutEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var activityTaskScheduledEventAttributes: ActivityTaskScheduledEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var activityTaskStartedEventAttributes: ActivityTaskStartedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var activityTaskCompletedEventAttributes: ActivityTaskCompletedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var activityTaskFailedEventAttributes: ActivityTaskFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var activityTaskTimedOutEventAttributes: ActivityTaskTimedOutEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var activityTaskCanceledEventAttributes: ActivityTaskCanceledEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var activityTaskCancelRequestedEventAttributes: ActivityTaskCancelRequestedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var workflowExecutionSignaledEventAttributes: WorkflowExecutionSignaledEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var markerRecordedEventAttributes: MarkerRecordedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var recordMarkerFailedEventAttributes: RecordMarkerFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var timerStartedEventAttributes: TimerStartedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var timerFiredEventAttributes: TimerFiredEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var timerCanceledEventAttributes: TimerCanceledEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var startChildWorkflowExecutionInitiatedEventAttributes: StartChildWorkflowExecutionInitiatedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var childWorkflowExecutionStartedEventAttributes: ChildWorkflowExecutionStartedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var childWorkflowExecutionCompletedEventAttributes: ChildWorkflowExecutionCompletedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var childWorkflowExecutionFailedEventAttributes: ChildWorkflowExecutionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var childWorkflowExecutionTimedOutEventAttributes: ChildWorkflowExecutionTimedOutEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var childWorkflowExecutionCanceledEventAttributes: ChildWorkflowExecutionCanceledEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var childWorkflowExecutionTerminatedEventAttributes: ChildWorkflowExecutionTerminatedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var signalExternalWorkflowExecutionInitiatedEventAttributes: SignalExternalWorkflowExecutionInitiatedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var externalWorkflowExecutionSignaledEventAttributes: ExternalWorkflowExecutionSignaledEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var signalExternalWorkflowExecutionFailedEventAttributes: SignalExternalWorkflowExecutionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var externalWorkflowExecutionCancelRequestedEventAttributes: ExternalWorkflowExecutionCancelRequestedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var requestCancelExternalWorkflowExecutionInitiatedEventAttributes: RequestCancelExternalWorkflowExecutionInitiatedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var requestCancelExternalWorkflowExecutionFailedEventAttributes: RequestCancelExternalWorkflowExecutionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var scheduleActivityTaskFailedEventAttributes: ScheduleActivityTaskFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var requestCancelActivityTaskFailedEventAttributes: RequestCancelActivityTaskFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var startTimerFailedEventAttributes: StartTimerFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var cancelTimerFailedEventAttributes: CancelTimerFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var startChildWorkflowExecutionFailedEventAttributes: StartChildWorkflowExecutionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionScheduledEventAttributes: LambdaFunctionScheduledEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionStartedEventAttributes: LambdaFunctionStartedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionCompletedEventAttributes: LambdaFunctionCompletedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionFailedEventAttributes: LambdaFunctionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaFunctionTimedOutEventAttributes: LambdaFunctionTimedOutEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var scheduleLambdaFunctionFailedEventAttributes: ScheduleLambdaFunctionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var startLambdaFunctionFailedEventAttributes: StartLambdaFunctionFailedEventAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaFunctionCompletedEventAttributes {
        var scheduledEventId: EventId
        var startedEventId: EventId
        var result: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaFunctionFailedEventAttributes {
        var scheduledEventId: EventId
        var startedEventId: EventId
        var reason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaFunctionScheduledEventAttributes {
        var id: FunctionId
        var name: FunctionName
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
        var input: FunctionInput?
            get() = definedExternally
            set(value) = definedExternally
        var startToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventId: EventId
    }
    interface LambdaFunctionStartedEventAttributes {
        var scheduledEventId: EventId
    }
    interface LambdaFunctionTimedOutEventAttributes {
        var scheduledEventId: EventId
        var startedEventId: EventId
        var timeoutType: String /* "START_TO_CLOSE" | String */
    }
    interface ListActivityTypesInput {
        var domain: DomainName
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var registrationStatus: String /* "REGISTERED" | "DEPRECATED" | String */
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var maximumPageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var reverseOrder: ReverseOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClosedWorkflowExecutionsInput {
        var domain: DomainName
        var startTimeFilter: ExecutionTimeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var closeTimeFilter: ExecutionTimeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var executionFilter: WorkflowExecutionFilter?
            get() = definedExternally
            set(value) = definedExternally
        var closeStatusFilter: CloseStatusFilter?
            get() = definedExternally
            set(value) = definedExternally
        var typeFilter: WorkflowTypeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var tagFilter: TagFilter?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var maximumPageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var reverseOrder: ReverseOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainsInput {
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var registrationStatus: String /* "REGISTERED" | "DEPRECATED" | String */
        var maximumPageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var reverseOrder: ReverseOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOpenWorkflowExecutionsInput {
        var domain: DomainName
        var startTimeFilter: ExecutionTimeFilter
        var typeFilter: WorkflowTypeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var tagFilter: TagFilter?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var maximumPageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var reverseOrder: ReverseOrder?
            get() = definedExternally
            set(value) = definedExternally
        var executionFilter: WorkflowExecutionFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var resourceArn: Arn
    }
    interface ListTagsForResourceOutput {
        var tags: ResourceTagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkflowTypesInput {
        var domain: DomainName
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var registrationStatus: String /* "REGISTERED" | "DEPRECATED" | String */
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var maximumPageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var reverseOrder: ReverseOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MarkerRecordedEventAttributes {
        var markerName: MarkerName
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventId: EventId
    }
    interface PendingTaskCount {
        var count: Count
        var truncated: Truncated?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PollForActivityTaskInput {
        var domain: DomainName
        var taskList: TaskList
        var identity: Identity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PollForDecisionTaskInput {
        var domain: DomainName
        var taskList: TaskList
        var identity: Identity?
            get() = definedExternally
            set(value) = definedExternally
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
        var maximumPageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var reverseOrder: ReverseOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordActivityTaskHeartbeatInput {
        var taskToken: TaskToken
        var details: LimitedData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordMarkerDecisionAttributes {
        var markerName: MarkerName
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordMarkerFailedEventAttributes {
        var markerName: MarkerName
        var cause: String /* "OPERATION_NOT_PERMITTED" | String */
        var decisionTaskCompletedEventId: EventId
    }
    interface RegisterActivityTypeInput {
        var domain: DomainName
        var name: Name
        var version: Version
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskHeartbeatTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskList: TaskList?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskScheduleToStartTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskScheduleToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterDomainInput {
        var name: DomainName
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var workflowExecutionRetentionPeriodInDays: DurationInDays
        var tags: ResourceTagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterWorkflowTypeInput {
        var domain: DomainName
        var name: Name
        var version: Version
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var defaultExecutionStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskList: TaskList?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var defaultChildPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
        var defaultLambdaRole: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RequestCancelActivityTaskDecisionAttributes {
        var activityId: ActivityId
    }
    interface RequestCancelActivityTaskFailedEventAttributes {
        var activityId: ActivityId
        var cause: String /* "ACTIVITY_ID_UNKNOWN" | "OPERATION_NOT_PERMITTED" | String */
        var decisionTaskCompletedEventId: EventId
    }
    interface RequestCancelExternalWorkflowExecutionDecisionAttributes {
        var workflowId: WorkflowId
        var runId: WorkflowRunIdOptional?
            get() = definedExternally
            set(value) = definedExternally
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RequestCancelExternalWorkflowExecutionFailedEventAttributes {
        var workflowId: WorkflowId
        var runId: WorkflowRunIdOptional?
            get() = definedExternally
            set(value) = definedExternally
        var cause: String /* "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" | "REQUEST_CANCEL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED" | String */
        var initiatedEventId: EventId
        var decisionTaskCompletedEventId: EventId
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RequestCancelExternalWorkflowExecutionInitiatedEventAttributes {
        var workflowId: WorkflowId
        var runId: WorkflowRunIdOptional?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventId: EventId
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RequestCancelWorkflowExecutionInput {
        var domain: DomainName
        var workflowId: WorkflowId
        var runId: WorkflowRunIdOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTag {
        var key: ResourceTagKey
        var value: ResourceTagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RespondActivityTaskCanceledInput {
        var taskToken: TaskToken
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RespondActivityTaskCompletedInput {
        var taskToken: TaskToken
        var result: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RespondActivityTaskFailedInput {
        var taskToken: TaskToken
        var reason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RespondDecisionTaskCompletedInput {
        var taskToken: TaskToken
        var decisions: DecisionList?
            get() = definedExternally
            set(value) = definedExternally
        var executionContext: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Run {
        var runId: WorkflowRunId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduleActivityTaskDecisionAttributes {
        var activityType: ActivityType
        var activityId: ActivityId
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var scheduleToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var taskList: TaskList?
            get() = definedExternally
            set(value) = definedExternally
        var taskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var scheduleToStartTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var startToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var heartbeatTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduleActivityTaskFailedEventAttributes {
        var activityType: ActivityType
        var activityId: ActivityId
        var cause: String /* "ACTIVITY_TYPE_DEPRECATED" | "ACTIVITY_TYPE_DOES_NOT_EXIST" | "ACTIVITY_ID_ALREADY_IN_USE" | "OPEN_ACTIVITIES_LIMIT_EXCEEDED" | "ACTIVITY_CREATION_RATE_EXCEEDED" | "DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_LIST_UNDEFINED" | "DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED" | "DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED" | "OPERATION_NOT_PERMITTED" | String */
        var decisionTaskCompletedEventId: EventId
    }
    interface ScheduleLambdaFunctionDecisionAttributes {
        var id: FunctionId
        var name: FunctionName
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
        var input: FunctionInput?
            get() = definedExternally
            set(value) = definedExternally
        var startToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduleLambdaFunctionFailedEventAttributes {
        var id: FunctionId
        var name: FunctionName
        var cause: String /* "ID_ALREADY_IN_USE" | "OPEN_LAMBDA_FUNCTIONS_LIMIT_EXCEEDED" | "LAMBDA_FUNCTION_CREATION_RATE_EXCEEDED" | "LAMBDA_SERVICE_NOT_AVAILABLE_IN_REGION" | String */
        var decisionTaskCompletedEventId: EventId
    }
    interface SignalExternalWorkflowExecutionDecisionAttributes {
        var workflowId: WorkflowId
        var runId: WorkflowRunIdOptional?
            get() = definedExternally
            set(value) = definedExternally
        var signalName: SignalName
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SignalExternalWorkflowExecutionFailedEventAttributes {
        var workflowId: WorkflowId
        var runId: WorkflowRunIdOptional?
            get() = definedExternally
            set(value) = definedExternally
        var cause: String /* "UNKNOWN_EXTERNAL_WORKFLOW_EXECUTION" | "SIGNAL_EXTERNAL_WORKFLOW_EXECUTION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED" | String */
        var initiatedEventId: EventId
        var decisionTaskCompletedEventId: EventId
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SignalExternalWorkflowExecutionInitiatedEventAttributes {
        var workflowId: WorkflowId
        var runId: WorkflowRunIdOptional?
            get() = definedExternally
            set(value) = definedExternally
        var signalName: SignalName
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventId: EventId
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SignalWorkflowExecutionInput {
        var domain: DomainName
        var workflowId: WorkflowId
        var runId: WorkflowRunIdOptional?
            get() = definedExternally
            set(value) = definedExternally
        var signalName: SignalName
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartChildWorkflowExecutionDecisionAttributes {
        var workflowType: WorkflowType
        var workflowId: WorkflowId
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var executionStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var taskList: TaskList?
            get() = definedExternally
            set(value) = definedExternally
        var taskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var taskStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var childPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
        var tagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaRole: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartChildWorkflowExecutionFailedEventAttributes {
        var workflowType: WorkflowType
        var cause: String /* "WORKFLOW_TYPE_DOES_NOT_EXIST" | "WORKFLOW_TYPE_DEPRECATED" | "OPEN_CHILDREN_LIMIT_EXCEEDED" | "OPEN_WORKFLOWS_LIMIT_EXCEEDED" | "CHILD_CREATION_RATE_EXCEEDED" | "WORKFLOW_ALREADY_RUNNING" | "DEFAULT_EXECUTION_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_TASK_LIST_UNDEFINED" | "DEFAULT_TASK_START_TO_CLOSE_TIMEOUT_UNDEFINED" | "DEFAULT_CHILD_POLICY_UNDEFINED" | "OPERATION_NOT_PERMITTED" | String */
        var workflowId: WorkflowId
        var initiatedEventId: EventId
        var decisionTaskCompletedEventId: EventId
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartChildWorkflowExecutionInitiatedEventAttributes {
        var workflowId: WorkflowId
        var workflowType: WorkflowType
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var executionStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var taskList: TaskList
        var taskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventId: EventId
        var childPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
        var taskStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var tagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaRole: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartLambdaFunctionFailedEventAttributes {
        var scheduledEventId: EventId?
            get() = definedExternally
            set(value) = definedExternally
        var cause: String /* "ASSUME_ROLE_FAILED" | String */
        var message: CauseMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartTimerDecisionAttributes {
        var timerId: TimerId
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
        var startToFireTimeout: DurationInSeconds
    }
    interface StartTimerFailedEventAttributes {
        var timerId: TimerId
        var cause: String /* "TIMER_ID_ALREADY_IN_USE" | "OPEN_TIMERS_LIMIT_EXCEEDED" | "TIMER_CREATION_RATE_EXCEEDED" | "OPERATION_NOT_PERMITTED" | String */
        var decisionTaskCompletedEventId: EventId
    }
    interface StartWorkflowExecutionInput {
        var domain: DomainName
        var workflowId: WorkflowId
        var workflowType: WorkflowType
        var taskList: TaskList?
            get() = definedExternally
            set(value) = definedExternally
        var taskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var executionStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var tagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var taskStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var childPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
        var lambdaRole: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagFilter {
        var tag: Tag
    }
    interface TagResourceInput {
        var resourceArn: Arn
        var tags: ResourceTagList
    }
    interface TaskList {
        var name: Name
    }
    interface TerminateWorkflowExecutionInput {
        var domain: DomainName
        var workflowId: WorkflowId
        var runId: WorkflowRunIdOptional?
            get() = definedExternally
            set(value) = definedExternally
        var reason: TerminateReason?
            get() = definedExternally
            set(value) = definedExternally
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
        var childPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
    }
    interface TimerCanceledEventAttributes {
        var timerId: TimerId
        var startedEventId: EventId
        var decisionTaskCompletedEventId: EventId
    }
    interface TimerFiredEventAttributes {
        var timerId: TimerId
        var startedEventId: EventId
    }
    interface TimerStartedEventAttributes {
        var timerId: TimerId
        var control: Data?
            get() = definedExternally
            set(value) = definedExternally
        var startToFireTimeout: DurationInSeconds
        var decisionTaskCompletedEventId: EventId
    }
    interface UndeprecateActivityTypeInput {
        var domain: DomainName
        var activityType: ActivityType
    }
    interface UndeprecateDomainInput {
        var name: DomainName
    }
    interface UndeprecateWorkflowTypeInput {
        var domain: DomainName
        var workflowType: WorkflowType
    }
    interface UntagResourceInput {
        var resourceArn: Arn
        var tagKeys: ResourceTagKeyList
    }
    interface WorkflowExecution {
        var workflowId: WorkflowId
        var runId: WorkflowRunId
    }
    interface WorkflowExecutionCancelRequestedEventAttributes {
        var externalWorkflowExecution: WorkflowExecution?
            get() = definedExternally
            set(value) = definedExternally
        var externalInitiatedEventId: EventId?
            get() = definedExternally
            set(value) = definedExternally
        var cause: String /* "CHILD_POLICY_APPLIED" | String */
    }
    interface WorkflowExecutionCanceledEventAttributes {
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventId: EventId
    }
    interface WorkflowExecutionCompletedEventAttributes {
        var result: Data?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventId: EventId
    }
    interface WorkflowExecutionConfiguration {
        var taskStartToCloseTimeout: DurationInSeconds
        var executionStartToCloseTimeout: DurationInSeconds
        var taskList: TaskList
        var taskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var childPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
        var lambdaRole: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowExecutionContinuedAsNewEventAttributes {
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventId: EventId
        var newExecutionRunId: WorkflowRunId
        var executionStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var taskList: TaskList
        var taskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var taskStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var childPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
        var tagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var workflowType: WorkflowType
        var lambdaRole: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowExecutionCount {
        var count: Count
        var truncated: Truncated?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowExecutionDetail {
        var executionInfo: WorkflowExecutionInfo
        var executionConfiguration: WorkflowExecutionConfiguration
        var openCounts: WorkflowExecutionOpenCounts
        var latestActivityTaskTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var latestExecutionContext: Data?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowExecutionFailedEventAttributes {
        var reason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
        var decisionTaskCompletedEventId: EventId
    }
    interface WorkflowExecutionFilter {
        var workflowId: WorkflowId
    }
    interface WorkflowExecutionInfo {
        var execution: WorkflowExecution
        var workflowType: WorkflowType
        var startTimestamp: Timestamp
        var closeTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var executionStatus: String /* "OPEN" | "CLOSED" | String */
        var closeStatus: String /* "COMPLETED" | "FAILED" | "CANCELED" | "TERMINATED" | "CONTINUED_AS_NEW" | "TIMED_OUT" | String */
        var parent: WorkflowExecution?
            get() = definedExternally
            set(value) = definedExternally
        var tagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var cancelRequested: Canceled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowExecutionInfos {
        var executionInfos: WorkflowExecutionInfoList
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowExecutionOpenCounts {
        var openActivityTasks: Count
        var openDecisionTasks: OpenDecisionTasksCount
        var openTimers: Count
        var openChildWorkflowExecutions: Count
        var openLambdaFunctions: Count?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowExecutionSignaledEventAttributes {
        var signalName: SignalName
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var externalWorkflowExecution: WorkflowExecution?
            get() = definedExternally
            set(value) = definedExternally
        var externalInitiatedEventId: EventId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowExecutionStartedEventAttributes {
        var input: Data?
            get() = definedExternally
            set(value) = definedExternally
        var executionStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var taskStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var childPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
        var taskList: TaskList
        var taskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var workflowType: WorkflowType
        var tagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var continuedExecutionRunId: WorkflowRunIdOptional?
            get() = definedExternally
            set(value) = definedExternally
        var parentWorkflowExecution: WorkflowExecution?
            get() = definedExternally
            set(value) = definedExternally
        var parentInitiatedEventId: EventId?
            get() = definedExternally
            set(value) = definedExternally
        var lambdaRole: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowExecutionTerminatedEventAttributes {
        var reason: TerminateReason?
            get() = definedExternally
            set(value) = definedExternally
        var details: Data?
            get() = definedExternally
            set(value) = definedExternally
        var childPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
        var cause: String /* "CHILD_POLICY_APPLIED" | "EVENT_LIMIT_EXCEEDED" | "OPERATOR_INITIATED" | String */
    }
    interface WorkflowExecutionTimedOutEventAttributes {
        var timeoutType: String /* "START_TO_CLOSE" | String */
        var childPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
    }
    interface WorkflowType {
        var name: Name
        var version: Version
    }
    interface WorkflowTypeConfiguration {
        var defaultTaskStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var defaultExecutionStartToCloseTimeout: DurationInSecondsOptional?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskList: TaskList?
            get() = definedExternally
            set(value) = definedExternally
        var defaultTaskPriority: TaskPriority?
            get() = definedExternally
            set(value) = definedExternally
        var defaultChildPolicy: String /* "TERMINATE" | "REQUEST_CANCEL" | "ABANDON" | String */
        var defaultLambdaRole: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowTypeDetail {
        var typeInfo: WorkflowTypeInfo
        var configuration: WorkflowTypeConfiguration
    }
    interface WorkflowTypeFilter {
        var name: Name
        var version: VersionOptional?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowTypeInfo {
        var workflowType: WorkflowType
        var status: String /* "REGISTERED" | "DEPRECATED" | String */
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: Timestamp
        var deprecationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowTypeInfos {
        var typeInfos: WorkflowTypeInfoList
        var nextPageToken: PageToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2012-01-25" | "latest" | String */
    }
}