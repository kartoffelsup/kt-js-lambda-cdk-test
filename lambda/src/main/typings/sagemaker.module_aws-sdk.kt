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
import SageMaker.AlgorithmStatusItem
import SageMaker.AlgorithmSummary
import SageMaker.AlgorithmValidationProfile
import SageMaker.AppDetails
import SageMaker.AutoMLCandidate
import SageMaker.AutoMLContainerDefinition
import SageMaker.AutoMLChannel
import SageMaker.AutoMLJobSummary
import SageMaker.AutoMLCandidateStep
import SageMaker.CaptureOption
import SageMaker.CategoricalParameterRange
import SageMaker.ChannelSpecification
import SageMaker.CodeRepositorySummary
import SageMaker.CollectionConfiguration
import SageMaker.CompilationJobSummary
import SageMaker.ContainerDefinition
import SageMaker.ContinuousParameterRange
import SageMaker.DebugRuleConfiguration
import SageMaker.DebugRuleEvaluationStatus
import SageMaker.DeployedImage
import SageMaker.DesiredWeightAndCapacity
import SageMaker.DomainDetails
import SageMaker.EndpointConfigSummary
import SageMaker.EndpointSummary
import SageMaker.ExperimentSummary
import SageMaker.Filter
import SageMaker.MetricData
import SageMaker.FlowDefinitionSummary
import SageMaker.HumanTaskUiSummary
import SageMaker.HyperParameterSpecification
import SageMaker.HyperParameterTrainingJobDefinition
import SageMaker.HyperParameterTrainingJobSummary
import SageMaker.HyperParameterTuningJobObjective
import SageMaker.HyperParameterTuningJobSummary
import SageMaker.Channel
import SageMaker.IntegerParameterRange
import SageMaker.LabelingJobForWorkteamSummary
import SageMaker.LabelingJobSummary
import SageMaker.MemberDefinition
import SageMaker.MetricDefinition
import SageMaker.ModelPackageContainerDefinition
import SageMaker.ModelPackageStatusItem
import SageMaker.ModelPackageSummary
import SageMaker.ModelPackageValidationProfile
import SageMaker.ModelSummary
import SageMaker.MonitoringExecutionSummary
import SageMaker.MonitoringInput
import SageMaker.MonitoringOutput
import SageMaker.MonitoringScheduleSummary
import SageMaker.NestedFilters
import SageMaker.NotebookInstanceLifecycleHook
import SageMaker.NotebookInstanceLifecycleConfigSummary
import SageMaker.NotebookInstanceSummary
import SageMaker.ParentHyperParameterTuningJob
import SageMaker.Parent
import SageMaker.ProcessingInput
import SageMaker.ProcessingJobSummary
import SageMaker.ProcessingOutput
import SageMaker.ProductionVariant
import SageMaker.ProductionVariantSummary
import SageMaker.PropertyNameSuggestion
import SageMaker.RenderingError
import SageMaker.SearchExpression
import SageMaker.SearchRecord
import SageMaker.SecondaryStatusTransition
import SageMaker.SourceAlgorithm
import SageMaker.SubscribedWorkteam
import SageMaker.Tag
import SageMaker.TrainingJobSummary
import SageMaker.TransformJobSummary
import SageMaker.TrialComponentMetricSummary
import SageMaker.TrialComponentSimpleSummary
import SageMaker.TrialComponentSummary
import SageMaker.TrialSummary
import SageMaker.UserProfileDetails
import SageMaker.VariantProperty
import SageMaker.Workteam
import SageMaker.AddTagsInput
import SageMaker.AddTagsOutput
import SageMaker.AssociateTrialComponentRequest
import SageMaker.AssociateTrialComponentResponse
import SageMaker.CreateAlgorithmInput
import SageMaker.CreateAlgorithmOutput
import SageMaker.CreateAppRequest
import SageMaker.CreateAppResponse
import SageMaker.CreateAutoMLJobRequest
import SageMaker.CreateAutoMLJobResponse
import SageMaker.CreateCodeRepositoryInput
import SageMaker.CreateCodeRepositoryOutput
import SageMaker.CreateCompilationJobRequest
import SageMaker.CreateCompilationJobResponse
import SageMaker.CreateDomainRequest
import SageMaker.CreateDomainResponse
import SageMaker.CreateEndpointInput
import SageMaker.CreateEndpointOutput
import SageMaker.CreateEndpointConfigInput
import SageMaker.CreateEndpointConfigOutput
import SageMaker.CreateExperimentRequest
import SageMaker.CreateExperimentResponse
import SageMaker.CreateFlowDefinitionRequest
import SageMaker.CreateFlowDefinitionResponse
import SageMaker.CreateHumanTaskUiRequest
import SageMaker.CreateHumanTaskUiResponse
import SageMaker.CreateHyperParameterTuningJobRequest
import SageMaker.CreateHyperParameterTuningJobResponse
import SageMaker.CreateLabelingJobRequest
import SageMaker.CreateLabelingJobResponse
import SageMaker.CreateModelInput
import SageMaker.CreateModelOutput
import SageMaker.CreateModelPackageInput
import SageMaker.CreateModelPackageOutput
import SageMaker.CreateMonitoringScheduleRequest
import SageMaker.CreateMonitoringScheduleResponse
import SageMaker.CreateNotebookInstanceInput
import SageMaker.CreateNotebookInstanceOutput
import SageMaker.CreateNotebookInstanceLifecycleConfigInput
import SageMaker.CreateNotebookInstanceLifecycleConfigOutput
import SageMaker.CreatePresignedDomainUrlRequest
import SageMaker.CreatePresignedDomainUrlResponse
import SageMaker.CreatePresignedNotebookInstanceUrlInput
import SageMaker.CreatePresignedNotebookInstanceUrlOutput
import SageMaker.CreateProcessingJobRequest
import SageMaker.CreateProcessingJobResponse
import SageMaker.CreateTrainingJobRequest
import SageMaker.CreateTrainingJobResponse
import SageMaker.CreateTransformJobRequest
import SageMaker.CreateTransformJobResponse
import SageMaker.CreateTrialRequest
import SageMaker.CreateTrialResponse
import SageMaker.CreateTrialComponentRequest
import SageMaker.CreateTrialComponentResponse
import SageMaker.CreateUserProfileRequest
import SageMaker.CreateUserProfileResponse
import SageMaker.CreateWorkteamRequest
import SageMaker.CreateWorkteamResponse
import SageMaker.DeleteAlgorithmInput
import SageMaker.DeleteAppRequest
import SageMaker.DeleteCodeRepositoryInput
import SageMaker.DeleteDomainRequest
import SageMaker.DeleteEndpointInput
import SageMaker.DeleteEndpointConfigInput
import SageMaker.DeleteExperimentRequest
import SageMaker.DeleteExperimentResponse
import SageMaker.DeleteFlowDefinitionRequest
import SageMaker.DeleteFlowDefinitionResponse
import SageMaker.DeleteModelInput
import SageMaker.DeleteModelPackageInput
import SageMaker.DeleteMonitoringScheduleRequest
import SageMaker.DeleteNotebookInstanceInput
import SageMaker.DeleteNotebookInstanceLifecycleConfigInput
import SageMaker.DeleteTagsInput
import SageMaker.DeleteTagsOutput
import SageMaker.DeleteTrialRequest
import SageMaker.DeleteTrialResponse
import SageMaker.DeleteTrialComponentRequest
import SageMaker.DeleteTrialComponentResponse
import SageMaker.DeleteUserProfileRequest
import SageMaker.DeleteWorkteamRequest
import SageMaker.DeleteWorkteamResponse
import SageMaker.DescribeAlgorithmInput
import SageMaker.DescribeAlgorithmOutput
import SageMaker.DescribeAppRequest
import SageMaker.DescribeAppResponse
import SageMaker.DescribeAutoMLJobRequest
import SageMaker.DescribeAutoMLJobResponse
import SageMaker.DescribeCodeRepositoryInput
import SageMaker.DescribeCodeRepositoryOutput
import SageMaker.DescribeCompilationJobRequest
import SageMaker.DescribeCompilationJobResponse
import SageMaker.DescribeDomainRequest
import SageMaker.DescribeDomainResponse
import SageMaker.DescribeEndpointInput
import SageMaker.DescribeEndpointOutput
import SageMaker.DescribeEndpointConfigInput
import SageMaker.DescribeEndpointConfigOutput
import SageMaker.DescribeExperimentRequest
import SageMaker.DescribeExperimentResponse
import SageMaker.DescribeFlowDefinitionRequest
import SageMaker.DescribeFlowDefinitionResponse
import SageMaker.DescribeHumanTaskUiRequest
import SageMaker.DescribeHumanTaskUiResponse
import SageMaker.DescribeHyperParameterTuningJobRequest
import SageMaker.DescribeHyperParameterTuningJobResponse
import SageMaker.DescribeLabelingJobRequest
import SageMaker.DescribeLabelingJobResponse
import SageMaker.DescribeModelInput
import SageMaker.DescribeModelOutput
import SageMaker.DescribeModelPackageInput
import SageMaker.DescribeModelPackageOutput
import SageMaker.DescribeMonitoringScheduleRequest
import SageMaker.DescribeMonitoringScheduleResponse
import SageMaker.DescribeNotebookInstanceInput
import SageMaker.DescribeNotebookInstanceOutput
import SageMaker.DescribeNotebookInstanceLifecycleConfigInput
import SageMaker.DescribeNotebookInstanceLifecycleConfigOutput
import SageMaker.DescribeProcessingJobRequest
import SageMaker.DescribeProcessingJobResponse
import SageMaker.DescribeSubscribedWorkteamRequest
import SageMaker.DescribeSubscribedWorkteamResponse
import SageMaker.DescribeTrainingJobRequest
import SageMaker.DescribeTrainingJobResponse
import SageMaker.DescribeTransformJobRequest
import SageMaker.DescribeTransformJobResponse
import SageMaker.DescribeTrialRequest
import SageMaker.DescribeTrialResponse
import SageMaker.DescribeTrialComponentRequest
import SageMaker.DescribeTrialComponentResponse
import SageMaker.DescribeUserProfileRequest
import SageMaker.DescribeUserProfileResponse
import SageMaker.DescribeWorkforceRequest
import SageMaker.DescribeWorkforceResponse
import SageMaker.DescribeWorkteamRequest
import SageMaker.DescribeWorkteamResponse
import SageMaker.DisassociateTrialComponentRequest
import SageMaker.DisassociateTrialComponentResponse
import SageMaker.GetSearchSuggestionsRequest
import SageMaker.GetSearchSuggestionsResponse
import SageMaker.ListAlgorithmsInput
import SageMaker.ListAlgorithmsOutput
import SageMaker.ListAppsRequest
import SageMaker.ListAppsResponse
import SageMaker.ListAutoMLJobsRequest
import SageMaker.ListAutoMLJobsResponse
import SageMaker.ListCandidatesForAutoMLJobRequest
import SageMaker.ListCandidatesForAutoMLJobResponse
import SageMaker.ListCodeRepositoriesInput
import SageMaker.ListCodeRepositoriesOutput
import SageMaker.ListCompilationJobsRequest
import SageMaker.ListCompilationJobsResponse
import SageMaker.ListDomainsRequest
import SageMaker.ListDomainsResponse
import SageMaker.ListEndpointConfigsInput
import SageMaker.ListEndpointConfigsOutput
import SageMaker.ListEndpointsInput
import SageMaker.ListEndpointsOutput
import SageMaker.ListExperimentsRequest
import SageMaker.ListExperimentsResponse
import SageMaker.ListFlowDefinitionsRequest
import SageMaker.ListFlowDefinitionsResponse
import SageMaker.ListHumanTaskUisRequest
import SageMaker.ListHumanTaskUisResponse
import SageMaker.ListHyperParameterTuningJobsRequest
import SageMaker.ListHyperParameterTuningJobsResponse
import SageMaker.ListLabelingJobsRequest
import SageMaker.ListLabelingJobsResponse
import SageMaker.ListLabelingJobsForWorkteamRequest
import SageMaker.ListLabelingJobsForWorkteamResponse
import SageMaker.ListModelPackagesInput
import SageMaker.ListModelPackagesOutput
import SageMaker.ListModelsInput
import SageMaker.ListModelsOutput
import SageMaker.ListMonitoringExecutionsRequest
import SageMaker.ListMonitoringExecutionsResponse
import SageMaker.ListMonitoringSchedulesRequest
import SageMaker.ListMonitoringSchedulesResponse
import SageMaker.ListNotebookInstanceLifecycleConfigsInput
import SageMaker.ListNotebookInstanceLifecycleConfigsOutput
import SageMaker.ListNotebookInstancesInput
import SageMaker.ListNotebookInstancesOutput
import SageMaker.ListProcessingJobsRequest
import SageMaker.ListProcessingJobsResponse
import SageMaker.ListSubscribedWorkteamsRequest
import SageMaker.ListSubscribedWorkteamsResponse
import SageMaker.ListTagsInput
import SageMaker.ListTagsOutput
import SageMaker.ListTrainingJobsRequest
import SageMaker.ListTrainingJobsResponse
import SageMaker.ListTrainingJobsForHyperParameterTuningJobRequest
import SageMaker.ListTrainingJobsForHyperParameterTuningJobResponse
import SageMaker.ListTransformJobsRequest
import SageMaker.ListTransformJobsResponse
import SageMaker.ListTrialComponentsRequest
import SageMaker.ListTrialComponentsResponse
import SageMaker.ListTrialsRequest
import SageMaker.ListTrialsResponse
import SageMaker.ListUserProfilesRequest
import SageMaker.ListUserProfilesResponse
import SageMaker.ListWorkteamsRequest
import SageMaker.ListWorkteamsResponse
import SageMaker.RenderUiTemplateRequest
import SageMaker.RenderUiTemplateResponse
import SageMaker.SearchRequest
import SageMaker.SearchResponse
import SageMaker.StartMonitoringScheduleRequest
import SageMaker.StartNotebookInstanceInput
import SageMaker.StopAutoMLJobRequest
import SageMaker.StopCompilationJobRequest
import SageMaker.StopHyperParameterTuningJobRequest
import SageMaker.StopLabelingJobRequest
import SageMaker.StopMonitoringScheduleRequest
import SageMaker.StopNotebookInstanceInput
import SageMaker.StopProcessingJobRequest
import SageMaker.StopTrainingJobRequest
import SageMaker.StopTransformJobRequest
import SageMaker.UpdateCodeRepositoryInput
import SageMaker.UpdateCodeRepositoryOutput
import SageMaker.UpdateDomainRequest
import SageMaker.UpdateDomainResponse
import SageMaker.UpdateEndpointInput
import SageMaker.UpdateEndpointOutput
import SageMaker.UpdateEndpointWeightsAndCapacitiesInput
import SageMaker.UpdateEndpointWeightsAndCapacitiesOutput
import SageMaker.UpdateExperimentRequest
import SageMaker.UpdateExperimentResponse
import SageMaker.UpdateMonitoringScheduleRequest
import SageMaker.UpdateMonitoringScheduleResponse
import SageMaker.UpdateNotebookInstanceInput
import SageMaker.UpdateNotebookInstanceOutput
import SageMaker.UpdateNotebookInstanceLifecycleConfigInput
import SageMaker.UpdateNotebookInstanceLifecycleConfigOutput
import SageMaker.UpdateTrialRequest
import SageMaker.UpdateTrialResponse
import SageMaker.UpdateTrialComponentRequest
import SageMaker.UpdateTrialComponentResponse
import SageMaker.UpdateUserProfileRequest
import SageMaker.UpdateUserProfileResponse
import SageMaker.UpdateWorkforceRequest
import SageMaker.UpdateWorkforceResponse
import SageMaker.UpdateWorkteamRequest
import SageMaker.UpdateWorkteamResponse
import SageMaker.TrainingJobDefinition
import SageMaker.TransformJobDefinition
import SageMaker.FinalAutoMLJobObjectiveMetric
import SageMaker.AutoMLDataSource
import SageMaker.EnvironmentMap
import SageMaker.AutoMLS3DataSource
import SageMaker.AutoMLJobCompletionCriteria
import SageMaker.AutoMLSecurityConfig
import SageMaker.VpcConfig
import SageMaker.DataSource
import SageMaker.ShuffleConfig
import SageMaker.GitConfig
import SageMaker.CollectionParameters
import SageMaker.TrainingSpecification
import SageMaker.InferenceSpecification
import SageMaker.AlgorithmValidationSpecification
import SageMaker.ResourceSpec
import SageMaker.AutoMLOutputDataConfig
import SageMaker.AutoMLJobObjective
import SageMaker.AutoMLJobConfig
import SageMaker.InputConfig
import SageMaker.OutputConfig
import SageMaker.StoppingCondition
import SageMaker.UserSettings
import SageMaker.DataCaptureConfig
import SageMaker.HumanLoopRequestSource
import SageMaker.HumanLoopActivationConfig
import SageMaker.HumanLoopConfig
import SageMaker.FlowDefinitionOutputConfig
import SageMaker.UiTemplate
import SageMaker.HyperParameterTuningJobConfig
import SageMaker.HyperParameterTuningJobWarmStartConfig
import SageMaker.LabelingJobInputConfig
import SageMaker.LabelingJobOutputConfig
import SageMaker.LabelingJobStoppingConditions
import SageMaker.LabelingJobAlgorithmsConfig
import SageMaker.HumanTaskConfig
import SageMaker.ModelPackageValidationSpecification
import SageMaker.SourceAlgorithmSpecification
import SageMaker.MonitoringScheduleConfig
import SageMaker.ProcessingOutputConfig
import SageMaker.ProcessingResources
import SageMaker.ProcessingStoppingCondition
import SageMaker.AppSpecification
import SageMaker.ProcessingEnvironmentMap
import SageMaker.NetworkConfig
import SageMaker.ExperimentConfig
import SageMaker.HyperParameters
import SageMaker.AlgorithmSpecification
import SageMaker.OutputDataConfig
import SageMaker.ResourceConfig
import SageMaker.CheckpointConfig
import SageMaker.DebugHookConfig
import SageMaker.TensorBoardOutputConfig
import SageMaker.TransformEnvironmentMap
import SageMaker.TransformInput
import SageMaker.TransformOutput
import SageMaker.TransformResources
import SageMaker.DataProcessing
import SageMaker.TrialComponentStatus
import SageMaker.TrialComponentParameters
import SageMaker.TrialComponentArtifacts
import SageMaker.NotificationConfiguration
import SageMaker.CaptureContentTypeHeader
import SageMaker.S3DataSource
import SageMaker.FileSystemDataSource
import SageMaker.HookParameters
import SageMaker.RuleParameters
import SageMaker.RetentionPolicy
import SageMaker.AlgorithmStatusDetails
import SageMaker.AutoMLJobArtifacts
import SageMaker.ResolvedAttributes
import SageMaker.ModelArtifacts
import SageMaker.DataCaptureConfigSummary
import SageMaker.ExperimentSource
import SageMaker.UserContext
import SageMaker.UiTemplateInfo
import SageMaker.TrainingJobStatusCounters
import SageMaker.ObjectiveStatusCounters
import SageMaker.LabelCounters
import SageMaker.LabelingJobOutput
import SageMaker.ModelPackageStatusDetails
import SageMaker.TrialComponentSource
import SageMaker.TrialSource
import SageMaker.Workforce
import SageMaker.SuggestionQuery
import SageMaker.HumanLoopActivationConditionsConfig
import SageMaker.PublicWorkforceTaskPrice
import SageMaker.UiConfig
import SageMaker.AnnotationConsolidationConfig
import SageMaker.ParameterRange
import SageMaker.ParameterRanges
import SageMaker.HyperParameterAlgorithmSpecification
import SageMaker.FinalHyperParameterTuningJobObjectiveMetric
import SageMaker.ResourceLimits
import SageMaker.TuningJobCompletionCriteria
import SageMaker.LabelingJobResourceConfig
import SageMaker.LabelingJobS3DataSource
import SageMaker.LabelCountersForWorkteam
import SageMaker.LabelingJobDataSource
import SageMaker.LabelingJobDataAttributes
import SageMaker.CognitoMemberDefinition
import SageMaker.MonitoringConstraintsResource
import SageMaker.MonitoringStatisticsResource
import SageMaker.EndpointInput
import SageMaker.MonitoringBaselineConfig
import SageMaker.MonitoringOutputConfig
import SageMaker.MonitoringResources
import SageMaker.MonitoringAppSpecification
import SageMaker.MonitoringStoppingCondition
import SageMaker.MonitoringEnvironmentMap
import SageMaker.MonitoringS3Output
import SageMaker.MonitoringClusterConfig
import SageMaker.ScheduleConfig
import SageMaker.MonitoringJobDefinition
import SageMaker.IntegerParameterRangeSpecification
import SageMaker.ContinuousParameterRangeSpecification
import SageMaker.CategoricalParameterRangeSpecification
import SageMaker.ProcessingS3Input
import SageMaker.ProcessingS3Output
import SageMaker.ProcessingClusterConfig
import SageMaker.USD
import SageMaker.RenderableTask
import SageMaker.TrainingJob
import SageMaker.Experiment
import SageMaker.Trial
import SageMaker.TrialComponent
import SageMaker.PropertyNameQuery
import SageMaker.TransformS3DataSource
import SageMaker.TransformDataSource
import SageMaker.TrialComponentSourceDetail
import SageMaker.TrialComponentArtifact
import SageMaker.TrialComponentParameterValue
import SageMaker.GitConfigForUpdate
import SageMaker.SourceIpConfig
import SageMaker.SharingSettings
import SageMaker.JupyterServerAppSettings
import SageMaker.KernelGatewayAppSettings
import SageMaker.TensorBoardAppSettings

typealias Accept = String

typealias AccountId = String

typealias AdditionalCodeRepositoryNamesOrUrls = Array<CodeRepositoryNameOrUrl>

typealias AlgorithmArn = String

typealias AlgorithmImage = String

typealias AlgorithmStatusItemList = Array<AlgorithmStatusItem>

typealias AlgorithmSummaryList = Array<AlgorithmSummary>

typealias AlgorithmValidationProfiles = Array<AlgorithmValidationProfile>

typealias AppArn = String

typealias AppList = Array<AppDetails>

typealias AppName = String

typealias ArnOrName = String

typealias AttributeName = String

typealias AttributeNames = Array<AttributeName>

typealias AutoMLCandidates = Array<AutoMLCandidate>

typealias AutoMLContainerDefinitions = Array<AutoMLContainerDefinition>

typealias AutoMLFailureReason = String

typealias AutoMLInputDataConfig = Array<AutoMLChannel>

typealias AutoMLJobArn = String

typealias AutoMLJobName = String

typealias AutoMLJobSummaries = Array<AutoMLJobSummary>

typealias AutoMLMaxResults = Number

typealias AutoMLNameContains = String

typealias BillableTimeInSeconds = Number

typealias Boolean = Boolean

typealias Branch = String

typealias CandidateDefinitionNotebookLocation = String

typealias CandidateName = String

typealias CandidateStepArn = String

typealias CandidateStepName = String

typealias CandidateSteps = Array<AutoMLCandidateStep>

