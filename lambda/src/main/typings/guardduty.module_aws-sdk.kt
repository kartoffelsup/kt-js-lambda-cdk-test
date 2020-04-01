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
import GuardDuty.AccountDetail
import GuardDuty.Destination
import GuardDuty.Finding
import GuardDuty.Invitation
import GuardDuty.Member
import GuardDuty.NetworkInterface
import GuardDuty.PortProbeDetail
import GuardDuty.PrivateIpAddressDetails
import GuardDuty.ProductCode
import GuardDuty.SecurityGroup
import GuardDuty.Tag
import GuardDuty.ThreatIntelligenceDetail
import GuardDuty.UnprocessedAccount
import GuardDuty.AcceptInvitationRequest
import GuardDuty.AcceptInvitationResponse
import GuardDuty.ArchiveFindingsRequest
import GuardDuty.ArchiveFindingsResponse
import GuardDuty.CreateDetectorRequest
import GuardDuty.CreateDetectorResponse
import GuardDuty.CreateFilterRequest
import GuardDuty.CreateFilterResponse
import GuardDuty.CreateIPSetRequest
import GuardDuty.CreateIPSetResponse
import GuardDuty.CreateMembersRequest
import GuardDuty.CreateMembersResponse
import GuardDuty.CreatePublishingDestinationRequest
import GuardDuty.CreatePublishingDestinationResponse
import GuardDuty.CreateSampleFindingsRequest
import GuardDuty.CreateSampleFindingsResponse
import GuardDuty.CreateThreatIntelSetRequest
import GuardDuty.CreateThreatIntelSetResponse
import GuardDuty.DeclineInvitationsRequest
import GuardDuty.DeclineInvitationsResponse
import GuardDuty.DeleteDetectorRequest
import GuardDuty.DeleteDetectorResponse
import GuardDuty.DeleteFilterRequest
import GuardDuty.DeleteFilterResponse
import GuardDuty.DeleteIPSetRequest
import GuardDuty.DeleteIPSetResponse
import GuardDuty.DeleteInvitationsRequest
import GuardDuty.DeleteInvitationsResponse
import GuardDuty.DeleteMembersRequest
import GuardDuty.DeleteMembersResponse
import GuardDuty.DeletePublishingDestinationRequest
import GuardDuty.DeletePublishingDestinationResponse
import GuardDuty.DeleteThreatIntelSetRequest
import GuardDuty.DeleteThreatIntelSetResponse
import GuardDuty.DescribePublishingDestinationRequest
import GuardDuty.DescribePublishingDestinationResponse
import GuardDuty.DisassociateFromMasterAccountRequest
import GuardDuty.DisassociateFromMasterAccountResponse
import GuardDuty.DisassociateMembersRequest
import GuardDuty.DisassociateMembersResponse
import GuardDuty.GetDetectorRequest
import GuardDuty.GetDetectorResponse
import GuardDuty.GetFilterRequest
import GuardDuty.GetFilterResponse
import GuardDuty.GetFindingsRequest
import GuardDuty.GetFindingsResponse
import GuardDuty.GetFindingsStatisticsRequest
import GuardDuty.GetFindingsStatisticsResponse
import GuardDuty.GetIPSetRequest
import GuardDuty.GetIPSetResponse
import GuardDuty.GetInvitationsCountRequest
import GuardDuty.GetInvitationsCountResponse
import GuardDuty.GetMasterAccountRequest
import GuardDuty.GetMasterAccountResponse
import GuardDuty.GetMembersRequest
import GuardDuty.GetMembersResponse
import GuardDuty.GetThreatIntelSetRequest
import GuardDuty.GetThreatIntelSetResponse
import GuardDuty.InviteMembersRequest
import GuardDuty.InviteMembersResponse
import GuardDuty.ListDetectorsRequest
import GuardDuty.ListDetectorsResponse
import GuardDuty.ListFiltersRequest
import GuardDuty.ListFiltersResponse
import GuardDuty.ListFindingsRequest
import GuardDuty.ListFindingsResponse
import GuardDuty.ListIPSetsRequest
import GuardDuty.ListIPSetsResponse
import GuardDuty.ListInvitationsRequest
import GuardDuty.ListInvitationsResponse
import GuardDuty.ListMembersRequest
import GuardDuty.ListMembersResponse
import GuardDuty.ListPublishingDestinationsRequest
import GuardDuty.ListPublishingDestinationsResponse
import GuardDuty.ListTagsForResourceRequest
import GuardDuty.ListTagsForResourceResponse
import GuardDuty.ListThreatIntelSetsRequest
import GuardDuty.ListThreatIntelSetsResponse
import GuardDuty.StartMonitoringMembersRequest
import GuardDuty.StartMonitoringMembersResponse
import GuardDuty.StopMonitoringMembersRequest
import GuardDuty.StopMonitoringMembersResponse
import GuardDuty.TagResourceRequest
import GuardDuty.TagResourceResponse
import GuardDuty.UnarchiveFindingsRequest
import GuardDuty.UnarchiveFindingsResponse
import GuardDuty.UntagResourceRequest
import GuardDuty.UntagResourceResponse
import GuardDuty.UpdateDetectorRequest
import GuardDuty.UpdateDetectorResponse
import GuardDuty.UpdateFilterRequest
import GuardDuty.UpdateFilterResponse
import GuardDuty.UpdateFindingsFeedbackRequest
import GuardDuty.UpdateFindingsFeedbackResponse
import GuardDuty.UpdateIPSetRequest
import GuardDuty.UpdateIPSetResponse
import GuardDuty.UpdatePublishingDestinationRequest
import GuardDuty.UpdatePublishingDestinationResponse
import GuardDuty.UpdateThreatIntelSetRequest
import GuardDuty.UpdateThreatIntelSetResponse
import GuardDuty.AwsApiCallAction
import GuardDuty.DnsRequestAction
import GuardDuty.NetworkConnectionAction
import GuardDuty.PortProbeAction
import GuardDuty.DomainDetails
import GuardDuty.RemoteIpDetails
import GuardDuty.TagMap
import GuardDuty.FindingCriteria
import GuardDuty.DestinationProperties
import GuardDuty.Condition
import GuardDuty.Resource
import GuardDuty.Service
import GuardDuty.Criterion
import GuardDuty.CountBySeverity
import GuardDuty.SortCriteria
import GuardDuty.FindingStatistics
import GuardDuty.Master
import GuardDuty.IamInstanceProfile
import GuardDuty.LocalPortDetails
import GuardDuty.LocalIpDetails
import GuardDuty.RemotePortDetails
import GuardDuty.City
import GuardDuty.Country
import GuardDuty.GeoLocation
import GuardDuty.Organization
import GuardDuty.AccessKeyDetails
import GuardDuty.InstanceDetails
import GuardDuty.Action
import GuardDuty.Evidence
import Service as _Service

