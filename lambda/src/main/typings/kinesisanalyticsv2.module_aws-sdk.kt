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
import KinesisAnalyticsV2.ApplicationSummary
import KinesisAnalyticsV2.CloudWatchLoggingOptionDescription
import KinesisAnalyticsV2.CloudWatchLoggingOptionUpdate
import KinesisAnalyticsV2.CloudWatchLoggingOption
import KinesisAnalyticsV2.InputDescription
import KinesisAnalyticsV2.InputUpdate
import KinesisAnalyticsV2.Input
import KinesisAnalyticsV2.OutputDescription
import KinesisAnalyticsV2.OutputUpdate
import KinesisAnalyticsV2.Output
import KinesisAnalyticsV2.PropertyGroup
import KinesisAnalyticsV2.RecordColumn
import KinesisAnalyticsV2.ReferenceDataSourceDescription
import KinesisAnalyticsV2.ReferenceDataSourceUpdate
import KinesisAnalyticsV2.ReferenceDataSource
import KinesisAnalyticsV2.SnapshotDetails
import KinesisAnalyticsV2.SqlRunConfiguration
import KinesisAnalyticsV2.Tag
import KinesisAnalyticsV2.VpcConfigurationDescription
import KinesisAnalyticsV2.VpcConfigurationUpdate
import KinesisAnalyticsV2.VpcConfiguration
import KinesisAnalyticsV2.AddApplicationCloudWatchLoggingOptionRequest
import KinesisAnalyticsV2.AddApplicationCloudWatchLoggingOptionResponse
import KinesisAnalyticsV2.AddApplicationInputRequest
import KinesisAnalyticsV2.AddApplicationInputResponse
import KinesisAnalyticsV2.AddApplicationInputProcessingConfigurationRequest
import KinesisAnalyticsV2.AddApplicationInputProcessingConfigurationResponse
import KinesisAnalyticsV2.AddApplicationOutputRequest
import KinesisAnalyticsV2.AddApplicationOutputResponse
import KinesisAnalyticsV2.AddApplicationReferenceDataSourceRequest
import KinesisAnalyticsV2.AddApplicationReferenceDataSourceResponse
import KinesisAnalyticsV2.AddApplicationVpcConfigurationRequest
import KinesisAnalyticsV2.AddApplicationVpcConfigurationResponse
import KinesisAnalyticsV2.CreateApplicationRequest
import KinesisAnalyticsV2.CreateApplicationResponse
import KinesisAnalyticsV2.CreateApplicationSnapshotRequest
import KinesisAnalyticsV2.CreateApplicationSnapshotResponse
import KinesisAnalyticsV2.DeleteApplicationRequest
import KinesisAnalyticsV2.DeleteApplicationResponse
import KinesisAnalyticsV2.DeleteApplicationCloudWatchLoggingOptionRequest
import KinesisAnalyticsV2.DeleteApplicationCloudWatchLoggingOptionResponse
import KinesisAnalyticsV2.DeleteApplicationInputProcessingConfigurationRequest
import KinesisAnalyticsV2.DeleteApplicationInputProcessingConfigurationResponse
import KinesisAnalyticsV2.DeleteApplicationOutputRequest
import KinesisAnalyticsV2.DeleteApplicationOutputResponse
import KinesisAnalyticsV2.DeleteApplicationReferenceDataSourceRequest
import KinesisAnalyticsV2.DeleteApplicationReferenceDataSourceResponse
import KinesisAnalyticsV2.DeleteApplicationSnapshotRequest
import KinesisAnalyticsV2.DeleteApplicationSnapshotResponse
import KinesisAnalyticsV2.DeleteApplicationVpcConfigurationRequest
import KinesisAnalyticsV2.DeleteApplicationVpcConfigurationResponse
import KinesisAnalyticsV2.DescribeApplicationRequest
import KinesisAnalyticsV2.DescribeApplicationResponse
import KinesisAnalyticsV2.DescribeApplicationSnapshotRequest
import KinesisAnalyticsV2.DescribeApplicationSnapshotResponse
import KinesisAnalyticsV2.DiscoverInputSchemaRequest
import KinesisAnalyticsV2.DiscoverInputSchemaResponse
import KinesisAnalyticsV2.ListApplicationSnapshotsRequest
import KinesisAnalyticsV2.ListApplicationSnapshotsResponse
import KinesisAnalyticsV2.ListApplicationsRequest
import KinesisAnalyticsV2.ListApplicationsResponse
import KinesisAnalyticsV2.ListTagsForResourceRequest
import KinesisAnalyticsV2.ListTagsForResourceResponse
import KinesisAnalyticsV2.StartApplicationRequest
import KinesisAnalyticsV2.StartApplicationResponse
import KinesisAnalyticsV2.StopApplicationRequest
import KinesisAnalyticsV2.StopApplicationResponse
import KinesisAnalyticsV2.TagResourceRequest
import KinesisAnalyticsV2.TagResourceResponse
import KinesisAnalyticsV2.UntagResourceRequest
import KinesisAnalyticsV2.UntagResourceResponse
import KinesisAnalyticsV2.UpdateApplicationRequest
import KinesisAnalyticsV2.UpdateApplicationResponse
import KinesisAnalyticsV2.InputProcessingConfiguration
import KinesisAnalyticsV2.InputProcessingConfigurationDescription
import KinesisAnalyticsV2.CodeContent
import KinesisAnalyticsV2.CodeContentDescription
import KinesisAnalyticsV2.CodeContentUpdate
import KinesisAnalyticsV2.SqlApplicationConfiguration
import KinesisAnalyticsV2.FlinkApplicationConfiguration
import KinesisAnalyticsV2.EnvironmentProperties
import KinesisAnalyticsV2.ApplicationCodeConfiguration
import KinesisAnalyticsV2.ApplicationSnapshotConfiguration
import KinesisAnalyticsV2.SqlApplicationConfigurationDescription
import KinesisAnalyticsV2.ApplicationCodeConfigurationDescription
import KinesisAnalyticsV2.RunConfigurationDescription
import KinesisAnalyticsV2.FlinkApplicationConfigurationDescription
import KinesisAnalyticsV2.EnvironmentPropertyDescriptions
import KinesisAnalyticsV2.ApplicationSnapshotConfigurationDescription
import KinesisAnalyticsV2.SqlApplicationConfigurationUpdate
import KinesisAnalyticsV2.ApplicationCodeConfigurationUpdate
import KinesisAnalyticsV2.FlinkApplicationConfigurationUpdate
import KinesisAnalyticsV2.EnvironmentPropertyUpdates
import KinesisAnalyticsV2.ApplicationSnapshotConfigurationUpdate
import KinesisAnalyticsV2.ApplicationConfigurationDescription
import KinesisAnalyticsV2.S3ContentLocation
import KinesisAnalyticsV2.S3ApplicationCodeLocationDescription
import KinesisAnalyticsV2.S3ContentLocationUpdate
import KinesisAnalyticsV2.ApplicationConfiguration
import KinesisAnalyticsV2.ApplicationDetail
import KinesisAnalyticsV2.InputStartingPositionConfiguration
import KinesisAnalyticsV2.S3Configuration
import KinesisAnalyticsV2.SourceSchema
import KinesisAnalyticsV2.CheckpointConfiguration
import KinesisAnalyticsV2.MonitoringConfiguration
import KinesisAnalyticsV2.ParallelismConfiguration
import KinesisAnalyticsV2.CheckpointConfigurationDescription
import KinesisAnalyticsV2.MonitoringConfigurationDescription
import KinesisAnalyticsV2.ParallelismConfigurationDescription
import KinesisAnalyticsV2.CheckpointConfigurationUpdate
import KinesisAnalyticsV2.MonitoringConfigurationUpdate
import KinesisAnalyticsV2.ParallelismConfigurationUpdate
import KinesisAnalyticsV2.KinesisStreamsInput
import KinesisAnalyticsV2.KinesisFirehoseInput
import KinesisAnalyticsV2.InputParallelism
import KinesisAnalyticsV2.KinesisStreamsInputDescription
import KinesisAnalyticsV2.KinesisFirehoseInputDescription
import KinesisAnalyticsV2.InputLambdaProcessor
import KinesisAnalyticsV2.InputLambdaProcessorDescription
import KinesisAnalyticsV2.InputLambdaProcessorUpdate
import KinesisAnalyticsV2.RecordFormat
import KinesisAnalyticsV2.InputProcessingConfigurationUpdate
import KinesisAnalyticsV2.KinesisStreamsInputUpdate
import KinesisAnalyticsV2.KinesisFirehoseInputUpdate
import KinesisAnalyticsV2.InputSchemaUpdate
import KinesisAnalyticsV2.InputParallelismUpdate
import KinesisAnalyticsV2.JSONMappingParameters
import KinesisAnalyticsV2.CSVMappingParameters
import KinesisAnalyticsV2.KinesisStreamsOutput
import KinesisAnalyticsV2.KinesisFirehoseOutput
import KinesisAnalyticsV2.LambdaOutput
import KinesisAnalyticsV2.DestinationSchema
import KinesisAnalyticsV2.KinesisStreamsOutputDescription
import KinesisAnalyticsV2.KinesisFirehoseOutputDescription
import KinesisAnalyticsV2.LambdaOutputDescription
import KinesisAnalyticsV2.KinesisStreamsOutputUpdate
import KinesisAnalyticsV2.KinesisFirehoseOutputUpdate
import KinesisAnalyticsV2.LambdaOutputUpdate
import KinesisAnalyticsV2.PropertyMap
import KinesisAnalyticsV2.MappingParameters
import KinesisAnalyticsV2.S3ReferenceDataSource
import KinesisAnalyticsV2.S3ReferenceDataSourceDescription
import KinesisAnalyticsV2.S3ReferenceDataSourceUpdate
import KinesisAnalyticsV2.FlinkRunConfiguration
import KinesisAnalyticsV2.ApplicationRestoreConfiguration
import KinesisAnalyticsV2.RunConfiguration
import KinesisAnalyticsV2.ApplicationConfigurationUpdate
import KinesisAnalyticsV2.RunConfigurationUpdate

