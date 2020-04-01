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
import CognitoIdentity.CognitoIdentityProvider
import CognitoIdentity.IdentityDescription
import CognitoIdentity.IdentityPoolShortDescription
import CognitoIdentity.MappingRule
import CognitoIdentity.UnprocessedIdentityId
import CognitoIdentity.CreateIdentityPoolInput
import CognitoIdentity.IdentityPool
import CognitoIdentity.DeleteIdentitiesInput
import CognitoIdentity.DeleteIdentitiesResponse
import CognitoIdentity.DeleteIdentityPoolInput
import CognitoIdentity.DescribeIdentityInput
import CognitoIdentity.DescribeIdentityPoolInput
import CognitoIdentity.GetCredentialsForIdentityInput
import CognitoIdentity.GetCredentialsForIdentityResponse
import CognitoIdentity.GetIdInput
import CognitoIdentity.GetIdResponse
import CognitoIdentity.GetIdentityPoolRolesInput
import CognitoIdentity.GetIdentityPoolRolesResponse
import CognitoIdentity.GetOpenIdTokenInput
import CognitoIdentity.GetOpenIdTokenResponse
import CognitoIdentity.GetOpenIdTokenForDeveloperIdentityInput
import CognitoIdentity.GetOpenIdTokenForDeveloperIdentityResponse
import CognitoIdentity.ListIdentitiesInput
import CognitoIdentity.ListIdentitiesResponse
import CognitoIdentity.ListIdentityPoolsInput
import CognitoIdentity.ListIdentityPoolsResponse
import CognitoIdentity.ListTagsForResourceInput
import CognitoIdentity.ListTagsForResourceResponse
import CognitoIdentity.LookupDeveloperIdentityInput
import CognitoIdentity.LookupDeveloperIdentityResponse
import CognitoIdentity.MergeDeveloperIdentitiesInput
import CognitoIdentity.MergeDeveloperIdentitiesResponse
import CognitoIdentity.SetIdentityPoolRolesInput
import CognitoIdentity.TagResourceInput
import CognitoIdentity.TagResourceResponse
import CognitoIdentity.UnlinkDeveloperIdentityInput
import CognitoIdentity.UnlinkIdentityInput
import CognitoIdentity.UntagResourceInput
import CognitoIdentity.UntagResourceResponse
import CognitoIdentity.IdentityProviders
import CognitoIdentity.IdentityPoolTagsType
import CognitoIdentity.LoginsMap
import CognitoIdentity.Credentials
import CognitoIdentity.RolesMap
import CognitoIdentity.RoleMappingMap
import CognitoIdentity.RulesConfigurationType
import CognitoIdentity.RoleMapping

typealias ARNString = String

typealias AccessKeyString = String

typealias AccountId = String

typealias ClaimName = String

typealias ClaimValue = String

typealias ClassicFlow = Boolean

typealias CognitoIdentityProviderClientId = String

typealias CognitoIdentityProviderList = Array<CognitoIdentityProvider>

typealias CognitoIdentityProviderName = String

typealias CognitoIdentityProviderTokenCheck = Boolean

typealias DateType = Date

typealias DeveloperProviderName = String

typealias DeveloperUserIdentifier = String

typealias DeveloperUserIdentifierList = Array<DeveloperUserIdentifier>

typealias HideDisabled = Boolean

typealias IdentitiesList = Array<IdentityDescription>

typealias IdentityId = String

typealias IdentityIdList = Array<IdentityId>

typealias IdentityPoolId = String

typealias IdentityPoolName = String

typealias IdentityPoolTagsListType = Array<TagKeysType>

typealias IdentityPoolUnauthenticated = Boolean

typealias IdentityPoolsList = Array<IdentityPoolShortDescription>

typealias IdentityProviderId = String

typealias IdentityProviderName = String

typealias IdentityProviderToken = String

typealias LoginsList = Array<IdentityProviderName>

typealias MappingRulesList = Array<MappingRule>

typealias OIDCProviderList = Array<ARNString>

typealias OIDCToken = String

typealias PaginationKey = String

typealias QueryLimit = Number

typealias RoleType = String

typealias SAMLProviderList = Array<ARNString>

typealias SecretKeyString = String

typealias SessionTokenString = String

typealias TagKeysType = String

typealias TagValueType = String

typealias TokenDuration = Number

typealias UnprocessedIdentityIdList = Array<UnprocessedIdentityId>

