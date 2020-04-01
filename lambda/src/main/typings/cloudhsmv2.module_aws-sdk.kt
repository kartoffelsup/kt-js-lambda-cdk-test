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
import CloudHSMV2.Backup
import CloudHSMV2.Cluster
import CloudHSMV2.Hsm
import CloudHSMV2.Tag
import CloudHSMV2.CopyBackupToRegionRequest
import CloudHSMV2.CopyBackupToRegionResponse
import CloudHSMV2.CreateClusterRequest
import CloudHSMV2.CreateClusterResponse
import CloudHSMV2.CreateHsmRequest
import CloudHSMV2.CreateHsmResponse
import CloudHSMV2.DeleteBackupRequest
import CloudHSMV2.DeleteBackupResponse
import CloudHSMV2.DeleteClusterRequest
import CloudHSMV2.DeleteClusterResponse
import CloudHSMV2.DeleteHsmRequest
import CloudHSMV2.DeleteHsmResponse
import CloudHSMV2.DescribeBackupsRequest
import CloudHSMV2.DescribeBackupsResponse
import CloudHSMV2.DescribeClustersRequest
import CloudHSMV2.DescribeClustersResponse
import CloudHSMV2.InitializeClusterRequest
import CloudHSMV2.InitializeClusterResponse
import CloudHSMV2.ListTagsRequest
import CloudHSMV2.ListTagsResponse
import CloudHSMV2.RestoreBackupRequest
import CloudHSMV2.RestoreBackupResponse
import CloudHSMV2.TagResourceRequest
import CloudHSMV2.TagResourceResponse
import CloudHSMV2.UntagResourceRequest
import CloudHSMV2.UntagResourceResponse
import CloudHSMV2.ExternalSubnetMapping
import CloudHSMV2.Certificates
import CloudHSMV2.DestinationBackup
import CloudHSMV2.Filters

typealias BackupId = String

typealias Backups = Array<Backup>

typealias Boolean = Boolean

typealias Cert = String

typealias ClusterId = String

typealias Clusters = Array<Cluster>

typealias EniId = String

typealias ExternalAz = String

typealias Field = String

typealias HsmId = String

typealias HsmType = String

typealias Hsms = Array<Hsm>

typealias IpAddress = String

typealias MaxSize = Number

typealias NextToken = String

typealias PreCoPassword = String

typealias Region = String

typealias ResourceId = String

typealias SecurityGroup = String

typealias StateMessage = String

typealias String = String

typealias Strings = Array<String>

typealias SubnetId = String

typealias SubnetIds = Array<SubnetId>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Timestamp = Date

typealias VpcId = String

