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
import Kendra.AdditionalResultAttribute
import Kendra.AttributeFilter
import Kendra.BatchDeleteDocumentResponseFailedDocument
import Kendra.BatchPutDocumentResponseFailedDocument
import Kendra.ClickFeedback
import Kendra.DataSourceSummary
import Kendra.DataSourceSyncJob
import Kendra.DataSourceToIndexFieldMapping
import Kendra.DocumentAttribute
import Kendra.DocumentAttributeValueCountPair
import Kendra.Document
import Kendra.DocumentMetadataConfiguration
import Kendra.Facet
import Kendra.FacetResult
import Kendra.FaqSummary
import Kendra.Highlight
import Kendra.IndexConfigurationSummary
import Kendra.Principal
import Kendra.QueryResultItem
import Kendra.RelevanceFeedback
import Kendra.BatchDeleteDocumentRequest
import Kendra.BatchDeleteDocumentResponse
import Kendra.BatchPutDocumentRequest
import Kendra.BatchPutDocumentResponse
import Kendra.CreateDataSourceRequest
import Kendra.CreateDataSourceResponse
import Kendra.CreateFaqRequest
import Kendra.CreateFaqResponse
import Kendra.CreateIndexRequest
import Kendra.CreateIndexResponse
import Kendra.DeleteFaqRequest
import Kendra.DeleteIndexRequest
import Kendra.DescribeDataSourceRequest
import Kendra.DescribeDataSourceResponse
import Kendra.DescribeFaqRequest
import Kendra.DescribeFaqResponse
import Kendra.DescribeIndexRequest
import Kendra.DescribeIndexResponse
import Kendra.ListDataSourceSyncJobsRequest
import Kendra.ListDataSourceSyncJobsResponse
import Kendra.ListDataSourcesRequest
import Kendra.ListDataSourcesResponse
import Kendra.ListFaqsRequest
import Kendra.ListFaqsResponse
import Kendra.ListIndicesRequest
import Kendra.ListIndicesResponse
import Kendra.QueryRequest
import Kendra.QueryResult
import Kendra.StartDataSourceSyncJobRequest
import Kendra.StartDataSourceSyncJobResponse
import Kendra.StopDataSourceSyncJobRequest
import Kendra.SubmitFeedbackRequest
import Kendra.UpdateDataSourceRequest
import Kendra.UpdateIndexRequest
import Kendra.AdditionalResultAttributeValue
import Kendra.TextWithHighlights
import Kendra.DataSourceConfiguration
import Kendra.S3Path
import Kendra.ServerSideEncryptionConfiguration
import Kendra.S3DataSourceConfiguration
import Kendra.SharePointConfiguration
import Kendra.DatabaseConfiguration
import Kendra.ConnectionConfiguration
import Kendra.DataSourceVpcConfiguration
import Kendra.ColumnConfiguration
import Kendra.AclConfiguration
import Kendra.IndexStatistics
import Kendra.DocumentAttributeValue
import Kendra.Relevance
import Kendra.Search
import Kendra.FaqStatistics
import Kendra.TextDocumentStatistics
import Kendra.TimeRange
import Kendra.ValueImportanceMap
import Kendra.DocumentsMetadataConfiguration
import Kendra.AccessControlListConfiguration

typealias AdditionalResultAttributeList = Array<AdditionalResultAttribute>

typealias AttributeFilterList = Array<AttributeFilter>

typealias BatchDeleteDocumentResponseFailedDocuments = Array<BatchDeleteDocumentResponseFailedDocument>

typealias BatchPutDocumentResponseFailedDocuments = Array<BatchPutDocumentResponseFailedDocument>

typealias Boolean = Boolean

typealias ChangeDetectingColumns = Array<ColumnName>

typealias ClickFeedbackList = Array<ClickFeedback>

typealias ColumnName = String

typealias DataSourceDateFieldFormat = String

typealias DataSourceFieldName = String

typealias DataSourceId = String

