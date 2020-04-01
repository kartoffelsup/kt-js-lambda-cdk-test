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
import RAM.Principal
import RAM.Resource
import RAM.ResourceShareAssociation
import RAM.ResourceShareInvitation
import RAM.ResourceShare
import RAM.ResourceSharePermissionSummary
import RAM.TagFilter
import RAM.Tag
import RAM.AcceptResourceShareInvitationRequest
import RAM.AcceptResourceShareInvitationResponse
import RAM.AssociateResourceShareRequest
import RAM.AssociateResourceShareResponse
import RAM.AssociateResourceSharePermissionRequest
import RAM.AssociateResourceSharePermissionResponse
import RAM.CreateResourceShareRequest
import RAM.CreateResourceShareResponse
import RAM.DeleteResourceShareRequest
import RAM.DeleteResourceShareResponse
import RAM.DisassociateResourceShareRequest
import RAM.DisassociateResourceShareResponse
import RAM.DisassociateResourceSharePermissionRequest
import RAM.DisassociateResourceSharePermissionResponse
import RAM.EnableSharingWithAwsOrganizationRequest
import RAM.EnableSharingWithAwsOrganizationResponse
import RAM.GetPermissionRequest
import RAM.GetPermissionResponse
import RAM.GetResourcePoliciesRequest
import RAM.GetResourcePoliciesResponse
import RAM.GetResourceShareAssociationsRequest
import RAM.GetResourceShareAssociationsResponse
import RAM.GetResourceShareInvitationsRequest
import RAM.GetResourceShareInvitationsResponse
import RAM.GetResourceSharesRequest
import RAM.GetResourceSharesResponse
import RAM.ListPendingInvitationResourcesRequest
import RAM.ListPendingInvitationResourcesResponse
import RAM.ListPermissionsRequest
import RAM.ListPermissionsResponse
import RAM.ListPrincipalsRequest
import RAM.ListPrincipalsResponse
import RAM.ListResourceSharePermissionsRequest
import RAM.ListResourceSharePermissionsResponse
import RAM.ListResourcesRequest
import RAM.ListResourcesResponse
import RAM.PromoteResourceShareCreatedFromPolicyRequest
import RAM.PromoteResourceShareCreatedFromPolicyResponse
import RAM.RejectResourceShareInvitationRequest
import RAM.RejectResourceShareInvitationResponse
import RAM.TagResourceRequest
import RAM.TagResourceResponse
import RAM.UntagResourceRequest
import RAM.UntagResourceResponse
import RAM.UpdateResourceShareRequest
import RAM.UpdateResourceShareResponse
import RAM.ResourceSharePermissionDetail

typealias Boolean = Boolean

typealias DateTime = Date

typealias Integer = Number

typealias MaxResults = Number

typealias PermissionArnList = Array<String>

typealias Policy = String

typealias PolicyList = Array<Policy>

typealias PrincipalArnOrIdList = Array<String>

typealias PrincipalList = Array<Principal>

typealias ResourceArnList = Array<String>

typealias ResourceList = Array<Resource>

typealias ResourceShareArnList = Array<String>

typealias ResourceShareAssociationList = Array<ResourceShareAssociation>

typealias ResourceShareInvitationArnList = Array<String>

typealias ResourceShareInvitationList = Array<ResourceShareInvitation>

typealias ResourceShareList = Array<ResourceShare>

typealias ResourceSharePermissionList = Array<ResourceSharePermissionSummary>

typealias String = String

typealias TagFilters = Array<TagFilter>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TagValueList = Array<TagValue>

