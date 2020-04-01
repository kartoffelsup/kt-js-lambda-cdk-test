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
import CUR.ReportDefinition
import CUR.DeleteReportDefinitionRequest
import CUR.DeleteReportDefinitionResponse
import CUR.DescribeReportDefinitionsRequest
import CUR.DescribeReportDefinitionsResponse
import CUR.ModifyReportDefinitionRequest
import CUR.ModifyReportDefinitionResponse
import CUR.PutReportDefinitionRequest
import CUR.PutReportDefinitionResponse

typealias AdditionalArtifactList = Array<String /* "REDSHIFT" | "QUICKSIGHT" | "ATHENA" | String */>

typealias DeleteResponseMessage = String

typealias GenericString = String

typealias MaxResults = Number

typealias RefreshClosedReports = Boolean

typealias ReportDefinitionList = Array<ReportDefinition>

typealias ReportName = String

typealias S3Bucket = String

typealias S3Prefix = String

typealias SchemaElementList = Array<String /* "RESOURCES" | String */>

@JsModule("aws-sdk")
external open class CUR(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CUR.Types.ClientConfiguration */
    open fun deleteReportDefinition(params: DeleteReportDefinitionRequest, callback: (err: AWSError, data: DeleteReportDefinitionResponse) -> Unit = definedExternally): Request<DeleteReportDefinitionResponse, AWSError>
    open fun deleteReportDefinition(callback: (err: AWSError, data: DeleteReportDefinitionResponse) -> Unit = definedExternally): Request<DeleteReportDefinitionResponse, AWSError>
    open fun describeReportDefinitions(params: DescribeReportDefinitionsRequest, callback: (err: AWSError, data: DescribeReportDefinitionsResponse) -> Unit = definedExternally): Request<DescribeReportDefinitionsResponse, AWSError>
    open fun describeReportDefinitions(callback: (err: AWSError, data: DescribeReportDefinitionsResponse) -> Unit = definedExternally): Request<DescribeReportDefinitionsResponse, AWSError>
    open fun modifyReportDefinition(params: ModifyReportDefinitionRequest, callback: (err: AWSError, data: ModifyReportDefinitionResponse) -> Unit = definedExternally): Request<ModifyReportDefinitionResponse, AWSError>
    open fun modifyReportDefinition(callback: (err: AWSError, data: ModifyReportDefinitionResponse) -> Unit = definedExternally): Request<ModifyReportDefinitionResponse, AWSError>
    open fun putReportDefinition(params: PutReportDefinitionRequest, callback: (err: AWSError, data: PutReportDefinitionResponse) -> Unit = definedExternally): Request<PutReportDefinitionResponse, AWSError>
    open fun putReportDefinition(callback: (err: AWSError, data: PutReportDefinitionResponse) -> Unit = definedExternally): Request<PutReportDefinitionResponse, AWSError>
    interface DeleteReportDefinitionRequest {
        var ReportName: ReportName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteReportDefinitionResponse {
        var ResponseMessage: DeleteResponseMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReportDefinitionsRequest {
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeReportDefinitionsResponse {
        var ReportDefinitions: ReportDefinitionList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: GenericString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModifyReportDefinitionRequest {
        var ReportName: ReportName
        var ReportDefinition: ReportDefinition
    }
    interface ModifyReportDefinitionResponse
    interface PutReportDefinitionRequest {
        var ReportDefinition: ReportDefinition
    }
    interface PutReportDefinitionResponse
    interface ReportDefinition {
        var ReportName: ReportName
        var TimeUnit: String /* "HOURLY" | "DAILY" | String */
        var Format: String /* "textORcsv" | "Parquet" | String */
        var Compression: String /* "ZIP" | "GZIP" | "Parquet" | String */
        var AdditionalSchemaElements: SchemaElementList
        var S3Bucket: S3Bucket
        var S3Prefix: S3Prefix
        var S3Region: String /* "us-east-1" | "us-west-1" | "us-west-2" | "eu-central-1" | "eu-west-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "eu-north-1" | "ap-northeast-3" | "ap-east-1" | String */
        var AdditionalArtifacts: AdditionalArtifactList?
            get() = definedExternally
            set(value) = definedExternally
        var RefreshClosedReports: RefreshClosedReports?
            get() = definedExternally
            set(value) = definedExternally
        var ReportVersioning: String /* "CREATE_NEW_REPORT" | "OVERWRITE_REPORT" | String */
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-01-06" | "latest" | String */
    }
}