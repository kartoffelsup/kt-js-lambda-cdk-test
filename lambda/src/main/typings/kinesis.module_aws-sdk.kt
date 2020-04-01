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
import Kinesis.Consumer
import Kinesis.EnhancedMetrics
import Kinesis.PutRecordsRequestEntry
import Kinesis.PutRecordsResultEntry
import Kinesis.Record
import Kinesis.Shard
import Kinesis.Tag
import Kinesis.AddTagsToStreamInput
import Kinesis.CreateStreamInput
import Kinesis.DecreaseStreamRetentionPeriodInput
import Kinesis.DeleteStreamInput
import Kinesis.DeregisterStreamConsumerInput
import Kinesis.DescribeLimitsInput
import Kinesis.DescribeLimitsOutput
import Kinesis.DescribeStreamInput
import Kinesis.DescribeStreamOutput
import Kinesis.DescribeStreamConsumerInput
import Kinesis.DescribeStreamConsumerOutput
import Kinesis.DescribeStreamSummaryInput
import Kinesis.DescribeStreamSummaryOutput
import Kinesis.DisableEnhancedMonitoringInput
import Kinesis.EnhancedMonitoringOutput
import Kinesis.EnableEnhancedMonitoringInput
import Kinesis.GetRecordsInput
import Kinesis.GetRecordsOutput
import Kinesis.GetShardIteratorInput
import Kinesis.GetShardIteratorOutput
import Kinesis.IncreaseStreamRetentionPeriodInput
import Kinesis.ListShardsInput
import Kinesis.ListShardsOutput
import Kinesis.ListStreamConsumersInput
import Kinesis.ListStreamConsumersOutput
import Kinesis.ListStreamsInput
import Kinesis.ListStreamsOutput
import Kinesis.ListTagsForStreamInput
import Kinesis.ListTagsForStreamOutput
import Kinesis.MergeShardsInput
import Kinesis.PutRecordInput
import Kinesis.PutRecordOutput
import Kinesis.PutRecordsInput
import Kinesis.PutRecordsOutput
import Kinesis.RegisterStreamConsumerInput
import Kinesis.RegisterStreamConsumerOutput
import Kinesis.RemoveTagsFromStreamInput
import Kinesis.SplitShardInput
import Kinesis.StartStreamEncryptionInput
import Kinesis.StopStreamEncryptionInput
import Kinesis.UpdateShardCountInput
import Kinesis.UpdateShardCountOutput
import Kinesis.TagMap
import Kinesis.ConsumerDescription
import Kinesis.StreamDescription
import Kinesis.StreamDescriptionSummary
import Kinesis.HashKeyRange
import Kinesis.SequenceNumberRange

typealias BooleanObject = Boolean

typealias ConsumerARN = String

typealias ConsumerCountObject = Number

typealias ConsumerList = Array<Consumer>

typealias ConsumerName = String

typealias DescribeStreamInputLimit = Number

typealias EnhancedMonitoringList = Array<EnhancedMetrics>

typealias ErrorCode = String

typealias ErrorMessage = String

typealias GetRecordsInputLimit = Number

typealias HashKey = String

typealias KeyId = String

typealias ListShardsInputLimit = Number

typealias ListStreamConsumersInputLimit = Number

typealias ListStreamsInputLimit = Number

typealias ListTagsForStreamInputLimit = Number

typealias MetricsNameList = Array<String /* "IncomingBytes" | "IncomingRecords" | "OutgoingBytes" | "OutgoingRecords" | "WriteProvisionedThroughputExceeded" | "ReadProvisionedThroughputExceeded" | "IteratorAgeMilliseconds" | "ALL" | String */>

typealias MillisBehindLatest = Number

typealias NextToken = String

typealias PartitionKey = String

typealias PositiveIntegerObject = Number

typealias PutRecordsRequestEntryList = Array<PutRecordsRequestEntry>

typealias PutRecordsResultEntryList = Array<PutRecordsResultEntry>

typealias RecordList = Array<Record>

typealias RetentionPeriodHours = Number

typealias SequenceNumber = String

typealias ShardCountObject = Number

typealias ShardId = String

