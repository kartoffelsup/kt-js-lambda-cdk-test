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
import MachineLearning.BatchPrediction
import MachineLearning.DataSource
import MachineLearning.Evaluation
import MachineLearning.MLModel
import MachineLearning.Tag
import MachineLearning.AddTagsInput
import MachineLearning.AddTagsOutput
import MachineLearning.CreateBatchPredictionInput
import MachineLearning.CreateBatchPredictionOutput
import MachineLearning.CreateDataSourceFromRDSInput
import MachineLearning.CreateDataSourceFromRDSOutput
import MachineLearning.CreateDataSourceFromRedshiftInput
import MachineLearning.CreateDataSourceFromRedshiftOutput
import MachineLearning.CreateDataSourceFromS3Input
import MachineLearning.CreateDataSourceFromS3Output
import MachineLearning.CreateEvaluationInput
import MachineLearning.CreateEvaluationOutput
import MachineLearning.CreateMLModelInput
import MachineLearning.CreateMLModelOutput
import MachineLearning.CreateRealtimeEndpointInput
import MachineLearning.CreateRealtimeEndpointOutput
import MachineLearning.DeleteBatchPredictionInput
import MachineLearning.DeleteBatchPredictionOutput
import MachineLearning.DeleteDataSourceInput
import MachineLearning.DeleteDataSourceOutput
import MachineLearning.DeleteEvaluationInput
import MachineLearning.DeleteEvaluationOutput
import MachineLearning.DeleteMLModelInput
import MachineLearning.DeleteMLModelOutput
import MachineLearning.DeleteRealtimeEndpointInput
import MachineLearning.DeleteRealtimeEndpointOutput
import MachineLearning.DeleteTagsInput
import MachineLearning.DeleteTagsOutput
import MachineLearning.DescribeBatchPredictionsInput
import MachineLearning.DescribeBatchPredictionsOutput
import MachineLearning.DescribeDataSourcesInput
import MachineLearning.DescribeDataSourcesOutput
import MachineLearning.DescribeEvaluationsInput
import MachineLearning.DescribeEvaluationsOutput
import MachineLearning.DescribeMLModelsInput
import MachineLearning.DescribeMLModelsOutput
import MachineLearning.DescribeTagsInput
import MachineLearning.DescribeTagsOutput
import MachineLearning.GetBatchPredictionInput
import MachineLearning.GetBatchPredictionOutput
import MachineLearning.GetDataSourceInput
import MachineLearning.GetDataSourceOutput
import MachineLearning.GetEvaluationInput
import MachineLearning.GetEvaluationOutput
import MachineLearning.GetMLModelInput
import MachineLearning.GetMLModelOutput
import MachineLearning.PredictInput
import MachineLearning.PredictOutput
import MachineLearning.UpdateBatchPredictionInput
import MachineLearning.UpdateBatchPredictionOutput
import MachineLearning.UpdateDataSourceInput
import MachineLearning.UpdateDataSourceOutput
import MachineLearning.UpdateEvaluationInput
import MachineLearning.UpdateEvaluationOutput
import MachineLearning.UpdateMLModelInput
import MachineLearning.UpdateMLModelOutput
import MachineLearning.RDSDataSpec
import MachineLearning.RedshiftDataSpec
import MachineLearning.S3DataSpec
import MachineLearning.TrainingParameters
import MachineLearning.RealtimeEndpointInfo
import MachineLearning.RedshiftMetadata
import MachineLearning.RDSMetadata
import MachineLearning.PerformanceMetrics
import MachineLearning.PerformanceMetricsProperties
import MachineLearning.Record
import MachineLearning.Prediction
import MachineLearning.ScoreValuePerLabelMap
import MachineLearning.DetailsMap
import MachineLearning.RDSDatabase
import MachineLearning.RDSDatabaseCredentials
import MachineLearning.RedshiftDatabase
import MachineLearning.RedshiftDatabaseCredentials

typealias AwsUserArn = String

typealias BatchPredictions = Array<BatchPrediction>

typealias ComparatorValue = String

typealias ComputeStatistics = Boolean

typealias DataRearrangement = String

typealias DataSchema = String

typealias DataSources = Array<DataSource>

typealias DetailsValue = String

