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
import SMS.AppSummary
import SMS.Connector
import SMS.ReplicationJob
import SMS.ReplicationRun
import SMS.ServerGroupLaunchConfiguration
import SMS.ServerGroupReplicationConfiguration
import SMS.ServerGroup
import SMS.ServerLaunchConfiguration
import SMS.Server
import SMS.ServerReplicationConfiguration
import SMS.Tag
import SMS.VmServerAddress
import SMS.CreateAppRequest
import SMS.CreateAppResponse
import SMS.CreateReplicationJobRequest
import SMS.CreateReplicationJobResponse
import SMS.DeleteAppRequest
import SMS.DeleteAppResponse
import SMS.DeleteAppLaunchConfigurationRequest
import SMS.DeleteAppLaunchConfigurationResponse
import SMS.DeleteAppReplicationConfigurationRequest
import SMS.DeleteAppReplicationConfigurationResponse
import SMS.DeleteReplicationJobRequest
import SMS.DeleteReplicationJobResponse
import SMS.DeleteServerCatalogRequest
import SMS.DeleteServerCatalogResponse
import SMS.DisassociateConnectorRequest
import SMS.DisassociateConnectorResponse
import SMS.GenerateChangeSetRequest
import SMS.GenerateChangeSetResponse
import SMS.GenerateTemplateRequest
import SMS.GenerateTemplateResponse
import SMS.GetAppRequest
import SMS.GetAppResponse
import SMS.GetAppLaunchConfigurationRequest
import SMS.GetAppLaunchConfigurationResponse
import SMS.GetAppReplicationConfigurationRequest
import SMS.GetAppReplicationConfigurationResponse
import SMS.GetConnectorsRequest
import SMS.GetConnectorsResponse
import SMS.GetReplicationJobsRequest
import SMS.GetReplicationJobsResponse
import SMS.GetReplicationRunsRequest
import SMS.GetReplicationRunsResponse
import SMS.GetServersRequest
import SMS.GetServersResponse
import SMS.ImportServerCatalogRequest
import SMS.ImportServerCatalogResponse
import SMS.LaunchAppRequest
import SMS.LaunchAppResponse
import SMS.ListAppsRequest
import SMS.ListAppsResponse
import SMS.PutAppLaunchConfigurationRequest
import SMS.PutAppLaunchConfigurationResponse
import SMS.PutAppReplicationConfigurationRequest
import SMS.PutAppReplicationConfigurationResponse
import SMS.StartAppReplicationRequest
import SMS.StartAppReplicationResponse
import SMS.StartOnDemandReplicationRunRequest
import SMS.StartOnDemandReplicationRunResponse
import SMS.StopAppReplicationRequest
import SMS.StopAppReplicationResponse
import SMS.TerminateAppRequest
import SMS.TerminateAppResponse
import SMS.UpdateAppRequest
import SMS.UpdateAppResponse
import SMS.UpdateReplicationJobRequest
import SMS.UpdateReplicationJobResponse
import SMS.LaunchDetails
import SMS.S3Location
import SMS.VmServer
import SMS.ReplicationRunStageDetails
import SMS.UserData
import SMS.ServerReplicationParameters

typealias AmiId = String

typealias AppDescription = String

typealias AppId = String

typealias AppIds = Array<AppId>

typealias AppLaunchStatusMessage = String

typealias AppName = String

typealias AppReplicationStatusMessage = String

typealias AppStatusMessage = String

typealias Apps = Array<AppSummary>

typealias AssociatePublicIpAddress = Boolean

typealias BucketName = String

typealias ClientToken = String

typealias ConnectorCapabilityList = Array<String /* "VSPHERE" | "SCVMM" | "HYPERV-MANAGER" | "SNAPSHOT_BATCHING" | String */>

typealias ConnectorId = String

typealias ConnectorList = Array<Connector>

typealias ConnectorVersion = String

typealias Description = String

