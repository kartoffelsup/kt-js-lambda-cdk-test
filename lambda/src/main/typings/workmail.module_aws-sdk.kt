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
import WorkMail.AccessControlRule
import WorkMail.Group
import WorkMail.Member
import WorkMail.OrganizationSummary
import WorkMail.Permission
import WorkMail.Delegate
import WorkMail.Resource
import WorkMail.Tag
import WorkMail.User
import WorkMail.AssociateDelegateToResourceRequest
import WorkMail.AssociateDelegateToResourceResponse
import WorkMail.AssociateMemberToGroupRequest
import WorkMail.AssociateMemberToGroupResponse
import WorkMail.CreateAliasRequest
import WorkMail.CreateAliasResponse
import WorkMail.CreateGroupRequest
import WorkMail.CreateGroupResponse
import WorkMail.CreateResourceRequest
import WorkMail.CreateResourceResponse
import WorkMail.CreateUserRequest
import WorkMail.CreateUserResponse
import WorkMail.DeleteAccessControlRuleRequest
import WorkMail.DeleteAccessControlRuleResponse
import WorkMail.DeleteAliasRequest
import WorkMail.DeleteAliasResponse
import WorkMail.DeleteGroupRequest
import WorkMail.DeleteGroupResponse
import WorkMail.DeleteMailboxPermissionsRequest
import WorkMail.DeleteMailboxPermissionsResponse
import WorkMail.DeleteResourceRequest
import WorkMail.DeleteResourceResponse
import WorkMail.DeleteUserRequest
import WorkMail.DeleteUserResponse
import WorkMail.DeregisterFromWorkMailRequest
import WorkMail.DeregisterFromWorkMailResponse
import WorkMail.DescribeGroupRequest
import WorkMail.DescribeGroupResponse
import WorkMail.DescribeOrganizationRequest
import WorkMail.DescribeOrganizationResponse
import WorkMail.DescribeResourceRequest
import WorkMail.DescribeResourceResponse
import WorkMail.DescribeUserRequest
import WorkMail.DescribeUserResponse
import WorkMail.DisassociateDelegateFromResourceRequest
import WorkMail.DisassociateDelegateFromResourceResponse
import WorkMail.DisassociateMemberFromGroupRequest
import WorkMail.DisassociateMemberFromGroupResponse
import WorkMail.GetAccessControlEffectRequest
import WorkMail.GetAccessControlEffectResponse
import WorkMail.GetMailboxDetailsRequest
import WorkMail.GetMailboxDetailsResponse
import WorkMail.ListAccessControlRulesRequest
import WorkMail.ListAccessControlRulesResponse
import WorkMail.ListAliasesRequest
import WorkMail.ListAliasesResponse
import WorkMail.ListGroupMembersRequest
import WorkMail.ListGroupMembersResponse
import WorkMail.ListGroupsRequest
import WorkMail.ListGroupsResponse
import WorkMail.ListMailboxPermissionsRequest
import WorkMail.ListMailboxPermissionsResponse
import WorkMail.ListOrganizationsRequest
import WorkMail.ListOrganizationsResponse
import WorkMail.ListResourceDelegatesRequest
import WorkMail.ListResourceDelegatesResponse
import WorkMail.ListResourcesRequest
import WorkMail.ListResourcesResponse
import WorkMail.ListTagsForResourceRequest
import WorkMail.ListTagsForResourceResponse
import WorkMail.ListUsersRequest
import WorkMail.ListUsersResponse
import WorkMail.PutAccessControlRuleRequest
import WorkMail.PutAccessControlRuleResponse
import WorkMail.PutMailboxPermissionsRequest
import WorkMail.PutMailboxPermissionsResponse
import WorkMail.RegisterToWorkMailRequest
import WorkMail.RegisterToWorkMailResponse
import WorkMail.ResetPasswordRequest
import WorkMail.ResetPasswordResponse
import WorkMail.TagResourceRequest
import WorkMail.TagResourceResponse
import WorkMail.UntagResourceRequest
import WorkMail.UntagResourceResponse
import WorkMail.UpdateMailboxQuotaRequest
import WorkMail.UpdateMailboxQuotaResponse
import WorkMail.UpdatePrimaryEmailAddressRequest
import WorkMail.UpdatePrimaryEmailAddressResponse
import WorkMail.UpdateResourceRequest
import WorkMail.UpdateResourceResponse
import WorkMail.BookingOptions

