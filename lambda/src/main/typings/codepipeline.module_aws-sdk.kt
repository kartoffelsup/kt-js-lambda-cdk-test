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
import CodePipeline.ActionConfigurationProperty
import CodePipeline.ActionExecutionDetail
import CodePipeline.ActionState
import CodePipeline.ActionType
import CodePipeline.ArtifactDetail
import CodePipeline.Artifact
import CodePipeline.ArtifactRevision
import CodePipeline.InputArtifact
import CodePipeline.Job
import CodePipeline.OutputArtifact
import CodePipeline.PipelineExecutionSummary
import CodePipeline.PipelineSummary
import CodePipeline.StageDeclaration
import CodePipeline.SourceRevision
import CodePipeline.ActionDeclaration
import CodePipeline.BlockerDeclaration
import CodePipeline.StageState
import CodePipeline.Tag
import CodePipeline.ThirdPartyJob
import CodePipeline.WebhookFilterRule
import CodePipeline.ListWebhookItem
import CodePipeline.AcknowledgeJobInput
import CodePipeline.AcknowledgeJobOutput
import CodePipeline.AcknowledgeThirdPartyJobInput
import CodePipeline.AcknowledgeThirdPartyJobOutput
import CodePipeline.CreateCustomActionTypeInput
import CodePipeline.CreateCustomActionTypeOutput
import CodePipeline.CreatePipelineInput
import CodePipeline.CreatePipelineOutput
import CodePipeline.DeleteCustomActionTypeInput
import CodePipeline.DeletePipelineInput
import CodePipeline.DeleteWebhookInput
import CodePipeline.DeleteWebhookOutput
import CodePipeline.DeregisterWebhookWithThirdPartyInput
import CodePipeline.DeregisterWebhookWithThirdPartyOutput
import CodePipeline.DisableStageTransitionInput
import CodePipeline.EnableStageTransitionInput
import CodePipeline.GetJobDetailsInput
import CodePipeline.GetJobDetailsOutput
import CodePipeline.GetPipelineInput
import CodePipeline.GetPipelineOutput
import CodePipeline.GetPipelineExecutionInput
import CodePipeline.GetPipelineExecutionOutput
import CodePipeline.GetPipelineStateInput
import CodePipeline.GetPipelineStateOutput
import CodePipeline.GetThirdPartyJobDetailsInput
import CodePipeline.GetThirdPartyJobDetailsOutput
import CodePipeline.ListActionExecutionsInput
import CodePipeline.ListActionExecutionsOutput
import CodePipeline.ListActionTypesInput
import CodePipeline.ListActionTypesOutput
import CodePipeline.ListPipelineExecutionsInput
import CodePipeline.ListPipelineExecutionsOutput
import CodePipeline.ListPipelinesInput
import CodePipeline.ListPipelinesOutput
import CodePipeline.ListTagsForResourceInput
import CodePipeline.ListTagsForResourceOutput
import CodePipeline.ListWebhooksInput
import CodePipeline.ListWebhooksOutput
import CodePipeline.PollForJobsInput
import CodePipeline.PollForJobsOutput
import CodePipeline.PollForThirdPartyJobsInput
import CodePipeline.PollForThirdPartyJobsOutput
import CodePipeline.PutActionRevisionInput
import CodePipeline.PutActionRevisionOutput
import CodePipeline.PutApprovalResultInput
import CodePipeline.PutApprovalResultOutput
import CodePipeline.PutJobFailureResultInput
import CodePipeline.PutJobSuccessResultInput
import CodePipeline.PutThirdPartyJobFailureResultInput
import CodePipeline.PutThirdPartyJobSuccessResultInput
import CodePipeline.PutWebhookInput
import CodePipeline.PutWebhookOutput
import CodePipeline.RegisterWebhookWithThirdPartyInput
import CodePipeline.RegisterWebhookWithThirdPartyOutput
import CodePipeline.RetryStageExecutionInput
import CodePipeline.RetryStageExecutionOutput
import CodePipeline.StartPipelineExecutionInput
import CodePipeline.StartPipelineExecutionOutput
import CodePipeline.StopPipelineExecutionInput
import CodePipeline.StopPipelineExecutionOutput
import CodePipeline.TagResourceInput
import CodePipeline.TagResourceOutput
import CodePipeline.UntagResourceInput
import CodePipeline.UntagResourceOutput
import CodePipeline.UpdatePipelineInput
import CodePipeline.UpdatePipelineOutput
import CodePipeline.ActionConfigurationMap
import CodePipeline.ActionTypeId
import CodePipeline.ErrorDetails
import CodePipeline.ActionExecutionInput
import CodePipeline.ActionExecutionOutput
import CodePipeline.ResolvedActionConfigurationMap
import CodePipeline.ActionExecutionResult
import CodePipeline.OutputVariablesMap
import CodePipeline.ActionRevision
import CodePipeline.ActionExecution
import CodePipeline.ActionTypeSettings
import CodePipeline.ArtifactDetails
import CodePipeline.ArtifactLocation
import CodePipeline.S3Location
import CodePipeline.S3ArtifactLocation
import CodePipeline.EncryptionKey
import CodePipeline.ArtifactStore
import CodePipeline.PipelineDeclaration
import CodePipeline.JobDetails
import CodePipeline.PipelineExecution
import CodePipeline.PipelineMetadata
import CodePipeline.ThirdPartyJobDetails
import CodePipeline.JobData
import CodePipeline.ActionConfiguration
import CodePipeline.PipelineContext
import CodePipeline.AWSSessionCredentials
import CodePipeline.ActionExecutionFilter
import CodePipeline.WebhookDefinition
import CodePipeline.StageContext
import CodePipeline.ActionContext
import CodePipeline.ArtifactStoreMap
import CodePipeline.ExecutionTrigger
import CodePipeline.StopExecutionTrigger
import CodePipeline.QueryParamMap
import CodePipeline.ApprovalResult
import CodePipeline.FailureDetails
import CodePipeline.CurrentRevision
import CodePipeline.ExecutionDetails
import CodePipeline.TransitionState
import CodePipeline.StageExecution
import CodePipeline.ThirdPartyJobData
import CodePipeline.WebhookAuthConfiguration

