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
import QLDB.JournalS3ExportDescription
import QLDB.LedgerSummary
import QLDB.CreateLedgerRequest
import QLDB.CreateLedgerResponse
import QLDB.DeleteLedgerRequest
import QLDB.DescribeJournalS3ExportRequest
import QLDB.DescribeJournalS3ExportResponse
import QLDB.DescribeLedgerRequest
import QLDB.DescribeLedgerResponse
import QLDB.ExportJournalToS3Request
import QLDB.ExportJournalToS3Response
import QLDB.GetBlockRequest
import QLDB.GetBlockResponse
import QLDB.GetDigestRequest
import QLDB.GetDigestResponse
import QLDB.GetRevisionRequest
import QLDB.GetRevisionResponse
import QLDB.ListJournalS3ExportsRequest
import QLDB.ListJournalS3ExportsResponse
import QLDB.ListJournalS3ExportsForLedgerRequest
import QLDB.ListJournalS3ExportsForLedgerResponse
import QLDB.ListLedgersRequest
import QLDB.ListLedgersResponse
import QLDB.ListTagsForResourceRequest
import QLDB.ListTagsForResourceResponse
import QLDB.TagResourceRequest
import QLDB.TagResourceResponse
import QLDB.UntagResourceRequest
import QLDB.UntagResourceResponse
import QLDB.UpdateLedgerRequest
import QLDB.UpdateLedgerResponse
import QLDB.Tags
import QLDB.S3ExportConfiguration
import QLDB.ValueHolder
import QLDB.S3EncryptionConfiguration

typealias Arn = String

typealias DeletionProtection = Boolean

typealias IonText = String

typealias JournalS3ExportList = Array<JournalS3ExportDescription>

typealias LedgerList = Array<LedgerSummary>

typealias LedgerName = String

typealias MaxResults = Number

typealias NextToken = String

typealias S3Bucket = String

typealias S3Prefix = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Timestamp = Date

typealias UniqueId = String

