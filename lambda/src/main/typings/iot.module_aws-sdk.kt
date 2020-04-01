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
import Iot.AbortCriteria
import Iot.Action
import Iot.ActiveViolation
import Iot.AssetPropertyValue
import Iot.AuditFinding
import Iot.AuditMitigationActionExecutionMetadata
import Iot.AuditMitigationActionsTaskMetadata
import Iot.AuditTaskMetadata
import Iot.AuthInfo
import Iot.AuthResult
import Iot.AuthorizerSummary
import Iot.Behavior
import Iot.GroupNameAndArn
import Iot.CACertificate
import Iot.Certificate
import Iot.DomainConfigurationSummary
import Iot.EffectivePolicy
import Iot.Field
import Iot.HttpActionHeader
import Iot.JobExecutionSummaryForJob
import Iot.JobExecutionSummaryForThing
import Iot.JobSummary
import Iot.LogTargetConfiguration
import Iot.MitigationActionIdentifier
import Iot.MitigationAction
import Iot.OTAUpdateFile
import Iot.OTAUpdateSummary
import Iot.OutgoingCertificate
import Iot.PercentPair
import Iot.Policy
import Iot.PolicyVersion
import Iot.ProvisioningTemplateSummary
import Iot.ProvisioningTemplateVersionSummary
import Iot.PutAssetPropertyValueEntry
import Iot.RelatedResource
import Iot.ScheduledAuditMetadata
import Iot.SecurityProfileIdentifier
import Iot.SecurityProfileTargetMapping
import Iot.SecurityProfileTarget
import Iot.ServerCertificateSummary
import Iot.StreamFile
import Iot.StreamSummary
import Iot.Tag
import Iot.ThingAttribute
import Iot.ThingDocument
import Iot.ThingGroupDocument
import Iot.ThingTypeDefinition
import Iot.TopicRuleDestinationSummary
import Iot.TopicRuleListItem
import Iot.ValidationError
import Iot.ViolationEvent
import Iot.AcceptCertificateTransferRequest
import Iot.AddThingToBillingGroupRequest
import Iot.AddThingToBillingGroupResponse
import Iot.AddThingToThingGroupRequest
import Iot.AddThingToThingGroupResponse
import Iot.AssociateTargetsWithJobRequest
import Iot.AssociateTargetsWithJobResponse
import Iot.AttachPolicyRequest
import Iot.AttachPrincipalPolicyRequest
import Iot.AttachSecurityProfileRequest
import Iot.AttachSecurityProfileResponse
import Iot.AttachThingPrincipalRequest
import Iot.AttachThingPrincipalResponse
import Iot.CancelAuditMitigationActionsTaskRequest
import Iot.CancelAuditMitigationActionsTaskResponse
import Iot.CancelAuditTaskRequest
import Iot.CancelAuditTaskResponse
import Iot.CancelCertificateTransferRequest
import Iot.CancelJobRequest
import Iot.CancelJobResponse
import Iot.CancelJobExecutionRequest
import Iot.ClearDefaultAuthorizerRequest
import Iot.ClearDefaultAuthorizerResponse
import Iot.ConfirmTopicRuleDestinationRequest
import Iot.ConfirmTopicRuleDestinationResponse
import Iot.CreateAuthorizerRequest
import Iot.CreateAuthorizerResponse
import Iot.CreateBillingGroupRequest
import Iot.CreateBillingGroupResponse
import Iot.CreateCertificateFromCsrRequest
import Iot.CreateCertificateFromCsrResponse
import Iot.CreateDomainConfigurationRequest
import Iot.CreateDomainConfigurationResponse
import Iot.CreateDynamicThingGroupRequest
import Iot.CreateDynamicThingGroupResponse
import Iot.CreateJobRequest
import Iot.CreateJobResponse
import Iot.CreateKeysAndCertificateRequest
import Iot.CreateKeysAndCertificateResponse
import Iot.CreateMitigationActionRequest
import Iot.CreateMitigationActionResponse
import Iot.CreateOTAUpdateRequest
import Iot.CreateOTAUpdateResponse
import Iot.CreatePolicyRequest
import Iot.CreatePolicyResponse
import Iot.CreatePolicyVersionRequest
import Iot.CreatePolicyVersionResponse
import Iot.CreateProvisioningClaimRequest
import Iot.CreateProvisioningClaimResponse
import Iot.CreateProvisioningTemplateRequest
import Iot.CreateProvisioningTemplateResponse
import Iot.CreateProvisioningTemplateVersionRequest
import Iot.CreateProvisioningTemplateVersionResponse
import Iot.CreateRoleAliasRequest
import Iot.CreateRoleAliasResponse
import Iot.CreateScheduledAuditRequest
import Iot.CreateScheduledAuditResponse
import Iot.CreateSecurityProfileRequest
import Iot.CreateSecurityProfileResponse
import Iot.CreateStreamRequest
import Iot.CreateStreamResponse
import Iot.CreateThingRequest
import Iot.CreateThingResponse
import Iot.CreateThingGroupRequest
import Iot.CreateThingGroupResponse
import Iot.CreateThingTypeRequest
import Iot.CreateThingTypeResponse
import Iot.CreateTopicRuleRequest
import Iot.CreateTopicRuleDestinationRequest
import Iot.CreateTopicRuleDestinationResponse
import Iot.DeleteAccountAuditConfigurationRequest
import Iot.DeleteAccountAuditConfigurationResponse
import Iot.DeleteAuthorizerRequest
import Iot.DeleteAuthorizerResponse
import Iot.DeleteBillingGroupRequest
import Iot.DeleteBillingGroupResponse
import Iot.DeleteCACertificateRequest
import Iot.DeleteCACertificateResponse
import Iot.DeleteCertificateRequest
import Iot.DeleteDomainConfigurationRequest
import Iot.DeleteDomainConfigurationResponse
import Iot.DeleteDynamicThingGroupRequest
import Iot.DeleteDynamicThingGroupResponse
import Iot.DeleteJobRequest
import Iot.DeleteJobExecutionRequest
import Iot.DeleteMitigationActionRequest
import Iot.DeleteMitigationActionResponse
import Iot.DeleteOTAUpdateRequest
import Iot.DeleteOTAUpdateResponse
import Iot.DeletePolicyRequest
import Iot.DeletePolicyVersionRequest
import Iot.DeleteProvisioningTemplateRequest
import Iot.DeleteProvisioningTemplateResponse
import Iot.DeleteProvisioningTemplateVersionRequest
import Iot.DeleteProvisioningTemplateVersionResponse
import Iot.DeleteRegistrationCodeRequest
import Iot.DeleteRegistrationCodeResponse
import Iot.DeleteRoleAliasRequest
import Iot.DeleteRoleAliasResponse
import Iot.DeleteScheduledAuditRequest
import Iot.DeleteScheduledAuditResponse
import Iot.DeleteSecurityProfileRequest
import Iot.DeleteSecurityProfileResponse
import Iot.DeleteStreamRequest
import Iot.DeleteStreamResponse
import Iot.DeleteThingRequest
import Iot.DeleteThingResponse
import Iot.DeleteThingGroupRequest
import Iot.DeleteThingGroupResponse
import Iot.DeleteThingTypeRequest
import Iot.DeleteThingTypeResponse
import Iot.DeleteTopicRuleRequest
import Iot.DeleteTopicRuleDestinationRequest
import Iot.DeleteTopicRuleDestinationResponse
import Iot.DeleteV2LoggingLevelRequest
import Iot.DeprecateThingTypeRequest
import Iot.DeprecateThingTypeResponse
import Iot.DescribeAccountAuditConfigurationRequest
import Iot.DescribeAccountAuditConfigurationResponse
import Iot.DescribeAuditFindingRequest
import Iot.DescribeAuditFindingResponse
import Iot.DescribeAuditMitigationActionsTaskRequest
import Iot.DescribeAuditMitigationActionsTaskResponse
import Iot.DescribeAuditTaskRequest
import Iot.DescribeAuditTaskResponse
import Iot.DescribeAuthorizerRequest
import Iot.DescribeAuthorizerResponse
import Iot.DescribeBillingGroupRequest
import Iot.DescribeBillingGroupResponse
import Iot.DescribeCACertificateRequest
import Iot.DescribeCACertificateResponse
import Iot.DescribeCertificateRequest
import Iot.DescribeCertificateResponse
import Iot.DescribeDefaultAuthorizerRequest
import Iot.DescribeDefaultAuthorizerResponse
import Iot.DescribeDomainConfigurationRequest
import Iot.DescribeDomainConfigurationResponse
import Iot.DescribeEndpointRequest
import Iot.DescribeEndpointResponse
import Iot.DescribeEventConfigurationsRequest
import Iot.DescribeEventConfigurationsResponse
import Iot.DescribeIndexRequest
import Iot.DescribeIndexResponse
import Iot.DescribeJobRequest
import Iot.DescribeJobResponse
import Iot.DescribeJobExecutionRequest
import Iot.DescribeJobExecutionResponse
import Iot.DescribeMitigationActionRequest
import Iot.DescribeMitigationActionResponse
import Iot.DescribeProvisioningTemplateRequest
import Iot.DescribeProvisioningTemplateResponse
import Iot.DescribeProvisioningTemplateVersionRequest
import Iot.DescribeProvisioningTemplateVersionResponse
import Iot.DescribeRoleAliasRequest
import Iot.DescribeRoleAliasResponse
import Iot.DescribeScheduledAuditRequest
import Iot.DescribeScheduledAuditResponse
import Iot.DescribeSecurityProfileRequest
import Iot.DescribeSecurityProfileResponse
import Iot.DescribeStreamRequest
import Iot.DescribeStreamResponse
import Iot.DescribeThingRequest
import Iot.DescribeThingResponse
import Iot.DescribeThingGroupRequest
import Iot.DescribeThingGroupResponse
import Iot.DescribeThingRegistrationTaskRequest
import Iot.DescribeThingRegistrationTaskResponse
import Iot.DescribeThingTypeRequest
import Iot.DescribeThingTypeResponse
import Iot.DetachPolicyRequest
import Iot.DetachPrincipalPolicyRequest
import Iot.DetachSecurityProfileRequest
import Iot.DetachSecurityProfileResponse
import Iot.DetachThingPrincipalRequest
import Iot.DetachThingPrincipalResponse
import Iot.DisableTopicRuleRequest
import Iot.EnableTopicRuleRequest
import Iot.GetCardinalityRequest
import Iot.GetCardinalityResponse
import Iot.GetEffectivePoliciesRequest
import Iot.GetEffectivePoliciesResponse
import Iot.GetIndexingConfigurationRequest
import Iot.GetIndexingConfigurationResponse
import Iot.GetJobDocumentRequest
import Iot.GetJobDocumentResponse
import Iot.GetLoggingOptionsRequest
import Iot.GetLoggingOptionsResponse
import Iot.GetOTAUpdateRequest
import Iot.GetOTAUpdateResponse
import Iot.GetPercentilesRequest
import Iot.GetPercentilesResponse
import Iot.GetPolicyRequest
import Iot.GetPolicyResponse
import Iot.GetPolicyVersionRequest
import Iot.GetPolicyVersionResponse
import Iot.GetRegistrationCodeRequest
import Iot.GetRegistrationCodeResponse
import Iot.GetStatisticsRequest
import Iot.GetStatisticsResponse
import Iot.GetTopicRuleRequest
import Iot.GetTopicRuleResponse
import Iot.GetTopicRuleDestinationRequest
import Iot.GetTopicRuleDestinationResponse
import Iot.GetV2LoggingOptionsRequest
import Iot.GetV2LoggingOptionsResponse
import Iot.ListActiveViolationsRequest
import Iot.ListActiveViolationsResponse
import Iot.ListAttachedPoliciesRequest
import Iot.ListAttachedPoliciesResponse
import Iot.ListAuditFindingsRequest
import Iot.ListAuditFindingsResponse
import Iot.ListAuditMitigationActionsExecutionsRequest
import Iot.ListAuditMitigationActionsExecutionsResponse
import Iot.ListAuditMitigationActionsTasksRequest
import Iot.ListAuditMitigationActionsTasksResponse
import Iot.ListAuditTasksRequest
import Iot.ListAuditTasksResponse
import Iot.ListAuthorizersRequest
import Iot.ListAuthorizersResponse
import Iot.ListBillingGroupsRequest
import Iot.ListBillingGroupsResponse
import Iot.ListCACertificatesRequest
import Iot.ListCACertificatesResponse
import Iot.ListCertificatesRequest
import Iot.ListCertificatesResponse
import Iot.ListCertificatesByCARequest
import Iot.ListCertificatesByCAResponse
import Iot.ListDomainConfigurationsRequest
import Iot.ListDomainConfigurationsResponse
import Iot.ListIndicesRequest
import Iot.ListIndicesResponse
import Iot.ListJobExecutionsForJobRequest
import Iot.ListJobExecutionsForJobResponse
import Iot.ListJobExecutionsForThingRequest
import Iot.ListJobExecutionsForThingResponse
import Iot.ListJobsRequest
import Iot.ListJobsResponse
import Iot.ListMitigationActionsRequest
import Iot.ListMitigationActionsResponse
import Iot.ListOTAUpdatesRequest
import Iot.ListOTAUpdatesResponse
import Iot.ListOutgoingCertificatesRequest
import Iot.ListOutgoingCertificatesResponse
import Iot.ListPoliciesRequest
import Iot.ListPoliciesResponse
import Iot.ListPolicyPrincipalsRequest
import Iot.ListPolicyPrincipalsResponse
import Iot.ListPolicyVersionsRequest
import Iot.ListPolicyVersionsResponse
import Iot.ListPrincipalPoliciesRequest
import Iot.ListPrincipalPoliciesResponse
import Iot.ListPrincipalThingsRequest
import Iot.ListPrincipalThingsResponse
import Iot.ListProvisioningTemplateVersionsRequest
import Iot.ListProvisioningTemplateVersionsResponse
import Iot.ListProvisioningTemplatesRequest
import Iot.ListProvisioningTemplatesResponse
import Iot.ListRoleAliasesRequest
import Iot.ListRoleAliasesResponse
import Iot.ListScheduledAuditsRequest
import Iot.ListScheduledAuditsResponse
import Iot.ListSecurityProfilesRequest
import Iot.ListSecurityProfilesResponse
import Iot.ListSecurityProfilesForTargetRequest
import Iot.ListSecurityProfilesForTargetResponse
import Iot.ListStreamsRequest
import Iot.ListStreamsResponse
import Iot.ListTagsForResourceRequest
import Iot.ListTagsForResourceResponse
import Iot.ListTargetsForPolicyRequest
import Iot.ListTargetsForPolicyResponse
import Iot.ListTargetsForSecurityProfileRequest
import Iot.ListTargetsForSecurityProfileResponse
import Iot.ListThingGroupsRequest
import Iot.ListThingGroupsResponse
import Iot.ListThingGroupsForThingRequest
import Iot.ListThingGroupsForThingResponse
import Iot.ListThingPrincipalsRequest
import Iot.ListThingPrincipalsResponse
import Iot.ListThingRegistrationTaskReportsRequest
import Iot.ListThingRegistrationTaskReportsResponse
import Iot.ListThingRegistrationTasksRequest
import Iot.ListThingRegistrationTasksResponse
import Iot.ListThingTypesRequest
import Iot.ListThingTypesResponse
import Iot.ListThingsRequest
import Iot.ListThingsResponse
import Iot.ListThingsInBillingGroupRequest
import Iot.ListThingsInBillingGroupResponse
import Iot.ListThingsInThingGroupRequest
import Iot.ListThingsInThingGroupResponse
import Iot.ListTopicRuleDestinationsRequest
import Iot.ListTopicRuleDestinationsResponse
import Iot.ListTopicRulesRequest
import Iot.ListTopicRulesResponse
import Iot.ListV2LoggingLevelsRequest
import Iot.ListV2LoggingLevelsResponse
import Iot.ListViolationEventsRequest
import Iot.ListViolationEventsResponse
import Iot.RegisterCACertificateRequest
import Iot.RegisterCACertificateResponse
import Iot.RegisterCertificateRequest
import Iot.RegisterCertificateResponse
import Iot.RegisterThingRequest
import Iot.RegisterThingResponse
import Iot.RejectCertificateTransferRequest
import Iot.RemoveThingFromBillingGroupRequest
import Iot.RemoveThingFromBillingGroupResponse
import Iot.RemoveThingFromThingGroupRequest
import Iot.RemoveThingFromThingGroupResponse
import Iot.ReplaceTopicRuleRequest
import Iot.SearchIndexRequest
import Iot.SearchIndexResponse
import Iot.SetDefaultAuthorizerRequest
import Iot.SetDefaultAuthorizerResponse
import Iot.SetDefaultPolicyVersionRequest
import Iot.SetLoggingOptionsRequest
import Iot.SetV2LoggingLevelRequest
import Iot.SetV2LoggingOptionsRequest
import Iot.StartAuditMitigationActionsTaskRequest
import Iot.StartAuditMitigationActionsTaskResponse
import Iot.StartOnDemandAuditTaskRequest
import Iot.StartOnDemandAuditTaskResponse
import Iot.StartThingRegistrationTaskRequest
import Iot.StartThingRegistrationTaskResponse
import Iot.StopThingRegistrationTaskRequest
import Iot.StopThingRegistrationTaskResponse
import Iot.TagResourceRequest
import Iot.TagResourceResponse
import Iot.TestAuthorizationRequest
import Iot.TestAuthorizationResponse
import Iot.TestInvokeAuthorizerRequest
import Iot.TestInvokeAuthorizerResponse
import Iot.TransferCertificateRequest
import Iot.TransferCertificateResponse
import Iot.UntagResourceRequest
import Iot.UntagResourceResponse
import Iot.UpdateAccountAuditConfigurationRequest
import Iot.UpdateAccountAuditConfigurationResponse
import Iot.UpdateAuthorizerRequest
import Iot.UpdateAuthorizerResponse
import Iot.UpdateBillingGroupRequest
import Iot.UpdateBillingGroupResponse
import Iot.UpdateCACertificateRequest
import Iot.UpdateCertificateRequest
import Iot.UpdateDomainConfigurationRequest
import Iot.UpdateDomainConfigurationResponse
import Iot.UpdateDynamicThingGroupRequest
import Iot.UpdateDynamicThingGroupResponse
import Iot.UpdateEventConfigurationsRequest
import Iot.UpdateEventConfigurationsResponse
import Iot.UpdateIndexingConfigurationRequest
import Iot.UpdateIndexingConfigurationResponse
import Iot.UpdateJobRequest
import Iot.UpdateMitigationActionRequest
import Iot.UpdateMitigationActionResponse
import Iot.UpdateProvisioningTemplateRequest
import Iot.UpdateProvisioningTemplateResponse
import Iot.UpdateRoleAliasRequest
import Iot.UpdateRoleAliasResponse
import Iot.UpdateScheduledAuditRequest
import Iot.UpdateScheduledAuditResponse
import Iot.UpdateSecurityProfileRequest
import Iot.UpdateSecurityProfileResponse
import Iot.UpdateStreamRequest
import Iot.UpdateStreamResponse
import Iot.UpdateThingRequest
import Iot.UpdateThingResponse
import Iot.UpdateThingGroupRequest
import Iot.UpdateThingGroupResponse
import Iot.UpdateThingGroupsForThingRequest
import Iot.UpdateThingGroupsForThingResponse
import Iot.UpdateTopicRuleDestinationRequest
import Iot.UpdateTopicRuleDestinationResponse
import Iot.ValidateSecurityProfileBehaviorsRequest
import Iot.ValidateSecurityProfileBehaviorsResponse
import Iot.DynamoDBAction
import Iot.DynamoDBv2Action
import Iot.LambdaAction
import Iot.SnsAction
import Iot.SqsAction
import Iot.KinesisAction
import Iot.RepublishAction
import Iot.S3Action
import Iot.FirehoseAction
import Iot.CloudwatchMetricAction
import Iot.CloudwatchAlarmAction
import Iot.CloudwatchLogsAction
import Iot.ElasticsearchAction
import Iot.SalesforceAction
import Iot.IotAnalyticsAction
import Iot.IotEventsAction
import Iot.IotSiteWiseAction
import Iot.StepFunctionsAction
import Iot.HttpAction
import Iot.MetricValue
import Iot.AlertTarget
import Iot.AssetPropertyVariant
import Iot.AssetPropertyTimestamp
import Iot.Attributes
import Iot.AuditCheckConfiguration
import Iot.AuditCheckDetails
import Iot.NonCompliantResource
import Iot.TaskStatisticsForAuditCheck
import Iot.AuditCheckToReasonCodeFilter
import Iot.AuditNotificationTarget
import Iot.Allowed
import Iot.Denied
import Iot.PublicKeyMap
import Iot.BehaviorCriteria
import Iot.StatisticalThreshold
import Iot.CertificateValidity
import Iot.DetailsMap
import Iot.TransferData
import Iot.StartSigningJobParameter
import Iot.CustomCodeSigning
import Iot.BillingGroupProperties
import Iot.AuthorizerConfig
import Iot.ThingGroupProperties
import Iot.PresignedUrlConfig
import Iot.JobExecutionsRolloutConfig
import Iot.AbortConfig
import Iot.TimeoutConfig
import Iot.KeyPair
import Iot.MitigationActionParams
import Iot.AwsJobExecutionsRolloutConfig
import Iot.AwsJobPresignedUrlConfig
import Iot.AdditionalParameterMap
import Iot.AlertTargets
import Iot.AttributePayload
import Iot.ThingTypeProperties
import Iot.TopicRuleDestinationConfiguration
import Iot.TopicRuleDestination
import Iot.TopicRulePayload
import Iot.CodeSigningSignature
import Iot.CodeSigningCertificateChain
import Iot.ImplicitDeny
import Iot.ExplicitDeny
import Iot.AuditNotificationTargetConfigurations
import Iot.AuditCheckConfigurations
import Iot.AuditMitigationActionsTaskStatistics
import Iot.AuditMitigationActionsTaskTarget
import Iot.AuditCheckToActionsMapping
import Iot.TaskStatistics
import Iot.AuditDetails
import Iot.AuthorizerDescription
import Iot.BillingGroupMetadata
import Iot.CACertificateDescription
import Iot.RegistrationConfig
import Iot.CertificateDescription
import Iot.EventConfigurations
import Iot.JobExecution
import Iot.Job
import Iot.RoleAliasDescription
import Iot.StreamInfo
import Iot.ThingGroupMetadata
import Iot.ThingTypeMetadata
import Iot.S3Destination
import Iot.PutItemInput
import Iot.Configuration
import Iot.RateIncreaseCriteria
import Iot.Stream
import Iot.S3Location
import Iot.ThingIndexingConfiguration
import Iot.ThingGroupIndexingConfiguration
import Iot.OTAUpdateInfo
import Iot.Statistics
import Iot.TopicRule
import Iot.HttpAuthorization
import Iot.SigV4Authorization
import Iot.HttpHeaders
import Iot.JobProcessDetails
import Iot.JobExecutionStatusDetails
import Iot.JobExecutionSummary
import Iot.ExponentialRolloutRate
import Iot.ResourceIdentifier
import Iot.LogTarget
import Iot.UpdateDeviceCertificateParams
import Iot.UpdateCACertificateParams
import Iot.AddThingsToThingGroupParams
import Iot.ReplaceDefaultPolicyVersionParams
import Iot.EnableIoTLoggingParams
import Iot.PublishFindingToSnsParams
import Iot.StringMap
import Iot.FileLocation
import Iot.CodeSigning
import Iot.AttributesMap
import Iot.ErrorInfo
import Iot.Parameters
import Iot.ResourceArns
import Iot.PolicyVersionIdentifier
import Iot.LoggingOptionsPayload
import Iot.SigningProfileParameter
import Iot.Destination
import Iot.HttpContext
import Iot.MqttContext
import Iot.TlsContext
import Iot.ThingConnectivity
import Iot.HttpUrlDestinationProperties
import Iot.HttpUrlDestinationConfiguration
import Iot.HttpUrlDestinationSummary

typealias AbortCriteriaList = Array<AbortCriteria>

typealias AbortThresholdPercentage = Number

typealias AcmCertificateArn = String

typealias ActionList = Array<Action>

typealias ActiveViolations = Array<ActiveViolation>

typealias AdditionalMetricsToRetainList = Array<BehaviorMetric>

typealias AggregationField = String

typealias AlarmName = String

typealias AlertTargetArn = String

typealias AllowAuthorizerOverride = Boolean

typealias AllowAutoRegistration = Boolean

typealias ApproximateSecondsBeforeTimedOut = Number

typealias AscendingOrder = Boolean

typealias AssetId = String

typealias AssetPropertyAlias = String

typealias AssetPropertyBooleanValue = String

typealias AssetPropertyDoubleValue = String

typealias AssetPropertyEntryId = String

typealias AssetPropertyId = String

typealias AssetPropertyIntegerValue = String

typealias AssetPropertyOffsetInNanos = String

typealias AssetPropertyQuality = String

typealias AssetPropertyStringValue = String

typealias AssetPropertyTimeInSeconds = String

typealias AssetPropertyValueList = Array<AssetPropertyValue>

