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
import FSx.Backup
import FSx.DataRepositoryTaskFilter
import FSx.DataRepositoryTask
import FSx.FileSystem
import FSx.Filter
import FSx.Tag
import FSx.CancelDataRepositoryTaskRequest
import FSx.CancelDataRepositoryTaskResponse
import FSx.CreateBackupRequest
import FSx.CreateBackupResponse
import FSx.CreateDataRepositoryTaskRequest
import FSx.CreateDataRepositoryTaskResponse
import FSx.CreateFileSystemRequest
import FSx.CreateFileSystemResponse
import FSx.CreateFileSystemFromBackupRequest
import FSx.CreateFileSystemFromBackupResponse
import FSx.DeleteBackupRequest
import FSx.DeleteBackupResponse
import FSx.DeleteFileSystemRequest
import FSx.DeleteFileSystemResponse
import FSx.DescribeBackupsRequest
import FSx.DescribeBackupsResponse
import FSx.DescribeDataRepositoryTasksRequest
import FSx.DescribeDataRepositoryTasksResponse
import FSx.DescribeFileSystemsRequest
import FSx.DescribeFileSystemsResponse
import FSx.ListTagsForResourceRequest
import FSx.ListTagsForResourceResponse
import FSx.TagResourceRequest
import FSx.TagResourceResponse
import FSx.UntagResourceRequest
import FSx.UntagResourceResponse
import FSx.UpdateFileSystemRequest
import FSx.UpdateFileSystemResponse
import FSx.BackupFailureDetails
import FSx.ActiveDirectoryBackupAttributes
import FSx.CompletionReport
import FSx.CreateFileSystemWindowsConfiguration
import FSx.CreateFileSystemLustreConfiguration
import FSx.SelfManagedActiveDirectoryConfiguration
import FSx.DataRepositoryTaskFailureDetails
import FSx.DataRepositoryTaskStatus
import FSx.DeleteFileSystemWindowsConfiguration
import FSx.DeleteFileSystemWindowsResponse
import FSx.FileSystemFailureDetails
import FSx.WindowsFileSystemConfiguration
import FSx.LustreFileSystemConfiguration
import FSx.DataRepositoryConfiguration
import FSx.UpdateFileSystemWindowsConfiguration
import FSx.UpdateFileSystemLustreConfiguration
import FSx.SelfManagedActiveDirectoryConfigurationUpdates
import FSx.SelfManagedActiveDirectoryAttributes

typealias AWSAccountId = String

typealias ActiveDirectoryFullyQualifiedName = String

typealias ArchivePath = String

typealias AutomaticBackupRetentionDays = Number

typealias BackupId = String

typealias BackupIds = Array<BackupId>

typealias Backups = Array<Backup>

typealias ClientRequestToken = String

typealias CreationTime = Date

typealias DNSName = String

typealias DailyTime = String

typealias DataRepositoryTaskFilterValue = String

typealias DataRepositoryTaskFilterValues = Array<DataRepositoryTaskFilterValue>

typealias DataRepositoryTaskFilters = Array<DataRepositoryTaskFilter>

typealias DataRepositoryTaskPath = String

typealias DataRepositoryTaskPaths = Array<DataRepositoryTaskPath>

typealias DataRepositoryTasks = Array<DataRepositoryTask>

typealias DirectoryId = String

typealias DirectoryPassword = String

typealias DirectoryUserName = String

typealias DnsIps = Array<IpAddress>

typealias EndTime = Date

typealias ErrorMessage = String

typealias FailedCount = Number

typealias FileSystemAdministratorsGroupName = String

typealias FileSystemId = String

typealias FileSystemIds = Array<FileSystemId>

typealias FileSystemMaintenanceOperations = Array<String /* "PATCHING" | "BACKING_UP" | String */>

typealias FileSystems = Array<FileSystem>

typealias FilterValue = String

typealias FilterValues = Array<FilterValue>

typealias Filters = Array<Filter>

typealias Flag = Boolean

typealias IpAddress = String

typealias KmsKeyId = String

typealias LastUpdatedTime = Date

typealias LustreFileSystemMountName = String

typealias MaxResults = Number

typealias Megabytes = Number

typealias MegabytesPerSecond = Number

typealias NetworkInterfaceId = String

typealias NetworkInterfaceIds = Array<NetworkInterfaceId>

