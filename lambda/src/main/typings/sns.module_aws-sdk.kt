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
import SNS.Endpoint
import SNS.PlatformApplication
import SNS.Subscription
import SNS.Tag
import SNS.Topic
import SNS.AddPermissionInput
import SNS.CheckIfPhoneNumberIsOptedOutInput
import SNS.CheckIfPhoneNumberIsOptedOutResponse
import SNS.ConfirmSubscriptionInput
import SNS.ConfirmSubscriptionResponse
import SNS.CreatePlatformApplicationInput
import SNS.CreatePlatformApplicationResponse
import SNS.CreatePlatformEndpointInput
import SNS.CreateEndpointResponse
import SNS.CreateTopicInput
import SNS.CreateTopicResponse
import SNS.DeleteEndpointInput
import SNS.DeletePlatformApplicationInput
import SNS.DeleteTopicInput
import SNS.GetEndpointAttributesInput
import SNS.GetEndpointAttributesResponse
import SNS.GetPlatformApplicationAttributesInput
import SNS.GetPlatformApplicationAttributesResponse
import SNS.GetSMSAttributesInput
import SNS.GetSMSAttributesResponse
import SNS.GetSubscriptionAttributesInput
import SNS.GetSubscriptionAttributesResponse
import SNS.GetTopicAttributesInput
import SNS.GetTopicAttributesResponse
import SNS.ListEndpointsByPlatformApplicationInput
import SNS.ListEndpointsByPlatformApplicationResponse
import SNS.ListPhoneNumbersOptedOutInput
import SNS.ListPhoneNumbersOptedOutResponse
import SNS.ListPlatformApplicationsInput
import SNS.ListPlatformApplicationsResponse
import SNS.ListSubscriptionsInput
import SNS.ListSubscriptionsResponse
import SNS.ListSubscriptionsByTopicInput
import SNS.ListSubscriptionsByTopicResponse
import SNS.ListTagsForResourceRequest
import SNS.ListTagsForResourceResponse
import SNS.ListTopicsInput
import SNS.ListTopicsResponse
import SNS.OptInPhoneNumberInput
import SNS.OptInPhoneNumberResponse
import SNS.PublishInput
import SNS.PublishResponse
import SNS.RemovePermissionInput
import SNS.SetEndpointAttributesInput
import SNS.SetPlatformApplicationAttributesInput
import SNS.SetSMSAttributesInput
import SNS.SetSMSAttributesResponse
import SNS.SetSubscriptionAttributesInput
import SNS.SetTopicAttributesInput
import SNS.SubscribeInput
import SNS.SubscribeResponse
import SNS.TagResourceRequest
import SNS.TagResourceResponse
import SNS.UnsubscribeInput
import SNS.UntagResourceRequest
import SNS.UntagResourceResponse
import SNS.MapStringToString
import SNS.TopicAttributesMap
import SNS.SubscriptionAttributesMap
import SNS.MessageAttributeValue
import SNS.MessageAttributeMap

typealias ActionsList = Array<action>

typealias AmazonResourceName = String

typealias DelegatesList = Array<delegate>

typealias ListOfEndpoints = Array<Endpoint>

typealias ListOfPlatformApplications = Array<PlatformApplication>

typealias ListString = Array<String>

typealias PhoneNumber = String

typealias PhoneNumberList = Array<PhoneNumber>

typealias String = String

typealias SubscriptionsList = Array<Subscription>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TopicsList = Array<Topic>

typealias account = String

typealias action = String

typealias attributeName = String

typealias attributeValue = String

typealias authenticateOnUnsubscribe = String

typealias delegate = String

typealias endpoint = String

typealias label = String

typealias message = String

typealias messageId = String

typealias messageStructure = String

typealias nextToken = String

typealias protocol = String

typealias subject = String

typealias subscriptionARN = String

typealias token = String

typealias topicARN = String

typealias topicName = String

