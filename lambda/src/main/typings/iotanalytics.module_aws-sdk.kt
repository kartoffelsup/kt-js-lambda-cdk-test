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
import IoTAnalytics.BatchPutMessageErrorEntry
import IoTAnalytics.ChannelSummary
import IoTAnalytics.DatasetActionSummary
import IoTAnalytics.DatasetAction
import IoTAnalytics.DatasetContentDeliveryRule
import IoTAnalytics.DatasetContentSummary
import IoTAnalytics.DatasetEntry
import IoTAnalytics.DatasetSummary
import IoTAnalytics.DatasetTrigger
import IoTAnalytics.DatastoreSummary
import IoTAnalytics.Message
import IoTAnalytics.PipelineActivity
import IoTAnalytics.PipelineSummary
import IoTAnalytics.QueryFilter
import IoTAnalytics.ReprocessingSummary
import IoTAnalytics.Tag
import IoTAnalytics.Variable
import IoTAnalytics.BatchPutMessageRequest
import IoTAnalytics.BatchPutMessageResponse
import IoTAnalytics.CancelPipelineReprocessingRequest
import IoTAnalytics.CancelPipelineReprocessingResponse
import IoTAnalytics.CreateChannelRequest
import IoTAnalytics.CreateChannelResponse
import IoTAnalytics.CreateDatasetRequest
import IoTAnalytics.CreateDatasetResponse
import IoTAnalytics.CreateDatasetContentRequest
import IoTAnalytics.CreateDatasetContentResponse
import IoTAnalytics.CreateDatastoreRequest
import IoTAnalytics.CreateDatastoreResponse
import IoTAnalytics.CreatePipelineRequest
import IoTAnalytics.CreatePipelineResponse
import IoTAnalytics.DeleteChannelRequest
import IoTAnalytics.DeleteDatasetRequest
import IoTAnalytics.DeleteDatasetContentRequest
import IoTAnalytics.DeleteDatastoreRequest
import IoTAnalytics.DeletePipelineRequest
import IoTAnalytics.DescribeChannelRequest
import IoTAnalytics.DescribeChannelResponse
import IoTAnalytics.DescribeDatasetRequest
import IoTAnalytics.DescribeDatasetResponse
import IoTAnalytics.DescribeDatastoreRequest
import IoTAnalytics.DescribeDatastoreResponse
import IoTAnalytics.DescribeLoggingOptionsRequest
import IoTAnalytics.DescribeLoggingOptionsResponse
import IoTAnalytics.DescribePipelineRequest
import IoTAnalytics.DescribePipelineResponse
import IoTAnalytics.GetDatasetContentRequest
import IoTAnalytics.GetDatasetContentResponse
import IoTAnalytics.ListChannelsRequest
import IoTAnalytics.ListChannelsResponse
import IoTAnalytics.ListDatasetContentsRequest
import IoTAnalytics.ListDatasetContentsResponse
import IoTAnalytics.ListDatasetsRequest
import IoTAnalytics.ListDatasetsResponse
import IoTAnalytics.ListDatastoresRequest
import IoTAnalytics.ListDatastoresResponse
import IoTAnalytics.ListPipelinesRequest
import IoTAnalytics.ListPipelinesResponse
import IoTAnalytics.ListTagsForResourceRequest
import IoTAnalytics.ListTagsForResourceResponse
import IoTAnalytics.PutLoggingOptionsRequest
import IoTAnalytics.RunPipelineActivityRequest
import IoTAnalytics.RunPipelineActivityResponse
import IoTAnalytics.SampleChannelDataRequest
import IoTAnalytics.SampleChannelDataResponse
import IoTAnalytics.StartPipelineReprocessingRequest
import IoTAnalytics.StartPipelineReprocessingResponse
import IoTAnalytics.TagResourceRequest
import IoTAnalytics.TagResourceResponse
import IoTAnalytics.UntagResourceRequest
import IoTAnalytics.UntagResourceResponse
import IoTAnalytics.UpdateChannelRequest
import IoTAnalytics.UpdateDatasetRequest
import IoTAnalytics.UpdateDatastoreRequest
import IoTAnalytics.UpdatePipelineRequest
import IoTAnalytics.AttributeNameMapping
import IoTAnalytics.ChannelStorage
import IoTAnalytics.RetentionPeriod
import IoTAnalytics.EstimatedResourceSize
import IoTAnalytics.ServiceManagedChannelS3Storage
import IoTAnalytics.CustomerManagedChannelS3Storage
import IoTAnalytics.ServiceManagedChannelS3StorageSummary
import IoTAnalytics.CustomerManagedChannelS3StorageSummary
import IoTAnalytics.ChannelStorageSummary
import IoTAnalytics.ResourceConfiguration
import IoTAnalytics.VersioningConfiguration
import IoTAnalytics.DatastoreStorage
import IoTAnalytics.SqlQueryDatasetAction
import IoTAnalytics.ContainerDatasetAction
import IoTAnalytics.IotEventsDestinationConfiguration
import IoTAnalytics.S3DestinationConfiguration
import IoTAnalytics.DatasetContentDeliveryDestination
import IoTAnalytics.DatasetContentStatus
import IoTAnalytics.Schedule
import IoTAnalytics.TriggeringDataset
import IoTAnalytics.ServiceManagedDatastoreS3Storage
import IoTAnalytics.CustomerManagedDatastoreS3Storage
import IoTAnalytics.ServiceManagedDatastoreS3StorageSummary
import IoTAnalytics.CustomerManagedDatastoreS3StorageSummary
import IoTAnalytics.DatastoreStorageSummary
import IoTAnalytics.Channel
import IoTAnalytics.ChannelStatistics
import IoTAnalytics.Dataset
import IoTAnalytics.Datastore
import IoTAnalytics.DatastoreStatistics
import IoTAnalytics.LoggingOptions
import IoTAnalytics.Pipeline
import IoTAnalytics.ChannelActivity
import IoTAnalytics.LambdaActivity
import IoTAnalytics.DatastoreActivity
import IoTAnalytics.AddAttributesActivity
import IoTAnalytics.RemoveAttributesActivity
import IoTAnalytics.SelectAttributesActivity
import IoTAnalytics.FilterActivity
import IoTAnalytics.MathActivity
import IoTAnalytics.DeviceRegistryEnrichActivity
import IoTAnalytics.DeviceShadowEnrichActivity
import IoTAnalytics.DeltaTime
import IoTAnalytics.GlueConfiguration
import IoTAnalytics.DatasetContentVersionValue
import IoTAnalytics.OutputFileUriValue

