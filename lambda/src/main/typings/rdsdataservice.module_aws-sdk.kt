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
import RDSDataService.ArrayValue
import RDSDataService.Value
import RDSDataService.Field
import RDSDataService.ColumnMetadata
import RDSDataService.Record
import RDSDataService.SqlParameter
import RDSDataService.SqlStatementResult
import RDSDataService.UpdateResult
import RDSDataService.BatchExecuteStatementRequest
import RDSDataService.BatchExecuteStatementResponse
import RDSDataService.BeginTransactionRequest
import RDSDataService.BeginTransactionResponse
import RDSDataService.CommitTransactionRequest
import RDSDataService.CommitTransactionResponse
import RDSDataService.ExecuteSqlRequest
import RDSDataService.ExecuteSqlResponse
import RDSDataService.ExecuteStatementRequest
import RDSDataService.ExecuteStatementResponse
import RDSDataService.RollbackTransactionRequest
import RDSDataService.RollbackTransactionResponse
import RDSDataService.ResultSetOptions
import RDSDataService.ResultSetMetadata
import RDSDataService.ResultFrame
import RDSDataService.StructValue

typealias Arn = String

typealias ArrayOfArray = Array<ArrayValue>

typealias ArrayValueList = Array<Value>

typealias Boolean = Boolean

typealias BooleanArray = Array<BoxedBoolean>

typealias BoxedBoolean = Boolean

typealias BoxedDouble = Number

typealias BoxedFloat = Number

typealias BoxedInteger = Number

typealias BoxedLong = Number

typealias DbName = String

typealias DoubleArray = Array<BoxedDouble>

typealias FieldList = Array<Field>

typealias Id = String

typealias Integer = Number

typealias Long = Number

typealias LongArray = Array<BoxedLong>

typealias Metadata = Array<ColumnMetadata>

typealias ParameterName = String

typealias Records = Array<Record>

typealias RecordsUpdated = Number

typealias Row = Array<Value>

typealias SqlParameterSets = Array<SqlParametersList>

typealias SqlParametersList = Array<SqlParameter>

typealias SqlRecords = Array<FieldList>

typealias SqlStatement = String

typealias SqlStatementResults = Array<SqlStatementResult>

typealias String = String

typealias StringArray = Array<String>

typealias TransactionStatus = String

typealias UpdateResults = Array<UpdateResult>