@JsModule("aws-sdk")
external open class SNS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SNS.Types.ClientConfiguration */
    open fun addPermission(params: AddPermissionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addPermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun checkIfPhoneNumberIsOptedOut(params: CheckIfPhoneNumberIsOptedOutInput, callback: (err: AWSError, data: CheckIfPhoneNumberIsOptedOutResponse) -> Unit = definedExternally): Request<CheckIfPhoneNumberIsOptedOutResponse, AWSError>
    open fun checkIfPhoneNumberIsOptedOut(callback: (err: AWSError, data: CheckIfPhoneNumberIsOptedOutResponse) -> Unit = definedExternally): Request<CheckIfPhoneNumberIsOptedOutResponse, AWSError>
    open fun confirmSubscription(params: ConfirmSubscriptionInput, callback: (err: AWSError, data: ConfirmSubscriptionResponse) -> Unit = definedExternally): Request<ConfirmSubscriptionResponse, AWSError>
    open fun confirmSubscription(callback: (err: AWSError, data: ConfirmSubscriptionResponse) -> Unit = definedExternally): Request<ConfirmSubscriptionResponse, AWSError>
    open fun createPlatformApplication(params: CreatePlatformApplicationInput, callback: (err: AWSError, data: CreatePlatformApplicationResponse) -> Unit = definedExternally): Request<CreatePlatformApplicationResponse, AWSError>
    open fun createPlatformApplication(callback: (err: AWSError, data: CreatePlatformApplicationResponse) -> Unit = definedExternally): Request<CreatePlatformApplicationResponse, AWSError>
    open fun createPlatformEndpoint(params: CreatePlatformEndpointInput, callback: (err: AWSError, data: CreateEndpointResponse) -> Unit = definedExternally): Request<CreateEndpointResponse, AWSError>
    open fun createPlatformEndpoint(callback: (err: AWSError, data: CreateEndpointResponse) -> Unit = definedExternally): Request<CreateEndpointResponse, AWSError>
    open fun createTopic(params: CreateTopicInput, callback: (err: AWSError, data: CreateTopicResponse) -> Unit = definedExternally): Request<CreateTopicResponse, AWSError>
    open fun createTopic(callback: (err: AWSError, data: CreateTopicResponse) -> Unit = definedExternally): Request<CreateTopicResponse, AWSError>
    open fun deleteEndpoint(params: DeleteEndpointInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEndpoint(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePlatformApplication(params: DeletePlatformApplicationInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePlatformApplication(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTopic(params: DeleteTopicInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTopic(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getEndpointAttributes(params: GetEndpointAttributesInput, callback: (err: AWSError, data: GetEndpointAttributesResponse) -> Unit = definedExternally): Request<GetEndpointAttributesResponse, AWSError>
    open fun getEndpointAttributes(callback: (err: AWSError, data: GetEndpointAttributesResponse) -> Unit = definedExternally): Request<GetEndpointAttributesResponse, AWSError>
    open fun getPlatformApplicationAttributes(params: GetPlatformApplicationAttributesInput, callback: (err: AWSError, data: GetPlatformApplicationAttributesResponse) -> Unit = definedExternally): Request<GetPlatformApplicationAttributesResponse, AWSError>
    open fun getPlatformApplicationAttributes(callback: (err: AWSError, data: GetPlatformApplicationAttributesResponse) -> Unit = definedExternally): Request<GetPlatformApplicationAttributesResponse, AWSError>
    open fun getSMSAttributes(params: GetSMSAttributesInput, callback: (err: AWSError, data: GetSMSAttributesResponse) -> Unit = definedExternally): Request<GetSMSAttributesResponse, AWSError>
    open fun getSMSAttributes(callback: (err: AWSError, data: GetSMSAttributesResponse) -> Unit = definedExternally): Request<GetSMSAttributesResponse, AWSError>
    open fun getSubscriptionAttributes(params: GetSubscriptionAttributesInput, callback: (err: AWSError, data: GetSubscriptionAttributesResponse) -> Unit = definedExternally): Request<GetSubscriptionAttributesResponse, AWSError>
    open fun getSubscriptionAttributes(callback: (err: AWSError, data: GetSubscriptionAttributesResponse) -> Unit = definedExternally): Request<GetSubscriptionAttributesResponse, AWSError>
    open fun getTopicAttributes(params: GetTopicAttributesInput, callback: (err: AWSError, data: GetTopicAttributesResponse) -> Unit = definedExternally): Request<GetTopicAttributesResponse, AWSError>
    open fun getTopicAttributes(callback: (err: AWSError, data: GetTopicAttributesResponse) -> Unit = definedExternally): Request<GetTopicAttributesResponse, AWSError>
    open fun listEndpointsByPlatformApplication(params: ListEndpointsByPlatformApplicationInput, callback: (err: AWSError, data: ListEndpointsByPlatformApplicationResponse) -> Unit = definedExternally): Request<ListEndpointsByPlatformApplicationResponse, AWSError>
    open fun listEndpointsByPlatformApplication(callback: (err: AWSError, data: ListEndpointsByPlatformApplicationResponse) -> Unit = definedExternally): Request<ListEndpointsByPlatformApplicationResponse, AWSError>
    open fun listPhoneNumbersOptedOut(params: ListPhoneNumbersOptedOutInput, callback: (err: AWSError, data: ListPhoneNumbersOptedOutResponse) -> Unit = definedExternally): Request<ListPhoneNumbersOptedOutResponse, AWSError>
    open fun listPhoneNumbersOptedOut(callback: (err: AWSError, data: ListPhoneNumbersOptedOutResponse) -> Unit = definedExternally): Request<ListPhoneNumbersOptedOutResponse, AWSError>
    open fun listPlatformApplications(params: ListPlatformApplicationsInput, callback: (err: AWSError, data: ListPlatformApplicationsResponse) -> Unit = definedExternally): Request<ListPlatformApplicationsResponse, AWSError>
    open fun listPlatformApplications(callback: (err: AWSError, data: ListPlatformApplicationsResponse) -> Unit = definedExternally): Request<ListPlatformApplicationsResponse, AWSError>
    open fun listSubscriptions(params: ListSubscriptionsInput, callback: (err: AWSError, data: ListSubscriptionsResponse) -> Unit = definedExternally): Request<ListSubscriptionsResponse, AWSError>
    open fun listSubscriptions(callback: (err: AWSError, data: ListSubscriptionsResponse) -> Unit = definedExternally): Request<ListSubscriptionsResponse, AWSError>
    open fun listSubscriptionsByTopic(params: ListSubscriptionsByTopicInput, callback: (err: AWSError, data: ListSubscriptionsByTopicResponse) -> Unit = definedExternally): Request<ListSubscriptionsByTopicResponse, AWSError>
    open fun listSubscriptionsByTopic(callback: (err: AWSError, data: ListSubscriptionsByTopicResponse) -> Unit = definedExternally): Request<ListSubscriptionsByTopicResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTopics(params: ListTopicsInput, callback: (err: AWSError, data: ListTopicsResponse) -> Unit = definedExternally): Request<ListTopicsResponse, AWSError>
    open fun listTopics(callback: (err: AWSError, data: ListTopicsResponse) -> Unit = definedExternally): Request<ListTopicsResponse, AWSError>
    open fun optInPhoneNumber(params: OptInPhoneNumberInput, callback: (err: AWSError, data: OptInPhoneNumberResponse) -> Unit = definedExternally): Request<OptInPhoneNumberResponse, AWSError>
    open fun optInPhoneNumber(callback: (err: AWSError, data: OptInPhoneNumberResponse) -> Unit = definedExternally): Request<OptInPhoneNumberResponse, AWSError>
    open fun publish(params: PublishInput, callback: (err: AWSError, data: PublishResponse) -> Unit = definedExternally): Request<PublishResponse, AWSError>
    open fun publish(callback: (err: AWSError, data: PublishResponse) -> Unit = definedExternally): Request<PublishResponse, AWSError>
    open fun removePermission(params: RemovePermissionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removePermission(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setEndpointAttributes(params: SetEndpointAttributesInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setEndpointAttributes(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setPlatformApplicationAttributes(params: SetPlatformApplicationAttributesInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setPlatformApplicationAttributes(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setSMSAttributes(params: SetSMSAttributesInput, callback: (err: AWSError, data: SetSMSAttributesResponse) -> Unit = definedExternally): Request<SetSMSAttributesResponse, AWSError>
    open fun setSMSAttributes(callback: (err: AWSError, data: SetSMSAttributesResponse) -> Unit = definedExternally): Request<SetSMSAttributesResponse, AWSError>
    open fun setSubscriptionAttributes(params: SetSubscriptionAttributesInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setSubscriptionAttributes(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setTopicAttributes(params: SetTopicAttributesInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setTopicAttributes(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun subscribe(params: SubscribeInput, callback: (err: AWSError, data: SubscribeResponse) -> Unit = definedExternally): Request<SubscribeResponse, AWSError>
    open fun subscribe(callback: (err: AWSError, data: SubscribeResponse) -> Unit = definedExternally): Request<SubscribeResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun unsubscribe(params: UnsubscribeInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unsubscribe(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    interface AddPermissionInput {
        var TopicArn: topicARN
        var Label: label
        var AWSAccountId: DelegatesList
        var ActionName: ActionsList
    }
    interface CheckIfPhoneNumberIsOptedOutInput {
        var phoneNumber: PhoneNumber
    }
    interface CheckIfPhoneNumberIsOptedOutResponse {
        var isOptedOut: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfirmSubscriptionInput {
        var TopicArn: topicARN
        var Token: token
        var AuthenticateOnUnsubscribe: authenticateOnUnsubscribe?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfirmSubscriptionResponse {
        var SubscriptionArn: subscriptionARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEndpointResponse {
        var EndpointArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePlatformApplicationInput {
        var Name: String
        var Platform: String
        var Attributes: MapStringToString
    }
    interface CreatePlatformApplicationResponse {
        var PlatformApplicationArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePlatformEndpointInput {
        var PlatformApplicationArn: String
        var Token: String
        var CustomUserData: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: MapStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTopicInput {
        var Name: topicName
        var Attributes: TopicAttributesMap?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTopicResponse {
        var TopicArn: topicARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteEndpointInput {
        var EndpointArn: String
    }
    interface DeletePlatformApplicationInput {
        var PlatformApplicationArn: String
    }
    interface DeleteTopicInput {
        var TopicArn: topicARN
    }
    interface Endpoint {
        var EndpointArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: MapStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEndpointAttributesInput {
        var EndpointArn: String
    }
    interface GetEndpointAttributesResponse {
        var Attributes: MapStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPlatformApplicationAttributesInput {
        var PlatformApplicationArn: String
    }
    interface GetPlatformApplicationAttributesResponse {
        var Attributes: MapStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSMSAttributesInput {
        var attributes: ListString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSMSAttributesResponse {
        var attributes: MapStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSubscriptionAttributesInput {
        var SubscriptionArn: subscriptionARN
    }
    interface GetSubscriptionAttributesResponse {
        var Attributes: SubscriptionAttributesMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTopicAttributesInput {
        var TopicArn: topicARN
    }
    interface GetTopicAttributesResponse {
        var Attributes: TopicAttributesMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEndpointsByPlatformApplicationInput {
        var PlatformApplicationArn: String
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEndpointsByPlatformApplicationResponse {
        var Endpoints: ListOfEndpoints?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPhoneNumbersOptedOutInput {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPhoneNumbersOptedOutResponse {
        var phoneNumbers: PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPlatformApplicationsInput {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPlatformApplicationsResponse {
        var PlatformApplications: ListOfPlatformApplications?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscriptionsByTopicInput {
        var TopicArn: topicARN
        var NextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscriptionsByTopicResponse {
        var Subscriptions: SubscriptionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscriptionsInput {
        var NextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSubscriptionsResponse {
        var Subscriptions: SubscriptionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: AmazonResourceName
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTopicsInput {
        var NextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTopicsResponse {
        var Topics: TopicsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: nextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MapStringToString {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface MessageAttributeMap {
        @nativeGetter
        operator fun get(key: String): MessageAttributeValue?
        @nativeSetter
        operator fun set(key: String, value: MessageAttributeValue)
    }
    interface MessageAttributeValue {
        var DataType: String
        var StringValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var BinaryValue: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OptInPhoneNumberInput {
        var phoneNumber: PhoneNumber
    }
    interface OptInPhoneNumberResponse
    interface PlatformApplication {
        var PlatformApplicationArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: MapStringToString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublishInput {
        var TopicArn: topicARN?
            get() = definedExternally
            set(value) = definedExternally
        var TargetArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumber: String?
            get() = definedExternally
            set(value) = definedExternally
        var Message: message
        var Subject: subject?
            get() = definedExternally
            set(value) = definedExternally
        var MessageStructure: messageStructure?
            get() = definedExternally
            set(value) = definedExternally
        var MessageAttributes: MessageAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublishResponse {
        var MessageId: messageId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemovePermissionInput {
        var TopicArn: topicARN
        var Label: label
    }
    interface SetEndpointAttributesInput {
        var EndpointArn: String
        var Attributes: MapStringToString
    }
    interface SetPlatformApplicationAttributesInput {
        var PlatformApplicationArn: String
        var Attributes: MapStringToString
    }
    interface SetSMSAttributesInput {
        var attributes: MapStringToString
    }
    interface SetSMSAttributesResponse
    interface SetSubscriptionAttributesInput {
        var SubscriptionArn: subscriptionARN
        var AttributeName: attributeName
        var AttributeValue: attributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetTopicAttributesInput {
        var TopicArn: topicARN
        var AttributeName: attributeName
        var AttributeValue: attributeValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubscribeInput {
        var TopicArn: topicARN
        var Protocol: protocol
        var Endpoint: endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: SubscriptionAttributesMap?
            get() = definedExternally
            set(value) = definedExternally
        var ReturnSubscriptionArn: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubscribeResponse {
        var SubscriptionArn: subscriptionARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Subscription {
        var SubscriptionArn: subscriptionARN?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: account?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: protocol?
            get() = definedExternally
            set(value) = definedExternally
        var Endpoint: endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var TopicArn: topicARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubscriptionAttributesMap {
        @nativeGetter
        operator fun get(key: String): attributeValue?
        @nativeSetter
        operator fun set(key: String, value: attributeValue)
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceArn: AmazonResourceName
        var Tags: TagList
    }
    interface TagResourceResponse
    interface Topic {
        var TopicArn: topicARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TopicAttributesMap {
        @nativeGetter
        operator fun get(key: String): attributeValue?
        @nativeSetter
        operator fun set(key: String, value: attributeValue)
    }
    interface UnsubscribeInput {
        var SubscriptionArn: subscriptionARN
    }
    interface UntagResourceRequest {
        var ResourceArn: AmazonResourceName
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2010-03-31" | "latest" | String */
    }
}