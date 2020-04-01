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
import Athena.ColumnInfo
import Athena.NamedQuery
import Athena.QueryExecution
import Athena.Row
import Athena.Tag
import Athena.UnprocessedNamedQueryId
import Athena.UnprocessedQueryExecutionId
import Athena.WorkGroupSummary
import Athena.Datum
import Athena.BatchGetNamedQueryInput
import Athena.BatchGetNamedQueryOutput
import Athena.BatchGetQueryExecutionInput
import Athena.BatchGetQueryExecutionOutput
import Athena.CreateNamedQueryInput
import Athena.CreateNamedQueryOutput
import Athena.CreateWorkGroupInput
import Athena.CreateWorkGroupOutput
import Athena.DeleteNamedQueryInput
import Athena.DeleteNamedQueryOutput
import Athena.DeleteWorkGroupInput
import Athena.DeleteWorkGroupOutput
import Athena.GetNamedQueryInput
import Athena.GetNamedQueryOutput
import Athena.GetQueryExecutionInput
import Athena.GetQueryExecutionOutput
import Athena.GetQueryResultsInput
import Athena.GetQueryResultsOutput
import Athena.GetWorkGroupInput
import Athena.GetWorkGroupOutput
import Athena.ListNamedQueriesInput
import Athena.ListNamedQueriesOutput
import Athena.ListQueryExecutionsInput
import Athena.ListQueryExecutionsOutput
import Athena.ListTagsForResourceInput
import Athena.ListTagsForResourceOutput
import Athena.ListWorkGroupsInput
import Athena.ListWorkGroupsOutput
import Athena.StartQueryExecutionInput
import Athena.StartQueryExecutionOutput
import Athena.StopQueryExecutionInput
import Athena.StopQueryExecutionOutput
import Athena.TagResourceInput
import Athena.TagResourceOutput
import Athena.UntagResourceInput
import Athena.UntagResourceOutput
import Athena.UpdateWorkGroupInput
import Athena.UpdateWorkGroupOutput
import Athena.WorkGroupConfiguration
import Athena.ResultSet
import Athena.WorkGroup
import Athena.ResultConfiguration
import Athena.QueryExecutionContext
import Athena.QueryExecutionStatus
import Athena.QueryExecutionStatistics
import Athena.EncryptionConfiguration
import Athena.ResultSetMetadata
import Athena.WorkGroupConfigurationUpdates
import Athena.ResultConfigurationUpdates

typealias AmazonResourceName = String

typealias Boolean = Boolean

typealias BoxedBoolean = Boolean

typealias BytesScannedCutoffValue = Number

typealias ColumnInfoList = Array<ColumnInfo>

typealias DatabaseString = String

typealias _Date = Date

typealias DescriptionString = String

typealias ErrorCode = String

typealias ErrorMessage = String

typealias IdempotencyToken = String

typealias Integer = Number

typealias Long = Number

typealias MaxNamedQueriesCount = Number

typealias MaxQueryExecutionsCount = Number

typealias MaxQueryResults = Number

typealias MaxTagsCount = Number

typealias MaxWorkGroupsCount = Number

typealias NameString = String

typealias NamedQueryId = String

typealias NamedQueryIdList = Array<NamedQueryId>

typealias NamedQueryList = Array<NamedQuery>

typealias QueryExecutionId = String

typealias QueryExecutionIdList = Array<QueryExecutionId>

typealias QueryExecutionList = Array<QueryExecution>

typealias QueryString = String

typealias RowList = Array<Row>

typealias String = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias Token = String

typealias UnprocessedNamedQueryIdList = Array<UnprocessedNamedQueryId>

typealias UnprocessedQueryExecutionIdList = Array<UnprocessedQueryExecutionId>

typealias WorkGroupDescriptionString = String

typealias WorkGroupName = String

typealias WorkGroupsList = Array<WorkGroupSummary>

typealias datumList = Array<Datum>

typealias datumString = String

