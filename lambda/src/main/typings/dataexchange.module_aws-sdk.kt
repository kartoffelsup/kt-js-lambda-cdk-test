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
import DataExchange.AssetDestinationEntry
import DataExchange.AssetSourceEntry
import DataExchange.AssetEntry
import DataExchange.DataSetEntry
import DataExchange.JobEntry
import DataExchange.JobError
import DataExchange.RevisionEntry
import DataExchange.CancelJobRequest
import DataExchange.CreateDataSetRequest
import DataExchange.CreateDataSetResponse
import DataExchange.CreateJobRequest
import DataExchange.CreateJobResponse
import DataExchange.CreateRevisionRequest
import DataExchange.CreateRevisionResponse
import DataExchange.DeleteAssetRequest
import DataExchange.DeleteDataSetRequest
import DataExchange.DeleteRevisionRequest
import DataExchange.GetAssetRequest
import DataExchange.GetAssetResponse
import DataExchange.GetDataSetRequest
import DataExchange.GetDataSetResponse
import DataExchange.GetJobRequest
import DataExchange.GetJobResponse
import DataExchange.GetRevisionRequest
import DataExchange.GetRevisionResponse
import DataExchange.ListDataSetRevisionsRequest
import DataExchange.ListDataSetRevisionsResponse
import DataExchange.ListDataSetsRequest
import DataExchange.ListDataSetsResponse
import DataExchange.ListJobsRequest
import DataExchange.ListJobsResponse
import DataExchange.ListRevisionAssetsRequest
import DataExchange.ListRevisionAssetsResponse
import DataExchange.ListTagsForResourceRequest
import DataExchange.ListTagsForResourceResponse
import DataExchange.StartJobRequest
import DataExchange.StartJobResponse
import DataExchange.TagResourceRequest
import DataExchange.UntagResourceRequest
import DataExchange.UpdateAssetRequest
import DataExchange.UpdateAssetResponse
import DataExchange.UpdateDataSetRequest
import DataExchange.UpdateDataSetResponse
import DataExchange.UpdateRevisionRequest
import DataExchange.UpdateRevisionResponse
import DataExchange.S3SnapshotAsset
import DataExchange.AssetDetails
import DataExchange.MapOf__string
import DataExchange.OriginDetails
import DataExchange.RequestDetails
import DataExchange.ResponseDetails
import DataExchange.ImportAssetFromSignedUrlJobErrorDetails
import DataExchange.Details
import DataExchange.ExportAssetToSignedUrlRequestDetails
import DataExchange.ExportAssetsToS3RequestDetails
import DataExchange.ImportAssetFromSignedUrlRequestDetails
import DataExchange.ImportAssetsFromS3RequestDetails
import DataExchange.ExportAssetToSignedUrlResponseDetails
import DataExchange.ExportAssetsToS3ResponseDetails
import DataExchange.ImportAssetFromSignedUrlResponseDetails
import DataExchange.ImportAssetsFromS3ResponseDetails

typealias Arn = String

typealias AssetName = String

typealias Description = String

typealias Id = String

typealias ListOfAssetDestinationEntry = Array<AssetDestinationEntry>

typealias ListOfAssetSourceEntry = Array<AssetSourceEntry>

typealias MaxResults = Number

typealias Name = String

typealias NextToken = String

typealias Timestamp = Date

typealias __boolean = Boolean

typealias __double = Number

typealias __doubleMin0 = Number

typealias ListOfAssetEntry = Array<AssetEntry>

typealias ListOfDataSetEntry = Array<DataSetEntry>

typealias ListOfJobEntry = Array<JobEntry>

typealias ListOfJobError = Array<JobError>

typealias ListOfRevisionEntry = Array<RevisionEntry>

typealias ListOf__string = Array<__string>

typealias __string = String

typealias __stringMin0Max16384 = String

typealias __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = String

