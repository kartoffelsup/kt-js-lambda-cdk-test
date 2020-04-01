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
import CloudTrail.DataResource
import CloudTrail.EventSelector
import CloudTrail.Event
import CloudTrail.InsightSelector
import CloudTrail.LookupAttribute
import CloudTrail.PublicKey
import CloudTrail.Resource
import CloudTrail.ResourceTag
import CloudTrail.Tag
import CloudTrail.Trail
import CloudTrail.TrailInfo
import CloudTrail.AddTagsRequest
import CloudTrail.AddTagsResponse
import CloudTrail.CreateTrailRequest
import CloudTrail.CreateTrailResponse
import CloudTrail.DeleteTrailRequest
import CloudTrail.DeleteTrailResponse
import CloudTrail.DescribeTrailsRequest
import CloudTrail.DescribeTrailsResponse
import CloudTrail.GetEventSelectorsRequest
import CloudTrail.GetEventSelectorsResponse
import CloudTrail.GetInsightSelectorsRequest
import CloudTrail.GetInsightSelectorsResponse
import CloudTrail.GetTrailRequest
import CloudTrail.GetTrailResponse
import CloudTrail.GetTrailStatusRequest
import CloudTrail.GetTrailStatusResponse
import CloudTrail.ListPublicKeysRequest
import CloudTrail.ListPublicKeysResponse
import CloudTrail.ListTagsRequest
import CloudTrail.ListTagsResponse
import CloudTrail.ListTrailsRequest
import CloudTrail.ListTrailsResponse
import CloudTrail.LookupEventsRequest
import CloudTrail.LookupEventsResponse
import CloudTrail.PutEventSelectorsRequest
import CloudTrail.PutEventSelectorsResponse
import CloudTrail.PutInsightSelectorsRequest
import CloudTrail.PutInsightSelectorsResponse
import CloudTrail.RemoveTagsRequest
import CloudTrail.RemoveTagsResponse
import CloudTrail.StartLoggingRequest
import CloudTrail.StartLoggingResponse
import CloudTrail.StopLoggingRequest
import CloudTrail.StopLoggingResponse
import CloudTrail.UpdateTrailRequest
import CloudTrail.UpdateTrailResponse

typealias Boolean = Boolean

typealias DataResourceValues = Array<String>

typealias DataResources = Array<DataResource>

typealias _Date = Date

typealias EventSelectors = Array<EventSelector>

typealias EventsList = Array<Event>

typealias ExcludeManagementEventSources = Array<String>

typealias InsightSelectors = Array<InsightSelector>

typealias LookupAttributesList = Array<LookupAttribute>

typealias MaxResults = Number

typealias NextToken = String

typealias PublicKeyList = Array<PublicKey>

typealias ResourceIdList = Array<String>

typealias ResourceList = Array<Resource>

typealias ResourceTagList = Array<ResourceTag>

typealias String = String

typealias TagsList = Array<Tag>

typealias TrailList = Array<Trail>

typealias TrailNameList = Array<String>

typealias Trails = Array<TrailInfo>

