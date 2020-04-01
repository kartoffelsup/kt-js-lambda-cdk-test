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
import AlexaForBusiness.AddressBookData
import AlexaForBusiness.Audio
import AlexaForBusiness.BusinessReportSchedule
import AlexaForBusiness.Category
import AlexaForBusiness.ConferenceProvider
import AlexaForBusiness.ContactData
import AlexaForBusiness.DeviceData
import AlexaForBusiness.DeviceEvent
import AlexaForBusiness.DeviceStatusDetail
import AlexaForBusiness.Filter
import AlexaForBusiness.GatewayGroupSummary
import AlexaForBusiness.GatewaySummary
import AlexaForBusiness.NetworkProfileData
import AlexaForBusiness.PhoneNumber
import AlexaForBusiness.ProfileData
import AlexaForBusiness.RoomData
import AlexaForBusiness.RoomSkillParameter
import AlexaForBusiness.SipAddress
import AlexaForBusiness.SkillGroupData
import AlexaForBusiness.SkillSummary
import AlexaForBusiness.SkillsStoreSkill
import AlexaForBusiness.SmartHomeAppliance
import AlexaForBusiness.Sort
import AlexaForBusiness.Ssml
import AlexaForBusiness.Tag
import AlexaForBusiness.Text
import AlexaForBusiness.UserData
import AlexaForBusiness.ApproveSkillRequest
import AlexaForBusiness.ApproveSkillResponse
import AlexaForBusiness.AssociateContactWithAddressBookRequest
import AlexaForBusiness.AssociateContactWithAddressBookResponse
import AlexaForBusiness.AssociateDeviceWithNetworkProfileRequest
import AlexaForBusiness.AssociateDeviceWithNetworkProfileResponse
import AlexaForBusiness.AssociateDeviceWithRoomRequest
import AlexaForBusiness.AssociateDeviceWithRoomResponse
import AlexaForBusiness.AssociateSkillGroupWithRoomRequest
import AlexaForBusiness.AssociateSkillGroupWithRoomResponse
import AlexaForBusiness.AssociateSkillWithSkillGroupRequest
import AlexaForBusiness.AssociateSkillWithSkillGroupResponse
import AlexaForBusiness.AssociateSkillWithUsersRequest
import AlexaForBusiness.AssociateSkillWithUsersResponse
import AlexaForBusiness.CreateAddressBookRequest
import AlexaForBusiness.CreateAddressBookResponse
import AlexaForBusiness.CreateBusinessReportScheduleRequest
import AlexaForBusiness.CreateBusinessReportScheduleResponse
import AlexaForBusiness.CreateConferenceProviderRequest
import AlexaForBusiness.CreateConferenceProviderResponse
import AlexaForBusiness.CreateContactRequest
import AlexaForBusiness.CreateContactResponse
import AlexaForBusiness.CreateGatewayGroupRequest
import AlexaForBusiness.CreateGatewayGroupResponse
import AlexaForBusiness.CreateNetworkProfileRequest
import AlexaForBusiness.CreateNetworkProfileResponse
import AlexaForBusiness.CreateProfileRequest
import AlexaForBusiness.CreateProfileResponse
import AlexaForBusiness.CreateRoomRequest
import AlexaForBusiness.CreateRoomResponse
import AlexaForBusiness.CreateSkillGroupRequest
import AlexaForBusiness.CreateSkillGroupResponse
import AlexaForBusiness.CreateUserRequest
import AlexaForBusiness.CreateUserResponse
import AlexaForBusiness.DeleteAddressBookRequest
import AlexaForBusiness.DeleteAddressBookResponse
import AlexaForBusiness.DeleteBusinessReportScheduleRequest
import AlexaForBusiness.DeleteBusinessReportScheduleResponse
import AlexaForBusiness.DeleteConferenceProviderRequest
import AlexaForBusiness.DeleteConferenceProviderResponse
import AlexaForBusiness.DeleteContactRequest
import AlexaForBusiness.DeleteContactResponse
import AlexaForBusiness.DeleteDeviceRequest
import AlexaForBusiness.DeleteDeviceResponse
import AlexaForBusiness.DeleteDeviceUsageDataRequest
import AlexaForBusiness.DeleteDeviceUsageDataResponse
import AlexaForBusiness.DeleteGatewayGroupRequest
import AlexaForBusiness.DeleteGatewayGroupResponse
import AlexaForBusiness.DeleteNetworkProfileRequest
import AlexaForBusiness.DeleteNetworkProfileResponse
import AlexaForBusiness.DeleteProfileRequest
import AlexaForBusiness.DeleteProfileResponse
import AlexaForBusiness.DeleteRoomRequest
import AlexaForBusiness.DeleteRoomResponse
import AlexaForBusiness.DeleteRoomSkillParameterRequest
import AlexaForBusiness.DeleteRoomSkillParameterResponse
import AlexaForBusiness.DeleteSkillAuthorizationRequest
import AlexaForBusiness.DeleteSkillAuthorizationResponse
import AlexaForBusiness.DeleteSkillGroupRequest
import AlexaForBusiness.DeleteSkillGroupResponse
import AlexaForBusiness.DeleteUserRequest
import AlexaForBusiness.DeleteUserResponse
import AlexaForBusiness.DisassociateContactFromAddressBookRequest
import AlexaForBusiness.DisassociateContactFromAddressBookResponse
import AlexaForBusiness.DisassociateDeviceFromRoomRequest
import AlexaForBusiness.DisassociateDeviceFromRoomResponse
import AlexaForBusiness.DisassociateSkillFromSkillGroupRequest
import AlexaForBusiness.DisassociateSkillFromSkillGroupResponse
import AlexaForBusiness.DisassociateSkillFromUsersRequest
import AlexaForBusiness.DisassociateSkillFromUsersResponse
import AlexaForBusiness.DisassociateSkillGroupFromRoomRequest
import AlexaForBusiness.DisassociateSkillGroupFromRoomResponse
import AlexaForBusiness.ForgetSmartHomeAppliancesRequest
import AlexaForBusiness.ForgetSmartHomeAppliancesResponse
import AlexaForBusiness.GetAddressBookRequest
import AlexaForBusiness.GetAddressBookResponse
import AlexaForBusiness.GetConferencePreferenceRequest
import AlexaForBusiness.GetConferencePreferenceResponse
import AlexaForBusiness.GetConferenceProviderRequest
import AlexaForBusiness.GetConferenceProviderResponse
import AlexaForBusiness.GetContactRequest
import AlexaForBusiness.GetContactResponse
import AlexaForBusiness.GetDeviceRequest
import AlexaForBusiness.GetDeviceResponse
import AlexaForBusiness.GetGatewayRequest
import AlexaForBusiness.GetGatewayResponse
import AlexaForBusiness.GetGatewayGroupRequest
import AlexaForBusiness.GetGatewayGroupResponse
import AlexaForBusiness.GetInvitationConfigurationRequest
import AlexaForBusiness.GetInvitationConfigurationResponse
import AlexaForBusiness.GetNetworkProfileRequest
import AlexaForBusiness.GetNetworkProfileResponse
import AlexaForBusiness.GetProfileRequest
import AlexaForBusiness.GetProfileResponse
import AlexaForBusiness.GetRoomRequest
import AlexaForBusiness.GetRoomResponse
import AlexaForBusiness.GetRoomSkillParameterRequest
import AlexaForBusiness.GetRoomSkillParameterResponse
import AlexaForBusiness.GetSkillGroupRequest
import AlexaForBusiness.GetSkillGroupResponse
import AlexaForBusiness.ListBusinessReportSchedulesRequest
import AlexaForBusiness.ListBusinessReportSchedulesResponse
import AlexaForBusiness.ListConferenceProvidersRequest
import AlexaForBusiness.ListConferenceProvidersResponse
import AlexaForBusiness.ListDeviceEventsRequest
import AlexaForBusiness.ListDeviceEventsResponse
import AlexaForBusiness.ListGatewayGroupsRequest
import AlexaForBusiness.ListGatewayGroupsResponse
import AlexaForBusiness.ListGatewaysRequest
import AlexaForBusiness.ListGatewaysResponse
import AlexaForBusiness.ListSkillsRequest
import AlexaForBusiness.ListSkillsResponse
import AlexaForBusiness.ListSkillsStoreCategoriesRequest
import AlexaForBusiness.ListSkillsStoreCategoriesResponse
import AlexaForBusiness.ListSkillsStoreSkillsByCategoryRequest
import AlexaForBusiness.ListSkillsStoreSkillsByCategoryResponse
import AlexaForBusiness.ListSmartHomeAppliancesRequest
import AlexaForBusiness.ListSmartHomeAppliancesResponse
import AlexaForBusiness.ListTagsRequest
import AlexaForBusiness.ListTagsResponse
import AlexaForBusiness.PutConferencePreferenceRequest
import AlexaForBusiness.PutConferencePreferenceResponse
import AlexaForBusiness.PutInvitationConfigurationRequest
import AlexaForBusiness.PutInvitationConfigurationResponse
import AlexaForBusiness.PutRoomSkillParameterRequest
import AlexaForBusiness.PutRoomSkillParameterResponse
import AlexaForBusiness.PutSkillAuthorizationRequest
import AlexaForBusiness.PutSkillAuthorizationResponse
import AlexaForBusiness.RegisterAVSDeviceRequest
import AlexaForBusiness.RegisterAVSDeviceResponse
import AlexaForBusiness.RejectSkillRequest
import AlexaForBusiness.RejectSkillResponse
import AlexaForBusiness.ResolveRoomRequest
import AlexaForBusiness.ResolveRoomResponse
import AlexaForBusiness.RevokeInvitationRequest
import AlexaForBusiness.RevokeInvitationResponse
import AlexaForBusiness.SearchAddressBooksRequest
import AlexaForBusiness.SearchAddressBooksResponse
import AlexaForBusiness.SearchContactsRequest
import AlexaForBusiness.SearchContactsResponse
import AlexaForBusiness.SearchDevicesRequest
import AlexaForBusiness.SearchDevicesResponse
import AlexaForBusiness.SearchNetworkProfilesRequest
import AlexaForBusiness.SearchNetworkProfilesResponse
import AlexaForBusiness.SearchProfilesRequest
import AlexaForBusiness.SearchProfilesResponse
import AlexaForBusiness.SearchRoomsRequest
import AlexaForBusiness.SearchRoomsResponse
import AlexaForBusiness.SearchSkillGroupsRequest
import AlexaForBusiness.SearchSkillGroupsResponse
import AlexaForBusiness.SearchUsersRequest
import AlexaForBusiness.SearchUsersResponse
import AlexaForBusiness.SendAnnouncementRequest
import AlexaForBusiness.SendAnnouncementResponse
import AlexaForBusiness.SendInvitationRequest
import AlexaForBusiness.SendInvitationResponse
import AlexaForBusiness.StartDeviceSyncRequest
import AlexaForBusiness.StartDeviceSyncResponse
import AlexaForBusiness.StartSmartHomeApplianceDiscoveryRequest
import AlexaForBusiness.StartSmartHomeApplianceDiscoveryResponse
import AlexaForBusiness.TagResourceRequest
import AlexaForBusiness.TagResourceResponse
import AlexaForBusiness.UntagResourceRequest
import AlexaForBusiness.UntagResourceResponse
import AlexaForBusiness.UpdateAddressBookRequest
import AlexaForBusiness.UpdateAddressBookResponse
import AlexaForBusiness.UpdateBusinessReportScheduleRequest
import AlexaForBusiness.UpdateBusinessReportScheduleResponse
import AlexaForBusiness.UpdateConferenceProviderRequest
import AlexaForBusiness.UpdateConferenceProviderResponse
import AlexaForBusiness.UpdateContactRequest
import AlexaForBusiness.UpdateContactResponse
import AlexaForBusiness.UpdateDeviceRequest
import AlexaForBusiness.UpdateDeviceResponse
import AlexaForBusiness.UpdateGatewayRequest
import AlexaForBusiness.UpdateGatewayResponse
import AlexaForBusiness.UpdateGatewayGroupRequest
import AlexaForBusiness.UpdateGatewayGroupResponse
import AlexaForBusiness.UpdateNetworkProfileRequest
import AlexaForBusiness.UpdateNetworkProfileResponse
import AlexaForBusiness.UpdateProfileRequest
import AlexaForBusiness.UpdateProfileResponse
import AlexaForBusiness.UpdateRoomRequest
import AlexaForBusiness.UpdateRoomResponse
import AlexaForBusiness.UpdateSkillGroupRequest
import AlexaForBusiness.UpdateSkillGroupResponse
import AlexaForBusiness.BusinessReportS3Location
import AlexaForBusiness.BusinessReportContentRange
import AlexaForBusiness.BusinessReportRecurrence
import AlexaForBusiness.BusinessReport
import AlexaForBusiness.IPDialIn
import AlexaForBusiness.PSTNDialIn
import AlexaForBusiness.MeetingSetting
import AlexaForBusiness.CreateEndOfMeetingReminder
import AlexaForBusiness.CreateInstantBooking
import AlexaForBusiness.CreateRequireCheckIn
import AlexaForBusiness.CreateMeetingRoomConfiguration
import AlexaForBusiness.DeviceStatusInfo
import AlexaForBusiness.DeviceNetworkProfileInfo
import AlexaForBusiness.AddressBook
import AlexaForBusiness.ConferencePreference
import AlexaForBusiness.Contact
import AlexaForBusiness.Device
import AlexaForBusiness.GatewayGroup
import AlexaForBusiness.Gateway
import AlexaForBusiness.NetworkProfile
import AlexaForBusiness.Profile
import AlexaForBusiness.Room
import AlexaForBusiness.SkillGroup
import AlexaForBusiness.EndOfMeetingReminder
import AlexaForBusiness.InstantBooking
import AlexaForBusiness.RequireCheckIn
import AlexaForBusiness.MeetingRoomConfiguration
import AlexaForBusiness.AuthorizationResult
import AlexaForBusiness.Content
import AlexaForBusiness.Reviews
import AlexaForBusiness.DeveloperInfo
import AlexaForBusiness.SkillDetails
import AlexaForBusiness.UpdateEndOfMeetingReminder
import AlexaForBusiness.UpdateInstantBooking
import AlexaForBusiness.UpdateRequireCheckIn
import AlexaForBusiness.UpdateMeetingRoomConfiguration

