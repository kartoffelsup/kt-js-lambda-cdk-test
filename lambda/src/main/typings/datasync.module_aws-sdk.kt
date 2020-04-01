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
import DataSync.AgentListEntry
import DataSync.FilterRule
import DataSync.LocationListEntry
import DataSync.TagListEntry
import DataSync.TaskExecutionListEntry
import DataSync.TaskListEntry
import DataSync.CancelTaskExecutionRequest
import DataSync.CancelTaskExecutionResponse
import DataSync.CreateAgentRequest
import DataSync.CreateAgentResponse
import DataSync.CreateLocationEfsRequest
import DataSync.CreateLocationEfsResponse
import DataSync.CreateLocationFsxWindowsRequest
import DataSync.CreateLocationFsxWindowsResponse
import DataSync.CreateLocationNfsRequest
import DataSync.CreateLocationNfsResponse
import DataSync.CreateLocationS3Request
import DataSync.CreateLocationS3Response
import DataSync.CreateLocationSmbRequest
import DataSync.CreateLocationSmbResponse
import DataSync.CreateTaskRequest
import DataSync.CreateTaskResponse
import DataSync.DeleteAgentRequest
import DataSync.DeleteAgentResponse
import DataSync.DeleteLocationRequest
import DataSync.DeleteLocationResponse
import DataSync.DeleteTaskRequest
import DataSync.DeleteTaskResponse
import DataSync.DescribeAgentRequest
import DataSync.DescribeAgentResponse
import DataSync.DescribeLocationEfsRequest
import DataSync.DescribeLocationEfsResponse
import DataSync.DescribeLocationFsxWindowsRequest
import DataSync.DescribeLocationFsxWindowsResponse
import DataSync.DescribeLocationNfsRequest
import DataSync.DescribeLocationNfsResponse
import DataSync.DescribeLocationS3Request
import DataSync.DescribeLocationS3Response
import DataSync.DescribeLocationSmbRequest
import DataSync.DescribeLocationSmbResponse
import DataSync.DescribeTaskRequest
import DataSync.DescribeTaskResponse
import DataSync.DescribeTaskExecutionRequest
import DataSync.DescribeTaskExecutionResponse
import DataSync.ListAgentsRequest
import DataSync.ListAgentsResponse
import DataSync.ListLocationsRequest
import DataSync.ListLocationsResponse
import DataSync.ListTagsForResourceRequest
import DataSync.ListTagsForResourceResponse
import DataSync.ListTaskExecutionsRequest
import DataSync.ListTaskExecutionsResponse
import DataSync.ListTasksRequest
import DataSync.ListTasksResponse
import DataSync.StartTaskExecutionRequest
import DataSync.StartTaskExecutionResponse
import DataSync.TagResourceRequest
import DataSync.TagResourceResponse
import DataSync.UntagResourceRequest
import DataSync.UntagResourceResponse
import DataSync.UpdateAgentRequest
import DataSync.UpdateAgentResponse
import DataSync.UpdateTaskRequest
import DataSync.UpdateTaskResponse
import DataSync.Ec2Config
import DataSync.OnPremConfig
import DataSync.NfsMountOptions
import DataSync.S3Config
import DataSync.SmbMountOptions
import DataSync.Options
import DataSync.TaskSchedule
import DataSync.PrivateLinkConfig
import DataSync.TaskExecutionResultDetail

typealias ActivationKey = String

typealias AgentArn = String

typealias AgentArnList = Array<AgentArn>

typealias AgentList = Array<AgentListEntry>

typealias BytesPerSecond = Number

typealias DestinationNetworkInterfaceArns = Array<NetworkInterfaceArn>

typealias Duration = Number

typealias Ec2SecurityGroupArn = String

typealias Ec2SecurityGroupArnList = Array<Ec2SecurityGroupArn>

typealias Ec2SubnetArn = String

typealias EfsFilesystemArn = String

typealias EfsSubdirectory = String

