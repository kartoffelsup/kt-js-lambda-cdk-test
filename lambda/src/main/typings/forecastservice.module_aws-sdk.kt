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
import ForecastService.CategoricalParameterRange
import ForecastService.ContinuousParameterRange
import ForecastService.DatasetGroupSummary
import ForecastService.DatasetImportJobSummary
import ForecastService.DatasetSummary
import ForecastService.FeaturizationMethod
import ForecastService.Featurization
import ForecastService.Filter
import ForecastService.ForecastExportJobSummary
import ForecastService.ForecastSummary
import ForecastService.IntegerParameterRange
import ForecastService.EvaluationResult
import ForecastService.PredictorExecution
import ForecastService.PredictorSummary
import ForecastService.SchemaAttribute
import ForecastService.SupplementaryFeature
import ForecastService.TestWindowSummary
import ForecastService.WindowSummary
import ForecastService.WeightedQuantileLoss
import ForecastService.CreateDatasetRequest
import ForecastService.CreateDatasetResponse
import ForecastService.CreateDatasetGroupRequest
import ForecastService.CreateDatasetGroupResponse
import ForecastService.CreateDatasetImportJobRequest
import ForecastService.CreateDatasetImportJobResponse
import ForecastService.CreateForecastRequest
import ForecastService.CreateForecastResponse
import ForecastService.CreateForecastExportJobRequest
import ForecastService.CreateForecastExportJobResponse
import ForecastService.CreatePredictorRequest
import ForecastService.CreatePredictorResponse
import ForecastService.DeleteDatasetRequest
import ForecastService.DeleteDatasetGroupRequest
import ForecastService.DeleteDatasetImportJobRequest
import ForecastService.DeleteForecastRequest
import ForecastService.DeleteForecastExportJobRequest
import ForecastService.DeletePredictorRequest
import ForecastService.DescribeDatasetRequest
import ForecastService.DescribeDatasetResponse
import ForecastService.DescribeDatasetGroupRequest
import ForecastService.DescribeDatasetGroupResponse
import ForecastService.DescribeDatasetImportJobRequest
import ForecastService.DescribeDatasetImportJobResponse
import ForecastService.DescribeForecastRequest
import ForecastService.DescribeForecastResponse
import ForecastService.DescribeForecastExportJobRequest
import ForecastService.DescribeForecastExportJobResponse
import ForecastService.DescribePredictorRequest
import ForecastService.DescribePredictorResponse
import ForecastService.GetAccuracyMetricsRequest
import ForecastService.GetAccuracyMetricsResponse
import ForecastService.ListDatasetGroupsRequest
import ForecastService.ListDatasetGroupsResponse
import ForecastService.ListDatasetImportJobsRequest
import ForecastService.ListDatasetImportJobsResponse
import ForecastService.ListDatasetsRequest
import ForecastService.ListDatasetsResponse
import ForecastService.ListForecastExportJobsRequest
import ForecastService.ListForecastExportJobsResponse
import ForecastService.ListForecastsRequest
import ForecastService.ListForecastsResponse
import ForecastService.ListPredictorsRequest
import ForecastService.ListPredictorsResponse
import ForecastService.UpdateDatasetGroupRequest
import ForecastService.UpdateDatasetGroupResponse
import ForecastService.DataSource
import ForecastService.Schema
import ForecastService.EncryptionConfig
import ForecastService.DataDestination
import ForecastService.TrainingParameters
import ForecastService.EvaluationParameters
import ForecastService.HyperParameterTuningJobConfig
import ForecastService.InputDataConfig
import ForecastService.FeaturizationConfig
import ForecastService.S3Config
import ForecastService.FieldStatistics
import ForecastService.PredictorExecutionDetails
import ForecastService.FeaturizationMethodParameters
import ForecastService.Statistics
import ForecastService.ParameterRanges
import ForecastService.Metrics

typealias Arn = String

typealias ArnList = Array<Arn>

typealias Boolean = Boolean

typealias CategoricalParameterRanges = Array<CategoricalParameterRange>

typealias ContinuousParameterRanges = Array<ContinuousParameterRange>

typealias DatasetGroups = Array<DatasetGroupSummary>

typealias DatasetImportJobs = Array<DatasetImportJobSummary>

