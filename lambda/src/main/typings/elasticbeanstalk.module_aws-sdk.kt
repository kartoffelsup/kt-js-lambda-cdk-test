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
import ElasticBeanstalk.ApplicationDescription
import ElasticBeanstalk.ApplicationVersionDescription
import ElasticBeanstalk.AutoScalingGroup
import ElasticBeanstalk.SolutionStackDescription
import ElasticBeanstalk.ConfigurationOptionDescription
import ElasticBeanstalk.ConfigurationOptionSetting
import ElasticBeanstalk.ConfigurationSettingsDescription
import ElasticBeanstalk.CustomAmi
import ElasticBeanstalk.EnvironmentDescription
import ElasticBeanstalk.EnvironmentInfoDescription
import ElasticBeanstalk.EnvironmentLink
import ElasticBeanstalk.EventDescription
import ElasticBeanstalk.SingleInstanceHealth
import ElasticBeanstalk.Instance
import ElasticBeanstalk.LaunchConfiguration
import ElasticBeanstalk.LaunchTemplate
import ElasticBeanstalk.LoadBalancer
import ElasticBeanstalk.Listener
import ElasticBeanstalk.ManagedActionHistoryItem
import ElasticBeanstalk.ManagedAction
import ElasticBeanstalk.OptionSpecification
import ElasticBeanstalk.PlatformFilter
import ElasticBeanstalk.PlatformFramework
import ElasticBeanstalk.PlatformProgrammingLanguage
import ElasticBeanstalk.PlatformSummary
import ElasticBeanstalk.Queue
import ElasticBeanstalk.Tag
import ElasticBeanstalk.Trigger
import ElasticBeanstalk.ValidationMessage
import ElasticBeanstalk.AbortEnvironmentUpdateMessage
import ElasticBeanstalk.ApplyEnvironmentManagedActionRequest
import ElasticBeanstalk.ApplyEnvironmentManagedActionResult
import ElasticBeanstalk.CheckDNSAvailabilityMessage
import ElasticBeanstalk.CheckDNSAvailabilityResultMessage
import ElasticBeanstalk.ComposeEnvironmentsMessage
import ElasticBeanstalk.EnvironmentDescriptionsMessage
import ElasticBeanstalk.CreateApplicationMessage
import ElasticBeanstalk.ApplicationDescriptionMessage
import ElasticBeanstalk.CreateApplicationVersionMessage
import ElasticBeanstalk.ApplicationVersionDescriptionMessage
import ElasticBeanstalk.CreateConfigurationTemplateMessage
import ElasticBeanstalk.CreateEnvironmentMessage
import ElasticBeanstalk.CreatePlatformVersionRequest
import ElasticBeanstalk.CreatePlatformVersionResult
import ElasticBeanstalk.CreateStorageLocationResultMessage
import ElasticBeanstalk.DeleteApplicationMessage
import ElasticBeanstalk.DeleteApplicationVersionMessage
import ElasticBeanstalk.DeleteConfigurationTemplateMessage
import ElasticBeanstalk.DeleteEnvironmentConfigurationMessage
import ElasticBeanstalk.DeletePlatformVersionRequest
import ElasticBeanstalk.DeletePlatformVersionResult
import ElasticBeanstalk.DescribeAccountAttributesResult
import ElasticBeanstalk.DescribeApplicationVersionsMessage
import ElasticBeanstalk.ApplicationVersionDescriptionsMessage
import ElasticBeanstalk.DescribeApplicationsMessage
import ElasticBeanstalk.ApplicationDescriptionsMessage
import ElasticBeanstalk.DescribeConfigurationOptionsMessage
import ElasticBeanstalk.ConfigurationOptionsDescription
import ElasticBeanstalk.DescribeConfigurationSettingsMessage
import ElasticBeanstalk.ConfigurationSettingsDescriptions
import ElasticBeanstalk.DescribeEnvironmentHealthRequest
import ElasticBeanstalk.DescribeEnvironmentHealthResult
import ElasticBeanstalk.DescribeEnvironmentManagedActionHistoryRequest
import ElasticBeanstalk.DescribeEnvironmentManagedActionHistoryResult
import ElasticBeanstalk.DescribeEnvironmentManagedActionsRequest
import ElasticBeanstalk.DescribeEnvironmentManagedActionsResult
import ElasticBeanstalk.DescribeEnvironmentResourcesMessage
import ElasticBeanstalk.EnvironmentResourceDescriptionsMessage
import ElasticBeanstalk.DescribeEnvironmentsMessage
import ElasticBeanstalk.DescribeEventsMessage
import ElasticBeanstalk.EventDescriptionsMessage
import ElasticBeanstalk.DescribeInstancesHealthRequest
import ElasticBeanstalk.DescribeInstancesHealthResult
import ElasticBeanstalk.DescribePlatformVersionRequest
import ElasticBeanstalk.DescribePlatformVersionResult
import ElasticBeanstalk.ListAvailableSolutionStacksResultMessage
import ElasticBeanstalk.ListPlatformVersionsRequest
import ElasticBeanstalk.ListPlatformVersionsResult
import ElasticBeanstalk.ListTagsForResourceMessage
import ElasticBeanstalk.ResourceTagsDescriptionMessage
import ElasticBeanstalk.RebuildEnvironmentMessage
import ElasticBeanstalk.RequestEnvironmentInfoMessage
import ElasticBeanstalk.RestartAppServerMessage
import ElasticBeanstalk.RetrieveEnvironmentInfoMessage
import ElasticBeanstalk.RetrieveEnvironmentInfoResultMessage
import ElasticBeanstalk.SwapEnvironmentCNAMEsMessage
import ElasticBeanstalk.TerminateEnvironmentMessage
import ElasticBeanstalk.UpdateApplicationMessage
import ElasticBeanstalk.UpdateApplicationResourceLifecycleMessage
import ElasticBeanstalk.ApplicationResourceLifecycleDescriptionMessage
import ElasticBeanstalk.UpdateApplicationVersionMessage
import ElasticBeanstalk.UpdateConfigurationTemplateMessage
import ElasticBeanstalk.UpdateEnvironmentMessage
import ElasticBeanstalk.UpdateTagsForResourceMessage
import ElasticBeanstalk.ValidateConfigurationSettingsMessage
import ElasticBeanstalk.ConfigurationSettingsValidationMessages
import ElasticBeanstalk.ApplicationResourceLifecycleConfig
import ElasticBeanstalk.StatusCodes
import ElasticBeanstalk.Latency
import ElasticBeanstalk.ApplicationVersionLifecycleConfig
import ElasticBeanstalk.SourceBuildInformation
import ElasticBeanstalk.S3Location
import ElasticBeanstalk.MaxCountRule
import ElasticBeanstalk.MaxAgeRule
import ElasticBeanstalk.OptionRestrictionRegex
import ElasticBeanstalk.BuildConfiguration
import ElasticBeanstalk.SourceConfiguration
import ElasticBeanstalk.EnvironmentTier
import ElasticBeanstalk.Builder
import ElasticBeanstalk.ResourceQuotas
import ElasticBeanstalk.ApplicationMetrics
import ElasticBeanstalk.InstanceHealthSummary
import ElasticBeanstalk.PlatformDescription
import ElasticBeanstalk.EnvironmentResourcesDescription
import ElasticBeanstalk.EnvironmentResourceDescription
import ElasticBeanstalk.LoadBalancerDescription
import ElasticBeanstalk.ResourceQuota
import ElasticBeanstalk.SystemStatus
import ElasticBeanstalk.Deployment
import ElasticBeanstalk.CPUUtilization

