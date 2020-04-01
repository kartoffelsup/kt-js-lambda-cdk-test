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
import SecretsManager.SecretListEntry
import SecretsManager.SecretVersionsListEntry
import SecretsManager.Tag
import SecretsManager.CancelRotateSecretRequest
import SecretsManager.CancelRotateSecretResponse
import SecretsManager.CreateSecretRequest
import SecretsManager.CreateSecretResponse
import SecretsManager.DeleteResourcePolicyRequest
import SecretsManager.DeleteResourcePolicyResponse
import SecretsManager.DeleteSecretRequest
import SecretsManager.DeleteSecretResponse
import SecretsManager.DescribeSecretRequest
import SecretsManager.DescribeSecretResponse
import SecretsManager.GetRandomPasswordRequest
import SecretsManager.GetRandomPasswordResponse
import SecretsManager.GetResourcePolicyRequest
import SecretsManager.GetResourcePolicyResponse
import SecretsManager.GetSecretValueRequest
import SecretsManager.GetSecretValueResponse
import SecretsManager.ListSecretVersionIdsRequest
import SecretsManager.ListSecretVersionIdsResponse
import SecretsManager.ListSecretsRequest
import SecretsManager.ListSecretsResponse
import SecretsManager.PutResourcePolicyRequest
import SecretsManager.PutResourcePolicyResponse
import SecretsManager.PutSecretValueRequest
import SecretsManager.PutSecretValueResponse
import SecretsManager.RestoreSecretRequest
import SecretsManager.RestoreSecretResponse
import SecretsManager.RotateSecretRequest
import SecretsManager.RotateSecretResponse
import SecretsManager.TagResourceRequest
import SecretsManager.UntagResourceRequest
import SecretsManager.UpdateSecretRequest
import SecretsManager.UpdateSecretResponse
import SecretsManager.UpdateSecretVersionStageRequest
import SecretsManager.UpdateSecretVersionStageResponse
import SecretsManager.RotationRulesType
import SecretsManager.SecretVersionsToStagesMapType

typealias AutomaticallyRotateAfterDaysType = Number

typealias BooleanType = Boolean

typealias ClientRequestTokenType = String

typealias CreatedDateType = Date

typealias DeletedDateType = Date

typealias DeletionDateType = Date

typealias DescriptionType = String

typealias ExcludeCharactersType = String

typealias ExcludeLowercaseType = Boolean

typealias ExcludeNumbersType = Boolean

typealias ExcludePunctuationType = Boolean

typealias ExcludeUppercaseType = Boolean

typealias IncludeSpaceType = Boolean

typealias KmsKeyIdType = String

typealias LastAccessedDateType = Date

typealias LastChangedDateType = Date

typealias LastRotatedDateType = Date

typealias MaxResultsType = Number

typealias NameType = String

typealias NextTokenType = String

typealias NonEmptyResourcePolicyType = String

typealias OwningServiceType = String

typealias PasswordLengthType = Number

typealias RandomPasswordType = String

typealias RecoveryWindowInDaysType = Number

typealias RequireEachIncludedTypeType = Boolean

typealias RotationEnabledType = Boolean

typealias RotationLambdaARNType = String

typealias SecretARNType = String

typealias SecretIdType = String

typealias SecretListType = Array<SecretListEntry>

typealias SecretNameType = String

typealias SecretStringType = String

typealias SecretVersionIdType = String

typealias SecretVersionStageType = String

typealias SecretVersionStagesType = Array<SecretVersionStageType>

typealias SecretVersionsListType = Array<SecretVersionsListEntry>

typealias TagKeyListType = Array<TagKeyType>

typealias TagKeyType = String

typealias TagListType = Array<Tag>

typealias TagValueType = String