@JsModule("aws-sdk")
external open class Athena(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Athena.Types.ClientConfiguration */
    open fun batchGetNamedQuery(params: BatchGetNamedQueryInput, callback: (err: AWSError, data: BatchGetNamedQueryOutput) -> Unit = definedExternally): Request<BatchGetNamedQueryOutput, AWSError>
    open fun batchGetNamedQuery(callback: (err: AWSError, data: BatchGetNamedQueryOutput) -> Unit = definedExternally): Request<BatchGetNamedQueryOutput, AWSError>
    open fun batchGetQueryExecution(params: BatchGetQueryExecutionInput, callback: (err: AWSError, data: BatchGetQueryExecutionOutput) -> Unit = definedExternally): Request<BatchGetQueryExecutionOutput, AWSError>
    open fun batchGetQueryExecution(callback: (err: AWSError, data: BatchGetQueryExecutionOutput) -> Unit = definedExternally): Request<BatchGetQueryExecutionOutput, AWSError>
    open fun createNamedQuery(params: CreateNamedQueryInput, callback: (err: AWSError, data: CreateNamedQueryOutput) -> Unit = definedExternally): Request<CreateNamedQueryOutput, AWSError>
    open fun createNamedQuery(callback: (err: AWSError, data: CreateNamedQueryOutput) -> Unit = definedExternally): Request<CreateNamedQueryOutput, AWSError>
    open fun createWorkGroup(params: CreateWorkGroupInput, callback: (err: AWSError, data: CreateWorkGroupOutput) -> Unit = definedExternally): Request<CreateWorkGroupOutput, AWSError>
    open fun createWorkGroup(callback: (err: AWSError, data: CreateWorkGroupOutput) -> Unit = definedExternally): Request<CreateWorkGroupOutput, AWSError>
    open fun deleteNamedQuery(params: DeleteNamedQueryInput, callback: (err: AWSError, data: DeleteNamedQueryOutput) -> Unit = definedExternally): Request<DeleteNamedQueryOutput, AWSError>
    open fun deleteNamedQuery(callback: (err: AWSError, data: DeleteNamedQueryOutput) -> Unit = definedExternally): Request<DeleteNamedQueryOutput, AWSError>
    open fun deleteWorkGroup(params: DeleteWorkGroupInput, callback: (err: AWSError, data: DeleteWorkGroupOutput) -> Unit = definedExternally): Request<DeleteWorkGroupOutput, AWSError>
    open fun deleteWorkGroup(callback: (err: AWSError, data: DeleteWorkGroupOutput) -> Unit = definedExternally): Request<DeleteWorkGroupOutput, AWSError>
    open fun getNamedQuery(params: GetNamedQueryInput, callback: (err: AWSError, data: GetNamedQueryOutput) -> Unit = definedExternally): Request<GetNamedQueryOutput, AWSError>
    open fun getNamedQuery(callback: (err: AWSError, data: GetNamedQueryOutput) -> Unit = definedExternally): Request<GetNamedQueryOutput, AWSError>
    open fun getQueryExecution(params: GetQueryExecutionInput, callback: (err: AWSError, data: GetQueryExecutionOutput) -> Unit = definedExternally): Request<GetQueryExecutionOutput, AWSError>
    open fun getQueryExecution(callback: (err: AWSError, data: GetQueryExecutionOutput) -> Unit = definedExternally): Request<GetQueryExecutionOutput, AWSError>
    open fun getQueryResults(params: GetQueryResultsInput, callback: (err: AWSError, data: GetQueryResultsOutput) -> Unit = definedExternally): Request<GetQueryResultsOutput, AWSError>
    open fun getQueryResults(callback: (err: AWSError, data: GetQueryResultsOutput) -> Unit = definedExternally): Request<GetQueryResultsOutput, AWSError>
    open fun getWorkGroup(params: GetWorkGroupInput, callback: (err: AWSError, data: GetWorkGroupOutput) -> Unit = definedExternally): Request<GetWorkGroupOutput, AWSError>
    open fun getWorkGroup(callback: (err: AWSError, data: GetWorkGroupOutput) -> Unit = definedExternally): Request<GetWorkGroupOutput, AWSError>
    open fun listNamedQueries(params: ListNamedQueriesInput, callback: (err: AWSError, data: ListNamedQueriesOutput) -> Unit = definedExternally): Request<ListNamedQueriesOutput, AWSError>
    open fun listNamedQueries(callback: (err: AWSError, data: ListNamedQueriesOutput) -> Unit = definedExternally): Request<ListNamedQueriesOutput, AWSError>
    open fun listQueryExecutions(params: ListQueryExecutionsInput, callback: (err: AWSError, data: ListQueryExecutionsOutput) -> Unit = definedExternally): Request<ListQueryExecutionsOutput, AWSError>
    open fun listQueryExecutions(callback: (err: AWSError, data: ListQueryExecutionsOutput) -> Unit = definedExternally): Request<ListQueryExecutionsOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listWorkGroups(params: ListWorkGroupsInput, callback: (err: AWSError, data: ListWorkGroupsOutput) -> Unit = definedExternally): Request<ListWorkGroupsOutput, AWSError>
    open fun listWorkGroups(callback: (err: AWSError, data: ListWorkGroupsOutput) -> Unit = definedExternally): Request<ListWorkGroupsOutput, AWSError>
    open fun startQueryExecution(params: StartQueryExecutionInput, callback: (err: AWSError, data: StartQueryExecutionOutput) -> Unit = definedExternally): Request<StartQueryExecutionOutput, AWSError>
    open fun startQueryExecution(callback: (err: AWSError, data: StartQueryExecutionOutput) -> Unit = definedExternally): Request<StartQueryExecutionOutput, AWSError>
    open fun stopQueryExecution(params: StopQueryExecutionInput, callback: (err: AWSError, data: StopQueryExecutionOutput) -> Unit = definedExternally): Request<StopQueryExecutionOutput, AWSError>
    open fun stopQueryExecution(callback: (err: AWSError, data: StopQueryExecutionOutput) -> Unit = definedExternally): Request<StopQueryExecutionOutput, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun updateWorkGroup(params: UpdateWorkGroupInput, callback: (err: AWSError, data: UpdateWorkGroupOutput) -> Unit = definedExternally): Request<UpdateWorkGroupOutput, AWSError>
    open fun updateWorkGroup(callback: (err: AWSError, data: UpdateWorkGroupOutput) -> Unit = definedExternally): Request<UpdateWorkGroupOutput, AWSError>
    interface BatchGetNamedQueryInput {
        var NamedQueryIds: NamedQueryIdList
    }
    interface BatchGetNamedQueryOutput {
        var NamedQueries: NamedQueryList?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedNamedQueryIds: UnprocessedNamedQueryIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetQueryExecutionInput {
        var QueryExecutionIds: QueryExecutionIdList
    }
    interface BatchGetQueryExecutionOutput {
        var QueryExecutions: QueryExecutionList?
            get() = definedExternally
            set(value) = definedExternally
        var UnprocessedQueryExecutionIds: UnprocessedQueryExecutionIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ColumnInfo {
        var CatalogName: String?
            get() = definedExternally
            set(value) = definedExternally
        var SchemaName: String?
            get() = definedExternally
            set(value) = definedExternally
        var TableName: String?
            get() = definedExternally
            set(value) = definedExternally
        var Name: String
        var Label: String?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String
        var Precision: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Scale: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Nullable: String /* "NOT_NULL" | "NULLABLE" | "UNKNOWN" | String */
        var CaseSensitive: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNamedQueryInput {
        var Name: NameString
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Database: DatabaseString
        var QueryString: QueryString
        var ClientRequestToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
        var WorkGroup: WorkGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateNamedQueryOutput {
        var NamedQueryId: NamedQueryId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWorkGroupInput {
        var Name: WorkGroupName
        var Configuration: WorkGroupConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Description: WorkGroupDescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateWorkGroupOutput
    interface Datum {
        var VarCharValue: datumString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteNamedQueryInput {
        var NamedQueryId: NamedQueryId
    }
    interface DeleteNamedQueryOutput
    interface DeleteWorkGroupInput {
        var WorkGroup: WorkGroupName
        var RecursiveDeleteOption: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteWorkGroupOutput
    interface EncryptionConfiguration {
        var EncryptionOption: String /* "SSE_S3" | "SSE_KMS" | "CSE_KMS" | String */
        var KmsKey: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetNamedQueryInput {
        var NamedQueryId: NamedQueryId
    }
    interface GetNamedQueryOutput {
        var NamedQuery: NamedQuery?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQueryExecutionInput {
        var QueryExecutionId: QueryExecutionId
    }
    interface GetQueryExecutionOutput {
        var QueryExecution: QueryExecution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQueryResultsInput {
        var QueryExecutionId: QueryExecutionId
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxQueryResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetQueryResultsOutput {
        var UpdateCount: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ResultSet: ResultSet?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetWorkGroupInput {
        var WorkGroup: WorkGroupName
    }
    interface GetWorkGroupOutput {
        var WorkGroup: WorkGroup?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNamedQueriesInput {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxNamedQueriesCount?
            get() = definedExternally
            set(value) = definedExternally
        var WorkGroup: WorkGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListNamedQueriesOutput {
        var NamedQueryIds: NamedQueryIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQueryExecutionsInput {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxQueryExecutionsCount?
            get() = definedExternally
            set(value) = definedExternally
        var WorkGroup: WorkGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListQueryExecutionsOutput {
        var QueryExecutionIds: QueryExecutionIdList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var ResourceARN: AmazonResourceName
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxTagsCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceOutput {
        var Tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkGroupsInput {
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxWorkGroupsCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWorkGroupsOutput {
        var WorkGroups: WorkGroupsList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: Token?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NamedQuery {
        var Name: NameString
        var Description: DescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var Database: DatabaseString
        var QueryString: QueryString
        var NamedQueryId: NamedQueryId?
            get() = definedExternally
            set(value) = definedExternally
        var WorkGroup: WorkGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryExecution {
        var QueryExecutionId: QueryExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var Query: QueryString?
            get() = definedExternally
            set(value) = definedExternally
        var StatementType: String /* "DDL" | "DML" | "UTILITY" | String */
        var ResultConfiguration: ResultConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var QueryExecutionContext: QueryExecutionContext?
            get() = definedExternally
            set(value) = definedExternally
        var Status: QueryExecutionStatus?
            get() = definedExternally
            set(value) = definedExternally
        var Statistics: QueryExecutionStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var WorkGroup: WorkGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryExecutionContext {
        var Database: DatabaseString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryExecutionStatistics {
        var EngineExecutionTimeInMillis: Long?
            get() = definedExternally
            set(value) = definedExternally
        var DataScannedInBytes: Long?
            get() = definedExternally
            set(value) = definedExternally
        var DataManifestLocation: String?
            get() = definedExternally
            set(value) = definedExternally
        var TotalExecutionTimeInMillis: Long?
            get() = definedExternally
            set(value) = definedExternally
        var QueryQueueTimeInMillis: Long?
            get() = definedExternally
            set(value) = definedExternally
        var QueryPlanningTimeInMillis: Long?
            get() = definedExternally
            set(value) = definedExternally
        var ServiceProcessingTimeInMillis: Long?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryExecutionStatus {
        var State: String /* "QUEUED" | "RUNNING" | "SUCCEEDED" | "FAILED" | "CANCELLED" | String */
        var StateChangeReason: String?
            get() = definedExternally
            set(value) = definedExternally
        var SubmissionDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
        var CompletionDateTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResultConfiguration {
        var OutputLocation: String?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionConfiguration: EncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResultConfigurationUpdates {
        var OutputLocation: String?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveOutputLocation: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionConfiguration: EncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveEncryptionConfiguration: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResultSet {
        var Rows: RowList?
            get() = definedExternally
            set(value) = definedExternally
        var ResultSetMetadata: ResultSetMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResultSetMetadata {
        var ColumnInfo: ColumnInfoList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Row {
        var Data: datumList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartQueryExecutionInput {
        var QueryString: QueryString
        var ClientRequestToken: IdempotencyToken?
            get() = definedExternally
            set(value) = definedExternally
        var QueryExecutionContext: QueryExecutionContext?
            get() = definedExternally
            set(value) = definedExternally
        var ResultConfiguration: ResultConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var WorkGroup: WorkGroupName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartQueryExecutionOutput {
        var QueryExecutionId: QueryExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopQueryExecutionInput {
        var QueryExecutionId: QueryExecutionId
    }
    interface StopQueryExecutionOutput
    interface Tag {
        var Key: TagKey?
            get() = definedExternally
            set(value) = definedExternally
        var Value: TagValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TagResourceInput {
        var ResourceARN: AmazonResourceName
        var Tags: TagList
    }
    interface TagResourceOutput
    interface UnprocessedNamedQueryId {
        var NamedQueryId: NamedQueryId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnprocessedQueryExecutionId {
        var QueryExecutionId: QueryExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceInput {
        var ResourceARN: AmazonResourceName
        var TagKeys: TagKeyList
    }
    interface UntagResourceOutput
    interface UpdateWorkGroupInput {
        var WorkGroup: WorkGroupName
        var Description: WorkGroupDescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var ConfigurationUpdates: WorkGroupConfigurationUpdates?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | String */
    }
    interface UpdateWorkGroupOutput
    interface WorkGroup {
        var Name: WorkGroupName
        var State: String /* "ENABLED" | "DISABLED" | String */
        var Configuration: WorkGroupConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Description: WorkGroupDescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkGroupConfiguration {
        var ResultConfiguration: ResultConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var EnforceWorkGroupConfiguration: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var PublishCloudWatchMetricsEnabled: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var BytesScannedCutoffPerQuery: BytesScannedCutoffValue?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterPaysEnabled: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkGroupConfigurationUpdates {
        var EnforceWorkGroupConfiguration: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var ResultConfigurationUpdates: ResultConfigurationUpdates?
            get() = definedExternally
            set(value) = definedExternally
        var PublishCloudWatchMetricsEnabled: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var BytesScannedCutoffPerQuery: BytesScannedCutoffValue?
            get() = definedExternally
            set(value) = definedExternally
        var RemoveBytesScannedCutoffPerQuery: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var RequesterPaysEnabled: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WorkGroupSummary {
        var Name: WorkGroupName?
            get() = definedExternally
            set(value) = definedExternally
        var State: String /* "ENABLED" | "DISABLED" | String */
        var Description: WorkGroupDescriptionString?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: _Date?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-05-18" | "latest" | String */
    }
}