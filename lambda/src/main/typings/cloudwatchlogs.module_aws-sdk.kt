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
import CloudWatchLogs.Destination
import CloudWatchLogs.ExportTask
import CloudWatchLogs.FilteredLogEvent
import CloudWatchLogs.InputLogEvent
import CloudWatchLogs.LogGroupField
import CloudWatchLogs.LogGroup
import CloudWatchLogs.LogStream
import CloudWatchLogs.MetricFilterMatchRecord
import CloudWatchLogs.MetricFilter
import CloudWatchLogs.MetricTransformation
import CloudWatchLogs.OutputLogEvent
import CloudWatchLogs.QueryInfo
import CloudWatchLogs.ResourcePolicy
import CloudWatchLogs.ResultField
import CloudWatchLogs.SearchedLogStream
import CloudWatchLogs.SubscriptionFilter
import CloudWatchLogs.AssociateKmsKeyRequest
import CloudWatchLogs.CancelExportTaskRequest
import CloudWatchLogs.CreateExportTaskRequest
import CloudWatchLogs.CreateExportTaskResponse
import CloudWatchLogs.CreateLogGroupRequest
import CloudWatchLogs.CreateLogStreamRequest
import CloudWatchLogs.DeleteDestinationRequest
import CloudWatchLogs.DeleteLogGroupRequest
import CloudWatchLogs.DeleteLogStreamRequest
import CloudWatchLogs.DeleteMetricFilterRequest
import CloudWatchLogs.DeleteResourcePolicyRequest
import CloudWatchLogs.DeleteRetentionPolicyRequest
import CloudWatchLogs.DeleteSubscriptionFilterRequest
import CloudWatchLogs.DescribeDestinationsRequest
import CloudWatchLogs.DescribeDestinationsResponse
import CloudWatchLogs.DescribeExportTasksRequest
import CloudWatchLogs.DescribeExportTasksResponse
import CloudWatchLogs.DescribeLogGroupsRequest
import CloudWatchLogs.DescribeLogGroupsResponse
import CloudWatchLogs.DescribeLogStreamsRequest
import CloudWatchLogs.DescribeLogStreamsResponse
import CloudWatchLogs.DescribeMetricFiltersRequest
import CloudWatchLogs.DescribeMetricFiltersResponse
import CloudWatchLogs.DescribeQueriesRequest
import CloudWatchLogs.DescribeQueriesResponse
import CloudWatchLogs.DescribeResourcePoliciesRequest
import CloudWatchLogs.DescribeResourcePoliciesResponse
import CloudWatchLogs.DescribeSubscriptionFiltersRequest
import CloudWatchLogs.DescribeSubscriptionFiltersResponse
import CloudWatchLogs.DisassociateKmsKeyRequest
import CloudWatchLogs.FilterLogEventsRequest
import CloudWatchLogs.FilterLogEventsResponse
import CloudWatchLogs.GetLogEventsRequest
import CloudWatchLogs.GetLogEventsResponse
import CloudWatchLogs.GetLogGroupFieldsRequest
import CloudWatchLogs.GetLogGroupFieldsResponse
import CloudWatchLogs.GetLogRecordRequest
import CloudWatchLogs.GetLogRecordResponse
import CloudWatchLogs.GetQueryResultsRequest
import CloudWatchLogs.GetQueryResultsResponse
import CloudWatchLogs.ListTagsLogGroupRequest
import CloudWatchLogs.ListTagsLogGroupResponse
import CloudWatchLogs.PutDestinationRequest
import CloudWatchLogs.PutDestinationResponse
import CloudWatchLogs.PutDestinationPolicyRequest
import CloudWatchLogs.PutLogEventsRequest
import CloudWatchLogs.PutLogEventsResponse
import CloudWatchLogs.PutMetricFilterRequest
import CloudWatchLogs.PutResourcePolicyRequest
import CloudWatchLogs.PutResourcePolicyResponse
import CloudWatchLogs.PutRetentionPolicyRequest
import CloudWatchLogs.PutSubscriptionFilterRequest
import CloudWatchLogs.StartQueryRequest
import CloudWatchLogs.StartQueryResponse
import CloudWatchLogs.StopQueryRequest
import CloudWatchLogs.StopQueryResponse
import CloudWatchLogs.TagLogGroupRequest
import CloudWatchLogs.TestMetricFilterRequest
import CloudWatchLogs.TestMetricFilterResponse
import CloudWatchLogs.UntagLogGroupRequest
import CloudWatchLogs.Tags
import CloudWatchLogs.ExportTaskStatus
import CloudWatchLogs.ExportTaskExecutionInfo
import CloudWatchLogs.LogRecord
import CloudWatchLogs.QueryStatistics
import CloudWatchLogs.ExtractedValues
import CloudWatchLogs.RejectedLogEventsInfo