@JsModule("aws-sdk")
external open class RDSDataService(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & RDSDataService.Types.ClientConfiguration */
    open fun batchExecuteStatement(params: BatchExecuteStatementRequest, callback: (err: AWSError, data: BatchExecuteStatementResponse) -> Unit = definedExternally): Request<BatchExecuteStatementResponse, AWSError>
    open fun batchExecuteStatement(callback: (err: AWSError, data: BatchExecuteStatementResponse) -> Unit = definedExternally): Request<BatchExecuteStatementResponse, AWSError>
    open fun beginTransaction(params: BeginTransactionRequest, callback: (err: AWSError, data: BeginTransactionResponse) -> Unit = definedExternally): Request<BeginTransactionResponse, AWSError>
    open fun beginTransaction(callback: (err: AWSError, data: BeginTransactionResponse) -> Unit = definedExternally): Request<BeginTransactionResponse, AWSError>
    open fun commitTransaction(params: CommitTransactionRequest, callback: (err: AWSError, data: CommitTransactionResponse) -> Unit = definedExternally): Request<CommitTransactionResponse, AWSError>
    open fun commitTransaction(callback: (err: AWSError, data: CommitTransactionResponse) -> Unit = definedExternally): Request<CommitTransactionResponse, AWSError>
    open fun executeSql(params: ExecuteSqlRequest, callback: (err: AWSError, data: ExecuteSqlResponse) -> Unit = definedExternally): Request<ExecuteSqlResponse, AWSError>
    open fun executeSql(callback: (err: AWSError, data: ExecuteSqlResponse) -> Unit = definedExternally): Request<ExecuteSqlResponse, AWSError>
    open fun executeStatement(params: ExecuteStatementRequest, callback: (err: AWSError, data: ExecuteStatementResponse) -> Unit = definedExternally): Request<ExecuteStatementResponse, AWSError>
    open fun executeStatement(callback: (err: AWSError, data: ExecuteStatementResponse) -> Unit = definedExternally): Request<ExecuteStatementResponse, AWSError>
    open fun rollbackTransaction(params: RollbackTransactionRequest, callback: (err: AWSError, data: RollbackTransactionResponse) -> Unit = definedExternally): Request<RollbackTransactionResponse, AWSError>
    open fun rollbackTransaction(callback: (err: AWSError, data: RollbackTransactionResponse) -> Unit = definedExternally): Request<RollbackTransactionResponse, AWSError>
    interface ArrayValue {
        var arrayValues: ArrayOfArray?
            get() = definedExternally
            set(value) = definedExternally
        var booleanValues: BooleanArray?
            get() = definedExternally
            set(value) = definedExternally
        var doubleValues: DoubleArray?
            get() = definedExternally
            set(value) = definedExternally
        var longValues: LongArray?
            get() = definedExternally
            set(value) = definedExternally
        var stringValues: StringArray?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchExecuteStatementRequest {
        var database: DbName?
            get() = definedExternally
            set(value) = definedExternally
        var parameterSets: SqlParameterSets?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArn: Arn
        var schema: DbName?
            get() = definedExternally
            set(value) = definedExternally
        var secretArn: Arn
        var sql: SqlStatement
        var transactionId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchExecuteStatementResponse {
        var updateResults: UpdateResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BeginTransactionRequest {
        var database: DbName?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArn: Arn
        var schema: DbName?
            get() = definedExternally
            set(value) = definedExternally
        var secretArn: Arn
    }
    interface BeginTransactionResponse {
        var transactionId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ColumnMetadata {
        var arrayBaseColumnType: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var isAutoIncrement: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var isCaseSensitive: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var isCurrency: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var isSigned: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var label: String?
            get() = definedExternally
            set(value) = definedExternally
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var nullable: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var precision: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var scale: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var schemaName: String?
            get() = definedExternally
            set(value) = definedExternally
        var tableName: String?
            get() = definedExternally
            set(value) = definedExternally
        var type: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var typeName: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CommitTransactionRequest {
        var resourceArn: Arn
        var secretArn: Arn
        var transactionId: Id
    }
    interface CommitTransactionResponse {
        var transactionStatus: TransactionStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecuteSqlRequest {
        var awsSecretStoreArn: Arn
        var database: DbName?
            get() = definedExternally
            set(value) = definedExternally
        var dbClusterOrInstanceArn: Arn
        var schema: DbName?
            get() = definedExternally
            set(value) = definedExternally
        var sqlStatements: SqlStatement
    }
    interface ExecuteSqlResponse {
        var sqlStatementResults: SqlStatementResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecuteStatementRequest {
        var continueAfterTimeout: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var database: DbName?
            get() = definedExternally
            set(value) = definedExternally
        var includeResultMetadata: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var parameters: SqlParametersList?
            get() = definedExternally
            set(value) = definedExternally
        var resourceArn: Arn
        var resultSetOptions: ResultSetOptions?
            get() = definedExternally
            set(value) = definedExternally
        var schema: DbName?
            get() = definedExternally
            set(value) = definedExternally
        var secretArn: Arn
        var sql: SqlStatement
        var transactionId: Id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecuteStatementResponse {
        var columnMetadata: Metadata?
            get() = definedExternally
            set(value) = definedExternally
        var generatedFields: FieldList?
            get() = definedExternally
            set(value) = definedExternally
        var numberOfRecordsUpdated: RecordsUpdated?
            get() = definedExternally
            set(value) = definedExternally
        var records: SqlRecords?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Field {
        var arrayValue: ArrayValue?
            get() = definedExternally
            set(value) = definedExternally
        var blobValue: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var booleanValue: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var doubleValue: BoxedDouble?
            get() = definedExternally
            set(value) = definedExternally
        var isNull: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var longValue: BoxedLong?
            get() = definedExternally
            set(value) = definedExternally
        var stringValue: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Record {
        var values: Row?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResultFrame {
        var records: Records?
            get() = definedExternally
            set(value) = definedExternally
        var resultSetMetadata: ResultSetMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResultSetMetadata {
        var columnCount: Long?
            get() = definedExternally
            set(value) = definedExternally
        var columnMetadata: Metadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResultSetOptions {
        var decimalReturnType: String /* "DOUBLE_OR_LONG" | "STRING" | String */
    }
    interface RollbackTransactionRequest {
        var resourceArn: Arn
        var secretArn: Arn
        var transactionId: Id
    }
    interface RollbackTransactionResponse {
        var transactionStatus: TransactionStatus?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SqlParameter {
        var name: ParameterName?
            get() = definedExternally
            set(value) = definedExternally
        var typeHint: String /* "DATE" | "DECIMAL" | "TIME" | "TIMESTAMP" | String */
        var value: Field?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SqlStatementResult {
        var numberOfRecordsUpdated: RecordsUpdated?
            get() = definedExternally
            set(value) = definedExternally
        var resultFrame: ResultFrame?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StructValue {
        var attributes: ArrayValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateResult {
        var generatedFields: FieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Value {
        var arrayValues: ArrayValueList?
            get() = definedExternally
            set(value) = definedExternally
        var bigIntValue: BoxedLong?
            get() = definedExternally
            set(value) = definedExternally
        var bitValue: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var blobValue: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var doubleValue: BoxedDouble?
            get() = definedExternally
            set(value) = definedExternally
        var intValue: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var isNull: BoxedBoolean?
            get() = definedExternally
            set(value) = definedExternally
        var realValue: BoxedFloat?
            get() = definedExternally
            set(value) = definedExternally
        var stringValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var structValue: StructValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-08-01" | "latest" | String */
    }
}