@JsModule("aws-sdk")
external open class CognitoIdentity(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CognitoIdentity.Types.ClientConfiguration */
    open fun createIdentityPool(params: CreateIdentityPoolInput, callback: (err: AWSError, data: IdentityPool) -> Unit = definedExternally): Request<IdentityPool, AWSError>
    open fun createIdentityPool(callback: (err: AWSError, data: IdentityPool) -> Unit = definedExternally): Request<IdentityPool, AWSError>
    open fun deleteIdentities(params: DeleteIdentitiesInput, callback: (err: AWSError, data: DeleteIdentitiesResponse) -> Unit = definedExternally): Request<DeleteIdentitiesResponse, AWSError>
    open fun deleteIdentities(callback: (err: AWSError, data: DeleteIdentitiesResponse) -> Unit = definedExternally): Request<DeleteIdentitiesResponse, AWSError>
    open fun deleteIdentityPool(params: DeleteIdentityPoolInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIdentityPool(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeIdentity(params: DescribeIdentityInput, callback: (err: AWSError, data: IdentityDescription) -> Unit = definedExternally): Request<IdentityDescription, AWSError>
    open fun describeIdentity(callback: (err: AWSError, data: IdentityDescription) -> Unit = definedExternally): Request<IdentityDescription, AWSError>
    open fun describeIdentityPool(params: DescribeIdentityPoolInput, callback: (err: AWSError, data: IdentityPool) -> Unit = definedExternally): Request<IdentityPool, AWSError>
    open fun describeIdentityPool(callback: (err: AWSError, data: IdentityPool) -> Unit = definedExternally): Request<IdentityPool, AWSError>
    open fun getCredentialsForIdentity(params: GetCredentialsForIdentityInput, callback: (err: AWSError, data: GetCredentialsForIdentityResponse) -> Unit = definedExternally): Request<GetCredentialsForIdentityResponse, AWSError>
    open fun getCredentialsForIdentity(callback: (err: AWSError, data: GetCredentialsForIdentityResponse) -> Unit = definedExternally): Request<GetCredentialsForIdentityResponse, AWSError>
    open fun getId(params: GetIdInput, callback: (err: AWSError, data: GetIdResponse) -> Unit = definedExternally): Request<GetIdResponse, AWSError>
    open fun getId(callback: (err: AWSError, data: GetIdResponse) -> Unit = definedExternally): Request<GetIdResponse, AWSError>
    open fun getIdentityPoolRoles(params: GetIdentityPoolRolesInput, callback: (err: AWSError, data: GetIdentityPoolRolesResponse) -> Unit = definedExternally): Request<GetIdentityPoolRolesResponse, AWSError>
    open fun getIdentityPoolRoles(callback: (err: AWSError, data: GetIdentityPoolRolesResponse) -> Unit = definedExternally): Request<GetIdentityPoolRolesResponse, AWSError>
    open fun getOpenIdToken(params: GetOpenIdTokenInput, callback: (err: AWSError, data: GetOpenIdTokenResponse) -> Unit = definedExternally): Request<GetOpenIdTokenResponse, AWSError>
    open fun getOpenIdToken(callback: (err: AWSError, data: GetOpenIdTokenResponse) -> Unit = definedExternally): Request<GetOpenIdTokenResponse, AWSError>
    open fun getOpenIdTokenForDeveloperIdentity(params: GetOpenIdTokenForDeveloperIdentityInput, callback: (err: AWSError, data: GetOpenIdTokenForDeveloperIdentityResponse) -> Unit = definedExternally): Request<GetOpenIdTokenForDeveloperIdentityResponse, AWSError>
    open fun getOpenIdTokenForDeveloperIdentity(callback: (err: AWSError, data: GetOpenIdTokenForDeveloperIdentityResponse) -> Unit = definedExternally): Request<GetOpenIdTokenForDeveloperIdentityResponse, AWSError>
    open fun listIdentities(params: ListIdentitiesInput, callback: (err: AWSError, data: ListIdentitiesResponse) -> Unit = definedExternally): Request<ListIdentitiesResponse, AWSError>
    open fun listIdentities(callback: (err: AWSError, data: ListIdentitiesResponse) -> Unit = definedExternally): Request<ListIdentitiesResponse, AWSError>
    open fun listIdentityPools(params: ListIdentityPoolsInput, callback: (err: AWSError, data: ListIdentityPoolsResponse) -> Unit = definedExternally): Request<ListIdentityPoolsResponse, AWSError>
    open fun listIdentityPools(callback: (err: AWSError, data: ListIdentityPoolsResponse) -> Unit = definedExternally): Request<ListIdentityPoolsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun lookupDeveloperIdentity(params: LookupDeveloperIdentityInput, callback: (err: AWSError, data: LookupDeveloperIdentityResponse) -> Unit = definedExternally): Request<LookupDeveloperIdentityResponse, AWSError>
    open fun lookupDeveloperIdentity(callback: (err: AWSError, data: LookupDeveloperIdentityResponse) -> Unit = definedExternally): Request<LookupDeveloperIdentityResponse, AWSError>
    open fun mergeDeveloperIdentities(params: MergeDeveloperIdentitiesInput, callback: (err: AWSError, data: MergeDeveloperIdentitiesResponse) -> Unit = definedExternally): Request<MergeDeveloperIdentitiesResponse, AWSError>
    open fun mergeDeveloperIdentities(callback: (err: AWSError, data: MergeDeveloperIdentitiesResponse) -> Unit = definedExternally): Request<MergeDeveloperIdentitiesResponse, AWSError>
    open fun setIdentityPoolRoles(params: SetIdentityPoolRolesInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setIdentityPoolRoles(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun unlinkDeveloperIdentity(params: UnlinkDeveloperIdentityInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unlinkDeveloperIdentity(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unlinkIdentity(params: UnlinkIdentityInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun unlinkIdentity(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateIdentityPool(params: IdentityPool, callback: (err: AWSError, data: IdentityPool) -> Unit = definedExternally): Request<IdentityPool, AWSError>
    open fun updateIdentityPool(callback: (err: AWSError, data: IdentityPool) -> Unit = definedExternally): Request<IdentityPool, AWSError>
    interface CognitoIdentityProvider {
        var ProviderName: CognitoIdentityProviderName?
            get() = definedExternally
            set(value) = definedExternally
        var ClientId: CognitoIdentityProviderClientId?
            get() = definedExternally
            set(value) = definedExternally
        var ServerSideTokenCheck: CognitoIdentityProviderTokenCheck?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIdentityPoolInput {
        var IdentityPoolName: IdentityPoolName
        var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
        var AllowClassicFlow: ClassicFlow?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedLoginProviders: IdentityProviders?
            get() = definedExternally
            set(value) = definedExternally
        var DeveloperProviderName: DeveloperProviderName?
            get() = definedExternally
            set(value) = definedExternally
        var OpenIdConnectProviderARNs: OIDCProviderList?
            get() = definedExternally
            set(value) = definedExternally
        var CognitoIdentityProviders: CognitoIdentityProviderList?
            get() = definedExternally
            set(value) = definedExternally
        var SamlProviderARNs: SAMLProviderList?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityPoolTags: IdentityPoolTagsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Credentials {
        var AccessKeyId: AccessKeyString?
            get() = definedExternally
            set(value) = definedExternally
        var SecretKey: SecretKeyString?
            get() = definedExternally
            set(value) = definedExternally
        var SessionToken: SessionTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var Expiration: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteIdentitiesInput {
        var IdentityIdsToDelete: IdentityIdList
    }
    interface DeleteIdentitiesResponse {
        var UnprocessedIdentityIds: UnprocessedIdentityIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteIdentityPoolInput {
        var IdentityPoolId: IdentityPoolId
    }
    interface DescribeIdentityInput {
        var IdentityId: IdentityId
    }
    interface DescribeIdentityPoolInput {
        var IdentityPoolId: IdentityPoolId
    }
    interface GetCredentialsForIdentityInput {
        var IdentityId: IdentityId
        var Logins: LoginsMap?
            get() = definedExternally
            set(value) = definedExternally
        var CustomRoleArn: ARNString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCredentialsForIdentityResponse {
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
        var Credentials: Credentials?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIdInput {
        var AccountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityPoolId: IdentityPoolId
        var Logins: LoginsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIdResponse {
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIdentityPoolRolesInput {
        var IdentityPoolId: IdentityPoolId
    }
    interface GetIdentityPoolRolesResponse {
        var IdentityPoolId: IdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var Roles: RolesMap?
            get() = definedExternally
            set(value) = definedExternally
        var RoleMappings: RoleMappingMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOpenIdTokenForDeveloperIdentityInput {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
        var Logins: LoginsMap
        var TokenDuration: TokenDuration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOpenIdTokenForDeveloperIdentityResponse {
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
        var Token: OIDCToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOpenIdTokenInput {
        var IdentityId: IdentityId
        var Logins: LoginsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOpenIdTokenResponse {
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
        var Token: OIDCToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityDescription {
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
        var Logins: LoginsList?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityPool {
        var IdentityPoolId: IdentityPoolId
        var IdentityPoolName: IdentityPoolName
        var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
        var AllowClassicFlow: ClassicFlow?
            get() = definedExternally
            set(value) = definedExternally
        var SupportedLoginProviders: IdentityProviders?
            get() = definedExternally
            set(value) = definedExternally
        var DeveloperProviderName: DeveloperProviderName?
            get() = definedExternally
            set(value) = definedExternally
        var OpenIdConnectProviderARNs: OIDCProviderList?
            get() = definedExternally
            set(value) = definedExternally
        var CognitoIdentityProviders: CognitoIdentityProviderList?
            get() = definedExternally
            set(value) = definedExternally
        var SamlProviderARNs: SAMLProviderList?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityPoolTags: IdentityPoolTagsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityPoolShortDescription {
        var IdentityPoolId: IdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityPoolName: IdentityPoolName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityPoolTagsType {
        @nativeGetter
        operator fun get(key: String): TagValueType?
        @nativeSetter
        operator fun set(key: String, value: TagValueType)
    }
    interface IdentityProviders {
        @nativeGetter
        operator fun get(key: String): IdentityProviderId?
        @nativeSetter
        operator fun set(key: String, value: IdentityProviderId)
    }
    interface ListIdentitiesInput {
        var IdentityPoolId: IdentityPoolId
        var MaxResults: QueryLimit
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
        var HideDisabled: HideDisabled?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIdentitiesResponse {
        var IdentityPoolId: IdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var Identities: IdentitiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIdentityPoolsInput {
        var MaxResults: QueryLimit
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIdentityPoolsResponse {
        var IdentityPools: IdentityPoolsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var ResourceArn: ARNString
    }
    interface ListTagsForResourceResponse {
        var Tags: IdentityPoolTagsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoginsMap {
        @nativeGetter
        operator fun get(key: String): IdentityProviderToken?
        @nativeSetter
        operator fun set(key: String, value: IdentityProviderToken)
    }
    interface LookupDeveloperIdentityInput {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
        var DeveloperUserIdentifier: DeveloperUserIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: QueryLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LookupDeveloperIdentityResponse {
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
        var DeveloperUserIdentifierList: DeveloperUserIdentifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MappingRule {
        var Claim: ClaimName
        var MatchType: String /* "Equals" | "Contains" | "StartsWith" | "NotEqual" | String */
        var Value: ClaimValue
        var RoleARN: ARNString
    }
    interface MergeDeveloperIdentitiesInput {
        var SourceUserIdentifier: DeveloperUserIdentifier
        var DestinationUserIdentifier: DeveloperUserIdentifier
        var DeveloperProviderName: DeveloperProviderName
        var IdentityPoolId: IdentityPoolId
    }
    interface MergeDeveloperIdentitiesResponse {
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoleMapping {
        var Type: String /* "Token" | "Rules" | String */
        var AmbiguousRoleResolution: String /* "AuthenticatedRole" | "Deny" | String */
        var RulesConfiguration: RulesConfigurationType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoleMappingMap {
        @nativeGetter
        operator fun get(key: String): RoleMapping?
        @nativeSetter
        operator fun set(key: String, value: RoleMapping)
    }
    interface RolesMap {
        @nativeGetter
        operator fun get(key: String): ARNString?
        @nativeSetter
        operator fun set(key: String, value: ARNString)
    }
    interface RulesConfigurationType {
        var Rules: MappingRulesList
    }
    interface SetIdentityPoolRolesInput {
        var IdentityPoolId: IdentityPoolId
        var Roles: RolesMap
        var RoleMappings: RoleMappingMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceInput {
        var ResourceArn: ARNString
        var Tags: IdentityPoolTagsType
    }
    interface TagResourceResponse
    interface UnlinkDeveloperIdentityInput {
        var IdentityId: IdentityId
        var IdentityPoolId: IdentityPoolId
        var DeveloperProviderName: DeveloperProviderName
        var DeveloperUserIdentifier: DeveloperUserIdentifier
    }
    interface UnlinkIdentityInput {
        var IdentityId: IdentityId
        var Logins: LoginsMap
        var LoginsToRemove: LoginsList
    }
    interface UnprocessedIdentityId {
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "AccessDenied" | "InternalServerError" | String */
    }
    interface UntagResourceInput {
        var ResourceArn: ARNString
        var TagKeys: IdentityPoolTagsListType
    }
    interface UntagResourceResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2014-06-30" | "latest" | String */
    }
}