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
import Connect.ContactFlowSummary
import Connect.CurrentMetricData
import Connect.CurrentMetricResult
import Connect.CurrentMetric
import Connect.HierarchyGroupSummary
import Connect.HistoricalMetricData
import Connect.HistoricalMetricResult
import Connect.HistoricalMetric
import Connect.HoursOfOperationSummary
import Connect.PhoneNumberSummary
import Connect.QueueSummary
import Connect.RoutingProfileSummary
import Connect.SecurityProfileSummary
import Connect.UserSummary
import Connect.CreateUserRequest
import Connect.CreateUserResponse
import Connect.DeleteUserRequest
import Connect.DescribeUserRequest
import Connect.DescribeUserResponse
import Connect.DescribeUserHierarchyGroupRequest
import Connect.DescribeUserHierarchyGroupResponse
import Connect.DescribeUserHierarchyStructureRequest
import Connect.DescribeUserHierarchyStructureResponse
import Connect.GetContactAttributesRequest
import Connect.GetContactAttributesResponse
import Connect.GetCurrentMetricDataRequest
import Connect.GetCurrentMetricDataResponse
import Connect.GetFederationTokenRequest
import Connect.GetFederationTokenResponse
import Connect.GetMetricDataRequest
import Connect.GetMetricDataResponse
import Connect.ListContactFlowsRequest
import Connect.ListContactFlowsResponse
import Connect.ListHoursOfOperationsRequest
import Connect.ListHoursOfOperationsResponse
import Connect.ListPhoneNumbersRequest
import Connect.ListPhoneNumbersResponse
import Connect.ListQueuesRequest
import Connect.ListQueuesResponse
import Connect.ListRoutingProfilesRequest
import Connect.ListRoutingProfilesResponse
import Connect.ListSecurityProfilesRequest
import Connect.ListSecurityProfilesResponse
import Connect.ListTagsForResourceRequest
import Connect.ListTagsForResourceResponse
import Connect.ListUserHierarchyGroupsRequest
import Connect.ListUserHierarchyGroupsResponse
import Connect.ListUsersRequest
import Connect.ListUsersResponse
import Connect.StartChatContactRequest
import Connect.StartChatContactResponse
import Connect.StartOutboundVoiceContactRequest
import Connect.StartOutboundVoiceContactResponse
import Connect.StopContactRequest
import Connect.StopContactResponse
import Connect.TagResourceRequest
import Connect.UntagResourceRequest
import Connect.UpdateContactAttributesRequest
import Connect.UpdateContactAttributesResponse
import Connect.UpdateUserHierarchyRequest
import Connect.UpdateUserIdentityInfoRequest
import Connect.UpdateUserPhoneConfigRequest
import Connect.UpdateUserRoutingProfileRequest
import Connect.UpdateUserSecurityProfilesRequest
import Connect.UserIdentityInfo
import Connect.UserPhoneConfig
import Connect.TagMap
import Connect.Dimensions
import Connect.HierarchyGroup
import Connect.HierarchyStructure
import Connect.User
import Connect.QueueReference
import Connect.Attributes
import Connect.Filters
import Connect.Credentials
import Connect.HierarchyPath
import Connect.HierarchyLevel
import Connect.Threshold
import Connect.ParticipantDetails
import Connect.ChatMessage

typealias ARN = String

typealias AfterContactWorkTimeLimit = Number

typealias AgentFirstName = String

typealias AgentLastName = String

typealias AgentUsername = String

typealias AttributeName = String

typealias AttributeValue = String

typealias AutoAccept = Boolean

typealias Channels = Array<String /* "VOICE" | "CHAT" | String */>

typealias ChatContent = String

typealias ChatContentType = String

typealias ClientToken = String

typealias ContactFlowId = String

typealias ContactFlowName = String

typealias ContactFlowSummaryList = Array<ContactFlowSummary>

typealias ContactFlowTypes = Array<String /* "CONTACT_FLOW" | "CUSTOMER_QUEUE" | "CUSTOMER_HOLD" | "CUSTOMER_WHISPER" | "AGENT_HOLD" | "AGENT_WHISPER" | "OUTBOUND_WHISPER" | "AGENT_TRANSFER" | "QUEUE_TRANSFER" | String */>

typealias ContactId = String