typealias EC2KeyName = String

typealias Encrypted = Boolean

typealias ForceStopAppReplication = Boolean

typealias ForceTerminateApp = Boolean

typealias Frequency = Number

typealias InstanceType = String

typealias IpAddress = String

typealias KeyName = String

typealias KmsKeyId = String

typealias LaunchOrder = Number

typealias LogicalId = String

typealias MacAddress = String

typealias MaxResults = Number

typealias NextToken = String

typealias NumberOfRecentAmisToKeep = Number

typealias ReplicationJobId = String

typealias ReplicationJobList = Array<ReplicationJob>

typealias ReplicationJobStatusMessage = String

typealias ReplicationJobTerminated = Boolean

typealias ReplicationRunId = String

typealias ReplicationRunList = Array<ReplicationRun>

typealias ReplicationRunStage = String

typealias ReplicationRunStageProgress = String

typealias ReplicationRunStatusMessage = String

typealias RoleName = String

typealias RunOnce = Boolean

typealias SecurityGroup = String

typealias ServerGroupId = String

typealias ServerGroupLaunchConfigurations = Array<ServerGroupLaunchConfiguration>

typealias ServerGroupName = String

typealias ServerGroupReplicationConfigurations = Array<ServerGroupReplicationConfiguration>

typealias ServerGroups = Array<ServerGroup>

typealias ServerId = String

typealias ServerLaunchConfigurations = Array<ServerLaunchConfiguration>

typealias ServerList = Array<Server>

typealias ServerReplicationConfigurations = Array<ServerReplicationConfiguration>

typealias StackId = String

typealias StackName = String

typealias Subnet = String

typealias TagKey = String

typealias TagValue = String

typealias Tags = Array<Tag>

typealias Timestamp = Date

typealias TotalServerGroups = Number

typealias TotalServers = Number

typealias VPC = String

typealias VmId = String

typealias VmManagerId = String

typealias VmManagerName = String

typealias VmName = String

typealias VmPath = String

typealias VmServerAddressList = Array<VmServerAddress>

