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
import KinesisAnalytics.ApplicationSummary
import KinesisAnalytics.CloudWatchLoggingOptionDescription
import KinesisAnalytics.CloudWatchLoggingOptionUpdate
import KinesisAnalytics.CloudWatchLoggingOption
import KinesisAnalytics.InputConfiguration
import KinesisAnalytics.InputDescription
import KinesisAnalytics.InputUpdate
import KinesisAnalytics.Input
import KinesisAnalytics.OutputDescription
import KinesisAnalytics.OutputUpdate
import KinesisAnalytics.Output
import KinesisAnalytics.RecordColumn
import KinesisAnalytics.ReferenceDataSourceDescription
import KinesisAnalytics.ReferenceDataSourceUpdate
import KinesisAnalytics.Tag
import KinesisAnalytics.AddApplicationCloudWatchLoggingOptionRequest
import KinesisAnalytics.AddApplicationCloudWatchLoggingOptionResponse
import KinesisAnalytics.AddApplicationInputRequest
import KinesisAnalytics.AddApplicationInputResponse
import KinesisAnalytics.AddApplicationInputProcessingConfigurationRequest
import KinesisAnalytics.AddApplicationInputProcessingConfigurationResponse
import KinesisAnalytics.AddApplicationOutputRequest
import KinesisAnalytics.AddApplicationOutputResponse
import KinesisAnalytics.AddApplicationReferenceDataSourceRequest
import KinesisAnalytics.AddApplicationReferenceDataSourceResponse
import KinesisAnalytics.CreateApplicationRequest
import KinesisAnalytics.CreateApplicationResponse
import KinesisAnalytics.DeleteApplicationRequest
import KinesisAnalytics.DeleteApplicationResponse
import KinesisAnalytics.DeleteApplicationCloudWatchLoggingOptionRequest
import KinesisAnalytics.DeleteApplicationCloudWatchLoggingOptionResponse
import KinesisAnalytics.DeleteApplicationInputProcessingConfigurationRequest
import KinesisAnalytics.DeleteApplicationInputProcessingConfigurationResponse
import KinesisAnalytics.DeleteApplicationOutputRequest
import KinesisAnalytics.DeleteApplicationOutputResponse
import KinesisAnalytics.DeleteApplicationReferenceDataSourceRequest
import KinesisAnalytics.DeleteApplicationReferenceDataSourceResponse
import KinesisAnalytics.DescribeApplicationRequest
import KinesisAnalytics.DescribeApplicationResponse
import KinesisAnalytics.DiscoverInputSchemaRequest
import KinesisAnalytics.DiscoverInputSchemaResponse
import KinesisAnalytics.ListApplicationsRequest
import KinesisAnalytics.ListApplicationsResponse
import KinesisAnalytics.ListTagsForResourceRequest
import KinesisAnalytics.ListTagsForResourceResponse
import KinesisAnalytics.StartApplicationRequest
import KinesisAnalytics.StartApplicationResponse
import KinesisAnalytics.StopApplicationRequest
import KinesisAnalytics.StopApplicationResponse
import KinesisAnalytics.TagResourceRequest
import KinesisAnalytics.TagResourceResponse
import KinesisAnalytics.UntagResourceRequest
import KinesisAnalytics.UntagResourceResponse
import KinesisAnalytics.UpdateApplicationRequest
import KinesisAnalytics.UpdateApplicationResponse
import KinesisAnalytics.InputProcessingConfiguration
import KinesisAnalytics.ReferenceDataSource
import KinesisAnalytics.ApplicationDetail
import KinesisAnalytics.InputStartingPositionConfiguration
import KinesisAnalytics.S3Configuration
import KinesisAnalytics.SourceSchema
import KinesisAnalytics.KinesisStreamsInput
import KinesisAnalytics.KinesisFirehoseInput
import KinesisAnalytics.InputParallelism
import KinesisAnalytics.InputProcessingConfigurationDescription
import KinesisAnalytics.KinesisStreamsInputDescription
import KinesisAnalytics.KinesisFirehoseInputDescription
import KinesisAnalytics.InputLambdaProcessor
import KinesisAnalytics.InputLambdaProcessorDescription
import KinesisAnalytics.InputLambdaProcessorUpdate
import KinesisAnalytics.RecordFormat
import KinesisAnalytics.InputProcessingConfigurationUpdate
import KinesisAnalytics.KinesisStreamsInputUpdate
import KinesisAnalytics.KinesisFirehoseInputUpdate
import KinesisAnalytics.InputSchemaUpdate
import KinesisAnalytics.InputParallelismUpdate
import KinesisAnalytics.JSONMappingParameters
import KinesisAnalytics.CSVMappingParameters
import KinesisAnalytics.KinesisStreamsOutput
import KinesisAnalytics.KinesisFirehoseOutput
import KinesisAnalytics.LambdaOutput
import KinesisAnalytics.DestinationSchema
import KinesisAnalytics.KinesisStreamsOutputDescription
import KinesisAnalytics.KinesisFirehoseOutputDescription
import KinesisAnalytics.LambdaOutputDescription
import KinesisAnalytics.KinesisStreamsOutputUpdate
import KinesisAnalytics.KinesisFirehoseOutputUpdate
import KinesisAnalytics.LambdaOutputUpdate
import KinesisAnalytics.MappingParameters
import KinesisAnalytics.S3ReferenceDataSource
import KinesisAnalytics.S3ReferenceDataSourceDescription
import KinesisAnalytics.S3ReferenceDataSourceUpdate
import KinesisAnalytics.ApplicationUpdate

