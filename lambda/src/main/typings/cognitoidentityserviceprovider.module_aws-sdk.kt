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
import CognitoIdentityServiceProvider.AttributeType
import CognitoIdentityServiceProvider.AuthEventType
import CognitoIdentityServiceProvider.ChallengeResponseType
import CognitoIdentityServiceProvider.CodeDeliveryDetailsType
import CognitoIdentityServiceProvider.SchemaAttributeType
import CognitoIdentityServiceProvider.DeviceType
import CognitoIdentityServiceProvider.GroupType
import CognitoIdentityServiceProvider.HttpHeader
import CognitoIdentityServiceProvider.MFAOptionType
import CognitoIdentityServiceProvider.ProviderDescription
import CognitoIdentityServiceProvider.RecoveryOptionType
import CognitoIdentityServiceProvider.ResourceServerScopeType
import CognitoIdentityServiceProvider.ResourceServerType
import CognitoIdentityServiceProvider.UserImportJobType
import CognitoIdentityServiceProvider.UserPoolClientDescription
import CognitoIdentityServiceProvider.UserPoolDescriptionType
import CognitoIdentityServiceProvider.UserType
import CognitoIdentityServiceProvider.AddCustomAttributesRequest
import CognitoIdentityServiceProvider.AddCustomAttributesResponse
import CognitoIdentityServiceProvider.AdminAddUserToGroupRequest
import CognitoIdentityServiceProvider.AdminConfirmSignUpRequest
import CognitoIdentityServiceProvider.AdminConfirmSignUpResponse
import CognitoIdentityServiceProvider.AdminCreateUserRequest
import CognitoIdentityServiceProvider.AdminCreateUserResponse
import CognitoIdentityServiceProvider.AdminDeleteUserRequest
import CognitoIdentityServiceProvider.AdminDeleteUserAttributesRequest
import CognitoIdentityServiceProvider.AdminDeleteUserAttributesResponse
import CognitoIdentityServiceProvider.AdminDisableProviderForUserRequest
import CognitoIdentityServiceProvider.AdminDisableProviderForUserResponse
import CognitoIdentityServiceProvider.AdminDisableUserRequest
import CognitoIdentityServiceProvider.AdminDisableUserResponse
import CognitoIdentityServiceProvider.AdminEnableUserRequest
import CognitoIdentityServiceProvider.AdminEnableUserResponse
import CognitoIdentityServiceProvider.AdminForgetDeviceRequest
import CognitoIdentityServiceProvider.AdminGetDeviceRequest
import CognitoIdentityServiceProvider.AdminGetDeviceResponse
import CognitoIdentityServiceProvider.AdminGetUserRequest
import CognitoIdentityServiceProvider.AdminGetUserResponse
import CognitoIdentityServiceProvider.AdminInitiateAuthRequest
import CognitoIdentityServiceProvider.AdminInitiateAuthResponse
import CognitoIdentityServiceProvider.AdminLinkProviderForUserRequest
import CognitoIdentityServiceProvider.AdminLinkProviderForUserResponse
import CognitoIdentityServiceProvider.AdminListDevicesRequest
import CognitoIdentityServiceProvider.AdminListDevicesResponse
import CognitoIdentityServiceProvider.AdminListGroupsForUserRequest
import CognitoIdentityServiceProvider.AdminListGroupsForUserResponse
import CognitoIdentityServiceProvider.AdminListUserAuthEventsRequest
import CognitoIdentityServiceProvider.AdminListUserAuthEventsResponse
import CognitoIdentityServiceProvider.AdminRemoveUserFromGroupRequest
import CognitoIdentityServiceProvider.AdminResetUserPasswordRequest
import CognitoIdentityServiceProvider.AdminResetUserPasswordResponse
import CognitoIdentityServiceProvider.AdminRespondToAuthChallengeRequest
import CognitoIdentityServiceProvider.AdminRespondToAuthChallengeResponse
import CognitoIdentityServiceProvider.AdminSetUserMFAPreferenceRequest
import CognitoIdentityServiceProvider.AdminSetUserMFAPreferenceResponse
import CognitoIdentityServiceProvider.AdminSetUserPasswordRequest
import CognitoIdentityServiceProvider.AdminSetUserPasswordResponse
import CognitoIdentityServiceProvider.AdminSetUserSettingsRequest
import CognitoIdentityServiceProvider.AdminSetUserSettingsResponse
import CognitoIdentityServiceProvider.AdminUpdateAuthEventFeedbackRequest
import CognitoIdentityServiceProvider.AdminUpdateAuthEventFeedbackResponse
import CognitoIdentityServiceProvider.AdminUpdateDeviceStatusRequest
import CognitoIdentityServiceProvider.AdminUpdateDeviceStatusResponse
import CognitoIdentityServiceProvider.AdminUpdateUserAttributesRequest
import CognitoIdentityServiceProvider.AdminUpdateUserAttributesResponse
import CognitoIdentityServiceProvider.AdminUserGlobalSignOutRequest
import CognitoIdentityServiceProvider.AdminUserGlobalSignOutResponse
import CognitoIdentityServiceProvider.AssociateSoftwareTokenRequest
import CognitoIdentityServiceProvider.AssociateSoftwareTokenResponse
import CognitoIdentityServiceProvider.ChangePasswordRequest
import CognitoIdentityServiceProvider.ChangePasswordResponse
import CognitoIdentityServiceProvider.ConfirmDeviceRequest
import CognitoIdentityServiceProvider.ConfirmDeviceResponse
import CognitoIdentityServiceProvider.ConfirmForgotPasswordRequest
import CognitoIdentityServiceProvider.ConfirmForgotPasswordResponse
import CognitoIdentityServiceProvider.ConfirmSignUpRequest
import CognitoIdentityServiceProvider.ConfirmSignUpResponse
import CognitoIdentityServiceProvider.CreateGroupRequest
import CognitoIdentityServiceProvider.CreateGroupResponse
import CognitoIdentityServiceProvider.CreateIdentityProviderRequest
import CognitoIdentityServiceProvider.CreateIdentityProviderResponse
import CognitoIdentityServiceProvider.CreateResourceServerRequest
import CognitoIdentityServiceProvider.CreateResourceServerResponse
import CognitoIdentityServiceProvider.CreateUserImportJobRequest
import CognitoIdentityServiceProvider.CreateUserImportJobResponse
import CognitoIdentityServiceProvider.CreateUserPoolRequest
import CognitoIdentityServiceProvider.CreateUserPoolResponse
import CognitoIdentityServiceProvider.CreateUserPoolClientRequest
import CognitoIdentityServiceProvider.CreateUserPoolClientResponse
import CognitoIdentityServiceProvider.CreateUserPoolDomainRequest
import CognitoIdentityServiceProvider.CreateUserPoolDomainResponse
import CognitoIdentityServiceProvider.DeleteGroupRequest
import CognitoIdentityServiceProvider.DeleteIdentityProviderRequest
import CognitoIdentityServiceProvider.DeleteResourceServerRequest
import CognitoIdentityServiceProvider.DeleteUserRequest
import CognitoIdentityServiceProvider.DeleteUserAttributesRequest
import CognitoIdentityServiceProvider.DeleteUserAttributesResponse
import CognitoIdentityServiceProvider.DeleteUserPoolRequest
import CognitoIdentityServiceProvider.DeleteUserPoolClientRequest
import CognitoIdentityServiceProvider.DeleteUserPoolDomainRequest
import CognitoIdentityServiceProvider.DeleteUserPoolDomainResponse
import CognitoIdentityServiceProvider.DescribeIdentityProviderRequest
import CognitoIdentityServiceProvider.DescribeIdentityProviderResponse
import CognitoIdentityServiceProvider.DescribeResourceServerRequest
import CognitoIdentityServiceProvider.DescribeResourceServerResponse
import CognitoIdentityServiceProvider.DescribeRiskConfigurationRequest
import CognitoIdentityServiceProvider.DescribeRiskConfigurationResponse
import CognitoIdentityServiceProvider.DescribeUserImportJobRequest
import CognitoIdentityServiceProvider.DescribeUserImportJobResponse
import CognitoIdentityServiceProvider.DescribeUserPoolRequest
import CognitoIdentityServiceProvider.DescribeUserPoolResponse
import CognitoIdentityServiceProvider.DescribeUserPoolClientRequest
import CognitoIdentityServiceProvider.DescribeUserPoolClientResponse
import CognitoIdentityServiceProvider.DescribeUserPoolDomainRequest
import CognitoIdentityServiceProvider.DescribeUserPoolDomainResponse
import CognitoIdentityServiceProvider.ForgetDeviceRequest
import CognitoIdentityServiceProvider.ForgotPasswordRequest
import CognitoIdentityServiceProvider.ForgotPasswordResponse
import CognitoIdentityServiceProvider.GetCSVHeaderRequest
import CognitoIdentityServiceProvider.GetCSVHeaderResponse
import CognitoIdentityServiceProvider.GetDeviceRequest
import CognitoIdentityServiceProvider.GetDeviceResponse
import CognitoIdentityServiceProvider.GetGroupRequest
import CognitoIdentityServiceProvider.GetGroupResponse
import CognitoIdentityServiceProvider.GetIdentityProviderByIdentifierRequest
import CognitoIdentityServiceProvider.GetIdentityProviderByIdentifierResponse
import CognitoIdentityServiceProvider.GetSigningCertificateRequest
import CognitoIdentityServiceProvider.GetSigningCertificateResponse
import CognitoIdentityServiceProvider.GetUICustomizationRequest
import CognitoIdentityServiceProvider.GetUICustomizationResponse
import CognitoIdentityServiceProvider.GetUserRequest
import CognitoIdentityServiceProvider.GetUserResponse
import CognitoIdentityServiceProvider.GetUserAttributeVerificationCodeRequest
import CognitoIdentityServiceProvider.GetUserAttributeVerificationCodeResponse
import CognitoIdentityServiceProvider.GetUserPoolMfaConfigRequest
import CognitoIdentityServiceProvider.GetUserPoolMfaConfigResponse
import CognitoIdentityServiceProvider.GlobalSignOutRequest
import CognitoIdentityServiceProvider.GlobalSignOutResponse
import CognitoIdentityServiceProvider.InitiateAuthRequest
import CognitoIdentityServiceProvider.InitiateAuthResponse
import CognitoIdentityServiceProvider.ListDevicesRequest
import CognitoIdentityServiceProvider.ListDevicesResponse
import CognitoIdentityServiceProvider.ListGroupsRequest
import CognitoIdentityServiceProvider.ListGroupsResponse
import CognitoIdentityServiceProvider.ListIdentityProvidersRequest
import CognitoIdentityServiceProvider.ListIdentityProvidersResponse
import CognitoIdentityServiceProvider.ListResourceServersRequest
import CognitoIdentityServiceProvider.ListResourceServersResponse
import CognitoIdentityServiceProvider.ListTagsForResourceRequest
import CognitoIdentityServiceProvider.ListTagsForResourceResponse
import CognitoIdentityServiceProvider.ListUserImportJobsRequest
import CognitoIdentityServiceProvider.ListUserImportJobsResponse
import CognitoIdentityServiceProvider.ListUserPoolClientsRequest
import CognitoIdentityServiceProvider.ListUserPoolClientsResponse
import CognitoIdentityServiceProvider.ListUserPoolsRequest
import CognitoIdentityServiceProvider.ListUserPoolsResponse
import CognitoIdentityServiceProvider.ListUsersRequest
import CognitoIdentityServiceProvider.ListUsersResponse
import CognitoIdentityServiceProvider.ListUsersInGroupRequest
import CognitoIdentityServiceProvider.ListUsersInGroupResponse
import CognitoIdentityServiceProvider.ResendConfirmationCodeRequest
import CognitoIdentityServiceProvider.ResendConfirmationCodeResponse
import CognitoIdentityServiceProvider.RespondToAuthChallengeRequest
import CognitoIdentityServiceProvider.RespondToAuthChallengeResponse
import CognitoIdentityServiceProvider.SetRiskConfigurationRequest
import CognitoIdentityServiceProvider.SetRiskConfigurationResponse
import CognitoIdentityServiceProvider.SetUICustomizationRequest
import CognitoIdentityServiceProvider.SetUICustomizationResponse
import CognitoIdentityServiceProvider.SetUserMFAPreferenceRequest
import CognitoIdentityServiceProvider.SetUserMFAPreferenceResponse
import CognitoIdentityServiceProvider.SetUserPoolMfaConfigRequest
import CognitoIdentityServiceProvider.SetUserPoolMfaConfigResponse
import CognitoIdentityServiceProvider.SetUserSettingsRequest
import CognitoIdentityServiceProvider.SetUserSettingsResponse
import CognitoIdentityServiceProvider.SignUpRequest
import CognitoIdentityServiceProvider.SignUpResponse
import CognitoIdentityServiceProvider.StartUserImportJobRequest
import CognitoIdentityServiceProvider.StartUserImportJobResponse
import CognitoIdentityServiceProvider.StopUserImportJobRequest
import CognitoIdentityServiceProvider.StopUserImportJobResponse
import CognitoIdentityServiceProvider.TagResourceRequest
import CognitoIdentityServiceProvider.TagResourceResponse
import CognitoIdentityServiceProvider.UntagResourceRequest
import CognitoIdentityServiceProvider.UntagResourceResponse
import CognitoIdentityServiceProvider.UpdateAuthEventFeedbackRequest
import CognitoIdentityServiceProvider.UpdateAuthEventFeedbackResponse
import CognitoIdentityServiceProvider.UpdateDeviceStatusRequest
import CognitoIdentityServiceProvider.UpdateDeviceStatusResponse
import CognitoIdentityServiceProvider.UpdateGroupRequest
import CognitoIdentityServiceProvider.UpdateGroupResponse
import CognitoIdentityServiceProvider.UpdateIdentityProviderRequest
import CognitoIdentityServiceProvider.UpdateIdentityProviderResponse
import CognitoIdentityServiceProvider.UpdateResourceServerRequest
import CognitoIdentityServiceProvider.UpdateResourceServerResponse
import CognitoIdentityServiceProvider.UpdateUserAttributesRequest
import CognitoIdentityServiceProvider.UpdateUserAttributesResponse
import CognitoIdentityServiceProvider.UpdateUserPoolRequest
import CognitoIdentityServiceProvider.UpdateUserPoolResponse
import CognitoIdentityServiceProvider.UpdateUserPoolClientRequest
import CognitoIdentityServiceProvider.UpdateUserPoolClientResponse
import CognitoIdentityServiceProvider.UpdateUserPoolDomainRequest
import CognitoIdentityServiceProvider.UpdateUserPoolDomainResponse
import CognitoIdentityServiceProvider.VerifySoftwareTokenRequest
import CognitoIdentityServiceProvider.VerifySoftwareTokenResponse
import CognitoIdentityServiceProvider.VerifyUserAttributeRequest
import CognitoIdentityServiceProvider.VerifyUserAttributeResponse
import CognitoIdentityServiceProvider.AccountTakeoverActionType
import CognitoIdentityServiceProvider.NotifyConfigurationType
import CognitoIdentityServiceProvider.AccountTakeoverActionsType
import CognitoIdentityServiceProvider.ClientMetadataType
import CognitoIdentityServiceProvider.MessageTemplateType
import CognitoIdentityServiceProvider.ProviderUserIdentifierType
import CognitoIdentityServiceProvider.AuthParametersType
import CognitoIdentityServiceProvider.AnalyticsMetadataType
import CognitoIdentityServiceProvider.ContextDataType
import CognitoIdentityServiceProvider.ChallengeParametersType
import CognitoIdentityServiceProvider.AuthenticationResultType
import CognitoIdentityServiceProvider.ChallengeResponsesType
import CognitoIdentityServiceProvider.SMSMfaSettingsType
import CognitoIdentityServiceProvider.SoftwareTokenMfaSettingsType
import CognitoIdentityServiceProvider.EventRiskType
import CognitoIdentityServiceProvider.EventContextDataType
import CognitoIdentityServiceProvider.EventFeedbackType
import CognitoIdentityServiceProvider.NewDeviceMetadataType
import CognitoIdentityServiceProvider.CompromisedCredentialsActionsType
import CognitoIdentityServiceProvider.DeviceSecretVerifierConfigType
import CognitoIdentityServiceProvider.UserContextDataType
import CognitoIdentityServiceProvider.ProviderDetailsType
import CognitoIdentityServiceProvider.AttributeMappingType
import CognitoIdentityServiceProvider.IdentityProviderType
import CognitoIdentityServiceProvider.AnalyticsConfigurationType
import CognitoIdentityServiceProvider.UserPoolClientType
import CognitoIdentityServiceProvider.CustomDomainConfigType
import CognitoIdentityServiceProvider.UserPoolPolicyType
import CognitoIdentityServiceProvider.LambdaConfigType
import CognitoIdentityServiceProvider.VerificationMessageTemplateType
import CognitoIdentityServiceProvider.DeviceConfigurationType
import CognitoIdentityServiceProvider.EmailConfigurationType
import CognitoIdentityServiceProvider.SmsConfigurationType
import CognitoIdentityServiceProvider.UserPoolTagsType
import CognitoIdentityServiceProvider.AdminCreateUserConfigType
import CognitoIdentityServiceProvider.UserPoolAddOnsType
import CognitoIdentityServiceProvider.UsernameConfigurationType
import CognitoIdentityServiceProvider.AccountRecoverySettingType
import CognitoIdentityServiceProvider.UserPoolType
import CognitoIdentityServiceProvider.RiskConfigurationType
import CognitoIdentityServiceProvider.DomainDescriptionType
import CognitoIdentityServiceProvider.UICustomizationType
import CognitoIdentityServiceProvider.SmsMfaConfigType
import CognitoIdentityServiceProvider.SoftwareTokenMfaConfigType
import CognitoIdentityServiceProvider.NotifyEmailType
import CognitoIdentityServiceProvider.CompromisedCredentialsRiskConfigurationType
import CognitoIdentityServiceProvider.AccountTakeoverRiskConfigurationType
import CognitoIdentityServiceProvider.RiskExceptionConfigurationType
import CognitoIdentityServiceProvider.NumberAttributeConstraintsType
import CognitoIdentityServiceProvider.StringAttributeConstraintsType
import CognitoIdentityServiceProvider.PasswordPolicyType

