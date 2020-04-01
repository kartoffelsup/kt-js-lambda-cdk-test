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
import EventBridge.EventBus
import EventBridge.EventSource
import EventBridge.PartnerEventSourceAccount
import EventBridge.PartnerEventSource
import EventBridge.PutEventsRequestEntry
import EventBridge.PutEventsResultEntry
import EventBridge.PutPartnerEventsRequestEntry
import EventBridge.PutPartnerEventsResultEntry
import EventBridge.PutTargetsResultEntry
import EventBridge.RemoveTargetsResultEntry
import EventBridge.Rule
import EventBridge.RunCommandTarget
import EventBridge.Tag
import EventBridge.Target
import EventBridge.ActivateEventSourceRequest
import EventBridge.CreateEventBusRequest
import EventBridge.CreateEventBusResponse
import EventBridge.CreatePartnerEventSourceRequest
import EventBridge.CreatePartnerEventSourceResponse
import EventBridge.DeactivateEventSourceRequest
import EventBridge.DeleteEventBusRequest
import EventBridge.DeletePartnerEventSourceRequest
import EventBridge.DeleteRuleRequest
import EventBridge.DescribeEventBusRequest
import EventBridge.DescribeEventBusResponse
import EventBridge.DescribeEventSourceRequest
import EventBridge.DescribeEventSourceResponse
import EventBridge.DescribePartnerEventSourceRequest
import EventBridge.DescribePartnerEventSourceResponse
import EventBridge.DescribeRuleRequest
import EventBridge.DescribeRuleResponse
import EventBridge.DisableRuleRequest
import EventBridge.EnableRuleRequest
import EventBridge.ListEventBusesRequest
import EventBridge.ListEventBusesResponse
import EventBridge.ListEventSourcesRequest
import EventBridge.ListEventSourcesResponse
import EventBridge.ListPartnerEventSourceAccountsRequest
import EventBridge.ListPartnerEventSourceAccountsResponse
import EventBridge.ListPartnerEventSourcesRequest
import EventBridge.ListPartnerEventSourcesResponse
import EventBridge.ListRuleNamesByTargetRequest
import EventBridge.ListRuleNamesByTargetResponse
import EventBridge.ListRulesRequest
import EventBridge.ListRulesResponse
import EventBridge.ListTagsForResourceRequest
import EventBridge.ListTagsForResourceResponse
import EventBridge.ListTargetsByRuleRequest
import EventBridge.ListTargetsByRuleResponse
import EventBridge.PutEventsRequest
import EventBridge.PutEventsResponse
import EventBridge.PutPartnerEventsRequest
import EventBridge.PutPartnerEventsResponse
import EventBridge.PutPermissionRequest
import EventBridge.PutRuleRequest
import EventBridge.PutRuleResponse
import EventBridge.PutTargetsRequest
import EventBridge.PutTargetsResponse
import EventBridge.RemovePermissionRequest
import EventBridge.RemoveTargetsRequest
import EventBridge.RemoveTargetsResponse
import EventBridge.TagResourceRequest
import EventBridge.TagResourceResponse
import EventBridge.TestEventPatternRequest
import EventBridge.TestEventPatternResponse
import EventBridge.UntagResourceRequest
import EventBridge.UntagResourceResponse
import EventBridge.BatchArrayProperties
import EventBridge.BatchRetryStrategy
import EventBridge.NetworkConfiguration
import EventBridge.TransformerPaths
import EventBridge.AwsVpcConfiguration
import EventBridge.Condition
import EventBridge.InputTransformer
import EventBridge.KinesisParameters
import EventBridge.RunCommandParameters
import EventBridge.EcsParameters
import EventBridge.BatchParameters
import EventBridge.SqsParameters

typealias AccountId = String

typealias Action = String

typealias Arn = String

typealias Boolean = Boolean

typealias ErrorCode = String

typealias ErrorMessage = String

typealias EventBusList = Array<EventBus>

typealias EventBusName = String

typealias EventId = String

typealias EventPattern = String

typealias EventResource = String

typealias EventResourceList = Array<EventResource>

typealias EventSourceList = Array<EventSource>

typealias EventSourceName = String

typealias EventSourceNamePrefix = String

typealias EventTime = Date

typealias InputTransformerPathKey = String

typealias Integer = Number

typealias LimitMax100 = Number

typealias LimitMin1 = Number

typealias ManagedBy = String

typealias MessageGroupId = String

typealias NextToken = String

