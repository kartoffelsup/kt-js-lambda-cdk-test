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
import CodeStarNotifications.EventTypeSummary
import CodeStarNotifications.ListEventTypesFilter
import CodeStarNotifications.ListNotificationRulesFilter
import CodeStarNotifications.ListTargetsFilter
import CodeStarNotifications.NotificationRuleSummary
import CodeStarNotifications.Target
import CodeStarNotifications.TargetSummary
import CodeStarNotifications.CreateNotificationRuleRequest
import CodeStarNotifications.CreateNotificationRuleResult
import CodeStarNotifications.DeleteNotificationRuleRequest
import CodeStarNotifications.DeleteNotificationRuleResult
import CodeStarNotifications.DeleteTargetRequest
import CodeStarNotifications.DeleteTargetResult
import CodeStarNotifications.DescribeNotificationRuleRequest
import CodeStarNotifications.DescribeNotificationRuleResult
import CodeStarNotifications.ListEventTypesRequest
import CodeStarNotifications.ListEventTypesResult
import CodeStarNotifications.ListNotificationRulesRequest
import CodeStarNotifications.ListNotificationRulesResult
import CodeStarNotifications.ListTagsForResourceRequest
import CodeStarNotifications.ListTagsForResourceResult
import CodeStarNotifications.ListTargetsRequest
import CodeStarNotifications.ListTargetsResult
import CodeStarNotifications.SubscribeRequest
import CodeStarNotifications.SubscribeResult
import CodeStarNotifications.TagResourceRequest
import CodeStarNotifications.TagResourceResult
import CodeStarNotifications.UnsubscribeRequest
import CodeStarNotifications.UnsubscribeResult
import CodeStarNotifications.UntagResourceRequest
import CodeStarNotifications.UntagResourceResult
import CodeStarNotifications.UpdateNotificationRuleRequest
import CodeStarNotifications.UpdateNotificationRuleResult
import CodeStarNotifications.Tags

typealias ClientRequestToken = String

typealias CreatedTimestamp = Date

typealias EventTypeBatch = Array<EventTypeSummary>

typealias EventTypeId = String

typealias EventTypeIds = Array<EventTypeId>

typealias EventTypeName = String

typealias ForceUnsubscribeAll = Boolean

typealias LastModifiedTimestamp = Date

typealias ListEventTypesFilterValue = String

typealias ListEventTypesFilters = Array<ListEventTypesFilter>

typealias ListNotificationRulesFilterValue = String

typealias ListNotificationRulesFilters = Array<ListNotificationRulesFilter>

typealias ListTargetsFilterValue = String

typealias ListTargetsFilters = Array<ListTargetsFilter>

typealias MaxResults = Number

typealias NextToken = String

typealias NotificationRuleArn = String

typealias NotificationRuleBatch = Array<NotificationRuleSummary>

typealias NotificationRuleCreatedBy = String

typealias NotificationRuleId = String

typealias NotificationRuleName = String

typealias NotificationRuleResource = String

typealias ResourceType = String

typealias ServiceName = String

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias TargetAddress = String

typealias TargetType = String

typealias Targets = Array<Target>

typealias TargetsBatch = Array<TargetSummary>