typealias CurrentMetricDataCollections = Array<CurrentMetricData>

typealias CurrentMetricResults = Array<CurrentMetricResult>

typealias CurrentMetrics = Array<CurrentMetric>

typealias DirectoryUserId = String

typealias DisplayName = String

typealias Email = String

typealias Groupings = Array<String /* "QUEUE" | "CHANNEL" | String */>

typealias HierarchyGroupId = String

typealias HierarchyGroupName = String

typealias HierarchyGroupSummaryList = Array<HierarchyGroupSummary>

typealias HierarchyLevelId = String

typealias HierarchyLevelName = String

typealias HistoricalMetricDataCollections = Array<HistoricalMetricData>

typealias HistoricalMetricResults = Array<HistoricalMetricResult>

typealias HistoricalMetrics = Array<HistoricalMetric>

typealias HoursOfOperationId = String

typealias HoursOfOperationName = String

typealias HoursOfOperationSummaryList = Array<HoursOfOperationSummary>

typealias InstanceId = String

typealias MaxResult100 = Number

typealias MaxResult1000 = Number

typealias NextToken = String

typealias ParticipantId = String

typealias ParticipantToken = String

typealias Password = String

typealias PhoneNumber = String

typealias PhoneNumberCountryCodes = Array<String /* "AF" | "AL" | "DZ" | "AS" | "AD" | "AO" | "AI" | "AQ" | "AG" | "AR" | "AM" | "AW" | "AU" | "AT" | "AZ" | "BS" | "BH" | "BD" | "BB" | "BY" | "BE" | "BZ" | "BJ" | "BM" | "BT" | "BO" | "BA" | "BW" | "BR" | "IO" | "VG" | "BN" | "BG" | "BF" | "BI" | "KH" | "CM" | "CA" | "CV" | "KY" | "CF" | "TD" | "CL" | "CN" | "CX" | "CC" | "CO" | "KM" | "CK" | "CR" | "HR" | "CU" | "CW" | "CY" | "CZ" | "CD" | "DK" | "DJ" | "DM" | "DO" | "TL" | "EC" | "EG" | "SV" | "GQ" | "ER" | "EE" | "ET" | "FK" | "FO" | "FJ" | "FI" | "FR" | "PF" | "GA" | "GM" | "GE" | "DE" | "GH" | "GI" | "GR" | "GL" | "GD" | "GU" | "GT" | "GG" | "GN" | "GW" | "GY" | "HT" | "HN" | "HK" | "HU" | "IS" | "IN" | "ID" | "IR" | "IQ" | "IE" | "IM" | "IL" | "IT" | "CI" | "JM" | "JP" | "JE" | "JO" | "KZ" | "KE" | "KI" | "KW" | "KG" | "LA" | "LV" | "LB" | "LS" | "LR" | "LY" | "LI" | "LT" | "LU" | "MO" | "MK" | "MG" | "MW" | "MY" | "MV" | "ML" | "MT" | "MH" | "MR" | "MU" | "YT" | "MX" | "FM" | "MD" | "MC" | "MN" | "ME" | "MS" | "MA" | "MZ" | "MM" | "NA" | "NR" | "NP" | "NL" | "AN" | "NC" | "NZ" | "NI" | "NE" | "NG" | "NU" | "KP" | "MP" | "NO" | "OM" | "PK" | "PW" | "PA" | "PG" | "PY" | "PE" | "PH" | "PN" | "PL" | "PT" | "PR" | "QA" | "CG" | "RE" | "RO" | "RU" | "RW" | "BL" | "SH" | "KN" | "LC" | "MF" | "PM" | "VC" | "WS" | "SM" | "ST" | "SA" | "SN" | "RS" | "SC" | "SL" | "SG" | "SX" | "SK" | "SI" | "SB" | "SO" | "ZA" | "KR" | "ES" | "LK" | "SD" | "SR" | "SJ" | "SZ" | "SE" | "CH" | "SY" | "TW" | "TJ" | "TZ" | "TH" | "TG" | "TK" | "TO" | "TT" | "TN" | "TR" | "TM" | "TC" | "TV" | "VI" | "UG" | "UA" | "AE" | "GB" | "US" | "UY" | "UZ" | "VU" | "VA" | "VE" | "VN" | "WF" | "EH" | "YE" | "ZM" | "ZW" | String */>

