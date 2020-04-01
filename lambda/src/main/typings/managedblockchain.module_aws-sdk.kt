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
import ManagedBlockchain.Invitation
import ManagedBlockchain.InviteAction
import ManagedBlockchain.MemberSummary
import ManagedBlockchain.NetworkSummary
import ManagedBlockchain.NodeSummary
import ManagedBlockchain.ProposalSummary
import ManagedBlockchain.VoteSummary
import ManagedBlockchain.RemoveAction
import ManagedBlockchain.CreateMemberInput
import ManagedBlockchain.CreateMemberOutput
import ManagedBlockchain.CreateNetworkInput
import ManagedBlockchain.CreateNetworkOutput
import ManagedBlockchain.CreateNodeInput
import ManagedBlockchain.CreateNodeOutput
import ManagedBlockchain.CreateProposalInput
import ManagedBlockchain.CreateProposalOutput
import ManagedBlockchain.DeleteMemberInput
import ManagedBlockchain.DeleteMemberOutput
import ManagedBlockchain.DeleteNodeInput
import ManagedBlockchain.DeleteNodeOutput
import ManagedBlockchain.GetMemberInput
import ManagedBlockchain.GetMemberOutput
import ManagedBlockchain.GetNetworkInput
import ManagedBlockchain.GetNetworkOutput
import ManagedBlockchain.GetNodeInput
import ManagedBlockchain.GetNodeOutput
import ManagedBlockchain.GetProposalInput
import ManagedBlockchain.GetProposalOutput
import ManagedBlockchain.ListInvitationsInput
import ManagedBlockchain.ListInvitationsOutput
import ManagedBlockchain.ListMembersInput
import ManagedBlockchain.ListMembersOutput
import ManagedBlockchain.ListNetworksInput
import ManagedBlockchain.ListNetworksOutput
import ManagedBlockchain.ListNodesInput
import ManagedBlockchain.ListNodesOutput
import ManagedBlockchain.ListProposalVotesInput
import ManagedBlockchain.ListProposalVotesOutput
import ManagedBlockchain.ListProposalsInput
import ManagedBlockchain.ListProposalsOutput
import ManagedBlockchain.RejectInvitationInput
import ManagedBlockchain.RejectInvitationOutput
import ManagedBlockchain.UpdateMemberInput
import ManagedBlockchain.UpdateMemberOutput
import ManagedBlockchain.UpdateNodeInput
import ManagedBlockchain.UpdateNodeOutput
import ManagedBlockchain.VoteOnProposalInput
import ManagedBlockchain.VoteOnProposalOutput
import ManagedBlockchain.MemberConfiguration
import ManagedBlockchain.NetworkFrameworkConfiguration
import ManagedBlockchain.VotingPolicy
import ManagedBlockchain.NodeConfiguration
import ManagedBlockchain.ProposalActions
import ManagedBlockchain.Member
import ManagedBlockchain.Network
import ManagedBlockchain.Node
import ManagedBlockchain.Proposal
import ManagedBlockchain.LogConfiguration
import ManagedBlockchain.MemberFrameworkAttributes
import ManagedBlockchain.MemberLogPublishingConfiguration
import ManagedBlockchain.MemberFrameworkConfiguration
import ManagedBlockchain.LogConfigurations
import ManagedBlockchain.MemberFabricAttributes
import ManagedBlockchain.MemberFabricConfiguration
import ManagedBlockchain.MemberFabricLogPublishingConfiguration
import ManagedBlockchain.NetworkFrameworkAttributes
import ManagedBlockchain.NetworkFabricAttributes
import ManagedBlockchain.NetworkFabricConfiguration
import ManagedBlockchain.NodeFrameworkAttributes
import ManagedBlockchain.NodeLogPublishingConfiguration
import ManagedBlockchain.NodeFabricAttributes
import ManagedBlockchain.NodeFabricLogPublishingConfiguration
import ManagedBlockchain.ApprovalThresholdPolicy

typealias AvailabilityZoneString = String

typealias ClientRequestTokenString = String

typealias DescriptionString = String

typealias Enabled = Boolean

typealias FrameworkVersionString = String

typealias InstanceTypeString = String

typealias InvitationList = Array<Invitation>

typealias InviteActionList = Array<InviteAction>

typealias IsOwned = Boolean

typealias MemberListMaxResults = Number