typealias AttributeKey = String

typealias AttributeName = String

typealias AttributeValue = String

typealias AuditCheckName = String

typealias AuditFindings = Array<AuditFinding>

typealias AuditMitigationActionExecutionMetadataList = Array<AuditMitigationActionExecutionMetadata>

typealias AuditMitigationActionsTaskId = String

typealias AuditMitigationActionsTaskMetadataList = Array<AuditMitigationActionsTaskMetadata>

typealias AuditTaskId = String

typealias AuditTaskMetadataList = Array<AuditTaskMetadata>

typealias AuthInfos = Array<AuthInfo>

typealias AuthResults = Array<AuthResult>

typealias AuthorizerArn = String

typealias AuthorizerFunctionArn = String

typealias AuthorizerName = String

typealias Authorizers = Array<AuthorizerSummary>

typealias Average = Number

typealias AwsAccountId = String

typealias AwsArn = String

typealias AwsIotJobArn = String

typealias AwsIotJobId = String

typealias AwsIotSqlVersion = String

typealias BehaviorMetric = String

typealias BehaviorName = String

typealias Behaviors = Array<Behavior>

typealias BillingGroupArn = String

typealias BillingGroupDescription = String

typealias BillingGroupId = String

typealias BillingGroupName = String

typealias BillingGroupNameAndArnList = Array<GroupNameAndArn>

typealias Boolean = Boolean

typealias BooleanKey = Boolean

typealias BucketName = String

typealias CACertificates = Array<CACertificate>

typealias CanceledChecksCount = Number

typealias CanceledFindingsCount = Number

typealias CanceledThings = Number

typealias CertificateArn = String

typealias CertificateId = String

typealias CertificateName = String

typealias CertificatePathOnDevice = String

typealias CertificatePem = String

typealias CertificateSigningRequest = String

typealias Certificates = Array<Certificate>

typealias ChannelName = String

typealias CheckCompliant = Boolean

typealias Cidr = String

typealias Cidrs = Array<Cidr>

typealias ClientId = String

typealias ClientRequestToken = String

typealias Code = String

typealias CognitoIdentityPoolId = String

typealias Comment = String

typealias CompliantChecksCount = Number

typealias ConfirmationToken = String

typealias ConnectivityTimestamp = Number

typealias ConsecutiveDatapointsToAlarm = Number

typealias ConsecutiveDatapointsToClear = Number

typealias Count = Number

typealias CreatedAtDate = Date

typealias CreationDate = Date

typealias CredentialDurationSeconds = Number

typealias CustomerVersion = Number

typealias DateType = Date

typealias DayOfMonth = String

typealias DeleteAdditionalMetricsToRetain = Boolean

typealias DeleteAlertTargets = Boolean

typealias DeleteBehaviors = Boolean

typealias DeleteScheduledAudits = Boolean

typealias DeleteStream = Boolean

typealias DeliveryStreamName = String

typealias DeprecationDate = Date

typealias Description = String

typealias DetailsKey = String

typealias DetailsValue = String

typealias DeviceDefenderThingName = String

typealias DisableAllLogs = Boolean

typealias DomainConfigurationArn = String

typealias DomainConfigurationName = String

typealias DomainConfigurations = Array<DomainConfigurationSummary>

typealias DomainName = String

typealias DurationSeconds = Number

typealias DynamoOperation = String

typealias EffectivePolicies = Array<EffectivePolicy>

typealias ElasticsearchEndpoint = String

typealias ElasticsearchId = String

typealias ElasticsearchIndex = String

typealias ElasticsearchType = String

typealias Enabled = Boolean

typealias EndpointAddress = String

typealias EndpointType = String

typealias ErrorCode = String

typealias ErrorMessage = String

typealias EvaluationStatistic = String

typealias ExecutionNamePrefix = String

typealias ExecutionNumber = Number

typealias ExpectedVersion = Number

typealias ExpiresInSec = Number

typealias ExpiresInSeconds = Number

typealias FailedChecksCount = Number

typealias FailedFindingsCount = Number

typealias FailedThings = Number

typealias FieldName = String

typealias Fields = Array<Field>

typealias FileId = Number

typealias FileName = String

typealias FindingId = String

typealias FindingIds = Array<FindingId>

typealias FirehoseSeparator = String

typealias Flag = Boolean

typealias ForceDelete = Boolean

typealias ForceDeleteAWSJob = Boolean

typealias ForceFlag = Boolean

typealias Forced = Boolean

typealias FunctionArn = String

typealias GenerationId = String

typealias HashAlgorithm = String

typealias HashKeyField = String

typealias HashKeyValue = String

typealias HeaderKey = String

typealias HeaderList = Array<HttpActionHeader>

typealias HeaderValue = String

typealias HttpHeaderName = String

typealias HttpHeaderValue = String

typealias HttpQueryString = String

typealias InProgressChecksCount = Number

typealias InProgressThings = Number

typealias InProgressTimeoutInMinutes = Number

typealias IncrementFactor = Number

typealias IndexName = String

typealias IndexNamesList = Array<IndexName>

typealias IndexSchema = String

typealias InlineDocument = String

typealias InputName = String

typealias IsAuthenticated = Boolean

typealias IsDefaultVersion = Boolean

typealias IsDisabled = Boolean

typealias JobArn = String

typealias JobDescription = String

typealias JobDocument = String

typealias JobDocumentSource = String

typealias JobExecutionSummaryForJobList = Array<JobExecutionSummaryForJob>

typealias JobExecutionSummaryForThingList = Array<JobExecutionSummaryForThing>

typealias JobId = String

typealias JobSummaryList = Array<JobSummary>

typealias JobTargets = Array<TargetArn>

typealias JsonDocument = String

typealias Key = String

typealias KeyName = String

typealias KeyValue = String

typealias LaserMaxResults = Number

typealias LastModifiedDate = Date

typealias LogGroupName = String

typealias LogTargetConfigurations = Array<LogTargetConfiguration>

typealias LogTargetName = String

typealias Marker = String

typealias MaxJobExecutionsPerMin = Number

typealias MaxResults = Number

typealias Maximum = Number

typealias MaximumPerMinute = Number

typealias Message = String

typealias MessageId = String

typealias Minimum = Number

typealias MinimumNumberOfExecutedThings = Number

typealias MissingContextValue = String

typealias MissingContextValues = Array<MissingContextValue>

typealias MitigationActionArn = String

typealias MitigationActionId = String

typealias MitigationActionIdentifierList = Array<MitigationActionIdentifier>

typealias MitigationActionList = Array<MitigationAction>

typealias MitigationActionName = String

typealias MitigationActionNameList = Array<MitigationActionName>

typealias MqttClientId = String

typealias MqttUsername = String

typealias NextToken = String

typealias NonCompliantChecksCount = Number

typealias NonCompliantResourcesCount = Number

typealias NumberOfThings = Number

typealias OTAUpdateArn = String

typealias OTAUpdateDescription = String

typealias OTAUpdateErrorMessage = String

typealias OTAUpdateFileVersion = String

typealias OTAUpdateFiles = Array<OTAUpdateFile>

typealias OTAUpdateId = String

typealias OTAUpdatesSummary = Array<OTAUpdateSummary>

typealias OptionalVersion = Number

typealias OutgoingCertificates = Array<OutgoingCertificate>

typealias OverrideDynamicGroups = Boolean

typealias PageSize = Number

typealias Parameter = String

typealias PartitionKey = String

typealias PayloadField = String

typealias Percent = Number

typealias PercentList = Array<Percent>

typealias PercentValue = Number

typealias Percentage = Number

typealias Percentiles = Array<PercentPair>

typealias Platform = String

typealias Policies = Array<Policy>

typealias PolicyArn = String

typealias PolicyDocument = String

typealias PolicyDocuments = Array<PolicyDocument>

typealias PolicyName = String

typealias PolicyNames = Array<PolicyName>

typealias PolicyTarget = String

typealias PolicyTargets = Array<PolicyTarget>

typealias PolicyVersionId = String

typealias PolicyVersions = Array<PolicyVersion>

typealias Port = Number

typealias Ports = Array<Port>

typealias Prefix = String

typealias Principal = String

typealias PrincipalArn = String

typealias PrincipalId = String

typealias Principals = Array<PrincipalArn>

typealias PrivateKey = String

typealias ProcessingTargetName = String

typealias ProcessingTargetNameList = Array<ProcessingTargetName>

typealias Protocols = Array<String /* "MQTT" | "HTTP" | String */>

typealias ProvisioningTemplateListing = Array<ProvisioningTemplateSummary>

typealias ProvisioningTemplateVersionListing = Array<ProvisioningTemplateVersionSummary>

typealias PublicKey = String

typealias PutAssetPropertyValueEntryList = Array<PutAssetPropertyValueEntry>

typealias Qos = Number

typealias QueryMaxResults = Number

typealias QueryString = String

typealias QueryVersion = String

typealias QueueUrl = String

typealias QueuedThings = Number

typealias RangeKeyField = String

typealias RangeKeyValue = String

typealias ReasonCode = String

typealias ReasonForNonCompliance = String

typealias ReasonForNonComplianceCode = String

typealias ReasonForNonComplianceCodes = Array<ReasonForNonComplianceCode>

typealias Recursive = Boolean

typealias RecursiveWithoutDefault = Boolean

typealias RegistrationCode = String

typealias RegistryMaxResults = Number

typealias RegistryS3BucketName = String

typealias RegistryS3KeyName = String

typealias RejectedThings = Number

typealias RelatedResources = Array<RelatedResource>

typealias RemoveAuthorizerConfig = Boolean

typealias RemoveAutoRegistration = Boolean

typealias RemoveThingType = Boolean

typealias RemovedThings = Number

typealias ReservedDomainConfigurationName = String

typealias Resource = String

typealias ResourceArn = String

typealias ResourceLogicalId = String

typealias Resources = Array<Resource>

typealias RoleAlias = String

typealias RoleAliasArn = String

typealias RoleAliases = Array<RoleAlias>

typealias RoleArn = String

typealias RolloutRatePerMinute = Number

typealias RuleArn = String

typealias RuleName = String

typealias S3Bucket = String

typealias S3FileUrl = String

typealias S3FileUrlList = Array<S3FileUrl>

typealias S3Key = String

typealias S3Version = String

typealias SQL = String

typealias SalesforceEndpoint = String

typealias SalesforceToken = String

typealias ScheduledAuditArn = String

typealias ScheduledAuditMetadataList = Array<ScheduledAuditMetadata>

typealias ScheduledAuditName = String

typealias SearchableAttributes = Array<AttributeName>

typealias Seconds = Number

typealias SecurityProfileArn = String

typealias SecurityProfileDescription = String

typealias SecurityProfileIdentifiers = Array<SecurityProfileIdentifier>

typealias SecurityProfileName = String

typealias SecurityProfileTargetArn = String

typealias SecurityProfileTargetMappings = Array<SecurityProfileTargetMapping>

typealias SecurityProfileTargets = Array<SecurityProfileTarget>

typealias ServerCertificateArns = Array<AcmCertificateArn>

typealias ServerCertificateStatusDetail = String

typealias ServerCertificates = Array<ServerCertificateSummary>

typealias ServerName = String

typealias ServiceName = String

typealias SetAsActive = Boolean

typealias SetAsActiveFlag = Boolean

typealias SetAsDefault = Boolean

typealias SignatureAlgorithm = String

typealias SigningJobId = String

typealias SigningProfileName = String

typealias SigningRegion = String

typealias SkippedFindingsCount = Number

typealias SkyfallMaxResults = Number

typealias SnsTopicArn = String

typealias StateMachineName = String

typealias StateReason = String

typealias StateValue = String

typealias StdDeviation = Number

typealias StreamArn = String

typealias StreamDescription = String

typealias StreamFiles = Array<StreamFile>

typealias StreamId = String

typealias StreamName = String

typealias StreamVersion = Number

typealias StreamsSummary = Array<StreamSummary>

typealias String = String

typealias SucceededFindingsCount = Number

typealias SucceededThings = Number

typealias Sum = Number

typealias SumOfSquares = Number

typealias TableName = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Target = String

typealias TargetArn = String

typealias TargetAuditCheckNames = Array<AuditCheckName>

typealias Targets = Array<Target>

typealias TaskId = String

typealias TaskIdList = Array<TaskId>

typealias TemplateArn = String

typealias TemplateBody = String

typealias TemplateDescription = String

typealias TemplateName = String

typealias TemplateVersionId = Number

typealias ThingArn = String

typealias ThingAttributeList = Array<ThingAttribute>

typealias ThingDocumentList = Array<ThingDocument>

typealias ThingGroupArn = String

typealias ThingGroupDescription = String

typealias ThingGroupDocumentList = Array<ThingGroupDocument>

typealias ThingGroupId = String

typealias ThingGroupList = Array<ThingGroupName>

typealias ThingGroupName = String

typealias ThingGroupNameAndArnList = Array<GroupNameAndArn>

typealias ThingGroupNameList = Array<ThingGroupName>

typealias ThingGroupNames = Array<ThingGroupName>

typealias ThingId = String

typealias ThingName = String

typealias ThingNameList = Array<ThingName>

typealias ThingTypeArn = String

typealias ThingTypeDescription = String

typealias ThingTypeId = String

typealias ThingTypeList = Array<ThingTypeDefinition>

typealias ThingTypeName = String

typealias TimedOutThings = Number

typealias Timestamp = Date

typealias Token = String

typealias TokenKeyName = String

typealias TokenSignature = String

typealias Topic = String

typealias TopicPattern = String

typealias TopicRuleDestinationMaxResults = Number

typealias TopicRuleDestinationSummaries = Array<TopicRuleDestinationSummary>

typealias TopicRuleList = Array<TopicRuleListItem>

typealias TopicRuleMaxResults = Number

typealias TotalChecksCount = Number

typealias TotalFindingsCount = Number

typealias TotalResourcesCount = Number

typealias UndoDeprecate = Boolean

typealias UnsignedLong = Number

typealias Url = String

typealias UseBase64 = Boolean

typealias Valid = Boolean

typealias ValidationErrors = Array<ValidationError>

typealias Value = String

typealias Variance = Number

typealias Version = Number

typealias VersionNumber = Number

typealias ViolationEvents = Array<ViolationEvent>

typealias ViolationId = String

typealias WaitingForDataCollectionChecksCount = Number

