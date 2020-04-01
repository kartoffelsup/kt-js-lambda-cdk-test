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
import IAM.AccessDetail
import IAM.ContextEntry
import IAM.EvaluationResult
import IAM.ManagedPolicyDetail
import IAM.OpenIDConnectProviderListEntry
import IAM.PolicyGroup
import IAM.PolicyRole
import IAM.PolicyUser
import IAM.ResourceSpecificResult
import IAM.RoleUsageType
import IAM.SAMLProviderListEntry
import IAM.SSHPublicKeyMetadata
import IAM.ServiceSpecificCredentialMetadata
import IAM.ServiceLastAccessed
import IAM.Statement
import IAM.AccessKeyMetadata
import IAM.AttachedPolicy
import IAM.SigningCertificate
import IAM.EntityDetails
import IAM.GroupDetail
import IAM.Group
import IAM.InstanceProfile
import IAM.ListPoliciesGrantingServiceAccessEntry
import IAM.MFADevice
import IAM.PolicyDetail
import IAM.PolicyVersion
import IAM.PolicyGrantingServiceAccess
import IAM.Policy
import IAM.RoleDetail
import IAM.Role
import IAM.ServerCertificateMetadata
import IAM.Tag
import IAM.UserDetail
import IAM.User
import IAM.VirtualMFADevice
import IAM.AddClientIDToOpenIDConnectProviderRequest
import IAM.AddRoleToInstanceProfileRequest
import IAM.AddUserToGroupRequest
import IAM.AttachGroupPolicyRequest
import IAM.AttachRolePolicyRequest
import IAM.AttachUserPolicyRequest
import IAM.ChangePasswordRequest
import IAM.CreateAccessKeyRequest
import IAM.CreateAccessKeyResponse
import IAM.CreateAccountAliasRequest
import IAM.CreateGroupRequest
import IAM.CreateGroupResponse
import IAM.CreateInstanceProfileRequest
import IAM.CreateInstanceProfileResponse
import IAM.CreateLoginProfileRequest
import IAM.CreateLoginProfileResponse
import IAM.CreateOpenIDConnectProviderRequest
import IAM.CreateOpenIDConnectProviderResponse
import IAM.CreatePolicyRequest
import IAM.CreatePolicyResponse
import IAM.CreatePolicyVersionRequest
import IAM.CreatePolicyVersionResponse
import IAM.CreateRoleRequest
import IAM.CreateRoleResponse
import IAM.CreateSAMLProviderRequest
import IAM.CreateSAMLProviderResponse
import IAM.CreateServiceLinkedRoleRequest
import IAM.CreateServiceLinkedRoleResponse
import IAM.CreateServiceSpecificCredentialRequest
import IAM.CreateServiceSpecificCredentialResponse
import IAM.CreateUserRequest
import IAM.CreateUserResponse
import IAM.CreateVirtualMFADeviceRequest
import IAM.CreateVirtualMFADeviceResponse
import IAM.DeactivateMFADeviceRequest
import IAM.DeleteAccessKeyRequest
import IAM.DeleteAccountAliasRequest
import IAM.DeleteGroupRequest
import IAM.DeleteGroupPolicyRequest
import IAM.DeleteInstanceProfileRequest
import IAM.DeleteLoginProfileRequest
import IAM.DeleteOpenIDConnectProviderRequest
import IAM.DeletePolicyRequest
import IAM.DeletePolicyVersionRequest
import IAM.DeleteRoleRequest
import IAM.DeleteRolePermissionsBoundaryRequest
import IAM.DeleteRolePolicyRequest
import IAM.DeleteSAMLProviderRequest
import IAM.DeleteSSHPublicKeyRequest
import IAM.DeleteServerCertificateRequest
import IAM.DeleteServiceLinkedRoleRequest
import IAM.DeleteServiceLinkedRoleResponse
import IAM.DeleteServiceSpecificCredentialRequest
import IAM.DeleteSigningCertificateRequest
import IAM.DeleteUserRequest
import IAM.DeleteUserPermissionsBoundaryRequest
import IAM.DeleteUserPolicyRequest
import IAM.DeleteVirtualMFADeviceRequest
import IAM.DetachGroupPolicyRequest
import IAM.DetachRolePolicyRequest
import IAM.DetachUserPolicyRequest
import IAM.EnableMFADeviceRequest
import IAM.GenerateCredentialReportResponse
import IAM.GenerateOrganizationsAccessReportRequest
import IAM.GenerateOrganizationsAccessReportResponse
import IAM.GenerateServiceLastAccessedDetailsRequest
import IAM.GenerateServiceLastAccessedDetailsResponse
import IAM.GetAccessKeyLastUsedRequest
import IAM.GetAccessKeyLastUsedResponse
import IAM.GetAccountAuthorizationDetailsRequest
import IAM.GetAccountAuthorizationDetailsResponse
import IAM.GetAccountPasswordPolicyResponse
import IAM.GetAccountSummaryResponse
import IAM.GetContextKeysForCustomPolicyRequest
import IAM.GetContextKeysForPolicyResponse
import IAM.GetContextKeysForPrincipalPolicyRequest
import IAM.GetCredentialReportResponse
import IAM.GetGroupRequest
import IAM.GetGroupResponse
import IAM.GetGroupPolicyRequest
import IAM.GetGroupPolicyResponse
import IAM.GetInstanceProfileRequest
import IAM.GetInstanceProfileResponse
import IAM.GetLoginProfileRequest
import IAM.GetLoginProfileResponse
import IAM.GetOpenIDConnectProviderRequest
import IAM.GetOpenIDConnectProviderResponse
import IAM.GetOrganizationsAccessReportRequest
import IAM.GetOrganizationsAccessReportResponse
import IAM.GetPolicyRequest
import IAM.GetPolicyResponse
import IAM.GetPolicyVersionRequest
import IAM.GetPolicyVersionResponse
import IAM.GetRoleRequest
import IAM.GetRoleResponse
import IAM.GetRolePolicyRequest
import IAM.GetRolePolicyResponse
import IAM.GetSAMLProviderRequest
import IAM.GetSAMLProviderResponse
import IAM.GetSSHPublicKeyRequest
import IAM.GetSSHPublicKeyResponse
import IAM.GetServerCertificateRequest
import IAM.GetServerCertificateResponse
import IAM.GetServiceLastAccessedDetailsRequest
import IAM.GetServiceLastAccessedDetailsResponse
import IAM.GetServiceLastAccessedDetailsWithEntitiesRequest
import IAM.GetServiceLastAccessedDetailsWithEntitiesResponse
import IAM.GetServiceLinkedRoleDeletionStatusRequest
import IAM.GetServiceLinkedRoleDeletionStatusResponse
import IAM.GetUserRequest
import IAM.GetUserResponse
import IAM.GetUserPolicyRequest
import IAM.GetUserPolicyResponse
import IAM.ListAccessKeysRequest
import IAM.ListAccessKeysResponse
import IAM.ListAccountAliasesRequest
import IAM.ListAccountAliasesResponse
import IAM.ListAttachedGroupPoliciesRequest
import IAM.ListAttachedGroupPoliciesResponse
import IAM.ListAttachedRolePoliciesRequest
import IAM.ListAttachedRolePoliciesResponse
import IAM.ListAttachedUserPoliciesRequest
import IAM.ListAttachedUserPoliciesResponse
import IAM.ListEntitiesForPolicyRequest
import IAM.ListEntitiesForPolicyResponse
import IAM.ListGroupPoliciesRequest
import IAM.ListGroupPoliciesResponse
import IAM.ListGroupsRequest
import IAM.ListGroupsResponse
import IAM.ListGroupsForUserRequest
import IAM.ListGroupsForUserResponse
import IAM.ListInstanceProfilesRequest
import IAM.ListInstanceProfilesResponse
import IAM.ListInstanceProfilesForRoleRequest
import IAM.ListInstanceProfilesForRoleResponse
import IAM.ListMFADevicesRequest
import IAM.ListMFADevicesResponse
import IAM.ListOpenIDConnectProvidersRequest
import IAM.ListOpenIDConnectProvidersResponse
import IAM.ListPoliciesRequest
import IAM.ListPoliciesResponse
import IAM.ListPoliciesGrantingServiceAccessRequest
import IAM.ListPoliciesGrantingServiceAccessResponse
import IAM.ListPolicyVersionsRequest
import IAM.ListPolicyVersionsResponse
import IAM.ListRolePoliciesRequest
import IAM.ListRolePoliciesResponse
import IAM.ListRoleTagsRequest
import IAM.ListRoleTagsResponse
import IAM.ListRolesRequest
import IAM.ListRolesResponse
import IAM.ListSAMLProvidersRequest
import IAM.ListSAMLProvidersResponse
import IAM.ListSSHPublicKeysRequest
import IAM.ListSSHPublicKeysResponse
import IAM.ListServerCertificatesRequest
import IAM.ListServerCertificatesResponse
import IAM.ListServiceSpecificCredentialsRequest
import IAM.ListServiceSpecificCredentialsResponse
import IAM.ListSigningCertificatesRequest
import IAM.ListSigningCertificatesResponse
import IAM.ListUserPoliciesRequest
import IAM.ListUserPoliciesResponse
import IAM.ListUserTagsRequest
import IAM.ListUserTagsResponse
import IAM.ListUsersRequest
import IAM.ListUsersResponse
import IAM.ListVirtualMFADevicesRequest
import IAM.ListVirtualMFADevicesResponse
import IAM.PutGroupPolicyRequest
import IAM.PutRolePermissionsBoundaryRequest
import IAM.PutRolePolicyRequest
import IAM.PutUserPermissionsBoundaryRequest
import IAM.PutUserPolicyRequest
import IAM.RemoveClientIDFromOpenIDConnectProviderRequest
import IAM.RemoveRoleFromInstanceProfileRequest
import IAM.RemoveUserFromGroupRequest
import IAM.ResetServiceSpecificCredentialRequest
import IAM.ResetServiceSpecificCredentialResponse
import IAM.ResyncMFADeviceRequest
import IAM.SetDefaultPolicyVersionRequest
import IAM.SetSecurityTokenServicePreferencesRequest
import IAM.SimulateCustomPolicyRequest
import IAM.SimulatePolicyResponse
import IAM.SimulatePrincipalPolicyRequest
import IAM.TagRoleRequest
import IAM.TagUserRequest
import IAM.UntagRoleRequest
import IAM.UntagUserRequest
import IAM.UpdateAccessKeyRequest
import IAM.UpdateAccountPasswordPolicyRequest
import IAM.UpdateAssumeRolePolicyRequest
import IAM.UpdateGroupRequest
import IAM.UpdateLoginProfileRequest
import IAM.UpdateOpenIDConnectProviderThumbprintRequest
import IAM.UpdateRoleRequest
import IAM.UpdateRoleResponse
import IAM.UpdateRoleDescriptionRequest
import IAM.UpdateRoleDescriptionResponse
import IAM.UpdateSAMLProviderRequest
import IAM.UpdateSAMLProviderResponse
import IAM.UpdateSSHPublicKeyRequest
import IAM.UpdateServerCertificateRequest
import IAM.UpdateServiceSpecificCredentialRequest
import IAM.UpdateSigningCertificateRequest
import IAM.UpdateUserRequest
import IAM.UploadSSHPublicKeyRequest
import IAM.UploadSSHPublicKeyResponse
import IAM.UploadServerCertificateRequest
import IAM.UploadServerCertificateResponse
import IAM.UploadSigningCertificateRequest
import IAM.UploadSigningCertificateResponse
import IAM.AccessKey
import IAM.LoginProfile
import IAM.ServiceSpecificCredential
import IAM.EntityInfo
import IAM.OrganizationsDecisionDetail
import IAM.PermissionsBoundaryDecisionDetail
import IAM.EvalDecisionDetailsType
import IAM.AccessKeyLastUsed
import IAM.PasswordPolicy
import IAM.summaryMapType
import IAM.ErrorDetails
import IAM.SSHPublicKey
import IAM.ServerCertificate
import IAM.DeletionTaskFailureReasonType
import IAM.AttachedPermissionsBoundary
import IAM.RoleLastUsed
import IAM.Position

