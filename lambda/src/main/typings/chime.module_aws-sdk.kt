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
import Chime.Account
import Chime.Attendee
import Chime.CreateAttendeeError
import Chime.Bot
import Chime.CreateAttendeeRequestItem
import Chime.Credential
import Chime.Invite
import Chime.Meeting
import Chime.MemberError
import Chime.MembershipItem
import Chime.OrderedPhoneNumber
import Chime.OriginationRoute
import Chime.PhoneNumberAssociation
import Chime.PhoneNumberError
import Chime.PhoneNumber
import Chime.PhoneNumberOrder
import Chime.Room
import Chime.RoomMembership
import Chime.SigninDelegateGroup
import Chime.UpdatePhoneNumberRequestItem
import Chime.UpdateUserRequestItem
import Chime.UserError
import Chime.User
import Chime.VoiceConnectorGroup
import Chime.VoiceConnectorItem
import Chime.VoiceConnector
import Chime.AssociatePhoneNumberWithUserRequest
import Chime.AssociatePhoneNumberWithUserResponse
import Chime.AssociatePhoneNumbersWithVoiceConnectorRequest
import Chime.AssociatePhoneNumbersWithVoiceConnectorResponse
import Chime.AssociatePhoneNumbersWithVoiceConnectorGroupRequest
import Chime.AssociatePhoneNumbersWithVoiceConnectorGroupResponse
import Chime.AssociateSigninDelegateGroupsWithAccountRequest
import Chime.AssociateSigninDelegateGroupsWithAccountResponse
import Chime.BatchCreateAttendeeRequest
import Chime.BatchCreateAttendeeResponse
import Chime.BatchCreateRoomMembershipRequest
import Chime.BatchCreateRoomMembershipResponse
import Chime.BatchDeletePhoneNumberRequest
import Chime.BatchDeletePhoneNumberResponse
import Chime.BatchSuspendUserRequest
import Chime.BatchSuspendUserResponse
import Chime.BatchUnsuspendUserRequest
import Chime.BatchUnsuspendUserResponse
import Chime.BatchUpdatePhoneNumberRequest
import Chime.BatchUpdatePhoneNumberResponse
import Chime.BatchUpdateUserRequest
import Chime.BatchUpdateUserResponse
import Chime.CreateAccountRequest
import Chime.CreateAccountResponse
import Chime.CreateAttendeeRequest
import Chime.CreateAttendeeResponse
import Chime.CreateBotRequest
import Chime.CreateBotResponse
import Chime.CreateMeetingRequest
import Chime.CreateMeetingResponse
import Chime.CreatePhoneNumberOrderRequest
import Chime.CreatePhoneNumberOrderResponse
import Chime.CreateRoomRequest
import Chime.CreateRoomResponse
import Chime.CreateRoomMembershipRequest
import Chime.CreateRoomMembershipResponse
import Chime.CreateUserRequest
import Chime.CreateUserResponse
import Chime.CreateVoiceConnectorRequest
import Chime.CreateVoiceConnectorResponse
import Chime.CreateVoiceConnectorGroupRequest
import Chime.CreateVoiceConnectorGroupResponse
import Chime.DeleteAccountRequest
import Chime.DeleteAccountResponse
import Chime.DeleteAttendeeRequest
import Chime.DeleteEventsConfigurationRequest
import Chime.DeleteMeetingRequest
import Chime.DeletePhoneNumberRequest
import Chime.DeleteRoomRequest
import Chime.DeleteRoomMembershipRequest
import Chime.DeleteVoiceConnectorRequest
import Chime.DeleteVoiceConnectorGroupRequest
import Chime.DeleteVoiceConnectorOriginationRequest
import Chime.DeleteVoiceConnectorStreamingConfigurationRequest
import Chime.DeleteVoiceConnectorTerminationRequest
import Chime.DeleteVoiceConnectorTerminationCredentialsRequest
import Chime.DisassociatePhoneNumberFromUserRequest
import Chime.DisassociatePhoneNumberFromUserResponse
import Chime.DisassociatePhoneNumbersFromVoiceConnectorRequest
import Chime.DisassociatePhoneNumbersFromVoiceConnectorResponse
import Chime.DisassociatePhoneNumbersFromVoiceConnectorGroupRequest
import Chime.DisassociatePhoneNumbersFromVoiceConnectorGroupResponse
import Chime.DisassociateSigninDelegateGroupsFromAccountRequest
import Chime.DisassociateSigninDelegateGroupsFromAccountResponse
import Chime.GetAccountRequest
import Chime.GetAccountResponse
import Chime.GetAccountSettingsRequest
import Chime.GetAccountSettingsResponse
import Chime.GetAttendeeRequest
import Chime.GetAttendeeResponse
import Chime.GetBotRequest
import Chime.GetBotResponse
import Chime.GetEventsConfigurationRequest
import Chime.GetEventsConfigurationResponse
import Chime.GetGlobalSettingsResponse
import Chime.GetMeetingRequest
import Chime.GetMeetingResponse
import Chime.GetPhoneNumberRequest
import Chime.GetPhoneNumberResponse
import Chime.GetPhoneNumberOrderRequest
import Chime.GetPhoneNumberOrderResponse
import Chime.GetPhoneNumberSettingsResponse
import Chime.GetRoomRequest
import Chime.GetRoomResponse
import Chime.GetUserRequest
import Chime.GetUserResponse
import Chime.GetUserSettingsRequest
import Chime.GetUserSettingsResponse
import Chime.GetVoiceConnectorRequest
import Chime.GetVoiceConnectorResponse
import Chime.GetVoiceConnectorGroupRequest
import Chime.GetVoiceConnectorGroupResponse
import Chime.GetVoiceConnectorLoggingConfigurationRequest
import Chime.GetVoiceConnectorLoggingConfigurationResponse
import Chime.GetVoiceConnectorOriginationRequest
import Chime.GetVoiceConnectorOriginationResponse
import Chime.GetVoiceConnectorStreamingConfigurationRequest
import Chime.GetVoiceConnectorStreamingConfigurationResponse
import Chime.GetVoiceConnectorTerminationRequest
import Chime.GetVoiceConnectorTerminationResponse
import Chime.GetVoiceConnectorTerminationHealthRequest
import Chime.GetVoiceConnectorTerminationHealthResponse
import Chime.InviteUsersRequest
import Chime.InviteUsersResponse
import Chime.ListAccountsRequest
import Chime.ListAccountsResponse
import Chime.ListAttendeesRequest
import Chime.ListAttendeesResponse
import Chime.ListBotsRequest
import Chime.ListBotsResponse
import Chime.ListMeetingsRequest
import Chime.ListMeetingsResponse
import Chime.ListPhoneNumberOrdersRequest
import Chime.ListPhoneNumberOrdersResponse
import Chime.ListPhoneNumbersRequest
import Chime.ListPhoneNumbersResponse
import Chime.ListRoomMembershipsRequest
import Chime.ListRoomMembershipsResponse
import Chime.ListRoomsRequest
import Chime.ListRoomsResponse
import Chime.ListUsersRequest
import Chime.ListUsersResponse
import Chime.ListVoiceConnectorGroupsRequest
import Chime.ListVoiceConnectorGroupsResponse
import Chime.ListVoiceConnectorTerminationCredentialsRequest
import Chime.ListVoiceConnectorTerminationCredentialsResponse
import Chime.ListVoiceConnectorsRequest
import Chime.ListVoiceConnectorsResponse
import Chime.LogoutUserRequest
import Chime.LogoutUserResponse
import Chime.PutEventsConfigurationRequest
import Chime.PutEventsConfigurationResponse
import Chime.PutVoiceConnectorLoggingConfigurationRequest
import Chime.PutVoiceConnectorLoggingConfigurationResponse
import Chime.PutVoiceConnectorOriginationRequest
import Chime.PutVoiceConnectorOriginationResponse
import Chime.PutVoiceConnectorStreamingConfigurationRequest
import Chime.PutVoiceConnectorStreamingConfigurationResponse
import Chime.PutVoiceConnectorTerminationRequest
import Chime.PutVoiceConnectorTerminationResponse
import Chime.PutVoiceConnectorTerminationCredentialsRequest
import Chime.RegenerateSecurityTokenRequest
import Chime.RegenerateSecurityTokenResponse
import Chime.ResetPersonalPINRequest
import Chime.ResetPersonalPINResponse
import Chime.RestorePhoneNumberRequest
import Chime.RestorePhoneNumberResponse
import Chime.SearchAvailablePhoneNumbersRequest
import Chime.SearchAvailablePhoneNumbersResponse
import Chime.UpdateAccountRequest
import Chime.UpdateAccountResponse
import Chime.UpdateAccountSettingsRequest
import Chime.UpdateAccountSettingsResponse
import Chime.UpdateBotRequest
import Chime.UpdateBotResponse
import Chime.UpdateGlobalSettingsRequest
import Chime.UpdatePhoneNumberRequest
import Chime.UpdatePhoneNumberResponse
import Chime.UpdatePhoneNumberSettingsRequest
import Chime.UpdateRoomRequest
import Chime.UpdateRoomResponse
import Chime.UpdateRoomMembershipRequest
import Chime.UpdateRoomMembershipResponse
import Chime.UpdateUserRequest
import Chime.UpdateUserResponse
import Chime.UpdateUserSettingsRequest
import Chime.UpdateVoiceConnectorRequest
import Chime.UpdateVoiceConnectorResponse
import Chime.UpdateVoiceConnectorGroupRequest
import Chime.UpdateVoiceConnectorGroupResponse
import Chime.MeetingNotificationConfiguration
import Chime.AccountSettings
import Chime.EventsConfiguration
import Chime.BusinessCallingSettings
import Chime.VoiceConnectorSettings
import Chime.UserSettings
import Chime.LoggingConfiguration
import Chime.Origination
import Chime.StreamingConfiguration
import Chime.TerminationHealth
import Chime.Termination
import Chime.MediaPlacement
import Chime.PhoneNumberCapabilities
import Chime.Member
import Chime.AlexaForBusinessMetadata
import Chime.TelephonySettings