typealias MemberSummaryList = Array<MemberSummary>

typealias NameString = String

typealias NetworkListMaxResults = Number

typealias NetworkMemberNameString = String

typealias NetworkSummaryList = Array<NetworkSummary>

typealias NodeListMaxResults = Number

typealias NodeSummaryList = Array<NodeSummary>

typealias PaginationToken = String

typealias PasswordString = String

typealias PrincipalString = String

typealias ProposalDurationInt = Number

typealias ProposalListMaxResults = Number

typealias ProposalSummaryList = Array<ProposalSummary>

typealias ProposalVoteList = Array<VoteSummary>

typealias RemoveActionList = Array<RemoveAction>

typealias ResourceIdString = String

typealias String = String

typealias ThresholdPercentageInt = Number

typealias Timestamp = Date

typealias UsernameString = String

typealias VoteCount = Number

@JsModule("aws-sdk")
external open class ManagedBlockchain(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ManagedBlockchain.Types.ClientConfiguration */
    open fun createMember(params: CreateMemberInput, callback: (err: AWSError, data: CreateMemberOutput) -> Unit = definedExternally): Request<CreateMemberOutput, AWSError>
    open fun createMember(callback: (err: AWSError, data: CreateMemberOutput) -> Unit = definedExternally): Request<CreateMemberOutput, AWSError>
    open fun createNetwork(params: CreateNetworkInput, callback: (err: AWSError, data: CreateNetworkOutput) -> Unit = definedExternally): Request<CreateNetworkOutput, AWSError>
    open fun createNetwork(callback: (err: AWSError, data: CreateNetworkOutput) -> Unit = definedExternally): Request<CreateNetworkOutput, AWSError>
    open fun createNode(params: CreateNodeInput, callback: (err: AWSError, data: CreateNodeOutput) -> Unit = definedExternally): Request<CreateNodeOutput, AWSError>
    open fun createNode(callback: (err: AWSError, data: CreateNodeOutput) -> Unit = definedExternally): Request<CreateNodeOutput, AWSError>
    open fun createProposal(params: CreateProposalInput, callback: (err: AWSError, data: CreateProposalOutput) -> Unit = definedExternally): Request<CreateProposalOutput, AWSError>
    open fun createProposal(callback: (err: AWSError, data: CreateProposalOutput) -> Unit = definedExternally): Request<CreateProposalOutput, AWSError>
    open fun deleteMember(params: DeleteMemberInput, callback: (err: AWSError, data: DeleteMemberOutput) -> Unit = definedExternally): Request<DeleteMemberOutput, AWSError>
    open fun deleteMember(callback: (err: AWSError, data: DeleteMemberOutput) -> Unit = definedExternally): Request<DeleteMemberOutput, AWSError>
    open fun deleteNode(params: DeleteNodeInput, callback: (err: AWSError, data: DeleteNodeOutput) -> Unit = definedExternally): Request<DeleteNodeOutput, AWSError>
    open fun deleteNode(callback: (err: AWSError, data: DeleteNodeOutput) -> Unit = definedExternally): Request<DeleteNodeOutput, AWSError>
    open fun getMember(params: GetMemberInput, callback: (err: AWSError, data: GetMemberOutput) -> Unit = definedExternally): Request<GetMemberOutput, AWSError>
    open fun getMember(callback: (err: AWSError, data: GetMemberOutput) -> Unit = definedExternally): Request<GetMemberOutput, AWSError>
    open fun getNetwork(params: GetNetworkInput, callback: (err: AWSError, data: GetNetworkOutput) -> Unit = definedExternally): Request<GetNetworkOutput, AWSError>
    open fun getNetwork(callback: (err: AWSError, data: GetNetworkOutput) -> Unit = definedExternally): Request<GetNetworkOutput, AWSError>
    open fun getNode(params: GetNodeInput, callback: (err: AWSError, data: GetNodeOutput) -> Unit = definedExternally): Request<GetNodeOutput, AWSError>
    open fun getNode(callback: (err: AWSError, data: GetNodeOutput) -> Unit = definedExternally): Request<GetNodeOutput, AWSError>
    open fun getProposal(params: GetProposalInput, callback: (err: AWSError, data: GetProposalOutput) -> Unit = definedExternally): Request<GetProposalOutput, AWSError>
    open fun getProposal(callback: (err: AWSError, data: GetProposalOutput) -> Unit = definedExternally): Request<GetProposalOutput, AWSError>
    open fun listInvitations(params: ListInvitationsInput, callback: (err: AWSError, data: ListInvitationsOutput) -> Unit = definedExternally): Request<ListInvitationsOutput, AWSError>
    open fun listInvitations(callback: (err: AWSError, data: ListInvitationsOutput) -> Unit = definedExternally): Request<ListInvitationsOutput, AWSError>
    open fun listMembers(params: ListMembersInput, callback: (err: AWSError, data: ListMembersOutput) -> Unit = definedExternally): Request<ListMembersOutput, AWSError>
    open fun listMembers(callback: (err: AWSError, data: ListMembersOutput) -> Unit = definedExternally): Request<ListMembersOutput, AWSError>
    open fun listNetworks(params: ListNetworksInput, callback: (err: AWSError, data: ListNetworksOutput) -> Unit = definedExternally): Request<ListNetworksOutput, AWSError>
    open fun listNetworks(callback: (err: AWSError, data: ListNetworksOutput) -> Unit = definedExternally): Request<ListNetworksOutput, AWSError>
    open fun listNodes(params: ListNodesInput, callback: (err: AWSError, data: ListNodesOutput) -> Unit = definedExternally): Request<ListNodesOutput, AWSError>
    open fun listNodes(callback: (err: AWSError, data: ListNodesOutput) -> Unit = definedExternally): Request<ListNodesOutput, AWSError>
    open fun listProposalVotes(params: ListProposalVotesInput, callback: (err: AWSError, data: ListProposalVotesOutput) -> Unit = definedExternally): Request<ListProposalVotesOutput, AWSError>
    open fun listProposalVotes(callback: (err: AWSError, data: ListProposalVotesOutput) -> Unit = definedExternally): Request<ListProposalVotesOutput, AWSError>
    open fun listProposals(params: ListProposalsInput, callback: (err: AWSError, data: ListProposalsOutput) -> Unit = definedExternally): Request<ListProposalsOutput, AWSError>
    open fun listProposals(callback: (err: AWSError, data: ListProposalsOutput) -> Unit = definedExternally): Request<ListProposalsOutput, AWSError>
    open fun rejectInvitation(params: RejectInvitationInput, callback: (err: AWSError, data: RejectInvitationOutput) -> Unit = definedExternally): Request<RejectInvitationOutput, AWSError>
    open fun rejectInvitation(callback: (err: AWSError, data: RejectInvitationOutput) -> Unit = definedExternally): Request<RejectInvitationOutput, AWSError>
    open fun updateMember(params: UpdateMemberInput, callback: (err: AWSError, data: UpdateMemberOutput) -> Unit = definedExternally): Request<UpdateMemberOutput, AWSError>
    open fun updateMember(callback: (err: AWSError, data: UpdateMemberOutput) -> Unit = definedExternally): Request<UpdateMemberOutput, AWSError>
    open fun updateNode(params: UpdateNodeInput, callback: (err: AWSError, data: UpdateNodeOutput) -> Unit = definedExternally): Request<UpdateNodeOutput, AWSError>
    open fun updateNode(callback: (err: AWSError, data: UpdateNodeOutput) -> Unit = definedExternally): Request<UpdateNodeOutput, AWSError>
    open fun voteOnProposal(params: VoteOnProposalInput, callback: (err: AWSError, data: VoteOnProposalOutput) -> Unit = definedExternally): Request<VoteOnProposalOutput, AWSError>
    open fun voteOnProposal(callback: (err: AWSError, data: VoteOnProposalOutput) -> Unit = definedExternally): Request<VoteOnProposalOutput, AWSError>
    interface ApprovalThresholdPolicy {
        var ThresholdPercentage: ThresholdPercentageInt?
            get() = definedExternally
            set(value) = definedExternally
        var ProposalDurationInHours: ProposalDurationInt?
            get() = definedExternally
            set(value) = definedExternally
        var ThresholdComparator: String /* "GREATER_THAN" | "GREATER_THAN_OR_EQUAL_TO" | String */
    }
    interface CreateMemberInput {
        var ClientRequestToken: ClientRequestTokenString
        var InvitationId: ResourceIdString
        var NetworkId: ResourceIdString
        var MemberConfiguration: MemberConfiguration
    }
    interface CreateMemberOutput {
        var MemberId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNetworkInput {
        var ClientRequestToken: ClientRequestTokenString
        var Name: NameString
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Framework: String /* "HYPERLEDGER_FABRIC" | String */
        var FrameworkVersion: FrameworkVersionString
        var FrameworkConfiguration: NetworkFrameworkConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var VotingPolicy: VotingPolicy
        var MemberConfiguration: MemberConfiguration
    }
    interface CreateNetworkOutput {
        var NetworkId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var MemberId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNodeInput {
        var ClientRequestToken: ClientRequestTokenString
        var NetworkId: ResourceIdString
        var MemberId: ResourceIdString
        var NodeConfiguration: NodeConfiguration
    }
    interface CreateNodeOutput {
        var NodeId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProposalInput {
        var ClientRequestToken: ClientRequestTokenString
        var NetworkId: ResourceIdString
        var MemberId: ResourceIdString
        var Actions: ProposalActions
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProposalOutput {
        var ProposalId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteMemberInput {
        var NetworkId: ResourceIdString
        var MemberId: ResourceIdString
    }
    interface DeleteMemberOutput
    interface DeleteNodeInput {
        var NetworkId: ResourceIdString
        var MemberId: ResourceIdString
        var NodeId: ResourceIdString
    }
    interface DeleteNodeOutput
    interface GetMemberInput {
        var NetworkId: ResourceIdString
        var MemberId: ResourceIdString
    }
    interface GetMemberOutput {
        var Member: Member?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetNetworkInput {
        var NetworkId: ResourceIdString
    }
    interface GetNetworkOutput {
        var Network: Network?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetNodeInput {
        var NetworkId: ResourceIdString
        var MemberId: ResourceIdString
        var NodeId: ResourceIdString
    }
    interface GetNodeOutput {
        var Node: Node?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetProposalInput {
        var NetworkId: ResourceIdString
        var ProposalId: ResourceIdString
    }
    interface GetProposalOutput {
        var Proposal: Proposal?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Invitation {
        var InvitationId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "ACCEPTED" | "ACCEPTING" | "REJECTED" | "EXPIRED" | String */
        var NetworkSummary: NetworkSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InviteAction {
        var Principal: PrincipalString
    }
    interface ListInvitationsInput {
        var MaxResults: ProposalListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInvitationsOutput {
        var Invitations: InvitationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMembersInput {
        var NetworkId: ResourceIdString
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETED" | String */
        var IsOwned: IsOwned?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MemberListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMembersOutput {
        var Members: MemberSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNetworksInput {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Framework: String /* "HYPERLEDGER_FABRIC" | String */
        var Status: String /* "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "DELETING" | "DELETED" | String */
        var MaxResults: NetworkListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNetworksOutput {
        var Networks: NetworkSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNodesInput {
        var NetworkId: ResourceIdString
        var MemberId: ResourceIdString
        var Status: String /* "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETED" | "FAILED" | String */
        var MaxResults: NodeListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNodesOutput {
        var Nodes: NodeSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProposalVotesInput {
        var NetworkId: ResourceIdString
        var ProposalId: ResourceIdString
        var MaxResults: ProposalListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProposalVotesOutput {
        var ProposalVotes: ProposalVoteList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProposalsInput {
        var NetworkId: ResourceIdString
        var MaxResults: ProposalListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProposalsOutput {
        var Proposals: ProposalSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogConfiguration {
        var Enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogConfigurations {
        var Cloudwatch: LogConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Member {
        var NetworkId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Id: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NetworkMemberNameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var FrameworkAttributes: MemberFrameworkAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var LogPublishingConfiguration: MemberLogPublishingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETED" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberConfiguration {
        var Name: NetworkMemberNameString
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var FrameworkConfiguration: MemberFrameworkConfiguration
        var LogPublishingConfiguration: MemberLogPublishingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberFabricAttributes {
        var AdminUsername: UsernameString?
            get() = definedExternally
            set(value) = definedExternally
        var CaEndpoint: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberFabricConfiguration {
        var AdminUsername: UsernameString
        var AdminPassword: PasswordString
    }
    interface MemberFabricLogPublishingConfiguration {
        var CaLogs: LogConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberFrameworkAttributes {
        var Fabric: MemberFabricAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberFrameworkConfiguration {
        var Fabric: MemberFabricConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberLogPublishingConfiguration {
        var Fabric: MemberFabricLogPublishingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberSummary {
        var Id: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NetworkMemberNameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETED" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var IsOwned: IsOwned?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Network {
        var Id: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Framework: String /* "HYPERLEDGER_FABRIC" | String */
        var FrameworkVersion: FrameworkVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var FrameworkAttributes: NetworkFrameworkAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var VpcEndpointServiceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var VotingPolicy: VotingPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "DELETING" | "DELETED" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkFabricAttributes {
        var OrderingServiceEndpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var Edition: String /* "STARTER" | "STANDARD" | String */
    }
    interface NetworkFabricConfiguration {
        var Edition: String /* "STARTER" | "STANDARD" | String */
    }
    interface NetworkFrameworkAttributes {
        var Fabric: NetworkFabricAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkFrameworkConfiguration {
        var Fabric: NetworkFabricConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkSummary {
        var Id: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Framework: String /* "HYPERLEDGER_FABRIC" | String */
        var FrameworkVersion: FrameworkVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "DELETING" | "DELETED" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Node {
        var NetworkId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var MemberId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Id: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: InstanceTypeString?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: AvailabilityZoneString?
            get() = definedExternally
            set(value) = definedExternally
        var FrameworkAttributes: NodeFrameworkAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var LogPublishingConfiguration: NodeLogPublishingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETED" | "FAILED" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeConfiguration {
        var InstanceType: InstanceTypeString
        var AvailabilityZone: AvailabilityZoneString
        var LogPublishingConfiguration: NodeLogPublishingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeFabricAttributes {
        var PeerEndpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var PeerEventEndpoint: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeFabricLogPublishingConfiguration {
        var ChaincodeLogs: LogConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var PeerLogs: LogConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeFrameworkAttributes {
        var Fabric: NodeFabricAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeLogPublishingConfiguration {
        var Fabric: NodeFabricLogPublishingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeSummary {
        var Id: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "AVAILABLE" | "CREATE_FAILED" | "UPDATING" | "DELETING" | "DELETED" | "FAILED" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: AvailabilityZoneString?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: InstanceTypeString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Proposal {
        var ProposalId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: ProposalActions?
            get() = definedExternally
            set(value) = definedExternally
        var ProposedByMemberId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var ProposedByMemberName: NetworkMemberNameString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "IN_PROGRESS" | "APPROVED" | "REJECTED" | "EXPIRED" | "ACTION_FAILED" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var YesVoteCount: VoteCount?
            get() = definedExternally
            set(value) = definedExternally
        var NoVoteCount: VoteCount?
            get() = definedExternally
            set(value) = definedExternally
        var OutstandingVoteCount: VoteCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProposalActions {
        var Invitations: InviteActionList?
            get() = definedExternally
            set(value) = definedExternally
        var Removals: RemoveActionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProposalSummary {
        var ProposalId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var ProposedByMemberId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
        var ProposedByMemberName: NetworkMemberNameString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "IN_PROGRESS" | "APPROVED" | "REJECTED" | "EXPIRED" | "ACTION_FAILED" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RejectInvitationInput {
        var InvitationId: ResourceIdString
    }
    interface RejectInvitationOutput
    interface RemoveAction {
        var MemberId: ResourceIdString
    }
    interface UpdateMemberInput {
        var NetworkId: ResourceIdString
        var MemberId: ResourceIdString
        var LogPublishingConfiguration: MemberLogPublishingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMemberOutput
    interface UpdateNodeInput {
        var NetworkId: ResourceIdString
        var MemberId: ResourceIdString
        var NodeId: ResourceIdString
        var LogPublishingConfiguration: NodeLogPublishingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNodeOutput
    interface VoteOnProposalInput {
        var NetworkId: ResourceIdString
        var ProposalId: ResourceIdString
        var VoterMemberId: ResourceIdString
        var Vote: String /* "YES" | "NO" | String */
    }
    interface VoteOnProposalOutput
    interface VoteSummary {
        var Vote: String /* "YES" | "NO" | String */
        var MemberName: NetworkMemberNameString?
            get() = definedExternally
            set(value) = definedExternally
        var MemberId: ResourceIdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VotingPolicy {
        var ApprovalThresholdPolicy: ApprovalThresholdPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-09-24" | "latest" | String */
    }
}