typealias ARN = String

typealias AbortableOperationInProgress = Boolean

typealias ApplicationArn = String

typealias ApplicationDescriptionList = Array<ApplicationDescription>

typealias ApplicationName = String

typealias ApplicationNamesList = Array<ApplicationName>

typealias ApplicationVersionArn = String

typealias ApplicationVersionDescriptionList = Array<ApplicationVersionDescription>

typealias ApplicationVersionProccess = Boolean

typealias AutoCreateApplication = Boolean

typealias AutoScalingGroupList = Array<AutoScalingGroup>

typealias AvailableSolutionStackDetailsList = Array<SolutionStackDescription>

typealias AvailableSolutionStackNamesList = Array<SolutionStackName>

typealias BoxedBoolean = Boolean

typealias BoxedInt = Number

typealias Cause = String

typealias Causes = Array<Cause>

typealias CnameAvailability = Boolean

typealias ConfigurationOptionDefaultValue = String

typealias ConfigurationOptionDescriptionsList = Array<ConfigurationOptionDescription>

typealias ConfigurationOptionName = String

typealias ConfigurationOptionPossibleValue = String

typealias ConfigurationOptionPossibleValues = Array<ConfigurationOptionPossibleValue>

typealias ConfigurationOptionSettingsList = Array<ConfigurationOptionSetting>

typealias ConfigurationOptionSeverity = String

typealias ConfigurationOptionValue = String

typealias ConfigurationSettingsDescriptionList = Array<ConfigurationSettingsDescription>

typealias ConfigurationTemplateName = String

typealias ConfigurationTemplateNamesList = Array<ConfigurationTemplateName>

typealias CreationDate = Date

typealias CustomAmiList = Array<CustomAmi>

typealias DNSCname = String

typealias DNSCnamePrefix = String

typealias DeleteSourceBundle = Boolean

typealias DeploymentTimestamp = Date

typealias Description = String

typealias Ec2InstanceId = String

typealias EndpointURL = String

typealias EnvironmentArn = String

typealias EnvironmentDescriptionsList = Array<EnvironmentDescription>

typealias EnvironmentHealthAttributes = Array<String /* "Status" | "Color" | "Causes" | "ApplicationMetrics" | "InstancesHealth" | "All" | "HealthStatus" | "RefreshedAt" | String */>

typealias EnvironmentId = String

typealias EnvironmentIdList = Array<EnvironmentId>

typealias EnvironmentInfoDescriptionList = Array<EnvironmentInfoDescription>

typealias EnvironmentLinks = Array<EnvironmentLink>

typealias EnvironmentName = String

typealias EnvironmentNamesList = Array<EnvironmentName>

typealias EventDate = Date

typealias EventDescriptionList = Array<EventDescription>

typealias EventMessage = String

typealias FileTypeExtension = String

typealias ForceTerminate = Boolean

typealias GroupName = String

typealias ImageId = String

typealias IncludeDeleted = Boolean

typealias IncludeDeletedBackTo = Date

typealias InstanceHealthList = Array<SingleInstanceHealth>

typealias InstanceId = String

typealias InstanceList = Array<Instance>

typealias InstancesHealthAttributes = Array<String /* "HealthStatus" | "Color" | "Causes" | "ApplicationMetrics" | "RefreshedAt" | "LaunchedAt" | "System" | "Deployment" | "AvailabilityZone" | "InstanceType" | "All" | String */>

typealias Integer = Number

typealias LaunchConfigurationList = Array<LaunchConfiguration>

typealias LaunchTemplateList = Array<LaunchTemplate>

typealias LaunchedAt = Date

typealias LoadAverage = Array<LoadAverageValue>

typealias LoadAverageValue = Number

typealias LoadBalancerList = Array<LoadBalancer>

typealias LoadBalancerListenersDescription = Array<Listener>

typealias Maintainer = String

typealias ManagedActionHistoryItems = Array<ManagedActionHistoryItem>

typealias ManagedActions = Array<ManagedAction>

typealias MaxRecords = Number

typealias Message = String

typealias NextToken = String

typealias NonEmptyString = String

typealias NullableDouble = Number

typealias NullableInteger = Number

typealias NullableLong = Number

typealias OperatingSystemName = String

typealias OperatingSystemVersion = String

typealias OptionNamespace = String

typealias OptionRestrictionMaxLength = Number

typealias OptionRestrictionMaxValue = Number

typealias OptionRestrictionMinValue = Number

typealias OptionsSpecifierList = Array<OptionSpecification>

typealias PlatformArn = String

typealias PlatformCategory = String

typealias PlatformFilterOperator = String

typealias PlatformFilterType = String

typealias PlatformFilterValue = String

typealias PlatformFilterValueList = Array<PlatformFilterValue>

typealias PlatformFilters = Array<PlatformFilter>

typealias PlatformFrameworks = Array<PlatformFramework>

typealias PlatformMaxRecords = Number

typealias PlatformName = String

