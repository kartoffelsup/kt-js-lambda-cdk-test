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
import Organizations.Account
import Organizations.Child
import Organizations.CreateAccountStatus
import Organizations.DelegatedAdministrator
import Organizations.DelegatedService
import Organizations.EnabledServicePrincipal
import Organizations.HandshakeParty
import Organizations.HandshakeResource
import Organizations.Handshake
import Organizations.OrganizationalUnit
import Organizations.Parent
import Organizations.PolicySummary
import Organizations.PolicyTargetSummary
import Organizations.PolicyTypeSummary
import Organizations.Root
import Organizations.Tag
import Organizations.AcceptHandshakeRequest
import Organizations.AcceptHandshakeResponse
import Organizations.AttachPolicyRequest
import Organizations.CancelHandshakeRequest
import Organizations.CancelHandshakeResponse
import Organizations.CreateAccountRequest
import Organizations.CreateAccountResponse
import Organizations.CreateGovCloudAccountRequest
import Organizations.CreateGovCloudAccountResponse
import Organizations.CreateOrganizationRequest
import Organizations.CreateOrganizationResponse
import Organizations.CreateOrganizationalUnitRequest
import Organizations.CreateOrganizationalUnitResponse
import Organizations.CreatePolicyRequest
import Organizations.CreatePolicyResponse
import Organizations.DeclineHandshakeRequest
import Organizations.DeclineHandshakeResponse
import Organizations.DeleteOrganizationalUnitRequest
import Organizations.DeletePolicyRequest
import Organizations.DeregisterDelegatedAdministratorRequest
import Organizations.DescribeAccountRequest
import Organizations.DescribeAccountResponse
import Organizations.DescribeCreateAccountStatusRequest
import Organizations.DescribeCreateAccountStatusResponse
import Organizations.DescribeEffectivePolicyRequest
import Organizations.DescribeEffectivePolicyResponse
import Organizations.DescribeHandshakeRequest
import Organizations.DescribeHandshakeResponse
import Organizations.DescribeOrganizationResponse
import Organizations.DescribeOrganizationalUnitRequest
import Organizations.DescribeOrganizationalUnitResponse
import Organizations.DescribePolicyRequest
import Organizations.DescribePolicyResponse
import Organizations.DetachPolicyRequest
import Organizations.DisableAWSServiceAccessRequest
import Organizations.DisablePolicyTypeRequest
import Organizations.DisablePolicyTypeResponse
import Organizations.EnableAWSServiceAccessRequest
import Organizations.EnableAllFeaturesRequest
import Organizations.EnableAllFeaturesResponse
import Organizations.EnablePolicyTypeRequest
import Organizations.EnablePolicyTypeResponse
import Organizations.InviteAccountToOrganizationRequest
import Organizations.InviteAccountToOrganizationResponse
import Organizations.ListAWSServiceAccessForOrganizationRequest
import Organizations.ListAWSServiceAccessForOrganizationResponse
import Organizations.ListAccountsRequest
import Organizations.ListAccountsResponse
import Organizations.ListAccountsForParentRequest
import Organizations.ListAccountsForParentResponse
import Organizations.ListChildrenRequest
import Organizations.ListChildrenResponse
import Organizations.ListCreateAccountStatusRequest
import Organizations.ListCreateAccountStatusResponse
import Organizations.ListDelegatedAdministratorsRequest
import Organizations.ListDelegatedAdministratorsResponse
import Organizations.ListDelegatedServicesForAccountRequest
import Organizations.ListDelegatedServicesForAccountResponse
import Organizations.ListHandshakesForAccountRequest
import Organizations.ListHandshakesForAccountResponse
import Organizations.ListHandshakesForOrganizationRequest
import Organizations.ListHandshakesForOrganizationResponse
import Organizations.ListOrganizationalUnitsForParentRequest
import Organizations.ListOrganizationalUnitsForParentResponse
import Organizations.ListParentsRequest
import Organizations.ListParentsResponse
import Organizations.ListPoliciesRequest
import Organizations.ListPoliciesResponse
import Organizations.ListPoliciesForTargetRequest
import Organizations.ListPoliciesForTargetResponse
import Organizations.ListRootsRequest
import Organizations.ListRootsResponse
import Organizations.ListTagsForResourceRequest
import Organizations.ListTagsForResourceResponse
import Organizations.ListTargetsForPolicyRequest
import Organizations.ListTargetsForPolicyResponse
import Organizations.MoveAccountRequest
import Organizations.RegisterDelegatedAdministratorRequest
import Organizations.RemoveAccountFromOrganizationRequest
import Organizations.TagResourceRequest
import Organizations.UntagResourceRequest
import Organizations.UpdateOrganizationalUnitRequest
import Organizations.UpdateOrganizationalUnitResponse
import Organizations.UpdatePolicyRequest
import Organizations.UpdatePolicyResponse
import Organizations.Organization
import Organizations.Policy
import Organizations.EffectivePolicy
import Organizations.HandshakeFilter