typealias EDPPipelineId = String

typealias EDPResourceRole = String

typealias EDPSecurityGroupId = String

typealias EDPSecurityGroupIds = Array<EDPSecurityGroupId>

typealias EDPServiceRole = String

typealias EDPSubnetId = String

typealias EntityId = String

typealias EntityName = String

typealias EpochTime = Date

typealias Evaluations = Array<Evaluation>

typealias IntegerType = Number

typealias Label = String

typealias LongType = Number

typealias MLModelName = String

typealias MLModels = Array<MLModel>

typealias Message = String

typealias PageLimit = Number

typealias PerformanceMetricsPropertyKey = String

typealias PerformanceMetricsPropertyValue = String

typealias PresignedS3Url = String

typealias RDSDatabaseName = String

typealias RDSDatabasePassword = String

typealias RDSDatabaseUsername = String

typealias RDSInstanceIdentifier = String

typealias RDSSelectSqlQuery = String

typealias Recipe = String

typealias RedshiftClusterIdentifier = String

typealias RedshiftDatabaseName = String

typealias RedshiftDatabasePassword = String

typealias RedshiftDatabaseUsername = String

typealias RedshiftSelectSqlQuery = String

typealias RoleARN = String

typealias S3Url = String

typealias ScoreThreshold = Number

typealias ScoreValue = Number

typealias StringType = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias VariableName = String

typealias VariableValue = String

typealias Verbose = Boolean

typealias VipURL = String

typealias floatLabel = Number

