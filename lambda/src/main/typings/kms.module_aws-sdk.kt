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
import KMS.AliasListEntry
import KMS.CustomKeyStoresListEntry
import KMS.GrantListEntry
import KMS.KeyListEntry
import KMS.Tag
import KMS.CancelKeyDeletionRequest
import KMS.CancelKeyDeletionResponse
import KMS.ConnectCustomKeyStoreRequest
import KMS.ConnectCustomKeyStoreResponse
import KMS.CreateAliasRequest
import KMS.CreateCustomKeyStoreRequest
import KMS.CreateCustomKeyStoreResponse
import KMS.CreateGrantRequest
import KMS.CreateGrantResponse
import KMS.CreateKeyRequest
import KMS.CreateKeyResponse
import KMS.DecryptRequest
import KMS.DecryptResponse
import KMS.DeleteAliasRequest
import KMS.DeleteCustomKeyStoreRequest
import KMS.DeleteCustomKeyStoreResponse
import KMS.DeleteImportedKeyMaterialRequest
import KMS.DescribeCustomKeyStoresRequest
import KMS.DescribeCustomKeyStoresResponse
import KMS.DescribeKeyRequest
import KMS.DescribeKeyResponse
import KMS.DisableKeyRequest
import KMS.DisableKeyRotationRequest
import KMS.DisconnectCustomKeyStoreRequest
import KMS.DisconnectCustomKeyStoreResponse
import KMS.EnableKeyRequest
import KMS.EnableKeyRotationRequest
import KMS.EncryptRequest
import KMS.EncryptResponse
import KMS.GenerateDataKeyRequest
import KMS.GenerateDataKeyResponse
import KMS.GenerateDataKeyPairRequest
import KMS.GenerateDataKeyPairResponse
import KMS.GenerateDataKeyPairWithoutPlaintextRequest
import KMS.GenerateDataKeyPairWithoutPlaintextResponse
import KMS.GenerateDataKeyWithoutPlaintextRequest
import KMS.GenerateDataKeyWithoutPlaintextResponse
import KMS.GenerateRandomRequest
import KMS.GenerateRandomResponse
import KMS.GetKeyPolicyRequest
import KMS.GetKeyPolicyResponse
import KMS.GetKeyRotationStatusRequest
import KMS.GetKeyRotationStatusResponse
import KMS.GetParametersForImportRequest
import KMS.GetParametersForImportResponse
import KMS.GetPublicKeyRequest
import KMS.GetPublicKeyResponse
import KMS.ImportKeyMaterialRequest
import KMS.ImportKeyMaterialResponse
import KMS.ListAliasesRequest
import KMS.ListAliasesResponse
import KMS.ListGrantsRequest
import KMS.ListGrantsResponse
import KMS.ListKeyPoliciesRequest
import KMS.ListKeyPoliciesResponse
import KMS.ListKeysRequest
import KMS.ListKeysResponse
import KMS.ListResourceTagsRequest
import KMS.ListResourceTagsResponse
import KMS.ListRetirableGrantsRequest
import KMS.PutKeyPolicyRequest
import KMS.ReEncryptRequest
import KMS.ReEncryptResponse
import KMS.RetireGrantRequest
import KMS.RevokeGrantRequest
import KMS.ScheduleKeyDeletionRequest
import KMS.ScheduleKeyDeletionResponse
import KMS.SignRequest
import KMS.SignResponse
import KMS.TagResourceRequest
import KMS.UntagResourceRequest
import KMS.UpdateAliasRequest
import KMS.UpdateCustomKeyStoreRequest
import KMS.UpdateCustomKeyStoreResponse
import KMS.UpdateKeyDescriptionRequest
import KMS.VerifyRequest
import KMS.VerifyResponse
import KMS.GrantConstraints
import KMS.KeyMetadata
import KMS.EncryptionContextType

typealias AWSAccountIdType = String

typealias AliasList = Array<AliasListEntry>

typealias AliasNameType = String

typealias ArnType = String

typealias BooleanType = Boolean

typealias CloudHsmClusterIdType = String

typealias CustomKeyStoreIdType = String

typealias CustomKeyStoreNameType = String

typealias CustomKeyStoresList = Array<CustomKeyStoresListEntry>

typealias DateType = Date

typealias DescriptionType = String

typealias EncryptionAlgorithmSpecList = Array<String /* "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | String */>

typealias EncryptionContextKey = String

typealias EncryptionContextValue = String

typealias GrantIdType = String

typealias GrantList = Array<GrantListEntry>

