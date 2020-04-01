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
import DynamoDBStreams.KeySchemaElement
import DynamoDBStreams.AttributeValue
import DynamoDBStreams.Record
import DynamoDBStreams.Shard
import DynamoDBStreams.Stream
import DynamoDBStreams.DescribeStreamInput
import DynamoDBStreams.DescribeStreamOutput
import DynamoDBStreams.GetRecordsInput
import DynamoDBStreams.GetRecordsOutput
import DynamoDBStreams.GetShardIteratorInput
import DynamoDBStreams.GetShardIteratorOutput
import DynamoDBStreams.ListStreamsInput
import DynamoDBStreams.ListStreamsOutput
import DynamoDBStreams.MapAttributeValue
import DynamoDBStreams.StreamDescription
import DynamoDBStreams.StreamRecord
import DynamoDBStreams.Identity
import DynamoDBStreams.SequenceNumberRange
import DynamoDBStreams.AttributeMap

typealias AttributeName = String

typealias BinarySetAttributeValue = Array<dynamic /* Buffer | Uint8Array | Blob | String */>

typealias BooleanAttributeValue = Boolean

typealias _Date = Date

typealias KeySchema = Array<KeySchemaElement>

typealias KeySchemaAttributeName = String

typealias ListAttributeValue = Array<AttributeValue>

typealias NullAttributeValue = Boolean

typealias NumberAttributeValue = String

typealias NumberSetAttributeValue = Array<NumberAttributeValue>

typealias PositiveIntegerObject = Number

typealias PositiveLongObject = Number

typealias RecordList = Array<Record>

typealias SequenceNumber = String

typealias ShardDescriptionList = Array<Shard>

typealias ShardId = String

typealias ShardIterator = String

typealias StreamArn = String

typealias StreamList = Array<Stream>

typealias String = String

typealias StringAttributeValue = String

typealias StringSetAttributeValue = Array<StringAttributeValue>

typealias TableName = String

@JsModule("aws-sdk")
external open class DynamoDBStreams(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DynamoDBStreams.Types.ClientConfiguration */
    open fun describeStream(params: DescribeStreamInput, callback: (err: AWSError, data: DescribeStreamOutput) -> Unit = definedExternally): Request<DescribeStreamOutput, AWSError>
    open fun describeStream(callback: (err: AWSError, data: DescribeStreamOutput) -> Unit = definedExternally): Request<DescribeStreamOutput, AWSError>
    open fun getRecords(params: GetRecordsInput, callback: (err: AWSError, data: GetRecordsOutput) -> Unit = definedExternally): Request<GetRecordsOutput, AWSError>
    open fun getRecords(callback: (err: AWSError, data: GetRecordsOutput) -> Unit = definedExternally): Request<GetRecordsOutput, AWSError>
    open fun getShardIterator(params: GetShardIteratorInput, callback: (err: AWSError, data: GetShardIteratorOutput) -> Unit = definedExternally): Request<GetShardIteratorOutput, AWSError>
    open fun getShardIterator(callback: (err: AWSError, data: GetShardIteratorOutput) -> Unit = definedExternally): Request<GetShardIteratorOutput, AWSError>
    open fun listStreams(params: ListStreamsInput, callback: (err: AWSError, data: ListStreamsOutput) -> Unit = definedExternally): Request<ListStreamsOutput, AWSError>
    open fun listStreams(callback: (err: AWSError, data: ListStreamsOutput) -> Unit = definedExternally): Request<ListStreamsOutput, AWSError>
    interface AttributeMap {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface AttributeValue {
        var S: StringAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var N: NumberAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var B: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var SS: StringSetAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var NS: NumberSetAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var BS: BinarySetAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var M: MapAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var L: ListAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var NULL: NullAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var BOOL: BooleanAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStreamInput {
        var StreamArn: StreamArn
        var Limit: PositiveIntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var ExclusiveStartShardId: ShardId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStreamOutput {
        var StreamDescription: StreamDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecordsInput {
        var ShardIterator: ShardIterator
        var Limit: PositiveIntegerObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRecordsOutput {
        var Records: RecordList?
            get() = definedExternally
            set(value) = definedExternally
        var NextShardIterator: ShardIterator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetShardIteratorInput {
        var StreamArn: StreamArn
        var ShardId: ShardId
        var ShardIteratorType: String /* "TRIM_HORIZON" | "LATEST" | "AT_SEQUENCE_NUMBER" | "AFTER_SEQUENCE_NUMBER" | String */
        var SequenceNumber: SequenceNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetShardIteratorOutput {
        var ShardIterator: ShardIterator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Identity {
        var PrincipalId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeySchemaElement {
        var AttributeName: KeySchemaAttributeName
        var KeyType: String /* "HASH" | "RANGE" | String */
    }
    interface ListStreamsInput {
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: PositiveIntegerObject?
            get() = definedExternally
            set(value) = definedExternally
        var ExclusiveStartStreamArn: StreamArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStreamsOutput {
        var Streams: StreamList?
            get() = definedExternally
            set(value) = definedExternally
        var LastEvaluatedStreamArn: StreamArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MapAttributeValue {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface Record {
        var eventID: String?
            get() = definedExternally
            set(value) = definedExternally
        var eventName: String /* "INSERT" | "MODIFY" | "REMOVE" | String */
        var eventVersion: String?
            get() = definedExternally
            set(value) = definedExternally
        var eventSource: String?
            get() = definedExternally
            set(value) = definedExternally
        var awsRegion: String?
            get() = definedExternally
            set(value) = definedExternally
        var dynamodb: StreamRecord?
            get() = definedExternally
            set(value) = definedExternally
        var userIdentity: Identity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SequenceNumberRange {
        var StartingSequenceNumber: SequenceNumber?
            get() = definedExternally
            set(value) = definedExternally
        var EndingSequenceNumber: SequenceNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Shard {
        var ShardId: ShardId?
            get() = definedExternally
            set(value) = definedExternally
        var SequenceNumberRange: SequenceNumberRange?
            get() = definedExternally
            set(value) = definedExternally
        var ParentShardId: ShardId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Stream {
        var StreamArn: StreamArn?
            get() = definedExternally
            set(value) = definedExternally
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var StreamLabel: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamDescription {
        var StreamArn: StreamArn?
            get() = definedExternally
            set(value) = definedExternally
        var StreamLabel: String?
            get() = definedExternally
            set(value) = definedExternally
        var StreamStatus: String /* "ENABLING" | "ENABLED" | "DISABLING" | "DISABLED" | String */
        var StreamViewType: String /* "NEW_IMAGE" | "OLD_IMAGE" | "NEW_AND_OLD_IMAGES" | "KEYS_ONLY" | String */
        var CreationRequestDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var TableName: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var KeySchema: KeySchema?
            get() = definedExternally
            set(value) = definedExternally
        var Shards: ShardDescriptionList?
            get() = definedExternally
            set(value) = definedExternally
        var LastEvaluatedShardId: ShardId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamRecord {
        var ApproximateCreationDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var Keys: AttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var NewImage: AttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var OldImage: AttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var SequenceNumber: SequenceNumber?
            get() = definedExternally
            set(value) = definedExternally
        var SizeBytes: PositiveLongObject?
            get() = definedExternally
            set(value) = definedExternally
        var StreamViewType: String /* "NEW_IMAGE" | "OLD_IMAGE" | "NEW_AND_OLD_IMAGES" | "KEYS_ONLY" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2012-08-10" | "latest" | String */
    }
}