typealias DataSourceInclusionsExclusionsStrings = Array<DataSourceInclusionsExclusionsStringsMember>

typealias DataSourceInclusionsExclusionsStringsMember = String

typealias DataSourceName = String

typealias DataSourceSummaryList = Array<DataSourceSummary>

typealias DataSourceSyncJobHistoryList = Array<DataSourceSyncJob>

typealias DataSourceToIndexFieldMappingList = Array<DataSourceToIndexFieldMapping>

typealias DatabaseHost = String

typealias DatabaseName = String

typealias DatabasePort = Number

typealias Description = String

typealias DocumentAttributeKey = String

typealias DocumentAttributeKeyList = Array<DocumentAttributeKey>

typealias DocumentAttributeList = Array<DocumentAttribute>

typealias DocumentAttributeStringListValue = Array<String>

typealias DocumentAttributeStringValue = String

typealias DocumentAttributeValueCountPairList = Array<DocumentAttributeValueCountPair>

typealias DocumentId = String

typealias DocumentIdList = Array<DocumentId>

typealias DocumentList = Array<Document>

typealias DocumentMetadataBoolean = Boolean

typealias DocumentMetadataConfigurationList = Array<DocumentMetadataConfiguration>

typealias DocumentMetadataConfigurationName = String

typealias Duration = String

typealias ErrorMessage = String

typealias FacetList = Array<Facet>

typealias FacetResultList = Array<FacetResult>

typealias FaqId = String

typealias FaqName = String

typealias FaqSummaryItems = Array<FaqSummary>

typealias HighlightList = Array<Highlight>

typealias Importance = Number

typealias IndexConfigurationSummaryList = Array<IndexConfigurationSummary>

typealias IndexFieldName = String

typealias IndexId = String

typealias IndexName = String

typealias IndexedQuestionAnswersCount = Number

typealias IndexedTextDocumentsCount = Number

typealias Integer = Number

typealias KmsKeyId = String

typealias Long = Number

typealias MaxResultsIntegerForListDataSourceSyncJobsRequest = Number

typealias MaxResultsIntegerForListDataSourcesRequest = Number

typealias MaxResultsIntegerForListFaqsRequest = Number

typealias MaxResultsIntegerForListIndicesRequest = Number

typealias NextToken = String

typealias PrincipalList = Array<Principal>

typealias PrincipalName = String

typealias QueryId = String

typealias QueryResultItemList = Array<QueryResultItem>

typealias QueryText = String

typealias RelevanceFeedbackList = Array<RelevanceFeedback>

typealias ResultId = String

typealias RoleArn = String

typealias S3BucketName = String

typealias S3ObjectKey = String

typealias ScanSchedule = String

typealias SecretArn = String

typealias SecurityGroupIdList = Array<VpcSecurityGroupId>

typealias SharePointUrlList = Array<Url>

typealias String = String

typealias SubnetId = String

typealias SubnetIdList = Array<SubnetId>

typealias TableName = String

typealias Timestamp = Date

typealias Title = String

typealias Url = String

typealias ValueImportanceMapKey = String

typealias VpcSecurityGroupId = String

