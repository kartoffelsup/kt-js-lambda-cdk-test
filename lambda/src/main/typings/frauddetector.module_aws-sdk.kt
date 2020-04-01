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
import FraudDetector.BatchCreateVariableError
import FraudDetector.BatchGetVariableError
import FraudDetector.Detector
import FraudDetector.DetectorVersionSummary
import FraudDetector.ExternalModel
import FraudDetector.ModelScores
import FraudDetector.ModelVersion
import FraudDetector.Model
import FraudDetector.ModelVariable
import FraudDetector.ModelVersionDetail
import FraudDetector.Outcome
import FraudDetector.RuleDetail
import FraudDetector.Rule
import FraudDetector.VariableEntry
import FraudDetector.Variable
import FraudDetector.BatchCreateVariableRequest
import FraudDetector.BatchCreateVariableResult
import FraudDetector.BatchGetVariableRequest
import FraudDetector.BatchGetVariableResult
import FraudDetector.CreateDetectorVersionRequest
import FraudDetector.CreateDetectorVersionResult
import FraudDetector.CreateModelVersionRequest
import FraudDetector.CreateModelVersionResult
import FraudDetector.CreateRuleRequest
import FraudDetector.CreateRuleResult
import FraudDetector.CreateVariableRequest
import FraudDetector.CreateVariableResult
import FraudDetector.DeleteDetectorVersionRequest
import FraudDetector.DeleteDetectorVersionResult
import FraudDetector.DeleteEventRequest
import FraudDetector.DeleteEventResult
import FraudDetector.DescribeDetectorRequest
import FraudDetector.DescribeDetectorResult
import FraudDetector.DescribeModelVersionsRequest
import FraudDetector.DescribeModelVersionsResult
import FraudDetector.GetDetectorVersionRequest
import FraudDetector.GetDetectorVersionResult
import FraudDetector.GetDetectorsRequest
import FraudDetector.GetDetectorsResult
import FraudDetector.GetExternalModelsRequest
import FraudDetector.GetExternalModelsResult
import FraudDetector.GetModelVersionRequest
import FraudDetector.GetModelVersionResult
import FraudDetector.GetModelsRequest
import FraudDetector.GetModelsResult
import FraudDetector.GetOutcomesRequest
import FraudDetector.GetOutcomesResult
import FraudDetector.GetPredictionRequest
import FraudDetector.GetPredictionResult
import FraudDetector.GetRulesRequest
import FraudDetector.GetRulesResult
import FraudDetector.GetVariablesRequest
import FraudDetector.GetVariablesResult
import FraudDetector.PutDetectorRequest
import FraudDetector.PutDetectorResult
import FraudDetector.PutExternalModelRequest
import FraudDetector.PutExternalModelResult
import FraudDetector.PutModelRequest
import FraudDetector.PutModelResult
import FraudDetector.PutOutcomeRequest
import FraudDetector.PutOutcomeResult
import FraudDetector.UpdateDetectorVersionRequest
import FraudDetector.UpdateDetectorVersionResult
import FraudDetector.UpdateDetectorVersionMetadataRequest
import FraudDetector.UpdateDetectorVersionMetadataResult
import FraudDetector.UpdateDetectorVersionStatusRequest
import FraudDetector.UpdateDetectorVersionStatusResult
import FraudDetector.UpdateModelVersionRequest
import FraudDetector.UpdateModelVersionResult
import FraudDetector.UpdateRuleMetadataRequest
import FraudDetector.UpdateRuleMetadataResult
import FraudDetector.UpdateRuleVersionRequest
import FraudDetector.UpdateRuleVersionResult
import FraudDetector.UpdateVariableRequest
import FraudDetector.UpdateVariableResult
import FraudDetector.Role
import FraudDetector.ModelInputConfiguration
import FraudDetector.ModelOutputConfiguration
import FraudDetector.ModelEndpointDataBlob
import FraudDetector.EventAttributeMap
import FraudDetector.ExternalModelEndpointDataBlobMap
import FraudDetector.LabelMapper
import FraudDetector.TrainingDataSource
import FraudDetector.LabelSchema
import FraudDetector.JsonKeyToVariableMap
import FraudDetector.CsvIndexToVariableMap
import FraudDetector.ModelPredictionMap
import FraudDetector.MetricsMap

