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
import ConfigService.AccountAggregationSource
import ConfigService.AggregateComplianceByConfigRule
import ConfigService.AggregateComplianceCount
import ConfigService.AggregateEvaluationResult
import ConfigService.AggregatedSourceStatus
import ConfigService.AggregationAuthorization
import ConfigService.BaseConfigurationItem
import ConfigService.ComplianceByConfigRule
import ConfigService.ComplianceByResource
import ConfigService.ComplianceSummaryByResourceType
import ConfigService.ConfigRuleEvaluationStatus
import ConfigService.ConfigRule
import ConfigService.ConfigurationAggregator
import ConfigService.ConfigurationItem
import ConfigService.ConfigurationRecorder
import ConfigService.ConfigurationRecorderStatus
import ConfigService.ConformancePackComplianceSummary
import ConfigService.ConformancePackDetail
import ConfigService.ConformancePackInputParameter
import ConfigService.ConformancePackRuleCompliance
import ConfigService.ConformancePackEvaluationResult
import ConfigService.ConformancePackStatusDetail
import ConfigService.DeliveryChannel
import ConfigService.DeliveryChannelStatus
import ConfigService.AggregateResourceIdentifier
import ConfigService.EvaluationResult
import ConfigService.Evaluation
import ConfigService.FailedDeleteRemediationExceptionsBatch
import ConfigService.FailedRemediationBatch
import ConfigService.FailedRemediationExceptionBatch
import ConfigService.FieldInfo
import ConfigService.GroupedResourceCount
import ConfigService.MemberAccountStatus
import ConfigService.OrganizationConfigRuleStatus
import ConfigService.OrganizationConfigRule
import ConfigService.OrganizationConformancePackDetailedStatus
import ConfigService.OrganizationConformancePackStatus
import ConfigService.OrganizationConformancePack
import ConfigService.PendingAggregationRequest
import ConfigService.Relationship
import ConfigService.RemediationConfiguration
import ConfigService.RemediationExceptionResourceKey
import ConfigService.RemediationException
import ConfigService.RemediationExecutionStatus
import ConfigService.RemediationExecutionStep
import ConfigService.ResourceCount
import ConfigService.ResourceIdentifier
import ConfigService.ResourceKey
import ConfigService.RetentionConfiguration
import ConfigService.SourceDetail
import ConfigService.Tag
import ConfigService.BatchGetAggregateResourceConfigRequest
import ConfigService.BatchGetAggregateResourceConfigResponse
import ConfigService.BatchGetResourceConfigRequest
import ConfigService.BatchGetResourceConfigResponse
import ConfigService.DeleteAggregationAuthorizationRequest
import ConfigService.DeleteConfigRuleRequest
import ConfigService.DeleteConfigurationAggregatorRequest
import ConfigService.DeleteConfigurationRecorderRequest
import ConfigService.DeleteConformancePackRequest
import ConfigService.DeleteDeliveryChannelRequest
import ConfigService.DeleteEvaluationResultsRequest
import ConfigService.DeleteEvaluationResultsResponse
import ConfigService.DeleteOrganizationConfigRuleRequest
import ConfigService.DeleteOrganizationConformancePackRequest
import ConfigService.DeletePendingAggregationRequestRequest
import ConfigService.DeleteRemediationConfigurationRequest
import ConfigService.DeleteRemediationConfigurationResponse
import ConfigService.DeleteRemediationExceptionsRequest
import ConfigService.DeleteRemediationExceptionsResponse
import ConfigService.DeleteResourceConfigRequest
import ConfigService.DeleteRetentionConfigurationRequest
import ConfigService.DeliverConfigSnapshotRequest
import ConfigService.DeliverConfigSnapshotResponse
import ConfigService.DescribeAggregateComplianceByConfigRulesRequest
import ConfigService.DescribeAggregateComplianceByConfigRulesResponse
import ConfigService.DescribeAggregationAuthorizationsRequest
import ConfigService.DescribeAggregationAuthorizationsResponse
import ConfigService.DescribeComplianceByConfigRuleRequest
import ConfigService.DescribeComplianceByConfigRuleResponse
import ConfigService.DescribeComplianceByResourceRequest
import ConfigService.DescribeComplianceByResourceResponse
import ConfigService.DescribeConfigRuleEvaluationStatusRequest
import ConfigService.DescribeConfigRuleEvaluationStatusResponse
import ConfigService.DescribeConfigRulesRequest
import ConfigService.DescribeConfigRulesResponse
import ConfigService.DescribeConfigurationAggregatorSourcesStatusRequest
import ConfigService.DescribeConfigurationAggregatorSourcesStatusResponse
import ConfigService.DescribeConfigurationAggregatorsRequest
import ConfigService.DescribeConfigurationAggregatorsResponse
import ConfigService.DescribeConfigurationRecorderStatusRequest
import ConfigService.DescribeConfigurationRecorderStatusResponse
import ConfigService.DescribeConfigurationRecordersRequest
import ConfigService.DescribeConfigurationRecordersResponse
import ConfigService.DescribeConformancePackComplianceRequest
import ConfigService.DescribeConformancePackComplianceResponse
import ConfigService.DescribeConformancePackStatusRequest
import ConfigService.DescribeConformancePackStatusResponse
import ConfigService.DescribeConformancePacksRequest
import ConfigService.DescribeConformancePacksResponse
import ConfigService.DescribeDeliveryChannelStatusRequest
import ConfigService.DescribeDeliveryChannelStatusResponse
import ConfigService.DescribeDeliveryChannelsRequest
import ConfigService.DescribeDeliveryChannelsResponse
import ConfigService.DescribeOrganizationConfigRuleStatusesRequest
import ConfigService.DescribeOrganizationConfigRuleStatusesResponse
import ConfigService.DescribeOrganizationConfigRulesRequest
import ConfigService.DescribeOrganizationConfigRulesResponse
import ConfigService.DescribeOrganizationConformancePackStatusesRequest
import ConfigService.DescribeOrganizationConformancePackStatusesResponse
import ConfigService.DescribeOrganizationConformancePacksRequest
import ConfigService.DescribeOrganizationConformancePacksResponse
import ConfigService.DescribePendingAggregationRequestsRequest
import ConfigService.DescribePendingAggregationRequestsResponse
import ConfigService.DescribeRemediationConfigurationsRequest
import ConfigService.DescribeRemediationConfigurationsResponse
import ConfigService.DescribeRemediationExceptionsRequest
import ConfigService.DescribeRemediationExceptionsResponse
import ConfigService.DescribeRemediationExecutionStatusRequest
import ConfigService.DescribeRemediationExecutionStatusResponse
import ConfigService.DescribeRetentionConfigurationsRequest
import ConfigService.DescribeRetentionConfigurationsResponse
import ConfigService.GetAggregateComplianceDetailsByConfigRuleRequest
import ConfigService.GetAggregateComplianceDetailsByConfigRuleResponse
import ConfigService.GetAggregateConfigRuleComplianceSummaryRequest
import ConfigService.GetAggregateConfigRuleComplianceSummaryResponse
import ConfigService.GetAggregateDiscoveredResourceCountsRequest
import ConfigService.GetAggregateDiscoveredResourceCountsResponse
import ConfigService.GetAggregateResourceConfigRequest
import ConfigService.GetAggregateResourceConfigResponse
import ConfigService.GetComplianceDetailsByConfigRuleRequest
import ConfigService.GetComplianceDetailsByConfigRuleResponse
import ConfigService.GetComplianceDetailsByResourceRequest
import ConfigService.GetComplianceDetailsByResourceResponse
import ConfigService.GetComplianceSummaryByConfigRuleResponse
import ConfigService.GetComplianceSummaryByResourceTypeRequest
import ConfigService.GetComplianceSummaryByResourceTypeResponse
import ConfigService.GetConformancePackComplianceDetailsRequest
import ConfigService.GetConformancePackComplianceDetailsResponse
import ConfigService.GetConformancePackComplianceSummaryRequest
import ConfigService.GetConformancePackComplianceSummaryResponse
import ConfigService.GetDiscoveredResourceCountsRequest
import ConfigService.GetDiscoveredResourceCountsResponse
import ConfigService.GetOrganizationConfigRuleDetailedStatusRequest
import ConfigService.GetOrganizationConfigRuleDetailedStatusResponse
import ConfigService.GetOrganizationConformancePackDetailedStatusRequest
import ConfigService.GetOrganizationConformancePackDetailedStatusResponse
import ConfigService.GetResourceConfigHistoryRequest
import ConfigService.GetResourceConfigHistoryResponse
import ConfigService.ListAggregateDiscoveredResourcesRequest
import ConfigService.ListAggregateDiscoveredResourcesResponse
import ConfigService.ListDiscoveredResourcesRequest
import ConfigService.ListDiscoveredResourcesResponse
import ConfigService.ListTagsForResourceRequest
import ConfigService.ListTagsForResourceResponse
import ConfigService.PutAggregationAuthorizationRequest
import ConfigService.PutAggregationAuthorizationResponse
import ConfigService.PutConfigRuleRequest
import ConfigService.PutConfigurationAggregatorRequest
import ConfigService.PutConfigurationAggregatorResponse
import ConfigService.PutConfigurationRecorderRequest
import ConfigService.PutConformancePackRequest
import ConfigService.PutConformancePackResponse
import ConfigService.PutDeliveryChannelRequest
import ConfigService.PutEvaluationsRequest
import ConfigService.PutEvaluationsResponse
import ConfigService.PutOrganizationConfigRuleRequest
import ConfigService.PutOrganizationConfigRuleResponse
import ConfigService.PutOrganizationConformancePackRequest
import ConfigService.PutOrganizationConformancePackResponse
import ConfigService.PutRemediationConfigurationsRequest
import ConfigService.PutRemediationConfigurationsResponse
import ConfigService.PutRemediationExceptionsRequest
import ConfigService.PutRemediationExceptionsResponse
import ConfigService.PutResourceConfigRequest
import ConfigService.PutRetentionConfigurationRequest
import ConfigService.PutRetentionConfigurationResponse
import ConfigService.SelectAggregateResourceConfigRequest
import ConfigService.SelectAggregateResourceConfigResponse
import ConfigService.SelectResourceConfigRequest
import ConfigService.SelectResourceConfigResponse
import ConfigService.StartConfigRulesEvaluationRequest
import ConfigService.StartConfigRulesEvaluationResponse
import ConfigService.StartConfigurationRecorderRequest
import ConfigService.StartRemediationExecutionRequest
import ConfigService.StartRemediationExecutionResponse
import ConfigService.StopConfigurationRecorderRequest
import ConfigService.TagResourceRequest
import ConfigService.UntagResourceRequest
import ConfigService.Compliance
import ConfigService.ComplianceSummary
import ConfigService.EvaluationResultIdentifier
import ConfigService.SupplementaryConfiguration
import ConfigService.ComplianceContributorCount
import ConfigService.Scope
import ConfigService.Source
import ConfigService.OrganizationAggregationSource
import ConfigService.Tags
import ConfigService.RecordingGroup
import ConfigService.ConfigSnapshotDeliveryProperties
import ConfigService.ConfigExportDeliveryInfo
import ConfigService.ConfigStreamDeliveryInfo
import ConfigService.ConfigRuleComplianceFilters
import ConfigService.ConformancePackComplianceFilters
import ConfigService.EvaluationResultQualifier
import ConfigService.SsmControls
import ConfigService.ConfigRuleComplianceSummaryFilters
import ConfigService.ResourceCountFilters
import ConfigService.ConformancePackEvaluationFilters
import ConfigService.StatusDetailFilters
import ConfigService.OrganizationResourceDetailedStatusFilters
import ConfigService.ResourceFilters
import ConfigService.OrganizationManagedRuleMetadata
import ConfigService.OrganizationCustomRuleMetadata
import ConfigService.RemediationParameters
import ConfigService.ExecutionControls
import ConfigService.ResourceValue
import ConfigService.StaticValue
import ConfigService.RemediationParameterValue
import ConfigService.QueryInfo

