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
import ComprehendMedical.Attribute
import ComprehendMedical.ComprehendMedicalAsyncJobProperties
import ComprehendMedical.Entity
import ComprehendMedical.ICD10CMAttribute
import ComprehendMedical.ICD10CMConcept
import ComprehendMedical.ICD10CMEntity
import ComprehendMedical.ICD10CMTrait
import ComprehendMedical.RxNormAttribute
import ComprehendMedical.RxNormConcept
import ComprehendMedical.RxNormEntity
import ComprehendMedical.RxNormTrait
import ComprehendMedical.Trait
import ComprehendMedical.UnmappedAttribute
import ComprehendMedical.DescribeEntitiesDetectionV2JobRequest
import ComprehendMedical.DescribeEntitiesDetectionV2JobResponse
import ComprehendMedical.DescribePHIDetectionJobRequest
import ComprehendMedical.DescribePHIDetectionJobResponse
import ComprehendMedical.DetectEntitiesRequest
import ComprehendMedical.DetectEntitiesResponse
import ComprehendMedical.DetectEntitiesV2Request
import ComprehendMedical.DetectEntitiesV2Response
import ComprehendMedical.DetectPHIRequest
import ComprehendMedical.DetectPHIResponse
import ComprehendMedical.InferICD10CMRequest
import ComprehendMedical.InferICD10CMResponse
import ComprehendMedical.InferRxNormRequest
import ComprehendMedical.InferRxNormResponse
import ComprehendMedical.ListEntitiesDetectionV2JobsRequest
import ComprehendMedical.ListEntitiesDetectionV2JobsResponse
import ComprehendMedical.ListPHIDetectionJobsRequest
import ComprehendMedical.ListPHIDetectionJobsResponse
import ComprehendMedical.StartEntitiesDetectionV2JobRequest
import ComprehendMedical.StartEntitiesDetectionV2JobResponse
import ComprehendMedical.StartPHIDetectionJobRequest
import ComprehendMedical.StartPHIDetectionJobResponse
import ComprehendMedical.StopEntitiesDetectionV2JobRequest
import ComprehendMedical.StopEntitiesDetectionV2JobResponse
import ComprehendMedical.StopPHIDetectionJobRequest
import ComprehendMedical.StopPHIDetectionJobResponse
import ComprehendMedical.InputDataConfig
import ComprehendMedical.OutputDataConfig
import ComprehendMedical.ComprehendMedicalAsyncJobFilter

typealias AnyLengthString = String

typealias AttributeList = Array<Attribute>

typealias BoundedLengthString = String

typealias ClientRequestTokenString = String

typealias ComprehendMedicalAsyncJobPropertiesList = Array<ComprehendMedicalAsyncJobProperties>

typealias EntityList = Array<Entity>

typealias Float = Number

typealias ICD10CMAttributeList = Array<ICD10CMAttribute>

typealias ICD10CMConceptList = Array<ICD10CMConcept>

typealias ICD10CMEntityList = Array<ICD10CMEntity>

typealias ICD10CMTraitList = Array<ICD10CMTrait>

typealias IamRoleArn = String

typealias Integer = Number

typealias JobId = String

typealias JobName = String

typealias KMSKey = String

typealias ManifestFilePath = String

typealias MaxResultsInteger = Number

typealias ModelVersion = String

typealias OntologyLinkingBoundedLengthString = String

typealias RxNormAttributeList = Array<RxNormAttribute>

typealias RxNormConceptList = Array<RxNormConcept>

typealias RxNormEntityList = Array<RxNormEntity>

typealias RxNormTraitList = Array<RxNormTrait>

typealias S3Bucket = String

typealias S3Key = String

typealias String = String

typealias Timestamp = Date

typealias TraitList = Array<Trait>

typealias UnmappedAttributeList = Array<UnmappedAttribute>