typealias AccessControlRuleAction = String

typealias AccessControlRuleDescription = String

typealias AccessControlRuleName = String

typealias AccessControlRuleNameList = Array<AccessControlRuleName>

typealias AccessControlRulesList = Array<AccessControlRule>

typealias ActionsList = Array<AccessControlRuleAction>

typealias Aliases = Array<EmailAddress>

typealias AmazonResourceName = String

typealias Boolean = Boolean

typealias EmailAddress = String

typealias GroupName = String

typealias Groups = Array<Group>

typealias IpAddress = String

typealias IpRange = String

typealias IpRangeList = Array<IpRange>

typealias MailboxQuota = Number

typealias MailboxSize = Number

typealias MaxResults = Number

typealias Members = Array<Member>

typealias NextToken = String

typealias OrganizationId = String

typealias OrganizationName = String

typealias OrganizationSummaries = Array<OrganizationSummary>

typealias Password = String

typealias PermissionValues = Array<String /* "FULL_ACCESS" | "SEND_AS" | "SEND_ON_BEHALF" | String */>

typealias Permissions = Array<Permission>

typealias ResourceDelegates = Array<Delegate>

typealias ResourceId = String

typealias ResourceName = String

typealias Resources = Array<Resource>

typealias String = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Timestamp = Date

typealias UserIdList = Array<WorkMailIdentifier>

typealias UserName = String

typealias Users = Array<User>

typealias WorkMailIdentifier = String

