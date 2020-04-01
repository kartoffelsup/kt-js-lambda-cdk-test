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
import SecurityHub.AccountDetails
import SecurityHub.ActionTarget
import SecurityHub.AvailabilityZone
import SecurityHub.AwsCloudFrontDistributionOriginItem
import SecurityHub.AwsEc2NetworkInterfaceSecurityGroup
import SecurityHub.AwsEc2SecurityGroupIpPermission
import SecurityHub.AwsEc2SecurityGroupIpRange
import SecurityHub.AwsEc2SecurityGroupIpv6Range
import SecurityHub.AwsEc2SecurityGroupPrefixListId
import SecurityHub.AwsEc2SecurityGroupUserIdGroupPair
import SecurityHub.AwsLambdaFunctionLayer
import SecurityHub.AwsRdsDbInstanceAssociatedRole
import SecurityHub.AwsRdsDbInstanceVpcSecurityGroup
import SecurityHub.AwsS3BucketServerSideEncryptionRule
import SecurityHub.AwsSecurityFinding
import SecurityHub.AwsSnsTopicSubscription
import SecurityHub.AwsWafWebAclRule
import SecurityHub.DateFilter
import SecurityHub.ImportFindingsError
import SecurityHub.Insight
import SecurityHub.InsightResultValue
import SecurityHub.Invitation
import SecurityHub.IpFilter
import SecurityHub.KeywordFilter
import SecurityHub.Malware
import SecurityHub.MapFilter
import SecurityHub.Member
import SecurityHub.NumberFilter
import SecurityHub.Product
import SecurityHub.RelatedFinding
import SecurityHub.Resource
import SecurityHub.Result
import SecurityHub.SortCriterion
import SecurityHub.Standard
import SecurityHub.StandardsControl
import SecurityHub.StandardsSubscriptionRequest
import SecurityHub.StandardsSubscription
import SecurityHub.StringFilter
import SecurityHub.ThreatIntelIndicator
import SecurityHub.WafExcludedRule
import SecurityHub.AcceptInvitationRequest
import SecurityHub.AcceptInvitationResponse
import SecurityHub.BatchDisableStandardsRequest
import SecurityHub.BatchDisableStandardsResponse
import SecurityHub.BatchEnableStandardsRequest
import SecurityHub.BatchEnableStandardsResponse
import SecurityHub.BatchImportFindingsRequest
import SecurityHub.BatchImportFindingsResponse
import SecurityHub.CreateActionTargetRequest
import SecurityHub.CreateActionTargetResponse
import SecurityHub.CreateInsightRequest
import SecurityHub.CreateInsightResponse
import SecurityHub.CreateMembersRequest
import SecurityHub.CreateMembersResponse
import SecurityHub.DeclineInvitationsRequest
import SecurityHub.DeclineInvitationsResponse
import SecurityHub.DeleteActionTargetRequest
import SecurityHub.DeleteActionTargetResponse
import SecurityHub.DeleteInsightRequest
import SecurityHub.DeleteInsightResponse
import SecurityHub.DeleteInvitationsRequest
import SecurityHub.DeleteInvitationsResponse
import SecurityHub.DeleteMembersRequest
import SecurityHub.DeleteMembersResponse
import SecurityHub.DescribeActionTargetsRequest
import SecurityHub.DescribeActionTargetsResponse
import SecurityHub.DescribeHubRequest
import SecurityHub.DescribeHubResponse
import SecurityHub.DescribeProductsRequest
import SecurityHub.DescribeProductsResponse
import SecurityHub.DescribeStandardsRequest
import SecurityHub.DescribeStandardsResponse
import SecurityHub.DescribeStandardsControlsRequest
import SecurityHub.DescribeStandardsControlsResponse
import SecurityHub.DisableImportFindingsForProductRequest
import SecurityHub.DisableImportFindingsForProductResponse
import SecurityHub.DisableSecurityHubRequest
import SecurityHub.DisableSecurityHubResponse
import SecurityHub.DisassociateFromMasterAccountRequest
import SecurityHub.DisassociateFromMasterAccountResponse
import SecurityHub.DisassociateMembersRequest
import SecurityHub.DisassociateMembersResponse
import SecurityHub.EnableImportFindingsForProductRequest
import SecurityHub.EnableImportFindingsForProductResponse
import SecurityHub.EnableSecurityHubRequest
import SecurityHub.EnableSecurityHubResponse
import SecurityHub.GetEnabledStandardsRequest
import SecurityHub.GetEnabledStandardsResponse
import SecurityHub.GetFindingsRequest
import SecurityHub.GetFindingsResponse
import SecurityHub.GetInsightResultsRequest
import SecurityHub.GetInsightResultsResponse
import SecurityHub.GetInsightsRequest
import SecurityHub.GetInsightsResponse
import SecurityHub.GetInvitationsCountRequest
import SecurityHub.GetInvitationsCountResponse
import SecurityHub.GetMasterAccountRequest
import SecurityHub.GetMasterAccountResponse
import SecurityHub.GetMembersRequest
import SecurityHub.GetMembersResponse
import SecurityHub.InviteMembersRequest
import SecurityHub.InviteMembersResponse
import SecurityHub.ListEnabledProductsForImportRequest
import SecurityHub.ListEnabledProductsForImportResponse
import SecurityHub.ListInvitationsRequest
import SecurityHub.ListInvitationsResponse
import SecurityHub.ListMembersRequest
import SecurityHub.ListMembersResponse
import SecurityHub.ListTagsForResourceRequest
import SecurityHub.ListTagsForResourceResponse
import SecurityHub.TagResourceRequest
import SecurityHub.TagResourceResponse
import SecurityHub.UntagResourceRequest
import SecurityHub.UntagResourceResponse
import SecurityHub.UpdateActionTargetRequest
import SecurityHub.UpdateActionTargetResponse
import SecurityHub.UpdateFindingsRequest
import SecurityHub.UpdateFindingsResponse
import SecurityHub.UpdateInsightRequest
import SecurityHub.UpdateInsightResponse
import SecurityHub.UpdateStandardsControlRequest
import SecurityHub.UpdateStandardsControlResponse
import SecurityHub.AwsCloudFrontDistributionLogging
import SecurityHub.AwsCloudFrontDistributionOrigins
import SecurityHub.AwsCodeBuildProjectEnvironment
import SecurityHub.AwsCodeBuildProjectSource
import SecurityHub.AwsCodeBuildProjectVpcConfig
import SecurityHub.AwsCodeBuildProjectEnvironmentRegistryCredential
import SecurityHub.AwsEc2NetworkInterfaceAttachment
import SecurityHub.AwsElasticsearchDomainDomainEndpointOptions
import SecurityHub.FieldMap
import SecurityHub.AwsElasticsearchDomainEncryptionAtRestOptions
import SecurityHub.AwsElasticsearchDomainNodeToNodeEncryptionOptions
import SecurityHub.AwsElasticsearchDomainVPCOptions
import SecurityHub.LoadBalancerState
import SecurityHub.AwsLambdaFunctionCode
import SecurityHub.AwsLambdaFunctionDeadLetterConfig
import SecurityHub.AwsLambdaFunctionEnvironment
import SecurityHub.AwsLambdaFunctionTracingConfig
import SecurityHub.AwsLambdaFunctionVpcConfig
import SecurityHub.AwsLambdaFunctionEnvironmentError
import SecurityHub.AwsRdsDbInstanceEndpoint
import SecurityHub.AwsS3BucketServerSideEncryptionConfiguration
import SecurityHub.AwsS3BucketServerSideEncryptionByDefault
import SecurityHub.Severity
import SecurityHub.Remediation
import SecurityHub.Network
import SecurityHub.ProcessDetails
import SecurityHub.Compliance
import SecurityHub.Workflow
import SecurityHub.Note
import SecurityHub.WafAction
import SecurityHub.WafOverrideAction
import SecurityHub.AwsSecurityFindingFilters
import SecurityHub.DateRange
import SecurityHub.TagMap
import SecurityHub.InsightResults
import SecurityHub.Recommendation
import SecurityHub.ResourceDetails
import SecurityHub.AwsCodeBuildProjectDetails
import SecurityHub.AwsCloudFrontDistributionDetails
import SecurityHub.AwsEc2InstanceDetails
import SecurityHub.AwsEc2NetworkInterfaceDetails
import SecurityHub.AwsEc2SecurityGroupDetails
import SecurityHub.AwsElbv2LoadBalancerDetails
import SecurityHub.AwsElasticsearchDomainDetails
import SecurityHub.AwsS3BucketDetails
import SecurityHub.AwsS3ObjectDetails
import SecurityHub.AwsIamAccessKeyDetails
import SecurityHub.AwsIamRoleDetails
import SecurityHub.AwsKmsKeyDetails
import SecurityHub.AwsLambdaFunctionDetails
import SecurityHub.AwsLambdaLayerVersionDetails
import SecurityHub.AwsRdsDbInstanceDetails
import SecurityHub.AwsSnsTopicDetails
import SecurityHub.AwsSqsQueueDetails
import SecurityHub.AwsWafWebAclDetails
import SecurityHub.ContainerDetails
import SecurityHub.StandardsInputParameterMap
import SecurityHub.NoteUpdate