@JsModule("aws-sdk")
external open class DataExchange(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DataExchange.Types.ClientConfiguration */
    open fun cancelJob(params: CancelJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun cancelJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun createDataSet(params: CreateDataSetRequest, callback: (err: AWSError, data: CreateDataSetResponse) -> Unit = definedExternally): Request<CreateDataSetResponse, AWSError>
    open fun createDataSet(callback: (err: AWSError, data: CreateDataSetResponse) -> Unit = definedExternally): Request<CreateDataSetResponse, AWSError>
    open fun createJob(params: CreateJobRequest, callback: (err: AWSError, data: CreateJobResponse) -> Unit = definedExternally): Request<CreateJobResponse, AWSError>
    open fun createJob(callback: (err: AWSError, data: CreateJobResponse) -> Unit = definedExternally): Request<CreateJobResponse, AWSError>
    open fun createRevision(params: CreateRevisionRequest, callback: (err: AWSError, data: CreateRevisionResponse) -> Unit = definedExternally): Request<CreateRevisionResponse, AWSError>
    open fun createRevision(callback: (err: AWSError, data: CreateRevisionResponse) -> Unit = definedExternally): Request<CreateRevisionResponse, AWSError>
    open fun deleteAsset(params: DeleteAssetRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteAsset(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDataSet(params: DeleteDataSetRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteDataSet(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRevision(params: DeleteRevisionRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteRevision(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getAsset(params: GetAssetRequest, callback: (err: AWSError, data: GetAssetResponse) -> Unit = definedExternally): Request<GetAssetResponse, AWSError>
    open fun getAsset(callback: (err: AWSError, data: GetAssetResponse) -> Unit = definedExternally): Request<GetAssetResponse, AWSError>
    open fun getDataSet(params: GetDataSetRequest, callback: (err: AWSError, data: GetDataSetResponse) -> Unit = definedExternally): Request<GetDataSetResponse, AWSError>
    open fun getDataSet(callback: (err: AWSError, data: GetDataSetResponse) -> Unit = definedExternally): Request<GetDataSetResponse, AWSError>
    open fun getJob(params: GetJobRequest, callback: (err: AWSError, data: GetJobResponse) -> Unit = definedExternally): Request<GetJobResponse, AWSError>
    open fun getJob(callback: (err: AWSError, data: GetJobResponse) -> Unit = definedExternally): Request<GetJobResponse, AWSError>
    open fun getRevision(params: GetRevisionRequest, callback: (err: AWSError, data: GetRevisionResponse) -> Unit = definedExternally): Request<GetRevisionResponse, AWSError>
    open fun getRevision(callback: (err: AWSError, data: GetRevisionResponse) -> Unit = definedExternally): Request<GetRevisionResponse, AWSError>
    open fun listDataSetRevisions(params: ListDataSetRevisionsRequest, callback: (err: AWSError, data: ListDataSetRevisionsResponse) -> Unit = definedExternally): Request<ListDataSetRevisionsResponse, AWSError>
    open fun listDataSetRevisions(callback: (err: AWSError, data: ListDataSetRevisionsResponse) -> Unit = definedExternally): Request<ListDataSetRevisionsResponse, AWSError>
    open fun listDataSets(params: ListDataSetsRequest, callback: (err: AWSError, data: ListDataSetsResponse) -> Unit = definedExternally): Request<ListDataSetsResponse, AWSError>
    open fun listDataSets(callback: (err: AWSError, data: ListDataSetsResponse) -> Unit = definedExternally): Request<ListDataSetsResponse, AWSError>
    open fun listJobs(params: ListJobsRequest, callback: (err: AWSError, data: ListJobsResponse) -> Unit = definedExternally): Request<ListJobsResponse, AWSError>
    open fun listJobs(callback: (err: AWSError, data: ListJobsResponse) -> Unit = definedExternally): Request<ListJobsResponse, AWSError>
    open fun listRevisionAssets(params: ListRevisionAssetsRequest, callback: (err: AWSError, data: ListRevisionAssetsResponse) -> Unit = definedExternally): Request<ListRevisionAssetsResponse, AWSError>
    open fun listRevisionAssets(callback: (err: AWSError, data: ListRevisionAssetsResponse) -> Unit = definedExternally): Request<ListRevisionAssetsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun startJob(params: StartJobRequest, callback: (err: AWSError, data: StartJobResponse) -> Unit = definedExternally): Request<StartJobResponse, AWSError>
    open fun startJob(callback: (err: AWSError, data: StartJobResponse) -> Unit = definedExternally): Request<StartJobResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun tagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun untagResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateAsset(params: UpdateAssetRequest, callback: (err: AWSError, data: UpdateAssetResponse) -> Unit = definedExternally): Request<UpdateAssetResponse, AWSError>
    open fun updateAsset(callback: (err: AWSError, data: UpdateAssetResponse) -> Unit = definedExternally): Request<UpdateAssetResponse, AWSError>
    open fun updateDataSet(params: UpdateDataSetRequest, callback: (err: AWSError, data: UpdateDataSetResponse) -> Unit = definedExternally): Request<UpdateDataSetResponse, AWSError>
    open fun updateDataSet(callback: (err: AWSError, data: UpdateDataSetResponse) -> Unit = definedExternally): Request<UpdateDataSetResponse, AWSError>
    open fun updateRevision(params: UpdateRevisionRequest, callback: (err: AWSError, data: UpdateRevisionResponse) -> Unit = definedExternally): Request<UpdateRevisionResponse, AWSError>
    open fun updateRevision(callback: (err: AWSError, data: UpdateRevisionResponse) -> Unit = definedExternally): Request<UpdateRevisionResponse, AWSError>
    interface AssetDestinationEntry {
        var AssetId: Id
        var Bucket: __string
        var Key: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssetDetails {
        var S3SnapshotAsset: S3SnapshotAsset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssetEntry {
        var Arn: Arn
        var AssetDetails: AssetDetails
        var AssetType: String /* "S3_SNAPSHOT" | String */
        var CreatedAt: Timestamp
        var DataSetId: Id
        var Id: Id
        var Name: AssetName
        var RevisionId: Id
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp
    }
    interface AssetSourceEntry {
        var Bucket: __string
        var Key: __string
    }
    interface CancelJobRequest {
        var JobId: __string
    }
    interface CreateDataSetRequest {
        var AssetType: String /* "S3_SNAPSHOT" | String */
        var Description: Description
        var Name: Name
        var Tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataSetResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AssetType: String /* "S3_SNAPSHOT" | String */
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Origin: String /* "OWNED" | "ENTITLED" | String */
        var OriginDetails: OriginDetails?
            get() = definedExternally
            set(value) = definedExternally
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobRequest {
        var Details: RequestDetails
        var Type: String /* "IMPORT_ASSETS_FROM_S3" | "IMPORT_ASSET_FROM_SIGNED_URL" | "EXPORT_ASSETS_TO_S3" | "EXPORT_ASSET_TO_SIGNED_URL" | String */
    }
    interface CreateJobResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Details: ResponseDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Errors: ListOfJobError?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "WAITING" | "IN_PROGRESS" | "ERROR" | "COMPLETED" | "CANCELLED" | "TIMED_OUT" | String */
        var Type: String /* "IMPORT_ASSETS_FROM_S3" | "IMPORT_ASSET_FROM_SIGNED_URL" | "EXPORT_ASSETS_TO_S3" | "EXPORT_ASSET_TO_SIGNED_URL" | String */
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRevisionRequest {
        var Comment: __stringMin0Max16384?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: __string
        var Tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRevisionResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Comment: __stringMin0Max16384?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Finalized: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSetEntry {
        var Arn: Arn
        var AssetType: String /* "S3_SNAPSHOT" | String */
        var CreatedAt: Timestamp
        var Description: Description
        var Id: Id
        var Name: Name
        var Origin: String /* "OWNED" | "ENTITLED" | String */
        var OriginDetails: OriginDetails?
            get() = definedExternally
            set(value) = definedExternally
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp
    }
    interface DeleteAssetRequest {
        var AssetId: __string
        var DataSetId: __string
        var RevisionId: __string
    }
    interface DeleteDataSetRequest {
        var DataSetId: __string
    }
    interface DeleteRevisionRequest {
        var DataSetId: __string
        var RevisionId: __string
    }
    interface Details {
        var ImportAssetFromSignedUrlJobErrorDetails: ImportAssetFromSignedUrlJobErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ImportAssetsFromS3JobErrorDetails: ListOfAssetSourceEntry?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportAssetToSignedUrlRequestDetails {
        var AssetId: Id
        var DataSetId: Id
        var RevisionId: Id
    }
    interface ExportAssetToSignedUrlResponseDetails {
        var AssetId: Id
        var DataSetId: Id
        var RevisionId: Id
        var SignedUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SignedUrlExpiresAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportAssetsToS3RequestDetails {
        var AssetDestinations: ListOfAssetDestinationEntry
        var DataSetId: Id
        var RevisionId: Id
    }
    interface ExportAssetsToS3ResponseDetails {
        var AssetDestinations: ListOfAssetDestinationEntry
        var DataSetId: Id
        var RevisionId: Id
    }
    interface GetAssetRequest {
        var AssetId: __string
        var DataSetId: __string
        var RevisionId: __string
    }
    interface GetAssetResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AssetDetails: AssetDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AssetType: String /* "S3_SNAPSHOT" | String */
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: AssetName?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataSetRequest {
        var DataSetId: __string
    }
    interface GetDataSetResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AssetType: String /* "S3_SNAPSHOT" | String */
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Origin: String /* "OWNED" | "ENTITLED" | String */
        var OriginDetails: OriginDetails?
            get() = definedExternally
            set(value) = definedExternally
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobRequest {
        var JobId: __string
    }
    interface GetJobResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Details: ResponseDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Errors: ListOfJobError?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "WAITING" | "IN_PROGRESS" | "ERROR" | "COMPLETED" | "CANCELLED" | "TIMED_OUT" | String */
        var Type: String /* "IMPORT_ASSETS_FROM_S3" | "IMPORT_ASSET_FROM_SIGNED_URL" | "EXPORT_ASSETS_TO_S3" | "EXPORT_ASSET_TO_SIGNED_URL" | String */
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRevisionRequest {
        var DataSetId: __string
        var RevisionId: __string
    }
    interface GetRevisionResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Comment: __stringMin0Max16384?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Finalized: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportAssetFromSignedUrlJobErrorDetails {
        var AssetName: AssetName
    }
    interface ImportAssetFromSignedUrlRequestDetails {
        var AssetName: AssetName
        var DataSetId: Id
        var Md5Hash: __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093
        var RevisionId: Id
    }
    interface ImportAssetFromSignedUrlResponseDetails {
        var AssetName: AssetName
        var DataSetId: Id
        var Md5Hash: __stringMin24Max24PatternAZaZ094AZaZ092AZaZ093?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: Id
        var SignedUrl: __string?
            get() = definedExternally
            set(value) = definedExternally
        var SignedUrlExpiresAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportAssetsFromS3RequestDetails {
        var AssetSources: ListOfAssetSourceEntry
        var DataSetId: Id
        var RevisionId: Id
    }
    interface ImportAssetsFromS3ResponseDetails {
        var AssetSources: ListOfAssetSourceEntry
        var DataSetId: Id
        var RevisionId: Id
    }
    interface JobEntry {
        var Arn: Arn
        var CreatedAt: Timestamp
        var Details: ResponseDetails
        var Errors: ListOfJobError?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
        var State: String /* "WAITING" | "IN_PROGRESS" | "ERROR" | "COMPLETED" | "CANCELLED" | "TIMED_OUT" | String */
        var Type: String /* "IMPORT_ASSETS_FROM_S3" | "IMPORT_ASSET_FROM_SIGNED_URL" | "EXPORT_ASSETS_TO_S3" | "EXPORT_ASSET_TO_SIGNED_URL" | String */
        var UpdatedAt: Timestamp
    }
    interface JobError {
        var Code: String /* "ACCESS_DENIED_EXCEPTION" | "INTERNAL_SERVER_EXCEPTION" | "MALWARE_DETECTED" | "RESOURCE_NOT_FOUND_EXCEPTION" | "SERVICE_QUOTA_EXCEEDED_EXCEPTION" | "VALIDATION_EXCEPTION" | "MALWARE_SCAN_ENCRYPTED_FILE" | String */
        var Details: Details?
            get() = definedExternally
            set(value) = definedExternally
        var LimitName: String /* "Assets per revision" | "Asset size in GB" | String */
        var LimitValue: __double?
            get() = definedExternally
            set(value) = definedExternally
        var Message: __string
        var ResourceId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: String /* "REVISION" | "ASSET" | String */
    }
    interface ListDataSetRevisionsRequest {
        var DataSetId: __string
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSetRevisionsResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var Revisions: ListOfRevisionEntry?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSetsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var Origin: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSetsResponse {
        var DataSets: ListOfDataSetEntry?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsRequest {
        var DataSetId: __string?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: __string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsResponse {
        var Jobs: ListOfJobEntry?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRevisionAssetsRequest {
        var DataSetId: __string
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: __string?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: __string
    }
    interface ListRevisionAssetsResponse {
        var Assets: ListOfAssetEntry?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: __string
    }
    interface ListTagsForResourceResponse {
        var Tags: MapOf__string?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OriginDetails {
        var ProductId: __string
    }
    interface RequestDetails {
        var ExportAssetToSignedUrl: ExportAssetToSignedUrlRequestDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ExportAssetsToS3: ExportAssetsToS3RequestDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ImportAssetFromSignedUrl: ImportAssetFromSignedUrlRequestDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ImportAssetsFromS3: ImportAssetsFromS3RequestDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResponseDetails {
        var ExportAssetToSignedUrl: ExportAssetToSignedUrlResponseDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ExportAssetsToS3: ExportAssetsToS3ResponseDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ImportAssetFromSignedUrl: ImportAssetFromSignedUrlResponseDetails?
            get() = definedExternally
            set(value) = definedExternally
        var ImportAssetsFromS3: ImportAssetsFromS3ResponseDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RevisionEntry {
        var Arn: Arn
        var Comment: __stringMin0Max16384?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp
        var DataSetId: Id
        var Finalized: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp
    }
    interface S3SnapshotAsset {
        var Size: __doubleMin0
    }
    interface StartJobRequest {
        var JobId: __string
    }
    interface StartJobResponse
    interface TagResourceRequest {
        var ResourceArn: __string
        var Tags: MapOf__string
    }
    interface UntagResourceRequest {
        var ResourceArn: __string
        var TagKeys: ListOf__string
    }
    interface UpdateAssetRequest {
        var AssetId: __string
        var DataSetId: __string
        var Name: AssetName
        var RevisionId: __string
    }
    interface UpdateAssetResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AssetDetails: AssetDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AssetType: String /* "S3_SNAPSHOT" | String */
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: AssetName?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSetRequest {
        var DataSetId: __string
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSetResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var AssetType: String /* "S3_SNAPSHOT" | String */
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var Origin: String /* "OWNED" | "ENTITLED" | String */
        var OriginDetails: OriginDetails?
            get() = definedExternally
            set(value) = definedExternally
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRevisionRequest {
        var Comment: __stringMin0Max16384?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: __string
        var Finalized: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var RevisionId: __string
    }
    interface UpdateRevisionResponse {
        var Arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var Comment: __stringMin0Max16384?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DataSetId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var Finalized: __boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Id?
            get() = definedExternally
            set(value) = definedExternally
        var SourceId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MapOf__string {
        @nativeGetter
        operator fun get(key: String): __string?
        @nativeSetter
        operator fun set(key: String, value: __string)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-07-25" | "latest" | String */
    }
}