typealias AWSRegionName = String

typealias AccessKeyId = String

typealias AccountId = String

typealias ActionConfigurationKey = String

typealias ActionConfigurationPropertyList = Array<ActionConfigurationProperty>

typealias ActionConfigurationQueryableValue = String

typealias ActionConfigurationValue = String

typealias ActionExecutionDetailList = Array<ActionExecutionDetail>

typealias ActionExecutionId = String

typealias ActionExecutionToken = String

typealias ActionName = String

typealias ActionNamespace = String

typealias ActionProvider = String

typealias ActionRunOrder = Number

typealias ActionStateList = Array<ActionState>

typealias ActionTypeList = Array<ActionType>

typealias ApprovalSummary = String

typealias ApprovalToken = String

typealias ArtifactDetailList = Array<ArtifactDetail>

typealias ArtifactList = Array<Artifact>

typealias ArtifactName = String

typealias ArtifactRevisionList = Array<ArtifactRevision>

typealias ArtifactStoreLocation = String

typealias BlockerName = String

typealias Boolean = Boolean

typealias ClientId = String

typealias ClientRequestToken = String

typealias ClientToken = String

typealias Code = String

typealias ContinuationToken = String

typealias Description = String

typealias DisabledReason = String

typealias Enabled = Boolean

typealias EncryptionKeyId = String

typealias ExecutionId = String

typealias ExecutionSummary = String

typealias ExternalExecutionId = String

typealias ExternalExecutionSummary = String

typealias InputArtifactList = Array<InputArtifact>

typealias JobId = String

typealias JobList = Array<Job>

typealias JsonPath = String

typealias LastChangedAt = Date

typealias LastChangedBy = String

typealias LastUpdatedBy = String

typealias MatchEquals = String

typealias MaxBatchSize = Number

typealias MaxResults = Number

typealias MaximumArtifactCount = Number

typealias Message = String

typealias MinimumArtifactCount = Number

typealias NextToken = String

typealias Nonce = String

typealias OutputArtifactList = Array<OutputArtifact>

typealias OutputVariablesKey = String

typealias OutputVariablesValue = String

typealias Percentage = Number

typealias PipelineArn = String

typealias PipelineExecutionId = String

typealias PipelineExecutionSummaryList = Array<PipelineExecutionSummary>

typealias PipelineList = Array<PipelineSummary>

typealias PipelineName = String

typealias PipelineStageDeclarationList = Array<StageDeclaration>

typealias PipelineVersion = Number

typealias ResourceArn = String

typealias Revision = String

typealias RevisionChangeIdentifier = String

typealias RevisionSummary = String

typealias RoleArn = String

typealias S3Bucket = String

typealias S3BucketName = String

typealias S3Key = String

typealias S3ObjectKey = String

typealias SecretAccessKey = String

typealias SessionToken = String

typealias SourceRevisionList = Array<SourceRevision>

typealias StageActionDeclarationList = Array<ActionDeclaration>

typealias StageBlockerDeclarationList = Array<BlockerDeclaration>

typealias StageName = String

typealias StageStateList = Array<StageState>

typealias StopPipelineExecutionReason = String

typealias String = String

typealias TagKey = String

typealias TagKeyList = Array<TagKey>

typealias TagList = Array<Tag>

typealias TagValue = String

typealias ThirdPartyJobId = String

typealias ThirdPartyJobList = Array<ThirdPartyJob>

typealias Time = Date

typealias Timestamp = Date

typealias TriggerDetail = String

typealias Url = String

typealias UrlTemplate = String

typealias Version = String

typealias WebhookArn = String

typealias WebhookAuthConfigurationAllowedIPRange = String

typealias WebhookAuthConfigurationSecretToken = String

typealias WebhookErrorCode = String

typealias WebhookErrorMessage = String

typealias WebhookFilters = Array<WebhookFilterRule>

typealias WebhookLastTriggered = Date

typealias WebhookList = Array<ListWebhookItem>

typealias WebhookName = String

typealias WebhookUrl = String