typealias ActivityBatchSize = Number

typealias ActivityName = String

typealias AttributeName = String

typealias AttributeNames = Array<AttributeName>

typealias BatchPutMessageErrorEntries = Array<BatchPutMessageErrorEntry>

typealias BucketKeyExpression = String

typealias BucketName = String

typealias ChannelArn = String

typealias ChannelName = String

typealias ChannelSummaries = Array<ChannelSummary>

typealias DatasetActionName = String

typealias DatasetActionSummaries = Array<DatasetActionSummary>

typealias DatasetActions = Array<DatasetAction>

typealias DatasetArn = String

typealias DatasetContentDeliveryRules = Array<DatasetContentDeliveryRule>

typealias DatasetContentSummaries = Array<DatasetContentSummary>

typealias DatasetContentVersion = String

typealias DatasetEntries = Array<DatasetEntry>

typealias DatasetName = String

typealias DatasetSummaries = Array<DatasetSummary>

typealias DatasetTriggers = Array<DatasetTrigger>

typealias DatastoreArn = String

typealias DatastoreName = String

typealias DatastoreSummaries = Array<DatastoreSummary>

typealias DoubleValue = Number

typealias EndTime = Date

typealias EntryName = String

typealias ErrorCode = String

typealias ErrorMessage = String

typealias FilterExpression = String

typealias GlueDatabaseName = String

typealias GlueTableName = String

typealias Image = String

typealias IncludeStatisticsFlag = Boolean

typealias IotEventsInputName = String

typealias LambdaName = String

typealias LogResult = String

typealias LoggingEnabled = Boolean

typealias MathExpression = String

typealias MaxMessages = Number

typealias MaxResults = Number

typealias MaxVersions = Number

typealias MessageId = String

typealias MessagePayloads = Array<dynamic /* Buffer | Uint8Array | Blob | String */>

typealias Messages = Array<Message>

typealias NextToken = String

typealias OffsetSeconds = Number

typealias OutputFileName = String

typealias PipelineActivities = Array<PipelineActivity>

