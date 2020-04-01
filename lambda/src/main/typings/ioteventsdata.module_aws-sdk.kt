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
import IoTEventsData.BatchPutMessageErrorEntry
import IoTEventsData.BatchUpdateDetectorErrorEntry
import IoTEventsData.DetectorSummary
import IoTEventsData.Message
import IoTEventsData.TimerDefinition
import IoTEventsData.Timer
import IoTEventsData.UpdateDetectorRequest
import IoTEventsData.VariableDefinition
import IoTEventsData.Variable
import IoTEventsData.BatchPutMessageRequest
import IoTEventsData.BatchPutMessageResponse
import IoTEventsData.BatchUpdateDetectorRequest
import IoTEventsData.BatchUpdateDetectorResponse
import IoTEventsData.DescribeDetectorRequest
import IoTEventsData.DescribeDetectorResponse
import IoTEventsData.ListDetectorsRequest
import IoTEventsData.ListDetectorsResponse
import IoTEventsData.Detector
import IoTEventsData.DetectorState
import IoTEventsData.DetectorStateSummary
import IoTEventsData.DetectorStateDefinition

typealias BatchPutMessageErrorEntries = Array<BatchPutMessageErrorEntry>

typealias BatchUpdateDetectorErrorEntries = Array<BatchUpdateDetectorErrorEntry>

typealias DetectorModelName = String

typealias DetectorModelVersion = String

typealias DetectorSummaries = Array<DetectorSummary>

typealias ErrorMessage = String

typealias InputName = String

typealias KeyValue = String

typealias MaxResults = Number

typealias MessageId = String

typealias Messages = Array<Message>

typealias NextToken = String

typealias Seconds = Number

typealias StateName = String

typealias TimerDefinitions = Array<TimerDefinition>

typealias TimerName = String

typealias Timers = Array<Timer>

typealias Timestamp = Date

typealias UpdateDetectorRequests = Array<UpdateDetectorRequest>

typealias VariableDefinitions = Array<VariableDefinition>

typealias VariableName = String

typealias VariableValue = String

typealias Variables = Array<Variable>

@JsModule("aws-sdk")
external open class IoTEventsData(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & IoTEventsData.Types.ClientConfiguration */
    open fun batchPutMessage(params: BatchPutMessageRequest, callback: (err: AWSError, data: BatchPutMessageResponse) -> Unit = definedExternally): Request<BatchPutMessageResponse, AWSError>
    open fun batchPutMessage(callback: (err: AWSError, data: BatchPutMessageResponse) -> Unit = definedExternally): Request<BatchPutMessageResponse, AWSError>
    open fun batchUpdateDetector(params: BatchUpdateDetectorRequest, callback: (err: AWSError, data: BatchUpdateDetectorResponse) -> Unit = definedExternally): Request<BatchUpdateDetectorResponse, AWSError>
    open fun batchUpdateDetector(callback: (err: AWSError, data: BatchUpdateDetectorResponse) -> Unit = definedExternally): Request<BatchUpdateDetectorResponse, AWSError>
    open fun describeDetector(params: DescribeDetectorRequest, callback: (err: AWSError, data: DescribeDetectorResponse) -> Unit = definedExternally): Request<DescribeDetectorResponse, AWSError>
    open fun describeDetector(callback: (err: AWSError, data: DescribeDetectorResponse) -> Unit = definedExternally): Request<DescribeDetectorResponse, AWSError>
    open fun listDetectors(params: ListDetectorsRequest, callback: (err: AWSError, data: ListDetectorsResponse) -> Unit = definedExternally): Request<ListDetectorsResponse, AWSError>
    open fun listDetectors(callback: (err: AWSError, data: ListDetectorsResponse) -> Unit = definedExternally): Request<ListDetectorsResponse, AWSError>
    interface BatchPutMessageErrorEntry {
        var messageId: MessageId?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: String /* "ResourceNotFoundException" | "InvalidRequestException" | "InternalFailureException" | "ServiceUnavailableException" | "ThrottlingException" | String */
        var errorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchPutMessageRequest {
        var messages: Messages
    }
    interface BatchPutMessageResponse {
        var BatchPutMessageErrorEntries: BatchPutMessageErrorEntries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchUpdateDetectorErrorEntry {
        var messageId: MessageId?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: String /* "ResourceNotFoundException" | "InvalidRequestException" | "InternalFailureException" | "ServiceUnavailableException" | "ThrottlingException" | String */
        var errorMessage: ErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchUpdateDetectorRequest {
        var detectors: UpdateDetectorRequests
    }
    interface BatchUpdateDetectorResponse {
        var batchUpdateDetectorErrorEntries: BatchUpdateDetectorErrorEntries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDetectorRequest {
        var detectorModelName: DetectorModelName
        var keyValue: KeyValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDetectorResponse {
        var detector: Detector?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Detector {
        var detectorModelName: DetectorModelName?
            get() = definedExternally
            set(value) = definedExternally
        var keyValue: KeyValue?
            get() = definedExternally
            set(value) = definedExternally
        var detectorModelVersion: DetectorModelVersion?
            get() = definedExternally
            set(value) = definedExternally
        var state: DetectorState?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectorState {
        var stateName: StateName
        var variables: Variables
        var timers: Timers
    }
    interface DetectorStateDefinition {
        var stateName: StateName
        var variables: VariableDefinitions
        var timers: TimerDefinitions
    }
    interface DetectorStateSummary {
        var stateName: StateName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectorSummary {
        var detectorModelName: DetectorModelName?
            get() = definedExternally
            set(value) = definedExternally
        var keyValue: KeyValue?
            get() = definedExternally
            set(value) = definedExternally
        var detectorModelVersion: DetectorModelVersion?
            get() = definedExternally
            set(value) = definedExternally
        var state: DetectorStateSummary?
            get() = definedExternally
            set(value) = definedExternally
        var creationTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDetectorsRequest {
        var detectorModelName: DetectorModelName
        var stateName: StateName?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListDetectorsResponse {
        var detectorSummaries: DetectorSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Message {
        var messageId: MessageId
        var inputName: InputName
        var payload: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Timer {
        var name: TimerName
        var timestamp: Timestamp
    }
    interface TimerDefinition {
        var name: TimerName
        var seconds: Seconds
    }
    interface UpdateDetectorRequest {
        var messageId: MessageId
        var detectorModelName: DetectorModelName
        var keyValue: KeyValue?
            get() = definedExternally
            set(value) = definedExternally
        var state: DetectorStateDefinition
    }
    interface Variable {
        var name: VariableName
        var value: VariableValue
    }
    interface VariableDefinition {
        var name: VariableName
        var value: VariableValue
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2018-10-23" | "latest" | String */
    }
}