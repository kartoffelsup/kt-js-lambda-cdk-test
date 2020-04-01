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
import CloudFormation.AccountLimit
import CloudFormation.ChangeSetSummary
import CloudFormation.Change
import CloudFormation.Export
import CloudFormation.Output
import CloudFormation.ParameterDeclaration
import CloudFormation.Parameter
import CloudFormation.PhysicalResourceIdContextKeyValuePair
import CloudFormation.PropertyDifference
import CloudFormation.ResourceChangeDetail
import CloudFormation.ResourceIdentifierSummary
import CloudFormation.ResourceToImport
import CloudFormation.RollbackTrigger
import CloudFormation.StackEvent
import CloudFormation.StackInstanceSummary
import CloudFormation.StackResourceDrift
import CloudFormation.StackResourceSummary
import CloudFormation.StackResource
import CloudFormation.StackSetOperationResultSummary
import CloudFormation.StackSetOperationSummary
import CloudFormation.StackSetSummary
import CloudFormation.StackSummary
import CloudFormation.Stack
import CloudFormation.Tag
import CloudFormation.TemplateParameter
import CloudFormation.TypeSummary
import CloudFormation.TypeVersionSummary
import CloudFormation.CancelUpdateStackInput
import CloudFormation.ContinueUpdateRollbackInput
import CloudFormation.ContinueUpdateRollbackOutput
import CloudFormation.CreateChangeSetInput
import CloudFormation.CreateChangeSetOutput
import CloudFormation.CreateStackInput
import CloudFormation.CreateStackOutput
import CloudFormation.CreateStackInstancesInput
import CloudFormation.CreateStackInstancesOutput
import CloudFormation.CreateStackSetInput
import CloudFormation.CreateStackSetOutput
import CloudFormation.DeleteChangeSetInput
import CloudFormation.DeleteChangeSetOutput
import CloudFormation.DeleteStackInput
import CloudFormation.DeleteStackInstancesInput
import CloudFormation.DeleteStackInstancesOutput
import CloudFormation.DeleteStackSetInput
import CloudFormation.DeleteStackSetOutput
import CloudFormation.DeregisterTypeInput
import CloudFormation.DeregisterTypeOutput
import CloudFormation.DescribeAccountLimitsInput
import CloudFormation.DescribeAccountLimitsOutput
import CloudFormation.DescribeChangeSetInput
import CloudFormation.DescribeChangeSetOutput
import CloudFormation.DescribeStackDriftDetectionStatusInput
import CloudFormation.DescribeStackDriftDetectionStatusOutput
import CloudFormation.DescribeStackEventsInput
import CloudFormation.DescribeStackEventsOutput
import CloudFormation.DescribeStackInstanceInput
import CloudFormation.DescribeStackInstanceOutput
import CloudFormation.DescribeStackResourceInput
import CloudFormation.DescribeStackResourceOutput
import CloudFormation.DescribeStackResourceDriftsInput
import CloudFormation.DescribeStackResourceDriftsOutput
import CloudFormation.DescribeStackResourcesInput
import CloudFormation.DescribeStackResourcesOutput
import CloudFormation.DescribeStackSetInput
import CloudFormation.DescribeStackSetOutput
import CloudFormation.DescribeStackSetOperationInput
import CloudFormation.DescribeStackSetOperationOutput
import CloudFormation.DescribeStacksInput
import CloudFormation.DescribeStacksOutput
import CloudFormation.DescribeTypeInput
import CloudFormation.DescribeTypeOutput
import CloudFormation.DescribeTypeRegistrationInput
import CloudFormation.DescribeTypeRegistrationOutput
import CloudFormation.DetectStackDriftInput
import CloudFormation.DetectStackDriftOutput
import CloudFormation.DetectStackResourceDriftInput
import CloudFormation.DetectStackResourceDriftOutput
import CloudFormation.DetectStackSetDriftInput
import CloudFormation.DetectStackSetDriftOutput
import CloudFormation.EstimateTemplateCostInput
import CloudFormation.EstimateTemplateCostOutput
import CloudFormation.ExecuteChangeSetInput
import CloudFormation.ExecuteChangeSetOutput
import CloudFormation.GetStackPolicyInput
import CloudFormation.GetStackPolicyOutput
import CloudFormation.GetTemplateInput
import CloudFormation.GetTemplateOutput
import CloudFormation.GetTemplateSummaryInput
import CloudFormation.GetTemplateSummaryOutput
import CloudFormation.ListChangeSetsInput
import CloudFormation.ListChangeSetsOutput
import CloudFormation.ListExportsInput
import CloudFormation.ListExportsOutput
import CloudFormation.ListImportsInput
import CloudFormation.ListImportsOutput
import CloudFormation.ListStackInstancesInput
import CloudFormation.ListStackInstancesOutput
import CloudFormation.ListStackResourcesInput
import CloudFormation.ListStackResourcesOutput
import CloudFormation.ListStackSetOperationResultsInput
import CloudFormation.ListStackSetOperationResultsOutput
import CloudFormation.ListStackSetOperationsInput
import CloudFormation.ListStackSetOperationsOutput
import CloudFormation.ListStackSetsInput
import CloudFormation.ListStackSetsOutput
import CloudFormation.ListStacksInput
import CloudFormation.ListStacksOutput
import CloudFormation.ListTypeRegistrationsInput
import CloudFormation.ListTypeRegistrationsOutput
import CloudFormation.ListTypeVersionsInput
import CloudFormation.ListTypeVersionsOutput
import CloudFormation.ListTypesInput
import CloudFormation.ListTypesOutput
import CloudFormation.RecordHandlerProgressInput
import CloudFormation.RecordHandlerProgressOutput
import CloudFormation.RegisterTypeInput
import CloudFormation.RegisterTypeOutput
import CloudFormation.SetStackPolicyInput
import CloudFormation.SetTypeDefaultVersionInput
import CloudFormation.SetTypeDefaultVersionOutput
import CloudFormation.SignalResourceInput
import CloudFormation.StopStackSetOperationInput
import CloudFormation.StopStackSetOperationOutput
import CloudFormation.UpdateStackInput
import CloudFormation.UpdateStackOutput
import CloudFormation.UpdateStackInstancesInput
import CloudFormation.UpdateStackInstancesOutput
import CloudFormation.UpdateStackSetInput
import CloudFormation.UpdateStackSetOutput
import CloudFormation.UpdateTerminationProtectionInput
import CloudFormation.UpdateTerminationProtectionOutput
import CloudFormation.ValidateTemplateInput
import CloudFormation.ValidateTemplateOutput
import CloudFormation.ResourceChange
import CloudFormation.RollbackConfiguration
import CloudFormation.DeploymentTargets
import CloudFormation.StackSetOperationPreferences
import CloudFormation.AutoDeployment
import CloudFormation.StackInstance
import CloudFormation.StackResourceDetail
import CloudFormation.StackSetOperation
import CloudFormation.StackSet
import CloudFormation.LoggingConfig
import CloudFormation.ParameterConstraints
import CloudFormation.ResourceTargetDefinition
import CloudFormation.ResourceIdentifierProperties
import CloudFormation.StackDriftInformation
import CloudFormation.StackResourceDriftInformation
import CloudFormation.StackResourceDriftInformationSummary
import CloudFormation.StackSetDriftDetectionDetails
import CloudFormation.AccountGateResult
import CloudFormation.StackDriftInformationSummary

typealias Account = String

typealias AccountGateStatusReason = String

typealias AccountLimitList = Array<AccountLimit>

typealias AccountList = Array<Account>

typealias AllowedValue = String

typealias AllowedValues = Array<AllowedValue>

typealias Arn = String

typealias AutoDeploymentNullable = Boolean

typealias BoxedInteger = Number

typealias BoxedMaxResults = Number

typealias Capabilities = Array<String /* "CAPABILITY_IAM" | "CAPABILITY_NAMED_IAM" | "CAPABILITY_AUTO_EXPAND" | String */>

typealias CapabilitiesReason = String

typealias CausingEntity = String

typealias ChangeSetId = String

typealias ChangeSetName = String

typealias ChangeSetNameOrId = String

typealias ChangeSetStatusReason = String

typealias ChangeSetSummaries = Array<ChangeSetSummary>

typealias Changes = Array<Change>

typealias ClientRequestToken = String

typealias ClientToken = String

typealias CreationTime = Date

typealias DeletionTime = Date

typealias Description = String

typealias DisableRollback = Boolean

typealias DriftedStackInstancesCount = Number

typealias EnableTerminationProtection = Boolean

typealias EventId = String

typealias ExecutionRoleName = String

typealias ExportName = String

typealias ExportValue = String

typealias Exports = Array<Export>

typealias FailedStackInstancesCount = Number

typealias FailureToleranceCount = Number

typealias FailureTolerancePercentage = Number

typealias Imports = Array<StackName>

typealias InProgressStackInstancesCount = Number

typealias InSyncStackInstancesCount = Number

typealias Key = String

typealias LastUpdatedTime = Date

