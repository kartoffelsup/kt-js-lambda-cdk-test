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
import Glue.Action
import Glue.PartitionValueList
import Glue.BatchStopJobRunError
import Glue.BatchStopJobRunSuccessfulSubmission
import Glue.CatalogEntry
import Glue.CatalogTarget
import Glue.Classifier
import Glue.CodeGenNodeArg
import Glue.Column
import Glue.Condition
import Glue.Connection
import Glue.Crawl
import Glue.Crawler
import Glue.CrawlerMetrics
import Glue.CodeGenEdge
import Glue.CodeGenNode
import Glue.Database
import Glue.DevEndpoint
import Glue.DynamoDBTarget
import Glue.Edge
import Glue.TableVersion
import Glue.GlueTable
import Glue.JdbcTarget
import Glue.Job
import Glue.JobRun
import Glue.MappingEntry
import Glue.Node
import Glue.Order
import Glue.PartitionError
import Glue.PartitionInput
import Glue.Partition
import Glue.Predecessor
import Glue.PrincipalPermissions
import Glue.ResourceUri
import Glue.S3Encryption
import Glue.S3Target
import Glue.PropertyPredicate
import Glue.SecurityConfiguration
import Glue.SortCriterion
import Glue.TableError
import Glue.Table
import Glue.TableVersionError
import Glue.TaskRun
import Glue.MLTransform
import Glue.SchemaColumn
import Glue.Trigger
import Glue.UserDefinedFunction
import Glue.WorkflowRun
import Glue.Workflow
import Glue.BatchCreatePartitionRequest
import Glue.BatchCreatePartitionResponse
import Glue.BatchDeleteConnectionRequest
import Glue.BatchDeleteConnectionResponse
import Glue.BatchDeletePartitionRequest
import Glue.BatchDeletePartitionResponse
import Glue.BatchDeleteTableRequest
import Glue.BatchDeleteTableResponse
import Glue.BatchDeleteTableVersionRequest
import Glue.BatchDeleteTableVersionResponse
import Glue.BatchGetCrawlersRequest
import Glue.BatchGetCrawlersResponse
import Glue.BatchGetDevEndpointsRequest
import Glue.BatchGetDevEndpointsResponse
import Glue.BatchGetJobsRequest
import Glue.BatchGetJobsResponse
import Glue.BatchGetPartitionRequest
import Glue.BatchGetPartitionResponse
import Glue.BatchGetTriggersRequest
import Glue.BatchGetTriggersResponse
import Glue.BatchGetWorkflowsRequest
import Glue.BatchGetWorkflowsResponse
import Glue.BatchStopJobRunRequest
import Glue.BatchStopJobRunResponse
import Glue.CancelMLTaskRunRequest
import Glue.CancelMLTaskRunResponse
import Glue.CreateClassifierRequest
import Glue.CreateClassifierResponse
import Glue.CreateConnectionRequest
import Glue.CreateConnectionResponse
import Glue.CreateCrawlerRequest
import Glue.CreateCrawlerResponse
import Glue.CreateDatabaseRequest
import Glue.CreateDatabaseResponse
import Glue.CreateDevEndpointRequest
import Glue.CreateDevEndpointResponse
import Glue.CreateJobRequest
import Glue.CreateJobResponse
import Glue.CreateMLTransformRequest
import Glue.CreateMLTransformResponse
import Glue.CreatePartitionRequest
import Glue.CreatePartitionResponse
import Glue.CreateScriptRequest
import Glue.CreateScriptResponse
import Glue.CreateSecurityConfigurationRequest
import Glue.CreateSecurityConfigurationResponse
import Glue.CreateTableRequest
import Glue.CreateTableResponse
import Glue.CreateTriggerRequest
import Glue.CreateTriggerResponse
import Glue.CreateUserDefinedFunctionRequest
import Glue.CreateUserDefinedFunctionResponse
import Glue.CreateWorkflowRequest
import Glue.CreateWorkflowResponse
import Glue.DeleteClassifierRequest
import Glue.DeleteClassifierResponse
import Glue.DeleteConnectionRequest
import Glue.DeleteConnectionResponse
import Glue.DeleteCrawlerRequest
import Glue.DeleteCrawlerResponse
import Glue.DeleteDatabaseRequest
import Glue.DeleteDatabaseResponse
import Glue.DeleteDevEndpointRequest
import Glue.DeleteDevEndpointResponse
import Glue.DeleteJobRequest
import Glue.DeleteJobResponse
import Glue.DeleteMLTransformRequest
import Glue.DeleteMLTransformResponse
import Glue.DeletePartitionRequest
import Glue.DeletePartitionResponse
import Glue.DeleteResourcePolicyRequest
import Glue.DeleteResourcePolicyResponse
import Glue.DeleteSecurityConfigurationRequest
import Glue.DeleteSecurityConfigurationResponse
import Glue.DeleteTableRequest
import Glue.DeleteTableResponse
import Glue.DeleteTableVersionRequest
import Glue.DeleteTableVersionResponse
import Glue.DeleteTriggerRequest
import Glue.DeleteTriggerResponse
import Glue.DeleteUserDefinedFunctionRequest
import Glue.DeleteUserDefinedFunctionResponse
import Glue.DeleteWorkflowRequest
import Glue.DeleteWorkflowResponse
import Glue.GetCatalogImportStatusRequest
import Glue.GetCatalogImportStatusResponse
import Glue.GetClassifierRequest
import Glue.GetClassifierResponse
import Glue.GetClassifiersRequest
import Glue.GetClassifiersResponse
import Glue.GetConnectionRequest
import Glue.GetConnectionResponse
import Glue.GetConnectionsRequest
import Glue.GetConnectionsResponse
import Glue.GetCrawlerRequest
import Glue.GetCrawlerResponse
import Glue.GetCrawlerMetricsRequest
import Glue.GetCrawlerMetricsResponse
import Glue.GetCrawlersRequest
import Glue.GetCrawlersResponse
import Glue.GetDataCatalogEncryptionSettingsRequest
import Glue.GetDataCatalogEncryptionSettingsResponse
import Glue.GetDatabaseRequest
import Glue.GetDatabaseResponse
import Glue.GetDatabasesRequest
import Glue.GetDatabasesResponse
import Glue.GetDataflowGraphRequest
import Glue.GetDataflowGraphResponse
import Glue.GetDevEndpointRequest
import Glue.GetDevEndpointResponse
import Glue.GetDevEndpointsRequest
import Glue.GetDevEndpointsResponse
import Glue.GetJobRequest
import Glue.GetJobResponse
import Glue.GetJobBookmarkRequest
import Glue.GetJobBookmarkResponse
import Glue.GetJobRunRequest
import Glue.GetJobRunResponse
import Glue.GetJobRunsRequest
import Glue.GetJobRunsResponse
import Glue.GetJobsRequest
import Glue.GetJobsResponse
import Glue.GetMLTaskRunRequest
import Glue.GetMLTaskRunResponse
import Glue.GetMLTaskRunsRequest
import Glue.GetMLTaskRunsResponse
import Glue.GetMLTransformRequest
import Glue.GetMLTransformResponse
import Glue.GetMLTransformsRequest
import Glue.GetMLTransformsResponse
import Glue.GetMappingRequest
import Glue.GetMappingResponse
import Glue.GetPartitionRequest
import Glue.GetPartitionResponse
import Glue.GetPartitionsRequest
import Glue.GetPartitionsResponse
import Glue.GetPlanRequest
import Glue.GetPlanResponse
import Glue.GetResourcePolicyRequest
import Glue.GetResourcePolicyResponse
import Glue.GetSecurityConfigurationRequest
import Glue.GetSecurityConfigurationResponse
import Glue.GetSecurityConfigurationsRequest
import Glue.GetSecurityConfigurationsResponse
import Glue.GetTableRequest
import Glue.GetTableResponse
import Glue.GetTableVersionRequest
import Glue.GetTableVersionResponse
import Glue.GetTableVersionsRequest
import Glue.GetTableVersionsResponse
import Glue.GetTablesRequest
import Glue.GetTablesResponse
import Glue.GetTagsRequest
import Glue.GetTagsResponse
import Glue.GetTriggerRequest
import Glue.GetTriggerResponse
import Glue.GetTriggersRequest
import Glue.GetTriggersResponse
import Glue.GetUserDefinedFunctionRequest
import Glue.GetUserDefinedFunctionResponse
import Glue.GetUserDefinedFunctionsRequest
import Glue.GetUserDefinedFunctionsResponse
import Glue.GetWorkflowRequest
import Glue.GetWorkflowResponse
import Glue.GetWorkflowRunRequest
import Glue.GetWorkflowRunResponse
import Glue.GetWorkflowRunPropertiesRequest
import Glue.GetWorkflowRunPropertiesResponse
import Glue.GetWorkflowRunsRequest
import Glue.GetWorkflowRunsResponse
import Glue.ImportCatalogToGlueRequest
import Glue.ImportCatalogToGlueResponse
import Glue.ListCrawlersRequest
import Glue.ListCrawlersResponse
import Glue.ListDevEndpointsRequest
import Glue.ListDevEndpointsResponse
import Glue.ListJobsRequest
import Glue.ListJobsResponse
import Glue.ListMLTransformsRequest
import Glue.ListMLTransformsResponse
import Glue.ListTriggersRequest
import Glue.ListTriggersResponse
import Glue.ListWorkflowsRequest
import Glue.ListWorkflowsResponse
import Glue.PutDataCatalogEncryptionSettingsRequest
import Glue.PutDataCatalogEncryptionSettingsResponse
import Glue.PutResourcePolicyRequest
import Glue.PutResourcePolicyResponse
import Glue.PutWorkflowRunPropertiesRequest
import Glue.PutWorkflowRunPropertiesResponse
import Glue.ResetJobBookmarkRequest
import Glue.ResetJobBookmarkResponse
import Glue.SearchTablesRequest
import Glue.SearchTablesResponse
import Glue.StartCrawlerRequest
import Glue.StartCrawlerResponse
import Glue.StartCrawlerScheduleRequest
import Glue.StartCrawlerScheduleResponse
import Glue.StartExportLabelsTaskRunRequest
import Glue.StartExportLabelsTaskRunResponse
import Glue.StartImportLabelsTaskRunRequest
import Glue.StartImportLabelsTaskRunResponse
import Glue.StartJobRunRequest
import Glue.StartJobRunResponse
import Glue.StartMLEvaluationTaskRunRequest
import Glue.StartMLEvaluationTaskRunResponse
import Glue.StartMLLabelingSetGenerationTaskRunRequest
import Glue.StartMLLabelingSetGenerationTaskRunResponse
import Glue.StartTriggerRequest
import Glue.StartTriggerResponse
import Glue.StartWorkflowRunRequest
import Glue.StartWorkflowRunResponse
import Glue.StopCrawlerRequest
import Glue.StopCrawlerResponse
import Glue.StopCrawlerScheduleRequest
import Glue.StopCrawlerScheduleResponse
import Glue.StopTriggerRequest
import Glue.StopTriggerResponse
import Glue.TagResourceRequest
import Glue.TagResourceResponse
import Glue.UntagResourceRequest
import Glue.UntagResourceResponse
import Glue.UpdateClassifierRequest
import Glue.UpdateClassifierResponse
import Glue.UpdateConnectionRequest
import Glue.UpdateConnectionResponse
import Glue.UpdateCrawlerRequest
import Glue.UpdateCrawlerResponse
import Glue.UpdateCrawlerScheduleRequest
import Glue.UpdateCrawlerScheduleResponse
import Glue.UpdateDatabaseRequest
import Glue.UpdateDatabaseResponse
import Glue.UpdateDevEndpointRequest
import Glue.UpdateDevEndpointResponse
import Glue.UpdateJobRequest
import Glue.UpdateJobResponse
import Glue.UpdateMLTransformRequest
import Glue.UpdateMLTransformResponse
import Glue.UpdatePartitionRequest
import Glue.UpdatePartitionResponse
import Glue.UpdateTableRequest
import Glue.UpdateTableResponse
import Glue.UpdateTriggerRequest
import Glue.UpdateTriggerResponse
import Glue.UpdateUserDefinedFunctionRequest
import Glue.UpdateUserDefinedFunctionResponse
import Glue.UpdateWorkflowRequest
import Glue.UpdateWorkflowResponse
import Glue.GenericMap
import Glue.NotificationProperty
import Glue.ErrorByName
import Glue.ErrorDetail
import Glue.GrokClassifier
import Glue.XMLClassifier
import Glue.JsonClassifier
import Glue.CsvClassifier
import Glue.ParametersMap
import Glue.ConnectionProperties
import Glue.PhysicalConnectionRequirements
import Glue.CrawlerTargets
import Glue.SchemaChangePolicy
import Glue.Schedule
import Glue.LastCrawlInfo
import Glue.CreateGrokClassifierRequest
import Glue.CreateXMLClassifierRequest
import Glue.CreateJsonClassifierRequest
import Glue.CreateCsvClassifierRequest
import Glue.ConnectionInput
import Glue.TagsMap
import Glue.DatabaseInput
import Glue.MapValue
import Glue.ExecutionProperty
import Glue.JobCommand
import Glue.ConnectionsList
import Glue.TransformParameters
import Glue.EncryptionConfiguration
import Glue.TableInput
import Glue.Predicate
import Glue.UserDefinedFunctionInput
import Glue.WorkflowRunProperties
import Glue.EncryptionAtRest
import Glue.ConnectionPasswordEncryption
import Glue.CloudWatchEncryption
import Glue.JobBookmarksEncryption
import Glue.FindMatchesMetrics
import Glue.ConfusionMatrix
import Glue.CatalogImportStatus
import Glue.GetConnectionsFilter
import Glue.DataCatalogEncryptionSettings
import Glue.JobBookmarkEntry
import Glue.TaskRunProperties
import Glue.TaskRunFilterCriteria
import Glue.TaskRunSortCriteria
import Glue.EvaluationMetrics
import Glue.TransformFilterCriteria
import Glue.TransformSortCriteria
import Glue.Location
import Glue.Segment
import Glue.TriggerNodeDetails
import Glue.JobNodeDetails
import Glue.CrawlerNodeDetails
import Glue.StorageDescriptor
import Glue.DataLakePrincipal
import Glue.LocationMap
import Glue.SerDeInfo
import Glue.SkewedInfo
import Glue.ImportLabelsTaskRunProperties
import Glue.ExportLabelsTaskRunProperties
import Glue.LabelingSetGenerationTaskRunProperties
import Glue.FindMatchesTaskRunProperties
import Glue.FindMatchesParameters
import Glue.UpdateGrokClassifierRequest
import Glue.UpdateXMLClassifierRequest
import Glue.UpdateJsonClassifierRequest
import Glue.UpdateCsvClassifierRequest
import Glue.DevEndpointCustomLibraries
import Glue.JobUpdate
import Glue.TriggerUpdate
import Glue.WorkflowGraph
import Glue.WorkflowRunStatistics

typealias ActionList = Array<Action>

typealias AttemptCount = Number