typealias BatchCreateVariableErrorList = Array<BatchCreateVariableError>

typealias BatchGetVariableErrorList = Array<BatchGetVariableError>

typealias DetectorList = Array<Detector>

typealias DetectorVersionMaxResults = Number

typealias DetectorVersionSummaryList = Array<DetectorVersionSummary>

typealias DetectorsMaxResults = Number

typealias ExternalModelList = Array<ExternalModel>

typealias ExternalModelsMaxResults = Number

typealias IsOpaque = Boolean

typealias ListOfModelScores = Array<ModelScores>

typealias ListOfModelVersions = Array<ModelVersion>

typealias ListOfStrings = Array<String>

typealias MaxResults = Number

typealias ModelList = Array<Model>

typealias ModelVariableIndex = Number

typealias ModelVariablesList = Array<ModelVariable>

typealias ModelVersionDetailList = Array<ModelVersionDetail>

typealias NameList = Array<String>

typealias NonEmptyListOfStrings = Array<String>

typealias OutcomeList = Array<Outcome>

typealias OutcomesMaxResults = Number

typealias RuleDetailList = Array<RuleDetail>

typealias RuleList = Array<Rule>

typealias RulesMaxResults = Number

typealias VariableEntryList = Array<VariableEntry>

typealias VariableList = Array<Variable>

typealias VariablesMaxResults = Number

typealias attributeKey = String

typealias attributeValue = String

typealias contentType = String

typealias description = String

typealias float = Number

typealias iamRoleArn = String

typealias identifier = String

typealias integer = Number

typealias nonEmptyString = String

typealias ruleExpression = String

typealias s3BucketLocation = String

typealias time = String