typealias CaptureOptionList = Array<CaptureOption>

typealias CategoricalParameterRanges = Array<CategoricalParameterRange>

typealias Cents = Number

typealias CertifyForMarketplace = Boolean

typealias ChannelName = String

typealias ChannelSpecifications = Array<ChannelSpecification>

typealias Cidr = String

typealias Cidrs = Array<Cidr>

typealias CodeRepositoryArn = String

typealias CodeRepositoryContains = String

typealias CodeRepositoryNameContains = String

typealias CodeRepositoryNameOrUrl = String

typealias CodeRepositorySummaryList = Array<CodeRepositorySummary>

typealias CognitoClientId = String

typealias CognitoUserGroup = String

typealias CognitoUserPool = String

typealias CollectionConfigurations = Array<CollectionConfiguration>

typealias CollectionName = String

typealias CompilationJobArn = String

typealias CompilationJobSummaries = Array<CompilationJobSummary>

typealias CompressionTypes = Array<String /* "None" | "Gzip" | String */>

typealias ConfigKey = String

typealias ConfigValue = String

typealias ContainerArgument = String

typealias ContainerArguments = Array<ContainerArgument>

typealias ContainerDefinitionList = Array<ContainerDefinition>

typealias ContainerEntrypoint = Array<ContainerEntrypointString>

typealias ContainerEntrypointString = String

typealias ContainerHostname = String

typealias ContentClassifiers = Array<String /* "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent" | String */>

typealias ContentType = String

typealias ContentTypes = Array<ContentType>

typealias ContinuousParameterRanges = Array<ContinuousParameterRange>

typealias CreationTime = Date

typealias CsvContentType = String

typealias CsvContentTypes = Array<CsvContentType>

typealias DataExplorationNotebookLocation = String

typealias DataInputConfig = String

typealias DebugRuleConfigurations = Array<DebugRuleConfiguration>

typealias DebugRuleEvaluationStatuses = Array<DebugRuleEvaluationStatus>

typealias DeployedImages = Array<DeployedImage>

typealias DesiredWeightAndCapacityList = Array<DesiredWeightAndCapacity>

typealias DestinationS3Uri = String

typealias DirectoryPath = String

typealias DisassociateAdditionalCodeRepositories = Boolean

typealias DisassociateDefaultCodeRepository = Boolean

typealias DisassociateNotebookInstanceAcceleratorTypes = Boolean

typealias DisassociateNotebookInstanceLifecycleConfig = Boolean

typealias Dollars = Number

typealias DomainArn = String

typealias DomainId = String

typealias DomainList = Array<DomainDetails>

typealias DomainName = String

typealias DoubleParameterValue = Number

typealias EfsUid = String

typealias EnableCapture = Boolean

typealias EndpointArn = String

typealias EndpointConfigArn = String

typealias EndpointConfigName = String

typealias EndpointConfigNameContains = String

typealias EndpointConfigSummaryList = Array<EndpointConfigSummary>

typealias EndpointName = String

typealias EndpointNameContains = String

typealias EndpointSummaryList = Array<EndpointSummary>

typealias EntityDescription = String

typealias EntityName = String

typealias EnvironmentArn = String

typealias EnvironmentKey = String

typealias EnvironmentValue = String

typealias ExitMessage = String

typealias ExperimentArn = String

typealias ExperimentDescription = String

typealias ExperimentEntityName = String

typealias ExperimentSourceArn = String

typealias ExperimentSummaries = Array<ExperimentSummary>

typealias FailureReason = String

typealias FileSystemId = String

typealias FilterList = Array<Filter>

typealias FilterValue = String

typealias FinalMetricDataList = Array<MetricData>

typealias Float = Number

typealias FlowDefinitionArn = String

typealias FlowDefinitionName = String

typealias FlowDefinitionSummaries = Array<FlowDefinitionSummary>

typealias FlowDefinitionTaskAvailabilityLifetimeInSeconds = Number

typealias FlowDefinitionTaskCount = Number

typealias FlowDefinitionTaskDescription = String

typealias FlowDefinitionTaskKeyword = String

typealias FlowDefinitionTaskKeywords = Array<FlowDefinitionTaskKeyword>

typealias FlowDefinitionTaskTimeLimitInSeconds = Number

typealias FlowDefinitionTaskTitle = String

typealias GenerateCandidateDefinitionsOnly = Boolean

typealias GitConfigUrl = String

typealias HumanLoopActivationConditions = String

typealias HumanTaskUiArn = String

typealias HumanTaskUiName = String

typealias HumanTaskUiSummaries = Array<HumanTaskUiSummary>

typealias HyperParameterSpecifications = Array<HyperParameterSpecification>

typealias HyperParameterTrainingJobDefinitionName = String

typealias HyperParameterTrainingJobDefinitions = Array<HyperParameterTrainingJobDefinition>

typealias HyperParameterTrainingJobSummaries = Array<HyperParameterTrainingJobSummary>

typealias HyperParameterTuningJobArn = String

typealias HyperParameterTuningJobName = String

typealias HyperParameterTuningJobObjectives = Array<HyperParameterTuningJobObjective>

typealias HyperParameterTuningJobSummaries = Array<HyperParameterTuningJobSummary>

typealias Image = String

typealias ImageDigest = String

typealias ImageUri = String

typealias InputDataConfig = Array<Channel>

typealias InputModes = Array<String /* "Pipe" | "File" | String */>

typealias IntegerParameterRanges = Array<IntegerParameterRange>

typealias JobReferenceCode = String

typealias JobReferenceCodeContains = String

typealias JsonContentType = String

typealias JsonContentTypes = Array<JsonContentType>

typealias JsonPath = String

typealias KmsKeyId = String

typealias LabelAttributeName = String

typealias LabelCounter = Number

typealias LabelingJobAlgorithmSpecificationArn = String

typealias LabelingJobArn = String

typealias LabelingJobForWorkteamSummaryList = Array<LabelingJobForWorkteamSummary>

typealias LabelingJobName = String

typealias LabelingJobSummaryList = Array<LabelingJobSummary>

typealias LambdaFunctionArn = String

typealias LastModifiedTime = Date

typealias ListTagsMaxResults = Number

typealias ListTrialComponentKey256 = Array<TrialComponentKey256>

typealias MaxAutoMLJobRuntimeInSeconds = Number

typealias MaxCandidates = Number

typealias MaxConcurrentTaskCount = Number

typealias MaxConcurrentTransforms = Number

typealias MaxHumanLabeledObjectCount = Number

typealias MaxNumberOfTrainingJobs = Number

typealias MaxParallelTrainingJobs = Number

typealias MaxPayloadInMB = Number

typealias MaxPercentageOfInputDatasetLabeled = Number

typealias MaxResults = Number

typealias MaxRuntimeInSeconds = Number

typealias MaxRuntimePerTrainingJobInSeconds = Number

typealias MaxWaitTimeInSeconds = Number

typealias MediaType = String

typealias MemberDefinitions = Array<MemberDefinition>

typealias MetricDefinitionList = Array<MetricDefinition>

typealias MetricName = String

typealias MetricRegex = String

typealias MetricValue = Number

typealias ModelArn = String

typealias ModelName = String

typealias ModelNameContains = String

typealias ModelPackageArn = String

typealias ModelPackageContainerDefinitionList = Array<ModelPackageContainerDefinition>

typealias ModelPackageStatusItemList = Array<ModelPackageStatusItem>

typealias ModelPackageSummaryList = Array<ModelPackageSummary>

typealias ModelPackageValidationProfiles = Array<ModelPackageValidationProfile>

typealias ModelSummaryList = Array<ModelSummary>

typealias MonitoringContainerArguments = Array<ContainerArgument>

typealias MonitoringExecutionSummaryList = Array<MonitoringExecutionSummary>

typealias MonitoringInputs = Array<MonitoringInput>

typealias MonitoringMaxRuntimeInSeconds = Number

typealias MonitoringOutputs = Array<MonitoringOutput>

typealias MonitoringS3Uri = String

typealias MonitoringScheduleArn = String

typealias MonitoringScheduleName = String

typealias MonitoringScheduleSummaryList = Array<MonitoringScheduleSummary>

typealias NameContains = String

typealias NestedFiltersList = Array<NestedFilters>

typealias NetworkInterfaceId = String

typealias NextToken = String

typealias NotebookInstanceAcceleratorTypes = Array<String /* "ml.eia1.medium" | "ml.eia1.large" | "ml.eia1.xlarge" | "ml.eia2.medium" | "ml.eia2.large" | "ml.eia2.xlarge" | String */>

typealias NotebookInstanceArn = String

typealias NotebookInstanceLifecycleConfigArn = String

typealias NotebookInstanceLifecycleConfigContent = String

typealias NotebookInstanceLifecycleConfigList = Array<NotebookInstanceLifecycleHook>

typealias NotebookInstanceLifecycleConfigName = String

typealias NotebookInstanceLifecycleConfigNameContains = String

typealias NotebookInstanceLifecycleConfigSummaryList = Array<NotebookInstanceLifecycleConfigSummary>

typealias NotebookInstanceName = String

typealias NotebookInstanceNameContains = String

typealias NotebookInstanceSummaryList = Array<NotebookInstanceSummary>

typealias NotebookInstanceUrl = String

typealias NotebookInstanceVolumeSizeInGB = Number

typealias NotificationTopicArn = String

typealias NumberOfHumanWorkersPerDataObject = Number

typealias ObjectiveStatusCounter = Number

typealias OptionalDouble = Number

typealias OptionalInteger = Number

typealias OptionalVolumeSizeInGB = Number

typealias PaginationToken = String

typealias ParameterKey = String

typealias ParameterName = String

typealias ParameterValue = String

typealias ParameterValues = Array<ParameterValue>

typealias ParentHyperParameterTuningJobs = Array<ParentHyperParameterTuningJob>

typealias Parents = Array<Parent>

typealias PresignedDomainUrl = String

typealias ProcessingEnvironmentKey = String

typealias ProcessingEnvironmentValue = String

typealias ProcessingInputs = Array<ProcessingInput>

typealias ProcessingInstanceCount = Number

typealias ProcessingJobArn = String

typealias ProcessingJobName = String

typealias ProcessingJobSummaries = Array<ProcessingJobSummary>

typealias ProcessingLocalPath = String

typealias ProcessingMaxRuntimeInSeconds = Number

typealias ProcessingOutputs = Array<ProcessingOutput>

typealias ProcessingVolumeSizeInGB = Number

typealias ProductId = String

typealias ProductListings = Array<String>

typealias ProductionVariantList = Array<ProductionVariant>

typealias ProductionVariantSummaryList = Array<ProductionVariantSummary>

typealias PropertyNameHint = String

typealias PropertyNameSuggestionList = Array<PropertyNameSuggestion>

typealias RealtimeInferenceInstanceTypes = Array<String /* "ml.t2.medium" | "ml.t2.large" | "ml.t2.xlarge" | "ml.t2.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.m5d.large" | "ml.m5d.xlarge" | "ml.m5d.2xlarge" | "ml.m5d.4xlarge" | "ml.m5d.12xlarge" | "ml.m5d.24xlarge" | "ml.c4.large" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.large" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5d.large" | "ml.c5d.xlarge" | "ml.c5d.2xlarge" | "ml.c5d.4xlarge" | "ml.c5d.9xlarge" | "ml.c5d.18xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | "ml.r5.large" | "ml.r5.xlarge" | "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.12xlarge" | "ml.r5.24xlarge" | "ml.r5d.large" | "ml.r5d.xlarge" | "ml.r5d.2xlarge" | "ml.r5d.4xlarge" | "ml.r5d.12xlarge" | "ml.r5d.24xlarge" | "ml.inf1.xlarge" | "ml.inf1.2xlarge" | "ml.inf1.6xlarge" | "ml.inf1.24xlarge" | String */>

typealias RenderingErrorList = Array<RenderingError>

typealias ResourceArn = String

typealias ResourceId = String

typealias ResourcePropertyName = String

typealias ResponseMIMEType = String

typealias ResponseMIMETypes = Array<ResponseMIMEType>

typealias RoleArn = String

typealias RuleConfigurationName = String

typealias S3Uri = String

typealias SamplingPercentage = Number

typealias ScheduleExpression = String

typealias SearchExpressionList = Array<SearchExpression>

typealias SearchResultsList = Array<SearchRecord>

typealias SecondaryStatusTransitions = Array<SecondaryStatusTransition>

typealias SecretArn = String

typealias SecurityGroupId = String

typealias SecurityGroupIds = Array<SecurityGroupId>

typealias Seed = Number

typealias SessionExpirationDurationInSeconds = Number

typealias SingleSignOnUserIdentifier = String

typealias SourceAlgorithmList = Array<SourceAlgorithm>

typealias SourceType = String

typealias StatusDetails = String

typealias StatusMessage = String

typealias String = String

typealias String1024 = String

typealias String200 = String

typealias String256 = String

typealias StringParameterValue = String

typealias SubnetId = String

typealias Subnets = Array<SubnetId>

typealias SubscribedWorkteams = Array<SubscribedWorkteam>

typealias Success = Boolean

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TargetAttributeName = String

typealias TargetObjectiveMetricValue = Number

typealias TaskAvailabilityLifetimeInSeconds = Number

typealias TaskCount = Number

typealias TaskDescription = String

typealias TaskInput = String

typealias TaskKeyword = String

typealias TaskKeywords = Array<TaskKeyword>

typealias TaskTimeLimitInSeconds = Number

typealias TaskTitle = String

typealias TemplateContent = String

typealias TemplateContentSha256 = String

typealias TemplateUrl = String

typealias TenthFractionsOfACent = Number

typealias Timestamp = Date

typealias TrainingInstanceCount = Number

typealias TrainingInstanceTypes = Array<String /* "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.p3dn.24xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | String */>

typealias TrainingJobArn = String

typealias TrainingJobName = String

typealias TrainingJobStatusCounter = Number

typealias TrainingJobSummaries = Array<TrainingJobSummary>

typealias TrainingTimeInSeconds = Number

typealias TransformEnvironmentKey = String

typealias TransformEnvironmentValue = String

typealias TransformInstanceCount = Number

typealias TransformInstanceTypes = Array<String /* "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | String */>

typealias TransformJobArn = String

typealias TransformJobName = String

typealias TransformJobSummaries = Array<TransformJobSummary>

typealias TrialArn = String

typealias TrialComponentArn = String

typealias TrialComponentArtifactValue = String

typealias TrialComponentKey256 = String

typealias TrialComponentKey64 = String

typealias TrialComponentMetricSummaries = Array<TrialComponentMetricSummary>

typealias TrialComponentSimpleSummaries = Array<TrialComponentSimpleSummary>

typealias TrialComponentSourceArn = String

typealias TrialComponentStatusMessage = String

typealias TrialComponentSummaries = Array<TrialComponentSummary>

typealias TrialSourceArn = String

typealias TrialSummaries = Array<TrialSummary>

typealias Url = String

typealias UserProfileArn = String

typealias UserProfileList = Array<UserProfileDetails>

typealias UserProfileName = String

typealias VariantName = String

typealias VariantPropertyList = Array<VariantProperty>

typealias VariantWeight = Number

typealias VolumeSizeInGB = Number

typealias VpcId = String

typealias VpcSecurityGroupIds = Array<SecurityGroupId>

typealias WorkforceArn = String

typealias WorkforceName = String

typealias WorkteamArn = String

typealias WorkteamName = String

typealias Workteams = Array<Workteam>