typealias AccountList = Array<Account>

typealias AccountName = String

typealias Arn = String

typealias AttendeeList = Array<Attendee>

typealias BatchCreateAttendeeErrorList = Array<CreateAttendeeError>

typealias Boolean = Boolean

typealias BotList = Array<Bot>

typealias CallingName = String

typealias CallingRegion = String

typealias CallingRegionList = Array<CallingRegion>

typealias ClientRequestToken = String

typealias CpsLimit = Number

typealias CreateAttendeeRequestItemList = Array<CreateAttendeeRequestItem>

typealias CredentialList = Array<Credential>

typealias DataRetentionInHours = Number

typealias E164PhoneNumber = String

typealias E164PhoneNumberList = Array<E164PhoneNumber>

typealias EmailAddress = String

typealias ExternalUserIdType = String

typealias GuidString = String

typealias InviteList = Array<Invite>

typealias Iso8601Timestamp = Date

typealias JoinTokenString = String

typealias LicenseList = Array<String /* "Basic" | "Plus" | "Pro" | "ProTrial" | String */>

typealias MeetingList = Array<Meeting>

typealias MemberErrorList = Array<MemberError>

typealias MembershipItemList = Array<MembershipItem>

typealias NonEmptyString = String

typealias NonEmptyStringList = Array<String>

typealias NullableBoolean = Boolean

typealias OrderedPhoneNumberList = Array<OrderedPhoneNumber>

typealias OriginationRouteList = Array<OriginationRoute>

typealias OriginationRoutePriority = Number

typealias OriginationRouteWeight = Number

typealias PhoneNumberAssociationList = Array<PhoneNumberAssociation>

typealias PhoneNumberErrorList = Array<PhoneNumberError>

typealias PhoneNumberList = Array<PhoneNumber>

typealias PhoneNumberMaxResults = Number

typealias PhoneNumberOrderList = Array<PhoneNumberOrder>

typealias Port = Number

typealias ProfileServiceMaxResults = Number

typealias ResultMax = Number

typealias RoomList = Array<Room>

typealias RoomMembershipList = Array<RoomMembership>

typealias SensitiveString = String

typealias SensitiveStringList = Array<SensitiveString>

typealias SigninDelegateGroupList = Array<SigninDelegateGroup>

typealias String = String

typealias StringList = Array<String>

typealias TollFreePrefix = String

typealias UpdatePhoneNumberRequestItemList = Array<UpdatePhoneNumberRequestItem>

typealias UpdateUserRequestItemList = Array<UpdateUserRequestItem>

typealias UriType = String

typealias UserEmailList = Array<EmailAddress>

typealias UserErrorList = Array<UserError>

typealias UserIdList = Array<NonEmptyString>

typealias UserList = Array<User>

typealias VoiceConnectorGroupList = Array<VoiceConnectorGroup>

typealias VoiceConnectorGroupName = String

typealias VoiceConnectorItemList = Array<VoiceConnectorItem>

typealias VoiceConnectorItemPriority = Number

typealias VoiceConnectorList = Array<VoiceConnector>

typealias VoiceConnectorName = String