typealias AccountDetails = Array<AccountDetail>

typealias AccountId = String

typealias AccountIds = Array<AccountId>

typealias Boolean = Boolean

typealias ClientToken = String

typealias Destinations = Array<Destination>

typealias DetectorId = String

typealias DetectorIds = Array<DetectorId>

typealias Double = Number

typealias Email = String

typealias Eq = Array<String>

typealias Equals = Array<String>

typealias FilterDescription = String

typealias FilterName = String

typealias FilterNames = Array<FilterName>

typealias FilterRank = Number

typealias FindingId = String

typealias FindingIds = Array<FindingId>

typealias FindingStatisticTypes = Array<String /* "COUNT_BY_SEVERITY" | String */>

typealias FindingType = String

typealias FindingTypes = Array<FindingType>

typealias Findings = Array<Finding>

typealias GuardDutyArn = String

typealias Integer = Number

typealias Invitations = Array<Invitation>

typealias IpSetIds = Array<String>

typealias Ipv6Addresses = Array<String>

typealias Location = String

typealias Long = Number

typealias MaxResults = Number

typealias Members = Array<Member>

typealias Name = String

typealias Neq = Array<String>

typealias NetworkInterfaces = Array<NetworkInterface>

typealias NotEquals = Array<String>

typealias PortProbeDetails = Array<PortProbeDetail>

typealias PrivateIpAddresses = Array<PrivateIpAddressDetails>

typealias ProductCodes = Array<ProductCode>

typealias SecurityGroups = Array<SecurityGroup>

typealias String = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias ThreatIntelSetIds = Array<String>

typealias ThreatIntelligenceDetails = Array<ThreatIntelligenceDetail>

typealias ThreatNames = Array<String>

typealias UnprocessedAccounts = Array<UnprocessedAccount>

