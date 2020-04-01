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
import RoboMaker.SimulationJobRequest
import RoboMaker.DataSourceConfig
import RoboMaker.DataSource
import RoboMaker.DeploymentApplicationConfig
import RoboMaker.DeploymentJob
import RoboMaker.FailedCreateSimulationJobRequest
import RoboMaker.Filter
import RoboMaker.Fleet
import RoboMaker.PortMapping
import RoboMaker.RobotApplicationConfig
import RoboMaker.RobotApplicationSummary
import RoboMaker.RobotDeployment
import RoboMaker.Robot
import RoboMaker.S3KeyOutput
import RoboMaker.SimulationApplicationConfig
import RoboMaker.SimulationApplicationSummary
import RoboMaker.SimulationJobBatchSummary
import RoboMaker.SimulationJobSummary
import RoboMaker.SimulationJob
import RoboMaker.SourceConfig
import RoboMaker.Source
import RoboMaker.BatchDescribeSimulationJobRequest
import RoboMaker.BatchDescribeSimulationJobResponse
import RoboMaker.CancelDeploymentJobRequest
import RoboMaker.CancelDeploymentJobResponse
import RoboMaker.CancelSimulationJobRequest
import RoboMaker.CancelSimulationJobResponse
import RoboMaker.CancelSimulationJobBatchRequest
import RoboMaker.CancelSimulationJobBatchResponse
import RoboMaker.CreateDeploymentJobRequest
import RoboMaker.CreateDeploymentJobResponse
import RoboMaker.CreateFleetRequest
import RoboMaker.CreateFleetResponse
import RoboMaker.CreateRobotRequest
import RoboMaker.CreateRobotResponse
import RoboMaker.CreateRobotApplicationRequest
import RoboMaker.CreateRobotApplicationResponse
import RoboMaker.CreateRobotApplicationVersionRequest
import RoboMaker.CreateRobotApplicationVersionResponse
import RoboMaker.CreateSimulationApplicationRequest
import RoboMaker.CreateSimulationApplicationResponse
import RoboMaker.CreateSimulationApplicationVersionRequest
import RoboMaker.CreateSimulationApplicationVersionResponse
import RoboMaker.CreateSimulationJobRequest
import RoboMaker.CreateSimulationJobResponse
import RoboMaker.DeleteFleetRequest
import RoboMaker.DeleteFleetResponse
import RoboMaker.DeleteRobotRequest
import RoboMaker.DeleteRobotResponse
import RoboMaker.DeleteRobotApplicationRequest
import RoboMaker.DeleteRobotApplicationResponse
import RoboMaker.DeleteSimulationApplicationRequest
import RoboMaker.DeleteSimulationApplicationResponse
import RoboMaker.DeregisterRobotRequest
import RoboMaker.DeregisterRobotResponse
import RoboMaker.DescribeDeploymentJobRequest
import RoboMaker.DescribeDeploymentJobResponse
import RoboMaker.DescribeFleetRequest
import RoboMaker.DescribeFleetResponse
import RoboMaker.DescribeRobotRequest
import RoboMaker.DescribeRobotResponse
import RoboMaker.DescribeRobotApplicationRequest
import RoboMaker.DescribeRobotApplicationResponse
import RoboMaker.DescribeSimulationApplicationRequest
import RoboMaker.DescribeSimulationApplicationResponse
import RoboMaker.DescribeSimulationJobRequest
import RoboMaker.DescribeSimulationJobResponse
import RoboMaker.DescribeSimulationJobBatchRequest
import RoboMaker.DescribeSimulationJobBatchResponse
import RoboMaker.ListDeploymentJobsRequest
import RoboMaker.ListDeploymentJobsResponse
import RoboMaker.ListFleetsRequest
import RoboMaker.ListFleetsResponse
import RoboMaker.ListRobotApplicationsRequest
import RoboMaker.ListRobotApplicationsResponse
import RoboMaker.ListRobotsRequest
import RoboMaker.ListRobotsResponse
import RoboMaker.ListSimulationApplicationsRequest
import RoboMaker.ListSimulationApplicationsResponse
import RoboMaker.ListSimulationJobBatchesRequest
import RoboMaker.ListSimulationJobBatchesResponse
import RoboMaker.ListSimulationJobsRequest
import RoboMaker.ListSimulationJobsResponse
import RoboMaker.ListTagsForResourceRequest
import RoboMaker.ListTagsForResourceResponse
import RoboMaker.RegisterRobotRequest
import RoboMaker.RegisterRobotResponse
import RoboMaker.RestartSimulationJobRequest
import RoboMaker.RestartSimulationJobResponse
import RoboMaker.StartSimulationJobBatchRequest
import RoboMaker.StartSimulationJobBatchResponse
import RoboMaker.SyncDeploymentJobRequest
import RoboMaker.SyncDeploymentJobResponse
import RoboMaker.TagResourceRequest
import RoboMaker.TagResourceResponse
import RoboMaker.UntagResourceRequest
import RoboMaker.UntagResourceResponse
import RoboMaker.UpdateRobotApplicationRequest
import RoboMaker.UpdateRobotApplicationResponse
import RoboMaker.UpdateSimulationApplicationRequest
import RoboMaker.UpdateSimulationApplicationResponse
import RoboMaker.DeploymentConfig
import RoboMaker.TagMap
import RoboMaker.RobotSoftwareSuite
import RoboMaker.SimulationSoftwareSuite
import RoboMaker.RenderingEngine
import RoboMaker.OutputLocation
import RoboMaker.LoggingConfig
import RoboMaker.VPCConfig
import RoboMaker.VPCConfigResponse
import RoboMaker.DeploymentLaunchConfig
import RoboMaker.S3Object
import RoboMaker.EnvironmentVariableMap
import RoboMaker.BatchPolicy
import RoboMaker.NetworkInterface
import RoboMaker.PortForwardingConfig
import RoboMaker.LaunchConfig
import RoboMaker.ProgressDetail

typealias Arn = String

typealias Arns = Array<Arn>

typealias BatchTimeoutInSeconds = Number

typealias Boolean = Boolean

typealias BoxedBoolean = Boolean

typealias ClientRequestToken = String

typealias Command = String

typealias CreateSimulationJobRequests = Array<SimulationJobRequest>

typealias CreatedAt = Date

typealias DataSourceConfigs = Array<DataSourceConfig>

typealias DataSourceNames = Array<Name>

typealias DataSources = Array<DataSource>

