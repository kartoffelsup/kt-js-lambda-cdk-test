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
import Discovery.AgentConfigurationStatus
import Discovery.AgentNetworkInfo
import Discovery.AgentInfo
import Discovery.BatchDeleteImportDataError
import Discovery.ConfigurationTag
import Discovery.Configuration
import Discovery.ContinuousExportDescription
import Discovery.DescribeConfigurationsAttribute
import Discovery.ImportTaskFilter
import Discovery.ExportFilter
import Discovery.ExportInfo
import Discovery.Filter
import Discovery.ImportTask
import Discovery.NeighborConnectionDetail
import Discovery.OrderByElement
import Discovery.TagFilter
import Discovery.Tag
import Discovery.AssociateConfigurationItemsToApplicationRequest
import Discovery.AssociateConfigurationItemsToApplicationResponse
import Discovery.BatchDeleteImportDataRequest
import Discovery.BatchDeleteImportDataResponse
import Discovery.CreateApplicationRequest
import Discovery.CreateApplicationResponse
import Discovery.CreateTagsRequest
import Discovery.CreateTagsResponse
import Discovery.DeleteApplicationsRequest
import Discovery.DeleteApplicationsResponse
import Discovery.DeleteTagsRequest
import Discovery.DeleteTagsResponse
import Discovery.DescribeAgentsRequest
import Discovery.DescribeAgentsResponse
import Discovery.DescribeConfigurationsRequest
import Discovery.DescribeConfigurationsResponse
import Discovery.DescribeContinuousExportsRequest
import Discovery.DescribeContinuousExportsResponse
import Discovery.DescribeExportConfigurationsRequest
import Discovery.DescribeExportConfigurationsResponse
import Discovery.DescribeExportTasksRequest
import Discovery.DescribeExportTasksResponse
import Discovery.DescribeImportTasksRequest
import Discovery.DescribeImportTasksResponse
import Discovery.DescribeTagsRequest
import Discovery.DescribeTagsResponse
import Discovery.DisassociateConfigurationItemsFromApplicationRequest
import Discovery.DisassociateConfigurationItemsFromApplicationResponse
import Discovery.ExportConfigurationsResponse
import Discovery.GetDiscoverySummaryRequest
import Discovery.GetDiscoverySummaryResponse
import Discovery.ListConfigurationsRequest
import Discovery.ListConfigurationsResponse
import Discovery.ListServerNeighborsRequest
import Discovery.ListServerNeighborsResponse
import Discovery.StartContinuousExportRequest
import Discovery.StartContinuousExportResponse
import Discovery.StartDataCollectionByAgentIdsRequest
import Discovery.StartDataCollectionByAgentIdsResponse
import Discovery.StartExportTaskRequest
import Discovery.StartExportTaskResponse
import Discovery.StartImportTaskRequest
import Discovery.StartImportTaskResponse
import Discovery.StopContinuousExportRequest
import Discovery.StopContinuousExportResponse
import Discovery.StopDataCollectionByAgentIdsRequest
import Discovery.StopDataCollectionByAgentIdsResponse
import Discovery.UpdateApplicationRequest
import Discovery.UpdateApplicationResponse
import Discovery.SchemaStorageConfig
import Discovery.CustomerAgentInfo
import Discovery.CustomerConnectorInfo

typealias AgentConfigurationStatusList = Array<AgentConfigurationStatus>

typealias AgentId = String

typealias AgentIds = Array<AgentId>

typealias AgentNetworkInfoList = Array<AgentNetworkInfo>

typealias AgentsInfo = Array<AgentInfo>

typealias ApplicationId = String

typealias ApplicationIdsList = Array<ApplicationId>

typealias BatchDeleteImportDataErrorDescription = String

typealias BatchDeleteImportDataErrorList = Array<BatchDeleteImportDataError>

typealias Boolean = Boolean

typealias BoxedInteger = Number

typealias ClientRequestToken = String

typealias Condition = String

typealias ConfigurationId = String

typealias ConfigurationIdList = Array<ConfigurationId>

typealias ConfigurationTagSet = Array<ConfigurationTag>

typealias Configurations = Array<Configuration>

typealias ConfigurationsDownloadUrl = String

typealias ConfigurationsExportId = String

typealias ContinuousExportDescriptions = Array<ContinuousExportDescription>

typealias ContinuousExportIds = Array<ConfigurationsExportId>

typealias DatabaseName = String