@JsModule("aws-sdk")
external open class GuardDuty(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : _Service {
    open var config: ConfigBase /* Config & GuardDuty.Types.ClientConfiguration */
    open fun acceptInvitation(params: AcceptInvitationRequest, callback: (err: AWSError, data: AcceptInvitationResponse) -> Unit = definedExternally): Request<AcceptInvitationResponse, AWSError>
    open fun acceptInvitation(callback: (err: AWSError, data: AcceptInvitationResponse) -> Unit = definedExternally): Request<AcceptInvitationResponse, AWSError>
    open fun archiveFindings(params: ArchiveFindingsRequest, callback: (err: AWSError, data: ArchiveFindingsResponse) -> Unit = definedExternally): Request<ArchiveFindingsResponse, AWSError>
    open fun archiveFindings(callback: (err: AWSError, data: ArchiveFindingsResponse) -> Unit = definedExternally): Request<ArchiveFindingsResponse, AWSError>
    open fun createDetector(params: CreateDetectorRequest, callback: (err: AWSError, data: CreateDetectorResponse) -> Unit = definedExternally): Request<CreateDetectorResponse, AWSError>
    open fun createDetector(callback: (err: AWSError, data: CreateDetectorResponse) -> Unit = definedExternally): Request<CreateDetectorResponse, AWSError>
    open fun createFilter(params: CreateFilterRequest, callback: (err: AWSError, data: CreateFilterResponse) -> Unit = definedExternally): Request<CreateFilterResponse, AWSError>
    open fun createFilter(callback: (err: AWSError, data: CreateFilterResponse) -> Unit = definedExternally): Request<CreateFilterResponse, AWSError>
    open fun createIPSet(params: CreateIPSetRequest, callback: (err: AWSError, data: CreateIPSetResponse) -> Unit = definedExternally): Request<CreateIPSetResponse, AWSError>
    open fun createIPSet(callback: (err: AWSError, data: CreateIPSetResponse) -> Unit = definedExternally): Request<CreateIPSetResponse, AWSError>
    open fun createMembers(params: CreateMembersRequest, callback: (err: AWSError, data: CreateMembersResponse) -> Unit = definedExternally): Request<CreateMembersResponse, AWSError>
    open fun createMembers(callback: (err: AWSError, data: CreateMembersResponse) -> Unit = definedExternally): Request<CreateMembersResponse, AWSError>
    open fun createPublishingDestination(params: CreatePublishingDestinationRequest, callback: (err: AWSError, data: CreatePublishingDestinationResponse) -> Unit = definedExternally): Request<CreatePublishingDestinationResponse, AWSError>
    open fun createPublishingDestination(callback: (err: AWSError, data: CreatePublishingDestinationResponse) -> Unit = definedExternally): Request<CreatePublishingDestinationResponse, AWSError>
    open fun createSampleFindings(params: CreateSampleFindingsRequest, callback: (err: AWSError, data: CreateSampleFindingsResponse) -> Unit = definedExternally): Request<CreateSampleFindingsResponse, AWSError>
    open fun createSampleFindings(callback: (err: AWSError, data: CreateSampleFindingsResponse) -> Unit = definedExternally): Request<CreateSampleFindingsResponse, AWSError>
    open fun createThreatIntelSet(params: CreateThreatIntelSetRequest, callback: (err: AWSError, data: CreateThreatIntelSetResponse) -> Unit = definedExternally): Request<CreateThreatIntelSetResponse, AWSError>
    open fun createThreatIntelSet(callback: (err: AWSError, data: CreateThreatIntelSetResponse) -> Unit = definedExternally): Request<CreateThreatIntelSetResponse, AWSError>
    open fun declineInvitations(params: DeclineInvitationsRequest, callback: (err: AWSError, data: DeclineInvitationsResponse) -> Unit = definedExternally): Request<DeclineInvitationsResponse, AWSError>
    open fun declineInvitations(callback: (err: AWSError, data: DeclineInvitationsResponse) -> Unit = definedExternally): Request<DeclineInvitationsResponse, AWSError>
    open fun deleteDetector(params: DeleteDetectorRequest, callback: (err: AWSError, data: DeleteDetectorResponse) -> Unit = definedExternally): Request<DeleteDetectorResponse, AWSError>
    open fun deleteDetector(callback: (err: AWSError, data: DeleteDetectorResponse) -> Unit = definedExternally): Request<DeleteDetectorResponse, AWSError>
    open fun deleteFilter(params: DeleteFilterRequest, callback: (err: AWSError, data: DeleteFilterResponse) -> Unit = definedExternally): Request<DeleteFilterResponse, AWSError>
    open fun deleteFilter(callback: (err: AWSError, data: DeleteFilterResponse) -> Unit = definedExternally): Request<DeleteFilterResponse, AWSError>
    open fun deleteIPSet(params: DeleteIPSetRequest, callback: (err: AWSError, data: DeleteIPSetResponse) -> Unit = definedExternally): Request<DeleteIPSetResponse, AWSError>
    open fun deleteIPSet(callback: (err: AWSError, data: DeleteIPSetResponse) -> Unit = definedExternally): Request<DeleteIPSetResponse, AWSError>
    open fun deleteInvitations(params: DeleteInvitationsRequest, callback: (err: AWSError, data: DeleteInvitationsResponse) -> Unit = definedExternally): Request<DeleteInvitationsResponse, AWSError>
    open fun deleteInvitations(callback: (err: AWSError, data: DeleteInvitationsResponse) -> Unit = definedExternally): Request<DeleteInvitationsResponse, AWSError>
    open fun deleteMembers(params: DeleteMembersRequest, callback: (err: AWSError, data: DeleteMembersResponse) -> Unit = definedExternally): Request<DeleteMembersResponse, AWSError>
    open fun deleteMembers(callback: (err: AWSError, data: DeleteMembersResponse) -> Unit = definedExternally): Request<DeleteMembersResponse, AWSError>
    open fun deletePublishingDestination(params: DeletePublishingDestinationRequest, callback: (err: AWSError, data: DeletePublishingDestinationResponse) -> Unit = definedExternally): Request<DeletePublishingDestinationResponse, AWSError>
    open fun deletePublishingDestination(callback: (err: AWSError, data: DeletePublishingDestinationResponse) -> Unit = definedExternally): Request<DeletePublishingDestinationResponse, AWSError>
    open fun deleteThreatIntelSet(params: DeleteThreatIntelSetRequest, callback: (err: AWSError, data: DeleteThreatIntelSetResponse) -> Unit = definedExternally): Request<DeleteThreatIntelSetResponse, AWSError>
    open fun deleteThreatIntelSet(callback: (err: AWSError, data: DeleteThreatIntelSetResponse) -> Unit = definedExternally): Request<DeleteThreatIntelSetResponse, AWSError>
    open fun describePublishingDestination(params: DescribePublishingDestinationRequest, callback: (err: AWSError, data: DescribePublishingDestinationResponse) -> Unit = definedExternally): Request<DescribePublishingDestinationResponse, AWSError>
    open fun describePublishingDestination(callback: (err: AWSError, data: DescribePublishingDestinationResponse) -> Unit = definedExternally): Request<DescribePublishingDestinationResponse, AWSError>
    open fun disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest, callback: (err: AWSError, data: DisassociateFromMasterAccountResponse) -> Unit = definedExternally): Request<DisassociateFromMasterAccountResponse, AWSError>
    open fun disassociateFromMasterAccount(callback: (err: AWSError, data: DisassociateFromMasterAccountResponse) -> Unit = definedExternally): Request<DisassociateFromMasterAccountResponse, AWSError>
    open fun disassociateMembers(params: DisassociateMembersRequest, callback: (err: AWSError, data: DisassociateMembersResponse) -> Unit = definedExternally): Request<DisassociateMembersResponse, AWSError>
    open fun disassociateMembers(callback: (err: AWSError, data: DisassociateMembersResponse) -> Unit = definedExternally): Request<DisassociateMembersResponse, AWSError>
    open fun getDetector(params: GetDetectorRequest, callback: (err: AWSError, data: GetDetectorResponse) -> Unit = definedExternally): Request<GetDetectorResponse, AWSError>
    open fun getDetector(callback: (err: AWSError, data: GetDetectorResponse) -> Unit = definedExternally): Request<GetDetectorResponse, AWSError>
    open fun getFilter(params: GetFilterRequest, callback: (err: AWSError, data: GetFilterResponse) -> Unit = definedExternally): Request<GetFilterResponse, AWSError>
    open fun getFilter(callback: (err: AWSError, data: GetFilterResponse) -> Unit = definedExternally): Request<GetFilterResponse, AWSError>
    open fun getFindings(params: GetFindingsRequest, callback: (err: AWSError, data: GetFindingsResponse) -> Unit = definedExternally): Request<GetFindingsResponse, AWSError>
    open fun getFindings(callback: (err: AWSError, data: GetFindingsResponse) -> Unit = definedExternally): Request<GetFindingsResponse, AWSError>
    open fun getFindingsStatistics(params: GetFindingsStatisticsRequest, callback: (err: AWSError, data: GetFindingsStatisticsResponse) -> Unit = definedExternally): Request<GetFindingsStatisticsResponse, AWSError>
    open fun getFindingsStatistics(callback: (err: AWSError, data: GetFindingsStatisticsResponse) -> Unit = definedExternally): Request<GetFindingsStatisticsResponse, AWSError>
    open fun getIPSet(params: GetIPSetRequest, callback: (err: AWSError, data: GetIPSetResponse) -> Unit = definedExternally): Request<GetIPSetResponse, AWSError>
    open fun getIPSet(callback: (err: AWSError, data: GetIPSetResponse) -> Unit = definedExternally): Request<GetIPSetResponse, AWSError>
    open fun getInvitationsCount(params: GetInvitationsCountRequest, callback: (err: AWSError, data: GetInvitationsCountResponse) -> Unit = definedExternally): Request<GetInvitationsCountResponse, AWSError>
    open fun getInvitationsCount(callback: (err: AWSError, data: GetInvitationsCountResponse) -> Unit = definedExternally): Request<GetInvitationsCountResponse, AWSError>
    open fun getMasterAccount(params: GetMasterAccountRequest, callback: (err: AWSError, data: GetMasterAccountResponse) -> Unit = definedExternally): Request<GetMasterAccountResponse, AWSError>
    open fun getMasterAccount(callback: (err: AWSError, data: GetMasterAccountResponse) -> Unit = definedExternally): Request<GetMasterAccountResponse, AWSError>
    open fun getMembers(params: GetMembersRequest, callback: (err: AWSError, data: GetMembersResponse) -> Unit = definedExternally): Request<GetMembersResponse, AWSError>
    open fun getMembers(callback: (err: AWSError, data: GetMembersResponse) -> Unit = definedExternally): Request<GetMembersResponse, AWSError>
    open fun getThreatIntelSet(params: GetThreatIntelSetRequest, callback: (err: AWSError, data: GetThreatIntelSetResponse) -> Unit = definedExternally): Request<GetThreatIntelSetResponse, AWSError>
    open fun getThreatIntelSet(callback: (err: AWSError, data: GetThreatIntelSetResponse) -> Unit = definedExternally): Request<GetThreatIntelSetResponse, AWSError>
    open fun inviteMembers(params: InviteMembersRequest, callback: (err: AWSError, data: InviteMembersResponse) -> Unit = definedExternally): Request<InviteMembersResponse, AWSError>
    open fun inviteMembers(callback: (err: AWSError, data: InviteMembersResponse) -> Unit = definedExternally): Request<InviteMembersResponse, AWSError>
    open fun listDetectors(params: ListDetectorsRequest, callback: (err: AWSError, data: ListDetectorsResponse) -> Unit = definedExternally): Request<ListDetectorsResponse, AWSError>
    open fun listDetectors(callback: (err: AWSError, data: ListDetectorsResponse) -> Unit = definedExternally): Request<ListDetectorsResponse, AWSError>
    open fun listFilters(params: ListFiltersRequest, callback: (err: AWSError, data: ListFiltersResponse) -> Unit = definedExternally): Request<ListFiltersResponse, AWSError>
    open fun listFilters(callback: (err: AWSError, data: ListFiltersResponse) -> Unit = definedExternally): Request<ListFiltersResponse, AWSError>
    open fun listFindings(params: ListFindingsRequest, callback: (err: AWSError, data: ListFindingsResponse) -> Unit = definedExternally): Request<ListFindingsResponse, AWSError>
    open fun listFindings(callback: (err: AWSError, data: ListFindingsResponse) -> Unit = definedExternally): Request<ListFindingsResponse, AWSError>
    open fun listIPSets(params: ListIPSetsRequest, callback: (err: AWSError, data: ListIPSetsResponse) -> Unit = definedExternally): Request<ListIPSetsResponse, AWSError>
    open fun listIPSets(callback: (err: AWSError, data: ListIPSetsResponse) -> Unit = definedExternally): Request<ListIPSetsResponse, AWSError>
    open fun listInvitations(params: ListInvitationsRequest, callback: (err: AWSError, data: ListInvitationsResponse) -> Unit = definedExternally): Request<ListInvitationsResponse, AWSError>
    open fun listInvitations(callback: (err: AWSError, data: ListInvitationsResponse) -> Unit = definedExternally): Request<ListInvitationsResponse, AWSError>
    open fun listMembers(params: ListMembersRequest, callback: (err: AWSError, data: ListMembersResponse) -> Unit = definedExternally): Request<ListMembersResponse, AWSError>
    open fun listMembers(callback: (err: AWSError, data: ListMembersResponse) -> Unit = definedExternally): Request<ListMembersResponse, AWSError>
    open fun listPublishingDestinations(params: ListPublishingDestinationsRequest, callback: (err: AWSError, data: ListPublishingDestinationsResponse) -> Unit = definedExternally): Request<ListPublishingDestinationsResponse, AWSError>
    open fun listPublishingDestinations(callback: (err: AWSError, data: ListPublishingDestinationsResponse) -> Unit = definedExternally): Request<ListPublishingDestinationsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listThreatIntelSets(params: ListThreatIntelSetsRequest, callback: (err: AWSError, data: ListThreatIntelSetsResponse) -> Unit = definedExternally): Request<ListThreatIntelSetsResponse, AWSError>
    open fun listThreatIntelSets(callback: (err: AWSError, data: ListThreatIntelSetsResponse) -> Unit = definedExternally): Request<ListThreatIntelSetsResponse, AWSError>
    open fun startMonitoringMembers(params: StartMonitoringMembersRequest, callback: (err: AWSError, data: StartMonitoringMembersResponse) -> Unit = definedExternally): Request<StartMonitoringMembersResponse, AWSError>
    open fun startMonitoringMembers(callback: (err: AWSError, data: StartMonitoringMembersResponse) -> Unit = definedExternally): Request<StartMonitoringMembersResponse, AWSError>
    open fun stopMonitoringMembers(params: StopMonitoringMembersRequest, callback: (err: AWSError, data: StopMonitoringMembersResponse) -> Unit = definedExternally): Request<StopMonitoringMembersResponse, AWSError>
    open fun stopMonitoringMembers(callback: (err: AWSError, data: StopMonitoringMembersResponse) -> Unit = definedExternally): Request<StopMonitoringMembersResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun unarchiveFindings(params: UnarchiveFindingsRequest, callback: (err: AWSError, data: UnarchiveFindingsResponse) -> Unit = definedExternally): Request<UnarchiveFindingsResponse, AWSError>
    open fun unarchiveFindings(callback: (err: AWSError, data: UnarchiveFindingsResponse) -> Unit = definedExternally): Request<UnarchiveFindingsResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateDetector(params: UpdateDetectorRequest, callback: (err: AWSError, data: UpdateDetectorResponse) -> Unit = definedExternally): Request<UpdateDetectorResponse, AWSError>
    open fun updateDetector(callback: (err: AWSError, data: UpdateDetectorResponse) -> Unit = definedExternally): Request<UpdateDetectorResponse, AWSError>
    open fun updateFilter(params: UpdateFilterRequest, callback: (err: AWSError, data: UpdateFilterResponse) -> Unit = definedExternally): Request<UpdateFilterResponse, AWSError>
    open fun updateFilter(callback: (err: AWSError, data: UpdateFilterResponse) -> Unit = definedExternally): Request<UpdateFilterResponse, AWSError>
    open fun updateFindingsFeedback(params: UpdateFindingsFeedbackRequest, callback: (err: AWSError, data: UpdateFindingsFeedbackResponse) -> Unit = definedExternally): Request<UpdateFindingsFeedbackResponse, AWSError>
    open fun updateFindingsFeedback(callback: (err: AWSError, data: UpdateFindingsFeedbackResponse) -> Unit = definedExternally): Request<UpdateFindingsFeedbackResponse, AWSError>
    open fun updateIPSet(params: UpdateIPSetRequest, callback: (err: AWSError, data: UpdateIPSetResponse) -> Unit = definedExternally): Request<UpdateIPSetResponse, AWSError>
    open fun updateIPSet(callback: (err: AWSError, data: UpdateIPSetResponse) -> Unit = definedExternally): Request<UpdateIPSetResponse, AWSError>
    open fun updatePublishingDestination(params: UpdatePublishingDestinationRequest, callback: (err: AWSError, data: UpdatePublishingDestinationResponse) -> Unit = definedExternally): Request<UpdatePublishingDestinationResponse, AWSError>
    open fun updatePublishingDestination(callback: (err: AWSError, data: UpdatePublishingDestinationResponse) -> Unit = definedExternally): Request<UpdatePublishingDestinationResponse, AWSError>
    open fun updateThreatIntelSet(params: UpdateThreatIntelSetRequest, callback: (err: AWSError, data: UpdateThreatIntelSetResponse) -> Unit = definedExternally): Request<UpdateThreatIntelSetResponse, AWSError>
    open fun updateThreatIntelSet(callback: (err: AWSError, data: UpdateThreatIntelSetResponse) -> Unit = definedExternally): Request<UpdateThreatIntelSetResponse, AWSError>
    interface AcceptInvitationRequest {
        var DetectorId: DetectorId
        var MasterId: String
        var InvitationId: String
    }
    interface AcceptInvitationResponse
    interface AccessKeyDetails {
        var AccessKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrincipalId: String?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: String?
            get() = definedExternally
            set(value) = definedExternally
        var UserType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccountDetail {
        var AccountId: AccountId
        var Email: Email
    }
    interface Action {
        var ActionType: String?
            get() = definedExternally
            set(value) = definedExternally
        var AwsApiCallAction: AwsApiCallAction?
            get() = definedExternally
            set(value) = definedExternally
        var DnsRequestAction: DnsRequestAction?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkConnectionAction: NetworkConnectionAction?
            get() = definedExternally
            set(value) = definedExternally
        var PortProbeAction: PortProbeAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ArchiveFindingsRequest {
        var DetectorId: DetectorId
        var FindingIds: FindingIds
    }
    interface ArchiveFindingsResponse
    interface AwsApiCallAction {
        var Api: String?
            get() = definedExternally
            set(value) = definedExternally
        var CallerType: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainDetails: DomainDetails?
            get() = definedExternally
            set(value) = definedExternally
        var RemoteIpDetails: RemoteIpDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface City {
        var CityName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Condition {
        var Eq: Eq?
            get() = definedExternally
            set(value) = definedExternally
        var Neq: Neq?
            get() = definedExternally
            set(value) = definedExternally
        var Gt: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Gte: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Lt: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Lte: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Equals: Equals?
            get() = definedExternally
            set(value) = definedExternally
        var NotEquals: NotEquals?
            get() = definedExternally
            set(value) = definedExternally
        var GreaterThan: Long?
            get() = definedExternally
            set(value) = definedExternally
        var GreaterThanOrEqual: Long?
            get() = definedExternally
            set(value) = definedExternally
        var LessThan: Long?
            get() = definedExternally
            set(value) = definedExternally
        var LessThanOrEqual: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CountBySeverity {
        @nativeGetter
        operator fun get(key: String): Integer?
        @nativeSetter
        operator fun set(key: String, value: Integer)
    }
    interface Country {
        var CountryCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var CountryName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDetectorRequest {
        var Enable: Boolean
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var FindingPublishingFrequency: String /* "FIFTEEN_MINUTES" | "ONE_HOUR" | "SIX_HOURS" | String */
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDetectorResponse {
        var DetectorId: DetectorId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFilterRequest {
        var DetectorId: DetectorId
        var Name: FilterName
        var Description: FilterDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Action: String /* "NOOP" | "ARCHIVE" | String */
        var Rank: FilterRank?
            get() = definedExternally
            set(value) = definedExternally
        var FindingCriteria: FindingCriteria
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFilterResponse {
        var Name: FilterName
    }
    interface CreateIPSetRequest {
        var DetectorId: DetectorId
        var Name: Name
        var Format: String /* "TXT" | "STIX" | "OTX_CSV" | "ALIEN_VAULT" | "PROOF_POINT" | "FIRE_EYE" | String */
        var Location: Location
        var Activate: Boolean
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIPSetResponse {
        var IpSetId: String
    }
    interface CreateMembersRequest {
        var DetectorId: DetectorId
        var AccountDetails: AccountDetails
    }
    interface CreateMembersResponse {
        var UnprocessedAccounts: UnprocessedAccounts
    }
    interface CreatePublishingDestinationRequest {
        var DetectorId: DetectorId
        var DestinationType: String /* "S3" | String */
        var DestinationProperties: DestinationProperties
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePublishingDestinationResponse {
        var DestinationId: String
    }
    interface CreateSampleFindingsRequest {
        var DetectorId: DetectorId
        var FindingTypes: FindingTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSampleFindingsResponse
    interface CreateThreatIntelSetRequest {
        var DetectorId: DetectorId
        var Name: Name
        var Format: String /* "TXT" | "STIX" | "OTX_CSV" | "ALIEN_VAULT" | "PROOF_POINT" | "FIRE_EYE" | String */
        var Location: Location
        var Activate: Boolean
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateThreatIntelSetResponse {
        var ThreatIntelSetId: String
    }
    interface Criterion {
        @nativeGetter
        operator fun get(key: String): Condition?
        @nativeSetter
        operator fun set(key: String, value: Condition)
    }
    interface DeclineInvitationsRequest {
        var AccountIds: AccountIds
    }
    interface DeclineInvitationsResponse {
        var UnprocessedAccounts: UnprocessedAccounts
    }
    interface DeleteDetectorRequest {
        var DetectorId: DetectorId
    }
    interface DeleteDetectorResponse
    interface DeleteFilterRequest {
        var DetectorId: DetectorId
        var FilterName: String
    }
    interface DeleteFilterResponse
    interface DeleteIPSetRequest {
        var DetectorId: DetectorId
        var IpSetId: String
    }
    interface DeleteIPSetResponse
    interface DeleteInvitationsRequest {
        var AccountIds: AccountIds
    }
    interface DeleteInvitationsResponse {
        var UnprocessedAccounts: UnprocessedAccounts
    }
    interface DeleteMembersRequest {
        var DetectorId: DetectorId
        var AccountIds: AccountIds
    }
    interface DeleteMembersResponse {
        var UnprocessedAccounts: UnprocessedAccounts
    }
    interface DeletePublishingDestinationRequest {
        var DetectorId: DetectorId
        var DestinationId: String
    }
    interface DeletePublishingDestinationResponse
    interface DeleteThreatIntelSetRequest {
        var DetectorId: DetectorId
        var ThreatIntelSetId: String
    }
    interface DeleteThreatIntelSetResponse
    interface DescribePublishingDestinationRequest {
        var DetectorId: DetectorId
        var DestinationId: String
    }
    interface DescribePublishingDestinationResponse {
        var DestinationId: String
        var DestinationType: String /* "S3" | String */
        var Status: String /* "PENDING_VERIFICATION" | "PUBLISHING" | "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY" | "STOPPED" | String */
        var PublishingFailureStartTimestamp: Long
        var DestinationProperties: DestinationProperties
    }
    interface Destination {
        var DestinationId: String
        var DestinationType: String /* "S3" | String */
        var Status: String /* "PENDING_VERIFICATION" | "PUBLISHING" | "UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY" | "STOPPED" | String */
    }
    interface DestinationProperties {
        var DestinationArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateFromMasterAccountRequest {
        var DetectorId: DetectorId
    }
    interface DisassociateFromMasterAccountResponse
    interface DisassociateMembersRequest {
        var DetectorId: DetectorId
        var AccountIds: AccountIds
    }
    interface DisassociateMembersResponse {
        var UnprocessedAccounts: UnprocessedAccounts
    }
    interface DnsRequestAction {
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainDetails {
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Evidence {
        var ThreatIntelligenceDetails: ThreatIntelligenceDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Finding {
        var AccountId: String
        var Arn: String
        var Confidence: Double?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: String
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Id: String
        var Partition: String?
            get() = definedExternally
            set(value) = definedExternally
        var Region: String
        var Resource: Resource
        var SchemaVersion: String
        var Service: Service?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: Double
        var Title: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: FindingType
        var UpdatedAt: String
    }
    interface FindingCriteria {
        var Criterion: Criterion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FindingStatistics {
        var CountBySeverity: CountBySeverity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GeoLocation {
        var Lat: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Lon: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDetectorRequest {
        var DetectorId: DetectorId
    }
    interface GetDetectorResponse {
        var CreatedAt: String?
            get() = definedExternally
            set(value) = definedExternally
        var FindingPublishingFrequency: String /* "FIFTEEN_MINUTES" | "ONE_HOUR" | "SIX_HOURS" | String */
        var ServiceRole: String
        var Status: String /* "ENABLED" | "DISABLED" | String */
        var UpdatedAt: String?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFilterRequest {
        var DetectorId: DetectorId
        var FilterName: String
    }
    interface GetFilterResponse {
        var Name: FilterName
        var Description: FilterDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Action: String /* "NOOP" | "ARCHIVE" | String */
        var Rank: FilterRank?
            get() = definedExternally
            set(value) = definedExternally
        var FindingCriteria: FindingCriteria
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFindingsRequest {
        var DetectorId: DetectorId
        var FindingIds: FindingIds
        var SortCriteria: SortCriteria?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFindingsResponse {
        var Findings: Findings
    }
    interface GetFindingsStatisticsRequest {
        var DetectorId: DetectorId
        var FindingStatisticTypes: FindingStatisticTypes
        var FindingCriteria: FindingCriteria?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFindingsStatisticsResponse {
        var FindingStatistics: FindingStatistics
    }
    interface GetIPSetRequest {
        var DetectorId: DetectorId
        var IpSetId: String
    }
    interface GetIPSetResponse {
        var Name: Name
        var Format: String /* "TXT" | "STIX" | "OTX_CSV" | "ALIEN_VAULT" | "PROOF_POINT" | "FIRE_EYE" | String */
        var Location: Location
        var Status: String /* "INACTIVE" | "ACTIVATING" | "ACTIVE" | "DEACTIVATING" | "ERROR" | "DELETE_PENDING" | "DELETED" | String */
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInvitationsCountRequest
    interface GetInvitationsCountResponse {
        var InvitationsCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMasterAccountRequest {
        var DetectorId: DetectorId
    }
    interface GetMasterAccountResponse {
        var Master: Master
    }
    interface GetMembersRequest {
        var DetectorId: DetectorId
        var AccountIds: AccountIds
    }
    interface GetMembersResponse {
        var Members: Members
        var UnprocessedAccounts: UnprocessedAccounts
    }
    interface GetThreatIntelSetRequest {
        var DetectorId: DetectorId
        var ThreatIntelSetId: String
    }
    interface GetThreatIntelSetResponse {
        var Name: Name
        var Format: String /* "TXT" | "STIX" | "OTX_CSV" | "ALIEN_VAULT" | "PROOF_POINT" | "FIRE_EYE" | String */
        var Location: Location
        var Status: String /* "INACTIVE" | "ACTIVATING" | "ACTIVE" | "DEACTIVATING" | "ERROR" | "DELETE_PENDING" | "DELETED" | String */
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IamInstanceProfile {
        var Arn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Id: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceDetails {
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var IamInstanceProfile: IamInstanceProfile?
            get() = definedExternally
            set(value) = definedExternally
        var ImageDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var ImageId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceState: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var OutpostArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchTime: String?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfaces: NetworkInterfaces?
            get() = definedExternally
            set(value) = definedExternally
        var Platform: String?
            get() = definedExternally
            set(value) = definedExternally
        var ProductCodes: ProductCodes?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Invitation {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var InvitationId: String?
            get() = definedExternally
            set(value) = definedExternally
        var RelationshipStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var InvitedAt: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InviteMembersRequest {
        var DetectorId: DetectorId
        var AccountIds: AccountIds
        var DisableEmailNotification: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InviteMembersResponse {
        var UnprocessedAccounts: UnprocessedAccounts
    }
    interface ListDetectorsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDetectorsResponse {
        var DetectorIds: DetectorIds
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFiltersRequest {
        var DetectorId: DetectorId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFiltersResponse {
        var FilterNames: FilterNames
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFindingsRequest {
        var DetectorId: DetectorId
        var FindingCriteria: FindingCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFindingsResponse {
        var FindingIds: FindingIds
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIPSetsRequest {
        var DetectorId: DetectorId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIPSetsResponse {
        var IpSetIds: IpSetIds
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInvitationsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInvitationsResponse {
        var Invitations: Invitations?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMembersRequest {
        var DetectorId: DetectorId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var OnlyAssociated: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMembersResponse {
        var Members: Members?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPublishingDestinationsRequest {
        var DetectorId: DetectorId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPublishingDestinationsResponse {
        var Destinations: Destinations
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: GuardDutyArn
    }
    interface ListTagsForResourceResponse {
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThreatIntelSetsRequest {
        var DetectorId: DetectorId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThreatIntelSetsResponse {
        var ThreatIntelSetIds: ThreatIntelSetIds
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LocalIpDetails {
        var IpAddressV4: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LocalPortDetails {
        var Port: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var PortName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Master {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var InvitationId: String?
            get() = definedExternally
            set(value) = definedExternally
        var RelationshipStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var InvitedAt: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Member {
        var AccountId: AccountId
        var DetectorId: DetectorId?
            get() = definedExternally
            set(value) = definedExternally
        var MasterId: String
        var Email: Email
        var RelationshipStatus: String
        var InvitedAt: String?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: String
    }
    interface NetworkConnectionAction {
        var Blocked: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionDirection: String?
            get() = definedExternally
            set(value) = definedExternally
        var LocalPortDetails: LocalPortDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String?
            get() = definedExternally
            set(value) = definedExternally
        var LocalIpDetails: LocalIpDetails?
            get() = definedExternally
            set(value) = definedExternally
        var RemoteIpDetails: RemoteIpDetails?
            get() = definedExternally
            set(value) = definedExternally
        var RemotePortDetails: RemotePortDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkInterface {
        var Ipv6Addresses: Ipv6Addresses?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfaceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateDnsName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateIpAddress: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateIpAddresses: PrivateIpAddresses?
            get() = definedExternally
            set(value) = definedExternally
        var PublicDnsName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PublicIp: String?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: String?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Organization {
        var Asn: String?
            get() = definedExternally
            set(value) = definedExternally
        var AsnOrg: String?
            get() = definedExternally
            set(value) = definedExternally
        var Isp: String?
            get() = definedExternally
            set(value) = definedExternally
        var Org: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PortProbeAction {
        var Blocked: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PortProbeDetails: PortProbeDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PortProbeDetail {
        var LocalPortDetails: LocalPortDetails?
            get() = definedExternally
            set(value) = definedExternally
        var LocalIpDetails: LocalIpDetails?
            get() = definedExternally
            set(value) = definedExternally
        var RemoteIpDetails: RemoteIpDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PrivateIpAddressDetails {
        var PrivateDnsName: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateIpAddress: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProductCode {
        var Code: String?
            get() = definedExternally
            set(value) = definedExternally
        var ProductType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoteIpDetails {
        var City: City?
            get() = definedExternally
            set(value) = definedExternally
        var Country: Country?
            get() = definedExternally
            set(value) = definedExternally
        var GeoLocation: GeoLocation?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddressV4: String?
            get() = definedExternally
            set(value) = definedExternally
        var Organization: Organization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemotePortDetails {
        var Port: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var PortName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Resource {
        var AccessKeyDetails: AccessKeyDetails?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceDetails: InstanceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecurityGroup {
        var GroupId: String?
            get() = definedExternally
            set(value) = definedExternally
        var GroupName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Service {
        var Action: Action?
            get() = definedExternally
            set(value) = definedExternally
        var Evidence: Evidence?
            get() = definedExternally
            set(value) = definedExternally
        var Archived: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Count: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DetectorId: DetectorId?
            get() = definedExternally
            set(value) = definedExternally
        var EventFirstSeen: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventLastSeen: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceRole: String?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: String?
            get() = definedExternally
            set(value) = definedExternally
        var UserFeedback: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SortCriteria {
        var AttributeName: String?
            get() = definedExternally
            set(value) = definedExternally
        var OrderBy: String /* "ASC" | "DESC" | String */
    }
    interface StartMonitoringMembersRequest {
        var DetectorId: DetectorId
        var AccountIds: AccountIds
    }
    interface StartMonitoringMembersResponse {
        var UnprocessedAccounts: UnprocessedAccounts
    }
    interface StopMonitoringMembersRequest {
        var DetectorId: DetectorId
        var AccountIds: AccountIds
    }
    interface StopMonitoringMembersResponse {
        var UnprocessedAccounts: UnprocessedAccounts
    }
    interface Tag {
        var Key: String?
            get() = definedExternally
            set(value) = definedExternally
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var ResourceArn: GuardDutyArn
        var Tags: TagMap
    }
    interface TagResourceResponse
    interface ThreatIntelligenceDetail {
        var ThreatListName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ThreatNames: ThreatNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnarchiveFindingsRequest {
        var DetectorId: DetectorId
        var FindingIds: FindingIds
    }
    interface UnarchiveFindingsResponse
    interface UnprocessedAccount {
        var AccountId: AccountId
        var Result: String
    }
    interface UntagResourceRequest {
        var ResourceArn: GuardDutyArn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateDetectorRequest {
        var DetectorId: DetectorId
        var Enable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var FindingPublishingFrequency: String /* "FIFTEEN_MINUTES" | "ONE_HOUR" | "SIX_HOURS" | String */
    }
    interface UpdateDetectorResponse
    interface UpdateFilterRequest {
        var DetectorId: DetectorId
        var FilterName: String
        var Description: FilterDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Action: String /* "NOOP" | "ARCHIVE" | String */
        var Rank: FilterRank?
            get() = definedExternally
            set(value) = definedExternally
        var FindingCriteria: FindingCriteria?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFilterResponse {
        var Name: FilterName
    }
    interface UpdateFindingsFeedbackRequest {
        var DetectorId: DetectorId
        var FindingIds: FindingIds
        var Feedback: String /* "USEFUL" | "NOT_USEFUL" | String */
        var Comments: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFindingsFeedbackResponse
    interface UpdateIPSetRequest {
        var DetectorId: DetectorId
        var IpSetId: String
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var Activate: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIPSetResponse
    interface UpdatePublishingDestinationRequest {
        var DetectorId: DetectorId
        var DestinationId: String
        var DestinationProperties: DestinationProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePublishingDestinationResponse
    interface UpdateThreatIntelSetRequest {
        var DetectorId: DetectorId
        var ThreatIntelSetId: String
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var Activate: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateThreatIntelSetResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2017-11-28" | "latest" | String */
    }
}