typealias LimitName = String

typealias LimitValue = Number

typealias LogGroupName = String

typealias LogicalResourceId = String

typealias LogicalResourceIds = Array<LogicalResourceId>

typealias MaxConcurrentCount = Number

typealias MaxConcurrentPercentage = Number

typealias MaxResults = Number

typealias Metadata = String

typealias MonitoringTimeInMinutes = Number

typealias NextToken = String

typealias NoEcho = Boolean

typealias NotificationARN = String

typealias NotificationARNs = Array<NotificationARN>

typealias OptionalSecureUrl = String

typealias OrganizationalUnitId = String

typealias OrganizationalUnitIdList = Array<OrganizationalUnitId>

typealias OutputKey = String

typealias OutputValue = String

typealias Outputs = Array<Output>

typealias ParameterDeclarations = Array<ParameterDeclaration>

typealias ParameterKey = String

typealias ParameterType = String

typealias ParameterValue = String

typealias Parameters = Array<Parameter>

typealias PhysicalResourceId = String

typealias PhysicalResourceIdContext = Array<PhysicalResourceIdContextKeyValuePair>

typealias PrivateTypeArn = String

typealias Properties = String

typealias PropertyDifferences = Array<PropertyDifference>

typealias PropertyName = String

typealias PropertyPath = String

typealias PropertyValue = String

typealias Reason = String

typealias Region = String

typealias RegionList = Array<Region>

typealias RegistrationToken = String

typealias RegistrationTokenList = Array<RegistrationToken>

typealias RequestToken = String

typealias ResourceChangeDetails = Array<ResourceChangeDetail>

typealias ResourceIdentifierPropertyKey = String

typealias ResourceIdentifierPropertyValue = String

typealias ResourceIdentifierSummaries = Array<ResourceIdentifierSummary>

typealias ResourceIdentifiers = Array<ResourceIdentifierPropertyKey>

typealias ResourceModel = String

typealias ResourceProperties = String

typealias ResourceSignalUniqueId = String

typealias ResourceStatusReason = String

typealias ResourceToSkip = String

typealias ResourceType = String

typealias ResourceTypes = Array<ResourceType>

typealias ResourcesToImport = Array<ResourceToImport>

typealias ResourcesToSkip = Array<ResourceToSkip>

typealias RetainResources = Array<LogicalResourceId>

typealias RetainStacks = Boolean

typealias RetainStacksNullable = Boolean

typealias RetainStacksOnAccountRemovalNullable = Boolean

typealias RoleARN = String

typealias RoleArn = String

typealias RollbackTriggers = Array<RollbackTrigger>

typealias S3Url = String

typealias Scope = Array<String /* "Properties" | "Metadata" | "CreationPolicy" | "UpdatePolicy" | "DeletionPolicy" | "Tags" | String */>

typealias StackDriftDetectionId = String

typealias StackDriftDetectionStatusReason = String

typealias StackEvents = Array<StackEvent>

typealias StackId = String

typealias StackInstanceSummaries = Array<StackInstanceSummary>

typealias StackName = String

typealias StackNameOrId = String

typealias StackPolicyBody = String

typealias StackPolicyDuringUpdateBody = String

typealias StackPolicyDuringUpdateURL = String

typealias StackPolicyURL = String

typealias StackResourceDriftStatusFilters = Array<String /* "IN_SYNC" | "MODIFIED" | "DELETED" | "NOT_CHECKED" | String */>

typealias StackResourceDrifts = Array<StackResourceDrift>

typealias StackResourceSummaries = Array<StackResourceSummary>

typealias StackResources = Array<StackResource>

typealias StackSetARN = String

typealias StackSetId = String

typealias StackSetName = String

typealias StackSetNameOrId = String

typealias StackSetOperationResultSummaries = Array<StackSetOperationResultSummary>

typealias StackSetOperationSummaries = Array<StackSetOperationSummary>

typealias StackSetSummaries = Array<StackSetSummary>

typealias StackStatusFilter = Array<String /* "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "ROLLBACK_IN_PROGRESS" | "ROLLBACK_FAILED" | "ROLLBACK_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "UPDATE_IN_PROGRESS" | "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" | "UPDATE_COMPLETE" | "UPDATE_ROLLBACK_IN_PROGRESS" | "UPDATE_ROLLBACK_FAILED" | "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" | "UPDATE_ROLLBACK_COMPLETE" | "REVIEW_IN_PROGRESS" | "IMPORT_IN_PROGRESS" | "IMPORT_COMPLETE" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE" | String */>

typealias StackStatusReason = String

typealias StackSummaries = Array<StackSummary>

typealias Stacks = Array<Stack>

typealias StageList = Array<String /* "Original" | "Processed" | String */>

typealias StatusMessage = String

typealias TagKey = String

typealias TagValue = String

typealias Tags = Array<Tag>

typealias TemplateBody = String

typealias TemplateDescription = String

typealias TemplateParameters = Array<TemplateParameter>

typealias TemplateURL = String

typealias TimeoutMinutes = Number

typealias Timestamp = Date

typealias TotalStackInstancesCount = Number

typealias TransformName = String

typealias TransformsList = Array<TransformName>

typealias Type = String

typealias TypeArn = String

typealias TypeName = String

typealias TypeSchema = String

typealias TypeSummaries = Array<TypeSummary>

typealias TypeVersionId = String

typealias TypeVersionSummaries = Array<TypeVersionSummary>

typealias Url = String

typealias UsePreviousTemplate = Boolean

typealias UsePreviousValue = Boolean

typealias Value = String

typealias Version = String