typealias ApplicationDescription = String

typealias ApplicationName = String

typealias ApplicationSummaries = Array<ApplicationSummary>

typealias ApplicationVersionId = Number

typealias BooleanObject = Boolean

typealias BucketARN = String

typealias CheckpointInterval = Number

typealias CloudWatchLoggingOptionDescriptions = Array<CloudWatchLoggingOptionDescription>

typealias CloudWatchLoggingOptionUpdates = Array<CloudWatchLoggingOptionUpdate>

typealias CloudWatchLoggingOptions = Array<CloudWatchLoggingOption>

typealias CodeMD5 = String

typealias CodeSize = Number

typealias FileKey = String

typealias Id = String

typealias InAppStreamName = String

typealias InAppStreamNames = Array<InAppStreamName>

typealias InAppTableName = String

typealias InputDescriptions = Array<InputDescription>

typealias InputParallelismCount = Number

typealias InputUpdates = Array<InputUpdate>

typealias Inputs = Array<Input>

typealias JobPlanDescription = String

typealias KinesisAnalyticsARN = String

typealias ListApplicationsInputLimit = Number

typealias ListSnapshotsInputLimit = Number

typealias LogStreamARN = String

typealias MinPauseBetweenCheckpoints = Number

typealias NextToken = String

typealias ObjectVersion = String

typealias OutputDescriptions = Array<OutputDescription>

typealias OutputUpdates = Array<OutputUpdate>

typealias Outputs = Array<Output>

typealias Parallelism = Number

typealias ParallelismPerKPU = Number

typealias ParsedInputRecord = Array<ParsedInputRecordField>

typealias ParsedInputRecordField = String

typealias ParsedInputRecords = Array<ParsedInputRecord>

typealias ProcessedInputRecord = String

typealias ProcessedInputRecords = Array<ProcessedInputRecord>

typealias PropertyGroups = Array<PropertyGroup>

typealias PropertyKey = String

typealias PropertyValue = String