typealias DeploymentApplicationConfigs = Array<DeploymentApplicationConfig>

typealias DeploymentJobs = Array<DeploymentJob>

typealias DeploymentTimeout = Number

typealias DeploymentVersion = String

typealias EnvironmentVariableKey = String

typealias EnvironmentVariableValue = String

typealias FailedAt = Date

typealias FailedCreateSimulationJobRequests = Array<FailedCreateSimulationJobRequest>

typealias FilterValues = Array<Name>

typealias Filters = Array<Filter>

typealias Fleets = Array<Fleet>

typealias GenericInteger = Number

typealias GenericString = String

typealias IamRole = String

typealias Id = String

typealias Integer = Number

typealias JobDuration = Number

typealias LastStartedAt = Date

typealias LastUpdatedAt = Date

typealias MaxConcurrency = Number

typealias MaxResults = Number

typealias Name = String

typealias NonEmptyString = String

typealias NonSystemPort = Number

typealias PaginationToken = String

typealias Path = String

typealias PercentDone = Number

typealias Percentage = Number

typealias Port = Number

typealias PortMappingList = Array<PortMapping>

typealias RenderingEngineVersionType = String

typealias RevisionId = String

typealias RobotApplicationConfigs = Array<RobotApplicationConfig>

typealias RobotApplicationNames = Array<Name>

typealias RobotApplicationSummaries = Array<RobotApplicationSummary>

typealias RobotDeploymentSummary = Array<RobotDeployment>

typealias Robots = Array<Robot>

typealias S3Bucket = String

typealias S3Etag = String

typealias S3Key = String

typealias S3KeyOutputs = Array<S3KeyOutput>

typealias S3Keys = Array<S3Key>

typealias SecurityGroups = Array<NonEmptyString>

typealias SimulationApplicationConfigs = Array<SimulationApplicationConfig>

typealias SimulationApplicationNames = Array<Name>

typealias SimulationApplicationSummaries = Array<SimulationApplicationSummary>

typealias SimulationJobBatchSummaries = Array<SimulationJobBatchSummary>

typealias SimulationJobSummaries = Array<SimulationJobSummary>

typealias SimulationJobs = Array<SimulationJob>

typealias SimulationSoftwareSuiteVersionType = String

typealias SimulationTimeMillis = Number

typealias SourceConfigs = Array<SourceConfig>

typealias Sources = Array<Source>

typealias Subnets = Array<NonEmptyString>

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagValue = String

typealias Version = String

typealias VersionQualifier = String