typealias PhoneNumberId = String

typealias PhoneNumberSummaryList = Array<PhoneNumberSummary>

typealias PhoneNumberTypes = Array<String /* "TOLL_FREE" | "DID" | String */>

typealias QueueId = String

typealias QueueName = String

typealias QueueSummaryList = Array<QueueSummary>

typealias QueueTypes = Array<String /* "STANDARD" | "AGENT" | String */>

typealias Queues = Array<QueueId>

typealias RoutingProfileId = String

typealias RoutingProfileName = String

typealias RoutingProfileSummaryList = Array<RoutingProfileSummary>

typealias SecurityProfileId = String

typealias SecurityProfileIds = Array<SecurityProfileId>

typealias SecurityProfileName = String

typealias SecurityProfileSummaryList = Array<SecurityProfileSummary>

typealias SecurityToken = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias ThresholdValue = Number

typealias UserId = String

typealias UserSummaryList = Array<UserSummary>

typealias Value = Number

typealias timestamp = Date

@JsModule("aws-sdk")
external open class Connect(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Connect.Types.ClientConfiguration */
    open fun createUser(params: CreateUserRequest, callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun createUser(callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun deleteUser(params: DeleteUserRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUser(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeUser(params: DescribeUserRequest, callback: (err: AWSError, data: DescribeUserResponse) -> Unit = definedExternally): Request<DescribeUserResponse, AWSError>
    open fun describeUser(callback: (err: AWSError, data: DescribeUserResponse) -> Unit = definedExternally): Request<DescribeUserResponse, AWSError>
    open fun describeUserHierarchyGroup(params: DescribeUserHierarchyGroupRequest, callback: (err: AWSError, data: DescribeUserHierarchyGroupResponse) -> Unit = definedExternally): Request<DescribeUserHierarchyGroupResponse, AWSError>
    open fun describeUserHierarchyGroup(callback: (err: AWSError, data: DescribeUserHierarchyGroupResponse) -> Unit = definedExternally): Request<DescribeUserHierarchyGroupResponse, AWSError>
    open fun describeUserHierarchyStructure(params: DescribeUserHierarchyStructureRequest, callback: (err: AWSError, data: DescribeUserHierarchyStructureResponse) -> Unit = definedExternally): Request<DescribeUserHierarchyStructureResponse, AWSError>
    open fun describeUserHierarchyStructure(callback: (err: AWSError, data: DescribeUserHierarchyStructureResponse) -> Unit = definedExternally): Request<DescribeUserHierarchyStructureResponse, AWSError>
    open fun getContactAttributes(params: GetContactAttributesRequest, callback: (err: AWSError, data: GetContactAttributesResponse) -> Unit = definedExternally): Request<GetContactAttributesResponse, AWSError>
    open fun getContactAttributes(callback: (err: AWSError, data: GetContactAttributesResponse) -> Unit = definedExternally): Request<GetContactAttributesResponse, AWSError>
    open fun getCurrentMetricData(params: GetCurrentMetricDataRequest, callback: (err: AWSError, data: GetCurrentMetricDataResponse) -> Unit = definedExternally): Request<GetCurrentMetricDataResponse, AWSError>
    open fun getCurrentMetricData(callback: (err: AWSError, data: GetCurrentMetricDataResponse) -> Unit = definedExternally): Request<GetCurrentMetricDataResponse, AWSError>
    open fun getFederationToken(params: GetFederationTokenRequest, callback: (err: AWSError, data: GetFederationTokenResponse) -> Unit = definedExternally): Request<GetFederationTokenResponse, AWSError>
    open fun getFederationToken(callback: (err: AWSError, data: GetFederationTokenResponse) -> Unit = definedExternally): Request<GetFederationTokenResponse, AWSError>
    open fun getMetricData(params: GetMetricDataRequest, callback: (err: AWSError, data: GetMetricDataResponse) -> Unit = definedExternally): Request<GetMetricDataResponse, AWSError>
    open fun getMetricData(callback: (err: AWSError, data: GetMetricDataResponse) -> Unit = definedExternally): Request<GetMetricDataResponse, AWSError>
    open fun listContactFlows(params: ListContactFlowsRequest, callback: (err: AWSError, data: ListContactFlowsResponse) -> Unit = definedExternally): Request<ListContactFlowsResponse, AWSError>
    open fun listContactFlows(callback: (err: AWSError, data: ListContactFlowsResponse) -> Unit = definedExternally): Request<ListContactFlowsResponse, AWSError>
    open fun listHoursOfOperations(params: ListHoursOfOperationsRequest, callback: (err: AWSError, data: ListHoursOfOperationsResponse) -> Unit = definedExternally): Request<ListHoursOfOperationsResponse, AWSError>
    open fun listHoursOfOperations(callback: (err: AWSError, data: ListHoursOfOperationsResponse) -> Unit = definedExternally): Request<ListHoursOfOperationsResponse, AWSError>
    open fun listPhoneNumbers(params: ListPhoneNumbersRequest, callback: (err: AWSError, data: ListPhoneNumbersResponse) -> Unit = definedExternally): Request<ListPhoneNumbersResponse, AWSError>
    open fun listPhoneNumbers(callback: (err: AWSError, data: ListPhoneNumbersResponse) -> Unit = definedExternally): Request<ListPhoneNumbersResponse, AWSError>
    open fun listQueues(params: ListQueuesRequest, callback: (err: AWSError, data: ListQueuesResponse) -> Unit = definedExternally): Request<ListQueuesResponse, AWSError>
    open fun listQueues(callback: (err: AWSError, data: ListQueuesResponse) -> Unit = definedExternally): Request<ListQueuesResponse, AWSError>
    open fun listRoutingProfiles(params: ListRoutingProfilesRequest, callback: (err: AWSError, data: ListRoutingProfilesResponse) -> Unit = definedExternally): Request<ListRoutingProfilesResponse, AWSError>
    open fun listRoutingProfiles(callback: (err: AWSError, data: ListRoutingProfilesResponse) -> Unit = definedExternally): Request<ListRoutingProfilesResponse, AWSError>
    open fun listSecurityProfiles(params: ListSecurityProfilesRequest, callback: (err: AWSError, data: ListSecurityProfilesResponse) -> Unit = definedExternally): Request<ListSecurityProfilesResponse, AWSError>
    open fun listSecurityProfiles(callback: (err: AWSError, data: ListSecurityProfilesResponse) -> Unit = definedExternally): Request<ListSecurityProfilesResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listUserHierarchyGroups(params: ListUserHierarchyGroupsRequest, callback: (err: AWSError, data: ListUserHierarchyGroupsResponse) -> Unit = definedExternally): Request<ListUserHierarchyGroupsResponse, AWSError>
    open fun listUserHierarchyGroups(callback: (err: AWSError, data: ListUserHierarchyGroupsResponse) -> Unit = definedExternally): Request<ListUserHierarchyGroupsResponse, AWSError>
    open fun listUsers(params: ListUsersRequest, callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listUsers(callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun startChatContact(params: StartChatContactRequest, callback: (err: AWSError, data: StartChatContactResponse) -> Unit = definedExternally): Request<StartChatContactResponse, AWSError>
    open fun startChatContact(callback: (err: AWSError, data: StartChatContactResponse) -> Unit = definedExternally): Request<StartChatContactResponse, AWSError>
    open fun startOutboundVoiceContact(params: StartOutboundVoiceContactRequest, callback: (err: AWSError, data: StartOutboundVoiceContactResponse) -> Unit = definedExternally): Request<StartOutboundVoiceContactResponse, AWSError>
    open fun startOutboundVoiceContact(callback: (err: AWSError, data: StartOutboundVoiceContactResponse) -> Unit = definedExternally): Request<StartOutboundVoiceContactResponse, AWSError>
    open fun stopContact(params: StopContactRequest, callback: (err: AWSError, data: StopContactResponse) -> Unit = definedExternally): Request<StopContactResponse, AWSError>
    open fun stopContact(callback: (err: AWSError, data: StopContactResponse) -> Unit = definedExternally): Request<StopContactResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateContactAttributes(params: UpdateContactAttributesRequest, callback: (err: AWSError, data: UpdateContactAttributesResponse) -> Unit = definedExternally): Request<UpdateContactAttributesResponse, AWSError>
    open fun updateContactAttributes(callback: (err: AWSError, data: UpdateContactAttributesResponse) -> Unit = definedExternally): Request<UpdateContactAttributesResponse, AWSError>
    open fun updateUserHierarchy(params: UpdateUserHierarchyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserHierarchy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserIdentityInfo(params: UpdateUserIdentityInfoRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserIdentityInfo(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserPhoneConfig(params: UpdateUserPhoneConfigRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserPhoneConfig(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserRoutingProfile(params: UpdateUserRoutingProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserRoutingProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserSecurityProfiles(params: UpdateUserSecurityProfilesRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserSecurityProfiles(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface Attributes {
        @nativeGetter
        operator fun get(key: String): AttributeValue?
        @nativeSetter
        operator fun set(key: String, value: AttributeValue)
    }
    interface ChatMessage {
        var ContentType: ChatContentType
        var Content: ChatContent
    }
    interface ContactFlowSummary {
        var Id: ContactFlowId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ContactFlowName?
            get() = definedExternally
            set(value) = definedExternally
        var ContactFlowType: String /* "CONTACT_FLOW" | "CUSTOMER_QUEUE" | "CUSTOMER_HOLD" | "CUSTOMER_WHISPER" | "AGENT_HOLD" | "AGENT_WHISPER" | "OUTBOUND_WHISPER" | "AGENT_TRANSFER" | "QUEUE_TRANSFER" | String */
    }
    interface CreateUserRequest {
        var Username: AgentUsername
        var Password: Password?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityInfo: UserIdentityInfo?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneConfig: UserPhoneConfig
        var DirectoryUserId: DirectoryUserId?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityProfileIds: SecurityProfileIds
        var RoutingProfileId: RoutingProfileId
        var HierarchyGroupId: HierarchyGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceId: InstanceId
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserResponse {
        var UserId: UserId?
            get() = definedExternally
            set(value) = definedExternally
        var UserArn: ARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Credentials {
        var AccessToken: SecurityToken?
            get() = definedExternally
            set(value) = definedExternally
        var AccessTokenExpiration: timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshToken: SecurityToken?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshTokenExpiration: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CurrentMetric {
        var Name: String /* "AGENTS_ONLINE" | "AGENTS_AVAILABLE" | "AGENTS_ON_CALL" | "AGENTS_NON_PRODUCTIVE" | "AGENTS_AFTER_CONTACT_WORK" | "AGENTS_ERROR" | "AGENTS_STAFFED" | "CONTACTS_IN_QUEUE" | "OLDEST_CONTACT_AGE" | "CONTACTS_SCHEDULED" | "AGENTS_ON_CONTACT" | "SLOTS_ACTIVE" | "SLOTS_AVAILABLE" | String */
        var Unit: String /* "SECONDS" | "COUNT" | "PERCENT" | String */
    }
    interface CurrentMetricData {
        var Metric: CurrentMetric?
            get() = definedExternally
            set(value) = definedExternally
        var Value: Value?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CurrentMetricResult {
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Collections: CurrentMetricDataCollections?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteUserRequest {
        var InstanceId: InstanceId
        var UserId: UserId
    }
    interface DescribeUserHierarchyGroupRequest {
        var HierarchyGroupId: HierarchyGroupId
        var InstanceId: InstanceId
    }
    interface DescribeUserHierarchyGroupResponse {
        var HierarchyGroup: HierarchyGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserHierarchyStructureRequest {
        var InstanceId: InstanceId
    }
    interface DescribeUserHierarchyStructureResponse {
        var HierarchyStructure: HierarchyStructure?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserRequest {
        var UserId: UserId
        var InstanceId: InstanceId
    }
    interface DescribeUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Dimensions {
        var Queue: QueueReference?
            get() = definedExternally
            set(value) = definedExternally
        var Channel: String /* "VOICE" | "CHAT" | String */
    }
    interface Filters {
        var Queues: Queues?
            get() = definedExternally
            set(value) = definedExternally
        var Channels: Channels?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetContactAttributesRequest {
        var InstanceId: InstanceId
        var InitialContactId: ContactId
    }
    interface GetContactAttributesResponse {
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCurrentMetricDataRequest {
        var InstanceId: InstanceId
        var Filters: Filters
        var Groupings: Groupings?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentMetrics: CurrentMetrics
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResult100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCurrentMetricDataResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MetricResults: CurrentMetricResults?
            get() = definedExternally
            set(value) = definedExternally
        var DataSnapshotTime: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFederationTokenRequest {
        var InstanceId: InstanceId
    }
    interface GetFederationTokenResponse {
        var Credentials: Credentials?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMetricDataRequest {
        var InstanceId: InstanceId
        var StartTime: timestamp
        var EndTime: timestamp
        var Filters: Filters
        var Groupings: Groupings?
            get() = definedExternally
            set(value) = definedExternally
        var HistoricalMetrics: HistoricalMetrics
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResult100?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMetricDataResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MetricResults: HistoricalMetricResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HierarchyGroup {
        var Id: HierarchyGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Name: HierarchyGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var LevelId: HierarchyLevelId?
            get() = definedExternally
            set(value) = definedExternally
        var HierarchyPath: HierarchyPath?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HierarchyGroupSummary {
        var Id: HierarchyGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Name: HierarchyGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HierarchyLevel {
        var Id: HierarchyLevelId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Name: HierarchyLevelName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HierarchyPath {
        var LevelOne: HierarchyGroupSummary?
            get() = definedExternally
            set(value) = definedExternally
        var LevelTwo: HierarchyGroupSummary?
            get() = definedExternally
            set(value) = definedExternally
        var LevelThree: HierarchyGroupSummary?
            get() = definedExternally
            set(value) = definedExternally
        var LevelFour: HierarchyGroupSummary?
            get() = definedExternally
            set(value) = definedExternally
        var LevelFive: HierarchyGroupSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HierarchyStructure {
        var LevelOne: HierarchyLevel?
            get() = definedExternally
            set(value) = definedExternally
        var LevelTwo: HierarchyLevel?
            get() = definedExternally
            set(value) = definedExternally
        var LevelThree: HierarchyLevel?
            get() = definedExternally
            set(value) = definedExternally
        var LevelFour: HierarchyLevel?
            get() = definedExternally
            set(value) = definedExternally
        var LevelFive: HierarchyLevel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HistoricalMetric {
        var Name: String /* "CONTACTS_QUEUED" | "CONTACTS_HANDLED" | "CONTACTS_ABANDONED" | "CONTACTS_CONSULTED" | "CONTACTS_AGENT_HUNG_UP_FIRST" | "CONTACTS_HANDLED_INCOMING" | "CONTACTS_HANDLED_OUTBOUND" | "CONTACTS_HOLD_ABANDONS" | "CONTACTS_TRANSFERRED_IN" | "CONTACTS_TRANSFERRED_OUT" | "CONTACTS_TRANSFERRED_IN_FROM_QUEUE" | "CONTACTS_TRANSFERRED_OUT_FROM_QUEUE" | "CONTACTS_MISSED" | "CALLBACK_CONTACTS_HANDLED" | "API_CONTACTS_HANDLED" | "OCCUPANCY" | "HANDLE_TIME" | "AFTER_CONTACT_WORK_TIME" | "QUEUED_TIME" | "ABANDON_TIME" | "QUEUE_ANSWER_TIME" | "HOLD_TIME" | "INTERACTION_TIME" | "INTERACTION_AND_HOLD_TIME" | "SERVICE_LEVEL" | String */
        var Threshold: Threshold?
            get() = definedExternally
            set(value) = definedExternally
        var Statistic: String /* "SUM" | "MAX" | "AVG" | String */
        var Unit: String /* "SECONDS" | "COUNT" | "PERCENT" | String */
    }
    interface HistoricalMetricData {
        var Metric: HistoricalMetric?
            get() = definedExternally
            set(value) = definedExternally
        var Value: Value?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HistoricalMetricResult {
        var Dimensions: Dimensions?
            get() = definedExternally
            set(value) = definedExternally
        var Collections: HistoricalMetricDataCollections?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HoursOfOperationSummary {
        var Id: HoursOfOperationId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Name: HoursOfOperationName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListContactFlowsRequest {
        var InstanceId: InstanceId
        var ContactFlowTypes: ContactFlowTypes?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResult1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListContactFlowsResponse {
        var ContactFlowSummaryList: ContactFlowSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHoursOfOperationsRequest {
        var InstanceId: InstanceId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResult1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListHoursOfOperationsResponse {
        var HoursOfOperationSummaryList: HoursOfOperationSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPhoneNumbersRequest {
        var InstanceId: InstanceId
        var PhoneNumberTypes: PhoneNumberTypes?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumberCountryCodes: PhoneNumberCountryCodes?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResult1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPhoneNumbersResponse {
        var PhoneNumberSummaryList: PhoneNumberSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQueuesRequest {
        var InstanceId: InstanceId
        var QueueTypes: QueueTypes?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResult1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQueuesResponse {
        var QueueSummaryList: QueueSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRoutingProfilesRequest {
        var InstanceId: InstanceId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResult1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRoutingProfilesResponse {
        var RoutingProfileSummaryList: RoutingProfileSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecurityProfilesRequest {
        var InstanceId: InstanceId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResult1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecurityProfilesResponse {
        var SecurityProfileSummaryList: SecurityProfileSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: ARN
    }
    interface ListTagsForResourceResponse {
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserHierarchyGroupsRequest {
        var InstanceId: InstanceId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResult1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserHierarchyGroupsResponse {
        var UserHierarchyGroupSummaryList: HierarchyGroupSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersRequest {
        var InstanceId: InstanceId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResult1000?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersResponse {
        var UserSummaryList: UserSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParticipantDetails {
        var DisplayName: DisplayName
    }
    interface PhoneNumberSummary {
        var Id: PhoneNumberId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumber: PhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumberType: String /* "TOLL_FREE" | "DID" | String */
        var PhoneNumberCountryCode: String /* "AF" | "AL" | "DZ" | "AS" | "AD" | "AO" | "AI" | "AQ" | "AG" | "AR" | "AM" | "AW" | "AU" | "AT" | "AZ" | "BS" | "BH" | "BD" | "BB" | "BY" | "BE" | "BZ" | "BJ" | "BM" | "BT" | "BO" | "BA" | "BW" | "BR" | "IO" | "VG" | "BN" | "BG" | "BF" | "BI" | "KH" | "CM" | "CA" | "CV" | "KY" | "CF" | "TD" | "CL" | "CN" | "CX" | "CC" | "CO" | "KM" | "CK" | "CR" | "HR" | "CU" | "CW" | "CY" | "CZ" | "CD" | "DK" | "DJ" | "DM" | "DO" | "TL" | "EC" | "EG" | "SV" | "GQ" | "ER" | "EE" | "ET" | "FK" | "FO" | "FJ" | "FI" | "FR" | "PF" | "GA" | "GM" | "GE" | "DE" | "GH" | "GI" | "GR" | "GL" | "GD" | "GU" | "GT" | "GG" | "GN" | "GW" | "GY" | "HT" | "HN" | "HK" | "HU" | "IS" | "IN" | "ID" | "IR" | "IQ" | "IE" | "IM" | "IL" | "IT" | "CI" | "JM" | "JP" | "JE" | "JO" | "KZ" | "KE" | "KI" | "KW" | "KG" | "LA" | "LV" | "LB" | "LS" | "LR" | "LY" | "LI" | "LT" | "LU" | "MO" | "MK" | "MG" | "MW" | "MY" | "MV" | "ML" | "MT" | "MH" | "MR" | "MU" | "YT" | "MX" | "FM" | "MD" | "MC" | "MN" | "ME" | "MS" | "MA" | "MZ" | "MM" | "NA" | "NR" | "NP" | "NL" | "AN" | "NC" | "NZ" | "NI" | "NE" | "NG" | "NU" | "KP" | "MP" | "NO" | "OM" | "PK" | "PW" | "PA" | "PG" | "PY" | "PE" | "PH" | "PN" | "PL" | "PT" | "PR" | "QA" | "CG" | "RE" | "RO" | "RU" | "RW" | "BL" | "SH" | "KN" | "LC" | "MF" | "PM" | "VC" | "WS" | "SM" | "ST" | "SA" | "SN" | "RS" | "SC" | "SL" | "SG" | "SX" | "SK" | "SI" | "SB" | "SO" | "ZA" | "KR" | "ES" | "LK" | "SD" | "SR" | "SJ" | "SZ" | "SE" | "CH" | "SY" | "TW" | "TJ" | "TZ" | "TH" | "TG" | "TK" | "TO" | "TT" | "TN" | "TR" | "TM" | "TC" | "TV" | "VI" | "UG" | "UA" | "AE" | "GB" | "US" | "UY" | "UZ" | "VU" | "VA" | "VE" | "VN" | "WF" | "EH" | "YE" | "ZM" | "ZW" | String */
    }
    interface QueueReference {
        var Id: QueueId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueueSummary {
        var Id: QueueId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Name: QueueName?
            get() = definedExternally
            set(value) = definedExternally
        var QueueType: String /* "STANDARD" | "AGENT" | String */
    }
    interface RoutingProfileSummary {
        var Id: RoutingProfileId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Name: RoutingProfileName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecurityProfileSummary {
        var Id: SecurityProfileId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecurityProfileName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartChatContactRequest {
        var InstanceId: InstanceId
        var ContactFlowId: ContactFlowId
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
        var ParticipantDetails: ParticipantDetails
        var InitialMessage: ChatMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartChatContactResponse {
        var ContactId: ContactId?
            get() = definedExternally
            set(value) = definedExternally
        var ParticipantId: ParticipantId?
            get() = definedExternally
            set(value) = definedExternally
        var ParticipantToken: ParticipantToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartOutboundVoiceContactRequest {
        var DestinationPhoneNumber: PhoneNumber
        var ContactFlowId: ContactFlowId
        var InstanceId: InstanceId
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var SourcePhoneNumber: PhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
        var QueueId: QueueId?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: Attributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartOutboundVoiceContactResponse {
        var ContactId: ContactId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopContactRequest {
        var ContactId: ContactId
        var InstanceId: InstanceId
    }
    interface StopContactResponse
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var resourceArn: ARN
        var tags: TagMap
    }
    interface Threshold {
        var Comparison: String /* "LT" | String */
        var ThresholdValue: ThresholdValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var resourceArn: ARN
        var tagKeys: TagKeyList
    }
    interface UpdateContactAttributesRequest {
        var InitialContactId: ContactId
        var InstanceId: InstanceId
        var Attributes: Attributes
    }
    interface UpdateContactAttributesResponse
    interface UpdateUserHierarchyRequest {
        var HierarchyGroupId: HierarchyGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var UserId: UserId
        var InstanceId: InstanceId
    }
    interface UpdateUserIdentityInfoRequest {
        var IdentityInfo: UserIdentityInfo
        var UserId: UserId
        var InstanceId: InstanceId
    }
    interface UpdateUserPhoneConfigRequest {
        var PhoneConfig: UserPhoneConfig
        var UserId: UserId
        var InstanceId: InstanceId
    }
    interface UpdateUserRoutingProfileRequest {
        var RoutingProfileId: RoutingProfileId
        var UserId: UserId
        var InstanceId: InstanceId
    }
    interface UpdateUserSecurityProfilesRequest {
        var SecurityProfileIds: SecurityProfileIds
        var UserId: UserId
        var InstanceId: InstanceId
    }
    interface User {
        var Id: UserId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Username: AgentUsername?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityInfo: UserIdentityInfo?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneConfig: UserPhoneConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DirectoryUserId: DirectoryUserId?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityProfileIds: SecurityProfileIds?
            get() = definedExternally
            set(value) = definedExternally
        var RoutingProfileId: RoutingProfileId?
            get() = definedExternally
            set(value) = definedExternally
        var HierarchyGroupId: HierarchyGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserIdentityInfo {
        var FirstName: AgentFirstName?
            get() = definedExternally
            set(value) = definedExternally
        var LastName: AgentLastName?
            get() = definedExternally
            set(value) = definedExternally
        var Email: Email?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserPhoneConfig {
        var PhoneType: String /* "SOFT_PHONE" | "DESK_PHONE" | String */
        var AutoAccept: AutoAccept?
            get() = definedExternally
            set(value) = definedExternally
        var AfterContactWorkTimeLimit: AfterContactWorkTimeLimit?
            get() = definedExternally
            set(value) = definedExternally
        var DeskPhoneNumber: PhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserSummary {
        var Id: UserId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ARN?
            get() = definedExternally
            set(value) = definedExternally
        var Username: AgentUsername?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-08-08" | "latest" | String */
    }
}