@JsModule("aws-sdk")
external open class MachineLearning(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MachineLearning.Types.ClientConfiguration */
    open fun addTags(params: AddTagsInput, callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun addTags(callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun createBatchPrediction(params: CreateBatchPredictionInput, callback: (err: AWSError, data: CreateBatchPredictionOutput) -> Unit = definedExternally): Request<CreateBatchPredictionOutput, AWSError>
    open fun createBatchPrediction(callback: (err: AWSError, data: CreateBatchPredictionOutput) -> Unit = definedExternally): Request<CreateBatchPredictionOutput, AWSError>
    open fun createDataSourceFromRDS(params: CreateDataSourceFromRDSInput, callback: (err: AWSError, data: CreateDataSourceFromRDSOutput) -> Unit = definedExternally): Request<CreateDataSourceFromRDSOutput, AWSError>
    open fun createDataSourceFromRDS(callback: (err: AWSError, data: CreateDataSourceFromRDSOutput) -> Unit = definedExternally): Request<CreateDataSourceFromRDSOutput, AWSError>
    open fun createDataSourceFromRedshift(params: CreateDataSourceFromRedshiftInput, callback: (err: AWSError, data: CreateDataSourceFromRedshiftOutput) -> Unit = definedExternally): Request<CreateDataSourceFromRedshiftOutput, AWSError>
    open fun createDataSourceFromRedshift(callback: (err: AWSError, data: CreateDataSourceFromRedshiftOutput) -> Unit = definedExternally): Request<CreateDataSourceFromRedshiftOutput, AWSError>
    open fun createDataSourceFromS3(params: CreateDataSourceFromS3Input, callback: (err: AWSError, data: CreateDataSourceFromS3Output) -> Unit = definedExternally): Request<CreateDataSourceFromS3Output, AWSError>
    open fun createDataSourceFromS3(callback: (err: AWSError, data: CreateDataSourceFromS3Output) -> Unit = definedExternally): Request<CreateDataSourceFromS3Output, AWSError>
    open fun createEvaluation(params: CreateEvaluationInput, callback: (err: AWSError, data: CreateEvaluationOutput) -> Unit = definedExternally): Request<CreateEvaluationOutput, AWSError>
    open fun createEvaluation(callback: (err: AWSError, data: CreateEvaluationOutput) -> Unit = definedExternally): Request<CreateEvaluationOutput, AWSError>
    open fun createMLModel(params: CreateMLModelInput, callback: (err: AWSError, data: CreateMLModelOutput) -> Unit = definedExternally): Request<CreateMLModelOutput, AWSError>
    open fun createMLModel(callback: (err: AWSError, data: CreateMLModelOutput) -> Unit = definedExternally): Request<CreateMLModelOutput, AWSError>
    open fun createRealtimeEndpoint(params: CreateRealtimeEndpointInput, callback: (err: AWSError, data: CreateRealtimeEndpointOutput) -> Unit = definedExternally): Request<CreateRealtimeEndpointOutput, AWSError>
    open fun createRealtimeEndpoint(callback: (err: AWSError, data: CreateRealtimeEndpointOutput) -> Unit = definedExternally): Request<CreateRealtimeEndpointOutput, AWSError>
    open fun deleteBatchPrediction(params: DeleteBatchPredictionInput, callback: (err: AWSError, data: DeleteBatchPredictionOutput) -> Unit = definedExternally): Request<DeleteBatchPredictionOutput, AWSError>
    open fun deleteBatchPrediction(callback: (err: AWSError, data: DeleteBatchPredictionOutput) -> Unit = definedExternally): Request<DeleteBatchPredictionOutput, AWSError>
    open fun deleteDataSource(params: DeleteDataSourceInput, callback: (err: AWSError, data: DeleteDataSourceOutput) -> Unit = definedExternally): Request<DeleteDataSourceOutput, AWSError>
    open fun deleteDataSource(callback: (err: AWSError, data: DeleteDataSourceOutput) -> Unit = definedExternally): Request<DeleteDataSourceOutput, AWSError>
    open fun deleteEvaluation(params: DeleteEvaluationInput, callback: (err: AWSError, data: DeleteEvaluationOutput) -> Unit = definedExternally): Request<DeleteEvaluationOutput, AWSError>
    open fun deleteEvaluation(callback: (err: AWSError, data: DeleteEvaluationOutput) -> Unit = definedExternally): Request<DeleteEvaluationOutput, AWSError>
    open fun deleteMLModel(params: DeleteMLModelInput, callback: (err: AWSError, data: DeleteMLModelOutput) -> Unit = definedExternally): Request<DeleteMLModelOutput, AWSError>
    open fun deleteMLModel(callback: (err: AWSError, data: DeleteMLModelOutput) -> Unit = definedExternally): Request<DeleteMLModelOutput, AWSError>
    open fun deleteRealtimeEndpoint(params: DeleteRealtimeEndpointInput, callback: (err: AWSError, data: DeleteRealtimeEndpointOutput) -> Unit = definedExternally): Request<DeleteRealtimeEndpointOutput, AWSError>
    open fun deleteRealtimeEndpoint(callback: (err: AWSError, data: DeleteRealtimeEndpointOutput) -> Unit = definedExternally): Request<DeleteRealtimeEndpointOutput, AWSError>
    open fun deleteTags(params: DeleteTagsInput, callback: (err: AWSError, data: DeleteTagsOutput) -> Unit = definedExternally): Request<DeleteTagsOutput, AWSError>
    open fun deleteTags(callback: (err: AWSError, data: DeleteTagsOutput) -> Unit = definedExternally): Request<DeleteTagsOutput, AWSError>
    open fun describeBatchPredictions(params: DescribeBatchPredictionsInput, callback: (err: AWSError, data: DescribeBatchPredictionsOutput) -> Unit = definedExternally): Request<DescribeBatchPredictionsOutput, AWSError>
    open fun describeBatchPredictions(callback: (err: AWSError, data: DescribeBatchPredictionsOutput) -> Unit = definedExternally): Request<DescribeBatchPredictionsOutput, AWSError>
    open fun describeDataSources(params: DescribeDataSourcesInput, callback: (err: AWSError, data: DescribeDataSourcesOutput) -> Unit = definedExternally): Request<DescribeDataSourcesOutput, AWSError>
    open fun describeDataSources(callback: (err: AWSError, data: DescribeDataSourcesOutput) -> Unit = definedExternally): Request<DescribeDataSourcesOutput, AWSError>
    open fun describeEvaluations(params: DescribeEvaluationsInput, callback: (err: AWSError, data: DescribeEvaluationsOutput) -> Unit = definedExternally): Request<DescribeEvaluationsOutput, AWSError>
    open fun describeEvaluations(callback: (err: AWSError, data: DescribeEvaluationsOutput) -> Unit = definedExternally): Request<DescribeEvaluationsOutput, AWSError>
    open fun describeMLModels(params: DescribeMLModelsInput, callback: (err: AWSError, data: DescribeMLModelsOutput) -> Unit = definedExternally): Request<DescribeMLModelsOutput, AWSError>
    open fun describeMLModels(callback: (err: AWSError, data: DescribeMLModelsOutput) -> Unit = definedExternally): Request<DescribeMLModelsOutput, AWSError>
    open fun describeTags(params: DescribeTagsInput, callback: (err: AWSError, data: DescribeTagsOutput) -> Unit = definedExternally): Request<DescribeTagsOutput, AWSError>
    open fun describeTags(callback: (err: AWSError, data: DescribeTagsOutput) -> Unit = definedExternally): Request<DescribeTagsOutput, AWSError>
    open fun getBatchPrediction(params: GetBatchPredictionInput, callback: (err: AWSError, data: GetBatchPredictionOutput) -> Unit = definedExternally): Request<GetBatchPredictionOutput, AWSError>
    open fun getBatchPrediction(callback: (err: AWSError, data: GetBatchPredictionOutput) -> Unit = definedExternally): Request<GetBatchPredictionOutput, AWSError>
    open fun getDataSource(params: GetDataSourceInput, callback: (err: AWSError, data: GetDataSourceOutput) -> Unit = definedExternally): Request<GetDataSourceOutput, AWSError>
    open fun getDataSource(callback: (err: AWSError, data: GetDataSourceOutput) -> Unit = definedExternally): Request<GetDataSourceOutput, AWSError>
    open fun getEvaluation(params: GetEvaluationInput, callback: (err: AWSError, data: GetEvaluationOutput) -> Unit = definedExternally): Request<GetEvaluationOutput, AWSError>
    open fun getEvaluation(callback: (err: AWSError, data: GetEvaluationOutput) -> Unit = definedExternally): Request<GetEvaluationOutput, AWSError>
    open fun getMLModel(params: GetMLModelInput, callback: (err: AWSError, data: GetMLModelOutput) -> Unit = definedExternally): Request<GetMLModelOutput, AWSError>
    open fun getMLModel(callback: (err: AWSError, data: GetMLModelOutput) -> Unit = definedExternally): Request<GetMLModelOutput, AWSError>
    open fun predict(params: PredictInput, callback: (err: AWSError, data: PredictOutput) -> Unit = definedExternally): Request<PredictOutput, AWSError>
    open fun predict(callback: (err: AWSError, data: PredictOutput) -> Unit = definedExternally): Request<PredictOutput, AWSError>
    open fun updateBatchPrediction(params: UpdateBatchPredictionInput, callback: (err: AWSError, data: UpdateBatchPredictionOutput) -> Unit = definedExternally): Request<UpdateBatchPredictionOutput, AWSError>
    open fun updateBatchPrediction(callback: (err: AWSError, data: UpdateBatchPredictionOutput) -> Unit = definedExternally): Request<UpdateBatchPredictionOutput, AWSError>
    open fun updateDataSource(params: UpdateDataSourceInput, callback: (err: AWSError, data: UpdateDataSourceOutput) -> Unit = definedExternally): Request<UpdateDataSourceOutput, AWSError>
    open fun updateDataSource(callback: (err: AWSError, data: UpdateDataSourceOutput) -> Unit = definedExternally): Request<UpdateDataSourceOutput, AWSError>
    open fun updateEvaluation(params: UpdateEvaluationInput, callback: (err: AWSError, data: UpdateEvaluationOutput) -> Unit = definedExternally): Request<UpdateEvaluationOutput, AWSError>
    open fun updateEvaluation(callback: (err: AWSError, data: UpdateEvaluationOutput) -> Unit = definedExternally): Request<UpdateEvaluationOutput, AWSError>
    open fun updateMLModel(params: UpdateMLModelInput, callback: (err: AWSError, data: UpdateMLModelOutput) -> Unit = definedExternally): Request<UpdateMLModelOutput, AWSError>
    open fun updateMLModel(callback: (err: AWSError, data: UpdateMLModelOutput) -> Unit = definedExternally): Request<UpdateMLModelOutput, AWSError>
    open fun waitFor(state: String /* "dataSourceAvailable" */, params: DescribeDataSourcesInput /* MachineLearning.Types.DescribeDataSourcesInput & `T$0` */, callback: (err: AWSError, data: DescribeDataSourcesOutput) -> Unit = definedExternally): Request<DescribeDataSourcesOutput, AWSError>
    open fun waitFor(state: String /* "dataSourceAvailable" */, callback: (err: AWSError, data: DescribeDataSourcesOutput) -> Unit = definedExternally): Request<DescribeDataSourcesOutput, AWSError>
    open fun waitFor(state: String /* "mLModelAvailable" */, params: DescribeMLModelsInput /* MachineLearning.Types.DescribeMLModelsInput & `T$0` */, callback: (err: AWSError, data: DescribeMLModelsOutput) -> Unit = definedExternally): Request<DescribeMLModelsOutput, AWSError>
    open fun waitFor(state: String /* "mLModelAvailable" */, callback: (err: AWSError, data: DescribeMLModelsOutput) -> Unit = definedExternally): Request<DescribeMLModelsOutput, AWSError>
    open fun waitFor(state: String /* "evaluationAvailable" */, params: DescribeEvaluationsInput /* MachineLearning.Types.DescribeEvaluationsInput & `T$0` */, callback: (err: AWSError, data: DescribeEvaluationsOutput) -> Unit = definedExternally): Request<DescribeEvaluationsOutput, AWSError>
    open fun waitFor(state: String /* "evaluationAvailable" */, callback: (err: AWSError, data: DescribeEvaluationsOutput) -> Unit = definedExternally): Request<DescribeEvaluationsOutput, AWSError>
    open fun waitFor(state: String /* "batchPredictionAvailable" */, params: DescribeBatchPredictionsInput /* MachineLearning.Types.DescribeBatchPredictionsInput & `T$0` */, callback: (err: AWSError, data: DescribeBatchPredictionsOutput) -> Unit = definedExternally): Request<DescribeBatchPredictionsOutput, AWSError>
    open fun waitFor(state: String /* "batchPredictionAvailable" */, callback: (err: AWSError, data: DescribeBatchPredictionsOutput) -> Unit = definedExternally): Request<DescribeBatchPredictionsOutput, AWSError>
    interface AddTagsInput {
        var Tags: TagList
        var ResourceId: EntityId
        var ResourceType: String /* "BatchPrediction" | "DataSource" | "Evaluation" | "MLModel" | String */
    }
    interface AddTagsOutput {
        var ResourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "BatchPrediction" | "DataSource" | "Evaluation" | "MLModel" | String */
    }
    interface BatchPrediction {
        var BatchPredictionId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var BatchPredictionDataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataLocationS3: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedByIamUser: AwsUserArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "INPROGRESS" | "FAILED" | "COMPLETED" | "DELETED" | String */
        var OutputUri: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeTime: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var FinishedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var TotalRecordCount: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var InvalidRecordCount: LongType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBatchPredictionInput {
        var BatchPredictionId: EntityId
        var BatchPredictionName: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var MLModelId: EntityId
        var BatchPredictionDataSourceId: EntityId
        var OutputUri: S3Url
    }
    interface CreateBatchPredictionOutput {
        var BatchPredictionId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSourceFromRDSInput {
        var DataSourceId: EntityId
        var DataSourceName: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var RDSData: RDSDataSpec
        var RoleARN: RoleARN
        var ComputeStatistics: ComputeStatistics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSourceFromRDSOutput {
        var DataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSourceFromRedshiftInput {
        var DataSourceId: EntityId
        var DataSourceName: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var DataSpec: RedshiftDataSpec
        var RoleARN: RoleARN
        var ComputeStatistics: ComputeStatistics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSourceFromRedshiftOutput {
        var DataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSourceFromS3Input {
        var DataSourceId: EntityId
        var DataSourceName: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var DataSpec: S3DataSpec
        var ComputeStatistics: ComputeStatistics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSourceFromS3Output {
        var DataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEvaluationInput {
        var EvaluationId: EntityId
        var EvaluationName: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var MLModelId: EntityId
        var EvaluationDataSourceId: EntityId
    }
    interface CreateEvaluationOutput {
        var EvaluationId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMLModelInput {
        var MLModelId: EntityId
        var MLModelName: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var MLModelType: String /* "REGRESSION" | "BINARY" | "MULTICLASS" | String */
        var Parameters: TrainingParameters?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingDataSourceId: EntityId
        var Recipe: Recipe?
            get() = definedExternally
            set(value) = definedExternally
        var RecipeUri: S3Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMLModelOutput {
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRealtimeEndpointInput {
        var MLModelId: EntityId
    }
    interface CreateRealtimeEndpointOutput {
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var RealtimeEndpointInfo: RealtimeEndpointInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSource {
        var DataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var DataLocationS3: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var DataRearrangement: DataRearrangement?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedByIamUser: AwsUserArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var DataSizeInBytes: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfFiles: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "INPROGRESS" | "FAILED" | "COMPLETED" | "DELETED" | String */
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var RedshiftMetadata: RedshiftMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var RDSMetadata: RDSMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeStatistics: ComputeStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeTime: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var FinishedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBatchPredictionInput {
        var BatchPredictionId: EntityId
    }
    interface DeleteBatchPredictionOutput {
        var BatchPredictionId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDataSourceInput {
        var DataSourceId: EntityId
    }
    interface DeleteDataSourceOutput {
        var DataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteEvaluationInput {
        var EvaluationId: EntityId
    }
    interface DeleteEvaluationOutput {
        var EvaluationId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteMLModelInput {
        var MLModelId: EntityId
    }
    interface DeleteMLModelOutput {
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRealtimeEndpointInput {
        var MLModelId: EntityId
    }
    interface DeleteRealtimeEndpointOutput {
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var RealtimeEndpointInfo: RealtimeEndpointInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTagsInput {
        var TagKeys: TagKeyList
        var ResourceId: EntityId
        var ResourceType: String /* "BatchPrediction" | "DataSource" | "Evaluation" | "MLModel" | String */
    }
    interface DeleteTagsOutput {
        var ResourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "BatchPrediction" | "DataSource" | "Evaluation" | "MLModel" | String */
    }
    interface DescribeBatchPredictionsInput {
        var FilterVariable: String /* "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "IAMUser" | "MLModelId" | "DataSourceId" | "DataURI" | String */
        var EQ: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var GT: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var LT: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var GE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var LE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var NE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var Prefix: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "asc" | "dsc" | String */
        var NextToken: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PageLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBatchPredictionsOutput {
        var Results: BatchPredictions?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDataSourcesInput {
        var FilterVariable: String /* "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "DataLocationS3" | "IAMUser" | String */
        var EQ: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var GT: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var LT: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var GE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var LE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var NE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var Prefix: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "asc" | "dsc" | String */
        var NextToken: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PageLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDataSourcesOutput {
        var Results: DataSources?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEvaluationsInput {
        var FilterVariable: String /* "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "IAMUser" | "MLModelId" | "DataSourceId" | "DataURI" | String */
        var EQ: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var GT: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var LT: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var GE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var LE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var NE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var Prefix: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "asc" | "dsc" | String */
        var NextToken: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PageLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEvaluationsOutput {
        var Results: Evaluations?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMLModelsInput {
        var FilterVariable: String /* "CreatedAt" | "LastUpdatedAt" | "Status" | "Name" | "IAMUser" | "TrainingDataSourceId" | "RealtimeEndpointStatus" | "MLModelType" | "Algorithm" | "TrainingDataURI" | String */
        var EQ: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var GT: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var LT: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var GE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var LE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var NE: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var Prefix: ComparatorValue?
            get() = definedExternally
            set(value) = definedExternally
        var SortOrder: String /* "asc" | "dsc" | String */
        var NextToken: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PageLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMLModelsOutput {
        var Results: MLModels?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTagsInput {
        var ResourceId: EntityId
        var ResourceType: String /* "BatchPrediction" | "DataSource" | "Evaluation" | "MLModel" | String */
    }
    interface DescribeTagsOutput {
        var ResourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "BatchPrediction" | "DataSource" | "Evaluation" | "MLModel" | String */
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetailsMap {
        @nativeGetter
        operator fun get(key: String): DetailsValue?
        @nativeSetter
        operator fun set(key: String, value: DetailsValue)
    }
    interface Evaluation {
        var EvaluationId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationDataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataLocationS3: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedByIamUser: AwsUserArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "INPROGRESS" | "FAILED" | "COMPLETED" | "DELETED" | String */
        var PerformanceMetrics: PerformanceMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeTime: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var FinishedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBatchPredictionInput {
        var BatchPredictionId: EntityId
    }
    interface GetBatchPredictionOutput {
        var BatchPredictionId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var BatchPredictionDataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataLocationS3: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedByIamUser: AwsUserArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "INPROGRESS" | "FAILED" | "COMPLETED" | "DELETED" | String */
        var OutputUri: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var LogUri: PresignedS3Url?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeTime: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var FinishedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var TotalRecordCount: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var InvalidRecordCount: LongType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataSourceInput {
        var DataSourceId: EntityId
        var Verbose: Verbose?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataSourceOutput {
        var DataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var DataLocationS3: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var DataRearrangement: DataRearrangement?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedByIamUser: AwsUserArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var DataSizeInBytes: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfFiles: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "INPROGRESS" | "FAILED" | "COMPLETED" | "DELETED" | String */
        var LogUri: PresignedS3Url?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var RedshiftMetadata: RedshiftMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var RDSMetadata: RDSMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeStatistics: ComputeStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeTime: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var FinishedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var DataSourceSchema: DataSchema?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEvaluationInput {
        var EvaluationId: EntityId
    }
    interface GetEvaluationOutput {
        var EvaluationId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationDataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataLocationS3: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedByIamUser: AwsUserArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var Name: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "INPROGRESS" | "FAILED" | "COMPLETED" | "DELETED" | String */
        var PerformanceMetrics: PerformanceMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var LogUri: PresignedS3Url?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeTime: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var FinishedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMLModelInput {
        var MLModelId: EntityId
        var Verbose: Verbose?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMLModelOutput {
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingDataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedByIamUser: AwsUserArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MLModelName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "INPROGRESS" | "FAILED" | "COMPLETED" | "DELETED" | String */
        var SizeInBytes: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointInfo: RealtimeEndpointInfo?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingParameters: TrainingParameters?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataLocationS3: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var MLModelType: String /* "REGRESSION" | "BINARY" | "MULTICLASS" | String */
        var ScoreThreshold: ScoreThreshold?
            get() = definedExternally
            set(value) = definedExternally
        var ScoreThresholdLastUpdatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var LogUri: PresignedS3Url?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeTime: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var FinishedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var Recipe: Recipe?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: DataSchema?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MLModel {
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingDataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedByIamUser: AwsUserArn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var Name: MLModelName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "INPROGRESS" | "FAILED" | "COMPLETED" | "DELETED" | String */
        var SizeInBytes: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointInfo: RealtimeEndpointInfo?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingParameters: TrainingParameters?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataLocationS3: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var Algorithm: String /* "sgd" | String */
        var MLModelType: String /* "REGRESSION" | "BINARY" | "MULTICLASS" | String */
        var ScoreThreshold: ScoreThreshold?
            get() = definedExternally
            set(value) = definedExternally
        var ScoreThresholdLastUpdatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var ComputeTime: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var FinishedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PerformanceMetrics {
        var Properties: PerformanceMetricsProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PerformanceMetricsProperties {
        @nativeGetter
        operator fun get(key: String): PerformanceMetricsPropertyValue?
        @nativeSetter
        operator fun set(key: String, value: PerformanceMetricsPropertyValue)
    }
    interface PredictInput {
        var MLModelId: EntityId
        var Record: Record
        var PredictEndpoint: VipURL
    }
    interface PredictOutput {
        var Prediction: Prediction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Prediction {
        var predictedLabel: Label?
            get() = definedExternally
            set(value) = definedExternally
        var predictedValue: floatLabel?
            get() = definedExternally
            set(value) = definedExternally
        var predictedScores: ScoreValuePerLabelMap?
            get() = definedExternally
            set(value) = definedExternally
        var details: DetailsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RDSDataSpec {
        var DatabaseInformation: RDSDatabase
        var SelectSqlQuery: RDSSelectSqlQuery
        var DatabaseCredentials: RDSDatabaseCredentials
        var S3StagingLocation: S3Url
        var DataRearrangement: DataRearrangement?
            get() = definedExternally
            set(value) = definedExternally
        var DataSchema: DataSchema?
            get() = definedExternally
            set(value) = definedExternally
        var DataSchemaUri: S3Url?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceRole: EDPResourceRole
        var ServiceRole: EDPServiceRole
        var SubnetId: EDPSubnetId
        var SecurityGroupIds: EDPSecurityGroupIds
    }
    interface RDSDatabase {
        var InstanceIdentifier: RDSInstanceIdentifier
        var DatabaseName: RDSDatabaseName
    }
    interface RDSDatabaseCredentials {
        var Username: RDSDatabaseUsername
        var Password: RDSDatabasePassword
    }
    interface RDSMetadata {
        var Database: RDSDatabase?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseUserName: RDSDatabaseUsername?
            get() = definedExternally
            set(value) = definedExternally
        var SelectSqlQuery: RDSSelectSqlQuery?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceRole: EDPResourceRole?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceRole: EDPServiceRole?
            get() = definedExternally
            set(value) = definedExternally
        var DataPipelineId: EDPPipelineId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RealtimeEndpointInfo {
        var PeakRequestsPerSecond: IntegerType?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: EpochTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointUrl: VipURL?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointStatus: String /* "NONE" | "READY" | "UPDATING" | "FAILED" | String */
    }
    interface Record {
        @nativeGetter
        operator fun get(key: String): VariableValue?
        @nativeSetter
        operator fun set(key: String, value: VariableValue)
    }
    interface RedshiftDataSpec {
        var DatabaseInformation: RedshiftDatabase
        var SelectSqlQuery: RedshiftSelectSqlQuery
        var DatabaseCredentials: RedshiftDatabaseCredentials
        var S3StagingLocation: S3Url
        var DataRearrangement: DataRearrangement?
            get() = definedExternally
            set(value) = definedExternally
        var DataSchema: DataSchema?
            get() = definedExternally
            set(value) = definedExternally
        var DataSchemaUri: S3Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RedshiftDatabase {
        var DatabaseName: RedshiftDatabaseName
        var ClusterIdentifier: RedshiftClusterIdentifier
    }
    interface RedshiftDatabaseCredentials {
        var Username: RedshiftDatabaseUsername
        var Password: RedshiftDatabasePassword
    }
    interface RedshiftMetadata {
        var RedshiftDatabase: RedshiftDatabase?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseUserName: RedshiftDatabaseUsername?
            get() = definedExternally
            set(value) = definedExternally
        var SelectSqlQuery: RedshiftSelectSqlQuery?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3DataSpec {
        var DataLocationS3: S3Url
        var DataRearrangement: DataRearrangement?
            get() = definedExternally
            set(value) = definedExternally
        var DataSchema: DataSchema?
            get() = definedExternally
            set(value) = definedExternally
        var DataSchemaLocationS3: S3Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScoreValuePerLabelMap {
        @nativeGetter
        operator fun get(key: String): ScoreValue?
        @nativeSetter
        operator fun set(key: String, value: ScoreValue)
    }
    interface Tag {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrainingParameters {
        @nativeGetter
        operator fun get(key: String): StringType?
        @nativeSetter
        operator fun set(key: String, value: StringType)
    }
    interface UpdateBatchPredictionInput {
        var BatchPredictionId: EntityId
        var BatchPredictionName: EntityName
    }
    interface UpdateBatchPredictionOutput {
        var BatchPredictionId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSourceInput {
        var DataSourceId: EntityId
        var DataSourceName: EntityName
    }
    interface UpdateDataSourceOutput {
        var DataSourceId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateEvaluationInput {
        var EvaluationId: EntityId
        var EvaluationName: EntityName
    }
    interface UpdateEvaluationOutput {
        var EvaluationId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMLModelInput {
        var MLModelId: EntityId
        var MLModelName: EntityName?
            get() = definedExternally
            set(value) = definedExternally
        var ScoreThreshold: ScoreThreshold?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMLModelOutput {
        var MLModelId: EntityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-12-12" | "latest" | String */
    }
}