typealias Address = String

typealias AddressBookDataList = Array<AddressBookData>

typealias AddressBookDescription = String

typealias AddressBookName = String

typealias AmazonId = String

typealias ApplianceDescription = String

typealias ApplianceFriendlyName = String

typealias ApplianceManufacturerName = String

typealias Arn = String

typealias AudioList = Array<Audio>

typealias AudioLocation = String

typealias Boolean = Boolean

typealias BulletPoint = String

typealias BulletPoints = Array<BulletPoint>

typealias BusinessReportDeliveryTime = Date

typealias BusinessReportDownloadUrl = String

typealias BusinessReportS3Path = String

typealias BusinessReportScheduleList = Array<BusinessReportSchedule>

typealias BusinessReportScheduleName = String

typealias CategoryId = Number

typealias CategoryList = Array<Category>

typealias CategoryName = String

typealias CertificateTime = Date

typealias ClientId = String

typealias ClientRequestToken = String

typealias ConferenceProviderName = String

typealias ConferenceProvidersList = Array<ConferenceProvider>

typealias ConnectionStatusUpdatedTime = Date

typealias ContactDataList = Array<ContactData>

typealias ContactName = String

typealias CountryCode = String

typealias CurrentWiFiPassword = String

typealias CustomerS3BucketName = String

typealias _Date = String

typealias DeveloperName = String

typealias DeviceDataCreatedTime = Date

typealias DeviceDataList = Array<DeviceData>

typealias DeviceEventList = Array<DeviceEvent>

typealias DeviceEventTime = Date

typealias DeviceEventValue = String

typealias DeviceLocale = String

typealias DeviceName = String

typealias DeviceSerialNumber = String

typealias DeviceSerialNumberForAVS = String

typealias DeviceStatusDetails = Array<DeviceStatusDetail>

typealias DeviceType = String

typealias Email = String

typealias EndOfMeetingReminderMinutesList = Array<Minutes>

typealias EndUserLicenseAgreement = String

typealias Endpoint = String

typealias EnrollmentId = String

typealias Features = Array<String /* "BLUETOOTH" | "VOLUME" | "NOTIFICATIONS" | "LISTS" | "SKILLS" | "NETWORK_PROFILE" | "SETTINGS" | "ALL" | String */>

typealias FilterKey = String

typealias FilterList = Array<Filter>

typealias FilterValue = String

typealias FilterValueList = Array<FilterValue>

typealias GatewayDescription = String

typealias GatewayGroupDescription = String

typealias GatewayGroupName = String

typealias GatewayGroupSummaries = Array<GatewayGroupSummary>

typealias GatewayName = String

typealias GatewaySummaries = Array<GatewaySummary>

typealias GatewayVersion = String

typealias GenericKeyword = String

typealias GenericKeywords = Array<GenericKeyword>

typealias IconUrl = String

typealias InvocationPhrase = String

typealias Key = String

typealias MacAddress = String

typealias MaxResults = Number

typealias MaxVolumeLimit = Number

typealias Minutes = Number

typealias NetworkProfileDataList = Array<NetworkProfileData>

typealias NetworkProfileDescription = String

typealias NetworkProfileName = String

typealias NetworkSsid = String

typealias NewInThisVersionBulletPoints = Array<BulletPoint>

typealias NextToken = String

typealias NextWiFiPassword = String

typealias OneClickIdDelay = String

typealias OneClickPinDelay = String

typealias OrganizationName = String

typealias OutboundPhoneNumber = String

typealias PhoneNumberList = Array<PhoneNumber>

typealias PrivacyPolicy = String

typealias ProductDescription = String

typealias ProductId = String

typealias ProfileDataList = Array<ProfileData>

typealias ProfileName = String

typealias ProviderCalendarId = String

typealias RawPhoneNumber = String

typealias ReleaseDate = String

typealias ReviewKey = String

typealias ReviewValue = String

typealias RoomDataList = Array<RoomData>

typealias RoomDescription = String

typealias RoomName = String

typealias RoomSkillParameterKey = String

typealias RoomSkillParameterValue = String

typealias RoomSkillParameters = Array<RoomSkillParameter>

typealias S3KeyPrefix = String

typealias SampleUtterances = Array<Utterance>

typealias ShortDescription = String

typealias ShortSkillIdList = Array<SkillId>

typealias SipAddressList = Array<SipAddress>

typealias SipUri = String

typealias SkillGroupDataList = Array<SkillGroupData>

typealias SkillGroupDescription = String

typealias SkillGroupName = String

typealias SkillId = String

typealias SkillListMaxResults = Number

typealias SkillName = String

typealias SkillStoreType = String

typealias SkillSummaryList = Array<SkillSummary>

typealias SkillTypes = Array<SkillStoreType>

typealias SkillsStoreSkillList = Array<SkillsStoreSkill>

typealias SmartHomeApplianceList = Array<SmartHomeAppliance>

typealias SoftwareVersion = String

typealias SortKey = String

typealias SortList = Array<Sort>

typealias SsmlList = Array<Ssml>

typealias SsmlValue = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias TextList = Array<Text>

typealias TextValue = String

typealias TimeToLiveInSeconds = Number

typealias Timezone = String

typealias TotalCount = Number

typealias TrustAnchor = String

typealias TrustAnchorList = Array<TrustAnchor>

typealias Url = String

typealias UserCode = String

typealias UserDataList = Array<UserData>

typealias UserId = String

typealias Utterance = String

typealias Value = String

typealias user_FirstName = String

typealias user_LastName = String

typealias user_UserId = String

