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
import Textract.Block
import Textract.Point
import Textract.Relationship
import Textract.Warning
import Textract.AnalyzeDocumentRequest
import Textract.AnalyzeDocumentResponse
import Textract.DetectDocumentTextRequest
import Textract.DetectDocumentTextResponse
import Textract.GetDocumentAnalysisRequest
import Textract.GetDocumentAnalysisResponse
import Textract.GetDocumentTextDetectionRequest
import Textract.GetDocumentTextDetectionResponse
import Textract.StartDocumentAnalysisRequest
import Textract.StartDocumentAnalysisResponse
import Textract.StartDocumentTextDetectionRequest
import Textract.StartDocumentTextDetectionResponse
import Textract.Document
import Textract.HumanLoopConfig
import Textract.DocumentMetadata
import Textract.HumanLoopActivationOutput
import Textract.Geometry
import Textract.S3Object
import Textract.BoundingBox
import Textract.HumanLoopDataAttributes
import Textract.DocumentLocation
import Textract.NotificationChannel

typealias BlockList = Array<Block>

typealias ClientRequestToken = String

typealias ContentClassifiers = Array<String /* "FreeOfPersonallyIdentifiableInformation" | "FreeOfAdultContent" | String */>

typealias EntityTypes = Array<String /* "KEY" | "VALUE" | String */>

typealias ErrorCode = String

typealias FeatureTypes = Array<String /* "TABLES" | "FORMS" | String */>

typealias Float = Number

typealias FlowDefinitionArn = String

typealias HumanLoopActivationConditionsEvaluationResults = String

typealias HumanLoopActivationReason = String

typealias HumanLoopActivationReasons = Array<HumanLoopActivationReason>

typealias HumanLoopArn = String

typealias HumanLoopName = String

typealias IdList = Array<NonEmptyString>

typealias JobId = String

typealias JobTag = String

typealias MaxResults = Number

typealias NonEmptyString = String

typealias Pages = Array<UInteger>

typealias PaginationToken = String

typealias Percent = Number

typealias Polygon = Array<Point>

typealias RelationshipList = Array<Relationship>

typealias RoleArn = String

typealias S3Bucket = String

typealias S3ObjectName = String

typealias S3ObjectVersion = String

typealias SNSTopicArn = String

typealias StatusMessage = String

typealias String = String

typealias UInteger = Number

typealias Warnings = Array<Warning>

