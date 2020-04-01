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
import Firehose.DestinationDescription
import Firehose.Tag
import Firehose.Processor
import Firehose.ProcessorParameter
import Firehose.Record
import Firehose.PutRecordBatchResponseEntry
import Firehose.CreateDeliveryStreamInput
import Firehose.CreateDeliveryStreamOutput
import Firehose.DeleteDeliveryStreamInput
import Firehose.DeleteDeliveryStreamOutput
import Firehose.DescribeDeliveryStreamInput
import Firehose.DescribeDeliveryStreamOutput
import Firehose.ListDeliveryStreamsInput
import Firehose.ListDeliveryStreamsOutput
import Firehose.ListTagsForDeliveryStreamInput
import Firehose.ListTagsForDeliveryStreamOutput
import Firehose.PutRecordInput
import Firehose.PutRecordOutput
import Firehose.PutRecordBatchInput
import Firehose.PutRecordBatchOutput
import Firehose.StartDeliveryStreamEncryptionInput
import Firehose.StartDeliveryStreamEncryptionOutput
import Firehose.StopDeliveryStreamEncryptionInput
import Firehose.StopDeliveryStreamEncryptionOutput
import Firehose.TagDeliveryStreamInput
import Firehose.TagDeliveryStreamOutput
import Firehose.UntagDeliveryStreamInput
import Firehose.UntagDeliveryStreamOutput
import Firehose.UpdateDestinationInput
import Firehose.UpdateDestinationOutput
import Firehose.KinesisStreamSourceConfiguration
import Firehose.DeliveryStreamEncryptionConfigurationInput
import Firehose.S3DestinationConfiguration
import Firehose.ExtendedS3DestinationConfiguration
import Firehose.RedshiftDestinationConfiguration
import Firehose.ElasticsearchDestinationConfiguration
import Firehose.SplunkDestinationConfiguration
import Firehose.SchemaConfiguration
import Firehose.InputFormatConfiguration
import Firehose.OutputFormatConfiguration
import Firehose.FailureDescription
import Firehose.DeliveryStreamEncryptionConfiguration
import Firehose.SourceDescription
import Firehose.DeliveryStreamDescription
import Firehose.OpenXJsonSerDe
import Firehose.HiveJsonSerDe
import Firehose.S3DestinationDescription
import Firehose.ExtendedS3DestinationDescription
import Firehose.RedshiftDestinationDescription
import Firehose.ElasticsearchDestinationDescription
import Firehose.SplunkDestinationDescription
import Firehose.ElasticsearchBufferingHints
import Firehose.ElasticsearchRetryOptions
import Firehose.ProcessingConfiguration
import Firehose.CloudWatchLoggingOptions
import Firehose.S3DestinationUpdate
import Firehose.KMSEncryptionConfig
import Firehose.BufferingHints
import Firehose.EncryptionConfiguration
import Firehose.DataFormatConversionConfiguration
import Firehose.Deserializer
import Firehose.ColumnToJsonKeyMappings
import Firehose.Serializer
import Firehose.CopyCommand
import Firehose.RedshiftRetryOptions
import Firehose.ParquetSerDe
import Firehose.OrcSerDe
import Firehose.KinesisStreamSourceDescription
import Firehose.SplunkRetryOptions
import Firehose.ExtendedS3DestinationUpdate
import Firehose.RedshiftDestinationUpdate
import Firehose.ElasticsearchDestinationUpdate
import Firehose.SplunkDestinationUpdate

typealias AWSKMSKeyARN = String

typealias BlockSizeBytes = Number

typealias BooleanObject = Boolean

typealias BucketARN = String

typealias ClusterJDBCURL = String

typealias CopyOptions = String

typealias DataTableColumns = String

typealias DataTableName = String

typealias DeliveryStartTimestamp = Date

typealias DeliveryStreamARN = String

typealias DeliveryStreamName = String

typealias DeliveryStreamNameList = Array<DeliveryStreamName>