typealias NonPartnerEventBusName = String

typealias PartnerEventSourceAccountList = Array<PartnerEventSourceAccount>

typealias PartnerEventSourceList = Array<PartnerEventSource>

typealias PartnerEventSourceNamePrefix = String

typealias Principal = String

typealias PutEventsRequestEntryList = Array<PutEventsRequestEntry>

typealias PutEventsResultEntryList = Array<PutEventsResultEntry>

typealias PutPartnerEventsRequestEntryList = Array<PutPartnerEventsRequestEntry>

typealias PutPartnerEventsResultEntryList = Array<PutPartnerEventsResultEntry>

typealias PutTargetsResultEntryList = Array<PutTargetsResultEntry>

typealias RemoveTargetsResultEntryList = Array<RemoveTargetsResultEntry>

typealias RoleArn = String

typealias RuleArn = String

typealias RuleDescription = String

typealias RuleName = String

typealias RuleNameList = Array<RuleName>

typealias RuleResponseList = Array<Rule>

typealias RunCommandTargetKey = String

typealias RunCommandTargetValue = String

typealias RunCommandTargetValues = Array<RunCommandTargetValue>

typealias RunCommandTargets = Array<RunCommandTarget>

typealias ScheduleExpression = String

typealias StatementId = String

typealias String = String

typealias StringList = Array<String>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TargetArn = String

typealias TargetId = String

typealias TargetIdList = Array<TargetId>

typealias TargetInput = String

typealias TargetInputPath = String

typealias TargetList = Array<Target>

typealias TargetPartitionKeyPath = String

typealias Timestamp = Date

typealias TransformerInput = String

