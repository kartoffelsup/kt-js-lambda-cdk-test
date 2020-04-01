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
import DataPipeline.ParameterAttribute
import DataPipeline.ParameterObject
import DataPipeline.ParameterValue
import DataPipeline.PipelineDescription
import DataPipeline.PipelineObject
import DataPipeline.Selector
import DataPipeline.ValidationError
import DataPipeline.ValidationWarning
import DataPipeline.Field
import DataPipeline.PipelineIdName
import DataPipeline.Tag
import DataPipeline.ActivatePipelineInput
import DataPipeline.ActivatePipelineOutput
import DataPipeline.AddTagsInput
import DataPipeline.AddTagsOutput
import DataPipeline.CreatePipelineInput
import DataPipeline.CreatePipelineOutput
import DataPipeline.DeactivatePipelineInput
import DataPipeline.DeactivatePipelineOutput
import DataPipeline.DeletePipelineInput
import DataPipeline.DescribeObjectsInput
import DataPipeline.DescribeObjectsOutput
import DataPipeline.DescribePipelinesInput
import DataPipeline.DescribePipelinesOutput
import DataPipeline.EvaluateExpressionInput
import DataPipeline.EvaluateExpressionOutput
import DataPipeline.GetPipelineDefinitionInput
import DataPipeline.GetPipelineDefinitionOutput
import DataPipeline.ListPipelinesInput
import DataPipeline.ListPipelinesOutput
import DataPipeline.PollForTaskInput
import DataPipeline.PollForTaskOutput
import DataPipeline.PutPipelineDefinitionInput
import DataPipeline.PutPipelineDefinitionOutput
import DataPipeline.QueryObjectsInput
import DataPipeline.QueryObjectsOutput
import DataPipeline.RemoveTagsInput
import DataPipeline.RemoveTagsOutput
import DataPipeline.ReportTaskProgressInput
import DataPipeline.ReportTaskProgressOutput
import DataPipeline.ReportTaskRunnerHeartbeatInput
import DataPipeline.ReportTaskRunnerHeartbeatOutput
import DataPipeline.SetStatusInput
import DataPipeline.SetTaskStatusInput
import DataPipeline.SetTaskStatusOutput
import DataPipeline.ValidatePipelineDefinitionInput
import DataPipeline.ValidatePipelineDefinitionOutput
import DataPipeline.InstanceIdentity
import DataPipeline.TaskObject
import DataPipeline.Query
import DataPipeline.Operator
import DataPipeline.PipelineObjectMap

typealias ParameterAttributeList = Array<ParameterAttribute>

typealias ParameterObjectList = Array<ParameterObject>

typealias ParameterValueList = Array<ParameterValue>

typealias PipelineDescriptionList = Array<PipelineDescription>

typealias PipelineObjectList = Array<PipelineObject>

typealias SelectorList = Array<Selector>

typealias ValidationErrors = Array<ValidationError>

typealias ValidationWarnings = Array<ValidationWarning>

typealias attributeNameString = String

typealias attributeValueString = String

typealias cancelActive = Boolean

typealias errorMessage = String

typealias fieldList = Array<Field>

typealias fieldNameString = String

typealias fieldStringValue = String

typealias id = String

typealias idList = Array<id>

typealias int = Number

typealias longString = String

typealias pipelineList = Array<PipelineIdName>

typealias stringList = Array<String>

typealias tagKey = String

typealias tagList = Array<Tag>

typealias tagValue = String

typealias taskId = String

typealias timestamp = Date

typealias validationMessage = String

typealias validationMessages = Array<validationMessage>

