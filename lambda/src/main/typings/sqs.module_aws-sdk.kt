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
import SQS.BatchResultErrorEntry
import SQS.ChangeMessageVisibilityBatchRequestEntry
import SQS.ChangeMessageVisibilityBatchResultEntry
import SQS.DeleteMessageBatchRequestEntry
import SQS.DeleteMessageBatchResultEntry
import SQS.Message
import SQS.SendMessageBatchRequestEntry
import SQS.SendMessageBatchResultEntry
import SQS.AddPermissionRequest
import SQS.ChangeMessageVisibilityRequest
import SQS.ChangeMessageVisibilityBatchRequest
import SQS.ChangeMessageVisibilityBatchResult
import SQS.CreateQueueRequest
import SQS.CreateQueueResult
import SQS.DeleteMessageRequest
import SQS.DeleteMessageBatchRequest
import SQS.DeleteMessageBatchResult
import SQS.DeleteQueueRequest
import SQS.GetQueueAttributesRequest
import SQS.GetQueueAttributesResult
import SQS.GetQueueUrlRequest
import SQS.GetQueueUrlResult
import SQS.ListDeadLetterSourceQueuesRequest
import SQS.ListDeadLetterSourceQueuesResult
import SQS.ListQueueTagsRequest
import SQS.ListQueueTagsResult
import SQS.ListQueuesRequest
import SQS.ListQueuesResult
import SQS.PurgeQueueRequest
import SQS.ReceiveMessageRequest
import SQS.ReceiveMessageResult
import SQS.RemovePermissionRequest
import SQS.SendMessageRequest
import SQS.SendMessageResult
import SQS.SendMessageBatchRequest
import SQS.SendMessageBatchResult
import SQS.SetQueueAttributesRequest
import SQS.TagQueueRequest
import SQS.UntagQueueRequest
import SQS.QueueAttributeMap
import SQS.TagMap
import SQS.MessageSystemAttributeMap
import SQS.MessageBodyAttributeMap
import SQS.MessageAttributeValue
import SQS.MessageSystemAttributeValue
import SQS.MessageBodySystemAttributeMap

typealias AWSAccountIdList = Array<String>

typealias ActionNameList = Array<String>

typealias AttributeNameList = Array<String /* "All" | "Policy" | "VisibilityTimeout" | "MaximumMessageSize" | "MessageRetentionPeriod" | "ApproximateNumberOfMessages" | "ApproximateNumberOfMessagesNotVisible" | "CreatedTimestamp" | "LastModifiedTimestamp" | "QueueArn" | "ApproximateNumberOfMessagesDelayed" | "DelaySeconds" | "ReceiveMessageWaitTimeSeconds" | "RedrivePolicy" | "FifoQueue" | "ContentBasedDeduplication" | "KmsMasterKeyId" | "KmsDataKeyReusePeriodSeconds" | String */>

typealias BatchResultErrorEntryList = Array<BatchResultErrorEntry>

typealias BinaryList = Array<dynamic /* Buffer | Uint8Array | Blob | String */>

typealias Boolean = Boolean

typealias ChangeMessageVisibilityBatchRequestEntryList = Array<ChangeMessageVisibilityBatchRequestEntry>

typealias ChangeMessageVisibilityBatchResultEntryList = Array<ChangeMessageVisibilityBatchResultEntry>

typealias DeleteMessageBatchRequestEntryList = Array<DeleteMessageBatchRequestEntry>

typealias DeleteMessageBatchResultEntryList = Array<DeleteMessageBatchResultEntry>

typealias Integer = Number

typealias MessageAttributeName = String

typealias MessageAttributeNameList = Array<MessageAttributeName>

typealias MessageList = Array<Message>

typealias QueueUrlList = Array<String>

typealias SendMessageBatchRequestEntryList = Array<SendMessageBatchRequestEntry>

typealias SendMessageBatchResultEntryList = Array<SendMessageBatchResultEntry>

typealias String = String

typealias StringList = Array<String>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