typealias GrantNameType = String

typealias GrantOperationList = Array<String /* "Decrypt" | "Encrypt" | "GenerateDataKey" | "GenerateDataKeyWithoutPlaintext" | "ReEncryptFrom" | "ReEncryptTo" | "Sign" | "Verify" | "GetPublicKey" | "CreateGrant" | "RetireGrant" | "DescribeKey" | "GenerateDataKeyPair" | "GenerateDataKeyPairWithoutPlaintext" | String */>

typealias GrantTokenList = Array<GrantTokenType>

typealias GrantTokenType = String

typealias KeyIdType = String

typealias KeyList = Array<KeyListEntry>

typealias KeyStorePasswordType = String

typealias LimitType = Number

typealias MarkerType = String

typealias NumberOfBytesType = Number

typealias PendingWindowInDaysType = Number

typealias PolicyNameList = Array<PolicyNameType>

typealias PolicyNameType = String

typealias PolicyType = String

typealias PrincipalIdType = String

typealias SigningAlgorithmSpecList = Array<String /* "RSASSA_PSS_SHA_256" | "RSASSA_PSS_SHA_384" | "RSASSA_PSS_SHA_512" | "RSASSA_PKCS1_V1_5_SHA_256" | "RSASSA_PKCS1_V1_5_SHA_384" | "RSASSA_PKCS1_V1_5_SHA_512" | "ECDSA_SHA_256" | "ECDSA_SHA_384" | "ECDSA_SHA_512" | String */>

typealias TagKeyList = Array<TagKeyType>

typealias TagKeyType = String

typealias TagList = Array<Tag>

typealias TagValueType = String

typealias TrustAnchorCertificateType = String

