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
import SSO.AccountInfo
import SSO.RoleInfo
import SSO.GetRoleCredentialsRequest
import SSO.GetRoleCredentialsResponse
import SSO.ListAccountRolesRequest
import SSO.ListAccountRolesResponse
import SSO.ListAccountsRequest
import SSO.ListAccountsResponse
import SSO.LogoutRequest
import SSO.RoleCredentials

typealias AccessKeyType = String

typealias AccessTokenType = String

typealias AccountIdType = String

typealias AccountListType = Array<AccountInfo>

typealias AccountNameType = String

typealias EmailAddressType = String

typealias ExpirationTimestampType = Number

typealias MaxResultType = Number

typealias NextTokenType = String

typealias RoleListType = Array<RoleInfo>

typealias RoleNameType = String

typealias SecretAccessKeyType = String

typealias SessionTokenType = String

@JsModule("aws-sdk")
external open class SSO(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SSO.Types.ClientConfiguration */
    open fun getRoleCredentials(params: GetRoleCredentialsRequest, callback: (err: AWSError, data: GetRoleCredentialsResponse) -> Unit = definedExternally): Request<GetRoleCredentialsResponse, AWSError>
    open fun getRoleCredentials(callback: (err: AWSError, data: GetRoleCredentialsResponse) -> Unit = definedExternally): Request<GetRoleCredentialsResponse, AWSError>
    open fun listAccountRoles(params: ListAccountRolesRequest, callback: (err: AWSError, data: ListAccountRolesResponse) -> Unit = definedExternally): Request<ListAccountRolesResponse, AWSError>
    open fun listAccountRoles(callback: (err: AWSError, data: ListAccountRolesResponse) -> Unit = definedExternally): Request<ListAccountRolesResponse, AWSError>
    open fun listAccounts(params: ListAccountsRequest, callback: (err: AWSError, data: ListAccountsResponse) -> Unit = definedExternally): Request<ListAccountsResponse, AWSError>
    open fun listAccounts(callback: (err: AWSError, data: ListAccountsResponse) -> Unit = definedExternally): Request<ListAccountsResponse, AWSError>
    open fun logout(params: LogoutRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun logout(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface AccountInfo {
        var accountId: AccountIdType?
            get() = definedExternally
            set(value) = definedExternally
        var accountName: AccountNameType?
            get() = definedExternally
            set(value) = definedExternally
        var emailAddress: EmailAddressType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRoleCredentialsRequest {
        var roleName: RoleNameType
        var accountId: AccountIdType
        var accessToken: AccessTokenType
    }
    interface GetRoleCredentialsResponse {
        var roleCredentials: RoleCredentials?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountRolesRequest {
        var nextToken: NextTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResultType?
            get() = definedExternally
            set(value) = definedExternally
        var accessToken: AccessTokenType
        var accountId: AccountIdType
    }
    interface ListAccountRolesResponse {
        var nextToken: NextTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var roleList: RoleListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAccountsRequest {
        var nextToken: NextTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResultType?
            get() = definedExternally
            set(value) = definedExternally
        var accessToken: AccessTokenType
    }
    interface ListAccountsResponse {
        var nextToken: NextTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var accountList: AccountListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LogoutRequest {
        var accessToken: AccessTokenType
    }
    interface RoleCredentials {
        var accessKeyId: AccessKeyType?
            get() = definedExternally
            set(value) = definedExternally
        var secretAccessKey: SecretAccessKeyType?
            get() = definedExternally
            set(value) = definedExternally
        var sessionToken: SessionTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var expiration: ExpirationTimestampType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RoleInfo {
        var roleName: RoleNameType?
            get() = definedExternally
            set(value) = definedExternally
        var accountId: AccountIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-06-10" | "latest" | String */
    }
}