typealias DeliveryStreamVersionId = String

typealias DescribeDeliveryStreamInputLimit = Number

typealias DestinationDescriptionList = Array<DestinationDescription>

typealias DestinationId = String

typealias ElasticsearchBufferingIntervalInSeconds = Number

typealias ElasticsearchBufferingSizeInMBs = Number

typealias ElasticsearchClusterEndpoint = String

typealias ElasticsearchDomainARN = String

typealias ElasticsearchIndexName = String

typealias ElasticsearchRetryDurationInSeconds = Number

typealias ElasticsearchTypeName = String

typealias ErrorCode = String

typealias ErrorMessage = String

typealias ErrorOutputPrefix = String

typealias HECAcknowledgmentTimeoutInSeconds = Number

typealias HECEndpoint = String

typealias HECToken = String

typealias IntervalInSeconds = Number

typealias KinesisStreamARN = String

typealias ListDeliveryStreamsInputLimit = Number

typealias ListOfNonEmptyStrings = Array<NonEmptyString>

typealias ListOfNonEmptyStringsWithoutWhitespace = Array<NonEmptyStringWithoutWhitespace>

typealias ListTagsForDeliveryStreamInputLimit = Number

typealias ListTagsForDeliveryStreamOutputTagList = Array<Tag>

typealias LogGroupName = String

typealias LogStreamName = String

typealias NonEmptyString = String

typealias NonEmptyStringWithoutWhitespace = String

typealias NonNegativeIntegerObject = Number

typealias OrcRowIndexStride = Number

typealias OrcStripeSizeBytes = Number

typealias ParquetPageSizeBytes = Number

typealias Password = String

typealias Prefix = String

typealias ProcessorList = Array<Processor>

typealias ProcessorParameterList = Array<ProcessorParameter>

typealias ProcessorParameterValue = String

typealias Proportion = Number

typealias PutRecordBatchRequestEntryList = Array<Record>

typealias PutRecordBatchResponseEntryList = Array<PutRecordBatchResponseEntry>

typealias PutResponseRecordId = String

typealias RedshiftRetryDurationInSeconds = Number

typealias RoleARN = String

typealias SizeInMBs = Number

typealias SplunkRetryDurationInSeconds = Number

typealias TagDeliveryStreamInputTagList = Array<Tag>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Timestamp = Date

typealias Username = String