typealias BatchDeletePartitionValueList = Array<PartitionValueList>

typealias BatchDeleteTableNameList = Array<NameString>

typealias BatchDeleteTableVersionList = Array<VersionString>

typealias BatchGetPartitionValueList = Array<PartitionValueList>

typealias BatchStopJobRunErrorList = Array<BatchStopJobRunError>

typealias BatchStopJobRunJobRunIdList = Array<IdString>

typealias BatchStopJobRunSuccessfulSubmissionList = Array<BatchStopJobRunSuccessfulSubmission>

typealias Boolean = Boolean

typealias BooleanNullable = Boolean

typealias BooleanValue = Boolean

typealias BoundedPartitionValueList = Array<ValueString>

typealias CatalogEntries = Array<CatalogEntry>

typealias CatalogIdString = String

typealias CatalogTablesList = Array<NameString>

typealias CatalogTargetList = Array<CatalogTarget>

typealias Classification = String

typealias ClassifierList = Array<Classifier>

typealias ClassifierNameList = Array<NameString>

typealias CodeGenArgName = String

typealias CodeGenArgValue = String

typealias CodeGenIdentifier = String

typealias CodeGenNodeArgs = Array<CodeGenNodeArg>

typealias CodeGenNodeType = String

typealias ColumnList = Array<Column>

typealias ColumnNameString = String

typealias ColumnTypeString = String

typealias ColumnValueStringList = Array<ColumnValuesString>

typealias ColumnValuesString = String

typealias CommentString = String

typealias ConditionList = Array<Condition>

typealias ConnectionList = Array<Connection>

typealias ConnectionName = String

typealias CrawlList = Array<Crawl>

typealias CrawlerConfiguration = String

typealias CrawlerList = Array<Crawler>

typealias CrawlerMetricsList = Array<CrawlerMetrics>

typealias CrawlerNameList = Array<NameString>

typealias CrawlerSecurityConfiguration = String

typealias CronExpression = String

typealias CsvColumnDelimiter = String

typealias CsvHeader = Array<NameString>

typealias CsvQuoteSymbol = String

typealias CustomPatterns = String

typealias DagEdges = Array<CodeGenEdge>

typealias DagNodes = Array<CodeGenNode>

typealias DataLakePrincipalString = String

typealias DatabaseList = Array<Database>

typealias DatabaseName = String

typealias DeleteConnectionNameList = Array<NameString>

typealias DescriptionString = String

typealias DescriptionStringRemovable = String

typealias DevEndpointList = Array<DevEndpoint>

typealias DevEndpointNameList = Array<NameString>

typealias DevEndpointNames = Array<GenericString>

typealias DynamoDBTargetList = Array<DynamoDBTarget>

typealias EdgeList = Array<Edge>

typealias ErrorString = String

typealias ExecutionTime = Number

typealias FieldType = String

typealias FilterString = String

typealias FormatString = String

typealias GenericBoundedDouble = Number

typealias GenericString = String

typealias GetTableVersionsList = Array<TableVersion>

typealias GlueResourceArn = String

typealias GlueTables = Array<GlueTable>

typealias GlueVersionString = String

typealias GrokPattern = String

typealias HashString = String

typealias IdString = String

typealias Integer = Number

typealias IntegerFlag = Number

typealias IntegerValue = Number

typealias JdbcTargetList = Array<JdbcTarget>

typealias JobList = Array<Job>

typealias JobName = String

typealias JobNameList = Array<NameString>

typealias JobRunList = Array<JobRun>

typealias JsonPath = String

typealias JsonValue = String

typealias KeyString = String

typealias KmsKeyArn = String

typealias LabelCount = Number

typealias LocationString = String

typealias LogGroup = String

typealias LogStream = String

typealias MappingList = Array<MappingEntry>

typealias MatchCriteria = Array<NameString>

typealias MaxConcurrentRuns = Number

typealias MaxRetries = Number

typealias MessagePrefix = String

typealias MillisecondsCount = Number

typealias NameString = String

typealias NameStringList = Array<NameString>

typealias NodeList = Array<Node>

typealias NonNegativeDouble = Number

typealias NonNegativeInteger = Number

typealias NotifyDelayAfter = Number

typealias NullableBoolean = Boolean

typealias NullableDouble = Number

typealias NullableInteger = Number

typealias OrchestrationStringList = Array<GenericString>

typealias OrderList = Array<Order>

typealias PageSize = Number

typealias PaginationToken = String

typealias ParametersMapValue = String

typealias PartitionErrors = Array<PartitionError>

typealias PartitionInputList = Array<PartitionInput>

typealias PartitionList = Array<Partition>

typealias Path = String

typealias PathList = Array<Path>

typealias PermissionList = Array<String /* "ALL" | "SELECT" | "ALTER" | "DROP" | "DELETE" | "INSERT" | "CREATE_DATABASE" | "CREATE_TABLE" | "DATA_LOCATION_ACCESS" | String */>

typealias PolicyJsonString = String

typealias PredecessorList = Array<Predecessor>

typealias PredicateString = String

typealias PrincipalPermissionsList = Array<PrincipalPermissions>

typealias PublicKeysList = Array<GenericString>

typealias PythonScript = String

typealias PythonVersionString = String

typealias RecordsCount = Number

typealias ReplaceBoolean = Boolean

typealias ResourceUriList = Array<ResourceUri>

typealias Role = String

typealias RoleArn = String

typealias RoleString = String

typealias RowTag = String

typealias RunId = String

typealias S3EncryptionList = Array<S3Encryption>

typealias S3TargetList = Array<S3Target>

typealias ScalaCode = String

typealias SchemaPathString = String

typealias ScriptLocationString = String

typealias SearchPropertyPredicates = Array<PropertyPredicate>

typealias SecurityConfigurationList = Array<SecurityConfiguration>

typealias SecurityGroupIdList = Array<NameString>

typealias SortCriteria = Array<SortCriterion>

typealias StringList = Array<GenericString>

typealias TableErrors = Array<TableError>

typealias TableList = Array<Table>

typealias TableName = String

typealias TablePrefix = String

typealias TableTypeString = String

typealias TableVersionErrors = Array<TableVersionError>

typealias TagKey = String

typealias TagKeysList = Array<TagKey>

typealias TagValue = String

typealias TaskRunList = Array<TaskRun>

typealias Timeout = Number

typealias Timestamp = Date

typealias TimestampValue = Date

typealias Token = String

typealias TotalSegmentsInteger = Number

typealias TransformIdList = Array<HashString>

typealias TransformList = Array<MLTransform>

typealias TransformSchema = Array<SchemaColumn>

typealias TriggerList = Array<Trigger>

typealias TriggerNameList = Array<NameString>

typealias URI = String

typealias UriString = String

typealias UserDefinedFunctionList = Array<UserDefinedFunction>

typealias ValueString = String

typealias ValueStringList = Array<ValueString>

typealias VersionId = Number

typealias VersionString = String

typealias ViewTextString = String

typealias WorkflowNames = Array<NameString>

typealias WorkflowRuns = Array<WorkflowRun>

typealias Workflows = Array<Workflow>