typealias AWSAccountIdType = String

typealias AccountTakeoverActionNotifyType = Boolean

typealias AdminCreateUserUnusedAccountValidityDaysType = Number

typealias AliasAttributesListType = Array<String /* "phone_number" | "email" | "preferred_username" | String */>

typealias ArnType = String

typealias AttributeListType = Array<AttributeType>

typealias AttributeMappingKeyType = String

typealias AttributeNameListType = Array<AttributeNameType>

typealias AttributeNameType = String

typealias AttributeValueType = String

typealias AuthEventsType = Array<AuthEventType>

typealias AuthParametersValueType = String

typealias BlockedIPRangeListType = Array<StringType>

typealias BooleanType = Boolean

typealias CSSType = String

typealias CSSVersionType = String

typealias CallbackURLsListType = Array<RedirectUrlType>

typealias ChallengeResponseListType = Array<ChallengeResponseType>

typealias ClientIdType = String

typealias ClientNameType = String

typealias ClientPermissionListType = Array<ClientPermissionType>

typealias ClientPermissionType = String

typealias ClientSecretType = String

typealias CodeDeliveryDetailsListType = Array<CodeDeliveryDetailsType>

typealias CompletionMessageType = String

typealias ConfirmationCodeType = String

typealias CustomAttributeNameType = String

typealias CustomAttributesListType = Array<SchemaAttributeType>

typealias DateType = Date

typealias DeliveryMediumListType = Array<String /* "SMS" | "EMAIL" | String */>

typealias DescriptionType = String

typealias DeviceKeyType = String

typealias DeviceListType = Array<DeviceType>

typealias DeviceNameType = String

typealias DomainType = String

typealias DomainVersionType = String

typealias EmailAddressType = String

typealias EmailNotificationBodyType = String

typealias EmailNotificationSubjectType = String

typealias EmailVerificationMessageByLinkType = String

typealias EmailVerificationMessageType = String

typealias EmailVerificationSubjectByLinkType = String

typealias EmailVerificationSubjectType = String

typealias EventFiltersType = Array<String /* "SIGN_IN" | "PASSWORD_CHANGE" | "SIGN_UP" | String */>

typealias EventIdType = String

typealias ExplicitAuthFlowsListType = Array<String /* "ADMIN_NO_SRP_AUTH" | "CUSTOM_AUTH_FLOW_ONLY" | "USER_PASSWORD_AUTH" | "ALLOW_ADMIN_USER_PASSWORD_AUTH" | "ALLOW_CUSTOM_AUTH" | "ALLOW_USER_PASSWORD_AUTH" | "ALLOW_USER_SRP_AUTH" | "ALLOW_REFRESH_TOKEN_AUTH" | String */>

typealias ForceAliasCreation = Boolean

typealias GenerateSecret = Boolean

typealias GroupListType = Array<GroupType>

typealias GroupNameType = String

typealias HexStringType = String

typealias HttpHeaderList = Array<HttpHeader>

typealias IdpIdentifierType = String

typealias IdpIdentifiersListType = Array<IdpIdentifierType>

typealias ImageUrlType = String

typealias IntegerType = Number

typealias ListOfStringTypes = Array<StringType>

typealias ListProvidersLimitType = Number

typealias ListResourceServersLimitType = Number

typealias LogoutURLsListType = Array<RedirectUrlType>

typealias LongType = Number

typealias MFAOptionListType = Array<MFAOptionType>

typealias OAuthFlowsType = Array<String /* "code" | "implicit" | "client_credentials" | String */>

typealias PaginationKey = String

typealias PaginationKeyType = String

typealias PasswordPolicyMinLengthType = Number

typealias PasswordType = String

typealias PoolQueryLimitType = Number

typealias PreSignedUrlType = String

typealias PrecedenceType = Number

typealias PriorityType = Number

typealias ProviderNameType = String

typealias ProviderNameTypeV1 = String

typealias ProvidersListType = Array<ProviderDescription>

typealias QueryLimit = Number

typealias QueryLimitType = Number

typealias RecoveryMechanismsType = Array<RecoveryOptionType>

typealias RedirectUrlType = String

typealias RefreshTokenValidityType = Number

typealias ResourceServerIdentifierType = String

typealias ResourceServerNameType = String

typealias ResourceServerScopeDescriptionType = String

typealias ResourceServerScopeListType = Array<ResourceServerScopeType>

typealias ResourceServerScopeNameType = String

typealias ResourceServersListType = Array<ResourceServerType>

typealias S3BucketType = String

typealias SESConfigurationSet = String

typealias SchemaAttributesListType = Array<SchemaAttributeType>

typealias ScopeListType = Array<ScopeType>

typealias ScopeType = String

typealias SearchPaginationTokenType = String

typealias SearchedAttributeNamesListType = Array<AttributeNameType>

typealias SecretCodeType = String

typealias SecretHashType = String

typealias SessionType = String

typealias SkippedIPRangeListType = Array<StringType>

typealias SmsVerificationMessageType = String

typealias SoftwareTokenMFAUserCodeType = String

typealias StringType = String

typealias SupportedIdentityProvidersListType = Array<ProviderNameType>

typealias TagKeysType = String

typealias TagValueType = String

typealias TemporaryPasswordValidityDaysType = Number

typealias TokenModelType = String

typealias UserFilterType = String

typealias UserImportJobIdType = String

typealias UserImportJobNameType = String

typealias UserImportJobsListType = Array<UserImportJobType>

typealias UserMFASettingListType = Array<StringType>

typealias UserPoolClientListType = Array<UserPoolClientDescription>

typealias UserPoolIdType = String

typealias UserPoolListType = Array<UserPoolDescriptionType>

typealias UserPoolNameType = String

typealias UserPoolTagsListType = Array<TagKeysType>

typealias UsernameAttributesListType = Array<String /* "phone_number" | "email" | String */>

typealias UsernameType = String

typealias UsersListType = Array<UserType>

typealias VerifiedAttributesListType = Array<String /* "phone_number" | "email" | String */>

typealias WrappedBooleanType = Boolean

