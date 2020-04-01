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
import Snowball.Address
import Snowball.ClusterListEntry
import Snowball.CompatibleImage
import Snowball.Ec2AmiResource
import Snowball.EventTriggerDefinition
import Snowball.JobListEntry
import Snowball.JobMetadata
import Snowball.LambdaResource
import Snowball.S3Resource
import Snowball.CancelClusterRequest
import Snowball.CancelClusterResult
import Snowball.CancelJobRequest
import Snowball.CancelJobResult
import Snowball.CreateAddressRequest
import Snowball.CreateAddressResult
import Snowball.CreateClusterRequest
import Snowball.CreateClusterResult
import Snowball.CreateJobRequest
import Snowball.CreateJobResult
import Snowball.DescribeAddressRequest
import Snowball.DescribeAddressResult
import Snowball.DescribeAddressesRequest
import Snowball.DescribeAddressesResult
import Snowball.DescribeClusterRequest
import Snowball.DescribeClusterResult
import Snowball.DescribeJobRequest
import Snowball.DescribeJobResult
import Snowball.GetJobManifestRequest
import Snowball.GetJobManifestResult
import Snowball.GetJobUnlockCodeRequest
import Snowball.GetJobUnlockCodeResult
import Snowball.GetSnowballUsageRequest
import Snowball.GetSnowballUsageResult
import Snowball.GetSoftwareUpdatesRequest
import Snowball.GetSoftwareUpdatesResult
import Snowball.ListClusterJobsRequest
import Snowball.ListClusterJobsResult
import Snowball.ListClustersRequest
import Snowball.ListClustersResult
import Snowball.ListCompatibleImagesRequest
import Snowball.ListCompatibleImagesResult
import Snowball.ListJobsRequest
import Snowball.ListJobsResult
import Snowball.UpdateClusterRequest
import Snowball.UpdateClusterResult
import Snowball.UpdateJobRequest
import Snowball.UpdateJobResult
import Snowball.JobResource
import Snowball.Notification
import Snowball.TaxDocuments
import Snowball.ClusterMetadata
import Snowball.ShippingDetails
import Snowball.DataTransfer
import Snowball.JobLogs
import Snowball.KeyRange
import Snowball.Shipment
import Snowball.INDTaxDocuments

typealias AddressId = String

typealias AddressList = Array<Address>

typealias AmiId = String

typealias Boolean = Boolean

typealias ClusterId = String

typealias ClusterListEntryList = Array<ClusterListEntry>

typealias CompatibleImageList = Array<CompatibleImage>

typealias Ec2AmiResourceList = Array<Ec2AmiResource>

typealias EventTriggerDefinitionList = Array<EventTriggerDefinition>

typealias GSTIN = String

typealias Integer = Number

typealias JobId = String

typealias JobListEntryList = Array<JobListEntry>

typealias JobMetadataList = Array<JobMetadata>

typealias JobStateList = Array<String /* "New" | "PreparingAppliance" | "PreparingShipment" | "InTransitToCustomer" | "WithCustomer" | "InTransitToAWS" | "WithAWSSortingFacility" | "WithAWS" | "InProgress" | "Complete" | "Cancelled" | "Listing" | "Pending" | String */>

typealias KmsKeyARN = String

typealias LambdaResourceList = Array<LambdaResource>

typealias ListLimit = Number

typealias Long = Number

typealias ResourceARN = String

typealias RoleARN = String

typealias S3ResourceList = Array<S3Resource>

typealias SnsTopicARN = String

typealias String = String

typealias Timestamp = Date

