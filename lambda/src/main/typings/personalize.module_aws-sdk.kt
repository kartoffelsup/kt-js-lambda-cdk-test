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
import Personalize.BatchInferenceJobSummary
import Personalize.CampaignSummary
import Personalize.CategoricalHyperParameterRange
import Personalize.ContinuousHyperParameterRange
import Personalize.DatasetGroupSummary
import Personalize.DatasetImportJobSummary
import Personalize.DatasetSummary
import Personalize.DefaultCategoricalHyperParameterRange
import Personalize.DefaultContinuousHyperParameterRange
import Personalize.DefaultIntegerHyperParameterRange
import Personalize.EventTrackerSummary
import Personalize.IntegerHyperParameterRange
import Personalize.RecipeSummary
import Personalize.DatasetSchemaSummary
import Personalize.SolutionVersionSummary
import Personalize.SolutionSummary
import Personalize.CreateBatchInferenceJobRequest
import Personalize.CreateBatchInferenceJobResponse
import Personalize.CreateCampaignRequest
import Personalize.CreateCampaignResponse
import Personalize.CreateDatasetRequest
import Personalize.CreateDatasetResponse
import Personalize.CreateDatasetGroupRequest
import Personalize.CreateDatasetGroupResponse
import Personalize.CreateDatasetImportJobRequest
import Personalize.CreateDatasetImportJobResponse
import Personalize.CreateEventTrackerRequest
import Personalize.CreateEventTrackerResponse
import Personalize.CreateSchemaRequest
import Personalize.CreateSchemaResponse
import Personalize.CreateSolutionRequest
import Personalize.CreateSolutionResponse
import Personalize.CreateSolutionVersionRequest
import Personalize.CreateSolutionVersionResponse
import Personalize.DeleteCampaignRequest
import Personalize.DeleteDatasetRequest
import Personalize.DeleteDatasetGroupRequest
import Personalize.DeleteEventTrackerRequest
import Personalize.DeleteSchemaRequest
import Personalize.DeleteSolutionRequest
import Personalize.DescribeAlgorithmRequest
import Personalize.DescribeAlgorithmResponse
import Personalize.DescribeBatchInferenceJobRequest
import Personalize.DescribeBatchInferenceJobResponse
import Personalize.DescribeCampaignRequest
import Personalize.DescribeCampaignResponse
import Personalize.DescribeDatasetRequest
import Personalize.DescribeDatasetResponse
import Personalize.DescribeDatasetGroupRequest
import Personalize.DescribeDatasetGroupResponse
import Personalize.DescribeDatasetImportJobRequest
import Personalize.DescribeDatasetImportJobResponse
import Personalize.DescribeEventTrackerRequest
import Personalize.DescribeEventTrackerResponse
import Personalize.DescribeFeatureTransformationRequest
import Personalize.DescribeFeatureTransformationResponse
import Personalize.DescribeRecipeRequest
import Personalize.DescribeRecipeResponse
import Personalize.DescribeSchemaRequest
import Personalize.DescribeSchemaResponse
import Personalize.DescribeSolutionRequest
import Personalize.DescribeSolutionResponse
import Personalize.DescribeSolutionVersionRequest
import Personalize.DescribeSolutionVersionResponse
import Personalize.GetSolutionMetricsRequest
import Personalize.GetSolutionMetricsResponse
import Personalize.ListBatchInferenceJobsRequest
import Personalize.ListBatchInferenceJobsResponse
import Personalize.ListCampaignsRequest
import Personalize.ListCampaignsResponse
import Personalize.ListDatasetGroupsRequest
import Personalize.ListDatasetGroupsResponse
import Personalize.ListDatasetImportJobsRequest
import Personalize.ListDatasetImportJobsResponse
import Personalize.ListDatasetsRequest
import Personalize.ListDatasetsResponse
import Personalize.ListEventTrackersRequest
import Personalize.ListEventTrackersResponse
import Personalize.ListRecipesRequest
import Personalize.ListRecipesResponse
import Personalize.ListSchemasRequest
import Personalize.ListSchemasResponse
import Personalize.ListSolutionVersionsRequest
import Personalize.ListSolutionVersionsResponse
import Personalize.ListSolutionsRequest
import Personalize.ListSolutionsResponse
import Personalize.UpdateCampaignRequest
import Personalize.UpdateCampaignResponse
import Personalize.AlgorithmImage
import Personalize.HyperParameters
import Personalize.DefaultHyperParameterRanges
import Personalize.ResourceConfig
import Personalize.BatchInferenceJobInput
import Personalize.BatchInferenceJobOutput
import Personalize.S3DataConfig
import Personalize.CampaignUpdateSummary
import Personalize.DataSource
import Personalize.SolutionConfig
import Personalize.Algorithm
import Personalize.BatchInferenceJob
import Personalize.Campaign
import Personalize.DatasetGroup
import Personalize.DatasetImportJob
import Personalize.Dataset
import Personalize.EventTracker
import Personalize.FeatureTransformation
import Personalize.Recipe
import Personalize.DatasetSchema
import Personalize.Solution
import Personalize.SolutionVersion
import Personalize.FeaturizationParameters
import Personalize.Metrics
import Personalize.HPOObjective
import Personalize.HPOResourceConfig
import Personalize.HyperParameterRanges
import Personalize.AutoMLResult
import Personalize.HPOConfig
import Personalize.FeatureTransformationParameters
import Personalize.AutoMLConfig
import Personalize.TunedHPOParams