@JsModule("aws-sdk")
external open class CognitoIdentityServiceProvider(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CognitoIdentityServiceProvider.Types.ClientConfiguration */
    open fun addCustomAttributes(params: AddCustomAttributesRequest, callback: (err: AWSError, data: AddCustomAttributesResponse) -> Unit = definedExternally): Request<AddCustomAttributesResponse, AWSError>
    open fun addCustomAttributes(callback: (err: AWSError, data: AddCustomAttributesResponse) -> Unit = definedExternally): Request<AddCustomAttributesResponse, AWSError>
    open fun adminAddUserToGroup(params: AdminAddUserToGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun adminAddUserToGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun adminConfirmSignUp(params: AdminConfirmSignUpRequest, callback: (err: AWSError, data: AdminConfirmSignUpResponse) -> Unit = definedExternally): Request<AdminConfirmSignUpResponse, AWSError>
    open fun adminConfirmSignUp(callback: (err: AWSError, data: AdminConfirmSignUpResponse) -> Unit = definedExternally): Request<AdminConfirmSignUpResponse, AWSError>
    open fun adminCreateUser(params: AdminCreateUserRequest, callback: (err: AWSError, data: AdminCreateUserResponse) -> Unit = definedExternally): Request<AdminCreateUserResponse, AWSError>
    open fun adminCreateUser(callback: (err: AWSError, data: AdminCreateUserResponse) -> Unit = definedExternally): Request<AdminCreateUserResponse, AWSError>
    open fun adminDeleteUser(params: AdminDeleteUserRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun adminDeleteUser(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun adminDeleteUserAttributes(params: AdminDeleteUserAttributesRequest, callback: (err: AWSError, data: AdminDeleteUserAttributesResponse) -> Unit = definedExternally): Request<AdminDeleteUserAttributesResponse, AWSError>
    open fun adminDeleteUserAttributes(callback: (err: AWSError, data: AdminDeleteUserAttributesResponse) -> Unit = definedExternally): Request<AdminDeleteUserAttributesResponse, AWSError>
    open fun adminDisableProviderForUser(params: AdminDisableProviderForUserRequest, callback: (err: AWSError, data: AdminDisableProviderForUserResponse) -> Unit = definedExternally): Request<AdminDisableProviderForUserResponse, AWSError>
    open fun adminDisableProviderForUser(callback: (err: AWSError, data: AdminDisableProviderForUserResponse) -> Unit = definedExternally): Request<AdminDisableProviderForUserResponse, AWSError>
    open fun adminDisableUser(params: AdminDisableUserRequest, callback: (err: AWSError, data: AdminDisableUserResponse) -> Unit = definedExternally): Request<AdminDisableUserResponse, AWSError>
    open fun adminDisableUser(callback: (err: AWSError, data: AdminDisableUserResponse) -> Unit = definedExternally): Request<AdminDisableUserResponse, AWSError>
    open fun adminEnableUser(params: AdminEnableUserRequest, callback: (err: AWSError, data: AdminEnableUserResponse) -> Unit = definedExternally): Request<AdminEnableUserResponse, AWSError>
    open fun adminEnableUser(callback: (err: AWSError, data: AdminEnableUserResponse) -> Unit = definedExternally): Request<AdminEnableUserResponse, AWSError>
    open fun adminForgetDevice(params: AdminForgetDeviceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun adminForgetDevice(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun adminGetDevice(params: AdminGetDeviceRequest, callback: (err: AWSError, data: AdminGetDeviceResponse) -> Unit = definedExternally): Request<AdminGetDeviceResponse, AWSError>
    open fun adminGetDevice(callback: (err: AWSError, data: AdminGetDeviceResponse) -> Unit = definedExternally): Request<AdminGetDeviceResponse, AWSError>
    open fun adminGetUser(params: AdminGetUserRequest, callback: (err: AWSError, data: AdminGetUserResponse) -> Unit = definedExternally): Request<AdminGetUserResponse, AWSError>
    open fun adminGetUser(callback: (err: AWSError, data: AdminGetUserResponse) -> Unit = definedExternally): Request<AdminGetUserResponse, AWSError>
    open fun adminInitiateAuth(params: AdminInitiateAuthRequest, callback: (err: AWSError, data: AdminInitiateAuthResponse) -> Unit = definedExternally): Request<AdminInitiateAuthResponse, AWSError>
    open fun adminInitiateAuth(callback: (err: AWSError, data: AdminInitiateAuthResponse) -> Unit = definedExternally): Request<AdminInitiateAuthResponse, AWSError>
    open fun adminLinkProviderForUser(params: AdminLinkProviderForUserRequest, callback: (err: AWSError, data: AdminLinkProviderForUserResponse) -> Unit = definedExternally): Request<AdminLinkProviderForUserResponse, AWSError>
    open fun adminLinkProviderForUser(callback: (err: AWSError, data: AdminLinkProviderForUserResponse) -> Unit = definedExternally): Request<AdminLinkProviderForUserResponse, AWSError>
    open fun adminListDevices(params: AdminListDevicesRequest, callback: (err: AWSError, data: AdminListDevicesResponse) -> Unit = definedExternally): Request<AdminListDevicesResponse, AWSError>
    open fun adminListDevices(callback: (err: AWSError, data: AdminListDevicesResponse) -> Unit = definedExternally): Request<AdminListDevicesResponse, AWSError>
    open fun adminListGroupsForUser(params: AdminListGroupsForUserRequest, callback: (err: AWSError, data: AdminListGroupsForUserResponse) -> Unit = definedExternally): Request<AdminListGroupsForUserResponse, AWSError>
    open fun adminListGroupsForUser(callback: (err: AWSError, data: AdminListGroupsForUserResponse) -> Unit = definedExternally): Request<AdminListGroupsForUserResponse, AWSError>
    open fun adminListUserAuthEvents(params: AdminListUserAuthEventsRequest, callback: (err: AWSError, data: AdminListUserAuthEventsResponse) -> Unit = definedExternally): Request<AdminListUserAuthEventsResponse, AWSError>
    open fun adminListUserAuthEvents(callback: (err: AWSError, data: AdminListUserAuthEventsResponse) -> Unit = definedExternally): Request<AdminListUserAuthEventsResponse, AWSError>
    open fun adminRemoveUserFromGroup(params: AdminRemoveUserFromGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun adminRemoveUserFromGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun adminResetUserPassword(params: AdminResetUserPasswordRequest, callback: (err: AWSError, data: AdminResetUserPasswordResponse) -> Unit = definedExternally): Request<AdminResetUserPasswordResponse, AWSError>
    open fun adminResetUserPassword(callback: (err: AWSError, data: AdminResetUserPasswordResponse) -> Unit = definedExternally): Request<AdminResetUserPasswordResponse, AWSError>
    open fun adminRespondToAuthChallenge(params: AdminRespondToAuthChallengeRequest, callback: (err: AWSError, data: AdminRespondToAuthChallengeResponse) -> Unit = definedExternally): Request<AdminRespondToAuthChallengeResponse, AWSError>
    open fun adminRespondToAuthChallenge(callback: (err: AWSError, data: AdminRespondToAuthChallengeResponse) -> Unit = definedExternally): Request<AdminRespondToAuthChallengeResponse, AWSError>
    open fun adminSetUserMFAPreference(params: AdminSetUserMFAPreferenceRequest, callback: (err: AWSError, data: AdminSetUserMFAPreferenceResponse) -> Unit = definedExternally): Request<AdminSetUserMFAPreferenceResponse, AWSError>
    open fun adminSetUserMFAPreference(callback: (err: AWSError, data: AdminSetUserMFAPreferenceResponse) -> Unit = definedExternally): Request<AdminSetUserMFAPreferenceResponse, AWSError>
    open fun adminSetUserPassword(params: AdminSetUserPasswordRequest, callback: (err: AWSError, data: AdminSetUserPasswordResponse) -> Unit = definedExternally): Request<AdminSetUserPasswordResponse, AWSError>
    open fun adminSetUserPassword(callback: (err: AWSError, data: AdminSetUserPasswordResponse) -> Unit = definedExternally): Request<AdminSetUserPasswordResponse, AWSError>
    open fun adminSetUserSettings(params: AdminSetUserSettingsRequest, callback: (err: AWSError, data: AdminSetUserSettingsResponse) -> Unit = definedExternally): Request<AdminSetUserSettingsResponse, AWSError>
    open fun adminSetUserSettings(callback: (err: AWSError, data: AdminSetUserSettingsResponse) -> Unit = definedExternally): Request<AdminSetUserSettingsResponse, AWSError>
    open fun adminUpdateAuthEventFeedback(params: AdminUpdateAuthEventFeedbackRequest, callback: (err: AWSError, data: AdminUpdateAuthEventFeedbackResponse) -> Unit = definedExternally): Request<AdminUpdateAuthEventFeedbackResponse, AWSError>
    open fun adminUpdateAuthEventFeedback(callback: (err: AWSError, data: AdminUpdateAuthEventFeedbackResponse) -> Unit = definedExternally): Request<AdminUpdateAuthEventFeedbackResponse, AWSError>
    open fun adminUpdateDeviceStatus(params: AdminUpdateDeviceStatusRequest, callback: (err: AWSError, data: AdminUpdateDeviceStatusResponse) -> Unit = definedExternally): Request<AdminUpdateDeviceStatusResponse, AWSError>
    open fun adminUpdateDeviceStatus(callback: (err: AWSError, data: AdminUpdateDeviceStatusResponse) -> Unit = definedExternally): Request<AdminUpdateDeviceStatusResponse, AWSError>
    open fun adminUpdateUserAttributes(params: AdminUpdateUserAttributesRequest, callback: (err: AWSError, data: AdminUpdateUserAttributesResponse) -> Unit = definedExternally): Request<AdminUpdateUserAttributesResponse, AWSError>
    open fun adminUpdateUserAttributes(callback: (err: AWSError, data: AdminUpdateUserAttributesResponse) -> Unit = definedExternally): Request<AdminUpdateUserAttributesResponse, AWSError>
    open fun adminUserGlobalSignOut(params: AdminUserGlobalSignOutRequest, callback: (err: AWSError, data: AdminUserGlobalSignOutResponse) -> Unit = definedExternally): Request<AdminUserGlobalSignOutResponse, AWSError>
    open fun adminUserGlobalSignOut(callback: (err: AWSError, data: AdminUserGlobalSignOutResponse) -> Unit = definedExternally): Request<AdminUserGlobalSignOutResponse, AWSError>
    open fun associateSoftwareToken(params: AssociateSoftwareTokenRequest, callback: (err: AWSError, data: AssociateSoftwareTokenResponse) -> Unit = definedExternally): Request<AssociateSoftwareTokenResponse, AWSError>
    open fun associateSoftwareToken(callback: (err: AWSError, data: AssociateSoftwareTokenResponse) -> Unit = definedExternally): Request<AssociateSoftwareTokenResponse, AWSError>
    open fun changePassword(params: ChangePasswordRequest, callback: (err: AWSError, data: ChangePasswordResponse) -> Unit = definedExternally): Request<ChangePasswordResponse, AWSError>
    open fun changePassword(callback: (err: AWSError, data: ChangePasswordResponse) -> Unit = definedExternally): Request<ChangePasswordResponse, AWSError>
    open fun confirmDevice(params: ConfirmDeviceRequest, callback: (err: AWSError, data: ConfirmDeviceResponse) -> Unit = definedExternally): Request<ConfirmDeviceResponse, AWSError>
    open fun confirmDevice(callback: (err: AWSError, data: ConfirmDeviceResponse) -> Unit = definedExternally): Request<ConfirmDeviceResponse, AWSError>
    open fun confirmForgotPassword(params: ConfirmForgotPasswordRequest, callback: (err: AWSError, data: ConfirmForgotPasswordResponse) -> Unit = definedExternally): Request<ConfirmForgotPasswordResponse, AWSError>
    open fun confirmForgotPassword(callback: (err: AWSError, data: ConfirmForgotPasswordResponse) -> Unit = definedExternally): Request<ConfirmForgotPasswordResponse, AWSError>
    open fun confirmSignUp(params: ConfirmSignUpRequest, callback: (err: AWSError, data: ConfirmSignUpResponse) -> Unit = definedExternally): Request<ConfirmSignUpResponse, AWSError>
    open fun confirmSignUp(callback: (err: AWSError, data: ConfirmSignUpResponse) -> Unit = definedExternally): Request<ConfirmSignUpResponse, AWSError>
    open fun createGroup(params: CreateGroupRequest, callback: (err: AWSError, data: CreateGroupResponse) -> Unit = definedExternally): Request<CreateGroupResponse, AWSError>
    open fun createGroup(callback: (err: AWSError, data: CreateGroupResponse) -> Unit = definedExternally): Request<CreateGroupResponse, AWSError>
    open fun createIdentityProvider(params: CreateIdentityProviderRequest, callback: (err: AWSError, data: CreateIdentityProviderResponse) -> Unit = definedExternally): Request<CreateIdentityProviderResponse, AWSError>
    open fun createIdentityProvider(callback: (err: AWSError, data: CreateIdentityProviderResponse) -> Unit = definedExternally): Request<CreateIdentityProviderResponse, AWSError>
    open fun createResourceServer(params: CreateResourceServerRequest, callback: (err: AWSError, data: CreateResourceServerResponse) -> Unit = definedExternally): Request<CreateResourceServerResponse, AWSError>
    open fun createResourceServer(callback: (err: AWSError, data: CreateResourceServerResponse) -> Unit = definedExternally): Request<CreateResourceServerResponse, AWSError>
    open fun createUserImportJob(params: CreateUserImportJobRequest, callback: (err: AWSError, data: CreateUserImportJobResponse) -> Unit = definedExternally): Request<CreateUserImportJobResponse, AWSError>
    open fun createUserImportJob(callback: (err: AWSError, data: CreateUserImportJobResponse) -> Unit = definedExternally): Request<CreateUserImportJobResponse, AWSError>
    open fun createUserPool(params: CreateUserPoolRequest, callback: (err: AWSError, data: CreateUserPoolResponse) -> Unit = definedExternally): Request<CreateUserPoolResponse, AWSError>
    open fun createUserPool(callback: (err: AWSError, data: CreateUserPoolResponse) -> Unit = definedExternally): Request<CreateUserPoolResponse, AWSError>
    open fun createUserPoolClient(params: CreateUserPoolClientRequest, callback: (err: AWSError, data: CreateUserPoolClientResponse) -> Unit = definedExternally): Request<CreateUserPoolClientResponse, AWSError>
    open fun createUserPoolClient(callback: (err: AWSError, data: CreateUserPoolClientResponse) -> Unit = definedExternally): Request<CreateUserPoolClientResponse, AWSError>
    open fun createUserPoolDomain(params: CreateUserPoolDomainRequest, callback: (err: AWSError, data: CreateUserPoolDomainResponse) -> Unit = definedExternally): Request<CreateUserPoolDomainResponse, AWSError>
    open fun createUserPoolDomain(callback: (err: AWSError, data: CreateUserPoolDomainResponse) -> Unit = definedExternally): Request<CreateUserPoolDomainResponse, AWSError>
    open fun deleteGroup(params: DeleteGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIdentityProvider(params: DeleteIdentityProviderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIdentityProvider(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteResourceServer(params: DeleteResourceServerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteResourceServer(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUser(params: DeleteUserRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUser(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserAttributes(params: DeleteUserAttributesRequest, callback: (err: AWSError, data: DeleteUserAttributesResponse) -> Unit = definedExternally): Request<DeleteUserAttributesResponse, AWSError>
    open fun deleteUserAttributes(callback: (err: AWSError, data: DeleteUserAttributesResponse) -> Unit = definedExternally): Request<DeleteUserAttributesResponse, AWSError>
    open fun deleteUserPool(params: DeleteUserPoolRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserPool(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserPoolClient(params: DeleteUserPoolClientRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserPoolClient(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserPoolDomain(params: DeleteUserPoolDomainRequest, callback: (err: AWSError, data: DeleteUserPoolDomainResponse) -> Unit = definedExternally): Request<DeleteUserPoolDomainResponse, AWSError>
    open fun deleteUserPoolDomain(callback: (err: AWSError, data: DeleteUserPoolDomainResponse) -> Unit = definedExternally): Request<DeleteUserPoolDomainResponse, AWSError>
    open fun describeIdentityProvider(params: DescribeIdentityProviderRequest, callback: (err: AWSError, data: DescribeIdentityProviderResponse) -> Unit = definedExternally): Request<DescribeIdentityProviderResponse, AWSError>
    open fun describeIdentityProvider(callback: (err: AWSError, data: DescribeIdentityProviderResponse) -> Unit = definedExternally): Request<DescribeIdentityProviderResponse, AWSError>
    open fun describeResourceServer(params: DescribeResourceServerRequest, callback: (err: AWSError, data: DescribeResourceServerResponse) -> Unit = definedExternally): Request<DescribeResourceServerResponse, AWSError>
    open fun describeResourceServer(callback: (err: AWSError, data: DescribeResourceServerResponse) -> Unit = definedExternally): Request<DescribeResourceServerResponse, AWSError>
    open fun describeRiskConfiguration(params: DescribeRiskConfigurationRequest, callback: (err: AWSError, data: DescribeRiskConfigurationResponse) -> Unit = definedExternally): Request<DescribeRiskConfigurationResponse, AWSError>
    open fun describeRiskConfiguration(callback: (err: AWSError, data: DescribeRiskConfigurationResponse) -> Unit = definedExternally): Request<DescribeRiskConfigurationResponse, AWSError>
    open fun describeUserImportJob(params: DescribeUserImportJobRequest, callback: (err: AWSError, data: DescribeUserImportJobResponse) -> Unit = definedExternally): Request<DescribeUserImportJobResponse, AWSError>
    open fun describeUserImportJob(callback: (err: AWSError, data: DescribeUserImportJobResponse) -> Unit = definedExternally): Request<DescribeUserImportJobResponse, AWSError>
    open fun describeUserPool(params: DescribeUserPoolRequest, callback: (err: AWSError, data: DescribeUserPoolResponse) -> Unit = definedExternally): Request<DescribeUserPoolResponse, AWSError>
    open fun describeUserPool(callback: (err: AWSError, data: DescribeUserPoolResponse) -> Unit = definedExternally): Request<DescribeUserPoolResponse, AWSError>
    open fun describeUserPoolClient(params: DescribeUserPoolClientRequest, callback: (err: AWSError, data: DescribeUserPoolClientResponse) -> Unit = definedExternally): Request<DescribeUserPoolClientResponse, AWSError>
    open fun describeUserPoolClient(callback: (err: AWSError, data: DescribeUserPoolClientResponse) -> Unit = definedExternally): Request<DescribeUserPoolClientResponse, AWSError>
    open fun describeUserPoolDomain(params: DescribeUserPoolDomainRequest, callback: (err: AWSError, data: DescribeUserPoolDomainResponse) -> Unit = definedExternally): Request<DescribeUserPoolDomainResponse, AWSError>
    open fun describeUserPoolDomain(callback: (err: AWSError, data: DescribeUserPoolDomainResponse) -> Unit = definedExternally): Request<DescribeUserPoolDomainResponse, AWSError>
    open fun forgetDevice(params: ForgetDeviceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun forgetDevice(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun forgotPassword(params: ForgotPasswordRequest, callback: (err: AWSError, data: ForgotPasswordResponse) -> Unit = definedExternally): Request<ForgotPasswordResponse, AWSError>
    open fun forgotPassword(callback: (err: AWSError, data: ForgotPasswordResponse) -> Unit = definedExternally): Request<ForgotPasswordResponse, AWSError>
    open fun getCSVHeader(params: GetCSVHeaderRequest, callback: (err: AWSError, data: GetCSVHeaderResponse) -> Unit = definedExternally): Request<GetCSVHeaderResponse, AWSError>
    open fun getCSVHeader(callback: (err: AWSError, data: GetCSVHeaderResponse) -> Unit = definedExternally): Request<GetCSVHeaderResponse, AWSError>
    open fun getDevice(params: GetDeviceRequest, callback: (err: AWSError, data: GetDeviceResponse) -> Unit = definedExternally): Request<GetDeviceResponse, AWSError>
    open fun getDevice(callback: (err: AWSError, data: GetDeviceResponse) -> Unit = definedExternally): Request<GetDeviceResponse, AWSError>
    open fun getGroup(params: GetGroupRequest, callback: (err: AWSError, data: GetGroupResponse) -> Unit = definedExternally): Request<GetGroupResponse, AWSError>
    open fun getGroup(callback: (err: AWSError, data: GetGroupResponse) -> Unit = definedExternally): Request<GetGroupResponse, AWSError>
    open fun getIdentityProviderByIdentifier(params: GetIdentityProviderByIdentifierRequest, callback: (err: AWSError, data: GetIdentityProviderByIdentifierResponse) -> Unit = definedExternally): Request<GetIdentityProviderByIdentifierResponse, AWSError>
    open fun getIdentityProviderByIdentifier(callback: (err: AWSError, data: GetIdentityProviderByIdentifierResponse) -> Unit = definedExternally): Request<GetIdentityProviderByIdentifierResponse, AWSError>
    open fun getSigningCertificate(params: GetSigningCertificateRequest, callback: (err: AWSError, data: GetSigningCertificateResponse) -> Unit = definedExternally): Request<GetSigningCertificateResponse, AWSError>
    open fun getSigningCertificate(callback: (err: AWSError, data: GetSigningCertificateResponse) -> Unit = definedExternally): Request<GetSigningCertificateResponse, AWSError>
    open fun getUICustomization(params: GetUICustomizationRequest, callback: (err: AWSError, data: GetUICustomizationResponse) -> Unit = definedExternally): Request<GetUICustomizationResponse, AWSError>
    open fun getUICustomization(callback: (err: AWSError, data: GetUICustomizationResponse) -> Unit = definedExternally): Request<GetUICustomizationResponse, AWSError>
    open fun getUser(params: GetUserRequest, callback: (err: AWSError, data: GetUserResponse) -> Unit = definedExternally): Request<GetUserResponse, AWSError>
    open fun getUser(callback: (err: AWSError, data: GetUserResponse) -> Unit = definedExternally): Request<GetUserResponse, AWSError>
    open fun getUserAttributeVerificationCode(params: GetUserAttributeVerificationCodeRequest, callback: (err: AWSError, data: GetUserAttributeVerificationCodeResponse) -> Unit = definedExternally): Request<GetUserAttributeVerificationCodeResponse, AWSError>
    open fun getUserAttributeVerificationCode(callback: (err: AWSError, data: GetUserAttributeVerificationCodeResponse) -> Unit = definedExternally): Request<GetUserAttributeVerificationCodeResponse, AWSError>
    open fun getUserPoolMfaConfig(params: GetUserPoolMfaConfigRequest, callback: (err: AWSError, data: GetUserPoolMfaConfigResponse) -> Unit = definedExternally): Request<GetUserPoolMfaConfigResponse, AWSError>
    open fun getUserPoolMfaConfig(callback: (err: AWSError, data: GetUserPoolMfaConfigResponse) -> Unit = definedExternally): Request<GetUserPoolMfaConfigResponse, AWSError>
    open fun globalSignOut(params: GlobalSignOutRequest, callback: (err: AWSError, data: GlobalSignOutResponse) -> Unit = definedExternally): Request<GlobalSignOutResponse, AWSError>
    open fun globalSignOut(callback: (err: AWSError, data: GlobalSignOutResponse) -> Unit = definedExternally): Request<GlobalSignOutResponse, AWSError>
    open fun initiateAuth(params: InitiateAuthRequest, callback: (err: AWSError, data: InitiateAuthResponse) -> Unit = definedExternally): Request<InitiateAuthResponse, AWSError>
    open fun initiateAuth(callback: (err: AWSError, data: InitiateAuthResponse) -> Unit = definedExternally): Request<InitiateAuthResponse, AWSError>
    open fun listDevices(params: ListDevicesRequest, callback: (err: AWSError, data: ListDevicesResponse) -> Unit = definedExternally): Request<ListDevicesResponse, AWSError>
    open fun listDevices(callback: (err: AWSError, data: ListDevicesResponse) -> Unit = definedExternally): Request<ListDevicesResponse, AWSError>
    open fun listGroups(params: ListGroupsRequest, callback: (err: AWSError, data: ListGroupsResponse) -> Unit = definedExternally): Request<ListGroupsResponse, AWSError>
    open fun listGroups(callback: (err: AWSError, data: ListGroupsResponse) -> Unit = definedExternally): Request<ListGroupsResponse, AWSError>
    open fun listIdentityProviders(params: ListIdentityProvidersRequest, callback: (err: AWSError, data: ListIdentityProvidersResponse) -> Unit = definedExternally): Request<ListIdentityProvidersResponse, AWSError>
    open fun listIdentityProviders(callback: (err: AWSError, data: ListIdentityProvidersResponse) -> Unit = definedExternally): Request<ListIdentityProvidersResponse, AWSError>
    open fun listResourceServers(params: ListResourceServersRequest, callback: (err: AWSError, data: ListResourceServersResponse) -> Unit = definedExternally): Request<ListResourceServersResponse, AWSError>
    open fun listResourceServers(callback: (err: AWSError, data: ListResourceServersResponse) -> Unit = definedExternally): Request<ListResourceServersResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listUserImportJobs(params: ListUserImportJobsRequest, callback: (err: AWSError, data: ListUserImportJobsResponse) -> Unit = definedExternally): Request<ListUserImportJobsResponse, AWSError>
    open fun listUserImportJobs(callback: (err: AWSError, data: ListUserImportJobsResponse) -> Unit = definedExternally): Request<ListUserImportJobsResponse, AWSError>
    open fun listUserPoolClients(params: ListUserPoolClientsRequest, callback: (err: AWSError, data: ListUserPoolClientsResponse) -> Unit = definedExternally): Request<ListUserPoolClientsResponse, AWSError>
    open fun listUserPoolClients(callback: (err: AWSError, data: ListUserPoolClientsResponse) -> Unit = definedExternally): Request<ListUserPoolClientsResponse, AWSError>
    open fun listUserPools(params: ListUserPoolsRequest, callback: (err: AWSError, data: ListUserPoolsResponse) -> Unit = definedExternally): Request<ListUserPoolsResponse, AWSError>
    open fun listUserPools(callback: (err: AWSError, data: ListUserPoolsResponse) -> Unit = definedExternally): Request<ListUserPoolsResponse, AWSError>
    open fun listUsers(params: ListUsersRequest, callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listUsers(callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listUsersInGroup(params: ListUsersInGroupRequest, callback: (err: AWSError, data: ListUsersInGroupResponse) -> Unit = definedExternally): Request<ListUsersInGroupResponse, AWSError>
    open fun listUsersInGroup(callback: (err: AWSError, data: ListUsersInGroupResponse) -> Unit = definedExternally): Request<ListUsersInGroupResponse, AWSError>
    open fun resendConfirmationCode(params: ResendConfirmationCodeRequest, callback: (err: AWSError, data: ResendConfirmationCodeResponse) -> Unit = definedExternally): Request<ResendConfirmationCodeResponse, AWSError>
    open fun resendConfirmationCode(callback: (err: AWSError, data: ResendConfirmationCodeResponse) -> Unit = definedExternally): Request<ResendConfirmationCodeResponse, AWSError>
    open fun respondToAuthChallenge(params: RespondToAuthChallengeRequest, callback: (err: AWSError, data: RespondToAuthChallengeResponse) -> Unit = definedExternally): Request<RespondToAuthChallengeResponse, AWSError>
    open fun respondToAuthChallenge(callback: (err: AWSError, data: RespondToAuthChallengeResponse) -> Unit = definedExternally): Request<RespondToAuthChallengeResponse, AWSError>
    open fun setRiskConfiguration(params: SetRiskConfigurationRequest, callback: (err: AWSError, data: SetRiskConfigurationResponse) -> Unit = definedExternally): Request<SetRiskConfigurationResponse, AWSError>
    open fun setRiskConfiguration(callback: (err: AWSError, data: SetRiskConfigurationResponse) -> Unit = definedExternally): Request<SetRiskConfigurationResponse, AWSError>
    open fun setUICustomization(params: SetUICustomizationRequest, callback: (err: AWSError, data: SetUICustomizationResponse) -> Unit = definedExternally): Request<SetUICustomizationResponse, AWSError>
    open fun setUICustomization(callback: (err: AWSError, data: SetUICustomizationResponse) -> Unit = definedExternally): Request<SetUICustomizationResponse, AWSError>
    open fun setUserMFAPreference(params: SetUserMFAPreferenceRequest, callback: (err: AWSError, data: SetUserMFAPreferenceResponse) -> Unit = definedExternally): Request<SetUserMFAPreferenceResponse, AWSError>
    open fun setUserMFAPreference(callback: (err: AWSError, data: SetUserMFAPreferenceResponse) -> Unit = definedExternally): Request<SetUserMFAPreferenceResponse, AWSError>
    open fun setUserPoolMfaConfig(params: SetUserPoolMfaConfigRequest, callback: (err: AWSError, data: SetUserPoolMfaConfigResponse) -> Unit = definedExternally): Request<SetUserPoolMfaConfigResponse, AWSError>
    open fun setUserPoolMfaConfig(callback: (err: AWSError, data: SetUserPoolMfaConfigResponse) -> Unit = definedExternally): Request<SetUserPoolMfaConfigResponse, AWSError>
    open fun setUserSettings(params: SetUserSettingsRequest, callback: (err: AWSError, data: SetUserSettingsResponse) -> Unit = definedExternally): Request<SetUserSettingsResponse, AWSError>
    open fun setUserSettings(callback: (err: AWSError, data: SetUserSettingsResponse) -> Unit = definedExternally): Request<SetUserSettingsResponse, AWSError>
    open fun signUp(params: SignUpRequest, callback: (err: AWSError, data: SignUpResponse) -> Unit = definedExternally): Request<SignUpResponse, AWSError>
    open fun signUp(callback: (err: AWSError, data: SignUpResponse) -> Unit = definedExternally): Request<SignUpResponse, AWSError>
    open fun startUserImportJob(params: StartUserImportJobRequest, callback: (err: AWSError, data: StartUserImportJobResponse) -> Unit = definedExternally): Request<StartUserImportJobResponse, AWSError>
    open fun startUserImportJob(callback: (err: AWSError, data: StartUserImportJobResponse) -> Unit = definedExternally): Request<StartUserImportJobResponse, AWSError>
    open fun stopUserImportJob(params: StopUserImportJobRequest, callback: (err: AWSError, data: StopUserImportJobResponse) -> Unit = definedExternally): Request<StopUserImportJobResponse, AWSError>
    open fun stopUserImportJob(callback: (err: AWSError, data: StopUserImportJobResponse) -> Unit = definedExternally): Request<StopUserImportJobResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateAuthEventFeedback(params: UpdateAuthEventFeedbackRequest, callback: (err: AWSError, data: UpdateAuthEventFeedbackResponse) -> Unit = definedExternally): Request<UpdateAuthEventFeedbackResponse, AWSError>
    open fun updateAuthEventFeedback(callback: (err: AWSError, data: UpdateAuthEventFeedbackResponse) -> Unit = definedExternally): Request<UpdateAuthEventFeedbackResponse, AWSError>
    open fun updateDeviceStatus(params: UpdateDeviceStatusRequest, callback: (err: AWSError, data: UpdateDeviceStatusResponse) -> Unit = definedExternally): Request<UpdateDeviceStatusResponse, AWSError>
    open fun updateDeviceStatus(callback: (err: AWSError, data: UpdateDeviceStatusResponse) -> Unit = definedExternally): Request<UpdateDeviceStatusResponse, AWSError>
    open fun updateGroup(params: UpdateGroupRequest, callback: (err: AWSError, data: UpdateGroupResponse) -> Unit = definedExternally): Request<UpdateGroupResponse, AWSError>
    open fun updateGroup(callback: (err: AWSError, data: UpdateGroupResponse) -> Unit = definedExternally): Request<UpdateGroupResponse, AWSError>
    open fun updateIdentityProvider(params: UpdateIdentityProviderRequest, callback: (err: AWSError, data: UpdateIdentityProviderResponse) -> Unit = definedExternally): Request<UpdateIdentityProviderResponse, AWSError>
    open fun updateIdentityProvider(callback: (err: AWSError, data: UpdateIdentityProviderResponse) -> Unit = definedExternally): Request<UpdateIdentityProviderResponse, AWSError>
    open fun updateResourceServer(params: UpdateResourceServerRequest, callback: (err: AWSError, data: UpdateResourceServerResponse) -> Unit = definedExternally): Request<UpdateResourceServerResponse, AWSError>
    open fun updateResourceServer(callback: (err: AWSError, data: UpdateResourceServerResponse) -> Unit = definedExternally): Request<UpdateResourceServerResponse, AWSError>
    open fun updateUserAttributes(params: UpdateUserAttributesRequest, callback: (err: AWSError, data: UpdateUserAttributesResponse) -> Unit = definedExternally): Request<UpdateUserAttributesResponse, AWSError>
    open fun updateUserAttributes(callback: (err: AWSError, data: UpdateUserAttributesResponse) -> Unit = definedExternally): Request<UpdateUserAttributesResponse, AWSError>
    open fun updateUserPool(params: UpdateUserPoolRequest, callback: (err: AWSError, data: UpdateUserPoolResponse) -> Unit = definedExternally): Request<UpdateUserPoolResponse, AWSError>
    open fun updateUserPool(callback: (err: AWSError, data: UpdateUserPoolResponse) -> Unit = definedExternally): Request<UpdateUserPoolResponse, AWSError>
    open fun updateUserPoolClient(params: UpdateUserPoolClientRequest, callback: (err: AWSError, data: UpdateUserPoolClientResponse) -> Unit = definedExternally): Request<UpdateUserPoolClientResponse, AWSError>
    open fun updateUserPoolClient(callback: (err: AWSError, data: UpdateUserPoolClientResponse) -> Unit = definedExternally): Request<UpdateUserPoolClientResponse, AWSError>
    open fun updateUserPoolDomain(params: UpdateUserPoolDomainRequest, callback: (err: AWSError, data: UpdateUserPoolDomainResponse) -> Unit = definedExternally): Request<UpdateUserPoolDomainResponse, AWSError>
    open fun updateUserPoolDomain(callback: (err: AWSError, data: UpdateUserPoolDomainResponse) -> Unit = definedExternally): Request<UpdateUserPoolDomainResponse, AWSError>
    open fun verifySoftwareToken(params: VerifySoftwareTokenRequest, callback: (err: AWSError, data: VerifySoftwareTokenResponse) -> Unit = definedExternally): Request<VerifySoftwareTokenResponse, AWSError>
    open fun verifySoftwareToken(callback: (err: AWSError, data: VerifySoftwareTokenResponse) -> Unit = definedExternally): Request<VerifySoftwareTokenResponse, AWSError>
    open fun verifyUserAttribute(params: VerifyUserAttributeRequest, callback: (err: AWSError, data: VerifyUserAttributeResponse) -> Unit = definedExternally): Request<VerifyUserAttributeResponse, AWSError>
    open fun verifyUserAttribute(callback: (err: AWSError, data: VerifyUserAttributeResponse) -> Unit = definedExternally): Request<VerifyUserAttributeResponse, AWSError>
    interface AccountRecoverySettingType {
        var RecoveryMechanisms: RecoveryMechanismsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccountTakeoverActionType {
        var Notify: AccountTakeoverActionNotifyType
        var EventAction: String /* "BLOCK" | "MFA_IF_CONFIGURED" | "MFA_REQUIRED" | "NO_ACTION" | String */
    }
    interface AccountTakeoverActionsType {
        var LowAction: AccountTakeoverActionType?
            get() = definedExternally
            set(value) = definedExternally
        var MediumAction: AccountTakeoverActionType?
            get() = definedExternally
            set(value) = definedExternally
        var HighAction: AccountTakeoverActionType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccountTakeoverRiskConfigurationType {
        var NotifyConfiguration: NotifyConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: AccountTakeoverActionsType
    }
    interface AddCustomAttributesRequest {
        var UserPoolId: UserPoolIdType
        var CustomAttributes: CustomAttributesListType
    }
    interface AddCustomAttributesResponse
    interface AdminAddUserToGroupRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var GroupName: GroupNameType
    }
    interface AdminConfirmSignUpRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminConfirmSignUpResponse
    interface AdminCreateUserConfigType {
        var AllowAdminCreateUserOnly: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var UnusedAccountValidityDays: AdminCreateUserUnusedAccountValidityDaysType?
            get() = definedExternally
            set(value) = definedExternally
        var InviteMessageTemplate: MessageTemplateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminCreateUserRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var UserAttributes: AttributeListType?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationData: AttributeListType?
            get() = definedExternally
            set(value) = definedExternally
        var TemporaryPassword: PasswordType?
            get() = definedExternally
            set(value) = definedExternally
        var ForceAliasCreation: ForceAliasCreation?
            get() = definedExternally
            set(value) = definedExternally
        var MessageAction: String /* "RESEND" | "SUPPRESS" | String */
        var DesiredDeliveryMediums: DeliveryMediumListType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminCreateUserResponse {
        var User: UserType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminDeleteUserAttributesRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var UserAttributeNames: AttributeNameListType
    }
    interface AdminDeleteUserAttributesResponse
    interface AdminDeleteUserRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
    }
    interface AdminDisableProviderForUserRequest {
        var UserPoolId: StringType
        var User: ProviderUserIdentifierType
    }
    interface AdminDisableProviderForUserResponse
    interface AdminDisableUserRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
    }
    interface AdminDisableUserResponse
    interface AdminEnableUserRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
    }
    interface AdminEnableUserResponse
    interface AdminForgetDeviceRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var DeviceKey: DeviceKeyType
    }
    interface AdminGetDeviceRequest {
        var DeviceKey: DeviceKeyType
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
    }
    interface AdminGetDeviceResponse {
        var Device: DeviceType
    }
    interface AdminGetUserRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
    }
    interface AdminGetUserResponse {
        var Username: UsernameType
        var UserAttributes: AttributeListType?
            get() = definedExternally
            set(value) = definedExternally
        var UserCreateDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var UserLastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var UserStatus: String /* "UNCONFIRMED" | "CONFIRMED" | "ARCHIVED" | "COMPROMISED" | "UNKNOWN" | "RESET_REQUIRED" | "FORCE_CHANGE_PASSWORD" | String */
        var MFAOptions: MFAOptionListType?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMfaSetting: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var UserMFASettingList: UserMFASettingListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminInitiateAuthRequest {
        var UserPoolId: UserPoolIdType
        var ClientId: ClientIdType
        var AuthFlow: String /* "USER_SRP_AUTH" | "REFRESH_TOKEN_AUTH" | "REFRESH_TOKEN" | "CUSTOM_AUTH" | "ADMIN_NO_SRP_AUTH" | "USER_PASSWORD_AUTH" | "ADMIN_USER_PASSWORD_AUTH" | String */
        var AuthParameters: AuthParametersType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var AnalyticsMetadata: AnalyticsMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var ContextData: ContextDataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminInitiateAuthResponse {
        var ChallengeName: String /* "SMS_MFA" | "SOFTWARE_TOKEN_MFA" | "SELECT_MFA_TYPE" | "MFA_SETUP" | "PASSWORD_VERIFIER" | "CUSTOM_CHALLENGE" | "DEVICE_SRP_AUTH" | "DEVICE_PASSWORD_VERIFIER" | "ADMIN_NO_SRP_AUTH" | "NEW_PASSWORD_REQUIRED" | String */
        var Session: SessionType?
            get() = definedExternally
            set(value) = definedExternally
        var ChallengeParameters: ChallengeParametersType?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationResult: AuthenticationResultType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminLinkProviderForUserRequest {
        var UserPoolId: StringType
        var DestinationUser: ProviderUserIdentifierType
        var SourceUser: ProviderUserIdentifierType
    }
    interface AdminLinkProviderForUserResponse
    interface AdminListDevicesRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var Limit: QueryLimitType?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: SearchPaginationTokenType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminListDevicesResponse {
        var Devices: DeviceListType?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: SearchPaginationTokenType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminListGroupsForUserRequest {
        var Username: UsernameType
        var UserPoolId: UserPoolIdType
        var Limit: QueryLimitType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminListGroupsForUserResponse {
        var Groups: GroupListType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminListUserAuthEventsRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var MaxResults: QueryLimitType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminListUserAuthEventsResponse {
        var AuthEvents: AuthEventsType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminRemoveUserFromGroupRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var GroupName: GroupNameType
    }
    interface AdminResetUserPasswordRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminResetUserPasswordResponse
    interface AdminRespondToAuthChallengeRequest {
        var UserPoolId: UserPoolIdType
        var ClientId: ClientIdType
        var ChallengeName: String /* "SMS_MFA" | "SOFTWARE_TOKEN_MFA" | "SELECT_MFA_TYPE" | "MFA_SETUP" | "PASSWORD_VERIFIER" | "CUSTOM_CHALLENGE" | "DEVICE_SRP_AUTH" | "DEVICE_PASSWORD_VERIFIER" | "ADMIN_NO_SRP_AUTH" | "NEW_PASSWORD_REQUIRED" | String */
        var ChallengeResponses: ChallengeResponsesType?
            get() = definedExternally
            set(value) = definedExternally
        var Session: SessionType?
            get() = definedExternally
            set(value) = definedExternally
        var AnalyticsMetadata: AnalyticsMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var ContextData: ContextDataType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminRespondToAuthChallengeResponse {
        var ChallengeName: String /* "SMS_MFA" | "SOFTWARE_TOKEN_MFA" | "SELECT_MFA_TYPE" | "MFA_SETUP" | "PASSWORD_VERIFIER" | "CUSTOM_CHALLENGE" | "DEVICE_SRP_AUTH" | "DEVICE_PASSWORD_VERIFIER" | "ADMIN_NO_SRP_AUTH" | "NEW_PASSWORD_REQUIRED" | String */
        var Session: SessionType?
            get() = definedExternally
            set(value) = definedExternally
        var ChallengeParameters: ChallengeParametersType?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationResult: AuthenticationResultType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminSetUserMFAPreferenceRequest {
        var SMSMfaSettings: SMSMfaSettingsType?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareTokenMfaSettings: SoftwareTokenMfaSettingsType?
            get() = definedExternally
            set(value) = definedExternally
        var Username: UsernameType
        var UserPoolId: UserPoolIdType
    }
    interface AdminSetUserMFAPreferenceResponse
    interface AdminSetUserPasswordRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var Password: PasswordType
        var Permanent: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminSetUserPasswordResponse
    interface AdminSetUserSettingsRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var MFAOptions: MFAOptionListType
    }
    interface AdminSetUserSettingsResponse
    interface AdminUpdateAuthEventFeedbackRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var EventId: EventIdType
        var FeedbackValue: String /* "Valid" | "Invalid" | String */
    }
    interface AdminUpdateAuthEventFeedbackResponse
    interface AdminUpdateDeviceStatusRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var DeviceKey: DeviceKeyType
        var DeviceRememberedStatus: String /* "remembered" | "not_remembered" | String */
    }
    interface AdminUpdateDeviceStatusResponse
    interface AdminUpdateUserAttributesRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var UserAttributes: AttributeListType
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AdminUpdateUserAttributesResponse
    interface AdminUserGlobalSignOutRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
    }
    interface AdminUserGlobalSignOutResponse
    interface AnalyticsConfigurationType {
        var ApplicationId: HexStringType
        var RoleArn: ArnType
        var ExternalId: StringType
        var UserDataShared: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AnalyticsMetadataType {
        var AnalyticsEndpointId: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateSoftwareTokenRequest {
        var AccessToken: TokenModelType?
            get() = definedExternally
            set(value) = definedExternally
        var Session: SessionType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateSoftwareTokenResponse {
        var SecretCode: SecretCodeType?
            get() = definedExternally
            set(value) = definedExternally
        var Session: SessionType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttributeMappingType {
        @nativeGetter
        operator fun get(key: String): StringType?
        @nativeSetter
        operator fun set(key: String, value: StringType)
    }
    interface AttributeType {
        var Name: AttributeNameType
        var Value: AttributeValueType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthEventType {
        var EventId: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var EventType: String /* "SignIn" | "SignUp" | "ForgotPassword" | String */
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var EventResponse: String /* "Success" | "Failure" | String */
        var EventRisk: EventRiskType?
            get() = definedExternally
            set(value) = definedExternally
        var ChallengeResponses: ChallengeResponseListType?
            get() = definedExternally
            set(value) = definedExternally
        var EventContextData: EventContextDataType?
            get() = definedExternally
            set(value) = definedExternally
        var EventFeedback: EventFeedbackType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AuthParametersType {
        @nativeGetter
        operator fun get(key: String): AuthParametersValueType?
        @nativeSetter
        operator fun set(key: String, value: AuthParametersValueType)
    }
    interface AuthenticationResultType {
        var AccessToken: TokenModelType?
            get() = definedExternally
            set(value) = definedExternally
        var ExpiresIn: IntegerType?
            get() = definedExternally
            set(value) = definedExternally
        var TokenType: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshToken: TokenModelType?
            get() = definedExternally
            set(value) = definedExternally
        var IdToken: TokenModelType?
            get() = definedExternally
            set(value) = definedExternally
        var NewDeviceMetadata: NewDeviceMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChallengeParametersType {
        @nativeGetter
        operator fun get(key: String): StringType?
        @nativeSetter
        operator fun set(key: String, value: StringType)
    }
    interface ChallengeResponseType {
        var ChallengeName: String /* "Password" | "Mfa" | String */
        var ChallengeResponse: String /* "Success" | "Failure" | String */
    }
    interface ChallengeResponsesType {
        @nativeGetter
        operator fun get(key: String): StringType?
        @nativeSetter
        operator fun set(key: String, value: StringType)
    }
    interface ChangePasswordRequest {
        var PreviousPassword: PasswordType
        var ProposedPassword: PasswordType
        var AccessToken: TokenModelType
    }
    interface ChangePasswordResponse
    interface ClientMetadataType {
        @nativeGetter
        operator fun get(key: String): StringType?
        @nativeSetter
        operator fun set(key: String, value: StringType)
    }
    interface CodeDeliveryDetailsType {
        var Destination: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var DeliveryMedium: String /* "SMS" | "EMAIL" | String */
        var AttributeName: AttributeNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompromisedCredentialsActionsType {
        var EventAction: String /* "BLOCK" | "NO_ACTION" | String */
    }
    interface CompromisedCredentialsRiskConfigurationType {
        var EventFilter: EventFiltersType?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: CompromisedCredentialsActionsType
    }
    interface ConfirmDeviceRequest {
        var AccessToken: TokenModelType
        var DeviceKey: DeviceKeyType
        var DeviceSecretVerifierConfig: DeviceSecretVerifierConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceName: DeviceNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfirmDeviceResponse {
        var UserConfirmationNecessary: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfirmForgotPasswordRequest {
        var ClientId: ClientIdType
        var SecretHash: SecretHashType?
            get() = definedExternally
            set(value) = definedExternally
        var Username: UsernameType
        var ConfirmationCode: ConfirmationCodeType
        var Password: PasswordType
        var AnalyticsMetadata: AnalyticsMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var UserContextData: UserContextDataType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfirmForgotPasswordResponse
    interface ConfirmSignUpRequest {
        var ClientId: ClientIdType
        var SecretHash: SecretHashType?
            get() = definedExternally
            set(value) = definedExternally
        var Username: UsernameType
        var ConfirmationCode: ConfirmationCodeType
        var ForceAliasCreation: ForceAliasCreation?
            get() = definedExternally
            set(value) = definedExternally
        var AnalyticsMetadata: AnalyticsMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var UserContextData: UserContextDataType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConfirmSignUpResponse
    interface ContextDataType {
        var IpAddress: StringType
        var ServerName: StringType
        var ServerPath: StringType
        var HttpHeaders: HttpHeaderList
        var EncodedData: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupRequest {
        var GroupName: GroupNameType
        var UserPoolId: UserPoolIdType
        var Description: DescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var Precedence: PrecedenceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGroupResponse {
        var Group: GroupType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIdentityProviderRequest {
        var UserPoolId: UserPoolIdType
        var ProviderName: ProviderNameTypeV1
        var ProviderType: String /* "SAML" | "Facebook" | "Google" | "LoginWithAmazon" | "SignInWithApple" | "OIDC" | String */
        var ProviderDetails: ProviderDetailsType
        var AttributeMapping: AttributeMappingType?
            get() = definedExternally
            set(value) = definedExternally
        var IdpIdentifiers: IdpIdentifiersListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIdentityProviderResponse {
        var IdentityProvider: IdentityProviderType
    }
    interface CreateResourceServerRequest {
        var UserPoolId: UserPoolIdType
        var Identifier: ResourceServerIdentifierType
        var Name: ResourceServerNameType
        var Scopes: ResourceServerScopeListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateResourceServerResponse {
        var ResourceServer: ResourceServerType
    }
    interface CreateUserImportJobRequest {
        var JobName: UserImportJobNameType
        var UserPoolId: UserPoolIdType
        var CloudWatchLogsRoleArn: ArnType
    }
    interface CreateUserImportJobResponse {
        var UserImportJob: UserImportJobType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserPoolClientRequest {
        var UserPoolId: UserPoolIdType
        var ClientName: ClientNameType
        var GenerateSecret: GenerateSecret?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshTokenValidity: RefreshTokenValidityType?
            get() = definedExternally
            set(value) = definedExternally
        var ReadAttributes: ClientPermissionListType?
            get() = definedExternally
            set(value) = definedExternally
        var WriteAttributes: ClientPermissionListType?
            get() = definedExternally
            set(value) = definedExternally
        var ExplicitAuthFlows: ExplicitAuthFlowsListType?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedIdentityProviders: SupportedIdentityProvidersListType?
            get() = definedExternally
            set(value) = definedExternally
        var CallbackURLs: CallbackURLsListType?
            get() = definedExternally
            set(value) = definedExternally
        var LogoutURLs: LogoutURLsListType?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRedirectURI: RedirectUrlType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedOAuthFlows: OAuthFlowsType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedOAuthScopes: ScopeListType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedOAuthFlowsUserPoolClient: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var AnalyticsConfiguration: AnalyticsConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var PreventUserExistenceErrors: String /* "LEGACY" | "ENABLED" | String */
    }
    interface CreateUserPoolClientResponse {
        var UserPoolClient: UserPoolClientType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserPoolDomainRequest {
        var Domain: DomainType
        var UserPoolId: UserPoolIdType
        var CustomDomainConfig: CustomDomainConfigType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserPoolDomainResponse {
        var CloudFrontDomain: DomainType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserPoolRequest {
        var PoolName: UserPoolNameType
        var Policies: UserPoolPolicyType?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaConfig: LambdaConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var AutoVerifiedAttributes: VerifiedAttributesListType?
            get() = definedExternally
            set(value) = definedExternally
        var AliasAttributes: AliasAttributesListType?
            get() = definedExternally
            set(value) = definedExternally
        var UsernameAttributes: UsernameAttributesListType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsVerificationMessage: SmsVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailVerificationMessage: EmailVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailVerificationSubject: EmailVerificationSubjectType?
            get() = definedExternally
            set(value) = definedExternally
        var VerificationMessageTemplate: VerificationMessageTemplateType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsAuthenticationMessage: SmsVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var MfaConfiguration: String /* "OFF" | "ON" | "OPTIONAL" | String */
        var DeviceConfiguration: DeviceConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailConfiguration: EmailConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsConfiguration: SmsConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var UserPoolTags: UserPoolTagsType?
            get() = definedExternally
            set(value) = definedExternally
        var AdminCreateUserConfig: AdminCreateUserConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: SchemaAttributesListType?
            get() = definedExternally
            set(value) = definedExternally
        var UserPoolAddOns: UserPoolAddOnsType?
            get() = definedExternally
            set(value) = definedExternally
        var UsernameConfiguration: UsernameConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var AccountRecoverySetting: AccountRecoverySettingType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserPoolResponse {
        var UserPool: UserPoolType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomDomainConfigType {
        var CertificateArn: ArnType
    }
    interface DeleteGroupRequest {
        var GroupName: GroupNameType
        var UserPoolId: UserPoolIdType
    }
    interface DeleteIdentityProviderRequest {
        var UserPoolId: UserPoolIdType
        var ProviderName: ProviderNameType
    }
    interface DeleteResourceServerRequest {
        var UserPoolId: UserPoolIdType
        var Identifier: ResourceServerIdentifierType
    }
    interface DeleteUserAttributesRequest {
        var UserAttributeNames: AttributeNameListType
        var AccessToken: TokenModelType
    }
    interface DeleteUserAttributesResponse
    interface DeleteUserPoolClientRequest {
        var UserPoolId: UserPoolIdType
        var ClientId: ClientIdType
    }
    interface DeleteUserPoolDomainRequest {
        var Domain: DomainType
        var UserPoolId: UserPoolIdType
    }
    interface DeleteUserPoolDomainResponse
    interface DeleteUserPoolRequest {
        var UserPoolId: UserPoolIdType
    }
    interface DeleteUserRequest {
        var AccessToken: TokenModelType
    }
    interface DescribeIdentityProviderRequest {
        var UserPoolId: UserPoolIdType
        var ProviderName: ProviderNameType
    }
    interface DescribeIdentityProviderResponse {
        var IdentityProvider: IdentityProviderType
    }
    interface DescribeResourceServerRequest {
        var UserPoolId: UserPoolIdType
        var Identifier: ResourceServerIdentifierType
    }
    interface DescribeResourceServerResponse {
        var ResourceServer: ResourceServerType
    }
    interface DescribeRiskConfigurationRequest {
        var UserPoolId: UserPoolIdType
        var ClientId: ClientIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRiskConfigurationResponse {
        var RiskConfiguration: RiskConfigurationType
    }
    interface DescribeUserImportJobRequest {
        var UserPoolId: UserPoolIdType
        var JobId: UserImportJobIdType
    }
    interface DescribeUserImportJobResponse {
        var UserImportJob: UserImportJobType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserPoolClientRequest {
        var UserPoolId: UserPoolIdType
        var ClientId: ClientIdType
    }
    interface DescribeUserPoolClientResponse {
        var UserPoolClient: UserPoolClientType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserPoolDomainRequest {
        var Domain: DomainType
    }
    interface DescribeUserPoolDomainResponse {
        var DomainDescription: DomainDescriptionType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeUserPoolRequest {
        var UserPoolId: UserPoolIdType
    }
    interface DescribeUserPoolResponse {
        var UserPool: UserPoolType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceConfigurationType {
        var ChallengeRequiredOnNewDevice: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceOnlyRememberedOnUserPrompt: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceSecretVerifierConfigType {
        var PasswordVerifier: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var Salt: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeviceType {
        var DeviceKey: DeviceKeyType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceAttributes: AttributeListType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceCreateDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceLastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceLastAuthenticatedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DomainDescriptionType {
        var UserPoolId: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var AWSAccountId: AWSAccountIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: DomainType?
            get() = definedExternally
            set(value) = definedExternally
        var S3Bucket: S3BucketType?
            get() = definedExternally
            set(value) = definedExternally
        var CloudFrontDistribution: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var Version: DomainVersionType?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "DELETING" | "UPDATING" | "ACTIVE" | "FAILED" | String */
        var CustomDomainConfig: CustomDomainConfigType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EmailConfigurationType {
        var SourceArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var ReplyToEmailAddress: EmailAddressType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailSendingAccount: String /* "COGNITO_DEFAULT" | "DEVELOPER" | String */
        var From: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationSet: SESConfigurationSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventContextDataType {
        var IpAddress: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceName: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var Timezone: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var City: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var Country: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventFeedbackType {
        var FeedbackValue: String /* "Valid" | "Invalid" | String */
        var Provider: StringType
        var FeedbackDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventRiskType {
        var RiskDecision: String /* "NoRisk" | "AccountTakeover" | "Block" | String */
        var RiskLevel: String /* "Low" | "Medium" | "High" | String */
        var CompromisedCredentialsDetected: WrappedBooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ForgetDeviceRequest {
        var AccessToken: TokenModelType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceKey: DeviceKeyType
    }
    interface ForgotPasswordRequest {
        var ClientId: ClientIdType
        var SecretHash: SecretHashType?
            get() = definedExternally
            set(value) = definedExternally
        var UserContextData: UserContextDataType?
            get() = definedExternally
            set(value) = definedExternally
        var Username: UsernameType
        var AnalyticsMetadata: AnalyticsMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ForgotPasswordResponse {
        var CodeDeliveryDetails: CodeDeliveryDetailsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCSVHeaderRequest {
        var UserPoolId: UserPoolIdType
    }
    interface GetCSVHeaderResponse {
        var UserPoolId: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CSVHeader: ListOfStringTypes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeviceRequest {
        var DeviceKey: DeviceKeyType
        var AccessToken: TokenModelType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDeviceResponse {
        var Device: DeviceType
    }
    interface GetGroupRequest {
        var GroupName: GroupNameType
        var UserPoolId: UserPoolIdType
    }
    interface GetGroupResponse {
        var Group: GroupType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIdentityProviderByIdentifierRequest {
        var UserPoolId: UserPoolIdType
        var IdpIdentifier: IdpIdentifierType
    }
    interface GetIdentityProviderByIdentifierResponse {
        var IdentityProvider: IdentityProviderType
    }
    interface GetSigningCertificateRequest {
        var UserPoolId: UserPoolIdType
    }
    interface GetSigningCertificateResponse {
        var Certificate: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUICustomizationRequest {
        var UserPoolId: UserPoolIdType
        var ClientId: ClientIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUICustomizationResponse {
        var UICustomization: UICustomizationType
    }
    interface GetUserAttributeVerificationCodeRequest {
        var AccessToken: TokenModelType
        var AttributeName: AttributeNameType
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUserAttributeVerificationCodeResponse {
        var CodeDeliveryDetails: CodeDeliveryDetailsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUserPoolMfaConfigRequest {
        var UserPoolId: UserPoolIdType
    }
    interface GetUserPoolMfaConfigResponse {
        var SmsMfaConfiguration: SmsMfaConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareTokenMfaConfiguration: SoftwareTokenMfaConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var MfaConfiguration: String /* "OFF" | "ON" | "OPTIONAL" | String */
    }
    interface GetUserRequest {
        var AccessToken: TokenModelType
    }
    interface GetUserResponse {
        var Username: UsernameType
        var UserAttributes: AttributeListType
        var MFAOptions: MFAOptionListType?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMfaSetting: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var UserMFASettingList: UserMFASettingListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlobalSignOutRequest {
        var AccessToken: TokenModelType
    }
    interface GlobalSignOutResponse
    interface GroupType {
        var GroupName: GroupNameType?
            get() = definedExternally
            set(value) = definedExternally
        var UserPoolId: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var Precedence: PrecedenceType?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HttpHeader {
        var headerName: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var headerValue: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityProviderType {
        var UserPoolId: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderName: ProviderNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderType: String /* "SAML" | "Facebook" | "Google" | "LoginWithAmazon" | "SignInWithApple" | "OIDC" | String */
        var ProviderDetails: ProviderDetailsType?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeMapping: AttributeMappingType?
            get() = definedExternally
            set(value) = definedExternally
        var IdpIdentifiers: IdpIdentifiersListType?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InitiateAuthRequest {
        var AuthFlow: String /* "USER_SRP_AUTH" | "REFRESH_TOKEN_AUTH" | "REFRESH_TOKEN" | "CUSTOM_AUTH" | "ADMIN_NO_SRP_AUTH" | "USER_PASSWORD_AUTH" | "ADMIN_USER_PASSWORD_AUTH" | String */
        var AuthParameters: AuthParametersType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientId: ClientIdType
        var AnalyticsMetadata: AnalyticsMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var UserContextData: UserContextDataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InitiateAuthResponse {
        var ChallengeName: String /* "SMS_MFA" | "SOFTWARE_TOKEN_MFA" | "SELECT_MFA_TYPE" | "MFA_SETUP" | "PASSWORD_VERIFIER" | "CUSTOM_CHALLENGE" | "DEVICE_SRP_AUTH" | "DEVICE_PASSWORD_VERIFIER" | "ADMIN_NO_SRP_AUTH" | "NEW_PASSWORD_REQUIRED" | String */
        var Session: SessionType?
            get() = definedExternally
            set(value) = definedExternally
        var ChallengeParameters: ChallengeParametersType?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationResult: AuthenticationResultType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaConfigType {
        var PreSignUp: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var CustomMessage: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var PostConfirmation: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var PreAuthentication: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var PostAuthentication: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var DefineAuthChallenge: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var CreateAuthChallenge: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var VerifyAuthChallengeResponse: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var PreTokenGeneration: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var UserMigration: ArnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevicesRequest {
        var AccessToken: TokenModelType
        var Limit: QueryLimitType?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: SearchPaginationTokenType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevicesResponse {
        var Devices: DeviceListType?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: SearchPaginationTokenType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsRequest {
        var UserPoolId: UserPoolIdType
        var Limit: QueryLimitType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsResponse {
        var Groups: GroupListType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIdentityProvidersRequest {
        var UserPoolId: UserPoolIdType
        var MaxResults: ListProvidersLimitType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKeyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIdentityProvidersResponse {
        var Providers: ProvidersListType
        var NextToken: PaginationKeyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceServersRequest {
        var UserPoolId: UserPoolIdType
        var MaxResults: ListResourceServersLimitType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKeyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceServersResponse {
        var ResourceServers: ResourceServersListType
        var NextToken: PaginationKeyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: ArnType
    }
    interface ListTagsForResourceResponse {
        var Tags: UserPoolTagsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserImportJobsRequest {
        var UserPoolId: UserPoolIdType
        var MaxResults: PoolQueryLimitType
        var PaginationToken: PaginationKeyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserImportJobsResponse {
        var UserImportJobs: UserImportJobsListType?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: PaginationKeyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserPoolClientsRequest {
        var UserPoolId: UserPoolIdType
        var MaxResults: QueryLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserPoolClientsResponse {
        var UserPoolClients: UserPoolClientListType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserPoolsRequest {
        var NextToken: PaginationKeyType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PoolQueryLimitType
    }
    interface ListUserPoolsResponse {
        var UserPools: UserPoolListType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKeyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersInGroupRequest {
        var UserPoolId: UserPoolIdType
        var GroupName: GroupNameType
        var Limit: QueryLimitType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersInGroupResponse {
        var Users: UsersListType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersRequest {
        var UserPoolId: UserPoolIdType
        var AttributesToGet: SearchedAttributeNamesListType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: QueryLimitType?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: SearchPaginationTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var Filter: UserFilterType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersResponse {
        var Users: UsersListType?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: SearchPaginationTokenType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MFAOptionType {
        var DeliveryMedium: String /* "SMS" | "EMAIL" | String */
        var AttributeName: AttributeNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MessageTemplateType {
        var SMSMessage: SmsVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailMessage: EmailVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailSubject: EmailVerificationSubjectType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NewDeviceMetadataType {
        var DeviceKey: DeviceKeyType?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceGroupKey: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotifyConfigurationType {
        var From: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var ReplyTo: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var SourceArn: ArnType
        var BlockEmail: NotifyEmailType?
            get() = definedExternally
            set(value) = definedExternally
        var NoActionEmail: NotifyEmailType?
            get() = definedExternally
            set(value) = definedExternally
        var MfaEmail: NotifyEmailType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotifyEmailType {
        var Subject: EmailNotificationSubjectType
        var HtmlBody: EmailNotificationBodyType?
            get() = definedExternally
            set(value) = definedExternally
        var TextBody: EmailNotificationBodyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NumberAttributeConstraintsType {
        var MinValue: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxValue: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PasswordPolicyType {
        var MinimumLength: PasswordPolicyMinLengthType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireUppercase: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireLowercase: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireNumbers: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireSymbols: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var TemporaryPasswordValidityDays: TemporaryPasswordValidityDaysType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProviderDescription {
        var ProviderName: ProviderNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderType: String /* "SAML" | "Facebook" | "Google" | "LoginWithAmazon" | "SignInWithApple" | "OIDC" | String */
        var LastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProviderDetailsType {
        @nativeGetter
        operator fun get(key: String): StringType?
        @nativeSetter
        operator fun set(key: String, value: StringType)
    }
    interface ProviderUserIdentifierType {
        var ProviderName: ProviderNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderAttributeName: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var ProviderAttributeValue: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecoveryOptionType {
        var Priority: PriorityType
        var Name: String /* "verified_email" | "verified_phone_number" | "admin_only" | String */
    }
    interface ResendConfirmationCodeRequest {
        var ClientId: ClientIdType
        var SecretHash: SecretHashType?
            get() = definedExternally
            set(value) = definedExternally
        var UserContextData: UserContextDataType?
            get() = definedExternally
            set(value) = definedExternally
        var Username: UsernameType
        var AnalyticsMetadata: AnalyticsMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResendConfirmationCodeResponse {
        var CodeDeliveryDetails: CodeDeliveryDetailsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceServerScopeType {
        var ScopeName: ResourceServerScopeNameType
        var ScopeDescription: ResourceServerScopeDescriptionType
    }
    interface ResourceServerType {
        var UserPoolId: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Identifier: ResourceServerIdentifierType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ResourceServerNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Scopes: ResourceServerScopeListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RespondToAuthChallengeRequest {
        var ClientId: ClientIdType
        var ChallengeName: String /* "SMS_MFA" | "SOFTWARE_TOKEN_MFA" | "SELECT_MFA_TYPE" | "MFA_SETUP" | "PASSWORD_VERIFIER" | "CUSTOM_CHALLENGE" | "DEVICE_SRP_AUTH" | "DEVICE_PASSWORD_VERIFIER" | "ADMIN_NO_SRP_AUTH" | "NEW_PASSWORD_REQUIRED" | String */
        var Session: SessionType?
            get() = definedExternally
            set(value) = definedExternally
        var ChallengeResponses: ChallengeResponsesType?
            get() = definedExternally
            set(value) = definedExternally
        var AnalyticsMetadata: AnalyticsMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var UserContextData: UserContextDataType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RespondToAuthChallengeResponse {
        var ChallengeName: String /* "SMS_MFA" | "SOFTWARE_TOKEN_MFA" | "SELECT_MFA_TYPE" | "MFA_SETUP" | "PASSWORD_VERIFIER" | "CUSTOM_CHALLENGE" | "DEVICE_SRP_AUTH" | "DEVICE_PASSWORD_VERIFIER" | "ADMIN_NO_SRP_AUTH" | "NEW_PASSWORD_REQUIRED" | String */
        var Session: SessionType?
            get() = definedExternally
            set(value) = definedExternally
        var ChallengeParameters: ChallengeParametersType?
            get() = definedExternally
            set(value) = definedExternally
        var AuthenticationResult: AuthenticationResultType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RiskConfigurationType {
        var UserPoolId: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientId: ClientIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CompromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var AccountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var RiskExceptionConfiguration: RiskExceptionConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RiskExceptionConfigurationType {
        var BlockedIPRangeList: BlockedIPRangeListType?
            get() = definedExternally
            set(value) = definedExternally
        var SkippedIPRangeList: SkippedIPRangeListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SMSMfaSettingsType {
        var Enabled: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMfa: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SchemaAttributeType {
        var Name: CustomAttributeNameType?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeDataType: String /* "String" | "Number" | "DateTime" | "Boolean" | String */
        var DeveloperOnlyAttribute: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Mutable: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Required: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var NumberAttributeConstraints: NumberAttributeConstraintsType?
            get() = definedExternally
            set(value) = definedExternally
        var StringAttributeConstraints: StringAttributeConstraintsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetRiskConfigurationRequest {
        var UserPoolId: UserPoolIdType
        var ClientId: ClientIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CompromisedCredentialsRiskConfiguration: CompromisedCredentialsRiskConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var AccountTakeoverRiskConfiguration: AccountTakeoverRiskConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var RiskExceptionConfiguration: RiskExceptionConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetRiskConfigurationResponse {
        var RiskConfiguration: RiskConfigurationType
    }
    interface SetUICustomizationRequest {
        var UserPoolId: UserPoolIdType
        var ClientId: ClientIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CSS: CSSType?
            get() = definedExternally
            set(value) = definedExternally
        var ImageFile: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetUICustomizationResponse {
        var UICustomization: UICustomizationType
    }
    interface SetUserMFAPreferenceRequest {
        var SMSMfaSettings: SMSMfaSettingsType?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareTokenMfaSettings: SoftwareTokenMfaSettingsType?
            get() = definedExternally
            set(value) = definedExternally
        var AccessToken: TokenModelType
    }
    interface SetUserMFAPreferenceResponse
    interface SetUserPoolMfaConfigRequest {
        var UserPoolId: UserPoolIdType
        var SmsMfaConfiguration: SmsMfaConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareTokenMfaConfiguration: SoftwareTokenMfaConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var MfaConfiguration: String /* "OFF" | "ON" | "OPTIONAL" | String */
    }
    interface SetUserPoolMfaConfigResponse {
        var SmsMfaConfiguration: SmsMfaConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var SoftwareTokenMfaConfiguration: SoftwareTokenMfaConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var MfaConfiguration: String /* "OFF" | "ON" | "OPTIONAL" | String */
    }
    interface SetUserSettingsRequest {
        var AccessToken: TokenModelType
        var MFAOptions: MFAOptionListType
    }
    interface SetUserSettingsResponse
    interface SignUpRequest {
        var ClientId: ClientIdType
        var SecretHash: SecretHashType?
            get() = definedExternally
            set(value) = definedExternally
        var Username: UsernameType
        var Password: PasswordType
        var UserAttributes: AttributeListType?
            get() = definedExternally
            set(value) = definedExternally
        var ValidationData: AttributeListType?
            get() = definedExternally
            set(value) = definedExternally
        var AnalyticsMetadata: AnalyticsMetadataType?
            get() = definedExternally
            set(value) = definedExternally
        var UserContextData: UserContextDataType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SignUpResponse {
        var UserConfirmed: BooleanType
        var CodeDeliveryDetails: CodeDeliveryDetailsType?
            get() = definedExternally
            set(value) = definedExternally
        var UserSub: StringType
    }
    interface SmsConfigurationType {
        var SnsCallerArn: ArnType
        var ExternalId: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SmsMfaConfigType {
        var SmsAuthenticationMessage: SmsVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsConfiguration: SmsConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SoftwareTokenMfaConfigType {
        var Enabled: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SoftwareTokenMfaSettingsType {
        var Enabled: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredMfa: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartUserImportJobRequest {
        var UserPoolId: UserPoolIdType
        var JobId: UserImportJobIdType
    }
    interface StartUserImportJobResponse {
        var UserImportJob: UserImportJobType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopUserImportJobRequest {
        var UserPoolId: UserPoolIdType
        var JobId: UserImportJobIdType
    }
    interface StopUserImportJobResponse {
        var UserImportJob: UserImportJobType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StringAttributeConstraintsType {
        var MinLength: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxLength: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: ArnType
        var Tags: UserPoolTagsType
    }
    interface TagResourceResponse
    interface UICustomizationType {
        var UserPoolId: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientId: ClientIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ImageUrl: ImageUrlType?
            get() = definedExternally
            set(value) = definedExternally
        var CSS: CSSType?
            get() = definedExternally
            set(value) = definedExternally
        var CSSVersion: CSSVersionType?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: ArnType
        var TagKeys: UserPoolTagsListType
    }
    interface UntagResourceResponse
    interface UpdateAuthEventFeedbackRequest {
        var UserPoolId: UserPoolIdType
        var Username: UsernameType
        var EventId: EventIdType
        var FeedbackToken: TokenModelType
        var FeedbackValue: String /* "Valid" | "Invalid" | String */
    }
    interface UpdateAuthEventFeedbackResponse
    interface UpdateDeviceStatusRequest {
        var AccessToken: TokenModelType
        var DeviceKey: DeviceKeyType
        var DeviceRememberedStatus: String /* "remembered" | "not_remembered" | String */
    }
    interface UpdateDeviceStatusResponse
    interface UpdateGroupRequest {
        var GroupName: GroupNameType
        var UserPoolId: UserPoolIdType
        var Description: DescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var Precedence: PrecedenceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateGroupResponse {
        var Group: GroupType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIdentityProviderRequest {
        var UserPoolId: UserPoolIdType
        var ProviderName: ProviderNameType
        var ProviderDetails: ProviderDetailsType?
            get() = definedExternally
            set(value) = definedExternally
        var AttributeMapping: AttributeMappingType?
            get() = definedExternally
            set(value) = definedExternally
        var IdpIdentifiers: IdpIdentifiersListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIdentityProviderResponse {
        var IdentityProvider: IdentityProviderType
    }
    interface UpdateResourceServerRequest {
        var UserPoolId: UserPoolIdType
        var Identifier: ResourceServerIdentifierType
        var Name: ResourceServerNameType
        var Scopes: ResourceServerScopeListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResourceServerResponse {
        var ResourceServer: ResourceServerType
    }
    interface UpdateUserAttributesRequest {
        var UserAttributes: AttributeListType
        var AccessToken: TokenModelType
        var ClientMetadata: ClientMetadataType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserAttributesResponse {
        var CodeDeliveryDetailsList: CodeDeliveryDetailsListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserPoolClientRequest {
        var UserPoolId: UserPoolIdType
        var ClientId: ClientIdType
        var ClientName: ClientNameType?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshTokenValidity: RefreshTokenValidityType?
            get() = definedExternally
            set(value) = definedExternally
        var ReadAttributes: ClientPermissionListType?
            get() = definedExternally
            set(value) = definedExternally
        var WriteAttributes: ClientPermissionListType?
            get() = definedExternally
            set(value) = definedExternally
        var ExplicitAuthFlows: ExplicitAuthFlowsListType?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedIdentityProviders: SupportedIdentityProvidersListType?
            get() = definedExternally
            set(value) = definedExternally
        var CallbackURLs: CallbackURLsListType?
            get() = definedExternally
            set(value) = definedExternally
        var LogoutURLs: LogoutURLsListType?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRedirectURI: RedirectUrlType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedOAuthFlows: OAuthFlowsType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedOAuthScopes: ScopeListType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedOAuthFlowsUserPoolClient: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var AnalyticsConfiguration: AnalyticsConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var PreventUserExistenceErrors: String /* "LEGACY" | "ENABLED" | String */
    }
    interface UpdateUserPoolClientResponse {
        var UserPoolClient: UserPoolClientType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserPoolDomainRequest {
        var Domain: DomainType
        var UserPoolId: UserPoolIdType
        var CustomDomainConfig: CustomDomainConfigType
    }
    interface UpdateUserPoolDomainResponse {
        var CloudFrontDomain: DomainType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserPoolRequest {
        var UserPoolId: UserPoolIdType
        var Policies: UserPoolPolicyType?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaConfig: LambdaConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var AutoVerifiedAttributes: VerifiedAttributesListType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsVerificationMessage: SmsVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailVerificationMessage: EmailVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailVerificationSubject: EmailVerificationSubjectType?
            get() = definedExternally
            set(value) = definedExternally
        var VerificationMessageTemplate: VerificationMessageTemplateType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsAuthenticationMessage: SmsVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var MfaConfiguration: String /* "OFF" | "ON" | "OPTIONAL" | String */
        var DeviceConfiguration: DeviceConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailConfiguration: EmailConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsConfiguration: SmsConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var UserPoolTags: UserPoolTagsType?
            get() = definedExternally
            set(value) = definedExternally
        var AdminCreateUserConfig: AdminCreateUserConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var UserPoolAddOns: UserPoolAddOnsType?
            get() = definedExternally
            set(value) = definedExternally
        var AccountRecoverySetting: AccountRecoverySettingType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserPoolResponse
    interface UserContextDataType {
        var EncodedData: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserImportJobType {
        var JobName: UserImportJobNameType?
            get() = definedExternally
            set(value) = definedExternally
        var JobId: UserImportJobIdType?
            get() = definedExternally
            set(value) = definedExternally
        var UserPoolId: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var PreSignedUrl: PreSignedUrlType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var StartDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Created" | "Pending" | "InProgress" | "Stopping" | "Expired" | "Stopped" | "Failed" | "Succeeded" | String */
        var CloudWatchLogsRoleArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var ImportedUsers: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var SkippedUsers: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var FailedUsers: LongType?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionMessage: CompletionMessageType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserPoolAddOnsType {
        var AdvancedSecurityMode: String /* "OFF" | "AUDIT" | "ENFORCED" | String */
    }
    interface UserPoolClientDescription {
        var ClientId: ClientIdType?
            get() = definedExternally
            set(value) = definedExternally
        var UserPoolId: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientName: ClientNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserPoolClientType {
        var UserPoolId: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientName: ClientNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientId: ClientIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientSecret: ClientSecretType?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshTokenValidity: RefreshTokenValidityType?
            get() = definedExternally
            set(value) = definedExternally
        var ReadAttributes: ClientPermissionListType?
            get() = definedExternally
            set(value) = definedExternally
        var WriteAttributes: ClientPermissionListType?
            get() = definedExternally
            set(value) = definedExternally
        var ExplicitAuthFlows: ExplicitAuthFlowsListType?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedIdentityProviders: SupportedIdentityProvidersListType?
            get() = definedExternally
            set(value) = definedExternally
        var CallbackURLs: CallbackURLsListType?
            get() = definedExternally
            set(value) = definedExternally
        var LogoutURLs: LogoutURLsListType?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRedirectURI: RedirectUrlType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedOAuthFlows: OAuthFlowsType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedOAuthScopes: ScopeListType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowedOAuthFlowsUserPoolClient: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var AnalyticsConfiguration: AnalyticsConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var PreventUserExistenceErrors: String /* "LEGACY" | "ENABLED" | String */
    }
    interface UserPoolDescriptionType {
        var Id: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: UserPoolNameType?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaConfig: LambdaConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Enabled" | "Disabled" | String */
        var LastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserPoolPolicyType {
        var PasswordPolicy: PasswordPolicyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserPoolTagsType {
        @nativeGetter
        operator fun get(key: String): TagValueType?
        @nativeSetter
        operator fun set(key: String, value: TagValueType)
    }
    interface UserPoolType {
        var Id: UserPoolIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: UserPoolNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Policies: UserPoolPolicyType?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaConfig: LambdaConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Enabled" | "Disabled" | String */
        var LastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaAttributes: SchemaAttributesListType?
            get() = definedExternally
            set(value) = definedExternally
        var AutoVerifiedAttributes: VerifiedAttributesListType?
            get() = definedExternally
            set(value) = definedExternally
        var AliasAttributes: AliasAttributesListType?
            get() = definedExternally
            set(value) = definedExternally
        var UsernameAttributes: UsernameAttributesListType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsVerificationMessage: SmsVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailVerificationMessage: EmailVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailVerificationSubject: EmailVerificationSubjectType?
            get() = definedExternally
            set(value) = definedExternally
        var VerificationMessageTemplate: VerificationMessageTemplateType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsAuthenticationMessage: SmsVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var MfaConfiguration: String /* "OFF" | "ON" | "OPTIONAL" | String */
        var DeviceConfiguration: DeviceConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedNumberOfUsers: IntegerType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailConfiguration: EmailConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsConfiguration: SmsConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var UserPoolTags: UserPoolTagsType?
            get() = definedExternally
            set(value) = definedExternally
        var SmsConfigurationFailure: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailConfigurationFailure: StringType?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: DomainType?
            get() = definedExternally
            set(value) = definedExternally
        var CustomDomain: DomainType?
            get() = definedExternally
            set(value) = definedExternally
        var AdminCreateUserConfig: AdminCreateUserConfigType?
            get() = definedExternally
            set(value) = definedExternally
        var UserPoolAddOns: UserPoolAddOnsType?
            get() = definedExternally
            set(value) = definedExternally
        var UsernameConfiguration: UsernameConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var AccountRecoverySetting: AccountRecoverySettingType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserType {
        var Username: UsernameType?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: AttributeListType?
            get() = definedExternally
            set(value) = definedExternally
        var UserCreateDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var UserLastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var UserStatus: String /* "UNCONFIRMED" | "CONFIRMED" | "ARCHIVED" | "COMPROMISED" | "UNKNOWN" | "RESET_REQUIRED" | "FORCE_CHANGE_PASSWORD" | String */
        var MFAOptions: MFAOptionListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UsernameConfigurationType {
        var CaseSensitive: WrappedBooleanType
    }
    interface VerificationMessageTemplateType {
        var SmsMessage: SmsVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailMessage: EmailVerificationMessageType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailSubject: EmailVerificationSubjectType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailMessageByLink: EmailVerificationMessageByLinkType?
            get() = definedExternally
            set(value) = definedExternally
        var EmailSubjectByLink: EmailVerificationSubjectByLinkType?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultEmailOption: String /* "CONFIRM_WITH_LINK" | "CONFIRM_WITH_CODE" | String */
    }
    interface VerifySoftwareTokenRequest {
        var AccessToken: TokenModelType?
            get() = definedExternally
            set(value) = definedExternally
        var Session: SessionType?
            get() = definedExternally
            set(value) = definedExternally
        var UserCode: SoftwareTokenMFAUserCodeType
        var FriendlyDeviceName: StringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VerifySoftwareTokenResponse {
        var Status: String /* "SUCCESS" | "ERROR" | String */
        var Session: SessionType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VerifyUserAttributeRequest {
        var AccessToken: TokenModelType
        var AttributeName: AttributeNameType
        var Code: ConfirmationCodeType
    }
    interface VerifyUserAttributeResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2016-04-18" | "latest" | String */
    }
}