typealias PlatformOwner = String

typealias PlatformProgrammingLanguages = Array<PlatformProgrammingLanguage>

typealias PlatformSummaryList = Array<PlatformSummary>

typealias PlatformVersion = String

typealias QueueList = Array<Queue>

typealias RefreshedAt = Date

typealias RegexLabel = String

typealias RegexPattern = String

typealias RequestCount = Number

typealias RequestId = String

typealias ResourceArn = String

typealias ResourceId = String

typealias ResourceName = String

typealias S3Bucket = String

typealias S3Key = String

typealias SampleTimestamp = Date

typealias SolutionStackFileTypeList = Array<FileTypeExtension>

typealias SolutionStackName = String

typealias SourceLocation = String

typealias String = String

typealias SupportedAddon = String

typealias SupportedAddonList = Array<SupportedAddon>

typealias SupportedTier = String

typealias SupportedTierList = Array<SupportedTier>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TerminateEnvForce = Boolean

typealias TerminateEnvironmentResources = Boolean

typealias TimeFilterEnd = Date

typealias TimeFilterStart = Date

typealias Timestamp = Date

typealias Token = String

typealias TriggerList = Array<Trigger>

typealias UpdateDate = Date

typealias UserDefinedOption = Boolean

typealias ValidationMessageString = String

typealias ValidationMessagesList = Array<ValidationMessage>

typealias VersionLabel = String

typealias VersionLabels = Array<VersionLabel>

typealias VersionLabelsList = Array<VersionLabel>

typealias VirtualizationType = String

