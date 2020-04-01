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
import Macie.FailedS3Resource
import Macie.MemberAccount
import Macie.S3Resource
import Macie.S3ResourceClassification
import Macie.S3ResourceClassificationUpdate
import Macie.AssociateMemberAccountRequest
import Macie.AssociateS3ResourcesRequest
import Macie.AssociateS3ResourcesResult
import Macie.DisassociateMemberAccountRequest
import Macie.DisassociateS3ResourcesRequest
import Macie.DisassociateS3ResourcesResult
import Macie.ListMemberAccountsRequest
import Macie.ListMemberAccountsResult
import Macie.ListS3ResourcesRequest
import Macie.ListS3ResourcesResult
import Macie.UpdateS3ResourcesRequest
import Macie.UpdateS3ResourcesResult
import Macie.ClassificationType
import Macie.ClassificationTypeUpdate

typealias AWSAccountId = String

typealias BucketName = String

typealias ErrorCode = String

typealias ExceptionMessage = String

typealias FailedS3Resources = Array<FailedS3Resource>

typealias MaxResults = Number

typealias MemberAccounts = Array<MemberAccount>

typealias NextToken = String

typealias Prefix = String

typealias S3Resources = Array<S3Resource>

typealias S3ResourcesClassification = Array<S3ResourceClassification>

typealias S3ResourcesClassificationUpdate = Array<S3ResourceClassificationUpdate>

@JsModule("aws-sdk")
external open class Macie(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Macie.Types.ClientConfiguration */
    open fun associateMemberAccount(params: AssociateMemberAccountRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun associateMemberAccount(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun associateS3Resources(params: AssociateS3ResourcesRequest, callback: (err: AWSError, data: AssociateS3ResourcesResult) -> Unit = definedExternally): Request<AssociateS3ResourcesResult, AWSError>
    open fun associateS3Resources(callback: (err: AWSError, data: AssociateS3ResourcesResult) -> Unit = definedExternally): Request<AssociateS3ResourcesResult, AWSError>
    open fun disassociateMemberAccount(params: DisassociateMemberAccountRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disassociateMemberAccount(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disassociateS3Resources(params: DisassociateS3ResourcesRequest, callback: (err: AWSError, data: DisassociateS3ResourcesResult) -> Unit = definedExternally): Request<DisassociateS3ResourcesResult, AWSError>
    open fun disassociateS3Resources(callback: (err: AWSError, data: DisassociateS3ResourcesResult) -> Unit = definedExternally): Request<DisassociateS3ResourcesResult, AWSError>
    open fun listMemberAccounts(params: ListMemberAccountsRequest, callback: (err: AWSError, data: ListMemberAccountsResult) -> Unit = definedExternally): Request<ListMemberAccountsResult, AWSError>
    open fun listMemberAccounts(callback: (err: AWSError, data: ListMemberAccountsResult) -> Unit = definedExternally): Request<ListMemberAccountsResult, AWSError>
    open fun listS3Resources(params: ListS3ResourcesRequest, callback: (err: AWSError, data: ListS3ResourcesResult) -> Unit = definedExternally): Request<ListS3ResourcesResult, AWSError>
    open fun listS3Resources(callback: (err: AWSError, data: ListS3ResourcesResult) -> Unit = definedExternally): Request<ListS3ResourcesResult, AWSError>
    open fun updateS3Resources(params: UpdateS3ResourcesRequest, callback: (err: AWSError, data: UpdateS3ResourcesResult) -> Unit = definedExternally): Request<UpdateS3ResourcesResult, AWSError>
    open fun updateS3Resources(callback: (err: AWSError, data: UpdateS3ResourcesResult) -> Unit = definedExternally): Request<UpdateS3ResourcesResult, AWSError>
    interface AssociateMemberAccountRequest {
        var memberAccountId: AWSAccountId
    }
    interface AssociateS3ResourcesRequest {
        var memberAccountId: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var s3Resources: S3ResourcesClassification
    }
    interface AssociateS3ResourcesResult {
        var failedS3Resources: FailedS3Resources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClassificationType {
        var oneTime: String /* "FULL" | "NONE" | String */
        var continuous: String /* "FULL" | String */
    }
    interface ClassificationTypeUpdate {
        var oneTime: String /* "FULL" | "NONE" | String */
        var continuous: String /* "FULL" | String */
    }
    interface DisassociateMemberAccountRequest {
        var memberAccountId: AWSAccountId
    }
    interface DisassociateS3ResourcesRequest {
        var memberAccountId: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var associatedS3Resources: S3Resources
    }
    interface DisassociateS3ResourcesResult {
        var failedS3Resources: FailedS3Resources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailedS3Resource {
        var failedItem: S3Resource?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: ExceptionMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMemberAccountsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMemberAccountsResult {
        var memberAccounts: MemberAccounts?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListS3ResourcesRequest {
        var memberAccountId: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListS3ResourcesResult {
        var s3Resources: S3ResourcesClassification?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MemberAccount {
        var accountId: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Resource {
        var bucketName: BucketName
        var prefix: Prefix?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3ResourceClassification {
        var bucketName: BucketName
        var prefix: Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var classificationType: ClassificationType
    }
    interface S3ResourceClassificationUpdate {
        var bucketName: BucketName
        var prefix: Prefix?
            get() = definedExternally
            set(value) = definedExternally
        var classificationTypeUpdate: ClassificationTypeUpdate
    }
    interface UpdateS3ResourcesRequest {
        var memberAccountId: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var s3ResourcesUpdate: S3ResourcesClassificationUpdate
    }
    interface UpdateS3ResourcesResult {
        var failedS3Resources: FailedS3Resources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-12-19" | "latest" | String */
    }
}