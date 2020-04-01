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
import PinpointEmail.BlacklistEntry
import PinpointEmail.CloudWatchDimensionConfiguration
import PinpointEmail.DailyVolume
import PinpointEmail.DedicatedIp
import PinpointEmail.DeliverabilityTestReport
import PinpointEmail.DomainDeliverabilityCampaign
import PinpointEmail.DomainDeliverabilityTrackingOption
import PinpointEmail.DomainIspPlacement
import PinpointEmail.EventDestination
import PinpointEmail.IdentityInfo
import PinpointEmail.IspPlacement
import PinpointEmail.MessageTag
import PinpointEmail.Tag
import PinpointEmail.CreateConfigurationSetRequest
import PinpointEmail.CreateConfigurationSetResponse
import PinpointEmail.CreateConfigurationSetEventDestinationRequest
import PinpointEmail.CreateConfigurationSetEventDestinationResponse
import PinpointEmail.CreateDedicatedIpPoolRequest
import PinpointEmail.CreateDedicatedIpPoolResponse
import PinpointEmail.CreateDeliverabilityTestReportRequest
import PinpointEmail.CreateDeliverabilityTestReportResponse
import PinpointEmail.CreateEmailIdentityRequest
import PinpointEmail.CreateEmailIdentityResponse
import PinpointEmail.DeleteConfigurationSetRequest
import PinpointEmail.DeleteConfigurationSetResponse
import PinpointEmail.DeleteConfigurationSetEventDestinationRequest
import PinpointEmail.DeleteConfigurationSetEventDestinationResponse
import PinpointEmail.DeleteDedicatedIpPoolRequest
import PinpointEmail.DeleteDedicatedIpPoolResponse
import PinpointEmail.DeleteEmailIdentityRequest
import PinpointEmail.DeleteEmailIdentityResponse
import PinpointEmail.GetAccountRequest
import PinpointEmail.GetAccountResponse
import PinpointEmail.GetBlacklistReportsRequest
import PinpointEmail.GetBlacklistReportsResponse
import PinpointEmail.GetConfigurationSetRequest
import PinpointEmail.GetConfigurationSetResponse
import PinpointEmail.GetConfigurationSetEventDestinationsRequest
import PinpointEmail.GetConfigurationSetEventDestinationsResponse
import PinpointEmail.GetDedicatedIpRequest
import PinpointEmail.GetDedicatedIpResponse
import PinpointEmail.GetDedicatedIpsRequest
import PinpointEmail.GetDedicatedIpsResponse
import PinpointEmail.GetDeliverabilityDashboardOptionsRequest
import PinpointEmail.GetDeliverabilityDashboardOptionsResponse
import PinpointEmail.GetDeliverabilityTestReportRequest
import PinpointEmail.GetDeliverabilityTestReportResponse
import PinpointEmail.GetDomainDeliverabilityCampaignRequest
import PinpointEmail.GetDomainDeliverabilityCampaignResponse
import PinpointEmail.GetDomainStatisticsReportRequest
import PinpointEmail.GetDomainStatisticsReportResponse
import PinpointEmail.GetEmailIdentityRequest
import PinpointEmail.GetEmailIdentityResponse
import PinpointEmail.ListConfigurationSetsRequest
import PinpointEmail.ListConfigurationSetsResponse
import PinpointEmail.ListDedicatedIpPoolsRequest
import PinpointEmail.ListDedicatedIpPoolsResponse
import PinpointEmail.ListDeliverabilityTestReportsRequest
import PinpointEmail.ListDeliverabilityTestReportsResponse
import PinpointEmail.ListDomainDeliverabilityCampaignsRequest
import PinpointEmail.ListDomainDeliverabilityCampaignsResponse
import PinpointEmail.ListEmailIdentitiesRequest
import PinpointEmail.ListEmailIdentitiesResponse
import PinpointEmail.ListTagsForResourceRequest
import PinpointEmail.ListTagsForResourceResponse
import PinpointEmail.PutAccountDedicatedIpWarmupAttributesRequest
import PinpointEmail.PutAccountDedicatedIpWarmupAttributesResponse
import PinpointEmail.PutAccountSendingAttributesRequest
import PinpointEmail.PutAccountSendingAttributesResponse
import PinpointEmail.PutConfigurationSetDeliveryOptionsRequest
import PinpointEmail.PutConfigurationSetDeliveryOptionsResponse
import PinpointEmail.PutConfigurationSetReputationOptionsRequest
import PinpointEmail.PutConfigurationSetReputationOptionsResponse
import PinpointEmail.PutConfigurationSetSendingOptionsRequest
import PinpointEmail.PutConfigurationSetSendingOptionsResponse
import PinpointEmail.PutConfigurationSetTrackingOptionsRequest
import PinpointEmail.PutConfigurationSetTrackingOptionsResponse
import PinpointEmail.PutDedicatedIpInPoolRequest
import PinpointEmail.PutDedicatedIpInPoolResponse
import PinpointEmail.PutDedicatedIpWarmupAttributesRequest
import PinpointEmail.PutDedicatedIpWarmupAttributesResponse
import PinpointEmail.PutDeliverabilityDashboardOptionRequest
import PinpointEmail.PutDeliverabilityDashboardOptionResponse
import PinpointEmail.PutEmailIdentityDkimAttributesRequest
import PinpointEmail.PutEmailIdentityDkimAttributesResponse
import PinpointEmail.PutEmailIdentityFeedbackAttributesRequest
import PinpointEmail.PutEmailIdentityFeedbackAttributesResponse
import PinpointEmail.PutEmailIdentityMailFromAttributesRequest
import PinpointEmail.PutEmailIdentityMailFromAttributesResponse
import PinpointEmail.SendEmailRequest
import PinpointEmail.SendEmailResponse
import PinpointEmail.TagResourceRequest
import PinpointEmail.TagResourceResponse
import PinpointEmail.UntagResourceRequest
import PinpointEmail.UntagResourceResponse
import PinpointEmail.UpdateConfigurationSetEventDestinationRequest
import PinpointEmail.UpdateConfigurationSetEventDestinationResponse
import PinpointEmail.Content
import PinpointEmail.EventDestinationDefinition
import PinpointEmail.TrackingOptions
import PinpointEmail.DeliveryOptions
import PinpointEmail.ReputationOptions
import PinpointEmail.SendingOptions
import PinpointEmail.EmailContent
import PinpointEmail.DkimAttributes
import PinpointEmail.VolumeStatistics
import PinpointEmail.InboxPlacementTrackingOption
import PinpointEmail.Message
import PinpointEmail.RawMessage
import PinpointEmail.Template
import PinpointEmail.KinesisFirehoseDestination
import PinpointEmail.CloudWatchDestination
import PinpointEmail.SnsDestination
import PinpointEmail.PinpointDestination
import PinpointEmail.SendQuota
import PinpointEmail.BlacklistReport
import PinpointEmail.PlacementStatistics
import PinpointEmail.OverallVolume
import PinpointEmail.MailFromAttributes
import PinpointEmail.Body
import PinpointEmail.Destination