@JsModule("aws-sdk")
external open class RoboMaker(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & RoboMaker.Types.ClientConfiguration */
    open fun batchDescribeSimulationJob(params: BatchDescribeSimulationJobRequest, callback: (err: AWSError, data: BatchDescribeSimulationJobResponse) -> Unit = definedExternally): Request<BatchDescribeSimulationJobResponse, AWSError>
    open fun batchDescribeSimulationJob(callback: (err: AWSError, data: BatchDescribeSimulationJobResponse) -> Unit = definedExternally): Request<BatchDescribeSimulationJobResponse, AWSError>
    open fun cancelDeploymentJob(params: CancelDeploymentJobRequest, callback: (err: AWSError, data: CancelDeploymentJobResponse) -> Unit = definedExternally): Request<CancelDeploymentJobResponse, AWSError>
    open fun cancelDeploymentJob(callback: (err: AWSError, data: CancelDeploymentJobResponse) -> Unit = definedExternally): Request<CancelDeploymentJobResponse, AWSError>
    open fun cancelSimulationJob(params: CancelSimulationJobRequest, callback: (err: AWSError, data: CancelSimulationJobResponse) -> Unit = definedExternally): Request<CancelSimulationJobResponse, AWSError>
    open fun cancelSimulationJob(callback: (err: AWSError, data: CancelSimulationJobResponse) -> Unit = definedExternally): Request<CancelSimulationJobResponse, AWSError>
    open fun cancelSimulationJobBatch(params: CancelSimulationJobBatchRequest, callback: (err: AWSError, data: CancelSimulationJobBatchResponse) -> Unit = definedExternally): Request<CancelSimulationJobBatchResponse, AWSError>
    open fun cancelSimulationJobBatch(callback: (err: AWSError, data: CancelSimulationJobBatchResponse) -> Unit = definedExternally): Request<CancelSimulationJobBatchResponse, AWSError>
    open fun createDeploymentJob(params: CreateDeploymentJobRequest, callback: (err: AWSError, data: CreateDeploymentJobResponse) -> Unit = definedExternally): Request<CreateDeploymentJobResponse, AWSError>
    open fun createDeploymentJob(callback: (err: AWSError, data: CreateDeploymentJobResponse) -> Unit = definedExternally): Request<CreateDeploymentJobResponse, AWSError>
    open fun createFleet(params: CreateFleetRequest, callback: (err: AWSError, data: CreateFleetResponse) -> Unit = definedExternally): Request<CreateFleetResponse, AWSError>
    open fun createFleet(callback: (err: AWSError, data: CreateFleetResponse) -> Unit = definedExternally): Request<CreateFleetResponse, AWSError>
    open fun createRobot(params: CreateRobotRequest, callback: (err: AWSError, data: CreateRobotResponse) -> Unit = definedExternally): Request<CreateRobotResponse, AWSError>
    open fun createRobot(callback: (err: AWSError, data: CreateRobotResponse) -> Unit = definedExternally): Request<CreateRobotResponse, AWSError>
    open fun createRobotApplication(params: CreateRobotApplicationRequest, callback: (err: AWSError, data: CreateRobotApplicationResponse) -> Unit = definedExternally): Request<CreateRobotApplicationResponse, AWSError>
    open fun createRobotApplication(callback: (err: AWSError, data: CreateRobotApplicationResponse) -> Unit = definedExternally): Request<CreateRobotApplicationResponse, AWSError>
    open fun createRobotApplicationVersion(params: CreateRobotApplicationVersionRequest, callback: (err: AWSError, data: CreateRobotApplicationVersionResponse) -> Unit = definedExternally): Request<CreateRobotApplicationVersionResponse, AWSError>
    open fun createRobotApplicationVersion(callback: (err: AWSError, data: CreateRobotApplicationVersionResponse) -> Unit = definedExternally): Request<CreateRobotApplicationVersionResponse, AWSError>
    open fun createSimulationApplication(params: CreateSimulationApplicationRequest, callback: (err: AWSError, data: CreateSimulationApplicationResponse) -> Unit = definedExternally): Request<CreateSimulationApplicationResponse, AWSError>
    open fun createSimulationApplication(callback: (err: AWSError, data: CreateSimulationApplicationResponse) -> Unit = definedExternally): Request<CreateSimulationApplicationResponse, AWSError>
    open fun createSimulationApplicationVersion(params: CreateSimulationApplicationVersionRequest, callback: (err: AWSError, data: CreateSimulationApplicationVersionResponse) -> Unit = definedExternally): Request<CreateSimulationApplicationVersionResponse, AWSError>
    open fun createSimulationApplicationVersion(callback: (err: AWSError, data: CreateSimulationApplicationVersionResponse) -> Unit = definedExternally): Request<CreateSimulationApplicationVersionResponse, AWSError>
    open fun createSimulationJob(params: CreateSimulationJobRequest, callback: (err: AWSError, data: CreateSimulationJobResponse) -> Unit = definedExternally): Request<CreateSimulationJobResponse, AWSError>
    open fun createSimulationJob(callback: (err: AWSError, data: CreateSimulationJobResponse) -> Unit = definedExternally): Request<CreateSimulationJobResponse, AWSError>
    open fun deleteFleet(params: DeleteFleetRequest, callback: (err: AWSError, data: DeleteFleetResponse) -> Unit = definedExternally): Request<DeleteFleetResponse, AWSError>
    open fun deleteFleet(callback: (err: AWSError, data: DeleteFleetResponse) -> Unit = definedExternally): Request<DeleteFleetResponse, AWSError>
    open fun deleteRobot(params: DeleteRobotRequest, callback: (err: AWSError, data: DeleteRobotResponse) -> Unit = definedExternally): Request<DeleteRobotResponse, AWSError>
    open fun deleteRobot(callback: (err: AWSError, data: DeleteRobotResponse) -> Unit = definedExternally): Request<DeleteRobotResponse, AWSError>
    open fun deleteRobotApplication(params: DeleteRobotApplicationRequest, callback: (err: AWSError, data: DeleteRobotApplicationResponse) -> Unit = definedExternally): Request<DeleteRobotApplicationResponse, AWSError>
    open fun deleteRobotApplication(callback: (err: AWSError, data: DeleteRobotApplicationResponse) -> Unit = definedExternally): Request<DeleteRobotApplicationResponse, AWSError>
    open fun deleteSimulationApplication(params: DeleteSimulationApplicationRequest, callback: (err: AWSError, data: DeleteSimulationApplicationResponse) -> Unit = definedExternally): Request<DeleteSimulationApplicationResponse, AWSError>
    open fun deleteSimulationApplication(callback: (err: AWSError, data: DeleteSimulationApplicationResponse) -> Unit = definedExternally): Request<DeleteSimulationApplicationResponse, AWSError>
    open fun deregisterRobot(params: DeregisterRobotRequest, callback: (err: AWSError, data: DeregisterRobotResponse) -> Unit = definedExternally): Request<DeregisterRobotResponse, AWSError>
    open fun deregisterRobot(callback: (err: AWSError, data: DeregisterRobotResponse) -> Unit = definedExternally): Request<DeregisterRobotResponse, AWSError>
    open fun describeDeploymentJob(params: DescribeDeploymentJobRequest, callback: (err: AWSError, data: DescribeDeploymentJobResponse) -> Unit = definedExternally): Request<DescribeDeploymentJobResponse, AWSError>
    open fun describeDeploymentJob(callback: (err: AWSError, data: DescribeDeploymentJobResponse) -> Unit = definedExternally): Request<DescribeDeploymentJobResponse, AWSError>
    open fun describeFleet(params: DescribeFleetRequest, callback: (err: AWSError, data: DescribeFleetResponse) -> Unit = definedExternally): Request<DescribeFleetResponse, AWSError>
    open fun describeFleet(callback: (err: AWSError, data: DescribeFleetResponse) -> Unit = definedExternally): Request<DescribeFleetResponse, AWSError>
    open fun describeRobot(params: DescribeRobotRequest, callback: (err: AWSError, data: DescribeRobotResponse) -> Unit = definedExternally): Request<DescribeRobotResponse, AWSError>
    open fun describeRobot(callback: (err: AWSError, data: DescribeRobotResponse) -> Unit = definedExternally): Request<DescribeRobotResponse, AWSError>
    open fun describeRobotApplication(params: DescribeRobotApplicationRequest, callback: (err: AWSError, data: DescribeRobotApplicationResponse) -> Unit = definedExternally): Request<DescribeRobotApplicationResponse, AWSError>
    open fun describeRobotApplication(callback: (err: AWSError, data: DescribeRobotApplicationResponse) -> Unit = definedExternally): Request<DescribeRobotApplicationResponse, AWSError>
    open fun describeSimulationApplication(params: DescribeSimulationApplicationRequest, callback: (err: AWSError, data: DescribeSimulationApplicationResponse) -> Unit = definedExternally): Request<DescribeSimulationApplicationResponse, AWSError>
    open fun describeSimulationApplication(callback: (err: AWSError, data: DescribeSimulationApplicationResponse) -> Unit = definedExternally): Request<DescribeSimulationApplicationResponse, AWSError>
    open fun describeSimulationJob(params: DescribeSimulationJobRequest, callback: (err: AWSError, data: DescribeSimulationJobResponse) -> Unit = definedExternally): Request<DescribeSimulationJobResponse, AWSError>
    open fun describeSimulationJob(callback: (err: AWSError, data: DescribeSimulationJobResponse) -> Unit = definedExternally): Request<DescribeSimulationJobResponse, AWSError>
    open fun describeSimulationJobBatch(params: DescribeSimulationJobBatchRequest, callback: (err: AWSError, data: DescribeSimulationJobBatchResponse) -> Unit = definedExternally): Request<DescribeSimulationJobBatchResponse, AWSError>
    open fun describeSimulationJobBatch(callback: (err: AWSError, data: DescribeSimulationJobBatchResponse) -> Unit = definedExternally): Request<DescribeSimulationJobBatchResponse, AWSError>
    open fun listDeploymentJobs(params: ListDeploymentJobsRequest, callback: (err: AWSError, data: ListDeploymentJobsResponse) -> Unit = definedExternally): Request<ListDeploymentJobsResponse, AWSError>
    open fun listDeploymentJobs(callback: (err: AWSError, data: ListDeploymentJobsResponse) -> Unit = definedExternally): Request<ListDeploymentJobsResponse, AWSError>
    open fun listFleets(params: ListFleetsRequest, callback: (err: AWSError, data: ListFleetsResponse) -> Unit = definedExternally): Request<ListFleetsResponse, AWSError>
    open fun listFleets(callback: (err: AWSError, data: ListFleetsResponse) -> Unit = definedExternally): Request<ListFleetsResponse, AWSError>
    open fun listRobotApplications(params: ListRobotApplicationsRequest, callback: (err: AWSError, data: ListRobotApplicationsResponse) -> Unit = definedExternally): Request<ListRobotApplicationsResponse, AWSError>
    open fun listRobotApplications(callback: (err: AWSError, data: ListRobotApplicationsResponse) -> Unit = definedExternally): Request<ListRobotApplicationsResponse, AWSError>
    open fun listRobots(params: ListRobotsRequest, callback: (err: AWSError, data: ListRobotsResponse) -> Unit = definedExternally): Request<ListRobotsResponse, AWSError>
    open fun listRobots(callback: (err: AWSError, data: ListRobotsResponse) -> Unit = definedExternally): Request<ListRobotsResponse, AWSError>
    open fun listSimulationApplications(params: ListSimulationApplicationsRequest, callback: (err: AWSError, data: ListSimulationApplicationsResponse) -> Unit = definedExternally): Request<ListSimulationApplicationsResponse, AWSError>
    open fun listSimulationApplications(callback: (err: AWSError, data: ListSimulationApplicationsResponse) -> Unit = definedExternally): Request<ListSimulationApplicationsResponse, AWSError>
    open fun listSimulationJobBatches(params: ListSimulationJobBatchesRequest, callback: (err: AWSError, data: ListSimulationJobBatchesResponse) -> Unit = definedExternally): Request<ListSimulationJobBatchesResponse, AWSError>
    open fun listSimulationJobBatches(callback: (err: AWSError, data: ListSimulationJobBatchesResponse) -> Unit = definedExternally): Request<ListSimulationJobBatchesResponse, AWSError>
    open fun listSimulationJobs(params: ListSimulationJobsRequest, callback: (err: AWSError, data: ListSimulationJobsResponse) -> Unit = definedExternally): Request<ListSimulationJobsResponse, AWSError>
    open fun listSimulationJobs(callback: (err: AWSError, data: ListSimulationJobsResponse) -> Unit = definedExternally): Request<ListSimulationJobsResponse, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceRequest, callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceResponse) -> Unit = definedExternally): Request<ListTagsForResourceResponse, AWSError>
    open fun registerRobot(params: RegisterRobotRequest, callback: (err: AWSError, data: RegisterRobotResponse) -> Unit = definedExternally): Request<RegisterRobotResponse, AWSError>
    open fun registerRobot(callback: (err: AWSError, data: RegisterRobotResponse) -> Unit = definedExternally): Request<RegisterRobotResponse, AWSError>
    open fun restartSimulationJob(params: RestartSimulationJobRequest, callback: (err: AWSError, data: RestartSimulationJobResponse) -> Unit = definedExternally): Request<RestartSimulationJobResponse, AWSError>
    open fun restartSimulationJob(callback: (err: AWSError, data: RestartSimulationJobResponse) -> Unit = definedExternally): Request<RestartSimulationJobResponse, AWSError>
    open fun startSimulationJobBatch(params: StartSimulationJobBatchRequest, callback: (err: AWSError, data: StartSimulationJobBatchResponse) -> Unit = definedExternally): Request<StartSimulationJobBatchResponse, AWSError>
    open fun startSimulationJobBatch(callback: (err: AWSError, data: StartSimulationJobBatchResponse) -> Unit = definedExternally): Request<StartSimulationJobBatchResponse, AWSError>
    open fun syncDeploymentJob(params: SyncDeploymentJobRequest, callback: (err: AWSError, data: SyncDeploymentJobResponse) -> Unit = definedExternally): Request<SyncDeploymentJobResponse, AWSError>
    open fun syncDeploymentJob(callback: (err: AWSError, data: SyncDeploymentJobResponse) -> Unit = definedExternally): Request<SyncDeploymentJobResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateRobotApplication(params: UpdateRobotApplicationRequest, callback: (err: AWSError, data: UpdateRobotApplicationResponse) -> Unit = definedExternally): Request<UpdateRobotApplicationResponse, AWSError>
    open fun updateRobotApplication(callback: (err: AWSError, data: UpdateRobotApplicationResponse) -> Unit = definedExternally): Request<UpdateRobotApplicationResponse, AWSError>
    open fun updateSimulationApplication(params: UpdateSimulationApplicationRequest, callback: (err: AWSError, data: UpdateSimulationApplicationResponse) -> Unit = definedExternally): Request<UpdateSimulationApplicationResponse, AWSError>
    open fun updateSimulationApplication(callback: (err: AWSError, data: UpdateSimulationApplicationResponse) -> Unit = definedExternally): Request<UpdateSimulationApplicationResponse, AWSError>
    interface BatchDescribeSimulationJobRequest {
        var jobs: Arns
    }
    interface BatchDescribeSimulationJobResponse {
        var jobs: SimulationJobs?
            get() = definedExternally
            set(value) = definedExternally
        var unprocessedJobs: Arns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchPolicy {
        var timeoutInSeconds: BatchTimeoutInSeconds?
            get() = definedExternally
            set(value) = definedExternally
        var maxConcurrency: MaxConcurrency?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelDeploymentJobRequest {
        var job: Arn
    }
    interface CancelDeploymentJobResponse
    interface CancelSimulationJobBatchRequest {
        var batch: Arn
    }
    interface CancelSimulationJobBatchResponse
    interface CancelSimulationJobRequest {
        var job: Arn
    }
    interface CancelSimulationJobResponse
    interface CreateDeploymentJobRequest {
        var deploymentConfig: DeploymentConfig?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken
        var fleet: Arn
        var deploymentApplicationConfigs: DeploymentApplicationConfigs
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDeploymentJobResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var fleet: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "Preparing" | "InProgress" | "Failed" | "Succeeded" | "Canceled" | String */
        var deploymentApplicationConfigs: DeploymentApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var failureCode: String /* "ResourceNotFound" | "EnvironmentSetupError" | "EtagMismatch" | "FailureThresholdBreached" | "RobotDeploymentAborted" | "RobotDeploymentNoResponse" | "RobotAgentConnectionTimeout" | "GreengrassDeploymentFailed" | "InvalidGreengrassGroup" | "MissingRobotArchitecture" | "MissingRobotApplicationArchitecture" | "MissingRobotDeploymentResource" | "GreengrassGroupVersionDoesNotExist" | "LambdaDeleted" | "ExtractingBundleFailure" | "PreLaunchFileFailure" | "PostLaunchFileFailure" | "BadPermissionError" | "DownloadConditionFailed" | "InternalServerError" | String */
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentConfig: DeploymentConfig?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFleetRequest {
        var name: Name
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateFleetResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRobotApplicationRequest {
        var name: Name
        var sources: SourceConfigs
        var robotSoftwareSuite: RobotSoftwareSuite
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRobotApplicationResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var sources: Sources?
            get() = definedExternally
            set(value) = definedExternally
        var robotSoftwareSuite: RobotSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRobotApplicationVersionRequest {
        var application: Arn
        var currentRevisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRobotApplicationVersionResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var sources: Sources?
            get() = definedExternally
            set(value) = definedExternally
        var robotSoftwareSuite: RobotSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRobotRequest {
        var name: Name
        var architecture: String /* "X86_64" | "ARM64" | "ARMHF" | String */
        var greengrassGroupId: Id
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRobotResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var greengrassGroupId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var architecture: String /* "X86_64" | "ARM64" | "ARMHF" | String */
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSimulationApplicationRequest {
        var name: Name
        var sources: SourceConfigs
        var simulationSoftwareSuite: SimulationSoftwareSuite
        var robotSoftwareSuite: RobotSoftwareSuite
        var renderingEngine: RenderingEngine?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSimulationApplicationResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var sources: Sources?
            get() = definedExternally
            set(value) = definedExternally
        var simulationSoftwareSuite: SimulationSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var robotSoftwareSuite: RobotSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var renderingEngine: RenderingEngine?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSimulationApplicationVersionRequest {
        var application: Arn
        var currentRevisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSimulationApplicationVersionResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var sources: Sources?
            get() = definedExternally
            set(value) = definedExternally
        var simulationSoftwareSuite: SimulationSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var robotSoftwareSuite: RobotSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var renderingEngine: RenderingEngine?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSimulationJobRequest {
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var outputLocation: OutputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var loggingConfig: LoggingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var maxJobDurationInSeconds: JobDuration
        var iamRole: IamRole
        var failureBehavior: String /* "Fail" | "Continue" | String */
        var robotApplications: RobotApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var simulationApplications: SimulationApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var dataSources: DataSourceConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var vpcConfig: VPCConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSimulationJobResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "Preparing" | "Running" | "Restarting" | "Completed" | "Failed" | "RunningFailed" | "Terminating" | "Terminated" | "Canceled" | String */
        var lastStartedAt: LastStartedAt?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var failureBehavior: String /* "Fail" | "Continue" | String */
        var failureCode: String /* "InternalServiceError" | "RobotApplicationCrash" | "SimulationApplicationCrash" | "BadPermissionsRobotApplication" | "BadPermissionsSimulationApplication" | "BadPermissionsS3Object" | "BadPermissionsS3Output" | "BadPermissionsCloudwatchLogs" | "SubnetIpLimitExceeded" | "ENILimitExceeded" | "BadPermissionsUserCredentials" | "InvalidBundleRobotApplication" | "InvalidBundleSimulationApplication" | "InvalidS3Resource" | "LimitExceeded" | "MismatchedEtag" | "RobotApplicationVersionMismatchedEtag" | "SimulationApplicationVersionMismatchedEtag" | "ResourceNotFound" | "RequestThrottled" | "BatchTimedOut" | "BatchCanceled" | "InvalidInput" | "WrongRegionS3Bucket" | "WrongRegionS3Output" | "WrongRegionRobotApplication" | "WrongRegionSimulationApplication" | String */
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var outputLocation: OutputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var loggingConfig: LoggingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var maxJobDurationInSeconds: JobDuration?
            get() = definedExternally
            set(value) = definedExternally
        var simulationTimeMillis: SimulationTimeMillis?
            get() = definedExternally
            set(value) = definedExternally
        var iamRole: IamRole?
            get() = definedExternally
            set(value) = definedExternally
        var robotApplications: RobotApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var simulationApplications: SimulationApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var dataSources: DataSources?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var vpcConfig: VPCConfigResponse?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSource {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var s3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var s3Keys: S3KeyOutputs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSourceConfig {
        var name: Name
        var s3Bucket: S3Bucket
        var s3Keys: S3Keys
    }
    interface DeleteFleetRequest {
        var fleet: Arn
    }
    interface DeleteFleetResponse
    interface DeleteRobotApplicationRequest {
        var application: Arn
        var applicationVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteRobotApplicationResponse
    interface DeleteRobotRequest {
        var robot: Arn
    }
    interface DeleteRobotResponse
    interface DeleteSimulationApplicationRequest {
        var application: Arn
        var applicationVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteSimulationApplicationResponse
    interface DeploymentApplicationConfig {
        var application: Arn
        var applicationVersion: DeploymentVersion
        var launchConfig: DeploymentLaunchConfig
    }
    interface DeploymentConfig {
        var concurrentDeploymentPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var failureThresholdPercentage: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var robotDeploymentTimeoutInSeconds: DeploymentTimeout?
            get() = definedExternally
            set(value) = definedExternally
        var downloadConditionFile: S3Object?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentJob {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var fleet: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "Preparing" | "InProgress" | "Failed" | "Succeeded" | "Canceled" | String */
        var deploymentApplicationConfigs: DeploymentApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentConfig: DeploymentConfig?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var failureCode: String /* "ResourceNotFound" | "EnvironmentSetupError" | "EtagMismatch" | "FailureThresholdBreached" | "RobotDeploymentAborted" | "RobotDeploymentNoResponse" | "RobotAgentConnectionTimeout" | "GreengrassDeploymentFailed" | "InvalidGreengrassGroup" | "MissingRobotArchitecture" | "MissingRobotApplicationArchitecture" | "MissingRobotDeploymentResource" | "GreengrassGroupVersionDoesNotExist" | "LambdaDeleted" | "ExtractingBundleFailure" | "PreLaunchFileFailure" | "PostLaunchFileFailure" | "BadPermissionError" | "DownloadConditionFailed" | "InternalServerError" | String */
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeploymentLaunchConfig {
        var packageName: Command
        var preLaunchFile: Path?
            get() = definedExternally
            set(value) = definedExternally
        var launchFile: Command
        var postLaunchFile: Path?
            get() = definedExternally
            set(value) = definedExternally
        var environmentVariables: EnvironmentVariableMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterRobotRequest {
        var fleet: Arn
        var robot: Arn
    }
    interface DeregisterRobotResponse {
        var fleet: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var robot: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDeploymentJobRequest {
        var job: Arn
    }
    interface DescribeDeploymentJobResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var fleet: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "Preparing" | "InProgress" | "Failed" | "Succeeded" | "Canceled" | String */
        var deploymentConfig: DeploymentConfig?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentApplicationConfigs: DeploymentApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var failureCode: String /* "ResourceNotFound" | "EnvironmentSetupError" | "EtagMismatch" | "FailureThresholdBreached" | "RobotDeploymentAborted" | "RobotDeploymentNoResponse" | "RobotAgentConnectionTimeout" | "GreengrassDeploymentFailed" | "InvalidGreengrassGroup" | "MissingRobotArchitecture" | "MissingRobotApplicationArchitecture" | "MissingRobotDeploymentResource" | "GreengrassGroupVersionDoesNotExist" | "LambdaDeleted" | "ExtractingBundleFailure" | "PreLaunchFileFailure" | "PostLaunchFileFailure" | "BadPermissionError" | "DownloadConditionFailed" | "InternalServerError" | String */
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var robotDeploymentSummary: RobotDeploymentSummary?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFleetRequest {
        var fleet: Arn
    }
    interface DescribeFleetResponse {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var robots: Robots?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var lastDeploymentStatus: String /* "Pending" | "Preparing" | "InProgress" | "Failed" | "Succeeded" | "Canceled" | String */
        var lastDeploymentJob: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var lastDeploymentTime: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRobotApplicationRequest {
        var application: Arn
        var applicationVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRobotApplicationResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var sources: Sources?
            get() = definedExternally
            set(value) = definedExternally
        var robotSoftwareSuite: RobotSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeRobotRequest {
        var robot: Arn
    }
    interface DescribeRobotResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var fleetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Available" | "Registered" | "PendingNewDeployment" | "Deploying" | "Failed" | "InSync" | "NoResponse" | String */
        var greengrassGroupId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var architecture: String /* "X86_64" | "ARM64" | "ARMHF" | String */
        var lastDeploymentJob: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var lastDeploymentTime: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSimulationApplicationRequest {
        var application: Arn
        var applicationVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSimulationApplicationResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var sources: Sources?
            get() = definedExternally
            set(value) = definedExternally
        var simulationSoftwareSuite: SimulationSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var robotSoftwareSuite: RobotSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var renderingEngine: RenderingEngine?
            get() = definedExternally
            set(value) = definedExternally
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSimulationJobBatchRequest {
        var batch: Arn
    }
    interface DescribeSimulationJobBatchResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "InProgress" | "Failed" | "Completed" | "Canceled" | "Canceling" | "Completing" | "TimingOut" | "TimedOut" | String */
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var batchPolicy: BatchPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var failureCode: String /* "InternalServiceError" | String */
        var failureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var failedRequests: FailedCreateSimulationJobRequests?
            get() = definedExternally
            set(value) = definedExternally
        var pendingRequests: CreateSimulationJobRequests?
            get() = definedExternally
            set(value) = definedExternally
        var createdRequests: SimulationJobSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeSimulationJobRequest {
        var job: Arn
    }
    interface DescribeSimulationJobResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "Preparing" | "Running" | "Restarting" | "Completed" | "Failed" | "RunningFailed" | "Terminating" | "Terminated" | "Canceled" | String */
        var lastStartedAt: LastStartedAt?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var failureBehavior: String /* "Fail" | "Continue" | String */
        var failureCode: String /* "InternalServiceError" | "RobotApplicationCrash" | "SimulationApplicationCrash" | "BadPermissionsRobotApplication" | "BadPermissionsSimulationApplication" | "BadPermissionsS3Object" | "BadPermissionsS3Output" | "BadPermissionsCloudwatchLogs" | "SubnetIpLimitExceeded" | "ENILimitExceeded" | "BadPermissionsUserCredentials" | "InvalidBundleRobotApplication" | "InvalidBundleSimulationApplication" | "InvalidS3Resource" | "LimitExceeded" | "MismatchedEtag" | "RobotApplicationVersionMismatchedEtag" | "SimulationApplicationVersionMismatchedEtag" | "ResourceNotFound" | "RequestThrottled" | "BatchTimedOut" | "BatchCanceled" | "InvalidInput" | "WrongRegionS3Bucket" | "WrongRegionS3Output" | "WrongRegionRobotApplication" | "WrongRegionSimulationApplication" | String */
        var failureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var outputLocation: OutputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var loggingConfig: LoggingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var maxJobDurationInSeconds: JobDuration?
            get() = definedExternally
            set(value) = definedExternally
        var simulationTimeMillis: SimulationTimeMillis?
            get() = definedExternally
            set(value) = definedExternally
        var iamRole: IamRole?
            get() = definedExternally
            set(value) = definedExternally
        var robotApplications: RobotApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var simulationApplications: SimulationApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var dataSources: DataSources?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var vpcConfig: VPCConfigResponse?
            get() = definedExternally
            set(value) = definedExternally
        var networkInterface: NetworkInterface?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EnvironmentVariableMap {
        @nativeGetter
        operator fun get(key: String): EnvironmentVariableValue?
        @nativeSetter
        operator fun set(key: String, value: EnvironmentVariableValue)
    }
    interface FailedCreateSimulationJobRequest {
        var request: SimulationJobRequest?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var failureCode: String /* "InternalServiceError" | "RobotApplicationCrash" | "SimulationApplicationCrash" | "BadPermissionsRobotApplication" | "BadPermissionsSimulationApplication" | "BadPermissionsS3Object" | "BadPermissionsS3Output" | "BadPermissionsCloudwatchLogs" | "SubnetIpLimitExceeded" | "ENILimitExceeded" | "BadPermissionsUserCredentials" | "InvalidBundleRobotApplication" | "InvalidBundleSimulationApplication" | "InvalidS3Resource" | "LimitExceeded" | "MismatchedEtag" | "RobotApplicationVersionMismatchedEtag" | "SimulationApplicationVersionMismatchedEtag" | "ResourceNotFound" | "RequestThrottled" | "BatchTimedOut" | "BatchCanceled" | "InvalidInput" | "WrongRegionS3Bucket" | "WrongRegionS3Output" | "WrongRegionRobotApplication" | "WrongRegionSimulationApplication" | String */
        var failedAt: FailedAt?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filter {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var values: FilterValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Fleet {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var lastDeploymentStatus: String /* "Pending" | "Preparing" | "InProgress" | "Failed" | "Succeeded" | "Canceled" | String */
        var lastDeploymentJob: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var lastDeploymentTime: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchConfig {
        var packageName: Command
        var launchFile: Command
        var environmentVariables: EnvironmentVariableMap?
            get() = definedExternally
            set(value) = definedExternally
        var portForwardingConfig: PortForwardingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var streamUI: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentJobsRequest {
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDeploymentJobsResponse {
        var deploymentJobs: DeploymentJobs?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFleetsRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFleetsResponse {
        var fleetDetails: Fleets?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRobotApplicationsRequest {
        var versionQualifier: VersionQualifier?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRobotApplicationsResponse {
        var robotApplicationSummaries: RobotApplicationSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRobotsRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListRobotsResponse {
        var robots: Robots?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSimulationApplicationsRequest {
        var versionQualifier: VersionQualifier?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSimulationApplicationsResponse {
        var simulationApplicationSummaries: SimulationApplicationSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSimulationJobBatchesRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSimulationJobBatchesResponse {
        var simulationJobBatchSummaries: SimulationJobBatchSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSimulationJobsRequest {
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListSimulationJobsResponse {
        var simulationJobSummaries: SimulationJobSummaries
        var nextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceRequest {
        var resourceArn: Arn
    }
    interface ListTagsForResourceResponse {
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoggingConfig {
        var recordAllRosTopics: BoxedBoolean
    }
    interface NetworkInterface {
        var networkInterfaceId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var privateIpAddress: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var publicIpAddress: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputLocation {
        var s3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var s3Prefix: S3Key?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PortForwardingConfig {
        var portMappings: PortMappingList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PortMapping {
        var jobPort: Port
        var applicationPort: NonSystemPort
        var enableOnPublicIp: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ProgressDetail {
        var currentProgress: String /* "Validating" | "DownloadingExtracting" | "ExecutingDownloadCondition" | "ExecutingPreLaunch" | "Launching" | "ExecutingPostLaunch" | "Finished" | String */
        var percentDone: PercentDone?
            get() = definedExternally
            set(value) = definedExternally
        var estimatedTimeRemainingSeconds: GenericInteger?
            get() = definedExternally
            set(value) = definedExternally
        var targetResource: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterRobotRequest {
        var fleet: Arn
        var robot: Arn
    }
    interface RegisterRobotResponse {
        var fleet: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var robot: Arn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RenderingEngine {
        var name: String /* "OGRE" | String */
        var version: RenderingEngineVersionType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RestartSimulationJobRequest {
        var job: Arn
    }
    interface RestartSimulationJobResponse
    interface Robot {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var fleetArn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Available" | "Registered" | "PendingNewDeployment" | "Deploying" | "Failed" | "InSync" | "NoResponse" | String */
        var greenGrassGroupId: Id?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var architecture: String /* "X86_64" | "ARM64" | "ARMHF" | String */
        var lastDeploymentJob: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var lastDeploymentTime: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RobotApplicationConfig {
        var application: Arn
        var applicationVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var launchConfig: LaunchConfig
    }
    interface RobotApplicationSummary {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var robotSoftwareSuite: RobotSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RobotDeployment {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentStartTime: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentFinishTime: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Available" | "Registered" | "PendingNewDeployment" | "Deploying" | "Failed" | "InSync" | "NoResponse" | String */
        var progressDetail: ProgressDetail?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var failureCode: String /* "ResourceNotFound" | "EnvironmentSetupError" | "EtagMismatch" | "FailureThresholdBreached" | "RobotDeploymentAborted" | "RobotDeploymentNoResponse" | "RobotAgentConnectionTimeout" | "GreengrassDeploymentFailed" | "InvalidGreengrassGroup" | "MissingRobotArchitecture" | "MissingRobotApplicationArchitecture" | "MissingRobotDeploymentResource" | "GreengrassGroupVersionDoesNotExist" | "LambdaDeleted" | "ExtractingBundleFailure" | "PreLaunchFileFailure" | "PostLaunchFileFailure" | "BadPermissionError" | "DownloadConditionFailed" | "InternalServerError" | String */
    }
    interface RobotSoftwareSuite {
        var name: String /* "ROS" | "ROS2" | String */
        var version: String /* "Kinetic" | "Melodic" | "Dashing" | String */
    }
    interface S3KeyOutput {
        var s3Key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
        var etag: S3Etag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Object {
        var bucket: S3Bucket
        var key: S3Key
        var etag: S3Etag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimulationApplicationConfig {
        var application: Arn
        var applicationVersion: Version?
            get() = definedExternally
            set(value) = definedExternally
        var launchConfig: LaunchConfig
    }
    interface SimulationApplicationSummary {
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var robotSoftwareSuite: RobotSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var simulationSoftwareSuite: SimulationSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimulationJob {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "Preparing" | "Running" | "Restarting" | "Completed" | "Failed" | "RunningFailed" | "Terminating" | "Terminated" | "Canceled" | String */
        var lastStartedAt: LastStartedAt?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var failureBehavior: String /* "Fail" | "Continue" | String */
        var failureCode: String /* "InternalServiceError" | "RobotApplicationCrash" | "SimulationApplicationCrash" | "BadPermissionsRobotApplication" | "BadPermissionsSimulationApplication" | "BadPermissionsS3Object" | "BadPermissionsS3Output" | "BadPermissionsCloudwatchLogs" | "SubnetIpLimitExceeded" | "ENILimitExceeded" | "BadPermissionsUserCredentials" | "InvalidBundleRobotApplication" | "InvalidBundleSimulationApplication" | "InvalidS3Resource" | "LimitExceeded" | "MismatchedEtag" | "RobotApplicationVersionMismatchedEtag" | "SimulationApplicationVersionMismatchedEtag" | "ResourceNotFound" | "RequestThrottled" | "BatchTimedOut" | "BatchCanceled" | "InvalidInput" | "WrongRegionS3Bucket" | "WrongRegionS3Output" | "WrongRegionRobotApplication" | "WrongRegionSimulationApplication" | String */
        var failureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var outputLocation: OutputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var loggingConfig: LoggingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var maxJobDurationInSeconds: JobDuration?
            get() = definedExternally
            set(value) = definedExternally
        var simulationTimeMillis: SimulationTimeMillis?
            get() = definedExternally
            set(value) = definedExternally
        var iamRole: IamRole?
            get() = definedExternally
            set(value) = definedExternally
        var robotApplications: RobotApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var simulationApplications: SimulationApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var dataSources: DataSources?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
        var vpcConfig: VPCConfigResponse?
            get() = definedExternally
            set(value) = definedExternally
        var networkInterface: NetworkInterface?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimulationJobBatchSummary {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "InProgress" | "Failed" | "Completed" | "Canceled" | "Canceling" | "Completing" | "TimingOut" | "TimedOut" | String */
        var failedRequestCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var pendingRequestCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var createdRequestCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimulationJobRequest {
        var outputLocation: OutputLocation?
            get() = definedExternally
            set(value) = definedExternally
        var loggingConfig: LoggingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var maxJobDurationInSeconds: JobDuration
        var iamRole: IamRole?
            get() = definedExternally
            set(value) = definedExternally
        var failureBehavior: String /* "Fail" | "Continue" | String */
        var useDefaultApplications: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var robotApplications: RobotApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var simulationApplications: SimulationApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var dataSources: DataSourceConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var vpcConfig: VPCConfig?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimulationJobSummary {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "Preparing" | "Running" | "Restarting" | "Completed" | "Failed" | "RunningFailed" | "Terminating" | "Terminated" | "Canceled" | String */
        var simulationApplicationNames: SimulationApplicationNames?
            get() = definedExternally
            set(value) = definedExternally
        var robotApplicationNames: RobotApplicationNames?
            get() = definedExternally
            set(value) = definedExternally
        var dataSourceNames: DataSourceNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SimulationSoftwareSuite {
        var name: String /* "Gazebo" | "RosbagPlay" | String */
        var version: SimulationSoftwareSuiteVersionType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Source {
        var s3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var s3Key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
        var etag: S3Etag?
            get() = definedExternally
            set(value) = definedExternally
        var architecture: String /* "X86_64" | "ARM64" | "ARMHF" | String */
    }
    interface SourceConfig {
        var s3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var s3Key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
        var architecture: String /* "X86_64" | "ARM64" | "ARMHF" | String */
    }
    interface StartSimulationJobBatchRequest {
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var batchPolicy: BatchPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var createSimulationJobRequests: CreateSimulationJobRequests
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartSimulationJobBatchResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "InProgress" | "Failed" | "Completed" | "Canceled" | "Canceling" | "Completing" | "TimingOut" | "TimedOut" | String */
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var batchPolicy: BatchPolicy?
            get() = definedExternally
            set(value) = definedExternally
        var failureCode: String /* "InternalServiceError" | String */
        var failureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var failedRequests: FailedCreateSimulationJobRequests?
            get() = definedExternally
            set(value) = definedExternally
        var pendingRequests: CreateSimulationJobRequests?
            get() = definedExternally
            set(value) = definedExternally
        var createdRequests: SimulationJobSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SyncDeploymentJobRequest {
        var clientRequestToken: ClientRequestToken
        var fleet: Arn
    }
    interface SyncDeploymentJobResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var fleet: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "Pending" | "Preparing" | "InProgress" | "Failed" | "Succeeded" | "Canceled" | String */
        var deploymentConfig: DeploymentConfig?
            get() = definedExternally
            set(value) = definedExternally
        var deploymentApplicationConfigs: DeploymentApplicationConfigs?
            get() = definedExternally
            set(value) = definedExternally
        var failureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var failureCode: String /* "ResourceNotFound" | "EnvironmentSetupError" | "EtagMismatch" | "FailureThresholdBreached" | "RobotDeploymentAborted" | "RobotDeploymentNoResponse" | "RobotAgentConnectionTimeout" | "GreengrassDeploymentFailed" | "InvalidGreengrassGroup" | "MissingRobotArchitecture" | "MissingRobotApplicationArchitecture" | "MissingRobotDeploymentResource" | "GreengrassGroupVersionDoesNotExist" | "LambdaDeleted" | "ExtractingBundleFailure" | "PreLaunchFileFailure" | "PostLaunchFileFailure" | "BadPermissionError" | "DownloadConditionFailed" | "InternalServerError" | String */
        var createdAt: CreatedAt?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TagResourceRequest {
        var resourceArn: Arn
        var tags: TagMap
    }
    interface TagResourceResponse
    interface UntagResourceRequest {
        var resourceArn: Arn
        var tagKeys: TagKeyList
    }
    interface UntagResourceResponse
    interface UpdateRobotApplicationRequest {
        var application: Arn
        var sources: SourceConfigs
        var robotSoftwareSuite: RobotSoftwareSuite
        var currentRevisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateRobotApplicationResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var sources: Sources?
            get() = definedExternally
            set(value) = definedExternally
        var robotSoftwareSuite: RobotSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSimulationApplicationRequest {
        var application: Arn
        var sources: SourceConfigs
        var simulationSoftwareSuite: SimulationSoftwareSuite
        var robotSoftwareSuite: RobotSoftwareSuite
        var renderingEngine: RenderingEngine?
            get() = definedExternally
            set(value) = definedExternally
        var currentRevisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateSimulationApplicationResponse {
        var arn: Arn?
            get() = definedExternally
            set(value) = definedExternally
        var name: Name?
            get() = definedExternally
            set(value) = definedExternally
        var version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var sources: Sources?
            get() = definedExternally
            set(value) = definedExternally
        var simulationSoftwareSuite: SimulationSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var robotSoftwareSuite: RobotSoftwareSuite?
            get() = definedExternally
            set(value) = definedExternally
        var renderingEngine: RenderingEngine?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedAt: LastUpdatedAt?
            get() = definedExternally
            set(value) = definedExternally
        var revisionId: RevisionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VPCConfig {
        var subnets: Subnets
        var securityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var assignPublicIp: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VPCConfigResponse {
        var subnets: Subnets?
            get() = definedExternally
            set(value) = definedExternally
        var securityGroups: SecurityGroups?
            get() = definedExternally
            set(value) = definedExternally
        var vpcId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var assignPublicIp: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-06-29" | "latest" | String */
    }
}