@JsModule("aws-sdk")
external open class KMS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & KMS.Types.ClientConfiguration */
    open fun cancelKeyDeletion(params: CancelKeyDeletionRequest, callback: (err: AWSError, data: CancelKeyDeletionResponse) -> Unit = definedExternally): Request<CancelKeyDeletionResponse, AWSError>
    open fun cancelKeyDeletion(callback: (err: AWSError, data: CancelKeyDeletionResponse) -> Unit = definedExternally): Request<CancelKeyDeletionResponse, AWSError>
    open fun connectCustomKeyStore(params: ConnectCustomKeyStoreRequest, callback: (err: AWSError, data: ConnectCustomKeyStoreResponse) -> Unit = definedExternally): Request<ConnectCustomKeyStoreResponse, AWSError>
    open fun connectCustomKeyStore(callback: (err: AWSError, data: ConnectCustomKeyStoreResponse) -> Unit = definedExternally): Request<ConnectCustomKeyStoreResponse, AWSError>
    open fun createAlias(params: CreateAliasRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createAlias(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createCustomKeyStore(params: CreateCustomKeyStoreRequest, callback: (err: AWSError, data: CreateCustomKeyStoreResponse) -> Unit = definedExternally): Request<CreateCustomKeyStoreResponse, AWSError>
    open fun createCustomKeyStore(callback: (err: AWSError, data: CreateCustomKeyStoreResponse) -> Unit = definedExternally): Request<CreateCustomKeyStoreResponse, AWSError>
    open fun createGrant(params: CreateGrantRequest, callback: (err: AWSError, data: CreateGrantResponse) -> Unit = definedExternally): Request<CreateGrantResponse, AWSError>
    open fun createGrant(callback: (err: AWSError, data: CreateGrantResponse) -> Unit = definedExternally): Request<CreateGrantResponse, AWSError>
    open fun createKey(params: CreateKeyRequest, callback: (err: AWSError, data: CreateKeyResponse) -> Unit = definedExternally): Request<CreateKeyResponse, AWSError>
    open fun createKey(callback: (err: AWSError, data: CreateKeyResponse) -> Unit = definedExternally): Request<CreateKeyResponse, AWSError>
    open fun decrypt(params: DecryptRequest, callback: (err: AWSError, data: DecryptResponse) -> Unit = definedExternally): Request<DecryptResponse, AWSError>
    open fun decrypt(callback: (err: AWSError, data: DecryptResponse) -> Unit = definedExternally): Request<DecryptResponse, AWSError>
    open fun deleteAlias(params: DeleteAliasRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAlias(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCustomKeyStore(params: DeleteCustomKeyStoreRequest, callback: (err: AWSError, data: DeleteCustomKeyStoreResponse) -> Unit = definedExternally): Request<DeleteCustomKeyStoreResponse, AWSError>
    open fun deleteCustomKeyStore(callback: (err: AWSError, data: DeleteCustomKeyStoreResponse) -> Unit = definedExternally): Request<DeleteCustomKeyStoreResponse, AWSError>
    open fun deleteImportedKeyMaterial(params: DeleteImportedKeyMaterialRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteImportedKeyMaterial(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeCustomKeyStores(params: DescribeCustomKeyStoresRequest, callback: (err: AWSError, data: DescribeCustomKeyStoresResponse) -> Unit = definedExternally): Request<DescribeCustomKeyStoresResponse, AWSError>
    open fun describeCustomKeyStores(callback: (err: AWSError, data: DescribeCustomKeyStoresResponse) -> Unit = definedExternally): Request<DescribeCustomKeyStoresResponse, AWSError>
    open fun describeKey(params: DescribeKeyRequest, callback: (err: AWSError, data: DescribeKeyResponse) -> Unit = definedExternally): Request<DescribeKeyResponse, AWSError>
    open fun describeKey(callback: (err: AWSError, data: DescribeKeyResponse) -> Unit = definedExternally): Request<DescribeKeyResponse, AWSError>
    open fun disableKey(params: DisableKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableKeyRotation(params: DisableKeyRotationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableKeyRotation(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disconnectCustomKeyStore(params: DisconnectCustomKeyStoreRequest, callback: (err: AWSError, data: DisconnectCustomKeyStoreResponse) -> Unit = definedExternally): Request<DisconnectCustomKeyStoreResponse, AWSError>
    open fun disconnectCustomKeyStore(callback: (err: AWSError, data: DisconnectCustomKeyStoreResponse) -> Unit = definedExternally): Request<DisconnectCustomKeyStoreResponse, AWSError>
    open fun enableKey(params: EnableKeyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableKey(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableKeyRotation(params: EnableKeyRotationRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableKeyRotation(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun encrypt(params: EncryptRequest, callback: (err: AWSError, data: EncryptResponse) -> Unit = definedExternally): Request<EncryptResponse, AWSError>
    open fun encrypt(callback: (err: AWSError, data: EncryptResponse) -> Unit = definedExternally): Request<EncryptResponse, AWSError>
    open fun generateDataKey(params: GenerateDataKeyRequest, callback: (err: AWSError, data: GenerateDataKeyResponse) -> Unit = definedExternally): Request<GenerateDataKeyResponse, AWSError>
    open fun generateDataKey(callback: (err: AWSError, data: GenerateDataKeyResponse) -> Unit = definedExternally): Request<GenerateDataKeyResponse, AWSError>
    open fun generateDataKeyPair(params: GenerateDataKeyPairRequest, callback: (err: AWSError, data: GenerateDataKeyPairResponse) -> Unit = definedExternally): Request<GenerateDataKeyPairResponse, AWSError>
    open fun generateDataKeyPair(callback: (err: AWSError, data: GenerateDataKeyPairResponse) -> Unit = definedExternally): Request<GenerateDataKeyPairResponse, AWSError>
    open fun generateDataKeyPairWithoutPlaintext(params: GenerateDataKeyPairWithoutPlaintextRequest, callback: (err: AWSError, data: GenerateDataKeyPairWithoutPlaintextResponse) -> Unit = definedExternally): Request<GenerateDataKeyPairWithoutPlaintextResponse, AWSError>
    open fun generateDataKeyPairWithoutPlaintext(callback: (err: AWSError, data: GenerateDataKeyPairWithoutPlaintextResponse) -> Unit = definedExternally): Request<GenerateDataKeyPairWithoutPlaintextResponse, AWSError>
    open fun generateDataKeyWithoutPlaintext(params: GenerateDataKeyWithoutPlaintextRequest, callback: (err: AWSError, data: GenerateDataKeyWithoutPlaintextResponse) -> Unit = definedExternally): Request<GenerateDataKeyWithoutPlaintextResponse, AWSError>
    open fun generateDataKeyWithoutPlaintext(callback: (err: AWSError, data: GenerateDataKeyWithoutPlaintextResponse) -> Unit = definedExternally): Request<GenerateDataKeyWithoutPlaintextResponse, AWSError>
    open fun generateRandom(params: GenerateRandomRequest, callback: (err: AWSError, data: GenerateRandomResponse) -> Unit = definedExternally): Request<GenerateRandomResponse, AWSError>
    open fun generateRandom(callback: (err: AWSError, data: GenerateRandomResponse) -> Unit = definedExternally): Request<GenerateRandomResponse, AWSError>
    open fun getKeyPolicy(params: GetKeyPolicyRequest, callback: (err: AWSError, data: GetKeyPolicyResponse) -> Unit = definedExternally): Request<GetKeyPolicyResponse, AWSError>
    open fun getKeyPolicy(callback: (err: AWSError, data: GetKeyPolicyResponse) -> Unit = definedExternally): Request<GetKeyPolicyResponse, AWSError>
    open fun getKeyRotationStatus(params: GetKeyRotationStatusRequest, callback: (err: AWSError, data: GetKeyRotationStatusResponse) -> Unit = definedExternally): Request<GetKeyRotationStatusResponse, AWSError>
    open fun getKeyRotationStatus(callback: (err: AWSError, data: GetKeyRotationStatusResponse) -> Unit = definedExternally): Request<GetKeyRotationStatusResponse, AWSError>
    open fun getParametersForImport(params: GetParametersForImportRequest, callback: (err: AWSError, data: GetParametersForImportResponse) -> Unit = definedExternally): Request<GetParametersForImportResponse, AWSError>
    open fun getParametersForImport(callback: (err: AWSError, data: GetParametersForImportResponse) -> Unit = definedExternally): Request<GetParametersForImportResponse, AWSError>
    open fun getPublicKey(params: GetPublicKeyRequest, callback: (err: AWSError, data: GetPublicKeyResponse) -> Unit = definedExternally): Request<GetPublicKeyResponse, AWSError>
    open fun getPublicKey(callback: (err: AWSError, data: GetPublicKeyResponse) -> Unit = definedExternally): Request<GetPublicKeyResponse, AWSError>
    open fun importKeyMaterial(params: ImportKeyMaterialRequest, callback: (err: AWSError, data: ImportKeyMaterialResponse) -> Unit = definedExternally): Request<ImportKeyMaterialResponse, AWSError>
    open fun importKeyMaterial(callback: (err: AWSError, data: ImportKeyMaterialResponse) -> Unit = definedExternally): Request<ImportKeyMaterialResponse, AWSError>
    open fun listAliases(params: ListAliasesRequest, callback: (err: AWSError, data: ListAliasesResponse) -> Unit = definedExternally): Request<ListAliasesResponse, AWSError>
    open fun listAliases(callback: (err: AWSError, data: ListAliasesResponse) -> Unit = definedExternally): Request<ListAliasesResponse, AWSError>
    open fun listGrants(params: ListGrantsRequest, callback: (err: AWSError, data: ListGrantsResponse) -> Unit = definedExternally): Request<ListGrantsResponse, AWSError>
    open fun listGrants(callback: (err: AWSError, data: ListGrantsResponse) -> Unit = definedExternally): Request<ListGrantsResponse, AWSError>
    open fun listKeyPolicies(params: ListKeyPoliciesRequest, callback: (err: AWSError, data: ListKeyPoliciesResponse) -> Unit = definedExternally): Request<ListKeyPoliciesResponse, AWSError>
    open fun listKeyPolicies(callback: (err: AWSError, data: ListKeyPoliciesResponse) -> Unit = definedExternally): Request<ListKeyPoliciesResponse, AWSError>
    open fun listKeys(params: ListKeysRequest, callback: (err: AWSError, data: ListKeysResponse) -> Unit = definedExternally): Request<ListKeysResponse, AWSError>
    open fun listKeys(callback: (err: AWSError, data: ListKeysResponse) -> Unit = definedExternally): Request<ListKeysResponse, AWSError>
    open fun listResourceTags(params: ListResourceTagsRequest, callback: (err: AWSError, data: ListResourceTagsResponse) -> Unit = definedExternally): Request<ListResourceTagsResponse, AWSError>
    open fun listResourceTags(callback: (err: AWSError, data: ListResourceTagsResponse) -> Unit = definedExternally): Request<ListResourceTagsResponse, AWSError>
    open fun listRetirableGrants(params: ListRetirableGrantsRequest, callback: (err: AWSError, data: ListGrantsResponse) -> Unit = definedExternally): Request<ListGrantsResponse, AWSError>
    open fun listRetirableGrants(callback: (err: AWSError, data: ListGrantsResponse) -> Unit = definedExternally): Request<ListGrantsResponse, AWSError>
    open fun putKeyPolicy(params: PutKeyPolicyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putKeyPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun reEncrypt(params: ReEncryptRequest, callback: (err: AWSError, data: ReEncryptResponse) -> Unit = definedExternally): Request<ReEncryptResponse, AWSError>
    open fun reEncrypt(callback: (err: AWSError, data: ReEncryptResponse) -> Unit = definedExternally): Request<ReEncryptResponse, AWSError>
    open fun retireGrant(params: RetireGrantRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun retireGrant(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun revokeGrant(params: RevokeGrantRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun revokeGrant(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun scheduleKeyDeletion(params: ScheduleKeyDeletionRequest, callback: (err: AWSError, data: ScheduleKeyDeletionResponse) -> Unit = definedExternally): Request<ScheduleKeyDeletionResponse, AWSError>
    open fun scheduleKeyDeletion(callback: (err: AWSError, data: ScheduleKeyDeletionResponse) -> Unit = definedExternally): Request<ScheduleKeyDeletionResponse, AWSError>
    open fun sign(params: SignRequest, callback: (err: AWSError, data: SignResponse) -> Unit = definedExternally): Request<SignResponse, AWSError>
    open fun sign(callback: (err: AWSError, data: SignResponse) -> Unit = definedExternally): Request<SignResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAlias(params: UpdateAliasRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAlias(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateCustomKeyStore(params: UpdateCustomKeyStoreRequest, callback: (err: AWSError, data: UpdateCustomKeyStoreResponse) -> Unit = definedExternally): Request<UpdateCustomKeyStoreResponse, AWSError>
    open fun updateCustomKeyStore(callback: (err: AWSError, data: UpdateCustomKeyStoreResponse) -> Unit = definedExternally): Request<UpdateCustomKeyStoreResponse, AWSError>
    open fun updateKeyDescription(params: UpdateKeyDescriptionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateKeyDescription(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun verify(params: VerifyRequest, callback: (err: AWSError, data: VerifyResponse) -> Unit = definedExternally): Request<VerifyResponse, AWSError>
    open fun verify(callback: (err: AWSError, data: VerifyResponse) -> Unit = definedExternally): Request<VerifyResponse, AWSError>
    interface AliasListEntry {
        var AliasName: AliasNameType?
            get() = definedExternally
            set(value) = definedExternally
        var AliasArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var TargetKeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelKeyDeletionRequest {
        var KeyId: KeyIdType
    }
    interface CancelKeyDeletionResponse {
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConnectCustomKeyStoreRequest {
        var CustomKeyStoreId: CustomKeyStoreIdType
    }
    interface ConnectCustomKeyStoreResponse
    interface CreateAliasRequest {
        var AliasName: AliasNameType
        var TargetKeyId: KeyIdType
    }
    interface CreateCustomKeyStoreRequest {
        var CustomKeyStoreName: CustomKeyStoreNameType
        var CloudHsmClusterId: CloudHsmClusterIdType
        var TrustAnchorCertificate: TrustAnchorCertificateType
        var KeyStorePassword: KeyStorePasswordType
    }
    interface CreateCustomKeyStoreResponse {
        var CustomKeyStoreId: CustomKeyStoreIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGrantRequest {
        var KeyId: KeyIdType
        var GranteePrincipal: PrincipalIdType
        var RetiringPrincipal: PrincipalIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Operations: GrantOperationList
        var Constraints: GrantConstraints?
            get() = definedExternally
            set(value) = definedExternally
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
        var Name: GrantNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGrantResponse {
        var GrantToken: GrantTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var GrantId: GrantIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateKeyRequest {
        var Policy: PolicyType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyUsage: String /* "SIGN_VERIFY" | "ENCRYPT_DECRYPT" | String */
        var CustomerMasterKeySpec: String /* "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | "SYMMETRIC_DEFAULT" | String */
        var Origin: String /* "AWS_KMS" | "EXTERNAL" | "AWS_CLOUDHSM" | String */
        var CustomKeyStoreId: CustomKeyStoreIdType?
            get() = definedExternally
            set(value) = definedExternally
        var BypassPolicyLockoutSafetyCheck: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateKeyResponse {
        var KeyMetadata: KeyMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CustomKeyStoresListEntry {
        var CustomKeyStoreId: CustomKeyStoreIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CustomKeyStoreName: CustomKeyStoreNameType?
            get() = definedExternally
            set(value) = definedExternally
        var CloudHsmClusterId: CloudHsmClusterIdType?
            get() = definedExternally
            set(value) = definedExternally
        var TrustAnchorCertificate: TrustAnchorCertificateType?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionState: String /* "CONNECTED" | "CONNECTING" | "FAILED" | "DISCONNECTED" | "DISCONNECTING" | String */
        var ConnectionErrorCode: String /* "INVALID_CREDENTIALS" | "CLUSTER_NOT_FOUND" | "NETWORK_ERRORS" | "INTERNAL_ERROR" | "INSUFFICIENT_CLOUDHSM_HSMS" | "USER_LOCKED_OUT" | "USER_NOT_FOUND" | "USER_LOGGED_IN" | "SUBNET_NOT_FOUND" | String */
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DecryptRequest {
        var CiphertextBlob: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionContext: EncryptionContextType?
            get() = definedExternally
            set(value) = definedExternally
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionAlgorithm: String /* "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | String */
    }
    interface DecryptResponse {
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Plaintext: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionAlgorithm: String /* "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | String */
    }
    interface DeleteAliasRequest {
        var AliasName: AliasNameType
    }
    interface DeleteCustomKeyStoreRequest {
        var CustomKeyStoreId: CustomKeyStoreIdType
    }
    interface DeleteCustomKeyStoreResponse
    interface DeleteImportedKeyMaterialRequest {
        var KeyId: KeyIdType
    }
    interface DescribeCustomKeyStoresRequest {
        var CustomKeyStoreId: CustomKeyStoreIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CustomKeyStoreName: CustomKeyStoreNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeCustomKeyStoresResponse {
        var CustomKeyStores: CustomKeyStoresList?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Truncated: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeKeyRequest {
        var KeyId: KeyIdType
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeKeyResponse {
        var KeyMetadata: KeyMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisableKeyRequest {
        var KeyId: KeyIdType
    }
    interface DisableKeyRotationRequest {
        var KeyId: KeyIdType
    }
    interface DisconnectCustomKeyStoreRequest {
        var CustomKeyStoreId: CustomKeyStoreIdType
    }
    interface DisconnectCustomKeyStoreResponse
    interface EnableKeyRequest {
        var KeyId: KeyIdType
    }
    interface EnableKeyRotationRequest {
        var KeyId: KeyIdType
    }
    interface EncryptRequest {
        var KeyId: KeyIdType
        var Plaintext: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionContext: EncryptionContextType?
            get() = definedExternally
            set(value) = definedExternally
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionAlgorithm: String /* "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | String */
    }
    interface EncryptResponse {
        var CiphertextBlob: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionAlgorithm: String /* "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | String */
    }
    interface EncryptionContextType {
        @nativeGetter
        operator fun get(key: String): EncryptionContextValue?
        @nativeSetter
        operator fun set(key: String, value: EncryptionContextValue)
    }
    interface GenerateDataKeyPairRequest {
        var EncryptionContext: EncryptionContextType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType
        var KeyPairSpec: String /* "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | String */
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateDataKeyPairResponse {
        var PrivateKeyCiphertextBlob: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var PrivateKeyPlaintext: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var PublicKey: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyPairSpec: String /* "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | String */
    }
    interface GenerateDataKeyPairWithoutPlaintextRequest {
        var EncryptionContext: EncryptionContextType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType
        var KeyPairSpec: String /* "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | String */
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateDataKeyPairWithoutPlaintextResponse {
        var PrivateKeyCiphertextBlob: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var PublicKey: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyPairSpec: String /* "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | String */
    }
    interface GenerateDataKeyRequest {
        var KeyId: KeyIdType
        var EncryptionContext: EncryptionContextType?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfBytes: NumberOfBytesType?
            get() = definedExternally
            set(value) = definedExternally
        var KeySpec: String /* "AES_256" | "AES_128" | String */
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateDataKeyResponse {
        var CiphertextBlob: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var Plaintext: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateDataKeyWithoutPlaintextRequest {
        var KeyId: KeyIdType
        var EncryptionContext: EncryptionContextType?
            get() = definedExternally
            set(value) = definedExternally
        var KeySpec: String /* "AES_256" | "AES_128" | String */
        var NumberOfBytes: NumberOfBytesType?
            get() = definedExternally
            set(value) = definedExternally
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateDataKeyWithoutPlaintextResponse {
        var CiphertextBlob: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateRandomRequest {
        var NumberOfBytes: NumberOfBytesType?
            get() = definedExternally
            set(value) = definedExternally
        var CustomKeyStoreId: CustomKeyStoreIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateRandomResponse {
        var Plaintext: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetKeyPolicyRequest {
        var KeyId: KeyIdType
        var PolicyName: PolicyNameType
    }
    interface GetKeyPolicyResponse {
        var Policy: PolicyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetKeyRotationStatusRequest {
        var KeyId: KeyIdType
    }
    interface GetKeyRotationStatusResponse {
        var KeyRotationEnabled: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetParametersForImportRequest {
        var KeyId: KeyIdType
        var WrappingAlgorithm: String /* "RSAES_PKCS1_V1_5" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | String */
        var WrappingKeySpec: String /* "RSA_2048" | String */
    }
    interface GetParametersForImportResponse {
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ImportToken: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var PublicKey: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var ParametersValidTo: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPublicKeyRequest {
        var KeyId: KeyIdType
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPublicKeyResponse {
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var PublicKey: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var CustomerMasterKeySpec: String /* "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | "SYMMETRIC_DEFAULT" | String */
        var KeyUsage: String /* "SIGN_VERIFY" | "ENCRYPT_DECRYPT" | String */
        var EncryptionAlgorithms: EncryptionAlgorithmSpecList?
            get() = definedExternally
            set(value) = definedExternally
        var SigningAlgorithms: SigningAlgorithmSpecList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GrantConstraints {
        var EncryptionContextSubset: EncryptionContextType?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionContextEquals: EncryptionContextType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GrantListEntry {
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var GrantId: GrantIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: GrantNameType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var GranteePrincipal: PrincipalIdType?
            get() = definedExternally
            set(value) = definedExternally
        var RetiringPrincipal: PrincipalIdType?
            get() = definedExternally
            set(value) = definedExternally
        var IssuingAccount: PrincipalIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Operations: GrantOperationList?
            get() = definedExternally
            set(value) = definedExternally
        var Constraints: GrantConstraints?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportKeyMaterialRequest {
        var KeyId: KeyIdType
        var ImportToken: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var EncryptedKeyMaterial: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var ValidTo: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationModel: String /* "KEY_MATERIAL_EXPIRES" | "KEY_MATERIAL_DOES_NOT_EXPIRE" | String */
    }
    interface ImportKeyMaterialResponse
    interface KeyListEntry {
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyArn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyMetadata {
        var AWSAccountId: AWSAccountIdType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType
        var Arn: ArnType?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var Enabled: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyUsage: String /* "SIGN_VERIFY" | "ENCRYPT_DECRYPT" | String */
        var KeyState: String /* "Enabled" | "Disabled" | "PendingDeletion" | "PendingImport" | "Unavailable" | String */
        var DeletionDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var ValidTo: DateType?
            get() = definedExternally
            set(value) = definedExternally
        var Origin: String /* "AWS_KMS" | "EXTERNAL" | "AWS_CLOUDHSM" | String */
        var CustomKeyStoreId: CustomKeyStoreIdType?
            get() = definedExternally
            set(value) = definedExternally
        var CloudHsmClusterId: CloudHsmClusterIdType?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationModel: String /* "KEY_MATERIAL_EXPIRES" | "KEY_MATERIAL_DOES_NOT_EXPIRE" | String */
        var KeyManager: String /* "AWS" | "CUSTOMER" | String */
        var CustomerMasterKeySpec: String /* "RSA_2048" | "RSA_3072" | "RSA_4096" | "ECC_NIST_P256" | "ECC_NIST_P384" | "ECC_NIST_P521" | "ECC_SECG_P256K1" | "SYMMETRIC_DEFAULT" | String */
        var EncryptionAlgorithms: EncryptionAlgorithmSpecList?
            get() = definedExternally
            set(value) = definedExternally
        var SigningAlgorithms: SigningAlgorithmSpecList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAliasesRequest {
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAliasesResponse {
        var Aliases: AliasList?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Truncated: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListGrantsRequest {
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType
    }
    interface ListGrantsResponse {
        var Grants: GrantList?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Truncated: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListKeyPoliciesRequest {
        var KeyId: KeyIdType
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListKeyPoliciesResponse {
        var PolicyNames: PolicyNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Truncated: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListKeysRequest {
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListKeysResponse {
        var Keys: KeyList?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Truncated: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceTagsRequest {
        var KeyId: KeyIdType
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListResourceTagsResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextMarker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var Truncated: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRetirableGrantsRequest {
        var Limit: LimitType?
            get() = definedExternally
            set(value) = definedExternally
        var Marker: MarkerType?
            get() = definedExternally
            set(value) = definedExternally
        var RetiringPrincipal: PrincipalIdType
    }
    interface PutKeyPolicyRequest {
        var KeyId: KeyIdType
        var PolicyName: PolicyNameType
        var Policy: PolicyType
        var BypassPolicyLockoutSafetyCheck: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReEncryptRequest {
        var CiphertextBlob: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var SourceEncryptionContext: EncryptionContextType?
            get() = definedExternally
            set(value) = definedExternally
        var SourceKeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationKeyId: KeyIdType
        var DestinationEncryptionContext: EncryptionContextType?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEncryptionAlgorithm: String /* "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | String */
        var DestinationEncryptionAlgorithm: String /* "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | String */
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReEncryptResponse {
        var CiphertextBlob: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var SourceKeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var SourceEncryptionAlgorithm: String /* "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | String */
        var DestinationEncryptionAlgorithm: String /* "SYMMETRIC_DEFAULT" | "RSAES_OAEP_SHA_1" | "RSAES_OAEP_SHA_256" | String */
    }
    interface RetireGrantRequest {
        var GrantToken: GrantTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var GrantId: GrantIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevokeGrantRequest {
        var KeyId: KeyIdType
        var GrantId: GrantIdType
    }
    interface ScheduleKeyDeletionRequest {
        var KeyId: KeyIdType
        var PendingWindowInDays: PendingWindowInDaysType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ScheduleKeyDeletionResponse {
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionDate: DateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SignRequest {
        var KeyId: KeyIdType
        var Message: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var MessageType: String /* "RAW" | "DIGEST" | String */
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
        var SigningAlgorithm: String /* "RSASSA_PSS_SHA_256" | "RSASSA_PSS_SHA_384" | "RSASSA_PSS_SHA_512" | "RSASSA_PKCS1_V1_5_SHA_256" | "RSASSA_PKCS1_V1_5_SHA_384" | "RSASSA_PKCS1_V1_5_SHA_512" | "ECDSA_SHA_256" | "ECDSA_SHA_384" | "ECDSA_SHA_512" | String */
    }
    interface SignResponse {
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var Signature: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var SigningAlgorithm: String /* "RSASSA_PSS_SHA_256" | "RSASSA_PSS_SHA_384" | "RSASSA_PSS_SHA_512" | "RSASSA_PKCS1_V1_5_SHA_256" | "RSASSA_PKCS1_V1_5_SHA_384" | "RSASSA_PKCS1_V1_5_SHA_512" | "ECDSA_SHA_256" | "ECDSA_SHA_384" | "ECDSA_SHA_512" | String */
    }
    interface Tag {
        var TagKey: TagKeyType
        var TagValue: TagValueType
    }
    interface TagResourceRequest {
        var KeyId: KeyIdType
        var Tags: TagList
    }
    interface UntagResourceRequest {
        var KeyId: KeyIdType
        var TagKeys: TagKeyList
    }
    interface UpdateAliasRequest {
        var AliasName: AliasNameType
        var TargetKeyId: KeyIdType
    }
    interface UpdateCustomKeyStoreRequest {
        var CustomKeyStoreId: CustomKeyStoreIdType
        var NewCustomKeyStoreName: CustomKeyStoreNameType?
            get() = definedExternally
            set(value) = definedExternally
        var KeyStorePassword: KeyStorePasswordType?
            get() = definedExternally
            set(value) = definedExternally
        var CloudHsmClusterId: CloudHsmClusterIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCustomKeyStoreResponse
    interface UpdateKeyDescriptionRequest {
        var KeyId: KeyIdType
        var Description: DescriptionType
    }
    interface VerifyRequest {
        var KeyId: KeyIdType
        var Message: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var MessageType: String /* "RAW" | "DIGEST" | String */
        var Signature: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var SigningAlgorithm: String /* "RSASSA_PSS_SHA_256" | "RSASSA_PSS_SHA_384" | "RSASSA_PSS_SHA_512" | "RSASSA_PKCS1_V1_5_SHA_256" | "RSASSA_PKCS1_V1_5_SHA_384" | "RSASSA_PKCS1_V1_5_SHA_512" | "ECDSA_SHA_256" | "ECDSA_SHA_384" | "ECDSA_SHA_512" | String */
        var GrantTokens: GrantTokenList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VerifyResponse {
        var KeyId: KeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var SignatureValid: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
        var SigningAlgorithm: String /* "RSASSA_PSS_SHA_256" | "RSASSA_PSS_SHA_384" | "RSASSA_PSS_SHA_512" | "RSASSA_PKCS1_V1_5_SHA_256" | "RSASSA_PKCS1_V1_5_SHA_384" | "RSASSA_PKCS1_V1_5_SHA_512" | "ECDSA_SHA_256" | "ECDSA_SHA_384" | "ECDSA_SHA_512" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-11-01" | "latest" | String */
    }
}