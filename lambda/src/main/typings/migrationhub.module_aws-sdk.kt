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
import MigrationHub.ApplicationState
import MigrationHub.CreatedArtifact
import MigrationHub.DiscoveredResource
import MigrationHub.ResourceAttribute
import MigrationHub.MigrationTaskSummary
import MigrationHub.ProgressUpdateStreamSummary
import MigrationHub.AssociateCreatedArtifactRequest
import MigrationHub.AssociateCreatedArtifactResult
import MigrationHub.AssociateDiscoveredResourceRequest
import MigrationHub.AssociateDiscoveredResourceResult
import MigrationHub.CreateProgressUpdateStreamRequest
import MigrationHub.CreateProgressUpdateStreamResult
import MigrationHub.DeleteProgressUpdateStreamRequest
import MigrationHub.DeleteProgressUpdateStreamResult
import MigrationHub.DescribeApplicationStateRequest
import MigrationHub.DescribeApplicationStateResult
import MigrationHub.DescribeMigrationTaskRequest
import MigrationHub.DescribeMigrationTaskResult
import MigrationHub.DisassociateCreatedArtifactRequest
import MigrationHub.DisassociateCreatedArtifactResult
import MigrationHub.DisassociateDiscoveredResourceRequest
import MigrationHub.DisassociateDiscoveredResourceResult
import MigrationHub.ImportMigrationTaskRequest
import MigrationHub.ImportMigrationTaskResult
import MigrationHub.ListApplicationStatesRequest
import MigrationHub.ListApplicationStatesResult
import MigrationHub.ListCreatedArtifactsRequest
import MigrationHub.ListCreatedArtifactsResult
import MigrationHub.ListDiscoveredResourcesRequest
import MigrationHub.ListDiscoveredResourcesResult
import MigrationHub.ListMigrationTasksRequest
import MigrationHub.ListMigrationTasksResult
import MigrationHub.ListProgressUpdateStreamsRequest
import MigrationHub.ListProgressUpdateStreamsResult
import MigrationHub.NotifyApplicationStateRequest
import MigrationHub.NotifyApplicationStateResult
import MigrationHub.NotifyMigrationTaskStateRequest
import MigrationHub.NotifyMigrationTaskStateResult
import MigrationHub.PutResourceAttributesRequest
import MigrationHub.PutResourceAttributesResult
import MigrationHub.MigrationTask
import MigrationHub.Task

typealias ApplicationId = String

typealias ApplicationIds = Array<ApplicationId>

typealias ApplicationStateList = Array<ApplicationState>

typealias ConfigurationId = String

typealias CreatedArtifactDescription = String

typealias CreatedArtifactList = Array<CreatedArtifact>

typealias CreatedArtifactName = String

typealias DiscoveredResourceDescription = String

typealias DiscoveredResourceList = Array<DiscoveredResource>

typealias DryRun = Boolean

typealias LatestResourceAttributeList = Array<ResourceAttribute>

typealias MaxResults = Number

typealias MaxResultsCreatedArtifacts = Number

typealias MaxResultsResources = Number

typealias MigrationTaskName = String

typealias MigrationTaskSummaryList = Array<MigrationTaskSummary>

typealias NextUpdateSeconds = Number

typealias ProgressPercent = Number

typealias ProgressUpdateStream = String

typealias ProgressUpdateStreamSummaryList = Array<ProgressUpdateStreamSummary>

typealias ResourceAttributeList = Array<ResourceAttribute>

typealias ResourceAttributeValue = String

typealias ResourceName = String

typealias StatusDetail = String

typealias Token = String

typealias UpdateDateTime = Date