@JsModule("aws-sdk")
external open class Snowball(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Snowball.Types.ClientConfiguration */
    open fun cancelCluster(params: CancelClusterRequest, callback: (err: AWSError, data: CancelClusterResult) -> Unit = definedExternally): Request<CancelClusterResult, AWSError>
    open fun cancelCluster(callback: (err: AWSError, data: CancelClusterResult) -> Unit = definedExternally): Request<CancelClusterResult, AWSError>
    open fun cancelJob(params: CancelJobRequest, callback: (err: AWSError, data: CancelJobResult) -> Unit = definedExternally): Request<CancelJobResult, AWSError>
    open fun cancelJob(callback: (err: AWSError, data: CancelJobResult) -> Unit = definedExternally): Request<CancelJobResult, AWSError>
    open fun createAddress(params: CreateAddressRequest, callback: (err: AWSError, data: CreateAddressResult) -> Unit = definedExternally): Request<CreateAddressResult, AWSError>
    open fun createAddress(callback: (err: AWSError, data: CreateAddressResult) -> Unit = definedExternally): Request<CreateAddressResult, AWSError>
    open fun createCluster(params: CreateClusterRequest, callback: (err: AWSError, data: CreateClusterResult) -> Unit = definedExternally): Request<CreateClusterResult, AWSError>
    open fun createCluster(callback: (err: AWSError, data: CreateClusterResult) -> Unit = definedExternally): Request<CreateClusterResult, AWSError>
    open fun createJob(params: CreateJobRequest, callback: (err: AWSError, data: CreateJobResult) -> Unit = definedExternally): Request<CreateJobResult, AWSError>
    open fun createJob(callback: (err: AWSError, data: CreateJobResult) -> Unit = definedExternally): Request<CreateJobResult, AWSError>
    open fun describeAddress(params: DescribeAddressRequest, callback: (err: AWSError, data: DescribeAddressResult) -> Unit = definedExternally): Request<DescribeAddressResult, AWSError>
    open fun describeAddress(callback: (err: AWSError, data: DescribeAddressResult) -> Unit = definedExternally): Request<DescribeAddressResult, AWSError>
    open fun describeAddresses(params: DescribeAddressesRequest, callback: (err: AWSError, data: DescribeAddressesResult) -> Unit = definedExternally): Request<DescribeAddressesResult, AWSError>
    open fun describeAddresses(callback: (err: AWSError, data: DescribeAddressesResult) -> Unit = definedExternally): Request<DescribeAddressesResult, AWSError>
    open fun describeCluster(params: DescribeClusterRequest, callback: (err: AWSError, data: DescribeClusterResult) -> Unit = definedExternally): Request<DescribeClusterResult, AWSError>
    open fun describeCluster(callback: (err: AWSError, data: DescribeClusterResult) -> Unit = definedExternally): Request<DescribeClusterResult, AWSError>
    open fun describeJob(params: DescribeJobRequest, callback: (err: AWSError, data: DescribeJobResult) -> Unit = definedExternally): Request<DescribeJobResult, AWSError>
    open fun describeJob(callback: (err: AWSError, data: DescribeJobResult) -> Unit = definedExternally): Request<DescribeJobResult, AWSError>
    open fun getJobManifest(params: GetJobManifestRequest, callback: (err: AWSError, data: GetJobManifestResult) -> Unit = definedExternally): Request<GetJobManifestResult, AWSError>
    open fun getJobManifest(callback: (err: AWSError, data: GetJobManifestResult) -> Unit = definedExternally): Request<GetJobManifestResult, AWSError>
    open fun getJobUnlockCode(params: GetJobUnlockCodeRequest, callback: (err: AWSError, data: GetJobUnlockCodeResult) -> Unit = definedExternally): Request<GetJobUnlockCodeResult, AWSError>
    open fun getJobUnlockCode(callback: (err: AWSError, data: GetJobUnlockCodeResult) -> Unit = definedExternally): Request<GetJobUnlockCodeResult, AWSError>
    open fun getSnowballUsage(params: GetSnowballUsageRequest, callback: (err: AWSError, data: GetSnowballUsageResult) -> Unit = definedExternally): Request<GetSnowballUsageResult, AWSError>
    open fun getSnowballUsage(callback: (err: AWSError, data: GetSnowballUsageResult) -> Unit = definedExternally): Request<GetSnowballUsageResult, AWSError>
    open fun getSoftwareUpdates(params: GetSoftwareUpdatesRequest, callback: (err: AWSError, data: GetSoftwareUpdatesResult) -> Unit = definedExternally): Request<GetSoftwareUpdatesResult, AWSError>
    open fun getSoftwareUpdates(callback: (err: AWSError, data: GetSoftwareUpdatesResult) -> Unit = definedExternally): Request<GetSoftwareUpdatesResult, AWSError>
    open fun listClusterJobs(params: ListClusterJobsRequest, callback: (err: AWSError, data: ListClusterJobsResult) -> Unit = definedExternally): Request<ListClusterJobsResult, AWSError>
    open fun listClusterJobs(callback: (err: AWSError, data: ListClusterJobsResult) -> Unit = definedExternally): Request<ListClusterJobsResult, AWSError>
    open fun listClusters(params: ListClustersRequest, callback: (err: AWSError, data: ListClustersResult) -> Unit = definedExternally): Request<ListClustersResult, AWSError>
    open fun listClusters(callback: (err: AWSError, data: ListClustersResult) -> Unit = definedExternally): Request<ListClustersResult, AWSError>
    open fun listCompatibleImages(params: ListCompatibleImagesRequest, callback: (err: AWSError, data: ListCompatibleImagesResult) -> Unit = definedExternally): Request<ListCompatibleImagesResult, AWSError>
    open fun listCompatibleImages(callback: (err: AWSError, data: ListCompatibleImagesResult) -> Unit = definedExternally): Request<ListCompatibleImagesResult, AWSError>
    open fun listJobs(params: ListJobsRequest, callback: (err: AWSError, data: ListJobsResult) -> Unit = definedExternally): Request<ListJobsResult, AWSError>
    open fun listJobs(callback: (err: AWSError, data: ListJobsResult) -> Unit = definedExternally): Request<ListJobsResult, AWSError>
    open fun updateCluster(params: UpdateClusterRequest, callback: (err: AWSError, data: UpdateClusterResult) -> Unit = definedExternally): Request<UpdateClusterResult, AWSError>
    open fun updateCluster(callback: (err: AWSError, data: UpdateClusterResult) -> Unit = definedExternally): Request<UpdateClusterResult, AWSError>
    open fun updateJob(params: UpdateJobRequest, callback: (err: AWSError, data: UpdateJobResult) -> Unit = definedExternally): Request<UpdateJobResult, AWSError>
    open fun updateJob(callback: (err: AWSError, data: UpdateJobResult) -> Unit = definedExternally): Request<UpdateJobResult, AWSError>
    interface Address {
        var AddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
        var Company: String?
            get() = definedExternally
            set(value) = definedExternally
        var Street1: String?
            get() = definedExternally
            set(value) = definedExternally
        var Street2: String?
            get() = definedExternally
            set(value) = definedExternally
        var Street3: String?
            get() = definedExternally
            set(value) = definedExternally
        var City: String?
            get() = definedExternally
            set(value) = definedExternally
        var StateOrProvince: String?
            get() = definedExternally
            set(value) = definedExternally
        var PrefectureOrDistrict: String?
            get() = definedExternally
            set(value) = definedExternally
        var Landmark: String?
            get() = definedExternally
            set(value) = definedExternally
        var Country: String?
            get() = definedExternally
            set(value) = definedExternally
        var PostalCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var PhoneNumber: String?
            get() = definedExternally
            set(value) = definedExternally
        var IsRestricted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelClusterRequest {
        var ClusterId: ClusterId
    }
    interface CancelClusterResult
    interface CancelJobRequest {
        var JobId: JobId
    }
    interface CancelJobResult
    interface ClusterListEntry {
        var ClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterState: String /* "AwaitingQuorum" | "Pending" | "InUse" | "Complete" | "Cancelled" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClusterMetadata {
        var ClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyARN: KmsKeyARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterState: String /* "AwaitingQuorum" | "Pending" | "InUse" | "Complete" | "Cancelled" | String */
        var JobType: String /* "IMPORT" | "EXPORT" | "LOCAL_USE" | String */
        var SnowballType: String /* "STANDARD" | "EDGE" | "EDGE_C" | "EDGE_CG" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Resources: JobResource?
            get() = definedExternally
            set(value) = definedExternally
        var AddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
        var ShippingOption: String /* "SECOND_DAY" | "NEXT_DAY" | "EXPRESS" | "STANDARD" | String */
        var Notification: Notification?
            get() = definedExternally
            set(value) = definedExternally
        var ForwardingAddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
        var TaxDocuments: TaxDocuments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompatibleImage {
        var AmiId: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAddressRequest {
        var Address: Address
    }
    interface CreateAddressResult {
        var AddressId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterRequest {
        var JobType: String /* "IMPORT" | "EXPORT" | "LOCAL_USE" | String */
        var Resources: JobResource
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var AddressId: AddressId
        var KmsKeyARN: KmsKeyARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN
        var SnowballType: String /* "STANDARD" | "EDGE" | "EDGE_C" | "EDGE_CG" | String */
        var ShippingOption: String /* "SECOND_DAY" | "NEXT_DAY" | "EXPRESS" | "STANDARD" | String */
        var Notification: Notification?
            get() = definedExternally
            set(value) = definedExternally
        var ForwardingAddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
        var TaxDocuments: TaxDocuments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterResult {
        var ClusterId: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobRequest {
        var JobType: String /* "IMPORT" | "EXPORT" | "LOCAL_USE" | String */
        var Resources: JobResource?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var AddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyARN: KmsKeyARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var SnowballCapacityPreference: String /* "T50" | "T80" | "T100" | "T42" | "NoPreference" | String */
        var ShippingOption: String /* "SECOND_DAY" | "NEXT_DAY" | "EXPRESS" | "STANDARD" | String */
        var Notification: Notification?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterId: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
        var SnowballType: String /* "STANDARD" | "EDGE" | "EDGE_C" | "EDGE_CG" | String */
        var ForwardingAddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
        var TaxDocuments: TaxDocuments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobResult {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataTransfer {
        var BytesTransferred: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ObjectsTransferred: Long?
            get() = definedExternally
            set(value) = definedExternally
        var TotalBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var TotalObjects: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAddressRequest {
        var AddressId: AddressId
    }
    interface DescribeAddressResult {
        var Address: Address?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAddressesRequest {
        var MaxResults: ListLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAddressesResult {
        var Addresses: AddressList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClusterRequest {
        var ClusterId: ClusterId
    }
    interface DescribeClusterResult {
        var ClusterMetadata: ClusterMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobRequest {
        var JobId: JobId
    }
    interface DescribeJobResult {
        var JobMetadata: JobMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var SubJobMetadata: JobMetadataList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Ec2AmiResource {
        var AmiId: AmiId
        var SnowballAmiId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventTriggerDefinition {
        var EventResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobManifestRequest {
        var JobId: JobId
    }
    interface GetJobManifestResult {
        var ManifestURI: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobUnlockCodeRequest {
        var JobId: JobId
    }
    interface GetJobUnlockCodeResult {
        var UnlockCode: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSnowballUsageRequest
    interface GetSnowballUsageResult {
        var SnowballLimit: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SnowballsInUse: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSoftwareUpdatesRequest {
        var JobId: JobId
    }
    interface GetSoftwareUpdatesResult {
        var UpdatesURI: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface INDTaxDocuments {
        var GSTIN: GSTIN?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobListEntry {
        var JobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var JobState: String /* "New" | "PreparingAppliance" | "PreparingShipment" | "InTransitToCustomer" | "WithCustomer" | "InTransitToAWS" | "WithAWSSortingFacility" | "WithAWS" | "InProgress" | "Complete" | "Cancelled" | "Listing" | "Pending" | String */
        var IsMaster: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var JobType: String /* "IMPORT" | "EXPORT" | "LOCAL_USE" | String */
        var SnowballType: String /* "STANDARD" | "EDGE" | "EDGE_C" | "EDGE_CG" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobLogs {
        var JobCompletionReportURI: String?
            get() = definedExternally
            set(value) = definedExternally
        var JobSuccessLogURI: String?
            get() = definedExternally
            set(value) = definedExternally
        var JobFailureLogURI: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobMetadata {
        var JobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var JobState: String /* "New" | "PreparingAppliance" | "PreparingShipment" | "InTransitToCustomer" | "WithCustomer" | "InTransitToAWS" | "WithAWSSortingFacility" | "WithAWS" | "InProgress" | "Complete" | "Cancelled" | "Listing" | "Pending" | String */
        var JobType: String /* "IMPORT" | "EXPORT" | "LOCAL_USE" | String */
        var SnowballType: String /* "STANDARD" | "EDGE" | "EDGE_C" | "EDGE_CG" | String */
        var CreationDate: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Resources: JobResource?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyARN: KmsKeyARN?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var AddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
        var ShippingDetails: ShippingDetails?
            get() = definedExternally
            set(value) = definedExternally
        var SnowballCapacityPreference: String /* "T50" | "T80" | "T100" | "T42" | "NoPreference" | String */
        var Notification: Notification?
            get() = definedExternally
            set(value) = definedExternally
        var DataTransferProgress: DataTransfer?
            get() = definedExternally
            set(value) = definedExternally
        var JobLogInfo: JobLogs?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ForwardingAddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
        var TaxDocuments: TaxDocuments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobResource {
        var S3Resources: S3ResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var LambdaResources: LambdaResourceList?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2AmiResources: Ec2AmiResourceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyRange {
        var BeginMarker: String?
            get() = definedExternally
            set(value) = definedExternally
        var EndMarker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LambdaResource {
        var LambdaArn: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var EventTriggers: EventTriggerDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClusterJobsRequest {
        var ClusterId: ClusterId
        var MaxResults: ListLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClusterJobsResult {
        var JobListEntries: JobListEntryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClustersRequest {
        var MaxResults: ListLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListClustersResult {
        var ClusterListEntries: ClusterListEntryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCompatibleImagesRequest {
        var MaxResults: ListLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCompatibleImagesResult {
        var CompatibleImages: CompatibleImageList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsRequest {
        var MaxResults: ListLimit?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsResult {
        var JobListEntries: JobListEntryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Notification {
        var SnsTopicARN: SnsTopicARN?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatesToNotify: JobStateList?
            get() = definedExternally
            set(value) = definedExternally
        var NotifyAll: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Resource {
        var BucketArn: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var KeyRange: KeyRange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Shipment {
        var Status: String?
            get() = definedExternally
            set(value) = definedExternally
        var TrackingNumber: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ShippingDetails {
        var ShippingOption: String /* "SECOND_DAY" | "NEXT_DAY" | "EXPRESS" | "STANDARD" | String */
        var InboundShipment: Shipment?
            get() = definedExternally
            set(value) = definedExternally
        var OutboundShipment: Shipment?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaxDocuments {
        var IND: INDTaxDocuments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClusterRequest {
        var ClusterId: ClusterId
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Resources: JobResource?
            get() = definedExternally
            set(value) = definedExternally
        var AddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
        var ShippingOption: String /* "SECOND_DAY" | "NEXT_DAY" | "EXPRESS" | "STANDARD" | String */
        var Notification: Notification?
            get() = definedExternally
            set(value) = definedExternally
        var ForwardingAddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClusterResult
    interface UpdateJobRequest {
        var JobId: JobId
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var Notification: Notification?
            get() = definedExternally
            set(value) = definedExternally
        var Resources: JobResource?
            get() = definedExternally
            set(value) = definedExternally
        var AddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
        var ShippingOption: String /* "SECOND_DAY" | "NEXT_DAY" | "EXPRESS" | "STANDARD" | String */
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var SnowballCapacityPreference: String /* "T50" | "T80" | "T100" | "T42" | "NoPreference" | String */
        var ForwardingAddressId: AddressId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateJobResult
    interface ClientApiVersions {
        var apiVersion: String /* "2016-06-30" | "latest" | String */
    }
}