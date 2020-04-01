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
import CognitoSync.Dataset
import CognitoSync.IdentityPoolUsage
import CognitoSync.Record
import CognitoSync.RecordPatch
import CognitoSync.BulkPublishRequest
import CognitoSync.BulkPublishResponse
import CognitoSync.DeleteDatasetRequest
import CognitoSync.DeleteDatasetResponse
import CognitoSync.DescribeDatasetRequest
import CognitoSync.DescribeDatasetResponse
import CognitoSync.DescribeIdentityPoolUsageRequest
import CognitoSync.DescribeIdentityPoolUsageResponse
import CognitoSync.DescribeIdentityUsageRequest
import CognitoSync.DescribeIdentityUsageResponse
import CognitoSync.GetBulkPublishDetailsRequest
import CognitoSync.GetBulkPublishDetailsResponse
import CognitoSync.GetCognitoEventsRequest
import CognitoSync.GetCognitoEventsResponse
import CognitoSync.GetIdentityPoolConfigurationRequest
import CognitoSync.GetIdentityPoolConfigurationResponse
import CognitoSync.ListDatasetsRequest
import CognitoSync.ListDatasetsResponse
import CognitoSync.ListIdentityPoolUsageRequest
import CognitoSync.ListIdentityPoolUsageResponse
import CognitoSync.ListRecordsRequest
import CognitoSync.ListRecordsResponse
import CognitoSync.RegisterDeviceRequest
import CognitoSync.RegisterDeviceResponse
import CognitoSync.SetCognitoEventsRequest
import CognitoSync.SetIdentityPoolConfigurationRequest
import CognitoSync.SetIdentityPoolConfigurationResponse
import CognitoSync.SubscribeToDatasetRequest
import CognitoSync.SubscribeToDatasetResponse
import CognitoSync.UnsubscribeFromDatasetRequest
import CognitoSync.UnsubscribeFromDatasetResponse
import CognitoSync.UpdateRecordsRequest
import CognitoSync.UpdateRecordsResponse
import CognitoSync.IdentityUsage
import CognitoSync.Events
import CognitoSync.PushSync
import CognitoSync.CognitoStreams

typealias ApplicationArn = String

typealias ApplicationArnList = Array<ApplicationArn>

typealias AssumeRoleArn = String

typealias Boolean = Boolean

typealias ClientContext = String

typealias CognitoEventType = String

typealias DatasetList = Array<Dataset>

typealias DatasetName = String

typealias _Date = Date

typealias DeviceId = String

typealias IdentityId = String

typealias IdentityPoolId = String

typealias IdentityPoolUsageList = Array<IdentityPoolUsage>

typealias Integer = Number

typealias IntegerString = Number

typealias LambdaFunctionArn = String

typealias Long = Number

typealias MergedDatasetNameList = Array<String>

typealias PushToken = String

typealias RecordKey = String

typealias RecordList = Array<Record>

typealias RecordPatchList = Array<RecordPatch>

typealias RecordValue = String

typealias StreamName = String

typealias String = String

typealias SyncSessionToken = String