@JsModule("aws-sdk")
external open class AlexaForBusiness(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & AlexaForBusiness.Types.ClientConfiguration */
    open fun approveSkill(params: ApproveSkillRequest, callback: (err: AWSError, data: ApproveSkillResponse) -> Unit = definedExternally): Request<ApproveSkillResponse, AWSError>
    open fun approveSkill(callback: (err: AWSError, data: ApproveSkillResponse) -> Unit = definedExternally): Request<ApproveSkillResponse, AWSError>
    open fun associateContactWithAddressBook(params: AssociateContactWithAddressBookRequest, callback: (err: AWSError, data: AssociateContactWithAddressBookResponse) -> Unit = definedExternally): Request<AssociateContactWithAddressBookResponse, AWSError>
    open fun associateContactWithAddressBook(callback: (err: AWSError, data: AssociateContactWithAddressBookResponse) -> Unit = definedExternally): Request<AssociateContactWithAddressBookResponse, AWSError>
    open fun associateDeviceWithNetworkProfile(params: AssociateDeviceWithNetworkProfileRequest, callback: (err: AWSError, data: AssociateDeviceWithNetworkProfileResponse) -> Unit = definedExternally): Request<AssociateDeviceWithNetworkProfileResponse, AWSError>
    open fun associateDeviceWithNetworkProfile(callback: (err: AWSError, data: AssociateDeviceWithNetworkProfileResponse) -> Unit = definedExternally): Request<AssociateDeviceWithNetworkProfileResponse, AWSError>
    open fun associateDeviceWithRoom(params: AssociateDeviceWithRoomRequest, callback: (err: AWSError, data: AssociateDeviceWithRoomResponse) -> Unit = definedExternally): Request<AssociateDeviceWithRoomResponse, AWSError>
    open fun associateDeviceWithRoom(callback: (err: AWSError, data: AssociateDeviceWithRoomResponse) -> Unit = definedExternally): Request<AssociateDeviceWithRoomResponse, AWSError>
    open fun associateSkillGroupWithRoom(params: AssociateSkillGroupWithRoomRequest, callback: (err: AWSError, data: AssociateSkillGroupWithRoomResponse) -> Unit = definedExternally): Request<AssociateSkillGroupWithRoomResponse, AWSError>
    open fun associateSkillGroupWithRoom(callback: (err: AWSError, data: AssociateSkillGroupWithRoomResponse) -> Unit = definedExternally): Request<AssociateSkillGroupWithRoomResponse, AWSError>
    open fun associateSkillWithSkillGroup(params: AssociateSkillWithSkillGroupRequest, callback: (err: AWSError, data: AssociateSkillWithSkillGroupResponse) -> Unit = definedExternally): Request<AssociateSkillWithSkillGroupResponse, AWSError>
    open fun associateSkillWithSkillGroup(callback: (err: AWSError, data: AssociateSkillWithSkillGroupResponse) -> Unit = definedExternally): Request<AssociateSkillWithSkillGroupResponse, AWSError>
    open fun associateSkillWithUsers(params: AssociateSkillWithUsersRequest, callback: (err: AWSError, data: AssociateSkillWithUsersResponse) -> Unit = definedExternally): Request<AssociateSkillWithUsersResponse, AWSError>
    open fun associateSkillWithUsers(callback: (err: AWSError, data: AssociateSkillWithUsersResponse) -> Unit = definedExternally): Request<AssociateSkillWithUsersResponse, AWSError>
    open fun createAddressBook(params: CreateAddressBookRequest, callback: (err: AWSError, data: CreateAddressBookResponse) -> Unit = definedExternally): Request<CreateAddressBookResponse, AWSError>
    open fun createAddressBook(callback: (err: AWSError, data: CreateAddressBookResponse) -> Unit = definedExternally): Request<CreateAddressBookResponse, AWSError>
    open fun createBusinessReportSchedule(params: CreateBusinessReportScheduleRequest, callback: (err: AWSError, data: CreateBusinessReportScheduleResponse) -> Unit = definedExternally): Request<CreateBusinessReportScheduleResponse, AWSError>
    open fun createBusinessReportSchedule(callback: (err: AWSError, data: CreateBusinessReportScheduleResponse) -> Unit = definedExternally): Request<CreateBusinessReportScheduleResponse, AWSError>
    open fun createConferenceProvider(params: CreateConferenceProviderRequest, callback: (err: AWSError, data: CreateConferenceProviderResponse) -> Unit = definedExternally): Request<CreateConferenceProviderResponse, AWSError>
    open fun createConferenceProvider(callback: (err: AWSError, data: CreateConferenceProviderResponse) -> Unit = definedExternally): Request<CreateConferenceProviderResponse, AWSError>
    open fun createContact(params: CreateContactRequest, callback: (err: AWSError, data: CreateContactResponse) -> Unit = definedExternally): Request<CreateContactResponse, AWSError>
    open fun createContact(callback: (err: AWSError, data: CreateContactResponse) -> Unit = definedExternally): Request<CreateContactResponse, AWSError>
    open fun createGatewayGroup(params: CreateGatewayGroupRequest, callback: (err: AWSError, data: CreateGatewayGroupResponse) -> Unit = definedExternally): Request<CreateGatewayGroupResponse, AWSError>
    open fun createGatewayGroup(callback: (err: AWSError, data: CreateGatewayGroupResponse) -> Unit = definedExternally): Request<CreateGatewayGroupResponse, AWSError>
    open fun createNetworkProfile(params: CreateNetworkProfileRequest, callback: (err: AWSError, data: CreateNetworkProfileResponse) -> Unit = definedExternally): Request<CreateNetworkProfileResponse, AWSError>
    open fun createNetworkProfile(callback: (err: AWSError, data: CreateNetworkProfileResponse) -> Unit = definedExternally): Request<CreateNetworkProfileResponse, AWSError>
    open fun createProfile(params: CreateProfileRequest, callback: (err: AWSError, data: CreateProfileResponse) -> Unit = definedExternally): Request<CreateProfileResponse, AWSError>
    open fun createProfile(callback: (err: AWSError, data: CreateProfileResponse) -> Unit = definedExternally): Request<CreateProfileResponse, AWSError>
    open fun createRoom(params: CreateRoomRequest, callback: (err: AWSError, data: CreateRoomResponse) -> Unit = definedExternally): Request<CreateRoomResponse, AWSError>
    open fun createRoom(callback: (err: AWSError, data: CreateRoomResponse) -> Unit = definedExternally): Request<CreateRoomResponse, AWSError>
    open fun createSkillGroup(params: CreateSkillGroupRequest, callback: (err: AWSError, data: CreateSkillGroupResponse) -> Unit = definedExternally): Request<CreateSkillGroupResponse, AWSError>
    open fun createSkillGroup(callback: (err: AWSError, data: CreateSkillGroupResponse) -> Unit = definedExternally): Request<CreateSkillGroupResponse, AWSError>
    open fun createUser(params: CreateUserRequest, callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun createUser(callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun deleteAddressBook(params: DeleteAddressBookRequest, callback: (err: AWSError, data: DeleteAddressBookResponse) -> Unit = definedExternally): Request<DeleteAddressBookResponse, AWSError>
    open fun deleteAddressBook(callback: (err: AWSError, data: DeleteAddressBookResponse) -> Unit = definedExternally): Request<DeleteAddressBookResponse, AWSError>
    open fun deleteBusinessReportSchedule(params: DeleteBusinessReportScheduleRequest, callback: (err: AWSError, data: DeleteBusinessReportScheduleResponse) -> Unit = definedExternally): Request<DeleteBusinessReportScheduleResponse, AWSError>
    open fun deleteBusinessReportSchedule(callback: (err: AWSError, data: DeleteBusinessReportScheduleResponse) -> Unit = definedExternally): Request<DeleteBusinessReportScheduleResponse, AWSError>
    open fun deleteConferenceProvider(params: DeleteConferenceProviderRequest, callback: (err: AWSError, data: DeleteConferenceProviderResponse) -> Unit = definedExternally): Request<DeleteConferenceProviderResponse, AWSError>
    open fun deleteConferenceProvider(callback: (err: AWSError, data: DeleteConferenceProviderResponse) -> Unit = definedExternally): Request<DeleteConferenceProviderResponse, AWSError>
    open fun deleteContact(params: DeleteContactRequest, callback: (err: AWSError, data: DeleteContactResponse) -> Unit = definedExternally): Request<DeleteContactResponse, AWSError>
    open fun deleteContact(callback: (err: AWSError, data: DeleteContactResponse) -> Unit = definedExternally): Request<DeleteContactResponse, AWSError>
    open fun deleteDevice(params: DeleteDeviceRequest, callback: (err: AWSError, data: DeleteDeviceResponse) -> Unit = definedExternally): Request<DeleteDeviceResponse, AWSError>
    open fun deleteDevice(callback: (err: AWSError, data: DeleteDeviceResponse) -> Unit = definedExternally): Request<DeleteDeviceResponse, AWSError>
    open fun deleteDeviceUsageData(params: DeleteDeviceUsageDataRequest, callback: (err: AWSError, data: DeleteDeviceUsageDataResponse) -> Unit = definedExternally): Request<DeleteDeviceUsageDataResponse, AWSError>
    open fun deleteDeviceUsageData(callback: (err: AWSError, data: DeleteDeviceUsageDataResponse) -> Unit = definedExternally): Request<DeleteDeviceUsageDataResponse, AWSError>
    open fun deleteGatewayGroup(params: DeleteGatewayGroupRequest, callback: (err: AWSError, data: DeleteGatewayGroupResponse) -> Unit = definedExternally): Request<DeleteGatewayGroupResponse, AWSError>
    open fun deleteGatewayGroup(callback: (err: AWSError, data: DeleteGatewayGroupResponse) -> Unit = definedExternally): Request<DeleteGatewayGroupResponse, AWSError>
    open fun deleteNetworkProfile(params: DeleteNetworkProfileRequest, callback: (err: AWSError, data: DeleteNetworkProfileResponse) -> Unit = definedExternally): Request<DeleteNetworkProfileResponse, AWSError>
    open fun deleteNetworkProfile(callback: (err: AWSError, data: DeleteNetworkProfileResponse) -> Unit = definedExternally): Request<DeleteNetworkProfileResponse, AWSError>
    open fun deleteProfile(params: DeleteProfileRequest, callback: (err: AWSError, data: DeleteProfileResponse) -> Unit = definedExternally): Request<DeleteProfileResponse, AWSError>
    open fun deleteProfile(callback: (err: AWSError, data: DeleteProfileResponse) -> Unit = definedExternally): Request<DeleteProfileResponse, AWSError>
    open fun deleteRoom(params: DeleteRoomRequest, callback: (err: AWSError, data: DeleteRoomResponse) -> Unit = definedExternally): Request<DeleteRoomResponse, AWSError>
    open fun deleteRoom(callback: (err: AWSError, data: DeleteRoomResponse) -> Unit = definedExternally): Request<DeleteRoomResponse, AWSError>
    open fun deleteRoomSkillParameter(params: DeleteRoomSkillParameterRequest, callback: (err: AWSError, data: DeleteRoomSkillParameterResponse) -> Unit = definedExternally): Request<DeleteRoomSkillParameterResponse, AWSError>
    open fun deleteRoomSkillParameter(callback: (err: AWSError, data: DeleteRoomSkillParameterResponse) -> Unit = definedExternally): Request<DeleteRoomSkillParameterResponse, AWSError>
    open fun deleteSkillAuthorization(params: DeleteSkillAuthorizationRequest, callback: (err: AWSError, data: DeleteSkillAuthorizationResponse) -> Unit = definedExternally): Request<DeleteSkillAuthorizationResponse, AWSError>
    open fun deleteSkillAuthorization(callback: (err: AWSError, data: DeleteSkillAuthorizationResponse) -> Unit = definedExternally): Request<DeleteSkillAuthorizationResponse, AWSError>
    open fun deleteSkillGroup(params: DeleteSkillGroupRequest, callback: (err: AWSError, data: DeleteSkillGroupResponse) -> Unit = definedExternally): Request<DeleteSkillGroupResponse, AWSError>
    open fun deleteSkillGroup(callback: (err: AWSError, data: DeleteSkillGroupResponse) -> Unit = definedExternally): Request<DeleteSkillGroupResponse, AWSError>
    open fun deleteUser(params: DeleteUserRequest, callback: (err: AWSError, data: DeleteUserResponse) -> Unit = definedExternally): Request<DeleteUserResponse, AWSError>
    open fun deleteUser(callback: (err: AWSError, data: DeleteUserResponse) -> Unit = definedExternally): Request<DeleteUserResponse, AWSError>
    open fun disassociateContactFromAddressBook(params: DisassociateContactFromAddressBookRequest, callback: (err: AWSError, data: DisassociateContactFromAddressBookResponse) -> Unit = definedExternally): Request<DisassociateContactFromAddressBookResponse, AWSError>
    open fun disassociateContactFromAddressBook(callback: (err: AWSError, data: DisassociateContactFromAddressBookResponse) -> Unit = definedExternally): Request<DisassociateContactFromAddressBookResponse, AWSError>
    open fun disassociateDeviceFromRoom(params: DisassociateDeviceFromRoomRequest, callback: (err: AWSError, data: DisassociateDeviceFromRoomResponse) -> Unit = definedExternally): Request<DisassociateDeviceFromRoomResponse, AWSError>
    open fun disassociateDeviceFromRoom(callback: (err: AWSError, data: DisassociateDeviceFromRoomResponse) -> Unit = definedExternally): Request<DisassociateDeviceFromRoomResponse, AWSError>
    open fun disassociateSkillFromSkillGroup(params: DisassociateSkillFromSkillGroupRequest, callback: (err: AWSError, data: DisassociateSkillFromSkillGroupResponse) -> Unit = definedExternally): Request<DisassociateSkillFromSkillGroupResponse, AWSError>
    open fun disassociateSkillFromSkillGroup(callback: (err: AWSError, data: DisassociateSkillFromSkillGroupResponse) -> Unit = definedExternally): Request<DisassociateSkillFromSkillGroupResponse, AWSError>
    open fun disassociateSkillFromUsers(params: DisassociateSkillFromUsersRequest, callback: (err: AWSError, data: DisassociateSkillFromUsersResponse) -> Unit = definedExternally): Request<DisassociateSkillFromUsersResponse, AWSError>
    open fun disassociateSkillFromUsers(callback: (err: AWSError, data: DisassociateSkillFromUsersResponse) -> Unit = definedExternally): Request<DisassociateSkillFromUsersResponse, AWSError>
    open fun disassociateSkillGroupFromRoom(params: DisassociateSkillGroupFromRoomRequest, callback: (err: AWSError, data: DisassociateSkillGroupFromRoomResponse) -> Unit = definedExternally): Request<DisassociateSkillGroupFromRoomResponse, AWSError>
    open fun disassociateSkillGroupFromRoom(callback: (err: AWSError, data: DisassociateSkillGroupFromRoomResponse) -> Unit = definedExternally): Request<DisassociateSkillGroupFromRoomResponse, AWSError>
    open fun forgetSmartHomeAppliances(params: ForgetSmartHomeAppliancesRequest, callback: (err: AWSError, data: ForgetSmartHomeAppliancesResponse) -> Unit = definedExternally): Request<ForgetSmartHomeAppliancesResponse, AWSError>
    open fun forgetSmartHomeAppliances(callback: (err: AWSError, data: ForgetSmartHomeAppliancesResponse) -> Unit = definedExternally): Request<ForgetSmartHomeAppliancesResponse, AWSError>
    open fun getAddressBook(params: GetAddressBookRequest, callback: (err: AWSError, data: GetAddressBookResponse) -> Unit = definedExternally): Request<GetAddressBookResponse, AWSError>
    open fun getAddressBook(callback: (err: AWSError, data: GetAddressBookResponse) -> Unit = definedExternally): Request<GetAddressBookResponse, AWSError>
    open fun getConferencePreference(params: GetConferencePreferenceRequest, callback: (err: AWSError, data: GetConferencePreferenceResponse) -> Unit = definedExternally): Request<GetConferencePreferenceResponse, AWSError>
    open fun getConferencePreference(callback: (err: AWSError, data: GetConferencePreferenceResponse) -> Unit = definedExternally): Request<GetConferencePreferenceResponse, AWSError>
    open fun getConferenceProvider(params: GetConferenceProviderRequest, callback: (err: AWSError, data: GetConferenceProviderResponse) -> Unit = definedExternally): Request<GetConferenceProviderResponse, AWSError>
    open fun getConferenceProvider(callback: (err: AWSError, data: GetConferenceProviderResponse) -> Unit = definedExternally): Request<GetConferenceProviderResponse, AWSError>
    open fun getContact(params: GetContactRequest, callback: (err: AWSError, data: GetContactResponse) -> Unit = definedExternally): Request<GetContactResponse, AWSError>
    open fun getContact(callback: (err: AWSError, data: GetContactResponse) -> Unit = definedExternally): Request<GetContactResponse, AWSError>
    open fun getDevice(params: GetDeviceRequest, callback: (err: AWSError, data: GetDeviceResponse) -> Unit = definedExternally): Request<GetDeviceResponse, AWSError>
    open fun getDevice(callback: (err: AWSError, data: GetDeviceResponse) -> Unit = definedExternally): Request<GetDeviceResponse, AWSError>
    open fun getGateway(params: GetGatewayRequest, callback: (err: AWSError, data: GetGatewayResponse) -> Unit = definedExternally): Request<GetGatewayResponse, AWSError>
    open fun getGateway(callback: (err: AWSError, data: GetGatewayResponse) -> Unit = definedExternally): Request<GetGatewayResponse, AWSError>
    open fun getGatewayGroup(params: GetGatewayGroupRequest, callback: (err: AWSError, data: GetGatewayGroupResponse) -> Unit = definedExternally): Request<GetGatewayGroupResponse, AWSError>
    open fun getGatewayGroup(callback: (err: AWSError, data: GetGatewayGroupResponse) -> Unit = definedExternally): Request<GetGatewayGroupResponse, AWSError>
    open fun getInvitationConfiguration(params: GetInvitationConfigurationRequest, callback: (err: AWSError, data: GetInvitationConfigurationResponse) -> Unit = definedExternally): Request<GetInvitationConfigurationResponse, AWSError>
    open fun getInvitationConfiguration(callback: (err: AWSError, data: GetInvitationConfigurationResponse) -> Unit = definedExternally): Request<GetInvitationConfigurationResponse, AWSError>
    open fun getNetworkProfile(params: GetNetworkProfileRequest, callback: (err: AWSError, data: GetNetworkProfileResponse) -> Unit = definedExternally): Request<GetNetworkProfileResponse, AWSError>
    open fun getNetworkProfile(callback: (err: AWSError, data: GetNetworkProfileResponse) -> Unit = definedExternally): Request<GetNetworkProfileResponse, AWSError>
    open fun getProfile(params: GetProfileRequest, callback: (err: AWSError, data: GetProfileResponse) -> Unit = definedExternally): Request<GetProfileResponse, AWSError>
    open fun getProfile(callback: (err: AWSError, data: GetProfileResponse) -> Unit = definedExternally): Request<GetProfileResponse, AWSError>
    open fun getRoom(params: GetRoomRequest, callback: (err: AWSError, data: GetRoomResponse) -> Unit = definedExternally): Request<GetRoomResponse, AWSError>
    open fun getRoom(callback: (err: AWSError, data: GetRoomResponse) -> Unit = definedExternally): Request<GetRoomResponse, AWSError>
    open fun getRoomSkillParameter(params: GetRoomSkillParameterRequest, callback: (err: AWSError, data: GetRoomSkillParameterResponse) -> Unit = definedExternally): Request<GetRoomSkillParameterResponse, AWSError>
    open fun getRoomSkillParameter(callback: (err: AWSError, data: GetRoomSkillParameterResponse) -> Unit = definedExternally): Request<GetRoomSkillParameterResponse, AWSError>
    open fun getSkillGroup(params: GetSkillGroupRequest, callback: (err: AWSError, data: GetSkillGroupResponse) -> Unit = definedExternally): Request<GetSkillGroupResponse, AWSError>
    open fun getSkillGroup(callback: (err: AWSError, data: GetSkillGroupResponse) -> Unit = definedExternally): Request<GetSkillGroupResponse, AWSError>
    open fun listBusinessReportSchedules(params: ListBusinessReportSchedulesRequest, callback: (err: AWSError, data: ListBusinessReportSchedulesResponse) -> Unit = definedExternally): Request<ListBusinessReportSchedulesResponse, AWSError>
    open fun listBusinessReportSchedules(callback: (err: AWSError, data: ListBusinessReportSchedulesResponse) -> Unit = definedExternally): Request<ListBusinessReportSchedulesResponse, AWSError>
    open fun listConferenceProviders(params: ListConferenceProvidersRequest, callback: (err: AWSError, data: ListConferenceProvidersResponse) -> Unit = definedExternally): Request<ListConferenceProvidersResponse, AWSError>
    open fun listConferenceProviders(callback: (err: AWSError, data: ListConferenceProvidersResponse) -> Unit = definedExternally): Request<ListConferenceProvidersResponse, AWSError>
    open fun listDeviceEvents(params: ListDeviceEventsRequest, callback: (err: AWSError, data: ListDeviceEventsResponse) -> Unit = definedExternally): Request<ListDeviceEventsResponse, AWSError>
    open fun listDeviceEvents(callback: (err: AWSError, data: ListDeviceEventsResponse) -> Unit = definedExternally): Request<ListDeviceEventsResponse, AWSError>
    open fun listGatewayGroups(params: ListGatewayGroupsRequest, callback: (err: AWSError, data: ListGatewayGroupsResponse) -> Unit = definedExternally): Request<ListGatewayGroupsResponse, AWSError>
    open fun listGatewayGroups(callback: (err: AWSError, data: ListGatewayGroupsResponse) -> Unit = definedExternally): Request<ListGatewayGroupsResponse, AWSError>
    open fun listGateways(params: ListGatewaysRequest, callback: (err: AWSError, data: ListGatewaysResponse) -> Unit = definedExternally): Request<ListGatewaysResponse, AWSError>
    open fun listGateways(callback: (err: AWSError, data: ListGatewaysResponse) -> Unit = definedExternally): Request<ListGatewaysResponse, AWSError>
    open fun listSkills(params: ListSkillsRequest, callback: (err: AWSError, data: ListSkillsResponse) -> Unit = definedExternally): Request<ListSkillsResponse, AWSError>
    open fun listSkills(callback: (err: AWSError, data: ListSkillsResponse) -> Unit = definedExternally): Request<ListSkillsResponse, AWSError>
    open fun listSkillsStoreCategories(params: ListSkillsStoreCategoriesRequest, callback: (err: AWSError, data: ListSkillsStoreCategoriesResponse) -> Unit = definedExternally): Request<ListSkillsStoreCategoriesResponse, AWSError>
    open fun listSkillsStoreCategories(callback: (err: AWSError, data: ListSkillsStoreCategoriesResponse) -> Unit = definedExternally): Request<ListSkillsStoreCategoriesResponse, AWSError>
    open fun listSkillsStoreSkillsByCategory(params: ListSkillsStoreSkillsByCategoryRequest, callback: (err: AWSError, data: ListSkillsStoreSkillsByCategoryResponse) -> Unit = definedExternally): Request<ListSkillsStoreSkillsByCategoryResponse, AWSError>
    open fun listSkillsStoreSkillsByCategory(callback: (err: AWSError, data: ListSkillsStoreSkillsByCategoryResponse) -> Unit = definedExternally): Request<ListSkillsStoreSkillsByCategoryResponse, AWSError>
    open fun listSmartHomeAppliances(params: ListSmartHomeAppliancesRequest, callback: (err: AWSError, data: ListSmartHomeAppliancesResponse) -> Unit = definedExternally): Request<ListSmartHomeAppliancesResponse, AWSError>
    open fun listSmartHomeAppliances(callback: (err: AWSError, data: ListSmartHomeAppliancesResponse) -> Unit = definedExternally): Request<ListSmartHomeAppliancesResponse, AWSError>
    open fun listTags(params: ListTagsRequest, callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun putConferencePreference(params: PutConferencePreferenceRequest, callback: (err: AWSError, data: PutConferencePreferenceResponse) -> Unit = definedExternally): Request<PutConferencePreferenceResponse, AWSError>
    open fun putConferencePreference(callback: (err: AWSError, data: PutConferencePreferenceResponse) -> Unit = definedExternally): Request<PutConferencePreferenceResponse, AWSError>
    open fun putInvitationConfiguration(params: PutInvitationConfigurationRequest, callback: (err: AWSError, data: PutInvitationConfigurationResponse) -> Unit = definedExternally): Request<PutInvitationConfigurationResponse, AWSError>
    open fun putInvitationConfiguration(callback: (err: AWSError, data: PutInvitationConfigurationResponse) -> Unit = definedExternally): Request<PutInvitationConfigurationResponse, AWSError>
    open fun putRoomSkillParameter(params: PutRoomSkillParameterRequest, callback: (err: AWSError, data: PutRoomSkillParameterResponse) -> Unit = definedExternally): Request<PutRoomSkillParameterResponse, AWSError>
    open fun putRoomSkillParameter(callback: (err: AWSError, data: PutRoomSkillParameterResponse) -> Unit = definedExternally): Request<PutRoomSkillParameterResponse, AWSError>
    open fun putSkillAuthorization(params: PutSkillAuthorizationRequest, callback: (err: AWSError, data: PutSkillAuthorizationResponse) -> Unit = definedExternally): Request<PutSkillAuthorizationResponse, AWSError>
    open fun putSkillAuthorization(callback: (err: AWSError, data: PutSkillAuthorizationResponse) -> Unit = definedExternally): Request<PutSkillAuthorizationResponse, AWSError>
    open fun registerAVSDevice(params: RegisterAVSDeviceRequest, callback: (err: AWSError, data: RegisterAVSDeviceResponse) -> Unit = definedExternally): Request<RegisterAVSDeviceResponse, AWSError>
    open fun registerAVSDevice(callback: (err: AWSError, data: RegisterAVSDeviceResponse) -> Unit = definedExternally): Request<RegisterAVSDeviceResponse, AWSError>
    open fun rejectSkill(params: RejectSkillRequest, callback: (err: AWSError, data: RejectSkillResponse) -> Unit = definedExternally): Request<RejectSkillResponse, AWSError>
    open fun rejectSkill(callback: (err: AWSError, data: RejectSkillResponse) -> Unit = definedExternally): Request<RejectSkillResponse, AWSError>
    open fun resolveRoom(params: ResolveRoomRequest, callback: (err: AWSError, data: ResolveRoomResponse) -> Unit = definedExternally): Request<ResolveRoomResponse, AWSError>
    open fun resolveRoom(callback: (err: AWSError, data: ResolveRoomResponse) -> Unit = definedExternally): Request<ResolveRoomResponse, AWSError>
    open fun revokeInvitation(params: RevokeInvitationRequest, callback: (err: AWSError, data: RevokeInvitationResponse) -> Unit = definedExternally): Request<RevokeInvitationResponse, AWSError>
    open fun revokeInvitation(callback: (err: AWSError, data: RevokeInvitationResponse) -> Unit = definedExternally): Request<RevokeInvitationResponse, AWSError>
    open fun searchAddressBooks(params: SearchAddressBooksRequest, callback: (err: AWSError, data: SearchAddressBooksResponse) -> Unit = definedExternally): Request<SearchAddressBooksResponse, AWSError>
    open fun searchAddressBooks(callback: (err: AWSError, data: SearchAddressBooksResponse) -> Unit = definedExternally): Request<SearchAddressBooksResponse, AWSError>
    open fun searchContacts(params: SearchContactsRequest, callback: (err: AWSError, data: SearchContactsResponse) -> Unit = definedExternally): Request<SearchContactsResponse, AWSError>
    open fun searchContacts(callback: (err: AWSError, data: SearchContactsResponse) -> Unit = definedExternally): Request<SearchContactsResponse, AWSError>
    open fun searchDevices(params: SearchDevicesRequest, callback: (err: AWSError, data: SearchDevicesResponse) -> Unit = definedExternally): Request<SearchDevicesResponse, AWSError>
    open fun searchDevices(callback: (err: AWSError, data: SearchDevicesResponse) -> Unit = definedExternally): Request<SearchDevicesResponse, AWSError>
    open fun searchNetworkProfiles(params: SearchNetworkProfilesRequest, callback: (err: AWSError, data: SearchNetworkProfilesResponse) -> Unit = definedExternally): Request<SearchNetworkProfilesResponse, AWSError>
    open fun searchNetworkProfiles(callback: (err: AWSError, data: SearchNetworkProfilesResponse) -> Unit = definedExternally): Request<SearchNetworkProfilesResponse, AWSError>
    open fun searchProfiles(params: SearchProfilesRequest, callback: (err: AWSError, data: SearchProfilesResponse) -> Unit = definedExternally): Request<SearchProfilesResponse, AWSError>
    open fun searchProfiles(callback: (err: AWSError, data: SearchProfilesResponse) -> Unit = definedExternally): Request<SearchProfilesResponse, AWSError>
    open fun searchRooms(params: SearchRoomsRequest, callback: (err: AWSError, data: SearchRoomsResponse) -> Unit = definedExternally): Request<SearchRoomsResponse, AWSError>
    open fun searchRooms(callback: (err: AWSError, data: SearchRoomsResponse) -> Unit = definedExternally): Request<SearchRoomsResponse, AWSError>
    open fun searchSkillGroups(params: SearchSkillGroupsRequest, callback: (err: AWSError, data: SearchSkillGroupsResponse) -> Unit = definedExternally): Request<SearchSkillGroupsResponse, AWSError>
    open fun searchSkillGroups(callback: (err: AWSError, data: SearchSkillGroupsResponse) -> Unit = definedExternally): Request<SearchSkillGroupsResponse, AWSError>
    open fun searchUsers(params: SearchUsersRequest, callback: (err: AWSError, data: SearchUsersResponse) -> Unit = definedExternally): Request<SearchUsersResponse, AWSError>
    open fun searchUsers(callback: (err: AWSError, data: SearchUsersResponse) -> Unit = definedExternally): Request<SearchUsersResponse, AWSError>
    open fun sendAnnouncement(params: SendAnnouncementRequest, callback: (err: AWSError, data: SendAnnouncementResponse) -> Unit = definedExternally): Request<SendAnnouncementResponse, AWSError>
    open fun sendAnnouncement(callback: (err: AWSError, data: SendAnnouncementResponse) -> Unit = definedExternally): Request<SendAnnouncementResponse, AWSError>
    open fun sendInvitation(params: SendInvitationRequest, callback: (err: AWSError, data: SendInvitationResponse) -> Unit = definedExternally): Request<SendInvitationResponse, AWSError>
    open fun sendInvitation(callback: (err: AWSError, data: SendInvitationResponse) -> Unit = definedExternally): Request<SendInvitationResponse, AWSError>
    open fun startDeviceSync(params: StartDeviceSyncRequest, callback: (err: AWSError, data: StartDeviceSyncResponse) -> Unit = definedExternally): Request<StartDeviceSyncResponse, AWSError>
    open fun startDeviceSync(callback: (err: AWSError, data: StartDeviceSyncResponse) -> Unit = definedExternally): Request<StartDeviceSyncResponse, AWSError>
    open fun startSmartHomeApplianceDiscovery(params: StartSmartHomeApplianceDiscoveryRequest, callback: (err: AWSError, data: StartSmartHomeApplianceDiscoveryResponse) -> Unit = definedExternally): Request<StartSmartHomeApplianceDiscoveryResponse, AWSError>
    open fun startSmartHomeApplianceDiscovery(callback: (err: AWSError, data: StartSmartHomeApplianceDiscoveryResponse) -> Unit = definedExternally): Request<StartSmartHomeApplianceDiscoveryResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateAddressBook(params: UpdateAddressBookRequest, callback: (err: AWSError, data: UpdateAddressBookResponse) -> Unit = definedExternally): Request<UpdateAddressBookResponse, AWSError>
    open fun updateAddressBook(callback: (err: AWSError, data: UpdateAddressBookResponse) -> Unit = definedExternally): Request<UpdateAddressBookResponse, AWSError>
    open fun updateBusinessReportSchedule(params: UpdateBusinessReportScheduleRequest, callback: (err: AWSError, data: UpdateBusinessReportScheduleResponse) -> Unit = definedExternally): Request<UpdateBusinessReportScheduleResponse, AWSError>
    open fun updateBusinessReportSchedule(callback: (err: AWSError, data: UpdateBusinessReportScheduleResponse) -> Unit = definedExternally): Request<UpdateBusinessReportScheduleResponse, AWSError>
    open fun updateConferenceProvider(params: UpdateConferenceProviderRequest, callback: (err: AWSError, data: UpdateConferenceProviderResponse) -> Unit = definedExternally): Request<UpdateConferenceProviderResponse, AWSError>
    open fun updateConferenceProvider(callback: (err: AWSError, data: UpdateConferenceProviderResponse) -> Unit = definedExternally): Request<UpdateConferenceProviderResponse, AWSError>
    open fun updateContact(params: UpdateContactRequest, callback: (err: AWSError, data: UpdateContactResponse) -> Unit = definedExternally): Request<UpdateContactResponse, AWSError>
    open fun updateContact(callback: (err: AWSError, data: UpdateContactResponse) -> Unit = definedExternally): Request<UpdateContactResponse, AWSError>
    open fun updateDevice(params: UpdateDeviceRequest, callback: (err: AWSError, data: UpdateDeviceResponse) -> Unit = definedExternally): Request<UpdateDeviceResponse, AWSError>
    open fun updateDevice(callback: (err: AWSError, data: UpdateDeviceResponse) -> Unit = definedExternally): Request<UpdateDeviceResponse, AWSError>
    open fun updateGateway(params: UpdateGatewayRequest, callback: (err: AWSError, data: UpdateGatewayResponse) -> Unit = definedExternally): Request<UpdateGatewayResponse, AWSError>
    open fun updateGateway(callback: (err: AWSError, data: UpdateGatewayResponse) -> Unit = definedExternally): Request<UpdateGatewayResponse, AWSError>
    open fun updateGatewayGroup(params: UpdateGatewayGroupRequest, callback: (err: AWSError, data: UpdateGatewayGroupResponse) -> Unit = definedExternally): Request<UpdateGatewayGroupResponse, AWSError>
    open fun updateGatewayGroup(callback: (err: AWSError, data: UpdateGatewayGroupResponse) -> Unit = definedExternally): Request<UpdateGatewayGroupResponse, AWSError>
    open fun updateNetworkProfile(params: UpdateNetworkProfileRequest, callback: (err: AWSError, data: UpdateNetworkProfileResponse) -> Unit = definedExternally): Request<UpdateNetworkProfileResponse, AWSError>
    open fun updateNetworkProfile(callback: (err: AWSError, data: UpdateNetworkProfileResponse) -> Unit = definedExternally): Request<UpdateNetworkProfileResponse, AWSError>
    open fun updateProfile(params: UpdateProfileRequest, callback: (err: AWSError, data: UpdateProfileResponse) -> Unit = definedExternally): Request<UpdateProfileResponse, AWSError>
    open fun updateProfile(callback: (err: AWSError, data: UpdateProfileResponse) -> Unit = definedExternally): Request<UpdateProfileResponse, AWSError>
    open fun updateRoom(params: UpdateRoomRequest, callback: (err: AWSError, data: UpdateRoomResponse) -> Unit = definedExternally): Request<UpdateRoomResponse, AWSError>
    open fun updateRoom(callback: (err: AWSError, data: UpdateRoomResponse) -> Unit = definedExternally): Request<UpdateRoomResponse, AWSError>
    open fun updateSkillGroup(params: UpdateSkillGroupRequest, callback: (err: AWSError, data: UpdateSkillGroupResponse) -> Unit = definedExternally): Request<UpdateSkillGroupResponse, AWSError>
    open fun updateSkillGroup(callback: (err: AWSError, data: UpdateSkillGroupResponse) -> Unit = definedExternally): Request<UpdateSkillGroupResponse, AWSError>
    interface AddressBook {
        var AddressBookArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: AddressBookName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: AddressBookDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddressBookData {
        var AddressBookArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: AddressBookName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: AddressBookDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApproveSkillRequest {
        var SkillId: SkillId
    }
    interface ApproveSkillResponse
    interface AssociateContactWithAddressBookRequest {
        var ContactArn: Arn
        var AddressBookArn: Arn
    }
    interface AssociateContactWithAddressBookResponse
    interface AssociateDeviceWithNetworkProfileRequest {
        var DeviceArn: Arn
        var NetworkProfileArn: Arn
    }
    interface AssociateDeviceWithNetworkProfileResponse
    interface AssociateDeviceWithRoomRequest {
        var DeviceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateDeviceWithRoomResponse
    interface AssociateSkillGroupWithRoomRequest {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateSkillGroupWithRoomResponse
    interface AssociateSkillWithSkillGroupRequest {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SkillId: SkillId
    }
    interface AssociateSkillWithSkillGroupResponse
    interface AssociateSkillWithUsersRequest {
        var SkillId: SkillId
    }
    interface AssociateSkillWithUsersResponse
    interface Audio {
        var Locale: String /* "en-US" | String */
        var Location: AudioLocation
    }
    interface AuthorizationResult {
        @nativeGetter
        operator fun get(key: String): Value?
        @nativeSetter
        operator fun set(key: String, value: Value)
    }
    interface BusinessReport {
        var Status: String /* "RUNNING" | "SUCCEEDED" | "FAILED" | String */
        var FailureCode: String /* "ACCESS_DENIED" | "NO_SUCH_BUCKET" | "INTERNAL_FAILURE" | String */
        var S3Location: BusinessReportS3Location?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryTime: BusinessReportDeliveryTime?
            get() = definedExternally
            set(value) = definedExternally
        var DownloadUrl: BusinessReportDownloadUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BusinessReportContentRange {
        var Interval: String /* "ONE_DAY" | "ONE_WEEK" | "THIRTY_DAYS" | String */
    }
    interface BusinessReportRecurrence {
        var StartDate: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BusinessReportS3Location {
        var Path: BusinessReportS3Path?
            get() = definedExternally
            set(value) = definedExternally
        var BucketName: CustomerS3BucketName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BusinessReportSchedule {
        var ScheduleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ScheduleName: BusinessReportScheduleName?
            get() = definedExternally
            set(value) = definedExternally
        var S3BucketName: CustomerS3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var S3KeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var Format: String /* "CSV" | "CSV_ZIP" | String */
        var ContentRange: BusinessReportContentRange?
            get() = definedExternally
            set(value) = definedExternally
        var Recurrence: BusinessReportRecurrence?
            get() = definedExternally
            set(value) = definedExternally
        var LastBusinessReport: BusinessReport?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Category {
        var CategoryId: CategoryId?
            get() = definedExternally
            set(value) = definedExternally
        var CategoryName: CategoryName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConferencePreference {
        var DefaultConferenceProviderArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConferenceProvider {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ConferenceProviderName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "CHIME" | "BLUEJEANS" | "FUZE" | "GOOGLE_HANGOUTS" | "POLYCOM" | "RINGCENTRAL" | "SKYPE_FOR_BUSINESS" | "WEBEX" | "ZOOM" | "CUSTOM" | String */
        var IPDialIn: IPDialIn?
            get() = definedExternally
            set(value) = definedExternally
        var PSTNDialIn: PSTNDialIn?
            get() = definedExternally
            set(value) = definedExternally
        var MeetingSetting: MeetingSetting?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Contact {
        var ContactArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var FirstName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var LastName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumber: RawPhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumbers: PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
        var SipAddresses: SipAddressList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContactData {
        var ContactArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var FirstName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var LastName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumber: RawPhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumbers: PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
        var SipAddresses: SipAddressList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Content {
        var TextList: TextList?
            get() = definedExternally
            set(value) = definedExternally
        var SsmlList: SsmlList?
            get() = definedExternally
            set(value) = definedExternally
        var AudioList: AudioList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAddressBookRequest {
        var Name: AddressBookName
        var Description: AddressBookDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAddressBookResponse {
        var AddressBookArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBusinessReportScheduleRequest {
        var ScheduleName: BusinessReportScheduleName?
            get() = definedExternally
            set(value) = definedExternally
        var S3BucketName: CustomerS3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var S3KeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var Format: String /* "CSV" | "CSV_ZIP" | String */
        var ContentRange: BusinessReportContentRange
        var Recurrence: BusinessReportRecurrence?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBusinessReportScheduleResponse {
        var ScheduleArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConferenceProviderRequest {
        var ConferenceProviderName: ConferenceProviderName
        var ConferenceProviderType: String /* "CHIME" | "BLUEJEANS" | "FUZE" | "GOOGLE_HANGOUTS" | "POLYCOM" | "RINGCENTRAL" | "SKYPE_FOR_BUSINESS" | "WEBEX" | "ZOOM" | "CUSTOM" | String */
        var IPDialIn: IPDialIn?
            get() = definedExternally
            set(value) = definedExternally
        var PSTNDialIn: PSTNDialIn?
            get() = definedExternally
            set(value) = definedExternally
        var MeetingSetting: MeetingSetting
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateConferenceProviderResponse {
        var ConferenceProviderArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateContactRequest {
        var DisplayName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var FirstName: ContactName
        var LastName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumber: RawPhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumbers: PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
        var SipAddresses: SipAddressList?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateContactResponse {
        var ContactArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateEndOfMeetingReminder {
        var ReminderAtMinutes: EndOfMeetingReminderMinutesList
        var ReminderType: String /* "ANNOUNCEMENT_TIME_CHECK" | "ANNOUNCEMENT_VARIABLE_TIME_LEFT" | "CHIME" | "KNOCK" | String */
        var Enabled: Boolean
    }
    interface CreateGatewayGroupRequest {
        var Name: GatewayGroupName
        var Description: GatewayGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken
    }
    interface CreateGatewayGroupResponse {
        var GatewayGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstantBooking {
        var DurationInMinutes: Minutes
        var Enabled: Boolean
    }
    interface CreateMeetingRoomConfiguration {
        var RoomUtilizationMetricsEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EndOfMeetingReminder: CreateEndOfMeetingReminder?
            get() = definedExternally
            set(value) = definedExternally
        var InstantBooking: CreateInstantBooking?
            get() = definedExternally
            set(value) = definedExternally
        var RequireCheckIn: CreateRequireCheckIn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNetworkProfileRequest {
        var NetworkProfileName: NetworkProfileName
        var Description: NetworkProfileDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Ssid: NetworkSsid
        var SecurityType: String /* "OPEN" | "WEP" | "WPA_PSK" | "WPA2_PSK" | "WPA2_ENTERPRISE" | String */
        var EapMethod: String /* "EAP_TLS" | String */
        var CurrentPassword: CurrentWiFiPassword?
            get() = definedExternally
            set(value) = definedExternally
        var NextPassword: NextWiFiPassword?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateAuthorityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var TrustAnchors: TrustAnchorList?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken
    }
    interface CreateNetworkProfileResponse {
        var NetworkProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProfileRequest {
        var ProfileName: ProfileName
        var Timezone: Timezone
        var Address: Address
        var DistanceUnit: String /* "METRIC" | "IMPERIAL" | String */
        var TemperatureUnit: String /* "FAHRENHEIT" | "CELSIUS" | String */
        var WakeWord: String /* "ALEXA" | "AMAZON" | "ECHO" | "COMPUTER" | String */
        var Locale: DeviceLocale?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var SetupModeDisabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MaxVolumeLimit: MaxVolumeLimit?
            get() = definedExternally
            set(value) = definedExternally
        var PSTNEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MeetingRoomConfiguration: CreateMeetingRoomConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProfileResponse {
        var ProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRequireCheckIn {
        var ReleaseAfterMinutes: Minutes
        var Enabled: Boolean
    }
    interface CreateRoomRequest {
        var RoomName: RoomName
        var Description: RoomDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderCalendarId: ProviderCalendarId?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRoomResponse {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSkillGroupRequest {
        var SkillGroupName: SkillGroupName
        var Description: SkillGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSkillGroupResponse {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserRequest {
        var UserId: user_UserId
        var FirstName: user_FirstName?
            get() = definedExternally
            set(value) = definedExternally
        var LastName: user_LastName?
            get() = definedExternally
            set(value) = definedExternally
        var Email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserResponse {
        var UserArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAddressBookRequest {
        var AddressBookArn: Arn
    }
    interface DeleteAddressBookResponse
    interface DeleteBusinessReportScheduleRequest {
        var ScheduleArn: Arn
    }
    interface DeleteBusinessReportScheduleResponse
    interface DeleteConferenceProviderRequest {
        var ConferenceProviderArn: Arn
    }
    interface DeleteConferenceProviderResponse
    interface DeleteContactRequest {
        var ContactArn: Arn
    }
    interface DeleteContactResponse
    interface DeleteDeviceRequest {
        var DeviceArn: Arn
    }
    interface DeleteDeviceResponse
    interface DeleteDeviceUsageDataRequest {
        var DeviceArn: Arn
        var DeviceUsageType: String /* "VOICE" | String */
    }
    interface DeleteDeviceUsageDataResponse
    interface DeleteGatewayGroupRequest {
        var GatewayGroupArn: Arn
    }
    interface DeleteGatewayGroupResponse
    interface DeleteNetworkProfileRequest {
        var NetworkProfileArn: Arn
    }
    interface DeleteNetworkProfileResponse
    interface DeleteProfileRequest {
        var ProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteProfileResponse
    interface DeleteRoomRequest {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRoomResponse
    interface DeleteRoomSkillParameterRequest {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SkillId: SkillId
        var ParameterKey: RoomSkillParameterKey
    }
    interface DeleteRoomSkillParameterResponse
    interface DeleteSkillAuthorizationRequest {
        var SkillId: SkillId
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSkillAuthorizationResponse
    interface DeleteSkillGroupRequest {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSkillGroupResponse
    interface DeleteUserRequest {
        var UserArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var EnrollmentId: EnrollmentId
    }
    interface DeleteUserResponse
    interface DeveloperInfo {
        var DeveloperName: DeveloperName?
            get() = definedExternally
            set(value) = definedExternally
        var PrivacyPolicy: PrivacyPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var Email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var Url: Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Device {
        var DeviceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceSerialNumber: DeviceSerialNumber?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceType: DeviceType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceName: DeviceName?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareVersion: SoftwareVersion?
            get() = definedExternally
            set(value) = definedExternally
        var MacAddress: MacAddress?
            get() = definedExternally
            set(value) = definedExternally
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceStatus: String /* "READY" | "PENDING" | "WAS_OFFLINE" | "DEREGISTERED" | "FAILED" | String */
        var DeviceStatusInfo: DeviceStatusInfo?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkProfileInfo: DeviceNetworkProfileInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceData {
        var DeviceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceSerialNumber: DeviceSerialNumber?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceType: DeviceType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceName: DeviceName?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareVersion: SoftwareVersion?
            get() = definedExternally
            set(value) = definedExternally
        var MacAddress: MacAddress?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceStatus: String /* "READY" | "PENDING" | "WAS_OFFLINE" | "DEREGISTERED" | "FAILED" | String */
        var NetworkProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkProfileName: NetworkProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var RoomName: RoomName?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceStatusInfo: DeviceStatusInfo?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTime: DeviceDataCreatedTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceEvent {
        var Type: String /* "CONNECTION_STATUS" | "DEVICE_STATUS" | String */
        var Value: DeviceEventValue?
            get() = definedExternally
            set(value) = definedExternally
        var Timestamp: DeviceEventTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceNetworkProfileInfo {
        var NetworkProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateExpirationTime: CertificateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceStatusDetail {
        var Feature: String /* "BLUETOOTH" | "VOLUME" | "NOTIFICATIONS" | "LISTS" | "SKILLS" | "NETWORK_PROFILE" | "SETTINGS" | "ALL" | String */
        var Code: String /* "DEVICE_SOFTWARE_UPDATE_NEEDED" | "DEVICE_WAS_OFFLINE" | "CREDENTIALS_ACCESS_FAILURE" | "TLS_VERSION_MISMATCH" | "ASSOCIATION_REJECTION" | "AUTHENTICATION_FAILURE" | "DHCP_FAILURE" | "INTERNET_UNAVAILABLE" | "DNS_FAILURE" | "UNKNOWN_FAILURE" | "CERTIFICATE_ISSUING_LIMIT_EXCEEDED" | "INVALID_CERTIFICATE_AUTHORITY" | "NETWORK_PROFILE_NOT_FOUND" | "INVALID_PASSWORD_STATE" | "PASSWORD_NOT_FOUND" | String */
    }
    interface DeviceStatusInfo {
        var DeviceStatusDetails: DeviceStatusDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionStatus: String /* "ONLINE" | "OFFLINE" | String */
        var ConnectionStatusUpdatedTime: ConnectionStatusUpdatedTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateContactFromAddressBookRequest {
        var ContactArn: Arn
        var AddressBookArn: Arn
    }
    interface DisassociateContactFromAddressBookResponse
    interface DisassociateDeviceFromRoomRequest {
        var DeviceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateDeviceFromRoomResponse
    interface DisassociateSkillFromSkillGroupRequest {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SkillId: SkillId
    }
    interface DisassociateSkillFromSkillGroupResponse
    interface DisassociateSkillFromUsersRequest {
        var SkillId: SkillId
    }
    interface DisassociateSkillFromUsersResponse
    interface DisassociateSkillGroupFromRoomRequest {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateSkillGroupFromRoomResponse
    interface EndOfMeetingReminder {
        var ReminderAtMinutes: EndOfMeetingReminderMinutesList?
            get() = definedExternally
            set(value) = definedExternally
        var ReminderType: String /* "ANNOUNCEMENT_TIME_CHECK" | "ANNOUNCEMENT_VARIABLE_TIME_LEFT" | "CHIME" | "KNOCK" | String */
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filter {
        var Key: FilterKey
        var Values: FilterValueList
    }
    interface ForgetSmartHomeAppliancesRequest {
        var RoomArn: Arn
    }
    interface ForgetSmartHomeAppliancesResponse
    interface Gateway {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: GatewayName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: GatewayDescription?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareVersion: GatewayVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GatewayGroup {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: GatewayGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: GatewayGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GatewayGroupSummary {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: GatewayGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: GatewayGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GatewaySummary {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: GatewayName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: GatewayDescription?
            get() = definedExternally
            set(value) = definedExternally
        var GatewayGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareVersion: GatewayVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAddressBookRequest {
        var AddressBookArn: Arn
    }
    interface GetAddressBookResponse {
        var AddressBook: AddressBook?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConferencePreferenceRequest
    interface GetConferencePreferenceResponse {
        var Preference: ConferencePreference?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConferenceProviderRequest {
        var ConferenceProviderArn: Arn
    }
    interface GetConferenceProviderResponse {
        var ConferenceProvider: ConferenceProvider?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetContactRequest {
        var ContactArn: Arn
    }
    interface GetContactResponse {
        var Contact: Contact?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeviceRequest {
        var DeviceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeviceResponse {
        var Device: Device?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGatewayGroupRequest {
        var GatewayGroupArn: Arn
    }
    interface GetGatewayGroupResponse {
        var GatewayGroup: GatewayGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGatewayRequest {
        var GatewayArn: Arn
    }
    interface GetGatewayResponse {
        var Gateway: Gateway?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInvitationConfigurationRequest
    interface GetInvitationConfigurationResponse {
        var OrganizationName: OrganizationName?
            get() = definedExternally
            set(value) = definedExternally
        var ContactEmail: Email?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateSkillIds: ShortSkillIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetNetworkProfileRequest {
        var NetworkProfileArn: Arn
    }
    interface GetNetworkProfileResponse {
        var NetworkProfile: NetworkProfile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetProfileRequest {
        var ProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetProfileResponse {
        var Profile: Profile?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRoomRequest {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRoomResponse {
        var Room: Room?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRoomSkillParameterRequest {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SkillId: SkillId
        var ParameterKey: RoomSkillParameterKey
    }
    interface GetRoomSkillParameterResponse {
        var RoomSkillParameter: RoomSkillParameter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSkillGroupRequest {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSkillGroupResponse {
        var SkillGroup: SkillGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IPDialIn {
        var Endpoint: Endpoint
        var CommsProtocol: String /* "SIP" | "SIPS" | "H323" | String */
    }
    interface InstantBooking {
        var DurationInMinutes: Minutes?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBusinessReportSchedulesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBusinessReportSchedulesResponse {
        var BusinessReportSchedules: BusinessReportScheduleList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConferenceProvidersRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConferenceProvidersResponse {
        var ConferenceProviders: ConferenceProvidersList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeviceEventsRequest {
        var DeviceArn: Arn
        var EventType: String /* "CONNECTION_STATUS" | "DEVICE_STATUS" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeviceEventsResponse {
        var DeviceEvents: DeviceEventList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGatewayGroupsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGatewayGroupsResponse {
        var GatewayGroups: GatewayGroupSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGatewaysRequest {
        var GatewayGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGatewaysResponse {
        var Gateways: GatewaySummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSkillsRequest {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var EnablementType: String /* "ENABLED" | "PENDING" | String */
        var SkillType: String /* "PUBLIC" | "PRIVATE" | "ALL" | String */
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: SkillListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSkillsResponse {
        var SkillSummaries: SkillSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSkillsStoreCategoriesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSkillsStoreCategoriesResponse {
        var CategoryList: CategoryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSkillsStoreSkillsByCategoryRequest {
        var CategoryId: CategoryId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: SkillListMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSkillsStoreSkillsByCategoryResponse {
        var SkillsStoreSkills: SkillsStoreSkillList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSmartHomeAppliancesRequest {
        var RoomArn: Arn
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSmartHomeAppliancesResponse {
        var SmartHomeAppliances: SmartHomeApplianceList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsRequest {
        var Arn: Arn
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MeetingRoomConfiguration {
        var RoomUtilizationMetricsEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EndOfMeetingReminder: EndOfMeetingReminder?
            get() = definedExternally
            set(value) = definedExternally
        var InstantBooking: InstantBooking?
            get() = definedExternally
            set(value) = definedExternally
        var RequireCheckIn: RequireCheckIn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MeetingSetting {
        var RequirePin: String /* "YES" | "NO" | "OPTIONAL" | String */
    }
    interface NetworkProfile {
        var NetworkProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkProfileName: NetworkProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NetworkProfileDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Ssid: NetworkSsid?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityType: String /* "OPEN" | "WEP" | "WPA_PSK" | "WPA2_PSK" | "WPA2_ENTERPRISE" | String */
        var EapMethod: String /* "EAP_TLS" | String */
        var CurrentPassword: CurrentWiFiPassword?
            get() = definedExternally
            set(value) = definedExternally
        var NextPassword: NextWiFiPassword?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateAuthorityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var TrustAnchors: TrustAnchorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkProfileData {
        var NetworkProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkProfileName: NetworkProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NetworkProfileDescription?
            get() = definedExternally
            set(value) = definedExternally
        var Ssid: NetworkSsid?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityType: String /* "OPEN" | "WEP" | "WPA_PSK" | "WPA2_PSK" | "WPA2_ENTERPRISE" | String */
        var EapMethod: String /* "EAP_TLS" | String */
        var CertificateAuthorityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PSTNDialIn {
        var CountryCode: CountryCode
        var PhoneNumber: OutboundPhoneNumber
        var OneClickIdDelay: OneClickIdDelay
        var OneClickPinDelay: OneClickPinDelay
    }
    interface PhoneNumber {
        var Number: RawPhoneNumber
        var Type: String /* "MOBILE" | "WORK" | "HOME" | String */
    }
    interface Profile {
        var ProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ProfileName: ProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var IsDefault: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Address: Address?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: Timezone?
            get() = definedExternally
            set(value) = definedExternally
        var DistanceUnit: String /* "METRIC" | "IMPERIAL" | String */
        var TemperatureUnit: String /* "FAHRENHEIT" | "CELSIUS" | String */
        var WakeWord: String /* "ALEXA" | "AMAZON" | "ECHO" | "COMPUTER" | String */
        var Locale: DeviceLocale?
            get() = definedExternally
            set(value) = definedExternally
        var SetupModeDisabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MaxVolumeLimit: MaxVolumeLimit?
            get() = definedExternally
            set(value) = definedExternally
        var PSTNEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AddressBookArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var MeetingRoomConfiguration: MeetingRoomConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProfileData {
        var ProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ProfileName: ProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var IsDefault: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Address: Address?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: Timezone?
            get() = definedExternally
            set(value) = definedExternally
        var DistanceUnit: String /* "METRIC" | "IMPERIAL" | String */
        var TemperatureUnit: String /* "FAHRENHEIT" | "CELSIUS" | String */
        var WakeWord: String /* "ALEXA" | "AMAZON" | "ECHO" | "COMPUTER" | String */
        var Locale: DeviceLocale?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutConferencePreferenceRequest {
        var ConferencePreference: ConferencePreference
    }
    interface PutConferencePreferenceResponse
    interface PutInvitationConfigurationRequest {
        var OrganizationName: OrganizationName
        var ContactEmail: Email?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateSkillIds: ShortSkillIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutInvitationConfigurationResponse
    interface PutRoomSkillParameterRequest {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SkillId: SkillId
        var RoomSkillParameter: RoomSkillParameter
    }
    interface PutRoomSkillParameterResponse
    interface PutSkillAuthorizationRequest {
        var AuthorizationResult: AuthorizationResult
        var SkillId: SkillId
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutSkillAuthorizationResponse
    interface RegisterAVSDeviceRequest {
        var ClientId: ClientId
        var UserCode: UserCode
        var ProductId: ProductId
        var DeviceSerialNumber: DeviceSerialNumberForAVS
        var AmazonId: AmazonId
    }
    interface RegisterAVSDeviceResponse {
        var DeviceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RejectSkillRequest {
        var SkillId: SkillId
    }
    interface RejectSkillResponse
    interface RequireCheckIn {
        var ReleaseAfterMinutes: Minutes?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResolveRoomRequest {
        var UserId: UserId
        var SkillId: SkillId
    }
    interface ResolveRoomResponse {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var RoomName: RoomName?
            get() = definedExternally
            set(value) = definedExternally
        var RoomSkillParameters: RoomSkillParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Reviews {
        @nativeGetter
        operator fun get(key: String): ReviewValue?
        @nativeSetter
        operator fun set(key: String, value: ReviewValue)
    }
    interface RevokeInvitationRequest {
        var UserArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var EnrollmentId: EnrollmentId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokeInvitationResponse
    interface Room {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var RoomName: RoomName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: RoomDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderCalendarId: ProviderCalendarId?
            get() = definedExternally
            set(value) = definedExternally
        var ProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoomData {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var RoomName: RoomName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: RoomDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderCalendarId: ProviderCalendarId?
            get() = definedExternally
            set(value) = definedExternally
        var ProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ProfileName: ProfileName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoomSkillParameter {
        var ParameterKey: RoomSkillParameterKey
        var ParameterValue: RoomSkillParameterValue
    }
    interface SearchAddressBooksRequest {
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchAddressBooksResponse {
        var AddressBooks: AddressBookDataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: TotalCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchContactsRequest {
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchContactsResponse {
        var Contacts: ContactDataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: TotalCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchDevicesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchDevicesResponse {
        var Devices: DeviceDataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: TotalCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchNetworkProfilesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchNetworkProfilesResponse {
        var NetworkProfiles: NetworkProfileDataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: TotalCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchProfilesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchProfilesResponse {
        var Profiles: ProfileDataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: TotalCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchRoomsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchRoomsResponse {
        var Rooms: RoomDataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: TotalCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchSkillGroupsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchSkillGroupsResponse {
        var SkillGroups: SkillGroupDataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: TotalCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchUsersRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchUsersResponse {
        var Users: UserDataList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var TotalCount: TotalCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendAnnouncementRequest {
        var RoomFilters: FilterList
        var Content: Content
        var TimeToLiveInSeconds: TimeToLiveInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken
    }
    interface SendAnnouncementResponse {
        var AnnouncementArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendInvitationRequest {
        var UserArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SendInvitationResponse
    interface SipAddress {
        var Uri: SipUri
        var Type: String /* "WORK" | String */
    }
    interface SkillDetails {
        var ProductDescription: ProductDescription?
            get() = definedExternally
            set(value) = definedExternally
        var InvocationPhrase: InvocationPhrase?
            get() = definedExternally
            set(value) = definedExternally
        var ReleaseDate: ReleaseDate?
            get() = definedExternally
            set(value) = definedExternally
        var EndUserLicenseAgreement: EndUserLicenseAgreement?
            get() = definedExternally
            set(value) = definedExternally
        var GenericKeywords: GenericKeywords?
            get() = definedExternally
            set(value) = definedExternally
        var BulletPoints: BulletPoints?
            get() = definedExternally
            set(value) = definedExternally
        var NewInThisVersionBulletPoints: NewInThisVersionBulletPoints?
            get() = definedExternally
            set(value) = definedExternally
        var SkillTypes: SkillTypes?
            get() = definedExternally
            set(value) = definedExternally
        var Reviews: Reviews?
            get() = definedExternally
            set(value) = definedExternally
        var DeveloperInfo: DeveloperInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SkillGroup {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SkillGroupName: SkillGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: SkillGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SkillGroupData {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SkillGroupName: SkillGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: SkillGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SkillSummary {
        var SkillId: SkillId?
            get() = definedExternally
            set(value) = definedExternally
        var SkillName: SkillName?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsLinking: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnablementType: String /* "ENABLED" | "PENDING" | String */
        var SkillType: String /* "PUBLIC" | "PRIVATE" | String */
    }
    interface SkillsStoreSkill {
        var SkillId: SkillId?
            get() = definedExternally
            set(value) = definedExternally
        var SkillName: SkillName?
            get() = definedExternally
            set(value) = definedExternally
        var ShortDescription: ShortDescription?
            get() = definedExternally
            set(value) = definedExternally
        var IconUrl: IconUrl?
            get() = definedExternally
            set(value) = definedExternally
        var SampleUtterances: SampleUtterances?
            get() = definedExternally
            set(value) = definedExternally
        var SkillDetails: SkillDetails?
            get() = definedExternally
            set(value) = definedExternally
        var SupportsLinking: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SmartHomeAppliance {
        var FriendlyName: ApplianceFriendlyName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: ApplianceDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ManufacturerName: ApplianceManufacturerName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Sort {
        var Key: SortKey
        var Value: String /* "ASC" | "DESC" | String */
    }
    interface Ssml {
        var Locale: String /* "en-US" | String */
        var Value: SsmlValue
    }
    interface StartDeviceSyncRequest {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Features: Features
    }
    interface StartDeviceSyncResponse
    interface StartSmartHomeApplianceDiscoveryRequest {
        var RoomArn: Arn
    }
    interface StartSmartHomeApplianceDiscoveryResponse
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var Arn: Arn
        var Tags: TagList
    }
    interface TagResourceResponse
    interface Text {
        var Locale: String /* "en-US" | String */
        var Value: TextValue
    }
    interface UntagResourceRequest {
        var Arn: Arn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateAddressBookRequest {
        var AddressBookArn: Arn
        var Name: AddressBookName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: AddressBookDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAddressBookResponse
    interface UpdateBusinessReportScheduleRequest {
        var ScheduleArn: Arn
        var S3BucketName: CustomerS3BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var S3KeyPrefix: S3KeyPrefix?
            get() = definedExternally
            set(value) = definedExternally
        var Format: String /* "CSV" | "CSV_ZIP" | String */
        var ScheduleName: BusinessReportScheduleName?
            get() = definedExternally
            set(value) = definedExternally
        var Recurrence: BusinessReportRecurrence?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBusinessReportScheduleResponse
    interface UpdateConferenceProviderRequest {
        var ConferenceProviderArn: Arn
        var ConferenceProviderType: String /* "CHIME" | "BLUEJEANS" | "FUZE" | "GOOGLE_HANGOUTS" | "POLYCOM" | "RINGCENTRAL" | "SKYPE_FOR_BUSINESS" | "WEBEX" | "ZOOM" | "CUSTOM" | String */
        var IPDialIn: IPDialIn?
            get() = definedExternally
            set(value) = definedExternally
        var PSTNDialIn: PSTNDialIn?
            get() = definedExternally
            set(value) = definedExternally
        var MeetingSetting: MeetingSetting
    }
    interface UpdateConferenceProviderResponse
    interface UpdateContactRequest {
        var ContactArn: Arn
        var DisplayName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var FirstName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var LastName: ContactName?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumber: RawPhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumbers: PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
        var SipAddresses: SipAddressList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateContactResponse
    interface UpdateDeviceRequest {
        var DeviceArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceName: DeviceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDeviceResponse
    interface UpdateEndOfMeetingReminder {
        var ReminderAtMinutes: EndOfMeetingReminderMinutesList?
            get() = definedExternally
            set(value) = definedExternally
        var ReminderType: String /* "ANNOUNCEMENT_TIME_CHECK" | "ANNOUNCEMENT_VARIABLE_TIME_LEFT" | "CHIME" | "KNOCK" | String */
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGatewayGroupRequest {
        var GatewayGroupArn: Arn
        var Name: GatewayGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: GatewayGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGatewayGroupResponse
    interface UpdateGatewayRequest {
        var GatewayArn: Arn
        var Name: GatewayName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: GatewayDescription?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareVersion: GatewayVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGatewayResponse
    interface UpdateInstantBooking {
        var DurationInMinutes: Minutes?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMeetingRoomConfiguration {
        var RoomUtilizationMetricsEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EndOfMeetingReminder: UpdateEndOfMeetingReminder?
            get() = definedExternally
            set(value) = definedExternally
        var InstantBooking: UpdateInstantBooking?
            get() = definedExternally
            set(value) = definedExternally
        var RequireCheckIn: UpdateRequireCheckIn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNetworkProfileRequest {
        var NetworkProfileArn: Arn
        var NetworkProfileName: NetworkProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: NetworkProfileDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentPassword: CurrentWiFiPassword?
            get() = definedExternally
            set(value) = definedExternally
        var NextPassword: NextWiFiPassword?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateAuthorityArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var TrustAnchors: TrustAnchorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateNetworkProfileResponse
    interface UpdateProfileRequest {
        var ProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var ProfileName: ProfileName?
            get() = definedExternally
            set(value) = definedExternally
        var IsDefault: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: Timezone?
            get() = definedExternally
            set(value) = definedExternally
        var Address: Address?
            get() = definedExternally
            set(value) = definedExternally
        var DistanceUnit: String /* "METRIC" | "IMPERIAL" | String */
        var TemperatureUnit: String /* "FAHRENHEIT" | "CELSIUS" | String */
        var WakeWord: String /* "ALEXA" | "AMAZON" | "ECHO" | "COMPUTER" | String */
        var Locale: DeviceLocale?
            get() = definedExternally
            set(value) = definedExternally
        var SetupModeDisabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MaxVolumeLimit: MaxVolumeLimit?
            get() = definedExternally
            set(value) = definedExternally
        var PSTNEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var MeetingRoomConfiguration: UpdateMeetingRoomConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateProfileResponse
    interface UpdateRequireCheckIn {
        var ReleaseAfterMinutes: Minutes?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRoomRequest {
        var RoomArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var RoomName: RoomName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: RoomDescription?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderCalendarId: ProviderCalendarId?
            get() = definedExternally
            set(value) = definedExternally
        var ProfileArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRoomResponse
    interface UpdateSkillGroupRequest {
        var SkillGroupArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SkillGroupName: SkillGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: SkillGroupDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSkillGroupResponse
    interface UserData {
        var UserArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var FirstName: user_FirstName?
            get() = definedExternally
            set(value) = definedExternally
        var LastName: user_LastName?
            get() = definedExternally
            set(value) = definedExternally
        var Email: Email?
            get() = definedExternally
            set(value) = definedExternally
        var EnrollmentStatus: String /* "INITIALIZED" | "PENDING" | "REGISTERED" | "DISASSOCIATING" | "DEREGISTERING" | String */
        var EnrollmentId: EnrollmentId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-11-09" | "latest" | String */
    }
}