typealias RawInputRecord = String

typealias RawInputRecords = Array<RawInputRecord>

typealias RecordColumnDelimiter = String

typealias RecordColumnMapping = String

typealias RecordColumnName = String

typealias RecordColumnSqlType = String

typealias RecordColumns = Array<RecordColumn>

typealias RecordEncoding = String

typealias RecordRowDelimiter = String

typealias RecordRowPath = String

typealias ReferenceDataSourceDescriptions = Array<ReferenceDataSourceDescription>

typealias ReferenceDataSourceUpdates = Array<ReferenceDataSourceUpdate>

typealias ReferenceDataSources = Array<ReferenceDataSource>

typealias ResourceARN = String

typealias RoleARN = String

typealias SecurityGroupId = String

typealias SecurityGroupIds = Array<SecurityGroupId>

typealias SnapshotName = String

typealias SnapshotSummaries = Array<SnapshotDetails>

typealias SqlRunConfigurations = Array<SqlRunConfiguration>

typealias SubnetId = String

typealias SubnetIds = Array<SubnetId>

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TextContent = String

typealias Timestamp = Date

typealias VpcConfigurationDescriptions = Array<VpcConfigurationDescription>

typealias VpcConfigurationUpdates = Array<VpcConfigurationUpdate>

typealias VpcConfigurations = Array<VpcConfiguration>

typealias VpcId = String