typealias Datasets = Array<DatasetSummary>

typealias Double = Number

typealias ErrorMessage = String

typealias FeaturizationPipeline = Array<FeaturizationMethod>

typealias Featurizations = Array<Featurization>

typealias Filters = Array<Filter>

typealias ForecastDimensions = Array<Name>

typealias ForecastExportJobs = Array<ForecastExportJobSummary>

typealias ForecastType = String

typealias ForecastTypes = Array<ForecastType>

typealias Forecasts = Array<ForecastSummary>

typealias Frequency = String

typealias Integer = Number

typealias IntegerParameterRanges = Array<IntegerParameterRange>

typealias KMSKeyArn = String

typealias MaxResults = Number

typealias Message = String

typealias Name = String

typealias NextToken = String

typealias ParameterKey = String

typealias ParameterValue = String

typealias PredictorEvaluationResults = Array<EvaluationResult>

typealias PredictorExecutions = Array<PredictorExecution>

typealias Predictors = Array<PredictorSummary>

typealias S3Path = String

typealias SchemaAttributes = Array<SchemaAttribute>

typealias Status = String

typealias String = String

typealias SupplementaryFeatures = Array<SupplementaryFeature>

typealias TestWindowDetails = Array<TestWindowSummary>

typealias TestWindows = Array<WindowSummary>

typealias Timestamp = Date

typealias TimestampFormat = String

typealias Value = String

typealias Values = Array<Value>

typealias WeightedQuantileLosses = Array<WeightedQuantileLoss>