@JsModule("aws-sdk")
external open class Glue(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Glue.Types.ClientConfiguration */
    open fun batchCreatePartition(params: BatchCreatePartitionRequest, callback: (err: AWSError, data: BatchCreatePartitionResponse) -> Unit = definedExternally): Request<BatchCreatePartitionResponse, AWSError>
    open fun batchCreatePartition(callback: (err: AWSError, data: BatchCreatePartitionResponse) -> Unit = definedExternally): Request<BatchCreatePartitionResponse, AWSError>
    open fun batchDeleteConnection(params: BatchDeleteConnectionRequest, callback: (err: AWSError, data: BatchDeleteConnectionResponse) -> Unit = definedExternally): Request<BatchDeleteConnectionResponse, AWSError>
    open fun batchDeleteConnection(callback: (err: AWSError, data: BatchDeleteConnectionResponse) -> Unit = definedExternally): Request<BatchDeleteConnectionResponse, AWSError>
    open fun batchDeletePartition(params: BatchDeletePartitionRequest, callback: (err: AWSError, data: BatchDeletePartitionResponse) -> Unit = definedExternally): Request<BatchDeletePartitionResponse, AWSError>
    open fun batchDeletePartition(callback: (err: AWSError, data: BatchDeletePartitionResponse) -> Unit = definedExternally): Request<BatchDeletePartitionResponse, AWSError>
    open fun batchDeleteTable(params: BatchDeleteTableRequest, callback: (err: AWSError, data: BatchDeleteTableResponse) -> Unit = definedExternally): Request<BatchDeleteTableResponse, AWSError>
    open fun batchDeleteTable(callback: (err: AWSError, data: BatchDeleteTableResponse) -> Unit = definedExternally): Request<BatchDeleteTableResponse, AWSError>
    open fun batchDeleteTableVersion(params: BatchDeleteTableVersionRequest, callback: (err: AWSError, data: BatchDeleteTableVersionResponse) -> Unit = definedExternally): Request<BatchDeleteTableVersionResponse, AWSError>
    open fun batchDeleteTableVersion(callback: (err: AWSError, data: BatchDeleteTableVersionResponse) -> Unit = definedExternally): Request<BatchDeleteTableVersionResponse, AWSError>
    open fun batchGetCrawlers(params: BatchGetCrawlersRequest, callback: (err: AWSError, data: BatchGetCrawlersResponse) -> Unit = definedExternally): Request<BatchGetCrawlersResponse, AWSError>
    open fun batchGetCrawlers(callback: (err: AWSError, data: BatchGetCrawlersResponse) -> Unit = definedExternally): Request<BatchGetCrawlersResponse, AWSError>
    open fun batchGetDevEndpoints(params: BatchGetDevEndpointsRequest, callback: (err: AWSError, data: BatchGetDevEndpointsResponse) -> Unit = definedExternally): Request<BatchGetDevEndpointsResponse, AWSError>
    open fun batchGetDevEndpoints(callback: (err: AWSError, data: BatchGetDevEndpointsResponse) -> Unit = definedExternally): Request<BatchGetDevEndpointsResponse, AWSError>
    open fun batchGetJobs(params: BatchGetJobsRequest, callback: (err: AWSError, data: BatchGetJobsResponse) -> Unit = definedExternally): Request<BatchGetJobsResponse, AWSError>
    open fun batchGetJobs(callback: (err: AWSError, data: BatchGetJobsResponse) -> Unit = definedExternally): Request<BatchGetJobsResponse, AWSError>
    open fun batchGetPartition(params: BatchGetPartitionRequest, callback: (err: AWSError, data: BatchGetPartitionResponse) -> Unit = definedExternally): Request<BatchGetPartitionResponse, AWSError>
    open fun batchGetPartition(callback: (err: AWSError, data: BatchGetPartitionResponse) -> Unit = definedExternally): Request<BatchGetPartitionResponse, AWSError>
    open fun batchGetTriggers(params: BatchGetTriggersRequest, callback: (err: AWSError, data: BatchGetTriggersResponse) -> Unit = definedExternally): Request<BatchGetTriggersResponse, AWSError>
    open fun batchGetTriggers(callback: (err: AWSError, data: BatchGetTriggersResponse) -> Unit = definedExternally): Request<BatchGetTriggersResponse, AWSError>
    open fun batchGetWorkflows(params: BatchGetWorkflowsRequest, callback: (err: AWSError, data: BatchGetWorkflowsResponse) -> Unit = definedExternally): Request<BatchGetWorkflowsResponse, AWSError>
    open fun batchGetWorkflows(callback: (err: AWSError, data: BatchGetWorkflowsResponse) -> Unit = definedExternally): Request<BatchGetWorkflowsResponse, AWSError>
    open fun batchStopJobRun(params: BatchStopJobRunRequest, callback: (err: AWSError, data: BatchStopJobRunResponse) -> Unit = definedExternally): Request<BatchStopJobRunResponse, AWSError>
    open fun batchStopJobRun(callback: (err: AWSError, data: BatchStopJobRunResponse) -> Unit = definedExternally): Request<BatchStopJobRunResponse, AWSError>
    open fun cancelMLTaskRun(params: CancelMLTaskRunRequest, callback: (err: AWSError, data: CancelMLTaskRunResponse) -> Unit = definedExternally): Request<CancelMLTaskRunResponse, AWSError>
    open fun cancelMLTaskRun(callback: (err: AWSError, data: CancelMLTaskRunResponse) -> Unit = definedExternally): Request<CancelMLTaskRunResponse, AWSError>
    open fun createClassifier(params: CreateClassifierRequest, callback: (err: AWSError, data: CreateClassifierResponse) -> Unit = definedExternally): Request<CreateClassifierResponse, AWSError>
    open fun createClassifier(callback: (err: AWSError, data: CreateClassifierResponse) -> Unit = definedExternally): Request<CreateClassifierResponse, AWSError>
    open fun createConnection(params: CreateConnectionRequest, callback: (err: AWSError, data: CreateConnectionResponse) -> Unit = definedExternally): Request<CreateConnectionResponse, AWSError>
    open fun createConnection(callback: (err: AWSError, data: CreateConnectionResponse) -> Unit = definedExternally): Request<CreateConnectionResponse, AWSError>
    open fun createCrawler(params: CreateCrawlerRequest, callback: (err: AWSError, data: CreateCrawlerResponse) -> Unit = definedExternally): Request<CreateCrawlerResponse, AWSError>
    open fun createCrawler(callback: (err: AWSError, data: CreateCrawlerResponse) -> Unit = definedExternally): Request<CreateCrawlerResponse, AWSError>
    open fun createDatabase(params: CreateDatabaseRequest, callback: (err: AWSError, data: CreateDatabaseResponse) -> Unit = definedExternally): Request<CreateDatabaseResponse, AWSError>
    open fun createDatabase(callback: (err: AWSError, data: CreateDatabaseResponse) -> Unit = definedExternally): Request<CreateDatabaseResponse, AWSError>
    open fun createDevEndpoint(params: CreateDevEndpointRequest, callback: (err: AWSError, data: CreateDevEndpointResponse) -> Unit = definedExternally): Request<CreateDevEndpointResponse, AWSError>
    open fun createDevEndpoint(callback: (err: AWSError, data: CreateDevEndpointResponse) -> Unit = definedExternally): Request<CreateDevEndpointResponse, AWSError>
    open fun createJob(params: CreateJobRequest, callback: (err: AWSError, data: CreateJobResponse) -> Unit = definedExternally): Request<CreateJobResponse, AWSError>
    open fun createJob(callback: (err: AWSError, data: CreateJobResponse) -> Unit = definedExternally): Request<CreateJobResponse, AWSError>
    open fun createMLTransform(params: CreateMLTransformRequest, callback: (err: AWSError, data: CreateMLTransformResponse) -> Unit = definedExternally): Request<CreateMLTransformResponse, AWSError>
    open fun createMLTransform(callback: (err: AWSError, data: CreateMLTransformResponse) -> Unit = definedExternally): Request<CreateMLTransformResponse, AWSError>
    open fun createPartition(params: CreatePartitionRequest, callback: (err: AWSError, data: CreatePartitionResponse) -> Unit = definedExternally): Request<CreatePartitionResponse, AWSError>
    open fun createPartition(callback: (err: AWSError, data: CreatePartitionResponse) -> Unit = definedExternally): Request<CreatePartitionResponse, AWSError>
    open fun createScript(params: CreateScriptRequest, callback: (err: AWSError, data: CreateScriptResponse) -> Unit = definedExternally): Request<CreateScriptResponse, AWSError>
    open fun createScript(callback: (err: AWSError, data: CreateScriptResponse) -> Unit = definedExternally): Request<CreateScriptResponse, AWSError>
    open fun createSecurityConfiguration(params: CreateSecurityConfigurationRequest, callback: (err: AWSError, data: CreateSecurityConfigurationResponse) -> Unit = definedExternally): Request<CreateSecurityConfigurationResponse, AWSError>
    open fun createSecurityConfiguration(callback: (err: AWSError, data: CreateSecurityConfigurationResponse) -> Unit = definedExternally): Request<CreateSecurityConfigurationResponse, AWSError>
    open fun createTable(params: CreateTableRequest, callback: (err: AWSError, data: CreateTableResponse) -> Unit = definedExternally): Request<CreateTableResponse, AWSError>
    open fun createTable(callback: (err: AWSError, data: CreateTableResponse) -> Unit = definedExternally): Request<CreateTableResponse, AWSError>
    open fun createTrigger(params: CreateTriggerRequest, callback: (err: AWSError, data: CreateTriggerResponse) -> Unit = definedExternally): Request<CreateTriggerResponse, AWSError>
    open fun createTrigger(callback: (err: AWSError, data: CreateTriggerResponse) -> Unit = definedExternally): Request<CreateTriggerResponse, AWSError>
    open fun createUserDefinedFunction(params: CreateUserDefinedFunctionRequest, callback: (err: AWSError, data: CreateUserDefinedFunctionResponse) -> Unit = definedExternally): Request<CreateUserDefinedFunctionResponse, AWSError>
    open fun createUserDefinedFunction(callback: (err: AWSError, data: CreateUserDefinedFunctionResponse) -> Unit = definedExternally): Request<CreateUserDefinedFunctionResponse, AWSError>
    open fun createWorkflow(params: CreateWorkflowRequest, callback: (err: AWSError, data: CreateWorkflowResponse) -> Unit = definedExternally): Request<CreateWorkflowResponse, AWSError>
    open fun createWorkflow(callback: (err: AWSError, data: CreateWorkflowResponse) -> Unit = definedExternally): Request<CreateWorkflowResponse, AWSError>
    open fun deleteClassifier(params: DeleteClassifierRequest, callback: (err: AWSError, data: DeleteClassifierResponse) -> Unit = definedExternally): Request<DeleteClassifierResponse, AWSError>
    open fun deleteClassifier(callback: (err: AWSError, data: DeleteClassifierResponse) -> Unit = definedExternally): Request<DeleteClassifierResponse, AWSError>
    open fun deleteConnection(params: DeleteConnectionRequest, callback: (err: AWSError, data: DeleteConnectionResponse) -> Unit = definedExternally): Request<DeleteConnectionResponse, AWSError>
    open fun deleteConnection(callback: (err: AWSError, data: DeleteConnectionResponse) -> Unit = definedExternally): Request<DeleteConnectionResponse, AWSError>
    open fun deleteCrawler(params: DeleteCrawlerRequest, callback: (err: AWSError, data: DeleteCrawlerResponse) -> Unit = definedExternally): Request<DeleteCrawlerResponse, AWSError>
    open fun deleteCrawler(callback: (err: AWSError, data: DeleteCrawlerResponse) -> Unit = definedExternally): Request<DeleteCrawlerResponse, AWSError>
    open fun deleteDatabase(params: DeleteDatabaseRequest, callback: (err: AWSError, data: DeleteDatabaseResponse) -> Unit = definedExternally): Request<DeleteDatabaseResponse, AWSError>
    open fun deleteDatabase(callback: (err: AWSError, data: DeleteDatabaseResponse) -> Unit = definedExternally): Request<DeleteDatabaseResponse, AWSError>
    open fun deleteDevEndpoint(params: DeleteDevEndpointRequest, callback: (err: AWSError, data: DeleteDevEndpointResponse) -> Unit = definedExternally): Request<DeleteDevEndpointResponse, AWSError>
    open fun deleteDevEndpoint(callback: (err: AWSError, data: DeleteDevEndpointResponse) -> Unit = definedExternally): Request<DeleteDevEndpointResponse, AWSError>
    open fun deleteJob(params: DeleteJobRequest, callback: (err: AWSError, data: DeleteJobResponse) -> Unit = definedExternally): Request<DeleteJobResponse, AWSError>
    open fun deleteJob(callback: (err: AWSError, data: DeleteJobResponse) -> Unit = definedExternally): Request<DeleteJobResponse, AWSError>
    open fun deleteMLTransform(params: DeleteMLTransformRequest, callback: (err: AWSError, data: DeleteMLTransformResponse) -> Unit = definedExternally): Request<DeleteMLTransformResponse, AWSError>
    open fun deleteMLTransform(callback: (err: AWSError, data: DeleteMLTransformResponse) -> Unit = definedExternally): Request<DeleteMLTransformResponse, AWSError>
    open fun deletePartition(params: DeletePartitionRequest, callback: (err: AWSError, data: DeletePartitionResponse) -> Unit = definedExternally): Request<DeletePartitionResponse, AWSError>
    open fun deletePartition(callback: (err: AWSError, data: DeletePartitionResponse) -> Unit = definedExternally): Request<DeletePartitionResponse, AWSError>
    open fun deleteResourcePolicy(params: DeleteResourcePolicyRequest, callback: (err: AWSError, data: DeleteResourcePolicyResponse) -> Unit = definedExternally): Request<DeleteResourcePolicyResponse, AWSError>
    open fun deleteResourcePolicy(callback: (err: AWSError, data: DeleteResourcePolicyResponse) -> Unit = definedExternally): Request<DeleteResourcePolicyResponse, AWSError>
    open fun deleteSecurityConfiguration(params: DeleteSecurityConfigurationRequest, callback: (err: AWSError, data: DeleteSecurityConfigurationResponse) -> Unit = definedExternally): Request<DeleteSecurityConfigurationResponse, AWSError>
    open fun deleteSecurityConfiguration(callback: (err: AWSError, data: DeleteSecurityConfigurationResponse) -> Unit = definedExternally): Request<DeleteSecurityConfigurationResponse, AWSError>
    open fun deleteTable(params: DeleteTableRequest, callback: (err: AWSError, data: DeleteTableResponse) -> Unit = definedExternally): Request<DeleteTableResponse, AWSError>
    open fun deleteTable(callback: (err: AWSError, data: DeleteTableResponse) -> Unit = definedExternally): Request<DeleteTableResponse, AWSError>
    open fun deleteTableVersion(params: DeleteTableVersionRequest, callback: (err: AWSError, data: DeleteTableVersionResponse) -> Unit = definedExternally): Request<DeleteTableVersionResponse, AWSError>
    open fun deleteTableVersion(callback: (err: AWSError, data: DeleteTableVersionResponse) -> Unit = definedExternally): Request<DeleteTableVersionResponse, AWSError>
    open fun deleteTrigger(params: DeleteTriggerRequest, callback: (err: AWSError, data: DeleteTriggerResponse) -> Unit = definedExternally): Request<DeleteTriggerResponse, AWSError>
    open fun deleteTrigger(callback: (err: AWSError, data: DeleteTriggerResponse) -> Unit = definedExternally): Request<DeleteTriggerResponse, AWSError>
    open fun deleteUserDefinedFunction(params: DeleteUserDefinedFunctionRequest, callback: (err: AWSError, data: DeleteUserDefinedFunctionResponse) -> Unit = definedExternally): Request<DeleteUserDefinedFunctionResponse, AWSError>
    open fun deleteUserDefinedFunction(callback: (err: AWSError, data: DeleteUserDefinedFunctionResponse) -> Unit = definedExternally): Request<DeleteUserDefinedFunctionResponse, AWSError>
    open fun deleteWorkflow(params: DeleteWorkflowRequest, callback: (err: AWSError, data: DeleteWorkflowResponse) -> Unit = definedExternally): Request<DeleteWorkflowResponse, AWSError>
    open fun deleteWorkflow(callback: (err: AWSError, data: DeleteWorkflowResponse) -> Unit = definedExternally): Request<DeleteWorkflowResponse, AWSError>
    open fun getCatalogImportStatus(params: GetCatalogImportStatusRequest, callback: (err: AWSError, data: GetCatalogImportStatusResponse) -> Unit = definedExternally): Request<GetCatalogImportStatusResponse, AWSError>
    open fun getCatalogImportStatus(callback: (err: AWSError, data: GetCatalogImportStatusResponse) -> Unit = definedExternally): Request<GetCatalogImportStatusResponse, AWSError>
    open fun getClassifier(params: GetClassifierRequest, callback: (err: AWSError, data: GetClassifierResponse) -> Unit = definedExternally): Request<GetClassifierResponse, AWSError>
    open fun getClassifier(callback: (err: AWSError, data: GetClassifierResponse) -> Unit = definedExternally): Request<GetClassifierResponse, AWSError>
    open fun getClassifiers(params: GetClassifiersRequest, callback: (err: AWSError, data: GetClassifiersResponse) -> Unit = definedExternally): Request<GetClassifiersResponse, AWSError>
    open fun getClassifiers(callback: (err: AWSError, data: GetClassifiersResponse) -> Unit = definedExternally): Request<GetClassifiersResponse, AWSError>
    open fun getConnection(params: GetConnectionRequest, callback: (err: AWSError, data: GetConnectionResponse) -> Unit = definedExternally): Request<GetConnectionResponse, AWSError>
    open fun getConnection(callback: (err: AWSError, data: GetConnectionResponse) -> Unit = definedExternally): Request<GetConnectionResponse, AWSError>
    open fun getConnections(params: GetConnectionsRequest, callback: (err: AWSError, data: GetConnectionsResponse) -> Unit = definedExternally): Request<GetConnectionsResponse, AWSError>
    open fun getConnections(callback: (err: AWSError, data: GetConnectionsResponse) -> Unit = definedExternally): Request<GetConnectionsResponse, AWSError>
    open fun getCrawler(params: GetCrawlerRequest, callback: (err: AWSError, data: GetCrawlerResponse) -> Unit = definedExternally): Request<GetCrawlerResponse, AWSError>
    open fun getCrawler(callback: (err: AWSError, data: GetCrawlerResponse) -> Unit = definedExternally): Request<GetCrawlerResponse, AWSError>
    open fun getCrawlerMetrics(params: GetCrawlerMetricsRequest, callback: (err: AWSError, data: GetCrawlerMetricsResponse) -> Unit = definedExternally): Request<GetCrawlerMetricsResponse, AWSError>
    open fun getCrawlerMetrics(callback: (err: AWSError, data: GetCrawlerMetricsResponse) -> Unit = definedExternally): Request<GetCrawlerMetricsResponse, AWSError>
    open fun getCrawlers(params: GetCrawlersRequest, callback: (err: AWSError, data: GetCrawlersResponse) -> Unit = definedExternally): Request<GetCrawlersResponse, AWSError>
    open fun getCrawlers(callback: (err: AWSError, data: GetCrawlersResponse) -> Unit = definedExternally): Request<GetCrawlersResponse, AWSError>
    open fun getDataCatalogEncryptionSettings(params: GetDataCatalogEncryptionSettingsRequest, callback: (err: AWSError, data: GetDataCatalogEncryptionSettingsResponse) -> Unit = definedExternally): Request<GetDataCatalogEncryptionSettingsResponse, AWSError>
    open fun getDataCatalogEncryptionSettings(callback: (err: AWSError, data: GetDataCatalogEncryptionSettingsResponse) -> Unit = definedExternally): Request<GetDataCatalogEncryptionSettingsResponse, AWSError>
    open fun getDatabase(params: GetDatabaseRequest, callback: (err: AWSError, data: GetDatabaseResponse) -> Unit = definedExternally): Request<GetDatabaseResponse, AWSError>
    open fun getDatabase(callback: (err: AWSError, data: GetDatabaseResponse) -> Unit = definedExternally): Request<GetDatabaseResponse, AWSError>
    open fun getDatabases(params: GetDatabasesRequest, callback: (err: AWSError, data: GetDatabasesResponse) -> Unit = definedExternally): Request<GetDatabasesResponse, AWSError>
    open fun getDatabases(callback: (err: AWSError, data: GetDatabasesResponse) -> Unit = definedExternally): Request<GetDatabasesResponse, AWSError>
    open fun getDataflowGraph(params: GetDataflowGraphRequest, callback: (err: AWSError, data: GetDataflowGraphResponse) -> Unit = definedExternally): Request<GetDataflowGraphResponse, AWSError>
    open fun getDataflowGraph(callback: (err: AWSError, data: GetDataflowGraphResponse) -> Unit = definedExternally): Request<GetDataflowGraphResponse, AWSError>
    open fun getDevEndpoint(params: GetDevEndpointRequest, callback: (err: AWSError, data: GetDevEndpointResponse) -> Unit = definedExternally): Request<GetDevEndpointResponse, AWSError>
    open fun getDevEndpoint(callback: (err: AWSError, data: GetDevEndpointResponse) -> Unit = definedExternally): Request<GetDevEndpointResponse, AWSError>
    open fun getDevEndpoints(params: GetDevEndpointsRequest, callback: (err: AWSError, data: GetDevEndpointsResponse) -> Unit = definedExternally): Request<GetDevEndpointsResponse, AWSError>
    open fun getDevEndpoints(callback: (err: AWSError, data: GetDevEndpointsResponse) -> Unit = definedExternally): Request<GetDevEndpointsResponse, AWSError>
    open fun getJob(params: GetJobRequest, callback: (err: AWSError, data: GetJobResponse) -> Unit = definedExternally): Request<GetJobResponse, AWSError>
    open fun getJob(callback: (err: AWSError, data: GetJobResponse) -> Unit = definedExternally): Request<GetJobResponse, AWSError>
    open fun getJobBookmark(params: GetJobBookmarkRequest, callback: (err: AWSError, data: GetJobBookmarkResponse) -> Unit = definedExternally): Request<GetJobBookmarkResponse, AWSError>
    open fun getJobBookmark(callback: (err: AWSError, data: GetJobBookmarkResponse) -> Unit = definedExternally): Request<GetJobBookmarkResponse, AWSError>
    open fun getJobRun(params: GetJobRunRequest, callback: (err: AWSError, data: GetJobRunResponse) -> Unit = definedExternally): Request<GetJobRunResponse, AWSError>
    open fun getJobRun(callback: (err: AWSError, data: GetJobRunResponse) -> Unit = definedExternally): Request<GetJobRunResponse, AWSError>
    open fun getJobRuns(params: GetJobRunsRequest, callback: (err: AWSError, data: GetJobRunsResponse) -> Unit = definedExternally): Request<GetJobRunsResponse, AWSError>
    open fun getJobRuns(callback: (err: AWSError, data: GetJobRunsResponse) -> Unit = definedExternally): Request<GetJobRunsResponse, AWSError>
    open fun getJobs(params: GetJobsRequest, callback: (err: AWSError, data: GetJobsResponse) -> Unit = definedExternally): Request<GetJobsResponse, AWSError>
    open fun getJobs(callback: (err: AWSError, data: GetJobsResponse) -> Unit = definedExternally): Request<GetJobsResponse, AWSError>
    open fun getMLTaskRun(params: GetMLTaskRunRequest, callback: (err: AWSError, data: GetMLTaskRunResponse) -> Unit = definedExternally): Request<GetMLTaskRunResponse, AWSError>
    open fun getMLTaskRun(callback: (err: AWSError, data: GetMLTaskRunResponse) -> Unit = definedExternally): Request<GetMLTaskRunResponse, AWSError>
    open fun getMLTaskRuns(params: GetMLTaskRunsRequest, callback: (err: AWSError, data: GetMLTaskRunsResponse) -> Unit = definedExternally): Request<GetMLTaskRunsResponse, AWSError>
    open fun getMLTaskRuns(callback: (err: AWSError, data: GetMLTaskRunsResponse) -> Unit = definedExternally): Request<GetMLTaskRunsResponse, AWSError>
    open fun getMLTransform(params: GetMLTransformRequest, callback: (err: AWSError, data: GetMLTransformResponse) -> Unit = definedExternally): Request<GetMLTransformResponse, AWSError>
    open fun getMLTransform(callback: (err: AWSError, data: GetMLTransformResponse) -> Unit = definedExternally): Request<GetMLTransformResponse, AWSError>
    open fun getMLTransforms(params: GetMLTransformsRequest, callback: (err: AWSError, data: GetMLTransformsResponse) -> Unit = definedExternally): Request<GetMLTransformsResponse, AWSError>
    open fun getMLTransforms(callback: (err: AWSError, data: GetMLTransformsResponse) -> Unit = definedExternally): Request<GetMLTransformsResponse, AWSError>
    open fun getMapping(params: GetMappingRequest, callback: (err: AWSError, data: GetMappingResponse) -> Unit = definedExternally): Request<GetMappingResponse, AWSError>
    open fun getMapping(callback: (err: AWSError, data: GetMappingResponse) -> Unit = definedExternally): Request<GetMappingResponse, AWSError>
    open fun getPartition(params: GetPartitionRequest, callback: (err: AWSError, data: GetPartitionResponse) -> Unit = definedExternally): Request<GetPartitionResponse, AWSError>
    open fun getPartition(callback: (err: AWSError, data: GetPartitionResponse) -> Unit = definedExternally): Request<GetPartitionResponse, AWSError>
    open fun getPartitions(params: GetPartitionsRequest, callback: (err: AWSError, data: GetPartitionsResponse) -> Unit = definedExternally): Request<GetPartitionsResponse, AWSError>
    open fun getPartitions(callback: (err: AWSError, data: GetPartitionsResponse) -> Unit = definedExternally): Request<GetPartitionsResponse, AWSError>
    open fun getPlan(params: GetPlanRequest, callback: (err: AWSError, data: GetPlanResponse) -> Unit = definedExternally): Request<GetPlanResponse, AWSError>
    open fun getPlan(callback: (err: AWSError, data: GetPlanResponse) -> Unit = definedExternally): Request<GetPlanResponse, AWSError>
    open fun getResourcePolicy(params: GetResourcePolicyRequest, callback: (err: AWSError, data: GetResourcePolicyResponse) -> Unit = definedExternally): Request<GetResourcePolicyResponse, AWSError>
    open fun getResourcePolicy(callback: (err: AWSError, data: GetResourcePolicyResponse) -> Unit = definedExternally): Request<GetResourcePolicyResponse, AWSError>
    open fun getSecurityConfiguration(params: GetSecurityConfigurationRequest, callback: (err: AWSError, data: GetSecurityConfigurationResponse) -> Unit = definedExternally): Request<GetSecurityConfigurationResponse, AWSError>
    open fun getSecurityConfiguration(callback: (err: AWSError, data: GetSecurityConfigurationResponse) -> Unit = definedExternally): Request<GetSecurityConfigurationResponse, AWSError>
    open fun getSecurityConfigurations(params: GetSecurityConfigurationsRequest, callback: (err: AWSError, data: GetSecurityConfigurationsResponse) -> Unit = definedExternally): Request<GetSecurityConfigurationsResponse, AWSError>
    open fun getSecurityConfigurations(callback: (err: AWSError, data: GetSecurityConfigurationsResponse) -> Unit = definedExternally): Request<GetSecurityConfigurationsResponse, AWSError>
    open fun getTable(params: GetTableRequest, callback: (err: AWSError, data: GetTableResponse) -> Unit = definedExternally): Request<GetTableResponse, AWSError>
    open fun getTable(callback: (err: AWSError, data: GetTableResponse) -> Unit = definedExternally): Request<GetTableResponse, AWSError>
    open fun getTableVersion(params: GetTableVersionRequest, callback: (err: AWSError, data: GetTableVersionResponse) -> Unit = definedExternally): Request<GetTableVersionResponse, AWSError>
    open fun getTableVersion(callback: (err: AWSError, data: GetTableVersionResponse) -> Unit = definedExternally): Request<GetTableVersionResponse, AWSError>
    open fun getTableVersions(params: GetTableVersionsRequest, callback: (err: AWSError, data: GetTableVersionsResponse) -> Unit = definedExternally): Request<GetTableVersionsResponse, AWSError>
    open fun getTableVersions(callback: (err: AWSError, data: GetTableVersionsResponse) -> Unit = definedExternally): Request<GetTableVersionsResponse, AWSError>
    open fun getTables(params: GetTablesRequest, callback: (err: AWSError, data: GetTablesResponse) -> Unit = definedExternally): Request<GetTablesResponse, AWSError>
    open fun getTables(callback: (err: AWSError, data: GetTablesResponse) -> Unit = definedExternally): Request<GetTablesResponse, AWSError>
    open fun getTags(params: GetTagsRequest, callback: (err: AWSError, data: GetTagsResponse) -> Unit = definedExternally): Request<GetTagsResponse, AWSError>
    open fun getTags(callback: (err: AWSError, data: GetTagsResponse) -> Unit = definedExternally): Request<GetTagsResponse, AWSError>
    open fun getTrigger(params: GetTriggerRequest, callback: (err: AWSError, data: GetTriggerResponse) -> Unit = definedExternally): Request<GetTriggerResponse, AWSError>
    open fun getTrigger(callback: (err: AWSError, data: GetTriggerResponse) -> Unit = definedExternally): Request<GetTriggerResponse, AWSError>
    open fun getTriggers(params: GetTriggersRequest, callback: (err: AWSError, data: GetTriggersResponse) -> Unit = definedExternally): Request<GetTriggersResponse, AWSError>
    open fun getTriggers(callback: (err: AWSError, data: GetTriggersResponse) -> Unit = definedExternally): Request<GetTriggersResponse, AWSError>
    open fun getUserDefinedFunction(params: GetUserDefinedFunctionRequest, callback: (err: AWSError, data: GetUserDefinedFunctionResponse) -> Unit = definedExternally): Request<GetUserDefinedFunctionResponse, AWSError>
    open fun getUserDefinedFunction(callback: (err: AWSError, data: GetUserDefinedFunctionResponse) -> Unit = definedExternally): Request<GetUserDefinedFunctionResponse, AWSError>
    open fun getUserDefinedFunctions(params: GetUserDefinedFunctionsRequest, callback: (err: AWSError, data: GetUserDefinedFunctionsResponse) -> Unit = definedExternally): Request<GetUserDefinedFunctionsResponse, AWSError>
    open fun getUserDefinedFunctions(callback: (err: AWSError, data: GetUserDefinedFunctionsResponse) -> Unit = definedExternally): Request<GetUserDefinedFunctionsResponse, AWSError>
    open fun getWorkflow(params: GetWorkflowRequest, callback: (err: AWSError, data: GetWorkflowResponse) -> Unit = definedExternally): Request<GetWorkflowResponse, AWSError>
    open fun getWorkflow(callback: (err: AWSError, data: GetWorkflowResponse) -> Unit = definedExternally): Request<GetWorkflowResponse, AWSError>
    open fun getWorkflowRun(params: GetWorkflowRunRequest, callback: (err: AWSError, data: GetWorkflowRunResponse) -> Unit = definedExternally): Request<GetWorkflowRunResponse, AWSError>
    open fun getWorkflowRun(callback: (err: AWSError, data: GetWorkflowRunResponse) -> Unit = definedExternally): Request<GetWorkflowRunResponse, AWSError>
    open fun getWorkflowRunProperties(params: GetWorkflowRunPropertiesRequest, callback: (err: AWSError, data: GetWorkflowRunPropertiesResponse) -> Unit = definedExternally): Request<GetWorkflowRunPropertiesResponse, AWSError>
    open fun getWorkflowRunProperties(callback: (err: AWSError, data: GetWorkflowRunPropertiesResponse) -> Unit = definedExternally): Request<GetWorkflowRunPropertiesResponse, AWSError>
    open fun getWorkflowRuns(params: GetWorkflowRunsRequest, callback: (err: AWSError, data: GetWorkflowRunsResponse) -> Unit = definedExternally): Request<GetWorkflowRunsResponse, AWSError>
    open fun getWorkflowRuns(callback: (err: AWSError, data: GetWorkflowRunsResponse) -> Unit = definedExternally): Request<GetWorkflowRunsResponse, AWSError>
    open fun importCatalogToGlue(params: ImportCatalogToGlueRequest, callback: (err: AWSError, data: ImportCatalogToGlueResponse) -> Unit = definedExternally): Request<ImportCatalogToGlueResponse, AWSError>
    open fun importCatalogToGlue(callback: (err: AWSError, data: ImportCatalogToGlueResponse) -> Unit = definedExternally): Request<ImportCatalogToGlueResponse, AWSError>
    open fun listCrawlers(params: ListCrawlersRequest, callback: (err: AWSError, data: ListCrawlersResponse) -> Unit = definedExternally): Request<ListCrawlersResponse, AWSError>
    open fun listCrawlers(callback: (err: AWSError, data: ListCrawlersResponse) -> Unit = definedExternally): Request<ListCrawlersResponse, AWSError>
    open fun listDevEndpoints(params: ListDevEndpointsRequest, callback: (err: AWSError, data: ListDevEndpointsResponse) -> Unit = definedExternally): Request<ListDevEndpointsResponse, AWSError>
    open fun listDevEndpoints(callback: (err: AWSError, data: ListDevEndpointsResponse) -> Unit = definedExternally): Request<ListDevEndpointsResponse, AWSError>
    open fun listJobs(params: ListJobsRequest, callback: (err: AWSError, data: ListJobsResponse) -> Unit = definedExternally): Request<ListJobsResponse, AWSError>
    open fun listJobs(callback: (err: AWSError, data: ListJobsResponse) -> Unit = definedExternally): Request<ListJobsResponse, AWSError>
    open fun listMLTransforms(params: ListMLTransformsRequest, callback: (err: AWSError, data: ListMLTransformsResponse) -> Unit = definedExternally): Request<ListMLTransformsResponse, AWSError>
    open fun listMLTransforms(callback: (err: AWSError, data: ListMLTransformsResponse) -> Unit = definedExternally): Request<ListMLTransformsResponse, AWSError>
    open fun listTriggers(params: ListTriggersRequest, callback: (err: AWSError, data: ListTriggersResponse) -> Unit = definedExternally): Request<ListTriggersResponse, AWSError>
    open fun listTriggers(callback: (err: AWSError, data: ListTriggersResponse) -> Unit = definedExternally): Request<ListTriggersResponse, AWSError>
    open fun listWorkflows(params: ListWorkflowsRequest, callback: (err: AWSError, data: ListWorkflowsResponse) -> Unit = definedExternally): Request<ListWorkflowsResponse, AWSError>
    open fun listWorkflows(callback: (err: AWSError, data: ListWorkflowsResponse) -> Unit = definedExternally): Request<ListWorkflowsResponse, AWSError>
    open fun putDataCatalogEncryptionSettings(params: PutDataCatalogEncryptionSettingsRequest, callback: (err: AWSError, data: PutDataCatalogEncryptionSettingsResponse) -> Unit = definedExternally): Request<PutDataCatalogEncryptionSettingsResponse, AWSError>
    open fun putDataCatalogEncryptionSettings(callback: (err: AWSError, data: PutDataCatalogEncryptionSettingsResponse) -> Unit = definedExternally): Request<PutDataCatalogEncryptionSettingsResponse, AWSError>
    open fun putResourcePolicy(params: PutResourcePolicyRequest, callback: (err: AWSError, data: PutResourcePolicyResponse) -> Unit = definedExternally): Request<PutResourcePolicyResponse, AWSError>
    open fun putResourcePolicy(callback: (err: AWSError, data: PutResourcePolicyResponse) -> Unit = definedExternally): Request<PutResourcePolicyResponse, AWSError>
    open fun putWorkflowRunProperties(params: PutWorkflowRunPropertiesRequest, callback: (err: AWSError, data: PutWorkflowRunPropertiesResponse) -> Unit = definedExternally): Request<PutWorkflowRunPropertiesResponse, AWSError>
    open fun putWorkflowRunProperties(callback: (err: AWSError, data: PutWorkflowRunPropertiesResponse) -> Unit = definedExternally): Request<PutWorkflowRunPropertiesResponse, AWSError>
    open fun resetJobBookmark(params: ResetJobBookmarkRequest, callback: (err: AWSError, data: ResetJobBookmarkResponse) -> Unit = definedExternally): Request<ResetJobBookmarkResponse, AWSError>
    open fun resetJobBookmark(callback: (err: AWSError, data: ResetJobBookmarkResponse) -> Unit = definedExternally): Request<ResetJobBookmarkResponse, AWSError>
    open fun searchTables(params: SearchTablesRequest, callback: (err: AWSError, data: SearchTablesResponse) -> Unit = definedExternally): Request<SearchTablesResponse, AWSError>
    open fun searchTables(callback: (err: AWSError, data: SearchTablesResponse) -> Unit = definedExternally): Request<SearchTablesResponse, AWSError>
    open fun startCrawler(params: StartCrawlerRequest, callback: (err: AWSError, data: StartCrawlerResponse) -> Unit = definedExternally): Request<StartCrawlerResponse, AWSError>
    open fun startCrawler(callback: (err: AWSError, data: StartCrawlerResponse) -> Unit = definedExternally): Request<StartCrawlerResponse, AWSError>
    open fun startCrawlerSchedule(params: StartCrawlerScheduleRequest, callback: (err: AWSError, data: StartCrawlerScheduleResponse) -> Unit = definedExternally): Request<StartCrawlerScheduleResponse, AWSError>
    open fun startCrawlerSchedule(callback: (err: AWSError, data: StartCrawlerScheduleResponse) -> Unit = definedExternally): Request<StartCrawlerScheduleResponse, AWSError>
    open fun startExportLabelsTaskRun(params: StartExportLabelsTaskRunRequest, callback: (err: AWSError, data: StartExportLabelsTaskRunResponse) -> Unit = definedExternally): Request<StartExportLabelsTaskRunResponse, AWSError>
    open fun startExportLabelsTaskRun(callback: (err: AWSError, data: StartExportLabelsTaskRunResponse) -> Unit = definedExternally): Request<StartExportLabelsTaskRunResponse, AWSError>
    open fun startImportLabelsTaskRun(params: StartImportLabelsTaskRunRequest, callback: (err: AWSError, data: StartImportLabelsTaskRunResponse) -> Unit = definedExternally): Request<StartImportLabelsTaskRunResponse, AWSError>
    open fun startImportLabelsTaskRun(callback: (err: AWSError, data: StartImportLabelsTaskRunResponse) -> Unit = definedExternally): Request<StartImportLabelsTaskRunResponse, AWSError>
    open fun startJobRun(params: StartJobRunRequest, callback: (err: AWSError, data: StartJobRunResponse) -> Unit = definedExternally): Request<StartJobRunResponse, AWSError>
    open fun startJobRun(callback: (err: AWSError, data: StartJobRunResponse) -> Unit = definedExternally): Request<StartJobRunResponse, AWSError>
    open fun startMLEvaluationTaskRun(params: StartMLEvaluationTaskRunRequest, callback: (err: AWSError, data: StartMLEvaluationTaskRunResponse) -> Unit = definedExternally): Request<StartMLEvaluationTaskRunResponse, AWSError>
    open fun startMLEvaluationTaskRun(callback: (err: AWSError, data: StartMLEvaluationTaskRunResponse) -> Unit = definedExternally): Request<StartMLEvaluationTaskRunResponse, AWSError>
    open fun startMLLabelingSetGenerationTaskRun(params: StartMLLabelingSetGenerationTaskRunRequest, callback: (err: AWSError, data: StartMLLabelingSetGenerationTaskRunResponse) -> Unit = definedExternally): Request<StartMLLabelingSetGenerationTaskRunResponse, AWSError>
    open fun startMLLabelingSetGenerationTaskRun(callback: (err: AWSError, data: StartMLLabelingSetGenerationTaskRunResponse) -> Unit = definedExternally): Request<StartMLLabelingSetGenerationTaskRunResponse, AWSError>
    open fun startTrigger(params: StartTriggerRequest, callback: (err: AWSError, data: StartTriggerResponse) -> Unit = definedExternally): Request<StartTriggerResponse, AWSError>
    open fun startTrigger(callback: (err: AWSError, data: StartTriggerResponse) -> Unit = definedExternally): Request<StartTriggerResponse, AWSError>
    open fun startWorkflowRun(params: StartWorkflowRunRequest, callback: (err: AWSError, data: StartWorkflowRunResponse) -> Unit = definedExternally): Request<StartWorkflowRunResponse, AWSError>
    open fun startWorkflowRun(callback: (err: AWSError, data: StartWorkflowRunResponse) -> Unit = definedExternally): Request<StartWorkflowRunResponse, AWSError>
    open fun stopCrawler(params: StopCrawlerRequest, callback: (err: AWSError, data: StopCrawlerResponse) -> Unit = definedExternally): Request<StopCrawlerResponse, AWSError>
    open fun stopCrawler(callback: (err: AWSError, data: StopCrawlerResponse) -> Unit = definedExternally): Request<StopCrawlerResponse, AWSError>
    open fun stopCrawlerSchedule(params: StopCrawlerScheduleRequest, callback: (err: AWSError, data: StopCrawlerScheduleResponse) -> Unit = definedExternally): Request<StopCrawlerScheduleResponse, AWSError>
    open fun stopCrawlerSchedule(callback: (err: AWSError, data: StopCrawlerScheduleResponse) -> Unit = definedExternally): Request<StopCrawlerScheduleResponse, AWSError>
    open fun stopTrigger(params: StopTriggerRequest, callback: (err: AWSError, data: StopTriggerResponse) -> Unit = definedExternally): Request<StopTriggerResponse, AWSError>
    open fun stopTrigger(callback: (err: AWSError, data: StopTriggerResponse) -> Unit = definedExternally): Request<StopTriggerResponse, AWSError>
    open fun tagResource(params: TagResourceRequest, callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceResponse) -> Unit = definedExternally): Request<TagResourceResponse, AWSError>
    open fun untagResource(params: UntagResourceRequest, callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceResponse) -> Unit = definedExternally): Request<UntagResourceResponse, AWSError>
    open fun updateClassifier(params: UpdateClassifierRequest, callback: (err: AWSError, data: UpdateClassifierResponse) -> Unit = definedExternally): Request<UpdateClassifierResponse, AWSError>
    open fun updateClassifier(callback: (err: AWSError, data: UpdateClassifierResponse) -> Unit = definedExternally): Request<UpdateClassifierResponse, AWSError>
    open fun updateConnection(params: UpdateConnectionRequest, callback: (err: AWSError, data: UpdateConnectionResponse) -> Unit = definedExternally): Request<UpdateConnectionResponse, AWSError>
    open fun updateConnection(callback: (err: AWSError, data: UpdateConnectionResponse) -> Unit = definedExternally): Request<UpdateConnectionResponse, AWSError>
    open fun updateCrawler(params: UpdateCrawlerRequest, callback: (err: AWSError, data: UpdateCrawlerResponse) -> Unit = definedExternally): Request<UpdateCrawlerResponse, AWSError>
    open fun updateCrawler(callback: (err: AWSError, data: UpdateCrawlerResponse) -> Unit = definedExternally): Request<UpdateCrawlerResponse, AWSError>
    open fun updateCrawlerSchedule(params: UpdateCrawlerScheduleRequest, callback: (err: AWSError, data: UpdateCrawlerScheduleResponse) -> Unit = definedExternally): Request<UpdateCrawlerScheduleResponse, AWSError>
    open fun updateCrawlerSchedule(callback: (err: AWSError, data: UpdateCrawlerScheduleResponse) -> Unit = definedExternally): Request<UpdateCrawlerScheduleResponse, AWSError>
    open fun updateDatabase(params: UpdateDatabaseRequest, callback: (err: AWSError, data: UpdateDatabaseResponse) -> Unit = definedExternally): Request<UpdateDatabaseResponse, AWSError>
    open fun updateDatabase(callback: (err: AWSError, data: UpdateDatabaseResponse) -> Unit = definedExternally): Request<UpdateDatabaseResponse, AWSError>
    open fun updateDevEndpoint(params: UpdateDevEndpointRequest, callback: (err: AWSError, data: UpdateDevEndpointResponse) -> Unit = definedExternally): Request<UpdateDevEndpointResponse, AWSError>
    open fun updateDevEndpoint(callback: (err: AWSError, data: UpdateDevEndpointResponse) -> Unit = definedExternally): Request<UpdateDevEndpointResponse, AWSError>
    open fun updateJob(params: UpdateJobRequest, callback: (err: AWSError, data: UpdateJobResponse) -> Unit = definedExternally): Request<UpdateJobResponse, AWSError>
    open fun updateJob(callback: (err: AWSError, data: UpdateJobResponse) -> Unit = definedExternally): Request<UpdateJobResponse, AWSError>
    open fun updateMLTransform(params: UpdateMLTransformRequest, callback: (err: AWSError, data: UpdateMLTransformResponse) -> Unit = definedExternally): Request<UpdateMLTransformResponse, AWSError>
    open fun updateMLTransform(callback: (err: AWSError, data: UpdateMLTransformResponse) -> Unit = definedExternally): Request<UpdateMLTransformResponse, AWSError>
    open fun updatePartition(params: UpdatePartitionRequest, callback: (err: AWSError, data: UpdatePartitionResponse) -> Unit = definedExternally): Request<UpdatePartitionResponse, AWSError>
    open fun updatePartition(callback: (err: AWSError, data: UpdatePartitionResponse) -> Unit = definedExternally): Request<UpdatePartitionResponse, AWSError>
    open fun updateTable(params: UpdateTableRequest, callback: (err: AWSError, data: UpdateTableResponse) -> Unit = definedExternally): Request<UpdateTableResponse, AWSError>
    open fun updateTable(callback: (err: AWSError, data: UpdateTableResponse) -> Unit = definedExternally): Request<UpdateTableResponse, AWSError>
    open fun updateTrigger(params: UpdateTriggerRequest, callback: (err: AWSError, data: UpdateTriggerResponse) -> Unit = definedExternally): Request<UpdateTriggerResponse, AWSError>
    open fun updateTrigger(callback: (err: AWSError, data: UpdateTriggerResponse) -> Unit = definedExternally): Request<UpdateTriggerResponse, AWSError>
    open fun updateUserDefinedFunction(params: UpdateUserDefinedFunctionRequest, callback: (err: AWSError, data: UpdateUserDefinedFunctionResponse) -> Unit = definedExternally): Request<UpdateUserDefinedFunctionResponse, AWSError>
    open fun updateUserDefinedFunction(callback: (err: AWSError, data: UpdateUserDefinedFunctionResponse) -> Unit = definedExternally): Request<UpdateUserDefinedFunctionResponse, AWSError>
    open fun updateWorkflow(params: UpdateWorkflowRequest, callback: (err: AWSError, data: UpdateWorkflowResponse) -> Unit = definedExternally): Request<UpdateWorkflowResponse, AWSError>
    open fun updateWorkflow(callback: (err: AWSError, data: UpdateWorkflowResponse) -> Unit = definedExternally): Request<UpdateWorkflowResponse, AWSError>
    interface Action {
        var JobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Arguments: GenericMap?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationProperty: NotificationProperty?
            get() = definedExternally
            set(value) = definedExternally
        var CrawlerName: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchCreatePartitionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var PartitionInputList: PartitionInputList
    }
    interface BatchCreatePartitionResponse {
        var Errors: PartitionErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteConnectionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionNameList: DeleteConnectionNameList
    }
    interface BatchDeleteConnectionResponse {
        var Succeeded: NameStringList?
            get() = definedExternally
            set(value) = definedExternally
        var Errors: ErrorByName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeletePartitionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var PartitionsToDelete: BatchDeletePartitionValueList
    }
    interface BatchDeletePartitionResponse {
        var Errors: PartitionErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteTableRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TablesToDelete: BatchDeleteTableNameList
    }
    interface BatchDeleteTableResponse {
        var Errors: TableErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteTableVersionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var VersionIds: BatchDeleteTableVersionList
    }
    interface BatchDeleteTableVersionResponse {
        var Errors: TableVersionErrors?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetCrawlersRequest {
        var CrawlerNames: CrawlerNameList
    }
    interface BatchGetCrawlersResponse {
        var Crawlers: CrawlerList?
            get() = definedExternally
            set(value) = definedExternally
        var CrawlersNotFound: CrawlerNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetDevEndpointsRequest {
        var DevEndpointNames: DevEndpointNames
    }
    interface BatchGetDevEndpointsResponse {
        var DevEndpoints: DevEndpointList?
            get() = definedExternally
            set(value) = definedExternally
        var DevEndpointsNotFound: DevEndpointNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetJobsRequest {
        var JobNames: JobNameList
    }
    interface BatchGetJobsResponse {
        var Jobs: JobList?
            get() = definedExternally
            set(value) = definedExternally
        var JobsNotFound: JobNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetPartitionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var PartitionsToGet: BatchGetPartitionValueList
    }
    interface BatchGetPartitionResponse {
        var Partitions: PartitionList?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedKeys: BatchGetPartitionValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetTriggersRequest {
        var TriggerNames: TriggerNameList
    }
    interface BatchGetTriggersResponse {
        var Triggers: TriggerList?
            get() = definedExternally
            set(value) = definedExternally
        var TriggersNotFound: TriggerNameList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetWorkflowsRequest {
        var Names: WorkflowNames
        var IncludeGraph: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetWorkflowsResponse {
        var Workflows: Workflows?
            get() = definedExternally
            set(value) = definedExternally
        var MissingWorkflows: WorkflowNames?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchStopJobRunError {
        var JobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var JobRunId: IdString?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetail: ErrorDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchStopJobRunRequest {
        var JobName: NameString
        var JobRunIds: BatchStopJobRunJobRunIdList
    }
    interface BatchStopJobRunResponse {
        var SuccessfulSubmissions: BatchStopJobRunSuccessfulSubmissionList?
            get() = definedExternally
            set(value) = definedExternally
        var Errors: BatchStopJobRunErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchStopJobRunSuccessfulSubmission {
        var JobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var JobRunId: IdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelMLTaskRunRequest {
        var TransformId: HashString
        var TaskRunId: HashString
    }
    interface CancelMLTaskRunResponse {
        var TransformId: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var TaskRunId: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT" | String */
    }
    interface CatalogEntry {
        var DatabaseName: NameString
        var TableName: NameString
    }
    interface CatalogImportStatus {
        var ImportCompleted: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var ImportTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ImportedBy: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CatalogTarget {
        var DatabaseName: NameString
        var Tables: CatalogTablesList
    }
    interface Classifier {
        var GrokClassifier: GrokClassifier?
            get() = definedExternally
            set(value) = definedExternally
        var XMLClassifier: XMLClassifier?
            get() = definedExternally
            set(value) = definedExternally
        var JsonClassifier: JsonClassifier?
            get() = definedExternally
            set(value) = definedExternally
        var CsvClassifier: CsvClassifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CloudWatchEncryption {
        var CloudWatchEncryptionMode: String /* "DISABLED" | "SSE-KMS" | String */
        var KmsKeyArn: KmsKeyArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeGenEdge {
        var Source: CodeGenIdentifier
        var Target: CodeGenIdentifier
        var TargetParameter: CodeGenArgName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeGenNode {
        var Id: CodeGenIdentifier
        var NodeType: CodeGenNodeType
        var Args: CodeGenNodeArgs
        var LineNumber: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CodeGenNodeArg {
        var Name: CodeGenArgName
        var Value: CodeGenArgValue
        var Param: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Column {
        var Name: NameString
        var Type: ColumnTypeString?
            get() = definedExternally
            set(value) = definedExternally
        var Comment: CommentString?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Condition {
        var LogicalOperator: String /* "EQUALS" | String */
        var JobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT" | String */
        var CrawlerName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var CrawlState: String /* "RUNNING" | "SUCCEEDED" | "CANCELLED" | "FAILED" | String */
    }
    interface ConfusionMatrix {
        var NumTruePositives: RecordsCount?
            get() = definedExternally
            set(value) = definedExternally
        var NumFalsePositives: RecordsCount?
            get() = definedExternally
            set(value) = definedExternally
        var NumTrueNegatives: RecordsCount?
            get() = definedExternally
            set(value) = definedExternally
        var NumFalseNegatives: RecordsCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Connection {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionType: String /* "JDBC" | "SFTP" | String */
        var MatchCriteria: MatchCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionProperties: ConnectionProperties?
            get() = definedExternally
            set(value) = definedExternally
        var PhysicalConnectionRequirements: PhysicalConnectionRequirements?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedBy: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConnectionInput {
        var Name: NameString
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionType: String /* "JDBC" | "SFTP" | String */
        var MatchCriteria: MatchCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionProperties: ConnectionProperties
        var PhysicalConnectionRequirements: PhysicalConnectionRequirements?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConnectionPasswordEncryption {
        var ReturnConnectionPasswordEncrypted: Boolean
        var AwsKmsKeyId: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ConnectionProperties {
        @nativeGetter
        operator fun get(key: String): ValueString?
        @nativeSetter
        operator fun set(key: String, value: ValueString)
    }
    interface ConnectionsList {
        var Connections: OrchestrationStringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Crawl {
        var State: String /* "RUNNING" | "SUCCEEDED" | "CANCELLED" | "FAILED" | String */
        var StartedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var LogGroup: LogGroup?
            get() = definedExternally
            set(value) = definedExternally
        var LogStream: LogStream?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Crawler {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: CrawlerTargets?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: DatabaseName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Classifiers: ClassifierNameList?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaChangePolicy: SchemaChangePolicy?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "READY" | "RUNNING" | "STOPPING" | String */
        var TablePrefix: TablePrefix?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: Schedule?
            get() = definedExternally
            set(value) = definedExternally
        var CrawlElapsedTime: MillisecondsCount?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastCrawl: LastCrawlInfo?
            get() = definedExternally
            set(value) = definedExternally
        var Version: VersionId?
            get() = definedExternally
            set(value) = definedExternally
        var Configuration: CrawlerConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CrawlerSecurityConfiguration: CrawlerSecurityConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CrawlerMetrics {
        var CrawlerName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var TimeLeftSeconds: NonNegativeDouble?
            get() = definedExternally
            set(value) = definedExternally
        var StillEstimating: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var LastRuntimeSeconds: NonNegativeDouble?
            get() = definedExternally
            set(value) = definedExternally
        var MedianRuntimeSeconds: NonNegativeDouble?
            get() = definedExternally
            set(value) = definedExternally
        var TablesCreated: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var TablesUpdated: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var TablesDeleted: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CrawlerNodeDetails {
        var Crawls: CrawlList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CrawlerTargets {
        var S3Targets: S3TargetList?
            get() = definedExternally
            set(value) = definedExternally
        var JdbcTargets: JdbcTargetList?
            get() = definedExternally
            set(value) = definedExternally
        var DynamoDBTargets: DynamoDBTargetList?
            get() = definedExternally
            set(value) = definedExternally
        var CatalogTargets: CatalogTargetList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClassifierRequest {
        var GrokClassifier: CreateGrokClassifierRequest?
            get() = definedExternally
            set(value) = definedExternally
        var XMLClassifier: CreateXMLClassifierRequest?
            get() = definedExternally
            set(value) = definedExternally
        var JsonClassifier: CreateJsonClassifierRequest?
            get() = definedExternally
            set(value) = definedExternally
        var CsvClassifier: CreateCsvClassifierRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateClassifierResponse
    interface CreateConnectionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionInput: ConnectionInput
    }
    interface CreateConnectionResponse
    interface CreateCrawlerRequest {
        var Name: NameString
        var Role: Role
        var DatabaseName: DatabaseName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: CrawlerTargets
        var Schedule: CronExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Classifiers: ClassifierNameList?
            get() = definedExternally
            set(value) = definedExternally
        var TablePrefix: TablePrefix?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaChangePolicy: SchemaChangePolicy?
            get() = definedExternally
            set(value) = definedExternally
        var Configuration: CrawlerConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CrawlerSecurityConfiguration: CrawlerSecurityConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCrawlerResponse
    interface CreateCsvClassifierRequest {
        var Name: NameString
        var Delimiter: CsvColumnDelimiter?
            get() = definedExternally
            set(value) = definedExternally
        var QuoteSymbol: CsvQuoteSymbol?
            get() = definedExternally
            set(value) = definedExternally
        var ContainsHeader: String /* "UNKNOWN" | "PRESENT" | "ABSENT" | String */
        var Header: CsvHeader?
            get() = definedExternally
            set(value) = definedExternally
        var DisableValueTrimming: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var AllowSingleColumn: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDatabaseRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseInput: DatabaseInput
    }
    interface CreateDatabaseResponse
    interface CreateDevEndpointRequest {
        var EndpointName: GenericString
        var RoleArn: RoleArn
        var SecurityGroupIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var PublicKey: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var PublicKeys: PublicKeysList?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraPythonLibsS3Path: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraJarsS3Path: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
        var Arguments: MapValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDevEndpointResponse {
        var EndpointName: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var YarnEndpointAddress: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ZeppelinRemoteSparkInterpreterPort: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraPythonLibsS3Path: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraJarsS3Path: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var Arguments: MapValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateGrokClassifierRequest {
        var Classification: Classification
        var Name: NameString
        var GrokPattern: GrokPattern
        var CustomPatterns: CustomPatterns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJobRequest {
        var Name: NameString
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var LogUri: UriString?
            get() = definedExternally
            set(value) = definedExternally
        var Role: RoleString
        var ExecutionProperty: ExecutionProperty?
            get() = definedExternally
            set(value) = definedExternally
        var Command: JobCommand
        var DefaultArguments: GenericMap?
            get() = definedExternally
            set(value) = definedExternally
        var NonOverridableArguments: GenericMap?
            get() = definedExternally
            set(value) = definedExternally
        var Connections: ConnectionsList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRetries: MaxRetries?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedCapacity: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationProperty: NotificationProperty?
            get() = definedExternally
            set(value) = definedExternally
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
    }
    interface CreateJobResponse {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateJsonClassifierRequest {
        var Name: NameString
        var JsonPath: JsonPath
    }
    interface CreateMLTransformRequest {
        var Name: NameString
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var InputRecordTables: GlueTables
        var Parameters: TransformParameters
        var Role: RoleString
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRetries: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateMLTransformResponse {
        var TransformId: HashString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePartitionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var PartitionInput: PartitionInput
    }
    interface CreatePartitionResponse
    interface CreateScriptRequest {
        var DagNodes: DagNodes?
            get() = definedExternally
            set(value) = definedExternally
        var DagEdges: DagEdges?
            get() = definedExternally
            set(value) = definedExternally
        var Language: String /* "PYTHON" | "SCALA" | String */
    }
    interface CreateScriptResponse {
        var PythonScript: PythonScript?
            get() = definedExternally
            set(value) = definedExternally
        var ScalaCode: ScalaCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateSecurityConfigurationRequest {
        var Name: NameString
        var EncryptionConfiguration: EncryptionConfiguration
    }
    interface CreateSecurityConfigurationResponse {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTableRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableInput: TableInput
    }
    interface CreateTableResponse
    interface CreateTriggerRequest {
        var Name: NameString
        var WorkflowName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "SCHEDULED" | "CONDITIONAL" | "ON_DEMAND" | String */
        var Schedule: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Predicate: Predicate?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: ActionList
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var StartOnCreation: BooleanValue?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateTriggerResponse {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateUserDefinedFunctionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var FunctionInput: UserDefinedFunctionInput
    }
    interface CreateUserDefinedFunctionResponse
    interface CreateWorkflowRequest {
        var Name: NameString
        var Description: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRunProperties: WorkflowRunProperties?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWorkflowResponse {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateXMLClassifierRequest {
        var Classification: Classification
        var Name: NameString
        var RowTag: RowTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CsvClassifier {
        var Name: NameString
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Version: VersionId?
            get() = definedExternally
            set(value) = definedExternally
        var Delimiter: CsvColumnDelimiter?
            get() = definedExternally
            set(value) = definedExternally
        var QuoteSymbol: CsvQuoteSymbol?
            get() = definedExternally
            set(value) = definedExternally
        var ContainsHeader: String /* "UNKNOWN" | "PRESENT" | "ABSENT" | String */
        var Header: CsvHeader?
            get() = definedExternally
            set(value) = definedExternally
        var DisableValueTrimming: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var AllowSingleColumn: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataCatalogEncryptionSettings {
        var EncryptionAtRest: EncryptionAtRest?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionPasswordEncryption: ConnectionPasswordEncryption?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataLakePrincipal {
        var DataLakePrincipalIdentifier: DataLakePrincipalString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Database {
        var Name: NameString
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: URI?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
        var CreateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreateTableDefaultPermissions: PrincipalPermissionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DatabaseInput {
        var Name: NameString
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var LocationUri: URI?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
        var CreateTableDefaultPermissions: PrincipalPermissionsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteClassifierRequest {
        var Name: NameString
    }
    interface DeleteClassifierResponse
    interface DeleteConnectionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionName: NameString
    }
    interface DeleteConnectionResponse
    interface DeleteCrawlerRequest {
        var Name: NameString
    }
    interface DeleteCrawlerResponse
    interface DeleteDatabaseRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameString
    }
    interface DeleteDatabaseResponse
    interface DeleteDevEndpointRequest {
        var EndpointName: GenericString
    }
    interface DeleteDevEndpointResponse
    interface DeleteJobRequest {
        var JobName: NameString
    }
    interface DeleteJobResponse {
        var JobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteMLTransformRequest {
        var TransformId: HashString
    }
    interface DeleteMLTransformResponse {
        var TransformId: HashString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeletePartitionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var PartitionValues: ValueStringList
    }
    interface DeletePartitionResponse
    interface DeleteResourcePolicyRequest {
        var PolicyHashCondition: HashString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteResourcePolicyResponse
    interface DeleteSecurityConfigurationRequest {
        var Name: NameString
    }
    interface DeleteSecurityConfigurationResponse
    interface DeleteTableRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var Name: NameString
    }
    interface DeleteTableResponse
    interface DeleteTableVersionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var VersionId: VersionString
    }
    interface DeleteTableVersionResponse
    interface DeleteTriggerRequest {
        var Name: NameString
    }
    interface DeleteTriggerResponse {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteUserDefinedFunctionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var FunctionName: NameString
    }
    interface DeleteUserDefinedFunctionResponse
    interface DeleteWorkflowRequest {
        var Name: NameString
    }
    interface DeleteWorkflowResponse {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DevEndpoint {
        var EndpointName: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIds: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var SubnetId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var YarnEndpointAddress: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var PrivateAddress: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ZeppelinRemoteSparkInterpreterPort: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var PublicAddress: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfNodes: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var VpcId: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraPythonLibsS3Path: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraJarsS3Path: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var FailureReason: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdateStatus: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimestamp: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedTimestamp: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var PublicKey: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var PublicKeys: PublicKeysList?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Arguments: MapValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DevEndpointCustomLibraries {
        var ExtraPythonLibsS3Path: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ExtraJarsS3Path: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DynamoDBTarget {
        var Path: Path?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Edge {
        var SourceId: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var DestinationId: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionAtRest {
        var CatalogEncryptionMode: String /* "DISABLED" | "SSE-KMS" | String */
        var SseAwsKmsKeyId: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionConfiguration {
        var S3Encryption: S3EncryptionList?
            get() = definedExternally
            set(value) = definedExternally
        var CloudWatchEncryption: CloudWatchEncryption?
            get() = definedExternally
            set(value) = definedExternally
        var JobBookmarksEncryption: JobBookmarksEncryption?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ErrorByName {
        @nativeGetter
        operator fun get(key: String): ErrorDetail?
        @nativeSetter
        operator fun set(key: String, value: ErrorDetail)
    }
    interface ErrorDetail {
        var ErrorCode: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EvaluationMetrics {
        var TransformType: String /* "FIND_MATCHES" | String */
        var FindMatchesMetrics: FindMatchesMetrics?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionProperty {
        var MaxConcurrentRuns: MaxConcurrentRuns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExportLabelsTaskRunProperties {
        var OutputS3Path: UriString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FindMatchesMetrics {
        var AreaUnderPRCurve: GenericBoundedDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Precision: GenericBoundedDouble?
            get() = definedExternally
            set(value) = definedExternally
        var Recall: GenericBoundedDouble?
            get() = definedExternally
            set(value) = definedExternally
        var F1: GenericBoundedDouble?
            get() = definedExternally
            set(value) = definedExternally
        var ConfusionMatrix: ConfusionMatrix?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FindMatchesParameters {
        var PrimaryKeyColumnName: ColumnNameString?
            get() = definedExternally
            set(value) = definedExternally
        var PrecisionRecallTradeoff: GenericBoundedDouble?
            get() = definedExternally
            set(value) = definedExternally
        var AccuracyCostTradeoff: GenericBoundedDouble?
            get() = definedExternally
            set(value) = definedExternally
        var EnforceProvidedLabels: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FindMatchesTaskRunProperties {
        var JobId: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var JobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var JobRunId: HashString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GenericMap {
        @nativeGetter
        operator fun get(key: String): GenericString?
        @nativeSetter
        operator fun set(key: String, value: GenericString)
    }
    interface GetCatalogImportStatusRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCatalogImportStatusResponse {
        var ImportStatus: CatalogImportStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetClassifierRequest {
        var Name: NameString
    }
    interface GetClassifierResponse {
        var Classifier: Classifier?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetClassifiersRequest {
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetClassifiersResponse {
        var Classifiers: ClassifierList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameString
        var HidePassword: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectionResponse {
        var Connection: Connection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectionsFilter {
        var MatchCriteria: MatchCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionType: String /* "JDBC" | "SFTP" | String */
    }
    interface GetConnectionsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Filter: GetConnectionsFilter?
            get() = definedExternally
            set(value) = definedExternally
        var HidePassword: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetConnectionsResponse {
        var ConnectionList: ConnectionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCrawlerMetricsRequest {
        var CrawlerNameList: CrawlerNameList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCrawlerMetricsResponse {
        var CrawlerMetricsList: CrawlerMetricsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCrawlerRequest {
        var Name: NameString
    }
    interface GetCrawlerResponse {
        var Crawler: Crawler?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCrawlersRequest {
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetCrawlersResponse {
        var Crawlers: CrawlerList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataCatalogEncryptionSettingsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataCatalogEncryptionSettingsResponse {
        var DataCatalogEncryptionSettings: DataCatalogEncryptionSettings?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDatabaseRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameString
    }
    interface GetDatabaseResponse {
        var Database: Database?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDatabasesRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDatabasesResponse {
        var DatabaseList: DatabaseList
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataflowGraphRequest {
        var PythonScript: PythonScript?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDataflowGraphResponse {
        var DagNodes: DagNodes?
            get() = definedExternally
            set(value) = definedExternally
        var DagEdges: DagEdges?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDevEndpointRequest {
        var EndpointName: GenericString
    }
    interface GetDevEndpointResponse {
        var DevEndpoint: DevEndpoint?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDevEndpointsRequest {
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDevEndpointsResponse {
        var DevEndpoints: DevEndpointList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobBookmarkRequest {
        var JobName: JobName
        var RunId: RunId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobBookmarkResponse {
        var JobBookmarkEntry: JobBookmarkEntry?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobRequest {
        var JobName: NameString
    }
    interface GetJobResponse {
        var Job: Job?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobRunRequest {
        var JobName: NameString
        var RunId: IdString
        var PredecessorsIncluded: BooleanValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobRunResponse {
        var JobRun: JobRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobRunsRequest {
        var JobName: NameString
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobRunsResponse {
        var JobRuns: JobRunList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobsRequest {
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobsResponse {
        var Jobs: JobList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMLTaskRunRequest {
        var TransformId: HashString
        var TaskRunId: HashString
    }
    interface GetMLTaskRunResponse {
        var TransformId: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var TaskRunId: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT" | String */
        var LogGroupName: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Properties: TaskRunProperties?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorString: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var StartedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionTime: ExecutionTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMLTaskRunsRequest {
        var TransformId: HashString
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var Filter: TaskRunFilterCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var Sort: TaskRunSortCriteria?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMLTaskRunsResponse {
        var TaskRuns: TaskRunList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMLTransformRequest {
        var TransformId: HashString
    }
    interface GetMLTransformResponse {
        var TransformId: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "NOT_READY" | "READY" | "DELETING" | String */
        var CreatedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputRecordTables: GlueTables?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: TransformParameters?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationMetrics: EvaluationMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var LabelCount: LabelCount?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: TransformSchema?
            get() = definedExternally
            set(value) = definedExternally
        var Role: RoleString?
            get() = definedExternally
            set(value) = definedExternally
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRetries: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMLTransformsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var Filter: TransformFilterCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var Sort: TransformSortCriteria?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMLTransformsResponse {
        var Transforms: TransformList
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMappingRequest {
        var Source: CatalogEntry
        var Sinks: CatalogEntries?
            get() = definedExternally
            set(value) = definedExternally
        var Location: Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetMappingResponse {
        var Mapping: MappingList
    }
    interface GetPartitionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var PartitionValues: ValueStringList
    }
    interface GetPartitionResponse {
        var Partition: Partition?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPartitionsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var Expression: PredicateString?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var Segment: Segment?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPartitionsResponse {
        var Partitions: PartitionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPlanRequest {
        var Mapping: MappingList
        var Source: CatalogEntry
        var Sinks: CatalogEntries?
            get() = definedExternally
            set(value) = definedExternally
        var Location: Location?
            get() = definedExternally
            set(value) = definedExternally
        var Language: String /* "PYTHON" | "SCALA" | String */
    }
    interface GetPlanResponse {
        var PythonScript: PythonScript?
            get() = definedExternally
            set(value) = definedExternally
        var ScalaCode: ScalaCode?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetResourcePolicyRequest
    interface GetResourcePolicyResponse {
        var PolicyInJson: PolicyJsonString?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyHash: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var CreateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSecurityConfigurationRequest {
        var Name: NameString
    }
    interface GetSecurityConfigurationResponse {
        var SecurityConfiguration: SecurityConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSecurityConfigurationsRequest {
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetSecurityConfigurationsResponse {
        var SecurityConfigurations: SecurityConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTableRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var Name: NameString
    }
    interface GetTableResponse {
        var Table: Table?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTableVersionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var VersionId: VersionString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTableVersionResponse {
        var TableVersion: TableVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTableVersionsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTableVersionsResponse {
        var TableVersions: GetTableVersionsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTablesRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var Expression: FilterString?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTablesResponse {
        var TableList: TableList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTagsRequest {
        var ResourceArn: GlueResourceArn
    }
    interface GetTagsResponse {
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTriggerRequest {
        var Name: NameString
    }
    interface GetTriggerResponse {
        var Trigger: Trigger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTriggersRequest {
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var DependentJobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTriggersResponse {
        var Triggers: TriggerList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUserDefinedFunctionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var FunctionName: NameString
    }
    interface GetUserDefinedFunctionResponse {
        var UserDefinedFunction: UserDefinedFunction?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUserDefinedFunctionsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var Pattern: NameString
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetUserDefinedFunctionsResponse {
        var UserDefinedFunctions: UserDefinedFunctionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetWorkflowRequest {
        var Name: NameString
        var IncludeGraph: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetWorkflowResponse {
        var Workflow: Workflow?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetWorkflowRunPropertiesRequest {
        var Name: NameString
        var RunId: IdString
    }
    interface GetWorkflowRunPropertiesResponse {
        var RunProperties: WorkflowRunProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetWorkflowRunRequest {
        var Name: NameString
        var RunId: IdString
        var IncludeGraph: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetWorkflowRunResponse {
        var Run: WorkflowRun?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetWorkflowRunsRequest {
        var Name: NameString
        var IncludeGraph: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetWorkflowRunsResponse {
        var Runs: WorkflowRuns?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GlueTable {
        var DatabaseName: NameString
        var TableName: NameString
        var CatalogId: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var ConnectionName: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GrokClassifier {
        var Name: NameString
        var Classification: Classification
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Version: VersionId?
            get() = definedExternally
            set(value) = definedExternally
        var GrokPattern: GrokPattern
        var CustomPatterns: CustomPatterns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportCatalogToGlueRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportCatalogToGlueResponse
    interface ImportLabelsTaskRunProperties {
        var InputS3Path: UriString?
            get() = definedExternally
            set(value) = definedExternally
        var Replace: ReplaceBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JdbcTarget {
        var ConnectionName: ConnectionName?
            get() = definedExternally
            set(value) = definedExternally
        var Path: Path?
            get() = definedExternally
            set(value) = definedExternally
        var Exclusions: PathList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Job {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var LogUri: UriString?
            get() = definedExternally
            set(value) = definedExternally
        var Role: RoleString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionProperty: ExecutionProperty?
            get() = definedExternally
            set(value) = definedExternally
        var Command: JobCommand?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultArguments: GenericMap?
            get() = definedExternally
            set(value) = definedExternally
        var NonOverridableArguments: GenericMap?
            get() = definedExternally
            set(value) = definedExternally
        var Connections: ConnectionsList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRetries: MaxRetries?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedCapacity: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationProperty: NotificationProperty?
            get() = definedExternally
            set(value) = definedExternally
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobBookmarkEntry {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var Version: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var Run: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var Attempt: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var PreviousRunId: RunId?
            get() = definedExternally
            set(value) = definedExternally
        var RunId: RunId?
            get() = definedExternally
            set(value) = definedExternally
        var JobBookmark: JsonValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobBookmarksEncryption {
        var JobBookmarksEncryptionMode: String /* "DISABLED" | "CSE-KMS" | String */
        var KmsKeyArn: KmsKeyArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobCommand {
        var Name: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var ScriptLocation: ScriptLocationString?
            get() = definedExternally
            set(value) = definedExternally
        var PythonVersion: PythonVersionString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobNodeDetails {
        var JobRuns: JobRunList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobRun {
        var Id: IdString?
            get() = definedExternally
            set(value) = definedExternally
        var Attempt: AttemptCount?
            get() = definedExternally
            set(value) = definedExternally
        var PreviousRunId: IdString?
            get() = definedExternally
            set(value) = definedExternally
        var TriggerName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var JobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var StartedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var JobRunState: String /* "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT" | String */
        var Arguments: GenericMap?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorString?
            get() = definedExternally
            set(value) = definedExternally
        var PredecessorRuns: PredecessorList?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedCapacity: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionTime: ExecutionTime?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var LogGroupName: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationProperty: NotificationProperty?
            get() = definedExternally
            set(value) = definedExternally
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobUpdate {
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var LogUri: UriString?
            get() = definedExternally
            set(value) = definedExternally
        var Role: RoleString?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionProperty: ExecutionProperty?
            get() = definedExternally
            set(value) = definedExternally
        var Command: JobCommand?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultArguments: GenericMap?
            get() = definedExternally
            set(value) = definedExternally
        var NonOverridableArguments: GenericMap?
            get() = definedExternally
            set(value) = definedExternally
        var Connections: ConnectionsList?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRetries: MaxRetries?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedCapacity: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationProperty: NotificationProperty?
            get() = definedExternally
            set(value) = definedExternally
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JsonClassifier {
        var Name: NameString
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Version: VersionId?
            get() = definedExternally
            set(value) = definedExternally
        var JsonPath: JsonPath
    }
    interface LabelingSetGenerationTaskRunProperties {
        var OutputS3Path: UriString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LastCrawlInfo {
        var Status: String /* "SUCCEEDED" | "CANCELLED" | "FAILED" | String */
        var ErrorMessage: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var LogGroup: LogGroup?
            get() = definedExternally
            set(value) = definedExternally
        var LogStream: LogStream?
            get() = definedExternally
            set(value) = definedExternally
        var MessagePrefix: MessagePrefix?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCrawlersRequest {
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListCrawlersResponse {
        var CrawlerNames: CrawlerNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevEndpointsRequest {
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDevEndpointsResponse {
        var DevEndpointNames: DevEndpointNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsRequest {
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListJobsResponse {
        var JobNames: JobNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMLTransformsRequest {
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var Filter: TransformFilterCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var Sort: TransformSortCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListMLTransformsResponse {
        var TransformIds: TransformIdList
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTriggersRequest {
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var DependentJobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagsMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTriggersResponse {
        var TriggerNames: TriggerNameList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkflowsRequest {
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkflowsResponse {
        var Workflows: WorkflowNames?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Location {
        var Jdbc: CodeGenNodeArgs?
            get() = definedExternally
            set(value) = definedExternally
        var S3: CodeGenNodeArgs?
            get() = definedExternally
            set(value) = definedExternally
        var DynamoDB: CodeGenNodeArgs?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LocationMap {
        @nativeGetter
        operator fun get(key: String): ColumnValuesString?
        @nativeSetter
        operator fun set(key: String, value: ColumnValuesString)
    }
    interface MLTransform {
        var TransformId: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "NOT_READY" | "READY" | "DELETING" | String */
        var CreatedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputRecordTables: GlueTables?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: TransformParameters?
            get() = definedExternally
            set(value) = definedExternally
        var EvaluationMetrics: EvaluationMetrics?
            get() = definedExternally
            set(value) = definedExternally
        var LabelCount: LabelCount?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: TransformSchema?
            get() = definedExternally
            set(value) = definedExternally
        var Role: RoleString?
            get() = definedExternally
            set(value) = definedExternally
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRetries: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface MapValue {
        @nativeGetter
        operator fun get(key: String): GenericString?
        @nativeSetter
        operator fun set(key: String, value: GenericString)
    }
    interface MappingEntry {
        var SourceTable: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var SourcePath: SchemaPathString?
            get() = definedExternally
            set(value) = definedExternally
        var SourceType: FieldType?
            get() = definedExternally
            set(value) = definedExternally
        var TargetTable: TableName?
            get() = definedExternally
            set(value) = definedExternally
        var TargetPath: SchemaPathString?
            get() = definedExternally
            set(value) = definedExternally
        var TargetType: FieldType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Node {
        var Type: String /* "CRAWLER" | "JOB" | "TRIGGER" | String */
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var UniqueId: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var TriggerDetails: TriggerNodeDetails?
            get() = definedExternally
            set(value) = definedExternally
        var JobDetails: JobNodeDetails?
            get() = definedExternally
            set(value) = definedExternally
        var CrawlerDetails: CrawlerNodeDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotificationProperty {
        var NotifyDelayAfter: NotifyDelayAfter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Order {
        var Column: NameString
        var SortOrder: IntegerFlag
    }
    interface ParametersMap {
        @nativeGetter
        operator fun get(key: String): ParametersMapValue?
        @nativeSetter
        operator fun set(key: String, value: ParametersMapValue)
    }
    interface Partition {
        var Values: ValueStringList?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var TableName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastAccessTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StorageDescriptor: StorageDescriptor?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
        var LastAnalyzedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PartitionError {
        var PartitionValues: ValueStringList?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetail: ErrorDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PartitionInput {
        var Values: ValueStringList?
            get() = definedExternally
            set(value) = definedExternally
        var LastAccessTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StorageDescriptor: StorageDescriptor?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
        var LastAnalyzedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PartitionValueList {
        var Values: ValueStringList
    }
    interface PhysicalConnectionRequirements {
        var SubnetId: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityGroupIdList: SecurityGroupIdList?
            get() = definedExternally
            set(value) = definedExternally
        var AvailabilityZone: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Predecessor {
        var JobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var RunId: IdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Predicate {
        var Logical: String /* "AND" | "ANY" | String */
        var Conditions: ConditionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PrincipalPermissions {
        var Principal: DataLakePrincipal?
            get() = definedExternally
            set(value) = definedExternally
        var Permissions: PermissionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PropertyPredicate {
        var Key: ValueString?
            get() = definedExternally
            set(value) = definedExternally
        var Value: ValueString?
            get() = definedExternally
            set(value) = definedExternally
        var Comparator: String /* "EQUALS" | "GREATER_THAN" | "LESS_THAN" | "GREATER_THAN_EQUALS" | "LESS_THAN_EQUALS" | String */
    }
    interface PutDataCatalogEncryptionSettingsRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DataCatalogEncryptionSettings: DataCatalogEncryptionSettings
    }
    interface PutDataCatalogEncryptionSettingsResponse
    interface PutResourcePolicyRequest {
        var PolicyInJson: PolicyJsonString
        var PolicyHashCondition: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var PolicyExistsCondition: String /* "MUST_EXIST" | "NOT_EXIST" | "NONE" | String */
    }
    interface PutResourcePolicyResponse {
        var PolicyHash: HashString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutWorkflowRunPropertiesRequest {
        var Name: NameString
        var RunId: IdString
        var RunProperties: WorkflowRunProperties
    }
    interface PutWorkflowRunPropertiesResponse
    interface ResetJobBookmarkRequest {
        var JobName: JobName
        var RunId: RunId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResetJobBookmarkResponse {
        var JobBookmarkEntry: JobBookmarkEntry?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceUri {
        var ResourceType: String /* "JAR" | "FILE" | "ARCHIVE" | String */
        var Uri: URI?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Encryption {
        var S3EncryptionMode: String /* "DISABLED" | "SSE-KMS" | "SSE-S3" | String */
        var KmsKeyArn: KmsKeyArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Target {
        var Path: Path?
            get() = definedExternally
            set(value) = definedExternally
        var Exclusions: PathList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Schedule {
        var ScheduleExpression: CronExpression?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "SCHEDULED" | "NOT_SCHEDULED" | "TRANSITIONING" | String */
    }
    interface SchemaChangePolicy {
        var UpdateBehavior: String /* "LOG" | "UPDATE_IN_DATABASE" | String */
        var DeleteBehavior: String /* "LOG" | "DELETE_FROM_DATABASE" | "DEPRECATE_IN_DATABASE" | String */
    }
    interface SchemaColumn {
        var Name: ColumnNameString?
            get() = definedExternally
            set(value) = definedExternally
        var DataType: ColumnTypeString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchTablesRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var Filters: SearchPropertyPredicates?
            get() = definedExternally
            set(value) = definedExternally
        var SearchText: ValueString?
            get() = definedExternally
            set(value) = definedExternally
        var SortCriteria: SortCriteria?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: PageSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SearchTablesResponse {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var TableList: TableList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SecurityConfiguration {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedTimeStamp: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionConfiguration: EncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Segment {
        var SegmentNumber: NonNegativeInteger
        var TotalSegments: TotalSegmentsInteger
    }
    interface SerDeInfo {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var SerializationLibrary: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SkewedInfo {
        var SkewedColumnNames: NameStringList?
            get() = definedExternally
            set(value) = definedExternally
        var SkewedColumnValues: ColumnValueStringList?
            get() = definedExternally
            set(value) = definedExternally
        var SkewedColumnValueLocationMaps: LocationMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SortCriterion {
        var FieldName: ValueString?
            get() = definedExternally
            set(value) = definedExternally
        var Sort: String /* "ASC" | "DESC" | String */
    }
    interface StartCrawlerRequest {
        var Name: NameString
    }
    interface StartCrawlerResponse
    interface StartCrawlerScheduleRequest {
        var CrawlerName: NameString
    }
    interface StartCrawlerScheduleResponse
    interface StartExportLabelsTaskRunRequest {
        var TransformId: HashString
        var OutputS3Path: UriString
    }
    interface StartExportLabelsTaskRunResponse {
        var TaskRunId: HashString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartImportLabelsTaskRunRequest {
        var TransformId: HashString
        var InputS3Path: UriString
        var ReplaceAllLabels: ReplaceBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartImportLabelsTaskRunResponse {
        var TaskRunId: HashString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartJobRunRequest {
        var JobName: NameString
        var JobRunId: IdString?
            get() = definedExternally
            set(value) = definedExternally
        var Arguments: GenericMap?
            get() = definedExternally
            set(value) = definedExternally
        var AllocatedCapacity: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var SecurityConfiguration: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationProperty: NotificationProperty?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartJobRunResponse {
        var JobRunId: IdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartMLEvaluationTaskRunRequest {
        var TransformId: HashString
    }
    interface StartMLEvaluationTaskRunResponse {
        var TaskRunId: HashString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartMLLabelingSetGenerationTaskRunRequest {
        var TransformId: HashString
        var OutputS3Path: UriString
    }
    interface StartMLLabelingSetGenerationTaskRunResponse {
        var TaskRunId: HashString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartTriggerRequest {
        var Name: NameString
    }
    interface StartTriggerResponse {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartWorkflowRunRequest {
        var Name: NameString
    }
    interface StartWorkflowRunResponse {
        var RunId: IdString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopCrawlerRequest {
        var Name: NameString
    }
    interface StopCrawlerResponse
    interface StopCrawlerScheduleRequest {
        var CrawlerName: NameString
    }
    interface StopCrawlerScheduleResponse
    interface StopTriggerRequest {
        var Name: NameString
    }
    interface StopTriggerResponse {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StorageDescriptor {
        var Columns: ColumnList?
            get() = definedExternally
            set(value) = definedExternally
        var Location: LocationString?
            get() = definedExternally
            set(value) = definedExternally
        var InputFormat: FormatString?
            get() = definedExternally
            set(value) = definedExternally
        var OutputFormat: FormatString?
            get() = definedExternally
            set(value) = definedExternally
        var Compressed: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var NumberOfBuckets: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var SerdeInfo: SerDeInfo?
            get() = definedExternally
            set(value) = definedExternally
        var BucketColumns: NameStringList?
            get() = definedExternally
            set(value) = definedExternally
        var SortColumns: OrderList?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
        var SkewedInfo: SkewedInfo?
            get() = definedExternally
            set(value) = definedExternally
        var StoredAsSubDirectories: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Table {
        var Name: NameString
        var DatabaseName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var CreateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastAccessTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastAnalyzedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Retention: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var StorageDescriptor: StorageDescriptor?
            get() = definedExternally
            set(value) = definedExternally
        var PartitionKeys: ColumnList?
            get() = definedExternally
            set(value) = definedExternally
        var ViewOriginalText: ViewTextString?
            get() = definedExternally
            set(value) = definedExternally
        var ViewExpandedText: ViewTextString?
            get() = definedExternally
            set(value) = definedExternally
        var TableType: TableTypeString?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBy: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var IsRegisteredWithLakeFormation: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TableError {
        var TableName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetail: ErrorDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TableInput {
        var Name: NameString
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Owner: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var LastAccessTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastAnalyzedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Retention: NonNegativeInteger?
            get() = definedExternally
            set(value) = definedExternally
        var StorageDescriptor: StorageDescriptor?
            get() = definedExternally
            set(value) = definedExternally
        var PartitionKeys: ColumnList?
            get() = definedExternally
            set(value) = definedExternally
        var ViewOriginalText: ViewTextString?
            get() = definedExternally
            set(value) = definedExternally
        var ViewExpandedText: ViewTextString?
            get() = definedExternally
            set(value) = definedExternally
        var TableType: TableTypeString?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: ParametersMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TableVersion {
        var Table: Table?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: VersionString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TableVersionError {
        var TableName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: VersionString?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorDetail: ErrorDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceRequest {
        var ResourceArn: GlueResourceArn
        var TagsToAdd: TagsMap
    }
    interface TagResourceResponse
    interface TagsMap {
        @nativeGetter
        operator fun get(key: String): TagValue?
        @nativeSetter
        operator fun set(key: String, value: TagValue)
    }
    interface TaskRun {
        var TransformId: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var TaskRunId: HashString?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT" | String */
        var LogGroupName: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Properties: TaskRunProperties?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorString: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var StartedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedOn: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionTime: ExecutionTime?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskRunFilterCriteria {
        var TaskRunType: String /* "EVALUATION" | "LABELING_SET_GENERATION" | "IMPORT_LABELS" | "EXPORT_LABELS" | "FIND_MATCHES" | String */
        var Status: String /* "STARTING" | "RUNNING" | "STOPPING" | "STOPPED" | "SUCCEEDED" | "FAILED" | "TIMEOUT" | String */
        var StartedBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var StartedAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskRunProperties {
        var TaskType: String /* "EVALUATION" | "LABELING_SET_GENERATION" | "IMPORT_LABELS" | "EXPORT_LABELS" | "FIND_MATCHES" | String */
        var ImportLabelsTaskRunProperties: ImportLabelsTaskRunProperties?
            get() = definedExternally
            set(value) = definedExternally
        var ExportLabelsTaskRunProperties: ExportLabelsTaskRunProperties?
            get() = definedExternally
            set(value) = definedExternally
        var LabelingSetGenerationTaskRunProperties: LabelingSetGenerationTaskRunProperties?
            get() = definedExternally
            set(value) = definedExternally
        var FindMatchesTaskRunProperties: FindMatchesTaskRunProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TaskRunSortCriteria {
        var Column: String /* "TASK_RUN_TYPE" | "STATUS" | "STARTED" | String */
        var SortDirection: String /* "DESCENDING" | "ASCENDING" | String */
    }
    interface TransformFilterCriteria {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var TransformType: String /* "FIND_MATCHES" | String */
        var Status: String /* "NOT_READY" | "READY" | "DELETING" | String */
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: TransformSchema?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransformParameters {
        var TransformType: String /* "FIND_MATCHES" | String */
        var FindMatchesParameters: FindMatchesParameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransformSortCriteria {
        var Column: String /* "NAME" | "TRANSFORM_TYPE" | "STATUS" | "CREATED" | "LAST_MODIFIED" | String */
        var SortDirection: String /* "DESCENDING" | "ASCENDING" | String */
    }
    interface Trigger {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var WorkflowName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Id: IdString?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "SCHEDULED" | "CONDITIONAL" | "ON_DEMAND" | String */
        var State: String /* "CREATING" | "CREATED" | "ACTIVATING" | "ACTIVATED" | "DEACTIVATING" | "DEACTIVATED" | "DELETING" | "UPDATING" | String */
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: ActionList?
            get() = definedExternally
            set(value) = definedExternally
        var Predicate: Predicate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TriggerNodeDetails {
        var Trigger: Trigger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TriggerUpdate {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var Actions: ActionList?
            get() = definedExternally
            set(value) = definedExternally
        var Predicate: Predicate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceRequest {
        var ResourceArn: GlueResourceArn
        var TagsToRemove: TagKeysList
    }
    interface UntagResourceResponse
    interface UpdateClassifierRequest {
        var GrokClassifier: UpdateGrokClassifierRequest?
            get() = definedExternally
            set(value) = definedExternally
        var XMLClassifier: UpdateXMLClassifierRequest?
            get() = definedExternally
            set(value) = definedExternally
        var JsonClassifier: UpdateJsonClassifierRequest?
            get() = definedExternally
            set(value) = definedExternally
        var CsvClassifier: UpdateCsvClassifierRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateClassifierResponse
    interface UpdateConnectionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameString
        var ConnectionInput: ConnectionInput
    }
    interface UpdateConnectionResponse
    interface UpdateCrawlerRequest {
        var Name: NameString
        var Role: Role?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: DatabaseName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionStringRemovable?
            get() = definedExternally
            set(value) = definedExternally
        var Targets: CrawlerTargets?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: CronExpression?
            get() = definedExternally
            set(value) = definedExternally
        var Classifiers: ClassifierNameList?
            get() = definedExternally
            set(value) = definedExternally
        var TablePrefix: TablePrefix?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaChangePolicy: SchemaChangePolicy?
            get() = definedExternally
            set(value) = definedExternally
        var Configuration: CrawlerConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CrawlerSecurityConfiguration: CrawlerSecurityConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCrawlerResponse
    interface UpdateCrawlerScheduleRequest {
        var CrawlerName: NameString
        var Schedule: CronExpression?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateCrawlerScheduleResponse
    interface UpdateCsvClassifierRequest {
        var Name: NameString
        var Delimiter: CsvColumnDelimiter?
            get() = definedExternally
            set(value) = definedExternally
        var QuoteSymbol: CsvQuoteSymbol?
            get() = definedExternally
            set(value) = definedExternally
        var ContainsHeader: String /* "UNKNOWN" | "PRESENT" | "ABSENT" | String */
        var Header: CsvHeader?
            get() = definedExternally
            set(value) = definedExternally
        var DisableValueTrimming: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var AllowSingleColumn: NullableBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDatabaseRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var Name: NameString
        var DatabaseInput: DatabaseInput
    }
    interface UpdateDatabaseResponse
    interface UpdateDevEndpointRequest {
        var EndpointName: GenericString
        var PublicKey: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var AddPublicKeys: PublicKeysList?
            get() = definedExternally
            set(value) = definedExternally
        var DeletePublicKeys: PublicKeysList?
            get() = definedExternally
            set(value) = definedExternally
        var CustomLibraries: DevEndpointCustomLibraries?
            get() = definedExternally
            set(value) = definedExternally
        var UpdateEtlLibraries: BooleanValue?
            get() = definedExternally
            set(value) = definedExternally
        var DeleteArguments: StringList?
            get() = definedExternally
            set(value) = definedExternally
        var AddArguments: MapValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDevEndpointResponse
    interface UpdateGrokClassifierRequest {
        var Name: NameString
        var Classification: Classification?
            get() = definedExternally
            set(value) = definedExternally
        var GrokPattern: GrokPattern?
            get() = definedExternally
            set(value) = definedExternally
        var CustomPatterns: CustomPatterns?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateJobRequest {
        var JobName: NameString
        var JobUpdate: JobUpdate
    }
    interface UpdateJobResponse {
        var JobName: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateJsonClassifierRequest {
        var Name: NameString
        var JsonPath: JsonPath?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMLTransformRequest {
        var TransformId: HashString
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: TransformParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Role: RoleString?
            get() = definedExternally
            set(value) = definedExternally
        var GlueVersion: GlueVersionString?
            get() = definedExternally
            set(value) = definedExternally
        var MaxCapacity: NullableDouble?
            get() = definedExternally
            set(value) = definedExternally
        var WorkerType: String /* "Standard" | "G.1X" | "G.2X" | String */
        var NumberOfWorkers: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Timeout: Timeout?
            get() = definedExternally
            set(value) = definedExternally
        var MaxRetries: NullableInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateMLTransformResponse {
        var TransformId: HashString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdatePartitionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableName: NameString
        var PartitionValueList: BoundedPartitionValueList
        var PartitionInput: PartitionInput
    }
    interface UpdatePartitionResponse
    interface UpdateTableRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var TableInput: TableInput
        var SkipArchive: BooleanNullable?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTableResponse
    interface UpdateTriggerRequest {
        var Name: NameString
        var TriggerUpdate: TriggerUpdate
    }
    interface UpdateTriggerResponse {
        var Trigger: Trigger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateUserDefinedFunctionRequest {
        var CatalogId: CatalogIdString?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseName: NameString
        var FunctionName: NameString
        var FunctionInput: UserDefinedFunctionInput
    }
    interface UpdateUserDefinedFunctionResponse
    interface UpdateWorkflowRequest {
        var Name: NameString
        var Description: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRunProperties: WorkflowRunProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateWorkflowResponse {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateXMLClassifierRequest {
        var Name: NameString
        var Classification: Classification?
            get() = definedExternally
            set(value) = definedExternally
        var RowTag: RowTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserDefinedFunction {
        var FunctionName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var ClassName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerType: String /* "USER" | "ROLE" | "GROUP" | String */
        var CreateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceUris: ResourceUriList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UserDefinedFunctionInput {
        var FunctionName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var ClassName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerName: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var OwnerType: String /* "USER" | "ROLE" | "GROUP" | String */
        var ResourceUris: ResourceUriList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Workflow {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var Description: GenericString?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultRunProperties: WorkflowRunProperties?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var LastModifiedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var LastRun: WorkflowRun?
            get() = definedExternally
            set(value) = definedExternally
        var Graph: WorkflowGraph?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowGraph {
        var Nodes: NodeList?
            get() = definedExternally
            set(value) = definedExternally
        var Edges: EdgeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowRun {
        var Name: NameString?
            get() = definedExternally
            set(value) = definedExternally
        var WorkflowRunId: IdString?
            get() = definedExternally
            set(value) = definedExternally
        var WorkflowRunProperties: WorkflowRunProperties?
            get() = definedExternally
            set(value) = definedExternally
        var StartedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var CompletedOn: TimestampValue?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "RUNNING" | "COMPLETED" | String */
        var Statistics: WorkflowRunStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var Graph: WorkflowGraph?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkflowRunProperties {
        @nativeGetter
        operator fun get(key: String): GenericString?
        @nativeSetter
        operator fun set(key: String, value: GenericString)
    }
    interface WorkflowRunStatistics {
        var TotalActions: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutActions: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var FailedActions: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var StoppedActions: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var SucceededActions: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
        var RunningActions: IntegerValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface XMLClassifier {
        var Name: NameString
        var Classification: Classification
        var CreationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Version: VersionId?
            get() = definedExternally
            set(value) = definedExternally
        var RowTag: RowTag?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-03-31" | "latest" | String */
    }
}