typealias ApplicationCode = String

typealias ApplicationDescription = String

typealias ApplicationName = String

typealias ApplicationSummaries = Array<ApplicationSummary>

typealias ApplicationVersionId = Number

typealias BooleanObject = Boolean

typealias BucketARN = String

typealias CloudWatchLoggingOptionDescriptions = Array<CloudWatchLoggingOptionDescription>

typealias CloudWatchLoggingOptionUpdates = Array<CloudWatchLoggingOptionUpdate>

typealias CloudWatchLoggingOptions = Array<CloudWatchLoggingOption>

typealias FileKey = String

typealias Id = String

typealias InAppStreamName = String

typealias InAppStreamNames = Array<InAppStreamName>

typealias InAppTableName = String

typealias InputConfigurations = Array<InputConfiguration>

typealias InputDescriptions = Array<InputDescription>

typealias InputParallelismCount = Number

typealias InputUpdates = Array<InputUpdate>

typealias Inputs = Array<Input>

typealias KinesisAnalyticsARN = String

typealias ListApplicationsInputLimit = Number

typealias LogStreamARN = String

typealias OutputDescriptions = Array<OutputDescription>

typealias OutputUpdates = Array<OutputUpdate>

typealias Outputs = Array<Output>

typealias ParsedInputRecord = Array<ParsedInputRecordField>

typealias ParsedInputRecordField = String

typealias ParsedInputRecords = Array<ParsedInputRecord>

typealias ProcessedInputRecord = String

typealias ProcessedInputRecords = Array<ProcessedInputRecord>

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

typealias ResourceARN = String