typealias DescribeConfigurationsAttributes = Array<DescribeConfigurationsAttribute>

typealias DescribeContinuousExportsMaxResults = Number

typealias DescribeImportTasksFilterList = Array<ImportTaskFilter>

typealias DescribeImportTasksMaxResults = Number

typealias ExportDataFormats = Array<String /* "CSV" | "GRAPHML" | String */>

typealias ExportFilters = Array<ExportFilter>

typealias ExportIds = Array<ConfigurationsExportId>

typealias ExportRequestTime = Date

typealias ExportStatusMessage = String

typealias ExportsInfo = Array<ExportInfo>

typealias FilterName = String

typealias FilterValue = String

typealias FilterValues = Array<FilterValue>

typealias Filters = Array<Filter>

typealias ImportTaskFilterValue = String

typealias ImportTaskFilterValueList = Array<ImportTaskFilterValue>

typealias ImportTaskIdentifier = String

typealias ImportTaskList = Array<ImportTask>

typealias ImportTaskName = String

typealias ImportURL = String

typealias Integer = Number

typealias Long = Number

typealias NeighborDetailsList = Array<NeighborConnectionDetail>

typealias NextToken = String

typealias OrderByList = Array<OrderByElement>

typealias S3Bucket = String

typealias S3PresignedUrl = String

typealias String = String

typealias StringMax255 = String

typealias TagFilters = Array<TagFilter>

typealias TagKey = String

typealias TagSet = Array<Tag>

typealias TagValue = String

typealias TimeStamp = Date

typealias ToDeleteIdentifierList = Array<ImportTaskIdentifier>