@JsModule("aws-sdk")
external open class CognitoSync(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CognitoSync.Types.ClientConfiguration */
    open fun bulkPublish(params: BulkPublishRequest, callback: (err: AWSError, data: BulkPublishResponse) -> Unit = definedExternally): Request<BulkPublishResponse, AWSError>
    open fun bulkPublish(callback: (err: AWSError, data: BulkPublishResponse) -> Unit = definedExternally): Request<BulkPublishResponse, AWSError>
    open fun deleteDataset(params: DeleteDatasetRequest, callback: (err: AWSError, data: DeleteDatasetResponse) -> Unit = definedExternally): Request<DeleteDatasetResponse, AWSError>
    open fun deleteDataset(callback: (err: AWSError, data: DeleteDatasetResponse) -> Unit = definedExternally): Request<DeleteDatasetResponse, AWSError>
    open fun describeDataset(params: DescribeDatasetRequest, callback: (err: AWSError, data: DescribeDatasetResponse) -> Unit = definedExternally): Request<DescribeDatasetResponse, AWSError>
    open fun describeDataset(callback: (err: AWSError, data: DescribeDatasetResponse) -> Unit = definedExternally): Request<DescribeDatasetResponse, AWSError>
    open fun describeIdentityPoolUsage(params: DescribeIdentityPoolUsageRequest, callback: (err: AWSError, data: DescribeIdentityPoolUsageResponse) -> Unit = definedExternally): Request<DescribeIdentityPoolUsageResponse, AWSError>
    open fun describeIdentityPoolUsage(callback: (err: AWSError, data: DescribeIdentityPoolUsageResponse) -> Unit = definedExternally): Request<DescribeIdentityPoolUsageResponse, AWSError>
    open fun describeIdentityUsage(params: DescribeIdentityUsageRequest, callback: (err: AWSError, data: DescribeIdentityUsageResponse) -> Unit = definedExternally): Request<DescribeIdentityUsageResponse, AWSError>
    open fun describeIdentityUsage(callback: (err: AWSError, data: DescribeIdentityUsageResponse) -> Unit = definedExternally): Request<DescribeIdentityUsageResponse, AWSError>
    open fun getBulkPublishDetails(params: GetBulkPublishDetailsRequest, callback: (err: AWSError, data: GetBulkPublishDetailsResponse) -> Unit = definedExternally): Request<GetBulkPublishDetailsResponse, AWSError>
    open fun getBulkPublishDetails(callback: (err: AWSError, data: GetBulkPublishDetailsResponse) -> Unit = definedExternally): Request<GetBulkPublishDetailsResponse, AWSError>
    open fun getCognitoEvents(params: GetCognitoEventsRequest, callback: (err: AWSError, data: GetCognitoEventsResponse) -> Unit = definedExternally): Request<GetCognitoEventsResponse, AWSError>
    open fun getCognitoEvents(callback: (err: AWSError, data: GetCognitoEventsResponse) -> Unit = definedExternally): Request<GetCognitoEventsResponse, AWSError>
    open fun getIdentityPoolConfiguration(params: GetIdentityPoolConfigurationRequest, callback: (err: AWSError, data: GetIdentityPoolConfigurationResponse) -> Unit = definedExternally): Request<GetIdentityPoolConfigurationResponse, AWSError>
    open fun getIdentityPoolConfiguration(callback: (err: AWSError, data: GetIdentityPoolConfigurationResponse) -> Unit = definedExternally): Request<GetIdentityPoolConfigurationResponse, AWSError>
    open fun listDatasets(params: ListDatasetsRequest, callback: (err: AWSError, data: ListDatasetsResponse) -> Unit = definedExternally): Request<ListDatasetsResponse, AWSError>
    open fun listDatasets(callback: (err: AWSError, data: ListDatasetsResponse) -> Unit = definedExternally): Request<ListDatasetsResponse, AWSError>
    open fun listIdentityPoolUsage(params: ListIdentityPoolUsageRequest, callback: (err: AWSError, data: ListIdentityPoolUsageResponse) -> Unit = definedExternally): Request<ListIdentityPoolUsageResponse, AWSError>
    open fun listIdentityPoolUsage(callback: (err: AWSError, data: ListIdentityPoolUsageResponse) -> Unit = definedExternally): Request<ListIdentityPoolUsageResponse, AWSError>
    open fun listRecords(params: ListRecordsRequest, callback: (err: AWSError, data: ListRecordsResponse) -> Unit = definedExternally): Request<ListRecordsResponse, AWSError>
    open fun listRecords(callback: (err: AWSError, data: ListRecordsResponse) -> Unit = definedExternally): Request<ListRecordsResponse, AWSError>
    open fun registerDevice(params: RegisterDeviceRequest, callback: (err: AWSError, data: RegisterDeviceResponse) -> Unit = definedExternally): Request<RegisterDeviceResponse, AWSError>
    open fun registerDevice(callback: (err: AWSError, data: RegisterDeviceResponse) -> Unit = definedExternally): Request<RegisterDeviceResponse, AWSError>
    open fun setCognitoEvents(params: SetCognitoEventsRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setCognitoEvents(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setIdentityPoolConfiguration(params: SetIdentityPoolConfigurationRequest, callback: (err: AWSError, data: SetIdentityPoolConfigurationResponse) -> Unit = definedExternally): Request<SetIdentityPoolConfigurationResponse, AWSError>
    open fun setIdentityPoolConfiguration(callback: (err: AWSError, data: SetIdentityPoolConfigurationResponse) -> Unit = definedExternally): Request<SetIdentityPoolConfigurationResponse, AWSError>
    open fun subscribeToDataset(params: SubscribeToDatasetRequest, callback: (err: AWSError, data: SubscribeToDatasetResponse) -> Unit = definedExternally): Request<SubscribeToDatasetResponse, AWSError>
    open fun subscribeToDataset(callback: (err: AWSError, data: SubscribeToDatasetResponse) -> Unit = definedExternally): Request<SubscribeToDatasetResponse, AWSError>
    open fun unsubscribeFromDataset(params: UnsubscribeFromDatasetRequest, callback: (err: AWSError, data: UnsubscribeFromDatasetResponse) -> Unit = definedExternally): Request<UnsubscribeFromDatasetResponse, AWSError>
    open fun unsubscribeFromDataset(callback: (err: AWSError, data: UnsubscribeFromDatasetResponse) -> Unit = definedExternally): Request<UnsubscribeFromDatasetResponse, AWSError>
    open fun updateRecords(params: UpdateRecordsRequest, callback: (err: AWSError, data: UpdateRecordsResponse) -> Unit = definedExternally): Request<UpdateRecordsResponse, AWSError>
    open fun updateRecords(callback: (err: AWSError, data: UpdateRecordsResponse) -> Unit = definedExternally): Request<UpdateRecordsResponse, AWSError>
    interface BulkPublishRequest {
        var IdentityPoolId: IdentityPoolId
    }
    interface BulkPublishResponse {
        var IdentityPoolId: IdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CognitoStreams {
        var StreamName: StreamName?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: AssumeRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var StreamingStatus: String /* "ENABLED" | "DISABLED" | String */
    }
    interface Dataset {
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetName: DatasetName?
            get() = definedExternally
            set(value) = definedExternally
        var CreationDate: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var DataStorage: Long?
            get() = definedExternally
            set(value) = definedExternally
        var NumRecords: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteDatasetRequest {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId
        var DatasetName: DatasetName
    }
    interface DeleteDatasetResponse {
        var Dataset: Dataset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDatasetRequest {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId
        var DatasetName: DatasetName
    }
    interface DescribeDatasetResponse {
        var Dataset: Dataset?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeIdentityPoolUsageRequest {
        var IdentityPoolId: IdentityPoolId
    }
    interface DescribeIdentityPoolUsageResponse {
        var IdentityPoolUsage: IdentityPoolUsage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeIdentityUsageRequest {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId
    }
    interface DescribeIdentityUsageResponse {
        var IdentityUsage: IdentityUsage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Events {
        @nativeGetter
        operator fun get(key: String): LambdaFunctionArn?
        @nativeSetter
        operator fun set(key: String, value: LambdaFunctionArn)
    }
    interface GetBulkPublishDetailsRequest {
        var IdentityPoolId: IdentityPoolId
    }
    interface GetBulkPublishDetailsResponse {
        var IdentityPoolId: IdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var BulkPublishStartTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var BulkPublishCompleteTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var BulkPublishStatus: String /* "NOT_STARTED" | "IN_PROGRESS" | "FAILED" | "SUCCEEDED" | String */
        var FailureMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCognitoEventsRequest {
        var IdentityPoolId: IdentityPoolId
    }
    interface GetCognitoEventsResponse {
        var Events: Events?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetIdentityPoolConfigurationRequest {
        var IdentityPoolId: IdentityPoolId
    }
    interface GetIdentityPoolConfigurationResponse {
        var IdentityPoolId: IdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var PushSync: PushSync?
            get() = definedExternally
            set(value) = definedExternally
        var CognitoStreams: CognitoStreams?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityPoolUsage {
        var IdentityPoolId: IdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var SyncSessionsCount: Long?
            get() = definedExternally
            set(value) = definedExternally
        var DataStorage: Long?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IdentityUsage {
        var IdentityId: IdentityId?
            get() = definedExternally
            set(value) = definedExternally
        var IdentityPoolId: IdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DataStorage: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetsRequest {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: IntegerString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDatasetsResponse {
        var Datasets: DatasetList?
            get() = definedExternally
            set(value) = definedExternally
        var Count: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIdentityPoolUsageRequest {
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: IntegerString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIdentityPoolUsageResponse {
        var IdentityPoolUsages: IdentityPoolUsageList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Count: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecordsRequest {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId
        var DatasetName: DatasetName
        var LastSyncCount: Long?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: IntegerString?
            get() = definedExternally
            set(value) = definedExternally
        var SyncSessionToken: SyncSessionToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRecordsResponse {
        var Records: RecordList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var Count: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetSyncCount: Long?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var MergedDatasetNames: MergedDatasetNameList?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetExists: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var DatasetDeletedAfterRequestedSyncCount: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var SyncSessionToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PushSync {
        var ApplicationArns: ApplicationArnList?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: AssumeRoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Record {
        var Key: RecordKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: RecordValue?
            get() = definedExternally
            set(value) = definedExternally
        var SyncCount: Long?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedDate: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBy: String?
            get() = definedExternally
            set(value) = definedExternally
        var DeviceLastModifiedDate: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordPatch {
        var Op: String /* "replace" | "remove" | String */
        var Key: RecordKey
        var Value: RecordValue?
            get() = definedExternally
            set(value) = definedExternally
        var SyncCount: Long
        var DeviceLastModifiedDate: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterDeviceRequest {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId
        var Platform: String /* "APNS" | "APNS_SANDBOX" | "GCM" | "ADM" | String */
        var Token: PushToken
    }
    interface RegisterDeviceResponse {
        var DeviceId: DeviceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetCognitoEventsRequest {
        var IdentityPoolId: IdentityPoolId
        var Events: Events
    }
    interface SetIdentityPoolConfigurationRequest {
        var IdentityPoolId: IdentityPoolId
        var PushSync: PushSync?
            get() = definedExternally
            set(value) = definedExternally
        var CognitoStreams: CognitoStreams?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetIdentityPoolConfigurationResponse {
        var IdentityPoolId: IdentityPoolId?
            get() = definedExternally
            set(value) = definedExternally
        var PushSync: PushSync?
            get() = definedExternally
            set(value) = definedExternally
        var CognitoStreams: CognitoStreams?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubscribeToDatasetRequest {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId
        var DatasetName: DatasetName
        var DeviceId: DeviceId
    }
    interface SubscribeToDatasetResponse
    interface UnsubscribeFromDatasetRequest {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId
        var DatasetName: DatasetName
        var DeviceId: DeviceId
    }
    interface UnsubscribeFromDatasetResponse
    interface UpdateRecordsRequest {
        var IdentityPoolId: IdentityPoolId
        var IdentityId: IdentityId
        var DatasetName: DatasetName
        var DeviceId: DeviceId?
            get() = definedExternally
            set(value) = definedExternally
        var RecordPatches: RecordPatchList?
            get() = definedExternally
            set(value) = definedExternally
        var SyncSessionToken: SyncSessionToken
        var ClientContext: ClientContext?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRecordsResponse {
        var Records: RecordList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2014-06-30" | "latest" | String */
    }
}