typealias AccountId = String

typealias Arn = String

typealias ArnList = Array<Arn>

typealias AvroSchema = String

typealias BatchInferenceJobs = Array<BatchInferenceJobSummary>

typealias Boolean = Boolean

typealias Campaigns = Array<CampaignSummary>

typealias CategoricalHyperParameterRanges = Array<CategoricalHyperParameterRange>

typealias CategoricalValue = String

typealias CategoricalValues = Array<CategoricalValue>

typealias ContinuousHyperParameterRanges = Array<ContinuousHyperParameterRange>

typealias ContinuousMaxValue = Number

typealias ContinuousMinValue = Number

typealias DatasetGroups = Array<DatasetGroupSummary>

typealias DatasetImportJobs = Array<DatasetImportJobSummary>

typealias DatasetType = String

typealias Datasets = Array<DatasetSummary>

typealias _Date = Date

typealias DefaultCategoricalHyperParameterRanges = Array<DefaultCategoricalHyperParameterRange>

typealias DefaultContinuousHyperParameterRanges = Array<DefaultContinuousHyperParameterRange>

typealias DefaultIntegerHyperParameterRanges = Array<DefaultIntegerHyperParameterRange>

typealias Description = String

typealias DockerURI = String

typealias EventTrackers = Array<EventTrackerSummary>

typealias EventType = String

typealias EventValueThreshold = String

typealias FailureReason = String

typealias HPOObjectiveType = String

typealias HPOResource = String

typealias IntegerHyperParameterRanges = Array<IntegerHyperParameterRange>

typealias IntegerMaxValue = Number

typealias IntegerMinValue = Number

typealias KmsKeyArn = String

typealias MaxResults = Number

typealias MetricName = String

typealias MetricRegex = String

typealias MetricValue = Number

typealias Name = String

typealias NextToken = String

typealias NumBatchResults = Number

typealias ParameterName = String

typealias ParameterValue = String

typealias PerformAutoML = Boolean

typealias PerformHPO = Boolean

typealias RecipeType = String

typealias Recipes = Array<RecipeSummary>

typealias RoleArn = String

typealias S3Location = String

typealias Schemas = Array<DatasetSchemaSummary>

typealias SolutionVersions = Array<SolutionVersionSummary>

typealias Solutions = Array<SolutionSummary>

typealias Status = String

typealias TrackingId = String

typealias TrainingHours = Number

typealias TrainingInputMode = String

typealias TransactionsPerSecond = Number

typealias Tunable = Boolean