@JsModule("aws-sdk")
external open class CodeStarNotifications(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CodeStarNotifications.Types.ClientConfiguration */
    open fun createNotificationRule(params: CreateNotificationRuleRequest, callback: (err: AWSError, data: CreateNotificationRuleResult) -> Unit = definedExternally): Request<CreateNotificationRuleResult, AWSError>
    open fun createNotificationRule(callback: (err: AWSError, data: CreateNotificationRuleResult) -> Unit = definedExternally): Request<CreateNotificationRuleResult, AWSError>
    open fun deleteNotificationRule(params: DeleteNotificationRuleRequest, callback: (err: AWSError, data: DeleteNotificationRuleResult) -> Unit = definedExternally): Request<DeleteNotificationRuleResult, AWSError>
    open fun deleteNotificationRule(callback: (err: AWSError, data: DeleteNotificationRuleResult) -> Unit = definedExternally): Request<DeleteNotificationRuleResult, AWSError>
    open fun deleteTarget(params: DeleteTargetRequest, callback: (err: AWSError, data: DeleteTargetResult) -> Unit = definedExternally): Request<DeleteTargetResult, AWSError>
    open fun deleteTarget(callback: (err: AWSError, data: DeleteTargetResult) -> Unit = definedExternally): Request<DeleteTargetResult, AWSError>
    open fun describeNotificationRule(params: DescribeNotificationRuleRequest, callback: (err: AWSError, data: DescribeNotificationRuleResult) -> Unit = definedExternally): Request<DescribeNotificationRuleResult, AWSError>
    open fun describeNotificationRule(callback: (err: AWSError, data: DescribeNotificationRuleResult) -> Unit = definedExternally): Request<DescribeNotificationRuleResult, AWSError>
    open fun listEventTypes(params: ListEventTypesRequest, callback: (err: AWSError, data: ListEventTypesResult) -> Unit = definedExternally): Request<ListEventTypesResult, AWSError>
    open fun listEventTypes(callback: (err: AWSError, data: ListEventTypesResult) -> Unit = definedExternally): Request<ListEventTypesResult, AWSError>
    open fun listNotificationRules(params: ListNotificationRulesRequest, callback: (err: AWSError, data: ListNotificationRulesResult) -> Unit = definedExternally): Request<ListNotificationRulesResult, AWSError>
    open fun listNotificationRules(callback: (err: AWSError, data: ListNotificationRulesResult) -> Unit = definedExternally): Request<ListNotificationRulesResult, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResult) -> Unit = definedExternally): Request<ListTagsForResourceResult, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResult) -> Unit = definedExternally): Request<ListTagsForResourceResult, AWSError>
    open fun listTargets(params: ListTargetsRequest, callback: (err: AWSError, data: ListTargetsResult) -> Unit = definedExternally): Request<ListTargetsResult, AWSError>
    open fun listTargets(callback: (err: AWSError, data: ListTargetsResult) -> Unit = definedExternally): Request<ListTargetsResult, AWSError>
    open fun subscribe(params: SubscribeRequest, callback: (err: AWSError, data: SubscribeResult) -> Unit = definedExternally): Request<SubscribeResult, AWSError>
    open fun subscribe(callback: (err: AWSError, data: SubscribeResult) -> Unit = definedExternally): Request<SubscribeResult, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResult) -> Unit = definedExternally): Request<TagResourceResult, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResult) -> Unit = definedExternally): Request<TagResourceResult, AWSError>
    open fun unsubscribe(params: UnsubscribeRequest, callback: (err: AWSError, data: UnsubscribeResult) -> Unit = definedExternally): Request<UnsubscribeResult, AWSError>
    open fun unsubscribe(callback: (err: AWSError, data: UnsubscribeResult) -> Unit = definedExternally): Request<UnsubscribeResult, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResult) -> Unit = definedExternally): Request<UntagResourceResult, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResult) -> Unit = definedExternally): Request<UntagResourceResult, AWSError>
    open fun updateNotificationRule(params: UpdateNotificationRuleRequest, callback: (err: AWSError, data: UpdateNotificationRuleResult) -> Unit = definedExternally): Request<UpdateNotificationRuleResult, AWSError>
    open fun updateNotificationRule(callback: (err: AWSError, data: UpdateNotificationRuleResult) -> Unit = definedExternally): Request<UpdateNotificationRuleResult, AWSError>
    interface CreateNotificationRuleRequest {
        var Name: NotificationRuleName
        var EventTypeIds: EventTypeIds
        var Resource: NotificationRuleResource
        var Targets: Targets
        var DetailType: String /* "BASIC" | "FULL" | String */
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ENABLED" | "DISABLED" | String */
    }
    interface CreateNotificationRuleResult {
        var Arn: NotificationRuleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteNotificationRuleRequest {
        var Arn: NotificationRuleArn
    }
    interface DeleteNotificationRuleResult {
        var Arn: NotificationRuleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTargetRequest {
        var TargetAddress: TargetAddress
        var ForceUnsubscribeAll: ForceUnsubscribeAll?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTargetResult
    interface DescribeNotificationRuleRequest {
        var Arn: NotificationRuleArn
    }
    interface DescribeNotificationRuleResult {
        var Arn: NotificationRuleArn
        var Name: NotificationRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var EventTypes: EventTypeBatch?
            get() = definedExternally
            set(value) = definedExternally
        var Resource: NotificationRuleResource?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: TargetsBatch?
            get() = definedExternally
            set(value) = definedExternally
        var DetailType: String /* "BASIC" | "FULL" | String */
        var CreatedBy: NotificationRuleCreatedBy?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ENABLED" | "DISABLED" | String */
        var CreatedTimestamp: CreatedTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimestamp: LastModifiedTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventTypeSummary {
        var EventTypeId: EventTypeId?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: ServiceName?
            get() = definedExternally
            set(value) = definedExternally
        var EventTypeName: EventTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventTypesFilter {
        var Name: String /* "RESOURCE_TYPE" | "SERVICE_NAME" | String */
        var Value: ListEventTypesFilterValue
    }
    interface ListEventTypesRequest {
        var Filters: ListEventTypesFilters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventTypesResult {
        var EventTypes: EventTypeBatch?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNotificationRulesFilter {
        var Name: String /* "EVENT_TYPE_ID" | "CREATED_BY" | "RESOURCE" | "TARGET_ADDRESS" | String */
        var Value: ListNotificationRulesFilterValue
    }
    interface ListNotificationRulesRequest {
        var Filters: ListNotificationRulesFilters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNotificationRulesResult {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationRules: NotificationRuleBatch?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var Arn: NotificationRuleArn
    }
    interface ListTagsForResourceResult {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTargetsFilter {
        var Name: String /* "TARGET_TYPE" | "TARGET_ADDRESS" | "TARGET_STATUS" | String */
        var Value: ListTargetsFilterValue
    }
    interface ListTargetsRequest {
        var Filters: ListTargetsFilters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTargetsResult {
        var Targets: TargetsBatch?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotificationRuleSummary {
        var Id: NotificationRuleId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: NotificationRuleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubscribeRequest {
        var Arn: NotificationRuleArn
        var Target: Target
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubscribeResult {
        var Arn: NotificationRuleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var Arn: NotificationRuleArn
        var Tags: Tags
    }
    interface TagResourceResult {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface Target {
        var TargetType: TargetType?
            get() = definedExternally
            set(value) = definedExternally
        var TargetAddress: TargetAddress?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TargetSummary {
        var TargetAddress: TargetAddress?
            get() = definedExternally
            set(value) = definedExternally
        var TargetType: TargetType?
            get() = definedExternally
            set(value) = definedExternally
        var TargetStatus: String /* "PENDING" | "ACTIVE" | "UNREACHABLE" | "INACTIVE" | "DEACTIVATED" | String */
    }
    interface UnsubscribeRequest {
        var Arn: NotificationRuleArn
        var TargetAddress: TargetAddress
    }
    interface UnsubscribeResult {
        var Arn: NotificationRuleArn
    }
    interface UntagResourceRequest {
        var Arn: NotificationRuleArn
        var TagKeys: TagKeys
    }
    interface UntagResourceResult
    interface UpdateNotificationRuleRequest {
        var Arn: NotificationRuleArn
        var Name: NotificationRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ENABLED" | "DISABLED" | String */
        var EventTypeIds: EventTypeIds?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var DetailType: String /* "BASIC" | "FULL" | String */
    }
    interface UpdateNotificationRuleResult
    interface ClientApiVersions {
        var apiVersion: String /* "2019-10-15" | "latest" | String */
    }
}