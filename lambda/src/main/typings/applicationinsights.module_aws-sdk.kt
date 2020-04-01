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
import ApplicationInsights.ApplicationComponent
import ApplicationInsights.ApplicationInfo
import ApplicationInsights.ConfigurationEvent
import ApplicationInsights.LogPattern
import ApplicationInsights.Observation
import ApplicationInsights.Problem
import ApplicationInsights.Tag
import ApplicationInsights.CreateApplicationRequest
import ApplicationInsights.CreateApplicationResponse
import ApplicationInsights.CreateComponentRequest
import ApplicationInsights.CreateComponentResponse
import ApplicationInsights.CreateLogPatternRequest
import ApplicationInsights.CreateLogPatternResponse
import ApplicationInsights.DeleteApplicationRequest
import ApplicationInsights.DeleteApplicationResponse
import ApplicationInsights.DeleteComponentRequest
import ApplicationInsights.DeleteComponentResponse
import ApplicationInsights.DeleteLogPatternRequest
import ApplicationInsights.DeleteLogPatternResponse
import ApplicationInsights.DescribeApplicationRequest
import ApplicationInsights.DescribeApplicationResponse
import ApplicationInsights.DescribeComponentRequest
import ApplicationInsights.DescribeComponentResponse
import ApplicationInsights.DescribeComponentConfigurationRequest
import ApplicationInsights.DescribeComponentConfigurationResponse
import ApplicationInsights.DescribeComponentConfigurationRecommendationRequest
import ApplicationInsights.DescribeComponentConfigurationRecommendationResponse
import ApplicationInsights.DescribeLogPatternRequest
import ApplicationInsights.DescribeLogPatternResponse
import ApplicationInsights.DescribeObservationRequest
import ApplicationInsights.DescribeObservationResponse
import ApplicationInsights.DescribeProblemRequest
import ApplicationInsights.DescribeProblemResponse
import ApplicationInsights.DescribeProblemObservationsRequest
import ApplicationInsights.DescribeProblemObservationsResponse
import ApplicationInsights.ListApplicationsRequest
import ApplicationInsights.ListApplicationsResponse
import ApplicationInsights.ListComponentsRequest
import ApplicationInsights.ListComponentsResponse
import ApplicationInsights.ListConfigurationHistoryRequest
import ApplicationInsights.ListConfigurationHistoryResponse
import ApplicationInsights.ListLogPatternSetsRequest
import ApplicationInsights.ListLogPatternSetsResponse
import ApplicationInsights.ListLogPatternsRequest
import ApplicationInsights.ListLogPatternsResponse
import ApplicationInsights.ListProblemsRequest
import ApplicationInsights.ListProblemsResponse
import ApplicationInsights.ListTagsForResourceRequest
import ApplicationInsights.ListTagsForResourceResponse
import ApplicationInsights.TagResourceRequest
import ApplicationInsights.TagResourceResponse
import ApplicationInsights.UntagResourceRequest
import ApplicationInsights.UntagResourceResponse
import ApplicationInsights.UpdateApplicationRequest
import ApplicationInsights.UpdateApplicationResponse
import ApplicationInsights.UpdateComponentRequest
import ApplicationInsights.UpdateComponentResponse
import ApplicationInsights.UpdateComponentConfigurationRequest
import ApplicationInsights.UpdateComponentConfigurationResponse
import ApplicationInsights.UpdateLogPatternRequest
import ApplicationInsights.UpdateLogPatternResponse
import ApplicationInsights.RelatedObservations
import ApplicationInsights.Feedback

typealias AffectedResource = String

typealias AmazonResourceName = String

typealias ApplicationComponentList = Array<ApplicationComponent>

typealias ApplicationInfoList = Array<ApplicationInfo>

typealias CWEMonitorEnabled = Boolean

typealias CloudWatchEventDetailType = String

typealias CloudWatchEventId = String

typealias CodeDeployApplication = String