@JsModule("aws-sdk")
external open class SecretsManager(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SecretsManager.Types.ClientConfiguration */
    open fun cancelRotateSecret(params: CancelRotateSecretRequest, callback: (err: AWSError, data: CancelRotateSecretResponse) -> Unit = definedExternally): Request<CancelRotateSecretResponse, AWSError>
    open fun cancelRotateSecret(callback: (err: AWSError, data: CancelRotateSecretResponse) -> Unit = definedExternally): Request<CancelRotateSecretResponse, AWSError>
    open fun createSecret(params: CreateSecretRequest, callback: (err: AWSError, data: CreateSecretResponse) -> Unit = definedExternally): Request<CreateSecretResponse, AWSError>
    open fun createSecret(callback: (err: AWSError, data: CreateSecretResponse) -> Unit = definedExternally): Request<CreateSecretResponse, AWSError>
    open fun deleteResourcePolicy(params: DeleteResourcePolicyRequest, callback: (err: AWSError, data: DeleteResourcePolicyResponse) -> Unit = definedExternally): Request<DeleteResourcePolicyResponse, AWSError>
    open fun deleteResourcePolicy(callback: (err: AWSError, data: DeleteResourcePolicyResponse) -> Unit = definedExternally): Request<DeleteResourcePolicyResponse, AWSError>
    open fun deleteSecret(params: DeleteSecretRequest, callback: (err: AWSError, data: DeleteSecretResponse) -> Unit = definedExternally): Request<DeleteSecretResponse, AWSError>
    open fun deleteSecret(callback: (err: AWSError, data: DeleteSecretResponse) -> Unit = definedExternally): Request<DeleteSecretResponse, AWSError>
    open fun describeSecret(params: DescribeSecretRequest, callback: (err: AWSError, data: DescribeSecretResponse) -> Unit = definedExternally): Request<DescribeSecretResponse, AWSError>
    open fun describeSecret(callback: (err: AWSError, data: DescribeSecretResponse) -> Unit = definedExternally): Request<DescribeSecretResponse, AWSError>
    open fun getRandomPassword(params: GetRandomPasswordRequest, callback: (err: AWSError, data: GetRandomPasswordResponse) -> Unit = definedExternally): Request<GetRandomPasswordResponse, AWSError>
    open fun getRandomPassword(callback: (err: AWSError, data: GetRandomPasswordResponse) -> Unit = definedExternally): Request<GetRandomPasswordResponse, AWSError>
    open fun getResourcePolicy(params: GetResourcePolicyRequest, callback: (err: AWSError, data: GetResourcePolicyResponse) -> Unit = definedExternally): Request<GetResourcePolicyResponse, AWSError>
    open fun getResourcePolicy(callback: (err: AWSError, data: GetResourcePolicyResponse) -> Unit = definedExternally): Request<GetResourcePolicyResponse, AWSError>
    open fun getSecretValue(params: GetSecretValueRequest, callback: (err: AWSError, data: GetSecretValueResponse) -> Unit = definedExternally): Request<GetSecretValueResponse, AWSError>
    open fun getSecretValue(callback: (err: AWSError, data: GetSecretValueResponse) -> Unit = definedExternally): Request<GetSecretValueResponse, AWSError>
    open fun listSecretVersionIds(params: ListSecretVersionIdsRequest, callback: (err: AWSError, data: ListSecretVersionIdsResponse) -> Unit = definedExternally): Request<ListSecretVersionIdsResponse, AWSError>
    open fun listSecretVersionIds(callback: (err: AWSError, data: ListSecretVersionIdsResponse) -> Unit = definedExternally): Request<ListSecretVersionIdsResponse, AWSError>
    open fun listSecrets(params: ListSecretsRequest, callback: (err: AWSError, data: ListSecretsResponse) -> Unit = definedExternally): Request<ListSecretsResponse, AWSError>
    open fun listSecrets(callback: (err: AWSError, data: ListSecretsResponse) -> Unit = definedExternally): Request<ListSecretsResponse, AWSError>
    open fun putResourcePolicy(params: PutResourcePolicyRequest, callback: (err: AWSError, data: PutResourcePolicyResponse) -> Unit = definedExternally): Request<PutResourcePolicyResponse, AWSError>
    open fun putResourcePolicy(callback: (err: AWSError, data: PutResourcePolicyResponse) -> Unit = definedExternally): Request<PutResourcePolicyResponse, AWSError>
    open fun putSecretValue(params: PutSecretValueRequest, callback: (err: AWSError, data: PutSecretValueResponse) -> Unit = definedExternally): Request<PutSecretValueResponse, AWSError>
    open fun putSecretValue(callback: (err: AWSError, data: PutSecretValueResponse) -> Unit = definedExternally): Request<PutSecretValueResponse, AWSError>
    open fun restoreSecret(params: RestoreSecretRequest, callback: (err: AWSError, data: RestoreSecretResponse) -> Unit = definedExternally): Request<RestoreSecretResponse, AWSError>
    open fun restoreSecret(callback: (err: AWSError, data: RestoreSecretResponse) -> Unit = definedExternally): Request<RestoreSecretResponse, AWSError>
    open fun rotateSecret(params: RotateSecretRequest, callback: (err: AWSError, data: RotateSecretResponse) -> Unit = definedExternally): Request<RotateSecretResponse, AWSError>
    open fun rotateSecret(callback: (err: AWSError, data: RotateSecretResponse) -> Unit = definedExternally): Request<RotateSecretResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateSecret(params: UpdateSecretRequest, callback: (err: AWSError, data: UpdateSecretResponse) -> Unit = definedExternally): Request<UpdateSecretResponse, AWSError>
    open fun updateSecret(callback: (err: AWSError, data: UpdateSecretResponse) -> Unit = definedExternally): Request<UpdateSecretResponse, AWSError>
    open fun updateSecretVersionStage(params: UpdateSecretVersionStageRequest, callback: (err: AWSError, data: UpdateSecretVersionStageResponse) -> Unit = definedExternally): Request<UpdateSecretVersionStageResponse, AWSError>
    open fun updateSecretVersionStage(callback: (err: AWSError, data: UpdateSecretVersionStageResponse) -> Unit = definedExternally): Request<UpdateSecretVersionStageResponse, AWSError>
    interface CancelRotateSecretRequest {
        var SecretId: SecretIdType
    }
    interface CancelRotateSecretResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: SecretVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSecretRequest {
        var Name: NameType
        var ClientRequestToken: ClientRequestTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var SecretBinary: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var SecretString: SecretStringType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagListType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSecretResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: SecretVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteResourcePolicyRequest {
        var SecretId: SecretIdType
    }
    interface DeleteResourcePolicyResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSecretRequest {
        var SecretId: SecretIdType
        var RecoveryWindowInDays: RecoveryWindowInDaysType?
            get() = definedExternally
            set(value) = definedExternally
        var ForceDeleteWithoutRecovery: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSecretResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionDate: DeletionDateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSecretRequest {
        var SecretId: SecretIdType
    }
    interface DescribeSecretResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var RotationEnabled: RotationEnabledType?
            get() = definedExternally
            set(value) = definedExternally
        var RotationLambdaARN: RotationLambdaARNType?
            get() = definedExternally
            set(value) = definedExternally
        var RotationRules: RotationRulesType?
            get() = definedExternally
            set(value) = definedExternally
        var LastRotatedDate: LastRotatedDateType?
            get() = definedExternally
            set(value) = definedExternally
        var LastChangedDate: LastChangedDateType?
            get() = definedExternally
            set(value) = definedExternally
        var LastAccessedDate: LastAccessedDateType?
            get() = definedExternally
            set(value) = definedExternally
        var DeletedDate: DeletedDateType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagListType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionIdsToStages: SecretVersionsToStagesMapType?
            get() = definedExternally
            set(value) = definedExternally
        var OwningService: OwningServiceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRandomPasswordRequest {
        var PasswordLength: PasswordLengthType?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludeCharacters: ExcludeCharactersType?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludeNumbers: ExcludeNumbersType?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludePunctuation: ExcludePunctuationType?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludeUppercase: ExcludeUppercaseType?
            get() = definedExternally
            set(value) = definedExternally
        var ExcludeLowercase: ExcludeLowercaseType?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeSpace: IncludeSpaceType?
            get() = definedExternally
            set(value) = definedExternally
        var RequireEachIncludedType: RequireEachIncludedTypeType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRandomPasswordResponse {
        var RandomPassword: RandomPasswordType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourcePolicyRequest {
        var SecretId: SecretIdType
    }
    interface GetResourcePolicyResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameType?
            get() = definedExternally
            set(value) = definedExternally
        var ResourcePolicy: NonEmptyResourcePolicyType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSecretValueRequest {
        var SecretId: SecretIdType
        var VersionId: SecretVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionStage: SecretVersionStageType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSecretValueResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: SecretVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var SecretBinary: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var SecretString: SecretStringType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionStages: SecretVersionStagesType?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: CreatedDateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecretVersionIdsRequest {
        var SecretId: SecretIdType
        var MaxResults: MaxResultsType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var IncludeDeprecated: BooleanType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecretVersionIdsResponse {
        var Versions: SecretVersionsListType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecretsRequest {
        var MaxResults: MaxResultsType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextTokenType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSecretsResponse {
        var SecretList: SecretListType?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextTokenType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutResourcePolicyRequest {
        var SecretId: SecretIdType
        var ResourcePolicy: NonEmptyResourcePolicyType
    }
    interface PutResourcePolicyResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutSecretValueRequest {
        var SecretId: SecretIdType
        var ClientRequestToken: ClientRequestTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var SecretBinary: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var SecretString: SecretStringType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionStages: SecretVersionStagesType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutSecretValueResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: SecretVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionStages: SecretVersionStagesType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreSecretRequest {
        var SecretId: SecretIdType
    }
    interface RestoreSecretResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RotateSecretRequest {
        var SecretId: SecretIdType
        var ClientRequestToken: ClientRequestTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var RotationLambdaARN: RotationLambdaARNType?
            get() = definedExternally
            set(value) = definedExternally
        var RotationRules: RotationRulesType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RotateSecretResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: SecretVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RotationRulesType {
        var AutomaticallyAfterDays: AutomaticallyRotateAfterDaysType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecretListEntry {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var RotationEnabled: RotationEnabledType?
            get() = definedExternally
            set(value) = definedExternally
        var RotationLambdaARN: RotationLambdaARNType?
            get() = definedExternally
            set(value) = definedExternally
        var RotationRules: RotationRulesType?
            get() = definedExternally
            set(value) = definedExternally
        var LastRotatedDate: LastRotatedDateType?
            get() = definedExternally
            set(value) = definedExternally
        var LastChangedDate: LastChangedDateType?
            get() = definedExternally
            set(value) = definedExternally
        var LastAccessedDate: LastAccessedDateType?
            get() = definedExternally
            set(value) = definedExternally
        var DeletedDate: DeletedDateType?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagListType?
            get() = definedExternally
            set(value) = definedExternally
        var SecretVersionsToStages: SecretVersionsToStagesMapType?
            get() = definedExternally
            set(value) = definedExternally
        var OwningService: OwningServiceType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecretVersionsListEntry {
        var VersionId: SecretVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionStages: SecretVersionStagesType?
            get() = definedExternally
            set(value) = definedExternally
        var LastAccessedDate: LastAccessedDateType?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedDate: CreatedDateType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecretVersionsToStagesMapType {
        @nativeGetter
        operator fun get(key: String): SecretVersionStagesType?
        @nativeSetter
        operator fun set(key: String, value: SecretVersionStagesType)
    }
    interface Tag {
        var Key: TagKeyType?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValueType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var SecretId: SecretIdType
        var Tags: TagListType
    }
    interface UntagResourceRequest {
        var SecretId: SecretIdType
        var TagKeys: TagKeyListType
    }
    interface UpdateSecretRequest {
        var SecretId: SecretIdType
        var ClientRequestToken: ClientRequestTokenType?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionType?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyIdType?
            get() = definedExternally
            set(value) = definedExternally
        var SecretBinary: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var SecretString: SecretStringType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSecretResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: SecretVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSecretVersionStageRequest {
        var SecretId: SecretIdType
        var VersionStage: SecretVersionStageType
        var RemoveFromVersionId: SecretVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
        var MoveToVersionId: SecretVersionIdType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSecretVersionStageResponse {
        var ARN: SecretARNType?
            get() = definedExternally
            set(value) = definedExternally
        var Name: SecretNameType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-10-17" | "latest" | String */
    }
}