typealias ShardIterator = String

typealias ShardList = Array<Shard>

typealias StreamARN = String

typealias StreamName = String

typealias StreamNameList = Array<StreamName>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class Kinesis(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Kinesis.Types.ClientConfiguration */
    open fun addTagsToStream(params: AddTagsToStreamInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addTagsToStream(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createStream(params: CreateStreamInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createStream(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun decreaseStreamRetentionPeriod(params: DecreaseStreamRetentionPeriodInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun decreaseStreamRetentionPeriod(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteStream(params: DeleteStreamInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteStream(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterStreamConsumer(params: DeregisterStreamConsumerInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deregisterStreamConsumer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeLimits(params: DescribeLimitsInput, callback: (err: AWSError, data: DescribeLimitsOutput) -> Unit = definedExternally): Request<DescribeLimitsOutput, AWSError>
    open fun describeLimits(callback: (err: AWSError, data: DescribeLimitsOutput) -> Unit = definedExternally): Request<DescribeLimitsOutput, AWSError>
    open fun describeStream(params: DescribeStreamInput, callback: (err: AWSError, data: DescribeStreamOutput) -> Unit = definedExternally): Request<DescribeStreamOutput, AWSError>
    open fun describeStream(callback: (err: AWSError, data: DescribeStreamOutput) -> Unit = definedExternally): Request<DescribeStreamOutput, AWSError>
    open fun describeStreamConsumer(params: DescribeStreamConsumerInput, callback: (err: AWSError, data: DescribeStreamConsumerOutput) -> Unit = definedExternally): Request<DescribeStreamConsumerOutput, AWSError>
    open fun describeStreamConsumer(callback: (err: AWSError, data: DescribeStreamConsumerOutput) -> Unit = definedExternally): Request<DescribeStreamConsumerOutput, AWSError>
    open fun describeStreamSummary(params: DescribeStreamSummaryInput, callback: (err: AWSError, data: DescribeStreamSummaryOutput) -> Unit = definedExternally): Request<DescribeStreamSummaryOutput, AWSError>
    open fun describeStreamSummary(callback: (err: AWSError, data: DescribeStreamSummaryOutput) -> Unit = definedExternally): Request<DescribeStreamSummaryOutput, AWSError>
    open fun disableEnhancedMonitoring(params: DisableEnhancedMonitoringInput, callback: (err: AWSError, data: EnhancedMonitoringOutput) -> Unit = definedExternally): Request<EnhancedMonitoringOutput, AWSError>
    open fun disableEnhancedMonitoring(callback: (err: AWSError, data: EnhancedMonitoringOutput) -> Unit = definedExternally): Request<EnhancedMonitoringOutput, AWSError>
    open fun enableEnhancedMonitoring(params: EnableEnhancedMonitoringInput, callback: (err: AWSError, data: EnhancedMonitoringOutput) -> Unit = definedExternally): Request<EnhancedMonitoringOutput, AWSError>
    open fun enableEnhancedMonitoring(callback: (err: AWSError, data: EnhancedMonitoringOutput) -> Unit = definedExternally): Request<EnhancedMonitoringOutput, AWSError>
    open fun getRecords(params: GetRecordsInput, callback: (err: AWSError, data: GetRecordsOutput) -> Unit = definedExternally): Request<GetRecordsOutput, AWSError>
    open fun getRecords(callback: (err: AWSError, data: GetRecordsOutput) -> Unit = definedExternally): Request<GetRecordsOutput, AWSError>
    open fun getShardIterator(params: GetShardIteratorInput, callback: (err: AWSError, data: GetShardIteratorOutput) -> Unit = definedExternally): Request<GetShardIteratorOutput, AWSError>
    open fun getShardIterator(callback: (err: AWSError, data: GetShardIteratorOutput) -> Unit = definedExternally): Request<GetShardIteratorOutput, AWSError>
    open fun increaseStreamRetentionPeriod(params: IncreaseStreamRetentionPeriodInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun increaseStreamRetentionPeriod(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun listShards(params: ListShardsInput, callback: (err: AWSError, data: ListShardsOutput) -> Unit = definedExternally): Request<ListShardsOutput, AWSError>
    open fun listShards(callback: (err: AWSError, data: ListShardsOutput) -> Unit = definedExternally): Request<ListShardsOutput, AWSError>
    open fun listStreamConsumers(params: ListStreamConsumersInput, callback: (err: AWSError, data: ListStreamConsumersOutput) -> Unit = definedExternally): Request<ListStreamConsumersOutput, AWSError>
    open fun listStreamConsumers(callback: (err: AWSError, data: ListStreamConsumersOutput) -> Unit = definedExternally): Request<ListStreamConsumersOutput, AWSError>
    open fun listStreams(params: ListStreamsInput, callback: (err: AWSError, data: ListStreamsOutput) -> Unit = definedExternally): Request<ListStreamsOutput, AWSError>
    open fun listStreams(callback: (err: AWSError, data: ListStreamsOutput) -> Unit = definedExternally): Request<ListStreamsOutput, AWSError>
    open fun listTagsForStream(params: ListTagsForStreamInput, callback: (err: AWSError, data: ListTagsForStreamOutput) -> Unit = definedExternally): Request<ListTagsForStreamOutput, AWSError>
    open fun listTagsForStream(callback: (err: AWSError, data: ListTagsForStreamOutput) -> Unit = definedExternally): Request<ListTagsForStreamOutput, AWSError>
    open fun mergeShards(params: MergeShardsInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun mergeShards(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putRecord(params: PutRecordInput, callback: (err: AWSError, data: PutRecordOutput) -> Unit = definedExternally): Request<PutRecordOutput, AWSError>
    open fun putRecord(callback: (err: AWSError, data: PutRecordOutput) -> Unit = definedExternally): Request<PutRecordOutput, AWSError>
    open fun putRecords(params: PutRecordsInput, callback: (err: AWSError, data: PutRecordsOutput) -> Unit = definedExternally): Request<PutRecordsOutput, AWSError>
    open fun putRecords(callback: (err: AWSError, data: PutRecordsOutput) -> Unit = definedExternally): Request<PutRecordsOutput, AWSError>
    open fun registerStreamConsumer(params: RegisterStreamConsumerInput, callback: (err: AWSError, data: RegisterStreamConsumerOutput) -> Unit = definedExternally): Request<RegisterStreamConsumerOutput, AWSError>
    open fun registerStreamConsumer(callback: (err: AWSError, data: RegisterStreamConsumerOutput) -> Unit = definedExternally): Request<RegisterStreamConsumerOutput, AWSError>
    open fun removeTagsFromStream(params: RemoveTagsFromStreamInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeTagsFromStream(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun splitShard(params: SplitShardInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun splitShard(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startStreamEncryption(params: StartStreamEncryptionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun startStreamEncryption(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopStreamEncryption(params: StopStreamEncryptionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopStreamEncryption(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateShardCount(params: UpdateShardCountInput, callback: (err: AWSError, data: UpdateShardCountOutput) -> Unit = definedExternally): Request<UpdateShardCountOutput, AWSError>
    open fun updateShardCount(callback: (err: AWSError, data: UpdateShardCountOutput) -> Unit = definedExternally): Request<UpdateShardCountOutput, AWSError>
    open fun waitFor(state: String, params: DescribeStreamInput, callback: (err: AWSError, data: DescribeStreamOutput) -> Unit = definedExternally): Request<DescribeStreamOutput, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeStreamOutput) -> Unit = definedExternally): Request<DescribeStreamOutput, AWSError>
    interface AddTagsToStreamInput {
        var StreamName: StreamName
        var Tags: TagMap
    }
    interface Consumer {
        var ConsumerName: ConsumerName
        var ConsumerARN: ConsumerARN
        var ConsumerStatus: String /* "CREATING" | "DELETING" | "ACTIVE" | String */
        var ConsumerCreationTimestamp: Timestamp
    }
    interface ConsumerDescription {
        var ConsumerName: ConsumerName
        var ConsumerARN: ConsumerARN
        var ConsumerStatus: String /* "CREATING" | "DELETING" | "ACTIVE" | String */
        var ConsumerCreationTimestamp: Timestamp
        var StreamARN: StreamARN
    }
    interface CreateStreamInput {
        var StreamName: StreamName
        var ShardCount: PositiveIntegerObject
    }
    interface DecreaseStreamRetentionPeriodInput {
        var StreamName: StreamName
        var RetentionPeriodHours: RetentionPeriodHours
    }
    interface DeleteStreamInput {
        var StreamName: StreamName
        var EnforceConsumerDeletion: BooleanObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterStreamConsumerInput {
        var StreamARN: StreamARN?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumerName: ConsumerName?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumerARN: ConsumerARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLimitsInput
    interface DescribeLimitsOutput {
        var ShardLimit: ShardCountObject
        var OpenShardCount: ShardCountObject
    }
    interface DescribeStreamConsumerInput {
        var StreamARN: StreamARN?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumerName: ConsumerName?
            get() = definedExternally
            set(value) = definedExternally
        var ConsumerARN: ConsumerARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStreamConsumerOutput {
        var ConsumerDescription: ConsumerDescription
    }
    interface DescribeStreamInput {
        var StreamName: StreamName
        var Limit: DescribeStreamInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var ExclusiveStartShardId: ShardId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStreamOutput {
        var StreamDescription: StreamDescription
    }
    interface DescribeStreamSummaryInput {
        var StreamName: StreamName
    }
    interface DescribeStreamSummaryOutput {
        var StreamDescriptionSummary: StreamDescriptionSummary
    }
    interface DisableEnhancedMonitoringInput {
        var StreamName: StreamName
        var ShardLevelMetrics: MetricsNameList
    }
    interface EnableEnhancedMonitoringInput {
        var StreamName: StreamName
        var ShardLevelMetrics: MetricsNameList
    }
    interface EnhancedMetrics {
        var ShardLevelMetrics: MetricsNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnhancedMonitoringOutput {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentShardLevelMetrics: MetricsNameList?
            get() = definedExternally
            set(value) = definedExternally
        var DesiredShardLevelMetrics: MetricsNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecordsInput {
        var ShardIterator: ShardIterator
        var Limit: GetRecordsInputLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecordsOutput {
        var Records: RecordList
        var NextShardIterator: ShardIterator?
            get() = definedExternally
            set(value) = definedExternally
        var MillisBehindLatest: MillisBehindLatest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetShardIteratorInput {
        var StreamName: StreamName
        var ShardId: ShardId
        var ShardIteratorType: String /* "AT_SEQUENCE_NUMBER" | "AFTER_SEQUENCE_NUMBER" | "TRIM_HORIZON" | "LATEST" | "AT_TIMESTAMP" | String */
        var StartingSequenceNumber: SequenceNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Timestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetShardIteratorOutput {
        var ShardIterator: ShardIterator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HashKeyRange {
        var StartingHashKey: HashKey
        var EndingHashKey: HashKey
    }
    interface IncreaseStreamRetentionPeriodInput {
        var StreamName: StreamName
        var RetentionPeriodHours: RetentionPeriodHours
    }
    interface ListShardsInput {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var ExclusiveStartShardId: ShardId?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ListShardsInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var StreamCreationTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListShardsOutput {
        var Shards: ShardList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamConsumersInput {
        var StreamARN: StreamARN
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ListStreamConsumersInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var StreamCreationTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamConsumersOutput {
        var Consumers: ConsumerList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamsInput {
        var Limit: ListStreamsInputLimit?
            get() = definedExternally
            set(value) = definedExternally
        var ExclusiveStartStreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamsOutput {
        var StreamNames: StreamNameList
        var HasMoreStreams: BooleanObject
    }
    interface ListTagsForStreamInput {
        var StreamName: StreamName
        var ExclusiveStartTagKey: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: ListTagsForStreamInputLimit?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForStreamOutput {
        var Tags: TagList
        var HasMoreTags: BooleanObject
    }
    interface MergeShardsInput {
        var StreamName: StreamName
        var ShardToMerge: ShardId
        var AdjacentShardToMerge: ShardId
    }
    interface PutRecordInput {
        var StreamName: StreamName
        var Data: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var PartitionKey: PartitionKey
        var ExplicitHashKey: HashKey?
            get() = definedExternally
            set(value) = definedExternally
        var SequenceNumberForOrdering: SequenceNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutRecordOutput {
        var ShardId: ShardId
        var SequenceNumber: SequenceNumber
        var EncryptionType: String /* "NONE" | "KMS" | String */
    }
    interface PutRecordsInput {
        var Records: PutRecordsRequestEntryList
        var StreamName: StreamName
    }
    interface PutRecordsOutput {
        var FailedRecordCount: PositiveIntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var Records: PutRecordsResultEntryList
        var EncryptionType: String /* "NONE" | "KMS" | String */
    }
    interface PutRecordsRequestEntry {
        var Data: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var ExplicitHashKey: HashKey?
            get() = definedExternally
            set(value) = definedExternally
        var PartitionKey: PartitionKey
    }
    interface PutRecordsResultEntry {
        var SequenceNumber: SequenceNumber?
            get() = definedExternally
            set(value) = definedExternally
        var ShardId: ShardId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Record {
        var SequenceNumber: SequenceNumber
        var ApproximateArrivalTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Data: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var PartitionKey: PartitionKey
        var EncryptionType: String /* "NONE" | "KMS" | String */
    }
    interface RegisterStreamConsumerInput {
        var StreamARN: StreamARN
        var ConsumerName: ConsumerName
    }
    interface RegisterStreamConsumerOutput {
        var Consumer: Consumer
    }
    interface RemoveTagsFromStreamInput {
        var StreamName: StreamName
        var TagKeys: TagKeyList
    }
    interface SequenceNumberRange {
        var StartingSequenceNumber: SequenceNumber
        var EndingSequenceNumber: SequenceNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Shard {
        var ShardId: ShardId
        var ParentShardId: ShardId?
            get() = definedExternally
            set(value) = definedExternally
        var AdjacentParentShardId: ShardId?
            get() = definedExternally
            set(value) = definedExternally
        var HashKeyRange: HashKeyRange
        var SequenceNumberRange: SequenceNumberRange
    }
    interface SplitShardInput {
        var StreamName: StreamName
        var ShardToSplit: ShardId
        var NewStartingHashKey: HashKey
    }
    interface StartStreamEncryptionInput {
        var StreamName: StreamName
        var EncryptionType: String /* "NONE" | "KMS" | String */
        var KeyId: KeyId
    }
    interface StopStreamEncryptionInput {
        var StreamName: StreamName
        var EncryptionType: String /* "NONE" | "KMS" | String */
        var KeyId: KeyId
    }
    interface StreamDescription {
        var StreamName: StreamName
        var StreamARN: StreamARN
        var StreamStatus: String /* "CREATING" | "DELETING" | "ACTIVE" | "UPDATING" | String */
        var Shards: ShardList
        var HasMoreShards: BooleanObject
        var RetentionPeriodHours: RetentionPeriodHours
        var StreamCreationTimestamp: Timestamp
        var EnhancedMonitoring: EnhancedMonitoringList
        var EncryptionType: String /* "NONE" | "KMS" | String */
        var KeyId: KeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamDescriptionSummary {
        var StreamName: StreamName
        var StreamARN: StreamARN
        var StreamStatus: String /* "CREATING" | "DELETING" | "ACTIVE" | "UPDATING" | String */
        var RetentionPeriodHours: PositiveIntegerObject
        var StreamCreationTimestamp: Timestamp
        var EnhancedMonitoring: EnhancedMonitoringList
        var EncryptionType: String /* "NONE" | "KMS" | String */
        var KeyId: KeyId?
            get() = definedExternally
            set(value) = definedExternally
        var OpenShardCount: ShardCountObject
        var ConsumerCount: ConsumerCountObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface UpdateShardCountInput {
        var StreamName: StreamName
        var TargetShardCount: PositiveIntegerObject
        var ScalingType: String /* "UNIFORM_SCALING" | String */
    }
    interface UpdateShardCountOutput {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentShardCount: PositiveIntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var TargetShardCount: PositiveIntegerObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2013-12-02" | "latest" | String */
    }
}