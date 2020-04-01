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
import SSOOIDC.CreateTokenRequest
import SSOOIDC.CreateTokenResponse
import SSOOIDC.RegisterClientRequest
import SSOOIDC.RegisterClientResponse
import SSOOIDC.StartDeviceAuthorizationRequest
import SSOOIDC.StartDeviceAuthorizationResponse

typealias AccessToken = String

typealias AuthCode = String

typealias ClientId = String

typealias ClientName = String

typealias ClientSecret = String

typealias ClientType = String

typealias DeviceCode = String

typealias ExpirationInSeconds = Number

typealias GrantType = String

typealias IdToken = String

typealias IntervalInSeconds = Number

typealias LongTimeStampType = Number

typealias RefreshToken = String

typealias Scope = String

typealias Scopes = Array<Scope>

typealias TokenType = String

typealias URI = String

typealias UserCode = String

@JsModule("aws-sdk")
external open class SSOOIDC(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SSOOIDC.Types.ClientConfiguration */
    open fun createToken(params: CreateTokenRequest, callback: (err: AWSError, data: CreateTokenResponse) -> Unit = definedExternally): Request<CreateTokenResponse, AWSError>
    open fun createToken(callback: (err: AWSError, data: CreateTokenResponse) -> Unit = definedExternally): Request<CreateTokenResponse, AWSError>
    open fun registerClient(params: RegisterClientRequest, callback: (err: AWSError, data: RegisterClientResponse) -> Unit = definedExternally): Request<RegisterClientResponse, AWSError>
    open fun registerClient(callback: (err: AWSError, data: RegisterClientResponse) -> Unit = definedExternally): Request<RegisterClientResponse, AWSError>
    open fun startDeviceAuthorization(params: StartDeviceAuthorizationRequest, callback: (err: AWSError, data: StartDeviceAuthorizationResponse) -> Unit = definedExternally): Request<StartDeviceAuthorizationResponse, AWSError>
    open fun startDeviceAuthorization(callback: (err: AWSError, data: StartDeviceAuthorizationResponse) -> Unit = definedExternally): Request<StartDeviceAuthorizationResponse, AWSError>
    interface CreateTokenRequest {
        var clientId: ClientId
        var clientSecret: ClientSecret
        var grantType: GrantType
        var deviceCode: DeviceCode
        var code: AuthCode?
            get() = definedExternally
            set(value) = definedExternally
        var refreshToken: RefreshToken?
            get() = definedExternally
            set(value) = definedExternally
        var scope: Scopes?
            get() = definedExternally
            set(value) = definedExternally
        var redirectUri: URI?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTokenResponse {
        var accessToken: AccessToken?
            get() = definedExternally
            set(value) = definedExternally
        var tokenType: TokenType?
            get() = definedExternally
            set(value) = definedExternally
        var expiresIn: ExpirationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var refreshToken: RefreshToken?
            get() = definedExternally
            set(value) = definedExternally
        var idToken: IdToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterClientRequest {
        var clientName: ClientName
        var clientType: ClientType
        var scopes: Scopes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterClientResponse {
        var clientId: ClientId?
            get() = definedExternally
            set(value) = definedExternally
        var clientSecret: ClientSecret?
            get() = definedExternally
            set(value) = definedExternally
        var clientIdIssuedAt: LongTimeStampType?
            get() = definedExternally
            set(value) = definedExternally
        var clientSecretExpiresAt: LongTimeStampType?
            get() = definedExternally
            set(value) = definedExternally
        var authorizationEndpoint: URI?
            get() = definedExternally
            set(value) = definedExternally
        var tokenEndpoint: URI?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDeviceAuthorizationRequest {
        var clientId: ClientId
        var clientSecret: ClientSecret
        var startUrl: URI
    }
    interface StartDeviceAuthorizationResponse {
        var deviceCode: DeviceCode?
            get() = definedExternally
            set(value) = definedExternally
        var userCode: UserCode?
            get() = definedExternally
            set(value) = definedExternally
        var verificationUri: URI?
            get() = definedExternally
            set(value) = definedExternally
        var verificationUriComplete: URI?
            get() = definedExternally
            set(value) = definedExternally
        var expiresIn: ExpirationInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var interval: IntervalInSeconds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-06-10" | "latest" | String */
    }
}