@JsModule("aws-sdk")
external open class ElasticBeanstalk(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ElasticBeanstalk.Types.ClientConfiguration */
    open fun abortEnvironmentUpdate(params: AbortEnvironmentUpdateMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun abortEnvironmentUpdate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun applyEnvironmentManagedAction(params: ApplyEnvironmentManagedActionRequest, callback: (err: AWSError, data: ApplyEnvironmentManagedActionResult) -> Unit = definedExternally): Request<ApplyEnvironmentManagedActionResult, AWSError>
    open fun applyEnvironmentManagedAction(callback: (err: AWSError, data: ApplyEnvironmentManagedActionResult) -> Unit = definedExternally): Request<ApplyEnvironmentManagedActionResult, AWSError>
    open fun checkDNSAvailability(params: CheckDNSAvailabilityMessage, callback: (err: AWSError, data: CheckDNSAvailabilityResultMessage) -> Unit = definedExternally): Request<CheckDNSAvailabilityResultMessage, AWSError>
    open fun checkDNSAvailability(callback: (err: AWSError, data: CheckDNSAvailabilityResultMessage) -> Unit = definedExternally): Request<CheckDNSAvailabilityResultMessage, AWSError>
    open fun composeEnvironments(params: ComposeEnvironmentsMessage, callback: (err: AWSError, data: EnvironmentDescriptionsMessage) -> Unit = definedExternally): Request<EnvironmentDescriptionsMessage, AWSError>
    open fun composeEnvironments(callback: (err: AWSError, data: EnvironmentDescriptionsMessage) -> Unit = definedExternally): Request<EnvironmentDescriptionsMessage, AWSError>
    open fun createApplication(params: CreateApplicationMessage, callback: (err: AWSError, data: ApplicationDescriptionMessage) -> Unit = definedExternally): Request<ApplicationDescriptionMessage, AWSError>
    open fun createApplication(callback: (err: AWSError, data: ApplicationDescriptionMessage) -> Unit = definedExternally): Request<ApplicationDescriptionMessage, AWSError>
    open fun createApplicationVersion(params: CreateApplicationVersionMessage, callback: (err: AWSError, data: ApplicationVersionDescriptionMessage) -> Unit = definedExternally): Request<ApplicationVersionDescriptionMessage, AWSError>
    open fun createApplicationVersion(callback: (err: AWSError, data: ApplicationVersionDescriptionMessage) -> Unit = definedExternally): Request<ApplicationVersionDescriptionMessage, AWSError>
    open fun createConfigurationTemplate(params: CreateConfigurationTemplateMessage, callback: (err: AWSError, data: ConfigurationSettingsDescription) -> Unit = definedExternally): Request<ConfigurationSettingsDescription, AWSError>
    open fun createConfigurationTemplate(callback: (err: AWSError, data: ConfigurationSettingsDescription) -> Unit = definedExternally): Request<ConfigurationSettingsDescription, AWSError>
    open fun createEnvironment(params: CreateEnvironmentMessage, callback: (err: AWSError, data: EnvironmentDescription) -> Unit = definedExternally): Request<EnvironmentDescription, AWSError>
    open fun createEnvironment(callback: (err: AWSError, data: EnvironmentDescription) -> Unit = definedExternally): Request<EnvironmentDescription, AWSError>
    open fun createPlatformVersion(params: CreatePlatformVersionRequest, callback: (err: AWSError, data: CreatePlatformVersionResult) -> Unit = definedExternally): Request<CreatePlatformVersionResult, AWSError>
    open fun createPlatformVersion(callback: (err: AWSError, data: CreatePlatformVersionResult) -> Unit = definedExternally): Request<CreatePlatformVersionResult, AWSError>
    open fun createStorageLocation(callback: (err: AWSError, data: CreateStorageLocationResultMessage) -> Unit = definedExternally): Request<CreateStorageLocationResultMessage, AWSError>
    open fun deleteApplication(params: DeleteApplicationMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApplication(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApplicationVersion(params: DeleteApplicationVersionMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApplicationVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConfigurationTemplate(params: DeleteConfigurationTemplateMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteConfigurationTemplate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEnvironmentConfiguration(params: DeleteEnvironmentConfigurationMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEnvironmentConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePlatformVersion(params: DeletePlatformVersionRequest, callback: (err: AWSError, data: DeletePlatformVersionResult) -> Unit = definedExternally): Request<DeletePlatformVersionResult, AWSError>
    open fun deletePlatformVersion(callback: (err: AWSError, data: DeletePlatformVersionResult) -> Unit = definedExternally): Request<DeletePlatformVersionResult, AWSError>
    open fun describeAccountAttributes(callback: (err: AWSError, data: DescribeAccountAttributesResult) -> Unit = definedExternally): Request<DescribeAccountAttributesResult, AWSError>
    open fun describeApplicationVersions(params: DescribeApplicationVersionsMessage, callback: (err: AWSError, data: ApplicationVersionDescriptionsMessage) -> Unit = definedExternally): Request<ApplicationVersionDescriptionsMessage, AWSError>
    open fun describeApplicationVersions(callback: (err: AWSError, data: ApplicationVersionDescriptionsMessage) -> Unit = definedExternally): Request<ApplicationVersionDescriptionsMessage, AWSError>
    open fun describeApplications(params: DescribeApplicationsMessage, callback: (err: AWSError, data: ApplicationDescriptionsMessage) -> Unit = definedExternally): Request<ApplicationDescriptionsMessage, AWSError>
    open fun describeApplications(callback: (err: AWSError, data: ApplicationDescriptionsMessage) -> Unit = definedExternally): Request<ApplicationDescriptionsMessage, AWSError>
    open fun describeConfigurationOptions(params: DescribeConfigurationOptionsMessage, callback: (err: AWSError, data: ConfigurationOptionsDescription) -> Unit = definedExternally): Request<ConfigurationOptionsDescription, AWSError>
    open fun describeConfigurationOptions(callback: (err: AWSError, data: ConfigurationOptionsDescription) -> Unit = definedExternally): Request<ConfigurationOptionsDescription, AWSError>
    open fun describeConfigurationSettings(params: DescribeConfigurationSettingsMessage, callback: (err: AWSError, data: ConfigurationSettingsDescriptions) -> Unit = definedExternally): Request<ConfigurationSettingsDescriptions, AWSError>
    open fun describeConfigurationSettings(callback: (err: AWSError, data: ConfigurationSettingsDescriptions) -> Unit = definedExternally): Request<ConfigurationSettingsDescriptions, AWSError>
    open fun describeEnvironmentHealth(params: DescribeEnvironmentHealthRequest, callback: (err: AWSError, data: DescribeEnvironmentHealthResult) -> Unit = definedExternally): Request<DescribeEnvironmentHealthResult, AWSError>
    open fun describeEnvironmentHealth(callback: (err: AWSError, data: DescribeEnvironmentHealthResult) -> Unit = definedExternally): Request<DescribeEnvironmentHealthResult, AWSError>
    open fun describeEnvironmentManagedActionHistory(params: DescribeEnvironmentManagedActionHistoryRequest, callback: (err: AWSError, data: DescribeEnvironmentManagedActionHistoryResult) -> Unit = definedExternally): Request<DescribeEnvironmentManagedActionHistoryResult, AWSError>
    open fun describeEnvironmentManagedActionHistory(callback: (err: AWSError, data: DescribeEnvironmentManagedActionHistoryResult) -> Unit = definedExternally): Request<DescribeEnvironmentManagedActionHistoryResult, AWSError>
    open fun describeEnvironmentManagedActions(params: DescribeEnvironmentManagedActionsRequest, callback: (err: AWSError, data: DescribeEnvironmentManagedActionsResult) -> Unit = definedExternally): Request<DescribeEnvironmentManagedActionsResult, AWSError>
    open fun describeEnvironmentManagedActions(callback: (err: AWSError, data: DescribeEnvironmentManagedActionsResult) -> Unit = definedExternally): Request<DescribeEnvironmentManagedActionsResult, AWSError>
    open fun describeEnvironmentResources(params: DescribeEnvironmentResourcesMessage, callback: (err: AWSError, data: EnvironmentResourceDescriptionsMessage) -> Unit = definedExternally): Request<EnvironmentResourceDescriptionsMessage, AWSError>
    open fun describeEnvironmentResources(callback: (err: AWSError, data: EnvironmentResourceDescriptionsMessage) -> Unit = definedExternally): Request<EnvironmentResourceDescriptionsMessage, AWSError>
    open fun describeEnvironments(params: DescribeEnvironmentsMessage, callback: (err: AWSError, data: EnvironmentDescriptionsMessage) -> Unit = definedExternally): Request<EnvironmentDescriptionsMessage, AWSError>
    open fun describeEnvironments(callback: (err: AWSError, data: EnvironmentDescriptionsMessage) -> Unit = definedExternally): Request<EnvironmentDescriptionsMessage, AWSError>
    open fun describeEvents(params: DescribeEventsMessage, callback: (err: AWSError, data: EventDescriptionsMessage) -> Unit = definedExternally): Request<EventDescriptionsMessage, AWSError>
    open fun describeEvents(callback: (err: AWSError, data: EventDescriptionsMessage) -> Unit = definedExternally): Request<EventDescriptionsMessage, AWSError>
    open fun describeInstancesHealth(params: DescribeInstancesHealthRequest, callback: (err: AWSError, data: DescribeInstancesHealthResult) -> Unit = definedExternally): Request<DescribeInstancesHealthResult, AWSError>
    open fun describeInstancesHealth(callback: (err: AWSError, data: DescribeInstancesHealthResult) -> Unit = definedExternally): Request<DescribeInstancesHealthResult, AWSError>
    open fun describePlatformVersion(params: DescribePlatformVersionRequest, callback: (err: AWSError, data: DescribePlatformVersionResult) -> Unit = definedExternally): Request<DescribePlatformVersionResult, AWSError>
    open fun describePlatformVersion(callback: (err: AWSError, data: DescribePlatformVersionResult) -> Unit = definedExternally): Request<DescribePlatformVersionResult, AWSError>
    open fun listAvailableSolutionStacks(callback: (err: AWSError, data: ListAvailableSolutionStacksResultMessage) -> Unit = definedExternally): Request<ListAvailableSolutionStacksResultMessage, AWSError>
    open fun listPlatformVersions(params: ListPlatformVersionsRequest, callback: (err: AWSError, data: ListPlatformVersionsResult) -> Unit = definedExternally): Request<ListPlatformVersionsResult, AWSError>
    open fun listPlatformVersions(callback: (err: AWSError, data: ListPlatformVersionsResult) -> Unit = definedExternally): Request<ListPlatformVersionsResult, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceMessage, callback: (err: AWSError, data: ResourceTagsDescriptionMessage) -> Unit = definedExternally): Request<ResourceTagsDescriptionMessage, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ResourceTagsDescriptionMessage) -> Unit = definedExternally): Request<ResourceTagsDescriptionMessage, AWSError>
    open fun rebuildEnvironment(params: RebuildEnvironmentMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun rebuildEnvironment(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun requestEnvironmentInfo(params: RequestEnvironmentInfoMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun requestEnvironmentInfo(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun restartAppServer(params: RestartAppServerMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun restartAppServer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun retrieveEnvironmentInfo(params: RetrieveEnvironmentInfoMessage, callback: (err: AWSError, data: RetrieveEnvironmentInfoResultMessage) -> Unit = definedExternally): Request<RetrieveEnvironmentInfoResultMessage, AWSError>
    open fun retrieveEnvironmentInfo(callback: (err: AWSError, data: RetrieveEnvironmentInfoResultMessage) -> Unit = definedExternally): Request<RetrieveEnvironmentInfoResultMessage, AWSError>
    open fun swapEnvironmentCNAMEs(params: SwapEnvironmentCNAMEsMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun swapEnvironmentCNAMEs(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun terminateEnvironment(params: TerminateEnvironmentMessage, callback: (err: AWSError, data: EnvironmentDescription) -> Unit = definedExternally): Request<EnvironmentDescription, AWSError>
    open fun terminateEnvironment(callback: (err: AWSError, data: EnvironmentDescription) -> Unit = definedExternally): Request<EnvironmentDescription, AWSError>
    open fun updateApplication(params: UpdateApplicationMessage, callback: (err: AWSError, data: ApplicationDescriptionMessage) -> Unit = definedExternally): Request<ApplicationDescriptionMessage, AWSError>
    open fun updateApplication(callback: (err: AWSError, data: ApplicationDescriptionMessage) -> Unit = definedExternally): Request<ApplicationDescriptionMessage, AWSError>
    open fun updateApplicationResourceLifecycle(params: UpdateApplicationResourceLifecycleMessage, callback: (err: AWSError, data: ApplicationResourceLifecycleDescriptionMessage) -> Unit = definedExternally): Request<ApplicationResourceLifecycleDescriptionMessage, AWSError>
    open fun updateApplicationResourceLifecycle(callback: (err: AWSError, data: ApplicationResourceLifecycleDescriptionMessage) -> Unit = definedExternally): Request<ApplicationResourceLifecycleDescriptionMessage, AWSError>
    open fun updateApplicationVersion(params: UpdateApplicationVersionMessage, callback: (err: AWSError, data: ApplicationVersionDescriptionMessage) -> Unit = definedExternally): Request<ApplicationVersionDescriptionMessage, AWSError>
    open fun updateApplicationVersion(callback: (err: AWSError, data: ApplicationVersionDescriptionMessage) -> Unit = definedExternally): Request<ApplicationVersionDescriptionMessage, AWSError>
    open fun updateConfigurationTemplate(params: UpdateConfigurationTemplateMessage, callback: (err: AWSError, data: ConfigurationSettingsDescription) -> Unit = definedExternally): Request<ConfigurationSettingsDescription, AWSError>
    open fun updateConfigurationTemplate(callback: (err: AWSError, data: ConfigurationSettingsDescription) -> Unit = definedExternally): Request<ConfigurationSettingsDescription, AWSError>
    open fun updateEnvironment(params: UpdateEnvironmentMessage, callback: (err: AWSError, data: EnvironmentDescription) -> Unit = definedExternally): Request<EnvironmentDescription, AWSError>
    open fun updateEnvironment(callback: (err: AWSError, data: EnvironmentDescription) -> Unit = definedExternally): Request<EnvironmentDescription, AWSError>
    open fun updateTagsForResource(params: UpdateTagsForResourceMessage, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateTagsForResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun validateConfigurationSettings(params: ValidateConfigurationSettingsMessage, callback: (err: AWSError, data: ConfigurationSettingsValidationMessages) -> Unit = definedExternally): Request<ConfigurationSettingsValidationMessages, AWSError>
    open fun validateConfigurationSettings(callback: (err: AWSError, data: ConfigurationSettingsValidationMessages) -> Unit = definedExternally): Request<ConfigurationSettingsValidationMessages, AWSError>
    interface AbortEnvironmentUpdateMessage {
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationDescription {
        var ApplicationArn: ApplicationArn?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DateCreated: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var DateUpdated: UpdateDate?
            get() = definedExternally
            set(value) = definedExternally
        var Versions: VersionLabelsList?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationTemplates: ConfigurationTemplateNamesList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationDescriptionMessage {
        var Application: ApplicationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationDescriptionsMessage {
        var Applications: ApplicationDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationMetrics {
        var Duration: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var RequestCount: RequestCount?
            get() = definedExternally
            set(value) = definedExternally
        var StatusCodes: StatusCodes?
            get() = definedExternally
            set(value) = definedExternally
        var Latency: Latency?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationResourceLifecycleConfig {
        var ServiceRole: String?
            get() = definedExternally
            set(value) = definedExternally
        var VersionLifecycleConfig: ApplicationVersionLifecycleConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationResourceLifecycleDescriptionMessage {
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationVersionDescription {
        var ApplicationVersionArn: ApplicationVersionArn?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var VersionLabel: VersionLabel?
            get() = definedExternally
            set(value) = definedExternally
        var SourceBuildInformation: SourceBuildInformation?
            get() = definedExternally
            set(value) = definedExternally
        var BuildArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var SourceBundle: S3Location?
            get() = definedExternally
            set(value) = definedExternally
        var DateCreated: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var DateUpdated: UpdateDate?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Processed" | "Unprocessed" | "Failed" | "Processing" | "Building" | String */
    }
    interface ApplicationVersionDescriptionMessage {
        var ApplicationVersion: ApplicationVersionDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationVersionDescriptionsMessage {
        var ApplicationVersions: ApplicationVersionDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationVersionLifecycleConfig {
        var MaxCountRule: MaxCountRule?
            get() = definedExternally
            set(value) = definedExternally
        var MaxAgeRule: MaxAgeRule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplyEnvironmentManagedActionRequest {
        var EnvironmentName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ActionId: String
    }
    interface ApplyEnvironmentManagedActionResult {
        var ActionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ActionDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var ActionType: String /* "InstanceRefresh" | "PlatformUpdate" | "Unknown" | String */
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoScalingGroup {
        var Name: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BuildConfiguration {
        var ArtifactName: String?
            get() = definedExternally
            set(value) = definedExternally
        var CodeBuildServiceRole: NonEmptyString
        var ComputeType: String /* "BUILD_GENERAL1_SMALL" | "BUILD_GENERAL1_MEDIUM" | "BUILD_GENERAL1_LARGE" | String */
        var Image: NonEmptyString
        var TimeoutInMinutes: BoxedInt?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Builder {
        var ARN: ARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CPUUtilization {
        var User: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Nice: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var System: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Idle: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var IOWait: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var IRQ: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var SoftIRQ: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Privileged: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CheckDNSAvailabilityMessage {
        var CNAMEPrefix: DNSCnamePrefix
    }
    interface CheckDNSAvailabilityResultMessage {
        var Available: CnameAvailability?
            get() = definedExternally
            set(value) = definedExternally
        var FullyQualifiedCNAME: DNSCname?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComposeEnvironmentsMessage {
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var GroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var VersionLabels: VersionLabels?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationOptionDescription {
        var Namespace: OptionNamespace?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ConfigurationOptionName?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValue: ConfigurationOptionDefaultValue?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSeverity: ConfigurationOptionSeverity?
            get() = definedExternally
            set(value) = definedExternally
        var UserDefined: UserDefinedOption?
            get() = definedExternally
            set(value) = definedExternally
        var ValueType: String /* "Scalar" | "List" | String */
        var ValueOptions: ConfigurationOptionPossibleValues?
            get() = definedExternally
            set(value) = definedExternally
        var MinValue: OptionRestrictionMinValue?
            get() = definedExternally
            set(value) = definedExternally
        var MaxValue: OptionRestrictionMaxValue?
            get() = definedExternally
            set(value) = definedExternally
        var MaxLength: OptionRestrictionMaxLength?
            get() = definedExternally
            set(value) = definedExternally
        var Regex: OptionRestrictionRegex?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationOptionSetting {
        var ResourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Namespace: OptionNamespace?
            get() = definedExternally
            set(value) = definedExternally
        var OptionName: ConfigurationOptionName?
            get() = definedExternally
            set(value) = definedExternally
        var Value: ConfigurationOptionValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationOptionsDescription {
        var SolutionStackName: SolutionStackName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var Options: ConfigurationOptionDescriptionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationSettingsDescription {
        var SolutionStackName: SolutionStackName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: ConfigurationTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentStatus: String /* "deployed" | "pending" | "failed" | String */
        var DateCreated: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var DateUpdated: UpdateDate?
            get() = definedExternally
            set(value) = definedExternally
        var OptionSettings: ConfigurationOptionSettingsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationSettingsDescriptions {
        var ConfigurationSettings: ConfigurationSettingsDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfigurationSettingsValidationMessages {
        var Messages: ValidationMessagesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationMessage {
        var ApplicationName: ApplicationName
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationVersionMessage {
        var ApplicationName: ApplicationName
        var VersionLabel: VersionLabel
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var SourceBuildInformation: SourceBuildInformation?
            get() = definedExternally
            set(value) = definedExternally
        var SourceBundle: S3Location?
            get() = definedExternally
            set(value) = definedExternally
        var BuildConfiguration: BuildConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var AutoCreateApplication: AutoCreateApplication?
            get() = definedExternally
            set(value) = definedExternally
        var Process: ApplicationVersionProccess?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConfigurationTemplateMessage {
        var ApplicationName: ApplicationName
        var TemplateName: ConfigurationTemplateName
        var SolutionStackName: SolutionStackName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var SourceConfiguration: SourceConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var OptionSettings: ConfigurationOptionSettingsList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEnvironmentMessage {
        var ApplicationName: ApplicationName
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var GroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var CNAMEPrefix: DNSCnamePrefix?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: EnvironmentTier?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var VersionLabel: VersionLabel?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: ConfigurationTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var SolutionStackName: SolutionStackName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var OptionSettings: ConfigurationOptionSettingsList?
            get() = definedExternally
            set(value) = definedExternally
        var OptionsToRemove: OptionsSpecifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePlatformVersionRequest {
        var PlatformName: PlatformName
        var PlatformVersion: PlatformVersion
        var PlatformDefinitionBundle: S3Location
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var OptionSettings: ConfigurationOptionSettingsList?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePlatformVersionResult {
        var PlatformSummary: PlatformSummary?
            get() = definedExternally
            set(value) = definedExternally
        var Builder: Builder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStorageLocationResultMessage {
        var S3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomAmi {
        var VirtualizationType: VirtualizationType?
            get() = definedExternally
            set(value) = definedExternally
        var ImageId: ImageId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApplicationMessage {
        var ApplicationName: ApplicationName
        var TerminateEnvByForce: TerminateEnvForce?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApplicationVersionMessage {
        var ApplicationName: ApplicationName
        var VersionLabel: VersionLabel
        var DeleteSourceBundle: DeleteSourceBundle?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteConfigurationTemplateMessage {
        var ApplicationName: ApplicationName
        var TemplateName: ConfigurationTemplateName
    }
    interface DeleteEnvironmentConfigurationMessage {
        var ApplicationName: ApplicationName
        var EnvironmentName: EnvironmentName
    }
    interface DeletePlatformVersionRequest {
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeletePlatformVersionResult {
        var PlatformSummary: PlatformSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Deployment {
        var VersionLabel: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentId: NullableLong?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentTime: DeploymentTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAccountAttributesResult {
        var ResourceQuotas: ResourceQuotas?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeApplicationVersionsMessage {
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var VersionLabels: VersionLabelsList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeApplicationsMessage {
        var ApplicationNames: ApplicationNamesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationOptionsMessage {
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: ConfigurationTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var SolutionStackName: SolutionStackName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var Options: OptionsSpecifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationSettingsMessage {
        var ApplicationName: ApplicationName
        var TemplateName: ConfigurationTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEnvironmentHealthRequest {
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeNames: EnvironmentHealthAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEnvironmentHealthResult {
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var HealthStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Green" | "Yellow" | "Red" | "Grey" | String */
        var Color: String?
            get() = definedExternally
            set(value) = definedExternally
        var Causes: Causes?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationMetrics: ApplicationMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var InstancesHealth: InstanceHealthSummary?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshedAt: RefreshedAt?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEnvironmentManagedActionHistoryRequest {
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEnvironmentManagedActionHistoryResult {
        var ManagedActionHistoryItems: ManagedActionHistoryItems?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEnvironmentManagedActionsRequest {
        var EnvironmentName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Scheduled" | "Pending" | "Running" | "Unknown" | String */
    }
    interface DescribeEnvironmentManagedActionsResult {
        var ManagedActions: ManagedActions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEnvironmentResourcesMessage {
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEnvironmentsMessage {
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var VersionLabel: VersionLabel?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentIds: EnvironmentIdList?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentNames: EnvironmentNamesList?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeDeleted: IncludeDeleted?
            get() = definedExternally
            set(value) = definedExternally
        var IncludedDeletedBackTo: IncludeDeletedBackTo?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventsMessage {
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var VersionLabel: VersionLabel?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: ConfigurationTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: RequestId?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: String /* "TRACE" | "DEBUG" | "INFO" | "WARN" | "ERROR" | "FATAL" | String */
        var StartTime: TimeFilterStart?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: TimeFilterEnd?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: MaxRecords?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancesHealthRequest {
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeNames: InstancesHealthAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeInstancesHealthResult {
        var InstanceHealthList: InstanceHealthList?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshedAt: RefreshedAt?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePlatformVersionRequest {
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePlatformVersionResult {
        var PlatformDescription: PlatformDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentDescription {
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var VersionLabel: VersionLabel?
            get() = definedExternally
            set(value) = definedExternally
        var SolutionStackName: SolutionStackName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: ConfigurationTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointURL: EndpointURL?
            get() = definedExternally
            set(value) = definedExternally
        var CNAME: DNSCname?
            get() = definedExternally
            set(value) = definedExternally
        var DateCreated: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var DateUpdated: UpdateDate?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Launching" | "Updating" | "Ready" | "Terminating" | "Terminated" | String */
        var AbortableOperationInProgress: AbortableOperationInProgress?
            get() = definedExternally
            set(value) = definedExternally
        var Health: String /* "Green" | "Yellow" | "Red" | "Grey" | String */
        var HealthStatus: String /* "NoData" | "Unknown" | "Pending" | "Ok" | "Info" | "Warning" | "Degraded" | "Severe" | "Suspended" | String */
        var Resources: EnvironmentResourcesDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: EnvironmentTier?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentLinks: EnvironmentLinks?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentArn: EnvironmentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentDescriptionsMessage {
        var Environments: EnvironmentDescriptionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentInfoDescription {
        var InfoType: String /* "tail" | "bundle" | String */
        var Ec2InstanceId: Ec2InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var SampleTimestamp: SampleTimestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentLink {
        var LinkName: String?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentResourceDescription {
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingGroups: AutoScalingGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var Instances: InstanceList?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchConfigurations: LaunchConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchTemplates: LaunchTemplateList?
            get() = definedExternally
            set(value) = definedExternally
        var LoadBalancers: LoadBalancerList?
            get() = definedExternally
            set(value) = definedExternally
        var Triggers: TriggerList?
            get() = definedExternally
            set(value) = definedExternally
        var Queues: QueueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentResourceDescriptionsMessage {
        var EnvironmentResources: EnvironmentResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentResourcesDescription {
        var LoadBalancer: LoadBalancerDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentTier {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Version: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventDescription {
        var EventDate: EventDate?
            get() = definedExternally
            set(value) = definedExternally
        var Message: EventMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var VersionLabel: VersionLabel?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: ConfigurationTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var RequestId: RequestId?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: String /* "TRACE" | "DEBUG" | "INFO" | "WARN" | "ERROR" | "FATAL" | String */
    }
    interface EventDescriptionsMessage {
        var Events: EventDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Instance {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceHealthSummary {
        var NoData: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Unknown: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Pending: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Ok: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Info: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Warning: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Degraded: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Severe: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Latency {
        var P999: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var P99: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var P95: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var P90: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var P85: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var P75: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var P50: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var P10: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchConfiguration {
        var Name: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchTemplate {
        var Id: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAvailableSolutionStacksResultMessage {
        var SolutionStacks: AvailableSolutionStackNamesList?
            get() = definedExternally
            set(value) = definedExternally
        var SolutionStackDetails: AvailableSolutionStackDetailsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPlatformVersionsRequest {
        var Filters: PlatformFilters?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRecords: PlatformMaxRecords?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPlatformVersionsResult {
        var PlatformSummaryList: PlatformSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceMessage {
        var ResourceArn: ResourceArn
    }
    interface Listener {
        var Protocol: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancer {
        var Name: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoadBalancerDescription {
        var LoadBalancerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String?
            get() = definedExternally
            set(value) = definedExternally
        var Listeners: LoadBalancerListenersDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ManagedAction {
        var ActionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ActionDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var ActionType: String /* "InstanceRefresh" | "PlatformUpdate" | "Unknown" | String */
        var Status: String /* "Scheduled" | "Pending" | "Running" | "Unknown" | String */
        var WindowStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ManagedActionHistoryItem {
        var ActionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ActionType: String /* "InstanceRefresh" | "PlatformUpdate" | "Unknown" | String */
        var ActionDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var FailureType: String /* "UpdateCancelled" | "CancellationFailed" | "RollbackFailed" | "RollbackSuccessful" | "InternalFailure" | "InvalidEnvironmentState" | "PermissionsError" | String */
        var Status: String /* "Completed" | "Failed" | "Unknown" | String */
        var FailureDescription: String?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var FinishedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaxAgeRule {
        var Enabled: BoxedBoolean
        var MaxAgeInDays: BoxedInt?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteSourceFromS3: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MaxCountRule {
        var Enabled: BoxedBoolean
        var MaxCount: BoxedInt?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteSourceFromS3: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionRestrictionRegex {
        var Pattern: RegexPattern?
            get() = definedExternally
            set(value) = definedExternally
        var Label: RegexLabel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptionSpecification {
        var ResourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Namespace: OptionNamespace?
            get() = definedExternally
            set(value) = definedExternally
        var OptionName: ConfigurationOptionName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlatformDescription {
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformOwner: PlatformOwner?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformName: PlatformName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformVersion: PlatformVersion?
            get() = definedExternally
            set(value) = definedExternally
        var SolutionStackName: SolutionStackName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformStatus: String /* "Creating" | "Failed" | "Ready" | "Deleting" | "Deleted" | String */
        var DateCreated: CreationDate?
            get() = definedExternally
            set(value) = definedExternally
        var DateUpdated: UpdateDate?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformCategory: PlatformCategory?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Maintainer: Maintainer?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystemName: OperatingSystemName?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystemVersion: OperatingSystemVersion?
            get() = definedExternally
            set(value) = definedExternally
        var ProgrammingLanguages: PlatformProgrammingLanguages?
            get() = definedExternally
            set(value) = definedExternally
        var Frameworks: PlatformFrameworks?
            get() = definedExternally
            set(value) = definedExternally
        var CustomAmiList: CustomAmiList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedTierList: SupportedTierList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedAddonList: SupportedAddonList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlatformFilter {
        var Type: PlatformFilterType?
            get() = definedExternally
            set(value) = definedExternally
        var Operator: PlatformFilterOperator?
            get() = definedExternally
            set(value) = definedExternally
        var Values: PlatformFilterValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlatformFramework {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Version: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlatformProgrammingLanguage {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Version: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PlatformSummary {
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformOwner: PlatformOwner?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformStatus: String /* "Creating" | "Failed" | "Ready" | "Deleting" | "Deleted" | String */
        var PlatformCategory: PlatformCategory?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystemName: OperatingSystemName?
            get() = definedExternally
            set(value) = definedExternally
        var OperatingSystemVersion: OperatingSystemVersion?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedTierList: SupportedTierList?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedAddonList: SupportedAddonList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Queue {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var URL: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RebuildEnvironmentMessage {
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RequestEnvironmentInfoMessage {
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var InfoType: String /* "tail" | "bundle" | String */
    }
    interface ResourceQuota {
        var Maximum: BoxedInt?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceQuotas {
        var ApplicationQuota: ResourceQuota?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionQuota: ResourceQuota?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentQuota: ResourceQuota?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationTemplateQuota: ResourceQuota?
            get() = definedExternally
            set(value) = definedExternally
        var CustomPlatformQuota: ResourceQuota?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTagsDescriptionMessage {
        var ResourceArn: ResourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestartAppServerMessage {
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RetrieveEnvironmentInfoMessage {
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var InfoType: String /* "tail" | "bundle" | String */
    }
    interface RetrieveEnvironmentInfoResultMessage {
        var EnvironmentInfo: EnvironmentInfoDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Location {
        var S3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var S3Key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SingleInstanceHealth {
        var InstanceId: InstanceId?
            get() = definedExternally
            set(value) = definedExternally
        var HealthStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var Color: String?
            get() = definedExternally
            set(value) = definedExternally
        var Causes: Causes?
            get() = definedExternally
            set(value) = definedExternally
        var LaunchedAt: LaunchedAt?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationMetrics: ApplicationMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var System: SystemStatus?
            get() = definedExternally
            set(value) = definedExternally
        var Deployment: Deployment?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: String?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SolutionStackDescription {
        var SolutionStackName: SolutionStackName?
            get() = definedExternally
            set(value) = definedExternally
        var PermittedFileTypes: SolutionStackFileTypeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceBuildInformation {
        var SourceType: String /* "Git" | "Zip" | String */
        var SourceRepository: String /* "CodeCommit" | "S3" | String */
        var SourceLocation: SourceLocation
    }
    interface SourceConfiguration {
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: ConfigurationTemplateName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StatusCodes {
        var Status2xx: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Status3xx: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Status4xx: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Status5xx: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SwapEnvironmentCNAMEsMessage {
        var SourceEnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationEnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationEnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SystemStatus {
        var CPUUtilization: CPUUtilization?
            get() = definedExternally
            set(value) = definedExternally
        var LoadAverage: LoadAverage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminateEnvironmentMessage {
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var TerminateResources: TerminateEnvironmentResources?
            get() = definedExternally
            set(value) = definedExternally
        var ForceTerminate: ForceTerminate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Trigger {
        var Name: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApplicationMessage {
        var ApplicationName: ApplicationName
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApplicationResourceLifecycleMessage {
        var ApplicationName: ApplicationName
        var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig
    }
    interface UpdateApplicationVersionMessage {
        var ApplicationName: ApplicationName
        var VersionLabel: VersionLabel
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateConfigurationTemplateMessage {
        var ApplicationName: ApplicationName
        var TemplateName: ConfigurationTemplateName
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var OptionSettings: ConfigurationOptionSettingsList?
            get() = definedExternally
            set(value) = definedExternally
        var OptionsToRemove: OptionsSpecifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEnvironmentMessage {
        var ApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentId: EnvironmentId?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var GroupName: GroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Tier: EnvironmentTier?
            get() = definedExternally
            set(value) = definedExternally
        var VersionLabel: VersionLabel?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateName: ConfigurationTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var SolutionStackName: SolutionStackName?
            get() = definedExternally
            set(value) = definedExternally
        var PlatformArn: PlatformArn?
            get() = definedExternally
            set(value) = definedExternally
        var OptionSettings: ConfigurationOptionSettingsList?
            get() = definedExternally
            set(value) = definedExternally
        var OptionsToRemove: OptionsSpecifierList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTagsForResourceMessage {
        var ResourceArn: ResourceArn
        var TagsToAdd: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var TagsToRemove: TagKeyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidateConfigurationSettingsMessage {
        var ApplicationName: ApplicationName
        var TemplateName: ConfigurationTemplateName?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentName: EnvironmentName?
            get() = definedExternally
            set(value) = definedExternally
        var OptionSettings: ConfigurationOptionSettingsList
    }
    interface ValidationMessage {
        var Message: ValidationMessageString?
            get() = definedExternally
            set(value) = definedExternally
        var Severity: String /* "error" | "warning" | String */
        var Namespace: OptionNamespace?
            get() = definedExternally
            set(value) = definedExternally
        var OptionName: ConfigurationOptionName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2010-12-01" | "latest" | String */
    }
}