typealias Endpoint = String

typealias FilterList = Array<FilterRule>

typealias FilterValue = String

typealias FsxFilesystemArn = String

typealias FsxWindowsSubdirectory = String

typealias IamRoleArn = String

typealias LocationArn = String

typealias LocationList = Array<LocationListEntry>

typealias LocationUri = String

typealias LogGroupArn = String

typealias MaxResults = Number

typealias NetworkInterfaceArn = String

typealias NextToken = String

typealias NfsSubdirectory = String

typealias PLSecurityGroupArnList = Array<Ec2SecurityGroupArn>

typealias PLSubnetArnList = Array<Ec2SubnetArn>

typealias S3BucketArn = String

typealias S3Subdirectory = String

typealias ScheduleExpressionCron = String

typealias ServerHostname = String

typealias SmbDomain = String

typealias SmbPassword = String

typealias SmbSubdirectory = String

typealias SmbUser = String

typealias SourceNetworkInterfaceArns = Array<NetworkInterfaceArn>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<TagListEntry>

typealias TagValue = String

typealias TaggableResourceArn = String

typealias TaskArn = String

typealias TaskExecutionArn = String

typealias TaskExecutionList = Array<TaskExecutionListEntry>

typealias TaskList = Array<TaskListEntry>

typealias Time = Date

typealias VpcEndpointId = String

typealias long = Number