typealias ARN = String

typealias AccountAggregationSourceAccountList = Array<AccountId>

typealias AccountAggregationSourceList = Array<AccountAggregationSource>

typealias AccountId = String

typealias AggregateComplianceByConfigRuleList = Array<AggregateComplianceByConfigRule>

typealias AggregateComplianceCountList = Array<AggregateComplianceCount>

typealias AggregateEvaluationResultList = Array<AggregateEvaluationResult>

typealias AggregatedSourceStatusList = Array<AggregatedSourceStatus>

typealias AggregatedSourceStatusTypeList = Array<String /* "FAILED" | "SUCCEEDED" | "OUTDATED" | String */>

typealias AggregationAuthorizationList = Array<AggregationAuthorization>

typealias AggregatorRegionList = Array<String>

typealias AllSupported = Boolean

typealias AmazonResourceName = String

typealias Annotation = String

typealias AutoRemediationAttemptSeconds = Number

typealias AutoRemediationAttempts = Number

typealias AvailabilityZone = String

typealias AwsRegion = String

typealias BaseConfigurationItems = Array<BaseConfigurationItem>

typealias BaseResourceId = String

typealias Boolean = Boolean

typealias ChannelName = String

typealias ComplianceByConfigRules = Array<ComplianceByConfigRule>

typealias ComplianceByResources = Array<ComplianceByResource>

typealias ComplianceResourceTypes = Array<StringWithCharLimit256>

typealias ComplianceSummariesByResourceType = Array<ComplianceSummaryByResourceType>

typealias ComplianceTypes = Array<String /* "COMPLIANT" | "NON_COMPLIANT" | "NOT_APPLICABLE" | "INSUFFICIENT_DATA" | String */>

typealias ConfigRuleEvaluationStatusList = Array<ConfigRuleEvaluationStatus>

typealias ConfigRuleName = String

typealias ConfigRuleNames = Array<ConfigRuleName>

typealias ConfigRules = Array<ConfigRule>

typealias Configuration = String

typealias ConfigurationAggregatorArn = String

typealias ConfigurationAggregatorList = Array<ConfigurationAggregator>

typealias ConfigurationAggregatorName = String

typealias ConfigurationAggregatorNameList = Array<ConfigurationAggregatorName>

typealias ConfigurationItemCaptureTime = Date

typealias ConfigurationItemList = Array<ConfigurationItem>

typealias ConfigurationItemMD5Hash = String

typealias ConfigurationRecorderList = Array<ConfigurationRecorder>

typealias ConfigurationRecorderNameList = Array<RecorderName>

typealias ConfigurationRecorderStatusList = Array<ConfigurationRecorderStatus>

typealias ConfigurationStateId = String

typealias ConformancePackArn = String

typealias ConformancePackComplianceResourceIds = Array<StringWithCharLimit256>

typealias ConformancePackComplianceSummaryList = Array<ConformancePackComplianceSummary>

typealias ConformancePackConfigRuleNames = Array<StringWithCharLimit64>

typealias ConformancePackDetailList = Array<ConformancePackDetail>

typealias ConformancePackId = String

typealias ConformancePackInputParameters = Array<ConformancePackInputParameter>

typealias ConformancePackName = String

typealias ConformancePackNamesList = Array<ConformancePackName>

typealias ConformancePackNamesToSummarizeList = Array<ConformancePackName>

typealias ConformancePackRuleComplianceList = Array<ConformancePackRuleCompliance>

typealias ConformancePackRuleEvaluationResultsList = Array<ConformancePackEvaluationResult>

typealias ConformancePackStatusDetailsList = Array<ConformancePackStatusDetail>

typealias ConformancePackStatusReason = String

typealias CosmosPageLimit = Number

typealias _Date = Date

typealias DeliveryChannelList = Array<DeliveryChannel>

typealias DeliveryChannelNameList = Array<ChannelName>

typealias DeliveryChannelStatusList = Array<DeliveryChannelStatus>

typealias DeliveryS3Bucket = String

typealias DeliveryS3KeyPrefix = String

typealias DescribeConformancePackComplianceLimit = Number

typealias DescribePendingAggregationRequestsLimit = Number

typealias DiscoveredResourceIdentifierList = Array<AggregateResourceIdentifier>

typealias EarlierTime = Date

typealias EmptiableStringWithCharLimit256 = String

typealias EvaluationResults = Array<EvaluationResult>

typealias Evaluations = Array<Evaluation>

typealias ExcludedAccounts = Array<AccountId>

typealias Expression = String

typealias FailedDeleteRemediationExceptionsBatches = Array<FailedDeleteRemediationExceptionsBatch>

typealias FailedRemediationBatches = Array<FailedRemediationBatch>

typealias FailedRemediationExceptionBatches = Array<FailedRemediationExceptionBatch>

typealias FieldInfoList = Array<FieldInfo>

typealias FieldName = String

typealias GetConformancePackComplianceDetailsLimit = Number

typealias GroupByAPILimit = Number

typealias GroupedResourceCountList = Array<GroupedResourceCount>

typealias IncludeGlobalResourceTypes = Boolean

typealias Integer = Number

typealias LaterTime = Date

typealias Limit = Number

typealias Long = Number

typealias Name = String

typealias NextToken = String

typealias OrderingTimestamp = Date

typealias OrganizationConfigRuleDetailedStatus = Array<MemberAccountStatus>

typealias OrganizationConfigRuleName = String

typealias OrganizationConfigRuleNames = Array<StringWithCharLimit64>

typealias OrganizationConfigRuleStatuses = Array<OrganizationConfigRuleStatus>

typealias OrganizationConfigRuleTriggerTypes = Array<String /* "ConfigurationItemChangeNotification" | "OversizedConfigurationItemChangeNotification" | "ScheduledNotification" | String */>

typealias OrganizationConfigRules = Array<OrganizationConfigRule>

typealias OrganizationConformancePackDetailedStatuses = Array<OrganizationConformancePackDetailedStatus>

typealias OrganizationConformancePackName = String

typealias OrganizationConformancePackNames = Array<OrganizationConformancePackName>

typealias OrganizationConformancePackStatuses = Array<OrganizationConformancePackStatus>

typealias OrganizationConformancePacks = Array<OrganizationConformancePack>

typealias PageSizeLimit = Number

typealias ParameterName = String

typealias ParameterValue = String

typealias PendingAggregationRequestList = Array<PendingAggregationRequest>

typealias Percentage = Number

typealias RecorderName = String

typealias ReevaluateConfigRuleNames = Array<ConfigRuleName>

typealias RelatedEvent = String

typealias RelatedEventList = Array<RelatedEvent>

typealias RelationshipList = Array<Relationship>

typealias RelationshipName = String

typealias RemediationConfigurations = Array<RemediationConfiguration>

typealias RemediationExceptionResourceKeys = Array<RemediationExceptionResourceKey>

typealias RemediationExceptions = Array<RemediationException>

typealias RemediationExecutionStatuses = Array<RemediationExecutionStatus>

typealias RemediationExecutionSteps = Array<RemediationExecutionStep>

typealias ResourceCounts = Array<ResourceCount>

typealias ResourceCreationTime = Date

typealias ResourceDeletionTime = Date

typealias ResourceId = String

typealias ResourceIdList = Array<ResourceId>

typealias ResourceIdentifierList = Array<ResourceIdentifier>

typealias ResourceIdentifiersList = Array<AggregateResourceIdentifier>

typealias ResourceKeys = Array<ResourceKey>

typealias ResourceName = String

typealias ResourceTypeList = Array<String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */>

typealias ResourceTypeString = String

typealias ResourceTypes = Array<StringWithCharLimit256>

typealias ResourceTypesScope = Array<StringWithCharLimit256>

typealias Results = Array<String>

typealias RetentionConfigurationList = Array<RetentionConfiguration>

typealias RetentionConfigurationName = String

typealias RetentionConfigurationNameList = Array<RetentionConfigurationName>

typealias RetentionPeriodInDays = Number

typealias RuleLimit = Number

typealias SchemaVersionId = String

typealias SourceDetails = Array<SourceDetail>

typealias StackArn = String

typealias StaticParameterValues = Array<StringWithCharLimit256>

typealias String = String

typealias StringWithCharLimit1024 = String

typealias StringWithCharLimit128 = String

typealias StringWithCharLimit2048 = String

typealias StringWithCharLimit256 = String

typealias StringWithCharLimit256Min0 = String

typealias StringWithCharLimit64 = String

typealias StringWithCharLimit768 = String

typealias SupplementaryConfigurationName = String

typealias SupplementaryConfigurationValue = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TagsList = Array<Tag>

typealias TemplateBody = String

typealias TemplateS3Uri = String

typealias UnprocessedResourceIdentifierList = Array<AggregateResourceIdentifier>

typealias Value = String

typealias Version = String