typealias AccountArn = String

typealias AccountId = String

typealias AccountName = String

typealias Accounts = Array<Account>

typealias AwsManagedPolicy = Boolean

typealias ChildId = String

typealias Children = Array<Child>

typealias CreateAccountRequestId = String

typealias CreateAccountStates = Array<String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */>

typealias CreateAccountStatuses = Array<CreateAccountStatus>

typealias DelegatedAdministrators = Array<DelegatedAdministrator>

typealias DelegatedServices = Array<DelegatedService>

typealias Email = String

typealias EnabledServicePrincipals = Array<EnabledServicePrincipal>

typealias GenericArn = String

typealias HandshakeArn = String

typealias HandshakeId = String

typealias HandshakeNotes = String

typealias HandshakeParties = Array<HandshakeParty>

typealias HandshakePartyId = String

typealias HandshakeResourceValue = String

typealias HandshakeResources = Array<HandshakeResource>

typealias Handshakes = Array<Handshake>

typealias MaxResults = Number

typealias NextToken = String

typealias OrganizationArn = String

typealias OrganizationId = String

typealias OrganizationalUnitArn = String

typealias OrganizationalUnitId = String

typealias OrganizationalUnitName = String

typealias OrganizationalUnits = Array<OrganizationalUnit>

typealias ParentId = String

typealias Parents = Array<Parent>

typealias Policies = Array<PolicySummary>

typealias PolicyArn = String

typealias PolicyContent = String

typealias PolicyDescription = String

typealias PolicyId = String

typealias PolicyName = String

typealias PolicyTargetId = String

typealias PolicyTargets = Array<PolicyTargetSummary>

typealias PolicyTypes = Array<PolicyTypeSummary>

typealias RoleName = String

typealias RootArn = String

typealias RootId = String

typealias RootName = String

typealias Roots = Array<Root>

typealias ServicePrincipal = String

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias TaggableResourceId = String

typealias Tags = Array<Tag>

