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
import Batch.AttemptDetail
import Batch.ComputeEnvironmentDetail
import Batch.ComputeEnvironmentOrder
import Batch.Device
import Batch.KeyValuePair
import Batch.JobDefinition
import Batch.JobDependency
import Batch.JobDetail
import Batch.JobQueueDetail
import Batch.JobSummary
import Batch.MountPoint
import Batch.NetworkInterface
import Batch.NodePropertyOverride
import Batch.NodeRangeProperty
import Batch.ResourceRequirement
import Batch.Ulimit
import Batch.Volume
import Batch.CancelJobRequest
import Batch.CancelJobResponse
import Batch.CreateComputeEnvironmentRequest
import Batch.CreateComputeEnvironmentResponse
import Batch.CreateJobQueueRequest
import Batch.CreateJobQueueResponse
import Batch.DeleteComputeEnvironmentRequest
import Batch.DeleteComputeEnvironmentResponse
import Batch.DeleteJobQueueRequest
import Batch.DeleteJobQueueResponse
import Batch.DeregisterJobDefinitionRequest
import Batch.DeregisterJobDefinitionResponse
import Batch.DescribeComputeEnvironmentsRequest
import Batch.DescribeComputeEnvironmentsResponse
import Batch.DescribeJobDefinitionsRequest
import Batch.DescribeJobDefinitionsResponse
import Batch.DescribeJobQueuesRequest
import Batch.DescribeJobQueuesResponse
import Batch.DescribeJobsRequest
import Batch.DescribeJobsResponse
import Batch.ListJobsRequest
import Batch.ListJobsResponse
import Batch.RegisterJobDefinitionRequest
import Batch.RegisterJobDefinitionResponse
import Batch.SubmitJobRequest
import Batch.SubmitJobResponse
import Batch.TerminateJobRequest
import Batch.TerminateJobResponse
import Batch.UpdateComputeEnvironmentRequest
import Batch.UpdateComputeEnvironmentResponse
import Batch.UpdateJobQueueRequest
import Batch.UpdateJobQueueResponse
import Batch.ArrayJobStatusSummary
import Batch.AttemptContainerDetail
import Batch.ComputeResource
import Batch.TagsMap
import Batch.LaunchTemplateSpecification
import Batch.LinuxParameters
import Batch.ParametersMap
import Batch.RetryStrategy
import Batch.ContainerProperties
import Batch.JobTimeout
import Batch.NodeProperties
import Batch.ContainerDetail
import Batch.NodeDetails
import Batch.ArrayPropertiesDetail
import Batch.ContainerSummary
import Batch.ArrayPropertiesSummary
import Batch.NodePropertiesSummary
import Batch.ContainerOverrides
import Batch.ArrayProperties
import Batch.NodeOverrides
import Batch.ComputeResourceUpdate
import Batch.Host

typealias AttemptDetails = Array<AttemptDetail>

typealias Boolean = Boolean

typealias ComputeEnvironmentDetailList = Array<ComputeEnvironmentDetail>

typealias ComputeEnvironmentOrders = Array<ComputeEnvironmentOrder>

typealias DeviceCgroupPermissions = Array<String /* "READ" | "WRITE" | "MKNOD" | String */>

typealias DevicesList = Array<Device>

typealias EnvironmentVariables = Array<KeyValuePair>

typealias Integer = Number

typealias JobDefinitionList = Array<JobDefinition>

typealias JobDependencyList = Array<JobDependency>

typealias JobDetailList = Array<JobDetail>

typealias JobQueueDetailList = Array<JobQueueDetail>

typealias JobSummaryList = Array<JobSummary>

typealias Long = Number

typealias MountPoints = Array<MountPoint>

typealias NetworkInterfaceList = Array<NetworkInterface>

typealias NodePropertyOverrides = Array<NodePropertyOverride>

typealias NodeRangeProperties = Array<NodeRangeProperty>

typealias ResourceRequirements = Array<ResourceRequirement>

typealias String = String

typealias StringList = Array<String>

typealias Ulimits = Array<Ulimit>