@JsModule("aws-sdk")
external open class Iot(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Iot.Types.ClientConfiguration */
    open fun acceptCertificateTransfer(params: AcceptCertificateTransferRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun acceptCertificateTransfer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addThingToBillingGroup(params: AddThingToBillingGroupRequest, callback: (err: AWSError, data: AddThingToBillingGroupResponse) -> Unit = definedExternally): Request<AddThingToBillingGroupResponse, AWSError>
    open fun addThingToBillingGroup(callback: (err: AWSError, data: AddThingToBillingGroupResponse) -> Unit = definedExternally): Request<AddThingToBillingGroupResponse, AWSError>
    open fun addThingToThingGroup(params: AddThingToThingGroupRequest, callback: (err: AWSError, data: AddThingToThingGroupResponse) -> Unit = definedExternally): Request<AddThingToThingGroupResponse, AWSError>
    open fun addThingToThingGroup(callback: (err: AWSError, data: AddThingToThingGroupResponse) -> Unit = definedExternally): Request<AddThingToThingGroupResponse, AWSError>
    open fun associateTargetsWithJob(params: AssociateTargetsWithJobRequest, callback: (err: AWSError, data: AssociateTargetsWithJobResponse) -> Unit = definedExternally): Request<AssociateTargetsWithJobResponse, AWSError>
    open fun associateTargetsWithJob(callback: (err: AWSError, data: AssociateTargetsWithJobResponse) -> Unit = definedExternally): Request<AssociateTargetsWithJobResponse, AWSError>
    open fun attachPolicy(params: AttachPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachPrincipalPolicy(params: AttachPrincipalPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachPrincipalPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachSecurityProfile(params: AttachSecurityProfileRequest, callback: (err: AWSError, data: AttachSecurityProfileResponse) -> Unit = definedExternally): Request<AttachSecurityProfileResponse, AWSError>
    open fun attachSecurityProfile(callback: (err: AWSError, data: AttachSecurityProfileResponse) -> Unit = definedExternally): Request<AttachSecurityProfileResponse, AWSError>
    open fun attachThingPrincipal(params: AttachThingPrincipalRequest, callback: (err: AWSError, data: AttachThingPrincipalResponse) -> Unit = definedExternally): Request<AttachThingPrincipalResponse, AWSError>
    open fun attachThingPrincipal(callback: (err: AWSError, data: AttachThingPrincipalResponse) -> Unit = definedExternally): Request<AttachThingPrincipalResponse, AWSError>
    open fun cancelAuditMitigationActionsTask(params: CancelAuditMitigationActionsTaskRequest, callback: (err: AWSError, data: CancelAuditMitigationActionsTaskResponse) -> Unit = definedExternally): Request<CancelAuditMitigationActionsTaskResponse, AWSError>
    open fun cancelAuditMitigationActionsTask(callback: (err: AWSError, data: CancelAuditMitigationActionsTaskResponse) -> Unit = definedExternally): Request<CancelAuditMitigationActionsTaskResponse, AWSError>
    open fun cancelAuditTask(params: CancelAuditTaskRequest, callback: (err: AWSError, data: CancelAuditTaskResponse) -> Unit = definedExternally): Request<CancelAuditTaskResponse, AWSError>
    open fun cancelAuditTask(callback: (err: AWSError, data: CancelAuditTaskResponse) -> Unit = definedExternally): Request<CancelAuditTaskResponse, AWSError>
    open fun cancelCertificateTransfer(params: CancelCertificateTransferRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun cancelCertificateTransfer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun cancelJob(params: CancelJobRequest, callback: (err: AWSError, data: CancelJobResponse) -> Unit = definedExternally): Request<CancelJobResponse, AWSError>
    open fun cancelJob(callback: (err: AWSError, data: CancelJobResponse) -> Unit = definedExternally): Request<CancelJobResponse, AWSError>
    open fun cancelJobExecution(params: CancelJobExecutionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun cancelJobExecution(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun clearDefaultAuthorizer(params: ClearDefaultAuthorizerRequest, callback: (err: AWSError, data: ClearDefaultAuthorizerResponse) -> Unit = definedExternally): Request<ClearDefaultAuthorizerResponse, AWSError>
    open fun clearDefaultAuthorizer(callback: (err: AWSError, data: ClearDefaultAuthorizerResponse) -> Unit = definedExternally): Request<ClearDefaultAuthorizerResponse, AWSError>
    open fun confirmTopicRuleDestination(params: ConfirmTopicRuleDestinationRequest, callback: (err: AWSError, data: ConfirmTopicRuleDestinationResponse) -> Unit = definedExternally): Request<ConfirmTopicRuleDestinationResponse, AWSError>
    open fun confirmTopicRuleDestination(callback: (err: AWSError, data: ConfirmTopicRuleDestinationResponse) -> Unit = definedExternally): Request<ConfirmTopicRuleDestinationResponse, AWSError>
    open fun createAuthorizer(params: CreateAuthorizerRequest, callback: (err: AWSError, data: CreateAuthorizerResponse) -> Unit = definedExternally): Request<CreateAuthorizerResponse, AWSError>
    open fun createAuthorizer(callback: (err: AWSError, data: CreateAuthorizerResponse) -> Unit = definedExternally): Request<CreateAuthorizerResponse, AWSError>
    open fun createBillingGroup(params: CreateBillingGroupRequest, callback: (err: AWSError, data: CreateBillingGroupResponse) -> Unit = definedExternally): Request<CreateBillingGroupResponse, AWSError>
    open fun createBillingGroup(callback: (err: AWSError, data: CreateBillingGroupResponse) -> Unit = definedExternally): Request<CreateBillingGroupResponse, AWSError>
    open fun createCertificateFromCsr(params: CreateCertificateFromCsrRequest, callback: (err: AWSError, data: CreateCertificateFromCsrResponse) -> Unit = definedExternally): Request<CreateCertificateFromCsrResponse, AWSError>
    open fun createCertificateFromCsr(callback: (err: AWSError, data: CreateCertificateFromCsrResponse) -> Unit = definedExternally): Request<CreateCertificateFromCsrResponse, AWSError>
    open fun createDomainConfiguration(params: CreateDomainConfigurationRequest, callback: (err: AWSError, data: CreateDomainConfigurationResponse) -> Unit = definedExternally): Request<CreateDomainConfigurationResponse, AWSError>
    open fun createDomainConfiguration(callback: (err: AWSError, data: CreateDomainConfigurationResponse) -> Unit = definedExternally): Request<CreateDomainConfigurationResponse, AWSError>
    open fun createDynamicThingGroup(params: CreateDynamicThingGroupRequest, callback: (err: AWSError, data: CreateDynamicThingGroupResponse) -> Unit = definedExternally): Request<CreateDynamicThingGroupResponse, AWSError>
    open fun createDynamicThingGroup(callback: (err: AWSError, data: CreateDynamicThingGroupResponse) -> Unit = definedExternally): Request<CreateDynamicThingGroupResponse, AWSError>
    open fun createJob(params: CreateJobRequest, callback: (err: AWSError, data: CreateJobResponse) -> Unit = definedExternally): Request<CreateJobResponse, AWSError>
    open fun createJob(callback: (err: AWSError, data: CreateJobResponse) -> Unit = definedExternally): Request<CreateJobResponse, AWSError>
    open fun createKeysAndCertificate(params: CreateKeysAndCertificateRequest, callback: (err: AWSError, data: CreateKeysAndCertificateResponse) -> Unit = definedExternally): Request<CreateKeysAndCertificateResponse, AWSError>
    open fun createKeysAndCertificate(callback: (err: AWSError, data: CreateKeysAndCertificateResponse) -> Unit = definedExternally): Request<CreateKeysAndCertificateResponse, AWSError>
    open fun createMitigationAction(params: CreateMitigationActionRequest, callback: (err: AWSError, data: CreateMitigationActionResponse) -> Unit = definedExternally): Request<CreateMitigationActionResponse, AWSError>
    open fun createMitigationAction(callback: (err: AWSError, data: CreateMitigationActionResponse) -> Unit = definedExternally): Request<CreateMitigationActionResponse, AWSError>
    open fun createOTAUpdate(params: CreateOTAUpdateRequest, callback: (err: AWSError, data: CreateOTAUpdateResponse) -> Unit = definedExternally): Request<CreateOTAUpdateResponse, AWSError>
    open fun createOTAUpdate(callback: (err: AWSError, data: CreateOTAUpdateResponse) -> Unit = definedExternally): Request<CreateOTAUpdateResponse, AWSError>
    open fun createPolicy(params: CreatePolicyRequest, callback: (err: AWSError, data: CreatePolicyResponse) -> Unit = definedExternally): Request<CreatePolicyResponse, AWSError>
    open fun createPolicy(callback: (err: AWSError, data: CreatePolicyResponse) -> Unit = definedExternally): Request<CreatePolicyResponse, AWSError>
    open fun createPolicyVersion(params: CreatePolicyVersionRequest, callback: (err: AWSError, data: CreatePolicyVersionResponse) -> Unit = definedExternally): Request<CreatePolicyVersionResponse, AWSError>
    open fun createPolicyVersion(callback: (err: AWSError, data: CreatePolicyVersionResponse) -> Unit = definedExternally): Request<CreatePolicyVersionResponse, AWSError>
    open fun createProvisioningClaim(params: CreateProvisioningClaimRequest, callback: (err: AWSError, data: CreateProvisioningClaimResponse) -> Unit = definedExternally): Request<CreateProvisioningClaimResponse, AWSError>
    open fun createProvisioningClaim(callback: (err: AWSError, data: CreateProvisioningClaimResponse) -> Unit = definedExternally): Request<CreateProvisioningClaimResponse, AWSError>
    open fun createProvisioningTemplate(params: CreateProvisioningTemplateRequest, callback: (err: AWSError, data: CreateProvisioningTemplateResponse) -> Unit = definedExternally): Request<CreateProvisioningTemplateResponse, AWSError>
    open fun createProvisioningTemplate(callback: (err: AWSError, data: CreateProvisioningTemplateResponse) -> Unit = definedExternally): Request<CreateProvisioningTemplateResponse, AWSError>
    open fun createProvisioningTemplateVersion(params: CreateProvisioningTemplateVersionRequest, callback: (err: AWSError, data: CreateProvisioningTemplateVersionResponse) -> Unit = definedExternally): Request<CreateProvisioningTemplateVersionResponse, AWSError>
    open fun createProvisioningTemplateVersion(callback: (err: AWSError, data: CreateProvisioningTemplateVersionResponse) -> Unit = definedExternally): Request<CreateProvisioningTemplateVersionResponse, AWSError>
    open fun createRoleAlias(params: CreateRoleAliasRequest, callback: (err: AWSError, data: CreateRoleAliasResponse) -> Unit = definedExternally): Request<CreateRoleAliasResponse, AWSError>
    open fun createRoleAlias(callback: (err: AWSError, data: CreateRoleAliasResponse) -> Unit = definedExternally): Request<CreateRoleAliasResponse, AWSError>
    open fun createScheduledAudit(params: CreateScheduledAuditRequest, callback: (err: AWSError, data: CreateScheduledAuditResponse) -> Unit = definedExternally): Request<CreateScheduledAuditResponse, AWSError>
    open fun createScheduledAudit(callback: (err: AWSError, data: CreateScheduledAuditResponse) -> Unit = definedExternally): Request<CreateScheduledAuditResponse, AWSError>
    open fun createSecurityProfile(params: CreateSecurityProfileRequest, callback: (err: AWSError, data: CreateSecurityProfileResponse) -> Unit = definedExternally): Request<CreateSecurityProfileResponse, AWSError>
    open fun createSecurityProfile(callback: (err: AWSError, data: CreateSecurityProfileResponse) -> Unit = definedExternally): Request<CreateSecurityProfileResponse, AWSError>
    open fun createStream(params: CreateStreamRequest, callback: (err: AWSError, data: CreateStreamResponse) -> Unit = definedExternally): Request<CreateStreamResponse, AWSError>
    open fun createStream(callback: (err: AWSError, data: CreateStreamResponse) -> Unit = definedExternally): Request<CreateStreamResponse, AWSError>
    open fun createThing(params: CreateThingRequest, callback: (err: AWSError, data: CreateThingResponse) -> Unit = definedExternally): Request<CreateThingResponse, AWSError>
    open fun createThing(callback: (err: AWSError, data: CreateThingResponse) -> Unit = definedExternally): Request<CreateThingResponse, AWSError>
    open fun createThingGroup(params: CreateThingGroupRequest, callback: (err: AWSError, data: CreateThingGroupResponse) -> Unit = definedExternally): Request<CreateThingGroupResponse, AWSError>
    open fun createThingGroup(callback: (err: AWSError, data: CreateThingGroupResponse) -> Unit = definedExternally): Request<CreateThingGroupResponse, AWSError>
    open fun createThingType(params: CreateThingTypeRequest, callback: (err: AWSError, data: CreateThingTypeResponse) -> Unit = definedExternally): Request<CreateThingTypeResponse, AWSError>
    open fun createThingType(callback: (err: AWSError, data: CreateThingTypeResponse) -> Unit = definedExternally): Request<CreateThingTypeResponse, AWSError>
    open fun createTopicRule(params: CreateTopicRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createTopicRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createTopicRuleDestination(params: CreateTopicRuleDestinationRequest, callback: (err: AWSError, data: CreateTopicRuleDestinationResponse) -> Unit = definedExternally): Request<CreateTopicRuleDestinationResponse, AWSError>
    open fun createTopicRuleDestination(callback: (err: AWSError, data: CreateTopicRuleDestinationResponse) -> Unit = definedExternally): Request<CreateTopicRuleDestinationResponse, AWSError>
    open fun deleteAccountAuditConfiguration(params: DeleteAccountAuditConfigurationRequest, callback: (err: AWSError, data: DeleteAccountAuditConfigurationResponse) -> Unit = definedExternally): Request<DeleteAccountAuditConfigurationResponse, AWSError>
    open fun deleteAccountAuditConfiguration(callback: (err: AWSError, data: DeleteAccountAuditConfigurationResponse) -> Unit = definedExternally): Request<DeleteAccountAuditConfigurationResponse, AWSError>
    open fun deleteAuthorizer(params: DeleteAuthorizerRequest, callback: (err: AWSError, data: DeleteAuthorizerResponse) -> Unit = definedExternally): Request<DeleteAuthorizerResponse, AWSError>
    open fun deleteAuthorizer(callback: (err: AWSError, data: DeleteAuthorizerResponse) -> Unit = definedExternally): Request<DeleteAuthorizerResponse, AWSError>
    open fun deleteBillingGroup(params: DeleteBillingGroupRequest, callback: (err: AWSError, data: DeleteBillingGroupResponse) -> Unit = definedExternally): Request<DeleteBillingGroupResponse, AWSError>
    open fun deleteBillingGroup(callback: (err: AWSError, data: DeleteBillingGroupResponse) -> Unit = definedExternally): Request<DeleteBillingGroupResponse, AWSError>
    open fun deleteCACertificate(params: DeleteCACertificateRequest, callback: (err: AWSError, data: DeleteCACertificateResponse) -> Unit = definedExternally): Request<DeleteCACertificateResponse, AWSError>
    open fun deleteCACertificate(callback: (err: AWSError, data: DeleteCACertificateResponse) -> Unit = definedExternally): Request<DeleteCACertificateResponse, AWSError>
    open fun deleteCertificate(params: DeleteCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDomainConfiguration(params: DeleteDomainConfigurationRequest, callback: (err: AWSError, data: DeleteDomainConfigurationResponse) -> Unit = definedExternally): Request<DeleteDomainConfigurationResponse, AWSError>
    open fun deleteDomainConfiguration(callback: (err: AWSError, data: DeleteDomainConfigurationResponse) -> Unit = definedExternally): Request<DeleteDomainConfigurationResponse, AWSError>
    open fun deleteDynamicThingGroup(params: DeleteDynamicThingGroupRequest, callback: (err: AWSError, data: DeleteDynamicThingGroupResponse) -> Unit = definedExternally): Request<DeleteDynamicThingGroupResponse, AWSError>
    open fun deleteDynamicThingGroup(callback: (err: AWSError, data: DeleteDynamicThingGroupResponse) -> Unit = definedExternally): Request<DeleteDynamicThingGroupResponse, AWSError>
    open fun deleteJob(params: DeleteJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteJobExecution(params: DeleteJobExecutionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteJobExecution(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMitigationAction(params: DeleteMitigationActionRequest, callback: (err: AWSError, data: DeleteMitigationActionResponse) -> Unit = definedExternally): Request<DeleteMitigationActionResponse, AWSError>
    open fun deleteMitigationAction(callback: (err: AWSError, data: DeleteMitigationActionResponse) -> Unit = definedExternally): Request<DeleteMitigationActionResponse, AWSError>
    open fun deleteOTAUpdate(params: DeleteOTAUpdateRequest, callback: (err: AWSError, data: DeleteOTAUpdateResponse) -> Unit = definedExternally): Request<DeleteOTAUpdateResponse, AWSError>
    open fun deleteOTAUpdate(callback: (err: AWSError, data: DeleteOTAUpdateResponse) -> Unit = definedExternally): Request<DeleteOTAUpdateResponse, AWSError>
    open fun deletePolicy(params: DeletePolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicyVersion(params: DeletePolicyVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicyVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteProvisioningTemplate(params: DeleteProvisioningTemplateRequest, callback: (err: AWSError, data: DeleteProvisioningTemplateResponse) -> Unit = definedExternally): Request<DeleteProvisioningTemplateResponse, AWSError>
    open fun deleteProvisioningTemplate(callback: (err: AWSError, data: DeleteProvisioningTemplateResponse) -> Unit = definedExternally): Request<DeleteProvisioningTemplateResponse, AWSError>
    open fun deleteProvisioningTemplateVersion(params: DeleteProvisioningTemplateVersionRequest, callback: (err: AWSError, data: DeleteProvisioningTemplateVersionResponse) -> Unit = definedExternally): Request<DeleteProvisioningTemplateVersionResponse, AWSError>
    open fun deleteProvisioningTemplateVersion(callback: (err: AWSError, data: DeleteProvisioningTemplateVersionResponse) -> Unit = definedExternally): Request<DeleteProvisioningTemplateVersionResponse, AWSError>
    open fun deleteRegistrationCode(params: DeleteRegistrationCodeRequest, callback: (err: AWSError, data: DeleteRegistrationCodeResponse) -> Unit = definedExternally): Request<DeleteRegistrationCodeResponse, AWSError>
    open fun deleteRegistrationCode(callback: (err: AWSError, data: DeleteRegistrationCodeResponse) -> Unit = definedExternally): Request<DeleteRegistrationCodeResponse, AWSError>
    open fun deleteRoleAlias(params: DeleteRoleAliasRequest, callback: (err: AWSError, data: DeleteRoleAliasResponse) -> Unit = definedExternally): Request<DeleteRoleAliasResponse, AWSError>
    open fun deleteRoleAlias(callback: (err: AWSError, data: DeleteRoleAliasResponse) -> Unit = definedExternally): Request<DeleteRoleAliasResponse, AWSError>
    open fun deleteScheduledAudit(params: DeleteScheduledAuditRequest, callback: (err: AWSError, data: DeleteScheduledAuditResponse) -> Unit = definedExternally): Request<DeleteScheduledAuditResponse, AWSError>
    open fun deleteScheduledAudit(callback: (err: AWSError, data: DeleteScheduledAuditResponse) -> Unit = definedExternally): Request<DeleteScheduledAuditResponse, AWSError>
    open fun deleteSecurityProfile(params: DeleteSecurityProfileRequest, callback: (err: AWSError, data: DeleteSecurityProfileResponse) -> Unit = definedExternally): Request<DeleteSecurityProfileResponse, AWSError>
    open fun deleteSecurityProfile(callback: (err: AWSError, data: DeleteSecurityProfileResponse) -> Unit = definedExternally): Request<DeleteSecurityProfileResponse, AWSError>
    open fun deleteStream(params: DeleteStreamRequest, callback: (err: AWSError, data: DeleteStreamResponse) -> Unit = definedExternally): Request<DeleteStreamResponse, AWSError>
    open fun deleteStream(callback: (err: AWSError, data: DeleteStreamResponse) -> Unit = definedExternally): Request<DeleteStreamResponse, AWSError>
    open fun deleteThing(params: DeleteThingRequest, callback: (err: AWSError, data: DeleteThingResponse) -> Unit = definedExternally): Request<DeleteThingResponse, AWSError>
    open fun deleteThing(callback: (err: AWSError, data: DeleteThingResponse) -> Unit = definedExternally): Request<DeleteThingResponse, AWSError>
    open fun deleteThingGroup(params: DeleteThingGroupRequest, callback: (err: AWSError, data: DeleteThingGroupResponse) -> Unit = definedExternally): Request<DeleteThingGroupResponse, AWSError>
    open fun deleteThingGroup(callback: (err: AWSError, data: DeleteThingGroupResponse) -> Unit = definedExternally): Request<DeleteThingGroupResponse, AWSError>
    open fun deleteThingType(params: DeleteThingTypeRequest, callback: (err: AWSError, data: DeleteThingTypeResponse) -> Unit = definedExternally): Request<DeleteThingTypeResponse, AWSError>
    open fun deleteThingType(callback: (err: AWSError, data: DeleteThingTypeResponse) -> Unit = definedExternally): Request<DeleteThingTypeResponse, AWSError>
    open fun deleteTopicRule(params: DeleteTopicRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTopicRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTopicRuleDestination(params: DeleteTopicRuleDestinationRequest, callback: (err: AWSError, data: DeleteTopicRuleDestinationResponse) -> Unit = definedExternally): Request<DeleteTopicRuleDestinationResponse, AWSError>
    open fun deleteTopicRuleDestination(callback: (err: AWSError, data: DeleteTopicRuleDestinationResponse) -> Unit = definedExternally): Request<DeleteTopicRuleDestinationResponse, AWSError>
    open fun deleteV2LoggingLevel(params: DeleteV2LoggingLevelRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteV2LoggingLevel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deprecateThingType(params: DeprecateThingTypeRequest, callback: (err: AWSError, data: DeprecateThingTypeResponse) -> Unit = definedExternally): Request<DeprecateThingTypeResponse, AWSError>
    open fun deprecateThingType(callback: (err: AWSError, data: DeprecateThingTypeResponse) -> Unit = definedExternally): Request<DeprecateThingTypeResponse, AWSError>
    open fun describeAccountAuditConfiguration(params: DescribeAccountAuditConfigurationRequest, callback: (err: AWSError, data: DescribeAccountAuditConfigurationResponse) -> Unit = definedExternally): Request<DescribeAccountAuditConfigurationResponse, AWSError>
    open fun describeAccountAuditConfiguration(callback: (err: AWSError, data: DescribeAccountAuditConfigurationResponse) -> Unit = definedExternally): Request<DescribeAccountAuditConfigurationResponse, AWSError>
    open fun describeAuditFinding(params: DescribeAuditFindingRequest, callback: (err: AWSError, data: DescribeAuditFindingResponse) -> Unit = definedExternally): Request<DescribeAuditFindingResponse, AWSError>
    open fun describeAuditFinding(callback: (err: AWSError, data: DescribeAuditFindingResponse) -> Unit = definedExternally): Request<DescribeAuditFindingResponse, AWSError>
    open fun describeAuditMitigationActionsTask(params: DescribeAuditMitigationActionsTaskRequest, callback: (err: AWSError, data: DescribeAuditMitigationActionsTaskResponse) -> Unit = definedExternally): Request<DescribeAuditMitigationActionsTaskResponse, AWSError>
    open fun describeAuditMitigationActionsTask(callback: (err: AWSError, data: DescribeAuditMitigationActionsTaskResponse) -> Unit = definedExternally): Request<DescribeAuditMitigationActionsTaskResponse, AWSError>
    open fun describeAuditTask(params: DescribeAuditTaskRequest, callback: (err: AWSError, data: DescribeAuditTaskResponse) -> Unit = definedExternally): Request<DescribeAuditTaskResponse, AWSError>
    open fun describeAuditTask(callback: (err: AWSError, data: DescribeAuditTaskResponse) -> Unit = definedExternally): Request<DescribeAuditTaskResponse, AWSError>
    open fun describeAuthorizer(params: DescribeAuthorizerRequest, callback: (err: AWSError, data: DescribeAuthorizerResponse) -> Unit = definedExternally): Request<DescribeAuthorizerResponse, AWSError>
    open fun describeAuthorizer(callback: (err: AWSError, data: DescribeAuthorizerResponse) -> Unit = definedExternally): Request<DescribeAuthorizerResponse, AWSError>
    open fun describeBillingGroup(params: DescribeBillingGroupRequest, callback: (err: AWSError, data: DescribeBillingGroupResponse) -> Unit = definedExternally): Request<DescribeBillingGroupResponse, AWSError>
    open fun describeBillingGroup(callback: (err: AWSError, data: DescribeBillingGroupResponse) -> Unit = definedExternally): Request<DescribeBillingGroupResponse, AWSError>
    open fun describeCACertificate(params: DescribeCACertificateRequest, callback: (err: AWSError, data: DescribeCACertificateResponse) -> Unit = definedExternally): Request<DescribeCACertificateResponse, AWSError>
    open fun describeCACertificate(callback: (err: AWSError, data: DescribeCACertificateResponse) -> Unit = definedExternally): Request<DescribeCACertificateResponse, AWSError>
    open fun describeCertificate(params: DescribeCertificateRequest, callback: (err: AWSError, data: DescribeCertificateResponse) -> Unit = definedExternally): Request<DescribeCertificateResponse, AWSError>
    open fun describeCertificate(callback: (err: AWSError, data: DescribeCertificateResponse) -> Unit = definedExternally): Request<DescribeCertificateResponse, AWSError>
    open fun describeDefaultAuthorizer(params: DescribeDefaultAuthorizerRequest, callback: (err: AWSError, data: DescribeDefaultAuthorizerResponse) -> Unit = definedExternally): Request<DescribeDefaultAuthorizerResponse, AWSError>
    open fun describeDefaultAuthorizer(callback: (err: AWSError, data: DescribeDefaultAuthorizerResponse) -> Unit = definedExternally): Request<DescribeDefaultAuthorizerResponse, AWSError>
    open fun describeDomainConfiguration(params: DescribeDomainConfigurationRequest, callback: (err: AWSError, data: DescribeDomainConfigurationResponse) -> Unit = definedExternally): Request<DescribeDomainConfigurationResponse, AWSError>
    open fun describeDomainConfiguration(callback: (err: AWSError, data: DescribeDomainConfigurationResponse) -> Unit = definedExternally): Request<DescribeDomainConfigurationResponse, AWSError>
    open fun describeEndpoint(params: DescribeEndpointRequest, callback: (err: AWSError, data: DescribeEndpointResponse) -> Unit = definedExternally): Request<DescribeEndpointResponse, AWSError>
    open fun describeEndpoint(callback: (err: AWSError, data: DescribeEndpointResponse) -> Unit = definedExternally): Request<DescribeEndpointResponse, AWSError>
    open fun describeEventConfigurations(params: DescribeEventConfigurationsRequest, callback: (err: AWSError, data: DescribeEventConfigurationsResponse) -> Unit = definedExternally): Request<DescribeEventConfigurationsResponse, AWSError>
    open fun describeEventConfigurations(callback: (err: AWSError, data: DescribeEventConfigurationsResponse) -> Unit = definedExternally): Request<DescribeEventConfigurationsResponse, AWSError>
    open fun describeIndex(params: DescribeIndexRequest, callback: (err: AWSError, data: DescribeIndexResponse) -> Unit = definedExternally): Request<DescribeIndexResponse, AWSError>
    open fun describeIndex(callback: (err: AWSError, data: DescribeIndexResponse) -> Unit = definedExternally): Request<DescribeIndexResponse, AWSError>
    open fun describeJob(params: DescribeJobRequest, callback: (err: AWSError, data: DescribeJobResponse) -> Unit = definedExternally): Request<DescribeJobResponse, AWSError>
    open fun describeJob(callback: (err: AWSError, data: DescribeJobResponse) -> Unit = definedExternally): Request<DescribeJobResponse, AWSError>
    open fun describeJobExecution(params: DescribeJobExecutionRequest, callback: (err: AWSError, data: DescribeJobExecutionResponse) -> Unit = definedExternally): Request<DescribeJobExecutionResponse, AWSError>
    open fun describeJobExecution(callback: (err: AWSError, data: DescribeJobExecutionResponse) -> Unit = definedExternally): Request<DescribeJobExecutionResponse, AWSError>
    open fun describeMitigationAction(params: DescribeMitigationActionRequest, callback: (err: AWSError, data: DescribeMitigationActionResponse) -> Unit = definedExternally): Request<DescribeMitigationActionResponse, AWSError>
    open fun describeMitigationAction(callback: (err: AWSError, data: DescribeMitigationActionResponse) -> Unit = definedExternally): Request<DescribeMitigationActionResponse, AWSError>
    open fun describeProvisioningTemplate(params: DescribeProvisioningTemplateRequest, callback: (err: AWSError, data: DescribeProvisioningTemplateResponse) -> Unit = definedExternally): Request<DescribeProvisioningTemplateResponse, AWSError>
    open fun describeProvisioningTemplate(callback: (err: AWSError, data: DescribeProvisioningTemplateResponse) -> Unit = definedExternally): Request<DescribeProvisioningTemplateResponse, AWSError>
    open fun describeProvisioningTemplateVersion(params: DescribeProvisioningTemplateVersionRequest, callback: (err: AWSError, data: DescribeProvisioningTemplateVersionResponse) -> Unit = definedExternally): Request<DescribeProvisioningTemplateVersionResponse, AWSError>
    open fun describeProvisioningTemplateVersion(callback: (err: AWSError, data: DescribeProvisioningTemplateVersionResponse) -> Unit = definedExternally): Request<DescribeProvisioningTemplateVersionResponse, AWSError>
    open fun describeRoleAlias(params: DescribeRoleAliasRequest, callback: (err: AWSError, data: DescribeRoleAliasResponse) -> Unit = definedExternally): Request<DescribeRoleAliasResponse, AWSError>
    open fun describeRoleAlias(callback: (err: AWSError, data: DescribeRoleAliasResponse) -> Unit = definedExternally): Request<DescribeRoleAliasResponse, AWSError>
    open fun describeScheduledAudit(params: DescribeScheduledAuditRequest, callback: (err: AWSError, data: DescribeScheduledAuditResponse) -> Unit = definedExternally): Request<DescribeScheduledAuditResponse, AWSError>
    open fun describeScheduledAudit(callback: (err: AWSError, data: DescribeScheduledAuditResponse) -> Unit = definedExternally): Request<DescribeScheduledAuditResponse, AWSError>
    open fun describeSecurityProfile(params: DescribeSecurityProfileRequest, callback: (err: AWSError, data: DescribeSecurityProfileResponse) -> Unit = definedExternally): Request<DescribeSecurityProfileResponse, AWSError>
    open fun describeSecurityProfile(callback: (err: AWSError, data: DescribeSecurityProfileResponse) -> Unit = definedExternally): Request<DescribeSecurityProfileResponse, AWSError>
    open fun describeStream(params: DescribeStreamRequest, callback: (err: AWSError, data: DescribeStreamResponse) -> Unit = definedExternally): Request<DescribeStreamResponse, AWSError>
    open fun describeStream(callback: (err: AWSError, data: DescribeStreamResponse) -> Unit = definedExternally): Request<DescribeStreamResponse, AWSError>
    open fun describeThing(params: DescribeThingRequest, callback: (err: AWSError, data: DescribeThingResponse) -> Unit = definedExternally): Request<DescribeThingResponse, AWSError>
    open fun describeThing(callback: (err: AWSError, data: DescribeThingResponse) -> Unit = definedExternally): Request<DescribeThingResponse, AWSError>
    open fun describeThingGroup(params: DescribeThingGroupRequest, callback: (err: AWSError, data: DescribeThingGroupResponse) -> Unit = definedExternally): Request<DescribeThingGroupResponse, AWSError>
    open fun describeThingGroup(callback: (err: AWSError, data: DescribeThingGroupResponse) -> Unit = definedExternally): Request<DescribeThingGroupResponse, AWSError>
    open fun describeThingRegistrationTask(params: DescribeThingRegistrationTaskRequest, callback: (err: AWSError, data: DescribeThingRegistrationTaskResponse) -> Unit = definedExternally): Request<DescribeThingRegistrationTaskResponse, AWSError>
    open fun describeThingRegistrationTask(callback: (err: AWSError, data: DescribeThingRegistrationTaskResponse) -> Unit = definedExternally): Request<DescribeThingRegistrationTaskResponse, AWSError>
    open fun describeThingType(params: DescribeThingTypeRequest, callback: (err: AWSError, data: DescribeThingTypeResponse) -> Unit = definedExternally): Request<DescribeThingTypeResponse, AWSError>
    open fun describeThingType(callback: (err: AWSError, data: DescribeThingTypeResponse) -> Unit = definedExternally): Request<DescribeThingTypeResponse, AWSError>
    open fun detachPolicy(params: DetachPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachPrincipalPolicy(params: DetachPrincipalPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachPrincipalPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachSecurityProfile(params: DetachSecurityProfileRequest, callback: (err: AWSError, data: DetachSecurityProfileResponse) -> Unit = definedExternally): Request<DetachSecurityProfileResponse, AWSError>
    open fun detachSecurityProfile(callback: (err: AWSError, data: DetachSecurityProfileResponse) -> Unit = definedExternally): Request<DetachSecurityProfileResponse, AWSError>
    open fun detachThingPrincipal(params: DetachThingPrincipalRequest, callback: (err: AWSError, data: DetachThingPrincipalResponse) -> Unit = definedExternally): Request<DetachThingPrincipalResponse, AWSError>
    open fun detachThingPrincipal(callback: (err: AWSError, data: DetachThingPrincipalResponse) -> Unit = definedExternally): Request<DetachThingPrincipalResponse, AWSError>
    open fun disableTopicRule(params: DisableTopicRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableTopicRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableTopicRule(params: EnableTopicRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableTopicRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getCardinality(params: GetCardinalityRequest, callback: (err: AWSError, data: GetCardinalityResponse) -> Unit = definedExternally): Request<GetCardinalityResponse, AWSError>
    open fun getCardinality(callback: (err: AWSError, data: GetCardinalityResponse) -> Unit = definedExternally): Request<GetCardinalityResponse, AWSError>
    open fun getEffectivePolicies(params: GetEffectivePoliciesRequest, callback: (err: AWSError, data: GetEffectivePoliciesResponse) -> Unit = definedExternally): Request<GetEffectivePoliciesResponse, AWSError>
    open fun getEffectivePolicies(callback: (err: AWSError, data: GetEffectivePoliciesResponse) -> Unit = definedExternally): Request<GetEffectivePoliciesResponse, AWSError>
    open fun getIndexingConfiguration(params: GetIndexingConfigurationRequest, callback: (err: AWSError, data: GetIndexingConfigurationResponse) -> Unit = definedExternally): Request<GetIndexingConfigurationResponse, AWSError>
    open fun getIndexingConfiguration(callback: (err: AWSError, data: GetIndexingConfigurationResponse) -> Unit = definedExternally): Request<GetIndexingConfigurationResponse, AWSError>
    open fun getJobDocument(params: GetJobDocumentRequest, callback: (err: AWSError, data: GetJobDocumentResponse) -> Unit = definedExternally): Request<GetJobDocumentResponse, AWSError>
    open fun getJobDocument(callback: (err: AWSError, data: GetJobDocumentResponse) -> Unit = definedExternally): Request<GetJobDocumentResponse, AWSError>
    open fun getLoggingOptions(params: GetLoggingOptionsRequest, callback: (err: AWSError, data: GetLoggingOptionsResponse) -> Unit = definedExternally): Request<GetLoggingOptionsResponse, AWSError>
    open fun getLoggingOptions(callback: (err: AWSError, data: GetLoggingOptionsResponse) -> Unit = definedExternally): Request<GetLoggingOptionsResponse, AWSError>
    open fun getOTAUpdate(params: GetOTAUpdateRequest, callback: (err: AWSError, data: GetOTAUpdateResponse) -> Unit = definedExternally): Request<GetOTAUpdateResponse, AWSError>
    open fun getOTAUpdate(callback: (err: AWSError, data: GetOTAUpdateResponse) -> Unit = definedExternally): Request<GetOTAUpdateResponse, AWSError>
    open fun getPercentiles(params: GetPercentilesRequest, callback: (err: AWSError, data: GetPercentilesResponse) -> Unit = definedExternally): Request<GetPercentilesResponse, AWSError>
    open fun getPercentiles(callback: (err: AWSError, data: GetPercentilesResponse) -> Unit = definedExternally): Request<GetPercentilesResponse, AWSError>
    open fun getPolicy(params: GetPolicyRequest, callback: (err: AWSError, data: GetPolicyResponse) -> Unit = definedExternally): Request<GetPolicyResponse, AWSError>
    open fun getPolicy(callback: (err: AWSError, data: GetPolicyResponse) -> Unit = definedExternally): Request<GetPolicyResponse, AWSError>
    open fun getPolicyVersion(params: GetPolicyVersionRequest, callback: (err: AWSError, data: GetPolicyVersionResponse) -> Unit = definedExternally): Request<GetPolicyVersionResponse, AWSError>
    open fun getPolicyVersion(callback: (err: AWSError, data: GetPolicyVersionResponse) -> Unit = definedExternally): Request<GetPolicyVersionResponse, AWSError>
    open fun getRegistrationCode(params: GetRegistrationCodeRequest, callback: (err: AWSError, data: GetRegistrationCodeResponse) -> Unit = definedExternally): Request<GetRegistrationCodeResponse, AWSError>
    open fun getRegistrationCode(callback: (err: AWSError, data: GetRegistrationCodeResponse) -> Unit = definedExternally): Request<GetRegistrationCodeResponse, AWSError>
    open fun getStatistics(params: GetStatisticsRequest, callback: (err: AWSError, data: GetStatisticsResponse) -> Unit = definedExternally): Request<GetStatisticsResponse, AWSError>
    open fun getStatistics(callback: (err: AWSError, data: GetStatisticsResponse) -> Unit = definedExternally): Request<GetStatisticsResponse, AWSError>
    open fun getTopicRule(params: GetTopicRuleRequest, callback: (err: AWSError, data: GetTopicRuleResponse) -> Unit = definedExternally): Request<GetTopicRuleResponse, AWSError>
    open fun getTopicRule(callback: (err: AWSError, data: GetTopicRuleResponse) -> Unit = definedExternally): Request<GetTopicRuleResponse, AWSError>
    open fun getTopicRuleDestination(params: GetTopicRuleDestinationRequest, callback: (err: AWSError, data: GetTopicRuleDestinationResponse) -> Unit = definedExternally): Request<GetTopicRuleDestinationResponse, AWSError>
    open fun getTopicRuleDestination(callback: (err: AWSError, data: GetTopicRuleDestinationResponse) -> Unit = definedExternally): Request<GetTopicRuleDestinationResponse, AWSError>
    open fun getV2LoggingOptions(params: GetV2LoggingOptionsRequest, callback: (err: AWSError, data: GetV2LoggingOptionsResponse) -> Unit = definedExternally): Request<GetV2LoggingOptionsResponse, AWSError>
    open fun getV2LoggingOptions(callback: (err: AWSError, data: GetV2LoggingOptionsResponse) -> Unit = definedExternally): Request<GetV2LoggingOptionsResponse, AWSError>
    open fun listActiveViolations(params: ListActiveViolationsRequest, callback: (err: AWSError, data: ListActiveViolationsResponse) -> Unit = definedExternally): Request<ListActiveViolationsResponse, AWSError>
    open fun listActiveViolations(callback: (err: AWSError, data: ListActiveViolationsResponse) -> Unit = definedExternally): Request<ListActiveViolationsResponse, AWSError>
    open fun listAttachedPolicies(params: ListAttachedPoliciesRequest, callback: (err: AWSError, data: ListAttachedPoliciesResponse) -> Unit = definedExternally): Request<ListAttachedPoliciesResponse, AWSError>
    open fun listAttachedPolicies(callback: (err: AWSError, data: ListAttachedPoliciesResponse) -> Unit = definedExternally): Request<ListAttachedPoliciesResponse, AWSError>
    open fun listAuditFindings(params: ListAuditFindingsRequest, callback: (err: AWSError, data: ListAuditFindingsResponse) -> Unit = definedExternally): Request<ListAuditFindingsResponse, AWSError>
    open fun listAuditFindings(callback: (err: AWSError, data: ListAuditFindingsResponse) -> Unit = definedExternally): Request<ListAuditFindingsResponse, AWSError>
    open fun listAuditMitigationActionsExecutions(params: ListAuditMitigationActionsExecutionsRequest, callback: (err: AWSError, data: ListAuditMitigationActionsExecutionsResponse) -> Unit = definedExternally): Request<ListAuditMitigationActionsExecutionsResponse, AWSError>
    open fun listAuditMitigationActionsExecutions(callback: (err: AWSError, data: ListAuditMitigationActionsExecutionsResponse) -> Unit = definedExternally): Request<ListAuditMitigationActionsExecutionsResponse, AWSError>
    open fun listAuditMitigationActionsTasks(params: ListAuditMitigationActionsTasksRequest, callback: (err: AWSError, data: ListAuditMitigationActionsTasksResponse) -> Unit = definedExternally): Request<ListAuditMitigationActionsTasksResponse, AWSError>
    open fun listAuditMitigationActionsTasks(callback: (err: AWSError, data: ListAuditMitigationActionsTasksResponse) -> Unit = definedExternally): Request<ListAuditMitigationActionsTasksResponse, AWSError>
    open fun listAuditTasks(params: ListAuditTasksRequest, callback: (err: AWSError, data: ListAuditTasksResponse) -> Unit = definedExternally): Request<ListAuditTasksResponse, AWSError>
    open fun listAuditTasks(callback: (err: AWSError, data: ListAuditTasksResponse) -> Unit = definedExternally): Request<ListAuditTasksResponse, AWSError>
    open fun listAuthorizers(params: ListAuthorizersRequest, callback: (err: AWSError, data: ListAuthorizersResponse) -> Unit = definedExternally): Request<ListAuthorizersResponse, AWSError>
    open fun listAuthorizers(callback: (err: AWSError, data: ListAuthorizersResponse) -> Unit = definedExternally): Request<ListAuthorizersResponse, AWSError>
    open fun listBillingGroups(params: ListBillingGroupsRequest, callback: (err: AWSError, data: ListBillingGroupsResponse) -> Unit = definedExternally): Request<ListBillingGroupsResponse, AWSError>
    open fun listBillingGroups(callback: (err: AWSError, data: ListBillingGroupsResponse) -> Unit = definedExternally): Request<ListBillingGroupsResponse, AWSError>
    open fun listCACertificates(params: ListCACertificatesRequest, callback: (err: AWSError, data: ListCACertificatesResponse) -> Unit = definedExternally): Request<ListCACertificatesResponse, AWSError>
    open fun listCACertificates(callback: (err: AWSError, data: ListCACertificatesResponse) -> Unit = definedExternally): Request<ListCACertificatesResponse, AWSError>
    open fun listCertificates(params: ListCertificatesRequest, callback: (err: AWSError, data: ListCertificatesResponse) -> Unit = definedExternally): Request<ListCertificatesResponse, AWSError>
    open fun listCertificates(callback: (err: AWSError, data: ListCertificatesResponse) -> Unit = definedExternally): Request<ListCertificatesResponse, AWSError>
    open fun listCertificatesByCA(params: ListCertificatesByCARequest, callback: (err: AWSError, data: ListCertificatesByCAResponse) -> Unit = definedExternally): Request<ListCertificatesByCAResponse, AWSError>
    open fun listCertificatesByCA(callback: (err: AWSError, data: ListCertificatesByCAResponse) -> Unit = definedExternally): Request<ListCertificatesByCAResponse, AWSError>
    open fun listDomainConfigurations(params: ListDomainConfigurationsRequest, callback: (err: AWSError, data: ListDomainConfigurationsResponse) -> Unit = definedExternally): Request<ListDomainConfigurationsResponse, AWSError>
    open fun listDomainConfigurations(callback: (err: AWSError, data: ListDomainConfigurationsResponse) -> Unit = definedExternally): Request<ListDomainConfigurationsResponse, AWSError>
    open fun listIndices(params: ListIndicesRequest, callback: (err: AWSError, data: ListIndicesResponse) -> Unit = definedExternally): Request<ListIndicesResponse, AWSError>
    open fun listIndices(callback: (err: AWSError, data: ListIndicesResponse) -> Unit = definedExternally): Request<ListIndicesResponse, AWSError>
    open fun listJobExecutionsForJob(params: ListJobExecutionsForJobRequest, callback: (err: AWSError, data: ListJobExecutionsForJobResponse) -> Unit = definedExternally): Request<ListJobExecutionsForJobResponse, AWSError>
    open fun listJobExecutionsForJob(callback: (err: AWSError, data: ListJobExecutionsForJobResponse) -> Unit = definedExternally): Request<ListJobExecutionsForJobResponse, AWSError>
    open fun listJobExecutionsForThing(params: ListJobExecutionsForThingRequest, callback: (err: AWSError, data: ListJobExecutionsForThingResponse) -> Unit = definedExternally): Request<ListJobExecutionsForThingResponse, AWSError>
    open fun listJobExecutionsForThing(callback: (err: AWSError, data: ListJobExecutionsForThingResponse) -> Unit = definedExternally): Request<ListJobExecutionsForThingResponse, AWSError>
    open fun listJobs(params: ListJobsRequest, callback: (err: AWSError, data: ListJobsResponse) -> Unit = definedExternally): Request<ListJobsResponse, AWSError>
    open fun listJobs(callback: (err: AWSError, data: ListJobsResponse) -> Unit = definedExternally): Request<ListJobsResponse, AWSError>
    open fun listMitigationActions(params: ListMitigationActionsRequest, callback: (err: AWSError, data: ListMitigationActionsResponse) -> Unit = definedExternally): Request<ListMitigationActionsResponse, AWSError>
    open fun listMitigationActions(callback: (err: AWSError, data: ListMitigationActionsResponse) -> Unit = definedExternally): Request<ListMitigationActionsResponse, AWSError>
    open fun listOTAUpdates(params: ListOTAUpdatesRequest, callback: (err: AWSError, data: ListOTAUpdatesResponse) -> Unit = definedExternally): Request<ListOTAUpdatesResponse, AWSError>
    open fun listOTAUpdates(callback: (err: AWSError, data: ListOTAUpdatesResponse) -> Unit = definedExternally): Request<ListOTAUpdatesResponse, AWSError>
    open fun listOutgoingCertificates(params: ListOutgoingCertificatesRequest, callback: (err: AWSError, data: ListOutgoingCertificatesResponse) -> Unit = definedExternally): Request<ListOutgoingCertificatesResponse, AWSError>
    open fun listOutgoingCertificates(callback: (err: AWSError, data: ListOutgoingCertificatesResponse) -> Unit = definedExternally): Request<ListOutgoingCertificatesResponse, AWSError>
    open fun listPolicies(params: ListPoliciesRequest, callback: (err: AWSError, data: ListPoliciesResponse) -> Unit = definedExternally): Request<ListPoliciesResponse, AWSError>
    open fun listPolicies(callback: (err: AWSError, data: ListPoliciesResponse) -> Unit = definedExternally): Request<ListPoliciesResponse, AWSError>
    open fun listPolicyPrincipals(params: ListPolicyPrincipalsRequest, callback: (err: AWSError, data: ListPolicyPrincipalsResponse) -> Unit = definedExternally): Request<ListPolicyPrincipalsResponse, AWSError>
    open fun listPolicyPrincipals(callback: (err: AWSError, data: ListPolicyPrincipalsResponse) -> Unit = definedExternally): Request<ListPolicyPrincipalsResponse, AWSError>
    open fun listPolicyVersions(params: ListPolicyVersionsRequest, callback: (err: AWSError, data: ListPolicyVersionsResponse) -> Unit = definedExternally): Request<ListPolicyVersionsResponse, AWSError>
    open fun listPolicyVersions(callback: (err: AWSError, data: ListPolicyVersionsResponse) -> Unit = definedExternally): Request<ListPolicyVersionsResponse, AWSError>
    open fun listPrincipalPolicies(params: ListPrincipalPoliciesRequest, callback: (err: AWSError, data: ListPrincipalPoliciesResponse) -> Unit = definedExternally): Request<ListPrincipalPoliciesResponse, AWSError>
    open fun listPrincipalPolicies(callback: (err: AWSError, data: ListPrincipalPoliciesResponse) -> Unit = definedExternally): Request<ListPrincipalPoliciesResponse, AWSError>
    open fun listPrincipalThings(params: ListPrincipalThingsRequest, callback: (err: AWSError, data: ListPrincipalThingsResponse) -> Unit = definedExternally): Request<ListPrincipalThingsResponse, AWSError>
    open fun listPrincipalThings(callback: (err: AWSError, data: ListPrincipalThingsResponse) -> Unit = definedExternally): Request<ListPrincipalThingsResponse, AWSError>
    open fun listProvisioningTemplateVersions(params: ListProvisioningTemplateVersionsRequest, callback: (err: AWSError, data: ListProvisioningTemplateVersionsResponse) -> Unit = definedExternally): Request<ListProvisioningTemplateVersionsResponse, AWSError>
    open fun listProvisioningTemplateVersions(callback: (err: AWSError, data: ListProvisioningTemplateVersionsResponse) -> Unit = definedExternally): Request<ListProvisioningTemplateVersionsResponse, AWSError>
    open fun listProvisioningTemplates(params: ListProvisioningTemplatesRequest, callback: (err: AWSError, data: ListProvisioningTemplatesResponse) -> Unit = definedExternally): Request<ListProvisioningTemplatesResponse, AWSError>
    open fun listProvisioningTemplates(callback: (err: AWSError, data: ListProvisioningTemplatesResponse) -> Unit = definedExternally): Request<ListProvisioningTemplatesResponse, AWSError>
    open fun listRoleAliases(params: ListRoleAliasesRequest, callback: (err: AWSError, data: ListRoleAliasesResponse) -> Unit = definedExternally): Request<ListRoleAliasesResponse, AWSError>
    open fun listRoleAliases(callback: (err: AWSError, data: ListRoleAliasesResponse) -> Unit = definedExternally): Request<ListRoleAliasesResponse, AWSError>
    open fun listScheduledAudits(params: ListScheduledAuditsRequest, callback: (err: AWSError, data: ListScheduledAuditsResponse) -> Unit = definedExternally): Request<ListScheduledAuditsResponse, AWSError>
    open fun listScheduledAudits(callback: (err: AWSError, data: ListScheduledAuditsResponse) -> Unit = definedExternally): Request<ListScheduledAuditsResponse, AWSError>
    open fun listSecurityProfiles(params: ListSecurityProfilesRequest, callback: (err: AWSError, data: ListSecurityProfilesResponse) -> Unit = definedExternally): Request<ListSecurityProfilesResponse, AWSError>
    open fun listSecurityProfiles(callback: (err: AWSError, data: ListSecurityProfilesResponse) -> Unit = definedExternally): Request<ListSecurityProfilesResponse, AWSError>
    open fun listSecurityProfilesForTarget(params: ListSecurityProfilesForTargetRequest, callback: (err: AWSError, data: ListSecurityProfilesForTargetResponse) -> Unit = definedExternally): Request<ListSecurityProfilesForTargetResponse, AWSError>
    open fun listSecurityProfilesForTarget(callback: (err: AWSError, data: ListSecurityProfilesForTargetResponse) -> Unit = definedExternally): Request<ListSecurityProfilesForTargetResponse, AWSError>
    open fun listStreams(params: ListStreamsRequest, callback: (err: AWSError, data: ListStreamsResponse) -> Unit = definedExternally): Request<ListStreamsResponse, AWSError>
    open fun listStreams(callback: (err: AWSError, data: ListStreamsResponse) -> Unit = definedExternally): Request<ListStreamsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTargetsForPolicy(params: ListTargetsForPolicyRequest, callback: (err: AWSError, data: ListTargetsForPolicyResponse) -> Unit = definedExternally): Request<ListTargetsForPolicyResponse, AWSError>
    open fun listTargetsForPolicy(callback: (err: AWSError, data: ListTargetsForPolicyResponse) -> Unit = definedExternally): Request<ListTargetsForPolicyResponse, AWSError>
    open fun listTargetsForSecurityProfile(params: ListTargetsForSecurityProfileRequest, callback: (err: AWSError, data: ListTargetsForSecurityProfileResponse) -> Unit = definedExternally): Request<ListTargetsForSecurityProfileResponse, AWSError>
    open fun listTargetsForSecurityProfile(callback: (err: AWSError, data: ListTargetsForSecurityProfileResponse) -> Unit = definedExternally): Request<ListTargetsForSecurityProfileResponse, AWSError>
    open fun listThingGroups(params: ListThingGroupsRequest, callback: (err: AWSError, data: ListThingGroupsResponse) -> Unit = definedExternally): Request<ListThingGroupsResponse, AWSError>
    open fun listThingGroups(callback: (err: AWSError, data: ListThingGroupsResponse) -> Unit = definedExternally): Request<ListThingGroupsResponse, AWSError>
    open fun listThingGroupsForThing(params: ListThingGroupsForThingRequest, callback: (err: AWSError, data: ListThingGroupsForThingResponse) -> Unit = definedExternally): Request<ListThingGroupsForThingResponse, AWSError>
    open fun listThingGroupsForThing(callback: (err: AWSError, data: ListThingGroupsForThingResponse) -> Unit = definedExternally): Request<ListThingGroupsForThingResponse, AWSError>
    open fun listThingPrincipals(params: ListThingPrincipalsRequest, callback: (err: AWSError, data: ListThingPrincipalsResponse) -> Unit = definedExternally): Request<ListThingPrincipalsResponse, AWSError>
    open fun listThingPrincipals(callback: (err: AWSError, data: ListThingPrincipalsResponse) -> Unit = definedExternally): Request<ListThingPrincipalsResponse, AWSError>
    open fun listThingRegistrationTaskReports(params: ListThingRegistrationTaskReportsRequest, callback: (err: AWSError, data: ListThingRegistrationTaskReportsResponse) -> Unit = definedExternally): Request<ListThingRegistrationTaskReportsResponse, AWSError>
    open fun listThingRegistrationTaskReports(callback: (err: AWSError, data: ListThingRegistrationTaskReportsResponse) -> Unit = definedExternally): Request<ListThingRegistrationTaskReportsResponse, AWSError>
    open fun listThingRegistrationTasks(params: ListThingRegistrationTasksRequest, callback: (err: AWSError, data: ListThingRegistrationTasksResponse) -> Unit = definedExternally): Request<ListThingRegistrationTasksResponse, AWSError>
    open fun listThingRegistrationTasks(callback: (err: AWSError, data: ListThingRegistrationTasksResponse) -> Unit = definedExternally): Request<ListThingRegistrationTasksResponse, AWSError>
    open fun listThingTypes(params: ListThingTypesRequest, callback: (err: AWSError, data: ListThingTypesResponse) -> Unit = definedExternally): Request<ListThingTypesResponse, AWSError>
    open fun listThingTypes(callback: (err: AWSError, data: ListThingTypesResponse) -> Unit = definedExternally): Request<ListThingTypesResponse, AWSError>
    open fun listThings(params: ListThingsRequest, callback: (err: AWSError, data: ListThingsResponse) -> Unit = definedExternally): Request<ListThingsResponse, AWSError>
    open fun listThings(callback: (err: AWSError, data: ListThingsResponse) -> Unit = definedExternally): Request<ListThingsResponse, AWSError>
    open fun listThingsInBillingGroup(params: ListThingsInBillingGroupRequest, callback: (err: AWSError, data: ListThingsInBillingGroupResponse) -> Unit = definedExternally): Request<ListThingsInBillingGroupResponse, AWSError>
    open fun listThingsInBillingGroup(callback: (err: AWSError, data: ListThingsInBillingGroupResponse) -> Unit = definedExternally): Request<ListThingsInBillingGroupResponse, AWSError>
    open fun listThingsInThingGroup(params: ListThingsInThingGroupRequest, callback: (err: AWSError, data: ListThingsInThingGroupResponse) -> Unit = definedExternally): Request<ListThingsInThingGroupResponse, AWSError>
    open fun listThingsInThingGroup(callback: (err: AWSError, data: ListThingsInThingGroupResponse) -> Unit = definedExternally): Request<ListThingsInThingGroupResponse, AWSError>
    open fun listTopicRuleDestinations(params: ListTopicRuleDestinationsRequest, callback: (err: AWSError, data: ListTopicRuleDestinationsResponse) -> Unit = definedExternally): Request<ListTopicRuleDestinationsResponse, AWSError>
    open fun listTopicRuleDestinations(callback: (err: AWSError, data: ListTopicRuleDestinationsResponse) -> Unit = definedExternally): Request<ListTopicRuleDestinationsResponse, AWSError>
    open fun listTopicRules(params: ListTopicRulesRequest, callback: (err: AWSError, data: ListTopicRulesResponse) -> Unit = definedExternally): Request<ListTopicRulesResponse, AWSError>
    open fun listTopicRules(callback: (err: AWSError, data: ListTopicRulesResponse) -> Unit = definedExternally): Request<ListTopicRulesResponse, AWSError>
    open fun listV2LoggingLevels(params: ListV2LoggingLevelsRequest, callback: (err: AWSError, data: ListV2LoggingLevelsResponse) -> Unit = definedExternally): Request<ListV2LoggingLevelsResponse, AWSError>
    open fun listV2LoggingLevels(callback: (err: AWSError, data: ListV2LoggingLevelsResponse) -> Unit = definedExternally): Request<ListV2LoggingLevelsResponse, AWSError>
    open fun listViolationEvents(params: ListViolationEventsRequest, callback: (err: AWSError, data: ListViolationEventsResponse) -> Unit = definedExternally): Request<ListViolationEventsResponse, AWSError>
    open fun listViolationEvents(callback: (err: AWSError, data: ListViolationEventsResponse) -> Unit = definedExternally): Request<ListViolationEventsResponse, AWSError>
    open fun registerCACertificate(params: RegisterCACertificateRequest, callback: (err: AWSError, data: RegisterCACertificateResponse) -> Unit = definedExternally): Request<RegisterCACertificateResponse, AWSError>
    open fun registerCACertificate(callback: (err: AWSError, data: RegisterCACertificateResponse) -> Unit = definedExternally): Request<RegisterCACertificateResponse, AWSError>
    open fun registerCertificate(params: RegisterCertificateRequest, callback: (err: AWSError, data: RegisterCertificateResponse) -> Unit = definedExternally): Request<RegisterCertificateResponse, AWSError>
    open fun registerCertificate(callback: (err: AWSError, data: RegisterCertificateResponse) -> Unit = definedExternally): Request<RegisterCertificateResponse, AWSError>
    open fun registerThing(params: RegisterThingRequest, callback: (err: AWSError, data: RegisterThingResponse) -> Unit = definedExternally): Request<RegisterThingResponse, AWSError>
    open fun registerThing(callback: (err: AWSError, data: RegisterThingResponse) -> Unit = definedExternally): Request<RegisterThingResponse, AWSError>
    open fun rejectCertificateTransfer(params: RejectCertificateTransferRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun rejectCertificateTransfer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeThingFromBillingGroup(params: RemoveThingFromBillingGroupRequest, callback: (err: AWSError, data: RemoveThingFromBillingGroupResponse) -> Unit = definedExternally): Request<RemoveThingFromBillingGroupResponse, AWSError>
    open fun removeThingFromBillingGroup(callback: (err: AWSError, data: RemoveThingFromBillingGroupResponse) -> Unit = definedExternally): Request<RemoveThingFromBillingGroupResponse, AWSError>
    open fun removeThingFromThingGroup(params: RemoveThingFromThingGroupRequest, callback: (err: AWSError, data: RemoveThingFromThingGroupResponse) -> Unit = definedExternally): Request<RemoveThingFromThingGroupResponse, AWSError>
    open fun removeThingFromThingGroup(callback: (err: AWSError, data: RemoveThingFromThingGroupResponse) -> Unit = definedExternally): Request<RemoveThingFromThingGroupResponse, AWSError>
    open fun replaceTopicRule(params: ReplaceTopicRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun replaceTopicRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun searchIndex(params: SearchIndexRequest, callback: (err: AWSError, data: SearchIndexResponse) -> Unit = definedExternally): Request<SearchIndexResponse, AWSError>
    open fun searchIndex(callback: (err: AWSError, data: SearchIndexResponse) -> Unit = definedExternally): Request<SearchIndexResponse, AWSError>
    open fun setDefaultAuthorizer(params: SetDefaultAuthorizerRequest, callback: (err: AWSError, data: SetDefaultAuthorizerResponse) -> Unit = definedExternally): Request<SetDefaultAuthorizerResponse, AWSError>
    open fun setDefaultAuthorizer(callback: (err: AWSError, data: SetDefaultAuthorizerResponse) -> Unit = definedExternally): Request<SetDefaultAuthorizerResponse, AWSError>
    open fun setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setDefaultPolicyVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setLoggingOptions(params: SetLoggingOptionsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setLoggingOptions(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setV2LoggingLevel(params: SetV2LoggingLevelRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setV2LoggingLevel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setV2LoggingOptions(params: SetV2LoggingOptionsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setV2LoggingOptions(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startAuditMitigationActionsTask(params: StartAuditMitigationActionsTaskRequest, callback: (err: AWSError, data: StartAuditMitigationActionsTaskResponse) -> Unit = definedExternally): Request<StartAuditMitigationActionsTaskResponse, AWSError>
    open fun startAuditMitigationActionsTask(callback: (err: AWSError, data: StartAuditMitigationActionsTaskResponse) -> Unit = definedExternally): Request<StartAuditMitigationActionsTaskResponse, AWSError>
    open fun startOnDemandAuditTask(params: StartOnDemandAuditTaskRequest, callback: (err: AWSError, data: StartOnDemandAuditTaskResponse) -> Unit = definedExternally): Request<StartOnDemandAuditTaskResponse, AWSError>
    open fun startOnDemandAuditTask(callback: (err: AWSError, data: StartOnDemandAuditTaskResponse) -> Unit = definedExternally): Request<StartOnDemandAuditTaskResponse, AWSError>
    open fun startThingRegistrationTask(params: StartThingRegistrationTaskRequest, callback: (err: AWSError, data: StartThingRegistrationTaskResponse) -> Unit = definedExternally): Request<StartThingRegistrationTaskResponse, AWSError>
    open fun startThingRegistrationTask(callback: (err: AWSError, data: StartThingRegistrationTaskResponse) -> Unit = definedExternally): Request<StartThingRegistrationTaskResponse, AWSError>
    open fun stopThingRegistrationTask(params: StopThingRegistrationTaskRequest, callback: (err: AWSError, data: StopThingRegistrationTaskResponse) -> Unit = definedExternally): Request<StopThingRegistrationTaskResponse, AWSError>
    open fun stopThingRegistrationTask(callback: (err: AWSError, data: StopThingRegistrationTaskResponse) -> Unit = definedExternally): Request<StopThingRegistrationTaskResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun testAuthorization(params: TestAuthorizationRequest, callback: (err: AWSError, data: TestAuthorizationResponse) -> Unit = definedExternally): Request<TestAuthorizationResponse, AWSError>
    open fun testAuthorization(callback: (err: AWSError, data: TestAuthorizationResponse) -> Unit = definedExternally): Request<TestAuthorizationResponse, AWSError>
    open fun testInvokeAuthorizer(params: TestInvokeAuthorizerRequest, callback: (err: AWSError, data: TestInvokeAuthorizerResponse) -> Unit = definedExternally): Request<TestInvokeAuthorizerResponse, AWSError>
    open fun testInvokeAuthorizer(callback: (err: AWSError, data: TestInvokeAuthorizerResponse) -> Unit = definedExternally): Request<TestInvokeAuthorizerResponse, AWSError>
    open fun transferCertificate(params: TransferCertificateRequest, callback: (err: AWSError, data: TransferCertificateResponse) -> Unit = definedExternally): Request<TransferCertificateResponse, AWSError>
    open fun transferCertificate(callback: (err: AWSError, data: TransferCertificateResponse) -> Unit = definedExternally): Request<TransferCertificateResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateAccountAuditConfiguration(params: UpdateAccountAuditConfigurationRequest, callback: (err: AWSError, data: UpdateAccountAuditConfigurationResponse) -> Unit = definedExternally): Request<UpdateAccountAuditConfigurationResponse, AWSError>
    open fun updateAccountAuditConfiguration(callback: (err: AWSError, data: UpdateAccountAuditConfigurationResponse) -> Unit = definedExternally): Request<UpdateAccountAuditConfigurationResponse, AWSError>
    open fun updateAuthorizer(params: UpdateAuthorizerRequest, callback: (err: AWSError, data: UpdateAuthorizerResponse) -> Unit = definedExternally): Request<UpdateAuthorizerResponse, AWSError>
    open fun updateAuthorizer(callback: (err: AWSError, data: UpdateAuthorizerResponse) -> Unit = definedExternally): Request<UpdateAuthorizerResponse, AWSError>
    open fun updateBillingGroup(params: UpdateBillingGroupRequest, callback: (err: AWSError, data: UpdateBillingGroupResponse) -> Unit = definedExternally): Request<UpdateBillingGroupResponse, AWSError>
    open fun updateBillingGroup(callback: (err: AWSError, data: UpdateBillingGroupResponse) -> Unit = definedExternally): Request<UpdateBillingGroupResponse, AWSError>
    open fun updateCACertificate(params: UpdateCACertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateCACertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateCertificate(params: UpdateCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDomainConfiguration(params: UpdateDomainConfigurationRequest, callback: (err: AWSError, data: UpdateDomainConfigurationResponse) -> Unit = definedExternally): Request<UpdateDomainConfigurationResponse, AWSError>
    open fun updateDomainConfiguration(callback: (err: AWSError, data: UpdateDomainConfigurationResponse) -> Unit = definedExternally): Request<UpdateDomainConfigurationResponse, AWSError>
    open fun updateDynamicThingGroup(params: UpdateDynamicThingGroupRequest, callback: (err: AWSError, data: UpdateDynamicThingGroupResponse) -> Unit = definedExternally): Request<UpdateDynamicThingGroupResponse, AWSError>
    open fun updateDynamicThingGroup(callback: (err: AWSError, data: UpdateDynamicThingGroupResponse) -> Unit = definedExternally): Request<UpdateDynamicThingGroupResponse, AWSError>
    open fun updateEventConfigurations(params: UpdateEventConfigurationsRequest, callback: (err: AWSError, data: UpdateEventConfigurationsResponse) -> Unit = definedExternally): Request<UpdateEventConfigurationsResponse, AWSError>
    open fun updateEventConfigurations(callback: (err: AWSError, data: UpdateEventConfigurationsResponse) -> Unit = definedExternally): Request<UpdateEventConfigurationsResponse, AWSError>
    open fun updateIndexingConfiguration(params: UpdateIndexingConfigurationRequest, callback: (err: AWSError, data: UpdateIndexingConfigurationResponse) -> Unit = definedExternally): Request<UpdateIndexingConfigurationResponse, AWSError>
    open fun updateIndexingConfiguration(callback: (err: AWSError, data: UpdateIndexingConfigurationResponse) -> Unit = definedExternally): Request<UpdateIndexingConfigurationResponse, AWSError>
    open fun updateJob(params: UpdateJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateMitigationAction(params: UpdateMitigationActionRequest, callback: (err: AWSError, data: UpdateMitigationActionResponse) -> Unit = definedExternally): Request<UpdateMitigationActionResponse, AWSError>
    open fun updateMitigationAction(callback: (err: AWSError, data: UpdateMitigationActionResponse) -> Unit = definedExternally): Request<UpdateMitigationActionResponse, AWSError>
    open fun updateProvisioningTemplate(params: UpdateProvisioningTemplateRequest, callback: (err: AWSError, data: UpdateProvisioningTemplateResponse) -> Unit = definedExternally): Request<UpdateProvisioningTemplateResponse, AWSError>
    open fun updateProvisioningTemplate(callback: (err: AWSError, data: UpdateProvisioningTemplateResponse) -> Unit = definedExternally): Request<UpdateProvisioningTemplateResponse, AWSError>
    open fun updateRoleAlias(params: UpdateRoleAliasRequest, callback: (err: AWSError, data: UpdateRoleAliasResponse) -> Unit = definedExternally): Request<UpdateRoleAliasResponse, AWSError>
    open fun updateRoleAlias(callback: (err: AWSError, data: UpdateRoleAliasResponse) -> Unit = definedExternally): Request<UpdateRoleAliasResponse, AWSError>
    open fun updateScheduledAudit(params: UpdateScheduledAuditRequest, callback: (err: AWSError, data: UpdateScheduledAuditResponse) -> Unit = definedExternally): Request<UpdateScheduledAuditResponse, AWSError>
    open fun updateScheduledAudit(callback: (err: AWSError, data: UpdateScheduledAuditResponse) -> Unit = definedExternally): Request<UpdateScheduledAuditResponse, AWSError>
    open fun updateSecurityProfile(params: UpdateSecurityProfileRequest, callback: (err: AWSError, data: UpdateSecurityProfileResponse) -> Unit = definedExternally): Request<UpdateSecurityProfileResponse, AWSError>
    open fun updateSecurityProfile(callback: (err: AWSError, data: UpdateSecurityProfileResponse) -> Unit = definedExternally): Request<UpdateSecurityProfileResponse, AWSError>
    open fun updateStream(params: UpdateStreamRequest, callback: (err: AWSError, data: UpdateStreamResponse) -> Unit = definedExternally): Request<UpdateStreamResponse, AWSError>
    open fun updateStream(callback: (err: AWSError, data: UpdateStreamResponse) -> Unit = definedExternally): Request<UpdateStreamResponse, AWSError>
    open fun updateThing(params: UpdateThingRequest, callback: (err: AWSError, data: UpdateThingResponse) -> Unit = definedExternally): Request<UpdateThingResponse, AWSError>
    open fun updateThing(callback: (err: AWSError, data: UpdateThingResponse) -> Unit = definedExternally): Request<UpdateThingResponse, AWSError>
    open fun updateThingGroup(params: UpdateThingGroupRequest, callback: (err: AWSError, data: UpdateThingGroupResponse) -> Unit = definedExternally): Request<UpdateThingGroupResponse, AWSError>
    open fun updateThingGroup(callback: (err: AWSError, data: UpdateThingGroupResponse) -> Unit = definedExternally): Request<UpdateThingGroupResponse, AWSError>
    open fun updateThingGroupsForThing(params: UpdateThingGroupsForThingRequest, callback: (err: AWSError, data: UpdateThingGroupsForThingResponse) -> Unit = definedExternally): Request<UpdateThingGroupsForThingResponse, AWSError>
    open fun updateThingGroupsForThing(callback: (err: AWSError, data: UpdateThingGroupsForThingResponse) -> Unit = definedExternally): Request<UpdateThingGroupsForThingResponse, AWSError>
    open fun updateTopicRuleDestination(params: UpdateTopicRuleDestinationRequest, callback: (err: AWSError, data: UpdateTopicRuleDestinationResponse) -> Unit = definedExternally): Request<UpdateTopicRuleDestinationResponse, AWSError>
    open fun updateTopicRuleDestination(callback: (err: AWSError, data: UpdateTopicRuleDestinationResponse) -> Unit = definedExternally): Request<UpdateTopicRuleDestinationResponse, AWSError>
    open fun validateSecurityProfileBehaviors(params: ValidateSecurityProfileBehaviorsRequest, callback: (err: AWSError, data: ValidateSecurityProfileBehaviorsResponse) -> Unit = definedExternally): Request<ValidateSecurityProfileBehaviorsResponse, AWSError>
    open fun validateSecurityProfileBehaviors(callback: (err: AWSError, data: ValidateSecurityProfileBehaviorsResponse) -> Unit = definedExternally): Request<ValidateSecurityProfileBehaviorsResponse, AWSError>
    interface AbortConfig {
        var criteriaList: AbortCriteriaList
    }
    interface AbortCriteria {
        var failureType: String /* "FAILED" | "REJECTED" | "TIMED_OUT" | "ALL" | String */
        var action: String /* "CANCEL" | String */
        var thresholdPercentage: AbortThresholdPercentage
        var minNumberOfExecutedThings: MinimumNumberOfExecutedThings
    }
    interface AcceptCertificateTransferRequest {
        var certificateId: CertificateId
        var setAsActive: SetAsActive?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Action {
        var dynamoDB: DynamoDBAction?
            get() = definedExternally
            set(value) = definedExternally
        var dynamoDBv2: DynamoDBv2Action?
            get() = definedExternally
            set(value) = definedExternally
        var lambda: LambdaAction?
            get() = definedExternally
            set(value) = definedExternally
        var sns: SnsAction?
            get() = definedExternally
            set(value) = definedExternally
        var sqs: SqsAction?
            get() = definedExternally
            set(value) = definedExternally
        var kinesis: KinesisAction?
            get() = definedExternally
            set(value) = definedExternally
        var republish: RepublishAction?
            get() = definedExternally
            set(value) = definedExternally
        var s3: S3Action?
            get() = definedExternally
            set(value) = definedExternally
        var firehose: FirehoseAction?
            get() = definedExternally
            set(value) = definedExternally
        var cloudwatchMetric: CloudwatchMetricAction?
            get() = definedExternally
            set(value) = definedExternally
        var cloudwatchAlarm: CloudwatchAlarmAction?
            get() = definedExternally
            set(value) = definedExternally
        var cloudwatchLogs: CloudwatchLogsAction?
            get() = definedExternally
            set(value) = definedExternally
        var elasticsearch: ElasticsearchAction?
            get() = definedExternally
            set(value) = definedExternally
        var salesforce: SalesforceAction?
            get() = definedExternally
            set(value) = definedExternally
        var iotAnalytics: IotAnalyticsAction?
            get() = definedExternally
            set(value) = definedExternally
        var iotEvents: IotEventsAction?
            get() = definedExternally
            set(value) = definedExternally
        var iotSiteWise: IotSiteWiseAction?
            get() = definedExternally
            set(value) = definedExternally
        var stepFunctions: StepFunctionsAction?
            get() = definedExternally
            set(value) = definedExternally
        var http: HttpAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActiveViolation {
        var violationId: ViolationId?
            get() = definedExternally
            set(value) = definedExternally
        var thingName: DeviceDefenderThingName?
            get() = definedExternally
            set(value) = definedExternally
        var securityProfileName: SecurityProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var behavior: Behavior?
            get() = definedExternally
            set(value) = definedExternally
        var lastViolationValue: MetricValue?
            get() = definedExternally
            set(value) = definedExternally
        var lastViolationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var violationStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddThingToBillingGroupRequest {
        var billingGroupName: BillingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var billingGroupArn: BillingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var thingArn: ThingArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddThingToBillingGroupResponse
    interface AddThingToThingGroupRequest {
        var thingGroupName: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupArn: ThingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var thingArn: ThingArn?
            get() = definedExternally
            set(value) = definedExternally
        var overrideDynamicGroups: OverrideDynamicGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddThingToThingGroupResponse
    interface AddThingsToThingGroupParams {
        var thingGroupNames: ThingGroupNames
        var overrideDynamicGroups: OverrideDynamicGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdditionalParameterMap {
        @nativeGetter
        operator fun get(key: String): Value?
        @nativeSetter
        operator fun set(key: String, value: Value)
    }
    interface AlertTarget {
        var alertTargetArn: AlertTargetArn
        var roleArn: RoleArn
    }
    interface AlertTargets {
        @nativeGetter
        operator fun get(key: String): AlertTarget?
        @nativeSetter
        operator fun set(key: String, value: AlertTarget)
    }
    interface Allowed {
        var policies: Policies?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssetPropertyTimestamp {
        var timeInSeconds: AssetPropertyTimeInSeconds
        var offsetInNanos: AssetPropertyOffsetInNanos?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssetPropertyValue {
        var value: AssetPropertyVariant
        var timestamp: AssetPropertyTimestamp
        var quality: AssetPropertyQuality?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssetPropertyVariant {
        var stringValue: AssetPropertyStringValue?
            get() = definedExternally
            set(value) = definedExternally
        var integerValue: AssetPropertyIntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var doubleValue: AssetPropertyDoubleValue?
            get() = definedExternally
            set(value) = definedExternally
        var booleanValue: AssetPropertyBooleanValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateTargetsWithJobRequest {
        var targets: JobTargets
        var jobId: JobId
        var comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateTargetsWithJobResponse {
        var jobArn: JobArn?
            get() = definedExternally
            set(value) = definedExternally
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var description: JobDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachPolicyRequest {
        var policyName: PolicyName
        var target: PolicyTarget
    }
    interface AttachPrincipalPolicyRequest {
        var policyName: PolicyName
        var principal: Principal
    }
    interface AttachSecurityProfileRequest {
        var securityProfileName: SecurityProfileName
        var securityProfileTargetArn: SecurityProfileTargetArn
    }
    interface AttachSecurityProfileResponse
    interface AttachThingPrincipalRequest {
        var thingName: ThingName
        var principal: Principal
    }
    interface AttachThingPrincipalResponse
    interface AttributePayload {
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var merge: Flag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Attributes {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface AttributesMap {
        @nativeGetter
        operator fun get(key: String): Value?
        @nativeSetter
        operator fun set(key: String, value: Value)
    }
    interface AuditCheckConfiguration {
        var enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuditCheckConfigurations {
        @nativeGetter
        operator fun get(key: String): AuditCheckConfiguration?
        @nativeSetter
        operator fun set(key: String, value: AuditCheckConfiguration)
    }
    interface AuditCheckDetails {
        var checkRunStatus: String /* "IN_PROGRESS" | "WAITING_FOR_DATA_COLLECTION" | "CANCELED" | "COMPLETED_COMPLIANT" | "COMPLETED_NON_COMPLIANT" | "FAILED" | String */
        var checkCompliant: CheckCompliant?
            get() = definedExternally
            set(value) = definedExternally
        var totalResourcesCount: TotalResourcesCount?
            get() = definedExternally
            set(value) = definedExternally
        var nonCompliantResourcesCount: NonCompliantResourcesCount?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuditCheckToActionsMapping {
        @nativeGetter
        operator fun get(key: String): MitigationActionNameList?
        @nativeSetter
        operator fun set(key: String, value: MitigationActionNameList)
    }
    interface AuditCheckToReasonCodeFilter {
        @nativeGetter
        operator fun get(key: String): ReasonForNonComplianceCodes?
        @nativeSetter
        operator fun set(key: String, value: ReasonForNonComplianceCodes)
    }
    interface AuditDetails {
        @nativeGetter
        operator fun get(key: String): AuditCheckDetails?
        @nativeSetter
        operator fun set(key: String, value: AuditCheckDetails)
    }
    interface AuditFinding {
        var findingId: FindingId?
            get() = definedExternally
            set(value) = definedExternally
        var taskId: AuditTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var checkName: AuditCheckName?
            get() = definedExternally
            set(value) = definedExternally
        var taskStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var findingTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var severity: String /* "CRITICAL" | "HIGH" | "MEDIUM" | "LOW" | String */
        var nonCompliantResource: NonCompliantResource?
            get() = definedExternally
            set(value) = definedExternally
        var relatedResources: RelatedResources?
            get() = definedExternally
            set(value) = definedExternally
        var reasonForNonCompliance: ReasonForNonCompliance?
            get() = definedExternally
            set(value) = definedExternally
        var reasonForNonComplianceCode: ReasonForNonComplianceCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuditMitigationActionExecutionMetadata {
        var taskId: AuditMitigationActionsTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var findingId: FindingId?
            get() = definedExternally
            set(value) = definedExternally
        var actionName: MitigationActionName?
            get() = definedExternally
            set(value) = definedExternally
        var actionId: MitigationActionId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED" | "SKIPPED" | "PENDING" | String */
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuditMitigationActionsTaskMetadata {
        var taskId: AuditMitigationActionsTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var taskStatus: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED" | String */
    }
    interface AuditMitigationActionsTaskStatistics {
        @nativeGetter
        operator fun get(key: String): TaskStatisticsForAuditCheck?
        @nativeSetter
        operator fun set(key: String, value: TaskStatisticsForAuditCheck)
    }
    interface AuditMitigationActionsTaskTarget {
        var auditTaskId: AuditTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var findingIds: FindingIds?
            get() = definedExternally
            set(value) = definedExternally
        var auditCheckToReasonCodeFilter: AuditCheckToReasonCodeFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuditNotificationTarget {
        var targetArn: TargetArn?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuditNotificationTargetConfigurations {
        @nativeGetter
        operator fun get(key: String): AuditNotificationTarget?
        @nativeSetter
        operator fun set(key: String, value: AuditNotificationTarget)
    }
    interface AuditTaskMetadata {
        var taskId: AuditTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var taskStatus: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED" | String */
        var taskType: String /* "ON_DEMAND_AUDIT_TASK" | "SCHEDULED_AUDIT_TASK" | String */
    }
    interface AuthInfo {
        var actionType: String /* "PUBLISH" | "SUBSCRIBE" | "RECEIVE" | "CONNECT" | String */
        var resources: Resources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthResult {
        var authInfo: AuthInfo?
            get() = definedExternally
            set(value) = definedExternally
        var allowed: Allowed?
            get() = definedExternally
            set(value) = definedExternally
        var denied: Denied?
            get() = definedExternally
            set(value) = definedExternally
        var authDecision: String /* "ALLOWED" | "EXPLICIT_DENY" | "IMPLICIT_DENY" | String */
        var missingContextValues: MissingContextValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthorizerConfig {
        var defaultAuthorizerName: AuthorizerName?
            get() = definedExternally
            set(value) = definedExternally
        var allowAuthorizerOverride: AllowAuthorizerOverride?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthorizerDescription {
        var authorizerName: AuthorizerName?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerArn: AuthorizerArn?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerFunctionArn: AuthorizerFunctionArn?
            get() = definedExternally
            set(value) = definedExternally
        var tokenKeyName: TokenKeyName?
            get() = definedExternally
            set(value) = definedExternally
        var tokenSigningPublicKeys: PublicKeyMap?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | String */
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var signingDisabled: BooleanKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthorizerSummary {
        var authorizerName: AuthorizerName?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerArn: AuthorizerArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsJobExecutionsRolloutConfig {
        var maximumPerMinute: MaximumPerMinute?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AwsJobPresignedUrlConfig {
        var expiresInSec: ExpiresInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Behavior {
        var name: BehaviorName
        var metric: BehaviorMetric?
            get() = definedExternally
            set(value) = definedExternally
        var criteria: BehaviorCriteria?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BehaviorCriteria {
        var comparisonOperator: String /* "less-than" | "less-than-equals" | "greater-than" | "greater-than-equals" | "in-cidr-set" | "not-in-cidr-set" | "in-port-set" | "not-in-port-set" | String */
        var value: MetricValue?
            get() = definedExternally
            set(value) = definedExternally
        var durationSeconds: DurationSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var consecutiveDatapointsToAlarm: ConsecutiveDatapointsToAlarm?
            get() = definedExternally
            set(value) = definedExternally
        var consecutiveDatapointsToClear: ConsecutiveDatapointsToClear?
            get() = definedExternally
            set(value) = definedExternally
        var statisticalThreshold: StatisticalThreshold?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BillingGroupMetadata {
        var creationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BillingGroupProperties {
        var billingGroupDescription: BillingGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CACertificate {
        var certificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var certificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | String */
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CACertificateDescription {
        var certificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var certificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | String */
        var certificatePem: CertificatePem?
            get() = definedExternally
            set(value) = definedExternally
        var ownedBy: AwsAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var autoRegistrationStatus: String /* "ENABLE" | "DISABLE" | String */
        var lastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var customerVersion: CustomerVersion?
            get() = definedExternally
            set(value) = definedExternally
        var generationId: GenerationId?
            get() = definedExternally
            set(value) = definedExternally
        var validity: CertificateValidity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelAuditMitigationActionsTaskRequest {
        var taskId: AuditMitigationActionsTaskId
    }
    interface CancelAuditMitigationActionsTaskResponse
    interface CancelAuditTaskRequest {
        var taskId: AuditTaskId
    }
    interface CancelAuditTaskResponse
    interface CancelCertificateTransferRequest {
        var certificateId: CertificateId
    }
    interface CancelJobExecutionRequest {
        var jobId: JobId
        var thingName: ThingName
        var force: ForceFlag?
            get() = definedExternally
            set(value) = definedExternally
        var expectedVersion: ExpectedVersion?
            get() = definedExternally
            set(value) = definedExternally
        var statusDetails: DetailsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelJobRequest {
        var jobId: JobId
        var reasonCode: ReasonCode?
            get() = definedExternally
            set(value) = definedExternally
        var comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
        var force: ForceFlag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelJobResponse {
        var jobArn: JobArn?
            get() = definedExternally
            set(value) = definedExternally
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var description: JobDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Certificate {
        var certificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var certificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | "REVOKED" | "PENDING_TRANSFER" | "REGISTER_INACTIVE" | "PENDING_ACTIVATION" | String */
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CertificateDescription {
        var certificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var certificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var caCertificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | "REVOKED" | "PENDING_TRANSFER" | "REGISTER_INACTIVE" | "PENDING_ACTIVATION" | String */
        var certificatePem: CertificatePem?
            get() = definedExternally
            set(value) = definedExternally
        var ownedBy: AwsAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var previousOwnedBy: AwsAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var customerVersion: CustomerVersion?
            get() = definedExternally
            set(value) = definedExternally
        var transferData: TransferData?
            get() = definedExternally
            set(value) = definedExternally
        var generationId: GenerationId?
            get() = definedExternally
            set(value) = definedExternally
        var validity: CertificateValidity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CertificateValidity {
        var notBefore: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var notAfter: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClearDefaultAuthorizerRequest
    interface ClearDefaultAuthorizerResponse
    interface CloudwatchAlarmAction {
        var roleArn: AwsArn
        var alarmName: AlarmName
        var stateReason: StateReason
        var stateValue: StateValue
    }
    interface CloudwatchLogsAction {
        var roleArn: AwsArn
        var logGroupName: LogGroupName
    }
    interface CloudwatchMetricAction {
        var roleArn: AwsArn
        var metricNamespace: String
        var metricName: String
        var metricValue: String
        var metricUnit: String
        var metricTimestamp: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeSigning {
        var awsSignerJobId: SigningJobId?
            get() = definedExternally
            set(value) = definedExternally
        var startSigningJobParameter: StartSigningJobParameter?
            get() = definedExternally
            set(value) = definedExternally
        var customCodeSigning: CustomCodeSigning?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeSigningCertificateChain {
        var certificateName: CertificateName?
            get() = definedExternally
            set(value) = definedExternally
        var inlineDocument: InlineDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeSigningSignature {
        var inlineDocument: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Configuration {
        var Enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfirmTopicRuleDestinationRequest {
        var confirmationToken: ConfirmationToken
    }
    interface ConfirmTopicRuleDestinationResponse
    interface CreateAuthorizerRequest {
        var authorizerName: AuthorizerName
        var authorizerFunctionArn: AuthorizerFunctionArn
        var tokenKeyName: TokenKeyName?
            get() = definedExternally
            set(value) = definedExternally
        var tokenSigningPublicKeys: PublicKeyMap?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | String */
        var signingDisabled: BooleanKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAuthorizerResponse {
        var authorizerName: AuthorizerName?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerArn: AuthorizerArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBillingGroupRequest {
        var billingGroupName: BillingGroupName
        var billingGroupProperties: BillingGroupProperties?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBillingGroupResponse {
        var billingGroupName: BillingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var billingGroupArn: BillingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var billingGroupId: BillingGroupId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCertificateFromCsrRequest {
        var certificateSigningRequest: CertificateSigningRequest
        var setAsActive: SetAsActive?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCertificateFromCsrResponse {
        var certificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var certificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var certificatePem: CertificatePem?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDomainConfigurationRequest {
        var domainConfigurationName: DomainConfigurationName
        var domainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var serverCertificateArns: ServerCertificateArns?
            get() = definedExternally
            set(value) = definedExternally
        var validationCertificateArn: AcmCertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerConfig: AuthorizerConfig?
            get() = definedExternally
            set(value) = definedExternally
        var serviceType: String /* "DATA" | "CREDENTIAL_PROVIDER" | "JOBS" | String */
    }
    interface CreateDomainConfigurationResponse {
        var domainConfigurationName: DomainConfigurationName?
            get() = definedExternally
            set(value) = definedExternally
        var domainConfigurationArn: DomainConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDynamicThingGroupRequest {
        var thingGroupName: ThingGroupName
        var thingGroupProperties: ThingGroupProperties?
            get() = definedExternally
            set(value) = definedExternally
        var indexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var queryString: QueryString
        var queryVersion: QueryVersion?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDynamicThingGroupResponse {
        var thingGroupName: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupArn: ThingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupId: ThingGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var indexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var queryString: QueryString?
            get() = definedExternally
            set(value) = definedExternally
        var queryVersion: QueryVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobRequest {
        var jobId: JobId
        var targets: JobTargets
        var documentSource: JobDocumentSource?
            get() = definedExternally
            set(value) = definedExternally
        var document: JobDocument?
            get() = definedExternally
            set(value) = definedExternally
        var description: JobDescription?
            get() = definedExternally
            set(value) = definedExternally
        var presignedUrlConfig: PresignedUrlConfig?
            get() = definedExternally
            set(value) = definedExternally
        var targetSelection: String /* "CONTINUOUS" | "SNAPSHOT" | String */
        var jobExecutionsRolloutConfig: JobExecutionsRolloutConfig?
            get() = definedExternally
            set(value) = definedExternally
        var abortConfig: AbortConfig?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutConfig: TimeoutConfig?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobResponse {
        var jobArn: JobArn?
            get() = definedExternally
            set(value) = definedExternally
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var description: JobDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateKeysAndCertificateRequest {
        var setAsActive: SetAsActive?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateKeysAndCertificateResponse {
        var certificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var certificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var certificatePem: CertificatePem?
            get() = definedExternally
            set(value) = definedExternally
        var keyPair: KeyPair?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMitigationActionRequest {
        var actionName: MitigationActionName
        var roleArn: RoleArn
        var actionParams: MitigationActionParams
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMitigationActionResponse {
        var actionArn: MitigationActionArn?
            get() = definedExternally
            set(value) = definedExternally
        var actionId: MitigationActionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOTAUpdateRequest {
        var otaUpdateId: OTAUpdateId
        var description: OTAUpdateDescription?
            get() = definedExternally
            set(value) = definedExternally
        var targets: Targets
        var protocols: Protocols?
            get() = definedExternally
            set(value) = definedExternally
        var targetSelection: String /* "CONTINUOUS" | "SNAPSHOT" | String */
        var awsJobExecutionsRolloutConfig: AwsJobExecutionsRolloutConfig?
            get() = definedExternally
            set(value) = definedExternally
        var awsJobPresignedUrlConfig: AwsJobPresignedUrlConfig?
            get() = definedExternally
            set(value) = definedExternally
        var files: OTAUpdateFiles
        var roleArn: RoleArn
        var additionalParameters: AdditionalParameterMap?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateOTAUpdateResponse {
        var otaUpdateId: OTAUpdateId?
            get() = definedExternally
            set(value) = definedExternally
        var awsIotJobId: AwsIotJobId?
            get() = definedExternally
            set(value) = definedExternally
        var otaUpdateArn: OTAUpdateArn?
            get() = definedExternally
            set(value) = definedExternally
        var awsIotJobArn: AwsIotJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var otaUpdateStatus: String /* "CREATE_PENDING" | "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED" | String */
    }
    interface CreatePolicyRequest {
        var policyName: PolicyName
        var policyDocument: PolicyDocument
    }
    interface CreatePolicyResponse {
        var policyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var policyArn: PolicyArn?
            get() = definedExternally
            set(value) = definedExternally
        var policyDocument: PolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
        var policyVersionId: PolicyVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePolicyVersionRequest {
        var policyName: PolicyName
        var policyDocument: PolicyDocument
        var setAsDefault: SetAsDefault?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePolicyVersionResponse {
        var policyArn: PolicyArn?
            get() = definedExternally
            set(value) = definedExternally
        var policyDocument: PolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
        var policyVersionId: PolicyVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var isDefaultVersion: IsDefaultVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProvisioningClaimRequest {
        var templateName: TemplateName
    }
    interface CreateProvisioningClaimResponse {
        var certificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var certificatePem: CertificatePem?
            get() = definedExternally
            set(value) = definedExternally
        var keyPair: KeyPair?
            get() = definedExternally
            set(value) = definedExternally
        var expiration: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProvisioningTemplateRequest {
        var templateName: TemplateName
        var description: TemplateDescription?
            get() = definedExternally
            set(value) = definedExternally
        var templateBody: TemplateBody
        var enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var provisioningRoleArn: RoleArn
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProvisioningTemplateResponse {
        var templateArn: TemplateArn?
            get() = definedExternally
            set(value) = definedExternally
        var templateName: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var defaultVersionId: TemplateVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProvisioningTemplateVersionRequest {
        var templateName: TemplateName
        var templateBody: TemplateBody
        var setAsDefault: SetAsDefault?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProvisioningTemplateVersionResponse {
        var templateArn: TemplateArn?
            get() = definedExternally
            set(value) = definedExternally
        var templateName: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var versionId: TemplateVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var isDefaultVersion: IsDefaultVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRoleAliasRequest {
        var roleAlias: RoleAlias
        var roleArn: RoleArn
        var credentialDurationSeconds: CredentialDurationSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRoleAliasResponse {
        var roleAlias: RoleAlias?
            get() = definedExternally
            set(value) = definedExternally
        var roleAliasArn: RoleAliasArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateScheduledAuditRequest {
        var frequency: String /* "DAILY" | "WEEKLY" | "BIWEEKLY" | "MONTHLY" | String */
        var dayOfMonth: DayOfMonth?
            get() = definedExternally
            set(value) = definedExternally
        var dayOfWeek: String /* "SUN" | "MON" | "TUE" | "WED" | "THU" | "FRI" | "SAT" | String */
        var targetCheckNames: TargetAuditCheckNames
        var scheduledAuditName: ScheduledAuditName
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateScheduledAuditResponse {
        var scheduledAuditArn: ScheduledAuditArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSecurityProfileRequest {
        var securityProfileName: SecurityProfileName
        var securityProfileDescription: SecurityProfileDescription?
            get() = definedExternally
            set(value) = definedExternally
        var behaviors: Behaviors?
            get() = definedExternally
            set(value) = definedExternally
        var alertTargets: AlertTargets?
            get() = definedExternally
            set(value) = definedExternally
        var additionalMetricsToRetain: AdditionalMetricsToRetainList?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSecurityProfileResponse {
        var securityProfileName: SecurityProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var securityProfileArn: SecurityProfileArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStreamRequest {
        var streamId: StreamId
        var description: StreamDescription?
            get() = definedExternally
            set(value) = definedExternally
        var files: StreamFiles
        var roleArn: RoleArn
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStreamResponse {
        var streamId: StreamId?
            get() = definedExternally
            set(value) = definedExternally
        var streamArn: StreamArn?
            get() = definedExternally
            set(value) = definedExternally
        var description: StreamDescription?
            get() = definedExternally
            set(value) = definedExternally
        var streamVersion: StreamVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateThingGroupRequest {
        var thingGroupName: ThingGroupName
        var parentGroupName: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupProperties: ThingGroupProperties?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateThingGroupResponse {
        var thingGroupName: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupArn: ThingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupId: ThingGroupId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateThingRequest {
        var thingName: ThingName
        var thingTypeName: ThingTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var attributePayload: AttributePayload?
            get() = definedExternally
            set(value) = definedExternally
        var billingGroupName: BillingGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateThingResponse {
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var thingArn: ThingArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingId: ThingId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateThingTypeRequest {
        var thingTypeName: ThingTypeName
        var thingTypeProperties: ThingTypeProperties?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateThingTypeResponse {
        var thingTypeName: ThingTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeArn: ThingTypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeId: ThingTypeId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTopicRuleDestinationRequest {
        var destinationConfiguration: TopicRuleDestinationConfiguration
    }
    interface CreateTopicRuleDestinationResponse {
        var topicRuleDestination: TopicRuleDestination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTopicRuleRequest {
        var ruleName: RuleName
        var topicRulePayload: TopicRulePayload
        var tags: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomCodeSigning {
        var signature: CodeSigningSignature?
            get() = definedExternally
            set(value) = definedExternally
        var certificateChain: CodeSigningCertificateChain?
            get() = definedExternally
            set(value) = definedExternally
        var hashAlgorithm: HashAlgorithm?
            get() = definedExternally
            set(value) = definedExternally
        var signatureAlgorithm: SignatureAlgorithm?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAccountAuditConfigurationRequest {
        var deleteScheduledAudits: DeleteScheduledAudits?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAccountAuditConfigurationResponse
    interface DeleteAuthorizerRequest {
        var authorizerName: AuthorizerName
    }
    interface DeleteAuthorizerResponse
    interface DeleteBillingGroupRequest {
        var billingGroupName: BillingGroupName
        var expectedVersion: OptionalVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBillingGroupResponse
    interface DeleteCACertificateRequest {
        var certificateId: CertificateId
    }
    interface DeleteCACertificateResponse
    interface DeleteCertificateRequest {
        var certificateId: CertificateId
        var forceDelete: ForceDelete?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDomainConfigurationRequest {
        var domainConfigurationName: DomainConfigurationName
    }
    interface DeleteDomainConfigurationResponse
    interface DeleteDynamicThingGroupRequest {
        var thingGroupName: ThingGroupName
        var expectedVersion: OptionalVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDynamicThingGroupResponse
    interface DeleteJobExecutionRequest {
        var jobId: JobId
        var thingName: ThingName
        var executionNumber: ExecutionNumber
        var force: ForceFlag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteJobRequest {
        var jobId: JobId
        var force: ForceFlag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteMitigationActionRequest {
        var actionName: MitigationActionName
    }
    interface DeleteMitigationActionResponse
    interface DeleteOTAUpdateRequest {
        var otaUpdateId: OTAUpdateId
        var deleteStream: DeleteStream?
            get() = definedExternally
            set(value) = definedExternally
        var forceDeleteAWSJob: ForceDeleteAWSJob?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteOTAUpdateResponse
    interface DeletePolicyRequest {
        var policyName: PolicyName
    }
    interface DeletePolicyVersionRequest {
        var policyName: PolicyName
        var policyVersionId: PolicyVersionId
    }
    interface DeleteProvisioningTemplateRequest {
        var templateName: TemplateName
    }
    interface DeleteProvisioningTemplateResponse
    interface DeleteProvisioningTemplateVersionRequest {
        var templateName: TemplateName
        var versionId: TemplateVersionId
    }
    interface DeleteProvisioningTemplateVersionResponse
    interface DeleteRegistrationCodeRequest
    interface DeleteRegistrationCodeResponse
    interface DeleteRoleAliasRequest {
        var roleAlias: RoleAlias
    }
    interface DeleteRoleAliasResponse
    interface DeleteScheduledAuditRequest {
        var scheduledAuditName: ScheduledAuditName
    }
    interface DeleteScheduledAuditResponse
    interface DeleteSecurityProfileRequest {
        var securityProfileName: SecurityProfileName
        var expectedVersion: OptionalVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSecurityProfileResponse
    interface DeleteStreamRequest {
        var streamId: StreamId
    }
    interface DeleteStreamResponse
    interface DeleteThingGroupRequest {
        var thingGroupName: ThingGroupName
        var expectedVersion: OptionalVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteThingGroupResponse
    interface DeleteThingRequest {
        var thingName: ThingName
        var expectedVersion: OptionalVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteThingResponse
    interface DeleteThingTypeRequest {
        var thingTypeName: ThingTypeName
    }
    interface DeleteThingTypeResponse
    interface DeleteTopicRuleDestinationRequest {
        var arn: AwsArn
    }
    interface DeleteTopicRuleDestinationResponse
    interface DeleteTopicRuleRequest {
        var ruleName: RuleName
    }
    interface DeleteV2LoggingLevelRequest {
        var targetType: String /* "DEFAULT" | "THING_GROUP" | String */
        var targetName: LogTargetName
    }
    interface Denied {
        var implicitDeny: ImplicitDeny?
            get() = definedExternally
            set(value) = definedExternally
        var explicitDeny: ExplicitDeny?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeprecateThingTypeRequest {
        var thingTypeName: ThingTypeName
        var undoDeprecate: UndoDeprecate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeprecateThingTypeResponse
    interface DescribeAccountAuditConfigurationRequest
    interface DescribeAccountAuditConfigurationResponse {
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var auditNotificationTargetConfigurations: AuditNotificationTargetConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var auditCheckConfigurations: AuditCheckConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAuditFindingRequest {
        var findingId: FindingId
    }
    interface DescribeAuditFindingResponse {
        var finding: AuditFinding?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAuditMitigationActionsTaskRequest {
        var taskId: AuditMitigationActionsTaskId
    }
    interface DescribeAuditMitigationActionsTaskResponse {
        var taskStatus: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED" | String */
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var taskStatistics: AuditMitigationActionsTaskStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var target: AuditMitigationActionsTaskTarget?
            get() = definedExternally
            set(value) = definedExternally
        var auditCheckToActionsMapping: AuditCheckToActionsMapping?
            get() = definedExternally
            set(value) = definedExternally
        var actionsDefinition: MitigationActionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAuditTaskRequest {
        var taskId: AuditTaskId
    }
    interface DescribeAuditTaskResponse {
        var taskStatus: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED" | String */
        var taskType: String /* "ON_DEMAND_AUDIT_TASK" | "SCHEDULED_AUDIT_TASK" | String */
        var taskStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var taskStatistics: TaskStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledAuditName: ScheduledAuditName?
            get() = definedExternally
            set(value) = definedExternally
        var auditDetails: AuditDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAuthorizerRequest {
        var authorizerName: AuthorizerName
    }
    interface DescribeAuthorizerResponse {
        var authorizerDescription: AuthorizerDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBillingGroupRequest {
        var billingGroupName: BillingGroupName
    }
    interface DescribeBillingGroupResponse {
        var billingGroupName: BillingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var billingGroupId: BillingGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var billingGroupArn: BillingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var billingGroupProperties: BillingGroupProperties?
            get() = definedExternally
            set(value) = definedExternally
        var billingGroupMetadata: BillingGroupMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCACertificateRequest {
        var certificateId: CertificateId
    }
    interface DescribeCACertificateResponse {
        var certificateDescription: CACertificateDescription?
            get() = definedExternally
            set(value) = definedExternally
        var registrationConfig: RegistrationConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCertificateRequest {
        var certificateId: CertificateId
    }
    interface DescribeCertificateResponse {
        var certificateDescription: CertificateDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDefaultAuthorizerRequest
    interface DescribeDefaultAuthorizerResponse {
        var authorizerDescription: AuthorizerDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDomainConfigurationRequest {
        var domainConfigurationName: ReservedDomainConfigurationName
    }
    interface DescribeDomainConfigurationResponse {
        var domainConfigurationName: ReservedDomainConfigurationName?
            get() = definedExternally
            set(value) = definedExternally
        var domainConfigurationArn: DomainConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
        var domainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var serverCertificates: ServerCertificates?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerConfig: AuthorizerConfig?
            get() = definedExternally
            set(value) = definedExternally
        var domainConfigurationStatus: String /* "ENABLED" | "DISABLED" | String */
        var serviceType: String /* "DATA" | "CREDENTIAL_PROVIDER" | "JOBS" | String */
        var domainType: String /* "ENDPOINT" | "AWS_MANAGED" | "CUSTOMER_MANAGED" | String */
    }
    interface DescribeEndpointRequest {
        var endpointType: EndpointType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEndpointResponse {
        var endpointAddress: EndpointAddress?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventConfigurationsRequest
    interface DescribeEventConfigurationsResponse {
        var eventConfigurations: EventConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: LastModifiedDate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeIndexRequest {
        var indexName: IndexName
    }
    interface DescribeIndexResponse {
        var indexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var indexStatus: String /* "ACTIVE" | "BUILDING" | "REBUILDING" | String */
        var schema: IndexSchema?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobExecutionRequest {
        var jobId: JobId
        var thingName: ThingName
        var executionNumber: ExecutionNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobExecutionResponse {
        var execution: JobExecution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobRequest {
        var jobId: JobId
    }
    interface DescribeJobResponse {
        var documentSource: JobDocumentSource?
            get() = definedExternally
            set(value) = definedExternally
        var job: Job?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMitigationActionRequest {
        var actionName: MitigationActionName
    }
    interface DescribeMitigationActionResponse {
        var actionName: MitigationActionName?
            get() = definedExternally
            set(value) = definedExternally
        var actionType: String /* "UPDATE_DEVICE_CERTIFICATE" | "UPDATE_CA_CERTIFICATE" | "ADD_THINGS_TO_THING_GROUP" | "REPLACE_DEFAULT_POLICY_VERSION" | "ENABLE_IOT_LOGGING" | "PUBLISH_FINDING_TO_SNS" | String */
        var actionArn: MitigationActionArn?
            get() = definedExternally
            set(value) = definedExternally
        var actionId: MitigationActionId?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var actionParams: MitigationActionParams?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProvisioningTemplateRequest {
        var templateName: TemplateName
    }
    interface DescribeProvisioningTemplateResponse {
        var templateArn: TemplateArn?
            get() = definedExternally
            set(value) = definedExternally
        var templateName: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var description: TemplateDescription?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var defaultVersionId: TemplateVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var templateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var provisioningRoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeProvisioningTemplateVersionRequest {
        var templateName: TemplateName
        var versionId: TemplateVersionId
    }
    interface DescribeProvisioningTemplateVersionResponse {
        var versionId: TemplateVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var templateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var isDefaultVersion: IsDefaultVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRoleAliasRequest {
        var roleAlias: RoleAlias
    }
    interface DescribeRoleAliasResponse {
        var roleAliasDescription: RoleAliasDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeScheduledAuditRequest {
        var scheduledAuditName: ScheduledAuditName
    }
    interface DescribeScheduledAuditResponse {
        var frequency: String /* "DAILY" | "WEEKLY" | "BIWEEKLY" | "MONTHLY" | String */
        var dayOfMonth: DayOfMonth?
            get() = definedExternally
            set(value) = definedExternally
        var dayOfWeek: String /* "SUN" | "MON" | "TUE" | "WED" | "THU" | "FRI" | "SAT" | String */
        var targetCheckNames: TargetAuditCheckNames?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledAuditName: ScheduledAuditName?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledAuditArn: ScheduledAuditArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSecurityProfileRequest {
        var securityProfileName: SecurityProfileName
    }
    interface DescribeSecurityProfileResponse {
        var securityProfileName: SecurityProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var securityProfileArn: SecurityProfileArn?
            get() = definedExternally
            set(value) = definedExternally
        var securityProfileDescription: SecurityProfileDescription?
            get() = definedExternally
            set(value) = definedExternally
        var behaviors: Behaviors?
            get() = definedExternally
            set(value) = definedExternally
        var alertTargets: AlertTargets?
            get() = definedExternally
            set(value) = definedExternally
        var additionalMetricsToRetain: AdditionalMetricsToRetainList?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStreamRequest {
        var streamId: StreamId
    }
    interface DescribeStreamResponse {
        var streamInfo: StreamInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeThingGroupRequest {
        var thingGroupName: ThingGroupName
    }
    interface DescribeThingGroupResponse {
        var thingGroupName: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupId: ThingGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupArn: ThingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupProperties: ThingGroupProperties?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupMetadata: ThingGroupMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var indexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var queryString: QueryString?
            get() = definedExternally
            set(value) = definedExternally
        var queryVersion: QueryVersion?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "BUILDING" | "REBUILDING" | String */
    }
    interface DescribeThingRegistrationTaskRequest {
        var taskId: TaskId
    }
    interface DescribeThingRegistrationTaskResponse {
        var taskId: TaskId?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: LastModifiedDate?
            get() = definedExternally
            set(value) = definedExternally
        var templateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var inputFileBucket: RegistryS3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var inputFileKey: RegistryS3KeyName?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "InProgress" | "Completed" | "Failed" | "Cancelled" | "Cancelling" | String */
        var message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var successCount: Count?
            get() = definedExternally
            set(value) = definedExternally
        var failureCount: Count?
            get() = definedExternally
            set(value) = definedExternally
        var percentageProgress: Percentage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeThingRequest {
        var thingName: ThingName
    }
    interface DescribeThingResponse {
        var defaultClientId: ClientId?
            get() = definedExternally
            set(value) = definedExternally
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var thingId: ThingId?
            get() = definedExternally
            set(value) = definedExternally
        var thingArn: ThingArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeName: ThingTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var billingGroupName: BillingGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeThingTypeRequest {
        var thingTypeName: ThingTypeName
    }
    interface DescribeThingTypeResponse {
        var thingTypeName: ThingTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeId: ThingTypeId?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeArn: ThingTypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeProperties: ThingTypeProperties?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeMetadata: ThingTypeMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Destination {
        var s3Destination: S3Destination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachPolicyRequest {
        var policyName: PolicyName
        var target: PolicyTarget
    }
    interface DetachPrincipalPolicyRequest {
        var policyName: PolicyName
        var principal: Principal
    }
    interface DetachSecurityProfileRequest {
        var securityProfileName: SecurityProfileName
        var securityProfileTargetArn: SecurityProfileTargetArn
    }
    interface DetachSecurityProfileResponse
    interface DetachThingPrincipalRequest {
        var thingName: ThingName
        var principal: Principal
    }
    interface DetachThingPrincipalResponse
    interface DetailsMap {
        @nativeGetter
        operator fun get(key: String): DetailsValue?
        @nativeSetter
        operator fun set(key: String, value: DetailsValue)
    }
    interface DisableTopicRuleRequest {
        var ruleName: RuleName
    }
    interface DomainConfigurationSummary {
        var domainConfigurationName: ReservedDomainConfigurationName?
            get() = definedExternally
            set(value) = definedExternally
        var domainConfigurationArn: DomainConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
        var serviceType: String /* "DATA" | "CREDENTIAL_PROVIDER" | "JOBS" | String */
    }
    interface DynamoDBAction {
        var tableName: TableName
        var roleArn: AwsArn
        var operation: DynamoOperation?
            get() = definedExternally
            set(value) = definedExternally
        var hashKeyField: HashKeyField
        var hashKeyValue: HashKeyValue
        var hashKeyType: String /* "STRING" | "NUMBER" | String */
        var rangeKeyField: RangeKeyField?
            get() = definedExternally
            set(value) = definedExternally
        var rangeKeyValue: RangeKeyValue?
            get() = definedExternally
            set(value) = definedExternally
        var rangeKeyType: String /* "STRING" | "NUMBER" | String */
        var payloadField: PayloadField?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DynamoDBv2Action {
        var roleArn: AwsArn
        var putItem: PutItemInput
    }
    interface EffectivePolicy {
        var policyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var policyArn: PolicyArn?
            get() = definedExternally
            set(value) = definedExternally
        var policyDocument: PolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticsearchAction {
        var roleArn: AwsArn
        var endpoint: ElasticsearchEndpoint
        var index: ElasticsearchIndex
        var type: ElasticsearchType
        var id: ElasticsearchId
    }
    interface EnableIoTLoggingParams {
        var roleArnForLogging: RoleArn
        var logLevel: String /* "DEBUG" | "INFO" | "ERROR" | "WARN" | "DISABLED" | String */
    }
    interface EnableTopicRuleRequest {
        var ruleName: RuleName
    }
    interface ErrorInfo {
        var code: Code?
            get() = definedExternally
            set(value) = definedExternally
        var message: OTAUpdateErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventConfigurations {
        @nativeGetter
        operator fun get(key: String): Configuration?
        @nativeSetter
        operator fun set(key: String, value: Configuration)
    }
    interface ExplicitDeny {
        var policies: Policies?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExponentialRolloutRate {
        var baseRatePerMinute: RolloutRatePerMinute
        var incrementFactor: IncrementFactor
        var rateIncreaseCriteria: RateIncreaseCriteria
    }
    interface Field {
        var name: FieldName?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "Number" | "String" | "Boolean" | String */
    }
    interface FileLocation {
        var stream: Stream?
            get() = definedExternally
            set(value) = definedExternally
        var s3Location: S3Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FirehoseAction {
        var roleArn: AwsArn
        var deliveryStreamName: DeliveryStreamName
        var separator: FirehoseSeparator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCardinalityRequest {
        var indexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var queryString: QueryString
        var aggregationField: AggregationField?
            get() = definedExternally
            set(value) = definedExternally
        var queryVersion: QueryVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCardinalityResponse {
        var cardinality: Count?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEffectivePoliciesRequest {
        var principal: Principal?
            get() = definedExternally
            set(value) = definedExternally
        var cognitoIdentityPoolId: CognitoIdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEffectivePoliciesResponse {
        var effectivePolicies: EffectivePolicies?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIndexingConfigurationRequest
    interface GetIndexingConfigurationResponse {
        var thingIndexingConfiguration: ThingIndexingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupIndexingConfiguration: ThingGroupIndexingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobDocumentRequest {
        var jobId: JobId
    }
    interface GetJobDocumentResponse {
        var document: JobDocument?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetLoggingOptionsRequest
    interface GetLoggingOptionsResponse {
        var roleArn: AwsArn?
            get() = definedExternally
            set(value) = definedExternally
        var logLevel: String /* "DEBUG" | "INFO" | "ERROR" | "WARN" | "DISABLED" | String */
    }
    interface GetOTAUpdateRequest {
        var otaUpdateId: OTAUpdateId
    }
    interface GetOTAUpdateResponse {
        var otaUpdateInfo: OTAUpdateInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPercentilesRequest {
        var indexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var queryString: QueryString
        var aggregationField: AggregationField?
            get() = definedExternally
            set(value) = definedExternally
        var queryVersion: QueryVersion?
            get() = definedExternally
            set(value) = definedExternally
        var percents: PercentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPercentilesResponse {
        var percentiles: Percentiles?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPolicyRequest {
        var policyName: PolicyName
    }
    interface GetPolicyResponse {
        var policyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var policyArn: PolicyArn?
            get() = definedExternally
            set(value) = definedExternally
        var policyDocument: PolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
        var defaultVersionId: PolicyVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var generationId: GenerationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPolicyVersionRequest {
        var policyName: PolicyName
        var policyVersionId: PolicyVersionId
    }
    interface GetPolicyVersionResponse {
        var policyArn: PolicyArn?
            get() = definedExternally
            set(value) = definedExternally
        var policyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var policyDocument: PolicyDocument?
            get() = definedExternally
            set(value) = definedExternally
        var policyVersionId: PolicyVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var isDefaultVersion: IsDefaultVersion?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var generationId: GenerationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRegistrationCodeRequest
    interface GetRegistrationCodeResponse {
        var registrationCode: RegistrationCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStatisticsRequest {
        var indexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var queryString: QueryString
        var aggregationField: AggregationField?
            get() = definedExternally
            set(value) = definedExternally
        var queryVersion: QueryVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStatisticsResponse {
        var statistics: Statistics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTopicRuleDestinationRequest {
        var arn: AwsArn
    }
    interface GetTopicRuleDestinationResponse {
        var topicRuleDestination: TopicRuleDestination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTopicRuleRequest {
        var ruleName: RuleName
    }
    interface GetTopicRuleResponse {
        var ruleArn: RuleArn?
            get() = definedExternally
            set(value) = definedExternally
        var rule: TopicRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetV2LoggingOptionsRequest
    interface GetV2LoggingOptionsResponse {
        var roleArn: AwsArn?
            get() = definedExternally
            set(value) = definedExternally
        var defaultLogLevel: String /* "DEBUG" | "INFO" | "ERROR" | "WARN" | "DISABLED" | String */
        var disableAllLogs: DisableAllLogs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupNameAndArn {
        var groupName: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var groupArn: ThingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpAction {
        var url: Url
        var confirmationUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var headers: HeaderList?
            get() = definedExternally
            set(value) = definedExternally
        var auth: HttpAuthorization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpActionHeader {
        var key: HeaderKey
        var value: HeaderValue
    }
    interface HttpAuthorization {
        var sigv4: SigV4Authorization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpContext {
        var headers: HttpHeaders?
            get() = definedExternally
            set(value) = definedExternally
        var queryString: HttpQueryString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpHeaders {
        @nativeGetter
        operator fun get(key: String): HttpHeaderValue?
        @nativeSetter
        operator fun set(key: String, value: HttpHeaderValue)
    }
    interface HttpUrlDestinationConfiguration {
        var confirmationUrl: Url
    }
    interface HttpUrlDestinationProperties {
        var confirmationUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpUrlDestinationSummary {
        var confirmationUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImplicitDeny {
        var policies: Policies?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IotAnalyticsAction {
        var channelArn: AwsArn?
            get() = definedExternally
            set(value) = definedExternally
        var channelName: ChannelName?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: AwsArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IotEventsAction {
        var inputName: InputName
        var messageId: MessageId?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: AwsArn
    }
    interface IotSiteWiseAction {
        var putAssetPropertyValueEntries: PutAssetPropertyValueEntryList
        var roleArn: AwsArn
    }
    interface Job {
        var jobArn: JobArn?
            get() = definedExternally
            set(value) = definedExternally
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var targetSelection: String /* "CONTINUOUS" | "SNAPSHOT" | String */
        var status: String /* "IN_PROGRESS" | "CANCELED" | "COMPLETED" | "DELETION_IN_PROGRESS" | String */
        var forceCanceled: Forced?
            get() = definedExternally
            set(value) = definedExternally
        var reasonCode: ReasonCode?
            get() = definedExternally
            set(value) = definedExternally
        var comment: Comment?
            get() = definedExternally
            set(value) = definedExternally
        var targets: JobTargets?
            get() = definedExternally
            set(value) = definedExternally
        var description: JobDescription?
            get() = definedExternally
            set(value) = definedExternally
        var presignedUrlConfig: PresignedUrlConfig?
            get() = definedExternally
            set(value) = definedExternally
        var jobExecutionsRolloutConfig: JobExecutionsRolloutConfig?
            get() = definedExternally
            set(value) = definedExternally
        var abortConfig: AbortConfig?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var completedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var jobProcessDetails: JobProcessDetails?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutConfig: TimeoutConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobExecution {
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED" | String */
        var forceCanceled: Forced?
            get() = definedExternally
            set(value) = definedExternally
        var statusDetails: JobExecutionStatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var thingArn: ThingArn?
            get() = definedExternally
            set(value) = definedExternally
        var queuedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var startedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var executionNumber: ExecutionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var versionNumber: VersionNumber?
            get() = definedExternally
            set(value) = definedExternally
        var approximateSecondsBeforeTimedOut: ApproximateSecondsBeforeTimedOut?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobExecutionStatusDetails {
        var detailsMap: DetailsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobExecutionSummary {
        var status: String /* "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED" | String */
        var queuedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var startedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var executionNumber: ExecutionNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobExecutionSummaryForJob {
        var thingArn: ThingArn?
            get() = definedExternally
            set(value) = definedExternally
        var jobExecutionSummary: JobExecutionSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobExecutionSummaryForThing {
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var jobExecutionSummary: JobExecutionSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobExecutionsRolloutConfig {
        var maximumPerMinute: MaxJobExecutionsPerMin?
            get() = definedExternally
            set(value) = definedExternally
        var exponentialRate: ExponentialRolloutRate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobProcessDetails {
        var processingTargets: ProcessingTargetNameList?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfCanceledThings: CanceledThings?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfSucceededThings: SucceededThings?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfFailedThings: FailedThings?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfRejectedThings: RejectedThings?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfQueuedThings: QueuedThings?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfInProgressThings: InProgressThings?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfRemovedThings: RemovedThings?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfTimedOutThings: TimedOutThings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobSummary {
        var jobArn: JobArn?
            get() = definedExternally
            set(value) = definedExternally
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupId: ThingGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var targetSelection: String /* "CONTINUOUS" | "SNAPSHOT" | String */
        var status: String /* "IN_PROGRESS" | "CANCELED" | "COMPLETED" | "DELETION_IN_PROGRESS" | String */
        var createdAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var completedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyPair {
        var PublicKey: PublicKey?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateKey: PrivateKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisAction {
        var roleArn: AwsArn
        var streamName: StreamName
        var partitionKey: PartitionKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaAction {
        var functionArn: FunctionArn
    }
    interface ListActiveViolationsRequest {
        var thingName: DeviceDefenderThingName?
            get() = definedExternally
            set(value) = definedExternally
        var securityProfileName: SecurityProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListActiveViolationsResponse {
        var activeViolations: ActiveViolations?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttachedPoliciesRequest {
        var target: PolicyTarget
        var recursive: Recursive?
            get() = definedExternally
            set(value) = definedExternally
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttachedPoliciesResponse {
        var policies: Policies?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAuditFindingsRequest {
        var taskId: AuditTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var checkName: AuditCheckName?
            get() = definedExternally
            set(value) = definedExternally
        var resourceIdentifier: ResourceIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAuditFindingsResponse {
        var findings: AuditFindings?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAuditMitigationActionsExecutionsRequest {
        var taskId: AuditMitigationActionsTaskId
        var actionStatus: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED" | "SKIPPED" | "PENDING" | String */
        var findingId: FindingId
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAuditMitigationActionsExecutionsResponse {
        var actionsExecutions: AuditMitigationActionExecutionMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAuditMitigationActionsTasksRequest {
        var auditTaskId: AuditTaskId?
            get() = definedExternally
            set(value) = definedExternally
        var findingId: FindingId?
            get() = definedExternally
            set(value) = definedExternally
        var taskStatus: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED" | String */
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp
        var endTime: Timestamp
    }
    interface ListAuditMitigationActionsTasksResponse {
        var tasks: AuditMitigationActionsTaskMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAuditTasksRequest {
        var startTime: Timestamp
        var endTime: Timestamp
        var taskType: String /* "ON_DEMAND_AUDIT_TASK" | "SCHEDULED_AUDIT_TASK" | String */
        var taskStatus: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | "CANCELED" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAuditTasksResponse {
        var tasks: AuditTaskMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAuthorizersRequest {
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var ascendingOrder: AscendingOrder?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | String */
    }
    interface ListAuthorizersResponse {
        var authorizers: Authorizers?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBillingGroupsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RegistryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var namePrefixFilter: BillingGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBillingGroupsResponse {
        var billingGroups: BillingGroupNameAndArnList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCACertificatesRequest {
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var ascendingOrder: AscendingOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCACertificatesResponse {
        var certificates: CACertificates?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCertificatesByCARequest {
        var caCertificateId: CertificateId
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var ascendingOrder: AscendingOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCertificatesByCAResponse {
        var certificates: Certificates?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCertificatesRequest {
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var ascendingOrder: AscendingOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCertificatesResponse {
        var certificates: Certificates?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainConfigurationsRequest {
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var serviceType: String /* "DATA" | "CREDENTIAL_PROVIDER" | "JOBS" | String */
    }
    interface ListDomainConfigurationsResponse {
        var domainConfigurations: DomainConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIndicesRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: QueryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIndicesResponse {
        var indexNames: IndexNamesList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobExecutionsForJobRequest {
        var jobId: JobId
        var status: String /* "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED" | String */
        var maxResults: LaserMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobExecutionsForJobResponse {
        var executionSummaries: JobExecutionSummaryForJobList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobExecutionsForThingRequest {
        var thingName: ThingName
        var status: String /* "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "TIMED_OUT" | "REJECTED" | "REMOVED" | "CANCELED" | String */
        var maxResults: LaserMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobExecutionsForThingResponse {
        var executionSummaries: JobExecutionSummaryForThingList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsRequest {
        var status: String /* "IN_PROGRESS" | "CANCELED" | "COMPLETED" | "DELETION_IN_PROGRESS" | String */
        var targetSelection: String /* "CONTINUOUS" | "SNAPSHOT" | String */
        var maxResults: LaserMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupName: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupId: ThingGroupId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsResponse {
        var jobs: JobSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMitigationActionsRequest {
        var actionType: String /* "UPDATE_DEVICE_CERTIFICATE" | "UPDATE_CA_CERTIFICATE" | "ADD_THINGS_TO_THING_GROUP" | "REPLACE_DEFAULT_POLICY_VERSION" | "ENABLE_IOT_LOGGING" | "PUBLISH_FINDING_TO_SNS" | String */
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMitigationActionsResponse {
        var actionIdentifiers: MitigationActionIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOTAUpdatesRequest {
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var otaUpdateStatus: String /* "CREATE_PENDING" | "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED" | String */
    }
    interface ListOTAUpdatesResponse {
        var otaUpdates: OTAUpdatesSummary?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOutgoingCertificatesRequest {
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var ascendingOrder: AscendingOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOutgoingCertificatesResponse {
        var outgoingCertificates: OutgoingCertificates?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesRequest {
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var ascendingOrder: AscendingOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesResponse {
        var policies: Policies?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPolicyPrincipalsRequest {
        var policyName: PolicyName
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var ascendingOrder: AscendingOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPolicyPrincipalsResponse {
        var principals: Principals?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPolicyVersionsRequest {
        var policyName: PolicyName
    }
    interface ListPolicyVersionsResponse {
        var policyVersions: PolicyVersions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPrincipalPoliciesRequest {
        var principal: Principal
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var ascendingOrder: AscendingOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPrincipalPoliciesResponse {
        var policies: Policies?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPrincipalThingsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RegistryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var principal: Principal
    }
    interface ListPrincipalThingsResponse {
        var things: ThingNameList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisioningTemplateVersionsRequest {
        var templateName: TemplateName
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisioningTemplateVersionsResponse {
        var versions: ProvisioningTemplateVersionListing?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisioningTemplatesRequest {
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProvisioningTemplatesResponse {
        var templates: ProvisioningTemplateListing?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRoleAliasesRequest {
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var ascendingOrder: AscendingOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRoleAliasesResponse {
        var roleAliases: RoleAliases?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListScheduledAuditsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListScheduledAuditsResponse {
        var scheduledAudits: ScheduledAuditMetadataList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecurityProfilesForTargetRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var recursive: Recursive?
            get() = definedExternally
            set(value) = definedExternally
        var securityProfileTargetArn: SecurityProfileTargetArn
    }
    interface ListSecurityProfilesForTargetResponse {
        var securityProfileTargetMappings: SecurityProfileTargetMappings?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecurityProfilesRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecurityProfilesResponse {
        var securityProfileIdentifiers: SecurityProfileIdentifiers?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamsRequest {
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ascendingOrder: AscendingOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamsResponse {
        var streams: StreamsSummary?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: ResourceArn
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResponse {
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTargetsForPolicyRequest {
        var policyName: PolicyName
        var marker: Marker?
            get() = definedExternally
            set(value) = definedExternally
        var pageSize: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTargetsForPolicyResponse {
        var targets: PolicyTargets?
            get() = definedExternally
            set(value) = definedExternally
        var nextMarker: Marker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTargetsForSecurityProfileRequest {
        var securityProfileName: SecurityProfileName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTargetsForSecurityProfileResponse {
        var securityProfileTargets: SecurityProfileTargets?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingGroupsForThingRequest {
        var thingName: ThingName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RegistryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingGroupsForThingResponse {
        var thingGroups: ThingGroupNameAndArnList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingGroupsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RegistryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var parentGroup: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var namePrefixFilter: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var recursive: RecursiveWithoutDefault?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingGroupsResponse {
        var thingGroups: ThingGroupNameAndArnList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingPrincipalsRequest {
        var thingName: ThingName
    }
    interface ListThingPrincipalsResponse {
        var principals: Principals?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingRegistrationTaskReportsRequest {
        var taskId: TaskId
        var reportType: String /* "ERRORS" | "RESULTS" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RegistryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingRegistrationTaskReportsResponse {
        var resourceLinks: S3FileUrlList?
            get() = definedExternally
            set(value) = definedExternally
        var reportType: String /* "ERRORS" | "RESULTS" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingRegistrationTasksRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RegistryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "InProgress" | "Completed" | "Failed" | "Cancelled" | "Cancelling" | String */
    }
    interface ListThingRegistrationTasksResponse {
        var taskIds: TaskIdList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingTypesRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RegistryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeName: ThingTypeName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingTypesResponse {
        var thingTypes: ThingTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingsInBillingGroupRequest {
        var billingGroupName: BillingGroupName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RegistryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingsInBillingGroupResponse {
        var things: ThingNameList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingsInThingGroupRequest {
        var thingGroupName: ThingGroupName
        var recursive: Recursive?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RegistryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingsInThingGroupResponse {
        var things: ThingNameList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RegistryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var attributeName: AttributeName?
            get() = definedExternally
            set(value) = definedExternally
        var attributeValue: AttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeName: ThingTypeName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListThingsResponse {
        var things: ThingAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTopicRuleDestinationsRequest {
        var maxResults: TopicRuleDestinationMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTopicRuleDestinationsResponse {
        var destinationSummaries: TopicRuleDestinationSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTopicRulesRequest {
        var topic: Topic?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: TopicRuleMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ruleDisabled: IsDisabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTopicRulesResponse {
        var rules: TopicRuleList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListV2LoggingLevelsRequest {
        var targetType: String /* "DEFAULT" | "THING_GROUP" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: SkyfallMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListV2LoggingLevelsResponse {
        var logTargetConfigurations: LogTargetConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListViolationEventsRequest {
        var startTime: Timestamp
        var endTime: Timestamp
        var thingName: DeviceDefenderThingName?
            get() = definedExternally
            set(value) = definedExternally
        var securityProfileName: SecurityProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListViolationEventsResponse {
        var violationEvents: ViolationEvents?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogTarget {
        var targetType: String /* "DEFAULT" | "THING_GROUP" | String */
        var targetName: LogTargetName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogTargetConfiguration {
        var logTarget: LogTarget?
            get() = definedExternally
            set(value) = definedExternally
        var logLevel: String /* "DEBUG" | "INFO" | "ERROR" | "WARN" | "DISABLED" | String */
    }
    interface LoggingOptionsPayload {
        var roleArn: AwsArn
        var logLevel: String /* "DEBUG" | "INFO" | "ERROR" | "WARN" | "DISABLED" | String */
    }
    interface MetricValue {
        var count: UnsignedLong?
            get() = definedExternally
            set(value) = definedExternally
        var cidrs: Cidrs?
            get() = definedExternally
            set(value) = definedExternally
        var ports: Ports?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MitigationAction {
        var name: MitigationActionName?
            get() = definedExternally
            set(value) = definedExternally
        var id: MitigationActionId?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var actionParams: MitigationActionParams?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MitigationActionIdentifier {
        var actionName: MitigationActionName?
            get() = definedExternally
            set(value) = definedExternally
        var actionArn: MitigationActionArn?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MitigationActionParams {
        var updateDeviceCertificateParams: UpdateDeviceCertificateParams?
            get() = definedExternally
            set(value) = definedExternally
        var updateCACertificateParams: UpdateCACertificateParams?
            get() = definedExternally
            set(value) = definedExternally
        var addThingsToThingGroupParams: AddThingsToThingGroupParams?
            get() = definedExternally
            set(value) = definedExternally
        var replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParams?
            get() = definedExternally
            set(value) = definedExternally
        var enableIoTLoggingParams: EnableIoTLoggingParams?
            get() = definedExternally
            set(value) = definedExternally
        var publishFindingToSnsParams: PublishFindingToSnsParams?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MqttContext {
        var username: MqttUsername?
            get() = definedExternally
            set(value) = definedExternally
        var password: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var clientId: MqttClientId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NonCompliantResource {
        var resourceType: String /* "DEVICE_CERTIFICATE" | "CA_CERTIFICATE" | "IOT_POLICY" | "COGNITO_IDENTITY_POOL" | "CLIENT_ID" | "ACCOUNT_SETTINGS" | "ROLE_ALIAS" | "IAM_ROLE" | String */
        var resourceIdentifier: ResourceIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var additionalInfo: StringMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OTAUpdateFile {
        var fileName: FileName?
            get() = definedExternally
            set(value) = definedExternally
        var fileVersion: OTAUpdateFileVersion?
            get() = definedExternally
            set(value) = definedExternally
        var fileLocation: FileLocation?
            get() = definedExternally
            set(value) = definedExternally
        var codeSigning: CodeSigning?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: AttributesMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OTAUpdateInfo {
        var otaUpdateId: OTAUpdateId?
            get() = definedExternally
            set(value) = definedExternally
        var otaUpdateArn: OTAUpdateArn?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var description: OTAUpdateDescription?
            get() = definedExternally
            set(value) = definedExternally
        var targets: Targets?
            get() = definedExternally
            set(value) = definedExternally
        var protocols: Protocols?
            get() = definedExternally
            set(value) = definedExternally
        var awsJobExecutionsRolloutConfig: AwsJobExecutionsRolloutConfig?
            get() = definedExternally
            set(value) = definedExternally
        var awsJobPresignedUrlConfig: AwsJobPresignedUrlConfig?
            get() = definedExternally
            set(value) = definedExternally
        var targetSelection: String /* "CONTINUOUS" | "SNAPSHOT" | String */
        var otaUpdateFiles: OTAUpdateFiles?
            get() = definedExternally
            set(value) = definedExternally
        var otaUpdateStatus: String /* "CREATE_PENDING" | "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED" | String */
        var awsIotJobId: AwsIotJobId?
            get() = definedExternally
            set(value) = definedExternally
        var awsIotJobArn: AwsIotJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var errorInfo: ErrorInfo?
            get() = definedExternally
            set(value) = definedExternally
        var additionalParameters: AdditionalParameterMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OTAUpdateSummary {
        var otaUpdateId: OTAUpdateId?
            get() = definedExternally
            set(value) = definedExternally
        var otaUpdateArn: OTAUpdateArn?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutgoingCertificate {
        var certificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var certificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var transferredTo: AwsAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var transferDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var transferMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Parameters {
        @nativeGetter
        operator fun get(key: String): Value?
        @nativeSetter
        operator fun set(key: String, value: Value)
    }
    interface PercentPair {
        var percent: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var value: PercentValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Policy {
        var policyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var policyArn: PolicyArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyVersion {
        var versionId: PolicyVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var isDefaultVersion: IsDefaultVersion?
            get() = definedExternally
            set(value) = definedExternally
        var createDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyVersionIdentifier {
        var policyName: PolicyName?
            get() = definedExternally
            set(value) = definedExternally
        var policyVersionId: PolicyVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PresignedUrlConfig {
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var expiresInSec: ExpiresInSec?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisioningTemplateSummary {
        var templateArn: TemplateArn?
            get() = definedExternally
            set(value) = definedExternally
        var templateName: TemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var description: TemplateDescription?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProvisioningTemplateVersionSummary {
        var versionId: TemplateVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var isDefaultVersion: IsDefaultVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublicKeyMap {
        @nativeGetter
        operator fun get(key: String): KeyValue?
        @nativeSetter
        operator fun set(key: String, value: KeyValue)
    }
    interface PublishFindingToSnsParams {
        var topicArn: SnsTopicArn
    }
    interface PutAssetPropertyValueEntry {
        var entryId: AssetPropertyEntryId?
            get() = definedExternally
            set(value) = definedExternally
        var assetId: AssetId?
            get() = definedExternally
            set(value) = definedExternally
        var propertyId: AssetPropertyId?
            get() = definedExternally
            set(value) = definedExternally
        var propertyAlias: AssetPropertyAlias?
            get() = definedExternally
            set(value) = definedExternally
        var propertyValues: AssetPropertyValueList
    }
    interface PutItemInput {
        var tableName: TableName
    }
    interface RateIncreaseCriteria {
        var numberOfNotifiedThings: NumberOfThings?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfSucceededThings: NumberOfThings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterCACertificateRequest {
        var caCertificate: CertificatePem
        var verificationCertificate: CertificatePem
        var setAsActive: SetAsActive?
            get() = definedExternally
            set(value) = definedExternally
        var allowAutoRegistration: AllowAutoRegistration?
            get() = definedExternally
            set(value) = definedExternally
        var registrationConfig: RegistrationConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterCACertificateResponse {
        var certificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var certificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterCertificateRequest {
        var certificatePem: CertificatePem
        var caCertificatePem: CertificatePem?
            get() = definedExternally
            set(value) = definedExternally
        var setAsActive: SetAsActiveFlag?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | "REVOKED" | "PENDING_TRANSFER" | "REGISTER_INACTIVE" | "PENDING_ACTIVATION" | String */
    }
    interface RegisterCertificateResponse {
        var certificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var certificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterThingRequest {
        var templateBody: TemplateBody
        var parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterThingResponse {
        var certificatePem: CertificatePem?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArns: ResourceArns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegistrationConfig {
        var templateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RejectCertificateTransferRequest {
        var certificateId: CertificateId
        var rejectReason: Message?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelatedResource {
        var resourceType: String /* "DEVICE_CERTIFICATE" | "CA_CERTIFICATE" | "IOT_POLICY" | "COGNITO_IDENTITY_POOL" | "CLIENT_ID" | "ACCOUNT_SETTINGS" | "ROLE_ALIAS" | "IAM_ROLE" | String */
        var resourceIdentifier: ResourceIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var additionalInfo: StringMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveThingFromBillingGroupRequest {
        var billingGroupName: BillingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var billingGroupArn: BillingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var thingArn: ThingArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveThingFromBillingGroupResponse
    interface RemoveThingFromThingGroupRequest {
        var thingGroupName: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupArn: ThingGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var thingArn: ThingArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveThingFromThingGroupResponse
    interface ReplaceDefaultPolicyVersionParams {
        var templateName: String /* "BLANK_POLICY" | String */
    }
    interface ReplaceTopicRuleRequest {
        var ruleName: RuleName
        var topicRulePayload: TopicRulePayload
    }
    interface RepublishAction {
        var roleArn: AwsArn
        var topic: TopicPattern
        var qos: Qos?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceArns {
        @nativeGetter
        operator fun get(key: String): ResourceArn?
        @nativeSetter
        operator fun set(key: String, value: ResourceArn)
    }
    interface ResourceIdentifier {
        var deviceCertificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var caCertificateId: CertificateId?
            get() = definedExternally
            set(value) = definedExternally
        var cognitoIdentityPoolId: CognitoIdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var clientId: ClientId?
            get() = definedExternally
            set(value) = definedExternally
        var policyVersionIdentifier: PolicyVersionIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var account: AwsAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var iamRoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var roleAliasArn: RoleAliasArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoleAliasDescription {
        var roleAlias: RoleAlias?
            get() = definedExternally
            set(value) = definedExternally
        var roleAliasArn: RoleAliasArn?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var owner: AwsAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var credentialDurationSeconds: CredentialDurationSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Action {
        var roleArn: AwsArn
        var bucketName: BucketName
        var key: Key
        var cannedAcl: String /* "private" | "public-read" | "public-read-write" | "aws-exec-read" | "authenticated-read" | "bucket-owner-read" | "bucket-owner-full-control" | "log-delivery-write" | String */
    }
    interface S3Destination {
        var bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var prefix: Prefix?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Location {
        var bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
        var version: S3Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SalesforceAction {
        var token: SalesforceToken
        var url: SalesforceEndpoint
    }
    interface ScheduledAuditMetadata {
        var scheduledAuditName: ScheduledAuditName?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledAuditArn: ScheduledAuditArn?
            get() = definedExternally
            set(value) = definedExternally
        var frequency: String /* "DAILY" | "WEEKLY" | "BIWEEKLY" | "MONTHLY" | String */
        var dayOfMonth: DayOfMonth?
            get() = definedExternally
            set(value) = definedExternally
        var dayOfWeek: String /* "SUN" | "MON" | "TUE" | "WED" | "THU" | "FRI" | "SAT" | String */
    }
    interface SearchIndexRequest {
        var indexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var queryString: QueryString
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: QueryMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var queryVersion: QueryVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchIndexResponse {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var things: ThingDocumentList?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroups: ThingGroupDocumentList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecurityProfileIdentifier {
        var name: SecurityProfileName
        var arn: SecurityProfileArn
    }
    interface SecurityProfileTarget {
        var arn: SecurityProfileTargetArn
    }
    interface SecurityProfileTargetMapping {
        var securityProfileIdentifier: SecurityProfileIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var target: SecurityProfileTarget?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerCertificateSummary {
        var serverCertificateArn: AcmCertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var serverCertificateStatus: String /* "INVALID" | "VALID" | String */
        var serverCertificateStatusDetail: ServerCertificateStatusDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetDefaultAuthorizerRequest {
        var authorizerName: AuthorizerName
    }
    interface SetDefaultAuthorizerResponse {
        var authorizerName: AuthorizerName?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerArn: AuthorizerArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetDefaultPolicyVersionRequest {
        var policyName: PolicyName
        var policyVersionId: PolicyVersionId
    }
    interface SetLoggingOptionsRequest {
        var loggingOptionsPayload: LoggingOptionsPayload
    }
    interface SetV2LoggingLevelRequest {
        var logTarget: LogTarget
        var logLevel: String /* "DEBUG" | "INFO" | "ERROR" | "WARN" | "DISABLED" | String */
    }
    interface SetV2LoggingOptionsRequest {
        var roleArn: AwsArn?
            get() = definedExternally
            set(value) = definedExternally
        var defaultLogLevel: String /* "DEBUG" | "INFO" | "ERROR" | "WARN" | "DISABLED" | String */
        var disableAllLogs: DisableAllLogs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SigV4Authorization {
        var signingRegion: SigningRegion
        var serviceName: ServiceName
        var roleArn: AwsArn
    }
    interface SigningProfileParameter {
        var certificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
        var platform: Platform?
            get() = definedExternally
            set(value) = definedExternally
        var certificatePathOnDevice: CertificatePathOnDevice?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnsAction {
        var targetArn: AwsArn
        var roleArn: AwsArn
        var messageFormat: String /* "RAW" | "JSON" | String */
    }
    interface SqsAction {
        var roleArn: AwsArn
        var queueUrl: QueueUrl
        var useBase64: UseBase64?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartAuditMitigationActionsTaskRequest {
        var taskId: AuditMitigationActionsTaskId
        var target: AuditMitigationActionsTaskTarget
        var auditCheckToActionsMapping: AuditCheckToActionsMapping
        var clientRequestToken: ClientRequestToken
    }
    interface StartAuditMitigationActionsTaskResponse {
        var taskId: AuditMitigationActionsTaskId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartOnDemandAuditTaskRequest {
        var targetCheckNames: TargetAuditCheckNames
    }
    interface StartOnDemandAuditTaskResponse {
        var taskId: AuditTaskId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSigningJobParameter {
        var signingProfileParameter: SigningProfileParameter?
            get() = definedExternally
            set(value) = definedExternally
        var signingProfileName: SigningProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var destination: Destination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartThingRegistrationTaskRequest {
        var templateBody: TemplateBody
        var inputFileBucket: RegistryS3BucketName
        var inputFileKey: RegistryS3KeyName
        var roleArn: RoleArn
    }
    interface StartThingRegistrationTaskResponse {
        var taskId: TaskId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StatisticalThreshold {
        var statistic: EvaluationStatistic?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Statistics {
        var count: Count?
            get() = definedExternally
            set(value) = definedExternally
        var average: Average?
            get() = definedExternally
            set(value) = definedExternally
        var sum: Sum?
            get() = definedExternally
            set(value) = definedExternally
        var minimum: Minimum?
            get() = definedExternally
            set(value) = definedExternally
        var maximum: Maximum?
            get() = definedExternally
            set(value) = definedExternally
        var sumOfSquares: SumOfSquares?
            get() = definedExternally
            set(value) = definedExternally
        var variance: Variance?
            get() = definedExternally
            set(value) = definedExternally
        var stdDeviation: StdDeviation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StepFunctionsAction {
        var executionNamePrefix: ExecutionNamePrefix?
            get() = definedExternally
            set(value) = definedExternally
        var stateMachineName: StateMachineName
        var roleArn: AwsArn
    }
    interface StopThingRegistrationTaskRequest {
        var taskId: TaskId
    }
    interface StopThingRegistrationTaskResponse
    interface Stream {
        var streamId: StreamId?
            get() = definedExternally
            set(value) = definedExternally
        var fileId: FileId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamFile {
        var fileId: FileId?
            get() = definedExternally
            set(value) = definedExternally
        var s3Location: S3Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamInfo {
        var streamId: StreamId?
            get() = definedExternally
            set(value) = definedExternally
        var streamArn: StreamArn?
            get() = definedExternally
            set(value) = definedExternally
        var streamVersion: StreamVersion?
            get() = definedExternally
            set(value) = definedExternally
        var description: StreamDescription?
            get() = definedExternally
            set(value) = definedExternally
        var files: StreamFiles?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamSummary {
        var streamId: StreamId?
            get() = definedExternally
            set(value) = definedExternally
        var streamArn: StreamArn?
            get() = definedExternally
            set(value) = definedExternally
        var streamVersion: StreamVersion?
            get() = definedExternally
            set(value) = definedExternally
        var description: StreamDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StringMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface Tag {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var resourceArn: ResourceArn
        var tags: TagList
    }
    interface TagResourceResponse
    interface TaskStatistics {
        var totalChecks: TotalChecksCount?
            get() = definedExternally
            set(value) = definedExternally
        var inProgressChecks: InProgressChecksCount?
            get() = definedExternally
            set(value) = definedExternally
        var waitingForDataCollectionChecks: WaitingForDataCollectionChecksCount?
            get() = definedExternally
            set(value) = definedExternally
        var compliantChecks: CompliantChecksCount?
            get() = definedExternally
            set(value) = definedExternally
        var nonCompliantChecks: NonCompliantChecksCount?
            get() = definedExternally
            set(value) = definedExternally
        var failedChecks: FailedChecksCount?
            get() = definedExternally
            set(value) = definedExternally
        var canceledChecks: CanceledChecksCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskStatisticsForAuditCheck {
        var totalFindingsCount: TotalFindingsCount?
            get() = definedExternally
            set(value) = definedExternally
        var failedFindingsCount: FailedFindingsCount?
            get() = definedExternally
            set(value) = definedExternally
        var succeededFindingsCount: SucceededFindingsCount?
            get() = definedExternally
            set(value) = definedExternally
        var skippedFindingsCount: SkippedFindingsCount?
            get() = definedExternally
            set(value) = definedExternally
        var canceledFindingsCount: CanceledFindingsCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestAuthorizationRequest {
        var principal: Principal?
            get() = definedExternally
            set(value) = definedExternally
        var cognitoIdentityPoolId: CognitoIdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var authInfos: AuthInfos
        var clientId: ClientId?
            get() = definedExternally
            set(value) = definedExternally
        var policyNamesToAdd: PolicyNames?
            get() = definedExternally
            set(value) = definedExternally
        var policyNamesToSkip: PolicyNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestAuthorizationResponse {
        var authResults: AuthResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestInvokeAuthorizerRequest {
        var authorizerName: AuthorizerName
        var token: Token?
            get() = definedExternally
            set(value) = definedExternally
        var tokenSignature: TokenSignature?
            get() = definedExternally
            set(value) = definedExternally
        var httpContext: HttpContext?
            get() = definedExternally
            set(value) = definedExternally
        var mqttContext: MqttContext?
            get() = definedExternally
            set(value) = definedExternally
        var tlsContext: TlsContext?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TestInvokeAuthorizerResponse {
        var isAuthenticated: IsAuthenticated?
            get() = definedExternally
            set(value) = definedExternally
        var principalId: PrincipalId?
            get() = definedExternally
            set(value) = definedExternally
        var policyDocuments: PolicyDocuments?
            get() = definedExternally
            set(value) = definedExternally
        var refreshAfterInSeconds: Seconds?
            get() = definedExternally
            set(value) = definedExternally
        var disconnectAfterInSeconds: Seconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingAttribute {
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeName: ThingTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var thingArn: ThingArn?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingConnectivity {
        var connected: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var timestamp: ConnectivityTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingDocument {
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var thingId: ThingId?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeName: ThingTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupNames: ThingGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var shadow: JsonDocument?
            get() = definedExternally
            set(value) = definedExternally
        var connectivity: ThingConnectivity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingGroupDocument {
        var thingGroupName: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupId: ThingGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupDescription: ThingGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
        var attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var parentGroupNames: ThingGroupNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingGroupIndexingConfiguration {
        var thingGroupIndexingMode: String /* "OFF" | "ON" | String */
        var managedFields: Fields?
            get() = definedExternally
            set(value) = definedExternally
        var customFields: Fields?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingGroupMetadata {
        var parentGroupName: ThingGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var rootToParentThingGroups: ThingGroupNameAndArnList?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingGroupProperties {
        var thingGroupDescription: ThingGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
        var attributePayload: AttributePayload?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingIndexingConfiguration {
        var thingIndexingMode: String /* "OFF" | "REGISTRY" | "REGISTRY_AND_SHADOW" | String */
        var thingConnectivityIndexingMode: String /* "OFF" | "STATUS" | String */
        var managedFields: Fields?
            get() = definedExternally
            set(value) = definedExternally
        var customFields: Fields?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingTypeDefinition {
        var thingTypeName: ThingTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeArn: ThingTypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeProperties: ThingTypeProperties?
            get() = definedExternally
            set(value) = definedExternally
        var thingTypeMetadata: ThingTypeMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingTypeMetadata {
        var deprecated: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var deprecationDate: DeprecationDate?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThingTypeProperties {
        var thingTypeDescription: ThingTypeDescription?
            get() = definedExternally
            set(value) = definedExternally
        var searchableAttributes: SearchableAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeoutConfig {
        var inProgressTimeoutInMinutes: InProgressTimeoutInMinutes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TlsContext {
        var serverName: ServerName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TopicRule {
        var ruleName: RuleName?
            get() = definedExternally
            set(value) = definedExternally
        var sql: SQL?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreatedAtDate?
            get() = definedExternally
            set(value) = definedExternally
        var actions: ActionList?
            get() = definedExternally
            set(value) = definedExternally
        var ruleDisabled: IsDisabled?
            get() = definedExternally
            set(value) = definedExternally
        var awsIotSqlVersion: AwsIotSqlVersion?
            get() = definedExternally
            set(value) = definedExternally
        var errorAction: Action?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TopicRuleDestination {
        var arn: AwsArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ENABLED" | "IN_PROGRESS" | "DISABLED" | "ERROR" | String */
        var statusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var httpUrlProperties: HttpUrlDestinationProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TopicRuleDestinationConfiguration {
        var httpUrlConfiguration: HttpUrlDestinationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TopicRuleDestinationSummary {
        var arn: AwsArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ENABLED" | "IN_PROGRESS" | "DISABLED" | "ERROR" | String */
        var statusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var httpUrlSummary: HttpUrlDestinationSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TopicRuleListItem {
        var ruleArn: RuleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ruleName: RuleName?
            get() = definedExternally
            set(value) = definedExternally
        var topicPattern: TopicPattern?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreatedAtDate?
            get() = definedExternally
            set(value) = definedExternally
        var ruleDisabled: IsDisabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TopicRulePayload {
        var sql: SQL
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var actions: ActionList
        var ruleDisabled: IsDisabled?
            get() = definedExternally
            set(value) = definedExternally
        var awsIotSqlVersion: AwsIotSqlVersion?
            get() = definedExternally
            set(value) = definedExternally
        var errorAction: Action?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransferCertificateRequest {
        var certificateId: CertificateId
        var targetAwsAccount: AwsAccountId
        var transferMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransferCertificateResponse {
        var transferredCertificateArn: CertificateArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransferData {
        var transferMessage: Message?
            get() = definedExternally
            set(value) = definedExternally
        var rejectReason: Message?
            get() = definedExternally
            set(value) = definedExternally
        var transferDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var acceptDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var rejectDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var resourceArn: ResourceArn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateAccountAuditConfigurationRequest {
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var auditNotificationTargetConfigurations: AuditNotificationTargetConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var auditCheckConfigurations: AuditCheckConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAccountAuditConfigurationResponse
    interface UpdateAuthorizerRequest {
        var authorizerName: AuthorizerName
        var authorizerFunctionArn: AuthorizerFunctionArn?
            get() = definedExternally
            set(value) = definedExternally
        var tokenKeyName: TokenKeyName?
            get() = definedExternally
            set(value) = definedExternally
        var tokenSigningPublicKeys: PublicKeyMap?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "ACTIVE" | "INACTIVE" | String */
    }
    interface UpdateAuthorizerResponse {
        var authorizerName: AuthorizerName?
            get() = definedExternally
            set(value) = definedExternally
        var authorizerArn: AuthorizerArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBillingGroupRequest {
        var billingGroupName: BillingGroupName
        var billingGroupProperties: BillingGroupProperties
        var expectedVersion: OptionalVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBillingGroupResponse {
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCACertificateParams {
        var action: String /* "DEACTIVATE" | String */
    }
    interface UpdateCACertificateRequest {
        var certificateId: CertificateId
        var newStatus: String /* "ACTIVE" | "INACTIVE" | String */
        var newAutoRegistrationStatus: String /* "ENABLE" | "DISABLE" | String */
        var registrationConfig: RegistrationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var removeAutoRegistration: RemoveAutoRegistration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCertificateRequest {
        var certificateId: CertificateId
        var newStatus: String /* "ACTIVE" | "INACTIVE" | "REVOKED" | "PENDING_TRANSFER" | "REGISTER_INACTIVE" | "PENDING_ACTIVATION" | String */
    }
    interface UpdateDeviceCertificateParams {
        var action: String /* "DEACTIVATE" | String */
    }
    interface UpdateDomainConfigurationRequest {
        var domainConfigurationName: ReservedDomainConfigurationName
        var authorizerConfig: AuthorizerConfig?
            get() = definedExternally
            set(value) = definedExternally
        var domainConfigurationStatus: String /* "ENABLED" | "DISABLED" | String */
        var removeAuthorizerConfig: RemoveAuthorizerConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDomainConfigurationResponse {
        var domainConfigurationName: ReservedDomainConfigurationName?
            get() = definedExternally
            set(value) = definedExternally
        var domainConfigurationArn: DomainConfigurationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDynamicThingGroupRequest {
        var thingGroupName: ThingGroupName
        var thingGroupProperties: ThingGroupProperties
        var expectedVersion: OptionalVersion?
            get() = definedExternally
            set(value) = definedExternally
        var indexName: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var queryString: QueryString?
            get() = definedExternally
            set(value) = definedExternally
        var queryVersion: QueryVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDynamicThingGroupResponse {
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEventConfigurationsRequest {
        var eventConfigurations: EventConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEventConfigurationsResponse
    interface UpdateIndexingConfigurationRequest {
        var thingIndexingConfiguration: ThingIndexingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupIndexingConfiguration: ThingGroupIndexingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIndexingConfigurationResponse
    interface UpdateJobRequest {
        var jobId: JobId
        var description: JobDescription?
            get() = definedExternally
            set(value) = definedExternally
        var presignedUrlConfig: PresignedUrlConfig?
            get() = definedExternally
            set(value) = definedExternally
        var jobExecutionsRolloutConfig: JobExecutionsRolloutConfig?
            get() = definedExternally
            set(value) = definedExternally
        var abortConfig: AbortConfig?
            get() = definedExternally
            set(value) = definedExternally
        var timeoutConfig: TimeoutConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMitigationActionRequest {
        var actionName: MitigationActionName
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var actionParams: MitigationActionParams?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMitigationActionResponse {
        var actionArn: MitigationActionArn?
            get() = definedExternally
            set(value) = definedExternally
        var actionId: MitigationActionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProvisioningTemplateRequest {
        var templateName: TemplateName
        var description: TemplateDescription?
            get() = definedExternally
            set(value) = definedExternally
        var enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var defaultVersionId: TemplateVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var provisioningRoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProvisioningTemplateResponse
    interface UpdateRoleAliasRequest {
        var roleAlias: RoleAlias
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var credentialDurationSeconds: CredentialDurationSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRoleAliasResponse {
        var roleAlias: RoleAlias?
            get() = definedExternally
            set(value) = definedExternally
        var roleAliasArn: RoleAliasArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateScheduledAuditRequest {
        var frequency: String /* "DAILY" | "WEEKLY" | "BIWEEKLY" | "MONTHLY" | String */
        var dayOfMonth: DayOfMonth?
            get() = definedExternally
            set(value) = definedExternally
        var dayOfWeek: String /* "SUN" | "MON" | "TUE" | "WED" | "THU" | "FRI" | "SAT" | String */
        var targetCheckNames: TargetAuditCheckNames?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledAuditName: ScheduledAuditName
    }
    interface UpdateScheduledAuditResponse {
        var scheduledAuditArn: ScheduledAuditArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSecurityProfileRequest {
        var securityProfileName: SecurityProfileName
        var securityProfileDescription: SecurityProfileDescription?
            get() = definedExternally
            set(value) = definedExternally
        var behaviors: Behaviors?
            get() = definedExternally
            set(value) = definedExternally
        var alertTargets: AlertTargets?
            get() = definedExternally
            set(value) = definedExternally
        var additionalMetricsToRetain: AdditionalMetricsToRetainList?
            get() = definedExternally
            set(value) = definedExternally
        var deleteBehaviors: DeleteBehaviors?
            get() = definedExternally
            set(value) = definedExternally
        var deleteAlertTargets: DeleteAlertTargets?
            get() = definedExternally
            set(value) = definedExternally
        var deleteAdditionalMetricsToRetain: DeleteAdditionalMetricsToRetain?
            get() = definedExternally
            set(value) = definedExternally
        var expectedVersion: OptionalVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSecurityProfileResponse {
        var securityProfileName: SecurityProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var securityProfileArn: SecurityProfileArn?
            get() = definedExternally
            set(value) = definedExternally
        var securityProfileDescription: SecurityProfileDescription?
            get() = definedExternally
            set(value) = definedExternally
        var behaviors: Behaviors?
            get() = definedExternally
            set(value) = definedExternally
        var alertTargets: AlertTargets?
            get() = definedExternally
            set(value) = definedExternally
        var additionalMetricsToRetain: AdditionalMetricsToRetainList?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var creationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastModifiedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStreamRequest {
        var streamId: StreamId
        var description: StreamDescription?
            get() = definedExternally
            set(value) = definedExternally
        var files: StreamFiles?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStreamResponse {
        var streamId: StreamId?
            get() = definedExternally
            set(value) = definedExternally
        var streamArn: StreamArn?
            get() = definedExternally
            set(value) = definedExternally
        var description: StreamDescription?
            get() = definedExternally
            set(value) = definedExternally
        var streamVersion: StreamVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateThingGroupRequest {
        var thingGroupName: ThingGroupName
        var thingGroupProperties: ThingGroupProperties
        var expectedVersion: OptionalVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateThingGroupResponse {
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateThingGroupsForThingRequest {
        var thingName: ThingName?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupsToAdd: ThingGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var thingGroupsToRemove: ThingGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var overrideDynamicGroups: OverrideDynamicGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateThingGroupsForThingResponse
    interface UpdateThingRequest {
        var thingName: ThingName
        var thingTypeName: ThingTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var attributePayload: AttributePayload?
            get() = definedExternally
            set(value) = definedExternally
        var expectedVersion: OptionalVersion?
            get() = definedExternally
            set(value) = definedExternally
        var removeThingType: RemoveThingType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateThingResponse
    interface UpdateTopicRuleDestinationRequest {
        var arn: AwsArn
        var status: String /* "ENABLED" | "IN_PROGRESS" | "DISABLED" | "ERROR" | String */
    }
    interface UpdateTopicRuleDestinationResponse
    interface ValidateSecurityProfileBehaviorsRequest {
        var behaviors: Behaviors
    }
    interface ValidateSecurityProfileBehaviorsResponse {
        var valid: Valid?
            get() = definedExternally
            set(value) = definedExternally
        var validationErrors: ValidationErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidationError {
        var errorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ViolationEvent {
        var violationId: ViolationId?
            get() = definedExternally
            set(value) = definedExternally
        var thingName: DeviceDefenderThingName?
            get() = definedExternally
            set(value) = definedExternally
        var securityProfileName: SecurityProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var behavior: Behavior?
            get() = definedExternally
            set(value) = definedExternally
        var metricValue: MetricValue?
            get() = definedExternally
            set(value) = definedExternally
        var violationEventType: String /* "in-alarm" | "alarm-cleared" | "alarm-invalidated" | String */
        var violationEventTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-05-28" | "latest" | String */
    }
}