typealias CodeDeployDeploymentGroup = String

typealias CodeDeployDeploymentId = String

typealias CodeDeployInstanceGroupId = String

typealias CodeDeployState = String

typealias ComponentConfiguration = String

typealias ComponentName = String

typealias ConfigurationEventDetail = String

typealias ConfigurationEventList = Array<ConfigurationEvent>

typealias ConfigurationEventMonitoredResourceARN = String

typealias ConfigurationEventResourceName = String

typealias ConfigurationEventTime = Date

typealias Ec2State = String

typealias EndTime = Date

typealias HealthEventArn = String

typealias HealthEventDescription = String

typealias HealthEventTypeCategory = String

typealias HealthEventTypeCode = String

typealias HealthService = String

typealias Insights = String

typealias LifeCycle = String

typealias LineTime = Date

typealias LogGroup = String

typealias LogPatternList = Array<LogPattern>

typealias LogPatternName = String

typealias LogPatternRank = Number

typealias LogPatternRegex = String

typealias LogPatternSetList = Array<LogPatternSetName>

typealias LogPatternSetName = String

typealias LogText = String

typealias MaxEntities = Number

typealias MetricName = String

typealias MetricNamespace = String

typealias Monitor = Boolean

typealias NewComponentName = String

typealias ObservationId = String

typealias ObservationList = Array<Observation>

typealias OpsCenterEnabled = Boolean

typealias OpsItemSNSTopicArn = String

typealias PaginationToken = String

typealias ProblemId = String

typealias ProblemList = Array<Problem>

typealias Remarks = String

typealias RemoveSNSTopic = Boolean

typealias ResourceARN = String

typealias ResourceGroupName = String

typealias ResourceList = Array<ResourceARN>

typealias ResourceType = String

typealias SourceARN = String

typealias SourceType = String

typealias StartTime = Date

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Title = String

typealias Unit = String

typealias Value = Number

typealias XRayErrorPercent = Number

typealias XRayFaultPercent = Number

typealias XRayNodeName = String

typealias XRayNodeType = String

typealias XRayRequestAverageLatency = Number

typealias XRayRequestCount = Number

typealias XRayThrottlePercent = Number