@JsModule("aws-sdk")
external open class ComprehendMedical(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & ComprehendMedical.Types.ClientConfiguration */
    open fun describeEntitiesDetectionV2Job(params: DescribeEntitiesDetectionV2JobRequest, callback: (err: AWSError, data: DescribeEntitiesDetectionV2JobResponse) -> Unit = definedExternally): Request<DescribeEntitiesDetectionV2JobResponse, AWSError>
    open fun describeEntitiesDetectionV2Job(callback: (err: AWSError, data: DescribeEntitiesDetectionV2JobResponse) -> Unit = definedExternally): Request<DescribeEntitiesDetectionV2JobResponse, AWSError>
    open fun describePHIDetectionJob(params: DescribePHIDetectionJobRequest, callback: (err: AWSError, data: DescribePHIDetectionJobResponse) -> Unit = definedExternally): Request<DescribePHIDetectionJobResponse, AWSError>
    open fun describePHIDetectionJob(callback: (err: AWSError, data: DescribePHIDetectionJobResponse) -> Unit = definedExternally): Request<DescribePHIDetectionJobResponse, AWSError>
    open fun detectEntities(params: DetectEntitiesRequest, callback: (err: AWSError, data: DetectEntitiesResponse) -> Unit = definedExternally): Request<DetectEntitiesResponse, AWSError>
    open fun detectEntities(callback: (err: AWSError, data: DetectEntitiesResponse) -> Unit = definedExternally): Request<DetectEntitiesResponse, AWSError>
    open fun detectEntitiesV2(params: DetectEntitiesV2Request, callback: (err: AWSError, data: DetectEntitiesV2Response) -> Unit = definedExternally): Request<DetectEntitiesV2Response, AWSError>
    open fun detectEntitiesV2(callback: (err: AWSError, data: DetectEntitiesV2Response) -> Unit = definedExternally): Request<DetectEntitiesV2Response, AWSError>
    open fun detectPHI(params: DetectPHIRequest, callback: (err: AWSError, data: DetectPHIResponse) -> Unit = definedExternally): Request<DetectPHIResponse, AWSError>
    open fun detectPHI(callback: (err: AWSError, data: DetectPHIResponse) -> Unit = definedExternally): Request<DetectPHIResponse, AWSError>
    open fun inferICD10CM(params: InferICD10CMRequest, callback: (err: AWSError, data: InferICD10CMResponse) -> Unit = definedExternally): Request<InferICD10CMResponse, AWSError>
    open fun inferICD10CM(callback: (err: AWSError, data: InferICD10CMResponse) -> Unit = definedExternally): Request<InferICD10CMResponse, AWSError>
    open fun inferRxNorm(params: InferRxNormRequest, callback: (err: AWSError, data: InferRxNormResponse) -> Unit = definedExternally): Request<InferRxNormResponse, AWSError>
    open fun inferRxNorm(callback: (err: AWSError, data: InferRxNormResponse) -> Unit = definedExternally): Request<InferRxNormResponse, AWSError>
    open fun listEntitiesDetectionV2Jobs(params: ListEntitiesDetectionV2JobsRequest, callback: (err: AWSError, data: ListEntitiesDetectionV2JobsResponse) -> Unit = definedExternally): Request<ListEntitiesDetectionV2JobsResponse, AWSError>
    open fun listEntitiesDetectionV2Jobs(callback: (err: AWSError, data: ListEntitiesDetectionV2JobsResponse) -> Unit = definedExternally): Request<ListEntitiesDetectionV2JobsResponse, AWSError>
    open fun listPHIDetectionJobs(params: ListPHIDetectionJobsRequest, callback: (err: AWSError, data: ListPHIDetectionJobsResponse) -> Unit = definedExternally): Request<ListPHIDetectionJobsResponse, AWSError>
    open fun listPHIDetectionJobs(callback: (err: AWSError, data: ListPHIDetectionJobsResponse) -> Unit = definedExternally): Request<ListPHIDetectionJobsResponse, AWSError>
    open fun startEntitiesDetectionV2Job(params: StartEntitiesDetectionV2JobRequest, callback: (err: AWSError, data: StartEntitiesDetectionV2JobResponse) -> Unit = definedExternally): Request<StartEntitiesDetectionV2JobResponse, AWSError>
    open fun startEntitiesDetectionV2Job(callback: (err: AWSError, data: StartEntitiesDetectionV2JobResponse) -> Unit = definedExternally): Request<StartEntitiesDetectionV2JobResponse, AWSError>
    open fun startPHIDetectionJob(params: StartPHIDetectionJobRequest, callback: (err: AWSError, data: StartPHIDetectionJobResponse) -> Unit = definedExternally): Request<StartPHIDetectionJobResponse, AWSError>
    open fun startPHIDetectionJob(callback: (err: AWSError, data: StartPHIDetectionJobResponse) -> Unit = definedExternally): Request<StartPHIDetectionJobResponse, AWSError>
    open fun stopEntitiesDetectionV2Job(params: StopEntitiesDetectionV2JobRequest, callback: (err: AWSError, data: StopEntitiesDetectionV2JobResponse) -> Unit = definedExternally): Request<StopEntitiesDetectionV2JobResponse, AWSError>
    open fun stopEntitiesDetectionV2Job(callback: (err: AWSError, data: StopEntitiesDetectionV2JobResponse) -> Unit = definedExternally): Request<StopEntitiesDetectionV2JobResponse, AWSError>
    open fun stopPHIDetectionJob(params: StopPHIDetectionJobRequest, callback: (err: AWSError, data: StopPHIDetectionJobResponse) -> Unit = definedExternally): Request<StopPHIDetectionJobResponse, AWSError>
    open fun stopPHIDetectionJob(callback: (err: AWSError, data: StopPHIDetectionJobResponse) -> Unit = definedExternally): Request<StopPHIDetectionJobResponse, AWSError>
    interface Attribute {
        var Type: String /* "NAME" | "DOSAGE" | "ROUTE_OR_MODE" | "FORM" | "FREQUENCY" | "DURATION" | "GENERIC_NAME" | "BRAND_NAME" | "STRENGTH" | "RATE" | "ACUITY" | "TEST_NAME" | "TEST_VALUE" | "TEST_UNITS" | "PROCEDURE_NAME" | "TREATMENT_NAME" | "DATE" | "AGE" | "CONTACT_POINT" | "EMAIL" | "IDENTIFIER" | "URL" | "ADDRESS" | "PROFESSION" | "SYSTEM_ORGAN_SITE" | "DIRECTION" | "QUALITY" | "QUANTITY" | "TIME_EXPRESSION" | "TIME_TO_MEDICATION_NAME" | "TIME_TO_DX_NAME" | "TIME_TO_TEST_NAME" | "TIME_TO_PROCEDURE_NAME" | "TIME_TO_TREATMENT_NAME" | String */
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
        var RelationshipScore: Float?
            get() = definedExternally
            set(value) = definedExternally
        var RelationshipType: String /* "EVERY" | "WITH_DOSAGE" | "ADMINISTERED_VIA" | "FOR" | "NEGATIVE" | "OVERLAP" | "DOSAGE" | "ROUTE_OR_MODE" | "FORM" | "FREQUENCY" | "DURATION" | "STRENGTH" | "RATE" | "ACUITY" | "TEST_VALUE" | "TEST_UNITS" | "DIRECTION" | String */
        var Id: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var BeginOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EndOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Text: String?
            get() = definedExternally
            set(value) = definedExternally
        var Category: String /* "MEDICATION" | "MEDICAL_CONDITION" | "PROTECTED_HEALTH_INFORMATION" | "TEST_TREATMENT_PROCEDURE" | "ANATOMY" | "TIME_EXPRESSION" | String */
        var Traits: TraitList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComprehendMedicalAsyncJobFilter {
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "PARTIAL_SUCCESS" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var SubmitTimeBefore: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTimeAfter: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ComprehendMedicalAsyncJobProperties {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "PARTIAL_SUCCESS" | "FAILED" | "STOP_REQUESTED" | "STOPPED" | String */
        var Message: AnyLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var SubmitTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var ExpirationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var InputDataConfig: InputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var OutputDataConfig: OutputDataConfig?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | String */
        var DataAccessRoleArn: IamRoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ManifestFilePath: ManifestFilePath?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var ModelVersion: ModelVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeEntitiesDetectionV2JobRequest {
        var JobId: JobId
    }
    interface DescribeEntitiesDetectionV2JobResponse {
        var ComprehendMedicalAsyncJobProperties: ComprehendMedicalAsyncJobProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePHIDetectionJobRequest {
        var JobId: JobId
    }
    interface DescribePHIDetectionJobResponse {
        var ComprehendMedicalAsyncJobProperties: ComprehendMedicalAsyncJobProperties?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectEntitiesRequest {
        var Text: BoundedLengthString
    }
    interface DetectEntitiesResponse {
        var Entities: EntityList
        var UnmappedAttributes: UnmappedAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ModelVersion: String
    }
    interface DetectEntitiesV2Request {
        var Text: BoundedLengthString
    }
    interface DetectEntitiesV2Response {
        var Entities: EntityList
        var UnmappedAttributes: UnmappedAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var PaginationToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ModelVersion: String
    }
    interface DetectPHIRequest {
        var Text: BoundedLengthString
    }
    interface DetectPHIResponse {
        var Entities: EntityList
        var PaginationToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ModelVersion: String
    }
    interface Entity {
        var Id: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var BeginOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EndOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Text: String?
            get() = definedExternally
            set(value) = definedExternally
        var Category: String /* "MEDICATION" | "MEDICAL_CONDITION" | "PROTECTED_HEALTH_INFORMATION" | "TEST_TREATMENT_PROCEDURE" | "ANATOMY" | "TIME_EXPRESSION" | String */
        var Type: String /* "NAME" | "DOSAGE" | "ROUTE_OR_MODE" | "FORM" | "FREQUENCY" | "DURATION" | "GENERIC_NAME" | "BRAND_NAME" | "STRENGTH" | "RATE" | "ACUITY" | "TEST_NAME" | "TEST_VALUE" | "TEST_UNITS" | "PROCEDURE_NAME" | "TREATMENT_NAME" | "DATE" | "AGE" | "CONTACT_POINT" | "EMAIL" | "IDENTIFIER" | "URL" | "ADDRESS" | "PROFESSION" | "SYSTEM_ORGAN_SITE" | "DIRECTION" | "QUALITY" | "QUANTITY" | "TIME_EXPRESSION" | "TIME_TO_MEDICATION_NAME" | "TIME_TO_DX_NAME" | "TIME_TO_TEST_NAME" | "TIME_TO_PROCEDURE_NAME" | "TIME_TO_TREATMENT_NAME" | String */
        var Traits: TraitList?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: AttributeList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ICD10CMAttribute {
        var Type: String /* "ACUITY" | "DIRECTION" | "SYSTEM_ORGAN_SITE" | "QUALITY" | "QUANTITY" | String */
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
        var RelationshipScore: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var BeginOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EndOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Text: String?
            get() = definedExternally
            set(value) = definedExternally
        var Traits: ICD10CMTraitList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ICD10CMConcept {
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Code: String?
            get() = definedExternally
            set(value) = definedExternally
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ICD10CMEntity {
        var Id: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Text: OntologyLinkingBoundedLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var Category: String /* "MEDICAL_CONDITION" | String */
        var Type: String /* "DX_NAME" | String */
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
        var BeginOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EndOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: ICD10CMAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var Traits: ICD10CMTraitList?
            get() = definedExternally
            set(value) = definedExternally
        var ICD10CMConcepts: ICD10CMConceptList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ICD10CMTrait {
        var Name: String /* "NEGATION" | "DIAGNOSIS" | "SIGN" | "SYMPTOM" | String */
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InferICD10CMRequest {
        var Text: OntologyLinkingBoundedLengthString
    }
    interface InferICD10CMResponse {
        var Entities: ICD10CMEntityList
        var PaginationToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InferRxNormRequest {
        var Text: OntologyLinkingBoundedLengthString
    }
    interface InferRxNormResponse {
        var Entities: RxNormEntityList
        var PaginationToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var ModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputDataConfig {
        var S3Bucket: S3Bucket
        var S3Key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntitiesDetectionV2JobsRequest {
        var Filter: ComprehendMedicalAsyncJobFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListEntitiesDetectionV2JobsResponse {
        var ComprehendMedicalAsyncJobPropertiesList: ComprehendMedicalAsyncJobPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPHIDetectionJobsRequest {
        var Filter: ComprehendMedicalAsyncJobFilter?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResultsInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPHIDetectionJobsResponse {
        var ComprehendMedicalAsyncJobPropertiesList: ComprehendMedicalAsyncJobPropertiesList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputDataConfig {
        var S3Bucket: S3Bucket
        var S3Key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RxNormAttribute {
        var Type: String /* "DOSAGE" | "DURATION" | "FORM" | "FREQUENCY" | "RATE" | "ROUTE_OR_MODE" | "STRENGTH" | String */
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
        var RelationshipScore: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Id: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var BeginOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EndOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Text: String?
            get() = definedExternally
            set(value) = definedExternally
        var Traits: RxNormTraitList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RxNormConcept {
        var Description: String?
            get() = definedExternally
            set(value) = definedExternally
        var Code: String?
            get() = definedExternally
            set(value) = definedExternally
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RxNormEntity {
        var Id: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Text: OntologyLinkingBoundedLengthString?
            get() = definedExternally
            set(value) = definedExternally
        var Category: String /* "MEDICATION" | String */
        var Type: String /* "BRAND_NAME" | "GENERIC_NAME" | String */
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
        var BeginOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var EndOffset: Integer?
            get() = definedExternally
            set(value) = definedExternally
        var Attributes: RxNormAttributeList?
            get() = definedExternally
            set(value) = definedExternally
        var Traits: RxNormTraitList?
            get() = definedExternally
            set(value) = definedExternally
        var RxNormConcepts: RxNormConceptList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RxNormTrait {
        var Name: String /* "NEGATION" | String */
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartEntitiesDetectionV2JobRequest {
        var InputDataConfig: InputDataConfig
        var OutputDataConfig: OutputDataConfig
        var DataAccessRoleArn: IamRoleArn
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | String */
    }
    interface StartEntitiesDetectionV2JobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartPHIDetectionJobRequest {
        var InputDataConfig: InputDataConfig
        var OutputDataConfig: OutputDataConfig
        var DataAccessRoleArn: IamRoleArn
        var JobName: JobName?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestTokenString?
            get() = definedExternally
            set(value) = definedExternally
        var KMSKey: KMSKey?
            get() = definedExternally
            set(value) = definedExternally
        var LanguageCode: String /* "en" | String */
    }
    interface StartPHIDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopEntitiesDetectionV2JobRequest {
        var JobId: JobId
    }
    interface StopEntitiesDetectionV2JobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopPHIDetectionJobRequest {
        var JobId: JobId
    }
    interface StopPHIDetectionJobResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Trait {
        var Name: String /* "SIGN" | "SYMPTOM" | "DIAGNOSIS" | "NEGATION" | String */
        var Score: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UnmappedAttribute {
        var Type: String /* "MEDICATION" | "MEDICAL_CONDITION" | "PROTECTED_HEALTH_INFORMATION" | "TEST_TREATMENT_PROCEDURE" | "ANATOMY" | "TIME_EXPRESSION" | String */
        var Attribute: Attribute?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-10-30" | "latest" | String */
    }
}