@JsModule("aws-sdk")
external open class ConfigService(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ConfigService.Types.ClientConfiguration */
    open fun batchGetAggregateResourceConfig(params: BatchGetAggregateResourceConfigRequest, callback: (err: AWSError, data: BatchGetAggregateResourceConfigResponse) -> Unit = definedExternally): Request<BatchGetAggregateResourceConfigResponse, AWSError>
    open fun batchGetAggregateResourceConfig(callback: (err: AWSError, data: BatchGetAggregateResourceConfigResponse) -> Unit = definedExternally): Request<BatchGetAggregateResourceConfigResponse, AWSError>
    open fun batchGetResourceConfig(params: BatchGetResourceConfigRequest, callback: (err: AWSError, data: BatchGetResourceConfigResponse) -> Unit = definedExternally): Request<BatchGetResourceConfigResponse, AWSError>
    open fun batchGetResourceConfig(callback: (err: AWSError, data: BatchGetResourceConfigResponse) -> Unit = definedExternally): Request<BatchGetResourceConfigResponse, AWSError>
    open fun deleteAggregationAuthorization(params: DeleteAggregationAuthorizationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAggregationAuthorization(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConfigRule(params: DeleteConfigRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConfigRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConfigurationAggregator(params: DeleteConfigurationAggregatorRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConfigurationAggregator(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConfigurationRecorder(params: DeleteConfigurationRecorderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConfigurationRecorder(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConformancePack(params: DeleteConformancePackRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConformancePack(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeliveryChannel(params: DeleteDeliveryChannelRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDeliveryChannel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEvaluationResults(params: DeleteEvaluationResultsRequest, callback: (err: AWSError, data: DeleteEvaluationResultsResponse) -> Unit = definedExternally): Request<DeleteEvaluationResultsResponse, AWSError>
    open fun deleteEvaluationResults(callback: (err: AWSError, data: DeleteEvaluationResultsResponse) -> Unit = definedExternally): Request<DeleteEvaluationResultsResponse, AWSError>
    open fun deleteOrganizationConfigRule(params: DeleteOrganizationConfigRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteOrganizationConfigRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteOrganizationConformancePack(params: DeleteOrganizationConformancePackRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteOrganizationConformancePack(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePendingAggregationRequest(params: DeletePendingAggregationRequestRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePendingAggregationRequest(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRemediationConfiguration(params: DeleteRemediationConfigurationRequest, callback: (err: AWSError, data: DeleteRemediationConfigurationResponse) -> Unit = definedExternally): Request<DeleteRemediationConfigurationResponse, AWSError>
    open fun deleteRemediationConfiguration(callback: (err: AWSError, data: DeleteRemediationConfigurationResponse) -> Unit = definedExternally): Request<DeleteRemediationConfigurationResponse, AWSError>
    open fun deleteRemediationExceptions(params: DeleteRemediationExceptionsRequest, callback: (err: AWSError, data: DeleteRemediationExceptionsResponse) -> Unit = definedExternally): Request<DeleteRemediationExceptionsResponse, AWSError>
    open fun deleteRemediationExceptions(callback: (err: AWSError, data: DeleteRemediationExceptionsResponse) -> Unit = definedExternally): Request<DeleteRemediationExceptionsResponse, AWSError>
    open fun deleteResourceConfig(params: DeleteResourceConfigRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteResourceConfig(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRetentionConfiguration(params: DeleteRetentionConfigurationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRetentionConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deliverConfigSnapshot(params: DeliverConfigSnapshotRequest, callback: (err: AWSError, data: DeliverConfigSnapshotResponse) -> Unit = definedExternally): Request<DeliverConfigSnapshotResponse, AWSError>
    open fun deliverConfigSnapshot(callback: (err: AWSError, data: DeliverConfigSnapshotResponse) -> Unit = definedExternally): Request<DeliverConfigSnapshotResponse, AWSError>
    open fun describeAggregateComplianceByConfigRules(params: DescribeAggregateComplianceByConfigRulesRequest, callback: (err: AWSError, data: DescribeAggregateComplianceByConfigRulesResponse) -> Unit = definedExternally): Request<DescribeAggregateComplianceByConfigRulesResponse, AWSError>
    open fun describeAggregateComplianceByConfigRules(callback: (err: AWSError, data: DescribeAggregateComplianceByConfigRulesResponse) -> Unit = definedExternally): Request<DescribeAggregateComplianceByConfigRulesResponse, AWSError>
    open fun describeAggregationAuthorizations(params: DescribeAggregationAuthorizationsRequest, callback: (err: AWSError, data: DescribeAggregationAuthorizationsResponse) -> Unit = definedExternally): Request<DescribeAggregationAuthorizationsResponse, AWSError>
    open fun describeAggregationAuthorizations(callback: (err: AWSError, data: DescribeAggregationAuthorizationsResponse) -> Unit = definedExternally): Request<DescribeAggregationAuthorizationsResponse, AWSError>
    open fun describeComplianceByConfigRule(params: DescribeComplianceByConfigRuleRequest, callback: (err: AWSError, data: DescribeComplianceByConfigRuleResponse) -> Unit = definedExternally): Request<DescribeComplianceByConfigRuleResponse, AWSError>
    open fun describeComplianceByConfigRule(callback: (err: AWSError, data: DescribeComplianceByConfigRuleResponse) -> Unit = definedExternally): Request<DescribeComplianceByConfigRuleResponse, AWSError>
    open fun describeComplianceByResource(params: DescribeComplianceByResourceRequest, callback: (err: AWSError, data: DescribeComplianceByResourceResponse) -> Unit = definedExternally): Request<DescribeComplianceByResourceResponse, AWSError>
    open fun describeComplianceByResource(callback: (err: AWSError, data: DescribeComplianceByResourceResponse) -> Unit = definedExternally): Request<DescribeComplianceByResourceResponse, AWSError>
    open fun describeConfigRuleEvaluationStatus(params: DescribeConfigRuleEvaluationStatusRequest, callback: (err: AWSError, data: DescribeConfigRuleEvaluationStatusResponse) -> Unit = definedExternally): Request<DescribeConfigRuleEvaluationStatusResponse, AWSError>
    open fun describeConfigRuleEvaluationStatus(callback: (err: AWSError, data: DescribeConfigRuleEvaluationStatusResponse) -> Unit = definedExternally): Request<DescribeConfigRuleEvaluationStatusResponse, AWSError>
    open fun describeConfigRules(params: DescribeConfigRulesRequest, callback: (err: AWSError, data: DescribeConfigRulesResponse) -> Unit = definedExternally): Request<DescribeConfigRulesResponse, AWSError>
    open fun describeConfigRules(callback: (err: AWSError, data: DescribeConfigRulesResponse) -> Unit = definedExternally): Request<DescribeConfigRulesResponse, AWSError>
    open fun describeConfigurationAggregatorSourcesStatus(params: DescribeConfigurationAggregatorSourcesStatusRequest, callback: (err: AWSError, data: DescribeConfigurationAggregatorSourcesStatusResponse) -> Unit = definedExternally): Request<DescribeConfigurationAggregatorSourcesStatusResponse, AWSError>
    open fun describeConfigurationAggregatorSourcesStatus(callback: (err: AWSError, data: DescribeConfigurationAggregatorSourcesStatusResponse) -> Unit = definedExternally): Request<DescribeConfigurationAggregatorSourcesStatusResponse, AWSError>
    open fun describeConfigurationAggregators(params: DescribeConfigurationAggregatorsRequest, callback: (err: AWSError, data: DescribeConfigurationAggregatorsResponse) -> Unit = definedExternally): Request<DescribeConfigurationAggregatorsResponse, AWSError>
    open fun describeConfigurationAggregators(callback: (err: AWSError, data: DescribeConfigurationAggregatorsResponse) -> Unit = definedExternally): Request<DescribeConfigurationAggregatorsResponse, AWSError>
    open fun describeConfigurationRecorderStatus(params: DescribeConfigurationRecorderStatusRequest, callback: (err: AWSError, data: DescribeConfigurationRecorderStatusResponse) -> Unit = definedExternally): Request<DescribeConfigurationRecorderStatusResponse, AWSError>
    open fun describeConfigurationRecorderStatus(callback: (err: AWSError, data: DescribeConfigurationRecorderStatusResponse) -> Unit = definedExternally): Request<DescribeConfigurationRecorderStatusResponse, AWSError>
    open fun describeConfigurationRecorders(params: DescribeConfigurationRecordersRequest, callback: (err: AWSError, data: DescribeConfigurationRecordersResponse) -> Unit = definedExternally): Request<DescribeConfigurationRecordersResponse, AWSError>
    open fun describeConfigurationRecorders(callback: (err: AWSError, data: DescribeConfigurationRecordersResponse) -> Unit = definedExternally): Request<DescribeConfigurationRecordersResponse, AWSError>
    open fun describeConformancePackCompliance(params: DescribeConformancePackComplianceRequest, callback: (err: AWSError, data: DescribeConformancePackComplianceResponse) -> Unit = definedExternally): Request<DescribeConformancePackComplianceResponse, AWSError>
    open fun describeConformancePackCompliance(callback: (err: AWSError, data: DescribeConformancePackComplianceResponse) -> Unit = definedExternally): Request<DescribeConformancePackComplianceResponse, AWSError>
    open fun describeConformancePackStatus(params: DescribeConformancePackStatusRequest, callback: (err: AWSError, data: DescribeConformancePackStatusResponse) -> Unit = definedExternally): Request<DescribeConformancePackStatusResponse, AWSError>
    open fun describeConformancePackStatus(callback: (err: AWSError, data: DescribeConformancePackStatusResponse) -> Unit = definedExternally): Request<DescribeConformancePackStatusResponse, AWSError>
    open fun describeConformancePacks(params: DescribeConformancePacksRequest, callback: (err: AWSError, data: DescribeConformancePacksResponse) -> Unit = definedExternally): Request<DescribeConformancePacksResponse, AWSError>
    open fun describeConformancePacks(callback: (err: AWSError, data: DescribeConformancePacksResponse) -> Unit = definedExternally): Request<DescribeConformancePacksResponse, AWSError>
    open fun describeDeliveryChannelStatus(params: DescribeDeliveryChannelStatusRequest, callback: (err: AWSError, data: DescribeDeliveryChannelStatusResponse) -> Unit = definedExternally): Request<DescribeDeliveryChannelStatusResponse, AWSError>
    open fun describeDeliveryChannelStatus(callback: (err: AWSError, data: DescribeDeliveryChannelStatusResponse) -> Unit = definedExternally): Request<DescribeDeliveryChannelStatusResponse, AWSError>
    open fun describeDeliveryChannels(params: DescribeDeliveryChannelsRequest, callback: (err: AWSError, data: DescribeDeliveryChannelsResponse) -> Unit = definedExternally): Request<DescribeDeliveryChannelsResponse, AWSError>
    open fun describeDeliveryChannels(callback: (err: AWSError, data: DescribeDeliveryChannelsResponse) -> Unit = definedExternally): Request<DescribeDeliveryChannelsResponse, AWSError>
    open fun describeOrganizationConfigRuleStatuses(params: DescribeOrganizationConfigRuleStatusesRequest, callback: (err: AWSError, data: DescribeOrganizationConfigRuleStatusesResponse) -> Unit = definedExternally): Request<DescribeOrganizationConfigRuleStatusesResponse, AWSError>
    open fun describeOrganizationConfigRuleStatuses(callback: (err: AWSError, data: DescribeOrganizationConfigRuleStatusesResponse) -> Unit = definedExternally): Request<DescribeOrganizationConfigRuleStatusesResponse, AWSError>
    open fun describeOrganizationConfigRules(params: DescribeOrganizationConfigRulesRequest, callback: (err: AWSError, data: DescribeOrganizationConfigRulesResponse) -> Unit = definedExternally): Request<DescribeOrganizationConfigRulesResponse, AWSError>
    open fun describeOrganizationConfigRules(callback: (err: AWSError, data: DescribeOrganizationConfigRulesResponse) -> Unit = definedExternally): Request<DescribeOrganizationConfigRulesResponse, AWSError>
    open fun describeOrganizationConformancePackStatuses(params: DescribeOrganizationConformancePackStatusesRequest, callback: (err: AWSError, data: DescribeOrganizationConformancePackStatusesResponse) -> Unit = definedExternally): Request<DescribeOrganizationConformancePackStatusesResponse, AWSError>
    open fun describeOrganizationConformancePackStatuses(callback: (err: AWSError, data: DescribeOrganizationConformancePackStatusesResponse) -> Unit = definedExternally): Request<DescribeOrganizationConformancePackStatusesResponse, AWSError>
    open fun describeOrganizationConformancePacks(params: DescribeOrganizationConformancePacksRequest, callback: (err: AWSError, data: DescribeOrganizationConformancePacksResponse) -> Unit = definedExternally): Request<DescribeOrganizationConformancePacksResponse, AWSError>
    open fun describeOrganizationConformancePacks(callback: (err: AWSError, data: DescribeOrganizationConformancePacksResponse) -> Unit = definedExternally): Request<DescribeOrganizationConformancePacksResponse, AWSError>
    open fun describePendingAggregationRequests(params: DescribePendingAggregationRequestsRequest, callback: (err: AWSError, data: DescribePendingAggregationRequestsResponse) -> Unit = definedExternally): Request<DescribePendingAggregationRequestsResponse, AWSError>
    open fun describePendingAggregationRequests(callback: (err: AWSError, data: DescribePendingAggregationRequestsResponse) -> Unit = definedExternally): Request<DescribePendingAggregationRequestsResponse, AWSError>
    open fun describeRemediationConfigurations(params: DescribeRemediationConfigurationsRequest, callback: (err: AWSError, data: DescribeRemediationConfigurationsResponse) -> Unit = definedExternally): Request<DescribeRemediationConfigurationsResponse, AWSError>
    open fun describeRemediationConfigurations(callback: (err: AWSError, data: DescribeRemediationConfigurationsResponse) -> Unit = definedExternally): Request<DescribeRemediationConfigurationsResponse, AWSError>
    open fun describeRemediationExceptions(params: DescribeRemediationExceptionsRequest, callback: (err: AWSError, data: DescribeRemediationExceptionsResponse) -> Unit = definedExternally): Request<DescribeRemediationExceptionsResponse, AWSError>
    open fun describeRemediationExceptions(callback: (err: AWSError, data: DescribeRemediationExceptionsResponse) -> Unit = definedExternally): Request<DescribeRemediationExceptionsResponse, AWSError>
    open fun describeRemediationExecutionStatus(params: DescribeRemediationExecutionStatusRequest, callback: (err: AWSError, data: DescribeRemediationExecutionStatusResponse) -> Unit = definedExternally): Request<DescribeRemediationExecutionStatusResponse, AWSError>
    open fun describeRemediationExecutionStatus(callback: (err: AWSError, data: DescribeRemediationExecutionStatusResponse) -> Unit = definedExternally): Request<DescribeRemediationExecutionStatusResponse, AWSError>
    open fun describeRetentionConfigurations(params: DescribeRetentionConfigurationsRequest, callback: (err: AWSError, data: DescribeRetentionConfigurationsResponse) -> Unit = definedExternally): Request<DescribeRetentionConfigurationsResponse, AWSError>
    open fun describeRetentionConfigurations(callback: (err: AWSError, data: DescribeRetentionConfigurationsResponse) -> Unit = definedExternally): Request<DescribeRetentionConfigurationsResponse, AWSError>
    open fun getAggregateComplianceDetailsByConfigRule(params: GetAggregateComplianceDetailsByConfigRuleRequest, callback: (err: AWSError, data: GetAggregateComplianceDetailsByConfigRuleResponse) -> Unit = definedExternally): Request<GetAggregateComplianceDetailsByConfigRuleResponse, AWSError>
    open fun getAggregateComplianceDetailsByConfigRule(callback: (err: AWSError, data: GetAggregateComplianceDetailsByConfigRuleResponse) -> Unit = definedExternally): Request<GetAggregateComplianceDetailsByConfigRuleResponse, AWSError>
    open fun getAggregateConfigRuleComplianceSummary(params: GetAggregateConfigRuleComplianceSummaryRequest, callback: (err: AWSError, data: GetAggregateConfigRuleComplianceSummaryResponse) -> Unit = definedExternally): Request<GetAggregateConfigRuleComplianceSummaryResponse, AWSError>
    open fun getAggregateConfigRuleComplianceSummary(callback: (err: AWSError, data: GetAggregateConfigRuleComplianceSummaryResponse) -> Unit = definedExternally): Request<GetAggregateConfigRuleComplianceSummaryResponse, AWSError>
    open fun getAggregateDiscoveredResourceCounts(params: GetAggregateDiscoveredResourceCountsRequest, callback: (err: AWSError, data: GetAggregateDiscoveredResourceCountsResponse) -> Unit = definedExternally): Request<GetAggregateDiscoveredResourceCountsResponse, AWSError>
    open fun getAggregateDiscoveredResourceCounts(callback: (err: AWSError, data: GetAggregateDiscoveredResourceCountsResponse) -> Unit = definedExternally): Request<GetAggregateDiscoveredResourceCountsResponse, AWSError>
    open fun getAggregateResourceConfig(params: GetAggregateResourceConfigRequest, callback: (err: AWSError, data: GetAggregateResourceConfigResponse) -> Unit = definedExternally): Request<GetAggregateResourceConfigResponse, AWSError>
    open fun getAggregateResourceConfig(callback: (err: AWSError, data: GetAggregateResourceConfigResponse) -> Unit = definedExternally): Request<GetAggregateResourceConfigResponse, AWSError>
    open fun getComplianceDetailsByConfigRule(params: GetComplianceDetailsByConfigRuleRequest, callback: (err: AWSError, data: GetComplianceDetailsByConfigRuleResponse) -> Unit = definedExternally): Request<GetComplianceDetailsByConfigRuleResponse, AWSError>
    open fun getComplianceDetailsByConfigRule(callback: (err: AWSError, data: GetComplianceDetailsByConfigRuleResponse) -> Unit = definedExternally): Request<GetComplianceDetailsByConfigRuleResponse, AWSError>
    open fun getComplianceDetailsByResource(params: GetComplianceDetailsByResourceRequest, callback: (err: AWSError, data: GetComplianceDetailsByResourceResponse) -> Unit = definedExternally): Request<GetComplianceDetailsByResourceResponse, AWSError>
    open fun getComplianceDetailsByResource(callback: (err: AWSError, data: GetComplianceDetailsByResourceResponse) -> Unit = definedExternally): Request<GetComplianceDetailsByResourceResponse, AWSError>
    open fun getComplianceSummaryByConfigRule(callback: (err: AWSError, data: GetComplianceSummaryByConfigRuleResponse) -> Unit = definedExternally): Request<GetComplianceSummaryByConfigRuleResponse, AWSError>
    open fun getComplianceSummaryByResourceType(params: GetComplianceSummaryByResourceTypeRequest, callback: (err: AWSError, data: GetComplianceSummaryByResourceTypeResponse) -> Unit = definedExternally): Request<GetComplianceSummaryByResourceTypeResponse, AWSError>
    open fun getComplianceSummaryByResourceType(callback: (err: AWSError, data: GetComplianceSummaryByResourceTypeResponse) -> Unit = definedExternally): Request<GetComplianceSummaryByResourceTypeResponse, AWSError>
    open fun getConformancePackComplianceDetails(params: GetConformancePackComplianceDetailsRequest, callback: (err: AWSError, data: GetConformancePackComplianceDetailsResponse) -> Unit = definedExternally): Request<GetConformancePackComplianceDetailsResponse, AWSError>
    open fun getConformancePackComplianceDetails(callback: (err: AWSError, data: GetConformancePackComplianceDetailsResponse) -> Unit = definedExternally): Request<GetConformancePackComplianceDetailsResponse, AWSError>
    open fun getConformancePackComplianceSummary(params: GetConformancePackComplianceSummaryRequest, callback: (err: AWSError, data: GetConformancePackComplianceSummaryResponse) -> Unit = definedExternally): Request<GetConformancePackComplianceSummaryResponse, AWSError>
    open fun getConformancePackComplianceSummary(callback: (err: AWSError, data: GetConformancePackComplianceSummaryResponse) -> Unit = definedExternally): Request<GetConformancePackComplianceSummaryResponse, AWSError>
    open fun getDiscoveredResourceCounts(params: GetDiscoveredResourceCountsRequest, callback: (err: AWSError, data: GetDiscoveredResourceCountsResponse) -> Unit = definedExternally): Request<GetDiscoveredResourceCountsResponse, AWSError>
    open fun getDiscoveredResourceCounts(callback: (err: AWSError, data: GetDiscoveredResourceCountsResponse) -> Unit = definedExternally): Request<GetDiscoveredResourceCountsResponse, AWSError>
    open fun getOrganizationConfigRuleDetailedStatus(params: GetOrganizationConfigRuleDetailedStatusRequest, callback: (err: AWSError, data: GetOrganizationConfigRuleDetailedStatusResponse) -> Unit = definedExternally): Request<GetOrganizationConfigRuleDetailedStatusResponse, AWSError>
    open fun getOrganizationConfigRuleDetailedStatus(callback: (err: AWSError, data: GetOrganizationConfigRuleDetailedStatusResponse) -> Unit = definedExternally): Request<GetOrganizationConfigRuleDetailedStatusResponse, AWSError>
    open fun getOrganizationConformancePackDetailedStatus(params: GetOrganizationConformancePackDetailedStatusRequest, callback: (err: AWSError, data: GetOrganizationConformancePackDetailedStatusResponse) -> Unit = definedExternally): Request<GetOrganizationConformancePackDetailedStatusResponse, AWSError>
    open fun getOrganizationConformancePackDetailedStatus(callback: (err: AWSError, data: GetOrganizationConformancePackDetailedStatusResponse) -> Unit = definedExternally): Request<GetOrganizationConformancePackDetailedStatusResponse, AWSError>
    open fun getResourceConfigHistory(params: GetResourceConfigHistoryRequest, callback: (err: AWSError, data: GetResourceConfigHistoryResponse) -> Unit = definedExternally): Request<GetResourceConfigHistoryResponse, AWSError>
    open fun getResourceConfigHistory(callback: (err: AWSError, data: GetResourceConfigHistoryResponse) -> Unit = definedExternally): Request<GetResourceConfigHistoryResponse, AWSError>
    open fun listAggregateDiscoveredResources(params: ListAggregateDiscoveredResourcesRequest, callback: (err: AWSError, data: ListAggregateDiscoveredResourcesResponse) -> Unit = definedExternally): Request<ListAggregateDiscoveredResourcesResponse, AWSError>
    open fun listAggregateDiscoveredResources(callback: (err: AWSError, data: ListAggregateDiscoveredResourcesResponse) -> Unit = definedExternally): Request<ListAggregateDiscoveredResourcesResponse, AWSError>
    open fun listDiscoveredResources(params: ListDiscoveredResourcesRequest, callback: (err: AWSError, data: ListDiscoveredResourcesResponse) -> Unit = definedExternally): Request<ListDiscoveredResourcesResponse, AWSError>
    open fun listDiscoveredResources(callback: (err: AWSError, data: ListDiscoveredResourcesResponse) -> Unit = definedExternally): Request<ListDiscoveredResourcesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putAggregationAuthorization(params: PutAggregationAuthorizationRequest, callback: (err: AWSError, data: PutAggregationAuthorizationResponse) -> Unit = definedExternally): Request<PutAggregationAuthorizationResponse, AWSError>
    open fun putAggregationAuthorization(callback: (err: AWSError, data: PutAggregationAuthorizationResponse) -> Unit = definedExternally): Request<PutAggregationAuthorizationResponse, AWSError>
    open fun putConfigRule(params: PutConfigRuleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putConfigRule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putConfigurationAggregator(params: PutConfigurationAggregatorRequest, callback: (err: AWSError, data: PutConfigurationAggregatorResponse) -> Unit = definedExternally): Request<PutConfigurationAggregatorResponse, AWSError>
    open fun putConfigurationAggregator(callback: (err: AWSError, data: PutConfigurationAggregatorResponse) -> Unit = definedExternally): Request<PutConfigurationAggregatorResponse, AWSError>
    open fun putConfigurationRecorder(params: PutConfigurationRecorderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putConfigurationRecorder(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putConformancePack(params: PutConformancePackRequest, callback: (err: AWSError, data: PutConformancePackResponse) -> Unit = definedExternally): Request<PutConformancePackResponse, AWSError>
    open fun putConformancePack(callback: (err: AWSError, data: PutConformancePackResponse) -> Unit = definedExternally): Request<PutConformancePackResponse, AWSError>
    open fun putDeliveryChannel(params: PutDeliveryChannelRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putDeliveryChannel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putEvaluations(params: PutEvaluationsRequest, callback: (err: AWSError, data: PutEvaluationsResponse) -> Unit = definedExternally): Request<PutEvaluationsResponse, AWSError>
    open fun putEvaluations(callback: (err: AWSError, data: PutEvaluationsResponse) -> Unit = definedExternally): Request<PutEvaluationsResponse, AWSError>
    open fun putOrganizationConfigRule(params: PutOrganizationConfigRuleRequest, callback: (err: AWSError, data: PutOrganizationConfigRuleResponse) -> Unit = definedExternally): Request<PutOrganizationConfigRuleResponse, AWSError>
    open fun putOrganizationConfigRule(callback: (err: AWSError, data: PutOrganizationConfigRuleResponse) -> Unit = definedExternally): Request<PutOrganizationConfigRuleResponse, AWSError>
    open fun putOrganizationConformancePack(params: PutOrganizationConformancePackRequest, callback: (err: AWSError, data: PutOrganizationConformancePackResponse) -> Unit = definedExternally): Request<PutOrganizationConformancePackResponse, AWSError>
    open fun putOrganizationConformancePack(callback: (err: AWSError, data: PutOrganizationConformancePackResponse) -> Unit = definedExternally): Request<PutOrganizationConformancePackResponse, AWSError>
    open fun putRemediationConfigurations(params: PutRemediationConfigurationsRequest, callback: (err: AWSError, data: PutRemediationConfigurationsResponse) -> Unit = definedExternally): Request<PutRemediationConfigurationsResponse, AWSError>
    open fun putRemediationConfigurations(callback: (err: AWSError, data: PutRemediationConfigurationsResponse) -> Unit = definedExternally): Request<PutRemediationConfigurationsResponse, AWSError>
    open fun putRemediationExceptions(params: PutRemediationExceptionsRequest, callback: (err: AWSError, data: PutRemediationExceptionsResponse) -> Unit = definedExternally): Request<PutRemediationExceptionsResponse, AWSError>
    open fun putRemediationExceptions(callback: (err: AWSError, data: PutRemediationExceptionsResponse) -> Unit = definedExternally): Request<PutRemediationExceptionsResponse, AWSError>
    open fun putResourceConfig(params: PutResourceConfigRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putResourceConfig(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putRetentionConfiguration(params: PutRetentionConfigurationRequest, callback: (err: AWSError, data: PutRetentionConfigurationResponse) -> Unit = definedExternally): Request<PutRetentionConfigurationResponse, AWSError>
    open fun putRetentionConfiguration(callback: (err: AWSError, data: PutRetentionConfigurationResponse) -> Unit = definedExternally): Request<PutRetentionConfigurationResponse, AWSError>
    open fun selectAggregateResourceConfig(params: SelectAggregateResourceConfigRequest, callback: (err: AWSError, data: SelectAggregateResourceConfigResponse) -> Unit = definedExternally): Request<SelectAggregateResourceConfigResponse, AWSError>
    open fun selectAggregateResourceConfig(callback: (err: AWSError, data: SelectAggregateResourceConfigResponse) -> Unit = definedExternally): Request<SelectAggregateResourceConfigResponse, AWSError>
    open fun selectResourceConfig(params: SelectResourceConfigRequest, callback: (err: AWSError, data: SelectResourceConfigResponse) -> Unit = definedExternally): Request<SelectResourceConfigResponse, AWSError>
    open fun selectResourceConfig(callback: (err: AWSError, data: SelectResourceConfigResponse) -> Unit = definedExternally): Request<SelectResourceConfigResponse, AWSError>
    open fun startConfigRulesEvaluation(params: StartConfigRulesEvaluationRequest, callback: (err: AWSError, data: StartConfigRulesEvaluationResponse) -> Unit = definedExternally): Request<StartConfigRulesEvaluationResponse, AWSError>
    open fun startConfigRulesEvaluation(callback: (err: AWSError, data: StartConfigRulesEvaluationResponse) -> Unit = definedExternally): Request<StartConfigRulesEvaluationResponse, AWSError>
    open fun startConfigurationRecorder(params: StartConfigurationRecorderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startConfigurationRecorder(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startRemediationExecution(params: StartRemediationExecutionRequest, callback: (err: AWSError, data: StartRemediationExecutionResponse) -> Unit = definedExternally): Request<StartRemediationExecutionResponse, AWSError>
    open fun startRemediationExecution(callback: (err: AWSError, data: StartRemediationExecutionResponse) -> Unit = definedExternally): Request<StartRemediationExecutionResponse, AWSError>
    open fun stopConfigurationRecorder(params: StopConfigurationRecorderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopConfigurationRecorder(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface AccountAggregationSource {
        var AccountIds: AccountAggregationSourceAccountList
        var AllAwsRegions: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AwsRegions: AggregatorRegionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AggregateComplianceByConfigRule {
        var ConfigRuleName: ConfigRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var Compliance: Compliance?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var AwsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AggregateComplianceCount {
        var GroupName: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceSummary: ComplianceSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AggregateEvaluationResult {
        var EvaluationResultIdentifier: EvaluationResultIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceType: String /* "COMPLIANT" | "NON_COMPLIANT" | "NOT_APPLICABLE" | "INSUFFICIENT_DATA" | String */
        var ResultRecordedTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigRuleInvokedTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var Annotation: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var AwsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AggregateResourceIdentifier {
        var SourceAccountId: AccountId
        var SourceRegion: AwsRegion
        var ResourceId: ResourceId
        var ResourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var ResourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AggregatedSourceStatus {
        var SourceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: String /* "ACCOUNT" | "ORGANIZATION" | String */
        var AwsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateStatus: String /* "FAILED" | "SUCCEEDED" | "OUTDATED" | String */
        var LastUpdateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AggregationAuthorization {
        var AggregationAuthorizationArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizedAccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var AuthorizedAwsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BaseConfigurationItem {
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var accountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var configurationItemCaptureTime: ConfigurationItemCaptureTime?
            get() = definedExternally
            set(value) = definedExternally
        var configurationItemStatus: String /* "OK" | "ResourceDiscovered" | "ResourceNotRecorded" | "ResourceDeleted" | "ResourceDeletedNotRecorded" | String */
        var configurationStateId: ConfigurationStateId?
            get() = definedExternally
            set(value) = definedExternally
        var arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var resourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var resourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var awsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
        var availabilityZone: AvailabilityZone?
            get() = definedExternally
            set(value) = definedExternally
        var resourceCreationTime: ResourceCreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var configuration: Configuration?
            get() = definedExternally
            set(value) = definedExternally
        var supplementaryConfiguration: SupplementaryConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetAggregateResourceConfigRequest {
        var ConfigurationAggregatorName: ConfigurationAggregatorName
        var ResourceIdentifiers: ResourceIdentifiersList
    }
    interface BatchGetAggregateResourceConfigResponse {
        var BaseConfigurationItems: BaseConfigurationItems?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedResourceIdentifiers: UnprocessedResourceIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetResourceConfigRequest {
        var resourceKeys: ResourceKeys
    }
    interface BatchGetResourceConfigResponse {
        var baseConfigurationItems: BaseConfigurationItems?
            get() = definedExternally
            set(value) = definedExternally
        var unprocessedResourceKeys: ResourceKeys?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Compliance {
        var ComplianceType: String /* "COMPLIANT" | "NON_COMPLIANT" | "NOT_APPLICABLE" | "INSUFFICIENT_DATA" | String */
        var ComplianceContributorCount: ComplianceContributorCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComplianceByConfigRule {
        var ConfigRuleName: StringWithCharLimit64?
            get() = definedExternally
            set(value) = definedExternally
        var Compliance: Compliance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComplianceByResource {
        var ResourceType: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: BaseResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Compliance: Compliance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComplianceContributorCount {
        var CappedCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var CapExceeded: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComplianceSummary {
        var CompliantResourceCount: ComplianceContributorCount?
            get() = definedExternally
            set(value) = definedExternally
        var NonCompliantResourceCount: ComplianceContributorCount?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceSummaryTimestamp: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComplianceSummaryByResourceType {
        var ResourceType: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceSummary: ComplianceSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigExportDeliveryInfo {
        var lastStatus: String /* "Success" | "Failure" | "Not_Applicable" | String */
        var lastErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastAttemptTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastSuccessfulTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var nextDeliveryTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigRule {
        var ConfigRuleName: ConfigRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigRuleArn: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigRuleId: StringWithCharLimit64?
            get() = definedExternally
            set(value) = definedExternally
        var Description: EmptiableStringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var Scope: Scope?
            get() = definedExternally
            set(value) = definedExternally
        var Source: Source
        var InputParameters: StringWithCharLimit1024?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumExecutionFrequency: String /* "One_Hour" | "Three_Hours" | "Six_Hours" | "Twelve_Hours" | "TwentyFour_Hours" | String */
        var ConfigRuleState: String /* "ACTIVE" | "DELETING" | "DELETING_RESULTS" | "EVALUATING" | String */
        var CreatedBy: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigRuleComplianceFilters {
        var ConfigRuleName: ConfigRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceType: String /* "COMPLIANT" | "NON_COMPLIANT" | "NOT_APPLICABLE" | "INSUFFICIENT_DATA" | String */
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var AwsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigRuleComplianceSummaryFilters {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var AwsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigRuleEvaluationStatus {
        var ConfigRuleName: ConfigRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigRuleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigRuleId: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastSuccessfulInvocationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastFailedInvocationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastSuccessfulEvaluationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastFailedEvaluationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var FirstActivatedTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastDeactivatedTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var FirstEvaluationStarted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigSnapshotDeliveryProperties {
        var deliveryFrequency: String /* "One_Hour" | "Three_Hours" | "Six_Hours" | "Twelve_Hours" | "TwentyFour_Hours" | String */
    }
    interface ConfigStreamDeliveryInfo {
        var lastStatus: String /* "Success" | "Failure" | "Not_Applicable" | String */
        var lastErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastStatusChangeTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationAggregator {
        var ConfigurationAggregatorName: ConfigurationAggregatorName?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationAggregatorArn: ConfigurationAggregatorArn?
            get() = definedExternally
            set(value) = definedExternally
        var AccountAggregationSources: AccountAggregationSourceList?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationAggregationSource: OrganizationAggregationSource?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationItem {
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var accountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var configurationItemCaptureTime: ConfigurationItemCaptureTime?
            get() = definedExternally
            set(value) = definedExternally
        var configurationItemStatus: String /* "OK" | "ResourceDiscovered" | "ResourceNotRecorded" | "ResourceDeleted" | "ResourceDeletedNotRecorded" | String */
        var configurationStateId: ConfigurationStateId?
            get() = definedExternally
            set(value) = definedExternally
        var configurationItemMD5Hash: ConfigurationItemMD5Hash?
            get() = definedExternally
            set(value) = definedExternally
        var arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var resourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var resourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var resourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var awsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
        var availabilityZone: AvailabilityZone?
            get() = definedExternally
            set(value) = definedExternally
        var resourceCreationTime: ResourceCreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var relatedEvents: RelatedEventList?
            get() = definedExternally
            set(value) = definedExternally
        var relationships: RelationshipList?
            get() = definedExternally
            set(value) = definedExternally
        var configuration: Configuration?
            get() = definedExternally
            set(value) = definedExternally
        var supplementaryConfiguration: SupplementaryConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationRecorder {
        var name: RecorderName?
            get() = definedExternally
            set(value) = definedExternally
        var roleARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var recordingGroup: RecordingGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationRecorderStatus {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastStartTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastStopTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var recording: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var lastStatus: String /* "Pending" | "Success" | "Failure" | String */
        var lastErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastStatusChangeTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConformancePackComplianceFilters {
        var ConfigRuleNames: ConformancePackConfigRuleNames?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceType: String /* "COMPLIANT" | "NON_COMPLIANT" | String */
    }
    interface ConformancePackComplianceSummary {
        var ConformancePackName: ConformancePackName
        var ConformancePackComplianceStatus: String /* "COMPLIANT" | "NON_COMPLIANT" | String */
    }
    interface ConformancePackDetail {
        var ConformancePackName: ConformancePackName
        var ConformancePackArn: ConformancePackArn
        var ConformancePackId: ConformancePackId
        var DeliveryS3Bucket: DeliveryS3Bucket
        var DeliveryS3KeyPrefix: DeliveryS3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var ConformancePackInputParameters: ConformancePackInputParameters?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateRequestedTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConformancePackEvaluationFilters {
        var ConfigRuleNames: ConformancePackConfigRuleNames?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceType: String /* "COMPLIANT" | "NON_COMPLIANT" | String */
        var ResourceType: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceIds: ConformancePackComplianceResourceIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConformancePackEvaluationResult {
        var ComplianceType: String /* "COMPLIANT" | "NON_COMPLIANT" | String */
        var EvaluationResultIdentifier: EvaluationResultIdentifier
        var ConfigRuleInvokedTime: _Date
        var ResultRecordedTime: _Date
        var Annotation: Annotation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConformancePackInputParameter {
        var ParameterName: ParameterName
        var ParameterValue: ParameterValue
    }
    interface ConformancePackRuleCompliance {
        var ConfigRuleName: ConfigRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceType: String /* "COMPLIANT" | "NON_COMPLIANT" | String */
    }
    interface ConformancePackStatusDetail {
        var ConformancePackName: ConformancePackName
        var ConformancePackId: ConformancePackId
        var ConformancePackArn: ConformancePackArn
        var ConformancePackState: String /* "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | String */
        var StackArn: StackArn
        var ConformancePackStatusReason: ConformancePackStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateRequestedTime: _Date
        var LastUpdateCompletedTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAggregationAuthorizationRequest {
        var AuthorizedAccountId: AccountId
        var AuthorizedAwsRegion: AwsRegion
    }
    interface DeleteConfigRuleRequest {
        var ConfigRuleName: ConfigRuleName
    }
    interface DeleteConfigurationAggregatorRequest {
        var ConfigurationAggregatorName: ConfigurationAggregatorName
    }
    interface DeleteConfigurationRecorderRequest {
        var ConfigurationRecorderName: RecorderName
    }
    interface DeleteConformancePackRequest {
        var ConformancePackName: ConformancePackName
    }
    interface DeleteDeliveryChannelRequest {
        var DeliveryChannelName: ChannelName
    }
    interface DeleteEvaluationResultsRequest {
        var ConfigRuleName: StringWithCharLimit64
    }
    interface DeleteEvaluationResultsResponse
    interface DeleteOrganizationConfigRuleRequest {
        var OrganizationConfigRuleName: OrganizationConfigRuleName
    }
    interface DeleteOrganizationConformancePackRequest {
        var OrganizationConformancePackName: OrganizationConformancePackName
    }
    interface DeletePendingAggregationRequestRequest {
        var RequesterAccountId: AccountId
        var RequesterAwsRegion: AwsRegion
    }
    interface DeleteRemediationConfigurationRequest {
        var ConfigRuleName: ConfigRuleName
        var ResourceType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRemediationConfigurationResponse
    interface DeleteRemediationExceptionsRequest {
        var ConfigRuleName: ConfigRuleName
        var ResourceKeys: RemediationExceptionResourceKeys
    }
    interface DeleteRemediationExceptionsResponse {
        var FailedBatches: FailedDeleteRemediationExceptionsBatches?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteResourceConfigRequest {
        var ResourceType: ResourceTypeString
        var ResourceId: ResourceId
    }
    interface DeleteRetentionConfigurationRequest {
        var RetentionConfigurationName: RetentionConfigurationName
    }
    interface DeliverConfigSnapshotRequest {
        var deliveryChannelName: ChannelName
    }
    interface DeliverConfigSnapshotResponse {
        var configSnapshotId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeliveryChannel {
        var name: ChannelName?
            get() = definedExternally
            set(value) = definedExternally
        var s3BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var s3KeyPrefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var snsTopicARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var configSnapshotDeliveryProperties: ConfigSnapshotDeliveryProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeliveryChannelStatus {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var configSnapshotDeliveryInfo: ConfigExportDeliveryInfo?
            get() = definedExternally
            set(value) = definedExternally
        var configHistoryDeliveryInfo: ConfigExportDeliveryInfo?
            get() = definedExternally
            set(value) = definedExternally
        var configStreamDeliveryInfo: ConfigStreamDeliveryInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAggregateComplianceByConfigRulesRequest {
        var ConfigurationAggregatorName: ConfigurationAggregatorName
        var Filters: ConfigRuleComplianceFilters?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: GroupByAPILimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAggregateComplianceByConfigRulesResponse {
        var AggregateComplianceByConfigRules: AggregateComplianceByConfigRuleList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAggregationAuthorizationsRequest {
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAggregationAuthorizationsResponse {
        var AggregationAuthorizations: AggregationAuthorizationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeComplianceByConfigRuleRequest {
        var ConfigRuleNames: ConfigRuleNames?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceTypes: ComplianceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeComplianceByConfigRuleResponse {
        var ComplianceByConfigRules: ComplianceByConfigRules?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeComplianceByResourceRequest {
        var ResourceType: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: BaseResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceTypes: ComplianceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeComplianceByResourceResponse {
        var ComplianceByResources: ComplianceByResources?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigRuleEvaluationStatusRequest {
        var ConfigRuleNames: ConfigRuleNames?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: RuleLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigRuleEvaluationStatusResponse {
        var ConfigRulesEvaluationStatus: ConfigRuleEvaluationStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigRulesRequest {
        var ConfigRuleNames: ConfigRuleNames?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigRulesResponse {
        var ConfigRules: ConfigRules?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationAggregatorSourcesStatusRequest {
        var ConfigurationAggregatorName: ConfigurationAggregatorName
        var UpdateStatus: AggregatedSourceStatusTypeList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationAggregatorSourcesStatusResponse {
        var AggregatedSourceStatusList: AggregatedSourceStatusList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationAggregatorsRequest {
        var ConfigurationAggregatorNames: ConfigurationAggregatorNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationAggregatorsResponse {
        var ConfigurationAggregators: ConfigurationAggregatorList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationRecorderStatusRequest {
        var ConfigurationRecorderNames: ConfigurationRecorderNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationRecorderStatusResponse {
        var ConfigurationRecordersStatus: ConfigurationRecorderStatusList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationRecordersRequest {
        var ConfigurationRecorderNames: ConfigurationRecorderNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationRecordersResponse {
        var ConfigurationRecorders: ConfigurationRecorderList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConformancePackComplianceRequest {
        var ConformancePackName: ConformancePackName
        var Filters: ConformancePackComplianceFilters?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: DescribeConformancePackComplianceLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConformancePackComplianceResponse {
        var ConformancePackName: ConformancePackName
        var ConformancePackRuleComplianceList: ConformancePackRuleComplianceList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConformancePackStatusRequest {
        var ConformancePackNames: ConformancePackNamesList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PageSizeLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConformancePackStatusResponse {
        var ConformancePackStatusDetails: ConformancePackStatusDetailsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConformancePacksRequest {
        var ConformancePackNames: ConformancePackNamesList?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PageSizeLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConformancePacksResponse {
        var ConformancePackDetails: ConformancePackDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDeliveryChannelStatusRequest {
        var DeliveryChannelNames: DeliveryChannelNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDeliveryChannelStatusResponse {
        var DeliveryChannelsStatus: DeliveryChannelStatusList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDeliveryChannelsRequest {
        var DeliveryChannelNames: DeliveryChannelNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDeliveryChannelsResponse {
        var DeliveryChannels: DeliveryChannelList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationConfigRuleStatusesRequest {
        var OrganizationConfigRuleNames: OrganizationConfigRuleNames?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: CosmosPageLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationConfigRuleStatusesResponse {
        var OrganizationConfigRuleStatuses: OrganizationConfigRuleStatuses?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationConfigRulesRequest {
        var OrganizationConfigRuleNames: OrganizationConfigRuleNames?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: CosmosPageLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationConfigRulesResponse {
        var OrganizationConfigRules: OrganizationConfigRules?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationConformancePackStatusesRequest {
        var OrganizationConformancePackNames: OrganizationConformancePackNames?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: CosmosPageLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationConformancePackStatusesResponse {
        var OrganizationConformancePackStatuses: OrganizationConformancePackStatuses?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationConformancePacksRequest {
        var OrganizationConformancePackNames: OrganizationConformancePackNames?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: CosmosPageLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeOrganizationConformancePacksResponse {
        var OrganizationConformancePacks: OrganizationConformancePacks?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePendingAggregationRequestsRequest {
        var Limit: DescribePendingAggregationRequestsLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePendingAggregationRequestsResponse {
        var PendingAggregationRequests: PendingAggregationRequestList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRemediationConfigurationsRequest {
        var ConfigRuleNames: ConfigRuleNames
    }
    interface DescribeRemediationConfigurationsResponse {
        var RemediationConfigurations: RemediationConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRemediationExceptionsRequest {
        var ConfigRuleName: ConfigRuleName
        var ResourceKeys: RemediationExceptionResourceKeys?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRemediationExceptionsResponse {
        var RemediationExceptions: RemediationExceptions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRemediationExecutionStatusRequest {
        var ConfigRuleName: ConfigRuleName
        var ResourceKeys: ResourceKeys?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRemediationExecutionStatusResponse {
        var RemediationExecutionStatuses: RemediationExecutionStatuses?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRetentionConfigurationsRequest {
        var RetentionConfigurationNames: RetentionConfigurationNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRetentionConfigurationsResponse {
        var RetentionConfigurations: RetentionConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Evaluation {
        var ComplianceResourceType: StringWithCharLimit256
        var ComplianceResourceId: BaseResourceId
        var ComplianceType: String /* "COMPLIANT" | "NON_COMPLIANT" | "NOT_APPLICABLE" | "INSUFFICIENT_DATA" | String */
        var Annotation: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var OrderingTimestamp: OrderingTimestamp
    }
    interface EvaluationResult {
        var EvaluationResultIdentifier: EvaluationResultIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceType: String /* "COMPLIANT" | "NON_COMPLIANT" | "NOT_APPLICABLE" | "INSUFFICIENT_DATA" | String */
        var ResultRecordedTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigRuleInvokedTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var Annotation: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var ResultToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EvaluationResultIdentifier {
        var EvaluationResultQualifier: EvaluationResultQualifier?
            get() = definedExternally
            set(value) = definedExternally
        var OrderingTimestamp: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EvaluationResultQualifier {
        var ConfigRuleName: ConfigRuleName?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: BaseResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionControls {
        var SsmControls: SsmControls?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailedDeleteRemediationExceptionsBatch {
        var FailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailedItems: RemediationExceptionResourceKeys?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailedRemediationBatch {
        var FailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailedItems: RemediationConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailedRemediationExceptionBatch {
        var FailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailedItems: RemediationExceptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FieldInfo {
        var Name: FieldName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAggregateComplianceDetailsByConfigRuleRequest {
        var ConfigurationAggregatorName: ConfigurationAggregatorName
        var ConfigRuleName: ConfigRuleName
        var AccountId: AccountId
        var AwsRegion: AwsRegion
        var ComplianceType: String /* "COMPLIANT" | "NON_COMPLIANT" | "NOT_APPLICABLE" | "INSUFFICIENT_DATA" | String */
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAggregateComplianceDetailsByConfigRuleResponse {
        var AggregateEvaluationResults: AggregateEvaluationResultList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAggregateConfigRuleComplianceSummaryRequest {
        var ConfigurationAggregatorName: ConfigurationAggregatorName
        var Filters: ConfigRuleComplianceSummaryFilters?
            get() = definedExternally
            set(value) = definedExternally
        var GroupByKey: String /* "ACCOUNT_ID" | "AWS_REGION" | String */
        var Limit: GroupByAPILimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAggregateConfigRuleComplianceSummaryResponse {
        var GroupByKey: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var AggregateComplianceCounts: AggregateComplianceCountList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAggregateDiscoveredResourceCountsRequest {
        var ConfigurationAggregatorName: ConfigurationAggregatorName
        var Filters: ResourceCountFilters?
            get() = definedExternally
            set(value) = definedExternally
        var GroupByKey: String /* "RESOURCE_TYPE" | "ACCOUNT_ID" | "AWS_REGION" | String */
        var Limit: GroupByAPILimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAggregateDiscoveredResourceCountsResponse {
        var TotalDiscoveredResources: Long
        var GroupByKey: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var GroupedResourceCounts: GroupedResourceCountList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAggregateResourceConfigRequest {
        var ConfigurationAggregatorName: ConfigurationAggregatorName
        var ResourceIdentifier: AggregateResourceIdentifier
    }
    interface GetAggregateResourceConfigResponse {
        var ConfigurationItem: ConfigurationItem?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComplianceDetailsByConfigRuleRequest {
        var ConfigRuleName: StringWithCharLimit64
        var ComplianceTypes: ComplianceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComplianceDetailsByConfigRuleResponse {
        var EvaluationResults: EvaluationResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComplianceDetailsByResourceRequest {
        var ResourceType: StringWithCharLimit256
        var ResourceId: BaseResourceId
        var ComplianceTypes: ComplianceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComplianceDetailsByResourceResponse {
        var EvaluationResults: EvaluationResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComplianceSummaryByConfigRuleResponse {
        var ComplianceSummary: ComplianceSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComplianceSummaryByResourceTypeRequest {
        var ResourceTypes: ResourceTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetComplianceSummaryByResourceTypeResponse {
        var ComplianceSummariesByResourceType: ComplianceSummariesByResourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConformancePackComplianceDetailsRequest {
        var ConformancePackName: ConformancePackName
        var Filters: ConformancePackEvaluationFilters?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: GetConformancePackComplianceDetailsLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConformancePackComplianceDetailsResponse {
        var ConformancePackName: ConformancePackName
        var ConformancePackRuleEvaluationResults: ConformancePackRuleEvaluationResultsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConformancePackComplianceSummaryRequest {
        var ConformancePackNames: ConformancePackNamesToSummarizeList
        var Limit: PageSizeLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConformancePackComplianceSummaryResponse {
        var ConformancePackComplianceSummaryList: ConformancePackComplianceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDiscoveredResourceCountsRequest {
        var resourceTypes: ResourceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDiscoveredResourceCountsResponse {
        var totalDiscoveredResources: Long?
            get() = definedExternally
            set(value) = definedExternally
        var resourceCounts: ResourceCounts?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOrganizationConfigRuleDetailedStatusRequest {
        var OrganizationConfigRuleName: OrganizationConfigRuleName
        var Filters: StatusDetailFilters?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: CosmosPageLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOrganizationConfigRuleDetailedStatusResponse {
        var OrganizationConfigRuleDetailedStatus: OrganizationConfigRuleDetailedStatus?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOrganizationConformancePackDetailedStatusRequest {
        var OrganizationConformancePackName: OrganizationConformancePackName
        var Filters: OrganizationResourceDetailedStatusFilters?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: CosmosPageLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOrganizationConformancePackDetailedStatusResponse {
        var OrganizationConformancePackDetailedStatuses: OrganizationConformancePackDetailedStatuses?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceConfigHistoryRequest {
        var resourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var resourceId: ResourceId
        var laterTime: LaterTime?
            get() = definedExternally
            set(value) = definedExternally
        var earlierTime: EarlierTime?
            get() = definedExternally
            set(value) = definedExternally
        var chronologicalOrder: String /* "Reverse" | "Forward" | String */
        var limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourceConfigHistoryResponse {
        var configurationItems: ConfigurationItemList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GroupedResourceCount {
        var GroupName: StringWithCharLimit256
        var ResourceCount: Long
    }
    interface ListAggregateDiscoveredResourcesRequest {
        var ConfigurationAggregatorName: ConfigurationAggregatorName
        var ResourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var Filters: ResourceFilters?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAggregateDiscoveredResourcesResponse {
        var ResourceIdentifiers: DiscoveredResourceIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDiscoveredResourcesRequest {
        var resourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var resourceIds: ResourceIdList?
            get() = definedExternally
            set(value) = definedExternally
        var resourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var includeDeletedResources: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDiscoveredResourcesResponse {
        var resourceIdentifiers: ResourceIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: AmazonResourceName
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberAccountStatus {
        var AccountId: AccountId
        var ConfigRuleName: StringWithCharLimit64
        var MemberAccountRuleStatus: String /* "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | String */
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationAggregationSource {
        var RoleArn: String
        var AwsRegions: AggregatorRegionList?
            get() = definedExternally
            set(value) = definedExternally
        var AllAwsRegions: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationConfigRule {
        var OrganizationConfigRuleName: OrganizationConfigRuleName
        var OrganizationConfigRuleArn: StringWithCharLimit256
        var OrganizationManagedRuleMetadata: OrganizationManagedRuleMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationCustomRuleMetadata: OrganizationCustomRuleMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludedAccounts: ExcludedAccounts?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationConfigRuleStatus {
        var OrganizationConfigRuleName: OrganizationConfigRuleName
        var OrganizationRuleStatus: String /* "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | String */
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationConformancePack {
        var OrganizationConformancePackName: OrganizationConformancePackName
        var OrganizationConformancePackArn: StringWithCharLimit256
        var DeliveryS3Bucket: DeliveryS3Bucket
        var DeliveryS3KeyPrefix: DeliveryS3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var ConformancePackInputParameters: ConformancePackInputParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludedAccounts: ExcludedAccounts?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTime: _Date
    }
    interface OrganizationConformancePackDetailedStatus {
        var AccountId: AccountId
        var ConformancePackName: StringWithCharLimit256
        var Status: String /* "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | String */
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationConformancePackStatus {
        var OrganizationConformancePackName: OrganizationConformancePackName
        var Status: String /* "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | String */
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationCustomRuleMetadata {
        var Description: StringWithCharLimit256Min0?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaFunctionArn: StringWithCharLimit256
        var OrganizationConfigRuleTriggerTypes: OrganizationConfigRuleTriggerTypes
        var InputParameters: StringWithCharLimit2048?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumExecutionFrequency: String /* "One_Hour" | "Three_Hours" | "Six_Hours" | "Twelve_Hours" | "TwentyFour_Hours" | String */
        var ResourceTypesScope: ResourceTypesScope?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceIdScope: StringWithCharLimit768?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeyScope: StringWithCharLimit128?
            get() = definedExternally
            set(value) = definedExternally
        var TagValueScope: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationManagedRuleMetadata {
        var Description: StringWithCharLimit256Min0?
            get() = definedExternally
            set(value) = definedExternally
        var RuleIdentifier: StringWithCharLimit256
        var InputParameters: StringWithCharLimit2048?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumExecutionFrequency: String /* "One_Hour" | "Three_Hours" | "Six_Hours" | "Twelve_Hours" | "TwentyFour_Hours" | String */
        var ResourceTypesScope: ResourceTypesScope?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceIdScope: StringWithCharLimit768?
            get() = definedExternally
            set(value) = definedExternally
        var TagKeyScope: StringWithCharLimit128?
            get() = definedExternally
            set(value) = definedExternally
        var TagValueScope: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationResourceDetailedStatusFilters {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | String */
    }
    interface PendingAggregationRequest {
        var RequesterAccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterAwsRegion: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAggregationAuthorizationRequest {
        var AuthorizedAccountId: AccountId
        var AuthorizedAwsRegion: AwsRegion
        var Tags: TagsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAggregationAuthorizationResponse {
        var AggregationAuthorization: AggregationAuthorization?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConfigRuleRequest {
        var ConfigRule: ConfigRule
        var Tags: TagsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConfigurationAggregatorRequest {
        var ConfigurationAggregatorName: ConfigurationAggregatorName
        var AccountAggregationSources: AccountAggregationSourceList?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationAggregationSource: OrganizationAggregationSource?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConfigurationAggregatorResponse {
        var ConfigurationAggregator: ConfigurationAggregator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConfigurationRecorderRequest {
        var ConfigurationRecorder: ConfigurationRecorder
    }
    interface PutConformancePackRequest {
        var ConformancePackName: ConformancePackName
        var TemplateS3Uri: TemplateS3Uri?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryS3Bucket: DeliveryS3Bucket
        var DeliveryS3KeyPrefix: DeliveryS3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var ConformancePackInputParameters: ConformancePackInputParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConformancePackResponse {
        var ConformancePackArn: ConformancePackArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutDeliveryChannelRequest {
        var DeliveryChannel: DeliveryChannel
    }
    interface PutEvaluationsRequest {
        var Evaluations: Evaluations?
            get() = definedExternally
            set(value) = definedExternally
        var ResultToken: String
        var TestMode: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutEvaluationsResponse {
        var FailedEvaluations: Evaluations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutOrganizationConfigRuleRequest {
        var OrganizationConfigRuleName: OrganizationConfigRuleName
        var OrganizationManagedRuleMetadata: OrganizationManagedRuleMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationCustomRuleMetadata: OrganizationCustomRuleMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludedAccounts: ExcludedAccounts?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutOrganizationConfigRuleResponse {
        var OrganizationConfigRuleArn: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutOrganizationConformancePackRequest {
        var OrganizationConformancePackName: OrganizationConformancePackName
        var TemplateS3Uri: TemplateS3Uri?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryS3Bucket: DeliveryS3Bucket
        var DeliveryS3KeyPrefix: DeliveryS3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var ConformancePackInputParameters: ConformancePackInputParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludedAccounts: ExcludedAccounts?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutOrganizationConformancePackResponse {
        var OrganizationConformancePackArn: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRemediationConfigurationsRequest {
        var RemediationConfigurations: RemediationConfigurations
    }
    interface PutRemediationConfigurationsResponse {
        var FailedBatches: FailedRemediationBatches?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRemediationExceptionsRequest {
        var ConfigRuleName: ConfigRuleName
        var ResourceKeys: RemediationExceptionResourceKeys
        var Message: StringWithCharLimit1024?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRemediationExceptionsResponse {
        var FailedBatches: FailedRemediationExceptionBatches?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutResourceConfigRequest {
        var ResourceType: ResourceTypeString
        var SchemaVersionId: SchemaVersionId
        var ResourceId: ResourceId
        var ResourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Configuration: Configuration
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRetentionConfigurationRequest {
        var RetentionPeriodInDays: RetentionPeriodInDays
    }
    interface PutRetentionConfigurationResponse {
        var RetentionConfiguration: RetentionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryInfo {
        var SelectFields: FieldInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordingGroup {
        var allSupported: AllSupported?
            get() = definedExternally
            set(value) = definedExternally
        var includeGlobalResourceTypes: IncludeGlobalResourceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var resourceTypes: ResourceTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Relationship {
        var resourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var resourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var resourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var relationshipName: RelationshipName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemediationConfiguration {
        var ConfigRuleName: ConfigRuleName
        var TargetType: String /* "SSM_DOCUMENT" | String */
        var TargetId: StringWithCharLimit256
        var TargetVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: RemediationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var Automatic: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionControls: ExecutionControls?
            get() = definedExternally
            set(value) = definedExternally
        var MaximumAutomaticAttempts: AutoRemediationAttempts?
            get() = definedExternally
            set(value) = definedExternally
        var RetryAttemptSeconds: AutoRemediationAttemptSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: StringWithCharLimit1024?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedByService: StringWithCharLimit1024?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemediationException {
        var ConfigRuleName: ConfigRuleName
        var ResourceType: StringWithCharLimit256
        var ResourceId: StringWithCharLimit1024
        var Message: StringWithCharLimit1024?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemediationExceptionResourceKey {
        var ResourceType: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: StringWithCharLimit1024?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemediationExecutionStatus {
        var ResourceKey: ResourceKey?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "QUEUED" | "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | String */
        var StepDetails: RemediationExecutionSteps?
            get() = definedExternally
            set(value) = definedExternally
        var InvocationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemediationExecutionStep {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "SUCCEEDED" | "PENDING" | "FAILED" | String */
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var StopTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemediationParameterValue {
        var ResourceValue: ResourceValue?
            get() = definedExternally
            set(value) = definedExternally
        var StaticValue: StaticValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemediationParameters {
        @nativeGetter
        operator fun get(key: String): RemediationParameterValue?
        @nativeSetter
        operator fun set(key: String, value: RemediationParameterValue)
    }
    interface ResourceCount {
        var resourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var count: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceCountFilters {
        var ResourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var Region: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceFilters {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Region: AwsRegion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceIdentifier {
        var resourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var resourceId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var resourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var resourceDeletionTime: ResourceDeletionTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceKey {
        var resourceType: String /* "AWS::EC2::CustomerGateway" | "AWS::EC2::EIP" | "AWS::EC2::Host" | "AWS::EC2::Instance" | "AWS::EC2::InternetGateway" | "AWS::EC2::NetworkAcl" | "AWS::EC2::NetworkInterface" | "AWS::EC2::RouteTable" | "AWS::EC2::SecurityGroup" | "AWS::EC2::Subnet" | "AWS::CloudTrail::Trail" | "AWS::EC2::Volume" | "AWS::EC2::VPC" | "AWS::EC2::VPNConnection" | "AWS::EC2::VPNGateway" | "AWS::EC2::RegisteredHAInstance" | "AWS::EC2::NatGateway" | "AWS::EC2::EgressOnlyInternetGateway" | "AWS::EC2::VPCEndpoint" | "AWS::EC2::VPCEndpointService" | "AWS::EC2::FlowLog" | "AWS::EC2::VPCPeeringConnection" | "AWS::Elasticsearch::Domain" | "AWS::IAM::Group" | "AWS::IAM::Policy" | "AWS::IAM::Role" | "AWS::IAM::User" | "AWS::ElasticLoadBalancingV2::LoadBalancer" | "AWS::ACM::Certificate" | "AWS::RDS::DBInstance" | "AWS::RDS::DBSubnetGroup" | "AWS::RDS::DBSecurityGroup" | "AWS::RDS::DBSnapshot" | "AWS::RDS::DBCluster" | "AWS::RDS::DBClusterSnapshot" | "AWS::RDS::EventSubscription" | "AWS::S3::Bucket" | "AWS::S3::AccountPublicAccessBlock" | "AWS::Redshift::Cluster" | "AWS::Redshift::ClusterSnapshot" | "AWS::Redshift::ClusterParameterGroup" | "AWS::Redshift::ClusterSecurityGroup" | "AWS::Redshift::ClusterSubnetGroup" | "AWS::Redshift::EventSubscription" | "AWS::SSM::ManagedInstanceInventory" | "AWS::CloudWatch::Alarm" | "AWS::CloudFormation::Stack" | "AWS::ElasticLoadBalancing::LoadBalancer" | "AWS::AutoScaling::AutoScalingGroup" | "AWS::AutoScaling::LaunchConfiguration" | "AWS::AutoScaling::ScalingPolicy" | "AWS::AutoScaling::ScheduledAction" | "AWS::DynamoDB::Table" | "AWS::CodeBuild::Project" | "AWS::WAF::RateBasedRule" | "AWS::WAF::Rule" | "AWS::WAF::RuleGroup" | "AWS::WAF::WebACL" | "AWS::WAFRegional::RateBasedRule" | "AWS::WAFRegional::Rule" | "AWS::WAFRegional::RuleGroup" | "AWS::WAFRegional::WebACL" | "AWS::CloudFront::Distribution" | "AWS::CloudFront::StreamingDistribution" | "AWS::Lambda::Function" | "AWS::ElasticBeanstalk::Application" | "AWS::ElasticBeanstalk::ApplicationVersion" | "AWS::ElasticBeanstalk::Environment" | "AWS::WAFv2::WebACL" | "AWS::WAFv2::RuleGroup" | "AWS::WAFv2::IPSet" | "AWS::WAFv2::RegexPatternSet" | "AWS::WAFv2::ManagedRuleSet" | "AWS::XRay::EncryptionConfig" | "AWS::SSM::AssociationCompliance" | "AWS::SSM::PatchCompliance" | "AWS::Shield::Protection" | "AWS::ShieldRegional::Protection" | "AWS::Config::ResourceCompliance" | "AWS::ApiGateway::Stage" | "AWS::ApiGateway::RestApi" | "AWS::ApiGatewayV2::Stage" | "AWS::ApiGatewayV2::Api" | "AWS::CodePipeline::Pipeline" | "AWS::ServiceCatalog::CloudFormationProvisionedProduct" | "AWS::ServiceCatalog::CloudFormationProduct" | "AWS::ServiceCatalog::Portfolio" | "AWS::SQS::Queue" | "AWS::KMS::Key" | "AWS::QLDB::Ledger" | String */
        var resourceId: ResourceId
    }
    interface ResourceValue {
        var Value: String /* "RESOURCE_ID" | String */
    }
    interface RetentionConfiguration {
        var Name: RetentionConfigurationName
        var RetentionPeriodInDays: RetentionPeriodInDays
    }
    interface Scope {
        var ComplianceResourceTypes: ComplianceResourceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var TagKey: StringWithCharLimit128?
            get() = definedExternally
            set(value) = definedExternally
        var TagValue: StringWithCharLimit256?
            get() = definedExternally
            set(value) = definedExternally
        var ComplianceResourceId: BaseResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SelectAggregateResourceConfigRequest {
        var Expression: Expression
        var ConfigurationAggregatorName: ConfigurationAggregatorName
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SelectAggregateResourceConfigResponse {
        var Results: Results?
            get() = definedExternally
            set(value) = definedExternally
        var QueryInfo: QueryInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SelectResourceConfigRequest {
        var Expression: Expression
        var Limit: Limit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SelectResourceConfigResponse {
        var Results: Results?
            get() = definedExternally
            set(value) = definedExternally
        var QueryInfo: QueryInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Source {
        var Owner: String /* "CUSTOM_LAMBDA" | "AWS" | String */
        var SourceIdentifier: StringWithCharLimit256
        var SourceDetails: SourceDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceDetail {
        var EventSource: String /* "aws.config" | String */
        var MessageType: String /* "ConfigurationItemChangeNotification" | "ConfigurationSnapshotDeliveryCompleted" | "ScheduledNotification" | "OversizedConfigurationItemChangeNotification" | String */
        var MaximumExecutionFrequency: String /* "One_Hour" | "Three_Hours" | "Six_Hours" | "Twelve_Hours" | "TwentyFour_Hours" | String */
    }
    interface SsmControls {
        var ConcurrentExecutionRatePercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartConfigRulesEvaluationRequest {
        var ConfigRuleNames: ReevaluateConfigRuleNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartConfigRulesEvaluationResponse
    interface StartConfigurationRecorderRequest {
        var ConfigurationRecorderName: RecorderName
    }
    interface StartRemediationExecutionRequest {
        var ConfigRuleName: ConfigRuleName
        var ResourceKeys: ResourceKeys
    }
    interface StartRemediationExecutionResponse {
        var FailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailedItems: ResourceKeys?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StaticValue {
        var Values: StaticParameterValues
    }
    interface StatusDetailFilters {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var MemberAccountRuleStatus: String /* "CREATE_SUCCESSFUL" | "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "DELETE_SUCCESSFUL" | "DELETE_FAILED" | "DELETE_IN_PROGRESS" | "UPDATE_SUCCESSFUL" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | String */
    }
    interface StopConfigurationRecorderRequest {
        var ConfigurationRecorderName: RecorderName
    }
    interface SupplementaryConfiguration {
        @nativeGetter
        operator fun get(key: String): SupplementaryConfigurationValue?
        @nativeSetter
        operator fun set(key: String, value: SupplementaryConfigurationValue)
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
        var ResourceArn: AmazonResourceName
        var Tags: TagList
    }
    interface Tags {
        @nativeGetter
        operator fun get(key: String): Value?
        @nativeSetter
        operator fun set(key: String, value: Value)
    }
    interface UntagResourceRequest {
        var ResourceArn: AmazonResourceName
        var TagKeys: TagKeyList
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-11-12" | "latest" | String */
    }
}