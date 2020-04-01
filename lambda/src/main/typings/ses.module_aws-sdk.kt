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
import SES.BouncedRecipientInfo
import SES.BulkEmailDestination
import SES.BulkEmailDestinationStatus
import SES.CloudWatchDimensionConfiguration
import SES.ConfigurationSet
import SES.CustomVerificationEmailTemplate
import SES.EventDestination
import SES.ExtensionField
import SES.MessageTag
import SES.ReceiptAction
import SES.ReceiptFilter
import SES.ReceiptRuleSetMetadata
import SES.ReceiptRule
import SES.SendDataPoint
import SES.TemplateMetadata
import SES.CloneReceiptRuleSetRequest
import SES.CloneReceiptRuleSetResponse
import SES.CreateConfigurationSetRequest
import SES.CreateConfigurationSetResponse
import SES.CreateConfigurationSetEventDestinationRequest
import SES.CreateConfigurationSetEventDestinationResponse
import SES.CreateConfigurationSetTrackingOptionsRequest
import SES.CreateConfigurationSetTrackingOptionsResponse
import SES.CreateCustomVerificationEmailTemplateRequest
import SES.CreateReceiptFilterRequest
import SES.CreateReceiptFilterResponse
import SES.CreateReceiptRuleRequest
import SES.CreateReceiptRuleResponse
import SES.CreateReceiptRuleSetRequest
import SES.CreateReceiptRuleSetResponse
import SES.CreateTemplateRequest
import SES.CreateTemplateResponse
import SES.DeleteConfigurationSetRequest
import SES.DeleteConfigurationSetResponse
import SES.DeleteConfigurationSetEventDestinationRequest
import SES.DeleteConfigurationSetEventDestinationResponse
import SES.DeleteConfigurationSetTrackingOptionsRequest
import SES.DeleteConfigurationSetTrackingOptionsResponse
import SES.DeleteCustomVerificationEmailTemplateRequest
import SES.DeleteIdentityRequest
import SES.DeleteIdentityResponse
import SES.DeleteIdentityPolicyRequest
import SES.DeleteIdentityPolicyResponse
import SES.DeleteReceiptFilterRequest
import SES.DeleteReceiptFilterResponse
import SES.DeleteReceiptRuleRequest
import SES.DeleteReceiptRuleResponse
import SES.DeleteReceiptRuleSetRequest
import SES.DeleteReceiptRuleSetResponse
import SES.DeleteTemplateRequest
import SES.DeleteTemplateResponse
import SES.DeleteVerifiedEmailAddressRequest
import SES.DescribeActiveReceiptRuleSetRequest
import SES.DescribeActiveReceiptRuleSetResponse
import SES.DescribeConfigurationSetRequest
import SES.DescribeConfigurationSetResponse
import SES.DescribeReceiptRuleRequest
import SES.DescribeReceiptRuleResponse
import SES.DescribeReceiptRuleSetRequest
import SES.DescribeReceiptRuleSetResponse
import SES.GetAccountSendingEnabledResponse
import SES.GetCustomVerificationEmailTemplateRequest
import SES.GetCustomVerificationEmailTemplateResponse
import SES.GetIdentityDkimAttributesRequest
import SES.GetIdentityDkimAttributesResponse
import SES.GetIdentityMailFromDomainAttributesRequest
import SES.GetIdentityMailFromDomainAttributesResponse
import SES.GetIdentityNotificationAttributesRequest
import SES.GetIdentityNotificationAttributesResponse
import SES.GetIdentityPoliciesRequest
import SES.GetIdentityPoliciesResponse
import SES.GetIdentityVerificationAttributesRequest
import SES.GetIdentityVerificationAttributesResponse
import SES.GetSendQuotaResponse
import SES.GetSendStatisticsResponse
import SES.GetTemplateRequest
import SES.GetTemplateResponse
import SES.ListConfigurationSetsRequest
import SES.ListConfigurationSetsResponse
import SES.ListCustomVerificationEmailTemplatesRequest
import SES.ListCustomVerificationEmailTemplatesResponse
import SES.ListIdentitiesRequest
import SES.ListIdentitiesResponse
import SES.ListIdentityPoliciesRequest
import SES.ListIdentityPoliciesResponse
import SES.ListReceiptFiltersRequest
import SES.ListReceiptFiltersResponse
import SES.ListReceiptRuleSetsRequest
import SES.ListReceiptRuleSetsResponse
import SES.ListTemplatesRequest
import SES.ListTemplatesResponse
import SES.ListVerifiedEmailAddressesResponse
import SES.PutConfigurationSetDeliveryOptionsRequest
import SES.PutConfigurationSetDeliveryOptionsResponse
import SES.PutIdentityPolicyRequest
import SES.PutIdentityPolicyResponse
import SES.ReorderReceiptRuleSetRequest
import SES.ReorderReceiptRuleSetResponse
import SES.SendBounceRequest
import SES.SendBounceResponse
import SES.SendBulkTemplatedEmailRequest
import SES.SendBulkTemplatedEmailResponse
import SES.SendCustomVerificationEmailRequest
import SES.SendCustomVerificationEmailResponse
import SES.SendEmailRequest
import SES.SendEmailResponse
import SES.SendRawEmailRequest
import SES.SendRawEmailResponse
import SES.SendTemplatedEmailRequest
import SES.SendTemplatedEmailResponse
import SES.SetActiveReceiptRuleSetRequest
import SES.SetActiveReceiptRuleSetResponse
import SES.SetIdentityDkimEnabledRequest
import SES.SetIdentityDkimEnabledResponse
import SES.SetIdentityFeedbackForwardingEnabledRequest
import SES.SetIdentityFeedbackForwardingEnabledResponse
import SES.SetIdentityHeadersInNotificationsEnabledRequest
import SES.SetIdentityHeadersInNotificationsEnabledResponse
import SES.SetIdentityMailFromDomainRequest
import SES.SetIdentityMailFromDomainResponse
import SES.SetIdentityNotificationTopicRequest
import SES.SetIdentityNotificationTopicResponse
import SES.SetReceiptRulePositionRequest
import SES.SetReceiptRulePositionResponse
import SES.TestRenderTemplateRequest
import SES.TestRenderTemplateResponse
import SES.UpdateAccountSendingEnabledRequest
import SES.UpdateConfigurationSetEventDestinationRequest
import SES.UpdateConfigurationSetEventDestinationResponse
import SES.UpdateConfigurationSetReputationMetricsEnabledRequest
import SES.UpdateConfigurationSetSendingEnabledRequest
import SES.UpdateConfigurationSetTrackingOptionsRequest
import SES.UpdateConfigurationSetTrackingOptionsResponse
import SES.UpdateCustomVerificationEmailTemplateRequest
import SES.UpdateReceiptRuleRequest
import SES.UpdateReceiptRuleResponse
import SES.UpdateTemplateRequest
import SES.UpdateTemplateResponse
import SES.VerifyDomainDkimRequest
import SES.VerifyDomainDkimResponse
import SES.VerifyDomainIdentityRequest
import SES.VerifyDomainIdentityResponse
import SES.VerifyEmailAddressRequest
import SES.VerifyEmailIdentityRequest
import SES.VerifyEmailIdentityResponse
import SES.Content
import SES.RecipientDsnFields
import SES.Destination
import SES.TrackingOptions
import SES.Template
import SES.DeliveryOptions
import SES.ReputationOptions
import SES.IdentityDkimAttributes
import SES.KinesisFirehoseDestination
import SES.CloudWatchDestination
import SES.SNSDestination
import SES.DkimAttributes
import SES.MailFromDomainAttributes
import SES.NotificationAttributes
import SES.PolicyMap
import SES.VerificationAttributes
import SES.IdentityMailFromDomainAttributes
import SES.Body
import SES.IdentityNotificationAttributes
import SES.S3Action
import SES.BounceAction
import SES.WorkmailAction
import SES.LambdaAction
import SES.StopAction
import SES.AddHeaderAction
import SES.SNSAction
import SES.ReceiptIpFilter
import SES.MessageDsn
import SES.Message
import SES.RawMessage
import SES.IdentityVerificationAttributes