typealias AccessPolicy = String

typealias Arn = String

typealias Days = Number

typealias DefaultValue = Number

typealias Descending = Boolean

typealias DescribeLimit = Number

typealias DescribeQueriesMaxResults = Number

typealias DestinationArn = String

typealias DestinationName = String

typealias Destinations = Array<Destination>

typealias EventId = String

typealias EventMessage = String

typealias EventNumber = Number

typealias EventsLimit = Number

typealias ExportDestinationBucket = String

typealias ExportDestinationPrefix = String

typealias ExportTaskId = String

typealias ExportTaskName = String

typealias ExportTaskStatusMessage = String

typealias ExportTasks = Array<ExportTask>

typealias Field = String

typealias FilterCount = Number

typealias FilterName = String

typealias FilterPattern = String

typealias FilteredLogEvents = Array<FilteredLogEvent>

typealias InputLogEvents = Array<InputLogEvent>

typealias InputLogStreamNames = Array<LogStreamName>

typealias Interleaved = Boolean

typealias KmsKeyId = String

typealias LogEventIndex = Number

typealias LogGroupFieldList = Array<LogGroupField>

typealias LogGroupName = String

typealias LogGroupNames = Array<LogGroupName>

typealias LogGroups = Array<LogGroup>

typealias LogRecordPointer = String

typealias LogStreamName = String

typealias LogStreamSearchedCompletely = Boolean

typealias LogStreams = Array<LogStream>

typealias MetricFilterMatches = Array<MetricFilterMatchRecord>

typealias MetricFilters = Array<MetricFilter>

typealias MetricName = String

typealias MetricNamespace = String

typealias MetricTransformations = Array<MetricTransformation>

typealias MetricValue = String

typealias NextToken = String

typealias OutputLogEvents = Array<OutputLogEvent>

typealias Percentage = Number

typealias PolicyDocument = String

typealias PolicyName = String

typealias QueryId = String

typealias QueryInfoList = Array<QueryInfo>

typealias QueryResults = Array<ResultRows>

typealias QueryString = String

typealias ResourcePolicies = Array<ResourcePolicy>

typealias ResultRows = Array<ResultField>

typealias RoleArn = String

typealias SearchedLogStreams = Array<SearchedLogStream>

typealias SequenceToken = String

typealias StartFromHead = Boolean

typealias StatsValue = Number

typealias StoredBytes = Number

typealias SubscriptionFilters = Array<SubscriptionFilter>

typealias Success = Boolean

typealias TagKey = String

typealias TagList = Array<TagKey>

typealias TagValue = String

typealias TargetArn = String

typealias TestEventMessages = Array<EventMessage>

typealias Timestamp = Number

typealias Token = String

typealias Value = String

