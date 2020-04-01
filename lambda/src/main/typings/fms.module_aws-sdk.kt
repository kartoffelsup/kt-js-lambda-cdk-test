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
import FMS.ComplianceViolator
import FMS.EvaluationResult
import FMS.PolicyComplianceStatus
import FMS.PolicySummary
import FMS.ResourceTag
import FMS.Tag
import FMS.AssociateAdminAccountRequest
import FMS.DeleteNotificationChannelRequest
import FMS.DeletePolicyRequest
import FMS.DisassociateAdminAccountRequest
import FMS.GetAdminAccountRequest
import FMS.GetAdminAccountResponse
import FMS.GetComplianceDetailRequest
import FMS.GetComplianceDetailResponse
import FMS.GetNotificationChannelRequest
import FMS.GetNotificationChannelResponse
import FMS.GetPolicyRequest
import FMS.GetPolicyResponse
import FMS.GetProtectionStatusRequest
import FMS.GetProtectionStatusResponse
import FMS.ListComplianceStatusRequest
import FMS.ListComplianceStatusResponse
import FMS.ListMemberAccountsRequest
import FMS.ListMemberAccountsResponse
import FMS.ListPoliciesRequest
import FMS.ListPoliciesResponse
import FMS.ListTagsForResourceRequest
import FMS.ListTagsForResourceResponse
import FMS.PutNotificationChannelRequest
import FMS.PutPolicyRequest
import FMS.PutPolicyResponse
import FMS.TagResourceRequest
import FMS.TagResourceResponse
import FMS.UntagResourceRequest
import FMS.UntagResourceResponse
import FMS.PolicyComplianceDetail
import FMS.Policy
import FMS.SecurityServicePolicyData
import FMS.CustomerPolicyScopeMap
import FMS.IssueInfoMap

typealias AWSAccountId = String

typealias Boolean = Boolean

typealias ComplianceViolators = Array<ComplianceViolator>

typealias CustomerPolicyScopeId = String

typealias CustomerPolicyScopeIdList = Array<CustomerPolicyScopeId>

typealias DetailedInfo = String

typealias EvaluationResults = Array<EvaluationResult>

typealias ManagedServiceData = String

typealias MemberAccounts = Array<AWSAccountId>

typealias PaginationMaxResults = Number

typealias PaginationToken = String

typealias PolicyComplianceStatusList = Array<PolicyComplianceStatus>

typealias PolicyId = String

typealias PolicySummaryList = Array<PolicySummary>

typealias PolicyUpdateToken = String

typealias ProtectionData = String

typealias ResourceArn = String

typealias ResourceCount = Number

typealias ResourceId = String

typealias ResourceName = String

typealias ResourceTagKey = String

typealias ResourceTagValue = String

typealias ResourceTags = Array<ResourceTag>

typealias ResourceType = String

typealias ResourceTypeList = Array<ResourceType>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TimeStamp = Date

