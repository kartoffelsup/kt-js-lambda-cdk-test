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
import DLM.CrossRegionCopyRule
import DLM.LifecyclePolicySummary
import DLM.Schedule
import DLM.Tag
import DLM.CreateLifecyclePolicyRequest
import DLM.CreateLifecyclePolicyResponse
import DLM.DeleteLifecyclePolicyRequest
import DLM.DeleteLifecyclePolicyResponse
import DLM.GetLifecyclePoliciesRequest
import DLM.GetLifecyclePoliciesResponse
import DLM.GetLifecyclePolicyRequest
import DLM.GetLifecyclePolicyResponse
import DLM.ListTagsForResourceRequest
import DLM.ListTagsForResourceResponse
import DLM.TagResourceRequest
import DLM.TagResourceResponse
import DLM.UntagResourceRequest
import DLM.UntagResourceResponse
import DLM.UpdateLifecyclePolicyRequest
import DLM.UpdateLifecyclePolicyResponse
import DLM.PolicyDetails
import DLM.TagMap
import DLM.CrossRegionCopyRetainRule
import DLM.LifecyclePolicy
import DLM.Parameters
import DLM.CreateRule
import DLM.RetainRule
import DLM.FastRestoreRule

typealias AvailabilityZone = String

typealias AvailabilityZoneList = Array<AvailabilityZone>

typealias CmkArn = String

typealias CopyTags = Boolean

typealias CopyTagsNullable = Boolean

typealias Count = Number

typealias CrossRegionCopyRules = Array<CrossRegionCopyRule>

typealias Encrypted = Boolean

typealias ExcludeBootVolume = Boolean

typealias ExecutionRoleArn = String

typealias Interval = Number

typealias LifecyclePolicySummaryList = Array<LifecyclePolicySummary>

typealias PolicyArn = String

typealias PolicyDescription = String

typealias PolicyId = String

typealias PolicyIdList = Array<PolicyId>

typealias ResourceTypeValuesList = Array<String /* "VOLUME" | "INSTANCE" | String */>

typealias ScheduleList = Array<Schedule>

typealias ScheduleName = String

typealias StatusMessage = String

typealias String = String

typealias TagFilter = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias TagsToAddFilterList = Array<TagFilter>

typealias TagsToAddList = Array<Tag>

typealias TargetRegion = String

typealias TargetTagList = Array<Tag>

typealias TargetTagsFilterList = Array<TagFilter>

typealias Time = String

typealias TimesList = Array<Time>

typealias Timestamp = Date

typealias VariableTagsList = Array<Tag>

