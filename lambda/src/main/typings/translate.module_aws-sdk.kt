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
import Translate.AppliedTerminology
import Translate.Term
import Translate.TerminologyProperties
import Translate.TextTranslationJobProperties
import Translate.DeleteTerminologyRequest
import Translate.DescribeTextTranslationJobRequest
import Translate.DescribeTextTranslationJobResponse
import Translate.GetTerminologyRequest
import Translate.GetTerminologyResponse
import Translate.ImportTerminologyRequest
import Translate.ImportTerminologyResponse
import Translate.ListTerminologiesRequest
import Translate.ListTerminologiesResponse
import Translate.ListTextTranslationJobsRequest
import Translate.ListTextTranslationJobsResponse
import Translate.StartTextTranslationJobRequest
import Translate.StartTextTranslationJobResponse
import Translate.StopTextTranslationJobRequest
import Translate.StopTextTranslationJobResponse
import Translate.TranslateTextRequest
import Translate.TranslateTextResponse
import Translate.TerminologyDataLocation
import Translate.TerminologyData
import Translate.EncryptionKey
import Translate.TextTranslationJobFilter
import Translate.InputDataConfig
import Translate.OutputDataConfig
import Translate.JobDetails

typealias AppliedTerminologyList = Array<AppliedTerminology>

typealias BoundedLengthString = String

typealias ClientTokenString = String

typealias ContentType = String

typealias Description = String

typealias EncryptionKeyID = String

typealias IamRoleArn = String

typealias Integer = Number

typealias JobId = String

typealias JobName = String

typealias LanguageCodeString = String

typealias LanguageCodeStringList = Array<LanguageCodeString>

typealias MaxResultsInteger = Number

typealias NextToken = String

typealias ResourceName = String

typealias ResourceNameList = Array<ResourceName>

typealias S3Uri = String

typealias String = String

typealias TargetLanguageCodeStringList = Array<LanguageCodeString>

typealias TermList = Array<Term>

typealias TerminologyArn = String

typealias TerminologyPropertiesList = Array<TerminologyProperties>

typealias TextTranslationJobPropertiesList = Array<TextTranslationJobProperties>

typealias Timestamp = Date

typealias UnboundedLengthString = String