@JsModule("aws-sdk")
external open class DataPipeline(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & DataPipeline.Types.ClientConfiguration */
    open fun activatePipeline(params: ActivatePipelineInput, callback: (err: AWSError, data: ActivatePipelineOutput) -> Unit = definedExternally): Request<ActivatePipelineOutput, AWSError>
    open fun activatePipeline(callback: (err: AWSError, data: ActivatePipelineOutput) -> Unit = definedExternally): Request<ActivatePipelineOutput, AWSError>
    open fun addTags(params: AddTagsInput, callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun addTags(callback: (err: AWSError, data: AddTagsOutput) -> Unit = definedExternally): Request<AddTagsOutput, AWSError>
    open fun createPipeline(params: CreatePipelineInput, callback: (err: AWSError, data: CreatePipelineOutput) -> Unit = definedExternally): Request<CreatePipelineOutput, AWSError>
    open fun createPipeline(callback: (err: AWSError, data: CreatePipelineOutput) -> Unit = definedExternally): Request<CreatePipelineOutput, AWSError>
    open fun deactivatePipeline(params: DeactivatePipelineInput, callback: (err: AWSError, data: DeactivatePipelineOutput) -> Unit = definedExternally): Request<DeactivatePipelineOutput, AWSError>
    open fun deactivatePipeline(callback: (err: AWSError, data: DeactivatePipelineOutput) -> Unit = definedExternally): Request<DeactivatePipelineOutput, AWSError>
    open fun deletePipeline(params: DeletePipelineInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePipeline(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun describeObjects(params: DescribeObjectsInput, callback: (err: AWSError, data: DescribeObjectsOutput) -> Unit = definedExternally): Request<DescribeObjectsOutput, AWSError>
    open fun describeObjects(callback: (err: AWSError, data: DescribeObjectsOutput) -> Unit = definedExternally): Request<DescribeObjectsOutput, AWSError>
    open fun describePipelines(params: DescribePipelinesInput, callback: (err: AWSError, data: DescribePipelinesOutput) -> Unit = definedExternally): Request<DescribePipelinesOutput, AWSError>
    open fun describePipelines(callback: (err: AWSError, data: DescribePipelinesOutput) -> Unit = definedExternally): Request<DescribePipelinesOutput, AWSError>
    open fun evaluateExpression(params: EvaluateExpressionInput, callback: (err: AWSError, data: EvaluateExpressionOutput) -> Unit = definedExternally): Request<EvaluateExpressionOutput, AWSError>
    open fun evaluateExpression(callback: (err: AWSError, data: EvaluateExpressionOutput) -> Unit = definedExternally): Request<EvaluateExpressionOutput, AWSError>
    open fun getPipelineDefinition(params: GetPipelineDefinitionInput, callback: (err: AWSError, data: GetPipelineDefinitionOutput) -> Unit = definedExternally): Request<GetPipelineDefinitionOutput, AWSError>
    open fun getPipelineDefinition(callback: (err: AWSError, data: GetPipelineDefinitionOutput) -> Unit = definedExternally): Request<GetPipelineDefinitionOutput, AWSError>
    open fun listPipelines(params: ListPipelinesInput, callback: (err: AWSError, data: ListPipelinesOutput) -> Unit = definedExternally): Request<ListPipelinesOutput, AWSError>
    open fun listPipelines(callback: (err: AWSError, data: ListPipelinesOutput) -> Unit = definedExternally): Request<ListPipelinesOutput, AWSError>
    open fun pollForTask(params: PollForTaskInput, callback: (err: AWSError, data: PollForTaskOutput) -> Unit = definedExternally): Request<PollForTaskOutput, AWSError>
    open fun pollForTask(callback: (err: AWSError, data: PollForTaskOutput) -> Unit = definedExternally): Request<PollForTaskOutput, AWSError>
    open fun putPipelineDefinition(params: PutPipelineDefinitionInput, callback: (err: AWSError, data: PutPipelineDefinitionOutput) -> Unit = definedExternally): Request<PutPipelineDefinitionOutput, AWSError>
    open fun putPipelineDefinition(callback: (err: AWSError, data: PutPipelineDefinitionOutput) -> Unit = definedExternally): Request<PutPipelineDefinitionOutput, AWSError>
    open fun queryObjects(params: QueryObjectsInput, callback: (err: AWSError, data: QueryObjectsOutput) -> Unit = definedExternally): Request<QueryObjectsOutput, AWSError>
    open fun queryObjects(callback: (err: AWSError, data: QueryObjectsOutput) -> Unit = definedExternally): Request<QueryObjectsOutput, AWSError>
    open fun removeTags(params: RemoveTagsInput, callback: (err: AWSError, data: RemoveTagsOutput) -> Unit = definedExternally): Request<RemoveTagsOutput, AWSError>
    open fun removeTags(callback: (err: AWSError, data: RemoveTagsOutput) -> Unit = definedExternally): Request<RemoveTagsOutput, AWSError>
    open fun reportTaskProgress(params: ReportTaskProgressInput, callback: (err: AWSError, data: ReportTaskProgressOutput) -> Unit = definedExternally): Request<ReportTaskProgressOutput, AWSError>
    open fun reportTaskProgress(callback: (err: AWSError, data: ReportTaskProgressOutput) -> Unit = definedExternally): Request<ReportTaskProgressOutput, AWSError>
    open fun reportTaskRunnerHeartbeat(params: ReportTaskRunnerHeartbeatInput, callback: (err: AWSError, data: ReportTaskRunnerHeartbeatOutput) -> Unit = definedExternally): Request<ReportTaskRunnerHeartbeatOutput, AWSError>
    open fun reportTaskRunnerHeartbeat(callback: (err: AWSError, data: ReportTaskRunnerHeartbeatOutput) -> Unit = definedExternally): Request<ReportTaskRunnerHeartbeatOutput, AWSError>
    open fun setStatus(params: SetStatusInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setStatus(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setTaskStatus(params: SetTaskStatusInput, callback: (err: AWSError, data: SetTaskStatusOutput) -> Unit = definedExternally): Request<SetTaskStatusOutput, AWSError>
    open fun setTaskStatus(callback: (err: AWSError, data: SetTaskStatusOutput) -> Unit = definedExternally): Request<SetTaskStatusOutput, AWSError>
    open fun validatePipelineDefinition(params: ValidatePipelineDefinitionInput, callback: (err: AWSError, data: ValidatePipelineDefinitionOutput) -> Unit = definedExternally): Request<ValidatePipelineDefinitionOutput, AWSError>
    open fun validatePipelineDefinition(callback: (err: AWSError, data: ValidatePipelineDefinitionOutput) -> Unit = definedExternally): Request<ValidatePipelineDefinitionOutput, AWSError>
    interface ActivatePipelineInput {
        var pipelineId: id
        var parameterValues: ParameterValueList?
            get() = definedExternally
            set(value) = definedExternally
        var startTimestamp: timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActivatePipelineOutput
    interface AddTagsInput {
        var pipelineId: id
        var tags: tagList
    }
    interface AddTagsOutput
    interface CreatePipelineInput {
        var name: id
        var uniqueId: id
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: tagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePipelineOutput {
        var pipelineId: id
    }
    interface DeactivatePipelineInput {
        var pipelineId: id
        var cancelActive: cancelActive?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeactivatePipelineOutput
    interface DeletePipelineInput {
        var pipelineId: id
    }
    interface DescribeObjectsInput {
        var pipelineId: id
        var objectIds: idList
        var evaluateExpressions: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeObjectsOutput {
        var pipelineObjects: PipelineObjectList
        var marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var hasMoreResults: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribePipelinesInput {
        var pipelineIds: idList
    }
    interface DescribePipelinesOutput {
        var pipelineDescriptionList: PipelineDescriptionList
    }
    interface EvaluateExpressionInput {
        var pipelineId: id
        var objectId: id
        var expression: longString
    }
    interface EvaluateExpressionOutput {
        var evaluatedExpression: longString
    }
    interface Field {
        var key: fieldNameString
        var stringValue: fieldStringValue?
            get() = definedExternally
            set(value) = definedExternally
        var refValue: fieldNameString?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPipelineDefinitionInput {
        var pipelineId: id
        var version: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPipelineDefinitionOutput {
        var pipelineObjects: PipelineObjectList?
            get() = definedExternally
            set(value) = definedExternally
        var parameterObjects: ParameterObjectList?
            get() = definedExternally
            set(value) = definedExternally
        var parameterValues: ParameterValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InstanceIdentity {
        var document: String?
            get() = definedExternally
            set(value) = definedExternally
        var signature: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPipelinesInput {
        var marker: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPipelinesOutput {
        var pipelineIdList: pipelineList
        var marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var hasMoreResults: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Operator {
        var type: String /* "EQ" | "REF_EQ" | "LE" | "GE" | "BETWEEN" | String */
        var values: stringList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterAttribute {
        var key: attributeNameString
        var stringValue: attributeValueString
    }
    interface ParameterObject {
        var id: fieldNameString
        var attributes: ParameterAttributeList
    }
    interface ParameterValue {
        var id: fieldNameString
        var stringValue: fieldStringValue
    }
    interface PipelineDescription {
        var pipelineId: id
        var name: id
        var fields: fieldList
        var description: String?
            get() = definedExternally
            set(value) = definedExternally
        var tags: tagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineIdName {
        var id: id?
            get() = definedExternally
            set(value) = definedExternally
        var name: id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineObject {
        var id: id
        var name: id
        var fields: fieldList
    }
    interface PipelineObjectMap {
        @nativeGetter
        operator fun get(key: String): PipelineObject?
        @nativeSetter
        operator fun set(key: String, value: PipelineObject)
    }
    interface PollForTaskInput {
        var workerGroup: String
        var hostname: id?
            get() = definedExternally
            set(value) = definedExternally
        var instanceIdentity: InstanceIdentity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PollForTaskOutput {
        var taskObject: TaskObject?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutPipelineDefinitionInput {
        var pipelineId: id
        var pipelineObjects: PipelineObjectList
        var parameterObjects: ParameterObjectList?
            get() = definedExternally
            set(value) = definedExternally
        var parameterValues: ParameterValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutPipelineDefinitionOutput {
        var validationErrors: ValidationErrors?
            get() = definedExternally
            set(value) = definedExternally
        var validationWarnings: ValidationWarnings?
            get() = definedExternally
            set(value) = definedExternally
        var errored: Boolean
    }
    interface Query {
        var selectors: SelectorList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryObjectsInput {
        var pipelineId: id
        var query: Query?
            get() = definedExternally
            set(value) = definedExternally
        var sphere: String
        var marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var limit: int?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryObjectsOutput {
        var ids: idList?
            get() = definedExternally
            set(value) = definedExternally
        var marker: String?
            get() = definedExternally
            set(value) = definedExternally
        var hasMoreResults: Boolean?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RemoveTagsInput {
        var pipelineId: id
        var tagKeys: stringList
    }
    interface RemoveTagsOutput
    interface ReportTaskProgressInput {
        var taskId: taskId
        var fields: fieldList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReportTaskProgressOutput {
        var canceled: Boolean
    }
    interface ReportTaskRunnerHeartbeatInput {
        var taskrunnerId: id
        var workerGroup: String?
            get() = definedExternally
            set(value) = definedExternally
        var hostname: id?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ReportTaskRunnerHeartbeatOutput {
        var terminate: Boolean
    }
    interface Selector {
        var fieldName: String?
            get() = definedExternally
            set(value) = definedExternally
        var operator: Operator?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetStatusInput {
        var pipelineId: id
        var objectIds: idList
        var status: String
    }
    interface SetTaskStatusInput {
        var taskId: taskId
        var taskStatus: String /* "FINISHED" | "FAILED" | "FALSE" | String */
        var errorId: String?
            get() = definedExternally
            set(value) = definedExternally
        var errorMessage: errorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var errorStackTrace: String?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetTaskStatusOutput
    interface Tag {
        var key: tagKey
        var value: tagValue
    }
    interface TaskObject {
        var taskId: taskId?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineId: id?
            get() = definedExternally
            set(value) = definedExternally
        var attemptId: id?
            get() = definedExternally
            set(value) = definedExternally
        var objects: PipelineObjectMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidatePipelineDefinitionInput {
        var pipelineId: id
        var pipelineObjects: PipelineObjectList
        var parameterObjects: ParameterObjectList?
            get() = definedExternally
            set(value) = definedExternally
        var parameterValues: ParameterValueList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidatePipelineDefinitionOutput {
        var validationErrors: ValidationErrors?
            get() = definedExternally
            set(value) = definedExternally
        var validationWarnings: ValidationWarnings?
            get() = definedExternally
            set(value) = definedExternally
        var errored: Boolean
    }
    interface ValidationError {
        var id: id?
            get() = definedExternally
            set(value) = definedExternally
        var errors: validationMessages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidationWarning {
        var id: id?
            get() = definedExternally
            set(value) = definedExternally
        var warnings: validationMessages?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2012-10-29" | "latest" | String */
    }
}