@JsModule("aws-sdk")
external open class Chime(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Chime.Types.ClientConfiguration */
    open fun associatePhoneNumberWithUser(params: AssociatePhoneNumberWithUserRequest, callback: (err: AWSError, data: AssociatePhoneNumberWithUserResponse) -> Unit = definedExternally): Request<AssociatePhoneNumberWithUserResponse, AWSError>
    open fun associatePhoneNumberWithUser(callback: (err: AWSError, data: AssociatePhoneNumberWithUserResponse) -> Unit = definedExternally): Request<AssociatePhoneNumberWithUserResponse, AWSError>
    open fun associatePhoneNumbersWithVoiceConnector(params: AssociatePhoneNumbersWithVoiceConnectorRequest, callback: (err: AWSError, data: AssociatePhoneNumbersWithVoiceConnectorResponse) -> Unit = definedExternally): Request<AssociatePhoneNumbersWithVoiceConnectorResponse, AWSError>
    open fun associatePhoneNumbersWithVoiceConnector(callback: (err: AWSError, data: AssociatePhoneNumbersWithVoiceConnectorResponse) -> Unit = definedExternally): Request<AssociatePhoneNumbersWithVoiceConnectorResponse, AWSError>
    open fun associatePhoneNumbersWithVoiceConnectorGroup(params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest, callback: (err: AWSError, data: AssociatePhoneNumbersWithVoiceConnectorGroupResponse) -> Unit = definedExternally): Request<AssociatePhoneNumbersWithVoiceConnectorGroupResponse, AWSError>
    open fun associatePhoneNumbersWithVoiceConnectorGroup(callback: (err: AWSError, data: AssociatePhoneNumbersWithVoiceConnectorGroupResponse) -> Unit = definedExternally): Request<AssociatePhoneNumbersWithVoiceConnectorGroupResponse, AWSError>
    open fun associateSigninDelegateGroupsWithAccount(params: AssociateSigninDelegateGroupsWithAccountRequest, callback: (err: AWSError, data: AssociateSigninDelegateGroupsWithAccountResponse) -> Unit = definedExternally): Request<AssociateSigninDelegateGroupsWithAccountResponse, AWSError>
    open fun associateSigninDelegateGroupsWithAccount(callback: (err: AWSError, data: AssociateSigninDelegateGroupsWithAccountResponse) -> Unit = definedExternally): Request<AssociateSigninDelegateGroupsWithAccountResponse, AWSError>
    open fun batchCreateAttendee(params: BatchCreateAttendeeRequest, callback: (err: AWSError, data: BatchCreateAttendeeResponse) -> Unit = definedExternally): Request<BatchCreateAttendeeResponse, AWSError>
    open fun batchCreateAttendee(callback: (err: AWSError, data: BatchCreateAttendeeResponse) -> Unit = definedExternally): Request<BatchCreateAttendeeResponse, AWSError>
    open fun batchCreateRoomMembership(params: BatchCreateRoomMembershipRequest, callback: (err: AWSError, data: BatchCreateRoomMembershipResponse) -> Unit = definedExternally): Request<BatchCreateRoomMembershipResponse, AWSError>
    open fun batchCreateRoomMembership(callback: (err: AWSError, data: BatchCreateRoomMembershipResponse) -> Unit = definedExternally): Request<BatchCreateRoomMembershipResponse, AWSError>
    open fun batchDeletePhoneNumber(params: BatchDeletePhoneNumberRequest, callback: (err: AWSError, data: BatchDeletePhoneNumberResponse) -> Unit = definedExternally): Request<BatchDeletePhoneNumberResponse, AWSError>
    open fun batchDeletePhoneNumber(callback: (err: AWSError, data: BatchDeletePhoneNumberResponse) -> Unit = definedExternally): Request<BatchDeletePhoneNumberResponse, AWSError>
    open fun batchSuspendUser(params: BatchSuspendUserRequest, callback: (err: AWSError, data: BatchSuspendUserResponse) -> Unit = definedExternally): Request<BatchSuspendUserResponse, AWSError>
    open fun batchSuspendUser(callback: (err: AWSError, data: BatchSuspendUserResponse) -> Unit = definedExternally): Request<BatchSuspendUserResponse, AWSError>
    open fun batchUnsuspendUser(params: BatchUnsuspendUserRequest, callback: (err: AWSError, data: BatchUnsuspendUserResponse) -> Unit = definedExternally): Request<BatchUnsuspendUserResponse, AWSError>
    open fun batchUnsuspendUser(callback: (err: AWSError, data: BatchUnsuspendUserResponse) -> Unit = definedExternally): Request<BatchUnsuspendUserResponse, AWSError>
    open fun batchUpdatePhoneNumber(params: BatchUpdatePhoneNumberRequest, callback: (err: AWSError, data: BatchUpdatePhoneNumberResponse) -> Unit = definedExternally): Request<BatchUpdatePhoneNumberResponse, AWSError>
    open fun batchUpdatePhoneNumber(callback: (err: AWSError, data: BatchUpdatePhoneNumberResponse) -> Unit = definedExternally): Request<BatchUpdatePhoneNumberResponse, AWSError>
    open fun batchUpdateUser(params: BatchUpdateUserRequest, callback: (err: AWSError, data: BatchUpdateUserResponse) -> Unit = definedExternally): Request<BatchUpdateUserResponse, AWSError>
    open fun batchUpdateUser(callback: (err: AWSError, data: BatchUpdateUserResponse) -> Unit = definedExternally): Request<BatchUpdateUserResponse, AWSError>
    open fun createAccount(params: CreateAccountRequest, callback: (err: AWSError, data: CreateAccountResponse) -> Unit = definedExternally): Request<CreateAccountResponse, AWSError>
    open fun createAccount(callback: (err: AWSError, data: CreateAccountResponse) -> Unit = definedExternally): Request<CreateAccountResponse, AWSError>
    open fun createAttendee(params: CreateAttendeeRequest, callback: (err: AWSError, data: CreateAttendeeResponse) -> Unit = definedExternally): Request<CreateAttendeeResponse, AWSError>
    open fun createAttendee(callback: (err: AWSError, data: CreateAttendeeResponse) -> Unit = definedExternally): Request<CreateAttendeeResponse, AWSError>
    open fun createBot(params: CreateBotRequest, callback: (err: AWSError, data: CreateBotResponse) -> Unit = definedExternally): Request<CreateBotResponse, AWSError>
    open fun createBot(callback: (err: AWSError, data: CreateBotResponse) -> Unit = definedExternally): Request<CreateBotResponse, AWSError>
    open fun createMeeting(params: CreateMeetingRequest, callback: (err: AWSError, data: CreateMeetingResponse) -> Unit = definedExternally): Request<CreateMeetingResponse, AWSError>
    open fun createMeeting(callback: (err: AWSError, data: CreateMeetingResponse) -> Unit = definedExternally): Request<CreateMeetingResponse, AWSError>
    open fun createPhoneNumberOrder(params: CreatePhoneNumberOrderRequest, callback: (err: AWSError, data: CreatePhoneNumberOrderResponse) -> Unit = definedExternally): Request<CreatePhoneNumberOrderResponse, AWSError>
    open fun createPhoneNumberOrder(callback: (err: AWSError, data: CreatePhoneNumberOrderResponse) -> Unit = definedExternally): Request<CreatePhoneNumberOrderResponse, AWSError>
    open fun createRoom(params: CreateRoomRequest, callback: (err: AWSError, data: CreateRoomResponse) -> Unit = definedExternally): Request<CreateRoomResponse, AWSError>
    open fun createRoom(callback: (err: AWSError, data: CreateRoomResponse) -> Unit = definedExternally): Request<CreateRoomResponse, AWSError>
    open fun createRoomMembership(params: CreateRoomMembershipRequest, callback: (err: AWSError, data: CreateRoomMembershipResponse) -> Unit = definedExternally): Request<CreateRoomMembershipResponse, AWSError>
    open fun createRoomMembership(callback: (err: AWSError, data: CreateRoomMembershipResponse) -> Unit = definedExternally): Request<CreateRoomMembershipResponse, AWSError>
    open fun createUser(params: CreateUserRequest, callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun createUser(callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun createVoiceConnector(params: CreateVoiceConnectorRequest, callback: (err: AWSError, data: CreateVoiceConnectorResponse) -> Unit = definedExternally): Request<CreateVoiceConnectorResponse, AWSError>
    open fun createVoiceConnector(callback: (err: AWSError, data: CreateVoiceConnectorResponse) -> Unit = definedExternally): Request<CreateVoiceConnectorResponse, AWSError>
    open fun createVoiceConnectorGroup(params: CreateVoiceConnectorGroupRequest, callback: (err: AWSError, data: CreateVoiceConnectorGroupResponse) -> Unit = definedExternally): Request<CreateVoiceConnectorGroupResponse, AWSError>
    open fun createVoiceConnectorGroup(callback: (err: AWSError, data: CreateVoiceConnectorGroupResponse) -> Unit = definedExternally): Request<CreateVoiceConnectorGroupResponse, AWSError>
    open fun deleteAccount(params: DeleteAccountRequest, callback: (err: AWSError, data: DeleteAccountResponse) -> Unit = definedExternally): Request<DeleteAccountResponse, AWSError>
    open fun deleteAccount(callback: (err: AWSError, data: DeleteAccountResponse) -> Unit = definedExternally): Request<DeleteAccountResponse, AWSError>
    open fun deleteAttendee(params: DeleteAttendeeRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAttendee(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventsConfiguration(params: DeleteEventsConfigurationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteEventsConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMeeting(params: DeleteMeetingRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteMeeting(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePhoneNumber(params: DeletePhoneNumberRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePhoneNumber(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRoom(params: DeleteRoomRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRoom(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRoomMembership(params: DeleteRoomMembershipRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRoomMembership(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnector(params: DeleteVoiceConnectorRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnector(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnectorGroup(params: DeleteVoiceConnectorGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnectorGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnectorOrigination(params: DeleteVoiceConnectorOriginationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnectorOrigination(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnectorStreamingConfiguration(params: DeleteVoiceConnectorStreamingConfigurationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnectorStreamingConfiguration(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnectorTermination(params: DeleteVoiceConnectorTerminationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnectorTermination(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnectorTerminationCredentials(params: DeleteVoiceConnectorTerminationCredentialsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVoiceConnectorTerminationCredentials(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disassociatePhoneNumberFromUser(params: DisassociatePhoneNumberFromUserRequest, callback: (err: AWSError, data: DisassociatePhoneNumberFromUserResponse) -> Unit = definedExternally): Request<DisassociatePhoneNumberFromUserResponse, AWSError>
    open fun disassociatePhoneNumberFromUser(callback: (err: AWSError, data: DisassociatePhoneNumberFromUserResponse) -> Unit = definedExternally): Request<DisassociatePhoneNumberFromUserResponse, AWSError>
    open fun disassociatePhoneNumbersFromVoiceConnector(params: DisassociatePhoneNumbersFromVoiceConnectorRequest, callback: (err: AWSError, data: DisassociatePhoneNumbersFromVoiceConnectorResponse) -> Unit = definedExternally): Request<DisassociatePhoneNumbersFromVoiceConnectorResponse, AWSError>
    open fun disassociatePhoneNumbersFromVoiceConnector(callback: (err: AWSError, data: DisassociatePhoneNumbersFromVoiceConnectorResponse) -> Unit = definedExternally): Request<DisassociatePhoneNumbersFromVoiceConnectorResponse, AWSError>
    open fun disassociatePhoneNumbersFromVoiceConnectorGroup(params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest, callback: (err: AWSError, data: DisassociatePhoneNumbersFromVoiceConnectorGroupResponse) -> Unit = definedExternally): Request<DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, AWSError>
    open fun disassociatePhoneNumbersFromVoiceConnectorGroup(callback: (err: AWSError, data: DisassociatePhoneNumbersFromVoiceConnectorGroupResponse) -> Unit = definedExternally): Request<DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, AWSError>
    open fun disassociateSigninDelegateGroupsFromAccount(params: DisassociateSigninDelegateGroupsFromAccountRequest, callback: (err: AWSError, data: DisassociateSigninDelegateGroupsFromAccountResponse) -> Unit = definedExternally): Request<DisassociateSigninDelegateGroupsFromAccountResponse, AWSError>
    open fun disassociateSigninDelegateGroupsFromAccount(callback: (err: AWSError, data: DisassociateSigninDelegateGroupsFromAccountResponse) -> Unit = definedExternally): Request<DisassociateSigninDelegateGroupsFromAccountResponse, AWSError>
    open fun getAccount(params: GetAccountRequest, callback: (err: AWSError, data: GetAccountResponse) -> Unit = definedExternally): Request<GetAccountResponse, AWSError>
    open fun getAccount(callback: (err: AWSError, data: GetAccountResponse) -> Unit = definedExternally): Request<GetAccountResponse, AWSError>
    open fun getAccountSettings(params: GetAccountSettingsRequest, callback: (err: AWSError, data: GetAccountSettingsResponse) -> Unit = definedExternally): Request<GetAccountSettingsResponse, AWSError>
    open fun getAccountSettings(callback: (err: AWSError, data: GetAccountSettingsResponse) -> Unit = definedExternally): Request<GetAccountSettingsResponse, AWSError>
    open fun getAttendee(params: GetAttendeeRequest, callback: (err: AWSError, data: GetAttendeeResponse) -> Unit = definedExternally): Request<GetAttendeeResponse, AWSError>
    open fun getAttendee(callback: (err: AWSError, data: GetAttendeeResponse) -> Unit = definedExternally): Request<GetAttendeeResponse, AWSError>
    open fun getBot(params: GetBotRequest, callback: (err: AWSError, data: GetBotResponse) -> Unit = definedExternally): Request<GetBotResponse, AWSError>
    open fun getBot(callback: (err: AWSError, data: GetBotResponse) -> Unit = definedExternally): Request<GetBotResponse, AWSError>
    open fun getEventsConfiguration(params: GetEventsConfigurationRequest, callback: (err: AWSError, data: GetEventsConfigurationResponse) -> Unit = definedExternally): Request<GetEventsConfigurationResponse, AWSError>
    open fun getEventsConfiguration(callback: (err: AWSError, data: GetEventsConfigurationResponse) -> Unit = definedExternally): Request<GetEventsConfigurationResponse, AWSError>
    open fun getGlobalSettings(callback: (err: AWSError, data: GetGlobalSettingsResponse) -> Unit = definedExternally): Request<GetGlobalSettingsResponse, AWSError>
    open fun getMeeting(params: GetMeetingRequest, callback: (err: AWSError, data: GetMeetingResponse) -> Unit = definedExternally): Request<GetMeetingResponse, AWSError>
    open fun getMeeting(callback: (err: AWSError, data: GetMeetingResponse) -> Unit = definedExternally): Request<GetMeetingResponse, AWSError>
    open fun getPhoneNumber(params: GetPhoneNumberRequest, callback: (err: AWSError, data: GetPhoneNumberResponse) -> Unit = definedExternally): Request<GetPhoneNumberResponse, AWSError>
    open fun getPhoneNumber(callback: (err: AWSError, data: GetPhoneNumberResponse) -> Unit = definedExternally): Request<GetPhoneNumberResponse, AWSError>
    open fun getPhoneNumberOrder(params: GetPhoneNumberOrderRequest, callback: (err: AWSError, data: GetPhoneNumberOrderResponse) -> Unit = definedExternally): Request<GetPhoneNumberOrderResponse, AWSError>
    open fun getPhoneNumberOrder(callback: (err: AWSError, data: GetPhoneNumberOrderResponse) -> Unit = definedExternally): Request<GetPhoneNumberOrderResponse, AWSError>
    open fun getPhoneNumberSettings(callback: (err: AWSError, data: GetPhoneNumberSettingsResponse) -> Unit = definedExternally): Request<GetPhoneNumberSettingsResponse, AWSError>
    open fun getRoom(params: GetRoomRequest, callback: (err: AWSError, data: GetRoomResponse) -> Unit = definedExternally): Request<GetRoomResponse, AWSError>
    open fun getRoom(callback: (err: AWSError, data: GetRoomResponse) -> Unit = definedExternally): Request<GetRoomResponse, AWSError>
    open fun getUser(params: GetUserRequest, callback: (err: AWSError, data: GetUserResponse) -> Unit = definedExternally): Request<GetUserResponse, AWSError>
    open fun getUser(callback: (err: AWSError, data: GetUserResponse) -> Unit = definedExternally): Request<GetUserResponse, AWSError>
    open fun getUserSettings(params: GetUserSettingsRequest, callback: (err: AWSError, data: GetUserSettingsResponse) -> Unit = definedExternally): Request<GetUserSettingsResponse, AWSError>
    open fun getUserSettings(callback: (err: AWSError, data: GetUserSettingsResponse) -> Unit = definedExternally): Request<GetUserSettingsResponse, AWSError>
    open fun getVoiceConnector(params: GetVoiceConnectorRequest, callback: (err: AWSError, data: GetVoiceConnectorResponse) -> Unit = definedExternally): Request<GetVoiceConnectorResponse, AWSError>
    open fun getVoiceConnector(callback: (err: AWSError, data: GetVoiceConnectorResponse) -> Unit = definedExternally): Request<GetVoiceConnectorResponse, AWSError>
    open fun getVoiceConnectorGroup(params: GetVoiceConnectorGroupRequest, callback: (err: AWSError, data: GetVoiceConnectorGroupResponse) -> Unit = definedExternally): Request<GetVoiceConnectorGroupResponse, AWSError>
    open fun getVoiceConnectorGroup(callback: (err: AWSError, data: GetVoiceConnectorGroupResponse) -> Unit = definedExternally): Request<GetVoiceConnectorGroupResponse, AWSError>
    open fun getVoiceConnectorLoggingConfiguration(params: GetVoiceConnectorLoggingConfigurationRequest, callback: (err: AWSError, data: GetVoiceConnectorLoggingConfigurationResponse) -> Unit = definedExternally): Request<GetVoiceConnectorLoggingConfigurationResponse, AWSError>
    open fun getVoiceConnectorLoggingConfiguration(callback: (err: AWSError, data: GetVoiceConnectorLoggingConfigurationResponse) -> Unit = definedExternally): Request<GetVoiceConnectorLoggingConfigurationResponse, AWSError>
    open fun getVoiceConnectorOrigination(params: GetVoiceConnectorOriginationRequest, callback: (err: AWSError, data: GetVoiceConnectorOriginationResponse) -> Unit = definedExternally): Request<GetVoiceConnectorOriginationResponse, AWSError>
    open fun getVoiceConnectorOrigination(callback: (err: AWSError, data: GetVoiceConnectorOriginationResponse) -> Unit = definedExternally): Request<GetVoiceConnectorOriginationResponse, AWSError>
    open fun getVoiceConnectorStreamingConfiguration(params: GetVoiceConnectorStreamingConfigurationRequest, callback: (err: AWSError, data: GetVoiceConnectorStreamingConfigurationResponse) -> Unit = definedExternally): Request<GetVoiceConnectorStreamingConfigurationResponse, AWSError>
    open fun getVoiceConnectorStreamingConfiguration(callback: (err: AWSError, data: GetVoiceConnectorStreamingConfigurationResponse) -> Unit = definedExternally): Request<GetVoiceConnectorStreamingConfigurationResponse, AWSError>
    open fun getVoiceConnectorTermination(params: GetVoiceConnectorTerminationRequest, callback: (err: AWSError, data: GetVoiceConnectorTerminationResponse) -> Unit = definedExternally): Request<GetVoiceConnectorTerminationResponse, AWSError>
    open fun getVoiceConnectorTermination(callback: (err: AWSError, data: GetVoiceConnectorTerminationResponse) -> Unit = definedExternally): Request<GetVoiceConnectorTerminationResponse, AWSError>
    open fun getVoiceConnectorTerminationHealth(params: GetVoiceConnectorTerminationHealthRequest, callback: (err: AWSError, data: GetVoiceConnectorTerminationHealthResponse) -> Unit = definedExternally): Request<GetVoiceConnectorTerminationHealthResponse, AWSError>
    open fun getVoiceConnectorTerminationHealth(callback: (err: AWSError, data: GetVoiceConnectorTerminationHealthResponse) -> Unit = definedExternally): Request<GetVoiceConnectorTerminationHealthResponse, AWSError>
    open fun inviteUsers(params: InviteUsersRequest, callback: (err: AWSError, data: InviteUsersResponse) -> Unit = definedExternally): Request<InviteUsersResponse, AWSError>
    open fun inviteUsers(callback: (err: AWSError, data: InviteUsersResponse) -> Unit = definedExternally): Request<InviteUsersResponse, AWSError>
    open fun listAccounts(params: ListAccountsRequest, callback: (err: AWSError, data: ListAccountsResponse) -> Unit = definedExternally): Request<ListAccountsResponse, AWSError>
    open fun listAccounts(callback: (err: AWSError, data: ListAccountsResponse) -> Unit = definedExternally): Request<ListAccountsResponse, AWSError>
    open fun listAttendees(params: ListAttendeesRequest, callback: (err: AWSError, data: ListAttendeesResponse) -> Unit = definedExternally): Request<ListAttendeesResponse, AWSError>
    open fun listAttendees(callback: (err: AWSError, data: ListAttendeesResponse) -> Unit = definedExternally): Request<ListAttendeesResponse, AWSError>
    open fun listBots(params: ListBotsRequest, callback: (err: AWSError, data: ListBotsResponse) -> Unit = definedExternally): Request<ListBotsResponse, AWSError>
    open fun listBots(callback: (err: AWSError, data: ListBotsResponse) -> Unit = definedExternally): Request<ListBotsResponse, AWSError>
    open fun listMeetings(params: ListMeetingsRequest, callback: (err: AWSError, data: ListMeetingsResponse) -> Unit = definedExternally): Request<ListMeetingsResponse, AWSError>
    open fun listMeetings(callback: (err: AWSError, data: ListMeetingsResponse) -> Unit = definedExternally): Request<ListMeetingsResponse, AWSError>
    open fun listPhoneNumberOrders(params: ListPhoneNumberOrdersRequest, callback: (err: AWSError, data: ListPhoneNumberOrdersResponse) -> Unit = definedExternally): Request<ListPhoneNumberOrdersResponse, AWSError>
    open fun listPhoneNumberOrders(callback: (err: AWSError, data: ListPhoneNumberOrdersResponse) -> Unit = definedExternally): Request<ListPhoneNumberOrdersResponse, AWSError>
    open fun listPhoneNumbers(params: ListPhoneNumbersRequest, callback: (err: AWSError, data: ListPhoneNumbersResponse) -> Unit = definedExternally): Request<ListPhoneNumbersResponse, AWSError>
    open fun listPhoneNumbers(callback: (err: AWSError, data: ListPhoneNumbersResponse) -> Unit = definedExternally): Request<ListPhoneNumbersResponse, AWSError>
    open fun listRoomMemberships(params: ListRoomMembershipsRequest, callback: (err: AWSError, data: ListRoomMembershipsResponse) -> Unit = definedExternally): Request<ListRoomMembershipsResponse, AWSError>
    open fun listRoomMemberships(callback: (err: AWSError, data: ListRoomMembershipsResponse) -> Unit = definedExternally): Request<ListRoomMembershipsResponse, AWSError>
    open fun listRooms(params: ListRoomsRequest, callback: (err: AWSError, data: ListRoomsResponse) -> Unit = definedExternally): Request<ListRoomsResponse, AWSError>
    open fun listRooms(callback: (err: AWSError, data: ListRoomsResponse) -> Unit = definedExternally): Request<ListRoomsResponse, AWSError>
    open fun listUsers(params: ListUsersRequest, callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listUsers(callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listVoiceConnectorGroups(params: ListVoiceConnectorGroupsRequest, callback: (err: AWSError, data: ListVoiceConnectorGroupsResponse) -> Unit = definedExternally): Request<ListVoiceConnectorGroupsResponse, AWSError>
    open fun listVoiceConnectorGroups(callback: (err: AWSError, data: ListVoiceConnectorGroupsResponse) -> Unit = definedExternally): Request<ListVoiceConnectorGroupsResponse, AWSError>
    open fun listVoiceConnectorTerminationCredentials(params: ListVoiceConnectorTerminationCredentialsRequest, callback: (err: AWSError, data: ListVoiceConnectorTerminationCredentialsResponse) -> Unit = definedExternally): Request<ListVoiceConnectorTerminationCredentialsResponse, AWSError>
    open fun listVoiceConnectorTerminationCredentials(callback: (err: AWSError, data: ListVoiceConnectorTerminationCredentialsResponse) -> Unit = definedExternally): Request<ListVoiceConnectorTerminationCredentialsResponse, AWSError>
    open fun listVoiceConnectors(params: ListVoiceConnectorsRequest, callback: (err: AWSError, data: ListVoiceConnectorsResponse) -> Unit = definedExternally): Request<ListVoiceConnectorsResponse, AWSError>
    open fun listVoiceConnectors(callback: (err: AWSError, data: ListVoiceConnectorsResponse) -> Unit = definedExternally): Request<ListVoiceConnectorsResponse, AWSError>
    open fun logoutUser(params: LogoutUserRequest, callback: (err: AWSError, data: LogoutUserResponse) -> Unit = definedExternally): Request<LogoutUserResponse, AWSError>
    open fun logoutUser(callback: (err: AWSError, data: LogoutUserResponse) -> Unit = definedExternally): Request<LogoutUserResponse, AWSError>
    open fun putEventsConfiguration(params: PutEventsConfigurationRequest, callback: (err: AWSError, data: PutEventsConfigurationResponse) -> Unit = definedExternally): Request<PutEventsConfigurationResponse, AWSError>
    open fun putEventsConfiguration(callback: (err: AWSError, data: PutEventsConfigurationResponse) -> Unit = definedExternally): Request<PutEventsConfigurationResponse, AWSError>
    open fun putVoiceConnectorLoggingConfiguration(params: PutVoiceConnectorLoggingConfigurationRequest, callback: (err: AWSError, data: PutVoiceConnectorLoggingConfigurationResponse) -> Unit = definedExternally): Request<PutVoiceConnectorLoggingConfigurationResponse, AWSError>
    open fun putVoiceConnectorLoggingConfiguration(callback: (err: AWSError, data: PutVoiceConnectorLoggingConfigurationResponse) -> Unit = definedExternally): Request<PutVoiceConnectorLoggingConfigurationResponse, AWSError>
    open fun putVoiceConnectorOrigination(params: PutVoiceConnectorOriginationRequest, callback: (err: AWSError, data: PutVoiceConnectorOriginationResponse) -> Unit = definedExternally): Request<PutVoiceConnectorOriginationResponse, AWSError>
    open fun putVoiceConnectorOrigination(callback: (err: AWSError, data: PutVoiceConnectorOriginationResponse) -> Unit = definedExternally): Request<PutVoiceConnectorOriginationResponse, AWSError>
    open fun putVoiceConnectorStreamingConfiguration(params: PutVoiceConnectorStreamingConfigurationRequest, callback: (err: AWSError, data: PutVoiceConnectorStreamingConfigurationResponse) -> Unit = definedExternally): Request<PutVoiceConnectorStreamingConfigurationResponse, AWSError>
    open fun putVoiceConnectorStreamingConfiguration(callback: (err: AWSError, data: PutVoiceConnectorStreamingConfigurationResponse) -> Unit = definedExternally): Request<PutVoiceConnectorStreamingConfigurationResponse, AWSError>
    open fun putVoiceConnectorTermination(params: PutVoiceConnectorTerminationRequest, callback: (err: AWSError, data: PutVoiceConnectorTerminationResponse) -> Unit = definedExternally): Request<PutVoiceConnectorTerminationResponse, AWSError>
    open fun putVoiceConnectorTermination(callback: (err: AWSError, data: PutVoiceConnectorTerminationResponse) -> Unit = definedExternally): Request<PutVoiceConnectorTerminationResponse, AWSError>
    open fun putVoiceConnectorTerminationCredentials(params: PutVoiceConnectorTerminationCredentialsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putVoiceConnectorTerminationCredentials(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun regenerateSecurityToken(params: RegenerateSecurityTokenRequest, callback: (err: AWSError, data: RegenerateSecurityTokenResponse) -> Unit = definedExternally): Request<RegenerateSecurityTokenResponse, AWSError>
    open fun regenerateSecurityToken(callback: (err: AWSError, data: RegenerateSecurityTokenResponse) -> Unit = definedExternally): Request<RegenerateSecurityTokenResponse, AWSError>
    open fun resetPersonalPIN(params: ResetPersonalPINRequest, callback: (err: AWSError, data: ResetPersonalPINResponse) -> Unit = definedExternally): Request<ResetPersonalPINResponse, AWSError>
    open fun resetPersonalPIN(callback: (err: AWSError, data: ResetPersonalPINResponse) -> Unit = definedExternally): Request<ResetPersonalPINResponse, AWSError>
    open fun restorePhoneNumber(params: RestorePhoneNumberRequest, callback: (err: AWSError, data: RestorePhoneNumberResponse) -> Unit = definedExternally): Request<RestorePhoneNumberResponse, AWSError>
    open fun restorePhoneNumber(callback: (err: AWSError, data: RestorePhoneNumberResponse) -> Unit = definedExternally): Request<RestorePhoneNumberResponse, AWSError>
    open fun searchAvailablePhoneNumbers(params: SearchAvailablePhoneNumbersRequest, callback: (err: AWSError, data: SearchAvailablePhoneNumbersResponse) -> Unit = definedExternally): Request<SearchAvailablePhoneNumbersResponse, AWSError>
    open fun searchAvailablePhoneNumbers(callback: (err: AWSError, data: SearchAvailablePhoneNumbersResponse) -> Unit = definedExternally): Request<SearchAvailablePhoneNumbersResponse, AWSError>
    open fun updateAccount(params: UpdateAccountRequest, callback: (err: AWSError, data: UpdateAccountResponse) -> Unit = definedExternally): Request<UpdateAccountResponse, AWSError>
    open fun updateAccount(callback: (err: AWSError, data: UpdateAccountResponse) -> Unit = definedExternally): Request<UpdateAccountResponse, AWSError>
    open fun updateAccountSettings(params: UpdateAccountSettingsRequest, callback: (err: AWSError, data: UpdateAccountSettingsResponse) -> Unit = definedExternally): Request<UpdateAccountSettingsResponse, AWSError>
    open fun updateAccountSettings(callback: (err: AWSError, data: UpdateAccountSettingsResponse) -> Unit = definedExternally): Request<UpdateAccountSettingsResponse, AWSError>
    open fun updateBot(params: UpdateBotRequest, callback: (err: AWSError, data: UpdateBotResponse) -> Unit = definedExternally): Request<UpdateBotResponse, AWSError>
    open fun updateBot(callback: (err: AWSError, data: UpdateBotResponse) -> Unit = definedExternally): Request<UpdateBotResponse, AWSError>
    open fun updateGlobalSettings(params: UpdateGlobalSettingsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateGlobalSettings(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updatePhoneNumber(params: UpdatePhoneNumberRequest, callback: (err: AWSError, data: UpdatePhoneNumberResponse) -> Unit = definedExternally): Request<UpdatePhoneNumberResponse, AWSError>
    open fun updatePhoneNumber(callback: (err: AWSError, data: UpdatePhoneNumberResponse) -> Unit = definedExternally): Request<UpdatePhoneNumberResponse, AWSError>
    open fun updatePhoneNumberSettings(params: UpdatePhoneNumberSettingsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updatePhoneNumberSettings(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateRoom(params: UpdateRoomRequest, callback: (err: AWSError, data: UpdateRoomResponse) -> Unit = definedExternally): Request<UpdateRoomResponse, AWSError>
    open fun updateRoom(callback: (err: AWSError, data: UpdateRoomResponse) -> Unit = definedExternally): Request<UpdateRoomResponse, AWSError>
    open fun updateRoomMembership(params: UpdateRoomMembershipRequest, callback: (err: AWSError, data: UpdateRoomMembershipResponse) -> Unit = definedExternally): Request<UpdateRoomMembershipResponse, AWSError>
    open fun updateRoomMembership(callback: (err: AWSError, data: UpdateRoomMembershipResponse) -> Unit = definedExternally): Request<UpdateRoomMembershipResponse, AWSError>
    open fun updateUser(params: UpdateUserRequest, callback: (err: AWSError, data: UpdateUserResponse) -> Unit = definedExternally): Request<UpdateUserResponse, AWSError>
    open fun updateUser(callback: (err: AWSError, data: UpdateUserResponse) -> Unit = definedExternally): Request<UpdateUserResponse, AWSError>
    open fun updateUserSettings(params: UpdateUserSettingsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUserSettings(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateVoiceConnector(params: UpdateVoiceConnectorRequest, callback: (err: AWSError, data: UpdateVoiceConnectorResponse) -> Unit = definedExternally): Request<UpdateVoiceConnectorResponse, AWSError>
    open fun updateVoiceConnector(callback: (err: AWSError, data: UpdateVoiceConnectorResponse) -> Unit = definedExternally): Request<UpdateVoiceConnectorResponse, AWSError>
    open fun updateVoiceConnectorGroup(params: UpdateVoiceConnectorGroupRequest, callback: (err: AWSError, data: UpdateVoiceConnectorGroupResponse) -> Unit = definedExternally): Request<UpdateVoiceConnectorGroupResponse, AWSError>
    open fun updateVoiceConnectorGroup(callback: (err: AWSError, data: UpdateVoiceConnectorGroupResponse) -> Unit = definedExternally): Request<UpdateVoiceConnectorGroupResponse, AWSError>
    interface Account {
        var AwsAccountId: String
        var AccountId: String
        var Name: String
        var AccountType: String /* "Team" | "EnterpriseDirectory" | "EnterpriseLWA" | "EnterpriseOIDC" | String */
        var CreatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultLicense: String /* "Basic" | "Plus" | "Pro" | "ProTrial" | String */
        var SupportedLicenses: LicenseList?
            get() = definedExternally
            set(value) = definedExternally
        var SigninDelegateGroups: SigninDelegateGroupList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccountSettings {
        var DisableRemoteControl: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var EnableDialOut: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AlexaForBusinessMetadata {
        var IsAlexaForBusinessEnabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var AlexaForBusinessRoomArn: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociatePhoneNumberWithUserRequest {
        var AccountId: String
        var UserId: String
        var E164PhoneNumber: E164PhoneNumber
    }
    interface AssociatePhoneNumberWithUserResponse
    interface AssociatePhoneNumbersWithVoiceConnectorGroupRequest {
        var VoiceConnectorGroupId: NonEmptyString
        var E164PhoneNumbers: E164PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
        var ForceAssociate: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociatePhoneNumbersWithVoiceConnectorGroupResponse {
        var PhoneNumberErrors: PhoneNumberErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociatePhoneNumbersWithVoiceConnectorRequest {
        var VoiceConnectorId: NonEmptyString
        var E164PhoneNumbers: E164PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
        var ForceAssociate: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociatePhoneNumbersWithVoiceConnectorResponse {
        var PhoneNumberErrors: PhoneNumberErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateSigninDelegateGroupsWithAccountRequest {
        var AccountId: NonEmptyString
        var SigninDelegateGroups: SigninDelegateGroupList
    }
    interface AssociateSigninDelegateGroupsWithAccountResponse
    interface Attendee {
        var ExternalUserId: ExternalUserIdType?
            get() = definedExternally
            set(value) = definedExternally
        var AttendeeId: GuidString?
            get() = definedExternally
            set(value) = definedExternally
        var JoinToken: JoinTokenString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchCreateAttendeeRequest {
        var MeetingId: GuidString
        var Attendees: CreateAttendeeRequestItemList
    }
    interface BatchCreateAttendeeResponse {
        var Attendees: AttendeeList?
            get() = definedExternally
            set(value) = definedExternally
        var Errors: BatchCreateAttendeeErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchCreateRoomMembershipRequest {
        var AccountId: NonEmptyString
        var RoomId: NonEmptyString
        var MembershipItemList: MembershipItemList
    }
    interface BatchCreateRoomMembershipResponse {
        var Errors: MemberErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeletePhoneNumberRequest {
        var PhoneNumberIds: NonEmptyStringList
    }
    interface BatchDeletePhoneNumberResponse {
        var PhoneNumberErrors: PhoneNumberErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchSuspendUserRequest {
        var AccountId: NonEmptyString
        var UserIdList: UserIdList
    }
    interface BatchSuspendUserResponse {
        var UserErrors: UserErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchUnsuspendUserRequest {
        var AccountId: NonEmptyString
        var UserIdList: UserIdList
    }
    interface BatchUnsuspendUserResponse {
        var UserErrors: UserErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchUpdatePhoneNumberRequest {
        var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
    }
    interface BatchUpdatePhoneNumberResponse {
        var PhoneNumberErrors: PhoneNumberErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchUpdateUserRequest {
        var AccountId: NonEmptyString
        var UpdateUserRequestItems: UpdateUserRequestItemList
    }
    interface BatchUpdateUserResponse {
        var UserErrors: UserErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Bot {
        var BotId: String?
            get() = definedExternally
            set(value) = definedExternally
        var UserId: String?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var BotType: String /* "ChatBot" | String */
        var Disabled: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var BotEmail: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityToken: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BusinessCallingSettings {
        var CdrBucket: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAccountRequest {
        var Name: AccountName
    }
    interface CreateAccountResponse {
        var Account: Account?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAttendeeError {
        var ExternalUserId: ExternalUserIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAttendeeRequest {
        var MeetingId: GuidString
        var ExternalUserId: ExternalUserIdType
    }
    interface CreateAttendeeRequestItem {
        var ExternalUserId: ExternalUserIdType
    }
    interface CreateAttendeeResponse {
        var Attendee: Attendee?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBotRequest {
        var AccountId: NonEmptyString
        var DisplayName: SensitiveString
        var Domain: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBotResponse {
        var Bot: Bot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMeetingRequest {
        var ClientRequestToken: ClientRequestToken
        var MeetingHostId: ExternalUserIdType?
            get() = definedExternally
            set(value) = definedExternally
        var MediaRegion: String?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationsConfiguration: MeetingNotificationConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMeetingResponse {
        var Meeting: Meeting?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePhoneNumberOrderRequest {
        var ProductType: String /* "BusinessCalling" | "VoiceConnector" | String */
        var E164PhoneNumbers: E164PhoneNumberList
    }
    interface CreatePhoneNumberOrderResponse {
        var PhoneNumberOrder: PhoneNumberOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRoomMembershipRequest {
        var AccountId: NonEmptyString
        var RoomId: NonEmptyString
        var MemberId: NonEmptyString
        var Role: String /* "Administrator" | "Member" | String */
    }
    interface CreateRoomMembershipResponse {
        var RoomMembership: RoomMembership?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRoomRequest {
        var AccountId: NonEmptyString
        var Name: SensitiveString
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRoomResponse {
        var Room: Room?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserRequest {
        var AccountId: NonEmptyString
        var Username: String?
            get() = definedExternally
            set(value) = definedExternally
        var Email: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var UserType: String /* "PrivateUser" | "SharedDevice" | String */
    }
    interface CreateUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVoiceConnectorGroupRequest {
        var Name: VoiceConnectorGroupName
        var VoiceConnectorItems: VoiceConnectorItemList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVoiceConnectorGroupResponse {
        var VoiceConnectorGroup: VoiceConnectorGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVoiceConnectorRequest {
        var Name: VoiceConnectorName
        var AwsRegion: String /* "us-east-1" | "us-west-2" | String */
        var RequireEncryption: Boolean
    }
    interface CreateVoiceConnectorResponse {
        var VoiceConnector: VoiceConnector?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Credential {
        var Username: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var Password: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAccountRequest {
        var AccountId: NonEmptyString
    }
    interface DeleteAccountResponse
    interface DeleteAttendeeRequest {
        var MeetingId: GuidString
        var AttendeeId: GuidString
    }
    interface DeleteEventsConfigurationRequest {
        var AccountId: NonEmptyString
        var BotId: NonEmptyString
    }
    interface DeleteMeetingRequest {
        var MeetingId: GuidString
    }
    interface DeletePhoneNumberRequest {
        var PhoneNumberId: String
    }
    interface DeleteRoomMembershipRequest {
        var AccountId: NonEmptyString
        var RoomId: NonEmptyString
        var MemberId: NonEmptyString
    }
    interface DeleteRoomRequest {
        var AccountId: NonEmptyString
        var RoomId: NonEmptyString
    }
    interface DeleteVoiceConnectorGroupRequest {
        var VoiceConnectorGroupId: NonEmptyString
    }
    interface DeleteVoiceConnectorOriginationRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface DeleteVoiceConnectorRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface DeleteVoiceConnectorStreamingConfigurationRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface DeleteVoiceConnectorTerminationCredentialsRequest {
        var VoiceConnectorId: NonEmptyString
        var Usernames: SensitiveStringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteVoiceConnectorTerminationRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface DisassociatePhoneNumberFromUserRequest {
        var AccountId: String
        var UserId: String
    }
    interface DisassociatePhoneNumberFromUserResponse
    interface DisassociatePhoneNumbersFromVoiceConnectorGroupRequest {
        var VoiceConnectorGroupId: NonEmptyString
        var E164PhoneNumbers: E164PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociatePhoneNumbersFromVoiceConnectorGroupResponse {
        var PhoneNumberErrors: PhoneNumberErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociatePhoneNumbersFromVoiceConnectorRequest {
        var VoiceConnectorId: NonEmptyString
        var E164PhoneNumbers: E164PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociatePhoneNumbersFromVoiceConnectorResponse {
        var PhoneNumberErrors: PhoneNumberErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateSigninDelegateGroupsFromAccountRequest {
        var AccountId: NonEmptyString
        var GroupNames: NonEmptyStringList
    }
    interface DisassociateSigninDelegateGroupsFromAccountResponse
    interface EventsConfiguration {
        var BotId: String?
            get() = definedExternally
            set(value) = definedExternally
        var OutboundEventsHTTPSEndpoint: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaFunctionArn: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccountRequest {
        var AccountId: NonEmptyString
    }
    interface GetAccountResponse {
        var Account: Account?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccountSettingsRequest {
        var AccountId: NonEmptyString
    }
    interface GetAccountSettingsResponse {
        var AccountSettings: AccountSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAttendeeRequest {
        var MeetingId: GuidString
        var AttendeeId: GuidString
    }
    interface GetAttendeeResponse {
        var Attendee: Attendee?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBotRequest {
        var AccountId: NonEmptyString
        var BotId: NonEmptyString
    }
    interface GetBotResponse {
        var Bot: Bot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetEventsConfigurationRequest {
        var AccountId: NonEmptyString
        var BotId: NonEmptyString
    }
    interface GetEventsConfigurationResponse {
        var EventsConfiguration: EventsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGlobalSettingsResponse {
        var BusinessCalling: BusinessCallingSettings?
            get() = definedExternally
            set(value) = definedExternally
        var VoiceConnector: VoiceConnectorSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMeetingRequest {
        var MeetingId: GuidString
    }
    interface GetMeetingResponse {
        var Meeting: Meeting?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPhoneNumberOrderRequest {
        var PhoneNumberOrderId: GuidString
    }
    interface GetPhoneNumberOrderResponse {
        var PhoneNumberOrder: PhoneNumberOrder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPhoneNumberRequest {
        var PhoneNumberId: String
    }
    interface GetPhoneNumberResponse {
        var PhoneNumber: PhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPhoneNumberSettingsResponse {
        var CallingName: CallingName?
            get() = definedExternally
            set(value) = definedExternally
        var CallingNameUpdatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRoomRequest {
        var AccountId: NonEmptyString
        var RoomId: NonEmptyString
    }
    interface GetRoomResponse {
        var Room: Room?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUserRequest {
        var AccountId: NonEmptyString
        var UserId: NonEmptyString
    }
    interface GetUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUserSettingsRequest {
        var AccountId: String
        var UserId: String
    }
    interface GetUserSettingsResponse {
        var UserSettings: UserSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVoiceConnectorGroupRequest {
        var VoiceConnectorGroupId: NonEmptyString
    }
    interface GetVoiceConnectorGroupResponse {
        var VoiceConnectorGroup: VoiceConnectorGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVoiceConnectorLoggingConfigurationRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface GetVoiceConnectorLoggingConfigurationResponse {
        var LoggingConfiguration: LoggingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVoiceConnectorOriginationRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface GetVoiceConnectorOriginationResponse {
        var Origination: Origination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVoiceConnectorRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface GetVoiceConnectorResponse {
        var VoiceConnector: VoiceConnector?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVoiceConnectorStreamingConfigurationRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface GetVoiceConnectorStreamingConfigurationResponse {
        var StreamingConfiguration: StreamingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVoiceConnectorTerminationHealthRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface GetVoiceConnectorTerminationHealthResponse {
        var TerminationHealth: TerminationHealth?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVoiceConnectorTerminationRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface GetVoiceConnectorTerminationResponse {
        var Termination: Termination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Invite {
        var InviteId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Pending" | "Accepted" | "Failed" | String */
        var EmailAddress: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var EmailStatus: String /* "NotSent" | "Sent" | "Failed" | String */
    }
    interface InviteUsersRequest {
        var AccountId: NonEmptyString
        var UserEmailList: UserEmailList
        var UserType: String /* "PrivateUser" | "SharedDevice" | String */
    }
    interface InviteUsersResponse {
        var Invites: InviteList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountsRequest {
        var Name: AccountName?
            get() = definedExternally
            set(value) = definedExternally
        var UserEmail: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ProfileServiceMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountsResponse {
        var Accounts: AccountList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttendeesRequest {
        var MeetingId: GuidString
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultMax?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttendeesResponse {
        var Attendees: AttendeeList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBotsRequest {
        var AccountId: NonEmptyString
        var MaxResults: ResultMax?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListBotsResponse {
        var Bots: BotList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMeetingsRequest {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultMax?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMeetingsResponse {
        var Meetings: MeetingList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPhoneNumberOrdersRequest {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultMax?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPhoneNumberOrdersResponse {
        var PhoneNumberOrders: PhoneNumberOrderList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPhoneNumbersRequest {
        var Status: String /* "AcquireInProgress" | "AcquireFailed" | "Unassigned" | "Assigned" | "ReleaseInProgress" | "DeleteInProgress" | "ReleaseFailed" | "DeleteFailed" | String */
        var ProductType: String /* "BusinessCalling" | "VoiceConnector" | String */
        var FilterName: String /* "AccountId" | "UserId" | "VoiceConnectorId" | "VoiceConnectorGroupId" | String */
        var FilterValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultMax?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPhoneNumbersResponse {
        var PhoneNumbers: PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRoomMembershipsRequest {
        var AccountId: NonEmptyString
        var RoomId: NonEmptyString
        var MaxResults: ResultMax?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRoomMembershipsResponse {
        var RoomMemberships: RoomMembershipList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRoomsRequest {
        var AccountId: NonEmptyString
        var MemberId: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultMax?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRoomsResponse {
        var Rooms: RoomList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersRequest {
        var AccountId: NonEmptyString
        var UserEmail: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var UserType: String /* "PrivateUser" | "SharedDevice" | String */
        var MaxResults: ProfileServiceMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersResponse {
        var Users: UserList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVoiceConnectorGroupsRequest {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultMax?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVoiceConnectorGroupsResponse {
        var VoiceConnectorGroups: VoiceConnectorGroupList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVoiceConnectorTerminationCredentialsRequest {
        var VoiceConnectorId: NonEmptyString
    }
    interface ListVoiceConnectorTerminationCredentialsResponse {
        var Usernames: SensitiveStringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVoiceConnectorsRequest {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: ResultMax?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVoiceConnectorsResponse {
        var VoiceConnectors: VoiceConnectorList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoggingConfiguration {
        var EnableSIPLogs: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogoutUserRequest {
        var AccountId: NonEmptyString
        var UserId: NonEmptyString
    }
    interface LogoutUserResponse
    interface MediaPlacement {
        var AudioHostUrl: UriType?
            get() = definedExternally
            set(value) = definedExternally
        var AudioFallbackUrl: UriType?
            get() = definedExternally
            set(value) = definedExternally
        var ScreenDataUrl: UriType?
            get() = definedExternally
            set(value) = definedExternally
        var ScreenSharingUrl: UriType?
            get() = definedExternally
            set(value) = definedExternally
        var ScreenViewingUrl: UriType?
            get() = definedExternally
            set(value) = definedExternally
        var SignalingUrl: UriType?
            get() = definedExternally
            set(value) = definedExternally
        var TurnControlUrl: UriType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Meeting {
        var MeetingId: GuidString?
            get() = definedExternally
            set(value) = definedExternally
        var MediaPlacement: MediaPlacement?
            get() = definedExternally
            set(value) = definedExternally
        var MediaRegion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MeetingNotificationConfiguration {
        var SnsTopicArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var SqsQueueArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Member {
        var MemberId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var MemberType: String /* "User" | "Bot" | "Webhook" | String */
        var Email: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var FullName: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberError {
        var MemberId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "BadRequest" | "Conflict" | "Forbidden" | "NotFound" | "PreconditionFailed" | "ResourceLimitExceeded" | "ServiceFailure" | "AccessDenied" | "ServiceUnavailable" | "Throttled" | "Unauthorized" | "Unprocessable" | "VoiceConnectorGroupAssociationsExist" | "PhoneNumberAssociationsExist" | String */
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MembershipItem {
        var MemberId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Role: String /* "Administrator" | "Member" | String */
    }
    interface OrderedPhoneNumber {
        var E164PhoneNumber: E164PhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Processing" | "Acquired" | "Failed" | String */
    }
    interface Origination {
        var Routes: OriginationRouteList?
            get() = definedExternally
            set(value) = definedExternally
        var Disabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OriginationRoute {
        var Host: String?
            get() = definedExternally
            set(value) = definedExternally
        var Port: Port?
            get() = definedExternally
            set(value) = definedExternally
        var Protocol: String /* "TCP" | "UDP" | String */
        var Priority: OriginationRoutePriority?
            get() = definedExternally
            set(value) = definedExternally
        var Weight: OriginationRouteWeight?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PhoneNumber {
        var PhoneNumberId: String?
            get() = definedExternally
            set(value) = definedExternally
        var E164PhoneNumber: E164PhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "Local" | "TollFree" | String */
        var ProductType: String /* "BusinessCalling" | "VoiceConnector" | String */
        var Status: String /* "AcquireInProgress" | "AcquireFailed" | "Unassigned" | "Assigned" | "ReleaseInProgress" | "DeleteInProgress" | "ReleaseFailed" | "DeleteFailed" | String */
        var Capabilities: PhoneNumberCapabilities?
            get() = definedExternally
            set(value) = definedExternally
        var Associations: PhoneNumberAssociationList?
            get() = definedExternally
            set(value) = definedExternally
        var CallingName: CallingName?
            get() = definedExternally
            set(value) = definedExternally
        var CallingNameStatus: String /* "Unassigned" | "UpdateInProgress" | "UpdateSucceeded" | "UpdateFailed" | String */
        var CreatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PhoneNumberAssociation {
        var Value: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String /* "AccountId" | "UserId" | "VoiceConnectorId" | "VoiceConnectorGroupId" | String */
        var AssociatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PhoneNumberCapabilities {
        var InboundCall: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var OutboundCall: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var InboundSMS: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var OutboundSMS: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var InboundMMS: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var OutboundMMS: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PhoneNumberError {
        var PhoneNumberId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "BadRequest" | "Conflict" | "Forbidden" | "NotFound" | "PreconditionFailed" | "ResourceLimitExceeded" | "ServiceFailure" | "AccessDenied" | "ServiceUnavailable" | "Throttled" | "Unauthorized" | "Unprocessable" | "VoiceConnectorGroupAssociationsExist" | "PhoneNumberAssociationsExist" | String */
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PhoneNumberOrder {
        var PhoneNumberOrderId: GuidString?
            get() = definedExternally
            set(value) = definedExternally
        var ProductType: String /* "BusinessCalling" | "VoiceConnector" | String */
        var Status: String /* "Processing" | "Successful" | "Failed" | "Partial" | String */
        var OrderedPhoneNumbers: OrderedPhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutEventsConfigurationRequest {
        var AccountId: NonEmptyString
        var BotId: NonEmptyString
        var OutboundEventsHTTPSEndpoint: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaFunctionArn: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutEventsConfigurationResponse {
        var EventsConfiguration: EventsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutVoiceConnectorLoggingConfigurationRequest {
        var VoiceConnectorId: NonEmptyString
        var LoggingConfiguration: LoggingConfiguration
    }
    interface PutVoiceConnectorLoggingConfigurationResponse {
        var LoggingConfiguration: LoggingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutVoiceConnectorOriginationRequest {
        var VoiceConnectorId: NonEmptyString
        var Origination: Origination
    }
    interface PutVoiceConnectorOriginationResponse {
        var Origination: Origination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutVoiceConnectorStreamingConfigurationRequest {
        var VoiceConnectorId: NonEmptyString
        var StreamingConfiguration: StreamingConfiguration
    }
    interface PutVoiceConnectorStreamingConfigurationResponse {
        var StreamingConfiguration: StreamingConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutVoiceConnectorTerminationCredentialsRequest {
        var VoiceConnectorId: NonEmptyString
        var Credentials: CredentialList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutVoiceConnectorTerminationRequest {
        var VoiceConnectorId: NonEmptyString
        var Termination: Termination
    }
    interface PutVoiceConnectorTerminationResponse {
        var Termination: Termination?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegenerateSecurityTokenRequest {
        var AccountId: NonEmptyString
        var BotId: NonEmptyString
    }
    interface RegenerateSecurityTokenResponse {
        var Bot: Bot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResetPersonalPINRequest {
        var AccountId: NonEmptyString
        var UserId: NonEmptyString
    }
    interface ResetPersonalPINResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestorePhoneNumberRequest {
        var PhoneNumberId: NonEmptyString
    }
    interface RestorePhoneNumberResponse {
        var PhoneNumber: PhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Room {
        var RoomId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var AccountId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoomMembership {
        var RoomId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Member: Member?
            get() = definedExternally
            set(value) = definedExternally
        var Role: String /* "Administrator" | "Member" | String */
        var InvitedBy: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchAvailablePhoneNumbersRequest {
        var AreaCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var City: String?
            get() = definedExternally
            set(value) = definedExternally
        var Country: String?
            get() = definedExternally
            set(value) = definedExternally
        var State: String?
            get() = definedExternally
            set(value) = definedExternally
        var TollFreePrefix: TollFreePrefix?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PhoneNumberMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchAvailablePhoneNumbersResponse {
        var E164PhoneNumbers: E164PhoneNumberList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SigninDelegateGroup {
        var GroupName: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StreamingConfiguration {
        var DataRetentionInHours: DataRetentionInHours
        var Disabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TelephonySettings {
        var InboundCalling: Boolean
        var OutboundCalling: Boolean
        var SMS: Boolean
    }
    interface Termination {
        var CpsLimit: CpsLimit?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultPhoneNumber: E164PhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
        var CallingRegions: CallingRegionList?
            get() = definedExternally
            set(value) = definedExternally
        var CidrAllowedList: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var Disabled: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminationHealth {
        var Timestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Source: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAccountRequest {
        var AccountId: NonEmptyString
        var Name: AccountName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAccountResponse {
        var Account: Account?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAccountSettingsRequest {
        var AccountId: NonEmptyString
        var AccountSettings: AccountSettings
    }
    interface UpdateAccountSettingsResponse
    interface UpdateBotRequest {
        var AccountId: NonEmptyString
        var BotId: NonEmptyString
        var Disabled: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateBotResponse {
        var Bot: Bot?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGlobalSettingsRequest {
        var BusinessCalling: BusinessCallingSettings
        var VoiceConnector: VoiceConnectorSettings
    }
    interface UpdatePhoneNumberRequest {
        var PhoneNumberId: String
        var ProductType: String /* "BusinessCalling" | "VoiceConnector" | String */
        var CallingName: CallingName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePhoneNumberRequestItem {
        var PhoneNumberId: NonEmptyString
        var ProductType: String /* "BusinessCalling" | "VoiceConnector" | String */
        var CallingName: CallingName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePhoneNumberResponse {
        var PhoneNumber: PhoneNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePhoneNumberSettingsRequest {
        var CallingName: CallingName
    }
    interface UpdateRoomMembershipRequest {
        var AccountId: NonEmptyString
        var RoomId: NonEmptyString
        var MemberId: NonEmptyString
        var Role: String /* "Administrator" | "Member" | String */
    }
    interface UpdateRoomMembershipResponse {
        var RoomMembership: RoomMembership?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRoomRequest {
        var AccountId: NonEmptyString
        var RoomId: NonEmptyString
        var Name: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRoomResponse {
        var Room: Room?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserRequest {
        var AccountId: NonEmptyString
        var UserId: NonEmptyString
        var LicenseType: String /* "Basic" | "Plus" | "Pro" | "ProTrial" | String */
        var UserType: String /* "PrivateUser" | "SharedDevice" | String */
        var AlexaForBusinessMetadata: AlexaForBusinessMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserRequestItem {
        var UserId: NonEmptyString
        var LicenseType: String /* "Basic" | "Plus" | "Pro" | "ProTrial" | String */
        var UserType: String /* "PrivateUser" | "SharedDevice" | String */
        var AlexaForBusinessMetadata: AlexaForBusinessMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserSettingsRequest {
        var AccountId: String
        var UserId: String
        var UserSettings: UserSettings
    }
    interface UpdateVoiceConnectorGroupRequest {
        var VoiceConnectorGroupId: NonEmptyString
        var Name: VoiceConnectorGroupName
        var VoiceConnectorItems: VoiceConnectorItemList
    }
    interface UpdateVoiceConnectorGroupResponse {
        var VoiceConnectorGroup: VoiceConnectorGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVoiceConnectorRequest {
        var VoiceConnectorId: NonEmptyString
        var Name: VoiceConnectorName
        var RequireEncryption: Boolean
    }
    interface UpdateVoiceConnectorResponse {
        var VoiceConnector: VoiceConnector?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface User {
        var UserId: String
        var AccountId: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrimaryEmail: EmailAddress?
            get() = definedExternally
            set(value) = definedExternally
        var PrimaryProvisionedNumber: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var DisplayName: SensitiveString?
            get() = definedExternally
            set(value) = definedExternally
        var LicenseType: String /* "Basic" | "Plus" | "Pro" | "ProTrial" | String */
        var UserType: String /* "PrivateUser" | "SharedDevice" | String */
        var UserRegistrationStatus: String /* "Unregistered" | "Registered" | "Suspended" | String */
        var UserInvitationStatus: String /* "Pending" | "Accepted" | "Failed" | String */
        var RegisteredOn: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InvitedOn: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var AlexaForBusinessMetadata: AlexaForBusinessMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var PersonalPIN: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserError {
        var UserId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "BadRequest" | "Conflict" | "Forbidden" | "NotFound" | "PreconditionFailed" | "ResourceLimitExceeded" | "ServiceFailure" | "AccessDenied" | "ServiceUnavailable" | "Throttled" | "Unauthorized" | "Unprocessable" | "VoiceConnectorGroupAssociationsExist" | "PhoneNumberAssociationsExist" | String */
        var ErrorMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserSettings {
        var Telephony: TelephonySettings
    }
    interface VoiceConnector {
        var VoiceConnectorId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var AwsRegion: String /* "us-east-1" | "us-west-2" | String */
        var Name: VoiceConnectorName?
            get() = definedExternally
            set(value) = definedExternally
        var OutboundHostName: String?
            get() = definedExternally
            set(value) = definedExternally
        var RequireEncryption: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VoiceConnectorGroup {
        var VoiceConnectorGroupId: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: VoiceConnectorGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var VoiceConnectorItems: VoiceConnectorItemList?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedTimestamp: Iso8601Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VoiceConnectorItem {
        var VoiceConnectorId: NonEmptyString
        var Priority: VoiceConnectorItemPriority
    }
    interface VoiceConnectorSettings {
        var CdrBucket: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-05-01" | "latest" | String */
    }
}