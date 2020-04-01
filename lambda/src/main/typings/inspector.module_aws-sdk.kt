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
import Inspector.AgentPreview
import Inspector.AssessmentRunAgent
import Inspector.AssessmentRun
import Inspector.AssessmentRunNotification
import Inspector.AssessmentRunStateChange
import Inspector.AssessmentTarget
import Inspector.AssessmentTemplate
import Inspector.Attribute
import Inspector.EventSubscription
import Inspector.ExclusionPreview
import Inspector.Finding
import Inspector.NetworkInterface
import Inspector.PrivateIp
import Inspector.ResourceGroup
import Inspector.ResourceGroupTag
import Inspector.RulesPackage
import Inspector.Scope
import Inspector.SecurityGroup
import Inspector.Subscription
import Inspector.Tag
import Inspector.TelemetryMetadata
import Inspector.AddAttributesToFindingsRequest
import Inspector.AddAttributesToFindingsResponse
import Inspector.CreateAssessmentTargetRequest
import Inspector.CreateAssessmentTargetResponse
import Inspector.CreateAssessmentTemplateRequest
import Inspector.CreateAssessmentTemplateResponse
import Inspector.CreateExclusionsPreviewRequest
import Inspector.CreateExclusionsPreviewResponse
import Inspector.CreateResourceGroupRequest
import Inspector.CreateResourceGroupResponse
import Inspector.DeleteAssessmentRunRequest
import Inspector.DeleteAssessmentTargetRequest
import Inspector.DeleteAssessmentTemplateRequest
import Inspector.DescribeAssessmentRunsRequest
import Inspector.DescribeAssessmentRunsResponse
import Inspector.DescribeAssessmentTargetsRequest
import Inspector.DescribeAssessmentTargetsResponse
import Inspector.DescribeAssessmentTemplatesRequest
import Inspector.DescribeAssessmentTemplatesResponse
import Inspector.DescribeCrossAccountAccessRoleResponse
import Inspector.DescribeExclusionsRequest
import Inspector.DescribeExclusionsResponse
import Inspector.DescribeFindingsRequest
import Inspector.DescribeFindingsResponse
import Inspector.DescribeResourceGroupsRequest
import Inspector.DescribeResourceGroupsResponse
import Inspector.DescribeRulesPackagesRequest
import Inspector.DescribeRulesPackagesResponse
import Inspector.GetAssessmentReportRequest
import Inspector.GetAssessmentReportResponse
import Inspector.GetExclusionsPreviewRequest
import Inspector.GetExclusionsPreviewResponse
import Inspector.GetTelemetryMetadataRequest
import Inspector.GetTelemetryMetadataResponse
import Inspector.ListAssessmentRunAgentsRequest
import Inspector.ListAssessmentRunAgentsResponse
import Inspector.ListAssessmentRunsRequest
import Inspector.ListAssessmentRunsResponse
import Inspector.ListAssessmentTargetsRequest
import Inspector.ListAssessmentTargetsResponse
import Inspector.ListAssessmentTemplatesRequest
import Inspector.ListAssessmentTemplatesResponse
import Inspector.ListEventSubscriptionsRequest
import Inspector.ListEventSubscriptionsResponse
import Inspector.ListExclusionsRequest
import Inspector.ListExclusionsResponse
import Inspector.ListFindingsRequest
import Inspector.ListFindingsResponse
import Inspector.ListRulesPackagesRequest
import Inspector.ListRulesPackagesResponse
import Inspector.ListTagsForResourceRequest
import Inspector.ListTagsForResourceResponse
import Inspector.PreviewAgentsRequest
import Inspector.PreviewAgentsResponse
import Inspector.RegisterCrossAccountAccessRoleRequest
import Inspector.RemoveAttributesFromFindingsRequest
import Inspector.RemoveAttributesFromFindingsResponse
import Inspector.SetTagsForResourceRequest
import Inspector.StartAssessmentRunRequest
import Inspector.StartAssessmentRunResponse
import Inspector.StopAssessmentRunRequest
import Inspector.SubscribeToEventRequest
import Inspector.UnsubscribeFromEventRequest
import Inspector.UpdateAssessmentTargetRequest
import Inspector.FailedItems
import Inspector.AssessmentRunFindingCounts
import Inspector.DurationRange
import Inspector.TimestampRange
import Inspector.ExclusionMap
import Inspector.Exclusion
import Inspector.FailedItemDetails
import Inspector.InspectorServiceAttributes
import Inspector.AssetAttributes
import Inspector.AgentFilter
import Inspector.AssessmentRunFilter
import Inspector.AssessmentTargetFilter
import Inspector.AssessmentTemplateFilter
import Inspector.FindingFilter

typealias AddRemoveAttributesFindingArnList = Array<Arn>

typealias AgentHealthCodeList = Array<String /* "IDLE" | "RUNNING" | "SHUTDOWN" | "UNHEALTHY" | "THROTTLED" | "UNKNOWN" | String */>