@JsModule("aws-sdk")
external open class SMS(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & SMS.Types.ClientConfiguration */
    open fun createApp(params: CreateAppRequest, callback: (err: AWSError, data: CreateAppResponse) -> Unit = definedExternally): Request<CreateAppResponse, AWSError>
    open fun createApp(callback: (err: AWSError, data: CreateAppResponse) -> Unit = definedExternally): Request<CreateAppResponse, AWSError>
    open fun createReplicationJob(params: CreateReplicationJobRequest, callback: (err: AWSError, data: CreateReplicationJobResponse) -> Unit = definedExternally): Request<CreateReplicationJobResponse, AWSError>
    open fun createReplicationJob(callback: (err: AWSError, data: CreateReplicationJobResponse) -> Unit = definedExternally): Request<CreateReplicationJobResponse, AWSError>
    open fun deleteApp(params: DeleteAppRequest, callback: (err: AWSError, data: DeleteAppResponse) -> Unit = definedExternally): Request<DeleteAppResponse, AWSError>
    open fun deleteApp(callback: (err: AWSError, data: DeleteAppResponse) -> Unit = definedExternally): Request<DeleteAppResponse, AWSError>
    open fun deleteAppLaunchConfiguration(params: DeleteAppLaunchConfigurationRequest, callback: (err: AWSError, data: DeleteAppLaunchConfigurationResponse) -> Unit = definedExternally): Request<DeleteAppLaunchConfigurationResponse, AWSError>
    open fun deleteAppLaunchConfiguration(callback: (err: AWSError, data: DeleteAppLaunchConfigurationResponse) -> Unit = definedExternally): Request<DeleteAppLaunchConfigurationResponse, AWSError>
    open fun deleteAppReplicationConfiguration(params: DeleteAppReplicationConfigurationRequest, callback: (err: AWSError, data: DeleteAppReplicationConfigurationResponse) -> Unit = definedExternally): Request<DeleteAppReplicationConfigurationResponse, AWSError>
    open fun deleteAppReplicationConfiguration(callback: (err: AWSError, data: DeleteAppReplicationConfigurationResponse) -> Unit = definedExternally): Request<DeleteAppReplicationConfigurationResponse, AWSError>
    open fun deleteReplicationJob(params: DeleteReplicationJobRequest, callback: (err: AWSError, data: DeleteReplicationJobResponse) -> Unit = definedExternally): Request<DeleteReplicationJobResponse, AWSError>
    open fun deleteReplicationJob(callback: (err: AWSError, data: DeleteReplicationJobResponse) -> Unit = definedExternally): Request<DeleteReplicationJobResponse, AWSError>
    open fun deleteServerCatalog(params: DeleteServerCatalogRequest, callback: (err: AWSError, data: DeleteServerCatalogResponse) -> Unit = definedExternally): Request<DeleteServerCatalogResponse, AWSError>
    open fun deleteServerCatalog(callback: (err: AWSError, data: DeleteServerCatalogResponse) -> Unit = definedExternally): Request<DeleteServerCatalogResponse, AWSError>
    open fun disassociateConnector(params: DisassociateConnectorRequest, callback: (err: AWSError, data: DisassociateConnectorResponse) -> Unit = definedExternally): Request<DisassociateConnectorResponse, AWSError>
    open fun disassociateConnector(callback: (err: AWSError, data: DisassociateConnectorResponse) -> Unit = definedExternally): Request<DisassociateConnectorResponse, AWSError>
    open fun generateChangeSet(params: GenerateChangeSetRequest, callback: (err: AWSError, data: GenerateChangeSetResponse) -> Unit = definedExternally): Request<GenerateChangeSetResponse, AWSError>
    open fun generateChangeSet(callback: (err: AWSError, data: GenerateChangeSetResponse) -> Unit = definedExternally): Request<GenerateChangeSetResponse, AWSError>
    open fun generateTemplate(params: GenerateTemplateRequest, callback: (err: AWSError, data: GenerateTemplateResponse) -> Unit = definedExternally): Request<GenerateTemplateResponse, AWSError>
    open fun generateTemplate(callback: (err: AWSError, data: GenerateTemplateResponse) -> Unit = definedExternally): Request<GenerateTemplateResponse, AWSError>
    open fun getApp(params: GetAppRequest, callback: (err: AWSError, data: GetAppResponse) -> Unit = definedExternally): Request<GetAppResponse, AWSError>
    open fun getApp(callback: (err: AWSError, data: GetAppResponse) -> Unit = definedExternally): Request<GetAppResponse, AWSError>
    open fun getAppLaunchConfiguration(params: GetAppLaunchConfigurationRequest, callback: (err: AWSError, data: GetAppLaunchConfigurationResponse) -> Unit = definedExternally): Request<GetAppLaunchConfigurationResponse, AWSError>
    open fun getAppLaunchConfiguration(callback: (err: AWSError, data: GetAppLaunchConfigurationResponse) -> Unit = definedExternally): Request<GetAppLaunchConfigurationResponse, AWSError>
    open fun getAppReplicationConfiguration(params: GetAppReplicationConfigurationRequest, callback: (err: AWSError, data: GetAppReplicationConfigurationResponse) -> Unit = definedExternally): Request<GetAppReplicationConfigurationResponse, AWSError>
    open fun getAppReplicationConfiguration(callback: (err: AWSError, data: GetAppReplicationConfigurationResponse) -> Unit = definedExternally): Request<GetAppReplicationConfigurationResponse, AWSError>
    open fun getConnectors(params: GetConnectorsRequest, callback: (err: AWSError, data: GetConnectorsResponse) -> Unit = definedExternally): Request<GetConnectorsResponse, AWSError>
    open fun getConnectors(callback: (err: AWSError, data: GetConnectorsResponse) -> Unit = definedExternally): Request<GetConnectorsResponse, AWSError>
    open fun getReplicationJobs(params: GetReplicationJobsRequest, callback: (err: AWSError, data: GetReplicationJobsResponse) -> Unit = definedExternally): Request<GetReplicationJobsResponse, AWSError>
    open fun getReplicationJobs(callback: (err: AWSError, data: GetReplicationJobsResponse) -> Unit = definedExternally): Request<GetReplicationJobsResponse, AWSError>
    open fun getReplicationRuns(params: GetReplicationRunsRequest, callback: (err: AWSError, data: GetReplicationRunsResponse) -> Unit = definedExternally): Request<GetReplicationRunsResponse, AWSError>
    open fun getReplicationRuns(callback: (err: AWSError, data: GetReplicationRunsResponse) -> Unit = definedExternally): Request<GetReplicationRunsResponse, AWSError>
    open fun getServers(params: GetServersRequest, callback: (err: AWSError, data: GetServersResponse) -> Unit = definedExternally): Request<GetServersResponse, AWSError>
    open fun getServers(callback: (err: AWSError, data: GetServersResponse) -> Unit = definedExternally): Request<GetServersResponse, AWSError>
    open fun importServerCatalog(params: ImportServerCatalogRequest, callback: (err: AWSError, data: ImportServerCatalogResponse) -> Unit = definedExternally): Request<ImportServerCatalogResponse, AWSError>
    open fun importServerCatalog(callback: (err: AWSError, data: ImportServerCatalogResponse) -> Unit = definedExternally): Request<ImportServerCatalogResponse, AWSError>
    open fun launchApp(params: LaunchAppRequest, callback: (err: AWSError, data: LaunchAppResponse) -> Unit = definedExternally): Request<LaunchAppResponse, AWSError>
    open fun launchApp(callback: (err: AWSError, data: LaunchAppResponse) -> Unit = definedExternally): Request<LaunchAppResponse, AWSError>
    open fun listApps(params: ListAppsRequest, callback: (err: AWSError, data: ListAppsResponse) -> Unit = definedExternally): Request<ListAppsResponse, AWSError>
    open fun listApps(callback: (err: AWSError, data: ListAppsResponse) -> Unit = definedExternally): Request<ListAppsResponse, AWSError>
    open fun putAppLaunchConfiguration(params: PutAppLaunchConfigurationRequest, callback: (err: AWSError, data: PutAppLaunchConfigurationResponse) -> Unit = definedExternally): Request<PutAppLaunchConfigurationResponse, AWSError>
    open fun putAppLaunchConfiguration(callback: (err: AWSError, data: PutAppLaunchConfigurationResponse) -> Unit = definedExternally): Request<PutAppLaunchConfigurationResponse, AWSError>
    open fun putAppReplicationConfiguration(params: PutAppReplicationConfigurationRequest, callback: (err: AWSError, data: PutAppReplicationConfigurationResponse) -> Unit = definedExternally): Request<PutAppReplicationConfigurationResponse, AWSError>
    open fun putAppReplicationConfiguration(callback: (err: AWSError, data: PutAppReplicationConfigurationResponse) -> Unit = definedExternally): Request<PutAppReplicationConfigurationResponse, AWSError>
    open fun startAppReplication(params: StartAppReplicationRequest, callback: (err: AWSError, data: StartAppReplicationResponse) -> Unit = definedExternally): Request<StartAppReplicationResponse, AWSError>
    open fun startAppReplication(callback: (err: AWSError, data: StartAppReplicationResponse) -> Unit = definedExternally): Request<StartAppReplicationResponse, AWSError>
    open fun startOnDemandReplicationRun(params: StartOnDemandReplicationRunRequest, callback: (err: AWSError, data: StartOnDemandReplicationRunResponse) -> Unit = definedExternally): Request<StartOnDemandReplicationRunResponse, AWSError>
    open fun startOnDemandReplicationRun(callback: (err: AWSError, data: StartOnDemandReplicationRunResponse) -> Unit = definedExternally): Request<StartOnDemandReplicationRunResponse, AWSError>
    open fun stopAppReplication(params: StopAppReplicationRequest, callback: (err: AWSError, data: StopAppReplicationResponse) -> Unit = definedExternally): Request<StopAppReplicationResponse, AWSError>
    open fun stopAppReplication(callback: (err: AWSError, data: StopAppReplicationResponse) -> Unit = definedExternally): Request<StopAppReplicationResponse, AWSError>
    open fun terminateApp(params: TerminateAppRequest, callback: (err: AWSError, data: TerminateAppResponse) -> Unit = definedExternally): Request<TerminateAppResponse, AWSError>
    open fun terminateApp(callback: (err: AWSError, data: TerminateAppResponse) -> Unit = definedExternally): Request<TerminateAppResponse, AWSError>
    open fun updateApp(params: UpdateAppRequest, callback: (err: AWSError, data: UpdateAppResponse) -> Unit = definedExternally): Request<UpdateAppResponse, AWSError>
    open fun updateApp(callback: (err: AWSError, data: UpdateAppResponse) -> Unit = definedExternally): Request<UpdateAppResponse, AWSError>
    open fun updateReplicationJob(params: UpdateReplicationJobRequest, callback: (err: AWSError, data: UpdateReplicationJobResponse) -> Unit = definedExternally): Request<UpdateReplicationJobResponse, AWSError>
    open fun updateReplicationJob(callback: (err: AWSError, data: UpdateReplicationJobResponse) -> Unit = definedExternally): Request<UpdateReplicationJobResponse, AWSError>
    interface AppSummary {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
        var name: AppName?
            get() = definedExternally
            set(value) = definedExternally
        var description: AppDescription?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "CREATING" | "ACTIVE" | "UPDATING" | "DELETING" | "DELETED" | "DELETE_FAILED" | String */
        var statusMessage: AppStatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var replicationStatus: String /* "READY_FOR_CONFIGURATION" | "CONFIGURATION_IN_PROGRESS" | "CONFIGURATION_INVALID" | "READY_FOR_REPLICATION" | "VALIDATION_IN_PROGRESS" | "REPLICATION_PENDING" | "REPLICATION_IN_PROGRESS" | "REPLICATED" | "DELTA_REPLICATION_IN_PROGRESS" | "DELTA_REPLICATED" | "DELTA_REPLICATION_FAILED" | "REPLICATION_FAILED" | "REPLICATION_STOPPING" | "REPLICATION_STOP_FAILED" | "REPLICATION_STOPPED" | String */
        var replicationStatusMessage: AppReplicationStatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var latestReplicationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var launchStatus: String /* "READY_FOR_CONFIGURATION" | "CONFIGURATION_IN_PROGRESS" | "CONFIGURATION_INVALID" | "READY_FOR_LAUNCH" | "VALIDATION_IN_PROGRESS" | "LAUNCH_PENDING" | "LAUNCH_IN_PROGRESS" | "LAUNCHED" | "DELTA_LAUNCH_IN_PROGRESS" | "DELTA_LAUNCH_FAILED" | "LAUNCH_FAILED" | "TERMINATE_IN_PROGRESS" | "TERMINATE_FAILED" | "TERMINATED" | String */
        var launchStatusMessage: AppLaunchStatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var launchDetails: LaunchDetails?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastModified: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var roleName: RoleName?
            get() = definedExternally
            set(value) = definedExternally
        var totalServerGroups: TotalServerGroups?
            get() = definedExternally
            set(value) = definedExternally
        var totalServers: TotalServers?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Connector {
        var connectorId: ConnectorId?
            get() = definedExternally
            set(value) = definedExternally
        var version: ConnectorVersion?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "HEALTHY" | "UNHEALTHY" | String */
        var capabilityList: ConnectorCapabilityList?
            get() = definedExternally
            set(value) = definedExternally
        var vmManagerName: VmManagerName?
            get() = definedExternally
            set(value) = definedExternally
        var vmManagerType: String /* "VSPHERE" | "SCVMM" | "HYPERV-MANAGER" | String */
        var vmManagerId: VmManagerId?
            get() = definedExternally
            set(value) = definedExternally
        var ipAddress: IpAddress?
            get() = definedExternally
            set(value) = definedExternally
        var macAddress: MacAddress?
            get() = definedExternally
            set(value) = definedExternally
        var associatedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAppRequest {
        var name: AppName?
            get() = definedExternally
            set(value) = definedExternally
        var description: AppDescription?
            get() = definedExternally
            set(value) = definedExternally
        var roleName: RoleName?
            get() = definedExternally
            set(value) = definedExternally
        var clientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var serverGroups: ServerGroups?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateAppResponse {
        var appSummary: AppSummary?
            get() = definedExternally
            set(value) = definedExternally
        var serverGroups: ServerGroups?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicationJobRequest {
        var serverId: ServerId
        var seedReplicationTime: Timestamp
        var frequency: Frequency?
            get() = definedExternally
            set(value) = definedExternally
        var runOnce: RunOnce?
            get() = definedExternally
            set(value) = definedExternally
        var licenseType: String /* "AWS" | "BYOL" | String */
        var roleName: RoleName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfRecentAmisToKeep: NumberOfRecentAmisToKeep?
            get() = definedExternally
            set(value) = definedExternally
        var encrypted: Encrypted?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateReplicationJobResponse {
        var replicationJobId: ReplicationJobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAppLaunchConfigurationRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAppLaunchConfigurationResponse
    interface DeleteAppReplicationConfigurationRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAppReplicationConfigurationResponse
    interface DeleteAppRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
        var forceStopAppReplication: ForceStopAppReplication?
            get() = definedExternally
            set(value) = definedExternally
        var forceTerminateApp: ForceTerminateApp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteAppResponse
    interface DeleteReplicationJobRequest {
        var replicationJobId: ReplicationJobId
    }
    interface DeleteReplicationJobResponse
    interface DeleteServerCatalogRequest
    interface DeleteServerCatalogResponse
    interface DisassociateConnectorRequest {
        var connectorId: ConnectorId
    }
    interface DisassociateConnectorResponse
    interface GenerateChangeSetRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
        var changesetFormat: String /* "JSON" | "YAML" | String */
    }
    interface GenerateChangeSetResponse {
        var s3Location: S3Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenerateTemplateRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
        var templateFormat: String /* "JSON" | "YAML" | String */
    }
    interface GenerateTemplateResponse {
        var s3Location: S3Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAppLaunchConfigurationRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAppLaunchConfigurationResponse {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
        var roleName: RoleName?
            get() = definedExternally
            set(value) = definedExternally
        var serverGroupLaunchConfigurations: ServerGroupLaunchConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAppReplicationConfigurationRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAppReplicationConfigurationResponse {
        var serverGroupReplicationConfigurations: ServerGroupReplicationConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAppRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetAppResponse {
        var appSummary: AppSummary?
            get() = definedExternally
            set(value) = definedExternally
        var serverGroups: ServerGroups?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectorsRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectorsResponse {
        var connectorList: ConnectorList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReplicationJobsRequest {
        var replicationJobId: ReplicationJobId?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReplicationJobsResponse {
        var replicationJobList: ReplicationJobList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReplicationRunsRequest {
        var replicationJobId: ReplicationJobId
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetReplicationRunsResponse {
        var replicationJob: ReplicationJob?
            get() = definedExternally
            set(value) = definedExternally
        var replicationRunList: ReplicationRunList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServersRequest {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var vmServerAddressList: VmServerAddressList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetServersResponse {
        var lastModifiedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var serverCatalogStatus: String /* "NOT_IMPORTED" | "IMPORTING" | "AVAILABLE" | "DELETED" | "EXPIRED" | String */
        var serverList: ServerList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportServerCatalogRequest
    interface ImportServerCatalogResponse
    interface LaunchAppRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LaunchAppResponse
    interface LaunchDetails {
        var latestLaunchTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var stackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var stackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAppsRequest {
        var appIds: AppIds?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListAppsResponse {
        var apps: Apps?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAppLaunchConfigurationRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
        var roleName: RoleName?
            get() = definedExternally
            set(value) = definedExternally
        var serverGroupLaunchConfigurations: ServerGroupLaunchConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAppLaunchConfigurationResponse
    interface PutAppReplicationConfigurationRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
        var serverGroupReplicationConfigurations: ServerGroupReplicationConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutAppReplicationConfigurationResponse
    interface ReplicationJob {
        var replicationJobId: ReplicationJobId?
            get() = definedExternally
            set(value) = definedExternally
        var serverId: ServerId?
            get() = definedExternally
            set(value) = definedExternally
        var serverType: String /* "VIRTUAL_MACHINE" | String */
        var vmServer: VmServer?
            get() = definedExternally
            set(value) = definedExternally
        var seedReplicationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var frequency: Frequency?
            get() = definedExternally
            set(value) = definedExternally
        var runOnce: RunOnce?
            get() = definedExternally
            set(value) = definedExternally
        var nextReplicationRunStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var licenseType: String /* "AWS" | "BYOL" | String */
        var roleName: RoleName?
            get() = definedExternally
            set(value) = definedExternally
        var latestAmiId: AmiId?
            get() = definedExternally
            set(value) = definedExternally
        var state: String /* "PENDING" | "ACTIVE" | "FAILED" | "DELETING" | "DELETED" | "COMPLETED" | "PAUSED_ON_FAILURE" | "FAILING" | String */
        var statusMessage: ReplicationJobStatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfRecentAmisToKeep: NumberOfRecentAmisToKeep?
            get() = definedExternally
            set(value) = definedExternally
        var encrypted: Encrypted?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
        var replicationRunList: ReplicationRunList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicationRun {
        var replicationRunId: ReplicationRunId?
            get() = definedExternally
            set(value) = definedExternally
        var state: String /* "PENDING" | "MISSED" | "ACTIVE" | "FAILED" | "COMPLETED" | "DELETING" | "DELETED" | String */
        var type: String /* "ON_DEMAND" | "AUTOMATIC" | String */
        var stageDetails: ReplicationRunStageDetails?
            get() = definedExternally
            set(value) = definedExternally
        var statusMessage: ReplicationRunStatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var amiId: AmiId?
            get() = definedExternally
            set(value) = definedExternally
        var scheduledStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var completedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var encrypted: Encrypted?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReplicationRunStageDetails {
        var stage: ReplicationRunStage?
            get() = definedExternally
            set(value) = definedExternally
        var stageProgress: ReplicationRunStageProgress?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Location {
        var bucket: BucketName?
            get() = definedExternally
            set(value) = definedExternally
        var key: KeyName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Server {
        var serverId: ServerId?
            get() = definedExternally
            set(value) = definedExternally
        var serverType: String /* "VIRTUAL_MACHINE" | String */
        var vmServer: VmServer?
            get() = definedExternally
            set(value) = definedExternally
        var replicationJobId: ReplicationJobId?
            get() = definedExternally
            set(value) = definedExternally
        var replicationJobTerminated: ReplicationJobTerminated?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerGroup {
        var serverGroupId: ServerGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var name: ServerGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var serverList: ServerList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerGroupLaunchConfiguration {
        var serverGroupId: ServerGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var launchOrder: LaunchOrder?
            get() = definedExternally
            set(value) = definedExternally
        var serverLaunchConfigurations: ServerLaunchConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerGroupReplicationConfiguration {
        var serverGroupId: ServerGroupId?
            get() = definedExternally
            set(value) = definedExternally
        var serverReplicationConfigurations: ServerReplicationConfigurations?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerLaunchConfiguration {
        var server: Server?
            get() = definedExternally
            set(value) = definedExternally
        var logicalId: LogicalId?
            get() = definedExternally
            set(value) = definedExternally
        var vpc: VPC?
            get() = definedExternally
            set(value) = definedExternally
        var subnet: Subnet?
            get() = definedExternally
            set(value) = definedExternally
        var securityGroup: SecurityGroup?
            get() = definedExternally
            set(value) = definedExternally
        var ec2KeyName: EC2KeyName?
            get() = definedExternally
            set(value) = definedExternally
        var userData: UserData?
            get() = definedExternally
            set(value) = definedExternally
        var instanceType: InstanceType?
            get() = definedExternally
            set(value) = definedExternally
        var associatePublicIpAddress: AssociatePublicIpAddress?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerReplicationConfiguration {
        var server: Server?
            get() = definedExternally
            set(value) = definedExternally
        var serverReplicationParameters: ServerReplicationParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerReplicationParameters {
        var seedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var frequency: Frequency?
            get() = definedExternally
            set(value) = definedExternally
        var runOnce: RunOnce?
            get() = definedExternally
            set(value) = definedExternally
        var licenseType: String /* "AWS" | "BYOL" | String */
        var numberOfRecentAmisToKeep: NumberOfRecentAmisToKeep?
            get() = definedExternally
            set(value) = definedExternally
        var encrypted: Encrypted?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartAppReplicationRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartAppReplicationResponse
    interface StartOnDemandReplicationRunRequest {
        var replicationJobId: ReplicationJobId
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartOnDemandReplicationRunResponse {
        var replicationRunId: ReplicationRunId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopAppReplicationRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopAppReplicationResponse
    interface Tag {
        var key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminateAppRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminateAppResponse
    interface UpdateAppRequest {
        var appId: AppId?
            get() = definedExternally
            set(value) = definedExternally
        var name: AppName?
            get() = definedExternally
            set(value) = definedExternally
        var description: AppDescription?
            get() = definedExternally
            set(value) = definedExternally
        var roleName: RoleName?
            get() = definedExternally
            set(value) = definedExternally
        var serverGroups: ServerGroups?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateAppResponse {
        var appSummary: AppSummary?
            get() = definedExternally
            set(value) = definedExternally
        var serverGroups: ServerGroups?
            get() = definedExternally
            set(value) = definedExternally
        var tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateReplicationJobRequest {
        var replicationJobId: ReplicationJobId
        var frequency: Frequency?
            get() = definedExternally
            set(value) = definedExternally
        var nextReplicationRunStartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var licenseType: String /* "AWS" | "BYOL" | String */
        var roleName: RoleName?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfRecentAmisToKeep: NumberOfRecentAmisToKeep?
            get() = definedExternally
            set(value) = definedExternally
        var encrypted: Encrypted?
            get() = definedExternally
            set(value) = definedExternally
        var kmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateReplicationJobResponse
    interface UserData {
        var s3Location: S3Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VmServer {
        var vmServerAddress: VmServerAddress?
            get() = definedExternally
            set(value) = definedExternally
        var vmName: VmName?
            get() = definedExternally
            set(value) = definedExternally
        var vmManagerName: VmManagerName?
            get() = definedExternally
            set(value) = definedExternally
        var vmManagerType: String /* "VSPHERE" | "SCVMM" | "HYPERV-MANAGER" | String */
        var vmPath: VmPath?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VmServerAddress {
        var vmManagerId: VmManagerId?
            get() = definedExternally
            set(value) = definedExternally
        var vmId: VmId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2016-10-24" | "latest" | String */
    }
}