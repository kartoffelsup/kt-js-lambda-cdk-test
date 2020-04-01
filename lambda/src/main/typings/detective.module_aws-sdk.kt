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
import Detective.Account
import Detective.Graph
import Detective.MemberDetail
import Detective.UnprocessedAccount
import Detective.AcceptInvitationRequest
import Detective.CreateGraphResponse
import Detective.CreateMembersRequest
import Detective.CreateMembersResponse
import Detective.DeleteGraphRequest
import Detective.DeleteMembersRequest
import Detective.DeleteMembersResponse
import Detective.DisassociateMembershipRequest
import Detective.GetMembersRequest
import Detective.GetMembersResponse
import Detective.ListGraphsRequest
import Detective.ListGraphsResponse
import Detective.ListInvitationsRequest
import Detective.ListInvitationsResponse
import Detective.ListMembersRequest
import Detective.ListMembersResponse
import Detective.RejectInvitationRequest
import Detective.StartMonitoringMemberRequest

typealias AccountId = String

typealias AccountIdList = Array<AccountId>

typealias AccountList = Array<Account>

typealias EmailAddress = String

typealias EmailMessage = String

typealias GraphArn = String

typealias GraphList = Array<Graph>

typealias MemberDetailList = Array<MemberDetail>

typealias MemberResultsLimit = Number

typealias PaginationToken = String

typealias Percentage = Number

typealias Timestamp = Date

typealias UnprocessedAccountList = Array<UnprocessedAccount>

typealias UnprocessedReason = String

@JsModule("aws-sdk")
external open class Detective(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Detective.Types.ClientConfiguration */
    open fun acceptInvitation(params: AcceptInvitationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun acceptInvitation(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createGraph(callback: (err: AWSError, data: CreateGraphResponse) -> Unit = definedExternally): Request<CreateGraphResponse, AWSError>
    open fun createMembers(params: CreateMembersRequest, callback: (err: AWSError, data: CreateMembersResponse) -> Unit = definedExternally): Request<CreateMembersResponse, AWSError>
    open fun createMembers(callback: (err: AWSError, data: CreateMembersResponse) -> Unit = definedExternally): Request<CreateMembersResponse, AWSError>
    open fun deleteGraph(params: DeleteGraphRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteGraph(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMembers(params: DeleteMembersRequest, callback: (err: AWSError, data: DeleteMembersResponse) -> Unit = definedExternally): Request<DeleteMembersResponse, AWSError>
    open fun deleteMembers(callback: (err: AWSError, data: DeleteMembersResponse) -> Unit = definedExternally): Request<DeleteMembersResponse, AWSError>
    open fun disassociateMembership(params: DisassociateMembershipRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disassociateMembership(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getMembers(params: GetMembersRequest, callback: (err: AWSError, data: GetMembersResponse) -> Unit = definedExternally): Request<GetMembersResponse, AWSError>
    open fun getMembers(callback: (err: AWSError, data: GetMembersResponse) -> Unit = definedExternally): Request<GetMembersResponse, AWSError>
    open fun listGraphs(params: ListGraphsRequest, callback: (err: AWSError, data: ListGraphsResponse) -> Unit = definedExternally): Request<ListGraphsResponse, AWSError>
    open fun listGraphs(callback: (err: AWSError, data: ListGraphsResponse) -> Unit = definedExternally): Request<ListGraphsResponse, AWSError>
    open fun listInvitations(params: ListInvitationsRequest, callback: (err: AWSError, data: ListInvitationsResponse) -> Unit = definedExternally): Request<ListInvitationsResponse, AWSError>
    open fun listInvitations(callback: (err: AWSError, data: ListInvitationsResponse) -> Unit = definedExternally): Request<ListInvitationsResponse, AWSError>
    open fun listMembers(params: ListMembersRequest, callback: (err: AWSError, data: ListMembersResponse) -> Unit = definedExternally): Request<ListMembersResponse, AWSError>
    open fun listMembers(callback: (err: AWSError, data: ListMembersResponse) -> Unit = definedExternally): Request<ListMembersResponse, AWSError>
    open fun rejectInvitation(params: RejectInvitationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun rejectInvitation(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startMonitoringMember(params: StartMonitoringMemberRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startMonitoringMember(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface AcceptInvitationRequest {
        var GraphArn: GraphArn
    }
    interface Account {
        var AccountId: AccountId
        var EmailAddress: EmailAddress
    }
    interface CreateGraphResponse {
        var GraphArn: GraphArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMembersRequest {
        var GraphArn: GraphArn
        var Message: EmailMessage?
            get() = definedExternally
            set(value) = definedExternally
        var Accounts: AccountList
    }
    interface CreateMembersResponse {
        var Members: MemberDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedAccounts: UnprocessedAccountList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteGraphRequest {
        var GraphArn: GraphArn
    }
    interface DeleteMembersRequest {
        var GraphArn: GraphArn
        var AccountIds: AccountIdList
    }
    interface DeleteMembersResponse {
        var AccountIds: AccountIdList?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedAccounts: UnprocessedAccountList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateMembershipRequest {
        var GraphArn: GraphArn
    }
    interface GetMembersRequest {
        var GraphArn: GraphArn
        var AccountIds: AccountIdList
    }
    interface GetMembersResponse {
        var MemberDetails: MemberDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedAccounts: UnprocessedAccountList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Graph {
        var Arn: GraphArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGraphsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MemberResultsLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGraphsResponse {
        var GraphList: GraphList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInvitationsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MemberResultsLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInvitationsResponse {
        var Invitations: MemberDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMembersRequest {
        var GraphArn: GraphArn
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MemberResultsLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMembersResponse {
        var MemberDetails: MemberDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberDetail {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var EmailAddress: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var GraphArn: GraphArn?
            get() = definedExternally
            set(value) = definedExternally
        var MasterId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "INVITED" | "VERIFICATION_IN_PROGRESS" | "VERIFICATION_FAILED" | "ENABLED" | "ACCEPTED_BUT_DISABLED" | String */
        var DisabledReason: String /* "VOLUME_TOO_HIGH" | "VOLUME_UNKNOWN" | String */
        var InvitedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var PercentOfGraphUtilization: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var PercentOfGraphUtilizationUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RejectInvitationRequest {
        var GraphArn: GraphArn
    }
    interface StartMonitoringMemberRequest {
        var GraphArn: GraphArn
        var AccountId: AccountId
    }
    interface UnprocessedAccount {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Reason: UnprocessedReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-10-26" | "latest" | String */
    }
}