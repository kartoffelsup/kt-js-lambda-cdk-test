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
import STS.PolicyDescriptorType
import STS.Tag
import STS.AssumeRoleRequest
import STS.AssumeRoleResponse
import STS.AssumeRoleWithSAMLRequest
import STS.AssumeRoleWithSAMLResponse
import STS.AssumeRoleWithWebIdentityRequest
import STS.AssumeRoleWithWebIdentityResponse
import STS.DecodeAuthorizationMessageRequest
import STS.DecodeAuthorizationMessageResponse
import STS.GetAccessKeyInfoRequest
import STS.GetAccessKeyInfoResponse
import STS.GetCallerIdentityRequest
import STS.GetCallerIdentityResponse
import STS.GetFederationTokenRequest
import STS.GetFederationTokenResponse
import STS.GetSessionTokenRequest
import STS.GetSessionTokenResponse
import STS.Credentials
import STS.AssumedRoleUser
import STS.FederatedUser

typealias Audience = String

typealias Issuer = String

typealias NameQualifier = String

typealias SAMLAssertionType = String

typealias Subject = String

typealias SubjectType = String

typealias accessKeyIdType = String

typealias accessKeySecretType = String

typealias accountType = String

typealias arnType = String

typealias assumedRoleIdType = String

typealias clientTokenType = String

typealias dateType = Date

typealias decodedMessageType = String

typealias durationSecondsType = Number

typealias encodedMessageType = String

typealias externalIdType = String

typealias federatedIdType = String

typealias nonNegativeIntegerType = Number

typealias policyDescriptorListType = Array<PolicyDescriptorType>

typealias roleDurationSecondsType = Number

typealias roleSessionNameType = String

typealias serialNumberType = String

typealias sessionPolicyDocumentType = String

typealias tagKeyListType = Array<tagKeyType>

typealias tagKeyType = String

typealias tagListType = Array<Tag>

typealias tagValueType = String

typealias tokenCodeType = String

typealias tokenType = String

typealias urlType = String

typealias userIdType = String

typealias userNameType = String

typealias webIdentitySubjectType = String