@JsModule("aws-sdk")
external open class FraudDetector(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & FraudDetector.Types.ClientConfiguration */
    open fun batchCreateVariable(params: BatchCreateVariableRequest, callback: (err: AWSError, data: BatchCreateVariableResult) -> Unit = definedExternally): Request<BatchCreateVariableResult, AWSError>
    open fun batchCreateVariable(callback: (err: AWSError, data: BatchCreateVariableResult) -> Unit = definedExternally): Request<BatchCreateVariableResult, AWSError>
    open fun batchGetVariable(params: BatchGetVariableRequest, callback: (err: AWSError, data: BatchGetVariableResult) -> Unit = definedExternally): Request<BatchGetVariableResult, AWSError>
    open fun batchGetVariable(callback: (err: AWSError, data: BatchGetVariableResult) -> Unit = definedExternally): Request<BatchGetVariableResult, AWSError>
    open fun createDetectorVersion(params: CreateDetectorVersionRequest, callback: (err: AWSError, data: CreateDetectorVersionResult) -> Unit = definedExternally): Request<CreateDetectorVersionResult, AWSError>
    open fun createDetectorVersion(callback: (err: AWSError, data: CreateDetectorVersionResult) -> Unit = definedExternally): Request<CreateDetectorVersionResult, AWSError>
    open fun createModelVersion(params: CreateModelVersionRequest, callback: (err: AWSError, data: CreateModelVersionResult) -> Unit = definedExternally): Request<CreateModelVersionResult, AWSError>
    open fun createModelVersion(callback: (err: AWSError, data: CreateModelVersionResult) -> Unit = definedExternally): Request<CreateModelVersionResult, AWSError>
    open fun createRule(params: CreateRuleRequest, callback: (err: AWSError, data: CreateRuleResult) -> Unit = definedExternally): Request<CreateRuleResult, AWSError>
    open fun createRule(callback: (err: AWSError, data: CreateRuleResult) -> Unit = definedExternally): Request<CreateRuleResult, AWSError>
    open fun createVariable(params: CreateVariableRequest, callback: (err: AWSError, data: CreateVariableResult) -> Unit = definedExternally): Request<CreateVariableResult, AWSError>
    open fun createVariable(callback: (err: AWSError, data: CreateVariableResult) -> Unit = definedExternally): Request<CreateVariableResult, AWSError>
    open fun deleteDetectorVersion(params: DeleteDetectorVersionRequest, callback: (err: AWSError, data: DeleteDetectorVersionResult) -> Unit = definedExternally): Request<DeleteDetectorVersionResult, AWSError>
    open fun deleteDetectorVersion(callback: (err: AWSError, data: DeleteDetectorVersionResult) -> Unit = definedExternally): Request<DeleteDetectorVersionResult, AWSError>
    open fun deleteEvent(params: DeleteEventRequest, callback: (err: AWSError, data: DeleteEventResult) -> Unit = definedExternally): Request<DeleteEventResult, AWSError>
    open fun deleteEvent(callback: (err: AWSError, data: DeleteEventResult) -> Unit = definedExternally): Request<DeleteEventResult, AWSError>
    open fun describeDetector(params: DescribeDetectorRequest, callback: (err: AWSError, data: DescribeDetectorResult) -> Unit = definedExternally): Request<DescribeDetectorResult, AWSError>
    open fun describeDetector(callback: (err: AWSError, data: DescribeDetectorResult) -> Unit = definedExternally): Request<DescribeDetectorResult, AWSError>
    open fun describeModelVersions(params: DescribeModelVersionsRequest, callback: (err: AWSError, data: DescribeModelVersionsResult) -> Unit = definedExternally): Request<DescribeModelVersionsResult, AWSError>
    open fun describeModelVersions(callback: (err: AWSError, data: DescribeModelVersionsResult) -> Unit = definedExternally): Request<DescribeModelVersionsResult, AWSError>
    open fun getDetectorVersion(params: GetDetectorVersionRequest, callback: (err: AWSError, data: GetDetectorVersionResult) -> Unit = definedExternally): Request<GetDetectorVersionResult, AWSError>
    open fun getDetectorVersion(callback: (err: AWSError, data: GetDetectorVersionResult) -> Unit = definedExternally): Request<GetDetectorVersionResult, AWSError>
    open fun getDetectors(params: GetDetectorsRequest, callback: (err: AWSError, data: GetDetectorsResult) -> Unit = definedExternally): Request<GetDetectorsResult, AWSError>
    open fun getDetectors(callback: (err: AWSError, data: GetDetectorsResult) -> Unit = definedExternally): Request<GetDetectorsResult, AWSError>
    open fun getExternalModels(params: GetExternalModelsRequest, callback: (err: AWSError, data: GetExternalModelsResult) -> Unit = definedExternally): Request<GetExternalModelsResult, AWSError>
    open fun getExternalModels(callback: (err: AWSError, data: GetExternalModelsResult) -> Unit = definedExternally): Request<GetExternalModelsResult, AWSError>
    open fun getModelVersion(params: GetModelVersionRequest, callback: (err: AWSError, data: GetModelVersionResult) -> Unit = definedExternally): Request<GetModelVersionResult, AWSError>
    open fun getModelVersion(callback: (err: AWSError, data: GetModelVersionResult) -> Unit = definedExternally): Request<GetModelVersionResult, AWSError>
    open fun getModels(params: GetModelsRequest, callback: (err: AWSError, data: GetModelsResult) -> Unit = definedExternally): Request<GetModelsResult, AWSError>
    open fun getModels(callback: (err: AWSError, data: GetModelsResult) -> Unit = definedExternally): Request<GetModelsResult, AWSError>
    open fun getOutcomes(params: GetOutcomesRequest, callback: (err: AWSError, data: GetOutcomesResult) -> Unit = definedExternally): Request<GetOutcomesResult, AWSError>
    open fun getOutcomes(callback: (err: AWSError, data: GetOutcomesResult) -> Unit = definedExternally): Request<GetOutcomesResult, AWSError>
    open fun getPrediction(params: GetPredictionRequest, callback: (err: AWSError, data: GetPredictionResult) -> Unit = definedExternally): Request<GetPredictionResult, AWSError>
    open fun getPrediction(callback: (err: AWSError, data: GetPredictionResult) -> Unit = definedExternally): Request<GetPredictionResult, AWSError>
    open fun getRules(params: GetRulesRequest, callback: (err: AWSError, data: GetRulesResult) -> Unit = definedExternally): Request<GetRulesResult, AWSError>
    open fun getRules(callback: (err: AWSError, data: GetRulesResult) -> Unit = definedExternally): Request<GetRulesResult, AWSError>
    open fun getVariables(params: GetVariablesRequest, callback: (err: AWSError, data: GetVariablesResult) -> Unit = definedExternally): Request<GetVariablesResult, AWSError>
    open fun getVariables(callback: (err: AWSError, data: GetVariablesResult) -> Unit = definedExternally): Request<GetVariablesResult, AWSError>
    open fun putDetector(params: PutDetectorRequest, callback: (err: AWSError, data: PutDetectorResult) -> Unit = definedExternally): Request<PutDetectorResult, AWSError>
    open fun putDetector(callback: (err: AWSError, data: PutDetectorResult) -> Unit = definedExternally): Request<PutDetectorResult, AWSError>
    open fun putExternalModel(params: PutExternalModelRequest, callback: (err: AWSError, data: PutExternalModelResult) -> Unit = definedExternally): Request<PutExternalModelResult, AWSError>
    open fun putExternalModel(callback: (err: AWSError, data: PutExternalModelResult) -> Unit = definedExternally): Request<PutExternalModelResult, AWSError>
    open fun putModel(params: PutModelRequest, callback: (err: AWSError, data: PutModelResult) -> Unit = definedExternally): Request<PutModelResult, AWSError>
    open fun putModel(callback: (err: AWSError, data: PutModelResult) -> Unit = definedExternally): Request<PutModelResult, AWSError>
    open fun putOutcome(params: PutOutcomeRequest, callback: (err: AWSError, data: PutOutcomeResult) -> Unit = definedExternally): Request<PutOutcomeResult, AWSError>
    open fun putOutcome(callback: (err: AWSError, data: PutOutcomeResult) -> Unit = definedExternally): Request<PutOutcomeResult, AWSError>
    open fun updateDetectorVersion(params: UpdateDetectorVersionRequest, callback: (err: AWSError, data: UpdateDetectorVersionResult) -> Unit = definedExternally): Request<UpdateDetectorVersionResult, AWSError>
    open fun updateDetectorVersion(callback: (err: AWSError, data: UpdateDetectorVersionResult) -> Unit = definedExternally): Request<UpdateDetectorVersionResult, AWSError>
    open fun updateDetectorVersionMetadata(params: UpdateDetectorVersionMetadataRequest, callback: (err: AWSError, data: UpdateDetectorVersionMetadataResult) -> Unit = definedExternally): Request<UpdateDetectorVersionMetadataResult, AWSError>
    open fun updateDetectorVersionMetadata(callback: (err: AWSError, data: UpdateDetectorVersionMetadataResult) -> Unit = definedExternally): Request<UpdateDetectorVersionMetadataResult, AWSError>
    open fun updateDetectorVersionStatus(params: UpdateDetectorVersionStatusRequest, callback: (err: AWSError, data: UpdateDetectorVersionStatusResult) -> Unit = definedExternally): Request<UpdateDetectorVersionStatusResult, AWSError>
    open fun updateDetectorVersionStatus(callback: (err: AWSError, data: UpdateDetectorVersionStatusResult) -> Unit = definedExternally): Request<UpdateDetectorVersionStatusResult, AWSError>
    open fun updateModelVersion(params: UpdateModelVersionRequest, callback: (err: AWSError, data: UpdateModelVersionResult) -> Unit = definedExternally): Request<UpdateModelVersionResult, AWSError>
    open fun updateModelVersion(callback: (err: AWSError, data: UpdateModelVersionResult) -> Unit = definedExternally): Request<UpdateModelVersionResult, AWSError>
    open fun updateRuleMetadata(params: UpdateRuleMetadataRequest, callback: (err: AWSError, data: UpdateRuleMetadataResult) -> Unit = definedExternally): Request<UpdateRuleMetadataResult, AWSError>
    open fun updateRuleMetadata(callback: (err: AWSError, data: UpdateRuleMetadataResult) -> Unit = definedExternally): Request<UpdateRuleMetadataResult, AWSError>
    open fun updateRuleVersion(params: UpdateRuleVersionRequest, callback: (err: AWSError, data: UpdateRuleVersionResult) -> Unit = definedExternally): Request<UpdateRuleVersionResult, AWSError>
    open fun updateRuleVersion(callback: (err: AWSError, data: UpdateRuleVersionResult) -> Unit = definedExternally): Request<UpdateRuleVersionResult, AWSError>
    open fun updateVariable(params: UpdateVariableRequest, callback: (err: AWSError, data: UpdateVariableResult) -> Unit = definedExternally): Request<UpdateVariableResult, AWSError>
    open fun updateVariable(callback: (err: AWSError, data: UpdateVariableResult) -> Unit = definedExternally): Request<UpdateVariableResult, AWSError>
    interface BatchCreateVariableError {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var code: integer?
            get() = definedExternally
            set(value) = definedExternally
        var message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchCreateVariableRequest {
        var variableEntries: VariableEntryList
    }
    interface BatchCreateVariableResult {
        var errors: BatchCreateVariableErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetVariableError {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var code: integer?
            get() = definedExternally
            set(value) = definedExternally
        var message: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface BatchGetVariableRequest {
        var names: NameList
    }
    interface BatchGetVariableResult {
        var variables: VariableList?
            get() = definedExternally
            set(value) = definedExternally
        var errors: BatchGetVariableErrorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDetectorVersionRequest {
        var detectorId: identifier
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var externalModelEndpoints: ListOfStrings?
            get() = definedExternally
            set(value) = definedExternally
        var rules: RuleList
        var modelVersions: ListOfModelVersions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateDetectorVersionResult {
        var detectorId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var detectorVersionId: nonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "DRAFT" | "ACTIVE" | "INACTIVE" | String */
    }
    interface CreateModelVersionRequest {
        var modelId: identifier
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateModelVersionResult {
        var modelId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var modelVersionNumber: nonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateRuleRequest {
        var ruleId: identifier
        var detectorId: identifier
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var expression: ruleExpression
        var language: String /* "DETECTORPL" | String */
        var outcomes: NonEmptyListOfStrings
    }
    interface CreateRuleResult {
        var rule: Rule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVariableRequest {
        var name: String
        var dataType: String /* "STRING" | "INTEGER" | "FLOAT" | "BOOLEAN" | String */
        var dataSource: String /* "EVENT" | "MODEL_SCORE" | "EXTERNAL_MODEL_SCORE" | String */
        var defaultValue: String
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var variableType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateVariableResult
    interface CsvIndexToVariableMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface DeleteDetectorVersionRequest {
        var detectorId: identifier
        var detectorVersionId: nonEmptyString
    }
    interface DeleteDetectorVersionResult
    interface DeleteEventRequest {
        var eventId: String
    }
    interface DeleteEventResult
    interface DescribeDetectorRequest {
        var detectorId: identifier
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: DetectorVersionMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeDetectorResult {
        var detectorId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var detectorVersionSummaries: DetectorVersionSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeModelVersionsRequest {
        var modelId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var modelVersionNumber: nonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeModelVersionsResult {
        var modelVersionDetails: ModelVersionDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Detector {
        var detectorId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: time?
            get() = definedExternally
            set(value) = definedExternally
        var createdTime: time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectorVersionSummary {
        var detectorVersionId: nonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "DRAFT" | "ACTIVE" | "INACTIVE" | String */
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EventAttributeMap {
        @nativeGetter
        operator fun get(key: String): attributeValue?
        @nativeSetter
        operator fun set(key: String, value: attributeValue)
    }
    interface ExternalModel {
        var modelEndpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var modelSource: String /* "SAGEMAKER" | String */
        var role: Role?
            get() = definedExternally
            set(value) = definedExternally
        var inputConfiguration: ModelInputConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var outputConfiguration: ModelOutputConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var modelEndpointStatus: String /* "ASSOCIATED" | "DISSOCIATED" | String */
        var lastUpdatedTime: time?
            get() = definedExternally
            set(value) = definedExternally
        var createdTime: time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExternalModelEndpointDataBlobMap {
        @nativeGetter
        operator fun get(key: String): ModelEndpointDataBlob?
        @nativeSetter
        operator fun set(key: String, value: ModelEndpointDataBlob)
    }
    interface GetDetectorVersionRequest {
        var detectorId: identifier
        var detectorVersionId: nonEmptyString
    }
    interface GetDetectorVersionResult {
        var detectorId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var detectorVersionId: nonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var externalModelEndpoints: ListOfStrings?
            get() = definedExternally
            set(value) = definedExternally
        var modelVersions: ListOfModelVersions?
            get() = definedExternally
            set(value) = definedExternally
        var rules: RuleList?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "DRAFT" | "ACTIVE" | "INACTIVE" | String */
        var lastUpdatedTime: time?
            get() = definedExternally
            set(value) = definedExternally
        var createdTime: time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDetectorsRequest {
        var detectorId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: DetectorsMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetDetectorsResult {
        var detectors: DetectorList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetExternalModelsRequest {
        var modelEndpoint: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: ExternalModelsMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetExternalModelsResult {
        var externalModels: ExternalModelList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetModelVersionRequest {
        var modelId: identifier
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var modelVersionNumber: nonEmptyString
    }
    interface GetModelVersionResult {
        var modelId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var modelVersionNumber: nonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetModelsRequest {
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var modelId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetModelsResult {
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var models: ModelList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOutcomesRequest {
        var name: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: OutcomesMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetOutcomesResult {
        var outcomes: OutcomeList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPredictionRequest {
        var detectorId: String
        var detectorVersionId: String?
            get() = definedExternally
            set(value) = definedExternally
        var eventId: String
        var eventAttributes: EventAttributeMap?
            get() = definedExternally
            set(value) = definedExternally
        var externalModelEndpointDataBlobs: ExternalModelEndpointDataBlobMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPredictionResult {
        var outcomes: ListOfStrings?
            get() = definedExternally
            set(value) = definedExternally
        var modelScores: ListOfModelScores?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRulesRequest {
        var ruleId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var detectorId: identifier
        var ruleVersion: nonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: RulesMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetRulesResult {
        var ruleDetails: RuleDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVariablesRequest {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: VariablesMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetVariablesResult {
        var variables: VariableList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JsonKeyToVariableMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface LabelMapper {
        @nativeGetter
        operator fun get(key: String): ListOfStrings?
        @nativeSetter
        operator fun set(key: String, value: ListOfStrings)
    }
    interface LabelSchema {
        var labelKey: String
        var labelMapper: LabelMapper
    }
    interface MetricsMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface Model {
        var modelId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var trainingDataSource: TrainingDataSource?
            get() = definedExternally
            set(value) = definedExternally
        var modelVariables: ModelVariablesList?
            get() = definedExternally
            set(value) = definedExternally
        var labelSchema: LabelSchema?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: time?
            get() = definedExternally
            set(value) = definedExternally
        var createdTime: time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModelEndpointDataBlob {
        var byteBuffer: dynamic /* Buffer | Uint8Array | Blob | String */
            get() = definedExternally
            set(value) = definedExternally
        var contentType: contentType?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModelInputConfiguration {
        var format: String /* "TEXT_CSV" | "APPLICATION_JSON" | String */
        var isOpaque: IsOpaque
        var jsonInputTemplate: String?
            get() = definedExternally
            set(value) = definedExternally
        var csvInputTemplate: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModelOutputConfiguration {
        var format: String /* "TEXT_CSV" | "APPLICATION_JSONLINES" | String */
        var jsonKeyToVariableMap: JsonKeyToVariableMap?
            get() = definedExternally
            set(value) = definedExternally
        var csvIndexToVariableMap: CsvIndexToVariableMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModelPredictionMap {
        @nativeGetter
        operator fun get(key: String): float?
        @nativeSetter
        operator fun set(key: String, value: float)
    }
    interface ModelScores {
        var modelVersion: ModelVersion?
            get() = definedExternally
            set(value) = definedExternally
        var scores: ModelPredictionMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModelVariable {
        var name: String
        var index: ModelVariableIndex?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ModelVersion {
        var modelId: identifier
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var modelVersionNumber: nonEmptyString
    }
    interface ModelVersionDetail {
        var modelId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var modelVersionNumber: nonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var status: String?
            get() = definedExternally
            set(value) = definedExternally
        var trainingDataSource: TrainingDataSource?
            get() = definedExternally
            set(value) = definedExternally
        var modelVariables: ModelVariablesList?
            get() = definedExternally
            set(value) = definedExternally
        var labelSchema: LabelSchema?
            get() = definedExternally
            set(value) = definedExternally
        var validationMetrics: MetricsMap?
            get() = definedExternally
            set(value) = definedExternally
        var trainingMetrics: MetricsMap?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: time?
            get() = definedExternally
            set(value) = definedExternally
        var createdTime: time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Outcome {
        var name: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: time?
            get() = definedExternally
            set(value) = definedExternally
        var createdTime: time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutDetectorRequest {
        var detectorId: identifier
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutDetectorResult
    interface PutExternalModelRequest {
        var modelEndpoint: String
        var modelSource: String /* "SAGEMAKER" | String */
        var role: Role
        var inputConfiguration: ModelInputConfiguration
        var outputConfiguration: ModelOutputConfiguration
        var modelEndpointStatus: String /* "ASSOCIATED" | "DISSOCIATED" | String */
    }
    interface PutExternalModelResult
    interface PutModelRequest {
        var modelId: identifier
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var trainingDataSource: TrainingDataSource
        var modelVariables: ModelVariablesList
        var labelSchema: LabelSchema
    }
    interface PutModelResult
    interface PutOutcomeRequest {
        var name: identifier
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutOutcomeResult
    interface Role {
        var arn: String
        var name: String
    }
    interface Rule {
        var detectorId: identifier
        var ruleId: identifier
        var ruleVersion: nonEmptyString
    }
    interface RuleDetail {
        var ruleId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var detectorId: identifier?
            get() = definedExternally
            set(value) = definedExternally
        var ruleVersion: nonEmptyString?
            get() = definedExternally
            set(value) = definedExternally
        var expression: ruleExpression?
            get() = definedExternally
            set(value) = definedExternally
        var language: String /* "DETECTORPL" | String */
        var outcomes: NonEmptyListOfStrings?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: time?
            get() = definedExternally
            set(value) = definedExternally
        var createdTime: time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TrainingDataSource {
        var dataLocation: s3BucketLocation
        var dataAccessRoleArn: iamRoleArn
    }
    interface UpdateDetectorVersionMetadataRequest {
        var detectorId: identifier
        var detectorVersionId: nonEmptyString
        var description: description
    }
    interface UpdateDetectorVersionMetadataResult
    interface UpdateDetectorVersionRequest {
        var detectorId: identifier
        var detectorVersionId: nonEmptyString
        var externalModelEndpoints: ListOfStrings
        var rules: RuleList
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var modelVersions: ListOfModelVersions?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateDetectorVersionResult
    interface UpdateDetectorVersionStatusRequest {
        var detectorId: identifier
        var detectorVersionId: nonEmptyString
        var status: String /* "DRAFT" | "ACTIVE" | "INACTIVE" | String */
    }
    interface UpdateDetectorVersionStatusResult
    interface UpdateModelVersionRequest {
        var modelId: identifier
        var modelType: String /* "ONLINE_FRAUD_INSIGHTS" | String */
        var modelVersionNumber: nonEmptyString
        var description: description
        var status: String /* "TRAINING_IN_PROGRESS" | "TRAINING_COMPLETE" | "ACTIVATE_REQUESTED" | "ACTIVATE_IN_PROGRESS" | "ACTIVE" | "INACTIVATE_IN_PROGRESS" | "INACTIVE" | "ERROR" | String */
    }
    interface UpdateModelVersionResult
    interface UpdateRuleMetadataRequest {
        var rule: Rule
        var description: description
    }
    interface UpdateRuleMetadataResult
    interface UpdateRuleVersionRequest {
        var rule: Rule
        var description: description?
            get() = definedExternally
            set(value) = definedExternally
        var expression: ruleExpression
        var language: String /* "DETECTORPL" | String */
        var outcomes: NonEmptyListOfStrings
    }
    interface UpdateRuleVersionResult {
        var rule: Rule?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVariableRequest {
        var name: String
        var defaultValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var variableType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateVariableResult
    interface Variable {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var dataType: String /* "STRING" | "INTEGER" | "FLOAT" | "BOOLEAN" | String */
        var dataSource: String /* "EVENT" | "MODEL_SCORE" | "EXTERNAL_MODEL_SCORE" | String */
        var defaultValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var variableType: String?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedTime: time?
            get() = definedExternally
            set(value) = definedExternally
        var createdTime: time?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface VariableEntry {
        var name: String?
            get() = definedExternally
            set(value) = definedExternally
        var dataType: String?
            get() = definedExternally
            set(value) = definedExternally
        var dataSource: String?
            get() = definedExternally
            set(value) = definedExternally
        var defaultValue: String?
            get() = definedExternally
            set(value) = definedExternally
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var variableType: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2019-11-15" | "latest" | String */
    }
}