typealias TargetName = String

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class Organizations(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Organizations.Types.ClientConfiguration */
    open fun acceptHandshake(params: AcceptHandshakeRequest, callback: (err: AWSError, data: AcceptHandshakeResponse) -> Unit = definedExternally): Request<AcceptHandshakeResponse, AWSError>
    open fun acceptHandshake(callback: (err: AWSError, data: AcceptHandshakeResponse) -> Unit = definedExternally): Request<AcceptHandshakeResponse, AWSError>
    open fun attachPolicy(params: AttachPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun cancelHandshake(params: CancelHandshakeRequest, callback: (err: AWSError, data: CancelHandshakeResponse) -> Unit = definedExternally): Request<CancelHandshakeResponse, AWSError>
    open fun cancelHandshake(callback: (err: AWSError, data: CancelHandshakeResponse) -> Unit = definedExternally): Request<CancelHandshakeResponse, AWSError>
    open fun createAccount(params: CreateAccountRequest, callback: (err: AWSError, data: CreateAccountResponse) -> Unit = definedExternally): Request<CreateAccountResponse, AWSError>
    open fun createAccount(callback: (err: AWSError, data: CreateAccountResponse) -> Unit = definedExternally): Request<CreateAccountResponse, AWSError>
    open fun createGovCloudAccount(params: CreateGovCloudAccountRequest, callback: (err: AWSError, data: CreateGovCloudAccountResponse) -> Unit = definedExternally): Request<CreateGovCloudAccountResponse, AWSError>
    open fun createGovCloudAccount(callback: (err: AWSError, data: CreateGovCloudAccountResponse) -> Unit = definedExternally): Request<CreateGovCloudAccountResponse, AWSError>
    open fun createOrganization(params: CreateOrganizationRequest, callback: (err: AWSError, data: CreateOrganizationResponse) -> Unit = definedExternally): Request<CreateOrganizationResponse, AWSError>
    open fun createOrganization(callback: (err: AWSError, data: CreateOrganizationResponse) -> Unit = definedExternally): Request<CreateOrganizationResponse, AWSError>
    open fun createOrganizationalUnit(params: CreateOrganizationalUnitRequest, callback: (err: AWSError, data: CreateOrganizationalUnitResponse) -> Unit = definedExternally): Request<CreateOrganizationalUnitResponse, AWSError>
    open fun createOrganizationalUnit(callback: (err: AWSError, data: CreateOrganizationalUnitResponse) -> Unit = definedExternally): Request<CreateOrganizationalUnitResponse, AWSError>
    open fun createPolicy(params: CreatePolicyRequest, callback: (err: AWSError, data: CreatePolicyResponse) -> Unit = definedExternally): Request<CreatePolicyResponse, AWSError>
    open fun createPolicy(callback: (err: AWSError, data: CreatePolicyResponse) -> Unit = definedExternally): Request<CreatePolicyResponse, AWSError>
    open fun declineHandshake(params: DeclineHandshakeRequest, callback: (err: AWSError, data: DeclineHandshakeResponse) -> Unit = definedExternally): Request<DeclineHandshakeResponse, AWSError>
    open fun declineHandshake(callback: (err: AWSError, data: DeclineHandshakeResponse) -> Unit = definedExternally): Request<DeclineHandshakeResponse, AWSError>
    open fun deleteOrganization(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteOrganizationalUnit(params: DeleteOrganizationalUnitRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteOrganizationalUnit(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicy(params: DeletePolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterDelegatedAdministrator(params: DeregisterDelegatedAdministratorRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterDelegatedAdministrator(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeAccount(params: DescribeAccountRequest, callback: (err: AWSError, data: DescribeAccountResponse) -> Unit = definedExternally): Request<DescribeAccountResponse, AWSError>
    open fun describeAccount(callback: (err: AWSError, data: DescribeAccountResponse) -> Unit = definedExternally): Request<DescribeAccountResponse, AWSError>
    open fun describeCreateAccountStatus(params: DescribeCreateAccountStatusRequest, callback: (err: AWSError, data: DescribeCreateAccountStatusResponse) -> Unit = definedExternally): Request<DescribeCreateAccountStatusResponse, AWSError>
    open fun describeCreateAccountStatus(callback: (err: AWSError, data: DescribeCreateAccountStatusResponse) -> Unit = definedExternally): Request<DescribeCreateAccountStatusResponse, AWSError>
    open fun describeEffectivePolicy(params: DescribeEffectivePolicyRequest, callback: (err: AWSError, data: DescribeEffectivePolicyResponse) -> Unit = definedExternally): Request<DescribeEffectivePolicyResponse, AWSError>
    open fun describeEffectivePolicy(callback: (err: AWSError, data: DescribeEffectivePolicyResponse) -> Unit = definedExternally): Request<DescribeEffectivePolicyResponse, AWSError>
    open fun describeHandshake(params: DescribeHandshakeRequest, callback: (err: AWSError, data: DescribeHandshakeResponse) -> Unit = definedExternally): Request<DescribeHandshakeResponse, AWSError>
    open fun describeHandshake(callback: (err: AWSError, data: DescribeHandshakeResponse) -> Unit = definedExternally): Request<DescribeHandshakeResponse, AWSError>
    open fun describeOrganization(callback: (err: AWSError, data: DescribeOrganizationResponse) -> Unit = definedExternally): Request<DescribeOrganizationResponse, AWSError>
    open fun describeOrganizationalUnit(params: DescribeOrganizationalUnitRequest, callback: (err: AWSError, data: DescribeOrganizationalUnitResponse) -> Unit = definedExternally): Request<DescribeOrganizationalUnitResponse, AWSError>
    open fun describeOrganizationalUnit(callback: (err: AWSError, data: DescribeOrganizationalUnitResponse) -> Unit = definedExternally): Request<DescribeOrganizationalUnitResponse, AWSError>
    open fun describePolicy(params: DescribePolicyRequest, callback: (err: AWSError, data: DescribePolicyResponse) -> Unit = definedExternally): Request<DescribePolicyResponse, AWSError>
    open fun describePolicy(callback: (err: AWSError, data: DescribePolicyResponse) -> Unit = definedExternally): Request<DescribePolicyResponse, AWSError>
    open fun detachPolicy(params: DetachPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableAWSServiceAccess(params: DisableAWSServiceAccessRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableAWSServiceAccess(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disablePolicyType(params: DisablePolicyTypeRequest, callback: (err: AWSError, data: DisablePolicyTypeResponse) -> Unit = definedExternally): Request<DisablePolicyTypeResponse, AWSError>
    open fun disablePolicyType(callback: (err: AWSError, data: DisablePolicyTypeResponse) -> Unit = definedExternally): Request<DisablePolicyTypeResponse, AWSError>
    open fun enableAWSServiceAccess(params: EnableAWSServiceAccessRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableAWSServiceAccess(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableAllFeatures(params: EnableAllFeaturesRequest, callback: (err: AWSError, data: EnableAllFeaturesResponse) -> Unit = definedExternally): Request<EnableAllFeaturesResponse, AWSError>
    open fun enableAllFeatures(callback: (err: AWSError, data: EnableAllFeaturesResponse) -> Unit = definedExternally): Request<EnableAllFeaturesResponse, AWSError>
    open fun enablePolicyType(params: EnablePolicyTypeRequest, callback: (err: AWSError, data: EnablePolicyTypeResponse) -> Unit = definedExternally): Request<EnablePolicyTypeResponse, AWSError>
    open fun enablePolicyType(callback: (err: AWSError, data: EnablePolicyTypeResponse) -> Unit = definedExternally): Request<EnablePolicyTypeResponse, AWSError>
    open fun inviteAccountToOrganization(params: InviteAccountToOrganizationRequest, callback: (err: AWSError, data: InviteAccountToOrganizationResponse) -> Unit = definedExternally): Request<InviteAccountToOrganizationResponse, AWSError>
    open fun inviteAccountToOrganization(callback: (err: AWSError, data: InviteAccountToOrganizationResponse) -> Unit = definedExternally): Request<InviteAccountToOrganizationResponse, AWSError>
    open fun leaveOrganization(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun listAWSServiceAccessForOrganization(params: ListAWSServiceAccessForOrganizationRequest, callback: (err: AWSError, data: ListAWSServiceAccessForOrganizationResponse) -> Unit = definedExternally): Request<ListAWSServiceAccessForOrganizationResponse, AWSError>
    open fun listAWSServiceAccessForOrganization(callback: (err: AWSError, data: ListAWSServiceAccessForOrganizationResponse) -> Unit = definedExternally): Request<ListAWSServiceAccessForOrganizationResponse, AWSError>
    open fun listAccounts(params: ListAccountsRequest, callback: (err: AWSError, data: ListAccountsResponse) -> Unit = definedExternally): Request<ListAccountsResponse, AWSError>
    open fun listAccounts(callback: (err: AWSError, data: ListAccountsResponse) -> Unit = definedExternally): Request<ListAccountsResponse, AWSError>
    open fun listAccountsForParent(params: ListAccountsForParentRequest, callback: (err: AWSError, data: ListAccountsForParentResponse) -> Unit = definedExternally): Request<ListAccountsForParentResponse, AWSError>
    open fun listAccountsForParent(callback: (err: AWSError, data: ListAccountsForParentResponse) -> Unit = definedExternally): Request<ListAccountsForParentResponse, AWSError>
    open fun listChildren(params: ListChildrenRequest, callback: (err: AWSError, data: ListChildrenResponse) -> Unit = definedExternally): Request<ListChildrenResponse, AWSError>
    open fun listChildren(callback: (err: AWSError, data: ListChildrenResponse) -> Unit = definedExternally): Request<ListChildrenResponse, AWSError>
    open fun listCreateAccountStatus(params: ListCreateAccountStatusRequest, callback: (err: AWSError, data: ListCreateAccountStatusResponse) -> Unit = definedExternally): Request<ListCreateAccountStatusResponse, AWSError>
    open fun listCreateAccountStatus(callback: (err: AWSError, data: ListCreateAccountStatusResponse) -> Unit = definedExternally): Request<ListCreateAccountStatusResponse, AWSError>
    open fun listDelegatedAdministrators(params: ListDelegatedAdministratorsRequest, callback: (err: AWSError, data: ListDelegatedAdministratorsResponse) -> Unit = definedExternally): Request<ListDelegatedAdministratorsResponse, AWSError>
    open fun listDelegatedAdministrators(callback: (err: AWSError, data: ListDelegatedAdministratorsResponse) -> Unit = definedExternally): Request<ListDelegatedAdministratorsResponse, AWSError>
    open fun listDelegatedServicesForAccount(params: ListDelegatedServicesForAccountRequest, callback: (err: AWSError, data: ListDelegatedServicesForAccountResponse) -> Unit = definedExternally): Request<ListDelegatedServicesForAccountResponse, AWSError>
    open fun listDelegatedServicesForAccount(callback: (err: AWSError, data: ListDelegatedServicesForAccountResponse) -> Unit = definedExternally): Request<ListDelegatedServicesForAccountResponse, AWSError>
    open fun listHandshakesForAccount(params: ListHandshakesForAccountRequest, callback: (err: AWSError, data: ListHandshakesForAccountResponse) -> Unit = definedExternally): Request<ListHandshakesForAccountResponse, AWSError>
    open fun listHandshakesForAccount(callback: (err: AWSError, data: ListHandshakesForAccountResponse) -> Unit = definedExternally): Request<ListHandshakesForAccountResponse, AWSError>
    open fun listHandshakesForOrganization(params: ListHandshakesForOrganizationRequest, callback: (err: AWSError, data: ListHandshakesForOrganizationResponse) -> Unit = definedExternally): Request<ListHandshakesForOrganizationResponse, AWSError>
    open fun listHandshakesForOrganization(callback: (err: AWSError, data: ListHandshakesForOrganizationResponse) -> Unit = definedExternally): Request<ListHandshakesForOrganizationResponse, AWSError>
    open fun listOrganizationalUnitsForParent(params: ListOrganizationalUnitsForParentRequest, callback: (err: AWSError, data: ListOrganizationalUnitsForParentResponse) -> Unit = definedExternally): Request<ListOrganizationalUnitsForParentResponse, AWSError>
    open fun listOrganizationalUnitsForParent(callback: (err: AWSError, data: ListOrganizationalUnitsForParentResponse) -> Unit = definedExternally): Request<ListOrganizationalUnitsForParentResponse, AWSError>
    open fun listParents(params: ListParentsRequest, callback: (err: AWSError, data: ListParentsResponse) -> Unit = definedExternally): Request<ListParentsResponse, AWSError>
    open fun listParents(callback: (err: AWSError, data: ListParentsResponse) -> Unit = definedExternally): Request<ListParentsResponse, AWSError>
    open fun listPolicies(params: ListPoliciesRequest, callback: (err: AWSError, data: ListPoliciesResponse) -> Unit = definedExternally): Request<ListPoliciesResponse, AWSError>
    open fun listPolicies(callback: (err: AWSError, data: ListPoliciesResponse) -> Unit = definedExternally): Request<ListPoliciesResponse, AWSError>
    open fun listPoliciesForTarget(params: ListPoliciesForTargetRequest, callback: (err: AWSError, data: ListPoliciesForTargetResponse) -> Unit = definedExternally): Request<ListPoliciesForTargetResponse, AWSError>
    open fun listPoliciesForTarget(callback: (err: AWSError, data: ListPoliciesForTargetResponse) -> Unit = definedExternally): Request<ListPoliciesForTargetResponse, AWSError>
    open fun listRoots(params: ListRootsRequest, callback: (err: AWSError, data: ListRootsResponse) -> Unit = definedExternally): Request<ListRootsResponse, AWSError>
    open fun listRoots(callback: (err: AWSError, data: ListRootsResponse) -> Unit = definedExternally): Request<ListRootsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTargetsForPolicy(params: ListTargetsForPolicyRequest, callback: (err: AWSError, data: ListTargetsForPolicyResponse) -> Unit = definedExternally): Request<ListTargetsForPolicyResponse, AWSError>
    open fun listTargetsForPolicy(callback: (err: AWSError, data: ListTargetsForPolicyResponse) -> Unit = definedExternally): Request<ListTargetsForPolicyResponse, AWSError>
    open fun moveAccount(params: MoveAccountRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun moveAccount(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerDelegatedAdministrator(params: RegisterDelegatedAdministratorRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun registerDelegatedAdministrator(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeAccountFromOrganization(params: RemoveAccountFromOrganizationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeAccountFromOrganization(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateOrganizationalUnit(params: UpdateOrganizationalUnitRequest, callback: (err: AWSError, data: UpdateOrganizationalUnitResponse) -> Unit = definedExternally): Request<UpdateOrganizationalUnitResponse, AWSError>
    open fun updateOrganizationalUnit(callback: (err: AWSError, data: UpdateOrganizationalUnitResponse) -> Unit = definedExternally): Request<UpdateOrganizationalUnitResponse, AWSError>
    open fun updatePolicy(params: UpdatePolicyRequest, callback: (err: AWSError, data: UpdatePolicyResponse) -> Unit = definedExternally): Request<UpdatePolicyResponse, AWSError>
    open fun updatePolicy(callback: (err: AWSError, data: UpdatePolicyResponse) -> Unit = definedExternally): Request<UpdatePolicyResponse, AWSError>
    interface AcceptHandshakeRequest {
        var HandshakeId: HandshakeId
    }
    interface AcceptHandshakeResponse {
        var Handshake: Handshake?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Account {
        var Id: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: AccountArn?
            get() = definedExternally
            set(value) = definedExternally
        var Email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var Name: AccountName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "SUSPENDED" | String */
        var JoinedMethod: String /* "INVITED" | "CREATED" | String */
        var JoinedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachPolicyRequest {
        var PolicyId: PolicyId
        var TargetId: PolicyTargetId
    }
    interface CancelHandshakeRequest {
        var HandshakeId: HandshakeId
    }
    interface CancelHandshakeResponse {
        var Handshake: Handshake?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Child {
        var Id: ChildId?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "ACCOUNT" | "ORGANIZATIONAL_UNIT" | String */
    }
    interface CreateAccountRequest {
        var Email: Email
        var AccountName: AccountName
        var RoleName: RoleName?
            get() = definedExternally
            set(value) = definedExternally
        var IamUserAccessToBilling: String /* "ALLOW" | "DENY" | String */
    }
    interface CreateAccountResponse {
        var CreateAccountStatus: CreateAccountStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAccountStatus {
        var Id: CreateAccountRequestId?
            get() = definedExternally
            set(value) = definedExternally
        var AccountName: AccountName?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var RequestedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var GovCloudAccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: String /* "ACCOUNT_LIMIT_EXCEEDED" | "EMAIL_ALREADY_EXISTS" | "INVALID_ADDRESS" | "INVALID_EMAIL" | "CONCURRENT_ACCOUNT_MODIFICATION" | "INTERNAL_FAILURE" | "GOVCLOUD_ACCOUNT_ALREADY_EXISTS" | String */
    }
    interface CreateGovCloudAccountRequest {
        var Email: Email
        var AccountName: AccountName
        var RoleName: RoleName?
            get() = definedExternally
            set(value) = definedExternally
        var IamUserAccessToBilling: String /* "ALLOW" | "DENY" | String */
    }
    interface CreateGovCloudAccountResponse {
        var CreateAccountStatus: CreateAccountStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOrganizationRequest {
        var FeatureSet: String /* "ALL" | "CONSOLIDATED_BILLING" | String */
    }
    interface CreateOrganizationResponse {
        var Organization: Organization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOrganizationalUnitRequest {
        var ParentId: ParentId
        var Name: OrganizationalUnitName
    }
    interface CreateOrganizationalUnitResponse {
        var OrganizationalUnit: OrganizationalUnit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePolicyRequest {
        var Content: PolicyContent
        var Description: PolicyDescription
        var Name: PolicyName
        var Type: String /* "SERVICE_CONTROL_POLICY" | "TAG_POLICY" | String */
    }
    interface CreatePolicyResponse {
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeclineHandshakeRequest {
        var HandshakeId: HandshakeId
    }
    interface DeclineHandshakeResponse {
        var Handshake: Handshake?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DelegatedAdministrator {
        var Id: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: AccountArn?
            get() = definedExternally
            set(value) = definedExternally
        var Email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var Name: AccountName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "SUSPENDED" | String */
        var JoinedMethod: String /* "INVITED" | "CREATED" | String */
        var JoinedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DelegationEnabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DelegatedService {
        var ServicePrincipal: ServicePrincipal?
            get() = definedExternally
            set(value) = definedExternally
        var DelegationEnabledDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteOrganizationalUnitRequest {
        var OrganizationalUnitId: OrganizationalUnitId
    }
    interface DeletePolicyRequest {
        var PolicyId: PolicyId
    }
    interface DeregisterDelegatedAdministratorRequest {
        var AccountId: AccountId
        var ServicePrincipal: ServicePrincipal
    }
    interface DescribeAccountRequest {
        var AccountId: AccountId
    }
    interface DescribeAccountResponse {
        var Account: Account?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCreateAccountStatusRequest {
        var CreateAccountRequestId: CreateAccountRequestId
    }
    interface DescribeCreateAccountStatusResponse {
        var CreateAccountStatus: CreateAccountStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEffectivePolicyRequest {
        var PolicyType: String /* "TAG_POLICY" | String */
        var TargetId: PolicyTargetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEffectivePolicyResponse {
        var EffectivePolicy: EffectivePolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHandshakeRequest {
        var HandshakeId: HandshakeId
    }
    interface DescribeHandshakeResponse {
        var Handshake: Handshake?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationResponse {
        var Organization: Organization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationalUnitRequest {
        var OrganizationalUnitId: OrganizationalUnitId
    }
    interface DescribeOrganizationalUnitResponse {
        var OrganizationalUnit: OrganizationalUnit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePolicyRequest {
        var PolicyId: PolicyId
    }
    interface DescribePolicyResponse {
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachPolicyRequest {
        var PolicyId: PolicyId
        var TargetId: PolicyTargetId
    }
    interface DisableAWSServiceAccessRequest {
        var ServicePrincipal: ServicePrincipal
    }
    interface DisablePolicyTypeRequest {
        var RootId: RootId
        var PolicyType: String /* "SERVICE_CONTROL_POLICY" | "TAG_POLICY" | String */
    }
    interface DisablePolicyTypeResponse {
        var Root: Root?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EffectivePolicy {
        var PolicyContent: PolicyContent?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TargetId: PolicyTargetId?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyType: String /* "TAG_POLICY" | String */
    }
    interface EnableAWSServiceAccessRequest {
        var ServicePrincipal: ServicePrincipal
    }
    interface EnableAllFeaturesRequest
    interface EnableAllFeaturesResponse {
        var Handshake: Handshake?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnablePolicyTypeRequest {
        var RootId: RootId
        var PolicyType: String /* "SERVICE_CONTROL_POLICY" | "TAG_POLICY" | String */
    }
    interface EnablePolicyTypeResponse {
        var Root: Root?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnabledServicePrincipal {
        var ServicePrincipal: ServicePrincipal?
            get() = definedExternally
            set(value) = definedExternally
        var DateEnabled: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Handshake {
        var Id: HandshakeId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: HandshakeArn?
            get() = definedExternally
            set(value) = definedExternally
        var Parties: HandshakeParties?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "REQUESTED" | "OPEN" | "CANCELED" | "ACCEPTED" | "DECLINED" | "EXPIRED" | String */
        var RequestedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Action: String /* "INVITE" | "ENABLE_ALL_FEATURES" | "APPROVE_ALL_FEATURES" | "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE" | String */
        var Resources: HandshakeResources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HandshakeFilter {
        var ActionType: String /* "INVITE" | "ENABLE_ALL_FEATURES" | "APPROVE_ALL_FEATURES" | "ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE" | String */
        var ParentHandshakeId: HandshakeId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HandshakeParty {
        var Id: HandshakePartyId
        var Type: String /* "ACCOUNT" | "ORGANIZATION" | "EMAIL" | String */
    }
    interface HandshakeResource {
        var Value: HandshakeResourceValue?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "ACCOUNT" | "ORGANIZATION" | "ORGANIZATION_FEATURE_SET" | "EMAIL" | "MASTER_EMAIL" | "MASTER_NAME" | "NOTES" | "PARENT_HANDSHAKE" | String */
        var Resources: HandshakeResources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InviteAccountToOrganizationRequest {
        var Target: HandshakeParty
        var Notes: HandshakeNotes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InviteAccountToOrganizationResponse {
        var Handshake: Handshake?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAWSServiceAccessForOrganizationRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAWSServiceAccessForOrganizationResponse {
        var EnabledServicePrincipals: EnabledServicePrincipals?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountsForParentRequest {
        var ParentId: ParentId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountsForParentResponse {
        var Accounts: Accounts?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountsResponse {
        var Accounts: Accounts?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChildrenRequest {
        var ParentId: ParentId
        var ChildType: String /* "ACCOUNT" | "ORGANIZATIONAL_UNIT" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChildrenResponse {
        var Children: Children?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCreateAccountStatusRequest {
        var States: CreateAccountStates?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCreateAccountStatusResponse {
        var CreateAccountStatuses: CreateAccountStatuses?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDelegatedAdministratorsRequest {
        var ServicePrincipal: ServicePrincipal?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDelegatedAdministratorsResponse {
        var DelegatedAdministrators: DelegatedAdministrators?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDelegatedServicesForAccountRequest {
        var AccountId: AccountId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDelegatedServicesForAccountResponse {
        var DelegatedServices: DelegatedServices?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHandshakesForAccountRequest {
        var Filter: HandshakeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHandshakesForAccountResponse {
        var Handshakes: Handshakes?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHandshakesForOrganizationRequest {
        var Filter: HandshakeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHandshakesForOrganizationResponse {
        var Handshakes: Handshakes?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOrganizationalUnitsForParentRequest {
        var ParentId: ParentId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOrganizationalUnitsForParentResponse {
        var OrganizationalUnits: OrganizationalUnits?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListParentsRequest {
        var ChildId: ChildId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListParentsResponse {
        var Parents: Parents?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesForTargetRequest {
        var TargetId: PolicyTargetId
        var Filter: String /* "SERVICE_CONTROL_POLICY" | "TAG_POLICY" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesForTargetResponse {
        var Policies: Policies?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesRequest {
        var Filter: String /* "SERVICE_CONTROL_POLICY" | "TAG_POLICY" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesResponse {
        var Policies: Policies?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRootsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRootsResponse {
        var Roots: Roots?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceId: TaggableResourceId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResponse {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTargetsForPolicyRequest {
        var PolicyId: PolicyId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTargetsForPolicyResponse {
        var Targets: PolicyTargets?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MoveAccountRequest {
        var AccountId: AccountId
        var SourceParentId: ParentId
        var DestinationParentId: ParentId
    }
    interface Organization {
        var Id: OrganizationId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: OrganizationArn?
            get() = definedExternally
            set(value) = definedExternally
        var FeatureSet: String /* "ALL" | "CONSOLIDATED_BILLING" | String */
        var MasterAccountArn: AccountArn?
            get() = definedExternally
            set(value) = definedExternally
        var MasterAccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var MasterAccountEmail: Email?
            get() = definedExternally
            set(value) = definedExternally
        var AvailablePolicyTypes: PolicyTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationalUnit {
        var Id: OrganizationalUnitId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: OrganizationalUnitArn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: OrganizationalUnitName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Parent {
        var Id: ParentId?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "ROOT" | "ORGANIZATIONAL_UNIT" | String */
    }
    interface Policy {
        var PolicySummary: PolicySummary?
            get() = definedExternally
            set(value) = definedExternally
        var Content: PolicyContent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicySummary {
        var Id: PolicyId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: PolicyArn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: PolicyDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "SERVICE_CONTROL_POLICY" | "TAG_POLICY" | String */
        var AwsManaged: AwsManagedPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyTargetSummary {
        var TargetId: PolicyTargetId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: GenericArn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: TargetName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "ACCOUNT" | "ORGANIZATIONAL_UNIT" | "ROOT" | String */
    }
    interface PolicyTypeSummary {
        var Type: String /* "SERVICE_CONTROL_POLICY" | "TAG_POLICY" | String */
        var Status: String /* "ENABLED" | "PENDING_ENABLE" | "PENDING_DISABLE" | String */
    }
    interface RegisterDelegatedAdministratorRequest {
        var AccountId: AccountId
        var ServicePrincipal: ServicePrincipal
    }
    interface RemoveAccountFromOrganizationRequest {
        var AccountId: AccountId
    }
    interface Root {
        var Id: RootId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: RootArn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: RootName?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyTypes: PolicyTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceId: TaggableResourceId
        var Tags: Tags
    }
    interface UntagResourceRequest {
        var ResourceId: TaggableResourceId
        var TagKeys: TagKeys
    }
    interface UpdateOrganizationalUnitRequest {
        var OrganizationalUnitId: OrganizationalUnitId
        var Name: OrganizationalUnitName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateOrganizationalUnitResponse {
        var OrganizationalUnit: OrganizationalUnit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePolicyRequest {
        var PolicyId: PolicyId
        var Name: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: PolicyDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Content: PolicyContent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePolicyResponse {
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-11-28" | "latest" | String */
    }
}