typealias AgentHealthList = Array<String /* "HEALTHY" | "UNHEALTHY" | "UNKNOWN" | String */>

typealias AgentId = String

typealias AgentIdList = Array<AgentId>

typealias AgentPreviewList = Array<AgentPreview>

typealias AgentVersion = String

typealias AmiId = String

typealias Arn = String

typealias ArnCount = Number

typealias AssessmentRulesPackageArnList = Array<Arn>

typealias AssessmentRunAgentList = Array<AssessmentRunAgent>

typealias AssessmentRunDuration = Number

typealias AssessmentRunList = Array<AssessmentRun>

typealias AssessmentRunName = String

typealias AssessmentRunNotificationList = Array<AssessmentRunNotification>

typealias AssessmentRunStateChangeList = Array<AssessmentRunStateChange>

typealias AssessmentRunStateList = Array<String /* "CREATED" | "START_DATA_COLLECTION_PENDING" | "START_DATA_COLLECTION_IN_PROGRESS" | "COLLECTING_DATA" | "STOP_DATA_COLLECTION_PENDING" | "DATA_COLLECTED" | "START_EVALUATING_RULES_PENDING" | "EVALUATING_RULES" | "FAILED" | "ERROR" | "COMPLETED" | "COMPLETED_WITH_ERRORS" | "CANCELED" | String */>

typealias AssessmentTargetList = Array<AssessmentTarget>

typealias AssessmentTargetName = String

typealias AssessmentTemplateList = Array<AssessmentTemplate>

typealias AssessmentTemplateName = String

typealias AssessmentTemplateRulesPackageArnList = Array<Arn>

typealias AttributeKey = String

typealias AttributeList = Array<Attribute>

typealias AttributeValue = String

typealias AutoScalingGroup = String

typealias AutoScalingGroupList = Array<AutoScalingGroup>

typealias BatchDescribeArnList = Array<Arn>

typealias BatchDescribeExclusionsArnList = Array<Arn>

typealias Bool = Boolean

typealias EventSubscriptionList = Array<EventSubscription>

typealias ExclusionPreviewList = Array<ExclusionPreview>

typealias FilterRulesPackageArnList = Array<Arn>

typealias FindingCount = Number

typealias FindingId = String

typealias FindingList = Array<Finding>

typealias Hostname = String

typealias IocConfidence = Number

typealias Ipv4Address = String

typealias Ipv4AddressList = Array<Ipv4Address>

typealias Ipv6Addresses = Array<Text>

typealias KernelVersion = String

typealias ListEventSubscriptionsMaxResults = Number

typealias ListMaxResults = Number

typealias ListParentArnList = Array<Arn>

typealias ListReturnedArnList = Array<Arn>

typealias Long = Number

typealias Message = String

typealias MessageType = String

typealias NamePattern = String

typealias NetworkInterfaces = Array<NetworkInterface>

typealias NumericSeverity = Number

typealias NumericVersion = Number

typealias OperatingSystem = String

typealias PaginationToken = String

typealias PreviewAgentsMaxResults = Number

typealias PrivateIpAddresses = Array<PrivateIp>

typealias ProviderName = String

typealias ResourceGroupList = Array<ResourceGroup>

typealias ResourceGroupTags = Array<ResourceGroupTag>

typealias RuleName = String

typealias RuleNameList = Array<RuleName>

typealias RulesPackageList = Array<RulesPackage>

typealias RulesPackageName = String

typealias ScopeList = Array<Scope>

typealias ScopeValue = String

typealias SecurityGroups = Array<SecurityGroup>

typealias ServiceName = String

typealias SeverityList = Array<String /* "Low" | "Medium" | "High" | "Informational" | "Undefined" | String */>

typealias SubscriptionList = Array<Subscription>

typealias TagKey = String

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TelemetryMetadataList = Array<TelemetryMetadata>

typealias Text = String

typealias Timestamp = Date

typealias UUID = String

typealias Url = String

typealias UserAttributeKeyList = Array<AttributeKey>

typealias UserAttributeList = Array<Attribute>

typealias Version = String