typealias Address = String

typealias AddressList = Array<Address>

typealias AmazonResourceName = String

typealias ArrivalDate = Date

typealias BounceMessage = String

typealias BounceSmtpReplyCode = String

typealias BounceStatusCode = String

typealias BouncedRecipientInfoList = Array<BouncedRecipientInfo>

typealias BulkEmailDestinationList = Array<BulkEmailDestination>

typealias BulkEmailDestinationStatusList = Array<BulkEmailDestinationStatus>

typealias Charset = String

typealias Cidr = String

typealias CloudWatchDimensionConfigurations = Array<CloudWatchDimensionConfiguration>

typealias ConfigurationSetAttributeList = Array<String /* "eventDestinations" | "trackingOptions" | "deliveryOptions" | "reputationOptions" | String */>

typealias ConfigurationSetName = String

typealias ConfigurationSets = Array<ConfigurationSet>

typealias Counter = Number

typealias CustomRedirectDomain = String

typealias CustomVerificationEmailTemplates = Array<CustomVerificationEmailTemplate>

typealias DefaultDimensionValue = String

typealias DiagnosticCode = String

typealias DimensionName = String

typealias Domain = String

typealias DsnStatus = String

typealias Enabled = Boolean

typealias Error = String

typealias EventDestinationName = String

typealias EventDestinations = Array<EventDestination>

typealias EventTypes = Array<String /* "send" | "reject" | "bounce" | "complaint" | "delivery" | "open" | "click" | "renderingFailure" | String */>

typealias Explanation = String

typealias ExtensionFieldList = Array<ExtensionField>

typealias ExtensionFieldName = String

typealias ExtensionFieldValue = String

typealias FailureRedirectionURL = String

typealias FromAddress = String

typealias HeaderName = String

typealias HeaderValue = String

typealias HtmlPart = String

typealias Identity = String

typealias IdentityList = Array<Identity>

typealias LastAttemptDate = Date

typealias LastFreshStart = Date

typealias MailFromDomainName = String

typealias Max24HourSend = Number

typealias MaxItems = Number

typealias MaxResults = Number

typealias MaxSendRate = Number

typealias MessageData = String

typealias MessageId = String

typealias MessageTagList = Array<MessageTag>

typealias MessageTagName = String

typealias MessageTagValue = String

typealias NextToken = String

typealias NotificationTopic = String

typealias Policy = String

typealias PolicyName = String

typealias PolicyNameList = Array<PolicyName>

typealias ReceiptActionsList = Array<ReceiptAction>

typealias ReceiptFilterList = Array<ReceiptFilter>

typealias ReceiptFilterName = String

typealias ReceiptRuleName = String

typealias ReceiptRuleNamesList = Array<ReceiptRuleName>

typealias ReceiptRuleSetName = String

typealias ReceiptRuleSetsLists = Array<ReceiptRuleSetMetadata>

typealias ReceiptRulesList = Array<ReceiptRule>

typealias Recipient = String

typealias RecipientsList = Array<Recipient>

typealias RemoteMta = String

typealias RenderedTemplate = String

typealias ReportingMta = String

typealias S3BucketName = String

typealias S3KeyPrefix = String

typealias SendDataPointList = Array<SendDataPoint>

typealias SentLast24Hours = Number

typealias Subject = String

typealias SubjectPart = String

typealias SuccessRedirectionURL = String

typealias TemplateContent = String

typealias TemplateData = String

typealias TemplateMetadataList = Array<TemplateMetadata>

typealias TemplateName = String

typealias TextPart = String

typealias Timestamp = Date

typealias VerificationToken = String

typealias VerificationTokenList = Array<VerificationToken>