@JsModule("aws-sdk")
external open class FMS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & FMS.Types.ClientConfiguration */
    open fun associateAdminAccount(params: AssociateAdminAccountRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun associateAdminAccount(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteNotificationChannel(params: DeleteNotificationChannelRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteNotificationChannel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicy(params: DeletePolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disassociateAdminAccount(params: DisassociateAdminAccountRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disassociateAdminAccount(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getAdminAccount(params: GetAdminAccountRequest, callback: (err: AWSError, data: GetAdminAccountResponse) -> Unit = definedExternally): Request<GetAdminAccountResponse, AWSError>
    open fun getAdminAccount(callback: (err: AWSError, data: GetAdminAccountResponse) -> Unit = definedExternally): Request<GetAdminAccountResponse, AWSError>
    open fun getComplianceDetail(params: GetComplianceDetailRequest, callback: (err: AWSError, data: GetComplianceDetailResponse) -> Unit = definedExternally): Request<GetComplianceDetailResponse, AWSError>
    open fun getComplianceDetail(callback: (err: AWSError, data: GetComplianceDetailResponse) -> Unit = definedExternally): Request<GetComplianceDetailResponse, AWSError>
    open fun getNotificationChannel(params: GetNotificationChannelRequest, callback: (err: AWSError, data: GetNotificationChannelResponse) -> Unit = definedExternally): Request<GetNotificationChannelResponse, AWSError>
    open fun getNotificationChannel(callback: (err: AWSError, data: GetNotificationChannelResponse) -> Unit = definedExternally): Request<GetNotificationChannelResponse, AWSError>
    open fun getPolicy(params: GetPolicyRequest, callback: (err: AWSError, data: GetPolicyResponse) -> Unit = definedExternally): Request<GetPolicyResponse, AWSError>
    open fun getPolicy(callback: (err: AWSError, data: GetPolicyResponse) -> Unit = definedExternally): Request<GetPolicyResponse, AWSError>
    open fun getProtectionStatus(params: GetProtectionStatusRequest, callback: (err: AWSError, data: GetProtectionStatusResponse) -> Unit = definedExternally): Request<GetProtectionStatusResponse, AWSError>
    open fun getProtectionStatus(callback: (err: AWSError, data: GetProtectionStatusResponse) -> Unit = definedExternally): Request<GetProtectionStatusResponse, AWSError>
    open fun listComplianceStatus(params: ListComplianceStatusRequest, callback: (err: AWSError, data: ListComplianceStatusResponse) -> Unit = definedExternally): Request<ListComplianceStatusResponse, AWSError>
    open fun listComplianceStatus(callback: (err: AWSError, data: ListComplianceStatusResponse) -> Unit = definedExternally): Request<ListComplianceStatusResponse, AWSError>
    open fun listMemberAccounts(params: ListMemberAccountsRequest, callback: (err: AWSError, data: ListMemberAccountsResponse) -> Unit = definedExternally): Request<ListMemberAccountsResponse, AWSError>
    open fun listMemberAccounts(callback: (err: AWSError, data: ListMemberAccountsResponse) -> Unit = definedExternally): Request<ListMemberAccountsResponse, AWSError>
    open fun listPolicies(params: ListPoliciesRequest, callback: (err: AWSError, data: ListPoliciesResponse) -> Unit = definedExternally): Request<ListPoliciesResponse, AWSError>
    open fun listPolicies(callback: (err: AWSError, data: ListPoliciesResponse) -> Unit = definedExternally): Request<ListPoliciesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putNotificationChannel(params: PutNotificationChannelRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putNotificationChannel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putPolicy(params: PutPolicyRequest, callback: (err: AWSError, data: PutPolicyResponse) -> Unit = definedExternally): Request<PutPolicyResponse, AWSError>
    open fun putPolicy(callback: (err: AWSError, data: PutPolicyResponse) -> Unit = definedExternally): Request<PutPolicyResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    interface AssociateAdminAccountRequest {
        var AdminAccount: AWSAccountId
    }
    interface ComplianceViolator {
        var ResourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ViolationReason: String /* "WEB_ACL_MISSING_RULE_GROUP" | "RESOURCE_MISSING_WEB_ACL" | "RESOURCE_INCORRECT_WEB_ACL" | "RESOURCE_MISSING_SHIELD_PROTECTION" | "RESOURCE_MISSING_WEB_ACL_OR_SHIELD_PROTECTION" | "RESOURCE_MISSING_SECURITY_GROUP" | "RESOURCE_VIOLATES_AUDIT_SECURITY_GROUP" | "SECURITY_GROUP_UNUSED" | "SECURITY_GROUP_REDUNDANT" | String */
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomerPolicyScopeMap {
        @nativeGetter
        operator fun get(key: String): CustomerPolicyScopeIdList?
        @nativeSetter
        operator fun set(key: String, value: CustomerPolicyScopeIdList)
    }
    interface DeleteNotificationChannelRequest
    interface DeletePolicyRequest {
        var PolicyId: PolicyId
        var DeleteAllPolicyResources: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateAdminAccountRequest
    interface EvaluationResult {
        var ComplianceStatus: String /* "COMPLIANT" | "NON_COMPLIANT" | String */
        var ViolatorCount: ResourceCount?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationLimitExceeded: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAdminAccountRequest
    interface GetAdminAccountResponse {
        var AdminAccount: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var RoleStatus: String /* "READY" | "CREATING" | "PENDING_DELETION" | "DELETING" | "DELETED" | String */
    }
    interface GetComplianceDetailRequest {
        var PolicyId: PolicyId
        var MemberAccount: AWSAccountId
    }
    interface GetComplianceDetailResponse {
        var PolicyComplianceDetail: PolicyComplianceDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetNotificationChannelRequest
    interface GetNotificationChannelResponse {
        var SnsTopicArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var SnsRoleName: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPolicyRequest {
        var PolicyId: PolicyId
    }
    interface GetPolicyResponse {
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetProtectionStatusRequest {
        var PolicyId: PolicyId
        var MemberAccountId: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PaginationMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetProtectionStatusResponse {
        var AdminAccountId: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceType: String /* "WAF" | "SHIELD_ADVANCED" | "SECURITY_GROUPS_COMMON" | "SECURITY_GROUPS_CONTENT_AUDIT" | "SECURITY_GROUPS_USAGE_AUDIT" | String */
        var Data: ProtectionData?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IssueInfoMap {
        @nativeGetter
        operator fun get(key: String): DetailedInfo?
        @nativeSetter
        operator fun set(key: String, value: DetailedInfo)
    }
    interface ListComplianceStatusRequest {
        var PolicyId: PolicyId
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PaginationMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListComplianceStatusResponse {
        var PolicyComplianceStatusList: PolicyComplianceStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMemberAccountsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PaginationMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMemberAccountsResponse {
        var MemberAccounts: MemberAccounts?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PaginationMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesResponse {
        var PolicyList: PolicySummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: ResourceArn
    }
    interface ListTagsForResourceResponse {
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Policy {
        var PolicyId: PolicyId?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyName: ResourceName
        var PolicyUpdateToken: PolicyUpdateToken?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityServicePolicyData: SecurityServicePolicyData
        var ResourceType: ResourceType
        var ResourceTypeList: ResourceTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTags: ResourceTags?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludeResourceTags: Boolean
        var RemediationEnabled: Boolean
        var IncludeMap: CustomerPolicyScopeMap?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludeMap: CustomerPolicyScopeMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyComplianceDetail {
        var PolicyOwner: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyId: PolicyId?
            get() = definedExternally
            set(value) = definedExternally
        var MemberAccount: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Violators: ComplianceViolators?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationLimitExceeded: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ExpiredAt: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var IssueInfoMap: IssueInfoMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyComplianceStatus {
        var PolicyOwner: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyId: PolicyId?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var MemberAccount: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationResults: EvaluationResults?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var IssueInfoMap: IssueInfoMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicySummary {
        var PolicyArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyId: PolicyId?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityServiceType: String /* "WAF" | "SHIELD_ADVANCED" | "SECURITY_GROUPS_COMMON" | "SECURITY_GROUPS_CONTENT_AUDIT" | "SECURITY_GROUPS_USAGE_AUDIT" | String */
        var RemediationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutNotificationChannelRequest {
        var SnsTopicArn: ResourceArn
        var SnsRoleName: ResourceArn
    }
    interface PutPolicyRequest {
        var Policy: Policy
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutPolicyResponse {
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTag {
        var Key: ResourceTagKey
        var Value: ResourceTagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecurityServicePolicyData {
        var Type: String /* "WAF" | "SHIELD_ADVANCED" | "SECURITY_GROUPS_COMMON" | "SECURITY_GROUPS_CONTENT_AUDIT" | "SECURITY_GROUPS_USAGE_AUDIT" | String */
        var ManagedServiceData: ManagedServiceData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceArn: ResourceArn
        var TagList: TagList
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var ResourceArn: ResourceArn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2018-01-01" | "latest" | String */
    }
}