@JsModule("aws-sdk")
external open class CloudFormation(options: ServiceConfigurationOptions /* ServiceConfigurationOptions & ClientApiVersions */ = definedExternally) : Service {
    open var config: ConfigBase /* Config & CloudFormation.Types.ClientConfiguration */
    open fun cancelUpdateStack(params: CancelUpdateStackInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun cancelUpdateStack(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun continueUpdateRollback(params: ContinueUpdateRollbackInput, callback: (err: AWSError, data: ContinueUpdateRollbackOutput) -> Unit = definedExternally): Request<ContinueUpdateRollbackOutput, AWSError>
    open fun continueUpdateRollback(callback: (err: AWSError, data: ContinueUpdateRollbackOutput) -> Unit = definedExternally): Request<ContinueUpdateRollbackOutput, AWSError>
    open fun createChangeSet(params: CreateChangeSetInput, callback: (err: AWSError, data: CreateChangeSetOutput) -> Unit = definedExternally): Request<CreateChangeSetOutput, AWSError>
    open fun createChangeSet(callback: (err: AWSError, data: CreateChangeSetOutput) -> Unit = definedExternally): Request<CreateChangeSetOutput, AWSError>
    open fun createStack(params: CreateStackInput, callback: (err: AWSError, data: CreateStackOutput) -> Unit = definedExternally): Request<CreateStackOutput, AWSError>
    open fun createStack(callback: (err: AWSError, data: CreateStackOutput) -> Unit = definedExternally): Request<CreateStackOutput, AWSError>
    open fun createStackInstances(params: CreateStackInstancesInput, callback: (err: AWSError, data: CreateStackInstancesOutput) -> Unit = definedExternally): Request<CreateStackInstancesOutput, AWSError>
    open fun createStackInstances(callback: (err: AWSError, data: CreateStackInstancesOutput) -> Unit = definedExternally): Request<CreateStackInstancesOutput, AWSError>
    open fun createStackSet(params: CreateStackSetInput, callback: (err: AWSError, data: CreateStackSetOutput) -> Unit = definedExternally): Request<CreateStackSetOutput, AWSError>
    open fun createStackSet(callback: (err: AWSError, data: CreateStackSetOutput) -> Unit = definedExternally): Request<CreateStackSetOutput, AWSError>
    open fun deleteChangeSet(params: DeleteChangeSetInput, callback: (err: AWSError, data: DeleteChangeSetOutput) -> Unit = definedExternally): Request<DeleteChangeSetOutput, AWSError>
    open fun deleteChangeSet(callback: (err: AWSError, data: DeleteChangeSetOutput) -> Unit = definedExternally): Request<DeleteChangeSetOutput, AWSError>
    open fun deleteStack(params: DeleteStackInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteStack(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun deleteStackInstances(params: DeleteStackInstancesInput, callback: (err: AWSError, data: DeleteStackInstancesOutput) -> Unit = definedExternally): Request<DeleteStackInstancesOutput, AWSError>
    open fun deleteStackInstances(callback: (err: AWSError, data: DeleteStackInstancesOutput) -> Unit = definedExternally): Request<DeleteStackInstancesOutput, AWSError>
    open fun deleteStackSet(params: DeleteStackSetInput, callback: (err: AWSError, data: DeleteStackSetOutput) -> Unit = definedExternally): Request<DeleteStackSetOutput, AWSError>
    open fun deleteStackSet(callback: (err: AWSError, data: DeleteStackSetOutput) -> Unit = definedExternally): Request<DeleteStackSetOutput, AWSError>
    open fun deregisterType(params: DeregisterTypeInput, callback: (err: AWSError, data: DeregisterTypeOutput) -> Unit = definedExternally): Request<DeregisterTypeOutput, AWSError>
    open fun deregisterType(callback: (err: AWSError, data: DeregisterTypeOutput) -> Unit = definedExternally): Request<DeregisterTypeOutput, AWSError>
    open fun describeAccountLimits(params: DescribeAccountLimitsInput, callback: (err: AWSError, data: DescribeAccountLimitsOutput) -> Unit = definedExternally): Request<DescribeAccountLimitsOutput, AWSError>
    open fun describeAccountLimits(callback: (err: AWSError, data: DescribeAccountLimitsOutput) -> Unit = definedExternally): Request<DescribeAccountLimitsOutput, AWSError>
    open fun describeChangeSet(params: DescribeChangeSetInput, callback: (err: AWSError, data: DescribeChangeSetOutput) -> Unit = definedExternally): Request<DescribeChangeSetOutput, AWSError>
    open fun describeChangeSet(callback: (err: AWSError, data: DescribeChangeSetOutput) -> Unit = definedExternally): Request<DescribeChangeSetOutput, AWSError>
    open fun describeStackDriftDetectionStatus(params: DescribeStackDriftDetectionStatusInput, callback: (err: AWSError, data: DescribeStackDriftDetectionStatusOutput) -> Unit = definedExternally): Request<DescribeStackDriftDetectionStatusOutput, AWSError>
    open fun describeStackDriftDetectionStatus(callback: (err: AWSError, data: DescribeStackDriftDetectionStatusOutput) -> Unit = definedExternally): Request<DescribeStackDriftDetectionStatusOutput, AWSError>
    open fun describeStackEvents(params: DescribeStackEventsInput, callback: (err: AWSError, data: DescribeStackEventsOutput) -> Unit = definedExternally): Request<DescribeStackEventsOutput, AWSError>
    open fun describeStackEvents(callback: (err: AWSError, data: DescribeStackEventsOutput) -> Unit = definedExternally): Request<DescribeStackEventsOutput, AWSError>
    open fun describeStackInstance(params: DescribeStackInstanceInput, callback: (err: AWSError, data: DescribeStackInstanceOutput) -> Unit = definedExternally): Request<DescribeStackInstanceOutput, AWSError>
    open fun describeStackInstance(callback: (err: AWSError, data: DescribeStackInstanceOutput) -> Unit = definedExternally): Request<DescribeStackInstanceOutput, AWSError>
    open fun describeStackResource(params: DescribeStackResourceInput, callback: (err: AWSError, data: DescribeStackResourceOutput) -> Unit = definedExternally): Request<DescribeStackResourceOutput, AWSError>
    open fun describeStackResource(callback: (err: AWSError, data: DescribeStackResourceOutput) -> Unit = definedExternally): Request<DescribeStackResourceOutput, AWSError>
    open fun describeStackResourceDrifts(params: DescribeStackResourceDriftsInput, callback: (err: AWSError, data: DescribeStackResourceDriftsOutput) -> Unit = definedExternally): Request<DescribeStackResourceDriftsOutput, AWSError>
    open fun describeStackResourceDrifts(callback: (err: AWSError, data: DescribeStackResourceDriftsOutput) -> Unit = definedExternally): Request<DescribeStackResourceDriftsOutput, AWSError>
    open fun describeStackResources(params: DescribeStackResourcesInput, callback: (err: AWSError, data: DescribeStackResourcesOutput) -> Unit = definedExternally): Request<DescribeStackResourcesOutput, AWSError>
    open fun describeStackResources(callback: (err: AWSError, data: DescribeStackResourcesOutput) -> Unit = definedExternally): Request<DescribeStackResourcesOutput, AWSError>
    open fun describeStackSet(params: DescribeStackSetInput, callback: (err: AWSError, data: DescribeStackSetOutput) -> Unit = definedExternally): Request<DescribeStackSetOutput, AWSError>
    open fun describeStackSet(callback: (err: AWSError, data: DescribeStackSetOutput) -> Unit = definedExternally): Request<DescribeStackSetOutput, AWSError>
    open fun describeStackSetOperation(params: DescribeStackSetOperationInput, callback: (err: AWSError, data: DescribeStackSetOperationOutput) -> Unit = definedExternally): Request<DescribeStackSetOperationOutput, AWSError>
    open fun describeStackSetOperation(callback: (err: AWSError, data: DescribeStackSetOperationOutput) -> Unit = definedExternally): Request<DescribeStackSetOperationOutput, AWSError>
    open fun describeStacks(params: DescribeStacksInput, callback: (err: AWSError, data: DescribeStacksOutput) -> Unit = definedExternally): Request<DescribeStacksOutput, AWSError>
    open fun describeStacks(callback: (err: AWSError, data: DescribeStacksOutput) -> Unit = definedExternally): Request<DescribeStacksOutput, AWSError>
    open fun describeType(params: DescribeTypeInput, callback: (err: AWSError, data: DescribeTypeOutput) -> Unit = definedExternally): Request<DescribeTypeOutput, AWSError>
    open fun describeType(callback: (err: AWSError, data: DescribeTypeOutput) -> Unit = definedExternally): Request<DescribeTypeOutput, AWSError>
    open fun describeTypeRegistration(params: DescribeTypeRegistrationInput, callback: (err: AWSError, data: DescribeTypeRegistrationOutput) -> Unit = definedExternally): Request<DescribeTypeRegistrationOutput, AWSError>
    open fun describeTypeRegistration(callback: (err: AWSError, data: DescribeTypeRegistrationOutput) -> Unit = definedExternally): Request<DescribeTypeRegistrationOutput, AWSError>
    open fun detectStackDrift(params: DetectStackDriftInput, callback: (err: AWSError, data: DetectStackDriftOutput) -> Unit = definedExternally): Request<DetectStackDriftOutput, AWSError>
    open fun detectStackDrift(callback: (err: AWSError, data: DetectStackDriftOutput) -> Unit = definedExternally): Request<DetectStackDriftOutput, AWSError>
    open fun detectStackResourceDrift(params: DetectStackResourceDriftInput, callback: (err: AWSError, data: DetectStackResourceDriftOutput) -> Unit = definedExternally): Request<DetectStackResourceDriftOutput, AWSError>
    open fun detectStackResourceDrift(callback: (err: AWSError, data: DetectStackResourceDriftOutput) -> Unit = definedExternally): Request<DetectStackResourceDriftOutput, AWSError>
    open fun detectStackSetDrift(params: DetectStackSetDriftInput, callback: (err: AWSError, data: DetectStackSetDriftOutput) -> Unit = definedExternally): Request<DetectStackSetDriftOutput, AWSError>
    open fun detectStackSetDrift(callback: (err: AWSError, data: DetectStackSetDriftOutput) -> Unit = definedExternally): Request<DetectStackSetDriftOutput, AWSError>
    open fun estimateTemplateCost(params: EstimateTemplateCostInput, callback: (err: AWSError, data: EstimateTemplateCostOutput) -> Unit = definedExternally): Request<EstimateTemplateCostOutput, AWSError>
    open fun estimateTemplateCost(callback: (err: AWSError, data: EstimateTemplateCostOutput) -> Unit = definedExternally): Request<EstimateTemplateCostOutput, AWSError>
    open fun executeChangeSet(params: ExecuteChangeSetInput, callback: (err: AWSError, data: ExecuteChangeSetOutput) -> Unit = definedExternally): Request<ExecuteChangeSetOutput, AWSError>
    open fun executeChangeSet(callback: (err: AWSError, data: ExecuteChangeSetOutput) -> Unit = definedExternally): Request<ExecuteChangeSetOutput, AWSError>
    open fun getStackPolicy(params: GetStackPolicyInput, callback: (err: AWSError, data: GetStackPolicyOutput) -> Unit = definedExternally): Request<GetStackPolicyOutput, AWSError>
    open fun getStackPolicy(callback: (err: AWSError, data: GetStackPolicyOutput) -> Unit = definedExternally): Request<GetStackPolicyOutput, AWSError>
    open fun getTemplate(params: GetTemplateInput, callback: (err: AWSError, data: GetTemplateOutput) -> Unit = definedExternally): Request<GetTemplateOutput, AWSError>
    open fun getTemplate(callback: (err: AWSError, data: GetTemplateOutput) -> Unit = definedExternally): Request<GetTemplateOutput, AWSError>
    open fun getTemplateSummary(params: GetTemplateSummaryInput, callback: (err: AWSError, data: GetTemplateSummaryOutput) -> Unit = definedExternally): Request<GetTemplateSummaryOutput, AWSError>
    open fun getTemplateSummary(callback: (err: AWSError, data: GetTemplateSummaryOutput) -> Unit = definedExternally): Request<GetTemplateSummaryOutput, AWSError>
    open fun listChangeSets(params: ListChangeSetsInput, callback: (err: AWSError, data: ListChangeSetsOutput) -> Unit = definedExternally): Request<ListChangeSetsOutput, AWSError>
    open fun listChangeSets(callback: (err: AWSError, data: ListChangeSetsOutput) -> Unit = definedExternally): Request<ListChangeSetsOutput, AWSError>
    open fun listExports(params: ListExportsInput, callback: (err: AWSError, data: ListExportsOutput) -> Unit = definedExternally): Request<ListExportsOutput, AWSError>
    open fun listExports(callback: (err: AWSError, data: ListExportsOutput) -> Unit = definedExternally): Request<ListExportsOutput, AWSError>
    open fun listImports(params: ListImportsInput, callback: (err: AWSError, data: ListImportsOutput) -> Unit = definedExternally): Request<ListImportsOutput, AWSError>
    open fun listImports(callback: (err: AWSError, data: ListImportsOutput) -> Unit = definedExternally): Request<ListImportsOutput, AWSError>
    open fun listStackInstances(params: ListStackInstancesInput, callback: (err: AWSError, data: ListStackInstancesOutput) -> Unit = definedExternally): Request<ListStackInstancesOutput, AWSError>
    open fun listStackInstances(callback: (err: AWSError, data: ListStackInstancesOutput) -> Unit = definedExternally): Request<ListStackInstancesOutput, AWSError>
    open fun listStackResources(params: ListStackResourcesInput, callback: (err: AWSError, data: ListStackResourcesOutput) -> Unit = definedExternally): Request<ListStackResourcesOutput, AWSError>
    open fun listStackResources(callback: (err: AWSError, data: ListStackResourcesOutput) -> Unit = definedExternally): Request<ListStackResourcesOutput, AWSError>
    open fun listStackSetOperationResults(params: ListStackSetOperationResultsInput, callback: (err: AWSError, data: ListStackSetOperationResultsOutput) -> Unit = definedExternally): Request<ListStackSetOperationResultsOutput, AWSError>
    open fun listStackSetOperationResults(callback: (err: AWSError, data: ListStackSetOperationResultsOutput) -> Unit = definedExternally): Request<ListStackSetOperationResultsOutput, AWSError>
    open fun listStackSetOperations(params: ListStackSetOperationsInput, callback: (err: AWSError, data: ListStackSetOperationsOutput) -> Unit = definedExternally): Request<ListStackSetOperationsOutput, AWSError>
    open fun listStackSetOperations(callback: (err: AWSError, data: ListStackSetOperationsOutput) -> Unit = definedExternally): Request<ListStackSetOperationsOutput, AWSError>
    open fun listStackSets(params: ListStackSetsInput, callback: (err: AWSError, data: ListStackSetsOutput) -> Unit = definedExternally): Request<ListStackSetsOutput, AWSError>
    open fun listStackSets(callback: (err: AWSError, data: ListStackSetsOutput) -> Unit = definedExternally): Request<ListStackSetsOutput, AWSError>
    open fun listStacks(params: ListStacksInput, callback: (err: AWSError, data: ListStacksOutput) -> Unit = definedExternally): Request<ListStacksOutput, AWSError>
    open fun listStacks(callback: (err: AWSError, data: ListStacksOutput) -> Unit = definedExternally): Request<ListStacksOutput, AWSError>
    open fun listTypeRegistrations(params: ListTypeRegistrationsInput, callback: (err: AWSError, data: ListTypeRegistrationsOutput) -> Unit = definedExternally): Request<ListTypeRegistrationsOutput, AWSError>
    open fun listTypeRegistrations(callback: (err: AWSError, data: ListTypeRegistrationsOutput) -> Unit = definedExternally): Request<ListTypeRegistrationsOutput, AWSError>
    open fun listTypeVersions(params: ListTypeVersionsInput, callback: (err: AWSError, data: ListTypeVersionsOutput) -> Unit = definedExternally): Request<ListTypeVersionsOutput, AWSError>
    open fun listTypeVersions(callback: (err: AWSError, data: ListTypeVersionsOutput) -> Unit = definedExternally): Request<ListTypeVersionsOutput, AWSError>
    open fun listTypes(params: ListTypesInput, callback: (err: AWSError, data: ListTypesOutput) -> Unit = definedExternally): Request<ListTypesOutput, AWSError>
    open fun listTypes(callback: (err: AWSError, data: ListTypesOutput) -> Unit = definedExternally): Request<ListTypesOutput, AWSError>
    open fun recordHandlerProgress(params: RecordHandlerProgressInput, callback: (err: AWSError, data: RecordHandlerProgressOutput) -> Unit = definedExternally): Request<RecordHandlerProgressOutput, AWSError>
    open fun recordHandlerProgress(callback: (err: AWSError, data: RecordHandlerProgressOutput) -> Unit = definedExternally): Request<RecordHandlerProgressOutput, AWSError>
    open fun registerType(params: RegisterTypeInput, callback: (err: AWSError, data: RegisterTypeOutput) -> Unit = definedExternally): Request<RegisterTypeOutput, AWSError>
    open fun registerType(callback: (err: AWSError, data: RegisterTypeOutput) -> Unit = definedExternally): Request<RegisterTypeOutput, AWSError>
    open fun setStackPolicy(params: SetStackPolicyInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setStackPolicy(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun setTypeDefaultVersion(params: SetTypeDefaultVersionInput, callback: (err: AWSError, data: SetTypeDefaultVersionOutput) -> Unit = definedExternally): Request<SetTypeDefaultVersionOutput, AWSError>
    open fun setTypeDefaultVersion(callback: (err: AWSError, data: SetTypeDefaultVersionOutput) -> Unit = definedExternally): Request<SetTypeDefaultVersionOutput, AWSError>
    open fun signalResource(params: SignalResourceInput, callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun signalResource(callback: (err: AWSError, data: Any) -> Unit = definedExternally): Request<Any, AWSError>
    open fun stopStackSetOperation(params: StopStackSetOperationInput, callback: (err: AWSError, data: StopStackSetOperationOutput) -> Unit = definedExternally): Request<StopStackSetOperationOutput, AWSError>
    open fun stopStackSetOperation(callback: (err: AWSError, data: StopStackSetOperationOutput) -> Unit = definedExternally): Request<StopStackSetOperationOutput, AWSError>
    open fun updateStack(params: UpdateStackInput, callback: (err: AWSError, data: UpdateStackOutput) -> Unit = definedExternally): Request<UpdateStackOutput, AWSError>
    open fun updateStack(callback: (err: AWSError, data: UpdateStackOutput) -> Unit = definedExternally): Request<UpdateStackOutput, AWSError>
    open fun updateStackInstances(params: UpdateStackInstancesInput, callback: (err: AWSError, data: UpdateStackInstancesOutput) -> Unit = definedExternally): Request<UpdateStackInstancesOutput, AWSError>
    open fun updateStackInstances(callback: (err: AWSError, data: UpdateStackInstancesOutput) -> Unit = definedExternally): Request<UpdateStackInstancesOutput, AWSError>
    open fun updateStackSet(params: UpdateStackSetInput, callback: (err: AWSError, data: UpdateStackSetOutput) -> Unit = definedExternally): Request<UpdateStackSetOutput, AWSError>
    open fun updateStackSet(callback: (err: AWSError, data: UpdateStackSetOutput) -> Unit = definedExternally): Request<UpdateStackSetOutput, AWSError>
    open fun updateTerminationProtection(params: UpdateTerminationProtectionInput, callback: (err: AWSError, data: UpdateTerminationProtectionOutput) -> Unit = definedExternally): Request<UpdateTerminationProtectionOutput, AWSError>
    open fun updateTerminationProtection(callback: (err: AWSError, data: UpdateTerminationProtectionOutput) -> Unit = definedExternally): Request<UpdateTerminationProtectionOutput, AWSError>
    open fun validateTemplate(params: ValidateTemplateInput, callback: (err: AWSError, data: ValidateTemplateOutput) -> Unit = definedExternally): Request<ValidateTemplateOutput, AWSError>
    open fun validateTemplate(callback: (err: AWSError, data: ValidateTemplateOutput) -> Unit = definedExternally): Request<ValidateTemplateOutput, AWSError>
    open fun waitFor(state: String, params: DescribeStacksInput, callback: (err: AWSError, data: DescribeStacksOutput) -> Unit = definedExternally): Request<DescribeStacksOutput, AWSError>
    open fun waitFor(state: String, callback: (err: AWSError, data: DescribeStacksOutput) -> Unit = definedExternally): Request<DescribeStacksOutput, AWSError>
    open fun waitFor(state: String /* "changeSetCreateComplete" */, params: DescribeChangeSetInput /* CloudFormation.Types.DescribeChangeSetInput & `T$0` */, callback: (err: AWSError, data: DescribeChangeSetOutput) -> Unit = definedExternally): Request<DescribeChangeSetOutput, AWSError>
    open fun waitFor(state: String /* "changeSetCreateComplete" */, callback: (err: AWSError, data: DescribeChangeSetOutput) -> Unit = definedExternally): Request<DescribeChangeSetOutput, AWSError>
    open fun waitFor(state: String /* "typeRegistrationComplete" */, params: DescribeTypeRegistrationInput /* CloudFormation.Types.DescribeTypeRegistrationInput & `T$0` */, callback: (err: AWSError, data: DescribeTypeRegistrationOutput) -> Unit = definedExternally): Request<DescribeTypeRegistrationOutput, AWSError>
    open fun waitFor(state: String /* "typeRegistrationComplete" */, callback: (err: AWSError, data: DescribeTypeRegistrationOutput) -> Unit = definedExternally): Request<DescribeTypeRegistrationOutput, AWSError>
    interface AccountGateResult {
        var Status: String /* "SUCCEEDED" | "FAILED" | "SKIPPED" | String */
        var StatusReason: AccountGateStatusReason?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AccountLimit {
        var Name: LimitName?
            get() = definedExternally
            set(value) = definedExternally
        var Value: LimitValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface AutoDeployment {
        var Enabled: AutoDeploymentNullable?
            get() = definedExternally
            set(value) = definedExternally
        var RetainStacksOnAccountRemoval: RetainStacksOnAccountRemovalNullable?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CancelUpdateStackInput {
        var StackName: StackName
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Change {
        var Type: String /* "Resource" | String */
        var ResourceChange: ResourceChange?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ChangeSetSummary {
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var StackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetId: ChangeSetId?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetName: ChangeSetName?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionStatus: String /* "UNAVAILABLE" | "AVAILABLE" | "EXECUTE_IN_PROGRESS" | "EXECUTE_COMPLETE" | "EXECUTE_FAILED" | "OBSOLETE" | String */
        var Status: String /* "CREATE_PENDING" | "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "DELETE_COMPLETE" | "FAILED" | String */
        var StatusReason: ChangeSetStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContinueUpdateRollbackInput {
        var StackName: StackNameOrId
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ResourcesToSkip: ResourcesToSkip?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ContinueUpdateRollbackOutput
    interface CreateChangeSetInput {
        var StackName: StackNameOrId
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateURL: TemplateURL?
            get() = definedExternally
            set(value) = definedExternally
        var UsePreviousTemplate: UsePreviousTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var Capabilities: Capabilities?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTypes: ResourceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var RollbackConfiguration: RollbackConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationARNs: NotificationARNs?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetName: ChangeSetName
        var ClientToken: ClientToken?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetType: String /* "CREATE" | "UPDATE" | "IMPORT" | String */
        var ResourcesToImport: ResourcesToImport?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateChangeSetOutput {
        var Id: ChangeSetId?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStackInput {
        var StackName: StackName
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateURL: TemplateURL?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var DisableRollback: DisableRollback?
            get() = definedExternally
            set(value) = definedExternally
        var RollbackConfiguration: RollbackConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutInMinutes: TimeoutMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationARNs: NotificationARNs?
            get() = definedExternally
            set(value) = definedExternally
        var Capabilities: Capabilities?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTypes: ResourceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var OnFailure: String /* "DO_NOTHING" | "ROLLBACK" | "DELETE" | String */
        var StackPolicyBody: StackPolicyBody?
            get() = definedExternally
            set(value) = definedExternally
        var StackPolicyURL: StackPolicyURL?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var EnableTerminationProtection: EnableTerminationProtection?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStackInstancesInput {
        var StackSetName: StackSetName
        var Accounts: AccountList?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentTargets: DeploymentTargets?
            get() = definedExternally
            set(value) = definedExternally
        var Regions: RegionList
        var ParameterOverrides: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var OperationPreferences: StackSetOperationPreferences?
            get() = definedExternally
            set(value) = definedExternally
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStackInstancesOutput {
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStackOutput {
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStackSetInput {
        var StackSetName: StackSetName
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateURL: TemplateURL?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var Capabilities: Capabilities?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var AdministrationRoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleName: ExecutionRoleName?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionModel: String /* "SERVICE_MANAGED" | "SELF_MANAGED" | String */
        var AutoDeployment: AutoDeployment?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface CreateStackSetOutput {
        var StackSetId: StackSetId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteChangeSetInput {
        var ChangeSetName: ChangeSetNameOrId
        var StackName: StackNameOrId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteChangeSetOutput
    interface DeleteStackInput {
        var StackName: StackName
        var RetainResources: RetainResources?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteStackInstancesInput {
        var StackSetName: StackSetName
        var Accounts: AccountList?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentTargets: DeploymentTargets?
            get() = definedExternally
            set(value) = definedExternally
        var Regions: RegionList
        var OperationPreferences: StackSetOperationPreferences?
            get() = definedExternally
            set(value) = definedExternally
        var RetainStacks: RetainStacks
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteStackInstancesOutput {
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeleteStackSetInput {
        var StackSetName: StackSetName
    }
    interface DeleteStackSetOutput
    interface DeploymentTargets {
        var Accounts: AccountList?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationalUnitIds: OrganizationalUnitIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterTypeInput {
        var Arn: PrivateTypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "RESOURCE" | String */
        var TypeName: TypeName?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: TypeVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DeregisterTypeOutput
    interface DescribeAccountLimitsInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeAccountLimitsOutput {
        var AccountLimits: AccountLimitList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeChangeSetInput {
        var ChangeSetName: ChangeSetNameOrId
        var StackName: StackNameOrId?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeChangeSetOutput {
        var ChangeSetName: ChangeSetName?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetId: ChangeSetId?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var StackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionStatus: String /* "UNAVAILABLE" | "AVAILABLE" | "EXECUTE_IN_PROGRESS" | "EXECUTE_COMPLETE" | "EXECUTE_FAILED" | "OBSOLETE" | String */
        var Status: String /* "CREATE_PENDING" | "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "DELETE_COMPLETE" | "FAILED" | String */
        var StatusReason: ChangeSetStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationARNs: NotificationARNs?
            get() = definedExternally
            set(value) = definedExternally
        var RollbackConfiguration: RollbackConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var Capabilities: Capabilities?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var Changes: Changes?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackDriftDetectionStatusInput {
        var StackDriftDetectionId: StackDriftDetectionId
    }
    interface DescribeStackDriftDetectionStatusOutput {
        var StackId: StackId
        var StackDriftDetectionId: StackDriftDetectionId
        var StackDriftStatus: String /* "DRIFTED" | "IN_SYNC" | "UNKNOWN" | "NOT_CHECKED" | String */
        var DetectionStatus: String /* "DETECTION_IN_PROGRESS" | "DETECTION_FAILED" | "DETECTION_COMPLETE" | String */
        var DetectionStatusReason: StackDriftDetectionStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var DriftedStackResourceCount: BoxedInteger?
            get() = definedExternally
            set(value) = definedExternally
        var Timestamp: Timestamp
    }
    interface DescribeStackEventsInput {
        var StackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackEventsOutput {
        var StackEvents: StackEvents?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackInstanceInput {
        var StackSetName: StackSetName
        var StackInstanceAccount: Account
        var StackInstanceRegion: Region
    }
    interface DescribeStackInstanceOutput {
        var StackInstance: StackInstance?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackResourceDriftsInput {
        var StackName: StackNameOrId
        var StackResourceDriftStatusFilters: StackResourceDriftStatusFilters?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: BoxedMaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackResourceDriftsOutput {
        var StackResourceDrifts: StackResourceDrifts
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackResourceInput {
        var StackName: StackName
        var LogicalResourceId: LogicalResourceId
    }
    interface DescribeStackResourceOutput {
        var StackResourceDetail: StackResourceDetail?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackResourcesInput {
        var StackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var LogicalResourceId: LogicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var PhysicalResourceId: PhysicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackResourcesOutput {
        var StackResources: StackResources?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackSetInput {
        var StackSetName: StackSetName
    }
    interface DescribeStackSetOperationInput {
        var StackSetName: StackSetName
        var OperationId: ClientRequestToken
    }
    interface DescribeStackSetOperationOutput {
        var StackSetOperation: StackSetOperation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStackSetOutput {
        var StackSet: StackSet?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStacksInput {
        var StackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeStacksOutput {
        var Stacks: Stacks?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTypeInput {
        var Type: String /* "RESOURCE" | String */
        var TypeName: TypeName?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: TypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: TypeVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTypeOutput {
        var Arn: TypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "RESOURCE" | String */
        var TypeName: TypeName?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultVersionId: TypeVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Schema: TypeSchema?
            get() = definedExternally
            set(value) = definedExternally
        var ProvisioningType: String /* "NON_PROVISIONABLE" | "IMMUTABLE" | "FULLY_MUTABLE" | String */
        var DeprecatedStatus: String /* "LIVE" | "DEPRECATED" | String */
        var LoggingConfig: LoggingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var Visibility: String /* "PUBLIC" | "PRIVATE" | String */
        var SourceUrl: OptionalSecureUrl?
            get() = definedExternally
            set(value) = definedExternally
        var DocumentationUrl: OptionalSecureUrl?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TimeCreated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DescribeTypeRegistrationInput {
        var RegistrationToken: RegistrationToken
    }
    interface DescribeTypeRegistrationOutput {
        var ProgressStatus: String /* "COMPLETE" | "IN_PROGRESS" | "FAILED" | String */
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var TypeArn: TypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var TypeVersionArn: TypeArn?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectStackDriftInput {
        var StackName: StackNameOrId
        var LogicalResourceIds: LogicalResourceIds?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectStackDriftOutput {
        var StackDriftDetectionId: StackDriftDetectionId
    }
    interface DetectStackResourceDriftInput {
        var StackName: StackNameOrId
        var LogicalResourceId: LogicalResourceId
    }
    interface DetectStackResourceDriftOutput {
        var StackResourceDrift: StackResourceDrift
    }
    interface DetectStackSetDriftInput {
        var StackSetName: StackSetNameOrId
        var OperationPreferences: StackSetOperationPreferences?
            get() = definedExternally
            set(value) = definedExternally
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface DetectStackSetDriftOutput {
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EstimateTemplateCostInput {
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateURL: TemplateURL?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface EstimateTemplateCostOutput {
        var Url: Url?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecuteChangeSetInput {
        var ChangeSetName: ChangeSetNameOrId
        var StackName: StackNameOrId?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ExecuteChangeSetOutput
    interface Export {
        var ExportingStackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var Name: ExportName?
            get() = definedExternally
            set(value) = definedExternally
        var Value: ExportValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetStackPolicyInput {
        var StackName: StackName
    }
    interface GetStackPolicyOutput {
        var StackPolicyBody: StackPolicyBody?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTemplateInput {
        var StackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var ChangeSetName: ChangeSetNameOrId?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateStage: String /* "Original" | "Processed" | String */
    }
    interface GetTemplateOutput {
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var StagesAvailable: StageList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTemplateSummaryInput {
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateURL: TemplateURL?
            get() = definedExternally
            set(value) = definedExternally
        var StackName: StackNameOrId?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetName: StackSetNameOrId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface GetTemplateSummaryOutput {
        var Parameters: ParameterDeclarations?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Capabilities: Capabilities?
            get() = definedExternally
            set(value) = definedExternally
        var CapabilitiesReason: CapabilitiesReason?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTypes: ResourceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var Version: Version?
            get() = definedExternally
            set(value) = definedExternally
        var Metadata: Metadata?
            get() = definedExternally
            set(value) = definedExternally
        var DeclaredTransforms: TransformsList?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceIdentifierSummaries: ResourceIdentifierSummaries?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChangeSetsInput {
        var StackName: StackNameOrId
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListChangeSetsOutput {
        var Summaries: ChangeSetSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListExportsInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListExportsOutput {
        var Exports: Exports?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImportsInput {
        var ExportName: ExportName
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListImportsOutput {
        var Imports: Imports?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackInstancesInput {
        var StackSetName: StackSetName
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var StackInstanceAccount: Account?
            get() = definedExternally
            set(value) = definedExternally
        var StackInstanceRegion: Region?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackInstancesOutput {
        var Summaries: StackInstanceSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackResourcesInput {
        var StackName: StackName
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackResourcesOutput {
        var StackResourceSummaries: StackResourceSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackSetOperationResultsInput {
        var StackSetName: StackSetName
        var OperationId: ClientRequestToken
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackSetOperationResultsOutput {
        var Summaries: StackSetOperationResultSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackSetOperationsInput {
        var StackSetName: StackSetName
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackSetOperationsOutput {
        var Summaries: StackSetOperationSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStackSetsInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "DELETED" | String */
    }
    interface ListStackSetsOutput {
        var Summaries: StackSetSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStacksInput {
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var StackStatusFilter: StackStatusFilter?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListStacksOutput {
        var StackSummaries: StackSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTypeRegistrationsInput {
        var Type: String /* "RESOURCE" | String */
        var TypeName: TypeName?
            get() = definedExternally
            set(value) = definedExternally
        var TypeArn: TypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var RegistrationStatusFilter: String /* "COMPLETE" | "IN_PROGRESS" | "FAILED" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTypeRegistrationsOutput {
        var RegistrationTokenList: RegistrationTokenList?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTypeVersionsInput {
        var Type: String /* "RESOURCE" | String */
        var TypeName: TypeName?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: PrivateTypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
        var DeprecatedStatus: String /* "LIVE" | "DEPRECATED" | String */
    }
    interface ListTypeVersionsOutput {
        var TypeVersionSummaries: TypeVersionSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTypesInput {
        var Visibility: String /* "PUBLIC" | "PRIVATE" | String */
        var ProvisioningType: String /* "NON_PROVISIONABLE" | "IMMUTABLE" | "FULLY_MUTABLE" | String */
        var DeprecatedStatus: String /* "LIVE" | "DEPRECATED" | String */
        var MaxResults: MaxResults?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ListTypesOutput {
        var TypeSummaries: TypeSummaries?
            get() = definedExternally
            set(value) = definedExternally
        var NextToken: NextToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface LoggingConfig {
        var LogRoleArn: RoleArn
        var LogGroupName: LogGroupName
    }
    interface Output {
        var OutputKey: OutputKey?
            get() = definedExternally
            set(value) = definedExternally
        var OutputValue: OutputValue?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var ExportName: ExportName?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface Parameter {
        var ParameterKey: ParameterKey?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterValue: ParameterValue?
            get() = definedExternally
            set(value) = definedExternally
        var UsePreviousValue: UsePreviousValue?
            get() = definedExternally
            set(value) = definedExternally
        var ResolvedValue: ParameterValue?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterConstraints {
        var AllowedValues: AllowedValues?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ParameterDeclaration {
        var ParameterKey: ParameterKey?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValue: ParameterValue?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterType: ParameterType?
            get() = definedExternally
            set(value) = definedExternally
        var NoEcho: NoEcho?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterConstraints: ParameterConstraints?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface PhysicalResourceIdContextKeyValuePair {
        var Key: Key
        var Value: Value
    }
    interface PropertyDifference {
        var PropertyPath: PropertyPath
        var ExpectedValue: PropertyValue
        var ActualValue: PropertyValue
        var DifferenceType: String /* "ADD" | "REMOVE" | "NOT_EQUAL" | String */
    }
    interface RecordHandlerProgressInput {
        var BearerToken: ClientToken
        var OperationStatus: String /* "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | String */
        var CurrentOperationStatus: String /* "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | String */
        var StatusMessage: StatusMessage?
            get() = definedExternally
            set(value) = definedExternally
        var ErrorCode: String /* "NotUpdatable" | "InvalidRequest" | "AccessDenied" | "InvalidCredentials" | "AlreadyExists" | "NotFound" | "ResourceConflict" | "Throttling" | "ServiceLimitExceeded" | "NotStabilized" | "GeneralServiceException" | "ServiceInternalError" | "NetworkFailure" | "InternalFailure" | String */
        var ResourceModel: ResourceModel?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RecordHandlerProgressOutput
    interface RegisterTypeInput {
        var Type: String /* "RESOURCE" | String */
        var TypeName: TypeName
        var SchemaHandlerPackage: S3Url
        var LoggingConfig: LoggingConfig?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleArn: RoleArn?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: RequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RegisterTypeOutput {
        var RegistrationToken: RegistrationToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceChange {
        var Action: String /* "Add" | "Modify" | "Remove" | "Import" | String */
        var LogicalResourceId: LogicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var PhysicalResourceId: PhysicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var Replacement: String /* "True" | "False" | "Conditional" | String */
        var Scope: Scope?
            get() = definedExternally
            set(value) = definedExternally
        var Details: ResourceChangeDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceChangeDetail {
        var Target: ResourceTargetDefinition?
            get() = definedExternally
            set(value) = definedExternally
        var Evaluation: String /* "Static" | "Dynamic" | String */
        var ChangeSource: String /* "ResourceReference" | "ParameterReference" | "ResourceAttribute" | "DirectModification" | "Automatic" | String */
        var CausingEntity: CausingEntity?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceIdentifierProperties {
        @nativeGetter
        operator fun get(key: String): ResourceIdentifierPropertyValue?
        @nativeSetter
        operator fun set(key: String, value: ResourceIdentifierPropertyValue)
    }
    interface ResourceIdentifierSummary {
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var LogicalResourceIds: LogicalResourceIds?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceIdentifiers: ResourceIdentifiers?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ResourceTargetDefinition {
        var Attribute: String /* "Properties" | "Metadata" | "CreationPolicy" | "UpdatePolicy" | "DeletionPolicy" | "Tags" | String */
        var Name: PropertyName?
            get() = definedExternally
            set(value) = definedExternally
        var RequiresRecreation: String /* "Never" | "Conditionally" | "Always" | String */
    }
    interface ResourceToImport {
        var ResourceType: ResourceType
        var LogicalResourceId: LogicalResourceId
        var ResourceIdentifier: ResourceIdentifierProperties
    }
    interface RollbackConfiguration {
        var RollbackTriggers: RollbackTriggers?
            get() = definedExternally
            set(value) = definedExternally
        var MonitoringTimeInMinutes: MonitoringTimeInMinutes?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface RollbackTrigger {
        var Arn: Arn
        var Type: Type
    }
    interface SetStackPolicyInput {
        var StackName: StackName
        var StackPolicyBody: StackPolicyBody?
            get() = definedExternally
            set(value) = definedExternally
        var StackPolicyURL: StackPolicyURL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetTypeDefaultVersionInput {
        var Arn: PrivateTypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var Type: String /* "RESOURCE" | String */
        var TypeName: TypeName?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: TypeVersionId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface SetTypeDefaultVersionOutput
    interface SignalResourceInput {
        var StackName: StackNameOrId
        var LogicalResourceId: LogicalResourceId
        var UniqueId: ResourceSignalUniqueId
        var Status: String /* "SUCCESS" | "FAILURE" | String */
    }
    interface Stack {
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var StackName: StackName
        var ChangeSetId: ChangeSetId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime
        var DeletionTime: DeletionTime?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdatedTime: LastUpdatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var RollbackConfiguration: RollbackConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var StackStatus: String /* "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "ROLLBACK_IN_PROGRESS" | "ROLLBACK_FAILED" | "ROLLBACK_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "UPDATE_IN_PROGRESS" | "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" | "UPDATE_COMPLETE" | "UPDATE_ROLLBACK_IN_PROGRESS" | "UPDATE_ROLLBACK_FAILED" | "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" | "UPDATE_ROLLBACK_COMPLETE" | "REVIEW_IN_PROGRESS" | "IMPORT_IN_PROGRESS" | "IMPORT_COMPLETE" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE" | String */
        var StackStatusReason: StackStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var DisableRollback: DisableRollback?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationARNs: NotificationARNs?
            get() = definedExternally
            set(value) = definedExternally
        var TimeoutInMinutes: TimeoutMinutes?
            get() = definedExternally
            set(value) = definedExternally
        var Capabilities: Capabilities?
            get() = definedExternally
            set(value) = definedExternally
        var Outputs: Outputs?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var EnableTerminationProtection: EnableTerminationProtection?
            get() = definedExternally
            set(value) = definedExternally
        var ParentId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var RootId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var DriftInformation: StackDriftInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackDriftInformation {
        var StackDriftStatus: String /* "DRIFTED" | "IN_SYNC" | "UNKNOWN" | "NOT_CHECKED" | String */
        var LastCheckTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackDriftInformationSummary {
        var StackDriftStatus: String /* "DRIFTED" | "IN_SYNC" | "UNKNOWN" | "NOT_CHECKED" | String */
        var LastCheckTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackEvent {
        var StackId: StackId
        var EventId: EventId
        var StackName: StackName
        var LogicalResourceId: LogicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var PhysicalResourceId: PhysicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType?
            get() = definedExternally
            set(value) = definedExternally
        var Timestamp: Timestamp
        var ResourceStatus: String /* "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "DELETE_SKIPPED" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | "UPDATE_COMPLETE" | "IMPORT_FAILED" | "IMPORT_COMPLETE" | "IMPORT_IN_PROGRESS" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE" | String */
        var ResourceStatusReason: ResourceStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceProperties: ResourceProperties?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackInstance {
        var StackSetId: StackSetId?
            get() = definedExternally
            set(value) = definedExternally
        var Region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var Account: Account?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var ParameterOverrides: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CURRENT" | "OUTDATED" | "INOPERABLE" | String */
        var StatusReason: Reason?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationalUnitId: OrganizationalUnitId?
            get() = definedExternally
            set(value) = definedExternally
        var DriftStatus: String /* "DRIFTED" | "IN_SYNC" | "UNKNOWN" | "NOT_CHECKED" | String */
        var LastDriftCheckTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackInstanceSummary {
        var StackSetId: StackSetId?
            get() = definedExternally
            set(value) = definedExternally
        var Region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var Account: Account?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "CURRENT" | "OUTDATED" | "INOPERABLE" | String */
        var StatusReason: Reason?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationalUnitId: OrganizationalUnitId?
            get() = definedExternally
            set(value) = definedExternally
        var DriftStatus: String /* "DRIFTED" | "IN_SYNC" | "UNKNOWN" | "NOT_CHECKED" | String */
        var LastDriftCheckTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackResource {
        var StackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var LogicalResourceId: LogicalResourceId
        var PhysicalResourceId: PhysicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType
        var Timestamp: Timestamp
        var ResourceStatus: String /* "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "DELETE_SKIPPED" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | "UPDATE_COMPLETE" | "IMPORT_FAILED" | "IMPORT_COMPLETE" | "IMPORT_IN_PROGRESS" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE" | String */
        var ResourceStatusReason: ResourceStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var DriftInformation: StackResourceDriftInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackResourceDetail {
        var StackName: StackName?
            get() = definedExternally
            set(value) = definedExternally
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var LogicalResourceId: LogicalResourceId
        var PhysicalResourceId: PhysicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType
        var LastUpdatedTimestamp: Timestamp
        var ResourceStatus: String /* "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "DELETE_SKIPPED" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | "UPDATE_COMPLETE" | "IMPORT_FAILED" | "IMPORT_COMPLETE" | "IMPORT_IN_PROGRESS" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE" | String */
        var ResourceStatusReason: ResourceStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Metadata: Metadata?
            get() = definedExternally
            set(value) = definedExternally
        var DriftInformation: StackResourceDriftInformation?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackResourceDrift {
        var StackId: StackId
        var LogicalResourceId: LogicalResourceId
        var PhysicalResourceId: PhysicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var PhysicalResourceIdContext: PhysicalResourceIdContext?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType
        var ExpectedProperties: Properties?
            get() = definedExternally
            set(value) = definedExternally
        var ActualProperties: Properties?
            get() = definedExternally
            set(value) = definedExternally
        var PropertyDifferences: PropertyDifferences?
            get() = definedExternally
            set(value) = definedExternally
        var StackResourceDriftStatus: String /* "IN_SYNC" | "MODIFIED" | "DELETED" | "NOT_CHECKED" | String */
        var Timestamp: Timestamp
    }
    interface StackResourceDriftInformation {
        var StackResourceDriftStatus: String /* "IN_SYNC" | "MODIFIED" | "DELETED" | "NOT_CHECKED" | String */
        var LastCheckTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackResourceDriftInformationSummary {
        var StackResourceDriftStatus: String /* "IN_SYNC" | "MODIFIED" | "DELETED" | "NOT_CHECKED" | String */
        var LastCheckTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackResourceSummary {
        var LogicalResourceId: LogicalResourceId
        var PhysicalResourceId: PhysicalResourceId?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceType: ResourceType
        var LastUpdatedTimestamp: Timestamp
        var ResourceStatus: String /* "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "DELETE_SKIPPED" | "UPDATE_IN_PROGRESS" | "UPDATE_FAILED" | "UPDATE_COMPLETE" | "IMPORT_FAILED" | "IMPORT_COMPLETE" | "IMPORT_IN_PROGRESS" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE" | String */
        var ResourceStatusReason: ResourceStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var DriftInformation: StackResourceDriftInformationSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackSet {
        var StackSetName: StackSetName?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetId: StackSetId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "DELETED" | String */
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var Capabilities: Capabilities?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetARN: StackSetARN?
            get() = definedExternally
            set(value) = definedExternally
        var AdministrationRoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleName: ExecutionRoleName?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetDriftDetectionDetails: StackSetDriftDetectionDetails?
            get() = definedExternally
            set(value) = definedExternally
        var AutoDeployment: AutoDeployment?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionModel: String /* "SERVICE_MANAGED" | "SELF_MANAGED" | String */
        var OrganizationalUnitIds: OrganizationalUnitIdList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackSetDriftDetectionDetails {
        var DriftStatus: String /* "DRIFTED" | "IN_SYNC" | "NOT_CHECKED" | String */
        var DriftDetectionStatus: String /* "COMPLETED" | "FAILED" | "PARTIAL_SUCCESS" | "IN_PROGRESS" | "STOPPED" | String */
        var LastDriftCheckTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var TotalStackInstancesCount: TotalStackInstancesCount?
            get() = definedExternally
            set(value) = definedExternally
        var DriftedStackInstancesCount: DriftedStackInstancesCount?
            get() = definedExternally
            set(value) = definedExternally
        var InSyncStackInstancesCount: InSyncStackInstancesCount?
            get() = definedExternally
            set(value) = definedExternally
        var InProgressStackInstancesCount: InProgressStackInstancesCount?
            get() = definedExternally
            set(value) = definedExternally
        var FailedStackInstancesCount: FailedStackInstancesCount?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackSetOperation {
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetId: StackSetId?
            get() = definedExternally
            set(value) = definedExternally
        var Action: String /* "CREATE" | "UPDATE" | "DELETE" | "DETECT_DRIFT" | String */
        var Status: String /* "RUNNING" | "SUCCEEDED" | "FAILED" | "STOPPING" | "STOPPED" | "QUEUED" | String */
        var OperationPreferences: StackSetOperationPreferences?
            get() = definedExternally
            set(value) = definedExternally
        var RetainStacks: RetainStacksNullable?
            get() = definedExternally
            set(value) = definedExternally
        var AdministrationRoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleName: ExecutionRoleName?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentTargets: DeploymentTargets?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetDriftDetectionDetails: StackSetDriftDetectionDetails?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackSetOperationPreferences {
        var RegionOrder: RegionList?
            get() = definedExternally
            set(value) = definedExternally
        var FailureToleranceCount: FailureToleranceCount?
            get() = definedExternally
            set(value) = definedExternally
        var FailureTolerancePercentage: FailureTolerancePercentage?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrentCount: MaxConcurrentCount?
            get() = definedExternally
            set(value) = definedExternally
        var MaxConcurrentPercentage: MaxConcurrentPercentage?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackSetOperationResultSummary {
        var Account: Account?
            get() = definedExternally
            set(value) = definedExternally
        var Region: Region?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "PENDING" | "RUNNING" | "SUCCEEDED" | "FAILED" | "CANCELLED" | String */
        var StatusReason: Reason?
            get() = definedExternally
            set(value) = definedExternally
        var AccountGateResult: AccountGateResult?
            get() = definedExternally
            set(value) = definedExternally
        var OrganizationalUnitId: OrganizationalUnitId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackSetOperationSummary {
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var Action: String /* "CREATE" | "UPDATE" | "DELETE" | "DETECT_DRIFT" | String */
        var Status: String /* "RUNNING" | "SUCCEEDED" | "FAILED" | "STOPPING" | "STOPPED" | "QUEUED" | String */
        var CreationTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var EndTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackSetSummary {
        var StackSetName: StackSetName?
            get() = definedExternally
            set(value) = definedExternally
        var StackSetId: StackSetId?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Status: String /* "ACTIVE" | "DELETED" | String */
        var AutoDeployment: AutoDeployment?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionModel: String /* "SERVICE_MANAGED" | "SELF_MANAGED" | String */
        var DriftStatus: String /* "DRIFTED" | "IN_SYNC" | "UNKNOWN" | "NOT_CHECKED" | String */
        var LastDriftCheckTimestamp: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StackSummary {
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var StackName: StackName
        var TemplateDescription: TemplateDescription?
            get() = definedExternally
            set(value) = definedExternally
        var CreationTime: CreationTime
        var LastUpdatedTime: LastUpdatedTime?
            get() = definedExternally
            set(value) = definedExternally
        var DeletionTime: DeletionTime?
            get() = definedExternally
            set(value) = definedExternally
        var StackStatus: String /* "CREATE_IN_PROGRESS" | "CREATE_FAILED" | "CREATE_COMPLETE" | "ROLLBACK_IN_PROGRESS" | "ROLLBACK_FAILED" | "ROLLBACK_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_FAILED" | "DELETE_COMPLETE" | "UPDATE_IN_PROGRESS" | "UPDATE_COMPLETE_CLEANUP_IN_PROGRESS" | "UPDATE_COMPLETE" | "UPDATE_ROLLBACK_IN_PROGRESS" | "UPDATE_ROLLBACK_FAILED" | "UPDATE_ROLLBACK_COMPLETE_CLEANUP_IN_PROGRESS" | "UPDATE_ROLLBACK_COMPLETE" | "REVIEW_IN_PROGRESS" | "IMPORT_IN_PROGRESS" | "IMPORT_COMPLETE" | "IMPORT_ROLLBACK_IN_PROGRESS" | "IMPORT_ROLLBACK_FAILED" | "IMPORT_ROLLBACK_COMPLETE" | String */
        var StackStatusReason: StackStatusReason?
            get() = definedExternally
            set(value) = definedExternally
        var ParentId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var RootId: StackId?
            get() = definedExternally
            set(value) = definedExternally
        var DriftInformation: StackDriftInformationSummary?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface StopStackSetOperationInput {
        var StackSetName: StackSetName
        var OperationId: ClientRequestToken
    }
    interface StopStackSetOperationOutput
    interface Tag {
        var Key: TagKey
        var Value: TagValue
    }
    interface TemplateParameter {
        var ParameterKey: ParameterKey?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultValue: ParameterValue?
            get() = definedExternally
            set(value) = definedExternally
        var NoEcho: NoEcho?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TypeSummary {
        var Type: String /* "RESOURCE" | String */
        var TypeName: TypeName?
            get() = definedExternally
            set(value) = definedExternally
        var DefaultVersionId: TypeVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var TypeArn: TypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var LastUpdated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface TypeVersionSummary {
        var Type: String /* "RESOURCE" | String */
        var TypeName: TypeName?
            get() = definedExternally
            set(value) = definedExternally
        var VersionId: TypeVersionId?
            get() = definedExternally
            set(value) = definedExternally
        var Arn: TypeArn?
            get() = definedExternally
            set(value) = definedExternally
        var TimeCreated: Timestamp?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStackInput {
        var StackName: StackName
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateURL: TemplateURL?
            get() = definedExternally
            set(value) = definedExternally
        var UsePreviousTemplate: UsePreviousTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var StackPolicyDuringUpdateBody: StackPolicyDuringUpdateBody?
            get() = definedExternally
            set(value) = definedExternally
        var StackPolicyDuringUpdateURL: StackPolicyDuringUpdateURL?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var Capabilities: Capabilities?
            get() = definedExternally
            set(value) = definedExternally
        var ResourceTypes: ResourceTypes?
            get() = definedExternally
            set(value) = definedExternally
        var RoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var RollbackConfiguration: RollbackConfiguration?
            get() = definedExternally
            set(value) = definedExternally
        var StackPolicyBody: StackPolicyBody?
            get() = definedExternally
            set(value) = definedExternally
        var StackPolicyURL: StackPolicyURL?
            get() = definedExternally
            set(value) = definedExternally
        var NotificationARNs: NotificationARNs?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var ClientRequestToken: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStackInstancesInput {
        var StackSetName: StackSetNameOrId
        var Accounts: AccountList?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentTargets: DeploymentTargets?
            get() = definedExternally
            set(value) = definedExternally
        var Regions: RegionList
        var ParameterOverrides: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var OperationPreferences: StackSetOperationPreferences?
            get() = definedExternally
            set(value) = definedExternally
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStackInstancesOutput {
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStackOutput {
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStackSetInput {
        var StackSetName: StackSetName
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateURL: TemplateURL?
            get() = definedExternally
            set(value) = definedExternally
        var UsePreviousTemplate: UsePreviousTemplate?
            get() = definedExternally
            set(value) = definedExternally
        var Parameters: Parameters?
            get() = definedExternally
            set(value) = definedExternally
        var Capabilities: Capabilities?
            get() = definedExternally
            set(value) = definedExternally
        var Tags: Tags?
            get() = definedExternally
            set(value) = definedExternally
        var OperationPreferences: StackSetOperationPreferences?
            get() = definedExternally
            set(value) = definedExternally
        var AdministrationRoleARN: RoleARN?
            get() = definedExternally
            set(value) = definedExternally
        var ExecutionRoleName: ExecutionRoleName?
            get() = definedExternally
            set(value) = definedExternally
        var DeploymentTargets: DeploymentTargets?
            get() = definedExternally
            set(value) = definedExternally
        var PermissionModel: String /* "SERVICE_MANAGED" | "SELF_MANAGED" | String */
        var AutoDeployment: AutoDeployment?
            get() = definedExternally
            set(value) = definedExternally
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
        var Accounts: AccountList?
            get() = definedExternally
            set(value) = definedExternally
        var Regions: RegionList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateStackSetOutput {
        var OperationId: ClientRequestToken?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface UpdateTerminationProtectionInput {
        var EnableTerminationProtection: EnableTerminationProtection
        var StackName: StackNameOrId
    }
    interface UpdateTerminationProtectionOutput {
        var StackId: StackId?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidateTemplateInput {
        var TemplateBody: TemplateBody?
            get() = definedExternally
            set(value) = definedExternally
        var TemplateURL: TemplateURL?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ValidateTemplateOutput {
        var Parameters: TemplateParameters?
            get() = definedExternally
            set(value) = definedExternally
        var Description: Description?
            get() = definedExternally
            set(value) = definedExternally
        var Capabilities: Capabilities?
            get() = definedExternally
            set(value) = definedExternally
        var CapabilitiesReason: CapabilitiesReason?
            get() = definedExternally
            set(value) = definedExternally
        var DeclaredTransforms: TransformsList?
            get() = definedExternally
            set(value) = definedExternally
    }
    interface ClientApiVersions {
        var apiVersion: String /* "2010-05-15" | "latest" | String */
    }
}