typealias AmazonResourceName = String

typealias BlacklistEntries = Array<BlacklistEntry>

typealias BlacklistItemName = String

typealias BlacklistItemNames = Array<BlacklistItemName>

typealias BlacklistingDescription = String

typealias CampaignId = String

typealias Charset = String

typealias CloudWatchDimensionConfigurations = Array<CloudWatchDimensionConfiguration>

typealias ConfigurationSetName = String

typealias ConfigurationSetNameList = Array<ConfigurationSetName>

typealias CustomRedirectDomain = String

typealias DailyVolumes = Array<DailyVolume>

typealias DedicatedIpList = Array<DedicatedIp>

typealias DefaultDimensionValue = String

typealias DeliverabilityTestReports = Array<DeliverabilityTestReport>

typealias DeliverabilityTestSubject = String

typealias DimensionName = String

typealias DnsToken = String

typealias DnsTokenList = Array<DnsToken>

typealias Domain = String

typealias DomainDeliverabilityCampaignList = Array<DomainDeliverabilityCampaign>

typealias DomainDeliverabilityTrackingOptions = Array<DomainDeliverabilityTrackingOption>

typealias DomainIspPlacements = Array<DomainIspPlacement>

typealias EmailAddress = String

typealias EmailAddressList = Array<EmailAddress>

typealias Enabled = Boolean

typealias Esp = String

typealias Esps = Array<Esp>

typealias EventDestinationName = String

typealias EventDestinations = Array<EventDestination>

typealias EventTypes = Array<String /* "SEND" | "REJECT" | "BOUNCE" | "COMPLAINT" | "DELIVERY" | "OPEN" | "CLICK" | "RENDERING_FAILURE" | String */>

typealias GeneralEnforcementStatus = String

typealias Identity = String

typealias IdentityInfoList = Array<IdentityInfo>

typealias ImageUrl = String

typealias Ip = String

typealias IpList = Array<Ip>

typealias IspName = String

typealias IspNameList = Array<IspName>

typealias IspPlacements = Array<IspPlacement>

typealias LastFreshStart = Date

typealias ListOfDedicatedIpPools = Array<PoolName>

typealias MailFromDomainName = String

typealias Max24HourSend = Number

typealias MaxItems = Number

typealias MaxSendRate = Number

typealias MessageContent = String

typealias MessageData = String

typealias MessageTagList = Array<MessageTag>

typealias MessageTagName = String

typealias MessageTagValue = String

typealias NextToken = String

typealias OutboundMessageId = String

typealias Percentage = Number

typealias Percentage100Wrapper = Number

typealias PoolName = String

typealias RblName = String

typealias ReportId = String

typealias ReportName = String

typealias SendingPoolName = String

typealias SentLast24Hours = Number

typealias Subject = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TemplateArn = String

typealias TemplateData = String

typealias Timestamp = Date

typealias Volume = Number