@JsModule("aws-sdk")
external open class DataSync(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DataSync.Types.ClientConfiguration */
    open fun cancelTaskExecution(params: CancelTaskExecutionRequest, callback: (err: AWSError, data: CancelTaskExecutionResponse) -> Unit = definedExternally): Request<CancelTaskExecutionResponse, AWSError>
    open fun cancelTaskExecution(callback: (err: AWSError, data: CancelTaskExecutionResponse) -> Unit = definedExternally): Request<CancelTaskExecutionResponse, AWSError>
    open fun createAgent(params: CreateAgentRequest, callback: (err: AWSError, data: CreateAgentResponse) -> Unit = definedExternally): Request<CreateAgentResponse, AWSError>
    open fun createAgent(callback: (err: AWSError, data: CreateAgentResponse) -> Unit = definedExternally): Request<CreateAgentResponse, AWSError>
    open fun createLocationEfs(params: CreateLocationEfsRequest, callback: (err: AWSError, data: CreateLocationEfsResponse) -> Unit = definedExternally): Request<CreateLocationEfsResponse, AWSError>
    open fun createLocationEfs(callback: (err: AWSError, data: CreateLocationEfsResponse) -> Unit = definedExternally): Request<CreateLocationEfsResponse, AWSError>
    open fun createLocationFsxWindows(params: CreateLocationFsxWindowsRequest, callback: (err: AWSError, data: CreateLocationFsxWindowsResponse) -> Unit = definedExternally): Request<CreateLocationFsxWindowsResponse, AWSError>
    open fun createLocationFsxWindows(callback: (err: AWSError, data: CreateLocationFsxWindowsResponse) -> Unit = definedExternally): Request<CreateLocationFsxWindowsResponse, AWSError>
    open fun createLocationNfs(params: CreateLocationNfsRequest, callback: (err: AWSError, data: CreateLocationNfsResponse) -> Unit = definedExternally): Request<CreateLocationNfsResponse, AWSError>
    open fun createLocationNfs(callback: (err: AWSError, data: CreateLocationNfsResponse) -> Unit = definedExternally): Request<CreateLocationNfsResponse, AWSError>
    open fun createLocationS3(params: CreateLocationS3Request, callback: (err: AWSError, data: CreateLocationS3Response) -> Unit = definedExternally): Request<CreateLocationS3Response, AWSError>
    open fun createLocationS3(callback: (err: AWSError, data: CreateLocationS3Response) -> Unit = definedExternally): Request<CreateLocationS3Response, AWSError>
    open fun createLocationSmb(params: CreateLocationSmbRequest, callback: (err: AWSError, data: CreateLocationSmbResponse) -> Unit = definedExternally): Request<CreateLocationSmbResponse, AWSError>
    open fun createLocationSmb(callback: (err: AWSError, data: CreateLocationSmbResponse) -> Unit = definedExternally): Request<CreateLocationSmbResponse, AWSError>
    open fun createTask(params: CreateTaskRequest, callback: (err: AWSError, data: CreateTaskResponse) -> Unit = definedExternally): Request<CreateTaskResponse, AWSError>
    open fun createTask(callback: (err: AWSError, data: CreateTaskResponse) -> Unit = definedExternally): Request<CreateTaskResponse, AWSError>
    open fun deleteAgent(params: DeleteAgentRequest, callback: (err: AWSError, data: DeleteAgentResponse) -> Unit = definedExternally): Request<DeleteAgentResponse, AWSError>
    open fun deleteAgent(callback: (err: AWSError, data: DeleteAgentResponse) -> Unit = definedExternally): Request<DeleteAgentResponse, AWSError>
    open fun deleteLocation(params: DeleteLocationRequest, callback: (err: AWSError, data: DeleteLocationResponse) -> Unit = definedExternally): Request<DeleteLocationResponse, AWSError>
    open fun deleteLocation(callback: (err: AWSError, data: DeleteLocationResponse) -> Unit = definedExternally): Request<DeleteLocationResponse, AWSError>
    open fun deleteTask(params: DeleteTaskRequest, callback: (err: AWSError, data: DeleteTaskResponse) -> Unit = definedExternally): Request<DeleteTaskResponse, AWSError>
    open fun deleteTask(callback: (err: AWSError, data: DeleteTaskResponse) -> Unit = definedExternally): Request<DeleteTaskResponse, AWSError>
    open fun describeAgent(params: DescribeAgentRequest, callback: (err: AWSError, data: DescribeAgentResponse) -> Unit = definedExternally): Request<DescribeAgentResponse, AWSError>
    open fun describeAgent(callback: (err: AWSError, data: DescribeAgentResponse) -> Unit = definedExternally): Request<DescribeAgentResponse, AWSError>
    open fun describeLocationEfs(params: DescribeLocationEfsRequest, callback: (err: AWSError, data: DescribeLocationEfsResponse) -> Unit = definedExternally): Request<DescribeLocationEfsResponse, AWSError>
    open fun describeLocationEfs(callback: (err: AWSError, data: DescribeLocationEfsResponse) -> Unit = definedExternally): Request<DescribeLocationEfsResponse, AWSError>
    open fun describeLocationFsxWindows(params: DescribeLocationFsxWindowsRequest, callback: (err: AWSError, data: DescribeLocationFsxWindowsResponse) -> Unit = definedExternally): Request<DescribeLocationFsxWindowsResponse, AWSError>
    open fun describeLocationFsxWindows(callback: (err: AWSError, data: DescribeLocationFsxWindowsResponse) -> Unit = definedExternally): Request<DescribeLocationFsxWindowsResponse, AWSError>
    open fun describeLocationNfs(params: DescribeLocationNfsRequest, callback: (err: AWSError, data: DescribeLocationNfsResponse) -> Unit = definedExternally): Request<DescribeLocationNfsResponse, AWSError>
    open fun describeLocationNfs(callback: (err: AWSError, data: DescribeLocationNfsResponse) -> Unit = definedExternally): Request<DescribeLocationNfsResponse, AWSError>
    open fun describeLocationS3(params: DescribeLocationS3Request, callback: (err: AWSError, data: DescribeLocationS3Response) -> Unit = definedExternally): Request<DescribeLocationS3Response, AWSError>
    open fun describeLocationS3(callback: (err: AWSError, data: DescribeLocationS3Response) -> Unit = definedExternally): Request<DescribeLocationS3Response, AWSError>
    open fun describeLocationSmb(params: DescribeLocationSmbRequest, callback: (err: AWSError, data: DescribeLocationSmbResponse) -> Unit = definedExternally): Request<DescribeLocationSmbResponse, AWSError>
    open fun describeLocationSmb(callback: (err: AWSError, data: DescribeLocationSmbResponse) -> Unit = definedExternally): Request<DescribeLocationSmbResponse, AWSError>
    open fun describeTask(params: DescribeTaskRequest, callback: (err: AWSError, data: DescribeTaskResponse) -> Unit = definedExternally): Request<DescribeTaskResponse, AWSError>
    open fun describeTask(callback: (err: AWSError, data: DescribeTaskResponse) -> Unit = definedExternally): Request<DescribeTaskResponse, AWSError>
    open fun describeTaskExecution(params: DescribeTaskExecutionRequest, callback: (err: AWSError, data: DescribeTaskExecutionResponse) -> Unit = definedExternally): Request<DescribeTaskExecutionResponse, AWSError>
    open fun describeTaskExecution(callback: (err: AWSError, data: DescribeTaskExecutionResponse) -> Unit = definedExternally): Request<DescribeTaskExecutionResponse, AWSError>
    open fun listAgents(params: ListAgentsRequest, callback: (err: AWSError, data: ListAgentsResponse) -> Unit = definedExternally): Request<ListAgentsResponse, AWSError>
    open fun listAgents(callback: (err: AWSError, data: ListAgentsResponse) -> Unit = definedExternally): Request<ListAgentsResponse, AWSError>
    open fun listLocations(params: ListLocationsRequest, callback: (err: AWSError, data: ListLocationsResponse) -> Unit = definedExternally): Request<ListLocationsResponse, AWSError>
    open fun listLocations(callback: (err: AWSError, data: ListLocationsResponse) -> Unit = definedExternally): Request<ListLocationsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTaskExecutions(params: ListTaskExecutionsRequest, callback: (err: AWSError, data: ListTaskExecutionsResponse) -> Unit = definedExternally): Request<ListTaskExecutionsResponse, AWSError>
    open fun listTaskExecutions(callback: (err: AWSError, data: ListTaskExecutionsResponse) -> Unit = definedExternally): Request<ListTaskExecutionsResponse, AWSError>
    open fun listTasks(params: ListTasksRequest, callback: (err: AWSError, data: ListTasksResponse) -> Unit = definedExternally): Request<ListTasksResponse, AWSError>
    open fun listTasks(callback: (err: AWSError, data: ListTasksResponse) -> Unit = definedExternally): Request<ListTasksResponse, AWSError>
    open fun startTaskExecution(params: StartTaskExecutionRequest, callback: (err: AWSError, data: StartTaskExecutionResponse) -> Unit = definedExternally): Request<StartTaskExecutionResponse, AWSError>
    open fun startTaskExecution(callback: (err: AWSError, data: StartTaskExecutionResponse) -> Unit = definedExternally): Request<StartTaskExecutionResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateAgent(params: UpdateAgentRequest, callback: (err: AWSError, data: UpdateAgentResponse) -> Unit = definedExternally): Request<UpdateAgentResponse, AWSError>
    open fun updateAgent(callback: (err: AWSError, data: UpdateAgentResponse) -> Unit = definedExternally): Request<UpdateAgentResponse, AWSError>
    open fun updateTask(params: UpdateTaskRequest, callback: (err: AWSError, data: UpdateTaskResponse) -> Unit = definedExternally): Request<UpdateTaskResponse, AWSError>
    open fun updateTask(callback: (err: AWSError, data: UpdateTaskResponse) -> Unit = definedExternally): Request<UpdateTaskResponse, AWSError>
    interface AgentListEntry {
        var AgentArn: AgentArn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: TagValue?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ONLINE" | "OFFLINE" | String */
    }
    interface CancelTaskExecutionRequest {
        var TaskExecutionArn: TaskExecutionArn
    }
    interface CancelTaskExecutionResponse
    interface CreateAgentRequest {
        var ActivationKey: ActivationKey
        var AgentName: TagValue?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var VpcEndpointId: VpcEndpointId?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetArns: PLSubnetArnList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupArns: PLSecurityGroupArnList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAgentResponse {
        var AgentArn: AgentArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLocationEfsRequest {
        var Subdirectory: EfsSubdirectory?
            get() = definedExternally
            set(value) = definedExternally
        var EfsFilesystemArn: EfsFilesystemArn
        var Ec2Config: Ec2Config
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLocationEfsResponse {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLocationFsxWindowsRequest {
        var Subdirectory: FsxWindowsSubdirectory?
            get() = definedExternally
            set(value) = definedExternally
        var FsxFilesystemArn: FsxFilesystemArn
        var SecurityGroupArns: Ec2SecurityGroupArnList
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var User: SmbUser
        var Domain: SmbDomain?
            get() = definedExternally
            set(value) = definedExternally
        var Password: SmbPassword
    }
    interface CreateLocationFsxWindowsResponse {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLocationNfsRequest {
        var Subdirectory: NfsSubdirectory
        var ServerHostname: ServerHostname
        var OnPremConfig: OnPremConfig
        var MountOptions: NfsMountOptions?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLocationNfsResponse {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLocationS3Request {
        var Subdirectory: S3Subdirectory?
            get() = definedExternally
            set(value) = definedExternally
        var S3BucketArn: S3BucketArn
        var S3StorageClass: String /* "STANDARD" | "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "GLACIER" | "DEEP_ARCHIVE" | String */
        var S3Config: S3Config
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLocationS3Response {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLocationSmbRequest {
        var Subdirectory: SmbSubdirectory
        var ServerHostname: ServerHostname
        var User: SmbUser
        var Domain: SmbDomain?
            get() = definedExternally
            set(value) = definedExternally
        var Password: SmbPassword
        var AgentArns: AgentArnList
        var MountOptions: SmbMountOptions?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateLocationSmbResponse {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTaskRequest {
        var SourceLocationArn: LocationArn
        var DestinationLocationArn: LocationArn
        var CloudWatchLogGroupArn: LogGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: TagValue?
            get() = definedExternally
            set(value) = definedExternally
        var Options: Options?
            get() = definedExternally
            set(value) = definedExternally
        var Excludes: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: TaskSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTaskResponse {
        var TaskArn: TaskArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAgentRequest {
        var AgentArn: AgentArn
    }
    interface DeleteAgentResponse
    interface DeleteLocationRequest {
        var LocationArn: LocationArn
    }
    interface DeleteLocationResponse
    interface DeleteTaskRequest {
        var TaskArn: TaskArn
    }
    interface DeleteTaskResponse
    interface DescribeAgentRequest {
        var AgentArn: AgentArn
    }
    interface DescribeAgentResponse {
        var AgentArn: AgentArn?
            get() = definedExternally
            set(value) = definedExternally
        var Name: TagValue?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ONLINE" | "OFFLINE" | String */
        var LastConnectionTime: Time?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Time?
            get() = definedExternally
            set(value) = definedExternally
        var EndpointType: String /* "PUBLIC" | "PRIVATE_LINK" | "FIPS" | String */
        var PrivateLinkConfig: PrivateLinkConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLocationEfsRequest {
        var LocationArn: LocationArn
    }
    interface DescribeLocationEfsResponse {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: LocationUri?
            get() = definedExternally
            set(value) = definedExternally
        var Ec2Config: Ec2Config?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLocationFsxWindowsRequest {
        var LocationArn: LocationArn
    }
    interface DescribeLocationFsxWindowsResponse {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: LocationUri?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupArns: Ec2SecurityGroupArnList?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Time?
            get() = definedExternally
            set(value) = definedExternally
        var User: SmbUser?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: SmbDomain?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLocationNfsRequest {
        var LocationArn: LocationArn
    }
    interface DescribeLocationNfsResponse {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: LocationUri?
            get() = definedExternally
            set(value) = definedExternally
        var OnPremConfig: OnPremConfig?
            get() = definedExternally
            set(value) = definedExternally
        var MountOptions: NfsMountOptions?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLocationS3Request {
        var LocationArn: LocationArn
    }
    interface DescribeLocationS3Response {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: LocationUri?
            get() = definedExternally
            set(value) = definedExternally
        var S3StorageClass: String /* "STANDARD" | "STANDARD_IA" | "ONEZONE_IA" | "INTELLIGENT_TIERING" | "GLACIER" | "DEEP_ARCHIVE" | String */
        var S3Config: S3Config?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeLocationSmbRequest {
        var LocationArn: LocationArn
    }
    interface DescribeLocationSmbResponse {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: LocationUri?
            get() = definedExternally
            set(value) = definedExternally
        var AgentArns: AgentArnList?
            get() = definedExternally
            set(value) = definedExternally
        var User: SmbUser?
            get() = definedExternally
            set(value) = definedExternally
        var Domain: SmbDomain?
            get() = definedExternally
            set(value) = definedExternally
        var MountOptions: SmbMountOptions?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTaskExecutionRequest {
        var TaskExecutionArn: TaskExecutionArn
    }
    interface DescribeTaskExecutionResponse {
        var TaskExecutionArn: TaskExecutionArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "QUEUED" | "LAUNCHING" | "PREPARING" | "TRANSFERRING" | "VERIFYING" | "SUCCESS" | "ERROR" | String */
        var Options: Options?
            get() = definedExternally
            set(value) = definedExternally
        var Excludes: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Includes: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Time?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedFilesToTransfer: long?
            get() = definedExternally
            set(value) = definedExternally
        var EstimatedBytesToTransfer: long?
            get() = definedExternally
            set(value) = definedExternally
        var FilesTransferred: long?
            get() = definedExternally
            set(value) = definedExternally
        var BytesWritten: long?
            get() = definedExternally
            set(value) = definedExternally
        var BytesTransferred: long?
            get() = definedExternally
            set(value) = definedExternally
        var Result: TaskExecutionResultDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTaskRequest {
        var TaskArn: TaskArn
    }
    interface DescribeTaskResponse {
        var TaskArn: TaskArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "CREATING" | "QUEUED" | "RUNNING" | "UNAVAILABLE" | String */
        var Name: TagValue?
            get() = definedExternally
            set(value) = definedExternally
        var CurrentTaskExecutionArn: TaskExecutionArn?
            get() = definedExternally
            set(value) = definedExternally
        var SourceLocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationLocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogGroupArn: LogGroupArn?
            get() = definedExternally
            set(value) = definedExternally
        var SourceNetworkInterfaceArns: SourceNetworkInterfaceArns?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationNetworkInterfaceArns: DestinationNetworkInterfaceArns?
            get() = definedExternally
            set(value) = definedExternally
        var Options: Options?
            get() = definedExternally
            set(value) = definedExternally
        var Excludes: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: TaskSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetail: String?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Ec2Config {
        var SubnetArn: Ec2SubnetArn
        var SecurityGroupArns: Ec2SecurityGroupArnList
    }
    interface FilterRule {
        var FilterType: String /* "SIMPLE_PATTERN" | String */
        var Value: FilterValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAgentsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAgentsResponse {
        var Agents: AgentList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLocationsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListLocationsResponse {
        var Locations: LocationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var ResourceArn: TaggableResourceArn
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceResponse {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTaskExecutionsRequest {
        var TaskArn: TaskArn?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTaskExecutionsResponse {
        var TaskExecutions: TaskExecutionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTasksRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTasksResponse {
        var Tasks: TaskList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LocationListEntry {
        var LocationArn: LocationArn?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: LocationUri?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NfsMountOptions {
        var Version: String /* "AUTOMATIC" | "NFS3" | "NFS4_0" | "NFS4_1" | String */
    }
    interface OnPremConfig {
        var AgentArns: AgentArnList
    }
    interface Options {
        var VerifyMode: String /* "POINT_IN_TIME_CONSISTENT" | "ONLY_FILES_TRANSFERRED" | "NONE" | String */
        var OverwriteMode: String /* "ALWAYS" | "NEVER" | String */
        var Atime: String /* "NONE" | "BEST_EFFORT" | String */
        var Mtime: String /* "NONE" | "PRESERVE" | String */
        var Uid: String /* "NONE" | "INT_VALUE" | "NAME" | "BOTH" | String */
        var Gid: String /* "NONE" | "INT_VALUE" | "NAME" | "BOTH" | String */
        var PreserveDeletedFiles: String /* "PRESERVE" | "REMOVE" | String */
        var PreserveDevices: String /* "NONE" | "PRESERVE" | String */
        var PosixPermissions: String /* "NONE" | "PRESERVE" | String */
        var BytesPerSecond: BytesPerSecond?
            get() = definedExternally
            set(value) = definedExternally
        var TaskQueueing: String /* "ENABLED" | "DISABLED" | String */
        var LogLevel: String /* "OFF" | "BASIC" | "TRANSFER" | String */
    }
    interface PrivateLinkConfig {
        var VpcEndpointId: VpcEndpointId?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateLinkEndpoint: Endpoint?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetArns: PLSubnetArnList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupArns: PLSecurityGroupArnList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Config {
        var BucketAccessRoleArn: IamRoleArn
    }
    interface SmbMountOptions {
        var Version: String /* "AUTOMATIC" | "SMB2" | "SMB3" | String */
    }
    interface StartTaskExecutionRequest {
        var TaskArn: TaskArn
        var OverrideOptions: Options?
            get() = definedExternally
            set(value) = definedExternally
        var Includes: FilterList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartTaskExecutionResponse {
        var TaskExecutionArn: TaskExecutionArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagListEntry {
        var Key: TagKey
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: TaggableResourceArn
        var Tags: TagList
    }
    interface TagResourceResponse
    interface TaskExecutionListEntry {
        var TaskExecutionArn: TaskExecutionArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "QUEUED" | "LAUNCHING" | "PREPARING" | "TRANSFERRING" | "VERIFYING" | "SUCCESS" | "ERROR" | String */
    }
    interface TaskExecutionResultDetail {
        var PrepareDuration: Duration?
            get() = definedExternally
            set(value) = definedExternally
        var PrepareStatus: String /* "PENDING" | "SUCCESS" | "ERROR" | String */
        var TotalDuration: Duration?
            get() = definedExternally
            set(value) = definedExternally
        var TransferDuration: Duration?
            get() = definedExternally
            set(value) = definedExternally
        var TransferStatus: String /* "PENDING" | "SUCCESS" | "ERROR" | String */
        var VerifyDuration: Duration?
            get() = definedExternally
            set(value) = definedExternally
        var VerifyStatus: String /* "PENDING" | "SUCCESS" | "ERROR" | String */
        var ErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetail: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskListEntry {
        var TaskArn: TaskArn?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "AVAILABLE" | "CREATING" | "QUEUED" | "RUNNING" | "UNAVAILABLE" | String */
        var Name: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskSchedule {
        var ScheduleExpression: ScheduleExpressionCron
    }
    interface UntagResourceRequest {
        var ResourceArn: TaggableResourceArn
        var Keys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateAgentRequest {
        var AgentArn: AgentArn
        var Name: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAgentResponse
    interface UpdateTaskRequest {
        var TaskArn: TaskArn
        var Options: Options?
            get() = definedExternally
            set(value) = definedExternally
        var Excludes: FilterList?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: TaskSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var Name: TagValue?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchLogGroupArn: LogGroupArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTaskResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2018-11-09" | "latest" | String */
    }
}