@JsModule("aws-sdk")
external open class CloudTrail(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CloudTrail.Types.ClientConfiguration */
    open fun addTags(params: AddTagsRequest, callback: (err: AWSError, data: AddTagsResponse) -> Unit = definedExternally): Request<AddTagsResponse, AWSError>
    open fun addTags(callback: (err: AWSError, data: AddTagsResponse) -> Unit = definedExternally): Request<AddTagsResponse, AWSError>
    open fun createTrail(params: CreateTrailRequest, callback: (err: AWSError, data: CreateTrailResponse) -> Unit = definedExternally): Request<CreateTrailResponse, AWSError>
    open fun createTrail(callback: (err: AWSError, data: CreateTrailResponse) -> Unit = definedExternally): Request<CreateTrailResponse, AWSError>
    open fun deleteTrail(params: DeleteTrailRequest, callback: (err: AWSError, data: DeleteTrailResponse) -> Unit = definedExternally): Request<DeleteTrailResponse, AWSError>
    open fun deleteTrail(callback: (err: AWSError, data: DeleteTrailResponse) -> Unit = definedExternally): Request<DeleteTrailResponse, AWSError>
    open fun describeTrails(params: DescribeTrailsRequest, callback: (err: AWSError, data: DescribeTrailsResponse) -> Unit = definedExternally): Request<DescribeTrailsResponse, AWSError>
    open fun describeTrails(callback: (err: AWSError, data: DescribeTrailsResponse) -> Unit = definedExternally): Request<DescribeTrailsResponse, AWSError>
    open fun getEventSelectors(params: GetEventSelectorsRequest, callback: (err: AWSError, data: GetEventSelectorsResponse) -> Unit = definedExternally): Request<GetEventSelectorsResponse, AWSError>
    open fun getEventSelectors(callback: (err: AWSError, data: GetEventSelectorsResponse) -> Unit = definedExternally): Request<GetEventSelectorsResponse, AWSError>
    open fun getInsightSelectors(params: GetInsightSelectorsRequest, callback: (err: AWSError, data: GetInsightSelectorsResponse) -> Unit = definedExternally): Request<GetInsightSelectorsResponse, AWSError>
    open fun getInsightSelectors(callback: (err: AWSError, data: GetInsightSelectorsResponse) -> Unit = definedExternally): Request<GetInsightSelectorsResponse, AWSError>
    open fun getTrail(params: GetTrailRequest, callback: (err: AWSError, data: GetTrailResponse) -> Unit = definedExternally): Request<GetTrailResponse, AWSError>
    open fun getTrail(callback: (err: AWSError, data: GetTrailResponse) -> Unit = definedExternally): Request<GetTrailResponse, AWSError>
    open fun getTrailStatus(params: GetTrailStatusRequest, callback: (err: AWSError, data: GetTrailStatusResponse) -> Unit = definedExternally): Request<GetTrailStatusResponse, AWSError>
    open fun getTrailStatus(callback: (err: AWSError, data: GetTrailStatusResponse) -> Unit = definedExternally): Request<GetTrailStatusResponse, AWSError>
    open fun listPublicKeys(params: ListPublicKeysRequest, callback: (err: AWSError, data: ListPublicKeysResponse) -> Unit = definedExternally): Request<ListPublicKeysResponse, AWSError>
    open fun listPublicKeys(callback: (err: AWSError, data: ListPublicKeysResponse) -> Unit = definedExternally): Request<ListPublicKeysResponse, AWSError>
    open fun listTags(params: ListTagsRequest, callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listTrails(params: ListTrailsRequest, callback: (err: AWSError, data: ListTrailsResponse) -> Unit = definedExternally): Request<ListTrailsResponse, AWSError>
    open fun listTrails(callback: (err: AWSError, data: ListTrailsResponse) -> Unit = definedExternally): Request<ListTrailsResponse, AWSError>
    open fun lookupEvents(params: LookupEventsRequest, callback: (err: AWSError, data: LookupEventsResponse) -> Unit = definedExternally): Request<LookupEventsResponse, AWSError>
    open fun lookupEvents(callback: (err: AWSError, data: LookupEventsResponse) -> Unit = definedExternally): Request<LookupEventsResponse, AWSError>
    open fun putEventSelectors(params: PutEventSelectorsRequest, callback: (err: AWSError, data: PutEventSelectorsResponse) -> Unit = definedExternally): Request<PutEventSelectorsResponse, AWSError>
    open fun putEventSelectors(callback: (err: AWSError, data: PutEventSelectorsResponse) -> Unit = definedExternally): Request<PutEventSelectorsResponse, AWSError>
    open fun putInsightSelectors(params: PutInsightSelectorsRequest, callback: (err: AWSError, data: PutInsightSelectorsResponse) -> Unit = definedExternally): Request<PutInsightSelectorsResponse, AWSError>
    open fun putInsightSelectors(callback: (err: AWSError, data: PutInsightSelectorsResponse) -> Unit = definedExternally): Request<PutInsightSelectorsResponse, AWSError>
    open fun removeTags(params: RemoveTagsRequest, callback: (err: AWSError, data: RemoveTagsResponse) -> Unit = definedExternally): Request<RemoveTagsResponse, AWSError>
    open fun removeTags(callback: (err: AWSError, data: RemoveTagsResponse) -> Unit = definedExternally): Request<RemoveTagsResponse, AWSError>
    open fun startLogging(params: StartLoggingRequest, callback: (err: AWSError, data: StartLoggingResponse) -> Unit = definedExternally): Request<StartLoggingResponse, AWSError>
    open fun startLogging(callback: (err: AWSError, data: StartLoggingResponse) -> Unit = definedExternally): Request<StartLoggingResponse, AWSError>
    open fun stopLogging(params: StopLoggingRequest, callback: (err: AWSError, data: StopLoggingResponse) -> Unit = definedExternally): Request<StopLoggingResponse, AWSError>
    open fun stopLogging(callback: (err: AWSError, data: StopLoggingResponse) -> Unit = definedExternally): Request<StopLoggingResponse, AWSError>
    open fun updateTrail(params: UpdateTrailRequest, callback: (err: AWSError, data: UpdateTrailResponse) -> Unit = definedExternally): Request<UpdateTrailResponse, AWSError>
    open fun updateTrail(callback: (err: AWSError, data: UpdateTrailResponse) -> Unit = definedExternally): Request<UpdateTrailResponse, AWSError>
    interface AddTagsRequest {
        var ResourceId: String
        var TagsList: TagsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddTagsResponse
    interface CreateTrailRequest {
        var Name: String
        var S3BucketName: String
        var S3KeyPrefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicName: String?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeGlobalServiceEvents: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IsMultiRegionTrail: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableLogFileValidation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsLogGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsOrganizationTrail: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TagsList: TagsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTrailResponse {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3KeyPrefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeGlobalServiceEvents: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IsMultiRegionTrail: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TrailARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var LogFileValidationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsLogGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsOrganizationTrail: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataResource {
        var Type: String?
            get() = definedExternally
            set(value) = definedExternally
        var Values: DataResourceValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTrailRequest {
        var Name: String
    }
    interface DeleteTrailResponse
    interface DescribeTrailsRequest {
        var trailNameList: TrailNameList?
            get() = definedExternally
            set(value) = definedExternally
        var includeShadowTrails: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTrailsResponse {
        var trailList: TrailList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Event {
        var EventId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventName: String?
            get() = definedExternally
            set(value) = definedExternally
        var ReadOnly: String?
            get() = definedExternally
            set(value) = definedExternally
        var AccessKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EventSource: String?
            get() = definedExternally
            set(value) = definedExternally
        var Username: String?
            get() = definedExternally
            set(value) = definedExternally
        var Resources: ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var CloudTrailEvent: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventSelector {
        var ReadWriteType: String /* "ReadOnly" | "WriteOnly" | "All" | String */
        var IncludeManagementEvents: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DataResources: DataResources?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludeManagementEventSources: ExcludeManagementEventSources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEventSelectorsRequest {
        var TrailName: String
    }
    interface GetEventSelectorsResponse {
        var TrailARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventSelectors: EventSelectors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInsightSelectorsRequest {
        var TrailName: String
    }
    interface GetInsightSelectorsResponse {
        var TrailARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var InsightSelectors: InsightSelectors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTrailRequest {
        var Name: String
    }
    interface GetTrailResponse {
        var Trail: Trail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTrailStatusRequest {
        var Name: String
    }
    interface GetTrailStatusResponse {
        var IsLogging: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LatestDeliveryError: String?
            get() = definedExternally
            set(value) = definedExternally
        var LatestNotificationError: String?
            get() = definedExternally
            set(value) = definedExternally
        var LatestDeliveryTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LatestNotificationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var StartLoggingTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var StopLoggingTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LatestCloudWatchLogsDeliveryError: String?
            get() = definedExternally
            set(value) = definedExternally
        var LatestCloudWatchLogsDeliveryTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LatestDigestDeliveryTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LatestDigestDeliveryError: String?
            get() = definedExternally
            set(value) = definedExternally
        var LatestDeliveryAttemptTime: String?
            get() = definedExternally
            set(value) = definedExternally
        var LatestNotificationAttemptTime: String?
            get() = definedExternally
            set(value) = definedExternally
        var LatestNotificationAttemptSucceeded: String?
            get() = definedExternally
            set(value) = definedExternally
        var LatestDeliveryAttemptSucceeded: String?
            get() = definedExternally
            set(value) = definedExternally
        var TimeLoggingStarted: String?
            get() = definedExternally
            set(value) = definedExternally
        var TimeLoggingStopped: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InsightSelector {
        var InsightType: String /* "ApiCallRateInsight" | String */
    }
    interface ListPublicKeysRequest {
        var StartTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPublicKeysResponse {
        var PublicKeyList: PublicKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsRequest {
        var ResourceIdList: ResourceIdList
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsResponse {
        var ResourceTagList: ResourceTagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrailsRequest {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTrailsResponse {
        var Trails: Trails?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LookupAttribute {
        var AttributeKey: String /* "EventId" | "EventName" | "ReadOnly" | "Username" | "ResourceType" | "ResourceName" | "EventSource" | "AccessKeyId" | String */
        var AttributeValue: String
    }
    interface LookupEventsRequest {
        var LookupAttributes: LookupAttributesList?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var EventCategory: String /* "insight" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LookupEventsResponse {
        var Events: EventsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PublicKey {
        var Value: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var ValidityStartTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var ValidityEndTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var Fingerprint: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutEventSelectorsRequest {
        var TrailName: String
        var EventSelectors: EventSelectors
    }
    interface PutEventSelectorsResponse {
        var TrailARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var EventSelectors: EventSelectors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutInsightSelectorsRequest {
        var TrailName: String
        var InsightSelectors: InsightSelectors
    }
    interface PutInsightSelectorsResponse {
        var TrailARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var InsightSelectors: InsightSelectors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsRequest {
        var ResourceId: String
        var TagsList: TagsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsResponse
    interface Resource {
        var ResourceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTag {
        var ResourceId: String?
            get() = definedExternally
            set(value) = definedExternally
        var TagsList: TagsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartLoggingRequest {
        var Name: String
    }
    interface StartLoggingResponse
    interface StopLoggingRequest {
        var Name: String
    }
    interface StopLoggingResponse
    interface Tag {
        var Key: String
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Trail {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3KeyPrefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeGlobalServiceEvents: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IsMultiRegionTrail: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HomeRegion: String?
            get() = definedExternally
            set(value) = definedExternally
        var TrailARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var LogFileValidationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsLogGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var HasCustomEventSelectors: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var HasInsightSelectors: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IsOrganizationTrail: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrailInfo {
        var TrailARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var HomeRegion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTrailRequest {
        var Name: String
        var S3BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3KeyPrefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicName: String?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeGlobalServiceEvents: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IsMultiRegionTrail: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableLogFileValidation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsLogGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsOrganizationTrail: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTrailResponse {
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3BucketName: String?
            get() = definedExternally
            set(value) = definedExternally
        var S3KeyPrefix: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnsTopicARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeGlobalServiceEvents: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var IsMultiRegionTrail: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var TrailARN: String?
            get() = definedExternally
            set(value) = definedExternally
        var LogFileValidationEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsLogGroupArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogsRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsOrganizationTrail: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2013-11-01" | "latest" | String */
    }
}