@JsModule("aws-sdk")
external open class QLDB(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & QLDB.Types.ClientConfiguration */
    open fun createLedger(params: CreateLedgerRequest, callback: (err: AWSError, data: CreateLedgerResponse) -> Unit = definedExternally): Request<CreateLedgerResponse, AWSError>
    open fun createLedger(callback: (err: AWSError, data: CreateLedgerResponse) -> Unit = definedExternally): Request<CreateLedgerResponse, AWSError>
    open fun deleteLedger(params: DeleteLedgerRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteLedger(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeJournalS3Export(params: DescribeJournalS3ExportRequest, callback: (err: AWSError, data: DescribeJournalS3ExportResponse) -> Unit = definedExternally): Request<DescribeJournalS3ExportResponse, AWSError>
    open fun describeJournalS3Export(callback: (err: AWSError, data: DescribeJournalS3ExportResponse) -> Unit = definedExternally): Request<DescribeJournalS3ExportResponse, AWSError>
    open fun describeLedger(params: DescribeLedgerRequest, callback: (err: AWSError, data: DescribeLedgerResponse) -> Unit = definedExternally): Request<DescribeLedgerResponse, AWSError>
    open fun describeLedger(callback: (err: AWSError, data: DescribeLedgerResponse) -> Unit = definedExternally): Request<DescribeLedgerResponse, AWSError>
    open fun exportJournalToS3(params: ExportJournalToS3Request, callback: (err: AWSError, data: ExportJournalToS3Response) -> Unit = definedExternally): Request<ExportJournalToS3Response, AWSError>
    open fun exportJournalToS3(callback: (err: AWSError, data: ExportJournalToS3Response) -> Unit = definedExternally): Request<ExportJournalToS3Response, AWSError>
    open fun getBlock(params: GetBlockRequest, callback: (err: AWSError, data: GetBlockResponse) -> Unit = definedExternally): Request<GetBlockResponse, AWSError>
    open fun getBlock(callback: (err: AWSError, data: GetBlockResponse) -> Unit = definedExternally): Request<GetBlockResponse, AWSError>
    open fun getDigest(params: GetDigestRequest, callback: (err: AWSError, data: GetDigestResponse) -> Unit = definedExternally): Request<GetDigestResponse, AWSError>
    open fun getDigest(callback: (err: AWSError, data: GetDigestResponse) -> Unit = definedExternally): Request<GetDigestResponse, AWSError>
    open fun getRevision(params: GetRevisionRequest, callback: (err: AWSError, data: GetRevisionResponse) -> Unit = definedExternally): Request<GetRevisionResponse, AWSError>
    open fun getRevision(callback: (err: AWSError, data: GetRevisionResponse) -> Unit = definedExternally): Request<GetRevisionResponse, AWSError>
    open fun listJournalS3Exports(params: ListJournalS3ExportsRequest, callback: (err: AWSError, data: ListJournalS3ExportsResponse) -> Unit = definedExternally): Request<ListJournalS3ExportsResponse, AWSError>
    open fun listJournalS3Exports(callback: (err: AWSError, data: ListJournalS3ExportsResponse) -> Unit = definedExternally): Request<ListJournalS3ExportsResponse, AWSError>
    open fun listJournalS3ExportsForLedger(params: ListJournalS3ExportsForLedgerRequest, callback: (err: AWSError, data: ListJournalS3ExportsForLedgerResponse) -> Unit = definedExternally): Request<ListJournalS3ExportsForLedgerResponse, AWSError>
    open fun listJournalS3ExportsForLedger(callback: (err: AWSError, data: ListJournalS3ExportsForLedgerResponse) -> Unit = definedExternally): Request<ListJournalS3ExportsForLedgerResponse, AWSError>
    open fun listLedgers(params: ListLedgersRequest, callback: (err: AWSError, data: ListLedgersResponse) -> Unit = definedExternally): Request<ListLedgersResponse, AWSError>
    open fun listLedgers(callback: (err: AWSError, data: ListLedgersResponse) -> Unit = definedExternally): Request<ListLedgersResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateLedger(params: UpdateLedgerRequest, callback: (err: AWSError, data: UpdateLedgerResponse) -> Unit = definedExternally): Request<UpdateLedgerResponse, AWSError>
    open fun updateLedger(callback: (err: AWSError, data: UpdateLedgerResponse) -> Unit = definedExternally): Request<UpdateLedgerResponse, AWSError>
    interface CreateLedgerRequest {
        var Name: LedgerName
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionsMode: String /* "ALLOW_ALL" | String */
        var DeletionProtection: DeletionProtection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLedgerResponse {
        var Name: LedgerName?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "ACTIVE" | "DELETING" | "DELETED" | String */
        var CreationDateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: DeletionProtection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteLedgerRequest {
        var Name: LedgerName
    }
    interface DescribeJournalS3ExportRequest {
        var Name: LedgerName
        var ExportId: UniqueId
    }
    interface DescribeJournalS3ExportResponse {
        var ExportDescription: JournalS3ExportDescription
    }
    interface DescribeLedgerRequest {
        var Name: LedgerName
    }
    interface DescribeLedgerResponse {
        var Name: LedgerName?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "ACTIVE" | "DELETING" | "DELETED" | String */
        var CreationDateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: DeletionProtection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportJournalToS3Request {
        var Name: LedgerName
        var InclusiveStartTime: Timestamp
        var ExclusiveEndTime: Timestamp
        var S3ExportConfiguration: S3ExportConfiguration
        var RoleArn: Arn
    }
    interface ExportJournalToS3Response {
        var ExportId: UniqueId
    }
    interface GetBlockRequest {
        var Name: LedgerName
        var BlockAddress: ValueHolder
        var DigestTipAddress: ValueHolder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetBlockResponse {
        var Block: ValueHolder
        var Proof: ValueHolder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDigestRequest {
        var Name: LedgerName
    }
    interface GetDigestResponse {
        var Digest: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var DigestTipAddress: ValueHolder
    }
    interface GetRevisionRequest {
        var Name: LedgerName
        var BlockAddress: ValueHolder
        var DocumentId: UniqueId
        var DigestTipAddress: ValueHolder?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRevisionResponse {
        var Proof: ValueHolder?
            get() = definedExternally
            set(value) = definedExternally
        var Revision: ValueHolder
    }
    interface JournalS3ExportDescription {
        var LedgerName: LedgerName
        var ExportId: UniqueId
        var ExportCreationTime: Timestamp
        var Status: String /* "IN_PROGRESS" | "COMPLETED" | "CANCELLED" | String */
        var InclusiveStartTime: Timestamp
        var ExclusiveEndTime: Timestamp
        var S3ExportConfiguration: S3ExportConfiguration
        var RoleArn: Arn
    }
    interface LedgerSummary {
        var Name: LedgerName?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "ACTIVE" | "DELETING" | "DELETED" | String */
        var CreationDateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJournalS3ExportsForLedgerRequest {
        var Name: LedgerName
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJournalS3ExportsForLedgerResponse {
        var JournalS3Exports: JournalS3ExportList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJournalS3ExportsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJournalS3ExportsResponse {
        var JournalS3Exports: JournalS3ExportList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLedgersRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLedgersResponse {
        var Ledgers: LedgerList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: Arn
    }
    interface ListTagsForResourceResponse {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3EncryptionConfiguration {
        var ObjectEncryptionType: String /* "SSE_KMS" | "SSE_S3" | "NO_ENCRYPTION" | String */
        var KmsKeyArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3ExportConfiguration {
        var Bucket: S3Bucket
        var Prefix: S3Prefix
        var EncryptionConfiguration: S3EncryptionConfiguration
    }
    interface TagResourceRequest {
        var ResourceArn: Arn
        var Tags: Tags
    }
    interface TagResourceResponse
    interface Tags {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface UntagResourceRequest {
        var ResourceArn: Arn
        var TagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateLedgerRequest {
        var Name: LedgerName
        var DeletionProtection: DeletionProtection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateLedgerResponse {
        var Name: LedgerName?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATING" | "ACTIVE" | "DELETING" | "DELETED" | String */
        var CreationDateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionProtection: DeletionProtection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValueHolder {
        var IonText: IonText?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-01-02" | "latest" | String */
    }
}