@JsModule("aws-sdk")
external open class Kendra(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Kendra.Types.ClientConfiguration */
    open fun batchDeleteDocument(params: BatchDeleteDocumentRequest, callback: (err: AWSError, data: BatchDeleteDocumentResponse) -> Unit = definedExternally): Request<BatchDeleteDocumentResponse, AWSError>
    open fun batchDeleteDocument(callback: (err: AWSError, data: BatchDeleteDocumentResponse) -> Unit = definedExternally): Request<BatchDeleteDocumentResponse, AWSError>
    open fun batchPutDocument(params: BatchPutDocumentRequest, callback: (err: AWSError, data: BatchPutDocumentResponse) -> Unit = definedExternally): Request<BatchPutDocumentResponse, AWSError>
    open fun batchPutDocument(callback: (err: AWSError, data: BatchPutDocumentResponse) -> Unit = definedExternally): Request<BatchPutDocumentResponse, AWSError>
    open fun createDataSource(params: CreateDataSourceRequest, callback: (err: AWSError, data: CreateDataSourceResponse) -> Unit = definedExternally): Request<CreateDataSourceResponse, AWSError>
    open fun createDataSource(callback: (err: AWSError, data: CreateDataSourceResponse) -> Unit = definedExternally): Request<CreateDataSourceResponse, AWSError>
    open fun createFaq(params: CreateFaqRequest, callback: (err: AWSError, data: CreateFaqResponse) -> Unit = definedExternally): Request<CreateFaqResponse, AWSError>
    open fun createFaq(callback: (err: AWSError, data: CreateFaqResponse) -> Unit = definedExternally): Request<CreateFaqResponse, AWSError>
    open fun createIndex(params: CreateIndexRequest, callback: (err: AWSError, data: CreateIndexResponse) -> Unit = definedExternally): Request<CreateIndexResponse, AWSError>
    open fun createIndex(callback: (err: AWSError, data: CreateIndexResponse) -> Unit = definedExternally): Request<CreateIndexResponse, AWSError>
    open fun deleteFaq(params: DeleteFaqRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteFaq(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIndex(params: DeleteIndexRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteIndex(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeDataSource(params: DescribeDataSourceRequest, callback: (err: AWSError, data: DescribeDataSourceResponse) -> Unit = definedExternally): Request<DescribeDataSourceResponse, AWSError>
    open fun describeDataSource(callback: (err: AWSError, data: DescribeDataSourceResponse) -> Unit = definedExternally): Request<DescribeDataSourceResponse, AWSError>
    open fun describeFaq(params: DescribeFaqRequest, callback: (err: AWSError, data: DescribeFaqResponse) -> Unit = definedExternally): Request<DescribeFaqResponse, AWSError>
    open fun describeFaq(callback: (err: AWSError, data: DescribeFaqResponse) -> Unit = definedExternally): Request<DescribeFaqResponse, AWSError>
    open fun describeIndex(params: DescribeIndexRequest, callback: (err: AWSError, data: DescribeIndexResponse) -> Unit = definedExternally): Request<DescribeIndexResponse, AWSError>
    open fun describeIndex(callback: (err: AWSError, data: DescribeIndexResponse) -> Unit = definedExternally): Request<DescribeIndexResponse, AWSError>
    open fun listDataSourceSyncJobs(params: ListDataSourceSyncJobsRequest, callback: (err: AWSError, data: ListDataSourceSyncJobsResponse) -> Unit = definedExternally): Request<ListDataSourceSyncJobsResponse, AWSError>
    open fun listDataSourceSyncJobs(callback: (err: AWSError, data: ListDataSourceSyncJobsResponse) -> Unit = definedExternally): Request<ListDataSourceSyncJobsResponse, AWSError>
    open fun listDataSources(params: ListDataSourcesRequest, callback: (err: AWSError, data: ListDataSourcesResponse) -> Unit = definedExternally): Request<ListDataSourcesResponse, AWSError>
    open fun listDataSources(callback: (err: AWSError, data: ListDataSourcesResponse) -> Unit = definedExternally): Request<ListDataSourcesResponse, AWSError>
    open fun listFaqs(params: ListFaqsRequest, callback: (err: AWSError, data: ListFaqsResponse) -> Unit = definedExternally): Request<ListFaqsResponse, AWSError>
    open fun listFaqs(callback: (err: AWSError, data: ListFaqsResponse) -> Unit = definedExternally): Request<ListFaqsResponse, AWSError>
    open fun listIndices(params: ListIndicesRequest, callback: (err: AWSError, data: ListIndicesResponse) -> Unit = definedExternally): Request<ListIndicesResponse, AWSError>
    open fun listIndices(callback: (err: AWSError, data: ListIndicesResponse) -> Unit = definedExternally): Request<ListIndicesResponse, AWSError>
    open fun query(params: QueryRequest, callback: (err: AWSError, data: QueryResult) -> Unit = definedExternally): Request<QueryResult, AWSError>
    open fun query(callback: (err: AWSError, data: QueryResult) -> Unit = definedExternally): Request<QueryResult, AWSError>
    open fun startDataSourceSyncJob(params: StartDataSourceSyncJobRequest, callback: (err: AWSError, data: StartDataSourceSyncJobResponse) -> Unit = definedExternally): Request<StartDataSourceSyncJobResponse, AWSError>
    open fun startDataSourceSyncJob(callback: (err: AWSError, data: StartDataSourceSyncJobResponse) -> Unit = definedExternally): Request<StartDataSourceSyncJobResponse, AWSError>
    open fun stopDataSourceSyncJob(params: StopDataSourceSyncJobRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopDataSourceSyncJob(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun submitFeedback(params: SubmitFeedbackRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun submitFeedback(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDataSource(params: UpdateDataSourceRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateDataSource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateIndex(params: UpdateIndexRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun updateIndex(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    interface AccessControlListConfiguration {
        var KeyPath: S3ObjectKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AclConfiguration {
        var AllowedGroupsColumnName: ColumnName
    }
    interface AdditionalResultAttribute {
        var Key: String
        var ValueType: String /* "TEXT_WITH_HIGHLIGHTS_VALUE" | String */
        var Value: AdditionalResultAttributeValue
    }
    interface AdditionalResultAttributeValue {
        var TextWithHighlightsValue: TextWithHighlights?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AttributeFilter {
        var AndAllFilters: AttributeFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var OrAllFilters: AttributeFilterList?
            get() = definedExternally
            set(value) = definedExternally
        var NotFilter: AttributeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var EqualsTo: DocumentAttribute?
            get() = definedExternally
            set(value) = definedExternally
        var ContainsAll: DocumentAttribute?
            get() = definedExternally
            set(value) = definedExternally
        var ContainsAny: DocumentAttribute?
            get() = definedExternally
            set(value) = definedExternally
        var GreaterThan: DocumentAttribute?
            get() = definedExternally
            set(value) = definedExternally
        var GreaterThanOrEquals: DocumentAttribute?
            get() = definedExternally
            set(value) = definedExternally
        var LessThan: DocumentAttribute?
            get() = definedExternally
            set(value) = definedExternally
        var LessThanOrEquals: DocumentAttribute?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteDocumentRequest {
        var IndexId: IndexId
        var DocumentIdList: DocumentIdList
    }
    interface BatchDeleteDocumentResponse {
        var FailedDocuments: BatchDeleteDocumentResponseFailedDocuments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchDeleteDocumentResponseFailedDocument {
        var Id: DocumentId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "InternalError" | "InvalidRequest" | String */
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchPutDocumentRequest {
        var IndexId: IndexId
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Documents: DocumentList
    }
    interface BatchPutDocumentResponse {
        var FailedDocuments: BatchPutDocumentResponseFailedDocuments?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchPutDocumentResponseFailedDocument {
        var Id: DocumentId?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "InternalError" | "InvalidRequest" | String */
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClickFeedback {
        var ResultId: ResultId
        var ClickTime: Timestamp
    }
    interface ColumnConfiguration {
        var DocumentIdColumnName: ColumnName
        var DocumentDataColumnName: ColumnName
        var DocumentTitleColumnName: ColumnName?
            get() = definedExternally
            set(value) = definedExternally
        var FieldMappings: DataSourceToIndexFieldMappingList?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeDetectingColumns: ChangeDetectingColumns
    }
    interface ConnectionConfiguration {
        var DatabaseHost: DatabaseHost
        var DatabasePort: DatabasePort
        var DatabaseName: DatabaseName
        var TableName: TableName
        var SecretArn: SecretArn
    }
    interface CreateDataSourceRequest {
        var Name: DataSourceName
        var IndexId: IndexId
        var Type: String /* "S3" | "SHAREPOINT" | "DATABASE" | String */
        var Configuration: DataSourceConfiguration
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: ScanSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn
    }
    interface CreateDataSourceResponse {
        var Id: DataSourceId
    }
    interface CreateFaqRequest {
        var IndexId: IndexId
        var Name: FaqName
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var S3Path: S3Path
        var RoleArn: RoleArn
    }
    interface CreateFaqResponse {
        var Id: FaqId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIndexRequest {
        var Name: IndexName
        var RoleArn: RoleArn
        var ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateIndexResponse {
        var Id: IndexId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSourceConfiguration {
        var S3Configuration: S3DataSourceConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var SharePointConfiguration: SharePointConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var DatabaseConfiguration: DatabaseConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSourceSummary {
        var Name: DataSourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Id: DataSourceId?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "S3" | "SHAREPOINT" | "DATABASE" | String */
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "DELETING" | "FAILED" | "UPDATING" | "ACTIVE" | String */
    }
    interface DataSourceSyncJob {
        var ExecutionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "FAILED" | "SUCCEEDED" | "SYNCING" | "INCOMPLETE" | "STOPPING" | "ABORTED" | String */
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "InternalError" | "InvalidRequest" | String */
        var DataSourceErrorCode: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DataSourceToIndexFieldMapping {
        var DataSourceFieldName: DataSourceFieldName
        var DateFieldFormat: DataSourceDateFieldFormat?
            get() = definedExternally
            set(value) = definedExternally
        var IndexFieldName: IndexFieldName
    }
    interface DataSourceVpcConfiguration {
        var SubnetIds: SubnetIdList
        var SecurityGroupIds: SecurityGroupIdList
    }
    interface DatabaseConfiguration {
        var DatabaseEngineType: String /* "RDS_AURORA_MYSQL" | "RDS_AURORA_POSTGRESQL" | "RDS_MYSQL" | "RDS_POSTGRESQL" | String */
        var ConnectionConfiguration: ConnectionConfiguration
        var VpcConfiguration: DataSourceVpcConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var ColumnConfiguration: ColumnConfiguration
        var AclConfiguration: AclConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteFaqRequest {
        var Id: FaqId
        var IndexId: IndexId
    }
    interface DeleteIndexRequest {
        var Id: IndexId
    }
    interface DescribeDataSourceRequest {
        var Id: DataSourceId
        var IndexId: IndexId
    }
    interface DescribeDataSourceResponse {
        var Id: DataSourceId?
            get() = definedExternally
            set(value) = definedExternally
        var IndexId: IndexId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: DataSourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "S3" | "SHAREPOINT" | "DATABASE" | String */
        var Configuration: DataSourceConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "DELETING" | "FAILED" | "UPDATING" | "ACTIVE" | String */
        var Schedule: ScanSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeFaqRequest {
        var Id: FaqId
        var IndexId: IndexId
    }
    interface DescribeFaqResponse {
        var Id: FaqId?
            get() = definedExternally
            set(value) = definedExternally
        var IndexId: IndexId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: FaqName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var S3Path: S3Path?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "UPDATING" | "ACTIVE" | "DELETING" | "FAILED" | String */
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeIndexRequest {
        var Id: IndexId
    }
    interface DescribeIndexResponse {
        var Name: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var Id: IndexId?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "ACTIVE" | "DELETING" | "FAILED" | "SYSTEM_UPDATING" | String */
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentMetadataConfigurations: DocumentMetadataConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
        var IndexStatistics: IndexStatistics?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Document {
        var Id: DocumentId
        var Title: Title?
            get() = definedExternally
            set(value) = definedExternally
        var Blob: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var S3Path: S3Path?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: DocumentAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var AccessControlList: PrincipalList?
            get() = definedExternally
            set(value) = definedExternally
        var ContentType: String /* "PDF" | "HTML" | "MS_WORD" | "PLAIN_TEXT" | "PPT" | String */
    }
    interface DocumentAttribute {
        var Key: DocumentAttributeKey
        var Value: DocumentAttributeValue
    }
    interface DocumentAttributeValue {
        var StringValue: DocumentAttributeStringValue?
            get() = definedExternally
            set(value) = definedExternally
        var StringListValue: DocumentAttributeStringListValue?
            get() = definedExternally
            set(value) = definedExternally
        var LongValue: Long?
            get() = definedExternally
            set(value) = definedExternally
        var DateValue: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentAttributeValueCountPair {
        var DocumentAttributeValue: DocumentAttributeValue?
            get() = definedExternally
            set(value) = definedExternally
        var Count: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentMetadataConfiguration {
        var Name: DocumentMetadataConfigurationName
        var Type: String /* "STRING_VALUE" | "STRING_LIST_VALUE" | "LONG_VALUE" | "DATE_VALUE" | String */
        var Relevance: Relevance?
            get() = definedExternally
            set(value) = definedExternally
        var Search: Search?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentsMetadataConfiguration {
        var S3Prefix: S3ObjectKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Facet {
        var DocumentAttributeKey: DocumentAttributeKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FacetResult {
        var DocumentAttributeKey: DocumentAttributeKey?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentAttributeValueCountPairs: DocumentAttributeValueCountPairList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FaqStatistics {
        var IndexedQuestionAnswersCount: IndexedQuestionAnswersCount
    }
    interface FaqSummary {
        var Id: FaqId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: FaqName?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CREATING" | "UPDATING" | "ACTIVE" | "DELETING" | "FAILED" | String */
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var UpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Highlight {
        var BeginOffset: Integer
        var EndOffset: Integer
        var TopAnswer: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface IndexConfigurationSummary {
        var Name: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var Id: IndexId?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp
        var UpdatedAt: Timestamp
        var Status: String /* "CREATING" | "ACTIVE" | "DELETING" | "FAILED" | "SYSTEM_UPDATING" | String */
    }
    interface IndexStatistics {
        var FaqStatistics: FaqStatistics
        var TextDocumentStatistics: TextDocumentStatistics
    }
    interface ListDataSourceSyncJobsRequest {
        var Id: DataSourceId
        var IndexId: IndexId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsIntegerForListDataSourceSyncJobsRequest?
            get() = definedExternally
            set(value) = definedExternally
        var StartTimeFilter: TimeRange?
            get() = definedExternally
            set(value) = definedExternally
        var StatusFilter: String /* "FAILED" | "SUCCEEDED" | "SYNCING" | "INCOMPLETE" | "STOPPING" | "ABORTED" | String */
    }
    interface ListDataSourceSyncJobsResponse {
        var History: DataSourceSyncJobHistoryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSourcesRequest {
        var IndexId: IndexId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsIntegerForListDataSourcesRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDataSourcesResponse {
        var SummaryItems: DataSourceSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFaqsRequest {
        var IndexId: IndexId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsIntegerForListFaqsRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListFaqsResponse {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var FaqSummaryItems: FaqSummaryItems?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIndicesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsIntegerForListIndicesRequest?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListIndicesResponse {
        var IndexConfigurationSummaryItems: IndexConfigurationSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Principal {
        var Name: PrincipalName
        var Type: String /* "USER" | "GROUP" | String */
        var Access: String /* "ALLOW" | "DENY" | String */
    }
    interface QueryRequest {
        var IndexId: IndexId
        var QueryText: QueryText
        var AttributeFilter: AttributeFilter?
            get() = definedExternally
            set(value) = definedExternally
        var Facets: FacetList?
            get() = definedExternally
            set(value) = definedExternally
        var RequestedDocumentAttributes: DocumentAttributeKeyList?
            get() = definedExternally
            set(value) = definedExternally
        var QueryResultTypeFilter: String /* "DOCUMENT" | "QUESTION_ANSWER" | "ANSWER" | String */
        var PageNumber: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var PageSize: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryResult {
        var QueryId: QueryId?
            get() = definedExternally
            set(value) = definedExternally
        var ResultItems: QueryResultItemList?
            get() = definedExternally
            set(value) = definedExternally
        var FacetResults: FacetResultList?
            get() = definedExternally
            set(value) = definedExternally
        var TotalNumberOfResults: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryResultItem {
        var Id: ResultId?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "DOCUMENT" | "QUESTION_ANSWER" | "ANSWER" | String */
        var AdditionalAttributes: AdditionalResultAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentId: DocumentId?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentTitle: TextWithHighlights?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentExcerpt: TextWithHighlights?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentURI: Url?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentAttributes: DocumentAttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Relevance {
        var Freshness: DocumentMetadataBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var Importance: Importance?
            get() = definedExternally
            set(value) = definedExternally
        var Duration: Duration?
            get() = definedExternally
            set(value) = definedExternally
        var RankOrder: String /* "ASCENDING" | "DESCENDING" | String */
        var ValueImportanceMap: ValueImportanceMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RelevanceFeedback {
        var ResultId: ResultId
        var RelevanceValue: String /* "RELEVANT" | "NOT_RELEVANT" | String */
    }
    interface S3DataSourceConfiguration {
        var BucketName: S3BucketName
        var InclusionPrefixes: DataSourceInclusionsExclusionsStrings?
            get() = definedExternally
            set(value) = definedExternally
        var ExclusionPatterns: DataSourceInclusionsExclusionsStrings?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentsMetadataConfiguration: DocumentsMetadataConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var AccessControlListConfiguration: AccessControlListConfiguration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Path {
        var Bucket: S3BucketName
        var Key: S3ObjectKey
    }
    interface Search {
        var Facetable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Searchable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var Displayable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ServerSideEncryptionConfiguration {
        var KmsKeyId: KmsKeyId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SharePointConfiguration {
        var SharePointVersion: String /* "SHAREPOINT_ONLINE" | String */
        var Urls: SharePointUrlList
        var SecretArn: SecretArn
        var CrawlAttachments: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var VpcConfiguration: DataSourceVpcConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var FieldMappings: DataSourceToIndexFieldMappingList?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentTitleFieldName: DataSourceFieldName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDataSourceSyncJobRequest {
        var Id: DataSourceId
        var IndexId: IndexId
    }
    interface StartDataSourceSyncJobResponse {
        var ExecutionId: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopDataSourceSyncJobRequest {
        var Id: DataSourceId
        var IndexId: IndexId
    }
    interface SubmitFeedbackRequest {
        var IndexId: IndexId
        var QueryId: QueryId
        var ClickFeedbackItems: ClickFeedbackList?
            get() = definedExternally
            set(value) = definedExternally
        var RelevanceFeedbackItems: RelevanceFeedbackList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TextDocumentStatistics {
        var IndexedTextDocumentsCount: IndexedTextDocumentsCount
    }
    interface TextWithHighlights {
        var Text: String?
            get() = definedExternally
            set(value) = definedExternally
        var Highlights: HighlightList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TimeRange {
        var StartTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDataSourceRequest {
        var Id: DataSourceId
        var Name: DataSourceName?
            get() = definedExternally
            set(value) = definedExternally
        var IndexId: IndexId
        var Configuration: DataSourceConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Schedule: ScanSchedule?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateIndexRequest {
        var Id: IndexId
        var Name: IndexName?
            get() = definedExternally
            set(value) = definedExternally
        var RoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentMetadataConfigurationUpdates: DocumentMetadataConfigurationList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValueImportanceMap {
        @nativeGetter
        operator fun get(key: String): Importance?
        @nativeSetter
        operator fun set(key: String, value: Importance)
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-02-03" | "latest" | String */
    }
}