@JsModule("aws-sdk")
external open class ForecastService(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ForecastService.Types.ClientConfiguration */
    open fun createDataset(params: CreateDatasetRequest, callback: (err: AWSError, data: CreateDatasetResponse) -> Unit = definedExternally): Request<CreateDatasetResponse, AWSError>
    open fun createDataset(callback: (err: AWSError, data: CreateDatasetResponse) -> Unit = definedExternally): Request<CreateDatasetResponse, AWSError>
    open fun createDatasetGroup(params: CreateDatasetGroupRequest, callback: (err: AWSError, data: CreateDatasetGroupResponse) -> Unit = definedExternally): Request<CreateDatasetGroupResponse, AWSError>
    open fun createDatasetGroup(callback: (err: AWSError, data: CreateDatasetGroupResponse) -> Unit = definedExternally): Request<CreateDatasetGroupResponse, AWSError>
    open fun createDatasetImportJob(params: CreateDatasetImportJobRequest, callback: (err: AWSError, data: CreateDatasetImportJobResponse) -> Unit = definedExternally): Request<CreateDatasetImportJobResponse, AWSError>
    open fun createDatasetImportJob(callback: (err: AWSError, data: CreateDatasetImportJobResponse) -> Unit = definedExternally): Request<CreateDatasetImportJobResponse, AWSError>
    open fun createForecast(params: CreateForecastRequest, callback: (err: AWSError, data: CreateForecastResponse) -> Unit = definedExternally): Request<CreateForecastResponse, AWSError>
    open fun createForecast(callback: (err: AWSError, data: CreateForecastResponse) -> Unit = definedExternally): Request<CreateForecastResponse, AWSError>
    open fun createForecastExportJob(params: CreateForecastExportJobRequest, callback: (err: AWSError, data: CreateForecastExportJobResponse) -> Unit = definedExternally): Request<CreateForecastExportJobResponse, AWSError>
    open fun createForecastExportJob(callback: (err: AWSError, data: CreateForecastExportJobResponse) -> Unit = definedExternally): Request<CreateForecastExportJobResponse, AWSError>
    open fun createPredictor(params: CreatePredictorRequest, callback: (err: AWSError, data: CreatePredictorResponse) -> Unit = definedExternally): Request<CreatePredictorResponse, AWSError>
    open fun createPredictor(callback: (err: AWSError, data: CreatePredictorResponse) -> Unit = definedExternally): Request<CreatePredictorResponse, AWSError>
    open fun deleteDataset(params: DeleteDatasetRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDataset(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDatasetGroup(params: DeleteDatasetGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDatasetGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDatasetImportJob(params: DeleteDatasetImportJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDatasetImportJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteForecast(params: DeleteForecastRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteForecast(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteForecastExportJob(params: DeleteForecastExportJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteForecastExportJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePredictor(params: DeletePredictorRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePredictor(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeDataset(params: DescribeDatasetRequest, callback: (err: AWSError, data: DescribeDatasetResponse) -> Unit = definedExternally): Request<DescribeDatasetResponse, AWSError>
    open fun describeDataset(callback: (err: AWSError, data: DescribeDatasetResponse) -> Unit = definedExternally): Request<DescribeDatasetResponse, AWSError>
    open fun describeDatasetGroup(params: DescribeDatasetGroupRequest, callback: (err: AWSError, data: DescribeDatasetGroupResponse) -> Unit = definedExternally): Request<DescribeDatasetGroupResponse, AWSError>
    open fun describeDatasetGroup(callback: (err: AWSError, data: DescribeDatasetGroupResponse) -> Unit = definedExternally): Request<DescribeDatasetGroupResponse, AWSError>
    open fun describeDatasetImportJob(params: DescribeDatasetImportJobRequest, callback: (err: AWSError, data: DescribeDatasetImportJobResponse) -> Unit = definedExternally): Request<DescribeDatasetImportJobResponse, AWSError>
    open fun describeDatasetImportJob(callback: (err: AWSError, data: DescribeDatasetImportJobResponse) -> Unit = definedExternally): Request<DescribeDatasetImportJobResponse, AWSError>
    open fun describeForecast(params: DescribeForecastRequest, callback: (err: AWSError, data: DescribeForecastResponse) -> Unit = definedExternally): Request<DescribeForecastResponse, AWSError>
    open fun describeForecast(callback: (err: AWSError, data: DescribeForecastResponse) -> Unit = definedExternally): Request<DescribeForecastResponse, AWSError>
    open fun describeForecastExportJob(params: DescribeForecastExportJobRequest, callback: (err: AWSError, data: DescribeForecastExportJobResponse) -> Unit = definedExternally): Request<DescribeForecastExportJobResponse, AWSError>
    open fun describeForecastExportJob(callback: (err: AWSError, data: DescribeForecastExportJobResponse) -> Unit = definedExternally): Request<DescribeForecastExportJobResponse, AWSError>
    open fun describePredictor(params: DescribePredictorRequest, callback: (err: AWSError, data: DescribePredictorResponse) -> Unit = definedExternally): Request<DescribePredictorResponse, AWSError>
    open fun describePredictor(callback: (err: AWSError, data: DescribePredictorResponse) -> Unit = definedExternally): Request<DescribePredictorResponse, AWSError>
    open fun getAccuracyMetrics(params: GetAccuracyMetricsRequest, callback: (err: AWSError, data: GetAccuracyMetricsResponse) -> Unit = definedExternally): Request<GetAccuracyMetricsResponse, AWSError>
    open fun getAccuracyMetrics(callback: (err: AWSError, data: GetAccuracyMetricsResponse) -> Unit = definedExternally): Request<GetAccuracyMetricsResponse, AWSError>
    open fun listDatasetGroups(params: ListDatasetGroupsRequest, callback: (err: AWSError, data: ListDatasetGroupsResponse) -> Unit = definedExternally): Request<ListDatasetGroupsResponse, AWSError>
    open fun listDatasetGroups(callback: (err: AWSError, data: ListDatasetGroupsResponse) -> Unit = definedExternally): Request<ListDatasetGroupsResponse, AWSError>
    open fun listDatasetImportJobs(params: ListDatasetImportJobsRequest, callback: (err: AWSError, data: ListDatasetImportJobsResponse) -> Unit = definedExternally): Request<ListDatasetImportJobsResponse, AWSError>
    open fun listDatasetImportJobs(callback: (err: AWSError, data: ListDatasetImportJobsResponse) -> Unit = definedExternally): Request<ListDatasetImportJobsResponse, AWSError>
    open fun listDatasets(params: ListDatasetsRequest, callback: (err: AWSError, data: ListDatasetsResponse) -> Unit = definedExternally): Request<ListDatasetsResponse, AWSError>
    open fun listDatasets(callback: (err: AWSError, data: ListDatasetsResponse) -> Unit = definedExternally): Request<ListDatasetsResponse, AWSError>
    open fun listForecastExportJobs(params: ListForecastExportJobsRequest, callback: (err: AWSError, data: ListForecastExportJobsResponse) -> Unit = definedExternally): Request<ListForecastExportJobsResponse, AWSError>
    open fun listForecastExportJobs(callback: (err: AWSError, data: ListForecastExportJobsResponse) -> Unit = definedExternally): Request<ListForecastExportJobsResponse, AWSError>
    open fun listForecasts(params: ListForecastsRequest, callback: (err: AWSError, data: ListForecastsResponse) -> Unit = definedExternally): Request<ListForecastsResponse, AWSError>
    open fun listForecasts(callback: (err: AWSError, data: ListForecastsResponse) -> Unit = definedExternally): Request<ListForecastsResponse, AWSError>
    open fun listPredictors(params: ListPredictorsRequest, callback: (err: AWSError, data: ListPredictorsResponse) -> Unit = definedExternally): Request<ListPredictorsResponse, AWSError>
    open fun listPredictors(callback: (err: AWSError, data: ListPredictorsResponse) -> Unit = definedExternally): Request<ListPredictorsResponse, AWSError>
    open fun updateDatasetGroup(params: UpdateDatasetGroupRequest, callback: (err: AWSError, data: UpdateDatasetGroupResponse) -> Unit = definedExternally): Request<UpdateDatasetGroupResponse, AWSError>
    open fun updateDatasetGroup(callback: (err: AWSError, data: UpdateDatasetGroupResponse) -> Unit = definedExternally): Request<UpdateDatasetGroupResponse, AWSError>
    interface CategoricalParameterRange {
        var Name: Name
        var Values: Values
    }
    interface ContinuousParameterRange {
        var Name: Name
        var MaxValue: Double
        var MinValue: Double
        var ScalingType: String /* "Auto" | "Linear" | "Logarithmic" | "ReverseLogarithmic" | String */
    }
    interface CreateDatasetGroupRequest {
        var DatasetGroupName: Name
        var Domain: String /* "RETAIL" | "CUSTOM" | "INVENTORY_PLANNING" | "EC2_CAPACITY" | "WORK_FORCE" | "WEB_TRAFFIC" | "METRICS" | String */
        var DatasetArns: ArnList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetGroupResponse {
        var DatasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetImportJobRequest {
        var DatasetImportJobName: Name
        var DatasetArn: Arn
        var DataSource: DataSource
        var TimestampFormat: TimestampFormat?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetImportJobResponse {
        var DatasetImportJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetRequest {
        var DatasetName: Name
        var Domain: String /* "RETAIL" | "CUSTOM" | "INVENTORY_PLANNING" | "EC2_CAPACITY" | "WORK_FORCE" | "WEB_TRAFFIC" | "METRICS" | String */
        var DatasetType: String /* "TARGET_TIME_SERIES" | "RELATED_TIME_SERIES" | "ITEM_METADATA" | String */
        var DataFrequency: Frequency?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: Schema
        var EncryptionConfig: EncryptionConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetResponse {
        var DatasetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateForecastExportJobRequest {
        var ForecastExportJobName: Name
        var ForecastArn: Arn
        var Destination: DataDestination
    }
    interface CreateForecastExportJobResponse {
        var ForecastExportJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateForecastRequest {
        var ForecastName: Name
        var PredictorArn: Arn
        var ForecastTypes: ForecastTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateForecastResponse {
        var ForecastArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePredictorRequest {
        var PredictorName: Name
        var AlgorithmArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ForecastHorizon: Integer
        var PerformAutoML: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PerformHPO: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingParameters: TrainingParameters?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationParameters: EvaluationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var HPOConfig: HyperParameterTuningJobConfig?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig
        var FeaturizationConfig: FeaturizationConfig
        var EncryptionConfig: EncryptionConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePredictorResponse {
        var PredictorArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataDestination {
        var S3Config: S3Config
    }
    interface DataSource {
        var S3Config: S3Config
    }
    interface DatasetGroupSummary {
        var DatasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetGroupName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetImportJobSummary {
        var DatasetImportJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetImportJobName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var DataSource: DataSource?
            get() = definedExternally
            set(value) = definedExternally
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var Message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetSummary {
        var DatasetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetType: String /* "TARGET_TIME_SERIES" | "RELATED_TIME_SERIES" | "ITEM_METADATA" | String */
        var Domain: String /* "RETAIL" | "CUSTOM" | "INVENTORY_PLANNING" | "EC2_CAPACITY" | "WORK_FORCE" | "WEB_TRAFFIC" | "METRICS" | String */
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDatasetGroupRequest {
        var DatasetGroupArn: Arn
    }
    interface DeleteDatasetImportJobRequest {
        var DatasetImportJobArn: Arn
    }
    interface DeleteDatasetRequest {
        var DatasetArn: Arn
    }
    interface DeleteForecastExportJobRequest {
        var ForecastExportJobArn: Arn
    }
    interface DeleteForecastRequest {
        var ForecastArn: Arn
    }
    interface DeletePredictorRequest {
        var PredictorArn: Arn
    }
    interface DescribeDatasetGroupRequest {
        var DatasetGroupArn: Arn
    }
    interface DescribeDatasetGroupResponse {
        var DatasetGroupName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetArns: ArnList?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String /* "RETAIL" | "CUSTOM" | "INVENTORY_PLANNING" | "EC2_CAPACITY" | "WORK_FORCE" | "WEB_TRAFFIC" | "METRICS" | String */
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDatasetImportJobRequest {
        var DatasetImportJobArn: Arn
    }
    interface DescribeDatasetImportJobResponse {
        var DatasetImportJobName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetImportJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var TimestampFormat: TimestampFormat?
            get() = definedExternally
            set(value) = definedExternally
        var DataSource: DataSource?
            get() = definedExternally
            set(value) = definedExternally
        var FieldStatistics: FieldStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var DataSize: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDatasetRequest {
        var DatasetArn: Arn
    }
    interface DescribeDatasetResponse {
        var DatasetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: String /* "RETAIL" | "CUSTOM" | "INVENTORY_PLANNING" | "EC2_CAPACITY" | "WORK_FORCE" | "WEB_TRAFFIC" | "METRICS" | String */
        var DatasetType: String /* "TARGET_TIME_SERIES" | "RELATED_TIME_SERIES" | "ITEM_METADATA" | String */
        var DataFrequency: Frequency?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: Schema?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionConfig: EncryptionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeForecastExportJobRequest {
        var ForecastExportJobArn: Arn
    }
    interface DescribeForecastExportJobResponse {
        var ForecastExportJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ForecastExportJobName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var ForecastArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Destination: DataDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeForecastRequest {
        var ForecastArn: Arn
    }
    interface DescribeForecastResponse {
        var ForecastArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ForecastName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var ForecastTypes: ForecastTypes?
            get() = definedExternally
            set(value) = definedExternally
        var PredictorArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePredictorRequest {
        var PredictorArn: Arn
    }
    interface DescribePredictorResponse {
        var PredictorArn: Name?
            get() = definedExternally
            set(value) = definedExternally
        var PredictorName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var AlgorithmArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ForecastHorizon: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var PerformAutoML: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var PerformHPO: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TrainingParameters: TrainingParameters?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationParameters: EvaluationParameters?
            get() = definedExternally
            set(value) = definedExternally
        var HPOConfig: HyperParameterTuningJobConfig?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var FeaturizationConfig: FeaturizationConfig?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionConfig: EncryptionConfig?
            get() = definedExternally
            set(value) = definedExternally
        var PredictorExecutionDetails: PredictorExecutionDetails?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetImportJobArns: ArnList?
            get() = definedExternally
            set(value) = definedExternally
        var AutoMLAlgorithmArns: ArnList?
            get() = definedExternally
            set(value) = definedExternally
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var Message: Message?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionConfig {
        var RoleArn: Arn
        var KMSKeyArn: KMSKeyArn
    }
    interface EvaluationParameters {
        var NumberOfBacktestWindows: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var BackTestWindowOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EvaluationResult {
        var AlgorithmArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var TestWindows: TestWindows?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Featurization {
        var AttributeName: Name
        var FeaturizationPipeline: FeaturizationPipeline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FeaturizationConfig {
        var ForecastFrequency: Frequency
        var ForecastDimensions: ForecastDimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Featurizations: Featurizations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FeaturizationMethod {
        var FeaturizationMethodName: String /* "filling" | String */
        var FeaturizationMethodParameters: FeaturizationMethodParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FeaturizationMethodParameters {
        @nativeGetter
        operator fun get(key: String): ParameterValue?
        @nativeSetter
        operator fun set(key: String, value: ParameterValue)
    }
    interface FieldStatistics {
        @nativeGetter
        operator fun get(key: String): Statistics?
        @nativeSetter
        operator fun set(key: String, value: Statistics)
    }
    interface Filter {
        var Key: String
        var Value: Arn
        var Condition: String /* "IS" | "IS_NOT" | String */
    }
    interface ForecastExportJobSummary {
        var ForecastExportJobArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ForecastExportJobName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Destination: DataDestination?
            get() = definedExternally
            set(value) = definedExternally
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var Message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ForecastSummary {
        var ForecastArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ForecastName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var PredictorArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var Message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccuracyMetricsRequest {
        var PredictorArn: Arn
    }
    interface GetAccuracyMetricsResponse {
        var PredictorEvaluationResults: PredictorEvaluationResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HyperParameterTuningJobConfig {
        var ParameterRanges: ParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputDataConfig {
        var DatasetGroupArn: Arn
        var SupplementaryFeatures: SupplementaryFeatures?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IntegerParameterRange {
        var Name: Name
        var MaxValue: Integer
        var MinValue: Integer
        var ScalingType: String /* "Auto" | "Linear" | "Logarithmic" | "ReverseLogarithmic" | String */
    }
    interface ListDatasetGroupsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetGroupsResponse {
        var DatasetGroups: DatasetGroups?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetImportJobsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetImportJobsResponse {
        var DatasetImportJobs: DatasetImportJobs?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetsResponse {
        var Datasets: Datasets?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListForecastExportJobsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListForecastExportJobsResponse {
        var ForecastExportJobs: ForecastExportJobs?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListForecastsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListForecastsResponse {
        var Forecasts: Forecasts?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPredictorsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPredictorsResponse {
        var Predictors: Predictors?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Metrics {
        var RMSE: Double?
            get() = definedExternally
            set(value) = definedExternally
        var WeightedQuantileLosses: WeightedQuantileLosses?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterRanges {
        var CategoricalParameterRanges: CategoricalParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var ContinuousParameterRanges: ContinuousParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
        var IntegerParameterRanges: IntegerParameterRanges?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PredictorExecution {
        var AlgorithmArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var TestWindows: TestWindowDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PredictorExecutionDetails {
        var PredictorExecutions: PredictorExecutions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PredictorSummary {
        var PredictorArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var PredictorName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var Message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModificationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Config {
        var Path: S3Path
        var RoleArn: Arn
        var KMSKeyArn: KMSKeyArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Schema {
        var Attributes: SchemaAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SchemaAttribute {
        var AttributeName: Name?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeType: String /* "string" | "integer" | "float" | "timestamp" | String */
    }
    interface Statistics {
        var Count: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var CountDistinct: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var CountNull: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var CountNan: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Min: String?
            get() = definedExternally
            set(value) = definedExternally
        var Max: String?
            get() = definedExternally
            set(value) = definedExternally
        var Avg: Double?
            get() = definedExternally
            set(value) = definedExternally
        var Stddev: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SupplementaryFeature {
        var Name: Name
        var Value: Value
    }
    interface TestWindowSummary {
        var TestWindowStart: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TestWindowEnd: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: Status?
            get() = definedExternally
            set(value) = definedExternally
        var Message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrainingParameters {
        @nativeGetter
        operator fun get(key: String): ParameterValue?
        @nativeSetter
        operator fun set(key: String, value: ParameterValue)
    }
    interface UpdateDatasetGroupRequest {
        var DatasetGroupArn: Arn
        var DatasetArns: ArnList
    }
    interface UpdateDatasetGroupResponse
    interface WeightedQuantileLoss {
        var Quantile: Double?
            get() = definedExternally
            set(value) = definedExternally
        var LossValue: Double?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WindowSummary {
        var TestWindowStart: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TestWindowEnd: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ItemCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationType: String /* "SUMMARY" | "COMPUTED" | String */
        var Metrics: Metrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-06-26" | "latest" | String */
    }
}