@JsModule("aws-sdk")
external open class SQS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SQS.Types.ClientConfiguration */
    open fun addPermission(params: AddPermissionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addPermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun changeMessageVisibility(params: ChangeMessageVisibilityRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun changeMessageVisibility(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun changeMessageVisibilityBatch(params: ChangeMessageVisibilityBatchRequest, callback: (err: AWSError, data: ChangeMessageVisibilityBatchResult) -> Unit = definedExternally): Request<ChangeMessageVisibilityBatchResult, AWSError>
    open fun changeMessageVisibilityBatch(callback: (err: AWSError, data: ChangeMessageVisibilityBatchResult) -> Unit = definedExternally): Request<ChangeMessageVisibilityBatchResult, AWSError>
    open fun createQueue(params: CreateQueueRequest, callback: (err: AWSError, data: CreateQueueResult) -> Unit = definedExternally): Request<CreateQueueResult, AWSError>
    open fun createQueue(callback: (err: AWSError, data: CreateQueueResult) -> Unit = definedExternally): Request<CreateQueueResult, AWSError>
    open fun deleteMessage(params: DeleteMessageRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMessage(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMessageBatch(params: DeleteMessageBatchRequest, callback: (err: AWSError, data: DeleteMessageBatchResult) -> Unit = definedExternally): Request<DeleteMessageBatchResult, AWSError>
    open fun deleteMessageBatch(callback: (err: AWSError, data: DeleteMessageBatchResult) -> Unit = definedExternally): Request<DeleteMessageBatchResult, AWSError>
    open fun deleteQueue(params: DeleteQueueRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteQueue(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getQueueAttributes(params: GetQueueAttributesRequest, callback: (err: AWSError, data: GetQueueAttributesResult) -> Unit = definedExternally): Request<GetQueueAttributesResult, AWSError>
    open fun getQueueAttributes(callback: (err: AWSError, data: GetQueueAttributesResult) -> Unit = definedExternally): Request<GetQueueAttributesResult, AWSError>
    open fun getQueueUrl(params: GetQueueUrlRequest, callback: (err: AWSError, data: GetQueueUrlResult) -> Unit = definedExternally): Request<GetQueueUrlResult, AWSError>
    open fun getQueueUrl(callback: (err: AWSError, data: GetQueueUrlResult) -> Unit = definedExternally): Request<GetQueueUrlResult, AWSError>
    open fun listDeadLetterSourceQueues(params: ListDeadLetterSourceQueuesRequest, callback: (err: AWSError, data: ListDeadLetterSourceQueuesResult) -> Unit = definedExternally): Request<ListDeadLetterSourceQueuesResult, AWSError>
    open fun listDeadLetterSourceQueues(callback: (err: AWSError, data: ListDeadLetterSourceQueuesResult) -> Unit = definedExternally): Request<ListDeadLetterSourceQueuesResult, AWSError>
    open fun listQueueTags(params: ListQueueTagsRequest, callback: (err: AWSError, data: ListQueueTagsResult) -> Unit = definedExternally): Request<ListQueueTagsResult, AWSError>
    open fun listQueueTags(callback: (err: AWSError, data: ListQueueTagsResult) -> Unit = definedExternally): Request<ListQueueTagsResult, AWSError>
    open fun listQueues(params: ListQueuesRequest, callback: (err: AWSError, data: ListQueuesResult) -> Unit = definedExternally): Request<ListQueuesResult, AWSError>
    open fun listQueues(callback: (err: AWSError, data: ListQueuesResult) -> Unit = definedExternally): Request<ListQueuesResult, AWSError>
    open fun purgeQueue(params: PurgeQueueRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun purgeQueue(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun receiveMessage(params: ReceiveMessageRequest, callback: (err: AWSError, data: ReceiveMessageResult) -> Unit = definedExternally): Request<ReceiveMessageResult, AWSError>
    open fun receiveMessage(callback: (err: AWSError, data: ReceiveMessageResult) -> Unit = definedExternally): Request<ReceiveMessageResult, AWSError>
    open fun removePermission(params: RemovePermissionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removePermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun sendMessage(params: SendMessageRequest, callback: (err: AWSError, data: SendMessageResult) -> Unit = definedExternally): Request<SendMessageResult, AWSError>
    open fun sendMessage(callback: (err: AWSError, data: SendMessageResult) -> Unit = definedExternally): Request<SendMessageResult, AWSError>
    open fun sendMessageBatch(params: SendMessageBatchRequest, callback: (err: AWSError, data: SendMessageBatchResult) -> Unit = definedExternally): Request<SendMessageBatchResult, AWSError>
    open fun sendMessageBatch(callback: (err: AWSError, data: SendMessageBatchResult) -> Unit = definedExternally): Request<SendMessageBatchResult, AWSError>
    open fun setQueueAttributes(params: SetQueueAttributesRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setQueueAttributes(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagQueue(params: TagQueueRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagQueue(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagQueue(params: UntagQueueRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagQueue(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface AddPermissionRequest {
        var QueueUrl: String
        var Label: String
        var AWSAccountIds: AWSAccountIdList
        var Actions: ActionNameList
    }
    interface BatchResultErrorEntry {
        var Id: String
        var SenderFault: Boolean
        var Code: String
        var Message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChangeMessageVisibilityBatchRequest {
        var QueueUrl: String
        var Entries: ChangeMessageVisibilityBatchRequestEntryList
    }
    interface ChangeMessageVisibilityBatchRequestEntry {
        var Id: String
        var ReceiptHandle: String
        var VisibilityTimeout: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChangeMessageVisibilityBatchResult {
        var Successful: ChangeMessageVisibilityBatchResultEntryList
        var Failed: BatchResultErrorEntryList
    }
    interface ChangeMessageVisibilityBatchResultEntry {
        var Id: String
    }
    interface ChangeMessageVisibilityRequest {
        var QueueUrl: String
        var ReceiptHandle: String
        var VisibilityTimeout: Integer
    }
    interface CreateQueueRequest {
        var QueueName: String
        var Attributes: QueueAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateQueueResult {
        var QueueUrl: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteMessageBatchRequest {
        var QueueUrl: String
        var Entries: DeleteMessageBatchRequestEntryList
    }
    interface DeleteMessageBatchRequestEntry {
        var Id: String
        var ReceiptHandle: String
    }
    interface DeleteMessageBatchResult {
        var Successful: DeleteMessageBatchResultEntryList
        var Failed: BatchResultErrorEntryList
    }
    interface DeleteMessageBatchResultEntry {
        var Id: String
    }
    interface DeleteMessageRequest {
        var QueueUrl: String
        var ReceiptHandle: String
    }
    interface DeleteQueueRequest {
        var QueueUrl: String
    }
    interface GetQueueAttributesRequest {
        var QueueUrl: String
        var AttributeNames: AttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQueueAttributesResult {
        var Attributes: QueueAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQueueUrlRequest {
        var QueueName: String
        var QueueOwnerAWSAccountId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQueueUrlResult {
        var QueueUrl: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeadLetterSourceQueuesRequest {
        var QueueUrl: String
    }
    interface ListDeadLetterSourceQueuesResult {
        var queueUrls: QueueUrlList
    }
    interface ListQueueTagsRequest {
        var QueueUrl: String
    }
    interface ListQueueTagsResult {
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQueuesRequest {
        var QueueNamePrefix: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQueuesResult {
        var QueueUrls: QueueUrlList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Message {
        var MessageId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReceiptHandle: String?
            get() = definedExternally
            set(value) = definedExternally
        var MD5OfBody: String?
            get() = definedExternally
            set(value) = definedExternally
        var Body: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: MessageSystemAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var MD5OfMessageAttributes: String?
            get() = definedExternally
            set(value) = definedExternally
        var MessageAttributes: MessageBodyAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MessageAttributeValue {
        var StringValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var BinaryValue: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var StringListValues: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var BinaryListValues: BinaryList?
            get() = definedExternally
            set(value) = definedExternally
        var DataType: String
    }
    interface MessageBodyAttributeMap {
        @nativeGetter
        operator fun get(key: String): MessageAttributeValue?
        @nativeSetter
        operator fun set(key: String, value: MessageAttributeValue)
    }
    interface MessageBodySystemAttributeMap {
        @nativeGetter
        operator fun get(key: String): MessageSystemAttributeValue?
        @nativeSetter
        operator fun set(key: String, value: MessageSystemAttributeValue)
    }
    interface MessageSystemAttributeMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface MessageSystemAttributeValue {
        var StringValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var BinaryValue: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var StringListValues: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var BinaryListValues: BinaryList?
            get() = definedExternally
            set(value) = definedExternally
        var DataType: String
    }
    interface PurgeQueueRequest {
        var QueueUrl: String
    }
    interface QueueAttributeMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface ReceiveMessageRequest {
        var QueueUrl: String
        var AttributeNames: AttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
        var MessageAttributeNames: MessageAttributeNameList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxNumberOfMessages: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var VisibilityTimeout: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var WaitTimeSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var ReceiveRequestAttemptId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReceiveMessageResult {
        var Messages: MessageList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemovePermissionRequest {
        var QueueUrl: String
        var Label: String
    }
    interface SendMessageBatchRequest {
        var QueueUrl: String
        var Entries: SendMessageBatchRequestEntryList
    }
    interface SendMessageBatchRequestEntry {
        var Id: String
        var MessageBody: String
        var DelaySeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var MessageAttributes: MessageBodyAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var MessageSystemAttributes: MessageBodySystemAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var MessageDeduplicationId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MessageGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendMessageBatchResult {
        var Successful: SendMessageBatchResultEntryList
        var Failed: BatchResultErrorEntryList
    }
    interface SendMessageBatchResultEntry {
        var Id: String
        var MessageId: String
        var MD5OfMessageBody: String
        var MD5OfMessageAttributes: String?
            get() = definedExternally
            set(value) = definedExternally
        var MD5OfMessageSystemAttributes: String?
            get() = definedExternally
            set(value) = definedExternally
        var SequenceNumber: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendMessageRequest {
        var QueueUrl: String
        var MessageBody: String
        var DelaySeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var MessageAttributes: MessageBodyAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var MessageSystemAttributes: MessageBodySystemAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var MessageDeduplicationId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MessageGroupId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendMessageResult {
        var MD5OfMessageBody: String?
            get() = definedExternally
            set(value) = definedExternally
        var MD5OfMessageAttributes: String?
            get() = definedExternally
            set(value) = definedExternally
        var MD5OfMessageSystemAttributes: String?
            get() = definedExternally
            set(value) = definedExternally
        var MessageId: String?
            get() = definedExternally
            set(value) = definedExternally
        var SequenceNumber: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetQueueAttributesRequest {
        var QueueUrl: String
        var Attributes: QueueAttributeMap
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagQueueRequest {
        var QueueUrl: String
        var Tags: TagMap
    }
    interface UntagQueueRequest {
        var QueueUrl: String
        var TagKeys: TagKeyList
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2012-11-05" | "latest" | String */
    }
}