@JsModule("aws-sdk")
external open class SES(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SES.Types.ClientConfiguration */
    open fun cloneReceiptRuleSet(params: CloneReceiptRuleSetRequest, callback: (err: AWSError, data: CloneReceiptRuleSetResponse) -> Unit = definedExternally): Request<CloneReceiptRuleSetResponse, AWSError>
    open fun cloneReceiptRuleSet(callback: (err: AWSError, data: CloneReceiptRuleSetResponse) -> Unit = definedExternally): Request<CloneReceiptRuleSetResponse, AWSError>
    open fun createConfigurationSet(params: CreateConfigurationSetRequest, callback: (err: AWSError, data: CreateConfigurationSetResponse) -> Unit = definedExternally): Request<CreateConfigurationSetResponse, AWSError>
    open fun createConfigurationSet(callback: (err: AWSError, data: CreateConfigurationSetResponse) -> Unit = definedExternally): Request<CreateConfigurationSetResponse, AWSError>
    open fun createConfigurationSetEventDestination(params: CreateConfigurationSetEventDestinationRequest, callback: (err: AWSError, data: CreateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<CreateConfigurationSetEventDestinationResponse, AWSError>
    open fun createConfigurationSetEventDestination(callback: (err: AWSError, data: CreateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<CreateConfigurationSetEventDestinationResponse, AWSError>
    open fun createConfigurationSetTrackingOptions(params: CreateConfigurationSetTrackingOptionsRequest, callback: (err: AWSError, data: CreateConfigurationSetTrackingOptionsResponse) -> Unit = definedExternally): Request<CreateConfigurationSetTrackingOptionsResponse, AWSError>
    open fun createConfigurationSetTrackingOptions(callback: (err: AWSError, data: CreateConfigurationSetTrackingOptionsResponse) -> Unit = definedExternally): Request<CreateConfigurationSetTrackingOptionsResponse, AWSError>
    open fun createCustomVerificationEmailTemplate(params: CreateCustomVerificationEmailTemplateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createCustomVerificationEmailTemplate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createReceiptFilter(params: CreateReceiptFilterRequest, callback: (err: AWSError, data: CreateReceiptFilterResponse) -> Unit = definedExternally): Request<CreateReceiptFilterResponse, AWSError>
    open fun createReceiptFilter(callback: (err: AWSError, data: CreateReceiptFilterResponse) -> Unit = definedExternally): Request<CreateReceiptFilterResponse, AWSError>
    open fun createReceiptRule(params: CreateReceiptRuleRequest, callback: (err: AWSError, data: CreateReceiptRuleResponse) -> Unit = definedExternally): Request<CreateReceiptRuleResponse, AWSError>
    open fun createReceiptRule(callback: (err: AWSError, data: CreateReceiptRuleResponse) -> Unit = definedExternally): Request<CreateReceiptRuleResponse, AWSError>
    open fun createReceiptRuleSet(params: CreateReceiptRuleSetRequest, callback: (err: AWSError, data: CreateReceiptRuleSetResponse) -> Unit = definedExternally): Request<CreateReceiptRuleSetResponse, AWSError>
    open fun createReceiptRuleSet(callback: (err: AWSError, data: CreateReceiptRuleSetResponse) -> Unit = definedExternally): Request<CreateReceiptRuleSetResponse, AWSError>
    open fun createTemplate(params: CreateTemplateRequest, callback: (err: AWSError, data: CreateTemplateResponse) -> Unit = definedExternally): Request<CreateTemplateResponse, AWSError>
    open fun createTemplate(callback: (err: AWSError, data: CreateTemplateResponse) -> Unit = definedExternally): Request<CreateTemplateResponse, AWSError>
    open fun deleteConfigurationSet(params: DeleteConfigurationSetRequest, callback: (err: AWSError, data: DeleteConfigurationSetResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetResponse, AWSError>
    open fun deleteConfigurationSet(callback: (err: AWSError, data: DeleteConfigurationSetResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetResponse, AWSError>
    open fun deleteConfigurationSetEventDestination(params: DeleteConfigurationSetEventDestinationRequest, callback: (err: AWSError, data: DeleteConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetEventDestinationResponse, AWSError>
    open fun deleteConfigurationSetEventDestination(callback: (err: AWSError, data: DeleteConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetEventDestinationResponse, AWSError>
    open fun deleteConfigurationSetTrackingOptions(params: DeleteConfigurationSetTrackingOptionsRequest, callback: (err: AWSError, data: DeleteConfigurationSetTrackingOptionsResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetTrackingOptionsResponse, AWSError>
    open fun deleteConfigurationSetTrackingOptions(callback: (err: AWSError, data: DeleteConfigurationSetTrackingOptionsResponse) -> Unit = definedExternally): Request<DeleteConfigurationSetTrackingOptionsResponse, AWSError>
    open fun deleteCustomVerificationEmailTemplate(params: DeleteCustomVerificationEmailTemplateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCustomVerificationEmailTemplate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIdentity(params: DeleteIdentityRequest, callback: (err: AWSError, data: DeleteIdentityResponse) -> Unit = definedExternally): Request<DeleteIdentityResponse, AWSError>
    open fun deleteIdentity(callback: (err: AWSError, data: DeleteIdentityResponse) -> Unit = definedExternally): Request<DeleteIdentityResponse, AWSError>
    open fun deleteIdentityPolicy(params: DeleteIdentityPolicyRequest, callback: (err: AWSError, data: DeleteIdentityPolicyResponse) -> Unit = definedExternally): Request<DeleteIdentityPolicyResponse, AWSError>
    open fun deleteIdentityPolicy(callback: (err: AWSError, data: DeleteIdentityPolicyResponse) -> Unit = definedExternally): Request<DeleteIdentityPolicyResponse, AWSError>
    open fun deleteReceiptFilter(params: DeleteReceiptFilterRequest, callback: (err: AWSError, data: DeleteReceiptFilterResponse) -> Unit = definedExternally): Request<DeleteReceiptFilterResponse, AWSError>
    open fun deleteReceiptFilter(callback: (err: AWSError, data: DeleteReceiptFilterResponse) -> Unit = definedExternally): Request<DeleteReceiptFilterResponse, AWSError>
    open fun deleteReceiptRule(params: DeleteReceiptRuleRequest, callback: (err: AWSError, data: DeleteReceiptRuleResponse) -> Unit = definedExternally): Request<DeleteReceiptRuleResponse, AWSError>
    open fun deleteReceiptRule(callback: (err: AWSError, data: DeleteReceiptRuleResponse) -> Unit = definedExternally): Request<DeleteReceiptRuleResponse, AWSError>
    open fun deleteReceiptRuleSet(params: DeleteReceiptRuleSetRequest, callback: (err: AWSError, data: DeleteReceiptRuleSetResponse) -> Unit = definedExternally): Request<DeleteReceiptRuleSetResponse, AWSError>
    open fun deleteReceiptRuleSet(callback: (err: AWSError, data: DeleteReceiptRuleSetResponse) -> Unit = definedExternally): Request<DeleteReceiptRuleSetResponse, AWSError>
    open fun deleteTemplate(params: DeleteTemplateRequest, callback: (err: AWSError, data: DeleteTemplateResponse) -> Unit = definedExternally): Request<DeleteTemplateResponse, AWSError>
    open fun deleteTemplate(callback: (err: AWSError, data: DeleteTemplateResponse) -> Unit = definedExternally): Request<DeleteTemplateResponse, AWSError>
    open fun deleteVerifiedEmailAddress(params: DeleteVerifiedEmailAddressRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVerifiedEmailAddress(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeActiveReceiptRuleSet(params: DescribeActiveReceiptRuleSetRequest, callback: (err: AWSError, data: DescribeActiveReceiptRuleSetResponse) -> Unit = definedExternally): Request<DescribeActiveReceiptRuleSetResponse, AWSError>
    open fun describeActiveReceiptRuleSet(callback: (err: AWSError, data: DescribeActiveReceiptRuleSetResponse) -> Unit = definedExternally): Request<DescribeActiveReceiptRuleSetResponse, AWSError>
    open fun describeConfigurationSet(params: DescribeConfigurationSetRequest, callback: (err: AWSError, data: DescribeConfigurationSetResponse) -> Unit = definedExternally): Request<DescribeConfigurationSetResponse, AWSError>
    open fun describeConfigurationSet(callback: (err: AWSError, data: DescribeConfigurationSetResponse) -> Unit = definedExternally): Request<DescribeConfigurationSetResponse, AWSError>
    open fun describeReceiptRule(params: DescribeReceiptRuleRequest, callback: (err: AWSError, data: DescribeReceiptRuleResponse) -> Unit = definedExternally): Request<DescribeReceiptRuleResponse, AWSError>
    open fun describeReceiptRule(callback: (err: AWSError, data: DescribeReceiptRuleResponse) -> Unit = definedExternally): Request<DescribeReceiptRuleResponse, AWSError>
    open fun describeReceiptRuleSet(params: DescribeReceiptRuleSetRequest, callback: (err: AWSError, data: DescribeReceiptRuleSetResponse) -> Unit = definedExternally): Request<DescribeReceiptRuleSetResponse, AWSError>
    open fun describeReceiptRuleSet(callback: (err: AWSError, data: DescribeReceiptRuleSetResponse) -> Unit = definedExternally): Request<DescribeReceiptRuleSetResponse, AWSError>
    open fun getAccountSendingEnabled(callback: (err: AWSError, data: GetAccountSendingEnabledResponse) -> Unit = definedExternally): Request<GetAccountSendingEnabledResponse, AWSError>
    open fun getCustomVerificationEmailTemplate(params: GetCustomVerificationEmailTemplateRequest, callback: (err: AWSError, data: GetCustomVerificationEmailTemplateResponse) -> Unit = definedExternally): Request<GetCustomVerificationEmailTemplateResponse, AWSError>
    open fun getCustomVerificationEmailTemplate(callback: (err: AWSError, data: GetCustomVerificationEmailTemplateResponse) -> Unit = definedExternally): Request<GetCustomVerificationEmailTemplateResponse, AWSError>
    open fun getIdentityDkimAttributes(params: GetIdentityDkimAttributesRequest, callback: (err: AWSError, data: GetIdentityDkimAttributesResponse) -> Unit = definedExternally): Request<GetIdentityDkimAttributesResponse, AWSError>
    open fun getIdentityDkimAttributes(callback: (err: AWSError, data: GetIdentityDkimAttributesResponse) -> Unit = definedExternally): Request<GetIdentityDkimAttributesResponse, AWSError>
    open fun getIdentityMailFromDomainAttributes(params: GetIdentityMailFromDomainAttributesRequest, callback: (err: AWSError, data: GetIdentityMailFromDomainAttributesResponse) -> Unit = definedExternally): Request<GetIdentityMailFromDomainAttributesResponse, AWSError>
    open fun getIdentityMailFromDomainAttributes(callback: (err: AWSError, data: GetIdentityMailFromDomainAttributesResponse) -> Unit = definedExternally): Request<GetIdentityMailFromDomainAttributesResponse, AWSError>
    open fun getIdentityNotificationAttributes(params: GetIdentityNotificationAttributesRequest, callback: (err: AWSError, data: GetIdentityNotificationAttributesResponse) -> Unit = definedExternally): Request<GetIdentityNotificationAttributesResponse, AWSError>
    open fun getIdentityNotificationAttributes(callback: (err: AWSError, data: GetIdentityNotificationAttributesResponse) -> Unit = definedExternally): Request<GetIdentityNotificationAttributesResponse, AWSError>
    open fun getIdentityPolicies(params: GetIdentityPoliciesRequest, callback: (err: AWSError, data: GetIdentityPoliciesResponse) -> Unit = definedExternally): Request<GetIdentityPoliciesResponse, AWSError>
    open fun getIdentityPolicies(callback: (err: AWSError, data: GetIdentityPoliciesResponse) -> Unit = definedExternally): Request<GetIdentityPoliciesResponse, AWSError>
    open fun getIdentityVerificationAttributes(params: GetIdentityVerificationAttributesRequest, callback: (err: AWSError, data: GetIdentityVerificationAttributesResponse) -> Unit = definedExternally): Request<GetIdentityVerificationAttributesResponse, AWSError>
    open fun getIdentityVerificationAttributes(callback: (err: AWSError, data: GetIdentityVerificationAttributesResponse) -> Unit = definedExternally): Request<GetIdentityVerificationAttributesResponse, AWSError>
    open fun getSendQuota(callback: (err: AWSError, data: GetSendQuotaResponse) -> Unit = definedExternally): Request<GetSendQuotaResponse, AWSError>
    open fun getSendStatistics(callback: (err: AWSError, data: GetSendStatisticsResponse) -> Unit = definedExternally): Request<GetSendStatisticsResponse, AWSError>
    open fun getTemplate(params: GetTemplateRequest, callback: (err: AWSError, data: GetTemplateResponse) -> Unit = definedExternally): Request<GetTemplateResponse, AWSError>
    open fun getTemplate(callback: (err: AWSError, data: GetTemplateResponse) -> Unit = definedExternally): Request<GetTemplateResponse, AWSError>
    open fun listConfigurationSets(params: ListConfigurationSetsRequest, callback: (err: AWSError, data: ListConfigurationSetsResponse) -> Unit = definedExternally): Request<ListConfigurationSetsResponse, AWSError>
    open fun listConfigurationSets(callback: (err: AWSError, data: ListConfigurationSetsResponse) -> Unit = definedExternally): Request<ListConfigurationSetsResponse, AWSError>
    open fun listCustomVerificationEmailTemplates(params: ListCustomVerificationEmailTemplatesRequest, callback: (err: AWSError, data: ListCustomVerificationEmailTemplatesResponse) -> Unit = definedExternally): Request<ListCustomVerificationEmailTemplatesResponse, AWSError>
    open fun listCustomVerificationEmailTemplates(callback: (err: AWSError, data: ListCustomVerificationEmailTemplatesResponse) -> Unit = definedExternally): Request<ListCustomVerificationEmailTemplatesResponse, AWSError>
    open fun listIdentities(params: ListIdentitiesRequest, callback: (err: AWSError, data: ListIdentitiesResponse) -> Unit = definedExternally): Request<ListIdentitiesResponse, AWSError>
    open fun listIdentities(callback: (err: AWSError, data: ListIdentitiesResponse) -> Unit = definedExternally): Request<ListIdentitiesResponse, AWSError>
    open fun listIdentityPolicies(params: ListIdentityPoliciesRequest, callback: (err: AWSError, data: ListIdentityPoliciesResponse) -> Unit = definedExternally): Request<ListIdentityPoliciesResponse, AWSError>
    open fun listIdentityPolicies(callback: (err: AWSError, data: ListIdentityPoliciesResponse) -> Unit = definedExternally): Request<ListIdentityPoliciesResponse, AWSError>
    open fun listReceiptFilters(params: ListReceiptFiltersRequest, callback: (err: AWSError, data: ListReceiptFiltersResponse) -> Unit = definedExternally): Request<ListReceiptFiltersResponse, AWSError>
    open fun listReceiptFilters(callback: (err: AWSError, data: ListReceiptFiltersResponse) -> Unit = definedExternally): Request<ListReceiptFiltersResponse, AWSError>
    open fun listReceiptRuleSets(params: ListReceiptRuleSetsRequest, callback: (err: AWSError, data: ListReceiptRuleSetsResponse) -> Unit = definedExternally): Request<ListReceiptRuleSetsResponse, AWSError>
    open fun listReceiptRuleSets(callback: (err: AWSError, data: ListReceiptRuleSetsResponse) -> Unit = definedExternally): Request<ListReceiptRuleSetsResponse, AWSError>
    open fun listTemplates(params: ListTemplatesRequest, callback: (err: AWSError, data: ListTemplatesResponse) -> Unit = definedExternally): Request<ListTemplatesResponse, AWSError>
    open fun listTemplates(callback: (err: AWSError, data: ListTemplatesResponse) -> Unit = definedExternally): Request<ListTemplatesResponse, AWSError>
    open fun listVerifiedEmailAddresses(callback: (err: AWSError, data: ListVerifiedEmailAddressesResponse) -> Unit = definedExternally): Request<ListVerifiedEmailAddressesResponse, AWSError>
    open fun putConfigurationSetDeliveryOptions(params: PutConfigurationSetDeliveryOptionsRequest, callback: (err: AWSError, data: PutConfigurationSetDeliveryOptionsResponse) -> Unit = definedExternally): Request<PutConfigurationSetDeliveryOptionsResponse, AWSError>
    open fun putConfigurationSetDeliveryOptions(callback: (err: AWSError, data: PutConfigurationSetDeliveryOptionsResponse) -> Unit = definedExternally): Request<PutConfigurationSetDeliveryOptionsResponse, AWSError>
    open fun putIdentityPolicy(params: PutIdentityPolicyRequest, callback: (err: AWSError, data: PutIdentityPolicyResponse) -> Unit = definedExternally): Request<PutIdentityPolicyResponse, AWSError>
    open fun putIdentityPolicy(callback: (err: AWSError, data: PutIdentityPolicyResponse) -> Unit = definedExternally): Request<PutIdentityPolicyResponse, AWSError>
    open fun reorderReceiptRuleSet(params: ReorderReceiptRuleSetRequest, callback: (err: AWSError, data: ReorderReceiptRuleSetResponse) -> Unit = definedExternally): Request<ReorderReceiptRuleSetResponse, AWSError>
    open fun reorderReceiptRuleSet(callback: (err: AWSError, data: ReorderReceiptRuleSetResponse) -> Unit = definedExternally): Request<ReorderReceiptRuleSetResponse, AWSError>
    open fun sendBounce(params: SendBounceRequest, callback: (err: AWSError, data: SendBounceResponse) -> Unit = definedExternally): Request<SendBounceResponse, AWSError>
    open fun sendBounce(callback: (err: AWSError, data: SendBounceResponse) -> Unit = definedExternally): Request<SendBounceResponse, AWSError>
    open fun sendBulkTemplatedEmail(params: SendBulkTemplatedEmailRequest, callback: (err: AWSError, data: SendBulkTemplatedEmailResponse) -> Unit = definedExternally): Request<SendBulkTemplatedEmailResponse, AWSError>
    open fun sendBulkTemplatedEmail(callback: (err: AWSError, data: SendBulkTemplatedEmailResponse) -> Unit = definedExternally): Request<SendBulkTemplatedEmailResponse, AWSError>
    open fun sendCustomVerificationEmail(params: SendCustomVerificationEmailRequest, callback: (err: AWSError, data: SendCustomVerificationEmailResponse) -> Unit = definedExternally): Request<SendCustomVerificationEmailResponse, AWSError>
    open fun sendCustomVerificationEmail(callback: (err: AWSError, data: SendCustomVerificationEmailResponse) -> Unit = definedExternally): Request<SendCustomVerificationEmailResponse, AWSError>
    open fun sendEmail(params: SendEmailRequest, callback: (err: AWSError, data: SendEmailResponse) -> Unit = definedExternally): Request<SendEmailResponse, AWSError>
    open fun sendEmail(callback: (err: AWSError, data: SendEmailResponse) -> Unit = definedExternally): Request<SendEmailResponse, AWSError>
    open fun sendRawEmail(params: SendRawEmailRequest, callback: (err: AWSError, data: SendRawEmailResponse) -> Unit = definedExternally): Request<SendRawEmailResponse, AWSError>
    open fun sendRawEmail(callback: (err: AWSError, data: SendRawEmailResponse) -> Unit = definedExternally): Request<SendRawEmailResponse, AWSError>
    open fun sendTemplatedEmail(params: SendTemplatedEmailRequest, callback: (err: AWSError, data: SendTemplatedEmailResponse) -> Unit = definedExternally): Request<SendTemplatedEmailResponse, AWSError>
    open fun sendTemplatedEmail(callback: (err: AWSError, data: SendTemplatedEmailResponse) -> Unit = definedExternally): Request<SendTemplatedEmailResponse, AWSError>
    open fun setActiveReceiptRuleSet(params: SetActiveReceiptRuleSetRequest, callback: (err: AWSError, data: SetActiveReceiptRuleSetResponse) -> Unit = definedExternally): Request<SetActiveReceiptRuleSetResponse, AWSError>
    open fun setActiveReceiptRuleSet(callback: (err: AWSError, data: SetActiveReceiptRuleSetResponse) -> Unit = definedExternally): Request<SetActiveReceiptRuleSetResponse, AWSError>
    open fun setIdentityDkimEnabled(params: SetIdentityDkimEnabledRequest, callback: (err: AWSError, data: SetIdentityDkimEnabledResponse) -> Unit = definedExternally): Request<SetIdentityDkimEnabledResponse, AWSError>
    open fun setIdentityDkimEnabled(callback: (err: AWSError, data: SetIdentityDkimEnabledResponse) -> Unit = definedExternally): Request<SetIdentityDkimEnabledResponse, AWSError>
    open fun setIdentityFeedbackForwardingEnabled(params: SetIdentityFeedbackForwardingEnabledRequest, callback: (err: AWSError, data: SetIdentityFeedbackForwardingEnabledResponse) -> Unit = definedExternally): Request<SetIdentityFeedbackForwardingEnabledResponse, AWSError>
    open fun setIdentityFeedbackForwardingEnabled(callback: (err: AWSError, data: SetIdentityFeedbackForwardingEnabledResponse) -> Unit = definedExternally): Request<SetIdentityFeedbackForwardingEnabledResponse, AWSError>
    open fun setIdentityHeadersInNotificationsEnabled(params: SetIdentityHeadersInNotificationsEnabledRequest, callback: (err: AWSError, data: SetIdentityHeadersInNotificationsEnabledResponse) -> Unit = definedExternally): Request<SetIdentityHeadersInNotificationsEnabledResponse, AWSError>
    open fun setIdentityHeadersInNotificationsEnabled(callback: (err: AWSError, data: SetIdentityHeadersInNotificationsEnabledResponse) -> Unit = definedExternally): Request<SetIdentityHeadersInNotificationsEnabledResponse, AWSError>
    open fun setIdentityMailFromDomain(params: SetIdentityMailFromDomainRequest, callback: (err: AWSError, data: SetIdentityMailFromDomainResponse) -> Unit = definedExternally): Request<SetIdentityMailFromDomainResponse, AWSError>
    open fun setIdentityMailFromDomain(callback: (err: AWSError, data: SetIdentityMailFromDomainResponse) -> Unit = definedExternally): Request<SetIdentityMailFromDomainResponse, AWSError>
    open fun setIdentityNotificationTopic(params: SetIdentityNotificationTopicRequest, callback: (err: AWSError, data: SetIdentityNotificationTopicResponse) -> Unit = definedExternally): Request<SetIdentityNotificationTopicResponse, AWSError>
    open fun setIdentityNotificationTopic(callback: (err: AWSError, data: SetIdentityNotificationTopicResponse) -> Unit = definedExternally): Request<SetIdentityNotificationTopicResponse, AWSError>
    open fun setReceiptRulePosition(params: SetReceiptRulePositionRequest, callback: (err: AWSError, data: SetReceiptRulePositionResponse) -> Unit = definedExternally): Request<SetReceiptRulePositionResponse, AWSError>
    open fun setReceiptRulePosition(callback: (err: AWSError, data: SetReceiptRulePositionResponse) -> Unit = definedExternally): Request<SetReceiptRulePositionResponse, AWSError>
    open fun testRenderTemplate(params: TestRenderTemplateRequest, callback: (err: AWSError, data: TestRenderTemplateResponse) -> Unit = definedExternally): Request<TestRenderTemplateResponse, AWSError>
    open fun testRenderTemplate(callback: (err: AWSError, data: TestRenderTemplateResponse) -> Unit = definedExternally): Request<TestRenderTemplateResponse, AWSError>
    open fun updateAccountSendingEnabled(params: UpdateAccountSendingEnabledRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAccountSendingEnabled(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateConfigurationSetEventDestination(params: UpdateConfigurationSetEventDestinationRequest, callback: (err: AWSError, data: UpdateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<UpdateConfigurationSetEventDestinationResponse, AWSError>
    open fun updateConfigurationSetEventDestination(callback: (err: AWSError, data: UpdateConfigurationSetEventDestinationResponse) -> Unit = definedExternally): Request<UpdateConfigurationSetEventDestinationResponse, AWSError>
    open fun updateConfigurationSetReputationMetricsEnabled(params: UpdateConfigurationSetReputationMetricsEnabledRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateConfigurationSetReputationMetricsEnabled(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateConfigurationSetSendingEnabled(params: UpdateConfigurationSetSendingEnabledRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateConfigurationSetSendingEnabled(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateConfigurationSetTrackingOptions(params: UpdateConfigurationSetTrackingOptionsRequest, callback: (err: AWSError, data: UpdateConfigurationSetTrackingOptionsResponse) -> Unit = definedExternally): Request<UpdateConfigurationSetTrackingOptionsResponse, AWSError>
    open fun updateConfigurationSetTrackingOptions(callback: (err: AWSError, data: UpdateConfigurationSetTrackingOptionsResponse) -> Unit = definedExternally): Request<UpdateConfigurationSetTrackingOptionsResponse, AWSError>
    open fun updateCustomVerificationEmailTemplate(params: UpdateCustomVerificationEmailTemplateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateCustomVerificationEmailTemplate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateReceiptRule(params: UpdateReceiptRuleRequest, callback: (err: AWSError, data: UpdateReceiptRuleResponse) -> Unit = definedExternally): Request<UpdateReceiptRuleResponse, AWSError>
    open fun updateReceiptRule(callback: (err: AWSError, data: UpdateReceiptRuleResponse) -> Unit = definedExternally): Request<UpdateReceiptRuleResponse, AWSError>
    open fun updateTemplate(params: UpdateTemplateRequest, callback: (err: AWSError, data: UpdateTemplateResponse) -> Unit = definedExternally): Request<UpdateTemplateResponse, AWSError>
    open fun updateTemplate(callback: (err: AWSError, data: UpdateTemplateResponse) -> Unit = definedExternally): Request<UpdateTemplateResponse, AWSError>
    open fun verifyDomainDkim(params: VerifyDomainDkimRequest, callback: (err: AWSError, data: VerifyDomainDkimResponse) -> Unit = definedExternally): Request<VerifyDomainDkimResponse, AWSError>
    open fun verifyDomainDkim(callback: (err: AWSError, data: VerifyDomainDkimResponse) -> Unit = definedExternally): Request<VerifyDomainDkimResponse, AWSError>
    open fun verifyDomainIdentity(params: VerifyDomainIdentityRequest, callback: (err: AWSError, data: VerifyDomainIdentityResponse) -> Unit = definedExternally): Request<VerifyDomainIdentityResponse, AWSError>
    open fun verifyDomainIdentity(callback: (err: AWSError, data: VerifyDomainIdentityResponse) -> Unit = definedExternally): Request<VerifyDomainIdentityResponse, AWSError>
    open fun verifyEmailAddress(params: VerifyEmailAddressRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun verifyEmailAddress(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun verifyEmailIdentity(params: VerifyEmailIdentityRequest, callback: (err: AWSError, data: VerifyEmailIdentityResponse) -> Unit = definedExternally): Request<VerifyEmailIdentityResponse, AWSError>
    open fun verifyEmailIdentity(callback: (err: AWSError, data: VerifyEmailIdentityResponse) -> Unit = definedExternally): Request<VerifyEmailIdentityResponse, AWSError>
    open fun waitFor(state: String /* "identityExists" */, params: GetIdentityVerificationAttributesRequest /* SES.Types.GetIdentityVerificationAttributesRequest & `T$0` */, callback: (err: AWSError, data: GetIdentityVerificationAttributesResponse) -> Unit = definedExternally): Request<GetIdentityVerificationAttributesResponse, AWSError>
    open fun waitFor(state: String /* "identityExists" */, callback: (err: AWSError, data: GetIdentityVerificationAttributesResponse) -> Unit = definedExternally): Request<GetIdentityVerificationAttributesResponse, AWSError>
    interface AddHeaderAction {
        var HeaderName: HeaderName
        var HeaderValue: HeaderValue
    }
    interface Body {
        var Text: Content?
            get() = definedExternally
            set(value) = definedExternally
        var Html: Content?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BounceAction {
        var TopicArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var SmtpReplyCode: BounceSmtpReplyCode
        var StatusCode: BounceStatusCode?
            get() = definedExternally
            set(value) = definedExternally
        var Message: BounceMessage
        var Sender: Address
    }
    interface BouncedRecipientInfo {
        var Recipient: Address
        var RecipientArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var BounceType: String /* "DoesNotExist" | "MessageTooLarge" | "ExceededQuota" | "ContentRejected" | "Undefined" | "TemporaryFailure" | String */
        var RecipientDsnFields: RecipientDsnFields?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BulkEmailDestination {
        var Destination: Destination
        var ReplacementTags: MessageTagList?
            get() = definedExternally
            set(value) = definedExternally
        var ReplacementTemplateData: TemplateData?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BulkEmailDestinationStatus {
        var Status: String /* "Success" | "MessageRejected" | "MailFromDomainNotVerified" | "ConfigurationSetDoesNotExist" | "TemplateDoesNotExist" | "AccountSuspended" | "AccountThrottled" | "AccountDailyQuotaExceeded" | "InvalidSendingPoolName" | "AccountSendingPaused" | "ConfigurationSetSendingPaused" | "InvalidParameterValue" | "TransientFailure" | "Failed" | String */
        var Error: Error?
            get() = definedExternally
            set(value) = definedExternally
        var MessageId: MessageId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloneReceiptRuleSetRequest {
        var RuleSetName: ReceiptRuleSetName
        var OriginalRuleSetName: ReceiptRuleSetName
    }
    interface CloneReceiptRuleSetResponse
    interface CloudWatchDestination {
        var DimensionConfigurations: CloudWatchDimensionConfigurations
    }
    interface CloudWatchDimensionConfiguration {
        var DimensionName: DimensionName
        var DimensionValueSource: String /* "messageTag" | "emailHeader" | "linkTag" | String */
        var DefaultDimensionValue: DefaultDimensionValue
    }
    interface ConfigurationSet {
        var Name: ConfigurationSetName
    }
    interface Content {
        var Data: MessageData
        var Charset: Charset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationSetEventDestinationRequest {
        var ConfigurationSetName: ConfigurationSetName
        var EventDestination: EventDestination
    }
    interface CreateConfigurationSetEventDestinationResponse
    interface CreateConfigurationSetRequest {
        var ConfigurationSet: ConfigurationSet
    }
    interface CreateConfigurationSetResponse
    interface CreateConfigurationSetTrackingOptionsRequest {
        var ConfigurationSetName: ConfigurationSetName
        var TrackingOptions: TrackingOptions
    }
    interface CreateConfigurationSetTrackingOptionsResponse
    interface CreateCustomVerificationEmailTemplateRequest {
        var TemplateName: TemplateName
        var FromEmailAddress: FromAddress
        var TemplateSubject: Subject
        var TemplateContent: TemplateContent
        var SuccessRedirectionURL: SuccessRedirectionURL
        var FailureRedirectionURL: FailureRedirectionURL
    }
    interface CreateReceiptFilterRequest {
        var Filter: ReceiptFilter
    }
    interface CreateReceiptFilterResponse
    interface CreateReceiptRuleRequest {
        var RuleSetName: ReceiptRuleSetName
        var After: ReceiptRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var Rule: ReceiptRule
    }
    interface CreateReceiptRuleResponse
    interface CreateReceiptRuleSetRequest {
        var RuleSetName: ReceiptRuleSetName
    }
    interface CreateReceiptRuleSetResponse
    interface CreateTemplateRequest {
        var Template: Template
    }
    interface CreateTemplateResponse
    interface CustomVerificationEmailTemplate {
        var TemplateName: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var FromEmailAddress: FromAddress?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSubject: Subject?
            get() = definedExternally
            set(value) = definedExternally
        var SuccessRedirectionURL: SuccessRedirectionURL?
            get() = definedExternally
            set(value) = definedExternally
        var FailureRedirectionURL: FailureRedirectionURL?
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
    interface DeleteConfigurationSetTrackingOptionsRequest {
        var ConfigurationSetName: ConfigurationSetName
    }
    interface DeleteConfigurationSetTrackingOptionsResponse
    interface DeleteCustomVerificationEmailTemplateRequest {
        var TemplateName: TemplateName
    }
    interface DeleteIdentityPolicyRequest {
        var Identity: Identity
        var PolicyName: PolicyName
    }
    interface DeleteIdentityPolicyResponse
    interface DeleteIdentityRequest {
        var Identity: Identity
    }
    interface DeleteIdentityResponse
    interface DeleteReceiptFilterRequest {
        var FilterName: ReceiptFilterName
    }
    interface DeleteReceiptFilterResponse
    interface DeleteReceiptRuleRequest {
        var RuleSetName: ReceiptRuleSetName
        var RuleName: ReceiptRuleName
    }
    interface DeleteReceiptRuleResponse
    interface DeleteReceiptRuleSetRequest {
        var RuleSetName: ReceiptRuleSetName
    }
    interface DeleteReceiptRuleSetResponse
    interface DeleteTemplateRequest {
        var TemplateName: TemplateName
    }
    interface DeleteTemplateResponse
    interface DeleteVerifiedEmailAddressRequest {
        var EmailAddress: Address
    }
    interface DeliveryOptions {
        var TlsPolicy: String /* "Require" | "Optional" | String */
    }
    interface DescribeActiveReceiptRuleSetRequest
    interface DescribeActiveReceiptRuleSetResponse {
        var Metadata: ReceiptRuleSetMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: ReceiptRulesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationSetRequest {
        var ConfigurationSetName: ConfigurationSetName
        var ConfigurationSetAttributeNames: ConfigurationSetAttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationSetResponse {
        var ConfigurationSet: ConfigurationSet?
            get() = definedExternally
            set(value) = definedExternally
        var EventDestinations: EventDestinations?
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
    }
    interface DescribeReceiptRuleRequest {
        var RuleSetName: ReceiptRuleSetName
        var RuleName: ReceiptRuleName
    }
    interface DescribeReceiptRuleResponse {
        var Rule: ReceiptRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReceiptRuleSetRequest {
        var RuleSetName: ReceiptRuleSetName
    }
    interface DescribeReceiptRuleSetResponse {
        var Metadata: ReceiptRuleSetMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var Rules: ReceiptRulesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Destination {
        var ToAddresses: AddressList?
            get() = definedExternally
            set(value) = definedExternally
        var CcAddresses: AddressList?
            get() = definedExternally
            set(value) = definedExternally
        var BccAddresses: AddressList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DkimAttributes {
        @nativeGetter
        operator fun get(key: String): IdentityDkimAttributes?
        @nativeSetter
        operator fun set(key: String, value: IdentityDkimAttributes)
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
        var SNSDestination: SNSDestination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExtensionField {
        var Name: ExtensionFieldName
        var Value: ExtensionFieldValue
    }
    interface GetAccountSendingEnabledResponse {
        var Enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCustomVerificationEmailTemplateRequest {
        var TemplateName: TemplateName
    }
    interface GetCustomVerificationEmailTemplateResponse {
        var TemplateName: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var FromEmailAddress: FromAddress?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSubject: Subject?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateContent: TemplateContent?
            get() = definedExternally
            set(value) = definedExternally
        var SuccessRedirectionURL: SuccessRedirectionURL?
            get() = definedExternally
            set(value) = definedExternally
        var FailureRedirectionURL: FailureRedirectionURL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIdentityDkimAttributesRequest {
        var Identities: IdentityList
    }
    interface GetIdentityDkimAttributesResponse {
        var DkimAttributes: DkimAttributes
    }
    interface GetIdentityMailFromDomainAttributesRequest {
        var Identities: IdentityList
    }
    interface GetIdentityMailFromDomainAttributesResponse {
        var MailFromDomainAttributes: MailFromDomainAttributes
    }
    interface GetIdentityNotificationAttributesRequest {
        var Identities: IdentityList
    }
    interface GetIdentityNotificationAttributesResponse {
        var NotificationAttributes: NotificationAttributes
    }
    interface GetIdentityPoliciesRequest {
        var Identity: Identity
        var PolicyNames: PolicyNameList
    }
    interface GetIdentityPoliciesResponse {
        var Policies: PolicyMap
    }
    interface GetIdentityVerificationAttributesRequest {
        var Identities: IdentityList
    }
    interface GetIdentityVerificationAttributesResponse {
        var VerificationAttributes: VerificationAttributes
    }
    interface GetSendQuotaResponse {
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
    interface GetSendStatisticsResponse {
        var SendDataPoints: SendDataPointList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTemplateRequest {
        var TemplateName: TemplateName
    }
    interface GetTemplateResponse {
        var Template: Template?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityDkimAttributes {
        var DkimEnabled: Enabled
        var DkimVerificationStatus: String /* "Pending" | "Success" | "Failed" | "TemporaryFailure" | "NotStarted" | String */
        var DkimTokens: VerificationTokenList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityMailFromDomainAttributes {
        var MailFromDomain: MailFromDomainName
        var MailFromDomainStatus: String /* "Pending" | "Success" | "Failed" | "TemporaryFailure" | String */
        var BehaviorOnMXFailure: String /* "UseDefaultValue" | "RejectMessage" | String */
    }
    interface IdentityNotificationAttributes {
        var BounceTopic: NotificationTopic
        var ComplaintTopic: NotificationTopic
        var DeliveryTopic: NotificationTopic
        var ForwardingEnabled: Enabled
        var HeadersInBounceNotificationsEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var HeadersInComplaintNotificationsEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var HeadersInDeliveryNotificationsEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityVerificationAttributes {
        var VerificationStatus: String /* "Pending" | "Success" | "Failed" | "TemporaryFailure" | "NotStarted" | String */
        var VerificationToken: VerificationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisFirehoseDestination {
        var IAMRoleARN: AmazonResourceName
        var DeliveryStreamARN: AmazonResourceName
    }
    interface LambdaAction {
        var TopicArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var FunctionArn: AmazonResourceName
        var InvocationType: String /* "Event" | "RequestResponse" | String */
    }
    interface ListConfigurationSetsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationSetsResponse {
        var ConfigurationSets: ConfigurationSets?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCustomVerificationEmailTemplatesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCustomVerificationEmailTemplatesResponse {
        var CustomVerificationEmailTemplates: CustomVerificationEmailTemplates?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIdentitiesRequest {
        var IdentityType: String /* "EmailAddress" | "Domain" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIdentitiesResponse {
        var Identities: IdentityList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIdentityPoliciesRequest {
        var Identity: Identity
    }
    interface ListIdentityPoliciesResponse {
        var PolicyNames: PolicyNameList
    }
    interface ListReceiptFiltersRequest
    interface ListReceiptFiltersResponse {
        var Filters: ReceiptFilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReceiptRuleSetsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListReceiptRuleSetsResponse {
        var RuleSets: ReceiptRuleSetsLists?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTemplatesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: MaxItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTemplatesResponse {
        var TemplatesMetadata: TemplateMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVerifiedEmailAddressesResponse {
        var VerifiedEmailAddresses: AddressList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MailFromDomainAttributes {
        @nativeGetter
        operator fun get(key: String): IdentityMailFromDomainAttributes?
        @nativeSetter
        operator fun set(key: String, value: IdentityMailFromDomainAttributes)
    }
    interface Message {
        var Subject: Content
        var Body: Body
    }
    interface MessageDsn {
        var ReportingMta: ReportingMta
        var ArrivalDate: ArrivalDate?
            get() = definedExternally
            set(value) = definedExternally
        var ExtensionFields: ExtensionFieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MessageTag {
        var Name: MessageTagName
        var Value: MessageTagValue
    }
    interface NotificationAttributes {
        @nativeGetter
        operator fun get(key: String): IdentityNotificationAttributes?
        @nativeSetter
        operator fun set(key: String, value: IdentityNotificationAttributes)
    }
    interface PolicyMap {
        @nativeGetter
        operator fun get(key: String): Policy?
        @nativeSetter
        operator fun set(key: String, value: Policy)
    }
    interface PutConfigurationSetDeliveryOptionsRequest {
        var ConfigurationSetName: ConfigurationSetName
        var DeliveryOptions: DeliveryOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConfigurationSetDeliveryOptionsResponse
    interface PutIdentityPolicyRequest {
        var Identity: Identity
        var PolicyName: PolicyName
        var Policy: Policy
    }
    interface PutIdentityPolicyResponse
    interface RawMessage {
        var Data: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReceiptAction {
        var S3Action: S3Action?
            get() = definedExternally
            set(value) = definedExternally
        var BounceAction: BounceAction?
            get() = definedExternally
            set(value) = definedExternally
        var WorkmailAction: WorkmailAction?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaAction: LambdaAction?
            get() = definedExternally
            set(value) = definedExternally
        var StopAction: StopAction?
            get() = definedExternally
            set(value) = definedExternally
        var AddHeaderAction: AddHeaderAction?
            get() = definedExternally
            set(value) = definedExternally
        var SNSAction: SNSAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReceiptFilter {
        var Name: ReceiptFilterName
        var IpFilter: ReceiptIpFilter
    }
    interface ReceiptIpFilter {
        var Policy: String /* "Block" | "Allow" | String */
        var Cidr: Cidr
    }
    interface ReceiptRule {
        var Name: ReceiptRuleName
        var Enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var TlsPolicy: String /* "Require" | "Optional" | String */
        var Recipients: RecipientsList?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: ReceiptActionsList?
            get() = definedExternally
            set(value) = definedExternally
        var ScanEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReceiptRuleSetMetadata {
        var Name: ReceiptRuleSetName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecipientDsnFields {
        var FinalRecipient: Address?
            get() = definedExternally
            set(value) = definedExternally
        var Action: String /* "failed" | "delayed" | "delivered" | "relayed" | "expanded" | String */
        var RemoteMta: RemoteMta?
            get() = definedExternally
            set(value) = definedExternally
        var Status: DsnStatus
        var DiagnosticCode: DiagnosticCode?
            get() = definedExternally
            set(value) = definedExternally
        var LastAttemptDate: LastAttemptDate?
            get() = definedExternally
            set(value) = definedExternally
        var ExtensionFields: ExtensionFieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReorderReceiptRuleSetRequest {
        var RuleSetName: ReceiptRuleSetName
        var RuleNames: ReceiptRuleNamesList
    }
    interface ReorderReceiptRuleSetResponse
    interface ReputationOptions {
        var SendingEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var ReputationMetricsEnabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var LastFreshStart: LastFreshStart?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Action {
        var TopicArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var BucketName: S3BucketName
        var ObjectKeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SNSAction {
        var TopicArn: AmazonResourceName
        var Encoding: String /* "UTF-8" | "Base64" | String */
    }
    interface SNSDestination {
        var TopicARN: AmazonResourceName
    }
    interface SendBounceRequest {
        var OriginalMessageId: MessageId
        var BounceSender: Address
        var Explanation: Explanation?
            get() = definedExternally
            set(value) = definedExternally
        var MessageDsn: MessageDsn?
            get() = definedExternally
            set(value) = definedExternally
        var BouncedRecipientInfoList: BouncedRecipientInfoList
        var BounceSenderArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendBounceResponse {
        var MessageId: MessageId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendBulkTemplatedEmailRequest {
        var Source: Address
        var SourceArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var ReplyToAddresses: AddressList?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnPath: Address?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnPathArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationSetName: ConfigurationSetName?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultTags: MessageTagList?
            get() = definedExternally
            set(value) = definedExternally
        var Template: TemplateName
        var TemplateArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultTemplateData: TemplateData?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: BulkEmailDestinationList
    }
    interface SendBulkTemplatedEmailResponse {
        var Status: BulkEmailDestinationStatusList
    }
    interface SendCustomVerificationEmailRequest {
        var EmailAddress: Address
        var TemplateName: TemplateName
        var ConfigurationSetName: ConfigurationSetName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendCustomVerificationEmailResponse {
        var MessageId: MessageId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendDataPoint {
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryAttempts: Counter?
            get() = definedExternally
            set(value) = definedExternally
        var Bounces: Counter?
            get() = definedExternally
            set(value) = definedExternally
        var Complaints: Counter?
            get() = definedExternally
            set(value) = definedExternally
        var Rejects: Counter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendEmailRequest {
        var Source: Address
        var Destination: Destination
        var Message: Message
        var ReplyToAddresses: AddressList?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnPath: Address?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnPathArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: MessageTagList?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationSetName: ConfigurationSetName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendEmailResponse {
        var MessageId: MessageId
    }
    interface SendRawEmailRequest {
        var Source: Address?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: AddressList?
            get() = definedExternally
            set(value) = definedExternally
        var RawMessage: RawMessage
        var FromArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnPathArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: MessageTagList?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationSetName: ConfigurationSetName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendRawEmailResponse {
        var MessageId: MessageId
    }
    interface SendTemplatedEmailRequest {
        var Source: Address
        var Destination: Destination
        var ReplyToAddresses: AddressList?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnPath: Address?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnPathArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: MessageTagList?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationSetName: ConfigurationSetName?
            get() = definedExternally
            set(value) = definedExternally
        var Template: TemplateName
        var TemplateArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateData: TemplateData
    }
    interface SendTemplatedEmailResponse {
        var MessageId: MessageId
    }
    interface SetActiveReceiptRuleSetRequest {
        var RuleSetName: ReceiptRuleSetName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetActiveReceiptRuleSetResponse
    interface SetIdentityDkimEnabledRequest {
        var Identity: Identity
        var DkimEnabled: Enabled
    }
    interface SetIdentityDkimEnabledResponse
    interface SetIdentityFeedbackForwardingEnabledRequest {
        var Identity: Identity
        var ForwardingEnabled: Enabled
    }
    interface SetIdentityFeedbackForwardingEnabledResponse
    interface SetIdentityHeadersInNotificationsEnabledRequest {
        var Identity: Identity
        var NotificationType: String /* "Bounce" | "Complaint" | "Delivery" | String */
        var Enabled: Enabled
    }
    interface SetIdentityHeadersInNotificationsEnabledResponse
    interface SetIdentityMailFromDomainRequest {
        var Identity: Identity
        var MailFromDomain: MailFromDomainName?
            get() = definedExternally
            set(value) = definedExternally
        var BehaviorOnMXFailure: String /* "UseDefaultValue" | "RejectMessage" | String */
    }
    interface SetIdentityMailFromDomainResponse
    interface SetIdentityNotificationTopicRequest {
        var Identity: Identity
        var NotificationType: String /* "Bounce" | "Complaint" | "Delivery" | String */
        var SnsTopic: NotificationTopic?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetIdentityNotificationTopicResponse
    interface SetReceiptRulePositionRequest {
        var RuleSetName: ReceiptRuleSetName
        var RuleName: ReceiptRuleName
        var After: ReceiptRuleName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetReceiptRulePositionResponse
    interface StopAction {
        var Scope: String /* "RuleSet" | String */
        var TopicArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Template {
        var TemplateName: TemplateName
        var SubjectPart: SubjectPart?
            get() = definedExternally
            set(value) = definedExternally
        var TextPart: TextPart?
            get() = definedExternally
            set(value) = definedExternally
        var HtmlPart: HtmlPart?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TemplateMetadata {
        var Name: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestRenderTemplateRequest {
        var TemplateName: TemplateName
        var TemplateData: TemplateData
    }
    interface TestRenderTemplateResponse {
        var RenderedTemplate: RenderedTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrackingOptions {
        var CustomRedirectDomain: CustomRedirectDomain?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAccountSendingEnabledRequest {
        var Enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateConfigurationSetEventDestinationRequest {
        var ConfigurationSetName: ConfigurationSetName
        var EventDestination: EventDestination
    }
    interface UpdateConfigurationSetEventDestinationResponse
    interface UpdateConfigurationSetReputationMetricsEnabledRequest {
        var ConfigurationSetName: ConfigurationSetName
        var Enabled: Enabled
    }
    interface UpdateConfigurationSetSendingEnabledRequest {
        var ConfigurationSetName: ConfigurationSetName
        var Enabled: Enabled
    }
    interface UpdateConfigurationSetTrackingOptionsRequest {
        var ConfigurationSetName: ConfigurationSetName
        var TrackingOptions: TrackingOptions
    }
    interface UpdateConfigurationSetTrackingOptionsResponse
    interface UpdateCustomVerificationEmailTemplateRequest {
        var TemplateName: TemplateName
        var FromEmailAddress: FromAddress?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateSubject: Subject?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateContent: TemplateContent?
            get() = definedExternally
            set(value) = definedExternally
        var SuccessRedirectionURL: SuccessRedirectionURL?
            get() = definedExternally
            set(value) = definedExternally
        var FailureRedirectionURL: FailureRedirectionURL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateReceiptRuleRequest {
        var RuleSetName: ReceiptRuleSetName
        var Rule: ReceiptRule
    }
    interface UpdateReceiptRuleResponse
    interface UpdateTemplateRequest {
        var Template: Template
    }
    interface UpdateTemplateResponse
    interface VerificationAttributes {
        @nativeGetter
        operator fun get(key: String): IdentityVerificationAttributes?
        @nativeSetter
        operator fun set(key: String, value: IdentityVerificationAttributes)
    }
    interface VerifyDomainDkimRequest {
        var Domain: Domain
    }
    interface VerifyDomainDkimResponse {
        var DkimTokens: VerificationTokenList
    }
    interface VerifyDomainIdentityRequest {
        var Domain: Domain
    }
    interface VerifyDomainIdentityResponse {
        var VerificationToken: VerificationToken
    }
    interface VerifyEmailAddressRequest {
        var EmailAddress: Address
    }
    interface VerifyEmailIdentityRequest {
        var EmailAddress: Address
    }
    interface VerifyEmailIdentityResponse
    interface WorkmailAction {
        var TopicArn: AmazonResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationArn: AmazonResourceName
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2010-12-01" | "latest" | String */
    }
}