@JsModule("aws-sdk")
external open class STS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & STS.Types.ClientConfiguration */
    open fun assumeRole(params: AssumeRoleRequest, callback: (err: AWSError, data: AssumeRoleResponse) -> Unit = definedExternally): Request<AssumeRoleResponse, AWSError>
    open fun assumeRole(callback: (err: AWSError, data: AssumeRoleResponse) -> Unit = definedExternally): Request<AssumeRoleResponse, AWSError>
    open fun assumeRoleWithSAML(params: AssumeRoleWithSAMLRequest, callback: (err: AWSError, data: AssumeRoleWithSAMLResponse) -> Unit = definedExternally): Request<AssumeRoleWithSAMLResponse, AWSError>
    open fun assumeRoleWithSAML(callback: (err: AWSError, data: AssumeRoleWithSAMLResponse) -> Unit = definedExternally): Request<AssumeRoleWithSAMLResponse, AWSError>
    open fun assumeRoleWithWebIdentity(params: AssumeRoleWithWebIdentityRequest, callback: (err: AWSError, data: AssumeRoleWithWebIdentityResponse) -> Unit = definedExternally): Request<AssumeRoleWithWebIdentityResponse, AWSError>
    open fun assumeRoleWithWebIdentity(callback: (err: AWSError, data: AssumeRoleWithWebIdentityResponse) -> Unit = definedExternally): Request<AssumeRoleWithWebIdentityResponse, AWSError>
    open fun decodeAuthorizationMessage(params: DecodeAuthorizationMessageRequest, callback: (err: AWSError, data: DecodeAuthorizationMessageResponse) -> Unit = definedExternally): Request<DecodeAuthorizationMessageResponse, AWSError>
    open fun decodeAuthorizationMessage(callback: (err: AWSError, data: DecodeAuthorizationMessageResponse) -> Unit = definedExternally): Request<DecodeAuthorizationMessageResponse, AWSError>
    open fun getAccessKeyInfo(params: GetAccessKeyInfoRequest, callback: (err: AWSError, data: GetAccessKeyInfoResponse) -> Unit = definedExternally): Request<GetAccessKeyInfoResponse, AWSError>
    open fun getAccessKeyInfo(callback: (err: AWSError, data: GetAccessKeyInfoResponse) -> Unit = definedExternally): Request<GetAccessKeyInfoResponse, AWSError>
    open fun getCallerIdentity(params: GetCallerIdentityRequest, callback: (err: AWSError, data: GetCallerIdentityResponse) -> Unit = definedExternally): Request<GetCallerIdentityResponse, AWSError>
    open fun getCallerIdentity(callback: (err: AWSError, data: GetCallerIdentityResponse) -> Unit = definedExternally): Request<GetCallerIdentityResponse, AWSError>
    open fun getFederationToken(params: GetFederationTokenRequest, callback: (err: AWSError, data: GetFederationTokenResponse) -> Unit = definedExternally): Request<GetFederationTokenResponse, AWSError>
    open fun getFederationToken(callback: (err: AWSError, data: GetFederationTokenResponse) -> Unit = definedExternally): Request<GetFederationTokenResponse, AWSError>
    open fun getSessionToken(params: GetSessionTokenRequest, callback: (err: AWSError, data: GetSessionTokenResponse) -> Unit = definedExternally): Request<GetSessionTokenResponse, AWSError>
    open fun getSessionToken(callback: (err: AWSError, data: GetSessionTokenResponse) -> Unit = definedExternally): Request<GetSessionTokenResponse, AWSError>
    interface AssumeRoleRequest {
        var RoleArn: arnType
        var RoleSessionName: roleSessionNameType
        var PolicyArns: policyDescriptorListType?
            get() = definedExternally
            set(value) = definedExternally
        var Policy: sessionPolicyDocumentType?
            get() = definedExternally
            set(value) = definedExternally
        var DurationSeconds: roleDurationSecondsType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: tagListType?
            get() = definedExternally
            set(value) = definedExternally
        var TransitiveTagKeys: tagKeyListType?
            get() = definedExternally
            set(value) = definedExternally
        var ExternalId: externalIdType?
            get() = definedExternally
            set(value) = definedExternally
        var SerialNumber: serialNumberType?
            get() = definedExternally
            set(value) = definedExternally
        var TokenCode: tokenCodeType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssumeRoleResponse {
        var Credentials: Credentials?
            get() = definedExternally
            set(value) = definedExternally
        var AssumedRoleUser: AssumedRoleUser?
            get() = definedExternally
            set(value) = definedExternally
        var PackedPolicySize: nonNegativeIntegerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssumeRoleWithSAMLRequest {
        var RoleArn: arnType
        var PrincipalArn: arnType
        var SAMLAssertion: SAMLAssertionType
        var PolicyArns: policyDescriptorListType?
            get() = definedExternally
            set(value) = definedExternally
        var Policy: sessionPolicyDocumentType?
            get() = definedExternally
            set(value) = definedExternally
        var DurationSeconds: roleDurationSecondsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssumeRoleWithSAMLResponse {
        var Credentials: Credentials?
            get() = definedExternally
            set(value) = definedExternally
        var AssumedRoleUser: AssumedRoleUser?
            get() = definedExternally
            set(value) = definedExternally
        var PackedPolicySize: nonNegativeIntegerType?
            get() = definedExternally
            set(value) = definedExternally
        var Subject: Subject?
            get() = definedExternally
            set(value) = definedExternally
        var SubjectType: SubjectType?
            get() = definedExternally
            set(value) = definedExternally
        var Issuer: Issuer?
            get() = definedExternally
            set(value) = definedExternally
        var Audience: Audience?
            get() = definedExternally
            set(value) = definedExternally
        var NameQualifier: NameQualifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssumeRoleWithWebIdentityRequest {
        var RoleArn: arnType
        var RoleSessionName: roleSessionNameType
        var WebIdentityToken: clientTokenType
        var ProviderId: urlType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyArns: policyDescriptorListType?
            get() = definedExternally
            set(value) = definedExternally
        var Policy: sessionPolicyDocumentType?
            get() = definedExternally
            set(value) = definedExternally
        var DurationSeconds: roleDurationSecondsType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssumeRoleWithWebIdentityResponse {
        var Credentials: Credentials?
            get() = definedExternally
            set(value) = definedExternally
        var SubjectFromWebIdentityToken: webIdentitySubjectType?
            get() = definedExternally
            set(value) = definedExternally
        var AssumedRoleUser: AssumedRoleUser?
            get() = definedExternally
            set(value) = definedExternally
        var PackedPolicySize: nonNegativeIntegerType?
            get() = definedExternally
            set(value) = definedExternally
        var Provider: Issuer?
            get() = definedExternally
            set(value) = definedExternally
        var Audience: Audience?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssumedRoleUser {
        var AssumedRoleId: assumedRoleIdType
        var Arn: arnType
    }
    interface Credentials {
        var AccessKeyId: accessKeyIdType
        var SecretAccessKey: accessKeySecretType
        var SessionToken: tokenType
        var Expiration: dateType
    }
    interface DecodeAuthorizationMessageRequest {
        var EncodedMessage: encodedMessageType
    }
    interface DecodeAuthorizationMessageResponse {
        var DecodedMessage: decodedMessageType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FederatedUser {
        var FederatedUserId: federatedIdType
        var Arn: arnType
    }
    interface GetAccessKeyInfoRequest {
        var AccessKeyId: accessKeyIdType
    }
    interface GetAccessKeyInfoResponse {
        var Account: accountType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCallerIdentityRequest
    interface GetCallerIdentityResponse {
        var UserId: userIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Account: accountType?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: arnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFederationTokenRequest {
        var Name: userNameType
        var Policy: sessionPolicyDocumentType?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyArns: policyDescriptorListType?
            get() = definedExternally
            set(value) = definedExternally
        var DurationSeconds: durationSecondsType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: tagListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetFederationTokenResponse {
        var Credentials: Credentials?
            get() = definedExternally
            set(value) = definedExternally
        var FederatedUser: FederatedUser?
            get() = definedExternally
            set(value) = definedExternally
        var PackedPolicySize: nonNegativeIntegerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSessionTokenRequest {
        var DurationSeconds: durationSecondsType?
            get() = definedExternally
            set(value) = definedExternally
        var SerialNumber: serialNumberType?
            get() = definedExternally
            set(value) = definedExternally
        var TokenCode: tokenCodeType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSessionTokenResponse {
        var Credentials: Credentials?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PolicyDescriptorType {
        var arn: arnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: tagKeyType
        var Value: tagValueType
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2011-06-15" | "latest" | String */
    }
}