@JsModule("aws-sdk")
external open class WorkMail(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & WorkMail.Types.ClientConfiguration */
    open fun associateDelegateToResource(params: AssociateDelegateToResourceRequest, callback: (err: AWSError, data: AssociateDelegateToResourceResponse) -> Unit = definedExternally): Request<AssociateDelegateToResourceResponse, AWSError>
    open fun associateDelegateToResource(callback: (err: AWSError, data: AssociateDelegateToResourceResponse) -> Unit = definedExternally): Request<AssociateDelegateToResourceResponse, AWSError>
    open fun associateMemberToGroup(params: AssociateMemberToGroupRequest, callback: (err: AWSError, data: AssociateMemberToGroupResponse) -> Unit = definedExternally): Request<AssociateMemberToGroupResponse, AWSError>
    open fun associateMemberToGroup(callback: (err: AWSError, data: AssociateMemberToGroupResponse) -> Unit = definedExternally): Request<AssociateMemberToGroupResponse, AWSError>
    open fun createAlias(params: CreateAliasRequest, callback: (err: AWSError, data: CreateAliasResponse) -> Unit = definedExternally): Request<CreateAliasResponse, AWSError>
    open fun createAlias(callback: (err: AWSError, data: CreateAliasResponse) -> Unit = definedExternally): Request<CreateAliasResponse, AWSError>
    open fun createGroup(params: CreateGroupRequest, callback: (err: AWSError, data: CreateGroupResponse) -> Unit = definedExternally): Request<CreateGroupResponse, AWSError>
    open fun createGroup(callback: (err: AWSError, data: CreateGroupResponse) -> Unit = definedExternally): Request<CreateGroupResponse, AWSError>
    open fun createResource(params: CreateResourceRequest, callback: (err: AWSError, data: CreateResourceResponse) -> Unit = definedExternally): Request<CreateResourceResponse, AWSError>
    open fun createResource(callback: (err: AWSError, data: CreateResourceResponse) -> Unit = definedExternally): Request<CreateResourceResponse, AWSError>
    open fun createUser(params: CreateUserRequest, callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun createUser(callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun deleteAccessControlRule(params: DeleteAccessControlRuleRequest, callback: (err: AWSError, data: DeleteAccessControlRuleResponse) -> Unit = definedExternally): Request<DeleteAccessControlRuleResponse, AWSError>
    open fun deleteAccessControlRule(callback: (err: AWSError, data: DeleteAccessControlRuleResponse) -> Unit = definedExternally): Request<DeleteAccessControlRuleResponse, AWSError>
    open fun deleteAlias(params: DeleteAliasRequest, callback: (err: AWSError, data: DeleteAliasResponse) -> Unit = definedExternally): Request<DeleteAliasResponse, AWSError>
    open fun deleteAlias(callback: (err: AWSError, data: DeleteAliasResponse) -> Unit = definedExternally): Request<DeleteAliasResponse, AWSError>
    open fun deleteGroup(params: DeleteGroupRequest, callback: (err: AWSError, data: DeleteGroupResponse) -> Unit = definedExternally): Request<DeleteGroupResponse, AWSError>
    open fun deleteGroup(callback: (err: AWSError, data: DeleteGroupResponse) -> Unit = definedExternally): Request<DeleteGroupResponse, AWSError>
    open fun deleteMailboxPermissions(params: DeleteMailboxPermissionsRequest, callback: (err: AWSError, data: DeleteMailboxPermissionsResponse) -> Unit = definedExternally): Request<DeleteMailboxPermissionsResponse, AWSError>
    open fun deleteMailboxPermissions(callback: (err: AWSError, data: DeleteMailboxPermissionsResponse) -> Unit = definedExternally): Request<DeleteMailboxPermissionsResponse, AWSError>
    open fun deleteResource(params: DeleteResourceRequest, callback: (err: AWSError, data: DeleteResourceResponse) -> Unit = definedExternally): Request<DeleteResourceResponse, AWSError>
    open fun deleteResource(callback: (err: AWSError, data: DeleteResourceResponse) -> Unit = definedExternally): Request<DeleteResourceResponse, AWSError>
    open fun deleteUser(params: DeleteUserRequest, callback: (err: AWSError, data: DeleteUserResponse) -> Unit = definedExternally): Request<DeleteUserResponse, AWSError>
    open fun deleteUser(callback: (err: AWSError, data: DeleteUserResponse) -> Unit = definedExternally): Request<DeleteUserResponse, AWSError>
    open fun deregisterFromWorkMail(params: DeregisterFromWorkMailRequest, callback: (err: AWSError, data: DeregisterFromWorkMailResponse) -> Unit = definedExternally): Request<DeregisterFromWorkMailResponse, AWSError>
    open fun deregisterFromWorkMail(callback: (err: AWSError, data: DeregisterFromWorkMailResponse) -> Unit = definedExternally): Request<DeregisterFromWorkMailResponse, AWSError>
    open fun describeGroup(params: DescribeGroupRequest, callback: (err: AWSError, data: DescribeGroupResponse) -> Unit = definedExternally): Request<DescribeGroupResponse, AWSError>
    open fun describeGroup(callback: (err: AWSError, data: DescribeGroupResponse) -> Unit = definedExternally): Request<DescribeGroupResponse, AWSError>
    open fun describeOrganization(params: DescribeOrganizationRequest, callback: (err: AWSError, data: DescribeOrganizationResponse) -> Unit = definedExternally): Request<DescribeOrganizationResponse, AWSError>
    open fun describeOrganization(callback: (err: AWSError, data: DescribeOrganizationResponse) -> Unit = definedExternally): Request<DescribeOrganizationResponse, AWSError>
    open fun describeResource(params: DescribeResourceRequest, callback: (err: AWSError, data: DescribeResourceResponse) -> Unit = definedExternally): Request<DescribeResourceResponse, AWSError>
    open fun describeResource(callback: (err: AWSError, data: DescribeResourceResponse) -> Unit = definedExternally): Request<DescribeResourceResponse, AWSError>
    open fun describeUser(params: DescribeUserRequest, callback: (err: AWSError, data: DescribeUserResponse) -> Unit = definedExternally): Request<DescribeUserResponse, AWSError>
    open fun describeUser(callback: (err: AWSError, data: DescribeUserResponse) -> Unit = definedExternally): Request<DescribeUserResponse, AWSError>
    open fun disassociateDelegateFromResource(params: DisassociateDelegateFromResourceRequest, callback: (err: AWSError, data: DisassociateDelegateFromResourceResponse) -> Unit = definedExternally): Request<DisassociateDelegateFromResourceResponse, AWSError>
    open fun disassociateDelegateFromResource(callback: (err: AWSError, data: DisassociateDelegateFromResourceResponse) -> Unit = definedExternally): Request<DisassociateDelegateFromResourceResponse, AWSError>
    open fun disassociateMemberFromGroup(params: DisassociateMemberFromGroupRequest, callback: (err: AWSError, data: DisassociateMemberFromGroupResponse) -> Unit = definedExternally): Request<DisassociateMemberFromGroupResponse, AWSError>
    open fun disassociateMemberFromGroup(callback: (err: AWSError, data: DisassociateMemberFromGroupResponse) -> Unit = definedExternally): Request<DisassociateMemberFromGroupResponse, AWSError>
    open fun getAccessControlEffect(params: GetAccessControlEffectRequest, callback: (err: AWSError, data: GetAccessControlEffectResponse) -> Unit = definedExternally): Request<GetAccessControlEffectResponse, AWSError>
    open fun getAccessControlEffect(callback: (err: AWSError, data: GetAccessControlEffectResponse) -> Unit = definedExternally): Request<GetAccessControlEffectResponse, AWSError>
    open fun getMailboxDetails(params: GetMailboxDetailsRequest, callback: (err: AWSError, data: GetMailboxDetailsResponse) -> Unit = definedExternally): Request<GetMailboxDetailsResponse, AWSError>
    open fun getMailboxDetails(callback: (err: AWSError, data: GetMailboxDetailsResponse) -> Unit = definedExternally): Request<GetMailboxDetailsResponse, AWSError>
    open fun listAccessControlRules(params: ListAccessControlRulesRequest, callback: (err: AWSError, data: ListAccessControlRulesResponse) -> Unit = definedExternally): Request<ListAccessControlRulesResponse, AWSError>
    open fun listAccessControlRules(callback: (err: AWSError, data: ListAccessControlRulesResponse) -> Unit = definedExternally): Request<ListAccessControlRulesResponse, AWSError>
    open fun listAliases(params: ListAliasesRequest, callback: (err: AWSError, data: ListAliasesResponse) -> Unit = definedExternally): Request<ListAliasesResponse, AWSError>
    open fun listAliases(callback: (err: AWSError, data: ListAliasesResponse) -> Unit = definedExternally): Request<ListAliasesResponse, AWSError>
    open fun listGroupMembers(params: ListGroupMembersRequest, callback: (err: AWSError, data: ListGroupMembersResponse) -> Unit = definedExternally): Request<ListGroupMembersResponse, AWSError>
    open fun listGroupMembers(callback: (err: AWSError, data: ListGroupMembersResponse) -> Unit = definedExternally): Request<ListGroupMembersResponse, AWSError>
    open fun listGroups(params: ListGroupsRequest, callback: (err: AWSError, data: ListGroupsResponse) -> Unit = definedExternally): Request<ListGroupsResponse, AWSError>
    open fun listGroups(callback: (err: AWSError, data: ListGroupsResponse) -> Unit = definedExternally): Request<ListGroupsResponse, AWSError>
    open fun listMailboxPermissions(params: ListMailboxPermissionsRequest, callback: (err: AWSError, data: ListMailboxPermissionsResponse) -> Unit = definedExternally): Request<ListMailboxPermissionsResponse, AWSError>
    open fun listMailboxPermissions(callback: (err: AWSError, data: ListMailboxPermissionsResponse) -> Unit = definedExternally): Request<ListMailboxPermissionsResponse, AWSError>
    open fun listOrganizations(params: ListOrganizationsRequest, callback: (err: AWSError, data: ListOrganizationsResponse) -> Unit = definedExternally): Request<ListOrganizationsResponse, AWSError>
    open fun listOrganizations(callback: (err: AWSError, data: ListOrganizationsResponse) -> Unit = definedExternally): Request<ListOrganizationsResponse, AWSError>
    open fun listResourceDelegates(params: ListResourceDelegatesRequest, callback: (err: AWSError, data: ListResourceDelegatesResponse) -> Unit = definedExternally): Request<ListResourceDelegatesResponse, AWSError>
    open fun listResourceDelegates(callback: (err: AWSError, data: ListResourceDelegatesResponse) -> Unit = definedExternally): Request<ListResourceDelegatesResponse, AWSError>
    open fun listResources(params: ListResourcesRequest, callback: (err: AWSError, data: ListResourcesResponse) -> Unit = definedExternally): Request<ListResourcesResponse, AWSError>
    open fun listResources(callback: (err: AWSError, data: ListResourcesResponse) -> Unit = definedExternally): Request<ListResourcesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listUsers(params: ListUsersRequest, callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listUsers(callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun putAccessControlRule(params: PutAccessControlRuleRequest, callback: (err: AWSError, data: PutAccessControlRuleResponse) -> Unit = definedExternally): Request<PutAccessControlRuleResponse, AWSError>
    open fun putAccessControlRule(callback: (err: AWSError, data: PutAccessControlRuleResponse) -> Unit = definedExternally): Request<PutAccessControlRuleResponse, AWSError>
    open fun putMailboxPermissions(params: PutMailboxPermissionsRequest, callback: (err: AWSError, data: PutMailboxPermissionsResponse) -> Unit = definedExternally): Request<PutMailboxPermissionsResponse, AWSError>
    open fun putMailboxPermissions(callback: (err: AWSError, data: PutMailboxPermissionsResponse) -> Unit = definedExternally): Request<PutMailboxPermissionsResponse, AWSError>
    open fun registerToWorkMail(params: RegisterToWorkMailRequest, callback: (err: AWSError, data: RegisterToWorkMailResponse) -> Unit = definedExternally): Request<RegisterToWorkMailResponse, AWSError>
    open fun registerToWorkMail(callback: (err: AWSError, data: RegisterToWorkMailResponse) -> Unit = definedExternally): Request<RegisterToWorkMailResponse, AWSError>
    open fun resetPassword(params: ResetPasswordRequest, callback: (err: AWSError, data: ResetPasswordResponse) -> Unit = definedExternally): Request<ResetPasswordResponse, AWSError>
    open fun resetPassword(callback: (err: AWSError, data: ResetPasswordResponse) -> Unit = definedExternally): Request<ResetPasswordResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateMailboxQuota(params: UpdateMailboxQuotaRequest, callback: (err: AWSError, data: UpdateMailboxQuotaResponse) -> Unit = definedExternally): Request<UpdateMailboxQuotaResponse, AWSError>
    open fun updateMailboxQuota(callback: (err: AWSError, data: UpdateMailboxQuotaResponse) -> Unit = definedExternally): Request<UpdateMailboxQuotaResponse, AWSError>
    open fun updatePrimaryEmailAddress(params: UpdatePrimaryEmailAddressRequest, callback: (err: AWSError, data: UpdatePrimaryEmailAddressResponse) -> Unit = definedExternally): Request<UpdatePrimaryEmailAddressResponse, AWSError>
    open fun updatePrimaryEmailAddress(callback: (err: AWSError, data: UpdatePrimaryEmailAddressResponse) -> Unit = definedExternally): Request<UpdatePrimaryEmailAddressResponse, AWSError>
    open fun updateResource(params: UpdateResourceRequest, callback: (err: AWSError, data: UpdateResourceResponse) -> Unit = definedExternally): Request<UpdateResourceResponse, AWSError>
    open fun updateResource(callback: (err: AWSError, data: UpdateResourceResponse) -> Unit = definedExternally): Request<UpdateResourceResponse, AWSError>
    interface AccessControlRule {
        var Name: AccessControlRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var Effect: String /* "ALLOW" | "DENY" | String */
        var Description: AccessControlRuleDescription?
            get() = definedExternally
            set(value) = definedExternally
        var IpRanges: IpRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var NotIpRanges: IpRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: ActionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NotActions: ActionsList?
            get() = definedExternally
            set(value) = definedExternally
        var UserIds: UserIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NotUserIds: UserIdList?
            get() = definedExternally
            set(value) = definedExternally
        var DateCreated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DateModified: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateDelegateToResourceRequest {
        var OrganizationId: OrganizationId
        var ResourceId: ResourceId
        var EntityId: WorkMailIdentifier
    }
    interface AssociateDelegateToResourceResponse
    interface AssociateMemberToGroupRequest {
        var OrganizationId: OrganizationId
        var GroupId: WorkMailIdentifier
        var MemberId: WorkMailIdentifier
    }
    interface AssociateMemberToGroupResponse
    interface BookingOptions {
        var AutoAcceptRequests: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoDeclineRecurringRequests: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AutoDeclineConflictingRequests: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAliasRequest {
        var OrganizationId: OrganizationId
        var EntityId: WorkMailIdentifier
        var Alias: EmailAddress
    }
    interface CreateAliasResponse
    interface CreateGroupRequest {
        var OrganizationId: OrganizationId
        var Name: GroupName
    }
    interface CreateGroupResponse {
        var GroupId: WorkMailIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceRequest {
        var OrganizationId: OrganizationId
        var Name: ResourceName
        var Type: String /* "ROOM" | "EQUIPMENT" | String */
    }
    interface CreateResourceResponse {
        var ResourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserRequest {
        var OrganizationId: OrganizationId
        var Name: UserName
        var DisplayName: String
        var Password: Password
    }
    interface CreateUserResponse {
        var UserId: WorkMailIdentifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Delegate {
        var Id: String
        var Type: String /* "GROUP" | "USER" | String */
    }
    interface DeleteAccessControlRuleRequest {
        var OrganizationId: OrganizationId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: AccessControlRuleName
    }
    interface DeleteAccessControlRuleResponse
    interface DeleteAliasRequest {
        var OrganizationId: OrganizationId
        var EntityId: WorkMailIdentifier
        var Alias: EmailAddress
    }
    interface DeleteAliasResponse
    interface DeleteGroupRequest {
        var OrganizationId: OrganizationId
        var GroupId: WorkMailIdentifier
    }
    interface DeleteGroupResponse
    interface DeleteMailboxPermissionsRequest {
        var OrganizationId: OrganizationId
        var EntityId: WorkMailIdentifier
        var GranteeId: WorkMailIdentifier
    }
    interface DeleteMailboxPermissionsResponse
    interface DeleteResourceRequest {
        var OrganizationId: OrganizationId
        var ResourceId: ResourceId
    }
    interface DeleteResourceResponse
    interface DeleteUserRequest {
        var OrganizationId: OrganizationId
        var UserId: WorkMailIdentifier
    }
    interface DeleteUserResponse
    interface DeregisterFromWorkMailRequest {
        var OrganizationId: OrganizationId
        var EntityId: WorkMailIdentifier
    }
    interface DeregisterFromWorkMailResponse
    interface DescribeGroupRequest {
        var OrganizationId: OrganizationId
        var GroupId: WorkMailIdentifier
    }
    interface DescribeGroupResponse {
        var GroupId: WorkMailIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var Name: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Email: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | "DELETED" | String */
        var EnabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DisabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationRequest {
        var OrganizationId: OrganizationId
    }
    interface DescribeOrganizationResponse {
        var OrganizationId: OrganizationId?
            get() = definedExternally
            set(value) = definedExternally
        var Alias: OrganizationName?
            get() = definedExternally
            set(value) = definedExternally
        var State: String?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryType: String?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultMailDomain: String?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeResourceRequest {
        var OrganizationId: OrganizationId
        var ResourceId: ResourceId
    }
    interface DescribeResourceResponse {
        var ResourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Email: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "ROOM" | "EQUIPMENT" | String */
        var BookingOptions: BookingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | "DELETED" | String */
        var EnabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DisabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserRequest {
        var OrganizationId: OrganizationId
        var UserId: WorkMailIdentifier
    }
    interface DescribeUserResponse {
        var UserId: WorkMailIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var Name: UserName?
            get() = definedExternally
            set(value) = definedExternally
        var Email: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | "DELETED" | String */
        var UserRole: String /* "USER" | "RESOURCE" | "SYSTEM_USER" | String */
        var EnabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DisabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateDelegateFromResourceRequest {
        var OrganizationId: OrganizationId
        var ResourceId: ResourceId
        var EntityId: WorkMailIdentifier
    }
    interface DisassociateDelegateFromResourceResponse
    interface DisassociateMemberFromGroupRequest {
        var OrganizationId: OrganizationId
        var GroupId: WorkMailIdentifier
        var MemberId: WorkMailIdentifier
    }
    interface DisassociateMemberFromGroupResponse
    interface GetAccessControlEffectRequest {
        var OrganizationId: OrganizationId
        var IpAddress: IpAddress
        var Action: AccessControlRuleAction
        var UserId: WorkMailIdentifier
    }
    interface GetAccessControlEffectResponse {
        var Effect: String /* "ALLOW" | "DENY" | String */
        var MatchedRules: AccessControlRuleNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMailboxDetailsRequest {
        var OrganizationId: OrganizationId
        var UserId: WorkMailIdentifier
    }
    interface GetMailboxDetailsResponse {
        var MailboxQuota: MailboxQuota?
            get() = definedExternally
            set(value) = definedExternally
        var MailboxSize: MailboxSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Group {
        var Id: WorkMailIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var Email: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var Name: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | "DELETED" | String */
        var EnabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DisabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccessControlRulesRequest {
        var OrganizationId: OrganizationId
    }
    interface ListAccessControlRulesResponse {
        var Rules: AccessControlRulesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAliasesRequest {
        var OrganizationId: OrganizationId
        var EntityId: WorkMailIdentifier
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAliasesResponse {
        var Aliases: Aliases?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupMembersRequest {
        var OrganizationId: OrganizationId
        var GroupId: WorkMailIdentifier
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupMembersResponse {
        var Members: Members?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsRequest {
        var OrganizationId: OrganizationId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsResponse {
        var Groups: Groups?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMailboxPermissionsRequest {
        var OrganizationId: OrganizationId
        var EntityId: WorkMailIdentifier
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMailboxPermissionsResponse {
        var Permissions: Permissions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOrganizationsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOrganizationsResponse {
        var OrganizationSummaries: OrganizationSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceDelegatesRequest {
        var OrganizationId: OrganizationId
        var ResourceId: WorkMailIdentifier
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceDelegatesResponse {
        var Delegates: ResourceDelegates?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourcesRequest {
        var OrganizationId: OrganizationId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourcesResponse {
        var Resources: Resources?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
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
    interface ListUsersRequest {
        var OrganizationId: OrganizationId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersResponse {
        var Users: Users?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Member {
        var Id: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "GROUP" | "USER" | String */
        var State: String /* "ENABLED" | "DISABLED" | "DELETED" | String */
        var EnabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DisabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationSummary {
        var OrganizationId: OrganizationId?
            get() = definedExternally
            set(value) = definedExternally
        var Alias: OrganizationName?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Permission {
        var GranteeId: WorkMailIdentifier
        var GranteeType: String /* "GROUP" | "USER" | String */
        var PermissionValues: PermissionValues
    }
    interface PutAccessControlRuleRequest {
        var Name: AccessControlRuleName
        var Effect: String /* "ALLOW" | "DENY" | String */
        var Description: AccessControlRuleDescription
        var IpRanges: IpRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var NotIpRanges: IpRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: ActionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NotActions: ActionsList?
            get() = definedExternally
            set(value) = definedExternally
        var UserIds: UserIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NotUserIds: UserIdList?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationId: OrganizationId
    }
    interface PutAccessControlRuleResponse
    interface PutMailboxPermissionsRequest {
        var OrganizationId: OrganizationId
        var EntityId: WorkMailIdentifier
        var GranteeId: WorkMailIdentifier
        var PermissionValues: PermissionValues
    }
    interface PutMailboxPermissionsResponse
    interface RegisterToWorkMailRequest {
        var OrganizationId: OrganizationId
        var EntityId: WorkMailIdentifier
        var Email: EmailAddress
    }
    interface RegisterToWorkMailResponse
    interface ResetPasswordRequest {
        var OrganizationId: OrganizationId
        var UserId: WorkMailIdentifier
        var Password: Password
    }
    interface ResetPasswordResponse
    interface Resource {
        var Id: WorkMailIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var Email: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "ROOM" | "EQUIPMENT" | String */
        var State: String /* "ENABLED" | "DISABLED" | "DELETED" | String */
        var EnabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DisabledDate: Timestamp?
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
    interface UpdateMailboxQuotaRequest {
        var OrganizationId: OrganizationId
        var UserId: WorkMailIdentifier
        var MailboxQuota: MailboxQuota
    }
    interface UpdateMailboxQuotaResponse
    interface UpdatePrimaryEmailAddressRequest {
        var OrganizationId: OrganizationId
        var EntityId: WorkMailIdentifier
        var Email: EmailAddress
    }
    interface UpdatePrimaryEmailAddressResponse
    interface UpdateResourceRequest {
        var OrganizationId: OrganizationId
        var ResourceId: ResourceId
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var BookingOptions: BookingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResourceResponse
    interface User {
        var Id: WorkMailIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var Email: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var Name: UserName?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | "DELETED" | String */
        var UserRole: String /* "USER" | "RESOURCE" | "SYSTEM_USER" | String */
        var EnabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DisabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-10-01" | "latest" | String */
    }
}