typealias NextToken = String

typealias OrganizationalUnitDistinguishedName = String

typealias PerUnitStorageThroughput = Number

typealias ProgressPercent = Number

typealias ResourceARN = String

typealias SecurityGroupId = String

typealias SecurityGroupIds = Array<SecurityGroupId>

typealias StartTime = Date

typealias StorageCapacity = Number

typealias SubnetId = String

typealias SubnetIds = Array<SubnetId>

typealias SucceededCount = Number

typealias TagKey = String

typealias TagKeys = Array<TagKey>

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TaskId = String

typealias TaskIds = Array<TaskId>

typealias TotalCount = Number

typealias VpcId = String

typealias WeeklyTime = String

@JsModule("aws-sdk")
external open class FSx(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & FSx.Types.ClientConfiguration */
    open fun cancelDataRepositoryTask(params: CancelDataRepositoryTaskRequest, callback: (err: AWSError, data: CancelDataRepositoryTaskResponse) -> Unit = definedExternally): Request<CancelDataRepositoryTaskResponse, AWSError>
    open fun cancelDataRepositoryTask(callback: (err: AWSError, data: CancelDataRepositoryTaskResponse) -> Unit = definedExternally): Request<CancelDataRepositoryTaskResponse, AWSError>
    open fun createBackup(params: CreateBackupRequest, callback: (err: AWSError, data: CreateBackupResponse) -> Unit = definedExternally): Request<CreateBackupResponse, AWSError>
    open fun createBackup(callback: (err: AWSError, data: CreateBackupResponse) -> Unit = definedExternally): Request<CreateBackupResponse, AWSError>
    open fun createDataRepositoryTask(params: CreateDataRepositoryTaskRequest, callback: (err: AWSError, data: CreateDataRepositoryTaskResponse) -> Unit = definedExternally): Request<CreateDataRepositoryTaskResponse, AWSError>
    open fun createDataRepositoryTask(callback: (err: AWSError, data: CreateDataRepositoryTaskResponse) -> Unit = definedExternally): Request<CreateDataRepositoryTaskResponse, AWSError>
    open fun createFileSystem(params: CreateFileSystemRequest, callback: (err: AWSError, data: CreateFileSystemResponse) -> Unit = definedExternally): Request<CreateFileSystemResponse, AWSError>
    open fun createFileSystem(callback: (err: AWSError, data: CreateFileSystemResponse) -> Unit = definedExternally): Request<CreateFileSystemResponse, AWSError>
    open fun createFileSystemFromBackup(params: CreateFileSystemFromBackupRequest, callback: (err: AWSError, data: CreateFileSystemFromBackupResponse) -> Unit = definedExternally): Request<CreateFileSystemFromBackupResponse, AWSError>
    open fun createFileSystemFromBackup(callback: (err: AWSError, data: CreateFileSystemFromBackupResponse) -> Unit = definedExternally): Request<CreateFileSystemFromBackupResponse, AWSError>
    open fun deleteBackup(params: DeleteBackupRequest, callback: (err: AWSError, data: DeleteBackupResponse) -> Unit = definedExternally): Request<DeleteBackupResponse, AWSError>
    open fun deleteBackup(callback: (err: AWSError, data: DeleteBackupResponse) -> Unit = definedExternally): Request<DeleteBackupResponse, AWSError>
    open fun deleteFileSystem(params: DeleteFileSystemRequest, callback: (err: AWSError, data: DeleteFileSystemResponse) -> Unit = definedExternally): Request<DeleteFileSystemResponse, AWSError>
    open fun deleteFileSystem(callback: (err: AWSError, data: DeleteFileSystemResponse) -> Unit = definedExternally): Request<DeleteFileSystemResponse, AWSError>
    open fun describeBackups(params: DescribeBackupsRequest, callback: (err: AWSError, data: DescribeBackupsResponse) -> Unit = definedExternally): Request<DescribeBackupsResponse, AWSError>
    open fun describeBackups(callback: (err: AWSError, data: DescribeBackupsResponse) -> Unit = definedExternally): Request<DescribeBackupsResponse, AWSError>
    open fun describeDataRepositoryTasks(params: DescribeDataRepositoryTasksRequest, callback: (err: AWSError, data: DescribeDataRepositoryTasksResponse) -> Unit = definedExternally): Request<DescribeDataRepositoryTasksResponse, AWSError>
    open fun describeDataRepositoryTasks(callback: (err: AWSError, data: DescribeDataRepositoryTasksResponse) -> Unit = definedExternally): Request<DescribeDataRepositoryTasksResponse, AWSError>
    open fun describeFileSystems(params: DescribeFileSystemsRequest, callback: (err: AWSError, data: DescribeFileSystemsResponse) -> Unit = definedExternally): Request<DescribeFileSystemsResponse, AWSError>
    open fun describeFileSystems(callback: (err: AWSError, data: DescribeFileSystemsResponse) -> Unit = definedExternally): Request<DescribeFileSystemsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateFileSystem(params: UpdateFileSystemRequest, callback: (err: AWSError, data: UpdateFileSystemResponse) -> Unit = definedExternally): Request<UpdateFileSystemResponse, AWSError>
    open fun updateFileSystem(callback: (err: AWSError, data: UpdateFileSystemResponse) -> Unit = definedExternally): Request<UpdateFileSystemResponse, AWSError>
    interface ActiveDirectoryBackupAttributes {
        var DomainName: ActiveDirectoryFullyQualifiedName?
            get() = definedExternally
            set(value) = definedExternally
        var ActiveDirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Backup {
        var BackupId: BackupId
        var Lifecycle: String /* "AVAILABLE" | "CREATING" | "DELETED" | "FAILED" | String */
        var FailureDetails: BackupFailureDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "AUTOMATIC" | "USER_INITIATED" | String */
        var ProgressPercent: ProgressPercent?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystem: FileSystem
        var DirectoryInformation: ActiveDirectoryBackupAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BackupFailureDetails {
        var Message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelDataRepositoryTaskRequest {
        var TaskId: TaskId
    }
    interface CancelDataRepositoryTaskResponse {
        var Lifecycle: String /* "PENDING" | "EXECUTING" | "FAILED" | "SUCCEEDED" | "CANCELED" | "CANCELING" | String */
        var TaskId: TaskId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CompletionReport {
        var Enabled: Flag
        var Path: ArchivePath?
            get() = definedExternally
            set(value) = definedExternally
        var Format: String /* "REPORT_CSV_20191124" | String */
        var Scope: String /* "FAILED_FILES_ONLY" | String */
    }
    interface CreateBackupRequest {
        var FileSystemId: FileSystemId
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateBackupResponse {
        var Backup: Backup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataRepositoryTaskRequest {
        var Type: String /* "EXPORT_TO_REPOSITORY" | String */
        var Paths: DataRepositoryTaskPaths?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemId: FileSystemId
        var Report: CompletionReport
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDataRepositoryTaskResponse {
        var DataRepositoryTask: DataRepositoryTask?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFileSystemFromBackupRequest {
        var BackupId: BackupId
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIds
        var SecurityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var WindowsConfiguration: CreateFileSystemWindowsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String /* "SSD" | "HDD" | String */
    }
    interface CreateFileSystemFromBackupResponse {
        var FileSystem: FileSystem?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFileSystemLustreConfiguration {
        var WeeklyMaintenanceStartTime: WeeklyTime?
            get() = definedExternally
            set(value) = definedExternally
        var ImportPath: ArchivePath?
            get() = definedExternally
            set(value) = definedExternally
        var ExportPath: ArchivePath?
            get() = definedExternally
            set(value) = definedExternally
        var ImportedFileChunkSize: Megabytes?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentType: String /* "SCRATCH_1" | "SCRATCH_2" | "PERSISTENT_1" | String */
        var PerUnitStorageThroughput: PerUnitStorageThroughput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFileSystemRequest {
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemType: String /* "WINDOWS" | "LUSTRE" | String */
        var StorageCapacity: StorageCapacity
        var StorageType: String /* "SSD" | "HDD" | String */
        var SubnetIds: SubnetIds
        var SecurityGroupIds: SecurityGroupIds?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var WindowsConfiguration: CreateFileSystemWindowsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var LustreConfiguration: CreateFileSystemLustreConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFileSystemResponse {
        var FileSystem: FileSystem?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFileSystemWindowsConfiguration {
        var ActiveDirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var SelfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentType: String /* "MULTI_AZ_1" | "SINGLE_AZ_1" | "SINGLE_AZ_2" | String */
        var PreferredSubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var ThroughputCapacity: MegabytesPerSecond
        var WeeklyMaintenanceStartTime: WeeklyTime?
            get() = definedExternally
            set(value) = definedExternally
        var DailyAutomaticBackupStartTime: DailyTime?
            get() = definedExternally
            set(value) = definedExternally
        var AutomaticBackupRetentionDays: AutomaticBackupRetentionDays?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToBackups: Flag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataRepositoryConfiguration {
        var ImportPath: ArchivePath?
            get() = definedExternally
            set(value) = definedExternally
        var ExportPath: ArchivePath?
            get() = definedExternally
            set(value) = definedExternally
        var ImportedFileChunkSize: Megabytes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataRepositoryTask {
        var TaskId: TaskId
        var Lifecycle: String /* "PENDING" | "EXECUTING" | "FAILED" | "SUCCEEDED" | "CANCELED" | "CANCELING" | String */
        var Type: String /* "EXPORT_TO_REPOSITORY" | String */
        var CreationTime: CreationTime
        var StartTime: StartTime?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: EndTime?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemId: FileSystemId
        var Paths: DataRepositoryTaskPaths?
            get() = definedExternally
            set(value) = definedExternally
        var FailureDetails: DataRepositoryTaskFailureDetails?
            get() = definedExternally
            set(value) = definedExternally
        var Status: DataRepositoryTaskStatus?
            get() = definedExternally
            set(value) = definedExternally
        var Report: CompletionReport?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataRepositoryTaskFailureDetails {
        var Message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataRepositoryTaskFilter {
        var Name: String /* "file-system-id" | "task-lifecycle" | String */
        var Values: DataRepositoryTaskFilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataRepositoryTaskStatus {
        var TotalCount: TotalCount?
            get() = definedExternally
            set(value) = definedExternally
        var SucceededCount: SucceededCount?
            get() = definedExternally
            set(value) = definedExternally
        var FailedCount: FailedCount?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: LastUpdatedTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBackupRequest {
        var BackupId: BackupId
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteBackupResponse {
        var BackupId: BackupId?
            get() = definedExternally
            set(value) = definedExternally
        var Lifecycle: String /* "AVAILABLE" | "CREATING" | "DELETED" | "FAILED" | String */
    }
    interface DeleteFileSystemRequest {
        var FileSystemId: FileSystemId
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var WindowsConfiguration: DeleteFileSystemWindowsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFileSystemResponse {
        var FileSystemId: FileSystemId?
            get() = definedExternally
            set(value) = definedExternally
        var Lifecycle: String /* "AVAILABLE" | "CREATING" | "FAILED" | "DELETING" | "MISCONFIGURED" | "UPDATING" | String */
        var WindowsResponse: DeleteFileSystemWindowsResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFileSystemWindowsConfiguration {
        var SkipFinalBackup: Flag?
            get() = definedExternally
            set(value) = definedExternally
        var FinalBackupTags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFileSystemWindowsResponse {
        var FinalBackupId: BackupId?
            get() = definedExternally
            set(value) = definedExternally
        var FinalBackupTags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeBackupsRequest {
        var BackupIds: BackupIds?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
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
    interface DescribeDataRepositoryTasksRequest {
        var TaskIds: TaskIds?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: DataRepositoryTaskFilters?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDataRepositoryTasksResponse {
        var DataRepositoryTasks: DataRepositoryTasks?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFileSystemsRequest {
        var FileSystemIds: FileSystemIds?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFileSystemsResponse {
        var FileSystems: FileSystems?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FileSystem {
        var OwnerId: AWSAccountId?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemId: FileSystemId?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemType: String /* "WINDOWS" | "LUSTRE" | String */
        var Lifecycle: String /* "AVAILABLE" | "CREATING" | "FAILED" | "DELETING" | "MISCONFIGURED" | "UPDATING" | String */
        var FailureDetails: FileSystemFailureDetails?
            get() = definedExternally
            set(value) = definedExternally
        var StorageCapacity: StorageCapacity?
            get() = definedExternally
            set(value) = definedExternally
        var StorageType: String /* "SSD" | "HDD" | String */
        var VpcId: VpcId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetIds: SubnetIds?
            get() = definedExternally
            set(value) = definedExternally
        var NetworkInterfaceIds: NetworkInterfaceIds?
            get() = definedExternally
            set(value) = definedExternally
        var DNSName: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceARN: ResourceARN?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var WindowsConfiguration: WindowsFileSystemConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var LustreConfiguration: LustreFileSystemConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FileSystemFailureDetails {
        var Message: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filter {
        var Name: String /* "file-system-id" | "backup-type" | String */
        var Values: FilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceARN: ResourceARN
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResponse {
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LustreFileSystemConfiguration {
        var WeeklyMaintenanceStartTime: WeeklyTime?
            get() = definedExternally
            set(value) = definedExternally
        var DataRepositoryConfiguration: DataRepositoryConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentType: String /* "SCRATCH_1" | "SCRATCH_2" | "PERSISTENT_1" | String */
        var PerUnitStorageThroughput: PerUnitStorageThroughput?
            get() = definedExternally
            set(value) = definedExternally
        var MountName: LustreFileSystemMountName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SelfManagedActiveDirectoryAttributes {
        var DomainName: ActiveDirectoryFullyQualifiedName?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationalUnitDistinguishedName: OrganizationalUnitDistinguishedName?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemAdministratorsGroup: FileSystemAdministratorsGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: DirectoryUserName?
            get() = definedExternally
            set(value) = definedExternally
        var DnsIps: DnsIps?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SelfManagedActiveDirectoryConfiguration {
        var DomainName: ActiveDirectoryFullyQualifiedName
        var OrganizationalUnitDistinguishedName: OrganizationalUnitDistinguishedName?
            get() = definedExternally
            set(value) = definedExternally
        var FileSystemAdministratorsGroup: FileSystemAdministratorsGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var UserName: DirectoryUserName
        var Password: DirectoryPassword
        var DnsIps: DnsIps
    }
    interface SelfManagedActiveDirectoryConfigurationUpdates {
        var UserName: DirectoryUserName?
            get() = definedExternally
            set(value) = definedExternally
        var Password: DirectoryPassword?
            get() = definedExternally
            set(value) = definedExternally
        var DnsIps: DnsIps?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceARN: ResourceARN
        var Tags: Tags
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var ResourceARN: ResourceARN
        var TagKeys: TagKeys
    }
    interface UntagResourceResponse
    interface UpdateFileSystemLustreConfiguration {
        var WeeklyMaintenanceStartTime: WeeklyTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFileSystemRequest {
        var FileSystemId: FileSystemId
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var WindowsConfiguration: UpdateFileSystemWindowsConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var LustreConfiguration: UpdateFileSystemLustreConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFileSystemResponse {
        var FileSystem: FileSystem?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateFileSystemWindowsConfiguration {
        var WeeklyMaintenanceStartTime: WeeklyTime?
            get() = definedExternally
            set(value) = definedExternally
        var DailyAutomaticBackupStartTime: DailyTime?
            get() = definedExternally
            set(value) = definedExternally
        var AutomaticBackupRetentionDays: AutomaticBackupRetentionDays?
            get() = definedExternally
            set(value) = definedExternally
        var SelfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryConfigurationUpdates?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WindowsFileSystemConfiguration {
        var ActiveDirectoryId: DirectoryId?
            get() = definedExternally
            set(value) = definedExternally
        var SelfManagedActiveDirectoryConfiguration: SelfManagedActiveDirectoryAttributes?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentType: String /* "MULTI_AZ_1" | "SINGLE_AZ_1" | "SINGLE_AZ_2" | String */
        var RemoteAdministrationEndpoint: DNSName?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredSubnetId: SubnetId?
            get() = definedExternally
            set(value) = definedExternally
        var PreferredFileServerIp: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var ThroughputCapacity: MegabytesPerSecond?
            get() = definedExternally
            set(value) = definedExternally
        var MaintenanceOperationsInProgress: FileSystemMaintenanceOperations?
            get() = definedExternally
            set(value) = definedExternally
        var WeeklyMaintenanceStartTime: WeeklyTime?
            get() = definedExternally
            set(value) = definedExternally
        var DailyAutomaticBackupStartTime: DailyTime?
            get() = definedExternally
            set(value) = definedExternally
        var AutomaticBackupRetentionDays: AutomaticBackupRetentionDays?
            get() = definedExternally
            set(value) = definedExternally
        var CopyTagsToBackups: Flag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-03-01" | "latest" | String */
    }
}