@JsModule("aws-sdk")
external open class Discovery(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Discovery.Types.ClientConfiguration */
    open fun associateConfigurationItemsToApplication(params: AssociateConfigurationItemsToApplicationRequest, callback: (err: AWSError, data: AssociateConfigurationItemsToApplicationResponse) -> Unit = definedExternally): Request<AssociateConfigurationItemsToApplicationResponse, AWSError>
    open fun associateConfigurationItemsToApplication(callback: (err: AWSError, data: AssociateConfigurationItemsToApplicationResponse) -> Unit = definedExternally): Request<AssociateConfigurationItemsToApplicationResponse, AWSError>
    open fun batchDeleteImportData(params: BatchDeleteImportDataRequest, callback: (err: AWSError, data: BatchDeleteImportDataResponse) -> Unit = definedExternally): Request<BatchDeleteImportDataResponse, AWSError>
    open fun batchDeleteImportData(callback: (err: AWSError, data: BatchDeleteImportDataResponse) -> Unit = definedExternally): Request<BatchDeleteImportDataResponse, AWSError>
    open fun createApplication(params: CreateApplicationRequest, callback: (err: AWSError, data: CreateApplicationResponse) -> Unit = definedExternally): Request<CreateApplicationResponse, AWSError>
    open fun createApplication(callback: (err: AWSError, data: CreateApplicationResponse) -> Unit = definedExternally): Request<CreateApplicationResponse, AWSError>
    open fun createTags(params: CreateTagsRequest, callback: (err: AWSError, data: CreateTagsResponse) -> Unit = definedExternally): Request<CreateTagsResponse, AWSError>
    open fun createTags(callback: (err: AWSError, data: CreateTagsResponse) -> Unit = definedExternally): Request<CreateTagsResponse, AWSError>
    open fun deleteApplications(params: DeleteApplicationsRequest, callback: (err: AWSError, data: DeleteApplicationsResponse) -> Unit = definedExternally): Request<DeleteApplicationsResponse, AWSError>
    open fun deleteApplications(callback: (err: AWSError, data: DeleteApplicationsResponse) -> Unit = definedExternally): Request<DeleteApplicationsResponse, AWSError>
    open fun deleteTags(params: DeleteTagsRequest, callback: (err: AWSError, data: DeleteTagsResponse) -> Unit = definedExternally): Request<DeleteTagsResponse, AWSError>
    open fun deleteTags(callback: (err: AWSError, data: DeleteTagsResponse) -> Unit = definedExternally): Request<DeleteTagsResponse, AWSError>
    open fun describeAgents(params: DescribeAgentsRequest, callback: (err: AWSError, data: DescribeAgentsResponse) -> Unit = definedExternally): Request<DescribeAgentsResponse, AWSError>
    open fun describeAgents(callback: (err: AWSError, data: DescribeAgentsResponse) -> Unit = definedExternally): Request<DescribeAgentsResponse, AWSError>
    open fun describeConfigurations(params: DescribeConfigurationsRequest, callback: (err: AWSError, data: DescribeConfigurationsResponse) -> Unit = definedExternally): Request<DescribeConfigurationsResponse, AWSError>
    open fun describeConfigurations(callback: (err: AWSError, data: DescribeConfigurationsResponse) -> Unit = definedExternally): Request<DescribeConfigurationsResponse, AWSError>
    open fun describeContinuousExports(params: DescribeContinuousExportsRequest, callback: (err: AWSError, data: DescribeContinuousExportsResponse) -> Unit = definedExternally): Request<DescribeContinuousExportsResponse, AWSError>
    open fun describeContinuousExports(callback: (err: AWSError, data: DescribeContinuousExportsResponse) -> Unit = definedExternally): Request<DescribeContinuousExportsResponse, AWSError>
    open fun describeExportConfigurations(params: DescribeExportConfigurationsRequest, callback: (err: AWSError, data: DescribeExportConfigurationsResponse) -> Unit = definedExternally): Request<DescribeExportConfigurationsResponse, AWSError>
    open fun describeExportConfigurations(callback: (err: AWSError, data: DescribeExportConfigurationsResponse) -> Unit = definedExternally): Request<DescribeExportConfigurationsResponse, AWSError>
    open fun describeExportTasks(params: DescribeExportTasksRequest, callback: (err: AWSError, data: DescribeExportTasksResponse) -> Unit = definedExternally): Request<DescribeExportTasksResponse, AWSError>
    open fun describeExportTasks(callback: (err: AWSError, data: DescribeExportTasksResponse) -> Unit = definedExternally): Request<DescribeExportTasksResponse, AWSError>
    open fun describeImportTasks(params: DescribeImportTasksRequest, callback: (err: AWSError, data: DescribeImportTasksResponse) -> Unit = definedExternally): Request<DescribeImportTasksResponse, AWSError>
    open fun describeImportTasks(callback: (err: AWSError, data: DescribeImportTasksResponse) -> Unit = definedExternally): Request<DescribeImportTasksResponse, AWSError>
    open fun describeTags(params: DescribeTagsRequest, callback: (err: AWSError, data: DescribeTagsResponse) -> Unit = definedExternally): Request<DescribeTagsResponse, AWSError>
    open fun describeTags(callback: (err: AWSError, data: DescribeTagsResponse) -> Unit = definedExternally): Request<DescribeTagsResponse, AWSError>
    open fun disassociateConfigurationItemsFromApplication(params: DisassociateConfigurationItemsFromApplicationRequest, callback: (err: AWSError, data: DisassociateConfigurationItemsFromApplicationResponse) -> Unit = definedExternally): Request<DisassociateConfigurationItemsFromApplicationResponse, AWSError>
    open fun disassociateConfigurationItemsFromApplication(callback: (err: AWSError, data: DisassociateConfigurationItemsFromApplicationResponse) -> Unit = definedExternally): Request<DisassociateConfigurationItemsFromApplicationResponse, AWSError>
    open fun exportConfigurations(callback: (err: AWSError, data: ExportConfigurationsResponse) -> Unit = definedExternally): Request<ExportConfigurationsResponse, AWSError>
    open fun getDiscoverySummary(params: GetDiscoverySummaryRequest, callback: (err: AWSError, data: GetDiscoverySummaryResponse) -> Unit = definedExternally): Request<GetDiscoverySummaryResponse, AWSError>
    open fun getDiscoverySummary(callback: (err: AWSError, data: GetDiscoverySummaryResponse) -> Unit = definedExternally): Request<GetDiscoverySummaryResponse, AWSError>
    open fun listConfigurations(params: ListConfigurationsRequest, callback: (err: AWSError, data: ListConfigurationsResponse) -> Unit = definedExternally): Request<ListConfigurationsResponse, AWSError>
    open fun listConfigurations(callback: (err: AWSError, data: ListConfigurationsResponse) -> Unit = definedExternally): Request<ListConfigurationsResponse, AWSError>
    open fun listServerNeighbors(params: ListServerNeighborsRequest, callback: (err: AWSError, data: ListServerNeighborsResponse) -> Unit = definedExternally): Request<ListServerNeighborsResponse, AWSError>
    open fun listServerNeighbors(callback: (err: AWSError, data: ListServerNeighborsResponse) -> Unit = definedExternally): Request<ListServerNeighborsResponse, AWSError>
    open fun startContinuousExport(params: StartContinuousExportRequest, callback: (err: AWSError, data: StartContinuousExportResponse) -> Unit = definedExternally): Request<StartContinuousExportResponse, AWSError>
    open fun startContinuousExport(callback: (err: AWSError, data: StartContinuousExportResponse) -> Unit = definedExternally): Request<StartContinuousExportResponse, AWSError>
    open fun startDataCollectionByAgentIds(params: StartDataCollectionByAgentIdsRequest, callback: (err: AWSError, data: StartDataCollectionByAgentIdsResponse) -> Unit = definedExternally): Request<StartDataCollectionByAgentIdsResponse, AWSError>
    open fun startDataCollectionByAgentIds(callback: (err: AWSError, data: StartDataCollectionByAgentIdsResponse) -> Unit = definedExternally): Request<StartDataCollectionByAgentIdsResponse, AWSError>
    open fun startExportTask(params: StartExportTaskRequest, callback: (err: AWSError, data: StartExportTaskResponse) -> Unit = definedExternally): Request<StartExportTaskResponse, AWSError>
    open fun startExportTask(callback: (err: AWSError, data: StartExportTaskResponse) -> Unit = definedExternally): Request<StartExportTaskResponse, AWSError>
    open fun startImportTask(params: StartImportTaskRequest, callback: (err: AWSError, data: StartImportTaskResponse) -> Unit = definedExternally): Request<StartImportTaskResponse, AWSError>
    open fun startImportTask(callback: (err: AWSError, data: StartImportTaskResponse) -> Unit = definedExternally): Request<StartImportTaskResponse, AWSError>
    open fun stopContinuousExport(params: StopContinuousExportRequest, callback: (err: AWSError, data: StopContinuousExportResponse) -> Unit = definedExternally): Request<StopContinuousExportResponse, AWSError>
    open fun stopContinuousExport(callback: (err: AWSError, data: StopContinuousExportResponse) -> Unit = definedExternally): Request<StopContinuousExportResponse, AWSError>
    open fun stopDataCollectionByAgentIds(params: StopDataCollectionByAgentIdsRequest, callback: (err: AWSError, data: StopDataCollectionByAgentIdsResponse) -> Unit = definedExternally): Request<StopDataCollectionByAgentIdsResponse, AWSError>
    open fun stopDataCollectionByAgentIds(callback: (err: AWSError, data: StopDataCollectionByAgentIdsResponse) -> Unit = definedExternally): Request<StopDataCollectionByAgentIdsResponse, AWSError>
    open fun updateApplication(params: UpdateApplicationRequest, callback: (err: AWSError, data: UpdateApplicationResponse) -> Unit = definedExternally): Request<UpdateApplicationResponse, AWSError>
    open fun updateApplication(callback: (err: AWSError, data: UpdateApplicationResponse) -> Unit = definedExternally): Request<UpdateApplicationResponse, AWSError>
    interface AgentConfigurationStatus {
        var agentId: String?
            get() = definedExternally
            set(value) = definedExternally
        var operationSucceeded: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AgentInfo {
        var agentId: AgentId?
            get() = definedExternally
            set(value) = definedExternally
        var hostName: String?
            get() = definedExternally
            set(value) = definedExternally
        var agentNetworkInfoList: AgentNetworkInfoList?
            get() = definedExternally
            set(value) = definedExternally
        var connectorId: String?
            get() = definedExternally
            set(value) = definedExternally
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
        var health: String /* "HEALTHY" | "UNHEALTHY" | "RUNNING" | "UNKNOWN" | "BLACKLISTED" | "SHUTDOWN" | String */
        var lastHealthPingTime: String?
            get() = definedExternally
            set(value) = definedExternally
        var collectionStatus: String?
            get() = definedExternally
            set(value) = definedExternally
        var agentType: String?
            get() = definedExternally
            set(value) = definedExternally
        var registeredTime: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AgentNetworkInfo {
        var ipAddress: String?
            get() = definedExternally
            set(value) = definedExternally
        var macAddress: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AssociateConfigurationItemsToApplicationRequest {
        var applicationConfigurationId: ApplicationId
        var configurationIds: ConfigurationIdList
    }
    interface AssociateConfigurationItemsToApplicationResponse
    interface BatchDeleteImportDataError {
        var importTaskId: ImportTaskIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: String /* "NOT_FOUND" | "INTERNAL_SERVER_ERROR" | "OVER_LIMIT" | String */
        var errorDescription: BatchDeleteImportDataErrorDescription?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteImportDataRequest {
        var importTaskIds: ToDeleteIdentifierList
    }
    interface BatchDeleteImportDataResponse {
        var errors: BatchDeleteImportDataErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Configuration {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface ConfigurationTag {
        var configurationType: String /* "SERVER" | "PROCESS" | "CONNECTION" | "APPLICATION" | String */
        var configurationId: ConfigurationId?
            get() = definedExternally
            set(value) = definedExternally
        var key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
        var timeOfCreation: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContinuousExportDescription {
        var exportId: ConfigurationsExportId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "START_IN_PROGRESS" | "START_FAILED" | "ACTIVE" | "ERROR" | "STOP_IN_PROGRESS" | "STOP_FAILED" | "INACTIVE" | String */
        var statusDetail: StringMax255?
            get() = definedExternally
            set(value) = definedExternally
        var s3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var stopTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var dataSource: String /* "AGENT" | String */
        var schemaStorageConfig: SchemaStorageConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationRequest {
        var name: String
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateApplicationResponse {
        var configurationId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTagsRequest {
        var configurationIds: ConfigurationIdList
        var tags: TagSet
    }
    interface CreateTagsResponse
    interface CustomerAgentInfo {
        var activeAgents: Integer
        var healthyAgents: Integer
        var blackListedAgents: Integer
        var shutdownAgents: Integer
        var unhealthyAgents: Integer
        var totalAgents: Integer
        var unknownAgents: Integer
    }
    interface CustomerConnectorInfo {
        var activeConnectors: Integer
        var healthyConnectors: Integer
        var blackListedConnectors: Integer
        var shutdownConnectors: Integer
        var unhealthyConnectors: Integer
        var totalConnectors: Integer
        var unknownConnectors: Integer
    }
    interface DeleteApplicationsRequest {
        var configurationIds: ApplicationIdsList
    }
    interface DeleteApplicationsResponse
    interface DeleteTagsRequest {
        var configurationIds: ConfigurationIdList
        var tags: TagSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTagsResponse
    interface DescribeAgentsRequest {
        var agentIds: AgentIds?
            get() = definedExternally
            set(value) = definedExternally
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAgentsResponse {
        var agentsInfo: AgentsInfo?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeConfigurationsAttribute {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface DescribeConfigurationsRequest {
        var configurationIds: ConfigurationIdList
    }
    interface DescribeConfigurationsResponse {
        var configurations: DescribeConfigurationsAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeContinuousExportsRequest {
        var exportIds: ContinuousExportIds?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: DescribeContinuousExportsMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeContinuousExportsResponse {
        var descriptions: ContinuousExportDescriptions?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeExportConfigurationsRequest {
        var exportIds: ExportIds?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeExportConfigurationsResponse {
        var exportsInfo: ExportsInfo?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeExportTasksRequest {
        var exportIds: ExportIds?
            get() = definedExternally
            set(value) = definedExternally
        var filters: ExportFilters?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeExportTasksResponse {
        var exportsInfo: ExportsInfo?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImportTasksRequest {
        var filters: DescribeImportTasksFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: DescribeImportTasksMaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeImportTasksResponse {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var tasks: ImportTaskList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTagsRequest {
        var filters: TagFilters?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTagsResponse {
        var tags: ConfigurationTagSet?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DisassociateConfigurationItemsFromApplicationRequest {
        var applicationConfigurationId: ApplicationId
        var configurationIds: ConfigurationIdList
    }
    interface DisassociateConfigurationItemsFromApplicationResponse
    interface ExportConfigurationsResponse {
        var exportId: ConfigurationsExportId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportFilter {
        var name: FilterName
        var values: FilterValues
        var condition: Condition
    }
    interface ExportInfo {
        var exportId: ConfigurationsExportId
        var exportStatus: String /* "FAILED" | "SUCCEEDED" | "IN_PROGRESS" | String */
        var statusMessage: ExportStatusMessage
        var configurationsDownloadUrl: ConfigurationsDownloadUrl?
            get() = definedExternally
            set(value) = definedExternally
        var exportRequestTime: ExportRequestTime
        var isTruncated: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var requestedStartTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var requestedEndTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Filter {
        var name: String
        var values: FilterValues
        var condition: Condition
    }
    interface GetDiscoverySummaryRequest
    interface GetDiscoverySummaryResponse {
        var servers: Long?
            get() = definedExternally
            set(value) = definedExternally
        var applications: Long?
            get() = definedExternally
            set(value) = definedExternally
        var serversMappedToApplications: Long?
            get() = definedExternally
            set(value) = definedExternally
        var serversMappedtoTags: Long?
            get() = definedExternally
            set(value) = definedExternally
        var agentSummary: CustomerAgentInfo?
            get() = definedExternally
            set(value) = definedExternally
        var connectorSummary: CustomerConnectorInfo?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportTask {
        var importTaskId: ImportTaskIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var name: ImportTaskName?
            get() = definedExternally
            set(value) = definedExternally
        var importUrl: ImportURL?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "IMPORT_IN_PROGRESS" | "IMPORT_COMPLETE" | "IMPORT_COMPLETE_WITH_ERRORS" | "IMPORT_FAILED" | "IMPORT_FAILED_SERVER_LIMIT_EXCEEDED" | "IMPORT_FAILED_RECORD_LIMIT_EXCEEDED" | "DELETE_IN_PROGRESS" | "DELETE_COMPLETE" | "DELETE_FAILED" | "DELETE_FAILED_LIMIT_EXCEEDED" | "INTERNAL_ERROR" | String */
        var importRequestTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var importCompletionTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var importDeletedTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var serverImportSuccess: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var serverImportFailure: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var applicationImportSuccess: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var applicationImportFailure: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var errorsAndFailedEntriesZip: S3PresignedUrl?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportTaskFilter {
        var name: String /* "IMPORT_TASK_ID" | "STATUS" | "NAME" | String */
        var values: ImportTaskFilterValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationsRequest {
        var configurationType: String /* "SERVER" | "PROCESS" | "CONNECTION" | "APPLICATION" | String */
        var filters: Filters?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var orderBy: OrderByList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListConfigurationsResponse {
        var configurations: Configurations?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServerNeighborsRequest {
        var configurationId: ConfigurationId
        var portInformationNeeded: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var neighborConfigurationIds: ConfigurationIdList?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListServerNeighborsResponse {
        var neighbors: NeighborDetailsList
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var knownDependencyCount: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NeighborConnectionDetail {
        var sourceServerId: ConfigurationId
        var destinationServerId: ConfigurationId
        var destinationPort: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var transportProtocol: String?
            get() = definedExternally
            set(value) = definedExternally
        var connectionsCount: Long
    }
    interface OrderByElement {
        var fieldName: String
        var sortOrder: String /* "ASC" | "DESC" | String */
    }
    interface SchemaStorageConfig {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface StartContinuousExportRequest
    interface StartContinuousExportResponse {
        var exportId: ConfigurationsExportId?
            get() = definedExternally
            set(value) = definedExternally
        var s3Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var dataSource: String /* "AGENT" | String */
        var schemaStorageConfig: SchemaStorageConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDataCollectionByAgentIdsRequest {
        var agentIds: AgentIds
    }
    interface StartDataCollectionByAgentIdsResponse {
        var agentsConfigurationStatus: AgentConfigurationStatusList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartExportTaskRequest {
        var exportDataFormat: ExportDataFormats?
            get() = definedExternally
            set(value) = definedExternally
        var filters: ExportFilters?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var endTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartExportTaskResponse {
        var exportId: ConfigurationsExportId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartImportTaskRequest {
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var name: ImportTaskName
        var importUrl: ImportURL
    }
    interface StartImportTaskResponse {
        var task: ImportTask?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopContinuousExportRequest {
        var exportId: ConfigurationsExportId
    }
    interface StopContinuousExportResponse {
        var startTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
        var stopTime: TimeStamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopDataCollectionByAgentIdsRequest {
        var agentIds: AgentIds
    }
    interface StopDataCollectionByAgentIdsResponse {
        var agentsConfigurationStatus: AgentConfigurationStatusList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey
        var value: TagValue
    }
    interface TagFilter {
        var name: FilterName
        var values: FilterValues
    }
    interface UpdateApplicationRequest {
        var configurationId: ApplicationId
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateApplicationResponse
    interface ClientApiVersions {
        var apiVersion: String /* "2015-11-01" | "latest" | String */
    }
}