@JsModule("aws-sdk")
external open class EventBridge(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & EventBridge.Types.ClientConfiguration */
    open fun activateEventSource(params: ActivateEventSourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun activateEventSource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createEventBus(params: CreateEventBusRequest, callback: (err: AWSError, data: CreateEventBusResponse) -> Unit = definedExternally): Request<CreateEventBusResponse, AWSError>
    open fun createEventBus(callback: (err: AWSError, data: CreateEventBusResponse) -> Unit = definedExternally): Request<CreateEventBusResponse, AWSError>
    open fun createPartnerEventSource(params: CreatePartnerEventSourceRequest, callback: (err: AWSError, data: CreatePartnerEventSourceResponse) -> Unit = definedExternally): Request<CreatePartnerEventSourceResponse, AWSError>
    open fun createPartnerEventSource(callback: (err: AWSError, data: CreatePartnerEventSourceResponse) -> Unit = definedExternally): Request<CreatePartnerEventSourceResponse, AWSError>
    open fun deactivateEventSource(params: DeactivateEventSourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deactivateEventSource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventBus(params: DeleteEventBusRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventBus(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePartnerEventSource(params: DeletePartnerEventSourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePartnerEventSource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRule(params: DeleteRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeEventBus(params: DescribeEventBusRequest, callback: (err: AWSError, data: DescribeEventBusResponse) -> Unit = definedExternally): Request<DescribeEventBusResponse, AWSError>
    open fun describeEventBus(callback: (err: AWSError, data: DescribeEventBusResponse) -> Unit = definedExternally): Request<DescribeEventBusResponse, AWSError>
    open fun describeEventSource(params: DescribeEventSourceRequest, callback: (err: AWSError, data: DescribeEventSourceResponse) -> Unit = definedExternally): Request<DescribeEventSourceResponse, AWSError>
    open fun describeEventSource(callback: (err: AWSError, data: DescribeEventSourceResponse) -> Unit = definedExternally): Request<DescribeEventSourceResponse, AWSError>
    open fun describePartnerEventSource(params: DescribePartnerEventSourceRequest, callback: (err: AWSError, data: DescribePartnerEventSourceResponse) -> Unit = definedExternally): Request<DescribePartnerEventSourceResponse, AWSError>
    open fun describePartnerEventSource(callback: (err: AWSError, data: DescribePartnerEventSourceResponse) -> Unit = definedExternally): Request<DescribePartnerEventSourceResponse, AWSError>
    open fun describeRule(params: DescribeRuleRequest, callback: (err: AWSError, data: DescribeRuleResponse) -> Unit = definedExternally): Request<DescribeRuleResponse, AWSError>
    open fun describeRule(callback: (err: AWSError, data: DescribeRuleResponse) -> Unit = definedExternally): Request<DescribeRuleResponse, AWSError>
    open fun disableRule(params: DisableRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableRule(params: EnableRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun listEventBuses(params: ListEventBusesRequest, callback: (err: AWSError, data: ListEventBusesResponse) -> Unit = definedExternally): Request<ListEventBusesResponse, AWSError>
    open fun listEventBuses(callback: (err: AWSError, data: ListEventBusesResponse) -> Unit = definedExternally): Request<ListEventBusesResponse, AWSError>
    open fun listEventSources(params: ListEventSourcesRequest, callback: (err: AWSError, data: ListEventSourcesResponse) -> Unit = definedExternally): Request<ListEventSourcesResponse, AWSError>
    open fun listEventSources(callback: (err: AWSError, data: ListEventSourcesResponse) -> Unit = definedExternally): Request<ListEventSourcesResponse, AWSError>
    open fun listPartnerEventSourceAccounts(params: ListPartnerEventSourceAccountsRequest, callback: (err: AWSError, data: ListPartnerEventSourceAccountsResponse) -> Unit = definedExternally): Request<ListPartnerEventSourceAccountsResponse, AWSError>
    open fun listPartnerEventSourceAccounts(callback: (err: AWSError, data: ListPartnerEventSourceAccountsResponse) -> Unit = definedExternally): Request<ListPartnerEventSourceAccountsResponse, AWSError>
    open fun listPartnerEventSources(params: ListPartnerEventSourcesRequest, callback: (err: AWSError, data: ListPartnerEventSourcesResponse) -> Unit = definedExternally): Request<ListPartnerEventSourcesResponse, AWSError>
    open fun listPartnerEventSources(callback: (err: AWSError, data: ListPartnerEventSourcesResponse) -> Unit = definedExternally): Request<ListPartnerEventSourcesResponse, AWSError>
    open fun listRuleNamesByTarget(params: ListRuleNamesByTargetRequest, callback: (err: AWSError, data: ListRuleNamesByTargetResponse) -> Unit = definedExternally): Request<ListRuleNamesByTargetResponse, AWSError>
    open fun listRuleNamesByTarget(callback: (err: AWSError, data: ListRuleNamesByTargetResponse) -> Unit = definedExternally): Request<ListRuleNamesByTargetResponse, AWSError>
    open fun listRules(params: ListRulesRequest, callback: (err: AWSError, data: ListRulesResponse) -> Unit = definedExternally): Request<ListRulesResponse, AWSError>
    open fun listRules(callback: (err: AWSError, data: ListRulesResponse) -> Unit = definedExternally): Request<ListRulesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTargetsByRule(params: ListTargetsByRuleRequest, callback: (err: AWSError, data: ListTargetsByRuleResponse) -> Unit = definedExternally): Request<ListTargetsByRuleResponse, AWSError>
    open fun listTargetsByRule(callback: (err: AWSError, data: ListTargetsByRuleResponse) -> Unit = definedExternally): Request<ListTargetsByRuleResponse, AWSError>
    open fun putEvents(params: PutEventsRequest, callback: (err: AWSError, data: PutEventsResponse) -> Unit = definedExternally): Request<PutEventsResponse, AWSError>
    open fun putEvents(callback: (err: AWSError, data: PutEventsResponse) -> Unit = definedExternally): Request<PutEventsResponse, AWSError>
    open fun putPartnerEvents(params: PutPartnerEventsRequest, callback: (err: AWSError, data: PutPartnerEventsResponse) -> Unit = definedExternally): Request<PutPartnerEventsResponse, AWSError>
    open fun putPartnerEvents(callback: (err: AWSError, data: PutPartnerEventsResponse) -> Unit = definedExternally): Request<PutPartnerEventsResponse, AWSError>
    open fun putPermission(params: PutPermissionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putPermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putRule(params: PutRuleRequest, callback: (err: AWSError, data: PutRuleResponse) -> Unit = definedExternally): Request<PutRuleResponse, AWSError>
    open fun putRule(callback: (err: AWSError, data: PutRuleResponse) -> Unit = definedExternally): Request<PutRuleResponse, AWSError>
    open fun putTargets(params: PutTargetsRequest, callback: (err: AWSError, data: PutTargetsResponse) -> Unit = definedExternally): Request<PutTargetsResponse, AWSError>
    open fun putTargets(callback: (err: AWSError, data: PutTargetsResponse) -> Unit = definedExternally): Request<PutTargetsResponse, AWSError>
    open fun removePermission(params: RemovePermissionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removePermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeTargets(params: RemoveTargetsRequest, callback: (err: AWSError, data: RemoveTargetsResponse) -> Unit = definedExternally): Request<RemoveTargetsResponse, AWSError>
    open fun removeTargets(callback: (err: AWSError, data: RemoveTargetsResponse) -> Unit = definedExternally): Request<RemoveTargetsResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun testEventPattern(params: TestEventPatternRequest, callback: (err: AWSError, data: TestEventPatternResponse) -> Unit = definedExternally): Request<TestEventPatternResponse, AWSError>
    open fun testEventPattern(callback: (err: AWSError, data: TestEventPatternResponse) -> Unit = definedExternally): Request<TestEventPatternResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    interface ActivateEventSourceRequest {
        var Name: EventSourceName
    }
    interface AwsVpcConfiguration {
        var Subnets: StringList
        var SecurityGroups: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var AssignPublicIp: String /* "ENABLED" | "DISABLED" | String */
    }
    interface BatchArrayProperties {
        var Size: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchParameters {
        var JobDefinition: String
        var JobName: String
        var ArrayProperties: BatchArrayProperties?
            get() = definedExternally
            set(value) = definedExternally
        var RetryStrategy: BatchRetryStrategy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchRetryStrategy {
        var Attempts: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Condition {
        var Type: String
        var Key: String
        var Value: String
    }
    interface CreateEventBusRequest {
        var Name: EventBusName
        var EventSourceName: EventSourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEventBusResponse {
        var EventBusArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePartnerEventSourceRequest {
        var Name: EventSourceName
        var Account: AccountId
    }
    interface CreatePartnerEventSourceResponse {
        var EventSourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeactivateEventSourceRequest {
        var Name: EventSourceName
    }
    interface DeleteEventBusRequest {
        var Name: EventBusName
    }
    interface DeletePartnerEventSourceRequest {
        var Name: EventSourceName
        var Account: AccountId
    }
    interface DeleteRuleRequest {
        var Name: RuleName
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
        var Force: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventBusRequest {
        var Name: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventBusResponse {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Policy: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventSourceRequest {
        var Name: EventSourceName
    }
    interface DescribeEventSourceResponse {
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "ACTIVE" | "DELETED" | String */
    }
    interface DescribePartnerEventSourceRequest {
        var Name: EventSourceName
    }
    interface DescribePartnerEventSourceResponse {
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRuleRequest {
        var Name: RuleName
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRuleResponse {
        var Name: RuleName?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: RuleArn?
            get() = definedExternally
            set(value) = definedExternally
        var EventPattern: EventPattern?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleExpression: ScheduleExpression?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | String */
        var Description: RuleDescription?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ManagedBy: ManagedBy?
            get() = definedExternally
            set(value) = definedExternally
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableRuleRequest {
        var Name: RuleName
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EcsParameters {
        var TaskDefinitionArn: Arn
        var TaskCount: LimitMin1?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchType: String /* "EC2" | "FARGATE" | String */
        var NetworkConfiguration: NetworkConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Group: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableRuleRequest {
        var Name: RuleName
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventBus {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Policy: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventSource {
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "ACTIVE" | "DELETED" | String */
    }
    interface InputTransformer {
        var InputPathsMap: TransformerPaths?
            get() = definedExternally
            set(value) = definedExternally
        var InputTemplate: TransformerInput
    }
    interface KinesisParameters {
        var PartitionKeyPath: TargetPartitionKeyPath
    }
    interface ListEventBusesRequest {
        var NamePrefix: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitMax100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventBusesResponse {
        var EventBuses: EventBusList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventSourcesRequest {
        var NamePrefix: EventSourceNamePrefix?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitMax100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventSourcesResponse {
        var EventSources: EventSourceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPartnerEventSourceAccountsRequest {
        var EventSourceName: EventSourceName
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitMax100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPartnerEventSourceAccountsResponse {
        var PartnerEventSourceAccounts: PartnerEventSourceAccountList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPartnerEventSourcesRequest {
        var NamePrefix: PartnerEventSourceNamePrefix
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitMax100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPartnerEventSourcesResponse {
        var PartnerEventSources: PartnerEventSourceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRuleNamesByTargetRequest {
        var TargetArn: TargetArn
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitMax100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRuleNamesByTargetResponse {
        var RuleNames: RuleNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRulesRequest {
        var NamePrefix: RuleName?
            get() = definedExternally
            set(value) = definedExternally
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitMax100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRulesResponse {
        var Rules: RuleResponseList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceARN: Arn
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTargetsByRuleRequest {
        var Rule: RuleName
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitMax100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTargetsByRuleResponse {
        var Targets: TargetList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkConfiguration {
        var awsvpcConfiguration: AwsVpcConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PartnerEventSource {
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PartnerEventSourceAccount {
        var Account: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "PENDING" | "ACTIVE" | "DELETED" | String */
    }
    interface PutEventsRequest {
        var Entries: PutEventsRequestEntryList
    }
    interface PutEventsRequestEntry {
        var Time: EventTime?
            get() = definedExternally
            set(value) = definedExternally
        var Source: String?
            get() = definedExternally
            set(value) = definedExternally
        var Resources: EventResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var DetailType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Detail: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventBusName: NonPartnerEventBusName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutEventsResponse {
        var FailedEntryCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Entries: PutEventsResultEntryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutEventsResultEntry {
        var EventId: EventId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutPartnerEventsRequest {
        var Entries: PutPartnerEventsRequestEntryList
    }
    interface PutPartnerEventsRequestEntry {
        var Time: EventTime?
            get() = definedExternally
            set(value) = definedExternally
        var Source: EventSourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Resources: EventResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var DetailType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Detail: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutPartnerEventsResponse {
        var FailedEntryCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Entries: PutPartnerEventsResultEntryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutPartnerEventsResultEntry {
        var EventId: EventId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutPermissionRequest {
        var EventBusName: NonPartnerEventBusName?
            get() = definedExternally
            set(value) = definedExternally
        var Action: Action
        var Principal: Principal
        var StatementId: StatementId
        var Condition: Condition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRuleRequest {
        var Name: RuleName
        var ScheduleExpression: ScheduleExpression?
            get() = definedExternally
            set(value) = definedExternally
        var EventPattern: EventPattern?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | String */
        var Description: RuleDescription?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRuleResponse {
        var RuleArn: RuleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutTargetsRequest {
        var Rule: RuleName
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: TargetList
    }
    interface PutTargetsResponse {
        var FailedEntryCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var FailedEntries: PutTargetsResultEntryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutTargetsResultEntry {
        var TargetId: TargetId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemovePermissionRequest {
        var StatementId: StatementId
        var EventBusName: NonPartnerEventBusName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTargetsRequest {
        var Rule: RuleName
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
        var Ids: TargetIdList
        var Force: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTargetsResponse {
        var FailedEntryCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var FailedEntries: RemoveTargetsResultEntryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTargetsResultEntry {
        var TargetId: TargetId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Rule {
        var Name: RuleName?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: RuleArn?
            get() = definedExternally
            set(value) = definedExternally
        var EventPattern: EventPattern?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | String */
        var Description: RuleDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleExpression: ScheduleExpression?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ManagedBy: ManagedBy?
            get() = definedExternally
            set(value) = definedExternally
        var EventBusName: EventBusName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RunCommandParameters {
        var RunCommandTargets: RunCommandTargets
    }
    interface RunCommandTarget {
        var Key: RunCommandTargetKey
        var Values: RunCommandTargetValues
    }
    interface SqsParameters {
        var MessageGroupId: MessageGroupId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceARN: Arn
        var Tags: TagList
    }
    interface TagResourceResponse
    interface Target {
        var Id: TargetId
        var Arn: TargetArn
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Input: TargetInput?
            get() = definedExternally
            set(value) = definedExternally
        var InputPath: TargetInputPath?
            get() = definedExternally
            set(value) = definedExternally
        var InputTransformer: InputTransformer?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisParameters: KinesisParameters?
            get() = definedExternally
            set(value) = definedExternally
        var RunCommandParameters: RunCommandParameters?
            get() = definedExternally
            set(value) = definedExternally
        var EcsParameters: EcsParameters?
            get() = definedExternally
            set(value) = definedExternally
        var BatchParameters: BatchParameters?
            get() = definedExternally
            set(value) = definedExternally
        var SqsParameters: SqsParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestEventPatternRequest {
        var EventPattern: EventPattern
        var Event: String
    }
    interface TestEventPatternResponse {
        var Result: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransformerPaths {
        @nativeGetter
        operator fun get(key: String): TargetInputPath?
        @nativeSetter
        operator fun set(key: String, value: TargetInputPath)
    }
    interface UntagResourceRequest {
        var ResourceARN: Arn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2015-10-07" | "latest" | String */
    }
}