typealias Volumes = Array<Volume>

@JsModule("aws-sdk")
external open class Batch(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Batch.Types.ClientConfiguration */
    open fun cancelJob(params: CancelJobRequest, callback: (err: AWSError, data: CancelJobResponse) -> Unit = definedExternally): Request<CancelJobResponse, AWSError>
    open fun cancelJob(callback: (err: AWSError, data: CancelJobResponse) -> Unit = definedExternally): Request<CancelJobResponse, AWSError>
    open fun createComputeEnvironment(params: CreateComputeEnvironmentRequest, callback: (err: AWSError, data: CreateComputeEnvironmentResponse) -> Unit = definedExternally): Request<CreateComputeEnvironmentResponse, AWSError>
    open fun createComputeEnvironment(callback: (err: AWSError, data: CreateComputeEnvironmentResponse) -> Unit = definedExternally): Request<CreateComputeEnvironmentResponse, AWSError>
    open fun createJobQueue(params: CreateJobQueueRequest, callback: (err: AWSError, data: CreateJobQueueResponse) -> Unit = definedExternally): Request<CreateJobQueueResponse, AWSError>
    open fun createJobQueue(callback: (err: AWSError, data: CreateJobQueueResponse) -> Unit = definedExternally): Request<CreateJobQueueResponse, AWSError>
    open fun deleteComputeEnvironment(params: DeleteComputeEnvironmentRequest, callback: (err: AWSError, data: DeleteComputeEnvironmentResponse) -> Unit = definedExternally): Request<DeleteComputeEnvironmentResponse, AWSError>
    open fun deleteComputeEnvironment(callback: (err: AWSError, data: DeleteComputeEnvironmentResponse) -> Unit = definedExternally): Request<DeleteComputeEnvironmentResponse, AWSError>
    open fun deleteJobQueue(params: DeleteJobQueueRequest, callback: (err: AWSError, data: DeleteJobQueueResponse) -> Unit = definedExternally): Request<DeleteJobQueueResponse, AWSError>
    open fun deleteJobQueue(callback: (err: AWSError, data: DeleteJobQueueResponse) -> Unit = definedExternally): Request<DeleteJobQueueResponse, AWSError>
    open fun deregisterJobDefinition(params: DeregisterJobDefinitionRequest, callback: (err: AWSError, data: DeregisterJobDefinitionResponse) -> Unit = definedExternally): Request<DeregisterJobDefinitionResponse, AWSError>
    open fun deregisterJobDefinition(callback: (err: AWSError, data: DeregisterJobDefinitionResponse) -> Unit = definedExternally): Request<DeregisterJobDefinitionResponse, AWSError>
    open fun describeComputeEnvironments(params: DescribeComputeEnvironmentsRequest, callback: (err: AWSError, data: DescribeComputeEnvironmentsResponse) -> Unit = definedExternally): Request<DescribeComputeEnvironmentsResponse, AWSError>
    open fun describeComputeEnvironments(callback: (err: AWSError, data: DescribeComputeEnvironmentsResponse) -> Unit = definedExternally): Request<DescribeComputeEnvironmentsResponse, AWSError>
    open fun describeJobDefinitions(params: DescribeJobDefinitionsRequest, callback: (err: AWSError, data: DescribeJobDefinitionsResponse) -> Unit = definedExternally): Request<DescribeJobDefinitionsResponse, AWSError>
    open fun describeJobDefinitions(callback: (err: AWSError, data: DescribeJobDefinitionsResponse) -> Unit = definedExternally): Request<DescribeJobDefinitionsResponse, AWSError>
    open fun describeJobQueues(params: DescribeJobQueuesRequest, callback: (err: AWSError, data: DescribeJobQueuesResponse) -> Unit = definedExternally): Request<DescribeJobQueuesResponse, AWSError>
    open fun describeJobQueues(callback: (err: AWSError, data: DescribeJobQueuesResponse) -> Unit = definedExternally): Request<DescribeJobQueuesResponse, AWSError>
    open fun describeJobs(params: DescribeJobsRequest, callback: (err: AWSError, data: DescribeJobsResponse) -> Unit = definedExternally): Request<DescribeJobsResponse, AWSError>
    open fun describeJobs(callback: (err: AWSError, data: DescribeJobsResponse) -> Unit = definedExternally): Request<DescribeJobsResponse, AWSError>
    open fun listJobs(params: ListJobsRequest, callback: (err: AWSError, data: ListJobsResponse) -> Unit = definedExternally): Request<ListJobsResponse, AWSError>
    open fun listJobs(callback: (err: AWSError, data: ListJobsResponse) -> Unit = definedExternally): Request<ListJobsResponse, AWSError>
    open fun registerJobDefinition(params: RegisterJobDefinitionRequest, callback: (err: AWSError, data: RegisterJobDefinitionResponse) -> Unit = definedExternally): Request<RegisterJobDefinitionResponse, AWSError>
    open fun registerJobDefinition(callback: (err: AWSError, data: RegisterJobDefinitionResponse) -> Unit = definedExternally): Request<RegisterJobDefinitionResponse, AWSError>
    open fun submitJob(params: SubmitJobRequest, callback: (err: AWSError, data: SubmitJobResponse) -> Unit = definedExternally): Request<SubmitJobResponse, AWSError>
    open fun submitJob(callback: (err: AWSError, data: SubmitJobResponse) -> Unit = definedExternally): Request<SubmitJobResponse, AWSError>
    open fun terminateJob(params: TerminateJobRequest, callback: (err: AWSError, data: TerminateJobResponse) -> Unit = definedExternally): Request<TerminateJobResponse, AWSError>
    open fun terminateJob(callback: (err: AWSError, data: TerminateJobResponse) -> Unit = definedExternally): Request<TerminateJobResponse, AWSError>
    open fun updateComputeEnvironment(params: UpdateComputeEnvironmentRequest, callback: (err: AWSError, data: UpdateComputeEnvironmentResponse) -> Unit = definedExternally): Request<UpdateComputeEnvironmentResponse, AWSError>
    open fun updateComputeEnvironment(callback: (err: AWSError, data: UpdateComputeEnvironmentResponse) -> Unit = definedExternally): Request<UpdateComputeEnvironmentResponse, AWSError>
    open fun updateJobQueue(params: UpdateJobQueueRequest, callback: (err: AWSError, data: UpdateJobQueueResponse) -> Unit = definedExternally): Request<UpdateJobQueueResponse, AWSError>
    open fun updateJobQueue(callback: (err: AWSError, data: UpdateJobQueueResponse) -> Unit = definedExternally): Request<UpdateJobQueueResponse, AWSError>
    interface ArrayJobStatusSummary {
        @nativeGetter
        operator fun get(key: String): Integer?
        @nativeSetter
        operator fun set(key: String, value: Integer)
    }
    interface ArrayProperties {
        var size: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ArrayPropertiesDetail {
        var statusSummary: ArrayJobStatusSummary?
            get() = definedExternally
            set(value) = definedExternally
        var size: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var index: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ArrayPropertiesSummary {
        var size: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var index: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttemptContainerDetail {
        var containerInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var exitCode: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var reason: String?
            get() = definedExternally
            set(value) = definedExternally
        var logStreamName: String?
            get() = definedExternally
            set(value) = definedExternally
        var networkInterfaces: NetworkInterfaceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttemptDetail {
        var container: AttemptContainerDetail?
            get() = definedExternally
            set(value) = definedExternally
        var startedAt: Long?
            get() = definedExternally
            set(value) = definedExternally
        var stoppedAt: Long?
            get() = definedExternally
            set(value) = definedExternally
        var statusReason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelJobRequest {
        var jobId: String
        var reason: String
    }
    interface CancelJobResponse
    interface ComputeEnvironmentDetail {
        var computeEnvironmentName: String
        var computeEnvironmentArn: String
        var ecsClusterArn: String
        var type: String /* "MANAGED" | "UNMANAGED" | String */
        var state: String /* "ENABLED" | "DISABLED" | String */
        var status: String /* "CREATING" | "UPDATING" | "DELETING" | "DELETED" | "VALID" | "INVALID" | String */
        var statusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var computeResources: ComputeResource?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRole: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComputeEnvironmentOrder {
        var order: Integer
        var computeEnvironment: String
    }
    interface ComputeResource {
        var type: String /* "EC2" | "SPOT" | String */
        var allocationStrategy: String /* "BEST_FIT" | "BEST_FIT_PROGRESSIVE" | "SPOT_CAPACITY_OPTIMIZED" | String */
        var minvCpus: Integer
        var maxvCpus: Integer
        var desiredvCpus: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var instanceTypes: StringList
        var imageId: String?
            get() = definedExternally
            set(value) = definedExternally
        var subnets: StringList
        var securityGroupIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var ec2KeyPair: String?
            get() = definedExternally
            set(value) = definedExternally
        var instanceRole: String
        var tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
        var placementGroup: String?
            get() = definedExternally
            set(value) = definedExternally
        var bidPercentage: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var spotIamFleetRole: String?
            get() = definedExternally
            set(value) = definedExternally
        var launchTemplate: LaunchTemplateSpecification?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComputeResourceUpdate {
        var minvCpus: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var maxvCpus: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var desiredvCpus: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerDetail {
        var image: String?
            get() = definedExternally
            set(value) = definedExternally
        var vcpus: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var memory: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var command: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var jobRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var volumes: Volumes?
            get() = definedExternally
            set(value) = definedExternally
        var environment: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var mountPoints: MountPoints?
            get() = definedExternally
            set(value) = definedExternally
        var readonlyRootFilesystem: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ulimits: Ulimits?
            get() = definedExternally
            set(value) = definedExternally
        var privileged: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var user: String?
            get() = definedExternally
            set(value) = definedExternally
        var exitCode: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var reason: String?
            get() = definedExternally
            set(value) = definedExternally
        var containerInstanceArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var taskArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var logStreamName: String?
            get() = definedExternally
            set(value) = definedExternally
        var instanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var networkInterfaces: NetworkInterfaceList?
            get() = definedExternally
            set(value) = definedExternally
        var resourceRequirements: ResourceRequirements?
            get() = definedExternally
            set(value) = definedExternally
        var linuxParameters: LinuxParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerOverrides {
        var vcpus: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var memory: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var command: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var instanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var environment: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var resourceRequirements: ResourceRequirements?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerProperties {
        var image: String?
            get() = definedExternally
            set(value) = definedExternally
        var vcpus: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var memory: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var command: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var jobRoleArn: String?
            get() = definedExternally
            set(value) = definedExternally
        var volumes: Volumes?
            get() = definedExternally
            set(value) = definedExternally
        var environment: EnvironmentVariables?
            get() = definedExternally
            set(value) = definedExternally
        var mountPoints: MountPoints?
            get() = definedExternally
            set(value) = definedExternally
        var readonlyRootFilesystem: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var privileged: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ulimits: Ulimits?
            get() = definedExternally
            set(value) = definedExternally
        var user: String?
            get() = definedExternally
            set(value) = definedExternally
        var instanceType: String?
            get() = definedExternally
            set(value) = definedExternally
        var resourceRequirements: ResourceRequirements?
            get() = definedExternally
            set(value) = definedExternally
        var linuxParameters: LinuxParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContainerSummary {
        var exitCode: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var reason: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateComputeEnvironmentRequest {
        var computeEnvironmentName: String
        var type: String /* "MANAGED" | "UNMANAGED" | String */
        var state: String /* "ENABLED" | "DISABLED" | String */
        var computeResources: ComputeResource?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRole: String
    }
    interface CreateComputeEnvironmentResponse {
        var computeEnvironmentName: String?
            get() = definedExternally
            set(value) = definedExternally
        var computeEnvironmentArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobQueueRequest {
        var jobQueueName: String
        var state: String /* "ENABLED" | "DISABLED" | String */
        var priority: Integer
        var computeEnvironmentOrder: ComputeEnvironmentOrders
    }
    interface CreateJobQueueResponse {
        var jobQueueName: String
        var jobQueueArn: String
    }
    interface DeleteComputeEnvironmentRequest {
        var computeEnvironment: String
    }
    interface DeleteComputeEnvironmentResponse
    interface DeleteJobQueueRequest {
        var jobQueue: String
    }
    interface DeleteJobQueueResponse
    interface DeregisterJobDefinitionRequest {
        var jobDefinition: String
    }
    interface DeregisterJobDefinitionResponse
    interface DescribeComputeEnvironmentsRequest {
        var computeEnvironments: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeComputeEnvironmentsResponse {
        var computeEnvironments: ComputeEnvironmentDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobDefinitionsRequest {
        var jobDefinitions: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var jobDefinitionName: String?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobDefinitionsResponse {
        var jobDefinitions: JobDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobQueuesRequest {
        var jobQueues: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobQueuesResponse {
        var jobQueues: JobQueueDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeJobsRequest {
        var jobs: StringList
    }
    interface DescribeJobsResponse {
        var jobs: JobDetailList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Device {
        var hostPath: String
        var containerPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var permissions: DeviceCgroupPermissions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Host {
        var sourcePath: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobDefinition {
        var jobDefinitionName: String
        var jobDefinitionArn: String
        var revision: Integer
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String
        var parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
        var retryStrategy: RetryStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var containerProperties: ContainerProperties?
            get() = definedExternally
            set(value) = definedExternally
        var timeout: JobTimeout?
            get() = definedExternally
            set(value) = definedExternally
        var nodeProperties: NodeProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobDependency {
        var jobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "N_TO_N" | "SEQUENTIAL" | String */
    }
    interface JobDetail {
        var jobName: String
        var jobId: String
        var jobQueue: String
        var status: String /* "SUBMITTED" | "PENDING" | "RUNNABLE" | "STARTING" | "RUNNING" | "SUCCEEDED" | "FAILED" | String */
        var attempts: AttemptDetails?
            get() = definedExternally
            set(value) = definedExternally
        var statusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: Long?
            get() = definedExternally
            set(value) = definedExternally
        var retryStrategy: RetryStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var startedAt: Long
        var stoppedAt: Long?
            get() = definedExternally
            set(value) = definedExternally
        var dependsOn: JobDependencyList?
            get() = definedExternally
            set(value) = definedExternally
        var jobDefinition: String
        var parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
        var container: ContainerDetail?
            get() = definedExternally
            set(value) = definedExternally
        var nodeDetails: NodeDetails?
            get() = definedExternally
            set(value) = definedExternally
        var nodeProperties: NodeProperties?
            get() = definedExternally
            set(value) = definedExternally
        var arrayProperties: ArrayPropertiesDetail?
            get() = definedExternally
            set(value) = definedExternally
        var timeout: JobTimeout?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobQueueDetail {
        var jobQueueName: String
        var jobQueueArn: String
        var state: String /* "ENABLED" | "DISABLED" | String */
        var status: String /* "CREATING" | "UPDATING" | "DELETING" | "DELETED" | "VALID" | "INVALID" | String */
        var statusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var priority: Integer
        var computeEnvironmentOrder: ComputeEnvironmentOrders
    }
    interface JobSummary {
        var jobId: String
        var jobName: String
        var createdAt: Long?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "SUBMITTED" | "PENDING" | "RUNNABLE" | "STARTING" | "RUNNING" | "SUCCEEDED" | "FAILED" | String */
        var statusReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var startedAt: Long?
            get() = definedExternally
            set(value) = definedExternally
        var stoppedAt: Long?
            get() = definedExternally
            set(value) = definedExternally
        var container: ContainerSummary?
            get() = definedExternally
            set(value) = definedExternally
        var arrayProperties: ArrayPropertiesSummary?
            get() = definedExternally
            set(value) = definedExternally
        var nodeProperties: NodePropertiesSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobTimeout {
        var attemptDurationSeconds: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface KeyValuePair {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var value: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchTemplateSpecification {
        var launchTemplateId: String?
            get() = definedExternally
            set(value) = definedExternally
        var launchTemplateName: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LinuxParameters {
        var devices: DevicesList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsRequest {
        var jobQueue: String?
            get() = definedExternally
            set(value) = definedExternally
        var arrayJobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var multiNodeJobId: String?
            get() = definedExternally
            set(value) = definedExternally
        var jobStatus: String /* "SUBMITTED" | "PENDING" | "RUNNABLE" | "STARTING" | "RUNNING" | "SUCCEEDED" | "FAILED" | String */
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsResponse {
        var jobSummaryList: JobSummaryList
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MountPoint {
        var containerPath: String?
            get() = definedExternally
            set(value) = definedExternally
        var readOnly: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var sourceVolume: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NetworkInterface {
        var attachmentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var ipv6Address: String?
            get() = definedExternally
            set(value) = definedExternally
        var privateIpv4Address: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeDetails {
        var nodeIndex: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var isMainNode: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeOverrides {
        var numNodes: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nodePropertyOverrides: NodePropertyOverrides?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeProperties {
        var numNodes: Integer
        var mainNode: Integer
        var nodeRangeProperties: NodeRangeProperties
    }
    interface NodePropertiesSummary {
        var isMainNode: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var numNodes: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nodeIndex: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodePropertyOverride {
        var targetNodes: String
        var containerOverrides: ContainerOverrides?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NodeRangeProperty {
        var targetNodes: String
        var container: ContainerProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParametersMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface RegisterJobDefinitionRequest {
        var jobDefinitionName: String
        var type: String /* "container" | "multinode" | String */
        var parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
        var containerProperties: ContainerProperties?
            get() = definedExternally
            set(value) = definedExternally
        var nodeProperties: NodeProperties?
            get() = definedExternally
            set(value) = definedExternally
        var retryStrategy: RetryStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var timeout: JobTimeout?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterJobDefinitionResponse {
        var jobDefinitionName: String
        var jobDefinitionArn: String
        var revision: Integer
    }
    interface ResourceRequirement {
        var value: String
        var type: String /* "GPU" | String */
    }
    interface RetryStrategy {
        var attempts: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubmitJobRequest {
        var jobName: String
        var jobQueue: String
        var arrayProperties: ArrayProperties?
            get() = definedExternally
            set(value) = definedExternally
        var dependsOn: JobDependencyList?
            get() = definedExternally
            set(value) = definedExternally
        var jobDefinition: String
        var parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
        var containerOverrides: ContainerOverrides?
            get() = definedExternally
            set(value) = definedExternally
        var nodeOverrides: NodeOverrides?
            get() = definedExternally
            set(value) = definedExternally
        var retryStrategy: RetryStrategy?
            get() = definedExternally
            set(value) = definedExternally
        var timeout: JobTimeout?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SubmitJobResponse {
        var jobName: String
        var jobId: String
    }
    interface TagsMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface TerminateJobRequest {
        var jobId: String
        var reason: String
    }
    interface TerminateJobResponse
    interface Ulimit {
        var hardLimit: Integer
        var name: String
        var softLimit: Integer
    }
    interface UpdateComputeEnvironmentRequest {
        var computeEnvironment: String
        var state: String /* "ENABLED" | "DISABLED" | String */
        var computeResources: ComputeResourceUpdate?
            get() = definedExternally
            set(value) = definedExternally
        var serviceRole: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateComputeEnvironmentResponse {
        var computeEnvironmentName: String?
            get() = definedExternally
            set(value) = definedExternally
        var computeEnvironmentArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateJobQueueRequest {
        var jobQueue: String
        var state: String /* "ENABLED" | "DISABLED" | String */
        var priority: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var computeEnvironmentOrder: ComputeEnvironmentOrders?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateJobQueueResponse {
        var jobQueueName: String?
            get() = definedExternally
            set(value) = definedExternally
        var jobQueueArn: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Volume {
        var host: Host?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-08-10" | "latest" | String */
    }
}