@JsModule("aws-sdk")
external open class CodePipeline(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CodePipeline.Types.ClientConfiguration */
    open fun acknowledgeJob(params: AcknowledgeJobInput, callback: (err: AWSError, data: AcknowledgeJobOutput) -> Unit = definedExternally): Request<AcknowledgeJobOutput, AWSError>
    open fun acknowledgeJob(callback: (err: AWSError, data: AcknowledgeJobOutput) -> Unit = definedExternally): Request<AcknowledgeJobOutput, AWSError>
    open fun acknowledgeThirdPartyJob(params: AcknowledgeThirdPartyJobInput, callback: (err: AWSError, data: AcknowledgeThirdPartyJobOutput) -> Unit = definedExternally): Request<AcknowledgeThirdPartyJobOutput, AWSError>
    open fun acknowledgeThirdPartyJob(callback: (err: AWSError, data: AcknowledgeThirdPartyJobOutput) -> Unit = definedExternally): Request<AcknowledgeThirdPartyJobOutput, AWSError>
    open fun createCustomActionType(params: CreateCustomActionTypeInput, callback: (err: AWSError, data: CreateCustomActionTypeOutput) -> Unit = definedExternally): Request<CreateCustomActionTypeOutput, AWSError>
    open fun createCustomActionType(callback: (err: AWSError, data: CreateCustomActionTypeOutput) -> Unit = definedExternally): Request<CreateCustomActionTypeOutput, AWSError>
    open fun createPipeline(params: CreatePipelineInput, callback: (err: AWSError, data: CreatePipelineOutput) -> Unit = definedExternally): Request<CreatePipelineOutput, AWSError>
    open fun createPipeline(callback: (err: AWSError, data: CreatePipelineOutput) -> Unit = definedExternally): Request<CreatePipelineOutput, AWSError>
    open fun deleteCustomActionType(params: DeleteCustomActionTypeInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteCustomActionType(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePipeline(params: DeletePipelineInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deletePipeline(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteWebhook(params: DeleteWebhookInput, callback: (err: AWSError, data: DeleteWebhookOutput) -> Unit = definedExternally): Request<DeleteWebhookOutput, AWSError>
    open fun deleteWebhook(callback: (err: AWSError, data: DeleteWebhookOutput) -> Unit = definedExternally): Request<DeleteWebhookOutput, AWSError>
    open fun deregisterWebhookWithThirdParty(params: DeregisterWebhookWithThirdPartyInput, callback: (err: AWSError, data: DeregisterWebhookWithThirdPartyOutput) -> Unit = definedExternally): Request<DeregisterWebhookWithThirdPartyOutput, AWSError>
    open fun deregisterWebhookWithThirdParty(callback: (err: AWSError, data: DeregisterWebhookWithThirdPartyOutput) -> Unit = definedExternally): Request<DeregisterWebhookWithThirdPartyOutput, AWSError>
    open fun disableStageTransition(params: DisableStageTransitionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun disableStageTransition(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableStageTransition(params: EnableStageTransitionInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun enableStageTransition(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun getJobDetails(params: GetJobDetailsInput, callback: (err: AWSError, data: GetJobDetailsOutput) -> Unit = definedExternally): Request<GetJobDetailsOutput, AWSError>
    open fun getJobDetails(callback: (err: AWSError, data: GetJobDetailsOutput) -> Unit = definedExternally): Request<GetJobDetailsOutput, AWSError>
    open fun getPipeline(params: GetPipelineInput, callback: (err: AWSError, data: GetPipelineOutput) -> Unit = definedExternally): Request<GetPipelineOutput, AWSError>
    open fun getPipeline(callback: (err: AWSError, data: GetPipelineOutput) -> Unit = definedExternally): Request<GetPipelineOutput, AWSError>
    open fun getPipelineExecution(params: GetPipelineExecutionInput, callback: (err: AWSError, data: GetPipelineExecutionOutput) -> Unit = definedExternally): Request<GetPipelineExecutionOutput, AWSError>
    open fun getPipelineExecution(callback: (err: AWSError, data: GetPipelineExecutionOutput) -> Unit = definedExternally): Request<GetPipelineExecutionOutput, AWSError>
    open fun getPipelineState(params: GetPipelineStateInput, callback: (err: AWSError, data: GetPipelineStateOutput) -> Unit = definedExternally): Request<GetPipelineStateOutput, AWSError>
    open fun getPipelineState(callback: (err: AWSError, data: GetPipelineStateOutput) -> Unit = definedExternally): Request<GetPipelineStateOutput, AWSError>
    open fun getThirdPartyJobDetails(params: GetThirdPartyJobDetailsInput, callback: (err: AWSError, data: GetThirdPartyJobDetailsOutput) -> Unit = definedExternally): Request<GetThirdPartyJobDetailsOutput, AWSError>
    open fun getThirdPartyJobDetails(callback: (err: AWSError, data: GetThirdPartyJobDetailsOutput) -> Unit = definedExternally): Request<GetThirdPartyJobDetailsOutput, AWSError>
    open fun listActionExecutions(params: ListActionExecutionsInput, callback: (err: AWSError, data: ListActionExecutionsOutput) -> Unit = definedExternally): Request<ListActionExecutionsOutput, AWSError>
    open fun listActionExecutions(callback: (err: AWSError, data: ListActionExecutionsOutput) -> Unit = definedExternally): Request<ListActionExecutionsOutput, AWSError>
    open fun listActionTypes(params: ListActionTypesInput, callback: (err: AWSError, data: ListActionTypesOutput) -> Unit = definedExternally): Request<ListActionTypesOutput, AWSError>
    open fun listActionTypes(callback: (err: AWSError, data: ListActionTypesOutput) -> Unit = definedExternally): Request<ListActionTypesOutput, AWSError>
    open fun listPipelineExecutions(params: ListPipelineExecutionsInput, callback: (err: AWSError, data: ListPipelineExecutionsOutput) -> Unit = definedExternally): Request<ListPipelineExecutionsOutput, AWSError>
    open fun listPipelineExecutions(callback: (err: AWSError, data: ListPipelineExecutionsOutput) -> Unit = definedExternally): Request<ListPipelineExecutionsOutput, AWSError>
    open fun listPipelines(params: ListPipelinesInput, callback: (err: AWSError, data: ListPipelinesOutput) -> Unit = definedExternally): Request<ListPipelinesOutput, AWSError>
    open fun listPipelines(callback: (err: AWSError, data: ListPipelinesOutput) -> Unit = definedExternally): Request<ListPipelinesOutput, AWSError>
    open fun listTagsForResource(params: ListTagsForResourceInput, callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listTagsForResource(callback: (err: AWSError, data: ListTagsForResourceOutput) -> Unit = definedExternally): Request<ListTagsForResourceOutput, AWSError>
    open fun listWebhooks(params: ListWebhooksInput, callback: (err: AWSError, data: ListWebhooksOutput) -> Unit = definedExternally): Request<ListWebhooksOutput, AWSError>
    open fun listWebhooks(callback: (err: AWSError, data: ListWebhooksOutput) -> Unit = definedExternally): Request<ListWebhooksOutput, AWSError>
    open fun pollForJobs(params: PollForJobsInput, callback: (err: AWSError, data: PollForJobsOutput) -> Unit = definedExternally): Request<PollForJobsOutput, AWSError>
    open fun pollForJobs(callback: (err: AWSError, data: PollForJobsOutput) -> Unit = definedExternally): Request<PollForJobsOutput, AWSError>
    open fun pollForThirdPartyJobs(params: PollForThirdPartyJobsInput, callback: (err: AWSError, data: PollForThirdPartyJobsOutput) -> Unit = definedExternally): Request<PollForThirdPartyJobsOutput, AWSError>
    open fun pollForThirdPartyJobs(callback: (err: AWSError, data: PollForThirdPartyJobsOutput) -> Unit = definedExternally): Request<PollForThirdPartyJobsOutput, AWSError>
    open fun putActionRevision(params: PutActionRevisionInput, callback: (err: AWSError, data: PutActionRevisionOutput) -> Unit = definedExternally): Request<PutActionRevisionOutput, AWSError>
    open fun putActionRevision(callback: (err: AWSError, data: PutActionRevisionOutput) -> Unit = definedExternally): Request<PutActionRevisionOutput, AWSError>
    open fun putApprovalResult(params: PutApprovalResultInput, callback: (err: AWSError, data: PutApprovalResultOutput) -> Unit = definedExternally): Request<PutApprovalResultOutput, AWSError>
    open fun putApprovalResult(callback: (err: AWSError, data: PutApprovalResultOutput) -> Unit = definedExternally): Request<PutApprovalResultOutput, AWSError>
    open fun putJobFailureResult(params: PutJobFailureResultInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putJobFailureResult(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putJobSuccessResult(params: PutJobSuccessResultInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putJobSuccessResult(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putThirdPartyJobFailureResult(params: PutThirdPartyJobFailureResultInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putThirdPartyJobFailureResult(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putThirdPartyJobSuccessResult(params: PutThirdPartyJobSuccessResultInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putThirdPartyJobSuccessResult(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun putWebhook(params: PutWebhookInput, callback: (err: AWSError, data: PutWebhookOutput) -> Unit = definedExternally): Request<PutWebhookOutput, AWSError>
    open fun putWebhook(callback: (err: AWSError, data: PutWebhookOutput) -> Unit = definedExternally): Request<PutWebhookOutput, AWSError>
    open fun registerWebhookWithThirdParty(params: RegisterWebhookWithThirdPartyInput, callback: (err: AWSError, data: RegisterWebhookWithThirdPartyOutput) -> Unit = definedExternally): Request<RegisterWebhookWithThirdPartyOutput, AWSError>
    open fun registerWebhookWithThirdParty(callback: (err: AWSError, data: RegisterWebhookWithThirdPartyOutput) -> Unit = definedExternally): Request<RegisterWebhookWithThirdPartyOutput, AWSError>
    open fun retryStageExecution(params: RetryStageExecutionInput, callback: (err: AWSError, data: RetryStageExecutionOutput) -> Unit = definedExternally): Request<RetryStageExecutionOutput, AWSError>
    open fun retryStageExecution(callback: (err: AWSError, data: RetryStageExecutionOutput) -> Unit = definedExternally): Request<RetryStageExecutionOutput, AWSError>
    open fun startPipelineExecution(params: StartPipelineExecutionInput, callback: (err: AWSError, data: StartPipelineExecutionOutput) -> Unit = definedExternally): Request<StartPipelineExecutionOutput, AWSError>
    open fun startPipelineExecution(callback: (err: AWSError, data: StartPipelineExecutionOutput) -> Unit = definedExternally): Request<StartPipelineExecutionOutput, AWSError>
    open fun stopPipelineExecution(params: StopPipelineExecutionInput, callback: (err: AWSError, data: StopPipelineExecutionOutput) -> Unit = definedExternally): Request<StopPipelineExecutionOutput, AWSError>
    open fun stopPipelineExecution(callback: (err: AWSError, data: StopPipelineExecutionOutput) -> Unit = definedExternally): Request<StopPipelineExecutionOutput, AWSError>
    open fun tagResource(params: TagResourceInput, callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun tagResource(callback: (err: AWSError, data: TagResourceOutput) -> Unit = definedExternally): Request<TagResourceOutput, AWSError>
    open fun untagResource(params: UntagResourceInput, callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun untagResource(callback: (err: AWSError, data: UntagResourceOutput) -> Unit = definedExternally): Request<UntagResourceOutput, AWSError>
    open fun updatePipeline(params: UpdatePipelineInput, callback: (err: AWSError, data: UpdatePipelineOutput) -> Unit = definedExternally): Request<UpdatePipelineOutput, AWSError>
    open fun updatePipeline(callback: (err: AWSError, data: UpdatePipelineOutput) -> Unit = definedExternally): Request<UpdatePipelineOutput, AWSError>
    interface AWSSessionCredentials {
        var accessKeyId: AccessKeyId
        var secretAccessKey: SecretAccessKey
        var sessionToken: SessionToken
    }
    interface AcknowledgeJobInput {
        var jobId: JobId
        var nonce: Nonce
    }
    interface AcknowledgeJobOutput {
        var status: String /* "Created" | "Queued" | "Dispatched" | "InProgress" | "TimedOut" | "Succeeded" | "Failed" | String */
    }
    interface AcknowledgeThirdPartyJobInput {
        var jobId: ThirdPartyJobId
        var nonce: Nonce
        var clientToken: ClientToken
    }
    interface AcknowledgeThirdPartyJobOutput {
        var status: String /* "Created" | "Queued" | "Dispatched" | "InProgress" | "TimedOut" | "Succeeded" | "Failed" | String */
    }
    interface ActionConfiguration {
        var configuration: ActionConfigurationMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionConfigurationMap {
        @nativeGetter
        operator fun get(key: String): ActionConfigurationValue?
        @nativeSetter
        operator fun set(key: String, value: ActionConfigurationValue)
    }
    interface ActionConfigurationProperty {
        var name: ActionConfigurationKey
        var required: Boolean
        var key: Boolean
        var secret: Boolean
        var queryable: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var type: String /* "String" | "Number" | "Boolean" | String */
    }
    interface ActionContext {
        var name: ActionName?
            get() = definedExternally
            set(value) = definedExternally
        var actionExecutionId: ActionExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionDeclaration {
        var name: ActionName
        var actionTypeId: ActionTypeId
        var runOrder: ActionRunOrder?
            get() = definedExternally
            set(value) = definedExternally
        var configuration: ActionConfigurationMap?
            get() = definedExternally
            set(value) = definedExternally
        var outputArtifacts: OutputArtifactList?
            get() = definedExternally
            set(value) = definedExternally
        var inputArtifacts: InputArtifactList?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var region: AWSRegionName?
            get() = definedExternally
            set(value) = definedExternally
        var namespace: ActionNamespace?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionExecution {
        var status: String /* "InProgress" | "Abandoned" | "Succeeded" | "Failed" | String */
        var summary: ExecutionSummary?
            get() = definedExternally
            set(value) = definedExternally
        var lastStatusChange: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var token: ActionExecutionToken?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdatedBy: LastUpdatedBy?
            get() = definedExternally
            set(value) = definedExternally
        var externalExecutionId: ExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var externalExecutionUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var percentComplete: Percentage?
            get() = definedExternally
            set(value) = definedExternally
        var errorDetails: ErrorDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionExecutionDetail {
        var pipelineExecutionId: PipelineExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var actionExecutionId: ActionExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineVersion: PipelineVersion?
            get() = definedExternally
            set(value) = definedExternally
        var stageName: StageName?
            get() = definedExternally
            set(value) = definedExternally
        var actionName: ActionName?
            get() = definedExternally
            set(value) = definedExternally
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "InProgress" | "Abandoned" | "Succeeded" | "Failed" | String */
        var input: ActionExecutionInput?
            get() = definedExternally
            set(value) = definedExternally
        var output: ActionExecutionOutput?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionExecutionFilter {
        var pipelineExecutionId: PipelineExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionExecutionInput {
        var actionTypeId: ActionTypeId?
            get() = definedExternally
            set(value) = definedExternally
        var configuration: ActionConfigurationMap?
            get() = definedExternally
            set(value) = definedExternally
        var resolvedConfiguration: ResolvedActionConfigurationMap?
            get() = definedExternally
            set(value) = definedExternally
        var roleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var region: AWSRegionName?
            get() = definedExternally
            set(value) = definedExternally
        var inputArtifacts: ArtifactDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var namespace: ActionNamespace?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionExecutionOutput {
        var outputArtifacts: ArtifactDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var executionResult: ActionExecutionResult?
            get() = definedExternally
            set(value) = definedExternally
        var outputVariables: OutputVariablesMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionExecutionResult {
        var externalExecutionId: ExternalExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var externalExecutionSummary: ExternalExecutionSummary?
            get() = definedExternally
            set(value) = definedExternally
        var externalExecutionUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionRevision {
        var revisionId: Revision
        var revisionChangeId: RevisionChangeIdentifier
        var created: Timestamp
    }
    interface ActionState {
        var actionName: ActionName?
            get() = definedExternally
            set(value) = definedExternally
        var currentRevision: ActionRevision?
            get() = definedExternally
            set(value) = definedExternally
        var latestExecution: ActionExecution?
            get() = definedExternally
            set(value) = definedExternally
        var entityUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var revisionUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ActionType {
        var id: ActionTypeId
        var settings: ActionTypeSettings?
            get() = definedExternally
            set(value) = definedExternally
        var actionConfigurationProperties: ActionConfigurationPropertyList?
            get() = definedExternally
            set(value) = definedExternally
        var inputArtifactDetails: ArtifactDetails
        var outputArtifactDetails: ArtifactDetails
    }
    interface ActionTypeId {
        var category: String /* "Source" | "Build" | "Deploy" | "Test" | "Invoke" | "Approval" | String */
        var owner: String /* "AWS" | "ThirdParty" | "Custom" | String */
        var provider: ActionProvider
        var version: Version
    }
    interface ActionTypeSettings {
        var thirdPartyConfigurationUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
        var entityUrlTemplate: UrlTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var executionUrlTemplate: UrlTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var revisionUrlTemplate: UrlTemplate?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ApprovalResult {
        var summary: ApprovalSummary
        var status: String /* "Approved" | "Rejected" | String */
    }
    interface Artifact {
        var name: ArtifactName?
            get() = definedExternally
            set(value) = definedExternally
        var revision: Revision?
            get() = definedExternally
            set(value) = definedExternally
        var location: ArtifactLocation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ArtifactDetail {
        var name: ArtifactName?
            get() = definedExternally
            set(value) = definedExternally
        var s3location: S3Location?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ArtifactDetails {
        var minimumCount: MinimumArtifactCount
        var maximumCount: MaximumArtifactCount
    }
    interface ArtifactLocation {
        var type: String /* "S3" | String */
        var s3Location: S3ArtifactLocation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ArtifactRevision {
        var name: ArtifactName?
            get() = definedExternally
            set(value) = definedExternally
        var revisionId: Revision?
            get() = definedExternally
            set(value) = definedExternally
        var revisionChangeIdentifier: RevisionChangeIdentifier?
            get() = definedExternally
            set(value) = definedExternally
        var revisionSummary: RevisionSummary?
            get() = definedExternally
            set(value) = definedExternally
        var created: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var revisionUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ArtifactStore {
        var type: String /* "S3" | String */
        var location: ArtifactStoreLocation
        var encryptionKey: EncryptionKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ArtifactStoreMap {
        @nativeGetter
        operator fun get(key: String): ArtifactStore?
        @nativeSetter
        operator fun set(key: String, value: ArtifactStore)
    }
    interface BlockerDeclaration {
        var name: BlockerName
        var type: String /* "Schedule" | String */
    }
    interface CreateCustomActionTypeInput {
        var category: String /* "Source" | "Build" | "Deploy" | "Test" | "Invoke" | "Approval" | String */
        var provider: ActionProvider
        var version: Version
        var settings: ActionTypeSettings?
            get() = definedExternally
            set(value) = definedExternally
        var configurationProperties: ActionConfigurationPropertyList?
            get() = definedExternally
            set(value) = definedExternally
        var inputArtifactDetails: ArtifactDetails
        var outputArtifactDetails: ArtifactDetails
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateCustomActionTypeOutput {
        var actionType: ActionType
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePipelineInput {
        var pipeline: PipelineDeclaration
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreatePipelineOutput {
        var pipeline: PipelineDeclaration?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CurrentRevision {
        var revision: Revision
        var changeIdentifier: RevisionChangeIdentifier
        var created: Time?
            get() = definedExternally
            set(value) = definedExternally
        var revisionSummary: RevisionSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteCustomActionTypeInput {
        var category: String /* "Source" | "Build" | "Deploy" | "Test" | "Invoke" | "Approval" | String */
        var provider: ActionProvider
        var version: Version
    }
    interface DeletePipelineInput {
        var name: PipelineName
    }
    interface DeleteWebhookInput {
        var name: WebhookName
    }
    interface DeleteWebhookOutput
    interface DeregisterWebhookWithThirdPartyInput {
        var webhookName: WebhookName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterWebhookWithThirdPartyOutput
    interface DisableStageTransitionInput {
        var pipelineName: PipelineName
        var stageName: StageName
        var transitionType: String /* "Inbound" | "Outbound" | String */
        var reason: DisabledReason
    }
    interface EnableStageTransitionInput {
        var pipelineName: PipelineName
        var stageName: StageName
        var transitionType: String /* "Inbound" | "Outbound" | String */
    }
    interface EncryptionKey {
        var id: EncryptionKeyId
        var type: String /* "KMS" | String */
    }
    interface ErrorDetails {
        var code: Code?
            get() = definedExternally
            set(value) = definedExternally
        var message: Message?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionDetails {
        var summary: ExecutionSummary?
            get() = definedExternally
            set(value) = definedExternally
        var externalExecutionId: ExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var percentComplete: Percentage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecutionTrigger {
        var triggerType: String /* "CreatePipeline" | "StartPipelineExecution" | "PollForSourceChanges" | "Webhook" | "CloudWatchEvent" | "PutActionRevision" | String */
        var triggerDetail: TriggerDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface FailureDetails {
        var type: String /* "JobFailed" | "ConfigurationError" | "PermissionError" | "RevisionOutOfSync" | "RevisionUnavailable" | "SystemUnavailable" | String */
        var message: Message
        var externalExecutionId: ExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetJobDetailsInput {
        var jobId: JobId
    }
    interface GetJobDetailsOutput {
        var jobDetails: JobDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPipelineExecutionInput {
        var pipelineName: PipelineName
        var pipelineExecutionId: PipelineExecutionId
    }
    interface GetPipelineExecutionOutput {
        var pipelineExecution: PipelineExecution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPipelineInput {
        var name: PipelineName
        var version: PipelineVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPipelineOutput {
        var pipeline: PipelineDeclaration?
            get() = definedExternally
            set(value) = definedExternally
        var metadata: PipelineMetadata?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetPipelineStateInput {
        var name: PipelineName
    }
    interface GetPipelineStateOutput {
        var pipelineName: PipelineName?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineVersion: PipelineVersion?
            get() = definedExternally
            set(value) = definedExternally
        var stageStates: StageStateList?
            get() = definedExternally
            set(value) = definedExternally
        var created: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var updated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetThirdPartyJobDetailsInput {
        var jobId: ThirdPartyJobId
        var clientToken: ClientToken
    }
    interface GetThirdPartyJobDetailsOutput {
        var jobDetails: ThirdPartyJobDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface InputArtifact {
        var name: ArtifactName
    }
    interface Job {
        var id: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var data: JobData?
            get() = definedExternally
            set(value) = definedExternally
        var nonce: Nonce?
            get() = definedExternally
            set(value) = definedExternally
        var accountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobData {
        var actionTypeId: ActionTypeId?
            get() = definedExternally
            set(value) = definedExternally
        var actionConfiguration: ActionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineContext: PipelineContext?
            get() = definedExternally
            set(value) = definedExternally
        var inputArtifacts: ArtifactList?
            get() = definedExternally
            set(value) = definedExternally
        var outputArtifacts: ArtifactList?
            get() = definedExternally
            set(value) = definedExternally
        var artifactCredentials: AWSSessionCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var continuationToken: ContinuationToken?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionKey: EncryptionKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface JobDetails {
        var id: JobId?
            get() = definedExternally
            set(value) = definedExternally
        var data: JobData?
            get() = definedExternally
            set(value) = definedExternally
        var accountId: AccountId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListActionExecutionsInput {
        var pipelineName: PipelineName
        var filter: ActionExecutionFilter?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListActionExecutionsOutput {
        var actionExecutionDetails: ActionExecutionDetailList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListActionTypesInput {
        var actionOwnerFilter: String /* "AWS" | "ThirdParty" | "Custom" | String */
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListActionTypesOutput {
        var actionTypes: ActionTypeList
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPipelineExecutionsInput {
        var pipelineName: PipelineName
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPipelineExecutionsOutput {
        var pipelineExecutionSummaries: PipelineExecutionSummaryList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPipelinesInput {
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListPipelinesOutput {
        var pipelines: PipelineList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceInput {
        var resourceArn: ResourceArn
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var maxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTagsForResourceOutput {
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
        var nextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebhookItem {
        var definition: WebhookDefinition
        var url: WebhookUrl
        var errorMessage: WebhookErrorMessage?
            get() = definedExternally
            set(value) = definedExternally
        var errorCode: WebhookErrorCode?
            get() = definedExternally
            set(value) = definedExternally
        var lastTriggered: WebhookLastTriggered?
            get() = definedExternally
            set(value) = definedExternally
        var arn: WebhookArn?
            get() = definedExternally
            set(value) = definedExternally
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebhooksInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListWebhooksOutput {
        var webhooks: WebhookList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface OutputArtifact {
        var name: ArtifactName
    }
    interface OutputVariablesMap {
        @nativeGetter
        operator fun get(key: String): OutputVariablesValue?
        @nativeSetter
        operator fun set(key: String, value: OutputVariablesValue)
    }
    interface PipelineContext {
        var pipelineName: PipelineName?
            get() = definedExternally
            set(value) = definedExternally
        var stage: StageContext?
            get() = definedExternally
            set(value) = definedExternally
        var action: ActionContext?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineArn: PipelineArn?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineExecutionId: PipelineExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineDeclaration {
        var name: PipelineName
        var roleArn: RoleArn
        var artifactStore: ArtifactStore?
            get() = definedExternally
            set(value) = definedExternally
        var artifactStores: ArtifactStoreMap?
            get() = definedExternally
            set(value) = definedExternally
        var stages: PipelineStageDeclarationList
        var version: PipelineVersion?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineExecution {
        var pipelineName: PipelineName?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineVersion: PipelineVersion?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineExecutionId: PipelineExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "InProgress" | "Stopped" | "Stopping" | "Succeeded" | "Superseded" | "Failed" | String */
        var artifactRevisions: ArtifactRevisionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineExecutionSummary {
        var pipelineExecutionId: PipelineExecutionId?
            get() = definedExternally
            set(value) = definedExternally
        var status: String /* "InProgress" | "Stopped" | "Stopping" | "Succeeded" | "Superseded" | "Failed" | String */
        var startTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var lastUpdateTime: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var sourceRevisions: SourceRevisionList?
            get() = definedExternally
            set(value) = definedExternally
        var trigger: ExecutionTrigger?
            get() = definedExternally
            set(value) = definedExternally
        var stopTrigger: StopExecutionTrigger?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineMetadata {
        var pipelineArn: PipelineArn?
            get() = definedExternally
            set(value) = definedExternally
        var created: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var updated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PipelineSummary {
        var name: PipelineName?
            get() = definedExternally
            set(value) = definedExternally
        var version: PipelineVersion?
            get() = definedExternally
            set(value) = definedExternally
        var created: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var updated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PollForJobsInput {
        var actionTypeId: ActionTypeId
        var maxBatchSize: MaxBatchSize?
            get() = definedExternally
            set(value) = definedExternally
        var queryParam: QueryParamMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PollForJobsOutput {
        var jobs: JobList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PollForThirdPartyJobsInput {
        var actionTypeId: ActionTypeId
        var maxBatchSize: MaxBatchSize?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PollForThirdPartyJobsOutput {
        var jobs: ThirdPartyJobList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutActionRevisionInput {
        var pipelineName: PipelineName
        var stageName: StageName
        var actionName: ActionName
        var actionRevision: ActionRevision
    }
    interface PutActionRevisionOutput {
        var newRevision: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineExecutionId: PipelineExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutApprovalResultInput {
        var pipelineName: PipelineName
        var stageName: StageName
        var actionName: ActionName
        var result: ApprovalResult
        var token: ApprovalToken
    }
    interface PutApprovalResultOutput {
        var approvedAt: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutJobFailureResultInput {
        var jobId: JobId
        var failureDetails: FailureDetails
    }
    interface PutJobSuccessResultInput {
        var jobId: JobId
        var currentRevision: CurrentRevision?
            get() = definedExternally
            set(value) = definedExternally
        var continuationToken: ContinuationToken?
            get() = definedExternally
            set(value) = definedExternally
        var executionDetails: ExecutionDetails?
            get() = definedExternally
            set(value) = definedExternally
        var outputVariables: OutputVariablesMap?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutThirdPartyJobFailureResultInput {
        var jobId: ThirdPartyJobId
        var clientToken: ClientToken
        var failureDetails: FailureDetails
    }
    interface PutThirdPartyJobSuccessResultInput {
        var jobId: ThirdPartyJobId
        var clientToken: ClientToken
        var currentRevision: CurrentRevision?
            get() = definedExternally
            set(value) = definedExternally
        var continuationToken: ContinuationToken?
            get() = definedExternally
            set(value) = definedExternally
        var executionDetails: ExecutionDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutWebhookInput {
        var webhook: WebhookDefinition
        var tags: TagList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PutWebhookOutput {
        var webhook: ListWebhookItem?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface QueryParamMap {
        @nativeGetter
        operator fun get(key: String): ActionConfigurationQueryableValue?
        @nativeSetter
        operator fun set(key: String, value: ActionConfigurationQueryableValue)
    }
    interface RegisterWebhookWithThirdPartyInput {
        var webhookName: WebhookName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterWebhookWithThirdPartyOutput
    interface ResolvedActionConfigurationMap {
        @nativeGetter
        operator fun get(key: String): String?
        @nativeSetter
        operator fun set(key: String, value: String)
    }
    interface RetryStageExecutionInput {
        var pipelineName: PipelineName
        var stageName: StageName
        var pipelineExecutionId: PipelineExecutionId
        var retryMode: String /* "FAILED_ACTIONS" | String */
    }
    interface RetryStageExecutionOutput {
        var pipelineExecutionId: PipelineExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface S3ArtifactLocation {
        var bucketName: S3BucketName
        var objectKey: S3ObjectKey
    }
    interface S3Location {
        var bucket: S3Bucket?
            get() = definedExternally
            set(value) = definedExternally
        var key: S3Key?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SourceRevision {
        var actionName: ActionName
        var revisionId: Revision?
            get() = definedExternally
            set(value) = definedExternally
        var revisionSummary: RevisionSummary?
            get() = definedExternally
            set(value) = definedExternally
        var revisionUrl: Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StageContext {
        var name: StageName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StageDeclaration {
        var name: StageName
        var blockers: StageBlockerDeclarationList?
            get() = definedExternally
            set(value) = definedExternally
        var actions: StageActionDeclarationList
    }
    interface StageExecution {
        var pipelineExecutionId: PipelineExecutionId
        var status: String /* "InProgress" | "Failed" | "Stopped" | "Stopping" | "Succeeded" | String */
    }
    interface StageState {
        var stageName: StageName?
            get() = definedExternally
            set(value) = definedExternally
        var inboundTransitionState: TransitionState?
            get() = definedExternally
            set(value) = definedExternally
        var actionStates: ActionStateList?
            get() = definedExternally
            set(value) = definedExternally
        var latestExecution: StageExecution?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartPipelineExecutionInput {
        var name: PipelineName
        var clientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StartPipelineExecutionOutput {
        var pipelineExecutionId: PipelineExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopExecutionTrigger {
        var reason: StopPipelineExecutionReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopPipelineExecutionInput {
        var pipelineName: PipelineName
        var pipelineExecutionId: PipelineExecutionId
        var abandon: Boolean?
            get() = definedExternally
            set(value) = definedExternally
        var reason: StopPipelineExecutionReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopPipelineExecutionOutput {
        var pipelineExecutionId: PipelineExecutionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Tag {
        var key: TagKey
        var value: TagValue
    }
    interface TagResourceInput {
        var resourceArn: ResourceArn
        var tags: TagList
    }
    interface TagResourceOutput
    interface ThirdPartyJob {
        var clientId: ClientId?
            get() = definedExternally
            set(value) = definedExternally
        var jobId: JobId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThirdPartyJobData {
        var actionTypeId: ActionTypeId?
            get() = definedExternally
            set(value) = definedExternally
        var actionConfiguration: ActionConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var pipelineContext: PipelineContext?
            get() = definedExternally
            set(value) = definedExternally
        var inputArtifacts: ArtifactList?
            get() = definedExternally
            set(value) = definedExternally
        var outputArtifacts: ArtifactList?
            get() = definedExternally
            set(value) = definedExternally
        var artifactCredentials: AWSSessionCredentials?
            get() = definedExternally
            set(value) = definedExternally
        var continuationToken: ContinuationToken?
            get() = definedExternally
            set(value) = definedExternally
        var encryptionKey: EncryptionKey?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ThirdPartyJobDetails {
        var id: ThirdPartyJobId?
            get() = definedExternally
            set(value) = definedExternally
        var data: ThirdPartyJobData?
            get() = definedExternally
            set(value) = definedExternally
        var nonce: Nonce?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TransitionState {
        var enabled: Enabled?
            get() = definedExternally
            set(value) = definedExternally
        var lastChangedBy: LastChangedBy?
            get() = definedExternally
            set(value) = definedExternally
        var lastChangedAt: LastChangedAt?
            get() = definedExternally
            set(value) = definedExternally
        var disabledReason: DisabledReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UntagResourceInput {
        var resourceArn: ResourceArn
        var tagKeys: TagKeyList
    }
    interface UntagResourceOutput
    interface UpdatePipelineInput {
        var pipeline: PipelineDeclaration
    }
    interface UpdatePipelineOutput {
        var pipeline: PipelineDeclaration?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WebhookAuthConfiguration {
        var AllowedIPRange: WebhookAuthConfigurationAllowedIPRange?
            get() = definedExternally
            set(value) = definedExternally
        var SecretToken: WebhookAuthConfigurationSecretToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface WebhookDefinition {
        var name: WebhookName
        var targetPipeline: PipelineName
        var targetAction: ActionName
        var filters: WebhookFilters
        var authentication: String /* "GITHUB_HMAC" | "IP" | "UNAUTHENTICATED" | String */
        var authenticationConfiguration: WebhookAuthConfiguration
    }
    interface WebhookFilterRule {
        var jsonPath: JsonPath
        var matchEquals: MatchEquals?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2015-07-09" | "latest" | String */
    }
}