typealias RoleARN = String

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class KinesisAnalytics(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & KinesisAnalytics.Types.ClientConfiguration */
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
    open fun createApplication(params: CreateApplicationRequest, callback: (err: AWSError, data: CreateApplicationResponse) -> Unit = definedExternally): Request<CreateApplicationResponse, AWSError>
    open fun createApplication(callback: (err: AWSError, data: CreateApplicationResponse) -> Unit = definedExternally): Request<CreateApplicationResponse, AWSError>
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
    open fun describeApplication(params: DescribeApplicationRequest, callback: (err: AWSError, data: DescribeApplicationResponse) -> Unit = definedExternally): Request<DescribeApplicationResponse, AWSError>
    open fun describeApplication(callback: (err: AWSError, data: DescribeApplicationResponse) -> Unit = definedExternally): Request<DescribeApplicationResponse, AWSError>
    open fun discoverInputSchema(params: DiscoverInputSchemaRequest, callback: (err: AWSError, data: DiscoverInputSchemaResponse) -> Unit = definedExternally): Request<DiscoverInputSchemaResponse, AWSError>
    open fun discoverInputSchema(callback: (err: AWSError, data: DiscoverInputSchemaResponse) -> Unit = definedExternally): Request<DiscoverInputSchemaResponse, AWSError>
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
    interface AddApplicationCloudWatchLoggingOptionResponse
    interface AddApplicationInputProcessingConfigurationRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var InputId: Id
        var InputProcessingConfiguration: InputProcessingConfiguration
    }
    interface AddApplicationInputProcessingConfigurationResponse
    interface AddApplicationInputRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var Input: Input
    }
    interface AddApplicationInputResponse
    interface AddApplicationOutputRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var Output: Output
    }
    interface AddApplicationOutputResponse
    interface AddApplicationReferenceDataSourceRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var ReferenceDataSource: ReferenceDataSource
    }
    interface AddApplicationReferenceDataSourceResponse
    interface ApplicationDetail {
        var ApplicationName: ApplicationName
        var ApplicationDescription: ApplicationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationARN: ResourceARN
        var ApplicationStatus: String /* "DELETING" | "STARTING" | "STOPPING" | "READY" | "RUNNING" | "UPDATING" | String */
        var CreateTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputDescriptions: InputDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDescriptions: OutputDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var ReferenceDataSourceDescriptions: ReferenceDataSourceDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptionDescriptions: CloudWatchLoggingOptionDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationCode: ApplicationCode?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationVersionId: ApplicationVersionId
    }
    interface ApplicationSummary {
        var ApplicationName: ApplicationName
        var ApplicationARN: ResourceARN
        var ApplicationStatus: String /* "DELETING" | "STARTING" | "STOPPING" | "READY" | "RUNNING" | "UPDATING" | String */
    }
    interface ApplicationUpdate {
        var InputUpdates: InputUpdates?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationCodeUpdate: ApplicationCode?
            get() = definedExternally
            set(value) = definedExternally
        var OutputUpdates: OutputUpdates?
            get() = definedExternally
            set(value) = definedExternally
        var ReferenceDataSourceUpdates: ReferenceDataSourceUpdates?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptionUpdates: CloudWatchLoggingOptionUpdates?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CSVMappingParameters {
        var RecordRowDelimiter: RecordRowDelimiter
        var RecordColumnDelimiter: RecordColumnDelimiter
    }
    interface CloudWatchLoggingOption {
        var LogStreamARN: LogStreamARN
        var RoleARN: RoleARN
    }
    interface CloudWatchLoggingOptionDescription {
        var CloudWatchLoggingOptionId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var LogStreamARN: LogStreamARN
        var RoleARN: RoleARN
    }
    interface CloudWatchLoggingOptionUpdate {
        var CloudWatchLoggingOptionId: Id
        var LogStreamARNUpdate: LogStreamARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARNUpdate: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationRequest {
        var ApplicationName: ApplicationName
        var ApplicationDescription: ApplicationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Inputs: Inputs?
            get() = definedExternally
            set(value) = definedExternally
        var Outputs: Outputs?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationCode: ApplicationCode?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationResponse {
        var ApplicationSummary: ApplicationSummary
    }
    interface DeleteApplicationCloudWatchLoggingOptionRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var CloudWatchLoggingOptionId: Id
    }
    interface DeleteApplicationCloudWatchLoggingOptionResponse
    interface DeleteApplicationInputProcessingConfigurationRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var InputId: Id
    }
    interface DeleteApplicationInputProcessingConfigurationResponse
    interface DeleteApplicationOutputRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var OutputId: Id
    }
    interface DeleteApplicationOutputResponse
    interface DeleteApplicationReferenceDataSourceRequest {
        var ApplicationName: ApplicationName
        var CurrentApplicationVersionId: ApplicationVersionId
        var ReferenceId: Id
    }
    interface DeleteApplicationReferenceDataSourceResponse
    interface DeleteApplicationRequest {
        var ApplicationName: ApplicationName
        var CreateTimestamp: Timestamp
    }
    interface DeleteApplicationResponse
    interface DescribeApplicationRequest {
        var ApplicationName: ApplicationName
    }
    interface DescribeApplicationResponse {
        var ApplicationDetail: ApplicationDetail
    }
    interface DestinationSchema {
        var RecordFormatType: String /* "JSON" | "CSV" | String */
    }
    interface DiscoverInputSchemaRequest {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
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
    interface InputConfiguration {
        var Id: Id
        var InputStartingPositionConfiguration: InputStartingPositionConfiguration
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
        var RoleARN: RoleARN
    }
    interface InputLambdaProcessorDescription {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputLambdaProcessorUpdate {
        var ResourceARNUpdate: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARNUpdate: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputParallelism {
        var Count: InputParallelismCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputParallelismUpdate {
        var CountUpdate: InputParallelismCount?
            get() = definedExternally
            set(value) = definedExternally
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
        var RoleARN: RoleARN
    }
    interface KinesisFirehoseInputDescription {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisFirehoseInputUpdate {
        var ResourceARNUpdate: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARNUpdate: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisFirehoseOutput {
        var ResourceARN: ResourceARN
        var RoleARN: RoleARN
    }
    interface KinesisFirehoseOutputDescription {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisFirehoseOutputUpdate {
        var ResourceARNUpdate: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARNUpdate: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisStreamsInput {
        var ResourceARN: ResourceARN
        var RoleARN: RoleARN
    }
    interface KinesisStreamsInputDescription {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisStreamsInputUpdate {
        var ResourceARNUpdate: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARNUpdate: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisStreamsOutput {
        var ResourceARN: ResourceARN
        var RoleARN: RoleARN
    }
    interface KinesisStreamsOutputDescription {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KinesisStreamsOutputUpdate {
        var ResourceARNUpdate: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARNUpdate: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaOutput {
        var ResourceARN: ResourceARN
        var RoleARN: RoleARN
    }
    interface LambdaOutputDescription {
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaOutputUpdate {
        var ResourceARNUpdate: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARNUpdate: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApplicationsRequest {
        var Limit: ListApplicationsInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var ExclusiveStartApplicationName: ApplicationName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApplicationsResponse {
        var ApplicationSummaries: ApplicationSummaries
        var HasMoreApplications: BooleanObject
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
    interface S3Configuration {
        var RoleARN: RoleARN
        var BucketARN: BucketARN
        var FileKey: FileKey
    }
    interface S3ReferenceDataSource {
        var BucketARN: BucketARN
        var FileKey: FileKey
        var ReferenceRoleARN: RoleARN
    }
    interface S3ReferenceDataSourceDescription {
        var BucketARN: BucketARN
        var FileKey: FileKey
        var ReferenceRoleARN: RoleARN
    }
    interface S3ReferenceDataSourceUpdate {
        var BucketARNUpdate: BucketARN?
            get() = definedExternally
            set(value) = definedExternally
        var FileKeyUpdate: FileKey?
            get() = definedExternally
            set(value) = definedExternally
        var ReferenceRoleARNUpdate: RoleARN?
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
    interface StartApplicationRequest {
        var ApplicationName: ApplicationName
        var InputConfigurations: InputConfigurations
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
        var ApplicationUpdate: ApplicationUpdate
    }
    interface UpdateApplicationResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2015-08-14" | "latest" | String */
    }
}