@JsModule("aws-sdk")
external open class Inspector(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Inspector.Types.ClientConfiguration */
    open fun addAttributesToFindings(params: AddAttributesToFindingsRequest, callback: (err: AWSError, data: AddAttributesToFindingsResponse) -> Unit = definedExternally): Request<AddAttributesToFindingsResponse, AWSError>
    open fun addAttributesToFindings(callback: (err: AWSError, data: AddAttributesToFindingsResponse) -> Unit = definedExternally): Request<AddAttributesToFindingsResponse, AWSError>
    open fun createAssessmentTarget(params: CreateAssessmentTargetRequest, callback: (err: AWSError, data: CreateAssessmentTargetResponse) -> Unit = definedExternally): Request<CreateAssessmentTargetResponse, AWSError>
    open fun createAssessmentTarget(callback: (err: AWSError, data: CreateAssessmentTargetResponse) -> Unit = definedExternally): Request<CreateAssessmentTargetResponse, AWSError>
    open fun createAssessmentTemplate(params: CreateAssessmentTemplateRequest, callback: (err: AWSError, data: CreateAssessmentTemplateResponse) -> Unit = definedExternally): Request<CreateAssessmentTemplateResponse, AWSError>
    open fun createAssessmentTemplate(callback: (err: AWSError, data: CreateAssessmentTemplateResponse) -> Unit = definedExternally): Request<CreateAssessmentTemplateResponse, AWSError>
    open fun createExclusionsPreview(params: CreateExclusionsPreviewRequest, callback: (err: AWSError, data: CreateExclusionsPreviewResponse) -> Unit = definedExternally): Request<CreateExclusionsPreviewResponse, AWSError>
    open fun createExclusionsPreview(callback: (err: AWSError, data: CreateExclusionsPreviewResponse) -> Unit = definedExternally): Request<CreateExclusionsPreviewResponse, AWSError>
    open fun createResourceGroup(params: CreateResourceGroupRequest, callback: (err: AWSError, data: CreateResourceGroupResponse) -> Unit = definedExternally): Request<CreateResourceGroupResponse, AWSError>
    open fun createResourceGroup(callback: (err: AWSError, data: CreateResourceGroupResponse) -> Unit = definedExternally): Request<CreateResourceGroupResponse, AWSError>
    open fun deleteAssessmentRun(params: DeleteAssessmentRunRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAssessmentRun(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAssessmentTarget(params: DeleteAssessmentTargetRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAssessmentTarget(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAssessmentTemplate(params: DeleteAssessmentTemplateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAssessmentTemplate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeAssessmentRuns(params: DescribeAssessmentRunsRequest, callback: (err: AWSError, data: DescribeAssessmentRunsResponse) -> Unit = definedExternally): Request<DescribeAssessmentRunsResponse, AWSError>
    open fun describeAssessmentRuns(callback: (err: AWSError, data: DescribeAssessmentRunsResponse) -> Unit = definedExternally): Request<DescribeAssessmentRunsResponse, AWSError>
    open fun describeAssessmentTargets(params: DescribeAssessmentTargetsRequest, callback: (err: AWSError, data: DescribeAssessmentTargetsResponse) -> Unit = definedExternally): Request<DescribeAssessmentTargetsResponse, AWSError>
    open fun describeAssessmentTargets(callback: (err: AWSError, data: DescribeAssessmentTargetsResponse) -> Unit = definedExternally): Request<DescribeAssessmentTargetsResponse, AWSError>
    open fun describeAssessmentTemplates(params: DescribeAssessmentTemplatesRequest, callback: (err: AWSError, data: DescribeAssessmentTemplatesResponse) -> Unit = definedExternally): Request<DescribeAssessmentTemplatesResponse, AWSError>
    open fun describeAssessmentTemplates(callback: (err: AWSError, data: DescribeAssessmentTemplatesResponse) -> Unit = definedExternally): Request<DescribeAssessmentTemplatesResponse, AWSError>
    open fun describeCrossAccountAccessRole(callback: (err: AWSError, data: DescribeCrossAccountAccessRoleResponse) -> Unit = definedExternally): Request<DescribeCrossAccountAccessRoleResponse, AWSError>
    open fun describeExclusions(params: DescribeExclusionsRequest, callback: (err: AWSError, data: DescribeExclusionsResponse) -> Unit = definedExternally): Request<DescribeExclusionsResponse, AWSError>
    open fun describeExclusions(callback: (err: AWSError, data: DescribeExclusionsResponse) -> Unit = definedExternally): Request<DescribeExclusionsResponse, AWSError>
    open fun describeFindings(params: DescribeFindingsRequest, callback: (err: AWSError, data: DescribeFindingsResponse) -> Unit = definedExternally): Request<DescribeFindingsResponse, AWSError>
    open fun describeFindings(callback: (err: AWSError, data: DescribeFindingsResponse) -> Unit = definedExternally): Request<DescribeFindingsResponse, AWSError>
    open fun describeResourceGroups(params: DescribeResourceGroupsRequest, callback: (err: AWSError, data: DescribeResourceGroupsResponse) -> Unit = definedExternally): Request<DescribeResourceGroupsResponse, AWSError>
    open fun describeResourceGroups(callback: (err: AWSError, data: DescribeResourceGroupsResponse) -> Unit = definedExternally): Request<DescribeResourceGroupsResponse, AWSError>
    open fun describeRulesPackages(params: DescribeRulesPackagesRequest, callback: (err: AWSError, data: DescribeRulesPackagesResponse) -> Unit = definedExternally): Request<DescribeRulesPackagesResponse, AWSError>
    open fun describeRulesPackages(callback: (err: AWSError, data: DescribeRulesPackagesResponse) -> Unit = definedExternally): Request<DescribeRulesPackagesResponse, AWSError>
    open fun getAssessmentReport(params: GetAssessmentReportRequest, callback: (err: AWSError, data: GetAssessmentReportResponse) -> Unit = definedExternally): Request<GetAssessmentReportResponse, AWSError>
    open fun getAssessmentReport(callback: (err: AWSError, data: GetAssessmentReportResponse) -> Unit = definedExternally): Request<GetAssessmentReportResponse, AWSError>
    open fun getExclusionsPreview(params: GetExclusionsPreviewRequest, callback: (err: AWSError, data: GetExclusionsPreviewResponse) -> Unit = definedExternally): Request<GetExclusionsPreviewResponse, AWSError>
    open fun getExclusionsPreview(callback: (err: AWSError, data: GetExclusionsPreviewResponse) -> Unit = definedExternally): Request<GetExclusionsPreviewResponse, AWSError>
    open fun getTelemetryMetadata(params: GetTelemetryMetadataRequest, callback: (err: AWSError, data: GetTelemetryMetadataResponse) -> Unit = definedExternally): Request<GetTelemetryMetadataResponse, AWSError>
    open fun getTelemetryMetadata(callback: (err: AWSError, data: GetTelemetryMetadataResponse) -> Unit = definedExternally): Request<GetTelemetryMetadataResponse, AWSError>
    open fun listAssessmentRunAgents(params: ListAssessmentRunAgentsRequest, callback: (err: AWSError, data: ListAssessmentRunAgentsResponse) -> Unit = definedExternally): Request<ListAssessmentRunAgentsResponse, AWSError>
    open fun listAssessmentRunAgents(callback: (err: AWSError, data: ListAssessmentRunAgentsResponse) -> Unit = definedExternally): Request<ListAssessmentRunAgentsResponse, AWSError>
    open fun listAssessmentRuns(params: ListAssessmentRunsRequest, callback: (err: AWSError, data: ListAssessmentRunsResponse) -> Unit = definedExternally): Request<ListAssessmentRunsResponse, AWSError>
    open fun listAssessmentRuns(callback: (err: AWSError, data: ListAssessmentRunsResponse) -> Unit = definedExternally): Request<ListAssessmentRunsResponse, AWSError>
    open fun listAssessmentTargets(params: ListAssessmentTargetsRequest, callback: (err: AWSError, data: ListAssessmentTargetsResponse) -> Unit = definedExternally): Request<ListAssessmentTargetsResponse, AWSError>
    open fun listAssessmentTargets(callback: (err: AWSError, data: ListAssessmentTargetsResponse) -> Unit = definedExternally): Request<ListAssessmentTargetsResponse, AWSError>
    open fun listAssessmentTemplates(params: ListAssessmentTemplatesRequest, callback: (err: AWSError, data: ListAssessmentTemplatesResponse) -> Unit = definedExternally): Request<ListAssessmentTemplatesResponse, AWSError>
    open fun listAssessmentTemplates(callback: (err: AWSError, data: ListAssessmentTemplatesResponse) -> Unit = definedExternally): Request<ListAssessmentTemplatesResponse, AWSError>
    open fun listEventSubscriptions(params: ListEventSubscriptionsRequest, callback: (err: AWSError, data: ListEventSubscriptionsResponse) -> Unit = definedExternally): Request<ListEventSubscriptionsResponse, AWSError>
    open fun listEventSubscriptions(callback: (err: AWSError, data: ListEventSubscriptionsResponse) -> Unit = definedExternally): Request<ListEventSubscriptionsResponse, AWSError>
    open fun listExclusions(params: ListExclusionsRequest, callback: (err: AWSError, data: ListExclusionsResponse) -> Unit = definedExternally): Request<ListExclusionsResponse, AWSError>
    open fun listExclusions(callback: (err: AWSError, data: ListExclusionsResponse) -> Unit = definedExternally): Request<ListExclusionsResponse, AWSError>
    open fun listFindings(params: ListFindingsRequest, callback: (err: AWSError, data: ListFindingsResponse) -> Unit = definedExternally): Request<ListFindingsResponse, AWSError>
    open fun listFindings(callback: (err: AWSError, data: ListFindingsResponse) -> Unit = definedExternally): Request<ListFindingsResponse, AWSError>
    open fun listRulesPackages(params: ListRulesPackagesRequest, callback: (err: AWSError, data: ListRulesPackagesResponse) -> Unit = definedExternally): Request<ListRulesPackagesResponse, AWSError>
    open fun listRulesPackages(callback: (err: AWSError, data: ListRulesPackagesResponse) -> Unit = definedExternally): Request<ListRulesPackagesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun previewAgents(params: PreviewAgentsRequest, callback: (err: AWSError, data: PreviewAgentsResponse) -> Unit = definedExternally): Request<PreviewAgentsResponse, AWSError>
    open fun previewAgents(callback: (err: AWSError, data: PreviewAgentsResponse) -> Unit = definedExternally): Request<PreviewAgentsResponse, AWSError>
    open fun registerCrossAccountAccessRole(params: RegisterCrossAccountAccessRoleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerCrossAccountAccessRole(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeAttributesFromFindings(params: RemoveAttributesFromFindingsRequest, callback: (err: AWSError, data: RemoveAttributesFromFindingsResponse) -> Unit = definedExternally): Request<RemoveAttributesFromFindingsResponse, AWSError>
    open fun removeAttributesFromFindings(callback: (err: AWSError, data: RemoveAttributesFromFindingsResponse) -> Unit = definedExternally): Request<RemoveAttributesFromFindingsResponse, AWSError>
    open fun setTagsForResource(params: SetTagsForResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setTagsForResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startAssessmentRun(params: StartAssessmentRunRequest, callback: (err: AWSError, data: StartAssessmentRunResponse) -> Unit = definedExternally): Request<StartAssessmentRunResponse, AWSError>
    open fun startAssessmentRun(callback: (err: AWSError, data: StartAssessmentRunResponse) -> Unit = definedExternally): Request<StartAssessmentRunResponse, AWSError>
    open fun stopAssessmentRun(params: StopAssessmentRunRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopAssessmentRun(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun subscribeToEvent(params: SubscribeToEventRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun subscribeToEvent(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unsubscribeFromEvent(params: UnsubscribeFromEventRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unsubscribeFromEvent(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAssessmentTarget(params: UpdateAssessmentTargetRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAssessmentTarget(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface AddAttributesToFindingsRequest {
        var findingArns: AddRemoveAttributesFindingArnList
        var attributes: UserAttributeList
    }
    interface AddAttributesToFindingsResponse {
        var failedItems: FailedItems
    }
    interface AgentFilter {
        var agentHealths: AgentHealthList
        var agentHealthCodes: AgentHealthCodeList
    }
    interface AgentPreview {
        var hostname: Hostname?
            get() = definedExternally
            set(value) = definedExternally
        var agentId: AgentId
        var autoScalingGroup: AutoScalingGroup?
            get() = definedExternally
            set(value) = definedExternally
        var agentHealth: String /* "HEALTHY" | "UNHEALTHY" | "UNKNOWN" | String */
        var agentVersion: AgentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var operatingSystem: OperatingSystem?
            get() = definedExternally
            set(value) = definedExternally
        var kernelVersion: KernelVersion?
            get() = definedExternally
            set(value) = definedExternally
        var ipv4Address: Ipv4Address?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssessmentRun {
        var arn: Arn
        var name: AssessmentRunName
        var assessmentTemplateArn: Arn
        var state: String /* "CREATED" | "START_DATA_COLLECTION_PENDING" | "START_DATA_COLLECTION_IN_PROGRESS" | "COLLECTING_DATA" | "STOP_DATA_COLLECTION_PENDING" | "DATA_COLLECTED" | "START_EVALUATING_RULES_PENDING" | "EVALUATING_RULES" | "FAILED" | "ERROR" | "COMPLETED" | "COMPLETED_WITH_ERRORS" | "CANCELED" | String */
        var durationInSeconds: AssessmentRunDuration
        var rulesPackageArns: AssessmentRulesPackageArnList
        var userAttributesForFindings: UserAttributeList
        var createdAt: Timestamp
        var startedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var completedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var stateChangedAt: Timestamp
        var dataCollected: Bool
        var stateChanges: AssessmentRunStateChangeList
        var notifications: AssessmentRunNotificationList
        var findingCounts: AssessmentRunFindingCounts
    }
    interface AssessmentRunAgent {
        var agentId: AgentId
        var assessmentRunArn: Arn
        var agentHealth: String /* "HEALTHY" | "UNHEALTHY" | "UNKNOWN" | String */
        var agentHealthCode: String /* "IDLE" | "RUNNING" | "SHUTDOWN" | "UNHEALTHY" | "THROTTLED" | "UNKNOWN" | String */
        var agentHealthDetails: Message?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroup: AutoScalingGroup?
            get() = definedExternally
            set(value) = definedExternally
        var telemetryMetadata: TelemetryMetadataList
    }
    interface AssessmentRunFilter {
        var namePattern: NamePattern?
            get() = definedExternally
            set(value) = definedExternally
        var states: AssessmentRunStateList?
            get() = definedExternally
            set(value) = definedExternally
        var durationRange: DurationRange?
            get() = definedExternally
            set(value) = definedExternally
        var rulesPackageArns: FilterRulesPackageArnList?
            get() = definedExternally
            set(value) = definedExternally
        var startTimeRange: TimestampRange?
            get() = definedExternally
            set(value) = definedExternally
        var completionTimeRange: TimestampRange?
            get() = definedExternally
            set(value) = definedExternally
        var stateChangeTimeRange: TimestampRange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssessmentRunFindingCounts {
        @nativeGetter
        operator fun get(key: String): FindingCount?
        @nativeSetter
        operator fun set(key: String, value: FindingCount)
    }
    interface AssessmentRunNotification {
        var date: Timestamp
        var event: String /* "ASSESSMENT_RUN_STARTED" | "ASSESSMENT_RUN_COMPLETED" | "ASSESSMENT_RUN_STATE_CHANGED" | "FINDING_REPORTED" | "OTHER" | String */
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var error: Bool
        var snsTopicArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var snsPublishStatusCode: String /* "SUCCESS" | "TOPIC_DOES_NOT_EXIST" | "ACCESS_DENIED" | "INTERNAL_ERROR" | String */
    }
    interface AssessmentRunStateChange {
        var stateChangedAt: Timestamp
        var state: String /* "CREATED" | "START_DATA_COLLECTION_PENDING" | "START_DATA_COLLECTION_IN_PROGRESS" | "COLLECTING_DATA" | "STOP_DATA_COLLECTION_PENDING" | "DATA_COLLECTED" | "START_EVALUATING_RULES_PENDING" | "EVALUATING_RULES" | "FAILED" | "ERROR" | "COMPLETED" | "COMPLETED_WITH_ERRORS" | "CANCELED" | String */
    }
    interface AssessmentTarget {
        var arn: Arn
        var name: AssessmentTargetName
        var resourceGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Timestamp
        var updatedAt: Timestamp
    }
    interface AssessmentTargetFilter {
        var assessmentTargetNamePattern: NamePattern?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssessmentTemplate {
        var arn: Arn
        var name: AssessmentTemplateName
        var assessmentTargetArn: Arn
        var durationInSeconds: AssessmentRunDuration
        var rulesPackageArns: AssessmentTemplateRulesPackageArnList
        var userAttributesForFindings: UserAttributeList
        var lastAssessmentRunArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var assessmentRunCount: ArnCount
        var createdAt: Timestamp
    }
    interface AssessmentTemplateFilter {
        var namePattern: NamePattern?
            get() = definedExternally
            set(value) = definedExternally
        var durationRange: DurationRange?
            get() = definedExternally
            set(value) = definedExternally
        var rulesPackageArns: FilterRulesPackageArnList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssetAttributes {
        var schemaVersion: NumericVersion
        var agentId: AgentId?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroup: AutoScalingGroup?
            get() = definedExternally
            set(value) = definedExternally
        var amiId: AmiId?
            get() = definedExternally
            set(value) = definedExternally
        var hostname: Hostname?
            get() = definedExternally
            set(value) = definedExternally
        var ipv4Addresses: Ipv4AddressList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var networkInterfaces: NetworkInterfaces?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Attribute {
        var key: AttributeKey
        var value: AttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAssessmentTargetRequest {
        var assessmentTargetName: AssessmentTargetName
        var resourceGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAssessmentTargetResponse {
        var assessmentTargetArn: Arn
    }
    interface CreateAssessmentTemplateRequest {
        var assessmentTargetArn: Arn
        var assessmentTemplateName: AssessmentTemplateName
        var durationInSeconds: AssessmentRunDuration
        var rulesPackageArns: AssessmentTemplateRulesPackageArnList
        var userAttributesForFindings: UserAttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAssessmentTemplateResponse {
        var assessmentTemplateArn: Arn
    }
    interface CreateExclusionsPreviewRequest {
        var assessmentTemplateArn: Arn
    }
    interface CreateExclusionsPreviewResponse {
        var previewToken: UUID
    }
    interface CreateResourceGroupRequest {
        var resourceGroupTags: ResourceGroupTags
    }
    interface CreateResourceGroupResponse {
        var resourceGroupArn: Arn
    }
    interface DeleteAssessmentRunRequest {
        var assessmentRunArn: Arn
    }
    interface DeleteAssessmentTargetRequest {
        var assessmentTargetArn: Arn
    }
    interface DeleteAssessmentTemplateRequest {
        var assessmentTemplateArn: Arn
    }
    interface DescribeAssessmentRunsRequest {
        var assessmentRunArns: BatchDescribeArnList
    }
    interface DescribeAssessmentRunsResponse {
        var assessmentRuns: AssessmentRunList
        var failedItems: FailedItems
    }
    interface DescribeAssessmentTargetsRequest {
        var assessmentTargetArns: BatchDescribeArnList
    }
    interface DescribeAssessmentTargetsResponse {
        var assessmentTargets: AssessmentTargetList
        var failedItems: FailedItems
    }
    interface DescribeAssessmentTemplatesRequest {
        var assessmentTemplateArns: BatchDescribeArnList
    }
    interface DescribeAssessmentTemplatesResponse {
        var assessmentTemplates: AssessmentTemplateList
        var failedItems: FailedItems
    }
    interface DescribeCrossAccountAccessRoleResponse {
        var roleArn: Arn
        var valid: Bool
        var registeredAt: Timestamp
    }
    interface DescribeExclusionsRequest {
        var exclusionArns: BatchDescribeExclusionsArnList
        var locale: String /* "EN_US" | String */
    }
    interface DescribeExclusionsResponse {
        var exclusions: ExclusionMap
        var failedItems: FailedItems
    }
    interface DescribeFindingsRequest {
        var findingArns: BatchDescribeArnList
        var locale: String /* "EN_US" | String */
    }
    interface DescribeFindingsResponse {
        var findings: FindingList
        var failedItems: FailedItems
    }
    interface DescribeResourceGroupsRequest {
        var resourceGroupArns: BatchDescribeArnList
    }
    interface DescribeResourceGroupsResponse {
        var resourceGroups: ResourceGroupList
        var failedItems: FailedItems
    }
    interface DescribeRulesPackagesRequest {
        var rulesPackageArns: BatchDescribeArnList
        var locale: String /* "EN_US" | String */
    }
    interface DescribeRulesPackagesResponse {
        var rulesPackages: RulesPackageList
        var failedItems: FailedItems
    }
    interface DurationRange {
        var minSeconds: AssessmentRunDuration?
            get() = definedExternally
            set(value) = definedExternally
        var maxSeconds: AssessmentRunDuration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventSubscription {
        var event: String /* "ASSESSMENT_RUN_STARTED" | "ASSESSMENT_RUN_COMPLETED" | "ASSESSMENT_RUN_STATE_CHANGED" | "FINDING_REPORTED" | "OTHER" | String */
        var subscribedAt: Timestamp
    }
    interface Exclusion {
        var arn: Arn
        var title: Text
        var description: Text
        var recommendation: Text
        var scopes: ScopeList
        var attributes: AttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExclusionMap {
        @nativeGetter
        operator fun get(key: String): Exclusion?
        @nativeSetter
        operator fun set(key: String, value: Exclusion)
    }
    interface ExclusionPreview {
        var title: Text
        var description: Text
        var recommendation: Text
        var scopes: ScopeList
        var attributes: AttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailedItemDetails {
        var failureCode: String /* "INVALID_ARN" | "DUPLICATE_ARN" | "ITEM_DOES_NOT_EXIST" | "ACCESS_DENIED" | "LIMIT_EXCEEDED" | "INTERNAL_ERROR" | String */
        var retryable: Bool
    }
    interface FailedItems {
        @nativeGetter
        operator fun get(key: String): FailedItemDetails?
        @nativeSetter
        operator fun set(key: String, value: FailedItemDetails)
    }
    interface Finding {
        var arn: Arn
        var schemaVersion: NumericVersion?
            get() = definedExternally
            set(value) = definedExternally
        var service: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var serviceAttributes: InspectorServiceAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var assetType: String /* "ec2-instance" | String */
        var assetAttributes: AssetAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var id: FindingId?
            get() = definedExternally
            set(value) = definedExternally
        var title: Text?
            get() = definedExternally
            set(value) = definedExternally
        var description: Text?
            get() = definedExternally
            set(value) = definedExternally
        var recommendation: Text?
            get() = definedExternally
            set(value) = definedExternally
        var severity: String /* "Low" | "Medium" | "High" | "Informational" | "Undefined" | String */
        var numericSeverity: NumericSeverity?
            get() = definedExternally
            set(value) = definedExternally
        var confidence: IocConfidence?
            get() = definedExternally
            set(value) = definedExternally
        var indicatorOfCompromise: Bool?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: AttributeList
        var userAttributes: UserAttributeList
        var createdAt: Timestamp
        var updatedAt: Timestamp
    }
    interface FindingFilter {
        var agentIds: AgentIdList?
            get() = definedExternally
            set(value) = definedExternally
        var autoScalingGroups: AutoScalingGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var ruleNames: RuleNameList?
            get() = definedExternally
            set(value) = definedExternally
        var severities: SeverityList?
            get() = definedExternally
            set(value) = definedExternally
        var rulesPackageArns: FilterRulesPackageArnList?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: AttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var userAttributes: AttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var creationTimeRange: TimestampRange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAssessmentReportRequest {
        var assessmentRunArn: Arn
        var reportFileFormat: String /* "HTML" | "PDF" | String */
        var reportType: String /* "FINDING" | "FULL" | String */
    }
    interface GetAssessmentReportResponse {
        var status: String /* "WORK_IN_PROGRESS" | "FAILED" | "COMPLETED" | String */
        var url: Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetExclusionsPreviewRequest {
        var assessmentTemplateArn: Arn
        var previewToken: UUID
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var locale: String /* "EN_US" | String */
    }
    interface GetExclusionsPreviewResponse {
        var previewStatus: String /* "WORK_IN_PROGRESS" | "COMPLETED" | String */
        var exclusionPreviews: ExclusionPreviewList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTelemetryMetadataRequest {
        var assessmentRunArn: Arn
    }
    interface GetTelemetryMetadataResponse {
        var telemetryMetadata: TelemetryMetadataList
    }
    interface InspectorServiceAttributes {
        var schemaVersion: NumericVersion
        var assessmentRunArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var rulesPackageArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssessmentRunAgentsRequest {
        var assessmentRunArn: Arn
        var filter: AgentFilter?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssessmentRunAgentsResponse {
        var assessmentRunAgents: AssessmentRunAgentList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssessmentRunsRequest {
        var assessmentTemplateArns: ListParentArnList?
            get() = definedExternally
            set(value) = definedExternally
        var filter: AssessmentRunFilter?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssessmentRunsResponse {
        var assessmentRunArns: ListReturnedArnList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssessmentTargetsRequest {
        var filter: AssessmentTargetFilter?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssessmentTargetsResponse {
        var assessmentTargetArns: ListReturnedArnList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssessmentTemplatesRequest {
        var assessmentTargetArns: ListParentArnList?
            get() = definedExternally
            set(value) = definedExternally
        var filter: AssessmentTemplateFilter?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAssessmentTemplatesResponse {
        var assessmentTemplateArns: ListReturnedArnList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventSubscriptionsRequest {
        var resourceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ListEventSubscriptionsMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventSubscriptionsResponse {
        var subscriptions: SubscriptionList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListExclusionsRequest {
        var assessmentRunArn: Arn
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListExclusionsResponse {
        var exclusionArns: ListReturnedArnList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFindingsRequest {
        var assessmentRunArns: ListParentArnList?
            get() = definedExternally
            set(value) = definedExternally
        var filter: FindingFilter?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFindingsResponse {
        var findingArns: ListReturnedArnList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRulesPackagesRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRulesPackagesResponse {
        var rulesPackageArns: ListReturnedArnList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: Arn
    }
    interface ListTagsForResourceResponse {
        var tags: TagList
    }
    interface NetworkInterface {
        var networkInterfaceId: Text?
            get() = definedExternally
            set(value) = definedExternally
        var subnetId: Text?
            get() = definedExternally
            set(value) = definedExternally
        var vpcId: Text?
            get() = definedExternally
            set(value) = definedExternally
        var privateDnsName: Text?
            get() = definedExternally
            set(value) = definedExternally
        var privateIpAddress: Text?
            get() = definedExternally
            set(value) = definedExternally
        var privateIpAddresses: PrivateIpAddresses?
            get() = definedExternally
            set(value) = definedExternally
        var publicDnsName: Text?
            get() = definedExternally
            set(value) = definedExternally
        var publicIp: Text?
            get() = definedExternally
            set(value) = definedExternally
        var ipv6Addresses: Ipv6Addresses?
            get() = definedExternally
            set(value) = definedExternally
        var securityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PreviewAgentsRequest {
        var previewAgentsArn: Arn
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: PreviewAgentsMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PreviewAgentsResponse {
        var agentPreviews: AgentPreviewList
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PrivateIp {
        var privateDnsName: Text?
            get() = definedExternally
            set(value) = definedExternally
        var privateIpAddress: Text?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterCrossAccountAccessRoleRequest {
        var roleArn: Arn
    }
    interface RemoveAttributesFromFindingsRequest {
        var findingArns: AddRemoveAttributesFindingArnList
        var attributeKeys: UserAttributeKeyList
    }
    interface RemoveAttributesFromFindingsResponse {
        var failedItems: FailedItems
    }
    interface ResourceGroup {
        var arn: Arn
        var tags: ResourceGroupTags
        var createdAt: Timestamp
    }
    interface ResourceGroupTag {
        var key: TagKey
        var value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RulesPackage {
        var arn: Arn
        var name: RulesPackageName
        var version: Version
        var provider: ProviderName
        var description: Text?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Scope {
        var key: String /* "INSTANCE_ID" | "RULES_PACKAGE_ARN" | String */
        var value: ScopeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecurityGroup {
        var groupName: Text?
            get() = definedExternally
            set(value) = definedExternally
        var groupId: Text?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetTagsForResourceRequest {
        var resourceArn: Arn
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartAssessmentRunRequest {
        var assessmentTemplateArn: Arn
        var assessmentRunName: AssessmentRunName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartAssessmentRunResponse {
        var assessmentRunArn: Arn
    }
    interface StopAssessmentRunRequest {
        var assessmentRunArn: Arn
        var stopAction: String /* "START_EVALUATION" | "SKIP_EVALUATION" | String */
    }
    interface SubscribeToEventRequest {
        var resourceArn: Arn
        var event: String /* "ASSESSMENT_RUN_STARTED" | "ASSESSMENT_RUN_COMPLETED" | "ASSESSMENT_RUN_STATE_CHANGED" | "FINDING_REPORTED" | "OTHER" | String */
        var topicArn: Arn
    }
    interface Subscription {
        var resourceArn: Arn
        var topicArn: Arn
        var eventSubscriptions: EventSubscriptionList
    }
    interface Tag {
        var key: TagKey
        var value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TelemetryMetadata {
        var messageType: MessageType
        var count: Long
        var dataSize: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimestampRange {
        var beginDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnsubscribeFromEventRequest {
        var resourceArn: Arn
        var event: String /* "ASSESSMENT_RUN_STARTED" | "ASSESSMENT_RUN_COMPLETED" | "ASSESSMENT_RUN_STATE_CHANGED" | "FINDING_REPORTED" | "OTHER" | String */
        var topicArn: Arn
    }
    interface UpdateAssessmentTargetRequest {
        var assessmentTargetArn: Arn
        var assessmentTargetName: AssessmentTargetName
        var resourceGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-08-18" | "2016-02-16" | "latest" | String */
    }
}