typealias AccessDetails = Array<AccessDetail>

typealias ActionNameListType = Array<ActionNameType>

typealias ActionNameType = String

typealias ArnListType = Array<arnType>

typealias ColumnNumber = Number

typealias ContextEntryListType = Array<ContextEntry>

typealias ContextKeyNameType = String

typealias ContextKeyNamesResultListType = Array<ContextKeyNameType>

typealias ContextKeyValueListType = Array<ContextKeyValueType>

typealias ContextKeyValueType = String

typealias DeletionTaskIdType = String

typealias EvalDecisionSourceType = String

typealias EvaluationResultsListType = Array<EvaluationResult>

typealias LineNumber = Number

typealias ManagedPolicyDetailListType = Array<ManagedPolicyDetail>

typealias OpenIDConnectProviderListType = Array<OpenIDConnectProviderListEntry>

typealias OpenIDConnectProviderUrlType = String

typealias PolicyGroupListType = Array<PolicyGroup>

typealias PolicyIdentifierType = String

typealias PolicyRoleListType = Array<PolicyRole>

typealias PolicyUserListType = Array<PolicyUser>

typealias ReasonType = String

typealias RegionNameType = String

typealias ReportStateDescriptionType = String

typealias ResourceHandlingOptionType = String

typealias ResourceNameListType = Array<ResourceNameType>

typealias ResourceNameType = String

typealias ResourceSpecificResultListType = Array<ResourceSpecificResult>

typealias RoleUsageListType = Array<RoleUsageType>

typealias SAMLMetadataDocumentType = String

typealias SAMLProviderListType = Array<SAMLProviderListEntry>

typealias SAMLProviderNameType = String

typealias SSHPublicKeyListType = Array<SSHPublicKeyMetadata>

typealias ServiceSpecificCredentialsListType = Array<ServiceSpecificCredentialMetadata>

typealias ServicesLastAccessed = Array<ServiceLastAccessed>

typealias SimulationPolicyListType = Array<policyDocumentType>

typealias StatementListType = Array<Statement>

typealias accessKeyIdType = String

typealias accessKeyMetadataListType = Array<AccessKeyMetadata>

typealias accessKeySecretType = String

typealias accountAliasListType = Array<accountAliasType>

typealias accountAliasType = String

typealias arnType = String

typealias attachedPoliciesListType = Array<AttachedPolicy>

typealias attachmentCountType = Number

typealias authenticationCodeType = String

typealias booleanObjectType = Boolean

typealias booleanType = Boolean

typealias certificateBodyType = String

typealias certificateChainType = String

typealias certificateIdType = String

typealias certificateListType = Array<SigningCertificate>

typealias clientIDListType = Array<clientIDType>

typealias clientIDType = String

typealias customSuffixType = String

typealias dateType = Date

typealias entityDetailsListType = Array<EntityDetails>

typealias entityListType = Array<String /* "User" | "Role" | "Group" | "LocalManagedPolicy" | "AWSManagedPolicy" | String */>

typealias entityNameType = String

typealias existingUserNameType = String

typealias groupDetailListType = Array<GroupDetail>

typealias groupListType = Array<Group>

typealias groupNameListType = Array<groupNameType>

typealias groupNameType = String

typealias idType = String

typealias instanceProfileListType = Array<InstanceProfile>

typealias instanceProfileNameType = String

typealias integerType = Number

typealias jobIDType = String

typealias listPolicyGrantingServiceAccessResponseListType = Array<ListPoliciesGrantingServiceAccessEntry>

typealias markerType = String

typealias maxItemsType = Number

typealias maxPasswordAgeType = Number

typealias mfaDeviceListType = Array<MFADevice>

typealias minimumPasswordLengthType = Number

typealias organizationsEntityPathType = String

typealias organizationsPolicyIdType = String

typealias passwordReusePreventionType = Number

typealias passwordType = String

typealias pathPrefixType = String

typealias pathType = String

typealias policyDescriptionType = String

typealias policyDetailListType = Array<PolicyDetail>

typealias policyDocumentType = String

typealias policyDocumentVersionListType = Array<PolicyVersion>

typealias policyGrantingServiceAccessListType = Array<PolicyGrantingServiceAccess>

typealias policyListType = Array<Policy>

typealias policyNameListType = Array<policyNameType>

typealias policyNameType = String

typealias policyPathType = String

typealias policyVersionIdType = String

typealias privateKeyType = String

typealias publicKeyFingerprintType = String

typealias publicKeyIdType = String

typealias publicKeyMaterialType = String

typealias responseMarkerType = String

typealias roleDescriptionType = String

typealias roleDetailListType = Array<RoleDetail>

typealias roleListType = Array<Role>

typealias roleMaxSessionDurationType = Number

typealias roleNameType = String

typealias serialNumberType = String

typealias serverCertificateMetadataListType = Array<ServerCertificateMetadata>

typealias serverCertificateNameType = String

typealias serviceName = String

typealias serviceNameType = String

typealias serviceNamespaceListType = Array<serviceNamespaceType>

typealias serviceNamespaceType = String

typealias servicePassword = String

typealias serviceSpecificCredentialId = String

typealias serviceUserName = String

typealias stringType = String

typealias summaryValueType = Number

typealias tagKeyListType = Array<tagKeyType>

typealias tagKeyType = String

typealias tagListType = Array<Tag>

typealias tagValueType = String

typealias thumbprintListType = Array<thumbprintType>

typealias thumbprintType = String

typealias userDetailListType = Array<UserDetail>

typealias userListType = Array<User>

typealias userNameType = String

typealias virtualMFADeviceListType = Array<VirtualMFADevice>

typealias virtualMFADeviceName = String