@JsModule("aws-sdk")
external open class CloudWatchLogs(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CloudWatchLogs.Types.ClientConfiguration */
    open fun associateKmsKey(params: AssociateKmsKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun associateKmsKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun cancelExportTask(params: CancelExportTaskRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun cancelExportTask(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createExportTask(params: CreateExportTaskRequest, callback: (err: AWSError, data: CreateExportTaskResponse) -> Unit = definedExternally): Request<CreateExportTaskResponse, AWSError>
    open fun createExportTask(callback: (err: AWSError, data: CreateExportTaskResponse) -> Unit = definedExternally): Request<CreateExportTaskResponse, AWSError>
    open fun createLogGroup(params: CreateLogGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createLogGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createLogStream(params: CreateLogStreamRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createLogStream(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDestination(params: DeleteDestinationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDestination(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLogGroup(params: DeleteLogGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLogGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLogStream(params: DeleteLogStreamRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLogStream(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMetricFilter(params: DeleteMetricFilterRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMetricFilter(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteResourcePolicy(params: DeleteResourcePolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteResourcePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRetentionPolicy(params: DeleteRetentionPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRetentionPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSubscriptionFilter(params: DeleteSubscriptionFilterRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSubscriptionFilter(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeDestinations(params: DescribeDestinationsRequest, callback: (err: AWSError, data: DescribeDestinationsResponse) -> Unit = definedExternally): Request<DescribeDestinationsResponse, AWSError>
    open fun describeDestinations(callback: (err: AWSError, data: DescribeDestinationsResponse) -> Unit = definedExternally): Request<DescribeDestinationsResponse, AWSError>
    open fun describeExportTasks(params: DescribeExportTasksRequest, callback: (err: AWSError, data: DescribeExportTasksResponse) -> Unit = definedExternally): Request<DescribeExportTasksResponse, AWSError>
    open fun describeExportTasks(callback: (err: AWSError, data: DescribeExportTasksResponse) -> Unit = definedExternally): Request<DescribeExportTasksResponse, AWSError>
    open fun describeLogGroups(params: DescribeLogGroupsRequest, callback: (err: AWSError, data: DescribeLogGroupsResponse) -> Unit = definedExternally): Request<DescribeLogGroupsResponse, AWSError>
    open fun describeLogGroups(callback: (err: AWSError, data: DescribeLogGroupsResponse) -> Unit = definedExternally): Request<DescribeLogGroupsResponse, AWSError>
    open fun describeLogStreams(params: DescribeLogStreamsRequest, callback: (err: AWSError, data: DescribeLogStreamsResponse) -> Unit = definedExternally): Request<DescribeLogStreamsResponse, AWSError>
    open fun describeLogStreams(callback: (err: AWSError, data: DescribeLogStreamsResponse) -> Unit = definedExternally): Request<DescribeLogStreamsResponse, AWSError>
    open fun describeMetricFilters(params: DescribeMetricFiltersRequest, callback: (err: AWSError, data: DescribeMetricFiltersResponse) -> Unit = definedExternally): Request<DescribeMetricFiltersResponse, AWSError>
    open fun describeMetricFilters(callback: (err: AWSError, data: DescribeMetricFiltersResponse) -> Unit = definedExternally): Request<DescribeMetricFiltersResponse, AWSError>
    open fun describeQueries(params: DescribeQueriesRequest, callback: (err: AWSError, data: DescribeQueriesResponse) -> Unit = definedExternally): Request<DescribeQueriesResponse, AWSError>
    open fun describeQueries(callback: (err: AWSError, data: DescribeQueriesResponse) -> Unit = definedExternally): Request<DescribeQueriesResponse, AWSError>
    open fun describeResourcePolicies(params: DescribeResourcePoliciesRequest, callback: (err: AWSError, data: DescribeResourcePoliciesResponse) -> Unit = definedExternally): Request<DescribeResourcePoliciesResponse, AWSError>
    open fun describeResourcePolicies(callback: (err: AWSError, data: DescribeResourcePoliciesResponse) -> Unit = definedExternally): Request<DescribeResourcePoliciesResponse, AWSError>
    open fun describeSubscriptionFilters(params: DescribeSubscriptionFiltersRequest, callback: (err: AWSError, data: DescribeSubscriptionFiltersResponse) -> Unit = definedExternally): Request<DescribeSubscriptionFiltersResponse, AWSError>
    open fun describeSubscriptionFilters(callback: (err: AWSError, data: DescribeSubscriptionFiltersResponse) -> Unit = definedExternally): Request<DescribeSubscriptionFiltersResponse, AWSError>
    open fun disassociateKmsKey(params: DisassociateKmsKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disassociateKmsKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun filterLogEvents(params: FilterLogEventsRequest, callback: (err: AWSError, data: FilterLogEventsResponse) -> Unit = definedExternally): Request<FilterLogEventsResponse, AWSError>
    open fun filterLogEvents(callback: (err: AWSError, data: FilterLogEventsResponse) -> Unit = definedExternally): Request<FilterLogEventsResponse, AWSError>
    open fun getLogEvents(params: GetLogEventsRequest, callback: (err: AWSError, data: GetLogEventsResponse) -> Unit = definedExternally): Request<GetLogEventsResponse, AWSError>
    open fun getLogEvents(callback: (err: AWSError, data: GetLogEventsResponse) -> Unit = definedExternally): Request<GetLogEventsResponse, AWSError>
    open fun getLogGroupFields(params: GetLogGroupFieldsRequest, callback: (err: AWSError, data: GetLogGroupFieldsResponse) -> Unit = definedExternally): Request<GetLogGroupFieldsResponse, AWSError>
    open fun getLogGroupFields(callback: (err: AWSError, data: GetLogGroupFieldsResponse) -> Unit = definedExternally): Request<GetLogGroupFieldsResponse, AWSError>
    open fun getLogRecord(params: GetLogRecordRequest, callback: (err: AWSError, data: GetLogRecordResponse) -> Unit = definedExternally): Request<GetLogRecordResponse, AWSError>
    open fun getLogRecord(callback: (err: AWSError, data: GetLogRecordResponse) -> Unit = definedExternally): Request<GetLogRecordResponse, AWSError>
    open fun getQueryResults(params: GetQueryResultsRequest, callback: (err: AWSError, data: GetQueryResultsResponse) -> Unit = definedExternally): Request<GetQueryResultsResponse, AWSError>
    open fun getQueryResults(callback: (err: AWSError, data: GetQueryResultsResponse) -> Unit = definedExternally): Request<GetQueryResultsResponse, AWSError>
    open fun listTagsLogGroup(params: ListTagsLogGroupRequest, callback: (err: AWSError, data: ListTagsLogGroupResponse) -> Unit = definedExternally): Request<ListTagsLogGroupResponse, AWSError>
    open fun listTagsLogGroup(callback: (err: AWSError, data: ListTagsLogGroupResponse) -> Unit = definedExternally): Request<ListTagsLogGroupResponse, AWSError>
    open fun putDestination(params: PutDestinationRequest, callback: (err: AWSError, data: PutDestinationResponse) -> Unit = definedExternally): Request<PutDestinationResponse, AWSError>
    open fun putDestination(callback: (err: AWSError, data: PutDestinationResponse) -> Unit = definedExternally): Request<PutDestinationResponse, AWSError>
    open fun putDestinationPolicy(params: PutDestinationPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putDestinationPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putLogEvents(params: PutLogEventsRequest, callback: (err: AWSError, data: PutLogEventsResponse) -> Unit = definedExternally): Request<PutLogEventsResponse, AWSError>
    open fun putLogEvents(callback: (err: AWSError, data: PutLogEventsResponse) -> Unit = definedExternally): Request<PutLogEventsResponse, AWSError>
    open fun putMetricFilter(params: PutMetricFilterRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putMetricFilter(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putResourcePolicy(params: PutResourcePolicyRequest, callback: (err: AWSError, data: PutResourcePolicyResponse) -> Unit = definedExternally): Request<PutResourcePolicyResponse, AWSError>
    open fun putResourcePolicy(callback: (err: AWSError, data: PutResourcePolicyResponse) -> Unit = definedExternally): Request<PutResourcePolicyResponse, AWSError>
    open fun putRetentionPolicy(params: PutRetentionPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putRetentionPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putSubscriptionFilter(params: PutSubscriptionFilterRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putSubscriptionFilter(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startQuery(params: StartQueryRequest, callback: (err: AWSError, data: StartQueryResponse) -> Unit = definedExternally): Request<StartQueryResponse, AWSError>
    open fun startQuery(callback: (err: AWSError, data: StartQueryResponse) -> Unit = definedExternally): Request<StartQueryResponse, AWSError>
    open fun stopQuery(params: StopQueryRequest, callback: (err: AWSError, data: StopQueryResponse) -> Unit = definedExternally): Request<StopQueryResponse, AWSError>
    open fun stopQuery(callback: (err: AWSError, data: StopQueryResponse) -> Unit = definedExternally): Request<StopQueryResponse, AWSError>
    open fun tagLogGroup(params: TagLogGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagLogGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun testMetricFilter(params: TestMetricFilterRequest, callback: (err: AWSError, data: TestMetricFilterResponse) -> Unit = definedExternally): Request<TestMetricFilterResponse, AWSError>
    open fun testMetricFilter(callback: (err: AWSError, data: TestMetricFilterResponse) -> Unit = definedExternally): Request<TestMetricFilterResponse, AWSError>
    open fun untagLogGroup(params: UntagLogGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagLogGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface AssociateKmsKeyRequest {
        var logGroupName: LogGroupName
        var kmsKeyId: KmsKeyId
    }
    interface CancelExportTaskRequest {
        var taskId: ExportTaskId
    }
    interface CreateExportTaskRequest {
        var taskName: ExportTaskName?
            get() = definedExternally
            set(value) = definedExternally
        var logGroupName: LogGroupName
        var logStreamNamePrefix: LogStreamName?
            get() = definedExternally
            set(value) = definedExternally
        var from: Timestamp
        var to: Timestamp
        var destination: ExportDestinationBucket
        var destinationPrefix: ExportDestinationPrefix?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateExportTaskResponse {
        var taskId: ExportTaskId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLogGroupRequest {
        var logGroupName: LogGroupName
        var kmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLogStreamRequest {
        var logGroupName: LogGroupName
        var logStreamName: LogStreamName
    }
    interface DeleteDestinationRequest {
        var destinationName: DestinationName
    }
    interface DeleteLogGroupRequest {
        var logGroupName: LogGroupName
    }
    interface DeleteLogStreamRequest {
        var logGroupName: LogGroupName
        var logStreamName: LogStreamName
    }
    interface DeleteMetricFilterRequest {
        var logGroupName: LogGroupName
        var filterName: FilterName
    }
    interface DeleteResourcePolicyRequest {
        var policyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRetentionPolicyRequest {
        var logGroupName: LogGroupName
    }
    interface DeleteSubscriptionFilterRequest {
        var logGroupName: LogGroupName
        var filterName: FilterName
    }
    interface DescribeDestinationsRequest {
        var DestinationNamePrefix: DestinationName?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var limit: DescribeLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDestinationsResponse {
        var destinations: Destinations?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeExportTasksRequest {
        var taskId: ExportTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var statusCode: String /* "CANCELLED" | "COMPLETED" | "FAILED" | "PENDING" | "PENDING_CANCEL" | "RUNNING" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var limit: DescribeLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeExportTasksResponse {
        var exportTasks: ExportTasks?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLogGroupsRequest {
        var logGroupNamePrefix: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var limit: DescribeLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLogGroupsResponse {
        var logGroups: LogGroups?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLogStreamsRequest {
        var logGroupName: LogGroupName
        var logStreamNamePrefix: LogStreamName?
            get() = definedExternally
            set(value) = definedExternally
        var orderBy: String /* "LogStreamName" | "LastEventTime" | String */
        var descending: Descending?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var limit: DescribeLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLogStreamsResponse {
        var logStreams: LogStreams?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMetricFiltersRequest {
        var logGroupName: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var filterNamePrefix: FilterName?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var limit: DescribeLimit?
            get() = definedExternally
            set(value) = definedExternally
        var metricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var metricNamespace: MetricNamespace?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMetricFiltersResponse {
        var metricFilters: MetricFilters?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeQueriesRequest {
        var logGroupName: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Scheduled" | "Running" | "Complete" | "Failed" | "Cancelled" | String */
        var maxResults: DescribeQueriesMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeQueriesResponse {
        var queries: QueryInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeResourcePoliciesRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var limit: DescribeLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeResourcePoliciesResponse {
        var resourcePolicies: ResourcePolicies?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSubscriptionFiltersRequest {
        var logGroupName: LogGroupName
        var filterNamePrefix: FilterName?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var limit: DescribeLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSubscriptionFiltersResponse {
        var subscriptionFilters: SubscriptionFilters?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Destination {
        var destinationName: DestinationName?
            get() = definedExternally
            set(value) = definedExternally
        var targetArn: TargetArn?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var accessPolicy: AccessPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateKmsKeyRequest {
        var logGroupName: LogGroupName
    }
    interface ExportTask {
        var taskId: ExportTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var taskName: ExportTaskName?
            get() = definedExternally
            set(value) = definedExternally
        var logGroupName: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var from: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var to: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var destination: ExportDestinationBucket?
            get() = definedExternally
            set(value) = definedExternally
        var destinationPrefix: ExportDestinationPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var status: ExportTaskStatus?
            get() = definedExternally
            set(value) = definedExternally
        var executionInfo: ExportTaskExecutionInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportTaskExecutionInfo {
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var completionTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportTaskStatus {
        var code: String /* "CANCELLED" | "COMPLETED" | "FAILED" | "PENDING" | "PENDING_CANCEL" | "RUNNING" | String */
        var message: ExportTaskStatusMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExtractedValues {
        @nativeGetter
        operator fun get(key: String): Value?
        @nativeSetter
        operator fun set(key: String, value: Value)
    }
    interface FilterLogEventsRequest {
        var logGroupName: LogGroupName
        var logStreamNames: InputLogStreamNames?
            get() = definedExternally
            set(value) = definedExternally
        var logStreamNamePrefix: LogStreamName?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var filterPattern: FilterPattern?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var limit: EventsLimit?
            get() = definedExternally
            set(value) = definedExternally
        var interleaved: Interleaved?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FilterLogEventsResponse {
        var events: FilteredLogEvents?
            get() = definedExternally
            set(value) = definedExternally
        var searchedLogStreams: SearchedLogStreams?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FilteredLogEvent {
        var logStreamName: LogStreamName?
            get() = definedExternally
            set(value) = definedExternally
        var timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var message: EventMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ingestionTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var eventId: EventId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLogEventsRequest {
        var logGroupName: LogGroupName
        var logStreamName: LogStreamName
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var limit: EventsLimit?
            get() = definedExternally
            set(value) = definedExternally
        var startFromHead: StartFromHead?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLogEventsResponse {
        var events: OutputLogEvents?
            get() = definedExternally
            set(value) = definedExternally
        var nextForwardToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var nextBackwardToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLogGroupFieldsRequest {
        var logGroupName: LogGroupName
        var time: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLogGroupFieldsResponse {
        var logGroupFields: LogGroupFieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLogRecordRequest {
        var logRecordPointer: LogRecordPointer
    }
    interface GetLogRecordResponse {
        var logRecord: LogRecord?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQueryResultsRequest {
        var queryId: QueryId
    }
    interface GetQueryResultsResponse {
        var results: QueryResults?
            get() = definedExternally
            set(value) = definedExternally
        var statistics: QueryStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Scheduled" | "Running" | "Complete" | "Failed" | "Cancelled" | String */
    }
    interface InputLogEvent {
        var timestamp: Timestamp
        var message: EventMessage
    }
    interface ListTagsLogGroupRequest {
        var logGroupName: LogGroupName
    }
    interface ListTagsLogGroupResponse {
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogGroup {
        var logGroupName: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var retentionInDays: Days?
            get() = definedExternally
            set(value) = definedExternally
        var metricFilterCount: FilterCount?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var storedBytes: StoredBytes?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogGroupField {
        var name: Field?
            get() = definedExternally
            set(value) = definedExternally
        var percent: Percentage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogRecord {
        @nativeGetter
        operator fun get(key: String): Value?
        @nativeSetter
        operator fun set(key: String, value: Value)
    }
    interface LogStream {
        var logStreamName: LogStreamName?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var firstEventTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastEventTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastIngestionTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var uploadSequenceToken: SequenceToken?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var storedBytes: StoredBytes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricFilter {
        var filterName: FilterName?
            get() = definedExternally
            set(value) = definedExternally
        var filterPattern: FilterPattern?
            get() = definedExternally
            set(value) = definedExternally
        var metricTransformations: MetricTransformations?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var logGroupName: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricFilterMatchRecord {
        var eventNumber: EventNumber?
            get() = definedExternally
            set(value) = definedExternally
        var eventMessage: EventMessage?
            get() = definedExternally
            set(value) = definedExternally
        var extractedValues: ExtractedValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricTransformation {
        var metricName: MetricName
        var metricNamespace: MetricNamespace
        var metricValue: MetricValue
        var defaultValue: DefaultValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputLogEvent {
        var timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var message: EventMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ingestionTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutDestinationPolicyRequest {
        var destinationName: DestinationName
        var accessPolicy: AccessPolicy
    }
    interface PutDestinationRequest {
        var destinationName: DestinationName
        var targetArn: TargetArn
        var roleArn: RoleArn
    }
    interface PutDestinationResponse {
        var destination: Destination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutLogEventsRequest {
        var logGroupName: LogGroupName
        var logStreamName: LogStreamName
        var logEvents: InputLogEvents
        var sequenceToken: SequenceToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutLogEventsResponse {
        var nextSequenceToken: SequenceToken?
            get() = definedExternally
            set(value) = definedExternally
        var rejectedLogEventsInfo: RejectedLogEventsInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutMetricFilterRequest {
        var logGroupName: LogGroupName
        var filterName: FilterName
        var filterPattern: FilterPattern
        var metricTransformations: MetricTransformations
    }
    interface PutResourcePolicyRequest {
        var policyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var policyDocument: PolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutResourcePolicyResponse {
        var resourcePolicy: ResourcePolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRetentionPolicyRequest {
        var logGroupName: LogGroupName
        var retentionInDays: Days
    }
    interface PutSubscriptionFilterRequest {
        var logGroupName: LogGroupName
        var filterName: FilterName
        var filterPattern: FilterPattern
        var destinationArn: DestinationArn
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var distribution: String /* "Random" | "ByLogStream" | String */
    }
    interface QueryInfo {
        var queryId: QueryId?
            get() = definedExternally
            set(value) = definedExternally
        var queryString: QueryString?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Scheduled" | "Running" | "Complete" | "Failed" | "Cancelled" | String */
        var createTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var logGroupName: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryStatistics {
        var recordsMatched: StatsValue?
            get() = definedExternally
            set(value) = definedExternally
        var recordsScanned: StatsValue?
            get() = definedExternally
            set(value) = definedExternally
        var bytesScanned: StatsValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RejectedLogEventsInfo {
        var tooNewLogEventStartIndex: LogEventIndex?
            get() = definedExternally
            set(value) = definedExternally
        var tooOldLogEventEndIndex: LogEventIndex?
            get() = definedExternally
            set(value) = definedExternally
        var expiredLogEventEndIndex: LogEventIndex?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourcePolicy {
        var policyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var policyDocument: PolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResultField {
        var field: Field?
            get() = definedExternally
            set(value) = definedExternally
        var value: Value?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchedLogStream {
        var logStreamName: LogStreamName?
            get() = definedExternally
            set(value) = definedExternally
        var searchedCompletely: LogStreamSearchedCompletely?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartQueryRequest {
        var logGroupName: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var logGroupNames: LogGroupNames?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp
        var endTime: Timestamp
        var queryString: QueryString
        var limit: EventsLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartQueryResponse {
        var queryId: QueryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopQueryRequest {
        var queryId: QueryId
    }
    interface StopQueryResponse {
        var success: Success?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubscriptionFilter {
        var filterName: FilterName?
            get() = definedExternally
            set(value) = definedExternally
        var logGroupName: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var filterPattern: FilterPattern?
            get() = definedExternally
            set(value) = definedExternally
        var destinationArn: DestinationArn?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var distribution: String /* "Random" | "ByLogStream" | String */
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagLogGroupRequest {
        var logGroupName: LogGroupName
        var tags: Tags
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TestMetricFilterRequest {
        var filterPattern: FilterPattern
        var logEventMessages: TestEventMessages
    }
    interface TestMetricFilterResponse {
        var matches: MetricFilterMatches?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagLogGroupRequest {
        var logGroupName: LogGroupName
        var tags: TagList
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-03-28" | "latest" | String */
    }
}