@JsModule("aws-sdk")
external open class SageMaker(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SageMaker.Types.ClientConfiguration */
    open fun addTags(params: AddTagsInput, callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun addTags(callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun associateTrialComponent(params: AssociateTrialComponentRequest, callback: (err: AWSError, data: AssociateTrialComponentResponse) -> Unit = definedExternally): Request<AssociateTrialComponentResponse, AWSError>
    open fun associateTrialComponent(callback: (err: AWSError, data: AssociateTrialComponentResponse) -> Unit = definedExternally): Request<AssociateTrialComponentResponse, AWSError>
    open fun createAlgorithm(params: CreateAlgorithmInput, callback: (err: AWSError, data: CreateAlgorithmOutput) -> Unit = definedExternally): Request<CreateAlgorithmOutput, AWSError>
    open fun createAlgorithm(callback: (err: AWSError, data: CreateAlgorithmOutput) -> Unit = definedExternally): Request<CreateAlgorithmOutput, AWSError>
    open fun createApp(params: CreateAppRequest, callback: (err: AWSError, data: CreateAppResponse) -> Unit = definedExternally): Request<CreateAppResponse, AWSError>
    open fun createApp(callback: (err: AWSError, data: CreateAppResponse) -> Unit = definedExternally): Request<CreateAppResponse, AWSError>
    open fun createAutoMLJob(params: CreateAutoMLJobRequest, callback: (err: AWSError, data: CreateAutoMLJobResponse) -> Unit = definedExternally): Request<CreateAutoMLJobResponse, AWSError>
    open fun createAutoMLJob(callback: (err: AWSError, data: CreateAutoMLJobResponse) -> Unit = definedExternally): Request<CreateAutoMLJobResponse, AWSError>
    open fun createCodeRepository(params: CreateCodeRepositoryInput, callback: (err: AWSError, data: CreateCodeRepositoryOutput) -> Unit = definedExternally): Request<CreateCodeRepositoryOutput, AWSError>
    open fun createCodeRepository(callback: (err: AWSError, data: CreateCodeRepositoryOutput) -> Unit = definedExternally): Request<CreateCodeRepositoryOutput, AWSError>
    open fun createCompilationJob(params: CreateCompilationJobRequest, callback: (err: AWSError, data: CreateCompilationJobResponse) -> Unit = definedExternally): Request<CreateCompilationJobResponse, AWSError>
    open fun createCompilationJob(callback: (err: AWSError, data: CreateCompilationJobResponse) -> Unit = definedExternally): Request<CreateCompilationJobResponse, AWSError>
    open fun createDomain(params: CreateDomainRequest, callback: (err: AWSError, data: CreateDomainResponse) -> Unit = definedExternally): Request<CreateDomainResponse, AWSError>
    open fun createDomain(callback: (err: AWSError, data: CreateDomainResponse) -> Unit = definedExternally): Request<CreateDomainResponse, AWSError>
    open fun createEndpoint(params: CreateEndpointInput, callback: (err: AWSError, data: CreateEndpointOutput) -> Unit = definedExternally): Request<CreateEndpointOutput, AWSError>
    open fun createEndpoint(callback: (err: AWSError, data: CreateEndpointOutput) -> Unit = definedExternally): Request<CreateEndpointOutput, AWSError>
    open fun createEndpointConfig(params: CreateEndpointConfigInput, callback: (err: AWSError, data: CreateEndpointConfigOutput) -> Unit = definedExternally): Request<CreateEndpointConfigOutput, AWSError>
    open fun createEndpointConfig(callback: (err: AWSError, data: CreateEndpointConfigOutput) -> Unit = definedExternally): Request<CreateEndpointConfigOutput, AWSError>
    open fun createExperiment(params: CreateExperimentRequest, callback: (err: AWSError, data: CreateExperimentResponse) -> Unit = definedExternally): Request<CreateExperimentResponse, AWSError>
    open fun createExperiment(callback: (err: AWSError, data: CreateExperimentResponse) -> Unit = definedExternally): Request<CreateExperimentResponse, AWSError>
    open fun createFlowDefinition(params: CreateFlowDefinitionRequest, callback: (err: AWSError, data: CreateFlowDefinitionResponse) -> Unit = definedExternally): Request<CreateFlowDefinitionResponse, AWSError>
    open fun createFlowDefinition(callback: (err: AWSError, data: CreateFlowDefinitionResponse) -> Unit = definedExternally): Request<CreateFlowDefinitionResponse, AWSError>
    open fun createHumanTaskUi(params: CreateHumanTaskUiRequest, callback: (err: AWSError, data: CreateHumanTaskUiResponse) -> Unit = definedExternally): Request<CreateHumanTaskUiResponse, AWSError>
    open fun createHumanTaskUi(callback: (err: AWSError, data: CreateHumanTaskUiResponse) -> Unit = definedExternally): Request<CreateHumanTaskUiResponse, AWSError>
    open fun createHyperParameterTuningJob(params: CreateHyperParameterTuningJobRequest, callback: (err: AWSError, data: CreateHyperParameterTuningJobResponse) -> Unit = definedExternally): Request<CreateHyperParameterTuningJobResponse, AWSError>
    open fun createHyperParameterTuningJob(callback: (err: AWSError, data: CreateHyperParameterTuningJobResponse) -> Unit = definedExternally): Request<CreateHyperParameterTuningJobResponse, AWSError>
    open fun createLabelingJob(params: CreateLabelingJobRequest, callback: (err: AWSError, data: CreateLabelingJobResponse) -> Unit = definedExternally): Request<CreateLabelingJobResponse, AWSError>
    open fun createLabelingJob(callback: (err: AWSError, data: CreateLabelingJobResponse) -> Unit = definedExternally): Request<CreateLabelingJobResponse, AWSError>
    open fun createModel(params: CreateModelInput, callback: (err: AWSError, data: CreateModelOutput) -> Unit = definedExternally): Request<CreateModelOutput, AWSError>
    open fun createModel(callback: (err: AWSError, data: CreateModelOutput) -> Unit = definedExternally): Request<CreateModelOutput, AWSError>
    open fun createModelPackage(params: CreateModelPackageInput, callback: (err: AWSError, data: CreateModelPackageOutput) -> Unit = definedExternally): Request<CreateModelPackageOutput, AWSError>
    open fun createModelPackage(callback: (err: AWSError, data: CreateModelPackageOutput) -> Unit = definedExternally): Request<CreateModelPackageOutput, AWSError>
    open fun createMonitoringSchedule(params: CreateMonitoringScheduleRequest, callback: (err: AWSError, data: CreateMonitoringScheduleResponse) -> Unit = definedExternally): Request<CreateMonitoringScheduleResponse, AWSError>
    open fun createMonitoringSchedule(callback: (err: AWSError, data: CreateMonitoringScheduleResponse) -> Unit = definedExternally): Request<CreateMonitoringScheduleResponse, AWSError>
    open fun createNotebookInstance(params: CreateNotebookInstanceInput, callback: (err: AWSError, data: CreateNotebookInstanceOutput) -> Unit = definedExternally): Request<CreateNotebookInstanceOutput, AWSError>
    open fun createNotebookInstance(callback: (err: AWSError, data: CreateNotebookInstanceOutput) -> Unit = definedExternally): Request<CreateNotebookInstanceOutput, AWSError>
    open fun createNotebookInstanceLifecycleConfig(params: CreateNotebookInstanceLifecycleConfigInput, callback: (err: AWSError, data: CreateNotebookInstanceLifecycleConfigOutput) -> Unit = definedExternally): Request<CreateNotebookInstanceLifecycleConfigOutput, AWSError>
    open fun createNotebookInstanceLifecycleConfig(callback: (err: AWSError, data: CreateNotebookInstanceLifecycleConfigOutput) -> Unit = definedExternally): Request<CreateNotebookInstanceLifecycleConfigOutput, AWSError>
    open fun createPresignedDomainUrl(params: CreatePresignedDomainUrlRequest, callback: (err: AWSError, data: CreatePresignedDomainUrlResponse) -> Unit = definedExternally): Request<CreatePresignedDomainUrlResponse, AWSError>
    open fun createPresignedDomainUrl(callback: (err: AWSError, data: CreatePresignedDomainUrlResponse) -> Unit = definedExternally): Request<CreatePresignedDomainUrlResponse, AWSError>
    open fun createPresignedNotebookInstanceUrl(params: CreatePresignedNotebookInstanceUrlInput, callback: (err: AWSError, data: CreatePresignedNotebookInstanceUrlOutput) -> Unit = definedExternally): Request<CreatePresignedNotebookInstanceUrlOutput, AWSError>
    open fun createPresignedNotebookInstanceUrl(callback: (err: AWSError, data: CreatePresignedNotebookInstanceUrlOutput) -> Unit = definedExternally): Request<CreatePresignedNotebookInstanceUrlOutput, AWSError>
    open fun createProcessingJob(params: CreateProcessingJobRequest, callback: (err: AWSError, data: CreateProcessingJobResponse) -> Unit = definedExternally): Request<CreateProcessingJobResponse, AWSError>
    open fun createProcessingJob(callback: (err: AWSError, data: CreateProcessingJobResponse) -> Unit = definedExternally): Request<CreateProcessingJobResponse, AWSError>
    open fun createTrainingJob(params: CreateTrainingJobRequest, callback: (err: AWSError, data: CreateTrainingJobResponse) -> Unit = definedExternally): Request<CreateTrainingJobResponse, AWSError>
    open fun createTrainingJob(callback: (err: AWSError, data: CreateTrainingJobResponse) -> Unit = definedExternally): Request<CreateTrainingJobResponse, AWSError>
    open fun createTransformJob(params: CreateTransformJobRequest, callback: (err: AWSError, data: CreateTransformJobResponse) -> Unit = definedExternally): Request<CreateTransformJobResponse, AWSError>
    open fun createTransformJob(callback: (err: AWSError, data: CreateTransformJobResponse) -> Unit = definedExternally): Request<CreateTransformJobResponse, AWSError>
    open fun createTrial(params: CreateTrialRequest, callback: (err: AWSError, data: CreateTrialResponse) -> Unit = definedExternally): Request<CreateTrialResponse, AWSError>
    open fun createTrial(callback: (err: AWSError, data: CreateTrialResponse) -> Unit = definedExternally): Request<CreateTrialResponse, AWSError>
    open fun createTrialComponent(params: CreateTrialComponentRequest, callback: (err: AWSError, data: CreateTrialComponentResponse) -> Unit = definedExternally): Request<CreateTrialComponentResponse, AWSError>
    open fun createTrialComponent(callback: (err: AWSError, data: CreateTrialComponentResponse) -> Unit = definedExternally): Request<CreateTrialComponentResponse, AWSError>
    open fun createUserProfile(params: CreateUserProfileRequest, callback: (err: AWSError, data: CreateUserProfileResponse) -> Unit = definedExternally): Request<CreateUserProfileResponse, AWSError>
    open fun createUserProfile(callback: (err: AWSError, data: CreateUserProfileResponse) -> Unit = definedExternally): Request<CreateUserProfileResponse, AWSError>
    open fun createWorkteam(params: CreateWorkteamRequest, callback: (err: AWSError, data: CreateWorkteamResponse) -> Unit = definedExternally): Request<CreateWorkteamResponse, AWSError>
    open fun createWorkteam(callback: (err: AWSError, data: CreateWorkteamResponse) -> Unit = definedExternally): Request<CreateWorkteamResponse, AWSError>
    open fun deleteAlgorithm(params: DeleteAlgorithmInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAlgorithm(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApp(params: DeleteAppRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteApp(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCodeRepository(params: DeleteCodeRepositoryInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCodeRepository(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDomain(params: DeleteDomainRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDomain(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEndpoint(params: DeleteEndpointInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEndpoint(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEndpointConfig(params: DeleteEndpointConfigInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEndpointConfig(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteExperiment(params: DeleteExperimentRequest, callback: (err: AWSError, data: DeleteExperimentResponse) -> Unit = definedExternally): Request<DeleteExperimentResponse, AWSError>
    open fun deleteExperiment(callback: (err: AWSError, data: DeleteExperimentResponse) -> Unit = definedExternally): Request<DeleteExperimentResponse, AWSError>
    open fun deleteFlowDefinition(params: DeleteFlowDefinitionRequest, callback: (err: AWSError, data: DeleteFlowDefinitionResponse) -> Unit = definedExternally): Request<DeleteFlowDefinitionResponse, AWSError>
    open fun deleteFlowDefinition(callback: (err: AWSError, data: DeleteFlowDefinitionResponse) -> Unit = definedExternally): Request<DeleteFlowDefinitionResponse, AWSError>
    open fun deleteModel(params: DeleteModelInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteModel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteModelPackage(params: DeleteModelPackageInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteModelPackage(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMonitoringSchedule(params: DeleteMonitoringScheduleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMonitoringSchedule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteNotebookInstance(params: DeleteNotebookInstanceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteNotebookInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteNotebookInstanceLifecycleConfig(params: DeleteNotebookInstanceLifecycleConfigInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteNotebookInstanceLifecycleConfig(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTags(params: DeleteTagsInput, callback: (err: AWSError, data: DeleteTagsOutput) -> Unit = definedExternally): Request<DeleteTagsOutput, AWSError>
    open fun deleteTags(callback: (err: AWSError, data: DeleteTagsOutput) -> Unit = definedExternally): Request<DeleteTagsOutput, AWSError>
    open fun deleteTrial(params: DeleteTrialRequest, callback: (err: AWSError, data: DeleteTrialResponse) -> Unit = definedExternally): Request<DeleteTrialResponse, AWSError>
    open fun deleteTrial(callback: (err: AWSError, data: DeleteTrialResponse) -> Unit = definedExternally): Request<DeleteTrialResponse, AWSError>
    open fun deleteTrialComponent(params: DeleteTrialComponentRequest, callback: (err: AWSError, data: DeleteTrialComponentResponse) -> Unit = definedExternally): Request<DeleteTrialComponentResponse, AWSError>
    open fun deleteTrialComponent(callback: (err: AWSError, data: DeleteTrialComponentResponse) -> Unit = definedExternally): Request<DeleteTrialComponentResponse, AWSError>
    open fun deleteUserProfile(params: DeleteUserProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteWorkteam(params: DeleteWorkteamRequest, callback: (err: AWSError, data: DeleteWorkteamResponse) -> Unit = definedExternally): Request<DeleteWorkteamResponse, AWSError>
    open fun deleteWorkteam(callback: (err: AWSError, data: DeleteWorkteamResponse) -> Unit = definedExternally): Request<DeleteWorkteamResponse, AWSError>
    open fun describeAlgorithm(params: DescribeAlgorithmInput, callback: (err: AWSError, data: DescribeAlgorithmOutput) -> Unit = definedExternally): Request<DescribeAlgorithmOutput, AWSError>
    open fun describeAlgorithm(callback: (err: AWSError, data: DescribeAlgorithmOutput) -> Unit = definedExternally): Request<DescribeAlgorithmOutput, AWSError>
    open fun describeApp(params: DescribeAppRequest, callback: (err: AWSError, data: DescribeAppResponse) -> Unit = definedExternally): Request<DescribeAppResponse, AWSError>
    open fun describeApp(callback: (err: AWSError, data: DescribeAppResponse) -> Unit = definedExternally): Request<DescribeAppResponse, AWSError>
    open fun describeAutoMLJob(params: DescribeAutoMLJobRequest, callback: (err: AWSError, data: DescribeAutoMLJobResponse) -> Unit = definedExternally): Request<DescribeAutoMLJobResponse, AWSError>
    open fun describeAutoMLJob(callback: (err: AWSError, data: DescribeAutoMLJobResponse) -> Unit = definedExternally): Request<DescribeAutoMLJobResponse, AWSError>
    open fun describeCodeRepository(params: DescribeCodeRepositoryInput, callback: (err: AWSError, data: DescribeCodeRepositoryOutput) -> Unit = definedExternally): Request<DescribeCodeRepositoryOutput, AWSError>
    open fun describeCodeRepository(callback: (err: AWSError, data: DescribeCodeRepositoryOutput) -> Unit = definedExternally): Request<DescribeCodeRepositoryOutput, AWSError>
    open fun describeCompilationJob(params: DescribeCompilationJobRequest, callback: (err: AWSError, data: DescribeCompilationJobResponse) -> Unit = definedExternally): Request<DescribeCompilationJobResponse, AWSError>
    open fun describeCompilationJob(callback: (err: AWSError, data: DescribeCompilationJobResponse) -> Unit = definedExternally): Request<DescribeCompilationJobResponse, AWSError>
    open fun describeDomain(params: DescribeDomainRequest, callback: (err: AWSError, data: DescribeDomainResponse) -> Unit = definedExternally): Request<DescribeDomainResponse, AWSError>
    open fun describeDomain(callback: (err: AWSError, data: DescribeDomainResponse) -> Unit = definedExternally): Request<DescribeDomainResponse, AWSError>
    open fun describeEndpoint(params: DescribeEndpointInput, callback: (err: AWSError, data: DescribeEndpointOutput) -> Unit = definedExternally): Request<DescribeEndpointOutput, AWSError>
    open fun describeEndpoint(callback: (err: AWSError, data: DescribeEndpointOutput) -> Unit = definedExternally): Request<DescribeEndpointOutput, AWSError>
    open fun describeEndpointConfig(params: DescribeEndpointConfigInput, callback: (err: AWSError, data: DescribeEndpointConfigOutput) -> Unit = definedExternally): Request<DescribeEndpointConfigOutput, AWSError>
    open fun describeEndpointConfig(callback: (err: AWSError, data: DescribeEndpointConfigOutput) -> Unit = definedExternally): Request<DescribeEndpointConfigOutput, AWSError>
    open fun describeExperiment(params: DescribeExperimentRequest, callback: (err: AWSError, data: DescribeExperimentResponse) -> Unit = definedExternally): Request<DescribeExperimentResponse, AWSError>
    open fun describeExperiment(callback: (err: AWSError, data: DescribeExperimentResponse) -> Unit = definedExternally): Request<DescribeExperimentResponse, AWSError>
    open fun describeFlowDefinition(params: DescribeFlowDefinitionRequest, callback: (err: AWSError, data: DescribeFlowDefinitionResponse) -> Unit = definedExternally): Request<DescribeFlowDefinitionResponse, AWSError>
    open fun describeFlowDefinition(callback: (err: AWSError, data: DescribeFlowDefinitionResponse) -> Unit = definedExternally): Request<DescribeFlowDefinitionResponse, AWSError>
    open fun describeHumanTaskUi(params: DescribeHumanTaskUiRequest, callback: (err: AWSError, data: DescribeHumanTaskUiResponse) -> Unit = definedExternally): Request<DescribeHumanTaskUiResponse, AWSError>
    open fun describeHumanTaskUi(callback: (err: AWSError, data: DescribeHumanTaskUiResponse) -> Unit = definedExternally): Request<DescribeHumanTaskUiResponse, AWSError>
    open fun describeHyperParameterTuningJob(params: DescribeHyperParameterTuningJobRequest, callback: (err: AWSError, data: DescribeHyperParameterTuningJobResponse) -> Unit = definedExternally): Request<DescribeHyperParameterTuningJobResponse, AWSError>
    open fun describeHyperParameterTuningJob(callback: (err: AWSError, data: DescribeHyperParameterTuningJobResponse) -> Unit = definedExternally): Request<DescribeHyperParameterTuningJobResponse, AWSError>
    open fun describeLabelingJob(params: DescribeLabelingJobRequest, callback: (err: AWSError, data: DescribeLabelingJobResponse) -> Unit = definedExternally): Request<DescribeLabelingJobResponse, AWSError>
    open fun describeLabelingJob(callback: (err: AWSError, data: DescribeLabelingJobResponse) -> Unit = definedExternally): Request<DescribeLabelingJobResponse, AWSError>
    open fun describeModel(params: DescribeModelInput, callback: (err: AWSError, data: DescribeModelOutput) -> Unit = definedExternally): Request<DescribeModelOutput, AWSError>
    open fun describeModel(callback: (err: AWSError, data: DescribeModelOutput) -> Unit = definedExternally): Request<DescribeModelOutput, AWSError>
    open fun describeModelPackage(params: DescribeModelPackageInput, callback: (err: AWSError, data: DescribeModelPackageOutput) -> Unit = definedExternally): Request<DescribeModelPackageOutput, AWSError>
    open fun describeModelPackage(callback: (err: AWSError, data: DescribeModelPackageOutput) -> Unit = definedExternally): Request<DescribeModelPackageOutput, AWSError>
    open fun describeMonitoringSchedule(params: DescribeMonitoringScheduleRequest, callback: (err: AWSError, data: DescribeMonitoringScheduleResponse) -> Unit = definedExternally): Request<DescribeMonitoringScheduleResponse, AWSError>
    open fun describeMonitoringSchedule(callback: (err: AWSError, data: DescribeMonitoringScheduleResponse) -> Unit = definedExternally): Request<DescribeMonitoringScheduleResponse, AWSError>
    open fun describeNotebookInstance(params: DescribeNotebookInstanceInput, callback: (err: AWSError, data: DescribeNotebookInstanceOutput) -> Unit = definedExternally): Request<DescribeNotebookInstanceOutput, AWSError>
    open fun describeNotebookInstance(callback: (err: AWSError, data: DescribeNotebookInstanceOutput) -> Unit = definedExternally): Request<DescribeNotebookInstanceOutput, AWSError>
    open fun describeNotebookInstanceLifecycleConfig(params: DescribeNotebookInstanceLifecycleConfigInput, callback: (err: AWSError, data: DescribeNotebookInstanceLifecycleConfigOutput) -> Unit = definedExternally): Request<DescribeNotebookInstanceLifecycleConfigOutput, AWSError>
    open fun describeNotebookInstanceLifecycleConfig(callback: (err: AWSError, data: DescribeNotebookInstanceLifecycleConfigOutput) -> Unit = definedExternally): Request<DescribeNotebookInstanceLifecycleConfigOutput, AWSError>
    open fun describeProcessingJob(params: DescribeProcessingJobRequest, callback: (err: AWSError, data: DescribeProcessingJobResponse) -> Unit = definedExternally): Request<DescribeProcessingJobResponse, AWSError>
    open fun describeProcessingJob(callback: (err: AWSError, data: DescribeProcessingJobResponse) -> Unit = definedExternally): Request<DescribeProcessingJobResponse, AWSError>
    open fun describeSubscribedWorkteam(params: DescribeSubscribedWorkteamRequest, callback: (err: AWSError, data: DescribeSubscribedWorkteamResponse) -> Unit = definedExternally): Request<DescribeSubscribedWorkteamResponse, AWSError>
    open fun describeSubscribedWorkteam(callback: (err: AWSError, data: DescribeSubscribedWorkteamResponse) -> Unit = definedExternally): Request<DescribeSubscribedWorkteamResponse, AWSError>
    open fun describeTrainingJob(params: DescribeTrainingJobRequest, callback: (err: AWSError, data: DescribeTrainingJobResponse) -> Unit = definedExternally): Request<DescribeTrainingJobResponse, AWSError>
    open fun describeTrainingJob(callback: (err: AWSError, data: DescribeTrainingJobResponse) -> Unit = definedExternally): Request<DescribeTrainingJobResponse, AWSError>
    open fun describeTransformJob(params: DescribeTransformJobRequest, callback: (err: AWSError, data: DescribeTransformJobResponse) -> Unit = definedExternally): Request<DescribeTransformJobResponse, AWSError>
    open fun describeTransformJob(callback: (err: AWSError, data: DescribeTransformJobResponse) -> Unit = definedExternally): Request<DescribeTransformJobResponse, AWSError>
    open fun describeTrial(params: DescribeTrialRequest, callback: (err: AWSError, data: DescribeTrialResponse) -> Unit = definedExternally): Request<DescribeTrialResponse, AWSError>
    open fun describeTrial(callback: (err: AWSError, data: DescribeTrialResponse) -> Unit = definedExternally): Request<DescribeTrialResponse, AWSError>
    open fun describeTrialComponent(params: DescribeTrialComponentRequest, callback: (err: AWSError, data: DescribeTrialComponentResponse) -> Unit = definedExternally): Request<DescribeTrialComponentResponse, AWSError>
    open fun describeTrialComponent(callback: (err: AWSError, data: DescribeTrialComponentResponse) -> Unit = definedExternally): Request<DescribeTrialComponentResponse, AWSError>
    open fun describeUserProfile(params: DescribeUserProfileRequest, callback: (err: AWSError, data: DescribeUserProfileResponse) -> Unit = definedExternally): Request<DescribeUserProfileResponse, AWSError>
    open fun describeUserProfile(callback: (err: AWSError, data: DescribeUserProfileResponse) -> Unit = definedExternally): Request<DescribeUserProfileResponse, AWSError>
    open fun describeWorkforce(params: DescribeWorkforceRequest, callback: (err: AWSError, data: DescribeWorkforceResponse) -> Unit = definedExternally): Request<DescribeWorkforceResponse, AWSError>
    open fun describeWorkforce(callback: (err: AWSError, data: DescribeWorkforceResponse) -> Unit = definedExternally): Request<DescribeWorkforceResponse, AWSError>
    open fun describeWorkteam(params: DescribeWorkteamRequest, callback: (err: AWSError, data: DescribeWorkteamResponse) -> Unit = definedExternally): Request<DescribeWorkteamResponse, AWSError>
    open fun describeWorkteam(callback: (err: AWSError, data: DescribeWorkteamResponse) -> Unit = definedExternally): Request<DescribeWorkteamResponse, AWSError>
    open fun disassociateTrialComponent(params: DisassociateTrialComponentRequest, callback: (err: AWSError, data: DisassociateTrialComponentResponse) -> Unit = definedExternally): Request<DisassociateTrialComponentResponse, AWSError>
    open fun disassociateTrialComponent(callback: (err: AWSError, data: DisassociateTrialComponentResponse) -> Unit = definedExternally): Request<DisassociateTrialComponentResponse, AWSError>
    open fun getSearchSuggestions(params: GetSearchSuggestionsRequest, callback: (err: AWSError, data: GetSearchSuggestionsResponse) -> Unit = definedExternally): Request<GetSearchSuggestionsResponse, AWSError>
    open fun getSearchSuggestions(callback: (err: AWSError, data: GetSearchSuggestionsResponse) -> Unit = definedExternally): Request<GetSearchSuggestionsResponse, AWSError>
    open fun listAlgorithms(params: ListAlgorithmsInput, callback: (err: AWSError, data: ListAlgorithmsOutput) -> Unit = definedExternally): Request<ListAlgorithmsOutput, AWSError>
    open fun listAlgorithms(callback: (err: AWSError, data: ListAlgorithmsOutput) -> Unit = definedExternally): Request<ListAlgorithmsOutput, AWSError>
    open fun listApps(params: ListAppsRequest, callback: (err: AWSError, data: ListAppsResponse) -> Unit = definedExternally): Request<ListAppsResponse, AWSError>
    open fun listApps(callback: (err: AWSError, data: ListAppsResponse) -> Unit = definedExternally): Request<ListAppsResponse, AWSError>
    open fun listAutoMLJobs(params: ListAutoMLJobsRequest, callback: (err: AWSError, data: ListAutoMLJobsResponse) -> Unit = definedExternally): Request<ListAutoMLJobsResponse, AWSError>
    open fun listAutoMLJobs(callback: (err: AWSError, data: ListAutoMLJobsResponse) -> Unit = definedExternally): Request<ListAutoMLJobsResponse, AWSError>
    open fun listCandidatesForAutoMLJob(params: ListCandidatesForAutoMLJobRequest, callback: (err: AWSError, data: ListCandidatesForAutoMLJobResponse) -> Unit = definedExternally): Request<ListCandidatesForAutoMLJobResponse, AWSError>
    open fun listCandidatesForAutoMLJob(callback: (err: AWSError, data: ListCandidatesForAutoMLJobResponse) -> Unit = definedExternally): Request<ListCandidatesForAutoMLJobResponse, AWSError>
    open fun listCodeRepositories(params: ListCodeRepositoriesInput, callback: (err: AWSError, data: ListCodeRepositoriesOutput) -> Unit = definedExternally): Request<ListCodeRepositoriesOutput, AWSError>
    open fun listCodeRepositories(callback: (err: AWSError, data: ListCodeRepositoriesOutput) -> Unit = definedExternally): Request<ListCodeRepositoriesOutput, AWSError>
    open fun listCompilationJobs(params: ListCompilationJobsRequest, callback: (err: AWSError, data: ListCompilationJobsResponse) -> Unit = definedExternally): Request<ListCompilationJobsResponse, AWSError>
    open fun listCompilationJobs(callback: (err: AWSError, data: ListCompilationJobsResponse) -> Unit = definedExternally): Request<ListCompilationJobsResponse, AWSError>
    open fun listDomains(params: ListDomainsRequest, callback: (err: AWSError, data: ListDomainsResponse) -> Unit = definedExternally): Request<ListDomainsResponse, AWSError>
    open fun listDomains(callback: (err: AWSError, data: ListDomainsResponse) -> Unit = definedExternally): Request<ListDomainsResponse, AWSError>
    open fun listEndpointConfigs(params: ListEndpointConfigsInput, callback: (err: AWSError, data: ListEndpointConfigsOutput) -> Unit = definedExternally): Request<ListEndpointConfigsOutput, AWSError>
    open fun listEndpointConfigs(callback: (err: AWSError, data: ListEndpointConfigsOutput) -> Unit = definedExternally): Request<ListEndpointConfigsOutput, AWSError>
    open fun listEndpoints(params: ListEndpointsInput, callback: (err: AWSError, data: ListEndpointsOutput) -> Unit = definedExternally): Request<ListEndpointsOutput, AWSError>
    open fun listEndpoints(callback: (err: AWSError, data: ListEndpointsOutput) -> Unit = definedExternally): Request<ListEndpointsOutput, AWSError>
    open fun listExperiments(params: ListExperimentsRequest, callback: (err: AWSError, data: ListExperimentsResponse) -> Unit = definedExternally): Request<ListExperimentsResponse, AWSError>
    open fun listExperiments(callback: (err: AWSError, data: ListExperimentsResponse) -> Unit = definedExternally): Request<ListExperimentsResponse, AWSError>
    open fun listFlowDefinitions(params: ListFlowDefinitionsRequest, callback: (err: AWSError, data: ListFlowDefinitionsResponse) -> Unit = definedExternally): Request<ListFlowDefinitionsResponse, AWSError>
    open fun listFlowDefinitions(callback: (err: AWSError, data: ListFlowDefinitionsResponse) -> Unit = definedExternally): Request<ListFlowDefinitionsResponse, AWSError>
    open fun listHumanTaskUis(params: ListHumanTaskUisRequest, callback: (err: AWSError, data: ListHumanTaskUisResponse) -> Unit = definedExternally): Request<ListHumanTaskUisResponse, AWSError>
    open fun listHumanTaskUis(callback: (err: AWSError, data: ListHumanTaskUisResponse) -> Unit = definedExternally): Request<ListHumanTaskUisResponse, AWSError>
    open fun listHyperParameterTuningJobs(params: ListHyperParameterTuningJobsRequest, callback: (err: AWSError, data: ListHyperParameterTuningJobsResponse) -> Unit = definedExternally): Request<ListHyperParameterTuningJobsResponse, AWSError>
    open fun listHyperParameterTuningJobs(callback: (err: AWSError, data: ListHyperParameterTuningJobsResponse) -> Unit = definedExternally): Request<ListHyperParameterTuningJobsResponse, AWSError>
    open fun listLabelingJobs(params: ListLabelingJobsRequest, callback: (err: AWSError, data: ListLabelingJobsResponse) -> Unit = definedExternally): Request<ListLabelingJobsResponse, AWSError>
    open fun listLabelingJobs(callback: (err: AWSError, data: ListLabelingJobsResponse) -> Unit = definedExternally): Request<ListLabelingJobsResponse, AWSError>
    open fun listLabelingJobsForWorkteam(params: ListLabelingJobsForWorkteamRequest, callback: (err: AWSError, data: ListLabelingJobsForWorkteamResponse) -> Unit = definedExternally): Request<ListLabelingJobsForWorkteamResponse, AWSError>
    open fun listLabelingJobsForWorkteam(callback: (err: AWSError, data: ListLabelingJobsForWorkteamResponse) -> Unit = definedExternally): Request<ListLabelingJobsForWorkteamResponse, AWSError>
    open fun listModelPackages(params: ListModelPackagesInput, callback: (err: AWSError, data: ListModelPackagesOutput) -> Unit = definedExternally): Request<ListModelPackagesOutput, AWSError>
    open fun listModelPackages(callback: (err: AWSError, data: ListModelPackagesOutput) -> Unit = definedExternally): Request<ListModelPackagesOutput, AWSError>
    open fun listModels(params: ListModelsInput, callback: (err: AWSError, data: ListModelsOutput) -> Unit = definedExternally): Request<ListModelsOutput, AWSError>
    open fun listModels(callback: (err: AWSError, data: ListModelsOutput) -> Unit = definedExternally): Request<ListModelsOutput, AWSError>
    open fun listMonitoringExecutions(params: ListMonitoringExecutionsRequest, callback: (err: AWSError, data: ListMonitoringExecutionsResponse) -> Unit = definedExternally): Request<ListMonitoringExecutionsResponse, AWSError>
    open fun listMonitoringExecutions(callback: (err: AWSError, data: ListMonitoringExecutionsResponse) -> Unit = definedExternally): Request<ListMonitoringExecutionsResponse, AWSError>
    open fun listMonitoringSchedules(params: ListMonitoringSchedulesRequest, callback: (err: AWSError, data: ListMonitoringSchedulesResponse) -> Unit = definedExternally): Request<ListMonitoringSchedulesResponse, AWSError>
    open fun listMonitoringSchedules(callback: (err: AWSError, data: ListMonitoringSchedulesResponse) -> Unit = definedExternally): Request<ListMonitoringSchedulesResponse, AWSError>
    open fun listNotebookInstanceLifecycleConfigs(params: ListNotebookInstanceLifecycleConfigsInput, callback: (err: AWSError, data: ListNotebookInstanceLifecycleConfigsOutput) -> Unit = definedExternally): Request<ListNotebookInstanceLifecycleConfigsOutput, AWSError>
    open fun listNotebookInstanceLifecycleConfigs(callback: (err: AWSError, data: ListNotebookInstanceLifecycleConfigsOutput) -> Unit = definedExternally): Request<ListNotebookInstanceLifecycleConfigsOutput, AWSError>
    open fun listNotebookInstances(params: ListNotebookInstancesInput, callback: (err: AWSError, data: ListNotebookInstancesOutput) -> Unit = definedExternally): Request<ListNotebookInstancesOutput, AWSError>
    open fun listNotebookInstances(callback: (err: AWSError, data: ListNotebookInstancesOutput) -> Unit = definedExternally): Request<ListNotebookInstancesOutput, AWSError>
    open fun listProcessingJobs(params: ListProcessingJobsRequest, callback: (err: AWSError, data: ListProcessingJobsResponse) -> Unit = definedExternally): Request<ListProcessingJobsResponse, AWSError>
    open fun listProcessingJobs(callback: (err: AWSError, data: ListProcessingJobsResponse) -> Unit = definedExternally): Request<ListProcessingJobsResponse, AWSError>
    open fun listSubscribedWorkteams(params: ListSubscribedWorkteamsRequest, callback: (err: AWSError, data: ListSubscribedWorkteamsResponse) -> Unit = definedExternally): Request<ListSubscribedWorkteamsResponse, AWSError>
    open fun listSubscribedWorkteams(callback: (err: AWSError, data: ListSubscribedWorkteamsResponse) -> Unit = definedExternally): Request<ListSubscribedWorkteamsResponse, AWSError>
    open fun listTags(params: ListTagsInput, callback: (err: AWSError, data: ListTagsOutput) -> Unit = definedExternally): Request<ListTagsOutput, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsOutput) -> Unit = definedExternally): Request<ListTagsOutput, AWSError>
    open fun listTrainingJobs(params: ListTrainingJobsRequest, callback: (err: AWSError, data: ListTrainingJobsResponse) -> Unit = definedExternally): Request<ListTrainingJobsResponse, AWSError>
    open fun listTrainingJobs(callback: (err: AWSError, data: ListTrainingJobsResponse) -> Unit = definedExternally): Request<ListTrainingJobsResponse, AWSError>
    open fun listTrainingJobsForHyperParameterTuningJob(params: ListTrainingJobsForHyperParameterTuningJobRequest, callback: (err: AWSError, data: ListTrainingJobsForHyperParameterTuningJobResponse) -> Unit = definedExternally): Request<ListTrainingJobsForHyperParameterTuningJobResponse, AWSError>
    open fun listTrainingJobsForHyperParameterTuningJob(callback: (err: AWSError, data: ListTrainingJobsForHyperParameterTuningJobResponse) -> Unit = definedExternally): Request<ListTrainingJobsForHyperParameterTuningJobResponse, AWSError>
    open fun listTransformJobs(params: ListTransformJobsRequest, callback: (err: AWSError, data: ListTransformJobsResponse) -> Unit = definedExternally): Request<ListTransformJobsResponse, AWSError>
    open fun listTransformJobs(callback: (err: AWSError, data: ListTransformJobsResponse) -> Unit = definedExternally): Request<ListTransformJobsResponse, AWSError>
    open fun listTrialComponents(params: ListTrialComponentsRequest, callback: (err: AWSError, data: ListTrialComponentsResponse) -> Unit = definedExternally): Request<ListTrialComponentsResponse, AWSError>
    open fun listTrialComponents(callback: (err: AWSError, data: ListTrialComponentsResponse) -> Unit = definedExternally): Request<ListTrialComponentsResponse, AWSError>
    open fun listTrials(params: ListTrialsRequest, callback: (err: AWSError, data: ListTrialsResponse) -> Unit = definedExternally): Request<ListTrialsResponse, AWSError>
    open fun listTrials(callback: (err: AWSError, data: ListTrialsResponse) -> Unit = definedExternally): Request<ListTrialsResponse, AWSError>
    open fun listUserProfiles(params: ListUserProfilesRequest, callback: (err: AWSError, data: ListUserProfilesResponse) -> Unit = definedExternally): Request<ListUserProfilesResponse, AWSError>
    open fun listUserProfiles(callback: (err: AWSError, data: ListUserProfilesResponse) -> Unit = definedExternally): Request<ListUserProfilesResponse, AWSError>
    open fun listWorkteams(params: ListWorkteamsRequest, callback: (err: AWSError, data: ListWorkteamsResponse) -> Unit = definedExternally): Request<ListWorkteamsResponse, AWSError>
    open fun listWorkteams(callback: (err: AWSError, data: ListWorkteamsResponse) -> Unit = definedExternally): Request<ListWorkteamsResponse, AWSError>
    open fun renderUiTemplate(params: RenderUiTemplateRequest, callback: (err: AWSError, data: RenderUiTemplateResponse) -> Unit = definedExternally): Request<RenderUiTemplateResponse, AWSError>
    open fun renderUiTemplate(callback: (err: AWSError, data: RenderUiTemplateResponse) -> Unit = definedExternally): Request<RenderUiTemplateResponse, AWSError>
    open fun search(params: SearchRequest, callback: (err: AWSError, data: SearchResponse) -> Unit = definedExternally): Request<SearchResponse, AWSError>
    open fun search(callback: (err: AWSError, data: SearchResponse) -> Unit = definedExternally): Request<SearchResponse, AWSError>
    open fun startMonitoringSchedule(params: StartMonitoringScheduleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startMonitoringSchedule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startNotebookInstance(params: StartNotebookInstanceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startNotebookInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopAutoMLJob(params: StopAutoMLJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopAutoMLJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopCompilationJob(params: StopCompilationJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopCompilationJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopHyperParameterTuningJob(params: StopHyperParameterTuningJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopHyperParameterTuningJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopLabelingJob(params: StopLabelingJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopLabelingJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopMonitoringSchedule(params: StopMonitoringScheduleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopMonitoringSchedule(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopNotebookInstance(params: StopNotebookInstanceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopNotebookInstance(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopProcessingJob(params: StopProcessingJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopProcessingJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopTrainingJob(params: StopTrainingJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopTrainingJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopTransformJob(params: StopTransformJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopTransformJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateCodeRepository(params: UpdateCodeRepositoryInput, callback: (err: AWSError, data: UpdateCodeRepositoryOutput) -> Unit = definedExternally): Request<UpdateCodeRepositoryOutput, AWSError>
    open fun updateCodeRepository(callback: (err: AWSError, data: UpdateCodeRepositoryOutput) -> Unit = definedExternally): Request<UpdateCodeRepositoryOutput, AWSError>
    open fun updateDomain(params: UpdateDomainRequest, callback: (err: AWSError, data: UpdateDomainResponse) -> Unit = definedExternally): Request<UpdateDomainResponse, AWSError>
    open fun updateDomain(callback: (err: AWSError, data: UpdateDomainResponse) -> Unit = definedExternally): Request<UpdateDomainResponse, AWSError>
    open fun updateEndpoint(params: UpdateEndpointInput, callback: (err: AWSError, data: UpdateEndpointOutput) -> Unit = definedExternally): Request<UpdateEndpointOutput, AWSError>
    open fun updateEndpoint(callback: (err: AWSError, data: UpdateEndpointOutput) -> Unit = definedExternally): Request<UpdateEndpointOutput, AWSError>
    open fun updateEndpointWeightsAndCapacities(params: UpdateEndpointWeightsAndCapacitiesInput, callback: (err: AWSError, data: UpdateEndpointWeightsAndCapacitiesOutput) -> Unit = definedExternally): Request<UpdateEndpointWeightsAndCapacitiesOutput, AWSError>
    open fun updateEndpointWeightsAndCapacities(callback: (err: AWSError, data: UpdateEndpointWeightsAndCapacitiesOutput) -> Unit = definedExternally): Request<UpdateEndpointWeightsAndCapacitiesOutput, AWSError>
    open fun updateExperiment(params: UpdateExperimentRequest, callback: (err: AWSError, data: UpdateExperimentResponse) -> Unit = definedExternally): Request<UpdateExperimentResponse, AWSError>
    open fun updateExperiment(callback: (err: AWSError, data: UpdateExperimentResponse) -> Unit = definedExternally): Request<UpdateExperimentResponse, AWSError>
    open fun updateMonitoringSchedule(params: UpdateMonitoringScheduleRequest, callback: (err: AWSError, data: UpdateMonitoringScheduleResponse) -> Unit = definedExternally): Request<UpdateMonitoringScheduleResponse, AWSError>
    open fun updateMonitoringSchedule(callback: (err: AWSError, data: UpdateMonitoringScheduleResponse) -> Unit = definedExternally): Request<UpdateMonitoringScheduleResponse, AWSError>
    open fun updateNotebookInstance(params: UpdateNotebookInstanceInput, callback: (err: AWSError, data: UpdateNotebookInstanceOutput) -> Unit = definedExternally): Request<UpdateNotebookInstanceOutput, AWSError>
    open fun updateNotebookInstance(callback: (err: AWSError, data: UpdateNotebookInstanceOutput) -> Unit = definedExternally): Request<UpdateNotebookInstanceOutput, AWSError>
    open fun updateNotebookInstanceLifecycleConfig(params: UpdateNotebookInstanceLifecycleConfigInput, callback: (err: AWSError, data: UpdateNotebookInstanceLifecycleConfigOutput) -> Unit = definedExternally): Request<UpdateNotebookInstanceLifecycleConfigOutput, AWSError>
    open fun updateNotebookInstanceLifecycleConfig(callback: (err: AWSError, data: UpdateNotebookInstanceLifecycleConfigOutput) -> Unit = definedExternally): Request<UpdateNotebookInstanceLifecycleConfigOutput, AWSError>
    open fun updateTrial(params: UpdateTrialRequest, callback: (err: AWSError, data: UpdateTrialResponse) -> Unit = definedExternally): Request<UpdateTrialResponse, AWSError>
    open fun updateTrial(callback: (err: AWSError, data: UpdateTrialResponse) -> Unit = definedExternally): Request<UpdateTrialResponse, AWSError>
    open fun updateTrialComponent(params: UpdateTrialComponentRequest, callback: (err: AWSError, data: UpdateTrialComponentResponse) -> Unit = definedExternally): Request<UpdateTrialComponentResponse, AWSError>
    open fun updateTrialComponent(callback: (err: AWSError, data: UpdateTrialComponentResponse) -> Unit = definedExternally): Request<UpdateTrialComponentResponse, AWSError>
    open fun updateUserProfile(params: UpdateUserProfileRequest, callback: (err: AWSError, data: UpdateUserProfileResponse) -> Unit = definedExternally): Request<UpdateUserProfileResponse, AWSError>
    open fun updateUserProfile(callback: (err: AWSError, data: UpdateUserProfileResponse) -> Unit = definedExternally): Request<UpdateUserProfileResponse, AWSError>
    open fun updateWorkforce(params: UpdateWorkforceRequest, callback: (err: AWSError, data: UpdateWorkforceResponse) -> Unit = definedExternally): Request<UpdateWorkforceResponse, AWSError>
    open fun updateWorkforce(callback: (err: AWSError, data: UpdateWorkforceResponse) -> Unit = definedExternally): Request<UpdateWorkforceResponse, AWSError>
    open fun updateWorkteam(params: UpdateWorkteamRequest, callback: (err: AWSError, data: UpdateWorkteamResponse) -> Unit = definedExternally): Request<UpdateWorkteamResponse, AWSError>
    open fun updateWorkteam(callback: (err: AWSError, data: UpdateWorkteamResponse) -> Unit = definedExternally): Request<UpdateWorkteamResponse, AWSError>
    open fun waitFor(state: String, params: DescribeNotebookInstanceInput, callback: (err: AWSError, data: DescribeNotebookInstanceOutput) -> Unit = definedExternally): Request<DescribeNotebookInstanceOutput, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeNotebookInstanceOutput) -> Unit = definedExternally): Request<DescribeNotebookInstanceOutput, AWSError>
    open fun waitFor(state: String /* "trainingJobCompletedOrStopped" */, params: DescribeTrainingJobRequest /* SageMaker.Types.DescribeTrainingJobRequest & `T$0` */, callback: (err: AWSError, data: DescribeTrainingJobResponse) -> Unit = definedExternally): Request<DescribeTrainingJobResponse, AWSError>
    open fun waitFor(state: String /* "trainingJobCompletedOrStopped" */, callback: (err: AWSError, data: DescribeTrainingJobResponse) -> Unit = definedExternally): Request<DescribeTrainingJobResponse, AWSError>
    open fun waitFor(state: String, params: DescribeEndpointInput, callback: (err: AWSError, data: DescribeEndpointOutput) -> Unit = definedExternally): Request<DescribeEndpointOutput, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeEndpointOutput) -> Unit = definedExternally): Request<DescribeEndpointOutput, AWSError>
    open fun waitFor(state: String /* "transformJobCompletedOrStopped" */, params: DescribeTransformJobRequest /* SageMaker.Types.DescribeTransformJobRequest & `T$0` */, callback: (err: AWSError, data: DescribeTransformJobResponse) -> Unit = definedExternally): Request<DescribeTransformJobResponse, AWSError>
    open fun waitFor(state: String /* "transformJobCompletedOrStopped" */, callback: (err: AWSError, data: DescribeTransformJobResponse) -> Unit = definedExternally): Request<DescribeTransformJobResponse, AWSError>
    open fun waitFor(state: String /* "processingJobCompletedOrStopped" */, params: DescribeProcessingJobRequest /* SageMaker.Types.DescribeProcessingJobRequest & `T$0` */, callback: (err: AWSError, data: DescribeProcessingJobResponse) -> Unit = definedExternally): Request<DescribeProcessingJobResponse, AWSError>
    open fun waitFor(state: String /* "processingJobCompletedOrStopped" */, callback: (err: AWSError, data: DescribeProcessingJobResponse) -> Unit = definedExternally): Request<DescribeProcessingJobResponse, AWSError>
    interface AddTagsInput {
        var ResourceArn: ResourceArn
        var Tags: TagList
    }
    interface AddTagsOutput {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AlgorithmSpecification {
        var TrainingImage: AlgorithmImage?
            get() = definedExternally
            set(value) = definedExternally
        var AlgorithmName: ArnOrName?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingInputMode: String /* "Pipe" | "File" | String */
        var MetricDefinitions: MetricDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
        var EnableSageMakerMetricsTimeSeries: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AlgorithmStatusDetails {
        var ValidationStatuses: AlgorithmStatusItemList?
            get() = definedExternally
            set(value) = definedExternally
        var ImageScanStatuses: AlgorithmStatusItemList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AlgorithmStatusItem {
        var Name: EntityName
        var Status: String /* "NotStarted" | "InProgress" | "Completed" | "Failed" | String */
        var FailureReason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AlgorithmSummary {
        var AlgorithmName: EntityName
        var AlgorithmArn: AlgorithmArn
        var AlgorithmDescription: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime
        var AlgorithmStatus: String /* "Pending" | "InProgress" | "Completed" | "Failed" | "Deleting" | String */
    }
    interface AlgorithmValidationProfile {
        var ProfileName: EntityName
        var TrainingJobDefinition: TrainingJobDefinition
        var TransformJobDefinition: TransformJobDefinition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AlgorithmValidationSpecification {
        var ValidationRole: RoleArn
        var ValidationProfiles: AlgorithmValidationProfiles
    }
    interface AnnotationConsolidationConfig {
        var AnnotationConsolidationLambdaArn: LambdaFunctionArn
    }
    interface AppDetails {
        var DomainId: DomainId?
            get() = definedExternally
            set(value) = definedExternally
        var UserProfileName: UserProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var AppType: String /* "JupyterServer" | "KernelGateway" | "TensorBoard" | String */
        var AppName: AppName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Deleted" | "Deleting" | "Failed" | "InService" | "Pending" | String */
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AppSpecification {
        var ImageUri: ImageUri
        var ContainerEntrypoint: ContainerEntrypoint?
            get() = definedExternally
            set(value) = definedExternally
        var ContainerArguments: ContainerArguments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateTrialComponentRequest {
        var TrialComponentName: ExperimentEntityName
        var TrialName: ExperimentEntityName
    }
    interface AssociateTrialComponentResponse {
        var TrialComponentArn: TrialComponentArn?
            get() = definedExternally
            set(value) = definedExternally
        var TrialArn: TrialArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoMLCandidate {
        var CandidateName: CandidateName
        var FinalAutoMLJobObjectiveMetric: FinalAutoMLJobObjectiveMetric?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectiveStatus: String /* "Succeeded" | "Pending" | "Failed" | String */
        var CandidateSteps: CandidateSteps
        var CandidateStatus: String /* "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping" | String */
        var InferenceContainers: AutoMLContainerDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp
        var FailureReason: AutoMLFailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoMLCandidateStep {
        var CandidateStepType: String /* "AWS::SageMaker::TrainingJob" | "AWS::SageMaker::TransformJob" | "AWS::SageMaker::ProcessingJob" | String */
        var CandidateStepArn: CandidateStepArn
        var CandidateStepName: CandidateStepName
    }
    interface AutoMLChannel {
        var DataSource: AutoMLDataSource
        var CompressionType: String /* "None" | "Gzip" | String */
        var TargetAttributeName: TargetAttributeName
    }
    interface AutoMLContainerDefinition {
        var Image: Image
        var ModelDataUrl: Url
        var Environment: EnvironmentMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoMLDataSource {
        var S3DataSource: AutoMLS3DataSource
    }
    interface AutoMLJobArtifacts {
        var CandidateDefinitionNotebookLocation: CandidateDefinitionNotebookLocation?
            get() = definedExternally
            set(value) = definedExternally
        var DataExplorationNotebookLocation: DataExplorationNotebookLocation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoMLJobCompletionCriteria {
        var MaxCandidates: MaxCandidates?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRuntimePerTrainingJobInSeconds: MaxRuntimePerTrainingJobInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var MaxAutoMLJobRuntimeInSeconds: MaxAutoMLJobRuntimeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoMLJobConfig {
        var CompletionCriteria: AutoMLJobCompletionCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfig: AutoMLSecurityConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoMLJobObjective {
        var MetricName: String /* "Accuracy" | "MSE" | "F1" | "F1macro" | String */
    }
    interface AutoMLJobSummary {
        var AutoMLJobName: AutoMLJobName
        var AutoMLJobArn: AutoMLJobArn
        var AutoMLJobStatus: String /* "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping" | String */
        var AutoMLJobSecondaryStatus: String /* "Starting" | "AnalyzingData" | "FeatureEngineering" | "ModelTuning" | "MaxCandidatesReached" | "Failed" | "Stopped" | "MaxAutoMLJobRuntimeReached" | "Stopping" | "CandidateDefinitionsGenerated" | String */
        var CreationTime: Timestamp
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp
        var FailureReason: AutoMLFailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoMLOutputDataConfig {
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var S3OutputPath: S3Uri
    }
    interface AutoMLS3DataSource {
        var S3DataType: String /* "ManifestFile" | "S3Prefix" | String */
        var S3Uri: S3Uri
    }
    interface AutoMLSecurityConfig {
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var EnableInterContainerTrafficEncryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaptureContentTypeHeader {
        var CsvContentTypes: CsvContentTypes?
            get() = definedExternally
            set(value) = definedExternally
        var JsonContentTypes: JsonContentTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CaptureOption {
        var CaptureMode: String /* "Input" | "Output" | String */
    }
    interface CategoricalParameterRange {
        var Name: ParameterKey
        var Values: ParameterValues
    }
    interface CategoricalParameterRangeSpecification {
        var Values: ParameterValues
    }
    interface Channel {
        var ChannelName: ChannelName
        var DataSource: DataSource
        var ContentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
        var CompressionType: String /* "None" | "Gzip" | String */
        var RecordWrapperType: String /* "None" | "RecordIO" | String */
        var InputMode: String /* "Pipe" | "File" | String */
        var ShuffleConfig: ShuffleConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelSpecification {
        var Name: ChannelName
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var IsRequired: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedContentTypes: ContentTypes
        var SupportedCompressionTypes: CompressionTypes?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedInputModes: InputModes
    }
    interface CheckpointConfig {
        var S3Uri: S3Uri
        var LocalPath: DirectoryPath?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeRepositorySummary {
        var CodeRepositoryName: EntityName
        var CodeRepositoryArn: CodeRepositoryArn
        var CreationTime: CreationTime
        var LastModifiedTime: LastModifiedTime
        var GitConfig: GitConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CognitoMemberDefinition {
        var UserPool: CognitoUserPool
        var UserGroup: CognitoUserGroup
        var ClientId: CognitoClientId
    }
    interface CollectionConfiguration {
        var CollectionName: CollectionName?
            get() = definedExternally
            set(value) = definedExternally
        var CollectionParameters: CollectionParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CollectionParameters {
        @nativeGetter
        operator fun get(key: String): ConfigValue?
        @nativeSetter
        operator fun set(key: String, value: ConfigValue)
    }
    interface CompilationJobSummary {
        var CompilationJobName: EntityName
        var CompilationJobArn: CompilationJobArn
        var CreationTime: CreationTime
        var CompilationStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompilationEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompilationTargetDevice: String /* "lambda" | "ml_m4" | "ml_m5" | "ml_c4" | "ml_c5" | "ml_p2" | "ml_p3" | "ml_inf1" | "jetson_tx1" | "jetson_tx2" | "jetson_nano" | "jetson_xavier" | "rasp3b" | "imx8qm" | "deeplens" | "rk3399" | "rk3288" | "aisage" | "sbe_c" | "qcs605" | "qcs603" | "sitara_am57x" | "amba_cv22" | String */
        var LastModifiedTime: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var CompilationJobStatus: String /* "INPROGRESS" | "COMPLETED" | "FAILED" | "STARTING" | "STOPPING" | "STOPPED" | String */
    }
    interface ContainerDefinition {
        var ContainerHostname: ContainerHostname?
            get() = definedExternally
            set(value) = definedExternally
        var Image: Image?
            get() = definedExternally
            set(value) = definedExternally
        var Mode: String /* "SingleModel" | "MultiModel" | String */
        var ModelDataUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var Environment: EnvironmentMap?
            get() = definedExternally
            set(value) = definedExternally
        var ModelPackageName: ArnOrName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContinuousParameterRange {
        var Name: ParameterKey
        var MinValue: ParameterValue
        var MaxValue: ParameterValue
        var ScalingType: String /* "Auto" | "Linear" | "Logarithmic" | "ReverseLogarithmic" | String */
    }
    interface ContinuousParameterRangeSpecification {
        var MinValue: ParameterValue
        var MaxValue: ParameterValue
    }
    interface CreateAlgorithmInput {
        var AlgorithmName: EntityName
        var AlgorithmDescription: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingSpecification: TrainingSpecification
        var InferenceSpecification: InferenceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationSpecification: AlgorithmValidationSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var CertifyForMarketplace: CertifyForMarketplace?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAlgorithmOutput {
        var AlgorithmArn: AlgorithmArn
    }
    interface CreateAppRequest {
        var DomainId: DomainId
        var UserProfileName: UserProfileName
        var AppType: String /* "JupyterServer" | "KernelGateway" | "TensorBoard" | String */
        var AppName: AppName
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceSpec: ResourceSpec?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAppResponse {
        var AppArn: AppArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAutoMLJobRequest {
        var AutoMLJobName: AutoMLJobName
        var InputDataConfig: AutoMLInputDataConfig
        var OutputDataConfig: AutoMLOutputDataConfig
        var ProblemType: String /* "BinaryClassification" | "MulticlassClassification" | "Regression" | String */
        var AutoMLJobObjective: AutoMLJobObjective?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMLJobConfig: AutoMLJobConfig?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn
        var GenerateCandidateDefinitionsOnly: GenerateCandidateDefinitionsOnly?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAutoMLJobResponse {
        var AutoMLJobArn: AutoMLJobArn
    }
    interface CreateCodeRepositoryInput {
        var CodeRepositoryName: EntityName
        var GitConfig: GitConfig
    }
    interface CreateCodeRepositoryOutput {
        var CodeRepositoryArn: CodeRepositoryArn
    }
    interface CreateCompilationJobRequest {
        var CompilationJobName: EntityName
        var RoleArn: RoleArn
        var InputConfig: InputConfig
        var OutputConfig: OutputConfig
        var StoppingCondition: StoppingCondition
    }
    interface CreateCompilationJobResponse {
        var CompilationJobArn: CompilationJobArn
    }
    interface CreateDomainRequest {
        var DomainName: DomainName
        var AuthMode: String /* "SSO" | "IAM" | String */
        var DefaultUserSettings: UserSettings
        var SubnetIds: Subnets
        var VpcId: VpcId
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var HomeEfsFileSystemKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDomainResponse {
        var DomainArn: DomainArn?
            get() = definedExternally
            set(value) = definedExternally
        var Url: String1024?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEndpointConfigInput {
        var EndpointConfigName: EndpointConfigName
        var ProductionVariants: ProductionVariantList
        var DataCaptureConfig: DataCaptureConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEndpointConfigOutput {
        var EndpointConfigArn: EndpointConfigArn
    }
    interface CreateEndpointInput {
        var EndpointName: EndpointName
        var EndpointConfigName: EndpointConfigName
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEndpointOutput {
        var EndpointArn: EndpointArn
    }
    interface CreateExperimentRequest {
        var ExperimentName: ExperimentEntityName
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ExperimentDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateExperimentResponse {
        var ExperimentArn: ExperimentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFlowDefinitionRequest {
        var FlowDefinitionName: FlowDefinitionName
        var HumanLoopRequestSource: HumanLoopRequestSource?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopActivationConfig: HumanLoopActivationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopConfig: HumanLoopConfig
        var OutputConfig: FlowDefinitionOutputConfig
        var RoleArn: RoleArn
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFlowDefinitionResponse {
        var FlowDefinitionArn: FlowDefinitionArn
    }
    interface CreateHumanTaskUiRequest {
        var HumanTaskUiName: HumanTaskUiName
        var UiTemplate: UiTemplate
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHumanTaskUiResponse {
        var HumanTaskUiArn: HumanTaskUiArn
    }
    interface CreateHyperParameterTuningJobRequest {
        var HyperParameterTuningJobName: HyperParameterTuningJobName
        var HyperParameterTuningJobConfig: HyperParameterTuningJobConfig
        var TrainingJobDefinition: HyperParameterTrainingJobDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobDefinitions: HyperParameterTrainingJobDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var WarmStartConfig: HyperParameterTuningJobWarmStartConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHyperParameterTuningJobResponse {
        var HyperParameterTuningJobArn: HyperParameterTuningJobArn
    }
    interface CreateLabelingJobRequest {
        var LabelingJobName: LabelingJobName
        var LabelAttributeName: LabelAttributeName
        var InputConfig: LabelingJobInputConfig
        var OutputConfig: LabelingJobOutputConfig
        var RoleArn: RoleArn
        var LabelCategoryConfigS3Uri: S3Uri?
            get() = definedExternally
            set(value) = definedExternally
        var StoppingConditions: LabelingJobStoppingConditions?
            get() = definedExternally
            set(value) = definedExternally
        var LabelingJobAlgorithmsConfig: LabelingJobAlgorithmsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HumanTaskConfig: HumanTaskConfig
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLabelingJobResponse {
        var LabelingJobArn: LabelingJobArn
    }
    interface CreateModelInput {
        var ModelName: ModelName
        var PrimaryContainer: ContainerDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var Containers: ContainerDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleArn: RoleArn
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var EnableNetworkIsolation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateModelOutput {
        var ModelArn: ModelArn
    }
    interface CreateModelPackageInput {
        var ModelPackageName: EntityName
        var ModelPackageDescription: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var InferenceSpecification: InferenceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationSpecification: ModelPackageValidationSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var SourceAlgorithmSpecification: SourceAlgorithmSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var CertifyForMarketplace: CertifyForMarketplace?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateModelPackageOutput {
        var ModelPackageArn: ModelPackageArn
    }
    interface CreateMonitoringScheduleRequest {
        var MonitoringScheduleName: MonitoringScheduleName
        var MonitoringScheduleConfig: MonitoringScheduleConfig
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMonitoringScheduleResponse {
        var MonitoringScheduleArn: MonitoringScheduleArn
    }
    interface CreateNotebookInstanceInput {
        var NotebookInstanceName: NotebookInstanceName
        var InstanceType: String /* "ml.t2.medium" | "ml.t2.large" | "ml.t2.xlarge" | "ml.t2.2xlarge" | "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5d.xlarge" | "ml.c5d.2xlarge" | "ml.c5d.4xlarge" | "ml.c5d.9xlarge" | "ml.c5d.18xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | String */
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var LifecycleConfigName: NotebookInstanceLifecycleConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var DirectInternetAccess: String /* "Enabled" | "Disabled" | String */
        var VolumeSizeInGB: NotebookInstanceVolumeSizeInGB?
            get() = definedExternally
            set(value) = definedExternally
        var AcceleratorTypes: NotebookInstanceAcceleratorTypes?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultCodeRepository: CodeRepositoryNameOrUrl?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalCodeRepositories: AdditionalCodeRepositoryNamesOrUrls?
            get() = definedExternally
            set(value) = definedExternally
        var RootAccess: String /* "Enabled" | "Disabled" | String */
    }
    interface CreateNotebookInstanceLifecycleConfigInput {
        var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
        var OnCreate: NotebookInstanceLifecycleConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var OnStart: NotebookInstanceLifecycleConfigList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNotebookInstanceLifecycleConfigOutput {
        var NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNotebookInstanceOutput {
        var NotebookInstanceArn: NotebookInstanceArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePresignedDomainUrlRequest {
        var DomainId: DomainId
        var UserProfileName: UserProfileName
        var SessionExpirationDurationInSeconds: SessionExpirationDurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePresignedDomainUrlResponse {
        var AuthorizedUrl: PresignedDomainUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePresignedNotebookInstanceUrlInput {
        var NotebookInstanceName: NotebookInstanceName
        var SessionExpirationDurationInSeconds: SessionExpirationDurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePresignedNotebookInstanceUrlOutput {
        var AuthorizedUrl: NotebookInstanceUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProcessingJobRequest {
        var ProcessingInputs: ProcessingInputs?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingOutputConfig: ProcessingOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingJobName: ProcessingJobName
        var ProcessingResources: ProcessingResources
        var StoppingCondition: ProcessingStoppingCondition?
            get() = definedExternally
            set(value) = definedExternally
        var AppSpecification: AppSpecification
        var Environment: ProcessingEnvironmentMap?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkConfig: NetworkConfig?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentConfig: ExperimentConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProcessingJobResponse {
        var ProcessingJobArn: ProcessingJobArn
    }
    interface CreateTrainingJobRequest {
        var TrainingJobName: TrainingJobName
        var HyperParameters: HyperParameters?
            get() = definedExternally
            set(value) = definedExternally
        var AlgorithmSpecification: AlgorithmSpecification
        var RoleArn: RoleArn
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig
        var ResourceConfig: ResourceConfig
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var StoppingCondition: StoppingCondition
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var EnableNetworkIsolation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableInterContainerTrafficEncryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableManagedSpotTraining: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CheckpointConfig: CheckpointConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DebugHookConfig: DebugHookConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DebugRuleConfigurations: DebugRuleConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var TensorBoardOutputConfig: TensorBoardOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentConfig: ExperimentConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTrainingJobResponse {
        var TrainingJobArn: TrainingJobArn
    }
    interface CreateTransformJobRequest {
        var TransformJobName: TransformJobName
        var ModelName: ModelName
        var MaxConcurrentTransforms: MaxConcurrentTransforms?
            get() = definedExternally
            set(value) = definedExternally
        var MaxPayloadInMB: MaxPayloadInMB?
            get() = definedExternally
            set(value) = definedExternally
        var BatchStrategy: String /* "MultiRecord" | "SingleRecord" | String */
        var Environment: TransformEnvironmentMap?
            get() = definedExternally
            set(value) = definedExternally
        var TransformInput: TransformInput
        var TransformOutput: TransformOutput
        var TransformResources: TransformResources
        var DataProcessing: DataProcessing?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentConfig: ExperimentConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTransformJobResponse {
        var TransformJobArn: TransformJobArn
    }
    interface CreateTrialComponentRequest {
        var TrialComponentName: ExperimentEntityName
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: TrialComponentStatus?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: TrialComponentParameters?
            get() = definedExternally
            set(value) = definedExternally
        var InputArtifacts: TrialComponentArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var OutputArtifacts: TrialComponentArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTrialComponentResponse {
        var TrialComponentArn: TrialComponentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTrialRequest {
        var TrialName: ExperimentEntityName
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentName: ExperimentEntityName
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTrialResponse {
        var TrialArn: TrialArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserProfileRequest {
        var DomainId: DomainId
        var UserProfileName: UserProfileName
        var SingleSignOnUserIdentifier: SingleSignOnUserIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var SingleSignOnUserValue: String256?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var UserSettings: UserSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserProfileResponse {
        var UserProfileArn: UserProfileArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWorkteamRequest {
        var WorkteamName: WorkteamName
        var MemberDefinitions: MemberDefinitions
        var Description: String200
        var NotificationConfiguration: NotificationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWorkteamResponse {
        var WorkteamArn: WorkteamArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataCaptureConfig {
        var EnableCapture: EnableCapture?
            get() = definedExternally
            set(value) = definedExternally
        var InitialSamplingPercentage: SamplingPercentage
        var DestinationS3Uri: DestinationS3Uri
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var CaptureOptions: CaptureOptionList
        var CaptureContentTypeHeader: CaptureContentTypeHeader?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataCaptureConfigSummary {
        var EnableCapture: EnableCapture
        var CaptureStatus: String /* "Started" | "Stopped" | String */
        var CurrentSamplingPercentage: SamplingPercentage
        var DestinationS3Uri: DestinationS3Uri
        var KmsKeyId: KmsKeyId
    }
    interface DataProcessing {
        var InputFilter: JsonPath?
            get() = definedExternally
            set(value) = definedExternally
        var OutputFilter: JsonPath?
            get() = definedExternally
            set(value) = definedExternally
        var JoinSource: String /* "Input" | "None" | String */
    }
    interface DataSource {
        var S3DataSource: S3DataSource?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemDataSource: FileSystemDataSource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DebugHookConfig {
        var LocalPath: DirectoryPath?
            get() = definedExternally
            set(value) = definedExternally
        var S3OutputPath: S3Uri
        var HookParameters: HookParameters?
            get() = definedExternally
            set(value) = definedExternally
        var CollectionConfigurations: CollectionConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DebugRuleConfiguration {
        var RuleConfigurationName: RuleConfigurationName
        var LocalPath: DirectoryPath?
            get() = definedExternally
            set(value) = definedExternally
        var S3OutputPath: S3Uri?
            get() = definedExternally
            set(value) = definedExternally
        var RuleEvaluatorImage: AlgorithmImage
        var InstanceType: String /* "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.r5.large" | "ml.r5.xlarge" | "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.8xlarge" | "ml.r5.12xlarge" | "ml.r5.16xlarge" | "ml.r5.24xlarge" | String */
        var VolumeSizeInGB: OptionalVolumeSizeInGB?
            get() = definedExternally
            set(value) = definedExternally
        var RuleParameters: RuleParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DebugRuleEvaluationStatus {
        var RuleConfigurationName: RuleConfigurationName?
            get() = definedExternally
            set(value) = definedExternally
        var RuleEvaluationJobArn: ProcessingJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var RuleEvaluationStatus: String /* "InProgress" | "NoIssuesFound" | "IssuesFound" | "Error" | "Stopping" | "Stopped" | String */
        var StatusDetails: StatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAlgorithmInput {
        var AlgorithmName: EntityName
    }
    interface DeleteAppRequest {
        var DomainId: DomainId
        var UserProfileName: UserProfileName
        var AppType: String /* "JupyterServer" | "KernelGateway" | "TensorBoard" | String */
        var AppName: AppName
    }
    interface DeleteCodeRepositoryInput {
        var CodeRepositoryName: EntityName
    }
    interface DeleteDomainRequest {
        var DomainId: DomainId
        var RetentionPolicy: RetentionPolicy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteEndpointConfigInput {
        var EndpointConfigName: EndpointConfigName
    }
    interface DeleteEndpointInput {
        var EndpointName: EndpointName
    }
    interface DeleteExperimentRequest {
        var ExperimentName: ExperimentEntityName
    }
    interface DeleteExperimentResponse {
        var ExperimentArn: ExperimentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFlowDefinitionRequest {
        var FlowDefinitionName: FlowDefinitionName
    }
    interface DeleteFlowDefinitionResponse
    interface DeleteModelInput {
        var ModelName: ModelName
    }
    interface DeleteModelPackageInput {
        var ModelPackageName: EntityName
    }
    interface DeleteMonitoringScheduleRequest {
        var MonitoringScheduleName: MonitoringScheduleName
    }
    interface DeleteNotebookInstanceInput {
        var NotebookInstanceName: NotebookInstanceName
    }
    interface DeleteNotebookInstanceLifecycleConfigInput {
        var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    }
    interface DeleteTagsInput {
        var ResourceArn: ResourceArn
        var TagKeys: TagKeyList
    }
    interface DeleteTagsOutput
    interface DeleteTrialComponentRequest {
        var TrialComponentName: ExperimentEntityName
    }
    interface DeleteTrialComponentResponse {
        var TrialComponentArn: TrialComponentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTrialRequest {
        var TrialName: ExperimentEntityName
    }
    interface DeleteTrialResponse {
        var TrialArn: TrialArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteUserProfileRequest {
        var DomainId: DomainId
        var UserProfileName: UserProfileName
    }
    interface DeleteWorkteamRequest {
        var WorkteamName: WorkteamName
    }
    interface DeleteWorkteamResponse {
        var Success: Success
    }
    interface DeployedImage {
        var SpecifiedImage: Image?
            get() = definedExternally
            set(value) = definedExternally
        var ResolvedImage: Image?
            get() = definedExternally
            set(value) = definedExternally
        var ResolutionTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAlgorithmInput {
        var AlgorithmName: ArnOrName
    }
    interface DescribeAlgorithmOutput {
        var AlgorithmName: EntityName
        var AlgorithmArn: AlgorithmArn
        var AlgorithmDescription: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime
        var TrainingSpecification: TrainingSpecification
        var InferenceSpecification: InferenceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationSpecification: AlgorithmValidationSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var AlgorithmStatus: String /* "Pending" | "InProgress" | "Completed" | "Failed" | "Deleting" | String */
        var AlgorithmStatusDetails: AlgorithmStatusDetails
        var ProductId: ProductId?
            get() = definedExternally
            set(value) = definedExternally
        var CertifyForMarketplace: CertifyForMarketplace?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAppRequest {
        var DomainId: DomainId
        var UserProfileName: UserProfileName
        var AppType: String /* "JupyterServer" | "KernelGateway" | "TensorBoard" | String */
        var AppName: AppName
    }
    interface DescribeAppResponse {
        var AppArn: AppArn?
            get() = definedExternally
            set(value) = definedExternally
        var AppType: String /* "JupyterServer" | "KernelGateway" | "TensorBoard" | String */
        var AppName: AppName?
            get() = definedExternally
            set(value) = definedExternally
        var DomainId: DomainId?
            get() = definedExternally
            set(value) = definedExternally
        var UserProfileName: UserProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Deleted" | "Deleting" | "Failed" | "InService" | "Pending" | String */
        var LastHealthCheckTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUserActivityTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceSpec: ResourceSpec?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAutoMLJobRequest {
        var AutoMLJobName: AutoMLJobName
    }
    interface DescribeAutoMLJobResponse {
        var AutoMLJobName: AutoMLJobName
        var AutoMLJobArn: AutoMLJobArn
        var InputDataConfig: AutoMLInputDataConfig
        var OutputDataConfig: AutoMLOutputDataConfig
        var RoleArn: RoleArn
        var AutoMLJobObjective: AutoMLJobObjective?
            get() = definedExternally
            set(value) = definedExternally
        var ProblemType: String /* "BinaryClassification" | "MulticlassClassification" | "Regression" | String */
        var AutoMLJobConfig: AutoMLJobConfig?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp
        var FailureReason: AutoMLFailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var BestCandidate: AutoMLCandidate?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMLJobStatus: String /* "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping" | String */
        var AutoMLJobSecondaryStatus: String /* "Starting" | "AnalyzingData" | "FeatureEngineering" | "ModelTuning" | "MaxCandidatesReached" | "Failed" | "Stopped" | "MaxAutoMLJobRuntimeReached" | "Stopping" | "CandidateDefinitionsGenerated" | String */
        var GenerateCandidateDefinitionsOnly: GenerateCandidateDefinitionsOnly?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMLJobArtifacts: AutoMLJobArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var ResolvedAttributes: ResolvedAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCodeRepositoryInput {
        var CodeRepositoryName: EntityName
    }
    interface DescribeCodeRepositoryOutput {
        var CodeRepositoryName: EntityName
        var CodeRepositoryArn: CodeRepositoryArn
        var CreationTime: CreationTime
        var LastModifiedTime: LastModifiedTime
        var GitConfig: GitConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCompilationJobRequest {
        var CompilationJobName: EntityName
    }
    interface DescribeCompilationJobResponse {
        var CompilationJobName: EntityName
        var CompilationJobArn: CompilationJobArn
        var CompilationJobStatus: String /* "INPROGRESS" | "COMPLETED" | "FAILED" | "STARTING" | "STOPPING" | "STOPPED" | String */
        var CompilationStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompilationEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StoppingCondition: StoppingCondition
        var CreationTime: CreationTime
        var LastModifiedTime: LastModifiedTime
        var FailureReason: FailureReason
        var ModelArtifacts: ModelArtifacts
        var RoleArn: RoleArn
        var InputConfig: InputConfig
        var OutputConfig: OutputConfig
    }
    interface DescribeDomainRequest {
        var DomainId: DomainId
    }
    interface DescribeDomainResponse {
        var DomainArn: DomainArn?
            get() = definedExternally
            set(value) = definedExternally
        var DomainId: DomainId?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var HomeEfsFileSystemId: ResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var SingleSignOnManagedApplicationInstanceId: String256?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Deleting" | "Failed" | "InService" | "Pending" | String */
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var AuthMode: String /* "SSO" | "IAM" | String */
        var DefaultUserSettings: UserSettings?
            get() = definedExternally
            set(value) = definedExternally
        var HomeEfsFileSystemKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: Subnets?
            get() = definedExternally
            set(value) = definedExternally
        var Url: String1024?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEndpointConfigInput {
        var EndpointConfigName: EndpointConfigName
    }
    interface DescribeEndpointConfigOutput {
        var EndpointConfigName: EndpointConfigName
        var EndpointConfigArn: EndpointConfigArn
        var ProductionVariants: ProductionVariantList
        var DataCaptureConfig: DataCaptureConfig?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp
    }
    interface DescribeEndpointInput {
        var EndpointName: EndpointName
    }
    interface DescribeEndpointOutput {
        var EndpointName: EndpointName
        var EndpointArn: EndpointArn
        var EndpointConfigName: EndpointConfigName
        var ProductionVariants: ProductionVariantSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var DataCaptureConfig: DataCaptureConfigSummary?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointStatus: String /* "OutOfService" | "Creating" | "Updating" | "SystemUpdating" | "RollingBack" | "InService" | "Deleting" | "Failed" | String */
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp
        var LastModifiedTime: Timestamp
    }
    interface DescribeExperimentRequest {
        var ExperimentName: ExperimentEntityName
    }
    interface DescribeExperimentResponse {
        var ExperimentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentArn: ExperimentArn?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Source: ExperimentSource?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ExperimentDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFlowDefinitionRequest {
        var FlowDefinitionName: FlowDefinitionName
    }
    interface DescribeFlowDefinitionResponse {
        var FlowDefinitionArn: FlowDefinitionArn
        var FlowDefinitionName: FlowDefinitionName
        var FlowDefinitionStatus: String /* "Initializing" | "Active" | "Failed" | "Deleting" | String */
        var CreationTime: Timestamp
        var HumanLoopRequestSource: HumanLoopRequestSource?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopActivationConfig: HumanLoopActivationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopConfig: HumanLoopConfig
        var OutputConfig: FlowDefinitionOutputConfig
        var RoleArn: RoleArn
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeHumanTaskUiRequest {
        var HumanTaskUiName: HumanTaskUiName
    }
    interface DescribeHumanTaskUiResponse {
        var HumanTaskUiArn: HumanTaskUiArn
        var HumanTaskUiName: HumanTaskUiName
        var CreationTime: Timestamp
        var UiTemplate: UiTemplateInfo
    }
    interface DescribeHyperParameterTuningJobRequest {
        var HyperParameterTuningJobName: HyperParameterTuningJobName
    }
    interface DescribeHyperParameterTuningJobResponse {
        var HyperParameterTuningJobName: HyperParameterTuningJobName
        var HyperParameterTuningJobArn: HyperParameterTuningJobArn
        var HyperParameterTuningJobConfig: HyperParameterTuningJobConfig
        var TrainingJobDefinition: HyperParameterTrainingJobDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobDefinitions: HyperParameterTrainingJobDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var HyperParameterTuningJobStatus: String /* "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping" | String */
        var CreationTime: Timestamp
        var HyperParameterTuningEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobStatusCounters: TrainingJobStatusCounters
        var ObjectiveStatusCounters: ObjectiveStatusCounters
        var BestTrainingJob: HyperParameterTrainingJobSummary?
            get() = definedExternally
            set(value) = definedExternally
        var OverallBestTrainingJob: HyperParameterTrainingJobSummary?
            get() = definedExternally
            set(value) = definedExternally
        var WarmStartConfig: HyperParameterTuningJobWarmStartConfig?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLabelingJobRequest {
        var LabelingJobName: LabelingJobName
    }
    interface DescribeLabelingJobResponse {
        var LabelingJobStatus: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var LabelCounters: LabelCounters
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp
        var LastModifiedTime: Timestamp
        var JobReferenceCode: JobReferenceCode
        var LabelingJobName: LabelingJobName
        var LabelingJobArn: LabelingJobArn
        var LabelAttributeName: LabelAttributeName?
            get() = definedExternally
            set(value) = definedExternally
        var InputConfig: LabelingJobInputConfig
        var OutputConfig: LabelingJobOutputConfig
        var RoleArn: RoleArn
        var LabelCategoryConfigS3Uri: S3Uri?
            get() = definedExternally
            set(value) = definedExternally
        var StoppingConditions: LabelingJobStoppingConditions?
            get() = definedExternally
            set(value) = definedExternally
        var LabelingJobAlgorithmsConfig: LabelingJobAlgorithmsConfig?
            get() = definedExternally
            set(value) = definedExternally
        var HumanTaskConfig: HumanTaskConfig
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var LabelingJobOutput: LabelingJobOutput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeModelInput {
        var ModelName: ModelName
    }
    interface DescribeModelOutput {
        var ModelName: ModelName
        var PrimaryContainer: ContainerDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var Containers: ContainerDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleArn: RoleArn
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp
        var ModelArn: ModelArn
        var EnableNetworkIsolation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeModelPackageInput {
        var ModelPackageName: ArnOrName
    }
    interface DescribeModelPackageOutput {
        var ModelPackageName: EntityName
        var ModelPackageArn: ModelPackageArn
        var ModelPackageDescription: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime
        var InferenceSpecification: InferenceSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var SourceAlgorithmSpecification: SourceAlgorithmSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationSpecification: ModelPackageValidationSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ModelPackageStatus: String /* "Pending" | "InProgress" | "Completed" | "Failed" | "Deleting" | String */
        var ModelPackageStatusDetails: ModelPackageStatusDetails
        var CertifyForMarketplace: CertifyForMarketplace?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMonitoringScheduleRequest {
        var MonitoringScheduleName: MonitoringScheduleName
    }
    interface DescribeMonitoringScheduleResponse {
        var MonitoringScheduleArn: MonitoringScheduleArn
        var MonitoringScheduleName: MonitoringScheduleName
        var MonitoringScheduleStatus: String /* "Pending" | "Failed" | "Scheduled" | "Stopped" | String */
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp
        var LastModifiedTime: Timestamp
        var MonitoringScheduleConfig: MonitoringScheduleConfig
        var EndpointName: EndpointName?
            get() = definedExternally
            set(value) = definedExternally
        var LastMonitoringExecutionSummary: MonitoringExecutionSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNotebookInstanceInput {
        var NotebookInstanceName: NotebookInstanceName
    }
    interface DescribeNotebookInstanceLifecycleConfigInput {
        var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
    }
    interface DescribeNotebookInstanceLifecycleConfigOutput {
        var NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn?
            get() = definedExternally
            set(value) = definedExternally
        var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var OnCreate: NotebookInstanceLifecycleConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var OnStart: NotebookInstanceLifecycleConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeNotebookInstanceOutput {
        var NotebookInstanceArn: NotebookInstanceArn?
            get() = definedExternally
            set(value) = definedExternally
        var NotebookInstanceName: NotebookInstanceName?
            get() = definedExternally
            set(value) = definedExternally
        var NotebookInstanceStatus: String /* "Pending" | "InService" | "Stopping" | "Stopped" | "Failed" | "Deleting" | "Updating" | String */
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var Url: NotebookInstanceUrl?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String /* "ml.t2.medium" | "ml.t2.large" | "ml.t2.xlarge" | "ml.t2.2xlarge" | "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5d.xlarge" | "ml.c5d.2xlarge" | "ml.c5d.4xlarge" | "ml.c5d.9xlarge" | "ml.c5d.18xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | String */
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfaceId: NetworkInterfaceId?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var DirectInternetAccess: String /* "Enabled" | "Disabled" | String */
        var VolumeSizeInGB: NotebookInstanceVolumeSizeInGB?
            get() = definedExternally
            set(value) = definedExternally
        var AcceleratorTypes: NotebookInstanceAcceleratorTypes?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultCodeRepository: CodeRepositoryNameOrUrl?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalCodeRepositories: AdditionalCodeRepositoryNamesOrUrls?
            get() = definedExternally
            set(value) = definedExternally
        var RootAccess: String /* "Enabled" | "Disabled" | String */
    }
    interface DescribeProcessingJobRequest {
        var ProcessingJobName: ProcessingJobName
    }
    interface DescribeProcessingJobResponse {
        var ProcessingInputs: ProcessingInputs?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingOutputConfig: ProcessingOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingJobName: ProcessingJobName
        var ProcessingResources: ProcessingResources
        var StoppingCondition: ProcessingStoppingCondition?
            get() = definedExternally
            set(value) = definedExternally
        var AppSpecification: AppSpecification
        var Environment: ProcessingEnvironmentMap?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkConfig: NetworkConfig?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentConfig: ExperimentConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingJobArn: ProcessingJobArn
        var ProcessingJobStatus: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var ExitMessage: ExitMessage?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp
        var MonitoringScheduleArn: MonitoringScheduleArn?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMLJobArn: AutoMLJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobArn: TrainingJobArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSubscribedWorkteamRequest {
        var WorkteamArn: WorkteamArn
    }
    interface DescribeSubscribedWorkteamResponse {
        var SubscribedWorkteam: SubscribedWorkteam
    }
    interface DescribeTrainingJobRequest {
        var TrainingJobName: TrainingJobName
    }
    interface DescribeTrainingJobResponse {
        var TrainingJobName: TrainingJobName
        var TrainingJobArn: TrainingJobArn
        var TuningJobArn: HyperParameterTuningJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var LabelingJobArn: LabelingJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMLJobArn: AutoMLJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var ModelArtifacts: ModelArtifacts
        var TrainingJobStatus: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var SecondaryStatus: String /* "Starting" | "LaunchingMLInstances" | "PreparingTrainingStack" | "Downloading" | "DownloadingTrainingImage" | "Training" | "Uploading" | "Stopping" | "Stopped" | "MaxRuntimeExceeded" | "Completed" | "Failed" | "Interrupted" | "MaxWaitTimeExceeded" | String */
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var HyperParameters: HyperParameters?
            get() = definedExternally
            set(value) = definedExternally
        var AlgorithmSpecification: AlgorithmSpecification
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceConfig: ResourceConfig
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var StoppingCondition: StoppingCondition
        var CreationTime: Timestamp
        var TrainingStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SecondaryStatusTransitions: SecondaryStatusTransitions?
            get() = definedExternally
            set(value) = definedExternally
        var FinalMetricDataList: FinalMetricDataList?
            get() = definedExternally
            set(value) = definedExternally
        var EnableNetworkIsolation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableInterContainerTrafficEncryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableManagedSpotTraining: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CheckpointConfig: CheckpointConfig?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingTimeInSeconds: TrainingTimeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var BillableTimeInSeconds: BillableTimeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var DebugHookConfig: DebugHookConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentConfig: ExperimentConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DebugRuleConfigurations: DebugRuleConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var TensorBoardOutputConfig: TensorBoardOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DebugRuleEvaluationStatuses: DebugRuleEvaluationStatuses?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTransformJobRequest {
        var TransformJobName: TransformJobName
    }
    interface DescribeTransformJobResponse {
        var TransformJobName: TransformJobName
        var TransformJobArn: TransformJobArn
        var TransformJobStatus: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var ModelName: ModelName
        var MaxConcurrentTransforms: MaxConcurrentTransforms?
            get() = definedExternally
            set(value) = definedExternally
        var MaxPayloadInMB: MaxPayloadInMB?
            get() = definedExternally
            set(value) = definedExternally
        var BatchStrategy: String /* "MultiRecord" | "SingleRecord" | String */
        var Environment: TransformEnvironmentMap?
            get() = definedExternally
            set(value) = definedExternally
        var TransformInput: TransformInput
        var TransformOutput: TransformOutput?
            get() = definedExternally
            set(value) = definedExternally
        var TransformResources: TransformResources
        var CreationTime: Timestamp
        var TransformStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TransformEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LabelingJobArn: LabelingJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMLJobArn: AutoMLJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var DataProcessing: DataProcessing?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentConfig: ExperimentConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTrialComponentRequest {
        var TrialComponentName: ExperimentEntityName
    }
    interface DescribeTrialComponentResponse {
        var TrialComponentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialComponentArn: TrialComponentArn?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Source: TrialComponentSource?
            get() = definedExternally
            set(value) = definedExternally
        var Status: TrialComponentStatus?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: TrialComponentParameters?
            get() = definedExternally
            set(value) = definedExternally
        var InputArtifacts: TrialComponentArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var OutputArtifacts: TrialComponentArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: TrialComponentMetricSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTrialRequest {
        var TrialName: ExperimentEntityName
    }
    interface DescribeTrialResponse {
        var TrialName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialArn: TrialArn?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Source: TrialSource?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserProfileRequest {
        var DomainId: DomainId
        var UserProfileName: UserProfileName
    }
    interface DescribeUserProfileResponse {
        var DomainId: DomainId?
            get() = definedExternally
            set(value) = definedExternally
        var UserProfileArn: UserProfileArn?
            get() = definedExternally
            set(value) = definedExternally
        var UserProfileName: UserProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var HomeEfsFileSystemUid: EfsUid?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Deleting" | "Failed" | "InService" | "Pending" | String */
        var LastModifiedTime: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var SingleSignOnUserIdentifier: SingleSignOnUserIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var SingleSignOnUserValue: String256?
            get() = definedExternally
            set(value) = definedExternally
        var UserSettings: UserSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeWorkforceRequest {
        var WorkforceName: WorkforceName
    }
    interface DescribeWorkforceResponse {
        var Workforce: Workforce
    }
    interface DescribeWorkteamRequest {
        var WorkteamName: WorkteamName
    }
    interface DescribeWorkteamResponse {
        var Workteam: Workteam
    }
    interface DesiredWeightAndCapacity {
        var VariantName: VariantName
        var DesiredWeight: VariantWeight?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredInstanceCount: TaskCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateTrialComponentRequest {
        var TrialComponentName: ExperimentEntityName
        var TrialName: ExperimentEntityName
    }
    interface DisassociateTrialComponentResponse {
        var TrialComponentArn: TrialComponentArn?
            get() = definedExternally
            set(value) = definedExternally
        var TrialArn: TrialArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainDetails {
        var DomainArn: DomainArn?
            get() = definedExternally
            set(value) = definedExternally
        var DomainId: DomainId?
            get() = definedExternally
            set(value) = definedExternally
        var DomainName: DomainName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Deleting" | "Failed" | "InService" | "Pending" | String */
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var Url: String1024?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EndpointConfigSummary {
        var EndpointConfigName: EndpointConfigName
        var EndpointConfigArn: EndpointConfigArn
        var CreationTime: Timestamp
    }
    interface EndpointInput {
        var EndpointName: EndpointName
        var LocalPath: ProcessingLocalPath
        var S3InputMode: String /* "Pipe" | "File" | String */
        var S3DataDistributionType: String /* "FullyReplicated" | "ShardedByS3Key" | String */
    }
    interface EndpointSummary {
        var EndpointName: EndpointName
        var EndpointArn: EndpointArn
        var CreationTime: Timestamp
        var LastModifiedTime: Timestamp
        var EndpointStatus: String /* "OutOfService" | "Creating" | "Updating" | "SystemUpdating" | "RollingBack" | "InService" | "Deleting" | "Failed" | String */
    }
    interface EnvironmentMap {
        @nativeGetter
        operator fun get(key: String): EnvironmentValue?
        @nativeSetter
        operator fun set(key: String, value: EnvironmentValue)
    }
    interface Experiment {
        var ExperimentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentArn: ExperimentArn?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Source: ExperimentSource?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ExperimentDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExperimentConfig {
        var ExperimentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialComponentDisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExperimentSource {
        var SourceArn: ExperimentSourceArn
        var SourceType: SourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExperimentSummary {
        var ExperimentArn: ExperimentArn?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentSource: ExperimentSource?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FileSystemDataSource {
        var FileSystemId: FileSystemId
        var FileSystemAccessMode: String /* "rw" | "ro" | String */
        var FileSystemType: String /* "EFS" | "FSxLustre" | String */
        var DirectoryPath: DirectoryPath
    }
    interface Filter {
        var Name: ResourcePropertyName
        var Operator: String /* "Equals" | "NotEquals" | "GreaterThan" | "GreaterThanOrEqualTo" | "LessThan" | "LessThanOrEqualTo" | "Contains" | "Exists" | "NotExists" | "In" | String */
        var Value: FilterValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FinalAutoMLJobObjectiveMetric {
        var Type: String /* "Maximize" | "Minimize" | String */
        var MetricName: String /* "Accuracy" | "MSE" | "F1" | "F1macro" | String */
        var Value: MetricValue
    }
    interface FinalHyperParameterTuningJobObjectiveMetric {
        var Type: String /* "Maximize" | "Minimize" | String */
        var MetricName: MetricName
        var Value: MetricValue
    }
    interface FlowDefinitionOutputConfig {
        var S3OutputPath: S3Uri
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FlowDefinitionSummary {
        var FlowDefinitionName: FlowDefinitionName
        var FlowDefinitionArn: FlowDefinitionArn
        var FlowDefinitionStatus: String /* "Initializing" | "Active" | "Failed" | "Deleting" | String */
        var CreationTime: Timestamp
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSearchSuggestionsRequest {
        var Resource: String /* "TrainingJob" | "Experiment" | "ExperimentTrial" | "ExperimentTrialComponent" | String */
        var SuggestionQuery: SuggestionQuery?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSearchSuggestionsResponse {
        var PropertyNameSuggestions: PropertyNameSuggestionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GitConfig {
        var RepositoryUrl: GitConfigUrl
        var Branch: Branch?
            get() = definedExternally
            set(value) = definedExternally
        var SecretArn: SecretArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GitConfigForUpdate {
        var SecretArn: SecretArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HookParameters {
        @nativeGetter
        operator fun get(key: String): ConfigValue?
        @nativeSetter
        operator fun set(key: String, value: ConfigValue)
    }
    interface HumanLoopActivationConditionsConfig {
        var HumanLoopActivationConditions: HumanLoopActivationConditions
    }
    interface HumanLoopActivationConfig {
        var HumanLoopActivationConditionsConfig: HumanLoopActivationConditionsConfig
    }
    interface HumanLoopConfig {
        var WorkteamArn: WorkteamArn
        var HumanTaskUiArn: HumanTaskUiArn
        var TaskTitle: FlowDefinitionTaskTitle
        var TaskDescription: FlowDefinitionTaskDescription
        var TaskCount: FlowDefinitionTaskCount
        var TaskAvailabilityLifetimeInSeconds: FlowDefinitionTaskAvailabilityLifetimeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var TaskTimeLimitInSeconds: FlowDefinitionTaskTimeLimitInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var TaskKeywords: FlowDefinitionTaskKeywords?
            get() = definedExternally
            set(value) = definedExternally
        var PublicWorkforceTaskPrice: PublicWorkforceTaskPrice?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HumanLoopRequestSource {
        var AwsManagedHumanLoopRequestSource: String /* "AWS/Rekognition/DetectModerationLabels/Image/V3" | "AWS/Textract/AnalyzeDocument/Forms/V1" | String */
    }
    interface HumanTaskConfig {
        var WorkteamArn: WorkteamArn
        var UiConfig: UiConfig
        var PreHumanTaskLambdaArn: LambdaFunctionArn
        var TaskKeywords: TaskKeywords?
            get() = definedExternally
            set(value) = definedExternally
        var TaskTitle: TaskTitle
        var TaskDescription: TaskDescription
        var NumberOfHumanWorkersPerDataObject: NumberOfHumanWorkersPerDataObject
        var TaskTimeLimitInSeconds: TaskTimeLimitInSeconds
        var TaskAvailabilityLifetimeInSeconds: TaskAvailabilityLifetimeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrentTaskCount: MaxConcurrentTaskCount?
            get() = definedExternally
            set(value) = definedExternally
        var AnnotationConsolidationConfig: AnnotationConsolidationConfig
        var PublicWorkforceTaskPrice: PublicWorkforceTaskPrice?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HumanTaskUiSummary {
        var HumanTaskUiName: HumanTaskUiName
        var HumanTaskUiArn: HumanTaskUiArn
        var CreationTime: Timestamp
    }
    interface HyperParameterAlgorithmSpecification {
        var TrainingImage: AlgorithmImage?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingInputMode: String /* "Pipe" | "File" | String */
        var AlgorithmName: ArnOrName?
            get() = definedExternally
            set(value) = definedExternally
        var MetricDefinitions: MetricDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HyperParameterSpecification {
        var Name: ParameterName
        var Description: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "Integer" | "Continuous" | "Categorical" | "FreeText" | String */
        var Range: ParameterRange?
            get() = definedExternally
            set(value) = definedExternally
        var IsTunable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IsRequired: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValue: ParameterValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HyperParameterTrainingJobDefinition {
        var DefinitionName: HyperParameterTrainingJobDefinitionName?
            get() = definedExternally
            set(value) = definedExternally
        var TuningObjective: HyperParameterTuningJobObjective?
            get() = definedExternally
            set(value) = definedExternally
        var HyperParameterRanges: ParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var StaticHyperParameters: HyperParameters?
            get() = definedExternally
            set(value) = definedExternally
        var AlgorithmSpecification: HyperParameterAlgorithmSpecification
        var RoleArn: RoleArn
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig
        var ResourceConfig: ResourceConfig
        var StoppingCondition: StoppingCondition
        var EnableNetworkIsolation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableInterContainerTrafficEncryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableManagedSpotTraining: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CheckpointConfig: CheckpointConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HyperParameterTrainingJobSummary {
        var TrainingJobDefinitionName: HyperParameterTrainingJobDefinitionName?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobName: TrainingJobName
        var TrainingJobArn: TrainingJobArn
        var TuningJobName: HyperParameterTuningJobName?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp
        var TrainingStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobStatus: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var TunedHyperParameters: HyperParameters
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var FinalHyperParameterTuningJobObjectiveMetric: FinalHyperParameterTuningJobObjectiveMetric?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectiveStatus: String /* "Succeeded" | "Pending" | "Failed" | String */
    }
    interface HyperParameterTuningJobConfig {
        var Strategy: String /* "Bayesian" | "Random" | String */
        var HyperParameterTuningJobObjective: HyperParameterTuningJobObjective?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceLimits: ResourceLimits
        var ParameterRanges: ParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobEarlyStoppingType: String /* "Off" | "Auto" | String */
        var TuningJobCompletionCriteria: TuningJobCompletionCriteria?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HyperParameterTuningJobObjective {
        var Type: String /* "Maximize" | "Minimize" | String */
        var MetricName: MetricName
    }
    interface HyperParameterTuningJobSummary {
        var HyperParameterTuningJobName: HyperParameterTuningJobName
        var HyperParameterTuningJobArn: HyperParameterTuningJobArn
        var HyperParameterTuningJobStatus: String /* "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping" | String */
        var Strategy: String /* "Bayesian" | "Random" | String */
        var CreationTime: Timestamp
        var HyperParameterTuningEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobStatusCounters: TrainingJobStatusCounters
        var ObjectiveStatusCounters: ObjectiveStatusCounters
        var ResourceLimits: ResourceLimits?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HyperParameterTuningJobWarmStartConfig {
        var ParentHyperParameterTuningJobs: ParentHyperParameterTuningJobs
        var WarmStartType: String /* "IdenticalDataAndAlgorithm" | "TransferLearning" | String */
    }
    interface HyperParameters {
        @nativeGetter
        operator fun get(key: String): ParameterValue?
        @nativeSetter
        operator fun set(key: String, value: ParameterValue)
    }
    interface InferenceSpecification {
        var Containers: ModelPackageContainerDefinitionList
        var SupportedTransformInstanceTypes: TransformInstanceTypes
        var SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes
        var SupportedContentTypes: ContentTypes
        var SupportedResponseMIMETypes: ResponseMIMETypes
    }
    interface InputConfig {
        var S3Uri: S3Uri
        var DataInputConfig: DataInputConfig
        var Framework: String /* "TENSORFLOW" | "KERAS" | "MXNET" | "ONNX" | "PYTORCH" | "XGBOOST" | String */
    }
    interface IntegerParameterRange {
        var Name: ParameterKey
        var MinValue: ParameterValue
        var MaxValue: ParameterValue
        var ScalingType: String /* "Auto" | "Linear" | "Logarithmic" | "ReverseLogarithmic" | String */
    }
    interface IntegerParameterRangeSpecification {
        var MinValue: ParameterValue
        var MaxValue: ParameterValue
    }
    interface JupyterServerAppSettings {
        var DefaultResourceSpec: ResourceSpec?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KernelGatewayAppSettings {
        var DefaultResourceSpec: ResourceSpec?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelCounters {
        var TotalLabeled: LabelCounter?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLabeled: LabelCounter?
            get() = definedExternally
            set(value) = definedExternally
        var MachineLabeled: LabelCounter?
            get() = definedExternally
            set(value) = definedExternally
        var FailedNonRetryableError: LabelCounter?
            get() = definedExternally
            set(value) = definedExternally
        var Unlabeled: LabelCounter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelCountersForWorkteam {
        var HumanLabeled: LabelCounter?
            get() = definedExternally
            set(value) = definedExternally
        var PendingHuman: LabelCounter?
            get() = definedExternally
            set(value) = definedExternally
        var Total: LabelCounter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelingJobAlgorithmsConfig {
        var LabelingJobAlgorithmSpecificationArn: LabelingJobAlgorithmSpecificationArn
        var InitialActiveLearningModelArn: ModelArn?
            get() = definedExternally
            set(value) = definedExternally
        var LabelingJobResourceConfig: LabelingJobResourceConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelingJobDataAttributes {
        var ContentClassifiers: ContentClassifiers?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelingJobDataSource {
        var S3DataSource: LabelingJobS3DataSource
    }
    interface LabelingJobForWorkteamSummary {
        var LabelingJobName: LabelingJobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobReferenceCode: JobReferenceCode
        var WorkRequesterAccountId: AccountId
        var CreationTime: Timestamp
        var LabelCounters: LabelCountersForWorkteam?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfHumanWorkersPerDataObject: NumberOfHumanWorkersPerDataObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelingJobInputConfig {
        var DataSource: LabelingJobDataSource
        var DataAttributes: LabelingJobDataAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelingJobOutput {
        var OutputDatasetS3Uri: S3Uri
        var FinalActiveLearningModelArn: ModelArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelingJobOutputConfig {
        var S3OutputPath: S3Uri
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelingJobResourceConfig {
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelingJobS3DataSource {
        var ManifestS3Uri: S3Uri
    }
    interface LabelingJobStoppingConditions {
        var MaxHumanLabeledObjectCount: MaxHumanLabeledObjectCount?
            get() = definedExternally
            set(value) = definedExternally
        var MaxPercentageOfInputDatasetLabeled: MaxPercentageOfInputDatasetLabeled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LabelingJobSummary {
        var LabelingJobName: LabelingJobName
        var LabelingJobArn: LabelingJobArn
        var CreationTime: Timestamp
        var LastModifiedTime: Timestamp
        var LabelingJobStatus: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var LabelCounters: LabelCounters
        var WorkteamArn: WorkteamArn
        var PreHumanTaskLambdaArn: LambdaFunctionArn
        var AnnotationConsolidationLambdaArn: LambdaFunctionArn?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var LabelingJobOutput: LabelingJobOutput?
            get() = definedExternally
            set(value) = definedExternally
        var InputConfig: LabelingJobInputConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAlgorithmsInput {
        var CreationTimeAfter: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: NameContains?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "CreationTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
    }
    interface ListAlgorithmsOutput {
        var AlgorithmSummaryList: AlgorithmSummaryList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAppsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var SortBy: String /* "CreationTime" | String */
        var DomainIdEquals: DomainId?
            get() = definedExternally
            set(value) = definedExternally
        var UserProfileNameEquals: UserProfileName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAppsResponse {
        var Apps: AppList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAutoMLJobsRequest {
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: AutoMLNameContains?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var SortBy: String /* "Name" | "CreationTime" | "Status" | String */
        var MaxResults: AutoMLMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAutoMLJobsResponse {
        var AutoMLJobSummaries: AutoMLJobSummaries
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCandidatesForAutoMLJobRequest {
        var AutoMLJobName: AutoMLJobName
        var StatusEquals: String /* "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping" | String */
        var CandidateNameEquals: CandidateName?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var SortBy: String /* "CreationTime" | "Status" | "FinalObjectiveMetricValue" | String */
        var MaxResults: AutoMLMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCandidatesForAutoMLJobResponse {
        var Candidates: AutoMLCandidates
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCodeRepositoriesInput {
        var CreationTimeAfter: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: CodeRepositoryNameContains?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "CreationTime" | "LastModifiedTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
    }
    interface ListCodeRepositoriesOutput {
        var CodeRepositorySummaryList: CodeRepositorySummaryList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCompilationJobsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: NameContains?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "INPROGRESS" | "COMPLETED" | "FAILED" | "STARTING" | "STOPPING" | "STOPPED" | String */
        var SortBy: String /* "Name" | "CreationTime" | "Status" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
    }
    interface ListCompilationJobsResponse {
        var CompilationJobSummaries: CompilationJobSummaries
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDomainsResponse {
        var Domains: DomainList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEndpointConfigsInput {
        var SortBy: String /* "Name" | "CreationTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: EndpointConfigNameContains?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEndpointConfigsOutput {
        var EndpointConfigs: EndpointConfigSummaryList
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEndpointsInput {
        var SortBy: String /* "Name" | "CreationTime" | "Status" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: EndpointNameContains?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "OutOfService" | "Creating" | "Updating" | "SystemUpdating" | "RollingBack" | "InService" | "Deleting" | "Failed" | String */
    }
    interface ListEndpointsOutput {
        var Endpoints: EndpointSummaryList
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListExperimentsRequest {
        var CreatedAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "CreationTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListExperimentsResponse {
        var ExperimentSummaries: ExperimentSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFlowDefinitionsRequest {
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFlowDefinitionsResponse {
        var FlowDefinitionSummaries: FlowDefinitionSummaries
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHumanTaskUisRequest {
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHumanTaskUisResponse {
        var HumanTaskUiSummaries: HumanTaskUiSummaries
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHyperParameterTuningJobsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "Status" | "CreationTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NameContains: NameContains?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "Completed" | "InProgress" | "Failed" | "Stopped" | "Stopping" | String */
    }
    interface ListHyperParameterTuningJobsResponse {
        var HyperParameterTuningJobSummaries: HyperParameterTuningJobSummaries
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLabelingJobsForWorkteamRequest {
        var WorkteamArn: WorkteamArn
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var JobReferenceCodeContains: JobReferenceCodeContains?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "CreationTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
    }
    interface ListLabelingJobsForWorkteamResponse {
        var LabelingJobSummaryList: LabelingJobForWorkteamSummaryList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLabelingJobsRequest {
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: NameContains?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "CreationTime" | "Status" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var StatusEquals: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
    }
    interface ListLabelingJobsResponse {
        var LabelingJobSummaryList: LabelingJobSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListModelPackagesInput {
        var CreationTimeAfter: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: NameContains?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "CreationTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
    }
    interface ListModelPackagesOutput {
        var ModelPackageSummaryList: ModelPackageSummaryList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListModelsInput {
        var SortBy: String /* "Name" | "CreationTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: ModelNameContains?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListModelsOutput {
        var Models: ModelSummaryList
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMonitoringExecutionsRequest {
        var MonitoringScheduleName: MonitoringScheduleName?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointName: EndpointName?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "CreationTime" | "ScheduledTime" | "Status" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduledTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "Pending" | "Completed" | "CompletedWithViolations" | "InProgress" | "Failed" | "Stopping" | "Stopped" | String */
    }
    interface ListMonitoringExecutionsResponse {
        var MonitoringExecutionSummaries: MonitoringExecutionSummaryList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMonitoringSchedulesRequest {
        var EndpointName: EndpointName?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "CreationTime" | "Status" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: NameContains?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "Pending" | "Failed" | "Scheduled" | "Stopped" | String */
    }
    interface ListMonitoringSchedulesResponse {
        var MonitoringScheduleSummaries: MonitoringScheduleSummaryList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNotebookInstanceLifecycleConfigsInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "CreationTime" | "LastModifiedTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NameContains: NotebookInstanceLifecycleConfigNameContains?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNotebookInstanceLifecycleConfigsOutput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var NotebookInstanceLifecycleConfigs: NotebookInstanceLifecycleConfigSummaryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNotebookInstancesInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "CreationTime" | "Status" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NameContains: NotebookInstanceNameContains?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "Pending" | "InService" | "Stopping" | "Stopped" | "Failed" | "Deleting" | "Updating" | String */
        var NotebookInstanceLifecycleConfigNameContains: NotebookInstanceLifecycleConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultCodeRepositoryContains: CodeRepositoryContains?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalCodeRepositoryEquals: CodeRepositoryNameOrUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNotebookInstancesOutput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var NotebookInstances: NotebookInstanceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProcessingJobsRequest {
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: String?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var SortBy: String /* "Name" | "CreationTime" | "Status" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProcessingJobsResponse {
        var ProcessingJobSummaries: ProcessingJobSummaries
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscribedWorkteamsRequest {
        var NameContains: WorkteamName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscribedWorkteamsResponse {
        var SubscribedWorkteams: SubscribedWorkteams
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsInput {
        var ResourceArn: ResourceArn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ListTagsMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsOutput {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrainingJobsForHyperParameterTuningJobRequest {
        var HyperParameterTuningJobName: HyperParameterTuningJobName
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var SortBy: String /* "Name" | "CreationTime" | "Status" | "FinalObjectiveMetricValue" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
    }
    interface ListTrainingJobsForHyperParameterTuningJobResponse {
        var TrainingJobSummaries: HyperParameterTrainingJobSummaries
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrainingJobsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: NameContains?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var SortBy: String /* "Name" | "CreationTime" | "Status" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
    }
    interface ListTrainingJobsResponse {
        var TrainingJobSummaries: TrainingJobSummaries
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTransformJobsRequest {
        var CreationTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var NameContains: NameContains?
            get() = definedExternally
            set(value) = definedExternally
        var StatusEquals: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var SortBy: String /* "Name" | "CreationTime" | "Status" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTransformJobsResponse {
        var TransformJobSummaries: TransformJobSummaries
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrialComponentsRequest {
        var ExperimentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: String256?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "CreationTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrialComponentsResponse {
        var TrialComponentSummaries: TrialComponentSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrialsRequest {
        var ExperimentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialComponentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: String /* "Name" | "CreationTime" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrialsResponse {
        var TrialSummaries: TrialSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserProfilesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var SortBy: String /* "CreationTime" | "LastModifiedTime" | String */
        var DomainIdEquals: DomainId?
            get() = definedExternally
            set(value) = definedExternally
        var UserProfileNameContains: UserProfileName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserProfilesResponse {
        var UserProfiles: UserProfileList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkteamsRequest {
        var SortBy: String /* "Name" | "CreateDate" | String */
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NameContains: WorkteamName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkteamsResponse {
        var Workteams: Workteams
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberDefinition {
        var CognitoMemberDefinition: CognitoMemberDefinition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricData {
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var Value: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MetricDefinition {
        var Name: MetricName
        var Regex: MetricRegex
    }
    interface ModelArtifacts {
        var S3ModelArtifacts: S3Uri
    }
    interface ModelPackageContainerDefinition {
        var ContainerHostname: ContainerHostname?
            get() = definedExternally
            set(value) = definedExternally
        var Image: Image
        var ImageDigest: ImageDigest?
            get() = definedExternally
            set(value) = definedExternally
        var ModelDataUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var ProductId: ProductId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModelPackageStatusDetails {
        var ValidationStatuses: ModelPackageStatusItemList
        var ImageScanStatuses: ModelPackageStatusItemList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModelPackageStatusItem {
        var Name: EntityName
        var Status: String /* "NotStarted" | "InProgress" | "Completed" | "Failed" | String */
        var FailureReason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModelPackageSummary {
        var ModelPackageName: EntityName
        var ModelPackageArn: ModelPackageArn
        var ModelPackageDescription: EntityDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime
        var ModelPackageStatus: String /* "Pending" | "InProgress" | "Completed" | "Failed" | "Deleting" | String */
    }
    interface ModelPackageValidationProfile {
        var ProfileName: EntityName
        var TransformJobDefinition: TransformJobDefinition
    }
    interface ModelPackageValidationSpecification {
        var ValidationRole: RoleArn
        var ValidationProfiles: ModelPackageValidationProfiles
    }
    interface ModelSummary {
        var ModelName: ModelName
        var ModelArn: ModelArn
        var CreationTime: Timestamp
    }
    interface MonitoringAppSpecification {
        var ImageUri: ImageUri
        var ContainerEntrypoint: ContainerEntrypoint?
            get() = definedExternally
            set(value) = definedExternally
        var ContainerArguments: MonitoringContainerArguments?
            get() = definedExternally
            set(value) = definedExternally
        var RecordPreprocessorSourceUri: S3Uri?
            get() = definedExternally
            set(value) = definedExternally
        var PostAnalyticsProcessorSourceUri: S3Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MonitoringBaselineConfig {
        var ConstraintsResource: MonitoringConstraintsResource?
            get() = definedExternally
            set(value) = definedExternally
        var StatisticsResource: MonitoringStatisticsResource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MonitoringClusterConfig {
        var InstanceCount: ProcessingInstanceCount
        var InstanceType: String /* "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.r5.large" | "ml.r5.xlarge" | "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.8xlarge" | "ml.r5.12xlarge" | "ml.r5.16xlarge" | "ml.r5.24xlarge" | String */
        var VolumeSizeInGB: ProcessingVolumeSizeInGB
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MonitoringConstraintsResource {
        var S3Uri: S3Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MonitoringEnvironmentMap {
        @nativeGetter
        operator fun get(key: String): ProcessingEnvironmentValue?
        @nativeSetter
        operator fun set(key: String, value: ProcessingEnvironmentValue)
    }
    interface MonitoringExecutionSummary {
        var MonitoringScheduleName: MonitoringScheduleName
        var ScheduledTime: Timestamp
        var CreationTime: Timestamp
        var LastModifiedTime: Timestamp
        var MonitoringExecutionStatus: String /* "Pending" | "Completed" | "CompletedWithViolations" | "InProgress" | "Failed" | "Stopping" | "Stopped" | String */
        var ProcessingJobArn: ProcessingJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointName: EndpointName?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MonitoringInput {
        var EndpointInput: EndpointInput
    }
    interface MonitoringJobDefinition {
        var BaselineConfig: MonitoringBaselineConfig?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringInputs: MonitoringInputs
        var MonitoringOutputConfig: MonitoringOutputConfig
        var MonitoringResources: MonitoringResources
        var MonitoringAppSpecification: MonitoringAppSpecification
        var StoppingCondition: MonitoringStoppingCondition?
            get() = definedExternally
            set(value) = definedExternally
        var Environment: MonitoringEnvironmentMap?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkConfig: NetworkConfig?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn
    }
    interface MonitoringOutput {
        var S3Output: MonitoringS3Output
    }
    interface MonitoringOutputConfig {
        var MonitoringOutputs: MonitoringOutputs
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MonitoringResources {
        var ClusterConfig: MonitoringClusterConfig
    }
    interface MonitoringS3Output {
        var S3Uri: MonitoringS3Uri
        var LocalPath: ProcessingLocalPath
        var S3UploadMode: String /* "Continuous" | "EndOfJob" | String */
    }
    interface MonitoringScheduleConfig {
        var ScheduleConfig: ScheduleConfig?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringJobDefinition: MonitoringJobDefinition
    }
    interface MonitoringScheduleSummary {
        var MonitoringScheduleName: MonitoringScheduleName
        var MonitoringScheduleArn: MonitoringScheduleArn
        var CreationTime: Timestamp
        var LastModifiedTime: Timestamp
        var MonitoringScheduleStatus: String /* "Pending" | "Failed" | "Scheduled" | "Stopped" | String */
        var EndpointName: EndpointName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MonitoringStatisticsResource {
        var S3Uri: S3Uri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MonitoringStoppingCondition {
        var MaxRuntimeInSeconds: MonitoringMaxRuntimeInSeconds
    }
    interface NestedFilters {
        var NestedPropertyName: ResourcePropertyName
        var Filters: FilterList
    }
    interface NetworkConfig {
        var EnableNetworkIsolation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotebookInstanceLifecycleConfigSummary {
        var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
        var NotebookInstanceLifecycleConfigArn: NotebookInstanceLifecycleConfigArn
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotebookInstanceLifecycleHook {
        var Content: NotebookInstanceLifecycleConfigContent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotebookInstanceSummary {
        var NotebookInstanceName: NotebookInstanceName
        var NotebookInstanceArn: NotebookInstanceArn
        var NotebookInstanceStatus: String /* "Pending" | "InService" | "Stopping" | "Stopped" | "Failed" | "Deleting" | "Updating" | String */
        var Url: NotebookInstanceUrl?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String /* "ml.t2.medium" | "ml.t2.large" | "ml.t2.xlarge" | "ml.t2.2xlarge" | "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5d.xlarge" | "ml.c5d.2xlarge" | "ml.c5d.4xlarge" | "ml.c5d.9xlarge" | "ml.c5d.18xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | String */
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
        var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultCodeRepository: CodeRepositoryNameOrUrl?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalCodeRepositories: AdditionalCodeRepositoryNamesOrUrls?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotificationConfiguration {
        var NotificationTopicArn: NotificationTopicArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ObjectiveStatusCounters {
        var Succeeded: ObjectiveStatusCounter?
            get() = definedExternally
            set(value) = definedExternally
        var Pending: ObjectiveStatusCounter?
            get() = definedExternally
            set(value) = definedExternally
        var Failed: ObjectiveStatusCounter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputConfig {
        var S3OutputLocation: S3Uri
        var TargetDevice: String /* "lambda" | "ml_m4" | "ml_m5" | "ml_c4" | "ml_c5" | "ml_p2" | "ml_p3" | "ml_inf1" | "jetson_tx1" | "jetson_tx2" | "jetson_nano" | "jetson_xavier" | "rasp3b" | "imx8qm" | "deeplens" | "rk3399" | "rk3288" | "aisage" | "sbe_c" | "qcs605" | "qcs603" | "sitara_am57x" | "amba_cv22" | String */
    }
    interface OutputDataConfig {
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var S3OutputPath: S3Uri
    }
    interface ParameterRange {
        var IntegerParameterRangeSpecification: IntegerParameterRangeSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var ContinuousParameterRangeSpecification: ContinuousParameterRangeSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var CategoricalParameterRangeSpecification: CategoricalParameterRangeSpecification?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterRanges {
        var IntegerParameterRanges: IntegerParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var ContinuousParameterRanges: ContinuousParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var CategoricalParameterRanges: CategoricalParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Parent {
        var TrialName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParentHyperParameterTuningJob {
        var HyperParameterTuningJobName: HyperParameterTuningJobName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProcessingClusterConfig {
        var InstanceCount: ProcessingInstanceCount
        var InstanceType: String /* "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.r5.large" | "ml.r5.xlarge" | "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.8xlarge" | "ml.r5.12xlarge" | "ml.r5.16xlarge" | "ml.r5.24xlarge" | String */
        var VolumeSizeInGB: ProcessingVolumeSizeInGB
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProcessingEnvironmentMap {
        @nativeGetter
        operator fun get(key: String): ProcessingEnvironmentValue?
        @nativeSetter
        operator fun set(key: String, value: ProcessingEnvironmentValue)
    }
    interface ProcessingInput {
        var InputName: String
        var S3Input: ProcessingS3Input
    }
    interface ProcessingJobSummary {
        var ProcessingJobName: ProcessingJobName
        var ProcessingJobArn: ProcessingJobArn
        var CreationTime: Timestamp
        var ProcessingEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingJobStatus: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var ExitMessage: ExitMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProcessingOutput {
        var OutputName: String
        var S3Output: ProcessingS3Output
    }
    interface ProcessingOutputConfig {
        var Outputs: ProcessingOutputs
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProcessingResources {
        var ClusterConfig: ProcessingClusterConfig
    }
    interface ProcessingS3Input {
        var S3Uri: S3Uri
        var LocalPath: ProcessingLocalPath
        var S3DataType: String /* "ManifestFile" | "S3Prefix" | String */
        var S3InputMode: String /* "Pipe" | "File" | String */
        var S3DataDistributionType: String /* "FullyReplicated" | "ShardedByS3Key" | String */
        var S3CompressionType: String /* "None" | "Gzip" | String */
    }
    interface ProcessingS3Output {
        var S3Uri: S3Uri
        var LocalPath: ProcessingLocalPath
        var S3UploadMode: String /* "Continuous" | "EndOfJob" | String */
    }
    interface ProcessingStoppingCondition {
        var MaxRuntimeInSeconds: ProcessingMaxRuntimeInSeconds
    }
    interface ProductionVariant {
        var VariantName: VariantName
        var ModelName: ModelName
        var InitialInstanceCount: TaskCount
        var InstanceType: String /* "ml.t2.medium" | "ml.t2.large" | "ml.t2.xlarge" | "ml.t2.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.m5d.large" | "ml.m5d.xlarge" | "ml.m5d.2xlarge" | "ml.m5d.4xlarge" | "ml.m5d.12xlarge" | "ml.m5d.24xlarge" | "ml.c4.large" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.large" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5d.large" | "ml.c5d.xlarge" | "ml.c5d.2xlarge" | "ml.c5d.4xlarge" | "ml.c5d.9xlarge" | "ml.c5d.18xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | "ml.r5.large" | "ml.r5.xlarge" | "ml.r5.2xlarge" | "ml.r5.4xlarge" | "ml.r5.12xlarge" | "ml.r5.24xlarge" | "ml.r5d.large" | "ml.r5d.xlarge" | "ml.r5d.2xlarge" | "ml.r5d.4xlarge" | "ml.r5d.12xlarge" | "ml.r5d.24xlarge" | "ml.inf1.xlarge" | "ml.inf1.2xlarge" | "ml.inf1.6xlarge" | "ml.inf1.24xlarge" | String */
        var InitialVariantWeight: VariantWeight?
            get() = definedExternally
            set(value) = definedExternally
        var AcceleratorType: String /* "ml.eia1.medium" | "ml.eia1.large" | "ml.eia1.xlarge" | "ml.eia2.medium" | "ml.eia2.large" | "ml.eia2.xlarge" | String */
    }
    interface ProductionVariantSummary {
        var VariantName: VariantName
        var DeployedImages: DeployedImages?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentWeight: VariantWeight?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredWeight: VariantWeight?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentInstanceCount: TaskCount?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredInstanceCount: TaskCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PropertyNameQuery {
        var PropertyNameHint: PropertyNameHint
    }
    interface PropertyNameSuggestion {
        var PropertyName: ResourcePropertyName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublicWorkforceTaskPrice {
        var AmountInUsd: USD?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RenderUiTemplateRequest {
        var UiTemplate: UiTemplate
        var Task: RenderableTask
        var RoleArn: RoleArn
    }
    interface RenderUiTemplateResponse {
        var RenderedContent: String
        var Errors: RenderingErrorList
    }
    interface RenderableTask {
        var Input: TaskInput
    }
    interface RenderingError {
        var Code: String
        var Message: String
    }
    interface ResolvedAttributes {
        var AutoMLJobObjective: AutoMLJobObjective?
            get() = definedExternally
            set(value) = definedExternally
        var ProblemType: String /* "BinaryClassification" | "MulticlassClassification" | "Regression" | String */
        var CompletionCriteria: AutoMLJobCompletionCriteria?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceConfig {
        var InstanceType: String /* "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.p3dn.24xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | String */
        var InstanceCount: TrainingInstanceCount
        var VolumeSizeInGB: VolumeSizeInGB
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceLimits {
        var MaxNumberOfTrainingJobs: MaxNumberOfTrainingJobs
        var MaxParallelTrainingJobs: MaxParallelTrainingJobs
    }
    interface ResourceSpec {
        var EnvironmentArn: EnvironmentArn?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceType: String /* "system" | "ml.t3.micro" | "ml.t3.small" | "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.8xlarge" | "ml.m5.12xlarge" | "ml.m5.16xlarge" | "ml.m5.24xlarge" | "ml.c5.large" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.12xlarge" | "ml.c5.18xlarge" | "ml.c5.24xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.g4dn.xlarge" | "ml.g4dn.2xlarge" | "ml.g4dn.4xlarge" | "ml.g4dn.8xlarge" | "ml.g4dn.12xlarge" | "ml.g4dn.16xlarge" | String */
    }
    interface RetentionPolicy {
        var HomeEfsFileSystem: String /* "Retain" | "Delete" | String */
    }
    interface RuleParameters {
        @nativeGetter
        operator fun get(key: String): ConfigValue?
        @nativeSetter
        operator fun set(key: String, value: ConfigValue)
    }
    interface S3DataSource {
        var S3DataType: String /* "ManifestFile" | "S3Prefix" | "AugmentedManifestFile" | String */
        var S3Uri: S3Uri
        var S3DataDistributionType: String /* "FullyReplicated" | "ShardedByS3Key" | String */
        var AttributeNames: AttributeNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduleConfig {
        var ScheduleExpression: ScheduleExpression
    }
    interface SearchExpression {
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NestedFilters: NestedFiltersList?
            get() = definedExternally
            set(value) = definedExternally
        var SubExpressions: SearchExpressionList?
            get() = definedExternally
            set(value) = definedExternally
        var Operator: String /* "And" | "Or" | String */
    }
    interface SearchRecord {
        var TrainingJob: TrainingJob?
            get() = definedExternally
            set(value) = definedExternally
        var Experiment: Experiment?
            get() = definedExternally
            set(value) = definedExternally
        var Trial: Trial?
            get() = definedExternally
            set(value) = definedExternally
        var TrialComponent: TrialComponent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchRequest {
        var Resource: String /* "TrainingJob" | "Experiment" | "ExperimentTrial" | "ExperimentTrialComponent" | String */
        var SearchExpression: SearchExpression?
            get() = definedExternally
            set(value) = definedExternally
        var SortBy: ResourcePropertyName?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "Ascending" | "Descending" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchResponse {
        var Results: SearchResultsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecondaryStatusTransition {
        var Status: String /* "Starting" | "LaunchingMLInstances" | "PreparingTrainingStack" | "Downloading" | "DownloadingTrainingImage" | "Training" | "Uploading" | "Stopping" | "Stopped" | "MaxRuntimeExceeded" | "Completed" | "Failed" | "Interrupted" | "MaxWaitTimeExceeded" | String */
        var StartTime: Timestamp
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SharingSettings {
        var NotebookOutputOption: String /* "Allowed" | "Disabled" | String */
        var S3OutputPath: S3Uri?
            get() = definedExternally
            set(value) = definedExternally
        var S3KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ShuffleConfig {
        var Seed: Seed
    }
    interface SourceAlgorithm {
        var ModelDataUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var AlgorithmName: ArnOrName
    }
    interface SourceAlgorithmSpecification {
        var SourceAlgorithms: SourceAlgorithmList
    }
    interface SourceIpConfig {
        var Cidrs: Cidrs
    }
    interface StartMonitoringScheduleRequest {
        var MonitoringScheduleName: MonitoringScheduleName
    }
    interface StartNotebookInstanceInput {
        var NotebookInstanceName: NotebookInstanceName
    }
    interface StopAutoMLJobRequest {
        var AutoMLJobName: AutoMLJobName
    }
    interface StopCompilationJobRequest {
        var CompilationJobName: EntityName
    }
    interface StopHyperParameterTuningJobRequest {
        var HyperParameterTuningJobName: HyperParameterTuningJobName
    }
    interface StopLabelingJobRequest {
        var LabelingJobName: LabelingJobName
    }
    interface StopMonitoringScheduleRequest {
        var MonitoringScheduleName: MonitoringScheduleName
    }
    interface StopNotebookInstanceInput {
        var NotebookInstanceName: NotebookInstanceName
    }
    interface StopProcessingJobRequest {
        var ProcessingJobName: ProcessingJobName
    }
    interface StopTrainingJobRequest {
        var TrainingJobName: TrainingJobName
    }
    interface StopTransformJobRequest {
        var TransformJobName: TransformJobName
    }
    interface StoppingCondition {
        var MaxRuntimeInSeconds: MaxRuntimeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var MaxWaitTimeInSeconds: MaxWaitTimeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubscribedWorkteam {
        var WorkteamArn: WorkteamArn
        var MarketplaceTitle: String200?
            get() = definedExternally
            set(value) = definedExternally
        var SellerName: String?
            get() = definedExternally
            set(value) = definedExternally
        var MarketplaceDescription: String200?
            get() = definedExternally
            set(value) = definedExternally
        var ListingId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SuggestionQuery {
        var PropertyNameQuery: PropertyNameQuery?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TensorBoardAppSettings {
        var DefaultResourceSpec: ResourceSpec?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TensorBoardOutputConfig {
        var LocalPath: DirectoryPath?
            get() = definedExternally
            set(value) = definedExternally
        var S3OutputPath: S3Uri
    }
    interface TrainingJob {
        var TrainingJobName: TrainingJobName?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobArn: TrainingJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var TuningJobArn: HyperParameterTuningJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var LabelingJobArn: LabelingJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMLJobArn: AutoMLJobArn?
            get() = definedExternally
            set(value) = definedExternally
        var ModelArtifacts: ModelArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobStatus: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var SecondaryStatus: String /* "Starting" | "LaunchingMLInstances" | "PreparingTrainingStack" | "Downloading" | "DownloadingTrainingImage" | "Training" | "Uploading" | "Stopping" | "Stopped" | "MaxRuntimeExceeded" | "Completed" | "Failed" | "Interrupted" | "MaxWaitTimeExceeded" | String */
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var HyperParameters: HyperParameters?
            get() = definedExternally
            set(value) = definedExternally
        var AlgorithmSpecification: AlgorithmSpecification?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceConfig: ResourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfig: VpcConfig?
            get() = definedExternally
            set(value) = definedExternally
        var StoppingCondition: StoppingCondition?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SecondaryStatusTransitions: SecondaryStatusTransitions?
            get() = definedExternally
            set(value) = definedExternally
        var FinalMetricDataList: FinalMetricDataList?
            get() = definedExternally
            set(value) = definedExternally
        var EnableNetworkIsolation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableInterContainerTrafficEncryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableManagedSpotTraining: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CheckpointConfig: CheckpointConfig?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingTimeInSeconds: TrainingTimeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var BillableTimeInSeconds: BillableTimeInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var DebugHookConfig: DebugHookConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentConfig: ExperimentConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DebugRuleConfigurations: DebugRuleConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var TensorBoardOutputConfig: TensorBoardOutputConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DebugRuleEvaluationStatuses: DebugRuleEvaluationStatuses?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrainingJobDefinition {
        var TrainingInputMode: String /* "Pipe" | "File" | String */
        var HyperParameters: HyperParameters?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig
        var OutputDataConfig: OutputDataConfig
        var ResourceConfig: ResourceConfig
        var StoppingCondition: StoppingCondition
    }
    interface TrainingJobStatusCounters {
        var Completed: TrainingJobStatusCounter?
            get() = definedExternally
            set(value) = definedExternally
        var InProgress: TrainingJobStatusCounter?
            get() = definedExternally
            set(value) = definedExternally
        var RetryableError: TrainingJobStatusCounter?
            get() = definedExternally
            set(value) = definedExternally
        var NonRetryableError: TrainingJobStatusCounter?
            get() = definedExternally
            set(value) = definedExternally
        var Stopped: TrainingJobStatusCounter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrainingJobSummary {
        var TrainingJobName: TrainingJobName
        var TrainingJobArn: TrainingJobArn
        var CreationTime: Timestamp
        var TrainingEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJobStatus: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
    }
    interface TrainingSpecification {
        var TrainingImage: Image
        var TrainingImageDigest: ImageDigest?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedHyperParameters: HyperParameterSpecifications?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedTrainingInstanceTypes: TrainingInstanceTypes
        var SupportsDistributedTraining: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MetricDefinitions: MetricDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingChannels: ChannelSpecifications
        var SupportedTuningJobObjectiveMetrics: HyperParameterTuningJobObjectives?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransformDataSource {
        var S3DataSource: TransformS3DataSource
    }
    interface TransformEnvironmentMap {
        @nativeGetter
        operator fun get(key: String): TransformEnvironmentValue?
        @nativeSetter
        operator fun set(key: String, value: TransformEnvironmentValue)
    }
    interface TransformInput {
        var DataSource: TransformDataSource
        var ContentType: ContentType?
            get() = definedExternally
            set(value) = definedExternally
        var CompressionType: String /* "None" | "Gzip" | String */
        var SplitType: String /* "None" | "Line" | "RecordIO" | "TFRecord" | String */
    }
    interface TransformJobDefinition {
        var MaxConcurrentTransforms: MaxConcurrentTransforms?
            get() = definedExternally
            set(value) = definedExternally
        var MaxPayloadInMB: MaxPayloadInMB?
            get() = definedExternally
            set(value) = definedExternally
        var BatchStrategy: String /* "MultiRecord" | "SingleRecord" | String */
        var Environment: TransformEnvironmentMap?
            get() = definedExternally
            set(value) = definedExternally
        var TransformInput: TransformInput
        var TransformOutput: TransformOutput
        var TransformResources: TransformResources
    }
    interface TransformJobSummary {
        var TransformJobName: TransformJobName
        var TransformJobArn: TransformJobArn
        var CreationTime: Timestamp
        var TransformEndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TransformJobStatus: String /* "InProgress" | "Completed" | "Failed" | "Stopping" | "Stopped" | String */
        var FailureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransformOutput {
        var S3OutputPath: S3Uri
        var Accept: Accept?
            get() = definedExternally
            set(value) = definedExternally
        var AssembleWith: String /* "None" | "Line" | String */
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransformResources {
        var InstanceType: String /* "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.m5.large" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | String */
        var InstanceCount: TransformInstanceCount
        var VolumeKmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransformS3DataSource {
        var S3DataType: String /* "ManifestFile" | "S3Prefix" | "AugmentedManifestFile" | String */
        var S3Uri: S3Uri
    }
    interface Trial {
        var TrialName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialArn: TrialArn?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var ExperimentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Source: TrialSource?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var TrialComponentSummaries: TrialComponentSimpleSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrialComponent {
        var TrialComponentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialComponentArn: TrialComponentArn?
            get() = definedExternally
            set(value) = definedExternally
        var Source: TrialComponentSource?
            get() = definedExternally
            set(value) = definedExternally
        var Status: TrialComponentStatus?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: TrialComponentParameters?
            get() = definedExternally
            set(value) = definedExternally
        var InputArtifacts: TrialComponentArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var OutputArtifacts: TrialComponentArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var Metrics: TrialComponentMetricSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var SourceDetail: TrialComponentSourceDetail?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var Parents: Parents?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrialComponentArtifact {
        var MediaType: MediaType?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TrialComponentArtifactValue
    }
    interface TrialComponentArtifacts {
        @nativeGetter
        operator fun get(key: String): TrialComponentArtifact?
        @nativeSetter
        operator fun set(key: String, value: TrialComponentArtifact)
    }
    interface TrialComponentMetricSummary {
        var MetricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: TrialComponentSourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var TimeStamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Max: OptionalDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Min: OptionalDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Last: OptionalDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Count: OptionalInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Avg: OptionalDouble?
            get() = definedExternally
            set(value) = definedExternally
        var StdDev: OptionalDouble?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrialComponentParameterValue {
        var StringValue: StringParameterValue?
            get() = definedExternally
            set(value) = definedExternally
        var NumberValue: DoubleParameterValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrialComponentParameters {
        @nativeGetter
        operator fun get(key: String): TrialComponentParameterValue?
        @nativeSetter
        operator fun set(key: String, value: TrialComponentParameterValue)
    }
    interface TrialComponentSimpleSummary {
        var TrialComponentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialComponentArn: TrialComponentArn?
            get() = definedExternally
            set(value) = definedExternally
        var TrialComponentSource: TrialComponentSource?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrialComponentSource {
        var SourceArn: TrialComponentSourceArn
        var SourceType: SourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrialComponentSourceDetail {
        var SourceArn: TrialComponentSourceArn?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingJob: TrainingJob?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrialComponentStatus {
        var PrimaryStatus: String /* "InProgress" | "Completed" | "Failed" | String */
        var Message: TrialComponentStatusMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrialComponentSummary {
        var TrialComponentName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialComponentArn: TrialComponentArn?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialComponentSource: TrialComponentSource?
            get() = definedExternally
            set(value) = definedExternally
        var Status: TrialComponentStatus?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: UserContext?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrialSource {
        var SourceArn: TrialSourceArn
        var SourceType: SourceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrialSummary {
        var TrialArn: TrialArn?
            get() = definedExternally
            set(value) = definedExternally
        var TrialName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var TrialSource: TrialSource?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TuningJobCompletionCriteria {
        var TargetObjectiveMetricValue: TargetObjectiveMetricValue
    }
    interface USD {
        var Dollars: Dollars?
            get() = definedExternally
            set(value) = definedExternally
        var Cents: Cents?
            get() = definedExternally
            set(value) = definedExternally
        var TenthFractionsOfACent: TenthFractionsOfACent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UiConfig {
        var UiTemplateS3Uri: S3Uri
    }
    interface UiTemplate {
        var Content: TemplateContent
    }
    interface UiTemplateInfo {
        var Url: TemplateUrl?
            get() = definedExternally
            set(value) = definedExternally
        var ContentSha256: TemplateContentSha256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCodeRepositoryInput {
        var CodeRepositoryName: EntityName
        var GitConfig: GitConfigForUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCodeRepositoryOutput {
        var CodeRepositoryArn: CodeRepositoryArn
    }
    interface UpdateDomainRequest {
        var DomainId: DomainId
        var DefaultUserSettings: UserSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDomainResponse {
        var DomainArn: DomainArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEndpointInput {
        var EndpointName: EndpointName
        var EndpointConfigName: EndpointConfigName
        var RetainAllVariantProperties: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludeRetainedVariantProperties: VariantPropertyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEndpointOutput {
        var EndpointArn: EndpointArn
    }
    interface UpdateEndpointWeightsAndCapacitiesInput {
        var EndpointName: EndpointName
        var DesiredWeightsAndCapacities: DesiredWeightAndCapacityList
    }
    interface UpdateEndpointWeightsAndCapacitiesOutput {
        var EndpointArn: EndpointArn
    }
    interface UpdateExperimentRequest {
        var ExperimentName: ExperimentEntityName
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ExperimentDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateExperimentResponse {
        var ExperimentArn: ExperimentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMonitoringScheduleRequest {
        var MonitoringScheduleName: MonitoringScheduleName
        var MonitoringScheduleConfig: MonitoringScheduleConfig
    }
    interface UpdateMonitoringScheduleResponse {
        var MonitoringScheduleArn: MonitoringScheduleArn
    }
    interface UpdateNotebookInstanceInput {
        var NotebookInstanceName: NotebookInstanceName
        var InstanceType: String /* "ml.t2.medium" | "ml.t2.large" | "ml.t2.xlarge" | "ml.t2.2xlarge" | "ml.t3.medium" | "ml.t3.large" | "ml.t3.xlarge" | "ml.t3.2xlarge" | "ml.m4.xlarge" | "ml.m4.2xlarge" | "ml.m4.4xlarge" | "ml.m4.10xlarge" | "ml.m4.16xlarge" | "ml.m5.xlarge" | "ml.m5.2xlarge" | "ml.m5.4xlarge" | "ml.m5.12xlarge" | "ml.m5.24xlarge" | "ml.c4.xlarge" | "ml.c4.2xlarge" | "ml.c4.4xlarge" | "ml.c4.8xlarge" | "ml.c5.xlarge" | "ml.c5.2xlarge" | "ml.c5.4xlarge" | "ml.c5.9xlarge" | "ml.c5.18xlarge" | "ml.c5d.xlarge" | "ml.c5d.2xlarge" | "ml.c5d.4xlarge" | "ml.c5d.9xlarge" | "ml.c5d.18xlarge" | "ml.p2.xlarge" | "ml.p2.8xlarge" | "ml.p2.16xlarge" | "ml.p3.2xlarge" | "ml.p3.8xlarge" | "ml.p3.16xlarge" | String */
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var LifecycleConfigName: NotebookInstanceLifecycleConfigName?
            get() = definedExternally
            set(value) = definedExternally
        var DisassociateLifecycleConfig: DisassociateNotebookInstanceLifecycleConfig?
            get() = definedExternally
            set(value) = definedExternally
        var VolumeSizeInGB: NotebookInstanceVolumeSizeInGB?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultCodeRepository: CodeRepositoryNameOrUrl?
            get() = definedExternally
            set(value) = definedExternally
        var AdditionalCodeRepositories: AdditionalCodeRepositoryNamesOrUrls?
            get() = definedExternally
            set(value) = definedExternally
        var AcceleratorTypes: NotebookInstanceAcceleratorTypes?
            get() = definedExternally
            set(value) = definedExternally
        var DisassociateAcceleratorTypes: DisassociateNotebookInstanceAcceleratorTypes?
            get() = definedExternally
            set(value) = definedExternally
        var DisassociateDefaultCodeRepository: DisassociateDefaultCodeRepository?
            get() = definedExternally
            set(value) = definedExternally
        var DisassociateAdditionalCodeRepositories: DisassociateAdditionalCodeRepositories?
            get() = definedExternally
            set(value) = definedExternally
        var RootAccess: String /* "Enabled" | "Disabled" | String */
    }
    interface UpdateNotebookInstanceLifecycleConfigInput {
        var NotebookInstanceLifecycleConfigName: NotebookInstanceLifecycleConfigName
        var OnCreate: NotebookInstanceLifecycleConfigList?
            get() = definedExternally
            set(value) = definedExternally
        var OnStart: NotebookInstanceLifecycleConfigList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNotebookInstanceLifecycleConfigOutput
    interface UpdateNotebookInstanceOutput
    interface UpdateTrialComponentRequest {
        var TrialComponentName: ExperimentEntityName
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: TrialComponentStatus?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: TrialComponentParameters?
            get() = definedExternally
            set(value) = definedExternally
        var ParametersToRemove: ListTrialComponentKey256?
            get() = definedExternally
            set(value) = definedExternally
        var InputArtifacts: TrialComponentArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var InputArtifactsToRemove: ListTrialComponentKey256?
            get() = definedExternally
            set(value) = definedExternally
        var OutputArtifacts: TrialComponentArtifacts?
            get() = definedExternally
            set(value) = definedExternally
        var OutputArtifactsToRemove: ListTrialComponentKey256?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTrialComponentResponse {
        var TrialComponentArn: TrialComponentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTrialRequest {
        var TrialName: ExperimentEntityName
        var DisplayName: ExperimentEntityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTrialResponse {
        var TrialArn: TrialArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserProfileRequest {
        var DomainId: DomainId
        var UserProfileName: UserProfileName
        var UserSettings: UserSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserProfileResponse {
        var UserProfileArn: UserProfileArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateWorkforceRequest {
        var WorkforceName: WorkforceName
        var SourceIpConfig: SourceIpConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateWorkforceResponse {
        var Workforce: Workforce
    }
    interface UpdateWorkteamRequest {
        var WorkteamName: WorkteamName
        var MemberDefinitions: MemberDefinitions?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String200?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationConfiguration: NotificationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateWorkteamResponse {
        var Workteam: Workteam
    }
    interface UserContext {
        var UserProfileArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var UserProfileName: String?
            get() = definedExternally
            set(value) = definedExternally
        var DomainId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserProfileDetails {
        var DomainId: DomainId?
            get() = definedExternally
            set(value) = definedExternally
        var UserProfileName: UserProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Deleting" | "Failed" | "InService" | "Pending" | String */
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTime: LastModifiedTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserSettings {
        var ExecutionRole: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroups: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
        var SharingSettings: SharingSettings?
            get() = definedExternally
            set(value) = definedExternally
        var JupyterServerAppSettings: JupyterServerAppSettings?
            get() = definedExternally
            set(value) = definedExternally
        var KernelGatewayAppSettings: KernelGatewayAppSettings?
            get() = definedExternally
            set(value) = definedExternally
        var TensorBoardAppSettings: TensorBoardAppSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VariantProperty {
        var VariantPropertyType: String /* "DesiredInstanceCount" | "DesiredWeight" | "DataCaptureConfig" | String */
    }
    interface VpcConfig {
        var SecurityGroupIds: VpcSecurityGroupIds
        var Subnets: Subnets
    }
    interface Workforce {
        var WorkforceName: WorkforceName
        var WorkforceArn: WorkforceArn
        var LastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SourceIpConfig: SourceIpConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Workteam {
        var WorkteamName: WorkteamName
        var MemberDefinitions: MemberDefinitions
        var WorkteamArn: WorkteamArn
        var ProductListingIds: ProductListings?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String200
        var SubDomain: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationConfiguration: NotificationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-07-24" | "latest" | String */
    }
}