typealias AccountDetailsList = Array<AccountDetails>

typealias AccountId = String

typealias AccountIdList = Array<NonEmptyString>

typealias ActionTargetList = Array<ActionTarget>

typealias ArnList = Array<NonEmptyString>

typealias AvailabilityZones = Array<AvailabilityZone>

typealias AwsCloudFrontDistributionOriginItemList = Array<AwsCloudFrontDistributionOriginItem>

typealias AwsEc2NetworkInterfaceSecurityGroupList = Array<AwsEc2NetworkInterfaceSecurityGroup>

typealias AwsEc2SecurityGroupIpPermissionList = Array<AwsEc2SecurityGroupIpPermission>

typealias AwsEc2SecurityGroupIpRangeList = Array<AwsEc2SecurityGroupIpRange>

typealias AwsEc2SecurityGroupIpv6RangeList = Array<AwsEc2SecurityGroupIpv6Range>

typealias AwsEc2SecurityGroupPrefixListIdList = Array<AwsEc2SecurityGroupPrefixListId>

typealias AwsEc2SecurityGroupUserIdGroupPairList = Array<AwsEc2SecurityGroupUserIdGroupPair>

typealias AwsIamRoleAssumeRolePolicyDocument = String

typealias AwsLambdaFunctionLayerList = Array<AwsLambdaFunctionLayer>

typealias AwsLambdaLayerVersionNumber = Number

typealias AwsRdsDbInstanceAssociatedRoles = Array<AwsRdsDbInstanceAssociatedRole>

typealias AwsRdsDbInstanceVpcSecurityGroups = Array<AwsRdsDbInstanceVpcSecurityGroup>

typealias AwsS3BucketServerSideEncryptionRules = Array<AwsS3BucketServerSideEncryptionRule>

typealias AwsSecurityFindingList = Array<AwsSecurityFinding>

typealias AwsSnsTopicSubscriptionList = Array<AwsSnsTopicSubscription>

typealias AwsWafWebAclRuleList = Array<AwsWafWebAclRule>

typealias Boolean = Boolean

typealias CategoryList = Array<NonEmptyString>

typealias DateFilterList = Array<DateFilter>

typealias Double = Number

typealias ImportFindingsErrorList = Array<ImportFindingsError>

typealias InsightList = Array<Insight>

typealias InsightResultValueList = Array<InsightResultValue>

typealias Integer = Number

typealias IntegrationTypeList = Array<String /* "SEND_FINDINGS_TO_SECURITY_HUB" | "RECEIVE_FINDINGS_FROM_SECURITY_HUB" | String */>

typealias InvitationList = Array<Invitation>

typealias IpFilterList = Array<IpFilter>

typealias KeywordFilterList = Array<KeywordFilter>

typealias MalwareList = Array<Malware>

typealias MapFilterList = Array<MapFilter>

typealias MaxResults = Number

typealias MemberList = Array<Member>

typealias NextToken = String

typealias NonEmptyString = String

typealias NonEmptyStringList = Array<NonEmptyString>

typealias NumberFilterList = Array<NumberFilter>

typealias ProductSubscriptionArnList = Array<NonEmptyString>

typealias ProductsList = Array<Product>

typealias RelatedFindingList = Array<RelatedFinding>

typealias RelatedRequirementsList = Array<NonEmptyString>

typealias ResourceArn = String

typealias ResourceList = Array<Resource>

typealias ResultList = Array<Result>

typealias SecurityGroups = Array<NonEmptyString>

typealias SortCriteria = Array<SortCriterion>

typealias Standards = Array<Standard>

typealias StandardsControls = Array<StandardsControl>

typealias StandardsSubscriptionArns = Array<NonEmptyString>

typealias StandardsSubscriptionRequests = Array<StandardsSubscriptionRequest>

typealias StandardsSubscriptions = Array<StandardsSubscription>

typealias StringFilterList = Array<StringFilter>

typealias StringList = Array<NonEmptyString>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias ThreatIntelIndicatorList = Array<ThreatIntelIndicator>

typealias Timestamp = Date

typealias TypeList = Array<NonEmptyString>

typealias WafExcludedRuleList = Array<WafExcludedRule>