@JsModule("aws-sdk")
external open class PinpointEmail(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & PinpointEmail.Types.ClientConfiguration */
    open fun createConfigurationSet(params: CreateConfigurationSetRequest, callback: (err: AWSError, data: CreateConfigurationSetResponse) -> Unit = definedExternally): Request<CreateConfigurationSetResponse, AWSError>
    open fun createConfigurationSet(callback: (err: AWSError, data: CreateConfigurationSetResponse) -> Unit = definedExternally): Request<CreateConfigurationSetResponse, AWSError>
    open fun createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest, callback: (err: AWSError, data: CreateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<CreateConfigurationSetEventDestinationResponse, AWSError>
    open fun createConfigurationSetEventDestination(callback: (err: AWSError, data: CreateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<CreateConfigurationSetEventDestinationResponse, AWSError>
    open fun createDedicatedIpPool(params: CreateDedicatedIpPoolRequest, callback: (err: AWSError, data: CreateDedicatedIpPoolResponse) -> Unit = definedExternally): Request<CreateDedicatedIpPoolResponse, AWSError>
    open fun createDedicatedIpPool(callback: (err: AWSError, data: CreateDedicatedIpPoolResponse) -> Unit = definedExternally): Request<CreateDedicatedIpPoolResponse, AWSError>
    open fun createDeliverabilityTestReport(params: CreateDeliverabilityTestReportRequest, callback: (err: AWSError, data: CreateDeliverabilityTestReportResponse) -> Unit = definedExternally): Request<CreateDeliverabilityTestReportResponse, AWSError>
    open fun createDeliverabilityTestReport(callback: (err: AWSError, data: CreateDeliverabilityTestReportResponse) -> Unit = definedExternally): Request<CreateDeliverabilityTestReportResponse, AWSError>
    open fun createEmailIdentity(params: CreateEmailIdentityRequest, callback: (err: AWSError, data: CreateEmailIdentityResponse) -> Unit = definedExternally): Request<CreateEmailIdentityResponse, AWSError>
    open fun createEmailIdentity(callback: (err: AWSError, data: CreateEmailIdentityResponse) -> Unit = definedExternally): Request<CreateEmailIdentityResponse, AWSError>
    open fun deleteConfigurationSet(params: DeleteConfigurationSetRequest, callback: (err: AWSError, data: DeleteConfigurationSetResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetResponse, AWSError>
    open fun deleteConfigurationSet(callback: (err: AWSError, data: DeleteConfigurationSetResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetResponse, AWSError>
    open fun deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest, callback: (err: AWSError, data: DeleteConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetEventDestinationResponse, AWSError>
    open fun deleteConfigurationSetEventDestination(callback: (err: AWSError, data: DeleteConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetEventDestinationResponse, AWSError>
    open fun deleteDedicatedIpPool(params: DeleteDedicatedIpPoolRequest, callback: (err: AWSError, data: DeleteDedicatedIpPoolResponse) -> Unit = definedExternally): Request<DeleteDedicatedIpPoolResponse, AWSError>
    open fun deleteDedicatedIpPool(callback: (err: AWSError, data: DeleteDedicatedIpPoolResponse) -> Unit = definedExternally): Request<DeleteDedicatedIpPoolResponse, AWSError>
    open fun deleteEmailIdentity(params: DeleteEmailIdentityRequest, callback: (err: AWSError, data: DeleteEmailIdentityResponse) -> Unit = definedExternally): Request<DeleteEmailIdentityResponse, AWSError>
    open fun deleteEmailIdentity(callback: (err: AWSError, data: DeleteEmailIdentityResponse) -> Unit = definedExternally): Request<DeleteEmailIdentityResponse, AWSError>
    open fun getAccount(params: GetAccountRequest, callback: (err: AWSError, data: GetAccountResponse) -> Unit = definedExternally): Request<GetAccountResponse, AWSError>
    open fun getAccount(callback: (err: AWSError, data: GetAccountResponse) -> Unit = definedExternally): Request<GetAccountResponse, AWSError>
    open fun getBlacklistReports(params: GetBlacklistReportsRequest, callback: (err: AWSError, data: GetBlacklistReportsResponse) -> Unit = definedExternally): Request<GetBlacklistReportsResponse, AWSError>
    open fun getBlacklistReports(callback: (err: AWSError, data: GetBlacklistReportsResponse) -> Unit = definedExternally): Request<GetBlacklistReportsResponse, AWSError>
    open fun getConfigurationSet(params: GetConfigurationSetRequest, callback: (err: AWSError, data: GetConfigurationSetResponse) -> Unit = definedExternally): Request<GetConfigurationSetResponse, AWSError>
    open fun getConfigurationSet(callback: (err: AWSError, data: GetConfigurationSetResponse) -> Unit = definedExternally): Request<GetConfigurationSetResponse, AWSError>
    open fun getConfigurationSetEventDestinations(params: GetConfigurationSetEventDestinationsRequest, callback: (err: AWSError, data: GetConfigurationSetEventDestinationsResponse) -> Unit = definedExternally): Request<GetConfigurationSetEventDestinationsResponse, AWSError>
    open fun getConfigurationSetEventDestinations(callback: (err: AWSError, data: GetConfigurationSetEventDestinationsResponse) -> Unit = definedExternally): Request<GetConfigurationSetEventDestinationsResponse, AWSError>
    open fun getDedicatedIp(params: GetDedicatedIpRequest, callback: (err: AWSError, data: GetDedicatedIpResponse) -> Unit = definedExternally): Request<GetDedicatedIpResponse, AWSError>
    open fun getDedicatedIp(callback: (err: AWSError, data: GetDedicatedIpResponse) -> Unit = definedExternally): Request<GetDedicatedIpResponse, AWSError>
    open fun getDedicatedIps(params: GetDedicatedIpsRequest, callback: (err: AWSError, data: GetDedicatedIpsResponse) -> Unit = definedExternally): Request<GetDedicatedIpsResponse, AWSError>
    open fun getDedicatedIps(callback: (err: AWSError, data: GetDedicatedIpsResponse) -> Unit = definedExternally): Request<GetDedicatedIpsResponse, AWSError>
    open fun getDeliverabilityDashboardOptions(params: GetDeliverabilityDashboardOptionsRequest, callback: (err: AWSError, data: GetDeliverabilityDashboardOptionsResponse) -> Unit = definedExternally): Request<GetDeliverabilityDashboardOptionsResponse, AWSError>
    open fun getDeliverabilityDashboardOptions(callback: (err: AWSError, data: GetDeliverabilityDashboardOptionsResponse) -> Unit = definedExternally): Request<GetDeliverabilityDashboardOptionsResponse, AWSError>
    open fun getDeliverabilityTestReport(params: GetDeliverabilityTestReportRequest, callback: (err: AWSError, data: GetDeliverabilityTestReportResponse) -> Unit = definedExternally): Request<GetDeliverabilityTestReportResponse, AWSError>
    open fun getDeliverabilityTestReport(callback: (err: AWSError, data: GetDeliverabilityTestReportResponse) -> Unit = definedExternally): Request<GetDeliverabilityTestReportResponse, AWSError>
    open fun getDomainDeliverabilityCampaign(params: GetDomainDeliverabilityCampaignRequest, callback: (err: AWSError, data: GetDomainDeliverabilityCampaignResponse) -> Unit = definedExternally): Request<GetDomainDeliverabilityCampaignResponse, AWSError>
    open fun getDomainDeliverabilityCampaign(callback: (err: AWSError, data: GetDomainDeliverabilityCampaignResponse) -> Unit = definedExternally): Request<GetDomainDeliverabilityCampaignResponse, AWSError>
    open fun getDomainStatisticsReport(params: GetDomainStatisticsReportRequest, callback: (err: AWSError, data: GetDomainStatisticsReportResponse) -> Unit = definedExternally): Request<GetDomainStatisticsReportResponse, AWSError>
    open fun getDomainStatisticsReport(callback: (err: AWSError, data: GetDomainStatisticsReportResponse) -> Unit = definedExternally): Request<GetDomainStatisticsReportResponse, AWSError>
    open fun getEmailIdentity(params: GetEmailIdentityRequest, callback: (err: AWSError, data: GetEmailIdentityResponse) -> Unit = definedExternally): Request<GetEmailIdentityResponse, AWSError>
    open fun getEmailIdentity(callback: (err: AWSError, data: GetEmailIdentityResponse) -> Unit = definedExternally): Request<GetEmailIdentityResponse, AWSError>
    open fun listConfigurationSets(params: ListConfigurationSetsRequest, callback: (err: AWSError, data: ListConfigurationSetsResponse) -> Unit = definedExternally): Request<ListConfigurationSetsResponse, AWSError>
    open fun listConfigurationSets(callback: (err: AWSError, data: ListConfigurationSetsResponse) -> Unit = definedExternally): Request<ListConfigurationSetsResponse, AWSError>
    open fun listDedicatedIpPools(params: ListDedicatedIpPoolsRequest, callback: (err: AWSError, data: ListDedicatedIpPoolsResponse) -> Unit = definedExternally): Request<ListDedicatedIpPoolsResponse, AWSError>
    open fun listDedicatedIpPools(callback: (err: AWSError, data: ListDedicatedIpPoolsResponse) -> Unit = definedExternally): Request<ListDedicatedIpPoolsResponse, AWSError>
    open fun listDeliverabilityTestReports(params: ListDeliverabilityTestReportsRequest, callback: (err: AWSError, data: ListDeliverabilityTestReportsResponse) -> Unit = definedExternally): Request<ListDeliverabilityTestReportsResponse, AWSError>
    open fun listDeliverabilityTestReports(callback: (err: AWSError, data: ListDeliverabilityTestReportsResponse) -> Unit = definedExternally): Request<ListDeliverabilityTestReportsResponse, AWSError>
    open fun listDomainDeliverabilityCampaigns(params: ListDomainDeliverabilityCampaignsRequest, callback: (err: AWSError, data: ListDomainDeliverabilityCampaignsResponse) -> Unit = definedExternally): Request<ListDomainDeliverabilityCampaignsResponse, AWSError>
    open fun listDomainDeliverabilityCampaigns(callback: (err: AWSError, data: ListDomainDeliverabilityCampaignsResponse) -> Unit = definedExternally): Request<ListDomainDeliverabilityCampaignsResponse, AWSError>
    open fun listEmailIdentities(params: ListEmailIdentitiesRequest, callback: (err: AWSError, data: ListEmailIdentitiesResponse) -> Unit = definedExternally): Request<ListEmailIdentitiesResponse, AWSError>
    open fun listEmailIdentities(callback: (err: AWSError, data: ListEmailIdentitiesResponse) -> Unit = definedExternally): Request<ListEmailIdentitiesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putAccountDedicatedIpWarmupAttributes(params: PutAccountDedicatedIpWarmupAttributesRequest, callback: (err: AWSError, data: PutAccountDedicatedIpWarmupAttributesResponse) -> Unit = definedExternally): Request<PutAccountDedicatedIpWarmupAttributesResponse, AWSError>
    open fun putAccountDedicatedIpWarmupAttributes(callback: (err: AWSError, data: PutAccountDedicatedIpWarmupAttributesResponse) -> Unit = definedExternally): Request<PutAccountDedicatedIpWarmupAttributesResponse, AWSError>
    open fun putAccountSendingAttributes(params: PutAccountSendingAttributesRequest, callback: (err: AWSError, data: PutAccountSendingAttributesResponse) -> Unit = definedExternally): Request<PutAccountSendingAttributesResponse, AWSError>
    open fun putAccountSendingAttributes(callback: (err: AWSError, data: PutAccountSendingAttributesResponse) -> Unit = definedExternally): Request<PutAccountSendingAttributesResponse, AWSError>
    open fun putConfigurationSetDeliveryOptions(params: PutConfigurationSetDeliveryOptionsRequest, callback: (err: AWSError, data: PutConfigurationSetDeliveryOptionsResponse) -> Unit = definedExternally): Request<PutConfigurationSetDeliveryOptionsResponse, AWSError>
    open fun putConfigurationSetDeliveryOptions(callback: (err: AWSError, data: PutConfigurationSetDeliveryOptionsResponse) -> Unit = definedExternally): Request<PutConfigurationSetDeliveryOptionsResponse, AWSError>
    open fun putConfigurationSetReputationOptions(params: PutConfigurationSetReputationOptionsRequest, callback: (err: AWSError, data: PutConfigurationSetReputationOptionsResponse) -> Unit = definedExternally): Request<PutConfigurationSetReputationOptionsResponse, AWSError>
    open fun putConfigurationSetReputationOptions(callback: (err: AWSError, data: PutConfigurationSetReputationOptionsResponse) -> Unit = definedExternally): Request<PutConfigurationSetReputationOptionsResponse, AWSError>
    open fun putConfigurationSetSendingOptions(params: PutConfigurationSetSendingOptionsRequest, callback: (err: AWSError, data: PutConfigurationSetSendingOptionsResponse) -> Unit = definedExternally): Request<PutConfigurationSetSendingOptionsResponse, AWSError>
    open fun putConfigurationSetSendingOptions(callback: (err: AWSError, data: PutConfigurationSetSendingOptionsResponse) -> Unit = definedExternally): Request<PutConfigurationSetSendingOptionsResponse, AWSError>
    open fun putConfigurationSetTrackingOptions(params: PutConfigurationSetTrackingOptionsRequest, callback: (err: AWSError, data: PutConfigurationSetTrackingOptionsResponse) -> Unit = definedExternally): Request<PutConfigurationSetTrackingOptionsResponse, AWSError>
    open fun putConfigurationSetTrackingOptions(callback: (err: AWSError, data: PutConfigurationSetTrackingOptionsResponse) -> Unit = definedExternally): Request<PutConfigurationSetTrackingOptionsResponse, AWSError>
    open fun putDedicatedIpInPool(params: PutDedicatedIpInPoolRequest, callback: (err: AWSError, data: PutDedicatedIpInPoolResponse) -> Unit = definedExternally): Request<PutDedicatedIpInPoolResponse, AWSError>
    open fun putDedicatedIpInPool(callback: (err: AWSError, data: PutDedicatedIpInPoolResponse) -> Unit = definedExternally): Request<PutDedicatedIpInPoolResponse, AWSError>
    open fun putDedicatedIpWarmupAttributes(params: PutDedicatedIpWarmupAttributesRequest, callback: (err: AWSError, data: PutDedicatedIpWarmupAttributesResponse) -> Unit = definedExternally): Request<PutDedicatedIpWarmupAttributesResponse, AWSError>
    open fun putDedicatedIpWarmupAttributes(callback: (err: AWSError, data: PutDedicatedIpWarmupAttributesResponse) -> Unit = definedExternally): Request<PutDedicatedIpWarmupAttributesResponse, AWSError>
    open fun putDeliverabilityDashboardOption(params: PutDeliverabilityDashboardOptionRequest, callback: (err: AWSError, data: PutDeliverabilityDashboardOptionResponse) -> Unit = definedExternally): Request<PutDeliverabilityDashboardOptionResponse, AWSError>
    open fun putDeliverabilityDashboardOption(callback: (err: AWSError, data: PutDeliverabilityDashboardOptionResponse) -> Unit = definedExternally): Request<PutDeliverabilityDashboardOptionResponse, AWSError>
    open fun putEmailIdentityDkimAttributes(params: PutEmailIdentityDkimAttributesRequest, callback: (err: AWSError, data: PutEmailIdentityDkimAttributesResponse) -> Unit = definedExternally): Request<PutEmailIdentityDkimAttributesResponse, AWSError>
    open fun putEmailIdentityDkimAttributes(callback: (err: AWSError, data: PutEmailIdentityDkimAttributesResponse) -> Unit = definedExternally): Request<PutEmailIdentityDkimAttributesResponse, AWSError>
    open fun putEmailIdentityFeedbackAttributes(params: PutEmailIdentityFeedbackAttributesRequest, callback: (err: AWSError, data: PutEmailIdentityFeedbackAttributesResponse) -> Unit = definedExternally): Request<PutEmailIdentityFeedbackAttributesResponse, AWSError>
    open fun putEmailIdentityFeedbackAttributes(callback: (err: AWSError, data: PutEmailIdentityFeedbackAttributesResponse) -> Unit = definedExternally): Request<PutEmailIdentityFeedbackAttributesResponse, AWSError>
    open fun putEmailIdentityMailFromAttributes(params: PutEmailIdentityMailFromAttributesRequest, callback: (err: AWSError, data: PutEmailIdentityMailFromAttributesResponse) -> Unit = definedExternally): Request<PutEmailIdentityMailFromAttributesResponse, AWSError>
    open fun putEmailIdentityMailFromAttributes(callback: (err: AWSError, data: PutEmailIdentityMailFromAttributesResponse) -> Unit = definedExternally): Request<PutEmailIdentityMailFromAttributesResponse, AWSError>
    open fun sendEmail(params: SendEmailRequest, callback: (err: AWSError, data: SendEmailResponse) -> Unit = definedExternally): Request<SendEmailResponse, AWSError>
    open fun sendEmail(callback: (err: AWSError, data: SendEmailResponse) -> Unit = definedExternally): Request<SendEmailResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest, callback: (err: AWSError, data: UpdateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<UpdateConfigurationSetEventDestinationResponse, AWSError>
    open fun updateConfigurationSetEventDestination(callback: (err: AWSError, data: UpdateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<UpdateConfigurationSetEventDestinationResponse, AWSError>
    interface BlacklistEntry {
        var RblName: RblName?
            get() = definedExternally
            set(value) = definedExternally
        var ListingTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: BlacklistingDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BlacklistReport {
        @nativeGetter
        operator fun get(key: String): BlacklistEntries?
        @nativeSetter
        operator fun set(key: String, value: BlacklistEntries)
    }
    interface Body {
        var Text: Content?
            get() = definedExternally
            set(value) = definedExternally
        var Html: Content?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchDestination {
        var DimensionConfigurations: CloudWatchDimensionConfigurations
    }
    interface CloudWatchDimensionConfiguration {
        var DimensionName: DimensionName
        var DimensionValueSource: String /* "MESSAGE_TAG" | "EMAIL_HEADER" | "LINK_TAG" | String */
        var DefaultDimensionValue: DefaultDimensionValue
    }
    interface Content {
        var Data: MessageData
        var Charset: Charset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationSetEventDestinationRequest {
        var ConfigurationSetName: ConfigurationSetName
        var EventDestinationName: EventDestinationName
        var EventDestination: EventDestinationDefinition
    }
    interface CreateConfigurationSetEventDestinationResponse
    interface CreateConfigurationSetRequest {
        var ConfigurationSetName: ConfigurationSetName
        var TrackingOptions: TrackingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryOptions: DeliveryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var ReputationOptions: ReputationOptions?
            get() = definedExternally
            set(value) = definedExternally
        var SendingOptions: SendingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationSetResponse
    interface CreateDedicatedIpPoolRequest {
        var PoolName: PoolName
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDedicatedIpPoolResponse
    interface CreateDeliverabilityTestReportRequest {
        var ReportName: ReportName?
            get() = definedExternally
            set(value) = definedExternally
        var FromEmailAddress: EmailAddress
        var Content: EmailContent
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeliverabilityTestReportResponse {
        var ReportId: ReportId
        var DeliverabilityTestStatus: String /* "IN_PROGRESS" | "COMPLETED" | String */
    }
    interface CreateEmailIdentityRequest {
        var EmailIdentity: Identity
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEmailIdentityResponse {
        var IdentityType: String /* "EMAIL_ADDRESS" | "DOMAIN" | "MANAGED_DOMAIN" | String */
        var VerifiedForSendingStatus: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var DkimAttributes: DkimAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DailyVolume {
        var StartDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeStatistics: VolumeStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIspPlacements: DomainIspPlacements?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DedicatedIp {
        var Ip: Ip
        var WarmupStatus: String /* "IN_PROGRESS" | "DONE" | String */
        var WarmupPercentage: Percentage100Wrapper
        var PoolName: PoolName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteConfigurationSetEventDestinationRequest {
        var ConfigurationSetName: ConfigurationSetName
        var EventDestinationName: EventDestinationName
    }
    interface DeleteConfigurationSetEventDestinationResponse
    interface DeleteConfigurationSetRequest {
        var ConfigurationSetName: ConfigurationSetName
    }
    interface DeleteConfigurationSetResponse
    interface DeleteDedicatedIpPoolRequest {
        var PoolName: PoolName
    }
    interface DeleteDedicatedIpPoolResponse
    interface DeleteEmailIdentityRequest {
        var EmailIdentity: Identity
    }
    interface DeleteEmailIdentityResponse
    interface DeliverabilityTestReport {
        var ReportId: ReportId?
            get() = definedExternally
            set(value) = definedExternally
        var ReportName: ReportName?
            get() = definedExternally
            set(value) = definedExternally
        var Subject: DeliverabilityTestSubject?
            get() = definedExternally
            set(value) = definedExternally
        var FromEmailAddress: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeliverabilityTestStatus: String /* "IN_PROGRESS" | "COMPLETED" | String */
    }
    interface DeliveryOptions {
        var TlsPolicy: String /* "REQUIRE" | "OPTIONAL" | String */
        var SendingPoolName: PoolName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Destination {
        var ToAddresses: EmailAddressList?
            get() = definedExternally
            set(value) = definedExternally
        var CcAddresses: EmailAddressList?
            get() = definedExternally
            set(value) = definedExternally
        var BccAddresses: EmailAddressList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DkimAttributes {
        var SigningEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "SUCCESS" | "FAILED" | "TEMPORARY_FAILURE" | "NOT_STARTED" | String */
        var Tokens: DnsTokenList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainDeliverabilityCampaign {
        var CampaignId: CampaignId?
            get() = definedExternally
            set(value) = definedExternally
        var ImageUrl: ImageUrl?
            get() = definedExternally
            set(value) = definedExternally
        var Subject: Subject?
            get() = definedExternally
            set(value) = definedExternally
        var FromAddress: Identity?
            get() = definedExternally
            set(value) = definedExternally
        var SendingIps: IpList?
            get() = definedExternally
            set(value) = definedExternally
        var FirstSeenDateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastSeenDateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InboxCount: Volume?
            get() = definedExternally
            set(value) = definedExternally
        var SpamCount: Volume?
            get() = definedExternally
            set(value) = definedExternally
        var ReadRate: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteRate: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var ReadDeleteRate: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var ProjectedVolume: Volume?
            get() = definedExternally
            set(value) = definedExternally
        var Esps: Esps?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainDeliverabilityTrackingOption {
        var Domain: Domain?
            get() = definedExternally
            set(value) = definedExternally
        var SubscriptionStartDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InboxPlacementTrackingOption: InboxPlacementTrackingOption?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainIspPlacement {
        var IspName: IspName?
            get() = definedExternally
            set(value) = definedExternally
        var InboxRawCount: Volume?
            get() = definedExternally
            set(value) = definedExternally
        var SpamRawCount: Volume?
            get() = definedExternally
            set(value) = definedExternally
        var InboxPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var SpamPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EmailContent {
        var Simple: Message?
            get() = definedExternally
            set(value) = definedExternally
        var Raw: RawMessage?
            get() = definedExternally
            set(value) = definedExternally
        var Template: Template?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventDestination {
        var Name: EventDestinationName
        var Enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var MatchingEventTypes: EventTypes
        var KinesisFirehoseDestination: KinesisFirehoseDestination?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchDestination: CloudWatchDestination?
            get() = definedExternally
            set(value) = definedExternally
        var SnsDestination: SnsDestination?
            get() = definedExternally
            set(value) = definedExternally
        var PinpointDestination: PinpointDestination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventDestinationDefinition {
        var Enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var MatchingEventTypes: EventTypes?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisFirehoseDestination: KinesisFirehoseDestination?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchDestination: CloudWatchDestination?
            get() = definedExternally
            set(value) = definedExternally
        var SnsDestination: SnsDestination?
            get() = definedExternally
            set(value) = definedExternally
        var PinpointDestination: PinpointDestination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccountRequest
    interface GetAccountResponse {
        var SendQuota: SendQuota?
            get() = definedExternally
            set(value) = definedExternally
        var SendingEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var DedicatedIpAutoWarmupEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var EnforcementStatus: GeneralEnforcementStatus?
            get() = definedExternally
            set(value) = definedExternally
        var ProductionAccessEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBlacklistReportsRequest {
        var BlacklistItemNames: BlacklistItemNames
    }
    interface GetBlacklistReportsResponse {
        var BlacklistReport: BlacklistReport
    }
    interface GetConfigurationSetEventDestinationsRequest {
        var ConfigurationSetName: ConfigurationSetName
    }
    interface GetConfigurationSetEventDestinationsResponse {
        var EventDestinations: EventDestinations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConfigurationSetRequest {
        var ConfigurationSetName: ConfigurationSetName
    }
    interface GetConfigurationSetResponse {
        var ConfigurationSetName: ConfigurationSetName?
            get() = definedExternally
            set(value) = definedExternally
        var TrackingOptions: TrackingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryOptions: DeliveryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var ReputationOptions: ReputationOptions?
            get() = definedExternally
            set(value) = definedExternally
        var SendingOptions: SendingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDedicatedIpRequest {
        var Ip: Ip
    }
    interface GetDedicatedIpResponse {
        var DedicatedIp: DedicatedIp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDedicatedIpsRequest {
        var PoolName: PoolName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDedicatedIpsResponse {
        var DedicatedIps: DedicatedIpList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeliverabilityDashboardOptionsRequest
    interface GetDeliverabilityDashboardOptionsResponse {
        var DashboardEnabled: Enabled
        var SubscriptionExpiryDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AccountStatus: String /* "ACTIVE" | "PENDING_EXPIRATION" | "DISABLED" | String */
        var ActiveSubscribedDomains: DomainDeliverabilityTrackingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var PendingExpirationSubscribedDomains: DomainDeliverabilityTrackingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeliverabilityTestReportRequest {
        var ReportId: ReportId
    }
    interface GetDeliverabilityTestReportResponse {
        var DeliverabilityTestReport: DeliverabilityTestReport
        var OverallPlacement: PlacementStatistics
        var IspPlacements: IspPlacements
        var Message: MessageContent?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDomainDeliverabilityCampaignRequest {
        var CampaignId: CampaignId
    }
    interface GetDomainDeliverabilityCampaignResponse {
        var DomainDeliverabilityCampaign: DomainDeliverabilityCampaign
    }
    interface GetDomainStatisticsReportRequest {
        var Domain: Identity
        var StartDate: Timestamp
        var EndDate: Timestamp
    }
    interface GetDomainStatisticsReportResponse {
        var OverallVolume: OverallVolume
        var DailyVolumes: DailyVolumes
    }
    interface GetEmailIdentityRequest {
        var EmailIdentity: Identity
    }
    interface GetEmailIdentityResponse {
        var IdentityType: String /* "EMAIL_ADDRESS" | "DOMAIN" | "MANAGED_DOMAIN" | String */
        var FeedbackForwardingStatus: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var VerifiedForSendingStatus: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var DkimAttributes: DkimAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var MailFromAttributes: MailFromAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityInfo {
        var IdentityType: String /* "EMAIL_ADDRESS" | "DOMAIN" | "MANAGED_DOMAIN" | String */
        var IdentityName: Identity?
            get() = definedExternally
            set(value) = definedExternally
        var SendingEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InboxPlacementTrackingOption {
        var Global: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var TrackedIsps: IspNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IspPlacement {
        var IspName: IspName?
            get() = definedExternally
            set(value) = definedExternally
        var PlacementStatistics: PlacementStatistics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisFirehoseDestination {
        var IamRoleArn: AmazonResourceName
        var DeliveryStreamArn: AmazonResourceName
    }
    interface ListConfigurationSetsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationSetsResponse {
        var ConfigurationSets: ConfigurationSetNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDedicatedIpPoolsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDedicatedIpPoolsResponse {
        var DedicatedIpPools: ListOfDedicatedIpPools?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeliverabilityTestReportsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeliverabilityTestReportsResponse {
        var DeliverabilityTestReports: DeliverabilityTestReports
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainDeliverabilityCampaignsRequest {
        var StartDate: Timestamp
        var EndDate: Timestamp
        var SubscribedDomain: Domain
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainDeliverabilityCampaignsResponse {
        var DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEmailIdentitiesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEmailIdentitiesResponse {
        var EmailIdentities: IdentityInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: AmazonResourceName
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList
    }
    interface MailFromAttributes {
        var MailFromDomain: MailFromDomainName
        var MailFromDomainStatus: String /* "PENDING" | "SUCCESS" | "FAILED" | "TEMPORARY_FAILURE" | String */
        var BehaviorOnMxFailure: String /* "USE_DEFAULT_VALUE" | "REJECT_MESSAGE" | String */
    }
    interface Message {
        var Subject: Content
        var Body: Body
    }
    interface MessageTag {
        var Name: MessageTagName
        var Value: MessageTagValue
    }
    interface OverallVolume {
        var VolumeStatistics: VolumeStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var ReadRatePercent: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var DomainIspPlacements: DomainIspPlacements?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PinpointDestination {
        var ApplicationArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlacementStatistics {
        var InboxPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var SpamPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var MissingPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var SpfPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var DkimPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAccountDedicatedIpWarmupAttributesRequest {
        var AutoWarmupEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAccountDedicatedIpWarmupAttributesResponse
    interface PutAccountSendingAttributesRequest {
        var SendingEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAccountSendingAttributesResponse
    interface PutConfigurationSetDeliveryOptionsRequest {
        var ConfigurationSetName: ConfigurationSetName
        var TlsPolicy: String /* "REQUIRE" | "OPTIONAL" | String */
        var SendingPoolName: SendingPoolName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConfigurationSetDeliveryOptionsResponse
    interface PutConfigurationSetReputationOptionsRequest {
        var ConfigurationSetName: ConfigurationSetName
        var ReputationMetricsEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConfigurationSetReputationOptionsResponse
    interface PutConfigurationSetSendingOptionsRequest {
        var ConfigurationSetName: ConfigurationSetName
        var SendingEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConfigurationSetSendingOptionsResponse
    interface PutConfigurationSetTrackingOptionsRequest {
        var ConfigurationSetName: ConfigurationSetName
        var CustomRedirectDomain: CustomRedirectDomain?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConfigurationSetTrackingOptionsResponse
    interface PutDedicatedIpInPoolRequest {
        var Ip: Ip
        var DestinationPoolName: PoolName
    }
    interface PutDedicatedIpInPoolResponse
    interface PutDedicatedIpWarmupAttributesRequest {
        var Ip: Ip
        var WarmupPercentage: Percentage100Wrapper
    }
    interface PutDedicatedIpWarmupAttributesResponse
    interface PutDeliverabilityDashboardOptionRequest {
        var DashboardEnabled: Enabled
        var SubscribedDomains: DomainDeliverabilityTrackingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutDeliverabilityDashboardOptionResponse
    interface PutEmailIdentityDkimAttributesRequest {
        var EmailIdentity: Identity
        var SigningEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutEmailIdentityDkimAttributesResponse
    interface PutEmailIdentityFeedbackAttributesRequest {
        var EmailIdentity: Identity
        var EmailForwardingEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutEmailIdentityFeedbackAttributesResponse
    interface PutEmailIdentityMailFromAttributesRequest {
        var EmailIdentity: Identity
        var MailFromDomain: MailFromDomainName?
            get() = definedExternally
            set(value) = definedExternally
        var BehaviorOnMxFailure: String /* "USE_DEFAULT_VALUE" | "REJECT_MESSAGE" | String */
    }
    interface PutEmailIdentityMailFromAttributesResponse
    interface RawMessage {
        var Data: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReputationOptions {
        var ReputationMetricsEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var LastFreshStart: LastFreshStart?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendEmailRequest {
        var FromEmailAddress: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var Destination: Destination
        var ReplyToAddresses: EmailAddressList?
            get() = definedExternally
            set(value) = definedExternally
        var FeedbackForwardingEmailAddress: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var Content: EmailContent
        var EmailTags: MessageTagList?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationSetName: ConfigurationSetName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendEmailResponse {
        var MessageId: OutboundMessageId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendQuota {
        var Max24HourSend: Max24HourSend?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSendRate: MaxSendRate?
            get() = definedExternally
            set(value) = definedExternally
        var SentLast24Hours: SentLast24Hours?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendingOptions {
        var SendingEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnsDestination {
        var TopicArn: AmazonResourceName
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceArn: AmazonResourceName
        var Tags: TagList
    }
    interface TagResourceResponse
    interface Template {
        var TemplateArn: TemplateArn?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateData: TemplateData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrackingOptions {
        var CustomRedirectDomain: CustomRedirectDomain
    }
    interface UntagResourceRequest {
        var ResourceArn: AmazonResourceName
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateConfigurationSetEventDestinationRequest {
        var ConfigurationSetName: ConfigurationSetName
        var EventDestinationName: EventDestinationName
        var EventDestination: EventDestinationDefinition
    }
    interface UpdateConfigurationSetEventDestinationResponse
    interface VolumeStatistics {
        var InboxRawCount: Volume?
            get() = definedExternally
            set(value) = definedExternally
        var SpamRawCount: Volume?
            get() = definedExternally
            set(value) = definedExternally
        var ProjectedInbox: Volume?
            get() = definedExternally
            set(value) = definedExternally
        var ProjectedSpam: Volume?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-07-26" | "latest" | String */
    }
}