@JsModule("aws-sdk")
external open class ApplicationInsights(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ApplicationInsights.Types.ClientConfiguration */
    open fun createApplication(params: CreateApplicationRequest, callback: (err: AWSError, data: CreateApplicationResponse) -> Unit = definedExternally): Request<CreateApplicationResponse, AWSError>
    open fun createApplication(callback: (err: AWSError, data: CreateApplicationResponse) -> Unit = definedExternally): Request<CreateApplicationResponse, AWSError>
    open fun createComponent(params: CreateComponentRequest, callback: (err: AWSError, data: CreateComponentResponse) -> Unit = definedExternally): Request<CreateComponentResponse, AWSError>
    open fun createComponent(callback: (err: AWSError, data: CreateComponentResponse) -> Unit = definedExternally): Request<CreateComponentResponse, AWSError>
    open fun createLogPattern(params: CreateLogPatternRequest, callback: (err: AWSError, data: CreateLogPatternResponse) -> Unit = definedExternally): Request<CreateLogPatternResponse, AWSError>
    open fun createLogPattern(callback: (err: AWSError, data: CreateLogPatternResponse) -> Unit = definedExternally): Request<CreateLogPatternResponse, AWSError>
    open fun deleteApplication(params: DeleteApplicationRequest, callback: (err: AWSError, data: DeleteApplicationResponse) -> Unit = definedExternally): Request<DeleteApplicationResponse, AWSError>
    open fun deleteApplication(callback: (err: AWSError, data: DeleteApplicationResponse) -> Unit = definedExternally): Request<DeleteApplicationResponse, AWSError>
    open fun deleteComponent(params: DeleteComponentRequest, callback: (err: AWSError, data: DeleteComponentResponse) -> Unit = definedExternally): Request<DeleteComponentResponse, AWSError>
    open fun deleteComponent(callback: (err: AWSError, data: DeleteComponentResponse) -> Unit = definedExternally): Request<DeleteComponentResponse, AWSError>
    open fun deleteLogPattern(params: DeleteLogPatternRequest, callback: (err: AWSError, data: DeleteLogPatternResponse) -> Unit = definedExternally): Request<DeleteLogPatternResponse, AWSError>
    open fun deleteLogPattern(callback: (err: AWSError, data: DeleteLogPatternResponse) -> Unit = definedExternally): Request<DeleteLogPatternResponse, AWSError>
    open fun describeApplication(params: DescribeApplicationRequest, callback: (err: AWSError, data: DescribeApplicationResponse) -> Unit = definedExternally): Request<DescribeApplicationResponse, AWSError>
    open fun describeApplication(callback: (err: AWSError, data: DescribeApplicationResponse) -> Unit = definedExternally): Request<DescribeApplicationResponse, AWSError>
    open fun describeComponent(params: DescribeComponentRequest, callback: (err: AWSError, data: DescribeComponentResponse) -> Unit = definedExternally): Request<DescribeComponentResponse, AWSError>
    open fun describeComponent(callback: (err: AWSError, data: DescribeComponentResponse) -> Unit = definedExternally): Request<DescribeComponentResponse, AWSError>
    open fun describeComponentConfiguration(params: DescribeComponentConfigurationRequest, callback: (err: AWSError, data: DescribeComponentConfigurationResponse) -> Unit = definedExternally): Request<DescribeComponentConfigurationResponse, AWSError>
    open fun describeComponentConfiguration(callback: (err: AWSError, data: DescribeComponentConfigurationResponse) -> Unit = definedExternally): Request<DescribeComponentConfigurationResponse, AWSError>
    open fun describeComponentConfigurationRecommendation(params: DescribeComponentConfigurationRecommendationRequest, callback: (err: AWSError, data: DescribeComponentConfigurationRecommendationResponse) -> Unit = definedExternally): Request<DescribeComponentConfigurationRecommendationResponse, AWSError>
    open fun describeComponentConfigurationRecommendation(callback: (err: AWSError, data: DescribeComponentConfigurationRecommendationResponse) -> Unit = definedExternally): Request<DescribeComponentConfigurationRecommendationResponse, AWSError>
    open fun describeLogPattern(params: DescribeLogPatternRequest, callback: (err: AWSError, data: DescribeLogPatternResponse) -> Unit = definedExternally): Request<DescribeLogPatternResponse, AWSError>
    open fun describeLogPattern(callback: (err: AWSError, data: DescribeLogPatternResponse) -> Unit = definedExternally): Request<DescribeLogPatternResponse, AWSError>
    open fun describeObservation(params: DescribeObservationRequest, callback: (err: AWSError, data: DescribeObservationResponse) -> Unit = definedExternally): Request<DescribeObservationResponse, AWSError>
    open fun describeObservation(callback: (err: AWSError, data: DescribeObservationResponse) -> Unit = definedExternally): Request<DescribeObservationResponse, AWSError>
    open fun describeProblem(params: DescribeProblemRequest, callback: (err: AWSError, data: DescribeProblemResponse) -> Unit = definedExternally): Request<DescribeProblemResponse, AWSError>
    open fun describeProblem(callback: (err: AWSError, data: DescribeProblemResponse) -> Unit = definedExternally): Request<DescribeProblemResponse, AWSError>
    open fun describeProblemObservations(params: DescribeProblemObservationsRequest, callback: (err: AWSError, data: DescribeProblemObservationsResponse) -> Unit = definedExternally): Request<DescribeProblemObservationsResponse, AWSError>
    open fun describeProblemObservations(callback: (err: AWSError, data: DescribeProblemObservationsResponse) -> Unit = definedExternally): Request<DescribeProblemObservationsResponse, AWSError>
    open fun listApplications(params: ListApplicationsRequest, callback: (err: AWSError, data: ListApplicationsResponse) -> Unit = definedExternally): Request<ListApplicationsResponse, AWSError>
    open fun listApplications(callback: (err: AWSError, data: ListApplicationsResponse) -> Unit = definedExternally): Request<ListApplicationsResponse, AWSError>
    open fun listComponents(params: ListComponentsRequest, callback: (err: AWSError, data: ListComponentsResponse) -> Unit = definedExternally): Request<ListComponentsResponse, AWSError>
    open fun listComponents(callback: (err: AWSError, data: ListComponentsResponse) -> Unit = definedExternally): Request<ListComponentsResponse, AWSError>
    open fun listConfigurationHistory(params: ListConfigurationHistoryRequest, callback: (err: AWSError, data: ListConfigurationHistoryResponse) -> Unit = definedExternally): Request<ListConfigurationHistoryResponse, AWSError>
    open fun listConfigurationHistory(callback: (err: AWSError, data: ListConfigurationHistoryResponse) -> Unit = definedExternally): Request<ListConfigurationHistoryResponse, AWSError>
    open fun listLogPatternSets(params: ListLogPatternSetsRequest, callback: (err: AWSError, data: ListLogPatternSetsResponse) -> Unit = definedExternally): Request<ListLogPatternSetsResponse, AWSError>
    open fun listLogPatternSets(callback: (err: AWSError, data: ListLogPatternSetsResponse) -> Unit = definedExternally): Request<ListLogPatternSetsResponse, AWSError>
    open fun listLogPatterns(params: ListLogPatternsRequest, callback: (err: AWSError, data: ListLogPatternsResponse) -> Unit = definedExternally): Request<ListLogPatternsResponse, AWSError>
    open fun listLogPatterns(callback: (err: AWSError, data: ListLogPatternsResponse) -> Unit = definedExternally): Request<ListLogPatternsResponse, AWSError>
    open fun listProblems(params: ListProblemsRequest, callback: (err: AWSError, data: ListProblemsResponse) -> Unit = definedExternally): Request<ListProblemsResponse, AWSError>
    open fun listProblems(callback: (err: AWSError, data: ListProblemsResponse) -> Unit = definedExternally): Request<ListProblemsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateApplication(params: UpdateApplicationRequest, callback: (err: AWSError, data: UpdateApplicationResponse) -> Unit = definedExternally): Request<UpdateApplicationResponse, AWSError>
    open fun updateApplication(callback: (err: AWSError, data: UpdateApplicationResponse) -> Unit = definedExternally): Request<UpdateApplicationResponse, AWSError>
    open fun updateComponent(params: UpdateComponentRequest, callback: (err: AWSError, data: UpdateComponentResponse) -> Unit = definedExternally): Request<UpdateComponentResponse, AWSError>
    open fun updateComponent(callback: (err: AWSError, data: UpdateComponentResponse) -> Unit = definedExternally): Request<UpdateComponentResponse, AWSError>
    open fun updateComponentConfiguration(params: UpdateComponentConfigurationRequest, callback: (err: AWSError, data: UpdateComponentConfigurationResponse) -> Unit = definedExternally): Request<UpdateComponentConfigurationResponse, AWSError>
    open fun updateComponentConfiguration(callback: (err: AWSError, data: UpdateComponentConfigurationResponse) -> Unit = definedExternally): Request<UpdateComponentConfigurationResponse, AWSError>
    open fun updateLogPattern(params: UpdateLogPatternRequest, callback: (err: AWSError, data: UpdateLogPatternResponse) -> Unit = definedExternally): Request<UpdateLogPatternResponse, AWSError>
    open fun updateLogPattern(callback: (err: AWSError, data: UpdateLogPatternResponse) -> Unit = definedExternally): Request<UpdateLogPatternResponse, AWSError>
    interface ApplicationComponent {
        var ComponentName: ComponentName?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: String /* "DEFAULT" | "DOT_NET_CORE" | "DOT_NET_WORKER" | "DOT_NET_WEB" | "SQL_SERVER" | String */
        var Monitor: Monitor?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationInfo {
        var ResourceGroupName: ResourceGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var LifeCycle: LifeCycle?
            get() = definedExternally
            set(value) = definedExternally
        var OpsItemSNSTopicArn: OpsItemSNSTopicArn?
            get() = definedExternally
            set(value) = definedExternally
        var OpsCenterEnabled: OpsCenterEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var CWEMonitorEnabled: CWEMonitorEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var Remarks: Remarks?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationEvent {
        var MonitoredResourceARN: ConfigurationEventMonitoredResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var EventStatus: String /* "INFO" | "WARN" | "ERROR" | String */
        var EventResourceType: String /* "CLOUDWATCH_ALARM" | "CLOUDFORMATION" | "SSM_ASSOCIATION" | String */
        var EventTime: ConfigurationEventTime?
            get() = definedExternally
            set(value) = definedExternally
        var EventDetail: ConfigurationEventDetail?
            get() = definedExternally
            set(value) = definedExternally
        var EventResourceName: ConfigurationEventResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationRequest {
        var ResourceGroupName: ResourceGroupName
        var OpsCenterEnabled: OpsCenterEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var CWEMonitorEnabled: CWEMonitorEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var OpsItemSNSTopicArn: OpsItemSNSTopicArn?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationResponse {
        var ApplicationInfo: ApplicationInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateComponentRequest {
        var ResourceGroupName: ResourceGroupName
        var ComponentName: ComponentName
        var ResourceList: ResourceList
    }
    interface CreateComponentResponse
    interface CreateLogPatternRequest {
        var ResourceGroupName: ResourceGroupName
        var PatternSetName: LogPatternSetName
        var PatternName: LogPatternName
        var Pattern: LogPatternRegex
        var Rank: LogPatternRank
    }
    interface CreateLogPatternResponse {
        var LogPattern: LogPattern?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceGroupName: ResourceGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApplicationRequest {
        var ResourceGroupName: ResourceGroupName
    }
    interface DeleteApplicationResponse
    interface DeleteComponentRequest {
        var ResourceGroupName: ResourceGroupName
        var ComponentName: ComponentName
    }
    interface DeleteComponentResponse
    interface DeleteLogPatternRequest {
        var ResourceGroupName: ResourceGroupName
        var PatternSetName: LogPatternSetName
        var PatternName: LogPatternName
    }
    interface DeleteLogPatternResponse
    interface DescribeApplicationRequest {
        var ResourceGroupName: ResourceGroupName
    }
    interface DescribeApplicationResponse {
        var ApplicationInfo: ApplicationInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeComponentConfigurationRecommendationRequest {
        var ResourceGroupName: ResourceGroupName
        var ComponentName: ComponentName
        var Tier: String /* "DEFAULT" | "DOT_NET_CORE" | "DOT_NET_WORKER" | "DOT_NET_WEB" | "SQL_SERVER" | String */
    }
    interface DescribeComponentConfigurationRecommendationResponse {
        var ComponentConfiguration: ComponentConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeComponentConfigurationRequest {
        var ResourceGroupName: ResourceGroupName
        var ComponentName: ComponentName
    }
    interface DescribeComponentConfigurationResponse {
        var Monitor: Monitor?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: String /* "DEFAULT" | "DOT_NET_CORE" | "DOT_NET_WORKER" | "DOT_NET_WEB" | "SQL_SERVER" | String */
        var ComponentConfiguration: ComponentConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeComponentRequest {
        var ResourceGroupName: ResourceGroupName
        var ComponentName: ComponentName
    }
    interface DescribeComponentResponse {
        var ApplicationComponent: ApplicationComponent?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceList: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLogPatternRequest {
        var ResourceGroupName: ResourceGroupName
        var PatternSetName: LogPatternSetName
        var PatternName: LogPatternName
    }
    interface DescribeLogPatternResponse {
        var ResourceGroupName: ResourceGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var LogPattern: LogPattern?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeObservationRequest {
        var ObservationId: ObservationId
    }
    interface DescribeObservationResponse {
        var Observation: Observation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProblemObservationsRequest {
        var ProblemId: ProblemId
    }
    interface DescribeProblemObservationsResponse {
        var RelatedObservations: RelatedObservations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProblemRequest {
        var ProblemId: ProblemId
    }
    interface DescribeProblemResponse {
        var Problem: Problem?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Feedback {
        @nativeGetter
        operator fun get(key: String): String /* "NOT_SPECIFIED" | "USEFUL" | "NOT_USEFUL" | String */
        @nativeSetter
        operator fun set(key: String, value: String)
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface ListApplicationsRequest {
        var MaxResults: MaxEntities?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApplicationsResponse {
        var ApplicationInfoList: ApplicationInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComponentsRequest {
        var ResourceGroupName: ResourceGroupName
        var MaxResults: MaxEntities?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComponentsResponse {
        var ApplicationComponentList: ApplicationComponentList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationHistoryRequest {
        var ResourceGroupName: ResourceGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: StartTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: EndTime?
            get() = definedExternally
            set(value) = definedExternally
        var EventStatus: String /* "INFO" | "WARN" | "ERROR" | String */
        var MaxResults: MaxEntities?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationHistoryResponse {
        var EventList: ConfigurationEventList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLogPatternSetsRequest {
        var ResourceGroupName: ResourceGroupName
        var MaxResults: MaxEntities?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLogPatternSetsResponse {
        var ResourceGroupName: ResourceGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var LogPatternSets: LogPatternSetList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLogPatternsRequest {
        var ResourceGroupName: ResourceGroupName
        var PatternSetName: LogPatternSetName?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxEntities?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLogPatternsResponse {
        var ResourceGroupName: ResourceGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var LogPatterns: LogPatternList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProblemsRequest {
        var ResourceGroupName: ResourceGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: StartTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: EndTime?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxEntities?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProblemsResponse {
        var ProblemList: ProblemList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceARN: AmazonResourceName
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogPattern {
        var PatternSetName: LogPatternSetName?
            get() = definedExternally
            set(value) = definedExternally
        var PatternName: LogPatternName?
            get() = definedExternally
            set(value) = definedExternally
        var Pattern: LogPatternRegex?
            get() = definedExternally
            set(value) = definedExternally
        var Rank: LogPatternRank?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Observation {
        var Id: ObservationId?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: StartTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: EndTime?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: SourceType?
            get() = definedExternally
            set(value) = definedExternally
        var SourceARN: SourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var LogGroup: LogGroup?
            get() = definedExternally
            set(value) = definedExternally
        var LineTime: LineTime?
            get() = definedExternally
            set(value) = definedExternally
        var LogText: LogText?
            get() = definedExternally
            set(value) = definedExternally
        var LogFilter: String /* "ERROR" | "WARN" | "INFO" | String */
        var MetricNamespace: MetricNamespace?
            get() = definedExternally
            set(value) = definedExternally
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: Unit?
            get() = definedExternally
            set(value) = definedExternally
        var Value: Value?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchEventId: CloudWatchEventId?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchEventSource: String /* "EC2" | "CODE_DEPLOY" | "HEALTH" | String */
        var CloudWatchEventDetailType: CloudWatchEventDetailType?
            get() = definedExternally
            set(value) = definedExternally
        var HealthEventArn: HealthEventArn?
            get() = definedExternally
            set(value) = definedExternally
        var HealthService: HealthService?
            get() = definedExternally
            set(value) = definedExternally
        var HealthEventTypeCode: HealthEventTypeCode?
            get() = definedExternally
            set(value) = definedExternally
        var HealthEventTypeCategory: HealthEventTypeCategory?
            get() = definedExternally
            set(value) = definedExternally
        var HealthEventDescription: HealthEventDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CodeDeployDeploymentId: CodeDeployDeploymentId?
            get() = definedExternally
            set(value) = definedExternally
        var CodeDeployDeploymentGroup: CodeDeployDeploymentGroup?
            get() = definedExternally
            set(value) = definedExternally
        var CodeDeployState: CodeDeployState?
            get() = definedExternally
            set(value) = definedExternally
        var CodeDeployApplication: CodeDeployApplication?
            get() = definedExternally
            set(value) = definedExternally
        var CodeDeployInstanceGroupId: CodeDeployInstanceGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2State: Ec2State?
            get() = definedExternally
            set(value) = definedExternally
        var XRayFaultPercent: XRayFaultPercent?
            get() = definedExternally
            set(value) = definedExternally
        var XRayThrottlePercent: XRayThrottlePercent?
            get() = definedExternally
            set(value) = definedExternally
        var XRayErrorPercent: XRayErrorPercent?
            get() = definedExternally
            set(value) = definedExternally
        var XRayRequestCount: XRayRequestCount?
            get() = definedExternally
            set(value) = definedExternally
        var XRayRequestAverageLatency: XRayRequestAverageLatency?
            get() = definedExternally
            set(value) = definedExternally
        var XRayNodeName: XRayNodeName?
            get() = definedExternally
            set(value) = definedExternally
        var XRayNodeType: XRayNodeType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Problem {
        var Id: ProblemId?
            get() = definedExternally
            set(value) = definedExternally
        var Title: Title?
            get() = definedExternally
            set(value) = definedExternally
        var Insights: Insights?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "IGNORE" | "RESOLVED" | "PENDING" | String */
        var AffectedResource: AffectedResource?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: StartTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: EndTime?
            get() = definedExternally
            set(value) = definedExternally
        var SeverityLevel: String /* "Low" | "Medium" | "High" | String */
        var ResourceGroupName: ResourceGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Feedback: Feedback?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelatedObservations {
        var ObservationList: ObservationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceARN: AmazonResourceName
        var Tags: TagList
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var ResourceARN: AmazonResourceName
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateApplicationRequest {
        var ResourceGroupName: ResourceGroupName
        var OpsCenterEnabled: OpsCenterEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var CWEMonitorEnabled: CWEMonitorEnabled?
            get() = definedExternally
            set(value) = definedExternally
        var OpsItemSNSTopicArn: OpsItemSNSTopicArn?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveSNSTopic: RemoveSNSTopic?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApplicationResponse {
        var ApplicationInfo: ApplicationInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateComponentConfigurationRequest {
        var ResourceGroupName: ResourceGroupName
        var ComponentName: ComponentName
        var Monitor: Monitor?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: String /* "DEFAULT" | "DOT_NET_CORE" | "DOT_NET_WORKER" | "DOT_NET_WEB" | "SQL_SERVER" | String */
        var ComponentConfiguration: ComponentConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateComponentConfigurationResponse
    interface UpdateComponentRequest {
        var ResourceGroupName: ResourceGroupName
        var ComponentName: ComponentName
        var NewComponentName: NewComponentName?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceList: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateComponentResponse
    interface UpdateLogPatternRequest {
        var ResourceGroupName: ResourceGroupName
        var PatternSetName: LogPatternSetName
        var PatternName: LogPatternName
        var Pattern: LogPatternRegex?
            get() = definedExternally
            set(value) = definedExternally
        var Rank: LogPatternRank?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLogPatternResponse {
        var ResourceGroupName: ResourceGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var LogPattern: LogPattern?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-11-25" | "latest" | String */
    }
}