@JsModule("aws-sdk")
external open class MigrationHub(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & MigrationHub.Types.ClientConfiguration */
    open fun associateCreatedArtifact(params: AssociateCreatedArtifactRequest, callback: (err: AWSError, data: AssociateCreatedArtifactResult) -> Unit = definedExternally): Request<AssociateCreatedArtifactResult, AWSError>
    open fun associateCreatedArtifact(callback: (err: AWSError, data: AssociateCreatedArtifactResult) -> Unit = definedExternally): Request<AssociateCreatedArtifactResult, AWSError>
    open fun associateDiscoveredResource(params: AssociateDiscoveredResourceRequest, callback: (err: AWSError, data: AssociateDiscoveredResourceResult) -> Unit = definedExternally): Request<AssociateDiscoveredResourceResult, AWSError>
    open fun associateDiscoveredResource(callback: (err: AWSError, data: AssociateDiscoveredResourceResult) -> Unit = definedExternally): Request<AssociateDiscoveredResourceResult, AWSError>
    open fun createProgressUpdateStream(params: CreateProgressUpdateStreamRequest, callback: (err: AWSError, data: CreateProgressUpdateStreamResult) -> Unit = definedExternally): Request<CreateProgressUpdateStreamResult, AWSError>
    open fun createProgressUpdateStream(callback: (err: AWSError, data: CreateProgressUpdateStreamResult) -> Unit = definedExternally): Request<CreateProgressUpdateStreamResult, AWSError>
    open fun deleteProgressUpdateStream(params: DeleteProgressUpdateStreamRequest, callback: (err: AWSError, data: DeleteProgressUpdateStreamResult) -> Unit = definedExternally): Request<DeleteProgressUpdateStreamResult, AWSError>
    open fun deleteProgressUpdateStream(callback: (err: AWSError, data: DeleteProgressUpdateStreamResult) -> Unit = definedExternally): Request<DeleteProgressUpdateStreamResult, AWSError>
    open fun describeApplicationState(params: DescribeApplicationStateRequest, callback: (err: AWSError, data: DescribeApplicationStateResult) -> Unit = definedExternally): Request<DescribeApplicationStateResult, AWSError>
    open fun describeApplicationState(callback: (err: AWSError, data: DescribeApplicationStateResult) -> Unit = definedExternally): Request<DescribeApplicationStateResult, AWSError>
    open fun describeMigrationTask(params: DescribeMigrationTaskRequest, callback: (err: AWSError, data: DescribeMigrationTaskResult) -> Unit = definedExternally): Request<DescribeMigrationTaskResult, AWSError>
    open fun describeMigrationTask(callback: (err: AWSError, data: DescribeMigrationTaskResult) -> Unit = definedExternally): Request<DescribeMigrationTaskResult, AWSError>
    open fun disassociateCreatedArtifact(params: DisassociateCreatedArtifactRequest, callback: (err: AWSError, data: DisassociateCreatedArtifactResult) -> Unit = definedExternally): Request<DisassociateCreatedArtifactResult, AWSError>
    open fun disassociateCreatedArtifact(callback: (err: AWSError, data: DisassociateCreatedArtifactResult) -> Unit = definedExternally): Request<DisassociateCreatedArtifactResult, AWSError>
    open fun disassociateDiscoveredResource(params: DisassociateDiscoveredResourceRequest, callback: (err: AWSError, data: DisassociateDiscoveredResourceResult) -> Unit = definedExternally): Request<DisassociateDiscoveredResourceResult, AWSError>
    open fun disassociateDiscoveredResource(callback: (err: AWSError, data: DisassociateDiscoveredResourceResult) -> Unit = definedExternally): Request<DisassociateDiscoveredResourceResult, AWSError>
    open fun importMigrationTask(params: ImportMigrationTaskRequest, callback: (err: AWSError, data: ImportMigrationTaskResult) -> Unit = definedExternally): Request<ImportMigrationTaskResult, AWSError>
    open fun importMigrationTask(callback: (err: AWSError, data: ImportMigrationTaskResult) -> Unit = definedExternally): Request<ImportMigrationTaskResult, AWSError>
    open fun listApplicationStates(params: ListApplicationStatesRequest, callback: (err: AWSError, data: ListApplicationStatesResult) -> Unit = definedExternally): Request<ListApplicationStatesResult, AWSError>
    open fun listApplicationStates(callback: (err: AWSError, data: ListApplicationStatesResult) -> Unit = definedExternally): Request<ListApplicationStatesResult, AWSError>
    open fun listCreatedArtifacts(params: ListCreatedArtifactsRequest, callback: (err: AWSError, data: ListCreatedArtifactsResult) -> Unit = definedExternally): Request<ListCreatedArtifactsResult, AWSError>
    open fun listCreatedArtifacts(callback: (err: AWSError, data: ListCreatedArtifactsResult) -> Unit = definedExternally): Request<ListCreatedArtifactsResult, AWSError>
    open fun listDiscoveredResources(params: ListDiscoveredResourcesRequest, callback: (err: AWSError, data: ListDiscoveredResourcesResult) -> Unit = definedExternally): Request<ListDiscoveredResourcesResult, AWSError>
    open fun listDiscoveredResources(callback: (err: AWSError, data: ListDiscoveredResourcesResult) -> Unit = definedExternally): Request<ListDiscoveredResourcesResult, AWSError>
    open fun listMigrationTasks(params: ListMigrationTasksRequest, callback: (err: AWSError, data: ListMigrationTasksResult) -> Unit = definedExternally): Request<ListMigrationTasksResult, AWSError>
    open fun listMigrationTasks(callback: (err: AWSError, data: ListMigrationTasksResult) -> Unit = definedExternally): Request<ListMigrationTasksResult, AWSError>
    open fun listProgressUpdateStreams(params: ListProgressUpdateStreamsRequest, callback: (err: AWSError, data: ListProgressUpdateStreamsResult) -> Unit = definedExternally): Request<ListProgressUpdateStreamsResult, AWSError>
    open fun listProgressUpdateStreams(callback: (err: AWSError, data: ListProgressUpdateStreamsResult) -> Unit = definedExternally): Request<ListProgressUpdateStreamsResult, AWSError>
    open fun notifyApplicationState(params: NotifyApplicationStateRequest, callback: (err: AWSError, data: NotifyApplicationStateResult) -> Unit = definedExternally): Request<NotifyApplicationStateResult, AWSError>
    open fun notifyApplicationState(callback: (err: AWSError, data: NotifyApplicationStateResult) -> Unit = definedExternally): Request<NotifyApplicationStateResult, AWSError>
    open fun notifyMigrationTaskState(params: NotifyMigrationTaskStateRequest, callback: (err: AWSError, data: NotifyMigrationTaskStateResult) -> Unit = definedExternally): Request<NotifyMigrationTaskStateResult, AWSError>
    open fun notifyMigrationTaskState(callback: (err: AWSError, data: NotifyMigrationTaskStateResult) -> Unit = definedExternally): Request<NotifyMigrationTaskStateResult, AWSError>
    open fun putResourceAttributes(params: PutResourceAttributesRequest, callback: (err: AWSError, data: PutResourceAttributesResult) -> Unit = definedExternally): Request<PutResourceAttributesResult, AWSError>
    open fun putResourceAttributes(callback: (err: AWSError, data: PutResourceAttributesResult) -> Unit = definedExternally): Request<PutResourceAttributesResult, AWSError>
    interface ApplicationState {
        var ApplicationId: ApplicationId?
            get() = definedExternally
            set(value) = definedExternally
        var ApplicationStatus: String /* "NOT_STARTED" | "IN_PROGRESS" | "COMPLETED" | String */
        var LastUpdatedTime: UpdateDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateCreatedArtifactRequest {
        var ProgressUpdateStream: ProgressUpdateStream
        var MigrationTaskName: MigrationTaskName
        var CreatedArtifact: CreatedArtifact
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateCreatedArtifactResult
    interface AssociateDiscoveredResourceRequest {
        var ProgressUpdateStream: ProgressUpdateStream
        var MigrationTaskName: MigrationTaskName
        var DiscoveredResource: DiscoveredResource
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateDiscoveredResourceResult
    interface CreateProgressUpdateStreamRequest {
        var ProgressUpdateStreamName: ProgressUpdateStream
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateProgressUpdateStreamResult
    interface CreatedArtifact {
        var Name: CreatedArtifactName
        var Description: CreatedArtifactDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteProgressUpdateStreamRequest {
        var ProgressUpdateStreamName: ProgressUpdateStream
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteProgressUpdateStreamResult
    interface DescribeApplicationStateRequest {
        var ApplicationId: ApplicationId
    }
    interface DescribeApplicationStateResult {
        var ApplicationStatus: String /* "NOT_STARTED" | "IN_PROGRESS" | "COMPLETED" | String */
        var LastUpdatedTime: UpdateDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeMigrationTaskRequest {
        var ProgressUpdateStream: ProgressUpdateStream
        var MigrationTaskName: MigrationTaskName
    }
    interface DescribeMigrationTaskResult {
        var MigrationTask: MigrationTask?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateCreatedArtifactRequest {
        var ProgressUpdateStream: ProgressUpdateStream
        var MigrationTaskName: MigrationTaskName
        var CreatedArtifactName: CreatedArtifactName
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateCreatedArtifactResult
    interface DisassociateDiscoveredResourceRequest {
        var ProgressUpdateStream: ProgressUpdateStream
        var MigrationTaskName: MigrationTaskName
        var ConfigurationId: ConfigurationId
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateDiscoveredResourceResult
    interface DiscoveredResource {
        var ConfigurationId: ConfigurationId
        var Description: DiscoveredResourceDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportMigrationTaskRequest {
        var ProgressUpdateStream: ProgressUpdateStream
        var MigrationTaskName: MigrationTaskName
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportMigrationTaskResult
    interface ListApplicationStatesRequest {
        var ApplicationIds: ApplicationIds?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListApplicationStatesResult {
        var ApplicationStateList: ApplicationStateList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCreatedArtifactsRequest {
        var ProgressUpdateStream: ProgressUpdateStream
        var MigrationTaskName: MigrationTaskName
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsCreatedArtifacts?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCreatedArtifactsResult {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedArtifactList: CreatedArtifactList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDiscoveredResourcesRequest {
        var ProgressUpdateStream: ProgressUpdateStream
        var MigrationTaskName: MigrationTaskName
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsResources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDiscoveredResourcesResult {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var DiscoveredResourceList: DiscoveredResourceList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMigrationTasksRequest {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceName: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMigrationTasksResult {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MigrationTaskSummaryList: MigrationTaskSummaryList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProgressUpdateStreamsRequest {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListProgressUpdateStreamsResult {
        var ProgressUpdateStreamSummaryList: ProgressUpdateStreamSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MigrationTask {
        var ProgressUpdateStream: ProgressUpdateStream?
            get() = definedExternally
            set(value) = definedExternally
        var MigrationTaskName: MigrationTaskName?
            get() = definedExternally
            set(value) = definedExternally
        var Task: Task?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateDateTime: UpdateDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceAttributeList: LatestResourceAttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MigrationTaskSummary {
        var ProgressUpdateStream: ProgressUpdateStream?
            get() = definedExternally
            set(value) = definedExternally
        var MigrationTaskName: MigrationTaskName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "NOT_STARTED" | "IN_PROGRESS" | "FAILED" | "COMPLETED" | String */
        var ProgressPercent: ProgressPercent?
            get() = definedExternally
            set(value) = definedExternally
        var StatusDetail: StatusDetail?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateDateTime: UpdateDateTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotifyApplicationStateRequest {
        var ApplicationId: ApplicationId
        var Status: String /* "NOT_STARTED" | "IN_PROGRESS" | "COMPLETED" | String */
        var UpdateDateTime: UpdateDateTime?
            get() = definedExternally
            set(value) = definedExternally
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotifyApplicationStateResult
    interface NotifyMigrationTaskStateRequest {
        var ProgressUpdateStream: ProgressUpdateStream
        var MigrationTaskName: MigrationTaskName
        var Task: Task
        var UpdateDateTime: UpdateDateTime
        var NextUpdateSeconds: NextUpdateSeconds
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotifyMigrationTaskStateResult
    interface ProgressUpdateStreamSummary {
        var ProgressUpdateStreamName: ProgressUpdateStream?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutResourceAttributesRequest {
        var ProgressUpdateStream: ProgressUpdateStream
        var MigrationTaskName: MigrationTaskName
        var ResourceAttributeList: ResourceAttributeList
        var DryRun: DryRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutResourceAttributesResult
    interface ResourceAttribute {
        var Type: String /* "IPV4_ADDRESS" | "IPV6_ADDRESS" | "MAC_ADDRESS" | "FQDN" | "VM_MANAGER_ID" | "VM_MANAGED_OBJECT_REFERENCE" | "VM_NAME" | "VM_PATH" | "BIOS_ID" | "MOTHERBOARD_SERIAL_NUMBER" | String */
        var Value: ResourceAttributeValue
    }
    interface Task {
        var Status: String /* "NOT_STARTED" | "IN_PROGRESS" | "FAILED" | "COMPLETED" | String */
        var StatusDetail: StatusDetail?
            get() = definedExternally
            set(value) = definedExternally
        var ProgressPercent: ProgressPercent?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-05-31" | "latest" | String */
    }
}