@JsModule("aws-sdk")
external open class DLM(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DLM.Types.ClientConfiguration */
    open fun createLifecyclePolicy(params: CreateLifecyclePolicyRequest, callback: (err: AWSError, data: CreateLifecyclePolicyResponse) -> Unit = definedExternally): Request<CreateLifecyclePolicyResponse, AWSError>
    open fun createLifecyclePolicy(callback: (err: AWSError, data: CreateLifecyclePolicyResponse) -> Unit = definedExternally): Request<CreateLifecyclePolicyResponse, AWSError>
    open fun deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest, callback: (err: AWSError, data: DeleteLifecyclePolicyResponse) -> Unit = definedExternally): Request<DeleteLifecyclePolicyResponse, AWSError>
    open fun deleteLifecyclePolicy(callback: (err: AWSError, data: DeleteLifecyclePolicyResponse) -> Unit = definedExternally): Request<DeleteLifecyclePolicyResponse, AWSError>
    open fun getLifecyclePolicies(params: GetLifecyclePoliciesRequest, callback: (err: AWSError, data: GetLifecyclePoliciesResponse) -> Unit = definedExternally): Request<GetLifecyclePoliciesResponse, AWSError>
    open fun getLifecyclePolicies(callback: (err: AWSError, data: GetLifecyclePoliciesResponse) -> Unit = definedExternally): Request<GetLifecyclePoliciesResponse, AWSError>
    open fun getLifecyclePolicy(params: GetLifecyclePolicyRequest, callback: (err: AWSError, data: GetLifecyclePolicyResponse) -> Unit = definedExternally): Request<GetLifecyclePolicyResponse, AWSError>
    open fun getLifecyclePolicy(callback: (err: AWSError, data: GetLifecyclePolicyResponse) -> Unit = definedExternally): Request<GetLifecyclePolicyResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateLifecyclePolicy(params: UpdateLifecyclePolicyRequest, callback: (err: AWSError, data: UpdateLifecyclePolicyResponse) -> Unit = definedExternally): Request<UpdateLifecyclePolicyResponse, AWSError>
    open fun updateLifecyclePolicy(callback: (err: AWSError, data: UpdateLifecyclePolicyResponse) -> Unit = definedExternally): Request<UpdateLifecyclePolicyResponse, AWSError>
    interface CreateLifecyclePolicyRequest {
        var ExecutionRoleArn: ExecutionRoleArn
        var Description: PolicyDescription
        var State: String /* "ENABLED" | "DISABLED" | String */
        var PolicyDetails: PolicyDetails
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLifecyclePolicyResponse {
        var PolicyId: PolicyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRule {
        var Interval: Interval
        var IntervalUnit: String /* "HOURS" | String */
        var Times: TimesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CrossRegionCopyRetainRule {
        var Interval: Interval?
            get() = definedExternally
            set(value) = definedExternally
        var IntervalUnit: String /* "DAYS" | "WEEKS" | "MONTHS" | "YEARS" | String */
    }
    interface CrossRegionCopyRule {
        var TargetRegion: TargetRegion
        var Encrypted: Encrypted
        var CmkArn: CmkArn?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTags: CopyTagsNullable?
            get() = definedExternally
            set(value) = definedExternally
        var RetainRule: CrossRegionCopyRetainRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLifecyclePolicyRequest {
        var PolicyId: PolicyId
    }
    interface DeleteLifecyclePolicyResponse
    interface FastRestoreRule {
        var Count: Count?
            get() = definedExternally
            set(value) = definedExternally
        var Interval: Interval?
            get() = definedExternally
            set(value) = definedExternally
        var IntervalUnit: String /* "DAYS" | "WEEKS" | "MONTHS" | "YEARS" | String */
        var AvailabilityZones: AvailabilityZoneList
    }
    interface GetLifecyclePoliciesRequest {
        var PolicyIds: PolicyIdList?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | "ERROR" | String */
        var ResourceTypes: ResourceTypeValuesList?
            get() = definedExternally
            set(value) = definedExternally
        var TargetTags: TargetTagsFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var TagsToAdd: TagsToAddFilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLifecyclePoliciesResponse {
        var Policies: LifecyclePolicySummaryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLifecyclePolicyRequest {
        var PolicyId: PolicyId
    }
    interface GetLifecyclePolicyResponse {
        var Policy: LifecyclePolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LifecyclePolicy {
        var PolicyId: PolicyId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: PolicyDescription?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | "ERROR" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleArn: ExecutionRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var DateCreated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DateModified: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyDetails: PolicyDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyArn: PolicyArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LifecyclePolicySummary {
        var PolicyId: PolicyId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: PolicyDescription?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | "ERROR" | String */
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: PolicyArn
    }
    interface ListTagsForResourceResponse {
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Parameters {
        var ExcludeBootVolume: ExcludeBootVolume?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyDetails {
        var PolicyType: String /* "EBS_SNAPSHOT_MANAGEMENT" | String */
        var ResourceTypes: ResourceTypeValuesList?
            get() = definedExternally
            set(value) = definedExternally
        var TargetTags: TargetTagList?
            get() = definedExternally
            set(value) = definedExternally
        var Schedules: ScheduleList?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RetainRule {
        var Count: Count?
            get() = definedExternally
            set(value) = definedExternally
        var Interval: Interval?
            get() = definedExternally
            set(value) = definedExternally
        var IntervalUnit: String /* "DAYS" | "WEEKS" | "MONTHS" | "YEARS" | String */
    }
    interface Schedule {
        var Name: ScheduleName?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTags: CopyTags?
            get() = definedExternally
            set(value) = definedExternally
        var TagsToAdd: TagsToAddList?
            get() = definedExternally
            set(value) = definedExternally
        var VariableTags: VariableTagsList?
            get() = definedExternally
            set(value) = definedExternally
        var CreateRule: CreateRule?
            get() = definedExternally
            set(value) = definedExternally
        var RetainRule: RetainRule?
            get() = definedExternally
            set(value) = definedExternally
        var FastRestoreRule: FastRestoreRule?
            get() = definedExternally
            set(value) = definedExternally
        var CrossRegionCopyRules: CrossRegionCopyRules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: String
        var Value: String
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var ResourceArn: PolicyArn
        var Tags: TagMap
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var ResourceArn: PolicyArn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateLifecyclePolicyRequest {
        var PolicyId: PolicyId
        var ExecutionRoleArn: ExecutionRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | String */
        var Description: PolicyDescription?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyDetails: PolicyDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLifecyclePolicyResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2018-01-12" | "latest" | String */
    }
}