@JsModule("aws-sdk")
external open class CloudHSMV2(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CloudHSMV2.Types.ClientConfiguration */
    open fun copyBackupToRegion(params: CopyBackupToRegionRequest, callback: (err: AWSError, data: CopyBackupToRegionResponse) -> Unit = definedExternally): Request<CopyBackupToRegionResponse, AWSError>
    open fun copyBackupToRegion(callback: (err: AWSError, data: CopyBackupToRegionResponse) -> Unit = definedExternally): Request<CopyBackupToRegionResponse, AWSError>
    open fun createCluster(params: CreateClusterRequest, callback: (err: AWSError, data: CreateClusterResponse) -> Unit = definedExternally): Request<CreateClusterResponse, AWSError>
    open fun createCluster(callback: (err: AWSError, data: CreateClusterResponse) -> Unit = definedExternally): Request<CreateClusterResponse, AWSError>
    open fun createHsm(params: CreateHsmRequest, callback: (err: AWSError, data: CreateHsmResponse) -> Unit = definedExternally): Request<CreateHsmResponse, AWSError>
    open fun createHsm(callback: (err: AWSError, data: CreateHsmResponse) -> Unit = definedExternally): Request<CreateHsmResponse, AWSError>
    open fun deleteBackup(params: DeleteBackupRequest, callback: (err: AWSError, data: DeleteBackupResponse) -> Unit = definedExternally): Request<DeleteBackupResponse, AWSError>
    open fun deleteBackup(callback: (err: AWSError, data: DeleteBackupResponse) -> Unit = definedExternally): Request<DeleteBackupResponse, AWSError>
    open fun deleteCluster(params: DeleteClusterRequest, callback: (err: AWSError, data: DeleteClusterResponse) -> Unit = definedExternally): Request<DeleteClusterResponse, AWSError>
    open fun deleteCluster(callback: (err: AWSError, data: DeleteClusterResponse) -> Unit = definedExternally): Request<DeleteClusterResponse, AWSError>
    open fun deleteHsm(params: DeleteHsmRequest, callback: (err: AWSError, data: DeleteHsmResponse) -> Unit = definedExternally): Request<DeleteHsmResponse, AWSError>
    open fun deleteHsm(callback: (err: AWSError, data: DeleteHsmResponse) -> Unit = definedExternally): Request<DeleteHsmResponse, AWSError>
    open fun describeBackups(params: DescribeBackupsRequest, callback: (err: AWSError, data: DescribeBackupsResponse) -> Unit = definedExternally): Request<DescribeBackupsResponse, AWSError>
    open fun describeBackups(callback: (err: AWSError, data: DescribeBackupsResponse) -> Unit = definedExternally): Request<DescribeBackupsResponse, AWSError>
    open fun describeClusters(params: DescribeClustersRequest, callback: (err: AWSError, data: DescribeClustersResponse) -> Unit = definedExternally): Request<DescribeClustersResponse, AWSError>
    open fun describeClusters(callback: (err: AWSError, data: DescribeClustersResponse) -> Unit = definedExternally): Request<DescribeClustersResponse, AWSError>
    open fun initializeCluster(params: InitializeClusterRequest, callback: (err: AWSError, data: InitializeClusterResponse) -> Unit = definedExternally): Request<InitializeClusterResponse, AWSError>
    open fun initializeCluster(callback: (err: AWSError, data: InitializeClusterResponse) -> Unit = definedExternally): Request<InitializeClusterResponse, AWSError>
    open fun listTags(params: ListTagsRequest, callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun listTags(callback: (err: AWSError, data: ListTagsResponse) -> Unit = definedExternally): Request<ListTagsResponse, AWSError>
    open fun restoreBackup(params: RestoreBackupRequest, callback: (err: AWSError, data: RestoreBackupResponse) -> Unit = definedExternally): Request<RestoreBackupResponse, AWSError>
    open fun restoreBackup(callback: (err: AWSError, data: RestoreBackupResponse) -> Unit = definedExternally): Request<RestoreBackupResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    interface Backup {
        var BackupId: BackupId
        var BackupState: String /* "CREATE_IN_PROGRESS" | "READY" | "DELETED" | "PENDING_DELETION" | String */
        var ClusterId: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
        var CreateTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRegion: Region?
            get() = definedExternally
            set(value) = definedExternally
        var SourceBackup: BackupId?
            get() = definedExternally
            set(value) = definedExternally
        var SourceCluster: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Certificates {
        var ClusterCsr: Cert?
            get() = definedExternally
            set(value) = definedExternally
        var HsmCertificate: Cert?
            get() = definedExternally
            set(value) = definedExternally
        var AwsHardwareCertificate: Cert?
            get() = definedExternally
            set(value) = definedExternally
        var ManufacturerHardwareCertificate: Cert?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterCertificate: Cert?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Cluster {
        var BackupPolicy: String /* "DEFAULT" | String */
        var ClusterId: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
        var CreateTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Hsms: Hsms?
            get() = definedExternally
            set(value) = definedExternally
        var HsmType: HsmType?
            get() = definedExternally
            set(value) = definedExternally
        var PreCoPassword: PreCoPassword?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroup: SecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
        var SourceBackupId: BackupId?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "CREATE_IN_PROGRESS" | "UNINITIALIZED" | "INITIALIZE_IN_PROGRESS" | "INITIALIZED" | "ACTIVE" | "UPDATE_IN_PROGRESS" | "DELETE_IN_PROGRESS" | "DELETED" | "DEGRADED" | String */
        var StateMessage: StateMessage?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetMapping: ExternalSubnetMapping?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
        var Certificates: Certificates?
            get() = definedExternally
            set(value) = definedExternally
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyBackupToRegionRequest {
        var DestinationRegion: Region
        var BackupId: BackupId
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CopyBackupToRegionResponse {
        var DestinationBackup: DestinationBackup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterRequest {
        var SubnetIds: SubnetIds
        var HsmType: HsmType
        var SourceBackupId: BackupId?
            get() = definedExternally
            set(value) = definedExternally
        var TagList: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClusterResponse {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHsmRequest {
        var ClusterId: ClusterId
        var AvailabilityZone: ExternalAz
        var IpAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateHsmResponse {
        var Hsm: Hsm?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBackupRequest {
        var BackupId: BackupId
    }
    interface DeleteBackupResponse {
        var Backup: Backup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClusterRequest {
        var ClusterId: ClusterId
    }
    interface DeleteClusterResponse {
        var Cluster: Cluster?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteHsmRequest {
        var ClusterId: ClusterId
        var HsmId: HsmId?
            get() = definedExternally
            set(value) = definedExternally
        var EniId: EniId?
            get() = definedExternally
            set(value) = definedExternally
        var EniIp: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteHsmResponse {
        var HsmId: HsmId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBackupsRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxSize?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
        var SortAscending: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBackupsResponse {
        var Backups: Backups?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClustersRequest {
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeClustersResponse {
        var Clusters: Clusters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DestinationBackup {
        var CreateTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SourceRegion: Region?
            get() = definedExternally
            set(value) = definedExternally
        var SourceBackup: BackupId?
            get() = definedExternally
            set(value) = definedExternally
        var SourceCluster: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExternalSubnetMapping {
        @nativeGetter
        operator fun get(key: String): SubnetId?
        @nativeSetter
        operator fun set(key: String, value: SubnetId)
    }
    interface Filters {
        @nativeGetter
        operator fun get(key: String): Strings?
        @nativeSetter
        operator fun set(key: String, value: Strings)
    }
    interface Hsm {
        var AvailabilityZone: ExternalAz?
            get() = definedExternally
            set(value) = definedExternally
        var ClusterId: ClusterId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var EniId: EniId?
            get() = definedExternally
            set(value) = definedExternally
        var EniIp: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var HsmId: HsmId
        var State: String /* "CREATE_IN_PROGRESS" | "ACTIVE" | "DEGRADED" | "DELETE_IN_PROGRESS" | "DELETED" | String */
        var StateMessage: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InitializeClusterRequest {
        var ClusterId: ClusterId
        var SignedCert: Cert
        var TrustAnchor: Cert
    }
    interface InitializeClusterResponse {
        var State: String /* "CREATE_IN_PROGRESS" | "UNINITIALIZED" | "INITIALIZE_IN_PROGRESS" | "INITIALIZED" | "ACTIVE" | "UPDATE_IN_PROGRESS" | "DELETE_IN_PROGRESS" | "DELETED" | "DEGRADED" | String */
        var StateMessage: StateMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsRequest {
        var ResourceId: ResourceId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsResponse {
        var TagList: TagList
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestoreBackupRequest {
        var BackupId: BackupId
    }
    interface RestoreBackupResponse {
        var Backup: Backup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TagResourceRequest {
        var ResourceId: ResourceId
        var TagList: TagList
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var ResourceId: ResourceId
        var TagKeyList: TagKeyList
    }
    interface UntagResourceResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2017-04-28" | "latest" | String */
    }
}