typealias PipelineArn = String

typealias PipelineName = String

typealias PipelineSummaries = Array<PipelineSummary>

typealias PresignedURI = String

typealias QueryFilters = Array<QueryFilter>

typealias Reason = String

typealias ReprocessingId = String

typealias ReprocessingSummaries = Array<ReprocessingSummary>

typealias ResourceArn = String

typealias RetentionPeriodInDays = Number

typealias RoleArn = String

typealias S3KeyPrefix = String

typealias ScheduleExpression = String

typealias SizeInBytes = Number

typealias SqlQuery = String

typealias StartTime = Date

typealias StringValue = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TimeExpression = String

typealias Timestamp = Date

typealias UnlimitedRetentionPeriod = Boolean

typealias UnlimitedVersioning = Boolean

typealias VariableName = String

typealias Variables = Array<Variable>

typealias VolumeSizeInGB = Number

@JsModule("aws-sdk")
external open class IoTAnalytics(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & IoTAnalytics.Types.ClientConfiguration */
    open fun batchPutMessage(params: BatchPutMessageRequest, callback: (err: AWSError, data: BatchPutMessageResponse) -> Unit = definedExternally): Request<BatchPutMessageResponse, AWSError>
    open fun batchPutMessage(callback: (err: AWSError, data: BatchPutMessageResponse) -> Unit = definedExternally): Request<BatchPutMessageResponse, AWSError>
    open fun cancelPipelineReprocessing(params: CancelPipelineReprocessingRequest, callback: (err: AWSError, data: CancelPipelineReprocessingResponse) -> Unit = definedExternally): Request<CancelPipelineReprocessingResponse, AWSError>
    open fun cancelPipelineReprocessing(callback: (err: AWSError, data: CancelPipelineReprocessingResponse) -> Unit = definedExternally): Request<CancelPipelineReprocessingResponse, AWSError>
    open fun createChannel(params: CreateChannelRequest, callback: (err: AWSError, data: CreateChannelResponse) -> Unit = definedExternally): Request<CreateChannelResponse, AWSError>
    open fun createChannel(callback: (err: AWSError, data: CreateChannelResponse) -> Unit = definedExternally): Request<CreateChannelResponse, AWSError>
    open fun createDataset(params: CreateDatasetRequest, callback: (err: AWSError, data: CreateDatasetResponse) -> Unit = definedExternally): Request<CreateDatasetResponse, AWSError>
    open fun createDataset(callback: (err: AWSError, data: CreateDatasetResponse) -> Unit = definedExternally): Request<CreateDatasetResponse, AWSError>
    open fun createDatasetContent(params: CreateDatasetContentRequest, callback: (err: AWSError, data: CreateDatasetContentResponse) -> Unit = definedExternally): Request<CreateDatasetContentResponse, AWSError>
    open fun createDatasetContent(callback: (err: AWSError, data: CreateDatasetContentResponse) -> Unit = definedExternally): Request<CreateDatasetContentResponse, AWSError>
    open fun createDatastore(params: CreateDatastoreRequest, callback: (err: AWSError, data: CreateDatastoreResponse) -> Unit = definedExternally): Request<CreateDatastoreResponse, AWSError>
    open fun createDatastore(callback: (err: AWSError, data: CreateDatastoreResponse) -> Unit = definedExternally): Request<CreateDatastoreResponse, AWSError>
    open fun createPipeline(params: CreatePipelineRequest, callback: (err: AWSError, data: CreatePipelineResponse) -> Unit = definedExternally): Request<CreatePipelineResponse, AWSError>
    open fun createPipeline(callback: (err: AWSError, data: CreatePipelineResponse) -> Unit = definedExternally): Request<CreatePipelineResponse, AWSError>
    open fun deleteChannel(params: DeleteChannelRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteChannel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDataset(params: DeleteDatasetRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDataset(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDatasetContent(params: DeleteDatasetContentRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDatasetContent(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDatastore(params: DeleteDatastoreRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDatastore(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePipeline(params: DeletePipelineRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePipeline(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeChannel(params: DescribeChannelRequest, callback: (err: AWSError, data: DescribeChannelResponse) -> Unit = definedExternally): Request<DescribeChannelResponse, AWSError>
    open fun describeChannel(callback: (err: AWSError, data: DescribeChannelResponse) -> Unit = definedExternally): Request<DescribeChannelResponse, AWSError>
    open fun describeDataset(params: DescribeDatasetRequest, callback: (err: AWSError, data: DescribeDatasetResponse) -> Unit = definedExternally): Request<DescribeDatasetResponse, AWSError>
    open fun describeDataset(callback: (err: AWSError, data: DescribeDatasetResponse) -> Unit = definedExternally): Request<DescribeDatasetResponse, AWSError>
    open fun describeDatastore(params: DescribeDatastoreRequest, callback: (err: AWSError, data: DescribeDatastoreResponse) -> Unit = definedExternally): Request<DescribeDatastoreResponse, AWSError>
    open fun describeDatastore(callback: (err: AWSError, data: DescribeDatastoreResponse) -> Unit = definedExternally): Request<DescribeDatastoreResponse, AWSError>
    open fun describeLoggingOptions(params: DescribeLoggingOptionsRequest, callback: (err: AWSError, data: DescribeLoggingOptionsResponse) -> Unit = definedExternally): Request<DescribeLoggingOptionsResponse, AWSError>
    open fun describeLoggingOptions(callback: (err: AWSError, data: DescribeLoggingOptionsResponse) -> Unit = definedExternally): Request<DescribeLoggingOptionsResponse, AWSError>
    open fun describePipeline(params: DescribePipelineRequest, callback: (err: AWSError, data: DescribePipelineResponse) -> Unit = definedExternally): Request<DescribePipelineResponse, AWSError>
    open fun describePipeline(callback: (err: AWSError, data: DescribePipelineResponse) -> Unit = definedExternally): Request<DescribePipelineResponse, AWSError>
    open fun getDatasetContent(params: GetDatasetContentRequest, callback: (err: AWSError, data: GetDatasetContentResponse) -> Unit = definedExternally): Request<GetDatasetContentResponse, AWSError>
    open fun getDatasetContent(callback: (err: AWSError, data: GetDatasetContentResponse) -> Unit = definedExternally): Request<GetDatasetContentResponse, AWSError>
    open fun listChannels(params: ListChannelsRequest, callback: (err: AWSError, data: ListChannelsResponse) -> Unit = definedExternally): Request<ListChannelsResponse, AWSError>
    open fun listChannels(callback: (err: AWSError, data: ListChannelsResponse) -> Unit = definedExternally): Request<ListChannelsResponse, AWSError>
    open fun listDatasetContents(params: ListDatasetContentsRequest, callback: (err: AWSError, data: ListDatasetContentsResponse) -> Unit = definedExternally): Request<ListDatasetContentsResponse, AWSError>
    open fun listDatasetContents(callback: (err: AWSError, data: ListDatasetContentsResponse) -> Unit = definedExternally): Request<ListDatasetContentsResponse, AWSError>
    open fun listDatasets(params: ListDatasetsRequest, callback: (err: AWSError, data: ListDatasetsResponse) -> Unit = definedExternally): Request<ListDatasetsResponse, AWSError>
    open fun listDatasets(callback: (err: AWSError, data: ListDatasetsResponse) -> Unit = definedExternally): Request<ListDatasetsResponse, AWSError>
    open fun listDatastores(params: ListDatastoresRequest, callback: (err: AWSError, data: ListDatastoresResponse) -> Unit = definedExternally): Request<ListDatastoresResponse, AWSError>
    open fun listDatastores(callback: (err: AWSError, data: ListDatastoresResponse) -> Unit = definedExternally): Request<ListDatastoresResponse, AWSError>
    open fun listPipelines(params: ListPipelinesRequest, callback: (err: AWSError, data: ListPipelinesResponse) -> Unit = definedExternally): Request<ListPipelinesResponse, AWSError>
    open fun listPipelines(callback: (err: AWSError, data: ListPipelinesResponse) -> Unit = definedExternally): Request<ListPipelinesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun putLoggingOptions(params: PutLoggingOptionsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putLoggingOptions(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun runPipelineActivity(params: RunPipelineActivityRequest, callback: (err: AWSError, data: RunPipelineActivityResponse) -> Unit = definedExternally): Request<RunPipelineActivityResponse, AWSError>
    open fun runPipelineActivity(callback: (err: AWSError, data: RunPipelineActivityResponse) -> Unit = definedExternally): Request<RunPipelineActivityResponse, AWSError>
    open fun sampleChannelData(params: SampleChannelDataRequest, callback: (err: AWSError, data: SampleChannelDataResponse) -> Unit = definedExternally): Request<SampleChannelDataResponse, AWSError>
    open fun sampleChannelData(callback: (err: AWSError, data: SampleChannelDataResponse) -> Unit = definedExternally): Request<SampleChannelDataResponse, AWSError>
    open fun startPipelineReprocessing(params: StartPipelineReprocessingRequest, callback: (err: AWSError, data: StartPipelineReprocessingResponse) -> Unit = definedExternally): Request<StartPipelineReprocessingResponse, AWSError>
    open fun startPipelineReprocessing(callback: (err: AWSError, data: StartPipelineReprocessingResponse) -> Unit = definedExternally): Request<StartPipelineReprocessingResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateChannel(params: UpdateChannelRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateChannel(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDataset(params: UpdateDatasetRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDataset(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDatastore(params: UpdateDatastoreRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDatastore(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updatePipeline(params: UpdatePipelineRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updatePipeline(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface AddAttributesActivity {
        var name: ActivityName
        var attributes: AttributeNameMapping
        var next: ActivityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttributeNameMapping {
        @nativeGetter
        operator fun get(key: String): AttributeName?
        @nativeSetter
        operator fun set(key: String, value: AttributeName)
    }
    interface BatchPutMessageErrorEntry {
        var messageId: MessageId?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchPutMessageRequest {
        var channelName: ChannelName
        var messages: Messages
    }
    interface BatchPutMessageResponse {
        var batchPutMessageErrorEntries: BatchPutMessageErrorEntries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelPipelineReprocessingRequest {
        var pipelineName: PipelineName
        var reprocessingId: ReprocessingId
    }
    interface CancelPipelineReprocessingResponse
    interface Channel {
        var name: ChannelName?
            get() = definedExternally
            set(value) = definedExternally
        var storage: ChannelStorage?
            get() = definedExternally
            set(value) = definedExternally
        var arn: ChannelArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "ACTIVE" | "DELETING" | String */
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelActivity {
        var name: ActivityName
        var channelName: ChannelName
        var next: ActivityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelStatistics {
        var size: EstimatedResourceSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelStorage {
        var serviceManagedS3: ServiceManagedChannelS3Storage?
            get() = definedExternally
            set(value) = definedExternally
        var customerManagedS3: CustomerManagedChannelS3Storage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelStorageSummary {
        var serviceManagedS3: ServiceManagedChannelS3StorageSummary?
            get() = definedExternally
            set(value) = definedExternally
        var customerManagedS3: CustomerManagedChannelS3StorageSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChannelSummary {
        var channelName: ChannelName?
            get() = definedExternally
            set(value) = definedExternally
        var channelStorage: ChannelStorageSummary?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "ACTIVE" | "DELETING" | String */
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerDatasetAction {
        var image: Image
        var executionRoleArn: RoleArn
        var resourceConfiguration: ResourceConfiguration
        var variables: Variables?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateChannelRequest {
        var channelName: ChannelName
        var channelStorage: ChannelStorage?
            get() = definedExternally
            set(value) = definedExternally
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateChannelResponse {
        var channelName: ChannelName?
            get() = definedExternally
            set(value) = definedExternally
        var channelArn: ChannelArn?
            get() = definedExternally
            set(value) = definedExternally
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetContentRequest {
        var datasetName: DatasetName
    }
    interface CreateDatasetContentResponse {
        var versionId: DatasetContentVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetRequest {
        var datasetName: DatasetName
        var actions: DatasetActions
        var triggers: DatasetTriggers?
            get() = definedExternally
            set(value) = definedExternally
        var contentDeliveryRules: DatasetContentDeliveryRules?
            get() = definedExternally
            set(value) = definedExternally
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var versioningConfiguration: VersioningConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatasetResponse {
        var datasetName: DatasetName?
            get() = definedExternally
            set(value) = definedExternally
        var datasetArn: DatasetArn?
            get() = definedExternally
            set(value) = definedExternally
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatastoreRequest {
        var datastoreName: DatastoreName
        var datastoreStorage: DatastoreStorage?
            get() = definedExternally
            set(value) = definedExternally
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatastoreResponse {
        var datastoreName: DatastoreName?
            get() = definedExternally
            set(value) = definedExternally
        var datastoreArn: DatastoreArn?
            get() = definedExternally
            set(value) = definedExternally
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePipelineRequest {
        var pipelineName: PipelineName
        var pipelineActivities: PipelineActivities
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePipelineResponse {
        var pipelineName: PipelineName?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineArn: PipelineArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomerManagedChannelS3Storage {
        var bucket: BucketName
        var keyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn
    }
    interface CustomerManagedChannelS3StorageSummary {
        var bucket: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var keyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomerManagedDatastoreS3Storage {
        var bucket: BucketName
        var keyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn
    }
    interface CustomerManagedDatastoreS3StorageSummary {
        var bucket: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var keyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Dataset {
        var name: DatasetName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: DatasetArn?
            get() = definedExternally
            set(value) = definedExternally
        var actions: DatasetActions?
            get() = definedExternally
            set(value) = definedExternally
        var triggers: DatasetTriggers?
            get() = definedExternally
            set(value) = definedExternally
        var contentDeliveryRules: DatasetContentDeliveryRules?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "ACTIVE" | "DELETING" | String */
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var versioningConfiguration: VersioningConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetAction {
        var actionName: DatasetActionName?
            get() = definedExternally
            set(value) = definedExternally
        var queryAction: SqlQueryDatasetAction?
            get() = definedExternally
            set(value) = definedExternally
        var containerAction: ContainerDatasetAction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetActionSummary {
        var actionName: DatasetActionName?
            get() = definedExternally
            set(value) = definedExternally
        var actionType: String /* "QUERY" | "CONTAINER" | String */
    }
    interface DatasetContentDeliveryDestination {
        var iotEventsDestinationConfiguration: IotEventsDestinationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var s3DestinationConfiguration: S3DestinationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetContentDeliveryRule {
        var entryName: EntryName?
            get() = definedExternally
            set(value) = definedExternally
        var destination: DatasetContentDeliveryDestination
    }
    interface DatasetContentStatus {
        var state: String /* "CREATING" | "SUCCEEDED" | "FAILED" | String */
        var reason: Reason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetContentSummary {
        var version: DatasetContentVersion?
            get() = definedExternally
            set(value) = definedExternally
        var status: DatasetContentStatus?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var scheduleTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var completionTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetContentVersionValue {
        var datasetName: DatasetName
    }
    interface DatasetEntry {
        var entryName: EntryName?
            get() = definedExternally
            set(value) = definedExternally
        var dataURI: PresignedURI?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetSummary {
        var datasetName: DatasetName?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "ACTIVE" | "DELETING" | String */
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var triggers: DatasetTriggers?
            get() = definedExternally
            set(value) = definedExternally
        var actions: DatasetActionSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatasetTrigger {
        var schedule: Schedule?
            get() = definedExternally
            set(value) = definedExternally
        var dataset: TriggeringDataset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Datastore {
        var name: DatastoreName?
            get() = definedExternally
            set(value) = definedExternally
        var storage: DatastoreStorage?
            get() = definedExternally
            set(value) = definedExternally
        var arn: DatastoreArn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "ACTIVE" | "DELETING" | String */
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatastoreActivity {
        var name: ActivityName
        var datastoreName: DatastoreName
    }
    interface DatastoreStatistics {
        var size: EstimatedResourceSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatastoreStorage {
        var serviceManagedS3: ServiceManagedDatastoreS3Storage?
            get() = definedExternally
            set(value) = definedExternally
        var customerManagedS3: CustomerManagedDatastoreS3Storage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatastoreStorageSummary {
        var serviceManagedS3: ServiceManagedDatastoreS3StorageSummary?
            get() = definedExternally
            set(value) = definedExternally
        var customerManagedS3: CustomerManagedDatastoreS3StorageSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatastoreSummary {
        var datastoreName: DatastoreName?
            get() = definedExternally
            set(value) = definedExternally
        var datastoreStorage: DatastoreStorageSummary?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "ACTIVE" | "DELETING" | String */
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteChannelRequest {
        var channelName: ChannelName
    }
    interface DeleteDatasetContentRequest {
        var datasetName: DatasetName
        var versionId: DatasetContentVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDatasetRequest {
        var datasetName: DatasetName
    }
    interface DeleteDatastoreRequest {
        var datastoreName: DatastoreName
    }
    interface DeletePipelineRequest {
        var pipelineName: PipelineName
    }
    interface DeltaTime {
        var offsetSeconds: OffsetSeconds
        var timeExpression: TimeExpression
    }
    interface DescribeChannelRequest {
        var channelName: ChannelName
        var includeStatistics: IncludeStatisticsFlag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeChannelResponse {
        var channel: Channel?
            get() = definedExternally
            set(value) = definedExternally
        var statistics: ChannelStatistics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDatasetRequest {
        var datasetName: DatasetName
    }
    interface DescribeDatasetResponse {
        var dataset: Dataset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDatastoreRequest {
        var datastoreName: DatastoreName
        var includeStatistics: IncludeStatisticsFlag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDatastoreResponse {
        var datastore: Datastore?
            get() = definedExternally
            set(value) = definedExternally
        var statistics: DatastoreStatistics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLoggingOptionsRequest
    interface DescribeLoggingOptionsResponse {
        var loggingOptions: LoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePipelineRequest {
        var pipelineName: PipelineName
    }
    interface DescribePipelineResponse {
        var pipeline: Pipeline?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceRegistryEnrichActivity {
        var name: ActivityName
        var attribute: AttributeName
        var thingName: AttributeName
        var roleArn: RoleArn
        var next: ActivityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceShadowEnrichActivity {
        var name: ActivityName
        var attribute: AttributeName
        var thingName: AttributeName
        var roleArn: RoleArn
        var next: ActivityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EstimatedResourceSize {
        var estimatedSizeInBytes: SizeInBytes?
            get() = definedExternally
            set(value) = definedExternally
        var estimatedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FilterActivity {
        var name: ActivityName
        var filter: FilterExpression
        var next: ActivityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDatasetContentRequest {
        var datasetName: DatasetName
        var versionId: DatasetContentVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDatasetContentResponse {
        var entries: DatasetEntries?
            get() = definedExternally
            set(value) = definedExternally
        var timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var status: DatasetContentStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlueConfiguration {
        var tableName: GlueTableName
        var databaseName: GlueDatabaseName
    }
    interface IotEventsDestinationConfiguration {
        var inputName: IotEventsInputName
        var roleArn: RoleArn
    }
    interface LambdaActivity {
        var name: ActivityName
        var lambdaName: LambdaName
        var batchSize: ActivityBatchSize
        var next: ActivityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChannelsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChannelsResponse {
        var channelSummaries: ChannelSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetContentsRequest {
        var datasetName: DatasetName
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledOnOrAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetContentsResponse {
        var datasetContentSummaries: DatasetContentSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetsResponse {
        var datasetSummaries: DatasetSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatastoresRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatastoresResponse {
        var datastoreSummaries: DatastoreSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPipelinesRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPipelinesResponse {
        var pipelineSummaries: PipelineSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: ResourceArn
    }
    interface ListTagsForResourceResponse {
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoggingOptions {
        var roleArn: RoleArn
        var level: String /* "ERROR" | String */
        var enabled: LoggingEnabled
    }
    interface MathActivity {
        var name: ActivityName
        var attribute: AttributeName
        var math: MathExpression
        var next: ActivityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Message {
        var messageId: MessageId
        var payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputFileUriValue {
        var fileName: OutputFileName
    }
    interface Pipeline {
        var name: PipelineName?
            get() = definedExternally
            set(value) = definedExternally
        var arn: PipelineArn?
            get() = definedExternally
            set(value) = definedExternally
        var activities: PipelineActivities?
            get() = definedExternally
            set(value) = definedExternally
        var reprocessingSummaries: ReprocessingSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineActivity {
        var channel: ChannelActivity?
            get() = definedExternally
            set(value) = definedExternally
        var lambda: LambdaActivity?
            get() = definedExternally
            set(value) = definedExternally
        var datastore: DatastoreActivity?
            get() = definedExternally
            set(value) = definedExternally
        var addAttributes: AddAttributesActivity?
            get() = definedExternally
            set(value) = definedExternally
        var removeAttributes: RemoveAttributesActivity?
            get() = definedExternally
            set(value) = definedExternally
        var selectAttributes: SelectAttributesActivity?
            get() = definedExternally
            set(value) = definedExternally
        var filter: FilterActivity?
            get() = definedExternally
            set(value) = definedExternally
        var math: MathActivity?
            get() = definedExternally
            set(value) = definedExternally
        var deviceRegistryEnrich: DeviceRegistryEnrichActivity?
            get() = definedExternally
            set(value) = definedExternally
        var deviceShadowEnrich: DeviceShadowEnrichActivity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineSummary {
        var pipelineName: PipelineName?
            get() = definedExternally
            set(value) = definedExternally
        var reprocessingSummaries: ReprocessingSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutLoggingOptionsRequest {
        var loggingOptions: LoggingOptions
    }
    interface QueryFilter {
        var deltaTime: DeltaTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveAttributesActivity {
        var name: ActivityName
        var attributes: AttributeNames
        var next: ActivityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReprocessingSummary {
        var id: ReprocessingId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "RUNNING" | "SUCCEEDED" | "CANCELLED" | "FAILED" | String */
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceConfiguration {
        var computeType: String /* "ACU_1" | "ACU_2" | String */
        var volumeSizeInGB: VolumeSizeInGB
    }
    interface RetentionPeriod {
        var unlimited: UnlimitedRetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfDays: RetentionPeriodInDays?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RunPipelineActivityRequest {
        var pipelineActivity: PipelineActivity
        var payloads: MessagePayloads
    }
    interface RunPipelineActivityResponse {
        var payloads: MessagePayloads?
            get() = definedExternally
            set(value) = definedExternally
        var logResult: LogResult?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3DestinationConfiguration {
        var bucket: BucketName
        var key: BucketKeyExpression
        var glueConfiguration: GlueConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn
    }
    interface SampleChannelDataRequest {
        var channelName: ChannelName
        var maxMessages: MaxMessages?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: StartTime?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: EndTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SampleChannelDataResponse {
        var payloads: MessagePayloads?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Schedule {
        var expression: ScheduleExpression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SelectAttributesActivity {
        var name: ActivityName
        var attributes: AttributeNames
        var next: ActivityName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceManagedChannelS3Storage
    interface ServiceManagedChannelS3StorageSummary
    interface ServiceManagedDatastoreS3Storage
    interface ServiceManagedDatastoreS3StorageSummary
    interface SqlQueryDatasetAction {
        var sqlQuery: SqlQuery
        var filters: QueryFilters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartPipelineReprocessingRequest {
        var pipelineName: PipelineName
        var startTime: StartTime?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: EndTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartPipelineReprocessingResponse {
        var reprocessingId: ReprocessingId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey
        var value: TagValue
    }
    interface TagResourceRequest {
        var resourceArn: ResourceArn
        var tags: TagList
    }
    interface TagResourceResponse
    interface TriggeringDataset {
        var name: DatasetName
    }
    interface UntagResourceRequest {
        var resourceArn: ResourceArn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateChannelRequest {
        var channelName: ChannelName
        var channelStorage: ChannelStorage?
            get() = definedExternally
            set(value) = definedExternally
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDatasetRequest {
        var datasetName: DatasetName
        var actions: DatasetActions
        var triggers: DatasetTriggers?
            get() = definedExternally
            set(value) = definedExternally
        var contentDeliveryRules: DatasetContentDeliveryRules?
            get() = definedExternally
            set(value) = definedExternally
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var versioningConfiguration: VersioningConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDatastoreRequest {
        var datastoreName: DatastoreName
        var retentionPeriod: RetentionPeriod?
            get() = definedExternally
            set(value) = definedExternally
        var datastoreStorage: DatastoreStorage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePipelineRequest {
        var pipelineName: PipelineName
        var pipelineActivities: PipelineActivities
    }
    interface Variable {
        var name: VariableName
        var stringValue: StringValue?
            get() = definedExternally
            set(value) = definedExternally
        var doubleValue: DoubleValue?
            get() = definedExternally
            set(value) = definedExternally
        var datasetContentVersionValue: DatasetContentVersionValue?
            get() = definedExternally
            set(value) = definedExternally
        var outputFileUriValue: OutputFileUriValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VersioningConfiguration {
        var unlimited: UnlimitedVersioning?
            get() = definedExternally
            set(value) = definedExternally
        var maxVersions: MaxVersions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-11-27" | "latest" | String */
    }
}