@JsModule("aws-sdk")
external open class Firehose(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Firehose.Types.ClientConfiguration */
    open fun createDeliveryStream(params: CreateDeliveryStreamInput, callback: (err: AWSError, data: CreateDeliveryStreamOutput) -> Unit = definedExternally): Request<CreateDeliveryStreamOutput, AWSError>
    open fun createDeliveryStream(callback: (err: AWSError, data: CreateDeliveryStreamOutput) -> Unit = definedExternally): Request<CreateDeliveryStreamOutput, AWSError>
    open fun deleteDeliveryStream(params: DeleteDeliveryStreamInput, callback: (err: AWSError, data: DeleteDeliveryStreamOutput) -> Unit = definedExternally): Request<DeleteDeliveryStreamOutput, AWSError>
    open fun deleteDeliveryStream(callback: (err: AWSError, data: DeleteDeliveryStreamOutput) -> Unit = definedExternally): Request<DeleteDeliveryStreamOutput, AWSError>
    open fun describeDeliveryStream(params: DescribeDeliveryStreamInput, callback: (err: AWSError, data: DescribeDeliveryStreamOutput) -> Unit = definedExternally): Request<DescribeDeliveryStreamOutput, AWSError>
    open fun describeDeliveryStream(callback: (err: AWSError, data: DescribeDeliveryStreamOutput) -> Unit = definedExternally): Request<DescribeDeliveryStreamOutput, AWSError>
    open fun listDeliveryStreams(params: ListDeliveryStreamsInput, callback: (err: AWSError, data: ListDeliveryStreamsOutput) -> Unit = definedExternally): Request<ListDeliveryStreamsOutput, AWSError>
    open fun listDeliveryStreams(callback: (err: AWSError, data: ListDeliveryStreamsOutput) -> Unit = definedExternally): Request<ListDeliveryStreamsOutput, AWSError>
    open fun listTagsForDeliveryStream(params: ListTagsForDeliveryStreamInput, callback: (err: AWSError, data: ListTagsForDeliveryStreamOutput) -> Unit = definedExternally): Request<ListTagsForDeliveryStreamOutput, AWSError>
    open fun listTagsForDeliveryStream(callback: (err: AWSError, data: ListTagsForDeliveryStreamOutput) -> Unit = definedExternally): Request<ListTagsForDeliveryStreamOutput, AWSError>
    open fun putRecord(params: PutRecordInput, callback: (err: AWSError, data: PutRecordOutput) -> Unit = definedExternally): Request<PutRecordOutput, AWSError>
    open fun putRecord(callback: (err: AWSError, data: PutRecordOutput) -> Unit = definedExternally): Request<PutRecordOutput, AWSError>
    open fun putRecordBatch(params: PutRecordBatchInput, callback: (err: AWSError, data: PutRecordBatchOutput) -> Unit = definedExternally): Request<PutRecordBatchOutput, AWSError>
    open fun putRecordBatch(callback: (err: AWSError, data: PutRecordBatchOutput) -> Unit = definedExternally): Request<PutRecordBatchOutput, AWSError>
    open fun startDeliveryStreamEncryption(params: StartDeliveryStreamEncryptionInput, callback: (err: AWSError, data: StartDeliveryStreamEncryptionOutput) -> Unit = definedExternally): Request<StartDeliveryStreamEncryptionOutput, AWSError>
    open fun startDeliveryStreamEncryption(callback: (err: AWSError, data: StartDeliveryStreamEncryptionOutput) -> Unit = definedExternally): Request<StartDeliveryStreamEncryptionOutput, AWSError>
    open fun stopDeliveryStreamEncryption(params: StopDeliveryStreamEncryptionInput, callback: (err: AWSError, data: StopDeliveryStreamEncryptionOutput) -> Unit = definedExternally): Request<StopDeliveryStreamEncryptionOutput, AWSError>
    open fun stopDeliveryStreamEncryption(callback: (err: AWSError, data: StopDeliveryStreamEncryptionOutput) -> Unit = definedExternally): Request<StopDeliveryStreamEncryptionOutput, AWSError>
    open fun tagDeliveryStream(params: TagDeliveryStreamInput, callback: (err: AWSError, data: TagDeliveryStreamOutput) -> Unit = definedExternally): Request<TagDeliveryStreamOutput, AWSError>
    open fun tagDeliveryStream(callback: (err: AWSError, data: TagDeliveryStreamOutput) -> Unit = definedExternally): Request<TagDeliveryStreamOutput, AWSError>
    open fun untagDeliveryStream(params: UntagDeliveryStreamInput, callback: (err: AWSError, data: UntagDeliveryStreamOutput) -> Unit = definedExternally): Request<UntagDeliveryStreamOutput, AWSError>
    open fun untagDeliveryStream(callback: (err: AWSError, data: UntagDeliveryStreamOutput) -> Unit = definedExternally): Request<UntagDeliveryStreamOutput, AWSError>
    open fun updateDestination(params: UpdateDestinationInput, callback: (err: AWSError, data: UpdateDestinationOutput) -> Unit = definedExternally): Request<UpdateDestinationOutput, AWSError>
    open fun updateDestination(callback: (err: AWSError, data: UpdateDestinationOutput) -> Unit = definedExternally): Request<UpdateDestinationOutput, AWSError>
    interface BufferingHints {
        var SizeInMBs: SizeInMBs?
            get() = definedExternally
            set(value) = definedExternally
        var IntervalInSeconds: IntervalInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchLoggingOptions {
        var Enabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var LogGroupName: LogGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var LogStreamName: LogStreamName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ColumnToJsonKeyMappings {
        @nativeGetter
        operator fun get(key: String): NonEmptyString?
        @nativeSetter
        operator fun set(key: String, value: NonEmptyString)
    }
    interface CopyCommand {
        var DataTableName: DataTableName
        var DataTableColumns: DataTableColumns?
            get() = definedExternally
            set(value) = definedExternally
        var CopyOptions: CopyOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeliveryStreamInput {
        var DeliveryStreamName: DeliveryStreamName
        var DeliveryStreamType: String /* "DirectPut" | "KinesisStreamAsSource" | String */
        var KinesisStreamSourceConfiguration: KinesisStreamSourceConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInput?
            get() = definedExternally
            set(value) = definedExternally
        var S3DestinationConfiguration: S3DestinationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var ExtendedS3DestinationConfiguration: ExtendedS3DestinationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var RedshiftDestinationConfiguration: RedshiftDestinationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchDestinationConfiguration: ElasticsearchDestinationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var SplunkDestinationConfiguration: SplunkDestinationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagDeliveryStreamInputTagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeliveryStreamOutput {
        var DeliveryStreamARN: DeliveryStreamARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataFormatConversionConfiguration {
        var SchemaConfiguration: SchemaConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var InputFormatConfiguration: InputFormatConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var OutputFormatConfiguration: OutputFormatConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDeliveryStreamInput {
        var DeliveryStreamName: DeliveryStreamName
        var AllowForceDelete: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDeliveryStreamOutput
    interface DeliveryStreamDescription {
        var DeliveryStreamName: DeliveryStreamName
        var DeliveryStreamARN: DeliveryStreamARN
        var DeliveryStreamStatus: String /* "CREATING" | "CREATING_FAILED" | "DELETING" | "DELETING_FAILED" | "ACTIVE" | String */
        var FailureDescription: FailureDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryStreamEncryptionConfiguration: DeliveryStreamEncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryStreamType: String /* "DirectPut" | "KinesisStreamAsSource" | String */
        var VersionId: DeliveryStreamVersionId
        var CreateTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Source: SourceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Destinations: DestinationDescriptionList
        var HasMoreDestinations: BooleanObject
    }
    interface DeliveryStreamEncryptionConfiguration {
        var KeyARN: AWSKMSKeyARN?
            get() = definedExternally
            set(value) = definedExternally
        var KeyType: String /* "AWS_OWNED_CMK" | "CUSTOMER_MANAGED_CMK" | String */
        var Status: String /* "ENABLED" | "ENABLING" | "ENABLING_FAILED" | "DISABLED" | "DISABLING" | "DISABLING_FAILED" | String */
        var FailureDescription: FailureDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeliveryStreamEncryptionConfigurationInput {
        var KeyARN: AWSKMSKeyARN?
            get() = definedExternally
            set(value) = definedExternally
        var KeyType: String /* "AWS_OWNED_CMK" | "CUSTOMER_MANAGED_CMK" | String */
    }
    interface DescribeDeliveryStreamInput {
        var DeliveryStreamName: DeliveryStreamName
        var Limit: DescribeDeliveryStreamInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var ExclusiveStartDestinationId: DestinationId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDeliveryStreamOutput {
        var DeliveryStreamDescription: DeliveryStreamDescription
    }
    interface Deserializer {
        var OpenXJsonSerDe: OpenXJsonSerDe?
            get() = definedExternally
            set(value) = definedExternally
        var HiveJsonSerDe: HiveJsonSerDe?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DestinationDescription {
        var DestinationId: DestinationId
        var S3DestinationDescription: S3DestinationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ExtendedS3DestinationDescription: ExtendedS3DestinationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var RedshiftDestinationDescription: RedshiftDestinationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchDestinationDescription: ElasticsearchDestinationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var SplunkDestinationDescription: SplunkDestinationDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticsearchBufferingHints {
        var IntervalInSeconds: ElasticsearchBufferingIntervalInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var SizeInMBs: ElasticsearchBufferingSizeInMBs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticsearchDestinationConfiguration {
        var RoleARN: RoleARN
        var DomainARN: ElasticsearchDomainARN?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterEndpoint: ElasticsearchClusterEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var IndexName: ElasticsearchIndexName
        var TypeName: ElasticsearchTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var IndexRotationPeriod: String /* "NoRotation" | "OneHour" | "OneDay" | "OneWeek" | "OneMonth" | String */
        var BufferingHints: ElasticsearchBufferingHints?
            get() = definedExternally
            set(value) = definedExternally
        var RetryOptions: ElasticsearchRetryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "FailedDocumentsOnly" | "AllDocuments" | String */
        var S3Configuration: S3DestinationConfiguration
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticsearchDestinationDescription {
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var DomainARN: ElasticsearchDomainARN?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterEndpoint: ElasticsearchClusterEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var IndexName: ElasticsearchIndexName?
            get() = definedExternally
            set(value) = definedExternally
        var TypeName: ElasticsearchTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var IndexRotationPeriod: String /* "NoRotation" | "OneHour" | "OneDay" | "OneWeek" | "OneMonth" | String */
        var BufferingHints: ElasticsearchBufferingHints?
            get() = definedExternally
            set(value) = definedExternally
        var RetryOptions: ElasticsearchRetryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "FailedDocumentsOnly" | "AllDocuments" | String */
        var S3DestinationDescription: S3DestinationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticsearchDestinationUpdate {
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var DomainARN: ElasticsearchDomainARN?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterEndpoint: ElasticsearchClusterEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var IndexName: ElasticsearchIndexName?
            get() = definedExternally
            set(value) = definedExternally
        var TypeName: ElasticsearchTypeName?
            get() = definedExternally
            set(value) = definedExternally
        var IndexRotationPeriod: String /* "NoRotation" | "OneHour" | "OneDay" | "OneWeek" | "OneMonth" | String */
        var BufferingHints: ElasticsearchBufferingHints?
            get() = definedExternally
            set(value) = definedExternally
        var RetryOptions: ElasticsearchRetryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var S3Update: S3DestinationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ElasticsearchRetryOptions {
        var DurationInSeconds: ElasticsearchRetryDurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionConfiguration {
        var NoEncryptionConfig: String /* "NoEncryption" | String */
        var KMSEncryptionConfig: KMSEncryptionConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExtendedS3DestinationConfiguration {
        var RoleARN: RoleARN
        var BucketARN: BucketARN
        var Prefix: Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorOutputPrefix: ErrorOutputPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var BufferingHints: BufferingHints?
            get() = definedExternally
            set(value) = definedExternally
        var CompressionFormat: String /* "UNCOMPRESSED" | "GZIP" | "ZIP" | "Snappy" | String */
        var EncryptionConfiguration: EncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "Disabled" | "Enabled" | String */
        var S3BackupConfiguration: S3DestinationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DataFormatConversionConfiguration: DataFormatConversionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExtendedS3DestinationDescription {
        var RoleARN: RoleARN
        var BucketARN: BucketARN
        var Prefix: Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorOutputPrefix: ErrorOutputPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var BufferingHints: BufferingHints
        var CompressionFormat: String /* "UNCOMPRESSED" | "GZIP" | "ZIP" | "Snappy" | String */
        var EncryptionConfiguration: EncryptionConfiguration
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "Disabled" | "Enabled" | String */
        var S3BackupDescription: S3DestinationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var DataFormatConversionConfiguration: DataFormatConversionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExtendedS3DestinationUpdate {
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var BucketARN: BucketARN?
            get() = definedExternally
            set(value) = definedExternally
        var Prefix: Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorOutputPrefix: ErrorOutputPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var BufferingHints: BufferingHints?
            get() = definedExternally
            set(value) = definedExternally
        var CompressionFormat: String /* "UNCOMPRESSED" | "GZIP" | "ZIP" | "Snappy" | String */
        var EncryptionConfiguration: EncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "Disabled" | "Enabled" | String */
        var S3BackupUpdate: S3DestinationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var DataFormatConversionConfiguration: DataFormatConversionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailureDescription {
        var Type: String /* "RETIRE_KMS_GRANT_FAILED" | "CREATE_KMS_GRANT_FAILED" | "KMS_ACCESS_DENIED" | "DISABLED_KMS_KEY" | "INVALID_KMS_KEY" | "KMS_KEY_NOT_FOUND" | "KMS_OPT_IN_REQUIRED" | "UNKNOWN_ERROR" | String */
        var Details: NonEmptyString
    }
    interface HiveJsonSerDe {
        var TimestampFormats: ListOfNonEmptyStrings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputFormatConfiguration {
        var Deserializer: Deserializer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KMSEncryptionConfig {
        var AWSKMSKeyARN: AWSKMSKeyARN
    }
    interface KinesisStreamSourceConfiguration {
        var KinesisStreamARN: KinesisStreamARN
        var RoleARN: RoleARN
    }
    interface KinesisStreamSourceDescription {
        var KinesisStreamARN: KinesisStreamARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryStartTimestamp: DeliveryStartTimestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeliveryStreamsInput {
        var Limit: ListDeliveryStreamsInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryStreamType: String /* "DirectPut" | "KinesisStreamAsSource" | String */
        var ExclusiveStartDeliveryStreamName: DeliveryStreamName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeliveryStreamsOutput {
        var DeliveryStreamNames: DeliveryStreamNameList
        var HasMoreDeliveryStreams: BooleanObject
    }
    interface ListTagsForDeliveryStreamInput {
        var DeliveryStreamName: DeliveryStreamName
        var ExclusiveStartTagKey: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: ListTagsForDeliveryStreamInputLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForDeliveryStreamOutput {
        var Tags: ListTagsForDeliveryStreamOutputTagList
        var HasMoreTags: BooleanObject
    }
    interface OpenXJsonSerDe {
        var ConvertDotsInJsonKeysToUnderscores: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var CaseInsensitive: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var ColumnToJsonKeyMappings: ColumnToJsonKeyMappings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrcSerDe {
        var StripeSizeBytes: OrcStripeSizeBytes?
            get() = definedExternally
            set(value) = definedExternally
        var BlockSizeBytes: BlockSizeBytes?
            get() = definedExternally
            set(value) = definedExternally
        var RowIndexStride: OrcRowIndexStride?
            get() = definedExternally
            set(value) = definedExternally
        var EnablePadding: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var PaddingTolerance: Proportion?
            get() = definedExternally
            set(value) = definedExternally
        var Compression: String /* "NONE" | "ZLIB" | "SNAPPY" | String */
        var BloomFilterColumns: ListOfNonEmptyStringsWithoutWhitespace?
            get() = definedExternally
            set(value) = definedExternally
        var BloomFilterFalsePositiveProbability: Proportion?
            get() = definedExternally
            set(value) = definedExternally
        var DictionaryKeyThreshold: Proportion?
            get() = definedExternally
            set(value) = definedExternally
        var FormatVersion: String /* "V0_11" | "V0_12" | String */
    }
    interface OutputFormatConfiguration {
        var Serializer: Serializer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParquetSerDe {
        var BlockSizeBytes: BlockSizeBytes?
            get() = definedExternally
            set(value) = definedExternally
        var PageSizeBytes: ParquetPageSizeBytes?
            get() = definedExternally
            set(value) = definedExternally
        var Compression: String /* "UNCOMPRESSED" | "GZIP" | "SNAPPY" | String */
        var EnableDictionaryCompression: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var MaxPaddingBytes: NonNegativeIntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var WriterVersion: String /* "V1" | "V2" | String */
    }
    interface ProcessingConfiguration {
        var Enabled: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var Processors: ProcessorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Processor {
        var Type: String /* "Lambda" | String */
        var Parameters: ProcessorParameterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProcessorParameter {
        var ParameterName: String /* "LambdaArn" | "NumberOfRetries" | "RoleArn" | "BufferSizeInMBs" | "BufferIntervalInSeconds" | String */
        var ParameterValue: ProcessorParameterValue
    }
    interface PutRecordBatchInput {
        var DeliveryStreamName: DeliveryStreamName
        var Records: PutRecordBatchRequestEntryList
    }
    interface PutRecordBatchOutput {
        var FailedPutCount: NonNegativeIntegerObject
        var Encrypted: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
        var RequestResponses: PutRecordBatchResponseEntryList
    }
    interface PutRecordBatchResponseEntry {
        var RecordId: PutResponseRecordId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRecordInput {
        var DeliveryStreamName: DeliveryStreamName
        var Record: Record
    }
    interface PutRecordOutput {
        var RecordId: PutResponseRecordId
        var Encrypted: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Record {
        var Data: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RedshiftDestinationConfiguration {
        var RoleARN: RoleARN
        var ClusterJDBCURL: ClusterJDBCURL
        var CopyCommand: CopyCommand
        var Username: Username
        var Password: Password
        var RetryOptions: RedshiftRetryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var S3Configuration: S3DestinationConfiguration
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "Disabled" | "Enabled" | String */
        var S3BackupConfiguration: S3DestinationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RedshiftDestinationDescription {
        var RoleARN: RoleARN
        var ClusterJDBCURL: ClusterJDBCURL
        var CopyCommand: CopyCommand
        var Username: Username
        var RetryOptions: RedshiftRetryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var S3DestinationDescription: S3DestinationDescription
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "Disabled" | "Enabled" | String */
        var S3BackupDescription: S3DestinationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RedshiftDestinationUpdate {
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterJDBCURL: ClusterJDBCURL?
            get() = definedExternally
            set(value) = definedExternally
        var CopyCommand: CopyCommand?
            get() = definedExternally
            set(value) = definedExternally
        var Username: Username?
            get() = definedExternally
            set(value) = definedExternally
        var Password: Password?
            get() = definedExternally
            set(value) = definedExternally
        var RetryOptions: RedshiftRetryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var S3Update: S3DestinationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "Disabled" | "Enabled" | String */
        var S3BackupUpdate: S3DestinationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RedshiftRetryOptions {
        var DurationInSeconds: RedshiftRetryDurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3DestinationConfiguration {
        var RoleARN: RoleARN
        var BucketARN: BucketARN
        var Prefix: Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorOutputPrefix: ErrorOutputPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var BufferingHints: BufferingHints?
            get() = definedExternally
            set(value) = definedExternally
        var CompressionFormat: String /* "UNCOMPRESSED" | "GZIP" | "ZIP" | "Snappy" | String */
        var EncryptionConfiguration: EncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3DestinationDescription {
        var RoleARN: RoleARN
        var BucketARN: BucketARN
        var Prefix: Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorOutputPrefix: ErrorOutputPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var BufferingHints: BufferingHints
        var CompressionFormat: String /* "UNCOMPRESSED" | "GZIP" | "ZIP" | "Snappy" | String */
        var EncryptionConfiguration: EncryptionConfiguration
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3DestinationUpdate {
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var BucketARN: BucketARN?
            get() = definedExternally
            set(value) = definedExternally
        var Prefix: Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorOutputPrefix: ErrorOutputPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var BufferingHints: BufferingHints?
            get() = definedExternally
            set(value) = definedExternally
        var CompressionFormat: String /* "UNCOMPRESSED" | "GZIP" | "ZIP" | "Snappy" | String */
        var EncryptionConfiguration: EncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SchemaConfiguration {
        var RoleARN: NonEmptyStringWithoutWhitespace?
            get() = definedExternally
            set(value) = definedExternally
        var CatalogId: NonEmptyStringWithoutWhitespace?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NonEmptyStringWithoutWhitespace?
            get() = definedExternally
            set(value) = definedExternally
        var TableName: NonEmptyStringWithoutWhitespace?
            get() = definedExternally
            set(value) = definedExternally
        var Region: NonEmptyStringWithoutWhitespace?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: NonEmptyStringWithoutWhitespace?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Serializer {
        var ParquetSerDe: ParquetSerDe?
            get() = definedExternally
            set(value) = definedExternally
        var OrcSerDe: OrcSerDe?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceDescription {
        var KinesisStreamSourceDescription: KinesisStreamSourceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SplunkDestinationConfiguration {
        var HECEndpoint: HECEndpoint
        var HECEndpointType: String /* "Raw" | "Event" | String */
        var HECToken: HECToken
        var HECAcknowledgmentTimeoutInSeconds: HECAcknowledgmentTimeoutInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var RetryOptions: SplunkRetryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "FailedEventsOnly" | "AllEvents" | String */
        var S3Configuration: S3DestinationConfiguration
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SplunkDestinationDescription {
        var HECEndpoint: HECEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var HECEndpointType: String /* "Raw" | "Event" | String */
        var HECToken: HECToken?
            get() = definedExternally
            set(value) = definedExternally
        var HECAcknowledgmentTimeoutInSeconds: HECAcknowledgmentTimeoutInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var RetryOptions: SplunkRetryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "FailedEventsOnly" | "AllEvents" | String */
        var S3DestinationDescription: S3DestinationDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SplunkDestinationUpdate {
        var HECEndpoint: HECEndpoint?
            get() = definedExternally
            set(value) = definedExternally
        var HECEndpointType: String /* "Raw" | "Event" | String */
        var HECToken: HECToken?
            get() = definedExternally
            set(value) = definedExternally
        var HECAcknowledgmentTimeoutInSeconds: HECAcknowledgmentTimeoutInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var RetryOptions: SplunkRetryOptions?
            get() = definedExternally
            set(value) = definedExternally
        var S3BackupMode: String /* "FailedEventsOnly" | "AllEvents" | String */
        var S3Update: S3DestinationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ProcessingConfiguration: ProcessingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLoggingOptions: CloudWatchLoggingOptions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SplunkRetryOptions {
        var DurationInSeconds: SplunkRetryDurationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDeliveryStreamEncryptionInput {
        var DeliveryStreamName: DeliveryStreamName
        var DeliveryStreamEncryptionConfigurationInput: DeliveryStreamEncryptionConfigurationInput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDeliveryStreamEncryptionOutput
    interface StopDeliveryStreamEncryptionInput {
        var DeliveryStreamName: DeliveryStreamName
    }
    interface StopDeliveryStreamEncryptionOutput
    interface Tag {
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagDeliveryStreamInput {
        var DeliveryStreamName: DeliveryStreamName
        var Tags: TagDeliveryStreamInputTagList
    }
    interface TagDeliveryStreamOutput
    interface UntagDeliveryStreamInput {
        var DeliveryStreamName: DeliveryStreamName
        var TagKeys: TagKeyList
    }
    interface UntagDeliveryStreamOutput
    interface UpdateDestinationInput {
        var DeliveryStreamName: DeliveryStreamName
        var CurrentDeliveryStreamVersionId: DeliveryStreamVersionId
        var DestinationId: DestinationId
        var S3DestinationUpdate: S3DestinationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ExtendedS3DestinationUpdate: ExtendedS3DestinationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var RedshiftDestinationUpdate: RedshiftDestinationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var ElasticsearchDestinationUpdate: ElasticsearchDestinationUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var SplunkDestinationUpdate: SplunkDestinationUpdate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDestinationOutput
    interface ClientApiVersions {
        var apiVersion: String /* "2015-08-04" | "latest" | String */
    }
}