@JsModule("aws-sdk")
external open class Translate(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Translate.Types.ClientConfiguration */
    open fun deleteTerminology(params: DeleteTerminologyRequest, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteTerminology(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeTextTranslationJob(params: DescribeTextTranslationJobRequest, callback: (err: AWSError, data: DescribeTextTranslationJobResponse) -> Unit = definedExternally): Request<DescribeTextTranslationJobResponse, AWSError>
    open fun describeTextTranslationJob(callback: (err: AWSError, data: DescribeTextTranslationJobResponse) -> Unit = definedExternally): Request<DescribeTextTranslationJobResponse, AWSError>
    open fun getTerminology(params: GetTerminologyRequest, callback: (err: AWSError, data: GetTerminologyResponse) -> Unit = definedExternally): Request<GetTerminologyResponse, AWSError>
    open fun getTerminology(callback: (err: AWSError, data: GetTerminologyResponse) -> Unit = definedExternally): Request<GetTerminologyResponse, AWSError>
    open fun importTerminology(params: ImportTerminologyRequest, callback: (err: AWSError, data: ImportTerminologyResponse) -> Unit = definedExternally): Request<ImportTerminologyResponse, AWSError>
    open fun importTerminology(callback: (err: AWSError, data: ImportTerminologyResponse) -> Unit = definedExternally): Request<ImportTerminologyResponse, AWSError>
    open fun listTerminologies(params: ListTerminologiesRequest, callback: (err: AWSError, data: ListTerminologiesResponse) -> Unit = definedExternally): Request<ListTerminologiesResponse, AWSError>
    open fun listTerminologies(callback: (err: AWSError, data: ListTerminologiesResponse) -> Unit = definedExternally): Request<ListTerminologiesResponse, AWSError>
    open fun listTextTranslationJobs(params: ListTextTranslationJobsRequest, callback: (err: AWSError, data: ListTextTranslationJobsResponse) -> Unit = definedExternally): Request<ListTextTranslationJobsResponse, AWSError>
    open fun listTextTranslationJobs(callback: (err: AWSError, data: ListTextTranslationJobsResponse) -> Unit = definedExternally): Request<ListTextTranslationJobsResponse, AWSError>
    open fun startTextTranslationJob(params: StartTextTranslationJobRequest, callback: (err: AWSError, data: StartTextTranslationJobResponse) -> Unit = definedExternally): Request<StartTextTranslationJobResponse, AWSError>
    open fun startTextTranslationJob(callback: (err: AWSError, data: StartTextTranslationJobResponse) -> Unit = definedExternally): Request<StartTextTranslationJobResponse, AWSError>
    open fun stopTextTranslationJob(params: StopTextTranslationJobRequest, callback: (err: AWSError, data: StopTextTranslationJobResponse) -> Unit = definedExternally): Request<StopTextTranslationJobResponse, AWSError>
    open fun stopTextTranslationJob(callback: (err: AWSError, data: StopTextTranslationJobResponse) -> Unit = definedExternally): Request<StopTextTranslationJobResponse, AWSError>
    open fun translateText(params: TranslateTextRequest, callback: (err: AWSError, data: TranslateTextResponse) -> Unit = definedExternally): Request<TranslateTextResponse, AWSError>
    open fun translateText(callback: (err: AWSError, data: TranslateTextResponse) -> Unit = definedExternally): Request<TranslateTextResponse, AWSError>
    interface AppliedTerminology {
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Terms: TermList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteTerminologyRequest {
        var Name: ResourceName
    }
    interface DescribeTextTranslationJobRequest {
        var JobId: JobId
    }
    interface DescribeTextTranslationJobResponse {
        var TextTranslationJobProperties: TextTranslationJobProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EncryptionKey {
        var Type: String /* "KMS" | String */
        var Id: EncryptionKeyID
    }
    interface GetTerminologyRequest {
        var Name: ResourceName
        var TerminologyDataFormat: String /* "CSV" | "TMX" | String */
    }
    interface GetTerminologyResponse {
        var TerminologyProperties: TerminologyProperties?
            get() = definedExternally
            set(value) = definedExternally
        var TerminologyDataLocation: TerminologyDataLocation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportTerminologyRequest {
        var Name: ResourceName
        var MergeStrategy: String /* "OVERWRITE" | String */
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var TerminologyData: TerminologyData
        var EncryptionKey: EncryptionKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ImportTerminologyResponse {
        var TerminologyProperties: TerminologyProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputDataConfig {
        var S3Uri: S3Uri
        var ContentType: ContentType
    }
    interface JobDetails {
        var TranslatedDocumentsCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentsWithErrorsCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var InputDocumentsCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTerminologiesRequest {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTerminologiesResponse {
        var TerminologyPropertiesList: TerminologyPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTextTranslationJobsRequest {
        var Filter: TextTranslationJobFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTextTranslationJobsResponse {
        var TextTranslationJobPropertiesList: TextTranslationJobPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputDataConfig {
        var S3Uri: S3Uri
    }
    interface StartTextTranslationJobRequest {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig
        var OutputDataConfig: OutputDataConfig
        var DataAccessRoleArn: IamRoleArn
        var SourceLanguageCode: LanguageCodeString
        var TargetLanguageCodes: TargetLanguageCodeStringList
        var TerminologyNames: ResourceNameList?
            get() = definedExternally
            set(value) = definedExternally
        var ClientToken: ClientTokenString
    }
    interface StartTextTranslationJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERROR" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface StopTextTranslationJobRequest {
        var JobId: JobId
    }
    interface StopTextTranslationJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERROR" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
    }
    interface Term {
        var SourceText: String?
            get() = definedExternally
            set(value) = definedExternally
        var TargetText: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TerminologyData {
        var File: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var Format: String /* "CSV" | "TMX" | String */
    }
    interface TerminologyDataLocation {
        var RepositoryType: String
        var Location: String
    }
    interface TerminologyProperties {
        var Name: ResourceName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: TerminologyArn?
            get() = definedExternally
            set(value) = definedExternally
        var SourceLanguageCode: LanguageCodeString?
            get() = definedExternally
            set(value) = definedExternally
        var TargetLanguageCodes: LanguageCodeStringList?
            get() = definedExternally
            set(value) = definedExternally
        var EncryptionKey: EncryptionKey?
            get() = definedExternally
            set(value) = definedExternally
        var SizeBytes: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var TermCount: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var CreatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TextTranslationJobFilter {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERROR" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var SubmittedBeforeTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmittedAfterTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TextTranslationJobProperties {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "COMPLETED_WITH_ERROR" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var JobDetails: JobDetails?
            get() = definedExternally
            set(value) = definedExternally
        var SourceLanguageCode: LanguageCodeString?
            get() = definedExternally
            set(value) = definedExternally
        var TargetLanguageCodes: TargetLanguageCodeStringList?
            get() = definedExternally
            set(value) = definedExternally
        var TerminologyNames: ResourceNameList?
            get() = definedExternally
            set(value) = definedExternally
        var Message: UnboundedLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var SubmittedTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var DataAccessRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TranslateTextRequest {
        var Text: BoundedLengthString
        var TerminologyNames: ResourceNameList?
            get() = definedExternally
            set(value) = definedExternally
        var SourceLanguageCode: LanguageCodeString
        var TargetLanguageCode: LanguageCodeString
    }
    interface TranslateTextResponse {
        var TranslatedText: String
        var SourceLanguageCode: LanguageCodeString
        var TargetLanguageCode: LanguageCodeString
        var AppliedTerminologies: AppliedTerminologyList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2017-07-01" | "latest" | String */
    }
}