@JsModule("aws-sdk")
external open class Textract(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & Textract.Types.ClientConfiguration */
    open fun analyzeDocument(params: AnalyzeDocumentRequest, callback: (err: AWSError, data: AnalyzeDocumentResponse) -> Unit = definedExternally): Request<AnalyzeDocumentResponse, AWSError>
    open fun analyzeDocument(callback: (err: AWSError, data: AnalyzeDocumentResponse) -> Unit = definedExternally): Request<AnalyzeDocumentResponse, AWSError>
    open fun detectDocumentText(params: DetectDocumentTextRequest, callback: (err: AWSError, data: DetectDocumentTextResponse) -> Unit = definedExternally): Request<DetectDocumentTextResponse, AWSError>
    open fun detectDocumentText(callback: (err: AWSError, data: DetectDocumentTextResponse) -> Unit = definedExternally): Request<DetectDocumentTextResponse, AWSError>
    open fun getDocumentAnalysis(params: GetDocumentAnalysisRequest, callback: (err: AWSError, data: GetDocumentAnalysisResponse) -> Unit = definedExternally): Request<GetDocumentAnalysisResponse, AWSError>
    open fun getDocumentAnalysis(callback: (err: AWSError, data: GetDocumentAnalysisResponse) -> Unit = definedExternally): Request<GetDocumentAnalysisResponse, AWSError>
    open fun getDocumentTextDetection(params: GetDocumentTextDetectionRequest, callback: (err: AWSError, data: GetDocumentTextDetectionResponse) -> Unit = definedExternally): Request<GetDocumentTextDetectionResponse, AWSError>
    open fun getDocumentTextDetection(callback: (err: AWSError, data: GetDocumentTextDetectionResponse) -> Unit = definedExternally): Request<GetDocumentTextDetectionResponse, AWSError>
    open fun startDocumentAnalysis(params: StartDocumentAnalysisRequest, callback: (err: AWSError, data: StartDocumentAnalysisResponse) -> Unit = definedExternally): Request<StartDocumentAnalysisResponse, AWSError>
    open fun startDocumentAnalysis(callback: (err: AWSError, data: StartDocumentAnalysisResponse) -> Unit = definedExternally): Request<StartDocumentAnalysisResponse, AWSError>
    open fun startDocumentTextDetection(params: StartDocumentTextDetectionRequest, callback: (err: AWSError, data: StartDocumentTextDetectionResponse) -> Unit = definedExternally): Request<StartDocumentTextDetectionResponse, AWSError>
    open fun startDocumentTextDetection(callback: (err: AWSError, data: StartDocumentTextDetectionResponse) -> Unit = definedExternally): Request<StartDocumentTextDetectionResponse, AWSError>
    interface AnalyzeDocumentRequest {
        var Document: Document
        var FeatureTypes: FeatureTypes
        var HumanLoopConfig: HumanLoopConfig?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AnalyzeDocumentResponse {
        var DocumentMetadata: DocumentMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var Blocks: BlockList?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopActivationOutput: HumanLoopActivationOutput?
            get() = definedExternally
            set(value) = definedExternally
        var AnalyzeDocumentModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Block {
        var BlockType: String /* "KEY_VALUE_SET" | "PAGE" | "LINE" | "WORD" | "TABLE" | "CELL" | "SELECTION_ELEMENT" | String */
        var Confidence: Percent?
            get() = definedExternally
            set(value) = definedExternally
        var Text: String?
            get() = definedExternally
            set(value) = definedExternally
        var RowIndex: UInteger?
            get() = definedExternally
            set(value) = definedExternally
        var ColumnIndex: UInteger?
            get() = definedExternally
            set(value) = definedExternally
        var RowSpan: UInteger?
            get() = definedExternally
            set(value) = definedExternally
        var ColumnSpan: UInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Geometry: Geometry?
            get() = definedExternally
            set(value) = definedExternally
        var Id: NonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var Relationships: RelationshipList?
            get() = definedExternally
            set(value) = definedExternally
        var EntityTypes: EntityTypes?
            get() = definedExternally
            set(value) = definedExternally
        var SelectionStatus: String /* "SELECTED" | "NOT_SELECTED" | String */
        var Page: UInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BoundingBox {
        var Width: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Height: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Left: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Top: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectDocumentTextRequest {
        var Document: Document
    }
    interface DetectDocumentTextResponse {
        var DocumentMetadata: DocumentMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var Blocks: BlockList?
            get() = definedExternally
            set(value) = definedExternally
        var DetectDocumentTextModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Document {
        var Bytes: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var S3Object: S3Object?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentLocation {
        var S3Object: S3Object?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DocumentMetadata {
        var Pages: UInteger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Geometry {
        var BoundingBox: BoundingBox?
            get() = definedExternally
            set(value) = definedExternally
        var Polygon: Polygon?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentAnalysisRequest {
        var JobId: JobId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentAnalysisResponse {
        var DocumentMetadata: DocumentMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "PARTIAL_SUCCESS" | String */
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var Blocks: BlockList?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: Warnings?
            get() = definedExternally
            set(value) = definedExternally
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var AnalyzeDocumentModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentTextDetectionRequest {
        var JobId: JobId
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDocumentTextDetectionResponse {
        var DocumentMetadata: DocumentMetadata?
            get() = definedExternally
            set(value) = definedExternally
        var JobStatus: String /* "IN_PROGRESS" | "SUCCEEDED" | "FAILED" | "PARTIAL_SUCCESS" | String */
        var NextToken: PaginationToken?
            get() = definedExternally
            set(value) = definedExternally
        var Blocks: BlockList?
            get() = definedExternally
            set(value) = definedExternally
        var Warnings: Warnings?
            get() = definedExternally
            set(value) = definedExternally
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var DetectDocumentTextModelVersion: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HumanLoopActivationOutput {
        var HumanLoopArn: HumanLoopArn?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopActivationReasons: HumanLoopActivationReasons?
            get() = definedExternally
            set(value) = definedExternally
        var HumanLoopActivationConditionsEvaluationResults: HumanLoopActivationConditionsEvaluationResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HumanLoopConfig {
        var HumanLoopName: HumanLoopName
        var FlowDefinitionArn: FlowDefinitionArn
        var DataAttributes: HumanLoopDataAttributes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface HumanLoopDataAttributes {
        var ContentClassifiers: ContentClassifiers?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface NotificationChannel {
        var SNSTopicArn: SNSTopicArn
        var RoleArn: RoleArn
    }
    interface Point {
        var X: Float?
            get() = definedExternally
            set(value) = definedExternally
        var Y: Float?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Relationship {
        var Type: String /* "VALUE" | "CHILD" | String */
        var Ids: IdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3Object {
        var Bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var Name: S3ObjectName?
            get() = definedExternally
            set(value) = definedExternally
        var Version: S3ObjectVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDocumentAnalysisRequest {
        var DocumentLocation: DocumentLocation
        var FeatureTypes: FeatureTypes
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var JobTag: JobTag?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationChannel: NotificationChannel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDocumentAnalysisResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDocumentTextDetectionRequest {
        var DocumentLocation: DocumentLocation
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var JobTag: JobTag?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationChannel: NotificationChannel?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartDocumentTextDetectionResponse {
        var JobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Warning {
        var ErrorCode: ErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var Pages: Pages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-06-27" | "latest" | String */
    }
}