@JsModule("aws-sdk")
external open class IAM(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & IAM.Types.ClientConfiguration */
    open fun addClientIDToOpenIDConnectProvider(params: AddClientIDToOpenIDConnectProviderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addClientIDToOpenIDConnectProvider(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addRoleToInstanceProfile(params: AddRoleToInstanceProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addRoleToInstanceProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addUserToGroup(params: AddUserToGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun addUserToGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachGroupPolicy(params: AttachGroupPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachGroupPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachRolePolicy(params: AttachRolePolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachRolePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachUserPolicy(params: AttachUserPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun attachUserPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun changePassword(params: ChangePasswordRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun changePassword(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createAccessKey(params: CreateAccessKeyRequest, callback: (err: AWSError, data: CreateAccessKeyResponse) -> Unit = definedExternally): Request<CreateAccessKeyResponse, AWSError>
    open fun createAccessKey(callback: (err: AWSError, data: CreateAccessKeyResponse) -> Unit = definedExternally): Request<CreateAccessKeyResponse, AWSError>
    open fun createAccountAlias(params: CreateAccountAliasRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createAccountAlias(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createGroup(params: CreateGroupRequest, callback: (err: AWSError, data: CreateGroupResponse) -> Unit = definedExternally): Request<CreateGroupResponse, AWSError>
    open fun createGroup(callback: (err: AWSError, data: CreateGroupResponse) -> Unit = definedExternally): Request<CreateGroupResponse, AWSError>
    open fun createInstanceProfile(params: CreateInstanceProfileRequest, callback: (err: AWSError, data: CreateInstanceProfileResponse) -> Unit = definedExternally): Request<CreateInstanceProfileResponse, AWSError>
    open fun createInstanceProfile(callback: (err: AWSError, data: CreateInstanceProfileResponse) -> Unit = definedExternally): Request<CreateInstanceProfileResponse, AWSError>
    open fun createLoginProfile(params: CreateLoginProfileRequest, callback: (err: AWSError, data: CreateLoginProfileResponse) -> Unit = definedExternally): Request<CreateLoginProfileResponse, AWSError>
    open fun createLoginProfile(callback: (err: AWSError, data: CreateLoginProfileResponse) -> Unit = definedExternally): Request<CreateLoginProfileResponse, AWSError>
    open fun createOpenIDConnectProvider(params: CreateOpenIDConnectProviderRequest, callback: (err: AWSError, data: CreateOpenIDConnectProviderResponse) -> Unit = definedExternally): Request<CreateOpenIDConnectProviderResponse, AWSError>
    open fun createOpenIDConnectProvider(callback: (err: AWSError, data: CreateOpenIDConnectProviderResponse) -> Unit = definedExternally): Request<CreateOpenIDConnectProviderResponse, AWSError>
    open fun createPolicy(params: CreatePolicyRequest, callback: (err: AWSError, data: CreatePolicyResponse) -> Unit = definedExternally): Request<CreatePolicyResponse, AWSError>
    open fun createPolicy(callback: (err: AWSError, data: CreatePolicyResponse) -> Unit = definedExternally): Request<CreatePolicyResponse, AWSError>
    open fun createPolicyVersion(params: CreatePolicyVersionRequest, callback: (err: AWSError, data: CreatePolicyVersionResponse) -> Unit = definedExternally): Request<CreatePolicyVersionResponse, AWSError>
    open fun createPolicyVersion(callback: (err: AWSError, data: CreatePolicyVersionResponse) -> Unit = definedExternally): Request<CreatePolicyVersionResponse, AWSError>
    open fun createRole(params: CreateRoleRequest, callback: (err: AWSError, data: CreateRoleResponse) -> Unit = definedExternally): Request<CreateRoleResponse, AWSError>
    open fun createRole(callback: (err: AWSError, data: CreateRoleResponse) -> Unit = definedExternally): Request<CreateRoleResponse, AWSError>
    open fun createSAMLProvider(params: CreateSAMLProviderRequest, callback: (err: AWSError, data: CreateSAMLProviderResponse) -> Unit = definedExternally): Request<CreateSAMLProviderResponse, AWSError>
    open fun createSAMLProvider(callback: (err: AWSError, data: CreateSAMLProviderResponse) -> Unit = definedExternally): Request<CreateSAMLProviderResponse, AWSError>
    open fun createServiceLinkedRole(params: CreateServiceLinkedRoleRequest, callback: (err: AWSError, data: CreateServiceLinkedRoleResponse) -> Unit = definedExternally): Request<CreateServiceLinkedRoleResponse, AWSError>
    open fun createServiceLinkedRole(callback: (err: AWSError, data: CreateServiceLinkedRoleResponse) -> Unit = definedExternally): Request<CreateServiceLinkedRoleResponse, AWSError>
    open fun createServiceSpecificCredential(params: CreateServiceSpecificCredentialRequest, callback: (err: AWSError, data: CreateServiceSpecificCredentialResponse) -> Unit = definedExternally): Request<CreateServiceSpecificCredentialResponse, AWSError>
    open fun createServiceSpecificCredential(callback: (err: AWSError, data: CreateServiceSpecificCredentialResponse) -> Unit = definedExternally): Request<CreateServiceSpecificCredentialResponse, AWSError>
    open fun createUser(params: CreateUserRequest, callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun createUser(callback: (err: AWSError, data: CreateUserResponse) -> Unit = definedExternally): Request<CreateUserResponse, AWSError>
    open fun createVirtualMFADevice(params: CreateVirtualMFADeviceRequest, callback: (err: AWSError, data: CreateVirtualMFADeviceResponse) -> Unit = definedExternally): Request<CreateVirtualMFADeviceResponse, AWSError>
    open fun createVirtualMFADevice(callback: (err: AWSError, data: CreateVirtualMFADeviceResponse) -> Unit = definedExternally): Request<CreateVirtualMFADeviceResponse, AWSError>
    open fun deactivateMFADevice(params: DeactivateMFADeviceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deactivateMFADevice(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccessKey(params: DeleteAccessKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccessKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccountAlias(params: DeleteAccountAliasRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccountAlias(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAccountPasswordPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteGroup(params: DeleteGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteGroupPolicy(params: DeleteGroupPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteGroupPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteInstanceProfile(params: DeleteInstanceProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteInstanceProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLoginProfile(params: DeleteLoginProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLoginProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteOpenIDConnectProvider(params: DeleteOpenIDConnectProviderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteOpenIDConnectProvider(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicy(params: DeletePolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicyVersion(params: DeletePolicyVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePolicyVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRole(params: DeleteRoleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRole(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRolePermissionsBoundary(params: DeleteRolePermissionsBoundaryRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRolePermissionsBoundary(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRolePolicy(params: DeleteRolePolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRolePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSAMLProvider(params: DeleteSAMLProviderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSAMLProvider(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSSHPublicKey(params: DeleteSSHPublicKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSSHPublicKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteServerCertificate(params: DeleteServerCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteServerCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteServiceLinkedRole(params: DeleteServiceLinkedRoleRequest, callback: (err: AWSError, data: DeleteServiceLinkedRoleResponse) -> Unit = definedExternally): Request<DeleteServiceLinkedRoleResponse, AWSError>
    open fun deleteServiceLinkedRole(callback: (err: AWSError, data: DeleteServiceLinkedRoleResponse) -> Unit = definedExternally): Request<DeleteServiceLinkedRoleResponse, AWSError>
    open fun deleteServiceSpecificCredential(params: DeleteServiceSpecificCredentialRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteServiceSpecificCredential(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSigningCertificate(params: DeleteSigningCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteSigningCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUser(params: DeleteUserRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUser(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserPermissionsBoundary(params: DeleteUserPermissionsBoundaryRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserPermissionsBoundary(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserPolicy(params: DeleteUserPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteUserPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVirtualMFADevice(params: DeleteVirtualMFADeviceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteVirtualMFADevice(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachGroupPolicy(params: DetachGroupPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachGroupPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachRolePolicy(params: DetachRolePolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachRolePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachUserPolicy(params: DetachUserPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun detachUserPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableMFADevice(params: EnableMFADeviceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableMFADevice(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun generateCredentialReport(callback: (err: AWSError, data: GenerateCredentialReportResponse) -> Unit = definedExternally): Request<GenerateCredentialReportResponse, AWSError>
    open fun generateOrganizationsAccessReport(params: GenerateOrganizationsAccessReportRequest, callback: (err: AWSError, data: GenerateOrganizationsAccessReportResponse) -> Unit = definedExternally): Request<GenerateOrganizationsAccessReportResponse, AWSError>
    open fun generateOrganizationsAccessReport(callback: (err: AWSError, data: GenerateOrganizationsAccessReportResponse) -> Unit = definedExternally): Request<GenerateOrganizationsAccessReportResponse, AWSError>
    open fun generateServiceLastAccessedDetails(params: GenerateServiceLastAccessedDetailsRequest, callback: (err: AWSError, data: GenerateServiceLastAccessedDetailsResponse) -> Unit = definedExternally): Request<GenerateServiceLastAccessedDetailsResponse, AWSError>
    open fun generateServiceLastAccessedDetails(callback: (err: AWSError, data: GenerateServiceLastAccessedDetailsResponse) -> Unit = definedExternally): Request<GenerateServiceLastAccessedDetailsResponse, AWSError>
    open fun getAccessKeyLastUsed(params: GetAccessKeyLastUsedRequest, callback: (err: AWSError, data: GetAccessKeyLastUsedResponse) -> Unit = definedExternally): Request<GetAccessKeyLastUsedResponse, AWSError>
    open fun getAccessKeyLastUsed(callback: (err: AWSError, data: GetAccessKeyLastUsedResponse) -> Unit = definedExternally): Request<GetAccessKeyLastUsedResponse, AWSError>
    open fun getAccountAuthorizationDetails(params: GetAccountAuthorizationDetailsRequest, callback: (err: AWSError, data: GetAccountAuthorizationDetailsResponse) -> Unit = definedExternally): Request<GetAccountAuthorizationDetailsResponse, AWSError>
    open fun getAccountAuthorizationDetails(callback: (err: AWSError, data: GetAccountAuthorizationDetailsResponse) -> Unit = definedExternally): Request<GetAccountAuthorizationDetailsResponse, AWSError>
    open fun getAccountPasswordPolicy(callback: (err: AWSError, data: GetAccountPasswordPolicyResponse) -> Unit = definedExternally): Request<GetAccountPasswordPolicyResponse, AWSError>
    open fun getAccountSummary(callback: (err: AWSError, data: GetAccountSummaryResponse) -> Unit = definedExternally): Request<GetAccountSummaryResponse, AWSError>
    open fun getContextKeysForCustomPolicy(params: GetContextKeysForCustomPolicyRequest, callback: (err: AWSError, data: GetContextKeysForPolicyResponse) -> Unit = definedExternally): Request<GetContextKeysForPolicyResponse, AWSError>
    open fun getContextKeysForCustomPolicy(callback: (err: AWSError, data: GetContextKeysForPolicyResponse) -> Unit = definedExternally): Request<GetContextKeysForPolicyResponse, AWSError>
    open fun getContextKeysForPrincipalPolicy(params: GetContextKeysForPrincipalPolicyRequest, callback: (err: AWSError, data: GetContextKeysForPolicyResponse) -> Unit = definedExternally): Request<GetContextKeysForPolicyResponse, AWSError>
    open fun getContextKeysForPrincipalPolicy(callback: (err: AWSError, data: GetContextKeysForPolicyResponse) -> Unit = definedExternally): Request<GetContextKeysForPolicyResponse, AWSError>
    open fun getCredentialReport(callback: (err: AWSError, data: GetCredentialReportResponse) -> Unit = definedExternally): Request<GetCredentialReportResponse, AWSError>
    open fun getGroup(params: GetGroupRequest, callback: (err: AWSError, data: GetGroupResponse) -> Unit = definedExternally): Request<GetGroupResponse, AWSError>
    open fun getGroup(callback: (err: AWSError, data: GetGroupResponse) -> Unit = definedExternally): Request<GetGroupResponse, AWSError>
    open fun getGroupPolicy(params: GetGroupPolicyRequest, callback: (err: AWSError, data: GetGroupPolicyResponse) -> Unit = definedExternally): Request<GetGroupPolicyResponse, AWSError>
    open fun getGroupPolicy(callback: (err: AWSError, data: GetGroupPolicyResponse) -> Unit = definedExternally): Request<GetGroupPolicyResponse, AWSError>
    open fun getInstanceProfile(params: GetInstanceProfileRequest, callback: (err: AWSError, data: GetInstanceProfileResponse) -> Unit = definedExternally): Request<GetInstanceProfileResponse, AWSError>
    open fun getInstanceProfile(callback: (err: AWSError, data: GetInstanceProfileResponse) -> Unit = definedExternally): Request<GetInstanceProfileResponse, AWSError>
    open fun getLoginProfile(params: GetLoginProfileRequest, callback: (err: AWSError, data: GetLoginProfileResponse) -> Unit = definedExternally): Request<GetLoginProfileResponse, AWSError>
    open fun getLoginProfile(callback: (err: AWSError, data: GetLoginProfileResponse) -> Unit = definedExternally): Request<GetLoginProfileResponse, AWSError>
    open fun getOpenIDConnectProvider(params: GetOpenIDConnectProviderRequest, callback: (err: AWSError, data: GetOpenIDConnectProviderResponse) -> Unit = definedExternally): Request<GetOpenIDConnectProviderResponse, AWSError>
    open fun getOpenIDConnectProvider(callback: (err: AWSError, data: GetOpenIDConnectProviderResponse) -> Unit = definedExternally): Request<GetOpenIDConnectProviderResponse, AWSError>
    open fun getOrganizationsAccessReport(params: GetOrganizationsAccessReportRequest, callback: (err: AWSError, data: GetOrganizationsAccessReportResponse) -> Unit = definedExternally): Request<GetOrganizationsAccessReportResponse, AWSError>
    open fun getOrganizationsAccessReport(callback: (err: AWSError, data: GetOrganizationsAccessReportResponse) -> Unit = definedExternally): Request<GetOrganizationsAccessReportResponse, AWSError>
    open fun getPolicy(params: GetPolicyRequest, callback: (err: AWSError, data: GetPolicyResponse) -> Unit = definedExternally): Request<GetPolicyResponse, AWSError>
    open fun getPolicy(callback: (err: AWSError, data: GetPolicyResponse) -> Unit = definedExternally): Request<GetPolicyResponse, AWSError>
    open fun getPolicyVersion(params: GetPolicyVersionRequest, callback: (err: AWSError, data: GetPolicyVersionResponse) -> Unit = definedExternally): Request<GetPolicyVersionResponse, AWSError>
    open fun getPolicyVersion(callback: (err: AWSError, data: GetPolicyVersionResponse) -> Unit = definedExternally): Request<GetPolicyVersionResponse, AWSError>
    open fun getRole(params: GetRoleRequest, callback: (err: AWSError, data: GetRoleResponse) -> Unit = definedExternally): Request<GetRoleResponse, AWSError>
    open fun getRole(callback: (err: AWSError, data: GetRoleResponse) -> Unit = definedExternally): Request<GetRoleResponse, AWSError>
    open fun getRolePolicy(params: GetRolePolicyRequest, callback: (err: AWSError, data: GetRolePolicyResponse) -> Unit = definedExternally): Request<GetRolePolicyResponse, AWSError>
    open fun getRolePolicy(callback: (err: AWSError, data: GetRolePolicyResponse) -> Unit = definedExternally): Request<GetRolePolicyResponse, AWSError>
    open fun getSAMLProvider(params: GetSAMLProviderRequest, callback: (err: AWSError, data: GetSAMLProviderResponse) -> Unit = definedExternally): Request<GetSAMLProviderResponse, AWSError>
    open fun getSAMLProvider(callback: (err: AWSError, data: GetSAMLProviderResponse) -> Unit = definedExternally): Request<GetSAMLProviderResponse, AWSError>
    open fun getSSHPublicKey(params: GetSSHPublicKeyRequest, callback: (err: AWSError, data: GetSSHPublicKeyResponse) -> Unit = definedExternally): Request<GetSSHPublicKeyResponse, AWSError>
    open fun getSSHPublicKey(callback: (err: AWSError, data: GetSSHPublicKeyResponse) -> Unit = definedExternally): Request<GetSSHPublicKeyResponse, AWSError>
    open fun getServerCertificate(params: GetServerCertificateRequest, callback: (err: AWSError, data: GetServerCertificateResponse) -> Unit = definedExternally): Request<GetServerCertificateResponse, AWSError>
    open fun getServerCertificate(callback: (err: AWSError, data: GetServerCertificateResponse) -> Unit = definedExternally): Request<GetServerCertificateResponse, AWSError>
    open fun getServiceLastAccessedDetails(params: GetServiceLastAccessedDetailsRequest, callback: (err: AWSError, data: GetServiceLastAccessedDetailsResponse) -> Unit = definedExternally): Request<GetServiceLastAccessedDetailsResponse, AWSError>
    open fun getServiceLastAccessedDetails(callback: (err: AWSError, data: GetServiceLastAccessedDetailsResponse) -> Unit = definedExternally): Request<GetServiceLastAccessedDetailsResponse, AWSError>
    open fun getServiceLastAccessedDetailsWithEntities(params: GetServiceLastAccessedDetailsWithEntitiesRequest, callback: (err: AWSError, data: GetServiceLastAccessedDetailsWithEntitiesResponse) -> Unit = definedExternally): Request<GetServiceLastAccessedDetailsWithEntitiesResponse, AWSError>
    open fun getServiceLastAccessedDetailsWithEntities(callback: (err: AWSError, data: GetServiceLastAccessedDetailsWithEntitiesResponse) -> Unit = definedExternally): Request<GetServiceLastAccessedDetailsWithEntitiesResponse, AWSError>
    open fun getServiceLinkedRoleDeletionStatus(params: GetServiceLinkedRoleDeletionStatusRequest, callback: (err: AWSError, data: GetServiceLinkedRoleDeletionStatusResponse) -> Unit = definedExternally): Request<GetServiceLinkedRoleDeletionStatusResponse, AWSError>
    open fun getServiceLinkedRoleDeletionStatus(callback: (err: AWSError, data: GetServiceLinkedRoleDeletionStatusResponse) -> Unit = definedExternally): Request<GetServiceLinkedRoleDeletionStatusResponse, AWSError>
    open fun getUser(params: GetUserRequest, callback: (err: AWSError, data: GetUserResponse) -> Unit = definedExternally): Request<GetUserResponse, AWSError>
    open fun getUser(callback: (err: AWSError, data: GetUserResponse) -> Unit = definedExternally): Request<GetUserResponse, AWSError>
    open fun getUserPolicy(params: GetUserPolicyRequest, callback: (err: AWSError, data: GetUserPolicyResponse) -> Unit = definedExternally): Request<GetUserPolicyResponse, AWSError>
    open fun getUserPolicy(callback: (err: AWSError, data: GetUserPolicyResponse) -> Unit = definedExternally): Request<GetUserPolicyResponse, AWSError>
    open fun listAccessKeys(params: ListAccessKeysRequest, callback: (err: AWSError, data: ListAccessKeysResponse) -> Unit = definedExternally): Request<ListAccessKeysResponse, AWSError>
    open fun listAccessKeys(callback: (err: AWSError, data: ListAccessKeysResponse) -> Unit = definedExternally): Request<ListAccessKeysResponse, AWSError>
    open fun listAccountAliases(params: ListAccountAliasesRequest, callback: (err: AWSError, data: ListAccountAliasesResponse) -> Unit = definedExternally): Request<ListAccountAliasesResponse, AWSError>
    open fun listAccountAliases(callback: (err: AWSError, data: ListAccountAliasesResponse) -> Unit = definedExternally): Request<ListAccountAliasesResponse, AWSError>
    open fun listAttachedGroupPolicies(params: ListAttachedGroupPoliciesRequest, callback: (err: AWSError, data: ListAttachedGroupPoliciesResponse) -> Unit = definedExternally): Request<ListAttachedGroupPoliciesResponse, AWSError>
    open fun listAttachedGroupPolicies(callback: (err: AWSError, data: ListAttachedGroupPoliciesResponse) -> Unit = definedExternally): Request<ListAttachedGroupPoliciesResponse, AWSError>
    open fun listAttachedRolePolicies(params: ListAttachedRolePoliciesRequest, callback: (err: AWSError, data: ListAttachedRolePoliciesResponse) -> Unit = definedExternally): Request<ListAttachedRolePoliciesResponse, AWSError>
    open fun listAttachedRolePolicies(callback: (err: AWSError, data: ListAttachedRolePoliciesResponse) -> Unit = definedExternally): Request<ListAttachedRolePoliciesResponse, AWSError>
    open fun listAttachedUserPolicies(params: ListAttachedUserPoliciesRequest, callback: (err: AWSError, data: ListAttachedUserPoliciesResponse) -> Unit = definedExternally): Request<ListAttachedUserPoliciesResponse, AWSError>
    open fun listAttachedUserPolicies(callback: (err: AWSError, data: ListAttachedUserPoliciesResponse) -> Unit = definedExternally): Request<ListAttachedUserPoliciesResponse, AWSError>
    open fun listEntitiesForPolicy(params: ListEntitiesForPolicyRequest, callback: (err: AWSError, data: ListEntitiesForPolicyResponse) -> Unit = definedExternally): Request<ListEntitiesForPolicyResponse, AWSError>
    open fun listEntitiesForPolicy(callback: (err: AWSError, data: ListEntitiesForPolicyResponse) -> Unit = definedExternally): Request<ListEntitiesForPolicyResponse, AWSError>
    open fun listGroupPolicies(params: ListGroupPoliciesRequest, callback: (err: AWSError, data: ListGroupPoliciesResponse) -> Unit = definedExternally): Request<ListGroupPoliciesResponse, AWSError>
    open fun listGroupPolicies(callback: (err: AWSError, data: ListGroupPoliciesResponse) -> Unit = definedExternally): Request<ListGroupPoliciesResponse, AWSError>
    open fun listGroups(params: ListGroupsRequest, callback: (err: AWSError, data: ListGroupsResponse) -> Unit = definedExternally): Request<ListGroupsResponse, AWSError>
    open fun listGroups(callback: (err: AWSError, data: ListGroupsResponse) -> Unit = definedExternally): Request<ListGroupsResponse, AWSError>
    open fun listGroupsForUser(params: ListGroupsForUserRequest, callback: (err: AWSError, data: ListGroupsForUserResponse) -> Unit = definedExternally): Request<ListGroupsForUserResponse, AWSError>
    open fun listGroupsForUser(callback: (err: AWSError, data: ListGroupsForUserResponse) -> Unit = definedExternally): Request<ListGroupsForUserResponse, AWSError>
    open fun listInstanceProfiles(params: ListInstanceProfilesRequest, callback: (err: AWSError, data: ListInstanceProfilesResponse) -> Unit = definedExternally): Request<ListInstanceProfilesResponse, AWSError>
    open fun listInstanceProfiles(callback: (err: AWSError, data: ListInstanceProfilesResponse) -> Unit = definedExternally): Request<ListInstanceProfilesResponse, AWSError>
    open fun listInstanceProfilesForRole(params: ListInstanceProfilesForRoleRequest, callback: (err: AWSError, data: ListInstanceProfilesForRoleResponse) -> Unit = definedExternally): Request<ListInstanceProfilesForRoleResponse, AWSError>
    open fun listInstanceProfilesForRole(callback: (err: AWSError, data: ListInstanceProfilesForRoleResponse) -> Unit = definedExternally): Request<ListInstanceProfilesForRoleResponse, AWSError>
    open fun listMFADevices(params: ListMFADevicesRequest, callback: (err: AWSError, data: ListMFADevicesResponse) -> Unit = definedExternally): Request<ListMFADevicesResponse, AWSError>
    open fun listMFADevices(callback: (err: AWSError, data: ListMFADevicesResponse) -> Unit = definedExternally): Request<ListMFADevicesResponse, AWSError>
    open fun listOpenIDConnectProviders(params: ListOpenIDConnectProvidersRequest, callback: (err: AWSError, data: ListOpenIDConnectProvidersResponse) -> Unit = definedExternally): Request<ListOpenIDConnectProvidersResponse, AWSError>
    open fun listOpenIDConnectProviders(callback: (err: AWSError, data: ListOpenIDConnectProvidersResponse) -> Unit = definedExternally): Request<ListOpenIDConnectProvidersResponse, AWSError>
    open fun listPolicies(params: ListPoliciesRequest, callback: (err: AWSError, data: ListPoliciesResponse) -> Unit = definedExternally): Request<ListPoliciesResponse, AWSError>
    open fun listPolicies(callback: (err: AWSError, data: ListPoliciesResponse) -> Unit = definedExternally): Request<ListPoliciesResponse, AWSError>
    open fun listPoliciesGrantingServiceAccess(params: ListPoliciesGrantingServiceAccessRequest, callback: (err: AWSError, data: ListPoliciesGrantingServiceAccessResponse) -> Unit = definedExternally): Request<ListPoliciesGrantingServiceAccessResponse, AWSError>
    open fun listPoliciesGrantingServiceAccess(callback: (err: AWSError, data: ListPoliciesGrantingServiceAccessResponse) -> Unit = definedExternally): Request<ListPoliciesGrantingServiceAccessResponse, AWSError>
    open fun listPolicyVersions(params: ListPolicyVersionsRequest, callback: (err: AWSError, data: ListPolicyVersionsResponse) -> Unit = definedExternally): Request<ListPolicyVersionsResponse, AWSError>
    open fun listPolicyVersions(callback: (err: AWSError, data: ListPolicyVersionsResponse) -> Unit = definedExternally): Request<ListPolicyVersionsResponse, AWSError>
    open fun listRolePolicies(params: ListRolePoliciesRequest, callback: (err: AWSError, data: ListRolePoliciesResponse) -> Unit = definedExternally): Request<ListRolePoliciesResponse, AWSError>
    open fun listRolePolicies(callback: (err: AWSError, data: ListRolePoliciesResponse) -> Unit = definedExternally): Request<ListRolePoliciesResponse, AWSError>
    open fun listRoleTags(params: ListRoleTagsRequest, callback: (err: AWSError, data: ListRoleTagsResponse) -> Unit = definedExternally): Request<ListRoleTagsResponse, AWSError>
    open fun listRoleTags(callback: (err: AWSError, data: ListRoleTagsResponse) -> Unit = definedExternally): Request<ListRoleTagsResponse, AWSError>
    open fun listRoles(params: ListRolesRequest, callback: (err: AWSError, data: ListRolesResponse) -> Unit = definedExternally): Request<ListRolesResponse, AWSError>
    open fun listRoles(callback: (err: AWSError, data: ListRolesResponse) -> Unit = definedExternally): Request<ListRolesResponse, AWSError>
    open fun listSAMLProviders(params: ListSAMLProvidersRequest, callback: (err: AWSError, data: ListSAMLProvidersResponse) -> Unit = definedExternally): Request<ListSAMLProvidersResponse, AWSError>
    open fun listSAMLProviders(callback: (err: AWSError, data: ListSAMLProvidersResponse) -> Unit = definedExternally): Request<ListSAMLProvidersResponse, AWSError>
    open fun listSSHPublicKeys(params: ListSSHPublicKeysRequest, callback: (err: AWSError, data: ListSSHPublicKeysResponse) -> Unit = definedExternally): Request<ListSSHPublicKeysResponse, AWSError>
    open fun listSSHPublicKeys(callback: (err: AWSError, data: ListSSHPublicKeysResponse) -> Unit = definedExternally): Request<ListSSHPublicKeysResponse, AWSError>
    open fun listServerCertificates(params: ListServerCertificatesRequest, callback: (err: AWSError, data: ListServerCertificatesResponse) -> Unit = definedExternally): Request<ListServerCertificatesResponse, AWSError>
    open fun listServerCertificates(callback: (err: AWSError, data: ListServerCertificatesResponse) -> Unit = definedExternally): Request<ListServerCertificatesResponse, AWSError>
    open fun listServiceSpecificCredentials(params: ListServiceSpecificCredentialsRequest, callback: (err: AWSError, data: ListServiceSpecificCredentialsResponse) -> Unit = definedExternally): Request<ListServiceSpecificCredentialsResponse, AWSError>
    open fun listServiceSpecificCredentials(callback: (err: AWSError, data: ListServiceSpecificCredentialsResponse) -> Unit = definedExternally): Request<ListServiceSpecificCredentialsResponse, AWSError>
    open fun listSigningCertificates(params: ListSigningCertificatesRequest, callback: (err: AWSError, data: ListSigningCertificatesResponse) -> Unit = definedExternally): Request<ListSigningCertificatesResponse, AWSError>
    open fun listSigningCertificates(callback: (err: AWSError, data: ListSigningCertificatesResponse) -> Unit = definedExternally): Request<ListSigningCertificatesResponse, AWSError>
    open fun listUserPolicies(params: ListUserPoliciesRequest, callback: (err: AWSError, data: ListUserPoliciesResponse) -> Unit = definedExternally): Request<ListUserPoliciesResponse, AWSError>
    open fun listUserPolicies(callback: (err: AWSError, data: ListUserPoliciesResponse) -> Unit = definedExternally): Request<ListUserPoliciesResponse, AWSError>
    open fun listUserTags(params: ListUserTagsRequest, callback: (err: AWSError, data: ListUserTagsResponse) -> Unit = definedExternally): Request<ListUserTagsResponse, AWSError>
    open fun listUserTags(callback: (err: AWSError, data: ListUserTagsResponse) -> Unit = definedExternally): Request<ListUserTagsResponse, AWSError>
    open fun listUsers(params: ListUsersRequest, callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listUsers(callback: (err: AWSError, data: ListUsersResponse) -> Unit = definedExternally): Request<ListUsersResponse, AWSError>
    open fun listVirtualMFADevices(params: ListVirtualMFADevicesRequest, callback: (err: AWSError, data: ListVirtualMFADevicesResponse) -> Unit = definedExternally): Request<ListVirtualMFADevicesResponse, AWSError>
    open fun listVirtualMFADevices(callback: (err: AWSError, data: ListVirtualMFADevicesResponse) -> Unit = definedExternally): Request<ListVirtualMFADevicesResponse, AWSError>
    open fun putGroupPolicy(params: PutGroupPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putGroupPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putRolePermissionsBoundary(params: PutRolePermissionsBoundaryRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putRolePermissionsBoundary(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putRolePolicy(params: PutRolePolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putRolePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putUserPermissionsBoundary(params: PutUserPermissionsBoundaryRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putUserPermissionsBoundary(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putUserPolicy(params: PutUserPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putUserPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeClientIDFromOpenIDConnectProvider(params: RemoveClientIDFromOpenIDConnectProviderRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeClientIDFromOpenIDConnectProvider(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeRoleFromInstanceProfile(params: RemoveRoleFromInstanceProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeRoleFromInstanceProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeUserFromGroup(params: RemoveUserFromGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun removeUserFromGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun resetServiceSpecificCredential(params: ResetServiceSpecificCredentialRequest, callback: (err: AWSError, data: ResetServiceSpecificCredentialResponse) -> Unit = definedExternally): Request<ResetServiceSpecificCredentialResponse, AWSError>
    open fun resetServiceSpecificCredential(callback: (err: AWSError, data: ResetServiceSpecificCredentialResponse) -> Unit = definedExternally): Request<ResetServiceSpecificCredentialResponse, AWSError>
    open fun resyncMFADevice(params: ResyncMFADeviceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun resyncMFADevice(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setDefaultPolicyVersion(params: SetDefaultPolicyVersionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setDefaultPolicyVersion(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setSecurityTokenServicePreferences(params: SetSecurityTokenServicePreferencesRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setSecurityTokenServicePreferences(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun simulateCustomPolicy(params: SimulateCustomPolicyRequest, callback: (err: AWSError, data: SimulatePolicyResponse) -> Unit = definedExternally): Request<SimulatePolicyResponse, AWSError>
    open fun simulateCustomPolicy(callback: (err: AWSError, data: SimulatePolicyResponse) -> Unit = definedExternally): Request<SimulatePolicyResponse, AWSError>
    open fun simulatePrincipalPolicy(params: SimulatePrincipalPolicyRequest, callback: (err: AWSError, data: SimulatePolicyResponse) -> Unit = definedExternally): Request<SimulatePolicyResponse, AWSError>
    open fun simulatePrincipalPolicy(callback: (err: AWSError, data: SimulatePolicyResponse) -> Unit = definedExternally): Request<SimulatePolicyResponse, AWSError>
    open fun tagRole(params: TagRoleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagRole(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagUser(params: TagUserRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagUser(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagRole(params: UntagRoleRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagRole(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagUser(params: UntagUserRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagUser(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAccessKey(params: UpdateAccessKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAccessKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAccountPasswordPolicy(params: UpdateAccountPasswordPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAccountPasswordPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAssumeRolePolicy(params: UpdateAssumeRolePolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAssumeRolePolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateGroup(params: UpdateGroupRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateGroup(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateLoginProfile(params: UpdateLoginProfileRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateLoginProfile(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateOpenIDConnectProviderThumbprint(params: UpdateOpenIDConnectProviderThumbprintRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateOpenIDConnectProviderThumbprint(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateRole(params: UpdateRoleRequest, callback: (err: AWSError, data: UpdateRoleResponse) -> Unit = definedExternally): Request<UpdateRoleResponse, AWSError>
    open fun updateRole(callback: (err: AWSError, data: UpdateRoleResponse) -> Unit = definedExternally): Request<UpdateRoleResponse, AWSError>
    open fun updateRoleDescription(params: UpdateRoleDescriptionRequest, callback: (err: AWSError, data: UpdateRoleDescriptionResponse) -> Unit = definedExternally): Request<UpdateRoleDescriptionResponse, AWSError>
    open fun updateRoleDescription(callback: (err: AWSError, data: UpdateRoleDescriptionResponse) -> Unit = definedExternally): Request<UpdateRoleDescriptionResponse, AWSError>
    open fun updateSAMLProvider(params: UpdateSAMLProviderRequest, callback: (err: AWSError, data: UpdateSAMLProviderResponse) -> Unit = definedExternally): Request<UpdateSAMLProviderResponse, AWSError>
    open fun updateSAMLProvider(callback: (err: AWSError, data: UpdateSAMLProviderResponse) -> Unit = definedExternally): Request<UpdateSAMLProviderResponse, AWSError>
    open fun updateSSHPublicKey(params: UpdateSSHPublicKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateSSHPublicKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateServerCertificate(params: UpdateServerCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateServerCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateServiceSpecificCredential(params: UpdateServiceSpecificCredentialRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateServiceSpecificCredential(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateSigningCertificate(params: UpdateSigningCertificateRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateSigningCertificate(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUser(params: UpdateUserRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateUser(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun uploadSSHPublicKey(params: UploadSSHPublicKeyRequest, callback: (err: AWSError, data: UploadSSHPublicKeyResponse) -> Unit = definedExternally): Request<UploadSSHPublicKeyResponse, AWSError>
    open fun uploadSSHPublicKey(callback: (err: AWSError, data: UploadSSHPublicKeyResponse) -> Unit = definedExternally): Request<UploadSSHPublicKeyResponse, AWSError>
    open fun uploadServerCertificate(params: UploadServerCertificateRequest, callback: (err: AWSError, data: UploadServerCertificateResponse) -> Unit = definedExternally): Request<UploadServerCertificateResponse, AWSError>
    open fun uploadServerCertificate(callback: (err: AWSError, data: UploadServerCertificateResponse) -> Unit = definedExternally): Request<UploadServerCertificateResponse, AWSError>
    open fun uploadSigningCertificate(params: UploadSigningCertificateRequest, callback: (err: AWSError, data: UploadSigningCertificateResponse) -> Unit = definedExternally): Request<UploadSigningCertificateResponse, AWSError>
    open fun uploadSigningCertificate(callback: (err: AWSError, data: UploadSigningCertificateResponse) -> Unit = definedExternally): Request<UploadSigningCertificateResponse, AWSError>
    open fun waitFor(state: String /* "instanceProfileExists" */, params: GetInstanceProfileRequest /* IAM.Types.GetInstanceProfileRequest & `T$0` */, callback: (err: AWSError, data: GetInstanceProfileResponse) -> Unit = definedExternally): Request<GetInstanceProfileResponse, AWSError>
    open fun waitFor(state: String /* "instanceProfileExists" */, callback: (err: AWSError, data: GetInstanceProfileResponse) -> Unit = definedExternally): Request<GetInstanceProfileResponse, AWSError>
    open fun waitFor(state: String /* "userExists" */, params: GetUserRequest /* IAM.Types.GetUserRequest & `T$0` */, callback: (err: AWSError, data: GetUserResponse) -> Unit = definedExternally): Request<GetUserResponse, AWSError>
    open fun waitFor(state: String /* "userExists" */, callback: (err: AWSError, data: GetUserResponse) -> Unit = definedExternally): Request<GetUserResponse, AWSError>
    open fun waitFor(state: String /* "roleExists" */, params: GetRoleRequest /* IAM.Types.GetRoleRequest & `T$0` */, callback: (err: AWSError, data: GetRoleResponse) -> Unit = definedExternally): Request<GetRoleResponse, AWSError>
    open fun waitFor(state: String /* "roleExists" */, callback: (err: AWSError, data: GetRoleResponse) -> Unit = definedExternally): Request<GetRoleResponse, AWSError>
    open fun waitFor(state: String /* "policyExists" */, params: GetPolicyRequest /* IAM.Types.GetPolicyRequest & `T$0` */, callback: (err: AWSError, data: GetPolicyResponse) -> Unit = definedExternally): Request<GetPolicyResponse, AWSError>
    open fun waitFor(state: String /* "policyExists" */, callback: (err: AWSError, data: GetPolicyResponse) -> Unit = definedExternally): Request<GetPolicyResponse, AWSError>
    interface AccessDetail {
        var ServiceName: serviceNameType
        var ServiceNamespace: serviceNamespaceType
        var Region: stringType?
            get() = definedExternally
            set(value) = definedExternally
        var EntityPath: organizationsEntityPathType?
            get() = definedExternally
            set(value) = definedExternally
        var LastAuthenticatedTime: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var TotalAuthenticatedEntities: integerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccessKey {
        var UserName: userNameType
        var AccessKeyId: accessKeyIdType
        var Status: String /* "Active" | "Inactive" | String */
        var SecretAccessKey: accessKeySecretType
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccessKeyLastUsed {
        var LastUsedDate: dateType
        var ServiceName: stringType
        var Region: stringType
    }
    interface AccessKeyMetadata {
        var UserName: userNameType?
            get() = definedExternally
            set(value) = definedExternally
        var AccessKeyId: accessKeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "Active" | "Inactive" | String */
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AddClientIDToOpenIDConnectProviderRequest {
        var OpenIDConnectProviderArn: arnType
        var ClientID: clientIDType
    }
    interface AddRoleToInstanceProfileRequest {
        var InstanceProfileName: instanceProfileNameType
        var RoleName: roleNameType
    }
    interface AddUserToGroupRequest {
        var GroupName: groupNameType
        var UserName: existingUserNameType
    }
    interface AttachGroupPolicyRequest {
        var GroupName: groupNameType
        var PolicyArn: arnType
    }
    interface AttachRolePolicyRequest {
        var RoleName: roleNameType
        var PolicyArn: arnType
    }
    interface AttachUserPolicyRequest {
        var UserName: userNameType
        var PolicyArn: arnType
    }
    interface AttachedPermissionsBoundary {
        var PermissionsBoundaryType: String /* "PermissionsBoundaryPolicy" | String */
        var PermissionsBoundaryArn: arnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttachedPolicy {
        var PolicyName: policyNameType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyArn: arnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChangePasswordRequest {
        var OldPassword: passwordType
        var NewPassword: passwordType
    }
    interface ContextEntry {
        var ContextKeyName: ContextKeyNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ContextKeyValues: ContextKeyValueListType?
            get() = definedExternally
            set(value) = definedExternally
        var ContextKeyType: String /* "string" | "stringList" | "numeric" | "numericList" | "boolean" | "booleanList" | "ip" | "ipList" | "binary" | "binaryList" | "date" | "dateList" | String */
    }
    interface CreateAccessKeyRequest {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAccessKeyResponse {
        var AccessKey: AccessKey
    }
    interface CreateAccountAliasRequest {
        var AccountAlias: accountAliasType
    }
    interface CreateGroupRequest {
        var Path: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var GroupName: groupNameType
    }
    interface CreateGroupResponse {
        var Group: Group
    }
    interface CreateInstanceProfileRequest {
        var InstanceProfileName: instanceProfileNameType
        var Path: pathType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateInstanceProfileResponse {
        var InstanceProfile: InstanceProfile
    }
    interface CreateLoginProfileRequest {
        var UserName: userNameType
        var Password: passwordType
        var PasswordResetRequired: booleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLoginProfileResponse {
        var LoginProfile: LoginProfile
    }
    interface CreateOpenIDConnectProviderRequest {
        var Url: OpenIDConnectProviderUrlType
        var ClientIDList: clientIDListType?
            get() = definedExternally
            set(value) = definedExternally
        var ThumbprintList: thumbprintListType
    }
    interface CreateOpenIDConnectProviderResponse {
        var OpenIDConnectProviderArn: arnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePolicyRequest {
        var PolicyName: policyNameType
        var Path: policyPathType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyDocument: policyDocumentType
        var Description: policyDescriptionType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePolicyResponse {
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePolicyVersionRequest {
        var PolicyArn: arnType
        var PolicyDocument: policyDocumentType
        var SetAsDefault: booleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePolicyVersionResponse {
        var PolicyVersion: PolicyVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRoleRequest {
        var Path: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleName: roleNameType
        var AssumeRolePolicyDocument: policyDocumentType
        var Description: roleDescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSessionDuration: roleMaxSessionDurationType?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsBoundary: arnType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: tagListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRoleResponse {
        var Role: Role
    }
    interface CreateSAMLProviderRequest {
        var SAMLMetadataDocument: SAMLMetadataDocumentType
        var Name: SAMLProviderNameType
    }
    interface CreateSAMLProviderResponse {
        var SAMLProviderArn: arnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateServiceLinkedRoleRequest {
        var AWSServiceName: groupNameType
        var Description: roleDescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var CustomSuffix: customSuffixType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateServiceLinkedRoleResponse {
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateServiceSpecificCredentialRequest {
        var UserName: userNameType
        var ServiceName: serviceName
    }
    interface CreateServiceSpecificCredentialResponse {
        var ServiceSpecificCredential: ServiceSpecificCredential?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserRequest {
        var Path: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: userNameType
        var PermissionsBoundary: arnType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: tagListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserResponse {
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVirtualMFADeviceRequest {
        var Path: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var VirtualMFADeviceName: virtualMFADeviceName
    }
    interface CreateVirtualMFADeviceResponse {
        var VirtualMFADevice: VirtualMFADevice
    }
    interface DeactivateMFADeviceRequest {
        var UserName: existingUserNameType
        var SerialNumber: serialNumberType
    }
    interface DeleteAccessKeyRequest {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
        var AccessKeyId: accessKeyIdType
    }
    interface DeleteAccountAliasRequest {
        var AccountAlias: accountAliasType
    }
    interface DeleteGroupPolicyRequest {
        var GroupName: groupNameType
        var PolicyName: policyNameType
    }
    interface DeleteGroupRequest {
        var GroupName: groupNameType
    }
    interface DeleteInstanceProfileRequest {
        var InstanceProfileName: instanceProfileNameType
    }
    interface DeleteLoginProfileRequest {
        var UserName: userNameType
    }
    interface DeleteOpenIDConnectProviderRequest {
        var OpenIDConnectProviderArn: arnType
    }
    interface DeletePolicyRequest {
        var PolicyArn: arnType
    }
    interface DeletePolicyVersionRequest {
        var PolicyArn: arnType
        var VersionId: policyVersionIdType
    }
    interface DeleteRolePermissionsBoundaryRequest {
        var RoleName: roleNameType
    }
    interface DeleteRolePolicyRequest {
        var RoleName: roleNameType
        var PolicyName: policyNameType
    }
    interface DeleteRoleRequest {
        var RoleName: roleNameType
    }
    interface DeleteSAMLProviderRequest {
        var SAMLProviderArn: arnType
    }
    interface DeleteSSHPublicKeyRequest {
        var UserName: userNameType
        var SSHPublicKeyId: publicKeyIdType
    }
    interface DeleteServerCertificateRequest {
        var ServerCertificateName: serverCertificateNameType
    }
    interface DeleteServiceLinkedRoleRequest {
        var RoleName: roleNameType
    }
    interface DeleteServiceLinkedRoleResponse {
        var DeletionTaskId: DeletionTaskIdType
    }
    interface DeleteServiceSpecificCredentialRequest {
        var UserName: userNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceSpecificCredentialId: serviceSpecificCredentialId
    }
    interface DeleteSigningCertificateRequest {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateId: certificateIdType
    }
    interface DeleteUserPermissionsBoundaryRequest {
        var UserName: userNameType
    }
    interface DeleteUserPolicyRequest {
        var UserName: existingUserNameType
        var PolicyName: policyNameType
    }
    interface DeleteUserRequest {
        var UserName: existingUserNameType
    }
    interface DeleteVirtualMFADeviceRequest {
        var SerialNumber: serialNumberType
    }
    interface DeletionTaskFailureReasonType {
        var Reason: ReasonType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleUsageList: RoleUsageListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetachGroupPolicyRequest {
        var GroupName: groupNameType
        var PolicyArn: arnType
    }
    interface DetachRolePolicyRequest {
        var RoleName: roleNameType
        var PolicyArn: arnType
    }
    interface DetachUserPolicyRequest {
        var UserName: userNameType
        var PolicyArn: arnType
    }
    interface EnableMFADeviceRequest {
        var UserName: existingUserNameType
        var SerialNumber: serialNumberType
        var AuthenticationCode1: authenticationCodeType
        var AuthenticationCode2: authenticationCodeType
    }
    interface EntityDetails {
        var EntityInfo: EntityInfo
        var LastAuthenticated: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EntityInfo {
        var Arn: arnType
        var Name: userNameType
        var Type: String /* "USER" | "ROLE" | "GROUP" | String */
        var Id: idType
        var Path: pathType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorDetails {
        var Message: stringType
        var Code: stringType
    }
    interface EvalDecisionDetailsType {
        @nativeGetter
        operator fun get(key: String): String /* "allowed" | "explicitDeny" | "implicitDeny" | String */
        @nativeSetter
        operator fun set(key: String, value: String)
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface EvaluationResult {
        var EvalActionName: ActionNameType
        var EvalResourceName: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var EvalDecision: String /* "allowed" | "explicitDeny" | "implicitDeny" | String */
        var MatchedStatements: StatementListType?
            get() = definedExternally
            set(value) = definedExternally
        var MissingContextValues: ContextKeyNamesResultListType?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationsDecisionDetail: OrganizationsDecisionDetail?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsBoundaryDecisionDetail: PermissionsBoundaryDecisionDetail?
            get() = definedExternally
            set(value) = definedExternally
        var EvalDecisionDetails: EvalDecisionDetailsType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceSpecificResults: ResourceSpecificResultListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateCredentialReportResponse {
        var State: String /* "STARTED" | "INPROGRESS" | "COMPLETE" | String */
        var Description: ReportStateDescriptionType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateOrganizationsAccessReportRequest {
        var EntityPath: organizationsEntityPathType
        var OrganizationsPolicyId: organizationsPolicyIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateOrganizationsAccessReportResponse {
        var JobId: jobIDType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateServiceLastAccessedDetailsRequest {
        var Arn: arnType
    }
    interface GenerateServiceLastAccessedDetailsResponse {
        var JobId: jobIDType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccessKeyLastUsedRequest {
        var AccessKeyId: accessKeyIdType
    }
    interface GetAccessKeyLastUsedResponse {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
        var AccessKeyLastUsed: AccessKeyLastUsed?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccountAuthorizationDetailsRequest {
        var Filter: entityListType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccountAuthorizationDetailsResponse {
        var UserDetailList: userDetailListType?
            get() = definedExternally
            set(value) = definedExternally
        var GroupDetailList: groupDetailListType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleDetailList: roleDetailListType?
            get() = definedExternally
            set(value) = definedExternally
        var Policies: ManagedPolicyDetailListType?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAccountPasswordPolicyResponse {
        var PasswordPolicy: PasswordPolicy
    }
    interface GetAccountSummaryResponse {
        var SummaryMap: summaryMapType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetContextKeysForCustomPolicyRequest {
        var PolicyInputList: SimulationPolicyListType
    }
    interface GetContextKeysForPolicyResponse {
        var ContextKeyNames: ContextKeyNamesResultListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetContextKeysForPrincipalPolicyRequest {
        var PolicySourceArn: arnType
        var PolicyInputList: SimulationPolicyListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCredentialReportResponse {
        var Content: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var ReportFormat: String /* "text/csv" | String */
        var GeneratedTime: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupPolicyRequest {
        var GroupName: groupNameType
        var PolicyName: policyNameType
    }
    interface GetGroupPolicyResponse {
        var GroupName: groupNameType
        var PolicyName: policyNameType
        var PolicyDocument: policyDocumentType
    }
    interface GetGroupRequest {
        var GroupName: groupNameType
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetGroupResponse {
        var Group: Group
        var Users: userListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetInstanceProfileRequest {
        var InstanceProfileName: instanceProfileNameType
    }
    interface GetInstanceProfileResponse {
        var InstanceProfile: InstanceProfile
    }
    interface GetLoginProfileRequest {
        var UserName: userNameType
    }
    interface GetLoginProfileResponse {
        var LoginProfile: LoginProfile
    }
    interface GetOpenIDConnectProviderRequest {
        var OpenIDConnectProviderArn: arnType
    }
    interface GetOpenIDConnectProviderResponse {
        var Url: OpenIDConnectProviderUrlType?
            get() = definedExternally
            set(value) = definedExternally
        var ClientIDList: clientIDListType?
            get() = definedExternally
            set(value) = definedExternally
        var ThumbprintList: thumbprintListType?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOrganizationsAccessReportRequest {
        var JobId: jobIDType
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var SortKey: String /* "SERVICE_NAMESPACE_ASCENDING" | "SERVICE_NAMESPACE_DESCENDING" | "LAST_AUTHENTICATED_TIME_ASCENDING" | "LAST_AUTHENTICATED_TIME_DESCENDING" | String */
    }
    interface GetOrganizationsAccessReportResponse {
        var JobStatus: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | String */
        var JobCreationDate: dateType
        var JobCompletionDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfServicesAccessible: integerType?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfServicesNotAccessed: integerType?
            get() = definedExternally
            set(value) = definedExternally
        var AccessDetails: AccessDetails?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetails: ErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPolicyRequest {
        var PolicyArn: arnType
    }
    interface GetPolicyResponse {
        var Policy: Policy?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPolicyVersionRequest {
        var PolicyArn: arnType
        var VersionId: policyVersionIdType
    }
    interface GetPolicyVersionResponse {
        var PolicyVersion: PolicyVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRolePolicyRequest {
        var RoleName: roleNameType
        var PolicyName: policyNameType
    }
    interface GetRolePolicyResponse {
        var RoleName: roleNameType
        var PolicyName: policyNameType
        var PolicyDocument: policyDocumentType
    }
    interface GetRoleRequest {
        var RoleName: roleNameType
    }
    interface GetRoleResponse {
        var Role: Role
    }
    interface GetSAMLProviderRequest {
        var SAMLProviderArn: arnType
    }
    interface GetSAMLProviderResponse {
        var SAMLMetadataDocument: SAMLMetadataDocumentType?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var ValidUntil: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSSHPublicKeyRequest {
        var UserName: userNameType
        var SSHPublicKeyId: publicKeyIdType
        var Encoding: String /* "SSH" | "PEM" | String */
    }
    interface GetSSHPublicKeyResponse {
        var SSHPublicKey: SSHPublicKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServerCertificateRequest {
        var ServerCertificateName: serverCertificateNameType
    }
    interface GetServerCertificateResponse {
        var ServerCertificate: ServerCertificate
    }
    interface GetServiceLastAccessedDetailsRequest {
        var JobId: jobIDType
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceLastAccessedDetailsResponse {
        var JobStatus: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | String */
        var JobCreationDate: dateType
        var ServicesLastAccessed: ServicesLastAccessed
        var JobCompletionDate: dateType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Error: ErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceLastAccessedDetailsWithEntitiesRequest {
        var JobId: jobIDType
        var ServiceNamespace: serviceNamespaceType
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceLastAccessedDetailsWithEntitiesResponse {
        var JobStatus: String /* "IN_PROGRESS" | "COMPLETED" | "FAILED" | String */
        var JobCreationDate: dateType
        var JobCompletionDate: dateType
        var EntityDetailsList: entityDetailsListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Error: ErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServiceLinkedRoleDeletionStatusRequest {
        var DeletionTaskId: DeletionTaskIdType
    }
    interface GetServiceLinkedRoleDeletionStatusResponse {
        var Status: String /* "SUCCEEDED" | "IN_PROGRESS" | "FAILED" | "NOT_STARTED" | String */
        var Reason: DeletionTaskFailureReasonType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUserPolicyRequest {
        var UserName: existingUserNameType
        var PolicyName: policyNameType
    }
    interface GetUserPolicyResponse {
        var UserName: existingUserNameType
        var PolicyName: policyNameType
        var PolicyDocument: policyDocumentType
    }
    interface GetUserRequest {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUserResponse {
        var User: User
    }
    interface Group {
        var Path: pathType
        var GroupName: groupNameType
        var GroupId: idType
        var Arn: arnType
        var CreateDate: dateType
    }
    interface GroupDetail {
        var Path: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var GroupName: groupNameType?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: idType?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: arnType?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var GroupPolicyList: policyDetailListType?
            get() = definedExternally
            set(value) = definedExternally
        var AttachedManagedPolicies: attachedPoliciesListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceProfile {
        var Path: pathType
        var InstanceProfileName: instanceProfileNameType
        var InstanceProfileId: idType
        var Arn: arnType
        var CreateDate: dateType
        var Roles: roleListType
    }
    interface ListAccessKeysRequest {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccessKeysResponse {
        var AccessKeyMetadata: accessKeyMetadataListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountAliasesRequest {
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountAliasesResponse {
        var AccountAliases: accountAliasListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttachedGroupPoliciesRequest {
        var GroupName: groupNameType
        var PathPrefix: policyPathType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttachedGroupPoliciesResponse {
        var AttachedPolicies: attachedPoliciesListType?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttachedRolePoliciesRequest {
        var RoleName: roleNameType
        var PathPrefix: policyPathType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttachedRolePoliciesResponse {
        var AttachedPolicies: attachedPoliciesListType?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttachedUserPoliciesRequest {
        var UserName: userNameType
        var PathPrefix: policyPathType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAttachedUserPoliciesResponse {
        var AttachedPolicies: attachedPoliciesListType?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntitiesForPolicyRequest {
        var PolicyArn: arnType
        var EntityFilter: String /* "User" | "Role" | "Group" | "LocalManagedPolicy" | "AWSManagedPolicy" | String */
        var PathPrefix: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyUsageFilter: String /* "PermissionsPolicy" | "PermissionsBoundary" | String */
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntitiesForPolicyResponse {
        var PolicyGroups: PolicyGroupListType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyUsers: PolicyUserListType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyRoles: PolicyRoleListType?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupPoliciesRequest {
        var GroupName: groupNameType
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupPoliciesResponse {
        var PolicyNames: policyNameListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsForUserRequest {
        var UserName: existingUserNameType
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsForUserResponse {
        var Groups: groupListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsRequest {
        var PathPrefix: pathPrefixType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGroupsResponse {
        var Groups: groupListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstanceProfilesForRoleRequest {
        var RoleName: roleNameType
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstanceProfilesForRoleResponse {
        var InstanceProfiles: instanceProfileListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstanceProfilesRequest {
        var PathPrefix: pathPrefixType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListInstanceProfilesResponse {
        var InstanceProfiles: instanceProfileListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMFADevicesRequest {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMFADevicesResponse {
        var MFADevices: mfaDeviceListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListOpenIDConnectProvidersRequest
    interface ListOpenIDConnectProvidersResponse {
        var OpenIDConnectProviderList: OpenIDConnectProviderListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesGrantingServiceAccessEntry {
        var ServiceNamespace: serviceNamespaceType?
            get() = definedExternally
            set(value) = definedExternally
        var Policies: policyGrantingServiceAccessListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesGrantingServiceAccessRequest {
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: arnType
        var ServiceNamespaces: serviceNamespaceListType
    }
    interface ListPoliciesGrantingServiceAccessResponse {
        var PoliciesGrantingServiceAccess: listPolicyGrantingServiceAccessResponseListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesRequest {
        var Scope: String /* "All" | "AWS" | "Local" | String */
        var OnlyAttached: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var PathPrefix: policyPathType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyUsageFilter: String /* "PermissionsPolicy" | "PermissionsBoundary" | String */
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPoliciesResponse {
        var Policies: policyListType?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPolicyVersionsRequest {
        var PolicyArn: arnType
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPolicyVersionsResponse {
        var Versions: policyDocumentVersionListType?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRolePoliciesRequest {
        var RoleName: roleNameType
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRolePoliciesResponse {
        var PolicyNames: policyNameListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRoleTagsRequest {
        var RoleName: roleNameType
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRoleTagsResponse {
        var Tags: tagListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRolesRequest {
        var PathPrefix: pathPrefixType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRolesResponse {
        var Roles: roleListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSAMLProvidersRequest
    interface ListSAMLProvidersResponse {
        var SAMLProviderList: SAMLProviderListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSSHPublicKeysRequest {
        var UserName: userNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSSHPublicKeysResponse {
        var SSHPublicKeys: SSHPublicKeyListType?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServerCertificatesRequest {
        var PathPrefix: pathPrefixType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServerCertificatesResponse {
        var ServerCertificateMetadataList: serverCertificateMetadataListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServiceSpecificCredentialsRequest {
        var UserName: userNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceName: serviceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServiceSpecificCredentialsResponse {
        var ServiceSpecificCredentials: ServiceSpecificCredentialsListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSigningCertificatesRequest {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSigningCertificatesResponse {
        var Certificates: certificateListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserPoliciesRequest {
        var UserName: existingUserNameType
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserPoliciesResponse {
        var PolicyNames: policyNameListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserTagsRequest {
        var UserName: existingUserNameType
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUserTagsResponse {
        var Tags: tagListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersRequest {
        var PathPrefix: pathPrefixType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListUsersResponse {
        var Users: userListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVirtualMFADevicesRequest {
        var AssignmentStatus: String /* "Assigned" | "Unassigned" | "Any" | String */
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListVirtualMFADevicesResponse {
        var VirtualMFADevices: virtualMFADeviceListType
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoginProfile {
        var UserName: userNameType
        var CreateDate: dateType
        var PasswordResetRequired: booleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MFADevice {
        var UserName: userNameType
        var SerialNumber: serialNumberType
        var EnableDate: dateType
    }
    interface ManagedPolicyDetail {
        var PolicyName: policyNameType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyId: idType?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: arnType?
            get() = definedExternally
            set(value) = definedExternally
        var Path: policyPathType?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultVersionId: policyVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var AttachmentCount: attachmentCountType?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsBoundaryUsageCount: attachmentCountType?
            get() = definedExternally
            set(value) = definedExternally
        var IsAttachable: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: policyDescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyVersionList: policyDocumentVersionListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OpenIDConnectProviderListEntry {
        var Arn: arnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OrganizationsDecisionDetail {
        var AllowedByOrganizations: booleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PasswordPolicy {
        var MinimumPasswordLength: minimumPasswordLengthType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireSymbols: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireNumbers: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireUppercaseCharacters: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireLowercaseCharacters: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowUsersToChangePassword: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirePasswords: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxPasswordAge: maxPasswordAgeType?
            get() = definedExternally
            set(value) = definedExternally
        var PasswordReusePrevention: passwordReusePreventionType?
            get() = definedExternally
            set(value) = definedExternally
        var HardExpiry: booleanObjectType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PermissionsBoundaryDecisionDetail {
        var AllowedByPermissionsBoundary: booleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Policy {
        var PolicyName: policyNameType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyId: idType?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: arnType?
            get() = definedExternally
            set(value) = definedExternally
        var Path: policyPathType?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultVersionId: policyVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var AttachmentCount: attachmentCountType?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsBoundaryUsageCount: attachmentCountType?
            get() = definedExternally
            set(value) = definedExternally
        var IsAttachable: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: policyDescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyDetail {
        var PolicyName: policyNameType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyDocument: policyDocumentType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyGrantingServiceAccess {
        var PolicyName: policyNameType
        var PolicyType: String /* "INLINE" | "MANAGED" | String */
        var PolicyArn: arnType?
            get() = definedExternally
            set(value) = definedExternally
        var EntityType: String /* "USER" | "ROLE" | "GROUP" | String */
        var EntityName: entityNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyGroup {
        var GroupName: groupNameType?
            get() = definedExternally
            set(value) = definedExternally
        var GroupId: idType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyRole {
        var RoleName: roleNameType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleId: idType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyUser {
        var UserName: userNameType?
            get() = definedExternally
            set(value) = definedExternally
        var UserId: idType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyVersion {
        var Document: policyDocumentType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: policyVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var IsDefaultVersion: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Position {
        var Line: LineNumber?
            get() = definedExternally
            set(value) = definedExternally
        var Column: ColumnNumber?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutGroupPolicyRequest {
        var GroupName: groupNameType
        var PolicyName: policyNameType
        var PolicyDocument: policyDocumentType
    }
    interface PutRolePermissionsBoundaryRequest {
        var RoleName: roleNameType
        var PermissionsBoundary: arnType
    }
    interface PutRolePolicyRequest {
        var RoleName: roleNameType
        var PolicyName: policyNameType
        var PolicyDocument: policyDocumentType
    }
    interface PutUserPermissionsBoundaryRequest {
        var UserName: userNameType
        var PermissionsBoundary: arnType
    }
    interface PutUserPolicyRequest {
        var UserName: existingUserNameType
        var PolicyName: policyNameType
        var PolicyDocument: policyDocumentType
    }
    interface RemoveClientIDFromOpenIDConnectProviderRequest {
        var OpenIDConnectProviderArn: arnType
        var ClientID: clientIDType
    }
    interface RemoveRoleFromInstanceProfileRequest {
        var InstanceProfileName: instanceProfileNameType
        var RoleName: roleNameType
    }
    interface RemoveUserFromGroupRequest {
        var GroupName: groupNameType
        var UserName: existingUserNameType
    }
    interface ResetServiceSpecificCredentialRequest {
        var UserName: userNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceSpecificCredentialId: serviceSpecificCredentialId
    }
    interface ResetServiceSpecificCredentialResponse {
        var ServiceSpecificCredential: ServiceSpecificCredential?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceSpecificResult {
        var EvalResourceName: ResourceNameType
        var EvalResourceDecision: String /* "allowed" | "explicitDeny" | "implicitDeny" | String */
        var MatchedStatements: StatementListType?
            get() = definedExternally
            set(value) = definedExternally
        var MissingContextValues: ContextKeyNamesResultListType?
            get() = definedExternally
            set(value) = definedExternally
        var EvalDecisionDetails: EvalDecisionDetailsType?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsBoundaryDecisionDetail: PermissionsBoundaryDecisionDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResyncMFADeviceRequest {
        var UserName: existingUserNameType
        var SerialNumber: serialNumberType
        var AuthenticationCode1: authenticationCodeType
        var AuthenticationCode2: authenticationCodeType
    }
    interface Role {
        var Path: pathType
        var RoleName: roleNameType
        var RoleId: idType
        var Arn: arnType
        var CreateDate: dateType
        var AssumeRolePolicyDocument: policyDocumentType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: roleDescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSessionDuration: roleMaxSessionDurationType?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsBoundary: AttachedPermissionsBoundary?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: tagListType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleLastUsed: RoleLastUsed?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoleDetail {
        var Path: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleName: roleNameType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleId: idType?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: arnType?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var AssumeRolePolicyDocument: policyDocumentType?
            get() = definedExternally
            set(value) = definedExternally
        var InstanceProfileList: instanceProfileListType?
            get() = definedExternally
            set(value) = definedExternally
        var RolePolicyList: policyDetailListType?
            get() = definedExternally
            set(value) = definedExternally
        var AttachedManagedPolicies: attachedPoliciesListType?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsBoundary: AttachedPermissionsBoundary?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: tagListType?
            get() = definedExternally
            set(value) = definedExternally
        var RoleLastUsed: RoleLastUsed?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoleLastUsed {
        var LastUsedDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var Region: stringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoleUsageType {
        var Region: RegionNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Resources: ArnListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SAMLProviderListEntry {
        var Arn: arnType?
            get() = definedExternally
            set(value) = definedExternally
        var ValidUntil: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SSHPublicKey {
        var UserName: userNameType
        var SSHPublicKeyId: publicKeyIdType
        var Fingerprint: publicKeyFingerprintType
        var SSHPublicKeyBody: publicKeyMaterialType
        var Status: String /* "Active" | "Inactive" | String */
        var UploadDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SSHPublicKeyMetadata {
        var UserName: userNameType
        var SSHPublicKeyId: publicKeyIdType
        var Status: String /* "Active" | "Inactive" | String */
        var UploadDate: dateType
    }
    interface ServerCertificate {
        var ServerCertificateMetadata: ServerCertificateMetadata
        var CertificateBody: certificateBodyType
        var CertificateChain: certificateChainType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerCertificateMetadata {
        var Path: pathType
        var ServerCertificateName: serverCertificateNameType
        var ServerCertificateId: idType
        var Arn: arnType
        var UploadDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var Expiration: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceLastAccessed {
        var ServiceName: serviceNameType
        var LastAuthenticated: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceNamespace: serviceNamespaceType
        var LastAuthenticatedEntity: arnType?
            get() = definedExternally
            set(value) = definedExternally
        var TotalAuthenticatedEntities: integerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServiceSpecificCredential {
        var CreateDate: dateType
        var ServiceName: serviceName
        var ServiceUserName: serviceUserName
        var ServicePassword: servicePassword
        var ServiceSpecificCredentialId: serviceSpecificCredentialId
        var UserName: userNameType
        var Status: String /* "Active" | "Inactive" | String */
    }
    interface ServiceSpecificCredentialMetadata {
        var UserName: userNameType
        var Status: String /* "Active" | "Inactive" | String */
        var ServiceUserName: serviceUserName
        var CreateDate: dateType
        var ServiceSpecificCredentialId: serviceSpecificCredentialId
        var ServiceName: serviceName
    }
    interface SetDefaultPolicyVersionRequest {
        var PolicyArn: arnType
        var VersionId: policyVersionIdType
    }
    interface SetSecurityTokenServicePreferencesRequest {
        var GlobalEndpointTokenVersion: String /* "v1Token" | "v2Token" | String */
    }
    interface SigningCertificate {
        var UserName: userNameType
        var CertificateId: certificateIdType
        var CertificateBody: certificateBodyType
        var Status: String /* "Active" | "Inactive" | String */
        var UploadDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimulateCustomPolicyRequest {
        var PolicyInputList: SimulationPolicyListType
        var PermissionsBoundaryPolicyInputList: SimulationPolicyListType?
            get() = definedExternally
            set(value) = definedExternally
        var ActionNames: ActionNameListType
        var ResourceArns: ResourceNameListType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourcePolicy: policyDocumentType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceOwner: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var CallerArn: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ContextEntries: ContextEntryListType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceHandlingOption: ResourceHandlingOptionType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimulatePolicyResponse {
        var EvaluationResults: EvaluationResultsListType?
            get() = definedExternally
            set(value) = definedExternally
        var IsTruncated: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: responseMarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimulatePrincipalPolicyRequest {
        var PolicySourceArn: arnType
        var PolicyInputList: SimulationPolicyListType?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsBoundaryPolicyInputList: SimulationPolicyListType?
            get() = definedExternally
            set(value) = definedExternally
        var ActionNames: ActionNameListType
        var ResourceArns: ResourceNameListType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourcePolicy: policyDocumentType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceOwner: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var CallerArn: ResourceNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ContextEntries: ContextEntryListType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceHandlingOption: ResourceHandlingOptionType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxItems: maxItemsType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: markerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Statement {
        var SourcePolicyId: PolicyIdentifierType?
            get() = definedExternally
            set(value) = definedExternally
        var SourcePolicyType: String /* "user" | "group" | "role" | "aws-managed" | "user-managed" | "resource" | "none" | String */
        var StartPosition: Position?
            get() = definedExternally
            set(value) = definedExternally
        var EndPosition: Position?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: tagKeyType
        var Value: tagValueType
    }
    interface TagRoleRequest {
        var RoleName: roleNameType
        var Tags: tagListType
    }
    interface TagUserRequest {
        var UserName: existingUserNameType
        var Tags: tagListType
    }
    interface UntagRoleRequest {
        var RoleName: roleNameType
        var TagKeys: tagKeyListType
    }
    interface UntagUserRequest {
        var UserName: existingUserNameType
        var TagKeys: tagKeyListType
    }
    interface UpdateAccessKeyRequest {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
        var AccessKeyId: accessKeyIdType
        var Status: String /* "Active" | "Inactive" | String */
    }
    interface UpdateAccountPasswordPolicyRequest {
        var MinimumPasswordLength: minimumPasswordLengthType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireSymbols: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireNumbers: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireUppercaseCharacters: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireLowercaseCharacters: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var AllowUsersToChangePassword: booleanType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxPasswordAge: maxPasswordAgeType?
            get() = definedExternally
            set(value) = definedExternally
        var PasswordReusePrevention: passwordReusePreventionType?
            get() = definedExternally
            set(value) = definedExternally
        var HardExpiry: booleanObjectType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAssumeRolePolicyRequest {
        var RoleName: roleNameType
        var PolicyDocument: policyDocumentType
    }
    interface UpdateGroupRequest {
        var GroupName: groupNameType
        var NewPath: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var NewGroupName: groupNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLoginProfileRequest {
        var UserName: userNameType
        var Password: passwordType?
            get() = definedExternally
            set(value) = definedExternally
        var PasswordResetRequired: booleanObjectType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateOpenIDConnectProviderThumbprintRequest {
        var OpenIDConnectProviderArn: arnType
        var ThumbprintList: thumbprintListType
    }
    interface UpdateRoleDescriptionRequest {
        var RoleName: roleNameType
        var Description: roleDescriptionType
    }
    interface UpdateRoleDescriptionResponse {
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRoleRequest {
        var RoleName: roleNameType
        var Description: roleDescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var MaxSessionDuration: roleMaxSessionDurationType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRoleResponse
    interface UpdateSAMLProviderRequest {
        var SAMLMetadataDocument: SAMLMetadataDocumentType
        var SAMLProviderArn: arnType
    }
    interface UpdateSAMLProviderResponse {
        var SAMLProviderArn: arnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSSHPublicKeyRequest {
        var UserName: userNameType
        var SSHPublicKeyId: publicKeyIdType
        var Status: String /* "Active" | "Inactive" | String */
    }
    interface UpdateServerCertificateRequest {
        var ServerCertificateName: serverCertificateNameType
        var NewPath: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var NewServerCertificateName: serverCertificateNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateServiceSpecificCredentialRequest {
        var UserName: userNameType?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceSpecificCredentialId: serviceSpecificCredentialId
        var Status: String /* "Active" | "Inactive" | String */
    }
    interface UpdateSigningCertificateRequest {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateId: certificateIdType
        var Status: String /* "Active" | "Inactive" | String */
    }
    interface UpdateUserRequest {
        var UserName: existingUserNameType
        var NewPath: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var NewUserName: userNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UploadSSHPublicKeyRequest {
        var UserName: userNameType
        var SSHPublicKeyBody: publicKeyMaterialType
    }
    interface UploadSSHPublicKeyResponse {
        var SSHPublicKey: SSHPublicKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UploadServerCertificateRequest {
        var Path: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var ServerCertificateName: serverCertificateNameType
        var CertificateBody: certificateBodyType
        var PrivateKey: privateKeyType
        var CertificateChain: certificateChainType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UploadServerCertificateResponse {
        var ServerCertificateMetadata: ServerCertificateMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UploadSigningCertificateRequest {
        var UserName: existingUserNameType?
            get() = definedExternally
            set(value) = definedExternally
        var CertificateBody: certificateBodyType
    }
    interface UploadSigningCertificateResponse {
        var Certificate: SigningCertificate
    }
    interface User {
        var Path: pathType
        var UserName: userNameType
        var UserId: idType
        var Arn: arnType
        var CreateDate: dateType
        var PasswordLastUsed: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsBoundary: AttachedPermissionsBoundary?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: tagListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserDetail {
        var Path: pathType?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: userNameType?
            get() = definedExternally
            set(value) = definedExternally
        var UserId: idType?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: arnType?
            get() = definedExternally
            set(value) = definedExternally
        var CreateDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
        var UserPolicyList: policyDetailListType?
            get() = definedExternally
            set(value) = definedExternally
        var GroupList: groupNameListType?
            get() = definedExternally
            set(value) = definedExternally
        var AttachedManagedPolicies: attachedPoliciesListType?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsBoundary: AttachedPermissionsBoundary?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: tagListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VirtualMFADevice {
        var SerialNumber: serialNumberType
        var Base32StringSeed: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var QRCodePNG: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var User: User?
            get() = definedExternally
            set(value) = definedExternally
        var EnableDate: dateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface summaryMapType {
        @nativeGetter
        operator fun get(key: String): summaryValueType?
        @nativeSetter
        operator fun set(key: String, value: summaryValueType)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2010-05-08" | "latest" | String */
    }
}