@JsModule("aws-sdk")
external open class SecurityHub(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SecurityHub.Types.ClientConfiguration */
    open fun acceptInvitation(params: AcceptInvitationRequest, callback: (err: AWSError, data: AcceptInvitationResponse) -> Unit = definedExternally): Request<AcceptInvitationResponse, AWSError>
    open fun acceptInvitation(callback: (err: AWSError, data: AcceptInvitationResponse) -> Unit = definedExternally): Request<AcceptInvitationResponse, AWSError>
    open fun batchDisableStandards(params: BatchDisableStandardsRequest, callback: (err: AWSError, data: BatchDisableStandardsResponse) -> Unit = definedExternally): Request<BatchDisableStandardsResponse, AWSError>
    open fun batchDisableStandards(callback: (err: AWSError, data: BatchDisableStandardsResponse) -> Unit = definedExternally): Request<BatchDisableStandardsResponse, AWSError>
    open fun batchEnableStandards(params: BatchEnableStandardsRequest, callback: (err: AWSError, data: BatchEnableStandardsResponse) -> Unit = definedExternally): Request<BatchEnableStandardsResponse, AWSError>
    open fun batchEnableStandards(callback: (err: AWSError, data: BatchEnableStandardsResponse) -> Unit = definedExternally): Request<BatchEnableStandardsResponse, AWSError>
    open fun batchImportFindings(params: BatchImportFindingsRequest, callback: (err: AWSError, data: BatchImportFindingsResponse) -> Unit = definedExternally): Request<BatchImportFindingsResponse, AWSError>
    open fun batchImportFindings(callback: (err: AWSError, data: BatchImportFindingsResponse) -> Unit = definedExternally): Request<BatchImportFindingsResponse, AWSError>
    open fun createActionTarget(params: CreateActionTargetRequest, callback: (err: AWSError, data: CreateActionTargetResponse) -> Unit = definedExternally): Request<CreateActionTargetResponse, AWSError>
    open fun createActionTarget(callback: (err: AWSError, data: CreateActionTargetResponse) -> Unit = definedExternally): Request<CreateActionTargetResponse, AWSError>
    open fun createInsight(params: CreateInsightRequest, callback: (err: AWSError, data: CreateInsightResponse) -> Unit = definedExternally): Request<CreateInsightResponse, AWSError>
    open fun createInsight(callback: (err: AWSError, data: CreateInsightResponse) -> Unit = definedExternally): Request<CreateInsightResponse, AWSError>
    open fun createMembers(params: CreateMembersRequest, callback: (err: AWSError, data: CreateMembersResponse) -> Unit = definedExternally): Request<CreateMembersResponse, AWSError>
    open fun createMembers(callback: (err: AWSError, data: CreateMembersResponse) -> Unit = definedExternally): Request<CreateMembersResponse, AWSError>
    open fun declineInvitations(params: DeclineInvitationsRequest, callback: (err: AWSError, data: DeclineInvitationsResponse) -> Unit = definedExternally): Request<DeclineInvitationsResponse, AWSError>
    open fun declineInvitations(callback: (err: AWSError, data: DeclineInvitationsResponse) -> Unit = definedExternally): Request<DeclineInvitationsResponse, AWSError>
    open fun deleteActionTarget(params: DeleteActionTargetRequest, callback: (err: AWSError, data: DeleteActionTargetResponse) -> Unit = definedExternally): Request<DeleteActionTargetResponse, AWSError>
    open fun deleteActionTarget(callback: (err: AWSError, data: DeleteActionTargetResponse) -> Unit = definedExternally): Request<DeleteActionTargetResponse, AWSError>
    open fun deleteInsight(params: DeleteInsightRequest, callback: (err: AWSError, data: DeleteInsightResponse) -> Unit = definedExternally): Request<DeleteInsightResponse, AWSError>
    open fun deleteInsight(callback: (err: AWSError, data: DeleteInsightResponse) -> Unit = definedExternally): Request<DeleteInsightResponse, AWSError>
    open fun deleteInvitations(params: DeleteInvitationsRequest, callback: (err: AWSError, data: DeleteInvitationsResponse) -> Unit = definedExternally): Request<DeleteInvitationsResponse, AWSError>
    open fun deleteInvitations(callback: (err: AWSError, data: DeleteInvitationsResponse) -> Unit = definedExternally): Request<DeleteInvitationsResponse, AWSError>
    open fun deleteMembers(params: DeleteMembersRequest, callback: (err: AWSError, data: DeleteMembersResponse) -> Unit = definedExternally): Request<DeleteMembersResponse, AWSError>
    open fun deleteMembers(callback: (err: AWSError, data: DeleteMembersResponse) -> Unit = definedExternally): Request<DeleteMembersResponse, AWSError>
    open fun describeActionTargets(params: DescribeActionTargetsRequest, callback: (err: AWSError, data: DescribeActionTargetsResponse) -> Unit = definedExternally): Request<DescribeActionTargetsResponse, AWSError>
    open fun describeActionTargets(callback: (err: AWSError, data: DescribeActionTargetsResponse) -> Unit = definedExternally): Request<DescribeActionTargetsResponse, AWSError>
    open fun describeHub(params: DescribeHubRequest, callback: (err: AWSError, data: DescribeHubResponse) -> Unit = definedExternally): Request<DescribeHubResponse, AWSError>
    open fun describeHub(callback: (err: AWSError, data: DescribeHubResponse) -> Unit = definedExternally): Request<DescribeHubResponse, AWSError>
    open fun describeProducts(params: DescribeProductsRequest, callback: (err: AWSError, data: DescribeProductsResponse) -> Unit = definedExternally): Request<DescribeProductsResponse, AWSError>
    open fun describeProducts(callback: (err: AWSError, data: DescribeProductsResponse) -> Unit = definedExternally): Request<DescribeProductsResponse, AWSError>
    open fun describeStandards(params: DescribeStandardsRequest, callback: (err: AWSError, data: DescribeStandardsResponse) -> Unit = definedExternally): Request<DescribeStandardsResponse, AWSError>
    open fun describeStandards(callback: (err: AWSError, data: DescribeStandardsResponse) -> Unit = definedExternally): Request<DescribeStandardsResponse, AWSError>
    open fun describeStandardsControls(params: DescribeStandardsControlsRequest, callback: (err: AWSError, data: DescribeStandardsControlsResponse) -> Unit = definedExternally): Request<DescribeStandardsControlsResponse, AWSError>
    open fun describeStandardsControls(callback: (err: AWSError, data: DescribeStandardsControlsResponse) -> Unit = definedExternally): Request<DescribeStandardsControlsResponse, AWSError>
    open fun disableImportFindingsForProduct(params: DisableImportFindingsForProductRequest, callback: (err: AWSError, data: DisableImportFindingsForProductResponse) -> Unit = definedExternally): Request<DisableImportFindingsForProductResponse, AWSError>
    open fun disableImportFindingsForProduct(callback: (err: AWSError, data: DisableImportFindingsForProductResponse) -> Unit = definedExternally): Request<DisableImportFindingsForProductResponse, AWSError>
    open fun disableSecurityHub(params: DisableSecurityHubRequest, callback: (err: AWSError, data: DisableSecurityHubResponse) -> Unit = definedExternally): Request<DisableSecurityHubResponse, AWSError>
    open fun disableSecurityHub(callback: (err: AWSError, data: DisableSecurityHubResponse) -> Unit = definedExternally): Request<DisableSecurityHubResponse, AWSError>
    open fun disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest, callback: (err: AWSError, data: DisassociateFromMasterAccountResponse) -> Unit = definedExternally): Request<DisassociateFromMasterAccountResponse, AWSError>
    open fun disassociateFromMasterAccount(callback: (err: AWSError, data: DisassociateFromMasterAccountResponse) -> Unit = definedExternally): Request<DisassociateFromMasterAccountResponse, AWSError>
    open fun disassociateMembers(params: DisassociateMembersRequest, callback: (err: AWSError, data: DisassociateMembersResponse) -> Unit = definedExternally): Request<DisassociateMembersResponse, AWSError>
    open fun disassociateMembers(callback: (err: AWSError, data: DisassociateMembersResponse) -> Unit = definedExternally): Request<DisassociateMembersResponse, AWSError>
    open fun enableImportFindingsForProduct(params: EnableImportFindingsForProductRequest, callback: (err: AWSError, data: EnableImportFindingsForProductResponse) -> Unit = definedExternally): Request<EnableImportFindingsForProductResponse, AWSError>
    open fun enableImportFindingsForProduct(callback: (err: AWSError, data: EnableImportFindingsForProductResponse) -> Unit = definedExternally): Request<EnableImportFindingsForProductResponse, AWSError>
    open fun enableSecurityHub(params: EnableSecurityHubRequest, callback: (err: AWSError, data: EnableSecurityHubResponse) -> Unit = definedExternally): Request<EnableSecurityHubResponse, AWSError>
    open fun enableSecurityHub(callback: (err: AWSError, data: EnableSecurityHubResponse) -> Unit = definedExternally): Request<EnableSecurityHubResponse, AWSError>
    open fun getEnabledStandards(params: GetEnabledStandardsRequest, callback: (err: AWSError, data: GetEnabledStandardsResponse) -> Unit = definedExternally): Request<GetEnabledStandardsResponse, AWSError>
    open fun getEnabledStandards(callback: (err: AWSError, data: GetEnabledStandardsResponse) -> Unit = definedExternally): Request<GetEnabledStandardsResponse, AWSError>
    open fun getFindings(params: GetFindingsRequest, callback: (err: AWSError, data: GetFindingsResponse) -> Unit = definedExternally): Request<GetFindingsResponse, AWSError>
    open fun getFindings(callback: (err: AWSError, data: GetFindingsResponse) -> Unit = definedExternally): Request<GetFindingsResponse, AWSError>
    open fun getInsightResults(params: GetInsightResultsRequest, callback: (err: AWSError, data: GetInsightResultsResponse) -> Unit = definedExternally): Request<GetInsightResultsResponse, AWSError>
    open fun getInsightResults(callback: (err: AWSError, data: GetInsightResultsResponse) -> Unit = definedExternally): Request<GetInsightResultsResponse, AWSError>
    open fun getInsights(params: GetInsightsRequest, callback: (err: AWSError, data: GetInsightsResponse) -> Unit = definedExternally): Request<GetInsightsResponse, AWSError>
    open fun getInsights(callback: (err: AWSError, data: GetInsightsResponse) -> Unit = definedExternally): Request<GetInsightsResponse, AWSError>
    open fun getInvitationsCount(params: GetInvitationsCountRequest, callback: (err: AWSError, data: GetInvitationsCountResponse) -> Unit = definedExternally): Request<GetInvitationsCountResponse, AWSError>
    open fun getInvitationsCount(callback: (err: AWSError, data: GetInvitationsCountResponse) -> Unit = definedExternally): Request<GetInvitationsCountResponse, AWSError>
    open fun getMasterAccount(params: GetMasterAccountRequest, callback: (err: AWSError, data: GetMasterAccountResponse) -> Unit = definedExternally): Request<GetMasterAccountResponse, AWSError>
    open fun getMasterAccount(callback: (err: AWSError, data: GetMasterAccountResponse) -> Unit = definedExternally): Request<GetMasterAccountResponse, AWSError>
    open fun getMembers(params: GetMembersRequest, callback: (err: AWSError, data: GetMembersResponse) -> Unit = definedExternally): Request<GetMembersResponse, AWSError>
    open fun getMembers(callback: (err: AWSError, data: GetMembersResponse) -> Unit = definedExternally): Request<GetMembersResponse, AWSError>
    open fun inviteMembers(params: InviteMembersRequest, callback: (err: AWSError, data: InviteMembersResponse) -> Unit = definedExternally): Request<InviteMembersResponse, AWSError>
    open fun inviteMembers(callback: (err: AWSError, data: InviteMembersResponse) -> Unit = definedExternally): Request<InviteMembersResponse, AWSError>
    open fun listEnabledProductsForImport(params: ListEnabledProductsForImportRequest, callback: (err: AWSError, data: ListEnabledProductsForImportResponse) -> Unit = definedExternally): Request<ListEnabledProductsForImportResponse, AWSError>
    open fun listEnabledProductsForImport(callback: (err: AWSError, data: ListEnabledProductsForImportResponse) -> Unit = definedExternally): Request<ListEnabledProductsForImportResponse, AWSError>
    open fun listInvitations(params: ListInvitationsRequest, callback: (err: AWSError, data: ListInvitationsResponse) -> Unit = definedExternally): Request<ListInvitationsResponse, AWSError>
    open fun listInvitations(callback: (err: AWSError, data: ListInvitationsResponse) -> Unit = definedExternally): Request<ListInvitationsResponse, AWSError>
    open fun listMembers(params: ListMembersRequest, callback: (err: AWSError, data: ListMembersResponse) -> Unit = definedExternally): Request<ListMembersResponse, AWSError>
    open fun listMembers(callback: (err: AWSError, data: ListMembersResponse) -> Unit = definedExternally): Request<ListMembersResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateActionTarget(params: UpdateActionTargetRequest, callback: (err: AWSError, data: UpdateActionTargetResponse) -> Unit = definedExternally): Request<UpdateActionTargetResponse, AWSError>
    open fun updateActionTarget(callback: (err: AWSError, data: UpdateActionTargetResponse) -> Unit = definedExternally): Request<UpdateActionTargetResponse, AWSError>
    open fun updateFindings(params: UpdateFindingsRequest, callback: (err: AWSError, data: UpdateFindingsResponse) -> Unit = definedExternally): Request<UpdateFindingsResponse, AWSError>
    open fun updateFindings(callback: (err: AWSError, data: UpdateFindingsResponse) -> Unit = definedExternally): Request<UpdateFindingsResponse, AWSError>
    open fun updateInsight(params: UpdateInsightRequest, callback: (err: AWSError, data: UpdateInsightResponse) -> Unit = definedExternally): Request<UpdateInsightResponse, AWSError>
    open fun updateInsight(callback: (err: AWSError, data: UpdateInsightResponse) -> Unit = definedExternally): Request<UpdateInsightResponse, AWSError>
    open fun updateStandardsControl(params: UpdateStandardsControlRequest, callback: (err: AWSError, data: UpdateStandardsControlResponse) -> Unit = definedExternally): Request<UpdateStandardsControlResponse, AWSError>
    open fun updateStandardsControl(callback: (err: AWSError, data: UpdateStandardsControlResponse) -> Unit = definedExternally): Request<UpdateStandardsControlResponse, AWSError>
    interface AcceptInvitationRequest {
        var MasterId: NonEmptyString
        var InvitationId: NonEmptyString
    }
    interface AcceptInvitationResponse
    interface AccountDetails {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Email: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionTarget {
        var ActionTargetArn: NonEmptyString
        var Name: NonEmptyString
        var Description: NonEmptyString
    }
    interface AvailabilityZone {
        var ZoneName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCloudFrontDistributionDetails {
        var DomainName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ETag: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Logging: AwsCloudFrontDistributionLogging?
            get() = definedExternally
            set(value) = definedExternally
        var Origins: AwsCloudFrontDistributionOrigins?
            get() = definedExternally
            set(value) = definedExternally
        var Status: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var WebAclId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCloudFrontDistributionLogging {
        var Bucket: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeCookies: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Prefix: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCloudFrontDistributionOriginItem {
        var DomainName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Id: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var OriginPath: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCloudFrontDistributionOrigins {
        var Items: AwsCloudFrontDistributionOriginItemList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCodeBuildProjectDetails {
        var EncryptionKey: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Environment: AwsCodeBuildProjectEnvironment?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Source: AwsCodeBuildProjectSource?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRole: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: AwsCodeBuildProjectVpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCodeBuildProjectEnvironment {
        var Certificate: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ImagePullCredentialsType: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var RegistryCredential: AwsCodeBuildProjectEnvironmentRegistryCredential?
            get() = definedExternally
            set(value) = definedExternally
        var Type: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCodeBuildProjectEnvironmentRegistryCredential {
        var Credential: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CredentialProvider: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCodeBuildProjectSource {
        var Type: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Location: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var GitCloneDepth: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InsecureSsl: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsCodeBuildProjectVpcConfig {
        var VpcId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Subnets: NonEmptyStringList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: NonEmptyStringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsEc2InstanceDetails {
        var Type: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ImageId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var IpV4Addresses: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var IpV6Addresses: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var KeyName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var IamInstanceProfileArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchedAt: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsEc2NetworkInterfaceAttachment {
        var AttachTime: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var AttachmentId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteOnTermination: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceIndex: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceOwnerId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsEc2NetworkInterfaceDetails {
        var Attachment: AwsEc2NetworkInterfaceAttachment?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfaceId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: AwsEc2NetworkInterfaceSecurityGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var SourceDestCheck: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsEc2NetworkInterfaceSecurityGroup {
        var GroupName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsEc2SecurityGroupDetails {
        var GroupName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var IpPermissions: AwsEc2SecurityGroupIpPermissionList?
            get() = definedExternally
            set(value) = definedExternally
        var IpPermissionsEgress: AwsEc2SecurityGroupIpPermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsEc2SecurityGroupIpPermission {
        var IpProtocol: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var FromPort: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ToPort: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var UserIdGroupPairs: AwsEc2SecurityGroupUserIdGroupPairList?
            get() = definedExternally
            set(value) = definedExternally
        var IpRanges: AwsEc2SecurityGroupIpRangeList?
            get() = definedExternally
            set(value) = definedExternally
        var Ipv6Ranges: AwsEc2SecurityGroupIpv6RangeList?
            get() = definedExternally
            set(value) = definedExternally
        var PrefixListIds: AwsEc2SecurityGroupPrefixListIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsEc2SecurityGroupIpRange {
        var CidrIp: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsEc2SecurityGroupIpv6Range {
        var CidrIpv6: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsEc2SecurityGroupPrefixListId {
        var PrefixListId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsEc2SecurityGroupUserIdGroupPair {
        var GroupId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var GroupName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var PeeringStatus: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var UserId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var VpcPeeringConnectionId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsElasticsearchDomainDetails {
        var AccessPolicies: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DomainEndpointOptions: AwsElasticsearchDomainDomainEndpointOptions?
            get() = definedExternally
            set(value) = definedExternally
        var DomainId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoints: FieldMap?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchVersion: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionAtRestOptions: AwsElasticsearchDomainEncryptionAtRestOptions?
            get() = definedExternally
            set(value) = definedExternally
        var NodeToNodeEncryptionOptions: AwsElasticsearchDomainNodeToNodeEncryptionOptions?
            get() = definedExternally
            set(value) = definedExternally
        var VPCOptions: AwsElasticsearchDomainVPCOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsElasticsearchDomainDomainEndpointOptions {
        var EnforceHTTPS: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TLSSecurityPolicy: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsElasticsearchDomainEncryptionAtRestOptions {
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsElasticsearchDomainNodeToNodeEncryptionOptions {
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsElasticsearchDomainVPCOptions {
        var AvailabilityZones: NonEmptyStringList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: NonEmptyStringList?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: NonEmptyStringList?
            get() = definedExternally
            set(value) = definedExternally
        var VPCId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsElbv2LoadBalancerDetails {
        var AvailabilityZones: AvailabilityZones?
            get() = definedExternally
            set(value) = definedExternally
        var CanonicalHostedZoneId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DNSName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var IpAddressType: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Scheme: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var State: LoadBalancerState?
            get() = definedExternally
            set(value) = definedExternally
        var Type: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsIamAccessKeyDetails {
        var UserName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Active" | "Inactive" | String */
        var CreatedAt: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var PrincipalId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var PrincipalType: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var PrincipalName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsIamRoleDetails {
        var AssumeRolePolicyDocument: AwsIamRoleAssumeRolePolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var RoleId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var RoleName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSessionDuration: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Path: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsKmsKeyDetails {
        var AWSAccountId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: Double?
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var KeyManager: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var KeyState: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Origin: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsLambdaFunctionCode {
        var S3Bucket: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var S3Key: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var S3ObjectVersion: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ZipFile: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsLambdaFunctionDeadLetterConfig {
        var TargetArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsLambdaFunctionDetails {
        var Code: AwsLambdaFunctionCode?
            get() = definedExternally
            set(value) = definedExternally
        var CodeSha256: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DeadLetterConfig: AwsLambdaFunctionDeadLetterConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Environment: AwsLambdaFunctionEnvironment?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Handler: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var LastModified: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Layers: AwsLambdaFunctionLayerList?
            get() = definedExternally
            set(value) = definedExternally
        var MasterArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var MemorySize: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Role: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Runtime: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var TracingConfig: AwsLambdaFunctionTracingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: AwsLambdaFunctionVpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Version: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsLambdaFunctionEnvironment {
        var Variables: FieldMap?
            get() = definedExternally
            set(value) = definedExternally
        var Error: AwsLambdaFunctionEnvironmentError?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsLambdaFunctionEnvironmentError {
        var ErrorCode: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Message: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsLambdaFunctionLayer {
        var Arn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CodeSize: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsLambdaFunctionTracingConfig {
        var Mode: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsLambdaFunctionVpcConfig {
        var SecurityGroupIds: NonEmptyStringList?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: NonEmptyStringList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsLambdaLayerVersionDetails {
        var Version: AwsLambdaLayerVersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var CompatibleRuntimes: NonEmptyStringList?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsRdsDbInstanceAssociatedRole {
        var RoleArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var FeatureName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsRdsDbInstanceDetails {
        var AssociatedRoles: AwsRdsDbInstanceAssociatedRoles?
            get() = definedExternally
            set(value) = definedExternally
        var CACertificateIdentifier: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DBClusterIdentifier: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceIdentifier: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DBInstanceClass: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DbInstancePort: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DbiResourceId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DBName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: AwsRdsDbInstanceEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var Engine: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var EngineVersion: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var IAMDatabaseAuthenticationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceCreateTime: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var PubliclyAccessible: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var StorageEncrypted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TdeCredentialArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var VpcSecurityGroups: AwsRdsDbInstanceVpcSecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsRdsDbInstanceEndpoint {
        var Address: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Port: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var HostedZoneId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsRdsDbInstanceVpcSecurityGroup {
        var VpcSecurityGroupId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsS3BucketDetails {
        var OwnerId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ServerSideEncryptionConfiguration: AwsS3BucketServerSideEncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsS3BucketServerSideEncryptionByDefault {
        var SSEAlgorithm: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var KMSMasterKeyID: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsS3BucketServerSideEncryptionConfiguration {
        var Rules: AwsS3BucketServerSideEncryptionRules?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsS3BucketServerSideEncryptionRule {
        var ApplyServerSideEncryptionByDefault: AwsS3BucketServerSideEncryptionByDefault?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsS3ObjectDetails {
        var LastModified: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ETag: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ServerSideEncryption: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SSEKMSKeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsSecurityFinding {
        var SchemaVersion: NonEmptyString
        var Id: NonEmptyString
        var ProductArn: NonEmptyString
        var GeneratorId: NonEmptyString
        var AwsAccountId: NonEmptyString
        var Types: TypeList
        var FirstObservedAt: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var LastObservedAt: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: NonEmptyString
        var UpdatedAt: NonEmptyString
        var Severity: Severity
        var Confidence: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Criticality: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Title: NonEmptyString
        var Description: NonEmptyString
        var Remediation: Remediation?
            get() = definedExternally
            set(value) = definedExternally
        var SourceUrl: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ProductFields: FieldMap?
            get() = definedExternally
            set(value) = definedExternally
        var UserDefinedFields: FieldMap?
            get() = definedExternally
            set(value) = definedExternally
        var Malware: MalwareList?
            get() = definedExternally
            set(value) = definedExternally
        var Network: Network?
            get() = definedExternally
            set(value) = definedExternally
        var Process: ProcessDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ThreatIntelIndicators: ThreatIntelIndicatorList?
            get() = definedExternally
            set(value) = definedExternally
        var Resources: ResourceList
        var Compliance: Compliance?
            get() = definedExternally
            set(value) = definedExternally
        var VerificationState: String /* "UNKNOWN" | "TRUE_POSITIVE" | "FALSE_POSITIVE" | "BENIGN_POSITIVE" | String */
        var WorkflowState: String /* "NEW" | "ASSIGNED" | "IN_PROGRESS" | "DEFERRED" | "RESOLVED" | String */
        var Workflow: Workflow?
            get() = definedExternally
            set(value) = definedExternally
        var RecordState: String /* "ACTIVE" | "ARCHIVED" | String */
        var RelatedFindings: RelatedFindingList?
            get() = definedExternally
            set(value) = definedExternally
        var Note: Note?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsSecurityFindingFilters {
        var ProductArn: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var AwsAccountId: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Id: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var GeneratorId: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Type: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var FirstObservedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var LastObservedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SeverityProduct: NumberFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SeverityNormalized: NumberFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SeverityLabel: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Confidence: NumberFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Criticality: NumberFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Title: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Description: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var RecommendationText: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SourceUrl: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ProductFields: MapFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ProductName: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var CompanyName: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var UserDefinedFields: MapFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MalwareName: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MalwareType: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MalwarePath: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var MalwareState: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkDirection: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkProtocol: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkSourceIpV4: IpFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkSourceIpV6: IpFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkSourcePort: NumberFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkSourceDomain: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkSourceMac: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkDestinationIpV4: IpFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkDestinationIpV6: IpFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkDestinationPort: NumberFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkDestinationDomain: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessName: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessPath: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessPid: NumberFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessParentPid: NumberFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessLaunchedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessTerminatedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ThreatIntelIndicatorType: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ThreatIntelIndicatorValue: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ThreatIntelIndicatorCategory: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ThreatIntelIndicatorLastObservedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ThreatIntelIndicatorSource: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ThreatIntelIndicatorSourceUrl: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourcePartition: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceRegion: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTags: MapFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsEc2InstanceType: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsEc2InstanceImageId: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsEc2InstanceIpV4Addresses: IpFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsEc2InstanceIpV6Addresses: IpFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsEc2InstanceKeyName: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsEc2InstanceIamInstanceProfileArn: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsEc2InstanceVpcId: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsEc2InstanceSubnetId: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsEc2InstanceLaunchedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsS3BucketOwnerId: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsS3BucketOwnerName: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsIamAccessKeyUserName: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsIamAccessKeyStatus: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAwsIamAccessKeyCreatedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceContainerName: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceContainerImageId: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceContainerImageName: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceContainerLaunchedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceDetailsOther: MapFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceStatus: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var VerificationState: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var WorkflowState: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var WorkflowStatus: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var RecordState: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var RelatedFindingsProductArn: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var RelatedFindingsId: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NoteText: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NoteUpdatedAt: DateFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NoteUpdatedBy: StringFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Keyword: KeywordFilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsSnsTopicDetails {
        var KmsMasterKeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Subscription: AwsSnsTopicSubscriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var TopicName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsSnsTopicSubscription {
        var Endpoint: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsSqsQueueDetails {
        var KmsDataKeyReusePeriodSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var KmsMasterKeyId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var QueueName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DeadLetterTargetArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsWafWebAclDetails {
        var Name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultAction: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: AwsWafWebAclRuleList?
            get() = definedExternally
            set(value) = definedExternally
        var WebAclId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsWafWebAclRule {
        var Action: WafAction?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludedRules: WafExcludedRuleList?
            get() = definedExternally
            set(value) = definedExternally
        var OverrideAction: WafOverrideAction?
            get() = definedExternally
            set(value) = definedExternally
        var Priority: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var RuleId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Type: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDisableStandardsRequest {
        var StandardsSubscriptionArns: StandardsSubscriptionArns
    }
    interface BatchDisableStandardsResponse {
        var StandardsSubscriptions: StandardsSubscriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchEnableStandardsRequest {
        var StandardsSubscriptionRequests: StandardsSubscriptionRequests
    }
    interface BatchEnableStandardsResponse {
        var StandardsSubscriptions: StandardsSubscriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchImportFindingsRequest {
        var Findings: AwsSecurityFindingList
    }
    interface BatchImportFindingsResponse {
        var FailedCount: Integer
        var SuccessCount: Integer
        var FailedFindings: ImportFindingsErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Compliance {
        var Status: String /* "PASSED" | "WARNING" | "FAILED" | "NOT_AVAILABLE" | String */
        var RelatedRequirements: RelatedRequirementsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerDetails {
        var Name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ImageId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ImageName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchedAt: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateActionTargetRequest {
        var Name: NonEmptyString
        var Description: NonEmptyString
        var Id: NonEmptyString
    }
    interface CreateActionTargetResponse {
        var ActionTargetArn: NonEmptyString
    }
    interface CreateInsightRequest {
        var Name: NonEmptyString
        var Filters: AwsSecurityFindingFilters
        var GroupByAttribute: NonEmptyString
    }
    interface CreateInsightResponse {
        var InsightArn: NonEmptyString
    }
    interface CreateMembersRequest {
        var AccountDetails: AccountDetailsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMembersResponse {
        var UnprocessedAccounts: ResultList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DateFilter {
        var Start: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var End: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DateRange: DateRange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DateRange {
        var Value: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Unit: String /* "DAYS" | String */
    }
    interface DeclineInvitationsRequest {
        var AccountIds: AccountIdList
    }
    interface DeclineInvitationsResponse {
        var UnprocessedAccounts: ResultList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteActionTargetRequest {
        var ActionTargetArn: NonEmptyString
    }
    interface DeleteActionTargetResponse {
        var ActionTargetArn: NonEmptyString
    }
    interface DeleteInsightRequest {
        var InsightArn: NonEmptyString
    }
    interface DeleteInsightResponse {
        var InsightArn: NonEmptyString
    }
    interface DeleteInvitationsRequest {
        var AccountIds: AccountIdList
    }
    interface DeleteInvitationsResponse {
        var UnprocessedAccounts: ResultList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteMembersRequest {
        var AccountIds: AccountIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteMembersResponse {
        var UnprocessedAccounts: ResultList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeActionTargetsRequest {
        var ActionTargetArns: ArnList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeActionTargetsResponse {
        var ActionTargets: ActionTargetList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHubRequest {
        var HubArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHubResponse {
        var HubArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SubscribedAt: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProductsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProductsResponse {
        var Products: ProductsList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStandardsControlsRequest {
        var StandardsSubscriptionArn: NonEmptyString
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStandardsControlsResponse {
        var Controls: StandardsControls?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStandardsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStandardsResponse {
        var Standards: Standards?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableImportFindingsForProductRequest {
        var ProductSubscriptionArn: NonEmptyString
    }
    interface DisableImportFindingsForProductResponse
    interface DisableSecurityHubRequest
    interface DisableSecurityHubResponse
    interface DisassociateFromMasterAccountRequest
    interface DisassociateFromMasterAccountResponse
    interface DisassociateMembersRequest {
        var AccountIds: AccountIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateMembersResponse
    interface EnableImportFindingsForProductRequest {
        var ProductArn: NonEmptyString
    }
    interface EnableImportFindingsForProductResponse {
        var ProductSubscriptionArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableSecurityHubRequest {
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var EnableDefaultStandards: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnableSecurityHubResponse
    interface FieldMap {
        @nativeGetter
        operator fun get(key: String): NonEmptyString?
        @nativeSetter
        operator fun set(key: String, value: NonEmptyString)
    }
    interface GetEnabledStandardsRequest {
        var StandardsSubscriptionArns: StandardsSubscriptionArns?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEnabledStandardsResponse {
        var StandardsSubscriptions: StandardsSubscriptions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFindingsRequest {
        var Filters: AwsSecurityFindingFilters?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFindingsResponse {
        var Findings: AwsSecurityFindingList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInsightResultsRequest {
        var InsightArn: NonEmptyString
    }
    interface GetInsightResultsResponse {
        var InsightResults: InsightResults
    }
    interface GetInsightsRequest {
        var InsightArns: ArnList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInsightsResponse {
        var Insights: InsightList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInvitationsCountRequest
    interface GetInvitationsCountResponse {
        var InvitationsCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMasterAccountRequest
    interface GetMasterAccountResponse {
        var Master: Invitation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMembersRequest {
        var AccountIds: AccountIdList
    }
    interface GetMembersResponse {
        var Members: MemberList?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedAccounts: ResultList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportFindingsError {
        var Id: NonEmptyString
        var ErrorCode: NonEmptyString
        var ErrorMessage: NonEmptyString
    }
    interface Insight {
        var InsightArn: NonEmptyString
        var Name: NonEmptyString
        var Filters: AwsSecurityFindingFilters
        var GroupByAttribute: NonEmptyString
    }
    interface InsightResultValue {
        var GroupByAttributeValue: NonEmptyString
        var Count: Integer
    }
    interface InsightResults {
        var InsightArn: NonEmptyString
        var GroupByAttribute: NonEmptyString
        var ResultValues: InsightResultValueList
    }
    interface Invitation {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var InvitationId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var InvitedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var MemberStatus: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InviteMembersRequest {
        var AccountIds: AccountIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InviteMembersResponse {
        var UnprocessedAccounts: ResultList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IpFilter {
        var Cidr: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeywordFilter {
        var Value: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEnabledProductsForImportRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEnabledProductsForImportResponse {
        var ProductSubscriptions: ProductSubscriptionArnList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInvitationsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInvitationsResponse {
        var Invitations: InvitationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMembersRequest {
        var OnlyAssociated: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMembersResponse {
        var Members: MemberList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: ResourceArn
    }
    interface ListTagsForResourceResponse {
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerState {
        var Code: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Reason: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Malware {
        var Name: NonEmptyString
        var Type: String /* "ADWARE" | "BLENDED_THREAT" | "BOTNET_AGENT" | "COIN_MINER" | "EXPLOIT_KIT" | "KEYLOGGER" | "MACRO" | "POTENTIALLY_UNWANTED" | "SPYWARE" | "RANSOMWARE" | "REMOTE_ACCESS" | "ROOTKIT" | "TROJAN" | "VIRUS" | "WORM" | String */
        var Path: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "OBSERVED" | "REMOVAL_FAILED" | "REMOVED" | String */
    }
    interface MapFilter {
        var Key: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Value: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Comparison: String /* "EQUALS" | String */
    }
    interface Member {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Email: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var MasterId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var MemberStatus: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var InvitedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Network {
        var Direction: String /* "IN" | "OUT" | String */
        var Protocol: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SourceIpV4: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SourceIpV6: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SourcePort: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SourceDomain: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SourceMac: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationIpV4: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationIpV6: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationPort: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationDomain: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Note {
        var Text: NonEmptyString
        var UpdatedBy: NonEmptyString
        var UpdatedAt: NonEmptyString
    }
    interface NoteUpdate {
        var Text: NonEmptyString
        var UpdatedBy: NonEmptyString
    }
    interface NumberFilter {
        var Gte: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Lte: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Eq: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProcessDetails {
        var Name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Path: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Pid: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ParentPid: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchedAt: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var TerminatedAt: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Product {
        var ProductArn: NonEmptyString
        var ProductName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CompanyName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Categories: CategoryList?
            get() = definedExternally
            set(value) = definedExternally
        var IntegrationTypes: IntegrationTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var MarketplaceUrl: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ActivationUrl: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ProductSubscriptionResourcePolicy: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Recommendation {
        var Text: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Url: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelatedFinding {
        var ProductArn: NonEmptyString
        var Id: NonEmptyString
    }
    interface Remediation {
        var Recommendation: Recommendation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Resource {
        var Type: NonEmptyString
        var Id: NonEmptyString
        var Partition: String /* "aws" | "aws-cn" | "aws-us-gov" | String */
        var Region: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: FieldMap?
            get() = definedExternally
            set(value) = definedExternally
        var Details: ResourceDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceDetails {
        var AwsCodeBuildProject: AwsCodeBuildProjectDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsCloudFrontDistribution: AwsCloudFrontDistributionDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsEc2Instance: AwsEc2InstanceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsEc2NetworkInterface: AwsEc2NetworkInterfaceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsEc2SecurityGroup: AwsEc2SecurityGroupDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsElbv2LoadBalancer: AwsElbv2LoadBalancerDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsElasticsearchDomain: AwsElasticsearchDomainDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsS3Bucket: AwsS3BucketDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsS3Object: AwsS3ObjectDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsIamAccessKey: AwsIamAccessKeyDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsIamRole: AwsIamRoleDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsKmsKey: AwsKmsKeyDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsLambdaFunction: AwsLambdaFunctionDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsLambdaLayerVersion: AwsLambdaLayerVersionDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsRdsDbInstance: AwsRdsDbInstanceDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsSnsTopic: AwsSnsTopicDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsSqsQueue: AwsSqsQueueDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AwsWafWebAcl: AwsWafWebAclDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Container: ContainerDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Other: FieldMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Result {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingResult: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Severity {
        var Product: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Label: String /* "INFORMATIONAL" | "LOW" | "MEDIUM" | "HIGH" | "CRITICAL" | String */
        var Normalized: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SortCriterion {
        var Field: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "asc" | "desc" | String */
    }
    interface Standard {
        var StandardsArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var EnabledByDefault: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StandardsControl {
        var StandardsControlArn: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ControlStatus: String /* "ENABLED" | "DISABLED" | String */
        var DisabledReason: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ControlStatusUpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ControlId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Title: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var RemediationUrl: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SeverityRating: String /* "LOW" | "MEDIUM" | "HIGH" | "CRITICAL" | String */
        var RelatedRequirements: RelatedRequirementsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StandardsInputParameterMap {
        @nativeGetter
        operator fun get(key: String): NonEmptyString?
        @nativeSetter
        operator fun set(key: String, value: NonEmptyString)
    }
    interface StandardsSubscription {
        var StandardsSubscriptionArn: NonEmptyString
        var StandardsArn: NonEmptyString
        var StandardsInput: StandardsInputParameterMap
        var StandardsStatus: String /* "PENDING" | "READY" | "FAILED" | "DELETING" | "INCOMPLETE" | String */
    }
    interface StandardsSubscriptionRequest {
        var StandardsArn: NonEmptyString
        var StandardsInput: StandardsInputParameterMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StringFilter {
        var Value: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Comparison: String /* "EQUALS" | "PREFIX" | String */
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var ResourceArn: ResourceArn
        var Tags: TagMap
    }
    interface TagResourceResponse
    interface ThreatIntelIndicator {
        var Type: String /* "DOMAIN" | "EMAIL_ADDRESS" | "HASH_MD5" | "HASH_SHA1" | "HASH_SHA256" | "HASH_SHA512" | "IPV4_ADDRESS" | "IPV6_ADDRESS" | "MUTEX" | "PROCESS" | "URL" | String */
        var Value: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Category: String /* "BACKDOOR" | "CARD_STEALER" | "COMMAND_AND_CONTROL" | "DROP_SITE" | "EXPLOIT_SITE" | "KEYLOGGER" | String */
        var LastObservedAt: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Source: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var SourceUrl: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: ResourceArn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateActionTargetRequest {
        var ActionTargetArn: NonEmptyString
        var Name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateActionTargetResponse
    interface UpdateFindingsRequest {
        var Filters: AwsSecurityFindingFilters
        var Note: NoteUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var RecordState: String /* "ACTIVE" | "ARCHIVED" | String */
    }
    interface UpdateFindingsResponse
    interface UpdateInsightRequest {
        var InsightArn: NonEmptyString
        var Name: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: AwsSecurityFindingFilters?
            get() = definedExternally
            set(value) = definedExternally
        var GroupByAttribute: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateInsightResponse
    interface UpdateStandardsControlRequest {
        var StandardsControlArn: NonEmptyString
        var ControlStatus: String /* "ENABLED" | "DISABLED" | String */
        var DisabledReason: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStandardsControlResponse
    interface WafAction {
        var Type: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WafExcludedRule {
        var RuleId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WafOverrideAction {
        var Type: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Workflow {
        var Status: String /* "NEW" | "NOTIFIED" | "RESOLVED" | "SUPPRESSED" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-10-26" | "latest" | String */
    }
}