@JsModule("aws-sdk")
external open class RAM(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & RAM.Types.ClientConfiguration */
    open fun acceptResourceShareInvitation(params: AcceptResourceShareInvitationRequest, callback: (err: AWSError, data: AcceptResourceShareInvitationResponse) -> Unit = definedExternally): Request<AcceptResourceShareInvitationResponse, AWSError>
    open fun acceptResourceShareInvitation(callback: (err: AWSError, data: AcceptResourceShareInvitationResponse) -> Unit = definedExternally): Request<AcceptResourceShareInvitationResponse, AWSError>
    open fun associateResourceShare(params: AssociateResourceShareRequest, callback: (err: AWSError, data: AssociateResourceShareResponse) -> Unit = definedExternally): Request<AssociateResourceShareResponse, AWSError>
    open fun associateResourceShare(callback: (err: AWSError, data: AssociateResourceShareResponse) -> Unit = definedExternally): Request<AssociateResourceShareResponse, AWSError>
    open fun associateResourceSharePermission(params: AssociateResourceSharePermissionRequest, callback: (err: AWSError, data: AssociateResourceSharePermissionResponse) -> Unit = definedExternally): Request<AssociateResourceSharePermissionResponse, AWSError>
    open fun associateResourceSharePermission(callback: (err: AWSError, data: AssociateResourceSharePermissionResponse) -> Unit = definedExternally): Request<AssociateResourceSharePermissionResponse, AWSError>
    open fun createResourceShare(params: CreateResourceShareRequest, callback: (err: AWSError, data: CreateResourceShareResponse) -> Unit = definedExternally): Request<CreateResourceShareResponse, AWSError>
    open fun createResourceShare(callback: (err: AWSError, data: CreateResourceShareResponse) -> Unit = definedExternally): Request<CreateResourceShareResponse, AWSError>
    open fun deleteResourceShare(params: DeleteResourceShareRequest, callback: (err: AWSError, data: DeleteResourceShareResponse) -> Unit = definedExternally): Request<DeleteResourceShareResponse, AWSError>
    open fun deleteResourceShare(callback: (err: AWSError, data: DeleteResourceShareResponse) -> Unit = definedExternally): Request<DeleteResourceShareResponse, AWSError>
    open fun disassociateResourceShare(params: DisassociateResourceShareRequest, callback: (err: AWSError, data: DisassociateResourceShareResponse) -> Unit = definedExternally): Request<DisassociateResourceShareResponse, AWSError>
    open fun disassociateResourceShare(callback: (err: AWSError, data: DisassociateResourceShareResponse) -> Unit = definedExternally): Request<DisassociateResourceShareResponse, AWSError>
    open fun disassociateResourceSharePermission(params: DisassociateResourceSharePermissionRequest, callback: (err: AWSError, data: DisassociateResourceSharePermissionResponse) -> Unit = definedExternally): Request<DisassociateResourceSharePermissionResponse, AWSError>
    open fun disassociateResourceSharePermission(callback: (err: AWSError, data: DisassociateResourceSharePermissionResponse) -> Unit = definedExternally): Request<DisassociateResourceSharePermissionResponse, AWSError>
    open fun enableSharingWithAwsOrganization(params: EnableSharingWithAwsOrganizationRequest, callback: (err: AWSError, data: EnableSharingWithAwsOrganizationResponse) -> Unit = definedExternally): Request<EnableSharingWithAwsOrganizationResponse, AWSError>
    open fun enableSharingWithAwsOrganization(callback: (err: AWSError, data: EnableSharingWithAwsOrganizationResponse) -> Unit = definedExternally): Request<EnableSharingWithAwsOrganizationResponse, AWSError>
    open fun getPermission(params: GetPermissionRequest, callback: (err: AWSError, data: GetPermissionResponse) -> Unit = definedExternally): Request<GetPermissionResponse, AWSError>
    open fun getPermission(callback: (err: AWSError, data: GetPermissionResponse) -> Unit = definedExternally): Request<GetPermissionResponse, AWSError>
    open fun getResourcePolicies(params: GetResourcePoliciesRequest, callback: (err: AWSError, data: GetResourcePoliciesResponse) -> Unit = definedExternally): Request<GetResourcePoliciesResponse, AWSError>
    open fun getResourcePolicies(callback: (err: AWSError, data: GetResourcePoliciesResponse) -> Unit = definedExternally): Request<GetResourcePoliciesResponse, AWSError>
    open fun getResourceShareAssociations(params: GetResourceShareAssociationsRequest, callback: (err: AWSError, data: GetResourceShareAssociationsResponse) -> Unit = definedExternally): Request<GetResourceShareAssociationsResponse, AWSError>
    open fun getResourceShareAssociations(callback: (err: AWSError, data: GetResourceShareAssociationsResponse) -> Unit = definedExternally): Request<GetResourceShareAssociationsResponse, AWSError>
    open fun getResourceShareInvitations(params: GetResourceShareInvitationsRequest, callback: (err: AWSError, data: GetResourceShareInvitationsResponse) -> Unit = definedExternally): Request<GetResourceShareInvitationsResponse, AWSError>
    open fun getResourceShareInvitations(callback: (err: AWSError, data: GetResourceShareInvitationsResponse) -> Unit = definedExternally): Request<GetResourceShareInvitationsResponse, AWSError>
    open fun getResourceShares(params: GetResourceSharesRequest, callback: (err: AWSError, data: GetResourceSharesResponse) -> Unit = definedExternally): Request<GetResourceSharesResponse, AWSError>
    open fun getResourceShares(callback: (err: AWSError, data: GetResourceSharesResponse) -> Unit = definedExternally): Request<GetResourceSharesResponse, AWSError>
    open fun listPendingInvitationResources(params: ListPendingInvitationResourcesRequest, callback: (err: AWSError, data: ListPendingInvitationResourcesResponse) -> Unit = definedExternally): Request<ListPendingInvitationResourcesResponse, AWSError>
    open fun listPendingInvitationResources(callback: (err: AWSError, data: ListPendingInvitationResourcesResponse) -> Unit = definedExternally): Request<ListPendingInvitationResourcesResponse, AWSError>
    open fun listPermissions(params: ListPermissionsRequest, callback: (err: AWSError, data: ListPermissionsResponse) -> Unit = definedExternally): Request<ListPermissionsResponse, AWSError>
    open fun listPermissions(callback: (err: AWSError, data: ListPermissionsResponse) -> Unit = definedExternally): Request<ListPermissionsResponse, AWSError>
    open fun listPrincipals(params: ListPrincipalsRequest, callback: (err: AWSError, data: ListPrincipalsResponse) -> Unit = definedExternally): Request<ListPrincipalsResponse, AWSError>
    open fun listPrincipals(callback: (err: AWSError, data: ListPrincipalsResponse) -> Unit = definedExternally): Request<ListPrincipalsResponse, AWSError>
    open fun listResourceSharePermissions(params: ListResourceSharePermissionsRequest, callback: (err: AWSError, data: ListResourceSharePermissionsResponse) -> Unit = definedExternally): Request<ListResourceSharePermissionsResponse, AWSError>
    open fun listResourceSharePermissions(callback: (err: AWSError, data: ListResourceSharePermissionsResponse) -> Unit = definedExternally): Request<ListResourceSharePermissionsResponse, AWSError>
    open fun listResources(params: ListResourcesRequest, callback: (err: AWSError, data: ListResourcesResponse) -> Unit = definedExternally): Request<ListResourcesResponse, AWSError>
    open fun listResources(callback: (err: AWSError, data: ListResourcesResponse) -> Unit = definedExternally): Request<ListResourcesResponse, AWSError>
    open fun promoteResourceShareCreatedFromPolicy(params: PromoteResourceShareCreatedFromPolicyRequest, callback: (err: AWSError, data: PromoteResourceShareCreatedFromPolicyResponse) -> Unit = definedExternally): Request<PromoteResourceShareCreatedFromPolicyResponse, AWSError>
    open fun promoteResourceShareCreatedFromPolicy(callback: (err: AWSError, data: PromoteResourceShareCreatedFromPolicyResponse) -> Unit = definedExternally): Request<PromoteResourceShareCreatedFromPolicyResponse, AWSError>
    open fun rejectResourceShareInvitation(params: RejectResourceShareInvitationRequest, callback: (err: AWSError, data: RejectResourceShareInvitationResponse) -> Unit = definedExternally): Request<RejectResourceShareInvitationResponse, AWSError>
    open fun rejectResourceShareInvitation(callback: (err: AWSError, data: RejectResourceShareInvitationResponse) -> Unit = definedExternally): Request<RejectResourceShareInvitationResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateResourceShare(params: UpdateResourceShareRequest, callback: (err: AWSError, data: UpdateResourceShareResponse) -> Unit = definedExternally): Request<UpdateResourceShareResponse, AWSError>
    open fun updateResourceShare(callback: (err: AWSError, data: UpdateResourceShareResponse) -> Unit = definedExternally): Request<UpdateResourceShareResponse, AWSError>
    interface AcceptResourceShareInvitationRequest {
        var resourceShareInvitationArn: String
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AcceptResourceShareInvitationResponse {
        var resourceShareInvitation: ResourceShareInvitation?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateResourceSharePermissionRequest {
        var resourceShareArn: String
        var permissionArn: String
        var replace: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateResourceSharePermissionResponse {
        var returnValue: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateResourceShareRequest {
        var resourceShareArn: String
        var resourceArns: ResourceArnList?
            get() = definedExternally
            set(value) = definedExternally
        var principals: PrincipalArnOrIdList?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateResourceShareResponse {
        var resourceShareAssociations: ResourceShareAssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceShareRequest {
        var name: String
        var resourceArns: ResourceArnList?
            get() = definedExternally
            set(value) = definedExternally
        var principals: PrincipalArnOrIdList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var allowExternalPrincipals: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var permissionArns: PermissionArnList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceShareResponse {
        var resourceShare: ResourceShare?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteResourceShareRequest {
        var resourceShareArn: String
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteResourceShareResponse {
        var returnValue: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateResourceSharePermissionRequest {
        var resourceShareArn: String
        var permissionArn: String
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateResourceSharePermissionResponse {
        var returnValue: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateResourceShareRequest {
        var resourceShareArn: String
        var resourceArns: ResourceArnList?
            get() = definedExternally
            set(value) = definedExternally
        var principals: PrincipalArnOrIdList?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateResourceShareResponse {
        var resourceShareAssociations: ResourceShareAssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableSharingWithAwsOrganizationRequest
    interface EnableSharingWithAwsOrganizationResponse {
        var returnValue: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPermissionRequest {
        var permissionArn: String
        var permissionVersion: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPermissionResponse {
        var permission: ResourceSharePermissionDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourcePoliciesRequest {
        var resourceArns: ResourceArnList
        var principal: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourcePoliciesResponse {
        var policies: PolicyList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceShareAssociationsRequest {
        var associationType: String /* "PRINCIPAL" | "RESOURCE" | String */
        var resourceShareArns: ResourceShareArnList?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var principal: String?
            get() = definedExternally
            set(value) = definedExternally
        var associationStatus: String /* "ASSOCIATING" | "ASSOCIATED" | "FAILED" | "DISASSOCIATING" | "DISASSOCIATED" | String */
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceShareAssociationsResponse {
        var resourceShareAssociations: ResourceShareAssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceShareInvitationsRequest {
        var resourceShareInvitationArns: ResourceShareInvitationArnList?
            get() = definedExternally
            set(value) = definedExternally
        var resourceShareArns: ResourceShareArnList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceShareInvitationsResponse {
        var resourceShareInvitations: ResourceShareInvitationList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceSharesRequest {
        var resourceShareArns: ResourceShareArnList?
            get() = definedExternally
            set(value) = definedExternally
        var resourceShareStatus: String /* "PENDING" | "ACTIVE" | "FAILED" | "DELETING" | "DELETED" | String */
        var resourceOwner: String /* "SELF" | "OTHER-ACCOUNTS" | String */
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var tagFilters: TagFilters?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceSharesResponse {
        var resourceShares: ResourceShareList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPendingInvitationResourcesRequest {
        var resourceShareInvitationArn: String
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPendingInvitationResourcesResponse {
        var resources: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPermissionsRequest {
        var resourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPermissionsResponse {
        var permissions: ResourceSharePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPrincipalsRequest {
        var resourceOwner: String /* "SELF" | "OTHER-ACCOUNTS" | String */
        var resourceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var principals: PrincipalArnOrIdList?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceShareArns: ResourceShareArnList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPrincipalsResponse {
        var principals: PrincipalList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceSharePermissionsRequest {
        var resourceShareArn: String
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceSharePermissionsResponse {
        var permissions: ResourceSharePermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourcesRequest {
        var resourceOwner: String /* "SELF" | "OTHER-ACCOUNTS" | String */
        var principal: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArns: ResourceArnList?
            get() = definedExternally
            set(value) = definedExternally
        var resourceShareArns: ResourceShareArnList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourcesResponse {
        var resources: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Principal {
        var id: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceShareArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var external: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PromoteResourceShareCreatedFromPolicyRequest {
        var resourceShareArn: String
    }
    interface PromoteResourceShareCreatedFromPolicyResponse {
        var returnValue: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RejectResourceShareInvitationRequest {
        var resourceShareInvitationArn: String
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RejectResourceShareInvitationResponse {
        var resourceShareInvitation: ResourceShareInvitation?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Resource {
        var arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceShareArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "AVAILABLE" | "ZONAL_RESOURCE_INACCESSIBLE" | "LIMIT_EXCEEDED" | "UNAVAILABLE" | "PENDING" | String */
        var statusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceShare {
        var resourceShareArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var owningAccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var allowExternalPrincipals: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "PENDING" | "ACTIVE" | "FAILED" | "DELETING" | "DELETED" | String */
        var statusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var featureSet: String /* "CREATED_FROM_POLICY" | "PROMOTING_TO_STANDARD" | "STANDARD" | String */
    }
    interface ResourceShareAssociation {
        var resourceShareArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceShareName: String?
            get() = definedExternally
            set(value) = definedExternally
        var associatedEntity: String?
            get() = definedExternally
            set(value) = definedExternally
        var associationType: String /* "PRINCIPAL" | "RESOURCE" | String */
        var status: String /* "ASSOCIATING" | "ASSOCIATED" | "FAILED" | "DISASSOCIATING" | "DISASSOCIATED" | String */
        var statusMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var external: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceShareInvitation {
        var resourceShareInvitationArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceShareName: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceShareArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var senderAccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var receiverAccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var invitationTimestamp: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "PENDING" | "ACCEPTED" | "REJECTED" | "EXPIRED" | String */
        var resourceShareAssociations: ResourceShareAssociationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceSharePermissionDetail {
        var arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var defaultVersion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var permission: String?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceSharePermissionSummary {
        var arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var defaultVersion: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: DateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagFilter {
        var tagKey: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var tagValues: TagValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var resourceShareArn: String
        var tags: TagList
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var resourceShareArn: String
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateResourceShareRequest {
        var resourceShareArn: String
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var allowExternalPrincipals: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResourceShareResponse {
        var resourceShare: ResourceShare?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-01-04" | "latest" | String */
    }
}