@JsModule("aws-sdk")
external open class Personalize(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Personalize.Types.ClientConfiguration */
    open fun createBatchInferenceJob(params: CreateBatchInferenceJobRequest, callback: (err: AWSError, data: CreateBatchInferenceJobResponse) -> Unit = definedExternally): Request<CreateBatchInferenceJobResponse, AWSError>
    open fun createBatchInferenceJob(callback: (err: AWSError, data: CreateBatchInferenceJobResponse) -> Unit = definedExternally): Request<CreateBatchInferenceJobResponse, AWSError>
    open fun createCampaign(params: CreateCampaignRequest, callback: (err: AWSError, data: CreateCampaignResponse) -> Unit = definedExternally): Request<CreateCampaignResponse, AWSError>
    open fun createCampaign(callback: (err: AWSError, data: CreateCampaignResponse) -> Unit = definedExternally): Request<CreateCampaignResponse, AWSError>
    open fun createDataset(params: CreateDatasetRequest, callback: (err: AWSError, data: CreateDatasetResponse) -> Unit = definedExternally): Request<CreateDatasetResponse, AWSError>
    open fun createDataset(callback: (err: AWSError, data: CreateDatasetResponse) -> Unit = definedExternally): Request<CreateDatasetResponse, AWSError>
    open fun createDatasetGroup(params: CreateDatasetGroupRequest, callback: (err: AWSError, data: CreateDatasetGroupResponse) -> Unit = definedExternally): Request<CreateDatasetGroupResponse, AWSError>
    open fun createDatasetGroup(callback: (err: AWSError, data: CreateDatasetGroupResponse) -> Unit = definedExternally): Request<CreateDatasetGroupResponse, AWSError>
    open fun createDatasetImportJob(params: CreateDatasetImportJobRequest, callback: (err: AWSError, data: CreateDatasetImportJobResponse) -> Unit = definedExternally): Request<CreateDatasetImportJobResponse, AWSError>
    open fun createDatasetImportJob(callback: (err: AWSError, data: CreateDatasetImportJobResponse) -> Unit = definedExternally): Request<CreateDatasetImportJobResponse, AWSError>
    open fun createEventTracker(params: CreateEventTrackerRequest, callback: (err: AWSError, data: CreateEventTrackerResponse) -> Unit = definedExternally): Request<CreateEventTrackerResponse, AWSError>
    open fun createEventTracker(callback: (err: AWSError, data: CreateEventTrackerResponse) -> Unit = definedExternally): Request<CreateEventTrackerResponse, AWSError>
    open fun createSchema(params: CreateSchemaRequest, callback: (err: AWSError, data: CreateSchemaResponse) -> Unit = definedExternally): Request<CreateSchemaResponse, AWSError>
    open fun createSchema(callback: (err: AWSError, data: CreateSchemaResponse) -> Unit = definedExternally): Request<CreateSchemaResponse, AWSError>
    open fun createSolution(params: CreateSolutionRequest, callback: (err: AWSError, data: CreateSolutionResponse) -> Unit = definedExternally): Request<CreateSolutionResponse, AWSError>
    open fun createSolution(callback: (err: AWSError, data: CreateSolutionResponse) -> Unit = definedExternally): Request<CreateSolutionResponse, AWSError>
    open fun createSolutionVersion(params: CreateSolutionVersionRequest, callback: (err: AWSError, data: CreateSolutionVersionResponse) -> Unit = definedExternally): Request<CreateSolutionVersionResponse, AWSError>
    open fun createSolutionVersion(callback: (err: AWSError, data: CreateSolutionVersionResponse) -> Unit = definedExternally): Request<CreateSolutionVersionResponse, AWSError>
    open fun deleteCampaign(params: DeleteCampaignRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCampaign(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDataset(params: DeleteDatasetRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDataset(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDatasetGroup(params: DeleteDatasetGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDatasetGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventTracker(params: DeleteEventTrackerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventTracker(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSchema(params: DeleteSchemaRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSchema(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSolution(params: DeleteSolutionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSolution(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeAlgorithm(params: DescribeAlgorithmRequest, callback: (err: AWSError, data: DescribeAlgorithmResponse) -> Unit = definedExternally): Request<DescribeAlgorithmResponse, AWSError>
    open fun describeAlgorithm(callback: (err: AWSError, data: DescribeAlgorithmResponse) -> Unit = definedExternally): Request<DescribeAlgorithmResponse, AWSError>
    open fun describeBatchInferenceJob(params: DescribeBatchInferenceJobRequest, callback: (err: AWSError, data: DescribeBatchInferenceJobResponse) -> Unit = definedExternally): Request<DescribeBatchInferenceJobResponse, AWSError>
    open fun describeBatchInferenceJob(callback: (err: AWSError, data: DescribeBatchInferenceJobResponse) -> Unit = definedExternally): Request<DescribeBatchInferenceJobResponse, AWSError>
    open fun describeCampaign(params: DescribeCampaignRequest, callback: (err: AWSError, data: DescribeCampaignResponse) -> Unit = definedExternally): Request<DescribeCampaignResponse, AWSError>
    open fun describeCampaign(callback: (err: AWSError, data: DescribeCampaignResponse) -> Unit = definedExternally): Request<DescribeCampaignResponse, AWSError>
    open fun describeDataset(params: DescribeDatasetRequest, callback: (err: AWSError, data: DescribeDatasetResponse) -> Unit = definedExternally): Request<DescribeDatasetResponse, AWSError>
    open fun describeDataset(callback: (err: AWSError, data: DescribeDatasetResponse) -> Unit = definedExternally): Request<DescribeDatasetResponse, AWSError>
    open fun describeDatasetGroup(params: DescribeDatasetGroupRequest, callback: (err: AWSError, data: DescribeDatasetGroupResponse) -> Unit = definedExternally): Request<DescribeDatasetGroupResponse, AWSError>
    open fun describeDatasetGroup(callback: (err: AWSError, data: DescribeDatasetGroupResponse) -> Unit = definedExternally): Request<DescribeDatasetGroupResponse, AWSError>
    open fun describeDatasetImportJob(params: DescribeDatasetImportJobRequest, callback: (err: AWSError, data: DescribeDatasetImportJobResponse) -> Unit = definedExternally): Request<DescribeDatasetImportJobResponse, AWSError>
    open fun describeDatasetImportJob(callback: (err: AWSError, data: DescribeDatasetImportJobResponse) -> Unit = definedExternally): Request<DescribeDatasetImportJobResponse, AWSError>
    open fun describeEventTracker(params: DescribeEventTrackerRequest, callback: (err: AWSError, data: DescribeEventTrackerResponse) -> Unit = definedExternally): Request<DescribeEventTrackerResponse, AWSError>
    open fun describeEventTracker(callback: (err: AWSError, data: DescribeEventTrackerResponse) -> Unit = definedExternally): Request<DescribeEventTrackerResponse, AWSError>
    open fun describeFeatureTransformation(params: DescribeFeatureTransformationRequest, callback: (err: AWSError, data: DescribeFeatureTransformationResponse) -> Unit = definedExternally): Request<DescribeFeatureTransformationResponse, AWSError>
    open fun describeFeatureTransformation(callback: (err: AWSError, data: DescribeFeatureTransformationResponse) -> Unit = definedExternally): Request<DescribeFeatureTransformationResponse, AWSError>
    open fun describeRecipe(params: DescribeRecipeRequest, callback: (err: AWSError, data: DescribeRecipeResponse) -> Unit = definedExternally): Request<DescribeRecipeResponse, AWSError>
    open fun describeRecipe(callback: (err: AWSError, data: DescribeRecipeResponse) -> Unit = definedExternally): Request<DescribeRecipeResponse, AWSError>
    open fun describeSchema(params: DescribeSchemaRequest, callback: (err: AWSError, data: DescribeSchemaResponse) -> Unit = definedExternally): Request<DescribeSchemaResponse, AWSError>
    open fun describeSchema(callback: (err: AWSError, data: DescribeSchemaResponse) -> Unit = definedExternally): Request<DescribeSchemaResponse, AWSError>
    open fun describeSolution(params: DescribeSolutionRequest, callback: (err: AWSError, data: DescribeSolutionResponse) -> Unit = definedExternally): Request<DescribeSolutionResponse, AWSError>
    open fun describeSolution(callback: (err: AWSError, data: DescribeSolutionResponse) -> Unit = definedExternally): Request<DescribeSolutionResponse, AWSError>
    open fun describeSolutionVersion(params: DescribeSolutionVersionRequest, callback: (err: AWSError, data: DescribeSolutionVersionResponse) -> Unit = definedExternally): Request<DescribeSolutionVersionResponse, AWSError>
    open fun describeSolutionVersion(callback: (err: AWSError, data: DescribeSolutionVersionResponse) -> Unit = definedExternally): Request<DescribeSolutionVersionResponse, AWSError>
    open fun getSolutionMetrics(params: GetSolutionMetricsRequest, callback: (err: AWSError, data: GetSolutionMetricsResponse) -> Unit = definedExternally): Request<GetSolutionMetricsResponse, AWSError>
    open fun getSolutionMetrics(callback: (err: AWSError, data: GetSolutionMetricsResponse) -> Unit = definedExternally): Request<GetSolutionMetricsResponse, AWSError>
    open fun listBatchInferenceJobs(params: ListBatchInferenceJobsRequest, callback: (err: AWSError, data: ListBatchInferenceJobsResponse) -> Unit = definedExternally): Request<ListBatchInferenceJobsResponse, AWSError>
    open fun listBatchInferenceJobs(callback: (err: AWSError, data: ListBatchInferenceJobsResponse) -> Unit = definedExternally): Request<ListBatchInferenceJobsResponse, AWSError>
    open fun listCampaigns(params: ListCampaignsRequest, callback: (err: AWSError, data: ListCampaignsResponse) -> Unit = definedExternally): Request<ListCampaignsResponse, AWSError>
    open fun listCampaigns(callback: (err: AWSError, data: ListCampaignsResponse) -> Unit = definedExternally): Request<ListCampaignsResponse, AWSError>
    open fun listDatasetGroups(params: ListDatasetGroupsRequest, callback: (err: AWSError, data: ListDatasetGroupsResponse) -> Unit = definedExternally): Request<ListDatasetGroupsResponse, AWSError>
    open fun listDatasetGroups(callback: (err: AWSError, data: ListDatasetGroupsResponse) -> Unit = definedExternally): Request<ListDatasetGroupsResponse, AWSError>
    open fun listDatasetImportJobs(params: ListDatasetImportJobsRequest, callback: (err: AWSError, data: ListDatasetImportJobsResponse) -> Unit = definedExternally): Request<ListDatasetImportJobsResponse, AWSError>
    open fun listDatasetImportJobs(callback: (err: AWSError, data: ListDatasetImportJobsResponse) -> Unit = definedExternally): Request<ListDatasetImportJobsResponse, AWSError>
    open fun listDatasets(params: ListDatasetsRequest, callback: (err: AWSError, data: ListDatasetsResponse) -> Unit = definedExternally): Request<ListDatasetsResponse, AWSError>
    open fun listDatasets(callback: (err: AWSError, data: ListDatasetsResponse) -> Unit = definedExternally): Request<ListDatasetsResponse, AWSError>
    open fun listEventTrackers(params: ListEventTrackersRequest, callback: (err: AWSError, data: ListEventTrackersResponse) -> Unit = definedExternally): Request<ListEventTrackersResponse, AWSError>
    open fun listEventTrackers(callback: (err: AWSError, data: ListEventTrackersResponse) -> Unit = definedExternally): Request<ListEventTrackersResponse, AWSError>
    open fun listRecipes(params: ListRecipesRequest, callback: (err: AWSError, data: ListRecipesResponse) -> Unit = definedExternally): Request<ListRecipesResponse, AWSError>
    open fun listRecipes(callback: (err: AWSError, data: ListRecipesResponse) -> Unit = definedExternally): Request<ListRecipesResponse, AWSError>
    open fun listSchemas(params: ListSchemasRequest, callback: (err: AWSError, data: ListSchemasResponse) -> Unit = definedExternally): Request<ListSchemasResponse, AWSError>
    open fun listSchemas(callback: (err: AWSError, data: ListSchemasResponse) -> Unit = definedExternally): Request<ListSchemasResponse, AWSError>
    open fun listSolutionVersions(params: ListSolutionVersionsRequest, callback: (err: AWSError, data: ListSolutionVersionsResponse) -> Unit = definedExternally): Request<ListSolutionVersionsResponse, AWSError>
    open fun listSolutionVersions(callback: (err: AWSError, data: ListSolutionVersionsResponse) -> Unit = definedExternally): Request<ListSolutionVersionsResponse, AWSError>
    open fun listSolutions(params: ListSolutionsRequest, callback: (err: AWSError, data: ListSolutionsResponse) -> Unit = definedExternally): Request<ListSolutionsResponse, AWSError>
    open fun listSolutions(callback: (err: AWSError, data: ListSolutionsResponse) -> Unit = definedExternally): Request<ListSolutionsResponse, AWSError>
    open fun updateCampaign(params: UpdateCampaignRequest, callback: (err: AWSError, data: UpdateCampaignResponse) -> Unit = definedExternally): Request<UpdateCampaignResponse, AWSError>
    open fun updateCampaign(callback: (err: AWSError, data: UpdateCampaignResponse) -> Unit = definedExternally): Request<UpdateCampaignResponse, AWSError>
    interface Algorithm {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var algorithmArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var algorithmImage: AlgorithmImage?
            get() = definedExternally
            set(value) = definedExternally
        var defaultHyperParameters: HyperParameters?
            get() = definedExternally
            set(value) = definedExternally
        var defaultHyperParameterRanges: DefaultHyperParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var defaultResourceConfig: ResourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var trainingInputMode: TrainingInputMode?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AlgorithmImage {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var dockerURI: DockerURI
    }
    interface AutoMLConfig {
        var metricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var recipeList: ArnList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoMLResult {
        var bestRecipeArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchInferenceJob {
        var jobName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var batchInferenceJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var solutionVersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var numResults: NumBatchResults?
            get() = definedExternally
            set(value) = definedExternally
        var jobInput: BatchInferenceJobInput?
            get() = definedExternally
            set(value) = definedExternally
        var jobOutput: BatchInferenceJobOutput?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchInferenceJobInput {
        var s3DataSource: S3DataConfig
    }
    interface BatchInferenceJobOutput {
        var s3DataDestination: S3DataConfig
    }
    interface BatchInferenceJobSummary {
        var batchInferenceJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var jobName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var solutionVersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Campaign {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var campaignArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var solutionVersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var minProvisionedTPS: TransactionsPerSecond?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var latestCampaignUpdate: CampaignUpdateSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CampaignSummary {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var campaignArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CampaignUpdateSummary {
        var solutionVersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var minProvisionedTPS: TransactionsPerSecond?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CategoricalHyperParameterRange {
        var name: ParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var values: CategoricalValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContinuousHyperParameterRange {
        var name: ParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var minValue: ContinuousMinValue?
            get() = definedExternally
            set(value) = definedExternally
        var maxValue: ContinuousMaxValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBatchInferenceJobRequest {
        var jobName: Name
        var solutionVersionArn: Arn
        var numResults: NumBatchResults?
            get() = definedExternally
            set(value) = definedExternally
        var jobInput: BatchInferenceJobInput
        var jobOutput: BatchInferenceJobOutput
        var roleArn: RoleArn
    }
    interface CreateBatchInferenceJobResponse {
        var batchInferenceJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCampaignRequest {
        var name: Name
        var solutionVersionArn: Arn
        var minProvisionedTPS: TransactionsPerSecond
    }
    interface CreateCampaignResponse {
        var campaignArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetGroupRequest {
        var name: Name
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyArn: KmsKeyArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetGroupResponse {
        var datasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetImportJobRequest {
        var jobName: Name
        var datasetArn: Arn
        var dataSource: DataSource
        var roleArn: RoleArn
    }
    interface CreateDatasetImportJobResponse {
        var datasetImportJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetRequest {
        var name: Name
        var schemaArn: Arn
        var datasetGroupArn: Arn
        var datasetType: DatasetType
    }
    interface CreateDatasetResponse {
        var datasetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEventTrackerRequest {
        var name: Name
        var datasetGroupArn: Arn
    }
    interface CreateEventTrackerResponse {
        var eventTrackerArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var trackingId: TrackingId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSchemaRequest {
        var name: Name
        var schema: AvroSchema
    }
    interface CreateSchemaResponse {
        var schemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSolutionRequest {
        var name: Name
        var performHPO: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var performAutoML: PerformAutoML?
            get() = definedExternally
            set(value) = definedExternally
        var recipeArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var datasetGroupArn: Arn
        var eventType: EventType?
            get() = definedExternally
            set(value) = definedExternally
        var solutionConfig: SolutionConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSolutionResponse {
        var solutionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSolutionVersionRequest {
        var solutionArn: Arn
        var trainingMode: String /* "FULL" | "UPDATE" | String */
    }
    interface CreateSolutionVersionResponse {
        var solutionVersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSource {
        var dataLocation: S3Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Dataset {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var datasetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var datasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var datasetType: DatasetType?
            get() = definedExternally
            set(value) = definedExternally
        var schemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetGroup {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var datasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyArn: KmsKeyArn?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetGroupSummary {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var datasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetImportJob {
        var jobName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var datasetImportJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var datasetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var dataSource: DataSource?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetImportJobSummary {
        var datasetImportJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var jobName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetSchema {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var schemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var schema: AvroSchema?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetSchemaSummary {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var schemaArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetSummary {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var datasetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var datasetType: DatasetType?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefaultCategoricalHyperParameterRange {
        var name: ParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var values: CategoricalValues?
            get() = definedExternally
            set(value) = definedExternally
        var isTunable: Tunable?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefaultContinuousHyperParameterRange {
        var name: ParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var minValue: ContinuousMinValue?
            get() = definedExternally
            set(value) = definedExternally
        var maxValue: ContinuousMaxValue?
            get() = definedExternally
            set(value) = definedExternally
        var isTunable: Tunable?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefaultHyperParameterRanges {
        var integerHyperParameterRanges: DefaultIntegerHyperParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var continuousHyperParameterRanges: DefaultContinuousHyperParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var categoricalHyperParameterRanges: DefaultCategoricalHyperParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DefaultIntegerHyperParameterRange {
        var name: ParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var minValue: IntegerMinValue?
            get() = definedExternally
            set(value) = definedExternally
        var maxValue: IntegerMaxValue?
            get() = definedExternally
            set(value) = definedExternally
        var isTunable: Tunable?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCampaignRequest {
        var campaignArn: Arn
    }
    interface DeleteDatasetGroupRequest {
        var datasetGroupArn: Arn
    }
    interface DeleteDatasetRequest {
        var datasetArn: Arn
    }
    interface DeleteEventTrackerRequest {
        var eventTrackerArn: Arn
    }
    interface DeleteSchemaRequest {
        var schemaArn: Arn
    }
    interface DeleteSolutionRequest {
        var solutionArn: Arn
    }
    interface DescribeAlgorithmRequest {
        var algorithmArn: Arn
    }
    interface DescribeAlgorithmResponse {
        var algorithm: Algorithm?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBatchInferenceJobRequest {
        var batchInferenceJobArn: Arn
    }
    interface DescribeBatchInferenceJobResponse {
        var batchInferenceJob: BatchInferenceJob?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCampaignRequest {
        var campaignArn: Arn
    }
    interface DescribeCampaignResponse {
        var campaign: Campaign?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDatasetGroupRequest {
        var datasetGroupArn: Arn
    }
    interface DescribeDatasetGroupResponse {
        var datasetGroup: DatasetGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDatasetImportJobRequest {
        var datasetImportJobArn: Arn
    }
    interface DescribeDatasetImportJobResponse {
        var datasetImportJob: DatasetImportJob?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDatasetRequest {
        var datasetArn: Arn
    }
    interface DescribeDatasetResponse {
        var dataset: Dataset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEventTrackerRequest {
        var eventTrackerArn: Arn
    }
    interface DescribeEventTrackerResponse {
        var eventTracker: EventTracker?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFeatureTransformationRequest {
        var featureTransformationArn: Arn
    }
    interface DescribeFeatureTransformationResponse {
        var featureTransformation: FeatureTransformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRecipeRequest {
        var recipeArn: Arn
    }
    interface DescribeRecipeResponse {
        var recipe: Recipe?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSchemaRequest {
        var schemaArn: Arn
    }
    interface DescribeSchemaResponse {
        var schema: DatasetSchema?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSolutionRequest {
        var solutionArn: Arn
    }
    interface DescribeSolutionResponse {
        var solution: Solution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSolutionVersionRequest {
        var solutionVersionArn: Arn
    }
    interface DescribeSolutionVersionResponse {
        var solutionVersion: SolutionVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventTracker {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var eventTrackerArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var accountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var trackingId: TrackingId?
            get() = definedExternally
            set(value) = definedExternally
        var datasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventTrackerSummary {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var eventTrackerArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FeatureTransformation {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var featureTransformationArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var defaultParameters: FeaturizationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FeatureTransformationParameters {
        @nativeGetter
        operator fun get(key: String): ParameterValue?
        @nativeSetter
        operator fun set(key: String, value: ParameterValue)
    }
    interface FeaturizationParameters {
        @nativeGetter
        operator fun get(key: String): ParameterValue?
        @nativeSetter
        operator fun set(key: String, value: ParameterValue)
    }
    interface GetSolutionMetricsRequest {
        var solutionVersionArn: Arn
    }
    interface GetSolutionMetricsResponse {
        var solutionVersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var metrics: Metrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HPOConfig {
        var hpoObjective: HPOObjective?
            get() = definedExternally
            set(value) = definedExternally
        var hpoResourceConfig: HPOResourceConfig?
            get() = definedExternally
            set(value) = definedExternally
        var algorithmHyperParameterRanges: HyperParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HPOObjective {
        var type: HPOObjectiveType?
            get() = definedExternally
            set(value) = definedExternally
        var metricName: MetricName?
            get() = definedExternally
            set(value) = definedExternally
        var metricRegex: MetricRegex?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HPOResourceConfig {
        var maxNumberOfTrainingJobs: HPOResource?
            get() = definedExternally
            set(value) = definedExternally
        var maxParallelTrainingJobs: HPOResource?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HyperParameterRanges {
        var integerHyperParameterRanges: IntegerHyperParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var continuousHyperParameterRanges: ContinuousHyperParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var categoricalHyperParameterRanges: CategoricalHyperParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HyperParameters {
        @nativeGetter
        operator fun get(key: String): ParameterValue?
        @nativeSetter
        operator fun set(key: String, value: ParameterValue)
    }
    interface IntegerHyperParameterRange {
        var name: ParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var minValue: IntegerMinValue?
            get() = definedExternally
            set(value) = definedExternally
        var maxValue: IntegerMaxValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBatchInferenceJobsRequest {
        var solutionVersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBatchInferenceJobsResponse {
        var batchInferenceJobs: BatchInferenceJobs?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCampaignsRequest {
        var solutionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCampaignsResponse {
        var campaigns: Campaigns?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetGroupsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetGroupsResponse {
        var datasetGroups: DatasetGroups?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetImportJobsRequest {
        var datasetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetImportJobsResponse {
        var datasetImportJobs: DatasetImportJobs?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetsRequest {
        var datasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetsResponse {
        var datasets: Datasets?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventTrackersRequest {
        var datasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEventTrackersResponse {
        var eventTrackers: EventTrackers?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecipesRequest {
        var recipeProvider: String /* "SERVICE" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecipesResponse {
        var recipes: Recipes?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSchemasRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSchemasResponse {
        var schemas: Schemas?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSolutionVersionsRequest {
        var solutionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSolutionVersionsResponse {
        var solutionVersions: SolutionVersions?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSolutionsRequest {
        var datasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSolutionsResponse {
        var solutions: Solutions?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Metrics {
        @nativeGetter
        operator fun get(key: String): MetricValue?
        @nativeSetter
        operator fun set(key: String, value: MetricValue)
    }
    interface Recipe {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var recipeArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var algorithmArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var featureTransformationArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var recipeType: RecipeType?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecipeSummary {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var recipeArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceConfig {
        @nativeGetter
        operator fun get(key: String): ParameterValue?
        @nativeSetter
        operator fun set(key: String, value: ParameterValue)
    }
    interface S3DataConfig {
        var path: S3Location
        var kmsKeyArn: KmsKeyArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Solution {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var solutionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var performHPO: PerformHPO?
            get() = definedExternally
            set(value) = definedExternally
        var performAutoML: PerformAutoML?
            get() = definedExternally
            set(value) = definedExternally
        var recipeArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var datasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var eventType: EventType?
            get() = definedExternally
            set(value) = definedExternally
        var solutionConfig: SolutionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var autoMLResult: AutoMLResult?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var latestSolutionVersion: SolutionVersionSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SolutionConfig {
        var eventValueThreshold: EventValueThreshold?
            get() = definedExternally
            set(value) = definedExternally
        var hpoConfig: HPOConfig?
            get() = definedExternally
            set(value) = definedExternally
        var algorithmHyperParameters: HyperParameters?
            get() = definedExternally
            set(value) = definedExternally
        var featureTransformationParameters: FeatureTransformationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var autoMLConfig: AutoMLConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SolutionSummary {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var solutionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SolutionVersion {
        var solutionVersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var solutionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var performHPO: PerformHPO?
            get() = definedExternally
            set(value) = definedExternally
        var performAutoML: PerformAutoML?
            get() = definedExternally
            set(value) = definedExternally
        var recipeArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var eventType: EventType?
            get() = definedExternally
            set(value) = definedExternally
        var datasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var solutionConfig: SolutionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var trainingHours: TrainingHours?
            get() = definedExternally
            set(value) = definedExternally
        var trainingMode: String /* "FULL" | "UPDATE" | String */
        var tunedHPOParams: TunedHPOParams?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SolutionVersionSummary {
        var solutionVersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var creationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: FailureReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TunedHPOParams {
        var algorithmHyperParameters: HyperParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCampaignRequest {
        var campaignArn: Arn
        var solutionVersionArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var minProvisionedTPS: TransactionsPerSecond?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCampaignResponse {
        var campaignArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-05-22" | "latest" | String */
    }
}