@JsModule("aws-sdk")
external open class KinesisAnalyticsV2(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & KinesisAnalyticsV2.Types.ClientConfiguration */
    open fun addApplicationCloudWatchLoggingOption(params: AddApplicationCloudWatchLoggingOptionRequest, callback: (err: AWSError, data: AddApplicationCloudWatchLoggingOptionResponse) -> Unit = definedExternally): Request<AddApplicationCloudWatchLoggingOptionResponse, AWSError>
    open fun addApplicationCloudWatchLoggingOption(callback: (err: AWSError, data: AddApplicationCloudWatchLoggingOptionResponse) -> Unit = definedExternally): Request<AddApplicationCloudWatchLoggingOptionResponse, AWSError>
    open fun addApplicationInput(params: AddApplicationInputRequest, callback: (err: AWSError, data: AddApplicationInputResponse) -> Unit = definedExternally): Request<AddApplicationInputResponse, AWSError>
    open fun addApplicationInput(callback: (err: AWSError, data: AddApplicationInputResponse) -> Unit = definedExternally): Request<AddApplicationInputResponse, AWSError>
    open fun addApplicationInputProcessingConfiguration(params: AddApplicationInputProcessingConfigurationRequest, callback: (err: AWSError, data: AddApplicationInputProcessingConfigurationResponse) -> Unit = definedExternally): Request<AddApplicationInputProcessingConfigurationResponse, AWSError>
    open fun addApplicationInputProcessingConfiguration(callback: (err: AWSError, data: AddApplicationInputProcessingConfigurationResponse) -> Unit = definedExternally): Request<AddApplicationInputProcessingConfigurationResponse, AWSError>
    open fun addApplicationOutput(params: AddApplicationOutputRequest, callback: (err: AWSError, data: AddApplicationOutputResponse) -> Unit = definedExternally): Request<AddApplicationOutputResponse, AWSError>
    open fun addApplicationOutput(callback: (err: AWSError, data: AddApplicationOutputResponse) -> Unit = definedExternally): Request<AddApplicationOutputResponse, AWSError>
    open fun addApplicationReferenceDataSource(params: AddApplicationReferenceDataSourceRequest, callback: (err: AWSError, data: AddApplicationReferenceDataSourceResponse) -> Unit = definedExternally): Request<AddApplicationReferenceDataSourceResponse, AWSError>
    open fun addApplicationReferenceDataSource(callback: (err: AWSError, data: AddApplicationReferenceDataSourceResponse) -> Unit = definedExternally): Request<AddApplicationReferenceDataSourceResponse, AWSError>
    open fun addApplicationVpcConfiguration(params: AddApplicationVpcConfigurationRequest, callback: (err: AWSError, data: AddApplicationVpcConfigurationResponse) -> Unit = definedExternally): Request<AddApplicationVpcConfigurationResponse, AWSError>
    open fun addApplicationVpcConfiguration(callback: (err: AWSError, data: AddApplicationVpcConfigurationResponse) -> Unit = definedExternally): Request<AddApplicationVpcConfigurationResponse, AWSError>
    open fun createApplication(params: CreateApplicationRequest, callback: (err: AWSError, data: CreateApplicationResponse) -> Unit = definedExternally): Request<CreateApplicationResponse, AWSError>
    open fun createApplication(callback: (err: AWSError, data: CreateApplicationResponse) -> Unit = definedExternally): Request<CreateApplicationResponse, AWSError>
    open fun createApplicationSnapshot(params: CreateApplicationSnapshotRequest, callback: (err: AWSError, data: CreateApplicationSnapshotResponse) -> Unit = definedExternally): Request<CreateApplicationSnapshotResponse, AWSError>
    open fun createApplicationSnapshot(callback: (err: AWSError, data: CreateApplicationSnapshotResponse) -> Unit = definedExternally): Request<CreateApplicationSnapshotResponse, AWSError>
    open fun deleteApplication(params: DeleteApplicationRequest, callback: (err: AWSError, data: DeleteApplicationResponse) -> Unit = definedExternally): Request<DeleteApplicationResponse, AWSError>
    open fun deleteApplication(callback: (err: AWSError, data: DeleteApplicationResponse) -> Unit = definedExternally): Request<DeleteApplicationResponse, AWSError>
    open fun deleteApplicationCloudWatchLoggingOption(params: DeleteApplicationCloudWatchLoggingOptionRequest, callback: (err: AWSError, data: DeleteApplicationCloudWatchLoggingOptionResponse) -> Unit = definedExternally): Request<DeleteApplicationCloudWatchLoggingOptionResponse, AWSError>
    open fun deleteApplicationCloudWatchLoggingOption(callback: (err: AWSError, data: DeleteApplicationCloudWatchLoggingOptionResponse) -> Unit = definedExternally): Request<DeleteApplicationCloudWatchLoggingOptionResponse, AWSError>
    open fun deleteApplicationInputProcessingConfiguration(params: DeleteApplicationInputProcessingConfigurationRequest, callback: (err: AWSError, data: DeleteApplicationInputProcessingConfigurationResponse) -> Unit = definedExternally): Request<DeleteApplicationInputProcessingConfigurationResponse, AWSError>
    open fun deleteApplicationInputProcessingConfiguration(callback: (err: AWSError, data: DeleteApplicationInputProcessingConfigurationResponse) -> Unit = definedExternally): Request<DeleteApplicationInputProcessingConfigurationResponse, AWSError>
    open fun deleteApplicationOutput(params: DeleteApplicationOutputRequest, callback: (err: AWSError, data: DeleteApplicationOutputResponse) -> Unit = definedExternally): Request<DeleteApplicationOutputResponse, AWSError>
    open fun deleteApplicationOutput(callback: (err: AWSError, data: DeleteApplicationOutputResponse) -> Unit = definedExternally): Request<DeleteApplicationOutputResponse, AWSError>
    open fun deleteApplicationReferenceDataSource(params: DeleteApplicationReferenceDataSourceRequest, callback: (err: AWSError, data: DeleteApplicationReferenceDataSourceResponse) -> Unit = definedExternally): Request<DeleteApplicationReferenceDataSourceResponse, AWSError>
    open fun deleteApplicationReferenceDataSource(callback: (err: AWSError, data: DeleteApplicationReferenceDataSourceResponse) -> Unit = definedExternally): Request<DeleteApplicationReferenceDataSourceResponse, AWSError>
    open fun deleteApplicationSnapshot(params: DeleteApplicationSnapshotRequest, callback: (err: AWSError, data: DeleteApplicationSnapshotResponse) -> Unit = definedExternally): Request<DeleteApplicationSnapshotResponse, AWSError>
    open fun deleteApplicationSnapshot(callback: (err: AWSError, data: DeleteApplicationSnapshotResponse) -> Unit = definedExternally): Request<DeleteApplicationSnapshotResponse, AWSError>
    open fun deleteApplicationVpcConfiguration(params: DeleteApplicationVpcConfigurationRequest, callback: (err: AWSError, data: DeleteApplicationVpcConfigurationResponse) -> Unit = definedExternally): Request<DeleteApplicationVpcConfigurationResponse, AWSError>
    open fun deleteApplicationVpcConfiguration(callback: (err: AWSError, data: DeleteApplicationVpcConfigurationResponse) -> Unit = definedExternally): Request<DeleteApplicationVpcConfigurationResponse, AWSError>
    open fun describeApplication(params: DescribeApplicationRequest, callback: (err: AWSError, data: DescribeApplicationResponse) -> Unit = definedExternally): Request<DescribeApplicationResponse, AWSError>
    open fun describeApplication(callback: (err: AWSError, data: DescribeApplicationResponse) -> Unit = definedExternally): Request<DescribeApplicationResponse, AWSError>
    open fun describeApplicationSnapshot(params: DescribeApplicationSnapshotRequest, callback: (err: AWSError, data: DescribeApplicationSnapshotResponse) -> Unit = definedExternally): Request<DescribeApplicationSnapshotResponse, AWSError>
    open fun describeApplicationSnapshot(callback: (err: AWSError, data: DescribeApplicationSnapshotResponse) -> Unit = definedExternally): Request<DescribeApplicationSnapshotResponse, AWSError>
    open fun discoverInputSchema(params: DiscoverInputSchemaRequest, callback: (err: AWSError, data: DiscoverInputSchemaResponse) -> Unit = definedExternally): Request<DiscoverInputSchemaResponse, AWSError>
    open fun discoverInputSchema(callback: (err: AWSError, data: DiscoverInputSchemaResponse) -> Unit = definedExternally): Request<DiscoverInputSchemaResponse, AWSError>
    open fun listApplicationSnapshots(params: ListApplicationSnapshotsRequest, callback: (err: AWSError, data: ListApplicationSnapshotsResponse) -> Unit = definedExternally): Request<ListApplicationSnapshotsResponse, AWSError>
    open fun listApplicationSnapshots(callback: (err: AWSError, data: ListApplicationSnapshotsResponse) -> Unit = definedExternally): Request<ListApplicationSnapshotsResponse, AWSError>
    open fun listApplications(params: ListApplicationsRequest, callback: (err: AWSError, data: ListApplicationsResponse) -> Unit = definedExternally): Request<ListApplicationsResponse, AWSError>
    open fun listApplications(callback: (err: AWSError, data: ListApplicationsResponse) -> Unit = definedExternally): Request<ListApplicationsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun startApplication(params: StartApplicationRequest, callback: (err: AWSError, data: StartApplicationResponse) -> Unit = definedExternally): Request<StartApplicationResponse, AWSError>
    open fun startApplication(callback: (err: AWSError, data: StartApplicationResponse) -> Unit = definedExternally): Request<StartApplicationResponse, AWSError>
    open fun stopApplication(params: StopApplicationRequest, callback: (err: AWSError, data: StopApplicationResponse) -> Unit = definedExternally): Request<StopApplicationResponse, AWSError>
    open fun stopApplication(callback: (err: AWSError, data: StopApplicationResponse) -> Unit = definedExternally): Request<StopApplicationResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateApplication(params: UpdateApplicationRequest, callback: (err: AWSError, data: UpdateApplicationResponse) -> Unit = definedExternally): Request<UpdateApplicationResponse, AWSError>
    open fun updateApplication(callback: (err: AWSError, data: UpdateApplicationResponse) -> Unit = definedExternally): Request<UpdateApplicationResponse, AWSError>
    interface AddApplicationCloudWatchLoggingOptionRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var CloudWatchLoggingOption: CloudWatchLoggingOption
    }
    interface AddApplicationCloudWatchLoggingOptionResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptionDescriptions: CloudWatchLoggingOptionDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddApplicationInputProcessingConfigurationRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var InputId: Id
        var InputProcessingConfiguration: InputProcessingConfiguration
    }
    interface AddApplicationInputProcessingConfigurationResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var InputId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var InputProcessingConfigurationDescription: InputProcessingConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddApplicationInputRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var Input: Input
    }
    interface AddApplicationInputResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var InputDescriptions: InputDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddApplicationOutputRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var Output: Output
    }
    interface AddApplicationOutputResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDescriptions: OutputDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddApplicationReferenceDataSourceRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var ReferenceDataSource: ReferenceDataSource
    }
    interface AddApplicationReferenceDataSourceResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var ReferenceDataSourceDescriptions: ReferenceDataSourceDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddApplicationVpcConfigurationRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var VpcConfiguration: VpcConfiguration
    }
    interface AddApplicationVpcConfigurationResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfigurationDescription: VpcConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationCodeConfiguration {
        var CodeContent: CodeContent?
            get() = definedExternally
            set(value) = definedExternally
        var CodeContentType: String /* "PLAINTEXT" | "ZIPFILE" | String */
    }
    interface ApplicationCodeConfigurationDescription {
        var CodeContentType: String /* "PLAINTEXT" | "ZIPFILE" | String */
        var CodeContentDescription: CodeContentDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationCodeConfigurationUpdate {
        var CodeContentTypeUpdate: String /* "PLAINTEXT" | "ZIPFILE" | String */
        var CodeContentUpdate: CodeContentUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationConfiguration {
        var SqlApplicationConfiguration: SqlApplicationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var FlinkApplicationConfiguration: FlinkApplicationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentProperties: EnvironmentProperties?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationCodeConfiguration: ApplicationCodeConfiguration
        var ApplicationSnapshotConfiguration: ApplicationSnapshotConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfigurations: VpcConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationConfigurationDescription {
        var SqlApplicationConfigurationDescription: SqlApplicationConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationCodeConfigurationDescription: ApplicationCodeConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var RunConfigurationDescription: RunConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var FlinkApplicationConfigurationDescription: FlinkApplicationConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentPropertyDescriptions: EnvironmentPropertyDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationSnapshotConfigurationDescription: ApplicationSnapshotConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfigurationDescriptions: VpcConfigurationDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationConfigurationUpdate {
        var SqlApplicationConfigurationUpdate: SqlApplicationConfigurationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationCodeConfigurationUpdate: ApplicationCodeConfigurationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var FlinkApplicationConfigurationUpdate: FlinkApplicationConfigurationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var EnvironmentPropertyUpdates: EnvironmentPropertyUpdates?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationSnapshotConfigurationUpdate: ApplicationSnapshotConfigurationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfigurationUpdates: VpcConfigurationUpdates?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationDetail {
        var ApplicationARN: ResourceARN
        var ApplicationDescription: ApplicationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationName: ApplicationName
        var RuntimeEnvironment: String /* "SQL-1_0" | "FLINK-1_6" | "FLINK-1_8" | String */
        var ServiceExecutionRole: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationStatus: String /* "DELETING" | "STARTING" | "STOPPING" | "READY" | "RUNNING" | "UPDATING" | String */
        var ApplicationVersionId: ApplicationVersionId
        var CreateTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationConfigurationDescription: ApplicationConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptionDescriptions: CloudWatchLoggingOptionDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationRestoreConfiguration {
        var ApplicationRestoreType: String /* "SKIP_RESTORE_FROM_SNAPSHOT" | "RESTORE_FROM_LATEST_SNAPSHOT" | "RESTORE_FROM_CUSTOM_SNAPSHOT" | String */
        var SnapshotName: SnapshotName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApplicationSnapshotConfiguration {
        var SnapshotsEnabled: BooleanObject
    }
    interface ApplicationSnapshotConfigurationDescription {
        var SnapshotsEnabled: BooleanObject
    }
    interface ApplicationSnapshotConfigurationUpdate {
        var SnapshotsEnabledUpdate: BooleanObject
    }
    interface ApplicationSummary {
        var ApplicationName: ApplicationName
        var ApplicationARN: ResourceARN
        var ApplicationStatus: String /* "DELETING" | "STARTING" | "STOPPING" | "READY" | "RUNNING" | "UPDATING" | String */
        var ApplicationVersionId: ApplicationVersionId
        var RuntimeEnvironment: String /* "SQL-1_0" | "FLINK-1_6" | "FLINK-1_8" | String */
    }
    interface CSVMappingParameters {
        var RecordRowDelimiter: RecordRowDelimiter
        var RecordColumnDelimiter: RecordColumnDelimiter
    }
    interface CheckpointConfiguration {
        var ConfigurationType: String /* "DEFAULT" | "CUSTOM" | String */
        var CheckpointingEnabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var CheckpointInterval: CheckpointInterval?
            get() = definedExternally
            set(value) = definedExternally
        var MinPauseBetweenCheckpoints: MinPauseBetweenCheckpoints?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CheckpointConfigurationDescription {
        var ConfigurationType: String /* "DEFAULT" | "CUSTOM" | String */
        var CheckpointingEnabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var CheckpointInterval: CheckpointInterval?
            get() = definedExternally
            set(value) = definedExternally
        var MinPauseBetweenCheckpoints: MinPauseBetweenCheckpoints?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CheckpointConfigurationUpdate {
        var ConfigurationTypeUpdate: String /* "DEFAULT" | "CUSTOM" | String */
        var CheckpointingEnabledUpdate: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var CheckpointIntervalUpdate: CheckpointInterval?
            get() = definedExternally
            set(value) = definedExternally
        var MinPauseBetweenCheckpointsUpdate: MinPauseBetweenCheckpoints?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchLoggingOption {
        var LogStreamARN: LogStreamARN
    }
    interface CloudWatchLoggingOptionDescription {
        var CloudWatchLoggingOptionId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var LogStreamARN: LogStreamARN
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchLoggingOptionUpdate {
        var CloudWatchLoggingOptionId: Id
        var LogStreamARNUpdate: LogStreamARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeContent {
        var TextContent: TextContent?
            get() = definedExternally
            set(value) = definedExternally
        var ZipFileContent: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var S3ContentLocation: S3ContentLocation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeContentDescription {
        var TextContent: TextContent?
            get() = definedExternally
            set(value) = definedExternally
        var CodeMD5: CodeMD5?
            get() = definedExternally
            set(value) = definedExternally
        var CodeSize: CodeSize?
            get() = definedExternally
            set(value) = definedExternally
        var S3ApplicationCodeLocationDescription: S3ApplicationCodeLocationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeContentUpdate {
        var TextContentUpdate: TextContent?
            get() = definedExternally
            set(value) = definedExternally
        var ZipFileContentUpdate: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var S3ContentLocationUpdate: S3ContentLocationUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationRequest {
        var ApplicationName: ApplicationName
        var ApplicationDescription: ApplicationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var RuntimeEnvironment: String /* "SQL-1_0" | "FLINK-1_6" | "FLINK-1_8" | String */
        var ServiceExecutionRole: RoleARN
        var ApplicationConfiguration: ApplicationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationResponse {
        var ApplicationDetail: ApplicationDetail
    }
    interface CreateApplicationSnapshotRequest {
        var ApplicationName: ApplicationName
        var SnapshotName: SnapshotName
    }
    interface CreateApplicationSnapshotResponse
    interface DeleteApplicationCloudWatchLoggingOptionRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var CloudWatchLoggingOptionId: Id
    }
    interface DeleteApplicationCloudWatchLoggingOptionResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptionDescriptions: CloudWatchLoggingOptionDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApplicationInputProcessingConfigurationRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var InputId: Id
    }
    interface DeleteApplicationInputProcessingConfigurationResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApplicationOutputRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var OutputId: Id
    }
    interface DeleteApplicationOutputResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApplicationReferenceDataSourceRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var ReferenceId: Id
    }
    interface DeleteApplicationReferenceDataSourceResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteApplicationRequest {
        var ApplicationName: ApplicationName
        var CreateTimestamp: Timestamp
    }
    interface DeleteApplicationResponse
    interface DeleteApplicationSnapshotRequest {
        var ApplicationName: ApplicationName
        var SnapshotName: SnapshotName
        var SnapshotCreationTimestamp: Timestamp
    }
    interface DeleteApplicationSnapshotResponse
    interface DeleteApplicationVpcConfigurationRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var VpcConfigurationId: Id
    }
    interface DeleteApplicationVpcConfigurationResponse {
        var ApplicationARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeApplicationRequest {
        var ApplicationName: ApplicationName
        var IncludeAdditionalDetails: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeApplicationResponse {
        var ApplicationDetail: ApplicationDetail
    }
    interface DescribeApplicationSnapshotRequest {
        var ApplicationName: ApplicationName
        var SnapshotName: SnapshotName
    }
    interface DescribeApplicationSnapshotResponse {
        var SnapshotDetails: SnapshotDetails
    }
    interface DestinationSchema {
        var RecordFormatType: String /* "JSON" | "CSV" | String */
    }
    interface DiscoverInputSchemaRequest {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceExecutionRole: RoleARN
        var InputStartingPositionConfiguration: InputStartingPositionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var S3Configuration: S3Configuration?
            get() = definedExternally
            set(value) = definedExternally
        var InputProcessingConfiguration: InputProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DiscoverInputSchemaResponse {
        var InputSchema: SourceSchema?
            get() = definedExternally
            set(value) = definedExternally
        var ParsedInputRecords: ParsedInputRecords?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessedInputRecords: ProcessedInputRecords?
            get() = definedExternally
            set(value) = definedExternally
        var RawInputRecords: RawInputRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentProperties {
        var PropertyGroups: PropertyGroups
    }
    interface EnvironmentPropertyDescriptions {
        var PropertyGroupDescriptions: PropertyGroups?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentPropertyUpdates {
        var PropertyGroups: PropertyGroups
    }
    interface FlinkApplicationConfiguration {
        var CheckpointConfiguration: CheckpointConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringConfiguration: MonitoringConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var ParallelismConfiguration: ParallelismConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FlinkApplicationConfigurationDescription {
        var CheckpointConfigurationDescription: CheckpointConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringConfigurationDescription: MonitoringConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ParallelismConfigurationDescription: ParallelismConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var JobPlanDescription: JobPlanDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FlinkApplicationConfigurationUpdate {
        var CheckpointConfigurationUpdate: CheckpointConfigurationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringConfigurationUpdate: MonitoringConfigurationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ParallelismConfigurationUpdate: ParallelismConfigurationUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FlinkRunConfiguration {
        var AllowNonRestoredState: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Input {
        var NamePrefix: InAppStreamName
        var InputProcessingConfiguration: InputProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisStreamsInput: KinesisStreamsInput?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisFirehoseInput: KinesisFirehoseInput?
            get() = definedExternally
            set(value) = definedExternally
        var InputParallelism: InputParallelism?
            get() = definedExternally
            set(value) = definedExternally
        var InputSchema: SourceSchema
    }
    interface InputDescription {
        var InputId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var NamePrefix: InAppStreamName?
            get() = definedExternally
            set(value) = definedExternally
        var InAppStreamNames: InAppStreamNames?
            get() = definedExternally
            set(value) = definedExternally
        var InputProcessingConfigurationDescription: InputProcessingConfigurationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisStreamsInputDescription: KinesisStreamsInputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisFirehoseInputDescription: KinesisFirehoseInputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var InputSchema: SourceSchema?
            get() = definedExternally
            set(value) = definedExternally
        var InputParallelism: InputParallelism?
            get() = definedExternally
            set(value) = definedExternally
        var InputStartingPositionConfiguration: InputStartingPositionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputLambdaProcessor {
        var ResourceARN: ResourceARN
    }
    interface InputLambdaProcessorDescription {
        var ResourceARN: ResourceARN
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputLambdaProcessorUpdate {
        var ResourceARNUpdate: ResourceARN
    }
    interface InputParallelism {
        var Count: InputParallelismCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputParallelismUpdate {
        var CountUpdate: InputParallelismCount
    }
    interface InputProcessingConfiguration {
        var InputLambdaProcessor: InputLambdaProcessor
    }
    interface InputProcessingConfigurationDescription {
        var InputLambdaProcessorDescription: InputLambdaProcessorDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputProcessingConfigurationUpdate {
        var InputLambdaProcessorUpdate: InputLambdaProcessorUpdate
    }
    interface InputSchemaUpdate {
        var RecordFormatUpdate: RecordFormat?
            get() = definedExternally
            set(value) = definedExternally
        var RecordEncodingUpdate: RecordEncoding?
            get() = definedExternally
            set(value) = definedExternally
        var RecordColumnUpdates: RecordColumns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputStartingPositionConfiguration {
        var InputStartingPosition: String /* "NOW" | "TRIM_HORIZON" | "LAST_STOPPED_POINT" | String */
    }
    interface InputUpdate {
        var InputId: Id
        var NamePrefixUpdate: InAppStreamName?
            get() = definedExternally
            set(value) = definedExternally
        var InputProcessingConfigurationUpdate: InputProcessingConfigurationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisStreamsInputUpdate: KinesisStreamsInputUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisFirehoseInputUpdate: KinesisFirehoseInputUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var InputSchemaUpdate: InputSchemaUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var InputParallelismUpdate: InputParallelismUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JSONMappingParameters {
        var RecordRowPath: RecordRowPath
    }
    interface KinesisFirehoseInput {
        var ResourceARN: ResourceARN
    }
    interface KinesisFirehoseInputDescription {
        var ResourceARN: ResourceARN
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisFirehoseInputUpdate {
        var ResourceARNUpdate: ResourceARN
    }
    interface KinesisFirehoseOutput {
        var ResourceARN: ResourceARN
    }
    interface KinesisFirehoseOutputDescription {
        var ResourceARN: ResourceARN
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisFirehoseOutputUpdate {
        var ResourceARNUpdate: ResourceARN
    }
    interface KinesisStreamsInput {
        var ResourceARN: ResourceARN
    }
    interface KinesisStreamsInputDescription {
        var ResourceARN: ResourceARN
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisStreamsInputUpdate {
        var ResourceARNUpdate: ResourceARN
    }
    interface KinesisStreamsOutput {
        var ResourceARN: ResourceARN
    }
    interface KinesisStreamsOutputDescription {
        var ResourceARN: ResourceARN
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisStreamsOutputUpdate {
        var ResourceARNUpdate: ResourceARN
    }
    interface LambdaOutput {
        var ResourceARN: ResourceARN
    }
    interface LambdaOutputDescription {
        var ResourceARN: ResourceARN
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaOutputUpdate {
        var ResourceARNUpdate: ResourceARN
    }
    interface ListApplicationSnapshotsRequest {
        var ApplicationName: ApplicationName
        var Limit: ListSnapshotsInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApplicationSnapshotsResponse {
        var SnapshotSummaries: SnapshotSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApplicationsRequest {
        var Limit: ListApplicationsInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApplicationsResponse {
        var ApplicationSummaries: ApplicationSummaries
        var NextToken: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceARN: KinesisAnalyticsARN
    }
    interface ListTagsForResourceResponse {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MappingParameters {
        var JSONMappingParameters: JSONMappingParameters?
            get() = definedExternally
            set(value) = definedExternally
        var CSVMappingParameters: CSVMappingParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MonitoringConfiguration {
        var ConfigurationType: String /* "DEFAULT" | "CUSTOM" | String */
        var MetricsLevel: String /* "APPLICATION" | "TASK" | "OPERATOR" | "PARALLELISM" | String */
        var LogLevel: String /* "INFO" | "WARN" | "ERROR" | "DEBUG" | String */
    }
    interface MonitoringConfigurationDescription {
        var ConfigurationType: String /* "DEFAULT" | "CUSTOM" | String */
        var MetricsLevel: String /* "APPLICATION" | "TASK" | "OPERATOR" | "PARALLELISM" | String */
        var LogLevel: String /* "INFO" | "WARN" | "ERROR" | "DEBUG" | String */
    }
    interface MonitoringConfigurationUpdate {
        var ConfigurationTypeUpdate: String /* "DEFAULT" | "CUSTOM" | String */
        var MetricsLevelUpdate: String /* "APPLICATION" | "TASK" | "OPERATOR" | "PARALLELISM" | String */
        var LogLevelUpdate: String /* "INFO" | "WARN" | "ERROR" | "DEBUG" | String */
    }
    interface Output {
        var Name: InAppStreamName
        var KinesisStreamsOutput: KinesisStreamsOutput?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisFirehoseOutput: KinesisFirehoseOutput?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaOutput: LambdaOutput?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationSchema: DestinationSchema
    }
    interface OutputDescription {
        var OutputId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: InAppStreamName?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisStreamsOutputDescription: KinesisStreamsOutputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisFirehoseOutputDescription: KinesisFirehoseOutputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaOutputDescription: LambdaOutputDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationSchema: DestinationSchema?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputUpdate {
        var OutputId: Id
        var NameUpdate: InAppStreamName?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisStreamsOutputUpdate: KinesisStreamsOutputUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var KinesisFirehoseOutputUpdate: KinesisFirehoseOutputUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaOutputUpdate: LambdaOutputUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationSchemaUpdate: DestinationSchema?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParallelismConfiguration {
        var ConfigurationType: String /* "DEFAULT" | "CUSTOM" | String */
        var Parallelism: Parallelism?
            get() = definedExternally
            set(value) = definedExternally
        var ParallelismPerKPU: ParallelismPerKPU?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingEnabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParallelismConfigurationDescription {
        var ConfigurationType: String /* "DEFAULT" | "CUSTOM" | String */
        var Parallelism: Parallelism?
            get() = definedExternally
            set(value) = definedExternally
        var ParallelismPerKPU: ParallelismPerKPU?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentParallelism: Parallelism?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingEnabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParallelismConfigurationUpdate {
        var ConfigurationTypeUpdate: String /* "DEFAULT" | "CUSTOM" | String */
        var ParallelismUpdate: Parallelism?
            get() = definedExternally
            set(value) = definedExternally
        var ParallelismPerKPUUpdate: ParallelismPerKPU?
            get() = definedExternally
            set(value) = definedExternally
        var AutoScalingEnabledUpdate: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PropertyGroup {
        var PropertyGroupId: Id
        var PropertyMap: PropertyMap
    }
    interface PropertyMap {
        @nativeGetter
        operator fun get(key: String): PropertyValue?
        @nativeSetter
        operator fun set(key: String, value: PropertyValue)
    }
    interface RecordColumn {
        var Name: RecordColumnName
        var Mapping: RecordColumnMapping?
            get() = definedExternally
            set(value) = definedExternally
        var SqlType: RecordColumnSqlType
    }
    interface RecordFormat {
        var RecordFormatType: String /* "JSON" | "CSV" | String */
        var MappingParameters: MappingParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReferenceDataSource {
        var TableName: InAppTableName
        var S3ReferenceDataSource: S3ReferenceDataSource?
            get() = definedExternally
            set(value) = definedExternally
        var ReferenceSchema: SourceSchema
    }
    interface ReferenceDataSourceDescription {
        var ReferenceId: Id
        var TableName: InAppTableName
        var S3ReferenceDataSourceDescription: S3ReferenceDataSourceDescription
        var ReferenceSchema: SourceSchema?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReferenceDataSourceUpdate {
        var ReferenceId: Id
        var TableNameUpdate: InAppTableName?
            get() = definedExternally
            set(value) = definedExternally
        var S3ReferenceDataSourceUpdate: S3ReferenceDataSourceUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ReferenceSchemaUpdate: SourceSchema?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RunConfiguration {
        var FlinkRunConfiguration: FlinkRunConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var SqlRunConfigurations: SqlRunConfigurations?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationRestoreConfiguration: ApplicationRestoreConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RunConfigurationDescription {
        var ApplicationRestoreConfigurationDescription: ApplicationRestoreConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RunConfigurationUpdate {
        var FlinkRunConfiguration: FlinkRunConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationRestoreConfiguration: ApplicationRestoreConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3ApplicationCodeLocationDescription {
        var BucketARN: BucketARN
        var FileKey: FileKey
        var ObjectVersion: ObjectVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Configuration {
        var BucketARN: BucketARN
        var FileKey: FileKey
    }
    interface S3ContentLocation {
        var BucketARN: BucketARN
        var FileKey: FileKey
        var ObjectVersion: ObjectVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3ContentLocationUpdate {
        var BucketARNUpdate: BucketARN?
            get() = definedExternally
            set(value) = definedExternally
        var FileKeyUpdate: FileKey?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectVersionUpdate: ObjectVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3ReferenceDataSource {
        var BucketARN: BucketARN?
            get() = definedExternally
            set(value) = definedExternally
        var FileKey: FileKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3ReferenceDataSourceDescription {
        var BucketARN: BucketARN
        var FileKey: FileKey
        var ReferenceRoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3ReferenceDataSourceUpdate {
        var BucketARNUpdate: BucketARN?
            get() = definedExternally
            set(value) = definedExternally
        var FileKeyUpdate: FileKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SnapshotDetails {
        var SnapshotName: SnapshotName
        var SnapshotStatus: String /* "CREATING" | "READY" | "DELETING" | "FAILED" | String */
        var ApplicationVersionId: ApplicationVersionId
        var SnapshotCreationTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceSchema {
        var RecordFormat: RecordFormat
        var RecordEncoding: RecordEncoding?
            get() = definedExternally
            set(value) = definedExternally
        var RecordColumns: RecordColumns
    }
    interface SqlApplicationConfiguration {
        var Inputs: Inputs?
            get() = definedExternally
            set(value) = definedExternally
        var Outputs: Outputs?
            get() = definedExternally
            set(value) = definedExternally
        var ReferenceDataSources: ReferenceDataSources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SqlApplicationConfigurationDescription {
        var InputDescriptions: InputDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDescriptions: OutputDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var ReferenceDataSourceDescriptions: ReferenceDataSourceDescriptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SqlApplicationConfigurationUpdate {
        var InputUpdates: InputUpdates?
            get() = definedExternally
            set(value) = definedExternally
        var OutputUpdates: OutputUpdates?
            get() = definedExternally
            set(value) = definedExternally
        var ReferenceDataSourceUpdates: ReferenceDataSourceUpdates?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SqlRunConfiguration {
        var InputId: Id
        var InputStartingPositionConfiguration: InputStartingPositionConfiguration
    }
    interface StartApplicationRequest {
        var ApplicationName: ApplicationName
        var RunConfiguration: RunConfiguration
    }
    interface StartApplicationResponse
    interface StopApplicationRequest {
        var ApplicationName: ApplicationName
    }
    interface StopApplicationResponse
    interface Tag {
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceARN: KinesisAnalyticsARN
        var Tags: Tags
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var ResourceARN: KinesisAnalyticsARN
        var TagKeys: TagKeys
    }
    interface UntagResourceResponse
    interface UpdateApplicationRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var ApplicationConfigurationUpdate: ApplicationConfigurationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceExecutionRoleUpdate: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var RunConfigurationUpdate: RunConfigurationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptionUpdates: CloudWatchLoggingOptionUpdates?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApplicationResponse {
        var ApplicationDetail: ApplicationDetail
    }
    interface VpcConfiguration {
        var SubnetIds: SubnetIds
        var SecurityGroupIds: SecurityGroupIds
    }
    interface VpcConfigurationDescription {
        var VpcConfigurationId: Id
        var VpcId: VpcId
        var SubnetIds: SubnetIds
        var SecurityGroupIds: SecurityGroupIds
    }
    interface VpcConfigurationUpdate {
        var VpcConfigurationId: Id
        var SubnetIdUpdates: SubnetIds?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIdUpdates: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-05-23" | "latest" | String */
    }
}